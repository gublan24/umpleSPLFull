/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import cruise.umple.parser.Position;

/**
 * 
 * The contents of a method, such as the code within it.
 */
// line 89 "../../../../src/Mixset.ump"
// line 183 "../../../../src/Umple_CodeMethod.ump"
// line 75 "../../../../src/Aspect_refactored.ump"
// line 221 "../../../../src/Umple.ump"
public class MethodBody
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MethodBody Attributes
  private CodeBlock codeblock;
  private Map<String,Position> implementationPositions;

  //MethodBody Associations
  private List<MixsetInMethod> mixsetInMethods;
  private List<UmpleAssertion> umpleAssertions;
  private List<UmpleTestCase> umpleTestCases;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MethodBody(CodeBlock aCodeblock)
  {
    codeblock = aCodeblock;
    implementationPositions = new HashMap<String,Position>();
    mixsetInMethods = new ArrayList<MixsetInMethod>();
    umpleAssertions = new ArrayList<UmpleAssertion>();
    umpleTestCases = new ArrayList<UmpleTestCase>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCodeblock(CodeBlock aCodeblock)
  {
    boolean wasSet = false;
    codeblock = aCodeblock;
    wasSet = true;
    return wasSet;
  }

  public boolean setImplementationPositions(Map<String,Position> aImplementationPositions)
  {
    boolean wasSet = false;
    implementationPositions = aImplementationPositions;
    wasSet = true;
    return wasSet;
  }

  /**
   * The code within the method body.
   */

  public String getExtraCode()
  {
    return codeblock.getCode() != null ? codeblock.getCode() : "";
  }

  public CodeBlock getCodeblock()
  {
    return codeblock;
  }

  public Map<String,Position> getImplementationPositions()
  {
    return implementationPositions;
  }
  /* Code from template association_GetMany */
  public MixsetInMethod getMixsetInMethod(int index)
  {
    MixsetInMethod aMixsetInMethod = mixsetInMethods.get(index);
    return aMixsetInMethod;
  }

  public List<MixsetInMethod> getMixsetInMethods()
  {
    List<MixsetInMethod> newMixsetInMethods = Collections.unmodifiableList(mixsetInMethods);
    return newMixsetInMethods;
  }

  public int numberOfMixsetInMethods()
  {
    int number = mixsetInMethods.size();
    return number;
  }

  public boolean hasMixsetInMethods()
  {
    boolean has = mixsetInMethods.size() > 0;
    return has;
  }

  public int indexOfMixsetInMethod(MixsetInMethod aMixsetInMethod)
  {
    int index = mixsetInMethods.indexOf(aMixsetInMethod);
    return index;
  }
  /* Code from template association_GetMany */
  public UmpleAssertion getUmpleAssertion(int index)
  {
    UmpleAssertion aUmpleAssertion = umpleAssertions.get(index);
    return aUmpleAssertion;
  }

  /**
   * the method assertions
   */
  public List<UmpleAssertion> getUmpleAssertions()
  {
    List<UmpleAssertion> newUmpleAssertions = Collections.unmodifiableList(umpleAssertions);
    return newUmpleAssertions;
  }

  public int numberOfUmpleAssertions()
  {
    int number = umpleAssertions.size();
    return number;
  }

  public boolean hasUmpleAssertions()
  {
    boolean has = umpleAssertions.size() > 0;
    return has;
  }

  public int indexOfUmpleAssertion(UmpleAssertion aUmpleAssertion)
  {
    int index = umpleAssertions.indexOf(aUmpleAssertion);
    return index;
  }
  /* Code from template association_GetMany */
  public UmpleTestCase getUmpleTestCase(int index)
  {
    UmpleTestCase aUmpleTestCase = umpleTestCases.get(index);
    return aUmpleTestCase;
  }

  public List<UmpleTestCase> getUmpleTestCases()
  {
    List<UmpleTestCase> newUmpleTestCases = Collections.unmodifiableList(umpleTestCases);
    return newUmpleTestCases;
  }

  public int numberOfUmpleTestCases()
  {
    int number = umpleTestCases.size();
    return number;
  }

  public boolean hasUmpleTestCases()
  {
    boolean has = umpleTestCases.size() > 0;
    return has;
  }

  public int indexOfUmpleTestCase(UmpleTestCase aUmpleTestCase)
  {
    int index = umpleTestCases.indexOf(aUmpleTestCase);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMixsetInMethods()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addMixsetInMethod(MixsetInMethod aMixsetInMethod)
  {
    boolean wasAdded = false;
    if (mixsetInMethods.contains(aMixsetInMethod)) { return false; }
    MethodBody existingMethodBody = aMixsetInMethod.getMethodBody();
    if (existingMethodBody == null)
    {
      aMixsetInMethod.setMethodBody(this);
    }
    else if (!this.equals(existingMethodBody))
    {
      existingMethodBody.removeMixsetInMethod(aMixsetInMethod);
      addMixsetInMethod(aMixsetInMethod);
    }
    else
    {
      mixsetInMethods.add(aMixsetInMethod);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMixsetInMethod(MixsetInMethod aMixsetInMethod)
  {
    boolean wasRemoved = false;
    if (mixsetInMethods.contains(aMixsetInMethod))
    {
      mixsetInMethods.remove(aMixsetInMethod);
      aMixsetInMethod.setMethodBody(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMixsetInMethodAt(MixsetInMethod aMixsetInMethod, int index)
  {  
    boolean wasAdded = false;
    if(addMixsetInMethod(aMixsetInMethod))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMixsetInMethods()) { index = numberOfMixsetInMethods() - 1; }
      mixsetInMethods.remove(aMixsetInMethod);
      mixsetInMethods.add(index, aMixsetInMethod);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMixsetInMethodAt(MixsetInMethod aMixsetInMethod, int index)
  {
    boolean wasAdded = false;
    if(mixsetInMethods.contains(aMixsetInMethod))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMixsetInMethods()) { index = numberOfMixsetInMethods() - 1; }
      mixsetInMethods.remove(aMixsetInMethod);
      mixsetInMethods.add(index, aMixsetInMethod);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMixsetInMethodAt(aMixsetInMethod, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmpleAssertions()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addUmpleAssertion(UmpleAssertion aUmpleAssertion)
  {
    boolean wasAdded = false;
    if (umpleAssertions.contains(aUmpleAssertion)) { return false; }
    umpleAssertions.add(aUmpleAssertion);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUmpleAssertion(UmpleAssertion aUmpleAssertion)
  {
    boolean wasRemoved = false;
    if (umpleAssertions.contains(aUmpleAssertion))
    {
      umpleAssertions.remove(aUmpleAssertion);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmpleAssertionAt(UmpleAssertion aUmpleAssertion, int index)
  {  
    boolean wasAdded = false;
    if(addUmpleAssertion(aUmpleAssertion))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleAssertions()) { index = numberOfUmpleAssertions() - 1; }
      umpleAssertions.remove(aUmpleAssertion);
      umpleAssertions.add(index, aUmpleAssertion);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmpleAssertionAt(UmpleAssertion aUmpleAssertion, int index)
  {
    boolean wasAdded = false;
    if(umpleAssertions.contains(aUmpleAssertion))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleAssertions()) { index = numberOfUmpleAssertions() - 1; }
      umpleAssertions.remove(aUmpleAssertion);
      umpleAssertions.add(index, aUmpleAssertion);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmpleAssertionAt(aUmpleAssertion, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmpleTestCases()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addUmpleTestCase(UmpleTestCase aUmpleTestCase)
  {
    boolean wasAdded = false;
    if (umpleTestCases.contains(aUmpleTestCase)) { return false; }
    MethodBody existingMethodBody = aUmpleTestCase.getMethodBody();
    if (existingMethodBody == null)
    {
      aUmpleTestCase.setMethodBody(this);
    }
    else if (!this.equals(existingMethodBody))
    {
      existingMethodBody.removeUmpleTestCase(aUmpleTestCase);
      addUmpleTestCase(aUmpleTestCase);
    }
    else
    {
      umpleTestCases.add(aUmpleTestCase);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUmpleTestCase(UmpleTestCase aUmpleTestCase)
  {
    boolean wasRemoved = false;
    if (umpleTestCases.contains(aUmpleTestCase))
    {
      umpleTestCases.remove(aUmpleTestCase);
      aUmpleTestCase.setMethodBody(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmpleTestCaseAt(UmpleTestCase aUmpleTestCase, int index)
  {  
    boolean wasAdded = false;
    if(addUmpleTestCase(aUmpleTestCase))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleTestCases()) { index = numberOfUmpleTestCases() - 1; }
      umpleTestCases.remove(aUmpleTestCase);
      umpleTestCases.add(index, aUmpleTestCase);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmpleTestCaseAt(UmpleTestCase aUmpleTestCase, int index)
  {
    boolean wasAdded = false;
    if(umpleTestCases.contains(aUmpleTestCase))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleTestCases()) { index = numberOfUmpleTestCases() - 1; }
      umpleTestCases.remove(aUmpleTestCase);
      umpleTestCases.add(index, aUmpleTestCase);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmpleTestCaseAt(aUmpleTestCase, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !mixsetInMethods.isEmpty() )
    {
      mixsetInMethods.get(0).setMethodBody(null);
    }
    umpleAssertions.clear();
    while( !umpleTestCases.isEmpty() )
    {
      umpleTestCases.get(0).setMethodBody(null);
    }
  }

  // line 186 "../../../../src/Umple_CodeMethod.ump"
   public  MethodBody(MethodBody another){
    codeblock = new CodeBlock(another.getCodeblock());
  }

  // line 190 "../../../../src/Umple_CodeMethod.ump"
   public  MethodBody(String aValue){
    this(new CodeBlock(aValue!=null ? aValue : ""));
  }

  // line 194 "../../../../src/Umple_CodeMethod.ump"
   public String getExtraCode(String lang){
    return codeblock.getCode(lang);
  }

  // line 198 "../../../../src/Umple_CodeMethod.ump"
   public void setExtraCode(String lang, String code){
    codeblock.setCode(lang,code);
  }

  // line 81 "../../../../src/Aspect_refactored.ump"
   public static  int indexOfMixsetClosingBracket(String strInput){
    int closeIndex = 0;
    int numOfclosingBracket=0;
    for(int i = 0; i< strInput.length();i++)
    {
      char currentChar = strInput.charAt(i);
      if(currentChar =='{')
      numOfclosingBracket++;
      else if(currentChar == '}')
        {
          numOfclosingBracket--;
          if(numOfclosingBracket==0)
            {
              closeIndex = i+1;
              break;
            }
        }	
    }
    return closeIndex;
  }

  // line 101 "../../../../src/Aspect_refactored.ump"
   public ArrayList<MixsetInMethod> getMixsetsWithinMethod(){
    return getMixsetsFromCode(this.getCodeblock().getCode());
  }

  // line 104 "../../../../src/Aspect_refactored.ump"
   public static  ArrayList<MixsetInMethod> getMixsetsFromCode(String codeToLockAt){
    ArrayList<MixsetInMethod> mixsetInsideMethodList = new ArrayList<MixsetInMethod>();
    Pattern labelPatternToMatch = Pattern.compile("mixset\\s+\\S+\\s+\\{"); // to detect mixset def.
    Matcher matcher = labelPatternToMatch.matcher(codeToLockAt);
    while (matcher.find()) {
      String mixsetDefPlusAfterCode = codeToLockAt.substring(matcher.start());
      // mixset def. + the code after the mixset def.
      int indexOfMixsetClosingBracket = matcher.start() + indexOfMixsetClosingBracket(mixsetDefPlusAfterCode);
      String mixsetBodyWithDef = codeToLockAt.substring(matcher.start(),indexOfMixsetClosingBracket);
      // get the name of the mixset
      String mixsetName = matcher.group().replace("mixset", "").replace("{", "").trim(); 
      MixsetInMethod mixsetInsideMethod = new MixsetInMethod(mixsetName,matcher.start(),indexOfMixsetClosingBracket,mixsetBodyWithDef);
      
      // place inner method in their right position.
      for(MixsetInMethod tempMixsetInMethod:mixsetInsideMethodList)
      {
        if(mixsetInsideMethod.getStartPositionIndex() > tempMixsetInMethod.getStartPositionIndex()
            & mixsetInsideMethod.getEndPositionIndex() < tempMixsetInMethod.getEndPositionIndex())
        { 
          // a nested mixset should be bounded by its close parent mixset 
          mixsetInsideMethod.setParentInnerMixset(tempMixsetInMethod);
          tempMixsetInMethod.addChildMixset(mixsetInsideMethod);
        }
      }
      // a nested mixset should not add here. 
      if(mixsetInsideMethod.getParentInnerMixset() == null) // its not bounded by another mixset 
      {
        mixsetInsideMethodList.add(mixsetInsideMethod);
      }
    }
    return mixsetInsideMethodList;
  }


  public String toString()
  {
    return super.toString() + "["+
            "extraCode" + ":" + getExtraCode()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "codeblock" + "=" + (getCodeblock() != null ? !getCodeblock().equals(this)  ? getCodeblock().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "implementationPositions" + "=" + (getImplementationPositions() != null ? !getImplementationPositions().equals(this)  ? getImplementationPositions().toString().replaceAll("  ","    ") : "this" : "null");
  }
}