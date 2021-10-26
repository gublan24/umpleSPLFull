/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations;
import java.util.*;

// line 9 "../../../src/TestHarnessAssociation0_1_mMultiplicity.ump"
public class B
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //B Associations
  private List<A> a;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public B(A... allA)
  {
    a = new ArrayList<A>();
    boolean didAddA = setA(allA);
    if (!didAddA)
    {
      throw new RuntimeException("Unable to create B, must have 3 a. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public A getA(int index)
  {
    A aA = a.get(index);
    return aA;
  }

  public List<A> getA()
  {
    List<A> newA = Collections.unmodifiableList(a);
    return newA;
  }

  public int numberOfA()
  {
    int number = a.size();
    return number;
  }

  public boolean hasA()
  {
    boolean has = a.size() > 0;
    return has;
  }

  public int indexOfA(A aA)
  {
    int index = a.indexOf(aA);
    return index;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfA()
  {
    return 3;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfA()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfA()
  {
    return 3;
  }
  /* Code from template association_SetNToOptionalOne */
  public boolean setA(A... newA)
  {
    boolean wasSet = false;
    ArrayList<A> checkNewA = new ArrayList<A>();
    for (A aA : newA)
    {
      if (checkNewA.contains(aA))
      {
        return wasSet;
      }
      else if (aA.getB() != null && !this.equals(aA.getB()))
      {
        return wasSet;
      }
      checkNewA.add(aA);
    }

    if (checkNewA.size() != minimumNumberOfA())
    {
      return wasSet;
    }

    a.removeAll(checkNewA);
    
    for (A orphan : a)
    {
      setB(orphan, null);
    }
    a.clear();
    for (A aA : newA)
    {
      setB(aA, this);
      a.add(aA);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setB(A aA, B aB)
  {
    try
    {
      java.lang.reflect.Field mentorField = aA.getClass().getDeclaredField("b");
      mentorField.setAccessible(true);
      mentorField.set(aA, aB);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aB to aA", e);
    }
  }

  public void delete()
  {
    for(A aA : a)
    {
      setB(aA,null);
    }
    a.clear();
  }

}