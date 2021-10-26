/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * Some code to execute for an extended period while in a state
 * This code is found after they keyword 'do' in Umple
 * The code is executed in a separate threat, and can be terminated by
 * an outgoing transition. Upon completion of the activity, any
 * autotransition will be taken
 * 
 * NEW CLASS****************************************
 * 
 * Please keep updating the method 'public Activity clone(State inState)' if you add new attributes to this class.
 */
// line 80 "../../../../src/StateMachine.ump"
// line 1908 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
public class Activity
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Activity Attributes
  private Position position;
  private Position endPosition;
  private String activityCode;
  private Map<String,Position> implementationPositions;
  private CodeBlock codeblock;
  private boolean composed;

  //Activity Associations
  private Event onCompletionEvent;
  private State state;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Activity(String aActivityCode, State aState)
  {
    activityCode = aActivityCode;
    implementationPositions = new HashMap<String,Position>();
    codeblock = null;
    composed = false;
    boolean didAddState = setState(aState);
    if (!didAddState)
    {
      throw new RuntimeException("Unable to create activity due to state. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    // line 94 "../../../../src/StateMachine.ump"
    codeblock = aActivityCode!=null ? new CodeBlock(aActivityCode) : new CodeBlock();
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setEndPosition(Position aEndPosition)
  {
    boolean wasSet = false;
    endPosition = aEndPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setActivityCode(String aActivityCode)
  {
    boolean wasSet = false;
    // line 95 "../../../../src/StateMachine.ump"
    codeblock.setCode(aActivityCode);
    // END OF UMPLE BEFORE INJECTION
    activityCode = aActivityCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setImplementationPositions(Map<String,Position> aImplementationPositions)
  {
    boolean wasSet = false;
    implementationPositions = aImplementationPositions;
    wasSet = true;
    return wasSet;
  }

  public boolean setCodeblock(CodeBlock aCodeblock)
  {
    boolean wasSet = false;
    codeblock = aCodeblock;
    wasSet = true;
    // line 103 "../../../../src/StateMachine.ump"
    if(activityCode!=null){
      	  activityCode+= aCodeblock.getCode();
      	}
      	else
      	  activityCode = aCodeblock.getCode();
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean setComposed(boolean aComposed)
  {
    boolean wasSet = false;
    composed = aComposed;
    wasSet = true;
    return wasSet;
  }

  public Position getPosition()
  {
    return position;
  }

  public Position getEndPosition()
  {
    return endPosition;
  }
  /* Code from template attribute_GetCodeInjection */
  public String getActivityCode()
  {
    String aActivityCode = activityCode;
    // line 97 "../../../../src/StateMachine.ump"
    if (codeblock.getCode()!=null)
      	  return codeblock.getCode();
      	  else
    // END OF UMPLE AFTER INJECTION
    return aActivityCode;
  }

  public Map<String,Position> getImplementationPositions()
  {
    return implementationPositions;
  }

  public CodeBlock getCodeblock()
  {
    return codeblock;
  }

  /**
   * This is used to detect if an activity has been added to the state by its used traits.
   */
  public boolean getComposed()
  {
    return composed;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isComposed()
  {
    return composed;
  }
  /* Code from template association_GetOne */
  public Event getOnCompletionEvent()
  {
    return onCompletionEvent;
  }

  public boolean hasOnCompletionEvent()
  {
    boolean has = onCompletionEvent != null;
    return has;
  }
  /* Code from template association_GetOne */
  public State getState()
  {
    return state;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setOnCompletionEvent(Event aNewOnCompletionEvent)
  {
    boolean wasSet = false;
    onCompletionEvent = aNewOnCompletionEvent;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setState(State aState)
  {
    boolean wasSet = false;
    if (aState == null)
    {
      return wasSet;
    }

    State existingState = state;
    state = aState;
    if (existingState != null && !existingState.equals(aState))
    {
      existingState.removeActivity(this);
    }
    state.addActivity(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    onCompletionEvent = null;
    State placeholderState = state;
    this.state = null;
    if(placeholderState != null)
    {
      placeholderState.removeActivity(this);
    }
  }

  // line 111 "../../../../src/StateMachine.ump"
  public void setActivityCode(String lang, String code){
    if(activityCode!=null){
  	  activityCode+= lang+code;
  	}
  	else
  	  activityCode = lang+code;
  	codeblock.setCode(lang,code);
  }


  /**
   * 
   * 
   * @author Vahdat
   * Please maintain this method if you're going to add new attributes to Activity.
   * This code manually creates a clone of a state.
   */
  // line 1923 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   public Activity clone(State inState){
    Activity activity = new Activity(getActivityCode(), inState);
	  activity.position = getPosition();
	  activity.endPosition=getEndPosition();
	  activity.implementationPositions.putAll(getImplementationPositions());
	  activity.codeblock=new CodeBlock(getCodeblock());
	  /*
	   * author:Vahdat
	   * I'm not sure about the purpose of onCompletionEvent. I have to study it.
	   */
	  return activity;
  }


  public String toString()
  {
    return super.toString() + "["+
            "activityCode" + ":" + getActivityCode()+ "," +
            "composed" + ":" + getComposed()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endPosition" + "=" + (getEndPosition() != null ? !getEndPosition().equals(this)  ? getEndPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "implementationPositions" + "=" + (getImplementationPositions() != null ? !getImplementationPositions().equals(this)  ? getImplementationPositions().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "codeblock" + "=" + (getCodeblock() != null ? !getCodeblock().equals(this)  ? getCodeblock().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "onCompletionEvent = "+(getOnCompletionEvent()!=null?Integer.toHexString(System.identityHashCode(getOnCompletionEvent())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "state = "+(getState()!=null?Integer.toHexString(System.identityHashCode(getState())):"null");
  }
}