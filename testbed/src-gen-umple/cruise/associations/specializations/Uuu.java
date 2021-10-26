/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 201 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Uuu extends Uu
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Uuu()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Iii getI_Iii(int index)
  {
    Iii aI = (Iii)super.getI(index);
    return aI;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Iii> getI_Iii()
  {
    List<? extends Ii> newI = super.getI();
    return (List<Iii>)newI;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfIValid_Iii()
  {
    boolean isValid = numberOfI() >= minimumNumberOfI_Iii() && numberOfI() <= maximumNumberOfI_Iii();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod_specialization */
  public static int requiredNumberOfI_Iii()
  {
    return 2;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfI_Iii()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfI_Iii()
  {
    return 2;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addI(Iii aI)
  {
    boolean wasAdded = false;
   List<Iii> i = getI_Iii(); 
    if (i.contains(aI)) { return false; }
    if (numberOfI() >= maximumNumberOfI_Iii())
    {
      return wasAdded;
    }
    wasAdded = super.addI(aI);

    return wasAdded;
  }
  /* Code from template association_AddMNToMany_specialization */
  public boolean removeI(Iii aI)
  {
    boolean wasRemoved = false;

    if (numberOfI() <= minimumNumberOfI_Iii())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeI(aI);

    return wasRemoved;
  }

  public void delete()
  {
    ArrayList<Iii> copyOfI = new ArrayList<Iii>(getI_Iii());
    clear_i();
    for(Iii aI : copyOfI)
    {
      aI.removeU(this);
    }
    super.delete();
  }

}