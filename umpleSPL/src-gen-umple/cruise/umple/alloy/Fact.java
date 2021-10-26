/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;

// line 16 "../../../../src/AlloyFact.ump"
public class Fact extends AlloyObject
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Fact()
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

  // line 32 "../../../../src/AlloyFact.ump"
   public  Fact(Association assoc){
    factName = null;
    firstClassName = assoc.getEnd(0).getClassName();
    secondClassName = assoc.getEnd(1).getClassName();
    if(assoc.getEnd(0).getRoleName().equals("as"))
      rName1 = assoc.getEnd(0).getRoleName()+ "_"; 
    else
      rName1 = assoc.getEnd(0).getRoleName() ;
    if(assoc.getEnd(1).getRoleName().equals("as"))
      rName2 = assoc.getEnd(1).getRoleName()+ "_"; 
    else 
      rName2 = assoc.getEnd(1).getRoleName() ;
  }

  // line 47 "../../../../src/AlloyFact.ump"
   public  Fact(UmpleClass uClass){
    factName = "VisualizationFact";
    firstClassName = uClass.getName();
    rName1 = uClass.getAttribute(0).getName();
  }

  // line 54 "../../../../src/AlloyFact.ump"
   protected String suchThatPlusNewLine(){
    return " |\n    ";
  }

  // line 59 "../../../../src/AlloyFact.ump"
   protected String factHeader(){
    return "fact "+factName+" {\n  ";
  }

  // line 64 "../../../../src/AlloyFact.ump"
   protected String makeVarName(String name, Integer num){
    return name.toLowerCase()+"_"+num;
  }

  // line 69 "../../../../src/AlloyFact.ump"
   private String declarationEnd(String name){
    return " : "+name;
  }

  // line 74 "../../../../src/AlloyFact.ump"
   private String varDec(String cName, Integer num){
    if(num == 1) return makeVarName(cName,1);
  	return varDec(cName,num-1)+", "+makeVarName(cName,num);
  }

  // line 80 "../../../../src/AlloyFact.ump"
   protected String makeVarDeclaration(String cName, Integer num){
    if(num == 1) return varDec(cName,1)+declarationEnd(cName);	 		
	return varDec(cName,num)+declarationEnd(cName);
  }

  // line 86 "../../../../src/AlloyFact.ump"
   private String comment(){
    return "-- Defines a rule that enhances visualizing model with String type\n";
  }

  // line 91 "../../../../src/AlloyFact.ump"
   public String print(){
    String me = "null";
    return comment()+ factHeader()+"no "+makeVarDeclaration(firstClassName,1)
      +suchThatPlusNewLine()+varDec(firstClassName,1)+"."+rName1+" = "+'"'+me+'"'+"\n}";
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 23 "../../../../src/AlloyFact.ump"
  protected String factName ;
// line 24 "../../../../src/AlloyFact.ump"
  protected String firstClassName ;
// line 25 "../../../../src/AlloyFact.ump"
  protected String secondClassName ;
// line 26 "../../../../src/AlloyFact.ump"
  protected String rName1 ;
// line 27 "../../../../src/AlloyFact.ump"
  protected String rName2 ;

  
}