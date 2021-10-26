/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 482 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Jm
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Jm Associations
  private List<Uj> uj;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Jm(Ujj... allUj)
  {
    uj = new ArrayList<Uj>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Uj getUj(int index)
  {
    Uj aUj = uj.get(index);
    return aUj;
  }

  public List<Uj> getUj()
  {
    List<Uj> newUj = Collections.unmodifiableList(uj);
    return newUj;
  }

  public int numberOfUj()
  {
    int number = uj.size();
    return number;
  }

  public boolean hasUj()
  {
    boolean has = uj.size() > 0;
    return has;
  }

  public int indexOfUj(Uj aUj)
  {
    int index = uj.indexOf(aUj);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_uj()
  {
    uj.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Ujj getUj_Ujj(int index)
  {
    Ujj aUj = (Ujj)uj.get(index);
    return aUj;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Ujj> getUj_Ujj()
  {
    List<? extends Uj> newUj = Collections.unmodifiableList(uj);
    return (List<Ujj>)newUj;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUj()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addUj(Uj aUj)
  {
    boolean wasAdded = false;
    if (uj.contains(aUj)) { return false; }
    if (uj.contains(aUj)) { return false; }
    uj.add(aUj);
    if (aUj.indexOfJm(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUj.addJm(this);
      if (!wasAdded)
      {
        uj.remove(aUj);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeUj(Uj aUj)
  {
    boolean wasRemoved = false;
    if (!uj.contains(aUj))
    {
      return wasRemoved;
    }

    int oldIndex = uj.indexOf(aUj);
    uj.remove(oldIndex);
    if (aUj.indexOfJm(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUj.removeJm(this);
      if (!wasRemoved)
      {
        uj.add(oldIndex,aUj);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUjAt(Uj aUj, int index)
  {  
    boolean wasAdded = false;
    if(addUj(aUj))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUj()) { index = numberOfUj() - 1; }
      uj.remove(aUj);
      uj.add(index, aUj);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUjAt(Uj aUj, int index)
  {
    boolean wasAdded = false;
    if(uj.contains(aUj))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUj()) { index = numberOfUj() - 1; }
      uj.remove(aUj);
      uj.add(index, aUj);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUjAt(aUj, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfUj_Ujj()
  {
    return 5;
  }
  /* Code from template association_AddUnidirectionalMStar_relatedSpecialization */
  public boolean addUj(Ujj aUj)
  {
    boolean wasAdded = false;
    if (uj.contains(aUj)) { return false; }
    if (uj.contains(aUj)) { return false; }
    uj.add(aUj);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUj(Ujj aUj)
  {
    boolean wasRemoved = false;
    if (!uj.contains(aUj))
    {
      return wasRemoved;
    }

    if (numberOfUj() <= minimumNumberOfUj_Ujj())
    {
      return wasRemoved;
    }

    uj.remove(aUj);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_SetUnidirectionalMStar_relatedSpecialization */
  public boolean setUj(Ujj... newUj)
  {
    boolean wasSet = false;
    ArrayList<Ujj> verifiedUj = new ArrayList<Ujj>();
    for (Ujj aUj : newUj)
    {
      if (verifiedUj.contains(aUj))
      {
        continue;
      }
      verifiedUj.add(aUj);
    }

    if (verifiedUj.size() != newUj.length || verifiedUj.size() < minimumNumberOfUj_Ujj())
    {
      return wasSet;
    }

    uj.clear();
    uj.addAll(verifiedUj);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */
  public boolean addUjAt(Ujj aUj, int index)
  {  
    boolean wasAdded = false;
    if(addUj(aUj))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUj()) { index = numberOfUj() - 1; }
      uj.remove(aUj);
      uj.add(index, aUj);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUjAt(Ujj aUj, int index)
  {
    boolean wasAdded = false;
    if(uj.contains(aUj))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUj()) { index = numberOfUj() - 1; }
      uj.remove(aUj);
      uj.add(index, aUj);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUjAt(aUj, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Uj> copyOfUj = new ArrayList<Uj>(uj);
    uj.clear();
    for(Uj aUj : copyOfUj)
    {
      aUj.removeJm(this);
    }
  }

}