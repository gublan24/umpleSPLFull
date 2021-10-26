/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.unitGen.rubyUnit;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import cruise.umple.testgenerator.*;
import cruise.umple.testgenerator.Action;
import cruise.umple.testgenerator.Depend;
import java.util.regex.Pattern;

// line 17 "../../../../../UmpleTLTemplates/RubyUnitGenerator.ump"
public class RubyUnitGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "# EXPERIMENTAL CODE - NON COMPILEABLE VERSION OF Umple xUnit Model" + NL + "#PLEASE DO NOT EDIT THIS CODE" + NL + "#This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = NL + NL;
  public static final String TEXT_3 = NL + NL + "require 'test/unit'" + NL;
  public static final String TEXT_4 = NL + NL + "######---- Tests for  ";
  public static final String TEXT_5 = " ----#####" + NL + NL + "module ";
  public static final String TEXT_6 = NL + NL + "  class ";
  public static final String TEXT_7 = "Test  " + NL + "     ";
  public static final String TEXT_8 = "            " + NL + "            ";
  public static final String TEXT_9 = " = ";
  public static final String TEXT_10 = ".new(";
  public static final String TEXT_11 = ")";
  public static final String TEXT_12 = NL + "     ";
  public static final String TEXT_13 = NL + "    def setup" + NL + "        #Setup Method" + NL + "    end  " + NL;
  public static final String TEXT_14 = NL + "     ";
  public static final String TEXT_15 = NL + "    def teardown" + NL + "      #Tear Down" + NL + "    end";
  public static final String TEXT_16 = NL + "     ";
  public static final String TEXT_17 = NL + "  def ";
  public static final String TEXT_18 = " < Test::Unitt::TestCase";
  public static final String TEXT_19 = NL + "            ";
  public static final String TEXT_20 = " ";
  public static final String TEXT_21 = "     " + NL + "            assert(";
  public static final String TEXT_22 = ")";
  public static final String TEXT_23 = NL + "            assert(!";
  public static final String TEXT_24 = ")";
  public static final String TEXT_25 = NL + "            assert_equal (";
  public static final String TEXT_26 = ")";
  public static final String TEXT_27 = NL + "            assert_nil(";
  public static final String TEXT_28 = ")";
  public static final String TEXT_29 = NL + "            assert_method (";
  public static final String TEXT_30 = ")";
  public static final String TEXT_31 = NL;
  public static final String TEXT_32 = NL + "  ";
  public static final String TEXT_33 = NL + "  end" + NL + "end";
  public static final String TEXT_34 = " " + NL + NL + NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RubyUnitGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 30 "../../../../../UmpleTLTemplates/RubyUnitGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  @Override
  // line 35 "../../../../../UmpleTLTemplates/RubyUnitGenerator.ump"
   public String getCode(UmpleModel model, UmpleElement uElement){
    // TODO Auto-generated method stub
	return null;
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 43 "../../../../../UmpleTLTemplates/RubyUnitGenerator.ump"
   private void append(StringBuilder buffer, String input, Object... variables){
    buffer.append(StringFormatter.format(input,variables));
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _getCode(Integer numSpaces, StringBuilder sb, TestModel model){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    /*RubyUnitGenerator*/
    /*UmpleNotice*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
  //UmpleClass uClass = (UmpleClass) uElement;
  //GeneratedClass gClass = uClass.getGeneratedClass();
  TestCaseRubyUnitGenerator gen = new TestCaseRubyUnitGenerator(null, null, null, realSb, null);
  gen.setTestModel(model);
  
  //appendln(realSb, gen.translate("beforeCode", uClass));

  HashMap<String,String> codeInjectionMap = new HashMap<String,String>();
  
  boolean isFirst = true;

    realSb.append(TEXT_2);
    // if (uClass.numberOfComments() > 0) { if(!uClass.getComments().get(0).getIsInline()) {append(realSb, "\n{0}", Comment.format("Multiline",uClass.getComments()));} else { append(realSb, "\n{0}", Comment.format("Multiline",uClass.getComments()));} } 
    realSb.append(TEXT_3);
    /*depends*/
    
/*
This file generates depends classes for test model
*/
  StringBuilder dependClasses = new StringBuilder();
  String depend;
  isFirst = true;
  
  for (Depend dep : model.getDepends())
    {
    	appendln(realSb, "require {0}",dep.getName()) ;
    }
  appendln(realSb,"");


    realSb.append(TEXT_4);
    realSb.append(model.getFile());
    realSb.append(TEXT_5);
    realSb.append(model.getFile().subSequence(0, model.getFile().length()-4)+"Module");
    realSb.append(TEXT_6);
    realSb.append(model.getFile().subSequence(0, model.getFile().length()-4));
    realSb.append(TEXT_7);
    /*where_init*/
    
/*
This file generates initializations for classes in RubyUnit class
*/
  isFirst = true; 
  
  if(model.hasTestInitializations())
  {
     for (TestInitialization init : model.getTestInitializations())
     {
     
     
    /*testcase_init*/
    
String par = "";
			  		for (Parameter pa : init.getParameters()){
			  		par += pa.getValue()+",";
			  		}
			  		 par = (String) par.subSequence(0, par.length()-1);
		
			  		
    realSb.append(TEXT_8);
    realSb.append(init.getObjectName());
    realSb.append(TEXT_9);
    realSb.append(init.getIdentifier());
    realSb.append(TEXT_10);
    realSb.append(par);
    realSb.append(TEXT_11);
    

    
     
     }
  
  
  }

    realSb.append(TEXT_12);
    /*members_Setup*/
    realSb.append(TEXT_13);
    realSb.append(TEXT_14);
    /*members_tearDown*/
    realSb.append(TEXT_15);
    realSb.append(TEXT_16);
    /*members_AllTestCases*/
    


boolean skipTest = false;
boolean isConcrete = false;

for (TestCase tc : model.getTestSuite(0).getTestcases())
{
if (tc.getIsTargeted())
  {
    if(tc.getConcreteLanguage().equals( "PhpUnit") || tc.getConcreteLanguage().equals("JUnit") )
    {
     skipTest = true;
    }
  }


	if (skipTest) {
		//skipThisTest 
	}
else{


    realSb.append(TEXT_17);
    realSb.append(tc.getName());
    realSb.append(TEXT_18);
    
	  for (int i = 0; i<tc.getLocOrder();i++)
		  {
			if (tc.getInits().size()>0)
			{
			  for (TestInitialization init : tc.getInits())
			  {
				  if (init.getLocOrder() == i )
				  {
				  	
			  		
				  if (init.getLocOrder() == i )
				  {
				  	
    /*testcase_init*/
    
String par = "";
			  		for (Parameter pa : init.getParameters()){
			  		par += pa.getValue()+",";
			  		}
			  		 par = (String) par.subSequence(0, par.length()-1);
		
			  		
    realSb.append(TEXT_8);
    realSb.append(init.getObjectName());
    realSb.append(TEXT_9);
    realSb.append(init.getIdentifier());
    realSb.append(TEXT_10);
    realSb.append(par);
    realSb.append(TEXT_11);
    

    
				  }
				
					
				  }
				
				
			  }
		  }//initEnd
		  
		  if (tc.hasActions())
		  {
	  		for ( Action act : tc.getActions())
	  		{
				if (act.getLocOrder() == i)
				{
					
    realSb.append(TEXT_19);
    realSb.append(act.getCode());
    
				}
				
			}
		  	
		  }//ActionsEND
		  
		  
		  if (tc.hasAssertions())
		  {
		  
			  for (Assertion as: tc.getAssertions())
			  {
			  	String assertCode =  as.getAssertCode().replace(".","->");
				  if (as.getLocOrder() ==i)
				  {
			  		
    /*members_AllAssertions*/
    realSb.append(TEXT_20);
    

		if(as.getType().equals("assertTrue"))
		{
    realSb.append(TEXT_21);
    realSb.append(as.getAssertCode());
    realSb.append(TEXT_22);
    }
		
		if(as.getType().equals("assertFalse"))
		{
    realSb.append(TEXT_23);
    realSb.append(as.getAssertCode());
    realSb.append(TEXT_24);
    }
		
		if(as.getType().equals("assertEqual"))
		{
    realSb.append(TEXT_25);
    realSb.append(as.getAssertCode());
    realSb.append(TEXT_26);
    }
		
		if(as.getType().equals("assertNull"))
		{
    realSb.append(TEXT_27);
    realSb.append(as.getAssertCode());
    realSb.append(TEXT_28);
    }
		
		if(as.getType().equals("assertMethod"))
		{
    realSb.append(TEXT_29);
    realSb.append(as.getAssertCode());
    realSb.append(TEXT_30);
    }

    realSb.append(TEXT_31);
    
					
				  }
				
			  }
			
		  }// AssertionsEnd
			  
			  
			
		  }//locEnd	
	  
	  
    realSb.append(TEXT_32);
    
}


skipTest = false;
}


    realSb.append(TEXT_33);
     //appendln(realSb, gen.translate("afterCode", uClass));
    realSb.append(TEXT_34);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getCode(TestModel model){
        StringBuilder sb = new StringBuilder();
    return this._getCode(0,sb,model).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}