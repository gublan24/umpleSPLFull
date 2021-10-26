/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 31 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_star_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_star_star Attributes
  private int num;

  //Z_star_star Associations
  private List<YR_star_star> y_star_star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_star_star(int aNum)
  {
    num = aNum;
    y_star_star = new ArrayList<YR_star_star>();
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
  public YR_star_star getY_star_star(int index)
  {
    YR_star_star aY_star_star = y_star_star.get(index);
    return aY_star_star;
  }

  public List<YR_star_star> getY_star_star()
  {
    List<YR_star_star> newY_star_star = Collections.unmodifiableList(y_star_star);
    return newY_star_star;
  }

  public int numberOfY_star_star()
  {
    int number = y_star_star.size();
    return number;
  }

  public boolean hasY_star_star()
  {
    boolean has = y_star_star.size() > 0;
    return has;
  }

  public int indexOfY_star_star(YR_star_star aY_star_star)
  {
    int index = y_star_star.indexOf(aY_star_star);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY_star_star()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY_star_star(YR_star_star aY_star_star)
  {
    boolean wasAdded = false;
    if (y_star_star.contains(aY_star_star)) { return false; }
    y_star_star.add(aY_star_star);
    if (aY_star_star.indexOfZVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY_star_star.addZVar(this);
      if (!wasAdded)
      {
        y_star_star.remove(aY_star_star);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeY_star_star(YR_star_star aY_star_star)
  {
    boolean wasRemoved = false;
    if (!y_star_star.contains(aY_star_star))
    {
      return wasRemoved;
    }

    int oldIndex = y_star_star.indexOf(aY_star_star);
    y_star_star.remove(oldIndex);
    if (aY_star_star.indexOfZVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY_star_star.removeZVar(this);
      if (!wasRemoved)
      {
        y_star_star.add(oldIndex,aY_star_star);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addY_star_starAt(YR_star_star aY_star_star, int index)
  {  
    boolean wasAdded = false;
    if(addY_star_star(aY_star_star))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_star_star()) { index = numberOfY_star_star() - 1; }
      y_star_star.remove(aY_star_star);
      y_star_star.add(index, aY_star_star);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveY_star_starAt(YR_star_star aY_star_star, int index)
  {
    boolean wasAdded = false;
    if(y_star_star.contains(aY_star_star))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_star_star()) { index = numberOfY_star_star() - 1; }
      y_star_star.remove(aY_star_star);
      y_star_star.add(index, aY_star_star);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addY_star_starAt(aY_star_star, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<YR_star_star> copyOfY_star_star = new ArrayList<YR_star_star>(y_star_star);
    y_star_star.clear();
    for(YR_star_star aY_star_star : copyOfY_star_star)
    {
      aY_star_star.removeZVar(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}