/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 278 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Bb
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Bb Associations
  private List<Vv> v;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Bb()
  {
    v = new ArrayList<Vv>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Vv getV(int index)
  {
    Vv aV = v.get(index);
    return aV;
  }

  public List<Vv> getV()
  {
    List<Vv> newV = Collections.unmodifiableList(v);
    return newV;
  }

  public int numberOfV()
  {
    int number = v.size();
    return number;
  }

  public boolean hasV()
  {
    boolean has = v.size() > 0;
    return has;
  }

  public int indexOfV(Vv aV)
  {
    int index = v.indexOf(aV);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_v()
  {
    v.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfV()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addV(Vv aV)
  {
    boolean wasAdded = false;
    if (v.contains(aV)) { return false; }
    v.add(aV);
    if (aV.indexOfB(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aV.addB(this);
      if (!wasAdded)
      {
        v.remove(aV);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeV(Vv aV)
  {
    boolean wasRemoved = false;
    if (!v.contains(aV))
    {
      return wasRemoved;
    }

    int oldIndex = v.indexOf(aV);
    v.remove(oldIndex);
    if (aV.indexOfB(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aV.removeB(this);
      if (!wasRemoved)
      {
        v.add(oldIndex,aV);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addVAt(Vv aV, int index)
  {  
    boolean wasAdded = false;
    if(addV(aV))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfV()) { index = numberOfV() - 1; }
      v.remove(aV);
      v.add(index, aV);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveVAt(Vv aV, int index)
  {
    boolean wasAdded = false;
    if(v.contains(aV))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfV()) { index = numberOfV() - 1; }
      v.remove(aV);
      v.add(index, aV);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addVAt(aV, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Vv> copyOfV = new ArrayList<Vv>(v);
    v.clear();
    for(Vv aV : copyOfV)
    {
      aV.removeB(this);
    }
  }

}