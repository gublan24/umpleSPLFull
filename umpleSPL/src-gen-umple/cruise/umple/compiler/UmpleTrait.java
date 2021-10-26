/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.util.*;
import java.util.*;

/**
 * ---------------------------------------------------------------------------------------------
 * ------------------------------------class end------------------------------------------------
 * ---------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------
 * ------------------------------------class start----------------------------------------------
 * ---------------------------------------------------------------------------------------------
 * Fragment source file: Umple_Code_Trait.ump
 * Line : 80
 * An UmpleTrait can contain attributes, associations, state machines and methods.
 * It can also have various other information such as a key (to identify uniqueness),
 * code to inject into generated code, and comments. It can be tagged with various
 * patterns.
 */
// line 38 "../../../../src/Umple_Code_Trait.ump"
// line 4 "../../../../src/Association_refactored.ump"
// line 753 "../../../../src/Umple.ump"
public class UmpleTrait extends UmpleClassifier
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleTrait Attributes
  private boolean isAbstract;
  private boolean isSingleton;
  private List<Association> associations;
  private List<Method> unimplementedMethods;
  private Key key;

  /**
   * Specifies whether or not the Umple trait is immutable.
   */
  private boolean iAmImmutable;
  private boolean ancestorIsImmutable;

  //UmpleTrait Associations
  private List<CodeInjection> codeInjections;
  private List<Precondition> preConds;
  private List<Postcondition> postConds;
  private List<ConstraintTree> constraintTrees;
  private List<UmpleTrait> extendsTraits;
  private UniqueIdentifier uniqueIdentifier;
  private List<Attribute> attributes;
  private List<AssociationVariable> associationVariables;
  private List<Comment> comments;
  private List<GeneralTemplateParameter> generalTemplateParameters;
  private List<GeneralTPApplied> generalTPApplieds;
  private List<UmpleInterface> requiredInterfaces;
  private List<UmpleTestCase> umpleTestCases;
  private List<StateMachine> stateMachines;
  private List<UmpleClass> subClasses;
  private List<UmpleTrait> subTraits;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleTrait(String aName, UmpleModel aSourceModel)
  {
    super(aName, aSourceModel);
    isAbstract = false;
    isSingleton = false;
    associations = new ArrayList<Association>();
    unimplementedMethods = new ArrayList<Method>();
    key = new Key();
    iAmImmutable = false;
    ancestorIsImmutable = false;
    codeInjections = new ArrayList<CodeInjection>();
    preConds = new ArrayList<Precondition>();
    postConds = new ArrayList<Postcondition>();
    constraintTrees = new ArrayList<ConstraintTree>();
    extendsTraits = new ArrayList<UmpleTrait>();
    attributes = new ArrayList<Attribute>();
    associationVariables = new ArrayList<AssociationVariable>();
    comments = new ArrayList<Comment>();
    generalTemplateParameters = new ArrayList<GeneralTemplateParameter>();
    generalTPApplieds = new ArrayList<GeneralTPApplied>();
    requiredInterfaces = new ArrayList<UmpleInterface>();
    umpleTestCases = new ArrayList<UmpleTestCase>();
    stateMachines = new ArrayList<StateMachine>();
    subClasses = new ArrayList<UmpleClass>();
    subTraits = new ArrayList<UmpleTrait>();
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

  public boolean setIsSingleton(boolean aIsSingleton)
  {
    boolean wasSet = false;
    isSingleton = aIsSingleton;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addAssociation(Association aAssociation)
  {
    boolean wasAdded = false;
    wasAdded = associations.add(aAssociation);
    return wasAdded;
  }

  public boolean removeAssociation(Association aAssociation)
  {
    boolean wasRemoved = false;
    wasRemoved = associations.remove(aAssociation);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addUnimplementedMethod(Method aUnimplementedMethod)
  {
    boolean wasAdded = false;
    wasAdded = unimplementedMethods.add(aUnimplementedMethod);
    return wasAdded;
  }

  public boolean removeUnimplementedMethod(Method aUnimplementedMethod)
  {
    boolean wasRemoved = false;
    wasRemoved = unimplementedMethods.remove(aUnimplementedMethod);
    return wasRemoved;
  }

  public boolean setKey(Key aKey)
  {
    boolean wasSet = false;
    key = aKey;
    wasSet = true;
    return wasSet;
  }

  /**
   * Specifies whether or not the Umple class is an abstract class.
   */
  public boolean getIsAbstract()
  {
    return isAbstract;
  }

  /**
   * Specifies whether or not the Umple trait is a singleton.
   */
  public boolean getIsSingleton()
  {
    return isSingleton;
  }
  /* Code from template attribute_GetMany */
  public Association getAssociation(int index)
  {
    Association aAssociation = associations.get(index);
    return aAssociation;
  }

  public Association[] getAssociations()
  {
    Association[] newAssociations = associations.toArray(new Association[associations.size()]);
    return newAssociations;
  }

  public int numberOfAssociations()
  {
    int number = associations.size();
    return number;
  }

  public boolean hasAssociations()
  {
    boolean has = associations.size() > 0;
    return has;
  }

  public int indexOfAssociation(Association aAssociation)
  {
    int index = associations.indexOf(aAssociation);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Method getUnimplementedMethod(int index)
  {
    Method aUnimplementedMethod = unimplementedMethods.get(index);
    return aUnimplementedMethod;
  }

  public Method[] getUnimplementedMethods()
  {
    Method[] newUnimplementedMethods = unimplementedMethods.toArray(new Method[unimplementedMethods.size()]);
    return newUnimplementedMethods;
  }

  public int numberOfUnimplementedMethods()
  {
    int number = unimplementedMethods.size();
    return number;
  }

  public boolean hasUnimplementedMethods()
  {
    boolean has = unimplementedMethods.size() > 0;
    return has;
  }

  public int indexOfUnimplementedMethod(Method aUnimplementedMethod)
  {
    int index = unimplementedMethods.indexOf(aUnimplementedMethod);
    return index;
  }

  public Key getKey()
  {
    return key;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsAbstract()
  {
    return isAbstract;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsSingleton()
  {
    return isSingleton;
  }
  /* Code from template association_GetMany */
  public CodeInjection getCodeInjection(int index)
  {
    CodeInjection aCodeInjection = codeInjections.get(index);
    return aCodeInjection;
  }

  public List<CodeInjection> getCodeInjections()
  {
    List<CodeInjection> newCodeInjections = Collections.unmodifiableList(codeInjections);
    return newCodeInjections;
  }

  public int numberOfCodeInjections()
  {
    int number = codeInjections.size();
    return number;
  }

  public boolean hasCodeInjections()
  {
    boolean has = codeInjections.size() > 0;
    return has;
  }

  public int indexOfCodeInjection(CodeInjection aCodeInjection)
  {
    int index = codeInjections.indexOf(aCodeInjection);
    return index;
  }
  /* Code from template association_GetMany */
  public Precondition getPreCond(int index)
  {
    Precondition aPreCond = preConds.get(index);
    return aPreCond;
  }

  /**
   * The possible Preconditions related to the Umple Trait
   */
  public List<Precondition> getPreConds()
  {
    List<Precondition> newPreConds = Collections.unmodifiableList(preConds);
    return newPreConds;
  }

  public int numberOfPreConds()
  {
    int number = preConds.size();
    return number;
  }

  public boolean hasPreConds()
  {
    boolean has = preConds.size() > 0;
    return has;
  }

  public int indexOfPreCond(Precondition aPreCond)
  {
    int index = preConds.indexOf(aPreCond);
    return index;
  }
  /* Code from template association_GetMany */
  public Postcondition getPostCond(int index)
  {
    Postcondition aPostCond = postConds.get(index);
    return aPostCond;
  }

  /**
   * The possible Preconditions related to the Umple Trait
   */
  public List<Postcondition> getPostConds()
  {
    List<Postcondition> newPostConds = Collections.unmodifiableList(postConds);
    return newPostConds;
  }

  public int numberOfPostConds()
  {
    int number = postConds.size();
    return number;
  }

  public boolean hasPostConds()
  {
    boolean has = postConds.size() > 0;
    return has;
  }

  public int indexOfPostCond(Postcondition aPostCond)
  {
    int index = postConds.indexOf(aPostCond);
    return index;
  }
  /* Code from template association_GetMany */
  public ConstraintTree getConstraintTree(int index)
  {
    ConstraintTree aConstraintTree = constraintTrees.get(index);
    return aConstraintTree;
  }

  /**
   * The possible Constraints related to the Umple Trait
   */
  public List<ConstraintTree> getConstraintTrees()
  {
    List<ConstraintTree> newConstraintTrees = Collections.unmodifiableList(constraintTrees);
    return newConstraintTrees;
  }

  public int numberOfConstraintTrees()
  {
    int number = constraintTrees.size();
    return number;
  }

  public boolean hasConstraintTrees()
  {
    boolean has = constraintTrees.size() > 0;
    return has;
  }

  public int indexOfConstraintTree(ConstraintTree aConstraintTree)
  {
    int index = constraintTrees.indexOf(aConstraintTree);
    return index;
  }
  /* Code from template association_GetMany */
  public UmpleTrait getExtendsTrait(int index)
  {
    UmpleTrait aExtendsTrait = extendsTraits.get(index);
    return aExtendsTrait;
  }

  /**
   * The Umple Trait's super Traits (if there are ones).
   */
  public List<UmpleTrait> getExtendsTraits()
  {
    List<UmpleTrait> newExtendsTraits = Collections.unmodifiableList(extendsTraits);
    return newExtendsTraits;
  }

  public int numberOfExtendsTraits()
  {
    int number = extendsTraits.size();
    return number;
  }

  public boolean hasExtendsTraits()
  {
    boolean has = extendsTraits.size() > 0;
    return has;
  }

  public int indexOfExtendsTrait(UmpleTrait aExtendsTrait)
  {
    int index = extendsTraits.indexOf(aExtendsTrait);
    return index;
  }
  /* Code from template association_GetOne */
  public UniqueIdentifier getUniqueIdentifier()
  {
    return uniqueIdentifier;
  }

  public boolean hasUniqueIdentifier()
  {
    boolean has = uniqueIdentifier != null;
    return has;
  }
  /* Code from template association_GetMany */
  public Attribute getAttribute(int index)
  {
    Attribute aAttribute = attributes.get(index);
    return aAttribute;
  }

  /**
   * The attributes contained within the Umple trait.
   */
  public List<Attribute> getAttributes()
  {
    List<Attribute> newAttributes = Collections.unmodifiableList(attributes);
    return newAttributes;
  }

  public int numberOfAttributes()
  {
    int number = attributes.size();
    return number;
  }

  public boolean hasAttributes()
  {
    boolean has = attributes.size() > 0;
    return has;
  }

  public int indexOfAttribute(Attribute aAttribute)
  {
    int index = attributes.indexOf(aAttribute);
    return index;
  }
  /* Code from template association_GetMany */
  public AssociationVariable getAssociationVariable(int index)
  {
    AssociationVariable aAssociationVariable = associationVariables.get(index);
    return aAssociationVariable;
  }

  /**
   * The associations contained within the Umple trait.
   */
  public List<AssociationVariable> getAssociationVariables()
  {
    List<AssociationVariable> newAssociationVariables = Collections.unmodifiableList(associationVariables);
    return newAssociationVariables;
  }

  public int numberOfAssociationVariables()
  {
    int number = associationVariables.size();
    return number;
  }

  public boolean hasAssociationVariables()
  {
    boolean has = associationVariables.size() > 0;
    return has;
  }

  public int indexOfAssociationVariable(AssociationVariable aAssociationVariable)
  {
    int index = associationVariables.indexOf(aAssociationVariable);
    return index;
  }
  /* Code from template association_GetMany */
  public Comment getComment(int index)
  {
    Comment aComment = comments.get(index);
    return aComment;
  }

  /**
   * The comments associated with the Umple Trait (such as the Javadoc above it).
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
  /* Code from template association_GetMany */
  public GeneralTemplateParameter getGeneralTemplateParameter(int index)
  {
    GeneralTemplateParameter aGeneralTemplateParameter = generalTemplateParameters.get(index);
    return aGeneralTemplateParameter;
  }

  /**
   * The template parameters which are specified when traits are defined.
   */
  public List<GeneralTemplateParameter> getGeneralTemplateParameters()
  {
    List<GeneralTemplateParameter> newGeneralTemplateParameters = Collections.unmodifiableList(generalTemplateParameters);
    return newGeneralTemplateParameters;
  }

  public int numberOfGeneralTemplateParameters()
  {
    int number = generalTemplateParameters.size();
    return number;
  }

  public boolean hasGeneralTemplateParameters()
  {
    boolean has = generalTemplateParameters.size() > 0;
    return has;
  }

  public int indexOfGeneralTemplateParameter(GeneralTemplateParameter aGeneralTemplateParameter)
  {
    int index = generalTemplateParameters.indexOf(aGeneralTemplateParameter);
    return index;
  }
  /* Code from template association_GetMany */
  public GeneralTPApplied getGeneralTPApplied(int index)
  {
    GeneralTPApplied aGeneralTPApplied = generalTPApplieds.get(index);
    return aGeneralTPApplied;
  }

  /**
   * This is used to assign inheritance parameters.
   */
  public List<GeneralTPApplied> getGeneralTPApplieds()
  {
    List<GeneralTPApplied> newGeneralTPApplieds = Collections.unmodifiableList(generalTPApplieds);
    return newGeneralTPApplieds;
  }

  public int numberOfGeneralTPApplieds()
  {
    int number = generalTPApplieds.size();
    return number;
  }

  public boolean hasGeneralTPApplieds()
  {
    boolean has = generalTPApplieds.size() > 0;
    return has;
  }

  public int indexOfGeneralTPApplied(GeneralTPApplied aGeneralTPApplied)
  {
    int index = generalTPApplieds.indexOf(aGeneralTPApplied);
    return index;
  }
  /* Code from template association_GetMany */
  public UmpleInterface getRequiredInterface(int index)
  {
    UmpleInterface aRequiredInterface = requiredInterfaces.get(index);
    return aRequiredInterface;
  }

  /**
   * This is used to assign required interfaces
   */
  public List<UmpleInterface> getRequiredInterfaces()
  {
    List<UmpleInterface> newRequiredInterfaces = Collections.unmodifiableList(requiredInterfaces);
    return newRequiredInterfaces;
  }

  public int numberOfRequiredInterfaces()
  {
    int number = requiredInterfaces.size();
    return number;
  }

  public boolean hasRequiredInterfaces()
  {
    boolean has = requiredInterfaces.size() > 0;
    return has;
  }

  public int indexOfRequiredInterface(UmpleInterface aRequiredInterface)
  {
    int index = requiredInterfaces.indexOf(aRequiredInterface);
    return index;
  }
  /* Code from template association_GetMany */
  public UmpleTestCase getUmpleTestCase(int index)
  {
    UmpleTestCase aUmpleTestCase = umpleTestCases.get(index);
    return aUmpleTestCase;
  }

  /**
   * trait test cases
   */
  public List<UmpleTestCase> getUmpleTestCases()
  {
    List<UmpleTestCase> newUmpleTestCases = Collections.unmodifiableList(umpleTestCases);
    return newUmpleTestCases;
  }

  public int numberOfUmpleTestCases()
  {
    int number = umpleTestCases.size();
    return number;
  }

  public boolean hasUmpleTestCases()
  {
    boolean has = umpleTestCases.size() > 0;
    return has;
  }

  public int indexOfUmpleTestCase(UmpleTestCase aUmpleTestCase)
  {
    int index = umpleTestCases.indexOf(aUmpleTestCase);
    return index;
  }
  /* Code from template association_GetMany */
  public StateMachine getStateMachine(int index)
  {
    StateMachine aStateMachine = stateMachines.get(index);
    return aStateMachine;
  }

  public List<StateMachine> getStateMachines()
  {
    List<StateMachine> newStateMachines = Collections.unmodifiableList(stateMachines);
    return newStateMachines;
  }

  public int numberOfStateMachines()
  {
    int number = stateMachines.size();
    return number;
  }

  public boolean hasStateMachines()
  {
    boolean has = stateMachines.size() > 0;
    return has;
  }

  public int indexOfStateMachine(StateMachine aStateMachine)
  {
    int index = stateMachines.indexOf(aStateMachine);
    return index;
  }
  /* Code from template association_GetMany */
  public UmpleClass getSubClass(int index)
  {
    UmpleClass aSubClass = subClasses.get(index);
    return aSubClass;
  }

  public List<UmpleClass> getSubClasses()
  {
    List<UmpleClass> newSubClasses = Collections.unmodifiableList(subClasses);
    return newSubClasses;
  }

  public int numberOfSubClasses()
  {
    int number = subClasses.size();
    return number;
  }

  public boolean hasSubClasses()
  {
    boolean has = subClasses.size() > 0;
    return has;
  }

  public int indexOfSubClass(UmpleClass aSubClass)
  {
    int index = subClasses.indexOf(aSubClass);
    return index;
  }
  /* Code from template association_GetMany */
  public UmpleTrait getSubTrait(int index)
  {
    UmpleTrait aSubTrait = subTraits.get(index);
    return aSubTrait;
  }

  public List<UmpleTrait> getSubTraits()
  {
    List<UmpleTrait> newSubTraits = Collections.unmodifiableList(subTraits);
    return newSubTraits;
  }

  public int numberOfSubTraits()
  {
    int number = subTraits.size();
    return number;
  }

  public boolean hasSubTraits()
  {
    boolean has = subTraits.size() > 0;
    return has;
  }

  public int indexOfSubTrait(UmpleTrait aSubTrait)
  {
    int index = subTraits.indexOf(aSubTrait);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCodeInjections()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addCodeInjection(CodeInjection aCodeInjection)
  {
    boolean wasAdded = false;
    if (codeInjections.contains(aCodeInjection)) { return false; }
    codeInjections.add(aCodeInjection);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCodeInjection(CodeInjection aCodeInjection)
  {
    boolean wasRemoved = false;
    if (codeInjections.contains(aCodeInjection))
    {
      codeInjections.remove(aCodeInjection);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCodeInjectionAt(CodeInjection aCodeInjection, int index)
  {  
    boolean wasAdded = false;
    if(addCodeInjection(aCodeInjection))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCodeInjections()) { index = numberOfCodeInjections() - 1; }
      codeInjections.remove(aCodeInjection);
      codeInjections.add(index, aCodeInjection);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCodeInjectionAt(CodeInjection aCodeInjection, int index)
  {
    boolean wasAdded = false;
    if(codeInjections.contains(aCodeInjection))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCodeInjections()) { index = numberOfCodeInjections() - 1; }
      codeInjections.remove(aCodeInjection);
      codeInjections.add(index, aCodeInjection);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCodeInjectionAt(aCodeInjection, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPreConds()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addPreCond(Precondition aPreCond)
  {
    boolean wasAdded = false;
    if (preConds.contains(aPreCond)) { return false; }
    preConds.add(aPreCond);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePreCond(Precondition aPreCond)
  {
    boolean wasRemoved = false;
    if (preConds.contains(aPreCond))
    {
      preConds.remove(aPreCond);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPreCondAt(Precondition aPreCond, int index)
  {  
    boolean wasAdded = false;
    if(addPreCond(aPreCond))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPreConds()) { index = numberOfPreConds() - 1; }
      preConds.remove(aPreCond);
      preConds.add(index, aPreCond);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePreCondAt(Precondition aPreCond, int index)
  {
    boolean wasAdded = false;
    if(preConds.contains(aPreCond))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPreConds()) { index = numberOfPreConds() - 1; }
      preConds.remove(aPreCond);
      preConds.add(index, aPreCond);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPreCondAt(aPreCond, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPostConds()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addPostCond(Postcondition aPostCond)
  {
    boolean wasAdded = false;
    if (postConds.contains(aPostCond)) { return false; }
    postConds.add(aPostCond);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePostCond(Postcondition aPostCond)
  {
    boolean wasRemoved = false;
    if (postConds.contains(aPostCond))
    {
      postConds.remove(aPostCond);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPostCondAt(Postcondition aPostCond, int index)
  {  
    boolean wasAdded = false;
    if(addPostCond(aPostCond))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPostConds()) { index = numberOfPostConds() - 1; }
      postConds.remove(aPostCond);
      postConds.add(index, aPostCond);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePostCondAt(Postcondition aPostCond, int index)
  {
    boolean wasAdded = false;
    if(postConds.contains(aPostCond))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPostConds()) { index = numberOfPostConds() - 1; }
      postConds.remove(aPostCond);
      postConds.add(index, aPostCond);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPostCondAt(aPostCond, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfConstraintTrees()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addConstraintTree(ConstraintTree aConstraintTree)
  {
    boolean wasAdded = false;
    if (constraintTrees.contains(aConstraintTree)) { return false; }
    constraintTrees.add(aConstraintTree);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeConstraintTree(ConstraintTree aConstraintTree)
  {
    boolean wasRemoved = false;
    if (constraintTrees.contains(aConstraintTree))
    {
      constraintTrees.remove(aConstraintTree);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addConstraintTreeAt(ConstraintTree aConstraintTree, int index)
  {  
    boolean wasAdded = false;
    if(addConstraintTree(aConstraintTree))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstraintTrees()) { index = numberOfConstraintTrees() - 1; }
      constraintTrees.remove(aConstraintTree);
      constraintTrees.add(index, aConstraintTree);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveConstraintTreeAt(ConstraintTree aConstraintTree, int index)
  {
    boolean wasAdded = false;
    if(constraintTrees.contains(aConstraintTree))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstraintTrees()) { index = numberOfConstraintTrees() - 1; }
      constraintTrees.remove(aConstraintTree);
      constraintTrees.add(index, aConstraintTree);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addConstraintTreeAt(aConstraintTree, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfExtendsTraits()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addExtendsTrait(UmpleTrait aExtendsTrait)
  {
    boolean wasAdded = false;
    if (extendsTraits.contains(aExtendsTrait)) { return false; }
    extendsTraits.add(aExtendsTrait);
    if (aExtendsTrait.indexOfSubTrait(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aExtendsTrait.addSubTrait(this);
      if (!wasAdded)
      {
        extendsTraits.remove(aExtendsTrait);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeExtendsTrait(UmpleTrait aExtendsTrait)
  {
    boolean wasRemoved = false;
    if (!extendsTraits.contains(aExtendsTrait))
    {
      return wasRemoved;
    }

    int oldIndex = extendsTraits.indexOf(aExtendsTrait);
    extendsTraits.remove(oldIndex);
    if (aExtendsTrait.indexOfSubTrait(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aExtendsTrait.removeSubTrait(this);
      if (!wasRemoved)
      {
        extendsTraits.add(oldIndex,aExtendsTrait);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addExtendsTraitAt(UmpleTrait aExtendsTrait, int index)
  {  
    boolean wasAdded = false;
    if(addExtendsTrait(aExtendsTrait))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExtendsTraits()) { index = numberOfExtendsTraits() - 1; }
      extendsTraits.remove(aExtendsTrait);
      extendsTraits.add(index, aExtendsTrait);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveExtendsTraitAt(UmpleTrait aExtendsTrait, int index)
  {
    boolean wasAdded = false;
    if(extendsTraits.contains(aExtendsTrait))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExtendsTraits()) { index = numberOfExtendsTraits() - 1; }
      extendsTraits.remove(aExtendsTrait);
      extendsTraits.add(index, aExtendsTrait);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addExtendsTraitAt(aExtendsTrait, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setUniqueIdentifier(UniqueIdentifier aNewUniqueIdentifier)
  {
    boolean wasSet = false;
    uniqueIdentifier = aNewUniqueIdentifier;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAttributes()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addAttribute(Attribute aAttribute)
  {
    boolean wasAdded = false;
    if (attributes.contains(aAttribute)) { return false; }
    UmpleTrait existingUmpleTrait = aAttribute.getUmpleTrait();
    if (existingUmpleTrait == null)
    {
      aAttribute.setUmpleTrait(this);
    }
    else if (!this.equals(existingUmpleTrait))
    {
      existingUmpleTrait.removeAttribute(aAttribute);
      addAttribute(aAttribute);
    }
    else
    {
      attributes.add(aAttribute);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAttribute(Attribute aAttribute)
  {
    boolean wasRemoved = false;
    if (attributes.contains(aAttribute))
    {
      attributes.remove(aAttribute);
      aAttribute.setUmpleTrait(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAttributeAt(Attribute aAttribute, int index)
  {  
    boolean wasAdded = false;
    if(addAttribute(aAttribute))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAttributes()) { index = numberOfAttributes() - 1; }
      attributes.remove(aAttribute);
      attributes.add(index, aAttribute);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAttributeAt(Attribute aAttribute, int index)
  {
    boolean wasAdded = false;
    if(attributes.contains(aAttribute))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAttributes()) { index = numberOfAttributes() - 1; }
      attributes.remove(aAttribute);
      attributes.add(index, aAttribute);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAttributeAt(aAttribute, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAssociationVariables()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addAssociationVariable(AssociationVariable aAssociationVariable)
  {
    boolean wasAdded = false;
    if (associationVariables.contains(aAssociationVariable)) { return false; }
    UmpleTrait existingUmpleTrait = aAssociationVariable.getUmpleTrait();
    if (existingUmpleTrait == null)
    {
      aAssociationVariable.setUmpleTrait(this);
    }
    else if (!this.equals(existingUmpleTrait))
    {
      existingUmpleTrait.removeAssociationVariable(aAssociationVariable);
      addAssociationVariable(aAssociationVariable);
    }
    else
    {
      associationVariables.add(aAssociationVariable);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAssociationVariable(AssociationVariable aAssociationVariable)
  {
    boolean wasRemoved = false;
    if (associationVariables.contains(aAssociationVariable))
    {
      associationVariables.remove(aAssociationVariable);
      aAssociationVariable.setUmpleTrait(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAssociationVariableAt(AssociationVariable aAssociationVariable, int index)
  {  
    boolean wasAdded = false;
    if(addAssociationVariable(aAssociationVariable))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociationVariables()) { index = numberOfAssociationVariables() - 1; }
      associationVariables.remove(aAssociationVariable);
      associationVariables.add(index, aAssociationVariable);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAssociationVariableAt(AssociationVariable aAssociationVariable, int index)
  {
    boolean wasAdded = false;
    if(associationVariables.contains(aAssociationVariable))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociationVariables()) { index = numberOfAssociationVariables() - 1; }
      associationVariables.remove(aAssociationVariable);
      associationVariables.add(index, aAssociationVariable);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAssociationVariableAt(aAssociationVariable, index);
    }
    return wasAdded;
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGeneralTemplateParameters()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addGeneralTemplateParameter(GeneralTemplateParameter aGeneralTemplateParameter)
  {
    boolean wasAdded = false;
    if (generalTemplateParameters.contains(aGeneralTemplateParameter)) { return false; }
    generalTemplateParameters.add(aGeneralTemplateParameter);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeGeneralTemplateParameter(GeneralTemplateParameter aGeneralTemplateParameter)
  {
    boolean wasRemoved = false;
    if (generalTemplateParameters.contains(aGeneralTemplateParameter))
    {
      generalTemplateParameters.remove(aGeneralTemplateParameter);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGeneralTemplateParameterAt(GeneralTemplateParameter aGeneralTemplateParameter, int index)
  {  
    boolean wasAdded = false;
    if(addGeneralTemplateParameter(aGeneralTemplateParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGeneralTemplateParameters()) { index = numberOfGeneralTemplateParameters() - 1; }
      generalTemplateParameters.remove(aGeneralTemplateParameter);
      generalTemplateParameters.add(index, aGeneralTemplateParameter);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGeneralTemplateParameterAt(GeneralTemplateParameter aGeneralTemplateParameter, int index)
  {
    boolean wasAdded = false;
    if(generalTemplateParameters.contains(aGeneralTemplateParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGeneralTemplateParameters()) { index = numberOfGeneralTemplateParameters() - 1; }
      generalTemplateParameters.remove(aGeneralTemplateParameter);
      generalTemplateParameters.add(index, aGeneralTemplateParameter);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGeneralTemplateParameterAt(aGeneralTemplateParameter, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGeneralTPApplieds()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addGeneralTPApplied(GeneralTPApplied aGeneralTPApplied)
  {
    boolean wasAdded = false;
    if (generalTPApplieds.contains(aGeneralTPApplied)) { return false; }
    generalTPApplieds.add(aGeneralTPApplied);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeGeneralTPApplied(GeneralTPApplied aGeneralTPApplied)
  {
    boolean wasRemoved = false;
    if (generalTPApplieds.contains(aGeneralTPApplied))
    {
      generalTPApplieds.remove(aGeneralTPApplied);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGeneralTPAppliedAt(GeneralTPApplied aGeneralTPApplied, int index)
  {  
    boolean wasAdded = false;
    if(addGeneralTPApplied(aGeneralTPApplied))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGeneralTPApplieds()) { index = numberOfGeneralTPApplieds() - 1; }
      generalTPApplieds.remove(aGeneralTPApplied);
      generalTPApplieds.add(index, aGeneralTPApplied);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGeneralTPAppliedAt(GeneralTPApplied aGeneralTPApplied, int index)
  {
    boolean wasAdded = false;
    if(generalTPApplieds.contains(aGeneralTPApplied))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGeneralTPApplieds()) { index = numberOfGeneralTPApplieds() - 1; }
      generalTPApplieds.remove(aGeneralTPApplied);
      generalTPApplieds.add(index, aGeneralTPApplied);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGeneralTPAppliedAt(aGeneralTPApplied, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRequiredInterfaces()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addRequiredInterface(UmpleInterface aRequiredInterface)
  {
    boolean wasAdded = false;
    if (requiredInterfaces.contains(aRequiredInterface)) { return false; }
    requiredInterfaces.add(aRequiredInterface);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeRequiredInterface(UmpleInterface aRequiredInterface)
  {
    boolean wasRemoved = false;
    if (requiredInterfaces.contains(aRequiredInterface))
    {
      requiredInterfaces.remove(aRequiredInterface);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addRequiredInterfaceAt(UmpleInterface aRequiredInterface, int index)
  {  
    boolean wasAdded = false;
    if(addRequiredInterface(aRequiredInterface))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRequiredInterfaces()) { index = numberOfRequiredInterfaces() - 1; }
      requiredInterfaces.remove(aRequiredInterface);
      requiredInterfaces.add(index, aRequiredInterface);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRequiredInterfaceAt(UmpleInterface aRequiredInterface, int index)
  {
    boolean wasAdded = false;
    if(requiredInterfaces.contains(aRequiredInterface))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRequiredInterfaces()) { index = numberOfRequiredInterfaces() - 1; }
      requiredInterfaces.remove(aRequiredInterface);
      requiredInterfaces.add(index, aRequiredInterface);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRequiredInterfaceAt(aRequiredInterface, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmpleTestCases()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addUmpleTestCase(UmpleTestCase aUmpleTestCase)
  {
    boolean wasAdded = false;
    if (umpleTestCases.contains(aUmpleTestCase)) { return false; }
    UmpleTrait existingUmpleTrait = aUmpleTestCase.getUmpleTrait();
    if (existingUmpleTrait == null)
    {
      aUmpleTestCase.setUmpleTrait(this);
    }
    else if (!this.equals(existingUmpleTrait))
    {
      existingUmpleTrait.removeUmpleTestCase(aUmpleTestCase);
      addUmpleTestCase(aUmpleTestCase);
    }
    else
    {
      umpleTestCases.add(aUmpleTestCase);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUmpleTestCase(UmpleTestCase aUmpleTestCase)
  {
    boolean wasRemoved = false;
    if (umpleTestCases.contains(aUmpleTestCase))
    {
      umpleTestCases.remove(aUmpleTestCase);
      aUmpleTestCase.setUmpleTrait(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmpleTestCaseAt(UmpleTestCase aUmpleTestCase, int index)
  {  
    boolean wasAdded = false;
    if(addUmpleTestCase(aUmpleTestCase))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleTestCases()) { index = numberOfUmpleTestCases() - 1; }
      umpleTestCases.remove(aUmpleTestCase);
      umpleTestCases.add(index, aUmpleTestCase);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmpleTestCaseAt(UmpleTestCase aUmpleTestCase, int index)
  {
    boolean wasAdded = false;
    if(umpleTestCases.contains(aUmpleTestCase))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleTestCases()) { index = numberOfUmpleTestCases() - 1; }
      umpleTestCases.remove(aUmpleTestCase);
      umpleTestCases.add(index, aUmpleTestCase);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmpleTestCaseAt(aUmpleTestCase, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStateMachines()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addStateMachine(StateMachine aStateMachine)
  {
    boolean wasAdded = false;
    if (stateMachines.contains(aStateMachine)) { return false; }
    UmpleTrait existingUmpleTrait = aStateMachine.getUmpleTrait();
    if (existingUmpleTrait == null)
    {
      aStateMachine.setUmpleTrait(this);
    }
    else if (!this.equals(existingUmpleTrait))
    {
      existingUmpleTrait.removeStateMachine(aStateMachine);
      addStateMachine(aStateMachine);
    }
    else
    {
      stateMachines.add(aStateMachine);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStateMachine(StateMachine aStateMachine)
  {
    boolean wasRemoved = false;
    if (stateMachines.contains(aStateMachine))
    {
      stateMachines.remove(aStateMachine);
      aStateMachine.setUmpleTrait(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStateMachineAt(StateMachine aStateMachine, int index)
  {  
    boolean wasAdded = false;
    if(addStateMachine(aStateMachine))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStateMachines()) { index = numberOfStateMachines() - 1; }
      stateMachines.remove(aStateMachine);
      stateMachines.add(index, aStateMachine);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStateMachineAt(StateMachine aStateMachine, int index)
  {
    boolean wasAdded = false;
    if(stateMachines.contains(aStateMachine))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStateMachines()) { index = numberOfStateMachines() - 1; }
      stateMachines.remove(aStateMachine);
      stateMachines.add(index, aStateMachine);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStateMachineAt(aStateMachine, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSubClasses()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSubClass(UmpleClass aSubClass)
  {
    boolean wasAdded = false;
    if (subClasses.contains(aSubClass)) { return false; }
    subClasses.add(aSubClass);
    if (aSubClass.indexOfExtendsTrait(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSubClass.addExtendsTrait(this);
      if (!wasAdded)
      {
        subClasses.remove(aSubClass);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSubClass(UmpleClass aSubClass)
  {
    boolean wasRemoved = false;
    if (!subClasses.contains(aSubClass))
    {
      return wasRemoved;
    }

    int oldIndex = subClasses.indexOf(aSubClass);
    subClasses.remove(oldIndex);
    if (aSubClass.indexOfExtendsTrait(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSubClass.removeExtendsTrait(this);
      if (!wasRemoved)
      {
        subClasses.add(oldIndex,aSubClass);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSubClassAt(UmpleClass aSubClass, int index)
  {  
    boolean wasAdded = false;
    if(addSubClass(aSubClass))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSubClasses()) { index = numberOfSubClasses() - 1; }
      subClasses.remove(aSubClass);
      subClasses.add(index, aSubClass);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSubClassAt(UmpleClass aSubClass, int index)
  {
    boolean wasAdded = false;
    if(subClasses.contains(aSubClass))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSubClasses()) { index = numberOfSubClasses() - 1; }
      subClasses.remove(aSubClass);
      subClasses.add(index, aSubClass);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSubClassAt(aSubClass, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSubTraits()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSubTrait(UmpleTrait aSubTrait)
  {
    boolean wasAdded = false;
    if (subTraits.contains(aSubTrait)) { return false; }
    subTraits.add(aSubTrait);
    if (aSubTrait.indexOfExtendsTrait(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSubTrait.addExtendsTrait(this);
      if (!wasAdded)
      {
        subTraits.remove(aSubTrait);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSubTrait(UmpleTrait aSubTrait)
  {
    boolean wasRemoved = false;
    if (!subTraits.contains(aSubTrait))
    {
      return wasRemoved;
    }

    int oldIndex = subTraits.indexOf(aSubTrait);
    subTraits.remove(oldIndex);
    if (aSubTrait.indexOfExtendsTrait(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSubTrait.removeExtendsTrait(this);
      if (!wasRemoved)
      {
        subTraits.add(oldIndex,aSubTrait);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSubTraitAt(UmpleTrait aSubTrait, int index)
  {  
    boolean wasAdded = false;
    if(addSubTrait(aSubTrait))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSubTraits()) { index = numberOfSubTraits() - 1; }
      subTraits.remove(aSubTrait);
      subTraits.add(index, aSubTrait);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSubTraitAt(UmpleTrait aSubTrait, int index)
  {
    boolean wasAdded = false;
    if(subTraits.contains(aSubTrait))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSubTraits()) { index = numberOfSubTraits() - 1; }
      subTraits.remove(aSubTrait);
      subTraits.add(index, aSubTrait);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSubTraitAt(aSubTrait, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    codeInjections.clear();
    preConds.clear();
    postConds.clear();
    constraintTrees.clear();
    ArrayList<UmpleTrait> copyOfExtendsTraits = new ArrayList<UmpleTrait>(extendsTraits);
    extendsTraits.clear();
    for(UmpleTrait aExtendsTrait : copyOfExtendsTraits)
    {
      aExtendsTrait.removeSubTrait(this);
    }
    uniqueIdentifier = null;
    while( !attributes.isEmpty() )
    {
      attributes.get(0).setUmpleTrait(null);
    }
    while( !associationVariables.isEmpty() )
    {
      associationVariables.get(0).setUmpleTrait(null);
    }
    comments.clear();
    generalTemplateParameters.clear();
    generalTPApplieds.clear();
    requiredInterfaces.clear();
    while( !umpleTestCases.isEmpty() )
    {
      umpleTestCases.get(0).setUmpleTrait(null);
    }
    while( !stateMachines.isEmpty() )
    {
      stateMachines.get(0).setUmpleTrait(null);
    }
    ArrayList<UmpleClass> copyOfSubClasses = new ArrayList<UmpleClass>(subClasses);
    subClasses.clear();
    for(UmpleClass aSubClass : copyOfSubClasses)
    {
      aSubClass.removeExtendsTrait(this);
    }
    ArrayList<UmpleTrait> copyOfSubTraits = new ArrayList<UmpleTrait>(subTraits);
    subTraits.clear();
    for(UmpleTrait aSubTrait : copyOfSubTraits)
    {
      aSubTrait.removeExtendsTrait(this);
    }
    super.delete();
  }

  // line 41 "../../../../src/Umple_Code_Trait.ump"
   public GeneralTPApplied getGeneralTPAppliedByName(String name){
    for (GeneralTPApplied gTPApplied : getGeneralTPApplieds()) {
			if (gTPApplied.getInheritanceName().equals(name)) {
				return gTPApplied;
			}
		}
		return null;
  }

  // line 49 "../../../../src/Umple_Code_Trait.ump"
   public boolean hasGeneralTemplateParameter(String name){
    for (GeneralTemplateParameter gtParameter : getGeneralTemplateParameters()) {
			if (gtParameter.getName().equals(name)) return true;
		}
		return false;
  }

  // line 56 "../../../../src/Umple_Code_Trait.ump"
   public boolean hasCascadeMethod(Method aMethod, Boolean inAbstract){
    if (hasMethod(aMethod) && getMethod(aMethod).isIsAbstract() ==inAbstract ) return  true;
	  if (hasExtendsTraits()) {
		  for (UmpleTrait uTrait : getExtendsTraits()) {
			  if (uTrait.hasCascadeMethod(aMethod,inAbstract)) {
				  return true; 
			  }
		  }
	  }	  
	  return false;
  }

  // line 69 "../../../../src/Umple_Code_Trait.ump"
   public Attribute getAttribute(String name){
    for (Attribute av : attributes)
    {
      if (av.getName().equals(name))
      {
        return av;
      }
    }
    return null;
  }

  // line 81 "../../../../src/Umple_Code_Trait.ump"
   public boolean isImmutable(){
    return (iAmImmutable || ancestorIsImmutable);
  }

  // line 86 "../../../../src/Umple_Code_Trait.ump"
   public boolean setImmutable(){
    boolean wasSet = false;
    	
    	if (extendsTraits != null && !ancestorIsImmutable) { return wasSet; }
    	
    	if (propagateImmutabilityToAllRelationships(true)) 
    	{ 
      	iAmImmutable = true;
      	wasSet = true;
    	}	
    	
    	return wasSet;
  }


  /**
   * 
   */
  // line 100 "../../../../src/Umple_Code_Trait.ump"
   private boolean propagateImmutabilityToAllRelationships(boolean isImmutable){
    if (isImmutable)
	    {

        Label_StateMachine_145: ;
        Label_StateMachine_27: ;
        Label_Association_28: ;
	    }	    
	    return notifySubclassesAncestorImmutable(isImmutable);
  }

  // line 114 "../../../../src/Umple_Code_Trait.ump"
   private boolean notifySubclassesAncestorImmutable(boolean isImmutable){
    boolean notified = true;
    List<UmpleTrait> wereSet = new ArrayList<UmpleTrait>();
    for (UmpleTrait subtrait : getSubTraits())
    {
      notified = subtrait.setAncestorIsImmutable(isImmutable);
      if (!notified)
      {
        for (UmpleTrait wasSet : wereSet)
        {
          wasSet.setAncestorIsImmutable(!isImmutable);
        }
        return notified;
      }
    }
    return notified;
  }

  // line 132 "../../../../src/Umple_Code_Trait.ump"
   protected boolean setAncestorIsImmutable(boolean isImmutable){
    if (iAmImmutable)
    {
      ancestorIsImmutable = isImmutable;
      return true;
    }
    else
    {
      boolean success = propagateImmutabilityToAllRelationships(isImmutable);
      if (success) { ancestorIsImmutable = isImmutable; }
      return success;
    }
  }

  // line 146 "../../../../src/Umple_Code_Trait.ump"
   private boolean enforceImmutabilityInheritanceRules(UmpleTrait newSuperTrait){
    // A subclass may not be immutable if the superclass is not immutable
    if (iAmImmutable && newSuperTrait != null && !newSuperTrait.isImmutable()) { return false; }
    boolean ancestorImmutable = (newSuperTrait == null) ? false : newSuperTrait.isImmutable();
    return setAncestorIsImmutable(ancestorImmutable);
  }

  // line 154 "../../../../src/Umple_Code_Trait.ump"
   public boolean setExtendsTrait(UmpleTrait aExtendsTrait){
    boolean wasSet = false;
    
    if (!enforceImmutabilityInheritanceRules(aExtendsTrait)) { return false; }
    //TODO I changed original code in order to run the program. Later, I should provide multi inheritance checking.
    UmpleTrait existingExtendsTrait = extendsTraits.get(0);
    extendsTraits.add(0, aExtendsTrait);
    if (existingExtendsTrait != null && !existingExtendsTrait.equals(aExtendsTrait))
    {
      existingExtendsTrait.removeSubTrait(this);
    }
    if (aExtendsTrait != null)
    {
      aExtendsTrait.addSubTrait(this);
    }
    wasSet = true;
    // line 727 "../../../../src/Umple_Code.ump"
    if(aExtendsTrait!=null&&aExtendsTrait.getMethods()!=null)
        for(Method method:aExtendsTrait.getMethods())
        {
          if(this.hasMethod(method))
          {
            Method aMethod = this.getMethod(method);
            
            if(aMethod.getMethodBody().getExtraCode("")==null||"".equals(aMethod.getMethodBody().getExtraCode("")))
            {
              aMethod.getMethodBody().setExtraCode("",method.getMethodBody().getExtraCode(""));
              while(aMethod.hasMethodParameters())
              {
                aMethod.removeMethodParameter(aMethod.getMethodParameter(0));
              }
              for(MethodParameter mp:method.getMethodParameters())
              {
                aMethod.addMethodParameter(mp);
              }
              if(!"".equals(aMethod.getMethodBody().getExtraCode("")))
              {
                aMethod.setIsImplemented(false);
              }
            }
          }
        }
    return wasSet;
  }

  // line 199 "../../../../src/Umple_Code_Trait.ump"
   public Method getMethod(Method comparedMethod){
    String methodName = comparedMethod.getName();
    int numberOfParams = comparedMethod.getMethodParameters().size();
    for (Method aMethod : this.getMethods()){
      // Compare method names
      if (aMethod.getName().equals(methodName)){  
        // Now compare parameters
        if (numberOfParams == aMethod.getMethodParameters().size())
        {
          boolean allSame = true;
          for (int i = 0; i < numberOfParams; i++)
          {
            if(!aMethod.getMethodParameter(i).getType().equals(comparedMethod.getMethodParameter(i).getType()))
            {
              allSame = false;
              break;
            }
          }
          if(allSame)
          {
            return aMethod;
          }
        }
      }
    }
    return null;
  }


  /**
   * 
   */
  // line 228 "../../../../src/Umple_Code_Trait.ump"
   public boolean hasMethod(Method comparedMethod){
    if (getMethod(comparedMethod) != null) return true;
	return false;
  }


  /**
   * This section is related to codes which is going to support general templates for traits
   * --------------------------------------------------------------------------------------
   * ----------------------------------start-----------------------------------------------
   */
  // line 237 "../../../../src/Umple_Code_Trait.ump"
   public boolean hasDefinedParameter(String name, String type){
    for (GeneralTemplateParameter gTparameter : getGeneralTemplateParameters()) {
			if (gTparameter.getName().equals(name) && gTparameter.getType().equals(type)) return true;
		}
		return false;
  }

  // line 244 "../../../../src/Umple_Code_Trait.ump"
   public void setDefinedParameterType(String name, String type){
    for (GeneralTemplateParameter gTparameter : getGeneralTemplateParameters()) {
			if (gTparameter.getName().equals(name)) gTparameter.setType(type);
		}
  }

  // line 250 "../../../../src/Umple_Code_Trait.ump"
   public Integer getGeneralTemplateParameterIndexByName(String name, String type){
    for (int i = 0; i<numberOfGeneralTemplateParameters();i++) {
			if(getGeneralTemplateParameter(i).getName().equals(name) && getGeneralTemplateParameter(i).getType().equals(type)) {
				return i;
			}
		}
		return -1;
  }

  // line 259 "../../../../src/Umple_Code_Trait.ump"
   public GeneralTemplateParameter getGeneralTemplateParameterByName(String name){
    for (int i = 0; i<numberOfGeneralTemplateParameters();i++) {
      if(getGeneralTemplateParameter(i).getName().equals(name)) {
        return getGeneralTemplateParameter(i);
      }
    }
    return null;
  }

  // line 7 "../../../../src/Association_refactored.ump"
   public AssociationVariable getAssociationVariable(String name){
    for (AssociationVariable av : associationVariables)
    {
      if (av.getName().equals(name))
      {
        return av;
      }
    }
    return null;
  }


  /**
   * --- before addDepend { if (depends.contains(aDepend)) { return false; } }
   * --- before setImmutable { if (!canBeImmutable()) { return false; } }
   * --- before addAssociationVariable { if (!immutabilityAssociationRulesSatisfied(aAssociationVariable, this.isImmutable())) { return false; } }
   * --- before setExtendsTrait { if (!enforceImmutabilityInheritanceRules(aExtendsClass)) { return false; } }
   */
  // line 823 "../../../../src/Umple.ump"
  public boolean isUmpleTrait(){
    return true;
  }


  public String toString()
  {
    return super.toString() + "["+
            "isAbstract" + ":" + getIsAbstract()+ "," +
            "isSingleton" + ":" + getIsSingleton()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "key" + "=" + (getKey() != null ? !getKey().equals(this)  ? getKey().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "uniqueIdentifier = "+(getUniqueIdentifier()!=null?Integer.toHexString(System.identityHashCode(getUniqueIdentifier())):"null");
  }
}