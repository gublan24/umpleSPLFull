/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 383 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Cvv
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Cvv Associations
  private List<Xc> xc;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Cvv()
  {
    xc = new ArrayList<Xc>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Xc getXc(int index)
  {
    Xc aXc = xc.get(index);
    return aXc;
  }

  public List<Xc> getXc()
  {
    List<Xc> newXc = Collections.unmodifiableList(xc);
    return newXc;
  }

  public int numberOfXc()
  {
    int number = xc.size();
    return number;
  }

  public boolean hasXc()
  {
    boolean has = xc.size() > 0;
    return has;
  }

  public int indexOfXc(Xc aXc)
  {
    int index = xc.indexOf(aXc);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_xc()
  {
    xc.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Xcc getXc_Xcc(int index)
  {
    Xcc aXc = (Xcc)xc.get(index);
    return aXc;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Xcc> getXc_Xcc()
  {
    List<? extends Xc> newXc = Collections.unmodifiableList(xc);
    return (List<Xcc>)newXc;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfXc()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addXc(Xc aXc)
  {
    boolean wasAdded = false;
    if (xc.contains(aXc)) { return false; }
    if (xc.contains(aXc)) { return false; }
    xc.add(aXc);
    if (aXc.indexOfCvv(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aXc.addCvv(this);
      if (!wasAdded)
      {
        xc.remove(aXc);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeXc(Xc aXc)
  {
    boolean wasRemoved = false;
    if (!xc.contains(aXc))
    {
      return wasRemoved;
    }

    int oldIndex = xc.indexOf(aXc);
    xc.remove(oldIndex);
    if (aXc.indexOfCvv(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aXc.removeCvv(this);
      if (!wasRemoved)
      {
        xc.add(oldIndex,aXc);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addXcAt(Xc aXc, int index)
  {  
    boolean wasAdded = false;
    if(addXc(aXc))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfXc()) { index = numberOfXc() - 1; }
      xc.remove(aXc);
      xc.add(index, aXc);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveXcAt(Xc aXc, int index)
  {
    boolean wasAdded = false;
    if(xc.contains(aXc))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfXc()) { index = numberOfXc() - 1; }
      xc.remove(aXc);
      xc.add(index, aXc);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addXcAt(aXc, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfXc_Xcc()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod_relatedSpecialization */
  public boolean addXc(Xcc aXc)
  {
    boolean wasAdded = false;
    if (xc.contains(aXc)) { return false; }
    if (xc.contains(aXc)) { return false; }
    xc.add(aXc);
    if (aXc.indexOfCvv(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aXc.addCvv(this);
      if (!wasAdded)
      {
        xc.remove(aXc);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeXc(Xcc aXc)
  {
    boolean wasRemoved = false;
    if (!xc.contains(aXc))
    {
      return wasRemoved;
    }

    int oldIndex = xc.indexOf(aXc);
    xc.remove(oldIndex);
    if (aXc.indexOfCvv(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aXc.removeCvv(this);
      if (!wasRemoved)
      {
        xc.add(oldIndex,aXc);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */
  public boolean addXcAt(Xcc aXc, int index)
  {  
    boolean wasAdded = false;
    if(addXc(aXc))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfXc()) { index = numberOfXc() - 1; }
      xc.remove(aXc);
      xc.add(index, aXc);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveXcAt(Xcc aXc, int index)
  {
    boolean wasAdded = false;
    if(xc.contains(aXc))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfXc()) { index = numberOfXc() - 1; }
      xc.remove(aXc);
      xc.add(index, aXc);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addXcAt(aXc, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Xc> copyOfXc = new ArrayList<Xc>(xc);
    xc.clear();
    for(Xc aXc : copyOfXc)
    {
      aXc.removeCvv(this);
    }
  }

}