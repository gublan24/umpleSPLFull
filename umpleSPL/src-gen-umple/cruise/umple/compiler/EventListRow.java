/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * A row in the list-style output
 */
// line 768 "../../../../src/Generator_CodeEventSequence.ump"
public class EventListRow
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EventListRow Attributes
  private String cellClassName;
  private String number;
  private String eventName;
  private String nextStateName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EventListRow(String aCellClassName, String aNumber, String aEventName, String aNextStateName)
  {
    cellClassName = aCellClassName;
    number = aNumber;
    eventName = aEventName;
    nextStateName = aNextStateName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCellClassName(String aCellClassName)
  {
    boolean wasSet = false;
    cellClassName = aCellClassName;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumber(String aNumber)
  {
    boolean wasSet = false;
    number = aNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setEventName(String aEventName)
  {
    boolean wasSet = false;
    eventName = aEventName;
    wasSet = true;
    return wasSet;
  }

  public boolean setNextStateName(String aNextStateName)
  {
    boolean wasSet = false;
    nextStateName = aNextStateName;
    wasSet = true;
    return wasSet;
  }

  public String getCellClassName()
  {
    return cellClassName;
  }

  public String getNumber()
  {
    return number;
  }

  public String getEventName()
  {
    return eventName;
  }

  public String getNextStateName()
  {
    return nextStateName;
  }

  public void delete()
  {}

  // line 777 "../../../../src/Generator_CodeEventSequence.ump"
   public StringBuilder output(EventSequenceTemplate templater){
    StringBuilder outputSb = new StringBuilder();
    outputSb.append(templater.genListRowStart());

    outputSb.append(templater.genListCell(cellClassName, number));
    outputSb.append(templater.genListCell(cellClassName, eventName));
    outputSb.append(templater.genListCell(cellClassName, nextStateName));
  
    outputSb.append(templater.genListRowEnd());

    return outputSb;
  }


  public String toString()
  {
    return super.toString() + "["+
            "cellClassName" + ":" + getCellClassName()+ "," +
            "number" + ":" + getNumber()+ "," +
            "eventName" + ":" + getEventName()+ "," +
            "nextStateName" + ":" + getNextStateName()+ "]";
  }
}