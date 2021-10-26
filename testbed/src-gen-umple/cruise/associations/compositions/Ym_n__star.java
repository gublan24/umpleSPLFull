/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 170 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Ym_n__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ym_n__star Attributes
  private int v;

  //Ym_n__star Associations
  private List<Xm_n__star> xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ym_n__star()
  {
    v = 1;
    xVar = new ArrayList<Xm_n__star>();
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
  public Xm_n__star getXVar(int index)
  {
    Xm_n__star aXVar = xVar.get(index);
    return aXVar;
  }

  public List<Xm_n__star> getXVar()
  {
    List<Xm_n__star> newXVar = Collections.unmodifiableList(xVar);
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

  public int indexOfXVar(Xm_n__star aXVar)
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
  public boolean addXVar(Xm_n__star aXVar)
  {
    boolean wasAdded = false;
    if (xVar.contains(aXVar)) { return false; }
    xVar.add(aXVar);
    if (aXVar.indexOfYm_n__star(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aXVar.addYm_n__star(this);
      if (!wasAdded)
      {
        xVar.remove(aXVar);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeXVar(Xm_n__star aXVar)
  {
    boolean wasRemoved = false;
    if (!xVar.contains(aXVar))
    {
      return wasRemoved;
    }

    int oldIndex = xVar.indexOf(aXVar);
    xVar.remove(oldIndex);
    if (aXVar.indexOfYm_n__star(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aXVar.removeYm_n__star(this);
      if (!wasRemoved)
      {
        xVar.add(oldIndex,aXVar);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addXVarAt(Xm_n__star aXVar, int index)
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

  public boolean addOrMoveXVarAt(Xm_n__star aXVar, int index)
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
    ArrayList<Xm_n__star> copyOfXVar = new ArrayList<Xm_n__star>(xVar);
    xVar.clear();
    for(Xm_n__star aXVar : copyOfXVar)
    {
      if (aXVar.numberOfYm_n__star() <= Xm_n__star.minimumNumberOfYm_n__star())
      {
        aXVar.delete();
      }
      else
      {
        aXVar.removeYm_n__star(this);
      }
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]";
  }
}