/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 391 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Bn
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Bn Associations
  private List<Vb> vb;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Bn()
  {
    vb = new ArrayList<Vb>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Vb getVb(int index)
  {
    Vb aVb = vb.get(index);
    return aVb;
  }

  public List<Vb> getVb()
  {
    List<Vb> newVb = Collections.unmodifiableList(vb);
    return newVb;
  }

  public int numberOfVb()
  {
    int number = vb.size();
    return number;
  }

  public boolean hasVb()
  {
    boolean has = vb.size() > 0;
    return has;
  }

  public int indexOfVb(Vb aVb)
  {
    int index = vb.indexOf(aVb);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_vb()
  {
    vb.clear();
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Vbb getVb_OneVbb()
  {
    return (Vbb)vb.get(0);
  } 
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfVb()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addVb(Vb aVb)
  {
    boolean wasAdded = false;
    if (vb.contains(aVb)) { return false; }
    vb.add(aVb);
    if (aVb.indexOfBn(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aVb.addBn(this);
      if (!wasAdded)
      {
        vb.remove(aVb);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeVb(Vb aVb)
  {
    boolean wasRemoved = false;
    if (!vb.contains(aVb))
    {
      return wasRemoved;
    }

    int oldIndex = vb.indexOf(aVb);
    vb.remove(oldIndex);
    if (aVb.indexOfBn(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aVb.removeBn(this);
      if (!wasRemoved)
      {
        vb.add(oldIndex,aVb);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addVbAt(Vb aVb, int index)
  {  
    boolean wasAdded = false;
    if(addVb(aVb))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVb()) { index = numberOfVb() - 1; }
      vb.remove(aVb);
      vb.add(index, aVb);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveVbAt(Vb aVb, int index)
  {
    boolean wasAdded = false;
    if(vb.contains(aVb))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVb()) { index = numberOfVb() - 1; }
      vb.remove(aVb);
      vb.add(index, aVb);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addVbAt(aVb, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOneToAtMostN_relatedSpecialization */
  public boolean setVb_Vbb(Vbb aVb)
  {
    boolean wasSet = false;
    //Must provide vb to bn
    if (aVb == null)
    {
      return wasSet;
    }

    //vb already at maximum (4)
    if (aVb.numberOfBn() >= Vbb.maximumNumberOfBn_Bn())
    {
      return wasSet;
    }
    
    Vbb existingVb = getVb_OneVbb();
    vb.clear();
    vb.add(aVb);
    if (existingVb != null && !existingVb.equals(aVb))
    {
      boolean didRemove = existingVb.removeBn(this);
      if (!didRemove)
      {
        vb.clear();
        vb.add(existingVb);
        return wasSet;
      }
    }
    aVb.addBn(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Vb> copyOfVb = new ArrayList<Vb>(vb);
    vb.clear();
    for(Vb aVb : copyOfVb)
    {
      aVb.removeBn(this);
    }
  }

}