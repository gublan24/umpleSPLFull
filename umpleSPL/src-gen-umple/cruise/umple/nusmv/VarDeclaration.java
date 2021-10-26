/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 232 "../../../../src/NuSMVMetamodel.ump"
public class VarDeclaration extends ModuleElement
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "   -- This part declares state variables for the given NuSMV module --" + NL;
  public static final String TEXT_1 = "   ";
  public static final String TEXT_2 = "";
  public static final String TEXT_3 = NL + "     ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VarDeclaration Associations
  private List<VariableSpecifier> variableSpecifiers;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public VarDeclaration(VariableSpecifier... allVariableSpecifiers)
  {
    super();
    variableSpecifiers = new ArrayList<VariableSpecifier>();
    boolean didAddVariableSpecifiers = setVariableSpecifiers(allVariableSpecifiers);
    if (!didAddVariableSpecifiers)
    {
      throw new RuntimeException("Unable to create VarDeclaration, must have at least 1 variableSpecifiers. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    // line 235 "../../../../src/NuSMVMetamodel.ump"
    setHeader("VAR");
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public VariableSpecifier getVariableSpecifier(int index)
  {
    VariableSpecifier aVariableSpecifier = variableSpecifiers.get(index);
    return aVariableSpecifier;
  }

  public List<VariableSpecifier> getVariableSpecifiers()
  {
    List<VariableSpecifier> newVariableSpecifiers = Collections.unmodifiableList(variableSpecifiers);
    return newVariableSpecifiers;
  }

  public int numberOfVariableSpecifiers()
  {
    int number = variableSpecifiers.size();
    return number;
  }

  public boolean hasVariableSpecifiers()
  {
    boolean has = variableSpecifiers.size() > 0;
    return has;
  }

  public int indexOfVariableSpecifier(VariableSpecifier aVariableSpecifier)
  {
    int index = variableSpecifiers.indexOf(aVariableSpecifier);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfVariableSpecifiers()
  {
    return 1;
  }
  /* Code from template association_AddUnidirectionalMStar */
  public boolean addVariableSpecifier(VariableSpecifier aVariableSpecifier)
  {
    boolean wasAdded = false;
    if (variableSpecifiers.contains(aVariableSpecifier)) { return false; }
    variableSpecifiers.add(aVariableSpecifier);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeVariableSpecifier(VariableSpecifier aVariableSpecifier)
  {
    boolean wasRemoved = false;
    if (!variableSpecifiers.contains(aVariableSpecifier))
    {
      return wasRemoved;
    }

    if (numberOfVariableSpecifiers() <= minimumNumberOfVariableSpecifiers())
    {
      return wasRemoved;
    }

    variableSpecifiers.remove(aVariableSpecifier);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_SetUnidirectionalMStar */
  public boolean setVariableSpecifiers(VariableSpecifier... newVariableSpecifiers)
  {
    boolean wasSet = false;
    ArrayList<VariableSpecifier> verifiedVariableSpecifiers = new ArrayList<VariableSpecifier>();
    for (VariableSpecifier aVariableSpecifier : newVariableSpecifiers)
    {
      if (verifiedVariableSpecifiers.contains(aVariableSpecifier))
      {
        continue;
      }
      verifiedVariableSpecifiers.add(aVariableSpecifier);
    }

    if (verifiedVariableSpecifiers.size() != newVariableSpecifiers.length || verifiedVariableSpecifiers.size() < minimumNumberOfVariableSpecifiers())
    {
      return wasSet;
    }

    variableSpecifiers.clear();
    variableSpecifiers.addAll(verifiedVariableSpecifiers);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addVariableSpecifierAt(VariableSpecifier aVariableSpecifier, int index)
  {  
    boolean wasAdded = false;
    if(addVariableSpecifier(aVariableSpecifier))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVariableSpecifiers()) { index = numberOfVariableSpecifiers() - 1; }
      variableSpecifiers.remove(aVariableSpecifier);
      variableSpecifiers.add(index, aVariableSpecifier);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveVariableSpecifierAt(VariableSpecifier aVariableSpecifier, int index)
  {
    boolean wasAdded = false;
    if(variableSpecifiers.contains(aVariableSpecifier))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVariableSpecifiers()) { index = numberOfVariableSpecifiers() - 1; }
      variableSpecifiers.remove(aVariableSpecifier);
      variableSpecifiers.add(index, aVariableSpecifier);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addVariableSpecifierAt(aVariableSpecifier, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    variableSpecifiers.clear();
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
    realSb.append(TEXT_1);
    realSb.append(getHeader());
    realSb.append(TEXT_2);
    for(VariableSpecifier vs : variableSpecifiers){
    realSb.append(TEXT_3);
    realSb.append(vs.toString());
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