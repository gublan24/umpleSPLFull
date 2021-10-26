/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 172 "../../../../src/TestHarnessCompositionsRight.ump"
public class YR_m_n__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_m_n__m_n Attributes
  private int v;

  //YR_m_n__m_n Associations
  private List<Z_m_n__m_n> zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YR_m_n__m_n()
  {
    v = 1;
    zVar = new ArrayList<Z_m_n__m_n>();
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
  public Z_m_n__m_n getZVar(int index)
  {
    Z_m_n__m_n aZVar = zVar.get(index);
    return aZVar;
  }

  public List<Z_m_n__m_n> getZVar()
  {
    List<Z_m_n__m_n> newZVar = Collections.unmodifiableList(zVar);
    return newZVar;
  }

  public int numberOfZVar()
  {
    int number = zVar.size();
    return number;
  }

  public boolean hasZVar()
  {
    boolean has = zVar.size() > 0;
    return has;
  }

  public int indexOfZVar(Z_m_n__m_n aZVar)
  {
    int index = zVar.indexOf(aZVar);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfZVarValid()
  {
    boolean isValid = numberOfZVar() >= minimumNumberOfZVar() && numberOfZVar() <= maximumNumberOfZVar();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfZVar()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfZVar()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addZVar(Z_m_n__m_n aZVar)
  {
    boolean wasAdded = false;
    if (zVar.contains(aZVar)) { return false; }
    if (numberOfZVar() >= maximumNumberOfZVar())
    {
      return wasAdded;
    }

    zVar.add(aZVar);
    if (aZVar.indexOfY_m_n__m_n(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aZVar.addY_m_n__m_n(this);
      if (!wasAdded)
      {
        zVar.remove(aZVar);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeZVar(Z_m_n__m_n aZVar)
  {
    boolean wasRemoved = false;
    if (!zVar.contains(aZVar))
    {
      return wasRemoved;
    }

    if (numberOfZVar() <= minimumNumberOfZVar())
    {
      return wasRemoved;
    }

    int oldIndex = zVar.indexOf(aZVar);
    zVar.remove(oldIndex);
    if (aZVar.indexOfY_m_n__m_n(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aZVar.removeY_m_n__m_n(this);
      if (!wasRemoved)
      {
        zVar.add(oldIndex,aZVar);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setZVar(Z_m_n__m_n... newZVar)
  {
    boolean wasSet = false;
    ArrayList<Z_m_n__m_n> verifiedZVar = new ArrayList<Z_m_n__m_n>();
    for (Z_m_n__m_n aZVar : newZVar)
    {
      if (verifiedZVar.contains(aZVar))
      {
        continue;
      }
      verifiedZVar.add(aZVar);
    }

    if (verifiedZVar.size() != newZVar.length || verifiedZVar.size() < minimumNumberOfZVar() || verifiedZVar.size() > maximumNumberOfZVar())
    {
      return wasSet;
    }

    ArrayList<Z_m_n__m_n> oldZVar = new ArrayList<Z_m_n__m_n>(zVar);
    zVar.clear();
    for (Z_m_n__m_n aNewZVar : verifiedZVar)
    {
      zVar.add(aNewZVar);
      if (oldZVar.contains(aNewZVar))
      {
        oldZVar.remove(aNewZVar);
      }
      else
      {
        aNewZVar.addY_m_n__m_n(this);
      }
    }

    for (Z_m_n__m_n anOldZVar : oldZVar)
    {
      anOldZVar.removeY_m_n__m_n(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addZVarAt(Z_m_n__m_n aZVar, int index)
  {  
    boolean wasAdded = false;
    if(addZVar(aZVar))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfZVar()) { index = numberOfZVar() - 1; }
      zVar.remove(aZVar);
      zVar.add(index, aZVar);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveZVarAt(Z_m_n__m_n aZVar, int index)
  {
    boolean wasAdded = false;
    if(zVar.contains(aZVar))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfZVar()) { index = numberOfZVar() - 1; }
      zVar.remove(aZVar);
      zVar.add(index, aZVar);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addZVarAt(aZVar, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (zVar.size() > 0)
    {
      Z_m_n__m_n aZVar = zVar.get(zVar.size() - 1);
      aZVar.delete();
      zVar.remove(aZVar);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]";
  }
}