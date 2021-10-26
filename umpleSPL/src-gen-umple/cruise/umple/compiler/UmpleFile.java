/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import cruise.umple.compiler.exceptions.*;

/**
 * This class already exists in the util subdirectory
 * It is used for the main file, and there is code
 * to add linkedfiles. It would seem logical to consider
 * using UmpleFile as a subclass of MixsetOrFile. An
 * instance would have to be populated for every file
 * not just the main file.
 * TODO: Users of this can most likely just use File, so this could be refactored out
 */
// line 31 "../../../../src/Mixset.ump"
// line 58 "../../../../src/UmpleHelper.ump"
// line 12 "../../../../src/UmpleHelper_Code.ump"
public class UmpleFile extends MixsetOrFile
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleFile Attributes
  private File file;

  /**
   * list of command-based linked Umple files
   */
  private String linkedFiles;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleFile(File aFile)
  {
    super();
    file = aFile;
    linkedFiles = "";
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getFileName()
  {
    return file.getName();
  }

  public String getPath()
  {
    return file.getAbsoluteFile().getParentFile().getAbsolutePath();
  }

  public String getParent()
  {
    return new File(getPath()).getParent().toString();
  }

  public void delete()
  {
    super.delete();
  }

  // line 34 "../../../../src/Mixset.ump"
  public String getName(){
    return getSimpleFileName();
  }

  // line 17 "../../../../src/UmpleHelper_Code.ump"
   public  UmpleFile(String aPath, String aFilename){
    this(new File(aPath,aFilename));
  }

  // line 22 "../../../../src/UmpleHelper_Code.ump"
   public  UmpleFile(String aFullFilename){
    this(new File(aFullFilename));
  }

  // line 31 "../../../../src/UmpleHelper_Code.ump"
   public String getSimpleFileName(){
    String name = getFileName();
    int lastIndex = name.lastIndexOf(".");
    if (lastIndex == -1)
    {
      return name;
    }
    else
    {
      return name.substring(0, lastIndex);
    }
  }

  // line 44 "../../../../src/UmpleHelper_Code.ump"
   public InputStream getFileStream() throws FileNotFoundException{
    return new FileInputStream(file);
  }

  // line 49 "../../../../src/UmpleHelper_Code.ump"
   public boolean doesFileExist(){
    return file.exists();
  }


  /**
   * this is used to add command-based linked Umple files to the proper list.
   */
  // line 54 "../../../../src/UmpleHelper_Code.ump"
   public void addLinkedFiles(String filename){
    linkedFiles = linkedFiles+"use "+filename+";\n";
  }


  /**
   * this is used to get list of command-based linked Umple files.
   */
  // line 59 "../../../../src/UmpleHelper_Code.ump"
   public String getLinkedFiles(){
    return "\n"+linkedFiles;
  }


  public String toString()
  {
    return super.toString() + "["+
            "fileName" + ":" + getFileName()+ "," +
            "path" + ":" + getPath()+ "," +
            "parent" + ":" + getParent()+ "]";
  }
}