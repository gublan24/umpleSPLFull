/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 328 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreAttribute extends EcoreClassElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreAttribute Attributes
  private boolean id;
  private boolean isTransient;
  private EcoreGenericType genericType;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreAttribute(String aName, int aIntent, String aEType)
  {
    super(aName, aIntent, aEType);
    resetId();
    resetIsTransient();
    resetGenericType();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetDefaulted */
  public boolean setId(boolean aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public boolean resetId()
  {
    boolean wasReset = false;
    id = getDefaultId();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setIsTransient(boolean aIsTransient)
  {
    boolean wasSet = false;
    isTransient = aIsTransient;
    wasSet = true;
    return wasSet;
  }

  public boolean resetIsTransient()
  {
    boolean wasReset = false;
    isTransient = getDefaultIsTransient();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setGenericType(EcoreGenericType aGenericType)
  {
    boolean wasSet = false;
    genericType = aGenericType;
    wasSet = true;
    return wasSet;
  }

  public boolean resetGenericType()
  {
    boolean wasReset = false;
    genericType = getDefaultGenericType();
    wasReset = true;
    return wasReset;
  }

  public boolean getId()
  {
    return id;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultId()
  {
    return false;
  }

  public boolean getIsTransient()
  {
    return isTransient;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultIsTransient()
  {
    return false;
  }

  public EcoreGenericType getGenericType()
  {
    return genericType;
  }
  /* Code from template attribute_GetDefaulted */
  public EcoreGenericType getDefaultGenericType()
  {
    return null;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isId()
  {
    return id;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsTransient()
  {
    return isTransient;
  }

  public void delete()
  {
    super.delete();
  }

  // line 355 "../../../../src/Generator_CodeEcore_Model.ump"
  public List<EcoreGenericNode> getNodeChildren(){
    List<EcoreGenericNode> nodes = super.getNodeChildren();
    
    nodes.add(getGenericType());
    
    return nodes;
  }

  // line 363 "../../../../src/Generator_CodeEcore_Model.ump"
  public Integer getNodeChildCount(){
    return getGenericType()!=null ? 1 : 0;
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "isTransient" + ":" + getIsTransient()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "genericType" + "=" + (getGenericType() != null ? !getGenericType().equals(this)  ? getGenericType().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 337 "../../../../src/Generator_CodeEcore_Model.ump"
  Map<String,String> getNodeAttributes () 
  {
    Map<String,String> map = super.getNodeAttributes();
    map.put("xsi:type", "ecore:EAttribute");
    map.put("name", getName());
    
    if(!getDefaultLowerBound().equals(getLowerBound()))
      map.put("lowerBound", String.valueOf(getLowerBound()));
    if(!getDefaultUpperBound().equals(getUpperBound()))
      map.put("upperBound", String.valueOf(getUpperBound()));
    if(getEType() != null && !"".equals(getEType()))
      map.put("eType", getEType());
    if(getDefaultIsTransient() != getIsTransient())
      map.put("transient", "true");    
    
    return map;
  }

  
}