/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import cruise.umple.cpp.utils.StringUtil;
import java.util.regex.Pattern;

/**
 * /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * Composite-structure-specific
 */
// line 1358 "../../../../../UmpleTLTemplates/Core.ump"
public class GenEndpointPropagationBody
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "->";
  public static final String TEXT_1 = "(";
  public static final String TEXT_2 = ");";
  public static final String TEXT_3 = "for (unsigned int index=0; index<";
  public static final String TEXT_4 = "->size(); index++) {" + NL + "  ";
  public static final String TEXT_5 = "* ";
  public static final String TEXT_6 = "= (*(";
  public static final String TEXT_7 = "))[index];" + NL + "  ";
  public static final String TEXT_8 = "->";
  public static final String TEXT_9 = "(";
  public static final String TEXT_10 = ");" + NL + "}";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenEndpointPropagationBody Attributes
  private String parameterString;
  private String name;
  private String role;
  private String type;
  private String method;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenEndpointPropagationBody()
  {
    parameterString = null;
    name = null;
    role = null;
    type = null;
    method = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setParameterString(String aParameterString)
  {
    boolean wasSet = false;
    parameterString = aParameterString;
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

  public boolean setRole(String aRole)
  {
    boolean wasSet = false;
    role = aRole;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public boolean setMethod(String aMethod)
  {
    boolean wasSet = false;
    method = aMethod;
    wasSet = true;
    return wasSet;
  }

  public String getParameterString()
  {
    return parameterString;
  }

  public String getName()
  {
    return name;
  }

  public String getRole()
  {
    return role;
  }

  public String getType()
  {
    return type;
  }

  public String getMethod()
  {
    return method;
  }

  public void delete()
  {}

  // line 1368 "../../../../../UmpleTLTemplates/Core.ump"
  public String propagationBody(Boolean many){
    return many? propagationBodyMany(): propagationBodySingle();
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1162 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String removeInstance(String name){
    return removeInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1166 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String removeInstance(String name, Boolean isRemote){
    String instance= "remove"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1171 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String canSetInstance(String name){
    return "canSet"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1175 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String currentInstance(String name){
    return "current"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1179 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String delegatedParameter(String parameter, String type){
    return parameter + "For"+ StringUtil.firstCharacterToUpperCase(type);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1183 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String verifiedInstance(String name){
    return "verified"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1187 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String removeAtInstance(String name){
    return removeAtInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1191 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String removeAtInstance(String name, Boolean isRemote){
    String instance= "remove"+ StringUtil.firstCharacterToUpperCase(name)+ "At";
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1196 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addAtInstance(String name){
    return addAtInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1200 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addAtInstance(String name, Boolean isRemote){
    String instance= "add"+ StringUtil.firstCharacterToUpperCase(name)+ "At";
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1205 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addOrMoveAtInstance(String name){
    return "addOrMove"+ StringUtil.firstCharacterToUpperCase(name)+ "At";
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1209 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String indexOfInstance(String name){
    return indexOfInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1213 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String indexOfInstance(String name, Boolean isRemote){
    String instance= "indexOf"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1218 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String placeholderInstance(String name){
    return "placeholder"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1222 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String setInstance(String name){
    return setInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1226 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String setInstance(String name, Boolean isRemote){
    String instance= "set"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1231 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String isNewInstance(String name){
    return "isNew"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1235 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String existingInstance(String name){
    return "existing"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1239 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String newMapInstance(String role, String roles){
    return role+ "ToNew"+ StringUtil.firstCharacterToUpperCase(roles);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1243 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String oldInstance(String name){
    return oldInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1247 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String oldInstance(String name, Boolean isMany){
    String base= "old"+ StringUtil.firstCharacterToUpperCase(name);
		if(isMany){
			return base;
		}
		return "an"+ StringUtil.firstCharacterToUpperCase(base);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1255 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String newInstanceInstance(String name){
    return newInstanceInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1259 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String newInstanceInstance(String name, Boolean isMany){
    String base= "new"+ StringUtil.firstCharacterToUpperCase(name);
		if(isMany){
			return base;
		}
		return "a"+ StringUtil.firstCharacterToUpperCase(base);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1267 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String checkNewInstance(String name){
    return "checkNew"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1271 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String variableParameterInstance(String name, boolean isMany){
    return (isMany?"all":"a")+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1275 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String getInstance(String name){
    return getInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1279 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String getInstance(String name, Boolean isRemote){
    String instance= "get"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1284 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String isAInstance(String name){
    return "is"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1288 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String variableInstance(String name){
    return this.variableInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1292 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String variableInstance(String name, boolean isMany){
    String value= StringUtil.firstCharacterToUpperCase(name);
		if(!isMany){
			value= "a"+ value;
		}
		return value;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1300 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String numberOfInstance(String name){
    return numberOfInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1304 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String numberOfInstance(String name, Boolean isRemote){
    String instance= "numberOf"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1309 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String minimumNumberOfInstance(String name){
    return minimumNumberOfInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1313 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String minimumNumberOfInstance(String name, Boolean isRemote){
    String instance= "minimumNumberOf"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1318 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String hasInstance(String name){
    return hasInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1322 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String hasInstance(String name, Boolean isRemote){
    String instance= "has"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1327 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String maximumNumberOfInstance(String name){
    return maximumNumberOfInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1331 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String maximumNumberOfInstance(String name, Boolean isRemote){
    String instance= "maximumNumberOf"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1336 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addInstance(String name){
    return "add"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1340 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addInstance(String name, Boolean isRemote){
    String instance= "add"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1345 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String copyOfInstance(String name){
    return "copyOf"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1349 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String friendSetterInstance(String typeName, String otherEndTypeName){
    return "set"+ StringUtil.firstCharacterToUpperCase(typeName)+ "_"+ StringUtil.firstCharacterToUpperCase(otherEndTypeName);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1353 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String comparatorId(String type, String key){
    return type+ "_"+key+ "_Comparator";
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _propagationBodySingle(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
     
	
    realSb.append(name);
    realSb.append(TEXT_0);
    realSb.append(method);
    realSb.append(TEXT_1);
    realSb.append(parameterString);
    realSb.append(TEXT_2);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String propagationBodySingle(){
        StringBuilder sb = new StringBuilder();
    return this._propagationBodySingle(0,sb).toString(); 
  }

  public StringBuilder _propagationBodyMany(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String getterCall= getInstance(role);
	String instance= variableInstance(type);

    realSb.append(TEXT_3);
    realSb.append(name);
    realSb.append(TEXT_4);
    realSb.append(type);
    realSb.append(TEXT_5);
    realSb.append(instance);
    realSb.append(TEXT_6);
    realSb.append(name);
    realSb.append(TEXT_7);
    realSb.append(instance);
    realSb.append(TEXT_8);
    realSb.append(method);
    realSb.append(TEXT_9);
    realSb.append(parameterString);
    realSb.append(TEXT_10);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String propagationBodyMany(){
        StringBuilder sb = new StringBuilder();
    return this._propagationBodyMany(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "parameterString" + ":" + getParameterString()+ "," +
            "name" + ":" + getName()+ "," +
            "role" + ":" + getRole()+ "," +
            "type" + ":" + getType()+ "," +
            "method" + ":" + getMethod()+ "]";
  }
}