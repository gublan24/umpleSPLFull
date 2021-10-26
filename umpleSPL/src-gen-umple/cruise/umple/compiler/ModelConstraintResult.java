/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;

// line 767 "../../../../src/Umple_CodeConstraint.ump"
public class ModelConstraintResult
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ModelConstraintResult Attributes
  private Position position;
  private int error;
  private String target;
  private String source;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelConstraintResult(Position aPosition, int aError, String aTarget, String aSource)
  {
    position = aPosition;
    error = aError;
    target = aTarget;
    source = aSource;
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

  public boolean setError(int aError)
  {
    boolean wasSet = false;
    error = aError;
    wasSet = true;
    return wasSet;
  }

  public boolean setTarget(String aTarget)
  {
    boolean wasSet = false;
    target = aTarget;
    wasSet = true;
    return wasSet;
  }

  public boolean setSource(String aSource)
  {
    boolean wasSet = false;
    source = aSource;
    wasSet = true;
    return wasSet;
  }

  public Position getPosition()
  {
    return position;
  }

  public int getError()
  {
    return error;
  }

  public String getTarget()
  {
    return target;
  }

  public String getSource()
  {
    return source;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "error" + ":" + getError()+ "," +
            "target" + ":" + getTarget()+ "," +
            "source" + ":" + getSource()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null");
  }
}