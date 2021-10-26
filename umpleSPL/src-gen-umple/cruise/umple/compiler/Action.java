/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;

/**
 * A quickly-executed block of code that is run upon entry or exit from a state
 * 
 * NEW CLASS****************************************
 * 
 */
// line 148 "../../../../src/StateMachine.ump"
// line 1871 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
public class Action
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Action Attributes
  private String actionType;
  private Position position;
  private Position endPosition;
  private String actionCode;
  private boolean isInternal;
  private CodeBlock codeblock;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetActionType;
  private boolean canSetActionCode;
  private boolean canSetPosition;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Action(String aActionCode)
  {
    cachedHashCode = -1;
    canSetActionType = true;
    canSetActionCode = true;
    canSetPosition = true;
    actionType = null;
    actionCode = aActionCode;
    isInternal = false;
    codeblock = null;
    // line 159 "../../../../src/StateMachine.ump"
    codeblock = aActionCode!=null ? new CodeBlock(aActionCode) : new CodeBlock();
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setActionType(String aActionType)
  {
    boolean wasSet = false;
    if (!canSetActionType) { return false; }
    actionType = aActionType;
    wasSet = true;
    return wasSet;
  }

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    if (!canSetPosition) { return false; }
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

  public boolean setActionCode(String aActionCode)
  {
    boolean wasSet = false;
    // line 160 "../../../../src/StateMachine.ump"
    codeblock.setCode(aActionCode);
    // END OF UMPLE BEFORE INJECTION
    if (!canSetActionCode) { return false; }
    actionCode = aActionCode;
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

  public boolean setCodeblock(CodeBlock aCodeblock)
  {
    boolean wasSet = false;
    codeblock = aCodeblock;
    wasSet = true;
    // line 168 "../../../../src/StateMachine.ump"
    if(actionCode!=null){
      	  actionCode+= aCodeblock.getCode();
      	}
      	else
      	  actionCode = aCodeblock.getCode();
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public String getActionType()
  {
    return actionType;
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
  public String getActionCode()
  {
    String aActionCode = actionCode;
    // line 162 "../../../../src/StateMachine.ump"
    if (codeblock.getCode()!=null)
      	  return codeblock.getCode();
      	  else
    // END OF UMPLE AFTER INJECTION
    return aActionCode;
  }

  public boolean getIsInternal()
  {
    return isInternal;
  }

  public CodeBlock getCodeblock()
  {
    return codeblock;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInternal()
  {
    return isInternal;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    Action compareTo = (Action)obj;
  
    if (getActionType() == null && compareTo.getActionType() != null)
    {
      return false;
    }
    else if (getActionType() != null && !getActionType().equals(compareTo.getActionType()))
    {
      return false;
    }

    if (getActionCode() == null && compareTo.getActionCode() != null)
    {
      return false;
    }
    else if (getActionCode() != null && !getActionCode().equals(compareTo.getActionCode()))
    {
      return false;
    }

    if (getPosition() == null && compareTo.getPosition() != null)
    {
      return false;
    }
    else if (getPosition() != null && !getPosition().equals(compareTo.getPosition()))
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
    if (getActionType() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getActionType().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (getActionCode() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getActionCode().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (getPosition() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getPosition().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetActionType = false;
    canSetActionCode = false;
    canSetPosition = false;
    return cachedHashCode;
  }

  public void delete()
  {}

  // line 176 "../../../../src/StateMachine.ump"
  public void setActionCode(String lang, String code){
    if(actionCode!=null){
  	  actionCode+= lang+code;
  	}
  	else 
  	  actionCode = lang+code;
  	codeblock.setCode(lang,code);
  }


  /**
   * Please maintain this method if you're going to add new features to Actions.
   * This code manually creates a clone of a Actions.
   */
  // line 1876 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
  public Action clone(){
    Action action = new Action(getActionCode());
  	action.setActionType(getActionType());
  	action.setPosition(getPosition());
  	action.setEndPosition(getEndPosition());
  	action.setIsInternal(isInternal);
  	action.codeblock = new CodeBlock(codeblock);
  	action.cachedHashCode = cachedHashCode;
  	action.canSetActionCode = canSetActionCode;
  	action.canSetActionType = canSetActionType;
  	return action;
  }


  public String toString()
  {
    return super.toString() + "["+
            "actionCode" + ":" + getActionCode()+ "," +
            "actionType" + ":" + getActionType()+ "," +
            "isInternal" + ":" + getIsInternal()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endPosition" + "=" + (getEndPosition() != null ? !getEndPosition().equals(this)  ? getEndPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "codeblock" + "=" + (getCodeblock() != null ? !getCodeblock().equals(this)  ? getCodeblock().toString().replaceAll("  ","    ") : "this" : "null");
  }
}