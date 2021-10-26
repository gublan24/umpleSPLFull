/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.util;
import java.util.Scanner;
import java.util.regex.*;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.InvalidPathException;

// line 77 "../../../../src/Util_Code.ump"
public class ExceptionDumper
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ExceptionDumper()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 89 "../../../../src/Util_Code.ump"
   public static  String dumpCompilerError(Throwable ex){
    String generatedMessage = "";
    String exceptionMessage = "";
    String generatedSourcePath = System.getenv("GeneratedSourcePath");
    String sourcePathType="GeneratedSourcePath that has been set to ";
    
    if (generatedSourcePath == null) {
      String homedir = System.getenv("HOME");
      if(homedir != null &&
        (new File(homedir+"/umple/cruise.umple/src-gen-umple/cruise/umple/core/")).exists()) {
        // Use default generated source path
        generatedSourcePath = homedir+"/umple/cruise.umple/src-gen-umple/";
        sourcePathType="default GeneratedSourcePath ";
      }
      else {
        generatedMessage += "To locate the error in the Umple source, set GeneratedSourcePath to root directory where the generated Java is located:\ne.g. setenv GeneratedSourcePath ~/umple/cruise.umple/src-gen-umple/\n";
      }
    }
    if (generatedSourcePath != null) {
      generatedMessage +="Using "+sourcePathType+generatedSourcePath+"\n";
    }
    exceptionMessage = ex.getMessage();
    if (exceptionMessage == null) {
      exceptionMessage = "";
    }
    else {
      exceptionMessage = " ("+exceptionMessage+")";
    }  
    generatedMessage +="Exception "+ex.getClass().getName()+exceptionMessage+" in\n";

    StackTraceElement [] st = ex.getStackTrace();
    StackTraceElement ust = null;
    int dumpLimit = st.length;
    if (dumpLimit > 30) dumpLimit = 30;
    for (int i=0;i<dumpLimit;i++) {
      generatedMessage +=" at "+st[i].toString()+"\n";
      if(generatedSourcePath != null) {
         ust = javaToUmpleStackTrace(st[i], generatedSourcePath);
        if(ust != null) {
          generatedMessage +="   => "+ust.getFileName()+":"+ust.getLineNumber()+"\n";
         }
      }
    }
    return generatedMessage;
  }


  /**
   * Translate the java stack trace line information into the corresponding Umple line
   */
  // line 136 "../../../../src/Util_Code.ump"
   public static  StackTraceElement javaToUmpleStackTrace(StackTraceElement javaStack, String generatedSourcePath){
    int javaLineNumber = javaStack.getLineNumber();
      Path pathToJavaFile;
      
      try {
      	pathToJavaFile = Paths.get(generatedSourcePath + 
                                     javaStack.getClassName().replace('.',File.separatorChar) + ".java");
      } catch (InvalidPathException ipe) {
      	pathToJavaFile = null;
      }
      
      Scanner sc = null;
      try {
      	if(pathToJavaFile != null) {
        	sc = new Scanner(new BufferedReader(new FileReader(pathToJavaFile.toFile())));
        }
      }
      catch (FileNotFoundException fne) {
        sc = null;
      }
     
      if(sc == null) {
        // Try opening using just the natural hierarchy from package names
        try {
        	pathToJavaFile = Paths.get(javaStack.getClassName().replace('.',File.separatorChar) + ".java");
        } catch (InvalidPathException ipe) {
      		pathToJavaFile = null;
      	}
        try {
        	if(pathToJavaFile != null) {
          		sc = new Scanner(new BufferedReader(new FileReader(pathToJavaFile.toFile())));
          	}
        }
        catch (FileNotFoundException fne) {
          sc = null;
        }
      }
      
      if(sc == null) {
        // Try opening using just the plain file name
        int classNameStart = javaStack.getClassName().lastIndexOf('.')+1;
        
        try {
        	pathToJavaFile = Paths.get(generatedSourcePath + 
                                   javaStack.getClassName().substring(classNameStart)+".java");
        } catch (InvalidPathException ipe) {
      		pathToJavaFile = null;
      	}
        try {
        	if(pathToJavaFile != null) {
          		sc = new Scanner(new BufferedReader(new FileReader(pathToJavaFile.toFile())));
          	}
        }
        catch (FileNotFoundException fne) {
            sc = null;
        }
      }
      
      if(sc == null) {
        // The above doesn't work for relative paths in the className, 
        //  so use the actual fileNmae attribute of javaStack
        try {
        	pathToJavaFile = Paths.get(generatedSourcePath + javaStack.getFileName());
        } catch (InvalidPathException ipe) {
      		pathToJavaFile = null;
      	}
        try {
        	if(pathToJavaFile != null) {
          		sc = new Scanner(new BufferedReader(new FileReader(pathToJavaFile.toFile())));
          	}
        }
        catch (FileNotFoundException fne) {
          return null;          
        }
      }
      
      int lineNumber = 1;
      // Look for the comment referencing an umple file
      //    In the format of: // line ## "REL_PATH_TO_FILE"
      Pattern umpleSourceFileFormat = Pattern.compile(
        "^\\s*\\/\\/[ ]line[ ](\\d+)[ ]\"(.*)\"$");
      String umpleSourceFile = null;
      Integer umpleSourceLine = null;
      Integer umpleSourceJavaLine = null;
      
      // A function with an error in it after an inject statement cannot be easily distinguished
      // We need to keep track of the old line numbers in case an inject finishes and we haven't found the error
      String umpleSourceFileFunction = null;
      Integer umpleSourceLineFunction = null;
      Integer umpleSourceJavaLineFunction = null;
      
      boolean isInMain = false;
      boolean firstBraceFound = false;
      int braces = 0;
      boolean isInFunction = false;
      
      while(lineNumber<=javaLineNumber)
      {
        String line = sc.nextLine();
        Matcher umpleSourceFileMatcher = umpleSourceFileFormat.matcher(line);
        while(umpleSourceFileMatcher.matches())
        {
          umpleSourceLine = Integer.parseInt(umpleSourceFileMatcher.group(1));
          umpleSourceFile = umpleSourceFileMatcher.group(2);
          umpleSourceJavaLine = lineNumber;
          
          isInFunction = false;
          line = sc.nextLine();
          lineNumber++;
          // If we are entering a function declaration we need to account for that in the umple line number
          // Regex to match function declaration from: https://stackoverflow.com/questions/68633/regex-that-will-match-a-java-method-declaration
          if (line.matches("\\s*(public|protected|private|static|\\s)+ +[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;]).*"))
          {
              isInFunction = true;
              umpleSourceFileFunction = umpleSourceFile;
              umpleSourceLineFunction = umpleSourceLine;
              umpleSourceJavaLineFunction = umpleSourceJavaLine;
          }
          umpleSourceFileMatcher = umpleSourceFileFormat.matcher(line);
        }
        if(line.matches(".*(public)[ |\\t]+(static)[ |\\t]+(void)[ |\\t]+(main)[ |\\t]*[(][ |\\t]*(String)[ |\\t]*\\[\\].*"))
        {
          isInMain=true;
        }
        else if(line.matches("(.*)[ |\\t]+void([ |\\t]+)main([ |\\t]*)[(]([ |\\t]*)String[ |\\t]+[a-z|A-Z|0-9|_]+[ |\\t]*\\[[ |\\t]*\\][ |\\t]*[)](.*)"))
        {
          isInMain=true;        
        }
        // If you are exiting injected code and returning to a fucntion
        else if(line.matches("\\s*\\/\\/ END OF UMPLE (BEFORE|AFTER) INJECTION")) {
            isInFunction = true;
            if (umpleSourceFileFunction != null) {
	            umpleSourceFile = umpleSourceFileFunction;
	            umpleSourceLine = umpleSourceLineFunction;
	            // "Remove" the injected code from the offset calculation
	            umpleSourceJavaLine = umpleSourceJavaLineFunction + (lineNumber - umpleSourceJavaLine + 1);
	            // Need to keep this line number as the new starting index in the case of multiple inject statements
	            umpleSourceJavaLineFunction = umpleSourceJavaLine;
            }
        }
        if(isInMain)
        {
          int openBraces = line.length() - line.replace("{", "").length();
          int closedBraces = line.length() - line.replace("}", "").length();
          braces += openBraces - closedBraces;
          if(!firstBraceFound && openBraces > 0)
          {
            firstBraceFound = true;
          }
          if(braces <= 0 && firstBraceFound)
          {
            firstBraceFound=false;
            isInMain=false;
            braces=0;
          }
        }
        lineNumber++;
      }
      
      sc.close();
      
      if (umpleSourceFile != null)
      {
        Path umpleFilePath = pathToJavaFile.resolveSibling(umpleSourceFile);
        // Umple injects two lines of code into each main function, so we need to account for that offset
        Integer umpleLineNumber = umpleSourceLine + javaLineNumber - umpleSourceJavaLine - (isInMain?2:0);
        // We must also subtract two for the distance between the umpleSource declaration and the first line of the function declaration
        umpleLineNumber = umpleLineNumber - (isInFunction?2:1);
        return new StackTraceElement(javaStack.getClassName(),  javaStack.getMethodName(), umpleFilePath.getFileName().toString(), umpleLineNumber);
      }
      return null;
  }

}