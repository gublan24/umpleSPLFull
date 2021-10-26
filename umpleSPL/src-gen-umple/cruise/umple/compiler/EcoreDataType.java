/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 205 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreDataType extends EcoreGenericNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreDataType Attributes
  private String instanceType;
  private int typeArgumentCount;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetInstanceType;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreDataType(String aName, int aIntent, String aInstanceType, int aTypeArgumentCount)
  {
    super(aName, aIntent);
    // line 216 "../../../../src/Generator_CodeEcore_Model.ump"
    setTagName("eClassifiers");
    // END OF UMPLE BEFORE INJECTION
    cachedHashCode = -1;
    canSetInstanceType = true;
    instanceType = aInstanceType;
    typeArgumentCount = aTypeArgumentCount;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setInstanceType(String aInstanceType)
  {
    boolean wasSet = false;
    if (!canSetInstanceType) { return false; }
    instanceType = aInstanceType;
    wasSet = true;
    return wasSet;
  }

  public boolean setTypeArgumentCount(int aTypeArgumentCount)
  {
    boolean wasSet = false;
    typeArgumentCount = aTypeArgumentCount;
    wasSet = true;
    return wasSet;
  }

  public String getInstanceType()
  {
    return instanceType;
  }

  public int getTypeArgumentCount()
  {
    return typeArgumentCount;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    EcoreDataType compareTo = (EcoreDataType)obj;
  
    if (getInstanceType() == null && compareTo.getInstanceType() != null)
    {
      return false;
    }
    else if (getInstanceType() != null && !getInstanceType().equals(compareTo.getInstanceType()))
    {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    if (getInstanceType() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getInstanceType().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetInstanceType = false;
    return cachedHashCode;
  }

  public void delete()
  {
    super.delete();
  }

  // line 230 "../../../../src/Generator_CodeEcore_Model.ump"
  public List<EcoreGenericNode> getNodeChildren(){
    List<EcoreGenericNode> nodes = super.getNodeChildren();
    
    for(int i=1; i<=typeArgumentCount; i++){
      nodes.add(new EcoreTypeParameter("Type"+i, getIntent()+1));
    }
        
    return nodes;
  }

  // line 240 "../../../../src/Generator_CodeEcore_Model.ump"
  public Integer getNodeChildCount(){
    return typeArgumentCount;
  }


  public String toString()
  {
    return super.toString() + "["+
            "instanceType" + ":" + getInstanceType()+ "," +
            "typeArgumentCount" + ":" + getTypeArgumentCount()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 219 "../../../../src/Generator_CodeEcore_Model.ump"
  Map<String,String> getNodeAttributes () 
  {
    Map<String,String> map = super.getNodeAttributes();

    map.put("xsi:type", "ecore:EDataType");
    map.put("name", getName());
    map.put("instanceClassName", getInstanceType());

    return map;
  }

  
}