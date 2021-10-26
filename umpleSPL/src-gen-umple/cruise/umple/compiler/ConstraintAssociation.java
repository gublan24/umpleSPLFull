/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * Fragment source file: Umple_CodeConstraint.ump
 * Line : 680
 * ConstraintAttributes encapsulate the association for the constraint, this will be a leaf on the constraint tree.
 */
// line 394 "../../../../src/Association_refactored.ump"
// line 473 "../../../../src/Umple.ump"
public class ConstraintAssociation extends ConstraintNamed
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintAssociation Attributes
  private AssociationVariable association;
  private int index;
  private boolean numberOf;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetAssociation;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintAssociation(AssociationVariable aAssociation)
  {
    super();
    cachedHashCode = -1;
    canSetAssociation = true;
    association = aAssociation;
    index = -1;
    numberOf = false;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAssociation(AssociationVariable aAssociation)
  {
    boolean wasSet = false;
    if (!canSetAssociation) { return false; }
    association = aAssociation;
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

  public boolean setNumberOf(boolean aNumberOf)
  {
    boolean wasSet = false;
    numberOf = aNumberOf;
    wasSet = true;
    return wasSet;
  }

  public AssociationVariable getAssociation()
  {
    return association;
  }

  public int getIndex()
  {
    return index;
  }

  public boolean getNumberOf()
  {
    return numberOf;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNumberOf()
  {
    return numberOf;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    ConstraintAssociation compareTo = (ConstraintAssociation)obj;
  
    if (getAssociation() == null && compareTo.getAssociation() != null)
    {
      return false;
    }
    else if (getAssociation() != null && !getAssociation().equals(compareTo.getAssociation()))
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
    if (getAssociation() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getAssociation().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetAssociation = false;
    return cachedHashCode;
  }

  public void delete()
  {
    super.delete();
  }

  // line 398 "../../../../src/Association_refactored.ump"
  public String getName(){
    return association==null?null:association.getName();
  }


  /**
   * A method for conveniently getting the contained association's container class.
   */
  // line 404 "../../../../src/Association_refactored.ump"
  public UmpleClassifier retrieveClassifier(){
    UmpleClass containerClass = association.getUmpleClass();
      if(containerClass==null)
      {
        UmpleTrait containerTrait = association.getUmpleTrait();
        return containerTrait;
      }
      else
      {
        return containerClass;
      }
  }

  // line 415 "../../../../src/Association_refactored.ump"
   public String getType(){
    return numberOf?"associationNumberOf":index==-1?"associationList":"associationGet";
  }


  public String toString()
  {
    return super.toString() + "["+
            "index" + ":" + getIndex()+ "," +
            "numberOf" + ":" + getNumberOf()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "association" + "=" + (getAssociation() != null ? !getAssociation().equals(this)  ? getAssociation().toString().replaceAll("  ","    ") : "this" : "null");
  }
}