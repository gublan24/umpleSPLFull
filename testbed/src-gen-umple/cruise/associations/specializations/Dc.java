/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 433 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Dc
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Dc Associations
  private List<Ed> ed;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Dc()
  {
    ed = new ArrayList<Ed>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Ed getEd(int index)
  {
    Ed aEd = ed.get(index);
    return aEd;
  }

  public List<Ed> getEd()
  {
    List<Ed> newEd = Collections.unmodifiableList(ed);
    return newEd;
  }

  public int numberOfEd()
  {
    int number = ed.size();
    return number;
  }

  public boolean hasEd()
  {
    boolean has = ed.size() > 0;
    return has;
  }

  public int indexOfEd(Ed aEd)
  {
    int index = ed.indexOf(aEd);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_ed()
  {
    ed.clear();
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Edd getEd_OneEdd()
  {
    return (Edd)ed.get(0);
  } 
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEd()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addEd(Ed aEd)
  {
    boolean wasAdded = false;
    if (ed.contains(aEd)) { return false; }
    ed.add(aEd);
    if (aEd.indexOfDc(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aEd.addDc(this);
      if (!wasAdded)
      {
        ed.remove(aEd);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeEd(Ed aEd)
  {
    boolean wasRemoved = false;
    if (!ed.contains(aEd))
    {
      return wasRemoved;
    }

    int oldIndex = ed.indexOf(aEd);
    ed.remove(oldIndex);
    if (aEd.indexOfDc(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aEd.removeDc(this);
      if (!wasRemoved)
      {
        ed.add(oldIndex,aEd);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEdAt(Ed aEd, int index)
  {  
    boolean wasAdded = false;
    if(addEd(aEd))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEd()) { index = numberOfEd() - 1; }
      ed.remove(aEd);
      ed.add(index, aEd);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEdAt(Ed aEd, int index)
  {
    boolean wasAdded = false;
    if(ed.contains(aEd))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEd()) { index = numberOfEd() - 1; }
      ed.remove(aEd);
      ed.add(index, aEd);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEdAt(aEd, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOptionalOneToMany_relatedSpecialization */
  public boolean setEd_Edd(Edd aEd)
  {
    boolean wasSet = false;
    Edd existingEd = getEd_OneEdd();
    ed.clear();
    ed.add(aEd);
    if (existingEd != null && !existingEd.equals(aEd))
    {
      existingEd.removeDc(this);
    }
    if (aEd != null)
    {
      aEd.addDc(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Ed> copyOfEd = new ArrayList<Ed>(ed);
    ed.clear();
    for(Ed aEd : copyOfEd)
    {
      aEd.removeDc(this);
    }
  }

}