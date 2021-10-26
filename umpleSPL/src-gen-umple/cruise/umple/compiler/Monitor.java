/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.util.*;
import java.util.*;

// line 73 "../../../../src/Structure.ump"
public class Monitor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Monitor Associations
  private List<BasicConstraint> constraints;
  private List<TimerConstraint> timerConstraints;
  private List<PortConstraint> portConstraints;
  private ActiveMethod activeMethod;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Monitor(ActiveMethod aActiveMethod)
  {
    constraints = new ArrayList<BasicConstraint>();
    timerConstraints = new ArrayList<TimerConstraint>();
    portConstraints = new ArrayList<PortConstraint>();
    if (!setActiveMethod(aActiveMethod))
    {
      throw new RuntimeException("Unable to create Monitor due to aActiveMethod. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public BasicConstraint getConstraint(int index)
  {
    BasicConstraint aConstraint = constraints.get(index);
    return aConstraint;
  }

  public List<BasicConstraint> getConstraints()
  {
    List<BasicConstraint> newConstraints = Collections.unmodifiableList(constraints);
    return newConstraints;
  }

  public int numberOfConstraints()
  {
    int number = constraints.size();
    return number;
  }

  public boolean hasConstraints()
  {
    boolean has = constraints.size() > 0;
    return has;
  }

  public int indexOfConstraint(BasicConstraint aConstraint)
  {
    int index = constraints.indexOf(aConstraint);
    return index;
  }
  /* Code from template association_GetMany */
  public TimerConstraint getTimerConstraint(int index)
  {
    TimerConstraint aTimerConstraint = timerConstraints.get(index);
    return aTimerConstraint;
  }

  public List<TimerConstraint> getTimerConstraints()
  {
    List<TimerConstraint> newTimerConstraints = Collections.unmodifiableList(timerConstraints);
    return newTimerConstraints;
  }

  public int numberOfTimerConstraints()
  {
    int number = timerConstraints.size();
    return number;
  }

  public boolean hasTimerConstraints()
  {
    boolean has = timerConstraints.size() > 0;
    return has;
  }

  public int indexOfTimerConstraint(TimerConstraint aTimerConstraint)
  {
    int index = timerConstraints.indexOf(aTimerConstraint);
    return index;
  }
  /* Code from template association_GetMany */
  public PortConstraint getPortConstraint(int index)
  {
    PortConstraint aPortConstraint = portConstraints.get(index);
    return aPortConstraint;
  }

  public List<PortConstraint> getPortConstraints()
  {
    List<PortConstraint> newPortConstraints = Collections.unmodifiableList(portConstraints);
    return newPortConstraints;
  }

  public int numberOfPortConstraints()
  {
    int number = portConstraints.size();
    return number;
  }

  public boolean hasPortConstraints()
  {
    boolean has = portConstraints.size() > 0;
    return has;
  }

  public int indexOfPortConstraint(PortConstraint aPortConstraint)
  {
    int index = portConstraints.indexOf(aPortConstraint);
    return index;
  }
  /* Code from template association_GetOne */
  public ActiveMethod getActiveMethod()
  {
    return activeMethod;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfConstraints()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addConstraint(BasicConstraint aConstraint)
  {
    boolean wasAdded = false;
    if (constraints.contains(aConstraint)) { return false; }
    constraints.add(aConstraint);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeConstraint(BasicConstraint aConstraint)
  {
    boolean wasRemoved = false;
    if (constraints.contains(aConstraint))
    {
      constraints.remove(aConstraint);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addConstraintAt(BasicConstraint aConstraint, int index)
  {  
    boolean wasAdded = false;
    if(addConstraint(aConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstraints()) { index = numberOfConstraints() - 1; }
      constraints.remove(aConstraint);
      constraints.add(index, aConstraint);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveConstraintAt(BasicConstraint aConstraint, int index)
  {
    boolean wasAdded = false;
    if(constraints.contains(aConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstraints()) { index = numberOfConstraints() - 1; }
      constraints.remove(aConstraint);
      constraints.add(index, aConstraint);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addConstraintAt(aConstraint, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTimerConstraints()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addTimerConstraint(TimerConstraint aTimerConstraint)
  {
    boolean wasAdded = false;
    if (timerConstraints.contains(aTimerConstraint)) { return false; }
    timerConstraints.add(aTimerConstraint);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTimerConstraint(TimerConstraint aTimerConstraint)
  {
    boolean wasRemoved = false;
    if (timerConstraints.contains(aTimerConstraint))
    {
      timerConstraints.remove(aTimerConstraint);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTimerConstraintAt(TimerConstraint aTimerConstraint, int index)
  {  
    boolean wasAdded = false;
    if(addTimerConstraint(aTimerConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTimerConstraints()) { index = numberOfTimerConstraints() - 1; }
      timerConstraints.remove(aTimerConstraint);
      timerConstraints.add(index, aTimerConstraint);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTimerConstraintAt(TimerConstraint aTimerConstraint, int index)
  {
    boolean wasAdded = false;
    if(timerConstraints.contains(aTimerConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTimerConstraints()) { index = numberOfTimerConstraints() - 1; }
      timerConstraints.remove(aTimerConstraint);
      timerConstraints.add(index, aTimerConstraint);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTimerConstraintAt(aTimerConstraint, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPortConstraints()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addPortConstraint(PortConstraint aPortConstraint)
  {
    boolean wasAdded = false;
    if (portConstraints.contains(aPortConstraint)) { return false; }
    portConstraints.add(aPortConstraint);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePortConstraint(PortConstraint aPortConstraint)
  {
    boolean wasRemoved = false;
    if (portConstraints.contains(aPortConstraint))
    {
      portConstraints.remove(aPortConstraint);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPortConstraintAt(PortConstraint aPortConstraint, int index)
  {  
    boolean wasAdded = false;
    if(addPortConstraint(aPortConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPortConstraints()) { index = numberOfPortConstraints() - 1; }
      portConstraints.remove(aPortConstraint);
      portConstraints.add(index, aPortConstraint);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePortConstraintAt(PortConstraint aPortConstraint, int index)
  {
    boolean wasAdded = false;
    if(portConstraints.contains(aPortConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPortConstraints()) { index = numberOfPortConstraints() - 1; }
      portConstraints.remove(aPortConstraint);
      portConstraints.add(index, aPortConstraint);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPortConstraintAt(aPortConstraint, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setActiveMethod(ActiveMethod aNewActiveMethod)
  {
    boolean wasSet = false;
    if (aNewActiveMethod != null)
    {
      activeMethod = aNewActiveMethod;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    constraints.clear();
    timerConstraints.clear();
    portConstraints.clear();
    activeMethod = null;
  }

  // line 82 "../../../../src/Structure.ump"
   public PortConstraint getPortConstraint(String name){
    for (PortConstraint aPort : getPortConstraints())
    	{
      		if (aPort.getPort().getName().equals(name))
      		{
        		return aPort;
      		}
    	}
    	return null;
  }

}