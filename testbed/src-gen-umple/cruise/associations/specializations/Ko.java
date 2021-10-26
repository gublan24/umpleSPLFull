/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [51]
 */
// line 497 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ko
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ko Associations
  private List<Ol> ol;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ko()
  {
    ol = new ArrayList<Ol>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Ol getOl(int index)
  {
    Ol aOl = ol.get(index);
    return aOl;
  }

  public List<Ol> getOl()
  {
    List<Ol> newOl = Collections.unmodifiableList(ol);
    return newOl;
  }

  public int numberOfOl()
  {
    int number = ol.size();
    return number;
  }

  public boolean hasOl()
  {
    boolean has = ol.size() > 0;
    return has;
  }

  public int indexOfOl(Ol aOl)
  {
    int index = ol.indexOf(aOl);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_ol()
  {
    ol.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfOl()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addOl(Ol aOl)
  {
    boolean wasAdded = false;
    if (ol.contains(aOl)) { return false; }
    ol.add(aOl);
    if (aOl.indexOfKo(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aOl.addKo(this);
      if (!wasAdded)
      {
        ol.remove(aOl);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeOl(Ol aOl)
  {
    boolean wasRemoved = false;
    if (!ol.contains(aOl))
    {
      return wasRemoved;
    }

    int oldIndex = ol.indexOf(aOl);
    ol.remove(oldIndex);
    if (aOl.indexOfKo(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aOl.removeKo(this);
      if (!wasRemoved)
      {
        ol.add(oldIndex,aOl);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addOlAt(Ol aOl, int index)
  {  
    boolean wasAdded = false;
    if(addOl(aOl))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOl()) { index = numberOfOl() - 1; }
      ol.remove(aOl);
      ol.add(index, aOl);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveOlAt(Ol aOl, int index)
  {
    boolean wasAdded = false;
    if(ol.contains(aOl))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOl()) { index = numberOfOl() - 1; }
      ol.remove(aOl);
      ol.add(index, aOl);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOlAt(aOl, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Ol> copyOfOl = new ArrayList<Ol>(ol);
    ol.clear();
    for(Ol aOl : copyOfOl)
    {
      aOl.removeKo(this);
    }
  }

}