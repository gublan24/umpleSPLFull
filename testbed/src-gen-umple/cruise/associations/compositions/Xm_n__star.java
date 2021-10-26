/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 48 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Xm_n__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xm_n__star Attributes
  private int num;

  //Xm_n__star Associations
  private List<Ym_n__star> ym_n__star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Xm_n__star(int aNum, Ym_n__star... allYm_n__star)
  {
    num = aNum;
    ym_n__star = new ArrayList<Ym_n__star>();
    boolean didAddYm_n__star = setYm_n__star(allYm_n__star);
    if (!didAddYm_n__star)
    {
      throw new RuntimeException("Unable to create Xm_n__star, must have 2 to 3 ym_n__star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  public Ym_n__star getYm_n__star(int index)
  {
    Ym_n__star aYm_n__star = ym_n__star.get(index);
    return aYm_n__star;
  }

  public List<Ym_n__star> getYm_n__star()
  {
    List<Ym_n__star> newYm_n__star = Collections.unmodifiableList(ym_n__star);
    return newYm_n__star;
  }

  public int numberOfYm_n__star()
  {
    int number = ym_n__star.size();
    return number;
  }

  public boolean hasYm_n__star()
  {
    boolean has = ym_n__star.size() > 0;
    return has;
  }

  public int indexOfYm_n__star(Ym_n__star aYm_n__star)
  {
    int index = ym_n__star.indexOf(aYm_n__star);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfYm_n__starValid()
  {
    boolean isValid = numberOfYm_n__star() >= minimumNumberOfYm_n__star() && numberOfYm_n__star() <= maximumNumberOfYm_n__star();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfYm_n__star()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfYm_n__star()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addYm_n__star(Ym_n__star aYm_n__star)
  {
    boolean wasAdded = false;
    if (ym_n__star.contains(aYm_n__star)) { return false; }
    if (numberOfYm_n__star() >= maximumNumberOfYm_n__star())
    {
      return wasAdded;
    }

    ym_n__star.add(aYm_n__star);
    if (aYm_n__star.indexOfXVar(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aYm_n__star.addXVar(this);
      if (!wasAdded)
      {
        ym_n__star.remove(aYm_n__star);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeYm_n__star(Ym_n__star aYm_n__star)
  {
    boolean wasRemoved = false;
    if (!ym_n__star.contains(aYm_n__star))
    {
      return wasRemoved;
    }

    if (numberOfYm_n__star() <= minimumNumberOfYm_n__star())
    {
      return wasRemoved;
    }

    int oldIndex = ym_n__star.indexOf(aYm_n__star);
    ym_n__star.remove(oldIndex);
    if (aYm_n__star.indexOfXVar(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aYm_n__star.removeXVar(this);
      if (!wasRemoved)
      {
        ym_n__star.add(oldIndex,aYm_n__star);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setYm_n__star(Ym_n__star... newYm_n__star)
  {
    boolean wasSet = false;
    ArrayList<Ym_n__star> verifiedYm_n__star = new ArrayList<Ym_n__star>();
    for (Ym_n__star aYm_n__star : newYm_n__star)
    {
      if (verifiedYm_n__star.contains(aYm_n__star))
      {
        continue;
      }
      verifiedYm_n__star.add(aYm_n__star);
    }

    if (verifiedYm_n__star.size() != newYm_n__star.length || verifiedYm_n__star.size() < minimumNumberOfYm_n__star() || verifiedYm_n__star.size() > maximumNumberOfYm_n__star())
    {
      return wasSet;
    }

    ArrayList<Ym_n__star> oldYm_n__star = new ArrayList<Ym_n__star>(ym_n__star);
    ym_n__star.clear();
    for (Ym_n__star aNewYm_n__star : verifiedYm_n__star)
    {
      ym_n__star.add(aNewYm_n__star);
      if (oldYm_n__star.contains(aNewYm_n__star))
      {
        oldYm_n__star.remove(aNewYm_n__star);
      }
      else
      {
        aNewYm_n__star.addXVar(this);
      }
    }

    for (Ym_n__star anOldYm_n__star : oldYm_n__star)
    {
      anOldYm_n__star.removeXVar(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addYm_n__starAt(Ym_n__star aYm_n__star, int index)
  {  
    boolean wasAdded = false;
    if(addYm_n__star(aYm_n__star))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfYm_n__star()) { index = numberOfYm_n__star() - 1; }
      ym_n__star.remove(aYm_n__star);
      ym_n__star.add(index, aYm_n__star);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveYm_n__starAt(Ym_n__star aYm_n__star, int index)
  {
    boolean wasAdded = false;
    if(ym_n__star.contains(aYm_n__star))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfYm_n__star()) { index = numberOfYm_n__star() - 1; }
      ym_n__star.remove(aYm_n__star);
      ym_n__star.add(index, aYm_n__star);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addYm_n__starAt(aYm_n__star, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (ym_n__star.size() > 0)
    {
      Ym_n__star aYm_n__star = ym_n__star.get(ym_n__star.size() - 1);
      aYm_n__star.delete();
      ym_n__star.remove(aYm_n__star);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]";
  }
}