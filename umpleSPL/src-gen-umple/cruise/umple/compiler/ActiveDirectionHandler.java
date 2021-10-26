/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

// line 150 "../../../../src/Structure.ump"
public class ActiveDirectionHandler
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ActiveDirectionHandler Attributes
  private Position position;
  private Position codePosition;
  private Position endPosition;

  //ActiveDirectionHandler State Machines
  public enum DirectionHandler { FORWARD, INVERSE }
  private DirectionHandler directionHandler;

  //ActiveDirectionHandler Associations
  private List<ActiveDirectionHandlerBody> activeDirectionHandlerBodies;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ActiveDirectionHandler()
  {
    activeDirectionHandlerBodies = new ArrayList<ActiveDirectionHandlerBody>();
    setDirectionHandler(DirectionHandler.FORWARD);
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

  public String getDirectionHandlerFullName()
  {
    String answer = directionHandler.toString();
    return answer;
  }

  public DirectionHandler getDirectionHandler()
  {
    return directionHandler;
  }

  public boolean setDirectionHandler(DirectionHandler aDirectionHandler)
  {
    directionHandler = aDirectionHandler;
    return true;
  }
  /* Code from template association_GetMany */
  public ActiveDirectionHandlerBody getActiveDirectionHandlerBody(int index)
  {
    ActiveDirectionHandlerBody aActiveDirectionHandlerBody = activeDirectionHandlerBodies.get(index);
    return aActiveDirectionHandlerBody;
  }

  public List<ActiveDirectionHandlerBody> getActiveDirectionHandlerBodies()
  {
    List<ActiveDirectionHandlerBody> newActiveDirectionHandlerBodies = Collections.unmodifiableList(activeDirectionHandlerBodies);
    return newActiveDirectionHandlerBodies;
  }

  public int numberOfActiveDirectionHandlerBodies()
  {
    int number = activeDirectionHandlerBodies.size();
    return number;
  }

  public boolean hasActiveDirectionHandlerBodies()
  {
    boolean has = activeDirectionHandlerBodies.size() > 0;
    return has;
  }

  public int indexOfActiveDirectionHandlerBody(ActiveDirectionHandlerBody aActiveDirectionHandlerBody)
  {
    int index = activeDirectionHandlerBodies.indexOf(aActiveDirectionHandlerBody);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfActiveDirectionHandlerBodies()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addActiveDirectionHandlerBody(ActiveDirectionHandlerBody aActiveDirectionHandlerBody)
  {
    boolean wasAdded = false;
    if (activeDirectionHandlerBodies.contains(aActiveDirectionHandlerBody)) { return false; }
    activeDirectionHandlerBodies.add(aActiveDirectionHandlerBody);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeActiveDirectionHandlerBody(ActiveDirectionHandlerBody aActiveDirectionHandlerBody)
  {
    boolean wasRemoved = false;
    if (activeDirectionHandlerBodies.contains(aActiveDirectionHandlerBody))
    {
      activeDirectionHandlerBodies.remove(aActiveDirectionHandlerBody);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addActiveDirectionHandlerBodyAt(ActiveDirectionHandlerBody aActiveDirectionHandlerBody, int index)
  {  
    boolean wasAdded = false;
    if(addActiveDirectionHandlerBody(aActiveDirectionHandlerBody))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfActiveDirectionHandlerBodies()) { index = numberOfActiveDirectionHandlerBodies() - 1; }
      activeDirectionHandlerBodies.remove(aActiveDirectionHandlerBody);
      activeDirectionHandlerBodies.add(index, aActiveDirectionHandlerBody);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveActiveDirectionHandlerBodyAt(ActiveDirectionHandlerBody aActiveDirectionHandlerBody, int index)
  {
    boolean wasAdded = false;
    if(activeDirectionHandlerBodies.contains(aActiveDirectionHandlerBody))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfActiveDirectionHandlerBodies()) { index = numberOfActiveDirectionHandlerBodies() - 1; }
      activeDirectionHandlerBodies.remove(aActiveDirectionHandlerBody);
      activeDirectionHandlerBodies.add(index, aActiveDirectionHandlerBody);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addActiveDirectionHandlerBodyAt(aActiveDirectionHandlerBody, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    activeDirectionHandlerBodies.clear();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "codePosition" + "=" + (getCodePosition() != null ? !getCodePosition().equals(this)  ? getCodePosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endPosition" + "=" + (getEndPosition() != null ? !getEndPosition().equals(this)  ? getEndPosition().toString().replaceAll("  ","    ") : "this" : "null");
  }
}