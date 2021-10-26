/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 109 "../../../../src/Trace.ump"
public class Postfix
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Postfix Attributes
  private int occurences;
  private double periodClause;
  private double duringClause;
  private String executeClause;

  //Postfix Associations
  private Condition condition;
  private TraceRecord traceRecord;
  private List<LogLevel> logLevels;
  private TraceDirective traceDirective;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Postfix(TraceDirective aTraceDirective)
  {
    occurences = 0;
    periodClause = 0;
    duringClause = 0;
    executeClause = null;
    logLevels = new ArrayList<LogLevel>();
    boolean didAddTraceDirective = setTraceDirective(aTraceDirective);
    if (!didAddTraceDirective)
    {
      throw new RuntimeException("Unable to create postfix due to traceDirective. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOccurences(int aOccurences)
  {
    boolean wasSet = false;
    occurences = aOccurences;
    wasSet = true;
    return wasSet;
  }

  public boolean setPeriodClause(double aPeriodClause)
  {
    boolean wasSet = false;
    periodClause = aPeriodClause;
    wasSet = true;
    return wasSet;
  }

  public boolean setDuringClause(double aDuringClause)
  {
    boolean wasSet = false;
    duringClause = aDuringClause;
    wasSet = true;
    return wasSet;
  }

  public boolean setExecuteClause(String aExecuteClause)
  {
    boolean wasSet = false;
    executeClause = aExecuteClause;
    wasSet = true;
    return wasSet;
  }

  public int getOccurences()
  {
    return occurences;
  }

  public double getPeriodClause()
  {
    return periodClause;
  }

  public double getDuringClause()
  {
    return duringClause;
  }

  public String getExecuteClause()
  {
    return executeClause;
  }
  /* Code from template association_GetOne */
  public Condition getCondition()
  {
    return condition;
  }

  public boolean hasCondition()
  {
    boolean has = condition != null;
    return has;
  }
  /* Code from template association_GetOne */
  public TraceRecord getTraceRecord()
  {
    return traceRecord;
  }

  public boolean hasTraceRecord()
  {
    boolean has = traceRecord != null;
    return has;
  }
  /* Code from template association_GetMany */
  public LogLevel getLogLevel(int index)
  {
    LogLevel aLogLevel = logLevels.get(index);
    return aLogLevel;
  }

  public List<LogLevel> getLogLevels()
  {
    List<LogLevel> newLogLevels = Collections.unmodifiableList(logLevels);
    return newLogLevels;
  }

  public int numberOfLogLevels()
  {
    int number = logLevels.size();
    return number;
  }

  public boolean hasLogLevels()
  {
    boolean has = logLevels.size() > 0;
    return has;
  }

  public int indexOfLogLevel(LogLevel aLogLevel)
  {
    int index = logLevels.indexOf(aLogLevel);
    return index;
  }
  /* Code from template association_GetOne */
  public TraceDirective getTraceDirective()
  {
    return traceDirective;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setCondition(Condition aNewCondition)
  {
    boolean wasSet = false;
    condition = aNewCondition;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setTraceRecord(TraceRecord aNewTraceRecord)
  {
    boolean wasSet = false;
    traceRecord = aNewTraceRecord;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfLogLevels()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addLogLevel(LogLevel aLogLevel)
  {
    boolean wasAdded = false;
    if (logLevels.contains(aLogLevel)) { return false; }
    logLevels.add(aLogLevel);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeLogLevel(LogLevel aLogLevel)
  {
    boolean wasRemoved = false;
    if (logLevels.contains(aLogLevel))
    {
      logLevels.remove(aLogLevel);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addLogLevelAt(LogLevel aLogLevel, int index)
  {  
    boolean wasAdded = false;
    if(addLogLevel(aLogLevel))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLogLevels()) { index = numberOfLogLevels() - 1; }
      logLevels.remove(aLogLevel);
      logLevels.add(index, aLogLevel);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveLogLevelAt(LogLevel aLogLevel, int index)
  {
    boolean wasAdded = false;
    if(logLevels.contains(aLogLevel))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLogLevels()) { index = numberOfLogLevels() - 1; }
      logLevels.remove(aLogLevel);
      logLevels.add(index, aLogLevel);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addLogLevelAt(aLogLevel, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setTraceDirective(TraceDirective aNewTraceDirective)
  {
    boolean wasSet = false;
    if (aNewTraceDirective == null)
    {
      //Unable to setTraceDirective to null, as postfix must always be associated to a traceDirective
      return wasSet;
    }
    
    Postfix existingPostfix = aNewTraceDirective.getPostfix();
    if (existingPostfix != null && !equals(existingPostfix))
    {
      //Unable to setTraceDirective, the current traceDirective already has a postfix, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    TraceDirective anOldTraceDirective = traceDirective;
    traceDirective = aNewTraceDirective;
    traceDirective.setPostfix(this);

    if (anOldTraceDirective != null)
    {
      anOldTraceDirective.setPostfix(null);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    condition = null;
    traceRecord = null;
    logLevels.clear();
    TraceDirective existingTraceDirective = traceDirective;
    traceDirective = null;
    if (existingTraceDirective != null)
    {
      existingTraceDirective.setPostfix(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "occurences" + ":" + getOccurences()+ "," +
            "periodClause" + ":" + getPeriodClause()+ "," +
            "duringClause" + ":" + getDuringClause()+ "," +
            "executeClause" + ":" + getExecuteClause()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "condition = "+(getCondition()!=null?Integer.toHexString(System.identityHashCode(getCondition())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "traceRecord = "+(getTraceRecord()!=null?Integer.toHexString(System.identityHashCode(getTraceRecord())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "traceDirective = "+(getTraceDirective()!=null?Integer.toHexString(System.identityHashCode(getTraceDirective())):"null");
  }
}