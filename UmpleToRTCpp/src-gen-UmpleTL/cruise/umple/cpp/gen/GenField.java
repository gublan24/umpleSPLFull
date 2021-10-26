/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

// line 820 "../../../../../UmpleTLTemplates/Core.ump"
// line 506 "../../../../../UmpleTLTemplates/Attributes.ump"
// line 853 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenField implements java.io.Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "this->";
  public static final String TEXT_1 = "= ";
  public static final String TEXT_2 = ";";
  public static final String TEXT_3 = "this->";
  public static final String TEXT_4 = "= ";
  public static final String TEXT_5 = "++;";
  public static final String TEXT_6 = NL + "  ";
  public static final String TEXT_7 = "static ";
  public static final String TEXT_8 = "const ";
  public static final String TEXT_9 = " ";
  public static final String TEXT_10 = ";";
  public static final String TEXT_11 = "const ";
  public static final String TEXT_12 = " ";
  public static final String TEXT_13 = "::";
  public static final String TEXT_14 = "= ";
  public static final String TEXT_15 = ";";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenField Attributes
  private GenGroup group;
  private boolean isIdentifier;
  private String type;
  private String name;
  private boolean destructible;
  private boolean isStatic;
  private boolean isConstant;
  private boolean isMany;
  private boolean isEnum;
  private String autounique;
  private String value;
  private boolean parameterized;
  private boolean generatable;
  private boolean normalize;
  private GenMethod relatedMethod;
  private String visibility;
  private int priority;
  private boolean remote;
  private boolean isPointer;
  private boolean isReference;
  private boolean settable;
  private boolean isComparable;
  private transient Comparator<GenComment> commentsPriority;
  private transient Comparator<GenRequirement> requirementsPriority;

  //GenField Associations
  private List<GenComment> comments;
  private List<GenRequirement> requirements;
  private List<GenFieldGeneric> generics;
  private List<GenFieldInitializer> initializers;
  private GenClass genClass;
  private List<GenMethod> genMethods;
  private GenStruct genStruct;
  private GenAssociation relatedAssociation;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenField()
  {
    isIdentifier = false;
    type = null;
    name = null;
    destructible = false;
    isStatic = false;
    isConstant = false;
    isMany = false;
    isEnum = false;
    autounique = null;
    value = null;
    parameterized = false;
    generatable = true;
    normalize = false;
    visibility = "private";
    priority = 0;
    remote = false;
    isPointer = false;
    isReference = false;
    settable = false;
    isComparable = true;
    commentsPriority = 
      Comparator.comparing(GenComment::getPriority);
    requirementsPriority = 
      Comparator.comparing(GenRequirement::getPriority);
    comments = new ArrayList<GenComment>();
    requirements = new ArrayList<GenRequirement>();
    generics = new ArrayList<GenFieldGeneric>();
    initializers = new ArrayList<GenFieldInitializer>();
    genMethods = new ArrayList<GenMethod>();
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

  public boolean setIsIdentifier(boolean aIsIdentifier)
  {
    boolean wasSet = false;
    isIdentifier = aIsIdentifier;
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

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setDestructible(boolean aDestructible)
  {
    boolean wasSet = false;
    destructible = aDestructible;
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

  public boolean setIsConstant(boolean aIsConstant)
  {
    boolean wasSet = false;
    isConstant = aIsConstant;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsMany(boolean aIsMany)
  {
    boolean wasSet = false;
    isMany = aIsMany;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsEnum(boolean aIsEnum)
  {
    boolean wasSet = false;
    isEnum = aIsEnum;
    wasSet = true;
    return wasSet;
  }

  public boolean setAutounique(String aAutounique)
  {
    boolean wasSet = false;
    autounique = aAutounique;
    wasSet = true;
    return wasSet;
  }

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  public boolean setParameterized(boolean aParameterized)
  {
    boolean wasSet = false;
    parameterized = aParameterized;
    wasSet = true;
    return wasSet;
  }

  public boolean setGeneratable(boolean aGeneratable)
  {
    boolean wasSet = false;
    generatable = aGeneratable;
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

  public boolean setRelatedMethod(GenMethod aRelatedMethod)
  {
    boolean wasSet = false;
    relatedMethod = aRelatedMethod;
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

  public boolean setPriority(int aPriority)
  {
    boolean wasSet = false;
    priority = aPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setRemote(boolean aRemote)
  {
    boolean wasSet = false;
    remote = aRemote;
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

  public boolean setSettable(boolean aSettable)
  {
    boolean wasSet = false;
    settable = aSettable;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsComparable(boolean aIsComparable)
  {
    boolean wasSet = false;
    isComparable = aIsComparable;
    wasSet = true;
    return wasSet;
  }

  public boolean setCommentsPriority(Comparator<GenComment> aCommentsPriority)
  {
    boolean wasSet = false;
    commentsPriority = aCommentsPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setRequirementsPriority(Comparator<GenRequirement> aRequirementsPriority)
  {
    boolean wasSet = false;
    requirementsPriority = aRequirementsPriority;
    wasSet = true;
    return wasSet;
  }

  public GenGroup getGroup()
  {
    return group;
  }

  public boolean getIsIdentifier()
  {
    return isIdentifier;
  }

  public String getType()
  {
    return type;
  }

  public String getName()
  {
    return name;
  }

  public boolean getDestructible()
  {
    return destructible;
  }

  public boolean getIsStatic()
  {
    return isStatic;
  }

  public boolean getIsConstant()
  {
    // line 537 "../../../../../UmpleTLTemplates/Attributes.ump"
    if(normalize){
    			return getGenClass().getGenPackage().isPrimitive(type);
    		}
    // END OF UMPLE BEFORE INJECTION
    return isConstant;
  }

  public boolean getIsMany()
  {
    return isMany;
  }

  public boolean getIsEnum()
  {
    return isEnum;
  }

  public String getAutounique()
  {
    return autounique;
  }

  public String getValue()
  {
    return value;
  }

  public boolean getParameterized()
  {
    return parameterized;
  }

  public boolean getGeneratable()
  {
    return generatable;
  }

  /**
   * TODO: Duplicated code from GenMethod
   */
  public boolean getNormalize()
  {
    return normalize;
  }

  public String getSortKey()
  {
    return getRelatedAssociation()== null? null: getRelatedAssociation().getSortKey();
  }

  /**
   * Use association instead
   */
  public GenMethod getRelatedMethod()
  {
    return relatedMethod;
  }

  public String getVisibility()
  {
    // line 595 "../../../../../UmpleTLTemplates/Attributes.ump"
    if(visibility== null){
    			return "private";
    		}
    // END OF UMPLE BEFORE INJECTION
    return visibility;
  }

  public int getPriority()
  {
    return priority;
  }

  /**
   * CPP-specfific
   */
  public boolean getRemote()
  {
    return remote;
  }

  public boolean getIsPointer()
  {
    // line 543 "../../../../../UmpleTLTemplates/Attributes.ump"
    if(normalize){
    			return getGenClass().getGenPackage().isPointer(type);
    		}
    // END OF UMPLE BEFORE INJECTION
    return isPointer;
  }

  public boolean getIsReference()
  {
    return isReference;
  }

  public boolean getSettable()
  {
    return settable;
  }

  public boolean getIsComparable()
  {
    return isComparable;
  }

  public Comparator<GenComment> getCommentsPriority()
  {
    return commentsPriority;
  }

  public Comparator<GenRequirement> getRequirementsPriority()
  {
    return requirementsPriority;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsIdentifier()
  {
    return isIdentifier;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isDestructible()
  {
    return destructible;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsStatic()
  {
    return isStatic;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsConstant()
  {
    return isConstant;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsMany()
  {
    return isMany;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsEnum()
  {
    return isEnum;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isParameterized()
  {
    return parameterized;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isGeneratable()
  {
    return generatable;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isNormalize()
  {
    return normalize;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isRemote()
  {
    return remote;
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
  public boolean isSettable()
  {
    return settable;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsComparable()
  {
    return isComparable;
  }
  /* Code from template association_GetMany */
  public GenComment getComment(int index)
  {
    GenComment aComment = comments.get(index);
    return aComment;
  }

  public List<GenComment> getComments()
  {
    List<GenComment> newComments = Collections.unmodifiableList(comments);
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

  public int indexOfComment(GenComment aComment)
  {
    int index = comments.indexOf(aComment);
    return index;
  }
  /* Code from template association_GetMany */
  public GenRequirement getRequirement(int index)
  {
    GenRequirement aRequirement = requirements.get(index);
    return aRequirement;
  }

  public List<GenRequirement> getRequirements()
  {
    List<GenRequirement> newRequirements = Collections.unmodifiableList(requirements);
    return newRequirements;
  }

  public int numberOfRequirements()
  {
    int number = requirements.size();
    return number;
  }

  public boolean hasRequirements()
  {
    boolean has = requirements.size() > 0;
    return has;
  }

  public int indexOfRequirement(GenRequirement aRequirement)
  {
    int index = requirements.indexOf(aRequirement);
    return index;
  }
  /* Code from template association_GetMany */
  public GenFieldGeneric getGeneric(int index)
  {
    GenFieldGeneric aGeneric = generics.get(index);
    return aGeneric;
  }

  public List<GenFieldGeneric> getGenerics()
  {
    List<GenFieldGeneric> newGenerics = Collections.unmodifiableList(generics);
    return newGenerics;
  }

  public int numberOfGenerics()
  {
    int number = generics.size();
    return number;
  }

  public boolean hasGenerics()
  {
    boolean has = generics.size() > 0;
    return has;
  }

  public int indexOfGeneric(GenFieldGeneric aGeneric)
  {
    int index = generics.indexOf(aGeneric);
    return index;
  }
  /* Code from template association_GetMany */
  public GenFieldInitializer getInitializer(int index)
  {
    GenFieldInitializer aInitializer = initializers.get(index);
    return aInitializer;
  }

  public List<GenFieldInitializer> getInitializers()
  {
    List<GenFieldInitializer> newInitializers = Collections.unmodifiableList(initializers);
    return newInitializers;
  }

  public int numberOfInitializers()
  {
    int number = initializers.size();
    return number;
  }

  public boolean hasInitializers()
  {
    boolean has = initializers.size() > 0;
    return has;
  }

  public int indexOfInitializer(GenFieldInitializer aInitializer)
  {
    int index = initializers.indexOf(aInitializer);
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
  public GenMethod getGenMethod(int index)
  {
    GenMethod aGenMethod = genMethods.get(index);
    return aGenMethod;
  }

  public List<GenMethod> getGenMethods()
  {
    List<GenMethod> newGenMethods = Collections.unmodifiableList(genMethods);
    return newGenMethods;
  }

  public int numberOfGenMethods()
  {
    int number = genMethods.size();
    return number;
  }

  public boolean hasGenMethods()
  {
    boolean has = genMethods.size() > 0;
    return has;
  }

  public int indexOfGenMethod(GenMethod aGenMethod)
  {
    int index = genMethods.indexOf(aGenMethod);
    return index;
  }
  /* Code from template association_GetOne */
  public GenStruct getGenStruct()
  {
    return genStruct;
  }

  public boolean hasGenStruct()
  {
    boolean has = genStruct != null;
    return has;
  }
  /* Code from template association_GetOne */
  public GenAssociation getRelatedAssociation()
  {
    return relatedAssociation;
  }

  public boolean hasRelatedAssociation()
  {
    boolean has = relatedAssociation != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfComments()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addComment(GenComment aComment)
  {
    boolean wasAdded = false;
    if (comments.contains(aComment)) { return false; }
    GenField existingGenField = aComment.getGenField();
    if (existingGenField == null)
    {
      aComment.setGenField(this);
    }
    else if (!this.equals(existingGenField))
    {
      existingGenField.removeComment(aComment);
      addComment(aComment);
    }
    else
    {
      comments.add(aComment);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(comments, commentsPriority);
    
    return wasAdded;
  }

  public boolean removeComment(GenComment aComment)
  {
    boolean wasRemoved = false;
    if (comments.contains(aComment))
    {
      comments.remove(aComment);
      aComment.setGenField(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRequirements()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addRequirement(GenRequirement aRequirement)
  {
    boolean wasAdded = false;
    if (requirements.contains(aRequirement)) { return false; }
    GenField existingGenField = aRequirement.getGenField();
    if (existingGenField == null)
    {
      aRequirement.setGenField(this);
    }
    else if (!this.equals(existingGenField))
    {
      existingGenField.removeRequirement(aRequirement);
      addRequirement(aRequirement);
    }
    else
    {
      requirements.add(aRequirement);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(requirements, requirementsPriority);
    
    return wasAdded;
  }

  public boolean removeRequirement(GenRequirement aRequirement)
  {
    boolean wasRemoved = false;
    if (requirements.contains(aRequirement))
    {
      requirements.remove(aRequirement);
      aRequirement.setGenField(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGenerics()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addGeneric(GenFieldGeneric aGeneric)
  {
    boolean wasAdded = false;
    if (generics.contains(aGeneric)) { return false; }
    GenField existingGenField = aGeneric.getGenField();
    if (existingGenField == null)
    {
      aGeneric.setGenField(this);
    }
    else if (!this.equals(existingGenField))
    {
      existingGenField.removeGeneric(aGeneric);
      addGeneric(aGeneric);
    }
    else
    {
      generics.add(aGeneric);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeGeneric(GenFieldGeneric aGeneric)
  {
    boolean wasRemoved = false;
    if (generics.contains(aGeneric))
    {
      generics.remove(aGeneric);
      aGeneric.setGenField(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGenericAt(GenFieldGeneric aGeneric, int index)
  {  
    boolean wasAdded = false;
    if(addGeneric(aGeneric))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGenerics()) { index = numberOfGenerics() - 1; }
      generics.remove(aGeneric);
      generics.add(index, aGeneric);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGenericAt(GenFieldGeneric aGeneric, int index)
  {
    boolean wasAdded = false;
    if(generics.contains(aGeneric))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGenerics()) { index = numberOfGenerics() - 1; }
      generics.remove(aGeneric);
      generics.add(index, aGeneric);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGenericAt(aGeneric, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfInitializers()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addInitializer(GenFieldInitializer aInitializer)
  {
    boolean wasAdded = false;
    if (initializers.contains(aInitializer)) { return false; }
    GenField existingGenField = aInitializer.getGenField();
    if (existingGenField == null)
    {
      aInitializer.setGenField(this);
    }
    else if (!this.equals(existingGenField))
    {
      existingGenField.removeInitializer(aInitializer);
      addInitializer(aInitializer);
    }
    else
    {
      initializers.add(aInitializer);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeInitializer(GenFieldInitializer aInitializer)
  {
    boolean wasRemoved = false;
    if (initializers.contains(aInitializer))
    {
      initializers.remove(aInitializer);
      aInitializer.setGenField(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addInitializerAt(GenFieldInitializer aInitializer, int index)
  {  
    boolean wasAdded = false;
    if(addInitializer(aInitializer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInitializers()) { index = numberOfInitializers() - 1; }
      initializers.remove(aInitializer);
      initializers.add(index, aInitializer);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveInitializerAt(GenFieldInitializer aInitializer, int index)
  {
    boolean wasAdded = false;
    if(initializers.contains(aInitializer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInitializers()) { index = numberOfInitializers() - 1; }
      initializers.remove(aInitializer);
      initializers.add(index, aInitializer);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addInitializerAt(aInitializer, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenClass(GenClass aGenClass)
  {
    boolean wasSet = false;
    GenClass existingGenClass = genClass;
    genClass = aGenClass;
    if (existingGenClass != null && !existingGenClass.equals(aGenClass))
    {
      existingGenClass.removeField(this);
    }
    if (aGenClass != null)
    {
      aGenClass.addField(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGenMethods()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addGenMethod(GenMethod aGenMethod)
  {
    boolean wasAdded = false;
    if (genMethods.contains(aGenMethod)) { return false; }
    genMethods.add(aGenMethod);
    if (aGenMethod.indexOfRelatedField(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aGenMethod.addRelatedField(this);
      if (!wasAdded)
      {
        genMethods.remove(aGenMethod);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeGenMethod(GenMethod aGenMethod)
  {
    boolean wasRemoved = false;
    if (!genMethods.contains(aGenMethod))
    {
      return wasRemoved;
    }

    int oldIndex = genMethods.indexOf(aGenMethod);
    genMethods.remove(oldIndex);
    if (aGenMethod.indexOfRelatedField(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aGenMethod.removeRelatedField(this);
      if (!wasRemoved)
      {
        genMethods.add(oldIndex,aGenMethod);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGenMethodAt(GenMethod aGenMethod, int index)
  {  
    boolean wasAdded = false;
    if(addGenMethod(aGenMethod))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGenMethods()) { index = numberOfGenMethods() - 1; }
      genMethods.remove(aGenMethod);
      genMethods.add(index, aGenMethod);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGenMethodAt(GenMethod aGenMethod, int index)
  {
    boolean wasAdded = false;
    if(genMethods.contains(aGenMethod))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGenMethods()) { index = numberOfGenMethods() - 1; }
      genMethods.remove(aGenMethod);
      genMethods.add(index, aGenMethod);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGenMethodAt(aGenMethod, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenStruct(GenStruct aGenStruct)
  {
    boolean wasSet = false;
    GenStruct existingGenStruct = genStruct;
    genStruct = aGenStruct;
    if (existingGenStruct != null && !existingGenStruct.equals(aGenStruct))
    {
      existingGenStruct.removeField(this);
    }
    if (aGenStruct != null)
    {
      aGenStruct.addField(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setRelatedAssociation(GenAssociation aRelatedAssociation)
  {
    boolean wasSet = false;
    GenAssociation existingRelatedAssociation = relatedAssociation;
    relatedAssociation = aRelatedAssociation;
    if (existingRelatedAssociation != null && !existingRelatedAssociation.equals(aRelatedAssociation))
    {
      existingRelatedAssociation.removeRelatedField(this);
    }
    if (aRelatedAssociation != null)
    {
      aRelatedAssociation.addRelatedField(this);
    }
    wasSet = true;
    return wasSet;
  }

  /* Code from template association_sorted_serializable_readObject */ 
  private void readObject(java.io.ObjectInputStream in)
  throws Exception
  {
    in.defaultReadObject();

    commentsPriority = 
      Comparator.comparing(GenComment::getPriority);
    requirementsPriority = 
      Comparator.comparing(GenRequirement::getPriority);
  }
  
  public void delete()
  {
    while( !comments.isEmpty() )
    {
      comments.get(0).setGenField(null);
    }
    while( !requirements.isEmpty() )
    {
      requirements.get(0).setGenField(null);
    }
    while( !generics.isEmpty() )
    {
      generics.get(0).setGenField(null);
    }
    while( !initializers.isEmpty() )
    {
      initializers.get(0).setGenField(null);
    }
    if (genClass != null)
    {
      GenClass placeholderGenClass = genClass;
      this.genClass = null;
      placeholderGenClass.removeField(this);
    }
    ArrayList<GenMethod> copyOfGenMethods = new ArrayList<GenMethod>(genMethods);
    genMethods.clear();
    for(GenMethod aGenMethod : copyOfGenMethods)
    {
      aGenMethod.removeRelatedField(this);
    }
    if (genStruct != null)
    {
      GenStruct placeholderGenStruct = genStruct;
      this.genStruct = null;
      placeholderGenStruct.removeField(this);
    }
    if (relatedAssociation != null)
    {
      GenAssociation placeholderRelatedAssociation = relatedAssociation;
      this.relatedAssociation = null;
      placeholderRelatedAssociation.removeRelatedField(this);
    }
  }

  // line 525 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String assignValueCall(){
    return assignValueCall(value);
  }


  /**
   * TODO: Move to a trait and integrate with GenAssociation and GenField
   */
  // line 552 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String getNormalizedType(){
    return getNormalizedType(isMany);
  }

  // line 556 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String getNormalizedType(Boolean isMany){
    GenPackage genPackage= getGenClass().getGenPackage();
		String value= normalize? genPackage.getNormalizedType(getType()): getType();
		String generic= genericString();
		if(!generic.isEmpty()){
			value+= generic;
		}
		
		if(normalize){
			boolean isPointer= genPackage.isPointer(getType());
			if(isMany && generic.isEmpty()){
				String sortKey= getSortKey();
				if(sortKey != null && !sortKey.isEmpty()){
					value= "set<"+ value+ ", "+ genPackage.comparatorId(getType(), sortKey)+">";
				}else{
					value= "vector<"+ value+ ">";
				}
				
				if(isPointer){
					value+= "*";
				}
			} 
			
			return value;
		}else if(getIsReference()){
			return value+ "&";
		}else if(getIsPointer()){
			return value+ "*";
		}
		
		return value;
  }

  // line 629 "../../../../../UmpleTLTemplates/Attributes.ump"
  public Boolean hasImplementation(){
    return isStatic;
  }

  // line 641 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String genericString(){
    if(!hasGenerics()){
			return "";
		}
		Stream<String> map = getGenerics().stream().map(GenFieldGeneric::getType);
		if(normalize){
			GenPackage genPackage= getGenClass().getGenPackage();
			map= map.map(type->genPackage.getNormalizedType(type));
		}
		return "<"+ map.collect(Collectors.joining(", "))+ ">";
  }

  // line 653 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String initializerString(){
    if(!hasInitializers()){
			return "";
		}
		return "("+ getInitializers().stream().map(GenFieldInitializer::getValue).collect(Collectors.joining(", "))+ ")";
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _assignValueCall(Integer numSpaces, StringBuilder sb, String _value){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(name);
    realSb.append(TEXT_1);
    realSb.append(_value);
    realSb.append(TEXT_2);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String assignValueCall(String _value){
        StringBuilder sb = new StringBuilder();
    return this._assignValueCall(0,sb,_value).toString(); 
  }

  public StringBuilder _autoAssign(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name = getName();
    
    realSb.append(TEXT_3);
    realSb.append(autounique);
    realSb.append(TEXT_4);
    realSb.append(name);
    realSb.append(TEXT_5);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String autoAssign(){
        StringBuilder sb = new StringBuilder();
    return this._autoAssign(0,sb).toString(); 
  }

  public StringBuilder _initializeCall(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_6);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String initializeCall(){
        StringBuilder sb = new StringBuilder();
    return this._initializeCall(0,sb).toString(); 
  }

  public StringBuilder _declaration(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    for(GenComment comment: getComments()){
	String body= comment.getBody();
	if(!body.isEmpty()){
	
    realSb.append(body);
    realSb.append(NL);
    }
	}
    for(GenRequirement requirement: getRequirements()){
	String body= requirement.getBody();
	if(!body.isEmpty()){
	
    realSb.append(body);
    realSb.append(NL);
    }
	}
    if(isStatic){
    realSb.append(TEXT_7);
    }
    if(isConstant){
    realSb.append(TEXT_8);
    }
    realSb.append(getNormalizedType());
    realSb.append(TEXT_9);
    realSb.append(name);
    realSb.append(initializerString());
    realSb.append(TEXT_10);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String declaration(){
        StringBuilder sb = new StringBuilder();
    return this._declaration(0,sb).toString(); 
  }

  public StringBuilder _implementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    for(GenComment comment: getComments()){
	String body= comment.getBody();
	if(!body.isEmpty()){
	
    realSb.append(body);
    realSb.append(NL);
    }
	}
    for(GenRequirement requirement: getRequirements()){
	String body= requirement.getBody();
	if(!body.isEmpty()){
	
    realSb.append(body);
    realSb.append(NL);
    }
	}
    if(isConstant){
    realSb.append(TEXT_11);
    }
    realSb.append(getNormalizedType());
    realSb.append(TEXT_12);
    realSb.append(getGenClass().getName());
    realSb.append(TEXT_13);
    realSb.append(name);
    realSb.append(TEXT_14);
    realSb.append(value);
    realSb.append(TEXT_15);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String implementation(){
        StringBuilder sb = new StringBuilder();
    return this._implementation(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "isIdentifier" + ":" + getIsIdentifier()+ "," +
            "type" + ":" + getType()+ "," +
            "name" + ":" + getName()+ "," +
            "destructible" + ":" + getDestructible()+ "," +
            "isStatic" + ":" + getIsStatic()+ "," +
            "isConstant" + ":" + getIsConstant()+ "," +
            "isMany" + ":" + getIsMany()+ "," +
            "isEnum" + ":" + getIsEnum()+ "," +
            "autounique" + ":" + getAutounique()+ "," +
            "value" + ":" + getValue()+ "," +
            "parameterized" + ":" + getParameterized()+ "," +
            "generatable" + ":" + getGeneratable()+ "," +
            "normalize" + ":" + getNormalize()+ "," +
            "sortKey" + ":" + getSortKey()+ "," +
            "visibility" + ":" + getVisibility()+ "," +
            "priority" + ":" + getPriority()+ "," +
            "remote" + ":" + getRemote()+ "," +
            "isPointer" + ":" + getIsPointer()+ "," +
            "isReference" + ":" + getIsReference()+ "," +
            "settable" + ":" + getSettable()+ "," +
            "isComparable" + ":" + getIsComparable()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "group" + "=" + (getGroup() != null ? !getGroup().equals(this)  ? getGroup().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "relatedMethod" + "=" + (getRelatedMethod() != null ? !getRelatedMethod().equals(this)  ? getRelatedMethod().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "commentsPriority" + "=" + (getCommentsPriority() != null ? !getCommentsPriority().equals(this)  ? getCommentsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "requirementsPriority" + "=" + (getRequirementsPriority() != null ? !getRequirementsPriority().equals(this)  ? getRequirementsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "genClass = "+(getGenClass()!=null?Integer.toHexString(System.identityHashCode(getGenClass())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "genStruct = "+(getGenStruct()!=null?Integer.toHexString(System.identityHashCode(getGenStruct())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "relatedAssociation = "+(getRelatedAssociation()!=null?Integer.toHexString(System.identityHashCode(getRelatedAssociation())):"null");
  }
}