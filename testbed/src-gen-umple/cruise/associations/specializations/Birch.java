/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 118 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Birch extends Tree
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Birch()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Owl getHoot_Owl(int index)
  {
    Owl aHoot = (Owl)super.getHoot(index);
    return aHoot;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Owl> getHoots_Owl()
  {
    List<? extends Owl> newHoots = super.getHoots();
    return (List<Owl>)newHoots;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfHoots_Owl()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfHoots_Owl()
  {
    return 3;
  }
  /* Code from template association_AddOptionalNToOne_specialization */
  public Owl addHoot()
  {
    if (numberOfHoots() >= maximumNumberOfHoots_Owl())
    {
      return null;
    }
    else
    {
      return new Owl();
    }
  }

  public boolean addHoot(Owl aHoot)
  {
    boolean wasAdded = false;
    List<Owl> hoots = getHoots_Owl();
    if (hoots.contains(aHoot)) { return false; }
    if (numberOfHoots() >= maximumNumberOfHoots_Owl())
    {
      return wasAdded;
    }

    wasAdded = super.addHoot(aHoot);
    return wasAdded;
  }
  public void delete()
  {
    super.delete();
  }

}