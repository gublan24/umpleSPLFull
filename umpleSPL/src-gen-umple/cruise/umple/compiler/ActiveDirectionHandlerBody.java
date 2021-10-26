/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;

// line 162 "../../../../src/Structure.ump"
public class ActiveDirectionHandlerBody
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ActiveDirectionHandlerBody Attributes
  private CodeBlock codeblock;
  private Comment comment;
  private Trigger trigger;
  private Position position;
  private Position codePosition;
  private Position endPosition;

  //ActiveDirectionHandlerBody State Machines
  public enum BodyType { CODE, TRIGGER, COMMENT }
  private BodyType bodyType;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ActiveDirectionHandlerBody()
  {
    setBodyType(BodyType.CODE);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCodeblock(CodeBlock aCodeblock)
  {
    boolean wasSet = false;
    codeblock = aCodeblock;
    wasSet = true;
    return wasSet;
  }

  public boolean setComment(Comment aComment)
  {
    boolean wasSet = false;
    comment = aComment;
    wasSet = true;
    return wasSet;
  }

  public boolean setTrigger(Trigger aTrigger)
  {
    boolean wasSet = false;
    trigger = aTrigger;
    wasSet = true;
    return wasSet;
  }

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setCodePosition(Position aCodePosition)
  {
    boolean wasSet = false;
    codePosition = aCodePosition;
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

  public CodeBlock getCodeblock()
  {
    return codeblock;
  }

  public Comment getComment()
  {
    return comment;
  }

  public Trigger getTrigger()
  {
    return trigger;
  }

  public Position getPosition()
  {
    return position;
  }

  public Position getCodePosition()
  {
    return codePosition;
  }

  public Position getEndPosition()
  {
    return endPosition;
  }

  public String getBodyTypeFullName()
  {
    String answer = bodyType.toString();
    return answer;
  }

  public BodyType getBodyType()
  {
    return bodyType;
  }

  public boolean setBodyType(BodyType aBodyType)
  {
    bodyType = aBodyType;
    return true;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "codeblock" + "=" + (getCodeblock() != null ? !getCodeblock().equals(this)  ? getCodeblock().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "comment" + "=" + (getComment() != null ? !getComment().equals(this)  ? getComment().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "trigger" + "=" + (getTrigger() != null ? !getTrigger().equals(this)  ? getTrigger().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "codePosition" + "=" + (getCodePosition() != null ? !getCodePosition().equals(this)  ? getCodePosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endPosition" + "=" + (getEndPosition() != null ? !getEndPosition().equals(this)  ? getEndPosition().toString().replaceAll("  ","    ") : "this" : "null");
  }
}