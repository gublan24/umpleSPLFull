/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 228 "../../../../src/UmpleImport.ump"
// line 235 "../../../../src/UmpleImport_CodeModels.ump"
public class ImportAction extends ImportStateMachineElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ImportAction Attributes
  private StringBuilder content;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ImportAction(String aId, String aName, int aDepth, String aElemName)
  {
    super(aId, aName, aDepth, aElemName);
    content = new StringBuilder();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setContent(StringBuilder aContent)
  {
    boolean wasSet = false;
    content = aContent;
    wasSet = true;
    return wasSet;
  }

  public StringBuilder getContent()
  {
    return content;
  }

  public void delete()
  {
    super.delete();
  }

  // line 238 "../../../../src/UmpleImport_CodeModels.ump"
  public String generateUmple(){
    String indent = new String(new char[getDepth()]).replace("\0", "\t");
    StringBuilder umpleBuilder = this.getUmpleBuilder();

    umpleBuilder.append(System.lineSeparator() + indent + getElemName() + " / {");

    if (content.length() > 0) {
      String contentString = content.toString().replaceAll("\n", System.lineSeparator() + indent + "\t");
      contentString = contentString.trim();
      umpleBuilder.append(System.lineSeparator() + indent + "\t" + contentString);
    }   

    umpleBuilder.append(System.lineSeparator() + indent + "}");

    return umpleBuilder.toString();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "content" + "=" + (getContent() != null ? !getContent().equals(this)  ? getContent().toString().replaceAll("  ","    ") : "this" : "null");
  }
}