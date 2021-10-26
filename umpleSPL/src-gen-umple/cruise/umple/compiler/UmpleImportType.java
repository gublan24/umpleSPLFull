/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * 
 * ImportType is a "enumeration" of information for what type of 
 * file was imported. 
 * 
 * @since 19 Mar 2015
 */
// line 90 "../../../../src/UmpleImport.ump"
public class UmpleImportType
{

  //------------------------
  // STATIC VARIABLES
  //------------------------


  /**
   * http://eclipse.org/ecoretools/
   */
  public static final UmpleImportType ECORE = new UmpleImportType("ecore", "ECore");

  /**
   * http://en.wikipedia.org/wiki/SCXML
   */
  public static final UmpleImportType SCXML = new UmpleImportType("scxml", "State-Chart XML");
  public static final Set<UmpleImportType> ALL = new HashSet<>(Arrays.asList(ECORE, SCXML));

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleImportType Attributes
  private String fileType;
  private String name;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleImportType(String aFileType, String aName)
  {
    fileType = aFileType;
    name = aName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  /**
   * 
   * The file type of an import, i.e. the extension.
   */
  public String getFileType()
  {
    return fileType;
  }

  /**
   * 
   * Longform description of the type.
   */
  public String getName()
  {
    return name;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "fileType" + ":" + getFileType()+ "," +
            "name" + ":" + getName()+ "]";
  }
}