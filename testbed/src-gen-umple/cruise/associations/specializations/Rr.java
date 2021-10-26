/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 180 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Rr
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Rr Associations
  private List<Ee> e;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Rr()
  {
    e = new ArrayList<Ee>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Ee getE(int index)
  {
    Ee aE = e.get(index);
    return aE;
  }

  public List<Ee> getE()
  {
    List<Ee> newE = Collections.unmodifiableList(e);
    return newE;
  }

  public int numberOfE()
  {
    int number = e.size();
    return number;
  }

  public boolean hasE()
  {
    boolean has = e.size() > 0;
    return has;
  }

  public int indexOfE(Ee aE)
  {
    int index = e.indexOf(aE);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_e()
  {
    e.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfE()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfE()
  {
    return 5;
  }
  /* Code from template association_AddOptionalNToOptionalOne */
  public boolean addE(Ee aE)
  {
    boolean wasAdded = false;
    if (e.contains(aE)) { return false; }
    if (numberOfE() >= maximumNumberOfE())
    {
      return wasAdded;
    }

    Rr existingR = aE.getR();
    if (existingR == null)
    {
      aE.setR(this);
    }
    else if (!this.equals(existingR))
    {
      existingR.removeE(aE);
      addE(aE);
    }
    else
    {
      e.add(aE);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeE(Ee aE)
  {
    boolean wasRemoved = false;
    if (e.contains(aE))
    {
      e.remove(aE);
      aE.setR(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEAt(Ee aE, int index)
  {  
    boolean wasAdded = false;
    if(addE(aE))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfE()) { index = numberOfE() - 1; }
      e.remove(aE);
      e.add(index, aE);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEAt(Ee aE, int index)
  {
    boolean wasAdded = false;
    if(e.contains(aE))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfE()) { index = numberOfE() - 1; }
      e.remove(aE);
      e.add(index, aE);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEAt(aE, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !e.isEmpty() )
    {
      e.get(0).setR(null);
    }
  }

}