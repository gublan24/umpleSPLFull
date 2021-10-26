/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 218 "../../../../src/NuSMVMetamodel.ump"
public class ModuleBody
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ModuleBody Associations
  private List<ModuleElement> moduleElements;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModuleBody(ModuleElement... allModuleElements)
  {
    moduleElements = new ArrayList<ModuleElement>();
    boolean didAddModuleElements = setModuleElements(allModuleElements);
    if (!didAddModuleElements)
    {
      throw new RuntimeException("Unable to create ModuleBody, must have at least 1 moduleElements. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public ModuleElement getModuleElement(int index)
  {
    ModuleElement aModuleElement = moduleElements.get(index);
    return aModuleElement;
  }

  public List<ModuleElement> getModuleElements()
  {
    List<ModuleElement> newModuleElements = Collections.unmodifiableList(moduleElements);
    return newModuleElements;
  }

  public int numberOfModuleElements()
  {
    int number = moduleElements.size();
    return number;
  }

  public boolean hasModuleElements()
  {
    boolean has = moduleElements.size() > 0;
    return has;
  }

  public int indexOfModuleElement(ModuleElement aModuleElement)
  {
    int index = moduleElements.indexOf(aModuleElement);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfModuleElements()
  {
    return 1;
  }
  /* Code from template association_AddUnidirectionalMStar */
  public boolean addModuleElement(ModuleElement aModuleElement)
  {
    boolean wasAdded = false;
    if (moduleElements.contains(aModuleElement)) { return false; }
    moduleElements.add(aModuleElement);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeModuleElement(ModuleElement aModuleElement)
  {
    boolean wasRemoved = false;
    if (!moduleElements.contains(aModuleElement))
    {
      return wasRemoved;
    }

    if (numberOfModuleElements() <= minimumNumberOfModuleElements())
    {
      return wasRemoved;
    }

    moduleElements.remove(aModuleElement);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_SetUnidirectionalMStar */
  public boolean setModuleElements(ModuleElement... newModuleElements)
  {
    boolean wasSet = false;
    ArrayList<ModuleElement> verifiedModuleElements = new ArrayList<ModuleElement>();
    for (ModuleElement aModuleElement : newModuleElements)
    {
      if (verifiedModuleElements.contains(aModuleElement))
      {
        continue;
      }
      verifiedModuleElements.add(aModuleElement);
    }

    if (verifiedModuleElements.size() != newModuleElements.length || verifiedModuleElements.size() < minimumNumberOfModuleElements())
    {
      return wasSet;
    }

    moduleElements.clear();
    moduleElements.addAll(verifiedModuleElements);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addModuleElementAt(ModuleElement aModuleElement, int index)
  {  
    boolean wasAdded = false;
    if(addModuleElement(aModuleElement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfModuleElements()) { index = numberOfModuleElements() - 1; }
      moduleElements.remove(aModuleElement);
      moduleElements.add(index, aModuleElement);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveModuleElementAt(ModuleElement aModuleElement, int index)
  {
    boolean wasAdded = false;
    if(moduleElements.contains(aModuleElement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfModuleElements()) { index = numberOfModuleElements() - 1; }
      moduleElements.remove(aModuleElement);
      moduleElements.add(index, aModuleElement);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addModuleElementAt(aModuleElement, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    moduleElements.clear();
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
    
    for(ModuleElement me : moduleElements){
    realSb.append(TEXT_0);
    realSb.append(me.toString());
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