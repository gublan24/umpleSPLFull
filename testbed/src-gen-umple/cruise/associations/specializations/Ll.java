/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [23]
 */
// line 259 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ll
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ll Associations
  private List<Kk> k;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ll()
  {
    k = new ArrayList<Kk>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Kk getK(int index)
  {
    Kk aK = k.get(index);
    return aK;
  }

  public List<Kk> getK()
  {
    List<Kk> newK = Collections.unmodifiableList(k);
    return newK;
  }

  public int numberOfK()
  {
    int number = k.size();
    return number;
  }

  public boolean hasK()
  {
    boolean has = k.size() > 0;
    return has;
  }

  public int indexOfK(Kk aK)
  {
    int index = k.indexOf(aK);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_k()
  {
    k.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfK()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addK(Kk aK)
  {
    boolean wasAdded = false;
    if (k.contains(aK)) { return false; }
    k.add(aK);
    if (aK.indexOfL(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aK.addL(this);
      if (!wasAdded)
      {
        k.remove(aK);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeK(Kk aK)
  {
    boolean wasRemoved = false;
    if (!k.contains(aK))
    {
      return wasRemoved;
    }

    int oldIndex = k.indexOf(aK);
    k.remove(oldIndex);
    if (aK.indexOfL(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aK.removeL(this);
      if (!wasRemoved)
      {
        k.add(oldIndex,aK);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addKAt(Kk aK, int index)
  {  
    boolean wasAdded = false;
    if(addK(aK))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfK()) { index = numberOfK() - 1; }
      k.remove(aK);
      k.add(index, aK);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveKAt(Kk aK, int index)
  {
    boolean wasAdded = false;
    if(k.contains(aK))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfK()) { index = numberOfK() - 1; }
      k.remove(aK);
      k.add(index, aK);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addKAt(aK, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Kk> copyOfK = new ArrayList<Kk>(k);
    k.clear();
    for(Kk aK : copyOfK)
    {
      aK.removeL(this);
    }
  }

}