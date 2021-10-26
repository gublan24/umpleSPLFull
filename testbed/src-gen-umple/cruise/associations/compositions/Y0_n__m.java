/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 189 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Y0_n__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y0_n__m Attributes
  private int v;

  //Y0_n__m Associations
  private List<X0_n__m> xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Y0_n__m()
  {
    v = 1;
    xVar = new ArrayList<X0_n__m>();
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
  public X0_n__m getXVar(int index)
  {
    X0_n__m aXVar = xVar.get(index);
    return aXVar;
  }

  public List<X0_n__m> getXVar()
  {
    List<X0_n__m> newXVar = Collections.unmodifiableList(xVar);
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

  public int indexOfXVar(X0_n__m aXVar)
  {
    int index = xVar.indexOf(aXVar);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfXVarValid()
  {
    boolean isValid = numberOfXVar() >= minimumNumberOfXVar() && numberOfXVar() <= maximumNumberOfXVar();
    return isValid;
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
  /* Code from template association_AddManyToManyMethod */
  public boolean addXVar(X0_n__m aXVar)
  {
    boolean wasAdded = false;
    if (xVar.contains(aXVar)) { return false; }
    if (numberOfXVar() >= maximumNumberOfXVar())
    {
      return wasAdded;
    }

    xVar.add(aXVar);
    if (aXVar.indexOfY0_n__m(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aXVar.addY0_n__m(this);
      if (!wasAdded)
      {
        xVar.remove(aXVar);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeXVar(X0_n__m aXVar)
  {
    boolean wasRemoved = false;
    if (!xVar.contains(aXVar))
    {
      return wasRemoved;
    }

    if (numberOfXVar() <= minimumNumberOfXVar())
    {
      return wasRemoved;
    }

    int oldIndex = xVar.indexOf(aXVar);
    xVar.remove(oldIndex);
    if (aXVar.indexOfY0_n__m(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aXVar.removeY0_n__m(this);
      if (!wasRemoved)
      {
        xVar.add(oldIndex,aXVar);
      }
    }
    return wasRemoved;
  }

  public void delete()
  {
    ArrayList<X0_n__m> copyOfXVar = new ArrayList<X0_n__m>(xVar);
    xVar.clear();
    for(X0_n__m aXVar : copyOfXVar)
    {
      aXVar.removeY0_n__m(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]";
  }
}