/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * component
 */
// line 1231 "../../../../src/Umple.ump"
// line 45 "../../../../src/Structure.ump"
public class Port
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Port Attributes
  private String name;
  private String modifier;
  private boolean conjugated;
  private int multiplicity;
  private boolean replicated;
  private String signalType;

  //Port State Machines
  public enum Direction { IN, OUT, BOTH }
  private Direction direction;
  public enum Type { END, RELAY, SERVICE, CUSTOM }
  private Type type;

  //Port Associations
  private Position position;
  private Position endPosition;
  private List<PortBinding> bindings;
  private Protocol protocol;
  private UmpleClass umpleClass;
  private List<PortBinding> portBindings;
  private List<PortBinding> connector;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Port(String aName, String aModifier, boolean aConjugated, int aMultiplicity, boolean aReplicated, String aSignalType)
  {
    name = aName;
    modifier = aModifier;
    conjugated = aConjugated;
    multiplicity = aMultiplicity;
    replicated = aReplicated;
    signalType = aSignalType;
    bindings = new ArrayList<PortBinding>();
    portBindings = new ArrayList<PortBinding>();
    connector = new ArrayList<PortBinding>();
    setDirection(Direction.IN);
    setType(Type.END);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setModifier(String aModifier)
  {
    boolean wasSet = false;
    modifier = aModifier;
    wasSet = true;
    return wasSet;
  }

  public boolean setConjugated(boolean aConjugated)
  {
    boolean wasSet = false;
    conjugated = aConjugated;
    wasSet = true;
    return wasSet;
  }

  public boolean setMultiplicity(int aMultiplicity)
  {
    boolean wasSet = false;
    multiplicity = aMultiplicity;
    wasSet = true;
    return wasSet;
  }

  public boolean setReplicated(boolean aReplicated)
  {
    boolean wasSet = false;
    replicated = aReplicated;
    wasSet = true;
    return wasSet;
  }

  public boolean setSignalType(String aSignalType)
  {
    boolean wasSet = false;
    signalType = aSignalType;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getModifier()
  {
    return modifier;
  }

  public boolean getConjugated()
  {
    return conjugated;
  }

  public int getMultiplicity()
  {
    return multiplicity;
  }

  public boolean getReplicated()
  {
    return replicated;
  }

  public String getSignalType()
  {
    return signalType;
  }

  public String getDirectionFullName()
  {
    String answer = direction.toString();
    return answer;
  }

  public String getTypeFullName()
  {
    String answer = type.toString();
    return answer;
  }

  public Direction getDirection()
  {
    return direction;
  }

  public Type getType()
  {
    return type;
  }

  public boolean setDirection(Direction aDirection)
  {
    direction = aDirection;
    return true;
  }

  public boolean setType(Type aType)
  {
    type = aType;
    return true;
  }
  /* Code from template association_GetOne */
  public Position getPosition()
  {
    return position;
  }

  public boolean hasPosition()
  {
    boolean has = position != null;
    return has;
  }
  /* Code from template association_GetOne */
  public Position getEndPosition()
  {
    return endPosition;
  }

  public boolean hasEndPosition()
  {
    boolean has = endPosition != null;
    return has;
  }
  /* Code from template association_GetMany */
  public PortBinding getBinding(int index)
  {
    PortBinding aBinding = bindings.get(index);
    return aBinding;
  }

  public List<PortBinding> getBindings()
  {
    List<PortBinding> newBindings = Collections.unmodifiableList(bindings);
    return newBindings;
  }

  public int numberOfBindings()
  {
    int number = bindings.size();
    return number;
  }

  public boolean hasBindings()
  {
    boolean has = bindings.size() > 0;
    return has;
  }

  public int indexOfBinding(PortBinding aBinding)
  {
    int index = bindings.indexOf(aBinding);
    return index;
  }
  /* Code from template association_GetOne */
  public Protocol getProtocol()
  {
    return protocol;
  }

  public boolean hasProtocol()
  {
    boolean has = protocol != null;
    return has;
  }
  /* Code from template association_GetOne */
  public UmpleClass getUmpleClass()
  {
    return umpleClass;
  }

  public boolean hasUmpleClass()
  {
    boolean has = umpleClass != null;
    return has;
  }
  /* Code from template association_GetMany */
  public PortBinding getPortBinding(int index)
  {
    PortBinding aPortBinding = portBindings.get(index);
    return aPortBinding;
  }

  public List<PortBinding> getPortBindings()
  {
    List<PortBinding> newPortBindings = Collections.unmodifiableList(portBindings);
    return newPortBindings;
  }

  public int numberOfPortBindings()
  {
    int number = portBindings.size();
    return number;
  }

  public boolean hasPortBindings()
  {
    boolean has = portBindings.size() > 0;
    return has;
  }

  public int indexOfPortBinding(PortBinding aPortBinding)
  {
    int index = portBindings.indexOf(aPortBinding);
    return index;
  }
  /* Code from template association_GetMany */
  public PortBinding getConnector(int index)
  {
    PortBinding aConnector = connector.get(index);
    return aConnector;
  }

  public List<PortBinding> getConnector()
  {
    List<PortBinding> newConnector = Collections.unmodifiableList(connector);
    return newConnector;
  }

  public int numberOfConnector()
  {
    int number = connector.size();
    return number;
  }

  public boolean hasConnector()
  {
    boolean has = connector.size() > 0;
    return has;
  }

  public int indexOfConnector(PortBinding aConnector)
  {
    int index = connector.indexOf(aConnector);
    return index;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setPosition(Position aNewPosition)
  {
    boolean wasSet = false;
    position = aNewPosition;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setEndPosition(Position aNewEndPosition)
  {
    boolean wasSet = false;
    endPosition = aNewEndPosition;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBindings()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addBinding(PortBinding aBinding)
  {
    boolean wasAdded = false;
    if (bindings.contains(aBinding)) { return false; }
    bindings.add(aBinding);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeBinding(PortBinding aBinding)
  {
    boolean wasRemoved = false;
    if (bindings.contains(aBinding))
    {
      bindings.remove(aBinding);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addBindingAt(PortBinding aBinding, int index)
  {  
    boolean wasAdded = false;
    if(addBinding(aBinding))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBindings()) { index = numberOfBindings() - 1; }
      bindings.remove(aBinding);
      bindings.add(index, aBinding);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBindingAt(PortBinding aBinding, int index)
  {
    boolean wasAdded = false;
    if(bindings.contains(aBinding))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBindings()) { index = numberOfBindings() - 1; }
      bindings.remove(aBinding);
      bindings.add(index, aBinding);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBindingAt(aBinding, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setProtocol(Protocol aNewProtocol)
  {
    boolean wasSet = false;
    protocol = aNewProtocol;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasSet = false;
    // line 1245 "../../../../src/Umple.ump"
    if (aUmpleClass != null && aUmpleClass.isImmutable()) { return false; }
    // END OF UMPLE BEFORE INJECTION
    UmpleClass existingUmpleClass = umpleClass;
    umpleClass = aUmpleClass;
    if (existingUmpleClass != null && !existingUmpleClass.equals(aUmpleClass))
    {
      existingUmpleClass.removePort(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addPort(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPortBindings()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public PortBinding addPortBinding(Port aToPort)
  {
    return new PortBinding(this, aToPort);
  }

  public boolean addPortBinding(PortBinding aPortBinding)
  {
    boolean wasAdded = false;
    if (portBindings.contains(aPortBinding)) { return false; }
    Port existingFromPort = aPortBinding.getFromPort();
    boolean isNewFromPort = existingFromPort != null && !this.equals(existingFromPort);
    if (isNewFromPort)
    {
      aPortBinding.setFromPort(this);
    }
    else
    {
      portBindings.add(aPortBinding);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePortBinding(PortBinding aPortBinding)
  {
    boolean wasRemoved = false;
    //Unable to remove aPortBinding, as it must always have a fromPort
    if (!this.equals(aPortBinding.getFromPort()))
    {
      portBindings.remove(aPortBinding);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPortBindingAt(PortBinding aPortBinding, int index)
  {  
    boolean wasAdded = false;
    if(addPortBinding(aPortBinding))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPortBindings()) { index = numberOfPortBindings() - 1; }
      portBindings.remove(aPortBinding);
      portBindings.add(index, aPortBinding);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePortBindingAt(PortBinding aPortBinding, int index)
  {
    boolean wasAdded = false;
    if(portBindings.contains(aPortBinding))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPortBindings()) { index = numberOfPortBindings() - 1; }
      portBindings.remove(aPortBinding);
      portBindings.add(index, aPortBinding);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPortBindingAt(aPortBinding, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfConnector()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public PortBinding addConnector(Port aFromPort)
  {
    return new PortBinding(aFromPort, this);
  }

  public boolean addConnector(PortBinding aConnector)
  {
    boolean wasAdded = false;
    if (connector.contains(aConnector)) { return false; }
    Port existingToPort = aConnector.getToPort();
    boolean isNewToPort = existingToPort != null && !this.equals(existingToPort);
    if (isNewToPort)
    {
      aConnector.setToPort(this);
    }
    else
    {
      connector.add(aConnector);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeConnector(PortBinding aConnector)
  {
    boolean wasRemoved = false;
    //Unable to remove aConnector, as it must always have a toPort
    if (!this.equals(aConnector.getToPort()))
    {
      connector.remove(aConnector);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addConnectorAt(PortBinding aConnector, int index)
  {  
    boolean wasAdded = false;
    if(addConnector(aConnector))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConnector()) { index = numberOfConnector() - 1; }
      connector.remove(aConnector);
      connector.add(index, aConnector);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveConnectorAt(PortBinding aConnector, int index)
  {
    boolean wasAdded = false;
    if(connector.contains(aConnector))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConnector()) { index = numberOfConnector() - 1; }
      connector.remove(aConnector);
      connector.add(index, aConnector);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addConnectorAt(aConnector, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    position = null;
    endPosition = null;
    bindings.clear();
    protocol = null;
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removePort(this);
    }
    for(int i=portBindings.size(); i > 0; i--)
    {
      PortBinding aPortBinding = portBindings.get(i - 1);
      aPortBinding.delete();
    }
    for(int i=connector.size(); i > 0; i--)
    {
      PortBinding aConnector = connector.get(i - 1);
      aConnector.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "modifier" + ":" + getModifier()+ "," +
            "conjugated" + ":" + getConjugated()+ "," +
            "multiplicity" + ":" + getMultiplicity()+ "," +
            "replicated" + ":" + getReplicated()+ "," +
            "signalType" + ":" + getSignalType()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position = "+(getPosition()!=null?Integer.toHexString(System.identityHashCode(getPosition())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "endPosition = "+(getEndPosition()!=null?Integer.toHexString(System.identityHashCode(getEndPosition())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "protocol = "+(getProtocol()!=null?Integer.toHexString(System.identityHashCode(getProtocol())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null");
  }
}