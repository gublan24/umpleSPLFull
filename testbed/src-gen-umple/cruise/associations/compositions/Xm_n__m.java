/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 43 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Xm_n__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xm_n__m Attributes
  private int num;

  //Xm_n__m Associations
  private List<Ym_n__m> ym_n__m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Xm_n__m(int aNum)
  {
    num = aNum;
    ym_n__m = new ArrayList<Ym_n__m>();
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
  public Ym_n__m getYm_n__m(int index)
  {
    Ym_n__m aYm_n__m = ym_n__m.get(index);
    return aYm_n__m;
  }

  public List<Ym_n__m> getYm_n__m()
  {
    List<Ym_n__m> newYm_n__m = Collections.unmodifiableList(ym_n__m);
    return newYm_n__m;
  }

  public int numberOfYm_n__m()
  {
    int number = ym_n__m.size();
    return number;
  }

  public boolean hasYm_n__m()
  {
    boolean has = ym_n__m.size() > 0;
    return has;
  }

  public int indexOfYm_n__m(Ym_n__m aYm_n__m)
  {
    int index = ym_n__m.indexOf(aYm_n__m);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfYm_n__mValid()
  {
    boolean isValid = numberOfYm_n__m() >= minimumNumberOfYm_n__m() && numberOfYm_n__m() <= maximumNumberOfYm_n__m();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfYm_n__m()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfYm_n__m()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addYm_n__m(Ym_n__m aYm_n__m)
  {
    boolean wasAdded = false;
    if (ym_n__m.contains(aYm_n__m)) { return false; }
    if (numberOfYm_n__m() >= maximumNumberOfYm_n__m())
    {
      return wasAdded;
    }

    ym_n__m.add(aYm_n__m);
    if (aYm_n__m.indexOfXVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aYm_n__m.addXVar(this);
      if (!wasAdded)
      {
        ym_n__m.remove(aYm_n__m);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeYm_n__m(Ym_n__m aYm_n__m)
  {
    boolean wasRemoved = false;
    if (!ym_n__m.contains(aYm_n__m))
    {
      return wasRemoved;
    }

    if (numberOfYm_n__m() <= minimumNumberOfYm_n__m())
    {
      return wasRemoved;
    }

    int oldIndex = ym_n__m.indexOf(aYm_n__m);
    ym_n__m.remove(oldIndex);
    if (aYm_n__m.indexOfXVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aYm_n__m.removeXVar(this);
      if (!wasRemoved)
      {
        ym_n__m.add(oldIndex,aYm_n__m);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setYm_n__m(Ym_n__m... newYm_n__m)
  {
    boolean wasSet = false;
    ArrayList<Ym_n__m> verifiedYm_n__m = new ArrayList<Ym_n__m>();
    for (Ym_n__m aYm_n__m : newYm_n__m)
    {
      if (verifiedYm_n__m.contains(aYm_n__m))
      {
        continue;
      }
      verifiedYm_n__m.add(aYm_n__m);
    }

    if (verifiedYm_n__m.size() != newYm_n__m.length || verifiedYm_n__m.size() < minimumNumberOfYm_n__m() || verifiedYm_n__m.size() > maximumNumberOfYm_n__m())
    {
      return wasSet;
    }

    ArrayList<Ym_n__m> oldYm_n__m = new ArrayList<Ym_n__m>(ym_n__m);
    ym_n__m.clear();
    for (Ym_n__m aNewYm_n__m : verifiedYm_n__m)
    {
      ym_n__m.add(aNewYm_n__m);
      if (oldYm_n__m.contains(aNewYm_n__m))
      {
        oldYm_n__m.remove(aNewYm_n__m);
      }
      else
      {
        aNewYm_n__m.addXVar(this);
      }
    }

    for (Ym_n__m anOldYm_n__m : oldYm_n__m)
    {
      anOldYm_n__m.removeXVar(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addYm_n__mAt(Ym_n__m aYm_n__m, int index)
  {  
    boolean wasAdded = false;
    if(addYm_n__m(aYm_n__m))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfYm_n__m()) { index = numberOfYm_n__m() - 1; }
      ym_n__m.remove(aYm_n__m);
      ym_n__m.add(index, aYm_n__m);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveYm_n__mAt(Ym_n__m aYm_n__m, int index)
  {
    boolean wasAdded = false;
    if(ym_n__m.contains(aYm_n__m))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfYm_n__m()) { index = numberOfYm_n__m() - 1; }
      ym_n__m.remove(aYm_n__m);
      ym_n__m.add(index, aYm_n__m);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addYm_n__mAt(aYm_n__m, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (ym_n__m.size() > 0)
    {
      Ym_n__m aYm_n__m = ym_n__m.get(ym_n__m.size() - 1);
      aYm_n__m.delete();
      ym_n__m.remove(aYm_n__m);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}