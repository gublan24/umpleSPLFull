/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * It is used to track user code when processing objects information
 */
// line 29 "../../../../src/Generator_UmpleModelWalker.ump"
public class UserCode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UserCode Attributes
  private String userCode;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UserCode(String aUserCode)
  {
    userCode = aUserCode;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUserCode(String aUserCode)
  {
    boolean wasSet = false;
    userCode = aUserCode;
    wasSet = true;
    return wasSet;
  }

  public String getUserCode()
  {
    return userCode;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "userCode" + ":" + getUserCode()+ "]";
  }
}