/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

// line 38 "../../../../../UmpleTLTemplates/Attributes.ump"
public abstract class AbstractGenConstraint extends GenBody
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AbstractGenConstraint Attributes
  private String baseContent;
  private boolean invert;

  //AbstractGenConstraint Associations
  private GenMethod method;
  private List<GenConstraintVariable> variables;
  private List<GenConstraintCondition> conditions;
  private List<GenConstraintVariable> listeners;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AbstractGenConstraint(String aBody)
  {
    super(aBody);
    baseContent = "";
    invert = true;
    variables = new ArrayList<GenConstraintVariable>();
    conditions = new ArrayList<GenConstraintCondition>();
    listeners = new ArrayList<GenConstraintVariable>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setBaseContent(String aBaseContent)
  {
    boolean wasSet = false;
    baseContent = aBaseContent;
    wasSet = true;
    return wasSet;
  }

  public boolean setInvert(boolean aInvert)
  {
    boolean wasSet = false;
    invert = aInvert;
    wasSet = true;
    return wasSet;
  }

  public String getBaseContent()
  {
    return baseContent;
  }

  public boolean getInvert()
  {
    return invert;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isInvert()
  {
    return invert;
  }
  /* Code from template association_GetOne */
  public GenMethod getMethod()
  {
    return method;
  }

  public boolean hasMethod()
  {
    boolean has = method != null;
    return has;
  }
  /* Code from template association_GetMany */
  public GenConstraintVariable getVariable(int index)
  {
    GenConstraintVariable aVariable = variables.get(index);
    return aVariable;
  }

  public List<GenConstraintVariable> getVariables()
  {
    List<GenConstraintVariable> newVariables = Collections.unmodifiableList(variables);
    return newVariables;
  }

  public int numberOfVariables()
  {
    int number = variables.size();
    return number;
  }

  public boolean hasVariables()
  {
    boolean has = variables.size() > 0;
    return has;
  }

  public int indexOfVariable(GenConstraintVariable aVariable)
  {
    int index = variables.indexOf(aVariable);
    return index;
  }
  /* Code from template association_GetMany */
  public GenConstraintCondition getCondition(int index)
  {
    GenConstraintCondition aCondition = conditions.get(index);
    return aCondition;
  }

  public List<GenConstraintCondition> getConditions()
  {
    List<GenConstraintCondition> newConditions = Collections.unmodifiableList(conditions);
    return newConditions;
  }

  public int numberOfConditions()
  {
    int number = conditions.size();
    return number;
  }

  public boolean hasConditions()
  {
    boolean has = conditions.size() > 0;
    return has;
  }

  public int indexOfCondition(GenConstraintCondition aCondition)
  {
    int index = conditions.indexOf(aCondition);
    return index;
  }
  /* Code from template association_GetMany */
  public GenConstraintVariable getListener(int index)
  {
    GenConstraintVariable aListener = listeners.get(index);
    return aListener;
  }

  public List<GenConstraintVariable> getListeners()
  {
    List<GenConstraintVariable> newListeners = Collections.unmodifiableList(listeners);
    return newListeners;
  }

  public int numberOfListeners()
  {
    int number = listeners.size();
    return number;
  }

  public boolean hasListeners()
  {
    boolean has = listeners.size() > 0;
    return has;
  }

  public int indexOfListener(GenConstraintVariable aListener)
  {
    int index = listeners.indexOf(aListener);
    return index;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setMethod(GenMethod aMethod)
  {
    boolean wasSet = false;
    GenMethod existingMethod = method;
    method = aMethod;
    if (existingMethod != null && !existingMethod.equals(aMethod))
    {
      existingMethod.removeConstraint(this);
    }
    if (aMethod != null)
    {
      aMethod.addConstraint(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfVariables()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addVariable(GenConstraintVariable aVariable)
  {
    boolean wasAdded = false;
    if (variables.contains(aVariable)) { return false; }
    AbstractGenConstraint existingConstraint = aVariable.getConstraint();
    if (existingConstraint == null)
    {
      aVariable.setConstraint(this);
    }
    else if (!this.equals(existingConstraint))
    {
      existingConstraint.removeVariable(aVariable);
      addVariable(aVariable);
    }
    else
    {
      variables.add(aVariable);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeVariable(GenConstraintVariable aVariable)
  {
    boolean wasRemoved = false;
    if (variables.contains(aVariable))
    {
      variables.remove(aVariable);
      aVariable.setConstraint(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addVariableAt(GenConstraintVariable aVariable, int index)
  {  
    boolean wasAdded = false;
    if(addVariable(aVariable))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVariables()) { index = numberOfVariables() - 1; }
      variables.remove(aVariable);
      variables.add(index, aVariable);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveVariableAt(GenConstraintVariable aVariable, int index)
  {
    boolean wasAdded = false;
    if(variables.contains(aVariable))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVariables()) { index = numberOfVariables() - 1; }
      variables.remove(aVariable);
      variables.add(index, aVariable);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addVariableAt(aVariable, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfConditions()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addCondition(GenConstraintCondition aCondition)
  {
    boolean wasAdded = false;
    if (conditions.contains(aCondition)) { return false; }
    AbstractGenConstraint existingConstraint = aCondition.getConstraint();
    if (existingConstraint == null)
    {
      aCondition.setConstraint(this);
    }
    else if (!this.equals(existingConstraint))
    {
      existingConstraint.removeCondition(aCondition);
      addCondition(aCondition);
    }
    else
    {
      conditions.add(aCondition);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCondition(GenConstraintCondition aCondition)
  {
    boolean wasRemoved = false;
    if (conditions.contains(aCondition))
    {
      conditions.remove(aCondition);
      aCondition.setConstraint(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addConditionAt(GenConstraintCondition aCondition, int index)
  {  
    boolean wasAdded = false;
    if(addCondition(aCondition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConditions()) { index = numberOfConditions() - 1; }
      conditions.remove(aCondition);
      conditions.add(index, aCondition);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveConditionAt(GenConstraintCondition aCondition, int index)
  {
    boolean wasAdded = false;
    if(conditions.contains(aCondition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConditions()) { index = numberOfConditions() - 1; }
      conditions.remove(aCondition);
      conditions.add(index, aCondition);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addConditionAt(aCondition, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfListeners()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addListener(GenConstraintVariable aListener)
  {
    boolean wasAdded = false;
    if (listeners.contains(aListener)) { return false; }
    AbstractGenConstraint existingListenerOwner = aListener.getListenerOwner();
    if (existingListenerOwner == null)
    {
      aListener.setListenerOwner(this);
    }
    else if (!this.equals(existingListenerOwner))
    {
      existingListenerOwner.removeListener(aListener);
      addListener(aListener);
    }
    else
    {
      listeners.add(aListener);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeListener(GenConstraintVariable aListener)
  {
    boolean wasRemoved = false;
    if (listeners.contains(aListener))
    {
      listeners.remove(aListener);
      aListener.setListenerOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addListenerAt(GenConstraintVariable aListener, int index)
  {  
    boolean wasAdded = false;
    if(addListener(aListener))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfListeners()) { index = numberOfListeners() - 1; }
      listeners.remove(aListener);
      listeners.add(index, aListener);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveListenerAt(GenConstraintVariable aListener, int index)
  {
    boolean wasAdded = false;
    if(listeners.contains(aListener))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfListeners()) { index = numberOfListeners() - 1; }
      listeners.remove(aListener);
      listeners.add(index, aListener);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addListenerAt(aListener, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    if (method != null)
    {
      GenMethod placeholderMethod = method;
      this.method = null;
      placeholderMethod.removeConstraint(this);
    }
    while( !variables.isEmpty() )
    {
      variables.get(0).setConstraint(null);
    }
    while( !conditions.isEmpty() )
    {
      conditions.get(0).setConstraint(null);
    }
    while( !listeners.isEmpty() )
    {
      listeners.get(0).setListenerOwner(null);
    }
    super.delete();
  }

  // line 44 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String constraintCheckCall(){
    return null;
  }

  // line 49 "../../../../../UmpleTLTemplates/Attributes.ump"
  public Boolean isMany(){
    boolean isMany= false;
		int number= numberOfVariables();
		if(number>1){
			isMany= true;
		}else if(number == 1){
			isMany= getVariable(0).isPlural();
		}
		
		return isMany;
  }

  // line 61 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String variableString(){
    String string = "";
		int numberOfVariables = numberOfVariables();
		if(numberOfVariables== 2){	//s1 and s2; not s1, and s2
			GenConstraintVariable var1 = getVariable(0);
			GenConstraintVariable var2 = getVariable(1);
			string += var1.getName()+ " and " + var2.getName();
		}else{
			for (int index = 0; index < numberOfVariables; index++) {
				GenConstraintVariable variable = getVariable(index);
				if (!string.isEmpty()) {
					if (index == numberOfVariables - 1) {
						string += ", and ";
					} else {
						string += ", ";
					}
				}
				string += variable.getName();
			}
		}
		
		return string;
  }

  // line 85 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String conditionString(){
    String string = "";
		for (GenConstraintCondition condition : conditions) {
			String conditionString = condition.getString();
			String operator = condition.getOperator();
			String prefix = "";

			if (!string.isEmpty()) {
				switch (operator) {
				case GenConstraintOperators.AND:
					prefix = " && ";
					break;
				case GenConstraintOperators.OR:
					prefix = " || ";
					break;
				default:
					break;
				}
			}

			string += prefix + conditionString;
		}
		return string;
  }

  // line 110 "../../../../../UmpleTLTemplates/Attributes.ump"
  public void dynamicContent(List<GenBody> bodies){
    GenBody genBody = new GenBody(constraintCheckCall());
	    genBody.setPriority(getPriority());
		bodies.add(genBody);
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _indent(Integer numSpaces, StringBuilder sb, String content){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(content);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String indent(String content){
        StringBuilder sb = new StringBuilder();
    return this._indent(0,sb,content).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "baseContent" + ":" + getBaseContent()+ "," +
            "invert" + ":" + getInvert()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "method = "+(getMethod()!=null?Integer.toHexString(System.identityHashCode(getMethod())):"null");
  }
}