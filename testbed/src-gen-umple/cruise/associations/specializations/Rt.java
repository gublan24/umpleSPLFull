/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 305 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Rt
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Rt Associations
  private List<Er> er;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Rt()
  {
    er = new ArrayList<Er>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Er getEr(int index)
  {
    Er aEr = er.get(index);
    return aEr;
  }

  public List<Er> getEr()
  {
    List<Er> newEr = Collections.unmodifiableList(er);
    return newEr;
  }

  public int numberOfEr()
  {
    int number = er.size();
    return number;
  }

  public boolean hasEr()
  {
    boolean has = er.size() > 0;
    return has;
  }

  public int indexOfEr(Er aEr)
  {
    int index = er.indexOf(aEr);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_er()
  {
    er.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEr()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addEr(Er aEr)
  {
    boolean wasAdded = false;
    if (er.contains(aEr)) { return false; }
    er.add(aEr);
    if (aEr.indexOfRt(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aEr.addRt(this);
      if (!wasAdded)
      {
        er.remove(aEr);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeEr(Er aEr)
  {
    boolean wasRemoved = false;
    if (!er.contains(aEr))
    {
      return wasRemoved;
    }

    int oldIndex = er.indexOf(aEr);
    er.remove(oldIndex);
    if (aEr.indexOfRt(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aEr.removeRt(this);
      if (!wasRemoved)
      {
        er.add(oldIndex,aEr);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addErAt(Er aEr, int index)
  {  
    boolean wasAdded = false;
    if(addEr(aEr))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEr()) { index = numberOfEr() - 1; }
      er.remove(aEr);
      er.add(index, aEr);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveErAt(Er aEr, int index)
  {
    boolean wasAdded = false;
    if(er.contains(aEr))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEr()) { index = numberOfEr() - 1; }
      er.remove(aEr);
      er.add(index, aEr);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addErAt(aEr, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Er> copyOfEr = new ArrayList<Er>(er);
    er.clear();
    for(Er aEr : copyOfEr)
    {
      aEr.removeRt(this);
    }
  }

}