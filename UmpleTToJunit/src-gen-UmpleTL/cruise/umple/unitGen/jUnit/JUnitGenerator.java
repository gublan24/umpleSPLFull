/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.unitGen.jUnit;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import cruise.umple.testgenerator.*;
import cruise.umple.testgenerator.Action;
import cruise.umple.testgenerator.Depend;
import java.util.regex.Pattern;

// line 17 "../../../../../UmpleTLTemplates/JUnitGenerator.ump"
public class JUnitGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "/* EXPERIMENTAL CODE - NON COMPILEABLE VERSION OF Umple xUnit Model */" + NL + "/*PLEASE DO NOT EDIT THIS CODE*/" + NL + "/*This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!*/";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = NL + NL + NL + NL + NL + NL + "import java.sql.Time;" + NL + "import java.sql.Date;" + NL + "import org.junit.jupiter.api.DisplayName;" + NL + "import org.junit.jupiter.api.Tag;" + NL + "import org.junit.jupiter.api.Test;" + NL + "import org.junit.jupiter.api.*;" + NL + "import static org.junit.jupiter.api.Assertions.*;" + NL + NL + "////---- Tests for  ";
  public static final String TEXT_3 = "----/////" + NL + NL + NL;
  public static final String TEXT_4 = NL + NL + NL + "public class ";
  public static final String TEXT_5 = "Test {" + NL + " " + NL + " " + NL + " ";
  public static final String TEXT_6 = "            " + NL + "            ";
  public static final String TEXT_7 = " ";
  public static final String TEXT_8 = " = new ";
  public static final String TEXT_9 = " (";
  public static final String TEXT_10 = ");";
  public static final String TEXT_11 = NL + " ";
  public static final String TEXT_12 = NL + NL + "  @BeforeAll" + NL + "  public static void setup(){" + NL + NL + "  }" + NL + NL;
  public static final String TEXT_13 = NL + " ";
  public static final String TEXT_14 = NL + NL + "  @AfterAll" + NL + "  public static void teardown(){" + NL + NL + NL + "  }" + NL + NL;
  public static final String TEXT_15 = NL + " ";
  public static final String TEXT_16 = NL + "  @Test" + NL + "  public void ";
  public static final String TEXT_17 = "()" + NL + "  {";
  public static final String TEXT_18 = " " + NL + "            ";
  public static final String TEXT_19 = ";" + NL + "            ";
  public static final String TEXT_20 = "     " + NL + "            assertTrue (";
  public static final String TEXT_21 = ");" + NL + "    ";
  public static final String TEXT_22 = NL + "            assertFalse (";
  public static final String TEXT_23 = ");";
  public static final String TEXT_24 = NL + "            assertEquals (";
  public static final String TEXT_25 = ");";
  public static final String TEXT_26 = NL + "            assertNull (";
  public static final String TEXT_27 = ");";
  public static final String TEXT_28 = NL + "            assertMethod (";
  public static final String TEXT_29 = ");";
  public static final String TEXT_30 = NL;
  public static final String TEXT_31 = "  }  " + NL + "  ";
  public static final String TEXT_32 = NL + " " + NL;
  public static final String TEXT_33 = " " + NL + NL + "}" + NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JUnitGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 30 "../../../../../UmpleTLTemplates/JUnitGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  @Override
  // line 35 "../../../../../UmpleTLTemplates/JUnitGenerator.ump"
   public String getCode(UmpleModel model, UmpleElement uElement){
    // TODO Auto-generated method stub
	return null;
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 43 "../../../../../UmpleTLTemplates/JUnitGenerator.ump"
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
    
    /*JUnitGenerator*/
    /*UmpleNotice*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
  //UmpleClass uClass = (UmpleClass) uElement;
  //GeneratedClass gClass = uClass.getGeneratedClass();
  TestCaseJUnitGenerator gen = new TestCaseJUnitGenerator(null, null, null, realSb, null);
  gen.setTestModel(model);
  
  //appendln(realSb, gen.translate("beforeCode", uClass));

  HashMap<String,String> codeInjectionMap = new HashMap<String,String>();
  
  boolean isFirst = true;

    realSb.append(TEXT_2);
    realSb.append(model.getFile());
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
    	appendln(realSb, "//import {0};",dep.getName()) ;
    }
  appendln(realSb,"");


    realSb.append(TEXT_4);
    realSb.append(model.getFile().subSequence(0, model.getFile().length()-4));
    realSb.append(TEXT_5);
    /*where_init*/
    
/*
This file generates initializations for classes in JUnit class
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
		
			  		
    realSb.append(TEXT_6);
    realSb.append(init.getIdentifier());
    realSb.append(TEXT_7);
    realSb.append(init.getObjectName());
    realSb.append(TEXT_8);
    realSb.append(init.getIdentifier());
    realSb.append(TEXT_9);
    realSb.append(par);
    realSb.append(TEXT_10);
    
					

    
     
     }
  
  
  }
  
 
  

    realSb.append(TEXT_11);
    /*members_Setup*/
    realSb.append(TEXT_12);
    realSb.append(TEXT_13);
    /*members_tearDown*/
    realSb.append(TEXT_14);
    realSb.append(TEXT_15);
    /*members_AllTestCases*/
    

boolean skipTest = false;
boolean isConcrete = false;
for (TestCase tc : model.getTestSuite(0).getTestcases())
{if (tc.getIsTargeted())
  {
    if(tc.getConcreteLanguage().equals( "PhpUnit") || tc.getConcreteLanguage().equals("RubyUnit") )
    {
     skipTest = true;
    }
  }


	if (skipTest) {
		//skipThisTest 
	}
else{ 
    realSb.append(TEXT_16);
    realSb.append(tc.getName());
    realSb.append(TEXT_17);
    
	  for (int i = 0; i<tc.getLocOrder();i++)
		  {
			if (tc.getInits().size()>0)
			{
			  for (TestInitialization init : tc.getInits())
			  {
				  if (init.getLocOrder() == i )
				  {
				  	
    /*testcase_init*/
    
					String par = "";
			  		for (Parameter pa : init.getParameters()){
			  		par += pa.getValue()+",";
			  		}
			  		 par = (String) par.subSequence(0, par.length()-1);
		
			  		
    realSb.append(TEXT_6);
    realSb.append(init.getIdentifier());
    realSb.append(TEXT_7);
    realSb.append(init.getObjectName());
    realSb.append(TEXT_8);
    realSb.append(init.getIdentifier());
    realSb.append(TEXT_9);
    realSb.append(par);
    realSb.append(TEXT_10);
    
					

    
				  }
				
				
			  }
		  }//initEnd
		  
		  if (tc.hasActions())
		  {
	  		for ( Action act : tc.getActions())
	  		{
				if (act.getLocOrder() == i)
				{//include Action Code if there is actions in a TestCAse 
					
    realSb.append(TEXT_18);
    realSb.append(act.getCode());
    realSb.append(TEXT_19);
    
				}
				
			}
		  	
		  }//ActionsEND
		  
		  
		  if (tc.hasAssertions())
		  {
			  for (Assertion as: tc.getAssertions())
			  {
				  if (as.getLocOrder() ==i)
				  {
			  		
    /*members_AllAssertions*/
    


		if(as.getType().equals("assertTrue"))
		{		
		
    realSb.append(TEXT_20);
    realSb.append(as.getAssertCode());
    realSb.append(TEXT_21);
    }
		
		if(as.getType().equals("assertFalse"))
		{
    realSb.append(TEXT_22);
    realSb.append(as.getAssertCode());
    realSb.append(TEXT_23);
    }
		
		if(as.getType().equals("assertEqual"))
		{
    realSb.append(TEXT_24);
    realSb.append(as.getAssertCode());
    realSb.append(TEXT_25);
    }
		
		if(as.getType().equals("assertNull"))
		{
    realSb.append(TEXT_26);
    realSb.append(as.getAssertCode());
    realSb.append(TEXT_27);
    }
		
		if(as.getType().equals("assertMethod"))
		{
    realSb.append(TEXT_28);
    realSb.append(as.getAssertCode());
    realSb.append(TEXT_29);
    }

    realSb.append(TEXT_30);
    
					
				  }
				
			  }
			
		  }// AssertionsEnd
			  
			  
			
		  }//locEnd	
	  
	  
    realSb.append(TEXT_31);
    
}

skipTest = false;
}


    realSb.append(TEXT_32);
     //appendln(realSb, gen.translate("afterCode", uClass));
    realSb.append(TEXT_33);

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