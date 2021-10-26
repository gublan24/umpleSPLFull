/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 442 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Crr extends Cr
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Crr()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Rf getRf_Rf(int index)
  {
    Rf aRf = (Rf)super.getRf(index);
    return aRf;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Rf> getRf_Rf()
  {
    List<? extends Rf> newRf = super.getRf();
    return (List<Rf>)newRf;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfRf_Rf()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfRf_Rf()
  {
    return 4;
  }
  /* Code from template association_AddOptionalNToOne_specialization */
  public Rf addRf()
  {
    if (numberOfRf() >= maximumNumberOfRf_Rf())
    {
      return null;
    }
    else
    {
      return new Rf();
    }
  }

  public boolean addRf(Rf aRf)
  {
    boolean wasAdded = false;
    List<Rf> rf = getRf_Rf();
    if (rf.contains(aRf)) { return false; }
    if (numberOfRf() >= maximumNumberOfRf_Rf())
    {
      return wasAdded;
    }

    wasAdded = super.addRf(aRf);
    return wasAdded;
  }
  public void delete()
  {
    super.delete();
  }

}