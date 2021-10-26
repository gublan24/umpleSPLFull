/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 222 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Sss extends Ss
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Sss()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Aaa getA_Aaa(int index)
  {
    Aaa aA = (Aaa)super.getA(index);
    return aA;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Aaa> getA_Aaa()
  {
    List<? extends Aa> newA = super.getA();
    return (List<Aaa>)newA;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfA_Aaa()
  {
    return 4;
  }
  /* Code from template association_AddMNToOptionalOne_specialization */
  public boolean addA(Aaa aA)
  {
    boolean wasAdded = false;
    List<Aaa> a = getA_Aaa();
    if (a.contains(aA)) { return false; }
    Sss existingS = aA.getS_OneSss();
    if (existingS != null && existingS.numberOfA() <= minimumNumberOfA_Aaa())
    {
      return wasAdded;
    }
    wasAdded = super.addA(aA);
    return wasAdded;
  }

  public boolean removeA(Aaa aA)
  {
    boolean wasRemoved = false;
    if (numberOfA() > minimumNumberOfA_Aaa())
    {
      wasRemoved = super.removeA(aA);
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToOptionalOne_specialization */
  public boolean setA(Aaa... newA)
  {
    boolean wasSet = false;
    if (newA.length < minimumNumberOfA_Aaa())
    {
      return wasSet;
    }
    
    super.clear_a();
    for ( Aaa orphan : newA )
    {
      addA(orphan);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setS(Aaa aA, Sss aS)
  {
    try
    {
      java.lang.reflect.Field mentorField = aA.getClass().getDeclaredField("s");
      mentorField.setAccessible(true);
      mentorField.set(aA, aS);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aS to aA", e);
    }
  }

  public void delete()
  {
    for(Aaa aA : getA_Aaa())
    {
      setS(aA,null);
    }
    clear_a();
    super.delete();
  }

}