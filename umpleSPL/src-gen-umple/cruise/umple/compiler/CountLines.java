/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * This class is used like a structure to help keep values about lines
 */
// line 227 "../../../../src/SimpleMetrics_CodeLines.ump"
public class CountLines
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CountLines Attributes
  private int countLines;
  private int countComments;
  private int countBlanks;
  private int countCode;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CountLines()
  {
    countLines = 0;
    countComments = 0;
    countBlanks = 0;
    countCode = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCountLines(int aCountLines)
  {
    boolean wasSet = false;
    countLines = aCountLines;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountComments(int aCountComments)
  {
    boolean wasSet = false;
    countComments = aCountComments;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountBlanks(int aCountBlanks)
  {
    boolean wasSet = false;
    countBlanks = aCountBlanks;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountCode(int aCountCode)
  {
    boolean wasSet = false;
    countCode = aCountCode;
    wasSet = true;
    return wasSet;
  }

  /**
   * total of lines
   */
  public int getCountLines()
  {
    return countLines;
  }

  /**
   * total of comment lines
   */
  public int getCountComments()
  {
    return countComments;
  }

  /**
   * total of blank lines
   */
  public int getCountBlanks()
  {
    return countBlanks;
  }

  /**
   * total of code line
   */
  public int getCountCode()
  {
    return countCode;
  }

  public void delete()
  {}

  // line 233 "../../../../src/SimpleMetrics_CodeLines.ump"
  public void incCountLines(){
    ++this.countLines;
  }

  // line 236 "../../../../src/SimpleMetrics_CodeLines.ump"
  public void incCountComments(){
    ++this.countComments;
  }

  // line 239 "../../../../src/SimpleMetrics_CodeLines.ump"
  public void incCountBlanks(){
    ++this.countBlanks;
  }

  // line 242 "../../../../src/SimpleMetrics_CodeLines.ump"
  public void incCountCode(){
    ++this.countCode;
  }


  public String toString()
  {
    return super.toString() + "["+
            "countLines" + ":" + getCountLines()+ "," +
            "countComments" + ":" + getCountComments()+ "," +
            "countBlanks" + ":" + getCountBlanks()+ "," +
            "countCode" + ":" + getCountCode()+ "]";
  }
}