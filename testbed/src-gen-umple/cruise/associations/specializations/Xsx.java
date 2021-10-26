/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 525 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Xsx
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xsx Associations
  private List<Qx> qx;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Xsx()
  {
    qx = new ArrayList<Qx>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Qx getQx(int index)
  {
    Qx aQx = qx.get(index);
    return aQx;
  }

  public List<Qx> getQx()
  {
    List<Qx> newQx = Collections.unmodifiableList(qx);
    return newQx;
  }

  public int numberOfQx()
  {
    int number = qx.size();
    return number;
  }

  public boolean hasQx()
  {
    boolean has = qx.size() > 0;
    return has;
  }

  public int indexOfQx(Qx aQx)
  {
    int index = qx.indexOf(aQx);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_qx()
  {
    qx.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfQx()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addQx(Qx aQx)
  {
    boolean wasAdded = false;
    if (qx.contains(aQx)) { return false; }
    qx.add(aQx);
    if (aQx.indexOfXsx(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aQx.addXsx(this);
      if (!wasAdded)
      {
        qx.remove(aQx);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeQx(Qx aQx)
  {
    boolean wasRemoved = false;
    if (!qx.contains(aQx))
    {
      return wasRemoved;
    }

    int oldIndex = qx.indexOf(aQx);
    qx.remove(oldIndex);
    if (aQx.indexOfXsx(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aQx.removeXsx(this);
      if (!wasRemoved)
      {
        qx.add(oldIndex,aQx);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addQxAt(Qx aQx, int index)
  {  
    boolean wasAdded = false;
    if(addQx(aQx))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfQx()) { index = numberOfQx() - 1; }
      qx.remove(aQx);
      qx.add(index, aQx);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveQxAt(Qx aQx, int index)
  {
    boolean wasAdded = false;
    if(qx.contains(aQx))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfQx()) { index = numberOfQx() - 1; }
      qx.remove(aQx);
      qx.add(index, aQx);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addQxAt(aQx, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Qx> copyOfQx = new ArrayList<Qx>(qx);
    qx.clear();
    for(Qx aQx : copyOfQx)
    {
      aQx.removeXsx(this);
    }
  }

}