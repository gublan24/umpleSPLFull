/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;
import java.io.*;
import cruise.umple.compiler.*;
import cruise.umple.compiler.exceptions.*;
import cruise.umple.util.StringFormatter;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler;

// line 14 "../../../../src/Compiler.ump"
public class CodeCompiler
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CodeCompiler()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * true if compile used more than once to quell messages
   */
  // line 28 "../../../../src/Compiler.ump"
   public static  boolean compile(UmpleModel model, String generator, boolean useExec, boolean beQuiet, String entryClass, String... extraArgs){
    boolean wasSuccessful = true;
    String extra = "";
    for(String arg:extraArgs)
    {
      extra+=arg;
    }
    for (UmpleElement currentElement : model.getUmpleElements())
    {
      if ("external".equals(currentElement.getModifier()))
      {
        continue;
      }
      if (entryClass.equals("-") || entryClass.equals(currentElement.getName())) {
        if(generator.equals("Java")) {
          wasSuccessful = wasSuccessful & compileJava(currentElement, model, useExec, beQuiet, extra);
          subsequentCompilation = true;
        }
        else if (generator.equals("Php")) {
          wasSuccessful = wasSuccessful & compilePhp(currentElement, model, beQuiet, extra);
          subsequentCompilation = true;
        }
        else {
          System.out.println("Compilation of generated code not supported yet for generator "+generator);
        }
      }
    }
    return wasSuccessful;
  }

  // line 58 "../../../../src/Compiler.ump"
   private static  boolean compilePhp(UmpleElement aClass, UmpleModel model, boolean beQuiet, String args){
    String path="";
    String base="";
    for (GenerateTarget gt : model.getGenerates()) {
      if (gt.getLanguage().equals("Php")) {
        base = StringFormatter.addPathOrAbsolute( 
            model.getUmpleFile().getPath() +File.separator+ gt.getPath(), "");
        path = base;
      }
    }
    String filename = path + File.separator + aClass.getName() + ".php";
    int retval=0;

    try {
      if(base.contains(" ") && !(beQuiet && subsequentCompilation)) {
        System.err.println("Warning: Compiling generated Php from a directory or path containing a space character may produce an error message from the PhP compiler.");
      }
      
      BufferedReader reader;
      
      Process p = Runtime.getRuntime().exec("php -l -e " +filename);
      reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 

      // All output of the above should go to standard output
      try {
        retval=p.waitFor(); 
      }
      catch (InterruptedException e) {}

      String line;
      if(reader.ready()) {
        line = reader.readLine();
      }
      else {
        line = null;
      }

      while (line!=null) {
        if(!line.startsWith("No syntax errors detected in")) {
          System.err.println(line);
          retval = 1;
        }

        if(reader.ready()) {
          line = reader.readLine();
        }
        else {
          line = null;
        }
      }
    } catch (IOException e) {
      println(e.getMessage());
      retval = 999;
    }
    return (retval == 0);
  }

  // line 115 "../../../../src/Compiler.ump"
   private static  boolean compileJava(UmpleElement aClass, UmpleModel model, boolean useExec, boolean beQuiet, String args){
    String path="";
    String base="";
    for (GenerateTarget gt : model.getGenerates()) {
      if (gt.getLanguage().equals("Java")) {
        base = StringFormatter.addPathOrAbsolute( 
            model.getUmpleFile().getPath() +File.separator+ gt.getPath(), "");
        path = base + aClass.getPackageName().replace(".", File.separator);
      }
    }
    String filename = path + File.separator + aClass.getName() + ".java";
    boolean successful = true;
    PipedOutputStream out = null;

    try {
      if(base.contains(" ") && !(beQuiet && subsequentCompilation)) {
        System.err.println("Warning: Compiling generated Java from a directory or path containing a space character may produce an error message from the Java compiler.");
      }
      
      BufferedReader reader;
      
      // Method 1: Use tool provider
      if(!useExec) {
        PipedInputStream in = new PipedInputStream(8192);
        out = new PipedOutputStream(in);
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, null, out, "-cp",base,filename);

        reader=new BufferedReader(new InputStreamReader(in)); 
      }
      // Method 2: Use exec to compile files
      // This older approach seemed to use more CPU resources but may be more reliable
      else {
        Process p = Runtime.getRuntime().exec("javac -cp " + base + " " +filename+args);
        reader=new BufferedReader(new InputStreamReader(p.getErrorStream())); 
      }
      String line;

      if(reader.ready()) {
        line = reader.readLine();
      }
      else {
        line = null;
      }

      while (line!=null) {
        System.err.println(translateLineToUmple(line, model));
        if(reader.ready()) {
          line = reader.readLine();
        }
        else {
          line = null;
        }
        successful = false;
      }
    } catch (IOException e) {
      println(e.getMessage());
    }
    finally {
      if (out != null) {
        // close the PipedOutputStream cleanly
        try {
          out.close();
        }
        catch (IOException e) {} 
      }
    }
    
    return successful;
  }


  /**
   * To do: Use model to determine generation path
   */
  // line 187 "../../../../src/Compiler.ump"
   private static  String translateLineToUmple(String line, UmpleModel model){
    String modifiedLine = line;
    StackTraceElement ust;
    String javaFileName;
    int javaLineNumber;
    String lineParts[] = null;
    if(File.separator.equals("\\")) {
    	// Windows System
    	String tempLineParts[] = line.split(":", 4);
    	if(tempLineParts.length == 4) {
    		lineParts = new String[3];
    		lineParts[0] = tempLineParts[0] + ":" + tempLineParts[1];
    		lineParts[1] = tempLineParts[2];
    		lineParts[2] = tempLineParts[3];
    	} else {
    		lineParts = line.split(":",3);
    	}
    }
    
    else {
    	// Mac or Linux
    	lineParts = line.split(":",3);
    }
    
    // Case 1: No colons so nothing to translate
    if(lineParts.length < 3) {
      return line;
    }
    
    // case 2: no colon before .java, so nothing to translate
    if (!lineParts[0].endsWith(".java")) {
      return line;
    }
    
    // We have a line that needs translating
    String javaFileParts[] =
      lineParts[0].split("\\"+System.getProperty("file.separator"),-1);
    String javaFile = lineParts[0];//javaFileParts[javaFileParts.length-1];
    
    String declaringClass = javaFile.substring(0,javaFile.length()-5);
    for(int i=javaFileParts.length-2; i>=0 ; i--) {
      if(!javaFileParts[i].equals(".")) {
        declaringClass = javaFileParts[i]+"."+declaringClass;
      }
    }
    // System.err.println("**"+declaringClass+"**"+javaFile); //debug
    
    //Code Smell: javaToUmpleStackTrace needs to not be static
    ust = cruise.umple.util.ExceptionDumper.javaToUmpleStackTrace(
      new StackTraceElement(
        declaringClass,
        "",
        javaFile,
        Integer.parseInt(lineParts[1])),  "");
    
    // System.err.println("*"+lineParts[0]+"*"); // Debug
    
    if(ust==null) {
      return line;
    }
    return(ust.getFileName()+":"+ust.getLineNumber()+":"+lineParts[2]);
  }

  // line 251 "../../../../src/Compiler.ump"
   private static  void println(String output){
    console += output + System.lineSeparator();
    System.out.println(output);
  }

  // line 258 "../../../../src/Compiler.ump"
   public static  String getSimpleFileName(String fileName){
    int lastIndex = fileName.lastIndexOf("/");
    if (lastIndex == -1)
    {
      return fileName;
    }
    else
    {
      return fileName.substring(lastIndex+1, fileName.length());
    }
  }

  // line 271 "../../../../src/Compiler.ump"
   public static  List<UmpleClass> getMainClasses(UmpleModel model){
    List<UmpleClass> mainClasses = new ArrayList<UmpleClass>();
    for(UmpleClass uClass:model.getUmpleClasses())
    {
	if (!uClass.hasMethods()) {
    		continue;
	}
      for (Method aMethod : uClass.getMethods()) 
      {
        
        if(!aMethod.getExistsInLanguage("Java")) {
          continue;
        }
        String methodModifier = aMethod.getModifier().equals("") ? "public" : aMethod.getModifier();
        String methodName = aMethod.getName();
        String methodType = aMethod.getType();
        
	if(methodName.equals("main")&&methodType.equals("void")&&methodModifier.contains("public")&&methodModifier.contains("static"))
        {
          mainClasses.add(uClass);
	}

	} // end for loop for all methods in class

	} // end for loop for all classes in model



    return mainClasses;
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 24 "../../../../src/Compiler.ump"
  public static String console ;
// line 25 "../../../../src/Compiler.ump"
  public static boolean subsequentCompilation = false ;

  
}