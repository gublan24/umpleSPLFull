/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.sync;

// line 14 "../../../../src/UmpleSync.ump"
// line 14 "../../../../src/SynchronizationAction_Code.ump"
public class SynchronizationAction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SynchronizationAction Attributes
  private String deltaCode;
  private String umpleCode;
  private String filename;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SynchronizationAction(String aDeltaCode, String aUmpleCode, String aFilename)
  {
    deltaCode = aDeltaCode;
    umpleCode = aUmpleCode;
    filename = aFilename;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDeltaCode(String aDeltaCode)
  {
    boolean wasSet = false;
    deltaCode = aDeltaCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setUmpleCode(String aUmpleCode)
  {
    boolean wasSet = false;
    umpleCode = aUmpleCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setFilename(String aFilename)
  {
    boolean wasSet = false;
    filename = aFilename;
    wasSet = true;
    return wasSet;
  }

  public String getDeltaCode()
  {
    return deltaCode;
  }

  public String getUmpleCode()
  {
    return umpleCode;
  }

  public String getFilename()
  {
    return filename;
  }

  public void delete()
  {}

  // line 19 "../../../../src/SynchronizationAction_Code.ump"
   public void go(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "deltaCode" + ":" + getDeltaCode()+ "," +
            "umpleCode" + ":" + getUmpleCode()+ "," +
            "filename" + ":" + getFilename()+ "]";
  }
}