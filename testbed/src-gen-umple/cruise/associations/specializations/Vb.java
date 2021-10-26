/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [38]
 */
// line 390 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Vb
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Vb Associations
  private List<Bn> bn;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Vb()
  {
    bn = new ArrayList<Bn>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Bn getBn(int index)
  {
    Bn aBn = bn.get(index);
    return aBn;
  }

  public List<Bn> getBn()
  {
    List<Bn> newBn = Collections.unmodifiableList(bn);
    return newBn;
  }

  public int numberOfBn()
  {
    int number = bn.size();
    return number;
  }

  public boolean hasBn()
  {
    boolean has = bn.size() > 0;
    return has;
  }

  public int indexOfBn(Bn aBn)
  {
    int index = bn.indexOf(aBn);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_bn()
  {
    bn.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBn()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addBn(Bn aBn)
  {
    boolean wasAdded = false;
    if (bn.contains(aBn)) { return false; }
    bn.add(aBn);
    if (aBn.indexOfVb(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aBn.addVb(this);
      if (!wasAdded)
      {
        bn.remove(aBn);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeBn(Bn aBn)
  {
    boolean wasRemoved = false;
    if (!bn.contains(aBn))
    {
      return wasRemoved;
    }

    int oldIndex = bn.indexOf(aBn);
    bn.remove(oldIndex);
    if (aBn.indexOfVb(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aBn.removeVb(this);
      if (!wasRemoved)
      {
        bn.add(oldIndex,aBn);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addBnAt(Bn aBn, int index)
  {  
    boolean wasAdded = false;
    if(addBn(aBn))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBn()) { index = numberOfBn() - 1; }
      bn.remove(aBn);
      bn.add(index, aBn);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBnAt(Bn aBn, int index)
  {
    boolean wasAdded = false;
    if(bn.contains(aBn))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBn()) { index = numberOfBn() - 1; }
      bn.remove(aBn);
      bn.add(index, aBn);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBnAt(aBn, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Bn> copyOfBn = new ArrayList<Bn>(bn);
    bn.clear();
    for(Bn aBn : copyOfBn)
    {
      aBn.removeVb(this);
    }
  }

}