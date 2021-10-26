/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 131 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Subab extends Supap
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Subab()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Subba getSuppa_Subba(int index)
  {
    Subba aSuppa = (Subba)super.getSuppa(index);
    return aSuppa;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Subba> getSuppa_Subba()
  {
    List<? extends Suppa> newSuppa = super.getSuppa();
    return (List<Subba>)newSuppa;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfSuppaValid_Subba()
  {
    boolean isValid = numberOfSuppa() >= minimumNumberOfSuppa_Subba() && numberOfSuppa() <= maximumNumberOfSuppa_Subba();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfSuppa_Subba()
  {
    return 10;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfSuppa_Subba()
  {
    return 15;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addSuppa(Subba aSuppa)
  {
    boolean wasAdded = false;
   List<Subba> suppa = getSuppa_Subba(); 
    if (suppa.contains(aSuppa)) { return false; }
    if (numberOfSuppa() >= maximumNumberOfSuppa_Subba())
    {
      return wasAdded;
    }
    wasAdded = super.addSuppa(aSuppa);

    return wasAdded;
  }
  /* Code from template association_AddMNToMany_specialization */
  public boolean removeSuppa(Subba aSuppa)
  {
    boolean wasRemoved = false;

    if (numberOfSuppa() <= minimumNumberOfSuppa_Subba())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeSuppa(aSuppa);

    return wasRemoved;
  }
  /* Code from template association_SetMNToMany_specialization */
  public boolean setSuppa(Subba... newSuppa)
  {
    boolean wasSet = false;
    ArrayList<Subba> verifiedSuppa = new ArrayList<Subba>();
    for (Subba aSuppa : newSuppa)
    {
      if (verifiedSuppa.contains(aSuppa))
      {
        continue;
      }
      verifiedSuppa.add(aSuppa);
    }

    if (verifiedSuppa.size() != newSuppa.length || verifiedSuppa.size() < minimumNumberOfSuppa_Subba() || verifiedSuppa.size() > maximumNumberOfSuppa_Subba())
    {
      return wasSet;
    }

    super.clear_suppa();
    for ( Subba orphan : newSuppa)
    {
      addSuppa(orphan);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Subba> copyOfSuppa = new ArrayList<Subba>(getSuppa_Subba());
    clear_suppa();
    for(Subba aSuppa : copyOfSuppa)
    {
      if (aSuppa.numberOfSupap() <= Subba.minimumNumberOfSupap_Subab())
      {
        aSuppa.delete();
      }
      else
      {
        aSuppa.removeSupap(this);
      }
    }
    super.delete();
  }

}