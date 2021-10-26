/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;

// line 293 "../../../../src/AlloyFact.ump"
public class NonReflexiveFact extends Fact
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NonReflexiveFact()
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

  // line 300 "../../../../src/AlloyFact.ump"
   public  NonReflexiveFact(Association assoc){
    super(assoc);
  	factName = "NonReflexiveRule";
  }

  // line 306 "../../../../src/AlloyFact.ump"
   private String content(){
    return makeVarName(secondClassName,1)+" in "+
  	  rName2+"["+makeVarName(secondClassName,1)+"]\n}";
  }


  /**
   * This methods comments non reflexive rule
   */
  // line 313 "../../../../src/AlloyFact.ump"
   private String comment(){
    return "\n\n-- Defines non-reflexive rule for class "+
  	  secondClassName+"\n";
  }

  // line 319 "../../../../src/AlloyFact.ump"
   private String declaration(){
    return "no "+makeVarDeclaration(secondClassName,1);
  }

  // line 324 "../../../../src/AlloyFact.ump"
   public String print(){
    return comment()+factHeader()+declaration()+suchThatPlusNewLine()+content();
  }

}