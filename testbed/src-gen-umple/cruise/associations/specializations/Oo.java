/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * Many to many down to many to MN                                [18]
 */
// line 209 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Oo
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Oo Associations
  private List<Pp> p;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Oo(Pp... allP)
  {
    p = new ArrayList<Pp>();
    boolean didAddP = setP(allP);
    if (!didAddP)
    {
      throw new RuntimeException("Unable to create Oo, must have 1 to 5 p. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Pp getP(int index)
  {
    Pp aP = p.get(index);
    return aP;
  }

  public List<Pp> getP()
  {
    List<Pp> newP = Collections.unmodifiableList(p);
    return newP;
  }

  public int numberOfP()
  {
    int number = p.size();
    return number;
  }

  public boolean hasP()
  {
    boolean has = p.size() > 0;
    return has;
  }

  public int indexOfP(Pp aP)
  {
    int index = p.indexOf(aP);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_p()
  {
    p.clear();
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfPValid()
  {
    boolean isValid = numberOfP() >= minimumNumberOfP() && numberOfP() <= maximumNumberOfP();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfP()
  {
    return 1;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfP()
  {
    return 5;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addP(Pp aP)
  {
    boolean wasAdded = false;
    if (p.contains(aP)) { return false; }
    if (numberOfP() >= maximumNumberOfP())
    {
      return wasAdded;
    }

    p.add(aP);
    if (aP.indexOfO(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aP.addO(this);
      if (!wasAdded)
      {
        p.remove(aP);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeP(Pp aP)
  {
    boolean wasRemoved = false;
    if (!p.contains(aP))
    {
      return wasRemoved;
    }

    if (numberOfP() <= minimumNumberOfP())
    {
      return wasRemoved;
    }

    int oldIndex = p.indexOf(aP);
    p.remove(oldIndex);
    if (aP.indexOfO(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aP.removeO(this);
      if (!wasRemoved)
      {
        p.add(oldIndex,aP);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setP(Pp... newP)
  {
    boolean wasSet = false;
    ArrayList<Pp> verifiedP = new ArrayList<Pp>();
    for (Pp aP : newP)
    {
      if (verifiedP.contains(aP))
      {
        continue;
      }
      verifiedP.add(aP);
    }

    if (verifiedP.size() != newP.length || verifiedP.size() < minimumNumberOfP() || verifiedP.size() > maximumNumberOfP())
    {
      return wasSet;
    }

    ArrayList<Pp> oldP = new ArrayList<Pp>(p);
    p.clear();
    for (Pp aNewP : verifiedP)
    {
      p.add(aNewP);
      if (oldP.contains(aNewP))
      {
        oldP.remove(aNewP);
      }
      else
      {
        aNewP.addO(this);
      }
    }

    for (Pp anOldP : oldP)
    {
      anOldP.removeO(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPAt(Pp aP, int index)
  {  
    boolean wasAdded = false;
    if(addP(aP))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfP()) { index = numberOfP() - 1; }
      p.remove(aP);
      p.add(index, aP);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePAt(Pp aP, int index)
  {
    boolean wasAdded = false;
    if(p.contains(aP))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfP()) { index = numberOfP() - 1; }
      p.remove(aP);
      p.add(index, aP);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPAt(aP, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Pp> copyOfP = new ArrayList<Pp>(p);
    p.clear();
    for(Pp aP : copyOfP)
    {
      aP.removeO(this);
    }
  }

}