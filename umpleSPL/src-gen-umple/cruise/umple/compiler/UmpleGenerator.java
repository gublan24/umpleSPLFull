/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;
import java.io.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;
import cruise.umple.parser.analysis.*;
import cruise.umple.parser.rules.*;
import cruise.umple.parser.Token;

// line 18 "../../../../src/Filter_refactored.ump"
// line 61 "../../../../src/Class_refactored.ump"
// line 169 "../../../../src/Trait_refactored.ump"
// line 48 "../../../../src/Structure_refactored.ump"
// line 76 "../../../../src/Trace_refactored.ump"
// line 29 "../../../../src/Layout_refactored.ump"
// line 18 "../../../../src/Mixset_refactored.ump"
// line 12 "../../../../src/Fixml_refactored.ump"
// line 33 "../../../../src/Generator_CodeUmple.ump"
public class UmpleGenerator extends SuperCodeGenerator implements CodeTranslator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleGenerator()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 394 "../../../../src/Generator_CodeUmple.ump"
   private Scope getScope(){
    if(this.scopes.isEmpty()) {
      throw new UmpleCompilerException("Tried to get scope from empty stack.", null);
    }

    return scopes.peekFirst();
  }

  // line 403 "../../../../src/Generator_CodeUmple.ump"
   private Scope getParentScope(){
    if(this.scopes.size() < 2) {
      return null;
    }

    return (Scope)this.scopes.toArray()[1];
  }


  /**
   * Implementation of CodeTranslator. The following methods are not used, but are present
   * so that the module can share the same superclasses as other generators/translators.
   */
  // line 417 "../../../../src/Generator_CodeUmple.ump"
   public String translate(String id, Attribute attribute){
    return "";
  }

  // line 422 "../../../../src/Generator_CodeUmple.ump"
   public String translate(String id, StateMachine stm){
    return "";
  }

  // line 427 "../../../../src/Generator_CodeUmple.ump"
   public String translate(String keyName, State state){
    return "";
  }

  // line 432 "../../../../src/Generator_CodeUmple.ump"
   public String translate(String id, Event e){
    return "";
  }

  // line 437 "../../../../src/Generator_CodeUmple.ump"
   public String translate(String id, AssociationVariable aVar){
    return "";
  }

  // line 442 "../../../../src/Generator_CodeUmple.ump"
   public String translate(String id, ConstraintTree constraint){
    return "";
  }

  // line 447 "../../../../src/Generator_CodeUmple.ump"
   public String translate(String id, TraceItem traceItem){
    return "";
  }

  // line 452 "../../../../src/Generator_CodeUmple.ump"
   public String translate(String keyName, UmpleClass aClass0){
    return "";
  }

  // line 457 "../../../../src/Generator_CodeUmple.ump"
   public String translate(String methodType){
    return "";
  }

  // line 462 "../../../../src/Generator_CodeUmple.ump"
   public String translate(String name, UmpleInterface aInterface){
    return "";
  }

  // line 467 "../../../../src/Generator_CodeUmple.ump"
   public String relatedTranslate(String name, AssociationVariable av){
    return "";
  }

  // line 472 "../../../../src/Generator_CodeUmple.ump"
   public boolean isNullable(UmpleVariable av){
    return false;
  }

  // line 477 "../../../../src/Generator_CodeUmple.ump"
   public String nameOf(String name, boolean hasMultiple){
    return "";
  }

  // line 482 "../../../../src/Generator_CodeUmple.ump"
   public ILang getLanguageFor(UmpleElement aElement){
    return null;
  }

  // line 487 "../../../../src/Generator_CodeUmple.ump"
   public static  String typeOf(String aType){
    return "";
  }

  // line 492 "../../../../src/Generator_CodeUmple.ump"
   public void initializeLangaugeBasedVariables(){
    // do nothing
  }


  /**
   * End of CodeTranslator implementation.
   * prepare: Setup for code generation
   */
  // line 504 "../../../../src/Generator_CodeUmple.ump"
   public void prepare(){
    // do nothing
  }


  /**
   * Implementation of SuperCodeGenerator (CodeGenerator)
   */
  // line 512 "../../../../src/Generator_CodeUmple.ump"
   public void generate(){
    try{
      for (UmpleElement currentElement : getModel().getUmpleElements())
      {
        prepare();

        this.rootElementName = currentElement.getName();
        resetScopeStack();
        writeFile(currentElement);
      }
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("There was a problem with generating classes. " + e, e);
    }
    postpare();
  }


  /**
   * Purpose: Translate aElement to Umple and output to file
   * Implementation of: None. This is a local help function
   * Input: Expects a class or interface
   */
  // line 536 "../../../../src/Generator_CodeUmple.ump"
   private void writeFile(UmpleElement aElement){
    if(!(aElement instanceof UmpleClass || aElement instanceof UmpleInterface)) {
      throw new UmpleCompilerException("Expected an UmpleClass or UmpleInterface.", null);
    }

    try
    {
      String path = StringFormatter.addPathOrAbsolute(getModel().getUmpleFile().getPath(), getOutput());
      String filename = path + File.separator + aElement.getName() + ".ump";
      File file = new File(path);
      file.mkdirs();

      BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
      this.getCode(getModel(), aElement);
      String contents = this.getScope().acceptedCode.toString();
      this.getModel().getGeneratedCode().put(aElement.getName(),contents);
      bw.write(contents);

      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("There was a problem with generating classes. " + e, e);
    }
  }


  /**
   * Generate code for the input model and element.
   */
  // line 567 "../../../../src/Generator_CodeUmple.ump"
   public void getCode(UmpleModel model, UmpleElement uElement){
    initializeParser();

    Token elementRootRuleToken = getElementRootRuleToken(model, uElement);
    generateRuleOutput(elementRootRuleToken, model, uElement);
  }


  /**
   * Configure the parser and analyzer, plus acquire the root rule and root rule for
   * the input grammar.
   */
  // line 579 "../../../../src/Generator_CodeUmple.ump"
   private void initializeParser(){
    if(parser != null) { // Parser is shared data, we need only generate once.
      return;
    }

    parser = new cruise.umple.parser.analysis.RuleBasedParser();

    // Populate the parser with Umple's grammar (see GrammarParsing_Code.ump)
    parser.addGrammarFile("/umple_core.grammar");
    
parser.addGrammarFile("/class/umple_classes.grammar");
Label_Class_7: ;
    
parser.addGrammarFile("/trait/umple_traits.grammar");
Label_Trait_8: ;
    
parser.addGrammarFile("/fixml/umple_fixml.grammar");
Label_FIXML_9: ;
    parser.addGrammarFile("/umple_patterns.grammar");
    Label_StateMachine_10: ;
    
parser.addGrammarFile("/trace/umple_traces.grammar");
Label_Trace_11: ;
    Label_Template_12: ;
    
parser.addGrammarFile("/strcture/umple_structure.grammar");
Label_Structure_13: ;
    parser.addGrammarFile("/constraint/umple_constraints.grammar");  // TODO Under development
    
parser.addGrammarFile("/layout/umple_layout.grammar");
Label_Layout_14: ;
    parser.addGrammarFile("/umple_exceptions.grammar");
    parser.addGrammarFile("/use.grammar");
    
parser.addGrammarFile("/filter/umple_filter.grammar"); // TODO Under development
Label_Filter_15: ;

    
parser.addGrammarFile("/mixset/umple_mixsets.grammar");
Label_Mixset_16: ;


    parser.setupRules(true);    // Compute the Umple grammar rules

    rootRuleToken = parser.getRootToken();
    if(rootRuleToken == null) {
      throw new UmpleCompilerException("rootRuleToken retrieved from parser is NULL.", null);
    }

    /*
     * The analyzer and its rules are not yet required because the rules are represented only
     * as regex, so the associated properties cannot be (easily) derived. However, the graph
     * nodes hold other useful information, for example about spacing. This could therefore
     * come into use for a whitespace-delimited language.
     */
    analyzer = parser.getAnalyzer(); // Add this method to the RuleBasedParser
    rootRule = analyzer.getRules().get("$ROOT$");
    if(rootRule == null) {
      throw new UmpleCompilerException("Parser's rootRuleToken is null", null);
    }
  }


  /**
   * Find the best-fit root rule (defined by grammar in 'parser') for 'uElement'. If rule is not in cache, then
   * this method acts as a wapper for getRuleByName, which traverses the Rule graph (produced by Analyzer)
   * Note: UmpleElement can be an UmpleClassifier, which is currently a Class or Interface
   */
  // line 631 "../../../../src/Generator_CodeUmple.ump"
   private ChoiceRule getElementRootRule(UmpleModel model, UmpleElement uElement){
    String elementRootRuleName = null;

    if(uElement.getModifier().equals(RuleModifier.EXTERNAL.toString())) {
      elementRootRuleName = RuleName.EXTERNAL_DEFINITION.toString();
    } else if(uElement instanceof UmpleClass) {
      elementRootRuleName = RuleName.CLASS_DEFINITION.toString();
    } else if(uElement instanceof UmpleInterface) {
      elementRootRuleName = RuleName.INTERFACE_DEFINITION.toString();
    } else {
      throw new UmpleCompilerException("Unrecognized element type.", null);
    }

    if(!ruleCache.containsKey(elementRootRuleName)) {
      ruleCache.put(elementRootRuleName, getRuleByName(this.rootRule, elementRootRuleName));
    }

    return ruleCache.get(elementRootRuleName);
  }


  /**
   * Find the best-fit root rule Token (defined by grammar in 'parser') for 'uElement'. If rule is not in cache, then
   * this method acts as a wapper for getRuleTokenByName, which traverses the RuleToken gaph (produced by RuleBasedParser)
   * Note: UmpleElement can be an UmpleClassifier, which is currently a Class or Interface
   */
  // line 657 "../../../../src/Generator_CodeUmple.ump"
   private Token getElementRootRuleToken(UmpleModel model, UmpleElement uElement){
    String elementRootTokenName = null;

    if(RuleModifier.EXTERNAL.toString().equals(uElement.getModifier())) {
      elementRootTokenName = RuleName.EXTERNAL_DEFINITION.toString();
    } else if(uElement instanceof UmpleClass) {
      elementRootTokenName = RuleName.CLASS_DEFINITION.toString();
    } else if(uElement instanceof UmpleInterface) {
      elementRootTokenName = RuleName.INTERFACE_DEFINITION.toString();
    } else {
      throw new UmpleCompilerException("Unrecognized element type.", null);
    }

    if(!tokenCache.containsKey(elementRootTokenName)) {
      tokenCache.put(elementRootTokenName, getRuleTokenByName(elementRootTokenName));
    }

    return tokenCache.get(elementRootTokenName);
  }


  /**
   * Perform breadth-first search to find rule with input name. The reason for breadth-first is that we're usually searching
   * for a token higher in the Rule graph, for example Interface, Class or Method; rather than leaf tokens.
   * - Assumptions are made about naming in grammars, such as the name of a class declaration token: concreteClassDeclaration
   */
  // line 683 "../../../../src/Generator_CodeUmple.ump"
   private ChoiceRule getRuleByName(ChoiceRule relativeRootRule, String name){
    Map<String,SearchState> visited = new HashMap<String,SearchState>();    // NULL => Unvisited, 0 => Recorded, 1 => Processed
    Queue<ChoiceRule> rules = new LinkedList<ChoiceRule>();
    ChoiceRule outputRule = null;

    if(name.equals(relativeRootRule.getName())) { // base case
      return relativeRootRule;
    }

    rules.add(relativeRootRule);
    visited.put(relativeRootRule.getName(), SearchState.RECORDED);

    SEARCH:
    while(!rules.isEmpty()) {
      ChoiceRule curRule = rules.poll();
        if(curRule == null) {
          throw new UmpleCompilerException("Could not find rule for rule", null);
        }

      for(int i = 0; i < curRule.size(); ++i) {
        ChoiceRule subRule = curRule.get(i);
        if(subRule == null) continue;

        if(!visited.containsKey(subRule.getName())) {
          if(name.equals(subRule.getName())) {
            outputRule = subRule;
            break SEARCH;
          }

          rules.add(subRule);
          visited.put(subRule.getName(), SearchState.RECORDED);
        }
      }

      visited.put(relativeRootRule.getName(), SearchState.PROCESSED);
    }

    if(outputRule == null) {
      throw new UmpleCompilerException("Could not find rule for rule, " + name, null);
    }

    return outputRule;
  }


  /**
   * Given a rule
   */
  // line 731 "../../../../src/Generator_CodeUmple.ump"
   private Terminal getTerminalRuleToken(String terminalName){
    ChoiceRule relativeRootRule = this.rootRule;

    if(!this.lastNamedRule.isEmpty()) {
      relativeRootRule = this.getRuleByName(this.rootRule, this.lastNamedRule);
      if(relativeRootRule == null) {
        relativeRootRule = this.rootRule;
      }
    }

    return (Terminal)this.getRuleByName(relativeRootRule, terminalName);
  }


  /**
   * Perform breadth-first search to find token with input name. The reason for breadth-first is that we're usually searching
   * for a token higher in the RuleToken graph, for example Interface, Class or Method; rather than leaf tokens.
   * - Assumptions are made about naming in grammars, such as the name of a class declaration token: concreteClassDeclaration
   */
  // line 751 "../../../../src/Generator_CodeUmple.ump"
   private Token getRuleTokenByName(String name){
    Map<Integer,SearchState> visited = new HashMap<Integer,SearchState>();    // NULL => Unvisited, 0 => Recorded, 1 => Processed
    Queue<Token> tokens = new LinkedList<Token>();
    Token outputToken = null;

    if(name.equals(rootRuleToken.getValue())) { // base case
      return rootRuleToken;
    }

    tokens.add(rootRuleToken);
    visited.put(rootRuleToken.hashCode(), SearchState.RECORDED);

    SEARCH:
    while(!tokens.isEmpty()) {
      Token curToken = tokens.poll();
      for(Token subToken : curToken.getSubTokens()) {
        if(subToken == null) continue;

        if(!visited.containsKey(subToken.hashCode())) {
          if(name.equals(subToken.getValue()) && RuleTokenType.RULE.equals(curToken)) { // Also ensure this is a rule, and not just a reference to a rule
            outputToken = curToken; // this is actually the parent of the token we are looking for. This is just how the rule graph is formatted.
            break SEARCH;
          }

          tokens.add(subToken);
          visited.put(subToken.hashCode(), SearchState.RECORDED);
        }
      }

      visited.put(rootRuleToken.hashCode(), SearchState.PROCESSED);
    }

    if(outputToken == null) {
      throw new UmpleCompilerException("Could not find RuleToken with name, " + name, null);
    }

    return outputToken;
  }


  /**
   * Detects potential cycle in the Scope stack if 'id' is added.
   */
  // line 794 "../../../../src/Generator_CodeUmple.ump"
   private boolean isRecursing(int id){
    Iterator<Scope> it = scopes.iterator();
    while(it.hasNext()) {
      if(it.next().id == id) return true;
    }

    return false;
  }


  /**
   * Wrapper for enterScope below; handles different entries into a new scope depending on whether a
   * rule is anonymous or not.
   */
  // line 808 "../../../../src/Generator_CodeUmple.ump"
   private boolean enterScope(Token ruleNameToken, boolean isOptional){
    boolean recursing = false;
    switch(RuleTokenType.fromToken(ruleNameToken)) {
      case ANONYMOUS_RULE:
        recursing = enterScope((new Random()).nextInt(), this.getScope().isOptional); // select parent's isOptional property
        break;

      default:
        recursing = enterScope(ruleNameToken.getValue().hashCode(), isOptional);
        if(!recursing) this.lastNamedRule = ruleNameToken.getValue();
        break;
    }

    return recursing;
  }


  /**
   * Reset stack of scopes
   */
  // line 828 "../../../../src/Generator_CodeUmple.ump"
   private void resetScopeStack(){
    this.scopes = new ArrayDeque<Scope>();

    // Create root scope (an unnamed, or 'anonymous', scope)
    enterScope(RuleName.NIL.toInt(), false);
  }


  /**
   * Push new scope to Scope Stack
   */
  // line 839 "../../../../src/Generator_CodeUmple.ump"
   private boolean enterScope(int id, boolean isOptional){
    if(isRecursing(id)) return false; // Don't create scope if in cycle

    scopes.addFirst(new Scope(id, isOptional));
    Scope parentScope = this.getParentScope();
    if(parentScope != null) {
      this.getScope().candidateIterators = new HashMap<String,Integer>(parentScope.candidateIterators);
      this.getScope().acceptedIterators = new HashMap<String,Integer>(parentScope.candidateIterators);
    }
    return true;
  }


  /**
   * Exit current scope and combine exiting accepted state with new top-level state in the Scope stack.
   */
  // line 855 "../../../../src/Generator_CodeUmple.ump"
   private double exitScope(){
    handleMutexClause(); // Exiting scope is implicit mutex clause, so we must try to transfer the candidate state to the accepted state

    Scope poppedScope = scopes.removeFirst();
    Scope topScope = scopes.peekFirst();
    if(topScope == null) {
      // A root scope is created when the generator is initialized, and should never be exited.
      throw new UmpleCompilerException("Tried to exit from root scope.", null);
    }

    // Restore scope
    if(poppedScope.acceptedRulesSatisfied > 0 || poppedScope.isOptional == false) {
      topScope.candidateCode.append(poppedScope.acceptedCode.toString());
      topScope.candidateRulesSatisfied += poppedScope.acceptedRulesSatisfied;
      topScope.candidateIterators = new HashMap<String,Integer>(poppedScope.acceptedIterators);
    }

    return poppedScope.acceptedRulesSatisfied;
  }


  /**
   * Wrapper for generateRuleOutput below; this version handles rule modifiers ("RuleModifer" RuleToken).
   * Note: Each RuleToken has an associated RuleName SubToken, generated by the RuleBasedParser. The
   * exception to this is an Anonymous Rule.
   */
  // line 881 "../../../../src/Generator_CodeUmple.ump"
   private void generateRuleOutput(Token elementRootRuleToken, UmpleModel model, Object uElement){
    Token ruleNameToken = elementRootRuleToken;
    RuleModifier ruleModifier = RuleModifier.NIL;

    for(Token subToken : elementRootRuleToken.getSubTokens()) { // Should have 2 subtokens
      if(RuleTokenType.fromToken(subToken) == RuleTokenType.RULE_NAME) {
        ruleNameToken = subToken;
      } else if(RuleModifier.fromToken(subToken) != RuleModifier.NIL) {
        ruleModifier = RuleModifier.fromToken(subToken);
      }
    }

    switch(ruleModifier) {
      case ZERO_TO_MANY:
          double numSatisfied = 0;
          double lastNumSatisfied = 0;
          StringBuilder candidateCode = this.getScope().candidateCode;
          double candidateRulesSatisfied = this.getScope().candidateRulesSatisfied;
          this.getScope().candidateCode = new StringBuilder();
          this.getScope().candidateRulesSatisfied = 0;
          String lastCandidateCode = "";

          for(;;) { // Execute until no progress is made
            numSatisfied = generateRuleOutput(ruleNameToken,ruleModifier,model,uElement);
            if(lastCandidateCode.equals(this.getScope().candidateCode.toString()) || numSatisfied <= 0) break;

            lastNumSatisfied = numSatisfied;
            lastCandidateCode = this.getScope().candidateCode.toString();
            candidateCode.append(lastCandidateCode);
            candidateRulesSatisfied += lastNumSatisfied;
            this.getScope().candidateCode = new StringBuilder();
            this.getScope().candidateRulesSatisfied = 0;
          }
          this.getScope().candidateCode = candidateCode;
          this.getScope().candidateRulesSatisfied = candidateRulesSatisfied;
          break;

      case OPTIONAL:
        generateRuleOutput(ruleNameToken,ruleModifier,model,uElement);
        break;

      default:
        generateRuleOutput(ruleNameToken,ruleModifier,model,uElement);
        break;
    }

    return;
  }


  /**
   * Generate output given a "RuleName" RuleToken (generated by RuleBasedParser).
   * A new scope is created for the rule, but only if the scope isn't already on the Queue stack, in
   * which case there is a cycle and we simply backtrack.
   */
  // line 936 "../../../../src/Generator_CodeUmple.ump"
   private double generateRuleOutput(Token ruleNameToken, RuleModifier ruleModifier, UmpleModel model, Object uContainer){
    if(enterScope(ruleNameToken, (ruleModifier == RuleModifier.OPTIONAL)) == false) { // false => we're in a cycle; exit to avoid reprocessing
      return 0;
    }

    if(RuleTokenType.fromToken(ruleNameToken) == RuleTokenType.ANONYMOUS_RULE) {
        for(Token subToken : ruleNameToken.getSubTokens()) {
          generateRuleTokenOutput(subToken, model, uContainer);
        }
        return exitScope();
    }

    RuleName ruleName = RuleName.fromString(ruleNameToken.getValue());
    this.getScope().candidateCode.append(pad_l(ruleName));
    switch(ruleName) {
      case CONCRETE_METHOD_DECLARATION:
          int curMethod = this.getScope().candidateIterators.get("Method");
          if(curMethod < ((UmpleClass)uContainer).getMethods().size() && ((UmpleClass)uContainer).getMethods().get(curMethod).getSource() != Method.Source.fAutoAPI) {
            this.getParentScope().candidateIterators.put("Method", curMethod+1);
            generateRuleTokenOutput(getRuleTokenByName(ruleNameToken.getValue()), model, ((UmpleClass)uContainer).getMethods().get(curMethod));
          }
        break;

      case PARAMETER:
        int curParam = this.getScope().candidateIterators.get("Parameter");
        if(curParam < ((Method)uContainer).getMethodParameters().size()) {
          this.getScope().candidateIterators.put("Parameter", curParam+1);
          generateRuleTokenOutput(getRuleTokenByName(ruleNameToken.getValue()), model, ((Method)uContainer).getMethodParameters().get(curParam));
        }
        break;

      case ASSOCIATION:
      case INLINE_ASSOCIATION:
        Association[] associations = ((UmpleClass)uContainer).getAssociations();
        HashSet<Integer> processedAssociations = new HashSet<Integer>();
        int curAssoc = this.getScope().candidateIterators.get("Association");

        // Avoid duplicate associations variables, which result from associations between a class and itself
        for(int i = 0; i < curAssoc; ++i) {
           processedAssociations.add(associations[i].getName().hashCode());
        }
        int size = processedAssociations.size();

        for(; curAssoc < associations.length; ++curAssoc) {
          if(!this.rootElementName.equals(associations[curAssoc].getEnds().get(0).getClassName())) continue; // declared in other class

          processedAssociations.add(associations[curAssoc].getName().hashCode());
          if(processedAssociations.size() > size) break;
        }

        if(curAssoc < associations.length) {
          generateRuleTokenOutput(getRuleTokenByName(ruleNameToken.getValue()), model, associations[curAssoc]);
          this.getScope().candidateIterators.put("Association", curAssoc + 1);
        }
        break;

      case SINGLE_ASSOCIATION_END:
      case INLINE_ASSOCIATION_END:
      case ASSOCIATION_END:
        int curAssocEnd = this.getScope().candidateIterators.get("AssociationEnd");
        switch(curAssocEnd) {
          case 0:
            generateRuleTokenOutput(getRuleTokenByName(ruleNameToken.getValue()), model, ((Association)uContainer).getEnds().get(curAssocEnd));
            this.getScope().candidateIterators.put("AssociationEnd", curAssocEnd+1);
            break;

          case 1:
            generateRuleTokenOutput(getRuleTokenByName(ruleNameToken.getValue()), model, ((Association)uContainer).getEnds().get(curAssocEnd));
            this.getScope().candidateIterators.put("AssociationEnd", 0);
            break;

          default:
            // do nothing
        }
        break;

      case EXTERNAL_DEFINITION:
        if(this.getParentScope().id != RuleName.EXTERNAL_DEFINITION.toString().hashCode()) {
          generateRuleTokenOutput(getRuleTokenByName(ruleNameToken.getValue()), model, uContainer);
        } else {
          for(UmpleClass uSubclass : ((UmpleClass)uContainer).getSubclasses()) {
            generateRuleTokenOutput(getRuleTokenByName(RuleName.CLASS_DEFINITION.toString()), model, uSubclass);
          }
        }
        break;

      case CLASS_DEFINITION:
          generateRuleTokenOutput(getRuleTokenByName(ruleNameToken.getValue()), model, uContainer);
        if(this.getParentScope().id != RuleName.CLASS_DEFINITION.toString().hashCode()) {
        } else {
          for(UmpleClass uSubclass : ((UmpleClass)uContainer).getSubclasses()) {
            generateRuleTokenOutput(getRuleTokenByName(RuleName.CLASS_DEFINITION.toString()), model, uSubclass);
          }
        }
        break;

      case CLASS_CONTENT:
        if(this.getParentScope().id != RuleName.EXTERNAL_DEFINITION.toString().hashCode()) {
          generateRuleTokenOutput(getRuleTokenByName(ruleNameToken.getValue()), model, uContainer);
        }
        break;

      case ATTRIBUTE:
        int curAttribute = this.getScope().candidateIterators.get("Attribute");
        if(curAttribute < ((UmpleClass)uContainer).getAttributes().size()) {
          this.getParentScope().candidateIterators.put("Attribute", curAttribute+1);
          generateRuleTokenOutput(getRuleTokenByName(ruleNameToken.getValue()), model, ((UmpleClass)uContainer).getAttributes().get(curAttribute));
        }
        break;

      case SIMPLE_ATTRIBUTE:
      case COMPLEX_ATTRIBUTE:
      case SOFTWARE_PATTERN:
      case IS_A:
      case IS_A_SINGLE:
      case ISA_NAME:
        generateRuleTokenOutput(getRuleTokenByName(ruleNameToken.getValue()), model, uContainer);
        break;
      case ASSOCIATION_DEFINITION:
      case ASSOCIATION_CLASS_DEFINITION:
      case MULTIPLICITY:
      case PARAMETERS:
      case TYPED_NAME:
      case TYPE:
        generateRuleTokenOutput(getRuleTokenByName(ruleNameToken.getValue()), model, uContainer);
        break;
      case PARAMETER_LIST:
      case EXTRA_CODE:
      case METHOD_NAME:
      case METHOD_DECLARATOR:
      case METHOD_BODY:
      case ABSTRACT:
        generateRuleTokenOutput(getRuleTokenByName(ruleNameToken.getValue()), model, uContainer);
        break;

      default:
        // Unimplemented; Ignore
        break;
    }

    this.getScope().candidateCode.append(pad_r(ruleName));
    return exitScope(); // exit scope and return the # of rules satisfied by the scope (acceptedRulesSatisfied)
  }


  /**
   * Selects a best fit output between two mutually exclusive clauses
   */
  // line 1084 "../../../../src/Generator_CodeUmple.ump"
   private void handleMutexClause(){
    Scope scope = this.getScope();

    if(scope.candidateRulesSatisfied > scope.acceptedRulesSatisfied) {
      // Current scope's candidate state replaces the scope's accepted state if
      scope.acceptedRulesSatisfied = scope.candidateRulesSatisfied;
      scope.acceptedCode = scope.candidateCode;
      scope.acceptedIterators = new HashMap<String,Integer>(scope.candidateIterators);
      scope.acceptedFailed = false;
    }

    // Reset state for next iteration
    scope.candidateRulesSatisfied = 0;
    scope.candidateCode = new StringBuilder();
    scope.candidateIterators = new HashMap<String,Integer>(this.getParentScope().candidateIterators);
    scope.candidateFailed = false;
  }


  /**
   * Generate output for Umple Element's using Rule Tokens that are generated by a RuleBasedParser.
   */
  // line 1106 "../../../../src/Generator_CodeUmple.ump"
   private void generateRuleTokenOutput(Token elementRootRuleToken, UmpleModel model, Object uContainer){
    RuleTokenType ruleTokenType = RuleTokenType.fromToken(elementRootRuleToken);
    StringBuilder buffer = this.getScope().candidateCode;

    switch(ruleTokenType) {
      case OPEN_CURL:
        buffer.append(pad(elementRootRuleToken.getValue(), ruleTokenType));
        break;

      case CLOSE_CURL:
        buffer.append(pad(elementRootRuleToken.getValue(), ruleTokenType));
        break;

      case TERMINAL:
        buffer.append(translateTerminal(elementRootRuleToken.getSubTokens().get(0).getValue()));
        buffer.append(Whitespace.SPACE.toString());
        break;

      case TOKEN_NAME:
        buffer.append(getElementProperty(elementRootRuleToken.getValue(), elementRootRuleToken, uContainer));
        break;

      case ANONYMOUS_RULE:
      case OTHER_RULE:
        generateRuleOutput(elementRootRuleToken, model, uContainer); // These are only references; RuleToken be fetched from the rule graph
        break;

      case SEPARATOR:
        handleMutexClause();
        break;

      case LBRACKET:
      case RBRACKET:
      case MODIFIER:
      case RULE:
      case BRACED:
      case TOKEN:
      case DEFINITION:
      case PREMODIFIER:
      case VALUE:
      case VALUE_COLON:
      case RULE_NAME:
        // #460 - now that type is aggregated, the rule needs to be treated similar to a named token
        if (elementRootRuleToken.getValue().equals(RuleName.TYPE.value))
        {
          buffer.append(getElementProperty(elementRootRuleToken.getValue(), elementRootRuleToken, uContainer));
          break;
        }
      default:
        for(Token subToken : elementRootRuleToken.getSubTokens()) {
          generateRuleTokenOutput(subToken, model, uContainer);
        }
        break;
    }
  }


  /**
   * Extracts some property from the input UmpleElement
   * Delegates element-specific requiests to handler for uElement
   * Note: These 'property' methods can be reduced/eliminated if we just hashed properties
   * during the parse stage, rather than creating getters/setters for every property.
   */
  // line 1169 "../../../../src/Generator_CodeUmple.ump"
   private String getElementProperty(String property, Token elementRootRuleToken, Object uContainer){
    String elementProperty = null;

    if(property == null || property.length() == 0) {
      return elementProperty;
    }

    if(uContainer instanceof UmpleClass) {
      elementProperty = getClassProperty(property, elementRootRuleToken, (UmpleClass)uContainer);
    } else if(uContainer instanceof UmpleInterface) {
      elementProperty = getInterfaceProperty(property, elementRootRuleToken, (UmpleInterface)uContainer);
    } else if(uContainer instanceof Method) {
      elementProperty = getMethodProperty(property, elementRootRuleToken, (Method)uContainer);
    } else if(uContainer instanceof MethodParameter) {
      elementProperty = getMethodParameterProperty(property, elementRootRuleToken, (MethodParameter)uContainer);
    } else if(uContainer instanceof AssociationVariable) {
      elementProperty = getAssociationVariableProperty(property, elementRootRuleToken, (AssociationVariable)uContainer);
    } else if(uContainer instanceof Multiplicity) {
      elementProperty = getMultiplicityProperty(property, elementRootRuleToken, (Multiplicity)uContainer);
    } else if(uContainer instanceof Association) {
      elementProperty = getAssociationProperty(property, elementRootRuleToken, (Association)uContainer);
    } else if(uContainer instanceof AssociationEnd) {
      elementProperty = getAssociationEndProperty(property, elementRootRuleToken, (AssociationEnd)uContainer);
    } else if(uContainer instanceof Attribute) {
      elementProperty = getAttributeProperty(property, elementRootRuleToken, (Attribute)uContainer);
    }

    if(!(elementProperty == null || elementProperty.length() == 0)) {
      // A property was successfully retrieved, and hence the current rule has been satisfied.
      this.getScope().candidateRulesSatisfied += 1;
    } else if(!this.getScope().isOptional) {
    }

    return elementProperty;
  }

  // line 1206 "../../../../src/Generator_CodeUmple.ump"
   private String getClassProperty(String property, Token elementRootRuleToken, UmpleClass uClass){
    StringBuilder buffer = new StringBuilder();
    switch(RuleName.fromString(property)) {
      case NAME:
        buffer.append(pad(uClass.getName(), RuleName.NAME, uClass));
        break;

      case ABSTRACT:
        if(uClass.getIsAbstract()) {
          buffer.append(elementRootRuleToken.getValue()); // Abstract keyword
        }
        break;

      case EXTRA_CODE:
        buffer.append(uClass.getExtraCode());
        break;

      case INTERFACE:
        // ignore. This is not an interface. This is for 'externalDefinition'
        break;

      case EXTENDS_NAME:
        int curExtends = this.getScope().candidateIterators.get("Extends");
        if(curExtends == 0 && uClass.getExtendsClass() != null) {
          buffer.append(uClass.getExtendsClass().getName());
          this.getScope().candidateIterators.put("Extends", curExtends+1); //  currently, only 0..1 extensions are allowed
        }
        break;

      default:
        // Property unimplemented; ignore.
        this.getScope().candidateFailed = true;
        break;
    }

    return buffer.toString();
  }

  // line 1245 "../../../../src/Generator_CodeUmple.ump"
   private String getInterfaceProperty(String property, Token elementRootRuleToken, UmpleInterface uInterface){
    StringBuilder buffer = new StringBuilder();
    RuleName ruleName = RuleName.fromString(property);

    switch(ruleName) {
      case NAME:
        buffer.append(pad(uInterface.getName(), ruleName, uInterface));
        break;

      case EXTRA_CODE:
        buffer.append(uInterface.getExtraCode());
        break;

      case INTERFACE:
        buffer.append(elementRootRuleToken.getValue()); // Append interface keyword
        break;

      default:
        // Property unimplemented; ignore.
        break;
    }

    return buffer.toString();
  }

  // line 1271 "../../../../src/Generator_CodeUmple.ump"
   private String getMethodProperty(String property, Token elementRootRuleToken, Method uMethod){
    StringBuilder buffer = new StringBuilder();

    switch(RuleName.fromString(property)) {
      case METHOD_NAME:
        buffer.append(pad(uMethod.getName(), RuleName.NAME, uMethod));
        break;

      case ABSTRACT:
        if(uMethod.getIsAbstract()) {
          buffer.append(pad(elementRootRuleToken.getValue(), RuleName.ABSTRACT, uMethod));
        }
        break;

      case MODIFIER:
        buffer.append(pad(uMethod.getModifier(), RuleName.MODIFIER, uMethod));
        break;

      case TYPE:
        buffer.append(pad(uMethod.getType(), RuleName.TYPE, uMethod));
        break;

      case CODE:
        buffer.append(pad(uMethod.getMethodBody().getExtraCode(), RuleName.CODE, uMethod));
        break;

      default:
        // Property unimplemented; ignore.
        this.getScope().candidateFailed = true;
        break;
    }

    return buffer.toString();
  }

  // line 1307 "../../../../src/Generator_CodeUmple.ump"
   private String getMethodParameterProperty(String property, Token elementRootRuleToken, MethodParameter uMethodParameter){
    StringBuilder buffer = new StringBuilder();

    switch(RuleName.fromString(property)) {
      case TYPE:
        buffer.append(pad(uMethodParameter.getType(), RuleName.TYPE, uMethodParameter));
        break;

      case NAME:
        buffer.append(pad(uMethodParameter.getName(), RuleName.NAME, uMethodParameter));
        break;

      default:
        // Property unimplemented; ignore.
        break;
    }

    return buffer.toString();
  }

  // line 1328 "../../../../src/Generator_CodeUmple.ump"
   private String getAssociationProperty(String property, Token elementRootRuleToken, Association uAssociation){
    StringBuilder buffer = new StringBuilder();

    switch(RuleName.fromString(property)) {
      case NAME:
        buffer.append(pad(uAssociation.getName(), RuleName.NAME, uAssociation));
        break;

      case ARROW:
        buffer.append(pad(uAssociation.getArrowString(), RuleName.ARROW, uAssociation)); /* This would be translated for different languages */
        break;

      default:
        // Property unimplemented; ignore.
        this.getScope().candidateFailed = true;
        break;
    }

    return buffer.toString();
  }

  // line 1350 "../../../../src/Generator_CodeUmple.ump"
   private String getAssociationVariableProperty(String property, Token elementRootRuleToken, AssociationVariable uAssociationVariable){
    StringBuilder buffer = new StringBuilder();

    switch(RuleName.fromString(property)) {
      case NAME:
        buffer.append(pad(uAssociationVariable.getName(), RuleName.NAME, uAssociationVariable));
        break;

      default:
        // Property unimplemented; ignore.
        this.getScope().candidateFailed = true;
        break;
    }

    return buffer.toString();
  }

  // line 1368 "../../../../src/Generator_CodeUmple.ump"
   private String getAssociationEndProperty(String property, Token elementRootRuleToken, AssociationEnd uAssociationEnd){
    StringBuilder buffer = new StringBuilder();

    switch(RuleName.fromString(property)) {
      case TYPE:
        buffer.append(pad(uAssociationEnd.getClassName(), RuleName.TYPE, uAssociationEnd));
        break;

      case BOUND:
        if(uAssociationEnd.getMultiplicity().getBound() == null ) {
          break;
        }

        buffer.append(pad(uAssociationEnd.getMultiplicity().getBound().toString(), RuleName.BOUND, uAssociationEnd));
        break;

      case LOWER_BOUND:
        if(uAssociationEnd.getMultiplicity().getLowerBound() != uAssociationEnd.getMultiplicity().getUpperBound()) {
          buffer.append(pad(uAssociationEnd.getMultiplicity().getRangeParts()[0], RuleName.TYPE, uAssociationEnd));
        }
        break;

      case UPPER_BOUND:
        if(uAssociationEnd.getMultiplicity().getLowerBound() != uAssociationEnd.getMultiplicity().getUpperBound()) {
          buffer.append(pad(uAssociationEnd.getMultiplicity().getRangeParts()[1], RuleName.TYPE, uAssociationEnd));
        }
        break;

      case ROLE_NAME:
        buffer.append(pad(uAssociationEnd.getRoleName(), RuleName.TYPE, uAssociationEnd));
        break;

      default:
        // Property unimplemented; ignore.
        this.getScope().candidateFailed = true;

        break;
    }

    return buffer.toString();
  }

  // line 1411 "../../../../src/Generator_CodeUmple.ump"
   private String getMultiplicityProperty(String property, Token elementRootRuleToken, Multiplicity uMultiplicity){
    StringBuilder buffer = new StringBuilder();

    switch(RuleName.fromString(property)) {
      case LOWER_BOUND:
        buffer.append(pad(uMultiplicity.getRangeParts()[0], RuleName.TYPE, uMultiplicity));
        break;

      case UPPER_BOUND:
        buffer.append(pad(uMultiplicity.getRangeParts()[1], RuleName.TYPE, uMultiplicity));
        break;

      default:
        // Property unimplemented; ignore.
        this.getScope().candidateFailed = true;

        break;
    }

    return buffer.toString();
  }

  // line 1434 "../../../../src/Generator_CodeUmple.ump"
   private String getAttributeProperty(String property, Token elementRootRuleToken, Attribute uAttribute){
    StringBuilder buffer = new StringBuilder();

    switch(RuleName.fromString(property)) {
      case TYPE:
        buffer.append(pad(uAttribute.getType(), RuleName.TYPE, uAttribute));
        break;

      case MODIFIER:
        buffer.append(pad(uAttribute.getModifier(), RuleName.MODIFIER, uAttribute));
        break;

      case NAME:
        buffer.append(pad(uAttribute.getName(), RuleName.NAME, uAttribute));
        break;

      case VALUE:
        buffer.append(pad(uAttribute.getValue(), RuleName.VALUE, uAttribute));
        break;

      default:
        //this.getScope().candidateFailed = true;
        break;
    }

    return buffer.toString();
  }


  /**
   * Pad token value with whitespace
   * - Note: This is implementation allows whitespace to be easily configurable to address different coding practices/languages.
   * - Note: Protected so that space-delimited languages can override.
   */
  // line 1468 "../../../../src/Generator_CodeUmple.ump"
   protected String pad(String input, RuleName ruleName, Object uContainer){
    StringBuilder buffer = new StringBuilder();
    String lpad = "", rpad = "";

    switch(ruleName) {
      case MODIFIER:
        for(int i = 0; i < this.indent; ++i) buffer.append(Whitespace.TAB.toString());  // Add indents for current frame of reference
        lpad = Whitespace.NIL.toString();
        rpad = Whitespace.SPACE.toString();
        break;

      case CODE:
        for(int i = 0; i < this.indent; ++i) buffer.append(Whitespace.TAB.toString());  // Add indents for current frame of reference

        // Remove auto-indent from parse stage
        input = input.replaceAll(Whitespace.NL.toString() + Whitespace.TAB.toString(), Whitespace.NL.toString());

        // Add indentation for current frame of reference
        input = input.replaceAll(Whitespace.NL.toString(), Whitespace.NL.toString() + buffer.toString());
        rpad = Whitespace.NL.toString();
        break;

      case ATTRIBUTE:
        rpad = Whitespace.NL.toString();
        break;

      default:
        lpad += Whitespace.NIL.toString();
        rpad += Whitespace.SPACE.toString();
    }

    buffer.append(lpad);
    buffer.append(input);
    buffer.append(rpad);

    return buffer.toString();
  }


  /**
   * Padding for token types, as generated by the RuleBasedProcessor
   * Note: Protected so that space-delimited languages can override.
   */
  // line 1511 "../../../../src/Generator_CodeUmple.ump"
   protected String pad(String input, RuleTokenType ruleTokenType){
    StringBuilder buffer = new StringBuilder();
    String lpad, rpad;

    switch(ruleTokenType) {
      case CLOSE_CURL:
        this.indent--;
        lpad = Whitespace.NIL.toString();
        for(int i = 0; i < this.indent; ++i) lpad += Whitespace.TAB.toString();  // Add indents for current frame of reference
        rpad = Whitespace.NL.toString() + Whitespace.NL.toString();
        break;

      case OPEN_CURL:
        lpad = Whitespace.NIL.toString();
        rpad = Whitespace.NL.toString();
        this.indent++;
        break;

      default:
        lpad = Whitespace.NIL.toString();
        rpad = Whitespace.SPACE.toString();
    }

    buffer.append(lpad);
    buffer.append(input);
    buffer.append(rpad);

    return buffer.toString();
  }

  // line 1542 "../../../../src/Generator_CodeUmple.ump"
   protected String pad_l(RuleName ruleName){
    StringBuilder buffer = new StringBuilder();

    switch(ruleName) {
      case ATTRIBUTE:
      case SOFTWARE_PATTERN:
      case EXTERNAL_DEFINITION:
      case CLASS_DEFINITION:
      case INTERFACE_DEFINITION:
      case INLINE_ASSOCIATION:
        for(int i = 0; i < this.indent; ++i) buffer.append(Whitespace.TAB.toString());  // Add indents for current frame of reference
        break;

      default:
        // do nothing
    }

    return buffer.toString();
  }

  // line 1563 "../../../../src/Generator_CodeUmple.ump"
   protected String pad_r(RuleName ruleName){
    StringBuilder buffer = new StringBuilder();

    switch(ruleName) {
      case IS_A_SINGLE:
      case ASSOCIATION:
      case INLINE_ASSOCIATION:
      case SIMPLE_ATTRIBUTE:
      case COMPLEX_ATTRIBUTE:
        buffer.append(Whitespace.NL.toString());
        break;
      default:
        // do nothing
    }

    return buffer.toString();
  }


  /**
   * Translates terminals using the TokenType catalogue
   */
  // line 1586 "../../../../src/Generator_CodeUmple.ump"
   private String translateTerminal(String terminal){
    TerminalType translation = TerminalType.fromString(terminal);
    return translation != TerminalType.NIL ? translation.getTranslation() : terminal;
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 50 "../../../../src/Generator_CodeUmple.ump"
  private static Map<String,ChoiceRule> ruleCache = new HashMap<String,ChoiceRule>() ;
// line 51 "../../../../src/Generator_CodeUmple.ump"
  private static Map<String,Token> tokenCache = new HashMap<String,Token>() ;
// line 52 "../../../../src/Generator_CodeUmple.ump"
  private static RuleBasedParser parser = null ;
// line 53 "../../../../src/Generator_CodeUmple.ump"
  private static GrammarAnalyzer analyzer = null ;
// line 54 "../../../../src/Generator_CodeUmple.ump"
  private static Token rootRuleToken = null ;
// line 55 "../../../../src/Generator_CodeUmple.ump"
  private static ChoiceRule rootRule = null ;

// line 60 "../../../../src/Generator_CodeUmple.ump"
  private enum Whitespace 
  {
    NIL(0, ""),
    SPACE(1, " "),
    TAB(2, "    "), // use 4 spaces instead of a TAB (\t)
    NL(3, "\n"),
    CRLF(4, "\r\n"),
    LFCR(5, "\n\r");

    private int id;
    private String value;

    private Whitespace(int id, String value)
    {
      this.id = id;
      this.value = value;
    }

    public int toInt()
    {
      return this.id;
    }

    public String toString()
    {
      return this.value;
    }
  }

// line 91 "../../../../src/Generator_CodeUmple.ump"
  private enum TerminalType 
  {
    NIL(0, "", ""),
    LPAREN(1, "OPEN_ROUND_BRACKET", "("),
    RPAREN(2, "CLOSE_ROUND_BRACKET", ")"),
    COMMA(3, "COMMA", ",");

    private int id;
    private String value;
    private String translation;
    private static final Map<String,TerminalType> strDict = new HashMap<String,TerminalType>();

    /*
     * Primarily used for dynamic typecasting
     */
    static
    {
        for(TerminalType t : EnumSet.allOf(TerminalType.class)) {
            strDict.put(t.toString(), t);
        }
    }

    public static TerminalType fromString(String t)
    {
      return strDict.containsKey(t) ? strDict.get(t) : NIL;
    }

    private TerminalType(int id, String value, String translation)
    {
      this.id = id;
      this.value = value;
      this.translation = translation;
    }

    public int toInt()
    {
      return this.id;
    }

    public String toString()
    {
      return this.value;
    }

    public String getTranslation()
    {
      return this.translation;
    }
  }

// line 143 "../../../../src/Generator_CodeUmple.ump"
  private enum RuleTokenType 
  {
    NIL(0, ""),
    LBRACKET(2, "["),
    RBRACKET(3, "]"),
    ANONYMOUS_RULE(4, "anonymousRule"),
    BRACED(5, "braced"),
    CLOSE_CURL(6, "closecurl"),
    DEFINITION(7, "definition"),
    MODIFIER(8, "modifier"),
    OPEN_CURL(9, "opencurl"),
    OTHER_RULE(10, "otherrule"),
    PREMODIFIER(11, "premodifier"),
    RULE(12, "rule"),
    RULE_NAME(13, "rulename"),
    SEPARATOR(14, "separator"),
    TERMINAL(15, "terminal"),
    TOKEN(16, "token"),
    TOKEN_NAME(17, "tokenname"),
    VALUE(18, "value"),
    VALUE_COLON(19, "valuecolon");

    private int id;
    private String value;
    private static final Map<String,RuleTokenType> strDict = new HashMap<String,RuleTokenType>();

    /*
     * Primarily used for dynamic typecasting
     */
    static
    {
        for(RuleTokenType t : EnumSet.allOf(RuleTokenType.class)) {
            strDict.put(t.toString(), t);
        }
    }

    public static RuleTokenType fromToken(Token t)
    {
      return strDict.containsKey(t.getName()) ? strDict.get(t.getName()) : NIL;
    }

    private RuleTokenType(int id, String value)
    {
      this.id = id;
      this.value = value;
    }

    public int toInt()
    {
      return this.id;
    }

    public String toString()
    {
      return this.value;
    }

    public boolean equals(Token t)
    {
      return this.value.equals(t.getName());
    }
  }

// line 208 "../../../../src/Generator_CodeUmple.ump"
  private enum RuleModifier 
  {
    NIL(0, ""),
    ZERO_TO_MANY(1,"*"),
    OPTIONAL(2,"?"),
    EXTERNAL(3, "external");

    private int id;
    private String value;
    private static final Map<String,RuleModifier> strDict = new HashMap<String,RuleModifier>();

    /*
     * Primarily used for dynamic typecasting
     */
    static
    {
        for(RuleModifier t : EnumSet.allOf(RuleModifier.class)) {
            strDict.put(t.toString(), t);
        }
    }

    public static RuleModifier fromToken(Token t)
    {
      return strDict.containsKey(t.getValue()) ? strDict.get(t.getValue()) : NIL;
    }

    private RuleModifier(int id, String value)
    {
      this.id = id;
      this.value = value;
    }

    public int toInt()
    {
      return this.id;
    }

    public String toString()
    {
      return this.value;
    }
  }

// line 258 "../../../../src/Generator_CodeUmple.ump"
  private enum RuleName 
  {
    NIL(0, ""),
    ANONYMOUS(1, "anonymousRule"), // Implicit definition; Not defined in the grammar
    NAME(100,"name"),
    ABSTRACT(101,"abstract"),
    VALUE(102,"value"),
    CLASS_DEFINITION(200,"classDefinition"),
    CLASS_CONTENT(201, "classContent"),
    ISA_NAME(202, "isAName"),
    EXTENDS_NAME(203, "extendsName"),
    SOFTWARE_PATTERN(250, "softwarePattern"),
    IS_A(251, "isA"),
    IS_A_SINGLE(252, "singleIsA"),
    EXTERNAL_DEFINITION(210, "externalDefinition"),
    INTERFACE_DEFINITION(300,"interfaceDefinition"),
    INTERFACE_MEMBER_DEFINITION(301, "interfaceMemberDeclaration"),
    CONCRETE_METHOD_DECLARATION(400, "concreteMethodDeclaration"),
    METHOD_DECLARATOR(401, "methodDeclarator"),
    METHOD_NAME(404, "methodName"),
    MODIFIER(405, "modifier"),
    PARAMETER(545, "parameter"),
    PARAMETER_LIST(546, "parameterList"),
    PARAMETERS(547, "parameters"),
    TYPED_NAME(576, "typedName"),
    TYPE(577, "type"),
    EXTRA_CODE(578, "extraCode"),
    CODE(579, "code"),
    METHOD_BODY(580, "methodBody"),
    ASSOCIATION(600, "association"),
    ASSOCIATION_DEFINITION(610, "associationDefinition"),
    ASSOCIATION_CLASS_DEFINITION(611, "associationClassDefinition"),
    INLINE_ASSOCIATION(620, "inlineAssociation"),
    INLINE_ASSOCIATION_END(621, "inlineAssociationEnd"),
    ASSOCIATION_END(622, "associationEnd"),
    SINGLE_ASSOCIATION_END(623, "singleAssociationEnd"),
    MULTIPLICITY(630, "multiplicity"),
    BOUND(650, "bound"),
    LOWER_BOUND(651, "lowerBound"),
    UPPER_BOUND(652, "upperBound"),
    ROLE_NAME(653, "roleName"),
    ARROW(654, "arrow"),
    INTERFACE(655, "interface"),
    ATTRIBUTE(700, "attribute"),
    SIMPLE_ATTRIBUTE(701, "simpleAttribute"),
    COMPLEX_ATTRIBUTE(702, "complexAttribute");

    private int id;
    private String value;
    private static final Map<String,RuleName> strDict = new HashMap<String,RuleName>();

    /*
     * Primarily used for dynamic typecasting
     */
    static
    {
        for(RuleName t : EnumSet.allOf(RuleName.class)) {
            strDict.put(t.toString(), t);
        }
    }

    private RuleName(int id, String value)
    {
      this.id = id;
      this.value = value;
    }

    public int toInt()
    {
      return this.id;
    }

    public String toString()
    {
      return this.value;
    }

    public boolean equals(String testVal)
    {
      return this.value.equals(testVal);
    }

    public static RuleName fromString(String s)
    {
      return strDict.containsKey(s) ? strDict.get(s) : NIL;
    }
  }
// line 348 "../../../../src/Generator_CodeUmple.ump"
  private enum SearchState {RECORDED, PROCESSED};
// line 387 "../../../../src/Generator_CodeUmple.ump"
  private Deque<Scope> scopes = new ArrayDeque<Scope>() ;
// line 388 "../../../../src/Generator_CodeUmple.ump"
  private int indent = 0 ;
// line 389 "../../../../src/Generator_CodeUmple.ump"
  private String rootElementName = "" ;
// line 390 "../../../../src/Generator_CodeUmple.ump"
  private String lastNamedRule = "" ;

  
}