/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;

// line 247 "../../../../src/AlloyFact.ump"
public class AssociationFact extends Fact
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociationFact Attributes
  private String fMult;
  private String sMult;

  //AssociationFact Associations
  private Utility utility;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AssociationFact(String aFMult, String aSMult, Utility aUtility)
  {
    super();
    fMult = aFMult;
    sMult = aSMult;
    if (!setUtility(aUtility))
    {
      throw new RuntimeException("Unable to create AssociationFact due to aUtility. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setFMult(String aFMult)
  {
    boolean wasSet = false;
    fMult = aFMult;
    wasSet = true;
    return wasSet;
  }

  public boolean setSMult(String aSMult)
  {
    boolean wasSet = false;
    sMult = aSMult;
    wasSet = true;
    return wasSet;
  }

  public String getFMult()
  {
    return fMult;
  }

  public String getSMult()
  {
    return sMult;
  }
  /* Code from template association_GetOne */
  public Utility getUtility()
  {
    return utility;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setUtility(Utility aNewUtility)
  {
    boolean wasSet = false;
    if (aNewUtility != null)
    {
      utility = aNewUtility;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    utility = null;
    super.delete();
  }

  // line 257 "../../../../src/AlloyFact.ump"
   public  AssociationFact(Association assoc){
    super(assoc);
  	factName = "AssociationFact";
  	utility = new Utility();
  	fMult = utility.getAlloyMultiplicity(assoc.getEnd(0));
  	sMult = utility.getAlloyMultiplicity(assoc.getEnd(1));
  	if(assoc.isIsLeftNavigable())
  	{
  	  String temp = fMult;
  	  fMult = sMult;
  	  sMult = fMult;
  	  temp = firstClassName;
      firstClassName = secondClassName;
      secondClassName = temp;
      temp = rName1;
      rName1 = rName2;
      rName2 = temp;
  	}
  }

  // line 278 "../../../../src/AlloyFact.ump"
   private String comment(){
    return "\n\n-- Defines constraints on association between "+ firstClassName +" and "+secondClassName;
  }

  // line 283 "../../../../src/AlloyFact.ump"
   private String getAssociationFact(){
    return "\n"+factHeader() +firstClassName+" <: "+rName2+" in ("+firstClassName+") "+
  	  fMult+" -> "+ sMult + " ("+secondClassName+")\n}";
  }

  // line 289 "../../../../src/AlloyFact.ump"
   public String print(){
    return comment() + getAssociationFact();
  }


  public String toString()
  {
    return super.toString() + "["+
            "fMult" + ":" + getFMult()+ "," +
            "sMult" + ":" + getSMult()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "utility = "+(getUtility()!=null?Integer.toHexString(System.identityHashCode(getUtility())):"null");
  }
}