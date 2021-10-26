/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 46 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_m_n__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_m_n__star Attributes
  private int num;

  //Z_m_n__star Associations
  private List<YR_m_n__star> y_m_n__star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_m_n__star(int aNum, YR_m_n__star... allY_m_n__star)
  {
    num = aNum;
    y_m_n__star = new ArrayList<YR_m_n__star>();
    boolean didAddY_m_n__star = setY_m_n__star(allY_m_n__star);
    if (!didAddY_m_n__star)
    {
      throw new RuntimeException("Unable to create Z_m_n__star, must have 2 to 3 y_m_n__star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
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
  public YR_m_n__star getY_m_n__star(int index)
  {
    YR_m_n__star aY_m_n__star = y_m_n__star.get(index);
    return aY_m_n__star;
  }

  public List<YR_m_n__star> getY_m_n__star()
  {
    List<YR_m_n__star> newY_m_n__star = Collections.unmodifiableList(y_m_n__star);
    return newY_m_n__star;
  }

  public int numberOfY_m_n__star()
  {
    int number = y_m_n__star.size();
    return number;
  }

  public boolean hasY_m_n__star()
  {
    boolean has = y_m_n__star.size() > 0;
    return has;
  }

  public int indexOfY_m_n__star(YR_m_n__star aY_m_n__star)
  {
    int index = y_m_n__star.indexOf(aY_m_n__star);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfY_m_n__starValid()
  {
    boolean isValid = numberOfY_m_n__star() >= minimumNumberOfY_m_n__star() && numberOfY_m_n__star() <= maximumNumberOfY_m_n__star();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY_m_n__star()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY_m_n__star()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY_m_n__star(YR_m_n__star aY_m_n__star)
  {
    boolean wasAdded = false;
    if (y_m_n__star.contains(aY_m_n__star)) { return false; }
    if (numberOfY_m_n__star() >= maximumNumberOfY_m_n__star())
    {
      return wasAdded;
    }

    y_m_n__star.add(aY_m_n__star);
    if (aY_m_n__star.indexOfZVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY_m_n__star.addZVar(this);
      if (!wasAdded)
      {
        y_m_n__star.remove(aY_m_n__star);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeY_m_n__star(YR_m_n__star aY_m_n__star)
  {
    boolean wasRemoved = false;
    if (!y_m_n__star.contains(aY_m_n__star))
    {
      return wasRemoved;
    }

    if (numberOfY_m_n__star() <= minimumNumberOfY_m_n__star())
    {
      return wasRemoved;
    }

    int oldIndex = y_m_n__star.indexOf(aY_m_n__star);
    y_m_n__star.remove(oldIndex);
    if (aY_m_n__star.indexOfZVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY_m_n__star.removeZVar(this);
      if (!wasRemoved)
      {
        y_m_n__star.add(oldIndex,aY_m_n__star);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setY_m_n__star(YR_m_n__star... newY_m_n__star)
  {
    boolean wasSet = false;
    ArrayList<YR_m_n__star> verifiedY_m_n__star = new ArrayList<YR_m_n__star>();
    for (YR_m_n__star aY_m_n__star : newY_m_n__star)
    {
      if (verifiedY_m_n__star.contains(aY_m_n__star))
      {
        continue;
      }
      verifiedY_m_n__star.add(aY_m_n__star);
    }

    if (verifiedY_m_n__star.size() != newY_m_n__star.length || verifiedY_m_n__star.size() < minimumNumberOfY_m_n__star() || verifiedY_m_n__star.size() > maximumNumberOfY_m_n__star())
    {
      return wasSet;
    }

    ArrayList<YR_m_n__star> oldY_m_n__star = new ArrayList<YR_m_n__star>(y_m_n__star);
    y_m_n__star.clear();
    for (YR_m_n__star aNewY_m_n__star : verifiedY_m_n__star)
    {
      y_m_n__star.add(aNewY_m_n__star);
      if (oldY_m_n__star.contains(aNewY_m_n__star))
      {
        oldY_m_n__star.remove(aNewY_m_n__star);
      }
      else
      {
        aNewY_m_n__star.addZVar(this);
      }
    }

    for (YR_m_n__star anOldY_m_n__star : oldY_m_n__star)
    {
      anOldY_m_n__star.removeZVar(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addY_m_n__starAt(YR_m_n__star aY_m_n__star, int index)
  {  
    boolean wasAdded = false;
    if(addY_m_n__star(aY_m_n__star))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_m_n__star()) { index = numberOfY_m_n__star() - 1; }
      y_m_n__star.remove(aY_m_n__star);
      y_m_n__star.add(index, aY_m_n__star);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveY_m_n__starAt(YR_m_n__star aY_m_n__star, int index)
  {
    boolean wasAdded = false;
    if(y_m_n__star.contains(aY_m_n__star))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfY_m_n__star()) { index = numberOfY_m_n__star() - 1; }
      y_m_n__star.remove(aY_m_n__star);
      y_m_n__star.add(index, aY_m_n__star);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addY_m_n__starAt(aY_m_n__star, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<YR_m_n__star> copyOfY_m_n__star = new ArrayList<YR_m_n__star>(y_m_n__star);
    y_m_n__star.clear();
    for(YR_m_n__star aY_m_n__star : copyOfY_m_n__star)
    {
      aY_m_n__star.removeZVar(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}