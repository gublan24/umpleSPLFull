/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 373 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreGenericType extends EcoreGenericTypeNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreGenericType(String aName, int aIntent)
  {
    super(aName, aIntent);
    // line 377 "../../../../src/Generator_CodeEcore_Model.ump"
    setTagName("eGenericType");
    // END OF UMPLE BEFORE INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 388 "../../../../src/Generator_CodeEcore_Model.ump"
  public List<EcoreGenericNode> getNodeChildren(){
    List<EcoreGenericNode> nodes = super.getNodeChildren();
    
    nodes.addAll(getTypeArguments());
    
    return nodes;
  }

  // line 396 "../../../../src/Generator_CodeEcore_Model.ump"
  public Integer getNodeChildCount(){
    return numberOfTypeArguments();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 380 "../../../../src/Generator_CodeEcore_Model.ump"
  Map<String,String> getNodeAttributes () 
  {
    Map<String,String> map = super.getNodeAttributes();
    map.put("eClassifier", getName());
      
    return map;
  }

  
}