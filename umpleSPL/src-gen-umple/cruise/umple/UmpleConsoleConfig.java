/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple;
import java.util.*;
import java.util.stream.*;
import joptsimple.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.*;

/**
 * 
 * Config is the parsed command line information for UmpleConsole.
 */
// line 17 "../../../src/Main_Code.ump"
public class UmpleConsoleConfig
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleConsoleConfig Attributes
  private boolean version;
  private boolean help;
  private boolean performance;
  private boolean beQuiet;
  private boolean warningIgnore;
  private boolean useExec;
  private boolean exitOnFirstFailure;

  /**
   * option g to specify what to generate
   */
  private Optional<String> generate;

  /**
   * option u to specify umple code directly
   */
  private Optional<String> umpleDirect;
  private boolean override;
  private boolean removePrevious;

  /**
   * place to put output, otherwise in current directory
   */
  private Optional<String> path;

  /**
   * option c to specify that compilation should happen
   */
  private Optional<String> compile;

  /**
   * option i to only import an xmi
   */
  private Optional<String> importFile;

  /**
   * option f file with sets of files to process
   */
  private Optional<String> testUmpFilesFile;
  private List<String[]> allLinesOfFilesToTest;
  private List<String> suboptions;
  private String umpleFile;
  private List<String> linkedFiles;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleConsoleConfig(String aUmpleFile)
  {
    resetVersion();
    resetHelp();
    resetPerformance();
    resetBeQuiet();
    resetWarningIgnore();
    resetUseExec();
    resetExitOnFirstFailure();
    generate = Optional.empty();
    umpleDirect = Optional.empty();
    resetOverride();
    resetRemovePrevious();
    path = Optional.empty();
    compile = Optional.empty();
    importFile = Optional.empty();
    testUmpFilesFile = Optional.empty();
    allLinesOfFilesToTest = null;
    suboptions = Collections.<String>emptyList();
    umpleFile = aUmpleFile;
    linkedFiles = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetDefaulted */
  public boolean setVersion(boolean aVersion)
  {
    boolean wasSet = false;
    version = aVersion;
    wasSet = true;
    return wasSet;
  }

  public boolean resetVersion()
  {
    boolean wasReset = false;
    version = getDefaultVersion();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setHelp(boolean aHelp)
  {
    boolean wasSet = false;
    help = aHelp;
    wasSet = true;
    return wasSet;
  }

  public boolean resetHelp()
  {
    boolean wasReset = false;
    help = getDefaultHelp();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setPerformance(boolean aPerformance)
  {
    boolean wasSet = false;
    performance = aPerformance;
    wasSet = true;
    return wasSet;
  }

  public boolean resetPerformance()
  {
    boolean wasReset = false;
    performance = getDefaultPerformance();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setBeQuiet(boolean aBeQuiet)
  {
    boolean wasSet = false;
    beQuiet = aBeQuiet;
    wasSet = true;
    return wasSet;
  }

  public boolean resetBeQuiet()
  {
    boolean wasReset = false;
    beQuiet = getDefaultBeQuiet();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setWarningIgnore(boolean aWarningIgnore)
  {
    boolean wasSet = false;
    warningIgnore = aWarningIgnore;
    wasSet = true;
    return wasSet;
  }

  public boolean resetWarningIgnore()
  {
    boolean wasReset = false;
    warningIgnore = getDefaultWarningIgnore();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setUseExec(boolean aUseExec)
  {
    boolean wasSet = false;
    useExec = aUseExec;
    wasSet = true;
    return wasSet;
  }

  public boolean resetUseExec()
  {
    boolean wasReset = false;
    useExec = getDefaultUseExec();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setExitOnFirstFailure(boolean aExitOnFirstFailure)
  {
    boolean wasSet = false;
    exitOnFirstFailure = aExitOnFirstFailure;
    wasSet = true;
    return wasSet;
  }

  public boolean resetExitOnFirstFailure()
  {
    boolean wasReset = false;
    exitOnFirstFailure = getDefaultExitOnFirstFailure();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setOverride(boolean aOverride)
  {
    boolean wasSet = false;
    override = aOverride;
    wasSet = true;
    return wasSet;
  }

  public boolean resetOverride()
  {
    boolean wasReset = false;
    override = getDefaultOverride();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setRemovePrevious(boolean aRemovePrevious)
  {
    boolean wasSet = false;
    removePrevious = aRemovePrevious;
    wasSet = true;
    return wasSet;
  }

  public boolean resetRemovePrevious()
  {
    boolean wasReset = false;
    removePrevious = getDefaultRemovePrevious();
    wasReset = true;
    return wasReset;
  }

  public boolean setUmpleFile(String aUmpleFile)
  {
    boolean wasSet = false;
    umpleFile = aUmpleFile;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addLinkedFile(String aLinkedFile)
  {
    boolean wasAdded = false;
    wasAdded = linkedFiles.add(aLinkedFile);
    return wasAdded;
  }

  public boolean removeLinkedFile(String aLinkedFile)
  {
    boolean wasRemoved = false;
    wasRemoved = linkedFiles.remove(aLinkedFile);
    return wasRemoved;
  }

  /**
   * See function initializeOptionParser() for the setup of the options
   * option to print version only
   */
  public boolean getVersion()
  {
    return version;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultVersion()
  {
    return false;
  }

  /**
   * option to output help only
   */
  public boolean getHelp()
  {
    return help;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultHelp()
  {
    return false;
  }

  /**
   * option to measure performance
   */
  public boolean getPerformance()
  {
    return performance;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultPerformance()
  {
    return false;
  }

  /**
   * option q to be quiet
   */
  public boolean getBeQuiet()
  {
    return beQuiet;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultBeQuiet()
  {
    return false;
  }

  /**
   * option w to ignore a warning number in filename
   */
  public boolean getWarningIgnore()
  {
    return warningIgnore;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultWarningIgnore()
  {
    return false;
  }

  /**
   * option x to use slower but more reliable exec java compiler
   */
  public boolean getUseExec()
  {
    return useExec;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultUseExec()
  {
    return false;
  }

  /**
   * option e to exit on first failure with the -f option
   */
  public boolean getExitOnFirstFailure()
  {
    return exitOnFirstFailure;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultExitOnFirstFailure()
  {
    return false;
  }

  public boolean getOverride()
  {
    return override;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultOverride()
  {
    return false;
  }

  public boolean getRemovePrevious()
  {
    return removePrevious;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultRemovePrevious()
  {
    return false;
  }

  /**
   * first and maybe only umple file to compile, the main constructor argument
   */
  public String getUmpleFile()
  {
    return umpleFile;
  }
  /* Code from template attribute_GetMany */
  public String getLinkedFile(int index)
  {
    String aLinkedFile = linkedFiles.get(index);
    return aLinkedFile;
  }

  public String[] getLinkedFiles()
  {
    String[] newLinkedFiles = linkedFiles.toArray(new String[linkedFiles.size()]);
    return newLinkedFiles;
  }

  public int numberOfLinkedFiles()
  {
    int number = linkedFiles.size();
    return number;
  }

  public boolean hasLinkedFiles()
  {
    boolean has = linkedFiles.size() > 0;
    return has;
  }

  public int indexOfLinkedFile(String aLinkedFile)
  {
    int index = linkedFiles.indexOf(aLinkedFile);
    return index;
  }

  public void delete()
  {}

  // line 50 "../../../src/Main_Code.ump"
  public  UmpleConsoleConfig(OptionSet optSet){
    // The first nonOptionArgument becomes the main file to process
    this(optSet.nonOptionArguments().size() > 0 ? optSet.nonOptionArguments().get(0) : null);

    this.version    = optSet.has("v");
    this.help       = optSet.has("help");
    this.performance = optSet.has("performance");
    this.useExec    = optSet.has("x");
    this.exitOnFirstFailure = optSet.has("e");
    this.beQuiet    = optSet.has("quiet");    
    this.warningIgnore    = optSet.has("warningignore");    
    this.importFile = Optional.ofNullable((String)optSet.valueOf("import"));
    this.generate   = Optional.ofNullable((String)optSet.valueOf("generate"));
    this.umpleDirect   = Optional.ofNullable((String)optSet.valueOf("umple"));    
    this.override   = optSet.has("override");
    this.removePrevious = optSet.has("removeprevious");
    this.path       = Optional.ofNullable((String)optSet.valueOf("path"));
    this.testUmpFilesFile = Optional.ofNullable((String)optSet.valueOf("file"));
    
    // Other files to process
    final List<String> files = optSet.nonOptionArguments();
    this.linkedFiles = (files.size() > 1 ? files.subList(1, files.size()) : Collections.<String>emptyList());

    this.suboptions = optSet.valuesOf("suboption").stream()
      .map(o -> (String)o)
      .collect(Collectors.toList());

    // compile takes a bit more logic..
    this.compile = Optional.ofNullable((String)optSet.valueOf("c"));
    
    // Open and read any file containing other files to process for testing
    if (testUmpFilesFile.isPresent())
    {
      String fileOfFiles = testUmpFilesFile.get();
      try {
        List<String> allLines = Files.readAllLines(Paths.get(fileOfFiles));
        allLinesOfFilesToTest = new ArrayList<String[]>();
        for(String aLine: allLines) {
          // Split the line based on spaces, but converting those in quotes into code
          List<String> listOfFilesThisLine = new ArrayList<String>();
          Matcher m = Pattern.compile("([^\']\\S*|\'.+?\')\\s*").matcher(aLine);
          while (m.find()) {
            String foundString = m.group(1);
            // foundString is either a file or (if second and subsequent) a single quoted string

            if(foundString.startsWith("\'")) {
              // We have a program -- convert
              foundString="__UMPLE"+
                Base64.getEncoder()
                .encodeToString(foundString.substring(1,foundString.length()-1).getBytes());
            }
            else if(foundString.startsWith("W") && warningIgnore) {
              // Potential to ignore the warning
              Matcher m2 = Pattern.compile("\\d+").matcher(foundString);
              if(m2.find()) {
                String supressWarningCode="strictness ignore "+m2.group()+";";
                listOfFilesThisLine.add(foundString);
                foundString="__UMPLE"+
                  Base64.getEncoder().encodeToString(supressWarningCode.getBytes());
              }
            }
            listOfFilesThisLine.add(foundString);
          }
          //allLinesOfFilesToTest.add(aLine.split(" "));
          allLinesOfFilesToTest
            .add(listOfFilesThisLine.toArray(new String[listOfFilesThisLine.size()]));
        }
      }
      catch  (IOException e) {
        System.out.println("File with files "+fileOfFiles+" from -f option cannot be opened. Ignoring");
      }
    }
  }

  // line 124 "../../../src/Main_Code.ump"
   public void setLinkedFiles(List<String> newLinkedFiles){
    this.linkedFiles=newLinkedFiles;
  }

  // line 128 "../../../src/Main_Code.ump"
   public List<File> getLinkedFilesAsFile(){
    return this.linkedFiles.stream().map(p -> new File(p)).collect(Collectors.toList());
  }


  /**
   * this method returns mixset names that appear as arguments
   */
  // line 133 "../../../src/Main_Code.ump"
   public List<String> getLinkedMixsetAsString(){
    return this.linkedFiles.stream().filter(m-> ! m.endsWith(".ump")).collect(Collectors.toList());
  }

  // line 136 "../../../src/Main_Code.ump"
   public Optional<String> getGenerate(){
    return this.generate;
  }

  // line 140 "../../../src/Main_Code.ump"
   public void setGenerate(String generate){
    this.generate = Optional.of(generate);
  }

  // line 144 "../../../src/Main_Code.ump"
   public Optional<String> getUmpleDirect(){
    return this.umpleDirect;
  }

  // line 148 "../../../src/Main_Code.ump"
   public Optional<String> getCompile(){
    return this.compile;
  }

  // line 152 "../../../src/Main_Code.ump"
   public void setCompile(String compile){
    this.compile = Optional.of(compile);
  }

  // line 156 "../../../src/Main_Code.ump"
   public void setImportFile(String importFile){
    this.importFile = Optional.of(importFile);
  }

  // line 160 "../../../src/Main_Code.ump"
   public Optional<String> getImportFile(){
    return this.importFile;
  }

  // line 164 "../../../src/Main_Code.ump"
   public void setTestUmpFilesFile(String testUmpFilesFile){
    this.testUmpFilesFile = Optional.of(testUmpFilesFile);
  }

  // line 168 "../../../src/Main_Code.ump"
   public Optional<String> getTestUmpFilesFile(){
    return this.testUmpFilesFile;
  }

  // line 172 "../../../src/Main_Code.ump"
   public List<String[]> getAllLinesOfFilesToTest(){
    return this.allLinesOfFilesToTest;
  }

  // line 176 "../../../src/Main_Code.ump"
   public void setPath(String path){
    this.path = Optional.of(path);
  }

  // line 180 "../../../src/Main_Code.ump"
   public Optional<String> getPath(){
    return this.path;
  }

  // line 184 "../../../src/Main_Code.ump"
   public List<String> getSuboptions(){
    return this.suboptions;
  }

  // line 188 "../../../src/Main_Code.ump"
   public void setSuboptions(List<String> suboptions){
    this.suboptions = suboptions;
  }

  // line 192 "../../../src/Main_Code.ump"
   public void addSuboption(String suboption){
    this.suboptions.add(suboption);
  }


  public String toString()
  {
    return super.toString() + "["+
            "version" + ":" + getVersion()+ "," +
            "help" + ":" + getHelp()+ "," +
            "performance" + ":" + getPerformance()+ "," +
            "beQuiet" + ":" + getBeQuiet()+ "," +
            "warningIgnore" + ":" + getWarningIgnore()+ "," +
            "useExec" + ":" + getUseExec()+ "," +
            "exitOnFirstFailure" + ":" + getExitOnFirstFailure()+ "," +
            "override" + ":" + getOverride()+ "," +
            "removePrevious" + ":" + getRemovePrevious()+ "," +
            "umpleFile" + ":" + getUmpleFile()+ "]";
  }
}