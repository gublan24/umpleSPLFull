/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * Represents a cell in a row in the first row of a Event Sequence table.
 */
// line 670 "../../../../src/Generator_CodeEventSequence.ump"
public class EventSequenceHeaderCell
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EventSequenceHeaderCell Attributes
  private String label;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EventSequenceHeaderCell(String aLabel)
  {
    label = aLabel;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLabel(String aLabel)
  {
    boolean wasSet = false;
    label = aLabel;
    wasSet = true;
    return wasSet;
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
  // line 677 "../../../../src/Generator_CodeEventSequence.ump"
   public String output(EventSequenceTemplate templater){
    String cellContents = templater.genGridHeaderContent(label);

    return templater.genGridCell(templater.TABLE_HEADER, cellContents);
  }


  public String toString()
  {
    return super.toString() + "["+
            "label" + ":" + getLabel()+ "]";
  }
}