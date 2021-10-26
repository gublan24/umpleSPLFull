/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 449 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Vt
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Vt Associations
  private List<Fv> fv;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Vt()
  {
    fv = new ArrayList<Fv>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Fv getFv(int index)
  {
    Fv aFv = fv.get(index);
    return aFv;
  }

  public List<Fv> getFv()
  {
    List<Fv> newFv = Collections.unmodifiableList(fv);
    return newFv;
  }

  public int numberOfFv()
  {
    int number = fv.size();
    return number;
  }

  public boolean hasFv()
  {
    boolean has = fv.size() > 0;
    return has;
  }

  public int indexOfFv(Fv aFv)
  {
    int index = fv.indexOf(aFv);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_fv()
  {
    fv.clear();
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Fvv getFv_OneFvv()
  {
    return (Fvv)fv.get(0);
  } 
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFv()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addFv(Fv aFv)
  {
    boolean wasAdded = false;
    if (fv.contains(aFv)) { return false; }
    fv.add(aFv);
    if (aFv.indexOfVt(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aFv.addVt(this);
      if (!wasAdded)
      {
        fv.remove(aFv);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeFv(Fv aFv)
  {
    boolean wasRemoved = false;
    if (!fv.contains(aFv))
    {
      return wasRemoved;
    }

    int oldIndex = fv.indexOf(aFv);
    fv.remove(oldIndex);
    if (aFv.indexOfVt(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aFv.removeVt(this);
      if (!wasRemoved)
      {
        fv.add(oldIndex,aFv);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFvAt(Fv aFv, int index)
  {  
    boolean wasAdded = false;
    if(addFv(aFv))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFv()) { index = numberOfFv() - 1; }
      fv.remove(aFv);
      fv.add(index, aFv);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFvAt(Fv aFv, int index)
  {
    boolean wasAdded = false;
    if(fv.contains(aFv))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFv()) { index = numberOfFv() - 1; }
      fv.remove(aFv);
      fv.add(index, aFv);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFvAt(aFv, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOptionalOneToOptionalN_relatedSpecialization */
  public boolean setFv_Fvv(Fvv aFv)
  {
    boolean wasSet = false;
    if (aFv != null && aFv.numberOfVt() >= Fvv.maximumNumberOfVt_Vt())
    {
      return wasSet;
    }

    Fvv existingFv = getFv_OneFvv();
    fv.clear();
    fv.add(aFv);
    if (existingFv != null && !existingFv.equals(aFv))
    {
      existingFv.removeVt(this);
    }
    if (aFv != null)
    {
      aFv.addVt(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Fv> copyOfFv = new ArrayList<Fv>(fv);
    fv.clear();
    for(Fv aFv : copyOfFv)
    {
      aFv.removeVt(this);
    }
  }

}