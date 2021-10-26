/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.util;
import java.util.*;
import java.io.*;
import org.junit.*;

// line 14 "../../../../src/SampleFileWriter_Code.ump"
public class SampleFileWriter
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SampleFileWriter()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 23 "../../../../src/SampleFileWriter_Code.ump"
   public static  File[] getAllFiles(File inputDirectory){
    File[] allFiles = inputDirectory.listFiles();
    Arrays.sort(allFiles, new Comparator<File>(){
      public int compare(File f1, File f2)
      {
        return f1.getName().compareTo(f2.getName());
      } 
    });
    return allFiles;
  }

  // line 34 "../../../../src/SampleFileWriter_Code.ump"
   public static  String readContent(File filename){
    return readContent(filename, null);
  }

  // line 39 "../../../../src/SampleFileWriter_Code.ump"
   public static  String readContent(File filename, String exclusionPattern){
    BufferedReader reader = null;
    StringBuffer answer = new StringBuffer();
    
    try
    {
      reader = new BufferedReader(new FileReader(filename));
      String nextLine = null;
      while (( nextLine = reader.readLine()) != null)
      {
        if(exclusionPattern != null) {
          nextLine = nextLine.replaceAll(exclusionPattern, "");
        }
        answer.append(nextLine);
        answer.append("\n");
      } 
      
    }
    catch (Exception e)
    {
      throw new RuntimeException("Unable to read content",e);
    }
    finally
    {
      closeAsRequired(reader);
    }    
    return answer.toString();
  }

  // line 70 "../../../../src/SampleFileWriter_Code.ump"
   public static  void assertEitherFileContent(File expected1, File expected2, String actual){
    try
    {
      assertFileContent(expected1,actual);
    }
    catch (AssertionError e)
    {
      assertFileContent(expected2,actual);
    }
  }

  // line 82 "../../../../src/SampleFileWriter_Code.ump"
   private static  String readLine(BufferedReader reader){
    try{    
        String nextLine = reader.readLine();
        return nextLine == null ? null : nextLine.trim();
    } catch (Exception e){
        Assert.fail(e.getMessage());
        return null;
    }
  }

  // line 93 "../../../../src/SampleFileWriter_Code.ump"
   public static  void assertPartialFileContent(File partial, String actual){
    BufferedReader expectedReader = null;
    BufferedReader actualReader = null;
    boolean foundMatch = false;
    
    try
    {
      expectedReader = new BufferedReader(new FileReader(partial));
      actualReader = new BufferedReader(new StringReader(actual));
      
      String expectedLine = null;
      String actualLine = null;
      
      int line = 0;
      do 
      {
        if (expectedLine == null || foundMatch)
        {
          expectedLine = readLine(expectedReader);
        }
        actualLine = readLine(actualReader);
        // HACK: To deal with // line # comments
        while (actualLine != null && (actualLine.indexOf("// line") != -1 ||  actualLine.indexOf("# line") != -1))
        { //Ignore the line, go to next
          actualLine = readLine(actualReader);
        }

        // Deal with Code from template
        while (actualLine != null && actualLine.indexOf("/* Code from template") != -1)
        { //Ignore the line, go to next
          actualLine = readLine(actualReader);
        }        
        
        line++;
        
        if (expectedLine == null) 
        {
          break; 
        }
        else if (foundMatch)
        {
          Assert.assertEquals("Failed at:" + line,expectedLine,actualLine);
        }
        else if (expectedLine.equals(actualLine))
        {
          foundMatch = true;
        }
      } 
      while (expectedLine != null);
    }
    catch (Exception e)
    {
      Assert.fail(e.getMessage());
    }
    finally
    {
      closeAsRequired(expectedReader);
      closeAsRequired(actualReader);
    }
    if (!foundMatch) { Assert.fail("Did not find expected lines"); }
  }

  // line 156 "../../../../src/SampleFileWriter_Code.ump"
   public static  void assertFileContent(File expected, String actual){
    assertFileContent(expected, actual, true);
  }

  // line 160 "../../../../src/SampleFileWriter_Code.ump"
   public static  void assertFileContent(File expected, String actual, boolean ignoreLineComments){
    try
    {
      assertFileContent(new BufferedReader(new FileReader(expected)),new BufferedReader(new StringReader(actual)),ignoreLineComments);
    }
    catch (FileNotFoundException e)
    {
      Assert.fail(e.getMessage());
    }
  }

  // line 171 "../../../../src/SampleFileWriter_Code.ump"
   public static  void assertFileContent(File expected, File actual, boolean ignoreLineComments){
    try
    {
      assertFileContent(new BufferedReader(new FileReader(expected)),new BufferedReader(new FileReader(actual)),ignoreLineComments);
    }
    catch (FileNotFoundException e)
    {
      Assert.fail(e.getMessage());
    }
  }

  // line 183 "../../../../src/SampleFileWriter_Code.ump"
   public static  void assertFileContent(BufferedReader expectedReader, BufferedReader actualReader, boolean ignoreLineComments){
    Boolean skippedActualLineDifference;
    try
    {
      String expectedLine = null;
      String actualLine = null;
      
      int line = 0;
    do 
      {
        actualLine = actualReader.readLine();
        expectedLine = expectedReader.readLine();
        skippedActualLineDifference = false;
        if (ignoreLineComments)
        {
          // Skip past elements that may change in updated code but are not important differences
          while (actualLine != null && (actualLine.indexOf("// line") != -1 ||
                    actualLine.indexOf("# line") != -1 ||
                    actualLine.indexOf("/* Code from template") != -1 ||
                    actualLine.matches("\\s*\\/\\/ END OF UMPLE (BEFORE|AFTER) INJECTION") ||
                    actualLine.matches("\\s*\\# END OF UMPLE (BEFORE|AFTER) INJECTION")))
          { //Ignore the line, go to next - line found has unimportant difference
            actualLine = actualReader.readLine();
            skippedActualLineDifference = true;
          }
          
          while (expectedLine != null && (expectedLine.indexOf("// line") != -1 ||
                    actualLine.indexOf("# line") != -1 ||
                    expectedLine.indexOf("/* Code from template") != -1 ||  
                    (skippedActualLineDifference == true && expectedLine.trim().isEmpty()) ||      
                    expectedLine.matches("\\s*\\/\\/ END OF UMPLE (BEFORE|AFTER) INJECTION")||
                    expectedLine.matches("\\s*\\# END OF UMPLE (BEFORE|AFTER) INJECTION")))
          { 
        	  expectedLine = expectedReader.readLine();
        	  skippedActualLineDifference = false; // Only skip one blank
          }
             
        } 
        
        line++;
        
        // HACK: To deal with umple version issues
        if (expectedLine != null && expectedLine.indexOf("This code was generated using the UMPLE") == -1)
        {
          Assert.assertEquals("Failed at:" + line,expectedLine,actualLine);  
        }
      } 
      while (expectedLine != null && actualLine != null);
      
      if(expectedLine == null && line == 1)
      {
      	Assert.fail(("Expected output file is empty."));
      }
    }
    catch (Exception e)
    {
      Assert.fail(e.getMessage());
    }
    finally
    {
      closeAsRequired(expectedReader);
      closeAsRequired(actualReader);
    }
  }

  // line 253 "../../../../src/SampleFileWriter_Code.ump"
   public static  void closeAsRequired(BufferedReader reader){
    if (reader != null)
    {
      try
      {
        reader.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
  }

  // line 268 "../../../../src/SampleFileWriter_Code.ump"
   public static  void closeAsRequired(InputStream reader){
    if (reader != null)
    {
      try
      {
        reader.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
  }

  // line 283 "../../../../src/SampleFileWriter_Code.ump"
   public static  String rationalize(String rawPath){
    String path = rawPath;
    File f = new File(path);
    if (f.exists())
    {
      return path;
    }
    
    path = "../cruise.umple/" + rawPath;
    f = new File(path);
    if (f.exists())
    {
      return path;
    }
    
    path = "/h/ralph/umple/trunk/cruise.umple/" + rawPath;
    f = new File(path);
    if (f.exists())
    {
      return path;
    }

    // TODO: this shouldn't be hardcoded - see issue 751
    path = "dist/gradle/test/workingDir/" + rawPath;
    return path;
  }

  // line 311 "../../../../src/SampleFileWriter_Code.ump"
   public static  void createFile(String filename, String input){
    File f = new File(filename);
    f.getAbsoluteFile().getParentFile().mkdirs();
    
    try
    {
      BufferedWriter out = new BufferedWriter(new FileWriter(filename));
      out.write(input);
      out.close();
    }
    catch (IOException e)
    {
      throw new RuntimeException("Unable to create file [" + filename + "]", e);
    }
  }


  /**
   * 
   * Deletes a file or directory.
   * @param filenames File paths to destroy
   */
  // line 332 "../../../../src/SampleFileWriter_Code.ump"
   public static  void destroy(String... filenames){
    for (String filename: filenames) {
    File file = new File(filename);
    
    if (file.isDirectory())
    {
      destroy(file);
    }
    else
    {
      file.delete();
    }
  }
  }

  // line 348 "../../../../src/SampleFileWriter_Code.ump"
   private static  void destroy(File path){
    if( path.exists() ) {
      File[] files = path.listFiles();
      for(int i=0; i<files.length; i++) {
        if(files[i].isDirectory()) {
          destroy(files[i]);
        }
        else {
          files[i].delete();
        }
      }
    }
    path.delete();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 247 "../../../../src/SampleFileWriter_Code.ump"
  public static void assertFileExists (final String path) 
  {
    Assert.assertTrue("File, " + path + ", does not exist.", (new File(path)).exists());
  }

  
}