/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 243 "../../../../src/UmpleImport.ump"
public class UmpleImportConstants
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String XMI_TYPE = "xsi:type";
  public static final String XMI_NAME = "name";
  public static final String XMI_PACKAGENAME = "nsURI";
  public static final String XMI_INTERFACE = "interface";
  public static final String XMI_ABSTRACT = "abstract";
  public static final String XMI_SUPERTYPE = "eSuperTypes";
  public static final String XMI_UPPER = "upperBound";
  public static final String ECORE_PACKAGE = "ecore:EPackage";
  public static final String ECORE_CLASS = "ecore:EClass";
  public static final String ECORE_ATTRIBUTE = "ecore:EAttribute";
  public static final String ECORE_TYPE = "eType";
  public static final String ECORE_DATATYPE = "ecore:EDataType";
  public static final String ECORE_REFERENCE = "ecore:EReference";  private static UmpleImportConstants theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private UmpleImportConstants()
  {}

  public static UmpleImportConstants getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new UmpleImportConstants();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}