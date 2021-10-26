/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;

// line 366 "../../../../src/NuSMVMetamodel.ump"
public class CTLSpecification extends ModuleElement
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "   ";
  public static final String TEXT_1 = "  ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CTLSpecification Attributes
  private boolean displayNegation;

  //CTLSpecification Associations
  private CTLExpression cTLExpression;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CTLSpecification(CTLExpression aCTLExpression)
  {
    super();
    displayNegation = false;
    if (!setCTLExpression(aCTLExpression))
    {
      throw new RuntimeException("Unable to create CTLSpecification due to aCTLExpression. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    // line 369 "../../../../src/NuSMVMetamodel.ump"
    setHeader("CTLSPEC");  displayNegation = false;
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDisplayNegation(boolean aDisplayNegation)
  {
    boolean wasSet = false;
    displayNegation = aDisplayNegation;
    wasSet = true;
    return wasSet;
  }

  public boolean getDisplayNegation()
  {
    return displayNegation;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isDisplayNegation()
  {
    return displayNegation;
  }
  /* Code from template association_GetOne */
  public CTLExpression getCTLExpression()
  {
    return cTLExpression;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setCTLExpression(CTLExpression aNewCTLExpression)
  {
    boolean wasSet = false;
    if (aNewCTLExpression != null)
    {
      cTLExpression = aNewCTLExpression;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    cTLExpression = null;
    super.delete();
  }

  // line 373 "../../../../src/NuSMVMetamodel.ump"
   private String printExpression(){
    if( displayNegation )
			return "! " + cTLExpression.toString();
		return cTLExpression.toString();
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
    realSb.append(printExpression());

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