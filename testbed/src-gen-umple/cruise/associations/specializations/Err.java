/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 306 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Err extends Er
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Err()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Rtt getRt_Rtt(int index)
  {
    Rtt aRt = (Rtt)super.getRt(index);
    return aRt;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Rtt> getRt_Rtt()
  {
    List<? extends Rt> newRt = super.getRt();
    return (List<Rtt>)newRt;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfRt_Rtt()
  {
    return 3;
  }
  /* Code from template association_AddMNToOptionalOne_specialization */
  public boolean addRt(Rtt aRt)
  {
    boolean wasAdded = false;
    List<Rtt> rt = getRt_Rtt();
    if (rt.contains(aRt)) { return false; }
    Err existingEr = aRt.getEr_OneErr();
    if (existingEr != null && existingEr.numberOfRt() <= minimumNumberOfRt_Rtt())
    {
      return wasAdded;
    }
    wasAdded = super.addRt(aRt);
    return wasAdded;
  }

  public boolean removeRt(Rtt aRt)
  {
    boolean wasRemoved = false;
    if (numberOfRt() > minimumNumberOfRt_Rtt())
    {
      wasRemoved = super.removeRt(aRt);
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToOptionalOne_specialization */
  public boolean setRt(Rtt... newRt)
  {
    boolean wasSet = false;
    if (newRt.length < minimumNumberOfRt_Rtt())
    {
      return wasSet;
    }
    
    super.clear_rt();
    for ( Rtt orphan : newRt )
    {
      addRt(orphan);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setEr(Rtt aRt, Err aEr)
  {
    try
    {
      java.lang.reflect.Field mentorField = aRt.getClass().getDeclaredField("er");
      mentorField.setAccessible(true);
      mentorField.set(aRt, aEr);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aEr to aRt", e);
    }
  }

  public void delete()
  {
    for(Rtt aRt : getRt_Rtt())
    {
      setEr(aRt,null);
    }
    clear_rt();
    super.delete();
  }

}