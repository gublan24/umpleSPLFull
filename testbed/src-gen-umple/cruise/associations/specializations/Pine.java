/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 74 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Pine extends Dilleniidae
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Pine()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Alteration getAlt_Alteration(int index)
  {
    Alteration aAlt = (Alteration)super.getAlt(index);
    return aAlt;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Alteration> getAlts_Alteration()
  {
    List<? extends Alteration> newAlts = super.getAlts();
    return (List<Alteration>)newAlts;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfAltsValid_Alteration()
  {
    boolean isValid = numberOfAlts() >= minimumNumberOfAlts_Alteration() && numberOfAlts() <= maximumNumberOfAlts_Alteration();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod_specialization */
  public static int requiredNumberOfAlts_Alteration()
  {
    return 3;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfAlts_Alteration()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfAlts_Alteration()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addAlt(Alteration aAlt)
  {
    boolean wasAdded = false;
   List<Alteration> alts = getAlts_Alteration(); 
    if (alts.contains(aAlt)) { return false; }
    if (numberOfAlts() >= maximumNumberOfAlts_Alteration())
    {
      return wasAdded;
    }
    wasAdded = super.addAlt(aAlt);

    return wasAdded;
  }
  /* Code from template association_AddMNToMany_specialization */
  public boolean removeAlt(Alteration aAlt)
  {
    boolean wasRemoved = false;

    if (numberOfAlts() <= minimumNumberOfAlts_Alteration())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeAlt(aAlt);

    return wasRemoved;
  }

  public void delete()
  {
    ArrayList<Alteration> copyOfAlts = new ArrayList<Alteration>(getAlts_Alteration());
    clear_alts();
    for(Alteration aAlt : copyOfAlts)
    {
      aAlt.removeDill(this);
    }
    super.delete();
  }

}