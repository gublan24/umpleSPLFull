/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;

// line 51 "../../../../src/Structure.ump"
public class PortBindingInformation
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PortBindingInformation Attributes
  private String fromPortClass;
  private String fromPort;
  private String toPortClass;
  private String toPort;
  private String code;
  private Position position;
  private Position endPosition;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PortBindingInformation(String aFromPortClass, String aFromPort, String aToPortClass, String aToPort, String aCode)
  {
    fromPortClass = aFromPortClass;
    fromPort = aFromPort;
    toPortClass = aToPortClass;
    toPort = aToPort;
    code = aCode;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setFromPortClass(String aFromPortClass)
  {
    boolean wasSet = false;
    fromPortClass = aFromPortClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setFromPort(String aFromPort)
  {
    boolean wasSet = false;
    fromPort = aFromPort;
    wasSet = true;
    return wasSet;
  }

  public boolean setToPortClass(String aToPortClass)
  {
    boolean wasSet = false;
    toPortClass = aToPortClass;
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

  public boolean setCode(String aCode)
  {
    boolean wasSet = false;
    code = aCode;
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

  public boolean setEndPosition(Position aEndPosition)
  {
    boolean wasSet = false;
    endPosition = aEndPosition;
    wasSet = true;
    return wasSet;
  }

  public String getFromPortClass()
  {
    return fromPortClass;
  }

  public String getFromPort()
  {
    return fromPort;
  }

  public String getToPortClass()
  {
    return toPortClass;
  }

  public String getToPort()
  {
    return toPort;
  }

  public String getCode()
  {
    return code;
  }

  public Position getPosition()
  {
    return position;
  }

  public Position getEndPosition()
  {
    return endPosition;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "fromPortClass" + ":" + getFromPortClass()+ "," +
            "fromPort" + ":" + getFromPort()+ "," +
            "toPortClass" + ":" + getToPortClass()+ "," +
            "toPort" + ":" + getToPort()+ "," +
            "code" + ":" + getCode()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endPosition" + "=" + (getEndPosition() != null ? !getEndPosition().equals(this)  ? getEndPosition().toString().replaceAll("  ","    ") : "this" : "null");
  }
}