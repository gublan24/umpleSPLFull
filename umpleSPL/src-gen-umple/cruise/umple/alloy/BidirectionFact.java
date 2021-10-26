/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;

// line 177 "../../../../src/AlloyFact.ump"
public class BidirectionFact extends Fact
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BidirectionFact()
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

  // line 184 "../../../../src/AlloyFact.ump"
   public  BidirectionFact(Association assoc){
    super(assoc);
  	factName = "BidirectionalityRule";
  }


  /**
   * This methods comments bidirectionality rule
   */
  // line 191 "../../../../src/AlloyFact.ump"
   private String commentBidirectionality(){
    return "\n\n-- Defines bidirectionality rule between class "+
  		firstClassName+" and class "+secondClassName+"\n";
  }


  /**
   * This method computes the content of a bidirectionality rule
   */
  // line 198 "../../../../src/AlloyFact.ump"
   private String bidirectionalContent(){
    return makeVarName(firstClassName,1)+" in "+rName1+"["+
  	  makeVarName(secondClassName,1)+"] <=> "+makeVarName(secondClassName,1)+" in "+rName2+
  		"["+makeVarName(firstClassName,1)+"]";
  }


  /**
   * This method is responsible for printing bidirectionality fact
   */
  // line 205 "../../../../src/AlloyFact.ump"
   private String printBidirectionFact(){
    return factHeader()+"all "+makeVarDeclaration(firstClassName,1)+", "+
  		makeVarDeclaration(secondClassName,1)+suchThatPlusNewLine() +bidirectionalContent()+"\n}";
  }

  // line 211 "../../../../src/AlloyFact.ump"
   public String print(){
    return commentBidirectionality()+printBidirectionFact();
  }

}