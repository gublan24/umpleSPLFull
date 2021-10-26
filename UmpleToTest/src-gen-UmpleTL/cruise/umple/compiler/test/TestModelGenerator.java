/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.test;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import java.util.regex.Pattern;

// line 12 "../../../../../UmpleTLTemplates/TestModelGenerator.ump"
public class TestModelGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "/*PLEASE DO NOT EDIT THIS CODE*/" + NL + "/*This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!*/";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = NL + NL;
  public static final String TEXT_3 = NL + NL + "////---- Tests for  ";
  public static final String TEXT_4 = " ----/////" + NL + NL + "test ";
  public static final String TEXT_5 = " {" + NL + NL + "generate JUnit;" + NL + NL;
  public static final String TEXT_6 = NL + NL + "GIVEN:" + NL;
  public static final String TEXT_7 = ";" + NL + "THEN:" + NL + " ";
  public static final String TEXT_8 = NL + "              /////// Association: -- ";
  public static final String TEXT_9 = " ";
  public static final String TEXT_10 = " /////// " + NL + "              //create ... without ..." + NL + "              test Create";
  public static final String TEXT_11 = "Without";
  public static final String TEXT_12 = " {" + NL + "              " + NL + "              ";
  public static final String TEXT_13 = NL + "              ";
  public static final String TEXT_14 = " ";
  public static final String TEXT_15 = ";" + NL + "              int size = a";
  public static final String TEXT_16 = ".get";
  public static final String TEXT_17 = "s().size(); " + NL + "              assertTrue ( size == 0);" + NL + "              " + NL + "              }" + NL + "              ";
  public static final String TEXT_18 = NL + "              //replace" + NL + "              ";
  public static final String TEXT_19 = NL + "              test ReplaceOptional";
  public static final String TEXT_20 = "In";
  public static final String TEXT_21 = " { " + NL + "              " + NL + "              ";
  public static final String TEXT_22 = " ";
  public static final String TEXT_23 = ";" + NL + "              ";
  public static final String TEXT_24 = " b";
  public static final String TEXT_25 = ";" + NL + "              ";
  public static final String TEXT_26 = " ";
  public static final String TEXT_27 = ";" + NL + "              ";
  public static final String TEXT_28 = " b";
  public static final String TEXT_29 = ";" + NL + "              " + NL + "            " + NL + "              assertTrue(a";
  public static final String TEXT_30 = ".add";
  public static final String TEXT_31 = "(a";
  public static final String TEXT_32 = "));" + NL + "              assertEqual ( a";
  public static final String TEXT_33 = ".get";
  public static final String TEXT_34 = "(0),a";
  public static final String TEXT_35 = ");" + NL + "              " + NL + "              assertTrue(a";
  public static final String TEXT_36 = ".set";
  public static final String TEXT_37 = "(ba";
  public static final String TEXT_38 = "));" + NL + "              assertTrue ( a";
  public static final String TEXT_39 = ".get";
  public static final String TEXT_40 = "() == ba";
  public static final String TEXT_41 = ");" + NL + "              }" + NL + "              " + NL + "              " + NL + "              ";
  public static final String TEXT_42 = NL + "              test delete";
  public static final String TEXT_43 = "From";
  public static final String TEXT_44 = " {" + NL + "              // delete ";
  public static final String TEXT_45 = " in ";
  public static final String TEXT_46 = NL + "              " + NL + "              " + NL + "              ";
  public static final String TEXT_47 = NL + "              ";
  public static final String TEXT_48 = " b";
  public static final String TEXT_49 = ";" + NL + "              " + NL + "              ";
  public static final String TEXT_50 = NL + "              ";
  public static final String TEXT_51 = " ";
  public static final String TEXT_52 = ";" + NL + "              " + NL + "              assertTrue(a";
  public static final String TEXT_53 = ".add";
  public static final String TEXT_54 = "(ba";
  public static final String TEXT_55 = "));" + NL + "              " + NL + "              ba";
  public static final String TEXT_56 = ".delete();" + NL + "              " + NL + "              int size = a";
  public static final String TEXT_57 = ".get";
  public static final String TEXT_58 = "s().size(); " + NL + "              assertTrue ( size == 0);" + NL + "              }" + NL + "              " + NL + "              " + NL + "              ";
  public static final String TEXT_59 = NL + "              test Add";
  public static final String TEXT_60 = "ToNew";
  public static final String TEXT_61 = " { " + NL + "              " + NL + "              ";
  public static final String TEXT_62 = NL + "              ";
  public static final String TEXT_63 = " ";
  public static final String TEXT_64 = ";" + NL + "              " + NL + "              ";
  public static final String TEXT_65 = NL + "              ";
  public static final String TEXT_66 = " b";
  public static final String TEXT_67 = ";" + NL + "              " + NL + "              ";
  public static final String TEXT_68 = NL + "              ";
  public static final String TEXT_69 = " ";
  public static final String TEXT_70 = ";" + NL + "              " + NL + "              ";
  public static final String TEXT_71 = NL + "              ";
  public static final String TEXT_72 = " b";
  public static final String TEXT_73 = ";" + NL + "              " + NL + "                                  " + NL + "              " + NL + "              a";
  public static final String TEXT_74 = ".add";
  public static final String TEXT_75 = "(a";
  public static final String TEXT_76 = ");" + NL + "              ba";
  public static final String TEXT_77 = ".add";
  public static final String TEXT_78 = "(a";
  public static final String TEXT_79 = ");" + NL + "               " + NL + "        " + NL + "              assertEqual(ba";
  public static final String TEXT_80 = ".get";
  public static final String TEXT_81 = "(0), a";
  public static final String TEXT_82 = ") ;" + NL + "                            " + NL + "               " + NL + "              assertEqual (a";
  public static final String TEXT_83 = ".numberOf";
  public static final String TEXT_84 = "s(), 0);" + NL + "              " + NL + "              assertEqual (ba";
  public static final String TEXT_85 = ".numberOf";
  public static final String TEXT_86 = "s(), 1);" + NL + "              }" + NL + "              ";
  public static final String TEXT_87 = NL + "              " + NL + "              ";
  public static final String TEXT_88 = NL + "              /////// Association: -- ";
  public static final String TEXT_89 = " ";
  public static final String TEXT_90 = " /////// " + NL + "              //create ... without ..." + NL + "              test remove";
  public static final String TEXT_91 = " {" + NL + "              ";
  public static final String TEXT_92 = NL + "              ";
  public static final String TEXT_93 = " ";
  public static final String TEXT_94 = ";" + NL + "              " + NL + "              ";
  public static final String TEXT_95 = NL + "              ";
  public static final String TEXT_96 = " ";
  public static final String TEXT_97 = ";" + NL + "              assertTrue(";
  public static final String TEXT_98 = ".set";
  public static final String TEXT_99 = "(";
  public static final String TEXT_100 = "));              " + NL + "              a";
  public static final String TEXT_101 = ".delete();" + NL + "              " + NL + "              assertTrue (a";
  public static final String TEXT_102 = ".get";
  public static final String TEXT_103 = "() == null);" + NL + "              }" + NL + "              " + NL + "              ";
  public static final String TEXT_104 = NL + "              " + NL + "              " + NL + "              " + NL;
  public static final String TEXT_105 = NL + "              " + NL + "              /////// Association: -- ";
  public static final String TEXT_106 = " ";
  public static final String TEXT_107 = " /////// " + NL + "              " + NL + "              test create";
  public static final String TEXT_108 = "Without";
  public static final String TEXT_109 = " {              " + NL + "              ";
  public static final String TEXT_110 = NL + "              ";
  public static final String TEXT_111 = " ";
  public static final String TEXT_112 = ";" + NL + "              " + NL + "              assertTrue (a";
  public static final String TEXT_113 = ".numberOf";
  public static final String TEXT_114 = "s()== 0);" + NL + "              }" + NL + "              " + NL + "              ";
  public static final String TEXT_115 = NL + "              " + NL + "              test replaceMandatoryOne";
  public static final String TEXT_116 = "In";
  public static final String TEXT_117 = " { " + NL + "              " + NL + "              ";
  public static final String TEXT_118 = "                            " + NL + "              ";
  public static final String TEXT_119 = " b";
  public static final String TEXT_120 = ";" + NL + "              " + NL + "              ";
  public static final String TEXT_121 = NL + "              ";
  public static final String TEXT_122 = " ";
  public static final String TEXT_123 = "; " + NL + "              ";
  public static final String TEXT_124 = " b";
  public static final String TEXT_125 = ";" + NL + "              " + NL + "              a";
  public static final String TEXT_126 = ".set";
  public static final String TEXT_127 = "(ba";
  public static final String TEXT_128 = ");" + NL + "              assertEqual (a";
  public static final String TEXT_129 = ".get";
  public static final String TEXT_130 = "() , ba";
  public static final String TEXT_131 = ");              " + NL + "              assertEqual(ba";
  public static final String TEXT_132 = ".get";
  public static final String TEXT_133 = "() , a";
  public static final String TEXT_134 = " );" + NL + "                            " + NL + "              }" + NL + "              " + NL + "              ";
  public static final String TEXT_135 = NL + "              " + NL + "              test remove";
  public static final String TEXT_136 = "In";
  public static final String TEXT_137 = " {" + NL + "              " + NL + "              ";
  public static final String TEXT_138 = NL + "              ";
  public static final String TEXT_139 = " b";
  public static final String TEXT_140 = ";" + NL + "              ";
  public static final String TEXT_141 = NL + "              ";
  public static final String TEXT_142 = " ";
  public static final String TEXT_143 = ";" + NL + "              a";
  public static final String TEXT_144 = ".add";
  public static final String TEXT_145 = "(a";
  public static final String TEXT_146 = ");" + NL + "              " + NL + "              a";
  public static final String TEXT_147 = ".delete(); " + NL + "              assertTrue (a";
  public static final String TEXT_148 = ".numberOf";
  public static final String TEXT_149 = "s() == 0);" + NL + "              }" + NL + "              " + NL + "              ";
  public static final String TEXT_150 = NL + "              ";
  public static final String TEXT_151 = NL + "              " + NL + "              test Add";
  public static final String TEXT_152 = "ToNew";
  public static final String TEXT_153 = " { " + NL + "              " + NL + "              ";
  public static final String TEXT_154 = NL + "              ";
  public static final String TEXT_155 = " b";
  public static final String TEXT_156 = ";" + NL + "              " + NL + "              ";
  public static final String TEXT_157 = NL + "              ";
  public static final String TEXT_158 = " ";
  public static final String TEXT_159 = ";" + NL + "              ";
  public static final String TEXT_160 = " b";
  public static final String TEXT_161 = ";" + NL + "              " + NL + NL + "              ";
  public static final String TEXT_162 = ".add";
  public static final String TEXT_163 = "(a";
  public static final String TEXT_164 = ");" + NL + "              ";
  public static final String TEXT_165 = ".add";
  public static final String TEXT_166 = "(ba";
  public static final String TEXT_167 = ");  " + NL + "        " + NL + "              assertEqual( a";
  public static final String TEXT_168 = ".get";
  public static final String TEXT_169 = "(1),ba";
  public static final String TEXT_170 = "); " + NL + "              assertEqual ( ba";
  public static final String TEXT_171 = ".get";
  public static final String TEXT_172 = "(), a";
  public static final String TEXT_173 = ");" + NL + "              assertEqual ( a";
  public static final String TEXT_174 = ".numberOf";
  public static final String TEXT_175 = "s(),  2);" + NL + "              }" + NL + "              ";
  public static final String TEXT_176 = NL + "              " + NL + "              ";
  public static final String TEXT_177 = NL + "              " + NL + "              /////// Association: -- ";
  public static final String TEXT_178 = " ";
  public static final String TEXT_179 = " /////// " + NL + "              " + NL + "              test create";
  public static final String TEXT_180 = "With";
  public static final String TEXT_181 = " {              " + NL + "              ";
  public static final String TEXT_182 = NL + "              ";
  public static final String TEXT_183 = " ";
  public static final String TEXT_184 = ";" + NL + "              " + NL + "              assertTrue (a";
  public static final String TEXT_185 = ".get";
  public static final String TEXT_186 = "() == a";
  public static final String TEXT_187 = ");" + NL + "              }" + NL + "              " + NL + "              ";
  public static final String TEXT_188 = NL + "              " + NL + "              test replaceMany";
  public static final String TEXT_189 = "InOne";
  public static final String TEXT_190 = "{ " + NL + "              " + NL + "              ";
  public static final String TEXT_191 = NL + "              ";
  public static final String TEXT_192 = " b";
  public static final String TEXT_193 = ";" + NL + "              " + NL + "              " + NL + "              " + NL + "              ";
  public static final String TEXT_194 = "                            " + NL + "              ";
  public static final String TEXT_195 = " ";
  public static final String TEXT_196 = ";" + NL + "              " + NL + "                            " + NL + "              //";
  public static final String TEXT_197 = " b";
  public static final String TEXT_198 = ";" + NL + "              " + NL + "              a";
  public static final String TEXT_199 = ".set";
  public static final String TEXT_200 = "(ba";
  public static final String TEXT_201 = ");" + NL + "              " + NL + "              assertEqual ( a";
  public static final String TEXT_202 = ".get";
  public static final String TEXT_203 = "(),ba";
  public static final String TEXT_204 = ");              " + NL + "              " + NL + "                            " + NL + "              }" + NL + "              ";
  public static final String TEXT_205 = NL + "              " + NL + "              ";
  public static final String TEXT_206 = NL + "              /////// Association: -- ";
  public static final String TEXT_207 = " ";
  public static final String TEXT_208 = " /////// " + NL + "              //create ... without ..." + NL + "              test create";
  public static final String TEXT_209 = "Without";
  public static final String TEXT_210 = " {" + NL + "              " + NL + "              ";
  public static final String TEXT_211 = NL + "              ";
  public static final String TEXT_212 = " ";
  public static final String TEXT_213 = ";              " + NL + "              " + NL + "              assertEqual (a";
  public static final String TEXT_214 = ".numberOf";
  public static final String TEXT_215 = "s() , ";
  public static final String TEXT_216 = " );" + NL + "              }" + NL + "              " + NL + "              test overFlowIn";
  public static final String TEXT_217 = "For";
  public static final String TEXT_218 = " {" + NL + "              " + NL + "              ";
  public static final String TEXT_219 = NL + "              ";
  public static final String TEXT_220 = " ";
  public static final String TEXT_221 = ";  " + NL + "              " + NL + "              assertFalse(a";
  public static final String TEXT_222 = ".add";
  public static final String TEXT_223 = "(a";
  public static final String TEXT_224 = "));            " + NL + "              " + NL + "              assertEqual (a";
  public static final String TEXT_225 = ".numberOf";
  public static final String TEXT_226 = "s() , ";
  public static final String TEXT_227 = " );" + NL + "              }" + NL + "              " + NL + "              test belowBoundaryIn";
  public static final String TEXT_228 = "For";
  public static final String TEXT_229 = " {" + NL + "              " + NL + "              ";
  public static final String TEXT_230 = NL + "              ";
  public static final String TEXT_231 = " ";
  public static final String TEXT_232 = ";  " + NL + "              " + NL + "              assertFalse(a";
  public static final String TEXT_233 = ".remove";
  public static final String TEXT_234 = "(a2a";
  public static final String TEXT_235 = "));            " + NL + "              " + NL + "              assertEqual (a";
  public static final String TEXT_236 = ".numberOf";
  public static final String TEXT_237 = "s() , ";
  public static final String TEXT_238 = " );" + NL + "              }" + NL + "              " + NL + "              " + NL + "              ";
  public static final String TEXT_239 = " " + NL;
  public static final String TEXT_240 = " " + NL + NL + " }";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TestModelGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 22 "../../../../../UmpleTLTemplates/TestModelGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  @Override
  // line 28 "../../../../../UmpleTLTemplates/TestModelGenerator.ump"
   public String getCode(UmpleModel model, UmpleElement uElement){
    return null;
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 35 "../../../../../UmpleTLTemplates/TestModelGenerator.ump"
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

  public StringBuilder _getCode(Integer numSpaces, StringBuilder sb, UmpleModel model){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    /*TestModelGenerator*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
  //UmpleClass uClass = (UmpleClass) uElement;
  //GeneratedClass gClass = uClass.getGeneratedClass();
  TestGenerator gen = new TestGenerator();
  gen.setModel(model);
  
  //appendln(realSb, gen.translate("beforeCode", uClass));

  HashMap<String,String> codeInjectionMap = new HashMap<String,String>();
  /*for (CodeInjection inject : uClass.getCodeInjections())
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
  }*/
  boolean isFirst = true;

    realSb.append(TEXT_2);
    // if (uClass.numberOfComments() > 0) { if(!uClass.getComments().get(0).getIsInline()) {append(realSb, "\n{0}", Comment.format("Multiline",uClass.getComments()));} else { append(realSb, "\n{0}", Comment.format("Multiline",uClass.getComments()));} } 
    realSb.append(TEXT_3);
    realSb.append(model.getUmpleFile().getFileName().subSequence(0, model.getUmpleFile().getFileName().length()-4));
    realSb.append(TEXT_4);
    realSb.append(model.getUmpleFile().getFileName().subSequence(0, model.getUmpleFile().getFileName().length()-4));
    realSb.append(TEXT_5);
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


    realSb.append(TEXT_6);
    realSb.append(model.getUmpleFile().getFileName());
    realSb.append(TEXT_7);
    /*members_AllAssociations*/
    
/*
This file creates the necessary attributes that the class will need for a successful foreign key to another class (association)
It creates local copies of the foreign class' private key attributes. 
Note: The foreign key constraint is not defined here, as the associated class may not be defined yet. See the members_AllForeignKeys.jet file for those.
*/

  appendln(realSb, "");
  appendln(realSb, "  /*-------------------------*/");
  appendln(realSb, "  /*  Association Test       */");
  appendln(realSb, "  /*-------------------------*/");
  
  for (UmpleClass uClass : model.getUmpleClasses())
  {
  
  appendln(realSb, "  /*-------------------------*/");
  appendln(realSb, "  /*  Class {0}       */",uClass.getName());
  appendln(realSb, "  /*-------------------------*/");
  
  if (!uClass.hasAssociations())
  { appendln(realSb, ""); }
  
  
  else{	
  
  
  isFirst = true;
  
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
   		//AssociationEnd myEnd = as.getIsRightNavigable()?as.getEnd(0):as.getEnd(1);
        //AssociationEnd theirEnd = as.getIsRightNavigable()?as.getEnd(1):as.getEnd(0);
        //AssociationEnd myEnd = as.getIsRightNavigable()?as.getEnd(0):as.getEnd(1);
        //AssociationEnd theirEnd = as.getIsRightNavigable()?as.getEnd(1):as.getEnd(0);
        //boolean isBidirectional = as.getIsLeftNavigable()&&as.getIsRightNavigable();
        //boolean isTheirEndClass = theirEnd.getClassName().equals(uClass.getName());
        
        /*if (isTheirEndClass && isBidirectional)
          {
            myEnd = as.getEnd(1);
            theirEnd = as.getEnd(0);
          }*/
        
        //if(isBidirectional)
        //{
        	if (av.isOptionalMany() && av.getRelatedAssociation().isOptionalOne())
        	{
        		
    /*association_optionalOneToMany*/
    
/*
This file creates the necessary for Optional One To Many Association 
*/

  
  				  String buffName = "some" +uClass.getName();
  				  String buffName2 = "some"+av.getRelatedAssociation().getUmpleClass().getName();
  				  String myClass = uClass.getName();
  				  String otherClass = av.getRelatedAssociation().getUmpleClass().getName();
  				  
    realSb.append(TEXT_8);
    realSb.append(av.getRelatedAssociation().getMultiplicity().getRange());
    realSb.append(TEXT_9);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_10);
    realSb.append(uClass.getName());
    realSb.append(TEXT_11);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_12);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_13);
    realSb.append(uClass.getName());
    realSb.append(TEXT_14);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_15);
    realSb.append(myClass);
    realSb.append(TEXT_16);
    realSb.append(otherClass);
    realSb.append(TEXT_17);
    gen.resetInitializedObject();
    realSb.append(TEXT_18);
    buffName = "some"+av.getRelatedAssociation().getUmpleClass().getName();
    realSb.append(TEXT_19);
    realSb.append(uClass.getName());
    realSb.append(TEXT_20);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_21);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_22);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_23);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_24);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_25);
    realSb.append(uClass.getName());
    realSb.append(TEXT_26);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_27);
    realSb.append(uClass.getName());
    realSb.append(TEXT_28);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_29);
    realSb.append(uClass.getName());
    realSb.append(TEXT_30);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_31);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_32);
    realSb.append(myClass);
    realSb.append(TEXT_33);
    realSb.append(otherClass);
    realSb.append(TEXT_34);
    realSb.append(otherClass);
    realSb.append(TEXT_35);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_36);
    realSb.append(uClass.getName());
    realSb.append(TEXT_37);
    realSb.append(uClass.getName());
    realSb.append(TEXT_38);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_39);
    realSb.append(uClass.getName());
    realSb.append(TEXT_40);
    realSb.append(uClass.getName());
    realSb.append(TEXT_41);
    gen.resetInitializedObject();
    realSb.append(TEXT_42);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_43);
    realSb.append(myClass);
    realSb.append(TEXT_44);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_45);
    realSb.append(uClass.getName());
    realSb.append(TEXT_46);
    realSb.append(gen.dependencyInjection(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_47);
    realSb.append(otherClass);
    realSb.append(TEXT_48);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_49);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_50);
    realSb.append(uClass.getName());
    realSb.append(TEXT_51);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_52);
    realSb.append(myClass);
    realSb.append(TEXT_53);
    realSb.append(otherClass);
    realSb.append(TEXT_54);
    realSb.append(otherClass);
    realSb.append(TEXT_55);
    realSb.append(otherClass);
    realSb.append(TEXT_56);
    realSb.append(myClass);
    realSb.append(TEXT_57);
    realSb.append(otherClass);
    realSb.append(TEXT_58);
    gen.resetInitializedObject();
    realSb.append(TEXT_59);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_60);
    realSb.append(uClass.getName());
    realSb.append(TEXT_61);
    realSb.append(gen.dependencyInjection(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_62);
    realSb.append(otherClass);
    realSb.append(TEXT_63);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_64);
    realSb.append(gen.dependencyInjection(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_65);
    realSb.append(otherClass);
    realSb.append(TEXT_66);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_67);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_68);
    realSb.append(uClass.getName());
    realSb.append(TEXT_69);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_70);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_71);
    realSb.append(uClass.getName());
    realSb.append(TEXT_72);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_73);
    realSb.append(myClass);
    realSb.append(TEXT_74);
    realSb.append(otherClass);
    realSb.append(TEXT_75);
    realSb.append(otherClass);
    realSb.append(TEXT_76);
    realSb.append(myClass);
    realSb.append(TEXT_77);
    realSb.append(otherClass);
    realSb.append(TEXT_78);
    realSb.append(otherClass);
    realSb.append(TEXT_79);
    realSb.append(myClass);
    realSb.append(TEXT_80);
    realSb.append(otherClass);
    realSb.append(TEXT_81);
    realSb.append(otherClass);
    realSb.append(TEXT_82);
    realSb.append(myClass);
    realSb.append(TEXT_83);
    realSb.append(otherClass);
    realSb.append(TEXT_84);
    realSb.append(myClass);
    realSb.append(TEXT_85);
    realSb.append(otherClass);
    realSb.append(TEXT_86);
    gen.resetInitializedObject();
    realSb.append(TEXT_87);
    
  
  

    
        	}
        	
        	if (av.isOptionalOne() && av.getRelatedAssociation().isOptionalMany())
        	{
        		
    /*association_ManyToOptionalOne*/
    
/*
This file creates the necessary for Optional One To Many Association 
*/

  
  				  String buffName = "a" +uClass.getName();
  				  String buffName2 = "a"+av.getRelatedAssociation().getUmpleClass().getName();
    realSb.append(TEXT_88);
    realSb.append(av.getRelatedAssociation().getMultiplicity().getRange());
    realSb.append(TEXT_89);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_90);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_91);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_92);
    realSb.append(uClass.getName());
    realSb.append(TEXT_93);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_94);
    realSb.append(gen.dependencyInjection(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_95);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_96);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_97);
    realSb.append(buffName);
    realSb.append(TEXT_98);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_99);
    realSb.append(buffName2);
    realSb.append(TEXT_100);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_101);
    realSb.append(av.getUmpleClass().getName());
    realSb.append(TEXT_102);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_103);
    gen.resetInitializedObject();
    realSb.append(TEXT_104);
    
        	}
        	
        	if (av.isOptionalMany() && av.getRelatedAssociation().isMandatoryOne())
        {
        
    /*association_OneToMany*/
    

  
  String myClass = uClass.getName();
  String otherClass = av.getRelatedAssociation().getUmpleClass().getName();
  String relatedAv = av.getRelatedAssociation().getUmpleClass().getName();
  String buffName = "a" +uClass.getName();
    realSb.append(TEXT_105);
    realSb.append(av.getRelatedAssociation().getMultiplicity().getRange());
    realSb.append(TEXT_106);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_107);
    realSb.append(uClass.getName());
    realSb.append(TEXT_108);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_109);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_110);
    realSb.append(uClass.getName());
    realSb.append(TEXT_111);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_112);
    realSb.append(uClass.getName());
    realSb.append(TEXT_113);
    realSb.append(otherClass);
    realSb.append(TEXT_114);
    gen.resetInitializedObject();
    realSb.append(TEXT_115);
    realSb.append(uClass.getName());
    realSb.append(TEXT_116);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_117);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_118);
    realSb.append(uClass.getName());
    realSb.append(TEXT_119);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_120);
    realSb.append(gen.dependencyInjection(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_121);
    realSb.append(relatedAv);
    realSb.append(TEXT_122);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_123);
    realSb.append(relatedAv);
    realSb.append(TEXT_124);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_125);
    realSb.append(relatedAv);
    realSb.append(TEXT_126);
    realSb.append(uClass.getName());
    realSb.append(TEXT_127);
    realSb.append(myClass);
    realSb.append(TEXT_128);
    realSb.append(relatedAv);
    realSb.append(TEXT_129);
    realSb.append(uClass.getName());
    realSb.append(TEXT_130);
    realSb.append(myClass);
    realSb.append(TEXT_131);
    realSb.append(otherClass);
    realSb.append(TEXT_132);
    realSb.append(myClass);
    realSb.append(TEXT_133);
    realSb.append(myClass);
    realSb.append(TEXT_134);
    gen.resetInitializedObject();
    realSb.append(TEXT_135);
    realSb.append(relatedAv);
    realSb.append(TEXT_136);
    realSb.append(uClass.getName());
    realSb.append(TEXT_137);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_138);
    realSb.append(uClass.getName());
    realSb.append(TEXT_139);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_140);
    realSb.append(gen.dependencyInjection(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_141);
    realSb.append(otherClass);
    realSb.append(TEXT_142);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_143);
    realSb.append(uClass.getName());
    realSb.append(TEXT_144);
    realSb.append(relatedAv);
    realSb.append(TEXT_145);
    realSb.append(otherClass);
    realSb.append(TEXT_146);
    realSb.append(otherClass);
    realSb.append(TEXT_147);
    realSb.append(uClass.getName());
    realSb.append(TEXT_148);
    realSb.append(otherClass);
    realSb.append(TEXT_149);
    buffName= "a"+av.getUmpleClass().getName();
    realSb.append(TEXT_150);
    gen.resetInitializedObject();
    realSb.append(TEXT_151);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_152);
    realSb.append(uClass.getName());
    realSb.append(TEXT_153);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_154);
    realSb.append(uClass.getName());
    realSb.append(TEXT_155);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_156);
    realSb.append(gen.dependencyInjection(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_157);
    realSb.append(otherClass);
    realSb.append(TEXT_158);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_159);
    realSb.append(otherClass);
    realSb.append(TEXT_160);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_161);
    realSb.append(buffName);
    realSb.append(TEXT_162);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_163);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_164);
    realSb.append(buffName);
    realSb.append(TEXT_165);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_166);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_167);
    realSb.append(myClass);
    realSb.append(TEXT_168);
    realSb.append(otherClass);
    realSb.append(TEXT_169);
    realSb.append(otherClass);
    realSb.append(TEXT_170);
    realSb.append(otherClass);
    realSb.append(TEXT_171);
    realSb.append(myClass);
    realSb.append(TEXT_172);
    realSb.append(myClass);
    realSb.append(TEXT_173);
    realSb.append(myClass);
    realSb.append(TEXT_174);
    realSb.append(otherClass);
    realSb.append(TEXT_175);
    gen.resetInitializedObject();
    realSb.append(TEXT_176);
    
        		  

    
        appendln(realSb,"");
        }
        
        if (av.isMandatoryOne() && av.getRelatedAssociation().isMany())
        {
        
    /*association_ManyToOne*/
    

  String myClass = uClass.getName();
  String otherClass = av.getRelatedAssociation().getUmpleClass().getName();
  String relatedAv = av.getRelatedAssociation().getUmpleClass().getName();
  String buffName = "a" +uClass.getName();
    realSb.append(TEXT_177);
    realSb.append(av.getRelatedAssociation().getMultiplicity().getRange());
    realSb.append(TEXT_178);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_179);
    realSb.append(uClass.getName());
    realSb.append(TEXT_180);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_181);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_182);
    realSb.append(uClass.getName());
    realSb.append(TEXT_183);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_184);
    realSb.append(uClass.getName());
    realSb.append(TEXT_185);
    realSb.append(otherClass);
    realSb.append(TEXT_186);
    realSb.append(relatedAv);
    realSb.append(TEXT_187);
    gen.resetInitializedObject();
    realSb.append(TEXT_188);
    realSb.append(relatedAv);
    realSb.append(TEXT_189);
    realSb.append(myClass);
    realSb.append(TEXT_190);
    realSb.append(gen.dependencyInjection(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_191);
    realSb.append(otherClass);
    realSb.append(TEXT_192);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_193);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_194);
    realSb.append(myClass);
    realSb.append(TEXT_195);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_196);
    realSb.append(otherClass);
    realSb.append(TEXT_197);
    realSb.append(gen.initiateClass(av.getRelatedAssociation().getUmpleClass()));
    realSb.append(TEXT_198);
    realSb.append(uClass.getName());
    realSb.append(TEXT_199);
    realSb.append(relatedAv);
    realSb.append(TEXT_200);
    realSb.append(otherClass);
    realSb.append(TEXT_201);
    realSb.append(uClass.getName());
    realSb.append(TEXT_202);
    realSb.append(relatedAv);
    realSb.append(TEXT_203);
    realSb.append(relatedAv);
    realSb.append(TEXT_204);
    gen.resetInitializedObject();
    realSb.append(TEXT_205);
    
        		  

    
        appendln(realSb,"");
        }
        
        if (av.isN())
        {
        
    /*association_NNToMany*/
    
/*
This file creates the necessary for Optional One To Many Association 
*/
				  String myClass = uClass.getName();
  				  String otherClass = av.getRelatedAssociation().getUmpleClass().getName();
  				  String buffName = "some" +uClass.getName();
    realSb.append(TEXT_206);
    realSb.append(av.getRelatedAssociation().getMultiplicity().getRange());
    realSb.append(TEXT_207);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_208);
    realSb.append(uClass.getName());
    realSb.append(TEXT_209);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_210);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_211);
    realSb.append(myClass);
    realSb.append(TEXT_212);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_213);
    realSb.append(uClass.getName());
    realSb.append(TEXT_214);
    realSb.append(otherClass);
    realSb.append(TEXT_215);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_216);
    realSb.append(uClass.getName());
    realSb.append(TEXT_217);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_218);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_219);
    realSb.append(myClass);
    realSb.append(TEXT_220);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_221);
    realSb.append(myClass);
    realSb.append(TEXT_222);
    realSb.append(otherClass);
    realSb.append(TEXT_223);
    realSb.append(otherClass);
    realSb.append(TEXT_224);
    realSb.append(uClass.getName());
    realSb.append(TEXT_225);
    realSb.append(otherClass);
    realSb.append(TEXT_226);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_227);
    realSb.append(uClass.getName());
    realSb.append(TEXT_228);
    realSb.append(av.getRelatedAssociation().getUmpleClass().getName());
    realSb.append(TEXT_229);
    realSb.append(gen.dependencyInjection(uClass));
    realSb.append(TEXT_230);
    realSb.append(myClass);
    realSb.append(TEXT_231);
    realSb.append(gen.initiateClass(uClass));
    realSb.append(TEXT_232);
    realSb.append(myClass);
    realSb.append(TEXT_233);
    realSb.append(otherClass);
    realSb.append(TEXT_234);
    realSb.append(otherClass);
    realSb.append(TEXT_235);
    realSb.append(uClass.getName());
    realSb.append(TEXT_236);
    realSb.append(otherClass);
    realSb.append(TEXT_237);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_238);
    
  
  

    
        appendln(realSb,"");
        }
        	
        }
        
        
        
        
   //} 
  }
  }

    realSb.append(TEXT_239);
    // appendln(realSb, gen.translate("afterCode", uClass));
	  

    realSb.append(TEXT_240);
    //gen.writeModelFile(realSb);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getCode(UmpleModel model){
        StringBuilder sb = new StringBuilder();
    return this._getCode(0,sb,model).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}