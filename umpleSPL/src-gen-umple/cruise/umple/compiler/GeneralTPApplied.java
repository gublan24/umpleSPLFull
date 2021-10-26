/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * This class is used to assign parameters in classes and traits.
 */
// line 370 "../../../../src/Umple_Code_Trait.ump"
// line 837 "../../../../src/Umple.ump"
public class GeneralTPApplied
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GeneralTPApplied Attributes
  private Map<String,String> parameterMapping;
  private String inheritanceName;
  private List<String> parameters;

  //GeneralTPApplied Associations
  private Position positions;
  private List<MethodTemplateSignature> methodTemplateSignatures;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GeneralTPApplied(String aInheritanceName)
  {
    parameterMapping = new HashMap<String,String>();
    inheritanceName = aInheritanceName;
    parameters = new ArrayList<String>();
    methodTemplateSignatures = new ArrayList<MethodTemplateSignature>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setParameterMapping(Map<String,String> aParameterMapping)
  {
    boolean wasSet = false;
    parameterMapping = aParameterMapping;
    wasSet = true;
    return wasSet;
  }

  public boolean setInheritanceName(String aInheritanceName)
  {
    boolean wasSet = false;
    inheritanceName = aInheritanceName;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addParameter(String aParameter)
  {
    boolean wasAdded = false;
    wasAdded = parameters.add(aParameter);
    return wasAdded;
  }

  public boolean removeParameter(String aParameter)
  {
    boolean wasRemoved = false;
    wasRemoved = parameters.remove(aParameter);
    return wasRemoved;
  }

  public Map<String,String> getParameterMapping()
  {
    return parameterMapping;
  }

  public String getInheritanceName()
  {
    return inheritanceName;
  }
  /* Code from template attribute_GetMany */
  public String getParameter(int index)
  {
    String aParameter = parameters.get(index);
    return aParameter;
  }

  public String[] getParameters()
  {
    String[] newParameters = parameters.toArray(new String[parameters.size()]);
    return newParameters;
  }

  public int numberOfParameters()
  {
    int number = parameters.size();
    return number;
  }

  public boolean hasParameters()
  {
    boolean has = parameters.size() > 0;
    return has;
  }

  public int indexOfParameter(String aParameter)
  {
    int index = parameters.indexOf(aParameter);
    return index;
  }
  /* Code from template association_GetOne */
  public Position getPositions()
  {
    return positions;
  }

  public boolean hasPositions()
  {
    boolean has = positions != null;
    return has;
  }
  /* Code from template association_GetMany */
  public MethodTemplateSignature getMethodTemplateSignature(int index)
  {
    MethodTemplateSignature aMethodTemplateSignature = methodTemplateSignatures.get(index);
    return aMethodTemplateSignature;
  }

  public List<MethodTemplateSignature> getMethodTemplateSignatures()
  {
    List<MethodTemplateSignature> newMethodTemplateSignatures = Collections.unmodifiableList(methodTemplateSignatures);
    return newMethodTemplateSignatures;
  }

  public int numberOfMethodTemplateSignatures()
  {
    int number = methodTemplateSignatures.size();
    return number;
  }

  public boolean hasMethodTemplateSignatures()
  {
    boolean has = methodTemplateSignatures.size() > 0;
    return has;
  }

  public int indexOfMethodTemplateSignature(MethodTemplateSignature aMethodTemplateSignature)
  {
    int index = methodTemplateSignatures.indexOf(aMethodTemplateSignature);
    return index;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setPositions(Position aNewPositions)
  {
    boolean wasSet = false;
    positions = aNewPositions;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMethodTemplateSignatures()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addMethodTemplateSignature(MethodTemplateSignature aMethodTemplateSignature)
  {
    boolean wasAdded = false;
    if (methodTemplateSignatures.contains(aMethodTemplateSignature)) { return false; }
    methodTemplateSignatures.add(aMethodTemplateSignature);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMethodTemplateSignature(MethodTemplateSignature aMethodTemplateSignature)
  {
    boolean wasRemoved = false;
    if (methodTemplateSignatures.contains(aMethodTemplateSignature))
    {
      methodTemplateSignatures.remove(aMethodTemplateSignature);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMethodTemplateSignatureAt(MethodTemplateSignature aMethodTemplateSignature, int index)
  {  
    boolean wasAdded = false;
    if(addMethodTemplateSignature(aMethodTemplateSignature))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMethodTemplateSignatures()) { index = numberOfMethodTemplateSignatures() - 1; }
      methodTemplateSignatures.remove(aMethodTemplateSignature);
      methodTemplateSignatures.add(index, aMethodTemplateSignature);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMethodTemplateSignatureAt(MethodTemplateSignature aMethodTemplateSignature, int index)
  {
    boolean wasAdded = false;
    if(methodTemplateSignatures.contains(aMethodTemplateSignature))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMethodTemplateSignatures()) { index = numberOfMethodTemplateSignatures() - 1; }
      methodTemplateSignatures.remove(aMethodTemplateSignature);
      methodTemplateSignatures.add(index, aMethodTemplateSignature);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMethodTemplateSignatureAt(aMethodTemplateSignature, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    positions = null;
    methodTemplateSignatures.clear();
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 376 "../../../../src/Umple_Code_Trait.ump"
   private void ApplyTypeParametersToMethod(Method newMethod){
    for (String strType : this.getParameterMapping().keySet()) {
		String newName = this.getParameterMapping().get(strType);
		if (newMethod.getType().equals(strType)){
			newMethod.setType(newName);
		}
		for (int i = 0; i < newMethod.numberOfMethodParameters(); i++) {
            if(newMethod.getMethodParameter(i).getType().equals(strType)){
            	newMethod.getMethodParameter(i).setType(newName);
            }
	    }
	}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 392 "../../../../src/Umple_Code_Trait.ump"
   public  GeneralTPApplied(GeneralTPApplied another){
    if (another == null) return;
    this.parameterMapping = new HashMap<String, String>(another.parameterMapping);
    this.inheritanceName = another.inheritanceName;
    positions = another.positions; 
    Label_StateMachine_29: ;

    parameters = new ArrayList<>( Arrays.asList(another.getParameters()));
    methodTemplateSignatures = new ArrayList<>(another.getMethodTemplateSignatures());
    Label_StateMachine_30: ;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 407 "../../../../src/Umple_Code_Trait.ump"
  public boolean hasMethodTemplateSignature(MethodTemplateSignature inMTSignature){
    for (MethodTemplateSignature mTSignature : getMethodTemplateSignatures()) {
			if (compareTwoMethdos(mTSignature.getMethod(),inMTSignature.getMethod())) return true;
		}
		return false;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 418 "../../../../src/Umple_Code_Trait.ump"
   public MethodTemplateSignature hasMethod(Method inMethod){
    for (MethodTemplateSignature mTSignature : getMethodTemplateSignatures()) {
    		Method newMethod = new Method(mTSignature.getMethod());
    		ApplyTypeParametersToMethod(newMethod);
			if (compareTwoMethdos(newMethod,inMethod)) return mTSignature;
		}
	return null;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 429 "../../../../src/Umple_Code_Trait.ump"
   private boolean compareTwoMethdos(Method method1, Method method2){
    if (method1.getName().equals(method2.getName())){
		 // if(method1.getType().equals(method2.getType())){
			  Integer numberOfParams = method1.getMethodParameters().size();
			  if ( numberOfParams== method2.getMethodParameters().size()) {
		          boolean allSame = true;
		          for (int i = 0; i < numberOfParams; i++)
		          {
		            if(!method1.getMethodParameter(i).getType().equals(method2.getMethodParameter(i).getType()))
		            {
		              allSame = false;
		              break;
		            }
		          }
		          if(allSame)
		          {
		            return true;
		          }
		     }
		 // }
      }
	  return false;
  }


  public String toString()
  {
    return super.toString() + "["+
            "inheritanceName" + ":" + getInheritanceName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parameterMapping" + "=" + (getParameterMapping() != null ? !getParameterMapping().equals(this)  ? getParameterMapping().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "positions = "+(getPositions()!=null?Integer.toHexString(System.identityHashCode(getPositions())):"null");
  }
}