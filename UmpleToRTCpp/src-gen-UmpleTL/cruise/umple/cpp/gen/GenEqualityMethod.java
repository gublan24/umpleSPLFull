/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import cruise.umple.cpp.gen.GenMethod;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

// line 858 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenEqualityMethod extends GenMethod
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String TEXT_0 = "//if (typeid(Right) != typeid(Left)) {" + NL + "//  return false;" + NL + "//}" + NL + NL + "if(Right.hashCode() != Left.hashCode()) {" + NL + "  return false;" + NL + "}";
  public static final String TEXT_1 = "if(!compare(Right.";
  public static final String TEXT_2 = ", Left.";
  public static final String TEXT_3 = ", sizeof Right.";
  public static final String TEXT_4 = ")){" + NL + "  return false;" + NL + "}";
  public static final String TEXT_5 = "if(!std::equal(Right.";
  public static final String TEXT_6 = "->begin(), Right.";
  public static final String TEXT_7 = "->end(), Left.";
  public static final String TEXT_8 = "->begin())){" + NL + "   return false;" + NL + "}";
  public static final String TEXT_9 = "if(Right.";
  public static final String TEXT_10 = "!= Left.";
  public static final String TEXT_11 = "){" + NL + "   return false;" + NL + "}";
  public static final String TEXT_12 = "if(Right.";
  public static final String TEXT_13 = ".compare(Left.";
  public static final String TEXT_14 = ") != 0){" + NL + "   return false;" + NL + "}";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenEqualityMethod()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 893 "../../../../../UmpleTLTemplates/Attributes.ump"
  public void dynamicBody(List<String> bodies){
    bodies.add(defaultEqualityCheck());
		
//		boolean hasKey = generationValueGetter.getBoolean(parent, IModelingElementDefinitions.HAS_KEY_MEMBERS, element);
//		if(!hasKey){
//			return false;
//		}
//		
//		boolean isKeyMemeber = generationValueGetter.getBoolean(parent,IModelingElementDefinitions.IS_KEY_MEMBER, element);
//		if(!isKeyMemeber){
//			//Do not add the members to the equality implementation; however, also prevent it from being added to the default implementation as we need to only rely on
//			//the key members in case there are
//			return true;
//		}
		
		for(GenField field: getGenClass().getFields()){
			if(!field.getIsEnum() && field.getIsComparable() && !field.isRemote()){
				String name= field.getName();
		    	
				if(field.getIsMany()){
		    		bodies.add(attributeEqualityMany(name));
		    	}else{
		    		String type = field.getType();
		    		if(getGenClass().getGenPackage().isString(type)){
		        		bodies.add(attributeEqualityString(name));
		        	}else if(getGenClass().getGenPackage().isPrimitive(type)){
		        		bodies.add(attributeEqualityPrimitive(name));
		        		attributeEqualityPrimitive(name);
		        	}else{
		        		bodies.add(attributeEqualitySingle(name));
		        	}
		    	}
			}
	    }
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _defaultEqualityCheck(Integer numSpaces, StringBuilder sb){
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

  public String defaultEqualityCheck(){
        StringBuilder sb = new StringBuilder();
    return this._defaultEqualityCheck(0,sb).toString(); 
  }

  public StringBuilder _attributeEqualitySingle(Integer numSpaces, StringBuilder sb, String name){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_1);
    realSb.append(name);
    realSb.append(TEXT_2);
    realSb.append(name);
    realSb.append(TEXT_3);
    realSb.append(name);
    realSb.append(TEXT_4);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeEqualitySingle(String name){
        StringBuilder sb = new StringBuilder();
    return this._attributeEqualitySingle(0,sb,name).toString(); 
  }

  public StringBuilder _attributeEqualityMany(Integer numSpaces, StringBuilder sb, String name){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_5);
    realSb.append(name);
    realSb.append(TEXT_6);
    realSb.append(name);
    realSb.append(TEXT_7);
    realSb.append(name);
    realSb.append(TEXT_8);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeEqualityMany(String name){
        StringBuilder sb = new StringBuilder();
    return this._attributeEqualityMany(0,sb,name).toString(); 
  }

  public StringBuilder _attributeEqualityPrimitive(Integer numSpaces, StringBuilder sb, String name){
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

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeEqualityPrimitive(String name){
        StringBuilder sb = new StringBuilder();
    return this._attributeEqualityPrimitive(0,sb,name).toString(); 
  }

  public StringBuilder _attributeEqualityString(Integer numSpaces, StringBuilder sb, String name){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_12);
    realSb.append(name);
    realSb.append(TEXT_13);
    realSb.append(name);
    realSb.append(TEXT_14);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeEqualityString(String name){
        StringBuilder sb = new StringBuilder();
    return this._attributeEqualityString(0,sb,name).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}