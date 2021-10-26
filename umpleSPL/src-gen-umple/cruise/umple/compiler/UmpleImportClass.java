/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 168 "../../../../src/UmpleImport.ump"
// line 89 "../../../../src/UmpleImport_CodeModels.ump"
public class UmpleImportClass extends UmpleImportElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleImportClass Attributes
  private String packageName;
  private boolean isAbstract;
  private boolean isInterface;
  private List<String> superTypes;

  //UmpleImportClass Associations
  private List<UmpleImportAttribute> umpleImportAttributes;
  private List<UmpleImportAssociation> umpleImportAssociations;
  private List<ImportStateMachine> importStateMachines;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleImportClass(String aId, String aName, String aPackageName, boolean aIsAbstract, boolean aIsInterface)
  {
    super(aId, aName);
    packageName = aPackageName;
    isAbstract = aIsAbstract;
    isInterface = aIsInterface;
    superTypes = new ArrayList<String>();
    umpleImportAttributes = new ArrayList<UmpleImportAttribute>();
    umpleImportAssociations = new ArrayList<UmpleImportAssociation>();
    importStateMachines = new ArrayList<ImportStateMachine>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPackageName(String aPackageName)
  {
    boolean wasSet = false;
    packageName = aPackageName;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsAbstract(boolean aIsAbstract)
  {
    boolean wasSet = false;
    isAbstract = aIsAbstract;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInterface(boolean aIsInterface)
  {
    boolean wasSet = false;
    isInterface = aIsInterface;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addSuperType(String aSuperType)
  {
    boolean wasAdded = false;
    wasAdded = superTypes.add(aSuperType);
    return wasAdded;
  }

  public boolean removeSuperType(String aSuperType)
  {
    boolean wasRemoved = false;
    wasRemoved = superTypes.remove(aSuperType);
    return wasRemoved;
  }

  public String getPackageName()
  {
    return packageName;
  }

  public boolean getIsAbstract()
  {
    return isAbstract;
  }

  public boolean getIsInterface()
  {
    return isInterface;
  }
  /* Code from template attribute_GetMany */
  public String getSuperType(int index)
  {
    String aSuperType = superTypes.get(index);
    return aSuperType;
  }

  public String[] getSuperTypes()
  {
    String[] newSuperTypes = superTypes.toArray(new String[superTypes.size()]);
    return newSuperTypes;
  }

  public int numberOfSuperTypes()
  {
    int number = superTypes.size();
    return number;
  }

  public boolean hasSuperTypes()
  {
    boolean has = superTypes.size() > 0;
    return has;
  }

  public int indexOfSuperType(String aSuperType)
  {
    int index = superTypes.indexOf(aSuperType);
    return index;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsAbstract()
  {
    return isAbstract;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInterface()
  {
    return isInterface;
  }
  /* Code from template association_GetMany */
  public UmpleImportAttribute getUmpleImportAttribute(int index)
  {
    UmpleImportAttribute aUmpleImportAttribute = umpleImportAttributes.get(index);
    return aUmpleImportAttribute;
  }

  public List<UmpleImportAttribute> getUmpleImportAttributes()
  {
    List<UmpleImportAttribute> newUmpleImportAttributes = Collections.unmodifiableList(umpleImportAttributes);
    return newUmpleImportAttributes;
  }

  public int numberOfUmpleImportAttributes()
  {
    int number = umpleImportAttributes.size();
    return number;
  }

  public boolean hasUmpleImportAttributes()
  {
    boolean has = umpleImportAttributes.size() > 0;
    return has;
  }

  public int indexOfUmpleImportAttribute(UmpleImportAttribute aUmpleImportAttribute)
  {
    int index = umpleImportAttributes.indexOf(aUmpleImportAttribute);
    return index;
  }
  /* Code from template association_GetMany */
  public UmpleImportAssociation getUmpleImportAssociation(int index)
  {
    UmpleImportAssociation aUmpleImportAssociation = umpleImportAssociations.get(index);
    return aUmpleImportAssociation;
  }

  public List<UmpleImportAssociation> getUmpleImportAssociations()
  {
    List<UmpleImportAssociation> newUmpleImportAssociations = Collections.unmodifiableList(umpleImportAssociations);
    return newUmpleImportAssociations;
  }

  public int numberOfUmpleImportAssociations()
  {
    int number = umpleImportAssociations.size();
    return number;
  }

  public boolean hasUmpleImportAssociations()
  {
    boolean has = umpleImportAssociations.size() > 0;
    return has;
  }

  public int indexOfUmpleImportAssociation(UmpleImportAssociation aUmpleImportAssociation)
  {
    int index = umpleImportAssociations.indexOf(aUmpleImportAssociation);
    return index;
  }
  /* Code from template association_GetMany */
  public ImportStateMachine getImportStateMachine(int index)
  {
    ImportStateMachine aImportStateMachine = importStateMachines.get(index);
    return aImportStateMachine;
  }

  public List<ImportStateMachine> getImportStateMachines()
  {
    List<ImportStateMachine> newImportStateMachines = Collections.unmodifiableList(importStateMachines);
    return newImportStateMachines;
  }

  public int numberOfImportStateMachines()
  {
    int number = importStateMachines.size();
    return number;
  }

  public boolean hasImportStateMachines()
  {
    boolean has = importStateMachines.size() > 0;
    return has;
  }

  public int indexOfImportStateMachine(ImportStateMachine aImportStateMachine)
  {
    int index = importStateMachines.indexOf(aImportStateMachine);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmpleImportAttributes()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addUmpleImportAttribute(UmpleImportAttribute aUmpleImportAttribute)
  {
    boolean wasAdded = false;
    if (umpleImportAttributes.contains(aUmpleImportAttribute)) { return false; }
    umpleImportAttributes.add(aUmpleImportAttribute);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUmpleImportAttribute(UmpleImportAttribute aUmpleImportAttribute)
  {
    boolean wasRemoved = false;
    if (umpleImportAttributes.contains(aUmpleImportAttribute))
    {
      umpleImportAttributes.remove(aUmpleImportAttribute);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmpleImportAttributeAt(UmpleImportAttribute aUmpleImportAttribute, int index)
  {  
    boolean wasAdded = false;
    if(addUmpleImportAttribute(aUmpleImportAttribute))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleImportAttributes()) { index = numberOfUmpleImportAttributes() - 1; }
      umpleImportAttributes.remove(aUmpleImportAttribute);
      umpleImportAttributes.add(index, aUmpleImportAttribute);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmpleImportAttributeAt(UmpleImportAttribute aUmpleImportAttribute, int index)
  {
    boolean wasAdded = false;
    if(umpleImportAttributes.contains(aUmpleImportAttribute))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleImportAttributes()) { index = numberOfUmpleImportAttributes() - 1; }
      umpleImportAttributes.remove(aUmpleImportAttribute);
      umpleImportAttributes.add(index, aUmpleImportAttribute);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmpleImportAttributeAt(aUmpleImportAttribute, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmpleImportAssociations()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addUmpleImportAssociation(UmpleImportAssociation aUmpleImportAssociation)
  {
    boolean wasAdded = false;
    if (umpleImportAssociations.contains(aUmpleImportAssociation)) { return false; }
    umpleImportAssociations.add(aUmpleImportAssociation);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUmpleImportAssociation(UmpleImportAssociation aUmpleImportAssociation)
  {
    boolean wasRemoved = false;
    if (umpleImportAssociations.contains(aUmpleImportAssociation))
    {
      umpleImportAssociations.remove(aUmpleImportAssociation);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmpleImportAssociationAt(UmpleImportAssociation aUmpleImportAssociation, int index)
  {  
    boolean wasAdded = false;
    if(addUmpleImportAssociation(aUmpleImportAssociation))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleImportAssociations()) { index = numberOfUmpleImportAssociations() - 1; }
      umpleImportAssociations.remove(aUmpleImportAssociation);
      umpleImportAssociations.add(index, aUmpleImportAssociation);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmpleImportAssociationAt(UmpleImportAssociation aUmpleImportAssociation, int index)
  {
    boolean wasAdded = false;
    if(umpleImportAssociations.contains(aUmpleImportAssociation))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleImportAssociations()) { index = numberOfUmpleImportAssociations() - 1; }
      umpleImportAssociations.remove(aUmpleImportAssociation);
      umpleImportAssociations.add(index, aUmpleImportAssociation);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmpleImportAssociationAt(aUmpleImportAssociation, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfImportStateMachines()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addImportStateMachine(ImportStateMachine aImportStateMachine)
  {
    boolean wasAdded = false;
    if (importStateMachines.contains(aImportStateMachine)) { return false; }
    importStateMachines.add(aImportStateMachine);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeImportStateMachine(ImportStateMachine aImportStateMachine)
  {
    boolean wasRemoved = false;
    if (importStateMachines.contains(aImportStateMachine))
    {
      importStateMachines.remove(aImportStateMachine);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addImportStateMachineAt(ImportStateMachine aImportStateMachine, int index)
  {  
    boolean wasAdded = false;
    if(addImportStateMachine(aImportStateMachine))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfImportStateMachines()) { index = numberOfImportStateMachines() - 1; }
      importStateMachines.remove(aImportStateMachine);
      importStateMachines.add(index, aImportStateMachine);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveImportStateMachineAt(ImportStateMachine aImportStateMachine, int index)
  {
    boolean wasAdded = false;
    if(importStateMachines.contains(aImportStateMachine))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfImportStateMachines()) { index = numberOfImportStateMachines() - 1; }
      importStateMachines.remove(aImportStateMachine);
      importStateMachines.add(index, aImportStateMachine);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addImportStateMachineAt(aImportStateMachine, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    umpleImportAttributes.clear();
    umpleImportAssociations.clear();
    importStateMachines.clear();
    super.delete();
  }

  // line 92 "../../../../src/UmpleImport_CodeModels.ump"
  public String generateUmple(){
    StringBuilder umpleBuilder = this.getUmpleBuilder();
    umpleBuilder.append(System.lineSeparator()+System.lineSeparator());
    if(isInterface){
      umpleBuilder.append("interface "+this.getName() +System.lineSeparator()+"{");
    }else{
      umpleBuilder.append("class "+ this.getName() +System.lineSeparator()+"{");
      if(superTypes.size()!=0){
        for (String superType : superTypes) {
            if(!superType.isEmpty())
            umpleBuilder.append(System.lineSeparator()+"\tisA "+ superType+";");
        }
      }
    }
    for (UmpleImportAttribute umpleImportAttribute : umpleImportAttributes) {
      umpleBuilder.append(umpleImportAttribute.generateUmple());
    }
    //inline associations
    for (UmpleImportAssociation association : umpleImportAssociations) {
      umpleBuilder.append(association.generateUmple());
    }
    for (ImportStateMachine stateMachine : importStateMachines) {
      umpleBuilder.append(stateMachine.generateUmple());
    }
    umpleBuilder.append(System.lineSeparator()+"}");
    return umpleBuilder.toString();
  }


  public String toString()
  {
    return super.toString() + "["+
            "packageName" + ":" + getPackageName()+ "," +
            "isAbstract" + ":" + getIsAbstract()+ "," +
            "isInterface" + ":" + getIsInterface()+ "]";
  }
}