/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 177 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Ym_n__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ym_n__m_n Attributes
  private int v;

  //Ym_n__m_n Associations
  private List<Xm_n__m_n> xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ym_n__m_n()
  {
    v = 1;
    xVar = new ArrayList<Xm_n__m_n>();
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
  public Xm_n__m_n getXVar(int index)
  {
    Xm_n__m_n aXVar = xVar.get(index);
    return aXVar;
  }

  public List<Xm_n__m_n> getXVar()
  {
    List<Xm_n__m_n> newXVar = Collections.unmodifiableList(xVar);
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

  public int indexOfXVar(Xm_n__m_n aXVar)
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
  /* Code from template association_AddManyToManyMethod */
  public boolean addXVar(Xm_n__m_n aXVar)
  {
    boolean wasAdded = false;
    if (xVar.contains(aXVar)) { return false; }
    if (numberOfXVar() >= maximumNumberOfXVar())
    {
      return wasAdded;
    }

    xVar.add(aXVar);
    if (aXVar.indexOfYm_n__m_n(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aXVar.addYm_n__m_n(this);
      if (!wasAdded)
      {
        xVar.remove(aXVar);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeXVar(Xm_n__m_n aXVar)
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
    if (aXVar.indexOfYm_n__m_n(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aXVar.removeYm_n__m_n(this);
      if (!wasRemoved)
      {
        xVar.add(oldIndex,aXVar);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setXVar(Xm_n__m_n... newXVar)
  {
    boolean wasSet = false;
    ArrayList<Xm_n__m_n> verifiedXVar = new ArrayList<Xm_n__m_n>();
    for (Xm_n__m_n aXVar : newXVar)
    {
      if (verifiedXVar.contains(aXVar))
      {
        continue;
      }
      verifiedXVar.add(aXVar);
    }

    if (verifiedXVar.size() != newXVar.length || verifiedXVar.size() < minimumNumberOfXVar() || verifiedXVar.size() > maximumNumberOfXVar())
    {
      return wasSet;
    }

    ArrayList<Xm_n__m_n> oldXVar = new ArrayList<Xm_n__m_n>(xVar);
    xVar.clear();
    for (Xm_n__m_n aNewXVar : verifiedXVar)
    {
      xVar.add(aNewXVar);
      if (oldXVar.contains(aNewXVar))
      {
        oldXVar.remove(aNewXVar);
      }
      else
      {
        aNewXVar.addYm_n__m_n(this);
      }
    }

    for (Xm_n__m_n anOldXVar : oldXVar)
    {
      anOldXVar.removeYm_n__m_n(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addXVarAt(Xm_n__m_n aXVar, int index)
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

  public boolean addOrMoveXVarAt(Xm_n__m_n aXVar, int index)
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
    ArrayList<Xm_n__m_n> copyOfXVar = new ArrayList<Xm_n__m_n>(xVar);
    xVar.clear();
    for(Xm_n__m_n aXVar : copyOfXVar)
    {
      if (aXVar.numberOfYm_n__m_n() <= Xm_n__m_n.minimumNumberOfYm_n__m_n())
      {
        aXVar.delete();
      }
      else
      {
        aXVar.removeYm_n__m_n(this);
      }
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]";
  }
}