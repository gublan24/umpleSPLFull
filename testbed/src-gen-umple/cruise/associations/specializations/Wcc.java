/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 536 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Wcc extends Wc
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Wcc()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Sww getSw_Sww(int index)
  {
    Sww aSw = (Sww)super.getSw(index);
    return aSw;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Sww> getSw_Sww()
  {
    List<? extends Sw> newSw = super.getSw();
    return (List<Sww>)newSw;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfSw_Sww()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfSw_Sww()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addSw(Sww aSw)
  {
    boolean wasAdded = false;
   List<Sww> sw = getSw_Sww(); 
    if (sw.contains(aSw)) { return false; }
    if (numberOfSw() >= maximumNumberOfSw_Sww())
    {
      return wasAdded;
    }
    wasAdded = super.addSw(aSw);

    return wasAdded;
  }


  public void delete()
  {
    while (getSw_Sww().size() > 0)
    {
      Sww aSw = getSw_Sww().get(getSw_Sww().size() - 1);
      aSw.delete();
      getSw_Sww().remove(aSw);
    }
    
    super.delete();
  }

}