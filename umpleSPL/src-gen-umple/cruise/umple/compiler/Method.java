/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.stream.Collectors;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * 
 * This is for cloning
 * Note: This code doesn't cover deep cloning. It's a combination of  shallow and deep cloning
 * A method in an Umple class or interface
 * Umple Methods are coded by the programmer in the language(s) of their choice
 */
// line 7 "../../../../src/Umple_CodeMethod.ump"
// line 56 "../../../../src/Umple_CodeMethod.ump"
// line 164 "../../../../src/Umple.ump"
// line 71 "../../../../src/Trace_Code.ump"
public class Method
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Method Attributes
  private boolean isAbstract;
  private boolean isConstructor;
  private boolean isQueued;
  private String modifier;
  private String name;
  private List<String> exceptions;
  private Position position;
  private Position codePosition;
  private Position endPosition;
  private String type;
  private boolean isImplemented;
  private boolean wasGenerated;

  //Method State Machines
  public enum Source { none, fTrait, fAuto, fAutoAPI }
  private Source source;

  //Method Associations
  private List<MethodParameter> methodParameters;
  private MethodBody methodBody;
  private List<Comment> comments;
  private UmpleClass umpleClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Method(String aModifier, String aName, String aType, boolean aIsImplemented)
  {
    isAbstract = false;
    isConstructor = false;
    isQueued = false;
    modifier = aModifier;
    name = aName;
    exceptions = new ArrayList<String>();
    type = aType;
    isImplemented = aIsImplemented;
    wasGenerated = false;
    methodParameters = new ArrayList<MethodParameter>();
    comments = new ArrayList<Comment>();
    setSource(Source.none);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsAbstract(boolean aIsAbstract)
  {
    boolean wasSet = false;
    isAbstract = aIsAbstract;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsConstructor(boolean aIsConstructor)
  {
    boolean wasSet = false;
    isConstructor = aIsConstructor;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsQueued(boolean aIsQueued)
  {
    boolean wasSet = false;
    isQueued = aIsQueued;
    wasSet = true;
    return wasSet;
  }

  public boolean setModifier(String aModifier)
  {
    boolean wasSet = false;
    modifier = aModifier;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addException(String aException)
  {
    boolean wasAdded = false;
    wasAdded = exceptions.add(aException);
    return wasAdded;
  }

  public boolean removeException(String aException)
  {
    boolean wasRemoved = false;
    wasRemoved = exceptions.remove(aException);
    return wasRemoved;
  }

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setCodePosition(Position aCodePosition)
  {
    boolean wasSet = false;
    codePosition = aCodePosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setEndPosition(Position aEndPosition)
  {
    boolean wasSet = false;
    endPosition = aEndPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsImplemented(boolean aIsImplemented)
  {
    boolean wasSet = false;
    isImplemented = aIsImplemented;
    wasSet = true;
    return wasSet;
  }

  public boolean setWasGenerated(boolean aWasGenerated)
  {
    boolean wasSet = false;
    wasGenerated = aWasGenerated;
    wasSet = true;
    return wasSet;
  }

  /**
   * Specifies whether or not the Method is abstract.
   */
  public boolean getIsAbstract()
  {
    return isAbstract;
  }

  /**
   * Specifies whether this is a constructor for the Umple class.
   */
  public boolean getIsConstructor()
  {
    return isConstructor;
  }

  /**
   * Specifies whether or not the method is queued.
   */
  public boolean getIsQueued()
  {
    return isQueued;
  }

  /**
   * The modifier associated with the method.
   */
  public String getModifier()
  {
    return modifier;
  }

  /**
   * The name of the method.
   */
  public String getName()
  {
    return name;
  }
  /* Code from template attribute_GetMany */
  public String getException(int index)
  {
    String aException = exceptions.get(index);
    return aException;
  }

  public String[] getExceptions()
  {
    String[] newExceptions = exceptions.toArray(new String[exceptions.size()]);
    return newExceptions;
  }

  public int numberOfExceptions()
  {
    int number = exceptions.size();
    return number;
  }

  public boolean hasExceptions()
  {
    boolean has = exceptions.size() > 0;
    return has;
  }

  public int indexOfException(String aException)
  {
    int index = exceptions.indexOf(aException);
    return index;
  }

  public Position getPosition()
  {
    return position;
  }

  public Position getCodePosition()
  {
    return codePosition;
  }

  public Position getEndPosition()
  {
    return endPosition;
  }

  /**
   * The type of the method.
   */
  public String getType()
  {
    return type;
  }

  /**
   * Specifies whether or not the method is implemented.
   */
  public boolean getIsImplemented()
  {
    return isImplemented;
  }

  /**
   * Specifies, for fAutoAPI methods, if the method was generated
   */
  public boolean getWasGenerated()
  {
    return wasGenerated;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsAbstract()
  {
    return isAbstract;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsConstructor()
  {
    return isConstructor;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsQueued()
  {
    return isQueued;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsImplemented()
  {
    return isImplemented;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isWasGenerated()
  {
    return wasGenerated;
  }

  public String getSourceFullName()
  {
    String answer = source.toString();
    return answer;
  }

  public Source getSource()
  {
    return source;
  }

  public boolean setSource(Source aSource)
  {
    source = aSource;
    return true;
  }
  /* Code from template association_GetMany */
  public MethodParameter getMethodParameter(int index)
  {
    MethodParameter aMethodParameter = methodParameters.get(index);
    return aMethodParameter;
  }

  /**
   * The method parameters.
   */
  public List<MethodParameter> getMethodParameters()
  {
    List<MethodParameter> newMethodParameters = Collections.unmodifiableList(methodParameters);
    return newMethodParameters;
  }

  public int numberOfMethodParameters()
  {
    int number = methodParameters.size();
    return number;
  }

  public boolean hasMethodParameters()
  {
    boolean has = methodParameters.size() > 0;
    return has;
  }

  public int indexOfMethodParameter(MethodParameter aMethodParameter)
  {
    int index = methodParameters.indexOf(aMethodParameter);
    return index;
  }
  /* Code from template association_GetOne */
  public MethodBody getMethodBody()
  {
    return methodBody;
  }

  public boolean hasMethodBody()
  {
    boolean has = methodBody != null;
    return has;
  }
  /* Code from template association_GetMany */
  public Comment getComment(int index)
  {
    Comment aComment = comments.get(index);
    return aComment;
  }

  /**
   * The comments associated with the method (such as the Javadoc above it).
   */
  public List<Comment> getComments()
  {
    List<Comment> newComments = Collections.unmodifiableList(comments);
    return newComments;
  }

  public int numberOfComments()
  {
    int number = comments.size();
    return number;
  }

  public boolean hasComments()
  {
    boolean has = comments.size() > 0;
    return has;
  }

  public int indexOfComment(Comment aComment)
  {
    int index = comments.indexOf(aComment);
    return index;
  }
  /* Code from template association_GetOne */
  public UmpleClass getUmpleClass()
  {
    return umpleClass;
  }

  public boolean hasUmpleClass()
  {
    boolean has = umpleClass != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMethodParameters()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addMethodParameter(MethodParameter aMethodParameter)
  {
    boolean wasAdded = false;
    if (methodParameters.contains(aMethodParameter)) { return false; }
    methodParameters.add(aMethodParameter);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMethodParameter(MethodParameter aMethodParameter)
  {
    boolean wasRemoved = false;
    if (methodParameters.contains(aMethodParameter))
    {
      methodParameters.remove(aMethodParameter);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMethodParameterAt(MethodParameter aMethodParameter, int index)
  {  
    boolean wasAdded = false;
    if(addMethodParameter(aMethodParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMethodParameters()) { index = numberOfMethodParameters() - 1; }
      methodParameters.remove(aMethodParameter);
      methodParameters.add(index, aMethodParameter);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMethodParameterAt(MethodParameter aMethodParameter, int index)
  {
    boolean wasAdded = false;
    if(methodParameters.contains(aMethodParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMethodParameters()) { index = numberOfMethodParameters() - 1; }
      methodParameters.remove(aMethodParameter);
      methodParameters.add(index, aMethodParameter);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMethodParameterAt(aMethodParameter, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setMethodBody(MethodBody aNewMethodBody)
  {
    boolean wasSet = false;
    methodBody = aNewMethodBody;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfComments()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addComment(Comment aComment)
  {
    boolean wasAdded = false;
    if (comments.contains(aComment)) { return false; }
    comments.add(aComment);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeComment(Comment aComment)
  {
    boolean wasRemoved = false;
    if (comments.contains(aComment))
    {
      comments.remove(aComment);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCommentAt(Comment aComment, int index)
  {  
    boolean wasAdded = false;
    if(addComment(aComment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfComments()) { index = numberOfComments() - 1; }
      comments.remove(aComment);
      comments.add(index, aComment);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCommentAt(Comment aComment, int index)
  {
    boolean wasAdded = false;
    if(comments.contains(aComment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfComments()) { index = numberOfComments() - 1; }
      comments.remove(aComment);
      comments.add(index, aComment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCommentAt(aComment, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasSet = false;
    UmpleClass existingUmpleClass = umpleClass;
    umpleClass = aUmpleClass;
    if (existingUmpleClass != null && !existingUmpleClass.equals(aUmpleClass))
    {
      existingUmpleClass.removeStateDependentMethod(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addStateDependentMethod(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    methodParameters.clear();
    methodBody = null;
    comments.clear();
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removeStateDependentMethod(this);
    }
  }


  /**
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ----------------------------------------------------------------------------
   */
  // line 12 "../../../../src/Umple_CodeMethod.ump"
  public void setMethodParameters(List<MethodParameter> parameters){
    methodParameters = parameters;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 18 "../../../../src/Umple_CodeMethod.ump"
  public String getSignature(){
    String result = getType()+" "+getName()+"(";
 			for(MethodParameter p : getMethodParameters()){
	 			result=result+p.getType()+",";
 			} 	
 			
 			if (result.endsWith(",") )result =result.substring(0, result.length()-1); 
 			result=result+")";
 		  return result;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 31 "../../../../src/Umple_CodeMethod.ump"
  public boolean compareWithTheMethod(Method inMethod){
    if (getName().equals(inMethod.getName())){
		  if(getType().equals(inMethod.getType())){
			  Integer numberOfParams = getMethodParameters().size();
			  if ( numberOfParams== inMethod.getMethodParameters().size()) {
		          boolean allSame = true;
		          for (int i = 0; i < numberOfParams; i++)
		          {
		            if(!getMethodParameter(i).getType().equals(inMethod.getMethodParameter(i).getType()))
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
		  }  
      }
	  return false;
  }


  /**
   * 
   * This is for cloning
   * Note: This code doesn't cover deep cloning. It's a combination of  shallow and deep cloning
   */
  // line 63 "../../../../src/Umple_CodeMethod.ump"
   public  Method(Method another){
    this.isAbstract = another.getIsAbstract();
	  this.modifier = another.getModifier();
	  this.name = another.getName() ;
	  this.position = another.getPosition();
	  this.codePosition = another.getCodePosition();
	  this.endPosition = another.getEndPosition();
	  this.type = another.getType();
	  this.isImplemented = another.getIsImplemented();
	  this.methodParameters = new ArrayList<MethodParameter>();
          this.exceptions = new ArrayList<String>();
	  for (MethodParameter mParameter : another.getMethodParameters()) {
		  this.methodParameters.add(new MethodParameter(mParameter));
	  }
          for (String exception:exceptions)
          {
            this.addException(exception);
          }
	  if (another.getMethodBody()!=null){
		  this.methodBody = new MethodBody(another.getMethodBody());
	  } else{
		  this.methodBody = another.getMethodBody();
	  }
	  this. comments = another.getComments();
  }

  // line 90 "../../../../src/Umple_CodeMethod.ump"
   public boolean getExistsInLanguage(String lang){
    if (!hasMethodBody()){
      return false;
    }
    CodeBlock codeBlock = getMethodBody().getCodeblock();
    // Check if another language other than 'lang' is associated with the codeblock
    if (codeBlock.hasAnAssociatedLanguage() && !codeBlock.hasCode(lang)){
      return false;
    }
    return true;
  }

  // line 102 "../../../../src/Umple_CodeMethod.ump"
   public String toString(){
    StringBuffer methodBuffer = new StringBuffer();
    methodBuffer.append(" " + this.getType()+ " " + this.getName());
    methodBuffer.append("(");
    String paramName="";
    String paramType="";
    String aSingleParameter="";
    String isList="";
    String parameters = "";
    String finalParams= "";
    if (this.hasMethodParameters()){
      for (MethodParameter aMethodParam : this.getMethodParameters())
      {
        paramName = aMethodParam.getName();
        paramType = aMethodParam.getType();
        isList = aMethodParam.getIsList() ? " [] " : " ";
        aSingleParameter = paramType + isList + paramName;
        parameters += aSingleParameter + ",";
      }
      finalParams = parameters.substring(0, parameters.length()-1);
      methodBuffer.append(finalParams);
    }
    methodBuffer.append(")");
    methodBuffer.append("  {");
    methodBuffer.append(System.getProperty("line.separator"));
    methodBuffer.append(    this.getMethodBody().getExtraCode());
    methodBuffer.append(System.getProperty("line.separator"));
    methodBuffer.append("  }");
    return methodBuffer.toString();
  }

  // line 135 "../../../../src/Umple_CodeMethod.ump"
   public boolean equals(Object o){
    if (o == this) return true;
    if (!(o instanceof Method)) return false;
    
    Method comparedMethod = (Method) o;
    
    String methodName = comparedMethod.getName();
    String methodType = comparedMethod.getType();
    int numberOfParams = comparedMethod.getMethodParameters().size();
    
    if (comparedMethod.isIsConstructor()) return comparedMethod == this;
    
    if (this.getName().equals(methodName))
    {
	  if (numberOfParams == this.getMethodParameters().size())
	  {
	    boolean allSame = true;
	    for (int i = 0; i < numberOfParams; i++)
	    {
	      if(!this.getMethodParameter(i).getType().equals(comparedMethod.getMethodParameter(i).getType()))
	      {
	        allSame = false;
	        //break;
	      }
	    }
	    if(allSame) return true;
      }
    }
    
    return false;
  }

  // line 169 "../../../../src/Umple_CodeMethod.ump"
   public int hashCode(){
    // Note: this uses roughly the same rules as used above to generate a hashCode
    // so the two methods should be roughly kept in sync.
    String name = getName();
    String returnType = getType();
    String params = String.join("@DELIM1@", getMethodParameters().stream().map(p ->
                      p.getName() + "@DELIM2@" + p.getFullType()).collect(Collectors.toList()));
    String isConstructor = String.valueOf(isIsConstructor());
    return Arrays.asList(name, returnType, params, isConstructor).hashCode();
  }

  // line 74 "../../../../src/Trace_Code.ump"
   public List<TraceItem> getTraced(String method, UmpleClass uClass){
    ArrayList<TraceItem> amis = new ArrayList<TraceItem>();

		for(TraceDirective td: uClass.getAllTraceDirectives())
		{
			for(MethodTraceItem ami: td.getMethodTraceItems())
			{
				for(Method m : ami.getMethods())
				{
					if( m.getName().equals(this.getName()))
					{
						amis.add(ami);
					}
				}
			}
		}
		return amis;
  }

}