/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 83 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Blubber extends Fat
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Blubber()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Whale getBig_Whale(int index)
  {
    Whale aBig = (Whale)super.getBig(index);
    return aBig;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Whale> getBigs_Whale()
  {
    List<? extends BigCreature> newBigs = super.getBigs();
    return (List<Whale>)newBigs;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfBigsValid_Whale()
  {
    boolean isValid = numberOfBigs() >= minimumNumberOfBigs_Whale() && numberOfBigs() <= maximumNumberOfBigs_Whale();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod_specialization */
  public static int requiredNumberOfBigs_Whale()
  {
    return 2;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfBigs_Whale()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfBigs_Whale()
  {
    return 2;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addBig(Whale aBig)
  {
    boolean wasAdded = false;
   List<Whale> bigs = getBigs_Whale(); 
    if (bigs.contains(aBig)) { return false; }
    if (numberOfBigs() >= maximumNumberOfBigs_Whale())
    {
      return wasAdded;
    }
    wasAdded = super.addBig(aBig);

    return wasAdded;
  }
  /* Code from template association_AddMNToMany_specialization */
  public boolean removeBig(Whale aBig)
  {
    boolean wasRemoved = false;

    if (numberOfBigs() <= minimumNumberOfBigs_Whale())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeBig(aBig);

    return wasRemoved;
  }
  /* Code from template association_SetMNToMany_specialization */
  public boolean setBigs(Whale... newBigs)
  {
    boolean wasSet = false;
    ArrayList<Whale> verifiedBigs = new ArrayList<Whale>();
    for (Whale aBig : newBigs)
    {
      if (verifiedBigs.contains(aBig))
      {
        continue;
      }
      verifiedBigs.add(aBig);
    }

    if (verifiedBigs.size() != newBigs.length || verifiedBigs.size() < minimumNumberOfBigs_Whale() || verifiedBigs.size() > maximumNumberOfBigs_Whale())
    {
      return wasSet;
    }

    super.clear_bigs();
    for ( Whale orphan : newBigs)
    {
      addBig(orphan);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Whale> copyOfBigs = new ArrayList<Whale>(getBigs_Whale());
    clear_bigs();
    for(Whale aBig : copyOfBigs)
    {
      if (aBig.numberOfFat() <= Whale.minimumNumberOfFat_Blubber())
      {
        aBig.delete();
      }
      else
      {
        aBig.removeFat(this);
      }
    }
    super.delete();
  }

}