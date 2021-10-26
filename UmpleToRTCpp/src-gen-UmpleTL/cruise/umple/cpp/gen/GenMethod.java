/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import cruise.umple.cpp.utils.StringUtil;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

// line 816 "../../../../../UmpleTLTemplates/Core.ump"
// line 925 "../../../../../UmpleTLTemplates/Core.ump"
// line 26 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenMethod implements java.io.Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "inline ";
  public static final String TEXT_1 = "friend ";
  public static final String TEXT_2 = "static ";
  public static final String TEXT_3 = "virtual ";
  public static final String TEXT_4 = " ";
  public static final String TEXT_5 = "(";
  public static final String TEXT_6 = ")";
  public static final String TEXT_7 = " const";
  public static final String TEXT_8 = " = 0;";
  public static final String TEXT_9 = "{" + NL;
  public static final String TEXT_10 = "  " + NL + "}";
  public static final String TEXT_11 = ";";
  public static final String TEXT_12 = "inline ";
  public static final String TEXT_13 = " ";
  public static final String TEXT_14 = "::";
  public static final String TEXT_15 = "(";
  public static final String TEXT_16 = ")";
  public static final String TEXT_17 = " const";
  public static final String TEXT_18 = "{" + NL;
  public static final String TEXT_19 = "  " + NL + "}";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenMethod Attributes
  private GenGroup group;
  private String returnType;
  private String name;
  private boolean isConstructor;
  private boolean isCore;
  private boolean userDefined;
  private boolean isGeneratable;
  private String visibility;
  private boolean isStatic;
  private boolean isAbstract;
  private int priority;
  private String externalDefinition;
  private boolean isOperator;
  private boolean isVirtual;
  private boolean isInline;
  private boolean isPointer;
  private boolean isReference;
  private boolean isPure;
  private boolean isConstant;
  private boolean active;
  private boolean isHeader;
  private boolean normalize;
  private boolean disableRemote;
  private boolean isFriend;
  private transient Comparator<GenComment> commentPriority;
  private transient Comparator<GenRequirement> requirementPriority;
  private transient Comparator<GenBody> bodyPriority;

  //GenMethod Associations
  private List<GenMethodParameter> parameters;
  private List<GenComment> comment;
  private List<GenRequirement> requirement;
  private List<GenField> relatedFields;
  private List<GenBody> body;
  private GenClass genClass;
  private List<GenBody> defaultImplementations;
  private List<GenConstraintCondition> constraintConditions;
  private List<AbstractGenConstraint> constraints;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenMethod()
  {
    returnType = null;
    name = null;
    isConstructor = false;
    isCore = false;
    userDefined = false;
    isGeneratable = true;
    visibility = "private";
    isStatic = false;
    isAbstract = false;
    priority = 0;
    externalDefinition = null;
    isOperator = false;
    isVirtual = false;
    isInline = false;
    isPointer = false;
    isReference = false;
    isPure = false;
    isConstant = false;
    active = false;
    isHeader = false;
    normalize = false;
    disableRemote = false;
    isFriend = false;
    commentPriority = 
      Comparator.comparing(GenComment::getPriority);
    requirementPriority = 
      Comparator.comparing(GenRequirement::getPriority);
    bodyPriority = 
      Comparator.comparing(GenBody::getPriority);
    parameters = new ArrayList<GenMethodParameter>();
    comment = new ArrayList<GenComment>();
    requirement = new ArrayList<GenRequirement>();
    relatedFields = new ArrayList<GenField>();
    body = new ArrayList<GenBody>();
    defaultImplementations = new ArrayList<GenBody>();
    constraintConditions = new ArrayList<GenConstraintCondition>();
    constraints = new ArrayList<AbstractGenConstraint>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setGroup(GenGroup aGroup)
  {
    boolean wasSet = false;
    group = aGroup;
    wasSet = true;
    return wasSet;
  }

  public boolean setReturnType(String aReturnType)
  {
    boolean wasSet = false;
    returnType = aReturnType;
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

  public boolean setIsConstructor(boolean aIsConstructor)
  {
    boolean wasSet = false;
    isConstructor = aIsConstructor;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsCore(boolean aIsCore)
  {
    boolean wasSet = false;
    isCore = aIsCore;
    wasSet = true;
    return wasSet;
  }

  public boolean setUserDefined(boolean aUserDefined)
  {
    boolean wasSet = false;
    userDefined = aUserDefined;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsGeneratable(boolean aIsGeneratable)
  {
    boolean wasSet = false;
    isGeneratable = aIsGeneratable;
    wasSet = true;
    return wasSet;
  }

  public boolean setVisibility(String aVisibility)
  {
    boolean wasSet = false;
    visibility = aVisibility;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsStatic(boolean aIsStatic)
  {
    boolean wasSet = false;
    isStatic = aIsStatic;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsAbstract(boolean aIsAbstract)
  {
    boolean wasSet = false;
    isAbstract = aIsAbstract;
    wasSet = true;
    return wasSet;
  }

  public boolean setPriority(int aPriority)
  {
    boolean wasSet = false;
    priority = aPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setExternalDefinition(String aExternalDefinition)
  {
    boolean wasSet = false;
    externalDefinition = aExternalDefinition;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsOperator(boolean aIsOperator)
  {
    boolean wasSet = false;
    isOperator = aIsOperator;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsVirtual(boolean aIsVirtual)
  {
    boolean wasSet = false;
    isVirtual = aIsVirtual;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInline(boolean aIsInline)
  {
    boolean wasSet = false;
    isInline = aIsInline;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsPointer(boolean aIsPointer)
  {
    boolean wasSet = false;
    isPointer = aIsPointer;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsReference(boolean aIsReference)
  {
    boolean wasSet = false;
    isReference = aIsReference;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsPure(boolean aIsPure)
  {
    boolean wasSet = false;
    isPure = aIsPure;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsConstant(boolean aIsConstant)
  {
    boolean wasSet = false;
    isConstant = aIsConstant;
    wasSet = true;
    return wasSet;
  }

  public boolean setActive(boolean aActive)
  {
    boolean wasSet = false;
    active = aActive;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsHeader(boolean aIsHeader)
  {
    boolean wasSet = false;
    isHeader = aIsHeader;
    wasSet = true;
    return wasSet;
  }

  public boolean setNormalize(boolean aNormalize)
  {
    boolean wasSet = false;
    normalize = aNormalize;
    wasSet = true;
    return wasSet;
  }

  public boolean setDisableRemote(boolean aDisableRemote)
  {
    boolean wasSet = false;
    disableRemote = aDisableRemote;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsFriend(boolean aIsFriend)
  {
    boolean wasSet = false;
    isFriend = aIsFriend;
    wasSet = true;
    return wasSet;
  }

  public boolean setCommentPriority(Comparator<GenComment> aCommentPriority)
  {
    boolean wasSet = false;
    commentPriority = aCommentPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setRequirementPriority(Comparator<GenRequirement> aRequirementPriority)
  {
    boolean wasSet = false;
    requirementPriority = aRequirementPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setBodyPriority(Comparator<GenBody> aBodyPriority)
  {
    boolean wasSet = false;
    bodyPriority = aBodyPriority;
    wasSet = true;
    return wasSet;
  }

  public GenGroup getGroup()
  {
    return group;
  }

  public String getReturnType()
  {
    return returnType;
  }

  public String getName()
  {
    return name;
  }

  public boolean getIsConstructor()
  {
    return isConstructor;
  }

  public boolean getIsCore()
  {
    return isCore;
  }

  public boolean getUserDefined()
  {
    return userDefined;
  }

  public boolean getIsGeneratable()
  {
    return isGeneratable;
  }

  public String getVisibility()
  {
    return visibility;
  }

  public boolean getIsStatic()
  {
    return isStatic;
  }

  public boolean getIsAbstract()
  {
    return isAbstract;
  }

  public int getPriority()
  {
    return priority;
  }

  public String getExternalDefinition()
  {
    return externalDefinition;
  }

  public boolean getIsOperator()
  {
    return isOperator;
  }

  public boolean getIsVirtual()
  {
    return isVirtual;
  }

  public boolean getIsInline()
  {
    return isInline;
  }

  public boolean getIsPointer()
  {
    // line 974 "../../../../../UmpleTLTemplates/Core.ump"
    if(normalize){
    			return getGenClass().getGenPackage().isPointer(returnType);
    		}
    // END OF UMPLE BEFORE INJECTION
    return isPointer;
  }

  public boolean getIsReference()
  {
    return isReference;
  }

  public boolean getIsPure()
  {
    return isPure;
  }

  public boolean getIsConstant()
  {
    // line 968 "../../../../../UmpleTLTemplates/Core.ump"
    if(normalize && !getGenClass().getIsRemote()){
    			return getGenClass().getGenPackage().isPrimitive(returnType);
    		}
    // END OF UMPLE BEFORE INJECTION
    return isConstant;
  }

  public boolean getActive()
  {
    return active;
  }

  public boolean getIsHeader()
  {
    return isHeader;
  }

  public boolean getNormalize()
  {
    return normalize;
  }

  /**
   * TODO: move
   */
  public boolean getDisableRemote()
  {
    return disableRemote;
  }

  public boolean getIsFriend()
  {
    return isFriend;
  }

  public Comparator<GenComment> getCommentPriority()
  {
    return commentPriority;
  }

  public Comparator<GenRequirement> getRequirementPriority()
  {
    return requirementPriority;
  }

  public Comparator<GenBody> getBodyPriority()
  {
    return bodyPriority;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsConstructor()
  {
    return isConstructor;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsCore()
  {
    return isCore;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isUserDefined()
  {
    return userDefined;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsGeneratable()
  {
    return isGeneratable;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsStatic()
  {
    return isStatic;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsAbstract()
  {
    return isAbstract;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsOperator()
  {
    return isOperator;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsVirtual()
  {
    return isVirtual;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInline()
  {
    return isInline;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsPointer()
  {
    return isPointer;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsReference()
  {
    return isReference;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsPure()
  {
    return isPure;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsConstant()
  {
    return isConstant;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isActive()
  {
    return active;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsHeader()
  {
    return isHeader;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNormalize()
  {
    return normalize;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isDisableRemote()
  {
    return disableRemote;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsFriend()
  {
    return isFriend;
  }
  /* Code from template association_GetMany */
  public GenMethodParameter getParameter(int index)
  {
    GenMethodParameter aParameter = parameters.get(index);
    return aParameter;
  }

  /**
   * 0..1 -- * GenStereotype stereotypes;
   * A parameter can be owned by multiple methods in order to allow for one update in all places
   */
  public List<GenMethodParameter> getParameters()
  {
    List<GenMethodParameter> newParameters = Collections.unmodifiableList(parameters);
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

  public int indexOfParameter(GenMethodParameter aParameter)
  {
    int index = parameters.indexOf(aParameter);
    return index;
  }
  /* Code from template association_GetMany */
  public GenComment getComment(int index)
  {
    GenComment aComment = comment.get(index);
    return aComment;
  }

  public List<GenComment> getComment()
  {
    List<GenComment> newComment = Collections.unmodifiableList(comment);
    return newComment;
  }

  public int numberOfComment()
  {
    int number = comment.size();
    return number;
  }

  public boolean hasComment()
  {
    boolean has = comment.size() > 0;
    return has;
  }

  public int indexOfComment(GenComment aComment)
  {
    int index = comment.indexOf(aComment);
    return index;
  }
  /* Code from template association_GetMany */
  public GenRequirement getRequirement(int index)
  {
    GenRequirement aRequirement = requirement.get(index);
    return aRequirement;
  }

  public List<GenRequirement> getRequirement()
  {
    List<GenRequirement> newRequirement = Collections.unmodifiableList(requirement);
    return newRequirement;
  }

  public int numberOfRequirement()
  {
    int number = requirement.size();
    return number;
  }

  public boolean hasRequirement()
  {
    boolean has = requirement.size() > 0;
    return has;
  }

  public int indexOfRequirement(GenRequirement aRequirement)
  {
    int index = requirement.indexOf(aRequirement);
    return index;
  }
  /* Code from template association_GetMany */
  public GenField getRelatedField(int index)
  {
    GenField aRelatedField = relatedFields.get(index);
    return aRelatedField;
  }

  public List<GenField> getRelatedFields()
  {
    List<GenField> newRelatedFields = Collections.unmodifiableList(relatedFields);
    return newRelatedFields;
  }

  public int numberOfRelatedFields()
  {
    int number = relatedFields.size();
    return number;
  }

  public boolean hasRelatedFields()
  {
    boolean has = relatedFields.size() > 0;
    return has;
  }

  public int indexOfRelatedField(GenField aRelatedField)
  {
    int index = relatedFields.indexOf(aRelatedField);
    return index;
  }
  /* Code from template association_GetMany */
  public GenBody getBody(int index)
  {
    GenBody aBody = body.get(index);
    return aBody;
  }

  public List<GenBody> getBody()
  {
    List<GenBody> newBody = Collections.unmodifiableList(body);
    return newBody;
  }

  public int numberOfBody()
  {
    int number = body.size();
    return number;
  }

  public boolean hasBody()
  {
    boolean has = body.size() > 0;
    return has;
  }

  public int indexOfBody(GenBody aBody)
  {
    int index = body.indexOf(aBody);
    return index;
  }
  /* Code from template association_GetOne */
  public GenClass getGenClass()
  {
    return genClass;
  }

  public boolean hasGenClass()
  {
    boolean has = genClass != null;
    return has;
  }
  /* Code from template association_GetMany */
  public GenBody getDefaultImplementation(int index)
  {
    GenBody aDefaultImplementation = defaultImplementations.get(index);
    return aDefaultImplementation;
  }

  public List<GenBody> getDefaultImplementations()
  {
    List<GenBody> newDefaultImplementations = Collections.unmodifiableList(defaultImplementations);
    return newDefaultImplementations;
  }

  public int numberOfDefaultImplementations()
  {
    int number = defaultImplementations.size();
    return number;
  }

  public boolean hasDefaultImplementations()
  {
    boolean has = defaultImplementations.size() > 0;
    return has;
  }

  public int indexOfDefaultImplementation(GenBody aDefaultImplementation)
  {
    int index = defaultImplementations.indexOf(aDefaultImplementation);
    return index;
  }
  /* Code from template association_GetMany */
  public GenConstraintCondition getConstraintCondition(int index)
  {
    GenConstraintCondition aConstraintCondition = constraintConditions.get(index);
    return aConstraintCondition;
  }

  public List<GenConstraintCondition> getConstraintConditions()
  {
    List<GenConstraintCondition> newConstraintConditions = Collections.unmodifiableList(constraintConditions);
    return newConstraintConditions;
  }

  public int numberOfConstraintConditions()
  {
    int number = constraintConditions.size();
    return number;
  }

  public boolean hasConstraintConditions()
  {
    boolean has = constraintConditions.size() > 0;
    return has;
  }

  public int indexOfConstraintCondition(GenConstraintCondition aConstraintCondition)
  {
    int index = constraintConditions.indexOf(aConstraintCondition);
    return index;
  }
  /* Code from template association_GetMany */
  public AbstractGenConstraint getConstraint(int index)
  {
    AbstractGenConstraint aConstraint = constraints.get(index);
    return aConstraint;
  }

  public List<AbstractGenConstraint> getConstraints()
  {
    List<AbstractGenConstraint> newConstraints = Collections.unmodifiableList(constraints);
    return newConstraints;
  }

  public int numberOfConstraints()
  {
    int number = constraints.size();
    return number;
  }

  public boolean hasConstraints()
  {
    boolean has = constraints.size() > 0;
    return has;
  }

  public int indexOfConstraint(AbstractGenConstraint aConstraint)
  {
    int index = constraints.indexOf(aConstraint);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfParameters()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addParameter(GenMethodParameter aParameter)
  {
    boolean wasAdded = false;
    if (parameters.contains(aParameter)) { return false; }
    parameters.add(aParameter);
    if (aParameter.indexOfGenMethod(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aParameter.addGenMethod(this);
      if (!wasAdded)
      {
        parameters.remove(aParameter);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeParameter(GenMethodParameter aParameter)
  {
    boolean wasRemoved = false;
    if (!parameters.contains(aParameter))
    {
      return wasRemoved;
    }

    int oldIndex = parameters.indexOf(aParameter);
    parameters.remove(oldIndex);
    if (aParameter.indexOfGenMethod(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aParameter.removeGenMethod(this);
      if (!wasRemoved)
      {
        parameters.add(oldIndex,aParameter);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addParameterAt(GenMethodParameter aParameter, int index)
  {  
    boolean wasAdded = false;
    if(addParameter(aParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParameters()) { index = numberOfParameters() - 1; }
      parameters.remove(aParameter);
      parameters.add(index, aParameter);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveParameterAt(GenMethodParameter aParameter, int index)
  {
    boolean wasAdded = false;
    if(parameters.contains(aParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParameters()) { index = numberOfParameters() - 1; }
      parameters.remove(aParameter);
      parameters.add(index, aParameter);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addParameterAt(aParameter, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfComment()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addComment(GenComment aComment)
  {
    boolean wasAdded = false;
    if (comment.contains(aComment)) { return false; }
    GenMethod existingGenMethod = aComment.getGenMethod();
    if (existingGenMethod == null)
    {
      aComment.setGenMethod(this);
    }
    else if (!this.equals(existingGenMethod))
    {
      existingGenMethod.removeComment(aComment);
      addComment(aComment);
    }
    else
    {
      comment.add(aComment);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(comment, commentPriority);
    
    return wasAdded;
  }

  public boolean removeComment(GenComment aComment)
  {
    boolean wasRemoved = false;
    if (comment.contains(aComment))
    {
      comment.remove(aComment);
      aComment.setGenMethod(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRequirement()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addRequirement(GenRequirement aRequirement)
  {
    boolean wasAdded = false;
    if (requirement.contains(aRequirement)) { return false; }
    GenMethod existingGenMethod = aRequirement.getGenMethod();
    if (existingGenMethod == null)
    {
      aRequirement.setGenMethod(this);
    }
    else if (!this.equals(existingGenMethod))
    {
      existingGenMethod.removeRequirement(aRequirement);
      addRequirement(aRequirement);
    }
    else
    {
      requirement.add(aRequirement);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(requirement, requirementPriority);
    
    return wasAdded;
  }

  public boolean removeRequirement(GenRequirement aRequirement)
  {
    boolean wasRemoved = false;
    if (requirement.contains(aRequirement))
    {
      requirement.remove(aRequirement);
      aRequirement.setGenMethod(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRelatedFields()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addRelatedField(GenField aRelatedField)
  {
    boolean wasAdded = false;
    if (relatedFields.contains(aRelatedField)) { return false; }
    relatedFields.add(aRelatedField);
    if (aRelatedField.indexOfGenMethod(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aRelatedField.addGenMethod(this);
      if (!wasAdded)
      {
        relatedFields.remove(aRelatedField);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeRelatedField(GenField aRelatedField)
  {
    boolean wasRemoved = false;
    if (!relatedFields.contains(aRelatedField))
    {
      return wasRemoved;
    }

    int oldIndex = relatedFields.indexOf(aRelatedField);
    relatedFields.remove(oldIndex);
    if (aRelatedField.indexOfGenMethod(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aRelatedField.removeGenMethod(this);
      if (!wasRemoved)
      {
        relatedFields.add(oldIndex,aRelatedField);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addRelatedFieldAt(GenField aRelatedField, int index)
  {  
    boolean wasAdded = false;
    if(addRelatedField(aRelatedField))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRelatedFields()) { index = numberOfRelatedFields() - 1; }
      relatedFields.remove(aRelatedField);
      relatedFields.add(index, aRelatedField);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRelatedFieldAt(GenField aRelatedField, int index)
  {
    boolean wasAdded = false;
    if(relatedFields.contains(aRelatedField))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRelatedFields()) { index = numberOfRelatedFields() - 1; }
      relatedFields.remove(aRelatedField);
      relatedFields.add(index, aRelatedField);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRelatedFieldAt(aRelatedField, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBody()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addBody(GenBody aBody)
  {
    boolean wasAdded = false;
    if (body.contains(aBody)) { return false; }
    GenMethod existingGenMethod = aBody.getGenMethod();
    if (existingGenMethod == null)
    {
      aBody.setGenMethod(this);
    }
    else if (!this.equals(existingGenMethod))
    {
      existingGenMethod.removeBody(aBody);
      addBody(aBody);
    }
    else
    {
      body.add(aBody);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(body, bodyPriority);
    
    return wasAdded;
  }

  public boolean removeBody(GenBody aBody)
  {
    boolean wasRemoved = false;
    if (body.contains(aBody))
    {
      body.remove(aBody);
      aBody.setGenMethod(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenClass(GenClass aGenClass)
  {
    boolean wasSet = false;
    GenClass existingGenClass = genClass;
    genClass = aGenClass;
    if (existingGenClass != null && !existingGenClass.equals(aGenClass))
    {
      existingGenClass.removeMethod(this);
    }
    if (aGenClass != null)
    {
      aGenClass.addMethod(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDefaultImplementations()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addDefaultImplementation(GenBody aDefaultImplementation)
  {
    boolean wasAdded = false;
    if (defaultImplementations.contains(aDefaultImplementation)) { return false; }
    GenMethod existingDefaultBodyOwner = aDefaultImplementation.getDefaultBodyOwner();
    if (existingDefaultBodyOwner == null)
    {
      aDefaultImplementation.setDefaultBodyOwner(this);
    }
    else if (!this.equals(existingDefaultBodyOwner))
    {
      existingDefaultBodyOwner.removeDefaultImplementation(aDefaultImplementation);
      addDefaultImplementation(aDefaultImplementation);
    }
    else
    {
      defaultImplementations.add(aDefaultImplementation);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeDefaultImplementation(GenBody aDefaultImplementation)
  {
    boolean wasRemoved = false;
    if (defaultImplementations.contains(aDefaultImplementation))
    {
      defaultImplementations.remove(aDefaultImplementation);
      aDefaultImplementation.setDefaultBodyOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDefaultImplementationAt(GenBody aDefaultImplementation, int index)
  {  
    boolean wasAdded = false;
    if(addDefaultImplementation(aDefaultImplementation))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDefaultImplementations()) { index = numberOfDefaultImplementations() - 1; }
      defaultImplementations.remove(aDefaultImplementation);
      defaultImplementations.add(index, aDefaultImplementation);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDefaultImplementationAt(GenBody aDefaultImplementation, int index)
  {
    boolean wasAdded = false;
    if(defaultImplementations.contains(aDefaultImplementation))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDefaultImplementations()) { index = numberOfDefaultImplementations() - 1; }
      defaultImplementations.remove(aDefaultImplementation);
      defaultImplementations.add(index, aDefaultImplementation);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDefaultImplementationAt(aDefaultImplementation, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfConstraintConditions()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addConstraintCondition(GenConstraintCondition aConstraintCondition)
  {
    boolean wasAdded = false;
    if (constraintConditions.contains(aConstraintCondition)) { return false; }
    GenMethod existingMethod = aConstraintCondition.getMethod();
    if (existingMethod == null)
    {
      aConstraintCondition.setMethod(this);
    }
    else if (!this.equals(existingMethod))
    {
      existingMethod.removeConstraintCondition(aConstraintCondition);
      addConstraintCondition(aConstraintCondition);
    }
    else
    {
      constraintConditions.add(aConstraintCondition);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeConstraintCondition(GenConstraintCondition aConstraintCondition)
  {
    boolean wasRemoved = false;
    if (constraintConditions.contains(aConstraintCondition))
    {
      constraintConditions.remove(aConstraintCondition);
      aConstraintCondition.setMethod(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addConstraintConditionAt(GenConstraintCondition aConstraintCondition, int index)
  {  
    boolean wasAdded = false;
    if(addConstraintCondition(aConstraintCondition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstraintConditions()) { index = numberOfConstraintConditions() - 1; }
      constraintConditions.remove(aConstraintCondition);
      constraintConditions.add(index, aConstraintCondition);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveConstraintConditionAt(GenConstraintCondition aConstraintCondition, int index)
  {
    boolean wasAdded = false;
    if(constraintConditions.contains(aConstraintCondition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstraintConditions()) { index = numberOfConstraintConditions() - 1; }
      constraintConditions.remove(aConstraintCondition);
      constraintConditions.add(index, aConstraintCondition);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addConstraintConditionAt(aConstraintCondition, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfConstraints()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addConstraint(AbstractGenConstraint aConstraint)
  {
    boolean wasAdded = false;
    if (constraints.contains(aConstraint)) { return false; }
    GenMethod existingMethod = aConstraint.getMethod();
    if (existingMethod == null)
    {
      aConstraint.setMethod(this);
    }
    else if (!this.equals(existingMethod))
    {
      existingMethod.removeConstraint(aConstraint);
      addConstraint(aConstraint);
    }
    else
    {
      constraints.add(aConstraint);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeConstraint(AbstractGenConstraint aConstraint)
  {
    boolean wasRemoved = false;
    if (constraints.contains(aConstraint))
    {
      constraints.remove(aConstraint);
      aConstraint.setMethod(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addConstraintAt(AbstractGenConstraint aConstraint, int index)
  {  
    boolean wasAdded = false;
    if(addConstraint(aConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstraints()) { index = numberOfConstraints() - 1; }
      constraints.remove(aConstraint);
      constraints.add(index, aConstraint);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveConstraintAt(AbstractGenConstraint aConstraint, int index)
  {
    boolean wasAdded = false;
    if(constraints.contains(aConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstraints()) { index = numberOfConstraints() - 1; }
      constraints.remove(aConstraint);
      constraints.add(index, aConstraint);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addConstraintAt(aConstraint, index);
    }
    return wasAdded;
  }

  /* Code from template association_sorted_serializable_readObject */ 
  private void readObject(java.io.ObjectInputStream in)
  throws Exception
  {
    in.defaultReadObject();

    commentPriority = 
      Comparator.comparing(GenComment::getPriority);
    requirementPriority = 
      Comparator.comparing(GenRequirement::getPriority);
    bodyPriority = 
      Comparator.comparing(GenBody::getPriority);
  }
  
  public void delete()
  {
    ArrayList<GenMethodParameter> copyOfParameters = new ArrayList<GenMethodParameter>(parameters);
    parameters.clear();
    for(GenMethodParameter aParameter : copyOfParameters)
    {
      aParameter.removeGenMethod(this);
    }
    while( !comment.isEmpty() )
    {
      comment.get(0).setGenMethod(null);
    }
    while( !requirement.isEmpty() )
    {
      requirement.get(0).setGenMethod(null);
    }
    ArrayList<GenField> copyOfRelatedFields = new ArrayList<GenField>(relatedFields);
    relatedFields.clear();
    for(GenField aRelatedField : copyOfRelatedFields)
    {
      aRelatedField.removeGenMethod(this);
    }
    while( !body.isEmpty() )
    {
      body.get(0).setGenMethod(null);
    }
    if (genClass != null)
    {
      GenClass placeholderGenClass = genClass;
      this.genClass = null;
      placeholderGenClass.removeMethod(this);
    }
    while( !defaultImplementations.isEmpty() )
    {
      defaultImplementations.get(0).setDefaultBodyOwner(null);
    }
    while( !constraintConditions.isEmpty() )
    {
      constraintConditions.get(0).setMethod(null);
    }
    while( !constraints.isEmpty() )
    {
      constraints.get(0).setMethod(null);
    }
  }

  // line 946 "../../../../../UmpleTLTemplates/Core.ump"
  public String identifier(){
    return getName()+ "_"+ getParameters().stream().map(GenMethodParameter::getType).collect(Collectors.joining("_"));
  }

  // line 980 "../../../../../UmpleTLTemplates/Core.ump"
  public String getNormalizedReturnType(){
    String value= getReturnType();
		if(normalize){
			return getGenClass().getGenPackage().getNormalizedType(value);
		}else if(getIsReference()){
			return value+ "&";
		}else if(getIsPointer()){
			return value+ "*";
		}
		
		return value;
  }

  // line 993 "../../../../../UmpleTLTemplates/Core.ump"
  public String getInitializerCall(){
    String initializerString= getInitializerString();
		if(initializerString!= null && !initializerString.isEmpty()){
			return ":"+ initializerString;
		}
		
		return "";
  }

  // line 1002 "../../../../../UmpleTLTemplates/Core.ump"
  public String getInitializerString(){
    return null;
  }

  // line 1006 "../../../../../UmpleTLTemplates/Core.ump"
  public String parameters(){
    return this.getParameters().stream().map(GenMethodParameter::declaration).collect(Collectors.joining(", "));
  }

  // line 1010 "../../../../../UmpleTLTemplates/Core.ump"
  public String commentString(){
    String string= this.getComment().stream().map(GenComment::getBody).collect(Collectors.joining(NL));
		if(string.isEmpty()){
			return string;
		}
		
		return string+ NL;
  }

  // line 1019 "../../../../../UmpleTLTemplates/Core.ump"
  public String requirementString(){
    String string= this.getRequirement().stream().map(GenRequirement::getBody).collect(Collectors.joining(NL));
		if(string.isEmpty()){
			return string;
		}
		
		return string+ NL;
  }

  // line 1028 "../../../../../UmpleTLTemplates/Core.ump"
  public String bodyString(List<String> bodies){
    if (numberOfBody() == 1 && !hasConstraintConditions()) {
			GenBody genBody = this.getBody(0);
			if (genBody instanceof GenAspectableReturnBody) {
				return ((GenAspectableReturnBody) genBody).returnBody();
			}
			//return genBody.getBody();
		}

		GenAspectableReturnBody returnBody = getAspectableReturnBody();
		addBody(GenBody.BEFORE, bodies);

		if (returnBody != null) {
			bodies.add(returnBody.assignBody());
		}
		
		addBody(GenBody.PRE_BLOCK, bodies);
		
		List<String> wrapableBodies= new ArrayList<String>();
		addBodyExceptFor(Arrays.asList(new String[]{GenBody.PRE_BLOCK, GenBody.BEFORE, GenBody.AFTER, GenBody.POST_BLOCK}), wrapableBodies);
		dynamicBody(wrapableBodies);
		addBody(GenBody.AFTER, wrapableBodies);
		
		if(hasConstraintConditions()){
			GenConstraint genConstraint= new GenConstraint();
			for(GenConstraintCondition condition: getConstraintConditions()){
				genConstraint.addCondition(condition);
			}
			genConstraint.setInvert(false);
			genConstraint.setBaseContent(wrapableBodies.stream().collect(Collectors.joining(NL)));
			String constrainedCall= genConstraint.constraintCheckCall();
			bodies.add(constrainedCall);
		}else{
			bodies.addAll(wrapableBodies);
		}
		
		if (returnBody != null) {
			bodies.add(returnBody.returnVariable());
		}
		
		addBody(GenBody.POST_BLOCK, bodies);
		
		if(bodies.isEmpty()){
			bodies.addAll(this.getDefaultImplementations().stream().map(GenBody::getBody).collect(Collectors.toList()));
		}

		return bodies.stream().collect(Collectors.joining(NL));
  }

  // line 1077 "../../../../../UmpleTLTemplates/Core.ump"
  public void dynamicBody(List<String> bodies){
    //For subclasses
  }

  // line 1081 "../../../../../UmpleTLTemplates/Core.ump"
  public void addBody(String aspect, List<String> bodies){
    for (GenBody genBody : this.getBody()) {
			if(genBody instanceof GenAspectableReturnBody == false && aspect.equals(genBody.getType())){
				String body= genBody.getBody();
				if(body != null){
					bodies.add(body);
				}
			}
		}
  }

  // line 1092 "../../../../../UmpleTLTemplates/Core.ump"
  public void addBodyExceptFor(List<String> aspects, List<String> bodies){
    for (GenBody genBody : this.getBody()) {
			if(genBody instanceof GenAspectableReturnBody == false && !aspects.contains(genBody.getType())){
				String body= genBody.getBody();
				if(body != null){
					bodies.add(body);
				}
			}
		}
  }

  // line 1103 "../../../../../UmpleTLTemplates/Core.ump"
  public GenAspectableReturnBody getAspectableReturnBody(){
    for (GenBody genBody : this.getBody()) {
			if (genBody instanceof GenAspectableReturnBody) {
				return (GenAspectableReturnBody) genBody;
			}
		}
		return null;
  }

  // line 1111 "../../../../../UmpleTLTemplates/Core.ump"
  public String owningClass(){
    //TODO: rename
		GenClass genClass= this.getGenClass();
		if(genClass== null){
			return null;
		}
		
		return genClass.getName();
  }

  // line 1138 "../../../../../UmpleTLTemplates/Core.ump"
  public String declaration(Boolean hasImplementation){
    return declaration(!hasImplementation, !hasImplementation);
  }

  // line 1142 "../../../../../UmpleTLTemplates/Core.ump"
  public String declaration(){
    return declaration(isVirtual, isPure);
  }

  // line 1146 "../../../../../UmpleTLTemplates/Core.ump"
  public String implementation(){
    return implementation(externalDefinition== null?owningClass(): externalDefinition);
  }

  // line 28 "../../../../../UmpleTLTemplates/Attributes.ump"
  public Boolean hasBodyConstraints(){
    for(GenBody _body: getBody()){
			if(_body instanceof AbstractGenConstraint){
				return true;
			}
		}
		
		return false;
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

  public StringBuilder _declaration(Integer numSpaces, StringBuilder sb, Boolean _isVirtual, Boolean _isPure){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(commentString());
    realSb.append(requirementString());
    if(isInline){
    realSb.append(TEXT_0);
    
	}
    if(isFriend){
    realSb.append(TEXT_1);
    }
    if(isStatic)
    realSb.append(TEXT_2);
    if(_isVirtual){
    realSb.append(TEXT_3);
    }
    if(returnType!= null && !returnType.isEmpty()){
    realSb.append(getNormalizedReturnType());
    realSb.append(TEXT_4);
    }
    realSb.append(name);
    realSb.append(TEXT_5);
    realSb.append(parameters());
    realSb.append(TEXT_6);
    if(getIsConstant()){
    realSb.append(TEXT_7);
    
	}if(_isPure){
    realSb.append(TEXT_8);
    
	}else if(isHeader){
    realSb.append(TEXT_9);
    realSb.append(_indent(2, new StringBuilder(), bodyString(new ArrayList<String>())));
    realSb.append(TEXT_10);
    }else{
    realSb.append(TEXT_11);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String declaration(Boolean _isVirtual, Boolean _isPure){
        StringBuilder sb = new StringBuilder();
    return this._declaration(0,sb,_isVirtual,_isPure).toString(); 
  }

  public StringBuilder _implementation(Integer numSpaces, StringBuilder sb, String owner){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(commentString());
    realSb.append(requirementString());
    if(isInline){
    realSb.append(TEXT_12);
    }
    if(returnType!= null && !returnType.isEmpty()){
    realSb.append(getNormalizedReturnType());
    realSb.append(TEXT_13);
    }
    
	if(!Visibilities.GLOBAL.equals(getVisibility()) && owner!= null && !owner.isEmpty()){
    realSb.append(owner);
    realSb.append(TEXT_14);
    }
    realSb.append(name);
    realSb.append(TEXT_15);
    realSb.append(parameters());
    realSb.append(TEXT_16);
    if(getIsConstant()){
    realSb.append(TEXT_17);
    }
    realSb.append(getInitializerCall());
    realSb.append(TEXT_18);
    realSb.append(_indent(2, new StringBuilder(), bodyString(new ArrayList<String>())));
    realSb.append(TEXT_19);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String implementation(String owner){
        StringBuilder sb = new StringBuilder();
    return this._implementation(0,sb,owner).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "returnType" + ":" + getReturnType()+ "," +
            "name" + ":" + getName()+ "," +
            "isConstructor" + ":" + getIsConstructor()+ "," +
            "isCore" + ":" + getIsCore()+ "," +
            "userDefined" + ":" + getUserDefined()+ "," +
            "isGeneratable" + ":" + getIsGeneratable()+ "," +
            "visibility" + ":" + getVisibility()+ "," +
            "isStatic" + ":" + getIsStatic()+ "," +
            "isAbstract" + ":" + getIsAbstract()+ "," +
            "priority" + ":" + getPriority()+ "," +
            "externalDefinition" + ":" + getExternalDefinition()+ "," +
            "isOperator" + ":" + getIsOperator()+ "," +
            "isVirtual" + ":" + getIsVirtual()+ "," +
            "isInline" + ":" + getIsInline()+ "," +
            "isPointer" + ":" + getIsPointer()+ "," +
            "isReference" + ":" + getIsReference()+ "," +
            "isPure" + ":" + getIsPure()+ "," +
            "isConstant" + ":" + getIsConstant()+ "," +
            "active" + ":" + getActive()+ "," +
            "isHeader" + ":" + getIsHeader()+ "," +
            "normalize" + ":" + getNormalize()+ "," +
            "disableRemote" + ":" + getDisableRemote()+ "," +
            "isFriend" + ":" + getIsFriend()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "group" + "=" + (getGroup() != null ? !getGroup().equals(this)  ? getGroup().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "commentPriority" + "=" + (getCommentPriority() != null ? !getCommentPriority().equals(this)  ? getCommentPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "requirementPriority" + "=" + (getRequirementPriority() != null ? !getRequirementPriority().equals(this)  ? getRequirementPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "bodyPriority" + "=" + (getBodyPriority() != null ? !getBodyPriority().equals(this)  ? getBodyPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "genClass = "+(getGenClass()!=null?Integer.toHexString(System.identityHashCode(getGenClass())):"null");
  }
}