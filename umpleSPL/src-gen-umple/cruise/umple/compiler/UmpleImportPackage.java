/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 163 "../../../../src/UmpleImport.ump"
// line 80 "../../../../src/UmpleImport_CodeModels.ump"
public class UmpleImportPackage extends UmpleImportElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleImportPackage(String aId, String aName)
  {
    super(aId, aName);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 83 "../../../../src/UmpleImport_CodeModels.ump"
  public String generateUmple(){
    StringBuilder umpleBuilder = this.getUmpleBuilder();
    umpleBuilder.append("namespace " + this.getName() + ";");
    return umpleBuilder.toString();
  }

}