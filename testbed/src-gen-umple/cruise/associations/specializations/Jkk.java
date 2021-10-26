/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 368 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Jkk extends Jk
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Jkk()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Kl getKl_Kl(int index)
  {
    Kl aKl = (Kl)super.getKl(index);
    return aKl;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Kl> getKl_Kl()
  {
    List<? extends Kl> newKl = super.getKl();
    return (List<Kl>)newKl;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfKl_Kl()
  {
    return 4;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfKl_Kl()
  {
    return 5;
  }
  /* Code from template association_AddMNToOptionalOne_specialization */
  public boolean addKl(Kl aKl)
  {
    boolean wasAdded = false;
    List<Kl> kl = getKl_Kl();
    if (kl.contains(aKl)) { return false; }
    if (numberOfKl() >= maximumNumberOfKl_Kl())
    {
      return wasAdded;
    }
    Jkk existingJk = aKl.getJk_OneJkk();
    if (existingJk != null && existingJk.numberOfKl() <= minimumNumberOfKl_Kl())
    {
      return wasAdded;
    }
    wasAdded = super.addKl(aKl);
    return wasAdded;
  }

  public boolean removeKl(Kl aKl)
  {
    boolean wasRemoved = false;
    if (numberOfKl() > minimumNumberOfKl_Kl())
    {
      wasRemoved = super.removeKl(aKl);
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToOptionalOne_specialization */
  public boolean setKl(Kl... newKl)
  {
    boolean wasSet = false;
    if (newKl.length < minimumNumberOfKl_Kl() || newKl.length > maximumNumberOfKl_Kl())
    {
      return wasSet;
    }
    
    super.clear_kl();
    for ( Kl orphan : newKl )
    {
      addKl(orphan);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setJk(Kl aKl, Jkk aJk)
  {
    try
    {
      java.lang.reflect.Field mentorField = aKl.getClass().getDeclaredField("jk");
      mentorField.setAccessible(true);
      mentorField.set(aKl, aJk);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aJk to aKl", e);
    }
  }

  public void delete()
  {
    for(Kl aKl : getKl_Kl())
    {
      setJk(aKl,null);
    }
    clear_kl();
    super.delete();
  }

}