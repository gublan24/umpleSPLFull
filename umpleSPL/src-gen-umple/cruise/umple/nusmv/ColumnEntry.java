/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import cruise.umple.compiler.*;

// line 163 "../../../../src/NuSMVMetamodel.ump"
public class ColumnEntry implements StateTableEntry
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ColumnEntry Attributes
  private boolean isDerived;
  private String value;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ColumnEntry(String aValue)
  {
    isDerived = false;
    value = aValue;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsDerived(boolean aIsDerived)
  {
    boolean wasSet = false;
    isDerived = aIsDerived;
    wasSet = true;
    return wasSet;
  }

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  /**
   * local variables
   */
  public boolean getIsDerived()
  {
    return isDerived;
  }

  public String getValue()
  {
    return value;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsDerived()
  {
    return isDerived;
  }

  public void delete()
  {}


  /**
   * Output this state cell as html - appears in counterexample table
   */
  // line 173 "../../../../src/NuSMVMetamodel.ump"
   public StringBuilder htmlString(){
    StringBuilder sb = new StringBuilder();
    	sb.append("<span");
    	if( isDerived ) sb.append(" class=\"derived\"");
    	sb.append(">");
    	sb.append(value);
    	sb.append("</span>");
    	return( sb );
  }


  public String toString()
  {
    return super.toString() + "["+
            "isDerived" + ":" + getIsDerived()+ "," +
            "value" + ":" + getValue()+ "]";
  }
}