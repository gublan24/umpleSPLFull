/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;

// line 215 "../../../../src/AlloyFact.ump"
public class GenHierarchyFact extends Fact
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenHierarchyFact()
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

  // line 221 "../../../../src/AlloyFact.ump"
   public  GenHierarchyFact(Association assoc){
    super(assoc);
    factName = "GenHierarchyFact";
  }

  // line 226 "../../../../src/AlloyFact.ump"
   private String content(){
    return makeVarName(firstClassName,1)+"."+
  	  rName2+" = "+makeVarName(firstClassName,1)+"\n}";
  }

  // line 232 "../../../../src/AlloyFact.ump"
   private String declaration(){
    return "no "+makeVarDeclaration(firstClassName,1);
  }


  /**
   * This methods comments non reflexive rule
   */
  // line 238 "../../../../src/AlloyFact.ump"
   private String comment(){
    return "\n\n-- Defines generalization hierarchy rule between class "+
  	  secondClassName+" and "+firstClassName+"\n";
  }

  // line 243 "../../../../src/AlloyFact.ump"
   public String print(){
    return comment()+factHeader()+declaration()+suchThatPlusNewLine()+content();
  }

}