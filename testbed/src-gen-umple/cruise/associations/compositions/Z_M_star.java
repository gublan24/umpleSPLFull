/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 26 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_M_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_M_star Attributes
  private int num;

  //Z_M_star Associations
  private List<YR_M_star> y_m_star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_M_star(int aNum, YR_M_star... allY_m_star)
  {
    num = aNum;
    y_m_star = new ArrayList<YR_M_star>();
    boolean didAddY_m_star = setY_m_star(allY_m_star);
    if (!didAddY_m_star)
    {
      throw new RuntimeException("Unable to create Z_M_star, must have 3 y_m_star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  public YR_M_star getY_m_star(int index)
  {
    YR_M_star aY_m_star = y_m_star.get(index);
    return aY_m_star;
  }

  public List<YR_M_star> getY_m_star()
  {
    List<YR_M_star> newY_m_star = Collections.unmodifiableList(y_m_star);
    return newY_m_star;
  }

  public int numberOfY_m_star()
  {
    int number = y_m_star.size();
    return number;
  }

  public boolean hasY_m_star()
  {
    boolean has = y_m_star.size() > 0;
    return has;
  }

  public int indexOfY_m_star(YR_M_star aY_m_star)
  {
    int index = y_m_star.indexOf(aY_m_star);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfY_m_starValid()
  {
    boolean isValid = numberOfY_m_star() >= minimumNumberOfY_m_star() && numberOfY_m_star() <= maximumNumberOfY_m_star();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfY_m_star()
  {
    return 3;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfY_m_star()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfY_m_star()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addY_m_star(YR_M_star aY_m_star)
  {
    boolean wasAdded = false;
    if (y_m_star.contains(aY_m_star)) { return false; }
    if (numberOfY_m_star() >= maximumNumberOfY_m_star())
    {
      return wasAdded;
    }

    y_m_star.add(aY_m_star);
    if (aY_m_star.indexOfZVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aY_m_star.addZVar(this);
      if (!wasAdded)
      {
        y_m_star.remove(aY_m_star);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeY_m_star(YR_M_star aY_m_star)
  {
    boolean wasRemoved = false;
    if (!y_m_star.contains(aY_m_star))
    {
      return wasRemoved;
    }

    if (numberOfY_m_star() <= minimumNumberOfY_m_star())
    {
      return wasRemoved;
    }

    int oldIndex = y_m_star.indexOf(aY_m_star);
    y_m_star.remove(oldIndex);
    if (aY_m_star.indexOfZVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aY_m_star.removeZVar(this);
      if (!wasRemoved)
      {
        y_m_star.add(oldIndex,aY_m_star);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setY_m_star(YR_M_star... newY_m_star)
  {
    boolean wasSet = false;
    ArrayList<YR_M_star> verifiedY_m_star = new ArrayList<YR_M_star>();
    for (YR_M_star aY_m_star : newY_m_star)
    {
      if (verifiedY_m_star.contains(aY_m_star))
      {
        continue;
      }
      verifiedY_m_star.add(aY_m_star);
    }

    if (verifiedY_m_star.size() != newY_m_star.length || verifiedY_m_star.size() < minimumNumberOfY_m_star() || verifiedY_m_star.size() > maximumNumberOfY_m_star())
    {
      return wasSet;
    }

    ArrayList<YR_M_star> oldY_m_star = new ArrayList<YR_M_star>(y_m_star);
    y_m_star.clear();
    for (YR_M_star aNewY_m_star : verifiedY_m_star)
    {
      y_m_star.add(aNewY_m_star);
      if (oldY_m_star.contains(aNewY_m_star))
      {
        oldY_m_star.remove(aNewY_m_star);
      }
      else
      {
        aNewY_m_star.addZVar(this);
      }
    }

    for (YR_M_star anOldY_m_star : oldY_m_star)
    {
      anOldY_m_star.removeZVar(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<YR_M_star> copyOfY_m_star = new ArrayList<YR_M_star>(y_m_star);
    y_m_star.clear();
    for(YR_M_star aY_m_star : copyOfY_m_star)
    {
      aY_m_star.removeZVar(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}