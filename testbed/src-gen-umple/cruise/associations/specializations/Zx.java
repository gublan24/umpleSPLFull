/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 375 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Zx
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Zx Associations
  private List<Lz> lz;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Zx()
  {
    lz = new ArrayList<Lz>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Lz getLz(int index)
  {
    Lz aLz = lz.get(index);
    return aLz;
  }

  public List<Lz> getLz()
  {
    List<Lz> newLz = Collections.unmodifiableList(lz);
    return newLz;
  }

  public int numberOfLz()
  {
    int number = lz.size();
    return number;
  }

  public boolean hasLz()
  {
    boolean has = lz.size() > 0;
    return has;
  }

  public int indexOfLz(Lz aLz)
  {
    int index = lz.indexOf(aLz);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_lz()
  {
    lz.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Lzz getLz_Lzz(int index)
  {
    Lzz aLz = (Lzz)lz.get(index);
    return aLz;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Lzz> getLz_Lzz()
  {
    List<? extends Lz> newLz = Collections.unmodifiableList(lz);
    return (List<Lzz>)newLz;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfLz()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addLz(Lz aLz)
  {
    boolean wasAdded = false;
    if (lz.contains(aLz)) { return false; }
    if (lz.contains(aLz)) { return false; }
    lz.add(aLz);
    if (aLz.indexOfZx(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aLz.addZx(this);
      if (!wasAdded)
      {
        lz.remove(aLz);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeLz(Lz aLz)
  {
    boolean wasRemoved = false;
    if (!lz.contains(aLz))
    {
      return wasRemoved;
    }

    int oldIndex = lz.indexOf(aLz);
    lz.remove(oldIndex);
    if (aLz.indexOfZx(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aLz.removeZx(this);
      if (!wasRemoved)
      {
        lz.add(oldIndex,aLz);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addLzAt(Lz aLz, int index)
  {  
    boolean wasAdded = false;
    if(addLz(aLz))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLz()) { index = numberOfLz() - 1; }
      lz.remove(aLz);
      lz.add(index, aLz);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveLzAt(Lz aLz, int index)
  {
    boolean wasAdded = false;
    if(lz.contains(aLz))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLz()) { index = numberOfLz() - 1; }
      lz.remove(aLz);
      lz.add(index, aLz);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addLzAt(aLz, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfLz_Lzz()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne_relatedSpecialization */
  public boolean addLz(Lzz aLz)
  {
    boolean wasAdded = false;
    if (lz.contains(aLz)) { return false; }
    if (lz.contains(aLz)) { return false; }
    Zx existingZx = aLz.getZx_OneZx();
    if (existingZx == null)
    {
      aLz.clear_zx();
      aLz.addZx(this);
    }
    else if (!this.equals(existingZx))
    {
      existingZx.removeLz(aLz);
      addLz(aLz);
    }
    else
    {
      lz.add(aLz);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeLz(Lzz aLz)
  {
    boolean wasRemoved = false;
    if (lz.contains(aLz))
    {
      lz.remove(aLz);
      aLz.clear_zx();
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */
  public boolean addLzAt(Lzz aLz, int index)
  {  
    boolean wasAdded = false;
    if(addLz(aLz))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLz()) { index = numberOfLz() - 1; }
      lz.remove(aLz);
      lz.add(index, aLz);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveLzAt(Lzz aLz, int index)
  {
    boolean wasAdded = false;
    if(lz.contains(aLz))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLz()) { index = numberOfLz() - 1; }
      lz.remove(aLz);
      lz.add(index, aLz);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addLzAt(aLz, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Lz> copyOfLz = new ArrayList<Lz>(lz);
    lz.clear();
    for(Lz aLz : copyOfLz)
    {
      aLz.removeZx(this);
    }
  }

}