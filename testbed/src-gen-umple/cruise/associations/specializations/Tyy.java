/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 315 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Tyy extends Ty
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Tyy()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Yuu getYu_Yuu(int index)
  {
    Yuu aYu = (Yuu)super.getYu(index);
    return aYu;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Yuu> getYu_Yuu()
  {
    List<? extends Yu> newYu = super.getYu();
    return (List<Yuu>)newYu;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfYu_Yuu()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfYu_Yuu()
  {
    return 5;
  }
  /* Code from template association_AddMNToOptionalOne_specialization */
  public boolean addYu(Yuu aYu)
  {
    boolean wasAdded = false;
    List<Yuu> yu = getYu_Yuu();
    if (yu.contains(aYu)) { return false; }
    if (numberOfYu() >= maximumNumberOfYu_Yuu())
    {
      return wasAdded;
    }
    Tyy existingTy = aYu.getTy_OneTyy();
    if (existingTy != null && existingTy.numberOfYu() <= minimumNumberOfYu_Yuu())
    {
      return wasAdded;
    }
    wasAdded = super.addYu(aYu);
    return wasAdded;
  }

  public boolean removeYu(Yuu aYu)
  {
    boolean wasRemoved = false;
    if (numberOfYu() > minimumNumberOfYu_Yuu())
    {
      wasRemoved = super.removeYu(aYu);
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToOptionalOne_specialization */
  public boolean setYu(Yuu... newYu)
  {
    boolean wasSet = false;
    if (newYu.length < minimumNumberOfYu_Yuu() || newYu.length > maximumNumberOfYu_Yuu())
    {
      return wasSet;
    }
    
    super.clear_yu();
    for ( Yuu orphan : newYu )
    {
      addYu(orphan);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setTy(Yuu aYu, Tyy aTy)
  {
    try
    {
      java.lang.reflect.Field mentorField = aYu.getClass().getDeclaredField("ty");
      mentorField.setAccessible(true);
      mentorField.set(aYu, aTy);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aTy to aYu", e);
    }
  }

  public void delete()
  {
    for(Yuu aYu : getYu_Yuu())
    {
      setTy(aYu,null);
    }
    clear_yu();
    super.delete();
  }

}