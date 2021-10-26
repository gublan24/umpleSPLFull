/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 450 "../../../../src/NuSMVMetamodel.ump"
public class NextExpression extends BasicExpression
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String TEXT_0 = "next( ";
  public static final String TEXT_1 = " ) =";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //NextExpression Associations
  private BasicExpression basicExpression;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NextExpression(String aIdentifier, BasicExpression aBasicExpression)
  {
    super(aIdentifier);
    if (!setBasicExpression(aBasicExpression))
    {
      throw new RuntimeException("Unable to create NextExpression due to aBasicExpression. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
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
    super.delete();
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _getExpression(Integer numSpaces, StringBuilder sb){
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

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getExpression(){
        StringBuilder sb = new StringBuilder();
    return this._getExpression(0,sb).toString(); 
  }

}