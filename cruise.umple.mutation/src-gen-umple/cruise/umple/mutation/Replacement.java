/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.mutation;

// line 38 "../../../../src/MutationMetamodel.ump"
public class Replacement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Replacement Attributes
  private String replacementCode;
  private String replacementType;

  //Replacement Associations
  private MutationSuite mutationSuite;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Replacement(String aReplacementCode, String aReplacementType)
  {
    replacementCode = aReplacementCode;
    replacementType = aReplacementType;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setReplacementCode(String aReplacementCode)
  {
    boolean wasSet = false;
    replacementCode = aReplacementCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setReplacementType(String aReplacementType)
  {
    boolean wasSet = false;
    replacementType = aReplacementType;
    wasSet = true;
    return wasSet;
  }

  public String getReplacementCode()
  {
    return replacementCode;
  }

  public String getReplacementType()
  {
    return replacementType;
  }
  /* Code from template association_GetOne */
  public MutationSuite getMutationSuite()
  {
    return mutationSuite;
  }

  public boolean hasMutationSuite()
  {
    boolean has = mutationSuite != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setMutationSuite(MutationSuite aMutationSuite)
  {
    boolean wasSet = false;
    MutationSuite existingMutationSuite = mutationSuite;
    mutationSuite = aMutationSuite;
    if (existingMutationSuite != null && !existingMutationSuite.equals(aMutationSuite))
    {
      existingMutationSuite.removeReplacement(this);
    }
    if (aMutationSuite != null)
    {
      aMutationSuite.addReplacement(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (mutationSuite != null)
    {
      MutationSuite placeholderMutationSuite = mutationSuite;
      this.mutationSuite = null;
      placeholderMutationSuite.removeReplacement(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "replacementCode" + ":" + getReplacementCode()+ "," +
            "replacementType" + ":" + getReplacementType()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "mutationSuite = "+(getMutationSuite()!=null?Integer.toHexString(System.identityHashCode(getMutationSuite())):"null");
  }
}