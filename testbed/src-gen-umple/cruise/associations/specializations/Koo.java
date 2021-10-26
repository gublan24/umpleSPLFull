/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 499 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Koo extends Ko
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Koo()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Oll getOl_Oll(int index)
  {
    Oll aOl = (Oll)super.getOl(index);
    return aOl;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Oll> getOl_Oll()
  {
    List<? extends Ol> newOl = super.getOl();
    return (List<Oll>)newOl;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfOl_Oll()
  {
    return 0;
  }

  public void delete()
  {
    while (getOl_Oll().size() > 0)
    {
      Oll aOl = getOl_Oll().get(getOl_Oll().size() - 1);
      aOl.delete();
      getOl_Oll().remove(aOl);
    }
    
    super.delete();
  }

}