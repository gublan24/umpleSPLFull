/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * 
 * NEW CLASS****************************************
 * 
 */
// line 188 "../../../../src/StateMachine.ump"
// line 843 "../../../../src/StateMachine_Code.ump"
// line 1834 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
public class Event
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Event Attributes
  private String name;
  private boolean isTimer;
  private boolean autoTransition;
  private String timerInSeconds;
  private boolean isInternal;
  private boolean unspecified;
  private String type;

  //Event Associations
  private List<MethodParameter> params;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Event(String aName)
  {
    cachedHashCode = -1;
    canSetName = true;
    name = aName;
    isTimer = false;
    autoTransition = false;
    timerInSeconds = "0";
    isInternal = false;
    unspecified = false;
    type = "Boolean";
    params = new ArrayList<MethodParameter>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    if (!canSetName) { return false; }
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsTimer(boolean aIsTimer)
  {
    boolean wasSet = false;
    isTimer = aIsTimer;
    wasSet = true;
    return wasSet;
  }

  public boolean setAutoTransition(boolean aAutoTransition)
  {
    boolean wasSet = false;
    autoTransition = aAutoTransition;
    wasSet = true;
    return wasSet;
  }

  public boolean setTimerInSeconds(String aTimerInSeconds)
  {
    boolean wasSet = false;
    timerInSeconds = aTimerInSeconds;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInternal(boolean aIsInternal)
  {
    boolean wasSet = false;
    isInternal = aIsInternal;
    wasSet = true;
    return wasSet;
  }

  public boolean setUnspecified(boolean aUnspecified)
  {
    boolean wasSet = false;
    unspecified = aUnspecified;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  /**
   * String args = null;
   */
  public boolean getIsTimer()
  {
    return isTimer;
  }

  public boolean getAutoTransition()
  {
    return autoTransition;
  }

  /**
   * TODO: how do you specify milliseconds etc.
   */
  public String getTimerInSeconds()
  {
    return timerInSeconds;
  }

  /**
   * for code generation only e.g. ouside scope of nested state
   */
  public boolean getIsInternal()
  {
    return isInternal;
  }

  public boolean getUnspecified()
  {
    return unspecified;
  }

  /**
   * The type of the method.
   */
  public String getType()
  {
    return type;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsTimer()
  {
    return isTimer;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isAutoTransition()
  {
    return autoTransition;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInternal()
  {
    return isInternal;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isUnspecified()
  {
    return unspecified;
  }
  /* Code from template association_GetMany */
  public MethodParameter getParam(int index)
  {
    MethodParameter aParam = params.get(index);
    return aParam;
  }

  /**
   * The event parameters.
   */
  public List<MethodParameter> getParams()
  {
    List<MethodParameter> newParams = Collections.unmodifiableList(params);
    return newParams;
  }

  public int numberOfParams()
  {
    int number = params.size();
    return number;
  }

  public boolean hasParams()
  {
    boolean has = params.size() > 0;
    return has;
  }

  public int indexOfParam(MethodParameter aParam)
  {
    int index = params.indexOf(aParam);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfParams()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addParam(MethodParameter aParam)
  {
    boolean wasAdded = false;
    if (params.contains(aParam)) { return false; }
    params.add(aParam);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeParam(MethodParameter aParam)
  {
    boolean wasRemoved = false;
    if (params.contains(aParam))
    {
      params.remove(aParam);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addParamAt(MethodParameter aParam, int index)
  {  
    boolean wasAdded = false;
    if(addParam(aParam))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParams()) { index = numberOfParams() - 1; }
      params.remove(aParam);
      params.add(index, aParam);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveParamAt(MethodParameter aParam, int index)
  {
    boolean wasAdded = false;
    if(params.contains(aParam))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParams()) { index = numberOfParams() - 1; }
      params.remove(aParam);
      params.add(index, aParam);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addParamAt(aParam, index);
    }
    return wasAdded;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    Event compareTo = (Event)obj;
  
    if (getName() == null && compareTo.getName() != null)
    {
      return false;
    }
    else if (getName() != null && !getName().equals(compareTo.getName()))
    {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    if (getName() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getName().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetName = false;
    return cachedHashCode;
  }

  public void delete()
  {
    params.clear();
  }

  // line 849 "../../../../src/StateMachine_Code.ump"
   public static  Event createAutoTransition(){
    Event e = new Event("__autotransition" + Event.nextAutoTransitionId + "__");
    e.setAutoTransition(true);
    Event.nextAutoTransitionId += 1;
    return e;
  }

  // line 856 "../../../../src/StateMachine_Code.ump"
   public static  void setNextAutoTransitionId(int value){
    Event.nextAutoTransitionId = value;
  }

  // line 861 "../../../../src/StateMachine_Code.ump"
   public String getArgs(){
    String args="";
    String paramName="";
    String paramType="";
    String aSingleParameter="";
    String isList="";
    String parameters = "";
    String finalParams= "";

     if(this.hasParams() == true)
     {
       for (MethodParameter aEventParam : this.getParams())
       {
         paramName = aEventParam.getName();
         paramType = aEventParam.getType();
         isList = aEventParam.getIsList() ? " [] " : " ";
         aSingleParameter = paramType + isList + paramName;
         parameters += aSingleParameter + ",";
       }
       finalParams = parameters.substring(0, parameters.length()-1);
       args=finalParams;
     }
     return args;
  }

  // line 887 "../../../../src/StateMachine_Code.ump"
   public boolean compareWithAnotherEvent(Event inEvent){
    if (!equals(inEvent)) return false;
    if (numberOfParams() != inEvent.numberOfParams()) return false;
      for (int i = 0; i < inEvent.numberOfParams(); i++) {
        if (!getParam(i).getType().equals(inEvent.getParam(i).getType())) return false;
      }
    return true;
  }


  /**
   * Please maintain this method if you're going to add new features to Events.
   * This code manually creates a clone of a Events.
   */
  // line 1839 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
  public Event clone(){
    Event e = new Event(getName());
  	e.setAutoTransition(getAutoTransition());
  	e.setIsInternal(getIsInternal());
  	e.setIsTimer(getIsTimer());
  	e.setTimerInSeconds(getTimerInSeconds());
  	e.setUnspecified(getUnspecified());
  	for (MethodParameter mp : getParams()){
  		e.addParam(mp.clone());
  	}
  	return e;
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "isTimer" + ":" + getIsTimer()+ "," +
            "autoTransition" + ":" + getAutoTransition()+ "," +
            "timerInSeconds" + ":" + getTimerInSeconds()+ "," +
            "isInternal" + ":" + getIsInternal()+ "," +
            "unspecified" + ":" + getUnspecified()+ "," +
            "type" + ":" + getType()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 845 "../../../../src/StateMachine_Code.ump"
  private static int nextAutoTransitionId = 1 ;

  
}