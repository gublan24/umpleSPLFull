/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.util.SampleFileWriter;
import java.util.*;

/**
 * integration of all importElements as a model
 */
// line 154 "../../../../src/UmpleImport.ump"
// line 14 "../../../../src/UmpleImport_CodeModels.ump"
public class UmpleImportModel
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleImportModel Attributes
  private String currentPackageName;
  private StringBuilder umpleBuilder;

  //UmpleImportModel Associations
  private List<UmpleImportElement> umpleImportElements;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleImportModel(String aCurrentPackageName)
  {
    currentPackageName = aCurrentPackageName;
    umpleBuilder = new StringBuilder();
    umpleImportElements = new ArrayList<UmpleImportElement>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCurrentPackageName(String aCurrentPackageName)
  {
    boolean wasSet = false;
    currentPackageName = aCurrentPackageName;
    wasSet = true;
    return wasSet;
  }

  public String getCurrentPackageName()
  {
    return currentPackageName;
  }
  /* Code from template association_GetMany */
  public UmpleImportElement getUmpleImportElement(int index)
  {
    UmpleImportElement aUmpleImportElement = umpleImportElements.get(index);
    return aUmpleImportElement;
  }

  public List<UmpleImportElement> getUmpleImportElements()
  {
    List<UmpleImportElement> newUmpleImportElements = Collections.unmodifiableList(umpleImportElements);
    return newUmpleImportElements;
  }

  public int numberOfUmpleImportElements()
  {
    int number = umpleImportElements.size();
    return number;
  }

  public boolean hasUmpleImportElements()
  {
    boolean has = umpleImportElements.size() > 0;
    return has;
  }

  public int indexOfUmpleImportElement(UmpleImportElement aUmpleImportElement)
  {
    int index = umpleImportElements.indexOf(aUmpleImportElement);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmpleImportElements()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addUmpleImportElement(UmpleImportElement aUmpleImportElement)
  {
    boolean wasAdded = false;
    if (umpleImportElements.contains(aUmpleImportElement)) { return false; }
    umpleImportElements.add(aUmpleImportElement);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUmpleImportElement(UmpleImportElement aUmpleImportElement)
  {
    boolean wasRemoved = false;
    if (umpleImportElements.contains(aUmpleImportElement))
    {
      umpleImportElements.remove(aUmpleImportElement);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmpleImportElementAt(UmpleImportElement aUmpleImportElement, int index)
  {  
    boolean wasAdded = false;
    if(addUmpleImportElement(aUmpleImportElement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleImportElements()) { index = numberOfUmpleImportElements() - 1; }
      umpleImportElements.remove(aUmpleImportElement);
      umpleImportElements.add(index, aUmpleImportElement);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmpleImportElementAt(UmpleImportElement aUmpleImportElement, int index)
  {
    boolean wasAdded = false;
    if(umpleImportElements.contains(aUmpleImportElement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleImportElements()) { index = numberOfUmpleImportElements() - 1; }
      umpleImportElements.remove(aUmpleImportElement);
      umpleImportElements.add(index, aUmpleImportElement);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmpleImportElementAt(aUmpleImportElement, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    umpleImportElements.clear();
  }

  // line 19 "../../../../src/UmpleImport_CodeModels.ump"
  public String generateUmple(){
    boolean packageExist = false;
    umpleBuilder = new StringBuilder();
    for (UmpleImportElement umpleImportElement : umpleImportElements) {     
      if(umpleImportElement.getId()!=UmpleImportConstants.ECORE_REFERENCE) {
        // Append 2 new lines if there is more than 1 package
        if("ecore:EPackage".equals(umpleImportElement.getId())) {
          if(packageExist) {
            umpleBuilder.append(System.lineSeparator()+System.lineSeparator());
          } else {
            packageExist = true;
          }
        }
      
        umpleBuilder.append(umpleImportElement.generateUmple());
      }
    }
    return umpleBuilder.toString();
  }


  /**
   * resolve assoications by global lookup
   */
  // line 40 "../../../../src/UmpleImport_CodeModels.ump"
  public UmpleImportAssociation checkIfOppositeExist(UmpleImportAssociation currEnd){
    this.addUmpleImportElement(currEnd);
    UmpleImportAssociation oppoEnd = null;
    for (UmpleImportElement umpleImportElement : umpleImportElements) {
      if(umpleImportElement.getId() == UmpleImportConstants.ECORE_REFERENCE){
        UmpleImportAssociation tempEnd = (UmpleImportAssociation)umpleImportElement;
        String oppoStartClass = tempEnd.getStartClass();
        String oppoEndClass = tempEnd.getEndClass();
        String currStartClass = currEnd.getStartClass();
        String currEndClass = currEnd.getEndClass();
        if(currStartClass.equals(oppoEndClass) && currEndClass.equals(oppoStartClass))
          oppoEnd = tempEnd;
      }
    }
    //update existing association with crrEnd info
    if(oppoEnd!=null)
    {
      for (UmpleImportElement umpleImportElement : umpleImportElements) {
        if(umpleImportElement.getName() == oppoEnd.getStartClass()){
          UmpleImportClass umpleClass = (UmpleImportClass)umpleImportElement;
          umpleClass.removeUmpleImportAssociation(oppoEnd);
          oppoEnd.setOtherLowerBound(currEnd.getLowerBound());
          oppoEnd.setOtherUpperBound(currEnd.getUpperBound());
          umpleClass.addUmpleImportAssociation(oppoEnd);
        }
      }  
    }
    return oppoEnd;
  }

  // line 70 "../../../../src/UmpleImport_CodeModels.ump"
  public boolean generateUmpleFile(String filename){
    String input = this.generateUmple();
    boolean isSuccess = false;
    if (input != null && !input.isEmpty()) {
      SampleFileWriter.createFile(filename, input);
      isSuccess = true;
    }
    return isSuccess;
  }


  public String toString()
  {
    return super.toString() + "["+
            "currentPackageName" + ":" + getCurrentPackageName()+ "]";
  }
}