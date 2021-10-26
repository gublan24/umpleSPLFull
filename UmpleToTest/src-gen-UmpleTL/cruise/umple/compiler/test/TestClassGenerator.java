/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.test;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import java.util.regex.Pattern;

// line 18 "../../../../../UmpleTLTemplates/TestClassGenerator.ump"
public class TestClassGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "/*PLEASE DO NOT EDIT THIS CODE*/" + NL + "/*This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!*/";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = NL + NL;
  public static final String TEXT_3 = NL + NL + "////---- Tests for  ";
  public static final String TEXT_4 = " ----/////";
  public static final String TEXT_5 = NL + NL;
  public static final String TEXT_6 = "test ";
  public static final String TEXT_7 = " {" + NL + NL + " generate ";
  public static final String TEXT_8 = " ;" + NL + " " + NL + " ";
  public static final String TEXT_9 = NL + " " + NL + " GIVEN:" + NL + " ";
  public static final String TEXT_10 = ";" + NL + " " + NL + " ";
  public static final String TEXT_11 = "WHERE:" + NL + "  ";
  public static final String TEXT_12 = NL + "  ";
  public static final String TEXT_13 = NL + " " + NL + " THEN:" + NL;
  public static final String TEXT_14 = " ";
  public static final String TEXT_15 = " //tests for :";
  public static final String TEXT_16 = NL + NL + "      test attribute_";
  public static final String TEXT_17 = " {" + NL + "    ";
  public static final String TEXT_18 = "          " + NL + "        ";
  public static final String TEXT_19 = NL + "      ";
  public static final String TEXT_20 = NL + "        ";
  public static final String TEXT_21 = " ";
  public static final String TEXT_22 = ";" + NL + "        ";
  public static final String TEXT_23 = NL + "          ";
  public static final String TEXT_24 = NL + NL + "    ";
  public static final String TEXT_25 = "assertTrue (a";
  public static final String TEXT_26 = ".get";
  public static final String TEXT_27 = "() == null );";
  public static final String TEXT_28 = "assertTrue (a";
  public static final String TEXT_29 = ".get";
  public static final String TEXT_30 = "() == null );";
  public static final String TEXT_31 = NL + "    assertTrue (a";
  public static final String TEXT_32 = ".get";
  public static final String TEXT_33 = "() == null);" + NL + "          ";
  public static final String TEXT_34 = NL + "    assertTrue (a";
  public static final String TEXT_35 = ".get";
  public static final String TEXT_36 = "() == null);" + NL + "          ";
  public static final String TEXT_37 = NL + "    assertTrue (a";
  public static final String TEXT_38 = ".get";
  public static final String TEXT_39 = "() == null);  " + NL + "          ";
  public static final String TEXT_40 = NL + "    assertTrue (a";
  public static final String TEXT_41 = ".get";
  public static final String TEXT_42 = "() == null);" + NL + "          ";
  public static final String TEXT_43 = NL + "            appendln(\"\");" + NL + "          ";
  public static final String TEXT_44 = NL;
  public static final String TEXT_45 = NL + "        ";
  public static final String TEXT_46 = NL + "        ";
  public static final String TEXT_47 = NL + "       assertEqual(a";
  public static final String TEXT_48 = ".get";
  public static final String TEXT_49 = "(), ";
  public static final String TEXT_50 = " );";
  public static final String TEXT_51 = NL + "    assertTrue( a";
  public static final String TEXT_52 = ".set";
  public static final String TEXT_53 = "(\"";
  public static final String TEXT_54 = "\"));" + NL + "    assertTrue( a";
  public static final String TEXT_55 = ".get";
  public static final String TEXT_56 = "() ==\"";
  public static final String TEXT_57 = "\");" + NL + "    assertTrue( a";
  public static final String TEXT_58 = ".set";
  public static final String TEXT_59 = "(\"";
  public static final String TEXT_60 = "\"));" + NL + "    assertTrue( a";
  public static final String TEXT_61 = ".get";
  public static final String TEXT_62 = "()==\"";
  public static final String TEXT_63 = "\");" + NL + "    assertFalse( a";
  public static final String TEXT_64 = ".get";
  public static final String TEXT_65 = "() ==\"";
  public static final String TEXT_66 = "\");" + NL + "             ";
  public static final String TEXT_67 = NL + "      ";
  public static final String TEXT_68 = NL + "        ";
  public static final String TEXT_69 = " ";
  public static final String TEXT_70 = ";";
  public static final String TEXT_71 = NL + "       assertEqual(a";
  public static final String TEXT_72 = ".get";
  public static final String TEXT_73 = "(), ";
  public static final String TEXT_74 = " );";
  public static final String TEXT_75 = "        " + NL + "            " + NL + "      assertTrue( a";
  public static final String TEXT_76 = ".set";
  public static final String TEXT_77 = "(";
  public static final String TEXT_78 = "));" + NL + "      assertTrue( a";
  public static final String TEXT_79 = ".get";
  public static final String TEXT_80 = "() == ";
  public static final String TEXT_81 = ");" + NL + "      assertTrue( a";
  public static final String TEXT_82 = ".set";
  public static final String TEXT_83 = "(";
  public static final String TEXT_84 = "));" + NL + "      assertTrue( a";
  public static final String TEXT_85 = ".get";
  public static final String TEXT_86 = "() == ";
  public static final String TEXT_87 = ");" + NL + "      assertFalse( a";
  public static final String TEXT_88 = ".get";
  public static final String TEXT_89 = "() == ";
  public static final String TEXT_90 = ");" + NL + "          ";
  public static final String TEXT_91 = NL + "      ";
  public static final String TEXT_92 = NL + "        ";
  public static final String TEXT_93 = " ";
  public static final String TEXT_94 = ";";
  public static final String TEXT_95 = NL + "       assertEqual(a";
  public static final String TEXT_96 = ".get";
  public static final String TEXT_97 = "(), ";
  public static final String TEXT_98 = " );";
  public static final String TEXT_99 = "    " + NL + "      assertTrue( a";
  public static final String TEXT_100 = ".set";
  public static final String TEXT_101 = "(";
  public static final String TEXT_102 = "));" + NL + "      assertTrue( a";
  public static final String TEXT_103 = ".get";
  public static final String TEXT_104 = "() == ";
  public static final String TEXT_105 = ");" + NL + "      assertTrue( a";
  public static final String TEXT_106 = ".set";
  public static final String TEXT_107 = "(";
  public static final String TEXT_108 = "));" + NL + "      assertTrue( a";
  public static final String TEXT_109 = ".get";
  public static final String TEXT_110 = "() == ";
  public static final String TEXT_111 = ");" + NL + "      assertFalse( a";
  public static final String TEXT_112 = ".get";
  public static final String TEXT_113 = "() == ";
  public static final String TEXT_114 = ");" + NL + "          ";
  public static final String TEXT_115 = NL + "      ";
  public static final String TEXT_116 = NL + "        ";
  public static final String TEXT_117 = " ";
  public static final String TEXT_118 = ";   ";
  public static final String TEXT_119 = NL + "       assertEqual(a";
  public static final String TEXT_120 = ".get";
  public static final String TEXT_121 = "(), ";
  public static final String TEXT_122 = " );";
  public static final String TEXT_123 = " " + NL + "      assertTrue( a";
  public static final String TEXT_124 = ".set";
  public static final String TEXT_125 = "(";
  public static final String TEXT_126 = "));" + NL + "      assertTrue( a";
  public static final String TEXT_127 = ".get";
  public static final String TEXT_128 = "() == ";
  public static final String TEXT_129 = ");" + NL + "      assertTrue( a";
  public static final String TEXT_130 = ".set";
  public static final String TEXT_131 = "(";
  public static final String TEXT_132 = "));" + NL + "      assertTrue( a";
  public static final String TEXT_133 = ".get";
  public static final String TEXT_134 = "() == ";
  public static final String TEXT_135 = ");" + NL + "      assertFalse( a";
  public static final String TEXT_136 = ".get";
  public static final String TEXT_137 = "() == ";
  public static final String TEXT_138 = ");" + NL + "          ";
  public static final String TEXT_139 = NL + "      ";
  public static final String TEXT_140 = NL + "        ";
  public static final String TEXT_141 = " ";
  public static final String TEXT_142 = ";   ";
  public static final String TEXT_143 = NL + "       assertEqual(a";
  public static final String TEXT_144 = ".get";
  public static final String TEXT_145 = "(), ";
  public static final String TEXT_146 = " );";
  public static final String TEXT_147 = " " + NL + "      assertTrue( a";
  public static final String TEXT_148 = ".set";
  public static final String TEXT_149 = "(false));" + NL + "      assertTrue( a";
  public static final String TEXT_150 = ".get";
  public static final String TEXT_151 = "() == false);" + NL + "      assertTrue( a";
  public static final String TEXT_152 = ".set";
  public static final String TEXT_153 = "(true));" + NL + "      assertTrue( a";
  public static final String TEXT_154 = ".get";
  public static final String TEXT_155 = "() == true);" + NL + "      assertFalse( a";
  public static final String TEXT_156 = ".get";
  public static final String TEXT_157 = "() == false);" + NL + "          ";
  public static final String TEXT_158 = NL + "      ";
  public static final String TEXT_159 = NL + "        ";
  public static final String TEXT_160 = " ";
  public static final String TEXT_161 = ";   ";
  public static final String TEXT_162 = NL + "        Time sTime = Time.valueOf(";
  public static final String TEXT_163 = ");" + NL + "       assertEqual(a";
  public static final String TEXT_164 = ".get";
  public static final String TEXT_165 = "(), sTime );" + NL + "       ";
  public static final String TEXT_166 = NL + "        Time aTime = ";
  public static final String TEXT_167 = ";" + NL + "      assertTrue( a";
  public static final String TEXT_168 = ".set";
  public static final String TEXT_169 = "(aTime));" + NL + "      assertEqual( a";
  public static final String TEXT_170 = ".get";
  public static final String TEXT_171 = "() , aTime);" + NL + "      " + NL + "          ";
  public static final String TEXT_172 = NL + "      ";
  public static final String TEXT_173 = NL + "        ";
  public static final String TEXT_174 = " ";
  public static final String TEXT_175 = ";   ";
  public static final String TEXT_176 = NL + "       Date sDate = Date.valueOf(";
  public static final String TEXT_177 = ");" + NL + "       assertEqual(a";
  public static final String TEXT_178 = ".get";
  public static final String TEXT_179 = "(), sDate );";
  public static final String TEXT_180 = " " + NL + "      Date aDate = ";
  public static final String TEXT_181 = ";" + NL + "      assertTrue( a";
  public static final String TEXT_182 = ".set";
  public static final String TEXT_183 = "(aDate));" + NL + "      " + NL + "      assertEqual( a";
  public static final String TEXT_184 = ".get";
  public static final String TEXT_185 = "() , aDate);" + NL + "      " + NL + "          ";
  public static final String TEXT_186 = NL;
  public static final String TEXT_187 = NL + "         ";
  public static final String TEXT_188 = NL + "  assertTrue(a";
  public static final String TEXT_189 = ".reset";
  public static final String TEXT_190 = "());" + NL + "  Date  resetDate =  Date.valueOf(";
  public static final String TEXT_191 = ");" + NL + "  assertEqual( a";
  public static final String TEXT_192 = ".getDefault";
  public static final String TEXT_193 = "(), resetDate);" + NL + "  ";
  public static final String TEXT_194 = NL + "  assertTrue(a";
  public static final String TEXT_195 = ".reset";
  public static final String TEXT_196 = "());" + NL + "  Time  resetTime =  Time.valueOf(";
  public static final String TEXT_197 = ");" + NL + "  assertEqual( a";
  public static final String TEXT_198 = ".getDefault";
  public static final String TEXT_199 = "(), resetTime);" + NL + "  ";
  public static final String TEXT_200 = "assertTrue(a";
  public static final String TEXT_201 = ".reset";
  public static final String TEXT_202 = "());" + NL + "  assertEqual( a";
  public static final String TEXT_203 = ".getDefault";
  public static final String TEXT_204 = "(), ";
  public static final String TEXT_205 = " );";
  public static final String TEXT_206 = NL + "         ";
  public static final String TEXT_207 = "          " + NL + "        ";
  public static final String TEXT_208 = NL + "          ";
  public static final String TEXT_209 = NL + NL + "    ";
  public static final String TEXT_210 = NL + "        ";
  public static final String TEXT_211 = " ";
  public static final String TEXT_212 = ";" + NL + "    //assertMethod(set";
  public static final String TEXT_213 = "());" + NL + "    assertTrue( a";
  public static final String TEXT_214 = ".get";
  public static final String TEXT_215 = "() == ";
  public static final String TEXT_216 = ");" + NL + NL;
  public static final String TEXT_217 = NL + "        ";
  public static final String TEXT_218 = NL + " ";
  public static final String TEXT_219 = NL + "      " + NL + "      ";
  public static final String TEXT_220 = "test ";
  public static final String TEXT_221 = " {" + NL + "        ";
  public static final String TEXT_222 = "        ";
  public static final String TEXT_223 = ";";
  public static final String TEXT_224 = "assertTrue";
  public static final String TEXT_225 = ";" + NL + "        ";
  public static final String TEXT_226 = "assertFalse";
  public static final String TEXT_227 = ";" + NL + "        ";
  public static final String TEXT_228 = "assertEqual";
  public static final String TEXT_229 = ";" + NL + "        ";
  public static final String TEXT_230 = NL + "        ";
  public static final String TEXT_231 = "        ";
  public static final String TEXT_232 = ";";
  public static final String TEXT_233 = "}" + NL + "      " + NL + "      " + NL + "      " + NL + "      " + NL + "        " + NL + "    ";
  public static final String TEXT_234 = " " + NL + " ";
  public static final String TEXT_235 = NL + "        test ";
  public static final String TEXT_236 = " ()" + NL + "        {";
  public static final String TEXT_237 = "assertTrue(";
  public static final String TEXT_238 = ");" + NL + "        ";
  public static final String TEXT_239 = "assertFalse(";
  public static final String TEXT_240 = ");" + NL + "        ";
  public static final String TEXT_241 = "assertEqual(";
  public static final String TEXT_242 = ");" + NL + "        ";
  public static final String TEXT_243 = "}";
  public static final String TEXT_244 = " " + NL + "      test ";
  public static final String TEXT_245 = " ()" + NL + "      {" + NL + "        ";
  public static final String TEXT_246 = "assertTrue(";
  public static final String TEXT_247 = ");" + NL + "        ";
  public static final String TEXT_248 = "assertFalse(";
  public static final String TEXT_249 = ");" + NL + "        ";
  public static final String TEXT_250 = "assertEqual(";
  public static final String TEXT_251 = ");" + NL + "        ";
  public static final String TEXT_252 = "  " + NL + "       }" + NL + "       ";
  public static final String TEXT_253 = NL + " ";
  public static final String TEXT_254 = " ";
  public static final String TEXT_255 = " " + NL + NL + "}" + NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TestClassGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 28 "../../../../../UmpleTLTemplates/TestClassGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 35 "../../../../../UmpleTLTemplates/TestClassGenerator.ump"
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

  public StringBuilder _getCode(Integer numSpaces, StringBuilder sb, UmpleModel model, UmpleElement uElement){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    /*TestClassGenerator*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
  UmpleClass uClass = (UmpleClass) uElement;
  GeneratedClass gClass = uClass.getGeneratedClass();
  TestGenerator gen = new TestGenerator();
  gen.setModel(model);
  String isAbstract ="";
  
   if (uClass.getIsAbstract()) { isAbstract = "abstract "; }
   
  
  //appendln(realSb, gen.translate("beforeCode", uClass));

  HashMap<String,String> codeInjectionMap = new HashMap<String,String>();
  for (CodeInjection inject : uClass.getCodeInjections())
  {
    String operation = StringFormatter.toUnderscore(inject.getOperation());
    String key = inject.getType() + ":" + operation;
    String newCodeToInject = "";
    if (codeInjectionMap.containsKey(key))
    {
      newCodeToInject = StringFormatter.format("{0}\n    {1}",codeInjectionMap.get(key),inject.getCode());
    }
    else
    {
      newCodeToInject = inject.getCode();
    }
    codeInjectionMap.put(key,newCodeToInject);
  }
  boolean isFirst = true;

    realSb.append(TEXT_2);
     if (uClass.numberOfComments() > 0) { if(!uClass.getComments().get(0).getIsInline()) {append(realSb, "\n{0}", Comment.format("Multiline",uClass.getComments()));} else { append(realSb, "\n{0}", Comment.format("Multiline",uClass.getComments()));} } 
    realSb.append(TEXT_3);
    realSb.append(model.getUmpleFile().getFileName().subSequence(0, model.getUmpleFile().getFileName().length()-4));
    realSb.append(TEXT_4);
    
	String coverageCriteria = "";
	String unitLanguage = "";
	for (GenerateTarget tr : model.getGenerates() )
    	{
    		if (tr.hasSuboptions())
    		{
    			
    			//coverageCriteria = tr.getSubOption(0);
    		}
    	}
    	
    	
    	if (model.hasGenerates())
    	for (GenerateTarget gt : model.getGenerates())
    {
       if (gt.hasSuboptions())
       {
    	for (String so : gt.getSuboptions()){
    		
    		if( so.equals("JUnit"))
    		{
    			unitLanguage = "JUnit";
    		}
    		
    		else if( so.equals("PhpUnit"))
    		{
    			unitLanguage = "PhpUnit";
    		}
    		
    		else if( so.equals("RubyUnit"))
    		{
    			unitLanguage = "RubyUnit";
    		}
    		
    		else 
    		{
    			unitLanguage = "JUnit";
    		}     			
    	}
    	    
    	}
    	
    	else {
    	if (gt.getLanguage().equals("Test"))
    	{
    	  unitLanguage = "JUnit";
    	}
      }
    		
    }
    
    else { unitLanguage = "JUnit";}
    	
 
    realSb.append(TEXT_5);
    realSb.append(isAbstract);
    realSb.append(TEXT_6);
    realSb.append(uClass.getName());
    realSb.append(TEXT_7);
    realSb.append(unitLanguage);
    realSb.append(TEXT_8);
    /*depends*/
    
/*
This file generates depends classes for test model
*/
  StringBuilder dependClasses = new StringBuilder();
  String depend;
  isFirst = true;
  
  for (UmpleClass dClass : model.getUmpleClasses())
    {
    	dependClasses.append(StringFormatter.format("{0},",dClass.getName())) ;
    }
  depend = dependClasses.substring(0,dependClasses.length()-1)  ;
  appendln(realSb,"depend  {0} ; \n\n",depend);


    realSb.append(TEXT_9);
    realSb.append(model.getUmpleFile().getFileName());
    realSb.append(TEXT_10);
    /*members_TestInit*/
    

if (uClass.hasTestInits())
{
  
    realSb.append(TEXT_11);
    
  for (TestInit ti : uClass.getTestInits()){
  
    realSb.append(ti.getCode());
    realSb.append(TEXT_12);
      
  }

}



    realSb.append(TEXT_13);
    /*members_Before*/
    

	boolean hasTimedTestCases = false;
	if ( uClass.hasUmpleTestCases())
		{
				
		
		for (UmpleTestCase tc : uClass.getUmpleTestCases())
		{		
			if (tc.getIsTimed() == true)
			{
				hasTimedTestCases = true;
				append(realSb, "\n\n before { {0} }\n\n", tc.getName());				
			}				
		}
		
		
		}
	

    realSb.append(TEXT_14);
    /*members_AllAttributes*/
    
/*
This file generates Tests for attributes for a given class. Once all the attributes have been defined
*/

  isFirst = true;

  if (!uClass.hasAttributes())
  { appendln(realSb, ""); }

  else {
  for(Attribute at : uClass.getAttributes())
  {
  String typeName = at.getType() == null ? "String" : at.getType();
  String upperBound = at.getIsList() ? " upperBound=\"-1\"" : "";
  String attrName = StringFormatter.toPascalCase(at.getName());
  String isLazy = "";
  String isImmutable = "";
  String isDefaulted = "";
  if(at.isIsLazy())
  {
  	isLazy = "lazy_";
  }
  
  if(at.isImmutable())
  {
  	isImmutable = "immutable_";
  }
  
  if(at.isDefaulted())
  {
  	isDefaulted = "defaulted_";
  }
  //appendln(realSb, " ");
  	
    realSb.append(TEXT_15);
    realSb.append(at.getName());
    realSb.append(TEXT_16);
    realSb.append(isLazy);
    realSb.append(isImmutable);
    realSb.append(isDefaulted);
    realSb.append(at.getName());
    realSb.append(TEXT_17);
    


  	if (!at.isImmutable() && !at.isConstant())
	        {
	        if (at.isIsLazy())
	      {
    realSb.append(TEXT_18);
    }
	    	  	
    /*attribute_typed*/
    

if(at.getType().equals("String") || at.getType().equals(""))
	    	  {
	    	  	   String randomString1 = UUID.randomUUID().toString().replaceAll("-","").substring(0, 8);
    realSb.append(TEXT_19);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_20);
    realSb.append(uClass.getName());
    realSb.append(TEXT_21);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_22);
    if (at.isIsLazy())
	      {
    realSb.append(TEXT_23);
    /*attribute_Lazy*/
    realSb.append(TEXT_24);
    
	    	  //TODO: testGenerator,  add assertion for lazy, we want to see if the object has the lazy-specific LOC in the constructor, Note this is still abstrac ( not language oriented) 
	    	  //  AssertLOC : student={ method=Student(), LOC="name = null;"}
	    	  
    realSb.append(TEXT_25);
    realSb.append(uClass.getName());
    realSb.append(TEXT_26);
    realSb.append(attrName);
    realSb.append(TEXT_27);
    
	    	  
	    	  if(at.getValue() != "null")
	    	  {
	    	    
	    	  }
	    	  
	    	  else {
	    	  
	    	  
    realSb.append(TEXT_28);
    realSb.append(uClass.getName());
    realSb.append(TEXT_29);
    realSb.append(at.getName());
    realSb.append(TEXT_30);
    
	    	  
	    	  if(at.getType().equals( "String") || at.getType().equals(null))
	    	  {
	    	  
    realSb.append(TEXT_31);
    realSb.append(uClass.getName());
    realSb.append(TEXT_32);
    realSb.append(attrName);
    realSb.append(TEXT_33);
    }
	    	  if(at.getType().equals("Double") || at.getType().equals( "Integer"))
	    	  {
    realSb.append(TEXT_34);
    realSb.append(uClass.getName());
    realSb.append(TEXT_35);
    realSb.append(attrName);
    realSb.append(TEXT_36);
    }	    	  
	    	  if(at.getType() == "Float")
	    	  {
    realSb.append(TEXT_37);
    realSb.append(uClass.getName());
    realSb.append(TEXT_38);
    realSb.append(attrName);
    realSb.append(TEXT_39);
    }
	    	  if(at.getType() == "Boolean") 
	    	  {
    realSb.append(TEXT_40);
    realSb.append(uClass.getName());
    realSb.append(TEXT_41);
    realSb.append(attrName);
    realSb.append(TEXT_42);
    }
	    	  
	    	  if (at.getType() == "")
	    	  {
    realSb.append(TEXT_43);
    }
	    	  
	    	  else{
	    		  
	    	   }
	    	  }

    realSb.append(TEXT_44);
    realSb.append(TEXT_45);
    }
    realSb.append(TEXT_46);
    if (at.getValue() != null) {
    realSb.append(TEXT_47);
    realSb.append(uClass.getName());
    realSb.append(TEXT_48);
    realSb.append(attrName);
    realSb.append(TEXT_49);
    realSb.append(at.getValue());
    realSb.append(TEXT_50);
    }
    realSb.append(TEXT_51);
    realSb.append(uClass.getName());
    realSb.append(TEXT_52);
    realSb.append(attrName);
    realSb.append(TEXT_53);
    realSb.append(gen.translate("AttStringManu"));
    realSb.append(TEXT_54);
    realSb.append(uClass.getName());
    realSb.append(TEXT_55);
    realSb.append(attrName);
    realSb.append(TEXT_56);
    realSb.append(gen.translate("AttStringManu"));
    realSb.append(TEXT_57);
    realSb.append(uClass.getName());
    realSb.append(TEXT_58);
    realSb.append(attrName);
    realSb.append(TEXT_59);
    realSb.append(gen.translate("AttStringManu2"));
    realSb.append(TEXT_60);
    realSb.append(uClass.getName());
    realSb.append(TEXT_61);
    realSb.append(attrName);
    realSb.append(TEXT_62);
    realSb.append(gen.translate("AttStringManu2"));
    realSb.append(TEXT_63);
    realSb.append(uClass.getName());
    realSb.append(TEXT_64);
    realSb.append(attrName);
    realSb.append(TEXT_65);
    realSb.append(gen.translate("AttStringManu"));
    realSb.append(TEXT_66);
    
	    	  }

	    	  if(at.getType().equals("Integer"))
	    	  {
    realSb.append(TEXT_67);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_68);
    realSb.append(uClass.getName());
    realSb.append(TEXT_69);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_70);
    if (at.getValue() != null) {
    realSb.append(TEXT_71);
    realSb.append(uClass.getName());
    realSb.append(TEXT_72);
    realSb.append(attrName);
    realSb.append(TEXT_73);
    realSb.append(at.getValue());
    realSb.append(TEXT_74);
    }
    realSb.append(TEXT_75);
    realSb.append(uClass.getName());
    realSb.append(TEXT_76);
    realSb.append(attrName);
    realSb.append(TEXT_77);
    realSb.append(gen.translate("AttIntManu"));
    realSb.append(TEXT_78);
    realSb.append(uClass.getName());
    realSb.append(TEXT_79);
    realSb.append(attrName);
    realSb.append(TEXT_80);
    realSb.append(gen.translate("AttIntManu"));
    realSb.append(TEXT_81);
    realSb.append(uClass.getName());
    realSb.append(TEXT_82);
    realSb.append(attrName);
    realSb.append(TEXT_83);
    realSb.append(gen.translate("AttIntManu2"));
    realSb.append(TEXT_84);
    realSb.append(uClass.getName());
    realSb.append(TEXT_85);
    realSb.append(attrName);
    realSb.append(TEXT_86);
    realSb.append(gen.translate("AttIntManu2"));
    realSb.append(TEXT_87);
    realSb.append(uClass.getName());
    realSb.append(TEXT_88);
    realSb.append(attrName);
    realSb.append(TEXT_89);
    realSb.append(gen.translate("AttIntManu"));
    realSb.append(TEXT_90);
    }
	    	  
	    	  if(at.getType().equals("Double"))
	    	  {
    realSb.append(TEXT_91);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_92);
    realSb.append(uClass.getName());
    realSb.append(TEXT_93);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_94);
    if (at.getValue() != null) {
    realSb.append(TEXT_95);
    realSb.append(uClass.getName());
    realSb.append(TEXT_96);
    realSb.append(attrName);
    realSb.append(TEXT_97);
    realSb.append(at.getValue());
    realSb.append(TEXT_98);
    }
    realSb.append(TEXT_99);
    realSb.append(uClass.getName());
    realSb.append(TEXT_100);
    realSb.append(attrName);
    realSb.append(TEXT_101);
    realSb.append(gen.translate("AttDoubleManu"));
    realSb.append(TEXT_102);
    realSb.append(uClass.getName());
    realSb.append(TEXT_103);
    realSb.append(attrName);
    realSb.append(TEXT_104);
    realSb.append(gen.translate("AttDoubleManu"));
    realSb.append(TEXT_105);
    realSb.append(uClass.getName());
    realSb.append(TEXT_106);
    realSb.append(attrName);
    realSb.append(TEXT_107);
    realSb.append(gen.translate("AttDoubleManu2"));
    realSb.append(TEXT_108);
    realSb.append(uClass.getName());
    realSb.append(TEXT_109);
    realSb.append(attrName);
    realSb.append(TEXT_110);
    realSb.append(gen.translate("AttDoubleManu2"));
    realSb.append(TEXT_111);
    realSb.append(uClass.getName());
    realSb.append(TEXT_112);
    realSb.append(attrName);
    realSb.append(TEXT_113);
    realSb.append(gen.translate("AttDoubleManu"));
    realSb.append(TEXT_114);
    }

	    	  if(at.getType().equals("Float"))
	    	  {
    realSb.append(TEXT_115);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_116);
    realSb.append(uClass.getName());
    realSb.append(TEXT_117);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_118);
    if (at.getValue() != null) {
    realSb.append(TEXT_119);
    realSb.append(uClass.getName());
    realSb.append(TEXT_120);
    realSb.append(attrName);
    realSb.append(TEXT_121);
    realSb.append(at.getValue());
    realSb.append(TEXT_122);
    }
    realSb.append(TEXT_123);
    realSb.append(uClass.getName());
    realSb.append(TEXT_124);
    realSb.append(attrName);
    realSb.append(TEXT_125);
    realSb.append(gen.translate("AttFloatManu"));
    realSb.append(TEXT_126);
    realSb.append(uClass.getName());
    realSb.append(TEXT_127);
    realSb.append(attrName);
    realSb.append(TEXT_128);
    realSb.append(gen.translate("AttFloatManu"));
    realSb.append(TEXT_129);
    realSb.append(uClass.getName());
    realSb.append(TEXT_130);
    realSb.append(attrName);
    realSb.append(TEXT_131);
    realSb.append(gen.translate("AttFloatManu2"));
    realSb.append(TEXT_132);
    realSb.append(uClass.getName());
    realSb.append(TEXT_133);
    realSb.append(attrName);
    realSb.append(TEXT_134);
    realSb.append(gen.translate("AttFloatManu2"));
    realSb.append(TEXT_135);
    realSb.append(uClass.getName());
    realSb.append(TEXT_136);
    realSb.append(attrName);
    realSb.append(TEXT_137);
    realSb.append(gen.translate("AttFloatManu"));
    realSb.append(TEXT_138);
    }
	    	  if(at.getType().equals("boolean"))
	    	  {
    realSb.append(TEXT_139);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_140);
    realSb.append(uClass.getName());
    realSb.append(TEXT_141);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_142);
    if (at.getValue() != null) {
    realSb.append(TEXT_143);
    realSb.append(uClass.getName());
    realSb.append(TEXT_144);
    realSb.append(attrName);
    realSb.append(TEXT_145);
    realSb.append(at.getValue());
    realSb.append(TEXT_146);
    }
    realSb.append(TEXT_147);
    realSb.append(uClass.getName());
    realSb.append(TEXT_148);
    realSb.append(attrName);
    realSb.append(TEXT_149);
    realSb.append(uClass.getName());
    realSb.append(TEXT_150);
    realSb.append(attrName);
    realSb.append(TEXT_151);
    realSb.append(uClass.getName());
    realSb.append(TEXT_152);
    realSb.append(attrName);
    realSb.append(TEXT_153);
    realSb.append(uClass.getName());
    realSb.append(TEXT_154);
    realSb.append(attrName);
    realSb.append(TEXT_155);
    realSb.append(uClass.getName());
    realSb.append(TEXT_156);
    realSb.append(attrName);
    realSb.append(TEXT_157);
    }
	    	  
	    	  if(at.getType().equals("Time"))
	    	  {
    realSb.append(TEXT_158);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_159);
    realSb.append(uClass.getName());
    realSb.append(TEXT_160);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_161);
    if (at.getValue() != null) {
    realSb.append(TEXT_162);
    realSb.append(at.getValue());
    realSb.append(TEXT_163);
    realSb.append(uClass.getName());
    realSb.append(TEXT_164);
    realSb.append(attrName);
    realSb.append(TEXT_165);
    }
    realSb.append(TEXT_166);
    realSb.append(gen.translate("AttTimeManu"));
    realSb.append(TEXT_167);
    realSb.append(uClass.getName());
    realSb.append(TEXT_168);
    realSb.append(attrName);
    realSb.append(TEXT_169);
    realSb.append(uClass.getName());
    realSb.append(TEXT_170);
    realSb.append(attrName);
    realSb.append(TEXT_171);
    }
	    	  
	    	  if(at.getType().equals("Date"))
	    	  {
    realSb.append(TEXT_172);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_173);
    realSb.append(uClass.getName());
    realSb.append(TEXT_174);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_175);
    if (at.getValue() != null) {
    realSb.append(TEXT_176);
    realSb.append(at.getValue());
    realSb.append(TEXT_177);
    realSb.append(uClass.getName());
    realSb.append(TEXT_178);
    realSb.append(attrName);
    realSb.append(TEXT_179);
    }
    realSb.append(TEXT_180);
    realSb.append(gen.translate("AttDateManu"));
    realSb.append(TEXT_181);
    realSb.append(uClass.getName());
    realSb.append(TEXT_182);
    realSb.append(attrName);
    realSb.append(TEXT_183);
    realSb.append(uClass.getName());
    realSb.append(TEXT_184);
    realSb.append(attrName);
    realSb.append(TEXT_185);
    }

    realSb.append(TEXT_186);
    
	    	 if (at.isDefaulted())
	    	 {
    realSb.append(TEXT_187);
    /*attribute_Defaulted*/
    
	
	if(at.getType().equals( "Date"))
	{
    realSb.append(TEXT_188);
    realSb.append(uClass.getName());
    realSb.append(TEXT_189);
    realSb.append(attrName);
    realSb.append(TEXT_190);
    realSb.append(at.getValue());
    realSb.append(TEXT_191);
    realSb.append(uClass.getName());
    realSb.append(TEXT_192);
    realSb.append(attrName);
    realSb.append(TEXT_193);
    }
	
	else if (at.getType().equals("Time"))
	{
    realSb.append(TEXT_194);
    realSb.append(uClass.getName());
    realSb.append(TEXT_195);
    realSb.append(attrName);
    realSb.append(TEXT_196);
    realSb.append(at.getValue());
    realSb.append(TEXT_197);
    realSb.append(uClass.getName());
    realSb.append(TEXT_198);
    realSb.append(attrName);
    realSb.append(TEXT_199);
    }
	
	else {
	
    realSb.append(TEXT_200);
    realSb.append(uClass.getName());
    realSb.append(TEXT_201);
    realSb.append(attrName);
    realSb.append(TEXT_202);
    realSb.append(uClass.getName());
    realSb.append(TEXT_203);
    realSb.append(attrName);
    realSb.append(TEXT_204);
    realSb.append(at.getValue());
    realSb.append(TEXT_205);
    
	}		


    realSb.append(TEXT_206);
    }
	      {
    realSb.append(TEXT_207);
    } 	
	    	  	
		    }
	    	  //appendln(realSb("\t}\n", attrName));
	      
	      if ( at.isImmutable() == true)
	      {
    realSb.append(TEXT_208);
    /*attribute_Immutable*/
    realSb.append(TEXT_209);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_210);
    realSb.append(uClass.getName());
    realSb.append(TEXT_211);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_212);
    realSb.append(attrName);
    realSb.append(TEXT_213);
    realSb.append(uClass.getName());
    realSb.append(TEXT_214);
    realSb.append(attrName);
    realSb.append(TEXT_215);
    realSb.append(at.getValue());
    realSb.append(TEXT_216);
    realSb.append(TEXT_217);
    }
	      
        





  	appendln(realSb, "\t}\n");
  }
  }






    realSb.append(TEXT_218);
    /*members_AllTestCases*/
    

	if ( uClass.hasUmpleTestCases())
		{
		boolean hasBeforeAssertions=false;
		boolean hasAfterAssertions=false;
		String concreteLang="";
		
		
		
		
		
		
		appendln(realSb, "     //------------------");
	    appendln(realSb, "      //User-defined Tests");
	    appendln(realSb, "      //------------------");
		for (UmpleTestCase uTestCase :uClass.getUmpleTestCases())			
		{
		
		if (uTestCase.getName().equals("init"))
		{
		 // ignore the
		
		}
		
		else {
		
		if(uTestCase.getIsConcrete())
		{ concreteLang = uTestCase.getConcreteLang()+" ";   }
		
    realSb.append(TEXT_219);
    realSb.append(concreteLang);
    realSb.append(TEXT_220);
    realSb.append(uTestCase.getName());
    realSb.append(TEXT_221);
    
			  
			for (UmpleAssertion uAssert : uTestCase.getUmpleAssertions())
			{
			 if (uAssert.getType().contains("before")){ hasBeforeAssertions = true; }
			 if (uAssert.getType().contains("after")){ hasAfterAssertions = true; }
			}  
			
			if(hasBeforeAssertions == true ) {  
			appendln(realSb, "");
			appendln(realSb, "");
			appendln(realSb, "        //----------------");
			appendln(realSb, "        //before assertions");
			appendln(realSb, "        //----------------");
			for (UmpleAssertion uAssert : uTestCase.getUmpleAssertions())
			{
			 if (uAssert.getType().contains("before"))
			 {
			 
    realSb.append(TEXT_222);
    realSb.append(uAssert.getType().replace("before","").replace("after",""));
    realSb.append(uAssert.getAssertCode());
    realSb.append(TEXT_223);
    
			 			 
			 	
			 }
			 hasBeforeAssertions = false; 						
			}
			

			appendln(realSb, "\n        //End of before assertions");
			
			appendln(realSb, "");
			append(realSb, "        ");			 
			
			}
			  
			  
			for (int x=0; x<uTestCase.getLocOrder();x++)
			{
			for (UmpleAssertion uAssert : uTestCase.getUmpleAssertions())
			{
			if(uAssert.getLocOrder()==x)
			{
					if (uAssert.getType().equals("assertTrue"))
				{
				
    realSb.append(TEXT_224);
    realSb.append(uAssert.getAssertCode());
    realSb.append(TEXT_225);
    				
				}
				if (uAssert.getType().equals("assertFalse"))
				{
				
    realSb.append(TEXT_226);
    realSb.append(uAssert.getAssertCode());
    realSb.append(TEXT_227);
    				
				}
				if (uAssert.getType().equals("assertEqual"))
				{
				
    realSb.append(TEXT_228);
    realSb.append(uAssert.getAssertCode());
    realSb.append(TEXT_229);
    				
				}
			 }
			}
			
			for (TestAction ta : uTestCase.getTestActions())
			{
			 if (ta.getLocOrder()==x)
			 {
				
    realSb.append(ta.getActionCode());
    realSb.append(TEXT_230);
    
				}	
			}
			}
			
			
			if(hasAfterAssertions == true ) {  
			appendln(realSb, "");
			appendln(realSb, "");
			appendln(realSb, "        //----------------");
			appendln(realSb, "        //after assertions");
			appendln(realSb, "        //----------------");
			for (UmpleAssertion uAssert : uTestCase.getUmpleAssertions())
			{
			 if (uAssert.getType().contains("after"))
			 {
			 
    realSb.append(TEXT_231);
    realSb.append(uAssert.getType().replace("before","").replace("after",""));
    realSb.append(uAssert.getAssertCode());
    realSb.append(TEXT_232);
    
			 			 
			 	
			 }
			 hasAfterAssertions = false; 						
			}
			

			appendln(realSb, "\n        //End of after assertions");
			
			appendln(realSb, "");
			append(realSb, "        ");			 
			
			}
			
			}			
			
    realSb.append(TEXT_233);
    }
	}
	

    realSb.append(TEXT_234);
    /*members_AllMethods*/
    

	if ( uClass.hasMethods())
		{/*
		
		for (Method meth :uClass.getMethods())
		{
					
			MethodBody methBody = meth.getMethodBody();
			if(methBody.hasUmpleTestCases())
			{
    realSb.append(TEXT_235);
    realSb.append(meth.getName());
    realSb.append(TEXT_236);
    for(UmpleAssertion uAssert: methBody.getUmpleTestCase(0).getUmpleAssertions())
					{
					if (uAssert.getType().equals("assertTrue"))
				{
				
    realSb.append(TEXT_237);
    realSb.append(uAssert.getAssertCode());
    realSb.append(TEXT_238);
    				
				}
				if (uAssert.getType().equals("assertFalse"))
				{
				
    realSb.append(TEXT_239);
    realSb.append(uAssert.getAssertCode());
    realSb.append(TEXT_240);
    				
				}
				if (uAssert.getType().equals("assertEqual"))
				{
				
    realSb.append(TEXT_241);
    realSb.append(uAssert.getAssertCode());
    realSb.append(TEXT_242);
    				
				}
					
			
			}	
			
    realSb.append(TEXT_243);
    
		}

			else if (methBody.hasUmpleAssertions())
			{
    realSb.append(TEXT_244);
    realSb.append(meth.getName());
    realSb.append(TEXT_245);
    
				for (UmpleAssertion uAssert : methBody.getUmpleAssertions())
				{					
				if (uAssert.getType().equals("true"))
				{
				
    realSb.append(TEXT_246);
    realSb.append(uAssert.getAssertCode());
    realSb.append(TEXT_247);
    				
				}
				if (uAssert.getType().equals("false"))
				{
				
    realSb.append(TEXT_248);
    realSb.append(uAssert.getAssertCode());
    realSb.append(TEXT_249);
    				
				}
				if (uAssert.getType().equals("equal"))
				{
				
    realSb.append(TEXT_250);
    realSb.append(uAssert.getAssertCode());
    realSb.append(TEXT_251);
    				
				}				
				
				}
				
    realSb.append(TEXT_252);
    
			}



		}*/
				
		}

    realSb.append(TEXT_253);
    /*members_After*/
    

	hasTimedTestCases = false;
	if ( uClass.hasUmpleTestCases())
		{
				
		
		for (UmpleTestCase tc : uClass.getUmpleTestCases())
		{		
			if (tc.getIsTimed() == true)
			{
				hasTimedTestCases = true;
				append(realSb, "\n\n after { {0} }\n\n", tc.getName());				
			}				
		}
		
		
		}
	

    realSb.append(TEXT_254);
     //appendln(realSb, gen.translate("afterCode", uClass));
    realSb.append(TEXT_255);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getCode(UmpleModel model, UmpleElement uElement){
        StringBuilder sb = new StringBuilder();
    return this._getCode(0,sb,model,uElement).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}