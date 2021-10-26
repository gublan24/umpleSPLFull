/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;
import java.util.*;

// line 20 "../../../../src/TestHarnessTracerAssociations.ump"
public class CompanyBiManyToManyRemove
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CompanyBiManyToManyRemove Associations
  private List<Manager> managerC;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CompanyBiManyToManyRemove()
  {
    managerC = new ArrayList<Manager>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Manager getManagerC(int index)
  {
    Manager aManagerC = managerC.get(index);
    return aManagerC;
  }

  public List<Manager> getManagerC()
  {
    List<Manager> newManagerC = Collections.unmodifiableList(managerC);
    return newManagerC;
  }

  public int numberOfManagerC()
  {
    int number = managerC.size();
    return number;
  }

  public boolean hasManagerC()
  {
    boolean has = managerC.size() > 0;
    return has;
  }

  public int indexOfManagerC(Manager aManagerC)
  {
    int index = managerC.indexOf(aManagerC);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfManagerC()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addManagerC(Manager aManagerC)
  {
    boolean wasAdded = false;
    if (managerC.contains(aManagerC)) { return false; }
    managerC.add(aManagerC);
    if (aManagerC.indexOfCompanyBiManyToManyRemove(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aManagerC.addCompanyBiManyToManyRemove(this);
      if (!wasAdded)
      {
        managerC.remove(aManagerC);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeManagerC(Manager aManagerC)
  {
    boolean wasRemoved = false;
    if (!managerC.contains(aManagerC))
    {
      return wasRemoved;
    }

    int oldIndex = managerC.indexOf(aManagerC);
    managerC.remove(oldIndex);
    if (aManagerC.indexOfCompanyBiManyToManyRemove(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aManagerC.removeCompanyBiManyToManyRemove(this);
      if (!wasRemoved)
      {
        managerC.add(oldIndex,aManagerC);
      }
    }
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,23,CompanyBiManyToManyRemove+Manager,"+System.identityHashCode(this)+",as_r,managerC,"+numberOfManagerC() );
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addManagerCAt(Manager aManagerC, int index)
  {  
    boolean wasAdded = false;
    if(addManagerC(aManagerC))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfManagerC()) { index = numberOfManagerC() - 1; }
      managerC.remove(aManagerC);
      managerC.add(index, aManagerC);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveManagerCAt(Manager aManagerC, int index)
  {
    boolean wasAdded = false;
    if(managerC.contains(aManagerC))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfManagerC()) { index = numberOfManagerC() - 1; }
      managerC.remove(aManagerC);
      managerC.add(index, aManagerC);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addManagerCAt(aManagerC, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Manager> copyOfManagerC = new ArrayList<Manager>(managerC);
    managerC.clear();
    for(Manager aManagerC : copyOfManagerC)
    {
      aManagerC.removeCompanyBiManyToManyRemove(this);
    }
  }

}