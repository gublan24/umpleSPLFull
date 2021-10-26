/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;
import java.util.*;

/**
 * ------------------------------- Comapny - Manager semantic tests
 * Bidirectional (--)
 */
// line 8 "../../../../src/TestHarnessTracerAssociations.ump"
public class CompanyBiManyToManyRole
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CompanyBiManyToManyRole Associations
  private List<Manager> managerA;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CompanyBiManyToManyRole()
  {
    managerA = new ArrayList<Manager>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Manager getManagerA(int index)
  {
    Manager aManagerA = managerA.get(index);
    return aManagerA;
  }

  public List<Manager> getManagerA()
  {
    List<Manager> newManagerA = Collections.unmodifiableList(managerA);
    return newManagerA;
  }

  public int numberOfManagerA()
  {
    int number = managerA.size();
    return number;
  }

  public boolean hasManagerA()
  {
    boolean has = managerA.size() > 0;
    return has;
  }

  public int indexOfManagerA(Manager aManagerA)
  {
    int index = managerA.indexOf(aManagerA);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfManagerA()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addManagerA(Manager aManagerA)
  {
    boolean wasAdded = false;
    if (managerA.contains(aManagerA)) { return false; }
    managerA.add(aManagerA);
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,11,CompanyBiManyToManyRole+Manager,"+System.identityHashCode(this)+",as_a,managerA,"+numberOfManagerA() );
    if (aManagerA.indexOfCompanyBiManyToManyRole(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aManagerA.addCompanyBiManyToManyRole(this);
      if (!wasAdded)
      {
        managerA.remove(aManagerA);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeManagerA(Manager aManagerA)
  {
    boolean wasRemoved = false;
    if (!managerA.contains(aManagerA))
    {
      return wasRemoved;
    }

    int oldIndex = managerA.indexOf(aManagerA);
    managerA.remove(oldIndex);
    if (aManagerA.indexOfCompanyBiManyToManyRole(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aManagerA.removeCompanyBiManyToManyRole(this);
      if (!wasRemoved)
      {
        managerA.add(oldIndex,aManagerA);
      }
    }
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,11,CompanyBiManyToManyRole+Manager,"+System.identityHashCode(this)+",as_r,managerA,"+numberOfManagerA() );
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addManagerAAt(Manager aManagerA, int index)
  {  
    boolean wasAdded = false;
    if(addManagerA(aManagerA))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfManagerA()) { index = numberOfManagerA() - 1; }
      managerA.remove(aManagerA);
      managerA.add(index, aManagerA);
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,11,CompanyBiManyToManyRole+Manager,"+System.identityHashCode(this)+",as_a,managerA,"+numberOfManagerA() );
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveManagerAAt(Manager aManagerA, int index)
  {
    boolean wasAdded = false;
    if(managerA.contains(aManagerA))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfManagerA()) { index = numberOfManagerA() - 1; }
      managerA.remove(aManagerA);
      managerA.add(index, aManagerA);
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,11,CompanyBiManyToManyRole+Manager,"+System.identityHashCode(this)+",as_a,managerA,"+numberOfManagerA() );
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addManagerAAt(aManagerA, index);
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,11,CompanyBiManyToManyRole+Manager,"+System.identityHashCode(this)+",as_a,managerA,"+numberOfManagerA() );
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Manager> copyOfManagerA = new ArrayList<Manager>(managerA);
    managerA.clear();
    for(Manager aManagerA : copyOfManagerA)
    {
      aManagerA.removeCompanyBiManyToManyRole(this);
    }
  }

}