/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 310 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreClassElement extends EcoreGenericNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreClassElement Attributes
  private String eType;
  private boolean changeable;
  private boolean unsettable;
  private boolean ordered;
  private boolean isUnique;
  private String lowerBound;
  private String upperBound;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreClassElement(String aName, int aIntent, String aEType)
  {
    super(aName, aIntent);
    // line 324 "../../../../src/Generator_CodeEcore_Model.ump"
    setTagName("eStructuralFeatures");
    // END OF UMPLE BEFORE INJECTION
    eType = aEType;
    resetChangeable();
    resetUnsettable();
    resetOrdered();
    resetIsUnique();
    resetLowerBound();
    resetUpperBound();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setEType(String aEType)
  {
    boolean wasSet = false;
    eType = aEType;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setChangeable(boolean aChangeable)
  {
    boolean wasSet = false;
    changeable = aChangeable;
    wasSet = true;
    return wasSet;
  }

  public boolean resetChangeable()
  {
    boolean wasReset = false;
    changeable = getDefaultChangeable();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setUnsettable(boolean aUnsettable)
  {
    boolean wasSet = false;
    unsettable = aUnsettable;
    wasSet = true;
    return wasSet;
  }

  public boolean resetUnsettable()
  {
    boolean wasReset = false;
    unsettable = getDefaultUnsettable();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setOrdered(boolean aOrdered)
  {
    boolean wasSet = false;
    ordered = aOrdered;
    wasSet = true;
    return wasSet;
  }

  public boolean resetOrdered()
  {
    boolean wasReset = false;
    ordered = getDefaultOrdered();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setIsUnique(boolean aIsUnique)
  {
    boolean wasSet = false;
    isUnique = aIsUnique;
    wasSet = true;
    return wasSet;
  }

  public boolean resetIsUnique()
  {
    boolean wasReset = false;
    isUnique = getDefaultIsUnique();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setLowerBound(String aLowerBound)
  {
    boolean wasSet = false;
    lowerBound = aLowerBound;
    wasSet = true;
    return wasSet;
  }

  public boolean resetLowerBound()
  {
    boolean wasReset = false;
    lowerBound = getDefaultLowerBound();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setUpperBound(String aUpperBound)
  {
    boolean wasSet = false;
    upperBound = aUpperBound;
    wasSet = true;
    return wasSet;
  }

  public boolean resetUpperBound()
  {
    boolean wasReset = false;
    upperBound = getDefaultUpperBound();
    wasReset = true;
    return wasReset;
  }

  public String getEType()
  {
    return eType;
  }

  public boolean getChangeable()
  {
    return changeable;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultChangeable()
  {
    return true;
  }

  public boolean getUnsettable()
  {
    return unsettable;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultUnsettable()
  {
    return false;
  }

  public boolean getOrdered()
  {
    return ordered;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultOrdered()
  {
    return false;
  }

  public boolean getIsUnique()
  {
    return isUnique;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultIsUnique()
  {
    return false;
  }

  public String getLowerBound()
  {
    return lowerBound;
  }
  /* Code from template attribute_GetDefaulted */
  public String getDefaultLowerBound()
  {
    return "0";
  }

  public String getUpperBound()
  {
    return upperBound;
  }
  /* Code from template attribute_GetDefaulted */
  public String getDefaultUpperBound()
  {
    return "1";
  }
  /* Code from template attribute_IsBoolean */
  public boolean isChangeable()
  {
    return changeable;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isUnsettable()
  {
    return unsettable;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isOrdered()
  {
    return ordered;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsUnique()
  {
    return isUnique;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "eType" + ":" + getEType()+ "," +
            "changeable" + ":" + getChangeable()+ "," +
            "unsettable" + ":" + getUnsettable()+ "," +
            "ordered" + ":" + getOrdered()+ "," +
            "isUnique" + ":" + getIsUnique()+ "," +
            "lowerBound" + ":" + getLowerBound()+ "," +
            "upperBound" + ":" + getUpperBound()+ "]";
  }
}