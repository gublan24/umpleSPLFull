/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;

// line 136 "../../../../src/AlloyFact.ump"
public class NoSelfRelationFact extends Fact
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NoSelfRelationFact()
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

  // line 143 "../../../../src/AlloyFact.ump"
   public  NoSelfRelationFact(Association assoc){
    super(assoc);
  	factName = "NoSelfRelation";
  }

  // line 149 "../../../../src/AlloyFact.ump"
   private String commentNoSelfRelation(){
    return "\n\n-- Defines no self relation rule for class "+
  		firstClassName+"\n";
  }

  // line 155 "../../../../src/AlloyFact.ump"
   private String decPart(){
    return "no "+makeVarDeclaration(firstClassName,1);
  }


  /**
   * This method prints no extended relation fact
   */
  // line 161 "../../../../src/AlloyFact.ump"
   private String printNoSelfRelationFact(){
    return factHeader()+decPart()+suchThatPlusNewLine()+noSelfRelContent()+"\n}";
  }


  /**
   * This method generates content no extended relation
   */
  // line 167 "../../../../src/AlloyFact.ump"
   private String noSelfRelContent(){
    return makeVarName(firstClassName,1)+" in "+
  		makeVarName(firstClassName,1)+".^"+rName2;
  }

  // line 173 "../../../../src/AlloyFact.ump"
   public String print(){
    return commentNoSelfRelation()+printNoSelfRelationFact();
  }

}