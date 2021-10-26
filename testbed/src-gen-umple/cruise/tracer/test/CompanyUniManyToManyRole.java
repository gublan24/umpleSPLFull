/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;
import java.util.*;

/**
 * Unidirectional (->)
 */
// line 28 "../../../../src/TestHarnessTracerAssociations.ump"
public class CompanyUniManyToManyRole
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CompanyUniManyToManyRole Associations
  private List<Manager> managerA;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CompanyUniManyToManyRole()
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
  /* Code from template association_AddUnidirectionalMany */
  public boolean addManagerA(Manager aManagerA)
  {
    boolean wasAdded = false;
    if (managerA.contains(aManagerA)) { return false; }
    managerA.add(aManagerA);
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,31,CompanyUniManyToManyRole+Manager,"+System.identityHashCode(this)+",as_a,managerA,"+numberOfManagerA() );
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeManagerA(Manager aManagerA)
  {
    boolean wasRemoved = false;
    if (managerA.contains(aManagerA))
    {
      managerA.remove(aManagerA);
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,31,CompanyUniManyToManyRole+Manager,"+System.identityHashCode(this)+",as_r,managerA,"+numberOfManagerA() );
      wasRemoved = true;
    }
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
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,31,CompanyUniManyToManyRole+Manager,"+System.identityHashCode(this)+",as_a,managerA,"+numberOfManagerA() );
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
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,31,CompanyUniManyToManyRole+Manager,"+System.identityHashCode(this)+",as_a,managerA,"+numberOfManagerA() );
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addManagerAAt(aManagerA, index);
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,31,CompanyUniManyToManyRole+Manager,"+System.identityHashCode(this)+",as_a,managerA,"+numberOfManagerA() );
    }
    return wasAdded;
  }

  public void delete()
  {
    managerA.clear();
  }

}