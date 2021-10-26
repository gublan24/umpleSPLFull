/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 219 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Y0_1__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y0_1__m Attributes
  private int v;

  //Y0_1__m Associations
  private List<X0_1__m> xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Y0_1__m(X0_1__m... allXVar)
  {
    v = 1;
    xVar = new ArrayList<X0_1__m>();
    boolean didAddXVar = setXVar(allXVar);
    if (!didAddXVar)
    {
      throw new RuntimeException("Unable to create Y0_1__m, must have 3 xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setV(int aV)
  {
    boolean wasSet = false;
    v = aV;
    wasSet = true;
    return wasSet;
  }

  public int getV()
  {
    return v;
  }
  /* Code from template association_GetMany */
  public X0_1__m getXVar(int index)
  {
    X0_1__m aXVar = xVar.get(index);
    return aXVar;
  }

  public List<X0_1__m> getXVar()
  {
    List<X0_1__m> newXVar = Collections.unmodifiableList(xVar);
    return newXVar;
  }

  public int numberOfXVar()
  {
    int number = xVar.size();
    return number;
  }

  public boolean hasXVar()
  {
    boolean has = xVar.size() > 0;
    return has;
  }

  public int indexOfXVar(X0_1__m aXVar)
  {
    int index = xVar.indexOf(aXVar);
    return index;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfXVar()
  {
    return 3;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfXVar()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfXVar()
  {
    return 3;
  }
  /* Code from template association_SetNToOptionalOne */
  public boolean setXVar(X0_1__m... newXVar)
  {
    boolean wasSet = false;
    ArrayList<X0_1__m> checkNewXVar = new ArrayList<X0_1__m>();
    for (X0_1__m aXVar : newXVar)
    {
      if (checkNewXVar.contains(aXVar))
      {
        return wasSet;
      }
      else if (aXVar.getY0_1__m() != null && !this.equals(aXVar.getY0_1__m()))
      {
        return wasSet;
      }
      checkNewXVar.add(aXVar);
    }

    if (checkNewXVar.size() != minimumNumberOfXVar())
    {
      return wasSet;
    }

    xVar.removeAll(checkNewXVar);
    
    for (X0_1__m orphan : xVar)
    {
      setY0_1__m(orphan, null);
    }
    xVar.clear();
    for (X0_1__m aXVar : newXVar)
    {
      setY0_1__m(aXVar, this);
      xVar.add(aXVar);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setY0_1__m(X0_1__m aXVar, Y0_1__m aY0_1__m)
  {
    try
    {
      java.lang.reflect.Field mentorField = aXVar.getClass().getDeclaredField("y0_1__m");
      mentorField.setAccessible(true);
      mentorField.set(aXVar, aY0_1__m);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aY0_1__m to aXVar", e);
    }
  }

  public void delete()
  {
    for(X0_1__m aXVar : xVar)
    {
      setY0_1__m(aXVar,null);
    }
    xVar.clear();
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]";
  }
}