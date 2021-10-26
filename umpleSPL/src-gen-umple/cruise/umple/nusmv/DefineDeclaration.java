/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 280 "../../../../src/NuSMVMetamodel.ump"
public class DefineDeclaration extends ModuleElement
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "   -- This part defines macros that summarize the transitions and guards (if any) of the given NuSMV module --" + NL + "  ";
  public static final String TEXT_1 = " ";
  public static final String TEXT_2 = "";
  public static final String TEXT_3 = "";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DefineDeclaration Associations
  private List<DefineBody> defineBodies;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DefineDeclaration(DefineBody... allDefineBodies)
  {
    super();
    defineBodies = new ArrayList<DefineBody>();
    boolean didAddDefineBodies = setDefineBodies(allDefineBodies);
    if (!didAddDefineBodies)
    {
      throw new RuntimeException("Unable to create DefineDeclaration, must have at least 1 defineBodies. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    // line 283 "../../../../src/NuSMVMetamodel.ump"
    setHeader("DEFINE");
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public DefineBody getDefineBody(int index)
  {
    DefineBody aDefineBody = defineBodies.get(index);
    return aDefineBody;
  }

  public List<DefineBody> getDefineBodies()
  {
    List<DefineBody> newDefineBodies = Collections.unmodifiableList(defineBodies);
    return newDefineBodies;
  }

  public int numberOfDefineBodies()
  {
    int number = defineBodies.size();
    return number;
  }

  public boolean hasDefineBodies()
  {
    boolean has = defineBodies.size() > 0;
    return has;
  }

  public int indexOfDefineBody(DefineBody aDefineBody)
  {
    int index = defineBodies.indexOf(aDefineBody);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDefineBodies()
  {
    return 1;
  }
  /* Code from template association_AddUnidirectionalMStar */
  public boolean addDefineBody(DefineBody aDefineBody)
  {
    boolean wasAdded = false;
    if (defineBodies.contains(aDefineBody)) { return false; }
    defineBodies.add(aDefineBody);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeDefineBody(DefineBody aDefineBody)
  {
    boolean wasRemoved = false;
    if (!defineBodies.contains(aDefineBody))
    {
      return wasRemoved;
    }

    if (numberOfDefineBodies() <= minimumNumberOfDefineBodies())
    {
      return wasRemoved;
    }

    defineBodies.remove(aDefineBody);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_SetUnidirectionalMStar */
  public boolean setDefineBodies(DefineBody... newDefineBodies)
  {
    boolean wasSet = false;
    ArrayList<DefineBody> verifiedDefineBodies = new ArrayList<DefineBody>();
    for (DefineBody aDefineBody : newDefineBodies)
    {
      if (verifiedDefineBodies.contains(aDefineBody))
      {
        continue;
      }
      verifiedDefineBodies.add(aDefineBody);
    }

    if (verifiedDefineBodies.size() != newDefineBodies.length || verifiedDefineBodies.size() < minimumNumberOfDefineBodies())
    {
      return wasSet;
    }

    defineBodies.clear();
    defineBodies.addAll(verifiedDefineBodies);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDefineBodyAt(DefineBody aDefineBody, int index)
  {  
    boolean wasAdded = false;
    if(addDefineBody(aDefineBody))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDefineBodies()) { index = numberOfDefineBodies() - 1; }
      defineBodies.remove(aDefineBody);
      defineBodies.add(index, aDefineBody);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDefineBodyAt(DefineBody aDefineBody, int index)
  {
    boolean wasAdded = false;
    if(defineBodies.contains(aDefineBody))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDefineBodies()) { index = numberOfDefineBodies() - 1; }
      defineBodies.remove(aDefineBody);
      defineBodies.add(index, aDefineBody);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDefineBodyAt(aDefineBody, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    defineBodies.clear();
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
    for(DefineBody db : defineBodies){
    realSb.append(db.toString());
    realSb.append(TEXT_3);
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