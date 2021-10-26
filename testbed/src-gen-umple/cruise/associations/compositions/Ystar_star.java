/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 152 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Ystar_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ystar_star Attributes
  private int v;

  //Ystar_star Associations
  private List<Xstar_star> xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ystar_star()
  {
    v = 1;
    xVar = new ArrayList<Xstar_star>();
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
  public Xstar_star getXVar(int index)
  {
    Xstar_star aXVar = xVar.get(index);
    return aXVar;
  }

  public List<Xstar_star> getXVar()
  {
    List<Xstar_star> newXVar = Collections.unmodifiableList(xVar);
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

  public int indexOfXVar(Xstar_star aXVar)
  {
    int index = xVar.indexOf(aXVar);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfXVar()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addXVar(Xstar_star aXVar)
  {
    boolean wasAdded = false;
    if (xVar.contains(aXVar)) { return false; }
    xVar.add(aXVar);
    if (aXVar.indexOfYstar_star(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aXVar.addYstar_star(this);
      if (!wasAdded)
      {
        xVar.remove(aXVar);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeXVar(Xstar_star aXVar)
  {
    boolean wasRemoved = false;
    if (!xVar.contains(aXVar))
    {
      return wasRemoved;
    }

    int oldIndex = xVar.indexOf(aXVar);
    xVar.remove(oldIndex);
    if (aXVar.indexOfYstar_star(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aXVar.removeYstar_star(this);
      if (!wasRemoved)
      {
        xVar.add(oldIndex,aXVar);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addXVarAt(Xstar_star aXVar, int index)
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

  public boolean addOrMoveXVarAt(Xstar_star aXVar, int index)
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
    ArrayList<Xstar_star> copyOfXVar = new ArrayList<Xstar_star>(xVar);
    xVar.clear();
    for(Xstar_star aXVar : copyOfXVar)
    {
      aXVar.removeYstar_star(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]";
  }
}