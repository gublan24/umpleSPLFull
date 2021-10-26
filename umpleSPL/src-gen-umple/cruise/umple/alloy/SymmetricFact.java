/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;

// line 328 "../../../../src/AlloyFact.ump"
public class SymmetricFact extends Fact
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SymmetricFact()
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

  // line 335 "../../../../src/AlloyFact.ump"
   public  SymmetricFact(Association assoc){
    super(assoc);
    factName = "SymmetricRelation";
  }

  // line 341 "../../../../src/AlloyFact.ump"
   private String declaration(){
    return "all "+makeVarDeclaration(secondClassName,2)+suchThatPlusNewLine();
  }

  // line 346 "../../../../src/AlloyFact.ump"
   private String comment(){
    return "\n\n-- Defines symmetric rule for class "+
  	  secondClassName+"\n";
  }

  // line 352 "../../../../src/AlloyFact.ump"
   private String content(){
    return makeVarName(secondClassName,1)+" in "+
  	  rName2+"["+makeVarName(secondClassName,2)+"] <=> "+makeVarName(secondClassName,2)+" in "+
  	  rName2+"["+makeVarName(secondClassName,1)+"]\n}";
  }

  // line 359 "../../../../src/AlloyFact.ump"
   public String print(){
    return comment()+factHeader()+declaration()+content();
  }

}