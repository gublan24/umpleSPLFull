/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * class TraceRecord
 * {
 * Boolean recordOnly = false;
 * -> * UmpleVariable;
 * -> * Attribute;
 * 1 -> * Record;
 * }
 */
// line 135 "../../../../src/Trace.ump"
public class Record
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Record Attributes
  private String recordString;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Record(String aRecordString)
  {
    recordString = aRecordString;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRecordString(String aRecordString)
  {
    boolean wasSet = false;
    recordString = aRecordString;
    wasSet = true;
    return wasSet;
  }

  public String getRecordString()
  {
    return recordString;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "recordString" + ":" + getRecordString()+ "]";
  }
}