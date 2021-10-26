/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * TraceConstraint objects ensure that the attribute being traced will be treated as a parameter and not a member variable
 */
// line 291 "../../../../src/Umple_CodeConstraint.ump"
// line 393 "../../../../src/Umple.ump"
public class TraceConstraint
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TraceConstraint Associations
  private List<UmpleVariable> variables;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TraceConstraint()
  {
    variables = new ArrayList<UmpleVariable>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public UmpleVariable getVariable(int index)
  {
    UmpleVariable aVariable = variables.get(index);
    return aVariable;
  }

  public List<UmpleVariable> getVariables()
  {
    List<UmpleVariable> newVariables = Collections.unmodifiableList(variables);
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

  public int indexOfVariable(UmpleVariable aVariable)
  {
    int index = variables.indexOf(aVariable);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfVariables()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addVariable(UmpleVariable aVariable)
  {
    boolean wasAdded = false;
    if (variables.contains(aVariable)) { return false; }
    variables.add(aVariable);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeVariable(UmpleVariable aVariable)
  {
    boolean wasRemoved = false;
    if (variables.contains(aVariable))
    {
      variables.remove(aVariable);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addVariableAt(UmpleVariable aVariable, int index)
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

  public boolean addOrMoveVariableAt(UmpleVariable aVariable, int index)
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

  public void delete()
  {
    variables.clear();
  }

  // line 295 "../../../../src/Umple_CodeConstraint.ump"
  public ConstraintTree createNew(){
    TraceConstraint constraint =  new TraceConstraint();
    for(UmpleVariable uv:this.getVariables())
    {
      constraint.addVariable(uv);
    }
    return constraint;
  }

  // line 305 "../../../../src/Umple_CodeConstraint.ump"
   public ConstraintVariable addElement(ConstraintVariable aElement){
    if(aElement instanceof ConstraintUnassignedName)
    {
      ConstraintUnassignedName variable = (ConstraintUnassignedName)aElement;
      MethodParameter foundParameter = null;
      for(UmpleVariable uv:getVariables())
      {
        if(uv.getName().equals(variable.getValue()))
        {
          foundParameter = new MethodParameter(uv.getName(),uv.getType(),uv.getModifier(),uv.getValue(),false);
        }
      }
      if(foundParameter!=null)
      {
        aElement = new ConstraintMethodParameter(foundParameter);
      }
    }
    return super.addElement(aElement);
  }

}