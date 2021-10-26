/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.util;

// line 12 "../../../../src/Util_Code.ump"
public class TriState
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TriState Attributes
  private boolean isSet;
  private boolean status;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TriState(boolean aStatus)
  {
    isSet = false;
    status = aStatus;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsSet(boolean aIsSet)
  {
    boolean wasSet = false;
    isSet = aIsSet;
    wasSet = true;
    return wasSet;
  }

  public boolean setStatus(boolean aStatus)
  {
    boolean wasSet = false;
    status = aStatus;
    wasSet = true;
    // line 17 "../../../../src/Util_Code.ump"
    isSet = true;
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean getIsSet()
  {
    return isSet;
  }

  public boolean getStatus()
  {
    return status;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsSet()
  {
    return isSet;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isStatus()
  {
    return status;
  }

  public void delete()
  {}

  // line 19 "../../../../src/Util_Code.ump"
   public boolean isTrue(){
    return isSet && status;
  }

  // line 20 "../../../../src/Util_Code.ump"
   public boolean isFalse(){
    return isSet && !status;
  }


  public String toString()
  {
    return super.toString() + "["+
            "isSet" + ":" + getIsSet()+ "," +
            "status" + ":" + getStatus()+ "]";
  }
}