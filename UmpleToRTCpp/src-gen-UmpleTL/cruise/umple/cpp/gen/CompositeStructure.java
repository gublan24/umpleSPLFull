/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import cruise.umple.core.GenerationPolicyRegistry;
import cruise.umple.modeling.handlers.IModelingConstants;
import cruise.umple.modeling.handlers.cpp.ICppDefinitions;
import cruise.umple.core.Generator;
import cruise.umple.cpp.utils.StringUtil;
import java.util.regex.Pattern;

// line 381 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
public class CompositeStructure extends GenerationTemplate
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String TEXT_0 = "    ";
  public static final String TEXT_1 = "* serialize(";
  public static final String TEXT_2 = " ";
  public static final String TEXT_3 = ");";
  public static final String TEXT_4 = "    void deserialize(";
  public static final String TEXT_5 = "* ";
  public static final String TEXT_6 = ", ";
  public static final String TEXT_7 = "_Message_Descriptor* ";
  public static final String TEXT_8 = "_Message_Descriptor);";
  public static final String TEXT_9 = NL + "  public:" + NL + "      " + NL + "    //------------------------" + NL + "    // CONSTRUCTOR" + NL + "    //------------------------" + NL + "    ";
  public static final String TEXT_10 = "_Message();" + NL + "  " + NL + "    //------------------------" + NL + "    // DESTRUCTOR" + NL + "    //------------------------" + NL + "    virtual ~";
  public static final String TEXT_11 = "_Message();" + NL;
  public static final String TEXT_12 = NL;
  public static final String TEXT_13 = NL;
  public static final String TEXT_14 = "* msg = new ";
  public static final String TEXT_15 = "();" + NL;
  public static final String TEXT_16 = NL + "return msg;" + NL;
  public static final String TEXT_17 = NL + "void ";
  public static final String TEXT_18 = "::deserialize(";
  public static final String TEXT_19 = " ";
  public static final String TEXT_20 = ", ";
  public static final String TEXT_21 = "* msg) {" + NL;
  public static final String TEXT_22 = NL + "}";
  public static final String TEXT_23 = "";
  public static final String TEXT_24 = "";
  public static final String TEXT_25 = "try {" + NL;
  public static final String TEXT_26 = NL + "}catch (...){" + NL;
  public static final String TEXT_27 = NL + "}";
  public static final String TEXT_28 = NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CompositeStructure(GenerationPolicyRegistry aG)
  {
    super(aG);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _serialize(Integer numSpaces, StringBuilder sb, String descirptorStructName, String normalizedType, String normalizedTypeName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(descirptorStructName);
    realSb.append(TEXT_1);
    realSb.append(normalizedType);
    realSb.append(TEXT_2);
    realSb.append(normalizedTypeName);
    realSb.append(TEXT_3);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String serialize(String descirptorStructName, String normalizedType, String normalizedTypeName){
        StringBuilder sb = new StringBuilder();
    return this._serialize(0,sb,descirptorStructName,normalizedType,normalizedTypeName).toString(); 
  }

  public StringBuilder _deserialize(Integer numSpaces, StringBuilder sb, String normalizedType, String normalizedTypeName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_4);
    realSb.append(normalizedType);
    realSb.append(TEXT_5);
    realSb.append(normalizedTypeName);
    realSb.append(TEXT_6);
    realSb.append(normalizedType);
    realSb.append(TEXT_7);
    realSb.append(normalizedTypeName);
    realSb.append(TEXT_8);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deserialize(String normalizedType, String normalizedTypeName){
        StringBuilder sb = new StringBuilder();
    return this._deserialize(0,sb,normalizedType,normalizedTypeName).toString(); 
  }

  public StringBuilder _publicMessageContent(Integer numSpaces, StringBuilder sb, String name, String serializes, String deserializes){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_9);
    realSb.append(name);
    realSb.append(TEXT_10);
    realSb.append(name);
    realSb.append(TEXT_11);
    realSb.append(serializes);
    realSb.append(TEXT_12);
    realSb.append(deserializes);
    realSb.append(TEXT_13);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String publicMessageContent(String name, String serializes, String deserializes){
        StringBuilder sb = new StringBuilder();
    return this._publicMessageContent(0,sb,name,serializes,deserializes).toString(); 
  }

  public StringBuilder _serializeImplementation(Integer numSpaces, StringBuilder sb, String descirptorStructName, String serializeContents){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(descirptorStructName);
    realSb.append(TEXT_14);
    realSb.append(descirptorStructName);
    realSb.append(TEXT_15);
    realSb.append(serializeContents);
    realSb.append(TEXT_16);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String serializeImplementation(String descirptorStructName, String serializeContents){
        StringBuilder sb = new StringBuilder();
    return this._serializeImplementation(0,sb,descirptorStructName,serializeContents).toString(); 
  }

  public StringBuilder _deserializeImplementation(Integer numSpaces, StringBuilder sb, String descirptorStructName, String className, String typeName, String typeInstance, String deserializeContents){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_17);
    realSb.append(className);
    realSb.append(TEXT_18);
    realSb.append(typeName);
    realSb.append(TEXT_19);
    realSb.append(typeInstance);
    realSb.append(TEXT_20);
    realSb.append(descirptorStructName);
    realSb.append(TEXT_21);
    realSb.append(StringUtil.indent(deserializeContents,1));
    realSb.append(TEXT_22);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deserializeImplementation(String descirptorStructName, String className, String typeName, String typeInstance, String deserializeContents){
        StringBuilder sb = new StringBuilder();
    return this._deserializeImplementation(0,sb,descirptorStructName,className,typeName,typeInstance,deserializeContents).toString(); 
  }

  public StringBuilder _callThenResolve(Integer numSpaces, StringBuilder sb, String call, String then, String resolve){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_23);
     if(resolve == null || resolve.isEmpty()){
    realSb.append(call);
    realSb.append(safeSet(then));
    realSb.append(TEXT_24);
    }else{
    realSb.append(TEXT_25);
    realSb.append(StringUtil.indent(call,1));
    realSb.append(safeSetNL(StringUtil.indent(then,1)));
    realSb.append(TEXT_26);
    realSb.append(StringUtil.indent(resolve,1));
    realSb.append(TEXT_27);
    }
    realSb.append(TEXT_28);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String callThenResolve(String call, String then, String resolve){
        StringBuilder sb = new StringBuilder();
    return this._callThenResolve(0,sb,call,then,resolve).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}