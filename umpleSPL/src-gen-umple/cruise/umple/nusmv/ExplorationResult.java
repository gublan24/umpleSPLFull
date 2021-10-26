/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import cruise.umple.compiler.*;
import java.util.*;

// line 23 "../../../../src/TargetConfig.ump"
public class ExplorationResult
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ExplorationResult Attributes
  private HashMap<State,TargetConfiguration> map;

  //ExplorationResult Associations
  private StateMachine stateMachine;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ExplorationResult(StateMachine aStateMachine)
  {
    map = new HashMap<State, TargetConfiguration>();
    if (!setStateMachine(aStateMachine))
    {
      throw new RuntimeException("Unable to create ExplorationResult due to aStateMachine. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMap(HashMap<State,TargetConfiguration> aMap)
  {
    boolean wasSet = false;
    map = aMap;
    wasSet = true;
    return wasSet;
  }

  public HashMap<State,TargetConfiguration> getMap()
  {
    return map;
  }
  /* Code from template association_GetOne */
  public StateMachine getStateMachine()
  {
    return stateMachine;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setStateMachine(StateMachine aNewStateMachine)
  {
    boolean wasSet = false;
    if (aNewStateMachine != null)
    {
      stateMachine = aNewStateMachine;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    stateMachine = null;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "map" + "=" + (getMap() != null ? !getMap().equals(this)  ? getMap().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "stateMachine = "+(getStateMachine()!=null?Integer.toHexString(System.identityHashCode(getStateMachine())):"null");
  }
}