/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;

// line 294 "../../../../src/NuSMVMetamodel.ump"
public class DefineBody
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "     ";
  public static final String TEXT_1 = " :=";
  public static final String TEXT_2 = ";";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DefineBody Attributes
  private String identifier;

  //DefineBody Associations
  private BasicExpression basicExpression;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DefineBody(String aIdentifier, BasicExpression aBasicExpression)
  {
    identifier = aIdentifier;
    if (!setBasicExpression(aBasicExpression))
    {
      throw new RuntimeException("Unable to create DefineBody due to aBasicExpression. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIdentifier(String aIdentifier)
  {
    boolean wasSet = false;
    identifier = aIdentifier;
    wasSet = true;
    return wasSet;
  }

  public String getIdentifier()
  {
    return identifier;
  }
  /* Code from template association_GetOne */
  public BasicExpression getBasicExpression()
  {
    return basicExpression;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setBasicExpression(BasicExpression aNewBasicExpression)
  {
    boolean wasSet = false;
    if (aNewBasicExpression != null)
    {
      basicExpression = aNewBasicExpression;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    basicExpression = null;
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
    realSb.append(getIdentifier());
    realSb.append(TEXT_1);
    realSb.append(basicExpression.toString());
    realSb.append(TEXT_2);

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