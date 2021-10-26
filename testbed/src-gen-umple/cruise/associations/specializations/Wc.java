/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 534 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Wc
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Wc Associations
  private List<Sw> sw;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Wc()
  {
    sw = new ArrayList<Sw>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Sw getSw(int index)
  {
    Sw aSw = sw.get(index);
    return aSw;
  }

  public List<Sw> getSw()
  {
    List<Sw> newSw = Collections.unmodifiableList(sw);
    return newSw;
  }

  public int numberOfSw()
  {
    int number = sw.size();
    return number;
  }

  public boolean hasSw()
  {
    boolean has = sw.size() > 0;
    return has;
  }

  public int indexOfSw(Sw aSw)
  {
    int index = sw.indexOf(aSw);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_sw()
  {
    sw.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSw()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSw(Sw aSw)
  {
    boolean wasAdded = false;
    if (sw.contains(aSw)) { return false; }
    sw.add(aSw);
    if (aSw.indexOfWc(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSw.addWc(this);
      if (!wasAdded)
      {
        sw.remove(aSw);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSw(Sw aSw)
  {
    boolean wasRemoved = false;
    if (!sw.contains(aSw))
    {
      return wasRemoved;
    }

    int oldIndex = sw.indexOf(aSw);
    sw.remove(oldIndex);
    if (aSw.indexOfWc(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSw.removeWc(this);
      if (!wasRemoved)
      {
        sw.add(oldIndex,aSw);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSwAt(Sw aSw, int index)
  {  
    boolean wasAdded = false;
    if(addSw(aSw))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSw()) { index = numberOfSw() - 1; }
      sw.remove(aSw);
      sw.add(index, aSw);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSwAt(Sw aSw, int index)
  {
    boolean wasAdded = false;
    if(sw.contains(aSw))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSw()) { index = numberOfSw() - 1; }
      sw.remove(aSw);
      sw.add(index, aSw);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSwAt(aSw, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (sw.size() > 0)
    {
      Sw aSw = sw.get(sw.size() - 1);
      aSw.delete();
      sw.remove(aSw);
    }
    
  }

}