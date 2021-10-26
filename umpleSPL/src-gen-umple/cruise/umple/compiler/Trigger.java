/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 175 "../../../../src/Structure.ump"
public class Trigger
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Trigger Attributes
  private String timerPSec;

  //Trigger State Machines
  public enum TimeType { AFTER, POLL, TIMEOUT, NONE }
  private TimeType timeType;

  //Trigger Associations
  private List<BasicConstraint> constraints;
  private List<TimerConstraint> timerConstraints;
  private MessageConstraint messageConstraint;
  private DeferredCall deferredCall;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Trigger()
  {
    timerPSec = "0";
    constraints = new ArrayList<BasicConstraint>();
    timerConstraints = new ArrayList<TimerConstraint>();
    setTimeType(TimeType.AFTER);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTimerPSec(String aTimerPSec)
  {
    boolean wasSet = false;
    timerPSec = aTimerPSec;
    wasSet = true;
    return wasSet;
  }

  public String getTimerPSec()
  {
    return timerPSec;
  }

  public String getTimeTypeFullName()
  {
    String answer = timeType.toString();
    return answer;
  }

  public TimeType getTimeType()
  {
    return timeType;
  }

  public boolean setTimeType(TimeType aTimeType)
  {
    timeType = aTimeType;
    return true;
  }
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
  /* Code from template association_GetOne */
  public MessageConstraint getMessageConstraint()
  {
    return messageConstraint;
  }

  public boolean hasMessageConstraint()
  {
    boolean has = messageConstraint != null;
    return has;
  }
  /* Code from template association_GetOne */
  public DeferredCall getDeferredCall()
  {
    return deferredCall;
  }

  public boolean hasDeferredCall()
  {
    boolean has = deferredCall != null;
    return has;
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
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setMessageConstraint(MessageConstraint aNewMessageConstraint)
  {
    boolean wasSet = false;
    messageConstraint = aNewMessageConstraint;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setDeferredCall(DeferredCall aNewDeferredCall)
  {
    boolean wasSet = false;
    deferredCall = aNewDeferredCall;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    constraints.clear();
    timerConstraints.clear();
    messageConstraint = null;
    deferredCall = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "timerPSec" + ":" + getTimerPSec()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "messageConstraint = "+(getMessageConstraint()!=null?Integer.toHexString(System.identityHashCode(getMessageConstraint())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "deferredCall = "+(getDeferredCall()!=null?Integer.toHexString(System.identityHashCode(getDeferredCall())):"null");
  }
}