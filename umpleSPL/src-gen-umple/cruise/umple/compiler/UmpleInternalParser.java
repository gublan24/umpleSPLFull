/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.regex.*;
import cruise.umple.parser.Token;
import cruise.umple.compiler.UmpleFile;
import java.util.stream.*;
import cruise.umple.compiler.exceptions.*;
import cruise.umple.compiler.*;
import cruise.umple.compiler.FeatureLink.FeatureConnectingOpType;
import java.io.*;
import java.nio.file.*;
import cruise.umple.util.*;
import cruise.umple.analysis.*;
import cruise.umple.parser.*;
import cruise.umple.parser.analysis.*;
import java.util.*;

/**
 * Fragment source file: UmpleInternalParser_CodeClass.ump
 * Line : 5855
 * Fragment source file: UmpleInternalParser_FIXML.ump
 * Line : 7
 * Fragment source file: UmpleInternalParser_FIXML.ump
 * Line : 326
 * Fragment source file: UmpleInternalParser_CodeFilter.ump
 * Line : 108
 * 
 * NEW CLASS****************************************
 * 
 * Fragment source file: UmpleInternalParser_CodeClass.ump
 * Line : 1734
 * Internal invocation for internal umple parser in order to invoke walkers calls which
 * can instantiate the analysis if required
 * Fragment source file: UmpleInternalParser_Code.ump
 * Line : 510
 * Internal invocation for internal umple parser in order to invoke walkers calls which
 * can instantiate the analysis if required
 * 
 * NEW CLASS****************************************
 * 
 * Copyright: All contributers to the Umple Project.
 * 
 * This file is made available subject to the open source license found at:
 * http://umple.org/license
 * 
 * This file analyzses require statement tokens to populate Requiregraph for Umple model.
 * 
 * Please refer to UmpleInternalParser.ump for more details.
 * This is a mixin feature of Umple. The Content of following class will be added automatically to core parse.
 * This is our internal parser implementation for the Umple language.  It uses
 * a generic Parser that can read an external EBNF grammar file, and then populate
 * an abstract syntax tree.
 * 
 * The work of the UmpleInternalParser is 
 * 
 * a) The grammar definition (defined externally in *.grammar files)
 * b) Analyzing the AST to populate an Umple meta model instance
 * c) Delegating to our code generator to produce the necessary artifacts (i.e. Java / PHP / Ruby code)
 * 
 * Please refer to UmpleInternalParser_Code.ump for implementation details.
 */
// line 17 "../../../../src/UmpleInternalParser_CodeTraceStateMachine.ump"
// line 9 "../../../../src/Filter_refactored.ump"
// line 17 "../../../../src/UmpleInternalParser_CodeClass.ump"
// line 3 "../../../../src/Class_refactored.ump"
// line 13 "../../../../src/Class_refactored.ump"
// line 22 "../../../../src/Class_refactored.ump"
// line 29 "../../../../src/Class_refactored.ump"
// line 38 "../../../../src/Class_refactored.ump"
// line 49 "../../../../src/Class_refactored.ump"
// line 69 "../../../../src/Class_refactored.ump"
// line 84 "../../../../src/Class_refactored.ump"
// line 86 "../../../../src/Master.ump"
// line 203 "../../../../src/Association_refactored.ump"
// line 209 "../../../../src/Association_refactored.ump"
// line 725 "../../../../src/Association_refactored.ump"
// line 24 "../../../../src/UmpleInternalParser_CodeTrait.ump"
// line 1 "../../../../src/Trait_refactored.ump"
// line 19 "../../../../src/Trait_refactored.ump"
// line 26 "../../../../src/Trait_refactored.ump"
// line 178 "../../../../src/Trait_refactored.ump"
// line 191 "../../../../src/Trait_refactored.ump"
// line 201 "../../../../src/Trait_refactored.ump"
// line 244 "../../../../src/Trait_refactored.ump"
// line 254 "../../../../src/Trait_refactored.ump"
// line 264 "../../../../src/Trait_refactored.ump"
// line 275 "../../../../src/Trait_refactored.ump"
// line 284 "../../../../src/Trait_refactored.ump"
// line 311 "../../../../src/Trait_refactored.ump"
// line 320 "../../../../src/Trait_refactored.ump"
// line 332 "../../../../src/Trait_refactored.ump"
// line 347 "../../../../src/Trait_refactored.ump"
// line 357 "../../../../src/Trait_refactored.ump"
// line 366 "../../../../src/Trait_refactored.ump"
// line 405 "../../../../src/Trait_refactored.ump"
// line 414 "../../../../src/Trait_refactored.ump"
// line 424 "../../../../src/Trait_refactored.ump"
// line 440 "../../../../src/Trait_refactored.ump"
// line 451 "../../../../src/Trait_refactored.ump"
// line 462 "../../../../src/Trait_refactored.ump"
// line 474 "../../../../src/Trait_refactored.ump"
// line 485 "../../../../src/Trait_refactored.ump"
// line 496 "../../../../src/Trait_refactored.ump"
// line 508 "../../../../src/Trait_refactored.ump"
// line 519 "../../../../src/Trait_refactored.ump"
// line 532 "../../../../src/Trait_refactored.ump"
// line 550 "../../../../src/Trait_refactored.ump"
// line 17 "../../../../src/UmpleInternalParser_CodeConstraints.ump"
// line 1 "../../../../src/Constraint_refactored.ump"
// line 8 "../../../../src/Constraint_refactored.ump"
// line 18 "../../../../src/Constraint_refactored.ump"
// line 1412 "../../../../src/UmpleInternalParser_CodeStructure.ump"
// line 1 "../../../../src/Structure_refactored.ump"
// line 8 "../../../../src/Structure_refactored.ump"
// line 20 "../../../../src/Structure_refactored.ump"
// line 826 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
// line 17 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
// line 1 "../../../../src/StateMachine_refactored.ump"
// line 38 "../../../../src/StateMachine_refactored.ump"
// line 80 "../../../../src/StateMachine_refactored.ump"
// line 87 "../../../../src/StateMachine_refactored.ump"
// line 94 "../../../../src/StateMachine_refactored.ump"
// line 21 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
// line 17 "../../../../src/UmpleInternalParser_CodeTrace.ump"
// line 17 "../../../../src/UmpleInternalParser_CodeTraceAttribute.ump"
// line 17 "../../../../src/UmpleInternalParser_CodeTraceAssociation.ump"
// line 17 "../../../../src/UmpleInternalParser_CodeTraceCase.ump"
// line 1 "../../../../src/Trace_refactored.ump"
// line 8 "../../../../src/Trace_refactored.ump"
// line 14 "../../../../src/Trace_refactored.ump"
// line 86 "../../../../src/Trace_refactored.ump"
// line 17 "../../../../src/UmpleInternalParser_CodeLayout.ump"
// line 1 "../../../../src/Layout_refactored.ump"
// line 9 "../../../../src/Layout_refactored.ump"
// line 17 "../../../../src/Layout_refactored.ump"
// line 38 "../../../../src/Layout_refactored.ump"
// line 19 "../../../../src/UmpleInternalParser_CodeFilter.ump"
// line 53 "../../../../src/UmpleInternalParser_CodeMixset.ump"
// line 1 "../../../../src/Mixset_refactored.ump"
// line 9 "../../../../src/Mixset_refactored.ump"
// line 41 "../../../../src/Mixset_refactored.ump"
// line 53 "../../../../src/Mixset_refactored.ump"
// line 75 "../../../../src/Mixset_refactored.ump"
// line 85 "../../../../src/Mixset_refactored.ump"
// line 96 "../../../../src/Mixset_refactored.ump"
// line 108 "../../../../src/Mixset_refactored.ump"
// line 116 "../../../../src/Mixset_refactored.ump"
// line 12 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
// line 1 "../../../../src/Feature_refactored.ump"
// line 10 "../../../../src/Feature_refactored.ump"
// line 18 "../../../../src/Feature_refactored.ump"
// line 11 "../../../../src/UmpleInternalPraser_CodeInjection.ump"
// line 140 "../../../../src/Aspect_refactored.ump"
// line 154 "../../../../src/Aspect_refactored.ump"
// line 3 "../../../../src/UmpleInternalParser_FIXML.ump"
// line 2 "../../../../src/Fixml_refactored.ump"
// line 26 "../../../../src/UmpleInternalParser.ump"
// line 35 "../../../../src/UmpleInternalParser_Code.ump"
// line 17 "../../../../src/UmpleInternalParser_CodeCore.ump"
// line 17 "../../../../src/UmpleInternalParser_CodeUSE.ump"
// line 9 "../../../../src/UmpleInternalParser_CodeEnumeration.ump"
// line 9 "../../../../src/UmpleInternalParser_CodeTest.ump"
public class UmpleInternalParser extends Parser implements UmpleParser
{ 
  //------------------------
  // STATIC VARIABLES
  //------------------------
 
private static final String GUARD = "guard";
private static final String LONE_BOOLEAN = "loneBoolean";
private static final String CONSTRAINT_BODY = "constraintBody";
private static final String LINKING_OP_BODY = "linkingOpBody";
private static final String NEGATIVE_CONSTRAINT = "negativeConstraint";
private static final String NEGATIVE_CONSTRAINT_APPLIED = "negativeConstraintApplied";
private static final String NUMBER = "number";
private static final String QUOTE = "quote";
private static final String CONCAT = "concat";
private static final String BOOL_LITERAL = "boolLiteral";
private static final String CONSTRAINT_NAME = "constraintName";
private static final String NUMBER_LITERAL = "numberLiteral";
private static final String ASSOCIATION_EXPR = "associationExpr";
private static final String STATEMACHINE_EXPR = "statemachineExpr";
private static final String FINAL_STATE_KEYWORD = "Final";
private static final Integer LHS_POSITION = 0;
private static final Integer OPERATOR_POSITION = 1;
private static final Integer RHS_POSITION = 2;
private static final String EQUALS_OP = "equalsOp";
private static final String NOT_EQUALS_OP = "notequalsOp";
private static final String AND_OP = "andOp";
private static final String OR_OP = "orOp";
private static final String GREATER_THAN_OR_EQUAL = "greaterOp";
private static final String GREATER_THAN = "moreOp";
private static final String LESS_THAN_OR_EQUAL = "lessOp";
private static final String LESS_THAN = "smallerOp";
private static final String OP = "Op";
private static final String OPERATOR = "operator";


  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleInternalParser Attributes
  private List<AssociationVariable> unlinkedAssociationVariables;
  private List<Association> unlinkedAssociations;
  private Map<Position,String> positionToClassNameReference;
  private Map<UmpleClassifier,List<Token>> unanalyzedInvariants;
  private Map<UmpleClassifier,List<String>> unlinkedExtends;
  private Map<UmpleClassifier,List<Token>> unlinkedExtendsTokens;
  private Map<UmpleClassifier,List<Token>> unlinkedExtendsTokensInterface;
  private Map<UmpleClassifier,List<String>> unlinkedInterfaceExtends;
  private Map<UmpleClass,List<Token>> unlinkedKeysTokens;
  private Map<UmpleClassifier,List<Token>> unanalyzedInjectionTokens;

  /**
   * List of comments populated by the parser to be added to the next class, attribute, association, method, etc.
   */
  private List<Comment> lastComments;

  /**
   * last attribute made.
   */
  private Attribute lastattr;

  /**
   * last association made.
   */
  private AssociationVariable lastassoc;
  private Position lastassocPosition;
  private Map<Token,UmpleClass> attributeAutouniqueImmutable;
  private Map<Association,List<Token>> afixmlLastIntilialization;
  private Map<Association,Integer> afixmlAttributeCount;
  private CompositeStructureDefinitionWalker compWalker;
  private TemplateDefinitionWalker walker;
  private StateMachine placeholderStateMachine;
  private Map<String,Token> stateMachineNameToToken;
  private Map<State,List<Token>> possiblyUnknownStates;
  private List<Token> stateNames;
  private List<Token> transitionNames;
  private List<Token> ignoredTransitions;
  private List<Token> innerMixsetTokens;
  private int traceFlagId;
  private TraceDirective traceDirective;
  private AttributeTraceItem traceAttr;
  private AssociationTraceItem tracedAssoc;
  private MethodTraceItem mte;
  private TraceCase tca;
  private Postfix post;
  private Map<String,Boolean> parsedUmpfiles;
  private Map<Attribute,Token> fixmlLastIntilialization;
  private Map<Attribute,Integer> fixmlAttributeCount;
  private String currentPackageName;
  private String redefinePackageName;
  private boolean packageNameUsed;
  private boolean outputUmpleSource;
  private UmpleModel model;
  private RuleBasedParser parser;
  private NameSpace lastParsedNameSpace;
  private List<Integer> allowedMessages;
  private List<Integer> ignoredMessages;
  private List<Integer> disallowedMessages;
  private List<Integer> expectedMessages;
  private List<String> unparsedUmpleFiles;
  private List<String> parsedUmpleFiles;
  private boolean shouldProcessAgain;
  private boolean shouldProcessClassAgain;

  //UmpleInternalParser State Machines
  public enum Strictness { none, modelOnly, noExtraCode }
  private Strictness strictness;

  //UmpleInternalParser Associations
  private List<NameSpace> parsedNameSpaces;
  private List<ErrorType> messagesToExpect;
  private List<ErrorType> warningsToIgnore;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleInternalParser(String aName, UmpleModel aModel, RuleBasedParser aParser)
  {
    super(aName);
    unlinkedAssociationVariables = new ArrayList<AssociationVariable>();
    unlinkedAssociations = new ArrayList<Association>();
    positionToClassNameReference = new HashMap<Position, String>();
    unanalyzedInvariants = new HashMap<UmpleClassifier,List<Token>>();
    unlinkedExtends = new HashMap<UmpleClassifier,List<String>>();
    unlinkedExtendsTokens = new HashMap<UmpleClassifier,List<Token>>();
    unlinkedExtendsTokensInterface = new HashMap <UmpleClassifier, List<Token>>();
    unlinkedInterfaceExtends = new HashMap<UmpleClassifier,List<String>>();
    unlinkedKeysTokens = new HashMap<UmpleClass,List<Token>>();
    unanalyzedInjectionTokens = new HashMap<UmpleClassifier,List<Token>>();
    lastComments = new ArrayList<Comment>();
    lastattr = null;
    lastassoc = null;
    lastassocPosition = null;
    attributeAutouniqueImmutable = null;
    afixmlLastIntilialization = new HashMap<Association, List<Token>>();
    afixmlAttributeCount = new HashMap<Association, Integer>();
    compWalker = new CompositeStructureDefinitionWalker(this);
    walker = new TemplateDefinitionWalker(this);
    placeholderStateMachine = null;
    stateMachineNameToToken = new HashMap<String, Token>();
    possiblyUnknownStates = new HashMap<State,List<Token>>();
    stateNames = null;
    transitionNames = null;
    ignoredTransitions = new ArrayList<Token>();
    innerMixsetTokens = null;
    traceFlagId = 0;
    traceDirective = null;
    traceAttr = null;
    tracedAssoc = null;
    mte = null;
    tca = null;
    post = null;
    parsedUmpfiles = new HashMap<>();
    fixmlLastIntilialization = new HashMap<Attribute, Token>();
    fixmlAttributeCount = new HashMap<Attribute, Integer>();
    currentPackageName = "";
    redefinePackageName = "";
    packageNameUsed = true;
    outputUmpleSource = false;
    model = aModel;
    parser = aParser;
    lastParsedNameSpace = new NameSpace("",new Position("", 0, 0, 0));
    allowedMessages = new ArrayList<Integer>();
    ignoredMessages = new ArrayList<Integer>();
    disallowedMessages = new ArrayList<Integer>();
    expectedMessages = new ArrayList<Integer>();
    unparsedUmpleFiles = new ArrayList<String>();
    parsedUmpleFiles = new ArrayList<String>();
    shouldProcessAgain = false;
    shouldProcessClassAgain = false;
    parsedNameSpaces = new ArrayList<NameSpace>();
    messagesToExpect = new ArrayList<ErrorType>();
    warningsToIgnore = new ArrayList<ErrorType>();
    setStrictness(Strictness.none);
    // line 43 "../../../../src/UmpleInternalParser_Code.ump"
    init();
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLastassocPosition(Position aLastassocPosition)
  {
    boolean wasSet = false;
    lastassocPosition = aLastassocPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setAfixmlLastIntilialization(Map<Association,List<Token>> aAfixmlLastIntilialization)
  {
    boolean wasSet = false;
    afixmlLastIntilialization = aAfixmlLastIntilialization;
    wasSet = true;
    return wasSet;
  }

  public boolean setAfixmlAttributeCount(Map<Association,Integer> aAfixmlAttributeCount)
  {
    boolean wasSet = false;
    afixmlAttributeCount = aAfixmlAttributeCount;
    wasSet = true;
    return wasSet;
  }

  public boolean setTraceFlagId(int aTraceFlagId)
  {
    boolean wasSet = false;
    traceFlagId = aTraceFlagId;
    wasSet = true;
    return wasSet;
  }

  public boolean setTraceDirective(TraceDirective aTraceDirective)
  {
    boolean wasSet = false;
    traceDirective = aTraceDirective;
    wasSet = true;
    return wasSet;
  }

  public boolean setTraceAttr(AttributeTraceItem aTraceAttr)
  {
    boolean wasSet = false;
    traceAttr = aTraceAttr;
    wasSet = true;
    return wasSet;
  }

  public boolean setTracedAssoc(AssociationTraceItem aTracedAssoc)
  {
    boolean wasSet = false;
    tracedAssoc = aTracedAssoc;
    wasSet = true;
    return wasSet;
  }

  public boolean setMte(MethodTraceItem aMte)
  {
    boolean wasSet = false;
    mte = aMte;
    wasSet = true;
    return wasSet;
  }

  public boolean setTca(TraceCase aTca)
  {
    boolean wasSet = false;
    tca = aTca;
    wasSet = true;
    return wasSet;
  }

  public boolean setPost(Postfix aPost)
  {
    boolean wasSet = false;
    post = aPost;
    wasSet = true;
    return wasSet;
  }

  public boolean setParsedUmpfiles(Map<String,Boolean> aParsedUmpfiles)
  {
    boolean wasSet = false;
    parsedUmpfiles = aParsedUmpfiles;
    wasSet = true;
    return wasSet;
  }

  public boolean setFixmlLastIntilialization(Map<Attribute,Token> aFixmlLastIntilialization)
  {
    boolean wasSet = false;
    fixmlLastIntilialization = aFixmlLastIntilialization;
    wasSet = true;
    return wasSet;
  }

  public boolean setFixmlAttributeCount(Map<Attribute,Integer> aFixmlAttributeCount)
  {
    boolean wasSet = false;
    fixmlAttributeCount = aFixmlAttributeCount;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentPackageName(String aCurrentPackageName)
  {
    boolean wasSet = false;
    currentPackageName = aCurrentPackageName;
    wasSet = true;
    return wasSet;
  }

  public boolean setRedefinePackageName(String aRedefinePackageName)
  {
    boolean wasSet = false;
    redefinePackageName = aRedefinePackageName;
    wasSet = true;
    return wasSet;
  }

  public boolean setPackageNameUsed(boolean aPackageNameUsed)
  {
    boolean wasSet = false;
    packageNameUsed = aPackageNameUsed;
    wasSet = true;
    return wasSet;
  }

  public boolean setOutputUmpleSource(boolean aOutputUmpleSource)
  {
    boolean wasSet = false;
    outputUmpleSource = aOutputUmpleSource;
    wasSet = true;
    return wasSet;
  }

  public boolean setModel(UmpleModel aModel)
  {
    boolean wasSet = false;
    model = aModel;
    wasSet = true;
    // line 88 "../../../../src/UmpleInternalParser.ump"
    if(model != null && model.getUmpleFile() != null) { super.setFilename(model.getUmpleFile().getFileName()); super.setRootToken(reset());}
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean setParser(RuleBasedParser aParser)
  {
    boolean wasSet = false;
    parser = aParser;
    wasSet = true;
    return wasSet;
  }

  public boolean setLastParsedNameSpace(NameSpace aLastParsedNameSpace)
  {
    boolean wasSet = false;
    lastParsedNameSpace = aLastParsedNameSpace;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addAllowedMessage(Integer aAllowedMessage)
  {
    boolean wasAdded = false;
    wasAdded = allowedMessages.add(aAllowedMessage);
    return wasAdded;
  }

  public boolean removeAllowedMessage(Integer aAllowedMessage)
  {
    boolean wasRemoved = false;
    wasRemoved = allowedMessages.remove(aAllowedMessage);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addIgnoredMessage(Integer aIgnoredMessage)
  {
    boolean wasAdded = false;
    wasAdded = ignoredMessages.add(aIgnoredMessage);
    return wasAdded;
  }

  public boolean removeIgnoredMessage(Integer aIgnoredMessage)
  {
    boolean wasRemoved = false;
    wasRemoved = ignoredMessages.remove(aIgnoredMessage);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addDisallowedMessage(Integer aDisallowedMessage)
  {
    boolean wasAdded = false;
    wasAdded = disallowedMessages.add(aDisallowedMessage);
    return wasAdded;
  }

  public boolean removeDisallowedMessage(Integer aDisallowedMessage)
  {
    boolean wasRemoved = false;
    wasRemoved = disallowedMessages.remove(aDisallowedMessage);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addExpectedMessage(Integer aExpectedMessage)
  {
    boolean wasAdded = false;
    wasAdded = expectedMessages.add(aExpectedMessage);
    return wasAdded;
  }

  public boolean removeExpectedMessage(Integer aExpectedMessage)
  {
    boolean wasRemoved = false;
    wasRemoved = expectedMessages.remove(aExpectedMessage);
    return wasRemoved;
  }

  public Position getLastassocPosition()
  {
    return lastassocPosition;
  }

  public Map<Association,List<Token>> getAfixmlLastIntilialization()
  {
    return afixmlLastIntilialization;
  }

  public Map<Association,Integer> getAfixmlAttributeCount()
  {
    return afixmlAttributeCount;
  }

  public int getTraceFlagId()
  {
    // line 20 "../../../../src/UmpleInternalParser_CodeTrace.ump"
    traceFlagId++;
    // END OF UMPLE BEFORE INJECTION
    return traceFlagId;
  }

  public TraceDirective getTraceDirective()
  {
    return traceDirective;
  }

  public AttributeTraceItem getTraceAttr()
  {
    return traceAttr;
  }

  public AssociationTraceItem getTracedAssoc()
  {
    return tracedAssoc;
  }

  public MethodTraceItem getMte()
  {
    return mte;
  }

  public TraceCase getTca()
  {
    return tca;
  }

  public Postfix getPost()
  {
    return post;
  }

  /**
   * The key is to store names of parsed umple files. The value is to specify if fully parsed file (true) or partially (false).
   */
  public Map<String,Boolean> getParsedUmpfiles()
  {
    return parsedUmpfiles;
  }

  public Map<Attribute,Token> getFixmlLastIntilialization()
  {
    return fixmlLastIntilialization;
  }

  public Map<Attribute,Integer> getFixmlAttributeCount()
  {
    return fixmlAttributeCount;
  }

  public String getCurrentPackageName()
  {
    return currentPackageName;
  }

  public String getRedefinePackageName()
  {
    return redefinePackageName;
  }

  public boolean getPackageNameUsed()
  {
    return packageNameUsed;
  }

  public boolean getOutputUmpleSource()
  {
    return outputUmpleSource;
  }

  /**
   * The Umple meta model which will be populated based on what was parsed.
   */
  public UmpleModel getModel()
  {
    return model;
  }

  public RuleBasedParser getParser()
  {
    return parser;
  }

  public NameSpace getLastParsedNameSpace()
  {
    return lastParsedNameSpace;
  }
  /* Code from template attribute_GetMany */
  public Integer getAllowedMessage(int index)
  {
    Integer aAllowedMessage = allowedMessages.get(index);
    return aAllowedMessage;
  }

  public Integer[] getAllowedMessages()
  {
    Integer[] newAllowedMessages = allowedMessages.toArray(new Integer[allowedMessages.size()]);
    return newAllowedMessages;
  }

  public int numberOfAllowedMessages()
  {
    int number = allowedMessages.size();
    return number;
  }

  public boolean hasAllowedMessages()
  {
    boolean has = allowedMessages.size() > 0;
    return has;
  }

  public int indexOfAllowedMessage(Integer aAllowedMessage)
  {
    int index = allowedMessages.indexOf(aAllowedMessage);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Integer getIgnoredMessage(int index)
  {
    Integer aIgnoredMessage = ignoredMessages.get(index);
    return aIgnoredMessage;
  }

  public Integer[] getIgnoredMessages()
  {
    Integer[] newIgnoredMessages = ignoredMessages.toArray(new Integer[ignoredMessages.size()]);
    return newIgnoredMessages;
  }

  public int numberOfIgnoredMessages()
  {
    int number = ignoredMessages.size();
    return number;
  }

  public boolean hasIgnoredMessages()
  {
    boolean has = ignoredMessages.size() > 0;
    return has;
  }

  public int indexOfIgnoredMessage(Integer aIgnoredMessage)
  {
    int index = ignoredMessages.indexOf(aIgnoredMessage);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Integer getDisallowedMessage(int index)
  {
    Integer aDisallowedMessage = disallowedMessages.get(index);
    return aDisallowedMessage;
  }

  public Integer[] getDisallowedMessages()
  {
    Integer[] newDisallowedMessages = disallowedMessages.toArray(new Integer[disallowedMessages.size()]);
    return newDisallowedMessages;
  }

  public int numberOfDisallowedMessages()
  {
    int number = disallowedMessages.size();
    return number;
  }

  public boolean hasDisallowedMessages()
  {
    boolean has = disallowedMessages.size() > 0;
    return has;
  }

  public int indexOfDisallowedMessage(Integer aDisallowedMessage)
  {
    int index = disallowedMessages.indexOf(aDisallowedMessage);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Integer getExpectedMessage(int index)
  {
    Integer aExpectedMessage = expectedMessages.get(index);
    return aExpectedMessage;
  }

  public Integer[] getExpectedMessages()
  {
    Integer[] newExpectedMessages = expectedMessages.toArray(new Integer[expectedMessages.size()]);
    return newExpectedMessages;
  }

  public int numberOfExpectedMessages()
  {
    int number = expectedMessages.size();
    return number;
  }

  public boolean hasExpectedMessages()
  {
    boolean has = expectedMessages.size() > 0;
    return has;
  }

  public int indexOfExpectedMessage(Integer aExpectedMessage)
  {
    int index = expectedMessages.indexOf(aExpectedMessage);
    return index;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isPackageNameUsed()
  {
    return packageNameUsed;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isOutputUmpleSource()
  {
    return outputUmpleSource;
  }

  public String getStrictnessFullName()
  {
    String answer = strictness.toString();
    return answer;
  }

  public Strictness getStrictness()
  {
    return strictness;
  }

  public boolean modelOnly()
  {
    boolean wasEventProcessed = false;
    
    Strictness aStrictness = strictness;
    switch (aStrictness)
    {
      case none:
        setStrictness(Strictness.modelOnly);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean noExtraCode()
  {
    boolean wasEventProcessed = false;
    
    Strictness aStrictness = strictness;
    switch (aStrictness)
    {
      case none:
        setStrictness(Strictness.noExtraCode);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean allowMessage(Integer id)
  {
    boolean wasEventProcessed = false;
    
    Strictness aStrictness = strictness;
    switch (aStrictness)
    {
      case none:
        // line 61 "../../../../src/UmpleInternalParser.ump"
        allowedMessages.add(id);
        setStrictness(Strictness.none);
        wasEventProcessed = true;
        break;
      case modelOnly:
        // line 67 "../../../../src/UmpleInternalParser.ump"
        allowedMessages.add(id);
        setStrictness(Strictness.modelOnly);
        wasEventProcessed = true;
        break;
      case noExtraCode:
        // line 73 "../../../../src/UmpleInternalParser.ump"
        allowedMessages.add(id);
        setStrictness(Strictness.noExtraCode);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean ignoreMessage(Integer id)
  {
    boolean wasEventProcessed = false;
    
    Strictness aStrictness = strictness;
    switch (aStrictness)
    {
      case none:
        // line 62 "../../../../src/UmpleInternalParser.ump"
        ignoredMessages.add(id);
        setStrictness(Strictness.none);
        wasEventProcessed = true;
        break;
      case modelOnly:
        // line 68 "../../../../src/UmpleInternalParser.ump"
        ignoredMessages.add(id);
        setStrictness(Strictness.modelOnly);
        wasEventProcessed = true;
        break;
      case noExtraCode:
        // line 74 "../../../../src/UmpleInternalParser.ump"
        ignoredMessages.add(id);
        setStrictness(Strictness.noExtraCode);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean disallowMessage(Integer id)
  {
    boolean wasEventProcessed = false;
    
    Strictness aStrictness = strictness;
    switch (aStrictness)
    {
      case none:
        // line 63 "../../../../src/UmpleInternalParser.ump"
        disallowedMessages.add(id);
        setStrictness(Strictness.none);
        wasEventProcessed = true;
        break;
      case modelOnly:
        // line 69 "../../../../src/UmpleInternalParser.ump"
        disallowedMessages.add(id);
        setStrictness(Strictness.modelOnly);
        wasEventProcessed = true;
        break;
      case noExtraCode:
        // line 75 "../../../../src/UmpleInternalParser.ump"
        disallowedMessages.add(id);
        setStrictness(Strictness.noExtraCode);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean expectMessage(Integer id)
  {
    boolean wasEventProcessed = false;
    
    Strictness aStrictness = strictness;
    switch (aStrictness)
    {
      case none:
        // line 64 "../../../../src/UmpleInternalParser.ump"
        expectedMessages.add(id);
        setStrictness(Strictness.none);
        wasEventProcessed = true;
        break;
      case modelOnly:
        // line 70 "../../../../src/UmpleInternalParser.ump"
        expectedMessages.add(id);
        setStrictness(Strictness.modelOnly);
        wasEventProcessed = true;
        break;
      case noExtraCode:
        // line 76 "../../../../src/UmpleInternalParser.ump"
        expectedMessages.add(id);
        setStrictness(Strictness.noExtraCode);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setStrictness(Strictness aStrictness)
  {
    strictness = aStrictness;
  }
  /* Code from template association_GetMany */
  public NameSpace getParsedNameSpace(int index)
  {
    NameSpace aParsedNameSpace = parsedNameSpaces.get(index);
    return aParsedNameSpace;
  }

  /**
   * List of parsed namespaces.
   * This is used to check the use of parsed namespaces.
   */
  public List<NameSpace> getParsedNameSpaces()
  {
    List<NameSpace> newParsedNameSpaces = Collections.unmodifiableList(parsedNameSpaces);
    return newParsedNameSpaces;
  }

  public int numberOfParsedNameSpaces()
  {
    int number = parsedNameSpaces.size();
    return number;
  }

  public boolean hasParsedNameSpaces()
  {
    boolean has = parsedNameSpaces.size() > 0;
    return has;
  }

  public int indexOfParsedNameSpace(NameSpace aParsedNameSpace)
  {
    int index = parsedNameSpaces.indexOf(aParsedNameSpace);
    return index;
  }
  /* Code from template association_GetMany */
  public ErrorType getMessagesToExpect(int index)
  {
    ErrorType aMessagesToExpect = messagesToExpect.get(index);
    return aMessagesToExpect;
  }

  /**
   * List of errors or warnings to expect. It is an error if they do not occur.
   * This is used to set up test cases for the presence of certain messages
   */
  public List<ErrorType> getMessagesToExpect()
  {
    List<ErrorType> newMessagesToExpect = Collections.unmodifiableList(messagesToExpect);
    return newMessagesToExpect;
  }

  public int numberOfMessagesToExpect()
  {
    int number = messagesToExpect.size();
    return number;
  }

  public boolean hasMessagesToExpect()
  {
    boolean has = messagesToExpect.size() > 0;
    return has;
  }

  public int indexOfMessagesToExpect(ErrorType aMessagesToExpect)
  {
    int index = messagesToExpect.indexOf(aMessagesToExpect);
    return index;
  }
  /* Code from template association_GetMany */
  public ErrorType getWarningsToIgnore(int index)
  {
    ErrorType aWarningsToIgnore = warningsToIgnore.get(index);
    return aWarningsToIgnore;
  }

  /**
   * List of warnings to allow and ignore
   * Used to suppress warnings that we do not care about
   */
  public List<ErrorType> getWarningsToIgnore()
  {
    List<ErrorType> newWarningsToIgnore = Collections.unmodifiableList(warningsToIgnore);
    return newWarningsToIgnore;
  }

  public int numberOfWarningsToIgnore()
  {
    int number = warningsToIgnore.size();
    return number;
  }

  public boolean hasWarningsToIgnore()
  {
    boolean has = warningsToIgnore.size() > 0;
    return has;
  }

  public int indexOfWarningsToIgnore(ErrorType aWarningsToIgnore)
  {
    int index = warningsToIgnore.indexOf(aWarningsToIgnore);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfParsedNameSpaces()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addParsedNameSpace(NameSpace aParsedNameSpace)
  {
    boolean wasAdded = false;
    if (parsedNameSpaces.contains(aParsedNameSpace)) { return false; }
    parsedNameSpaces.add(aParsedNameSpace);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeParsedNameSpace(NameSpace aParsedNameSpace)
  {
    boolean wasRemoved = false;
    if (parsedNameSpaces.contains(aParsedNameSpace))
    {
      parsedNameSpaces.remove(aParsedNameSpace);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addParsedNameSpaceAt(NameSpace aParsedNameSpace, int index)
  {  
    boolean wasAdded = false;
    if(addParsedNameSpace(aParsedNameSpace))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParsedNameSpaces()) { index = numberOfParsedNameSpaces() - 1; }
      parsedNameSpaces.remove(aParsedNameSpace);
      parsedNameSpaces.add(index, aParsedNameSpace);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveParsedNameSpaceAt(NameSpace aParsedNameSpace, int index)
  {
    boolean wasAdded = false;
    if(parsedNameSpaces.contains(aParsedNameSpace))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParsedNameSpaces()) { index = numberOfParsedNameSpaces() - 1; }
      parsedNameSpaces.remove(aParsedNameSpace);
      parsedNameSpaces.add(index, aParsedNameSpace);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addParsedNameSpaceAt(aParsedNameSpace, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMessagesToExpect()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addMessagesToExpect(ErrorType aMessagesToExpect)
  {
    boolean wasAdded = false;
    if (messagesToExpect.contains(aMessagesToExpect)) { return false; }
    messagesToExpect.add(aMessagesToExpect);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMessagesToExpect(ErrorType aMessagesToExpect)
  {
    boolean wasRemoved = false;
    if (messagesToExpect.contains(aMessagesToExpect))
    {
      messagesToExpect.remove(aMessagesToExpect);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMessagesToExpectAt(ErrorType aMessagesToExpect, int index)
  {  
    boolean wasAdded = false;
    if(addMessagesToExpect(aMessagesToExpect))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMessagesToExpect()) { index = numberOfMessagesToExpect() - 1; }
      messagesToExpect.remove(aMessagesToExpect);
      messagesToExpect.add(index, aMessagesToExpect);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMessagesToExpectAt(ErrorType aMessagesToExpect, int index)
  {
    boolean wasAdded = false;
    if(messagesToExpect.contains(aMessagesToExpect))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMessagesToExpect()) { index = numberOfMessagesToExpect() - 1; }
      messagesToExpect.remove(aMessagesToExpect);
      messagesToExpect.add(index, aMessagesToExpect);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMessagesToExpectAt(aMessagesToExpect, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWarningsToIgnore()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addWarningsToIgnore(ErrorType aWarningsToIgnore)
  {
    boolean wasAdded = false;
    if (warningsToIgnore.contains(aWarningsToIgnore)) { return false; }
    warningsToIgnore.add(aWarningsToIgnore);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeWarningsToIgnore(ErrorType aWarningsToIgnore)
  {
    boolean wasRemoved = false;
    if (warningsToIgnore.contains(aWarningsToIgnore))
    {
      warningsToIgnore.remove(aWarningsToIgnore);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addWarningsToIgnoreAt(ErrorType aWarningsToIgnore, int index)
  {  
    boolean wasAdded = false;
    if(addWarningsToIgnore(aWarningsToIgnore))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWarningsToIgnore()) { index = numberOfWarningsToIgnore() - 1; }
      warningsToIgnore.remove(aWarningsToIgnore);
      warningsToIgnore.add(index, aWarningsToIgnore);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveWarningsToIgnoreAt(ErrorType aWarningsToIgnore, int index)
  {
    boolean wasAdded = false;
    if(warningsToIgnore.contains(aWarningsToIgnore))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWarningsToIgnore()) { index = numberOfWarningsToIgnore() - 1; }
      warningsToIgnore.remove(aWarningsToIgnore);
      warningsToIgnore.add(index, aWarningsToIgnore);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addWarningsToIgnoreAt(aWarningsToIgnore, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    parsedNameSpaces.clear();
    messagesToExpect.clear();
    warningsToIgnore.clear();
    super.delete();
  }

  // line 22 "../../../../src/UmpleInternalParser_CodeTraceStateMachine.ump"
   private void analyzeStateMachineTraceItem(Token traceToken){
    List<StateMachine> stms = traceDirective.getUmpleClass().getStateMachines();
    StateMachineTraceItem tracedStm = new StateMachineTraceItem(traceDirective);
    StateMachine stm = null;
    State state = null;
    String stmTraceItem = traceToken.getValue("traceEntity");

    if( traceToken.getParentToken().getSubToken(1).numberOfSubTokens()>0)
    {

      boolean isTransition = false;
      boolean isIn = false;
      boolean isOut = false;
      for(Token token:traceToken.getParentToken().getSubToken(1).getSubTokens()){
        if("transition".equals(token.getValue("option"))){
          isTransition = true;
        }
        if("in".equals(token.getValue("option"))){
          isIn = true;
        }
        if("out".equals(token.getValue("option"))){
          isOut = true;
        }
      }

      if(isTransition)
      {
        tracedStm.setIsOut(isOut);
        tracedStm.setIsIn(isIn);
        tracedStm.setPosition(traceToken.getPosition());
        if( traceToken.getParentToken().getValue("traceLevel")!=null )
        {
          tracedStm.setLevel(Integer.parseInt(traceToken.getParentToken().getValue("traceLevel")));
        }
        for( StateMachine sm:stms  )
        {
          for( State nestedState:sm.getStates())
          {
            for( Transition tsn:nestedState.getTransitions())
            {
              if( tsn.getEvent().getName().equals(traceToken.getValue()) )
              {
                tracedStm.setTransition(tsn);
                tracedStm.setStateMachine(sm);
                tracedStm.setState(nestedState);
                traceDirective.addStateMachineTraceItem(tracedStm);
              }
            }
          }
        }
      }
    }

    for( StateMachine ss : stms )
      for( State s : ss.getStates() )
        for( Transition tsn : s.getTransitions() )
          if( tsn.getEvent().getName().equals(traceToken.getValue()) )
          {
            tracedStm.setIsOut(false);
            tracedStm.setIsIn(false);
            tracedStm.setPosition(traceToken.getPosition());
            tracedStm.setTransition(tsn);
            tracedStm.setStateMachine(ss);
            tracedStm.setState(s);
            traceDirective.addStateMachineTraceItem(tracedStm);
            break;
          }

    if( stmTraceItem != null && stmTraceItem.contains("."))
    {
      String delimiter = "\\.";
      String[] temp = stmTraceItem.split(delimiter);
      stmTraceItem = temp[temp.length-1];
    }
    if(stm==null)
    {
      for( StateMachine sm:stms )
      {
        state=sm.findState(stmTraceItem, true);
        if(state!=null)
        {
          stm=state.getStateMachine();
          break;
        }
      }
    }
    if(stm==null)
    {
      for( StateMachine sm:stms )
      {
        if( sm.getFullName().equals(stmTraceItem))
        {
          stm = sm;
          break;
        }            
      }
    }
    //System.out.println(stmTraceItem+"<>"+stm);  
    // if trace entity is a state machine  
    if( stm != null)
    {
      tracedStm.setPosition(traceToken.getPosition());  
      tracedStm.setStateMachine(stm);
      tracedStm.setState(state);
      if( traceToken.getParentToken().getValue("traceLevel")!=null )
      {
        tracedStm.setLevel(Integer.parseInt(traceToken.getParentToken().getValue("traceLevel")));
      }
      for(Token sub: traceToken.getParentToken().getSubTokens())
      {
        if(sub.is("Prefix"))
        {
          boolean wasSet = false;
          boolean wasInOut = false;
          for(Token sub2: sub.getSubTokens())
          {
            if( "entry".equals(sub2.getValue("option")) )
            {
              wasSet = true;
              tracedStm.setEntry(true);
            }
            if( "exit".equals(sub2.getValue("option")) )
            {
              wasSet = true;
              tracedStm.setExit(true);
            }
            if( "in".equals(sub2.getValue("option")) )
            {
              wasInOut = true;
              tracedStm.setIsIn(true);
            }
            if( "out".equals(sub2.getValue("option")) )
            {
              wasInOut = true;
              tracedStm.setIsOut(true);
            }
          }
          if(!wasSet)
          {
            tracedStm.setEntry(false);
            tracedStm.setExit(false);
          }
          if(!wasInOut)
          {
            tracedStm.setIsOut(true);
            tracedStm.setIsIn(false);
          }
        }
      }
      tracedStm.setTraceStateMachineFlag(state == null);
      traceDirective.addStateMachineTraceItem(tracedStm);
    }
  }


  /**
   * Analyze class definitions and related tokens.
   * 
   * @param t The current token that will be analyzed to determine how to further make use of it (is it a comment, class, etc?)
   * @param analysisStep Used to determine whether or not things should be analyzed more than once (multi-pass).
   */
  // line 60 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeClassToken(Token t, int analysisStep){
    if (analysisStep != 2)
    {
      shouldProcessAgain = shouldProcessAgain || (analysisStep == 1);
      return;
    }

    // Only need to clear comments if there actually was comments.
    boolean shouldConsumeComment = lastComments.size() > 0;

    // Determine what the current token is primarily, and based on that the analysis procedure is determined.
    if (t.isStatic("//") || t.isStatic("/*") || t.isStatic("*/"))
    {
      shouldConsumeComment = false;
    }
    else if (t.is("useStatement") )
    {
      analyzeAllTokens(t);
      
// add parsed files to parsedUmpfiles hashMap.
      String umpFileName = t.getSubToken("use").getValue();
      if(! parsedUmpfiles.keySet().contains(umpFileName))
      parsedUmpfiles.put(umpFileName, true);
Label_Mixset_78: ;
 
      
    }
    else if (t.is("strictness") )
    {
      // unimplemented feature. Issue a warning that it is currently not fully implemented
      setFailedPosition(t.getPosition(), 9999, t.getName(), t.toString());
    }
    else if (t.is("strictnessMessage"))
    {
      if(t.getValue("message").equals("allow"))
      {
        allowMessage(Integer.parseInt(t.getValue("messageNumber")));
      }
      else if(t.getValue("message").equals("disallow"))
      {
        disallowMessage(Integer.parseInt(t.getValue("messageNumber")));
      }
      else if(t.getValue("message").equals("ignore"))
      {
        ignoreMessage(Integer.parseInt(t.getValue("messageNumber")));
      }
      else if(t.getValue("message").equals("expect"))
      {
        expectMessage(Integer.parseInt(t.getValue("messageNumber")));
      }
    }      
    else if (t.is("namespace"))
    {
      String nameSpaceValue = t.getValue();
      lastParsedNameSpace = new NameSpace(nameSpaceValue,t.getPosition());
      if(!nameSpaceValue.equals("-"))
      {
        redefinePackageName = "";
        currentPackageName = nameSpaceValue;
        parsedNameSpaces.add(lastParsedNameSpace);
      }
      else
      {
        redefinePackageName = "-";
      }
      if (model.getDefaultNamespace() == null && !nameSpaceValue.equals("default"))
      {
        model.setDefaultNamespace(currentPackageName);  
      }
    }
    else if (t.is("namespaceoption"))
    {
      redefinePackageName = t.getValue("option").equals("--redefine")? new String(currentPackageName) : "";
    }    
    else if (t.is("inlineComment"))
    {
      analyzeComment(t, false);
      shouldConsumeComment = addToLastAttributeOrAssociation(t);
    }
    else if (t.is("annotationComment"))
    {
      analyzeComment(t, true);
      shouldConsumeComment = addToLastAttributeOrAssociation(t);
    }     
    else if (t.is("multilineComment"))
    {
      analyzeMultilineComment(t);
      shouldConsumeComment = false;
    }
    else if (t.is("classDefinition"))
    {
      analyzeClass(t);
    }
    else if (t.is("externalDefinition"))
    {
      if (t.getValue("interface")!=null)
        analyzeExternalInterface(t);
      else
        analyzeExternal(t);
    }
    else if (t.is("interfaceDefinition"))
    {
      analyzeInterface(t);
    }
    else if (t.is("associationClassDefinition"))
    {
      analyzeAssociationClass(t);
    }
    else if (t.is("associationDefinition"))
    {
      analyzeAllAssociations(t);
    }
    else if (t.is("toplevelException"))
    {
      analyzeToplevelException(t);
    }

    // This essentially "clears" the comments in the list so that new comments, when parsed, will be the ones appearing above
    // classes, methods, attributes, etc (whichever comes next) rather than old comments propogating everywhere.
    if (shouldConsumeComment)
    {
      lastComments.clear();
    }
  }


  /**
   * If the last attribute/association made matches the line number of the comment, add the comment to the attribute/association.
   * 
   * @param t the comment token that is used to see the position of the comment
   */
  // line 189 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean addToLastAttributeOrAssociation(Token t){
    if (t.getPosition() == null) {return false;}
    if (lastattr != null)
    {
      if (lastattr.getPosition().getLineNum() == t.getPosition().getLineNum())
      {
        // this will only add the current comment, as there can only be 1 inline comment per line
        for (Comment c : lastComments)
        {
          lastattr.addComment(c);
        }
        return true;
      }
      else
      {
        lastattr = null;
      }
    }  
    else if (lastassoc != null && lastassocPosition != null)
    {
      if (lastassocPosition.getLineNum() == t.getPosition().getLineNum())
      {
        // this will only add the current comment, as there can only be 1 inline comment per line
        for (Comment c : lastComments)
        {
          lastassoc.addComment(c);
        }
        return true;
      }
      else
      {
        lastassoc = null;
      }
    }                
    return false;
  }


  /**
   * Analyze class content tokens.
   * 
   * @param token The current token that will be analyzed to determine how to further make use of it (is it a method, comment, 
   * attribute, etc?)
   * @param aClass The Umple class used such that parsed content such as methods, attributes, comments, etc may be added to
   * it.
   * @param analysisStep Used to determine whether or not things should be analyzed more than once (multi-pass).
   */
  // line 236 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeClassToken(Token token, UmpleClass aClass, int analysisStep){
    if (analysisStep != 1)
    {
      return;
    }

    // Only need to clear comments if there actually was comments.
    boolean shouldConsumeComment = lastComments.size() > 0;
    
    // Determine what the current token is primarily, and based on that the analysis procedure is determined.
    if (token.isStatic("//") || token.isStatic("/*") || token.isStatic("*/"))
    {
      shouldConsumeComment = false;
    }
    else if (token.is("strictnessDisableAuto"))
    {
      Token expressionToken = token.getSubToken("expression");
      if(expressionToken != null)
      aClass.addDisableAutogeneratedMethodList(expressionToken.getValue());
    }
    else if (token.is("inlineComment"))
    {
      analyzeComment(token, false);
      shouldConsumeComment = addToLastAttributeOrAssociation(token);
    }
    else if (token.is("annotationComment"))
    {
      analyzeComment(token, true);
      shouldConsumeComment = addToLastAttributeOrAssociation(token);
    }
    else if (token.is("multilineComment"))
    {
      analyzeMultilineComment(token);
      shouldConsumeComment = false;
    }
    else if (token.is("innerClass"))
    {
      
      boolean isStatic = false;
      if(token.getSubToken("innerStaticClass") != null)
      {
        token = token.getSubToken("innerStaticClass");
        isStatic = true;
      }
      else
      {
        token = token.getSubToken("innerNonStaticClass");
      }
      token = token.getSubToken("classDefinition");
      UmpleClass childClass = analyzeClass(token);
      childClass.setIsStatic(isStatic);
      //childClass.setIsInner(true);
      // add Inner class to the aClass. 
      aClass.addInnerClass(childClass); //what is it, Is it a static or not 
    }
    // TODO Under development
    
    else if (token.is("classDefinition"))
    {
      UmpleClass childClass = analyzeClass(token);
      Token p = token.getParentToken();
      for (Token t: p.getSubTokens()) {
        if (t.getValue() == aClass.getName()) {
          if (aClass.getName() == childClass.getName()) {
            setFailedPosition(token.getPosition(),11,"Class",childClass.getName());
          }
          if (unlinkedExtends.get(childClass) == null) {
            List<String> extend = new ArrayList<>();
            extend.add(aClass.getName());
            unlinkedExtends.put(childClass, extend);
          } else {
            setFailedPosition(token.getPosition(),34,childClass.getName(),aClass.getName());
            break;
          }
          if (unlinkedExtendsTokens.get(childClass) == null) {
            List<Token> extendToken = new ArrayList<>();
            extendToken.add(t);
            unlinkedExtendsTokens.put(childClass, extendToken);
          } else {
            setFailedPosition(token.getPosition(),34,childClass.getName(),aClass.getName());
            break;
          }
        }
      }
    }
    else if (token.is("constantDeclaration"))
    {
      analyzeConstant(token,aClass);
    }
    else if(token.is("constantDeclarationDeprecated"))
    {
      setFailedPosition(token.getPosition(), 901);
      analyzeConstant(token,aClass);
    }
    else if (token.is("attribute"))
    {
      analyzeAttribute(token,aClass);
    }
    
    else if (token.is("testCase"))
    {
      analyzeClassTestCase(token,aClass);
    }
    
    else if (token.is("testClassInit"))
    {
      analyzeTestClassInit(token,aClass);
    }
    
    else if (token.is("genericTestCase"))
    {
      analyzeClassGenericTestCase(token,aClass);
    }
    
    else if (token.is("testSequence"))
    {
      analyzeClassTestSequence(token,aClass);
    }
    
else if (token.getValue("mixsetDefinition") != null)  {
        analyzeMixsetBodyToken(token);
      }
Label_Mixset_79: ;

    else if (token.is("extraCode"))
    {
      analyzeExtraCode(token,aClass);
    }

    else if (token.is("concreteMethodDeclaration"))
    {
      analyzeMethod(token,aClass);
    }
    else if (token.is("depend"))
    {
      Depend d = new Depend(token.getValue());
      aClass.addDepend(d);
    }
    else if (token.is("inlineAssociation"))
    {
      analyzeinlineAssociation(token,aClass);
    }
    else if (token.is("symmetricReflexiveAssociation"))
    {
      analyzeSymmetricReflexiveAssociation(token,aClass);
    }
    else if (token.is("invariant"))
    {
      if(!unanalyzedInvariants.containsKey(aClass))
      {
        unanalyzedInvariants.put(aClass, new ArrayList<Token>());
      }
      unanalyzedInvariants.get(aClass).add(token);
    }
    else if (token.is("enumerationDefinition"))
    {
      // Issue 1008
      analyzeEnumeration(token, aClass);
    }    
    else if (token.is("exception"))
    {
      analyzeException(token,aClass);
    }
    
    

    // This essentially "clears" the comments in the list so that new comments, when parsed, will be the ones appearing above
    // classes, methods, attributes, etc (whichever comes next) rather than old comments propogating everywhere.
    if (shouldConsumeComment)
    {
      lastComments.clear();
    }
  }


  /**
   * 
   * Analyzes a comment to determine if it should be added into the list of currently parsed comments waiting to be added to
   * a class, attribute, association, method or otherwise.
   * 
   * Note that this is for an inline comment rather than a multiline comment.
   * 
   * @param token The current token which has been flagged to be a comment to analyze, containing its value.
   */
  // line 421 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeComment(Token token, boolean isAnnotation){
    String theValue = "";
    // Special comment directive to force umpleoutput directives to be added
    // In every class
    String theComment= token.getValue();
    // Various settings indicating that no attempt should be made to compile code
    // in certain languages as the model is incomplete or contains raw code in another language
    if(theComment.contains("@@@skipcompile")) model.setSkipcompile(true);
    if(theComment.contains("@@@skipphpcompile")) model.setSkipphpcompile(true);
    if(theComment.contains("@@@skipjavacompile")) model.setSkipjavacompile(true);
    if(theComment.contains("@@@skipcppcompile")) model.setSkipcppcompile(true);
    if(theComment.contains("@@@skiprubycompile")) model.setSkiprubycompile(true);
    
    if (theComment.startsWith("@outputumplesource")) { 
      outputUmpleSource = true;
      return;
    }
    if (!theComment.equals("$?[End_of_model]$?")) 
    {
      Comment newComment = new Comment(theComment);
      if(isAnnotation) {
        newComment.setAnnotation(true);
      }
      lastComments.add(newComment);
    }
  }


  /**
   * 
   * Analyzes a comment to determine if it should be added into the list of currently parsed comments waiting to be added to
   * a class, attribute, association, method or otherwise.
   * 
   * Note that this is for a multiline comment, which essentially means the possibility of multiple inline comments (1 per line)
   * that will be concatenated together.
   * 
   * @param token The current token which has been flagged to be a comment to analyze, containing its value.
   */
  // line 458 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeMultilineComment(Token token){
    String inlineComments[] = token.getValue().split("\n");

    // Go through the inline comments and add them to the list of comments waiting to be applied
    String theComment = "";
    for (int i = 0; i < inlineComments.length; i++) 
    {
      theComment = inlineComments[i];
      // Various settings indicating that no attempt should be made to compile code
      // in certain languages as the model is incomplete or contains raw code in another language
      if(theComment.contains("@@@skipcompile")) model.setSkipcompile(true);
      if(theComment.contains("@@@skipphpcompile")) model.setSkipphpcompile(true);
      if(theComment.contains("@@@skipjavacompile")) model.setSkipjavacompile(true);
      if(theComment.contains("@@@skipcppcompile")) model.setSkipcppcompile(true);
      if(theComment.contains("@@@skiprubycompile")) model.setSkiprubycompile(true);
      
      if(theComment.startsWith("@outputumplesource")) {
        outputUmpleSource = true;
      }
      else {
        Comment comment = new Comment(theComment);
        comment.setIsInline(false);
        lastComments.add(comment);
      }
    }
  }


  /**
   * Link associations, association variables and extends that were "defined" after their use
   */
  // line 488 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void postTokenClassAnalysis(){
    if (verifyClassesInUse())
    {
      checkSingletonAssociations();
      addUnlinkedAssociationVariables();
      addUnlinkedAssociations();
      addAutogeneratedMethodsForAssociations();
      addUnlinkedExtends();
      
      //required for parsing specializedAssociations
      checkExtendsForCycles();
      createSpecializedLinks();
      checkDuplicateAssociationNames();
      checkDuplicateAssociationNamesClassHierarchy();
      checkIgnoredAssociations();
      checkSubclassSameAssociationDifferentRoleNames();

      checkExtendsForCycles();
      checkSortedAssociations();
      checkAssociationsValidity();
      
      //Issue 1084
      addUnlinkedKeys();
      Label_StateMachine_80: ;
      //Solution to issue 543
      //checkExtendsClass();
      checkAbstractClass();
      
      analyzeInvariants();
      
      //Solution to issue 502
      checkAttributeConflictImmutableAutounique();

      //Issue 610
      checkAssociationClassKeys();

      //issue 841
      checkSingletonParent();
      // this method sets the isDistributed flag for classes.
        analyzeDistributedClasses();
        setParentClassesDefaultInterface();
        checkAssociationsForDistributed(); 
        //checkDistributedAssociations();
    }
  }

  // line 534 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkAssociationsForDistributed(){
    if(model.getDistributed()){
    for (Association association : model.getAssociations()) 
    {  
      if (associationIsBetweenClassAndInterface (association)){continue;} 
       
if (associationIsBetweenClassAndTrait(association)){continue;}
Label_Trait_81: ;

      
      AssociationEnd myEnd = association.getEnd(0);
      AssociationEnd yourEnd = association.getEnd(1);
      
if(getModel().getUmpleTraitTypeParameter(myEnd.getClassName()) || getModel().getUmpleTrait(myEnd.getClassName())!=null) return ;
      if(getModel().getUmpleTraitTypeParameter(yourEnd.getClassName()) || getModel().getUmpleTrait(yourEnd.getClassName())!=null) return ;
Label_Trait_82: ;

      UmpleClass myClass = model.getUmpleClass(myEnd.getClassName());
      UmpleClass yourClass = model.getUmpleClass(yourEnd.getClassName());
      if(myClass.getIsDistributed()&& !yourClass.getIsDistributed()&&association.getIsRightNavigable())
      {
        getParseResult().addErrorMessage(new ErrorMessage(7002,association.getTokenPosition(),myClass.getName(),yourClass.getName()));
      }

    }
}
  }

  // line 558 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkDistributedAssociations(){
    for (UmpleClass uClass:  model.getUmpleClasses())
  {
    if(uClass.getIsDistributed())
    {
    }
  }
  }


  /**
   * Parent of each class that has default interface must have default interface.
   */
  // line 574 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void setParentClassesDefaultInterface(){
    for (UmpleClass uClass:  model.getUmpleClasses())
  {
    if ((uClass.getNeedsDefaultInterface())&&((uClass.getIsDistributed())||(uClass.getHasProxyPattern())))
    {
      if(uClass.getExtendsClass()!=null) 
      {
        if(!uClass.getExtendsClass().getNeedsDefaultInterface()&&!uClass.getExtendsClass().getIsDistributed())
        {
          setParentDefaultInterfaceRecursive(uClass.getExtendsClass(),uClass.getIsDistributed());
        }
      }
    }
  }
  }

  // line 591 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void setParentDefaultInterfaceRecursive(UmpleClass uClass, Boolean isDistributed){
    //if(!(uClass.getIsAbstract())&&!uClass.isImmutable()&&!uClass.getIsSingleton())
  if(true)
  {

    uClass.setIsDefaultInterfaceRemoteRMI(isDistributed);
    uClass.setNeedsDefaultInterface(true);
    if(uClass.getExtendsClass()!=null) 
    {
      if(!uClass.getExtendsClass().getNeedsDefaultInterface())
      {
        setParentDefaultInterfaceRecursive(uClass.getExtendsClass(),isDistributed);
      }
    }
  }
  }


  /**
   * Checking each class for distributabilty and chekning parent classes and interfaces as well as the system.
   */
  // line 612 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeDistributedClasses(){
    if(model.getDistributeOn())
  { 
    for (UmpleClass uClass:  model.getUmpleClasses())
    { 
      if (model.getDistributeForced()&&!(uClass.getIsAbstract())&&!uClass.isImmutable())
      { model.setDistributed(true);
        uClass.setDistributeTechnology(model.getDistributeTechnology());
        uClass.setIsDistributed(true);
        //uClass.setHasProxyPattern(true);
        uClass.setNeedsDefaultInterface(true);
      }
      if (!uClass.getIsDistributed())
      { if(checkIsDistributed(uClass))
        { 
          uClass.setNeedsDefaultInterface(true);
        }
      }    
      for(UmpleInterface parentInterface :uClass.getParentInterface())
      { 
        if (parentInterface.getIsDistributable())
        { 
          uClass.setNeedsDefaultInterface(false);
        }
      }      
    }



  }
  }

  // line 646 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private Boolean checkIsDistributed(UmpleClass uClass){
    /******
  if the class implements d distributable interface it is also distributed. Here it has to be checked whether the class has more than one immediate distributable interfaces
 First check the parent interfaces, then check the class itself, if none are distributable, check for parent classes
 ******/
  int distributedParents=0; 
  for (UmpleInterface parentInterface: uClass.getParentInterface())
  { 
    if(checkIsDistributed(parentInterface)&&!(uClass.getIsAbstract())&&!uClass.isImmutable())
    {  
      distributedParents+=1;
      uClass.setDistributeTechnology(parentInterface.getDistributeTechnology());
      uClass.setIsDistributed(true);
      model.setDistributed(true);
      //uClass.setHasProxyPattern(true);
      uClass.setNeedsDefaultInterface(false);
      if (parentInterface.getIsDistributable())
      { 
        uClass.setNeedsDefaultInterface(false);
      }     
    }
  }
  if(distributedParents==1)
  {
    return true;
  }


/*
First it is checked if the class is distributable itself. Then the parent classes
*/
  if(uClass.getIsDistributable()&&!(uClass.getIsAbstract())&&!uClass.isImmutable())
  {
    //uClass.setHasProxyPattern(true);
    uClass.setNeedsDefaultInterface(true);
    uClass.setIsDistributed(true);
    model.setDistributed(true);
    return true;
  }

  if(uClass.getExtendsClass()!=null) 
  {
    if(checkIsDistributed(uClass.getExtendsClass())&&!(uClass.getIsAbstract()))
    { 
      uClass.setIsDistributed(true);
      model.setDistributed(true);
      //uClass.setHasProxyPattern(true);
      uClass.setNeedsDefaultInterface(true);
      uClass.setDistributeTechnology(uClass.getExtendsClass().getDistributeTechnology());
      return true;
    }
  }  

  return false;
  }


  /**
   * this method checks for all of the interfaces recursively and returns true if the interface extends a distributable interface
   */
  // line 703 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private Boolean checkIsDistributed(UmpleInterface uInterface){
    if(uInterface.getIsDistributable())
  {
    return true;
  }
  /*for (UmpleInterface parentInterface  : uInterface.getExtendsInterface())
  {
    if(checkIsDistributed(parentInterface))
    {
     uInterface.setDistributeTechnology(parentInterface.getDistributeTechnology());
     return true;
    }
  }*/
  return false;
  }


  /**
   * Analyze subtoken distributable to check which keyword is parsed
   */
  // line 722 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeDistributableInterface(Token distributableToken, UmpleInterface aInterface){
    // If the "DistributableRMI" keyword is parsed, make the Umple interface Distributable.
    if (distributableToken.getValue("distributable")!= null)
    {
      aInterface.setIsDistributable(true);
      if(distributableToken.getValue("distributeTech")!=null)
        aInterface.setDistributeTechnology(distributableToken.getValue("distributeTech"));
    }
  }


  /**
   * Issue 841
   */
  // line 734 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkSingletonParent(){
    for (UmpleClass uClass:  model.getUmpleClasses())
    { 
      if(uClass.getExtendsClass()!=null) {
        if(uClass.getExtendsClass().getIsSingleton()) {
          getParseResult().addErrorMessage(new ErrorMessage(40,uClass.getPosition(0),uClass.getName(),uClass.getExtendsClass().getName()));
        }
      }
    }
  }


  /**
   * Issue 686
   */
  // line 747 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkCodeInjections(){
    for(Map.Entry<UmpleClassifier, List<Token>> entry : unanalyzedInjectionTokens.entrySet())
    {
      for(Token injectToken : entry.getValue())
      {
        String operationSource = getOperationSource(injectToken);
        if ("".equals(operationSource))
          operationSource = "generated";
        checkCodeInjectionValidity(injectToken, (UmpleClass) entry.getKey(), operationSource);
      }
    }
  }

  // line 761 "../../../../src/UmpleInternalParser_CodeClass.ump"
   public void analyzeInvariants(){
    for(UmpleClassifier uClass:unanalyzedInvariants.keySet())
    {
      for(Token invariant:unanalyzedInvariants.get(uClass))
      {
        analyzeInvariant(invariant,uClass);
      }
    }
  }


  /**
   * Issue 610
   */
  // line 773 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkAssociationClassKeys(){
    for (UmpleClass uClass:  model.getUmpleClasses())
    { 
      if(uClass instanceof AssociationClass) {
        AssociationClass assocClass = (AssociationClass)uClass;
        assocClass.addMissingKeyIfNeeded();
      }
    }
  }

  // line 784 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkAttributeConflictImmutableAutounique(){
    if(attributeAutouniqueImmutable != null && attributeAutouniqueImmutable.size() > 0)
    {
      for(Map.Entry<Token, UmpleClass> entry : attributeAutouniqueImmutable.entrySet())
      {
        String attrNameCapital = Character.toUpperCase(entry.getKey().getValue("name").charAt(0)) + entry.getKey().getValue("name").substring(1);
        if(entry.getKey().getValue("autounique") != null)
        {
          for(Attribute attr : entry.getValue().getAttributes())
          {
            if(attr.getName().equals("next"+attrNameCapital))
            {
              getParseResult().addErrorMessage(new ErrorMessage(38,attr.getPosition(),attr.getName(),"autounique",entry.getKey().getValue("name")));
            }
          }
        }
        if(entry.getKey().getValue("modifier") !=null)
        {
          for(Attribute attr : entry.getValue().getAttributes())
          {
            if(attr.getName().equals("canSet"+attrNameCapital)||attr.getName().equals("can_set_"+entry.getKey().getValue("name")))
            {
              getParseResult().addErrorMessage(new ErrorMessage(38,attr.getPosition(),attr.getName(),"immutable",entry.getKey().getValue("name")));
            }
          }
        }
      }
    }
  }

  // line 815 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void postTokenInterfaceAnalysis(){
    addUnlinkedInterfaceExtends();
    checkExtendsForCyclesInterface();
  }

  // line 849 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkExtendsForCyclesInterface(){
    for(UmpleInterface I : model.getUmpleInterfaces())
    {
      HashMap<UmpleInterface, Boolean> vistedMap = new HashMap<UmpleInterface, Boolean>();
      if(I.getExtendsInterface() != null)
      {
        if(recursiveCycleCheckInterface(I.getExtendsInterface(), I, vistedMap).contains(I))
        {
          Token t = I.getExtendsToken();
          if(t.getValue().equals(I.getName()))
            getParseResult().addErrorMessage(new ErrorMessage(11,t.getPosition(),"Interface",I.getName()));
          else
            getParseResult().addErrorMessage(new ErrorMessage(12,t.getPosition(),"Interface",t.getValue(),I.getName()));
        }
      }
    }
  }

  // line 868 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private UmpleClass recursiveCycleCheck(UmpleClass extend, UmpleClass parent, HashMap<UmpleClass,Boolean> map){
    UmpleClass temp = null;
    
    if(extend == null)
      return null;
    
    if(map.containsKey(extend))
      return extend;
    
    map.put(extend, true);
    
    if(parent.equals(extend.getExtendsClass()))
      return extend.getExtendsClass();
    
    temp = recursiveCycleCheck(extend.getExtendsClass(), parent, map);
    return temp;
  }

  // line 887 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkExtendsForCycles(){
    for(UmpleClass C : model.getUmpleClasses())
    {
      HashMap<UmpleClass, Boolean> vistedMap = new HashMap<UmpleClass, Boolean>();
      if(C.getExtendsClass() != null)
      {
        if(C.equals(recursiveCycleCheck(C.getExtendsClass(), C, vistedMap))) 
        { model.setDistributeOn(false);
          Token t = C.getExtendsToken();
          if(t.getValue().equals(C.getName()))
            getParseResult().addErrorMessage(new ErrorMessage(11,t.getPosition(),"Class",C.getName()));
          else
            getParseResult().addErrorMessage(new ErrorMessage(12,t.getPosition(),"Class",t.getValue(),C.getName()));
        }
      }
    }
  }


  /**
   * Check for classes that should be abstract
   */
  // line 906 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkAbstractClass(){
    for(UmpleClass uClass : model.getUmpleClasses()) 
    { 
      if(uClass.getIsAbstract()) 
      {
        // no work needs to be done on this class.
        continue;
      }
      
      if(uClass.getUnimplementedMethods().length > 0) 
      {
        uClass.setIsAbstract(true);
        continue;
      }
      
      // Check if class should be abstract based on properties of ancestors
      HashMap<String, Integer> uChildren = new HashMap<String, Integer>();
      checkAbstractClassRecursive(uClass, uChildren);
    }
  }


  /**
   * Checks for unimplemented methods in ancestor classes
   * against the implemented methods in aClass. if neither
   * aClass nor its ancestors implemented a method, then
   * aClass must be abstract.
   */
  // line 933 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private Method[] checkAbstractClassRecursive(UmpleClass aClass, HashMap<String,Integer> aChildren){
    if(aClass.getExtendsToken() == null || aClass.getExtendsClass() == null || aChildren.get(aClass.getName()) != null) 
    {
      return aClass.getUnimplementedMethods();
    }

    aChildren.put(aClass.getName(), 1);
    Method[] ancestorUnimplementedMethods = checkAbstractClassRecursive(aClass.getExtendsClass(), aChildren);
    for(Method unimplementedMethod : ancestorUnimplementedMethods) 
    {
      if(!aClass.hasMethod(unimplementedMethod)) 
      {
        aClass.addUnimplementedMethod(unimplementedMethod);
      }
    }

    if(aClass.getUnimplementedMethods().length > 0) 
    {
      aClass.setIsAbstract(true);
    }

    return aClass.getUnimplementedMethods();
  }


  /**
   * Check for the existence of a a parent class
   */
  // line 958 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkExtendsClass(){
    for(UmpleClass child : model.getUmpleClasses()) 
    {
      if(child.getExtendsToken() != null) 
      {
        if (child.getExtendsClass() != null ) 
        {
          // check to make sure attribute doesn't share a name with inherited attribute - F.K.

          //Issue 578
          
          List<Attribute> attRepetition = new ArrayList<Attribute>();
          
          for(Attribute aAttribute : child.getAttributes())
          {
            int limit = 100; // prevent infinite loops
            UmpleClass extend = child.getExtendsClass();
            while(extend!=null && child != extend && limit > 0) 
            {
              limit--;
              for(Attribute extendAttr : extend.getAttributes()) 
              {
                
                String currentName = aAttribute.getName();
                if (extendAttr.getName().equals(currentName)) 
                {
                  if(extendAttr.getType().equals(aAttribute.getType()))
                  {
                    if(aAttribute.getValue() == null)
                      attRepetition.add(aAttribute);
                    else
                      aAttribute.setIsRefinement(true);
                  }
                  else
                  {
                  attRepetition.add(aAttribute);
                    setFailedPosition(aAttribute.getPosition(), 44, child.getName(), currentName, extend.getName());
                
                  }
                }
              }
              extend = extend.getExtendsClass();
            }  
          }
          
          for(Attribute att : attRepetition)
            child.deleteAttribute(att);
            
          continue;
        }
        else{
          Token t = child.getExtendsToken();
          getParseResult().addErrorMessage(new ErrorMessage(33,t.getPosition(),t.getValue(),child.getName()));      
        }
      }
    }
  }


  /**
   * Analyzes all associations that are part of the given token indicated to be related to an association.
   * 
   * @param associationToken The token indicated to be an association or association Class where sub tokens will be analyzed from to further
   * analyze the individual associations.
   */
  // line 1023 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeAllAssociations(Token associationToken){
    String name = associationToken.getValue("name");

    // Go through every token that is a child of the current token (all associations part of this association).
    for(Token token : associationToken.getSubTokens()){
      boolean isAssociationToken = token.is("association");
      Label_Mixset_106: ;

      //Issue 213/131: [association] elements inside associationClasses generate 2 associations instead of one
      if (isAssociationToken && associationToken.is("associationClassDefinition")) {
        for (Token t : token.getSubTokens()) {
          if (t.is("associationEnd")) {
            analyzeAssociation(t, "");
          }
        }
      } else if (isAssociationToken || token.is("singleAssociationEnd")){
        Association association = analyzeAssociation(token, "");
        if(isAssociationToken && association != null){
          association.setName(name);
        }
      }
      if (!getParseResult().getWasSuccess()) { return; }
    }
  }


  /**
   * Analyzes a class token to populate an Umple class.
   * 
   * This is also where the list of currently parsed comments will be added to the Umple class.
   * 
   * @param classToken The token which contains the data to be analyzed to populate an Umple class.
   * 
   * @return An Umple class populated with data based on the analysis of the class token.
   */
  // line 1058 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private UmpleClass analyzeClass(Token classToken){
    Label_StateMachine_84: ;

    String className = classToken.getValue("name").split(" ")[classToken.getValue("name").split(" ").length-1];
    //Check to ensure the name is valid (starts with a letter, and only contains letters, numbers, or underscores
    if (Token.isValidIdentifier(className, "[A-Za-z]") != true) {
      setFailedPosition(classToken.getPosition(), 100, className);
    }
    else if ( className.matches("[a-z].*") ){ // Warn when class name does not start with a capital letter.
      setFailedPosition(classToken.getPosition(), 101, className);
    }
    UmpleClass aClass;
    //Issue 213: UmpleClass can be an AssociationClass
    if(classToken.is("associationClassDefinition")){
        aClass = model.addAssociationClass(classToken.getValue("name"));
    }else{
        aClass = model.addUmpleClass(classToken.getValue("name"));
    }
    if ( classToken.is("classDefinition") && "external".equals(aClass.getModifier()) )
      aClass.setModifier(""); // Remove the external modifier if a non-external specification of this class is found.

    Position thePosition = classToken.getPosition();
    Position endPosition = classToken.getEndPosition();

    // Set the original .ump file and line number
    aClass.addPosition(thePosition);
    aClass.addEndPosition(endPosition);

    // Add all the comments in the comment list to the Umple class.
    // But add them before any umplesource special comments
    int regularCommentCountEnd = 0;
    for (Comment c : aClass.getComments()) {
      if(c.getText().startsWith("@umplesource")) break;
      regularCommentCountEnd++;
    }

    for (Comment c : lastComments)
    {
      aClass.addCommentAt(c,regularCommentCountEnd);
      regularCommentCountEnd++;
    }
    
    // Add special position comment at the end if @outputumplesource had been 
    // detected earlier in a comment
    if(outputUmpleSource == true) {  
      String path = null;
      if( thePosition.getFilename() == null ){
        path = "";
      }else{
        path = Paths.get(thePosition.getFilename()).getFileName().toString();
      }
      aClass.addComment(new Comment("@umplesource " + path +" "+thePosition.getLineNumber()));
    }

  // If the "abstract" keyword is parsed, make the Umple class an abstract class.
    if (classToken.getValue("abstract") != null)
    {
      boolean wasSet = aClass.setIsAbstract(true);
      
      // Ensure the value was set.
      if (wasSet == false)
      {
        setFailedPosition(classToken.getPosition(), 0, "Unable to make class abstract!");
      }
    }
    addExtendsTo(classToken, aClass, unlinkedExtends, unlinkedExtendsTokens);
    
    // If the "singleton" keyword is parsed, make the Umple class a singleton.
    if (classToken.getValue("singleton") != null)
    {
      aClass.setIsSingleton(true);
    }
    // If the "Distributable" keyword is parsed, make the Umple class Distributable.
    if (classToken.getValue("distributable") != null)
    {
      aClass.setIsDistributable(true);
      if(classToken.getValue("distributeTech")!=null)
        aClass.setDistributeTechnology(classToken.getValue("distributeTech"));

    }
    if (classToken.getValue("proxyPattern")!=null)
    {
      aClass.setHasProxyPattern(true);
      aClass.setNeedsDefaultInterface(true);
    }
    if(!"".equals(aClass.getPackageName()) && !currentPackageName.equals(aClass.getPackageName())){
      if(redefinePackageName.equals(currentPackageName))
      {
        aClass.getNameSpace().setTimesUsed(aClass.getNameSpace().getTimesUsed()-1);
        aClass.setPackageName(currentPackageName.equals("default")?"":currentPackageName);
        aClass.setNameSpace(lastParsedNameSpace);
        lastParsedNameSpace.setTimesUsed(lastParsedNameSpace.getTimesUsed()+1);
      }
      else
      {
        if(!redefinePackageName.equals("-"))
          setFailedPosition(classToken.getPosition(), 30, "class", aClass.getName(), currentPackageName);
      }
      
    }    
    if("".equals(aClass.getPackageName())){
      String pkgName = lastParsedNameSpace.getValue();
      if(pkgName!="" && !pkgName.equals("-"))
      {
        aClass.setPackageName(pkgName.equals("default")?"":pkgName);
        aClass.setNameSpace(lastParsedNameSpace);
        lastParsedNameSpace.setTimesUsed(lastParsedNameSpace.getTimesUsed()+1);
      }
      else if(pkgName.equals("-"))
      {
        aClass.setPackageName("");
      }
      else
      {
        aClass.setPackageName(currentPackageName.equals("default")?"":currentPackageName);
      }
    }
    if (aClass.getIsSingleton()) 
    {
      classToken.setName(classToken.getName());  
    }

    if (classToken.getValue("immutable") != null)
    {
      boolean wasSet = aClass.setImmutable();
      if (!wasSet)
      {
        // Future-proofing: currently all paths cause wasSet to be true
        setFailedPosition(classToken.getPosition(), 14, classToken.getName());
      }
    }

    if(classToken.is("associationClassDefinition")) {
      analyzeAllAssociations(classToken);
    }
    
    analyzeAllTokens(classToken,aClass);
    return aClass;
  }


  /**
   * Takes an Umple classifier and analyzes a classifier token to add classifiers which extend it.
   * 
   * @param classifierToken The token to be analyzed to add subclasses to the specified Umple classifier.
   * @param aClassifier The Umple classifier for which subclasses will be added.
   */
  // line 1206 "../../../../src/UmpleInternalParser_CodeClass.ump"
  public void addExtendsTo(Token classifierToken, UmpleClassifier aClassifier, Map<UmpleClassifier,List<String>> unlinkedExtends, Map<UmpleClassifier,List<Token>> unlinkedExtendsTokens){
    List<String> extendsList = new ArrayList<String>();
    List<Token> extendsTokenList = new ArrayList<Token>();

   String extendName="";
    // Go through all sub-tokens of the class token to add subclasses related to the Umple class.
    for (Token extendsToken : classifierToken.getSubTokens())
    {
      if (extendsToken.getValue("extendsName") != null||extendsToken.getValue("extendsNames")!=null)
      { 
        String name = extendsToken.getValue("extendsName") != null?extendsToken.getValue("extendsName"):extendsToken.getValue("extendsNames");
        extendsList.add(name);
        extendsTokenList.add(extendsToken); // With this line we really don't need the above, todo: refactor
        if (unlinkedExtends.containsKey(aClassifier)){
          if (!unlinkedExtends.get(aClassifier).contains(name)) unlinkedExtends.get(aClassifier).add(name);
        } else{
          unlinkedExtends.put(aClassifier, extendsList);
        }       
        if (unlinkedExtendsTokens.containsKey(aClassifier)){
          if (!unlinkedExtendsTokens.get(aClassifier).contains(extendsToken)) unlinkedExtendsTokens.get(aClassifier).add(extendsToken);
        } else{
          unlinkedExtendsTokens.put(aClassifier, extendsTokenList);
        }
        extendName = extendsToken.getValue("extendsName");
      } else if (extendsToken.getValue("gTemplateParameter") !=null ){
        Label_Trait_85: ;

      }
    }
    
    //Checks list of extends tokens to prevent multiple class inheritance
    if(numberOfExtendsClass(unlinkedExtendsTokens.get(aClassifier)) > 1)
    {
      Token t = classifierToken;
      String otherClass = "indicated here";
      Position thePosition = new Position("",0,0,0);
      if(extendsTokenList.size()>0) {
        t = extendsTokenList.get(0);
        otherClass = t.getValue();
        thePosition = t.getPosition();
      }
      setFailedPosition(thePosition, 34, aClassifier.getName(), otherClass);
    }
  }


  /**
   * Returns the number of umple class in extends list (extList)
   */
  // line 1253 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private int numberOfExtendsClass(List<Token> extList){
    if (extList == null) {
      return 0;
    }
    Set<String> tokenSet = new HashSet<>();
    for(Token t : extList)
    { 
      if(isAnUmpleClass(t.getValue("extendsName"))) {
        tokenSet.add(t.getValue("extendsName"));
      }
    }
  return tokenSet.size();
  }


  /**
   * This method checks if an umple element with name "name" is an umple class
   */
  // line 1269 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean isAnUmpleClass(String name){
    for(UmpleClass aClass : model.getUmpleClasses())
  {
    if(aClass != null)
    {
    String nam = aClass.getName();
    if(nam.equals(name))
      return true;
    }
  }
  return false;
  }

  // line 1282 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private UmpleClass analyzeExternal(Token externalToken){
    // Check to see if there is an existing class
    UmpleClass existingClass = model.getUmpleClass(externalToken.getValue("name"));
    UmpleClass aClass = analyzeClass(externalToken);
    // Only set the modifier to external if there is not a class defined with the same name
    if ( existingClass == null )
      aClass.setModifier("external");
    return aClass;
  }

  // line 1293 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private UmpleInterface analyzeExternalInterface(Token externalToken){
    UmpleInterface anInterface = analyzeInterface(externalToken);
    anInterface.setModifier("external");
    return anInterface;
  }

  // line 1300 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private UmpleInterface analyzeInterface(Token interfaceToken){
    String interfaceName = interfaceToken.getValue("name");   
    //Check to ensure the name is valid (starts with a letter, and only contains letters, numbers, or underscores
    if (Token.isValidIdentifier(interfaceName, "[A-Za-z|@]") != true) {
      if(!interfaceName.matches("[A-Za-z|@]+<.+>"))
      {
        setFailedPosition(interfaceToken.getPosition(), 110, interfaceName);
      }
    }
    else if ( interfaceName.matches("[a-z].*") ){ // Warn when interface name doesn't start with a capital letter.
      setFailedPosition(interfaceToken.getPosition(), 111, interfaceName);
    }
    
    UmpleInterface anInterface = model.addUmpleInterface(interfaceToken.getValue("name"));
    Position thePosition = interfaceToken.getPosition();
    Position endPosition = interfaceToken.getEndPosition();

    // Set the original .ump file and line number
    anInterface.addPosition(thePosition);
    anInterface.addEndPosition(endPosition);

    // Add all the comments in the comment list to the Umple class.
    // But add them before any umplesource special comments
    int regularCommentCountEnd = 0;
    for (Comment c : anInterface.getComments()) {
      if(c.getText().startsWith("@umplesource")) break;
      regularCommentCountEnd++;
    }

    for (Comment c : lastComments)
    {
      anInterface.addCommentAt(c,regularCommentCountEnd);
      regularCommentCountEnd++;
    }
    
    // Add special position comment at the end if @outputumplesource had been 
    // detected earlier in a comment
    if(outputUmpleSource == true) {  
      String path = null;
      if( thePosition.getFilename() == null ){
        path = "";
      }else{
        path = Paths.get(thePosition.getFilename()).getFileName().toString();
      }
      anInterface.addComment(new Comment("@umplesource " + path +" "+thePosition.getLineNumber()));
    }
  
    if(!"".equals(anInterface.getPackageName()) && !currentPackageName.equals(anInterface.getPackageName())){
      if(redefinePackageName.equals(currentPackageName))
      {
        anInterface.getNameSpace().setTimesUsed(anInterface.getNameSpace().getTimesUsed()-1);
        anInterface.setPackageName(currentPackageName.equals("default")?"":currentPackageName);
        anInterface.setNameSpace(lastParsedNameSpace);
        lastParsedNameSpace.setTimesUsed(lastParsedNameSpace.getTimesUsed()+1);
      }
      else
      {
        if(!redefinePackageName.equals("-"))
          setFailedPosition(interfaceToken.getPosition(), 30, "interface", anInterface.getName(), currentPackageName);
      }
      
    }    
    if("".equals(anInterface.getPackageName())){
      String pkgName = lastParsedNameSpace.getValue();
      if(pkgName!="" && !pkgName.equals("-"))
      {
        anInterface.setPackageName(pkgName.equals("default")?"":pkgName);
        anInterface.setNameSpace(lastParsedNameSpace);
        lastParsedNameSpace.setTimesUsed(lastParsedNameSpace.getTimesUsed()+1);
      }
      else if(pkgName.equals("-"))
      {
        anInterface.setPackageName("");
      }
      else
      {
        anInterface.setPackageName(currentPackageName.equals("default")?"":currentPackageName);
      }
    }
    analyzeInterface(interfaceToken,anInterface);
    return anInterface;
  }

  // line 1384 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeInterface(Token interfaceToken, UmpleInterface aInterface){
    for(Token token : interfaceToken.getSubTokens())
    {   
      if (token.is("depend"))
      {
        Depend d = new Depend(token.getValue());
        aInterface.addDepend(d);
      }
      if (token.is("interfaceMemberDeclaration"))
      {
        analyzeInterfaceMembers(token, aInterface);
      }
      else if (token.is("elementPosition"))
      {
        aInterface.setCoordinates(new Coordinate(token.getIntValue("x"),token.getIntValue("y"), token.getIntValue("width"), token.getIntValue("height")));
      }
    }
  }

  // line 1403 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addUnlinkedInterfaceExtends(){
    for (UmpleClassifier c : unlinkedInterfaceExtends.keySet())
    {
      UmpleInterface child = null; //unlinkedInterfaceExtends guaranteed to contain only UmpleInterfaces
      if (c instanceof UmpleInterface){
        child = (UmpleInterface) c;
      }
      List<String> extendsNames = unlinkedInterfaceExtends.get(child);
      List<Token>  extendsToken = unlinkedExtendsTokensInterface.get(child);
      

      if (extendsNames == null)
      {
        continue;
      }
      

      for (int i=0; i < extendsNames.size();i++)
      {
        String extendName= extendsNames.get(i);
        UmpleInterface uInterface=  model.getUmpleInterface(extendName);
        
        //Issue 595
        if(uInterface == null)
        {
          getParseResult().addErrorMessage(new ErrorMessage(39,extendsToken.get(i).getPosition(),child.getName(),extendName));
        }
        else
        {
          
          boolean wasSet = child.addExtendsInterface(uInterface);
          
          if (!wasSet)
          {
            Position pos;
            try
            {
              pos = extendsToken.get(i).getPosition();
            }
            catch(Exception e)
            {
              pos = new Position("",0,0,0);
            }
            setFailedPosition(pos, 16, child.getName(), uInterface.getName());
            return;
          }
          try
          {
            child.setExtendsToken(extendsToken.get(i));
          }
          
          catch(Exception e){}
        }
      }
    }
  }

  // line 1462 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeInterfaceMembers(Token interfaceMemberToken, UmpleInterface aInterface){
    for(Token childToken : interfaceMemberToken.getSubTokens())
    { 
      addExtendsTo(interfaceMemberToken, aInterface, unlinkedInterfaceExtends, unlinkedExtendsTokensInterface);
      
      if(childToken.is("abstractMethodDeclaration"))
      {
        analyzeMethod(childToken, aInterface);   
      }
      else if (childToken.is("distributableInterface"))
      {
        analyzeDistributableInterface(childToken, aInterface);   
      }
      else if (childToken.is("constantDeclaration"))
      {
        analyzeConstant(childToken, aInterface);    
      }
      else if (childToken.is("constantDeclarationDeprecated"))
      {
        setFailedPosition(childToken.getPosition(), 901);
        analyzeConstant(childToken, aInterface);    
      }
      
      else if (childToken.is("interfaceTest"))
      {
        //setFailedPosition(childToken.getPosition(), 901);
        analyzeInterfaceTest(childToken, aInterface);    
      }
      
      else if (childToken.is("displayColor"))
      {  // Note: See near clone in UmpleInternalParser_CodeLayout.ump
        String theColor = childToken.getValue("colorValue");
        if(theColor.startsWith("=")) theColor=theColor.substring(1,theColor.length());
        if(!theColor.startsWith("\"")) theColor= "\""+theColor;
        if(!theColor.endsWith("\"")) theColor= theColor+"\"";         
        aInterface.setDisplayColor(theColor);
      }
      else if (childToken.is("extraCode") || childToken.is("exception"))
      {
      if (childToken.is("extraCode"))
      {
        setFailedPosition(childToken.getPosition(), 1007);
          aInterface.appendExtraCode(childToken.getValue("extraCode"));
        }
        else if (childToken.is("exception"))
        {
          analyzeException(childToken, aInterface);
        }
      }
    }
  }

  // line 1515 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeAssociationClass(Token classToken){
    //test if Association class has at least 1 association or more than one singleEndAssociation
    List<Token> subtokens = classToken.getSubTokens();
    int singleAssocNumber = 0;
    int assocNumber = 0;
    for(Token t : subtokens){
        if(t.is("singleAssociationEnd")){
            singleAssocNumber++;
        }else if (t.is("association")){
            assocNumber++;
        }
    }
    if(singleAssocNumber == 1 || (assocNumber == 0 && singleAssocNumber == 0)){
        setFailedPosition(classToken.getPosition(), 8, classToken.getValue("name"));
        return;
    }
    analyzeClass(classToken);
  }

  // line 1535 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean verifyClassesInUse(){
    for(Map.Entry<Position, String> e : positionToClassNameReference.entrySet())
    {
      boolean isAClass = model.getUmpleClass(e.getValue()) != null;
      boolean isAInterface = model.getUmpleInterface(e.getValue()) != null;
      boolean condToCheck = !isAClass && !isAInterface ;
      
boolean isTraitTypeParameter = model.getUmpleTraitTypeParameter(e.getValue());
        boolean isATrait = model.getUmpleTrait(e.getValue()) != null;
        condToCheck = condToCheck && !isATrait && !isTraitTypeParameter;
Label_Trait_86: ;

      
      if ( condToCheck ) //item referenced not a class or interface or a trait or a type parameter
      {
        //TODO traits' error
        UmpleClass aClass = model.addUmpleClass(e.getValue());
        aClass.setPackageName(model.getDefaultNamespace());
        setFailedPosition(e.getKey(), 5, e.getValue());
        return false;
      }
    }
    
    return true;
  }

  // line 1557 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean associationIsBetweenClassAndInterface(Association a){
    AssociationEnd myEnd = a.getEnd(0);
       AssociationEnd yourEnd = a.getEnd(1);
       
       UmpleClass myClass = model.getUmpleClass(myEnd.getClassName());
       UmpleInterface yourClass = model.getUmpleInterface(yourEnd.getClassName());
       
       if (myClass != null && yourClass != null ){ //association is between class and interface
         return true;
       }
       
       return false;
  }

  // line 1572 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean associationIsBetweenClassAndAbstractClass(Association a){
    AssociationEnd endA = a.getEnd(0);
    AssociationEnd endB = a.getEnd(1);
    
    UmpleClass classA = model.getUmpleClass(endA.getClassName());
    UmpleClass classB = model.getUmpleClass(endB.getClassName());
    
    if (classA != null && classB != null) {
      if (classB.getIsAbstract() && !classA.getIsAbstract()) {
        return true;
      }
    }
    
    return false;
  }

  // line 1588 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean associationIsBetweenAbstractClassAndClass(Association a){
    AssociationEnd endA = a.getEnd(0);
    AssociationEnd endB = a.getEnd(1);
    
    UmpleClass classA = model.getUmpleClass(endA.getClassName());
    UmpleClass classB = model.getUmpleClass(endB.getClassName());
    
    if (classA != null && classB != null) {
      if (!classB.getIsAbstract() && classA.getIsAbstract()) {
        return true;
      }
    }
    
    return false;
  }

  // line 1607 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addAutogeneratedMethodsForAssociations(){
    for (Association a : model.getAssociations())
    {
      addAPIMethodsForAssociation(a);
    }
  }

  // line 1616 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addUnlinkedAssociationVariables(){
    for (AssociationVariable av : unlinkedAssociationVariables)
    {
      AssociationVariable relatedAv = av.getRelatedAssociation();

      UmpleClass aClass = model.getUmpleClass(av.getType());
      UmpleClass bClass = model.getUmpleClass(relatedAv.getType());   

      if (aClass == null || bClass == null){ //Association is between Class and Interface
        continue;
      }   

      Association assoc = bClass.getAssociation(bClass.indexOfAssociationVariable(av));

      boolean added = aClass.addAssociationVariable(relatedAv);

      if (!added)
      {
        if ((!aClass.isImmutable() && !av.getRelatedAssociation().getIsNavigable()) || (!bClass.isImmutable() && !av.getIsNavigable())) 
        { 
          setFailedPosition(assoc.getTokenPosition(),13);
        }
        else { setFailedPosition(assoc.getTokenPosition(),18); }
        return;
      }

      aClass.addAssociation(assoc);

      // Set the proper end number for both association variable
      AssociationEnd end0 = assoc.getEnd(0);
      AssociationEnd end1 = assoc.getEnd(1);
      if (end0.getClassName().equals(aClass.getName()) && end1.getClassName().equals(bClass.getName()))
      {
        av.setRelevantEnd(0);
        relatedAv.setRelevantEnd(1);
      } else {
        av.setRelevantEnd(1);
        relatedAv.setRelevantEnd(0);
      }

      if (av.getIsNavigable())
      {
        bClass.addReferencedPackage(aClass.getPackageName());
      }

      if (av.getRelatedAssociation().getIsNavigable())
      {
        aClass.addReferencedPackage(bClass.getPackageName());
      }

    }
  }

  // line 1670 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean isUmpleClass(String elementName){
    return (model.getUmpleInterface(elementName) != null) ? false: true;
  }

  // line 1675 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addUnlinkedExtends(){
    for (UmpleClassifier c : unlinkedExtends.keySet())
    {
      UmpleClass child = null; // unlinkedExtends guaranteed to contain only UmpleClasses
      if (c instanceof UmpleClass){
        child = (UmpleClass) c;
      }  
    
      List<String> extendsNames = unlinkedExtends.get(child);    
      List<Token>  extendsToken = unlinkedExtendsTokens.get(child);

      if (extendsNames == null)
      {
        continue;
      }

      for (int i=0; i < extendsNames.size();i++)
      {
        String extendName= extendsNames.get(i);
        boolean isTraitCheck = false;
        
isTraitCheck = isUmpleTrait(extendName);
Label_Trait_87: ;


        if (isUmpleClass(extendName))
        {
          if (isTraitCheck )
          {
            
UmpleTrait parent = model.getUmpleTrait(extendName);     
              boolean wasSet = child.addExtendsTrait(parent);
              if (!wasSet)
              {
                Position pos;
                try
                {
                  pos = extendsToken.get(i).getPosition();
                }
                catch(Exception e)
                {
                  pos = new Position("",0,0,0);
                }
                // TODO 1: the error code should be chnaged.            
                setFailedPosition(pos, 16, child.getName(), parent.getName());
                return;
              }
Label_Trait_88: ;
                   
          }
          else
          {
            UmpleClass parent = model.getUmpleClass(extendName);     
      boolean wasSet = child.setExtendsClass(parent);
      if (!wasSet)
      {
        Position pos;
        try
        {
          pos = extendsToken.get(i).getPosition();
        }
        catch(Exception e)
        {
          pos = new Position("",0,0,0);
        }
        setFailedPosition(pos, 16, child.getName(), parent.getName());
        child.setExtendsToken(extendsToken.get(i));     //Issue 543
        return;
      }
      try
      {
        child.setExtendsToken(extendsToken.get(i));
        checkExtendsClass();                            //Issue 543
      }
      catch(Exception e){}
          }
        }
        else
        {
          UmpleInterface uInterface=  model.getUmpleInterface(extendName);
          child.addParentInterface(uInterface);
        }
      }
    }
    for(UmpleClass uClass: getModel().getUmpleClasses()) {
        addImplementedMethodsFromInterface(getAllParentInterface(uClass), uClass);
    }
  }

  // line 1744 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addUnlinkedKeys(){
    // If a dependency cycle exists, then we can't add keys
     List<ErrorMessage> errors = getParseResult().getErrorMessages();
     for (ErrorMessage err: errors)
     {
        int code = err.getErrorType().getErrorCode();
        if (code == 11 || code == 12)
        {
            return;
        }
    }

    for (UmpleClass c : unlinkedKeysTokens.keySet())
    {   
        List<Token>  keyTokens = unlinkedKeysTokens.get(c);
        List<String> tokensAdded = new ArrayList<String>();
        if (keyTokens == null || keyTokens.isEmpty())
        {
            continue;
        }

        Boolean tokenMatch;
        for (Token token: keyTokens)
        {
            tokenMatch = false;
            String tokenVal = token.getValue();
            String finalTokenVal = token.getValue();

            // Check the current class and it's inherited classes for the Attribute
            UmpleClass classSearch = c;
            Attribute att = classSearch.getAttribute(tokenVal);
            if (att != null)
            {
                tokenMatch = true;
                // throw warning if attribute is initialized
                if (att.getValue() != null && !("null".equals(att.getValue()) || att.getIsDerived()))
                {
                    setFailedPosition(token.getPosition(), 45, att.getName(), c.getName());
                }
            }

            if (c.hasAssociations())
            {
                AssociationEnd secondEnd;
                String secondEndName;

                for(Association aAssociation : c.getAssociations())
                { 
                    secondEnd = aAssociation.getEnd(1);
                    secondEndName = secondEnd.getRoleName();        

                    // tokenVal with a lower-case first letter.
                    String firstLower = Character.toLowerCase(tokenVal.charAt(0)) + (tokenVal.length() > 1 ? tokenVal.substring(1) : "");
          
                    if(secondEndName.equals(firstLower))
                    {
                        finalTokenVal = firstLower;
                        tokenMatch = true;
                        break;
                    }
                }
            }
            Label_StateMachine_89: ;
          
          if(c instanceof AssociationClass) 
          {
                AssociationClass assocClass = (AssociationClass) c;
                String endName;

                for(Association associatedTo: assocClass.getAssociatedTo()) 
                {
                    endName = associatedTo.getEnd(1).getRoleName();

                    // tokenVal with a lower-case first letter.
                    String firstLower = Character.toLowerCase(tokenVal.charAt(0)) + (tokenVal.length() > 1 ? tokenVal.substring(1) : "");

                    if(endName.equals(firstLower))
                    {
                        finalTokenVal = firstLower;
                        tokenMatch = true;
                        break;
                    }
                }
            }

            if(!tokenMatch)
            {
                setFailedPosition(token.getPosition(), 27, tokenVal, c.getName());
            }
            c.getKey().addMember(finalTokenVal);
            tokensAdded.add(finalTokenVal);
        }

        //Issue 610: Associaton Classes with incomplete keys must issue warning 1011
        if(c instanceof AssociationClass)
        {
            AssociationClass assocClass = (AssociationClass) c;
            String endName;

            for(Association associatedTo : assocClass.getAssociatedTo()) 
            {
                endName = associatedTo.getEnd(1).getRoleName();

                if(!tokensAdded.contains(endName)) 
                {
                    Token parent = keyTokens.get(0).getParentToken();
                    setFailedPosition(parent.getPosition(), 1011, c.getName(), endName, tokensAdded.toString());
                }
            }
        }
    }
  }

  // line 1858 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private java.util.List<UmpleInterface> getAllParentInterface(UmpleClass uClass){
    java.util.ArrayList<UmpleInterface> temp = new java.util.ArrayList<UmpleInterface>(uClass.getParentInterface());
    java.util.ArrayList<UmpleClass> uClassChain = new java.util.ArrayList<UmpleClass>();

    for (UmpleClass uClassCurrent = uClass; uClassCurrent != null && !uClassChain.contains(uClassCurrent); uClassCurrent = uClassCurrent.getExtendsClass())
    {
      uClassChain.add(uClassCurrent);
      for (UmpleInterface uInterface : uClassCurrent.getParentInterface())
      {
        if (!temp.contains(uInterface))
        {
          temp.add(uInterface);
        }
      }
    }

    return temp;
  }

  // line 1878 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addImplementedMethodsFromInterface(List<UmpleInterface> parentInterfaces, UmpleClass uClass){
    //GET AND SET METHODS CHECK?
    // Fix issue 992
    List<UmpleInterface> ancestorInterfaces = new Vector<UmpleInterface>();
    Stack<UmpleInterface> toProcess = new Stack<UmpleInterface>();
    toProcess.addAll(parentInterfaces);
    ancestorInterfaces.addAll(parentInterfaces);
    
    while(!toProcess.isEmpty())
    {
      parentInterfaces  = toProcess.pop().getExtendsInterface();
      toProcess.addAll(parentInterfaces);
      ancestorInterfaces.addAll(parentInterfaces);
    }
    
    for (UmpleInterface pi : ancestorInterfaces)
    {
      if (pi.hasMethods())
      {
        for (Method aMethod : pi.getMethods())
        {
          boolean shouldAddMethod = !isConstructorOrGetSet(uClass, aMethod, true);
          boolean hasMethodTraitsCheck = true;
          
hasMethodTraitsCheck = !(uClass.hasMethodInTraits(aMethod));
Label_Trait_90: ;
 

          if (!(uClass.hasImplementedMethodIncludingWithinParentClasses(aMethod))
          && hasMethodTraitsCheck && !(uClass.isIsAbstract()) && shouldAddMethod)
          {
            aMethod.setIsImplemented("".equals(aMethod.getMethodBody().getExtraCode("")));
            aMethod.setSource(Method.Source.fAuto);
            uClass.addMethod(aMethod);
          }
        }
      }
    }
  }


  /**
   * Used to determine if a method is a contructor or a getter/setter.
   * 
   * @param uClass The Umple class for which the method is contained.
   * @param aMethod The method which is contained within the Umple class.
   * 
   * @return True if the method is a constructor, getter/setter, false otherwise.
   */
  // line 1925 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean isConstructorOrGetSet(UmpleClass uClass, Method aMethod, boolean checkingInInterface){
    //1. Check if method is a getter or setter
    if (uClass.hasMethod(aMethod) && isGetterSetter(uClass.getMethod(aMethod)))
      return true;
    //2. Verify if method to be added is a constructor
    if (aMethod.getType().equals("public"))
    {
      uClass.appendExtraCode(aMethod.toString());
      return true;
    }  
    //3. Verify if method from interface is already part of the Class extracode
    String match = "public " + aMethod.getType() + " " + aMethod.getName();    
    if (uClass.getExtraCode().contains(match))
      return true;
    //4. Check if method is an association method #834
    if (uClass.hasMethod(aMethod) && isAssociationMethod(uClass, uClass.getMethod(aMethod)))
      return true;
    return false;
  }

  // line 1945 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean isGetterSetter(Method method){
    if (method.getName().length() <= 2)
      return false;
    String accessorName = method.getName().substring(0,3);
    return ((accessorName.equals("get")) || (accessorName.equals("set"))) && method.getSource() == Method.Source.fAutoAPI && !method.getIsConstructor();
  }

  // line 1952 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean isAssociationMethod(UmpleClass uClass, Method method){
    if (method.getName().length() <= 2 || !uClass.hasAssociations() || method.getIsConstructor() || method.getSource() != Method.Source.fAutoAPI)
      return false;
    String methodName = method.getName();
    boolean isAssociationMethod = methodName.startsWith("get") || methodName.startsWith("set") || methodName.startsWith("add") || methodName.startsWith("remove") || methodName.startsWith("addOrMove") || methodName.startsWith("has") || methodName.startsWith("indexOf") || methodName.startsWith("minimumNumberOf") || methodName.startsWith("maximumNumberOf") || methodName.startsWith("requiredNumberOf") || methodName.startsWith("isNumberOf");

    return isAssociationMethod;
  }


  /**
   * Same association in subclass with a different role name should emit
   * error 19.
   * class A {
   * 1 sth1 -- * C;
   * }
   * class B {
   * isA A;
   * 1 sth2 -- * C;
   * }
   * class C {
   * }
   */
  // line 1972 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkSubclassSameAssociationDifferentRoleNames(){
    for (UmpleClass uClass : model.getUmpleClasses())
    {
      List<String> visitedSupers = new ArrayList<String>();
      UmpleClass superClass = uClass.getExtendsClass();

      while (superClass != null)
      {
        // Prevent cycles.
        if (visitedSupers.contains(superClass.getName()))
        {
          break;
        }
        if (superClass.getIsAbstract()) {
          break;
        }

        visitedSupers.add(superClass.getName());

        for (AssociationVariable assocVar : uClass.getAssociationVariables()) {
          // Test whether the super class has the 
          AssociationVariable supAssocVar = superClass.getAssociationVariable(assocVar.getType(), assocVar.getName());
          if (supAssocVar == null) continue;
        
          // The modifiable reference to the current association variable
          AssociationVariable curAssocVar = uClass.getAssociationVariable(assocVar.getType(), assocVar.getName());

          Association curAssoc = uClass.getAssociation(uClass.indexOfAssociationVariable(curAssocVar));
          Association supAssoc = superClass.getAssociation(superClass.indexOfAssociationVariable(supAssocVar));

          AssociationEnd curLeftEnd = curAssoc.getEnd(0);
          AssociationEnd curRightEnd = curAssoc.getEnd(1);
          AssociationEnd supLeftEnd = supAssoc.getEnd(0);
          AssociationEnd supRightEnd = supAssoc.getEnd(1);

          AssociationEnd curMyEnd, curOtherEnd;
          AssociationEnd supMyEnd, supOtherEnd;

          // Find out "MyEnd" and "OtherEnd"
          if (curLeftEnd.getRoleName().equals(curAssocVar.getName())
            && curLeftEnd.getClassName().equals(curAssocVar.getType())) {
              curMyEnd = curRightEnd;
              curOtherEnd = curLeftEnd;
          } else {
            curMyEnd = curLeftEnd;
            curOtherEnd = curRightEnd;
          }

          if (supLeftEnd.getRoleName().equals(supAssocVar.getName())
            && supLeftEnd.getClassName().equals(supAssocVar.getType())) {
              supMyEnd = supRightEnd;
              supOtherEnd = supLeftEnd;
          } else {
            supMyEnd = supLeftEnd;
            supOtherEnd = supRightEnd;
          }

          // test the name of "MyEnd"
          if (curMyEnd.getRoleName().equals(supMyEnd.getRoleName())) {
            continue;
          }

          // test multiplicity of both associations
          Multiplicity curMyMultiplicity = curMyEnd.getMultiplicity();
          Multiplicity curOtherMultiplicity = curOtherEnd.getMultiplicity();
          Multiplicity supMyMultiplicity = supMyEnd.getMultiplicity();
          Multiplicity supOtherMultiplicity = supOtherEnd.getMultiplicity();

          if (curMyMultiplicity.getLowerBound() != supMyMultiplicity.getLowerBound()
            || curMyMultiplicity.getUpperBound() != supMyMultiplicity.getUpperBound()
            || curOtherMultiplicity.getLowerBound() != supOtherMultiplicity.getLowerBound()
            || curOtherMultiplicity.getUpperBound() != supOtherMultiplicity.getUpperBound()) {
            continue;
          }

          getParseResult().addErrorMessage(new ErrorMessage(19, curAssoc.getTokenPosition(), curMyEnd.getClassName(), curOtherEnd.getClassName()));
        }
        superClass = superClass.getExtendsClass();
      }
    }
  }


  /**
   * Some associations should be ingnored
   * Example:
   * class A {
   * 1 -- * C;
   * }
   * class B {
   * isA A;
   * 1 -- * C;
   * }
   * class C {
   * }
   * Then the association in B should be ignored.
   */
  // line 2066 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkIgnoredAssociations(){
    for (UmpleClass uClass : model.getUmpleClasses())
    {
      List<String> visitedSupers = new ArrayList<String>();
      UmpleClass superClass = uClass.getExtendsClass();

      String[] uClassAssocVarNames = new String[uClass.numberOfAssociationVariables()];
      String[] uClassAssocVarClassNames = new String[uClass.numberOfAssociationVariables()];
      int numCurAssocVar = 0;
      for (AssociationVariable curAssocVar : uClass.getAssociationVariables()) {
        uClassAssocVarNames[numCurAssocVar] = curAssocVar.getName();
        uClassAssocVarClassNames[numCurAssocVar] = curAssocVar.getType();
        numCurAssocVar = numCurAssocVar + 1;
      }

      while (superClass != null)
      {
        // Prevent cycles.
        if (visitedSupers.contains(superClass.getName()))
        {
          break;
        }
        if (superClass.getIsAbstract()) {
          break;
        }

        visitedSupers.add(superClass.getName());

        for (int i=0; i < numCurAssocVar; i++) {
          AssociationVariable curAssocVar = uClass.getAssociationVariable(uClassAssocVarClassNames[i], uClassAssocVarNames[i]);

          AssociationVariable supAssocVar = superClass.getAssociationVariable(curAssocVar.getType(), curAssocVar.getName());
          if (supAssocVar == null) continue;

          Association curAssoc = uClass.getAssociation(uClass.indexOfAssociationVariable(curAssocVar));
          Association supAssoc = superClass.getAssociation(superClass.indexOfAssociationVariable(supAssocVar));

          AssociationEnd curLeftEnd = curAssoc.getEnd(0);
          AssociationEnd curRightEnd = curAssoc.getEnd(1);
          AssociationEnd supLeftEnd = supAssoc.getEnd(0);
          AssociationEnd supRightEnd = supAssoc.getEnd(1);

          AssociationEnd curMyEnd, curOtherEnd;
          AssociationEnd supMyEnd, supOtherEnd;

          // Find out "MyEnd" and "OtherEnd"
          if (curRightEnd.getRoleName().equals(supRightEnd.getRoleName())
            && curRightEnd.getClassName().equals(supRightEnd.getClassName())) {
              curMyEnd = curLeftEnd;
              curOtherEnd = curRightEnd;
              supMyEnd = supLeftEnd;
              supOtherEnd = supRightEnd;
          } else if (curLeftEnd.getRoleName().equals(supRightEnd.getRoleName())
            && curLeftEnd.getClassName().equals(supRightEnd.getClassName())) {
              curMyEnd = curRightEnd;
              curOtherEnd = curLeftEnd;
              supMyEnd = supLeftEnd;
              supOtherEnd = supRightEnd;
          } else if (curRightEnd.getRoleName().equals(supLeftEnd.getRoleName())
            && curRightEnd.getClassName().equals(supLeftEnd.getClassName())) {
              curMyEnd = curLeftEnd;
              curOtherEnd = curRightEnd;
              supMyEnd = supRightEnd;
              supOtherEnd = supLeftEnd;
          } else if (curLeftEnd.getRoleName().equals(supLeftEnd.getRoleName())
            && curLeftEnd.getClassName().equals(supLeftEnd.getClassName())) {
              curMyEnd = curRightEnd;
              curOtherEnd = curLeftEnd;
              supMyEnd = supRightEnd;
              supOtherEnd = supLeftEnd;
          } else {
            continue;
          }

          // test the type of "MyEnd"
          if (!curMyEnd.getClassName().equals(uClass.getName())
            || !supMyEnd.getClassName().equals(superClass.getName())) {
            continue;
          }

          // test the role name of "MyEnd"
          if (!(curMyEnd.getIsDefaultRoleName() && supMyEnd.getIsDefaultRoleName())
            && !curMyEnd.getRoleName().equals(supMyEnd.getRoleName())) {
            continue;
          }

          // test multiplicity of both associations
          Multiplicity curMyMultiplicity = curMyEnd.getMultiplicity();
          Multiplicity curOtherMultiplicity = curOtherEnd.getMultiplicity();
          Multiplicity supMyMultiplicity = supMyEnd.getMultiplicity();
          Multiplicity supOtherMultiplicity = supOtherEnd.getMultiplicity();

          if (curMyMultiplicity.getLowerBound() != supMyMultiplicity.getLowerBound()
            || curMyMultiplicity.getUpperBound() != supMyMultiplicity.getUpperBound()
            || curOtherMultiplicity.getLowerBound() != supOtherMultiplicity.getLowerBound()
            || curOtherMultiplicity.getUpperBound() != supOtherMultiplicity.getUpperBound()) {
            continue;
          }

          // find the associated class
          UmpleClass associatedClass = model.getUmpleClass(curOtherEnd.getClassName());
          AssociationVariable associatedAV = associatedClass.getAssociationVariable(curMyEnd.getClassName(), curMyEnd.getRoleName());
          if (associatedAV == null) {
            continue;
          }
          Association associatedAssociation = associatedClass.getAssociation(associatedClass.indexOfAssociationVariable(associatedAV));
          
          uClass.removeAssociation(curAssoc);
          uClass.removeAssociationVariable(curAssocVar);
          associatedClass.removeAssociation(associatedAssociation);
          associatedClass.removeAssociationVariable(associatedAV);
        }
        superClass = superClass.getExtendsClass();
      }
    }
  }

  // line 2184 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void createSpecializedLinks(){
    // Don't do it if we have already detected cycles
     List<ErrorMessage> errors = getParseResult().getErrorMessages();
     for (ErrorMessage err: errors)
     {
        int code = err.getErrorType().getErrorCode();
        if (code == 11 || code == 12)
        {
            return;
        }
    }  
  
    ArrayList<Association> visited = new ArrayList<Association>();
    Boolean boundsOK, subclassOK, namesOK, reverseEnds;
    String aLName, aRName, bLName, bRName;
    ArrayList<String> leftHierarchy, rightHierarchy;
    UmpleClass currentLeftClass, currentRightClass, parentLeftClass, parentRightClass;
    AssociationEnd bLeftEnd, bRightEnd, aLeftEnd, aRightEnd;
    for (Association A : model.getAssociations())
    {
      if (A.getIsSpecialization())
      {
        continue;
      }
      
      aLeftEnd = A.getEnd(0);
      aRightEnd = A.getEnd(1);
      
      // symmetric reflexive? no thanks -- not a specializable case (see below -- A -- A twice)
      if (aLeftEnd.getClassName().equals(aRightEnd.getClassName()))
      {
        continue;
      }
     
      aLName = aLeftEnd.getRoleName();
      aRName = aRightEnd.getRoleName();
      
      // If one of the ends of the association are to a trait or an interface, the logic currently falls apart.
      // Given that, we will skip these two situations.
      if (model.getUmpleInterface(aLeftEnd.getClassName()) != null || model.getUmpleInterface(aRightEnd.getClassName()) != null)
      {
        continue;
      }
      
if (model.getUmpleTrait(aLeftEnd.getClassName()) != null || model.getUmpleTrait(aRightEnd.getClassName()) != null)
        {
          continue;
        }
Label_Trait_91: ;


      for (Association B : visited)
      {  
      
        if (B.getIsSpecialization())
        {
          continue;
        }
      
        leftHierarchy = new ArrayList<String>();
        rightHierarchy = new ArrayList<String>();
      
        bLeftEnd = B.getEnd(0);
        bRightEnd = B.getEnd(1);
        bLName = bLeftEnd.getRoleName();
        bRName = bRightEnd.getRoleName();

        // if either end is an interface or a trait, continue (see above)
        if (model.getUmpleInterface(bLeftEnd.getClassName()) != null || model.getUmpleInterface(bRightEnd.getClassName()) != null)
  {
          continue;
        }
        
if (model.getUmpleTrait(bLeftEnd.getClassName()) != null || model.getUmpleTrait(bRightEnd.getClassName()) != null)
          {
            continue;
          }
Label_Trait_92: ;

 
        // if A -- B twice, we don't want that.
        if (aLeftEnd.getClassName().equals(bLeftEnd.getClassName()) && aRightEnd.getClassName().equals(bRightEnd.getClassName()))
        {
          continue;
        }
        
        // reset the appropriate booleans
        namesOK = false;
        boundsOK = false;
        subclassOK = false;
        reverseEnds = false;
        
        // build class hierarchy lists
        currentLeftClass = model.getUmpleClass(aLeftEnd.getClassName());
        parentLeftClass = currentLeftClass.getExtendsClass();
        currentRightClass = model.getUmpleClass(aRightEnd.getClassName());
        parentRightClass = currentRightClass.getExtendsClass();
        
        leftHierarchy.add(currentLeftClass.getName());
        rightHierarchy.add(currentRightClass.getName());
        
        while (parentLeftClass != null && !parentLeftClass.getIsAbstract())
        {
          leftHierarchy.add(parentLeftClass.getName());
          parentLeftClass = parentLeftClass.getExtendsClass();
        }
        
        while (parentRightClass != null && !parentRightClass.getIsAbstract())
        {
          rightHierarchy.add(parentRightClass.getName());
          parentRightClass = parentRightClass.getExtendsClass();
        }
        
        parentRightClass = model.getUmpleClass(bRightEnd.getClassName());
        parentLeftClass = model.getUmpleClass(bLeftEnd.getClassName());
        
        if ( leftHierarchy.contains(parentLeftClass.getName()) && rightHierarchy.contains(parentRightClass.getName()))
        {
          subclassOK = true;
        } 
        else if (rightHierarchy.contains(parentLeftClass.getName()) && leftHierarchy.contains(parentRightClass.getName()))
        {
          reverseEnds = true;
          subclassOK = true;
        }       

        if (!subclassOK) {
          continue;
        }

        // now we need to see if the names match
        if (!reverseEnds) {
          if ((aLName.equals(bLName) || (aLeftEnd.getIsDefaultRoleName() && bLeftEnd.getIsDefaultRoleName()))
            && (aRName.equals(bRName) || (aRightEnd.getIsDefaultRoleName() && bRightEnd.getIsDefaultRoleName()))) {
            namesOK = true;
          }
        } else {
          if ((aLName.equals(bRName) || (aLeftEnd.getIsDefaultRoleName() && bRightEnd.getIsDefaultRoleName()))
            && (aRName.equals(bLName) || (aRightEnd.getIsDefaultRoleName() && bLeftEnd.getIsDefaultRoleName()))) {
            namesOK = true;
          }
        }

        if (!namesOK) {
          continue;
        }

        // Align the left and right ends before doing bound check
        AssociationEnd aFirstEnd, aSecondEnd, bFirstEnd, bSecondEnd;
        if (!reverseEnds) {
          aFirstEnd = aLeftEnd;
          aSecondEnd = aRightEnd;
          bFirstEnd = bLeftEnd;
          bSecondEnd = bRightEnd;
        } else {
          aFirstEnd = aLeftEnd;
          aSecondEnd = aRightEnd;
          bFirstEnd = bRightEnd;
          bSecondEnd = bLeftEnd;
        }

        int a1LB, a1UB, a2LB, a2UB, b1LB, b1UB, b2LB, b2UB;
        a1LB = aFirstEnd.getMultiplicity().getLowerBound();
        a1UB = aFirstEnd.getMultiplicity().getUpperBound();
        a2LB = aSecondEnd.getMultiplicity().getLowerBound();
        a2UB = aSecondEnd.getMultiplicity().getUpperBound();

        b1LB = bFirstEnd.getMultiplicity().getLowerBound();
        b1UB = bFirstEnd.getMultiplicity().getUpperBound();
        b2LB = bSecondEnd.getMultiplicity().getLowerBound();
        b2UB = bSecondEnd.getMultiplicity().getUpperBound();

        Boolean firstLowerBoundOK, firstUpperBoundOK, secondLowerBoundOK, secondUpperBoundOK;
        firstLowerBoundOK = false;
        firstUpperBoundOK = false;
        secondLowerBoundOK = false;
        secondUpperBoundOK = false;
        
        firstLowerBoundOK = (b1LB <= a1LB);
        firstUpperBoundOK = (b1UB >= a1UB);
        secondLowerBoundOK = (b2LB <= a2LB);
        secondUpperBoundOK = (b2UB >= a2UB);

        Boolean firstMulChToOne = false;
        Boolean secondMulChToOne = false;
        Boolean firstMulChToN = false;
        Boolean secondMulChToN = false;
        Boolean firstNeedsSetCode = false;
        Boolean secondNeedsSetCode = false;

        if (b1UB != 1 && a1UB == 1)
          firstMulChToOne = true;
          
        if (b2UB != 1 && a2UB == 1)
          secondMulChToOne = true;
          
        if (a1UB == a1LB && b1LB == 0 && b1UB > 1) //  && aLUB > 1
          firstMulChToN = true;
          
        if (a2UB == a2LB && b2LB == 0 && b2UB > 1) //  && aRUB > 1
          secondMulChToN = true;
            
        // changed to MN (or M*) -- this may need to change when set method generation is fixed   
        if (a1UB >= a1LB && a1LB != 0 && a1UB > 1 && ((b1LB == 0 && b1UB > 1) || b1UB == -1))
          firstMulChToN = true;
        
        // changed to MN (or M*)
        if (a2UB >= a2LB && a2LB != 0 && a2UB > 1 && ((b2LB == 0 && b2UB > 1) || b2UB == -1))
          secondMulChToN = true;    
           
        // special case for * multiplicity
        if ( b1UB == -1 ) 
        { 
          firstUpperBoundOK = true;
        }
        
        if ( b2UB == -1 ) 
        { 
          secondUpperBoundOK = true;

        }
        
        if ( b1UB == -1 || (b1LB == 0 && b1UB != 1))
        { 
          secondNeedsSetCode = true;
        } 
        
        if ( b2UB == -1 || (b2LB == 0 && b2UB != 1))
        {
          firstNeedsSetCode = true;
        }
                  
        // if all bounds OK, set boolean to true
        if (firstLowerBoundOK && secondLowerBoundOK && firstUpperBoundOK && secondUpperBoundOK)
        {
          boundsOK = true;
        }
        
        if ( subclassOK && namesOK && boundsOK )
        {
          // then it's a redefinition
          // so B is a parent
          aFirstEnd.setSuperClassName(bFirstEnd.getClassName());
          aSecondEnd.setSuperClassName(bSecondEnd.getClassName());

          // Refer to the Association Specialization manual page --
          // There are 2 cases for specialized code:
          // 1- either the class will need code from it's superclass
          // 2- or it will need code from it's own class
          // 1- the case of A -- B and Aa -- B where Aa isA A, Aa will need super code
          // 2- in the same case, B will need common code.
          // *- int he A -- B, Aa -- Bb case, where Bb isA B, they both need super code.

          // Checks class names for information relevant to the above.
          if (aFirstEnd.getClassName().equals(bFirstEnd.getClassName()))
          {
            // i.e. same name as parent, so common code is required.
            aSecondEnd.setNeedsCommonCode(true);
            UmpleClass commonClass = model.getUmpleClass(aFirstEnd.getClassName());
            AssociationVariable specializedAv = commonClass.getAssociationVariable(aSecondEnd.getClassName(), aSecondEnd.getRoleName());
            AssociationVariable fromAv = commonClass.getAssociationVariable(bSecondEnd.getClassName(), bSecondEnd.getRoleName());
            specializedAv.setSpecializedFromVariable(fromAv);
          }
          else
          {
            aSecondEnd.setNeedsSuperCode(true);
          }
          
          // need to check both ends...
          if (aSecondEnd.getClassName().equals(bSecondEnd.getClassName()))
          {
            aFirstEnd.setNeedsCommonCode(true);
            UmpleClass commonClass = model.getUmpleClass(aSecondEnd.getClassName());
            AssociationVariable specializedAv = commonClass.getAssociationVariable(aFirstEnd.getClassName(), aFirstEnd.getRoleName());
            AssociationVariable fromAv = commonClass.getAssociationVariable(bFirstEnd.getClassName(), bFirstEnd.getRoleName());
            specializedAv.setSpecializedFromVariable(fromAv);
          }
          else
          {
            aFirstEnd.setNeedsSuperCode(true);
          }
          
          // -- probably legacy, comment out and see if it breaks.
          if (bFirstEnd.getClassName().equals(aFirstEnd.getClassName()))
          {
            A.setCommonClassName(bFirstEnd.getClassName());
          }
          else if (bSecondEnd.getClassName().equals(aSecondEnd.getClassName()))
          {
            A.setCommonClassName(bSecondEnd.getClassName());
          }
          
          aFirstEnd.setMulChangedToOne(firstMulChToOne);
          aSecondEnd.setMulChangedToOne(secondMulChToOne);
          
          aFirstEnd.setMulChangedToN(firstMulChToN);
          aSecondEnd.setMulChangedToN(secondMulChToN);
          
          aFirstEnd.setReqSetCode(firstNeedsSetCode);
          aSecondEnd.setReqSetCode(secondNeedsSetCode);
          
          B.setIsSpecialized(true);
          B.addSpecializedAssociation(A);
          
          A.setIsSpecialization(true);
          A.setSpecializedFrom(B);
        }
        
      }
      
      visited.add(A);
    }
  }


  /**
   * Issue #961. Ensure that all superclasses and subclasses do not have associations to two different
   * classes that use the same role name, and is not a specialization.
   */
  // line 2491 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkDuplicateAssociationNamesClassHierarchy(){
    for (UmpleClass uClass : model.getUmpleClasses())
    {
      List<String> visitedSupers = new ArrayList<String>();
      UmpleClass superClass = uClass.getExtendsClass();

      while (superClass != null)
      {
        // Prevent cycles.
        if (visitedSupers.contains(superClass.getName()))
        {
          break;
        }
        visitedSupers.add(superClass.getName());
        
        ArrayList<String> duplicateNames = new ArrayList<String>();

        for(Association assoc : uClass.getAssociations())
        {
          AssociationEnd assocEnd = getDifferingEnd(assoc, uClass.getName());
          
          ArrayList<String> existingNames = new ArrayList<String>();
          
          String roleName = assocEnd.getRoleName();
          
          // Check only associations that have a user-defined role name, and is not a specialization.
          if (!assocEnd.getIsDefaultRoleName() && !assoc.getIsSpecialization() && !duplicateNames.contains(roleName))
          {
            for (Association superAssoc : superClass.getAssociations())
            {
              AssociationEnd superAssocEnd = getDifferingEnd(superAssoc, superClass.getName());
              String superAssocRoleName = superAssocEnd.getRoleName();
              
              if (superAssocEnd != null && superAssocRoleName.equals(roleName) &&
                  !existingNames.contains(superAssocRoleName) && !superAssocEnd.getClassName().equals(assocEnd.getClassName()))
              {
                getParseResult().addErrorMessage(new ErrorMessage(180,assoc.getTokenPosition(),
                  uClass.getName(),superClass.getName(),roleName));
                duplicateNames.add(roleName);
              }
              existingNames.add(superAssocRoleName);
            }
          }
        }
        superClass = superClass.getExtendsClass();
      }
    }
  }


  /**
   * Get the end of an association opposite to the given class. If the association is reflexive,
   * return the end with a user defined role name.
   */
  // line 2543 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private AssociationEnd getDifferingEnd(Association assoc, String className){
    AssociationEnd firstEnd = assoc.getEnd(0);
    AssociationEnd secondEnd = assoc.getEnd(1);
     
    Boolean checkFirstEnd = !firstEnd.getClassName().equals(className);
    Boolean checkSecondEnd = !secondEnd.getClassName().equals(className);
    
    if (!checkFirstEnd && !checkSecondEnd)
    {
      // Association is reflexive. Both ends are the same, but we want the one with a user defined role name.
      if (!firstEnd.getIsDefaultRoleName())
      {
        return firstEnd;
      }
      return secondEnd;
    }
    
    if (checkFirstEnd)
    {
      return firstEnd;
    }
    return secondEnd;
  }

  // line 2569 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkDuplicateAssociationNames(){
    for(UmpleClass C : model.getUmpleClasses())
    {
      // Create the list of attribute names (for issue 272)
      List<String> existingAttributeNames = new ArrayList<String>();
      for (Attribute attr : C.getAttributes())
      {
              existingAttributeNames.add(attr.getName());
      }
      
      Boolean roleMatchesClassName, hasMultipleAssocToSameClass, isSymmetricReflexive;
      List<String> classesWithAssociationsToCurrClass = new ArrayList<String>();
      List<String> roleNameSameAsClassName = new ArrayList<String>();
      List<String> existingNames = new ArrayList<String>();
      List<Association> visitedAssociations = new ArrayList<Association>();
      for(Association assoc : C.getAssociations())
      {  
        roleMatchesClassName = false;
        hasMultipleAssocToSameClass = false;

        if (visitedAssociations.contains(assoc))
        {
          continue;
        }

        AssociationEnd firstEnd = assoc.getEnd(0);
        AssociationEnd secondEnd = assoc.getEnd(1); 

      if ( assoc.getIsSpecialization() )
        {
        //getParseResult().addErrorMessage(new ErrorMessage(400,assoc.getTokenPosition(),C.getName(),firstEnd.getRoleName()));
          continue;
        }         
                
        isSymmetricReflexive = firstEnd.getModifier().equals("symmetricreflexive") || secondEnd.getModifier().equals("symmetricreflexive");

        Boolean checkFirstEnd = !firstEnd.getClassName().equals(C.getName());
        Boolean checkSecondEnd = !secondEnd.getClassName().equals(C.getName());
        Boolean associationIsReflexive = !checkFirstEnd && !checkSecondEnd;
        
        //issue 288: firstEnd of association does not indicate current (this) class being analyzed.
        //If association is NOT reflexive, must check the differing class.  Check if role name
        //matches class name, but only if it is a user entered role name.  Current class must
        //also have multiple associations to the same class to cause java compile errors.  
        if(!associationIsReflexive && C.numberOfAssociations() > 1)
        { 
          //check the differing class
          if(checkFirstEnd)
          {
            if(roleNameSameAsClassName.contains(firstEnd.getClassName().toLowerCase()))
            {
              hasMultipleAssocToSameClass = true;   //flag error 19
            }
            //is a user-defined role name and rolename matches class name
            else if(firstEnd.getRoleName().toLowerCase().equals(firstEnd.getClassName().toLowerCase()) && !firstEnd.getIsDefaultRoleName())
            {    
              roleNameSameAsClassName.add(firstEnd.getRoleName().toLowerCase());
            }
            
            classesWithAssociationsToCurrClass.add(firstEnd.getClassName());
          }
          //check the differing class
          if(checkSecondEnd)
          {
            if(roleNameSameAsClassName.contains(secondEnd.getClassName().toLowerCase()))
            {
              hasMultipleAssocToSameClass = true;  //flag error 19
            }
            //is a user-defined role name and rolename matches class name
            else if(secondEnd.getRoleName().toLowerCase().equals(secondEnd.getClassName().toLowerCase()) && !secondEnd.getIsDefaultRoleName())
            {    
              roleNameSameAsClassName.add(secondEnd.getRoleName().toLowerCase());
            }
            
            classesWithAssociationsToCurrClass.add(secondEnd.getClassName());          
          }
        }

        // check names on other-class end of associations to other classes
        if (!isSymmetricReflexive && (checkFirstEnd || associationIsReflexive) && assoc.getIsLeftNavigable())
        { 
          if (existingNames.contains(firstEnd.getRoleName()) || hasMultipleAssocToSameClass)
          {
            getParseResult().addErrorMessage(new ErrorMessage(19,assoc.getTokenPosition(),firstEnd.getClassName(), C.getName()));
            return;
          }
          else if (existingAttributeNames.contains(firstEnd.getRoleName()))
          {  // Check if the association name is the same as an attribute name
             getParseResult().addErrorMessage(new ErrorMessage(23,assoc.getTokenPosition(),C.getName(),firstEnd.getRoleName()));
             return;
          }
          else
          {
            existingNames.add(firstEnd.getRoleName());
          }
        }
        if (!isSymmetricReflexive && (checkSecondEnd || associationIsReflexive) && assoc.getIsRightNavigable())
        {
          if (existingNames.contains(secondEnd.getRoleName()) || hasMultipleAssocToSameClass)
          {
            getParseResult().addErrorMessage(new ErrorMessage(19,assoc.getTokenPosition(), secondEnd.getClassName(), C.getName()));
            return;
          }
          else if (existingAttributeNames.contains(secondEnd.getRoleName()))
          {  // Check if the association name is the same as an attribute name
             getParseResult().addErrorMessage(new ErrorMessage(23,assoc.getTokenPosition(),C.getName(),secondEnd.getRoleName()));
             return;
          }
          else
          {
            existingNames.add(secondEnd.getRoleName());
          }
        }
        
        // Special case for symmetric reflexive associations. Since only one end of the association is given
        // a name, that one only needs to be checked, and the other needs to be ignored.
        if(isSymmetricReflexive)
        {
          String roleNameToCheck = firstEnd.getRoleName();

          if(roleNameToCheck.equals("") || roleNameToCheck == null)
          {
            roleNameToCheck = secondEnd.getRoleName();
          }

          if(existingNames.contains(roleNameToCheck))
          {
            getParseResult().addErrorMessage(new ErrorMessage(19,assoc.getTokenPosition(),C.getName(),roleNameToCheck));
            return;
          }
          else if(existingAttributeNames.contains(roleNameToCheck))
          {
            getParseResult().addErrorMessage(new ErrorMessage(23,assoc.getTokenPosition(),C.getName(),roleNameToCheck));
            return;
          }
          else
          {
            existingNames.add(roleNameToCheck);
          }
        }

        if (associationIsReflexive)
        { 
          // The UmpleClass is only expected to have duplicate references to reflexive associations
          visitedAssociations.add(assoc);
        }
      }
    }
  }

  // line 2720 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkSingletonAssociations(){
    for (Association association : model.getAssociations()) 
    {
      if (associationIsBetweenClassAndInterface (association)){continue;} 
      
if (associationIsBetweenClassAndTrait(association)){continue;}
Label_Trait_93: ;

      
      AssociationEnd myEnd = association.getEnd(0);
      AssociationEnd yourEnd = association.getEnd(1);

      
if(getModel().getUmpleTraitTypeParameter(myEnd.getClassName()) || getModel().getUmpleTrait(myEnd.getClassName())!=null) return ;
        if(getModel().getUmpleTraitTypeParameter(yourEnd.getClassName()) || getModel().getUmpleTrait(yourEnd.getClassName())!=null) return ;
Label_Trait_94: ;

    
    
      UmpleClass myClass = model.getUmpleClass(myEnd.getClassName());
      UmpleClass yourClass = model.getUmpleClass(yourEnd.getClassName());

      if (myClass.getIsSingleton() && (yourEnd.getMultiplicity().getRangeParts()[0].equals("1") && yourEnd.getMultiplicity().getRangeParts()[1].equals("1"))) 
      {
        yourEnd.getMultiplicity().setRange("0", "1");
        yourEnd.getMultiplicity().setBound(null);
        setFailedPosition(association.getTokenPosition(), 2, association.getName());  
      }

      if (yourClass.getIsSingleton() && (myEnd.getMultiplicity().getRangeParts()[0].equals("1") && myEnd.getMultiplicity().getRangeParts()[1].equals("1"))) 
      {
        myEnd.getMultiplicity().setRange("0", "1");
        myEnd.getMultiplicity().setBound(null);
        setFailedPosition(association.getTokenPosition(), 2, association.getName());
      }

      if(myClass.getIsSingleton() && (myEnd.getMultiplicity().getUpperBound() < 0 || myEnd.getMultiplicity().getUpperBound() > 1)) 
      {
        setFailedPosition(association.getTokenPosition(), 10, myEnd.getClassName());
      }

      if(yourClass.getIsSingleton() && (yourEnd.getMultiplicity().getUpperBound() < 0 || yourEnd.getMultiplicity().getUpperBound() > 1)) 
      {
        setFailedPosition(association.getTokenPosition(), 10, yourEnd.getClassName());
      }
    }
  }

  // line 2764 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addUnlinkedAssociations(){
    for (Association association : unlinkedAssociations)
    {         
      if (associationIsBetweenClassAndInterface (association)){continue;}  
       
if (associationIsBetweenClassAndTrait(association)){continue;}
Label_Trait_95: ;

      
      AssociationEnd myEnd = association.getEnd(0);
      AssociationEnd yourEnd = association.getEnd(1);

      UmpleClass myClass = model.getUmpleClass(myEnd.getClassName());
      UmpleClass yourClass = model.getUmpleClass(yourEnd.getClassName());
      
      AssociationVariable myAs = new AssociationVariable(myEnd.getRoleName(),myEnd.getClassName(),myEnd.getModifier(),null,myEnd.getMultiplicity(),association.getIsLeftNavigable());
      myAs.setIsComposition(association.getIsLeftComposition());
      AssociationVariable yourAs = new AssociationVariable(yourEnd.getRoleName(),yourEnd.getClassName(),yourEnd.getModifier(),null,yourEnd.getMultiplicity(),association.getIsRightNavigable());
      yourAs.setIsComposition(association.getIsRightComposition());

    myAs.setRelevantEnd(0);
    yourAs.setRelevantEnd(1);

    myAs.setIsSpecialized(association.getIsSpecialized());
    yourAs.setIsSpecialized(association.getIsSpecialized());
    myAs.setIsSpecialization(association.getIsSpecialization());
    yourAs.setIsSpecialization(association.getIsSpecialization());
    
    myAs.setSuperClassName(myEnd.getSuperClassName());
    yourAs.setSuperClassName(yourEnd.getSuperClassName());

    myAs.setNeedsCommonCode(myEnd.getNeedsCommonCode());
    myAs.setNeedsSuperCode(myEnd.getNeedsSuperCode());
    yourAs.setNeedsCommonCode(yourEnd.getNeedsCommonCode());
    yourAs.setNeedsSuperCode(yourEnd.getNeedsSuperCode());
        
      myAs.setRelatedAssociation(yourAs);
      
      if(!"".equals(myEnd.getPriority())) { myAs.setPriority(myEnd.getPriority()); }
      if(!"".equals(yourEnd.getPriority())) { yourAs.setPriority(yourEnd.getPriority()); }
      
      if (association.isImmutable())
      {
        boolean set = myAs.setImmutable();
        if (set) { yourAs.setImmutable(); }
        else
        {
          setFailedPosition(association.getTokenPosition(),17);
        }
      }
      
      boolean added = myClass.addAssociationVariable(yourAs);
      if (!added)
      {
        if (myClass.isImmutable()) { setFailedPosition(association.getTokenPosition(),17); }
        else { setFailedPosition(association.getTokenPosition(),13); }
        return;
      }
      myClass.addAssociation(association);

      added = yourClass.addAssociationVariable(myAs);
      if (!added)
      {
        if (myClass == yourClass) { setFailedPosition(association.getTokenPosition(),18); }
        else { setFailedPosition(association.getTokenPosition(),13); }
        return;
      }
      
      yourClass.addAssociation(association);

      if (myAs.getIsNavigable())
      {
        yourClass.addReferencedPackage(myClass.getPackageName());
      }

      if (yourAs.getIsNavigable())
      {
        myClass.addReferencedPackage(yourClass.getPackageName());
      }      

    }
  }

  // line 2846 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkSortedAssociations(){
    for (Association association : model.getAssociations()) 
    {
      if (associationIsBetweenClassAndInterface (association)){continue;}
      AssociationEnd myEnd = association.getEnd(0);
      AssociationEnd yourEnd = association.getEnd(1);

      UmpleClass myClass = model.getUmpleClass(myEnd.getClassName());
      UmpleClass yourClass = model.getUmpleClass(yourEnd.getClassName());

      String value;

      if(!"".equals(yourEnd.getPriority())){
        Attribute temp = yourClass.getAttribute(yourEnd.getPriority());
        if(temp != null)
        {
          if(Pattern.matches("Integer|Short|Long|Float|Double|String", temp.getType())) 
          {
            String attributeType = yourClass.getName();
            String priorityType = temp.getType();
            String sortedName = yourEnd.getPriority().substring(0,1).toUpperCase() + yourEnd.getPriority().substring(1);
            String php_codeblock = 
                "\n      function($x, $y)\n"+
                    "      {\n"+
                    "        return $x->get"+ sortedName +"() -\n"+ 
                    "               $y->get"+ sortedName +"();\n"+
                    "      }";  
            String java_codeblock = 
                "\n      Comparator.comparing(" + attributeType + "::get" + sortedName + ")";//java 8+ 

            Attribute priority = new Attribute(yourEnd.getRoleName()+"Priority","Comparator<" + attributeType +">", "", "", false, yourClass);
            CodeBlock cb = new CodeBlock();
            cb.setCode("Php", php_codeblock);
            cb.setCode("Java", java_codeblock);
            cb.setCode("Ruby", "\"\"");
            priority.setCodeblock(cb); 
            priority.setIsInternalTransient(true); 
            myClass.addAttribute(priority);
            myClass.setIsInternalSerializable(true);
            yourClass.setIsInternalSerializable(true);
          } 
          else
            setFailedPosition(association.getTokenPosition(), 24, yourEnd.getPriority(), myClass.getName());
        }
        else
          setFailedPosition(association.getTokenPosition(), 25, yourClass.getName(), yourEnd.getPriority());
      }

      if(!"".equals(myEnd.getPriority())){
        Attribute temp = myClass.getAttribute(myEnd.getPriority());
        if(temp != null)
        {
          if(Pattern.matches("Integer|Short|Long|Float|Double|String", temp.getType()))
          {
            String attributeType = myClass.getName() ;
            String priorityType = temp.getType();
            String sortedName = myEnd.getPriority().substring(0,1).toUpperCase() + myEnd.getPriority().substring(1);
            String php_codeblock = 
                "\n      function($x, $y)\n"+
                    "      {\n"+
                    "        return $x->get"+ sortedName +"() -\n"+ 
                    "               $y->get"+ sortedName +"();\n"+
                    "      }";  
            String java_codeblock = 
                "\n      Comparator.comparing(" + attributeType + "::get" + sortedName + ")";//java 8+  

            Attribute priority = new Attribute(myEnd.getRoleName()+"Priority","Comparator<" + attributeType +">", "", "", false, myClass);
            CodeBlock cb = new CodeBlock();
            cb.setCode("Php", php_codeblock);
            cb.setCode("Java", java_codeblock);
            cb.setCode("Ruby", "\"\"");
            priority.setCodeblock(cb); 
            priority.setIsInternalTransient(true); 
            yourClass.addAttribute(priority);
            yourClass.setIsInternalSerializable(true);
            myClass.setIsInternalSerializable(true);
          }  
          else
            setFailedPosition(association.getTokenPosition(), 24, myEnd.getPriority(), yourClass.getName());
        }
        else
          setFailedPosition(association.getTokenPosition(), 25, myClass.getName(), myEnd.getPriority());
      }
    }
  }

  // line 2932 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkClassInterfaceAssocations(Association a){
    if (associationIsBetweenClassAndInterface(a)){
       boolean hasCorrectArrow = !a.getIsLeftNavigable()&&a.getIsRightNavigable(); // Assocation has "->" arrow
       if (!hasCorrectArrow){
          setFailedPosition(a.getTokenPosition(), 20, a.getEnd(0).getClassName());
        }
      }
  }

  // line 2941 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkAbstractClassAssociations(Association a){
    boolean isBetweenClassAndAbstractClass = associationIsBetweenClassAndAbstractClass(a);
    boolean isBetweenAbstractClassAndClass = associationIsBetweenAbstractClassAndClass(a);
    
    if(isBetweenClassAndAbstractClass || isBetweenAbstractClassAndClass) {
      boolean hasCorrectArrow = false;
    
      if(isBetweenClassAndAbstractClass)
        hasCorrectArrow = !a.getIsLeftNavigable()&&a.getIsRightNavigable(); //association has "->" arrow
        
      if(isBetweenAbstractClassAndClass)
        hasCorrectArrow = a.getIsLeftNavigable()&&!a.getIsRightNavigable(); //association has "<-" arrow
      
      Multiplicity endAMultiplicity = a.getEnd(0).getMultiplicity();
      Multiplicity endBMultiplicity = a.getEnd(1).getMultiplicity();
      
      boolean lowerBoundGreaterThanZero = endAMultiplicity.getLowerBound() > 0 && endBMultiplicity.getLowerBound() > 0;
      if (!hasCorrectArrow && lowerBoundGreaterThanZero) {
        setFailedPosition(a.getTokenPosition(), 80, a.getEnd(0).getClassName());
      }
    }
  }

  // line 2964 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkAssociationsValidity(){
    for (Association a : model.getAssociations()){
      checkClassInterfaceAssocations(a);
      checkAbstractClassAssociations(a);
    }
  }


  /**
   * Analyzes a token flagged to be a method in which case the data that makes up the method will be populated into a
   * method instance and added to an Umple element (which could be an Umple class).
   * 
   * @param method The token flagged to be the method.
   * @param uElement The Umple element for which the method will be added.
   */
  // line 2978 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeMethod(Token method, UmpleElement uElement){
    analyzeMethod(method, uElement, false);
  }


  /**
   * Analyzes a token flagged to be a method in which case the data that makes up the method will be populated into a
   * method instance and added to an Umple element (which could be an Umple class).
   * 
   * Also returns the updated Method entity.
   * 
   * @param method The token flagged to be the method.
   * @param uElement The Umple element for which the method will be added.
   * @param isStatefulMethod True if the method is stateful and should not be added to the class element.
   * @return The updated Method entity.
   */
  // line 2993 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private Method analyzeMethod(Token method, UmpleElement uElement, boolean isStatefulMethod){
    String modifier = "";
    Method aMethod = new Method("","","",false);
  

    // Set method position
    aMethod.setPosition(method.getPosition());
    aMethod.setEndPosition(method.getEndPosition());
  
    // Add comments above the method to the method.
    for (Comment c : lastComments)
    {
      aMethod.addComment(c);
    }

    // Go through all the sub tokens of the "method token" to obtain details about it, using them to populate a method instance.
    List<String> langs = new ArrayList<String>();
    CodeBlock cb = new CodeBlock("");
    String iValue = null;
    Position iPosition = null;
  MethodBody meth = new MethodBody(cb);
    
    //559b
    Map<String,Position> implementationPositions = new HashMap<String,Position>();
    List<String> langsImplementation = new ArrayList<String>();
    
    boolean canClear = false;
    for(Token token : method.getSubTokens())
    {
      if (token.is("modifier"))
      {
        // TODO: Why the extra space?  Means we have to remove later
        modifier += " " + (token.getValue());
        aMethod.setModifier(modifier);
      }
      else if(token.is("abstract")) {
        boolean wasSet = aMethod.setIsAbstract(true);

        // Ensure the value was set.
        if (wasSet == false)
        {
          setFailedPosition(token.getPosition(), 0, "Unable to make method abstract!");
        }
      }
      else if(token.is("methodThrowsExceptions")){
        for(Token exceptionToken:token.getSubTokens())
        {
          if(exceptionToken.is("exception"))
          {
            aMethod.addException(exceptionToken.getValue());
          }
        }
      }
      else if(token.is("static"))
      {
        modifier += " static ";
        aMethod.setModifier(modifier);
      }
      else if (token.is("synchronized"))
      {
        modifier += " synchronized ";
        aMethod.setModifier(modifier);
      }
      else if (token.is("type"))
      {
        if (aMethod.getIsQueued() && !token.getValue().equals("void"))
        {
          getParseResult().addErrorMessage(new ErrorMessage(41,token.getPosition()));
        }
        else
        { 
          aMethod.setType(token.getValue());
        }
      }
      else if (token.is("queued"))
      {
        aMethod.setIsQueued(true);
      }
      else if (token.is("list"))
      {
        aMethod.setType(aMethod.getType()+"[]");
      }
      else if (token.is("methodDeclarator"))
      {
        analyzeMethodDeclarator(token, uElement, aMethod);
      }
      else if (token.is("code"))
      {        
        if(langs.isEmpty())
        {
          if( (cb.getCode("") != null) && (!cb.getCode("").equals("")) && (!cb.getCode("").equals("\n")))   
          getParseResult().addErrorMessage(new ErrorMessage(49,aMethod.getPosition(),
                aMethod.getName(),aMethod.getClass().getName(), implementationPositions.get("").getLineNumber()+"", implementationPositions.get("").getFilename(),
                token.getPosition().getLineNumber()+"", token.getPosition().getFilename(), ""));
          else
          {
            String methodCode = token.getValue();
            // process mixsets inside code 
            
methodCode = processInlineMixset(token.getValue(), meth);
Label_Mixset_96: ;
     
            cb.setCode(methodCode);
            aMethod.setCodePosition(token.getPosition());
            
            //559b
            implementationPositions.put("", token.getPosition());
            langsImplementation.add("");
          }
        }
        else
        {
          for(String str: langs)
          {
            if( (cb.getCode(str) != null) && (!cb.getCode(str).equals("")) && (!cb.getCode(str).equals("\n")))    
              getParseResult().addErrorMessage(new ErrorMessage(49,aMethod.getPosition(),
                      aMethod.getName(),aMethod.getClass().getName(), implementationPositions.get(str).getLineNumber()+"", implementationPositions.get(str).getFilename(),
                      token.getPosition().getLineNumber()+"", token.getPosition().getFilename(), str));
            else
            {
            implementationPositions.put(iValue, iPosition);
              cb.setCode(str,/*(cb.getCode(str)!=null?cb.getCode(str)+"\n":"")+*/ token.getValue());
              if("Java".equals(str))
              {
                aMethod.setCodePosition(token.getPosition());
              }
            }
          }
          //559b
          langs.clear();
        }
        canClear = true;
      }
      else if (token.is("codeLang"))
      {
        if(canClear)
        {
          langs.clear();
          canClear = false;
        }
        langs.add(token.getValue());
        
        //559b
        langsImplementation.add(token.getValue());
        iPosition = token.getPosition();
        iValue = token.getValue();
        //implementationPositions.put(token.getValue(), token.getPosition());
      }
      else if (token.is("precondition")){ 
        if (uElement instanceof UmpleClass){
          analyzePrecondition(token, (UmpleClass) uElement, aMethod);
        }  
      }
      else if (token.is("postcondition")){ 
        if (uElement instanceof UmpleClass){
          analyzePostcondition(token, (UmpleClass) uElement, aMethod);
        }  
      }
    
      else if (token.is("assertion")){ 
        boolean testcaseExist= false;
    	  int index=0;
    	  
    	  if (uElement instanceof UmpleClass){

    		  for(UmpleTestCase tc: ((UmpleClass) uElement).getUmpleTestCases())
    		  {
    			  if (tc.getName().equals(aMethod.getName()))
    			  {
    				  testcaseExist= true;
    				  index = ((UmpleClass) uElement).indexOfUmpleTestCase(tc);
    			  }
    		  }

    		  if(!testcaseExist)
    		  {
    			  UmpleTestCase uTestCase = new UmpleTestCase(aMethod.getName(),0);
    			  analyzeMethodAssertion(token, (UmpleClass) uElement,meth, aMethod,uTestCase);
    			 ((UmpleClass) uElement).addUmpleTestCase(uTestCase);
    		  }
    		  else {
    			  analyzeMethodAssertion(token, (UmpleClass) uElement,meth, aMethod,((UmpleClass) uElement).getUmpleTestCase(index));

    		  }
           
          
        }  
      }

      else if (token.is("testCase")){ 
          if (uElement instanceof UmpleClass){
        	  boolean testcaseExist= false;
        	  int index=0;
        	  
        	  for(UmpleTestCase tc: ((UmpleClass) uElement).getUmpleTestCases())
    		  {
    			  if (tc.getName().equals(token.getValue("testCaseName")))
    			  {
    				  testcaseExist= true;
    				  index = ((UmpleClass) uElement).indexOfUmpleTestCase(tc);
    			  }
    		  }

    		  if(!testcaseExist)
    		  {
    			  UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName"),0);
    			  analyzeMethodTestCase(token, (UmpleClass) uElement,meth, aMethod,uTestCase);
    			   ((UmpleClass) uElement).addUmpleTestCase(uTestCase);
    		  }
    		  else {
    			  analyzeMethodTestCase(token, (UmpleClass) uElement,meth, aMethod,((UmpleClass) uElement).getUmpleTestCase(index));

    		  }
            
          }  
        }
    }
    meth.setCodeblock(cb);
    meth.setImplementationPositions(implementationPositions);
    aMethod.setMethodBody(meth);

    // Handle Class/Interface Modifications
    if (uElement instanceof UmpleClass)
    {
      UmpleClass uClass = (UmpleClass) uElement;
      
      // Add Getter/Setter/Constructor to Class
      boolean shouldAddMethod = !isStatefulMethod && !isConstructorOrGetSet(uClass, aMethod, false);
     
      //Issue 559
      //if(uClass.hasMethod(aMethod) && !uClass.getMethod(aMethod).getIsConstructor())
      if(uClass.hasMethod(aMethod))
      {
        Method actualMethod = uClass.getMethod(aMethod);
        
        List<String> implementations = new ArrayList<String>();
        
        for(String l : langsImplementation)
          if(actualMethod.getExistsInLanguage(l))
            implementations.add(l);
          else
          {
            if(!l.equals(""))
              actualMethod.getMethodBody().setExtraCode(l, aMethod.getMethodBody().getExtraCode(l));
            else
            actualMethod.getMethodBody().setExtraCode("", aMethod.getMethodBody().getExtraCode(l));
          
            actualMethod.getMethodBody().getImplementationPositions().put(l, aMethod.getMethodBody().getImplementationPositions().get(l));
          }
          
        if(!implementations.isEmpty())
        {
          for(String l : implementations)
          {
            if(!isGetterSetter(actualMethod) && (actualMethod.getMethodBody().getExtraCode(l).equals("") || 
              actualMethod.getMethodBody().getExtraCode(l).equals("\n"))&&
             (!aMethod.getMethodBody().getExtraCode(l).equals("") &&
                !aMethod.getMethodBody().getExtraCode(l).equals("\n")) &&
               (!actualMethod.getMethodBody().getExtraCode(l).equals(aMethod.getMethodBody().getExtraCode(l))))
            {
              actualMethod.getMethodBody().setExtraCode(l, aMethod.getMethodBody().getExtraCode(l));
              actualMethod.getMethodBody().getImplementationPositions().put(l, aMethod.getMethodBody().getImplementationPositions().get(l));
            }
            else
            {
              if (isGetterSetter(actualMethod)) {
                String methodName = aMethod.getName();
                String attributeName = methodName.substring(3,methodName.length()).toLowerCase();
                getParseResult().addErrorMessage(new ErrorMessage(1009, aMethod.getPosition(), methodName, attributeName, uClass.getName()));
              }
              //Issue 771
              else if(uClass.hasSameType(aMethod)) 
              {
                //Issue 1488
                boolean raiseWarning49 = !method.getSubToken("code").getValue().equals("");
                for (Token token : method.getSubTokens())
                {
                  if (token.is("codeLang"))
                  {
                    raiseWarning49 = true;
                  }
                }
                if (raiseWarning49) // if no executable code, don't raise warning 49.
                {
                  getParseResult().addErrorMessage(new ErrorMessage(49,aMethod.getPosition(),
                        aMethod.getName(),uClass.getName(), actualMethod.getMethodBody().getImplementationPositions().get(l).getLineNumber()+"", actualMethod.getMethodBody().getImplementationPositions().get(l).getFilename(),
                        aMethod.getMethodBody().getImplementationPositions().get(l).getLineNumber()+"", aMethod.getPosition().getFilename(), l));
                }
              }
              else
              {
                getParseResult().addErrorMessage(new ErrorMessage(71,aMethod.getPosition(),
                        aMethod.getName(),uClass.getName(), actualMethod.getMethodBody().getImplementationPositions().get(l).getLineNumber()+"", actualMethod.getMethodBody().getImplementationPositions().get(l).getFilename(),
                        aMethod.getMethodBody().getImplementationPositions().get(l).getLineNumber()+"", aMethod.getPosition().getFilename(), l));
              }
            }
            
          }
        }
        
        /*
        
        if ((actualMethod.getMethodBody().getExtraCode().isEmpty()) &&
            (!aMethod.getMethodBody().getExtraCode().isEmpty()))
        {
          actualMethod.setMethodBody(aMethod.getMethodBody());
          actualMethod.setPosition(aMethod.getPosition());
        }
        else
        {
          getParseResult().addErrorMessage(new ErrorMessage(49,aMethod.getPosition(),
              aMethod.getName(),uClass.getName(), actualMethod.getPosition().getLineNumber()+"", actualMethod.getPosition().getFilename(),
            aMethod.getPosition().getLineNumber()+"", aMethod.getPosition().getFilename()));
        }    
        
        */
        
      }

           
     
      if ((!uClass.hasMethod(aMethod) || uClass.getMethod(aMethod).getIsConstructor()) && shouldAddMethod)
      //if (!uClass.hasMethod(aMethod) && shouldAddMethod)
      {
        // See issue #1351. Convert regular methods to default bodies for state-dependent methods
        // if they exist.
        Label_StateMachine_97: ;

        {
          uClass.addMethod(aMethod);
        }
      }

      // Make class abstract if an abstract method was added
      if(uClass.hasMethod(aMethod) && aMethod.getIsAbstract()) 
      {
        uClass.setIsAbstract(true);
        uClass.addUnimplementedMethod(aMethod);
      }

      // If method not added to class, add it to list of
      // unimplemented methods
      if(!uClass.hasMethod(aMethod)) 
      {
        //Issue 567 and 1351
        boolean stateDependentMethodsflag = true;
        Label_StateMachine_98: ;
      if(shouldAddMethod && stateDependentMethodsflag)
          uClass.addUnimplementedMethod(aMethod);
      }
    }
    
else if (uElement instanceof UmpleTrait)
    {
        UmpleTrait uTrait = (UmpleTrait) uElement;
        if (method.is("abstractMethodDeclaration")) aMethod.setIsAbstract(true);
        
        // Add Getter/Setter/Constructor to Class
     //   boolean shouldAddMethod = isConstructorOrGetSet(uClass, aMethod);
        if (!uTrait.hasMethod(aMethod)) // && shouldAddMethod)
        {
          String msg = "Please do not modify the following method.";
      aMethod.addCommentAt(new Comment(msg),0);
          msg = "The following method comes from trait "+uTrait.getName()+".";
      aMethod.addCommentAt(new Comment(msg),1);
      msg = "Trait "+uTrait.getName()+" has been used in classes: ";
      aMethod.addCommentAt(new Comment(msg),2);
          uTrait.addMethod(aMethod); 
        } 

        // Make class abstract if an abstract method was added
        if(uTrait.hasMethod(aMethod) && aMethod.getIsAbstract()) 
        {
          uTrait.setIsAbstract(true);
          uTrait.addUnimplementedMethod(aMethod);
        }

        // If method not added to class, add it to list of
        // unimplemented methods
        if(!uTrait.hasMethod(aMethod)) 
        {
          uTrait.addUnimplementedMethod(aMethod);
        }     
    }
Label_Trait_99: ;

    else if (uElement instanceof UmpleInterface)
    {
      UmpleInterface uInterface = (UmpleInterface) uElement;
      if (!uInterface.hasMethod(aMethod))
      {
        uInterface.addMethod(aMethod); 
      }
    }

    return aMethod;
  }


  /**
   * Analyzes a method header, from a token flagged to be one, to populate a method instance for things such as the
   * method name, type and parameters.
   * 
   * @param token The token flagged to be a method header.
   * @param aMethod The method to be populated from the analysis of the token.
   */
  // line 3369 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeMethodDeclarator(Token token, UmpleElement uElement, Method aMethod){
    // Go through all sub tokens of the method token to obtain data such as the methods name, parameters etc and add them to the method.
    for(Token methodToken : token.getSubTokens())
    {
      if (methodToken.is("methodName"))
      {
        aMethod.setName(methodToken.getValue());
        if(uElement instanceof UmpleClass)         // to detect if user manually added a constructor
        {
          UmpleClass uClass = (UmpleClass)uElement;
          if(uClass.getName().equals(methodToken.getValue()))
          {
            setFailedPosition(token.getPosition(), 170, "");
          }
          
        }
      }
      if (methodToken.is("parameterList"))
      {
        for(Token parameterToken : methodToken.getSubTokens())
        {
          boolean isList = false;
          if (parameterToken.is("parameter"))
          {
            String paramType="";
            if (parameterToken.getSubToken("type") != null)
            {
              paramType = parameterToken.getSubToken("type").getValue();
            }
            if (parameterToken.getSubToken("list") != null)
            {
              isList = parameterToken.getSubToken("list").getValue() != null;        
            }

            String paramName = parameterToken.getSubToken("name").getValue();
            MethodParameter aParameter  = new MethodParameter(paramName,paramType,null,null, false);
            aParameter.setIsList(isList);
            aMethod.addMethodParameter(aParameter);
          }
        }
      }
    }
  }


  /**
   * Analyzes a constant, from a token flagged to be one, to add a constant instance to an Umple element.
   * 
   * @param constantToken The token flagged to be a constant.
   * @param uElement The Umple element for which a new constant will be added (populated from analysis of the token).
   */
  // line 3420 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeConstant(Token constantToken, UmpleElement uElement){
    Constant aConstant = new Constant("","","","");
    String modifier = "";
    boolean validName = Token.isValidIdentifier(constantToken.getValue("name"));
    boolean properName = Token.isValidIdentifier(constantToken.getValue("name"), "[A-Z]");

    // Throws an error if the name of the constant is not valid
    if(validName != true){
      setFailedPosition(constantToken.getPosition(), 160, constantToken.getValue("name"));
      return;
    }
    // Throws a warning if the name of the constant does not start with an uppercase
    // as some languages may depend on constants being uppercase
    if(properName != true){
      setFailedPosition(constantToken.getPosition(), 161, constantToken.getValue("name"));
    }

    boolean isInternal = constantToken.getValue("internal") != null;
    if(isInternal){
        aConstant.setIsInternal(true);
    }
    else{
        aConstant.setIsInternal(false);
    }

    // Create the Constant Object
    for(Token token : constantToken.getSubTokens())
    {
      if (token.is("modifier"))
      {
        modifier += " " + (token.getSubToken(0).getName());
        aConstant.setModifier(modifier);
      }
      else if (token.is("name"))
      {
        aConstant.setName(token.getValue());
      }
      else  if (token.is("type"))
      {
        aConstant.setType(token.getValue());
      }
      else  if (token.is("value"))
      {
        aConstant.setValue(token.getValue());
      }
    }  

    Boolean typeIsNull = ((constantToken.getValue("type") == null) || (constantToken.getValue("type").equals("")));
    Boolean valueIsNull = ((constantToken.getValue("value") == null) || (constantToken.getValue("value").equals("")));
    if((typeIsNull != true) && (valueIsNull != true))
    {
      if(!compareTypeToValue(constantToken.getValue("type"), constantToken.getValue("value")))
      {
        setFailedPosition(constantToken.getPosition(),141,constantToken.getValue("type"),constantToken.getValue("value"));  
      }
    }
    else if ((typeIsNull == true) && (valueIsNull != true))
    {
      aConstant.setType(inferType(constantToken.getValue("value"), constantToken.getValue("type")));
    }
    else if(typeIsNull == true)
    {
      aConstant.setType("String");
      if(valueIsNull == true)
      {
        aConstant.setValue(null);
      }
    }

    // Sets the default value of a constant that has not been initialized
    if(aConstant.getValue() == null || aConstant.getValue() == "")
    {
      aConstant.setValue(defaultConstantValue(aConstant.getType(), constantToken));
    }

    // Checks to see if another constant shares the name of the current constant
    for(Constant tmpConst : ((UmpleClassifier)uElement).getConstants()){
      if (tmpConst.getName().equals(aConstant.getName())){
        if (uElement instanceof UmpleClass)
        {
          setFailedPosition(constantToken.getPosition(), 22, uElement.getName(), aConstant.getName());
        }
        else if (uElement instanceof UmpleInterface)
        { 
          setFailedPosition(constantToken.getPosition(), 112, uElement.getName(), aConstant.getName());
        }
      }
    }  

    // Add constant to Class or Interface
    if (uElement instanceof UmpleClass)
    {
      UmpleClass uClass = (UmpleClass) uElement;
      uClass.addConstant(aConstant);
    }
    else if (uElement instanceof UmpleInterface)
    {
      UmpleInterface uInterface = (UmpleInterface) uElement;
      uInterface.addConstant(aConstant);
    }
  }

  // line 3523 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private String defaultConstantValue(String type, Token attributeToken){
    String value = "";
    if(type.equals("Float") || type.equals("float"))
    {
      try{
        String lang = this.getModel().getGenerate(0).getLanguage();
        if(lang.equals("Java"))
        {
          //This call is made when Java is explicitly declared as the target language
          value = "0.0f";
          setFailedPosition(attributeToken.getPosition(), 35, attributeToken.getValue("name"), type, "0.0f");
        }
        else{
          value = "0.0";
          setFailedPosition(attributeToken.getPosition(), 35, attributeToken.getValue("name"), type, "0.0");
        }
      }catch(java.lang.IndexOutOfBoundsException e){
        //This call is made when Java is defaulted as the target language
        value = "0.0f";
        setFailedPosition(attributeToken.getPosition(), 35, attributeToken.getValue("name"), type, "0.0f");
      }
    }
    else if(type.equals("Double") || type.equals("double"))
    {
      value = "0.0";
      setFailedPosition(attributeToken.getPosition(), 35, attributeToken.getValue("name"), type, "0.0");
    }
    else if(type.equals("int") || type.equals("Integer"))
    {
      value = "0";
      setFailedPosition(attributeToken.getPosition(), 35, attributeToken.getValue("name"), type, "0");
    }
    else if(type.equals("boolean") || type.equals("Boolean"))
    {
      value = "false";
      setFailedPosition(attributeToken.getPosition(), 35, attributeToken.getValue("name"), type, "false");
    }
    else if(type.equals("String"))
    {
      value = "\"\"";
      setFailedPosition(attributeToken.getPosition(), 35, attributeToken.getValue("name"), type, "empty String (\"\")");
    }
    else if(type.equals("Time"))
    {
      value = "\"00:00:00\"";
      setFailedPosition(attributeToken.getPosition(), 35, attributeToken.getValue("name"), type, "00:00:00");
    }
    else if(type.equals("Date"))
    {
      java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
      value = "\"" + currentDate.toString() + "\"";
      setFailedPosition(attributeToken.getPosition(), 35, attributeToken.getValue("name"), type, currentDate.toString());
    }
    else
    {
      setFailedPosition(attributeToken.getPosition(), 37, attributeToken.getValue("name"), type);
    }
    return value;
  }

  // line 3584 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private String getOperationParameters(Token aToken){
    StringBuilder operationParameters = new StringBuilder();  
    String delimeter = "";
    for(Token subToken : aToken.getSubTokens())
    {
      if(subToken.is("parameterType"))
      {
        operationParameters.append(delimeter+subToken.getValue());
        delimeter = ",";
      } 
      else if(subToken.is("parameterTypes")) 
      {
        return getOperationParameters(subToken);
      }
      else if(subToken.is("parameterListing")) {
        return getOperationParameters(subToken);
      }
    }
    
    if(aToken.is("injectionOperation")) {
      return "...";
    }

    return operationParameters.toString();
  }

  // line 3611 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private List<String> getOperationsParameters(Token aToken){
    ArrayList<String> operationsParameters = new ArrayList<String>();
    for(Token subToken : aToken.getSubTokens())
    {
      if(subToken.is("injectionOperation"))
      {
        operationsParameters.add(getOperationParameters(subToken));
      }
    }
    return operationsParameters;
  }

  // line 3624 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private String getOperationSource(Token aToken){
    StringBuilder operationSource = new StringBuilder();
    String comma = "";
    for(Token subToken : aToken.getSubTokens())
    {
      if(subToken.is("operationSource"))
      {
        operationSource.append(comma+subToken.getValue());
      }
    }
    return operationSource.toString();
  }

  // line 3638 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private String getOperationName(Token aToken){
    StringBuilder operationName = new StringBuilder();
    String comma = "";
    for(Token subToken : aToken.getSubTokens())
    {
      if(subToken.is("operationName"))
      {
        operationName.append(comma+subToken.getValue());
        comma = ",";
      } 
      else if(subToken.is("injectionOperation")) 
      {
        operationName.append(comma+getOperationName(subToken));
        comma = ",";
      }
    }
    return operationName.toString();
  }


  /**
   * Issue#1521. make toplevel injection token only contain one methodName.
   */
  // line 3659 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private Token toSingleOperationNameInInjectToken(Token injectToken, String operationName, String globMatched){
    Token newInjectToken = injectToken.copy();
    
    List<Token> subTokens = newInjectToken.getSubTokens();
    ArrayList<Token> subTokens2 = new ArrayList<Token>();
    subTokens2.addAll(subTokens);
    for (Token subToken : subTokens2)
    {
      if (subToken.is("injectionOperation"))
      {
        List<Token> subSubTokens = subToken.getSubTokens();
        for (Token subSubToken : subSubTokens)
        {
          if (subSubToken.is("operationName") && !subSubToken.getValue().equals(operationName))
          {
            newInjectToken.removeSubTokenNotSetParentToken(subToken);
          } else if (!globMatched.equals("")) {
            subSubToken.setValue(globMatched);
          }
        }
      }
    }
    return newInjectToken;
  }


  /**
   * Issue#1521
   */
  // line 3686 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private String globToRegex(String glob){
    String regex = "";
    for(int i = 0; i < glob.length(); ++i)
    {
      final char c = glob.charAt(i);
      if (c == '*')
      {
        regex += ".*";
      } else {
        regex += c;
      }
    }
    return regex;
  }


  /**
   * Issue#1521
   */
  // line 3703 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private ArrayList<String> findAllMatchClassNames(ArrayList<String> allClassNames, String glob){
    String regex = globToRegex(glob);
    ArrayList<String> matchedClassNames = new ArrayList<String>();
    for (String className : allClassNames)
    {
      if (className.matches(regex))
      {
        matchedClassNames.add(className);
      }
    }
    return matchedClassNames;
  }

  // line 3718 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean checkParameterMatch(List<MethodParameter> parameters, String currentParameters){
    // Check if method parameters match injection parameters
    boolean isParameterMatch = true;

    if("...".equals(currentParameters) || (parameters.size() == 0 && "".equals(currentParameters))) {
      isParameterMatch = true;
    }
    else if(parameters.size() != currentParameters.split(",").length)
    {
      isParameterMatch = false;
    }
    else {
      int indx = 0;
      for(String parameterType : currentParameters.split(",")) {
        if(!parameterType.equals(parameters.get(indx).getType())) {
          isParameterMatch = false;
        }
        indx++;
      }
    }

    return isParameterMatch;
  }

  // line 3742 "../../../../src/UmpleInternalParser_CodeClass.ump"
  public ArrayList<String> getAllMethodNames(UmpleClass uClass){
    ArrayList<String> methodNames = new ArrayList<String>();
    ArrayList<String> todoExtendedClasses = new ArrayList<String>();
    ArrayList<String> todoInheritedInterfaces = new ArrayList<String>();

    todoExtendedClasses.add(uClass.getName());
    while(!todoExtendedClasses.isEmpty())
    {
      String className = todoExtendedClasses.get(0);
      todoExtendedClasses.remove(className);

      UmpleClass eClass = model.getUmpleClass(className);

      if(eClass == null)
      {
        todoInheritedInterfaces.add(className);
        continue;
      }

      todoExtendedClasses.remove(className);
      if(unlinkedExtends.get(eClass) != null)
      {
        todoExtendedClasses.addAll(unlinkedExtends.get(eClass));
      }

      methodNames.addAll(eClass.getMethodNames()); 
    }

    while(!todoInheritedInterfaces.isEmpty())
    {
      String interfaceName = todoInheritedInterfaces.get(0);
      todoInheritedInterfaces.remove(interfaceName); 

      UmpleInterface eInterface = model.getUmpleInterface(interfaceName);

      if(eInterface == null)
      {
        continue;
      }

      if(unlinkedInterfaceExtends.get(eInterface) != null)
      {
        todoInheritedInterfaces.addAll(unlinkedInterfaceExtends.get(eInterface));
      }

      for(Method m : eInterface.getMethods())
      {
        methodNames.add(m.getName());
      }
    }

    return methodNames;
  }

  // line 3796 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkCodeInjectionValidity(Token injectToken, UmpleClass uClass, String operationSource){
    List<Method> methods = uClass.getMethods();
    ArrayList<String> methodNames = getAllMethodNames(uClass);
    String[] allOperations = getOperationName(injectToken).split(",");
    List<String> allParameters = getOperationsParameters(injectToken);

    for(int opInd = 0; opInd < allOperations.length; opInd++)
    {
      String operation = allOperations[opInd];
      String currentParameters = allParameters.get(opInd);
      Boolean hasExclusion = false;
      if(operation.charAt(0) == '!' && "generated".equals(operationSource)) {
        hasExclusion = true;
        operation = operation.substring(1);
      }

      Boolean matches = false;

      // check against generated methods
      if ("all".equals(operationSource) || "generated".equals(operationSource)) {
        for(String methodName : methodNames) 
        { 
          if (uClass.matchOperationMethod(operation, methodName)) {
            matches = true;
          }
        }

        // issue #1351 - check against state-dependent methods
        final String operationFinal = operation;
        boolean stateDependentMethodsFlag = true;
        Label_StateMachine_100: ;
        if (!matches && stateDependentMethodsFlag )
        {
          matches = true;
        }
      }

      // check against custom methods
      if("all".equals(operationSource) || "custom".equals(operationSource)){
        for(Method method : methods) 
        { 
          boolean tmpMatches = uClass.matchOperationMethod(operation, method.getName()) && checkParameterMatch(method.getMethodParameters(), currentParameters);
          matches = matches || tmpMatches;
        }
      }

      if(!matches) {
        if(hasExclusion && "generated".equals(operationSource)) {
          getParseResult().addErrorMessage(new ErrorMessage(1014, injectToken.getPosition(), operation));
        }
        else {
          getParseResult().addErrorMessage(new ErrorMessage(1012, injectToken.getPosition(), operation));
        }
      }

      if(!"...".equals(currentParameters) && !"custom".equals(operationSource)) {
        getParseResult().addErrorMessage(new ErrorMessage(1013, injectToken.getPosition(), operationSource));
      }
    }
  }


  /**
   * TODO I changed the parameter's type. please remove this comment;
   */
  // line 3859 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void makeCodeInject(Token injectToken, CodeInjection injection, CodeBlock cb, UmpleClassifier uClassifier){
    List<String> langs = new ArrayList<String>();
    for(Token sub: injectToken.getSubTokens())
    {
      if(sub.is("codeLang"))
      {
        langs.add(sub.getValue());
      }
      if(sub.is("code"))
      {
        String aspectCode = sub.getValue();
        
aspectCode = processInlineMixset(sub.getValue(), null);
Label_Mixset_101: ;
    
        if(langs.size()==0)
        {
          cb.setCode(aspectCode);
          injection.setCodePosition(sub.getPosition());
        }
        else
        {
          for(String lang:langs)
            {
                cb.setCode(lang,aspectCode);
                if("Java".equals(lang))
                {
                  injection.setCodePosition(sub.getPosition());
                }
            }
        }
        langs.clear();      
      }
      if(sub.is("codeInject"))
      {
        makeCodeInject(sub,injection, cb , uClassifier);
      }
    }    
    injection.setPosition(injectToken.getPosition());
  }

  // line 3900 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addKey(Token keysToken, UmpleClass aClass, Map<UmpleClass,List<Token>> unlinkedKeysTokens){
    // If the class already has a key defined, set fail position
    if (unlinkedKeysTokens.containsKey(aClass))
    {
        setFailedPosition(keysToken.getPosition(), 7, keysToken.getParentToken().getValue("name"));
    }

    if (keysToken.is("defaultKey"))
    {
      aClass.getKey().setIsDefault(true);
      setFailedPosition(keysToken.getPosition(), 47, aClass.getName());
      return;
    }
    
    List<Token> keyTokenList = new ArrayList<Token>();
    List<String> tokensAdded = new ArrayList<String>();
    // Go through all sub-tokens of the key to add them to the list of keys for this class
    for (Token token : keysToken.getSubTokens())
    {
        if (token.is("keyId")) 
        {
            //Checks for duplicate keys
            if(tokensAdded.contains(token.getValue()))
            {
                setFailedPosition(keysToken.getPosition(), 26, token.getValue(), aClass.getName());
            }
            else
            {
                keyTokenList.add(token);
                tokensAdded.add(token.getValue());
            }
        }
    }
    unlinkedKeysTokens.put(aClass, keyTokenList);
  }

  // line 3937 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeSymmetricReflexiveAssociation(Token symmetricReflexiveAssociationToken, UmpleClass aClass){
    String myName = symmetricReflexiveAssociationToken.getValue("roleName");
    String myType = aClass.getName();
    String myModifier = "symmetricreflexive";
    String myBound = symmetricReflexiveAssociationToken.getValue("bound");
    String myLowerBound = symmetricReflexiveAssociationToken.getValue("lowerBound");
    String myUpperBound = symmetricReflexiveAssociationToken.getValue("upperBound");
    Multiplicity myMult = new Multiplicity();
    myMult.setBound(myBound);
    myMult.setRange(myLowerBound,myUpperBound);

  //String myIsSpecialized = symmetricReflexiveAssociationToken.getValue("isSpecialized");
  //String myIsSpecialization = symmetricReflexiveAssociationToken.getValue("isSpecialization");

    AssociationVariable myAs = new AssociationVariable(myName,myType,myModifier,null,myMult,true);
    AssociationVariable yourAs = new AssociationVariable(myName,myType,myModifier,null,myMult,true);

  //myAs.setIsSpecialized(myIsSpecialized.equals("true"));
    //myAs.setIsSpecialization(myIsSpecialization.equals("true"));
    //yourAs.setIsSpecialized(myIsSpecialized.equals("true"));
    //yourAs.setIsSpecialization(myIsSpecialization.equals("true"));

    myAs.setRelatedAssociation(yourAs);
    aClass.addAssociationVariable(yourAs);
    
    AssociationEnd leftEnd = new AssociationEnd(null,myType,myModifier,myType,myMult);
    AssociationEnd rightEnd = new AssociationEnd(myName,myType,myModifier,myType,myMult);
    Association assoc = new Association(true, true, false, false, leftEnd, rightEnd);

    assoc.setTokenPosition(symmetricReflexiveAssociationToken.getPosition());
    assoc.setTokenEndPosition(symmetricReflexiveAssociationToken.getEndPosition());

    aClass.addAssociation(assoc);
    model.addAssociation(assoc);
  }

  // line 3974 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private Association createAssociation(String navigation, AssociationEnd firstEnd, AssociationEnd secondEnd){
    Association association;
    if(navigation != null){
      boolean isNavigable = "--".equals(navigation) || "<@>-".equals(navigation) || "-<@>".equals(navigation);
      boolean isFirstNavigable = "<-".equals(navigation) || isNavigable;
      boolean isSecondNavigable = "->".equals(navigation) || isNavigable;
      boolean isLeftComposition = "<@>-".equals(navigation);
      boolean isRightComposition = "-<@>".equals(navigation);
      association = new Association(isFirstNavigable,isSecondNavigable,isLeftComposition,isRightComposition,firstEnd,secondEnd);
    }else{
      association = new Association(true, true, false, false, firstEnd, secondEnd);
    }
    return association;
  }

  // line 3990 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private Association analyzeAssociation(Token associationToken, String defaultMyType){
    Token parentToken = associationToken.getParentToken();
    Token gParentToken = parentToken.getParentToken();
    boolean isAssociationClass = parentToken.is("associationClassDefinition") || gParentToken.is("associationClassDefinition");
    boolean isSingleAssociationEnd = associationToken.is("singleAssociationEnd");
    boolean isInlineAssociation = associationToken.is("inlineAssociation");
    Token myEndToken = null;
    Token yourEndToken = null;
    String navigation = null;
    String associationModifier = null;
    String name = null;


    //Issue 213/131: associations can be inside AssociationClasses, but
    //inline associations inside associationClasses are treated just like in regular classes
    if(isAssociationClass && !isInlineAssociation){
        if(isSingleAssociationEnd){
            myEndToken = parentToken;
            associationModifier = associationToken.getValue("modifier");
            navigation = null;
            name = parentToken.getValue("name");

        }else{ //association inside associationClass
            myEndToken = parentToken.getParentToken();
            associationModifier = parentToken.getValue("modifier");
            navigation = parentToken.getValue("arrow");
            name = gParentToken.getValue("name");
        }
        yourEndToken = associationToken;
    }else{//inline association or external "association{..}" block
        name = parentToken.getValue("name");
        int myMultOffset = 0;
        int yourMultOffset = 2;
        Token associationModifierToken = associationToken.getSubToken("modifier");
        if (associationModifierToken != null){
          associationModifier = associationModifierToken.getValue();
          myMultOffset++;
          yourMultOffset++;
        }
        myEndToken = associationToken.getSubToken(myMultOffset);
        navigation = associationToken.getValue("arrow");
        yourEndToken = associationToken.getSubToken(yourMultOffset);
    }
    AssociationEnd firstEnd = createPreliminaryAssociationEnd(myEndToken, defaultMyType);
    AssociationEnd secondEnd = createPreliminaryAssociationEnd(yourEndToken, defaultMyType);
    if(firstEnd == null || secondEnd == null){
        setFailedPosition(associationToken.getPosition(), 8, name);
        return null;
    }
    
    if(isAssociationClass && isSingleAssociationEnd){
        String roleName = associationToken.getValue("otherEndroleName");
        if(roleName != null){
          firstEnd.setRoleName(roleName);
        } 
      }
      
    String myType = firstEnd.getClassName();
    String myRoleName = firstEnd.getRoleName();
    String yourType = secondEnd.getClassName();
    String yourRoleName = secondEnd.getRoleName();
    Multiplicity myMult = firstEnd.getMultiplicity();
    Multiplicity yourMult = secondEnd.getMultiplicity();

    if("".equals(firstEnd.getClassName())){
        firstEnd.setClassName(defaultMyType);
    }
    firstEnd.setReferenceToClassName(yourType);
    secondEnd.setReferenceToClassName(myType);
    //Association Classes have Mutiplicities switched between ends: an association
    //between A and B in associationClass C becomes A -- C and B -- C
    if(isAssociationClass){
        firstEnd.setMultiplicity(secondEnd.getMultiplicity());
        secondEnd.setMultiplicity(myMult);
    }
    updateAssociationEnds(firstEnd,secondEnd);

    // Trap cases where both ends are the same class (reflexive) and 
    // there is no or same role name and same multiplicity. Fixes issue 295
    if(myType.equals(yourType) && ((myRoleName == null && yourRoleName == null) || (myRoleName != null && yourRoleName != null && myRoleName.equals(yourRoleName))) && myMult.toString().equals(yourMult.toString())) {
      setFailedPosition(associationToken.getPosition(), 21, myType);
      return null;
    }
  
    if (firstEnd.getRoleName().equals(secondEnd.getRoleName()) && firstEnd.getClassName().equals(secondEnd.getClassName())){
      setFailedPosition(associationToken.getPosition(), 32, firstEnd.getRoleName());
      return null;
    }  
  
    Association association = createAssociation(navigation,firstEnd,secondEnd);
    if (isAssociationClass)
    {
      AssociationClass assocClass;
      assocClass = (AssociationClass) model.getUmpleClass(gParentToken.getValue("name"));
      if (assocClass == null) { assocClass = (AssociationClass) model.getUmpleClass(parentToken.getValue("name")); }
      if (assocClass != null) { assocClass.addAssociatedTo(association); }
    }
    
    if (associationModifier != null && "immutable".equals(associationModifier)){
      association.setImmutable();
    }
    association.setTokenPosition(associationToken.getPosition());
    association.setTokenEndPosition(associationToken.getEndPosition());
    
    if (!association.isValid()){
      Token atFaultToken = association.whoIsInvalid() == 0 ? myEndToken : yourEndToken;
      String invalidBound = atFaultToken.getValue("bound") == null ? invalidBound = atFaultToken.getValue("lowerBound") + ".." + atFaultToken.getValue("upperBound") : atFaultToken.getValue("bound");
      setFailedPosition(atFaultToken.getPosition(), 9, invalidBound);
      return null;
    }
    model.addAssociation(association);
    if(!isInlineAssociation){ unlinkedAssociations.add(association); }
    
    //check for non-constraint side warning per issue347
    if(isInlineAssociation || !isAssociationClass){
      analyzeNonconstraintAssociationEndForWarning(associationToken, firstEnd, secondEnd);
    }

    return association;
  }


  /**
   * Given a [[associationEnd]], [[singleAssociationEnd]], [[inlineAssociationEnd]] or 
   * a [[associationClassDefinition]] token, creates a
   * preliminary AssociationEnd object to help in the creation of an Association object.
   * The resulting object will have to be completed with setReferenceToClassName()depending on the type of association.
   * @return an AssociationEnd object or null if an error occured
   */
  // line 4118 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private AssociationEnd createPreliminaryAssociationEnd(Token associationEndToken, String defaultType){
    if(associationEndToken != null){
      String name, type, modifier, roleName, bound, lowerBound, upperBound, priority;
      bound = lowerBound = upperBound = priority = roleName = null;
      Multiplicity mult = new Multiplicity();
      String typeIndex;

      //special case when [[singleAssociationEnd]] is used in one end: the 
      //parent associationClassDefinition is used as the other
      if(associationEndToken.is("associationClassDefinition")){
        name = null;
        type = associationEndToken.getValue("name");
        modifier = null;
        mult.setRange("1","1");
        typeIndex = "name";
      }else{
        type = associationEndToken.getValue("type");
        modifier = associationEndToken.getValue("modifier");
        roleName = associationEndToken.getValue("roleName");
        bound = associationEndToken.getValue("bound");
        lowerBound = associationEndToken.getValue("lowerBound");
        upperBound = associationEndToken.getValue("upperBound");
        priority = associationEndToken.getValue("priority");
        mult.setRange(lowerBound, upperBound);
        mult.setBound(bound);
        typeIndex = "type";
      }
      // Report an error if the multiplicity is invalid
      if (!mult.isValid()){
        String invalidBound = bound == null ? lowerBound + ".." + upperBound : bound;
        setFailedPosition(associationEndToken.getPosition(), 4, invalidBound);
        return null;
      }
      if(type == null){
          type = defaultType;
      }
      AssociationEnd assocEnd = new AssociationEnd(roleName,type,modifier,null,mult);

      if(priority != null){
          assocEnd.setPriority(priority);
      }
      positionToClassNameReference.put(associationEndToken.getPosition(typeIndex),type);
      return assocEnd;
    }else{
        return null;
    }
  }

  // line 4168 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void updateAssociationEnds(AssociationEnd firstEnd, AssociationEnd secondEnd){
    if (firstEnd.getRoleName().length() == 0)
    { 
      String rawName = StringFormatter.toCamelCase(firstEnd.getClassName());
      String name = firstEnd.getMultiplicity().isMany() ? model.getGlossary().getPlural(rawName) : rawName;
      firstEnd.setRoleName(name);
      firstEnd.setIsDefaultRoleName(true);
    }

    if (secondEnd.getRoleName().length() == 0)
    {
      String rawName = StringFormatter.toCamelCase(secondEnd.getClassName());
      String name = secondEnd.getMultiplicity().isMany() ? model.getGlossary().getPlural(rawName) : rawName;
      secondEnd.setRoleName(name);
      secondEnd.setIsDefaultRoleName(true);
    }
  }


  /**
   * Analyzes a token flagged to be an association within an Umple class to create an instance of one and add it to the class.
   * 
   * @param inlineAssociationToken The token flagged to be an inline association.
   * @param aClass The Umple class for which an association instance will be added (populated from analysis of the token).
   */
  // line 4193 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeinlineAssociation(Token inlineAssociationToken, UmpleClass aClass){
    Association association = analyzeAssociation(inlineAssociationToken,aClass.getName());

    if (!getParseResult().getWasSuccess())
    {
      return;
    }

    AssociationEnd myEnd = association.getEnd(0);
    AssociationEnd yourEnd = association.getEnd(1);

    AssociationVariable myAs = new AssociationVariable(myEnd.getRoleName(),myEnd.getClassName(),myEnd.getModifier(),null,myEnd.getMultiplicity(),association.getIsLeftNavigable());
    myAs.setIsComposition(association.getIsLeftComposition());
    AssociationVariable yourAs = new AssociationVariable(yourEnd.getRoleName(),yourEnd.getClassName(),yourEnd.getModifier(),null,yourEnd.getMultiplicity(),association.getIsRightNavigable());
    yourAs.setIsComposition(association.getIsRightComposition());

    myAs.setRelatedAssociation(yourAs);
    
    if(!"".equals(myEnd.getPriority())) { myAs.setPriority(myEnd.getPriority()); }
    if(!"".equals(yourEnd.getPriority())) { yourAs.setPriority(yourEnd.getPriority()); }
    
    if (association.isImmutable())
    {
      boolean set = myAs.setImmutable();
      if (set)
      {
        yourAs.setImmutable();
      }
      else
      {
        setFailedPosition(inlineAssociationToken.getPosition(),17);
      }
    }

    // Add comments above the association to the association.
    for (Comment c : lastComments)
    {
      yourAs.addComment(c);
    }
    
    // set last association made to be yourAs. clear lastattr.
    lastassoc = yourAs;
    lastassocPosition = inlineAssociationToken.getPosition();
    lastattr = null;
    

    boolean added = aClass.addAssociationVariable(yourAs);
    if (added)
    {
      unlinkedAssociationVariables.add(yourAs);
      aClass.addAssociation(association);
    }
    else
    {
      if (aClass.isImmutable()) { setFailedPosition(inlineAssociationToken.getPosition(),17); }
      
      else { setFailedPosition(inlineAssociationToken.getPosition(),13); }
    }
  }


  /**
   * Set warning if non-constraint side of association is not many(*) or optional(0..1) association type per issue 347
   * 
   * @param Token The token is either inlineAssociationToken or associationDefinationToken.
   * @param AssociationEnd the first associationEnd.
   * @param AssociationEnd the second associationEnd.
   */
  // line 4261 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeNonconstraintAssociationEndForWarning(Token associationToken, AssociationEnd myEnd, AssociationEnd yourEnd){
    AssociationEnd nonConstraintEnd = null;
    boolean isUnidirection = true;
    
    //manual check as getIsLeftNavigatable() applies for "--" as well
    Token arrowToken = associationToken.getSubToken("arrow");
    boolean isLeftArrow = arrowToken.getValue().equals("<-"); // || arrowToken.getValue().equals("<@>-");
    boolean isRightArrow = arrowToken.getValue().equals("->"); // || arrowToken.getValue().equals("-<@>");
    
    //determine the non-arrow side
    if(isLeftArrow)
    {
      nonConstraintEnd = yourEnd;
    }
    else if(isRightArrow)
    {
      nonConstraintEnd = myEnd;
    }
    else
    {
      isUnidirection = false;
    }
    
    if(isUnidirection)
    {
      String nonConstraintEndLower = nonConstraintEnd.getLowerBoundString();
      String nonConstraintEndUpper = nonConstraintEnd.getUpperBoundString();
        
      //only allow optional and many constraint on non-arrow side
      boolean isMany = (nonConstraintEndLower.equals("0")) && (nonConstraintEndUpper.equals("*"));
      boolean isOptional = (nonConstraintEndLower.equals("0")) && (nonConstraintEndUpper.equals("1"));
        
      if(!isMany && !isOptional)
      {
        String bound = "";
        //case of mandatory constraint
      if(nonConstraintEndLower.equals(nonConstraintEndUpper))
        bound = nonConstraintEndLower;
      else  
        bound = "[" +nonConstraintEndLower+", "+nonConstraintEndUpper+"]";
        setFailedPosition(associationToken.getPosition(), 36, bound);
      }
    }
  }


  /**
   * Analyzes a token flagged to be an attribute within an Umple class to create an instance of one and add it to the class.
   * 
   * @param attributeToken The token flagged to be an attribute.
   * @param aClass The Umple class for which an attribute instance will be added (populated from analysis of the token).
   */
  // line 4313 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeAttribute(Token attributeToken, UmpleClass aClass){
    boolean isAutounique = attributeToken.getValue("autounique") != null;
    boolean isUnique = attributeToken.getValue("unique") != null;
    boolean isLazy = attributeToken.getValue("lazy") != null;
    boolean isIvar = attributeToken.getValue("ivar") != null;
    boolean isList = attributeToken.getValue("list") != null;
    boolean isConstant = "const".equals(attributeToken.getValue("modifier"));
    boolean validName = Token.isValidIdentifier(attributeToken.getValue("name"));
    boolean properName = !Token.isValidIdentifier(attributeToken.getValue("name"), "[A-Z]");
    boolean looksLikeAssociation = attributeToken.getValue("name").contains("--") || attributeToken.getValue("name").contains("->");
    looksLikeAssociation = looksLikeAssociation || attributeToken.getValue("name").contains("<-") || attributeToken.getValue("name").contains("..");
    looksLikeAssociation = looksLikeAssociation || attributeToken.getValue("name").contains("*");
    looksLikeAssociation = looksLikeAssociation || attributeToken.getValue("name").contains("<@>-") || attributeToken.getValue("name").contains("-<@>");
    
    
    String modifier = attributeToken.getValue("modifier");
    String type = attributeToken.getValue("type");
    String name = attributeToken.getValue("name");
    String value = attributeToken.getValue("value");
    String derivedValue = attributeToken.getValue("code");
    
    if(isAutounique || attributeToken.getValue("modifier") != null){
      if(attributeAutouniqueImmutable == null)
        attributeAutouniqueImmutable = new HashMap<Token, UmpleClass>();
      attributeAutouniqueImmutable.put(attributeToken, aClass);
    }
    
    if(!validName)
    {
      if(looksLikeAssociation){
        setFailedPosition(attributeToken.getPosition(), 132, name);
      } 
      else if(isConstant){
        setFailedPosition(attributeToken.getPosition(), 160, name);
      }
      else {
        setFailedPosition(attributeToken.getPosition(), 130, name);
      }
      
      return;
    }
    
    if(!properName && !isConstant){
      setFailedPosition(attributeToken.getPosition(), 131, name);
    }
    else if(properName && isConstant){
      setFailedPosition(attributeToken.getPosition(), 161, name);
    }
    
    //allow singleton with constant and predefined variables
    if (aClass.getIsSingleton() && !isConstant && !isLazy && (value == null)) 
    {
      isLazy = true;
      setFailedPosition(attributeToken.getPosition(), 1, name);
    }
    
    // check to see if type has angle brackets <>
    if (type != null)
    {
      int lang_pos = type.lastIndexOf('<');
      int rang_pos = type.lastIndexOf('>');
      if (lang_pos > 0 && rang_pos > 0 && lang_pos < rang_pos)
      {
        setFailedPosition(attributeToken.getPosition(), 46, name, aClass.getName(), type);
      }
    }
    
    if (isLazyRedundant(isLazy, value))
    {
      setFailedPosition(attributeToken.getPosition(), 3, aClass.getName(), name);
    }

    for(Attribute aAttribute : aClass.getAttributes()){
      if (aAttribute.getName().equals(name)){
        setFailedPosition(attributeToken.getPosition(), 22, aClass.getName(), name);
      }
    }

    CodeBlock languageSpecificCode = new CodeBlock();
    if (derivedValue != null)
    {
      value = "";
      List<String> codelangs = new ArrayList<String>();
      for(Token tkn: attributeToken.getSubTokens())
      {
      if(tkn.is("codeLang"))
      {
        codelangs.add(tkn.getValue());
      } else if(tkn.is("code")) {
        if(codelangs.isEmpty())
        {
          languageSpecificCode.setCode(tkn.getValue());
        } else {
          for(String lang: codelangs)
          {
            languageSpecificCode.setCode(lang, tkn.getValue());
          }
          codelangs.clear();
        }
      }
      }
    }

    if (derivedValue != null && isList) // added block for issue 1376
    {
      setFailedPosition(attributeToken.getPosition(), 83, aClass.getName(), name);
      return;
    }

    if ("defaulted".equals(modifier) && value == null)
    {
      setFailedPosition(attributeToken.getPosition(), 6, attributeToken.getValue("name"));
      return;
    }
      
    if (isUnique)
    {
      UniqueIdentifier uniqueIdentifier = new UniqueIdentifier(name,type,modifier,value);
      aClass.setUniqueIdentifier(uniqueIdentifier);
    }

    if (isAutounique)
    {
      type = "Integer";
    }

    if(type != null)
    { 
      Matcher m = Pattern.compile("([a-zA-Z_][0-9a-zA-Z_]*(<(.*)>)?)").matcher(type);
      if(!m.matches()) 
      {
        setFailedPosition(attributeToken.getPosition(), 140, type);
        return;
      }
    }

    if(type != null)
    {
      if("public".equals(type) || "private".equals(type) || "protected".equals(type))
      {
  setFailedPosition(attributeToken.getPosition(), 142, name, type);
      }
    }

    if(type != null && value != null)
    {
      if (!isList) { // will check list initializer later
        if(!compareTypeToValue(type,value))
        {
          setFailedPosition(attributeToken.getPosition(),141,type,value);  
        }
      }
    }
    else if (type == null && value != null)
    {
      type = inferType(value, type);
    }
    else if(type == null)
    {
      type = "String";
    }


    if(attributeToken.getValue("modifier") != null)
    {
      if((attributeToken.getValue("modifier").contains("const")) && (attributeToken.getValue("value") == null))
      {
        value = defaultConstantValue(type, attributeToken);
      }
    }

    Attribute attribute = new Attribute(name,type,modifier,value,isAutounique,aClass);
    attribute.setIsUnique(isUnique);
    attribute.setIsLazy(isLazy);
  attribute.setIsIvar(isIvar);

    if (name == null)
    {
      String rawName = StringFormatter.toCamelCase(type); 
      name = isList ? model.getGlossary().getPlural(rawName) : rawName;
    }

    if (derivedValue != null)
    {
      attribute.setEndPosition(attributeToken.getEndPosition());
      attribute.setIsDerived(true);
      attribute.setCodeblock(languageSpecificCode);
    }

    // set position regardless of derivedValue    
    attribute.setPosition(attributeToken.getPosition());

    attribute.setIsList(isList);
    
    // If the list has values to be assigned, verify if it is valid
    if(isList && value != null) {
      String[] values = value.split(",");
      if(!value.contains(",") && (values[0].contains(" ") || values[0].matches("^.*[^a-zA-Z0-9 ].*$")) && !value.contains("new")) {
        setFailedPosition(attributeToken.getPosition(), 81, aClass.getName(), name);
      }
      else if(!compareTypeToValueList(type, values)) {
        setFailedPosition(attributeToken.getPosition(),141,type,value);
      }
    }

    // Add comments above the attribute to the attribute.
    for (Comment c : lastComments)
    {
      attribute.addComment(c);
    }
    
    // set the last attribute made to be attribute, clear lastassoc
    lastattr = attribute;
    lastassoc = null;
    
    String attModifier = attribute.getModifier();
    
    if (!attModifier.equals("internal") && !attModifier.equals("const"))
    {
       addAPIMethodsForAttribute(attribute, aClass); 
    }
    
    if (attribute.getValue()==null && !attribute.getIsAutounique() && !attribute.getIsLazy() &&
      (attModifier.equals("immutable") || attModifier.equals("settable")))
    {
      addAttributeToConstructor(attribute, aClass);
    }
  }

  // line 4543 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addAttributeToConstructor(Attribute attribute, UmpleClass aClass){
    Method constructor = aClass.getAutoGeneratedConstructor();
    if (constructor == null)
    {
      constructor = new Method("public", aClass.getName(), "public", false);
      constructor.setIsConstructor(true);
      constructor.setMethodBody(new MethodBody(""));
      constructor.setPosition(new Position("", 0, 0, 0));
      constructor.setSource(Method.Source.fAutoAPI);
      aClass.addMethod(constructor);
    }
    else
    {
      aClass.removeMethod(constructor);
    }
    
    constructor.addMethodParameter(new MethodParameter(
      "a" + StringFormatter.toPascalCase(attribute.getName()), attribute.getType(), "", "", false));
    aClass.addMethod(constructor);
  }

  // line 4566 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addAPIMethodsForAttribute(Attribute attribute, UmpleClass aClass){
    Glossary g = model.getGlossary();
    Boolean isMany = attribute.getIsList();
    String type = toUmpleType(attribute.getType());
    String name = attribute.getName();
    //String singularName = isMany ? g.getSingular(name) : name;
    //String pluralName = isMany ? name : g.getPlural(name);
    
    if(isMany)
    {
      addGetMethod(g.getSingular(name), type, aClass, true);
    }
    else
    {
      addGetMethod(name, type, aClass, false);
    }
    
      
    if (!attribute.getIsAutounique() && (!attribute.getModifier().equals("immutable") || attribute.getIsLazy()) && !attribute.getIsDerived())
    {
      if (isMany)
      {
        addAddMethod(g.getSingular(name), type, aClass);
        addRemoveMethod(g.getSingular(name), type, aClass);
        addIndexOfMethod(g.getSingular(name), type, aClass);
        addNumberOfMethod(name, aClass);
        addHasMethod(name, aClass);
      }
      else
      {
        addSetMethod(name, attribute, aClass);
      }
      
      if("Boolean".equals(toUmpleType(attribute.getType())))
      {
        //addIsMethod(name, attribute, aClass);
      }
    }
    
    if(attribute.getIsUnique())
    {
      addGetWithMethod(name, attribute, aClass);
      addHasWithMethod(name, attribute, aClass);
    }
    
    if(attribute.isDefaulted())
    {
      addResetMethod(name, attribute, aClass);
      addGetDefaultMethod(name, attribute, aClass);
    }
  }

  // line 4620 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addAPIMethodsForAssociation(Association a){
    AssociationEnd firstEnd = a.getEnd(0);
    AssociationEnd secondEnd = a.getEnd(1);
    
    // Do I even need this at this point???
    //Boolean isSymmetricReflexive = firstEnd.getModifier().equals("symmetricreflexive");
    Boolean isReflexive = firstEnd.getClassName().equals(secondEnd.getClassName());
    
    UmpleClass firstClass = model.getUmpleClass(firstEnd.getClassName());
    UmpleClass secondClass = model.getUmpleClass(secondEnd.getClassName());
    
    if (firstClass != null && a.isIsRightNavigable())
    {
      addAPIMethodsForAssociationEnd(secondEnd, isReflexive, a.isIsLeftNavigable(), a, firstClass);
    }
    
    if (secondClass != null && !isReflexive && a.isIsLeftNavigable())
    {
      addAPIMethodsForAssociationEnd(firstEnd, false, a.isIsRightNavigable(), a, secondClass);
    }
  }

  // line 4644 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addAPIMethodsForAssociationEnd(AssociationEnd end, Boolean isReflexive, Boolean isDirected, Association a, UmpleClass aClass){
    if (isReflexive)
    {
      if (end.getModifier().equals("symmetricreflexive"))
      {
        String singularName = model.getGlossary().getSingular(end.getRoleName());
        
        addGetMethod(singularName, end.getClassName(), aClass, true);
        addHasMethod(end.getRoleName(), aClass);
        addIndexOfMethod(singularName, singularName, aClass);
        addNumberOfMethod(end.getRoleName(), aClass);
      }
      else
      {
        String singularName = model.getGlossary().getSingular(end.getRoleName());
      
        addGetMethod(end.getRoleName(), end.getClassName() + "[]", aClass, false);
        addGetMethod(singularName, end.getClassName(), aClass, true);
        addHasMethod(end.getRoleName(), aClass);
        addIndexOfMethod(singularName, singularName, aClass);
        addNumberOfMethod(end.getRoleName(), aClass);
        
        String classSingularName = model.getGlossary().getSingular(aClass.getName());
        String classPluralName = model.getGlossary().getPlural(aClass.getName());
              
        addGetMethod(classPluralName, end.getClassName() + "[]", aClass, false);
        addGetMethod(classSingularName, end.getClassName(), aClass, true);
        addHasMethod(classPluralName, aClass);
        addIndexOfMethod(classSingularName, classSingularName, aClass);
        addNumberOfMethod(classPluralName, aClass);
      }
    }
    else
    {
      Multiplicity m = end.getMultiplicity();

      String roleName = end.getRoleName();
      String singularName = model.getGlossary().getSingular(end.getRoleName());
      AssociationEnd otherEnd = (end.getAssociation().indexOfEnd(end)) == 0 ? end.getAssociation().getEnd(1) : end.getAssociation().getEnd(0);
      boolean hasRoleName = false;
      
      if(!end.isIsDefaultRoleName())
      {
        singularName = end.getClassName();
        hasRoleName = true;
      }
      
      if (m.isOne())
      {
        addGetMethod(roleName, end.getClassName(), aClass, false);
        
        if (m.getLowerBound() == 0)
        {
          // Optional association.
          addHasMethod(roleName, aClass);
          addSetMethod(roleName, singularName, aClass);
        }
        else if (otherEnd.getMultiplicity().isMany() || otherEnd.getMultiplicity().getLowerBound() == 0)
        {
          addSetMethod(roleName, singularName, aClass);
        }
      }
      else if (m.isMany())
      {
        addMinimumNumberOfMethod(roleName, aClass);
        if(m.isUpperBoundNumeric())
        {
          if(m.getUpperBound()>1)
          {
            addMaximumNumberOfMethod(roleName, aClass);

            if(m.getLowerBound() == m.getUpperBound())
              addRequiredNumberOfMethod(roleName, aClass);            
          }

          if(m.getLowerBound() > 0)
            addIsNumberOfValidMethod(roleName, aClass);

          if(!"1".equals(m.getBound()) && !"1".equals(otherEnd.getMultiplicity().getBound()) && !"*".equals(m.getBound()) && (m.getLowerBound()>0 || m.getUpperBound()>1))
              addSetManyMethod(roleName, singularName, aClass);
        }

        addNumberOfMethod(roleName, aClass);
        addHasMethod(roleName, aClass);
        
        if(hasRoleName)
        {
          Glossary g = model.getGlossary();
          addAddMethod(g.getSingular(roleName), singularName, aClass);
          addRemoveMethod(g.getSingular(roleName), singularName, aClass);
          addIndexOfMethod(g.getSingular(roleName), singularName, aClass);
          addAtMethod(g.getSingular(roleName), singularName, aClass);
          addOrMoveAt(g.getSingular(roleName), singularName, aClass);
          addGetMethod(g.getSingular(roleName), end.getClassName(), aClass, true);
          addGetMethod(roleName, end.getClassName() + "[]", aClass, false);
          
          if (otherEnd.getMultiplicity().isOne() && model.getUmpleClass(end.getClassName()) != null && !model.getUmpleClass(end.getClassName()).getIsAbstract())
          {
            addAddMethodByParameters(g.getSingular(roleName), singularName, aClass, model.getUmpleClass(end.getClassName()), a.isComposition());
          }
        }
        else
        {
          addAddMethod(singularName, singularName, aClass);
          addRemoveMethod(singularName, singularName, aClass);
          addIndexOfMethod(singularName, singularName, aClass);
          addAtMethod(singularName, singularName, aClass);
          addOrMoveAt(singularName, singularName, aClass);
          addGetMethod(singularName, end.getClassName(), aClass, true);
          addGetMethod(roleName, end.getClassName() + "[]", aClass, false);
          
          if (otherEnd.getMultiplicity().isOne() && model.getUmpleClass(end.getClassName()) != null && !model.getUmpleClass(end.getClassName()).getIsAbstract())
          {
            addAddMethodByParameters(singularName, singularName, aClass, model.getUmpleClass(end.getClassName()), a.isComposition());
          }
        }
      }
    }
  }

  // line 4765 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addHasMethod(String name, UmpleClass aClass){
    String hasName = StringFormatter.format("has{0}", StringFormatter.toPascalCase(name));
      
    Method aMethod = new Method("public", hasName, "Boolean", false);
    setUpAutoGenMethod(aMethod);
    
    aClass.addMethod(aMethod);
  }

  // line 4775 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addIndexOfMethod(String name, String type, UmpleClass aClass){
    String indexOfName = StringFormatter.format("indexOf{0}", StringFormatter.toPascalCase(name));

    Method aMethod = new Method("public", indexOfName, "Integer", false);
    setUpAutoGenMethod(aMethod);
    
    MethodParameter mp = new MethodParameter("a" + StringFormatter.toPascalCase(name), StringFormatter.toPascalCase(type), "", "", false);
    aMethod.addMethodParameter(mp);
    aClass.addMethod(aMethod);
  }

  // line 4787 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addNumberOfMethod(String name, UmpleClass aClass){
    String numberOfName = StringFormatter.format("numberOf{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", numberOfName, "Integer", false);
    setUpAutoGenMethod(aMethod);
    
    aClass.addMethod(aMethod);
  }

  // line 4797 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addMinimumNumberOfMethod(String name, UmpleClass aClass){
    String numberOfName = StringFormatter.format("minimumNumberOf{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", numberOfName, "Integer", false);
    setUpAutoGenMethod(aMethod);
    
    aClass.addMethod(aMethod);
  }

  // line 4807 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addMaximumNumberOfMethod(String name, UmpleClass aClass){
    String numberOfName = StringFormatter.format("maximumNumberOf{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", numberOfName, "Integer", false);
    setUpAutoGenMethod(aMethod);
    
    aClass.addMethod(aMethod);
  }

  // line 4817 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addRequiredNumberOfMethod(String name, UmpleClass aClass){
    String numberOfName = StringFormatter.format("requiredNumberOf{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", numberOfName, "Integer", false);
    setUpAutoGenMethod(aMethod);
    
    aClass.addMethod(aMethod);
  }

  // line 4827 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addIsNumberOfValidMethod(String name, UmpleClass aClass){
    String numberOfName = StringFormatter.format("isNumberOf{0}Valid", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", numberOfName, "Boolean", false);
    setUpAutoGenMethod(aMethod);
    
    aClass.addMethod(aMethod);
  }

  // line 4837 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addSetManyMethod(String name, String type, UmpleClass aClass){
    String setName = StringFormatter.format("set{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", setName, "Boolean", false);
    setUpAutoGenMethod(aMethod);
    aMethod.addMethodParameter(new MethodParameter("new" + StringFormatter.toPascalCase(name), StringFormatter.toPascalCase(type)+"...", "", "", false));
      
    aClass.addMethod(aMethod);
  }

  // line 4848 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addSetMethod(String name, Attribute attribute, UmpleClass aClass){
    String setName = StringFormatter.format("set{0}", StringFormatter.toPascalCase(name));
      
      Method aMethod = new Method("public", setName, "Boolean", false);
      aMethod.setMethodBody(new MethodBody(""));
      aMethod.setPosition(new Position("", 0, 0, 0));
      aMethod.setSource(Method.Source.fAutoAPI);
        aMethod.addMethodParameter(new MethodParameter("a" + StringFormatter.toPascalCase(name), toUmpleType(attribute.getType()), "", "", false));
      aClass.addMethod(aMethod);
  }

  // line 4860 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addSetMethod(String name, String type, UmpleClass aClass){
    String setName = StringFormatter.format("set{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", setName, "Boolean", false);
    setUpAutoGenMethod(aMethod);
    aMethod.addMethodParameter(new MethodParameter("a" + StringFormatter.toPascalCase(name), StringFormatter.toPascalCase(type), "", "", false));
      
    aClass.addMethod(aMethod);
  }

  // line 4871 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addGetMethod(String name, String type, UmpleClass aClass, Boolean indexParam){
    String getName = StringFormatter.format("get{0}", StringFormatter.toPascalCase(name));
    Method aMethod = new Method("public", getName, type, false);
    setUpAutoGenMethod(aMethod);
      
    if (indexParam)
    {
      MethodParameter index = new MethodParameter("index", "Integer", "", "", false);
      aMethod.addMethodParameter(index);
    }
    
    aClass.addMethod(aMethod);
  }

  // line 4886 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addAddMethod(String name, String type, UmpleClass aClass){
    String addName = StringFormatter.format("add{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", addName, "Boolean", false);
    setUpAutoGenMethod(aMethod);
    
    MethodParameter mp = new MethodParameter("a" + StringFormatter.toPascalCase(name), StringFormatter.toPascalCase(type), "", "", false);
    
    aMethod.addMethodParameter(mp);
    
    aClass.addMethod(aMethod);
  }

  // line 4900 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addAddMethodByParameters(String name, String type, UmpleClass firstClass, UmpleClass secondClass, Boolean isComposition){
    String addName = StringFormatter.format("add{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", addName, secondClass.getName(), false);
    setUpAutoGenMethod(aMethod);
    
    if (!secondClass.isRoot() && !"interface".equals(secondClass.getExtendsClass().getModifier()))
    {
      for(Attribute a : secondClass.getExtendsClass().getAttributes())
      {
        if (!(a.getIsAutounique() || a.getIsUnique() || a.isConstant() || a.getIsDerived()))
    {
      MethodParameter mp = new MethodParameter("a" + StringFormatter.toPascalCase(a.getName()), StringFormatter.toPascalCase(toUmpleType(a.getFullType())), "", "", false);
     
      aMethod.addMethodParameter(mp);
    }
      }
    }

    
    for (Attribute a : secondClass.getAttributes())
  {
    if (!(a.getIsAutounique() || a.getIsUnique() || a.isConstant() || a.getIsDerived()))
    {
    MethodParameter mp = new MethodParameter("a" + StringFormatter.toPascalCase(a.getName()), StringFormatter.toPascalCase(toUmpleType(a.getFullType())), "", "", false);
    
    aMethod.addMethodParameter(mp);
    }
  }
  
  if(isComposition)
  {
    for(Association a : secondClass.getAssociations())
    {
      String firstClassName = a.getEnd(0).getClassName();
      String secondClassName = a.getEnd(1).getClassName();
      if( a.isComposition() && !(firstClassName.equals(firstClass.getName()) || secondClassName.equals(firstClass.getName())) )
      {
        String classNameToAdd = firstClassName.equals(secondClass.getName()) ? secondClassName : firstClassName; 
        MethodParameter mp = new MethodParameter("a" + StringFormatter.toPascalCase(classNameToAdd), classNameToAdd, "", "", false);
    
        aMethod.addMethodParameter(mp);
      }
    }
  }
  
  firstClass.addMethod(aMethod);
  }

  // line 4950 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addRemoveMethod(String name, String type, UmpleClass aClass){
    String removeName = StringFormatter.format("remove{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", removeName, "Boolean", false);
    setUpAutoGenMethod(aMethod);
    
    MethodParameter mp = new MethodParameter("a" + StringFormatter.toPascalCase(name), StringFormatter.toPascalCase(type), "", "", false);
    aMethod.addMethodParameter(mp);
    
    aClass.addMethod(aMethod);
  }

  // line 4963 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addAtMethod(String name, String type, UmpleClass aClass){
    String addAtName = StringFormatter.format("add{0}At", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", addAtName, "Boolean", false);
    setUpAutoGenMethod(aMethod);
    
    MethodParameter mp1 = new MethodParameter("a" + StringFormatter.toPascalCase(name), StringFormatter.toPascalCase(type), "", "", false);
    MethodParameter mp2 = new MethodParameter("index", "Integer", "", "", false);
    aMethod.addMethodParameter(mp1);
    aMethod.addMethodParameter(mp2);
    
    aClass.addMethod(aMethod);
  }

  // line 4978 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addOrMoveAt(String name, String type, UmpleClass aClass){
    String addOrMoveAtName = StringFormatter.format("addOrMove{0}At", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", addOrMoveAtName, "Boolean", false);
    setUpAutoGenMethod(aMethod);
    
    MethodParameter mp1 = new MethodParameter("a" + StringFormatter.toPascalCase(name), StringFormatter.toPascalCase(type), "", "", false);
    MethodParameter mp2 = new MethodParameter("index", "Integer", "", "", false);
    aMethod.addMethodParameter(mp1);
    aMethod.addMethodParameter(mp2);
  
    aClass.addMethod(aMethod);
  }

  // line 4993 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addGetWithMethod(String name, Attribute a, UmpleClass aClass){
    String getWithMethodName = StringFormatter.format("getWith{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", getWithMethodName, aClass.getName(), false);
    setUpAutoGenMethod(aMethod);
    
    MethodParameter mp = new MethodParameter("a" + StringFormatter.toPascalCase(name), toUmpleType(a.getType()), "", "", false);
    aMethod.addMethodParameter(mp);
    
    aClass.addMethod(aMethod);
  }

  // line 5006 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addHasWithMethod(String name, Attribute a, UmpleClass aClass){
    String hasWithMethodName = StringFormatter.format("hasWith{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", hasWithMethodName, "Boolean", false);
    setUpAutoGenMethod(aMethod);
    
    MethodParameter mp = new MethodParameter("a" + StringFormatter.toPascalCase(name), toUmpleType(a.getType()), "", "", false);
    aMethod.addMethodParameter(mp);
    
    aClass.addMethod(aMethod);
  }

  // line 5019 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addResetMethod(String name, Attribute a, UmpleClass aClass){
    String resetMethodName = StringFormatter.format("reset{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", resetMethodName, "Boolean", false);
    setUpAutoGenMethod(aMethod);
    
    aClass.addMethod(aMethod);
  }

  // line 5029 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addGetDefaultMethod(String name, Attribute a, UmpleClass aClass){
    String getDefaultName = StringFormatter.format("getDefault{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", getDefaultName, toUmpleType(a.getType()), false);
    setUpAutoGenMethod(aMethod);
    
    aClass.addMethod(aMethod);
  }

  // line 5039 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void addIsMethod(String name, Attribute a, UmpleClass aClass){
    String isMethodName = StringFormatter.format("is{0}", StringFormatter.toPascalCase(name));
    
    Method aMethod = new Method("public", isMethodName, "Boolean", false); 
    setUpAutoGenMethod(aMethod);
    
    aClass.addMethod(aMethod);
  }

  // line 5049 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void setUpAutoGenMethod(Method aMethod){
    aMethod.setMethodBody(new MethodBody(""));
    aMethod.setPosition(new Position("", 0, 0, 0));
    aMethod.setSource(Method.Source.fAutoAPI);
  }

  // line 5056 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private String toUmpleType(String javaType){
    switch (javaType)
    {
      case "int":      return "Integer";
      case "boolean" : return "Boolean";
      case "float" :   return "Float";
      case "double" :  return "Double";
      default:         return javaType;
    }
  }

  // line 5068 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private String inferType(String value, String type){
    String inferredType;
    if(value.matches("-?[0-9]+\\.[0-9]+"))
    {
      inferredType = "Double";
    }
    else if(value.matches("-?[0-9]+"))
    {
      inferredType = "Integer";
    }
    else if(value.matches("(true|false)"))
    {
      inferredType = "Boolean";
    }
    else if(value.matches("\"\\d{4}-[0-1][0-9]-[0-3][0-9]\""))
    {
      inferredType="Date";
    }
    else if(value.matches("\"[0-2][0-9]:[0-5][0-9]:[0-5][0-9]\""))
    {
      inferredType = "Time";
    }
    else if(value.matches("\".*\""))
    {
      inferredType = "String";
    }
    else if(type == null)
    {
      Matcher m = Pattern.compile("(new\\s+)([a-zA-Z_][0-9a-zA-Z_]*(\\s*<(.*)>)?)(\\s*\\(\\))").matcher(value);
      if(m.matches())        
      {  
        inferredType = m.group(2);
      }
      else
      { 
        //if anything other than the default new X(); one cannot infer the type
        inferredType = "String";
      }
    }
    //worst case scenarios when we can't anticipate what a user will use as value.
    //and to ignore inheritance/polymorphism 
    else if(type != null)
    {
      inferredType = type; 
    }
    else
    {
      inferredType = "String";
    }
    return inferredType;
  }

  // line 5121 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean compareTypeToValue(String type, String value){
    //cannot infer null
    if(value.equals("null"))
    {
      return true;
    }

    String inferredType = inferType(value,type);   
    if(type.equals("String") && (inferredType.equals("Date") || inferredType.equals("Time")))
    {
      return true;
    }
    else if((type.equals("Float") || type.equals("float") || type.equals("Double") || type.equals("double")) && (inferredType.equals("Integer") || inferredType.equals("Double")))
    {
      return true;
    }
    else if(type.equals("int") && inferredType.equals("Integer"))
    {
      return true;
    }
    else if(type.equals("boolean") && inferredType.equals("Boolean"))
    {
      return true;
    } 
    else
    {
      return inferredType.equals(type);
    }
  }

  // line 5151 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean compareTypeToValueList(String type, String [] values){
    for (String value : values) 
    {
      value = value.replaceAll("(?<!new)\\s+","");
      if (!compareTypeToValue(type, value)) 
      {
        return false;
      }
    }
    return true;
  }

  // line 5164 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private Boolean isLazyRedundant(Boolean isLazy, String value){
    return (isLazy && value != null);
  }

  // line 5169 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeException(Token exception, UmpleClass aClass){
    Token sub = exception.getSubToken(0);
    if(sub.is("malformedConstraint"))
    {
      setFailedPosition(sub.getPosition(), 1010, sub.getValue("stuff"));
      aClass.appendExtraCode("  ["+sub.getValue("stuff")+"]\n");
    }
    else if(sub.is("misnamedAttribute"))
    {
      if(!Token.isValidIdentifier(sub.getValue("name")))
      {
        boolean looksLikeAssociation = sub.getValue("name").contains("--") || sub.getValue("name").contains("->");
        looksLikeAssociation = looksLikeAssociation || sub.getValue("name").contains("<-") || sub.getValue("name").contains("..");
        looksLikeAssociation = looksLikeAssociation || sub.getValue("name").contains("*");
        looksLikeAssociation = looksLikeAssociation || sub.getValue("name").contains("<@>-") || sub.getValue("name").contains("-<@>");
        
        if(looksLikeAssociation)
        {
          setFailedPosition(sub.getPosition(), 132, sub.getValue("name"));
        }
        else 
        {
          setFailedPosition(sub.getPosition(), 130, sub.getValue("name"));
        }
        return;
      }
      if(Token.isValidIdentifier(sub.getValue("name"), "[A-Z]"))
      {
        setFailedPosition(sub.getPosition(), 131, sub.getValue("name"));
      }
      String type = sub.getValue("type");
      if(type!=null)
      {
        if(!Pattern.matches("([a-z]|[A-Z]|_)(\\d|\\w|<|>|,)*", type))
        {
          setFailedPosition(sub.getPosition(), 140, type);
        }
      }
    }
    else if(sub.is("malformedStatement1")||sub.is("malformedStatement2"))
    {
      String extraCode = "";
      for(Token token:sub.getSubTokens())
      {
        if(token.is("stuff"))
        {
          extraCode += token.getValue()+ " ";
        }
      }
      if(sub.getValue("innerstuff")!=null)
      {
        extraCode += "{"+sub.getValue("innerstuff")+"};";
      }
      else
      {
        extraCode += ";";
      }

      CodeBlock cb = new CodeBlock();
      String rubyComment = ("# line " + exception.getPosition().getLineNumber() + " \"" + aClass.getRelativePath( exception.getPosition().getFilename(), "Java") + "\"");
      String otherComment = ("// line " + exception.getPosition().getLineNumber() + " \"" + aClass.getRelativePath( exception.getPosition().getFilename(), "Java") + "\"");

      cb.setCode(otherComment);
      cb.setCode("Ruby", rubyComment);

      aClass.appendExtraCode(true,cb);
      aClass.appendExtraCode("  "+extraCode+"\n");
      
      setFailedPosition(sub.getPosition(), 1007, sub.getValue("name"));
    }
    else if(sub.is("malformedStatemachine1")||sub.is("malformedStatemachine2"))
    {
      String extraCode = "";
      for(Token token:sub.getSubTokens())
      {
        if(token.is("stuff"))
        {
          if(!"".equals(token.getValue())&&!token.getValue().contains(" ")&&!Token.isValidIdentifier(token.getValue()))
          {
            setFailedPosition(token.getPosition(), 150, token.getValue("name"));
          }
          extraCode += token.getValue()+ " ";
        }
      }
      extraCode += "\n  {\n    "+sub.getValue("innerstuff")+"\n  }";
      aClass.appendExtraCode("// line " + exception.getPosition().getLineNumber() + " \"" + aClass.getRelativePath( exception.getPosition().getFilename(), "Java") + "\"");
      aClass.appendExtraCode("  "+extraCode+"\n");
      setFailedPosition(sub.getPosition(), 1006, sub.getValue("name"));
    }
    else if(sub.is("malformedMethod"))
    {
      String extraCode = "";
      for(Token token:sub.getSubTokens())
      {
        if(token.is("stuff"))
        {
          extraCode += token.getValue()+ " ";
        }
      }
      extraCode += "\n  {\n    "+sub.getValue("innerstuff")+"\n  }";
      aClass.appendExtraCode("// line " + exception.getPosition().getLineNumber() + " \"" + aClass.getRelativePath( exception.getPosition().getFilename(), "Java") + "\"");
      aClass.appendExtraCode("  "+extraCode+"\n");
      setFailedPosition(sub.getPosition(), 1008, sub.getValue("name"));
    }
  }

  // line 5276 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeException(Token exception, UmpleInterface aInterface){
    Token sub = exception.getSubToken(0);
    if(sub.is("malformedConstraint"))
    {
      setFailedPosition(sub.getPosition(), 1010, sub.getValue("stuff"));
      aInterface.appendExtraCode("  ["+sub.getValue("stuff")+"]\n");
    }
    else if(sub.is("misnamedAttribute"))
    {
      if(!Token.isValidIdentifier(sub.getValue("name")))
      {
        boolean looksLikeAssociation = sub.getValue("name").contains("--") || sub.getValue("name").contains("->");
        looksLikeAssociation = looksLikeAssociation || sub.getValue("name").contains("<-") || sub.getValue("name").contains("..");
        looksLikeAssociation = looksLikeAssociation || sub.getValue("name").contains("*");
        looksLikeAssociation = looksLikeAssociation || sub.getValue("name").contains("<@>-") || sub.getValue("name").contains("-<@>");
        
        if(looksLikeAssociation)
        {
          setFailedPosition(sub.getPosition(), 132, sub.getValue("name"));
        }
        else 
        {
          setFailedPosition(sub.getPosition(), 130, sub.getValue("name"));
        }
        return;
      }
      if(Token.isValidIdentifier(sub.getValue("name"), "[A-Z]"))
      {
        setFailedPosition(sub.getPosition(), 131, sub.getValue("name"));
      }
      String type = sub.getValue("type");
      if(type!=null)
      {
        if(!Pattern.matches("([a-z]|[A-Z]|_)(\\d|\\w|<|>|,)*", type))
        {
          setFailedPosition(sub.getPosition(), 140, type);
        }
      }
    }
    else if(sub.is("malformedStatement1")||sub.is("malformedStatement2"))
    {
      String extraCode = "";
      for(Token token:sub.getSubTokens())
      {
        if(token.is("stuff"))
        {
          extraCode += token.getValue()+ " ";
        }
      }
      if(sub.getValue("innerstuff")!=null)
      {
        extraCode += "{"+sub.getValue("innerstuff")+"};";
      }
      else
      {
        extraCode += ";";
      }

      //String relativePath = aInterface.getRelativePath( exception.getPosition().getFilename(), "Java");
      CodeBlock cb = new CodeBlock();
      //String rubyComment = ("# line " + exception.getPosition().getLineNumber() + " " + relativePath);
      //String otherComment = ("// line " + exception.getPosition().getLineNumber() + " " + relativePath);

      //cb.setCode(otherComment);
      //cb.setCode("Ruby", rubyComment);

      aInterface.appendExtraCode(true,cb);
      aInterface.appendExtraCode("  "+extraCode+"\n");

      setFailedPosition(sub.getPosition(), 1007, sub.getValue("name"));
    }
    else if(sub.is("malformedStatemachine1")||sub.is("malformedStatemachine2"))
    {
      String extraCode = "";
      for(Token token:sub.getSubTokens())
      {
        if(token.is("stuff"))
        {
          if(!"".equals(token.getValue())&&!token.getValue().contains(" ")&&!Token.isValidIdentifier(token.getValue()))
          {
            setFailedPosition(token.getPosition(), 150, token.getValue("name"));
          }
          extraCode += token.getValue()+ " ";
        }
      }
      extraCode += "\n  {\n    "+sub.getValue("innerstuff")+"\n  }";
      //aInterface.appendExtraCode("// line " + exception.getPosition().getLineNumber() + " " + aInterface.getRelativePath( exception.getPosition().getFilename(), "Java"));
      aInterface.appendExtraCode("  "+extraCode+"\n");
      setFailedPosition(sub.getPosition(), 1006, sub.getValue("name"));
    }
    else if(sub.is("malformedMethod"))
    {
      String extraCode = "";
      for(Token token:sub.getSubTokens())
      {
        if(token.is("stuff"))
        {
          extraCode += token.getValue()+ " ";
        }
      }
      extraCode += "\n  {\n    "+sub.getValue("innerstuff")+"\n  }";
      //aInterface.appendExtraCode("// line " + exception.getPosition().getLineNumber() + " " + aInterface.getRelativePath( exception.getPosition().getFilename(), "Java"));
      aInterface.appendExtraCode("  "+extraCode+"\n");
      setFailedPosition(sub.getPosition(), 1008, sub.getValue("name"));
    }
  }

  // line 5384 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void analyzeExtraCode(Token token, UmpleClass aClass){
    Label_StateMachine_102: ;
    //Append #line comment to indicate line and position of source
    if (token.getPosition() != null)
    {
      String extraCodeLineNumberComment = " line " + token.getPosition().getLineNumber() + " " + aClass.getRelativePath( token.getPosition().getFilename(), "Java");
    String rubyComment = "#" + extraCodeLineNumberComment;
    String otherComment = "//" + extraCodeLineNumberComment;
    if(aClass.hasExtraCode())
    {
      rubyComment = System.getProperty("line.separator") + rubyComment;
      otherComment = System.getProperty("line.separator") + otherComment;
    }
      CodeBlock cb = new CodeBlock();
      cb.setCode(otherComment);
      cb.setCode("Ruby", rubyComment);
      aClass.appendExtraCode(true,cb);
      aClass.appendExtraCode("  " + token.getValue());
      // Issue 516 Fix : UCOSP : Michael Kmicik

      setFailedPosition(token.getPosition(), 1007, token.getValue("name"));
    }
    else
    {
      // Issue 516 Fix : UCOSP : Michael Kmicik
      setFailedPosition(token.getPosition(), 1007, token.getValue("name"));
      aClass.appendExtraCode(token.getValue());
    }
  }

  // line 5413 "../../../../src/UmpleInternalParser_CodeClass.ump"
   public void analyzeToplevelException(Token token){
    Token top = token;
    Position position = token.getPosition();
    token = token.getSubToken("toplevelExceptionMain");
    String[] identifiers = new String[]{
      "unknown",
      "class",
      "external",
      "interface",
      "association",
      "associationClass",
      "statemachine",
      "glossary",
      "strictness",
      "generate",
      "use",
      "namespace"};
    String identifier = token.getValue("identifier");
    boolean isNotProperIdentifier = true;
    for(String id:identifiers)
    {
      if(identifier.equals(id))
      {
        isNotProperIdentifier = false;
        break;
      }
    }
    
    if(isNotProperIdentifier)
    {
      int bestScore = -100;
      String bestMatch = "unknown";
      for(String id:identifiers)
      {
        int score = 0;
        for(int i=0,j=0;j<id.length()&&i<identifier.length();++j)
        {
          if(id.charAt(j)==identifier.charAt(i)){
            ++score;
            ++i;
          }
          else {
            --score;
          }
        }
        for(int i=0,j=0;j<id.length()&&i<identifier.length();++i)
        {
          if(id.charAt(j)==identifier.charAt(i)){
            ++score;
            ++j;
          }
          else {
            --score;
          }
        }
        if(score>bestScore)
        {
          bestScore = score;
          bestMatch = id;
        }
      }
      setFailedPosition(position,1503,identifier,bestMatch);
    }
    else 
    {
      setFailedPosition(position,1502,identifier);
    }
  }

  // line 5483 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void checkUnusedNamespaces(){
    for(NameSpace ns : parsedNameSpaces)
    {
      if(ns.getTimesUsed()<1)
        setFailedPosition(ns.getPosition(),31,ns.getValue());
    }
  }


  /**
   * Method to fix the case where a class/interface implements/extends
   * another one that is located in default namespace (so prevent import .*;)
   * issue #1315
   */
  // line 5496 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private void fixImportFromDefaultPackage(){
    boolean notDone = true;

    while(notDone)
    {
      notDone = false;

      //check if a class implements an interface in default namespace
      //if so, put it in the same namespace as the class

      if(!unlinkedInterfaceExtends.isEmpty())
        for (UmpleClassifier c : unlinkedInterfaceExtends.keySet())
        {
          UmpleClassifier myClass = c;
          for(String className : unlinkedInterfaceExtends.get(c))
          {
            UmpleClassifier yourClass = model.getUmpleClass(className);
            if(yourClass == null)
              yourClass = model.getUmpleInterface(className);
            if(raiseImportFromDefaultNameSpaceWarning(myClass,yourClass))
              notDone = true;
          }
        }

      //check if a class extends a class in default namespace
      //if so, put it in the same namespace as the class

      if(!unlinkedExtends.isEmpty())
        for (UmpleClassifier c : unlinkedExtends.keySet())
        {
          UmpleClassifier myClass = c;
          for(String className : unlinkedExtends.get(c))
          {
            UmpleClassifier yourClass = model.getUmpleClass(className);
            if(yourClass == null)
              yourClass = model.getUmpleInterface(className);
            if(raiseImportFromDefaultNameSpaceWarning(myClass,yourClass))
              notDone = true;
          }
                  
        }  

      //check if a class has association with a class in default namespace
      //if so, put it in the same namespace as the class

      if(model.hasAssociations())
        for (Association association : model.getAssociations()) 
        {  
           
if (associationIsBetweenClassAndTrait(association)){continue;}
Label_Trait_103: ;
    
          
          AssociationEnd myEnd = association.getEnd(0);
          AssociationEnd yourEnd = association.getEnd(1);

          
if(getModel().getUmpleTraitTypeParameter(myEnd.getClassName()) || getModel().getUmpleTrait(myEnd.getClassName())!=null) return ;
            if(getModel().getUmpleTraitTypeParameter(yourEnd.getClassName()) || getModel().getUmpleTrait(yourEnd.getClassName())!=null) return ;
Label_Trait_104:;
 
          UmpleClassifier myClass = model.getUmpleClass(myEnd.getClassName());
          if(myClass == null)
            myClass = model.getUmpleInterface(myEnd.getClassName());
          UmpleClassifier yourClass = model.getUmpleClass(yourEnd.getClassName());
          if(yourClass == null)
            yourClass = model.getUmpleInterface(yourEnd.getClassName());  

          if(raiseImportFromDefaultNameSpaceWarning(myClass,yourClass))
            notDone = true;
          if(raiseImportFromDefaultNameSpaceWarning(yourClass,myClass))
            notDone = true;
        }

      //TODO: do the same thing for interfaces that extend interfaces 
      //in default namespace, but currently, there is no way/I couldn't find a way
      //to generate "import packageNameHere.*;" for interfaces (for UmpleClass we
      //can use the method addMultiLookup of it's GeneratedClass)

    }
  }

  // line 5573 "../../../../src/UmpleInternalParser_CodeClass.ump"
   private boolean raiseImportFromDefaultNameSpaceWarning(UmpleClassifier myClass, UmpleClassifier yourClass){
    boolean wasDone = false;
    if(myClass!=null && yourClass!=null && !myClass.getPackageName().equals("") && yourClass.getPackageName().equals(""))
    {
      yourClass.setPackageName(myClass.getPackageName());
      setFailedPosition(yourClass.getPosition(0),42,yourClass.getName(),myClass.getPackageName());
      wasDone = true;
    }
    return wasDone;
  }

  // line 87 "../../../../src/Master.ump"
  public void checkDefaultedNameConflict(){
    Map<String, CodeTranslator> allTranslators = model.getAllTranslators();
        HashSet<String> generatedMethods = new HashSet<String>();
        for(String langName : allTranslators.keySet()){
          CodeTranslator t = allTranslators.get(langName);

          for(UmpleClass aClass : model.getUmpleClasses()){
            generatedMethods.clear();

            for(Attribute aAttr : aClass.getAttributes()){
              String modifier = aAttr.getModifier();

              // Can add more!
              if(!"internal".equals(modifier)){
                addToGeneratedMethodMap(generatedMethods, aClass.getName(), t, "getMethod", aAttr);
                addToGeneratedMethodMap(generatedMethods, aClass.getName(), t, "setMethod", aAttr);
              }

              if("defaulted".equals(modifier)){
                addToGeneratedMethodMap(generatedMethods, aClass.getName(), t, "getDefaultMethod", aAttr);
              }
            }
          }
        }
  }

  // line 113 "../../../../src/Master.ump"
  public boolean addToGeneratedMethodMap(HashSet<String> generatedMethods, String className, CodeTranslator t, String translatingLabel, Attribute aAttr){
    String generatedMethodName = t.translate(translatingLabel, aAttr);

        if(generatedMethodName != null && !"".equals(generatedMethodName) && !generatedMethodName.startsWith("UNKNOWN ID")){

          boolean success = generatedMethods.add(generatedMethodName);
          if(!success){
            getParseResult().addErrorMessage(new ErrorMessage(48,aAttr.getPosition(), aAttr.getName(), className, generatedMethodName));
            return false;
          }

        }
        return true;
  }

  // line 210 "../../../../src/Association_refactored.ump"
   private void addAssociation(UmpleClass uClass, UmpleClass rUClass, Token mainToken){
    Multiplicity m = new Multiplicity();
		Association aAss = getModel().getAssociation(rUClass.getName()+"_Object");
		if ( aAss != null) {			
			Integer bound = Integer.parseInt(getModel().getAssociation(rUClass.getName()+"_Object").getEnd(1).getMultiplicity().getBound());
			bound++;
			m.setBound( bound.toString());
			getModel().getAssociation(rUClass.getName()+"_Object").getEnd(1).setMultiplicity(m);
			for (AssociationVariable yourAs : uClass.getAssociationVariables()) {
				if (yourAs.getName().equals(rUClass.getName()+"_Object")) {
					yourAs.setMultiplicity(m);
				}
			}
		    List <Token> listOfToken = afixmlLastIntilialization.get(aAss);
		    listOfToken.add(mainToken);
		    afixmlLastIntilialization.put(aAss, listOfToken);
			
		} else {
			m.setBound("1");
			AssociationEnd leftEnd = new AssociationEnd(uClass.getName()+"_Object",uClass.getName(), "",uClass.getName(), m);
			AssociationEnd rightEnd = new AssociationEnd(rUClass.getName()+"_Object",rUClass.getName(), "",rUClass.getName(), m);		
			Association aAssociation = new Association(false, true,false,false,leftEnd,rightEnd);
			aAssociation.setName(rUClass.getName()+"_Object");
			getModel().addAssociation(aAssociation);	    
			AssociationEnd myEnd = aAssociation.getEnd(0);
		    AssociationEnd yourEnd = aAssociation.getEnd(1);
		    AssociationVariable myAs = new AssociationVariable(myEnd.getRoleName(),myEnd.getClassName(),myEnd.getModifier(),null,myEnd.getMultiplicity(),aAssociation.getIsLeftNavigable());
                    myAs.setIsComposition(aAssociation.getIsLeftComposition());
		    AssociationVariable yourAs = new AssociationVariable(yourEnd.getRoleName(),yourEnd.getClassName(),yourEnd.getModifier(),null,yourEnd.getMultiplicity(),aAssociation.getIsRightNavigable());
                    yourAs.setIsComposition(aAssociation.getIsRightComposition());

		    myAs.setRelatedAssociation(yourAs);
		    boolean added = uClass.addAssociationVariable(yourAs);
		    if (added)
		    {
		      unlinkedAssociationVariables.add(yourAs);
		      uClass.addAssociation(aAssociation);
		    }
		    List <Token> listOfToken = new ArrayList<>();
		    listOfToken.add(mainToken);
		    afixmlLastIntilialization.put(aAssociation, listOfToken);
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 256 "../../../../src/Association_refactored.ump"
   private void assignAssociationInitialValues(){
    String value = "";
	for (Association	aa : getModel().getAssociations()) {
		UmpleClass mainClass = getModel().getUmpleClass(aa.getEnd(0).getClassName());
		UmpleClass uClass = getModel().getUmpleClass(aa.getEnd(1).getClassName());
		if (Integer.parseInt(aa.getEnd(1).getMultiplicity().getBound()) >1) {
			for (Token rootToken : afixmlLastIntilialization.get(aa)) {
				value = "new "+uClass.getName()+"(";
				Map<String,String> db = new HashMap<String,String>();
				for (Token subToken : rootToken.getSubTokens()) {
					if (subToken.is("tagDefinition")) {
						   String attname = subToken.getSubToken(0).getValue();
						   //   String attType = "String";
						   String attValue = subToken.getSubToken(3).getValue();	
						   db.put(attname, attValue);  	
					}
				}			
				for (Attribute aAttribute : uClass.getAttributes()) {
					if (db.containsKey(aAttribute.getName())){
						String attValue = db.get(aAttribute.getName());
						   if  ( isStringInteger(attValue) && aAttribute.getType().equals("Integer")) {
							  // attType="Integer";
						   } else if (isStringDuble(attValue) && aAttribute.getType().equals("Double")) {
							   //attType = "Double";
						   } else if (aAttribute.getType().equals("String")) {
							   attValue = "\""+attValue+"\"";
						   } else {
							   attValue = "\""+attValue+"\"";
						   }
						value = value + attValue +", ";
					} else {
					   if  ( aAttribute.getType().equals("Integer") ) {
						   value = value+"0"+", ";
					   } else if (aAttribute.getType().equals("Double")) {
						   value = value+"0.0"+", ";
					   } else if (aAttribute.getType().equals("String")){
						   value = value+"\"\""+", ";
					   }
					}	
				}
				
				for (Association aAssociation : uClass.getAssociations()) {
					List<Token> aToken = afixmlLastIntilialization.get(aAssociation);
					if (aToken.size() >1) {

					} else {
						if (!hasThisObject(rootToken,aAssociation.getEnd(1).getClassName())) {
							 value = value+"null"+", ";
						} else {
							value = value+getAssociationConstructorInConstructor(aAssociation.getEnd(1).getClassName(),aToken.get(0))+", ";
						}
					}
				}
				
				value = value.subSequence(0, value.length()-2) + ")";
				String valueG = aa.getEnd(1).getRoleName()+".add("+value+");";	
				String valuep= "$this->"+aa.getEnd(1).getRoleName()+"[] = "+value+";";
				CodeBlock cb1 = new CodeBlock();
				cb1.setCode("", valueG);
				cb1.setCode("Php", valuep);
				CodeInjection injection = new CodeInjection("after","emptyConstructor",cb1,mainClass);
				mainClass.addCodeInjection(injection);
			}
		} else {
			value = "new "+uClass.getName()+"(";
			value = value+")"; //t.getSubToken(3).getValue();
			value = "set"+aa.getEnd(1).getRoleName()+"("+value+");";
			CodeInjection injection = new CodeInjection("after","emptyConstructor",value,mainClass);
			mainClass.addCodeInjection(injection);
		}

	}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 332 "../../../../src/Association_refactored.ump"
   private String getAssociationConstructorInConstructor(String inName, Token inToken){
    Map<String,String> db = new HashMap<String,String>();
		String value = "new "+inName+"("; //t.getSubToken(3).getValue();	
		for (Token subToken : inToken.getSubTokens()) {
			if (subToken.getName().equals("tagDefinition")) {
				   String attname = subToken.getSubToken(0).getValue();
				   //String attType = "String";
				   String attValue = subToken.getSubToken(3).getValue();
				   db.put(attname, attValue);  	
				 }
			}  
	for (Attribute aAttribute : getModel().getUmpleClass(inName).getAttributes()) {
		if (db.containsKey(aAttribute.getName())){
			String attValue = db.get(aAttribute.getName());
			   if  ( isStringInteger(attValue) && aAttribute.getType().equals("Integer")) {
				  // attType="Integer";
			   } else if (isStringDuble(attValue) && aAttribute.getType().equals("Double")) {
				   //attType = "Double";
			   } else if (aAttribute.getType().equals("String")) {
				   attValue = "\""+attValue+"\"";
			   } else {
				   attValue = "\""+attValue+"\"";
			   }
			value = value + attValue+", ";
		} else {
		   if  ( aAttribute.getType().equals("Integer") ) {
			   value = value+"0"+", ";
		   } else if (aAttribute.getType().equals("Double")) {
			   value = value+"0.0"+", ";
		   } else if (aAttribute.getType().equals("String")){
			   value = value+"\"\""+", ";
		   }
		}
		
	}		  
	for (Association aAssociation : getModel().getUmpleClass(inName).getAssociations()) {
		List<Token> aToken = afixmlLastIntilialization.get(aAssociation);
		if (aToken.size() >1) {

		} else {
			if (!hasThisObject(inToken,aAssociation.getEnd(1).getClassName())) {
				 value = value+"null"+", ";
			} else {
				value = value+getAssociationConstructorInConstructor(aAssociation.getEnd(1).getClassName(),aToken.get(0));
			}
		}
	}
	  value = value.subSequence(0, value.length()-2) + ")";	
	  return value;
  }

  // line 727 "../../../../src/Association_refactored.ump"
   private void addAssociationValue(Filter f, Token t){
    for(Token nt : t.getSubTokens())
      {
        if("associationNum".equals(nt.getName()))
        {
          int associationNum = Integer.parseInt(nt.getValue("associationNum"));
          f.setAssociationCount(associationNum);
        }
      }
  }


  /**
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ----------------------------------------------------------------------------
   */
  // line 35 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private boolean isUmpleTrait(String elementName){
    return (model.getUmpleTrait(elementName) != null) ? true: false;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 43 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void analyzeTraitToken(Token t, int analysisStep){
    if (analysisStep != 2)
    {
      shouldProcessAgain = shouldProcessAgain || (analysisStep == 1);
      return;
    }
    if (t.is("traitDefinition"))
    {
      analyzeTrait(t);
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 58 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private UmpleTrait analyzeTrait(Token traitToken){
    String traitName = traitToken.getValue("name").split(" ")[traitToken.getValue("name").split(" ").length-1];
    //Check to ensure the name is valid (starts with a letter, and only contains letters, numbers, or underscores
    if (Token.isValidIdentifier(traitName, "[A-Za-z]") != true) {
      setFailedPosition(traitToken.getPosition(), 200, traitName);
    }
    else if ( traitName.matches("[a-z].*") ){ // Warn when class name does not start with a capital letter.    
      setFailedPosition(traitToken.getPosition(), 201, traitName);
    }  
    UmpleTrait aTrait;
    aTrait = model.addUmpleTrait(traitToken.getValue("name"));
    
    Position thePosition = traitToken.getPosition();
    Position endPosition = traitToken.getEndPosition();

    // Set the original .ump file and line number
    aTrait.addPosition(thePosition);
    aTrait.addEndPosition(endPosition);
    
    // Add all the comments in the comment list to the Umple Trait.
    // But add them before any umplesource special comments
    int regularCommentCountEnd = 0;
    for (Comment c : aTrait.getComments()) {
      if(c.getText().startsWith("@umplesource")) break;
      regularCommentCountEnd++;
    }

    for (Comment c : lastComments)
    {
      aTrait.addCommentAt(c,regularCommentCountEnd);
      regularCommentCountEnd++;
    }

    // Add special position comment at the end if @outputumplesource had been 
    // detected earlier in a comment
    if(outputUmpleSource == true) {  
      String path = null;
      if( thePosition.getFilename() == null ){
        path = "";
      }else{
        path = Paths.get(thePosition.getFilename()).getFileName().toString();
      }
      aTrait.addComment(new Comment("@umplesource " + path + " "+thePosition.getLineNumber()));
    }
    
  	// If the "abstract" keyword is parsed, make the Umple trait an abstract trait.
    if (traitToken.getValue("abstract") != null)
    {
      boolean wasSet = aTrait.setIsAbstract(true);
      
      // Ensure the value was set.
      if (wasSet == false)
      {
//TODO 3 I should change the code of error
        setFailedPosition(traitToken.getPosition(), 0, "Unable to make class abstract!");
      }
    }
    
	addExtendsTo(traitToken, aTrait, unlinkedExtends, unlinkedExtendsTokens);

    // If the "singleton" keyword is parsed, make the Umple class a singleton.
    if (traitToken.getValue("singleton") != null)
    {
      aTrait.setIsSingleton(true);
    }
    
    if("".equals(aTrait.getPackageName())){
      //If one day traits are going to be a modular-runtime elements and there is a need for package use, the following code can be useful.
      //setFailedPosition(classToken.getPosition(), 30, aClass.getName(), currentPackageName);
      //aClass.setPackageName(currentPackageName); 
      aTrait.setPackageName(currentPackageName);
  	}
  	
    if (aTrait.getIsSingleton()) 
    {
      traitToken.setName(traitToken.getName());  
    }  
	
    if (traitToken.getValue("immutable") != null)
    {
      boolean wasSet = aTrait.setImmutable();
      if (!wasSet)
      {
        // Future-proofing: currently all paths cause wasSet to be true
//TODO 3 I should change the code of error    
        setFailedPosition(traitToken.getPosition(), 14, traitToken.getName());
      }
    }

   if (traitToken.getValue("traitParameters") != null ) {
    	proccessGeneralTemplateParameters(traitToken.getSubToken("traitParameters"), aTrait);
    }
	
    analyzeAllTokens(traitToken,aTrait);
         
    return aTrait;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 159 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void analyzeAllTokens(Token rootToken, UmpleTrait aTrait){
    int analysisStep = 0;
    shouldProcessClassAgain = true;
    do
    {
      analysisStep += 1;
      shouldProcessClassAgain = false;
      for(Token token : rootToken.getSubTokens())
      {
        analyzeToken(token,aTrait,analysisStep);
        if (!getParseResult().getWasSuccess())
        {
          return;
        }
      }
    }
    while (shouldProcessClassAgain);
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 182 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void analyzeToken(Token t, UmpleTrait aTrait, int analysisStep){
    analyzeCoreToken(t,aTrait,analysisStep);
    analyzeTraitToken(t,aTrait,analysisStep);
    Label_StateMachine_105: ;

    analyzeDependentTokens(t,aTrait,analysisStep);
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 194 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void analyzeCoreToken(Token t, UmpleTrait aTrait, int analysisStep){
    
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 200 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void analyzeTraitToken(Token token, UmpleTrait aTrait, int analysisStep){
    if (analysisStep != 1)
    {
      return;
    }

    // Only need to clear comments if there actually was comments.
    boolean shouldConsumeComment = lastComments.size() > 0;
    
    // Determine what the current token is primarily, and based on that the analysis procedure is determined.
    if (token.isStatic("//") || token.isStatic("/*") || token.isStatic("*/"))
    {
      shouldConsumeComment = false;
    }
    
else if (token.is("mixsetDefinition"))
      {
        analyzeMixsetBodyToken(token);
    
      }
Label_Mixset_106: ;

    else if (token.is("testCase"))
    {
      analyzeTraitTestCaseToken(token, aTrait);
   
    }
    
    else if (token.is("inlineComment"))
    {
      analyzeComment(token, false);
      shouldConsumeComment = addToLastAttributeOrAssociation(token);
    }
    else if (token.is("annotationComment"))
    {
      analyzeComment(token, true);
      shouldConsumeComment = addToLastAttributeOrAssociation(token);
    }
    else if (token.is("multilineComment"))
    {
      analyzeMultilineComment(token);
      shouldConsumeComment = false;
    }
    // TODO Under development
    
    else if (token.is("traitDefinition"))
    {
      UmpleTrait childTrait = analyzeTrait(token);
      boolean wasSet = childTrait.addExtendsTrait(aTrait);
      if (!wasSet)
      {
//TODO 4 I should change the code of error      
        setFailedPosition(token.getPosition(), 16, childTrait.getName(), aTrait.getName());
      }
    }
    else if (token.is("constantDeclaration"))
    {
      analyzeConstant(token,aTrait);
    }
    else if(token.is("constantDeclarationDeprecated"))
    {
//TODO 5 I should change the code of error    
      setFailedPosition(token.getPosition(), 901);
      analyzeConstant(token,aTrait);
    }
    else if (token.is("attribute"))
    {
      analyzeAttribute(token,aTrait);
    }
    else if (token.is("extraCode"))
    {
      analyzeExtraCode(token,aTrait);
    }
    else if (token.is("abstractMethodDeclaration"))
    {
      analyzeMethod(token,aTrait);
    }
    else if (token.is("concreteMethodDeclaration"))
    {
      analyzeMethod(token,aTrait);
    }
    else if (token.is("depend"))
    {
      Depend d = new Depend(token.getValue());
      aTrait.addDepend(d);
    }
    Label_Association_107: ;    
    else if (token.is("exception"))
    {
      analyzeException(token,aTrait);
    }

    // This essentially "clears" the comments in the list so that new comments, when parsed, will be the ones appearing above
    // classes, methods, attributes, etc (whichever comes next) rather than old comments propogating everywhere.
    if (shouldConsumeComment)
    {
      lastComments.clear();
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 297 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void analyzeAttribute(Token attributeToken, UmpleTrait aTrait){
    boolean isAutounique = attributeToken.getValue("autounique") != null;
    boolean isUnique = attributeToken.getValue("unique") != null;
    boolean isLazy = attributeToken.getValue("lazy") != null;
    boolean isIvar = attributeToken.getValue("ivar") != null;
    boolean isConstant = "const".equals(attributeToken.getValue("modifier"));
    boolean validName = Token.isValidIdentifier(attributeToken.getValue("name"));
    boolean properName = !Token.isValidIdentifier(attributeToken.getValue("name"), "[A-Z]");
    boolean looksLikeAssociation = attributeToken.getValue("name").contains("--") || attributeToken.getValue("name").contains("->");

    looksLikeAssociation = looksLikeAssociation || attributeToken.getValue("name").contains("<-") || attributeToken.getValue("name").contains("..");
    looksLikeAssociation = looksLikeAssociation || attributeToken.getValue("name").contains("*");
    
    String modifier = attributeToken.getValue("modifier");
    String type = attributeToken.getValue("type");
    String name = attributeToken.getValue("name");
    String value = attributeToken.getValue("value");
    String derivedValue = attributeToken.getValue("code");
    
    if(!validName)
    {
      if(looksLikeAssociation){      
        setFailedPosition(attributeToken.getPosition(), 132, name);
      } 
      else if(isConstant){
        setFailedPosition(attributeToken.getPosition(), 160, name);
      }
      else {
        setFailedPosition(attributeToken.getPosition(), 130, name);
      }
      
      return;
    }
      
    
    if(!properName && !isConstant){
      setFailedPosition(attributeToken.getPosition(), 131, name);
    }
    else if(properName && isConstant){
      setFailedPosition(attributeToken.getPosition(), 161, name);
    }
    
    //allow singleton with constant and predefined variables
    if (aTrait.getIsSingleton() && !isConstant && !isLazy && (value == null)) 
    {
      isLazy = true;
      setFailedPosition(attributeToken.getPosition(), 1, name);
    }
    
    // check to see if type has angle brackets <>
    if (type != null)
    {
      int lang_pos = type.lastIndexOf('<');
      int rang_pos = type.lastIndexOf('>');
      if (lang_pos > 0 && rang_pos > 0 && lang_pos < rang_pos)
      {
//TODO 6 I should change the code of error      
        setFailedPosition(attributeToken.getPosition(), 46, name, aTrait.getName(), type);
      }
    }
    
    if (isLazyRedundant(isLazy, value))
    {
//TODO 7 I should change the code of error
      setFailedPosition(attributeToken.getPosition(), 3, aTrait.getName(), name);
    }

    for(Attribute aAttribute : aTrait.getAttributes()){
      if (aAttribute.getName().equals(name)){
//TODO 8 I should change the code of error    
        setFailedPosition(attributeToken.getPosition(), 22, aTrait.getName(), name);
      }
    }
    CodeBlock languageSpecificCode = new CodeBlock();
    if (derivedValue != null)
    {
      value = "";
      List<String> codelangs = new ArrayList<String>();
      for(Token tkn: attributeToken.getSubTokens())
      {
      if(tkn.is("codeLang"))
      {
        codelangs.add(tkn.getValue());
      } else if(tkn.is("code")) {
        if(codelangs.isEmpty())
        {
          languageSpecificCode.setCode(tkn.getValue());
        } else {
          for(String lang: codelangs)
          {
            languageSpecificCode.setCode(lang, tkn.getValue());
          }
          codelangs.clear();
        }
      }
      }
    }

    if ("defaulted".equals(modifier) && value == null)
    {
      setFailedPosition(attributeToken.getPosition(), 6, attributeToken.getValue("name"));
      return;
    }

    if (isUnique)
    {
      UniqueIdentifier uniqueIdentifier = new UniqueIdentifier(name,type,modifier,value);
      aTrait.setUniqueIdentifier(uniqueIdentifier);
    }

    if (isAutounique)
    {
      type = "Integer";
    }

    if(type != null)
    { 
      Matcher m = Pattern.compile("([a-zA-Z_][0-9a-zA-Z_]*(<(.*)>)?)").matcher(type);
      if(!m.matches()) 
      {
        setFailedPosition(attributeToken.getPosition(), 140, type);
        return;
      }
    }
        
    if(type != null && value != null)
    {
      if(!compareTypeToValue(type,value))
      {
        setFailedPosition(attributeToken.getPosition(),141,type,value);  
      }
    }
    else if (type == null && value != null)
    {
      type = inferType(value, type);
    }
    else if(type == null)
    {
      type = "String";
    }


    if(attributeToken.getValue("modifier") != null)
    {
      if((attributeToken.getValue("modifier").contains("const")) && (attributeToken.getValue("value") == null))
      {
        value = defaultConstantValue(type, attributeToken);
      }
    }

    Attribute attribute = new Attribute(name,type,modifier,value,isAutounique,aTrait);
    attribute.setIsUnique(isUnique);
    attribute.setIsLazy(isLazy);
	attribute.setIsIvar(isIvar);
    boolean isList = attributeToken.getValue("list") != null;

    if (name == null)
    {
      String rawName = StringFormatter.toCamelCase(type); 
      name = isList ? model.getGlossary().getPlural(rawName) : rawName;
    }

    if (derivedValue != null)
    {
      attribute.setEndPosition(attributeToken.getEndPosition());
      attribute.setIsDerived(true);
      attribute.setCodeblock(languageSpecificCode);
    }

    // set position regardless of derivedValue    
    attribute.setPosition(attributeToken.getPosition());

    attribute.setIsList(isList);

    // Add comments above the attribute to the attribute.
    for (Comment c : lastComments)
    {
      attribute.addComment(c);
    }
    
    // set the last attribute made to be attribute, clear lastassoc
    lastattr = attribute;
    lastassoc = null;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 485 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void analyzeExtraCode(Token token, UmpleTrait aTrait){
    //This is a catch all and will be used less often as the grammar gets updated.
    
    Label_StateMachine_108: ;

    //Append #line comment to indicate line and position of source
    if (token.getPosition() != null)
    {
      String extraCodeLineNumberComment = " line " + token.getPosition().getLineNumber() + " " + aTrait.getRelativePath(token.getPosition().getFilename(),"Java");
	  String rubyComment = "#" + extraCodeLineNumberComment;
	  String otherComment = "//" + extraCodeLineNumberComment;
 	  if(aTrait.hasExtraCode())
	  {
	    rubyComment = System.getProperty("line.separator") + rubyComment;
	    otherComment = System.getProperty("line.separator") + otherComment;
	  }
      CodeBlock cb = new CodeBlock();
      cb.setCode(otherComment);
      cb.setCode("Ruby", rubyComment);
      aTrait.appendExtraCode(true,cb);
      aTrait.appendExtraCode("  " + token.getValue());
      // Issue 516 Fix : Michael Kmicik
      setFailedPosition(token.getPosition(), 1007, token.getValue("name"));
    }
    else
    {
      aTrait.appendExtraCode(token.getValue());
      // Issue 516 Fix : Michael Kmicik
      setFailedPosition(token.getPosition(), 1007, token.getValue("name"));
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 524 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void analyzeException(Token exception, UmpleTrait aTrait){
    Token sub = exception.getSubToken(0);
    if(sub.is("misnamedAttribute"))
    {
      if(!Token.isValidIdentifier(sub.getValue("name")))
      {
        boolean looksLikeAssociation = sub.getValue("name").contains("--") || sub.getValue("name").contains("->");
        looksLikeAssociation = looksLikeAssociation || sub.getValue("name").contains("<-") || sub.getValue("name").contains("..");
        looksLikeAssociation = looksLikeAssociation || sub.getValue("name").contains("*");
        if(looksLikeAssociation)
        {
          setFailedPosition(sub.getPosition(), 132, sub.getValue("name"));
        }
        else 
        {
          setFailedPosition(sub.getPosition(), 130, sub.getValue("name"));
        }
        return;
      }
      if(Token.isValidIdentifier(sub.getValue("name"), "[A-Z]"))
      {
        setFailedPosition(sub.getPosition(), 131, sub.getValue("name"));
      }
      String type = sub.getValue("type");
      if(type!=null)
      {
        if(!Pattern.matches("([a-z]|[A-Z]|_)(\\d|\\w|<|>|,)*", type))
        {
          setFailedPosition(sub.getPosition(), 140, type);
        }
      }
    }
    else if(sub.is("malformedStatement1")||sub.is("malformedStatement2"))
    {
      String extraCode = "";
      for(Token token:sub.getSubTokens())
      {
        if(token.is("stuff"))
        {
          extraCode += token.getValue()+ " ";
        }
      }
      if(sub.getValue("innerstuff")!=null)
      {
        extraCode += "{"+sub.getValue("innerstuff")+"};";
      }
      else
      {
        extraCode += ";";
      }

      final String relativePath = aTrait.getRelativePath(exception.getPosition().getFilename(),"Java");
      CodeBlock cb = new CodeBlock();
      String rubyComment = ("# line " + exception.getPosition().getLineNumber() + " " + relativePath);
      String otherComment = ("// line " + exception.getPosition().getLineNumber() + " " + relativePath);

      cb.setCode(otherComment);
      cb.setCode("Ruby", rubyComment);

      aTrait.appendExtraCode(true,cb);
      aTrait.appendExtraCode("  "+extraCode+"\n");

      setFailedPosition(sub.getPosition(), 1007, sub.getValue("name"));
    }
    Label_StateMachine_109: ;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 594 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void analyzeDependentTokens(Token t, UmpleTrait inTrait, int analysisStep){
    if(analysisStep == 1 || shouldProcessClassAgain)
    {
      shouldProcessClassAgain = true;
      return;
    }

    // Methods after this point will occur on analysisStep > 1
    
    if (t.is("invariant"))
    {
      analyzeInvariant(t,inTrait);
    }
    
else if (t.is("beforeCode") || t.is("afterCode"))
      {
      //TODO should applied for traits
        analyzeInjectionCode(t,inTrait);
      }
Label_AspectInjection_110: ;

    else if (t.is("key") || t.is("defaultKey"))
    {
    //TODO should applied for traits
    //  analyzeKey(t,aClass);
    }
    //analyzeTraceToken(t,aClass);
    
analyzeLayoutToken(t,inTrait,analysisStep);
Label_Layout_111: ;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 622 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void applyTraits(){
    //semantic analysis of traits
    //----------------------------------
    checkTemplateParametersValidity();
    //---------------------------------
    if (getParseResult().getWasSuccess()) {
      for (UmpleClass uClass : getModel().getUmpleClasses()) {
        if (uClass.hasExtendsTraits()) {
          if (getParseResult().getWasSuccess()) copyAttributesFromTraitsToClass(uClass);
          if (getParseResult().getWasSuccess()) copyMethodsFromTraitToClass(uClass);
          Label_Association_112: ;
          Label_StateMachine_113: ;

          if (getParseResult().getWasSuccess()) copyTestCasesFromTraitsToClass(uClass);
          if (getParseResult().getWasSuccess()) {
            for (UmpleTrait uTrait : uClass.getExtendsTraits()) {
              recursiveApplyTraits(uClass,uTrait);
              if ( ! getParseResult().getWasSuccess() ) return;  
            }  
          }
        }
      }
      if (getParseResult().getWasSuccess()) checkAllRequiredMethodsAndInterfaces();
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 650 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void recursiveApplyTraits(UmpleClass inClass, UmpleTrait inTrait){
    if (inTrait.hasExtendsTraits()) {
		  applyTraitProperties(inClass, inTrait);
		  for (UmpleTrait uTrait : inTrait.getExtendsTraits()) {
			  recursiveApplyTraits(inClass,uTrait);
		  }
	  } else {
		  applyTraitProperties(inClass, inTrait);
	  }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 663 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void copyMethodsFromTraitToClass(UmpleClass inClass){
    Map<UmpleTrait, List<Method>> traitMethods = new HashMap<UmpleTrait, List<Method>>();
	Map<UmpleTrait, List<Method>> tempTraitMethods = new HashMap<UmpleTrait, List<Method>>();
	for (UmpleTrait uTrait : inClass.getExtendsTraits()) {
		checkClassSupportTraitsInterfaces(inClass.getGeneralTPAppliedByName(uTrait.getName()),inClass);
		if ( ! getParseResult().getWasSuccess() ) return;
		tempTraitMethods = gatherConcreteMethods(uTrait,inClass.getGeneralTPAppliedByName(uTrait.getName()));
		if ( ! getParseResult().getWasSuccess() ) return;
		checkMethodComeFromTraitsIsAvaiableInClass(tempTraitMethods,inClass);
		if (CheckMethodComeFromTraitsIsAvaialbleInOtherTraits(traitMethods,tempTraitMethods,inClass)) return;
		AddMethodMapToAnother(traitMethods,tempTraitMethods);
	}
	for (UmpleTrait t1 : traitMethods.keySet()) {
		for (Method method : traitMethods.get(t1)) {
			method.getComment(2).setText(method.getComment(2).getText()+"'"+inClass.getName()+"' ");
			method.setSource(Method.Source.fTrait);
			inClass.addMethod(method);   
		}
	}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 686 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void checkClassSupportTraitsInterfaces(GeneralTPApplied inGeneralTPAppliedByName, UmpleClassifier inUmpleClassifier){
    if (inGeneralTPAppliedByName == null) return;
	String type = "class";
	if (inUmpleClassifier instanceof UmpleTrait) {type = "trait";} 
	for (GeneralTemplateParameter gtParameter : model.getUmpleTrait(inGeneralTPAppliedByName.getInheritanceName()).getGeneralTemplateParameters()){
		String bindingValue= inGeneralTPAppliedByName.getParameterMapping().get(gtParameter.getName());
		if (bindingValue==null && gtParameter.getDefaultValue()!=null) continue;
		if (bindingValue.equals("Boolean")| bindingValue.equals("Integer") | bindingValue.equals("Float") | bindingValue.equals("String")| bindingValue.equals("Double")| bindingValue.equals("Date")| bindingValue.equals("Time")){
			if (gtParameter.numberOfInterfacesAndClass()>0){
				getParseResult().addErrorMessage( new ErrorMessage( 221, inUmpleClassifier.getPosition(0),bindingValue, gtParameter.getName(),inGeneralTPAppliedByName.getInheritanceName(),type,inUmpleClassifier.getName()) ); 
			 	return;	
			}
			
		} else {
			UmpleClass uClass = model.getUmpleClass(bindingValue);
			UmpleInterface uInterface = model.getUmpleInterface(bindingValue);
			if (uClass==null & uInterface==null){
				getParseResult().addErrorMessage( new ErrorMessage( 221, inUmpleClassifier.getPosition(0),bindingValue, gtParameter.getName(),inGeneralTPAppliedByName.getInheritanceName(),type,inUmpleClassifier.getName()) ); 
			 	return;
			} else {
				for (String str : gtParameter.getInterfacesAndClass()){
					if (getModel().getUmpleClass(str)!=null) {
						if (!checkClassExtensionInHierarchy(uClass,str)) {
							getParseResult().addErrorMessage( new ErrorMessage( 225, inUmpleClassifier.getPosition(0),bindingValue, gtParameter.getName(),inGeneralTPAppliedByName.getInheritanceName(),type,inUmpleClassifier.getName(), str ) ); 
					 		return;
						}
					} else if (getModel().getUmpleInterface(str)!=null){ 
						if (!checkInterfaceImplementationInHeirarchy(uClass,str)) {
							getParseResult().addErrorMessage( new ErrorMessage( 206, inUmpleClassifier.getPosition(0),bindingValue, gtParameter.getName(),inGeneralTPAppliedByName.getInheritanceName(),type,inUmpleClassifier.getName(), str ) ); 
					 		return;
						}
					}
				}	
			}	
		}
	}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 726 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private boolean checkInterfaceImplementationInHeirarchy(UmpleClass inClass, String name){
    if (inClass==null) return false;
    for(UmpleInterface uInterface : inClass.getParentInterface()){
		if (uInterface.getName().equals(name)){	return true; }
		if (CheckInterfaceInInTerfaceHierarchy(uInterface,name)) {return true;}
	}
	return checkInterfaceImplementationInHeirarchy(inClass.getExtendsClass(),name);
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 737 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private boolean CheckInterfaceInInTerfaceHierarchy(UmpleInterface inInterface, String name){
    for (UmpleInterface uInterface : inInterface.getExtendsInterface()) {
		  if (uInterface.getName().equals(name)) {return true;}
		  if (CheckInterfaceInInTerfaceHierarchy(uInterface,name)) {return true;}
	  }
	return false;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 747 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private boolean checkClassExtensionInHierarchy(UmpleClass inClass, String name){
    if (inClass==null) return false;
		if (inClass.getName().equals(name)){return true; }
		if (inClass.hasExtendsClass()) {
			if (inClass.getExtendsClass().getName().equals(name)){return true; }
		} else return false;				
		return checkClassExtensionInHierarchy(inClass.getExtendsClass(),name);
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 804 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void ApplyTypeParametersToTypeParameters(GeneralTPApplied newGTPA, GeneralTPApplied currentGTPA, UmpleTrait inTrait){
    if (currentGTPA == null && inTrait.getGeneralTemplateParameters().size()==0) return;
    for (GeneralTemplateParameter gtp : inTrait.getGeneralTemplateParameters()){
      String newName = (currentGTPA!=null && currentGTPA.getParameterMapping().containsKey(gtp.getName())) ? currentGTPA.getParameterMapping().get(gtp.getName()) : gtp.getDefaultValue();
      for(Map.Entry<String,String> entry : newGTPA.getParameterMapping().entrySet()){
        if (entry.getValue().equals(gtp.getName()) ){
          entry.setValue(newName);
        }
      }
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 818 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void ApplyTypeParametersToMethod(Method newMethod, GeneralTPApplied inGeneralTPApplied, UmpleTrait inTrait){
    if (inGeneralTPApplied == null && inTrait.getGeneralTemplateParameters().size()==0) return;
     for (GeneralTemplateParameter gtp : inTrait.getGeneralTemplateParameters()){
       String newName = (inGeneralTPApplied!=null && inGeneralTPApplied.getParameterMapping().containsKey(gtp.getName())) ? inGeneralTPApplied.getParameterMapping().get(gtp.getName()) : gtp.getDefaultValue();
       if (newMethod.getType().equals(gtp.getName())){
         newMethod.setType(newName);
       }
       for (int i = 0; i < newMethod.numberOfMethodParameters(); i++) {
         if(newMethod.getMethodParameter(i).getType().equals(gtp.getName())){
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
  // line 835 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void ApplyTypeParametersToAttribute(Attribute newAttribute, GeneralTPApplied inGTPApplied, UmpleTrait inTrait){
    if (inGTPApplied == null && inTrait.getGeneralTemplateParameters().size()==0) return;
    for (GeneralTemplateParameter gtp : inTrait.getGeneralTemplateParameters()){
      String newName = (inGTPApplied!=null && inGTPApplied.getParameterMapping().containsKey(gtp.getName())) ? inGTPApplied.getParameterMapping().get(gtp.getName()) : gtp.getDefaultValue();
      if (newAttribute.getType().equals(gtp.getName())){
        newAttribute.setType(newName);
      }
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 851 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void checkTypeParameterAvailability(GeneralTPApplied inGeneralTPApplied){
    if (inGeneralTPApplied == null ) return;
    UmpleTrait localTrait = getModel().getUmpleTrait(inGeneralTPApplied.getInheritanceName());
    if (localTrait==null) {
    	/*
    	 * This is necessary because the current approach in Umple is that it raises a warning for no seeing the trait.
    	 * However, in this case I need to raise an error because I cannot continue. 
    	 */ 
    	getParseResult().addErrorMessage(new ErrorMessage(202,inGeneralTPApplied.getPositions(),inGeneralTPApplied.getInheritanceName()));
    	return;
    }
    for (GeneralTemplateParameter gtp : localTrait.getGeneralTemplateParameters()) {
	    if (! inGeneralTPApplied.getParameterMapping().containsKey(gtp.getName()) && gtp.getDefaultValue().equals("") ){
	 	   getParseResult().addErrorMessage(new ErrorMessage(219,inGeneralTPApplied.getPositions(),gtp.getName(),localTrait.getName())); 
	 	   return;
	    }
    }	
    for (String	typeName : inGeneralTPApplied.getParameterMapping().keySet()) {
	    if (!localTrait.hasGeneralTemplateParameter(typeName)){
	 	   getParseResult().addErrorMessage(new ErrorMessage(215,inGeneralTPApplied.getPositions(),typeName)); 
	 	   return;
	    }
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 879 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void applyTraitProperties(UmpleClass inClass, UmpleTrait inTrait){
    //set the singleton pattern
		if (! inClass.getIsSingleton()) inClass.setIsSingleton(inTrait.getIsSingleton());
		
		//set abstract keyword
		//if (! inClass.getIsAbstract())	inClass.setIsAbstract(inTrait.getIsAbstract());
		
		//set the comments
		for(Comment aComment : inTrait.getComments()) {
			inClass.addComment(aComment);
		}		
		
		//set the dependens
		for(Depend aDepend : inTrait.getDepends()) {
			inClass.addDepend(aDepend);
		}		
							
		// copy Precondition
		for(Precondition aPrecondition : inTrait.getPreConds()) {
			inClass.addPreCond(aPrecondition);
		}	
		
		// copy Postcondition
		for(Postcondition aPostcondition : inTrait.getPostConds()) {
			inClass.addPostCond(aPostcondition);
		}	
		
		for (UmpleTestCase tc: inTrait.getUmpleTestCases())
		{
			//copyTestCasesFromTraitsToClass(inClass);
			//inClass.addUmpleTestCase(tc);
			//copyTestCasefromExtendedTrait(inClass, inTrait);
		}					

		//copy attributes
		/*
		for(Attribute aAttribute : inTrait.getAttributes()) {
			//check for attributes which have already existed.
			Integer index = inTrait.getGeneralTemplateParameterIndexByName(aAttribute.getName(),"attribute");
			if (index>=0){
				if (inClass.hasGeneralTPApplieds()) {
					GeneralTPApplied gtp = inClass.getGeneralTPAppliedByName(inTrait.getName());
					if (gtp != null){
						aAttribute.setName(	gtp.getParameter(index));
						inClass.addAttribute(aAttribute);
					}
							
				}
			} else {
				inClass.addAttribute(aAttribute);
			}
		}
		*/
		
		// copy Constraints
		for(ConstraintTree aConstraint : inTrait.getConstraintTrees()) {
			inClass.addConstraintTree(aConstraint);
		}	
		
// copy injection codes
       for (CodeInjection cj : inTrait.getCodeInjections()) {
               cj.setUmpleClassifier(inClass);
               inClass.addCodeInjection(cj);
       }
Label_AspectInjection_114: ;
       // copy Extra code
       inClass.appendExtraCode(inTrait.getExtraCode());
       
       // copy associations
       /*
       for (AssociationVariable aVariable : inTrait.getAssociationVariables()) {
    	   aVariable.setUmpleClass(inClass);
    	   UmpleClass relatedAss =  model.getUmpleClass(aVariable.getType()); 	   
    	   aVariable.getRelatedAssociation().setUmpleClass(relatedAss);
    	   aVariable.getRelatedAssociation().setType(inClass.getName());
	       String rawName = StringFormatter.toCamelCase(inTrait.getName());
	       String name = aVariable.getRelatedAssociation().getMultiplicity().isMany() ? model.getGlossary().getPlural(rawName) : rawName;
	       if (name.equals(aVariable.getRelatedAssociation().getName())){
	    	   rawName = StringFormatter.toCamelCase(inClass.getName());
	    	   name = aVariable.getRelatedAssociation().getMultiplicity().isMany() ? model.getGlossary().getPlural(rawName) : rawName;
	    	   aVariable.getRelatedAssociation().setName(name);
	       }
	       inClass.addAssociationVariable(aVariable);    
       }
       */
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 962 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void postTokenTraitAnalysis(){
    addUnlinkedExtendTraits();
		if ( getParseResult().getWasSuccess() ) {
			checkTraitsNamesWithClasses();
			checkTraitsNameWithInterfaces();
			checkCyclicTraitInheritance();
			checkTypeParametersAvailability();
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 975 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void addUnlinkedExtendTraits(){
    for (UmpleClassifier c : unlinkedExtends.keySet())
    {
      UmpleTrait child = null; // unlinkedExtends guaranteed to contain only UmpleTraits
      if (c instanceof UmpleTrait){
        child = (UmpleTrait) c;
      }  
    
      List<String> extendsNames = unlinkedExtends.get(child);    
      List<Token>  extendsToken = unlinkedExtendsTokens.get(child);

      if (extendsNames == null)
      {
        continue;
      }

      for (int i=0; i < extendsNames.size();i++){
        String extendName= extendsNames.get(i);
        Position pos;
		try
		{
			pos = extendsToken.get(i).getPosition();
		}
		catch(Exception e)
		{
			pos = new Position("",0,0,0);
		}
        if (isUmpleTrait(extendName) ) {
			
			//checking cyclically
			if (child.getName().equals(extendName)) {
				setFailedPosition(pos, 204, child.getName());
			    return;
			}
			
			UmpleTrait parent = model.getUmpleTrait(extendName);
		     
		    boolean wasSet = child.addExtendsTrait(parent);
		    if (!wasSet) {
				// TODO 1: the error code should be chnaged.            
			    setFailedPosition(pos, 16, child.getName(), parent.getName());
			    return;
		    }
		    /*
		    try
		    {
		    	child.setExtendsToken(extendsToken.get(i));
		    }
		    catch(Exception e){}   	  
		    */     
        } else if(!isUmpleClass(extendName)){
        	child.addRequiredInterface(model.getUmpleInterface(extendName));
        } else {
			setFailedPosition(pos, 202, extendName);
			return;
		}
      }
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1037 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void checkTypeParametersAvailability(){
    for (UmpleClass uClass : getModel().getUmpleClasses()) {
      for (UmpleTrait uTrait : uClass.getExtendsTraits()) {
        checkTypeParametersValid(uClass, uTrait);
      }     
      for (GeneralTPApplied gTPApplied : uClass.getGeneralTPApplieds()) {
        checkTypeParameterAvailability(gTPApplied);
      }
    }
    for (UmpleTrait uTrait : getModel().getUmpleTraits()) {
      for (UmpleTrait inTrait : uTrait.getExtendsTraits()) {
        checkTypeParametersValid(uTrait, inTrait);
      } 
      for (GeneralTPApplied gTPApplied : uTrait.getGeneralTPApplieds()) {
        checkTypeParameterAvailability(gTPApplied);
      }
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1058 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void checkTypeParametersValid(UmpleClassifier inUmpleClassifier, UmpleTrait uTrait){
    if (uTrait.numberOfGeneralTemplateParameters()>0){
      boolean requireGTPApplied = false;
       String requiredTPName = "";
      for (GeneralTemplateParameter gtp :uTrait.getGeneralTemplateParameters()){
        if (gtp.getDefaultValue().equals("")){
          requireGTPApplied = true;
          requiredTPName = gtp.getName();
        }
      }     
      if (requireGTPApplied){
        boolean find = false;
        List<GeneralTPApplied> gtpApplied = (inUmpleClassifier instanceof UmpleClass) ? ((UmpleClass)inUmpleClassifier).getGeneralTPApplieds() : ((UmpleTrait)inUmpleClassifier).getGeneralTPApplieds();
        for (GeneralTPApplied gTPApplied : gtpApplied) {
          if(gTPApplied.getInheritanceName().equals(uTrait.getName()))  find = true; 
        }
        if (!find){
          getParseResult().addErrorMessage( new ErrorMessage( 219, inUmpleClassifier.getPosition(0),requiredTPName , uTrait.getName() ) ); 
          return;
        }
      }
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * Check traits to have unique names;
   */
  // line 1085 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void checkTraitsNamesWithClasses(){
    for (UmpleTrait uTrait : getModel().getUmpleTraits()) {
			for(UmpleClass uClass : getModel().getUmpleClasses()) {
				if (uTrait.getName().equals(uClass.getName())) {
          			getParseResult().addErrorMessage(new ErrorMessage(203,uTrait.getPosition(0),"class",uTrait.getName()));
          			return;
				}
			}
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1098 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void checkTraitsNameWithInterfaces(){
    for (UmpleTrait uTrait : getModel().getUmpleTraits()) {
		  for (UmpleInterface uInterface : getModel().getUmpleInterfaces()) {
			  if (uTrait.getName().equals(uInterface.getName())) {
        			getParseResult().addErrorMessage(new ErrorMessage(203,uTrait.getPosition(0),"interface",uTrait.getName()));
        			return;
				}
		  }
	  }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1111 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void checkCyclicTraitInheritance(){
    for (UmpleTrait uTrait : getModel().getUmpleTraits()) {
			if (uTrait.hasExtendsTraits()) {
				checkCyclicTraitInheritance(uTrait,uTrait);
			}
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1121 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void checkCyclicTraitInheritance(UmpleTrait base, UmpleTrait root){
    if (base.getExtendsTraits().contains(root)) {
			 getParseResult().addErrorMessage(new ErrorMessage(205,base.getPosition(0),base.getName(), root.getName()));
			 return;
		 } else {
			 for (UmpleTrait uTrait :base.getExtendsTraits()) {
				 checkCyclicTraitInheritance(uTrait,root);
				 return;
			 }
		 }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1135 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void checkAllRequiredMethodsAndInterfaces(){
    if ( getParseResult().getWasSuccess() ) {
		  for(UmpleClass uClass : getModel().getUmpleClasses()) {
			  for(UmpleTrait uTrait : uClass.getExtendsTraits())  {
				recursiveCheckRequiredMethods(uClass,uTrait,uClass.getGeneralTPAppliedByName(uTrait.getName()));
				recursiveCheckRequiredInterfaces(uClass, uTrait,uTrait.getName());
			  }
		  }
	  }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1148 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void recursiveCheckRequiredInterfaces(UmpleClass inClass, UmpleTrait inTrait, String topTrait){
    for (UmpleInterface uInterface : inTrait.getRequiredInterfaces()) {
		if (inClass.isIsAbstract()){
    		inClass.addParentInterface(uInterface);
    	} else if (!checkInterfaceImplementationInHeirarchy(inClass,uInterface.getName())){
			getParseResult().addErrorMessage(new ErrorMessage(222,inClass.getPosition(0),inClass.getName(),uInterface.getName(),topTrait));
		    return;
		}
	}
	for (UmpleTrait uTrait : inTrait.getExtendsTraits()) {
		recursiveCheckRequiredInterfaces(inClass,uTrait,topTrait);
	}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1164 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void recursiveCheckRequiredMethods(UmpleClass inClass, UmpleTrait inTrait, GeneralTPApplied inGeneralTPApplied){
    if ( !getParseResult().getWasSuccess() ) return; 
	  for (UmpleTrait uTrait : inTrait.getExtendsTraits()) {
      GeneralTPApplied newGeneralTPApplied =inTrait.getGeneralTPAppliedByName(uTrait.getName())!=null ? new GeneralTPApplied(inTrait.getGeneralTPAppliedByName(uTrait.getName())) : null;
      if (newGeneralTPApplied!=null)  ApplyTypeParametersToTypeParameters(newGeneralTPApplied,inGeneralTPApplied,inTrait);
      recursiveCheckRequiredMethods(inClass,uTrait,newGeneralTPApplied);
    }
	  for (Method uMethod : inTrait.getMethods() ) {
		  if (uMethod.isIsAbstract()) {
			  Method newMethod = new Method(uMethod);
			  ApplyTypeParametersToMethod(newMethod,inGeneralTPApplied,inTrait);
			  if(inClass.isIsAbstract()){
				  newMethod.getComment(2).setText(newMethod.getComment(2).getText()+"'"+inClass.getName()+"' ");
				  newMethod.setSource(Method.Source.fTrait);
					inClass.addMethod(newMethod);   
			  } else  if(!inClass.hasImplementedMethodIncludingWithinParentClasses(newMethod)){
				  getParseResult().addErrorMessage(new ErrorMessage(208,newMethod.getPosition(),newMethod.getName(),inTrait.getName(),inClass.getName()));
				  return;
			  }
		  }
	  }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * 
   * This section is related to codes which is going to support general templates for traits
   * 
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1195 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void proccessGeneralTemplateParameters(Token mainToken, UmpleTrait aTrait){
    String name = "";
	   for (Token subToken : mainToken.getSubTokens()) {		   
		   if (subToken.is("traitFullParameters")){
			   name = subToken.getSubToken(0).getValue();
			   GeneralTemplateParameter gtParameter = new GeneralTemplateParameter(name,"");
			   if (aTrait.hasGeneralTemplateParameter(name)){
					  getParseResult().addErrorMessage(new ErrorMessage(214,subToken.getPosition(),name,aTrait.getName() ));
					  return;
			   }
			   for (int i =1;i<subToken.numberOfSubTokens(); i++){
				   if(subToken.getSubToken(i).is("tInterface")){
					   gtParameter.addInterfacesAndClass(subToken.getSubToken(i).getValue());
				   } else if(subToken.getSubToken(i).is("defaultType")){
             //This code will be executed once. A parameter has always a default value;
             gtParameter.setDefaultValue(subToken.getSubToken(i).getValue());
           }
			   }
			   aTrait.addGeneralTemplateParameter(gtParameter);
		   }
	  }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1220 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void processGTemplateParameterAssignment(Token mainToken, UmpleClassifier aClassifier, String extendName){
    GeneralTPApplied aGeneralTPApplied = new GeneralTPApplied(extendName);
      aGeneralTPApplied.setPositions(mainToken.getPosition());
      String parameterName;
      for(Token subToken : mainToken.getSubTokens()) {
        if (subToken.is("iEFunction") || subToken.is("functionAliasName")) {
          if (subToken.getSubToken("smName")!=null | subToken.getSubToken("smPattern")!=null ){
              Label_StateMachine_115: ;
          }else{
            MethodTemplateSignature mtSignature =obtainMethodTemplateSignature(subToken);
            if (! aGeneralTPApplied.hasMethodTemplateSignature(mtSignature)){ 
              aGeneralTPApplied.addMethodTemplateSignature(mtSignature);
            } else {
              getParseResult().addErrorMessage(new ErrorMessage(211,subToken.getPosition(),aGeneralTPApplied.getInheritanceName(),mtSignature.getMethod().getName() ));
                return;
            }
          }
        } 
        Label_StateMachine_116: ;

        else if (subToken.is("traitAppliedParameters")){
            parameterName = subToken.getValue("pName");
            if (aGeneralTPApplied.getParameterMapping().containsKey(parameterName)){
              getParseResult().addErrorMessage(new ErrorMessage(216,subToken.getPosition(),parameterName));
              return;
            }
            aGeneralTPApplied.getParameterMapping().put(parameterName, subToken.getValue("rName"));       
        } 
      }
    if (aClassifier instanceof UmpleClass) {
      ((UmpleClass)aClassifier).addGeneralTPApplied(aGeneralTPApplied);
    } else if (aClassifier instanceof UmpleTrait) {
      ((UmpleTrait)aClassifier).addGeneralTPApplied(aGeneralTPApplied);
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1263 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void extractIEParameters(Token inToken, Method method){
    if (inToken.getSubToken("iEParameterList") != null){
        for (Token subToken : inToken.getSubToken("iEParameterList").getSubTokens()) {
          if (subToken.is("parameter")) {
            method.addMethodParameter(new MethodParameter("", subToken.getValue(), "", "", false));
          }
        }
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1275 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private MethodTemplateSignature obtainMethodTemplateSignature(Token inToken){
    String modifier="",aliasName ="";
    String methodName = inToken.getValue("methodName");
    String iEVisibility = "";
      if (inToken.getValue("modifier") != null) modifier = inToken.getValue("modifier");
    if (inToken.getValue("aliasName") != null) aliasName = inToken.getValue("aliasName");
    if (inToken.getValue("iEVisibility") != null)  iEVisibility = inToken.getValue("iEVisibility");
    Method method = new Method(iEVisibility, methodName, "", false); 
    extractIEParameters(inToken, method);     
    MethodTemplateSignature mtSignature = new MethodTemplateSignature(modifier,aliasName, method); 
    return mtSignature;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1295 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void copyAttributesFromTraitsToClass(UmpleClass inClass){
    Map<UmpleTrait, List<Attribute>> traitAttributes = new HashMap<UmpleTrait, List<Attribute>>();
	Map<UmpleTrait, List<Attribute>> tempTraitAttributes = new HashMap<UmpleTrait, List<Attribute>>();
	for (UmpleTrait uTrait : inClass.getExtendsTraits()) {
		tempTraitAttributes = gatherAttributes(uTrait,inClass.getGeneralTPAppliedByName(uTrait.getName()));
		if ( ! getParseResult().getWasSuccess() ) return;
		if (checkAttComeFromTraitsIsAvaiableInClass(tempTraitAttributes,inClass) ) return;
		if (CheckAttComeFromTraitsIsAvaialbleInOtherTraits(traitAttributes,tempTraitAttributes)) return;
		AddAttMapToAnother(traitAttributes,tempTraitAttributes);
	}
	for (UmpleTrait t1 : traitAttributes.keySet()) {
		for (Attribute attribute : traitAttributes.get(t1)) {
			//I need some comment for users in generated code;
			//attribute.getComment(2).setText(attribute.getComment(2).getText()+"'"+inClass.getName()+"' ");
			attribute.setSource(Attribute.Source.fTrait);
			inClass.addAttribute(attribute);  
		}
	}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * 
   * end of a special section
   * 
   */
  // line 1357 "../../../../src/UmpleInternalParser_CodeTrait.ump"
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


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1383 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private boolean checkAttComeFromTraitsIsAvaiableInClass(Map<UmpleTrait,List<Attribute>> inTraitAttributes, UmpleClass inClass){
    for (UmpleTrait uTrait : inTraitAttributes.keySet()){
    	for (int i = 0; i < inTraitAttributes.get(uTrait).size(); i++) {
    		Attribute attribute= inTraitAttributes.get(uTrait).get(i);
			Attribute internalAttribute = inClass.getAttribute(attribute.getName());
			if (internalAttribute !=null) {
				if (internalAttribute.getType().equals(attribute.getType())){
					setFailedPosition(internalAttribute.getPosition(), 218, internalAttribute.getName(),uTrait.getName(),"class", inClass.getName());
					inTraitAttributes.get(uTrait).remove(i);
				} else{
					getParseResult().addErrorMessage(new ErrorMessage(206,inClass.getPosition(0),attribute.getName(), uTrait.getName(),inClass.getName() ));	
					return true;
				}
			}			
		}
	}
	return false;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1404 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private boolean CheckAttComeFromTraitsIsAvaialbleInOtherTraits(Map<UmpleTrait,List<Attribute>> inTraitAttributes, Map<UmpleTrait,List<Attribute>> inTempTraitAttributes){
    for (UmpleTrait uTrait : inTempTraitAttributes.keySet()){    	
    	for (int j = 0; j < inTempTraitAttributes.get(uTrait).size(); j++) {
    		Attribute attribute = inTempTraitAttributes.get(uTrait).get(j);
			for (UmpleTrait internalTrait : inTraitAttributes.keySet()) {
				for (int i = 0; i < inTraitAttributes.get(internalTrait).size(); i++) {
					Attribute internalAttribute = inTraitAttributes.get(internalTrait).get(i);
					if (attribute.getName().equals(internalAttribute.getName())){
						if(attribute.getType().equals(internalAttribute.getType()) && !uTrait.equals(internalTrait)){
							setFailedPosition(internalAttribute.getPosition(), 218, internalAttribute.getName(),uTrait.getName(),"trait", internalTrait.getName());
							inTempTraitAttributes.get(uTrait).remove(j);
						} else if (uTrait.equals(internalTrait) && attribute.getType().equals(internalAttribute.getType())){
							inTraitAttributes.get(internalTrait).remove(internalAttribute);
						} else {
							if (uTrait.equals(internalTrait)){
								getParseResult().addErrorMessage(new ErrorMessage(217,uTrait.getPosition(0),attribute.getName(), uTrait.getName(),attribute.getType() ,internalAttribute.getType()));	
							} else{
								getParseResult().addErrorMessage(new ErrorMessage(206,uTrait.getPosition(0),attribute.getName(), uTrait.getName(),internalTrait.getName() ));	
								
							}
							return true;
						}
					}
				}
			}
		}
	}	
	return false;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1436 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private GeneralTPApplied getNewGeneralTPAppliedWithP2P(UmpleTrait inTrait, UmpleTrait uTrait, GeneralTPApplied inGTPApplied){
    GeneralTPApplied newGeneralTPApplied = null;
    if (inTrait.getGeneralTPAppliedByName(uTrait.getName()) !=null) {  
      newGeneralTPApplied = new GeneralTPApplied(inTrait.getGeneralTPAppliedByName(uTrait.getName()));
      ApplyTypeParametersToTypeParameters(newGeneralTPApplied,inGTPApplied,inTrait);
    }
    return newGeneralTPApplied;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1447 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void checkMethodComeFromTraitsIsAvaiableInClass(Map<UmpleTrait,List<Method>> inTempTraitMethods, UmpleClass inClass){
    for (UmpleTrait uTrait : inTempTraitMethods.keySet()){
		for (int i = 0; i < inTempTraitMethods.get(uTrait).size(); i++) {
			if (inClass.hasMethod(inTempTraitMethods.get(uTrait).get(i))){
				inTempTraitMethods.get(uTrait).remove(i);
			}
		}
	}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1459 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private boolean CheckMethodComeFromTraitsIsAvaialbleInOtherTraits(Map<UmpleTrait,List<Method>> inTraitMethods, Map<UmpleTrait,List<Method>> inTempTraitMethods, UmpleClassifier inClassifier){
    for (UmpleTrait uTrait : inTraitMethods.keySet()){
		for (Method method : inTraitMethods.get(uTrait)) {
			for (UmpleTrait internalTrait : inTempTraitMethods.keySet()) {
				for (int i = 0; i < inTempTraitMethods.get(internalTrait).size(); i++) {
					Method internalMethod = inTempTraitMethods.get(internalTrait).get(i);
					if (compareTwoMethdos(method, internalMethod)){
						if (uTrait.equals(internalTrait)){
							inTempTraitMethods.get(internalTrait).remove(i);
						} else if (inClassifier instanceof UmpleTrait){
							if (uTrait.equals((UmpleTrait)inClassifier)){
								inTempTraitMethods.get(internalTrait).remove(i);
							} else {
								getParseResult().addErrorMessage(new ErrorMessage(210,inClassifier.getPosition(0),"trait", inClassifier.getName(),method.getName(),uTrait.getName(),internalTrait.getName()));	
								return true;
							}
						} else {
							String type = "trait";	
							if (inClassifier instanceof UmpleClass) type = "class";
		
							getParseResult().addErrorMessage(new ErrorMessage(210,inClassifier.getPosition(0),type, inClassifier.getName(),method.getName(),uTrait.getName(),internalTrait.getName()));	
							return true;
						}
					}
				}
			}
		}
	}	
	return false;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1492 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void AddMethodMapToAnother(Map<UmpleTrait,List<Method>> inTraitMethods, Map<UmpleTrait,List<Method>> inTempTraitMethods){
    for (UmpleTrait uTrait : inTempTraitMethods.keySet()) {
		if (inTraitMethods.containsKey(uTrait)){
			for (Method method : inTempTraitMethods.get(uTrait)) {
				inTraitMethods.get(uTrait).add(method);
			}
		} else{
			inTraitMethods.put(uTrait, inTempTraitMethods.get(uTrait));
		}	
	}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1506 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void AddAttMapToAnother(Map<UmpleTrait,List<Attribute>> inTraitAttributes, Map<UmpleTrait,List<Attribute>> inTempTraitAttributes){
    for (UmpleTrait uTrait : inTempTraitAttributes.keySet()) {
		if (inTraitAttributes.containsKey(uTrait)){
			for (Attribute attribute : inTempTraitAttributes.get(uTrait)) {
				inTraitAttributes.get(uTrait).add(attribute);
			}
		} else{
			inTraitAttributes.put(uTrait, inTempTraitAttributes.get(uTrait));
		}	
	}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1524 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void ApplyExludeIncludeAliasToMethod(Map<UmpleTrait,List<Method>> intraitMethods, GeneralTPApplied inGTPApplied){
    if (inGTPApplied == null) return; 
  for(Map.Entry<UmpleTrait, List<Method>> entry : intraitMethods.entrySet()){
    List<Method> shouldBeIncluded = new ArrayList<Method>();
    for(Iterator<Method> iterator = entry.getValue().iterator(); iterator.hasNext();){
      Method method = iterator.next();
      MethodTemplateSignature mTSignature = inGTPApplied.hasMethod(method);
     if (mTSignature!=null){
       if (mTSignature.getModifier().equals("-")){
         iterator.remove();
       } else if (mTSignature.getModifier().equals("+")){
         if (!mTSignature.getAlias().equals("")){
           Method temMethod = new Method(method);
           temMethod.setName(mTSignature.getAlias());
           if (checkMethodInMapTraitsMethod(intraitMethods,temMethod)!=null){
             getParseResult().addErrorMessage(new ErrorMessage(220,inGTPApplied.getPositions(),mTSignature.getAlias(),mTSignature.getMethod().getName()));  
             return;
           }
           method.setName(mTSignature.getAlias());

           }
         if (!mTSignature.getMethod().getModifier().equals("")){
           method.setModifier(mTSignature.getMethod().getModifier());
           //here I must check this new name is unique.
         }
         shouldBeIncluded.add(method);
      } else if (mTSignature.getModifier().equals("")){
        if (!mTSignature.getAlias().equals("")){
           Method temMethod = new Method(method);
           temMethod.setName(mTSignature.getAlias());
           if (checkMethodInMapTraitsMethod(intraitMethods,temMethod)!=null){
             getParseResult().addErrorMessage(new ErrorMessage(220,inGTPApplied.getPositions(),mTSignature.getAlias(),mTSignature.getMethod().getName()));  
             return;
           }
          method.setName(mTSignature.getAlias());
        }           
        if (!mTSignature.getMethod().getModifier().equals("")){
          method.setModifier(mTSignature.getMethod().getModifier());
        }
      }
     }
    }
    if (shouldBeIncluded.size()>0)  intraitMethods.put(entry.getKey(), shouldBeIncluded) ;
  }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1572 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private Method checkMethodInMapTraitsMethod(Map<UmpleTrait,List<Method>> inTraitMethods, Method inMethod){
    for (UmpleTrait uTrait : inTraitMethods.keySet()) {
		   for (Method method : inTraitMethods.get(uTrait)) {
			   if (compareTwoMethdos(method, inMethod)){
				   return method;
			   }	
		   }
	   }
	   return null;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1585 "../../../../src/UmpleInternalParser_CodeTrait.ump"
   private void checkTemplateParametersValidity(){
    List<String> multipleClasses = new ArrayList<String>();
	   for ( UmpleTrait uTrait: getModel().getUmpleTraits()) {
		   for (GeneralTemplateParameter gtParameter : uTrait.getGeneralTemplateParameters()) {
			   multipleClasses.clear();
			   for (String str : gtParameter.getInterfacesAndClass()) {
				   if (getModel().getUmpleClass(str)!=null) {
					   multipleClasses.add(str);
					   if (multipleClasses.size()>=2){
						   getParseResult().addErrorMessage( new ErrorMessage( 224, uTrait.getPosition(0), gtParameter.getName(), uTrait.getName(),multipleClasses.get(0),multipleClasses.get(1) ) ); 
						   return;
					   }
				   } else if (getModel().getUmpleInterface(str)!=null) {
					   
				   } else {
					   getParseResult().addErrorMessage( new ErrorMessage( 223, uTrait.getPosition(0), str, gtParameter.getName(), uTrait.getName()) ); 
					   return;
				   }
			   }
		   }	
	   }
  }

  // line 202 "../../../../src/Trait_refactored.ump"
   private boolean associationIsBetweenClassAndTrait(Association a){
    AssociationEnd myEnd = a.getEnd(0);
         AssociationEnd yourEnd = a.getEnd(1);
         
         UmpleTrait myClass = model.getUmpleTrait(myEnd.getClassName());
          UmpleClass yourClass = model.getUmpleClass(yourEnd.getClassName());
         
         if (myClass != null && yourClass != null ){ //association is between class and interface
           return true;
         }
         
         return false;
  }

  // line 27 "../../../../src/UmpleInternalParser_CodeConstraints.ump"
   private void postTokenModelConstraintAnalysis(){
    for(UmpleClass uClass:model.getUmpleClasses())
    {
      for(ModelConstraint modelConstraint:uClass.getModelConstraints())
      {
        ModelConstraintResult result = modelConstraint.evaluate(uClass);
        if(result!=ModelConstraint.SUCCESS)
        {
          setFailedPosition(result.getPosition(),result.getError(),result.getTarget(),result.getSource());
        }
      }
    }
  }

  // line 42 "../../../../src/UmpleInternalParser_CodeConstraints.ump"
   private void analyzePrecondition(Token preconditionToken, UmpleClassifier uClassifier, Method method){
    if(((PreconditionAnalyzer)model.getAnalyzer("precondition"))!=null){
      ((PreconditionAnalyzer)model.getAnalyzer("precondition")).setUClassifier(uClassifier);
      ((PreconditionAnalyzer)model.getAnalyzer("precondition")).setMethod(method);
      model.getAnalyzer("precondition").analyzeToken(preconditionToken);
    }
  }

  // line 52 "../../../../src/UmpleInternalParser_CodeConstraints.ump"
   private void analyzePostcondition(Token postconditionToken, UmpleClassifier uClassifier, Method method){
    if(((PostconditionAnalyzer)model.getAnalyzer("postcondition"))!=null){
      ((PostconditionAnalyzer)model.getAnalyzer("postcondition")).setUClassifier(uClassifier);
      ((PostconditionAnalyzer)model.getAnalyzer("postcondition")).setMethod(method);
      model.getAnalyzer("postcondition").analyzeToken(postconditionToken);
    }
  }


  /**
   * Analyzes a token recognized as a constraint
   * 
   * @param invariantToken The token containing the constraint.
   * @param aClass The Umple class for which an attribute is being constrained.
   */
  // line 67 "../../../../src/UmpleInternalParser_CodeConstraints.ump"
   private void analyzeInvariant(Token invariantToken, UmpleClassifier uClassifier){
    if(((InvariantAnalyzer)model.getAnalyzer("invariant"))!=null){
      ((InvariantAnalyzer)model.getAnalyzer("invariant")).setUClassifier(uClassifier);
      model.getAnalyzer("invariant").analyzeToken(invariantToken);
      if (uClassifier instanceof UmpleClass) {
        List<String> variableNames = new ArrayList<>();
        for (Attribute attr: ((UmpleClass)uClassifier).getAttributes()) {
          variableNames.add(attr.getName());
        }
        List<ConstraintTree> constraintTrees = ((UmpleClass)uClassifier).getConstraintTrees();
        String className = ((UmpleClass)uClassifier).getName();
        DataType type = checkVariableNamesAndTypes(variableNames, constraintTrees.get(constraintTrees.size() - 1), invariantToken, className);
        if (type != DataType.BOOL && type != null) {
          setFailedPosition(invariantToken.getPosition(), 29);
        }
      }
    }
  }


  /**
   * Analyzes a token recognized as a model contraint.
   * 
   * @param modelConstraintToken The token containing the constraint.
   */
  // line 92 "../../../../src/UmpleInternalParser_CodeConstraints.ump"
   private void analyzeModelConstraint(Token modelConstraintToken, UmpleClassifier uClassifier){
    if(((ModelConstraintBodyAnalyzer)model.getAnalyzer("modelConstraintBody"))!=null){
      model.getAnalyzer("modelConstraintBody").analyzeToken(modelConstraintToken);
      uClassifier.addModelConstraint(((ModelConstraintBodyAnalyzer)model.getAnalyzer("modelConstraintBody")).getModelConstraint());
      ((ModelConstraintBodyAnalyzer)model.getAnalyzer("modelConstraintBody")).reset();
    }
  }

  // line 100 "../../../../src/UmpleInternalParser_CodeConstraints.ump"
   private DataType getDataType(String type){
    if ("Float".equals(type) || "Double".equals(type) || "Integer".equals(type)) {
      return DataType.NUMBER;
    }
    if ("boolean".equals(type) || "Boolean".equals(type)) {
      return DataType.BOOL;
    }
    if ("String".equals(type)) {
      return DataType.STRING;
    }
    if ("Date".equals(type) || "Time".equals(type)) {
      return DataType.DATE;
    }
    // Null represents some type other than the Umple built in types
    return null;
  }

  // line 117 "../../../../src/UmpleInternalParser_CodeConstraints.ump"
   private DataType checkVariableNamesAndTypes(List<String> variableNames, ConstraintVariable cur, Token token, String className){
    if (cur instanceof ConstraintOperator) {
      DataType type1 = checkVariableNamesAndTypes(variableNames, ((ConstraintOperator)cur).getLeft(), token, className);
      DataType type2 = checkVariableNamesAndTypes(variableNames, ((ConstraintOperator)cur).getRight(), token, className);
      if (type1 != type2 && type1 != null && type2 != null) {
        // Data types must match, or be of non built in type
        setFailedPosition(token.getPosition(), 29);
      } else if ((type1 == DataType.STRING || type2 == DataType.STRING) &&
                 !("object==".equals(((ConstraintOperator)cur).getValue()) ||
                   "object!=".equals(((ConstraintOperator)cur).getValue()))) {
        // Strings can only be compared with == or !=
        setFailedPosition(token.getPosition(), 29);
      } else if ((type1 == DataType.BOOL || type2 == DataType.BOOL) &&
                 !("object==".equals(((ConstraintOperator)cur).getValue()) ||
                   "object!=".equals(((ConstraintOperator)cur).getValue()) ||
                   "||".equals(((ConstraintOperator)cur).getValue()) ||
                   "&&".equals(((ConstraintOperator)cur).getValue()))) {
        // Booleans can only be compared with ==, !=, ||, or &&
        setFailedPosition(token.getPosition(), 29);
      } else if ((type1 == DataType.NUMBER || type2 == DataType.NUMBER ||
                  type1 == DataType.DATE || type2 == DataType.DATE) &&
                  ("||".equals(((ConstraintOperator)cur).getValue()) ||
                  "&&".equals(((ConstraintOperator)cur).getValue()))) {
        // Numbers and Dates cannot be compared with || or &&
        setFailedPosition(token.getPosition(), 29);
      }
      return DataType.BOOL;
    } else if (cur instanceof ConstraintTree) {
      DataType type = checkVariableNamesAndTypes(variableNames, ((ConstraintTree)cur).getRoot(), token, className);
      if (((ConstraintTree)cur).getDisplayNegation()) {
        if (type != DataType.BOOL && type != null) {
          // Not operator can only act on booleans
          setFailedPosition(token.getPosition(), 29);
        }
      }
      return type;
    } else if (cur instanceof ConstraintLiteral) {
      if (cur instanceof ConstraintNumberLiteral) {
        return DataType.NUMBER;
      } else {
        return DataType.STRING;
      }
    } else if (cur instanceof ConstraintNamed) {
      if (!variableNames.contains(((ConstraintNamed)cur).getName())) {
        setFailedPosition(token.getPosition(), 28, ((ConstraintNamed)cur).getName(), className);
      }
      if (cur instanceof ConstraintAttribute) {
        return getDataType(((ConstraintAttribute)cur).getAttribute().getType());
      } else {
        // TODO: add checks for other types of ConstraintNamed such as ConstraintMethodParameter
      }
    }
    return null;
  }

  // line 1421 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void analyzeComponentToken(Token token, int analysisStep){
    compWalker.analyze(token, analysisStep);
  }

  // line 1425 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void postTokenComponentAnalysis(){
    compWalker.done();
  }


  /**
   * This MIXSET contains common code used by Template & Strcture.
   */
  // line 22 "../../../../src/Structure_refactored.ump"
   public boolean reAnalyze(){
    return shouldProcessAgain;
  }

  // line 25 "../../../../src/Structure_refactored.ump"
   public void reAnalyze(boolean re){
    shouldProcessAgain = re;
  }

  // line 835 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
   private void analyzeTemplateToken(Token token, int analysisStep){
    walker.analyze(token, analysisStep);
  }

  // line 839 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
   private void postTokenTemplateAnalysis(){
    walker.done();
  }


  /**
   * This is used for the cases that will be resolved by traits and we don't need to see those warnings.
   */
  // line 76 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void secondPostTokenAnalysis(){
    if (getParseResult().getWasSuccess())
    {
      postTokenStateMachineAnalysis();
    }
    if (getParseResult().getWasSuccess()){
      //Issue 492
      checkNonReachableStates();
    }
  }


  /**
   * Check if "extra code" is likely a malformed state machine
   */
  // line 88 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private boolean extraCodeIsMalformedStateMachine(Token extraCodeToken){
    String code = extraCodeToken.getValue();
    String[] parts = code.split("\\{");
    if(parts.length < 2) return false; // This means there are no opening brackets
    if(!Token.isValidIdentifier(parts[0].trim())) return false; //This means we don't have an identifier. If the SM name is misspelt, that should be picked up elsewhere.
    return true; //We have an identifier followed by a { followe by something else that is probably a state machine
  }


  /**
   * Checks to see if stateName is alpha-numeric or HStar, for deep history
   */
  // line 98 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void checkStateNameOfToken(Token myToken){
    boolean shouldBeLast = false;
    
    //Issue 148
    if (myToken.is("transition") || myToken.is("autoTransition") || myToken.is("standAloneTransition"))
    {
      String[] stateNames;
      
      if(myToken.is("transition") || myToken.is("autoTransition") )	
        stateNames = myToken.getValue("stateName").split("\\.");
      else
    	stateNames = myToken.getValue("fromState").split("\\.");
    	
      for(String stateName : stateNames)
      {
        if(shouldBeLast){setFailedPosition(myToken.getPosition(), 152, myToken.getValue("stateName"));}
        
        if (stateName.equals("HStar") || stateName.equals("H")){
          shouldBeLast = true; //HStar and H must be the last state in dotNotation
          continue;
        }
        
        if(!myToken.isValidIdentifier(stateName)){
          setFailedPosition(myToken.getPosition(), 152, myToken.getValue("stateName"));
        }
      }
    }
    else{
      if(!myToken.isValidIdentifier(myToken.getValue("stateName"))){
          setFailedPosition(myToken.getPosition(), 152, myToken.getValue("stateName"));
        }
    }
  }


  /**
   * Analyze state machine related tokens
   */
  // line 134 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void analyzeStateMachineToken(Token token, int analysisStep){
    if (analysisStep != 1)
    {
      return;
    }
  
    if (token.is("stateMachineDefinition"))
    {
      analyzeStateMachineDefinition(token);
    }
  }

  // line 147 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private String getThreadName(Token activeToken){
    Token name = activeToken.getSubToken("name");
    
    if (name == null)
    {
      return "thread1";
    }
    return name.getValue();
  }

  // line 158 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private String getActiveCode(Token activeToken){
    Token code = activeToken.getSubToken("code");
    
    return code.getValue();
  }

  // line 165 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void analyzeActiveObject(Token activeToken, UmpleClassifier uClassifier){
    transformIntoStateMachineToken(activeToken);
    analyzeStateMachine(activeToken, uClassifier);
  }


  /**
   * Restructure the [activeDefinition] token into a state machine token with a do activity
   */
  // line 172 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void transformIntoStateMachineToken(Token stateMachineToken){
    Token activeToken = stateMachineToken.detach("name","stateMachine" + numberOfActiveObjects);
    Token stateToken = new Token("state","START_TOKEN");
    Token subState = new Token("state", "START_TOKEN");
    Token doActivity = new Token("activity", "START_TOKEN");

    stateMachineToken.addSubToken(new Token("{", "STATIC"));
         
    stateToken.addSubToken(new Token("stateName","topLevel"));
    stateToken.addSubToken(new Token("{", "STATIC"));
    
    subState.addSubToken(new Token("stateName", getThreadName(activeToken)));
    subState.addSubToken(new Token("{", "STATIC"));
    
    doActivity.addSubToken(new Token("do", "STATIC"));
    
    // Add all multilingual code blocks to our do activity
    int numLangs = 0;
    List<Token> subTokens = activeToken.getSubTokens(); 
    for (Token t: subTokens)
    {
      if(t.is("codeLang"))
      {
        doActivity.addSubToken(t.copy());
        doActivity.addSubToken(new Token("{", "STATIC"));
        doActivity.addSubToken(activeToken.getSubToken("code",numLangs).copy());
        doActivity.addSubToken(new Token("}", "STATIC"));
        numLangs++;
      }
    }
    if (numLangs == 0)
    {
      // If no languages are specified in active block
      doActivity.addSubToken(new Token("{", "STATIC"));
      doActivity.addSubToken(activeToken.getSubToken("code",0).copy());
      doActivity.addSubToken(new Token("}", "STATIC"));
    }

    //Copy position information to the new do activity token
    doActivity.setPosition(activeToken.getPosition());
    doActivity.setEndPosition(activeToken.getEndPosition());

    subState.addSubToken(doActivity);
    stateToken.addSubToken(new Token("}", "STATIC"));
    stateToken.addSubToken(subState);
    stateToken.addSubToken(new Token("}", "STATIC"));
    stateMachineToken.addSubToken(stateToken);
    stateMachineToken.addSubToken(new Token("}", "STATIC"));
  }


  /**
   * Analyze state machine related tokens within the context of an Umple class
   */
  // line 224 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void analyzeStateMachineToken(Token token, UmpleClassifier uClassifier, int analysisStep){
    if (analysisStep != 1)
    {
      return;
    }
    
    if (token.is("stateMachine"))
    {
      if (uClassifier instanceof UmpleClass) {
	  	if (((UmpleClass)uClassifier).isImmutable())
		{
			setFailedPosition(token.getPosition(), 15, uClassifier.getName());
		    return;
		}
	  } 
    
else if (uClassifier instanceof UmpleTrait) {
        if (((UmpleTrait)uClassifier).isImmutable())
        {
          //TODO--- trait's code	
            setFailedPosition(token.getPosition(), 15, uClassifier.getName());
            return;
        }	
	    }
Label_Trait_120: ;

      
      Token subToken = token.getSubToken(0);
      if (subToken.is("activeDefinition"))
      {
        analyzeActiveObject(subToken, uClassifier);
        numberOfActiveObjects++;
      }
      
      if (subToken.is("enum") || subToken.is("inlineStateMachine"))
      {
        analyzeStateMachine(subToken,uClassifier);
      }
      
      if (subToken.is("referencedStateMachine"))
      {
        analyzedReferencedStateMachine(subToken,uClassifier);
      }
    }
  }

  // line 262 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private int numberOfActiveObjectsInClass(Token token, UmpleClassifier uClassifier){
    int activeObjects = 0;
    
    Token parent = token.getParentToken();
    if (parent != null)
    {
      for (Token sub : parent.getSubTokens())
      {
        if (sub.is("stateMachine"))
        {
          if (sub.getSubToken(0).is("activeDefinition"))
          {
            activeObjects++;
          }
        }
      }
    }
    
    return activeObjects;
  }

  // line 284 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void postTokenStateMachineAnalysis(){
    // Generate error message for issue 354. Check for conflicting names between
    // state machines and attributes as well as state machines and association names
    checkStateMachineNameConflict();

    for(Iterator<Map.Entry<State, List<Token>>> i = possiblyUnknownStates.entrySet().iterator(); i.hasNext();){
    	Map.Entry<State, List<Token>> entry = (Map.Entry<State, List<Token>>)i.next();
    	List<Token> tokens = (List<Token>)entry.getValue();
		for(int j = 0; j < tokens.size(); j++){
			//Issue 148
			if(tokens.get(j).is("standAloneTransition"))
			{
			  setFailedPosition(tokens.get(j).getPosition(), 50, entry.getKey().getName());
			}
			else
			  setFailedPosition(tokens.get(j).getPosition(), 50, tokens.get(j).getValue("stateName"));
		}    
    }
    possiblyUnknownStates = new HashMap<State,List<Token>>();
  }


  /**
   * Check for name conflicts between state machines and attributes/association names
   * Author: Blake Quebec Desloges
   */
  // line 310 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void checkStateMachineNameConflict(){
    for(UmpleClass C : model.getUmpleClasses())
    {    
      // Create the list of attribute names 
      List<String> existingAttributeNames = new ArrayList<String>();
      for (Attribute attr : C.getAttributes())
      {
      	existingAttributeNames.add(attr.getName());
      }
      
      //Create the list of state machine names while checking for conflicts with attributes
      List<String> existingStateMachineNames = new ArrayList<String>();
      for (StateMachine sm : C.getStateMachines())
      {
      	// Check if the current state machine conflicts with an attribute name
      	if (existingAttributeNames.contains(sm.getName()))
      	{
      	   Token stateMachineToken = stateMachineNameToToken.get(sm.getName());
          setFailedPosition(stateMachineToken.getPosition(), 52, sm.getName());
       }
       else
          existingStateMachineNames.add(sm.getName());
      }
      
      Boolean foundQueued = false;
      Boolean foundPooled = false;
      Boolean foundRegularSM = false;
      Boolean foundEventlessRegularSM = false;
      Token stateMachineToken=null;
      
      for (StateMachine sm : C.getStateMachines())
      {
        if(sm.getQueued())
        {
          foundQueued = true;
          stateMachineToken = stateMachineNameToToken.get(sm.getName());
        }
        else if(sm.getPooled())
        {
          foundPooled = true;
          stateMachineToken = stateMachineNameToToken.get(sm.getName());
        }
        else if(!sm.getQueued() && !sm.getPooled())
        {
          if(sm.getEvents().isEmpty())
          {
            foundEventlessRegularSM = true;
            foundRegularSM = true;
            stateMachineToken = stateMachineNameToToken.get(sm.getName());
          }
          else
          {
            foundEventlessRegularSM = false;
            foundRegularSM = true;
            stateMachineToken = stateMachineNameToToken.get(sm.getName());
          }
        }  
      }
      
      if (foundQueued == true && foundPooled == true && foundRegularSM == true)
      {
        //raise an error if QSM, PooledSM and RegularSM are used in the same class
        setFailedPosition(stateMachineToken.getPosition(), 58, C.getName());
      }
      else if(foundQueued == true && foundPooled == true && foundRegularSM == false)
      {
        //raise an error if QSM and PooledSM are used in the same class
        setFailedPosition(stateMachineToken.getPosition(), 59, C.getName());
      }
      else if(foundQueued == false && foundPooled == true && foundRegularSM == true && foundEventlessRegularSM == false)
      {
        //raise an error if PooledSM and RegularSM are used in the same class
        setFailedPosition(stateMachineToken.getPosition(), 60, C.getName());
      }
      else if(foundQueued == true && foundPooled == false && foundRegularSM == true && foundEventlessRegularSM == false)
      {
        //raise an error if QSM and RegularSM are used in the same class
        setFailedPosition(stateMachineToken.getPosition(), 61, C.getName());
      }

      List<String> existingAssociationNames = new ArrayList<String>();
      List<Association> visitedAssociations = new ArrayList<Association>();
      for(Association assoc : C.getAssociations())
      {
        if (visitedAssociations.contains(assoc))
        {
          continue;
        }
        
      	AssociationEnd firstEnd = assoc.getEnd(0);
      	AssociationEnd secondEnd = assoc.getEnd(1);
      	
      	Boolean checkFirstEnd = !firstEnd.getClassName().equals(C.getName());
      	Boolean checkSecondEnd = !secondEnd.getClassName().equals(C.getName());
      	Boolean associationIsReflexive = !checkFirstEnd && !checkSecondEnd;
      	
      	// check names on other-class end of associations to other classes
        if ((checkFirstEnd || associationIsReflexive) && assoc.getIsLeftNavigable())
        {
          // Check if the association name is the same as a state machine name
          if (existingStateMachineNames.contains(firstEnd.getRoleName()))
          {
             setFailedPosition(assoc.getTokenPosition(), 52, firstEnd.getRoleName());
          }
          else
          {
            existingAssociationNames.add(firstEnd.getRoleName());
          }
          
        }
        if ((checkSecondEnd || associationIsReflexive) && assoc.getIsRightNavigable())
        {
          // Check if the association name is the same as a state machine name
          if (existingStateMachineNames.contains(secondEnd.getRoleName()))
          {
             setFailedPosition(assoc.getTokenPosition(), 52, secondEnd.getRoleName());
          }
          else
          {
            existingAssociationNames.add(secondEnd.getRoleName());
          }
        }
         
        if (associationIsReflexive)
        { 
          // The UmpleClass is only expected to have duplicate references to reflexive associations
          visitedAssociations.add(assoc);
        }
      }
    }
  }

  // line 444 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void analyzeStateMachineDefinition(Token stateMachineDefinitionToken){
    StateMachine smd = analyzeStateMachine(stateMachineDefinitionToken,null);
    model.addStateMachineDefinition(smd);
  }

  // line 450 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void analyzedReferencedStateMachine(Token stateMachineToken, UmpleClassifier uClassifier){
    String name = stateMachineToken.getValue("name");

    if(!Token.isValidIdentifier(stateMachineToken.getValue("name"))){
    	setFailedPosition(stateMachineToken.getPosition(), 150, stateMachineToken.getValue("name"));
    }

    String definitionName = stateMachineToken.getValue("definitionName");
      
    Token stateMachineDefinitionToken = stateMachineNameToToken.get(definitionName);
    if (stateMachineDefinitionToken == null)
    {
      return;
    }

    StateMachine sm = new StateMachine(name);
    
if (uClassifier instanceof UmpleTrait){
        sm.setUmpleTrait((UmpleTrait)uClassifier);
      }
Label_Trait_121: ;
     if (uClassifier instanceof UmpleClass){
      sm.setUmpleClass((UmpleClass)uClassifier);
    }
    //------------
    boolean wasSet = true;
    if (uClassifier instanceof UmpleClass) {
    	wasSet = sm.setUmpleClass((UmpleClass)uClassifier);
    } 
    
else if (uClassifier instanceof UmpleTrait) {
        wasSet = sm.setUmpleTrait((UmpleTrait)uClassifier);
      }
Label_Trait_122: ;

    //------------
    if (!wasSet)
    {
    	// Future-proofing: currently all paths cause wasSet to be true

    	if (uClassifier instanceof UmpleClass) {
	    	setFailedPosition(stateMachineToken.getPosition(), 15, uClassifier.getName());
	    }
      
else if (uClassifier instanceof UmpleTrait) {
          //TODO --Trait's code
          setFailedPosition(stateMachineToken.getPosition(), 15, uClassifier.getName());
        }
Label_Trait_123: ;
 
    }
    
    populateStateMachine(stateMachineDefinitionToken,sm, uClassifier);
    Token extendedStateMachineTokens = stateMachineToken.getSubToken("extendedStateMachine");
    if (extendedStateMachineTokens != null)
    {
      populateStateMachine(extendedStateMachineTokens, sm, uClassifier);
    }
  }


  /**
   * Issue 531
   */
  // line 498 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void checkUnclearTransition(Token t){
    for(Token subToken : t.getSubTokens()){
           if(subToken.getValue("stateName") != null && subToken.is("state"))
               stateNames.add(subToken);
           if((subToken.is("transition")||subToken.is("autoTransition")) && subToken.getValue("stateName") != null)
               transitionNames.add(subToken);
           if(subToken.is("mixsetDefinition"))
           {
             innerMixsetTokens.add(subToken); 
             
           }  
           if(subToken.hasSubTokens())
               checkUnclearTransition(subToken);
               
       }
  }

  // line 516 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private StateMachine analyzeStateMachine(Token stateMachineToken, UmpleClassifier uClassifier){
    placeholderStateMachine = new StateMachine("PLACE_HOLDER");
    String name = stateMachineToken.getValue("name");

    if (name.equals("timer"))
    {
      getParseResult().addErrorMessage(new ErrorMessage(75, stateMachineToken.getSubToken("name").getPosition(), "" + stateMachineToken.getSubToken("name").getPosition().getLineNumber()));
    }

    if(!Token.isValidIdentifier(stateMachineToken.getValue("name"))){
    	setFailedPosition(stateMachineToken.getPosition(), 150, stateMachineToken.getValue("name"));
    }
    
    //Issue 531
    stateNames = new ArrayList<Token>();
    transitionNames = new ArrayList<Token>();
    innerMixsetTokens = new ArrayList<Token>();   
    
    checkUnclearTransition(stateMachineToken);
    for(Token transition : transitionNames){
        numberOfOcurrences = 0;
        for(Token state : stateNames)
            if(transition.getValue("stateName").equals(state.getValue("stateName")))
                numberOfOcurrences++;
        if(numberOfOcurrences > 1)
            getParseResult().addErrorMessage(new ErrorMessage(66,transition.getPosition(), transition.getValue("stateName")));
    }

     //Issue200
    StateMachine sm = null;
    
    if ((uClassifier != null) && (uClassifier instanceof UmpleClass)) 
    {
	    if(((UmpleClass)uClassifier).getStateMachine(name) != null)
	    {
	      	sm = ((UmpleClass)uClassifier).getStateMachine(name);
	    }
    }
    
    if(sm == null)
    {
    
	    if(model.getStateMachineDefinition(name) != null)
	    {
	      sm = model.getStateMachineDefinition(name);
	      Token stateToken;
	      
	      List<Token> smToken = stateMachineToken.getSubTokens();
	      int i = 0;
	      
	      while(i < stateMachineToken.numberOfSubTokens())
	      {
	    	  stateToken = smToken.get(i);
	    	  if(stateToken.is("state"))
	    	  {
	    		  
	    		  stateMachineNameToToken.get(name).addSubToken(stateToken.copy());
	    		  i++;
	    	  }
	    	  else
	    	  {
	    		  i++;
	    	  }
	    		  
	      }
	      
	    }
	    else
	    {
	      sm = new StateMachine(name);
        
if (uClassifier instanceof UmpleTrait){
            sm.setUmpleTrait((UmpleTrait)uClassifier);
          }
Label_Trait_124: ;

        if (uClassifier instanceof UmpleClass){
          sm.setUmpleClass((UmpleClass)uClassifier);
        }
	      stateMachineNameToToken.put(name,stateMachineToken);
	    }
    }
    
    boolean wasSet = true;
    if (uClassifier instanceof UmpleClass) {
    	wasSet = sm.setUmpleClass((UmpleClass)uClassifier);
    } 
    
if (uClassifier instanceof UmpleTrait) {
    	wasSet = sm.setUmpleTrait((UmpleTrait)uClassifier);
     }
Label_Trait_125: ;

    if (!wasSet)
    {
    	// Future-proofing: currently all paths cause wasSet to be true
    	if (uClassifier instanceof UmpleClass) {
	    	setFailedPosition(stateMachineToken.getPosition(), 15, uClassifier.getName());
	    } 
      
if (uClassifier instanceof UmpleTrait) {
          //TODO --Trait's code
          setFailedPosition(stateMachineToken.getPosition(), 15, uClassifier.getName());
        }
Label_Trait_126: ; 
    }
      
    
    if(stateMachineToken.is("pooled"))
    {
      sm.setPooled(true);
    }
    
    if(stateMachineToken.is("queued"))
    {
      sm.setQueued(true);
    }
    
    populateStateMachine(stateMachineToken, sm, uClassifier);

    //Place all states from transitions that weren't declared in the StateMachine
    //TODO: start at level of transition
    //TOcheck: multiple transitions to same state?
    ArrayList<Transition> allTransitions = sm.getAllTransitions();
    ArrayList<Transition> removeTransitions = new ArrayList<Transition>();
    
    while (placeholderStateMachine.numberOfStates() > 0)
    {
      State s = placeholderStateMachine.getState(0);
      if (s.getName().indexOf('.') > 0)
      {
        for (Transition t : allTransitions)
        {
          boolean notFound = false;
          
          if (t.getNextState().equals(s))
          {
            String toState = s.getName();
            String tmpName = toState;
            String[] stateNames = tmpName.split("\\.");
            //Strip last state from dotNotation
            //If the super state does not have a state machine then the state will be added to the top level sm
            //TODO: check that the top level doesn't have a state with the same name
            while(tmpName.contains(".") && !notFound){
              tmpName = tmpName.substring(0,tmpName.lastIndexOf('.'));
              State superState = sm.findState(tmpName);
              if(superState != null)
              {
                for (StateMachine nesSm : superState.getNestedStateMachines()){
                  //TODO: add support for concurrent sm
                  s.setStateMachine(nesSm);
                  break;
                }
                s.setName(stateNames[stateNames.length - 1]);
                if (s.getIsHistoryState())
                {
                  possiblyUnknownStates.remove(s);
                  s.getStateMachine().setContainsHistoryState(true);
                }
                if (s.getIsDeepHistoryState())
                {
                  possiblyUnknownStates.remove(s);
                  s.getStateMachine().setContainsDeepHistoryState(true);
                  addDeepHistoryStatesToNestedStateMachines(s);
                }
                break;
              }
              else
                notFound = true;
              
              if(!tmpName.contains("."))
              {
                //TODO: check to make sure there are no other states at this level with same name
                s.setName(stateNames[stateNames.length - 1]);
                if (s.getIsHistoryState() || s.getIsDeepHistoryState())
                {
                  setFailedPosition(stateMachineToken.getPosition(), 64, sm.getName());
                }
                s.setStateMachine(sm);
                break;
              }
            }
            
            if(notFound) 
	        {
	          notFound = true;
	          removeTransitions.add(t);
	          placeholderStateMachine.deleteState(s);
	          possiblyUnknownStates.remove(s);
	          t.getFromState().deleteTransition(t);
	          getParseResult().addErrorMessage(new ErrorMessage(68,t.getPosition(), toState,t.getPosition().getLineNumber()+""));
	        }
          }
        }
      }
      else
      {
        if (s.getIsHistoryState() || s.getIsDeepHistoryState())
        {
          //TODO: find transition token to raise error at correct position
          setFailedPosition(stateMachineToken.getPosition(), 65, sm.getName());
        }
        s.setStateMachine(sm);
      }
    }
    
    for (Transition t : removeTransitions)
    {
    	sm.getAllTransitions().remove(t);
    }
    
    
    if(sm.getQueued() || sm.getPooled())
    {
      
      if(sm.getEvents().isEmpty())
      { 
        if(!sm.getNestedStateMachines().isEmpty())
        {
          boolean nsmEvents=false;
          for(StateMachine nsm: sm.getNestedStateMachines())
          {
            if(!nsm.getEvents().isEmpty())
            {
              nsmEvents=true;
            }
          }
          if(!nsmEvents && sm.getQueued())
          {
            setFailedPosition(stateMachineToken.getPosition(), 56, sm.getName());
          }
          else if (!nsmEvents && sm.getPooled())
          {
            setFailedPosition(stateMachineToken.getPosition(), 57, sm.getName());
          }
        }
        else if(sm.getNestedStateMachines().isEmpty() && sm.getQueued())
        {
          setFailedPosition(stateMachineToken.getPosition(), 56, sm.getName());
        }
        else if(sm.getNestedStateMachines().isEmpty() && sm.getPooled())
        {
          setFailedPosition(stateMachineToken.getPosition(), 57, sm.getName());
        }
      }
    }
    
    
analyzeMixsetDefinition(innerMixsetTokens, sm);
Label_Mixset_127: ;

 
    return sm;
  }

  // line 757 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private State createStateFromTransition(Token transitionToken, StateMachine sm){
    checkStateNameOfToken(transitionToken);
    
    String name = transitionToken.getValue("stateName");
    State nextState = null;
    
    // Issue 140 - Final state keyword defines the final state for the top-level state machine
    if (FINAL_STATE_KEYWORD.equals(name))
    {
      StateMachine superStateMachine = sm.getSuperStateMachine();
      nextState = superStateMachine.findState(name);
      if (nextState == null) 
      {
        nextState = new State(name,superStateMachine);
      }
      
      //Issue492
      nextState.setPosition(transitionToken.getSubToken("stateName").getPosition());
    }
    else
    {
      nextState = sm.findState(name);
      if (nextState == null)
      {
        nextState = placeholderStateMachine.findState(name);
        if(nextState != null)possiblyUnknownStates.get(nextState).add(transitionToken);
      }

      if (nextState == null)
      {
        nextState = new State(name,placeholderStateMachine);
        //Issue492
        nextState.setPosition(transitionToken.getSubToken("stateName").getPosition());
        possiblyUnknownStates.put(nextState, new ArrayList<Token>());
        possiblyUnknownStates.get(nextState).add(transitionToken);
      }
    }
    
   
    return nextState;
  }

  // line 799 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private State createStateFromStandAloneTransition(Token transitionToken, StateMachine sm){
    checkStateNameOfToken(transitionToken);
	    
	    String name = transitionToken.getValue("toState");
	    State nextState;
	    
	    nextState = sm.findState(name);
	    
	    if ("Final".equals(name))
	    {
	      nextState = new State(name,sm);
	      //Issue 492
	      nextState.setPosition(transitionToken.getSubToken("toState").getPosition());
	    }
	    else
	    {
	      if (nextState == null)
	      {
	        nextState = placeholderStateMachine.findState(name);
	        if(nextState != null)possiblyUnknownStates.get(nextState).add(transitionToken);
	      }

	      if (nextState == null)
	      {
	        nextState = new State(name,placeholderStateMachine);
	        //Issue 492
	        nextState.setPosition(transitionToken.getSubToken("toState").getPosition());
	        possiblyUnknownStates.put(nextState, new ArrayList<Token>());
	        possiblyUnknownStates.get(nextState).add(transitionToken);
	      }
	    }
	    
	    return nextState;
  }

  // line 836 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void addDeepHistoryStatesToNestedStateMachines(State deepState){
    StateMachine sm = deepState.getStateMachine();
    for (StateMachine nesSm : sm.getNestedStateMachines())
    {
      if (nesSm.getDeepHistoryState() == null)
      {
        State s = new State("HStar", nesSm);
        nesSm.setContainsDeepHistoryState(true);
      }
    }
  }

  // line 849 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private String createDotNotationName(String stateName, StateMachine sm){
    String finalName = stateName;
    State pState = sm.getParentState();
    StateMachine root = null;
    while (pState != null)
    {
      finalName = pState.getName().concat("." + finalName);
      root = pState.getStateMachine();
      pState = root.getParentState();
    }
    return finalName;
  }

  // line 863 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private State createStateFromDefinition(Token stateToken, StateMachine sm){
    checkStateNameOfToken(stateToken);
    
    State s = sm.findState(stateToken.getValue("stateName"),false);
    if (s == null)
    {
      s = placeholderStateMachine.findState(stateToken.getValue("stateName"));
      if (s == null)
      {
        String dotName = createDotNotationName(stateToken.getValue("stateName"), sm);
        s = placeholderStateMachine.findState(dotName);
      
      }
      if (s != null)
      {
        s.setName(stateToken.getValue("stateName"));
        s.setStateMachine(sm);
      }
    }
    if (s == null)
    {
      s = new State(stateToken.getValue("stateName"),sm);
      //Issue 492
      s.setPosition(stateToken.getPosition());
    }
    if (s.getIsHistoryState() || s.getIsDeepHistoryState())
    {
      setFailedPosition(stateToken.getPosition(), 63, stateToken.getName());
    }
    possiblyUnknownStates.remove(s);
    

    return s;
  }

  // line 899 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void populateStateMachine(Token stateMachineToken, StateMachine sm, UmpleClassifier uClassifier){
    boolean isFirst;
    boolean isFinalState = false;
    String changeType = null;
    
    if (sm.getStates().size() != 0)
    	isFirst = false;
    else
    	isFirst = true;
    
    checkStateMachineForDuplicateEvents(stateMachineToken);
    
    for(Token stateToken : stateMachineToken.getSubTokens())
    {
      if(stateToken.is("pooled"))
      {
        sm.setPooled(true);
      }
      
      if(stateToken.is("queued"))
      {
        sm.setQueued(true);
      }    
      
      //Issue 148
       if(stateToken.is("standAloneTransition") && !ignoredTransitions.contains(stateToken))
      {
    	  if(stateToken.getValue("event") != null)
    	    analyzeStandAloneTransition(false,stateToken, stateToken.getValue("fromState"), null, sm);
    	  else
            analyzeStandAloneTransition(true,stateToken, stateToken.getValue("fromState"), null, sm);
      }
      
      // Concurrency is only allowed between nested state-machines
      if (stateToken.is("||"))
      {
        setFailedPosition(stateMachineToken.getPosition(), 53, sm.getName());
      } 
      
      
if(stateToken.is("trace"))
        {
          if (uClassifier instanceof UmpleClass) {
          analyzeTraceStatement((UmpleClass)uClassifier,stateToken); 
        } else {
          //TODO--- trait's functionality for trace;
        }
        }
Label_Trace_128: ;
      
      if (!stateToken.is("state") && !stateToken.is("stateName"))
      {
        if (stateToken.is("changeType")) { changeType = stateToken.getValue(); }      
        continue;
      }

      if ("-".equals(changeType))
      {
        State deleteMe = sm.findState(stateToken.getValue("stateName"));
        if (deleteMe != null) { deleteMe.delete(); }
      }
      else
      {
        State s = createStateFromDefinition(stateToken,sm);
        s.setFinalState(isFinalState);
        if (isFirst)
        {
          s.setIsStartState(true);
        }
        isFirst = false;
        isFinalState = false;
        analyzeState(stateToken, s);
        changeType = null;
        
        for(Token state : stateToken.getSubTokens())
        {
        	  if(state.is("standAloneTransition") && !ignoredTransitions.contains(state))
             {
           	  analyzeStandAloneTransition(false,state, state.getValue("fromState"), null, sm); 
             }
        }
      }
    }
  }


  /**
   * Issue 925 - Final states cannot have do activities, exit actions, transitions, 
   * nor nested state machines
   */
  // line 979 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private boolean analyzeFinalState(Token finalStateToken, State finalState){
    boolean foundInvalidElement = false;
  	   
       for (Token subToken : finalStateToken.getSubTokens())
	   {
		   // Final states are only allowed to contain entry actions
		   if (isEntryActionToken(subToken)) 
		   {
				finalState.addAction(analyzeAction(subToken, finalState));
		   } else if(subToken.is("final")) 
		   {
				finalState.setFinalState(true);
		   } else if(!foundInvalidElement && isInvalidFinalStateElement(subToken))
		   {
		   		foundInvalidElement = true;
		   }
	   }
	   
	   return foundInvalidElement;
  }


  /**
   * Helper function for issue 925
   */
  // line 1002 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private boolean isEntryActionToken(Token stateToken){
    return stateToken.is("entryOrExitAction") && (stateToken.getValue("type").equals("entry"));
  }


  /**
   * Helper function for issue 925
   */
  // line 1008 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private boolean isExitActionToken(Token stateToken){
    return stateToken.is("entryOrExitAction") && (stateToken.getValue("type").equals("exit"));
  }


  /**
   * Helper function for issue 925
   */
  // line 1014 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private boolean isInvalidFinalStateElement(Token stateToken){
    return stateToken.is("activity") || stateToken.is("transition") || stateToken.is("state") || isExitActionToken(stateToken);
  }

  // line 1022 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void analyzeState(Token stateToken, State fromState){
    // Issue 140 - States cannot be named Final because it is a reserved keyword
    if (fromState.getName().equals(FINAL_STATE_KEYWORD))
    {
      getParseResult().addErrorMessage(new ErrorMessage(74, fromState.getPosition(), "" + fromState.getPosition().getLineNumber()));
      return;
    }
    
    boolean addNewSm = true;
    boolean isConcurrentState = false;
    boolean isFinalState = false;
    String changeType = null;
    
    if (stateToken.getSubToken("final") != null)
    {
    	boolean foundInvalidElement = analyzeFinalState(stateToken, fromState);
    	if (foundInvalidElement)
    	{
    		getParseResult().addErrorMessage(new ErrorMessage(72,
    		                                                  fromState.getPosition(),
    		                                                  fromState.getName(),
    		                                                  fromState.getStateMachine().getName()));
    	}
    	return;
    }
    
    for(Token subToken : stateToken.getSubTokens())
    {
      
      if (subToken.is("extraCode"))
      {
        if(!subToken.getValue().trim().equals(""))
        {
          setFailedPosition(subToken.getPosition(),1006, subToken.getValue() );
        }
      }
      else if (subToken.is("changeType"))
      {
        changeType = subToken.getValue();
      }
      else if (subToken.is("final"))
      {
        fromState.setFinalState(true);
      }
      else if (subToken.is("transition") && !ignoredTransitions.contains(subToken))
      {
        analyzeTransition(false,subToken, fromState, changeType); 
      }
      else if (subToken.is("autoTransition") && !ignoredTransitions.contains(subToken))
      {
        analyzeTransition(true,subToken, fromState, changeType);
      }
      else if (subToken.is("concreteMethodDeclaration"))
      {
        analyzeStateDependentMethod(subToken, fromState);
      }
      else if (subToken.is("activity"))
      {
        analyzeActivity(subToken, fromState);
      }
      else if (subToken.is("entryOrExitAction"))
      {
      	fromState.addAction(analyzeAction(subToken, fromState));
      }
      else if (subToken.is("||"))
      {
        if (fromState.numberOfNestedStateMachines() == 0) { continue; }
        int previousSmIndex = fromState.numberOfNestedStateMachines() - 1;
              StateMachine nestedSm = fromState.getNestedStateMachine(previousSmIndex);
              if (nestedSm.numberOfStates() == 0) { continue; }
              nestedSm.setName(nestedSm.getState(0).getName());
              addNewSm = true;
              isConcurrentState = true;
      }
      else if (subToken.is("state"))
      {
        StateMachine nestedStateMachine = null;
        if (addNewSm)
        {
          //Issue 580
          for(StateMachine nested : fromState.getNestedStateMachines())
            if (nested.getName() == fromState.getName())
            	nestedStateMachine = nested;
          
          if(nestedStateMachine == null)
          {	  
            nestedStateMachine = new StateMachine(fromState.getName());
            fromState.addNestedStateMachine(nestedStateMachine);
          }
        }
        else
        {
          int lastIndex = fromState.numberOfNestedStateMachines() - 1;
          nestedStateMachine = fromState.getNestedStateMachine(lastIndex);
        }
        
        // Issue 778
        if (isConcurrentState && addNewSm)
        {
          State duplicateState = checkParentForParallelSmsWithSameName(subToken.getValue("stateName"), fromState);
          if (duplicateState != null)
          {
            getParseResult().addErrorMessage(new ErrorMessage(73,
                                                              fromState.getPosition(),
                                                              fromState.getName(),
                                                              duplicateState.getName(),
                                                              "" + duplicateState.getPosition().getLineNumber(),
                                                              "" + subToken.getPosition().getLineNumber()));
          }
        }
        
        State s = createStateFromDefinition(subToken,nestedStateMachine);
        //alignStateDefinitionWithStateMachine(s,nestedStateMachine);
        if (addNewSm)
        {
                  if (isConcurrentState)
                  {
                    nestedStateMachine.setName(s.getName());
                  }
          s.setIsStartState(true);
        }
        addNewSm = false;
        
        analyzeState(subToken, s);
      }
    }
  }


  /**
   * Issue 778 - Check if the parallel state machine has the same name as one of the states in
   * its parent composite state. If we find a state with the same name, we return it to provide the corresponding error message.
   */
  // line 1153 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private State checkParentForParallelSmsWithSameName(String parallelSmName, State parentState){
    for (StateMachine nsm : parentState.getNestedStateMachines()) 
    {
      for (State s : nsm.getStates()) 
      {
        if (s.getName().equals(parallelSmName)) 
        {
          return s;
        }
      }
    }
    
    return null;
  }


  /**
   * Issue 148
   */
  // line 1171 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void analyzeStandAloneTransition(boolean isAutoTransition, Token transitionToken, String state, String changeType, StateMachine sm2){
    State fromState;
	   
	   fromState = sm2.findState(state);
	   
	   if (fromState == null)
	   {
		    
		   fromState = placeholderStateMachine.findState(state);
	       if(fromState != null)possiblyUnknownStates.get(fromState).add(transitionToken);
	   }

	   if (fromState == null)
	   {
		    fromState = new State(state,placeholderStateMachine);
		    
		    //Issue 492
		    
		    fromState.setPosition(transitionToken.getSubToken("fromState").getPosition());
		    
	        possiblyUnknownStates.put(fromState, new ArrayList<Token>());
	        possiblyUnknownStates.get(fromState).add(transitionToken);
	   }
	   
	   State nextState = createStateFromStandAloneTransition(transitionToken,fromState.getStateMachine());
	    
	    Transition t; 
	    if ("-".equals(changeType))
	    {
	      t = Transition.createPlaceholder(nextState);
	    }
	    else
	    {
	      t = new Transition(fromState, nextState);
	    }

	    t.setAutoTransition(isAutoTransition);
	    
	    //Issue 519
	    t.setPosition(transitionToken.getPosition());

	    String eventName = transitionToken.getValue("event");
	    String eventTimerAmount = transitionToken.getValue("timer");
	    String name="";
	    String type="";
	    String paramType="";
	    String paramName="";
	    if (eventName == null && eventTimerAmount != null)
	    {
	      eventName = fromState.newTimedEventName(nextState);
	    }

	    Token guardToken = transitionToken.getSubToken("guard");
	    if (guardToken != null)
	    {
	      ((GuardAnalyzer)model.getAnalyzer("guard")).setUClassifier( sm2.getUmpleClass());
              ((GuardAnalyzer)model.getAnalyzer("guard")).setT(t);
              model.getAnalyzer("guard").analyzeToken(guardToken);
	    }

	    Token actionToken = transitionToken.getSubToken("action");
	    if (actionToken != null)
	    {
	      
	      t.setAction(analyzeAction(actionToken,fromState));
	    }
	    if (eventName != null || isAutoTransition)
	    {
	      StateMachine sm = fromState.getStateMachine();
	      UmpleClass uClass = sm.getUmpleClass();
	      Event event = isAutoTransition ? Event.createAutoTransition() : uClass == null ? sm.findOrCreateEvent(eventName) : uClass.findOrCreateEvent(eventName);
	      if (eventTimerAmount != null)
	      {
	        event.setIsTimer(true);
	        event.setTimerInSeconds(eventTimerAmount);
	      }
	      
	      if(event.getName().equals("unspecified") && !sm.getPooled())
	      {
	        event.setUnspecified(true);
	      }
	      
	      if(event.getName().equals("unspecified") && sm.getPooled())
	      {
	        Token eventToken = transitionToken.getSubToken("event");
	        setFailedPosition(eventToken.getPosition(),62, sm.getName());
	      }
	      
	      t.setEvent(event);
	      
	      if ("-".equals(changeType))
	      {
	        fromState.removeTransition(t);      
	      }
	     
	     for (Token subEventToken : transitionToken.getSubTokens())
	     {
	     	Event aEvent = sm.getEvent(event.getName());
	        
	      	if (subEventToken.is("parameterList"))
	      	{
	      		if ( aEvent == event && ! event.hasParams() )
	      		{
	      			for(Token parameterToken : subEventToken.getSubTokens())
	      			{
	      				boolean isList = false;
	      				if (parameterToken.is("parameter"))
	      				{
	      					if (parameterToken.getSubToken("type") != null)
	      					{
	      						paramType = parameterToken.getSubToken("type").getValue();
	      					}
	      					if (parameterToken.getSubToken("list") != null)
	      					{
	      						isList = parameterToken.getSubToken("list").getValue() != null;
	      					}
	      					
	      					paramName = parameterToken.getSubToken("name").getValue();
	      					MethodParameter aParameter  = new MethodParameter(paramName,paramType,null,null, false);
	      					aParameter.setIsList(isList);
	      					if (event.getParams().contains(aParameter))
	      					{
	      						break;
	      					}
	      					else
	      					{
	      						event.addParam(aParameter);
	      					}
	      				}
	      			}
	      		}
	      		else
	      		{ 
	      			for(Token parameterSecondToken : subEventToken.getSubTokens())
	      			{
	      				boolean isListt = false;
	      				if (parameterSecondToken.is("parameter"))
	      				{
	      					String paramTypee="";
	      					if (parameterSecondToken.getSubToken("type") != null)
	      					{
	      						type = parameterSecondToken.getSubToken("type").getValue();
	      					}
	      					if (parameterSecondToken.getSubToken("list") != null)
	      					{
	      						isListt = parameterSecondToken.getSubToken("list").getValue() != null;
	      					}
	      					name = parameterSecondToken.getSubToken("name").getValue();
	      				}	
	      			}
	      		
	      			for (int i=1; i <= event.getParams().size(); i++)
	      			{
	      			    if (!event.getArgs().contains(type) || !event.getArgs().contains(name))
	      			    {
	      			    	setFailedPosition(transitionToken.getPosition(), 51, event.getArgs());
	      			    	
	      			    }
	      			}
	      		}
	      	}
	      }
	      
	      for(Token subToken : transitionToken.getSubTokens())
	      {
	        if (subToken.is("activity"))
	        {
	          t.setAutoTransition(false);
	          Activity act = analyzeActivity(subToken, fromState);
	          act.setOnCompletionEvent(event);
	        }
	    }      
	    
	    }
  }


  /**
   * Code written by Eric Telmer
   */
  // line 1348 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void checkStateMachineForDuplicateEvents(Token stateMachineToken){
    for (Token subToken : stateMachineToken.getSubTokens()){
      if (subToken.is("state")){
        checkStateForDuplicateEvents(subToken, null);
      }
    }
  }


  /**
   * Checks if there is a transition in a state that will never be reached
   */
  // line 1358 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void checkStateForDuplicateEvents(Token stateToken, Set<String> superStateEvents){
    Set<String> unguardedEvents = new HashSet<String>();
    List<Token> subStates = new ArrayList<Token>();
    boolean priorAutoTransitionExists = false;
    String priorAutoTransitionState = null;
    List<Token> transitions = new ArrayList<Token>();
    List<Token> activityTransform = new ArrayList<Token>();
    List<Token> guardedTransitions = new ArrayList<Token>();
    
    
    if(superStateEvents == null){
      superStateEvents = new HashSet<String>();
    }
    
    if(superStateEvents.contains(null)){
      priorAutoTransitionExists = true;
    }
    
    for(Token subToken : stateToken.getSubTokens()){
      if(subToken.is("transition"))
      {
        transitions.add(subToken);  
      }
      else if(subToken.is("autoTransition") && subToken.getSubToken("guard") == null){
        if(priorAutoTransitionExists)
        {
          if(subToken.getSubToken("activity") != null){
            activityTransform.add(subToken);
          }else{
            ignoredTransitions.add(subToken);
          }
          if (!subToken.getValue("stateName").equals(priorAutoTransitionState)){
            // Issue 657: Only display warning if auto-transitions go to different states
            setFailedPosition(subToken.getPosition(), 69, subToken.getValue("stateName"), ""+subToken.getPosition().getLineNumber());
          }
        }
        priorAutoTransitionState = subToken.getValue("stateName");
        priorAutoTransitionExists = true;
        superStateEvents.add(null);
      }
      else if(subToken.is("autoTransition"))
      {
        transitions.add(subToken);  
      }
      else if(subToken.is("state")){
        subStates.add(subToken);
      }
    }
    
    for(Token subToken : transitions)
    {
    	//If there is ever a transition past an auto transition, raise an error        
        if(priorAutoTransitionExists){
          setFailedPosition(subToken.getPosition(), 54, subToken.getValue("event"));
          ignoredTransitions.add(subToken);
        }
        //if a unguarded transition with the same event has been seen,
        // in this state or it's super, raise an error
        if(unguardedEvents.contains(subToken.getValue("event"))){
          setFailedPosition(subToken.getPosition(), 54, subToken.getValue("event"));
          ignoredTransitions.add(subToken);
        }
        if(superStateEvents.contains(subToken.getValue("event"))){
          setFailedPosition(subToken.getPosition(), 55, subToken.getValue("event"));
          ignoredTransitions.add(subToken);	
        }
        if(subToken.getValue("guard") == null){
          if((subToken.getValue("event") == null) && (subToken.getValue("timer") == null)){
            {
              priorAutoTransitionExists = true;
            }
          }
          //System.out.println("added: " + subToken.getValue("event"));
          
          if(subToken.getValue("timer") == null)
          	unguardedEvents.add(subToken.getValue("event"));
        }
        else
        {
          Boolean guardsAreEqual = false;
          for(Token guardedTransition : guardedTransitions){
            Boolean subTokenIsAutoTransition = subToken.is("autoTransition");
            Boolean guardTransitionIsAutoTransition = guardedTransition.is("autoTransition");
            if ((guardTransitionIsAutoTransition && subTokenIsAutoTransition) 
              || (!guardTransitionIsAutoTransition && guardedTransition.getValue("event") != null && guardedTransition.getValue("event") == subToken.getValue("event"))
              || (!guardTransitionIsAutoTransition && guardedTransition.getValue("event") != null && guardedTransition.getValue("event").equals(subToken.getValue("event"))) 
              || (!guardTransitionIsAutoTransition && guardedTransition.getValue("timer") != null && guardedTransition.getValue("timer") == subToken.getValue("timer"))
              || (!guardTransitionIsAutoTransition && guardedTransition.getValue("timer") != null && guardedTransition.getValue("timer").equals(subToken.getValue("timer"))))
            {
              Position subTokenPosition = subToken.getPosition();
              String subTokenValue = subToken.getValue("event");
              if (subTokenIsAutoTransition)
              {
                subTokenValue = "(Auto Transition)";
              }
              guardsAreEqual = compareExpressions(guardedTransition.getSubToken("guard"), subToken.getSubToken("guard"), false, false);
              if (guardsAreEqual)
              {
                setFailedPosition(subTokenPosition, 70, subTokenValue);
                ignoredTransitions.add(subToken);
                break;
              }
            }
          }
          if (!guardsAreEqual)
          {
            guardedTransitions.add(subToken);    
          }
        }
    }
    
    unguardedEvents.addAll(superStateEvents);
    
    for(Token subState : subStates){
      Set<String> unguardedEventsAux = new HashSet<String>();
      unguardedEventsAux.addAll(unguardedEvents);
      checkStateForDuplicateEvents(subState, unguardedEventsAux);
    }

    for(Token autoTransition: activityTransform){
      transformAutoTransitionToActivity(autoTransition);
    }
    
    return;
  }

  // line 1486 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Boolean compareExpressions(Token exprOne, Token exprTwo, Boolean exprOneNegation, Boolean exprTwoNegation){
    Token exprOneCopy = exprOne.copy();
     Token exprTwoCopy = exprTwo.copy();
    
     Boolean exprOneNeedsTraversal = checkIfExpressionNeedsTraversal(exprOneCopy);
     Boolean exprTwoNeedsTraversal = checkIfExpressionNeedsTraversal(exprTwoCopy);
    
     if (exprOneCopy.is(NEGATIVE_CONSTRAINT))
     {
       exprOneNegation = switchNegation(exprOneNegation);
       exprOneCopy.setName(NEGATIVE_CONSTRAINT_APPLIED);
     }
     if (exprTwoCopy.is(NEGATIVE_CONSTRAINT))
     {
       exprTwoNegation = switchNegation(exprTwoNegation);
       exprTwoCopy.setName(NEGATIVE_CONSTRAINT_APPLIED);
     }
     
     if (exprOneNeedsTraversal || exprTwoNeedsTraversal)
     {
       if (exprOneNeedsTraversal)
       {
         Integer startIndexOne = getSubTokenStartIndex(exprOneCopy);
         exprOneCopy = exprOneCopy.getSubToken(startIndexOne + LHS_POSITION);
       }
       if (exprTwoNeedsTraversal)
       {
         Integer startIndexTwo = getSubTokenStartIndex(exprTwoCopy);
         exprTwoCopy = exprTwoCopy.getSubToken(startIndexTwo + LHS_POSITION);
       }
       return compareExpressions(exprOneCopy, exprTwoCopy, exprOneNegation, exprTwoNegation);
     }
     else if (exprOneCopy.getName().equals(exprTwoCopy.getName()) || (tokenIsGeneric(exprOneCopy) && tokenIsGeneric(exprTwoCopy)))
     {
       Integer startIndexOne = getSubTokenStartIndex(exprOneCopy);
       Integer startIndexTwo = getSubTokenStartIndex(exprTwoCopy);
       Token operatorOne = getExpressionOperator(exprOneCopy, startIndexOne);
       Token operatorTwo = getExpressionOperator(exprTwoCopy, startIndexTwo);
       
       if ((operatorOne == null) == (operatorTwo == null))
       {
         if (operatorOne != null)
         {
           return compareExpressionsWithOperands(exprOneCopy, exprTwoCopy, operatorOne, operatorTwo, exprOneNegation, exprTwoNegation, startIndexOne, startIndexTwo);
         }
         else
         {
           Token exprOneNoOperator = exprOneCopy;
           Token exprTwoNoOperator = exprTwoCopy;
           if (!expressionIsBasicValue(exprOneCopy))
           {
             exprOneNoOperator = exprOneCopy.getSubToken(startIndexOne + LHS_POSITION);
           }
           if (!expressionIsBasicValue(exprTwoCopy)){
             exprTwoNoOperator = exprTwoCopy.getSubToken(startIndexTwo + LHS_POSITION);
           }
           
           Boolean exprOneIsBasicValue = expressionIsBasicValue(exprOneNoOperator);
           Boolean exprTwoIsBasicValue = expressionIsBasicValue(exprTwoNoOperator);
           if (exprOneIsBasicValue == exprTwoIsBasicValue)
           {
             if(exprOneIsBasicValue)
             {
               return (exprOneNoOperator.toString().equals(exprTwoNoOperator.toString())) && exprOneNegation == exprTwoNegation;
             }
             else
             {
               return compareExpressions(exprOneNoOperator, exprTwoNoOperator, exprOneNegation, exprTwoNegation);
             }
           }
         }
       }
     }
     return false;
  }

  // line 1563 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Boolean checkIfExpressionNeedsTraversal(Token token){
    Integer startIndex = getSubTokenStartIndex(token);
     Token operator = getExpressionOperator(token, startIndex);
     if (tokenIsGeneric(token) && operator == null)
     {
       return true;
     }
     else if (token.is(LONE_BOOLEAN) && (token.getSubToken(NEGATIVE_CONSTRAINT) != null))
     {
       return true;
     }
     return false;
  }

  // line 1578 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Integer getSubTokenStartIndex(Token expression){
    int i = 0;
      for (Token token : expression.getSubTokens())
      {
        if(!STATIC.equals(token.getValue()))
        {
          break;
        }
        i++;
      }
      return i;
  }

  // line 1592 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Token getExpressionOperator(Token expression, Integer startIndex){
    Integer operatorPosition = startIndex + OPERATOR_POSITION;
     if (operatorPosition < expression.getSubTokens().size()-1)
     {
       Token operator = expression.getSubToken(operatorPosition);
       String operatorName = operator.getName();
       if (operatorName.contains(OP) || OPERATOR.equals(operatorName))
       {
         return operator;
       }
     }
     return null;
  }

  // line 1607 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Boolean switchNegation(Boolean negation){
    if (negation)
     {
       return false;
     }
     else
     {
       return true;
     }
  }

  // line 1619 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Boolean tokenIsGeneric(Token token){
    return token.is(GUARD) || token.is(CONSTRAINT_BODY) || token.is(LINKING_OP_BODY) || token.is(NEGATIVE_CONSTRAINT);
  }

  // line 1624 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Boolean compareExpressionsWithOperands(Token exprOne, Token exprTwo, Token opOneToken, Token opTwoToken, Boolean exprOneNegation, Boolean exprTwoNegation, Integer startIndexOne, Integer startIndexTwo){
    Token exprOneLHS = exprOne.getSubToken(startIndexOne + LHS_POSITION);
     Token exprOneRHS = exprOne.getSubToken(startIndexOne + RHS_POSITION);
     Token exprTwoLHS = exprTwo.getSubToken(startIndexTwo + LHS_POSITION);
     Token exprTwoRHS = exprTwo.getSubToken(startIndexTwo + RHS_POSITION);
     
     String opOne = applyOperatorNegation(opOneToken, exprOneNegation);
     exprOneNegation = checkIfNegationApplied(opOneToken, opOne, exprOneNegation);
     String opTwo = applyOperatorNegation(opTwoToken, exprTwoNegation);
     exprTwoNegation = checkIfNegationApplied(opTwoToken, opTwo, exprTwoNegation);

     if (operatorsAreEqual(opOne, opTwo, opOneToken.getValue(), opTwoToken.getValue(), exprOneNegation, exprTwoNegation))
     {
       if (compareExpressions(exprOneLHS, exprTwoLHS, exprOneNegation, exprTwoNegation) && compareExpressions(exprOneRHS, exprTwoRHS, exprOneNegation, exprTwoNegation))
       {
         return true;
       }
       else if (operandOrderDoesNotMatter(opOne, opOneToken.getValue()))
       {
         if (compareExpressions(exprOneLHS, exprTwoRHS, exprOneNegation, exprTwoNegation) && compareExpressions(exprOneRHS, exprTwoLHS, exprOneNegation, exprTwoNegation))
         {
           return true;
         }
       }
     }
     else if (numericalExprOperatorsAreOpposite(opOne, opTwo))
     {
       if (compareExpressions(exprOneLHS, exprTwoRHS, false, false) && compareExpressions(exprOneRHS, exprTwoLHS, false, false))
       {
         return true;
       }
     }
     return false;
  }

  // line 1660 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private String applyOperatorNegation(Token operatorToken, Boolean exprNegation){
    String operator = operatorToken.getName();
     if (exprNegation)
     {
       if (EQUALS_OP.equals(operator))
       {
         operator = NOT_EQUALS_OP;
       }
       else if (NOT_EQUALS_OP.equals(operator))
       {
         operator = EQUALS_OP;
       }
       else if (GREATER_THAN_OR_EQUAL.equals(operator))
       {
         operator = LESS_THAN;
       }
       else if (LESS_THAN_OR_EQUAL.equals(operator))
       {
         operator = GREATER_THAN;
       }
       else if (GREATER_THAN.equals(operator))
       {
         operator = LESS_THAN_OR_EQUAL;
       }
       else if (LESS_THAN.equals(operator))
       {
         operator = GREATER_THAN_OR_EQUAL;
       }
     }
     return operator;
  }

  // line 1693 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Boolean checkIfNegationApplied(Token operatorToken, String operator, Boolean exprNegation){
    if (operatorToken.getName().equals(operator)){
       return exprNegation;
     }
     else
     {
       return false;
     }
  }

  // line 1704 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Boolean operatorsAreEqual(String opOne, String opTwo, String opOneValue, String opTwoValue, Boolean exprOneNegation, Boolean exprTwoNegation){
    if (opOne.equals(opTwo))
     {
       if (OPERATOR.equals(opOne) && (opOneValue.equals(opTwoValue)))
       {
         return true;
       }
       else if (!OPERATOR.equals(opOne))
       {
         return true; 
       }  
     }
     else if (operatorIsAndOrOr(opOne) && operatorIsAndOrOr(opTwo) && exprOneNegation != exprTwoNegation)
     {
       return true;
     }
     return false;
  }

  // line 1724 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Boolean operandOrderDoesNotMatter(String operatorName, String operatorValue){
    return EQUALS_OP.equals(operatorName) || NOT_EQUALS_OP.equals(operatorName) || OR_OP.equals(operatorName) 
         || AND_OP.equals(operatorName) || "+".equals(operatorValue) || "*".equals(operatorValue);
  }

  // line 1730 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Boolean operatorIsAndOrOr(String operator){
    return AND_OP.equals(operator) || OR_OP.equals(operator);
  }

  // line 1735 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Boolean numericalExprOperatorsAreOpposite(String operatorOne, String operatorTwo){
    if ((GREATER_THAN.equals(operatorOne) && LESS_THAN.equals(operatorTwo)) || (GREATER_THAN.equals(operatorTwo) && LESS_THAN.equals(operatorOne)))
     {
       return true;
     }
     else if ((LESS_THAN_OR_EQUAL.equals(operatorOne) && GREATER_THAN_OR_EQUAL.equals(operatorTwo)) || (LESS_THAN_OR_EQUAL.equals(operatorTwo) && GREATER_THAN_OR_EQUAL.equals(operatorOne)))
     {
       return true;
     }
     return false;
  }

  // line 1748 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Boolean expressionIsBasicValue(Token expression){
    if (expression.is(BOOL_LITERAL) || expression.is(NUMBER_LITERAL) || expression.is(CONSTRAINT_NAME) || expression.is(QUOTE)
        || expression.getSubToken(CONCAT) != null || expression.is(NUMBER) || expression.is(ASSOCIATION_EXPR) || expression.is(STATEMACHINE_EXPR))
     {
       return true;
     }
     return false;
  }


  /**
   * End Telmer
   */
  // line 1759 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void transformAutoTransitionToActivity(Token autoTransition){
    if(autoTransition.getSubToken("activity") == null) return;
    Token parent = autoTransition.getParentToken();
    parent.removeSubToken(autoTransition);
    
    Token activity = autoTransition.getSubToken("activity").copy();
    parent.addSubToken(activity);
  }

  // line 1769 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Activity analyzeActivity(Token activityToken, State fromState){
    Activity act= new Activity("", fromState);
    CodeBlock cb = new CodeBlock();
    
    List<String> codelangs = new ArrayList<String>();
    Map<String,Position> implementationPositions = new HashMap<String,Position>();

    for(Token tkn: activityToken.getSubTokens())
    {
      if(tkn.is("codeLang")){
        codelangs.add(tkn.getValue());
        implementationPositions.put(tkn.getValue(), tkn.getPosition());
      }
      else if(tkn.is("code"))
      {
        if(codelangs.isEmpty())
        {
          cb.setCode(tkn.getValue());
          implementationPositions.put("", tkn.getPosition());
        } 
        else 
        {
          for(String lang: codelangs){
            cb.setCode(lang, tkn.getValue());
          }
          codelangs.clear();
        }
      }
    }
    act.setCodeblock(cb);
    act.setImplementationPositions(implementationPositions);
    act.setPosition(activityToken.getPosition());
    act.setEndPosition(activityToken.getEndPosition());
    return act;
  }

  // line 1805 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private Action analyzeAction(Token actionToken, State fromState){
    Action action= new Action("");
  	CodeBlock cb = new CodeBlock();
  	List<String> codelangs = new ArrayList<String>();
    String guardCode = "";
    int statementIndex = 0;
  	for(Token tkn: actionToken.getSubTokens()){
      if (tkn.is("guardCode"))
      {
        guardCode = tkn.getSubToken("code").getValue();
      }
  	  if(tkn.is("codeLang")){
  		  codelangs.add(tkn.getValue());
  	  } 
      else if(tkn.is("code"))
      {
    		if(codelangs.isEmpty())
    		{
          if (!guardCode.equals("") && statementIndex == 0)
          {
            cb.setCode("if (" + guardCode + ")\n        {\n          " + tkn.getValue() + "\n        }");
          }
          else 
          {
    		    cb.setCode(tkn.getValue());
          }
          statementIndex++;
    		} 
    		else {
    		  for(String lang: codelangs)
          {
    		    cb.setCode(lang, tkn.getValue());
          }
          codelangs.clear();
      	}
      }
    }
    action.setCodeblock(cb);
    	
    action.setPosition(actionToken.getPosition());
    action.setEndPosition(actionToken.getEndPosition());
    action.setActionType(actionToken.getValue("type"));
        
    return action;
  }

  // line 1852 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void analyzeTransition(boolean isAutoTransition, Token transitionToken, State fromState, String changeType){
    State nextState = createStateFromTransition(transitionToken,fromState.getStateMachine());
    
    Transition t; 
    if ("-".equals(changeType))
    {
      t = Transition.createPlaceholder(nextState);
    }
    else
    {
      t = new Transition(fromState, nextState);
    }

    t.setAutoTransition(isAutoTransition);
    
    //Issue 519
    t.setPosition(transitionToken.getPosition());

    String eventName = transitionToken.getValue("event");
    String eventTimerAmount = transitionToken.getValue("timer");
    String name="";
    String type="";
    String paramType="";
    String paramName="";
    if (eventName == null && eventTimerAmount != null)
    {
      eventName = fromState.newTimedEventName(nextState);
    }

    Token guardToken = transitionToken.getSubToken("guard");
    if (guardToken != null)
    {
      if(((GuardAnalyzer)model.getAnalyzer("guard"))!=null){
        UmpleClassifier uClassifier = fromState.getStateMachine().getRootStateMachine().getUmpleClass();
    	
if (fromState.getStateMachine().getRootStateMachine().getUmpleClass()==null){
    		uClassifier = fromState.getStateMachine().getRootStateMachine().getUmpleTrait();
    	  }
Label_Trait_129: ;

        ((GuardAnalyzer)model.getAnalyzer("guard")).setUClassifier(uClassifier);
        ((GuardAnalyzer)model.getAnalyzer("guard")).setT(t);
        model.getAnalyzer("guard").analyzeToken(guardToken);
      }
    }

    Token actionToken = transitionToken.getSubToken("action");
    if (actionToken != null)
    {
      
      t.setAction(analyzeAction(actionToken,fromState));
    }
    if (eventName != null || isAutoTransition)
    {
      StateMachine sm = fromState.getStateMachine();
      UmpleClass uClass = sm.getUmpleClass();
      Event event = isAutoTransition ? Event.createAutoTransition() : uClass == null ? sm.findOrCreateEvent(eventName) : uClass.findOrCreateEvent(eventName);
      if (eventTimerAmount != null)
      {
        event.setIsTimer(true);
        event.setTimerInSeconds(eventTimerAmount);
      }
      
      if(event.getName().equals("unspecified") && !sm.getPooled())
      {
        event.setUnspecified(true);
      }
      
      if(event.getName().equals("unspecified") && sm.getPooled())
      {
        Token eventToken = transitionToken.getSubToken("event");
        setFailedPosition(eventToken.getPosition(),62, sm.getName());
      }
      
      t.setEvent(event);
      
      if ("-".equals(changeType))
      {
        fromState.removeTransition(t);      
      }
     
     for (Token subEventToken : transitionToken.getSubTokens())
     {
     	Event aEvent = sm.getEvent(event.getName());
        
      	if (subEventToken.is("parameterList"))
      	{
      		if ( aEvent == event && ! event.hasParams() )
      		{
      			for(Token parameterToken : subEventToken.getSubTokens())
      			{
      				boolean isList = false;
      				if (parameterToken.is("parameter"))
      				{
      					if (parameterToken.getSubToken("type") != null)
      					{
      						paramType = parameterToken.getSubToken("type").getValue();
      					}
      					if (parameterToken.getSubToken("list") != null)
      					{
      						isList = parameterToken.getSubToken("list").getValue() != null;
      					}
      					
      					paramName = parameterToken.getSubToken("name").getValue();
      					MethodParameter aParameter  = new MethodParameter(paramName,paramType,null,null, false);
      					aParameter.setIsList(isList);
      					if (event.getParams().contains(aParameter))
      					{
      						break;
      					}
      					else
      					{
      						event.addParam(aParameter);
      					}
      				}
      			}
      		}
      		else
      		{ 
      			for(Token parameterSecondToken : subEventToken.getSubTokens())
      			{
      				boolean isListt = false;
      				if (parameterSecondToken.is("parameter"))
      				{
      					String paramTypee="";
      					if (parameterSecondToken.getSubToken("type") != null)
      					{
      						type = parameterSecondToken.getSubToken("type").getValue();
      					}
      					if (parameterSecondToken.getSubToken("list") != null)
      					{
      						isListt = parameterSecondToken.getSubToken("list").getValue() != null;
      					}
      					name = parameterSecondToken.getSubToken("name").getValue();
      				}	
      			}
      		
      			for (int i=1; i <= event.getParams().size(); i++)
      			{
      			    if (!event.getArgs().contains(type) || !event.getArgs().contains(name))
      			    {
      			    	setFailedPosition(transitionToken.getPosition(), 51, event.getArgs());
      			    	
      			    }
      			}
      		}
      	}
      }
      
      for(Token subToken : transitionToken.getSubTokens())
      {
        if (subToken.is("activity"))
        {
          t.setAutoTransition(false);
          Activity act = analyzeActivity(subToken, fromState);
          act.setOnCompletionEvent(event);
        }
    }      
    
    }
  }

  // line 2011 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
   private void analyzeStateDependentMethod(Token methodToken, State fromState){
    StateMachine sm = fromState.getStateMachine();
    
    // Make sure we retrieve the same Umple class for nested children as well
    UmpleClass uClass = null;
    StateMachine smRunner = sm;
    int depth = 0;//issue1483

    while (uClass == null && depth<100)
    {
      uClass = smRunner.getUmpleClass();
      if (smRunner.getParentState() != null)
    	  smRunner = smRunner.getParentState().getStateMachine();
      depth++;
    }
    
    if(uClass == null)//issue1483
    {
      setFailedPosition(methodToken.getPosition(), 1015);
      return;
    }

    // Retrieve method analyzed using the method token
    Method analyzedMethod = analyzeMethod(methodToken, null, true);
    Method classMethod = uClass.getMethod(analyzedMethod);

    // Generate warning if any of the method definitions have conflicting method modifiers
    int methodPrototypeIndex = uClass.getStateDependentMethods().indexOf(analyzedMethod);
    if (methodPrototypeIndex >= 0) {
      String methodPrototypeModifier = uClass.getStateDependentMethods().get(methodPrototypeIndex)
                                         .getModifier().trim();
      if (!methodPrototypeModifier.equals(analyzedMethod.getModifier().trim())) {
        setFailedPosition(methodToken.getPosition(), 82,
          analyzedMethod.getName(), analyzedMethod.getModifier().trim(), methodPrototypeModifier);
      }
      if (classMethod != null && !methodPrototypeModifier.equals(classMethod.getModifier().trim())) {
        setFailedPosition(classMethod.getPosition(), 82,
          classMethod.getName(), classMethod.getModifier().trim(), methodPrototypeModifier);
      }
    }

    // Strip off existing method if it exists, and make it the default implementation
    if (classMethod != null) {
      uClass.addStateDependentMethod(classMethod, null);
      uClass.removeMethod(classMethod);
    }

    // Add current state-dependent method body to the Umple class
    uClass.addStateDependentMethod(analyzedMethod, fromState);
  }


  /**
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ----------------------------------------------------------------------------
   */
  // line 28 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void copyStateMachinesFromTraiToClass(UmpleClass inClass){
    Map<UmpleTrait, List<StateMachine>> traitStateMachine = new HashMap<UmpleTrait, List<StateMachine>>();
		Map<UmpleTrait, List<StateMachine>> tempTraitStateMachine = new HashMap<UmpleTrait, List<StateMachine>>();
		for (UmpleTrait uTrait : inClass.getExtendsTraits()) {
			tempTraitStateMachine = gatherStateMachinesFromTrait(uTrait,inClass.getGeneralTPAppliedByName(uTrait.getName()),inClass);
			CheckSMFromTraitIsNotAvaialbleInOtherTraits(traitStateMachine, tempTraitStateMachine, inClass);
			if ( ! getParseResult().getWasSuccess() ) return;
			
			AddStateMachineMapToAnother(traitStateMachine,tempTraitStateMachine);
		}
		if (!CheckSMFromTraitIsNotAvaialbleInClass(inClass,traitStateMachine)) return;
		//To assign a state machine to a state.
		//----------------------------------------------------------------------------------------		
			if (getParseResult().getWasSuccess()) AssignStateMachineToState(inClass,traitStateMachine);	
		//----------------------------------------------------------------------------------------	
		for (UmpleTrait t1 : traitStateMachine.keySet()) {
			if (traitStateMachine.get(t1)!=null){
				for (StateMachine sMachine : traitStateMachine.get(t1)) {
					sMachine.setUmpleClass(inClass);
	    		inClass.addStateMachine(sMachine);		
				}
			}
		}
		removeSuperKeywordTracks(inClass);
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 56 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void removeSuperKeywordTracks(UmpleClass inClass){
    for (StateMachine sm : inClass.getStateMachines()){
			removeSuperKeywordTracksReculsively(sm);
 		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 64 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void removeSuperKeywordTracksReculsively(StateMachine inStateMachine){
    for(State state:inStateMachine.getStates()){
			for(Action action : state.getActions()) action.getCodeblock().removeKeyword("superCall;");
			for(Activity activity : state.getActivities()) activity.getCodeblock().removeKeyword("superCall;");	
			for (StateMachine nSM : state.getNestedStateMachines()) removeSuperKeywordTracksReculsively(nSM);
		}
		for(Transition trans:inStateMachine.getAllTransitions()){
			if (trans.getAction()!=null) trans.getAction().getCodeblock().removeKeyword("superCall;");
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 138 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void AssignStateMachineToState(UmpleClassifier inClassfier, Map<UmpleTrait,List<StateMachine>> traitStateMachine){
    //Important: This part of code has duplication because the common attributes of UmpleTrait and UmpleClass are not part of UmpleClassfierl.
  	 //This must be done in the process of model refactoring.
  	 if (inClassfier instanceof UmpleTrait){
       UmpleTrait inTrait = (UmpleTrait)inClassfier;
       for (UmpleTrait uTrait : inTrait.getExtendsTraits()) {
          if(inTrait.getGeneralTPAppliedByName(uTrait.getName())!=null)
            for (StateMachineTemplateSignature smTSignature : inTrait.getGeneralTPAppliedByName(uTrait.getName()).getStateMachineTemplateSignatures()) {
              if (smTSignature.getDesStateMachine()!=""){
                String newSMName = inTrait.getGeneralTPAppliedByName(uTrait.getName()).getAssignedStateMachineNewName(smTSignature.getSrcStateMachine());
                AssignStateMachineToStateSearchProcess(inTrait, traitStateMachine, uTrait, smTSignature,newSMName);
              }
            }
          }
     } else if (inClassfier instanceof UmpleClass){
       UmpleClass inClass = (UmpleClass)inClassfier;
       for (UmpleTrait uTrait : inClass.getExtendsTraits()) {
        if(inClass.getGeneralTPAppliedByName(uTrait.getName())!=null)
          for (StateMachineTemplateSignature smTSignature : inClass.getGeneralTPAppliedByName(uTrait.getName()).getStateMachineTemplateSignatures()) {
            State foundState = null;
            if (smTSignature.getDesStateMachine()!=""){
              foundState = findMatchingStateForMapping(inClassfier,inClass.getStateMachines(),smTSignature);
              String newSMName = inClass.getGeneralTPAppliedByName(uTrait.getName()).getAssignedStateMachineNewName(smTSignature.getSrcStateMachine());
              if (foundState!=null) {               
                addStateMachineToState(traitStateMachine, smTSignature, foundState,inClassfier,newSMName);
              } else {
                AssignStateMachineToStateSearchProcess(inClassfier, traitStateMachine, uTrait, smTSignature,newSMName); 
              }
            }
          }
        }
     }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 174 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void AssignStateMachineToStateSearchProcess(UmpleClassifier inClassfier, Map<UmpleTrait,List<StateMachine>> traitStateMachine, UmpleTrait uTrait, StateMachineTemplateSignature smTSignature, String newSMName){
    State foundState = null;
		for(Map.Entry<UmpleTrait, List<StateMachine>> entry : traitStateMachine.entrySet()){
			foundState = findMatchingStateForMapping(inClassfier, entry.getValue() , smTSignature);
			if (foundState!=null) {
				addStateMachineToState(traitStateMachine, smTSignature, foundState,inClassfier,newSMName);
				return;
			}
		}
		getParseResult().addErrorMessage(new ErrorMessage(230,inClassfier.getPosition(0),inClassfier.getName(),smTSignature.getDesStateMachine() ));	
		return;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 189 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void addStateMachineToState(Map<UmpleTrait,List<StateMachine>> traitStateMachine, StateMachineTemplateSignature smTSignature, State foundState, UmpleClassifier inUmpleClassifier, String newSMName){
    StateMachine mustbeAdded = null;
    UmpleTrait foundTrait=null;
    labelT:
    for(UmpleTrait uTrait : traitStateMachine.keySet()) {
      for (StateMachine desSM: traitStateMachine.get(uTrait)){ 
        if (desSM.getName().equals(smTSignature.getSrcStateMachine())){
        mustbeAdded = desSM;
        foundTrait=uTrait;
        break labelT;
        }
      }
    }
    if (newSMName!="") mustbeAdded.setName(newSMName);
      if (foundTrait!=null){
        for (StateMachine nsm :foundState.getNestedStateMachines() ) {
      if (nsm.getName().equals(mustbeAdded.getName())){        
            if (!nsm.getStartState().getName().equals(mustbeAdded.getStartState().getName())){
              StateMachine checkSM = mergeTwoStateMachineWithTheSameNameDifferentInitialState(nsm,mustbeAdded);   
              getParseResult().addErrorMessage(new ErrorMessage(228,inUmpleClassifier.getPosition(0),foundState.getName()));
              if (checkSM!=null)  {
                foundState.removeNestedStateMachine(nsm);
                foundState.addNestedStateMachine(checkSM);
                
              }
            } else {          
              addExtraStatesAndTransitions(nsm, mustbeAdded,inUmpleClassifier);
            } 
            traitStateMachine.get(foundTrait).remove(mustbeAdded);
            return;
      }
      }
        traitStateMachine.get(foundTrait).remove(mustbeAdded);
        foundState.addNestedStateMachine(mustbeAdded);      
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 228 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private State findMatchingStateForMapping(UmpleClassifier inClassfier, List<StateMachine> inStateMachine, StateMachineTemplateSignature smTSignature){
    for (StateMachine sMachine : inStateMachine) {		
			if(sMachine.getName().equals(smTSignature.getDesStateMachine()) ){
				State foundState= null;
				StateMachine smFinder = sMachine;
				for(int i = 0; i<smTSignature.getDesStates().length;i++){
					foundState = smFinder.findState(smTSignature.getDesState(i), false);
					if (foundState!=null){
						if(i+1<smTSignature.getDesStates().length){
							StateMachine foundSM= null;
							for(StateMachine nestedSM : foundState.getNestedStateMachines()){
								State foundStateTemp = nestedSM.findState(smTSignature.getDesState(i+1),false);
								if(foundStateTemp!=null){
									if(foundSM!=null){
										//TODO this error code is not valid.
										getParseResult().addErrorMessage(new ErrorMessage(233,inClassfier.getPosition(0),inClassfier.getName(),smTSignature.getDesState(i+1)));	
						 		 		 return null;
									} else {
										foundSM = nestedSM;		
										foundState=foundStateTemp;												
									}
								}
							} 
							if (foundSM==null){
								getParseResult().addErrorMessage(new ErrorMessage(230,inClassfier.getPosition(0),inClassfier.getName(),smTSignature.getDesState(i+1) ));	
				 		 		 return null;
							}
							i++;
						} else {
							//The state has been found.
								return foundState;
						}
					} else {
						break;
					}
				}
				if(foundState!=null) return foundState;
			}
		}
		return null;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 273 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private boolean checkValidityOfSMTemplateSignature(GeneralTPApplied inGTPApplied, List<StateMachine> inStateMachines, UmpleTrait inTrait){
    if (inGTPApplied!=null){
 	  	for (StateMachineTemplateSignature smTSignature : inGTPApplied.getStateMachineTemplateSignatures()) {
 	  		//checks that the event exists in one of the state machines.
 	  		if (smTSignature.getSrcStateMachine().equals("")){
 	  			Method method1 = smTSignature.getMethodTemplateSignature().getMethod();
 	  			method1.setType("Boolean");
 	  			boolean find = false;
 	  			for (StateMachine stMachine : inStateMachines){
 	  				Event event = stMachine.getEventByMethod(method1);	 				
 		 				if(event!=null)			{
 		 					find = true;
 		 					break;
 		 				}
 	  			}
 	 				if(find==false){
   	 				getParseResult().addErrorMessage(new ErrorMessage(232,inTrait.getPosition(0),inTrait.getName(),method1.getSignature()));	
 		 				return false;
 	 				}
 	  		} else {
 	  			StateMachine sm = null;
 	  			for (StateMachine st : inStateMachines){				
 	  				if(st.getName().equals(smTSignature.getSrcStateMachine())){
 	  					sm=st;
 	  				}
 	  			}

 		 			if ( sm == null ){
 		 				getParseResult().addErrorMessage(new ErrorMessage(230,inTrait.getPosition(0),inTrait.getName(),smTSignature.getSrcStateMachine()));	
 		 				return false;
 		 			} if (smTSignature.getMethodTemplateSignature()!=null){
 		 				Method method1 = smTSignature.getMethodTemplateSignature().getMethod();
 		 				method1.setType("Boolean");
 		 				Event event = sm.getEventByMethod(method1);	
 		 				if(event==null){
 	  	 				getParseResult().addErrorMessage(new ErrorMessage(231,inTrait.getPosition(0),inTrait.getName(),smTSignature.getSrcStateMachine(),method1.getSignature()));	
 			 				return false;
 		 				}
 		 				
 		 			}	else {
 						 StateMachine smTemp = sm;
 						 State tState=null;
             for(int i = 0; i<smTSignature.numberOfSrcStates();i++){
              if(i % 2==0) {
                tState = smTemp.findState(smTSignature.getSrcState(i), false);
                if(tState==null){
                    getParseResult().addErrorMessage(new ErrorMessage(230,inTrait.getPosition(0),inTrait.getName(),smTSignature.getSrcState(i))); 
                     return false;
                }
              } else {
                boolean validNSM=false;
                for(StateMachine nSM:tState.getNestedStateMachines()){
                  if(nSM.getName().equals(smTSignature.getSrcState(i))){
                    validNSM = true;
                    smTemp = nSM;
                    break;
                  }
                }
                if(!validNSM){
                  getParseResult().addErrorMessage(new ErrorMessage(230,inTrait.getPosition(0),inTrait.getName(),smTSignature.getSrcState(i))); 
                   return false;
                }
              }
            }  			
 		 			}
 	  		}
 	  	}	 
 	  	return true;
   	} else return true;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 346 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private boolean checkValidityOfSMModifier(GeneralTPApplied inGTPApplied, List<StateMachine> inStateMachines, UmpleTrait inTrait){
    if (inGTPApplied!=null){
        for (StateMachineModifier smModifier : inGTPApplied.getStateMachineModifiers()) {
          //Thsi checks to make sure the source state machine is Valid. 
          StateMachine smFound = null;
          State sFound = null;
          StateMachine rFound = null;
          for (StateMachine sm : inStateMachines){        
            if(sm.getName().equals(smModifier.getSrcStateMachine())){
              smFound=sm;
            }
          }
          if ( smFound == null ){
              getParseResult().addErrorMessage(new ErrorMessage(230,inTrait.getPosition(0),inTrait.getName(),smModifier.getSrcStateMachine())); 
              return false;
          }
          //---
          if (smModifier instanceof EventModifier){  
            sFound = smFound.findStateBasedOnSequence(((StateModifier)smModifier).getSrcStates());
               if (sFound==null ){
                 getParseResult().addErrorMessage(new ErrorMessage(230,inTrait.getPosition(0),inTrait.getName(),Arrays.toString(((EventModifier)smModifier).getSrcStates())));               
                   return false;
               } else {
                 Method method = ((EventModifier)smModifier).getMethod();
                 method.setType("Boolean");
                 boolean valid = false;   
                 for(Transition transition : sFound.getTransitions()){
                   Guard guard = transition.getGuard();
                   if (method.getName().equals("")){                     
                         if (transition.getAutoTransition()){                        
                             if (guard==null )
                             {
                               if (((EventModifier)smModifier).getGuard()==null ){
                                 valid = true;
                                 break;
                               }
                             } else if(guard.isEqualTo( ((EventModifier)smModifier).getGuard() ) ) {
                               valid = true;
                               break; 
                             }
                         }

                    }  else {
                         Event e = transition.getEvent();
                         if (e != null )
                         {
                           Method m = new Method("",e.getName(),e.getType(),false);
                           m.setMethodParameters(e.getParams());
                           if (m.compareWithTheMethod(method)){                          
                           if(guard==null){
                               if (((EventModifier)smModifier).getGuard()==null){
                                 valid = true;
                                   break;
                               }
                             } else if(guard.isEqualTo(((EventModifier)smModifier).getGuard())) {
                               valid = true;
                               break;
                             }
                           }
                         }
                    }
                 }
                 if (!valid){
                     String gMSG = ((EventModifier)smModifier).getGuard()!=null ? ((EventModifier)smModifier).getGuard().getExpression() : "";  
                     getParseResult().addErrorMessage(new ErrorMessage(231,inTrait.getPosition(0),inTrait.getName(),method.getSignature()+gMSG ));  
                     return false;
                 }
               }
          }else if (smModifier instanceof StateModifier){  
            if (((StateModifier)smModifier).numberOfSrcStates() %2 >0){
              sFound = smFound.findStateBasedOnSequence(((StateModifier)smModifier).getSrcStates());          
                    if (sFound==null  ){
                     getParseResult().addErrorMessage(new ErrorMessage(230,inTrait.getPosition(0),inTrait.getName(),Arrays.toString(((StateModifier)smModifier).getSrcStates())));               
                        return false;
                    }   

            }else{
              rFound = smFound.findRegionBasedOnSequence(((StateModifier)smModifier).getSrcStates());
                    if (rFound==null ){
                       getParseResult().addErrorMessage(new ErrorMessage(230,inTrait.getPosition(0),inTrait.getName(),Arrays.toString(((StateModifier)smModifier).getSrcStates())));               
                         return false;
                     }   
            } 
          }
        }
    }
    return true;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 437 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private StateMachine CompeletlyAllyTypeParametersToStateMachines(StateMachine inSMachine, GeneralTPApplied inGTPApplied, UmpleTrait inTrait){
    StateMachine stTemp = ApplyRemoveAndInclude(inSMachine,inGTPApplied);
		if (stTemp!=null) stTemp = ApplyTypeParametersToStateMachine(inSMachine,inGTPApplied);		
		if (stTemp!=null)	{
			ApplyTypeParametersToEventsOfStateMachines(stTemp, inGTPApplied,inTrait);
			ApplyTypeParametersToActionCodesOfStateMachines(stTemp, inGTPApplied,inTrait);
		}	
		return stTemp;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 450 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private StateMachine ApplyTypeParametersToStateMachine(StateMachine inSMachine, GeneralTPApplied inGTPApplied){
    String track=null;
  String mapped=null;
  Map<String, String> nameMapping = new HashMap<String, String>();
  if (inGTPApplied!=null){
    for (StateMachineTemplateSignature smTSignature : inGTPApplied.getStateMachineTemplateSignatures()) {
       //------------------------------------------------------------------------------------------------------
       //This makes sure we are not going to change the name of a state machine and then assign it to state.
       //This won't affect the result.
       boolean mustBeRejected = false;
       if (smTSignature.getAlias()!="" && smTSignature.numberOfSrcStates()==0){
         for (StateMachineTemplateSignature smTSignatureTemp : inGTPApplied.getStateMachineTemplateSignatures()){
           if (smTSignature!=smTSignatureTemp && smTSignatureTemp.getDesStateMachine()!=""){
             mustBeRejected= true;
             
           }
         }
       }
       if (mustBeRejected) continue;
       //------------------------------------------------------------------------------------------------------
       
       mapped = nameMapping.get(smTSignature.getSrcStateMachine());
       if (mapped==null) mapped = smTSignature.getSrcStateMachine();
       track = smTSignature.getSrcStateMachine();
       if (inSMachine.getName().equals(mapped)){
        if (smTSignature.getMethodTemplateSignature()!=null){
          changeEventName(inSMachine,smTSignature);
          continue;
         }
        if (smTSignature.numberOfSrcStates()<=0) {
          if (smTSignature.getAlias()!=""){
            inSMachine.setName(smTSignature.getAlias());
            for (State s : inSMachine.getStates()) s.setStateMachine(inSMachine);
              nameMapping.put(track, smTSignature.getAlias());
          }
         }else { 
          StateMachine smTemp = inSMachine;
          State tState=null;
          Boolean itsSM = false;
          for(int i = 0; i<smTSignature.numberOfSrcStates();i++){
            track = track+"."+smTSignature.getSrcState(i);
            mapped = nameMapping.get(track);
            if (mapped==null) mapped = smTSignature.getSrcState(i);
            if(i % 2==0) {
              tState = smTemp.findState(mapped, false);
              itsSM=false;
            } else{
              for(StateMachine nSM:tState.getNestedStateMachines()){
                if(nSM.getName().equals(mapped)){
                  smTemp = nSM;
                  itsSM=true;
                  break;
                }
              }
            }
          }
          if(itsSM){
            for (StateMachine sm : tState.getNestedStateMachines()){
              if (sm.getName().equals(smTSignature.getAlias()) && sm!=smTemp){
                  getParseResult().addErrorMessage(new ErrorMessage(237,inGTPApplied.getPositions(), inSMachine.getUmpleTrait().getName(), tState.getName(),smTSignature.getAlias()  ));
                  return null;
              }
            }
            smTemp.setName(smTSignature.getAlias());
            smTemp.getStartState().setName(smTSignature.getAlias());
            nameMapping.put(track+"."+smTemp.getStartState().getName(), smTSignature.getAlias());
          } else if (smTemp!=null && tState!=null) {
            String oldtStateName = tState.getName();
            tState.setName(smTSignature.getAlias());
            if (tState.numberOfNestedStateMachines()==1) {
              tState.getNestedStateMachine(0).setName(smTSignature.getAlias());
            }
            nameMapping.put(track, smTSignature.getAlias());
            nameMapping.put(track+"."+oldtStateName, smTSignature.getAlias());
            
          }
        }           
      }
    }
    //This code is used to make sure the * pattern for renaming events name applies to all state machines.
    for (StateMachineTemplateSignature smTSignature : inGTPApplied.getStateMachineTemplateSignatures()) {
      if (smTSignature.getSrcStateMachine().equals("")){
        if (smTSignature.getMethodTemplateSignature()!=null){
          changeEventName(inSMachine,smTSignature);
          continue;
        }
      }
    }
  }
  return inSMachine;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 544 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private StateMachine ApplyRemoveAndInclude(StateMachine inSMachine, GeneralTPApplied inGTPApplied){
    StateMachine modifiedSM = inSMachine;
    if (inGTPApplied!=null){
      for (StateMachineModifier smModifier : inGTPApplied.getStateMachineModifiers()) {
      if(smModifier.getSrcStateMachine().equals(inSMachine.getName())){
            if(smModifier.getModifier().equals("-")){
              if (smModifier instanceof EventModifier){
                removeTransition(modifiedSM,(EventModifier)smModifier);
                continue;
              } else if (smModifier instanceof StateModifier){
                if (((StateModifier) smModifier).getSrcStates().length%2==0){
                  removeRegion2(modifiedSM,(StateModifier)smModifier);
                } else{
                  removeState2(modifiedSM,(StateModifier)smModifier);  
                }
                continue;
              } else if (smModifier instanceof StateMachineModifier){ 
                return null;
              }
            } else if(smModifier.getModifier().equals("+")) {
              if (smModifier instanceof EventModifier){
                keepTransition(modifiedSM,(EventModifier)smModifier);
                continue;
              } else if (smModifier instanceof StateModifier){
                if (((StateModifier) smModifier).getSrcStates().length%2==0){
                  keepRegion(modifiedSM,(StateModifier)smModifier);
                }else{
                  keepState(modifiedSM,(StateModifier)smModifier);
                }
              } else if (smModifier instanceof StateMachineModifier){                 
                //This part is done later. I need to refactor my algorithm
              }
            } else  {
              if (smModifier instanceof EventModifier){
                 EventModifier eventModifier= (EventModifier)smModifier;
              } else if (smModifier instanceof StateModifier){
                 StateModifier sModifier = (StateModifier)smModifier;
              } else if (smModifier instanceof StateMachineModifier){               
            } 
          }   
      }
      }
    } 
    return modifiedSM;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * This function finds and removes a transition defined in 'inEventModifier'
   */
  // line 596 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void removeTransition(StateMachine inSM, EventModifier inEventModifier){
    State foundState =inSM.findStateBasedOnSequence(inEventModifier.getSrcStates());
    if(foundState!=null){
      for (Transition t : foundState.getTransitions()){
        Guard guard = t.getGuard();
        if(inEventModifier.getMethod().getName().equals("")){
          if(guard==null){
            if (inEventModifier.getGuard()==null){
              t.delete();
              return;
            }
          } else if(guard.isEqualTo(inEventModifier.getGuard())) {
            t.delete();
            return;
          }
        } else {
          Method m = new Method("",t.getEvent().getName(),"",false);
          m.setMethodParameters(t.getEvent().getParams());
          if (compareTwoMethdos(m, inEventModifier.getMethod())){
            if(guard==null){
              if (inEventModifier.getGuard()==null){
                t.delete();
                return;
              }
            } else if(guard.isEqualTo(inEventModifier.getGuard())) {
              t.delete();
              return;
            }
          }
        }
      }
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * This function finds and keeps a transition defined in 'inEventModifier'. Other transition will be removed.
   */
  // line 635 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void keepTransition(StateMachine inSM, EventModifier inEventModifier){
    State foundState =inSM.findStateBasedOnSequence(inEventModifier.getSrcStates());
    if(foundState!=null){
      List<Transition> mustbeRemoved = new ArrayList<Transition>(); 
      for (Transition t : foundState.getTransitions()){
        Guard guard = t.getGuard();
        if(inEventModifier.getMethod().getName().equals("")){
          if(guard==null){
            if (inEventModifier.getGuard()!=null){
              mustbeRemoved.add(t);
            }
          } else if(!guard.isEqualTo(inEventModifier.getGuard())) {
            mustbeRemoved.add(t);
          }
        } else {
          Method m = new Method("",t.getEvent().getName(),"",false);
          m.setMethodParameters(t.getEvent().getParams());
          if (!compareTwoMethdos(m, inEventModifier.getMethod())){
              mustbeRemoved.add(t);
          }
        }
      }
      mustbeRemoved.forEach(t -> t.delete());  
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 663 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void removeState(StateMachine inSM, StateMachineTemplateSignature inSMTSignature){
    State foundState =inSM.findStateBasedOnSequence(inSMTSignature.getSrcStates());
    if (foundState.isIsStartState()){
      getParseResult().addErrorMessage(new ErrorMessage(233,foundState.getPosition(),inSM.getUmpleTrait().getName(),"initial",foundState.getName()));
      return;
    }
    if(foundState!=null){
      for(int i=0;i<foundState.numberOfTransitions();i++)         foundState.getTransition(i).delete();
      for(int i=0;i<foundState.numberOfNextTransition();i++)      foundState.getNextTransition(i).delete();     
      foundState.delete(); 
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 678 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void removeState2(StateMachine inSM, StateModifier sModifier){
    State foundState =inSM.findStateBasedOnSequence(sModifier.getSrcStates());
    if (foundState.isIsStartState()){
      getParseResult().addErrorMessage(new ErrorMessage(233,foundState.getPosition(),inSM.getUmpleTrait().getName(),"initial",foundState.getName()));
      return;
    }
    if(foundState!=null){
      for(int i=0;i<foundState.numberOfTransitions();i++)         foundState.getTransition(i).delete();
      for(int i=0;i<foundState.numberOfNextTransition();i++)      foundState.getNextTransition(i).delete();     
      foundState.delete(); 
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 693 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void removeRegion2(StateMachine inSM, StateModifier sModifier){
    String srcState[] = new String[sModifier.numberOfSrcStates()-1];
    System.arraycopy(sModifier.getSrcStates(),0,srcState, 0, sModifier.numberOfSrcStates()-1);
    State foundState =inSM.findStateBasedOnSequence(srcState);  
    String regionName= sModifier.getSrcState(sModifier.numberOfSrcStates()-1);
    if(foundState!=null){
      StateMachine sm = null;
      for(int i=0;i<foundState.numberOfNestedStateMachines();i++){
        if (foundState.getNestedStateMachine(i).getName().equals(regionName)) sm=foundState.getNestedStateMachine(i);
      }
      if (sm!=null) foundState.removeNestedStateMachine(sm);
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 709 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void keepRegion(StateMachine inSM, StateModifier sModifier){
    String srcState[] = new String[sModifier.numberOfSrcStates()-1];
    System.arraycopy(sModifier.getSrcStates(),0,srcState, 0, sModifier.numberOfSrcStates()-1);
    State foundState =inSM.findStateBasedOnSequence(srcState);  
    String regionName= sModifier.getSrcState(sModifier.numberOfSrcStates()-1);
    if(foundState!=null){
      List<StateMachine> smDelete = new ArrayList<StateMachine>();
      for(int i=0;i<foundState.numberOfNestedStateMachines();i++){
        if (!foundState.getNestedStateMachine(i).getName().equals(regionName)) smDelete.add(foundState.getNestedStateMachine(i));
      }
      for(StateMachine sm : smDelete){
        foundState.removeNestedStateMachine(sm);
      }
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 727 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void keepStateMachine(Map<UmpleTrait,List<StateMachine>> inStateMachine, GeneralTPApplied inGTPApplied){
    if (inGTPApplied!=null){
       for (StateMachineModifier smModifier : inGTPApplied.getStateMachineModifiers()) {
         if(smModifier.getModifier().equals("+") && !(smModifier instanceof EventModifier) && !(smModifier instanceof StateModifier) && smModifier instanceof StateMachineModifier ) {
          for(List<StateMachine> list : inStateMachine.values()){
             for(Iterator<StateMachine> iterator = list.iterator();iterator.hasNext();){
               StateMachine sss = iterator.next();
               if(!smModifier.getSrcStateMachine().equals(sss.getName())  ){
                 iterator.remove();
               }
             }
           }
         }
       } 
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * This function will keep the state defined in sModifier and removes others. I won't remove initial state.
   */
  // line 749 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void keepState(StateMachine inSM, StateModifier sModifier){
    State foundState =inSM.findStateBasedOnSequence(sModifier.getSrcStates());
    //This is used to find the nest state machine and remove the state just from that region.
    StateMachine sm = foundState.getStateMachine();
    List<State> mustBeRemoved = new ArrayList<State>();
    for (State state : sm.getStates()){
      if (!state.getName().equals(foundState.getName()) && state.getIsStartState()==false){
        for(int i=0;i<state.numberOfTransitions();i++)         state.getTransition(i).delete();
          for(int i=0;i<state.numberOfNextTransition();i++)      state.getNextTransition(i).delete();     
          mustBeRemoved.add(state);       
      }
    }
    mustBeRemoved.forEach(state-> state.delete());
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 766 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void ApplyTypeParametersToEventsOfStateMachines(StateMachine inStateMachine, GeneralTPApplied inGeneralTPApplied, UmpleTrait inTrait){
    if (inGeneralTPApplied == null && inTrait.getGeneralTemplateParameters().size()==0) return;
    for (GeneralTemplateParameter gtp : inTrait.getGeneralTemplateParameters()){
      String newName = (inGeneralTPApplied!=null && inGeneralTPApplied.getParameterMapping().containsKey(gtp.getName())) ? inGeneralTPApplied.getParameterMapping().get(gtp.getName()) : gtp.getDefaultValue();
      for(Event e : inStateMachine.getAllEvents()){
         for(MethodParameter p : e.getParams()){
           if (p.getType().equals(gtp.getName())){
             p.setType(newName);
          }
        }
      }
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 782 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void ApplyTypeParametersToActionCodesOfStateMachines(StateMachine inStateMachine, GeneralTPApplied inGeneralTPApplied, UmpleTrait inTrait){
    if (inGeneralTPApplied == null && inTrait.getGeneralTemplateParameters().size()==0) return;
    for (Transition transition : inStateMachine.getAllTransitions()){
    if (transition.getAction()!=null )
      transition.getAction().getCodeblock().ApplyTypeParameters(inGeneralTPApplied,inTrait);
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 792 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private boolean CheckSMFromTraitIsNotAvaialbleInClass(UmpleClass inClass, Map<UmpleTrait,List<StateMachine>> inTempTraitStateMachine){
    for (UmpleTrait uTrait : inTempTraitStateMachine.keySet()) {
  		List<StateMachine> tListBeRemoved = new ArrayList<StateMachine>();
    	for (StateMachine tSMachine : inTempTraitStateMachine.get(uTrait)) {
				Map<StateMachine,String> listBeRemoved = new HashMap<StateMachine, String>();
				for(StateMachine cSMachine : inClass.getStateMachines()){
					if (cSMachine.getName().equals(tSMachine.getName())){
						if (!cSMachine.getStartState().getName().equals(tSMachine.getStartState().getName())){
							StateMachine checkSM = mergeTwoStateMachineWithTheSameNameDifferentInitialState(cSMachine,tSMachine);
							getParseResult().addErrorMessage(new ErrorMessage(228,inClass.getPosition(0),cSMachine.getName()));
							if (checkSM!=null) listBeRemoved.put(checkSM,cSMachine.getName());
							tListBeRemoved.add(tSMachine);
						} else {
						addExtraStatesAndTransitions(cSMachine, tSMachine,inClass);	
						}
					}
				}
				for(Map.Entry<StateMachine,String> entry : listBeRemoved.entrySet() ) {
					inClass.removeStateMachine(inClass.getStateMachine(entry.getValue()));
					inClass.addStateMachine(entry.getKey());
				}		
			}
			for(StateMachine stMachine : tListBeRemoved){
				inTempTraitStateMachine.get(uTrait).remove(stMachine);
			}
		}
		return true;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 823 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private boolean CheckSMFromTraitIsNotAvaialbleInOtherTraits(Map<UmpleTrait,List<StateMachine>> inTraitStateMachine, Map<UmpleTrait,List<StateMachine>> inTempTraitStateMachine, UmpleClassifier inUmpleClassifier){
    if (inTraitStateMachine==null) return true;
    if (inTraitStateMachine.size()==0){
  		for(UmpleTrait tUTrait : inTempTraitStateMachine.keySet()){
  			inTraitStateMachine.put(tUTrait, inTempTraitStateMachine.get(tUTrait));
  		}
  		return true;
  	}
  	for(UmpleTrait tUTrait : inTempTraitStateMachine.keySet()){
  		List<StateMachine> mustBeRemoved =new ArrayList<StateMachine>();
	 		for (StateMachine tSMachine : inTempTraitStateMachine.get(tUTrait)) {
				if (stateMachineWillbBAssigned(tSMachine, inUmpleClassifier,tUTrait )) continue;
				for(UmpleTrait uTrait : inTraitStateMachine.keySet()){
					Map<StateMachine,StateMachine> listBeRemoved = new HashMap<StateMachine, StateMachine>();
					for (StateMachine sMachine : inTraitStateMachine.get(uTrait)) {
						if (sMachine.getName().equals(tSMachine.getName())){
							if (!sMachine.getStartState().getName().equals(tSMachine.getStartState().getName())){
								StateMachine checkSM = mergeTwoStateMachineWithTheSameNameDifferentInitialState(sMachine,tSMachine);
								getParseResult().addErrorMessage(new ErrorMessage(228,inUmpleClassifier.getPosition(0),sMachine.getName()));
								if (checkSM!=null)	listBeRemoved.put(checkSM,sMachine);
								mustBeRemoved.add(tSMachine);
							} else {
								addExtraStatesAndTransitions(sMachine, tSMachine,inUmpleClassifier);
								mustBeRemoved.add(tSMachine);
							}
						}
					}
					for(Map.Entry<StateMachine,StateMachine> entry : listBeRemoved.entrySet() ) {
						inTraitStateMachine.get(uTrait).remove(entry.getValue());
						inTraitStateMachine.get(uTrait).add(entry.getKey());
					}
				}
			}
	 		for (StateMachine stMachine : mustBeRemoved){
	 			inTempTraitStateMachine.get(tUTrait).remove(stMachine);
	 		}
		}
		return true;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 865 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private boolean stateMachineWillbBAssigned(StateMachine inStateMachine, UmpleClassifier inUmpleClassifier, UmpleTrait inTrait){
    if (inUmpleClassifier instanceof UmpleClass){
		  if(((UmpleClass)inUmpleClassifier).getGeneralTPAppliedByName(inTrait.getName())!=null){
			  for (StateMachineTemplateSignature smTSignature : ((UmpleClass)inUmpleClassifier).getGeneralTPAppliedByName(inTrait.getName()).getStateMachineTemplateSignatures()) {
				  if (smTSignature.getSrcStateMachine().equals(inStateMachine.getName()) && smTSignature.numberOfDesStates()>0){
					  return true;
				  }
			  }
		  }   
	  } else if (inUmpleClassifier instanceof UmpleTrait){
		  if(((UmpleTrait)inUmpleClassifier).getGeneralTPAppliedByName(inTrait.getName())!=null){
			  for (StateMachineTemplateSignature smTSignature : ((UmpleTrait)inUmpleClassifier).getGeneralTPAppliedByName(inTrait.getName()).getStateMachineTemplateSignatures()) {
				  if (smTSignature.getSrcStateMachine().equals(inStateMachine.getName()) && smTSignature.numberOfDesStates()>0){
					  return true;
				  }
			  }
		  } 
	  }	  
		return false;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 888 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private StateMachine mergeTwoStateMachineWithTheSameNameDifferentInitialState(StateMachine inSMachine1, StateMachine inSMachine2){
    StateMachine newStateMachine = new StateMachine(inSMachine1.getName());
    newStateMachine.setUmpleTrait(inSMachine1.getUmpleTrait());
   	newStateMachine.setUmpleClass(inSMachine1.getUmpleClass());
    if (inSMachine1.getParentState()==null)
    	{
    	newStateMachine.addState(inSMachine1.getName());
    	newStateMachine.getState(0).setIsStartState(true);							
   		inSMachine1.setName(inSMachine1.getStartState().getName());
   		newStateMachine.getState(0).addNestedStateMachine(inSMachine1);
   		inSMachine2.setName(inSMachine2.getStartState().getName());
   		newStateMachine.getState(0).addNestedStateMachine(inSMachine2);
    	} else {
    		State parentState = inSMachine1.getParentState();
     		inSMachine1.setName(inSMachine1.getStartState().getName());
     		inSMachine2.setName(inSMachine2.getStartState().getName());
     		parentState.addNestedStateMachine(inSMachine2);
     		return null;
    	}
    return newStateMachine;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 912 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void AddStateMachineMapToAnother(Map<UmpleTrait,List<StateMachine>> inTraitStateMachine, Map<UmpleTrait,List<StateMachine>> inTempTraitStateMachine){
    for (UmpleTrait uTrait : inTempTraitStateMachine.keySet()) {
			if (inTraitStateMachine.containsKey(uTrait)){
				if (inTempTraitStateMachine.get(uTrait).size()>0)
					for (StateMachine st : inTempTraitStateMachine.get(uTrait)){
						if (!inTraitStateMachine.get(uTrait).contains(st)){
							inTraitStateMachine.get(uTrait).add(st);
						}
					}
			} else{
				inTraitStateMachine.put(uTrait, inTempTraitStateMachine.get(uTrait));
			}	
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 929 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private boolean compareStateMachineName(StateMachine inSMachine1, StateMachine inSMachine2){
    if(inSMachine1.getName().equals(inSMachine2.getName()) && inSMachine1.numberOfStates()==inSMachine2.numberOfStates()){
	    	if (!inSMachine1.getStartState().getName().equals(inSMachine2.getStartState().getName())){
	    		UmpleClassifier uClassifier = inSMachine1.getUmpleClass();
	      	if (uClassifier==null) {
	      		uClassifier = inSMachine1.getUmpleTrait();
	      		if (uClassifier!=null){
	      			//This code has been used for sth else. Check plz.
	      			getParseResult().addErrorMessage(new ErrorMessage(228,uClassifier.getPosition(0),inSMachine1.getName(),"tait", uClassifier.getName()));
	      		} else {
	      			//TODO please write a proper action and error description when this happens
	      		}  
	      	} else {
	      	  //This code has been used for sth else. Check plz.
	      		getParseResult().addErrorMessage(new ErrorMessage(228,uClassifier.getPosition(0),inSMachine1.getName(),"class", uClassifier.getName()));
	      	}
	    	}
		  	return compareStatesAndTransitions(inSMachine1,inSMachine2);
		  	
		} else{
			return false;
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * author: Vahdat.
   * TODO: this doesn't support multiple languages.
   */
  // line 959 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private boolean compareActions(State mainState, State state){
    if (mainState==null || state == null) return false;
		if(mainState.numberOfActions()!=state.numberOfActions()) return false;
		for (Action mAction : mainState.getActionsByType("entry")){
			boolean find = false;
			for (Action cAction : state.getActionsByType("entry")){
				if (mAction.getActionCode().equals(cAction.getActionCode())) {
					find=true;
					break;
				}
				if (!find) return false;
			}
		}
		for (Action mAction : mainState.getActionsByType("exit")){
			boolean find = false;
			for (Action cAction : state.getActionsByType("exit")){
				if (mAction.getActionCode().equals(cAction.getActionCode())) {
					find=true;
					break;
				}
				if (!find) return false;
			}
		}
		return true;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * author: Vahdat.
   * TODO: this doesn't support multiple languages.
   */
  // line 991 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private boolean compareActivities(State mainState, State state){
    if (mainState==null || state == null) return false;
		if(mainState.numberOfActivities()!=state.numberOfActivities()) return false;
		for (Activity mActivity : mainState.getActivities()) {
			boolean find = false;
			for (Activity cActivity : state.getActivities()) {
				if (mActivity.getActivityCode().equals(cActivity.getActivityCode())){
					find = true;
					break;
				}
			}
			if (!find) return false;
		}
		return true;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1009 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private boolean compareStatesAndTransitions(StateMachine inSMachine1, StateMachine inSMachine2){
    for (State state : inSMachine2.getStates()) {
		  State mainState = inSMachine1.findState(state.getName());
		  if (mainState ==null){
			  return false;
		  } else if (!compareActions(mainState,state) || !compareActivities(mainState,state)){
			  return false;
		  } else if (state.numberOfNestedStateMachines()==mainState.numberOfNestedStateMachines()){
		  	for (StateMachine sm2: state.getNestedStateMachines()){
		  		boolean found = false;
		  		for(StateMachine sm1 : mainState.getNestedStateMachines()){
			  		if (compareStateMachineName(sm1, sm2)){
			  			found = true;
			  		}
			  	}
		  		if (!found) return false;
		  	}
		  } else {
		  	return false;
		  }
		  for(Transition trans : state.getTransitions() ){
			  boolean find = false;
			  for(Transition mainlTrans : mainState.getTransitions() ){
				  if (trans.isEqualToTransition(mainlTrans)&& trans.getNextState().getName().equals(mainlTrans.getNextState().getName())) find = true; 
			  }
			  if(!find) return false;
		  }
	  }
	  return true;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1042 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void addExtraStatesAndTransitions(StateMachine inSMachine1, StateMachine inSMachine2, UmpleClassifier inUmpleClassifier){
    List<State> mustBeSet = new ArrayList<State>();
    for (State state : inSMachine2.getStates()) {
      State mainState = inSMachine1.findState(state.getName());
      if (mainState==null){
        mustBeSet.add(state);
      } else {
        checkSatifcationOfRequiredStates(state,inSMachine2);
        applyCompositionAndSuperKeywordToState(inSMachine1, inSMachine2, inUmpleClassifier, mainState, state);
        for (int i = 0; i < state.numberOfTransitions(); i++) {
          Transition tTransition = state.getTransition(i);           
          Transition findTransition= null;
          for(Transition mainlTrans : mainState.getTransitions() ){
            if (mainlTrans.isEqualToTransition(tTransition)){ 
              findTransition = mainlTrans;
                if (checkConflictsOfTransitionActions(inSMachine1, inSMachine2, inUmpleClassifier, state, tTransition, findTransition)) return;
              }
           //   break;
          }
          if(findTransition!=null){
            applyCompositionAndSuperKeywordToTransition(inSMachine1, inSMachine2, findTransition, tTransition,inUmpleClassifier);
            tTransition.delete();
          } else  {      
            State nextState = inSMachine1.findState(tTransition.getNextState().getName());
            if(nextState==null)  nextState = new State(tTransition.getNextState().getName(), inSMachine1);
                        
            tTransition.setFromState(mainState);
            tTransition.setNextState(nextState);
            if (tTransition.getAction()!=null){
              tTransition.getAction().getCodeblock().removeKeyword("superCall;");
              tTransition.getAction().setActionCode(tTransition.getAction().getActionCode()+System.lineSeparator()+"superCall;");
            }
            i--;
          }
        }
        if (checkNoneDeterminismAfterComposition(inSMachine1, inSMachine2, inUmpleClassifier, mainState) ) return;
        for (int i=0; i<state.numberOfNestedStateMachines();i++){
          StateMachine comingSM = state.getNestedStateMachine(i);  
          StateMachine foundNSM = null;
          for(StateMachine comparingSM:mainState.getNestedStateMachines()){
            if (comparingSM.getName().equals(comingSM.getName())){
              foundNSM = comparingSM;
               break;
            }
          }
            if (foundNSM==null){
              mainState.addNestedStateMachine(comingSM);
              i--;
            } else {
              if (!foundNSM.getStartState().getName().equals(comingSM.getStartState().getName())){
                StateMachine checkSM = mergeTwoStateMachineWithTheSameNameDifferentInitialState(foundNSM, comingSM);
                getParseResult().addErrorMessage(new ErrorMessage(228,inUmpleClassifier.getPosition(0),mainState.getName()));
                if (checkSM!=null ) mainState.addNestedStateMachine(checkSM); 
                i--;
              } else {
                addExtraStatesAndTransitions(foundNSM,comingSM,inUmpleClassifier);
              }
            }
        }        
      }  
    }
    for(State state : mustBeSet){
        state.setStateMachine(inSMachine1);
        changeTransitionNextState(inSMachine1.findState(state.getName()),inSMachine1);
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1112 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private Boolean checkConflictsOfTransitionActions(StateMachine inSMachine1, StateMachine inSMachine2, UmpleClassifier inUmpleClassifier, State state, Transition tTransition, Transition findTransition){
    if(inSMachine1.getUmpleTrait()!=null && !inSMachine1.getUmpleTrait().getName().equals(inUmpleClassifier.getName()) && inSMachine2.getUmpleTrait()!=null && !inSMachine2.getUmpleTrait().getName().equals(inUmpleClassifier.getName())) {
      StateMachine originalSM = (inUmpleClassifier instanceof UmpleClass) ? ((UmpleClass)inUmpleClassifier).getStateMachine(inSMachine1.getName()) : ((UmpleTrait)inUmpleClassifier).getStateMachine(inSMachine1.getName());
      boolean checkConflict = false;  
      if (originalSM!=null ){
        State originalState = originalSM.findState(state.getName());                
        if (originalState!=null){
          Transition originalTransition = null;
          for (Transition originalTran : originalState.getTransitions()){
            if (originalTran.isEqualToTransition(findTransition)){
              originalTransition = originalTran; 
            }
          }
          if (originalTransition!=null){
            if (originalTransition.getAction()!=null && originalTransition.getAction().getCodeblock().hasKeyword("superCall;")){
              checkConflict=true;   
            }
          } else{
            checkConflict = true;
            }
        }else{
          checkConflict = true;
        }
      } else {
        checkConflict=true;
      }
      if (checkConflict){
        if (tTransition.getAction()!=null && findTransition.getAction()!=null){
          getParseResult().addErrorMessage(new ErrorMessage(235,tTransition.getPosition(),tTransition.getEvent().getName(),state.getName(),inSMachine1.getUmpleTrait().getName(),inSMachine2.getUmpleTrait().getName()));
          return true;
        }
      }
    }
    return false;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1150 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void checkSatifcationOfRequiredStates(State inState, StateMachine inSMachine){
    for (State checkState : possiblyUnknownStates.keySet()){
      if (checkState.getName().equals(inState.getName()) ){
	     if (checkState.getStateMachine().getUmpleClass()!=null && inSMachine.getUmpleClass()!=null) {
	            if (checkState.getStateMachine().getUmpleClass().getName().equals(inSMachine.getUmpleClass().getName()) ) return;
	     } else if (checkState.getStateMachine().getUmpleTrait()!=null && inSMachine.getUmpleTrait()!=null){
	            if (checkState.getStateMachine().getUmpleTrait().getName().equals(inSMachine.getUmpleTrait().getName()) ) return;
	     }
      }  
    }
    State find = null;
	for (State checkState : possiblyUnknownStates.keySet()){
      if (checkState.getName().equals(inState.getName()) ){
         if (checkState.getStateMachine().getUmpleClass()!=null){
                find = checkState;
               	break;
         }
	  }
  	} 
  	if (find!=null) possiblyUnknownStates.remove(find);
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1174 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private boolean checkNoneDeterminismAfterComposition(StateMachine inSMachine1, StateMachine inSMachine2, UmpleClassifier inUmpleClassifier, State mainState){
    String n1 = inSMachine1.getRootStateMachine().getUmpleClass() ==null ? inSMachine1.getRootStateMachine().getUmpleTrait().getName() : inSMachine1.getRootStateMachine().getUmpleClass().getName();
    String n2 = inSMachine2.getRootStateMachine().getUmpleClass() ==null ? inSMachine2.getRootStateMachine().getUmpleTrait().getName() : inSMachine2.getRootStateMachine().getUmpleClass().getName();
    for(int  i =0 ; i<mainState.numberOfTransitions()-1;i++){
      Transition tI= mainState.getTransition(i);
      if (tI.getAutoTransition() && tI.getGuard()== null && mainState.numberOfTransitions()>1) {
          getParseResult().addErrorMessage(new ErrorMessage(234,tI.getPosition(),tI.getEvent().getName(),n1,n2));
          return true;  
      }
      for (int j = i+1; j<mainState.numberOfTransitions();j++){
        Transition tJ = mainState.getTransition(j);
        if (tJ.getAutoTransition() && tJ.getGuard()==null){
          getParseResult().addErrorMessage(new ErrorMessage(234,tJ.getPosition(),tJ.getEvent().getName(),n1,n2));
          return true;
        } else if(tI.getEvent().compareWithAnotherEvent(tJ.getEvent())){
            if (tI.getGuard()!=null){
              if (tJ.getGuard()==null && !tJ.getNextState().getName().equals(tI.getNextState().getName()))  {
                getParseResult().addErrorMessage(new ErrorMessage(234,tJ.getPosition(),tJ.getEvent().getName(),n1,n2));
                return true;
              }
              if (tI.getGuard().isEqualTo(tJ.getGuard()) && !tI.getNextState().getName().equals(tJ.getNextState().getName())) {
                getParseResult().addErrorMessage(new ErrorMessage(234,tJ.getPosition(),tJ.getEvent().getName(),n1,n2));
                return true;
              }
            } else {
              if (tJ.getGuard()!=null)  {
                getParseResult().addErrorMessage(new ErrorMessage(234,tJ.getPosition(),tJ.getEvent().getName(),n1,n2));
                return true;
              }
            }
        }
        if (tI.isEqualToTransition(tJ)){
          if(!tI.getNextState().getName().equals(tJ.getNextState().getName())){
              getParseResult().addErrorMessage(new ErrorMessage(234,tJ.getPosition(),tJ.getEvent().getName(),n1,n2));
              return true;  
          }
        }
      }
    } 
    return false;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1218 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void applyCompositionAndSuperKeywordToState(StateMachine inSMachine1, StateMachine inSMachine2, UmpleClassifier inUmpleClassifier, State bState, State cState){
    if (inUmpleClassifier instanceof UmpleClass){
        if (inSMachine1.getRootStateMachine().getUmpleClass()!=null){
          //comes from a class
          if (inSMachine1.getRootStateMachine().getUmpleClass().equals( (UmpleClass)inUmpleClassifier )){
            applyCompositionAndSuperKeywordToStateAction(inSMachine2, bState, cState,"entry");
            applyCompositionAndSuperKeywordToStateAction(inSMachine2, bState, cState,"exit");
            applyCompositionAndSuperKeywordToStateActivity(inSMachine2, bState, cState);
          } else{
            //not implemented.
          }
      
        } else {
          //comes from a trait
  
          checkActionActivityConflicts(inSMachine1, inSMachine2, inUmpleClassifier, bState, cState,((UmpleClass)inUmpleClassifier).getStateMachine(inSMachine1.getName()));
          
          if (getParseResult().hasErrorMessages()) return;
          applyCompositionAndSuperKeywordToStateActionE(bState, cState);
          applyCompositionAndSuperKeywordToStateActivityE(bState, cState);
        }
     } else {
        if (inSMachine1.getRootStateMachine().getUmpleTrait()!=null){
          //comes from a trait
          checkActionActivityConflicts(inSMachine1, inSMachine2, inUmpleClassifier, bState, cState,((UmpleTrait)inUmpleClassifier).getStateMachine(inSMachine1.getName()));
          if (inSMachine1.getRootStateMachine().getUmpleTrait().equals( (UmpleTrait)inUmpleClassifier )){
            applyCompositionAndSuperKeywordToStateAction(inSMachine2, bState, cState,"entry");  
            applyCompositionAndSuperKeywordToStateAction(inSMachine2, bState, cState,"exit"); 
            applyCompositionAndSuperKeywordToStateActivity(inSMachine2, bState, cState);
          } else{
            applyCompositionAndSuperKeywordToStateActionE(bState, cState);
            applyCompositionAndSuperKeywordToStateActivityE(bState, cState);
          }   
        } else {
          //comes from a class
        }
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1259 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void checkActionActivityConflicts(StateMachine inSMachine1, StateMachine inSMachine2, UmpleClassifier inUmpleClassifier, State bState, State cState, StateMachine originalSM){
    if (inSMachine1.getUmpleTrait()!=null && inSMachine2.getUmpleTrait()!=null && !inSMachine1.getUmpleTrait().getName().equals(inUmpleClassifier.getName()) && !inSMachine2.getUmpleTrait().getName().equals(inUmpleClassifier.getName())){
     
      if (originalSM!=null && originalSM.findState(bState.getName())!=null){
      State state = originalSM.findState(bState.getName());
    boolean hasSuperCall = false;
    for (Action  action : state.getActionsByType("entry") ){
      if (action.getCodeblock().hasKeyword("superCall;")) {
        hasSuperCall= true;
        break;
      }
    }
      if(  (hasSuperCall || state.getActionsByType("entry").isEmpty()) && !bState.getActionsByType("entry").isEmpty() && !cState.getActionsByType("entry").isEmpty() ) {
          getParseResult().addErrorMessage(new ErrorMessage(236,bState.getPosition(),"entry",bState.getName(),inSMachine1.getUmpleTrait().getName(),inSMachine2.getUmpleTrait().getName()));
          return;
        }
      //---------------------------exit
    hasSuperCall = false;
    for (Action  action : state.getActionsByType("exit") ){
      if (action.getCodeblock().hasKeyword("superCall;")) {
        hasSuperCall= true;
        break;
      }
    }
    if(  (hasSuperCall || state.getActionsByType("exit").isEmpty()) && !bState.getActionsByType("exit").isEmpty() && !cState.getActionsByType("exit").isEmpty() ) {
          getParseResult().addErrorMessage(new ErrorMessage(236,bState.getPosition(),"exit",bState.getName(),inSMachine1.getUmpleTrait().getName(),inSMachine2.getUmpleTrait().getName()));
                  return;
        }
    //---------------------------do
    hasSuperCall = false;
    for (Activity  action : state.getActivities() ){
      if (action.getCodeblock().hasKeyword("superCall;")) {
        hasSuperCall= true;
        break;
      }
    }
        if( ( hasSuperCall || state.getActivities().isEmpty()) &&!bState.getActivities().isEmpty() && !cState.getActivities().isEmpty() ) {
          getParseResult().addErrorMessage(new ErrorMessage(236,bState.getPosition(),"do", bState.getName(),inSMachine1.getUmpleTrait().getName(),inSMachine2.getUmpleTrait().getName()));
                  return;
        }      
      } else {
        if( !bState.getActionsByType("entry").isEmpty() && !cState.getActionsByType("entry").isEmpty() ) {
            getParseResult().addErrorMessage(new ErrorMessage(236,bState.getPosition(),"entry",bState.getName(),inSMachine1.getUmpleTrait().getName(),inSMachine2.getUmpleTrait().getName()));
            return;
          }
          if( !bState.getActionsByType("exit").isEmpty() && !cState.getActionsByType("exit").isEmpty() ) {
            getParseResult().addErrorMessage(new ErrorMessage(236,bState.getPosition(),"exit",bState.getName(),inSMachine1.getUmpleTrait().getName(),inSMachine2.getUmpleTrait().getName()));
                    return;
          }
          if( !bState.getActivities().isEmpty() && !cState.getActivities().isEmpty() ) {
            getParseResult().addErrorMessage(new ErrorMessage(236,bState.getPosition(),"do", bState.getName(),inSMachine1.getUmpleTrait().getName(),inSMachine2.getUmpleTrait().getName()));
                    return;
          }           
      }
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1320 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void applyCompositionAndSuperKeywordToStateActivityE(State bState, State cState){
    for(Activity cActivity : cState.getActivities()){
			  cActivity.getCodeblock().removeKeyword("superCall;");
			  Activity activity = new Activity("",bState);
		  	activity.setCodeblock(cActivity.getCodeblock());
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1330 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void applyCompositionAndSuperKeywordToStateActivity(StateMachine inSMachine, State bState, State cState){
    if (bState.numberOfActivities()>0) {
			  for(Activity mActivity: bState.getActivities()){
				  for(Activity cActivity : cState.getActivities()){
					  if (! mActivity.getComposed()){ 
						  mActivity.getCodeblock().findKeywordAndReplace("superCall;", cActivity.getCodeblock(),inSMachine);
					  } else {
						  creareActivityWithoutSuperCall(bState, cActivity);
					      return;
					  }
				  }
			  }
		 }else  {
			  for(Activity cActivity : cState.getActivities()){
				  creareActivityWithoutSuperCall(bState, cActivity);
			  }						  
		 }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1351 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void creareActivityWithoutSuperCall(State bState, Activity cActivity){
    cActivity.getCodeblock().removeKeyword("superCall;");
		  Activity activity = new Activity("",bState);
		  activity.setCodeblock(cActivity.getCodeblock());
		  activity.setComposed(true);
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1360 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void applyCompositionAndSuperKeywordToStateActionE(State bState, State cState){
    for(Action cAction : cState.getActionsByType("entry")){
		  cAction.getCodeblock().removeKeyword("superCall;");
		  bState.addAction(cAction);
		}
		for(Action cAction : cState.getActionsByType("exit")){
		  cAction.getCodeblock().removeKeyword("superCall;");
		  bState.addAction(cAction);
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1373 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void applyCompositionAndSuperKeywordToStateAction(StateMachine inSMachine, State bState, State cState, String type){
    boolean checkAvailability = false;
		if (type=="entry"){
	  	checkAvailability=bState.getHasEntryAction();
	  }else if (type=="exit"){
	  	checkAvailability=bState.getHasExitAction();
	  }
		if (checkAvailability) {
			  for(Action mAction: bState.getActionsByType(type)){
				  for(Action cAction : cState.getActionsByType(type)){
					  mAction.getCodeblock().findKeywordAndReplace("superCall;", cAction.getCodeblock(),inSMachine);
				  }
			  }
		  }else  {
		  	boolean happened = false;
			  for(Action cAction : cState.getActionsByType(type)){
				  cAction.getCodeblock().removeKeyword("superCall;");
				  bState.addAction(cAction);
				  happened = true;
			  }
			  if (happened){
		  	  Action action  = new Action("superCall;");
		      action.setActionType(type);
		      bState.addAction(action);
		    }
		  }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1403 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void applyCompositionAndSuperKeywordToTransition(StateMachine inSMachine1, StateMachine inSMachine2, Transition fTransition, Transition rTransition, UmpleClassifier inUmpleClassifier){
    if(fTransition.getGuard()==null && rTransition.getGuard()!=null) fTransition.setGuard(rTransition.getGuard());   
    if (fTransition.getAction()==null && rTransition.getAction()!=null){
      rTransition.getAction().getCodeblock().removeKeyword("superCall;");
      fTransition.setAction(rTransition.getAction());
      return;
    }
    if (rTransition.getAction()==null) return;
		if (inUmpleClassifier instanceof UmpleClass){
			  if (inSMachine1.getRootStateMachine().getUmpleClass()!=null){
				  //comes from a class
				  if (inSMachine1.getRootStateMachine().getUmpleClass().equals( (UmpleClass)inUmpleClassifier )){
					  if (fTransition.getAction()!=null)	fTransition.getAction().getCodeblock().findKeywordAndReplace("superCall;", rTransition.getAction().getCodeblock(),inSMachine2);  
				  } else{
					  //not implemented.
				  }
				  
			  } else {
				  //comes from a trait
          if (fTransition.getAction()!=null)  {
            fTransition.getAction().getCodeblock().removeKeyword("superCall;");
            fTransition.getAction().getCodeblock().addKeyword("superCall;");
            fTransition.getAction().getCodeblock().findKeywordAndReplace("superCall;", rTransition.getAction().getCodeblock(),inSMachine2);
          } else {
            fTransition.setAction(rTransition.getAction());
          }
			  }
		} else {
			  if (inSMachine1.getRootStateMachine().getUmpleTrait()!=null){
				  //comes from a trait
				  if (inSMachine1.getRootStateMachine().getUmpleTrait().equals( (UmpleTrait)inUmpleClassifier )){
					  if (fTransition.getAction()!=null)	fTransition.getAction().getCodeblock().findKeywordAndReplace("superCall;", rTransition.getAction().getCodeblock(),inSMachine2);  
				  } else{
//					  rTransition.getAction().getCodeblock().removeKeyword("superCall;");
					  if (fTransition.getAction()!=null)  {
					   fTransition.getAction().getCodeblock().removeKeyword("superCall;");
					   fTransition.getAction().getCodeblock().addKeyword("superCall;");
					   fTransition.getAction().getCodeblock().findKeywordAndReplace("superCall;", rTransition.getAction().getCodeblock(),inSMachine2);
					  } else{
					    fTransition.setAction(rTransition.getAction());
					  }
				  }	  
			  } else {
				  //comes from a class
				}
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1453 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void changeTransitionNextState(State inState, StateMachine inSMachine){
    for (Transition transition : inState.getTransitions() ) {
			State nextState = inSMachine.findState(transition.getNextState().getName());
			if(nextState==null){
				transition.getNextState().setStateMachine(inSMachine);
				changeTransitionNextState(transition.getNextState(),inSMachine);
				nextState = inSMachine.findState(transition.getNextState().getName());
				transition.setNextState(nextState);
			} else {
				transition.setNextState(nextState);
			}
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 1469 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
   private void changeEventName(StateMachine inStateMachine, StateMachineTemplateSignature inSMTSignature){
    for (Transition t : inStateMachine.getAllTransitions()){
    	Method m = new Method("",t.getEvent().getName(),"",false);
  		m.setMethodParameters(t.getEvent().getParams());
  		if (compareTwoMethdos(m, inSMTSignature.getMethodTemplateSignature().getMethod())){
  			t.getEvent().setName(inSMTSignature.getAlias());
  		}
    }
  }


  /**
   * ------------------------------------------
   * ----------  Trace analysis Code  ---------
   * ------------------------------------------
   */
  // line 38 "../../../../src/UmpleInternalParser_CodeTrace.ump"
   private void analyzeTraceToken(Token token, int analysisStep){
    if (analysisStep != 1)
    {
      return;
    }

    if (token.is("tracerDirective"))
    {
    	TracerDirective tracer = model.getTracer();
      LogConfiguration log = new LogConfiguration(tracer);
      TraceMessageSwitch tms = new TraceMessageSwitch(tracer);
      
      for(Token subToken: token.getSubTokens())
      {
        if(subToken.is("tracerType"))
        {
        	String tracerName = subToken.getValue().toLowerCase();
        	
        	if( tracerName.equals("console") | tracerName.equals("file") | tracerName.equals("string") 
        			| tracerName.equals("javaapi") | tracerName.equals("log4j") 
        			| tracerName.equals("lttngjni") | tracerName.equals("lttng") )
        	{
            tracer = new TracerDirective(subToken.getValue().toLowerCase());
        	}
        	else {
            tracer = new TracerDirective("console");
            setFailedPosition(subToken.getPosition(),302);
        	}
        }
        else if(subToken.is("tracerArgument"))
        {
        	if(subToken.getValue().toLowerCase().equals("noconfig"))
        	{
        		log.setGenerateConfig(false);
        		tracer.setLogConfiguration(log);
        	}
        	else
        		tracer.addTracerArgument(new TracerArgument(subToken.getValue(),tracer));
        }
        else if(subToken.is("traceMessageHeader"))
        {
        	for(Token msgToken : subToken.getSubTokens())
        	{
        		if(msgToken.is("switch"))
        		{
        			if( msgToken.getValue().equals("on") )
        			{
        				tms.setOn(true);
        			}
        			else if( msgToken.getValue().equals("off") )
        			{
        				tms.setOff(true);
        			}
        		}
        		
        		if(msgToken.is("option"))
        			tms.addOption(new MessageComponent(msgToken.getValue()));
        	}
        	tracer.setTraceMessageSwitch(tms);
        }
        else if(subToken.is("verbosity"))
        {
          tracer.setVerbosity(true);
        }
        else if(subToken.is("logConfig"))
        {
        	LoggerLevelToAppender logApp = new LoggerLevelToAppender(log);
          
          for(Token logToken : subToken.getSubTokens())
          {
            if(logToken.is("rootLevel"))
            {
              log.setRootLogger(logToken.getValue());
            }
            if(logToken.is("logLevel"))
            {
              logApp.addLevel(new Level(logToken.getValue()));
            }
            if(logToken.is("logAppender"))
            {
              logApp.addAppender(new Appender(logToken.getValue()));
            }
            if(logToken.is("monitorInterval"))
            {
              log.setMonitorInterval(Integer.parseInt(logToken.getValue()));
            }
          }
          tracer.setLogConfiguration(log);
        }
      }
      model.setTracer(tracer);
    }
  }


  /**
   * 
   * Process trace related tokens within the context of a class
   */
  // line 136 "../../../../src/UmpleInternalParser_CodeTrace.ump"
   private void analyzeTraceToken(Token token, UmpleClass aClass){
    // Analyze trace statement token
    if (token.is("trace"))
    {
      if(model.getTracer()==null)
      {
      	model.setTracer(new TracerDirective("console"));
      }
      for( Token traceToken : token.getSubTokens() )
      {
        if( traceToken.is("traceDirective") )
        {
          analyzeTraceStatement(aClass, traceToken);
        }
        else if ( traceToken.is("traceCase") )
        {
          analyzeTraceCaseToken(aClass,traceToken);
        }
      }
      //analyzeTraceStatement(aClass, token);
    }
  }


  /**
   * 
   * Process Trace statement subtokens. Token could be trace directive or trace case
   */
  // line 162 "../../../../src/UmpleInternalParser_CodeTrace.ump"
   private void analyzeTraceStatement(UmpleClass aClass, Token token){
    traceDirective = new TraceDirective(model.getTracer());
    traceAttr = new AttributeTraceItem(traceDirective);
    Label_Association_130: ;
    mte = new MethodTraceItem(traceDirective);
    post = new Postfix(traceDirective);
    TraceRecord traceRecord = null;
    traceDirective.setUmpleClass(aClass);
    Condition cond = new Condition(null, null);

    boolean isFirst = true;

    for( Token traceToken : token.getSubTokens() )
    {
      if( traceToken.is("traceEntity") || traceToken.getName().equals("entry") || traceToken.getName().equals("exit"))
      {
        analyzeTraceItem( traceToken );
      }
      else if( traceToken.is("traceCondition") ) //for where/giving/after/until
      {
        //using the constraint data type, used for holding umple specific conditionals
        int pos = 1;
        if(!traceToken.getSubToken(1).is("constraintToken")){
          String ctype = traceToken.getValue("conditionType");
          if(ctype!=null&&!ctype.equals("where"))
          {
            cond.setConditionType(ctype);
            cond.setConditionallyWhere(false);
          }
          pos = 2;
        }

        if(((ConstraintTokenAnalyzer)model.getAnalyzer("constraintToken"))!=null)
        {
          ((ConstraintTokenAnalyzer)model.getAnalyzer("constraintToken")).setUClassifier(aClass);
          model.getAnalyzer("constraintToken").analyzeToken(traceToken.getSubToken(pos));
        }
        ConstraintTree constraint = new TraceConstraint();
        for(UmpleVariable uv:traceAttr.getUmpleVariables())
        {
          ((TraceConstraint)constraint).addVariable(uv);
        }
        constraint.addElementAll(((ConstraintTokenAnalyzer)model.getAnalyzer("constraintToken")).getConstraint());
        List<Attribute> others = new ArrayList<Attribute>();
        if("after".equals(cond.getConditionType())||"until".equals(cond.getConditionType()))
        {
          for(ConstraintVariable cv:constraint)
          {
            if(cv instanceof ConstraintAttribute)
            {
              others.add(((ConstraintAttribute)cv).getAttribute());
            }
            else if(cv instanceof ConstraintAssociation)
            {
//              others.add(((ConstraintAssociation)cv).getAssociation());
            }
          }
        }
        if(others.isEmpty())
        {
        	cond.setConstraint(constraint);
          Label_Association_131: ;
          mte.setConstraint(constraint);
        }
        else
        {
          String  method = "";

          for(Attribute at:others)
          {
            method+= ",set_"+at.getName();
            method+= ",set"+at.getName().substring(0,1).toUpperCase()+at.getName().substring(1);          	
          }
          String flag = "traceFlag"+getTraceFlagId();
          String code = flag+"="+("after".equals(cond.getConditionType())?"true":"until".equals(cond.getConditionType())?"false":"");
          CodeInjection ci = new CodeInjection("after",method,"", aClass);
          CodeBlock cb = new CodeBlock(code+";");
          cb.setCode("Java",code+";");
          cb.setCode("Cpp",code+";");
          cb.setCode("Php",code+";");
          cb.setCode("Ruby",code);
          ci.setSnippet(cb);
          ci.setConstraintTree(constraint);
          aClass.addCodeInjection(ci);
          constraint = new ConstraintTree();
          cond.setConstraint(constraint);
          Attribute flagAttr = new Attribute(flag,"Boolean","internal",("after".equals(cond.getConditionType())?"false":"until".equals(cond.getConditionType())?"true":""),false,aClass);
          constraint.addElement(new ConstraintUnassignedName(flag));
        }
      }
      else if ( traceToken.getName().equals("giving") )
      {
        TraceCondition tc = analyzeTraceCondition( token, "giving");
        traceDirective.addCondition(tc);
        UmpleVariable attr = traceDirective.getUmpleClass().getAttribute(token.getValue("LHS"));
        if(attr==null)
        {
          Label_Association_132: ;
        }
        traceAttr.addUmpleVariable(attr);
      }     
      else if( traceToken.is("traceFor") )
      {
        String flag = "traceFlag"+getTraceFlagId();
        Attribute flagAttr = new Attribute(flag,"Integer","internal","0",false,aClass);
        traceAttr.setForClause(flag);
        ConstraintTree constraint;
        if(cond.getConstraint()==null)
        {
          constraint = new ConstraintTree();
        } 
        else
        {
          constraint = cond.getConstraint();
          constraint.addElement(new ConstraintOperator("&&"));
        }
        ConstraintTree subTree = new ConstraintTree();
        subTree.addElement(new ConstraintAttribute(flagAttr));
        subTree.addElement(new ConstraintOperator("<"));
        subTree.addElement(new ConstraintNumberLiteral(traceToken.getValue()));
        constraint.addElement(subTree);
        cond.setConstraint(constraint);
      }     
      else if( traceToken.is("tracePeriod") )
      {
        traceAttr.setTraceSet(false);
        traceAttr.setTraceGet(false);
        traceAttr.setTraceConstructor(true);
        traceAttr.setPeriodClause(token.getValue("tracePeriod"));
      }
      else if( traceToken.is("traceDuration") )
      {
        traceAttr.setDuringClause(token.getValue("traceDuration"));
      }
      else if( traceToken.is("traceRecord") || traceToken.getName().equals("only")  || traceToken.is("recordString") )
      {
        if( isFirst )
        {
          traceRecord = new TraceRecord(traceDirective);
          analyzeTraceRecord(traceDirective,traceToken,traceRecord);
          isFirst = false;
        }
        else
          analyzeTraceRecord(traceDirective,traceToken,traceRecord);
      }
      else if( traceToken.is("traceExecute") )
      {
      	traceDirective.getPostfix().setExecuteClause(token.getValue("traceExecute"));
      }
      else if( traceToken.is("logLevel") )
      {
      	traceDirective.getPostfix().addLogLevel(new LogLevel(traceToken.getValue()));
      }
    }
    post.setCondition(cond);
    if( traceAttr.numberOfUmpleVariables() > 0 )
      traceDirective.addAttributeTraceItem(traceAttr);
  }


  /**
   * 
   * Analyze trace record in a trace directive
   */
  // line 326 "../../../../src/UmpleInternalParser_CodeTrace.ump"
   private void analyzeTraceRecord(TraceDirective traceDirective, Token token, TraceRecord traceRecord){
    String record = token.getValue("recordString");
    Attribute attr = traceDirective.getUmpleClass().getAttribute(token.getValue("traceRecord"));

    if( token.getName().equals("only") )
    {
      traceRecord.setRecordOnly(true);
    }
    else if( record != null )
    {
      traceRecord.addRecord(record);
    }
    else if( attr != null )
    {
      traceRecord.addAttribute(attr);
    }
  }


  /**
   * 
   * Analyze Trace Item Token whether trace item is an attribute or a method ... etc
   */
  // line 349 "../../../../src/UmpleInternalParser_CodeTrace.ump"
   private void analyzeTraceItem(Token traceToken){
    int traceItemType = traceItemType(traceToken);

    if( traceItemType == 1 )
    {
      analyzeAttributeTraceItem(traceToken);
    }
    Label_StateMachine_133: ;

    if( traceItemType == 3 )
    {
      analyzeAssociationTraceItem(traceToken);
    }
    if( traceItemType == 4 )
    {
      analyzeMethodTraceItem(traceToken);
    }

    String traceWildCard = traceToken.getValue("traceEntity").toLowerCase();
    
    if( traceWildCard.equals("allattributes") || 
    		traceWildCard.equals("allassociations") || 
    		traceWildCard.equals("allnonapimethods"))
    	anaylzeTraceWildCard(traceToken);
    
    // Trace Warning
    if( traceItemType == -1 )
    	setFailedPosition(traceToken.getPosition(),301);
  }


  /**
   * 
   * Analyzes trace wildcards
   */
  // line 382 "../../../../src/UmpleInternalParser_CodeTrace.ump"
   private void anaylzeTraceWildCard(Token traceToken){
    UmpleClass uClass = traceDirective.getUmpleClass();
    //------------- trace all attribute [wildcard]
    if( traceToken.getValue("traceEntity").toLowerCase().equals("allattributes") )
    {
      for( UmpleVariable attr : uClass.getAllAttributes() )
      {
      	traceAttr.setPosition(traceToken.getPosition());
        traceAttr.addUmpleVariable(attr);
        traceAttr.setTraceGet(true);
        traceAttr.setTraceSet(true);
      }
    }
    Label_Association_134: ;
    //------------- trace all non-api methods [wildcard]
    if( traceToken.getValue("traceEntity").toLowerCase().equals("allnonapimethods") )
    {
      for( Method m : uClass.getMethods() )
      {
      	mte.setPosition(traceToken.getPosition());
        mte.addMethod(m);
        mte.setEntry(true);
        mte.setExit(true);
      }
    }
  }


  /**
   * 
   * Check Type of Trace Item
   * returns (1) attribute (2) state machine (3) association (4) method
   */
  // line 413 "../../../../src/UmpleInternalParser_CodeTrace.ump"
   private int traceItemType(Token traceToken){
    UmpleClass aClass = traceDirective.getUmpleClass();
    int traceItemType = -1;

    // --- check if attribute
    UmpleVariable attr = aClass.getAttribute(traceToken.getValue("traceEntity"));
    Label_Association_135: ;

    if( attr != null )
    {
      traceItemType = 1;
    }

    Label_StateMachine_136: ;
    Label_Association_137: ;

    // --- check if method
    for( Method mVar : aClass.getMethods() )
    {
      if( traceToken.getValue("traceEntity").equals(mVar.getName()) )
      {
        traceItemType = 4;
      }
    }

    return traceItemType;
  }


  /**
   * 
   * Analyze Trace Condition Token. Called when different Trace Directive conditions are encountered (where,until,after)
   * Returns a trace condition filled with left and right hands operands, with comparison operator used
   */
  // line 447 "../../../../src/UmpleInternalParser_CodeTrace.ump"
   private TraceCondition analyzeTraceCondition(Token traceConditionToken, String conditionType){
    ConditionRhs rhs = new ConditionRhs();
    TraceCondition tc = new TraceCondition(rhs);
    tc.setConditionType(conditionType);
    for( Token subToken : traceConditionToken.getSubTokens() )
    {
      if(subToken.is("LHS"))
        tc.setLhs(subToken.getValue("LHS"));
      if(subToken.is("comparison_operator"))
        rhs.setComparisonOperator(subToken.getValue("comparison_operator"));
      if(subToken.is("RHS"))
        rhs.setRhs(subToken.getValue("RHS"));
    }
    tc.setRhs(rhs);
    return tc;
  }


  /**
   * if trace entity is a method
   */
  // line 465 "../../../../src/UmpleInternalParser_CodeTrace.ump"
   private void analyzeMethodTraceItem(Token traceToken){
    for( Method mVar : traceDirective.getUmpleClass().getMethods() )
    {
      if( traceToken.getValue("traceEntity").equals(mVar.getName()) )
      {
        mte.setPosition(traceToken.getPosition());
        mte.addMethod(mVar);
      }
    }

    boolean wasSet = false;
    for(Token sub: traceToken.getParentToken().getSubTokens())
    {
      if(sub.is("Prefix")) 
      {
        for(Token sub2: sub.getSubTokens())
        {
          if( "entry".equals(sub2.getValue("option")) )
          {
            mte.setEntry(true);
            wasSet = true;
          }
          if( "exit".equals(sub2.getValue("option")) )
          {
            mte.setExit(true);
            wasSet = true;
          }
        }
      }
    }
    if(!wasSet)
    {
      mte.setEntry(true);
    }
    traceDirective.addMethodTraceItem(mte);
  }


  /**
   * 
   * Perform post token analysis on trace related elements of the Umple language
   */
  // line 506 "../../../../src/UmpleInternalParser_CodeTrace.ump"
   private void postTokenTraceAnalysis(){
    
  }


  /**
   * if trace entity is an attribute
   */
  // line 23 "../../../../src/UmpleInternalParser_CodeTraceAttribute.ump"
   private void analyzeAttributeTraceItem(Token traceToken){
    UmpleVariable attr = traceDirective.getUmpleClass().getAttribute(traceToken.getValue("traceEntity"));
    attr = attr==null?traceDirective.getUmpleClass().getAssociationVariable(traceToken.getValue("traceEntity")):attr;

    if( attr != null )
    {
      traceAttr.setPosition(traceToken.getPosition());
      traceAttr.addUmpleVariable(attr);

      boolean wasSet = false;

      for(Token sub: traceToken.getParentToken().getSubTokens())
      {
        if(sub.is("Prefix"))
        {
          traceAttr.setTraceSet(false);
          for(Token sub2: sub.getSubTokens())
          {
          	String option = sub2.getValue("option");
          	if(option==null) continue;
            if( "get".equals(option) )
            {
              wasSet = true;
              traceAttr.setTraceGet(true);
            }
            else if( "set".equals(option) )
            {
              wasSet = true;
              traceAttr.setTraceSet(true);
            }
            else
            {
							getParseResult().addErrorMessage(new ErrorMessage(303,sub.getPosition(),option));
            }
          }
        }
      }
      if(!wasSet)
      {
        traceAttr.setTraceSet(true);
      }
    }
  }

  // line 21 "../../../../src/UmpleInternalParser_CodeTraceAssociation.ump"
   private void analyzeAssociationTraceItem(Token traceToken){
    for( AssociationVariable aVar : traceDirective.getUmpleClass().getAssociationVariables() )
		{
			if( traceToken.getValue("traceEntity").equals(aVar.getName()))
				tracedAssoc.addAssociationVariable(aVar);
		}

		for( Association assoc : traceDirective.getUmpleClass().getAssociations() )
		{
			if( assoc.getName().contains(traceToken.getValue("traceEntity") ))
				tracedAssoc.addAssociation(assoc);
		}

		for(Token sub: traceToken.getParentToken().getSubTokens())
		{
			if(sub.is("Prefix"))
			{
				for(Token sub2: sub.getSubTokens())
				{
					if( "cardinality".equals(sub2.getValue("option")) )
					{
						tracedAssoc.setTraceCardinality(true);
					}
					if( "add".equals(sub2.getValue("option")) )
					{
						tracedAssoc.setTraceAdd(true);
						tracedAssoc.setTraceCardinality(false);
					}
					if( "remove".equals(sub2.getValue("option")) )
					{
						tracedAssoc.setTraceRemove(true);
						tracedAssoc.setTraceCardinality(false);
					}
				}
			}
		}
		tracedAssoc.setPosition(traceToken.getPosition());
		traceDirective.addAssociationTraceItem(tracedAssoc);
  }


  /**
   * 
   * Analyzes trace case token and its subtokens (i.e. trace directive tokens)
   */
  // line 23 "../../../../src/UmpleInternalParser_CodeTraceCase.ump"
   public void analyzeTraceCaseToken(UmpleClass aClass, Token token){
    TraceCase tca = new TraceCase();

    for( Token traceToken : token.getSubTokens() )
    {
      if( traceToken.is("tracecase_name") )
      {
        tca.setName(token.getValue("tracecase_name"));
        aClass.addTraceCase(tca);
      }
      if( traceToken.is("traceDirective") )
      {
        analyzeTraceStatement( aClass , traceToken );
        traceDirective.setUmpleClass(null);
        tca.addTraceDirective(traceDirective);
      }
      if( traceToken.is("tracecase_act_name") || traceToken.is("tracecase_deact_name") )
      {
        analyzeTraceCaseActivationToken( aClass , token );
      }
    }
  }

  // line 47 "../../../../src/UmpleInternalParser_CodeTraceCase.ump"
   public void analyzeTraceCaseActivationToken(UmpleClass aClass, Token token){
    for( Token traceToken : token.getSubTokens() )
    {
      for( TraceCase tc : aClass.getTraceCases() )
        if( tc.getName().equals(traceToken.getValue()))
        {
          if( traceToken.is("tracecase_act_name"))
          {
            tc.setActivation(true);
          }
          else if( traceToken.is("tracecase_deact_name"))
          {
            tc.setActivation(false);
          }
        }
    }
  }


  /**
   * Analyze layout tokens to the Umple language
   */
  // line 27 "../../../../src/UmpleInternalParser_CodeLayout.ump"
   private void analyzeLayoutToken(Token token, int analysisStep){
    
  }


  /**
   * There are currently no core tokens of concern in the context of an UmpleClass
   * This method is available if needed
   */
  // line 33 "../../../../src/UmpleInternalParser_CodeLayout.ump"
   private void analyzeLayoutToken(Token token, UmpleClassifier inUmpleClassifier, int analysisStep){
    // Only process layout tokens once all other entities have been analyzed
    if (analysisStep == 1 || shouldProcessClassAgain)
    {
      shouldProcessClassAgain = true;
      return;
    }
  
    if (token.is("elementPosition"))
    {
      inUmpleClassifier.setCoordinates(new Coordinate(token.getIntValue("x"),token.getIntValue("y"), token.getIntValue("width"), token.getIntValue("height")));
    }
    else if (token.is("displayColor"))
    { // See near clone in UmpleInternalParser_CodeClass.ump
      String theColor = token.getValue("colorValue");
      if(theColor.startsWith("=")) theColor=theColor.substring(1,theColor.length());
      if(!theColor.startsWith("\"")) theColor= "\""+theColor;
      if(!theColor.endsWith("\"")) theColor= theColor+"\"";
      inUmpleClassifier.setDisplayColor(theColor);
    }
    Label_Association_138: ;
  }


  /**
   * Perform post token analysis on core elements of the Umple language
   */
  // line 59 "../../../../src/UmpleInternalParser_CodeLayout.ump"
   private void postTokenLayoutAnalysis(){
    layoutNewElements();
  }


  /**
   * Look for any new elements and give them positions if undefined
   */
  // line 65 "../../../../src/UmpleInternalParser_CodeLayout.ump"
   private void layoutNewElements(){
    // layout classes
    for (int i=0; i<model.numberOfUmpleClasses(); i++)
    {
      UmpleClass c = model.getUmpleClass(i);

      if (c.getCoordinates().getStatus() == Coordinate.Status.Defaulted)
      {
        // Do nothing
      }
      else if (c.getCoordinates().getStatus() == Coordinate.Status.Undefined)
      {
        c.setCoordinates(model.getDefaultClassPosition(i+1));
        c.getCoordinates().setStatus(Coordinate.Status.Defaulted);
      }
    }

    // layout interfaces
    for (int i=0; i<model.numberOfUmpleInterfaces(); i++)
    {
      UmpleInterface c = model.getUmpleInterface(i);

      if (c.getCoordinates().getStatus() == Coordinate.Status.Defaulted)
      {
        // Do nothing
      }
      else if (c.getCoordinates().getStatus() == Coordinate.Status.Undefined)
      {
        c.setCoordinates(model.getDefaultInterfacePosition(i+1));
        c.getCoordinates().setStatus(Coordinate.Status.Defaulted);
      }
    }
    Label_Association_139: ;
  }


  /**
   * ------------------------------------------
   * ----------  Diagram analysis Code  -------
   * ------------------------------------------
   */
  // line 32 "../../../../src/UmpleInternalParser_CodeFilter.ump"
   private void analyzeFilterToken(Token token, int analysisStep){
    if (analysisStep == 1)
    {
      shouldProcessAgain = true;
    }
    else if (analysisStep == 2)
    {
      if(token.is("filter"))
      {
        String name = token.getValue("filterName");
        Filter f = new Filter(name);
        for(Token t : token.getSubTokens())
        {
          if(t.is("super"))
          {
            addSuperValue(f,t);
          }
          if(t.is("sub"))
          {
            addSubValue(f,t);
          }
          Label_Association_140: ;
          if(t.is("filterValue"))
          {
            addClassValue(f,t);
          }
          if(t.is("filterCombinedValue"))
          {
            addCombinedFilter(f,t);
          }
        }
        model.addFilter(f);
      }
    }
  }

  // line 69 "../../../../src/UmpleInternalParser_CodeFilter.ump"
   private void addCombinedFilter(Filter f, Token t){
    for(Token nt : t.getSubTokens())
    {
      if("filterName".equals(nt.getName()))
      {
        f.addFilterValue(nt.getValue("filterName"));
      }
    }
  }

  // line 80 "../../../../src/UmpleInternalParser_CodeFilter.ump"
   private void addSuperValue(Filter f, Token t){
    for(Token nt : t.getSubTokens())
    {
      if("superNum".equals(nt.getName()))
      {
        int superNum = Integer.parseInt(nt.getValue("superNum"));
        f.setSuperCount(superNum);
      }
    }
  }

  // line 92 "../../../../src/UmpleInternalParser_CodeFilter.ump"
   private void addSubValue(Filter f, Token t){
    for(Token nt : t.getSubTokens())
    {
      if("subNum".equals(nt.getName()))
      {
        int subNum = Integer.parseInt(nt.getValue("subNum"));
        f.setSubCount(subNum);
      }
    }
  }

  // line 106 "../../../../src/UmpleInternalParser_CodeFilter.ump"
   private void addClassValue(Filter f, Token t){
    for(Token nt : t.getSubTokens())
    {
      if(nt.getValue("classname")!=null)
      {
        // TODO, the filter should have direct *->* connections to classes, not
        // simply their names
        String aValue = nt.getValue("classname");
        f.addValue(aValue);
      }
    }
  }

  // line 67 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private void analyzeMixsetBodyToken(Token token){
    Token mixsetBodyToken = token.getSubToken("extraCode");
    // Code bellow accepts a one element and changes it to be an extraCode
    // To allow one element mixset that is placed inside a class, trait, etc.
    if (token.getSubToken("oneElement") != null)
    {
      Token oneElementToken = token.getSubToken("oneElement");
      oneElementToken.setValue(oneElementToken.getValue()+" ;");
      oneElementToken.setName("extraCode");
      mixsetBodyToken = oneElementToken;
    }
    // end
    if(mixsetBodyToken == null) 
    { 
      String mixsetName = token.getSubToken("mixsetName").getValue();
      getParseResult().addErrorMessage(new ErrorMessage(1511,token.getPosition(), mixsetName));
      return; 
    }
    else 
    mixsetBodyToken.setValue(getMixsetFragmentWithEnclosingElement(token,mixsetBodyToken.getValue()));
    analyzeMixset(token);
  }


  /**
   * This method takes a mixset fragment and adds its context.
   */
  // line 92 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private String getMixsetFragmentWithEnclosingElement(Token token, String mixsetBody){
    if (token.is("ROOT") || token == null)
      return mixsetBody ;

    String tokenKey ="";
    String prefix ="";
    boolean returnMixsetBody= false;
    
if (token.is("classDefinition"))
      {
        tokenKey = "name"; 
        prefix ="class";
        returnMixsetBody= true;
      }
Label_Class_144: ;
    Label_StateMachine_145: ;
    
else if (token.is("traitDefinition"))
      {
        tokenKey = "name"; 
        prefix ="trait";
        returnMixsetBody= true;
      }
Label_Trait_146: ;
    Label_Association_147: ;

    if(! tokenKey.equals("")) 
    {
      mixsetBody = " "+prefix +" "+ token.getValue(tokenKey) + " { " + mixsetBody + " } ";
      if(returnMixsetBody) 
      return mixsetBody;
    }
    
    return getMixsetFragmentWithEnclosingElement(token.getParentToken(), mixsetBody) ;
  }


  /**
   * This method handles mixset use statements appearing in both code and in the console. The method adds mixset use statements to umple model in the first round on analysis, before
   * other umple elements are added to umple model. So, there is no issue regarding which line the mixset use statements are mentioned in.
   */
  // line 119 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private void analyzeMixsetUseStatement(Token t, int analysisStep){
    if (analysisStep != 1) // the analyze occurs just for analysisStep == 1. 
    {
      return;
    } 
    //else
    if (t.is("useStatement"))
    {
      String value = t.getValue("use");
       
       // ignore .ump files since they are proccessed in UseStatementParserAction class (UmpleInternalParser_CodeParserHandlers.ump).
      if (value.endsWith(".ump"))
      {
        return;   
      } 
       //Otherwise
       
      int useLineNumber = t.getPosition().getLineNumber();
      //UmpleFile mixsetUseFile = model.getUmpleFile(); 
      String fileName = t.getPosition().getFilename();
      UmpleFile mixsetUseFile = new UmpleFile(fileName);
      ArrayList<String> mixsetNames = new ArrayList<String>();
      mixsetNames.add(value); // add first use. 
      for(Token subToken : t.getSubTokens()) // add the rest of use-statment that are in : use M1,M2, ... 
      {
        if(subToken.is("extraUse"))
        mixsetNames.add(subToken.getValue("extraUse"));
      }

      for (String mixsetName : mixsetNames)
      {
        // check if the mixset was added before 
        Mixset mixset = model.getMixset(mixsetName.trim());
        if(mixset == null)
        {
          mixset = new Mixset(mixsetName);
          mixset.setUseUmpleFile(mixsetUseFile);
          mixset.setUseUmpleLine(useLineNumber);
          model.addMixsetOrFile(mixset);
        }
        else if (mixset.getUseUmpleFile() == null)
        {
          mixset.setUseUmpleFile(mixsetUseFile);
          mixset.setUseUmpleLine(useLineNumber);
        }
	   
	    // this handles the case when a mixset definition is in a file and the mixset use exists in a subsequent file.
	    parseMixset(mixset); 
      }
    }
  }


  /**
   * This method parses all waiting fragments of a mixset, if there is a mixset-use-statment specified in some of the files.
   * private void parseMixset(){
   * 
   * for (MixsetOrFile mOrF : model.getMixsetOrFiles())
   * {
   * if(mOrF.getIsMixset() &&  (mOrF.getUseUmpleFile() != null) ) // the second condition is to check if there is a use statement.
   * {
   * Mixset mixset =(Mixset) mOrF;
   * for(MixsetFragment mixsetWaitingFrag: mixset.getFragments())
   * {  
   * //String allMixsetBody = modelMixset.getWaitingFragments().stream().map(mixsetFrag -> mixsetFrag.getBody()).collect(Collectors.joining(" "));
   * ParseResult pResult= parse("MixsetFragmentParsing",  mixsetWaitingFrag.getBody()); 
   * Token answer = parser.getRootToken(); // result of parsing the body of a mixset waitingFragments
   * analyzeAllTokens(answer); 
   * }
   * }
   * }
   * 
   * }
   * This method loops through a mixset to parse its waiting fragments.
   * It should be used after checking existing of a mixset-use-statment.
   */
  // line 203 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private void parseMixset(Mixset mixset){
    for(MixsetFragment mixsetFragment: mixset.getMixsetFragments())
   {
    if(mixsetFragment.getIsParsed())
    continue;
    //Otherwise
    parseMixsetWaitingFragment(mixsetFragment);  
   }
  }

  // line 220 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private void parseMixsetWaitingFragment(MixsetFragment mixsetFragment){
    if(! mixsetFragment.getIsParsed()) // a fragment that is not parsed before. 
  {
    String mixsetFragmentFile = mixsetFragment.getOriginalUmpFile().getPath()+"/"+mixsetFragment.getOriginalUmpFile().getFileName();
    int mixsetFragmentLine = mixsetFragment.getOriginalUmpLine() - 1;
		
    /* This additon to mixset fragment body becuase init(.....) of ParserDataPackage splits by '\\n', and then its stores the splited string appended with a newline 
     *  in its 'input' filed. If there is an error at the last item of the mixset body, umple will not figure out the correct postion of the error. Because 'input' has 
     *  items end with new line, while the original string may not end with empty line. Adding "\n;" to the body fixes the issue. 
     */

    String mixsetFragmentBodyExtraLine = mixsetFragment.getBody()+"\n;";

    ParseResult result= parse("MixsetFragmentParsing",  mixsetFragmentBodyExtraLine, mixsetFragmentFile, null, mixsetFragmentLine,0); 
    setParseResult(result);
    Token answer = parser.getRootToken(); // result of parsing the body of a mixset waitingFragments
    setRootToken(answer);
    model.setLastResult(result);
    answer.setName("mixsetDefinition"); //attach the mixset name for the fragment instead of ROOT
    answer.setValue(mixsetFragment.getMixset().getMixsetName());
    analyzeAllTokens(answer);
    mixsetFragment.setIsParsed(true);
   }
  }

  // line 247 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private void analyzeMixsetToken(Token t, int analysisStep){
    if (analysisStep != 2)
    {
      shouldProcessAgain = shouldProcessAgain || (analysisStep == 1);
      return;
    }      
    if (t.is("mixsetDefinition"))
    {
      analyzeMixset(t);
    }
  }

  // line 260 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private Mixset analyzeMixset(Token token){
    String mixsetName = token.getValue("mixsetName");
    // check if the mixset is was not added before
    Mixset mixset = model.getMixset(mixsetName);
    
    if(mixset  == null)
    {
       mixset  = new Mixset(mixsetName);
       model.addMixsetOrFile(mixset);
    }
    //inline mixset def.
    MixsetFragment mixsetFragment = createMixsetFragment(token, mixset);
    if(mixsetFragment == null)
    return mixset;
    //else      
    // Here the mixset fragment is considered as waitingFragment (mixsetFragment.isParsed==false). 
    mixset.addMixsetFragment(mixsetFragment);
    mixsetFragment.setMixset(mixset);
    // parse mixset fragments right away if there is a use-statement. 
    if(mixset.getUseUmpleFile() != null)
      parseMixsetWaitingFragment(mixsetFragment);
      
      return mixset;
  }

  // line 285 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private MixsetFragment createMixsetFragment(Token token, Mixset mixset){
    MixsetFragment mixsetFragment = createMixsetFragment(token);
    if(mixsetFragment == null || mixset == null)
    return null;
    else
    mixsetFragment.setMixset(mixset);
    return mixsetFragment;
  }

  // line 294 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private MixsetFragment createMixsetFragment(Token token){
    Position mixsetFragmentPosition = null;
    int mixsetFragmentLineNumber = 0;
    String mixsetBody = token.getValue("extraCode");
    if(mixsetBody != null)
    {
      mixsetFragmentPosition = token.getSubToken("extraCode").getPosition();
    }       
    String entityType = token.getValue("entityType");
    String entityName = token.getValue("entityName");
    
    // mixset with one element
    String oneElementMixset = token.getValue("oneElement");
    
    if(entityType != null) {
        if (oneElementMixset != null)
      {
        mixsetBody = entityType + " "+entityName + " { "+ oneElementMixset + " }";
        mixsetFragmentPosition = token.getSubToken("oneElementMixset").getPosition();       
      }
      else
        mixsetBody = entityType + " "+entityName + " { "+ mixsetBody + " }";
        mixsetFragmentPosition = token.getSubToken("extraCode").getPosition();  
      }
      else if (oneElementMixset != null) 
      {
        mixsetBody = oneElementMixset;
        mixsetFragmentPosition = token.getSubToken("oneElementMixset").getPosition();     
      }
      
      if(mixsetBody == null)
      return null; // because there is no fragment to add. 
    
      mixsetFragmentLineNumber = mixsetFragmentPosition.getLineNumber();
      UmpleFile mixsetFragmentUmpleFile = model.getUmpleFile(); // where the mixset keyword is encountered. Not the use statement 
      // Start: update the fragment file if the fragment came from a file included by use statement.
      Token lookForUseStToken = token;
		  while((lookForUseStToken = lookForUseStToken.getParentToken()) != null)  
		  {
		    if(lookForUseStToken.is("useStatement"))
		    {
		    	mixsetFragmentUmpleFile = new UmpleFile(lookForUseStToken.getSubToken("use").getValue());
		    	break;
		    }  		  
		  } 
      //End
      MixsetFragment mixsetFragment = new MixsetFragment(mixsetFragmentUmpleFile, mixsetFragmentLineNumber, mixsetBody);
    return mixsetFragment;
  }


  /**
   * this method specifies kinds of tokens to be parsed for unused mixset.
   */
  // line 344 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private void parseMixsetNotUsedToken(Token token){
    
//parse require statments. 
      analyzeRequireStatement(token, 2);
Label_FeatureModel_148: ;

    // parse nested mixset def.
    if(token.is("mixsetDefinition"))
    {
      String mixsetName = token.getValue("mixsetName");
      // check if the mixset is was not added before
      Mixset mixset = model.getMixset(mixsetName);
      if(mixset  == null)
      {
        mixset  = new Mixset(mixsetName);
        model.addMixsetOrFile(mixset);
      }   
      parseMixsetFragmentNotUsed(createMixsetFragment(token), mixset.getName());
    }
  }

  // line 362 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private void parseMixsetFragmentNotUsed(MixsetFragment mixsetFragment, String parentMixset){
    if(mixsetFragment == null)
    return;
    //else
    if(! mixsetFragment.getIsParsed()) // process a fragment that has not been parsed. 
    {
      String mixsetFragmentFile = mixsetFragment.getOriginalUmpFile().getPath()+"/"+mixsetFragment.getOriginalUmpFile().getFileName();
      int mixsetFragmentLine = mixsetFragment.getOriginalUmpLine() - 1;
      String mixsetFragmentBodyExtraLine = mixsetFragment.getBody()+"\n;";
      ParseResult result= parse("MixsetFragmentParsing",  mixsetFragmentBodyExtraLine, mixsetFragmentFile, null, mixsetFragmentLine,0); 
      setParseResult(result);
      Token answer = getParser().getRootToken(); // result of parsing the body of a MixsetFragment
      //    setRootToken(answer);
      //    model.setLastResult(result);
      answer.setName("mixsetDefinition"); //attach the mixset name for the fragment instead of ROOT
      answer.setValue(parentMixset);
      //  getIsFeature()
      //isFeature + umpFiles(use-st) + require-st
      for(Token token : answer.getSubTokens())
      {
        parseMixsetNotUsedToken(token);
        // an ump file included in an unused mixset: it should be partially parsed to know mixsets' dependencies.
        // 
        if (token.is("useStatement")) 
        {          
          String umpFileName = token.getSubToken("use").getValue();
          if(parsedUmpfiles.keySet().contains(umpFileName)) // accept a file that has not been parsed before.
          return;
          //else
          for (Token subToken : token.getSubTokens())
          {
            parseMixsetNotUsedToken(subToken);
          }
          parsedUmpfiles.put(umpFileName, false); // add current file to partially parsed files. 
        }
      }
    }
  }


  /**
   * This method does partial parsing for mixsets that have no use-statements.
   */
  // line 404 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private void parseMixsetsNotUsed(){
    List<Mixset> mixsetList = model.getMixsetOrFiles().stream().filter(mixset -> mixset.getIsMixset()).map(obj -> (Mixset)obj).collect(Collectors.toList());
    for (Mixset aMixset: mixsetList)
    {
      List<MixsetFragment>mixsetFragmentList = aMixset.getMixsetFragments();
      for(MixsetFragment aMixsetFragment :  mixsetFragmentList)
      {
        if(aMixsetFragment.getIsParsed()) // the fragment is already parsed 
          continue;
        else
        {
          parseMixsetFragmentNotUsed(aMixsetFragment, aMixsetFragment.getMixset().getName());   
        }
      }
      
    }
  }


  /**
   * a helper method that process pure code to either remove it or to let mixset content stay.
   */
  // line 422 "../../../../src/UmpleInternalParser_CodeMixset.ump"
   private String processInlineMixset(String methodCode, MethodBody methodBody){
    // process mixsets inside code 
     ArrayList<MixsetInMethod> mixsetInCodeList = MethodBody.getMixsetsFromCode(methodCode) ;
    for (MixsetInMethod aMixsetInMethod : mixsetInCodeList) 
    {
      // update the code according to  use statements (of mixsets)
      methodCode = MethodBody.handelMixsetInsideMethod(this.getModel(), aMixsetInMethod, methodCode);
      if(methodBody !=null)
      {
        methodBody.addMixsetInMethod(aMixsetInMethod);
      }	        
    }
    return methodCode;
  }

  // line 19 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public void analyzeRequireStatement(Token t, int analysisStep){
    if (analysisStep != 2)
    {
      shouldProcessAgain = shouldProcessAgain || (analysisStep == 1);
      return;
    }
    
    if (t.is("mixsetIsFeature"))
    {
      FeatureModel featureModel = model.getFeatureModel();
      if(featureModel == null)
        featureModel = new FeatureModel("featureModel");
      featureModel.setUmpleModel(model);

      FeatureLeaf sourceFeatureLeaf;
      Mixset sourceMixset = getMixsetFromToken(t); // the mixset containing the isFeature;
      if(sourceMixset != null)
      {
        sourceFeatureLeaf = featureModel.getOrCreateFeatureLeafNode(sourceMixset.getName());
        sourceFeatureLeaf.setMixsetOrFileNode(sourceMixset); 
      }

    }   
    if (t.is("requireStatement"))
    {
      FeatureModel featureModel = model.getFeatureModel();
      if(featureModel == null)
        featureModel = new FeatureModel("featureModel");
      featureModel.setUmpleModel(model);

      FeatureLeaf sourceFeatureLeaf;
      Mixset sourceMixset = getMixsetFromToken(t);
      if(sourceMixset != null)
      {
        sourceFeatureLeaf = featureModel.getOrCreateFeatureLeafNode(sourceMixset.getName());
        sourceFeatureLeaf.setMixsetOrFileNode(sourceMixset); 
      }
      else
      {
        UmpleFile ufile = new UmpleFile(t.getPosition().getFilename());
        sourceFeatureLeaf = featureModel.getOrCreateFeatureLeafNode(ufile.getName()); 
        sourceFeatureLeaf.setMixsetOrFileNode(ufile);
      }
    
      boolean isSubFeature = t.getSubToken("subfeature") != null; 

       //tokens needed for parsing require-statement
      List<String> acceptedTokensList = Arrays.asList("requireTerminal","and","not","xor","or","opt","(",")");
      ArrayList<Token> requireTokenList = getRequireStatementTokensAsList(t, acceptedTokensList);      
      Token firstTokenOfRequireTokenList;

      if(requireTokenList.size() == 0 ) // require [ ]
      return;

      if (requireTokenList.size() >= 1)  // has the form of : require [A and B or C .... ]
      {
        List<TokenTree> tokenTreeList = generateFeatureTreeTokenFromRequireStList(requireTokenList);
        for(TokenTree tree: tokenTreeList)
        createFeatureModelSegment(sourceFeatureLeaf,tree,isSubFeature);
        
        //
        // TO Do: add tree for the feature model : Done
        // To Do: not and opt implementaion 
        // TO Do:  1..3 of {A, B, C} : Done 
      }
    
    }
  }


  /**
   * this method generates a new feature and links it with a source feature based on its token in the TokenTree.
   * It return null if either treeNode or source feature is null.
   */
  // line 92 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public FeatureNode createTargetFeature(TokenTree treeNode, FeatureNode sourceFeature, boolean isSubFeature){
    if (treeNode == null || sourceFeature == null)
    return null; // To Do : should raise error here 
    FeatureNode newFeatureNode = new FeatureNode(model.getFeatureModel());
    newFeatureNode.setName(treeNode.getNodeToken().getName());
    FeatureLink edge = new FeatureLink();
    edge.setFeatureConnectingOpType(treeNode.getFeatureConnectionOpType(isSubFeature));
    edge.setSourceFeatureNode(sourceFeature);
    edge.setIsSub(isSubFeature);
    edge.setTargetFeatureNode(newFeatureNode); 
    edge.setFeatureModel(model.getFeatureModel());
    model.getFeatureModel().addFeaturelink(edge);
    return newFeatureNode;
  }


  /**
   * This method takes a require-st as a token tree and then it generates its segment in the feature model
   */
  // line 110 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public void createFeatureModelSegment(FeatureNode sourceFeature, TokenTree tokenTree, boolean isSubFeature){
    Token node = tokenTree.getNodeToken();
    TokenTree linkingParent = tokenTree.getParentTokenTree();
    FeatureLink edge = null;
    FeatureModel featureModel = model.getFeatureModel();
    if(! tokenTree.getIsLinkingOperator())
    {
      if(node.is("opt") || node.is("not"))
      {
        if(tokenTree.getRightTokenTree().getNodeToken().is("requireTerminal"))
        {
          Mixset targetMixset = new Mixset(tokenTree.getRightTokenTree().getNodeToken().getSubToken("targetMixsetName").getValue());
          FeatureLeaf targetFeature = featureModel.getOrCreateFeatureLeafNode(targetMixset.getName()); 
          targetFeature.setMixsetOrFileNode(targetMixset);
          edge = new FeatureLink();
          edge.setFeatureConnectingOpType(tokenTree.getFeatureConnectionOpType(isSubFeature));
          edge.setSourceFeatureNode(sourceFeature);
          edge.setTargetFeatureNode(targetFeature);
          edge.setIsSub(isSubFeature);
          model.getFeatureModel().addFeaturelink(edge);          
        }
      }
      if(node.is("requireTerminal") && node.getSubToken("lowerBound") == null)
      {        	
        //Mixset targetMixset = model.getMixset(node.getSubToken("targetMixsetName").getValue());
        //if(targetMixset == null)
        //return; // To Do: should raise warning 
        Mixset targetMixset = new Mixset(node.getSubToken("targetMixsetName").getValue());
        FeatureLeaf targetFeature = featureModel.getOrCreateFeatureLeafNode(targetMixset.getName()); 
        targetFeature.setMixsetOrFileNode(targetMixset);
        edge = new FeatureLink();
        edge.setFeatureConnectingOpType(linkingParent.getFeatureConnectionOpType(isSubFeature));
        edge.setSourceFeatureNode(sourceFeature);       
        edge.setTargetFeatureNode(targetFeature);
        edge.setIsSub(isSubFeature);
        model.getFeatureModel().addFeaturelink(edge);
      }
      else if(node.is("requireTerminal") && node.getSubToken("lowerBound") != null) //  [lowerBound]..[upperBound] of [A, B, ... ]
      {        
        MultiplicityFeatureConnectingOpType multiplicityFeatureConnectingOpTypeEdge = new MultiplicityFeatureConnectingOpType();
        Multiplicity featureLinkMultiplicity = multiplicityFeatureConnectingOpTypeEdge.getMultiplicity();
        featureLinkMultiplicity.setRange(node.getSubToken("lowerBound").getValue(), node.getSubToken("upperBound").getValue());
        multiplicityFeatureConnectingOpTypeEdge.setMultiplicity(featureLinkMultiplicity);
        edge = (FeatureLink) multiplicityFeatureConnectingOpTypeEdge;

        CompoundFeatureNode newCompoundFeatureNode = new CompoundFeatureNode(model.getFeatureModel());
        newCompoundFeatureNode.setName("multiplicityTerminal");
        //newCompoundFeatureNode.setIsLeaf(true);
        edge.setTargetFeatureNode(newCompoundFeatureNode); 
        edge.setSourceFeatureNode(sourceFeature); 
        edge.setFeatureModel(model.getFeatureModel());
        edge.setIsSub(isSubFeature);
        model.getFeatureModel().addFeaturelink(edge);
        // add child elements to newCompoundFeatureNode.
        for(Token subToken : node.getSubTokens())
        {
          if(subToken.is("targetMixsetName"))
          {
            Mixset targetMixset = new Mixset(subToken.getValue()); //To Do: check if its a mixset.
            FeatureLeaf targetFeature = featureModel.getOrCreateFeatureLeafNode(targetMixset.getName()); 
            targetFeature.setMixsetOrFileNode(targetMixset);
            newCompoundFeatureNode.addChildFeature(targetFeature);
          }
        }
      } 
 
    }
    else 
    {
        TokenTree rightTokenTree = tokenTree.getRightTokenTree();
        TokenTree leftTokenTree = tokenTree.getLeftTokenTree();
        if (rightTokenTree == null || leftTokenTree == null)
        return; //To Do: raise error since a connection node does not have left or right node 
        //else 
        FeatureNode intermediateFeatureNode = null;
        boolean parentTokenEqualsCurrentNodeToken = node.is(linkingParent.getNodeToken().getName());
        if (!parentTokenEqualsCurrentNodeToken)
        {
          intermediateFeatureNode = createTargetFeature(tokenTree, sourceFeature, isSubFeature);
          createFeatureModelSegment(intermediateFeatureNode,rightTokenTree,isSubFeature);
          createFeatureModelSegment(intermediateFeatureNode,leftTokenTree,isSubFeature);
        }
        else 
        {
          createFeatureModelSegment(sourceFeature,rightTokenTree,isSubFeature);
          createFeatureModelSegment(sourceFeature,leftTokenTree,isSubFeature);
        }

    }
  }


  /**
   * This method filters unwanted tokens & changes the form of require-statement argument from 
   * nested tokens, as the parser does, to list of tokens.
   */
  // line 205 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public ArrayList<Token> getRequireStatementTokensAsList(Token requireStatementToken, List<String> acceptedTokensList){
    ArrayList<Token> TokenList =  new ArrayList<Token>();
    Token terminal;
    for(Token innerToken : requireStatementToken.getSubTokens())
    {
      if (! innerToken.getName().equals("") && acceptedTokensList.contains(innerToken.getName()))
      {
        TokenList.add(innerToken);
      }
      else if (innerToken.getSubTokens() != null)
      	TokenList.addAll(getRequireStatementTokensAsList(innerToken,acceptedTokensList)); // this to obtain [and] out of [requireLinkingOp] 
    }
    return TokenList;
  }


  /**
   * This methods returns the mixset in which require-statement was found.
   * It returns null if the require-statement is in a file (not inside a mixset).
   */
  // line 224 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   private Mixset getMixsetFromToken(Token token){
    Token parentToken = token.getParentToken();
  	if (parentToken.is("mixsetDefinition"))
  	  return model.getMixset(parentToken.getValue());
  	
  	return null;
  }


  /**
   * This method parses req-statement argument & generates a binary tree representation form the req-statment argument.
   * //It returns one node (root node) if there is no argument to parse.
   */
  // line 237 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   private ArrayList<TokenTree> generateFeatureTreeTokenFromRequireStList(List<Token> tokenList){
    TokenTree rootTokenTree = new TokenTree(new Token("ROOT",""));
  TokenTree currentTree = rootTokenTree;		
  List<String> linkingOpList = Arrays.asList("and","or","xor");
	ArrayList<TokenTree> tokenTreeList = new ArrayList<TokenTree>();
  int openRoundBracketCount=0;
  int openBracketIndex = 0;
  ArrayList<TokenTree> tempTokenTreeList = new ArrayList<TokenTree>();

  for (int i=0;i<tokenList.size();i++)
  {
    Token token = tokenList.get(i);
    TokenTree rightTokenTree = new TokenTree(token);
    if(linkingOpList.contains(token.getName()))
    rightTokenTree.setIsLinkingOperator(true);
    //Start(1): handel open_round_bracket by assigning a temp variable to avoid processing it when building the binary tree. 
    //each temp variable will be replaced before method return. 
    if(token.getName().equals("("))
    {
      openRoundBracketCount++;
      if(openRoundBracketCount == 1)
      openBracketIndex = i;
      continue;
    }
    else if (token.getName().equals(")"))
    {
      openRoundBracketCount--;
      if(openRoundBracketCount == 0) //last close
      {
        ArrayList<TokenTree> temp = generateFeatureTreeTokenFromRequireStList(tokenList.subList(openBracketIndex+1,i));
        if(temp.size() == 1)
        {
          Token tempToken = new Token("requireTerminal","temp_"+tempTokenTreeList.size());
          tempTokenTreeList.add(temp.get(0));
          rightTokenTree.setNodeToken(tempToken);
        }
      }
      else 
      continue; 
    } 
    else if(openRoundBracketCount >0) //there was a bracket 
    continue;
    //End(1)
    //Start(2): put each [opt/not][terminal] in a separate TokenTree if it was preceded with [terminal]
    if(token.is("opt") || token.is("not"))
    {
      if(currentTree.getNodeToken().is("requireTerminal") && tokenList.get(i+1).is("requireTerminal")) // A opt B
      {
        rightTokenTree.setRightTokenTree(new TokenTree(tokenList.get(i+1)));
        // setParent to rightTokenTree
        tokenTreeList.add(rightTokenTree);
        i++; //skip opt terminal 
        continue;
      }
    }
    //End(2)
    currentTree.setRightTokenTree(rightTokenTree);
    rightTokenTree.setParentTokenTree(currentTree);
    currentTree = rightTokenTree;
  }
  currentTree = rootTokenTree.getRightTokenTree(); //currentTree points to the first node of the tree
  
  TokenTree previousLinkingSubTokenTree = null; 
	//Start(3): building the binary tree of re-st argument 
  while(currentTree.getRightTokenTree() != null)
 	{
		TokenTree rightLinkingTokenTree = currentTree.getRightTokenTree(); //linking operator on the right of current node 	
    if(rightLinkingTokenTree == null)
    break;
    if(currentTree.getNodeToken() == null || currentTree.getNodeToken().getName() == null ) 
     continue;
    if(currentTree.getNodeToken().is("requireTerminal") && rightLinkingTokenTree.getIsLinkingOperator())
    {
		// A and B --> (and A B)
    	if (previousLinkingSubTokenTree == null)
      {
      	currentTree.setParentTokenTree(rightLinkingTokenTree);
        rightLinkingTokenTree.setLeftTokenTree(currentTree);
        rightLinkingTokenTree.setParentTokenTree(rootTokenTree);
        rootTokenTree.setRightTokenTree(rightLinkingTokenTree);
        previousLinkingSubTokenTree = rightLinkingTokenTree;
      }
      else
	    {
		    /*
				this for the case : A and B or C --> (or (and A B))
		    */
		    if(previousLinkingSubTokenTree.getPriority() >= rightLinkingTokenTree.getPriority())
		    { 
		    	TokenTree linkNodeToReplace = previousLinkingSubTokenTree;
		      while(linkNodeToReplace != null && ! linkNodeToReplace.getNodeToken().getName().equals("ROOT") )
		      {
		      	if (linkNodeToReplace.getPriority() >= rightLinkingTokenTree.getPriority() )
		        {
							previousLinkingSubTokenTree = linkNodeToReplace;
		        }
						linkNodeToReplace = linkNodeToReplace.getParentTokenTree();
		      }
		      rightLinkingTokenTree.setLeftTokenTree(previousLinkingSubTokenTree);
          rightLinkingTokenTree.setParentTokenTree(previousLinkingSubTokenTree.getParentTokenTree());
		      previousLinkingSubTokenTree.getParentTokenTree().setRightTokenTree(rightLinkingTokenTree); 
		      previousLinkingSubTokenTree.setParentTokenTree(rightLinkingTokenTree);
		      previousLinkingSubTokenTree=rightLinkingTokenTree;	
		    }
		    else
			  {
					/*
		    	this for the case : A or B and C --> or (and A B)
		    	*/
		    	rightLinkingTokenTree.setLeftTokenTree(currentTree);
					rightLinkingTokenTree.setParentTokenTree(previousLinkingSubTokenTree);
			  	previousLinkingSubTokenTree.setRightTokenTree(rightLinkingTokenTree);
		      previousLinkingSubTokenTree = rightLinkingTokenTree;
		    }
		  }
    	// last step: set right node of terminal to null 
    	currentTree.setRightTokenTree(null);
  		}
  	currentTree = rightLinkingTokenTree; // move to next node of the tree 
		}
  tokenTreeList.add(rootTokenTree.getRightTokenTree());
  //End(3)
  //Start(4): replace temp with actual values 
  if(tempTokenTreeList.size() > 0) //there is a open & close round bracket 
  {
    for(TokenTree aTokenTree : tokenTreeList)
    {
      replaceTempTerminalWithActualValues(aTokenTree,tempTokenTreeList);
    }
  }
  //End(4)
	return tokenTreeList;
  }


  /**
   * This method replaces each node in TokenTree that is [requireTerminal] and has a temporary value.
   * The actual value of the node, which may be a tree, is stored in tempTokenTreeList.
   */
  // line 376 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   private void replaceTempTerminalWithActualValues(TokenTree tokenTree, ArrayList<TokenTree> tempTokenTreeList){
    Token token = tokenTree.getNodeToken();
    if(token != null)
    {
      if(token.is("requireTerminal") && token.getValue().startsWith("temp_"))
      {
        int indexPositionInTokenValue = token.getValue().indexOf('_')  + 1; 
        int indexOfTempTokenTreeList = Integer.parseInt(token.getValue().substring(indexPositionInTokenValue));
        TokenTree actualValueOfBlock = tempTokenTreeList.get(indexOfTempTokenTreeList);
        tokenTree.replaceWith(actualValueOfBlock);
        return;// then stop
      }		
    }
    if(tokenTree.getRightTokenTree() != null)
    {
      replaceTempTerminalWithActualValues(tokenTree.getRightTokenTree(),tempTokenTreeList);
    }
    if(tokenTree.getLeftTokenTree() != null)
    {
      replaceTempTerminalWithActualValues(tokenTree.getLeftTokenTree(),tempTokenTreeList);
    }
  }

  // line 399 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public void analyzeFeatureModel(){
    parseMixsetsNotUsed();
    
    if(model.getFeatureModel() != null)
    model.getFeatureModel().satisfyFeatureModel();
  }

  // line 14 "../../../../src/UmpleInternalPraser_CodeInjection.ump"
   private void analyzeInjectionToken(Token t, int analysisStep){
    if (t.is("toplevelBeforeCode"))
      {
        analyzeToplevelInjectionCode(t, analysisStep, "toplevelBeforeCode");
      } else if (t.is("toplevelAfterCode"))
      {
        analyzeToplevelInjectionCode(t, analysisStep, "toplevelAfterCode");
      }
  }


  /**
   * Issue#1521
   */
  // line 26 "../../../../src/UmpleInternalPraser_CodeInjection.ump"
   private void analyzeToplevelInjectionCode(Token injectToken, int analysisStep, String toplevelBeforeOrAfter){
    if (analysisStep == 1) // Do not process when analysis step == 1
    {
      shouldProcessAgain = shouldProcessAgain || (analysisStep == 1);
      return;
    }
    if (analysisStep == 2) // Do not process when analysis step == 2
    {
      shouldProcessAgain = true;
      return;
    }
    Token classNameToken;
    ArrayList<String> matchedClassNames = new ArrayList<String>();
    ArrayList<String> matchingClassNamePatterns = new ArrayList<String>();
    while (injectToken.getSubToken("className") != null)
    {
      classNameToken = injectToken.getSubToken("className");
      String matchingClassNamePattern = classNameToken.getValue();
      matchingClassNamePatterns.add(matchingClassNamePattern);
      injectToken.removeSubToken(classNameToken); 
    }

    String beforeOrAfter = toplevelBeforeOrAfter.substring(8);
    String beforeOrAfter2 = beforeOrAfter.substring(0, 1).toLowerCase() + beforeOrAfter.substring(1); //toLowerCase first letter
    injectToken.getSubToken(toplevelBeforeOrAfter).setName(beforeOrAfter2);

    ArrayList<String> operationNames = new ArrayList<String>();
    for (Token subToken : injectToken.getSubTokens())
    {
      if (subToken.is("injectionOperation"))
      {
        for (Token subSubToken : subToken.getSubTokens())
        {
          if (subSubToken.is("operationName"))
          {
            operationNames.add(subSubToken.getValue());
          }
        }
      }
    }
    
    // get all class names in this model
    ArrayList<String> allClassNames = new ArrayList<String>();
    for (UmpleClass umpleClass:model.getUmpleClasses())
    {
      allClassNames.add(umpleClass.getName());
    }

    // get all matched class names for code injection
    if (matchingClassNamePatterns.get(0).equals("*"))
    {
      for (UmpleClass umpleClass:model.getUmpleClasses())
      {
        matchedClassNames = allClassNames;
      }
    } else {
      for (String matchingClassNamePattern : matchingClassNamePatterns)
      {
        ArrayList<String> matched = findAllMatchClassNames(allClassNames, matchingClassNamePattern);
        for (String s : matched)
        {
          if (!matchedClassNames.contains(s))
          {
            matchedClassNames.add(s);
          }
        }
      }
    }

    for (String className : matchedClassNames) //loop over every matched class
    {
      if (model.getUmpleClass(className) != null)
      {
        if (injectToken.getSubToken("around") != null)
        {
          analyzeInjectionCode(injectToken, model.getUmpleClass(className));
          continue;
        }
        List<UmpleTrait> umpleTraits = model.getUmpleClass(className).getExtendsTraits();
        ArrayList<String> traitNames = new ArrayList<String>();
        Iterator hmIterator = unlinkedExtends.entrySet().iterator(); 
        
        while (hmIterator.hasNext()) { 
          Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
          if (((UmpleClass)mapElement.getKey()).equals(model.getUmpleClass(className)))
          {
            
traitNames = (ArrayList<String>) mapElement.getValue();
              ArrayList<String> newTraitNames = (ArrayList<String>) traitNames.clone();
              for (String traitName : traitNames)
              {
                if (model.getUmpleTrait(traitName) == null)
                {
                  newTraitNames.remove(traitName);
                }
              } 
              traitNames = newTraitNames;
Label_Trait_149: ;
        
          }
        } 

        ArrayList<String> methodNames = model.getUmpleClass(className).getMethodNames();
        
for (String umpleTraitName:traitNames)
          {
            for (Method m : model.getUmpleTrait(umpleTraitName).getMethods())
            {
              methodNames.add(m.getName());
            }
          }
Label_Trait_150: ;
  
        for (String operationName : operationNames)
        {
          boolean foundMethod = false;
          for (String methodName : methodNames) // target method names
          {
            if (methodName.matches(globToRegex(operationName))) // if the method matches
            {
              foundMethod = true;
              String globMatched = "";
              if (operationName.contains("*"))
              {
                globMatched = methodName;
              }
              Token singleOperationNameInjectToken = toSingleOperationNameInInjectToken(injectToken, operationName, globMatched);
              analyzeInjectionCode(singleOperationNameInjectToken, model.getUmpleClass(className));
            }
          }
          if (!foundMethod && !matchingClassNamePatterns.get(0).equals("*")) 
          {
            getParseResult().addErrorMessage(new ErrorMessage(1012, injectToken.getPosition(), operationName));
          }
        }    
      }
    }
  }


  /**
   * TODO I changed the parameter's type. please remove this comment;
   */
  // line 148 "../../../../src/UmpleInternalPraser_CodeInjection.ump"
   private void analyzeInjectionCode(Token injectToken, UmpleClassifier uClassifier){
    String type = injectToken.is("beforeCode") ? "before" : "after";
    Token codeLabelToken = injectToken.getSubToken("codeLabel");

    // around as aspect type
    if( (injectToken.getSubToken("around") != null) && (codeLabelToken != null) ) {
      type="around";
    }
    CodeBlock cb = new CodeBlock();
    String operationName = getOperationName(injectToken);
    String operationSource = getOperationSource(injectToken).toLowerCase();

    if(operationSource.equals("")) {
      operationSource = "all";
    }

    CodeInjection injection = new CodeInjection(type,operationName,"",uClassifier);
    injection.setOperationSource(operationSource);
    
// check if the aspect needs to be injected before/after a label.
      if(codeLabelToken != null)
      injection.setInjectionlabel(codeLabelToken.getValue());
Label_Mixset_151: ;

    List<String> operationsParameters = getOperationsParameters(injectToken);
    for(String operationParameters : operationsParameters) {
      injection.addParameter(operationParameters);      
    }

    makeCodeInject(injectToken,injection,cb,uClassifier);
    injection.setSnippet(cb);
    if (uClassifier instanceof UmpleClass) {
      ((UmpleClass)uClassifier).addCodeInjection(injection);

      if(!unanalyzedInjectionTokens.containsKey(uClassifier))
      {
        unanalyzedInjectionTokens.put(uClassifier, new ArrayList<Token>()); 
      }

      List<Token> currentTokens = unanalyzedInjectionTokens.get(uClassifier);
      currentTokens.add(injectToken);
    } else if (uClassifier instanceof UmpleTrait){
      ((UmpleTrait)uClassifier).addCodeInjection(injection);
    }
  }

  // line 15 "../../../../src/UmpleInternalParser_FIXML.ump"
   private void analyzeFIXML(Token t, int analysisStep){
    if (analysisStep != 2)
	    {
	      shouldProcessAgain = shouldProcessAgain || (analysisStep == 1);
	      return;
	    }
	    if (t.is("fixml"))
	    {
	      analyzeFIXML(t);
	    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 29 "../../../../src/UmpleInternalParser_FIXML.ump"
   private void analyzeFIXML(Token t){
    for (Token subToken : t.getSubTokens()) {
			if (subToken.getName().equals("fixmlDefinition")) {
				analyzeFIXMLDefinition(subToken);
			}
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 39 "../../../../src/UmpleInternalParser_FIXML.ump"
   private void analyzeFIXMLDefinition(Token t){
    for (Token subToken : t.getSubTokens()) {
			if (subToken.getName().equals("fixmlContent")) {
				analyzeFIXMLContetnt(subToken);
				//assignInitialValues(); // based-on-single-attributes
				Label_Association_117: ;
			}
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 51 "../../../../src/UmpleInternalParser_FIXML.ump"
   private void analyzeFIXMLContetnt(Token t){
    for (Token subToken : t.getSubTokens()) {
			if (subToken.getName().equals("endContent")) {
			//	analyzeFIXMLEndContetnt(subToken);
			} else if (subToken.getName().equals("extendContent")) {
				analyzeFIXMLextendedContentContetnt(subToken);
			}
		}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 63 "../../../../src/UmpleInternalParser_FIXML.ump"
   private UmpleClass analyzeFIXMLEndContetnt(UmpleClass inClass, Token t){
    UmpleClass uClass;
	  boolean available = getModel().getUmpleClass(t.getSubToken("name").getValue()) != null ? true : false;
	  if (available) {
		  uClass  = getModel().getUmpleClass(t.getSubToken("name").getValue());
	  } else {
		  uClass = new UmpleClass(t.getSubToken("name").getValue());
	  }
		for (Token subToken : t.getSubTokens()) {
			if (subToken.getName().equals("tagDefinition")) {
				analyzeFIXMLAttributes (subToken,uClass);
			}
		}
		if (! available)	getModel().addUmpleClass(uClass);
		//addAttributes(inClass, uClass,t);
		return uClass;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 83 "../../../../src/UmpleInternalParser_FIXML.ump"
   private UmpleClass analyzeFIXMLextendedContentContetnt(Token t){
    String sName = t.getSubToken(1).getValue();
	  String eName = t.getSubToken(t.numberOfSubTokens()-2).getValue();  
	  if (!(sName.equals(eName))) {
		  getParseResult().addErrorMessage(new ErrorMessage(4500,t.getPosition(),t.getSubToken(1).getValue()));
	      return null;
	  }
      UmpleClass uClass;
	  boolean available = getModel().getUmpleClass(t.getSubToken("name").getValue()) != null ? true : false;
	  if (available) {
		  uClass  = getModel().getUmpleClass(t.getSubToken("name").getValue());
	  } else {
		  uClass = new UmpleClass(t.getSubToken("name").getValue());
	  }
		for (Token subToken : t.getSubTokens()) {
			if (subToken.getName().equals("tagDefinition")) {
				analyzeFIXMLAttributes (subToken,uClass);
			} else if (subToken.getName().equals("attContent")){// based-on-single-associations
				analyzeFixmlTagAttributes(subToken,uClass); 
			} else if (subToken.getName().equals("endContent")){
				UmpleClass rUClass = analyzeFIXMLEndContetnt(uClass,subToken);
				//addAttributes(uClass, rUClass,subToken); //based-on-single-attributes
				Label_addAssociation_118: ;
				
			} else if (subToken.getName().equals("extendContent")) {
				UmpleClass rUClass = analyzeFIXMLextendedContentContetnt(subToken);
				Label_addAssociation_119: ;
				//addAttributes(uClass, rUClass,subToken); //based-on-single-attributes
			}
		}
		if (! available)	getModel().addUmpleClass(uClass);
	  return uClass;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 119 "../../../../src/UmpleInternalParser_FIXML.ump"
   private void addAttributes(UmpleClass uClass, UmpleClass rUClass, Token mainToken){
    String type = rUClass.getName();
	  Integer index = findValidName(uClass, type,0);
	  String postLable = "";
	  if (index>0) { 
		  postLable=index.toString();
	  }
	  String name = rUClass.getName()+"_Object"+postLable;	  
	  Attribute aAttribute = new Attribute(name, type, "fixml", "", false,uClass);
	  fixmlLastIntilialization.put(aAttribute, mainToken);
	  if(index>0){	
		  if (index==1) { 
			  fixmlAttributeCount.remove(uClass.getAttribute(rUClass.getName()+"_Object"));
			  fixmlAttributeCount.put(uClass.getAttribute(rUClass.getName()+"_Object"),1);
		  }
		  fixmlAttributeCount.put(aAttribute,1);
	  } else{
		  fixmlAttributeCount.put(aAttribute,0);  
	  }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 142 "../../../../src/UmpleInternalParser_FIXML.ump"
   private void assignInitialValues(){
    Map<String,String> db = new HashMap<String,String>();
	for (Attribute	aa : fixmlLastIntilialization.keySet()) {
		String value = "new "+aa.getType()+"("; //t.getSubToken(3).getValue();	
		if (fixmlAttributeCount.get(aa)==0) {
			  value = value + ")";	
			  aa.setValue(value);
		} else {
		Token rootToken = fixmlLastIntilialization.get(aa);
		for (Token subToken : rootToken.getSubTokens()) {
			if (subToken.is("tagDefinition")) {
				   String attname = subToken.getSubToken(0).getValue();
				   //String attType = "String";
				   String attValue = subToken.getSubToken(3).getValue();	
				   db.put(attname, attValue);  	
			}
		}  
	for (Attribute aAttribute : getModel().getUmpleClass(aa.getType()).getAttributes()) {
		if (db.containsKey(aAttribute.getName())){
			String attValue = db.get(aAttribute.getName());
			   if  ( isStringInteger(attValue) && aAttribute.getType().equals("Integer")) {
				  //attType="Integer";
			   } else if (isStringDuble(attValue) && aAttribute.getType().equals("Double")) {
				  //attType = "Double";
			   } else if (aAttribute.getType().equals("String")) {
				   attValue = "\""+attValue+"\"";
			   } else {
				   attValue = "\""+attValue+"\"";
			   }
			value = value + attValue+", ";
		} else {
		   if  ( aAttribute.getType().equals("Integer") ) {
			   value = value+"0"+", ";
		   } else if (aAttribute.getType().equals("Double")) {
			   value = value+"0.0"+", ";
		   } else if (aAttribute.getType().equals("String")){
			   value = value+"\"\""+", ";
		   } else {
			   if (rootToken.is("endContent")){
				   value = value+"null"+", ";   
			   } else if (!hasThisObject(rootToken,aAttribute.getType())){
				   value = value+"null"+", ";
			   } else {
				   value = value+getConstructorInConstructor(aAttribute)+", ";
			   }   
		   }
		}
		
	}		  
	  value = value.subSequence(0, value.length()-2) + ")";	
	  aa.setValue(value);
	}
	}
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 199 "../../../../src/UmpleInternalParser_FIXML.ump"
   private boolean hasThisObject(Token mainToken, String name){
    for (Token subToken : mainToken.getSubTokens()) {
		if (subToken.is("endContent")) {
			if (subToken.getSubToken(1).getValue().equals(name)) {
					return true;
				} else {
					return false;
				}
		} else if (subToken.is("extendContent")){
			return hasThisObject(subToken,name);
		}
	}
	return false;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 216 "../../../../src/UmpleInternalParser_FIXML.ump"
   private String getConstructorInConstructor(Attribute inAttribute){
    Map<String,String> db = new HashMap<String,String>();
		String value = "new "+inAttribute.getType()+"("; //t.getSubToken(3).getValue();	
		for (Token subToken : fixmlLastIntilialization.get(inAttribute).getSubTokens()) {
			if (subToken.getName().equals("tagDefinition")) {
				   String attname = subToken.getSubToken(0).getValue();
				   //String attType = "String";
				   String attValue = subToken.getSubToken(3).getValue();
				   db.put(attname, attValue);  	
				 }
			}  
	for (Attribute aAttribute : getModel().getUmpleClass(inAttribute.getType()).getAttributes()) {
		if (db.containsKey(aAttribute.getName())){
			String attValue = db.get(aAttribute.getName());
			   if  ( isStringInteger(attValue) && aAttribute.getType().equals("Integer")) {
				  // attType="Integer";
			   } else if (isStringDuble(attValue) && aAttribute.getType().equals("Double")) {
				   //attType = "Double";
			   } else if (aAttribute.getType().equals("String")) {
				   attValue = "\""+attValue+"\"";
			   } else {
				   attValue = "\""+attValue+"\"";
			   }
			value = value + attValue+", ";
		} else {
		   if  ( aAttribute.getType().equals("Integer") ) {
			   value = value+"0"+", ";
		   } else if (aAttribute.getType().equals("Double")) {
			   value = value+"0.0"+", ";
		   } else if (aAttribute.getType().equals("String")){
			   value = value+"\"\""+", ";
		   } else if (aAttribute.getType()!="") {
			   value = value+getConstructorInConstructor(aAttribute)+", ";
		   } else {
			   
		   }
		}
		
	}		  
	  value = value.subSequence(0, value.length()-2) + ")";	
	  return value;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 261 "../../../../src/UmpleInternalParser_FIXML.ump"
   private Integer findValidName(UmpleClass uClass, String type, Integer index){
    String name= type + "_Object";
	if ( index == 0 ) {
	} else {
		name = name + index.toString();
	}
	for (Attribute attribute : uClass.getAttributes()) {
		if (attribute.getType().equals(type)) {
			if (attribute.getName().equals(name)){
				return findValidName (uClass,type,index+1);
			}
		}
	}
	return index;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 279 "../../../../src/UmpleInternalParser_FIXML.ump"
   private void analyzeFIXMLAttributes(Token t, UmpleClass uClass){
    String name = t.getSubToken(0).getValue();
    boolean available = uClass.getAttribute(name) != null ? true : false;
    if (!available) {
        String type = "String";
        String value = t.getSubToken(3).getValue();
	    if  ( isStringInteger(value) ) {
	    	type="Integer";
	    } else if (isStringDuble(value)) {
	    	type = "Double";
	    } else {
	    	value = "\""+value+"\"";
	    }		
		uClass.addAttribute(name, type, "fixml", value, false);    	
    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 298 "../../../../src/UmpleInternalParser_FIXML.ump"
   private void analyzeFixmlTagAttributes(Token t, UmpleClass uClass){
    String name = t.getSubToken(1).getValue();
	    boolean available = uClass.getAttribute(name) != null ? true : false;
	    if (!available) {
	        String type = "String";
	        String value = t.getSubToken(3).getValue();
		    if  ( isStringInteger(value) ) {
		    	type="Integer";
		    } else if (isStringDuble(value)) {
		    	type = "Double";
		    } else {
		    	value = "\""+value+"\"";
		    }		
			uClass.addAttribute(name, type, "fixml", value, false);    	
	    }
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 321 "../../../../src/UmpleInternalParser_FIXML.ump"
   private boolean isStringInteger(String s){
    try { 
	    	Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    }
	    return true;
  }


  /**
   * ---------------------------------end----------------------------------------
   * ----------------------------------------------------------------------------
   * ---------------------------------Start--------------------------------------
   */
  // line 332 "../../../../src/UmpleInternalParser_FIXML.ump"
   private boolean isStringDuble(String s){
    try { 
	    	Double.parseDouble(s);
	    } catch(NumberFormatException e) { 
	        return false; 
	    }
	    return true;
  }

  // line 47 "../../../../src/UmpleInternalParser_Code.ump"
   public  UmpleInternalParser(){
    this("UmpleInternalParser", new UmpleModel(null), new RuleBasedParser());
  }

  // line 52 "../../../../src/UmpleInternalParser_Code.ump"
   public  UmpleInternalParser(UmpleModel aModel){
    this("UmpleInternalParser", aModel, new RuleBasedParser());
  }

  // line 57 "../../../../src/UmpleInternalParser_Code.ump"
   private void init(){
    if(model.getUmpleFile() != null)
    {
      setFilename(model.getUmpleFile().getFileName());
      setRootToken(reset()); // Makes sure the root token position has the filename
    }

    Couple quotes = new Couple("\"","\"");
    Couple braces = new Couple("{","}");

    addCouple(quotes);

    braces.addIgnore(quotes);
    braces.addIgnore(new Couple("//","\n"));

    addCouple(braces);
    
    // Set up needed parser actions
    parser.addParserAction("useStatement", new UseStatementParserAction() );
        
    parser.setLinkedFileHandler( new UmpleLinkedFileHandler() );
    parser.setAnalyzerGenerator( new UmpleAnalyzerGeneratorHandler() );
    
    parser.addGrammarFile("/umple_core.grammar");
    parser.addGrammarFile("/umple_patterns.grammar");
    
parser.addGrammarFile("/constraint/umple_constraints.grammar");  // TODO Under development
Label_Constraint_48: ;

    parser.addGrammarFile("/umple_exceptions.grammar");
    parser.addGrammarFile("/use.grammar");
    // line 46 "../../../../src/UmpleInternalParser_CodeClass.ump"
    parser.addGrammarFile("/class/umple_classes.grammar");
    // END OF UMPLE AFTER INJECTION
    // line 27 "../../../../src/UmpleInternalParser_CodeTrait.ump"
    parser.addGrammarFile("/trait/umple_traits.grammar");
    // END OF UMPLE AFTER INJECTION
    // line 1417 "../../../../src/UmpleInternalParser_CodeStructure.ump"
    parser.addGrammarFile("/strcture/umple_structure.grammar");
    // END OF UMPLE AFTER INJECTION
    // line 831 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
    parser.addGrammarFile("/template/umple_template.grammar");
    // END OF UMPLE AFTER INJECTION
    // line 72 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
    parser.addGrammarFile("/stateMachine/umple_state_machines.grammar");
    // END OF UMPLE AFTER INJECTION
    // line 29 "../../../../src/UmpleInternalParser_CodeTrace.ump"
    parser.addGrammarFile("/trace/umple_traces.grammar");
    // END OF UMPLE AFTER INJECTION
    // line 20 "../../../../src/UmpleInternalParser_CodeLayout.ump"
    parser.addGrammarFile("/layout/umple_layout.grammar");
    // END OF UMPLE AFTER INJECTION
    // line 23 "../../../../src/UmpleInternalParser_CodeFilter.ump"
    parser.addGrammarFile("/filter/umple_filter.grammar");
    // END OF UMPLE AFTER INJECTION
    // line 62 "../../../../src/UmpleInternalParser_CodeMixset.ump"
    parser.addGrammarFile("/mixset/umple_mixsets.grammar");
    // END OF UMPLE AFTER INJECTION
    // line 11 "../../../../src/UmpleInternalParser_FIXML.ump"
    parser.addGrammarFile("/fixml/umple_fixml.grammar");
    // END OF UMPLE AFTER INJECTION
  }

  // line 88 "../../../../src/UmpleInternalParser_Code.ump"
   public ParseResult parse(String ruleName, String input){
    setParseResult(parser.parse(ruleName,input));
    setRootToken(parser.getRootToken());
    SampleFileWriter.destroy("temp.ump");
    return getParseResult();
  }

  // line 95 "../../../../src/UmpleInternalParser_Code.ump"
   public ParseResult parse(String ruleName, String input, String fileName, Position position, int lineNumber, int offset){
    setParseResult(parser.parse(ruleName,input,fileName, position,lineNumber,offset));
    setRootToken(parser.getRootToken());
    return getParseResult();
  }

  // line 102 "../../../../src/UmpleInternalParser_Code.ump"
   public ParseResult analyze(boolean shouldGenerate){
    try {
      setParseResult(parser.getParseResult());
      setRootToken(parser.getRootToken());
      analyzeAllTokens(getRootToken());    
      postTokenAnalysis();
      
secondPostTokenAnalysis();
Label_StateMachine_49: ;
      
          checkDefaultedNameConflict();
         
Label_Attribute_50: ;
      
analyzeFeatureModel(); // lastly to analyze the feature model after all mixsets are added to umple model.
Label_FeatureModel_51: ;    
    }
    catch (Exception ex)
    {
      setFailedPosition(new Position("",0,0,0),9100,
        "Could not analyze Umple model. Please report an issue with this entire message and your input code to Umple developers.\nStack Trace Follows.\n"+
        cruise.umple.util.ExceptionDumper.dumpCompilerError(ex));
    }

    if (shouldGenerate && getParseResult().getWasSuccess())
    {
      String generatorError = model.generate();
      if(generatorError != null) {
        setFailedPosition(new Position("",0,0,0),9200,generatorError);
      }
    }
    return getParseResult();
  }


  /**
   * ------------------------
   * PRIVATE METHODS
   * ------------------------
   * When an error occurs, set the failed position and mark the compile as NOT successful
   */
  // line 135 "../../../../src/UmpleInternalParser_Code.ump"
   public void setFailedPosition(Position position, int errorCode, String... messages){
    //getParseResult().setWasSuccess(false);

    // Handle the special case of multiple unrecognized lines in a class; ensures that the
    // 1007 warning message is recorded and displayed no more than once
    if (errorCode == 1007) {
      List<ErrorMessage> errorMessages = getParseResult().getErrorMessages();
      for (ErrorMessage error : errorMessages) {
        if (error.getErrorType().getErrorCode() == 1007) {
          return; // we have already recorded this error, lets ignore and return
        }
      }
    }

    getParseResult().setPosition(position);
    getParseResult().addErrorMessage(new ErrorMessage(errorCode,position,messages));
  }


  /**
   * Analyze all child tokens of the "root" token.  This delegates to a individual
   * Each token is analyzed as long as "shouldProcessAgain" is set to true during the analysis
   * analyzeToken and quits early if a problem arises
   */
  // line 157 "../../../../src/UmpleInternalParser_Code.ump"
   private void analyzeAllTokens(Token rootToken){
    int analysisStep = 0;
    shouldProcessAgain = true;
    do
    {
      analysisStep += 1;
      shouldProcessAgain = false;
      for(Token t : rootToken.getSubTokens())
      {
        analyzeToken(t,analysisStep);
        if (!getParseResult().getWasSuccess())
        {
          return;
        }
      }
    }
    while (shouldProcessAgain);
    shouldProcessAgain = true;

    fixImportFromDefaultPackage();
    checkUnusedNamespaces();
  }


  /**
   * Delegate function to analyze a token within the context of a class
   * Each token is analyzed as long as "shouldProcessClassAgain" is set to true during the analysis
   * "1" is for the first round of analysis and "2" for the second.  The "2" is used for chicken-and-egg initialization problems, otherwise
   * put everything under the "1"
   */
  // line 185 "../../../../src/UmpleInternalParser_Code.ump"
   private void analyzeAllTokens(Token rootToken, UmpleClass aClass){
    int analysisStep = 0;
    shouldProcessClassAgain = true;
    do
    {
      analysisStep += 1;
      shouldProcessClassAgain = false;
      for(Token token : rootToken.getSubTokens())
      {
        analyzeToken(token,aClass,analysisStep);
        if (!getParseResult().getWasSuccess())
        {
          return;
        }
      }
    }
    while (shouldProcessClassAgain);
  }


  /**
   * Delegate function to analyze a token and send it to the write
   */
  // line 207 "../../../../src/UmpleInternalParser_Code.ump"
   private void analyzeToken(Token t, int analysisStep){
    // See #460 - types are now nested
    t.flattenNameRecursive("type");
    
analyzeMixsetUseStatement(t, analysisStep);
Label_Mixset_52: ;
    analyzeUSE(t, analysisStep);
    analyzeCoreToken(t,analysisStep);
    analyzeEnumerationToken(t, analysisStep);

    
analyzeClassToken(t,analysisStep);
Label_Class_53: ; 
    
analyzeTraitToken(t,analysisStep);
Label_Trait_54: ;
    Label_Template_55: ;
    
analyzeStateMachineToken(t,analysisStep);
Label_StateMachine_56: ;
    
analyzeComponentToken(t,analysisStep);
Label_Structure_57: ;
    
analyzeTraceToken(t,analysisStep);
Label_Trace_58: ;
    
analyzeFilterToken(t,analysisStep);
Label_Filter_59:;
    
analyzeLayoutToken(t,analysisStep);
Label_Layout_60: ;
    
analyzeFIXML(t, analysisStep);
Label_FIXML_61: ;
    
analyzeMixsetToken(t, analysisStep);
Label_Mixset_62: ;
    
analyzeRequireStatement(t, analysisStep);
Label_FeatureModel_63: ;
    
analyzeInjectionToken(t, analysisStep);
Label_AspectInjection_64: ;
  }


  /**
   * Analyze an individual token, delegates to the various components in Umple
   */
  // line 232 "../../../../src/UmpleInternalParser_Code.ump"
   private void analyzeToken(Token t, UmpleClass aClass, int analysisStep){
    // See #460 - types are now nested
    t.flattenNameRecursive("type");
    analyzeCoreToken(t,aClass,analysisStep);
    
analyzeClassToken(t,aClass,analysisStep);
Label_Class_65: ;
    
analyzeStateMachineToken(t,aClass,analysisStep);
Label_StateMachine_66: ;
    analyzeDependentTokens(t,aClass,analysisStep);
  }


  /**
   * The analysis methods in this function can depend on prior analysis (ex: constraints/keys on attributes defined later in the code)
   * Therefore it is necessary to force a second pass of the analysis for these cases
   */
  // line 245 "../../../../src/UmpleInternalParser_Code.ump"
   private void analyzeDependentTokens(Token t, UmpleClass aClass, int analysisStep){
    // Methods after this point will occur on analysisStep > 1
    if (analysisStep <=2 && t.is("invariant"))
    {
      shouldProcessAgain = true;
    }
    if(analysisStep <= 2 || shouldProcessClassAgain)
    {
      shouldProcessClassAgain = true;
      return;
    }
    
if (t.is("modelConstraintBody"))
      {
        analyzeModelConstraint(t,aClass);
      }
Label_Constraint_67:;
    
else if (t.is("beforeCode") || t.is("afterCode"))
      {
        analyzeInjectionCode(t,aClass);
      }
Label_AspectInjection_68: ;


    else if (t.is("key") || t.is("defaultKey"))
    {
      addKey(t, aClass, unlinkedKeysTokens);
    }

    
analyzeTraceToken(t,aClass);
Label_Trace_69:;
    
analyzeLayoutToken(t,aClass,analysisStep);
Label_Layout_70: ;
  }


  /**
   * Once you have analyze all tokens, you allowed a second 'pass' to apply any additional checks
   * Each step in the process might "fail", so we check the status before calling each delegate
   * token post token analysis method
   */
  // line 274 "../../../../src/UmpleInternalParser_Code.ump"
   private void postTokenAnalysis(){
    analyzeParseResult();
    if (getParseResult().getWasSuccess())
    {
      postTokenCoreAnalysis();
    }
    if (getParseResult().getWasSuccess())
    {
      postTokenInterfaceAnalysis();
    }
    
if (getParseResult().getWasSuccess())
      {
        postTokenClassAnalysis();
      }
Label_Class_71:;
    
if (getParseResult().getWasSuccess())
      {
        postTokenTraceAnalysis();
      }
Label_Trace_72: ;
    
if (getParseResult().getWasSuccess())
      {
        postTokenTraitAnalysis();
      }  
      if (getParseResult().getWasSuccess())
      {
        applyTraits();
        //Issue 686
        checkCodeInjections();
      }
Label_Trait_73:;
    
if (getParseResult().getWasSuccess())
      {
        postTokenLayoutAnalysis();
      }
Label_Layout_74: ;
    Label_Template_75:;
    
if (getParseResult().getWasSuccess()) {
        postTokenComponentAnalysis();
      }
Label_Structure_76: ;
    
if (getParseResult().getWasSuccess())
      {
        postTokenModelConstraintAnalysis();
      }
Label_Constraint_77: ;

    if (getParseResult().getWasSuccess())
    {
      postTokenEnumerationAnalysis();
    }
    
    if (getParseResult().getWasSuccess())
    {
      postTokenInterfaceTestAnalysis();
    }
    
    if (getParseResult().getWasSuccess())
    {
      postTokenAbstractTestAnalysis();
    }
    
    if (getParseResult().getWasSuccess())
    {
      postTokenTestSequeceAnalysis();
    }
    // We have to look at the error messages again to see if
    // any need to be removed
    analyzeParseResult();
  }


  /**
   * Locate all 'use *.ump' references and add those files if not already parsed
   */
  // line 318 "../../../../src/UmpleInternalParser_Code.ump"
   private void addNecessaryFiles(){
    
  }


  /**
   * Loop through all unparsed files, parse them, and add any missing references
   */
  // line 323 "../../../../src/UmpleInternalParser_Code.ump"
   private void parseAllFiles(){
    addNecessaryFiles();
    while (!unparsedUmpleFiles.isEmpty() && getParseResult().getWasSuccess())
    {
      String nextFile = unparsedUmpleFiles.get(0);
      unparsedUmpleFiles.remove(0);
      parsedUmpleFiles.add(nextFile);
      String input = SampleFileWriter.readContent(new File(nextFile));
      //TODO: parse() should probably be responsible for
      // reading file data, if we refactor it to be as such,
      // then we can get rid of this ugly bit of code
      setFilename(nextFile);
      parse("program", input);
      addNecessaryFiles();
    }
  }

  // line 341 "../../../../src/UmpleInternalParser_Code.ump"
   public void analyzeParseResult(){
    int numberOfErrors = 0;
    int numberOfWarnings = 0;
    for(int i = 0; i<getParseResult().numberOfErrorMessages(); i++)
    {
      ErrorMessage error = getParseResult().getErrorMessage(i);
      if(error.getErrorType().getSeverity() <= 2)
      {
        numberOfErrors++;
      }
      else
      {
        numberOfWarnings++;
      }
      if(allowedMessages.contains(error.getErrorType().getErrorCode()))
      {
        if(error.getErrorType().getSeverity() <= 2)
        {
          numberOfErrors--;
        }
        else
        {
          numberOfWarnings--;
        }
        getParseResult().removeErrorMessage(error);
        i--;
        continue;
      }
      if(ignoredMessages.contains(error.getErrorType().getErrorCode()))
      {
        if(error.getErrorType().getSeverity() <= 2)
        {
          numberOfErrors--;
        }
        else
        {
          numberOfWarnings--;
        }
        getParseResult().removeErrorMessage(error);
        i--;
        continue;
      }
      if(expectedMessages.contains(error.getErrorType().getErrorCode()))
      {
        if(error.getErrorType().getSeverity() <= 2)
        {
          numberOfErrors--;
        }
        else
        {
          numberOfWarnings--;
        }
      }
    }
    for(Integer id: expectedMessages)
    {
      boolean hasMessage = false;
      for(int i = 0; i<getParseResult().numberOfErrorMessages(); i++)
      {
        ErrorMessage error = getParseResult().getErrorMessage(i);
        if(error.getErrorType().getErrorCode() == id)
        {
          getParseResult().removeErrorMessage(error);
          hasMessage = true;
          break;
        }
      }
      if(!hasMessage)
      {
        // setFailedPosition
      }
    }
    if(numberOfErrors == 0)
    {
      getParseResult().setWasSuccess(true);
    }
    if(numberOfWarnings == 0)
    {
      getParseResult().setHasWarnings(false);
    }
  }


  /**
   * Analyze core tokens to the Umple language
   */
  // line 23 "../../../../src/UmpleInternalParser_CodeCore.ump"
   private void analyzeCoreToken(Token t, int analyzeCoreToken){
    if (analyzeCoreToken != 1)
    {
      return;
    }
  
    if (t.is("generate") || t.is("generate_path"))
    {
      analyzeGenerate(t);
    }
    else if (t.is("glossary"))
    {
      analyzeGlossary(t);
    }
    else if (t.is("debug"))
    {
      model.setDebugMode(true);
    }
    else if (t.is("toplevelExtracode"))
    {
      analyzeTopLevelCode(t);
    }
    else if (t.is("distribute"))
    {
   	 analyzeDistribute(t);
    }
  }


  /**
   * There are currently no core tokens of concern in the context of an UmpleClass
   * This method is available if needed
   */
  // line 55 "../../../../src/UmpleInternalParser_CodeCore.ump"
   private void analyzeCoreToken(Token t, UmpleClass aClass, int analysisStep){
    
  }


  /**
   * Perform post token analysis on core elements of the Umple language
   */
  // line 60 "../../../../src/UmpleInternalParser_CodeCore.ump"
   private void postTokenCoreAnalysis(){
    boolean overrode_all = false;
		
	  List<GenerateTarget> gen = new ArrayList<GenerateTarget>(Arrays.asList(model.getGenerates()));
	  HashMap<String, Boolean> overrideMap = new HashMap<String,Boolean>();
		
	  for(GenerateTarget target : model.getGenerates())
	  {
	  	if(target.getOverride() && !overrideMap.containsKey(target.getLanguage()))
	  	{
	  	   // Target is based on key {language} so this 
	  	   // should remove everything with the same key
	  	   while(gen.remove(target));
	  	   overrideMap.put(target.getLanguage(), true);
	  	   gen.add(target);
	  	}
	  	else
	  	{
	  		// Issue a warning that a generate statement has been issued 
	  		// with the override keyword twice
	  	}
	  		
	  	if(target.getOverrideAll() && overrideMap.containsKey(target.getLanguage()))
	  	{
	  		// issue warning
	  	}

	  	if(target.getOverrideAll() && overrode_all)
	  	{
	  		// issue warning
	  		continue;
	  	}
	  		
	  	if(target.getOverrideAll())
	  	{
	  		gen.clear();
	  		gen.add(target);
	  		overrideMap.put(target.getLanguage(), true);
	  		overrode_all = true;
	  	}
	}
	
	model.clearGenerates();
	model.addGenerate(gen);
	
    if (model.getDefaultGenerate() == null)
    {
      model.addGenerate("Java");
    }
  }


  /**
   * Add code to the top level of a file
   */
  // line 113 "../../../../src/UmpleInternalParser_CodeCore.ump"
   private void analyzeTopLevelCode(Token topLevelToken){
    List<String> codelangs = new ArrayList<String>();
	   CodeBlock languageSpecificCode = new CodeBlock();
	   for(Token tkn: topLevelToken.getSubTokens())
	   {
		   if(tkn.is("codeLang"))
		   {
			   codelangs.add(tkn.getValue());
		   } 
		   else if(tkn.is("top")) { // Name of the Top Level Construct
			   languageSpecificCode.setName(tkn.getValue());
		   }
		   else if(tkn.is("code")) {
			   if(codelangs.isEmpty())
			   {
				   languageSpecificCode.setCode(tkn.getValue());
			   } else {
				   for(String lang: codelangs)
				   {
					   languageSpecificCode.setCode(lang, tkn.getValue());
				   }
				   codelangs.clear();
			   }
		   }
	   }
	   model.addExtraCode(languageSpecificCode);
  }


  /**
   * setting the model distribute on or off.
   */
  // line 144 "../../../../src/UmpleInternalParser_CodeCore.ump"
   private void analyzeDistribute(Token distributeToken){
    for(Token distributeSubToken : distributeToken.getSubTokens())
    {
      if(distributeSubToken.is("distributeVal"))
      {
        if(distributeSubToken.getValue().equals("off"))
        {
          model.setDistributeOn(false);
          model.setDistributeForced(false);
        }
        else if(distributeSubToken.getValue().equals("forced"))
        {
          model.setDistributeForced(true);
          model.setDistributeOn(true);
        }
        {
        
        }
      }
      if(distributeSubToken.is("distributeTech"))
      {
        model.setDistributeTechnology(distributeSubToken.getValue());
      }
      if(distributeSubToken.is("distributePattern"))
      {
        model.setDistributePattern(Integer.parseInt(distributeSubToken.getValue()));
      }
    }
  }


  /**
   * Add singular / plural forms of words to the glossary to be used by the code generator
   */
  // line 176 "../../../../src/UmpleInternalParser_CodeCore.ump"
   private void analyzeGlossary(Token glossaryToken){
    for(Token wordToken : glossaryToken.getSubTokens())
    {
      if (!wordToken.is("word"))
      {
        continue;
      }
      Word word = new Word(wordToken.getValue("singular"),wordToken.getValue("plural"));
      model.getGlossary().addWord(word);
    }
  }

  // line 189 "../../../../src/UmpleInternalParser_CodeCore.ump"
   private void analyzeGenerate(Token genToken){
    if(genToken.is("generate_path"))
  	{
  	  String language = genToken.getValue("language");
  	  String path = genToken.getValue("output");
  	  GenerateTarget target = new GenerateTarget(language, path);
  	      
  	  if(genToken.getValue("override") != null && genToken.getValue("override").equals("--override"))
  	  	target.setOverride(true);
  	  
  	  if(genToken.getValue("override") != null && genToken.getValue("override").equals("--override-all"))
  	  	target.setOverrideAll(true);
  	  	
	  if(genToken.getValue("suboption") != null) {
	    for (Token t: genToken.getSubTokens()) {
	      if (t.getName().equals("suboption")) {
	        target.addSuboption(t.getValue());
	      }          
	    }     
	  }
	  model.addGenerate(target);
  	}
  	else
  	{
      GenerateTarget target = new GenerateTarget(genToken.getValue("language"), "");
      if(genToken.getValue("suboption") != null) {
        for (Token t: genToken.getSubTokens()) {
          if (t.getName().equals("suboption")) {
            target.addSuboption(t.getValue());
          }          
        }     
      }
      model.addGenerate(target);  	
    }
  }

  // line 22 "../../../../src/UmpleInternalParser_CodeUSE.ump"
   private void analyzeUSE(Token t, int analysisStep){
    if(t.is("useProgram")) {
      for(Token sub : t.getSubTokens()) {
        if(sub.is("useClassDefinition")) {
          analyzeUSEClass(sub, analysisStep);
        }
        if(sub.is("useAssociation")) {
          analyzeUSEAssociation(sub, analysisStep);
        }
      }
    }
  }

  // line 36 "../../../../src/UmpleInternalParser_CodeUSE.ump"
   private UmpleClass analyzeUSEClass(Token t, int analysisStep){
    UmpleClass generatedClass = model.addUmpleClass(t.getValue("id"));
    if(analysisStep != 1) {
      Token attributes = t.getSubToken("useAttributes");
      if(attributes != null) {
        analyzeUSEAttributes(attributes, generatedClass);
      }
    }
    return generatedClass;
  }

  // line 48 "../../../../src/UmpleInternalParser_CodeUSE.ump"
   private void analyzeUSEAttributes(Token allAttributesToken, UmpleClass myClass){
    for(Token attributeToken : allAttributesToken.getSubTokens()) {
      if(attributeToken.is("useAttributeDefinition")) {
        String name = attributeToken.getValue("id");
        
        for(Attribute aAttribute : myClass.getAttributes()){
          if (aAttribute.getName().equals(name)){
            setFailedPosition(attributeToken.getPosition(), 22, myClass.getName(), name);
          }
        }
        
        Token simpleType = attributeToken.getSubToken("useSimpleType");
        if(simpleType != null) {
          String type = simpleType.getValue("id");
          
          Attribute attribute = new Attribute(name, type, null, null, false, myClass);
          attribute.setPosition(attributeToken.getPosition());
          
        } else {
          System.err.println("Internal error: attribute has no recognized type");
        }
      }
    }
  }

  // line 74 "../../../../src/UmpleInternalParser_CodeUSE.ump"
   private Association analyzeUSEAssociation(Token associations, int analysisStep){
    if(analysisStep == 1) {
      return null;
    }
    if(!associations.is("useAssociation")) {
      System.out.println("failed at analyze use association");
      return null;
    }
    
    AssociationEnd firstEnd = analyzeUSEAssociationEnd(associations.getSubToken("useAssociationEnd", 0));
    AssociationEnd secondEnd = analyzeUSEAssociationEnd(associations.getSubToken("useAssociationEnd", 1));
    
    firstEnd.setRoleName(associations.getValue("name"));
    secondEnd.setRoleName(associations.getValue("name"));
    
    Association ret = new Association(true, true, false,false,firstEnd, secondEnd);
    model.addAssociation(ret);
    
    unlinkedAssociations.add(ret);
    
    return ret;
  }

  // line 98 "../../../../src/UmpleInternalParser_CodeUSE.ump"
   private AssociationEnd analyzeUSEAssociationEnd(Token associationEnd){
    if(!associationEnd.is("useAssociationEnd")) {
      System.out.println("failed at analyze association end");
      return null;
    }
    
    String name = associationEnd.getValue("name");
    Multiplicity multiplicity = analyzeUSEMultiplicity(associationEnd.getSubToken("useMultiplicityRange"));
    
    return new AssociationEnd(null, name, null, null, multiplicity);
  }

  // line 110 "../../../../src/UmpleInternalParser_CodeUSE.ump"
   private Multiplicity analyzeUSEMultiplicity(Token multiplicity){
    if(!multiplicity.is("useMultiplicityRange")) {
      System.out.println("failed at analyze use multiplicity");
      return null;
    }
    
    Multiplicity ret = new Multiplicity();
    
    if(multiplicity.numberOfSubTokens() == 1) {
      ret.setRange(null, null);
      ret.setBound(multiplicity.getSubToken("useMultiplicitySpec").getValue("integerSpec"));
    } else {
      Token firstSpec = multiplicity.getSubToken("useMultiplicitySpec", 0);
      Token secondSpec = multiplicity.getSubToken("useMultiplicitySpec", 1);
      ret.setRange(firstSpec.getValue("integerSpec"), secondSpec.getValue("integerSpec"));
    }
    
    return ret;
  }


  /**
   * Issue 1008 - Analyze enumerations defined at the top-level of an Umple Model
   */
  // line 16 "../../../../src/UmpleInternalParser_CodeEnumeration.ump"
   private void analyzeEnumerationToken(Token t, int analysisStep){
    if (analysisStep != 1)
     {
       return;
     }
   
     if (t.is("enumerationDefinition"))
     {
       analyzeEnumeration(t);
     }
  }


  /**
   * Issue 1008 - Add enumerations defined at the top-level of an Umple Model to model
   */
  // line 31 "../../../../src/UmpleInternalParser_CodeEnumeration.ump"
   private void analyzeEnumeration(Token enumToken){
    // Check if the enumeration has already been defined in the model. If it does, raise E095 Duplicate Enumerations
    if (model.hasEnum(enumToken.getSubToken("name").getValue())) {
      getParseResult().addErrorMessage(new ErrorMessage(95, enumToken.getPosition(), enumToken.getSubToken("name").getValue(), "" + enumToken.getPosition().getLineNumber()));
      return;
    }
    
    UmpleEnumeration umpleEnum = new UmpleEnumeration(enumToken.getSubToken("name").getValue());
    umpleEnum.setPosition(enumToken.getPosition());
     for (Token subToken : enumToken.getSubTokens()) {
       if (subToken.is("enumValue")) {
         umpleEnum.addEnumValue(subToken.getValue());
       }
     }     
     model.addEnum(umpleEnum);
  }


  /**
   * Issue 1008
   * Process "enumerationDefinition" tokens, convert them into UmpleEnumeration objects
   * and then add them to aClass
   */
  // line 54 "../../../../src/UmpleInternalParser_CodeEnumeration.ump"
   private void analyzeEnumeration(Token enumToken, UmpleClass aClass){
    // Check if the enumeration has already been defined in the class. If it does, raise E095 Duplicate Enumerations
    if (aClass.hasEnum(enumToken.getSubToken("name").getValue())) {
      getParseResult().addErrorMessage(new ErrorMessage(95, enumToken.getPosition(), enumToken.getSubToken("name").getValue(), "" + enumToken.getPosition().getLineNumber()));
      return;
    }
    
    UmpleEnumeration umpleEnum = new UmpleEnumeration(enumToken.getSubToken("name").getValue());
    umpleEnum.setPosition(enumToken.getPosition());
    for (Token subToken : enumToken.getSubTokens()) {
      if (subToken.is("enumValue")) {
        umpleEnum.addEnumValue(subToken.getValue());
      }
    }     
    aClass.addEnum(umpleEnum);
  }


  /**
   * Issue 1008 - Check for any warnings or errors caused by enumerations
   */
  // line 74 "../../../../src/UmpleInternalParser_CodeEnumeration.ump"
   private void postTokenEnumerationAnalysis(){
    if (model.hasEnums()) {
      postTokenModelEnumerationAnalysis();
    }
   
    for (UmpleClass uClass : model.getUmpleClasses()) {
      postTokenClassEnumerationAnalysis(uClass);
    }
  }


  /**
   * Issue 1008 - Check for any warnings or errors caused by model enumerations
   */
  // line 87 "../../../../src/UmpleInternalParser_CodeEnumeration.ump"
   private void postTokenModelEnumerationAnalysis(){
    for (UmpleEnumeration uEnum : model.getEnums()) {
      // Check that the enumeration doesn't conflict with any interfaces
      for (UmpleInterface uI : model.getUmpleInterfaces()) {
        if (uEnum.hasSameName(uI.getName())) {
          // Enumeration Naming Conflict
          getParseResult().addErrorMessage(new ErrorMessage(96,
                                                            uEnum.getPosition(), 
                                                            uEnum.getName(), 
                                                            "" + uEnum.getPosition().getLineNumber(),
                                                            "" + uI.getPosition(0).getLineNumber()));
          return;
        }
      }
      
// Check that the enumeration doesn't conflict with any traits
      for (UmpleTrait uT : model.getUmpleTraits()) {
        if (uEnum.hasSameName(uT.getName())) {
          // Enumeration Naming Conflict
          getParseResult().addErrorMessage(new ErrorMessage(96,
                                                            uEnum.getPosition(), 
                                                            uEnum.getName(), 
                                                            "" + uEnum.getPosition().getLineNumber(),
                                                            "" + uT.getPosition(0).getLineNumber()));
          return;
        }
      }
Label_Trait_141: ;

      
      for (UmpleClass uClass : model.getUmpleClasses()) {
        if (uEnum.hasSameName(uClass.getName())) {
         // Enumeration Naming Conflict
         getParseResult().addErrorMessage(new ErrorMessage(96,
                                                           uEnum.getPosition(), 
                                                           uEnum.getName(), 
                                                           "" + uEnum.getPosition().getLineNumber(),
                                                           "" + uClass.getPosition(0).getLineNumber()));
         return;
        }
        if (!uClass.hasEnum(uEnum.getName())) {
          analyzeModelEnumInClass(uClass, uEnum);
        }
      }
    }
  }


  /**
   * Issue 1008 - Check for any warnings or errors caused by class enumerations
   */
  // line 124 "../../../../src/UmpleInternalParser_CodeEnumeration.ump"
   private void postTokenClassEnumerationAnalysis(UmpleClass uClass){
    for (UmpleEnumeration uEnum : uClass.getEnums()) {
      if (uEnum.hasSameName(uClass.getName())) {
        // Naming Conflict Between Enumeration and Class Error
         getParseResult().addErrorMessage(new ErrorMessage(96,
                                                           uEnum.getPosition(), 
                                                           uEnum.getName(), 
                                                           "" + uEnum.getPosition().getLineNumber(),
                                                           uClass.getName()));
         return;
      }
      
      UmpleClass otherClass = model.getUmpleClass(uEnum.getName());
      
      // Check if the class uses the enumeration in any of its methods' parameters
      for (Method m : uClass.getMethods()) {
        for (MethodParameter p : m.getMethodParameters()) {
          if (!m.getSourceFullName().equals(AUTO_GENERATED_METHOD) && uEnum.hasSameName(p.getType()) && otherClass != null) {
            // Method Parameter Ambiguity Warning
            getParseResult().addErrorMessage(new ErrorMessage(102, 
                                                              uEnum.getPosition(), 
                                                              uEnum.getName(), 
                                                              "" + uEnum.getPosition().getLineNumber(),
                                                              p.getName(),
                                                              m.getName(),
                                                              "" + m.getPosition().getLineNumber(),
                                                              otherClass.getName()));
            
          }
        }
      }
      
      
// Check if the enumeration conflicts with any state machines, and if the enumeration is used as
      // event parameters
      for (StateMachine sm : uClass.getStateMachines()) {
        if (uEnum.hasSameName(sm.getName())) {
          // Enumeration Conflicts with State Machine Error
          getParseResult().addErrorMessage(new ErrorMessage(97,
                                                            uEnum.getPosition(),
                                                            uEnum.getName(),
                                                            "" + uEnum.getPosition().getLineNumber(),
                                                            sm.getName(),
                                                            uClass.getName()));
          return;
        }
        for (Event e : sm.getAllEvents()) {
          for (MethodParameter p : e.getParams()) {
            if (uEnum.hasSameName(p.getType()) && otherClass != null) {
              // Event Parameter Ambiguity Warning
              getParseResult().addErrorMessage(new ErrorMessage(103,
                                                                uEnum.getPosition(),
                                                                uEnum.getName(),
                                                                "" + uEnum.getPosition().getLineNumber(),
                                                                p.getName(),
                                                                e.getName(),
                                                                sm.getName(),
                                                                otherClass.getName()));
            }
          }
        }
      }
Label_StateMachine_142: ;

     // Check if the enumeration is used in any of the class's associations
     String className = uClass.getName();
     for (Association a : uClass.getAssociations()) {
      validateEnumerationInAssociation(uEnum, a, className);
     }
    }
  }


  /**
   * Issue 1008 - A helper function used to detect if a model enumeration raises any warnings or errors
   * in a class
   */
  // line 170 "../../../../src/UmpleInternalParser_CodeEnumeration.ump"
   private void analyzeModelEnumInClass(UmpleClass uClass, UmpleEnumeration uEnum){
    String className = uClass.getName();
    boolean classUsesEnum = false;
    
    // Check if the class uses the enumeration in any of its attributes
    for (Attribute a : uClass.getAttributes()) {
      if (uEnum.hasSameName(a.getType())) {
         classUsesEnum = true;
      }
    }
     
    // Check if the class uses the enumeration in any of its methods' parameters
    for (Method m : uClass.getMethods()) {
      for (MethodParameter p : m.getMethodParameters()) {
        if (!m.getSourceFullName().equals(AUTO_GENERATED_METHOD) && uEnum.hasSameName(p.getType())) {
           classUsesEnum = true;
        }
      }
    }
    
// Check if the class's state machines conflict with the enumeration, and if any of its state
      // machine's events use the enumeration in their parameters
      for (StateMachine sm : uClass.getStateMachines()) {
        if (classUsesEnum) {
          if (uEnum.hasSameName(sm.getName())) {
            // Enumeration Conflicts with State Machine Error
            getParseResult().addErrorMessage(new ErrorMessage(97,
                                                              uEnum.getPosition(),
                                                              uEnum.getName(),
                                                              "" + uEnum.getPosition().getLineNumber(),
                                                              sm.getName(),
                                                              uClass.getName()));
            return;
          }
        }
        for (Event e : sm.getAllEvents()) {
          for (MethodParameter p : e.getParams()) {
            if (uEnum.hasSameName(p.getType())) {
              if (!classUsesEnum && uEnum.hasSameName(sm.getName())) {
                // Enumeration Conflicts with State Machine Error
                getParseResult().addErrorMessage(new ErrorMessage(97,
                                                                 uEnum.getPosition(),
                                                                 uEnum.getName(),
                                                                 "" + uEnum.getPosition().getLineNumber(),
                                                                 sm.getName(),
                                                                 uClass.getName()));
                return;
              }
              else {
                classUsesEnum = true;
              }
            }
          }
        }
      }
Label_StateMachine_143: ;
    
     if (classUsesEnum) {
       for (Association a : uClass.getAssociations()) {
         validateEnumerationInAssociation(uEnum, a, className);
       }
     }
  }


  /**
   * Issue 1008 - A helper function that determines if an enumeration is valid in an association
   */
  // line 201 "../../../../src/UmpleInternalParser_CodeEnumeration.ump"
   private void validateEnumerationInAssociation(UmpleEnumeration uEnum, Association a, String className){
    for (AssociationEnd ae : a.getEnds()) {
      if (uEnum.hasSameName(ae.getClassName())) {
        if (a.getIsLeftComposition() || a.getIsRightComposition()) {
          // Enumeration Used in Composition Error
          getParseResult().addErrorMessage(new ErrorMessage(105, 
                                                            uEnum.getPosition(), 
                                                            uEnum.getName(), 
                                                            "" + uEnum.getPosition().getLineNumber(),
                                                            "" + a.getTokenPosition().getLineNumber(),
                                                            className));
        } else if (a.getIsLeftNavigable() && a.getIsRightNavigable()) {
          // Enumeration Used in Bi-Directional Association Error
          getParseResult().addErrorMessage(new ErrorMessage(104, 
                                                            uEnum.getPosition(), 
                                                            uEnum.getName(), 
                                                            "" + uEnum.getPosition().getLineNumber(),
                                                            "" + a.getTokenPosition().getLineNumber(),
                                                            className));
        } else {
          // Enumeration Used in Uni-Directional Association Warning
          getParseResult().addErrorMessage(new ErrorMessage(106, 
                                                            uEnum.getPosition(), 
                                                            uEnum.getName(), 
                                                            "" + uEnum.getPosition().getLineNumber(),
                                                            "" + a.getTokenPosition().getLineNumber(),
                                                            ae.getClassName()));
        }
      }
    }
  }


  /**
   * ///////////////////////
   * This method analyze testcase token found in traits
   * ///////////////////////
   */
  // line 16 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeTraitTestCaseToken(Token token, UmpleTrait aTrait){
    UmpleTestCase tc = new UmpleTestCase(token.getValue("testCaseName"),0);
	analyzeTestCase(token, aTrait, tc);	
	  aTrait.addUmpleTestCase(tc);
	  //System.out.println(aTrait.getUmpleTestCase(0).getUmpleAssertions().toString());
	  copyTestCasefromExtendedTrait(token, aTrait);
  }


  /**
   * ///////////////
   * post check for test sequence and test cases
   * 
   */
  // line 28 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void postTokenTestSequeceAnalysis(){
    // TODO check for test cases not found in test sequence and raise a warning 
	  
	  for(UmpleClass uClass : model.getUmpleClasses())
	  {
		  if (uClass.hasTestSequences())
		  {
			  for (TestSequence ts : uClass.getTestSequences())
			  {
			  if(uClass.hasUmpleTestCases())
			  {
				  
				  for (UmpleTestCase tc : uClass.getUmpleTestCases())
				  {
					  for (String tsTestCase : ts.getTests())
					  {
					if(!tsTestCase.equals(tc.getName()))
					{
						getParseResult().addErrorMessage(new ErrorMessage(6007,uClass.getPosition(0),uClass.getName(),ts.getName(),tc.getName()));
					}
						  
				  }
				  }
			  }
			  else {
				  // test sequence found but class has no test cases
				  getParseResult().addErrorMessage(new ErrorMessage(6006,uClass.getPosition(0),uClass.getName(),ts.getName()));
				  
			  }
			  
			  }
		  }
	  }
  }


  /**
   * ///////////////////////
   * This method copies testcases found in trait into the class
   * ///////////////////////
   */
  // line 68 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void copyTestCasesFromTraitsToClass(UmpleClass inClass){
    Map<UmpleTrait, List<UmpleTestCase>> traitTestCases = new HashMap<UmpleTrait, List<UmpleTestCase>>();
		Map<UmpleTrait, List<UmpleTestCase>> tempTraitTestCases = new HashMap<UmpleTrait, List<UmpleTestCase>>();
		Map <UmpleTestCase, List<UmpleAssertion>> tcTempAssertions = new HashMap<UmpleTestCase, List<UmpleAssertion>>(); 
		boolean tcExist = false;
		int index = 0;
		/*for (UmpleTrait uTrait : inClass.getExtendsTraits()) {
			tempTraitTestCases = gatherTestCases(uTrait,inClass.getGeneralTPAppliedByName(uTrait.getName()));
			if ( ! getParseResult().getWasSuccess() ) return;
			if (checkTcComeFromTraitsIsAvaiableInClass(tempTraitTestCases,inClass) ) return;
			if (CheckTcComeFromTraitsIsAvaialbleInOtherTraits(traitTestCases,tempTraitTestCases)) return;
			AddTcMapToAnother(traitTestCases,tempTraitTestCases);
		}*/
		for (UmpleTrait t1 : inClass.getExtendsTraits()) {
			for (UmpleTestCase tc : t1.getUmpleTestCases()) {
				if(inClass.hasUmpleTestCases())
				{
					for (UmpleTestCase tempTc : inClass.getUmpleTestCases())
					{
						if(tc.getName().equals(tempTc.getName()))
						{
							//TODO: append trait tests
							tcExist=true;
							index = inClass.indexOfUmpleTestCase(tempTc);
						}
						else {
							tcExist = false;
						}
					}
				}
				
				if( tcExist != true)
				{
					inClass.addUmpleTestCase(tc);
					
				}
				else 
				{
					mergeTests(inClass.getUmpleTestCase(index),tc);										
					//tcTempAssertions.put(tc, tc.getUmpleAssertions());
					//inClass.addUmpleTestCase(tc);
					/*System.out.println(tc.getUmpleAssertions().toString());
					//System.out.println("second:::");
					//System.out.println(inClass.getUmpleTestCase(index).getUmpleAssertions().toString());
					//mergeTests(inClass.getUmpleTestCase(index), tc);
					
					for ( UmpleAssertion uAssert : tc.getUmpleAssertions())
					{
						//UmpleAssertion uAssertTemp= new UmpleAssertion(null, uAssert.getType(), uAssert.getLevel(), null, uAssert.getAssertCode());												
						//inClass.getUmpleTestCase(index).addUmpleAssertion(uAssertTemp);
						mergeTests(inClass.getUmpleTestCase(index),tc);						
					}*/
					
					
					
				}
				  
			}
			
			//System.out.println(inClass.getUmpleTestCase(index).toString());
		}
  }


  /**
   * the following method not currently used but may be needed later.
   * private Map<UmpleTrait, List<UmpleTestCase>> gatherTestCases(UmpleTrait inTrait,
   * GeneralTPApplied inGTPApplied) {
   * Map<UmpleTrait, List<UmpleTestCase>> traitTestCases = new HashMap<UmpleTrait, List<UmpleTestCase>>(); 
   * Map<UmpleTrait, List<UmpleTestCase>> tempTestCases = new HashMap<UmpleTrait, List<UmpleTestCase>>();
   * //----------------------------------------------------------------------------------------
   * List<UmpleTestCase> attributes = new ArrayList<UmpleTestCase>();	  
   * for (UmpleTestCase tc : inTrait.getUmpleTestCases()) {
   * UmpleTestCase newTc = new UmpleTestCase(tc.getName(),0);
   * ApplyTypeParametersToAttribute(newTc,inGTPApplied,inTrait);
   * attributes.add(newTc);
   * }
   * traitTestCases.put(inTrait,attributes);
   * //----------------------------------------------------------------------------------------
   * for (UmpleTrait uTrait : inTrait.getExtendsTraits()) {
   * GeneralTPApplied newGTParameter = inTrait.getGeneralTPAppliedByName(uTrait.getName())!=null ? new GeneralTPApplied(inTrait.getGeneralTPAppliedByName(uTrait.getName())) : null;
   * if (newGTParameter!=null){
   * ApplyTypeParametersToTypeParameters(newGTParameter, inGTPApplied,inTrait);       
   * checkClassSupportTraitsInterfaces(newGTParameter,inTrait);
   * }
   * if ( ! getParseResult().getWasSuccess() ) return traitTestCases;
   * tempTestCases = gatherTestCases(uTrait,getNewGeneralTPAppliedWithP2P(inTrait,uTrait,inGTPApplied));   	 
   * if ( ! getParseResult().getWasSuccess() ) return traitTestCases;
   * if (CheckAttComeFromTraitsIsAvaialbleInOtherTraits(traitTestCases, tempTestCases)) return traitTestCases;
   * AddAttMapToAnother(traitTestCases,tempTestCases);
   * 
   * return traitTestCases;
   * }
   * ///////////////////////
   * This method merges the content of two test cases
   * TODO: fix LocOrder and actions, init
   * ///////////////////////
   */
  // line 166 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private boolean mergeTests(UmpleTestCase tc1, UmpleTestCase tc2){
    //TODO: FIX LocCode for test merge 
	   //for (int)
	   if(tc2.hasUmpleAssertions()) {
	   for (UmpleAssertion uAssert : tc2.getUmpleAssertions())
			{
    	int index=tc2.getLocOrder();
		//
				//TODO:add LocOrder for actions and inits
		
				UmpleAssertion uAssertTemp= new UmpleAssertion(null, uAssert.getType(), uAssert.getLevel(), null, uAssert.getAssertCode(),index);
				tc1.setLocOrder(tc1.getLocOrder()+1);
				tc1.addUmpleAssertion(uAssertTemp);
						
			}
       }
    
    //if (tc2)
	
	return true;
  }

  // line 189 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void copyTestCasefromExtendedTrait(Token token, UmpleTrait aTrait){
    //System.out.println(aTrait.hasExtendsTraits());
		  if(aTrait.hasExtendsTraits())
		  {
			  //System.out.println("found Extended trait");
			  for(UmpleTrait exTrait: aTrait.getExtendsTraits())
			  {
				  if (exTrait.hasUmpleTestCases())
				  {
					  for(UmpleTestCase uTc : exTrait.getUmpleTestCases())
					  {
						  analyzeTestCase(token, exTrait, uTc);
						  UmpleTestCase tempTc = new UmpleTestCase(uTc.getName(), uTc.getLocOrder());
						  aTrait.addUmpleTestCase(tempTc);
					  }
				  }
			  }
		  }
  }

  // line 209 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeTestCase(Token token, UmpleElement uElement, UmpleTestCase uTestCase){
    for (Token subToken : token.getSubTokens())
	    {
	     
	      if(subToken.getName().equals("isConcrete"))
	      {	    	
	         if( subToken.getValue("isConcrete")!= null)
	         {
	        	 uTestCase.setIsConcrete(true);
	        	 uTestCase.setConcreteLang(subToken.getValue("isConcrete"));
	         }
	         
	      }
	      
	      if(subToken.getName().equals("testAction"))
	      {	    	
	        analyzeTestAction(subToken,uElement,uTestCase);	      	    	
	      }
	      if(subToken.getName().equals("assertion"))
	      {	    	
	        analyzeAssertion(subToken,uElement,uTestCase);	      	    	
	      }
	      
	      if(subToken.getName().equals("testInit"))
	      {	    	  
	        analyzeTestInit(subToken,uElement,uTestCase);	      	    	
	      }
	      
	      if(subToken.getName().equals("testInitAtt"))
	      {	    	  
	        analyzeTestInitAtt(subToken,uElement,uTestCase);	      	    	
	      }
	      
	      if(subToken.getName().equals("testInitAttWithMethodCall"))
	      {	    	  
	        analyzeTestInitAttWithMethodCall(subToken,uElement,uTestCase);	      	    	
	      }
	      
	      
	      if(subToken.getName().equals("inlineComment"))
	      {	    	  
	        analyzeTestComment(subToken,uElement,uTestCase);	      	    	
	      }
	      
	      if(subToken.getName().equals("multilineComment"))
	      {	    	  
	        analyzeTestMultiComment(subToken,uElement,uTestCase);	      	    	
	      }
	      
	      if(subToken.getName().equals("ifStatement"))
	      {	    	  
	        analyzeTestIfStatement(subToken,uElement,uTestCase);	      	    	
	      }
	      
	      if(subToken.getName().equals("forStatement"))
	      {	    	  
	    	  analyzeTestForStatement(subToken,uElement,uTestCase);	      	    	
	      }
	      
	    }
  }

  // line 272 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeTestMultiComment(Token token, UmpleElement uElement, UmpleTestCase uTestCase){
    // TODO Auto-generated method stub
	  TestAction ta = new TestAction("multicomment"+uTestCase.getLocOrder(),"/*"+token.getValue("multilineComment")+"*/","comment", uTestCase.getLocOrder());
	  uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
		uTestCase.addTestAction(ta);
  }

  // line 280 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeTestComment(Token token, UmpleElement uElement, UmpleTestCase uTestCase){
    // TODO fix test comments with line of code order
	  
	  TestAction ta = new TestAction("comment"+uTestCase.getLocOrder(),"//"+token.getValue("inlineComment"),"comment", uTestCase.getLocOrder());
	  uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
		uTestCase.addTestAction(ta);
  }

  // line 294 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private String analyzeTestMethodCall(Token token, UmpleTestCase uTestCase, String tCode){
    String code = "";
	  
	  
	  
	  
	  for (Token subToken: token.getSubTokens())
	  {
		  if ( subToken.getName().equals("objectName"))
		  {
			  code += subToken.getValue("objectName");
		  }
		  
		  if ( subToken.getName().equals("methodName"))
		  {
			  code += subToken.getValue("methodName");
		  }
		  
		  
		  
		  
		  if (subToken.getName().equals("testActionParameterList"))
		  {
			  //System.out.println("before test Action: "+code);
			  String paramCode = "";
			  for(Token parToken : subToken.getSubTokens())
			  {
				  
				  if(parToken.getName().equals("testParameter"))
				  {
				  paramCode = analyzeTestParameter(parToken,uTestCase,"");					  
				  }
				  
				  
			  }
			  
			  code += paramCode;
			  paramCode="";
			  
		  }
		  
		  if ( subToken.getName().equals(","))
		  {
			  code += ", ";
		  }
		  if ( subToken.getName().equals("\""))
		  {
			  code += "\"";
		  }
		  
		  if ( subToken.getName().equals("("))
		  {
			  code+="(";
		  }
		  
		  if ( subToken.getName().equals(")"))
		  {
			  code+=")";
		  }
		  
		  if ( subToken.getName().equals("."))
		  {
			  code+=".";
		  }
	  }
	  
	return code;
  }

  // line 367 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeClassTestCase(Token token, UmpleClass aClass){
    boolean testcaseExist= false;
	        	  int index=0;
	        	  
	        	  if(token.getValue("testCaseName").equals("init"))
	        	  {
	        		  // only ignore the test named : init (used for initialization for WHEN statement
	        		  
	        		  for (Token initToken : token.getSubTokens())
	        		  {
	        			  if(initToken.getName().equals("testInit"))
	        			  {	        			
	        				  //System.out.println(initToken.toString());	  
	        				  
	        		  analyzeTestClassInit(initToken, aClass);
	        			  }
	        		  }
	        		  
	        	  }
	        	  
	        	  else {
	        	  
	        	  for(UmpleTestCase tc: aClass.getUmpleTestCases())
	    		  {
	    			  if (tc.getName().equals(token.getValue("testCaseName")))
	    			  {
	    				  testcaseExist= true;
	    				  index = aClass.indexOfUmpleTestCase(tc);
	    			  }
	    		  }

	    		  if(!testcaseExist)
	    		  {
	    			  UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName"),0);
	    			  if (token.getValue("isTimed")!= null) {
	    				  uTestCase.setIsTimed(true);
	    			  }
	    			  analyzeTestCase(token, aClass, uTestCase);
	    			  aClass.addUmpleTestCase(uTestCase);
	    		  }
	    		  else {
	    			  analyzeTestCase(token, aClass, aClass.getUmpleTestCase(index));
	    		  }
	        	  }
  }

  // line 415 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeAssertion(Token token, UmpleElement uElement, MethodBody meth, UmpleTestCase uTestCase, String level){
    boolean isTimed = token.getValue("isTimed")!= null;
	   String type = "";
	   if (isTimed)
	   {
		   type = token.getValue("isTimed")+StringFormatter.toPascalCase(token.getValue("assertType"));
		   //System.out.println(type);
	   }
	   else 
	   {
		   type = token.getValue("assertType");
	   }
	   
	   
	   
	   if(token.getName().equals("assertion"))
	      {
	    	
	        if (token.getValue("assertType").equals("assertTrue"))
	        {  
	         UmpleAssertion assertion = new UmpleAssertion("",type,level,"",token.getValue("code"),uTestCase.getLocOrder());
	        		 uTestCase.addUmpleAssertion(assertion);
	        		 meth.addUmpleAssertion(assertion);
	        		 uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
	        }

	        if (token.getValue("assertType").equals("assertFalse"))
	        {
	        	UmpleAssertion assertion = new UmpleAssertion("",type,level,"",token.getValue("code"),uTestCase.getLocOrder());
	        			uTestCase.addUmpleAssertion(assertion);
	        			meth.addUmpleAssertion(assertion);
	        			uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
	        }

	        if (token.getValue("assertType").equals("assertEqual"))
	        {
	        	UmpleAssertion assertion = new UmpleAssertion("",type,level,"",token.getValue("code"),uTestCase.getLocOrder());
	            uTestCase.addUmpleAssertion(assertion);
	            meth.addUmpleAssertion(assertion);
	            uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
	        }
	    	
	       }
  }

  // line 460 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeMethodAssertion(Token token, UmpleElement uElement, MethodBody meth, Method aMethod, UmpleTestCase uTestCase){
    //UmpleAssertion assertion = new UmpleAssertion("","","","","",uTestCase); 

	 //analyzeAssertion(token,(UmpleClass) uElement, uTestCase,"method"); 
	 
	 analyzeAssertion(token,(UmpleClass) uElement,meth, uTestCase,"method");
  }

  // line 472 "../../../../src/UmpleInternalParser_CodeTest.ump"
  public UmpleTestCase getMethodTestCase(UmpleClass aClass, String meth){
    for (UmpleTestCase tc : aClass.getUmpleTestCases() )
	   {
		   if(tc.getName().equals(meth))
		   {
			   return tc;
		   }
	   }	   	   
	   return null;
  }

  // line 484 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeMethodTestCase(Token token, UmpleElement uElement, MethodBody meth, Method aMethod, UmpleTestCase uTestCase){
    String testCaseName = token.getValue("testCaseName");
    
    /*int index = -1;
    
    
    for(UmpleTestCase tc : uElement.getUmpleTestCases()) {
    	if (tc.getName().equals(testCaseName))
    	{
    		index = uElement.indexOfUmpleTestCase(tc);
    	}
    }*/
    
    
	   
    //UmpleAssertion assertion = new UmpleAssertion("","","","","",uTestCase);
    //UmpleTestCase uTestCase = new UmpleTestCase(testCaseName,(UmpleClass)uElement);
    for (Token subToken : token.getSubTokens())
    {
     
      if(subToken.getName().equals("assertion"))
      {
    	  
    	  analyzeAssertion(subToken,uElement, meth,uTestCase, "method");
    	
        /*if (subToken.getValue("assertType").equals("assertTrue"))
        {         
          uTestCase.addUmpleAssertion(new UmpleAssertion("","true","method","",subToken.getValue("code"),uTestCase.getLocOrder()));
          uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
        }

        if (subToken.getValue("assertType").equals("assertFalse"))
        {
        	uTestCase.addUmpleAssertion(new UmpleAssertion("","false","method","",subToken.getValue("code"),uTestCase.getLocOrder()));
        	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
        }

        if (subToken.getValue("assertType").equals("assertEqual"))
        {
          uTestCase.addUmpleAssertion(new UmpleAssertion("","true","equal","",subToken.getValue("code"),uTestCase.getLocOrder()));
          uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
        }*/
    	
       }
      
    	
    }
    
    meth.addUmpleTestCase(uTestCase);
  }

  // line 536 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeTestAction(Token token, UmpleElement aClass, UmpleTestCase uTestCase){
    // TODO Auto-generated method stub	  
	  String code ="";
	  
	  for(Token subToken: token.getSubTokens())
	  {
		  if(subToken.getName().equals("objectName"))
		  {
			  code += token.getValue("objectName") + "";
		  }
		  
		  if(subToken.getName().equals("."))
		  {
			  code += ".";
		  }
		  
		  if(subToken.getName().equals("methodName"))
		  {
			  code += token.getValue("methodName") + "";
		  }
		  
		  if(subToken.getName().equals("("))
		  {
			  code += "(";
		  }
		  
		  if(subToken.getName().equals(")"))
		  {
			  code += ")" + "";
		  }
		  
		  if(subToken.getName().equals(";"))
		  {
			  code += ";" + "";
		  }
		  
		  if(subToken.getName().equals("testActionParameterList"))
		  {
			  String parCode = "";
			  //System.out.println(subToken.getSubTokens());
			  //TODO
			  
			  for (Token parToken : subToken.getSubTokens())
			  {
				  //System.out.println(parToken.getSubTokens());
				  if(parToken.getName().equals("("))
				  {
					  parCode += "(";
				  }
				  
				  if(parToken.getName().equals(")"))
				  {
					  parCode += ")";
				  }
				  
				  if(parToken.getName().equals(","))
				  {
					  parCode += ",";
				  }
				  
				  if(parToken.getName().equals("testParameter"))
				  {
					  parCode += analyzeTestParameter(parToken, uTestCase, parCode);					  					  					  
				  }
				  				  
				  //parCode += "" + parToken.getSubTokens().toString(); 
			  }
			  code += "" + parCode +"";
		  }
		  
		  
		  
	  }
	  
	//code += token.getValue("objectName");
	//code += token.getValue("objectName");
	TestAction ta = new TestAction("",code,"", uTestCase.getLocOrder());
	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
	uTestCase.addTestAction(ta);
  }

  // line 618 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeTestInit(Token token, UmpleElement aClass, UmpleTestCase uTestCase){
    // TODO fix test initialization
	  //TestInit ti = new TestInit("", "");
	  TestAction ta = new TestAction("","","init",uTestCase.getLocOrder());
	  String code = "";
	  for (Token subToken: token.getSubTokens())
	  {
		  if ( subToken.getName().equals("identifier"))
		  {
			 code+=subToken.getValue();
		  }
		  
		  if ( subToken.getName().equals("objectName"))
		  {
			  code+= " " + subToken.getValue() + " " ;
		  }
		  
		  if ( subToken.getName().equals("("))
		  {
			  code+="(";
		  }
		  
		  if ( subToken.getName().equals(")"))
		  {
			  code+=")";
		  }
		  
		  if ( subToken.getName().equals(";"))
		  {
			  code+=";";
		  }
		  if ( subToken.getName().equals("testParameter"))
		  {
			  //String tiParameters = "";
			  for (Token tiToken : subToken.getSubTokens() )
			  {
				  //System.out.println();
				  if ( tiToken.getName().equals("name"))
				  {
					  code += tiToken.getValue("name");
				  }
				  
				  if ( tiToken.getName().equals(","))
				  {
					  code += ", ";
				  }
				  if ( tiToken.getName().equals("\""))
				  {
					  code += "\"";
				  }
			  }
			  
		  }
		  
		  ta.setActionCode(code);
		  uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
		  uTestCase.addTestAction(ta);
		  
		  
		  
			  
	  }
	  
	  //uTestCase.
  }

  // line 686 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private String analyzeTestParameter(Token token, UmpleTestCase uTestCase, String parCode){
    // TODO Auto-generated method stub
	  for(Token spToken : token.getSubTokens())
	  {
		  if (spToken.getName().equals("testActionParameterList"))
		  {
			  System.out.println("nested");
		  }
		  if (spToken.getName().equals("\"")) { parCode+="\""; }
		  if (spToken.getName().equals(",")) { parCode+=","; }
		  if (spToken.getName().equals("name")) { parCode += spToken.getValue("name"); }
	  }
	  
	  return parCode;
  }

  // line 703 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeInterfaceTest(Token token, UmpleInterface aInterface){
    // TODO add Test to interface
	  UmpleTestCase tc = new UmpleTestCase (token.getValue("testName"), 0);
	  aInterface.addUmpleTestCase(tc);
  }

  // line 710 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void postTokenInterfaceTestAnalysis(){
    // TODO Check if class has implementation for interface test 
	  
	  for (UmpleClass uClass : model.getUmpleClasses())
	  {
		  if(uClass.hasParentInterface())
		  {
			  for(UmpleInterface aInterface : uClass.getParentInterface())
			  {
			  if(aInterface.hasUmpleTestCases())
			  {
				  
				  if(!uClass.hasUmpleTestCases())
				  {
					  // the class has no tests at all (although interface has test defnitions)					  					 					  
					  getParseResult().addErrorMessage(new ErrorMessage(6001,uClass.getPosition(0),uClass.getName(), aInterface.getName()+" tests"));
				  }
				  else {
				  //System.out.print("has TestCase");
				  for(UmpleTestCase iTc: aInterface.getUmpleTestCases())
				  {
					  for(UmpleTestCase uTc : uClass.getUmpleTestCases())
					  {						 
						  if(!uTc.getName().equals(iTc.getName()))
						  {
							  //Class has tests but not the one found in interface
							  // TODO: raise warning 
							  getParseResult().addErrorMessage(new ErrorMessage(6001,uClass.getPosition(0),uClass.getName(),aInterface.getName()+"."+iTc.getName()));
						  }
						  
						  else {
							  //The class has an implementation for the test found in interface
						  }
					  }
					  
					  

					  
				  }
				  }
			  }
			  }
		  }
	  }
  }

  // line 758 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void postTokenAbstractTestAnalysis(){
    for (UmpleClass uClass : model.getUmpleClasses())
		  {
			  if(uClass.hasExtendsClass())
			  {				  
				  				  
				  if(uClass.getExtendsClass().hasUmpleTestCases())
				  {
					  System.out.println("father has tests");
					  copyFatherClassTests(uClass, uClass.getExtendsClass());
				  }
				  
			  }
		  }
  }

  // line 776 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeAssertion(Token token, UmpleElement aClass, UmpleTestCase uTestCase){
    boolean isTimed = token.getValue("isTimed")!= null;
	   String type = "";
	   if (isTimed)
	   {
		   type = token.getValue("isTimed")+StringFormatter.toPascalCase(token.getValue("assertType"));
		   //System.out.println(type);
	   }
	   else 
	   {
		   type = token.getValue("assertType");
	   }
	   
	   
	   //System.out.println(isTimed);
	   
	   if(token.getName().equals("assertion"))
	      {
	    	
	        if (token.getValue("assertType").equals("assertTrue"))
	        {         
	          uTestCase.addUmpleAssertion(new UmpleAssertion("",type,"method","",token.getValue("code"),uTestCase.getLocOrder()));
	          uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
	        }

	        if (token.getValue("assertType").equals("assertFalse"))
	        {
	        	uTestCase.addUmpleAssertion(new UmpleAssertion("",type,"method","",token.getValue("code"),uTestCase.getLocOrder()));
	        	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
	        }

	        if (token.getValue("assertType").equals("assertEqual"))
	        {
	          uTestCase.addUmpleAssertion(new UmpleAssertion("",type,"method","",token.getValue("code"),uTestCase.getLocOrder()));
	          uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
	        }
	    	
	       }
  }

  // line 816 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void checkFatherTestRecusive(UmpleClass inClass, UmpleClass exClass){
    //List<UmpleTestCase> uTcList;  
	   
	   if(exClass.hasExtendsClass()){
		   System.out.println("father is nested");
		   
		   
		   if(exClass.hasUmpleTestCases())
		   {
			   copyFatherClassTests(inClass,exClass);
		   }
		   //checkFatherTestRecusive(uClass);
		   
		   
		   checkFatherTestRecusive(exClass, exClass.getExtendsClass());
		   		   
		   
	   }
	   
	   else {
		   if(exClass.hasUmpleTestCases())
		   {
			   copyFatherClassTests(inClass,exClass);
		   } 
	   }
  }

  // line 843 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeTestInitAtt(Token token, UmpleElement uElement, UmpleTestCase uTestCase){
    // TODO analyse test attribute initialization 
	  TestAction ta = new TestAction("","","initAttribute",uTestCase.getLocOrder());
	  String code = "";
	  for (Token subToken: token.getSubTokens())
	  {
		  if ( subToken.getName().equals("identifier"))
		  {
			 code+=subToken.getValue();
		  }
		  
		  if ( subToken.getName().equals("attributeName"))
		  {
			  code+= " " + subToken.getValue() + " " ;
		  }
		  
		  if ( subToken.getName().equals("name"))
		  {
			  code += subToken.getValue("name");
		  }
		  
		  if ( subToken.getName().equals(","))
		  {
			  code += ", ";
		  }
		  if ( subToken.getName().equals("\""))
		  {
			  code += "\"";
		  }
		  
		  if ( subToken.getName().equals("("))
		  {
			  code+="(";
		  }
		  
		  if ( subToken.getName().equals(")"))
		  {
			  code+=")";
		  }
		  
		  if ( subToken.getName().equals(";"))
		  {
			  code+=";";
		  }
		  
		  if ( subToken.getName().equals("="))
		  {
			  code+="= ";
		  }
		  
		  ta.setActionCode(code);
		  uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
		  uTestCase.addTestAction(ta);
		  
		  
		  
			  
	  }
  }

  // line 903 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeTestInitAttWithMethodCall(Token token, UmpleElement uElement, UmpleTestCase uTestCase){
    // TODO assignments using method calls such as: String id = p1.getId();
	  TestAction ta = new TestAction("","","initAttribute",uTestCase.getLocOrder());
	  String code = "";
	  for (Token subToken: token.getSubTokens())
	  {
		  if ( subToken.getName().equals("identifier"))
		  {
			 code+=subToken.getValue();
		  }
		  
		  if ( subToken.getName().equals("attributeName"))
		  {
			  code+= " " + subToken.getValue() + " " ;
		  }
		  
		  if ( subToken.getName().equals("="))
		  {
			  code+="= ";
		  }
		  
		  if (subToken.getName().equals("testMethodCall"))
		  {
			  code += analyzeTestMethodCall(subToken, uTestCase, code);
		  }
		  
		  
		  
		  if ( subToken.getName().equals(";"))
		  {
			  code+=";";
		  }
		  
		  
		  
		  ta.setActionCode(code);
		  uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
		  uTestCase.addTestAction(ta);
		  
		  
		  
			  
	  }
  }

  // line 949 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void copyFatherClassTests(UmpleClass inClass, UmpleClass uClass){
    // TODO copy tests from father class to child class and check override 
	  boolean isExist = false;
	   	  
	  for(UmpleTestCase uTc: inClass.getUmpleTestCases())
	  {
	  for (UmpleTestCase exTc: uClass.getUmpleTestCases())
	  {
		  if (exTc.getName().equals(uTc.getName()))
		  {
			  System.out.println("test are equal ");
			  if(uTc.getIsOverride())
			  {
				  // then don't append child test into father test
			  }
			  else {
				  // if there is definition in father test, merge two tests into one father code then child code
				  mergeTests(uTc, exTc);
			  }
		  }		  
		  else {
			  System.out.println("addddd ");
			  // add father test to child class
			  UmpleTestCase uTestCase = new UmpleTestCase(exTc.getName(),0);
			  //uTestCase.ad
			  mergeTests(uTestCase, exTc);
			  
			  //We are HEREREERE inClass.add
			  
			  //inClass.addUmpleTestCase(uTestCase);
		  }		  
	  }
	  
	  }
  }

  // line 988 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeClassTestSequence(Token token, UmpleClass aClass){
    // TODO Analyze test sequence token, order test cases with delimiter -> according to order
	  TestSequence ts = new TestSequence(token.getValue("sequenceName"));
	   //String [] tests;
	  String sequenceCode = "";
	  for (Token subToken : token.getSubTokens())
	  {
		   
		  if(subToken.getName().equals("testSequenceEntry"))
		  {
			  for (Token ssubToken : subToken.getSubTokens())
			  {
				
				  if(ssubToken.getName().equals("->"))
				  {
					  sequenceCode += "->";
				  }
				  else if (ssubToken.getName().equals("name")){					  
			      sequenceCode += ssubToken.getValue(); 
			      ts.addTest(ssubToken.getValue());
			  //System.out.println("entry");
				  }
			  }
		  }
	  }	  	  	
	  //tests = sequenceCode.split("->");
  }


  /**
   * /// generic test methods
   */
  // line 1019 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeClassGenericTestCase(Token token, UmpleClass aClass){
    String element = token.getValue("genericElement");
    String fix = "";
    String fixType = "";
    String fixValue = "";
    boolean hasFix = false;
    String elementType = token.getValue("elementType");
    List<String> elementTypes = new ArrayList<String>();
    String code = "";
    
    //System.out.println(token.getValue("elementType"));
    //System.out.println(token.getValue("genericElement"));
    
    for(Token subToken :token.getSubTokens() ){
    	
    	if(subToken.getName().equals("elementFix"))
    	{
    		fixType = subToken.getValue("fixType");
    		hasFix = true;
    		for (Token fixToken : subToken.getSubTokens()) {
    			if(fixToken.getName().equals("fixValue"))
    			{
    				fix += fixToken.getValue("fixValue");
    				fixValue = fixToken.getValue("fixValue");
    			}
    			else
    			fix += fixToken.getName();
    		}    		
    		
    	}
    }
    /*// set fix type pre/suf
    if (fix.contains("prefix"))
    {
    	fixType = "prefix";
    }
    else if  (fix.contains("suffix"))
    {
    	fixType = "suffix";
    }*/
    
    //set flag
    
    
    
    
    
    //System.out.println(fix);
    //System.out.println(fixType);
    //System.out.println(fixValue);
    
    boolean toBeAdded = false;
	   
	   if (token.getValue("genericElement").equals("attribute"))
	   {
		   element = "attribute";
	   }
	   
	   else if (token.getValue("genericElement").equals("method"))
	   {
		   element = "method";
	   }
	   
	   else if (token.getValue("genericElement").equals("association"))
	   {
		   element = "association";
	   }
	   
	   else {
		  getParseResult().addErrorMessage(new ErrorMessage(new ErrorType(6020,4, "Generic Test element is not recognized. ", ""), aClass.getPosition(0)));
	   }
	   
	   
	   
	   
	   if (element.equals("attribute"))
	   {
		   
		   
	    for (Attribute att : aClass.getAttributes())
	    { 
	    	if (hasFix)
	    	{
	    		if (fixType.equals("prefix"))
	    		{
	    			if (att.getType().equals(elementType) && att.getName().startsWith(fixValue))
	    			{

	    		    	   code = modifyGenericTestAttribute(token, aClass, att);
	    		    	//System.out.println(uTestCase.getTestAction(0).getActionCode());
	    			    	
	    			    	UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+att.getName(),0);
	    			       	TestAction aTestAction = new TestAction("genericAttribute", code.toString(), "generic", 0);
	    			       	
	    			       	uTestCase.addTestAction(aTestAction);
	    			       	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
	    			       	aClass.addUmpleTestCase(uTestCase);	 
	    		    	
	    			}
	    		}
	    		
	    		else if (fixType.equals("suffix"))
	    		{
	    			if (att.getType().equals(elementType) && att.getName().endsWith(fixValue))
	    			{

	    		    	   code = modifyGenericTestAttribute(token, aClass, att);
	    		    	//System.out.println(uTestCase.getTestAction(0).getActionCode());
	    			    	
	    			    	UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+att.getName(),0);
	    			       	TestAction aTestAction = new TestAction("genericAttribute", code.toString(), "generic", 0);
	    			       	
	    			       	uTestCase.addTestAction(aTestAction);
	    			       	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
	    			       	aClass.addUmpleTestCase(uTestCase);	 
	    		    	
	    			}
	    		}
	    		
	    		else if (fixType.equals("regex"))
	    		{
	    			if (att.getType().equals(elementType) && att.getName().matches(fixValue))
	    			{

	    		    	   code = modifyGenericTestAttribute(token, aClass, att);
	    		    	   //System.out.println(uTestCase.getTestAction(0).getActionCode());
	    			    	
	    			    	UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+att.getName(),0);
	    			       	TestAction aTestAction = new TestAction("genericAttribute", code.toString(), "generic", 0);
	    			       	
	    			       	uTestCase.addTestAction(aTestAction);
	    			       	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
	    			       	aClass.addUmpleTestCase(uTestCase);	 
	    		    	
	    			}
	    		}
	    		
	    	}
	    	
	    	else if (att.getType().equals(elementType))
	    	{
	    		
	    		
	    	   code = modifyGenericTestAttribute(token, aClass, att);
	    	//System.out.println(uTestCase.getTestAction(0).getActionCode());
		    	
		    	UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+att.getName(),0);
		       	TestAction aTestAction = new TestAction("genericAttribute", code.toString(), "generic", 0);
		       	
		       	uTestCase.addTestAction(aTestAction);
		       	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
		       	aClass.addUmpleTestCase(uTestCase);	 
	    	}
	    		    		    	
	    	
	    }
	    
	    
	    
	    
	    
	   }
	   
	   
	   
	   if (element.equals("method"))
	   {
		   
		   String returnValue = "";
		   String methodPar = ""; // store the method input paramters		   
		   String methodReturnV = ""; // store the method return value 
		   for (Token subToken : token.getSubTokens())
		   {
			   if(subToken.getName().equals("elementType"))			   
				   elementTypes.add(subToken.getValue("elementType"));			   			   			   
		   }
		   
		   for (int x = 0 ; x<elementTypes.size();x++)
		   {
			  // System.out.println(elementTypes.get(x) + meth);
		   }
		   
		   
		   //set return value then clear input from list 
		   returnValue = elementTypes.get(0);
		   //System.out.println(returnValue);
		   //elementTypes.remove(0);
		   
		 
	    for (Method meth : aClass.getMethods())
	    { 
	    	List<String> methodParametersType = new ArrayList<String>();
	    	methodParametersType.add(meth.getType());
	    	//System.out.println("::" + meth.getMethodParameters().toString());
	    	for (MethodParameter pr : meth.getMethodParameters())
	    	{
	    		methodParametersType.add(pr.getType());
	    		//System.out.println("::" +pr.getType());
	    	}
	    	
	    	if(elementTypes.equals(methodParametersType))
	    	{
	    		//System.out.println(":::EQUAL");
	    	
	    	
	    	UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+meth.getName(),0);
	    	TestAction aTestAction = new TestAction("genericMethod", token.getValue("code"), "generic", 0);
	    	aTestAction.setActionCode(aTestAction.getActionCode().replace("<<method>>", meth.getName()));	    	
	    	uTestCase.addTestAction(aTestAction);
	    	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
	    	aClass.addUmpleTestCase(uTestCase);	
	    	}
	    }
	   }
	   
	   if(element.equals("association"))
	   {
		   
		   		   		  		   
		   if (elementType.equals( "1--*"))
		   {
			   
			   addGenericOneToMany (code,aClass,token);
		   }
		   
		   if (elementType.equals( "0..1--*"))
		   {
			   
			   addGenericOptionalOneToMany (code,aClass,token);
		   }
		   
		   if (elementType.equals( "*--*"))
		   {
			   
			   addGenericManyToMany (code,aClass,token);
		   }
		   
		   if (elementType.equals( "0..1--1"))
		   {
			   
			   addGenericOptionalOneToOne (code,aClass,token);
		   }
		   
		   //Navigatable association
		   if (elementType.equals( "1->*"))
		   {			   			   
			   addGenericRightNavOneToMany (code,aClass,token);
		   }
		   		   
		   
		   if (elementType.equals( "0..1->*"))
		   {
			   
			   addGenericRightNavOptionalOneToMany (code,aClass,token);
		   }		   
		   
		   if (elementType.equals( "*->*"))
		   {
			   
			   addGenericRightNavManyToMany (code,aClass,token);
		   
		   }		   		   
		   
		   if (elementType.equals( "0..1-->1"))
		   {
			   
			   addGenericRightNavOptionalOneToOne (code,aClass,token);
		   }

		   
		   
		   
		   
	   }
  }

  // line 1295 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void addGenericRightNavManyToMany(String code, UmpleClass aClass, Token token){
    // TODO Add gen-test for right navigable ManyToMany
		  for (AssociationVariable av : aClass.getAssociationVariables())
		  {
			  if (( av.isOptionalMany() && av.getRelatedAssociation().isOptionalMany() ) &&  ! av.getRelatedAssociation().getIsNavigable())
			  {
				  
				  code = modfiyGenericAssociationReplacements(token,aClass, av, token.getValue("code"));
				   
				   
					 
				   //System.out.println(token.getValue("elementType"));				   
				   UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+av.getName(),0);
			    	TestAction aTestAction = new TestAction("genericAssociationRightNavigableManyToMany", code, "generic", 0);
			    	
			    			    	
			    	//aTestAction.setActionCode(aTestAction.getActionCode().replace("<<association>>", av.getName()));
			    	//aTestAction.setActionCode(aTestAction.getActionCode().replace("<<association.toSingular()>>", av.getName().substring(0, av.getName().length()-1)));
			    	uTestCase.addTestAction(aTestAction);
			    	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
			    	aClass.addUmpleTestCase(uTestCase);	
			  }
		  }
  }

  // line 1321 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void addGenericRightNavOptionalOneToOne(String code, UmpleClass aClass, Token token){
    // TODO Add gen-test for right navigable Optional one-to-one
		  for (AssociationVariable av : aClass.getAssociationVariables())
		  {
			  if (( av.isMandatoryOne() && av.getRelatedAssociation().isOptionalOne() ) &&  ! av.getRelatedAssociation().getIsNavigable())
			  {
				  
				  code = modfiyGenericAssociationReplacements(token,aClass, av, token.getValue("code"));
				   
				   
					 
				   //System.out.println(token.getValue("elementType"));				   
				   UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+av.getName(),0);
			    	TestAction aTestAction = new TestAction("genericAssociationRightNavigableOptionalOneToOne", code, "generic", 0);
			    	
			    			    	
			    	//aTestAction.setActionCode(aTestAction.getActionCode().replace("<<association>>", av.getName()));
			    	//aTestAction.setActionCode(aTestAction.getActionCode().replace("<<association.toSingular()>>", av.getName().substring(0, av.getName().length()-1)));
			    	uTestCase.addTestAction(aTestAction);
			    	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
			    	aClass.addUmpleTestCase(uTestCase);	
			  }
		  }
  }

  // line 1348 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void addGenericRightNavOneToMany(String code, UmpleClass aClass, Token token){
    // TODO Add gen-test for right navigable one-to-many
	  for (AssociationVariable av : aClass.getAssociationVariables())
	  {
		  if (( av.isOptionalMany() && av.getRelatedAssociation().isMandatoryOne() ) &&  ! av.getRelatedAssociation().getIsNavigable())
		  {
			  
			  code = modfiyGenericAssociationReplacements(token,aClass, av, token.getValue("code"));
			   
			   
				 
			   //System.out.println(token.getValue("elementType"));				   
			   UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+av.getName(),0);
		    	TestAction aTestAction = new TestAction("genericAssociationRightNavigableOneToMany", code, "generic", 0);
		    	
		    			    	
		    	//aTestAction.setActionCode(aTestAction.getActionCode().replace("<<association>>", av.getName()));
		    	//aTestAction.setActionCode(aTestAction.getActionCode().replace("<<association.toSingular()>>", av.getName().substring(0, av.getName().length()-1)));
		    	uTestCase.addTestAction(aTestAction);
		    	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
		    	aClass.addUmpleTestCase(uTestCase);	
		  }
	  }
  }

  // line 1374 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void addGenericRightNavOptionalOneToMany(String code, UmpleClass aClass, Token token){
    // TODO Add gen-test for right navigable Optional one-to-many
		  	  
	  for (AssociationVariable av : aClass.getAssociationVariables())
		  {
		  System.out.println(av.getIsNavigable());
			  if (( av.isOptionalMany() && av.getRelatedAssociation().isOptionalOne() ) &&   ! av.getRelatedAssociation().getIsNavigable())
			  {
				  
				  code = modfiyGenericAssociationReplacements(token,aClass, av, token.getValue("code"));
				   
				   
					 
				   //System.out.println(token.getValue("elementType"));				   
				   UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+av.getName(),0);
			    	TestAction aTestAction = new TestAction("genericAssociationRightNavigableOneToMany", code, "generic", 0);
			    	
			    			    	
			    	//aTestAction.setActionCode(aTestAction.getActionCode().replace("<<association>>", av.getName()));
			    	//aTestAction.setActionCode(aTestAction.getActionCode().replace("<<association.toSingular()>>", av.getName().substring(0, av.getName().length()-1)));
			    	uTestCase.addTestAction(aTestAction);
			    	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
			    	aClass.addUmpleTestCase(uTestCase);	
			  }
		  }
  }

  // line 1403 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private String modifyGenericTestCode(Matcher matcher, Matcher nonMatcher, String element, String replacement, String nonReplacement, String code){
    while(matcher.find())
	   	{	//System.out.println("found attribute");    	   
	   		//int startIndex = matcher.start();
	   		//int endIndex = matcher.end();
	   		int preCharIndex = matcher.start();
	   		char preChar = code.charAt(preCharIndex);	    		    		    	    	    	
	   		if(Character.isLetter(preChar)){ // to check that the attribute is within a method call such as getId and has no white spaces or Java characters: ex get<<attribute>>	    	  
	   			String tempGroup = matcher.group();	    	
	   			//System.out.println(tempGroup);
	   			String tempReplacement ="";
	   			tempReplacement = tempGroup.replace(element, replacement);
	   			//System.out.println(tempReplacement);

	   			code = code.replace(tempGroup,tempReplacement);	    		
	   		}
	   	}
	   	while (nonMatcher.find()) // this loop finds matches of attribute that are not part of a methodCall example : getValue(<<attribute>>) it is rather a parameter in this case or String tempAtt = <<attribute>>
	   	{	    	
	   		String tempGroup = nonMatcher.group();	    		
	   		String tempReplacement = "";
	   		tempReplacement= tempGroup.replace(element, nonReplacement);
	   		//tempReplacement= tempGroup.replace("<<association.toSingular()>>", av.getName());
	   		code = code.replace(tempGroup,tempReplacement);
	   	}
	   	
	   	return code;
  }

  // line 1433 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private String modfiyGenericAssociationReplacements(Token token, UmpleClass uClass, AssociationVariable av, String testCode){
    // TODO modify necessary association-related tokens in test template for generic templates
	  String code = testCode;
	  String fix = "";

	   	//StringBuilder code = new StringBuilder(token.getValue("code"));
	   	String pascalRegex = "[a-zA-Z0-9]<<association>>";
	   	String nonPascalRegex = "[=|(|!|\\s]<<association>>";
	   	String PascalSingularRegex = "[a-zA-Z0-9]<<association\\.toSingular\\(\\)>>";
	   	String nonPascalSingularRegex = "[=|(|!|\\s]<<association\\.toSingular\\(\\)>>";
	   	
	   	
	   	Pattern pascalSingularPattern = Pattern.compile(PascalSingularRegex);
	   	Pattern nonPascalSingularPattern = Pattern.compile(nonPascalSingularRegex);
	   	
	   	
	   	Matcher pascSingularMatcher = pascalSingularPattern.matcher(code);
	   	Matcher nonPascSingularMatcher = nonPascalSingularPattern.matcher(code);
	   	
	   	//	
	   	Pattern pattern = Pattern.compile(pascalRegex);
	   	Matcher matcher = pattern.matcher(code);
	   	Pattern nonPattern = Pattern.compile(nonPascalRegex);
	   	Matcher nonMatcher =nonPattern.matcher(code);	   	
	   	
	   	code = modifyGenericTestCode(matcher, nonMatcher, "<<association>>", StringFormatter.toPascalCase(av.getName()), av.getName(), code);
	   	code = modifyGenericTestCode(pascSingularMatcher, nonPascSingularMatcher, "<<association.toSingular()>>", StringFormatter.toPascalCase(av.getName().substring(0, av.getName().length()-1)), av.getName().substring(0, av.getName().length()-1), code); 
	   	
	   	
	   	
	      
	   	             
	   	return code;
  }

  // line 1468 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void addGenericOptionalOneToMany(String code, UmpleClass aClass, Token token){
    // TODO Auto-generated method stub
	  
	  for (AssociationVariable av : aClass.getAssociationVariables())
	  {
		  if (av.isOptionalMany() && av.getRelatedAssociation().isOptionalOne())
		  {
			  code = modfiyGenericAssociationReplacements(token,aClass, av, token.getValue("code"));
			   
			   
				 
			   //System.out.println(token.getValue("elementType"));				   
			   UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+av.getName(),0);
		    	TestAction aTestAction = new TestAction("genericAssociation", code, "generic", 0);
		    	
		    			    	
		    	//aTestAction.setActionCode(aTestAction.getActionCode().replace("<<association>>", av.getName()));
		    	//aTestAction.setActionCode(aTestAction.getActionCode().replace("<<association.toSingular()>>", av.getName().substring(0, av.getName().length()-1)));
		    	uTestCase.addTestAction(aTestAction);
		    	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
		    	aClass.addUmpleTestCase(uTestCase);	
		  }
	  }
  }

  // line 1494 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void addGenericOneToMany(String code, UmpleClass aClass, Token token){
    // TODO Auto-generated method stub
	  for (AssociationVariable av : aClass.getAssociationVariables())
	  {
		  if (av.isOptionalMany() && av.getRelatedAssociation().isMandatoryOne())
		  {
			  
			  code = modfiyGenericAssociationReplacements(token,aClass, av, token.getValue("code"));
			   
			   
				 
			   //System.out.println(token.getValue("elementType"));				   
			   UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+av.getName(),0);
		    	TestAction aTestAction = new TestAction("genericAssociationOneToMany", code, "generic", 0);
		    	
		    			    	
		    	//aTestAction.setActionCode(aTestAction.getActionCode().replace("<<association>>", av.getName()));
		    	//aTestAction.setActionCode(aTestAction.getActionCode().replace("<<association.toSingular()>>", av.getName().substring(0, av.getName().length()-1)));
		    	uTestCase.addTestAction(aTestAction);
		    	uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
		    	aClass.addUmpleTestCase(uTestCase);	
		  }
	  }
  }

  // line 1520 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void addGenericManyToMany(String code, UmpleClass aClass, Token token){
    // TODO addd test for generic association *--*
	   for (AssociationVariable av : aClass.getAssociationVariables())
	   {
		   if (av.isOptionalMany() && av.getRelatedAssociation().isOptionalMany())
		   {

			   code = modfiyGenericAssociationReplacements(token,aClass, av, token.getValue("code"));

			   UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+av.getName(),0);
			   TestAction aTestAction = new TestAction("genericAssociationOneToMany", code, "generic", 0);

			   uTestCase.addTestAction(aTestAction);
			   uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
			   aClass.addUmpleTestCase(uTestCase);	
		   }
	   }
  }

  // line 1540 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void addGenericOptionalOneToOne(String code, UmpleClass aClass, Token token){
    // TODO addd test for generic association *--*
		   for (AssociationVariable av : aClass.getAssociationVariables())
		   {
			   if (av.isMandatoryOne() && av.getRelatedAssociation().isOptionalOne())
			   {

				   code = modfiyGenericAssociationReplacements(token,aClass, av, token.getValue("code"));

				   UmpleTestCase uTestCase = new UmpleTestCase(token.getValue("testCaseName")+"_"+av.getName(),0);
				   TestAction aTestAction = new TestAction("genericAssociationOptionalOneToOne", code, "generic", 0);

				   uTestCase.addTestAction(aTestAction);
				   uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
				   aClass.addUmpleTestCase(uTestCase);	
			   }
		   }
  }


  /**
   * test initializations at the class level, these are inits that were mesnt to be done at the global-level in the test class
   */
  // line 1562 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeTestClassInit(Token token, UmpleClass aClass){
    // TODO fix init code 
	  TestInit ti = new TestInit("", "", "");
	  //System.out.println(token.getValue("code"));
	  
	  String code = "";
	  for (Token subToken: token.getSubTokens())
	  {
		  if ( subToken.getName().equals("identifier"))
		  {
			 code+=subToken.getValue();
		  }
		  
		  if ( subToken.getName().equals("objectName"))
		  {
			  code+= " " + subToken.getValue() + " " ;
		  }
		  
		  if ( subToken.getName().equals("("))
		  {
			  code+="(";
		  }
		  
		  if ( subToken.getName().equals(")"))
		  {
			  code+=")";
		  }
		  
		  if ( subToken.getName().equals(";"))
		  {
			  code+=";";
		  }
		  if ( subToken.getName().equals("testParameter"))
		  {
			  //String tiParameters = "";
			  for (Token tiToken : subToken.getSubTokens() )
			  {
				  //System.out.println();
				  if ( tiToken.getName().equals("name"))
				  {
					  code += tiToken.getValue("name");
				  }
				  
				  if ( tiToken.getName().equals(","))
				  {
					  code += ", ";
				  }
				  if ( tiToken.getName().equals("\""))
				  {
					  code += "\"";
				  }
			  }
			  
		  }
	  }
	  
	  ti.setCode(code);	  
	  aClass.addTestInit(ti);
  }


  /**
   * This method modifies the generic template to replace with the actual attribute name if it matches the type indicated in template
   */
  // line 1625 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private String modifyGenericTestAttribute(Token token, UmpleClass aClass, Attribute att){
    String code = token.getValue("code");

   	String pascalRegex = "[a-zA-Z0-9]<<attribute>>";
   	String nonPascalRegex = "[=|(|!|\\s]<<attribute>>";
 	
   	Pattern pattern = Pattern.compile(pascalRegex);
   	Matcher matcher = pattern.matcher(code);
   	Pattern nonPattern = Pattern.compile(nonPascalRegex);
   	Matcher nonMatcher =nonPattern.matcher(code);
   	
   	code = modifyGenericTestCode(matcher, nonMatcher, "<<attribute>>", StringFormatter.toPascalCase(att.getName()) , att.getName(), code);
   	
      
   	             
   	return code;
  }

  // line 1643 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeTestIfStatement(Token token, UmpleElement uElement, UmpleTestCase uTestCase){
    // TODO analyze if statement tokens
	  
	 TestAction ta = new TestAction("ifStatement","", "ifStatement",uTestCase.getLocOrder());
	  String code = "";
	  for (Token subToken : token.getSubTokens()) {
		  if (subToken.getName().equals("("))
		  {
			  code += "(";
		  }
		  
		  if (subToken.getName().equals(")"))
		  {
			  code += ")";
		  }
		  
		  if (subToken.getName().equals("}"))
		  {
			  code += "\n\t  }";
		  }
		  
		  if (subToken.getName().equals("{"))
		  {
			  code += "{\n\t";
		  }
		  
		  if (subToken.getName().equals("if"))
		  {
			  code += "\n\t"+"if";
		  }
		  
		  if (subToken.getName().equals("condition"))
		  {
			  code += subToken.getValue("condition");
		  }
		  
		  if (subToken.getName().equals("code")) {
			  code += "" +subToken.getValue("code");
		  }
		  
		  if (subToken.getName().equals("ifElseStatement"))
		  {
			  for (Token ifElseToken :subToken.getSubTokens()) {
				  
			  if (ifElseToken.getName().equals("if"))			  
			  code += "\n\t"+"if";			  
			  if (ifElseToken.getName().equals("else"))
				  code += " else";
			  if (ifElseToken.getName().equals("code"))
				  code += ifElseToken.getValue("code");
			  if (ifElseToken.getName().equals("("))
				  code += "(";
			  if (ifElseToken.getName().equals(")"))
				  code += ")";
			  if (ifElseToken.getName().equals("}"))
				  code +="\n\t}\n";
			  if (ifElseToken.getName().equals("{"))
				  code += "{\n\t";
			  if (ifElseToken.getName().equals("condition"))
				  code += ifElseToken.getValue("condition");			  
			  }
		  }
		  
		  if (subToken.getName().equals("elseStatement"))
		  {
			  code += "\n\t";
			  for (Token elseToken :subToken.getSubTokens()) {
				  		  
			  if (elseToken.getName().equals("else"))
				  code += "else";
			  if (elseToken.getName().equals("code"))
				  code += "\t" + elseToken.getValue("code")+"";
			  if (elseToken.getName().equals("}"))
				  code += "\n\t}\n";
			  if (elseToken.getName().equals("{"))
				  code += " {\n";			  		  
			  }
		  }
		  
		  
	  }
	  
	  ta.setActionCode(code);
	  
	  uTestCase.addTestAction(ta);
	  uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
  }

  // line 1733 "../../../../src/UmpleInternalParser_CodeTest.ump"
   private void analyzeTestForStatement(Token token, UmpleElement uElement, UmpleTestCase uTestCase){
    // TODO For loop analysis
	TestAction ta = new TestAction("forLoop","","forLoop", uTestCase.getLocOrder());
	String code = "";
	for (Token subToken : token.getSubTokens())
	{
		if (subToken.getName().equals("for"))
		{
			code += "for ";
		}
		if (subToken.getName().equals("("))
		{
			code += "( ";
		}
		if (subToken.getName().equals(")"))
		{
			code += " )\n\t";
		}
		
		if (subToken.getName().equals("forCode"))
		{
			code += subToken.getValue("forCode");
		}
		
		if (subToken.getName().equals("{"))
		{
			code += " {\n\t";
		}

		if (subToken.getName().equals("}"))
		{
			code += " \n\t}";
		}
		if (subToken.getName().equals("code"))
		{
			code += subToken.getValue("code");
		}
		
		ta.setActionCode(code);
		
		uTestCase.addTestAction(ta);
		uTestCase.setLocOrder(uTestCase.getLocOrder()+1);
		
	}
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 819 "../../../../src/UmpleInternalParser_CodeClass.ump"
  private List <UmpleInterface> recursiveCycleCheckInterface (List <UmpleInterface> extend,UmpleInterface parent, HashMap<UmpleInterface, Boolean> map) 
  {
    List <UmpleInterface> temp = new ArrayList <UmpleInterface>();
    
    if(extend == null|| extend.isEmpty())
      return temp;
    
    for (UmpleInterface I: extend){
      if(map.containsKey(I)){
        temp.add(I);
        return temp;
      }
      map.put(I, true);
      
      for (UmpleInterface EI: I.getExtendsInterface()){
        if(parent.equals(EI)){
          temp.add(EI);
          return temp;
        }
      }
      List <UmpleInterface> temptemp = recursiveCycleCheckInterface(I.getExtendsInterface(), parent, map);
      temp.addAll(temptemp);
    }
    
    return temp;
  }

// line 757 "../../../../src/UmpleInternalParser_CodeTrait.ump"
  private Map<UmpleTrait, List<Method>> gatherConcreteMethods (UmpleTrait inTrait, GeneralTPApplied inGTPApplied) 
  {
    Map<UmpleTrait, List<Method>> traitMethods = new HashMap<UmpleTrait, List<Method>>(); 
 	 Map<UmpleTrait, List<Method>> tempTraitMethods = new HashMap<UmpleTrait, List<Method>>();
 	 //----------------------------------------------------------------------------------------
  	 if (inGTPApplied!=null){
	 	 for (MethodTemplateSignature mTSignature : inGTPApplied.getMethodTemplateSignatures()) {
	 		Method tempMethod = inTrait.getMethod(mTSignature.getMethod()); 
		 	if ( tempMethod == null || (tempMethod != null && tempMethod.isIsAbstract())){
				getParseResult().addErrorMessage(new ErrorMessage(212,inTrait.getPosition(0),mTSignature.getMethod().getName(),inTrait.getName()));	
				return traitMethods;
			}
		 }
 	 }
 	 //----------------------------------------------------------------------------------------
 	 List<Method> methods = new ArrayList<Method>();	  
 	 for (Method method : inTrait.getMethods()) {
    	 if (! method.isIsAbstract()){ 
    	 	 Method newMethod = new Method(method);
    	 	 ApplyTypeParametersToMethod(newMethod,inGTPApplied,inTrait);
    	 	 newMethod.getMethodBody().getCodeblock().ApplyTypeParameters(inGTPApplied,inTrait);
 			 methods.add(newMethod);
	 	 }
	 }
     traitMethods.put(inTrait,methods);
     //----------------------------------------------------------------------------------------
     for (UmpleTrait uTrait : inTrait.getExtendsTraits()) {
       GeneralTPApplied newGTParameter = inTrait.getGeneralTPAppliedByName(uTrait.getName())!=null ? new GeneralTPApplied(inTrait.getGeneralTPAppliedByName(uTrait.getName())) : null;
       if (newGTParameter!=null){
         ApplyTypeParametersToTypeParameters(newGTParameter, inGTPApplied,inTrait);       
     	   checkClassSupportTraitsInterfaces(newGTParameter,inTrait);
     	 }
 		   if ( ! getParseResult().getWasSuccess() ) return traitMethods;
     	 tempTraitMethods = gatherConcreteMethods(uTrait,getNewGeneralTPAppliedWithP2P(inTrait,uTrait,inGTPApplied));	 
    	 if ( ! getParseResult().getWasSuccess() ) return traitMethods;
    	 if (CheckMethodComeFromTraitsIsAvaialbleInOtherTraits(traitMethods,tempTraitMethods,inTrait)) return traitMethods;
    	 AddMethodMapToAnother(traitMethods,tempTraitMethods);
	 }
	 ApplyExludeIncludeAliasToMethod(traitMethods, inGTPApplied);
     return traitMethods;
  }

// line 1320 "../../../../src/UmpleInternalParser_CodeTrait.ump"
  private Map<UmpleTrait, List<Attribute>> gatherAttributes (UmpleTrait inTrait, GeneralTPApplied inGTPApplied) 
  {
    Map<UmpleTrait, List<Attribute>> traitAttributes = new HashMap<UmpleTrait, List<Attribute>>(); 
	 Map<UmpleTrait, List<Attribute>> tempTraitAttributes = new HashMap<UmpleTrait, List<Attribute>>();
	 //----------------------------------------------------------------------------------------
	 List<Attribute> attributes = new ArrayList<Attribute>();	  
	 for (Attribute attribute : inTrait.getAttributes()) {
		 Attribute newAttribute = new Attribute(attribute);
	 	 ApplyTypeParametersToAttribute(newAttribute,inGTPApplied,inTrait);
		 attributes.add(newAttribute);
	 }
    traitAttributes.put(inTrait,attributes);
    //----------------------------------------------------------------------------------------
    for (UmpleTrait uTrait : inTrait.getExtendsTraits()) {
      GeneralTPApplied newGTParameter = inTrait.getGeneralTPAppliedByName(uTrait.getName())!=null ? new GeneralTPApplied(inTrait.getGeneralTPAppliedByName(uTrait.getName())) : null;
      if (newGTParameter!=null){
         ApplyTypeParametersToTypeParameters(newGTParameter, inGTPApplied,inTrait);       
         checkClassSupportTraitsInterfaces(newGTParameter,inTrait);
      }
      if ( ! getParseResult().getWasSuccess() ) return traitAttributes;
    	tempTraitAttributes = gatherAttributes(uTrait,getNewGeneralTPAppliedWithP2P(inTrait,uTrait,inGTPApplied));   	 
   	 	if ( ! getParseResult().getWasSuccess() ) return traitAttributes;
   	 	if (CheckAttComeFromTraitsIsAvaialbleInOtherTraits(traitAttributes, tempTraitAttributes)) return traitAttributes;
   	 	AddAttMapToAnother(traitAttributes,tempTraitAttributes);
	}
    return traitAttributes;
  }

// line 19 "../../../../src/UmpleInternalParser_CodeConstraints.ump"
  private enum DataType 
  {
    BOOL,
    NUMBER,
    STRING,
    DATE;
  }
// line 60 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
  private static final  String STATIC = "STATIC" ;
// line 64 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
  private static int numberOfActiveObjects = 1 ;
// line 68 "../../../../src/UmpleInternalParser_CodeStateMachine.ump"
  private int numberOfOcurrences ;

// line 76 "../../../../src/UmpleInternalParser_CodeTrait_StateMachine.ump"
  private Map<UmpleTrait, List<StateMachine>> gatherStateMachinesFromTrait (UmpleTrait inTrait,GeneralTPApplied inGTPApplied, UmpleClass inClass) 
  {
    Map<UmpleTrait, List<StateMachine>> traitStateMachine = new HashMap<UmpleTrait, List<StateMachine>>(); 
  	Map<UmpleTrait, List<StateMachine>> tempTraitStateMachine = new HashMap<UmpleTrait, List<StateMachine>>();  	

  	
  	/*
  	 * Go through the included traits.
  	 */
  	for (UmpleTrait uTrait : inTrait.getExtendsTraits()) {
	    GeneralTPApplied newGTParameter = inTrait.getGeneralTPAppliedByName(uTrait.getName())!=null ? new GeneralTPApplied(inTrait.getGeneralTPAppliedByName(uTrait.getName())) : null;
      if (newGTParameter!=null){
        ApplyTypeParametersToTypeParameters(newGTParameter, inGTPApplied,inTrait);       
         checkClassSupportTraitsInterfaces(newGTParameter,inTrait);
       }
      if ( ! getParseResult().getWasSuccess() ) return traitStateMachine; 
  		tempTraitStateMachine = gatherStateMachinesFromTrait(uTrait,getNewGeneralTPAppliedWithP2P(inTrait,uTrait,inGTPApplied),inClass);	 
  		if ( ! getParseResult().getWasSuccess() ) return traitStateMachine;
  		if (!CheckSMFromTraitIsNotAvaialbleInOtherTraits(traitStateMachine,tempTraitStateMachine,inTrait)) return traitStateMachine;
  		AddStateMachineMapToAnother(traitStateMachine,tempTraitStateMachine);
  	}
  	
  	   /*
     * Duplicate state machines in order to be able modify them without effecting the original names;
     */
    List<StateMachine> sMList = new ArrayList<StateMachine>();
    for (StateMachine sm: inTrait.getStateMachines()){
       sMList.add(sm.clone());
    }
    Map<UmpleTrait, List<StateMachine>> traitStateMachine2 = new HashMap<UmpleTrait, List<StateMachine>>();
    if (sMList.size()>0) traitStateMachine2.put(inTrait,sMList);
  	if (!CheckSMFromTraitIsNotAvaialbleInOtherTraits(traitStateMachine2,traitStateMachine,inTrait)) return traitStateMachine2;
  	AddStateMachineMapToAnother(traitStateMachine2,traitStateMachine);
  	/*
  	 * Check to make sure applied type parameters are valid;
  	 */
  	List<StateMachine> list = new ArrayList<StateMachine>();
  	for(Map.Entry<UmpleTrait, List<StateMachine>> entry : traitStateMachine2.entrySet()){
  		list.addAll(entry.getValue());
  	}
  	if (!checkValidityOfSMTemplateSignature(inGTPApplied,list,inTrait)) return traitStateMachine2;
  	if (!checkValidityOfSMModifier(inGTPApplied,list,inTrait)) return traitStateMachine2;
  	//To assign a state machine to a state.
		//----------------------------------------------------------------------------------------		
			if (getParseResult().getWasSuccess()) AssignStateMachineToState(inTrait,traitStateMachine2);	
  	//----------------------------------------------------------------------------------------	  	
		for(Map.Entry<UmpleTrait, List<StateMachine>> entry : traitStateMachine2.entrySet()){
			List<StateMachine> mustBeRemoved =  new ArrayList<StateMachine>();	
			for (StateMachine sMachine : entry.getValue()) {
		  	 	StateMachine stTemp = CompeletlyAllyTypeParametersToStateMachines(sMachine,inGTPApplied,inTrait);
		  		if (stTemp==null) mustBeRemoved.add(sMachine);
		  	}
			for(StateMachine sm : mustBeRemoved)	traitStateMachine2.get(entry.getKey()).remove(sm);
		}
		//TODO this part must be mixed with the previous part when I do refactoring.
    keepStateMachine(traitStateMachine2,inGTPApplied);
  	return traitStateMachine2;
  }
// line 11 "../../../../src/UmpleInternalParser_CodeEnumeration.ump"
  final String AUTO_GENERATED_METHOD = "fAutoAPI" ;

  
}