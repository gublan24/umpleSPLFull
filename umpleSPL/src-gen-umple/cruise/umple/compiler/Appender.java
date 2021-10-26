/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 84 "../../../../src/Trace.ump"
public class Appender
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Appender Attributes
  private String appender;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Appender(String aAppender)
  {
    appender = aAppender;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAppender(String aAppender)
  {
    boolean wasSet = false;
    appender = aAppender;
    wasSet = true;
    return wasSet;
  }

  public String getAppender()
  {
    return appender;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "appender" + ":" + getAppender()+ "]";
  }
}