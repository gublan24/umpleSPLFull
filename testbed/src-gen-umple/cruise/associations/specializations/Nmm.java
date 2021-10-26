/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 400 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Nmm extends Nm
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Nmm()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Mq getMq_Mq(int index)
  {
    Mq aMq = (Mq)super.getMq(index);
    return aMq;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Mq> getMq_Mq()
  {
    List<? extends Mq> newMq = super.getMq();
    return (List<Mq>)newMq;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfMq_Mq()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfMq_Mq()
  {
    return 5;
  }
  /* Code from template association_AddMNToOptionalOne_specialization */
  public boolean addMq(Mq aMq)
  {
    boolean wasAdded = false;
    List<Mq> mq = getMq_Mq();
    if (mq.contains(aMq)) { return false; }
    if (numberOfMq() >= maximumNumberOfMq_Mq())
    {
      return wasAdded;
    }
    Nmm existingNm = aMq.getNm_OneNmm();
    if (existingNm != null && existingNm.numberOfMq() <= minimumNumberOfMq_Mq())
    {
      return wasAdded;
    }
    wasAdded = super.addMq(aMq);
    return wasAdded;
  }

  public boolean removeMq(Mq aMq)
  {
    boolean wasRemoved = false;
    if (numberOfMq() > minimumNumberOfMq_Mq())
    {
      wasRemoved = super.removeMq(aMq);
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToOptionalOne_specialization */
  public boolean setMq(Mq... newMq)
  {
    boolean wasSet = false;
    if (newMq.length < minimumNumberOfMq_Mq() || newMq.length > maximumNumberOfMq_Mq())
    {
      return wasSet;
    }
    
    super.clear_mq();
    for ( Mq orphan : newMq )
    {
      addMq(orphan);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setNm(Mq aMq, Nmm aNm)
  {
    try
    {
      java.lang.reflect.Field mentorField = aMq.getClass().getDeclaredField("nm");
      mentorField.setAccessible(true);
      mentorField.set(aMq, aNm);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aNm to aMq", e);
    }
  }

  public void delete()
  {
    for(Mq aMq : getMq_Mq())
    {
      setNm(aMq,null);
    }
    clear_mq();
    super.delete();
  }

}