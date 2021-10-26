/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;
import java.util.*;

// line 40 "../../../../src/TestHarnessTracerAssociations.ump"
public class CompanyUniManyToManyRemove
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CompanyUniManyToManyRemove Associations
  private List<Manager> managerC;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CompanyUniManyToManyRemove()
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
  /* Code from template association_AddUnidirectionalMany */
  public boolean addManagerC(Manager aManagerC)
  {
    boolean wasAdded = false;
    if (managerC.contains(aManagerC)) { return false; }
    managerC.add(aManagerC);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeManagerC(Manager aManagerC)
  {
    boolean wasRemoved = false;
    if (managerC.contains(aManagerC))
    {
      managerC.remove(aManagerC);
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,43,CompanyUniManyToManyRemove+Manager,"+System.identityHashCode(this)+",as_r,managerC,"+numberOfManagerC() );
      wasRemoved = true;
    }
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
    managerC.clear();
  }

}