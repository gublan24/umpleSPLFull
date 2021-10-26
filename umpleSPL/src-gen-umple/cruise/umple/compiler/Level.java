/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 79 "../../../../src/Trace.ump"
public class Level
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Level Attributes
  private String level;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Level(String aLevel)
  {
    level = aLevel;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLevel(String aLevel)
  {
    boolean wasSet = false;
    level = aLevel;
    wasSet = true;
    return wasSet;
  }

  public String getLevel()
  {
    return level;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "level" + ":" + getLevel()+ "]";
  }
}