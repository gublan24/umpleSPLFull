/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 399 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Mq
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Mq Associations
  private List<Nm> nm;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Mq()
  {
    nm = new ArrayList<Nm>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Nm getNm(int index)
  {
    Nm aNm = nm.get(index);
    return aNm;
  }

  public List<Nm> getNm()
  {
    List<Nm> newNm = Collections.unmodifiableList(nm);
    return newNm;
  }

  public int numberOfNm()
  {
    int number = nm.size();
    return number;
  }

  public boolean hasNm()
  {
    boolean has = nm.size() > 0;
    return has;
  }

  public int indexOfNm(Nm aNm)
  {
    int index = nm.indexOf(aNm);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_nm()
  {
    nm.clear();
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Nmm getNm_OneNmm()
  {
    return (Nmm)nm.get(0);
  } 
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfNm()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addNm(Nm aNm)
  {
    boolean wasAdded = false;
    if (nm.contains(aNm)) { return false; }
    nm.add(aNm);
    if (aNm.indexOfMq(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aNm.addMq(this);
      if (!wasAdded)
      {
        nm.remove(aNm);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeNm(Nm aNm)
  {
    boolean wasRemoved = false;
    if (!nm.contains(aNm))
    {
      return wasRemoved;
    }

    int oldIndex = nm.indexOf(aNm);
    nm.remove(oldIndex);
    if (aNm.indexOfMq(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aNm.removeMq(this);
      if (!wasRemoved)
      {
        nm.add(oldIndex,aNm);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addNmAt(Nm aNm, int index)
  {  
    boolean wasAdded = false;
    if(addNm(aNm))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfNm()) { index = numberOfNm() - 1; }
      nm.remove(aNm);
      nm.add(index, aNm);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveNmAt(Nm aNm, int index)
  {
    boolean wasAdded = false;
    if(nm.contains(aNm))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfNm()) { index = numberOfNm() - 1; }
      nm.remove(aNm);
      nm.add(index, aNm);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addNmAt(aNm, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */
  public void delete()
  {
    ArrayList<Nm> copyOfNm = new ArrayList<Nm>(nm);
    nm.clear();
    for(Nm aNm : copyOfNm)
    {
      aNm.removeMq(this);
    }
  }

}