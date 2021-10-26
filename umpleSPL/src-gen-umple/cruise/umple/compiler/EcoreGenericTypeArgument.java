/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 400 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreGenericTypeArgument extends EcoreGenericTypeNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreGenericTypeArgument Attributes
  private int order;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetOrder;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreGenericTypeArgument(String aName, int aIntent)
  {
    super(aName, aIntent);
    // line 408 "../../../../src/Generator_CodeEcore_Model.ump"
    setTagName("eTypeArguments");
    // END OF UMPLE BEFORE INJECTION
    cachedHashCode = -1;
    canSetOrder = true;
    order = 0;
    // line 414 "../../../../src/Generator_CodeEcore_Model.ump"
    setOrder(0);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOrder(int aOrder)
  {
    boolean wasSet = false;
    if (!canSetOrder) { return false; }
    order = aOrder;
    wasSet = true;
    return wasSet;
  }

  public int getOrder()
  {
    return order;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    EcoreGenericTypeArgument compareTo = (EcoreGenericTypeArgument)obj;
  
    if (getOrder() != compareTo.getOrder())
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
    cachedHashCode = cachedHashCode * 23 + getOrder();

    canSetOrder = false;
    return cachedHashCode;
  }

  public void delete()
  {
    super.delete();
  }

  // line 429 "../../../../src/Generator_CodeEcore_Model.ump"
  public List<EcoreGenericNode> getNodeChildren(){
    List<EcoreGenericNode> nodes = super.getNodeChildren();
    
    nodes.addAll(getTypeArguments());
    
    return nodes;
  }

  // line 437 "../../../../src/Generator_CodeEcore_Model.ump"
  public Integer getNodeChildCount(){
    return numberOfTypeArguments();
  }


  public String toString()
  {
    return super.toString() + "["+
            "order" + ":" + getOrder()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 419 "../../../../src/Generator_CodeEcore_Model.ump"
  Map<String,String> getNodeAttributes () 
  {
    Map<String,String> map = super.getNodeAttributes();
    
    if(getName() != null && !"".equals(getName()))
      map.put("eClassifier", getName());
      
    return map;
  }

  
}