/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 66 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_0_n__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_n__star Attributes
  private int num;

  //Z_0_n__star Associations
  private List<YR_0_n__star> y_0_n__star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_0_n__star(int aNum)
  {
    num = aNum;
    y_0_n__star = new ArrayList<YR_0_n__star>();
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
  public YR_0_n__star getY_0_n__star(int index)
  {
    YR_0_n__star aY_0_n__star = y_0_n__star.get(index);
    return aY_0_n__star;
  }

  public List<YR_0_n__star> getY_0_n__star()
  {
    List<YR_0_n__star> newY_0_n__star = Collections.unmodifiableList(y_0_n__star);
    return newY_0_n__star;
  }

  public int numberOfY_0_n__star()
  {
    int number = y_0_n__star.size();
    return number;
  }

  public boolean hasY_0_n__star()
  {
    boolean has = y_0_n__star.size() > 0;
    return has;
  }

  public int indexOfY_0_n__star(YR_0_n__star aY_0_n__star)
  {
    int index = y_0_n__star.indexOf(aY_0_n__star);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY_0_n__star()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY_0_n__star()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY_0_n__star(YR_0_n__star aY_0_n__star)
  {
    boolean wasAdded = false;
    if (y_0_n__star.contains(aY_0_n__star)) { return false; }
    if (numberOfY_0_n__star() >= maximumNumberOfY_0_n__star())
    {
      return wasAdded;
    }

    y_0_n__star.add(aY_0_n__star);
    if (aY_0_n__star.indexOfZVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY_0_n__star.addZVar(this);
      if (!wasAdded)
      {
        y_0_n__star.remove(aY_0_n__star);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeY_0_n__star(YR_0_n__star aY_0_n__star)
  {
    boolean wasRemoved = false;
    if (!y_0_n__star.contains(aY_0_n__star))
    {
      return wasRemoved;
    }

    int oldIndex = y_0_n__star.indexOf(aY_0_n__star);
    y_0_n__star.remove(oldIndex);
    if (aY_0_n__star.indexOfZVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY_0_n__star.removeZVar(this);
      if (!wasRemoved)
      {
        y_0_n__star.add(oldIndex,aY_0_n__star);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetOptionalNToMany */
  public boolean setY_0_n__star(YR_0_n__star... newY_0_n__star)
  {
    boolean wasSet = false;
    ArrayList<YR_0_n__star> verifiedY_0_n__star = new ArrayList<YR_0_n__star>();
    for (YR_0_n__star aY_0_n__star : newY_0_n__star)
    {
      if (verifiedY_0_n__star.contains(aY_0_n__star))
      {
        continue;
      }
      verifiedY_0_n__star.add(aY_0_n__star);
    }

    if (verifiedY_0_n__star.size() != newY_0_n__star.length || verifiedY_0_n__star.size() > maximumNumberOfY_0_n__star())
    {
      return wasSet;
    }

    ArrayList<YR_0_n__star> oldY_0_n__star = new ArrayList<YR_0_n__star>(y_0_n__star);
    y_0_n__star.clear();
    for (YR_0_n__star aNewY_0_n__star : verifiedY_0_n__star)
    {
      y_0_n__star.add(aNewY_0_n__star);
      if (oldY_0_n__star.contains(aNewY_0_n__star))
      {
        oldY_0_n__star.remove(aNewY_0_n__star);
      }
      else
      {
        aNewY_0_n__star.addZVar(this);
      }
    }

    for (YR_0_n__star anOldY_0_n__star : oldY_0_n__star)
    {
      anOldY_0_n__star.removeZVar(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addY_0_n__starAt(YR_0_n__star aY_0_n__star, int index)
  {  
    boolean wasAdded = false;
    if(addY_0_n__star(aY_0_n__star))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_0_n__star()) { index = numberOfY_0_n__star() - 1; }
      y_0_n__star.remove(aY_0_n__star);
      y_0_n__star.add(index, aY_0_n__star);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveY_0_n__starAt(YR_0_n__star aY_0_n__star, int index)
  {
    boolean wasAdded = false;
    if(y_0_n__star.contains(aY_0_n__star))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_0_n__star()) { index = numberOfY_0_n__star() - 1; }
      y_0_n__star.remove(aY_0_n__star);
      y_0_n__star.add(index, aY_0_n__star);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addY_0_n__starAt(aY_0_n__star, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<YR_0_n__star> copyOfY_0_n__star = new ArrayList<YR_0_n__star>(y_0_n__star);
    y_0_n__star.clear();
    for(YR_0_n__star aY_0_n__star : copyOfY_0_n__star)
    {
      aY_0_n__star.removeZVar(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}