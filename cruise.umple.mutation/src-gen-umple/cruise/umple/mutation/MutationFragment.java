/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.mutation;

// line 44 "../../../../src/MutationMetamodel.ump"
public class MutationFragment
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MutationFragment Attributes
  private String code;
  private String location;
  private String type;

  //MutationFragment Associations
  private Mutant mutant;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MutationFragment(String aCode, String aLocation, String aType, Mutant aMutant)
  {
    code = aCode;
    location = aLocation;
    type = aType;
    boolean didAddMutant = setMutant(aMutant);
    if (!didAddMutant)
    {
      throw new RuntimeException("Unable to create mf due to mutant. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCode(String aCode)
  {
    boolean wasSet = false;
    code = aCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setLocation(String aLocation)
  {
    boolean wasSet = false;
    location = aLocation;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public String getCode()
  {
    return code;
  }

  public String getLocation()
  {
    return location;
  }

  public String getType()
  {
    return type;
  }
  /* Code from template association_GetOne */
  public Mutant getMutant()
  {
    return mutant;
  }
  /* Code from template association_SetOneToMany */
  public boolean setMutant(Mutant aMutant)
  {
    boolean wasSet = false;
    if (aMutant == null)
    {
      return wasSet;
    }

    Mutant existingMutant = mutant;
    mutant = aMutant;
    if (existingMutant != null && !existingMutant.equals(aMutant))
    {
      existingMutant.removeMf(this);
    }
    mutant.addMf(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Mutant placeholderMutant = mutant;
    this.mutant = null;
    if(placeholderMutant != null)
    {
      placeholderMutant.removeMf(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "code" + ":" + getCode()+ "," +
            "location" + ":" + getLocation()+ "," +
            "type" + ":" + getType()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "mutant = "+(getMutant()!=null?Integer.toHexString(System.identityHashCode(getMutant())):"null");
  }
}