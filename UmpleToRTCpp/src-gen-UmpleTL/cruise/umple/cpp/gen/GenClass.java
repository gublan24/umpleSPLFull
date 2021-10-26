/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import cruise.umple.cpp.utils.StringUtil;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

/**
 * 
 * Copyright (c) 2017 Ahmed M.Orabi, Mahmoud M.Orabi.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Ahmed M.Orabi
 * Mahmoud M.Orabi
 * 
 * Please refer to the code authors before making any changes. 
 * For any code reuse or copy, contact the authors and it is a MUST 
 * to refer author names.
 * 
 * @author -Ahmed M.Orabi {@link ahmedvc@hotmail.com}
 * @author Mahmoud M.Orabi {@link mahmoud_3rabi@hotmail.com}
 * 
 * Depend mixins
 */
// line 45 "../../../../../UmpleTLTemplates/Core.ump"
// line 101 "../../../../../UmpleTLTemplates/Core.ump"
// line 551 "../../../../../UmpleTLTemplates/Core.ump"
// line 825 "../../../../../UmpleTLTemplates/Core.ump"
// line 19 "../../../../../UmpleTLTemplates/Associations.ump"
// line 143 "../../../../../UmpleTLTemplates/Associations.ump"
// line 149 "../../../../../UmpleTLTemplates/Associations.ump"
// line 208 "../../../../../UmpleTLTemplates/Attributes.ump"
// line 1485 "../../../../../UmpleTLTemplates/Attributes.ump"
// line 26 "../../../../../UmpleTLTemplates/Depend.ump"
// line 128 "../../../../../UmpleTLTemplates/Depend.ump"
// line 101 "../../../../../UmpleTLTemplates/Content.ump"
// line 186 "../../../../../UmpleTLTemplates/Content.ump"
// line 398 "../../../../../UmpleTLTemplates/Content.ump"
public class GenClass implements java.io.Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String ATTRIBUTE_GROUP = "Attributes";
  public static final String STATIC_ATTRIBUTE_GROUP = "Static Attribute";
  public static final String ASSOCIATION_GROUP = "Associations";
  public static final String AUTOUNIQUE_ATTRIBUTE_GROUP = "Autounique Attributes";
  public static final String ENUM_GROUP = "State Machines";
  public static final String METHOD_GROUP = "Methods";
  public static final String PREDEFINED_OPERATOR_GROUP = "Predefined Operators";
  public static final String STREAM_HELPER_GROUP = "Stream Helper Group";
  public static final String CONSTRUCTOR_GROUP = "Constructor";
  public static final String DESTRUCTOR_GROUP = "Destructor";
  public static final String HELPER_GROUP = "Helper variables";
  public static final String GLOBAL_GROUP = "Global";
  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "unsigned int UID::uid = 0;";
  public static final String TEXT_1 = "JSONParser *JSON::_parser = new JSONInternalParser();";
  public static final String TEXT_2 = "#ifdef WINDOWS_OS" + NL + "struct WindowsSocket windowsSocketInit;" + NL + "#endif";
  public static final String TEXT_3 = NL + "//------------------------" + NL + "//";
  public static final String TEXT_4 = " INCLUDES" + NL + "//------------------------" + NL;
  public static final String TEXT_5 = "using namespace ";
  public static final String TEXT_6 = ";";
  public static final String TEXT_7 = "//------------------------" + NL + "//";
  public static final String TEXT_8 = NL + "//------------------------";
  public static final String TEXT_9 = "//------------------------" + NL + "//";
  public static final String TEXT_10 = NL + "//------------------------";
  public static final String TEXT_11 = "return reinterpret_cast<size_t>(this);";
  public static final String TEXT_12 = NL + "#ifndef ";
  public static final String TEXT_13 = "_H" + NL + "#define ";
  public static final String TEXT_14 = "_H" + NL + NL + "#ifdef PRAGMA" + NL + "#pragma once" + NL + "#ifndef _MSC_VER" + NL + "#pragma interface \"";
  public static final String TEXT_15 = ".h\"" + NL + "#endif" + NL + "#endif" + NL;
  public static final String TEXT_16 = "class ";
  public static final String TEXT_17 = " : ";
  public static final String TEXT_18 = "{" + NL;
  public static final String TEXT_19 = NL + "};" + NL;
  public static final String TEXT_20 = NL + "//------------------------" + NL + "//GNU HASH FUNCTION USE" + NL + "//------------------------" + NL + "#ifdef __GNUC__" + NL + "using namespace __gnu_cxx;" + NL + "namespace __gnu_cxx{" + NL + "  template<> struct hash<";
  public static final String TEXT_21 = "*>{" + NL + "    size_t operator()(";
  public static final String TEXT_22 = "* ptr ) const {" + NL + "        return ptr->hashCode();" + NL + "    }" + NL + "  };" + NL + "}" + NL + "#include <ext/hash_map>" + NL + "#else" + NL + "#include <hash_map>" + NL + "#endif" + NL + "#endif";
  public static final String TEXT_23 = NL + "#define ";
  public static final String TEXT_24 = "_BODY" + NL + NL + "#if defined( PRAGMA ) && ! defined( PRAGMA_IMPLEMENTED )" + NL + "#pragma implementation <";
  public static final String TEXT_25 = ".h>" + NL + "#endif" + NL;
  public static final String TEXT_26 = NL;
  public static final String TEXT_27 = NL + ";" + NL;
  public static final String TEXT_28 = "class ";
  public static final String TEXT_29 = ";";
  public static final String TEXT_30 = "struct ";
  public static final String TEXT_31 = ";";
  public static final String TEXT_32 = ":" + NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenClass Attributes
  private String name;
  private boolean generatable;
  private int priority;
  private boolean isAbstract;
  private GenClass parent;
  private boolean isRemote;
  private boolean singleton;
  private transient Comparator<GenSpecializedDefinition> specializedDefinitionsPriority;
  private transient Comparator<GenMethod> methodsPriority;
  private transient Comparator<GenField> fieldsPriority;
  private transient Comparator<GenComment> commentsPriority;
  private transient Comparator<GenRequirement> requirementsPriority;
  private transient Comparator<GenDepend> dependenciesPriority;
  private transient Comparator<GenInterface> interfacesPriority;
  private transient Comparator<GenClass> childrenPriority;
  private transient Comparator<GenBody> predefinitionsPriority;
  private transient Comparator<MemberInitializer> memberInitializersPriority;
  private transient Comparator<GenHeaderDepend> headerDependenciesPriority;
  private transient Comparator<GenIncompleteDefinition> incompletesPriority;
  private transient Comparator<GenStruct> structsPriority;
  private transient Comparator<GenGroup> attributeGroupsPriority;

  //GenClass Associations
  private List<GenSpecializedDefinition> specializedDefinitions;
  private List<GenMethod> methods;
  private List<GenField> fields;
  private List<GenComment> comments;
  private List<GenRequirement> requirements;
  private List<GenDepend> dependencies;
  private List<GenInterface> interfaces;
  private List<GenClass> children;
  private List<GenBody> predefinitions;
  private List<MemberInitializer> memberInitializers;
  private List<GenHeaderDepend> headerDependencies;
  private List<GenIncompleteDefinition> incompletes;
  private List<GenStruct> structs;
  private GenPackage genPackage;
  private List<GenConstructor> genConstructors;
  private GenClass genClassClass;
  private List<GenStatemachine> timerStatemachines;
  private List<GenStatemachine> autoStatemachines;
  private List<GenStatemachine> statemachines;
  private List<GenEnum> enumerations;
  private List<GenGroup> attributeGroups;
  private List<GenAssociation> associations;
  private List<GenComplexPort> complexPorts;
  private List<ActiveGenMethd> relatedActiveMethod;
  private List<GenPort> ports;
  private List<GenBody> constructorContents;
  private List<UniqueGenBody> uniqueConstructorContents;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenClass()
  {
    name = null;
    generatable = true;
    priority = 0;
    isAbstract = false;
    isRemote = false;
    singleton = false;
    specializedDefinitionsPriority = 
      Comparator.comparing(GenSpecializedDefinition::getPriority);
    methodsPriority = 
      Comparator.comparing(GenMethod::getPriority);
    fieldsPriority = 
      Comparator.comparing(GenField::getPriority);
    commentsPriority = 
      Comparator.comparing(GenComment::getPriority);
    requirementsPriority = 
      Comparator.comparing(GenRequirement::getPriority);
    dependenciesPriority = 
      Comparator.comparing(GenDepend::getPriority);
    interfacesPriority = 
      Comparator.comparing(GenInterface::getPriority);
    childrenPriority = 
      Comparator.comparing(GenClass::getPriority);
    predefinitionsPriority = 
      Comparator.comparing(GenBody::getPriority);
    memberInitializersPriority = 
      Comparator.comparing(MemberInitializer::getPriority);
    headerDependenciesPriority = 
      Comparator.comparing(GenHeaderDepend::getPriority);
    incompletesPriority = 
      Comparator.comparing(GenIncompleteDefinition::getPriority);
    structsPriority = 
      Comparator.comparing(GenStruct::getPriority);
    attributeGroupsPriority = 
      Comparator.comparing(GenGroup::getPriority);
    specializedDefinitions = new ArrayList<GenSpecializedDefinition>();
    methods = new ArrayList<GenMethod>();
    fields = new ArrayList<GenField>();
    comments = new ArrayList<GenComment>();
    requirements = new ArrayList<GenRequirement>();
    dependencies = new ArrayList<GenDepend>();
    interfaces = new ArrayList<GenInterface>();
    children = new ArrayList<GenClass>();
    predefinitions = new ArrayList<GenBody>();
    memberInitializers = new ArrayList<MemberInitializer>();
    headerDependencies = new ArrayList<GenHeaderDepend>();
    incompletes = new ArrayList<GenIncompleteDefinition>();
    structs = new ArrayList<GenStruct>();
    genConstructors = new ArrayList<GenConstructor>();
    timerStatemachines = new ArrayList<GenStatemachine>();
    autoStatemachines = new ArrayList<GenStatemachine>();
    statemachines = new ArrayList<GenStatemachine>();
    enumerations = new ArrayList<GenEnum>();
    attributeGroups = new ArrayList<GenGroup>();
    associations = new ArrayList<GenAssociation>();
    complexPorts = new ArrayList<GenComplexPort>();
    relatedActiveMethod = new ArrayList<ActiveGenMethd>();
    ports = new ArrayList<GenPort>();
    constructorContents = new ArrayList<GenBody>();
    uniqueConstructorContents = new ArrayList<UniqueGenBody>();
    // line 854 "../../../../../UmpleTLTemplates/Core.ump"
    GenGroup globalGroup = new GenGroup(GenClass.GLOBAL_GROUP);
    		globalGroup.setPriority(GenPriorities.HIGH-6);
    		globalGroup.setOwner(this);
    		globalGroup.setImplDescription(introComment(GenClass.GLOBAL_GROUP+ " implementation"));
    		
    		GenGroup constructorGroup = new GenGroup(GenClass.CONSTRUCTOR_GROUP);
    		constructorGroup.setPriority(GenPriorities.HIGH-5);
    		constructorGroup.setOwner(this);
    		constructorGroup.setDescription(introComment(GenClass.CONSTRUCTOR_GROUP));
    		constructorGroup.setImplDescription(introComment(GenClass.CONSTRUCTOR_GROUP+ " implementation"));
    		
    		GenGroup streamHelperGroup = new GenGroup(GenClass.STREAM_HELPER_GROUP);
    		streamHelperGroup.setPriority(GenPriorities.HIGH-4);
    		streamHelperGroup.setOwner(this);
    		streamHelperGroup.setDescription(introComment(GenClass.STREAM_HELPER_GROUP+ "declaration"));
    		streamHelperGroup.setImplDescription(introComment(GenClass.STREAM_HELPER_GROUP+ " implementation"));
    		
    		GenGroup predefinedOperatorGroup = new GenGroup(GenClass.PREDEFINED_OPERATOR_GROUP);
    		predefinedOperatorGroup.setPriority(GenPriorities.HIGH-3);
    		predefinedOperatorGroup.setOwner(this);
    		predefinedOperatorGroup.setDescription(introComment(GenClass.PREDEFINED_OPERATOR_GROUP));
    		predefinedOperatorGroup.setImplDescription(introComment(GenClass.PREDEFINED_OPERATOR_GROUP+ " implementation"));
    		
    		GenGroup helperGroup = new GenGroup(GenClass.HELPER_GROUP);
    		helperGroup.setPriority(GenPriorities.HIGH-3);
    		helperGroup.setOwner(this);
    		
    		GenGroup staticAttributeGroup = new GenGroup(GenClass.STATIC_ATTRIBUTE_GROUP);
    		staticAttributeGroup.setPriority(GenPriorities.HIGH-2);
    		staticAttributeGroup.setOwner(this);
    		staticAttributeGroup.setDescription(introComment(GenClass.STATIC_ATTRIBUTE_GROUP+"s"));
    		staticAttributeGroup.setImplDescription(introComment(GenClass.STATIC_ATTRIBUTE_GROUP+ " implementation"));
    		
    		GenGroup genGroup = new GenGroup(GenClass.ATTRIBUTE_GROUP);
    		genGroup.setPriority(GenPriorities.HIGH-1);
    		genGroup.setOwner(this);
    		
    		GenGroup associationGroup = new GenGroup(GenClass.ASSOCIATION_GROUP);
    		associationGroup.setPriority(GenPriorities.HIGH);
    		associationGroup.setOwner(this);
    		
    		GenGroup enumGroup = new GenGroup(GenClass.ENUM_GROUP);
    		enumGroup.setPriority(GenPriorities.NORMAL);
    		enumGroup.setOwner(this);
    		
    		GenGroup autouniqueGroup = new GenGroup(GenClass.AUTOUNIQUE_ATTRIBUTE_GROUP);
    		autouniqueGroup.setPriority(GenPriorities.NORMAL);
    		autouniqueGroup.setOwner(this);
    		
    		GenGroup methodGroup = new GenGroup(GenClass.METHOD_GROUP);
    		methodGroup.setOwner(this);
    		
    		GenGroup destructorGroup = new GenGroup(GenClass.DESTRUCTOR_GROUP);
    		destructorGroup.setPriority(GenPriorities.LOW+2);
    		destructorGroup.setOwner(this);
    		destructorGroup.setDescription(introComment(GenClass.DESTRUCTOR_GROUP));
    		destructorGroup.setImplDescription(introComment(GenClass.DESTRUCTOR_GROUP+ " implementation"));
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    // line 914 "../../../../../UmpleTLTemplates/Core.ump"
    getAttributeGroup(indexOfAttributeGroup(new GenGroup(GenClass.GLOBAL_GROUP))).setDescription("//"+ name+ " "+ GenClass.GLOBAL_GROUP); 
    		getAttributeGroup(indexOfAttributeGroup(new GenGroup(GenClass.ATTRIBUTE_GROUP))).setDescription("//"+ name+ " "+ GenClass.ATTRIBUTE_GROUP);
    		getAttributeGroup(indexOfAttributeGroup(new GenGroup(GenClass.ASSOCIATION_GROUP))).setDescription("//"+ name+ " "+ GenClass.ASSOCIATION_GROUP);
    		getAttributeGroup(indexOfAttributeGroup(new GenGroup(GenClass.ENUM_GROUP))).setDescription("//"+ name+ " "+ GenClass.ENUM_GROUP);
    		getAttributeGroup(indexOfAttributeGroup(new GenGroup(GenClass.AUTOUNIQUE_ATTRIBUTE_GROUP))).setDescription("//"+ name+ " "+ GenClass.AUTOUNIQUE_ATTRIBUTE_GROUP);
    		getAttributeGroup(indexOfAttributeGroup(new GenGroup(GenClass.HELPER_GROUP))).setDescription("//"+ name+ " "+ GenClass.HELPER_GROUP);
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean setGeneratable(boolean aGeneratable)
  {
    boolean wasSet = false;
    generatable = aGeneratable;
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

  public boolean setIsAbstract(boolean aIsAbstract)
  {
    boolean wasSet = false;
    isAbstract = aIsAbstract;
    wasSet = true;
    return wasSet;
  }

  public boolean setParent(GenClass aParent)
  {
    boolean wasSet = false;
    parent = aParent;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsRemote(boolean aIsRemote)
  {
    boolean wasSet = false;
    isRemote = aIsRemote;
    wasSet = true;
    return wasSet;
  }

  public boolean setSingleton(boolean aSingleton)
  {
    boolean wasSet = false;
    singleton = aSingleton;
    wasSet = true;
    return wasSet;
  }

  public boolean setSpecializedDefinitionsPriority(Comparator<GenSpecializedDefinition> aSpecializedDefinitionsPriority)
  {
    boolean wasSet = false;
    specializedDefinitionsPriority = aSpecializedDefinitionsPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setMethodsPriority(Comparator<GenMethod> aMethodsPriority)
  {
    boolean wasSet = false;
    methodsPriority = aMethodsPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setFieldsPriority(Comparator<GenField> aFieldsPriority)
  {
    boolean wasSet = false;
    fieldsPriority = aFieldsPriority;
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

  public boolean setDependenciesPriority(Comparator<GenDepend> aDependenciesPriority)
  {
    boolean wasSet = false;
    dependenciesPriority = aDependenciesPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setInterfacesPriority(Comparator<GenInterface> aInterfacesPriority)
  {
    boolean wasSet = false;
    interfacesPriority = aInterfacesPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setChildrenPriority(Comparator<GenClass> aChildrenPriority)
  {
    boolean wasSet = false;
    childrenPriority = aChildrenPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setPredefinitionsPriority(Comparator<GenBody> aPredefinitionsPriority)
  {
    boolean wasSet = false;
    predefinitionsPriority = aPredefinitionsPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setMemberInitializersPriority(Comparator<MemberInitializer> aMemberInitializersPriority)
  {
    boolean wasSet = false;
    memberInitializersPriority = aMemberInitializersPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setHeaderDependenciesPriority(Comparator<GenHeaderDepend> aHeaderDependenciesPriority)
  {
    boolean wasSet = false;
    headerDependenciesPriority = aHeaderDependenciesPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setIncompletesPriority(Comparator<GenIncompleteDefinition> aIncompletesPriority)
  {
    boolean wasSet = false;
    incompletesPriority = aIncompletesPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setStructsPriority(Comparator<GenStruct> aStructsPriority)
  {
    boolean wasSet = false;
    structsPriority = aStructsPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setAttributeGroupsPriority(Comparator<GenGroup> aAttributeGroupsPriority)
  {
    boolean wasSet = false;
    attributeGroupsPriority = aAttributeGroupsPriority;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public boolean getGeneratable()
  {
    return generatable;
  }

  public int getPriority()
  {
    return priority;
  }

  public boolean getIsAbstract()
  {
    return isAbstract;
  }

  public GenClass getParent()
  {
    return parent;
  }

  /**
   * Composite-structure specific
   */
  public boolean getIsRemote()
  {
    return isRemote;
  }

  public boolean getSingleton()
  {
    return singleton;
  }

  public String getNamespace()
  {
    return includeNamespace();
  }

  public Comparator<GenSpecializedDefinition> getSpecializedDefinitionsPriority()
  {
    return specializedDefinitionsPriority;
  }

  public Comparator<GenMethod> getMethodsPriority()
  {
    return methodsPriority;
  }

  public Comparator<GenField> getFieldsPriority()
  {
    return fieldsPriority;
  }

  public Comparator<GenComment> getCommentsPriority()
  {
    return commentsPriority;
  }

  public Comparator<GenRequirement> getRequirementsPriority()
  {
    return requirementsPriority;
  }

  public Comparator<GenDepend> getDependenciesPriority()
  {
    return dependenciesPriority;
  }

  public Comparator<GenInterface> getInterfacesPriority()
  {
    return interfacesPriority;
  }

  public Comparator<GenClass> getChildrenPriority()
  {
    return childrenPriority;
  }

  public Comparator<GenBody> getPredefinitionsPriority()
  {
    return predefinitionsPriority;
  }

  public Comparator<MemberInitializer> getMemberInitializersPriority()
  {
    return memberInitializersPriority;
  }

  public Comparator<GenHeaderDepend> getHeaderDependenciesPriority()
  {
    return headerDependenciesPriority;
  }

  public Comparator<GenIncompleteDefinition> getIncompletesPriority()
  {
    return incompletesPriority;
  }

  public Comparator<GenStruct> getStructsPriority()
  {
    return structsPriority;
  }

  public Comparator<GenGroup> getAttributeGroupsPriority()
  {
    return attributeGroupsPriority;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isGeneratable()
  {
    return generatable;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsAbstract()
  {
    return isAbstract;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsRemote()
  {
    return isRemote;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isSingleton()
  {
    return singleton;
  }
  /* Code from template association_GetMany */
  public GenSpecializedDefinition getSpecializedDefinition(int index)
  {
    GenSpecializedDefinition aSpecializedDefinition = specializedDefinitions.get(index);
    return aSpecializedDefinition;
  }

  /**
   * Cpp-specific
   */
  public List<GenSpecializedDefinition> getSpecializedDefinitions()
  {
    List<GenSpecializedDefinition> newSpecializedDefinitions = Collections.unmodifiableList(specializedDefinitions);
    return newSpecializedDefinitions;
  }

  public int numberOfSpecializedDefinitions()
  {
    int number = specializedDefinitions.size();
    return number;
  }

  public boolean hasSpecializedDefinitions()
  {
    boolean has = specializedDefinitions.size() > 0;
    return has;
  }

  public int indexOfSpecializedDefinition(GenSpecializedDefinition aSpecializedDefinition)
  {
    int index = specializedDefinitions.indexOf(aSpecializedDefinition);
    return index;
  }
  /* Code from template association_GetMany */
  public GenMethod getMethod(int index)
  {
    GenMethod aMethod = methods.get(index);
    return aMethod;
  }

  public List<GenMethod> getMethods()
  {
    List<GenMethod> newMethods = Collections.unmodifiableList(methods);
    return newMethods;
  }

  public int numberOfMethods()
  {
    int number = methods.size();
    return number;
  }

  public boolean hasMethods()
  {
    boolean has = methods.size() > 0;
    return has;
  }

  public int indexOfMethod(GenMethod aMethod)
  {
    int index = methods.indexOf(aMethod);
    return index;
  }
  /* Code from template association_GetMany */
  public GenField getField(int index)
  {
    GenField aField = fields.get(index);
    return aField;
  }

  public List<GenField> getFields()
  {
    List<GenField> newFields = Collections.unmodifiableList(fields);
    return newFields;
  }

  public int numberOfFields()
  {
    int number = fields.size();
    return number;
  }

  public boolean hasFields()
  {
    boolean has = fields.size() > 0;
    return has;
  }

  public int indexOfField(GenField aField)
  {
    int index = fields.indexOf(aField);
    return index;
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
  public GenDepend getDependency(int index)
  {
    GenDepend aDependency = dependencies.get(index);
    return aDependency;
  }

  public List<GenDepend> getDependencies()
  {
    List<GenDepend> newDependencies = Collections.unmodifiableList(dependencies);
    return newDependencies;
  }

  public int numberOfDependencies()
  {
    int number = dependencies.size();
    return number;
  }

  public boolean hasDependencies()
  {
    boolean has = dependencies.size() > 0;
    return has;
  }

  public int indexOfDependency(GenDepend aDependency)
  {
    int index = dependencies.indexOf(aDependency);
    return index;
  }
  /* Code from template association_GetMany */
  public GenInterface getInterface(int index)
  {
    GenInterface aInterface = interfaces.get(index);
    return aInterface;
  }

  public List<GenInterface> getInterfaces()
  {
    List<GenInterface> newInterfaces = Collections.unmodifiableList(interfaces);
    return newInterfaces;
  }

  public int numberOfInterfaces()
  {
    int number = interfaces.size();
    return number;
  }

  public boolean hasInterfaces()
  {
    boolean has = interfaces.size() > 0;
    return has;
  }

  public int indexOfInterface(GenInterface aInterface)
  {
    int index = interfaces.indexOf(aInterface);
    return index;
  }
  /* Code from template association_GetMany */
  public GenClass getChild(int index)
  {
    GenClass aChild = children.get(index);
    return aChild;
  }

  public List<GenClass> getChildren()
  {
    List<GenClass> newChildren = Collections.unmodifiableList(children);
    return newChildren;
  }

  public int numberOfChildren()
  {
    int number = children.size();
    return number;
  }

  public boolean hasChildren()
  {
    boolean has = children.size() > 0;
    return has;
  }

  public int indexOfChild(GenClass aChild)
  {
    int index = children.indexOf(aChild);
    return index;
  }
  /* Code from template association_GetMany */
  public GenBody getPredefinition(int index)
  {
    GenBody aPredefinition = predefinitions.get(index);
    return aPredefinition;
  }

  public List<GenBody> getPredefinitions()
  {
    List<GenBody> newPredefinitions = Collections.unmodifiableList(predefinitions);
    return newPredefinitions;
  }

  public int numberOfPredefinitions()
  {
    int number = predefinitions.size();
    return number;
  }

  public boolean hasPredefinitions()
  {
    boolean has = predefinitions.size() > 0;
    return has;
  }

  public int indexOfPredefinition(GenBody aPredefinition)
  {
    int index = predefinitions.indexOf(aPredefinition);
    return index;
  }
  /* Code from template association_GetMany */
  public MemberInitializer getMemberInitializer(int index)
  {
    MemberInitializer aMemberInitializer = memberInitializers.get(index);
    return aMemberInitializer;
  }

  public List<MemberInitializer> getMemberInitializers()
  {
    List<MemberInitializer> newMemberInitializers = Collections.unmodifiableList(memberInitializers);
    return newMemberInitializers;
  }

  public int numberOfMemberInitializers()
  {
    int number = memberInitializers.size();
    return number;
  }

  public boolean hasMemberInitializers()
  {
    boolean has = memberInitializers.size() > 0;
    return has;
  }

  public int indexOfMemberInitializer(MemberInitializer aMemberInitializer)
  {
    int index = memberInitializers.indexOf(aMemberInitializer);
    return index;
  }
  /* Code from template association_GetMany */
  public GenHeaderDepend getHeaderDependency(int index)
  {
    GenHeaderDepend aHeaderDependency = headerDependencies.get(index);
    return aHeaderDependency;
  }

  public List<GenHeaderDepend> getHeaderDependencies()
  {
    List<GenHeaderDepend> newHeaderDependencies = Collections.unmodifiableList(headerDependencies);
    return newHeaderDependencies;
  }

  public int numberOfHeaderDependencies()
  {
    int number = headerDependencies.size();
    return number;
  }

  public boolean hasHeaderDependencies()
  {
    boolean has = headerDependencies.size() > 0;
    return has;
  }

  public int indexOfHeaderDependency(GenHeaderDepend aHeaderDependency)
  {
    int index = headerDependencies.indexOf(aHeaderDependency);
    return index;
  }
  /* Code from template association_GetMany */
  public GenIncompleteDefinition getIncomplete(int index)
  {
    GenIncompleteDefinition aIncomplete = incompletes.get(index);
    return aIncomplete;
  }

  public List<GenIncompleteDefinition> getIncompletes()
  {
    List<GenIncompleteDefinition> newIncompletes = Collections.unmodifiableList(incompletes);
    return newIncompletes;
  }

  public int numberOfIncompletes()
  {
    int number = incompletes.size();
    return number;
  }

  public boolean hasIncompletes()
  {
    boolean has = incompletes.size() > 0;
    return has;
  }

  public int indexOfIncomplete(GenIncompleteDefinition aIncomplete)
  {
    int index = incompletes.indexOf(aIncomplete);
    return index;
  }
  /* Code from template association_GetMany */
  public GenStruct getStruct(int index)
  {
    GenStruct aStruct = structs.get(index);
    return aStruct;
  }

  public List<GenStruct> getStructs()
  {
    List<GenStruct> newStructs = Collections.unmodifiableList(structs);
    return newStructs;
  }

  public int numberOfStructs()
  {
    int number = structs.size();
    return number;
  }

  public boolean hasStructs()
  {
    boolean has = structs.size() > 0;
    return has;
  }

  public int indexOfStruct(GenStruct aStruct)
  {
    int index = structs.indexOf(aStruct);
    return index;
  }
  /* Code from template association_GetOne */
  public GenPackage getGenPackage()
  {
    return genPackage;
  }

  public boolean hasGenPackage()
  {
    boolean has = genPackage != null;
    return has;
  }
  /* Code from template association_GetMany */
  public GenConstructor getGenConstructor(int index)
  {
    GenConstructor aGenConstructor = genConstructors.get(index);
    return aGenConstructor;
  }

  public List<GenConstructor> getGenConstructors()
  {
    List<GenConstructor> newGenConstructors = Collections.unmodifiableList(genConstructors);
    return newGenConstructors;
  }

  public int numberOfGenConstructors()
  {
    int number = genConstructors.size();
    return number;
  }

  public boolean hasGenConstructors()
  {
    boolean has = genConstructors.size() > 0;
    return has;
  }

  public int indexOfGenConstructor(GenConstructor aGenConstructor)
  {
    int index = genConstructors.indexOf(aGenConstructor);
    return index;
  }
  /* Code from template association_GetOne */
  public GenClass getGenClassClass()
  {
    return genClassClass;
  }

  public boolean hasGenClassClass()
  {
    boolean has = genClassClass != null;
    return has;
  }
  /* Code from template association_GetMany */
  public GenStatemachine getTimerStatemachine(int index)
  {
    GenStatemachine aTimerStatemachine = timerStatemachines.get(index);
    return aTimerStatemachine;
  }

  public List<GenStatemachine> getTimerStatemachines()
  {
    List<GenStatemachine> newTimerStatemachines = Collections.unmodifiableList(timerStatemachines);
    return newTimerStatemachines;
  }

  public int numberOfTimerStatemachines()
  {
    int number = timerStatemachines.size();
    return number;
  }

  public boolean hasTimerStatemachines()
  {
    boolean has = timerStatemachines.size() > 0;
    return has;
  }

  public int indexOfTimerStatemachine(GenStatemachine aTimerStatemachine)
  {
    int index = timerStatemachines.indexOf(aTimerStatemachine);
    return index;
  }
  /* Code from template association_GetMany */
  public GenStatemachine getAutoStatemachine(int index)
  {
    GenStatemachine aAutoStatemachine = autoStatemachines.get(index);
    return aAutoStatemachine;
  }

  public List<GenStatemachine> getAutoStatemachines()
  {
    List<GenStatemachine> newAutoStatemachines = Collections.unmodifiableList(autoStatemachines);
    return newAutoStatemachines;
  }

  public int numberOfAutoStatemachines()
  {
    int number = autoStatemachines.size();
    return number;
  }

  public boolean hasAutoStatemachines()
  {
    boolean has = autoStatemachines.size() > 0;
    return has;
  }

  public int indexOfAutoStatemachine(GenStatemachine aAutoStatemachine)
  {
    int index = autoStatemachines.indexOf(aAutoStatemachine);
    return index;
  }
  /* Code from template association_GetMany */
  public GenStatemachine getStatemachine(int index)
  {
    GenStatemachine aStatemachine = statemachines.get(index);
    return aStatemachine;
  }

  public List<GenStatemachine> getStatemachines()
  {
    List<GenStatemachine> newStatemachines = Collections.unmodifiableList(statemachines);
    return newStatemachines;
  }

  public int numberOfStatemachines()
  {
    int number = statemachines.size();
    return number;
  }

  public boolean hasStatemachines()
  {
    boolean has = statemachines.size() > 0;
    return has;
  }

  public int indexOfStatemachine(GenStatemachine aStatemachine)
  {
    int index = statemachines.indexOf(aStatemachine);
    return index;
  }
  /* Code from template association_GetMany */
  public GenEnum getEnumeration(int index)
  {
    GenEnum aEnumeration = enumerations.get(index);
    return aEnumeration;
  }

  public List<GenEnum> getEnumerations()
  {
    List<GenEnum> newEnumerations = Collections.unmodifiableList(enumerations);
    return newEnumerations;
  }

  public int numberOfEnumerations()
  {
    int number = enumerations.size();
    return number;
  }

  public boolean hasEnumerations()
  {
    boolean has = enumerations.size() > 0;
    return has;
  }

  public int indexOfEnumeration(GenEnum aEnumeration)
  {
    int index = enumerations.indexOf(aEnumeration);
    return index;
  }
  /* Code from template association_GetMany */
  public GenGroup getAttributeGroup(int index)
  {
    GenGroup aAttributeGroup = attributeGroups.get(index);
    return aAttributeGroup;
  }

  public List<GenGroup> getAttributeGroups()
  {
    List<GenGroup> newAttributeGroups = Collections.unmodifiableList(attributeGroups);
    return newAttributeGroups;
  }

  public int numberOfAttributeGroups()
  {
    int number = attributeGroups.size();
    return number;
  }

  public boolean hasAttributeGroups()
  {
    boolean has = attributeGroups.size() > 0;
    return has;
  }

  public int indexOfAttributeGroup(GenGroup aAttributeGroup)
  {
    int index = attributeGroups.indexOf(aAttributeGroup);
    return index;
  }
  /* Code from template association_GetMany */
  public GenAssociation getAssociation(int index)
  {
    GenAssociation aAssociation = associations.get(index);
    return aAssociation;
  }

  public List<GenAssociation> getAssociations()
  {
    List<GenAssociation> newAssociations = Collections.unmodifiableList(associations);
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

  public int indexOfAssociation(GenAssociation aAssociation)
  {
    int index = associations.indexOf(aAssociation);
    return index;
  }
  /* Code from template association_GetMany */
  public GenComplexPort getComplexPort(int index)
  {
    GenComplexPort aComplexPort = complexPorts.get(index);
    return aComplexPort;
  }

  public List<GenComplexPort> getComplexPorts()
  {
    List<GenComplexPort> newComplexPorts = Collections.unmodifiableList(complexPorts);
    return newComplexPorts;
  }

  public int numberOfComplexPorts()
  {
    int number = complexPorts.size();
    return number;
  }

  public boolean hasComplexPorts()
  {
    boolean has = complexPorts.size() > 0;
    return has;
  }

  public int indexOfComplexPort(GenComplexPort aComplexPort)
  {
    int index = complexPorts.indexOf(aComplexPort);
    return index;
  }
  /* Code from template association_GetMany */
  public ActiveGenMethd getRelatedActiveMethod(int index)
  {
    ActiveGenMethd aRelatedActiveMethod = relatedActiveMethod.get(index);
    return aRelatedActiveMethod;
  }

  public List<ActiveGenMethd> getRelatedActiveMethod()
  {
    List<ActiveGenMethd> newRelatedActiveMethod = Collections.unmodifiableList(relatedActiveMethod);
    return newRelatedActiveMethod;
  }

  public int numberOfRelatedActiveMethod()
  {
    int number = relatedActiveMethod.size();
    return number;
  }

  public boolean hasRelatedActiveMethod()
  {
    boolean has = relatedActiveMethod.size() > 0;
    return has;
  }

  public int indexOfRelatedActiveMethod(ActiveGenMethd aRelatedActiveMethod)
  {
    int index = relatedActiveMethod.indexOf(aRelatedActiveMethod);
    return index;
  }
  /* Code from template association_GetMany */
  public GenPort getPort(int index)
  {
    GenPort aPort = ports.get(index);
    return aPort;
  }

  public List<GenPort> getPorts()
  {
    List<GenPort> newPorts = Collections.unmodifiableList(ports);
    return newPorts;
  }

  public int numberOfPorts()
  {
    int number = ports.size();
    return number;
  }

  public boolean hasPorts()
  {
    boolean has = ports.size() > 0;
    return has;
  }

  public int indexOfPort(GenPort aPort)
  {
    int index = ports.indexOf(aPort);
    return index;
  }
  /* Code from template association_GetMany */
  public GenBody getConstructorContent(int index)
  {
    GenBody aConstructorContent = constructorContents.get(index);
    return aConstructorContent;
  }

  public List<GenBody> getConstructorContents()
  {
    List<GenBody> newConstructorContents = Collections.unmodifiableList(constructorContents);
    return newConstructorContents;
  }

  public int numberOfConstructorContents()
  {
    int number = constructorContents.size();
    return number;
  }

  public boolean hasConstructorContents()
  {
    boolean has = constructorContents.size() > 0;
    return has;
  }

  public int indexOfConstructorContent(GenBody aConstructorContent)
  {
    int index = constructorContents.indexOf(aConstructorContent);
    return index;
  }
  /* Code from template association_GetMany */
  public UniqueGenBody getUniqueConstructorContent(int index)
  {
    UniqueGenBody aUniqueConstructorContent = uniqueConstructorContents.get(index);
    return aUniqueConstructorContent;
  }

  public List<UniqueGenBody> getUniqueConstructorContents()
  {
    List<UniqueGenBody> newUniqueConstructorContents = Collections.unmodifiableList(uniqueConstructorContents);
    return newUniqueConstructorContents;
  }

  public int numberOfUniqueConstructorContents()
  {
    int number = uniqueConstructorContents.size();
    return number;
  }

  public boolean hasUniqueConstructorContents()
  {
    boolean has = uniqueConstructorContents.size() > 0;
    return has;
  }

  public int indexOfUniqueConstructorContent(UniqueGenBody aUniqueConstructorContent)
  {
    int index = uniqueConstructorContents.indexOf(aUniqueConstructorContent);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSpecializedDefinitions()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addSpecializedDefinition(GenSpecializedDefinition aSpecializedDefinition)
  {
    boolean wasAdded = false;
    if (specializedDefinitions.contains(aSpecializedDefinition)) { return false; }
    GenClass existingGenClass = aSpecializedDefinition.getGenClass();
    if (existingGenClass == null)
    {
      aSpecializedDefinition.setGenClass(this);
    }
    else if (!this.equals(existingGenClass))
    {
      existingGenClass.removeSpecializedDefinition(aSpecializedDefinition);
      addSpecializedDefinition(aSpecializedDefinition);
    }
    else
    {
      specializedDefinitions.add(aSpecializedDefinition);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(specializedDefinitions, specializedDefinitionsPriority);
    
    return wasAdded;
  }

  public boolean removeSpecializedDefinition(GenSpecializedDefinition aSpecializedDefinition)
  {
    boolean wasRemoved = false;
    if (specializedDefinitions.contains(aSpecializedDefinition))
    {
      specializedDefinitions.remove(aSpecializedDefinition);
      aSpecializedDefinition.setGenClass(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMethods()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addMethod(GenMethod aMethod)
  {
    boolean wasAdded = false;
    if (methods.contains(aMethod)) { return false; }
    GenClass existingGenClass = aMethod.getGenClass();
    if (existingGenClass == null)
    {
      aMethod.setGenClass(this);
    }
    else if (!this.equals(existingGenClass))
    {
      existingGenClass.removeMethod(aMethod);
      addMethod(aMethod);
    }
    else
    {
      methods.add(aMethod);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(methods, methodsPriority);
    
    return wasAdded;
  }

  public boolean removeMethod(GenMethod aMethod)
  {
    boolean wasRemoved = false;
    if (methods.contains(aMethod))
    {
      methods.remove(aMethod);
      aMethod.setGenClass(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFields()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addField(GenField aField)
  {
    boolean wasAdded = false;
    if (fields.contains(aField)) { return false; }
    GenClass existingGenClass = aField.getGenClass();
    if (existingGenClass == null)
    {
      aField.setGenClass(this);
    }
    else if (!this.equals(existingGenClass))
    {
      existingGenClass.removeField(aField);
      addField(aField);
    }
    else
    {
      fields.add(aField);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(fields, fieldsPriority);
    
    return wasAdded;
  }

  public boolean removeField(GenField aField)
  {
    boolean wasRemoved = false;
    if (fields.contains(aField))
    {
      fields.remove(aField);
      aField.setGenClass(null);
      wasRemoved = true;
    }
    return wasRemoved;
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
    GenClass existingGenClass = aComment.getGenClass();
    if (existingGenClass == null)
    {
      aComment.setGenClass(this);
    }
    else if (!this.equals(existingGenClass))
    {
      existingGenClass.removeComment(aComment);
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
      aComment.setGenClass(null);
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
    GenClass existingGenClass = aRequirement.getGenClass();
    if (existingGenClass == null)
    {
      aRequirement.setGenClass(this);
    }
    else if (!this.equals(existingGenClass))
    {
      existingGenClass.removeRequirement(aRequirement);
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
      aRequirement.setGenClass(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDependencies()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addDependency(GenDepend aDependency)
  {
    boolean wasAdded = false;
    if (dependencies.contains(aDependency)) { return false; }
    GenClass existingGenDependClass = aDependency.getGenDependClass();
    if (existingGenDependClass == null)
    {
      aDependency.setGenDependClass(this);
    }
    else if (!this.equals(existingGenDependClass))
    {
      existingGenDependClass.removeDependency(aDependency);
      addDependency(aDependency);
    }
    else
    {
      dependencies.add(aDependency);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(dependencies, dependenciesPriority);
    
    return wasAdded;
  }

  public boolean removeDependency(GenDepend aDependency)
  {
    boolean wasRemoved = false;
    if (dependencies.contains(aDependency))
    {
      dependencies.remove(aDependency);
      aDependency.setGenDependClass(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfInterfaces()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addInterface(GenInterface aInterface)
  {
    boolean wasAdded = false;
    if (interfaces.contains(aInterface)) { return false; }
    GenClass existingGenClassInterface = aInterface.getGenClassInterface();
    if (existingGenClassInterface == null)
    {
      aInterface.setGenClassInterface(this);
    }
    else if (!this.equals(existingGenClassInterface))
    {
      existingGenClassInterface.removeInterface(aInterface);
      addInterface(aInterface);
    }
    else
    {
      interfaces.add(aInterface);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(interfaces, interfacesPriority);
    
    return wasAdded;
  }

  public boolean removeInterface(GenInterface aInterface)
  {
    boolean wasRemoved = false;
    if (interfaces.contains(aInterface))
    {
      interfaces.remove(aInterface);
      aInterface.setGenClassInterface(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfChildren()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addChild(GenClass aChild)
  {
    boolean wasAdded = false;
    if (children.contains(aChild)) { return false; }
    GenClass existingGenClassClass = aChild.getGenClassClass();
    if (existingGenClassClass == null)
    {
      aChild.setGenClassClass(this);
    }
    else if (!this.equals(existingGenClassClass))
    {
      existingGenClassClass.removeChild(aChild);
      addChild(aChild);
    }
    else
    {
      children.add(aChild);
    }
    wasAdded = true;
    // line 576 "../../../../../UmpleTLTemplates/Core.ump"
    if(aChild== null|| aChild.equals(this)){
    			return false;
    		}
    		aChild.setParentInternally(this);
    // END OF UMPLE AFTER INJECTION
    if(wasAdded)
        Collections.sort(children, childrenPriority);
    
    return wasAdded;
  }

  public boolean removeChild(GenClass aChild)
  {
    boolean wasRemoved = false;
    if (children.contains(aChild))
    {
      children.remove(aChild);
      aChild.setGenClassClass(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPredefinitions()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addPredefinition(GenBody aPredefinition)
  {
    boolean wasAdded = false;
    if (predefinitions.contains(aPredefinition)) { return false; }
    GenClass existingGenClass = aPredefinition.getGenClass();
    if (existingGenClass == null)
    {
      aPredefinition.setGenClass(this);
    }
    else if (!this.equals(existingGenClass))
    {
      existingGenClass.removePredefinition(aPredefinition);
      addPredefinition(aPredefinition);
    }
    else
    {
      predefinitions.add(aPredefinition);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(predefinitions, predefinitionsPriority);
    
    return wasAdded;
  }

  public boolean removePredefinition(GenBody aPredefinition)
  {
    boolean wasRemoved = false;
    if (predefinitions.contains(aPredefinition))
    {
      predefinitions.remove(aPredefinition);
      aPredefinition.setGenClass(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMemberInitializers()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addMemberInitializer(MemberInitializer aMemberInitializer)
  {
    boolean wasAdded = false;
    if (memberInitializers.contains(aMemberInitializer)) { return false; }
    GenClass existingGenClass = aMemberInitializer.getGenClass();
    if (existingGenClass == null)
    {
      aMemberInitializer.setGenClass(this);
    }
    else if (!this.equals(existingGenClass))
    {
      existingGenClass.removeMemberInitializer(aMemberInitializer);
      addMemberInitializer(aMemberInitializer);
    }
    else
    {
      memberInitializers.add(aMemberInitializer);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(memberInitializers, memberInitializersPriority);
    
    return wasAdded;
  }

  public boolean removeMemberInitializer(MemberInitializer aMemberInitializer)
  {
    boolean wasRemoved = false;
    if (memberInitializers.contains(aMemberInitializer))
    {
      memberInitializers.remove(aMemberInitializer);
      aMemberInitializer.setGenClass(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfHeaderDependencies()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addHeaderDependency(GenHeaderDepend aHeaderDependency)
  {
    boolean wasAdded = false;
    if (headerDependencies.contains(aHeaderDependency)) { return false; }
    GenClass existingGenHeaderDependClass = aHeaderDependency.getGenHeaderDependClass();
    if (existingGenHeaderDependClass == null)
    {
      aHeaderDependency.setGenHeaderDependClass(this);
    }
    else if (!this.equals(existingGenHeaderDependClass))
    {
      existingGenHeaderDependClass.removeHeaderDependency(aHeaderDependency);
      addHeaderDependency(aHeaderDependency);
    }
    else
    {
      headerDependencies.add(aHeaderDependency);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(headerDependencies, headerDependenciesPriority);
    
    return wasAdded;
  }

  public boolean removeHeaderDependency(GenHeaderDepend aHeaderDependency)
  {
    boolean wasRemoved = false;
    if (headerDependencies.contains(aHeaderDependency))
    {
      headerDependencies.remove(aHeaderDependency);
      aHeaderDependency.setGenHeaderDependClass(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfIncompletes()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addIncomplete(GenIncompleteDefinition aIncomplete)
  {
    boolean wasAdded = false;
    if (incompletes.contains(aIncomplete)) { return false; }
    GenClass existingGenClass = aIncomplete.getGenClass();
    if (existingGenClass == null)
    {
      aIncomplete.setGenClass(this);
    }
    else if (!this.equals(existingGenClass))
    {
      existingGenClass.removeIncomplete(aIncomplete);
      addIncomplete(aIncomplete);
    }
    else
    {
      incompletes.add(aIncomplete);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(incompletes, incompletesPriority);
    
    return wasAdded;
  }

  public boolean removeIncomplete(GenIncompleteDefinition aIncomplete)
  {
    boolean wasRemoved = false;
    if (incompletes.contains(aIncomplete))
    {
      incompletes.remove(aIncomplete);
      aIncomplete.setGenClass(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStructs()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addStruct(GenStruct aStruct)
  {
    boolean wasAdded = false;
    if (structs.contains(aStruct)) { return false; }
    GenClass existingGenClass = aStruct.getGenClass();
    if (existingGenClass == null)
    {
      aStruct.setGenClass(this);
    }
    else if (!this.equals(existingGenClass))
    {
      existingGenClass.removeStruct(aStruct);
      addStruct(aStruct);
    }
    else
    {
      structs.add(aStruct);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(structs, structsPriority);
    
    return wasAdded;
  }

  public boolean removeStruct(GenStruct aStruct)
  {
    boolean wasRemoved = false;
    if (structs.contains(aStruct))
    {
      structs.remove(aStruct);
      aStruct.setGenClass(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenPackage(GenPackage aGenPackage)
  {
    boolean wasSet = false;
    GenPackage existingGenPackage = genPackage;
    genPackage = aGenPackage;
    if (existingGenPackage != null && !existingGenPackage.equals(aGenPackage))
    {
      existingGenPackage.removeClass(this);
    }
    if (aGenPackage != null)
    {
      aGenPackage.addClass(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGenConstructors()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public GenConstructor addGenConstructor()
  {
    return new GenConstructor(this);
  }

  public boolean addGenConstructor(GenConstructor aGenConstructor)
  {
    boolean wasAdded = false;
    if (genConstructors.contains(aGenConstructor)) { return false; }
    GenClass existingOwner = aGenConstructor.getOwner();
    boolean isNewOwner = existingOwner != null && !this.equals(existingOwner);
    if (isNewOwner)
    {
      aGenConstructor.setOwner(this);
    }
    else
    {
      genConstructors.add(aGenConstructor);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeGenConstructor(GenConstructor aGenConstructor)
  {
    boolean wasRemoved = false;
    //Unable to remove aGenConstructor, as it must always have a owner
    if (!this.equals(aGenConstructor.getOwner()))
    {
      genConstructors.remove(aGenConstructor);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGenConstructorAt(GenConstructor aGenConstructor, int index)
  {  
    boolean wasAdded = false;
    if(addGenConstructor(aGenConstructor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGenConstructors()) { index = numberOfGenConstructors() - 1; }
      genConstructors.remove(aGenConstructor);
      genConstructors.add(index, aGenConstructor);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGenConstructorAt(GenConstructor aGenConstructor, int index)
  {
    boolean wasAdded = false;
    if(genConstructors.contains(aGenConstructor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGenConstructors()) { index = numberOfGenConstructors() - 1; }
      genConstructors.remove(aGenConstructor);
      genConstructors.add(index, aGenConstructor);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGenConstructorAt(aGenConstructor, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenClassClass(GenClass aGenClassClass)
  {
    boolean wasSet = false;
    GenClass existingGenClassClass = genClassClass;
    genClassClass = aGenClassClass;
    if (existingGenClassClass != null && !existingGenClassClass.equals(aGenClassClass))
    {
      existingGenClassClass.removeChild(this);
    }
    if (aGenClassClass != null)
    {
      aGenClassClass.addChild(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTimerStatemachines()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addTimerStatemachine(GenStatemachine aTimerStatemachine)
  {
    boolean wasAdded = false;
    if (timerStatemachines.contains(aTimerStatemachine)) { return false; }
    GenClass existingTimerOwner = aTimerStatemachine.getTimerOwner();
    if (existingTimerOwner == null)
    {
      aTimerStatemachine.setTimerOwner(this);
    }
    else if (!this.equals(existingTimerOwner))
    {
      existingTimerOwner.removeTimerStatemachine(aTimerStatemachine);
      addTimerStatemachine(aTimerStatemachine);
    }
    else
    {
      timerStatemachines.add(aTimerStatemachine);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTimerStatemachine(GenStatemachine aTimerStatemachine)
  {
    boolean wasRemoved = false;
    if (timerStatemachines.contains(aTimerStatemachine))
    {
      timerStatemachines.remove(aTimerStatemachine);
      aTimerStatemachine.setTimerOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTimerStatemachineAt(GenStatemachine aTimerStatemachine, int index)
  {  
    boolean wasAdded = false;
    if(addTimerStatemachine(aTimerStatemachine))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTimerStatemachines()) { index = numberOfTimerStatemachines() - 1; }
      timerStatemachines.remove(aTimerStatemachine);
      timerStatemachines.add(index, aTimerStatemachine);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTimerStatemachineAt(GenStatemachine aTimerStatemachine, int index)
  {
    boolean wasAdded = false;
    if(timerStatemachines.contains(aTimerStatemachine))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTimerStatemachines()) { index = numberOfTimerStatemachines() - 1; }
      timerStatemachines.remove(aTimerStatemachine);
      timerStatemachines.add(index, aTimerStatemachine);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTimerStatemachineAt(aTimerStatemachine, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAutoStatemachines()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addAutoStatemachine(GenStatemachine aAutoStatemachine)
  {
    boolean wasAdded = false;
    if (autoStatemachines.contains(aAutoStatemachine)) { return false; }
    GenClass existingOwner = aAutoStatemachine.getOwner();
    if (existingOwner == null)
    {
      aAutoStatemachine.setOwner(this);
    }
    else if (!this.equals(existingOwner))
    {
      existingOwner.removeAutoStatemachine(aAutoStatemachine);
      addAutoStatemachine(aAutoStatemachine);
    }
    else
    {
      autoStatemachines.add(aAutoStatemachine);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAutoStatemachine(GenStatemachine aAutoStatemachine)
  {
    boolean wasRemoved = false;
    if (autoStatemachines.contains(aAutoStatemachine))
    {
      autoStatemachines.remove(aAutoStatemachine);
      aAutoStatemachine.setOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAutoStatemachineAt(GenStatemachine aAutoStatemachine, int index)
  {  
    boolean wasAdded = false;
    if(addAutoStatemachine(aAutoStatemachine))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAutoStatemachines()) { index = numberOfAutoStatemachines() - 1; }
      autoStatemachines.remove(aAutoStatemachine);
      autoStatemachines.add(index, aAutoStatemachine);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAutoStatemachineAt(GenStatemachine aAutoStatemachine, int index)
  {
    boolean wasAdded = false;
    if(autoStatemachines.contains(aAutoStatemachine))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAutoStatemachines()) { index = numberOfAutoStatemachines() - 1; }
      autoStatemachines.remove(aAutoStatemachine);
      autoStatemachines.add(index, aAutoStatemachine);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAutoStatemachineAt(aAutoStatemachine, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStatemachines()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addStatemachine(GenStatemachine aStatemachine)
  {
    boolean wasAdded = false;
    if (statemachines.contains(aStatemachine)) { return false; }
    GenClass existingStatemachineOwner = aStatemachine.getStatemachineOwner();
    if (existingStatemachineOwner == null)
    {
      aStatemachine.setStatemachineOwner(this);
    }
    else if (!this.equals(existingStatemachineOwner))
    {
      existingStatemachineOwner.removeStatemachine(aStatemachine);
      addStatemachine(aStatemachine);
    }
    else
    {
      statemachines.add(aStatemachine);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStatemachine(GenStatemachine aStatemachine)
  {
    boolean wasRemoved = false;
    if (statemachines.contains(aStatemachine))
    {
      statemachines.remove(aStatemachine);
      aStatemachine.setStatemachineOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStatemachineAt(GenStatemachine aStatemachine, int index)
  {  
    boolean wasAdded = false;
    if(addStatemachine(aStatemachine))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStatemachines()) { index = numberOfStatemachines() - 1; }
      statemachines.remove(aStatemachine);
      statemachines.add(index, aStatemachine);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStatemachineAt(GenStatemachine aStatemachine, int index)
  {
    boolean wasAdded = false;
    if(statemachines.contains(aStatemachine))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStatemachines()) { index = numberOfStatemachines() - 1; }
      statemachines.remove(aStatemachine);
      statemachines.add(index, aStatemachine);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStatemachineAt(aStatemachine, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEnumerations()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addEnumeration(GenEnum aEnumeration)
  {
    boolean wasAdded = false;
    if (enumerations.contains(aEnumeration)) { return false; }
    GenClass existingOwner = aEnumeration.getOwner();
    if (existingOwner == null)
    {
      aEnumeration.setOwner(this);
    }
    else if (!this.equals(existingOwner))
    {
      existingOwner.removeEnumeration(aEnumeration);
      addEnumeration(aEnumeration);
    }
    else
    {
      enumerations.add(aEnumeration);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEnumeration(GenEnum aEnumeration)
  {
    boolean wasRemoved = false;
    if (enumerations.contains(aEnumeration))
    {
      enumerations.remove(aEnumeration);
      aEnumeration.setOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEnumerationAt(GenEnum aEnumeration, int index)
  {  
    boolean wasAdded = false;
    if(addEnumeration(aEnumeration))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEnumerations()) { index = numberOfEnumerations() - 1; }
      enumerations.remove(aEnumeration);
      enumerations.add(index, aEnumeration);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEnumerationAt(GenEnum aEnumeration, int index)
  {
    boolean wasAdded = false;
    if(enumerations.contains(aEnumeration))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEnumerations()) { index = numberOfEnumerations() - 1; }
      enumerations.remove(aEnumeration);
      enumerations.add(index, aEnumeration);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEnumerationAt(aEnumeration, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAttributeGroups()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addAttributeGroup(GenGroup aAttributeGroup)
  {
    boolean wasAdded = false;
    if (attributeGroups.contains(aAttributeGroup)) { return false; }
    GenClass existingOwner = aAttributeGroup.getOwner();
    if (existingOwner == null)
    {
      aAttributeGroup.setOwner(this);
    }
    else if (!this.equals(existingOwner))
    {
      existingOwner.removeAttributeGroup(aAttributeGroup);
      addAttributeGroup(aAttributeGroup);
    }
    else
    {
      attributeGroups.add(aAttributeGroup);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(attributeGroups, attributeGroupsPriority);
    
    return wasAdded;
  }

  public boolean removeAttributeGroup(GenGroup aAttributeGroup)
  {
    boolean wasRemoved = false;
    if (attributeGroups.contains(aAttributeGroup))
    {
      attributeGroups.remove(aAttributeGroup);
      aAttributeGroup.setOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAssociations()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addAssociation(GenAssociation aAssociation)
  {
    boolean wasAdded = false;
    if (associations.contains(aAssociation)) { return false; }
    GenClass existingOwner = aAssociation.getOwner();
    if (existingOwner == null)
    {
      aAssociation.setOwner(this);
    }
    else if (!this.equals(existingOwner))
    {
      existingOwner.removeAssociation(aAssociation);
      addAssociation(aAssociation);
    }
    else
    {
      associations.add(aAssociation);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAssociation(GenAssociation aAssociation)
  {
    boolean wasRemoved = false;
    if (associations.contains(aAssociation))
    {
      associations.remove(aAssociation);
      aAssociation.setOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAssociationAt(GenAssociation aAssociation, int index)
  {  
    boolean wasAdded = false;
    if(addAssociation(aAssociation))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociations()) { index = numberOfAssociations() - 1; }
      associations.remove(aAssociation);
      associations.add(index, aAssociation);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAssociationAt(GenAssociation aAssociation, int index)
  {
    boolean wasAdded = false;
    if(associations.contains(aAssociation))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociations()) { index = numberOfAssociations() - 1; }
      associations.remove(aAssociation);
      associations.add(index, aAssociation);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAssociationAt(aAssociation, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfComplexPorts()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addComplexPort(GenComplexPort aComplexPort)
  {
    boolean wasAdded = false;
    if (complexPorts.contains(aComplexPort)) { return false; }
    GenClass existingOwner = aComplexPort.getOwner();
    if (existingOwner == null)
    {
      aComplexPort.setOwner(this);
    }
    else if (!this.equals(existingOwner))
    {
      existingOwner.removeComplexPort(aComplexPort);
      addComplexPort(aComplexPort);
    }
    else
    {
      complexPorts.add(aComplexPort);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeComplexPort(GenComplexPort aComplexPort)
  {
    boolean wasRemoved = false;
    if (complexPorts.contains(aComplexPort))
    {
      complexPorts.remove(aComplexPort);
      aComplexPort.setOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addComplexPortAt(GenComplexPort aComplexPort, int index)
  {  
    boolean wasAdded = false;
    if(addComplexPort(aComplexPort))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfComplexPorts()) { index = numberOfComplexPorts() - 1; }
      complexPorts.remove(aComplexPort);
      complexPorts.add(index, aComplexPort);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveComplexPortAt(GenComplexPort aComplexPort, int index)
  {
    boolean wasAdded = false;
    if(complexPorts.contains(aComplexPort))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfComplexPorts()) { index = numberOfComplexPorts() - 1; }
      complexPorts.remove(aComplexPort);
      complexPorts.add(index, aComplexPort);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addComplexPortAt(aComplexPort, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRelatedActiveMethod()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addRelatedActiveMethod(ActiveGenMethd aRelatedActiveMethod)
  {
    boolean wasAdded = false;
    if (relatedActiveMethod.contains(aRelatedActiveMethod)) { return false; }
    GenClass existingDefinitionClass = aRelatedActiveMethod.getDefinitionClass();
    if (existingDefinitionClass == null)
    {
      aRelatedActiveMethod.setDefinitionClass(this);
    }
    else if (!this.equals(existingDefinitionClass))
    {
      existingDefinitionClass.removeRelatedActiveMethod(aRelatedActiveMethod);
      addRelatedActiveMethod(aRelatedActiveMethod);
    }
    else
    {
      relatedActiveMethod.add(aRelatedActiveMethod);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeRelatedActiveMethod(ActiveGenMethd aRelatedActiveMethod)
  {
    boolean wasRemoved = false;
    if (relatedActiveMethod.contains(aRelatedActiveMethod))
    {
      relatedActiveMethod.remove(aRelatedActiveMethod);
      aRelatedActiveMethod.setDefinitionClass(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addRelatedActiveMethodAt(ActiveGenMethd aRelatedActiveMethod, int index)
  {  
    boolean wasAdded = false;
    if(addRelatedActiveMethod(aRelatedActiveMethod))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRelatedActiveMethod()) { index = numberOfRelatedActiveMethod() - 1; }
      relatedActiveMethod.remove(aRelatedActiveMethod);
      relatedActiveMethod.add(index, aRelatedActiveMethod);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRelatedActiveMethodAt(ActiveGenMethd aRelatedActiveMethod, int index)
  {
    boolean wasAdded = false;
    if(relatedActiveMethod.contains(aRelatedActiveMethod))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRelatedActiveMethod()) { index = numberOfRelatedActiveMethod() - 1; }
      relatedActiveMethod.remove(aRelatedActiveMethod);
      relatedActiveMethod.add(index, aRelatedActiveMethod);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRelatedActiveMethodAt(aRelatedActiveMethod, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPorts()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addPort(GenPort aPort)
  {
    boolean wasAdded = false;
    if (ports.contains(aPort)) { return false; }
    GenClass existingOwner = aPort.getOwner();
    if (existingOwner == null)
    {
      aPort.setOwner(this);
    }
    else if (!this.equals(existingOwner))
    {
      existingOwner.removePort(aPort);
      addPort(aPort);
    }
    else
    {
      ports.add(aPort);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePort(GenPort aPort)
  {
    boolean wasRemoved = false;
    if (ports.contains(aPort))
    {
      ports.remove(aPort);
      aPort.setOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPortAt(GenPort aPort, int index)
  {  
    boolean wasAdded = false;
    if(addPort(aPort))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPorts()) { index = numberOfPorts() - 1; }
      ports.remove(aPort);
      ports.add(index, aPort);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePortAt(GenPort aPort, int index)
  {
    boolean wasAdded = false;
    if(ports.contains(aPort))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPorts()) { index = numberOfPorts() - 1; }
      ports.remove(aPort);
      ports.add(index, aPort);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPortAt(aPort, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfConstructorContents()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addConstructorContent(GenBody aConstructorContent)
  {
    boolean wasAdded = false;
    if (constructorContents.contains(aConstructorContent)) { return false; }
    GenClass existingOwnerGenBody = aConstructorContent.getOwnerGenBody();
    if (existingOwnerGenBody == null)
    {
      aConstructorContent.setOwnerGenBody(this);
    }
    else if (!this.equals(existingOwnerGenBody))
    {
      existingOwnerGenBody.removeConstructorContent(aConstructorContent);
      addConstructorContent(aConstructorContent);
    }
    else
    {
      constructorContents.add(aConstructorContent);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeConstructorContent(GenBody aConstructorContent)
  {
    boolean wasRemoved = false;
    if (constructorContents.contains(aConstructorContent))
    {
      constructorContents.remove(aConstructorContent);
      aConstructorContent.setOwnerGenBody(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addConstructorContentAt(GenBody aConstructorContent, int index)
  {  
    boolean wasAdded = false;
    if(addConstructorContent(aConstructorContent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstructorContents()) { index = numberOfConstructorContents() - 1; }
      constructorContents.remove(aConstructorContent);
      constructorContents.add(index, aConstructorContent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveConstructorContentAt(GenBody aConstructorContent, int index)
  {
    boolean wasAdded = false;
    if(constructorContents.contains(aConstructorContent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstructorContents()) { index = numberOfConstructorContents() - 1; }
      constructorContents.remove(aConstructorContent);
      constructorContents.add(index, aConstructorContent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addConstructorContentAt(aConstructorContent, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUniqueConstructorContents()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addUniqueConstructorContent(UniqueGenBody aUniqueConstructorContent)
  {
    boolean wasAdded = false;
    if (uniqueConstructorContents.contains(aUniqueConstructorContent)) { return false; }
    GenClass existingOwnerUniqueGenBody = aUniqueConstructorContent.getOwnerUniqueGenBody();
    if (existingOwnerUniqueGenBody == null)
    {
      aUniqueConstructorContent.setOwnerUniqueGenBody(this);
    }
    else if (!this.equals(existingOwnerUniqueGenBody))
    {
      existingOwnerUniqueGenBody.removeUniqueConstructorContent(aUniqueConstructorContent);
      addUniqueConstructorContent(aUniqueConstructorContent);
    }
    else
    {
      uniqueConstructorContents.add(aUniqueConstructorContent);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUniqueConstructorContent(UniqueGenBody aUniqueConstructorContent)
  {
    boolean wasRemoved = false;
    if (uniqueConstructorContents.contains(aUniqueConstructorContent))
    {
      uniqueConstructorContents.remove(aUniqueConstructorContent);
      aUniqueConstructorContent.setOwnerUniqueGenBody(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUniqueConstructorContentAt(UniqueGenBody aUniqueConstructorContent, int index)
  {  
    boolean wasAdded = false;
    if(addUniqueConstructorContent(aUniqueConstructorContent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUniqueConstructorContents()) { index = numberOfUniqueConstructorContents() - 1; }
      uniqueConstructorContents.remove(aUniqueConstructorContent);
      uniqueConstructorContents.add(index, aUniqueConstructorContent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUniqueConstructorContentAt(UniqueGenBody aUniqueConstructorContent, int index)
  {
    boolean wasAdded = false;
    if(uniqueConstructorContents.contains(aUniqueConstructorContent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUniqueConstructorContents()) { index = numberOfUniqueConstructorContents() - 1; }
      uniqueConstructorContents.remove(aUniqueConstructorContent);
      uniqueConstructorContents.add(index, aUniqueConstructorContent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUniqueConstructorContentAt(aUniqueConstructorContent, index);
    }
    return wasAdded;
  }

  /* Code from template association_sorted_serializable_readObject */ 
  private void readObject(java.io.ObjectInputStream in)
  throws Exception
  {
    in.defaultReadObject();

    specializedDefinitionsPriority = 
      Comparator.comparing(GenSpecializedDefinition::getPriority);
    methodsPriority = 
      Comparator.comparing(GenMethod::getPriority);
    fieldsPriority = 
      Comparator.comparing(GenField::getPriority);
    commentsPriority = 
      Comparator.comparing(GenComment::getPriority);
    requirementsPriority = 
      Comparator.comparing(GenRequirement::getPriority);
    dependenciesPriority = 
      Comparator.comparing(GenDepend::getPriority);
    interfacesPriority = 
      Comparator.comparing(GenInterface::getPriority);
    childrenPriority = 
      Comparator.comparing(GenClass::getPriority);
    predefinitionsPriority = 
      Comparator.comparing(GenBody::getPriority);
    memberInitializersPriority = 
      Comparator.comparing(MemberInitializer::getPriority);
    headerDependenciesPriority = 
      Comparator.comparing(GenHeaderDepend::getPriority);
    incompletesPriority = 
      Comparator.comparing(GenIncompleteDefinition::getPriority);
    structsPriority = 
      Comparator.comparing(GenStruct::getPriority);
    attributeGroupsPriority = 
      Comparator.comparing(GenGroup::getPriority);
  }
  
  public void delete()
  {
    while( !specializedDefinitions.isEmpty() )
    {
      specializedDefinitions.get(0).setGenClass(null);
    }
    while( !methods.isEmpty() )
    {
      methods.get(0).setGenClass(null);
    }
    while( !fields.isEmpty() )
    {
      fields.get(0).setGenClass(null);
    }
    while( !comments.isEmpty() )
    {
      comments.get(0).setGenClass(null);
    }
    while( !requirements.isEmpty() )
    {
      requirements.get(0).setGenClass(null);
    }
    while( !dependencies.isEmpty() )
    {
      dependencies.get(0).setGenDependClass(null);
    }
    while( !interfaces.isEmpty() )
    {
      interfaces.get(0).setGenClassInterface(null);
    }
    while( !children.isEmpty() )
    {
      children.get(0).setGenClassClass(null);
    }
    while( !predefinitions.isEmpty() )
    {
      predefinitions.get(0).setGenClass(null);
    }
    while( !memberInitializers.isEmpty() )
    {
      memberInitializers.get(0).setGenClass(null);
    }
    while( !headerDependencies.isEmpty() )
    {
      headerDependencies.get(0).setGenHeaderDependClass(null);
    }
    while( !incompletes.isEmpty() )
    {
      incompletes.get(0).setGenClass(null);
    }
    while( !structs.isEmpty() )
    {
      structs.get(0).setGenClass(null);
    }
    if (genPackage != null)
    {
      GenPackage placeholderGenPackage = genPackage;
      this.genPackage = null;
      placeholderGenPackage.removeClass(this);
    }
    for(int i=genConstructors.size(); i > 0; i--)
    {
      GenConstructor aGenConstructor = genConstructors.get(i - 1);
      aGenConstructor.delete();
    }
    if (genClassClass != null)
    {
      GenClass placeholderGenClassClass = genClassClass;
      this.genClassClass = null;
      placeholderGenClassClass.removeChild(this);
    }
    while( !timerStatemachines.isEmpty() )
    {
      timerStatemachines.get(0).setTimerOwner(null);
    }
    while( !autoStatemachines.isEmpty() )
    {
      autoStatemachines.get(0).setOwner(null);
    }
    while( !statemachines.isEmpty() )
    {
      statemachines.get(0).setStatemachineOwner(null);
    }
    while( !enumerations.isEmpty() )
    {
      enumerations.get(0).setOwner(null);
    }
    while( !attributeGroups.isEmpty() )
    {
      attributeGroups.get(0).setOwner(null);
    }
    while( !associations.isEmpty() )
    {
      associations.get(0).setOwner(null);
    }
    while( !complexPorts.isEmpty() )
    {
      complexPorts.get(0).setOwner(null);
    }
    while( !relatedActiveMethod.isEmpty() )
    {
      relatedActiveMethod.get(0).setDefinitionClass(null);
    }
    while( !ports.isEmpty() )
    {
      ports.get(0).setOwner(null);
    }
    while( !constructorContents.isEmpty() )
    {
      constructorContents.get(0).setOwnerGenBody(null);
    }
    while( !uniqueConstructorContents.isEmpty() )
    {
      uniqueConstructorContents.get(0).setOwnerUniqueGenBody(null);
    }
  }

  // line 50 "../../../../../UmpleTLTemplates/Core.ump"
  public String specializedDefinitions(){
    return getSpecializedDefinitions().stream().map(GenSpecializedDefinition::getContent).collect(Collectors.joining(NL));
  }

  // line 103 "../../../../../UmpleTLTemplates/Core.ump"
  public String enumerationString(){
    String result= getEnumerations().stream().map(GenEnum::declaration).collect(Collectors.joining(NL+NL));
		if(result.isEmpty()){
			return result;
		}
		
		return result+ NL;
  }

  // line 569 "../../../../../UmpleTLTemplates/Core.ump"
  public String predefinitions(){
    return getPredefinitions().stream().map(GenBody::getBody).filter(s->!s.isEmpty()).collect(Collectors.joining(NL));
  }

  // line 583 "../../../../../UmpleTLTemplates/Core.ump"
   private void setParentInternally(GenClass parent){
    if(parent== null|| parent.equals(getParent())){
			return;
		}
		
		GenClass current= getParent();
		if(current != null){
			current.removeChild(this);
		}
		setParent(parent);
  }

  // line 595 "../../../../../UmpleTLTemplates/Core.ump"
  public GenEnum enumByName(String name){
    if(name== null){
			return null;
		}
		
		for(GenEnum enumeration: this.getEnumerations()){
			if(name.equals(enumeration.getName())){
				return enumeration;
			}
		}
		
		return null;
  }


  /**
   * Use methodByIdentifier in case of polymorphism
   */
  // line 610 "../../../../../UmpleTLTemplates/Core.ump"
  public GenMethod methodByName(String name){
    if(name== null){
			return null;
		}
		
		for(GenMethod method: this.getMethods()){
			if(name.equals(method.getName())){
				return method;
			}
		}
		
		return null;
  }

  // line 624 "../../../../../UmpleTLTemplates/Core.ump"
  public GenField fieldByName(String name){
    if(name== null){
			return null;
		}
		
		for(GenField field: this.getFields()){
			if(name.equals(field.getName())){
				return field;
			}
		}
		
		return null;
  }

  // line 638 "../../../../../UmpleTLTemplates/Core.ump"
  public GenMethod methodByIdentifier(String identifier){
    if(identifier== null){
			return null;
		}
		
		for(GenMethod method: this.getMethods()){
			if(identifier.equals(method.identifier())){
				return method;
			}
		}
		
		return null;
  }

  // line 652 "../../../../../UmpleTLTemplates/Core.ump"
  public String callNamespaceBegin(){
    String namespace= getNamespace();
		if(namespace== null || namespace.isEmpty()){
			return namespace;
		}
		String normalized= namespace.replace("/", ".").replace("_", ".");
		String[] splits = normalized.split("\\.");
		String root= Arrays.asList(splits).stream().map(string-> "namespace "+ string + " {").collect(Collectors.joining(" "));
		
		String enclosure= namespaceEnclosure();
		return "#define "+ enclosure+ "_BEGIN"+ "   "+ root;
  }

  // line 665 "../../../../../UmpleTLTemplates/Core.ump"
  public String callNamespaceEnd(){
    String enclosure= namespaceEnclosure();
		if(enclosure.isEmpty()){
			return enclosure;
		}
		
		String namespace= getNamespace();
		String normalized= namespace.replace("/", ".").replace("_", ".");
		String[] splits = normalized.split("\\.");
		
		return "#define "+ enclosure+ "_END"+ Arrays.asList(splits).stream().map(string-> "   }").collect(Collectors.joining(" "));
  }

  // line 678 "../../../../../UmpleTLTemplates/Core.ump"
  public List<GenClass> allParents(){
    Set<GenClass> all= new HashSet<GenClass>();
		List<GenClass> visited= new ArrayList<GenClass>();
		return searchParents(this, visited, all);
  }

  // line 684 "../../../../../UmpleTLTemplates/Core.ump"
  public List<GenClass> searchParents(GenClass genClass, List<GenClass> visited, Object all){
    if(!visited.contains(genClass)){
			List<GenInterface> interfaces = genClass.getInterfaces();
			((Set<GenClass>)all).addAll(interfaces);
			
			for(GenInterface _interface: interfaces){
				searchParents(_interface, visited, all);
			}
			
			GenClass parent = genClass.getParent();
			if(parent != null){
				((Set<GenClass>)all).add(parent);
				searchParents(parent, visited, all);
			}
		}
		
		return new ArrayList<GenClass>((Set<GenClass>)all);
  }

  // line 703 "../../../../../UmpleTLTemplates/Core.ump"
  public MemberInitializer initializerByName(String name){
    if(name== null){
			return null;
		}
		
		for(MemberInitializer memberInitializer: this.getMemberInitializers()){
			if(name.equals(memberInitializer.getMember())){
				return memberInitializer;
			}
		}
		
		return null;
  }

  // line 719 "../../../../../UmpleTLTemplates/Core.ump"
  public String emitComments(){
    String results= getComments().stream().map(GenComment::getBody).collect(Collectors.joining(NL));
		if(!results.isEmpty()){
			results+= NL;
		}
		return results;
  }

  // line 726 "../../../../../UmpleTLTemplates/Core.ump"
  public String emitRequirements(){
    String results= getRequirements().stream().map(GenRequirement::getBody).collect(Collectors.joining(NL));
		if(!results.isEmpty()){
			results+= NL;
		}
		return results;
  }

  // line 740 "../../../../../UmpleTLTemplates/Core.ump"
  public String classDeclarations(){
    GenClass parent = this.getParent();
		List<GenInterface> interfaces =  this.getInterfaces();
		List<String> declarations= new ArrayList<String>();
		if(parent!= null){
			declarations.add("public "+ parent.getName());
		}
		interfaces.stream().forEach(_interface-> declarations.add("public "+ _interface.getName()));
		
		if(isSingleton()){
			declarations.add("public Singleton<"+ getName()+">");
		}
		
		return declarations.stream().collect(Collectors.joining(", "));
  }

  // line 756 "../../../../../UmpleTLTemplates/Core.ump"
  public String memberInitializerString(GenMethod method){
    if(this.hasMemberInitializers()){
			return NL+ this.getMemberInitializers().stream().map(memberInitializer-> "\t\t"+ memberInitializer.declaration(method)).collect(Collectors.joining(","+NL));
		}
		return "";
  }

  // line 151 "../../../../../UmpleTLTemplates/Associations.ump"
  public GenAssociation associationByName(String name){
    if(name== null){
			 return null;
		 }
		 
		 for(GenAssociation association: getAssociations()){
	    	if(name.equals(association.getSource().getName()+association.getTarget().getName())){
	    		return association;
	    	}
		 }
		 
		 return null;
  }

  // line 210 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<String> portNames(){
    return getPorts().stream().map(GenPort::getName).collect(Collectors.toList());
  }

  // line 214 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<ActiveGenMethd> activeMethods(){
    return getMethods().stream().filter(genMethod-> genMethod instanceof ActiveGenMethd).map(ActiveGenMethd.class::cast).collect(Collectors.toList());
  }

  // line 218 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<GenActiveField> activeFields(){
    return getFields().stream().filter(genField-> genField instanceof GenActiveField).map(GenActiveField.class::cast).collect(Collectors.toList());
  }

  // line 222 "../../../../../UmpleTLTemplates/Attributes.ump"
  public GenComplexPort complexPortByName(String name){
    if(name== null){
			return null;
		}
		
		for(GenComplexPort port: getComplexPorts()){
			if(name.equals(port.getName())){
				return port;
			}
		}
		
		return null;
  }

  // line 28 "../../../../../UmpleTLTemplates/Depend.ump"
  public String includeNamespace(){
    return getGenPackage().getName();
  }

  // line 130 "../../../../../UmpleTLTemplates/Depend.ump"
  public boolean addDependency(String use){
    if (use.endsWith(".*")) {
			String path = use.substring(0, use.length() - 2);
			GenPackage packageByName = getGenPackage().rootPackage().packageByName(path);
			for (GenClass genClass : packageByName.getClasses()) {
				GenDepend genDepend = new GenDepend(genClass.getName());
				String namespace = genClass.getNamespace();
				genDepend.setNamespace(namespace);
				genDepend.setAddSuffix(true);
				addDependency(genDepend);
			}

			return true;
		}
		return addAsType(use) || addAsLibrary(use) || addAsBuiltin(use);
  }

  // line 147 "../../../../../UmpleTLTemplates/Depend.ump"
  public boolean addAsBuiltin(String use){
    GenDepend genDepend = new GenDepend(unquotedType(use));
		genDepend.setPrioritized(use.indexOf("\"")> -1);
		genDepend.setIsLibrary(true /*isHeaderType(use)*/);
		addDependency(genDepend);
		return true;
  }

  // line 155 "../../../../../UmpleTLTemplates/Depend.ump"
  public boolean addAsLibrary(String use){
    String process = unquotedType(use);
		int libIndex = process.indexOf("::");
		if(libIndex>-1){
			String lib = process.substring(0, libIndex);
			String include = process.substring(libIndex+2);
			
			GenDepend genDepend = new GenDepend(include);
			genDepend.setIsLibrary(true);
			genDepend.setPrioritized(use.indexOf("\"")>-1);
			genDepend.setNamespace(lib);
			addDependency(genDepend);
			return true;
		}
		return false;
  }

  // line 172 "../../../../../UmpleTLTemplates/Depend.ump"
  public Boolean addAsType(String use){
    int indexOf = use.lastIndexOf(".");
		String includeType;
		GenPackage packageByName;
		if(indexOf>-1){
			packageByName = getGenPackage().rootPackage().packageByName(use.substring(0, indexOf));
			includeType = use.substring(indexOf+1);
		}else{
			packageByName= getGenPackage().rootPackage();
			includeType = use;
		}
		
		if(packageByName!= null){
			GenClass dependClass = packageByName.classByName(includeType);
			if(dependClass != null){
				GenDepend genDepend = new GenDepend(includeType);
				genDepend.setAddSuffix(true);
				genDepend.setNamespace(dependClass.getNamespace());
				addDependency(genDepend);
				return true;
			}
		}
		return false;
  }

  // line 197 "../../../../../UmpleTLTemplates/Depend.ump"
  public String unquotedType(String type){
    String process = type;
		if (process.startsWith("\"") || process.startsWith("<")) {
			process = process.substring(1);
		}

		if (process.endsWith("\"") || process.endsWith(">")) {
			process = process.substring(0, process.length() - 1);
		}
		return process;
  }

  // line 209 "../../../../../UmpleTLTemplates/Depend.ump"
  public Boolean isHeaderType(String type){
    return _isHeaderType(unquotedType(type));
  }

  // line 213 "../../../../../UmpleTLTemplates/Depend.ump"
  public Boolean _isHeaderType(String type){
    return type.endsWith(".h") || type.endsWith(".hpp");
  }

  // line 217 "../../../../../UmpleTLTemplates/Depend.ump"
  public String typeIncludes(){
    List<String> declarations = baseDeclarations();

		Map<String, List<String>> map = (Map<String, List<String>>) searchDependencies();
		for (String namespace : map.keySet()) {
			List<String> list = map.get(namespace);
			for (String type : list) {
				addToDeclarations(declarations, addDeclaration(type,namespace));
			}
		}

		for (GenDepend depend : getDependencies()) {
			// Make sure to consider user's types; include SomeClass;
			if (!depend.getIsLibrary()) { // prevent include "stdio"; those are handled later as libraries
				declarations.add(depend.declaration());
			}
		}

		return typeIncludes(declarations.stream().collect(Collectors.joining(NL)), "file") + NL;
  }

  // line 238 "../../../../../UmpleTLTemplates/Depend.ump"
  public String headerIncludes(){
    List<String> declarations = baseDeclarations();
		return typeIncludes(declarations.stream().collect(Collectors.joining(NL)), "file") + NL;
  }

  // line 243 "../../../../../UmpleTLTemplates/Depend.ump"
  public String libraryIncludes(){
    List<String> declarations = new ArrayList<String>();
		List<String> includes = new ArrayList<String>();
		for (GenDepend depend : getDependencies()) {
			// ignore examples below. They are already were added as file includes earlier
			// depend Some; While is belong to some namespace; i.e. org.simple
			// depend org.simple.Some
			if (depend.getIsLibrary()) {
				// depend "std.string"
				// Will be using namespace std;
				// #include <istream>
				// Hence, it will be added as a library
				String declaration = depend.declaration();
				if(!includes.contains(declaration)){
					includes.add(declaration);
				}
				
				String dependNamespace = depend.getNamespace();
				if (dependNamespace != null) {
					String namespaceDeclaration = namespaceDeclaration(dependNamespace);
					if(!declarations.contains(namespaceDeclaration)){
						declarations.add(namespaceDeclaration);
					}
				}
			}
		}
		
		if (declarations.isEmpty()) {
			return "";
		}
		declarations.addAll(includes);
		return typeIncludes(declarations.stream().collect(Collectors.joining(NL)), "library") + NL;
  }

  // line 277 "../../../../../UmpleTLTemplates/Depend.ump"
  public void handleLibrary(Set<String> declarations, List<String> includes, GenDepend depend, String namespace){
    String declaration = namespaceDeclaration(namespace);
		if (!declarations.contains(declaration)) {
			declarations.add(declaration);
		}

		String dependDeclaration = depend.declaration();
		if (!includes.contains(dependDeclaration)) {
			includes.add(dependDeclaration);
		}
  }

  // line 289 "../../../../../UmpleTLTemplates/Depend.ump"
  public List<String> baseDeclarations(){
    List<String> declarations = new ArrayList<String>();
		addToDeclarations(declarations, addDeclaration(rootIncludeName(), null));
		addToDeclarations(declarations, addDeclaration(getName(), getNamespace()));

		GenClass parentClass = getParent();
		if (parentClass != null) {
			addToDeclarations(declarations, addDeclaration(parentClass.getName(), parentClass.getNamespace()));
		}

		for (GenInterface _interface : getInterfaces()) {
			addToDeclarations(declarations, addDeclaration(_interface.getName(), _interface.getNamespace()));
		}
		return declarations;
  }

  // line 305 "../../../../../UmpleTLTemplates/Depend.ump"
  public GenDepend addDeclaration(String type, String namespace){
    GenDepend depend = new GenDepend(type);
		depend.setAddSuffix(true);
		depend.setNamespace(namespace);
		return depend;
  }

  // line 312 "../../../../../UmpleTLTemplates/Depend.ump"
  public void addToDeclarations(List<String> declarations, GenDepend depend){
    String declaration = depend.declaration();
		if (!declarations.contains(declaration)) {
			declarations.add(declaration);
		}
  }

  // line 319 "../../../../../UmpleTLTemplates/Depend.ump"
  public String incompleteDeclarations(){
    List<String> declarations = new ArrayList<String>();
		Map<String, List<String>> map = (Map<String, List<String>>) searchDependencies();
		
		String _namespace = getNamespace();
		if(!map.isEmpty()){
			for(String namespace: map.keySet()){
				if(!namespace.equals(_namespace)){
					List<String> list = map.get(namespace);
					declarations.add(namespaceOpening(namespace));
					declarations.addAll(list.stream().map(type->"  "+ incompleteDeclaration(type)).collect(Collectors.toList()));
					declarations.add(namespaceClosing(namespace));
					declarations.add(namespaceDeclaration("::"+namespaceCallPath(namespace)));
				}
			}
		}
		
		if(declarations.isEmpty()){
			return "";
		}
		
		return declarations.stream().collect(Collectors.joining(NL))+ NL+ NL;
  }

  // line 343 "../../../../../UmpleTLTemplates/Depend.ump"
  public String selfIncompleteDeclarations(){
    List<String> declarations = new ArrayList<String>();
		Map<String, List<String>> map = (Map<String, List<String>>)searchDependencies();
		
		String _namespace = getNamespace();
		if(map.containsKey(_namespace)){
			declarations.addAll(map.get(_namespace).stream().map(type->incompleteDeclaration(type)).collect(Collectors.toList()));
		}
		
		for(GenAssociation association: getAssociations()){
			if(association.isMany()){
				 String sortKey = association.getSortKey();
				 if(sortKey!= null && !sortKey.isEmpty()){
					 String comparatorId = association.comparatorId();
					 String incompleteStructDeclaration = incompleteStructDeclaration(comparatorId);
					 if(!declarations.contains(incompleteStructDeclaration)){
						 declarations.add(incompleteStructDeclaration);
					 }
				 }
			}
		}
		
		return declarations.stream().collect(Collectors.joining(NL))+ NL;
  }

  // line 368 "../../../../../UmpleTLTemplates/Depend.ump"
  public String rootIncludeName(){
    return getGenPackage().rootIncludeName();
  }

  // line 372 "../../../../../UmpleTLTemplates/Depend.ump"
  public Object searchDependencies(){
    Map<String, List<String>> map = new HashMap<String, List<String>>();
		GenPackage rootPackage = getGenPackage().rootPackage();

		GenClass parentClass = getParent();
		if (parentClass != null) {
			searchDependencies(map, rootPackage, parentClass.getName());
		}

		for (GenMethod method : getMethods()) {
			searchDependencies(map, rootPackage, method.getReturnType());

			for (GenMethodParameter parameter : method.getParameters()) {
				searchDependencies(map, rootPackage, parameter.getCrudType());
			}
		}

		return map;
  }

  // line 392 "../../../../../UmpleTLTemplates/Depend.ump"
  public void searchDependencies(Map<String,List<String>> map, GenPackage rootPackage, String type){
    if (name.equals(type)) {
			return;
		}
		
		GenClass classByName = rootPackage.rootPackage().classByName(type);
		if(classByName!= null){
			String _namespace = classByName.getNamespace();
			List<String> declarations = map.get(_namespace);
			if(declarations== null){
				declarations= new ArrayList<String>();
				map.put(_namespace, declarations);
			}
			
			if (!declarations.contains(type)) {
				declarations.add(type);
			}
		}
  }

  // line 194 "../../../../../UmpleTLTemplates/Content.ump"
  public String implementations(){
    for(GenMethod method: getMethods()){
			if(method.getGroup()== null){
				method.setGroup(getAttributeGroup(indexOfAttributeGroup(new GenGroup(GenClass.METHOD_GROUP))));
			}
		}
		
		List<String> implementations= new ArrayList<String>();
		
		List<GenGroup> attributeGroups = getAttributeGroups();
		for(GenGroup attributeGroup: attributeGroups){
			List<String> strings= new ArrayList<String>();
			for(GenField field: getFields()){
				if(field.isGeneratable() && attributeGroup.equals(field.getGroup())&& field.hasImplementation()){
					strings.add(field.implementation());
				}
			}
			
			if(!strings.isEmpty()){
				String implDescription = attributeGroup.getImplDescription();
				if(!implementations.isEmpty()){
					implementations.add("\n\n");
				}
				
				if(implDescription!= null && !implDescription.isEmpty()){
					implementations.add(implDescription+ "\n");
				}
				
				implementations.add(strings.stream().collect(Collectors.joining("\n")));
			}
		}
		
		List<GenMethod> implementableMethods= implementableMethods();
		for(GenGroup attributeGroup: getAttributeGroups()){
			List<GenMethod> methods = new ArrayList<GenMethod>();
			for(GenMethod genMethod: implementableMethods){
				if(attributeGroup.equals(genMethod.getGroup()) && checkMethod(genMethod.getName())){
					methods.add(genMethod);
				}
			}
			
			if(!methods.isEmpty()){
				Collections.sort(methods, getMethodsPriority());
				
				if(!implementations.isEmpty()){
					implementations.add("\n\n");
				}
				
				String implDescription = attributeGroup.getImplDescription();
				
				if(implDescription!= null && !implDescription.isEmpty()){
					implementations.add(implDescription+ "\n");
				}
				
				implementations.add(methods.stream().map(genMethod->{
					return genMethod.getExternalDefinition()== null?genMethod.implementation(name): genMethod.implementation();
				}).collect(Collectors.joining("\n"+ "\n")));
			}
		}
		
		return implementations.stream().collect(Collectors.joining());
  }

  // line 257 "../../../../../UmpleTLTemplates/Content.ump"
  public Boolean checkMethod(String originalName){
    GenField inernal = fieldByName("internal_"+originalName);
		if(inernal!= null){
			return false;
		}
		
		GenMethod current = methodByName(originalName);
		if(current != null && !current.getIsGeneratable()){
			return false;
		}
		
		return true;
  }

  // line 271 "../../../../../UmpleTLTemplates/Content.ump"
  public String declarations(){
    String allContent = visibilityContent("global");
		for (String visibility : Arrays.asList(new String[] { "private", "public", "protected"})) {
			String visibilityContents = visibilityContent(visibility);
			if (!visibilityContents.isEmpty()) {
				if(!allContent.isEmpty()){
					allContent+= NL;
				}
				allContent+= NL+ visibilityPart(visibility, StringUtil.indent(NL+ visibilityContents, 1));
			}
		}

		return allContent + NL;
  }

  // line 286 "../../../../../UmpleTLTemplates/Content.ump"
  public String visibilityContent(String visibility){
    String visibilityContents= "";
		List<GenMethod> methods = getMethods();

		List<GenGroup> attributeGroups = getAttributeGroups();
		for (GenGroup attributeGroup : attributeGroups) {
			List<GenField> fields= new ArrayList<GenField>();
			
			List<String> strings = new ArrayList<String>();
			for (GenField field : getFields()) {
				if (field.isGeneratable() && visibility.equals(field.getVisibility()) && attributeGroup.equals(field.getGroup())) {
					fields.add(field);
				}
			}
			
			Collections.sort(fields, getFieldsPriority());
			
			for (GenField field : fields) {
				strings.add(field.declaration());
			}

			if (!strings.isEmpty()) {
				if(!visibilityContents.isEmpty()){
					visibilityContents+= NL;
				}
				
				String description = attributeGroup.getDescription();
				if (description != null) {
					strings.add(0, description);
				}
				visibilityContents += strings.stream().collect(Collectors.joining(NL));
			}
		}
		
		List<GenMethod> visited = new ArrayList<GenMethod>();

		for (GenGroup attributeGroup : attributeGroups) {
			List<GenMethod> methodsTo= new ArrayList<GenMethod>();
			List<String> strings = new ArrayList<String>();
			for (GenMethod method : getMethods()) {
				if (visibility.equals(method.getVisibility()) && attributeGroup.equals(method.getGroup())) {
					visited.add(method);
					String externalDefinition = method.getExternalDefinition();
					if ((externalDefinition == null || externalDefinition.isEmpty())) {
						methodsTo.add(method);
					}
				}
			}
			
			Collections.sort(methodsTo, getMethodsPriority());
			for(GenMethod method: methodsTo){
				if(checkMethod(method.getName())){	//FIXME: TEMP
					strings.add(method.declaration());
				}
			}

			if (!strings.isEmpty()) {
				if(!visibilityContents.isEmpty()){
					visibilityContents += NL+ NL;
				}
				
				String description = attributeGroup.getDescription();
				if (description != null) {
					strings.add(0, description);
				}

				visibilityContents += strings.stream().collect(Collectors.joining(NL));
			}
		}

		List<GenMethod> methodsTo= new ArrayList<GenMethod>();
		for (GenMethod method : methods) {
			if (!visited.contains(method)) {
				String externalDefinition = method.getExternalDefinition();
				if ((externalDefinition == null || externalDefinition.isEmpty()) && visibility.equals(method.getVisibility())) {
					methodsTo.add(method);
				}
			}
		}
		
		Collections.sort(methodsTo, getMethodsPriority());
		for(GenMethod method: methodsTo){
			visibilityContents += NL + method.declaration().trim();
		}
		
		methodsTo= new ArrayList<GenMethod>();

		// If the class is not abstract, make sure to search for all unimplemented methods from parent classes and interfaces implemented.
		if (!getIsAbstract() && genClassClass instanceof GenInterface == false) {
			List<String> identifiers = methods.stream().map(GenMethod::identifier).collect(Collectors.toList());
			for (GenMethod method : allMethods()) {
				if (method.getExternalDefinition() == null && !identifiers.contains(method.identifier())
						&& visibility.equals(method.getVisibility()) && !method.getIsConstructor()&& !method.getIsOperator()) {
					methodsTo.add(method);
				}
			}
		}
		
		Collections.sort(methodsTo, getMethodsPriority());
		for(GenMethod method: methodsTo){
			if(checkMethod(method.getName())){	//FIXME: TEMP
				visibilityContents += NL + method.declaration(true).trim();
			}
		}

		return visibilityContents;
  }

  // line 401 "../../../../../UmpleTLTemplates/Content.ump"
  public List<GenMethod> allMethods(){
    List<GenMethod> all= new ArrayList<GenMethod>();
	    List<GenMethod> nullImplementations= new ArrayList<GenMethod>();
		all.addAll(getMethods());
		
		List<String> identifiers= all.stream().map(GenMethod::identifier).collect(Collectors.toList());
		
		searchAllMethods(this, nullImplementations, identifiers);
		
		for(int index1=nullImplementations.size()-1; index1>=0; index1--){
			GenMethod method1 = nullImplementations.get(index1);
			String identifier1= method1.identifier();
			
			int index2=index1-1;
			boolean shallContinue= true;
			while(index2>=0 && shallContinue){
				GenMethod method2 = nullImplementations.get(index2--);
				String identifier2= method2.identifier();
				if(identifier1.equals(identifier2) && !identifiers.contains(identifier2)){
					shallContinue= false;
				}
			}
			
			if(shallContinue && !all.contains(method1) && !method1.getIsOperator() && !method1.getIsHeader()){
				all.add(method1);
			}
		}
		return all;
  }

  // line 431 "../../../../../UmpleTLTemplates/Content.ump"
  public List<String> searchAllMethods(GenClass genClass, List<GenMethod> all, List<String> identifiers){
    List<String> abstracts = new ArrayList<String>();
		searchAllMethods(genClass, all, identifiers, abstracts, new ArrayList<GenClass>());
		return identifiers;
  }

  // line 437 "../../../../../UmpleTLTemplates/Content.ump"
  public void searchAllMethods(GenClass genClass, List<GenMethod> all, List<String> identifiers, List<String> abstracts, List<GenClass> visited){
    if (visited.contains(genClass)) {
			return;
		}
		visited.add(genClass);
		GenClass parent = genClass.getParent();
		  
		if(parent != null && parent.getIsAbstract()){
			for(GenMethod method: parent.getMethods()){
				String identifier = method.identifier();
				if(!method.getIsAbstract()){
					if(!identifiers.contains(identifier) && !abstracts.contains(identifier)){
						all.add(method);
						identifiers.add(identifier);
					}
				}else{
					abstracts.add(identifier);
				}
			}
			searchAllMethods(parent, all, identifiers, abstracts, visited);
		}
		
		for(GenClass genInterface: getInterfaces()){
			for(GenMethod method: genInterface.getMethods()){
				String identifier = method.identifier();
				if(!identifiers.contains(identifier) && !abstracts.contains(identifier)){
					all.add(method);
					identifiers.add(identifier);
				}
				abstracts.add(identifier);
			}
			searchAllMethods(genInterface, all, identifiers, abstracts, visited);
		}
  }

  // line 472 "../../../../../UmpleTLTemplates/Content.ump"
  public List<GenMethod> implementableMethods(){
    return implementableMethods(true, this instanceof GenInterface== false && !getIsAbstract());
  }

  // line 476 "../../../../../UmpleTLTemplates/Content.ump"
  public List<GenMethod> implementableMethods(boolean checkAbstract, boolean all){
    List<GenMethod> genMethods = new ArrayList<GenMethod>();
		for (GenGroup attributeGroup : getAttributeGroups()) {
			for (GenMethod method : all ? allMethods() : getMethods()) {
				if (!method.getIsHeader() && attributeGroup.equals(method.getGroup())){
					if(all) {
						if(method.getGenClass().equals(this)|| (!method.hasBody() && !method.getIsConstructor() && !method.getIsOperator())){
							genMethods.add(method);
						}
					}else{
						if(method.hasBody() || method.getIsConstructor() || method.getIsOperator() || method.getIsCore()){
							genMethods.add(method);
						}
					}
				}
			}
		}

		return genMethods;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1363 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String preprocessingDefinition(String suffix){
    String namespace= this.getNamespace();
		String name= this.getName();
		
		if(namespace.isEmpty()){
			return (name+"_"+suffix).toUpperCase();
		}else{
			return (namespace.replace("/", "_")+"_"+name+"_"+suffix).toUpperCase();
		}
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1374 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceOpening(){
    return namespaceOpening(getNamespace())+ NL;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1378 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceClosing(){
    return namespaceClosing(getNamespace())+ NL;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1382 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceOpening(String namespace){
    return namespace("_", null, "_BEGIN", namespace);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1386 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceClosing(String namespace){
    return namespace("_", null, "_END", namespace);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1390 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespace(String join, String prepend, String append){
    return namespace(join, prepend, append, getNamespace());
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1394 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespace(String join, String prepend, String append, String namespace){
    String _namespace= namespaceEnclosure(join, namespace);
		if(_namespace.isEmpty()){
			return _namespace;
		}
		
		if(prepend != null){
			_namespace= prepend+ _namespace;
		}
		
		if(append != null){
			_namespace= _namespace+ append;
		}
		
		return _namespace;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1411 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String preprocessingDefinitionName(){
    String _namespace= namespaceEnclosure();
		if(_namespace.isEmpty()){
			_namespace= getGenPackage().getName();
		}
		_namespace= "DEF_"+ _namespace;	//A protection against package names that start with numbers; otherwise, this definition will be invalid
		_namespace+= "_"+ getName();
		return _namespace.toUpperCase();
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1421 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String qualifiedName(){
    String fullPath= fullPath();
		if(fullPath== null || fullPath.isEmpty()){
			return getName();
		}
		
		return fullPath+ "/"+ getName();
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1430 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String fullPath(){
    String _namespace= getNamespace();
		if(_namespace.isEmpty()){
			_namespace= getGenPackage().getName();
		}else{
			_namespace= toPath(_namespace);
		}
		return _namespace;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1440 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String toPath(String value){
    return value.replace(".", "/");
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1444 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceEnclosure(){
    return namespaceEnclosure("_");
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1448 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceEnclosure(String join){
    return namespaceEnclosure(join, getNamespace());
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1452 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceEnclosure(String join, String _namespace){
    if(_namespace== null || _namespace.isEmpty()){
			return "";
		}
		
		String normalized= _namespace.replace("/", ".").replace("_", ".");
		String[] splits = normalized.split("\\.");
		_namespace= Arrays.asList(splits).stream().collect(Collectors.joining(join));
		
		return _namespace;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1464 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String fullQualifiedName(){
    return fullQualifiedName(getNamespace());
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1468 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String fullQualifiedName(String _namespace){
    String name= this.getName();
		
		String normalizedNamespace= "";
		if(!_namespace.isEmpty()){
			normalizedNamespace= namespaceCallPath(_namespace)+ "::"+ name;
		}else{
			normalizedNamespace= name;
		}
		return normalizedNamespace;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1480 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceCallPath(String _namespace){
    return _namespace.replace(".", "::").replace("_", "::");
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _activeObjectUID(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String activeObjectUID(){
        StringBuilder sb = new StringBuilder();
    return this._activeObjectUID(0,sb).toString(); 
  }

  public StringBuilder _remoteParserDefinition(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_1);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String remoteParserDefinition(){
        StringBuilder sb = new StringBuilder();
    return this._remoteParserDefinition(0,sb).toString(); 
  }

  public StringBuilder _windowsSocketDefinition(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_2);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String windowsSocketDefinition(){
        StringBuilder sb = new StringBuilder();
    return this._windowsSocketDefinition(0,sb).toString(); 
  }

  public StringBuilder _typeIncludes(Integer numSpaces, StringBuilder sb, String includes, String type){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_3);
    realSb.append(type.toUpperCase());
    realSb.append(TEXT_4);
    realSb.append(includes);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String typeIncludes(String includes, String type){
        StringBuilder sb = new StringBuilder();
    return this._typeIncludes(0,sb,includes,type).toString(); 
  }

  public StringBuilder _namespaceDeclaration(Integer numSpaces, StringBuilder sb, String _namespace){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_5);
    realSb.append(_namespace);
    realSb.append(TEXT_6);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String namespaceDeclaration(String _namespace){
        StringBuilder sb = new StringBuilder();
    return this._namespaceDeclaration(0,sb,_namespace).toString(); 
  }

  public StringBuilder _introComment(Integer numSpaces, StringBuilder sb, String comment){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_7);
    realSb.append(comment.toUpperCase());
    realSb.append(TEXT_8);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String introComment(String comment){
        StringBuilder sb = new StringBuilder();
    return this._introComment(0,sb,comment).toString(); 
  }

  public StringBuilder _introRequirement(Integer numSpaces, StringBuilder sb, String requirement){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_9);
    realSb.append(requirement.toUpperCase());
    realSb.append(TEXT_10);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String introRequirement(String requirement){
        StringBuilder sb = new StringBuilder();
    return this._introRequirement(0,sb,requirement).toString(); 
  }

  public StringBuilder _hashCodeImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_11);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String hashCodeImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._hashCodeImplementation(0,sb).toString(); 
  }

  public StringBuilder _emitHeader(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String copyRight= getGenPackage().rootPackage().copyright();
	String definitionFullPath= preprocessingDefinitionName();
	String qualifiedName= qualifiedName();
	String classDeclarations= classDeclarations();
	String fullQualifiedName= fullQualifiedName();
	String selfIncompleteDeclarations= selfIncompleteDeclarations();
	String incompleteDeclarations= incompleteDeclarations();
	String enumerations= enumerationString();
	String headerIncludes= headerIncludes();
	String libraryIncludes= libraryIncludes();
	String visibilityBasedContents= declarations(); 
	
	String predefinitions= predefinitions();
	if(!predefinitions.isEmpty()){
		predefinitions+= NL;
	}


    realSb.append(copyRight);
    realSb.append(TEXT_12);
    realSb.append(definitionFullPath);
    realSb.append(TEXT_13);
    realSb.append(definitionFullPath);
    realSb.append(TEXT_14);
    realSb.append(qualifiedName);
    realSb.append(TEXT_15);
    realSb.append(headerIncludes);
    realSb.append(libraryIncludes);
    realSb.append(incompleteDeclarations);
    realSb.append(namespaceOpening());
    realSb.append(enumerations);
    realSb.append(selfIncompleteDeclarations);
    realSb.append(emitComments());
    realSb.append(emitRequirements());
    realSb.append(TEXT_16);
    realSb.append(getName());
    if(!classDeclarations.isEmpty())
    realSb.append(TEXT_17);
    realSb.append(classDeclarations);
    realSb.append(TEXT_18);
    realSb.append(StringUtil.indent(visibilityBasedContents, 1));
    realSb.append(TEXT_19);
    realSb.append(predefinitions);
    realSb.append(namespaceClosing());
    realSb.append(TEXT_20);
    realSb.append(fullQualifiedName);
    realSb.append(TEXT_21);
    realSb.append(fullQualifiedName);
    realSb.append(TEXT_22);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String emitHeader(){
        StringBuilder sb = new StringBuilder();
    return this._emitHeader(0,sb).toString(); 
  }

  public StringBuilder _emitBody(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String copyRight= getGenPackage().rootPackage().copyright();
	String namespaceOpening = namespaceOpening();
	String namespaceClosing= namespaceClosing();
	String qualifiedName= qualifiedName();
	String typeIncludes= typeIncludes();
	String libraryIncludes= libraryIncludes();
	
	String publicImplementation= implementations();
	String fullName= preprocessingDefinitionName();
	
	String specializedDefinitions= specializedDefinitions();
	if(specializedDefinitions!= null){
		specializedDefinitions+= NL;
	}


    realSb.append(copyRight);
    realSb.append(TEXT_23);
    realSb.append(fullName);
    realSb.append(TEXT_24);
    realSb.append(qualifiedName);
    realSb.append(TEXT_25);
    realSb.append(typeIncludes);
    realSb.append(libraryIncludes);
    realSb.append(specializedDefinitions);
    realSb.append(namespaceOpening);
    realSb.append(TEXT_26);
    realSb.append(publicImplementation);
    realSb.append(TEXT_27);
    realSb.append(namespaceClosing);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String emitBody(){
        StringBuilder sb = new StringBuilder();
    return this._emitBody(0,sb).toString(); 
  }

  public StringBuilder _incompleteDeclaration(Integer numSpaces, StringBuilder sb, String value){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_28);
    realSb.append(value);
    realSb.append(TEXT_29);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String incompleteDeclaration(String value){
        StringBuilder sb = new StringBuilder();
    return this._incompleteDeclaration(0,sb,value).toString(); 
  }

  public StringBuilder _incompleteStructDeclaration(Integer numSpaces, StringBuilder sb, String value){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_30);
    realSb.append(value);
    realSb.append(TEXT_31);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String incompleteStructDeclaration(String value){
        StringBuilder sb = new StringBuilder();
    return this._incompleteStructDeclaration(0,sb,value).toString(); 
  }

  public StringBuilder _visibilityPart(Integer numSpaces, StringBuilder sb, String visibility, String contents){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    if(contents.isEmpty()){return sb;}
    realSb.append(visibility);
    realSb.append(TEXT_32);
    realSb.append(contents);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String visibilityPart(String visibility, String contents){
        StringBuilder sb = new StringBuilder();
    return this._visibilityPart(0,sb,visibility,contents).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "generatable" + ":" + getGeneratable()+ "," +
            "priority" + ":" + getPriority()+ "," +
            "isAbstract" + ":" + getIsAbstract()+ "," +
            "isRemote" + ":" + getIsRemote()+ "," +
            "singleton" + ":" + getSingleton()+ "," +
            "namespace" + ":" + getNamespace()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parent" + "=" + (getParent() != null ? !getParent().equals(this)  ? getParent().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "specializedDefinitionsPriority" + "=" + (getSpecializedDefinitionsPriority() != null ? !getSpecializedDefinitionsPriority().equals(this)  ? getSpecializedDefinitionsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "methodsPriority" + "=" + (getMethodsPriority() != null ? !getMethodsPriority().equals(this)  ? getMethodsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "fieldsPriority" + "=" + (getFieldsPriority() != null ? !getFieldsPriority().equals(this)  ? getFieldsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "commentsPriority" + "=" + (getCommentsPriority() != null ? !getCommentsPriority().equals(this)  ? getCommentsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "requirementsPriority" + "=" + (getRequirementsPriority() != null ? !getRequirementsPriority().equals(this)  ? getRequirementsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "dependenciesPriority" + "=" + (getDependenciesPriority() != null ? !getDependenciesPriority().equals(this)  ? getDependenciesPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "interfacesPriority" + "=" + (getInterfacesPriority() != null ? !getInterfacesPriority().equals(this)  ? getInterfacesPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "childrenPriority" + "=" + (getChildrenPriority() != null ? !getChildrenPriority().equals(this)  ? getChildrenPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "predefinitionsPriority" + "=" + (getPredefinitionsPriority() != null ? !getPredefinitionsPriority().equals(this)  ? getPredefinitionsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "memberInitializersPriority" + "=" + (getMemberInitializersPriority() != null ? !getMemberInitializersPriority().equals(this)  ? getMemberInitializersPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "headerDependenciesPriority" + "=" + (getHeaderDependenciesPriority() != null ? !getHeaderDependenciesPriority().equals(this)  ? getHeaderDependenciesPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "incompletesPriority" + "=" + (getIncompletesPriority() != null ? !getIncompletesPriority().equals(this)  ? getIncompletesPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "structsPriority" + "=" + (getStructsPriority() != null ? !getStructsPriority().equals(this)  ? getStructsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "attributeGroupsPriority" + "=" + (getAttributeGroupsPriority() != null ? !getAttributeGroupsPriority().equals(this)  ? getAttributeGroupsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "genPackage = "+(getGenPackage()!=null?Integer.toHexString(System.identityHashCode(getGenPackage())):"null");
  }
}