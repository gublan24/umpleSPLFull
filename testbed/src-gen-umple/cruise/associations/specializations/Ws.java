/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 415 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ws
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ws Associations
  private List<Zw> zw;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ws()
  {
    zw = new ArrayList<Zw>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Zw getZw(int index)
  {
    Zw aZw = zw.get(index);
    return aZw;
  }

  public List<Zw> getZw()
  {
    List<Zw> newZw = Collections.unmodifiableList(zw);
    return newZw;
  }

  public int numberOfZw()
  {
    int number = zw.size();
    return number;
  }

  public boolean hasZw()
  {
    boolean has = zw.size() > 0;
    return has;
  }

  public int indexOfZw(Zw aZw)
  {
    int index = zw.indexOf(aZw);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_zw()
  {
    zw.clear();
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Zww getZw_OneZww()
  {
    return (Zww)zw.get(0);
  } 
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfZw()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addZw(Zw aZw)
  {
    boolean wasAdded = false;
    if (zw.contains(aZw)) { return false; }
    zw.add(aZw);
    if (aZw.indexOfW(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aZw.addW(this);
      if (!wasAdded)
      {
        zw.remove(aZw);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeZw(Zw aZw)
  {
    boolean wasRemoved = false;
    if (!zw.contains(aZw))
    {
      return wasRemoved;
    }

    int oldIndex = zw.indexOf(aZw);
    zw.remove(oldIndex);
    if (aZw.indexOfW(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aZw.removeW(this);
      if (!wasRemoved)
      {
        zw.add(oldIndex,aZw);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addZwAt(Zw aZw, int index)
  {  
    boolean wasAdded = false;
    if(addZw(aZw))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfZw()) { index = numberOfZw() - 1; }
      zw.remove(aZw);
      zw.add(index, aZw);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveZwAt(Zw aZw, int index)
  {
    boolean wasAdded = false;
    if(zw.contains(aZw))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfZw()) { index = numberOfZw() - 1; }
      zw.remove(aZw);
      zw.add(index, aZw);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addZwAt(aZw, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOneToMandatoryMany_relatedSpecialization */
  public boolean setZw_Zww(Zww aZw)
  {
    boolean wasSet = false;
    //Must provide zw to w
    if (aZw == null)
    {
      return wasSet;
    }

    if (getZw_OneZww() != null && getZw_OneZww().numberOfWs() <= Zww.minimumNumberOfWs_Ws())
    {
      return wasSet;
    }

    Zww existingZw = getZw_OneZww();
    zw.clear();
    zw.add(aZw);
    if (existingZw != null && !existingZw.equals(aZw))
    {
      boolean didRemove = existingZw.removeW(this);
      if (!didRemove)
      {
        zw.clear();
        zw.add(existingZw);
        return wasSet;
      }
    }
    getZw_OneZww().addW(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Zw> copyOfZw = new ArrayList<Zw>(zw);
    zw.clear();
    for(Zw aZw : copyOfZw)
    {
      aZw.removeW(this);
    }
  }

}