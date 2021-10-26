/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 130 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Subba extends Suppa
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Subba()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Subab getSupap_Subab(int index)
  {
    Subab aSupap = (Subab)super.getSupap(index);
    return aSupap;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Subab> getSupap_Subab()
  {
    List<? extends Supap> newSupap = super.getSupap();
    return (List<Subab>)newSupap;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfSupapValid_Subab()
  {
    boolean isValid = numberOfSupap() >= minimumNumberOfSupap_Subab() && numberOfSupap() <= maximumNumberOfSupap_Subab();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfSupap_Subab()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfSupap_Subab()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addSupap(Subab aSupap)
  {
    boolean wasAdded = false;
   List<Subab> supap = getSupap_Subab(); 
    if (supap.contains(aSupap)) { return false; }
    if (numberOfSupap() >= maximumNumberOfSupap_Subab())
    {
      return wasAdded;
    }
    wasAdded = super.addSupap(aSupap);

    return wasAdded;
  }
  /* Code from template association_AddMNToMany_specialization */
  public boolean removeSupap(Subab aSupap)
  {
    boolean wasRemoved = false;

    if (numberOfSupap() <= minimumNumberOfSupap_Subab())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeSupap(aSupap);

    return wasRemoved;
  }
  /* Code from template association_SetMNToMany_specialization */
  public boolean setSupap(Subab... newSupap)
  {
    boolean wasSet = false;
    ArrayList<Subab> verifiedSupap = new ArrayList<Subab>();
    for (Subab aSupap : newSupap)
    {
      if (verifiedSupap.contains(aSupap))
      {
        continue;
      }
      verifiedSupap.add(aSupap);
    }

    if (verifiedSupap.size() != newSupap.length || verifiedSupap.size() < minimumNumberOfSupap_Subab() || verifiedSupap.size() > maximumNumberOfSupap_Subab())
    {
      return wasSet;
    }

    super.clear_supap();
    for ( Subab orphan : newSupap)
    {
      addSupap(orphan);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Subab> copyOfSupap = new ArrayList<Subab>(getSupap_Subab());
    clear_supap();
    for(Subab aSupap : copyOfSupap)
    {
      if (aSupap.numberOfSuppa() <= Subab.minimumNumberOfSuppa_Subba())
      {
        aSupap.delete();
      }
      else
      {
        aSupap.removeSuppa(this);
      }
    }
    super.delete();
  }

}