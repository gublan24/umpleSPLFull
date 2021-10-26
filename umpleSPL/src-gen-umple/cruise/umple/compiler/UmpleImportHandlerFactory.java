/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 115 "../../../../src/UmpleImport.ump"
// line 286 "../../../../src/UmpleImport_CodeHandlers.ump"
public class UmpleImportHandlerFactory
{

  //------------------------
  // STATIC VARIABLES
  //------------------------


  /**
   * Singleton Instance of the class.
   */
  public static final UmpleImportHandlerFactory INSTANCE = new UmpleImportHandlerFactory();

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleImportHandlerFactory()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 288 "../../../../src/UmpleImport_CodeHandlers.ump"
  public static UmpleImportHandler create (final UmpleImportType type) 
  {
    if (type == UmpleImportType.ECORE) {
      return new EcoreImportHandler();
    } else if (type == UmpleImportType.SCXML) {
      return new ScxmlImportHandler();
    } else {
      throw new IllegalArgumentException("Unknown UmpleImportType: " + type);
    }
  }

  
}