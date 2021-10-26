/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 33 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Xstar_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xstar_star Attributes
  private int num;

  //Xstar_star Associations
  private List<Ystar_star> ystar_star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Xstar_star(int aNum)
  {
    num = aNum;
    ystar_star = new ArrayList<Ystar_star>();
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
  public Ystar_star getYstar_star(int index)
  {
    Ystar_star aYstar_star = ystar_star.get(index);
    return aYstar_star;
  }

  public List<Ystar_star> getYstar_star()
  {
    List<Ystar_star> newYstar_star = Collections.unmodifiableList(ystar_star);
    return newYstar_star;
  }

  public int numberOfYstar_star()
  {
    int number = ystar_star.size();
    return number;
  }

  public boolean hasYstar_star()
  {
    boolean has = ystar_star.size() > 0;
    return has;
  }

  public int indexOfYstar_star(Ystar_star aYstar_star)
  {
    int index = ystar_star.indexOf(aYstar_star);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfYstar_star()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addYstar_star(Ystar_star aYstar_star)
  {
    boolean wasAdded = false;
    if (ystar_star.contains(aYstar_star)) { return false; }
    ystar_star.add(aYstar_star);
    if (aYstar_star.indexOfXVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aYstar_star.addXVar(this);
      if (!wasAdded)
      {
        ystar_star.remove(aYstar_star);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeYstar_star(Ystar_star aYstar_star)
  {
    boolean wasRemoved = false;
    if (!ystar_star.contains(aYstar_star))
    {
      return wasRemoved;
    }

    int oldIndex = ystar_star.indexOf(aYstar_star);
    ystar_star.remove(oldIndex);
    if (aYstar_star.indexOfXVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aYstar_star.removeXVar(this);
      if (!wasRemoved)
      {
        ystar_star.add(oldIndex,aYstar_star);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addYstar_starAt(Ystar_star aYstar_star, int index)
  {  
    boolean wasAdded = false;
    if(addYstar_star(aYstar_star))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfYstar_star()) { index = numberOfYstar_star() - 1; }
      ystar_star.remove(aYstar_star);
      ystar_star.add(index, aYstar_star);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveYstar_starAt(Ystar_star aYstar_star, int index)
  {
    boolean wasAdded = false;
    if(ystar_star.contains(aYstar_star))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfYstar_star()) { index = numberOfYstar_star() - 1; }
      ystar_star.remove(aYstar_star);
      ystar_star.add(index, aYstar_star);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addYstar_starAt(aYstar_star, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (ystar_star.size() > 0)
    {
      Ystar_star aYstar_star = ystar_star.get(ystar_star.size() - 1);
      aYstar_star.delete();
      ystar_star.remove(aYstar_star);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}