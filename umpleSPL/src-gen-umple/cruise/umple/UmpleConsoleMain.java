/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple;
import cruise.umple.compiler.*;
import cruise.umple.compiler.exceptions.*;
import java.util.*;
import joptsimple.*;
import java.io.*;
import java.text.DecimalFormat;

/**
 * Main program for the command line Umple compiler
 * Run java -jar umple.jar --help for details 
 * Takes an umple file as an argument, which can in turn use (include) other
 */
// line 201 "../../../src/Main_Code.ump"
public class UmpleConsoleMain
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleConsoleMain Attributes
  private UmpleConsoleConfig cfg;
  private double startTime;
  private double endTime;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleConsoleMain(UmpleConsoleConfig aCfg)
  {
    cfg = aCfg;
    startTime = 0.0;
    endTime = 0.0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCfg(UmpleConsoleConfig aCfg)
  {
    boolean wasSet = false;
    cfg = aCfg;
    wasSet = true;
    return wasSet;
  }

  public boolean setStartTime(double aStartTime)
  {
    boolean wasSet = false;
    startTime = aStartTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setEndTime(double aEndTime)
  {
    boolean wasSet = false;
    endTime = aEndTime;
    wasSet = true;
    return wasSet;
  }

  public UmpleConsoleConfig getCfg()
  {
    return cfg;
  }

  /**
   * startTime repersents model run start time while endTime represents end time
   */
  public double getStartTime()
  {
    return startTime;
  }

  public double getEndTime()
  {
    return endTime;
  }

  public void delete()
  {}


  /**
   * 
   * Create a main console. If the args are invalid, an IllegalStateException is thrown. 
   * @throws IllegalStateException If invalid arguments are passed and joptsimple fails to parse.
   */
  // line 223 "../../../src/Main_Code.ump"
  public  UmpleConsoleMain(String [] args){
    optparser = initializeOptionParser();

    OptionSet optset = optParse(args);
    if (optset == null) {
      throw new IllegalStateException("Illegal arguments were passed, check usage.");
    }
    
    this.cfg = new UmpleConsoleConfig(optset);
  }

  // line 234 "../../../src/Main_Code.ump"
   public int runConsole(){
    // Check for options like help, version and import that don't compile arguments 
    if (preModelOptionProcess())
    {
      return 0;
    }

    String filename = "dummy__.ump"; // used when we may not want to read any file
    if (cfg.getUmpleFile() == null || "".equals(cfg.getUmpleFile()))
    {
      // We have no filename
      if(!cfg.getTestUmpFilesFile().isPresent() && !cfg.getUmpleDirect().isPresent()) {
        System.out.println("Please specify an umple_file to process or use the -f or -u options");
        printUsage();
        return 1;
      }
      else if (!cfg.getUmpleDirect().isPresent()) {
        // Will use -f option for files to process
        return 0;
      }
    }
    else {
      filename = cfg.getUmpleFile();
      if(!cfg.getBeQuiet()) {
        System.out.println("Processing -> " + filename);
      }
    }

    final UmpleFile umpleFile = new UmpleFile(filename);
    //this loop is used to add linked umple files and to show names of them.
    cfg.getLinkedFilesAsFile().stream()
        .filter(File::exists)
        .map(File::getPath)
        .forEach(umpleFile::addLinkedFiles);
    //this loop is used to add mixset names as liked umple files.
    cfg.getLinkedMixsetAsString().stream()
        .forEach(umpleFile::addLinkedFiles);
    
    // This adds any special extra statement as a linked file (not really a file but ...)
    if (cfg.getUmpleDirect().isPresent()) {
      umpleFile.addLinkedFiles("__UMPLE"+
        Base64.getEncoder().encodeToString(cfg.getUmpleDirect().orElse(null).getBytes()));
    }
       
    final UmpleModel model = new UmpleModel(umpleFile);

    // Process generators into the model
    if (postModelOptionProcess(model)) {
      // Currently the above always returns false
      return 0;
    }

    try {
      try {
        startTime = System.currentTimeMillis()/1000.0;  
        model.run();
        endTime = System.currentTimeMillis()/1000.0;  

      } catch (UmpleCompilerException e) {
        System.err.print(e.getMessage());
        if (!model.isShouldGenerate())
        {
          return -1;
        }
      }

      // Compile success means the output was generated
      boolean compileSuccess = model.getLastResult().getWasSuccess();

      // The "c" option causes an attempt to compile the resulting base language
      // code.
      if (compileSuccess && cfg.getCompile().isPresent())
      {
        if(model.isSkipcompile()) {
          if(!cfg.getBeQuiet()) {
            System.out.println("Skipping compilation of generated code due to @@@skipcompile in a comment.");
          }
        }
        else {
          for (GenerateTarget gt : model.getGenerates()) {
            String generatorCodeToCompile = gt.getLanguage();
          
            if(generatorCodeToCompile.equals("Java") && model.isSkipjavacompile()) {
              if(!cfg.getBeQuiet()) {
                System.out.println("Skipping compilation of Java due to @@@skipjavacompile in a comment.");
              }
              continue;
            }

            if(generatorCodeToCompile.equals("Php") && model.isSkipphpcompile()) {
              if(!cfg.getBeQuiet()) {
                System.out.println("Skipping compilation of Php due to @@@skipphpcompile in a comment.");
              }
              continue;
            }
          
            if (generatorCodeToCompile.equals("Java") || generatorCodeToCompile.equals("Php")) {
              compileSuccess = CodeCompiler.compile(model, generatorCodeToCompile,cfg.getUseExec(), cfg.getBeQuiet(), cfg.getCompile().get());
            }
          }
        }
      }
      
       // Get the performance execution.
       // Print out performance test result.     
        if(cfg.getPerformance())
         {
        
           DecimalFormat df=new DecimalFormat("0.000");
        
           System.out.println("Performance Metrics:");
           System.out.println("--> Total Execution Time: " + df.format((endTime -startTime)) +" s");
           System.out.println("--> Parsing Time: " + df.format((model.getParsingTime() -startTime))+" s");
           for (String key : model. getHashMap().keySet()) 
           {
             Double generateTime = Double.parseDouble(model. getHashMap().get(key));
             
             System.out.println("--> Generating Target Language " + key + " time: "+df.format(generateTime)+" s");
           }                           
         }

      String successWord = compileSuccess ? "Success! " : "";
      
      // if failed but we are being quiet, we have to inform what we failed on
      if(!compileSuccess && cfg.getBeQuiet()) {
        System.out.println("Was attempting to process "+filename);
      }
      
      if(compileSuccess && !cfg.getBeQuiet()) {
        for (String key : model. getHashMap().keySet()) {
          System.out.println("  Compiled to target language "+key);
          if(key.compareTo("Java")==0) {
            for (UmpleClass mainClass: CodeCompiler.getMainClasses(model)) {
              System.out.println("  Main method found. Run Java "+mainClass.getName());
            }
          }
        }
      }  
      
      // Output Processed either if not successful or not asking to be quiet
      if(!compileSuccess || !cfg.getBeQuiet()) {
        System.out.println(successWord + "Processed "+ cfg.getUmpleFile() + ".");
        cfg.getLinkedFilesAsFile().stream()
          .filter(File::exists)
          .forEach(f -> System.out.println(successWord + "Processed "+ f.getPath() + "."));
      }
      
      return (compileSuccess ? 0 : 1); 
    }
    catch(Exception ex)
    {
      System.err.println("Umple compiler error. Stack trace follows");
      cruise.umple.util.ExceptionDumper.dumpCompilerError(ex);
      return -1;
    }
  }

  // line 392 "../../../src/Main_Code.ump"
   public static  void main(String [] args){
    Thread.currentThread().setUncaughtExceptionHandler(new cruise.umple.docs.DocumenterMain.UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new cruise.umple.docs.DocumenterMain.UmpleExceptionHandler());
    UmpleConsoleMain console = null;
    try {
      console = new UmpleConsoleMain(args);
    }
    catch (Exception e) {   
     System.err.println(e.getMessage());
     return;
    }

    // Run the compilation for the main command line files and mixsets
    // Result is 1 if failed compile, -1 if compiler crashed
    int result = console.runConsole();
    if (result != 0) {
      System.exit(result);
    }
    
    // If there are any files and mixsets specified by the -f option, then try those
    UmpleConsoleConfig cfg = console.getCfg();
    if(cfg.getAllLinesOfFilesToTest() != null) {
      int finalResult = 0;
      String failedLines ="";
      int successCases = 0;
      for(String[] fileList : cfg.getAllLinesOfFilesToTest()) {
        // Change the configuration to have the new lines
        if(fileList == null || fileList.length == 0) {
          System.out.println("One of the lines in the file specified by -f is empty. Should be a list of files or mixsets");
        }
        else {
          cfg.setUmpleFile(fileList[0]);
          cfg.setLinkedFiles(fileList.length > 1 ? (Arrays.asList(fileList)).subList(1, fileList.length) : Collections.<String>emptyList());
          result = console.runConsole();
          if (result != 0) {
            if (cfg.getExitOnFirstFailure()) {
              System.exit(result);
            }
            else {
              finalResult = result;
              for (String aFileInList : fileList) {
                failedLines += " "+aFileInList;
              }
              failedLines +="\n";
            }
          }
          else successCases++;     
        }
      }
      System.out.println("Number of successful compilations from umple -f option: "+successCases);
      if(finalResult != 0) {
        System.out.print("See the above log for the following Umple Java generation and compilation cases which failed:\n"+failedLines);
        System.exit (finalResult);
      }
    }
  }

  // line 448 "../../../src/Main_Code.ump"
   private void generateUmple(String filename){
    boolean isSuccess = false;
    try
    {
      UmpleImportModel umple;
      if (filename.endsWith(".scxml")) {
        ScxmlImportHandler handler = new ScxmlImportHandler();
        umple = handler.readDataFromXML(filename);
      } else {
        EcoreImportHandler handler = new EcoreImportHandler();
        umple = handler.readDataFromXML(filename);
      }
      isSuccess = umple.generateUmpleFile(filename + ".ump");
    }
    catch (Exception e)
    {
      System.err.print(e.getMessage());
    } 
    if (isSuccess)
    {
      System.out.println("Success! Processed "+ filename + ".");
    }
    else
    {
      System.err.print("No file generated, parsing error.");
    }
  }


  /**
   * 
   * optionProcess: process the option arguments which does not require UmpleModel
   * Argument: optSet - set of the options and corresponding arguments
   * Return: boolean - If application should terminate immediately after return
   */
  // line 482 "../../../src/Main_Code.ump"
   private boolean preModelOptionProcess(){
    if (cfg.getVersion())
    {
      System.out.println("Version: " + UmpleModel.VERSION_NUMBER);
    }
    else if (cfg.getHelp())
    {
      printUsage();
    }
    else if (cfg.getImportFile().isPresent())
    {
      generateUmple(cfg.getImportFile().get());
    }
    else
    {
      return false;
    }
    return true;
  }

  // line 502 "../../../src/Main_Code.ump"
   private boolean postModelOptionProcess(UmpleModel model){
    if (cfg.getGenerate().isPresent()) {
      String path = cfg.getPath().orElse("");
      boolean override = cfg.getOverride();
      String lang = cfg.getGenerate().orElse(null);

      GenerateTarget gt = new GenerateTarget(lang, path);
      gt.setOverrideAll(override);
      
      cfg.getSuboptions().stream().forEach(gt::addSuboption); 

      model.addGenerate(Arrays.asList(gt));
      
      // If we have requested it, get rid of previously generated files in path matching this generator
      if(cfg.getRemovePrevious()) {
        String startPath = path;
        if (path.equals("")) {startPath = ".";}
        deletePreviouslyGenerated(startPath, "."+lang.toLowerCase());
        
        // If java we also delete class files
        if(lang.equals("Java")) {
          deletePreviouslyGenerated(startPath, ".class");
        }
      }
    }
    
    return false;
  }


  /**
   * Recursively delete files ending in suffix; used to clean up before new generation
   */
  // line 532 "../../../src/Main_Code.ump"
   private void deletePreviouslyGenerated(String startPath, String suffix){
    File folder = new File(startPath);
    for (File file : folder.listFiles()) {
      if (file.getName().endsWith(suffix)) {
        file.delete();
      }
      else if(file.isDirectory()) {
        deletePreviouslyGenerated(startPath+File.separator+file.getName(),suffix);
      }
    }
  }

  // line 545 "../../../src/Main_Code.ump"
   private static  OptionParser initializeOptionParser(){
    OptionParser optparser = new OptionParser();
    
    String languages = String.join(",", UmpleModel.validLanguages );
    String suboptionsAvail = "(With GvStateDiagram: hideactions, hideguards, showtransitionlabels, showguardlabels, Java, Cpp) ";
    suboptionsAvail += "(With GvClassDiagram or GvClassTraitDiagram or GvEntityRelationshipDiagram: hideattributes, showmethods)";

    optparser.acceptsAll(Arrays.asList("version", "v"), "Print out the current Umple version number");
    optparser.acceptsAll(Arrays.asList("performance", "p"), "Indicate time taken to parse and generate code");
    optparser.acceptsAll(Arrays.asList("help"), "Display the help message");

    optparser.acceptsAll(Arrays.asList("g", "generate"), "Specify the output language: " + languages).withRequiredArg().ofType(String.class);
    optparser.acceptsAll(Arrays.asList("u", "umple"), "Include umple code directly as a single string, instead of or addition to in files.").withRequiredArg().ofType(String.class);
    
    optparser.acceptsAll(Arrays.asList("override"), "If a output language <lang> is specified using option -g, output will only generate language <lang>");
    optparser.acceptsAll(Arrays.asList("removeprevious", "r"), "used with -g; remove previously generated code before generating new. Can help prevent leftover code causing errors. Does not work with generators specified inside a file.");
    optparser.acceptsAll(Arrays.asList("path"), "If a output language is specified using option -g, output source code will be placed to path").withRequiredArg().ofType(String.class);
    optparser.acceptsAll(Arrays.asList("c","compile"), "Indicate to the entry class to compile, or with argument - to compile all outputfiles").withRequiredArg().ofType(String.class);
    optparser.acceptsAll(Arrays.asList("f","file"), "Read in a file containing sets of umple-files to process, one set per line. Each is an independent compilation. Intended for testing.").withRequiredArg().ofType(String.class);
    optparser.acceptsAll(Arrays.asList("e","exitonfirstfailure"), "Used with -f. Exit with nonzero on first failure of a compile specified in the file passed to -f. Otherwise exits after completing all compilations with nonzero if any failed.");    
    optparser.acceptsAll(Arrays.asList("q","quiet"), "Be quiet. Only output compilation information in case of failure");
    optparser.acceptsAll(Arrays.asList("w","warningignore"), "Ignore a warning whose number is embedded in the file name if the file name starts with W. Used for testing.");
    optparser.acceptsAll(Arrays.asList("x","useexec"), "Use an external exec call to invoke the Java compiler when using the -c option. May be needed on some platforms or with certain examples.");    
    optparser.acceptsAll(Arrays.asList("import","i"), "Indicate to read in XMI model and generate ump files").withRequiredArg().ofType(String. class);
    optparser.acceptsAll(Arrays.asList("suboption","s"), "Indicate to generate files with suboptions "+suboptionsAvail).withRequiredArg().ofType(String.class);
    
    return optparser;
  }

  // line 575 "../../../src/Main_Code.ump"
   private static  void printUsage(){
    System.out.println("For more detailed information go to https://manual.umple.org"+System.lineSeparator()
      +"Usage: java -jar umple.jar [options] <umple_files>"+System.lineSeparator()
      +"Example: java -jar umple.jar airline.ump");
    try
    {
      optparser.printHelpOn(System.out);
    } 
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  // line 590 "../../../src/Main_Code.ump"
   static  OptionSet optParse(String [] args){
    OptionSet optSet = null;

    try
    {
      optSet = optparser.parse(args);
    } 
    catch (joptsimple.OptionException e)
    {
      System.out.println("Option:" + e.getMessage());
      printUsage();
    }

    return optSet;
  }


  public String toString()
  {
    return super.toString() + "["+
            "startTime" + ":" + getStartTime()+ "," +
            "endTime" + ":" + getEndTime()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "cfg" + "=" + (getCfg() != null ? !getCfg().equals(this)  ? getCfg().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 212 "../../../src/Main_Code.ump"
  static OptionParser optparser = initializeOptionParser() ;

  
}