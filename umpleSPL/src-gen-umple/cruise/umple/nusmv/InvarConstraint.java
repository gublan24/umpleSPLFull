/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;

// line 595 "../../../../src/NuSMVMetamodel.ump"
public class InvarConstraint extends ModuleElement
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "   ";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = "  ";
  public static final String TEXT_3 = ";";
  public static final String TEXT_4 = "  ";
  public static final String TEXT_5 = "";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //InvarConstraint Attributes
  private boolean terminated;

  //InvarConstraint Associations
  private InvarExpression invarExpression;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public InvarConstraint(InvarExpression aInvarExpression)
  {
    super();
    terminated = false;
    if (!setInvarExpression(aInvarExpression))
    {
      throw new RuntimeException("Unable to create InvarConstraint due to aInvarExpression. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    // line 598 "../../../../src/NuSMVMetamodel.ump"
    setHeader("INVARSPEC"); setTerminated(false);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTerminated(boolean aTerminated)
  {
    boolean wasSet = false;
    terminated = aTerminated;
    wasSet = true;
    return wasSet;
  }

  public boolean getTerminated()
  {
    return terminated;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isTerminated()
  {
    return terminated;
  }
  /* Code from template association_GetOne */
  public InvarExpression getInvarExpression()
  {
    return invarExpression;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setInvarExpression(InvarExpression aNewInvarExpression)
  {
    boolean wasSet = false;
    if (aNewInvarExpression != null)
    {
      invarExpression = aNewInvarExpression;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    invarExpression = null;
    super.delete();
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _toString(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(getHeader());
    realSb.append(TEXT_1);
    if(terminated){
    realSb.append(TEXT_2);
    realSb.append(invarExpression.toString());
    realSb.append(TEXT_3);
    }
  else{
    realSb.append(TEXT_4);
    realSb.append(invarExpression.toString());
    realSb.append(TEXT_5);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String toString(){
        StringBuilder sb = new StringBuilder();
    return this._toString(0,sb).toString(); 
  }

}