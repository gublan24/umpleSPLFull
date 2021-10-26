/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 538 "../../../../src/NuSMVMetamodel.ump"
public class CaseExpression extends BasicExpression
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String TEXT_0 = " case";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = NL + "     esac";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CaseExpression Associations
  private List<CaseStatement> caseStatements;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CaseExpression(String aIdentifier, CaseStatement... allCaseStatements)
  {
    super(aIdentifier);
    caseStatements = new ArrayList<CaseStatement>();
    boolean didAddCaseStatements = setCaseStatements(allCaseStatements);
    if (!didAddCaseStatements)
    {
      throw new RuntimeException("Unable to create CaseExpression, must have at least 1 caseStatements. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public CaseStatement getCaseStatement(int index)
  {
    CaseStatement aCaseStatement = caseStatements.get(index);
    return aCaseStatement;
  }

  public List<CaseStatement> getCaseStatements()
  {
    List<CaseStatement> newCaseStatements = Collections.unmodifiableList(caseStatements);
    return newCaseStatements;
  }

  public int numberOfCaseStatements()
  {
    int number = caseStatements.size();
    return number;
  }

  public boolean hasCaseStatements()
  {
    boolean has = caseStatements.size() > 0;
    return has;
  }

  public int indexOfCaseStatement(CaseStatement aCaseStatement)
  {
    int index = caseStatements.indexOf(aCaseStatement);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCaseStatements()
  {
    return 1;
  }
  /* Code from template association_AddUnidirectionalMStar */
  public boolean addCaseStatement(CaseStatement aCaseStatement)
  {
    boolean wasAdded = false;
    if (caseStatements.contains(aCaseStatement)) { return false; }
    caseStatements.add(aCaseStatement);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCaseStatement(CaseStatement aCaseStatement)
  {
    boolean wasRemoved = false;
    if (!caseStatements.contains(aCaseStatement))
    {
      return wasRemoved;
    }

    if (numberOfCaseStatements() <= minimumNumberOfCaseStatements())
    {
      return wasRemoved;
    }

    caseStatements.remove(aCaseStatement);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_SetUnidirectionalMStar */
  public boolean setCaseStatements(CaseStatement... newCaseStatements)
  {
    boolean wasSet = false;
    ArrayList<CaseStatement> verifiedCaseStatements = new ArrayList<CaseStatement>();
    for (CaseStatement aCaseStatement : newCaseStatements)
    {
      if (verifiedCaseStatements.contains(aCaseStatement))
      {
        continue;
      }
      verifiedCaseStatements.add(aCaseStatement);
    }

    if (verifiedCaseStatements.size() != newCaseStatements.length || verifiedCaseStatements.size() < minimumNumberOfCaseStatements())
    {
      return wasSet;
    }

    caseStatements.clear();
    caseStatements.addAll(verifiedCaseStatements);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCaseStatementAt(CaseStatement aCaseStatement, int index)
  {  
    boolean wasAdded = false;
    if(addCaseStatement(aCaseStatement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCaseStatements()) { index = numberOfCaseStatements() - 1; }
      caseStatements.remove(aCaseStatement);
      caseStatements.add(index, aCaseStatement);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCaseStatementAt(CaseStatement aCaseStatement, int index)
  {
    boolean wasAdded = false;
    if(caseStatements.contains(aCaseStatement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCaseStatements()) { index = numberOfCaseStatements() - 1; }
      caseStatements.remove(aCaseStatement);
      caseStatements.add(index, aCaseStatement);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCaseStatementAt(aCaseStatement, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    caseStatements.clear();
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
    for(CaseStatement stmt : caseStatements){
    realSb.append(stmt.toString());
    realSb.append(TEXT_1);
    }
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