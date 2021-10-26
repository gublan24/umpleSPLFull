/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;

// line 3 "../../../../src/AlloyUtility.ump"
public class Utility
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Utility()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 6 "../../../../src/AlloyUtility.ump"
   public void genEmptySignature(StringBuilder code, UmpleClass uClass){
    code.append("sig "+uClass.getName()+" { }");
  	this.addNewLine(code,2);
  }

  // line 11 "../../../../src/AlloyUtility.ump"
   public void addNewLine(StringBuilder code, int num){
    int i = num;
  	while(i > 0){
  		code.append("\n");
  		i--;
  	}
  }

  // line 19 "../../../../src/AlloyUtility.ump"
   public void addTab(StringBuilder code, int tabNum){
    int i = tabNum;
  	while(i > 0){
  		code.append(" "); 
  		i--;
  	}
  }

  // line 27 "../../../../src/AlloyUtility.ump"
   public void addCurlyBracket(StringBuilder code, int type){
    if(type == 1)
  		this.addString(code,"{");
  	if(type == 2)this.addString(code,"}");
  }

  // line 33 "../../../../src/AlloyUtility.ump"
   public String addStartDottedLine(){
    return "\n\n------------------------------------------------------------------------------------------------------------------\n\n";
  }

  // line 37 "../../../../src/AlloyUtility.ump"
   public String addEndDottedLine(){
    return "\n------------------------------------------------------------------------------------------------------------------\n\n";
  }

  // line 40 "../../../../src/AlloyUtility.ump"
   private void addChar(StringBuilder code, char c){
    String cc = ""+c; this.addString(code,cc);
  }

  // line 43 "../../../../src/AlloyUtility.ump"
   public void composeSimpleDeclaration(String rEndName, String lEndName, StringBuilder code){
    char a = lEndName.toLowerCase().charAt(0), b = rEndName.toLowerCase().charAt(0);
  	this.addNewLine(code,1);
  	this.addTab(code, 2);
  	this.addString(code,"all");
  	this.addTab(code, 1);
  	this.addChar(code,a);
  	//this.addString(code,a+"_");
  	this.addString(code,"1 : ");
  	this.addString(code,lEndName);
  	this.addString(code,", ");
  	this.addChar(code,b);
  	//this.addString(code,b+"_");
  	this.addString(code,"1 : ");
  	this.addString(code,rEndName);
  	this.addString(code," |");
  	this.addNewLine(code,1);
  }

  // line 62 "../../../../src/AlloyUtility.ump"
   public void addString(StringBuilder code, String str){
    code.append(str);
  }


  /**
   * This defines a signature head
   */
  // line 66 "../../../../src/AlloyUtility.ump"
   public void addSignatureHead(StringBuilder code, UmpleClass uClass){
    code.append("sig "+uClass.getName()+" {\n");
  }


  /**
   * Comment begins here
   */
  // line 71 "../../../../src/AlloyUtility.ump"
   public void commentModel(StringBuilder code, UmpleModel model){
    code.append(addStartDottedLine()+
  		"-- This Alloy file is generated using Umple from "+
  			model.getUmpleFile().getFileName()+addStartDottedLine());
  }


  /**
   * Comment fact
   * public void commentFact(StringBuilder code,Association assoc){}
   * This defines a function mapping within alloy signature
   */
  // line 81 "../../../../src/AlloyUtility.ump"
   public String alloyAssociation(AssociationEnd end){
    String str, theMult = getAlloyMultiplicity(end);
      str = end.getRoleName()+" : "+ theMult + " " +end.getClassName();
      return str;
  }


  /**
   * Returns the lower case of a class name at left end of an association
   */
  // line 87 "../../../../src/AlloyUtility.ump"
   public String getA(Association assoc){
    return getLeftEndName(assoc).toLowerCase()+"_";
  }


  /**
   * Returns the lower case of a class name at right end of an association
   */
  // line 91 "../../../../src/AlloyUtility.ump"
   public String getB(Association assoc){
    return getRightEndName(assoc).toLowerCase()+"_";
  }

  // line 94 "../../../../src/AlloyUtility.ump"
   public String getLeftEndName(Association assoc){
    return assoc.getEnd(0).getClassName();
  }

  // line 97 "../../../../src/AlloyUtility.ump"
   public String getRightEndName(Association assoc){
    return assoc.getEnd(1).getClassName();
  }

  // line 100 "../../../../src/AlloyUtility.ump"
   public String getLeftRoleName(Association assoc){
    return assoc.getEnd(0).getRoleName();
  }

  // line 103 "../../../../src/AlloyUtility.ump"
   public String getRightRoleName(Association assoc){
    return assoc.getEnd(1).getRoleName();
  }

  // line 106 "../../../../src/AlloyUtility.ump"
   public String getLeftMult(Association assoc){
    return getAlloyMultiplicity(assoc.getEnd(0));
  }

  // line 109 "../../../../src/AlloyUtility.ump"
   public String getRightMult(Association assoc){
    return getAlloyMultiplicity(assoc.getEnd(1));
  }

  // line 112 "../../../../src/AlloyUtility.ump"
   public AssociationEnd getRightEnd(Association assoc){
    return assoc.getEnd(1);
  }

  // line 115 "../../../../src/AlloyUtility.ump"
   public AssociationEnd getLeftEnd(Association assoc){
    return assoc.getEnd(0);
  }

  // line 119 "../../../../src/AlloyUtility.ump"
   public String getAlloyMultiplicity(AssociationEnd end){
    String theMult = end.getMultiplicity().getParserable();
        if(theMult.equals("1"))
          return "one";
        else if(theMult.equals("0..1"))
          return "lone"; 
        else if(theMult.equals("*")) 
          return "set";
        else if(theMult.equals("1..*"))
            return "some";
        else return getMultiplicity(end);
  }

  // line 131 "../../../../src/AlloyUtility.ump"
   private String getMultiplicity(AssociationEnd end){
    if(end.getMultiplicity().isValid()){
          int m = end.getMultiplicity().getUpperBound(),
              n = end.getMultiplicity().getLowerBound();
          if(n == 0 && m > 1) return "set"; 
          if(n == 1 && m == 1) return "one";
          return "some";
      }
      return null;
  }

  // line 142 "../../../../src/AlloyUtility.ump"
   public void printOpenStatement(String className, String packageName, StringBuilder code){
    addString(code,"open util/"+packageName+"["+className+"]");
 	addNewLine(code,1);
  }

}