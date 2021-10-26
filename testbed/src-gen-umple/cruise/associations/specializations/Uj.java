/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [49]
 */
// line 481 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Uj
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Uj Associations
  private List<Jm> jm;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Uj()
  {
    jm = new ArrayList<Jm>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Jm getJm(int index)
  {
    Jm aJm = jm.get(index);
    return aJm;
  }

  public List<Jm> getJm()
  {
    List<Jm> newJm = Collections.unmodifiableList(jm);
    return newJm;
  }

  public int numberOfJm()
  {
    int number = jm.size();
    return number;
  }

  public boolean hasJm()
  {
    boolean has = jm.size() > 0;
    return has;
  }

  public int indexOfJm(Jm aJm)
  {
    int index = jm.indexOf(aJm);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_jm()
  {
    jm.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfJm()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addJm(Jm aJm)
  {
    boolean wasAdded = false;
    if (jm.contains(aJm)) { return false; }
    jm.add(aJm);
    if (aJm.indexOfUj(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aJm.addUj(this);
      if (!wasAdded)
      {
        jm.remove(aJm);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeJm(Jm aJm)
  {
    boolean wasRemoved = false;
    if (!jm.contains(aJm))
    {
      return wasRemoved;
    }

    int oldIndex = jm.indexOf(aJm);
    jm.remove(oldIndex);
    if (aJm.indexOfUj(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aJm.removeUj(this);
      if (!wasRemoved)
      {
        jm.add(oldIndex,aJm);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addJmAt(Jm aJm, int index)
  {  
    boolean wasAdded = false;
    if(addJm(aJm))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfJm()) { index = numberOfJm() - 1; }
      jm.remove(aJm);
      jm.add(index, aJm);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveJmAt(Jm aJm, int index)
  {
    boolean wasAdded = false;
    if(jm.contains(aJm))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfJm()) { index = numberOfJm() - 1; }
      jm.remove(aJm);
      jm.add(index, aJm);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addJmAt(aJm, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Jm> copyOfJm = new ArrayList<Jm>(jm);
    jm.clear();
    for(Jm aJm : copyOfJm)
    {
      aJm.removeUj(this);
    }
  }

}