/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 142 "../../../../src/TestHarnessCompositionsRight.ump"
public class YR_M_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_M_star Attributes
  private int v;

  //YR_M_star Associations
  private List<Z_M_star> zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YR_M_star()
  {
    v = 1;
    zVar = new ArrayList<Z_M_star>();
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
  public Z_M_star getZVar(int index)
  {
    Z_M_star aZVar = zVar.get(index);
    return aZVar;
  }

  public List<Z_M_star> getZVar()
  {
    List<Z_M_star> newZVar = Collections.unmodifiableList(zVar);
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

  public int indexOfZVar(Z_M_star aZVar)
  {
    int index = zVar.indexOf(aZVar);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfZVar()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addZVar(Z_M_star aZVar)
  {
    boolean wasAdded = false;
    if (zVar.contains(aZVar)) { return false; }
    zVar.add(aZVar);
    if (aZVar.indexOfY_m_star(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aZVar.addY_m_star(this);
      if (!wasAdded)
      {
        zVar.remove(aZVar);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeZVar(Z_M_star aZVar)
  {
    boolean wasRemoved = false;
    if (!zVar.contains(aZVar))
    {
      return wasRemoved;
    }

    int oldIndex = zVar.indexOf(aZVar);
    zVar.remove(oldIndex);
    if (aZVar.indexOfY_m_star(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aZVar.removeY_m_star(this);
      if (!wasRemoved)
      {
        zVar.add(oldIndex,aZVar);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addZVarAt(Z_M_star aZVar, int index)
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

  public boolean addOrMoveZVarAt(Z_M_star aZVar, int index)
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
      Z_M_star aZVar = zVar.get(zVar.size() - 1);
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