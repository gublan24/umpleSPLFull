/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 22 "../../../../src/Generator_CodeStructureDiagram.ump"
public class BindingDescriptor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //BindingDescriptor Attributes
  private String fromPort;
  private String toPort;
  private List<String> connectors;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BindingDescriptor(String aFromPort, String aToPort)
  {
    fromPort = aFromPort;
    toPort = aToPort;
    connectors = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setFromPort(String aFromPort)
  {
    boolean wasSet = false;
    fromPort = aFromPort;
    wasSet = true;
    return wasSet;
  }

  public boolean setToPort(String aToPort)
  {
    boolean wasSet = false;
    toPort = aToPort;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addConnector(String aConnector)
  {
    boolean wasAdded = false;
    wasAdded = connectors.add(aConnector);
    return wasAdded;
  }

  public boolean removeConnector(String aConnector)
  {
    boolean wasRemoved = false;
    wasRemoved = connectors.remove(aConnector);
    return wasRemoved;
  }

  public String getFromPort()
  {
    return fromPort;
  }

  public String getToPort()
  {
    return toPort;
  }
  /* Code from template attribute_GetMany */
  public String getConnector(int index)
  {
    String aConnector = connectors.get(index);
    return aConnector;
  }

  public String[] getConnectors()
  {
    String[] newConnectors = connectors.toArray(new String[connectors.size()]);
    return newConnectors;
  }

  public int numberOfConnectors()
  {
    int number = connectors.size();
    return number;
  }

  public boolean hasConnectors()
  {
    boolean has = connectors.size() > 0;
    return has;
  }

  public int indexOfConnector(String aConnector)
  {
    int index = connectors.indexOf(aConnector);
    return index;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "fromPort" + ":" + getFromPort()+ "," +
            "toPort" + ":" + getToPort()+ "]";
  }
}