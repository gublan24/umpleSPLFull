/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 549 "../../../../src/NuSMVMetamodel.ump"
public class CaseStatement
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "      ";
  public static final String TEXT_1 = " :";
  public static final String TEXT_2 = ";";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CaseStatement Associations
  private List<BasicExpression> basicExpressions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CaseStatement(BasicExpression... allBasicExpressions)
  {
    basicExpressions = new ArrayList<BasicExpression>();
    boolean didAddBasicExpressions = setBasicExpressions(allBasicExpressions);
    if (!didAddBasicExpressions)
    {
      throw new RuntimeException("Unable to create CaseStatement, must have 2 basicExpressions. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public BasicExpression getBasicExpression(int index)
  {
    BasicExpression aBasicExpression = basicExpressions.get(index);
    return aBasicExpression;
  }

  public List<BasicExpression> getBasicExpressions()
  {
    List<BasicExpression> newBasicExpressions = Collections.unmodifiableList(basicExpressions);
    return newBasicExpressions;
  }

  public int numberOfBasicExpressions()
  {
    int number = basicExpressions.size();
    return number;
  }

  public boolean hasBasicExpressions()
  {
    boolean has = basicExpressions.size() > 0;
    return has;
  }

  public int indexOfBasicExpression(BasicExpression aBasicExpression)
  {
    int index = basicExpressions.indexOf(aBasicExpression);
    return index;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfBasicExpressions()
  {
    return 2;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBasicExpressions()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfBasicExpressions()
  {
    return 2;
  }
  /* Code from template association_SetUnidirectionalN */
  public boolean setBasicExpressions(BasicExpression... newBasicExpressions)
  {
    boolean wasSet = false;
    ArrayList<BasicExpression> verifiedBasicExpressions = new ArrayList<BasicExpression>();
    for (BasicExpression aBasicExpression : newBasicExpressions)
    {
      if (verifiedBasicExpressions.contains(aBasicExpression))
      {
        continue;
      }
      verifiedBasicExpressions.add(aBasicExpression);
    }

    if (verifiedBasicExpressions.size() != newBasicExpressions.length || verifiedBasicExpressions.size() != requiredNumberOfBasicExpressions())
    {
      return wasSet;
    }

    basicExpressions.clear();
    basicExpressions.addAll(verifiedBasicExpressions);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    basicExpressions.clear();
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
    realSb.append(basicExpressions.get(0).toString());
    realSb.append(TEXT_1);
    realSb.append(basicExpressions.get(1).toString());
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