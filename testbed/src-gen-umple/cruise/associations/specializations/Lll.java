/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 261 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Lll extends Ll
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Lll()
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
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfKValid_Kkk()
  {
    boolean isValid = numberOfK() >= minimumNumberOfK_Kkk();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfK_Kkk()
  {
    return 1;
  }
  /* Code from template association_AddMandatoryManyToOne_specialization */
  public boolean addK(Kkk aK)
  {
    boolean wasAdded = false;
    List<Kkk> k = getK_Kkk();
    if (k.contains(aK)) { return false; }
    Lll existingL = aK.getL_OneLll();
    boolean isNewL = existingL != null && !this.equals(existingL);

    if (isNewL && existingL.numberOfK() <= minimumNumberOfK_Kkk())
    {
      return wasAdded;
    }

    wasAdded = super.addK(aK);
    return wasAdded;
  }

  public boolean removeK(Kkk aK)
  {
    boolean wasRemoved = false;
    //Unable to remove aK, as it must always have a l
    if (this.equals(aK.getL()))
    {
      return wasRemoved;
    }

    //l already at minimum (1)
    if (numberOfK() <= minimumNumberOfK_Kkk())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeK(aK);
    return wasRemoved;
  }

  public void delete()
  {
    super.delete();
  }

}