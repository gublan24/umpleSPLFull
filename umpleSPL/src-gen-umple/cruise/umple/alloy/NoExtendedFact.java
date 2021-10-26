/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;

// line 98 "../../../../src/AlloyFact.ump"
public class NoExtendedFact extends Fact
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NoExtendedFact()
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

  // line 105 "../../../../src/AlloyFact.ump"
   public  NoExtendedFact(Association assoc){
    super(assoc);
  	factName = "NoExtendedRelation";
  }

  // line 111 "../../../../src/AlloyFact.ump"
   private String commentNoExtendedFact(){
    return "\n\n-- Defines no extended relation rule for class "+
  		firstClassName+"\n";
  }


  /**
   * This method prints no extended relation fact
   */
  // line 118 "../../../../src/AlloyFact.ump"
   private String printNoExtendedRelationFact(){
    return factHeader()+"no disj "+makeVarDeclaration(firstClassName,3)+
  	  suchThatPlusNewLine()+noExtRelContent()+"\n}";
  }


  /**
   * This method generates content no extended relation
   */
  // line 125 "../../../../src/AlloyFact.ump"
   private String noExtRelContent(){
    return makeVarName(firstClassName,1)+" in "+
  		rName2+"["+makeVarName(firstClassName,2)+"] && "+makeVarName(firstClassName,1)
  		+" in "+rName2+"["+makeVarName(firstClassName,3)+"]";
  }

  // line 131 "../../../../src/AlloyFact.ump"
   public String print(){
    return commentNoExtendedFact()+ printNoExtendedRelationFact();
  }

}