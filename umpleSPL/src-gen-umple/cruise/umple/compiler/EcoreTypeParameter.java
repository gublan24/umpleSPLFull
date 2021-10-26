/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.Map;

// line 244 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreTypeParameter extends EcoreGenericNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreTypeParameter(String aName, int aIntent)
  {
    super(aName, aIntent);
    // line 250 "../../../../src/Generator_CodeEcore_Model.ump"
    setTagName("eTypeParameters");
    // END OF UMPLE BEFORE INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 253 "../../../../src/Generator_CodeEcore_Model.ump"
  Map<String,String> getNodeAttributes () 
  {
    Map<String,String> map = super.getNodeAttributes();
    
    map.put("name", getName());
      
    return map;
  }

  
}