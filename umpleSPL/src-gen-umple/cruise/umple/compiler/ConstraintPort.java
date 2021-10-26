/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * ConstraintPort encapsulate the statemachine data in a port watch expression
 */
// line 758 "../../../../src/Umple_CodeConstraint.ump"
// line 521 "../../../../src/Umple.ump"
public class ConstraintPort extends ConstraintNamed
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintPort Attributes
  private Port port;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetPort;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintPort(Port aPort)
  {
    super();
    cachedHashCode = -1;
    canSetPort = true;
    port = aPort;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPort(Port aPort)
  {
    boolean wasSet = false;
    if (!canSetPort) { return false; }
    port = aPort;
    wasSet = true;
    return wasSet;
  }

  public Port getPort()
  {
    return port;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    ConstraintPort compareTo = (ConstraintPort)obj;
  
    if (getPort() == null && compareTo.getPort() != null)
    {
      return false;
    }
    else if (getPort() != null && !getPort().equals(compareTo.getPort()))
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
    if (getPort() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getPort().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetPort = false;
    return cachedHashCode;
  }

  public void delete()
  {
    super.delete();
  }

  // line 762 "../../../../src/Umple_CodeConstraint.ump"
  public String getName(){
    return port==null?null:port.getName();
  }

  // line 764 "../../../../src/Umple_CodeConstraint.ump"
   public String getType(){
    return "port";
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "port" + "=" + (getPort() != null ? !getPort().equals(this)  ? getPort().toString().replaceAll("  ","    ") : "this" : "null");
  }
}