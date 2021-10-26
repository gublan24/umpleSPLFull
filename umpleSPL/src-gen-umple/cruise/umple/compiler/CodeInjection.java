/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import cruise.umple.util.*;
import java.util.*;

/**
 * Fragment source file: Umple_CodeMethod.ump
 * Line : 338
 * Fragment source file: UmpleInternalParser_CodeMixset.ump
 * Line : 483
 * A block of code that can be injected into one or more methods, constructor, etc.
 */
// line 5 "../../../../src/Aspect_refactored.ump"
// line 38 "../../../../src/Aspect_refactored.ump"
// line 545 "../../../../src/Umple.ump"
public class CodeInjection
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CodeInjection Attributes
  private String injectionlabel;
  private boolean codeBlockProcessed;
  private String type;
  private String operation;
  private String operationSource;
  private List<String> parameters;
  private CodeBlock snippet;
  private String constraintParameterName;
  private Position position;
  private Position codePosition;
  private boolean isInternal;

  //CodeInjection Associations
  private UmpleClassifier umpleClassifier;
  private ConstraintTree constraintTree;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CodeInjection(String aType, String aOperation, CodeBlock aSnippet, UmpleClassifier aUmpleClassifier)
  {
    injectionlabel = "";
    codeBlockProcessed = false;
    type = aType;
    operation = aOperation;
    operationSource = "generated";
    parameters = new ArrayList<String>();
    snippet = aSnippet;
    constraintParameterName = null;
    isInternal = false;
    if (!setUmpleClassifier(aUmpleClassifier))
    {
      throw new RuntimeException("Unable to create CodeInjection due to aUmpleClassifier. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setInjectionlabel(String aInjectionlabel)
  {
    boolean wasSet = false;
    injectionlabel = aInjectionlabel;
    wasSet = true;
    return wasSet;
  }

  public boolean setCodeBlockProcessed(boolean aCodeBlockProcessed)
  {
    boolean wasSet = false;
    codeBlockProcessed = aCodeBlockProcessed;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public boolean setOperation(String aOperation)
  {
    boolean wasSet = false;
    operation = aOperation;
    wasSet = true;
    return wasSet;
  }

  public boolean setOperationSource(String aOperationSource)
  {
    boolean wasSet = false;
    operationSource = aOperationSource;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addParameter(String aParameter)
  {
    boolean wasAdded = false;
    wasAdded = parameters.add(aParameter);
    return wasAdded;
  }

  public boolean removeParameter(String aParameter)
  {
    boolean wasRemoved = false;
    wasRemoved = parameters.remove(aParameter);
    return wasRemoved;
  }

  public boolean setSnippet(CodeBlock aSnippet)
  {
    boolean wasSet = false;
    snippet = aSnippet;
    wasSet = true;
    return wasSet;
  }

  public boolean setConstraintParameterName(String aConstraintParameterName)
  {
    boolean wasSet = false;
    constraintParameterName = aConstraintParameterName;
    wasSet = true;
    return wasSet;
  }

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setCodePosition(Position aCodePosition)
  {
    boolean wasSet = false;
    codePosition = aCodePosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInternal(boolean aIsInternal)
  {
    boolean wasSet = false;
    isInternal = aIsInternal;
    wasSet = true;
    return wasSet;
  }

  public String getInjectionlabel()
  {
    return injectionlabel;
  }

  public boolean getCodeBlockProcessed()
  {
    return codeBlockProcessed;
  }

  public String getType()
  {
    return type;
  }

  public String getOperation()
  {
    return operation;
  }

  public String getOperationSource()
  {
    return operationSource;
  }
  /* Code from template attribute_GetMany */
  public String getParameter(int index)
  {
    String aParameter = parameters.get(index);
    return aParameter;
  }

  public String[] getParameters()
  {
    String[] newParameters = parameters.toArray(new String[parameters.size()]);
    return newParameters;
  }

  public int numberOfParameters()
  {
    int number = parameters.size();
    return number;
  }

  public boolean hasParameters()
  {
    boolean has = parameters.size() > 0;
    return has;
  }

  public int indexOfParameter(String aParameter)
  {
    int index = parameters.indexOf(aParameter);
    return index;
  }

  public CodeBlock getSnippet()
  {
    return snippet;
  }

  public String getConstraintParameterName()
  {
    return constraintParameterName;
  }

  public Position getPosition()
  {
    return position;
  }

  public Position getCodePosition()
  {
    return codePosition;
  }

  public boolean getIsInternal()
  {
    return isInternal;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInternal()
  {
    return isInternal;
  }
  /* Code from template association_GetOne */
  public UmpleClassifier getUmpleClassifier()
  {
    return umpleClassifier;
  }
  /* Code from template association_GetOne */
  public ConstraintTree getConstraintTree()
  {
    return constraintTree;
  }

  public boolean hasConstraintTree()
  {
    boolean has = constraintTree != null;
    return has;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setUmpleClassifier(UmpleClassifier aNewUmpleClassifier)
  {
    boolean wasSet = false;
    if (aNewUmpleClassifier != null)
    {
      umpleClassifier = aNewUmpleClassifier;
      wasSet = true;
    }
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setConstraintTree(ConstraintTree aNewConstraintTree)
  {
    boolean wasSet = false;
    constraintTree = aNewConstraintTree;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    umpleClassifier = null;
    constraintTree = null;
  }

  // line 9 "../../../../src/Aspect_refactored.ump"
   public  CodeInjection(String a, String b, String c, UmpleClassifier d){
    this(a,b,new CodeBlock(c), d);
  }

  // line 13 "../../../../src/Aspect_refactored.ump"
   public void setCode(String str){
    snippet.setCode(str);
  }

  // line 17 "../../../../src/Aspect_refactored.ump"
   public String getCode(){
    return snippet.getCode();
  }

  // line 21 "../../../../src/Aspect_refactored.ump"
   public String getConstraintCode(CodeTranslator gen){
    return StringFormatter.format(gen.translate("Closed",constraintTree),getCode());
  }

  // line 25 "../../../../src/Aspect_refactored.ump"
   public void setCode(String lang, String code){
    snippet.setCode(lang, code);
  }

  // line 29 "../../../../src/Aspect_refactored.ump"
   public String getCode(String lang){
    return snippet.getCode(lang);
  }

  // line 44 "../../../../src/Aspect_refactored.ump"
  public boolean hasCodeLabel(){
    return ! injectionlabel.equals("");
  }


  public String toString()
  {
    return super.toString() + "["+
            "injectionlabel" + ":" + getInjectionlabel()+ "," +
            "codeBlockProcessed" + ":" + getCodeBlockProcessed()+ "," +
            "type" + ":" + getType()+ "," +
            "operation" + ":" + getOperation()+ "," +
            "operationSource" + ":" + getOperationSource()+ "," +
            "constraintParameterName" + ":" + getConstraintParameterName()+ "," +
            "isInternal" + ":" + getIsInternal()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "snippet" + "=" + (getSnippet() != null ? !getSnippet().equals(this)  ? getSnippet().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "codePosition" + "=" + (getCodePosition() != null ? !getCodePosition().equals(this)  ? getCodePosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClassifier = "+(getUmpleClassifier()!=null?Integer.toHexString(System.identityHashCode(getUmpleClassifier())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "constraintTree = "+(getConstraintTree()!=null?Integer.toHexString(System.identityHashCode(getConstraintTree())):"null");
  }
}