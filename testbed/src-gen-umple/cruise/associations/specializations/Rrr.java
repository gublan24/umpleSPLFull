/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 182 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Rrr extends Rr
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Rrr()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Eee getE_Eee(int index)
  {
    Eee aE = (Eee)super.getE(index);
    return aE;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Eee> getE_Eee()
  {
    List<? extends Ee> newE = super.getE();
    return (List<Eee>)newE;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfEValid_Eee()
  {
    boolean isValid = numberOfE() >= minimumNumberOfE_Eee() && numberOfE() <= maximumNumberOfE_Eee();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod_specialization */
  public static int requiredNumberOfE_Eee()
  {
    return 2;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfE_Eee()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfE_Eee()
  {
    return 2;
  }
  /* Code from template association_AddMNToOnlyOne_specialization */
  public Eee addE()
  {
    if (numberOfE() >= maximumNumberOfE_Eee())
    {
      return null;
    }
    else
    {
      return new Eee();
    }
  }

  public boolean addE(Eee aE)
  {
    boolean wasAdded = false;
    List<Eee> e = getE_Eee();
    if (e.contains(aE)) { return false; }
    if (numberOfE() >= maximumNumberOfE_Eee())
    {
      return wasAdded;
    }

    Rrr existingR = aE.getR_OneRrr();
    boolean isNewR = existingR != null && !this.equals(existingR);

    if (isNewR && existingR.numberOfE() <= minimumNumberOfE_Eee())
    {
      return wasAdded;
    }

    wasAdded = super.addE(aE);
    return wasAdded;
  }

  public boolean removeE(Eee aE)
  {
    boolean wasRemoved = false;
    //Unable to remove aE, as it must always have a r
    if (this.equals(aE.getR()))
    {
      return wasRemoved;
    }

    //r already at minimum (2)
    if (numberOfE() <= minimumNumberOfE_Eee())
    {
      return wasRemoved;
    }
    
    wasRemoved = super.removeE(aE);
    return wasRemoved;
  }

  public void delete()
  {
    super.delete();
  }

}