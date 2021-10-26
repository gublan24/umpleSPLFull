/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

// line 660 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenStreamMethod extends GenMethod
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String OUT_OPERATOR = "<<";
  public static final String TEXT_0 = "::toOstream(os);";
  public static final String TEXT_1 = "* thisptr = const_cast<";
  public static final String TEXT_2 = "*>(this);";
  public static final String TEXT_3 = "\"";
  public static final String TEXT_4 = ":\" << thisptr->";
  public static final String TEXT_5 = "()";
  public static final String TEXT_6 = " \", \" ";
  public static final String TEXT_7 = NL + "    ";
  public static final String TEXT_8 = "os ";
  public static final String TEXT_9 = " \"[\" << ";
  public static final String TEXT_10 = " << \"]\"";
  public static final String TEXT_11 = " ";
  public static final String TEXT_12 = " endl";
  public static final String TEXT_13 = ";";
  public static final String TEXT_14 = "(thisptr->";
  public static final String TEXT_15 = "()!= NULL ?  os ";
  public static final String TEXT_16 = " \"";
  public static final String TEXT_17 = ":\" << thisptr->";
  public static final String TEXT_18 = "() : os ";
  public static final String TEXT_19 = " \"";
  public static final String TEXT_20 = ":\" << \"NULL\")";
  public static final String TEXT_21 = " endl;" + NL + "    ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenStreamMethod()
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

  // line 665 "../../../../../UmpleTLTemplates/Attributes.ump"
  public void dynamicBody(List<String> bodies){
    String parentStreamMethodCall = parentStreamMethodCall();
		if(!parentStreamMethodCall.isEmpty()){
			bodies.add(parentStreamMethodCall);
		}

		GenClass genClass = getGenClass();
		GenPackage genPackage = genClass.getGenPackage();
		List<GenAssociation> associations = genClass.getAssociations();
		List<GenAssociation> filtered= new ArrayList<GenAssociation>();
		for (GenAssociation association : associations) {
			if(!association.isConstant() && !association.isInternal()){
				filtered.add(association);
			}
		}

		List<String> simples= new ArrayList<String>();
		List<String> complexes= new ArrayList<String>();
		for (GenAssociation association : filtered) {
			GenAssociationEnd source = association.getSource();
			String type = source.getType();
			String name = source.getName();
			String instance = association.getInstance(association.normalizedName());
			
			if(association.isDerived() || genPackage.isPrimitive(type)){
				simples.add(streamCall(name, instance));
			}else{
				complexes.add(streamComplexCall(name, instance));
			}
		}

		String allSimple= simples.stream().collect(Collectors.joining(streamSeparator()));
		
		if(!allSimple.isEmpty() || !complexes.isEmpty()){
			bodies.add(constCastInit());
		}
		
		if(!allSimple.isEmpty()){
			bodies.add(streamAlltogether(allSimple, !complexes.isEmpty()));
		}

		if(!complexes.isEmpty()){
			bodies.add(complexes.stream().collect(Collectors.joining(streamEndSeparator()))+ ";");
		}
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _parentStreamMethodCall(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	GenClass parent = getGenClass().getParent();
    if(parent!= null){
    	
    realSb.append(parent.getName());
    realSb.append(TEXT_0);
    
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String parentStreamMethodCall(){
        StringBuilder sb = new StringBuilder();
    return this._parentStreamMethodCall(0,sb).toString(); 
  }

  public StringBuilder _constCastInit(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name = getGenClass().getName();
    
    realSb.append(name);
    realSb.append(TEXT_1);
    realSb.append(name);
    realSb.append(TEXT_2);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String constCastInit(){
        StringBuilder sb = new StringBuilder();
    return this._constCastInit(0,sb).toString(); 
  }

  public StringBuilder _streamCall(Integer numSpaces, StringBuilder sb, String name, String getter){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_3);
    realSb.append(name);
    realSb.append(TEXT_4);
    realSb.append(getter);
    realSb.append(TEXT_5);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String streamCall(String name, String getter){
        StringBuilder sb = new StringBuilder();
    return this._streamCall(0,sb,name,getter).toString(); 
  }

  public StringBuilder _streamSeparator(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(OUT_OPERATOR);
    realSb.append(TEXT_6);
    realSb.append(OUT_OPERATOR);
    realSb.append(TEXT_7);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String streamSeparator(){
        StringBuilder sb = new StringBuilder();
    return this._streamSeparator(0,sb).toString(); 
  }

  public StringBuilder _streamAlltogether(Integer numSpaces, StringBuilder sb, String streams, boolean next){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_8);
    realSb.append(OUT_OPERATOR);
    realSb.append(TEXT_9);
    realSb.append(streams);
    realSb.append(TEXT_10);
    if(next){
    realSb.append(TEXT_11);
    realSb.append(OUT_OPERATOR);
    realSb.append(TEXT_12);
    }
    realSb.append(TEXT_13);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String streamAlltogether(String streams, boolean next){
        StringBuilder sb = new StringBuilder();
    return this._streamAlltogether(0,sb,streams,next).toString(); 
  }

  public StringBuilder _streamComplexCall(Integer numSpaces, StringBuilder sb, String name, String getter){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_14);
    realSb.append(getter);
    realSb.append(TEXT_15);
    realSb.append(OUT_OPERATOR);
    realSb.append(TEXT_16);
    realSb.append(name);
    realSb.append(TEXT_17);
    realSb.append(getter);
    realSb.append(TEXT_18);
    realSb.append(OUT_OPERATOR);
    realSb.append(TEXT_19);
    realSb.append(name);
    realSb.append(TEXT_20);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String streamComplexCall(String name, String getter){
        StringBuilder sb = new StringBuilder();
    return this._streamComplexCall(0,sb,name,getter).toString(); 
  }

  public StringBuilder _streamEndSeparator(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(OUT_OPERATOR);
    realSb.append(TEXT_21);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String streamEndSeparator(){
        StringBuilder sb = new StringBuilder();
    return this._streamEndSeparator(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}