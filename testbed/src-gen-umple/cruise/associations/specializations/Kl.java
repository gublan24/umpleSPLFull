/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 367 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Kl
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Kl Associations
  private List<Jk> jk;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Kl()
  {
    jk = new ArrayList<Jk>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Jk getJk(int index)
  {
    Jk aJk = jk.get(index);
    return aJk;
  }

  public List<Jk> getJk()
  {
    List<Jk> newJk = Collections.unmodifiableList(jk);
    return newJk;
  }

  public int numberOfJk()
  {
    int number = jk.size();
    return number;
  }

  public boolean hasJk()
  {
    boolean has = jk.size() > 0;
    return has;
  }

  public int indexOfJk(Jk aJk)
  {
    int index = jk.indexOf(aJk);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_jk()
  {
    jk.clear();
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Jkk getJk_OneJkk()
  {
    return (Jkk)jk.get(0);
  } 
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfJk()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addJk(Jk aJk)
  {
    boolean wasAdded = false;
    if (jk.contains(aJk)) { return false; }
    jk.add(aJk);
    if (aJk.indexOfKl(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aJk.addKl(this);
      if (!wasAdded)
      {
        jk.remove(aJk);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeJk(Jk aJk)
  {
    boolean wasRemoved = false;
    if (!jk.contains(aJk))
    {
      return wasRemoved;
    }

    int oldIndex = jk.indexOf(aJk);
    jk.remove(oldIndex);
    if (aJk.indexOfKl(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aJk.removeKl(this);
      if (!wasRemoved)
      {
        jk.add(oldIndex,aJk);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addJkAt(Jk aJk, int index)
  {  
    boolean wasAdded = false;
    if(addJk(aJk))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfJk()) { index = numberOfJk() - 1; }
      jk.remove(aJk);
      jk.add(index, aJk);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveJkAt(Jk aJk, int index)
  {
    boolean wasAdded = false;
    if(jk.contains(aJk))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfJk()) { index = numberOfJk() - 1; }
      jk.remove(aJk);
      jk.add(index, aJk);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addJkAt(aJk, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */
  public void delete()
  {
    ArrayList<Jk> copyOfJk = new ArrayList<Jk>(jk);
    jk.clear();
    for(Jk aJk : copyOfJk)
    {
      aJk.removeKl(this);
    }
  }

}