/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * Represents a cell in a row in the Event Sequence table.
 */
// line 684 "../../../../src/Generator_CodeEventSequence.ump"
public class EventSequenceCell
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EventSequenceCell Attributes
  private boolean isEmpty;
  private String label;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EventSequenceCell(boolean aIsEmpty, String aLabel)
  {
    isEmpty = aIsEmpty;
    label = aLabel;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsEmpty(boolean aIsEmpty)
  {
    boolean wasSet = false;
    isEmpty = aIsEmpty;
    wasSet = true;
    return wasSet;
  }

  public boolean setLabel(String aLabel)
  {
    boolean wasSet = false;
    label = aLabel;
    wasSet = true;
    return wasSet;
  }

  public boolean getIsEmpty()
  {
    return isEmpty;
  }

  public String getLabel()
  {
    return label;
  }

  public void delete()
  {}


  /**
   * Outputs this cell
   */
  // line 692 "../../../../src/Generator_CodeEventSequence.ump"
   public String output(EventSequenceTemplate templater){
    return templater.genGridCell(templater.TABLE_CELL, 
                                 generateCellContents(templater));
  }


  /**
   * Outputs this cell if it is the first in the row
   */
  // line 699 "../../../../src/Generator_CodeEventSequence.ump"
   public String outputFirst(EventSequenceTemplate templater, String parentId){
    return templater.genFirstGridCell(templater.TABLE_CELL, 
                                      parentId, 
                                      generateCellContents(templater));
  }

  // line 706 "../../../../src/Generator_CodeEventSequence.ump"
   private String generateCellContents(EventSequenceTemplate templater){
    if(isEmpty)
    {
      return "&nbsp;";  
    }
    else
    {
      return label;
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "isEmpty" + ":" + getIsEmpty()+ "," +
            "label" + ":" + getLabel()+ "]";
  }
}