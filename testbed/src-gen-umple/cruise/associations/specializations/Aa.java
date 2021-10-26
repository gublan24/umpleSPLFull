/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [19]
 */
// line 219 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Aa
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Aa Associations
  private List<Ss> s;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Aa()
  {
    s = new ArrayList<Ss>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Ss getS(int index)
  {
    Ss aS = s.get(index);
    return aS;
  }

  public List<Ss> getS()
  {
    List<Ss> newS = Collections.unmodifiableList(s);
    return newS;
  }

  public int numberOfS()
  {
    int number = s.size();
    return number;
  }

  public boolean hasS()
  {
    boolean has = s.size() > 0;
    return has;
  }

  public int indexOfS(Ss aS)
  {
    int index = s.indexOf(aS);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_s()
  {
    s.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfS()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfS()
  {
    return 2;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addS(Ss aS)
  {
    boolean wasAdded = false;
    if (s.contains(aS)) { return false; }
    if (numberOfS() >= maximumNumberOfS())
    {
      return wasAdded;
    }

    s.add(aS);
    if (aS.indexOfA(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aS.addA(this);
      if (!wasAdded)
      {
        s.remove(aS);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeS(Ss aS)
  {
    boolean wasRemoved = false;
    if (!s.contains(aS))
    {
      return wasRemoved;
    }

    int oldIndex = s.indexOf(aS);
    s.remove(oldIndex);
    if (aS.indexOfA(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aS.removeA(this);
      if (!wasRemoved)
      {
        s.add(oldIndex,aS);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetOptionalNToMany */
  public boolean setS(Ss... newS)
  {
    boolean wasSet = false;
    ArrayList<Ss> verifiedS = new ArrayList<Ss>();
    for (Ss aS : newS)
    {
      if (verifiedS.contains(aS))
      {
        continue;
      }
      verifiedS.add(aS);
    }

    if (verifiedS.size() != newS.length || verifiedS.size() > maximumNumberOfS())
    {
      return wasSet;
    }

    ArrayList<Ss> oldS = new ArrayList<Ss>(s);
    s.clear();
    for (Ss aNewS : verifiedS)
    {
      s.add(aNewS);
      if (oldS.contains(aNewS))
      {
        oldS.remove(aNewS);
      }
      else
      {
        aNewS.addA(this);
      }
    }

    for (Ss anOldS : oldS)
    {
      anOldS.removeA(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSAt(Ss aS, int index)
  {  
    boolean wasAdded = false;
    if(addS(aS))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfS()) { index = numberOfS() - 1; }
      s.remove(aS);
      s.add(index, aS);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSAt(Ss aS, int index)
  {
    boolean wasAdded = false;
    if(s.contains(aS))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfS()) { index = numberOfS() - 1; }
      s.remove(aS);
      s.add(index, aS);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSAt(aS, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Ss> copyOfS = new ArrayList<Ss>(s);
    s.clear();
    for(Ss aS : copyOfS)
    {
      aS.removeA(this);
    }
  }

}