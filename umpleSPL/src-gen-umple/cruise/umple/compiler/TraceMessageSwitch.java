/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 53 "../../../../src/Trace.ump"
public class TraceMessageSwitch
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TraceMessageSwitch Attributes
  private boolean on;
  private boolean off;

  //TraceMessageSwitch Associations
  private List<MessageComponent> option;
  private TracerDirective tracerDirective;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TraceMessageSwitch(TracerDirective aTracerDirective)
  {
    on = false;
    off = false;
    option = new ArrayList<MessageComponent>();
    boolean didAddTracerDirective = setTracerDirective(aTracerDirective);
    if (!didAddTracerDirective)
    {
      throw new RuntimeException("Unable to create traceMessageSwitch due to tracerDirective. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOn(boolean aOn)
  {
    boolean wasSet = false;
    on = aOn;
    wasSet = true;
    return wasSet;
  }

  public boolean setOff(boolean aOff)
  {
    boolean wasSet = false;
    off = aOff;
    wasSet = true;
    return wasSet;
  }

  public boolean getOn()
  {
    return on;
  }

  public boolean getOff()
  {
    return off;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isOn()
  {
    return on;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isOff()
  {
    return off;
  }
  /* Code from template association_GetMany */
  public MessageComponent getOption(int index)
  {
    MessageComponent aOption = option.get(index);
    return aOption;
  }

  public List<MessageComponent> getOption()
  {
    List<MessageComponent> newOption = Collections.unmodifiableList(option);
    return newOption;
  }

  public int numberOfOption()
  {
    int number = option.size();
    return number;
  }

  public boolean hasOption()
  {
    boolean has = option.size() > 0;
    return has;
  }

  public int indexOfOption(MessageComponent aOption)
  {
    int index = option.indexOf(aOption);
    return index;
  }
  /* Code from template association_GetOne */
  public TracerDirective getTracerDirective()
  {
    return tracerDirective;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfOption()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addOption(MessageComponent aOption)
  {
    boolean wasAdded = false;
    if (option.contains(aOption)) { return false; }
    option.add(aOption);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeOption(MessageComponent aOption)
  {
    boolean wasRemoved = false;
    if (option.contains(aOption))
    {
      option.remove(aOption);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addOptionAt(MessageComponent aOption, int index)
  {  
    boolean wasAdded = false;
    if(addOption(aOption))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOption()) { index = numberOfOption() - 1; }
      option.remove(aOption);
      option.add(index, aOption);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveOptionAt(MessageComponent aOption, int index)
  {
    boolean wasAdded = false;
    if(option.contains(aOption))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOption()) { index = numberOfOption() - 1; }
      option.remove(aOption);
      option.add(index, aOption);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOptionAt(aOption, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setTracerDirective(TracerDirective aNewTracerDirective)
  {
    boolean wasSet = false;
    if (aNewTracerDirective == null)
    {
      //Unable to setTracerDirective to null, as traceMessageSwitch must always be associated to a tracerDirective
      return wasSet;
    }
    
    TraceMessageSwitch existingTraceMessageSwitch = aNewTracerDirective.getTraceMessageSwitch();
    if (existingTraceMessageSwitch != null && !equals(existingTraceMessageSwitch))
    {
      //Unable to setTracerDirective, the current tracerDirective already has a traceMessageSwitch, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    TracerDirective anOldTracerDirective = tracerDirective;
    tracerDirective = aNewTracerDirective;
    tracerDirective.setTraceMessageSwitch(this);

    if (anOldTracerDirective != null)
    {
      anOldTracerDirective.setTraceMessageSwitch(null);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    option.clear();
    TracerDirective existingTracerDirective = tracerDirective;
    tracerDirective = null;
    if (existingTracerDirective != null)
    {
      existingTracerDirective.setTraceMessageSwitch(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "on" + ":" + getOn()+ "," +
            "off" + ":" + getOff()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "tracerDirective = "+(getTracerDirective()!=null?Integer.toHexString(System.identityHashCode(getTracerDirective())):"null");
  }
}