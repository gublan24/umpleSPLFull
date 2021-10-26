/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 545 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Dee extends De
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Dee()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Cdd getCd_Cdd(int index)
  {
    Cdd aCd = (Cdd)super.getCd(index);
    return aCd;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Cdd> getCd_Cdd()
  {
    List<? extends Cd> newCd = super.getCd();
    return (List<Cdd>)newCd;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfCd_Cdd()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfCd_Cdd()
  {
    return 3;
  }
  /* Code from template association_AddMNToOptionalOne_specialization */
  public boolean addCd(Cdd aCd)
  {
    boolean wasAdded = false;
    List<Cdd> cd = getCd_Cdd();
    if (cd.contains(aCd)) { return false; }
    if (numberOfCd() >= maximumNumberOfCd_Cdd())
    {
      return wasAdded;
    }
    Dee existingDe = aCd.getDe_OneDee();
    if (existingDe != null && existingDe.numberOfCd() <= minimumNumberOfCd_Cdd())
    {
      return wasAdded;
    }
    wasAdded = super.addCd(aCd);
    return wasAdded;
  }

  public boolean removeCd(Cdd aCd)
  {
    boolean wasRemoved = false;
    if (numberOfCd() > minimumNumberOfCd_Cdd())
    {
      wasRemoved = super.removeCd(aCd);
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToOptionalOne_specialization */
  public boolean setCd(Cdd... newCd)
  {
    boolean wasSet = false;
    if (newCd.length < minimumNumberOfCd_Cdd() || newCd.length > maximumNumberOfCd_Cdd())
    {
      return wasSet;
    }
    
    super.clear_cd();
    for ( Cdd orphan : newCd )
    {
      addCd(orphan);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setDe(Cdd aCd, Dee aDe)
  {
    try
    {
      java.lang.reflect.Field mentorField = aCd.getClass().getDeclaredField("de");
      mentorField.setAccessible(true);
      mentorField.set(aCd, aDe);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aDe to aCd", e);
    }
  }

  public void delete()
  {
    for(Cdd aCd : getCd_Cdd())
    {
      setDe(aCd,null);
    }
    clear_cd();
    super.delete();
  }

}