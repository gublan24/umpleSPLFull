/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 561 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Rb
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Rb Associations
  private List<Fr> fr;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Rb()
  {
    fr = new ArrayList<Fr>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Fr getFr(int index)
  {
    Fr aFr = fr.get(index);
    return aFr;
  }

  public List<Fr> getFr()
  {
    List<Fr> newFr = Collections.unmodifiableList(fr);
    return newFr;
  }

  public int numberOfFr()
  {
    int number = fr.size();
    return number;
  }

  public boolean hasFr()
  {
    boolean has = fr.size() > 0;
    return has;
  }

  public int indexOfFr(Fr aFr)
  {
    int index = fr.indexOf(aFr);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_fr()
  {
    fr.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFr()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addFr(Fr aFr)
  {
    boolean wasAdded = false;
    if (fr.contains(aFr)) { return false; }
    fr.add(aFr);
    if (aFr.indexOfRb(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aFr.addRb(this);
      if (!wasAdded)
      {
        fr.remove(aFr);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeFr(Fr aFr)
  {
    boolean wasRemoved = false;
    if (!fr.contains(aFr))
    {
      return wasRemoved;
    }

    int oldIndex = fr.indexOf(aFr);
    fr.remove(oldIndex);
    if (aFr.indexOfRb(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aFr.removeRb(this);
      if (!wasRemoved)
      {
        fr.add(oldIndex,aFr);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFrAt(Fr aFr, int index)
  {  
    boolean wasAdded = false;
    if(addFr(aFr))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFr()) { index = numberOfFr() - 1; }
      fr.remove(aFr);
      fr.add(index, aFr);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFrAt(Fr aFr, int index)
  {
    boolean wasAdded = false;
    if(fr.contains(aFr))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFr()) { index = numberOfFr() - 1; }
      fr.remove(aFr);
      fr.add(index, aFr);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFrAt(aFr, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Fr> copyOfFr = new ArrayList<Fr>(fr);
    fr.clear();
    for(Fr aFr : copyOfFr)
    {
      aFr.removeRb(this);
    }
  }

}