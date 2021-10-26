/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [35]
 */
// line 366 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Jk
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Jk Associations
  private List<Kl> kl;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Jk()
  {
    kl = new ArrayList<Kl>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Kl getKl(int index)
  {
    Kl aKl = kl.get(index);
    return aKl;
  }

  public List<Kl> getKl()
  {
    List<Kl> newKl = Collections.unmodifiableList(kl);
    return newKl;
  }

  public int numberOfKl()
  {
    int number = kl.size();
    return number;
  }

  public boolean hasKl()
  {
    boolean has = kl.size() > 0;
    return has;
  }

  public int indexOfKl(Kl aKl)
  {
    int index = kl.indexOf(aKl);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_kl()
  {
    kl.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfKl()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addKl(Kl aKl)
  {
    boolean wasAdded = false;
    if (kl.contains(aKl)) { return false; }
    kl.add(aKl);
    if (aKl.indexOfJk(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aKl.addJk(this);
      if (!wasAdded)
      {
        kl.remove(aKl);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeKl(Kl aKl)
  {
    boolean wasRemoved = false;
    if (!kl.contains(aKl))
    {
      return wasRemoved;
    }

    int oldIndex = kl.indexOf(aKl);
    kl.remove(oldIndex);
    if (aKl.indexOfJk(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aKl.removeJk(this);
      if (!wasRemoved)
      {
        kl.add(oldIndex,aKl);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addKlAt(Kl aKl, int index)
  {  
    boolean wasAdded = false;
    if(addKl(aKl))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfKl()) { index = numberOfKl() - 1; }
      kl.remove(aKl);
      kl.add(index, aKl);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveKlAt(Kl aKl, int index)
  {
    boolean wasAdded = false;
    if(kl.contains(aKl))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfKl()) { index = numberOfKl() - 1; }
      kl.remove(aKl);
      kl.add(index, aKl);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addKlAt(aKl, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Kl> copyOfKl = new ArrayList<Kl>(kl);
    kl.clear();
    for(Kl aKl : copyOfKl)
    {
      aKl.removeJk(this);
    }
  }

}