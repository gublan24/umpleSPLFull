/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 69 "../../../../src/TestHarnessCompositionsLeft.ump"
public class X0_n__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_n__star Attributes
  private int num;

  //X0_n__star Associations
  private List<Y0_n__star> y0_n__star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X0_n__star(int aNum)
  {
    num = aNum;
    y0_n__star = new ArrayList<Y0_n__star>();
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
  public Y0_n__star getY0_n__star(int index)
  {
    Y0_n__star aY0_n__star = y0_n__star.get(index);
    return aY0_n__star;
  }

  public List<Y0_n__star> getY0_n__star()
  {
    List<Y0_n__star> newY0_n__star = Collections.unmodifiableList(y0_n__star);
    return newY0_n__star;
  }

  public int numberOfY0_n__star()
  {
    int number = y0_n__star.size();
    return number;
  }

  public boolean hasY0_n__star()
  {
    boolean has = y0_n__star.size() > 0;
    return has;
  }

  public int indexOfY0_n__star(Y0_n__star aY0_n__star)
  {
    int index = y0_n__star.indexOf(aY0_n__star);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY0_n__star()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY0_n__star()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY0_n__star(Y0_n__star aY0_n__star)
  {
    boolean wasAdded = false;
    if (y0_n__star.contains(aY0_n__star)) { return false; }
    if (numberOfY0_n__star() >= maximumNumberOfY0_n__star())
    {
      return wasAdded;
    }

    y0_n__star.add(aY0_n__star);
    if (aY0_n__star.indexOfXVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY0_n__star.addXVar(this);
      if (!wasAdded)
      {
        y0_n__star.remove(aY0_n__star);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeY0_n__star(Y0_n__star aY0_n__star)
  {
    boolean wasRemoved = false;
    if (!y0_n__star.contains(aY0_n__star))
    {
      return wasRemoved;
    }

    int oldIndex = y0_n__star.indexOf(aY0_n__star);
    y0_n__star.remove(oldIndex);
    if (aY0_n__star.indexOfXVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY0_n__star.removeXVar(this);
      if (!wasRemoved)
      {
        y0_n__star.add(oldIndex,aY0_n__star);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetOptionalNToMany */
  public boolean setY0_n__star(Y0_n__star... newY0_n__star)
  {
    boolean wasSet = false;
    ArrayList<Y0_n__star> verifiedY0_n__star = new ArrayList<Y0_n__star>();
    for (Y0_n__star aY0_n__star : newY0_n__star)
    {
      if (verifiedY0_n__star.contains(aY0_n__star))
      {
        continue;
      }
      verifiedY0_n__star.add(aY0_n__star);
    }

    if (verifiedY0_n__star.size() != newY0_n__star.length || verifiedY0_n__star.size() > maximumNumberOfY0_n__star())
    {
      return wasSet;
    }

    ArrayList<Y0_n__star> oldY0_n__star = new ArrayList<Y0_n__star>(y0_n__star);
    y0_n__star.clear();
    for (Y0_n__star aNewY0_n__star : verifiedY0_n__star)
    {
      y0_n__star.add(aNewY0_n__star);
      if (oldY0_n__star.contains(aNewY0_n__star))
      {
        oldY0_n__star.remove(aNewY0_n__star);
      }
      else
      {
        aNewY0_n__star.addXVar(this);
      }
    }

    for (Y0_n__star anOldY0_n__star : oldY0_n__star)
    {
      anOldY0_n__star.removeXVar(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addY0_n__starAt(Y0_n__star aY0_n__star, int index)
  {  
    boolean wasAdded = false;
    if(addY0_n__star(aY0_n__star))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY0_n__star()) { index = numberOfY0_n__star() - 1; }
      y0_n__star.remove(aY0_n__star);
      y0_n__star.add(index, aY0_n__star);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveY0_n__starAt(Y0_n__star aY0_n__star, int index)
  {
    boolean wasAdded = false;
    if(y0_n__star.contains(aY0_n__star))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY0_n__star()) { index = numberOfY0_n__star() - 1; }
      y0_n__star.remove(aY0_n__star);
      y0_n__star.add(index, aY0_n__star);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addY0_n__starAt(aY0_n__star, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (y0_n__star.size() > 0)
    {
      Y0_n__star aY0_n__star = y0_n__star.get(y0_n__star.size() - 1);
      aY0_n__star.delete();
      y0_n__star.remove(aY0_n__star);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}