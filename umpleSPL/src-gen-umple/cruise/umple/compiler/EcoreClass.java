/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.regex.Pattern;
import java.util.*;

// line 262 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreClass extends EcoreGenericNode
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String TEXT_0 = "#//";
  public static final String TEXT_1 = " ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreClass Attributes
  private boolean isAbstract;
  private boolean isInterface;
  private List<String> superTypes;

  //EcoreClass Associations
  private List<EcoreAttribute> attributes;
  private List<EcoreReference> references;
  private List<EcoreEnum> enums;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreClass(String aName, int aIntent)
  {
    super(aName, aIntent);
    // line 273 "../../../../src/Generator_CodeEcore_Model.ump"
    setTagName("eClassifiers");
    // END OF UMPLE BEFORE INJECTION
    resetIsAbstract();
    resetIsInterface();
    superTypes = new ArrayList<String>();
    attributes = new ArrayList<EcoreAttribute>();
    references = new ArrayList<EcoreReference>();
    enums = new ArrayList<EcoreEnum>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetDefaulted */
  public boolean setIsAbstract(boolean aIsAbstract)
  {
    boolean wasSet = false;
    isAbstract = aIsAbstract;
    wasSet = true;
    return wasSet;
  }

  public boolean resetIsAbstract()
  {
    boolean wasReset = false;
    isAbstract = getDefaultIsAbstract();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setIsInterface(boolean aIsInterface)
  {
    boolean wasSet = false;
    isInterface = aIsInterface;
    wasSet = true;
    return wasSet;
  }

  public boolean resetIsInterface()
  {
    boolean wasReset = false;
    isInterface = getDefaultIsInterface();
    wasReset = true;
    return wasReset;
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

  public boolean getIsAbstract()
  {
    return isAbstract;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultIsAbstract()
  {
    return false;
  }

  public boolean getIsInterface()
  {
    return isInterface;
  }
  /* Code from template attribute_GetDefaulted */
  public boolean getDefaultIsInterface()
  {
    return false;
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
  public EcoreAttribute getAttribute(int index)
  {
    EcoreAttribute aAttribute = attributes.get(index);
    return aAttribute;
  }

  public List<EcoreAttribute> getAttributes()
  {
    List<EcoreAttribute> newAttributes = Collections.unmodifiableList(attributes);
    return newAttributes;
  }

  public int numberOfAttributes()
  {
    int number = attributes.size();
    return number;
  }

  public boolean hasAttributes()
  {
    boolean has = attributes.size() > 0;
    return has;
  }

  public int indexOfAttribute(EcoreAttribute aAttribute)
  {
    int index = attributes.indexOf(aAttribute);
    return index;
  }
  /* Code from template association_GetMany */
  public EcoreReference getReference(int index)
  {
    EcoreReference aReference = references.get(index);
    return aReference;
  }

  public List<EcoreReference> getReferences()
  {
    List<EcoreReference> newReferences = Collections.unmodifiableList(references);
    return newReferences;
  }

  public int numberOfReferences()
  {
    int number = references.size();
    return number;
  }

  public boolean hasReferences()
  {
    boolean has = references.size() > 0;
    return has;
  }

  public int indexOfReference(EcoreReference aReference)
  {
    int index = references.indexOf(aReference);
    return index;
  }
  /* Code from template association_GetMany */
  public EcoreEnum getEnum(int index)
  {
    EcoreEnum aEnum = enums.get(index);
    return aEnum;
  }

  public List<EcoreEnum> getEnums()
  {
    List<EcoreEnum> newEnums = Collections.unmodifiableList(enums);
    return newEnums;
  }

  public int numberOfEnums()
  {
    int number = enums.size();
    return number;
  }

  public boolean hasEnums()
  {
    boolean has = enums.size() > 0;
    return has;
  }

  public int indexOfEnum(EcoreEnum aEnum)
  {
    int index = enums.indexOf(aEnum);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAttributes()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addAttribute(EcoreAttribute aAttribute)
  {
    boolean wasAdded = false;
    if (attributes.contains(aAttribute)) { return false; }
    attributes.add(aAttribute);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAttribute(EcoreAttribute aAttribute)
  {
    boolean wasRemoved = false;
    if (attributes.contains(aAttribute))
    {
      attributes.remove(aAttribute);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAttributeAt(EcoreAttribute aAttribute, int index)
  {  
    boolean wasAdded = false;
    if(addAttribute(aAttribute))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAttributes()) { index = numberOfAttributes() - 1; }
      attributes.remove(aAttribute);
      attributes.add(index, aAttribute);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAttributeAt(EcoreAttribute aAttribute, int index)
  {
    boolean wasAdded = false;
    if(attributes.contains(aAttribute))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAttributes()) { index = numberOfAttributes() - 1; }
      attributes.remove(aAttribute);
      attributes.add(index, aAttribute);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAttributeAt(aAttribute, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfReferences()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addReference(EcoreReference aReference)
  {
    boolean wasAdded = false;
    if (references.contains(aReference)) { return false; }
    references.add(aReference);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeReference(EcoreReference aReference)
  {
    boolean wasRemoved = false;
    if (references.contains(aReference))
    {
      references.remove(aReference);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addReferenceAt(EcoreReference aReference, int index)
  {  
    boolean wasAdded = false;
    if(addReference(aReference))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfReferences()) { index = numberOfReferences() - 1; }
      references.remove(aReference);
      references.add(index, aReference);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveReferenceAt(EcoreReference aReference, int index)
  {
    boolean wasAdded = false;
    if(references.contains(aReference))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfReferences()) { index = numberOfReferences() - 1; }
      references.remove(aReference);
      references.add(index, aReference);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addReferenceAt(aReference, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEnums()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addEnum(EcoreEnum aEnum)
  {
    boolean wasAdded = false;
    if (enums.contains(aEnum)) { return false; }
    enums.add(aEnum);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEnum(EcoreEnum aEnum)
  {
    boolean wasRemoved = false;
    if (enums.contains(aEnum))
    {
      enums.remove(aEnum);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEnumAt(EcoreEnum aEnum, int index)
  {  
    boolean wasAdded = false;
    if(addEnum(aEnum))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEnums()) { index = numberOfEnums() - 1; }
      enums.remove(aEnum);
      enums.add(index, aEnum);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEnumAt(EcoreEnum aEnum, int index)
  {
    boolean wasAdded = false;
    if(enums.contains(aEnum))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEnums()) { index = numberOfEnums() - 1; }
      enums.remove(aEnum);
      enums.add(index, aEnum);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEnumAt(aEnum, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    attributes.clear();
    references.clear();
    enums.clear();
    super.delete();
  }

  // line 297 "../../../../src/Generator_CodeEcore_Model.ump"
  public List<EcoreGenericNode> getNodeChildren(){
    List<EcoreGenericNode> nodes = super.getNodeChildren();
    
    nodes.addAll(getAttributes());
    nodes.addAll(getReferences());
    
    return nodes;
  }

  // line 306 "../../../../src/Generator_CodeEcore_Model.ump"
  public Integer getNodeChildCount(){
    return numberOfAttributes() + numberOfReferences();
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _printSuperTypeString(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    for(String s : getSuperTypes()){
    
    realSb.append(TEXT_0);
    realSb.append(s);
    realSb.append(TEXT_1);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String printSuperTypeString(){
        StringBuilder sb = new StringBuilder();
    return this._printSuperTypeString(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "isAbstract" + ":" + getIsAbstract()+ "," +
            "isInterface" + ":" + getIsInterface()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 281 "../../../../src/Generator_CodeEcore_Model.ump"
  Map<String,String> getNodeAttributes () 
  {
    Map<String,String> map = super.getNodeAttributes();
    map.put("xsi:type", "ecore:EClass");
    map.put("name", getName());
    if(getIsInterface() != getDefaultIsInterface())
      map.put("interface", String.valueOf(getIsInterface()));
    if(getIsAbstract() != getDefaultIsAbstract())
      map.put("abstract", String.valueOf(getIsAbstract()));
    if(hasSuperTypes())
      map.put("eSuperTypes", printSuperTypeString().trim());
    
      
    return map;
  }

  
}