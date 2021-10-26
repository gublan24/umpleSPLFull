/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;

// line 19 "../../../../src/AlloyMetaModel.ump"
public class Function
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Function Attributes
  private String beginEndRoleName;
  private String targetMult;
  private String targetClassName;

  //Function Associations
  private Utility utility;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Function(String aBeginEndRoleName, String aTargetMult, String aTargetClassName, Utility aUtility)
  {
    beginEndRoleName = aBeginEndRoleName;
    targetMult = aTargetMult;
    targetClassName = aTargetClassName;
    if (!setUtility(aUtility))
    {
      throw new RuntimeException("Unable to create Function due to aUtility. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setBeginEndRoleName(String aBeginEndRoleName)
  {
    boolean wasSet = false;
    beginEndRoleName = aBeginEndRoleName;
    wasSet = true;
    return wasSet;
  }

  public boolean setTargetMult(String aTargetMult)
  {
    boolean wasSet = false;
    targetMult = aTargetMult;
    wasSet = true;
    return wasSet;
  }

  public boolean setTargetClassName(String aTargetClassName)
  {
    boolean wasSet = false;
    targetClassName = aTargetClassName;
    wasSet = true;
    return wasSet;
  }

  public String getBeginEndRoleName()
  {
    return beginEndRoleName;
  }

  public String getTargetMult()
  {
    return targetMult;
  }

  public String getTargetClassName()
  {
    return targetClassName;
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
  }

  // line 30 "../../../../src/AlloyMetaModel.ump"
   public  Function(Association assoc){
    utility =  new Utility();
	beginEndRoleName = assoc.getEnd(1).getRoleName();	
	if(assoc.getEnd(1).getRoleName().equals("as"))
	{
      beginEndRoleName = assoc.getEnd(1).getRoleName()+ "_";  
    }
	targetMult = utility.getAlloyMultiplicity(utility.getRightEnd(assoc));
	targetClassName = utility.getRightEndName(assoc);
  }

  // line 42 "../../../../src/AlloyMetaModel.ump"
   public  Function(Attribute attr){
    beginEndRoleName = attr.getName();
    if(attr.getIsList())
      targetMult = "set";
    else
      targetMult = "";
    if(attr.getType().equals("Integer") || attr.getType().equals("Double") || attr.getType().equals("Float"))
      targetClassName = "Int";
    else if(attr.getType().equals("String") || attr.getType().equals("")
    	|| attr.getType().equals("Date") || attr.getType().equals("Time"))
      targetClassName = "String";
    else 
    	targetClassName = attr.getType();
  }


  /**
   * Reflexive relation
   */
  // line 59 "../../../../src/AlloyMetaModel.ump"
   public  Function(Association assoc, String cName){
    utility =  new Utility();
	beginEndRoleName = assoc.getEnd(0).getRoleName();
	if(assoc.getEnd(0).getRoleName().equals("as")){
      beginEndRoleName = assoc.getEnd(0).getRoleName()+ "_";  
    }
	targetMult = utility.getAlloyMultiplicity(utility.getLeftEnd(assoc));
	targetClassName = cName;
  }

  // line 69 "../../../../src/AlloyMetaModel.ump"
   public String printFunction(){
    if(targetMult.equals(""))
	  return "  "+beginEndRoleName+" : "+targetClassName;
	return "  "+beginEndRoleName+" : "+targetMult+" "+targetClassName;
  }


  public String toString()
  {
    return super.toString() + "["+
            "beginEndRoleName" + ":" + getBeginEndRoleName()+ "," +
            "targetMult" + ":" + getTargetMult()+ "," +
            "targetClassName" + ":" + getTargetClassName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "utility = "+(getUtility()!=null?Integer.toHexString(System.identityHashCode(getUtility())):"null");
  }
}