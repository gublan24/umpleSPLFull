/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.Reader;
import java.io.IOException;

/**
 * A common util for the implemented Measurment objects (@see MeasurmentObject).
 */
// line 84 "../../../../src/Generator_CodeAnalysis.ump"
public class UmpleModelHelper
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static UmpleModelHelper theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private UmpleModelHelper()
  {}

  public static UmpleModelHelper getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new UmpleModelHelper();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 108 "../../../../src/Generator_CodeAnalysis.ump"
   private MeasurmentObject doCount(Reader reader) throws IOException{
    int commentIndex;
  int starCommentStartIndex;
  int starCommentEndIndex;
  java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.BufferedReader(reader));
  String line = bufferedReader.readLine();
  
  int codeCount=0;
  int commentsCount=0;
  boolean codeBlock = false;
  
  while (line != null) {
   normalizeLine:{
    line= line.replaceAll("\t", "").replaceAll(" ", ""); //No spaces, and no tabs //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    
    int position1= line.indexOf("\""); //$NON-NLS-1$
    if(position1==-1){
     break normalizeLine;
    }
    
    int position2 = line.indexOf("\"", position1 + 1); //$NON-NLS-1$
    if(position2==-1|| position2 > position1){
     break normalizeLine;
    }
    line= line.substring(0, position1 + 1)+ line.substring(position1 + (position2 - position1),line.length());
   }
   
   if (line.length() == 0) {
    line = bufferedReader.readLine();
    continue;
   }
   
   commentIndex = line.indexOf("//"); //$NON-NLS-1$
   starCommentStartIndex = line.indexOf("/*"); //$NON-NLS-1$
   starCommentEndIndex = line.indexOf("*/"); //$NON-NLS-1$

   measure:{
    if (codeBlock) {
     commentsCount++;
     if (starCommentEndIndex != -1) {
      codeBlock = false;
     }
    } else {
     if (commentIndex != -1) {
      commentsCount++;
      
      line = line.substring(0, 2);
      if(starCommentStartIndex>0){
       codeCount++;
       break measure;
      }
     }
     else{
      if(starCommentStartIndex == -1 && starCommentEndIndex == -1){
       codeCount++;
       break measure;
      }
     }
     
     if (starCommentStartIndex != -1) {
      commentsCount++;
      if (starCommentEndIndex == -1) {
       codeBlock = true;
      }
     }
    }
    
    if (starCommentEndIndex != -1 && starCommentEndIndex < line.length() - 2){
     codeCount++;
    }
   }
   
   line = bufferedReader.readLine();
  }
  return new MeasurmentObject(codeCount, commentsCount);
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 89 "../../../../src/Generator_CodeAnalysis.ump"
  MeasurmentObject countLOC (String contents) throws java.io.IOException 
  {
    if(contents == null){
		contents = "";  		
  	}
  	
  	java.io.StringReader reader = new java.io.StringReader(contents);
  	MeasurmentObject object = doCount(reader);
  	reader.close();
  	return object;
  }

// line 100 "../../../../src/Generator_CodeAnalysis.ump"
  MeasurmentObject countFileLOC (String filePath) throws java.io.IOException 
  {
    java.io.FileReader reader = new java.io.FileReader(filePath);
  	MeasurmentObject object = doCount(reader);
  	reader.close();
  	return object;
  }

  
}