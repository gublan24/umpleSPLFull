/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [54]
 */
// line 524 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Qx
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Qx Associations
  private List<Xsx> xsx;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Qx()
  {
    xsx = new ArrayList<Xsx>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Xsx getXsx(int index)
  {
    Xsx aXsx = xsx.get(index);
    return aXsx;
  }

  public List<Xsx> getXsx()
  {
    List<Xsx> newXsx = Collections.unmodifiableList(xsx);
    return newXsx;
  }

  public int numberOfXsx()
  {
    int number = xsx.size();
    return number;
  }

  public boolean hasXsx()
  {
    boolean has = xsx.size() > 0;
    return has;
  }

  public int indexOfXsx(Xsx aXsx)
  {
    int index = xsx.indexOf(aXsx);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_xsx()
  {
    xsx.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfXsx()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addXsx(Xsx aXsx)
  {
    boolean wasAdded = false;
    if (xsx.contains(aXsx)) { return false; }
    xsx.add(aXsx);
    if (aXsx.indexOfQx(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aXsx.addQx(this);
      if (!wasAdded)
      {
        xsx.remove(aXsx);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeXsx(Xsx aXsx)
  {
    boolean wasRemoved = false;
    if (!xsx.contains(aXsx))
    {
      return wasRemoved;
    }

    int oldIndex = xsx.indexOf(aXsx);
    xsx.remove(oldIndex);
    if (aXsx.indexOfQx(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aXsx.removeQx(this);
      if (!wasRemoved)
      {
        xsx.add(oldIndex,aXsx);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addXsxAt(Xsx aXsx, int index)
  {  
    boolean wasAdded = false;
    if(addXsx(aXsx))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfXsx()) { index = numberOfXsx() - 1; }
      xsx.remove(aXsx);
      xsx.add(index, aXsx);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveXsxAt(Xsx aXsx, int index)
  {
    boolean wasAdded = false;
    if(xsx.contains(aXsx))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfXsx()) { index = numberOfXsx() - 1; }
      xsx.remove(aXsx);
      xsx.add(index, aXsx);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addXsxAt(aXsx, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Xsx> copyOfXsx = new ArrayList<Xsx>(xsx);
    xsx.clear();
    for(Xsx aXsx : copyOfXsx)
    {
      aXsx.removeQx(this);
    }
  }

}