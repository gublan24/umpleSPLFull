/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * Designed to be implemnted ny metric classes. IT is used as an abstract representation for
 * any type of Maasurment vistors (@see LLOCMetricVisitor).
 */
// line 76 "../../../../src/Generator_CodeAnalysis.ump"
public class MeasurmentObject
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MeasurmentObject Attributes
  private int codeCount;
  private int commentsCount;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MeasurmentObject(int aCodeCount, int aCommentsCount)
  {
    codeCount = aCodeCount;
    commentsCount = aCommentsCount;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCodeCount(int aCodeCount)
  {
    boolean wasSet = false;
    codeCount = aCodeCount;
    wasSet = true;
    return wasSet;
  }

  public boolean setCommentsCount(int aCommentsCount)
  {
    boolean wasSet = false;
    commentsCount = aCommentsCount;
    wasSet = true;
    return wasSet;
  }

  public int getCodeCount()
  {
    return codeCount;
  }

  public int getCommentsCount()
  {
    return commentsCount;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "codeCount" + ":" + getCodeCount()+ "," +
            "commentsCount" + ":" + getCommentsCount()+ "]";
  }
}