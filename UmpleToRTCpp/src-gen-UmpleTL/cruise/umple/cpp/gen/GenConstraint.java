/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

// line 119 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenConstraint extends AbstractGenConstraint
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String TEXT_0 = "if(";
  public static final String TEXT_1 = "){  " + NL;
  public static final String TEXT_2 = NL + "}";
  public static final String TEXT_3 = "if(!(";
  public static final String TEXT_4 = ")){  " + NL + "  throw \"Please provide ";
  public static final String TEXT_5 = "a ";
  public static final String TEXT_6 = "valid ";
  public static final String TEXT_7 = "\";" + NL + "}";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenConstraint(String aBody)
  {
    super(aBody);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }


  /**
   * TODO: Make body lazy instead
   */
  // line 122 "../../../../../UmpleTLTemplates/Attributes.ump"
   public  GenConstraint(){
    this(null);
  }

  // line 128 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String constraintCheckCall(){
    if(isInvert()){
			return constraintHardCheckCall();
		}
		
		return constraintSimpleCheckCall();
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _constraintSimpleCheckCall(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	
	String _conditions= conditionString();


    realSb.append(TEXT_0);
    realSb.append(_conditions);
    realSb.append(TEXT_1);
    realSb.append(_indent(2, new StringBuilder(), getBaseContent()));
    realSb.append(TEXT_2);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String constraintSimpleCheckCall(){
        StringBuilder sb = new StringBuilder();
    return this._constraintSimpleCheckCall(0,sb).toString(); 
  }

  public StringBuilder _constraintHardCheckCall(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	
	String varaibles= variableString();
	boolean isMany= isMany();
	String _conditions= conditionString();


    realSb.append(TEXT_3);
    realSb.append(_conditions);
    realSb.append(TEXT_4);
    if(!isMany){
    realSb.append(TEXT_5);
    }
    realSb.append(TEXT_6);
    realSb.append(varaibles);
    realSb.append(TEXT_7);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String constraintHardCheckCall(){
        StringBuilder sb = new StringBuilder();
    return this._constraintHardCheckCall(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}