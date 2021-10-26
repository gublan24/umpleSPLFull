/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * With List LHS                                            [5]
 */
// line 72 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Alteration
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Alteration Associations
  private List<Dilleniidae> dills;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Alteration()
  {
    dills = new ArrayList<Dilleniidae>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Dilleniidae getDill(int index)
  {
    Dilleniidae aDill = dills.get(index);
    return aDill;
  }

  public List<Dilleniidae> getDills()
  {
    List<Dilleniidae> newDills = Collections.unmodifiableList(dills);
    return newDills;
  }

  public int numberOfDills()
  {
    int number = dills.size();
    return number;
  }

  public boolean hasDills()
  {
    boolean has = dills.size() > 0;
    return has;
  }

  public int indexOfDill(Dilleniidae aDill)
  {
    int index = dills.indexOf(aDill);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_dills()
  {
    dills.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Pine getDill_Pine(int index)
  {
    Pine aDill = (Pine)dills.get(index);
    return aDill;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Pine> getDills_Pine()
  {
    List<? extends Dilleniidae> newDills = Collections.unmodifiableList(dills);
    return (List<Pine>)newDills;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDills()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfDills()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDill(Dilleniidae aDill)
  {
    boolean wasAdded = false;
    if (dills.contains(aDill)) { return false; }
    if (dills.contains(aDill)) { return false; }
    if (numberOfDills() >= maximumNumberOfDills())
    {
      return wasAdded;
    }

    dills.add(aDill);
    if (aDill.indexOfAlt(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDill.addAlt(this);
      if (!wasAdded)
      {
        dills.remove(aDill);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDill(Dilleniidae aDill)
  {
    boolean wasRemoved = false;
    if (!dills.contains(aDill))
    {
      return wasRemoved;
    }

    int oldIndex = dills.indexOf(aDill);
    dills.remove(oldIndex);
    if (aDill.indexOfAlt(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDill.removeAlt(this);
      if (!wasRemoved)
      {
        dills.add(oldIndex,aDill);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetOptionalNToMany */
  public boolean setDills(Dilleniidae... newDills)
  {
    boolean wasSet = false;
    ArrayList<Dilleniidae> verifiedDills = new ArrayList<Dilleniidae>();
    for (Dilleniidae aDill : newDills)
    {
      if (verifiedDills.contains(aDill))
      {
        continue;
      }
      verifiedDills.add(aDill);
    }

    if (verifiedDills.size() != newDills.length || verifiedDills.size() > maximumNumberOfDills())
    {
      return wasSet;
    }

    ArrayList<Dilleniidae> oldDills = new ArrayList<Dilleniidae>(dills);
    dills.clear();
    for (Dilleniidae aNewDill : verifiedDills)
    {
      dills.add(aNewDill);
      if (oldDills.contains(aNewDill))
      {
        oldDills.remove(aNewDill);
      }
      else
      {
        aNewDill.addAlt(this);
      }
    }

    for (Dilleniidae anOldDill : oldDills)
    {
      anOldDill.removeAlt(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDillAt(Dilleniidae aDill, int index)
  {  
    boolean wasAdded = false;
    if(addDill(aDill))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDills()) { index = numberOfDills() - 1; }
      dills.remove(aDill);
      dills.add(index, aDill);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDillAt(Dilleniidae aDill, int index)
  {
    boolean wasAdded = false;
    if(dills.contains(aDill))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDills()) { index = numberOfDills() - 1; }
      dills.remove(aDill);
      dills.add(index, aDill);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDillAt(aDill, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfDills_Pine()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_relatedSpecialization */
  public static int maximumNumberOfDills_Pine()
  {
    return 2;
  }
  /* Code from template association_AddManyToManyMethod_relatedSpecialization */
  public boolean addDill(Pine aDill)
  {
    boolean wasAdded = false;
    if (dills.contains(aDill)) { return false; }
    if (dills.contains(aDill)) { return false; }
    if (numberOfDills() >= maximumNumberOfDills_Pine())
    {
      return wasAdded;
    }

    dills.add(aDill);
    if (aDill.indexOfAlt(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDill.addAlt(this);
      if (!wasAdded)
      {
        dills.remove(aDill);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDill(Pine aDill)
  {
    boolean wasRemoved = false;
    if (!dills.contains(aDill))
    {
      return wasRemoved;
    }

    int oldIndex = dills.indexOf(aDill);
    dills.remove(oldIndex);
    if (aDill.indexOfAlt(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDill.removeAlt(this);
      if (!wasRemoved)
      {
        dills.add(oldIndex,aDill);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */
  public boolean addDillAt(Pine aDill, int index)
  {  
    boolean wasAdded = false;
    if(addDill(aDill))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDills()) { index = numberOfDills() - 1; }
      dills.remove(aDill);
      dills.add(index, aDill);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDillAt(Pine aDill, int index)
  {
    boolean wasAdded = false;
    if(dills.contains(aDill))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDills()) { index = numberOfDills() - 1; }
      dills.remove(aDill);
      dills.add(index, aDill);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDillAt(aDill, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Dilleniidae> copyOfDills = new ArrayList<Dilleniidae>(dills);
    dills.clear();
    for(Dilleniidae aDill : copyOfDills)
    {
      aDill.removeAlt(this);
    }
  }

}