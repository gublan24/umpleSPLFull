/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 450 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Fvv extends Fv
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Fvv()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Vt getVt_Vt(int index)
  {
    Vt aVt = (Vt)super.getVt(index);
    return aVt;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Vt> getVt_Vt()
  {
    List<? extends Vt> newVt = super.getVt();
    return (List<Vt>)newVt;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfVt_Vt()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfVt_Vt()
  {
    return 3;
  }
  /* Code from template association_AddOptionalNToOptionalOne_specialization */
  public boolean addVt(Vt aVt)
  {
    boolean wasAdded = false;
    List<Vt> vt = getVt_Vt();
    if (vt.contains(aVt)) { return false; }
    if (numberOfVt() >= maximumNumberOfVt_Vt())
    {
      return wasAdded;
    }

    wasAdded = super.addVt(aVt);
    return wasAdded;
  }
  public void delete()
  {
    for( Vt orphan : getVt_Vt() )
    {
      orphan.clear_fv();
    }
    super.delete();
  }

}