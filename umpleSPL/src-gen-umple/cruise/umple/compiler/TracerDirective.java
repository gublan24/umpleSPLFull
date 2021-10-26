/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * ----- Tracer Directive MetaModel
 * A statement found in Umple that directs tracing technology
 * to be used in generted code
 */
// line 39 "../../../../src/Trace.ump"
public class TracerDirective
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TracerDirective Attributes
  private String name;
  private boolean verbosity;

  //TracerDirective Associations
  private List<TracerArgument> tracerArguments;
  private TraceMessageSwitch traceMessageSwitch;
  private LogConfiguration logConfiguration;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TracerDirective(String aName)
  {
    name = aName;
    verbosity = false;
    tracerArguments = new ArrayList<TracerArgument>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setVerbosity(boolean aVerbosity)
  {
    boolean wasSet = false;
    verbosity = aVerbosity;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public boolean getVerbosity()
  {
    return verbosity;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isVerbosity()
  {
    return verbosity;
  }
  /* Code from template association_GetMany */
  public TracerArgument getTracerArgument(int index)
  {
    TracerArgument aTracerArgument = tracerArguments.get(index);
    return aTracerArgument;
  }

  public List<TracerArgument> getTracerArguments()
  {
    List<TracerArgument> newTracerArguments = Collections.unmodifiableList(tracerArguments);
    return newTracerArguments;
  }

  public int numberOfTracerArguments()
  {
    int number = tracerArguments.size();
    return number;
  }

  public boolean hasTracerArguments()
  {
    boolean has = tracerArguments.size() > 0;
    return has;
  }

  public int indexOfTracerArgument(TracerArgument aTracerArgument)
  {
    int index = tracerArguments.indexOf(aTracerArgument);
    return index;
  }
  /* Code from template association_GetOne */
  public TraceMessageSwitch getTraceMessageSwitch()
  {
    return traceMessageSwitch;
  }

  public boolean hasTraceMessageSwitch()
  {
    boolean has = traceMessageSwitch != null;
    return has;
  }
  /* Code from template association_GetOne */
  public LogConfiguration getLogConfiguration()
  {
    return logConfiguration;
  }

  public boolean hasLogConfiguration()
  {
    boolean has = logConfiguration != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTracerArguments()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public TracerArgument addTracerArgument(String aArgument)
  {
    return new TracerArgument(aArgument, this);
  }

  public boolean addTracerArgument(TracerArgument aTracerArgument)
  {
    boolean wasAdded = false;
    if (tracerArguments.contains(aTracerArgument)) { return false; }
    TracerDirective existingTracerDirective = aTracerArgument.getTracerDirective();
    boolean isNewTracerDirective = existingTracerDirective != null && !this.equals(existingTracerDirective);
    if (isNewTracerDirective)
    {
      aTracerArgument.setTracerDirective(this);
    }
    else
    {
      tracerArguments.add(aTracerArgument);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTracerArgument(TracerArgument aTracerArgument)
  {
    boolean wasRemoved = false;
    //Unable to remove aTracerArgument, as it must always have a tracerDirective
    if (!this.equals(aTracerArgument.getTracerDirective()))
    {
      tracerArguments.remove(aTracerArgument);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTracerArgumentAt(TracerArgument aTracerArgument, int index)
  {  
    boolean wasAdded = false;
    if(addTracerArgument(aTracerArgument))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTracerArguments()) { index = numberOfTracerArguments() - 1; }
      tracerArguments.remove(aTracerArgument);
      tracerArguments.add(index, aTracerArgument);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTracerArgumentAt(TracerArgument aTracerArgument, int index)
  {
    boolean wasAdded = false;
    if(tracerArguments.contains(aTracerArgument))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTracerArguments()) { index = numberOfTracerArguments() - 1; }
      tracerArguments.remove(aTracerArgument);
      tracerArguments.add(index, aTracerArgument);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTracerArgumentAt(aTracerArgument, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setTraceMessageSwitch(TraceMessageSwitch aNewTraceMessageSwitch)
  {
    boolean wasSet = false;
    if (traceMessageSwitch != null && !traceMessageSwitch.equals(aNewTraceMessageSwitch) && equals(traceMessageSwitch.getTracerDirective()))
    {
      //Unable to setTraceMessageSwitch, as existing traceMessageSwitch would become an orphan
      return wasSet;
    }

    traceMessageSwitch = aNewTraceMessageSwitch;
    TracerDirective anOldTracerDirective = aNewTraceMessageSwitch != null ? aNewTraceMessageSwitch.getTracerDirective() : null;

    if (!this.equals(anOldTracerDirective))
    {
      if (anOldTracerDirective != null)
      {
        anOldTracerDirective.traceMessageSwitch = null;
      }
      if (traceMessageSwitch != null)
      {
        traceMessageSwitch.setTracerDirective(this);
      }
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setLogConfiguration(LogConfiguration aNewLogConfiguration)
  {
    boolean wasSet = false;
    if (logConfiguration != null && !logConfiguration.equals(aNewLogConfiguration) && equals(logConfiguration.getTracerDirective()))
    {
      //Unable to setLogConfiguration, as existing logConfiguration would become an orphan
      return wasSet;
    }

    logConfiguration = aNewLogConfiguration;
    TracerDirective anOldTracerDirective = aNewLogConfiguration != null ? aNewLogConfiguration.getTracerDirective() : null;

    if (!this.equals(anOldTracerDirective))
    {
      if (anOldTracerDirective != null)
      {
        anOldTracerDirective.logConfiguration = null;
      }
      if (logConfiguration != null)
      {
        logConfiguration.setTracerDirective(this);
      }
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    for(int i=tracerArguments.size(); i > 0; i--)
    {
      TracerArgument aTracerArgument = tracerArguments.get(i - 1);
      aTracerArgument.delete();
    }
    TraceMessageSwitch existingTraceMessageSwitch = traceMessageSwitch;
    traceMessageSwitch = null;
    if (existingTraceMessageSwitch != null)
    {
      existingTraceMessageSwitch.delete();
    }
    LogConfiguration existingLogConfiguration = logConfiguration;
    logConfiguration = null;
    if (existingLogConfiguration != null)
    {
      existingLogConfiguration.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "verbosity" + ":" + getVerbosity()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "traceMessageSwitch = "+(getTraceMessageSwitch()!=null?Integer.toHexString(System.identityHashCode(getTraceMessageSwitch())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "logConfiguration = "+(getLogConfiguration()!=null?Integer.toHexString(System.identityHashCode(getLogConfiguration())):"null");
  }
}