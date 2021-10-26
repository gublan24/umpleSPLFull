/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;
import java.util.*;

// line 14 "../../../../src/TestHarnessTracerAssociations.ump"
public class CompanyBiManyToManyAdd
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CompanyBiManyToManyAdd Associations
  private List<Manager> managerB;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CompanyBiManyToManyAdd()
  {
    managerB = new ArrayList<Manager>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Manager getManagerB(int index)
  {
    Manager aManagerB = managerB.get(index);
    return aManagerB;
  }

  public List<Manager> getManagerB()
  {
    List<Manager> newManagerB = Collections.unmodifiableList(managerB);
    return newManagerB;
  }

  public int numberOfManagerB()
  {
    int number = managerB.size();
    return number;
  }

  public boolean hasManagerB()
  {
    boolean has = managerB.size() > 0;
    return has;
  }

  public int indexOfManagerB(Manager aManagerB)
  {
    int index = managerB.indexOf(aManagerB);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfManagerB()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addManagerB(Manager aManagerB)
  {
    boolean wasAdded = false;
    if (managerB.contains(aManagerB)) { return false; }
    managerB.add(aManagerB);
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,17,CompanyBiManyToManyAdd+Manager,"+System.identityHashCode(this)+",as_a,managerB,"+numberOfManagerB() );
    if (aManagerB.indexOfCompanyBiManyToManyAdd(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aManagerB.addCompanyBiManyToManyAdd(this);
      if (!wasAdded)
      {
        managerB.remove(aManagerB);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeManagerB(Manager aManagerB)
  {
    boolean wasRemoved = false;
    if (!managerB.contains(aManagerB))
    {
      return wasRemoved;
    }

    int oldIndex = managerB.indexOf(aManagerB);
    managerB.remove(oldIndex);
    if (aManagerB.indexOfCompanyBiManyToManyAdd(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aManagerB.removeCompanyBiManyToManyAdd(this);
      if (!wasRemoved)
      {
        managerB.add(oldIndex,aManagerB);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addManagerBAt(Manager aManagerB, int index)
  {  
    boolean wasAdded = false;
    if(addManagerB(aManagerB))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfManagerB()) { index = numberOfManagerB() - 1; }
      managerB.remove(aManagerB);
      managerB.add(index, aManagerB);
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,17,CompanyBiManyToManyAdd+Manager,"+System.identityHashCode(this)+",as_a,managerB,"+numberOfManagerB() );
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveManagerBAt(Manager aManagerB, int index)
  {
    boolean wasAdded = false;
    if(managerB.contains(aManagerB))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfManagerB()) { index = numberOfManagerB() - 1; }
      managerB.remove(aManagerB);
      managerB.add(index, aManagerB);
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,17,CompanyBiManyToManyAdd+Manager,"+System.identityHashCode(this)+",as_a,managerB,"+numberOfManagerB() );
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addManagerBAt(aManagerB, index);
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAssociations.ump,17,CompanyBiManyToManyAdd+Manager,"+System.identityHashCode(this)+",as_a,managerB,"+numberOfManagerB() );
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Manager> copyOfManagerB = new ArrayList<Manager>(managerB);
    managerB.clear();
    for(Manager aManagerB : copyOfManagerB)
    {
      aManagerB.removeCompanyBiManyToManyAdd(this);
    }
  }

}