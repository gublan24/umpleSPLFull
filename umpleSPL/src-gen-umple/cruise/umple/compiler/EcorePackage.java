/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.regex.Pattern;
import java.util.*;

// line 84 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcorePackage extends EcoreGenericNode
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String TEXT_0 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcorePackage Attributes
  private String nsURI;
  private String nsPrefix;

  //EcorePackage Associations
  private List<EcoreDataType> dataTypes;
  private List<EcoreClass> classes;
  private List<EcoreEnum> enums;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcorePackage(String aName, int aIntent, String aNsURI, String aNsPrefix)
  {
    super(aName, aIntent);
    // line 94 "../../../../src/Generator_CodeEcore_Model.ump"
    setTagName("ecore:EPackage");
    // END OF UMPLE BEFORE INJECTION
    nsURI = aNsURI;
    nsPrefix = aNsPrefix;
    dataTypes = new ArrayList<EcoreDataType>();
    classes = new ArrayList<EcoreClass>();
    enums = new ArrayList<EcoreEnum>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNsURI(String aNsURI)
  {
    boolean wasSet = false;
    nsURI = aNsURI;
    wasSet = true;
    return wasSet;
  }

  public boolean setNsPrefix(String aNsPrefix)
  {
    boolean wasSet = false;
    nsPrefix = aNsPrefix;
    wasSet = true;
    return wasSet;
  }

  public String getNsURI()
  {
    return nsURI;
  }

  public String getNsPrefix()
  {
    return nsPrefix;
  }
  /* Code from template association_GetMany */
  public EcoreDataType getDataType(int index)
  {
    EcoreDataType aDataType = dataTypes.get(index);
    return aDataType;
  }

  public List<EcoreDataType> getDataTypes()
  {
    List<EcoreDataType> newDataTypes = Collections.unmodifiableList(dataTypes);
    return newDataTypes;
  }

  public int numberOfDataTypes()
  {
    int number = dataTypes.size();
    return number;
  }

  public boolean hasDataTypes()
  {
    boolean has = dataTypes.size() > 0;
    return has;
  }

  public int indexOfDataType(EcoreDataType aDataType)
  {
    int index = dataTypes.indexOf(aDataType);
    return index;
  }
  /* Code from template association_GetMany */
  public EcoreClass getClass(int index)
  {
    EcoreClass aClass = classes.get(index);
    return aClass;
  }

  public List<EcoreClass> getClasses()
  {
    List<EcoreClass> newClasses = Collections.unmodifiableList(classes);
    return newClasses;
  }

  public int numberOfClasses()
  {
    int number = classes.size();
    return number;
  }

  public boolean hasClasses()
  {
    boolean has = classes.size() > 0;
    return has;
  }

  public int indexOfClass(EcoreClass aClass)
  {
    int index = classes.indexOf(aClass);
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
  public static int minimumNumberOfDataTypes()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addDataType(EcoreDataType aDataType)
  {
    boolean wasAdded = false;
    if (dataTypes.contains(aDataType)) { return false; }
    dataTypes.add(aDataType);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeDataType(EcoreDataType aDataType)
  {
    boolean wasRemoved = false;
    if (dataTypes.contains(aDataType))
    {
      dataTypes.remove(aDataType);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDataTypeAt(EcoreDataType aDataType, int index)
  {  
    boolean wasAdded = false;
    if(addDataType(aDataType))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDataTypes()) { index = numberOfDataTypes() - 1; }
      dataTypes.remove(aDataType);
      dataTypes.add(index, aDataType);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDataTypeAt(EcoreDataType aDataType, int index)
  {
    boolean wasAdded = false;
    if(dataTypes.contains(aDataType))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDataTypes()) { index = numberOfDataTypes() - 1; }
      dataTypes.remove(aDataType);
      dataTypes.add(index, aDataType);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDataTypeAt(aDataType, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfClasses()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addClass(EcoreClass aClass)
  {
    boolean wasAdded = false;
    if (classes.contains(aClass)) { return false; }
    classes.add(aClass);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeClass(EcoreClass aClass)
  {
    boolean wasRemoved = false;
    if (classes.contains(aClass))
    {
      classes.remove(aClass);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addClassAt(EcoreClass aClass, int index)
  {  
    boolean wasAdded = false;
    if(addClass(aClass))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfClasses()) { index = numberOfClasses() - 1; }
      classes.remove(aClass);
      classes.add(index, aClass);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveClassAt(EcoreClass aClass, int index)
  {
    boolean wasAdded = false;
    if(classes.contains(aClass))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfClasses()) { index = numberOfClasses() - 1; }
      classes.remove(aClass);
      classes.add(index, aClass);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addClassAt(aClass, index);
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
    dataTypes.clear();
    classes.clear();
    enums.clear();
    super.delete();
  }

  // line 98 "../../../../src/Generator_CodeEcore_Model.ump"
  public String getExistingType(String dependString, String typeName){
    try{
      String fullyQualifiedName = "";
      if(dependString.endsWith(".*")){
        fullyQualifiedName = dependString.substring(0, dependString.length()-3) + "." + typeName;
      }else{
        fullyQualifiedName = dependString + '.' + typeName;
      }
      
      // If no exception, type exists
      Class.forName(fullyQualifiedName);
      return fullyQualifiedName;
    }catch(Exception e){
      return null;
    }
  }

  // line 115 "../../../../src/Generator_CodeEcore_Model.ump"
  public String[] getActualEType(UmpleClass uClass, String eType){
    List<String> typeArgs = new ArrayList<String>();

    if(EcoreGenModel.ecorePrimitiveTypeMap.containsKey(eType)){
      return new String[]{EcoreGenModel.ecorePrimitiveTypeMap.get(eType)};
    }else if(EcoreGenModel.umplePrimitiveTypeMap.containsKey(eType)){
      String existingType = EcoreGenModel.umplePrimitiveTypeMap.get(eType);
      EcoreDataType dataType = new EcoreDataType(eType, getIntent()+1, existingType, 0);
      addDataType(dataType);
      return new String[]{"#//"+eType};
    }else{
      String actualEType = "";
      String existingType = "";
    
      // For non-nested generic type argument
      int startTag = eType.indexOf("<");
      if(startTag >= 0){
      int comma = -1;
        String argString = eType.substring(eType.indexOf("<")+1, eType.lastIndexOf(">"));

        actualEType = eType.substring(0, eType.indexOf("<"));
      typeArgs.add(actualEType);
      while((comma = argString.indexOf(",")) >= 0){
          typeArgs.add(argString.substring(0, comma).trim());
          argString = argString.substring(comma+1);
        }
        typeArgs.add(argString.trim());
      }else{
        actualEType = eType;
        typeArgs.add(actualEType);
      }
      
    
      String checkingExistingType = getExistingType("java.lang", actualEType);
      if(checkingExistingType == null){
        for(Depend depend : uClass.getDepends()){
          checkingExistingType = getExistingType(depend.getPackageName(), actualEType);
          if(checkingExistingType != null){
            break;
          }
        }
      }
      
      existingType = (checkingExistingType != null ? checkingExistingType : actualEType);
      if(EcoreGenModel.ecorePrimitiveTypeMap.containsKey(existingType)){
        typeArgs.set(0, EcoreGenModel.ecorePrimitiveTypeMap.get(existingType));
      }else if(EcoreGenModel.ecoreGenericTypeMap.containsKey(existingType)){
        typeArgs.set(0, existingType);
      }else{
        EcoreDataType dataType = new EcoreDataType(actualEType, getIntent()+1, existingType, typeArgs.size()-1);
        addDataType(dataType);
        typeArgs.set(0, "#//"+actualEType);
      }
      return typeArgs.toArray(new String[0]);
    }
  }

  // line 184 "../../../../src/Generator_CodeEcore_Model.ump"
  public List<EcoreGenericNode> getNodeChildren(){
    List<EcoreGenericNode> nodes = super.getNodeChildren();
    
    nodes.addAll(getDataTypes());
    nodes.addAll(getClasses());
    nodes.addAll(getEnums());
    
    return nodes;
  }

  // line 194 "../../../../src/Generator_CodeEcore_Model.ump"
  public Integer getNodeChildCount(){
    return numberOfClasses() + numberOfDataTypes() + numberOfEnums();
  }

  // line 201 "../../../../src/Generator_CodeEcore_Model.ump"
  public String getCode(){
    return getXmlHeader() + System.lineSeparator() + super.getCode();
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _getXmlHeader(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getXmlHeader(){
        StringBuilder sb = new StringBuilder();
    return this._getXmlHeader(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "nsURI" + ":" + getNsURI()+ "," +
            "nsPrefix" + ":" + getNsPrefix()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 171 "../../../../src/Generator_CodeEcore_Model.ump"
  Map<String,String> getNodeAttributes () 
  {
    Map<String,String> map = super.getNodeAttributes();
    map.put("xmi:version", "2.0");
    map.put("xmlns:xmi", "http://www.omg.org/XMI");
    map.put("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
    map.put("xmlns:ecore", "http://www.eclipse.org/emf/2002/Ecore");
    map.put("name", getName());
    map.put("nsURI", nsURI);
    map.put("nsPrefix", nsPrefix);
    return map;
  }

  
}