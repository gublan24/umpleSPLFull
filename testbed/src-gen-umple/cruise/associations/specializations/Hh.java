/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 240 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Hh
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Hh Associations
  private List<Gg> g;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Hh()
  {
    g = new ArrayList<Gg>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Gg getG(int index)
  {
    Gg aG = g.get(index);
    return aG;
  }

  public List<Gg> getG()
  {
    List<Gg> newG = Collections.unmodifiableList(g);
    return newG;
  }

  public int numberOfG()
  {
    int number = g.size();
    return number;
  }

  public boolean hasG()
  {
    boolean has = g.size() > 0;
    return has;
  }

  public int indexOfG(Gg aG)
  {
    int index = g.indexOf(aG);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_g()
  {
    g.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfG()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addG(Gg aG)
  {
    boolean wasAdded = false;
    if (g.contains(aG)) { return false; }
    g.add(aG);
    if (aG.indexOfH(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aG.addH(this);
      if (!wasAdded)
      {
        g.remove(aG);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeG(Gg aG)
  {
    boolean wasRemoved = false;
    if (!g.contains(aG))
    {
      return wasRemoved;
    }

    int oldIndex = g.indexOf(aG);
    g.remove(oldIndex);
    if (aG.indexOfH(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aG.removeH(this);
      if (!wasRemoved)
      {
        g.add(oldIndex,aG);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGAt(Gg aG, int index)
  {  
    boolean wasAdded = false;
    if(addG(aG))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfG()) { index = numberOfG() - 1; }
      g.remove(aG);
      g.add(index, aG);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGAt(Gg aG, int index)
  {
    boolean wasAdded = false;
    if(g.contains(aG))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfG()) { index = numberOfG() - 1; }
      g.remove(aG);
      g.add(index, aG);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGAt(aG, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Gg> copyOfG = new ArrayList<Gg>(g);
    g.clear();
    for(Gg aG : copyOfG)
    {
      aG.removeH(this);
    }
  }

}