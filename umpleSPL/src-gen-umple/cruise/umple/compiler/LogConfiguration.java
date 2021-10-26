/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 65 "../../../../src/Trace.ump"
public class LogConfiguration
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LogConfiguration Attributes
  private int monitorInterval;
  private String rootLogger;
  private boolean generateConfig;

  //LogConfiguration Associations
  private List<LoggerLevelToAppender> loggerLevelToAppenders;
  private TracerDirective tracerDirective;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public LogConfiguration(TracerDirective aTracerDirective)
  {
    monitorInterval = 0;
    rootLogger = "info";
    generateConfig = true;
    loggerLevelToAppenders = new ArrayList<LoggerLevelToAppender>();
    boolean didAddTracerDirective = setTracerDirective(aTracerDirective);
    if (!didAddTracerDirective)
    {
      throw new RuntimeException("Unable to create logConfiguration due to tracerDirective. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMonitorInterval(int aMonitorInterval)
  {
    boolean wasSet = false;
    monitorInterval = aMonitorInterval;
    wasSet = true;
    return wasSet;
  }

  public boolean setRootLogger(String aRootLogger)
  {
    boolean wasSet = false;
    rootLogger = aRootLogger;
    wasSet = true;
    return wasSet;
  }

  public boolean setGenerateConfig(boolean aGenerateConfig)
  {
    boolean wasSet = false;
    generateConfig = aGenerateConfig;
    wasSet = true;
    return wasSet;
  }

  public int getMonitorInterval()
  {
    return monitorInterval;
  }

  public String getRootLogger()
  {
    return rootLogger;
  }

  public boolean getGenerateConfig()
  {
    return generateConfig;
  }
  /* Code from template association_GetMany */
  public LoggerLevelToAppender getLoggerLevelToAppender(int index)
  {
    LoggerLevelToAppender aLoggerLevelToAppender = loggerLevelToAppenders.get(index);
    return aLoggerLevelToAppender;
  }

  public List<LoggerLevelToAppender> getLoggerLevelToAppenders()
  {
    List<LoggerLevelToAppender> newLoggerLevelToAppenders = Collections.unmodifiableList(loggerLevelToAppenders);
    return newLoggerLevelToAppenders;
  }

  public int numberOfLoggerLevelToAppenders()
  {
    int number = loggerLevelToAppenders.size();
    return number;
  }

  public boolean hasLoggerLevelToAppenders()
  {
    boolean has = loggerLevelToAppenders.size() > 0;
    return has;
  }

  public int indexOfLoggerLevelToAppender(LoggerLevelToAppender aLoggerLevelToAppender)
  {
    int index = loggerLevelToAppenders.indexOf(aLoggerLevelToAppender);
    return index;
  }
  /* Code from template association_GetOne */
  public TracerDirective getTracerDirective()
  {
    return tracerDirective;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfLoggerLevelToAppenders()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public LoggerLevelToAppender addLoggerLevelToAppender()
  {
    return new LoggerLevelToAppender(this);
  }

  public boolean addLoggerLevelToAppender(LoggerLevelToAppender aLoggerLevelToAppender)
  {
    boolean wasAdded = false;
    if (loggerLevelToAppenders.contains(aLoggerLevelToAppender)) { return false; }
    LogConfiguration existingLogConfiguration = aLoggerLevelToAppender.getLogConfiguration();
    boolean isNewLogConfiguration = existingLogConfiguration != null && !this.equals(existingLogConfiguration);
    if (isNewLogConfiguration)
    {
      aLoggerLevelToAppender.setLogConfiguration(this);
    }
    else
    {
      loggerLevelToAppenders.add(aLoggerLevelToAppender);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeLoggerLevelToAppender(LoggerLevelToAppender aLoggerLevelToAppender)
  {
    boolean wasRemoved = false;
    //Unable to remove aLoggerLevelToAppender, as it must always have a logConfiguration
    if (!this.equals(aLoggerLevelToAppender.getLogConfiguration()))
    {
      loggerLevelToAppenders.remove(aLoggerLevelToAppender);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addLoggerLevelToAppenderAt(LoggerLevelToAppender aLoggerLevelToAppender, int index)
  {  
    boolean wasAdded = false;
    if(addLoggerLevelToAppender(aLoggerLevelToAppender))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLoggerLevelToAppenders()) { index = numberOfLoggerLevelToAppenders() - 1; }
      loggerLevelToAppenders.remove(aLoggerLevelToAppender);
      loggerLevelToAppenders.add(index, aLoggerLevelToAppender);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveLoggerLevelToAppenderAt(LoggerLevelToAppender aLoggerLevelToAppender, int index)
  {
    boolean wasAdded = false;
    if(loggerLevelToAppenders.contains(aLoggerLevelToAppender))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLoggerLevelToAppenders()) { index = numberOfLoggerLevelToAppenders() - 1; }
      loggerLevelToAppenders.remove(aLoggerLevelToAppender);
      loggerLevelToAppenders.add(index, aLoggerLevelToAppender);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addLoggerLevelToAppenderAt(aLoggerLevelToAppender, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setTracerDirective(TracerDirective aNewTracerDirective)
  {
    boolean wasSet = false;
    if (aNewTracerDirective == null)
    {
      //Unable to setTracerDirective to null, as logConfiguration must always be associated to a tracerDirective
      return wasSet;
    }
    
    LogConfiguration existingLogConfiguration = aNewTracerDirective.getLogConfiguration();
    if (existingLogConfiguration != null && !equals(existingLogConfiguration))
    {
      //Unable to setTracerDirective, the current tracerDirective already has a logConfiguration, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    TracerDirective anOldTracerDirective = tracerDirective;
    tracerDirective = aNewTracerDirective;
    tracerDirective.setLogConfiguration(this);

    if (anOldTracerDirective != null)
    {
      anOldTracerDirective.setLogConfiguration(null);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    for(int i=loggerLevelToAppenders.size(); i > 0; i--)
    {
      LoggerLevelToAppender aLoggerLevelToAppender = loggerLevelToAppenders.get(i - 1);
      aLoggerLevelToAppender.delete();
    }
    TracerDirective existingTracerDirective = tracerDirective;
    tracerDirective = null;
    if (existingTracerDirective != null)
    {
      existingTracerDirective.setLogConfiguration(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "monitorInterval" + ":" + getMonitorInterval()+ "," +
            "rootLogger" + ":" + getRootLogger()+ "," +
            "generateConfig" + ":" + getGenerateConfig()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "tracerDirective = "+(getTracerDirective()!=null?Integer.toHexString(System.identityHashCode(getTracerDirective())):"null");
  }
}