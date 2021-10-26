/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 138 "../../../../src/UmpleImport.ump"
// line 188 "../../../../src/UmpleImport_CodeModels.ump"
public abstract class ImportStateMachineElement extends UmpleImportElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ImportStateMachineElement Attributes
  private int depth;
  private String elemName;
  private String initialState;
  private String finalState;

  //ImportStateMachineElement Associations
  private List<ImportStateMachineElement> importStateMachineElements;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ImportStateMachineElement(String aId, String aName, int aDepth, String aElemName)
  {
    super(aId, aName);
    depth = aDepth;
    elemName = aElemName;
    initialState = null;
    finalState = null;
    importStateMachineElements = new ArrayList<ImportStateMachineElement>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDepth(int aDepth)
  {
    boolean wasSet = false;
    depth = aDepth;
    wasSet = true;
    return wasSet;
  }

  public boolean setElemName(String aElemName)
  {
    boolean wasSet = false;
    elemName = aElemName;
    wasSet = true;
    return wasSet;
  }

  public boolean setInitialState(String aInitialState)
  {
    boolean wasSet = false;
    initialState = aInitialState;
    wasSet = true;
    return wasSet;
  }

  public boolean setFinalState(String aFinalState)
  {
    boolean wasSet = false;
    finalState = aFinalState;
    wasSet = true;
    return wasSet;
  }

  public int getDepth()
  {
    return depth;
  }

  public String getElemName()
  {
    return elemName;
  }

  public String getInitialState()
  {
    return initialState;
  }

  public String getFinalState()
  {
    return finalState;
  }
  /* Code from template association_GetMany */
  public ImportStateMachineElement getImportStateMachineElement(int index)
  {
    ImportStateMachineElement aImportStateMachineElement = importStateMachineElements.get(index);
    return aImportStateMachineElement;
  }

  public List<ImportStateMachineElement> getImportStateMachineElements()
  {
    List<ImportStateMachineElement> newImportStateMachineElements = Collections.unmodifiableList(importStateMachineElements);
    return newImportStateMachineElements;
  }

  public int numberOfImportStateMachineElements()
  {
    int number = importStateMachineElements.size();
    return number;
  }

  public boolean hasImportStateMachineElements()
  {
    boolean has = importStateMachineElements.size() > 0;
    return has;
  }

  public int indexOfImportStateMachineElement(ImportStateMachineElement aImportStateMachineElement)
  {
    int index = importStateMachineElements.indexOf(aImportStateMachineElement);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfImportStateMachineElements()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addImportStateMachineElement(ImportStateMachineElement aImportStateMachineElement)
  {
    boolean wasAdded = false;
    if (importStateMachineElements.contains(aImportStateMachineElement)) { return false; }
    importStateMachineElements.add(aImportStateMachineElement);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeImportStateMachineElement(ImportStateMachineElement aImportStateMachineElement)
  {
    boolean wasRemoved = false;
    if (importStateMachineElements.contains(aImportStateMachineElement))
    {
      importStateMachineElements.remove(aImportStateMachineElement);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addImportStateMachineElementAt(ImportStateMachineElement aImportStateMachineElement, int index)
  {  
    boolean wasAdded = false;
    if(addImportStateMachineElement(aImportStateMachineElement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfImportStateMachineElements()) { index = numberOfImportStateMachineElements() - 1; }
      importStateMachineElements.remove(aImportStateMachineElement);
      importStateMachineElements.add(index, aImportStateMachineElement);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveImportStateMachineElementAt(ImportStateMachineElement aImportStateMachineElement, int index)
  {
    boolean wasAdded = false;
    if(importStateMachineElements.contains(aImportStateMachineElement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfImportStateMachineElements()) { index = numberOfImportStateMachineElements() - 1; }
      importStateMachineElements.remove(aImportStateMachineElement);
      importStateMachineElements.add(index, aImportStateMachineElement);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addImportStateMachineElementAt(aImportStateMachineElement, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    importStateMachineElements.clear();
    super.delete();
  }

  // line 191 "../../../../src/UmpleImport_CodeModels.ump"
  public String generateUmple(){
    String indent = new String(new char[getDepth()]).replace("\0", "\t");
    StringBuilder umpleBuilder = this.getUmpleBuilder();
    umpleBuilder.append(System.lineSeparator() + indent + this.getElemName() + " {");

    if (initialState != null) {
      Collections.sort(importStateMachineElements, new StateComparator(initialState));
    }

    for (ImportStateMachineElement elem : importStateMachineElements) {
      umpleBuilder.append(elem.generateUmple());
    }

    umpleBuilder.append(System.lineSeparator() + indent + "}"); 

    return umpleBuilder.toString();
  }


  public String toString()
  {
    return super.toString() + "["+
            "depth" + ":" + getDepth()+ "," +
            "elemName" + ":" + getElemName()+ "," +
            "initialState" + ":" + getInitialState()+ "," +
            "finalState" + ":" + getFinalState()+ "]";
  }
}