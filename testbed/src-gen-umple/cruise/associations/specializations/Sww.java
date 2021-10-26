/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 535 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Sww extends Sw
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Sww()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Wcc getWc_Wcc(int index)
  {
    Wcc aWc = (Wcc)super.getWc(index);
    return aWc;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Wcc> getWc_Wcc()
  {
    List<? extends Wc> newWc = super.getWc();
    return (List<Wcc>)newWc;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfWc_Wcc()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfWc_Wcc()
  {
    return 4;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addWc(Wcc aWc)
  {
    boolean wasAdded = false;
   List<Wcc> wc = getWc_Wcc(); 
    if (wc.contains(aWc)) { return false; }
    if (numberOfWc() >= maximumNumberOfWc_Wcc())
    {
      return wasAdded;
    }
    wasAdded = super.addWc(aWc);

    return wasAdded;
  }


  public void delete()
  {
    ArrayList<Wcc> copyOfWc = new ArrayList<Wcc>(getWc_Wcc());
    clear_wc();
    for(Wcc aWc : copyOfWc)
    {
      aWc.removeSw(this);
    }
    super.delete();
  }

}