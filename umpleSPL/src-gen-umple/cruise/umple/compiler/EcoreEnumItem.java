/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 500 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreEnumItem extends EcoreGenericNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreEnumItem Attributes
  private int value;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreEnumItem(String aName, int aIntent, int aValue)
  {
    super(aName, aIntent);
    // line 508 "../../../../src/Generator_CodeEcore_Model.ump"
    setTagName("eLiterals");
    // END OF UMPLE BEFORE INJECTION
    value = aValue;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setValue(int aValue)
  {
    boolean wasSet = false;
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  public int getValue()
  {
    return value;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "value" + ":" + getValue()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 511 "../../../../src/Generator_CodeEcore_Model.ump"
  Map<String,String> getNodeAttributes () 
  {
    Map<String,String> map = super.getNodeAttributes();
    map.put("name", getName());
    map.put("value", String.valueOf(getValue()));
    
    return map;
  }

  
}