/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [50]
 */
// line 489 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Mi
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Mi Associations
  private List<Ik> ik;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Mi()
  {
    ik = new ArrayList<Ik>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Ik getIk(int index)
  {
    Ik aIk = ik.get(index);
    return aIk;
  }

  public List<Ik> getIk()
  {
    List<Ik> newIk = Collections.unmodifiableList(ik);
    return newIk;
  }

  public int numberOfIk()
  {
    int number = ik.size();
    return number;
  }

  public boolean hasIk()
  {
    boolean has = ik.size() > 0;
    return has;
  }

  public int indexOfIk(Ik aIk)
  {
    int index = ik.indexOf(aIk);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_ik()
  {
    ik.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfIk()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addIk(Ik aIk)
  {
    boolean wasAdded = false;
    if (ik.contains(aIk)) { return false; }
    ik.add(aIk);
    if (aIk.indexOfMi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aIk.addMi(this);
      if (!wasAdded)
      {
        ik.remove(aIk);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeIk(Ik aIk)
  {
    boolean wasRemoved = false;
    if (!ik.contains(aIk))
    {
      return wasRemoved;
    }

    int oldIndex = ik.indexOf(aIk);
    ik.remove(oldIndex);
    if (aIk.indexOfMi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aIk.removeMi(this);
      if (!wasRemoved)
      {
        ik.add(oldIndex,aIk);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addIkAt(Ik aIk, int index)
  {  
    boolean wasAdded = false;
    if(addIk(aIk))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfIk()) { index = numberOfIk() - 1; }
      ik.remove(aIk);
      ik.add(index, aIk);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveIkAt(Ik aIk, int index)
  {
    boolean wasAdded = false;
    if(ik.contains(aIk))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfIk()) { index = numberOfIk() - 1; }
      ik.remove(aIk);
      ik.add(index, aIk);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addIkAt(aIk, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Ik> copyOfIk = new ArrayList<Ik>(ik);
    ik.clear();
    for(Ik aIk : copyOfIk)
    {
      aIk.removeMi(this);
    }
  }

}