/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [41]
 */
// line 414 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Zw
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Zw Associations
  private List<Ws> ws;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Zw()
  {
    ws = new ArrayList<Ws>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Ws getW(int index)
  {
    Ws aW = ws.get(index);
    return aW;
  }

  public List<Ws> getWs()
  {
    List<Ws> newWs = Collections.unmodifiableList(ws);
    return newWs;
  }

  public int numberOfWs()
  {
    int number = ws.size();
    return number;
  }

  public boolean hasWs()
  {
    boolean has = ws.size() > 0;
    return has;
  }

  public int indexOfW(Ws aW)
  {
    int index = ws.indexOf(aW);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_ws()
  {
    ws.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWs()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addW(Ws aW)
  {
    boolean wasAdded = false;
    if (ws.contains(aW)) { return false; }
    ws.add(aW);
    if (aW.indexOfZw(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aW.addZw(this);
      if (!wasAdded)
      {
        ws.remove(aW);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeW(Ws aW)
  {
    boolean wasRemoved = false;
    if (!ws.contains(aW))
    {
      return wasRemoved;
    }

    int oldIndex = ws.indexOf(aW);
    ws.remove(oldIndex);
    if (aW.indexOfZw(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aW.removeZw(this);
      if (!wasRemoved)
      {
        ws.add(oldIndex,aW);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addWAt(Ws aW, int index)
  {  
    boolean wasAdded = false;
    if(addW(aW))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWs()) { index = numberOfWs() - 1; }
      ws.remove(aW);
      ws.add(index, aW);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveWAt(Ws aW, int index)
  {
    boolean wasAdded = false;
    if(ws.contains(aW))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWs()) { index = numberOfWs() - 1; }
      ws.remove(aW);
      ws.add(index, aW);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addWAt(aW, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Ws> copyOfWs = new ArrayList<Ws>(ws);
    ws.clear();
    for(Ws aW : copyOfWs)
    {
      aW.removeZw(this);
    }
  }

}