/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 441 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Rf
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Rf Associations
  private List<Cr> cr;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Rf()
  {
    cr = new ArrayList<Cr>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Cr getCr(int index)
  {
    Cr aCr = cr.get(index);
    return aCr;
  }

  public List<Cr> getCr()
  {
    List<Cr> newCr = Collections.unmodifiableList(cr);
    return newCr;
  }

  public int numberOfCr()
  {
    int number = cr.size();
    return number;
  }

  public boolean hasCr()
  {
    boolean has = cr.size() > 0;
    return has;
  }

  public int indexOfCr(Cr aCr)
  {
    int index = cr.indexOf(aCr);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_cr()
  {
    cr.clear();
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Crr getCr_OneCrr()
  {
    return (Crr)cr.get(0);
  } 
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCr()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addCr(Cr aCr)
  {
    boolean wasAdded = false;
    if (cr.contains(aCr)) { return false; }
    cr.add(aCr);
    if (aCr.indexOfRf(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCr.addRf(this);
      if (!wasAdded)
      {
        cr.remove(aCr);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeCr(Cr aCr)
  {
    boolean wasRemoved = false;
    if (!cr.contains(aCr))
    {
      return wasRemoved;
    }

    int oldIndex = cr.indexOf(aCr);
    cr.remove(oldIndex);
    if (aCr.indexOfRf(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCr.removeRf(this);
      if (!wasRemoved)
      {
        cr.add(oldIndex,aCr);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCrAt(Cr aCr, int index)
  {  
    boolean wasAdded = false;
    if(addCr(aCr))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCr()) { index = numberOfCr() - 1; }
      cr.remove(aCr);
      cr.add(index, aCr);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCrAt(Cr aCr, int index)
  {
    boolean wasAdded = false;
    if(cr.contains(aCr))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCr()) { index = numberOfCr() - 1; }
      cr.remove(aCr);
      cr.add(index, aCr);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCrAt(aCr, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOneToAtMostN_relatedSpecialization */
  public boolean setCr_Crr(Crr aCr)
  {
    boolean wasSet = false;
    //Must provide cr to rf
    if (aCr == null)
    {
      return wasSet;
    }

    //cr already at maximum (4)
    if (aCr.numberOfRf() >= Crr.maximumNumberOfRf_Rf())
    {
      return wasSet;
    }
    
    Crr existingCr = getCr_OneCrr();
    cr.clear();
    cr.add(aCr);
    if (existingCr != null && !existingCr.equals(aCr))
    {
      boolean didRemove = existingCr.removeRf(this);
      if (!didRemove)
      {
        cr.clear();
        cr.add(existingCr);
        return wasSet;
      }
    }
    aCr.addRf(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Cr> copyOfCr = new ArrayList<Cr>(cr);
    cr.clear();
    for(Cr aCr : copyOfCr)
    {
      aCr.removeRf(this);
    }
  }

}