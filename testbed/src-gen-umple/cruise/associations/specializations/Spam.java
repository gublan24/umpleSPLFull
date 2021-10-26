/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * Many down to N (and 1)                                         [11]
 */
// line 138 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Spam
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Spam Associations
  private List<Drama> drama;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Spam()
  {
    drama = new ArrayList<Drama>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Drama getDrama(int index)
  {
    Drama aDrama = drama.get(index);
    return aDrama;
  }

  public List<Drama> getDrama()
  {
    List<Drama> newDrama = Collections.unmodifiableList(drama);
    return newDrama;
  }

  public int numberOfDrama()
  {
    int number = drama.size();
    return number;
  }

  public boolean hasDrama()
  {
    boolean has = drama.size() > 0;
    return has;
  }

  public int indexOfDrama(Drama aDrama)
  {
    int index = drama.indexOf(aDrama);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_drama()
  {
    drama.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDrama()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDrama(Drama aDrama)
  {
    boolean wasAdded = false;
    if (drama.contains(aDrama)) { return false; }
    drama.add(aDrama);
    if (aDrama.indexOfSpam(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDrama.addSpam(this);
      if (!wasAdded)
      {
        drama.remove(aDrama);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDrama(Drama aDrama)
  {
    boolean wasRemoved = false;
    if (!drama.contains(aDrama))
    {
      return wasRemoved;
    }

    int oldIndex = drama.indexOf(aDrama);
    drama.remove(oldIndex);
    if (aDrama.indexOfSpam(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDrama.removeSpam(this);
      if (!wasRemoved)
      {
        drama.add(oldIndex,aDrama);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDramaAt(Drama aDrama, int index)
  {  
    boolean wasAdded = false;
    if(addDrama(aDrama))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDrama()) { index = numberOfDrama() - 1; }
      drama.remove(aDrama);
      drama.add(index, aDrama);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDramaAt(Drama aDrama, int index)
  {
    boolean wasAdded = false;
    if(drama.contains(aDrama))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDrama()) { index = numberOfDrama() - 1; }
      drama.remove(aDrama);
      drama.add(index, aDrama);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDramaAt(aDrama, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Drama> copyOfDrama = new ArrayList<Drama>(drama);
    drama.clear();
    for(Drama aDrama : copyOfDrama)
    {
      aDrama.removeSpam(this);
    }
  }

}