/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 458 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Gb
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Gb Associations
  private List<Tg> tg;
  private List<By> by;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Gb()
  {
    tg = new ArrayList<Tg>();
    by = new ArrayList<By>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Tg getTg(int index)
  {
    Tg aTg = tg.get(index);
    return aTg;
  }

  public List<Tg> getTg()
  {
    List<Tg> newTg = Collections.unmodifiableList(tg);
    return newTg;
  }

  public int numberOfTg()
  {
    int number = tg.size();
    return number;
  }

  public boolean hasTg()
  {
    boolean has = tg.size() > 0;
    return has;
  }

  public int indexOfTg(Tg aTg)
  {
    int index = tg.indexOf(aTg);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_tg()
  {
    tg.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Tgg getTg_Tgg(int index)
  {
    Tgg aTg = (Tgg)tg.get(index);
    return aTg;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Tgg> getTg_Tgg()
  {
    List<? extends Tg> newTg = Collections.unmodifiableList(tg);
    return (List<Tgg>)newTg;
  }
  /* Code from template association_GetMany */
  public By getBy(int index)
  {
    By aBy = by.get(index);
    return aBy;
  }

  public List<By> getBy()
  {
    List<By> newBy = Collections.unmodifiableList(by);
    return newBy;
  }

  public int numberOfBy()
  {
    int number = by.size();
    return number;
  }

  public boolean hasBy()
  {
    boolean has = by.size() > 0;
    return has;
  }

  public int indexOfBy(By aBy)
  {
    int index = by.indexOf(aBy);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_by()
  {
    by.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Byy getBy_Byy(int index)
  {
    Byy aBy = (Byy)by.get(index);
    return aBy;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Byy> getBy_Byy()
  {
    List<? extends By> newBy = Collections.unmodifiableList(by);
    return (List<Byy>)newBy;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTg()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addTg(Tg aTg)
  {
    boolean wasAdded = false;
    if (tg.contains(aTg)) { return false; }
    if (tg.contains(aTg)) { return false; }
    tg.add(aTg);
    if (aTg.indexOfGb(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aTg.addGb(this);
      if (!wasAdded)
      {
        tg.remove(aTg);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeTg(Tg aTg)
  {
    boolean wasRemoved = false;
    if (!tg.contains(aTg))
    {
      return wasRemoved;
    }

    int oldIndex = tg.indexOf(aTg);
    tg.remove(oldIndex);
    if (aTg.indexOfGb(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aTg.removeGb(this);
      if (!wasRemoved)
      {
        tg.add(oldIndex,aTg);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTgAt(Tg aTg, int index)
  {  
    boolean wasAdded = false;
    if(addTg(aTg))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTg()) { index = numberOfTg() - 1; }
      tg.remove(aTg);
      tg.add(index, aTg);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTgAt(Tg aTg, int index)
  {
    boolean wasAdded = false;
    if(tg.contains(aTg))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTg()) { index = numberOfTg() - 1; }
      tg.remove(aTg);
      tg.add(index, aTg);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTgAt(aTg, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfTg_Tgg()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod_relatedSpecialization */
  public boolean addTg(Tgg aTg)
  {
    boolean wasAdded = false;
    if (tg.contains(aTg)) { return false; }
    if (tg.contains(aTg)) { return false; }
    tg.add(aTg);
    if (aTg.indexOfGb(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aTg.addGb(this);
      if (!wasAdded)
      {
        tg.remove(aTg);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeTg(Tgg aTg)
  {
    boolean wasRemoved = false;
    if (!tg.contains(aTg))
    {
      return wasRemoved;
    }

    int oldIndex = tg.indexOf(aTg);
    tg.remove(oldIndex);
    if (aTg.indexOfGb(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aTg.removeGb(this);
      if (!wasRemoved)
      {
        tg.add(oldIndex,aTg);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */
  public boolean addTgAt(Tgg aTg, int index)
  {  
    boolean wasAdded = false;
    if(addTg(aTg))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTg()) { index = numberOfTg() - 1; }
      tg.remove(aTg);
      tg.add(index, aTg);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTgAt(Tgg aTg, int index)
  {
    boolean wasAdded = false;
    if(tg.contains(aTg))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTg()) { index = numberOfTg() - 1; }
      tg.remove(aTg);
      tg.add(index, aTg);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTgAt(aTg, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBy()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addBy(By aBy)
  {
    boolean wasAdded = false;
    if (by.contains(aBy)) { return false; }
    if (by.contains(aBy)) { return false; }
    by.add(aBy);
    if (aBy.indexOfGb(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aBy.addGb(this);
      if (!wasAdded)
      {
        by.remove(aBy);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeBy(By aBy)
  {
    boolean wasRemoved = false;
    if (!by.contains(aBy))
    {
      return wasRemoved;
    }

    int oldIndex = by.indexOf(aBy);
    by.remove(oldIndex);
    if (aBy.indexOfGb(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aBy.removeGb(this);
      if (!wasRemoved)
      {
        by.add(oldIndex,aBy);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addByAt(By aBy, int index)
  {  
    boolean wasAdded = false;
    if(addBy(aBy))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBy()) { index = numberOfBy() - 1; }
      by.remove(aBy);
      by.add(index, aBy);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveByAt(By aBy, int index)
  {
    boolean wasAdded = false;
    if(by.contains(aBy))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBy()) { index = numberOfBy() - 1; }
      by.remove(aBy);
      by.add(index, aBy);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addByAt(aBy, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfBy_Byy()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany_relatedSpecialization */
  public boolean addBy(Byy aBy)
  {
    boolean wasAdded = false;
    if (by.contains(aBy)) { return false; }
    if (by.contains(aBy)) { return false; }
    by.add(aBy);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeBy(Byy aBy)
  {
    boolean wasRemoved = false;
    if (by.contains(aBy))
    {
      by.remove(aBy);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */
  public boolean addByAt(Byy aBy, int index)
  {  
    boolean wasAdded = false;
    if(addBy(aBy))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBy()) { index = numberOfBy() - 1; }
      by.remove(aBy);
      by.add(index, aBy);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveByAt(Byy aBy, int index)
  {
    boolean wasAdded = false;
    if(by.contains(aBy))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBy()) { index = numberOfBy() - 1; }
      by.remove(aBy);
      by.add(index, aBy);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addByAt(aBy, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Tg> copyOfTg = new ArrayList<Tg>(tg);
    tg.clear();
    for(Tg aTg : copyOfTg)
    {
      if (aTg.numberOfGb() <= Tg.minimumNumberOfGb())
      {
        aTg.delete();
      }
      else
      {
        aTg.removeGb(this);
      }
    }
    ArrayList<By> copyOfBy = new ArrayList<By>(by);
    by.clear();
    for(By aBy : copyOfBy)
    {
      aBy.removeGb(this);
    }
  }

}