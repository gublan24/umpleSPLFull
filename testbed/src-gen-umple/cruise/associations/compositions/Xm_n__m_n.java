/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 54 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Xm_n__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xm_n__m_n Attributes
  private int num;

  //Xm_n__m_n Associations
  private List<Ym_n__m_n> ym_n__m_n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Xm_n__m_n(int aNum)
  {
    num = aNum;
    ym_n__m_n = new ArrayList<Ym_n__m_n>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNum(int aNum)
  {
    boolean wasSet = false;
    num = aNum;
    wasSet = true;
    return wasSet;
  }

  public int getNum()
  {
    return num;
  }
  /* Code from template association_GetMany */
  public Ym_n__m_n getYm_n__m_n(int index)
  {
    Ym_n__m_n aYm_n__m_n = ym_n__m_n.get(index);
    return aYm_n__m_n;
  }

  public List<Ym_n__m_n> getYm_n__m_n()
  {
    List<Ym_n__m_n> newYm_n__m_n = Collections.unmodifiableList(ym_n__m_n);
    return newYm_n__m_n;
  }

  public int numberOfYm_n__m_n()
  {
    int number = ym_n__m_n.size();
    return number;
  }

  public boolean hasYm_n__m_n()
  {
    boolean has = ym_n__m_n.size() > 0;
    return has;
  }

  public int indexOfYm_n__m_n(Ym_n__m_n aYm_n__m_n)
  {
    int index = ym_n__m_n.indexOf(aYm_n__m_n);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfYm_n__m_nValid()
  {
    boolean isValid = numberOfYm_n__m_n() >= minimumNumberOfYm_n__m_n() && numberOfYm_n__m_n() <= maximumNumberOfYm_n__m_n();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfYm_n__m_n()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfYm_n__m_n()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addYm_n__m_n(Ym_n__m_n aYm_n__m_n)
  {
    boolean wasAdded = false;
    if (ym_n__m_n.contains(aYm_n__m_n)) { return false; }
    if (numberOfYm_n__m_n() >= maximumNumberOfYm_n__m_n())
    {
      return wasAdded;
    }

    ym_n__m_n.add(aYm_n__m_n);
    if (aYm_n__m_n.indexOfXVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aYm_n__m_n.addXVar(this);
      if (!wasAdded)
      {
        ym_n__m_n.remove(aYm_n__m_n);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeYm_n__m_n(Ym_n__m_n aYm_n__m_n)
  {
    boolean wasRemoved = false;
    if (!ym_n__m_n.contains(aYm_n__m_n))
    {
      return wasRemoved;
    }

    if (numberOfYm_n__m_n() <= minimumNumberOfYm_n__m_n())
    {
      return wasRemoved;
    }

    int oldIndex = ym_n__m_n.indexOf(aYm_n__m_n);
    ym_n__m_n.remove(oldIndex);
    if (aYm_n__m_n.indexOfXVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aYm_n__m_n.removeXVar(this);
      if (!wasRemoved)
      {
        ym_n__m_n.add(oldIndex,aYm_n__m_n);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setYm_n__m_n(Ym_n__m_n... newYm_n__m_n)
  {
    boolean wasSet = false;
    ArrayList<Ym_n__m_n> verifiedYm_n__m_n = new ArrayList<Ym_n__m_n>();
    for (Ym_n__m_n aYm_n__m_n : newYm_n__m_n)
    {
      if (verifiedYm_n__m_n.contains(aYm_n__m_n))
      {
        continue;
      }
      verifiedYm_n__m_n.add(aYm_n__m_n);
    }

    if (verifiedYm_n__m_n.size() != newYm_n__m_n.length || verifiedYm_n__m_n.size() < minimumNumberOfYm_n__m_n() || verifiedYm_n__m_n.size() > maximumNumberOfYm_n__m_n())
    {
      return wasSet;
    }

    ArrayList<Ym_n__m_n> oldYm_n__m_n = new ArrayList<Ym_n__m_n>(ym_n__m_n);
    ym_n__m_n.clear();
    for (Ym_n__m_n aNewYm_n__m_n : verifiedYm_n__m_n)
    {
      ym_n__m_n.add(aNewYm_n__m_n);
      if (oldYm_n__m_n.contains(aNewYm_n__m_n))
      {
        oldYm_n__m_n.remove(aNewYm_n__m_n);
      }
      else
      {
        aNewYm_n__m_n.addXVar(this);
      }
    }

    for (Ym_n__m_n anOldYm_n__m_n : oldYm_n__m_n)
    {
      anOldYm_n__m_n.removeXVar(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addYm_n__m_nAt(Ym_n__m_n aYm_n__m_n, int index)
  {  
    boolean wasAdded = false;
    if(addYm_n__m_n(aYm_n__m_n))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfYm_n__m_n()) { index = numberOfYm_n__m_n() - 1; }
      ym_n__m_n.remove(aYm_n__m_n);
      ym_n__m_n.add(index, aYm_n__m_n);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveYm_n__m_nAt(Ym_n__m_n aYm_n__m_n, int index)
  {
    boolean wasAdded = false;
    if(ym_n__m_n.contains(aYm_n__m_n))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfYm_n__m_n()) { index = numberOfYm_n__m_n() - 1; }
      ym_n__m_n.remove(aYm_n__m_n);
      ym_n__m_n.add(index, aYm_n__m_n);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addYm_n__m_nAt(aYm_n__m_n, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (ym_n__m_n.size() > 0)
    {
      Ym_n__m_n aYm_n__m_n = ym_n__m_n.get(ym_n__m_n.size() - 1);
      aYm_n__m_n.delete();
      ym_n__m_n.remove(aYm_n__m_n);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}