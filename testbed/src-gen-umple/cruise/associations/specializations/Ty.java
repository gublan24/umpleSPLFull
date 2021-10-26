/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [29]
 */
// line 313 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ty
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ty Associations
  private List<Yu> yu;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ty()
  {
    yu = new ArrayList<Yu>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Yu getYu(int index)
  {
    Yu aYu = yu.get(index);
    return aYu;
  }

  public List<Yu> getYu()
  {
    List<Yu> newYu = Collections.unmodifiableList(yu);
    return newYu;
  }

  public int numberOfYu()
  {
    int number = yu.size();
    return number;
  }

  public boolean hasYu()
  {
    boolean has = yu.size() > 0;
    return has;
  }

  public int indexOfYu(Yu aYu)
  {
    int index = yu.indexOf(aYu);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_yu()
  {
    yu.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfYu()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addYu(Yu aYu)
  {
    boolean wasAdded = false;
    if (yu.contains(aYu)) { return false; }
    yu.add(aYu);
    if (aYu.indexOfTy(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aYu.addTy(this);
      if (!wasAdded)
      {
        yu.remove(aYu);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeYu(Yu aYu)
  {
    boolean wasRemoved = false;
    if (!yu.contains(aYu))
    {
      return wasRemoved;
    }

    int oldIndex = yu.indexOf(aYu);
    yu.remove(oldIndex);
    if (aYu.indexOfTy(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aYu.removeTy(this);
      if (!wasRemoved)
      {
        yu.add(oldIndex,aYu);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addYuAt(Yu aYu, int index)
  {  
    boolean wasAdded = false;
    if(addYu(aYu))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfYu()) { index = numberOfYu() - 1; }
      yu.remove(aYu);
      yu.add(index, aYu);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveYuAt(Yu aYu, int index)
  {
    boolean wasAdded = false;
    if(yu.contains(aYu))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfYu()) { index = numberOfYu() - 1; }
      yu.remove(aYu);
      yu.add(index, aYu);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addYuAt(aYu, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Yu> copyOfYu = new ArrayList<Yu>(yu);
    yu.clear();
    for(Yu aYu : copyOfYu)
    {
      aYu.removeTy(this);
    }
  }

}