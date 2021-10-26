/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.mutation;
import cruise.umple.compiler.*;
import java.util.*;

// line 27 "../../../../src/MutationMetamodel.ump"
public class Mutant
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Mutant Attributes
  private UmpleModel muModel;
  private String type;

  //Mutant Associations
  private List<MutationFragment> mf;
  private MutationSuite mutationSuite;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Mutant(UmpleModel aMuModel, String aType, MutationSuite aMutationSuite)
  {
    muModel = aMuModel;
    type = aType;
    mf = new ArrayList<MutationFragment>();
    boolean didAddMutationSuite = setMutationSuite(aMutationSuite);
    if (!didAddMutationSuite)
    {
      throw new RuntimeException("Unable to create mutant due to mutationSuite. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMuModel(UmpleModel aMuModel)
  {
    boolean wasSet = false;
    muModel = aMuModel;
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

  public UmpleModel getMuModel()
  {
    return muModel;
  }

  public String getType()
  {
    return type;
  }
  /* Code from template association_GetMany */
  public MutationFragment getMf(int index)
  {
    MutationFragment aMf = mf.get(index);
    return aMf;
  }

  public List<MutationFragment> getMf()
  {
    List<MutationFragment> newMf = Collections.unmodifiableList(mf);
    return newMf;
  }

  public int numberOfMf()
  {
    int number = mf.size();
    return number;
  }

  public boolean hasMf()
  {
    boolean has = mf.size() > 0;
    return has;
  }

  public int indexOfMf(MutationFragment aMf)
  {
    int index = mf.indexOf(aMf);
    return index;
  }
  /* Code from template association_GetOne */
  public MutationSuite getMutationSuite()
  {
    return mutationSuite;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMf()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public MutationFragment addMf(String aCode, String aLocation, String aType)
  {
    return new MutationFragment(aCode, aLocation, aType, this);
  }

  public boolean addMf(MutationFragment aMf)
  {
    boolean wasAdded = false;
    if (mf.contains(aMf)) { return false; }
    Mutant existingMutant = aMf.getMutant();
    boolean isNewMutant = existingMutant != null && !this.equals(existingMutant);
    if (isNewMutant)
    {
      aMf.setMutant(this);
    }
    else
    {
      mf.add(aMf);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMf(MutationFragment aMf)
  {
    boolean wasRemoved = false;
    //Unable to remove aMf, as it must always have a mutant
    if (!this.equals(aMf.getMutant()))
    {
      mf.remove(aMf);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMfAt(MutationFragment aMf, int index)
  {  
    boolean wasAdded = false;
    if(addMf(aMf))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMf()) { index = numberOfMf() - 1; }
      mf.remove(aMf);
      mf.add(index, aMf);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMfAt(MutationFragment aMf, int index)
  {
    boolean wasAdded = false;
    if(mf.contains(aMf))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMf()) { index = numberOfMf() - 1; }
      mf.remove(aMf);
      mf.add(index, aMf);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMfAt(aMf, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMany */
  public boolean setMutationSuite(MutationSuite aMutationSuite)
  {
    boolean wasSet = false;
    if (aMutationSuite == null)
    {
      return wasSet;
    }

    MutationSuite existingMutationSuite = mutationSuite;
    mutationSuite = aMutationSuite;
    if (existingMutationSuite != null && !existingMutationSuite.equals(aMutationSuite))
    {
      existingMutationSuite.removeMutant(this);
    }
    mutationSuite.addMutant(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    for(int i=mf.size(); i > 0; i--)
    {
      MutationFragment aMf = mf.get(i - 1);
      aMf.delete();
    }
    MutationSuite placeholderMutationSuite = mutationSuite;
    this.mutationSuite = null;
    if(placeholderMutationSuite != null)
    {
      placeholderMutationSuite.removeMutant(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "type" + ":" + getType()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "muModel" + "=" + (getMuModel() != null ? !getMuModel().equals(this)  ? getMuModel().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "mutationSuite = "+(getMutationSuite()!=null?Integer.toHexString(System.identityHashCode(getMutationSuite())):"null");
  }
}