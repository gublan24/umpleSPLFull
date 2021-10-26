/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 60 "../../../../src/Trace.ump"
public class MessageComponent
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MessageComponent Attributes
  private String component;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MessageComponent(String aComponent)
  {
    component = aComponent;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setComponent(String aComponent)
  {
    boolean wasSet = false;
    component = aComponent;
    wasSet = true;
    return wasSet;
  }

  public String getComponent()
  {
    return component;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "component" + ":" + getComponent()+ "]";
  }
}