/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 152 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Bbz extends Bz
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Bbz()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Aaz getA_Aaz(int index)
  {
    Aaz aA = (Aaz)super.getA(index);
    return aA;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Aaz> getA_Aaz()
  {
    List<? extends Az> newA = super.getA();
    return (List<Aaz>)newA;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfA_Aaz()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfA_Aaz()
  {
    return 4;
  }
  /* Code from template association_AddOptionalNToOptionalOne_specialization */
  public boolean addA(Aaz aA)
  {
    boolean wasAdded = false;
    List<Aaz> a = getA_Aaz();
    if (a.contains(aA)) { return false; }
    if (numberOfA() >= maximumNumberOfA_Aaz())
    {
      return wasAdded;
    }

    wasAdded = super.addA(aA);
    return wasAdded;
  }
  public void delete()
  {
    for( Aaz orphan : getA_Aaz() )
    {
      orphan.clear_b();
    }
    super.delete();
  }

}