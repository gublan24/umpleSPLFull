/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.regex.Pattern;
import java.util.*;

// line 1150 "../../../../../UmpleTLTemplates/Core.ump"
// line 1224 "../../../../../UmpleTLTemplates/Core.ump"
public class GenMethodParameter
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "const ";
  public static final String TEXT_1 = " ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenMethodParameter Attributes
  private String type;
  private String name;
  private boolean normalize;
  private String relatedField;
  private boolean isInherited;
  private String crudType;
  private boolean isPointer;
  private boolean normalizedIsPointer;
  private boolean isReference;
  private boolean normalizedIsReference;
  private boolean isConstant;
  private boolean normalizedIsConstant;

  //GenMethodParameter Associations
  private GenConstructor genMethodContr;
  private List<GenMethod> genMethods;
  private GenBaseConstructorMethod owner;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenMethodParameter(String aType, String aName)
  {
    type = aType;
    name = aName;
    normalize = false;
    relatedField = null;
    isInherited = false;
    crudType = null;
    isPointer = false;
    normalizedIsPointer = false;
    isReference = false;
    normalizedIsReference = false;
    isConstant = false;
    normalizedIsConstant = false;
    genMethods = new ArrayList<GenMethod>();
    // line 1160 "../../../../../UmpleTLTemplates/Core.ump"
    setCrudType(type);
    // END OF UMPLE AFTER INJECTION
    // line 1174 "../../../../../UmpleTLTemplates/Core.ump"
    setNormalizedIsPointer(isPointer);
    // END OF UMPLE AFTER INJECTION
    // line 1188 "../../../../../UmpleTLTemplates/Core.ump"
    setNormalizedIsReference(isReference);
    // END OF UMPLE AFTER INJECTION
    // line 1202 "../../../../../UmpleTLTemplates/Core.ump"
    setNormalizedIsConstant(isConstant);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setNormalize(boolean aNormalize)
  {
    boolean wasSet = false;
    normalize = aNormalize;
    wasSet = true;
    return wasSet;
  }

  public boolean setRelatedField(String aRelatedField)
  {
    boolean wasSet = false;
    relatedField = aRelatedField;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInherited(boolean aIsInherited)
  {
    boolean wasSet = false;
    isInherited = aIsInherited;
    wasSet = true;
    return wasSet;
  }

  public boolean setCrudType(String aCrudType)
  {
    boolean wasSet = false;
    crudType = aCrudType;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsPointer(boolean aIsPointer)
  {
    boolean wasSet = false;
    isPointer = aIsPointer;
    wasSet = true;
    // line 1177 "../../../../../UmpleTLTemplates/Core.ump"
    setNormalizedIsPointer(isPointer);
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean setNormalizedIsPointer(boolean aNormalizedIsPointer)
  {
    boolean wasSet = false;
    normalizedIsPointer = aNormalizedIsPointer;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsReference(boolean aIsReference)
  {
    boolean wasSet = false;
    isReference = aIsReference;
    wasSet = true;
    // line 1191 "../../../../../UmpleTLTemplates/Core.ump"
    setNormalizedIsReference(isReference);
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean setNormalizedIsReference(boolean aNormalizedIsReference)
  {
    boolean wasSet = false;
    normalizedIsReference = aNormalizedIsReference;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsConstant(boolean aIsConstant)
  {
    boolean wasSet = false;
    isConstant = aIsConstant;
    wasSet = true;
    // line 1205 "../../../../../UmpleTLTemplates/Core.ump"
    setNormalizedIsConstant(isConstant);
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean setNormalizedIsConstant(boolean aNormalizedIsConstant)
  {
    boolean wasSet = false;
    normalizedIsConstant = aNormalizedIsConstant;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_GetCodeInjection */
  public String getType()
  {
    String aType = type;
    // line 1226 "../../../../../UmpleTLTemplates/Core.ump"
    GenMethod method = hasGenMethods()?getGenMethod(0): null;
    		if(normalize){
    			if (method != null) {
    				return method.getGenClass().getGenPackage().getNormalizedType(aType);
    			}
    		}else{
    			if(getIsPointer()){
    				aType+= "*";
    			}else if(getIsReference()){
    				aType+= "&";
    			}
    		}
    // END OF UMPLE AFTER INJECTION
    return aType;
  }

  public String getName()
  {
    return name;
  }

  public boolean getNormalize()
  {
    return normalize;
  }

  public String getRelatedField()
  {
    return relatedField;
  }

  /**
   * Used for constructor parameters, where parameter belongs to a parent
   */
  public boolean getIsInherited()
  {
    return isInherited;
  }

  public String getCrudType()
  {
    return crudType;
  }
  /* Code from template attribute_GetCodeInjection */
  public boolean getIsPointer()
  {
    boolean aIsPointer = isPointer;
    // line 1180 "../../../../../UmpleTLTemplates/Core.ump"
    if(normalize){
    			return getNormalizedIsPointer();
    		}
    // END OF UMPLE AFTER INJECTION
    return aIsPointer;
  }

  public boolean getNormalizedIsPointer()
  {
    // line 1265 "../../../../../UmpleTLTemplates/Core.ump"
    if (type != null) {
    			GenMethod method = hasGenMethods()?getGenMethod(0): null;
    			if (method != null) {
    				return method.getGenClass().getGenPackage().isPointer(type);
    			}
    		}
    // END OF UMPLE BEFORE INJECTION
    return normalizedIsPointer;
  }
  /* Code from template attribute_GetCodeInjection */
  public boolean getIsReference()
  {
    boolean aIsReference = isReference;
    // line 1194 "../../../../../UmpleTLTemplates/Core.ump"
    if(normalize){
    			return getNormalizedIsReference();
    		}
    // END OF UMPLE AFTER INJECTION
    return aIsReference;
  }

  public boolean getNormalizedIsReference()
  {
    // line 1253 "../../../../../UmpleTLTemplates/Core.ump"
    switch (type) {
    		case "Integer":
    		case "int":
    		case "String":
    		case "string":
    			return true;
    		default:
    			break;
    		}
    // END OF UMPLE BEFORE INJECTION
    return normalizedIsReference;
  }
  /* Code from template attribute_GetCodeInjection */
  public boolean getIsConstant()
  {
    boolean aIsConstant = isConstant;
    // line 1208 "../../../../../UmpleTLTemplates/Core.ump"
    if(hasGenMethods()) {
    			GenClass genClass = getGenMethod(0).getGenClass();
    			if (genClass.getIsRemote()) {
    				if(genClass.getGenPackage().isPrimitive(type)){
    					return false;
    				}
    			}
    		}
    		
    		if(normalize){
    			return getNormalizedIsConstant();
    		}
    // END OF UMPLE AFTER INJECTION
    return aIsConstant;
  }

  public boolean getNormalizedIsConstant()
  {
    // line 1241 "../../../../../UmpleTLTemplates/Core.ump"
    switch (type) {
    		case "Integer":
    		case "int":
    		case "String":
    		case "string":
    			return true;
    		default:
    			break;
    		}
    // END OF UMPLE BEFORE INJECTION
    return normalizedIsConstant;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNormalize()
  {
    return normalize;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInherited()
  {
    return isInherited;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsPointer()
  {
    return isPointer;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNormalizedIsPointer()
  {
    return normalizedIsPointer;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsReference()
  {
    return isReference;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNormalizedIsReference()
  {
    return normalizedIsReference;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsConstant()
  {
    return isConstant;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNormalizedIsConstant()
  {
    return normalizedIsConstant;
  }
  /* Code from template association_GetOne */
  public GenConstructor getGenMethodContr()
  {
    return genMethodContr;
  }

  public boolean hasGenMethodContr()
  {
    boolean has = genMethodContr != null;
    return has;
  }
  /* Code from template association_GetMany */
  public GenMethod getGenMethod(int index)
  {
    GenMethod aGenMethod = genMethods.get(index);
    return aGenMethod;
  }

  public List<GenMethod> getGenMethods()
  {
    List<GenMethod> newGenMethods = Collections.unmodifiableList(genMethods);
    return newGenMethods;
  }

  public int numberOfGenMethods()
  {
    int number = genMethods.size();
    return number;
  }

  public boolean hasGenMethods()
  {
    boolean has = genMethods.size() > 0;
    return has;
  }

  public int indexOfGenMethod(GenMethod aGenMethod)
  {
    int index = genMethods.indexOf(aGenMethod);
    return index;
  }
  /* Code from template association_GetOne */
  public GenBaseConstructorMethod getOwner()
  {
    return owner;
  }

  public boolean hasOwner()
  {
    boolean has = owner != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenMethodContr(GenConstructor aGenMethodContr)
  {
    boolean wasSet = false;
    GenConstructor existingGenMethodContr = genMethodContr;
    genMethodContr = aGenMethodContr;
    if (existingGenMethodContr != null && !existingGenMethodContr.equals(aGenMethodContr))
    {
      existingGenMethodContr.removeParameter(this);
    }
    if (aGenMethodContr != null)
    {
      aGenMethodContr.addParameter(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGenMethods()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addGenMethod(GenMethod aGenMethod)
  {
    boolean wasAdded = false;
    if (genMethods.contains(aGenMethod)) { return false; }
    genMethods.add(aGenMethod);
    if (aGenMethod.indexOfParameter(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aGenMethod.addParameter(this);
      if (!wasAdded)
      {
        genMethods.remove(aGenMethod);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeGenMethod(GenMethod aGenMethod)
  {
    boolean wasRemoved = false;
    if (!genMethods.contains(aGenMethod))
    {
      return wasRemoved;
    }

    int oldIndex = genMethods.indexOf(aGenMethod);
    genMethods.remove(oldIndex);
    if (aGenMethod.indexOfParameter(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aGenMethod.removeParameter(this);
      if (!wasRemoved)
      {
        genMethods.add(oldIndex,aGenMethod);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGenMethodAt(GenMethod aGenMethod, int index)
  {  
    boolean wasAdded = false;
    if(addGenMethod(aGenMethod))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGenMethods()) { index = numberOfGenMethods() - 1; }
      genMethods.remove(aGenMethod);
      genMethods.add(index, aGenMethod);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGenMethodAt(GenMethod aGenMethod, int index)
  {
    boolean wasAdded = false;
    if(genMethods.contains(aGenMethod))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGenMethods()) { index = numberOfGenMethods() - 1; }
      genMethods.remove(aGenMethod);
      genMethods.add(index, aGenMethod);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGenMethodAt(aGenMethod, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setOwner(GenBaseConstructorMethod aOwner)
  {
    boolean wasSet = false;
    GenBaseConstructorMethod existingOwner = owner;
    owner = aOwner;
    if (existingOwner != null && !existingOwner.equals(aOwner))
    {
      existingOwner.removePrePolymorphicParameter(this);
    }
    if (aOwner != null)
    {
      aOwner.addPrePolymorphicParameter(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (genMethodContr != null)
    {
      GenConstructor placeholderGenMethodContr = genMethodContr;
      this.genMethodContr = null;
      placeholderGenMethodContr.removeParameter(this);
    }
    ArrayList<GenMethod> copyOfGenMethods = new ArrayList<GenMethod>(genMethods);
    genMethods.clear();
    for(GenMethod aGenMethod : copyOfGenMethods)
    {
      aGenMethod.removeParameter(this);
    }
    if (owner != null)
    {
      GenBaseConstructorMethod placeholderOwner = owner;
      this.owner = null;
      placeholderOwner.removePrePolymorphicParameter(this);
    }
  }

  // line 1168 "../../../../../UmpleTLTemplates/Core.ump"
  public String declaration(){
    return declaration(true);
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _declaration(Integer numSpaces, StringBuilder sb, Boolean showName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    if(getIsConstant()){
    realSb.append(TEXT_0);
    }
    realSb.append(getType());
    if(name != null && showName){
    realSb.append(TEXT_1);
    realSb.append(name);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String declaration(Boolean showName){
        StringBuilder sb = new StringBuilder();
    return this._declaration(0,sb,showName).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "type" + ":" + getType()+ "," +
            "name" + ":" + getName()+ "," +
            "normalize" + ":" + getNormalize()+ "," +
            "relatedField" + ":" + getRelatedField()+ "," +
            "isInherited" + ":" + getIsInherited()+ "," +
            "crudType" + ":" + getCrudType()+ "," +
            "isPointer" + ":" + getIsPointer()+ "," +
            "normalizedIsPointer" + ":" + getNormalizedIsPointer()+ "," +
            "isReference" + ":" + getIsReference()+ "," +
            "normalizedIsReference" + ":" + getNormalizedIsReference()+ "," +
            "isConstant" + ":" + getIsConstant()+ "," +
            "normalizedIsConstant" + ":" + getNormalizedIsConstant()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "genMethodContr = "+(getGenMethodContr()!=null?Integer.toHexString(System.identityHashCode(getGenMethodContr())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "owner = "+(getOwner()!=null?Integer.toHexString(System.identityHashCode(getOwner())):"null");
  }
}