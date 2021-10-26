/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 458 "../../../../src/NuSMVMetamodel.ump"
public class AssignConstraint extends ModuleElement
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "   -- This part defines logic for the assignment of values to state variable \"";
  public static final String TEXT_1 = "\" of this NuSMV module --" + NL + "  ";
  public static final String TEXT_2 = " ";
  public static final String TEXT_3 = "";
  public static final String TEXT_4 = "";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssignConstraint Associations
  private List<Assign> assigns;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AssignConstraint(Assign... allAssigns)
  {
    super();
    assigns = new ArrayList<Assign>();
    boolean didAddAssigns = setAssigns(allAssigns);
    if (!didAddAssigns)
    {
      throw new RuntimeException("Unable to create AssignConstraint, must have at least 1 assigns. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    // line 461 "../../../../src/NuSMVMetamodel.ump"
    setHeader("ASSIGN");
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Assign getAssign(int index)
  {
    Assign aAssign = assigns.get(index);
    return aAssign;
  }

  /**
   * Association Definition
   */
  public List<Assign> getAssigns()
  {
    List<Assign> newAssigns = Collections.unmodifiableList(assigns);
    return newAssigns;
  }

  public int numberOfAssigns()
  {
    int number = assigns.size();
    return number;
  }

  public boolean hasAssigns()
  {
    boolean has = assigns.size() > 0;
    return has;
  }

  public int indexOfAssign(Assign aAssign)
  {
    int index = assigns.indexOf(aAssign);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAssigns()
  {
    return 1;
  }
  /* Code from template association_AddUnidirectionalMStar */
  public boolean addAssign(Assign aAssign)
  {
    boolean wasAdded = false;
    if (assigns.contains(aAssign)) { return false; }
    assigns.add(aAssign);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAssign(Assign aAssign)
  {
    boolean wasRemoved = false;
    if (!assigns.contains(aAssign))
    {
      return wasRemoved;
    }

    if (numberOfAssigns() <= minimumNumberOfAssigns())
    {
      return wasRemoved;
    }

    assigns.remove(aAssign);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_SetUnidirectionalMStar */
  public boolean setAssigns(Assign... newAssigns)
  {
    boolean wasSet = false;
    ArrayList<Assign> verifiedAssigns = new ArrayList<Assign>();
    for (Assign aAssign : newAssigns)
    {
      if (verifiedAssigns.contains(aAssign))
      {
        continue;
      }
      verifiedAssigns.add(aAssign);
    }

    if (verifiedAssigns.size() != newAssigns.length || verifiedAssigns.size() < minimumNumberOfAssigns())
    {
      return wasSet;
    }

    assigns.clear();
    assigns.addAll(verifiedAssigns);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAssignAt(Assign aAssign, int index)
  {  
    boolean wasAdded = false;
    if(addAssign(aAssign))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssigns()) { index = numberOfAssigns() - 1; }
      assigns.remove(aAssign);
      assigns.add(index, aAssign);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAssignAt(Assign aAssign, int index)
  {
    boolean wasAdded = false;
    if(assigns.contains(aAssign))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssigns()) { index = numberOfAssigns() - 1; }
      assigns.remove(aAssign);
      assigns.add(index, aAssign);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAssignAt(aAssign, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    assigns.clear();
    super.delete();
  }

  // line 478 "../../../../src/NuSMVMetamodel.ump"
   private String getVarNames(){
    List<String> names = new ArrayList<String>();
		for( Assign assign : assigns ) {
			if(! has( names, assign.getIdentifier()))
				names.add(assign.getIdentifier());
		}		

		if( names.size() == 1)
			return names.get(0);
		String temp = "";
		int i = 0;
		while( i < names.size() - 1 ){
			temp += names.get(i) +", ";
			i++;
		}
		temp += names.get(i);
		return temp;
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _toString(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(getVarNames());
    realSb.append(TEXT_1);
    realSb.append(TEXT_2);
    realSb.append(getHeader());
    realSb.append(TEXT_3);
    for(Assign assign : assigns){
    realSb.append(assign.toString());
    realSb.append(TEXT_4);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String toString(){
        StringBuilder sb = new StringBuilder();
    return this._toString(0,sb).toString(); 
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 466 "../../../../src/NuSMVMetamodel.ump"
  private <E> boolean has ( List<E> objectList, E whatToFind ) 
  {
    boolean yes = false;
  		for(E st : objectList) {
  			if( st.equals(whatToFind) ) {
  				yes = true;
  				break;
  			}
  		}
  		return yes;
  }

  
}