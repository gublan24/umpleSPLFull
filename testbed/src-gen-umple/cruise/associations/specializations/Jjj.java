/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 251 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Jjj extends Jj
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Jjj()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Kkk getK_Kkk(int index)
  {
    Kkk aK = (Kkk)super.getK(index);
    return aK;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Kkk> getK_Kkk()
  {
    List<? extends Kk> newK = super.getK();
    return (List<Kkk>)newK;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfK_Kkk()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfK_Kkk()
  {
    return 6;
  }
  /* Code from template association_AddOptionalNToOne_specialization */
  public Kkk addK()
  {
    if (numberOfK() >= maximumNumberOfK_Kkk())
    {
      return null;
    }
    else
    {
      return new Kkk();
    }
  }

  public boolean addK(Kkk aK)
  {
    boolean wasAdded = false;
    List<Kkk> k = getK_Kkk();
    if (k.contains(aK)) { return false; }
    if (numberOfK() >= maximumNumberOfK_Kkk())
    {
      return wasAdded;
    }

    wasAdded = super.addK(aK);
    return wasAdded;
  }
  public void delete()
  {
    super.delete();
  }

}