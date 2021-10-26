/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [31]
 */
// line 331 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Op
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Op Associations
  private List<Pa> pa;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Op()
  {
    pa = new ArrayList<Pa>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Pa getPa(int index)
  {
    Pa aPa = pa.get(index);
    return aPa;
  }

  public List<Pa> getPa()
  {
    List<Pa> newPa = Collections.unmodifiableList(pa);
    return newPa;
  }

  public int numberOfPa()
  {
    int number = pa.size();
    return number;
  }

  public boolean hasPa()
  {
    boolean has = pa.size() > 0;
    return has;
  }

  public int indexOfPa(Pa aPa)
  {
    int index = pa.indexOf(aPa);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_pa()
  {
    pa.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPa()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addPa(Pa aPa)
  {
    boolean wasAdded = false;
    if (pa.contains(aPa)) { return false; }
    pa.add(aPa);
    if (aPa.indexOfOp(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPa.addOp(this);
      if (!wasAdded)
      {
        pa.remove(aPa);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removePa(Pa aPa)
  {
    boolean wasRemoved = false;
    if (!pa.contains(aPa))
    {
      return wasRemoved;
    }

    int oldIndex = pa.indexOf(aPa);
    pa.remove(oldIndex);
    if (aPa.indexOfOp(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPa.removeOp(this);
      if (!wasRemoved)
      {
        pa.add(oldIndex,aPa);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPaAt(Pa aPa, int index)
  {  
    boolean wasAdded = false;
    if(addPa(aPa))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPa()) { index = numberOfPa() - 1; }
      pa.remove(aPa);
      pa.add(index, aPa);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePaAt(Pa aPa, int index)
  {
    boolean wasAdded = false;
    if(pa.contains(aPa))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPa()) { index = numberOfPa() - 1; }
      pa.remove(aPa);
      pa.add(index, aPa);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPaAt(aPa, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Pa> copyOfPa = new ArrayList<Pa>(pa);
    pa.clear();
    for(Pa aPa : copyOfPa)
    {
      aPa.removeOp(this);
    }
  }

}