/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 28 "../../../../src/TestHarnessCompositionsLeft.ump"
public class XM_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //XM_star Attributes
  private int num;

  //XM_star Associations
  private List<YM_star> ym_star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public XM_star(int aNum, YM_star... allYm_star)
  {
    num = aNum;
    ym_star = new ArrayList<YM_star>();
    boolean didAddYm_star = setYm_star(allYm_star);
    if (!didAddYm_star)
    {
      throw new RuntimeException("Unable to create XM_star, must have 3 ym_star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  public YM_star getYm_star(int index)
  {
    YM_star aYm_star = ym_star.get(index);
    return aYm_star;
  }

  public List<YM_star> getYm_star()
  {
    List<YM_star> newYm_star = Collections.unmodifiableList(ym_star);
    return newYm_star;
  }

  public int numberOfYm_star()
  {
    int number = ym_star.size();
    return number;
  }

  public boolean hasYm_star()
  {
    boolean has = ym_star.size() > 0;
    return has;
  }

  public int indexOfYm_star(YM_star aYm_star)
  {
    int index = ym_star.indexOf(aYm_star);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfYm_starValid()
  {
    boolean isValid = numberOfYm_star() >= minimumNumberOfYm_star() && numberOfYm_star() <= maximumNumberOfYm_star();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfYm_star()
  {
    return 3;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfYm_star()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfYm_star()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addYm_star(YM_star aYm_star)
  {
    boolean wasAdded = false;
    if (ym_star.contains(aYm_star)) { return false; }
    if (numberOfYm_star() >= maximumNumberOfYm_star())
    {
      return wasAdded;
    }

    ym_star.add(aYm_star);
    if (aYm_star.indexOfXVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aYm_star.addXVar(this);
      if (!wasAdded)
      {
        ym_star.remove(aYm_star);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeYm_star(YM_star aYm_star)
  {
    boolean wasRemoved = false;
    if (!ym_star.contains(aYm_star))
    {
      return wasRemoved;
    }

    if (numberOfYm_star() <= minimumNumberOfYm_star())
    {
      return wasRemoved;
    }

    int oldIndex = ym_star.indexOf(aYm_star);
    ym_star.remove(oldIndex);
    if (aYm_star.indexOfXVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aYm_star.removeXVar(this);
      if (!wasRemoved)
      {
        ym_star.add(oldIndex,aYm_star);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setYm_star(YM_star... newYm_star)
  {
    boolean wasSet = false;
    ArrayList<YM_star> verifiedYm_star = new ArrayList<YM_star>();
    for (YM_star aYm_star : newYm_star)
    {
      if (verifiedYm_star.contains(aYm_star))
      {
        continue;
      }
      verifiedYm_star.add(aYm_star);
    }

    if (verifiedYm_star.size() != newYm_star.length || verifiedYm_star.size() < minimumNumberOfYm_star() || verifiedYm_star.size() > maximumNumberOfYm_star())
    {
      return wasSet;
    }

    ArrayList<YM_star> oldYm_star = new ArrayList<YM_star>(ym_star);
    ym_star.clear();
    for (YM_star aNewYm_star : verifiedYm_star)
    {
      ym_star.add(aNewYm_star);
      if (oldYm_star.contains(aNewYm_star))
      {
        oldYm_star.remove(aNewYm_star);
      }
      else
      {
        aNewYm_star.addXVar(this);
      }
    }

    for (YM_star anOldYm_star : oldYm_star)
    {
      anOldYm_star.removeXVar(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while (ym_star.size() > 0)
    {
      YM_star aYm_star = ym_star.get(ym_star.size() - 1);
      aYm_star.delete();
      ym_star.remove(aYm_star);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}