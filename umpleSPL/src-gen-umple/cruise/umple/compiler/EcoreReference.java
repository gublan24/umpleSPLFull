/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 441 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreReference extends EcoreClassElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreReference Attributes
  private String eOppositeType;
  private String eOppositeName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreReference(String aName, int aIntent, String aEType)
  {
    super(aName, aIntent, aEType);
    resetEOppositeType();
    resetEOppositeName();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetDefaulted */
  public boolean setEOppositeType(String aEOppositeType)
  {
    boolean wasSet = false;
    eOppositeType = aEOppositeType;
    wasSet = true;
    return wasSet;
  }

  public boolean resetEOppositeType()
  {
    boolean wasReset = false;
    eOppositeType = getDefaultEOppositeType();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setEOppositeName(String aEOppositeName)
  {
    boolean wasSet = false;
    eOppositeName = aEOppositeName;
    wasSet = true;
    return wasSet;
  }

  public boolean resetEOppositeName()
  {
    boolean wasReset = false;
    eOppositeName = getDefaultEOppositeName();
    wasReset = true;
    return wasReset;
  }

  public String getEOppositeType()
  {
    return eOppositeType;
  }
  /* Code from template attribute_GetDefaulted */
  public String getDefaultEOppositeType()
  {
    return "";
  }

  public String getEOppositeName()
  {
    return eOppositeName;
  }
  /* Code from template attribute_GetDefaulted */
  public String getDefaultEOppositeName()
  {
    return "";
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "eOppositeType" + ":" + getEOppositeType()+ "," +
            "eOppositeName" + ":" + getEOppositeName()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 449 "../../../../src/Generator_CodeEcore_Model.ump"
  Map<String,String> getNodeAttributes () 
  {
    Map<String,String> map = super.getNodeAttributes();
    map.put("xsi:type", "ecore:EReference");
    map.put("name", getName());
    
    if(!getDefaultLowerBound().equals(getLowerBound()))
      map.put("lowerBound", String.valueOf(getLowerBound()));
    if(!getDefaultUpperBound().equals(getUpperBound()))
      map.put("upperBound", String.valueOf(getUpperBound()));
      
    map.put("eType", "#//"+getEType());
    if(!getDefaultEOppositeType().equals(getEOppositeType())
      || !getDefaultEOppositeName().equals(getEOppositeName()))
      map.put("eOpposite", String.format("#//%s/%s", getEOppositeType(), getEOppositeName()));
    
    return map;
  }

  
}