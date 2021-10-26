/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 490 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ik
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ik Associations
  private List<Mi> mi;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ik()
  {
    mi = new ArrayList<Mi>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Mi getMi(int index)
  {
    Mi aMi = mi.get(index);
    return aMi;
  }

  public List<Mi> getMi()
  {
    List<Mi> newMi = Collections.unmodifiableList(mi);
    return newMi;
  }

  public int numberOfMi()
  {
    int number = mi.size();
    return number;
  }

  public boolean hasMi()
  {
    boolean has = mi.size() > 0;
    return has;
  }

  public int indexOfMi(Mi aMi)
  {
    int index = mi.indexOf(aMi);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_mi()
  {
    mi.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Mii getMi_Mii(int index)
  {
    Mii aMi = (Mii)mi.get(index);
    return aMi;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Mii> getMi_Mii()
  {
    List<? extends Mi> newMi = Collections.unmodifiableList(mi);
    return (List<Mii>)newMi;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMi()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addMi(Mi aMi)
  {
    boolean wasAdded = false;
    if (mi.contains(aMi)) { return false; }
    if (mi.contains(aMi)) { return false; }
    mi.add(aMi);
    if (aMi.indexOfIk(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aMi.addIk(this);
      if (!wasAdded)
      {
        mi.remove(aMi);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeMi(Mi aMi)
  {
    boolean wasRemoved = false;
    if (!mi.contains(aMi))
    {
      return wasRemoved;
    }

    int oldIndex = mi.indexOf(aMi);
    mi.remove(oldIndex);
    if (aMi.indexOfIk(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aMi.removeIk(this);
      if (!wasRemoved)
      {
        mi.add(oldIndex,aMi);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMiAt(Mi aMi, int index)
  {  
    boolean wasAdded = false;
    if(addMi(aMi))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMi()) { index = numberOfMi() - 1; }
      mi.remove(aMi);
      mi.add(index, aMi);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMiAt(Mi aMi, int index)
  {
    boolean wasAdded = false;
    if(mi.contains(aMi))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMi()) { index = numberOfMi() - 1; }
      mi.remove(aMi);
      mi.add(index, aMi);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMiAt(aMi, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfMi_Mii()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_relatedSpecialization */
  public static int maximumNumberOfMi_Mii()
  {
    return 6;
  }
  /* Code from template association_AddUnidirectionalOptionalN_relatedSpecialization */
  public boolean addMi(Mii aMi)
  {
    boolean wasAdded = false;
    if (mi.contains(aMi)) { return false; }
    if (mi.contains(aMi)) { return false; }
    if (numberOfMi() < maximumNumberOfMi_Mii())
    {
      mi.add(aMi);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean removeMi(Mii aMi)
  {
    boolean wasRemoved = false;
    if (mi.contains(aMi))
    {
      mi.remove(aMi);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_SetUnidirectionalOptionalN_relatedSpecialization */
  public boolean setMi(Mii... newMi)
  {
    boolean wasSet = false;
    ArrayList<Mii> verifiedMi = new ArrayList<Mii>();
    for (Mii aMi : newMi)
    {
      if (verifiedMi.contains(aMi))
      {
        continue;
      }
      verifiedMi.add(aMi);
    }

    if (verifiedMi.size() != newMi.length || verifiedMi.size() > maximumNumberOfMi_Mii())
    {
      return wasSet;
    }

    mi.clear();
    mi.addAll(verifiedMi);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */
  public boolean addMiAt(Mii aMi, int index)
  {  
    boolean wasAdded = false;
    if(addMi(aMi))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMi()) { index = numberOfMi() - 1; }
      mi.remove(aMi);
      mi.add(index, aMi);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMiAt(Mii aMi, int index)
  {
    boolean wasAdded = false;
    if(mi.contains(aMi))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMi()) { index = numberOfMi() - 1; }
      mi.remove(aMi);
      mi.add(index, aMi);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMiAt(aMi, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Mi> copyOfMi = new ArrayList<Mi>(mi);
    mi.clear();
    for(Mi aMi : copyOfMi)
    {
      aMi.removeIk(this);
    }
  }

}