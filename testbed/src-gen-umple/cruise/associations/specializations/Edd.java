/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 434 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Edd extends Ed
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Edd()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Dc getDc_Dc(int index)
  {
    Dc aDc = (Dc)super.getDc(index);
    return aDc;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Dc> getDc_Dc()
  {
    List<? extends Dc> newDc = super.getDc();
    return (List<Dc>)newDc;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfDc_Dc()
  {
    return 0;
  }

  public void delete()
  {
    for( Dc orphan : getDc_Dc() )
    {
      orphan.clear_ed();
    }
    super.delete();
  }

}