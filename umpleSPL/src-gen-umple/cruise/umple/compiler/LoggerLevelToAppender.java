/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 73 "../../../../src/Trace.ump"
public class LoggerLevelToAppender
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LoggerLevelToAppender Associations
  private List<Appender> appenders;
  private List<Level> levels;
  private LogConfiguration logConfiguration;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public LoggerLevelToAppender(LogConfiguration aLogConfiguration)
  {
    appenders = new ArrayList<Appender>();
    levels = new ArrayList<Level>();
    boolean didAddLogConfiguration = setLogConfiguration(aLogConfiguration);
    if (!didAddLogConfiguration)
    {
      throw new RuntimeException("Unable to create loggerLevelToAppender due to logConfiguration. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Appender getAppender(int index)
  {
    Appender aAppender = appenders.get(index);
    return aAppender;
  }

  public List<Appender> getAppenders()
  {
    List<Appender> newAppenders = Collections.unmodifiableList(appenders);
    return newAppenders;
  }

  public int numberOfAppenders()
  {
    int number = appenders.size();
    return number;
  }

  public boolean hasAppenders()
  {
    boolean has = appenders.size() > 0;
    return has;
  }

  public int indexOfAppender(Appender aAppender)
  {
    int index = appenders.indexOf(aAppender);
    return index;
  }
  /* Code from template association_GetMany */
  public Level getLevel(int index)
  {
    Level aLevel = levels.get(index);
    return aLevel;
  }

  public List<Level> getLevels()
  {
    List<Level> newLevels = Collections.unmodifiableList(levels);
    return newLevels;
  }

  public int numberOfLevels()
  {
    int number = levels.size();
    return number;
  }

  public boolean hasLevels()
  {
    boolean has = levels.size() > 0;
    return has;
  }

  public int indexOfLevel(Level aLevel)
  {
    int index = levels.indexOf(aLevel);
    return index;
  }
  /* Code from template association_GetOne */
  public LogConfiguration getLogConfiguration()
  {
    return logConfiguration;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAppenders()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addAppender(Appender aAppender)
  {
    boolean wasAdded = false;
    if (appenders.contains(aAppender)) { return false; }
    appenders.add(aAppender);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAppender(Appender aAppender)
  {
    boolean wasRemoved = false;
    if (appenders.contains(aAppender))
    {
      appenders.remove(aAppender);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAppenderAt(Appender aAppender, int index)
  {  
    boolean wasAdded = false;
    if(addAppender(aAppender))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAppenders()) { index = numberOfAppenders() - 1; }
      appenders.remove(aAppender);
      appenders.add(index, aAppender);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAppenderAt(Appender aAppender, int index)
  {
    boolean wasAdded = false;
    if(appenders.contains(aAppender))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAppenders()) { index = numberOfAppenders() - 1; }
      appenders.remove(aAppender);
      appenders.add(index, aAppender);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAppenderAt(aAppender, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfLevels()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addLevel(Level aLevel)
  {
    boolean wasAdded = false;
    if (levels.contains(aLevel)) { return false; }
    levels.add(aLevel);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeLevel(Level aLevel)
  {
    boolean wasRemoved = false;
    if (levels.contains(aLevel))
    {
      levels.remove(aLevel);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addLevelAt(Level aLevel, int index)
  {  
    boolean wasAdded = false;
    if(addLevel(aLevel))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLevels()) { index = numberOfLevels() - 1; }
      levels.remove(aLevel);
      levels.add(index, aLevel);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveLevelAt(Level aLevel, int index)
  {
    boolean wasAdded = false;
    if(levels.contains(aLevel))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLevels()) { index = numberOfLevels() - 1; }
      levels.remove(aLevel);
      levels.add(index, aLevel);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addLevelAt(aLevel, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMany */
  public boolean setLogConfiguration(LogConfiguration aLogConfiguration)
  {
    boolean wasSet = false;
    if (aLogConfiguration == null)
    {
      return wasSet;
    }

    LogConfiguration existingLogConfiguration = logConfiguration;
    logConfiguration = aLogConfiguration;
    if (existingLogConfiguration != null && !existingLogConfiguration.equals(aLogConfiguration))
    {
      existingLogConfiguration.removeLoggerLevelToAppender(this);
    }
    logConfiguration.addLoggerLevelToAppender(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    appenders.clear();
    levels.clear();
    LogConfiguration placeholderLogConfiguration = logConfiguration;
    this.logConfiguration = null;
    if(placeholderLogConfiguration != null)
    {
      placeholderLogConfiguration.removeLoggerLevelToAppender(this);
    }
  }

}