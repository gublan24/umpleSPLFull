/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;

// line 3 "../../../../src/AlloyMetaModel.ump"
// line 3 "../../../../src/AlloyFact.ump"
public class AlloyObject
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AlloyObject()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 6 "../../../../src/AlloyMetaModel.ump"
   public String printObject(String cName){
    return "\nabstract sig "+cName+" { }\n";
  }

  // line 10 "../../../../src/AlloyMetaModel.ump"
   protected Association convertEndsToAssociation(AssociationEnd beginEnd, AssociationEnd endToOutput){
    AssociationEnd [] ends = new AssociationEnd[2];
     ends[0] = new AssociationEnd(beginEnd.getRoleName(),beginEnd.getClassName(),
					beginEnd.getModifier(),beginEnd.getReferenceToClassName(),beginEnd.getMultiplicity());
     ends[1] = new AssociationEnd(endToOutput.getRoleName(),endToOutput.getClassName(),
					endToOutput.getModifier(),endToOutput.getReferenceToClassName(),endToOutput.getMultiplicity());
     return new Association(true,true,false,false,ends);
  }

  // line 7 "../../../../src/AlloyFact.ump"
   protected String addStartDottedLine(){
    return "\n\n------------------------------------------------------------------------------------------------------------------\n\n";
  }

  // line 12 "../../../../src/AlloyFact.ump"
   protected String addEndDottedLine(){
    return "\n------------------------------------------------------------------------------------------------------------------\n\n";
  }

}