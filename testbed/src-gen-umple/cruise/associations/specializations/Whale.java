/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 85 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Whale extends BigCreature
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Whale()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Blubber getFat_Blubber(int index)
  {
    Blubber aFat = (Blubber)super.getFat(index);
    return aFat;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Blubber> getFat_Blubber()
  {
    List<? extends Fat> newFat = super.getFat();
    return (List<Blubber>)newFat;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfFatValid_Blubber()
  {
    boolean isValid = numberOfFat() >= minimumNumberOfFat_Blubber() && numberOfFat() <= maximumNumberOfFat_Blubber();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod_specialization */
  public static int requiredNumberOfFat_Blubber()
  {
    return 10;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfFat_Blubber()
  {
    return 10;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfFat_Blubber()
  {
    return 10;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addFat(Blubber aFat)
  {
    boolean wasAdded = false;
   List<Blubber> fat = getFat_Blubber(); 
    if (fat.contains(aFat)) { return false; }
    if (numberOfFat() >= maximumNumberOfFat_Blubber())
    {
      return wasAdded;
    }
    wasAdded = super.addFat(aFat);

    return wasAdded;
  }
  /* Code from template association_AddMNToMany_specialization */
  public boolean removeFat(Blubber aFat)
  {
    boolean wasRemoved = false;

    if (numberOfFat() <= minimumNumberOfFat_Blubber())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeFat(aFat);

    return wasRemoved;
  }
  /* Code from template association_SetMNToMany_specialization */
  public boolean setFat(Blubber... newFat)
  {
    boolean wasSet = false;
    ArrayList<Blubber> verifiedFat = new ArrayList<Blubber>();
    for (Blubber aFat : newFat)
    {
      if (verifiedFat.contains(aFat))
      {
        continue;
      }
      verifiedFat.add(aFat);
    }

    if (verifiedFat.size() != newFat.length || verifiedFat.size() < minimumNumberOfFat_Blubber() || verifiedFat.size() > maximumNumberOfFat_Blubber())
    {
      return wasSet;
    }

    super.clear_fat();
    for ( Blubber orphan : newFat)
    {
      addFat(orphan);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Blubber> copyOfFat = new ArrayList<Blubber>(getFat_Blubber());
    clear_fat();
    for(Blubber aFat : copyOfFat)
    {
      if (aFat.numberOfBigs() <= Blubber.minimumNumberOfBigs_Whale())
      {
        aFat.delete();
      }
      else
      {
        aFat.removeBig(this);
      }
    }
    super.delete();
  }

}