/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 186 "../../../../src/Structure.ump"
public class DeferredCall
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DeferredCall Associations
  private List<DeferredFunction> list;
  private DeferredFunction then;
  private DeferredFunction timeout;
  private DeferredFunction resolve;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DeferredCall()
  {
    list = new ArrayList<DeferredFunction>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public DeferredFunction getList(int index)
  {
    DeferredFunction aList = list.get(index);
    return aList;
  }

  public List<DeferredFunction> getList()
  {
    List<DeferredFunction> newList = Collections.unmodifiableList(list);
    return newList;
  }

  public int numberOfList()
  {
    int number = list.size();
    return number;
  }

  public boolean hasList()
  {
    boolean has = list.size() > 0;
    return has;
  }

  public int indexOfList(DeferredFunction aList)
  {
    int index = list.indexOf(aList);
    return index;
  }
  /* Code from template association_GetOne */
  public DeferredFunction getThen()
  {
    return then;
  }

  public boolean hasThen()
  {
    boolean has = then != null;
    return has;
  }
  /* Code from template association_GetOne */
  public DeferredFunction getTimeout()
  {
    return timeout;
  }

  public boolean hasTimeout()
  {
    boolean has = timeout != null;
    return has;
  }
  /* Code from template association_GetOne */
  public DeferredFunction getResolve()
  {
    return resolve;
  }

  public boolean hasResolve()
  {
    boolean has = resolve != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfList()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addList(DeferredFunction aList)
  {
    boolean wasAdded = false;
    if (list.contains(aList)) { return false; }
    list.add(aList);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeList(DeferredFunction aList)
  {
    boolean wasRemoved = false;
    if (list.contains(aList))
    {
      list.remove(aList);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addListAt(DeferredFunction aList, int index)
  {  
    boolean wasAdded = false;
    if(addList(aList))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfList()) { index = numberOfList() - 1; }
      list.remove(aList);
      list.add(index, aList);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveListAt(DeferredFunction aList, int index)
  {
    boolean wasAdded = false;
    if(list.contains(aList))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfList()) { index = numberOfList() - 1; }
      list.remove(aList);
      list.add(index, aList);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addListAt(aList, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setThen(DeferredFunction aNewThen)
  {
    boolean wasSet = false;
    then = aNewThen;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setTimeout(DeferredFunction aNewTimeout)
  {
    boolean wasSet = false;
    timeout = aNewTimeout;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setResolve(DeferredFunction aNewResolve)
  {
    boolean wasSet = false;
    resolve = aNewResolve;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    list.clear();
    then = null;
    timeout = null;
    resolve = null;
  }

}