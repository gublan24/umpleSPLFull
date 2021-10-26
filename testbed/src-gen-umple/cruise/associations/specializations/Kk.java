/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 250 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Kk
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Kk Associations
  private List<Jj> j;
  private List<Ll> l;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Kk()
  {
    j = new ArrayList<Jj>();
    l = new ArrayList<Ll>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Jj getJ(int index)
  {
    Jj aJ = j.get(index);
    return aJ;
  }

  public List<Jj> getJ()
  {
    List<Jj> newJ = Collections.unmodifiableList(j);
    return newJ;
  }

  public int numberOfJ()
  {
    int number = j.size();
    return number;
  }

  public boolean hasJ()
  {
    boolean has = j.size() > 0;
    return has;
  }

  public int indexOfJ(Jj aJ)
  {
    int index = j.indexOf(aJ);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_j()
  {
    j.clear();
  }
  /* Code from template association_GetMany */
  public Ll getL(int index)
  {
    Ll aL = l.get(index);
    return aL;
  }

  public List<Ll> getL()
  {
    List<Ll> newL = Collections.unmodifiableList(l);
    return newL;
  }

  public int numberOfL()
  {
    int number = l.size();
    return number;
  }

  public boolean hasL()
  {
    boolean has = l.size() > 0;
    return has;
  }

  public int indexOfL(Ll aL)
  {
    int index = l.indexOf(aL);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_l()
  {
    l.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfJ()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addJ(Jj aJ)
  {
    boolean wasAdded = false;
    if (j.contains(aJ)) { return false; }
    j.add(aJ);
    if (aJ.indexOfK(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aJ.addK(this);
      if (!wasAdded)
      {
        j.remove(aJ);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeJ(Jj aJ)
  {
    boolean wasRemoved = false;
    if (!j.contains(aJ))
    {
      return wasRemoved;
    }

    int oldIndex = j.indexOf(aJ);
    j.remove(oldIndex);
    if (aJ.indexOfK(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aJ.removeK(this);
      if (!wasRemoved)
      {
        j.add(oldIndex,aJ);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addJAt(Jj aJ, int index)
  {  
    boolean wasAdded = false;
    if(addJ(aJ))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfJ()) { index = numberOfJ() - 1; }
      j.remove(aJ);
      j.add(index, aJ);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveJAt(Jj aJ, int index)
  {
    boolean wasAdded = false;
    if(j.contains(aJ))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfJ()) { index = numberOfJ() - 1; }
      j.remove(aJ);
      j.add(index, aJ);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addJAt(aJ, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfL()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addL(Ll aL)
  {
    boolean wasAdded = false;
    if (l.contains(aL)) { return false; }
    l.add(aL);
    if (aL.indexOfK(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aL.addK(this);
      if (!wasAdded)
      {
        l.remove(aL);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeL(Ll aL)
  {
    boolean wasRemoved = false;
    if (!l.contains(aL))
    {
      return wasRemoved;
    }

    int oldIndex = l.indexOf(aL);
    l.remove(oldIndex);
    if (aL.indexOfK(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aL.removeK(this);
      if (!wasRemoved)
      {
        l.add(oldIndex,aL);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addLAt(Ll aL, int index)
  {  
    boolean wasAdded = false;
    if(addL(aL))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfL()) { index = numberOfL() - 1; }
      l.remove(aL);
      l.add(index, aL);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveLAt(Ll aL, int index)
  {
    boolean wasAdded = false;
    if(l.contains(aL))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfL()) { index = numberOfL() - 1; }
      l.remove(aL);
      l.add(index, aL);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addLAt(aL, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Jj> copyOfJ = new ArrayList<Jj>(j);
    j.clear();
    for(Jj aJ : copyOfJ)
    {
      aJ.removeK(this);
    }
    ArrayList<Ll> copyOfL = new ArrayList<Ll>(l);
    l.clear();
    for(Ll aL : copyOfL)
    {
      aL.removeK(this);
    }
  }

}