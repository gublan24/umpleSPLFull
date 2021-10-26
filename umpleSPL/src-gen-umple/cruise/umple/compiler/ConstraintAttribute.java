/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * ConstraintAttributes encapsulate the attribute for the constraint, this will be a leaf on the constraint tree
 */
// line 637 "../../../../src/Umple_CodeConstraint.ump"
// line 463 "../../../../src/Umple.ump"
public class ConstraintAttribute extends ConstraintNamed
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintAttribute Attributes
  private Attribute attribute;
  private int index;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetAttribute;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintAttribute(Attribute aAttribute)
  {
    super();
    cachedHashCode = -1;
    canSetAttribute = true;
    attribute = aAttribute;
    index = -1;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAttribute(Attribute aAttribute)
  {
    boolean wasSet = false;
    if (!canSetAttribute) { return false; }
    attribute = aAttribute;
    wasSet = true;
    return wasSet;
  }

  public boolean setIndex(int aIndex)
  {
    boolean wasSet = false;
    index = aIndex;
    wasSet = true;
    return wasSet;
  }

  public Attribute getAttribute()
  {
    return attribute;
  }

  public int getIndex()
  {
    return index;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    ConstraintAttribute compareTo = (ConstraintAttribute)obj;
  
    if (getAttribute() == null && compareTo.getAttribute() != null)
    {
      return false;
    }
    else if (getAttribute() != null && !getAttribute().equals(compareTo.getAttribute()))
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
    if (getAttribute() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getAttribute().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetAttribute = false;
    return cachedHashCode;
  }

  public void delete()
  {
    super.delete();
  }

  // line 641 "../../../../src/Umple_CodeConstraint.ump"
  public String getName(){
    return attribute==null?null:attribute.getName();
  }


  /**
   * A method for conveniently getting the contained attribute's container class.
   */
  // line 647 "../../../../src/Umple_CodeConstraint.ump"
  public UmpleClassifier retrieveClassifier(){
    UmpleClass containerClass = attribute.getUmpleClass();
    if(containerClass==null)
    {
      UmpleTrait containerTrait = attribute.getUmpleTrait();
      return containerTrait;
    }
    else
    {
      return containerClass;
    }
  }

  // line 658 "../../../../src/Umple_CodeConstraint.ump"
   public String getType(){
    return getAttribute().getModifier().contains("internal")?"name":"attribute";
  }


  public String toString()
  {
    return super.toString() + "["+
            "index" + ":" + getIndex()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "attribute" + "=" + (getAttribute() != null ? !getAttribute().equals(this)  ? getAttribute().toString().replaceAll("  ","    ") : "this" : "null");
  }
}