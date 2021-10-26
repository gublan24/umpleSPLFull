/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.testparser;
import java.io.File;
import cruise.umple.*;
import cruise.umple.parser.Token;
import cruise.umple.parser.analysis.RuleBasedParser;
import cruise.umple.parser.ParseResult;
import cruise.umple.testgenerator.*;
import cruise.umple.testgenerator.Depend;
import java.util.*;

// line 4 "../../../../ump/mbt_parser_src.ump"
public class TestParser
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TestParser Attributes
  private boolean shouldProcessAgain;
  private RuleBasedParser mbt;
  private ParseResult parseResult;
  private String grammarFile;
  private File testModelFile;
  private TestModel aTestModel;
  private int locOrder;

  //TestParser Associations
  private List<Depend> depends;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TestParser(ParseResult aParseResult, String aGrammarFile, File aTestModelFile, int aLocOrder)
  {
    shouldProcessAgain = false;
    mbt = new RuleBasedParser();
    parseResult = aParseResult;
    grammarFile = aGrammarFile;
    testModelFile = aTestModelFile;
    aTestModel = new TestModel(null, null, null, null, null, null, null, null);
    locOrder = aLocOrder;
    depends = new ArrayList<Depend>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setShouldProcessAgain(boolean aShouldProcessAgain)
  {
    boolean wasSet = false;
    shouldProcessAgain = aShouldProcessAgain;
    wasSet = true;
    return wasSet;
  }

  public boolean setMbt(RuleBasedParser aMbt)
  {
    boolean wasSet = false;
    mbt = aMbt;
    wasSet = true;
    return wasSet;
  }

  public boolean setParseResult(ParseResult aParseResult)
  {
    boolean wasSet = false;
    parseResult = aParseResult;
    wasSet = true;
    return wasSet;
  }

  public boolean setGrammarFile(String aGrammarFile)
  {
    boolean wasSet = false;
    grammarFile = aGrammarFile;
    wasSet = true;
    return wasSet;
  }

  public boolean setTestModelFile(File aTestModelFile)
  {
    boolean wasSet = false;
    testModelFile = aTestModelFile;
    wasSet = true;
    return wasSet;
  }

  public boolean setATestModel(TestModel aATestModel)
  {
    boolean wasSet = false;
    aTestModel = aATestModel;
    wasSet = true;
    return wasSet;
  }

  public boolean setLocOrder(int aLocOrder)
  {
    boolean wasSet = false;
    locOrder = aLocOrder;
    wasSet = true;
    return wasSet;
  }

  public boolean getShouldProcessAgain()
  {
    return shouldProcessAgain;
  }

  public RuleBasedParser getMbt()
  {
    return mbt;
  }

  public ParseResult getParseResult()
  {
    return parseResult;
  }

  /**
   * List<String> depends;
   */
  public String getGrammarFile()
  {
    return grammarFile;
  }

  public File getTestModelFile()
  {
    return testModelFile;
  }

  public TestModel getATestModel()
  {
    return aTestModel;
  }

  public int getLocOrder()
  {
    return locOrder;
  }
  /* Code from template association_GetMany */
  public Depend getDepend(int index)
  {
    Depend aDepend = depends.get(index);
    return aDepend;
  }

  public List<Depend> getDepends()
  {
    List<Depend> newDepends = Collections.unmodifiableList(depends);
    return newDepends;
  }

  public int numberOfDepends()
  {
    int number = depends.size();
    return number;
  }

  public boolean hasDepends()
  {
    boolean has = depends.size() > 0;
    return has;
  }

  public int indexOfDepend(Depend aDepend)
  {
    int index = depends.indexOf(aDepend);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDepends()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addDepend(Depend aDepend)
  {
    boolean wasAdded = false;
    if (depends.contains(aDepend)) { return false; }
    TestParser existingTestParser = aDepend.getTestParser();
    if (existingTestParser == null)
    {
      aDepend.setTestParser(this);
    }
    else if (!this.equals(existingTestParser))
    {
      existingTestParser.removeDepend(aDepend);
      addDepend(aDepend);
    }
    else
    {
      depends.add(aDepend);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeDepend(Depend aDepend)
  {
    boolean wasRemoved = false;
    if (depends.contains(aDepend))
    {
      depends.remove(aDepend);
      aDepend.setTestParser(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDependAt(Depend aDepend, int index)
  {  
    boolean wasAdded = false;
    if(addDepend(aDepend))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDepends()) { index = numberOfDepends() - 1; }
      depends.remove(aDepend);
      depends.add(index, aDepend);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDependAt(Depend aDepend, int index)
  {
    boolean wasAdded = false;
    if(depends.contains(aDepend))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDepends()) { index = numberOfDepends() - 1; }
      depends.remove(aDepend);
      depends.add(index, aDepend);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDependAt(aDepend, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !depends.isEmpty() )
    {
      depends.get(0).setTestParser(null);
    }
  }

  // line 29 "../../../../ump/mbt_parser_src.ump"
   public static  void init(){
    
  }

  // line 33 "../../../../ump/mbt_parser_src.ump"
   public void analyzeAllTokens(Token rootToken){
    int analysisStep = 0;
	    shouldProcessAgain = true;
	    analyzeModel(rootToken,analysisStep);
	    do
	    {
	      analysisStep += 1;
	      shouldProcessAgain = false;
	      for(Token t : rootToken.getSubTokens())
	      {
	    	  
	    	  if(t.getName().equals("generate"))
		    	 {
		    		 analyzeGenerate(t,analysisStep);
		    	 }
	    	  
	    	 if(t.getName().equals("depend"))
	    	 {
	    		 analyzeDepend(t,analysisStep);
	    	 }
	    	 
	    	 
	    	 if(t.getName().equals("model"))
	    	 {
	    		 analyzeModel(t,analysisStep);
	    	 }
	    	 
	    	 if(t.getName().equals("givenContent"))
	    	 {
	    		 analyzeGiven(t,analysisStep);
	    	 }
	    	 
	    	 if(t.getName().equals("givenUmpleModel"))
	    	 {
	    		 analyzeGivenModel(t,analysisStep);
	    	 }
	    	 
	    	 if(t.getName().equals("whenCont"))
	    	 {
	    		 analyzeWhen(t,analysisStep);
	    	 }
	    	 
	    	 if(t.getName().equals("parameter"))
	    	 {
	    		 analyzeParameter(t,analysisStep);
	    	 }
	    	 
	    	 if(t.getName().equals("thenCont"))
	    	 {
	    		 analyzeThen(t,analysisStep);
	    	 }
	    	  
	    	  
	        /*if (!getParseResult().getWasSuccess())
	        {
	          return;
	        }*/
	      }
	    }
	    while (shouldProcessAgain);
  }

  // line 97 "../../../../ump/mbt_parser_src.ump"
   private void analyzeAssertEqual(Token t, int analysisStep, TestCase aTestCase, int aLocOrder){
    ////system.out.println("EqualAnalysis");
	  Token ts = t.getSubToken("assertEqualCode");
	  String assertCode = analyzeAssertEqualCode(ts, analysisStep);
	  //assertCode = ts.getValue("objectName1") +","+ts.getValue("objectName2");
	  aTestCase.addAssertion(new Assertion("AssertEqual", null, null, "equal", assertCode,null, null, locOrder));
	  //system.out.println("\t\tEquLOC");
		//system.out.println(locOrder);
	  locOrder++;
  }

  // line 109 "../../../../ump/mbt_parser_src.ump"
   private void analyzeAction(Token token, int analysisStep, TestCase aTestCase, int locOrder2){
    // TODO Analyze test actions statement
	  
	  String code = ""; 
	
	  for (Token subToken : token.getSubTokens())
	  {
		  if(subToken.getName().equals("objectName"))
		  {
			  code += subToken.getValue();
		  }
		  
		  if(subToken.getName().equals("code"))
		  {
			  code += subToken.getValue();
		  }
		  
		  if(subToken.getName().equals("."))
		  {
			  code += ".";
		  }
		  
	  }
	  
	  Action ac = new Action("", code, locOrder);
	  aTestCase.addAction(ac);
  }

  // line 137 "../../../../ump/mbt_parser_src.ump"
   private void analyzeTestInitAttribute(Token token, int analysisStep, TestCase aTestCase, int locOrder2){
    // TODO analyze attribute initialization 
	Action ta = new Action ("initAtt", "", locOrder);
	String code = "";
	  for (Token subToken : token.getSubTokens())
	  {
		  if (subToken.getName().equals("identifier"))
		  { code += subToken.getValue("identifier"); }
		  if (subToken.getName().equals("attributeName"))
		  { code += " "+subToken.getValue("attributeName") + ""; }
		  
		  if (subToken.getName().equals("name"))
		  { code += " "+subToken.getValue("name") + ""; }
		  
		  if (subToken.getName().equals("code"))
		  { code += " "+subToken.getValue("code") + ""; }
		  
		  if (subToken.getName().equals("\""))
		  { code += "\"" ; }
		  
		  if (subToken.getName().equals("="))
		  { code += "=" ; }
		  
		  if (subToken.getName().equals(";"))
		  { code += ";"; }
	  }
	  ta.setCode(code);
	  aTestCase.addAction(ta);
	  locOrder++;
  }

  // line 169 "../../../../ump/mbt_parser_src.ump"
   private String analyzeAssertEqualCode(Token t, int analysisStep){
    String assertCode="";
	  String methodCallCode = "";
	  boolean isFirstObj = true;
	  boolean isFirstMethod = true;
	  for (Token tss : t.getSubTokens())
	  {
		  ////system.out.println("EqToken");
		  ////system.out.println(t.getName());		  
			if (tss.getName().equals("objectName1")) {
				if (aTestModel.getCodeLang().equals("PhpUnit")) {
					assertCode += "$" + tss.getValue();
				} 
				else if (aTestModel.getCodeLang().equals("RubyUnit")) {
					assertCode += tss.getValue();
				}
				else {
					assertCode += tss.getValue();
				}
				isFirstObj = true;
			}
			
			if (tss.getName().equals("objectName2")) {
				if (aTestModel.getCodeLang().equals("PhpUnit")) {
					assertCode += "$" + tss.getValue();
				} else if (aTestModel.getCodeLang().equals("RubyUnit")) {
						assertCode += "(" + tss.getValue() + ")";
					}
				else {
					assertCode += tss.getValue();
				}

				isFirstObj = false;

			}
			
		  if (tss.getName().equals(".")){ 
			  
				  if (aTestModel.getCodeLang().equals("PhpUnit"))
				  {
					  assertCode += "->";
				  }
				  else
				  {
				
					  assertCode += tss.getName();
				
				  }
			  }
		  if (tss.getName().equals("assertEqualMethodCall")) {
			  
			  for (Token sbt : tss.getSubTokens())
			  {
				  if(sbt.getName().equals("methodName")) {
					  if (aTestModel.getCodeLang().equals("RubyUnit") && (sbt.getValue().contains("get") || sbt.getValue().subSequence(0, 3).equals("set")))
					  {
						String dashedMethod = sbt.getValue().substring(0, 3) + "_" + sbt.getValue().substring(3, 4).toLowerCase() +sbt.getValue().substring(4, sbt.getValue().length());  
						methodCallCode+=dashedMethod;
					  }
					  
					  else if (aTestModel.getCodeLang().equals("RubyUnit") && sbt.getValue().contains("reset") )
					  {
						String dashedMethod = sbt.getValue().substring(0, 5) + "_" + sbt.getValue().substring(5, 6).toLowerCase() +sbt.getValue().substring(6, sbt.getValue().length());  
						methodCallCode+=dashedMethod;
					  }
					  else{
						  methodCallCode+=sbt.getValue();
					  }
					  }
				  if (sbt.getName().equals("(")){ 
					  if (aTestModel.getCodeLang().equals("RubyUnit"))
					  {
						  methodCallCode += "";
					  }
					  else{
						  methodCallCode += sbt.getName();
					  }
						  }
				  if (sbt.getName().equals(")")){
					  if (aTestModel.getCodeLang().equals("RubyUnit"))
					  {
						  methodCallCode += "";
					  }
					  else{
						  methodCallCode += sbt.getName();
					  }
					  }
			  }
			  if (aTestModel.getCodeLang().equals("RubyUnit") && (!isFirstObj))
			  {
				  assertCode = assertCode.substring(0, assertCode.length()-2);
				  assertCode += "."+methodCallCode + ")";
				  isFirstMethod = true;
			  }
			  else{
				  
				  assertCode += methodCallCode;
				  isFirstMethod = false;
			  }
			  
			  methodCallCode="";

			}
		  if (tss.getName().equals(",")){ 
			  if (aTestModel.getCodeLang().equals("RubyUnit"))
			  {
				  assertCode += ".equal?";
			  }
			  else {
				  assertCode += tss.getName();  
			  }
			  isFirstObj = false;
		  }
		   
		   
		  if (tss.getName().equals("(")){ assertCode += tss.getName();}
		  if (tss.getName().equals(")")){ assertCode += tss.getName();}
		  //if (tss.getName().equals("objectName") ) { assertCode += tss.getValue(); }
		  //if (tss.getName().equals("objectName") ) { assertCode += tss.getValue(); }
		  	  
	  }
	  
	  return assertCode;
  }

  // line 295 "../../../../ump/mbt_parser_src.ump"
   private void analyzeAssertFalse(Token t, int analysisStep, TestCase aTestCase, int aLocOrder){
    String assertCode = analyzeAssertCode(t, analysisStep, null);
	aTestCase.addAssertion(new Assertion("AssertFalse", null, null, "equal", assertCode,null, null, locOrder));
	//system.out.println("\t\tFalseLOC");
	//system.out.println(locOrder);
	locOrder++;
  }

  // line 303 "../../../../ump/mbt_parser_src.ump"
   private void analyzeAssertTrue(Token t, int analysisStep, TestCase aTestCase, int aLocOrder){
    String assertCode = analyzeAssertCode(t, analysisStep, null);
	aTestCase.addAssertion(new Assertion("AssertTrue", null, null, "equal", assertCode,null, null, locOrder));
	//system.out.println("\t\tTrueLOC");
	//system.out.println(locOrder);
	locOrder++;
  }

  // line 313 "../../../../ump/mbt_parser_src.ump"
   private void analyzeGenerate(Token t, int analysisStep){
    //setting the target platform
	//system.out.println(t.getValue("codeLang"));
	aTestModel.setCodeLang(t.getValue("codeLang"));
  }

  // line 321 "../../../../ump/mbt_parser_src.ump"
   private String analyzeAssertCode(Token st, int analysisStep, Assertion as){
    String assertCode="";
	String methodCallCode="";
	boolean isFirst = true;

		for (Token sst: st.getSubTokens())
		{
			if (sst.getName().equals("methodCall"))
			{
				methodCallCode = analyzeMethodCall(sst, analysisStep, as);
				assertCode+= methodCallCode;
			}
			
			else if (sst.getName().equals("compValue"))
			{
				////system.out.println("compV");
				////system.out.println(sst.getValue());
				if (aTestModel.getCodeLang().equals("RubyUnit") )
				 {
					if (sst.getValue().contains("null"))
						assertCode+= sst.getValue().replace("null", "nil");
					else {
						assertCode+= sst.getValue();
					}
				 }
				else {
					assertCode+= sst.getValue();
				}
			}
			
			else if (sst.getName().equals("==") || sst.getName().equals("!="))
			{
				assertCode+= sst.getName();				
			}
			
			else{				
			assertCode += sst.getName();
			}
		}
	 
	
		
	
	
return assertCode;
  }

  // line 368 "../../../../ump/mbt_parser_src.ump"
   private String analyzeMethodCall(Token t, int analysisStep, Assertion as){
    String code="";
	boolean isFirst = true;
	
	for (Token st: t.getSubTokens())
	{
		////system.out.println(st.getName());
		
		if (st.getName().equals("objectName"))
		{

			if (aTestModel.getCodeLang().equals("PhpUnit"))
			{
				////system.out.println("codeLangforPhp");
				////system.out.println(aTestModel.getCodeLang());
				// Injecting '$' sign for Php objectName tokens.
				code += ("$" + st.getValue());
			}
			else
			{
				code += st.getValue();
			}
		}
		
		if (st.getName().equals("."))
		{
			if (aTestModel.getCodeLang().equals("PhpUnit"))
			{
				// replacing method call for PhpUnit with '->'
				code += "->";
			}
			else
			{
				code += st.getName();
			}
		}
		
		if (st.getName().equals("methodName"))
		{
			if (aTestModel.getCodeLang().equals("RubyUnit") && (st.getValue().contains("get") || st.getValue().subSequence(0, 3).equals("set")))
			  {
				String dashedMethod = st.getValue().substring(0, 3) + "_" + st.getValue().substring(3, 4).toLowerCase() +st.getValue().substring(4, st.getValue().length());  
				code+=dashedMethod;
			  }
			else if (aTestModel.getCodeLang().equals("RubyUnit") && st.getValue().contains("reset") )
			  {
				String dashedMethod = st.getValue().substring(0, 5) + "_" + st.getValue().substring(5, 6).toLowerCase() +st.getValue().substring(6, st.getValue().length());  
				code+=dashedMethod;
			  }
			  else{
				  code += st.getValue();
			  }
			
		}
		
		if (st.getName().equals("("))
		{
			if(aTestModel.getCodeLang().equals("RubyUnit"))
			{
				code += "";
			}
			
			else{
				code += st.getName();
			}
		}
		
		if (st.getName().equals("assertParameter"))
		{
			String parameterCode="";
		    Token sst = st.getSubToken("assertParameter"); 
			for (Token sbt : sst.getSubTokens())
			{
			 parameterCode += sbt.getValue();
			 ////system.out.println("parCode");
			 ////system.out.println(parameterCode);
			}
			code+= parameterCode;
			
		}
		
		if (st.getName().equals(")"))
		{
			if(aTestModel.getCodeLang().equals("RubyUnit"))
			{
				code += "";
			}
			
			else{
				code += st.getName();
			}
		}
		
		if (st.getName().equals(";"))
		{
			code += ";";
		}

		
		
	}
	////system.out.println("MethodCode");
	////system.out.println(code+";");
	return code;
  }

  // line 475 "../../../../ump/mbt_parser_src.ump"
   private void analyzeAssertions(Token t, int analysisStep, TestCase aTestCase, int aLocOrder){
    Assertion as = new Assertion(t.getValue("assertType"),"", "", "", "", "", "", locOrder);
	   String code="";
	   String assertCode="";
	  for ( Token st : t.getSubTokens())
		
	{		  		  
		  if (st.getName().equals("assertCode"))
		  {
			  assertCode = analyzeAssertCode(st, analysisStep, as);
		  }		  		  	
	}
	  as.setAssertCode(assertCode);	  
	  aTestCase.addAssertion(as);
	  locOrder++;
  }

  // line 495 "../../../../ump/mbt_parser_src.ump"
   private void analyzeTestCase(Token t, int analysisStep){
    locOrder=0;
	TestCase aTestCase = new TestCase(t.getValue("testCaseName"),locOrder);
	
for ( Token st : t.getSubTokens())
		
	{
	
	if(st.getName().equals("isTargeted"))
	{
		if(st.getValue("isTargeted") != null)
		{
			
			aTestCase.setIsTargeted(true);
			aTestCase.setConcreteLanguage(st.getValue("isTargeted"));
			System.out.println( aTestCase.getConcreteLanguage());
			
		}
		
		
	}
	
	if(st.getName().equals("isConcrete"))
	{
		if(st.getValue("isConcrete") != null)
		{			
			aTestCase.setIsConcrete(true);
			aTestCase.setIsTargeted(true);
			aTestCase.setConcreteLanguage(st.getValue("isTargeted"));
		}
		
	}
	
	if(st.getName().equals("initialization"))
	 {
		//system.out.println("\tInitlocOrder");
		//system.out.println(locOrder);
		analyzeInit(st,analysisStep, aTestCase, locOrder);
		locOrder++;
	 }
	 
	 if(st.getName().equals("testAction"))
	 {
		//system.out.println("\tInitlocOrder");
		//system.out.println(locOrder);
		analyzeAction(st,analysisStep, aTestCase, locOrder);
		locOrder++;
	 }
	
	 if(st.getName().equals("methodCall"))
  	 {
		 //system.out.println("\tMethlocOrder");
		 //system.out.println(locOrder);
  		 analyzeMethodCall(st,analysisStep, aTestCase,locOrder);
  		 locOrder++;
  	 }
	
   	 if(st.getName().equals("assertion"))
   	 {
   		
   		analyzeAssertions(st,analysisStep, aTestCase, locOrder);
   	 }

   	 if(st.getName().equals("testInitAttWithMethodCall"))
  	 {
  		
  		analyzeTestInitAttributeMethodCall(st,analysisStep, aTestCase, locOrder);
  	 }
  	 
  	 if(st.getName().equals("testInitAtt"))
 	 { 		
 		analyzeTestInitAttribute(st,analysisStep, aTestCase, locOrder);
 	 }
  	 
  	 if(st.getName().equals("inlineComment"))
 	 {
   		Action ta = new Action ("inlinecomment", "//"+st.getValue("inlineComment"), locOrder);
   		////system.out.println("comment");
   		aTestCase.addAction(ta);
   		locOrder++;
 	 }
   	
   	if(st.getName().equals("multilineComment"))
	 {
  		Action ta = new Action ("multilinecomment","/*" +st.getValue("multilineComment")+"*/", locOrder);
  		////system.out.println("comment");
  		aTestCase.addAction(ta);
  		locOrder++;
	 }
		
	}
	
	aTestCase.setLocOrder(locOrder);
	aTestModel.getTestSuite(0).addTestcase(aTestCase);
  }

  // line 594 "../../../../ump/mbt_parser_src.ump"
   private void analyzeMethodCall(Token t, int analysisStep, TestCase aTestCase, int locOrder){
    //MEthod calls within test cases example: object.delete();
	String code = "";
	
	for (Token st: t.getSubTokens())
	{
		////system.out.println(st.getName());
		
		if (st.getName().equals("objectName"))
		{

			if (aTestModel.getCodeLang().equals("PhpUnit"))
			{
				////system.out.println("codeLangforPhp");
				////system.out.println(aTestModel.getCodeLang());
				// Injecting '$' sign for Php objectName tokens.
				code += ("$" + st.getValue());
			}
			else
			{
				code += st.getValue();
			}
		}
		
		if (st.getName().equals("."))
		{
			if (aTestModel.getCodeLang().equals("PhpUnit"))
			{
				// replacing method call for PhpUnit with '->'
				code += "->";
			}
			else
			{
				code += st.getName();
			}
		}
		
		if (st.getName().equals("methodName"))
		{
			if (aTestModel.getCodeLang().equals("RubyUnit") && (st.getValue().contains("get") || st.getValue().subSequence(0, 3).equals("set")))
			  {
				String dashedMethod = st.getValue().substring(0, 3) + "_" + st.getValue().substring(3, 4).toLowerCase() +st.getValue().substring(4, st.getValue().length());  
				code+=dashedMethod;
			  }
			else if (aTestModel.getCodeLang().equals("RubyUnit") && st.getValue().contains("reset") )
			  {
				String dashedMethod = st.getValue().substring(0, 5) + "_" + st.getValue().substring(5, 6).toLowerCase() +st.getValue().substring(6, st.getValue().length());  
				code+=dashedMethod;
			  }
			  else{
				  code += st.getValue();
			  }
			
		}
		
		if (st.getName().equals("("))
		{
			code += st.getName();
		}
		
		if (st.getName().equals("assertParameter"))
		{
			String parameterCode="";
		    Token sst = st.getSubToken("assertParameter"); 
			for (Token sbt : sst.getSubTokens())
			{
			 parameterCode += sbt.getValue();
			 ////system.out.println("parCode");
			 ////system.out.println(parameterCode);
			}
			code+= parameterCode;
			
		}
		
		if (st.getName().equals(")"))
		{
			code += st.getName();
		}
		
		if (st.getName().equals(";"))
		{
			code += ";";
		}

		
		
	}
	////system.out.println("MethodCode");
	////system.out.println(code+";");
	////system.out.println("ActionCode");
	////system.out.println(code);
	aTestCase.addAction( new Action("",code,locOrder));
  }

  // line 689 "../../../../ump/mbt_parser_src.ump"
   private void analyzeInit(Token t, int analysisStep, TestCase aTestCase, int locOrder){
    TestInitialization aInit  = new TestInitialization (null, "construction", t.getValue("identifier"), t.getValue("objectName"), locOrder);
	System.out.println(t.getSubTokens().toString());
       	
	Token st = null;// t.getSubToken("parameter");
	//Parameter aParameter = new Parameter(t.getValue("Parameter"), t.getValue("identifier"), null);
	
	for (Token parToken : t.getSubTokens())
	{
		if (parToken.getName().equals("parameter"))
		{
			st = parToken;
		}
	}

	if(st != null)
	{
		for ( Token sst : st.getSubTokens())

		{						
			if(!sst.getValue().equals("STATIC"))
			{
			aInit.addParameter(new Parameter(sst.getValue(), "", sst.getValue()));
			}

		}
	}
	else {
		aInit.addParameter(new Parameter("","",""));
	}



	aTestCase.addInit(aInit);
  }

  // line 727 "../../../../ump/mbt_parser_src.ump"
   private void analyzeTestInitAttributeMethodCall(Token token, int analysisStep, TestCase aTestCase, int locOrder){
    // TODO Auto-generated method stub
	  Action ta = new Action("initAttMethodCall", "", locOrder);
	  String code = "";
	  
	  for(Token subToken : token.getSubTokens())
	  {
		  if(subToken.getName().equals("identifier"))
		  {
			  code+=subToken.getValue("identifier");			  
		  }
		  
		  if(subToken.getName().equals("attributeName"))
		  {
			  code+= " " +subToken.getValue("attributeName");			  
		  }
		  
		  if(subToken.getName().equals("object"))
		  {			  
				  code+= " " +subToken.getValue("object");			  
		  }
		  
		  if(subToken.getName().equals("name"))
		  {			  
				  code+= "" +subToken.getValue("name");			  
		  }
		  
		  if(subToken.getName().equals("."))
		  {
			  code+= "" +".";			  
		  }
		  
		  if(subToken.getName().equals("("))
		  {
			  code+= "" +"(";			  
		  }
		  
		  if(subToken.getName().equals(")"))
		  {
			  code+= "" +")";			  
		  }
		  
		  if(subToken.getName().equals("call"))
		  {
			  //System.out.println(subToken.getValue());
			  String methodName = subToken.getValue();
			  if (aTestModel.getCodeLang().equals("RubyUnit") && (methodName.contains("get") || methodName.subSequence(0, 3).equals("set")))
			  {
				String dashedMethod = methodName.substring(0, 3) + "_" + methodName.substring(3, 4).toLowerCase() +methodName.substring(4, methodName.length());  
				code+=dashedMethod;
			  }
			  else if (aTestModel.getCodeLang().equals("RubyUnit") && methodName.contains("reset") )
			  {
				String dashedMethod = methodName.substring(0, 5) + "_" + methodName.substring(5, 6).toLowerCase() +methodName.substring(6, methodName.length());  
				code+=dashedMethod;
			  }
			  else{
				  code += methodName;
			  }
			  
			  
			  //code+= " " +methodName;			  
		  }
		  
		  
		  
		  if(subToken.getName().equals("="))
		  {
			  code+= " " +"= ";			  
		  }
		  
		  if(subToken.getName().equals("\""))
		  {
			  code+= "" +"\" ";			  
		  }
		  
		  
		  if(subToken.getName().equals("parameter"))
		  {
			  for (Token ssToken : subToken.getSubTokens()){
				  if(ssToken.getName().equals(","))
				  {
					  code+= ",";
				  }
				  else if(ssToken.getName().equals("\""))
				  {
					  code+= "\"";
				  }
				  else  {
					  code += ssToken.getValue();
				  }
			  }
		  }
		  
		  if(subToken.getName().equals("testMethodCall"))
		  {
			  code += analyzeInitMethodCall(subToken, aTestCase, locOrder);			  
		  }
		  ta.setCode(code);		  		  
		  aTestCase.addAction(ta);		  
		  
	  }
  }

  // line 831 "../../../../ump/mbt_parser_src.ump"
   private String analyzeInitMethodCall(Token token, TestCase aTestCase, int locOrder){
    // TODO Auto-generated method stub
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
			  ////system.out.println("before test Action: "+code);
			  String paramCode = "";
			  for(Token parToken : subToken.getSubTokens())
			  {
				  
				  if(parToken.getName().equals("testParameter"))
				  {
				  paramCode = analyzeTestParameter(parToken,aTestCase,"");					  
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
	
	
	//return "";
  }

  // line 904 "../../../../ump/mbt_parser_src.ump"
   private String analyzeTestParameter(Token parToken, TestCase aTestCase, String string){
    // TODO Auto-generated method stub
	String parCode = "";
	for(Token spToken : parToken.getSubTokens())
	  {
		  if (spToken.getName().equals("testActionParameterList"))
		  {
			  //system.out.println("nested");
		  }
		  if (spToken.getName().equals("\"")) { parCode+="\""; }
		  if (spToken.getName().equals(",")) { parCode+=","; }
		  if (spToken.getName().equals("name")) { parCode += spToken.getValue("name"); }
	  }
	  
	  return parCode;
  }

  // line 922 "../../../../ump/mbt_parser_src.ump"
   private void analyzeThen(Token t, int analysisStep){
    for ( Token st : t.getSubTokens())
		
	{
	if(st.getName().equals("testCase"))
	 {
		 analyzeTestCase(st,analysisStep);
	 }
		
	}
  }

  // line 937 "../../../../ump/mbt_parser_src.ump"
   private void analyzeParameter(Token t, int analysisStep){
    ////system.out.println("analyzeParam"); analysis done within parent token
  }

  // line 941 "../../../../ump/mbt_parser_src.ump"
   private void analyzeWhen(Token t, int analysisStep){
    // TODO Auto-generated method stub
	
for ( Token st : t.getSubTokens())
		
	{
	if(st.getName().equals("initialization"))
	 {
		 analyzeInit(st,analysisStep);
	 }
		
	}
  }

  // line 956 "../../../../ump/mbt_parser_src.ump"
   private void analyzeGivenModel(Token t, int analysisStep){
    // TODO Auto-generated method stub
  }

  // line 961 "../../../../ump/mbt_parser_src.ump"
   private void analyzeGiven(Token t, int analysisStep){
    // TODO Auto-generated method stub
  }

  // line 966 "../../../../ump/mbt_parser_src.ump"
   private void analyzeModel(Token t, int analysisStep){
    TestSuite aTestSuite = new TestSuite(aTestModel);
	aTestModel.setFile(t.getValue("modelName")+".ump");	
	aTestModel.addTestSuite(aTestSuite);
  }


  /**
   * analyze main when initialzation statements
   */
  // line 976 "../../../../ump/mbt_parser_src.ump"
   private void analyzeInit(Token t, int analysisStep){
    String code = "";
    
    TestInitialization aInit  = new TestInitialization (null, "construction", t.getValue("identifier"), t.getValue("objectName"), locOrder);
	Token st = t.getSubToken("parameter");
	
		
		for ( Token sst : st.getSubTokens())
			
		{
		if (sst.getName().equals("pValue"))
		 {	
			aInit.addParameter(new Parameter(sst.getValue(), "", sst.getValue()));
		 }
		}
			    
    //TestInitialization ti = new TestInitialization("model", "modelInit" , t.getValue("identifier"), t.getValue("name"), locOrder);
    //aTestModel.getTestSuite(0).add
    aTestModel.addTestInitialization(aInit);
  }

  // line 1000 "../../../../ump/mbt_parser_src.ump"
   private void analyzeObjectInitialization(Token token, int analysisStep){
    // TODO Object init
  }

  // line 1005 "../../../../ump/mbt_parser_src.ump"
   private void analyzeAttWithMethodInitialization(Token token, int analysisStep){
    // TODO att init and assignment
  }

  // line 1010 "../../../../ump/mbt_parser_src.ump"
   private void analyzeAttInitialization(Token token, int analysisStep){
    // TODO att init assignment that has method calls
  }

  // line 1016 "../../../../ump/mbt_parser_src.ump"
   private void analyzeToken(Token t, int analysisStep){
    
  }

  // line 1020 "../../../../ump/mbt_parser_src.ump"
   private void analyzeDepend(Token t, int analysisStep){
    //ArrayList<String> depends = new ArrayList<String>();
	 	  
	  for ( Token st : t.getSubTokens())
			
		{
		if(st.getName().equals("pValue"))
		 {
			aTestModel.addDepend(new Depend(st.getValue(), ""));
		 }
			
		}
  }

  // line 1034 "../../../../ump/mbt_parser_src.ump"
   public void prepare(){
    // TODO Auto-generated method stub
	  
	  mbt.addGrammarFile(grammarFile);
	  mbt.parse(testModelFile);
	  mbt.getGRootToken();
	  analyzeAllTokens(mbt.getRootToken());
  }


  public String toString()
  {
    return super.toString() + "["+
            "shouldProcessAgain" + ":" + getShouldProcessAgain()+ "," +
            "grammarFile" + ":" + getGrammarFile()+ "," +
            "locOrder" + ":" + getLocOrder()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "mbt" + "=" + (getMbt() != null ? !getMbt().equals(this)  ? getMbt().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "parseResult" + "=" + (getParseResult() != null ? !getParseResult().equals(this)  ? getParseResult().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "testModelFile" + "=" + (getTestModelFile() != null ? !getTestModelFile().equals(this)  ? getTestModelFile().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "aTestModel" + "=" + (getATestModel() != null ? !getATestModel().equals(this)  ? getATestModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}