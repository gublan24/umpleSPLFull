/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

// line 771 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenDestructorMethod extends GenMethod
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String TEXT_0 = "delete ";
  public static final String TEXT_1 = ";";
  public static final String TEXT_2 = NL + "std::for_each(";
  public static final String TEXT_3 = "->begin(), ";
  public static final String TEXT_4 = "->end(), /*std::default_delete<";
  public static final String TEXT_5 = ">*/ deleteElement());" + NL;
  public static final String TEXT_6 = "->clear();" + NL + "delete ";
  public static final String TEXT_7 = ";";
  public static final String TEXT_8 = "//";
  public static final String TEXT_9 = "::~";
  public static final String TEXT_10 = "();" + NL;
  public static final String TEXT_11 = "this->deleteAssociatedObjects();";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenDestructorMethod()
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


  /**
   * TODO: Does not work; in parent
   * after setGenClass{
   * setName("~"+ genClass.getName());
   * }
   */
  // line 780 "../../../../../UmpleTLTemplates/Attributes.ump"
  public void dynamicBody(List<String> bodies){
    GenClass genClass = getGenClass();
		if(genClass instanceof GenInterface == false){
			bodies.add(destructInitialCall());
			GenPackage genPackage = genClass.getGenPackage();
			
			List<GenAssociation> associations = genClass.getAssociations();
			List<GenAssociation> filtered= new ArrayList<GenAssociation>();
			for (GenAssociation association : associations) {
				if(!association.isConstant() && !association.isInternal() && !association.isDerived()){
					filtered.add(association);
				}
			}
			
			for (GenAssociation association : filtered) {
				GenAssociationEnd source = association.getSource();
				String type = source.getType();
				String name = source.getName();
				
				if(association.isMany()){
					bodies.add(destructMany(name, type));
				}else if(!genPackage.isPrimitive(type)){
					bodies.add(destructAttribute(name));
				}
			}
			
			for(GenField field: genClass.getFields()){
				if(field.isDestructible()){
					bodies.add(destructAttribute(field.getName()));
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

  public StringBuilder _destructAttribute(Integer numSpaces, StringBuilder sb, String name){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(name);
    realSb.append(TEXT_1);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String destructAttribute(String name){
        StringBuilder sb = new StringBuilder();
    return this._destructAttribute(0,sb,name).toString(); 
  }

  public StringBuilder _destructMany(Integer numSpaces, StringBuilder sb, String name, String type){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_2);
    realSb.append(name);
    realSb.append(TEXT_3);
    realSb.append(name);
    realSb.append(TEXT_4);
    realSb.append(type);
    realSb.append(TEXT_5);
    realSb.append(name);
    realSb.append(TEXT_6);
    realSb.append(name);
    realSb.append(TEXT_7);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String destructMany(String name, String type){
        StringBuilder sb = new StringBuilder();
    return this._destructMany(0,sb,name,type).toString(); 
  }

  public StringBuilder _destructInitialCall(Integer numSpaces, StringBuilder sb){
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
    	String parentName= parent.getName();
    	
    realSb.append(TEXT_8);
    realSb.append(parentName);
    realSb.append(TEXT_9);
    realSb.append(parentName);
    realSb.append(TEXT_10);
    }
    realSb.append(TEXT_11);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String destructInitialCall(){
        StringBuilder sb = new StringBuilder();
    return this._destructInitialCall(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}