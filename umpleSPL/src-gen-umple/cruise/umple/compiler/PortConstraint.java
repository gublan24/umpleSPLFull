/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

// line 101 "../../../../src/Structure.ump"
public class PortConstraint
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PortConstraint Attributes
  private Position position;
  private Position endPosition;
  private Port port;

  //PortConstraint Associations
  private List<BasicConstraint> constraints;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PortConstraint(Port aPort)
  {
    port = aPort;
    constraints = new ArrayList<BasicConstraint>();
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

  public boolean setPort(Port aPort)
  {
    boolean wasSet = false;
    port = aPort;
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

  public Port getPort()
  {
    return port;
  }
  /* Code from template association_GetMany */
  public BasicConstraint getConstraint(int index)
  {
    BasicConstraint aConstraint = constraints.get(index);
    return aConstraint;
  }

  public List<BasicConstraint> getConstraints()
  {
    List<BasicConstraint> newConstraints = Collections.unmodifiableList(constraints);
    return newConstraints;
  }

  public int numberOfConstraints()
  {
    int number = constraints.size();
    return number;
  }

  public boolean hasConstraints()
  {
    boolean has = constraints.size() > 0;
    return has;
  }

  public int indexOfConstraint(BasicConstraint aConstraint)
  {
    int index = constraints.indexOf(aConstraint);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfConstraints()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addConstraint(BasicConstraint aConstraint)
  {
    boolean wasAdded = false;
    if (constraints.contains(aConstraint)) { return false; }
    constraints.add(aConstraint);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeConstraint(BasicConstraint aConstraint)
  {
    boolean wasRemoved = false;
    if (constraints.contains(aConstraint))
    {
      constraints.remove(aConstraint);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addConstraintAt(BasicConstraint aConstraint, int index)
  {  
    boolean wasAdded = false;
    if(addConstraint(aConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstraints()) { index = numberOfConstraints() - 1; }
      constraints.remove(aConstraint);
      constraints.add(index, aConstraint);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveConstraintAt(BasicConstraint aConstraint, int index)
  {
    boolean wasAdded = false;
    if(constraints.contains(aConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstraints()) { index = numberOfConstraints() - 1; }
      constraints.remove(aConstraint);
      constraints.add(index, aConstraint);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addConstraintAt(aConstraint, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    constraints.clear();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endPosition" + "=" + (getEndPosition() != null ? !getEndPosition().equals(this)  ? getEndPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "port" + "=" + (getPort() != null ? !getPort().equals(this)  ? getPort().toString().replaceAll("  ","    ") : "this" : "null");
  }
}