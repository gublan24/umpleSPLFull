/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 231 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Y0_1__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y0_1__m_n Attributes
  private int v;

  //Y0_1__m_n Associations
  private List<X0_1__m_n> xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Y0_1__m_n(X0_1__m_n... allXVar)
  {
    v = 1;
    xVar = new ArrayList<X0_1__m_n>();
    boolean didAddXVar = setXVar(allXVar);
    if (!didAddXVar)
    {
      throw new RuntimeException("Unable to create Y0_1__m_n, must have 2 to 3 xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  public X0_1__m_n getXVar(int index)
  {
    X0_1__m_n aXVar = xVar.get(index);
    return aXVar;
  }

  public List<X0_1__m_n> getXVar()
  {
    List<X0_1__m_n> newXVar = Collections.unmodifiableList(xVar);
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

  public int indexOfXVar(X0_1__m_n aXVar)
  {
    int index = xVar.indexOf(aXVar);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfXVar()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfXVar()
  {
    return 3;
  }
  /* Code from template association_AddMNToOptionalOne */
  public boolean addXVar(X0_1__m_n aXVar)
  {
    boolean wasAdded = false;
    if (xVar.contains(aXVar)) { return false; }
    if (numberOfXVar() >= maximumNumberOfXVar())
    {
      return wasAdded;
    }
    Y0_1__m_n existingY0_1__m_n = aXVar.getY0_1__m_n();
    if (existingY0_1__m_n != null && existingY0_1__m_n.numberOfXVar() <= minimumNumberOfXVar())
    {
      return wasAdded;
    }
    else if (existingY0_1__m_n != null)
    {
      existingY0_1__m_n.xVar.remove(aXVar);
    }
    xVar.add(aXVar);
    setY0_1__m_n(aXVar,this);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeXVar(X0_1__m_n aXVar)
  {
    boolean wasRemoved = false;
    if (xVar.contains(aXVar) && numberOfXVar() > minimumNumberOfXVar())
    {
      xVar.remove(aXVar);
      setY0_1__m_n(aXVar,null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToOptionalOne */
  public boolean setXVar(X0_1__m_n... newXVar)
  {
    boolean wasSet = false;
    if (newXVar.length < minimumNumberOfXVar() || newXVar.length > maximumNumberOfXVar())
    {
      return wasSet;
    }

    ArrayList<X0_1__m_n> checkNewXVar = new ArrayList<X0_1__m_n>();
    HashMap<Y0_1__m_n,Integer> y0_1__m_nToNewXVar = new HashMap<Y0_1__m_n,Integer>();
    for (X0_1__m_n aXVar : newXVar)
    {
      if (checkNewXVar.contains(aXVar))
      {
        return wasSet;
      }
      else if (aXVar.getY0_1__m_n() != null && !this.equals(aXVar.getY0_1__m_n()))
      {
        Y0_1__m_n existingY0_1__m_n = aXVar.getY0_1__m_n();
        if (!y0_1__m_nToNewXVar.containsKey(existingY0_1__m_n))
        {
          y0_1__m_nToNewXVar.put(existingY0_1__m_n, Integer.valueOf(existingY0_1__m_n.numberOfXVar()));
        }
        Integer currentCount = y0_1__m_nToNewXVar.get(existingY0_1__m_n);
        int nextCount = currentCount - 1;
        if (nextCount < 2)
        {
          return wasSet;
        }
        y0_1__m_nToNewXVar.put(existingY0_1__m_n, Integer.valueOf(nextCount));
      }
      checkNewXVar.add(aXVar);
    }

    xVar.removeAll(checkNewXVar);

    for (X0_1__m_n orphan : xVar)
    {
      setY0_1__m_n(orphan, null);
    }
    xVar.clear();
    for (X0_1__m_n aXVar : newXVar)
    {
      if (aXVar.getY0_1__m_n() != null)
      {
        aXVar.getY0_1__m_n().xVar.remove(aXVar);
      }
      setY0_1__m_n(aXVar, this);
      xVar.add(aXVar);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setY0_1__m_n(X0_1__m_n aXVar, Y0_1__m_n aY0_1__m_n)
  {
    try
    {
      java.lang.reflect.Field mentorField = aXVar.getClass().getDeclaredField("y0_1__m_n");
      mentorField.setAccessible(true);
      mentorField.set(aXVar, aY0_1__m_n);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aY0_1__m_n to aXVar", e);
    }
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addXVarAt(X0_1__m_n aXVar, int index)
  {  
    boolean wasAdded = false;
    if(addXVar(aXVar))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfXVar()) { index = numberOfXVar() - 1; }
      xVar.remove(aXVar);
      xVar.add(index, aXVar);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveXVarAt(X0_1__m_n aXVar, int index)
  {
    boolean wasAdded = false;
    if(xVar.contains(aXVar))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfXVar()) { index = numberOfXVar() - 1; }
      xVar.remove(aXVar);
      xVar.add(index, aXVar);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addXVarAt(aXVar, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(X0_1__m_n aXVar : xVar)
    {
      setY0_1__m_n(aXVar,null);
    }
    xVar.clear();
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]";
  }
}