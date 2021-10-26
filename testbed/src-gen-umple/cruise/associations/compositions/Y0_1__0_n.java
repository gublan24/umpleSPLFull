/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 237 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Y0_1__0_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y0_1__0_n Attributes
  private int v;

  //Y0_1__0_n Associations
  private List<X0_1__0_n> xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Y0_1__0_n()
  {
    v = 1;
    xVar = new ArrayList<X0_1__0_n>();
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
  public X0_1__0_n getXVar(int index)
  {
    X0_1__0_n aXVar = xVar.get(index);
    return aXVar;
  }

  public List<X0_1__0_n> getXVar()
  {
    List<X0_1__0_n> newXVar = Collections.unmodifiableList(xVar);
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

  public int indexOfXVar(X0_1__0_n aXVar)
  {
    int index = xVar.indexOf(aXVar);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfXVar()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfXVar()
  {
    return 3;
  }
  /* Code from template association_AddOptionalNToOptionalOne */
  public boolean addXVar(X0_1__0_n aXVar)
  {
    boolean wasAdded = false;
    if (xVar.contains(aXVar)) { return false; }
    if (numberOfXVar() >= maximumNumberOfXVar())
    {
      return wasAdded;
    }

    Y0_1__0_n existingY0_1__0_n = aXVar.getY0_1__0_n();
    if (existingY0_1__0_n == null)
    {
      aXVar.setY0_1__0_n(this);
    }
    else if (!this.equals(existingY0_1__0_n))
    {
      existingY0_1__0_n.removeXVar(aXVar);
      addXVar(aXVar);
    }
    else
    {
      xVar.add(aXVar);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeXVar(X0_1__0_n aXVar)
  {
    boolean wasRemoved = false;
    if (xVar.contains(aXVar))
    {
      xVar.remove(aXVar);
      aXVar.setY0_1__0_n(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addXVarAt(X0_1__0_n aXVar, int index)
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

  public boolean addOrMoveXVarAt(X0_1__0_n aXVar, int index)
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
    while( !xVar.isEmpty() )
    {
      X0_1__0_n aXVar = xVar.get(0);
      aXVar.setY0_1__0_n(null);
      xVar.remove(aXVar);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]";
  }
}