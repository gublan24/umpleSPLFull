/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 220 "../../../../src/UmpleImport.ump"
// line 209 "../../../../src/UmpleImport_CodeModels.ump"
public class ImportTransition extends ImportStateMachineElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ImportTransition Attributes
  private String cond;
  private String target;
  private StringBuilder action;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ImportTransition(String aId, String aName, int aDepth, String aElemName, String aCond, String aTarget)
  {
    super(aId, aName, aDepth, aElemName);
    cond = aCond;
    target = aTarget;
    action = new StringBuilder();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCond(String aCond)
  {
    boolean wasSet = false;
    cond = aCond;
    wasSet = true;
    return wasSet;
  }

  public boolean setTarget(String aTarget)
  {
    boolean wasSet = false;
    target = aTarget;
    wasSet = true;
    return wasSet;
  }

  public boolean setAction(StringBuilder aAction)
  {
    boolean wasSet = false;
    action = aAction;
    wasSet = true;
    return wasSet;
  }

  public String getCond()
  {
    return cond;
  }

  public String getTarget()
  {
    return target;
  }

  public StringBuilder getAction()
  {
    return action;
  }

  public void delete()
  {
    super.delete();
  }

  // line 212 "../../../../src/UmpleImport_CodeModels.ump"
  public String generateUmple(){
    String indent = new String(new char[getDepth()]).replace("\0", "\t");
    StringBuilder umpleBuilder = this.getUmpleBuilder();
    umpleBuilder.append(System.lineSeparator() + indent + this.getElemName());
    if (this.getCond() != null) {
      umpleBuilder.append(" [" + this.getCond() + "]");
    }
    umpleBuilder.append(" ->"); 

    StringBuilder action = getAction();
    if (action != null && action.length() > 0) {
      umpleBuilder.append(" / {"+System.lineSeparator() + indent + "\t");
      String content = action.toString().replaceAll(System.lineSeparator(), System.lineSeparator() + indent + "\t");
      content = content.trim();
      umpleBuilder.append(content);
      umpleBuilder.append(System.lineSeparator() + indent + "}");
    }

    umpleBuilder.append(" " +this.getTarget() + ";");

    return umpleBuilder.toString();
  }


  public String toString()
  {
    return super.toString() + "["+
            "cond" + ":" + getCond()+ "," +
            "target" + ":" + getTarget()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "action" + "=" + (getAction() != null ? !getAction().equals(this)  ? getAction().toString().replaceAll("  ","    ") : "this" : "null");
  }
}