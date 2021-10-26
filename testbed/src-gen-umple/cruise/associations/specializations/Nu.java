/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 474 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Nu
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Nu Associations
  private List<Hn> hn;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Nu(Hnn... allHn)
  {
    hn = new ArrayList<Hn>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Hn getHn(int index)
  {
    Hn aHn = hn.get(index);
    return aHn;
  }

  public List<Hn> getHn()
  {
    List<Hn> newHn = Collections.unmodifiableList(hn);
    return newHn;
  }

  public int numberOfHn()
  {
    int number = hn.size();
    return number;
  }

  public boolean hasHn()
  {
    boolean has = hn.size() > 0;
    return has;
  }

  public int indexOfHn(Hn aHn)
  {
    int index = hn.indexOf(aHn);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_hn()
  {
    hn.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Hnn getHn_Hnn(int index)
  {
    Hnn aHn = (Hnn)hn.get(index);
    return aHn;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Hnn> getHn_Hnn()
  {
    List<? extends Hn> newHn = Collections.unmodifiableList(hn);
    return (List<Hnn>)newHn;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfHn()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addHn(Hn aHn)
  {
    boolean wasAdded = false;
    if (hn.contains(aHn)) { return false; }
    if (hn.contains(aHn)) { return false; }
    hn.add(aHn);
    if (aHn.indexOfNu(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aHn.addNu(this);
      if (!wasAdded)
      {
        hn.remove(aHn);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeHn(Hn aHn)
  {
    boolean wasRemoved = false;
    if (!hn.contains(aHn))
    {
      return wasRemoved;
    }

    int oldIndex = hn.indexOf(aHn);
    hn.remove(oldIndex);
    if (aHn.indexOfNu(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aHn.removeNu(this);
      if (!wasRemoved)
      {
        hn.add(oldIndex,aHn);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addHnAt(Hn aHn, int index)
  {  
    boolean wasAdded = false;
    if(addHn(aHn))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHn()) { index = numberOfHn() - 1; }
      hn.remove(aHn);
      hn.add(index, aHn);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveHnAt(Hn aHn, int index)
  {
    boolean wasAdded = false;
    if(hn.contains(aHn))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHn()) { index = numberOfHn() - 1; }
      hn.remove(aHn);
      hn.add(index, aHn);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addHnAt(aHn, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfHn_Hnn()
  {
    return 4;
  }
  /* Code from template association_MaximumNumberOfMethod_relatedSpecialization */
  public static int maximumNumberOfHn_Hnn()
  {
    return 8;
  }
  /* Code from template association_AddUnidirectionalMN_relatedSpecialization */
  public boolean addHn(Hnn aHn)
  {
    boolean wasAdded = false;
    if (hn.contains(aHn)) { return false; }
    if (hn.contains(aHn)) { return false; }
    if (numberOfHn() < maximumNumberOfHn_Hnn())
    {
      hn.add(aHn);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean removeHn(Hnn aHn)
  {
    boolean wasRemoved = false;
    if (!hn.contains(aHn))
    {
      return wasRemoved;
    }

    if (numberOfHn() <= minimumNumberOfHn_Hnn())
    {
      return wasRemoved;
    }

    hn.remove(aHn);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_SetUnidirectionalMN_relatedSpecialization */
  public boolean setHn(Hnn... newHn)
  {
    boolean wasSet = false;
    ArrayList<Hnn> verifiedHn = new ArrayList<Hnn>();
    for (Hnn aHn : newHn)
    {
      if (verifiedHn.contains(aHn))
      {
        continue;
      }
      verifiedHn.add(aHn);
    }

    if (verifiedHn.size() != newHn.length || verifiedHn.size() < minimumNumberOfHn_Hnn() || verifiedHn.size() > maximumNumberOfHn_Hnn())
    {
      return wasSet;
    }

    hn.clear();
    hn.addAll(verifiedHn);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */
  public boolean addHnAt(Hnn aHn, int index)
  {  
    boolean wasAdded = false;
    if(addHn(aHn))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHn()) { index = numberOfHn() - 1; }
      hn.remove(aHn);
      hn.add(index, aHn);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveHnAt(Hnn aHn, int index)
  {
    boolean wasAdded = false;
    if(hn.contains(aHn))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHn()) { index = numberOfHn() - 1; }
      hn.remove(aHn);
      hn.add(index, aHn);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addHnAt(aHn, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Hn> copyOfHn = new ArrayList<Hn>(hn);
    hn.clear();
    for(Hn aHn : copyOfHn)
    {
      aHn.removeNu(this);
    }
  }

}