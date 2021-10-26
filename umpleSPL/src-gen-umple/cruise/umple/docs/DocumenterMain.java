/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.docs;

// line 13 "../../../../src/Documenter_Code.ump"
public class DocumenterMain
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DocumenterMain()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 19 "../../../../src/Documenter_Code.ump"
   public static  void main(String [] args){
    Thread.currentThread().setUncaughtExceptionHandler(new UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new UmpleExceptionHandler());
    console = "";
     
    if (args.length < 2)
    {
      println("Usage: java -jar umpledocs.jar <data_dir> <output_dir>" + System.lineSeparator() 
              + "Example: java -jar umple-docs.jar docs output");
      return;
    }
     
    String dataDirectory = args[0];
    String outputDirectory = args[1];
    Documenter doc = new Documenter(dataDirectory,outputDirectory);
    boolean didGenerate = doc.generate();
    
    if (didGenerate)
    {
      println("Success generating user manual!");
    }
    for (String message : doc.getMessages())
    {
      println(message);
    }
    System.exit(doc.isSeriousProblem() ? -1 : 0);
  }

  // line 46 "../../../../src/Documenter_Code.ump"
   private static  void println(String output){
    console += output + System.lineSeparator();
    System.out.println(output);
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 15 "../../../../src/Documenter_Code.ump"
  private static String console = "" ;

  
  public static class UmpleExceptionHandler implements Thread.UncaughtExceptionHandler
  {
    public void uncaughtException(Thread t, Throwable e)
    {
      translate(e);
      if(e.getCause()!=null)
      {
        translate(e.getCause());
      }
      e.printStackTrace();
    }
    public void translate(Throwable e)
    {
      java.util.List<StackTraceElement> result = new java.util.ArrayList<StackTraceElement>();
      StackTraceElement[] elements = e.getStackTrace();
      try
      {
        for(StackTraceElement element:elements)
        {
          String className = element.getClassName();
          String methodName = element.getMethodName();
          boolean methodFound = false;
          int index = className.lastIndexOf('.')+1;
          try {
            java.lang.reflect.Method query = this.getClass().getMethod(className.substring(index)+"_"+methodName,new Class[]{});
            UmpleSourceData sourceInformation = (UmpleSourceData)query.invoke(this,new Object[]{});
            for(int i=0;i<sourceInformation.size();++i)
            {
              // To compensate for any offsets caused by injected code we need to loop through the other references to this function
              //  and adjust the start / length of the function.
              int functionStart = sourceInformation.getJavaLine(i) + (("main".equals(methodName))?3:1);
              int functionEnd = functionStart + sourceInformation.getLength(i);
              int afterInjectionLines = 0;
              //  We can leverage the fact that all inject statements are added to the uncaught exception list 
              //   before the functions that they are within
              for (int j = 0; j < i; j++) {
                if (sourceInformation.getJavaLine(j) - 1 >= functionStart &&
                    sourceInformation.getJavaLine(j) - 1 <= functionEnd &&
                    sourceInformation.getJavaLine(j) - 1 <= element.getLineNumber()) {
                    // A before injection, +2 for the comments surrounding the injected code
                    if (sourceInformation.getJavaLine(j) - 1 == functionStart) {
                        functionStart += sourceInformation.getLength(j) + 2;
                        functionEnd += sourceInformation.getLength(j) + 2;
                    } else {
                        // An after injection
                        afterInjectionLines += sourceInformation.getLength(j) + 2;
                        functionEnd += sourceInformation.getLength(j) + 2;
                    }
                }
              }
              int distanceFromStart = element.getLineNumber() - functionStart - afterInjectionLines;
              if(distanceFromStart>=0&&distanceFromStart<=sourceInformation.getLength(i))
              {
                result.add(new StackTraceElement(element.getClassName(),element.getMethodName(),sourceInformation.getFileName(i),sourceInformation.getUmpleLine(i)+distanceFromStart));
                methodFound = true;
                break;
              }
            }
          }
          catch (Exception e2){}
          if(!methodFound)
          {
            result.add(element);
          }
        }
      }
      catch (Exception e1)
      {
        e1.printStackTrace();
      }
      e.setStackTrace(result.toArray(new StackTraceElement[0]));
    }
  //The following methods Map Java lines back to their original Umple file / line    
    public UmpleSourceData Couple_removeIgnoredText(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(35).setJavaLines(240).setLengths(30);}
    public UmpleSourceData Couple_isBalanced(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(6).setJavaLines(212).setLengths(24);}
    public UmpleSourceData RulePart_isToEndOfLine(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(225).setJavaLines(311).setLengths(1);}
    public UmpleSourceData RulePart_isStatic(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(215).setJavaLines(301).setLengths(1);}
    public UmpleSourceData RulePart_getRegex(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(248).setJavaLines(336).setLengths(13);}
    public UmpleSourceData RulePart_removeNextIdentifiers(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(110).setJavaLines(196).setLengths(1);}
    public UmpleSourceData RulePart_getMultiplicity(){ return new UmpleSourceData().setFileNames("Parser.ump").setUmpleLines(73).setJavaLines(99).setLengths(1);}
    public UmpleSourceData RulePart_isEnumValue(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(289).setJavaLines(377).setLengths(13);}
    public UmpleSourceData RulePart_isMany(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(331).setJavaLines(419).setLengths(1);}
    public UmpleSourceData RulePart_isValidInnerValues(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(135).setJavaLines(221).setLengths(11);}
    public UmpleSourceData RulePart_getInnerNames(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(115).setJavaLines(201).setLengths(16);}
    public UmpleSourceData RulePart_isMultiWord(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(220).setJavaLines(306).setLengths(1);}
    public UmpleSourceData RulePart_isAlphanumeric(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(229).setJavaLines(316).setLengths(1);}
    public UmpleSourceData RulePart_isOne(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(321).setJavaLines(409).setLengths(1);}
    public UmpleSourceData RulePart_getInnerValues(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(150).setJavaLines(236).setLengths(56);}
    public UmpleSourceData RulePart_isRegex(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(244).setJavaLines(331).setLengths(1);}
    public UmpleSourceData RulePart_isWithinLimits(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(74).setJavaLines(160).setLengths(1);}
    public UmpleSourceData RulePart_isEnum(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(240).setJavaLines(326).setLengths(1);}
    public UmpleSourceData RulePart_regexMatches(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(305).setJavaLines(394).setLengths(6);}
    public UmpleSourceData RulePart_isOptional(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(326).setJavaLines(414).setLengths(1);}
    public UmpleSourceData RulePart_addNextIdentifier(){ return new UmpleSourceData().setFileNames("Parser.ump").setUmpleLines(72).setJavaLines(67).setLengths(1);}
    public UmpleSourceData RulePart_isRule(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(315).setJavaLines(404).setLengths(1);}
    public UmpleSourceData RulePart_isAnonymous(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(336).setJavaLines(424).setLengths(1);}
    public UmpleSourceData RulePart_getDisplayName(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(79).setJavaLines(165).setLengths(27);}
    public UmpleSourceData RulePart_isVariable(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(235).setJavaLines(321).setLengths(1);}
    public UmpleSourceData RulePart_toString(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(341).setJavaLines(429).setLengths(8);}
    public UmpleSourceData RulePart_hasInnerNames(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(210).setJavaLines(296).setLengths(1);}
    public UmpleSourceData RulePart_getEnums(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(265).setJavaLines(353).setLengths(20);}
    public UmpleSourceData Parser_findNewline(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1065).setJavaLines(1076).setLengths(3);}
    public UmpleSourceData Parser_cleanupRule(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(426).setJavaLines(423).setLengths(56);}
    public UmpleSourceData Parser_hasTokens(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1132).setJavaLines(1146).setLengths(1);}
    public UmpleSourceData Parser_addRulesInFile(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(576).setJavaLines(576).setLengths(59);}
    public UmpleSourceData Parser_getTokens(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1122).setJavaLines(1136).setLengths(1);}
    public UmpleSourceData Parser_toGrammarParts(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(486).setJavaLines(483).setLengths(80);}
    public UmpleSourceData Parser_parse(){ return new UmpleSourceData().setFileNames("Parser_Code.ump","Parser_Code.ump").setUmpleLines(700, 730).setJavaLines(702, 734).setLengths(14, 299);}
    public UmpleSourceData Parser_Parser(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(363).setJavaLines(359).setLengths(7);}
    public UmpleSourceData Parser_isBalanced(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1080).setJavaLines(1094).setLengths(33);}
    public UmpleSourceData Parser_addRule(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(639).setJavaLines(639).setLengths(49);}
    public UmpleSourceData Parser_findMatchingQuote(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1050).setJavaLines(1057).setLengths(11);}
    public UmpleSourceData Parser_numberOfTokens(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1127).setJavaLines(1141).setLengths(1);}
    public UmpleSourceData Parser_getRule(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(381).setJavaLines(376).setLengths(8);}
    public UmpleSourceData Parser_getToken(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1117).setJavaLines(1131).setLengths(1);}
    public UmpleSourceData Parser_reset(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(375).setJavaLines(370).setLengths(2);}
    public UmpleSourceData Parser_restorePrevious(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1033).setJavaLines(1037).setLengths(5);}
    public UmpleSourceData Parser_toString(){ return new UmpleSourceData().setFileNames("Parser_Code.ump","Parser_Code.ump").setUmpleLines(393, 571).setJavaLines(388, 571).setLengths(3, 1);}
    public UmpleSourceData Parser_toGrammarNoStyle(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(400).setJavaLines(395).setLengths(15);}
    public UmpleSourceData Parser_findCloseComment(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1073).setJavaLines(1087).setLengths(3);}
    public UmpleSourceData Parser_toGrammar(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(420).setJavaLines(418).setLengths(1);}
    public UmpleSourceData Parser_indexOf(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1137).setJavaLines(1151).setLengths(1);}
    public UmpleSourceData Parser_isWithinVariable(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1042).setJavaLines(1046).setLengths(3);}
    public UmpleSourceData RuleInstance_nextCombination(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1184).setJavaLines(238).setLengths(22);}
    public UmpleSourceData RuleInstance_analyzeRule(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1340).setJavaLines(394).setLengths(26);}
    public UmpleSourceData RuleInstance_updateLastNextPart(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1303).setJavaLines(357).setLengths(4);}
    public UmpleSourceData RuleInstance_addNextIdentifierFor(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1325).setJavaLines(379).setLengths(11);}
    public UmpleSourceData RuleInstance_configureDefinition(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1148).setJavaLines(202).setLengths(13);}
    public UmpleSourceData RuleInstance_hasMoreRuleParts(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1165).setJavaLines(219).setLengths(1);}
    public UmpleSourceData RuleInstance_nextRulePart(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1175).setJavaLines(229).setLengths(5);}
    public UmpleSourceData RuleInstance_removeOptionalPart(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1311).setJavaLines(365).setLengths(10);}
    public UmpleSourceData RuleInstance_updateNextPart(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1218).setJavaLines(272).setLengths(81);}
    public UmpleSourceData RuleInstance_resetRulePart(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1170).setJavaLines(224).setLengths(1);}
    public UmpleSourceData RuleInstance_updateNextIdentifier(){ return new UmpleSourceData().setFileNames("Parser_Code.ump").setUmpleLines(1210).setJavaLines(264).setLengths(4);}
    public UmpleSourceData Documenter_genPrevNext(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(196).setJavaLines(301).setLengths(9);}
    public UmpleSourceData Documenter_toSectionsToHideHtml(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(457).setJavaLines(549).setLengths(8);}
    public UmpleSourceData Documenter_toNavigationHtml(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(411).setJavaLines(503).setLengths(42);}
    public UmpleSourceData Documenter_toHtml(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump","Documenter_Code.ump").setUmpleLines(210, 300).setJavaLines(314, 391).setLengths(17, 14);}
    public UmpleSourceData Documenter_publish(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(90).setJavaLines(194).setLengths(103);}
    public UmpleSourceData Documenter_substituteCoreElements(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(317).setJavaLines(409).setLengths(90);}
    public UmpleSourceData Documenter_updateReferences(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(244).setJavaLines(335).setLengths(24);}
    public UmpleSourceData Documenter_parseGroupOrder(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(288).setJavaLines(379).setLengths(8);}
    public UmpleSourceData Documenter_generate(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(56).setJavaLines(160).setLengths(30);}
    public UmpleSourceData Documenter_parseContent(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(272).setJavaLines(363).setLengths(12);}
    public UmpleSourceData Content_getTitleFilename(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(473).setJavaLines(265).setLengths(1);}
    public UmpleSourceData Group_getGroupIdName(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(481).setJavaLines(160).setLengths(1);}
    public UmpleSourceData ContentParser_init(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(496).setJavaLines(142).setLengths(5);}
    public UmpleSourceData ContentParser_getGroup(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(505).setJavaLines(151).setLengths(10);}
    public UmpleSourceData ContentParser_analyze(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(519).setJavaLines(165).setLengths(89);}
    public UmpleSourceData Template_htmlTemplate(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(679).setJavaLines(108).setLengths(105);}
    public UmpleSourceData Template_htmlCoreTemplate(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(803).setJavaLines(239).setLengths(8);}
    public UmpleSourceData Template_tooltipTemplate(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(659).setJavaLines(90).setLengths(3);}
    public UmpleSourceData Template_navigationItemTemplateNoAnchor(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(627).setJavaLines(58).setLengths(1);}
    public UmpleSourceData Template_htmlHighlighterTemplate(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(788).setJavaLines(221).setLengths(10);}
    public UmpleSourceData Template_navigationHeaderTemplate(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(616).setJavaLines(47).setLengths(2);}
    public UmpleSourceData Template_exampleTemplate(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(632).setJavaLines(63).setLengths(12);}
    public UmpleSourceData Template_navigationItemTemplate(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(622).setJavaLines(53).setLengths(1);}
    public UmpleSourceData Template_syntaxTemplate(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(648).setJavaLines(79).setLengths(7);}
    public UmpleSourceData Template_videoURLTemplate(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(667).setJavaLines(97).setLengths(7);}
    public UmpleSourceData DocumenterMain_println(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(45).setJavaLines(57).setLengths(2);}
    public UmpleSourceData DocumenterMain_main(){ return new UmpleSourceData().setFileNames("Documenter_Code.ump").setUmpleLines(18).setJavaLines(28).setLengths(23);}
    public UmpleSourceData CodeGeneratorWithSubptions_prepare(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(22).setJavaLines(126).setLengths(1);}
    public UmpleSourceData CodeGeneratorWithSubptions_setSuboption(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(38).setJavaLines(86).setLengths(1);}
    public UmpleSourceData CodeGeneratorWithSubptions_setModel(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(17).setJavaLines(96).setLengths(1);}
    public UmpleSourceData CodeGeneratorWithSubptions_hasSuboption(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(33).setJavaLines(81).setLengths(1);}
    public UmpleSourceData CodeGeneratorWithSubptions_generate(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(21).setJavaLines(116).setLengths(1);}
    public UmpleSourceData CodeGeneratorWithSubptions_setOutput(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(18).setJavaLines(106).setLengths(1);}
    public UmpleSourceData CodeGeneratorWithSubptions_postpare(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(23).setJavaLines(136).setLengths(1);}
    public UmpleSourceData GeneratorHelper_toCode(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeClass.ump").setUmpleLines(58).setJavaLines(115).setLengths(56);}
    public UmpleSourceData GeneratorHelper_getFullActivityName(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeStateMachine.ump").setUmpleLines(153).setJavaLines(359).setLengths(13);}
    public UmpleSourceData GeneratorHelper_getNameWithCapital(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeStateMachine.ump").setUmpleLines(170).setJavaLines(376).setLengths(1);}
    public UmpleSourceData GeneratorHelper_prepareConsistentOutput(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeTrace.ump").setUmpleLines(241).setJavaLines(627).setLengths(21);}
    public UmpleSourceData GeneratorHelper_postpare(){ return new UmpleSourceData().setFileNames("GeneratorHelper_Code.ump","GeneratorHelper_Code.ump").setUmpleLines(30, 43).setJavaLines(44, 62).setLengths(10, 5);}
    public UmpleSourceData GeneratorHelper_doIndent(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeClass.ump").setUmpleLines(113).setJavaLines(175).setLengths(11);}
    public UmpleSourceData GeneratorHelper_prepareFinalState(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeStateMachine.ump").setUmpleLines(86).setJavaLines(289).setLengths(10);}
    public UmpleSourceData GeneratorHelper_prepareFileTracer(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeTrace.ump").setUmpleLines(144).setJavaLines(526).setLengths(27);}
    public UmpleSourceData GeneratorHelper_postpareStateMachine(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeStateMachine.ump","GeneratorHelper_CodeStateMachine.ump").setUmpleLines(22, 27).setJavaLines(218, 227).setLengths(1, 36);}
    public UmpleSourceData GeneratorHelper_postpareTrace(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeTrace.ump","GeneratorHelper_CodeTrace.ump").setUmpleLines(19, 23).setJavaLines(397, 406).setLengths(1, 1);}
    public UmpleSourceData GeneratorHelper_outputRedundant(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeTrace.ump").setUmpleLines(267).setJavaLines(656).setLengths(9);}
    public UmpleSourceData GeneratorHelper_postpareClass(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeClass.ump","GeneratorHelper_CodeClass.ump").setUmpleLines(21, 35).setJavaLines(75, 92).setLengths(9, 19);}
    public UmpleSourceData GeneratorHelper_getLogConfigCode(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeTrace.ump").setUmpleLines(199).setJavaLines(582).setLengths(36);}
    public UmpleSourceData GeneratorHelper_prepareAutoTransitions(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeStateMachine.ump").setUmpleLines(67).setJavaLines(267).setLengths(14);}
    public UmpleSourceData GeneratorHelper_prepareStringTracer(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeTrace.ump").setUmpleLines(108).setJavaLines(487).setLengths(17);}
    public UmpleSourceData GeneratorHelper_prepareConsoleTracer(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeTrace.ump").setUmpleLines(128).setJavaLines(508).setLengths(14);}
    public UmpleSourceData GeneratorHelper_isValidReturnStatement(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeClass.ump").setUmpleLines(127).setJavaLines(190).setLengths(20);}
    public UmpleSourceData GeneratorHelper_prepareNestedStateMachine(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeStateMachine.ump").setUmpleLines(101).setJavaLines(307).setLengths(48);}
    public UmpleSourceData GeneratorHelper_postpareInternalStates(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeStateMachine.ump").setUmpleLines(176).setJavaLines(385).setLengths(8);}
    public UmpleSourceData GeneratorHelper_prepareAllTracers(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeTrace.ump").setUmpleLines(40).setJavaLines(416).setLengths(60);}
    public UmpleSourceData GeneratorHelper_prepareLog4jTracer(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeTrace.ump").setUmpleLines(175).setJavaLines(557).setLengths(21);}
    public UmpleSourceData GeneratorHelper_getWillGenerateString(){ return new UmpleSourceData().setFileNames("GeneratorHelper_CodeTrace.ump").setUmpleLines(36).setJavaLines(411).setLengths(1);}
    public UmpleSourceData NothingGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeNothing.ump").setUmpleLines(20).setJavaLines(50).setLengths(2);}
    public UmpleSourceData JsonParser_stripQuotes(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(114).setJavaLines(138).setLengths(8);}
    public UmpleSourceData JsonParser_init(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(17).setJavaLines(41).setLengths(9);}
    public UmpleSourceData JsonParser_handleJson(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(97).setJavaLines(121).setLengths(13);}
    public UmpleSourceData JsonParser_analyze(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(30).setJavaLines(54).setLengths(1);}
    public UmpleSourceData JsonParser_handleJsonEntity(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(35).setJavaLines(59).setLengths(58);}
    public UmpleSourceData JsonParser_JsonParser(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(15).setJavaLines(27).setLengths(1);}
    public UmpleSourceData Json_getValue(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(180).setJavaLines(204).setLengths(2);}
    public UmpleSourceData Json_isComposite(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(131).setJavaLines(155).setLengths(1);}
    public UmpleSourceData Json_getAttribute(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(163).setJavaLines(187).setLengths(13);}
    public UmpleSourceData Json_getIntValue(){ return new UmpleSourceData().setFileNames("Json_Code.ump","Json_Code.ump").setUmpleLines(146, 186).setJavaLines(170, 210).setLengths(1, 1);}
    public UmpleSourceData Json_addArrayEntity(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(141).setJavaLines(165).setLengths(1);}
    public UmpleSourceData Json_getArray(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(151).setJavaLines(175).setLengths(8);}
    public UmpleSourceData Json_convertToInt(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(191).setJavaLines(215).setLengths(13);}
    public UmpleSourceData Json_addComposite(){ return new UmpleSourceData().setFileNames("Json_Code.ump").setUmpleLines(136).setJavaLines(160).setLengths(1);}
    public UmpleSourceData UmpleModel_addInterfacesRecursively(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(38).setJavaLines(1639).setLengths(5);}
    public UmpleSourceData UmpleModel_getDefaultGenerate(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(127).setJavaLines(2000).setLengths(10);}
    public UmpleSourceData UmpleModel_addSubClasses(){ return new UmpleSourceData().setFileNames("Umple_Code_Filter.ump").setUmpleLines(198).setJavaLines(1548).setLengths(12);}
    public UmpleSourceData UmpleModel_addUmpleTrait(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(20).setJavaLines(1593).setLengths(7);}
    public UmpleSourceData UmpleModel_getUmpleClass(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(16).setJavaLines(1615).setLengths(8);}
    public UmpleSourceData UmpleModel_getDefaultReflexiveAssociationPosition(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(229).setJavaLines(1773).setLengths(57);}
    public UmpleSourceData UmpleModel_run(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(170).setJavaLines(2045).setLengths(43);}
    public UmpleSourceData UmpleModel_getDefaultGeneratePath(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(141).setJavaLines(2014).setLengths(8);}
    public UmpleSourceData UmpleModel_UmpleModel(){ return new UmpleSourceData().setFileNames("Umple_Code.ump","Umple_Code.ump").setUmpleLines(78, 92).setJavaLines(203, 1970).setLengths(12, 2);}
    public UmpleSourceData UmpleModel_markRelatedClass(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(695).setJavaLines(1857).setLengths(13);}
    public UmpleSourceData UmpleModel_getUmpleInterface(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(27).setJavaLines(1627).setLengths(8);}
    public UmpleSourceData UmpleModel_markIncludedClasses(){ return new UmpleSourceData().setFileNames("Umple_Code_Filter.ump").setUmpleLines(32).setJavaLines(1441).setLengths(33);}
    public UmpleSourceData UmpleModel_addRelatedClassName(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(711).setJavaLines(1874).setLengths(4);}
    public UmpleSourceData UmpleModel_getAssociation(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(659).setJavaLines(1834).setLengths(8);}
    public UmpleSourceData UmpleModel_getAnalyzer(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(163).setJavaLines(2036).setLengths(1);}
    public UmpleSourceData UmpleModel_markClassByName(){ return new UmpleSourceData().setFileNames("Umple_Code_Filter.ump").setUmpleLines(161).setJavaLines(1511).setLengths(7);}
    public UmpleSourceData UmpleModel_clearGenerates(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(153).setJavaLines(2026).setLengths(1);}
    public UmpleSourceData UmpleModel_filterOutClasses(){ return new UmpleSourceData().setFileNames("Umple_Code_Filter.ump").setUmpleLines(69).setJavaLines(1478).setLengths(29);}
    public UmpleSourceData UmpleModel_generate(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(259).setJavaLines(2135).setLengths(31);}
    public UmpleSourceData UmpleModel_getStateMachineDefinition(){ return new UmpleSourceData().setFileNames("Umple_Code_StateMachine.ump").setUmpleLines(5).setJavaLines(1403).setLengths(8);}
    public UmpleSourceData UmpleModel_addGenerate(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(117).setJavaLines(1995).setLengths(1);}
    public UmpleSourceData UmpleModel_hasAnalyzer(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(158).setJavaLines(2031).setLengths(1);}
    public UmpleSourceData UmpleModel_getUmpleTraitTypeParameter(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(9).setJavaLines(1882).setLengths(6);}
    public UmpleSourceData UmpleModel_addUmpleInterface(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(106).setJavaLines(1984).setLengths(7);}
    public UmpleSourceData UmpleModel_getDefaultInterfacePosition(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(119).setJavaLines(1663).setLengths(11);}
    public UmpleSourceData UmpleModel_getMixset(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(24).setJavaLines(1898).setLengths(7);}
    public UmpleSourceData UmpleModel_newGenerator(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(220).setJavaLines(2096).setLengths(31);}
    public UmpleSourceData UmpleModel_addUmpleClass(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(6).setJavaLines(1604).setLengths(7);}
    public UmpleSourceData UmpleModel_findValidLanguages(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(35).setJavaLines(1927).setLengths(39);}
    public UmpleSourceData UmpleModel_getTraceType(){ return new UmpleSourceData().setFileNames("Trace.ump").setUmpleLines(18).setJavaLines(636).setLengths(1);}
    public UmpleSourceData UmpleModel_getDefaultAssociationPosition(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(134).setJavaLines(1678).setLengths(91);}
    public UmpleSourceData UmpleModel_getFilter(){ return new UmpleSourceData().setFileNames("Umple_Code_Filter.ump").setUmpleLines(214).setJavaLines(1564).setLengths(13);}
    public UmpleSourceData UmpleModel_extractAnalyzersFromParser(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(314).setJavaLines(2177).setLengths(1);}
    public UmpleSourceData UmpleModel_getUmpleTrait(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(8).setJavaLines(1581).setLengths(8);}
    public UmpleSourceData UmpleModel_getDefaultClassPosition(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(104).setJavaLines(1648).setLengths(11);}
    public UmpleSourceData UmpleModel_addAssociationClass(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(671).setJavaLines(1846).setLengths(7);}
    public UmpleSourceData UmpleModel_hasEnum(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(319).setJavaLines(2186).setLengths(6);}
    public UmpleSourceData UmpleModel_getUmpleElements(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(98).setJavaLines(1976).setLengths(4);}
    public UmpleSourceData UmpleModel_getUmpleFile(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(40).setJavaLines(1916).setLengths(7);}
    public UmpleSourceData UmpleModel_applyFilter(){ return new UmpleSourceData().setFileNames("Umple_Code_Filter.ump").setUmpleLines(6).setJavaLines(1415).setLengths(22);}
    public UmpleSourceData UmpleModel_addSuperClasses(){ return new UmpleSourceData().setFileNames("Umple_Code_Filter.ump","Umple_Code_Filter.ump").setUmpleLines(172, 185).setJavaLines(1522, 1535).setLengths(9, 9);}
    public UmpleSourceData UmpleFile_getFileStream(){ return new UmpleSourceData().setFileNames("UmpleHelper_Code.ump").setUmpleLines(43).setJavaLines(99).setLengths(1);}
    public UmpleSourceData UmpleFile_addLinkedFiles(){ return new UmpleSourceData().setFileNames("UmpleHelper_Code.ump").setUmpleLines(53).setJavaLines(113).setLengths(1);}
    public UmpleSourceData UmpleFile_getParent(){ return new UmpleSourceData().setFileNames("UmpleHelper_Code.ump").setUmpleLines(26).setJavaLines(62).setLengths(1);}
    public UmpleSourceData UmpleFile_getName(){ return new UmpleSourceData().setFileNames("Mixset.ump").setUmpleLines(33).setJavaLines(70).setLengths(1);}
    public UmpleSourceData UmpleFile_UmpleFile(){ return new UmpleSourceData().setFileNames("UmpleHelper_Code.ump","UmpleHelper_Code.ump").setUmpleLines(16, 21).setJavaLines(75, 80).setLengths(1, 1);}
    public UmpleSourceData UmpleFile_getLinkedFiles(){ return new UmpleSourceData().setFileNames("UmpleHelper_Code.ump").setUmpleLines(58).setJavaLines(122).setLengths(1);}
    public UmpleSourceData UmpleFile_getPath(){ return new UmpleSourceData().setFileNames("UmpleHelper_Code.ump").setUmpleLines(25).setJavaLines(57).setLengths(1);}
    public UmpleSourceData UmpleFile_getSimpleFileName(){ return new UmpleSourceData().setFileNames("UmpleHelper_Code.ump").setUmpleLines(30).setJavaLines(85).setLengths(10);}
    public UmpleSourceData UmpleFile_doesFileExist(){ return new UmpleSourceData().setFileNames("UmpleHelper_Code.ump").setUmpleLines(48).setJavaLines(104).setLengths(1);}
    public UmpleSourceData UmpleFile_getFileName(){ return new UmpleSourceData().setFileNames("UmpleHelper_Code.ump").setUmpleLines(24).setJavaLines(52).setLengths(1);}
    public UmpleSourceData Mixset_Mixset(){ return new UmpleSourceData().setFileNames("Mixset.ump").setUmpleLines(46).setJavaLines(37).setLengths(1);}
    public UmpleSourceData Mixset_getName(){ return new UmpleSourceData().setFileNames("Mixset.ump").setUmpleLines(65).setJavaLines(202).setLengths(1);}
    public UmpleSourceData MethodBody_MethodBody(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump","Umple_CodeMethod.ump").setUmpleLines(185, 189).setJavaLines(391, 396).setLengths(1, 1);}
    public UmpleSourceData MethodBody_indexOfMixsetClosingBracket(){ return new UmpleSourceData().setFileNames("Aspect_refactored.ump").setUmpleLines(80).setJavaLines(411).setLengths(18);}
    public UmpleSourceData MethodBody_getExtraCode(){ return new UmpleSourceData().setFileNames("Umple.ump","Umple_CodeMethod.ump").setUmpleLines(227, 193).setJavaLines(73, 401).setLengths(1, 1);}
    public UmpleSourceData MethodBody_setExtraCode(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(197).setJavaLines(406).setLengths(1);}
    public UmpleSourceData MethodBody_getMixsetsWithinMethod(){ return new UmpleSourceData().setFileNames("Aspect_refactored.ump").setUmpleLines(100).setJavaLines(433).setLengths(1);}
    public UmpleSourceData MethodBody_getMixsetsFromCode(){ return new UmpleSourceData().setFileNames("Aspect_refactored.ump").setUmpleLines(103).setJavaLines(438).setLengths(30);}
    public UmpleSourceData FeatureModel_getOrCreateFeatureLeafNode(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(428).setJavaLines(338).setLengths(7);}
    public UmpleSourceData FeatureModel_getFeatureLeafNode(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(415).setJavaLines(323).setLengths(6);}
    public UmpleSourceData FeatureModel_evaluateFeatureLink(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(466).setJavaLines(381).setLengths(76);}
    public UmpleSourceData FeatureModel_satisfyFeatureModel(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(549).setJavaLines(466).setLengths(14);}
    public UmpleSourceData FeatureModel_isUsedFeatureLeaf(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(442).setJavaLines(355).setLengths(16);}
    public UmpleSourceData FeatureNode_getUniqueFeatureNodeName(){ return new UmpleSourceData().setFileNames("FeatureModel.ump").setUmpleLines(40).setJavaLines(390).setLengths(1);}
    public UmpleSourceData CompoundFeatureNode_CompoundFeatureNode(){ return new UmpleSourceData().setFileNames("FeatureModel.ump").setUmpleLines(50).setJavaLines(29).setLengths(1);}
    public UmpleSourceData FeatureLeaf_getUniqueFeatureNodeName(){ return new UmpleSourceData().setFileNames("FeatureModel.ump").setUmpleLines(62).setJavaLines(94).setLengths(1);}
    public UmpleSourceData FeatureLeaf_FeatureLeaf(){ return new UmpleSourceData().setFileNames("FeatureModel.ump").setUmpleLines(59).setJavaLines(28).setLengths(1);}
    public UmpleSourceData FragmentFeatureLeaf_FragmentFeatureLeaf(){ return new UmpleSourceData().setFileNames("FeatureModel.ump").setUmpleLines(72).setJavaLines(29).setLengths(1);}
    public UmpleSourceData MultiplicityFeatureConnectingOpType_MultiplicityFeatureConnectingOpType(){ return new UmpleSourceData().setFileNames("FeatureModel.ump").setUmpleLines(90).setJavaLines(28).setLengths(1);}
    public UmpleSourceData XORFeatureConnectingOpType_XORFeatureConnectingOpType(){ return new UmpleSourceData().setFileNames("FeatureModel.ump").setUmpleLines(98).setJavaLines(24).setLengths(4);}
    public UmpleSourceData ConstraintTree_isNegatable(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(132).setJavaLines(302).setLengths(1);}
    public UmpleSourceData ConstraintTree_addElementAll(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(23).setJavaLines(190).setLengths(8);}
    public UmpleSourceData ConstraintTree_compareBranches(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1598).setJavaLines(527).setLengths(67);}
    public UmpleSourceData ConstraintTree_createNew(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(152).setJavaLines(324).setLengths(1);}
    public UmpleSourceData ConstraintTree_iterator(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(250).setJavaLines(425).setLengths(32);}
    public UmpleSourceData ConstraintTree_getNamedNames(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(221).setJavaLines(395).setLengths(21);}
    public UmpleSourceData ConstraintTree_getType(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(287).setJavaLines(465).setLengths(1);}
    public UmpleSourceData ConstraintTree_negate(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(125).setJavaLines(293).setLengths(1);}
    public UmpleSourceData ConstraintTree_clone(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(140).setJavaLines(311).setLengths(4);}
    public UmpleSourceData ConstraintTree_isNegateVariable(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(90).setJavaLines(260).setLengths(25);}
    public UmpleSourceData ConstraintTree_negateVariable(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(38).setJavaLines(207).setLengths(45);}
    public UmpleSourceData ConstraintTree_addElement(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(164).setJavaLines(337).setLengths(49);}
    public UmpleSourceData ConstraintTree_getDisplayBrackets(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(383).setJavaLines(135).setLengths(1);}
    public UmpleSourceData ConstraintTree_isEqualTo(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1555).setJavaLines(479).setLengths(38);}
    public UmpleSourceData TraceConstraint_addElement(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(304).setJavaLines(137).setLengths(17);}
    public UmpleSourceData TraceConstraint_createNew(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(294).setJavaLines(127).setLengths(6);}
    public UmpleSourceData Precondition_addElement(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(333).setJavaLines(63).setLengths(18);}
    public UmpleSourceData Precondition_createNew(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(328).setJavaLines(58).setLengths(1);}
    public UmpleSourceData Postcondition_addElement(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(363).setJavaLines(80).setLengths(18);}
    public UmpleSourceData Postcondition_createNew(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(358).setJavaLines(75).setLengths(1);}
    public UmpleSourceData ConstraintOperator_isNegatable(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(498).setJavaLines(400).setLengths(5);}
    public UmpleSourceData ConstraintOperator_correctForPrimitive(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(463).setJavaLines(364).setLengths(8);}
    public UmpleSourceData ConstraintOperator_correctForCardinality(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(441).setJavaLines(341).setLengths(15);}
    public UmpleSourceData ConstraintOperator_iterator(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(592).setJavaLines(496).setLengths(41);}
    public UmpleSourceData ConstraintOperator_getRight(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(430).setJavaLines(78).setLengths(1);}
    public UmpleSourceData ConstraintOperator_getType(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(389).setJavaLines(286).setLengths(1);}
    public UmpleSourceData ConstraintOperator_negate(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(510).setJavaLines(413).setLengths(75);}
    public UmpleSourceData ConstraintOperator_addOperand(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(397).setJavaLines(296).setLengths(36);}
    public UmpleSourceData ConstraintOperator_flip(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(478).setJavaLines(380).setLengths(16);}
    public UmpleSourceData ConstraintOperator_getLeft(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(429).setJavaLines(73).setLengths(1);}
    public UmpleSourceData ConstraintAttribute_getName(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(640).setJavaLines(114).setLengths(1);}
    public UmpleSourceData ConstraintAttribute_getType(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(657).setJavaLines(137).setLengths(1);}
    public UmpleSourceData ConstraintAttribute_retrieveClassifier(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(646).setJavaLines(123).setLengths(10);}
    public UmpleSourceData ConstraintLiteral_getType(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(662).setJavaLines(97).setLengths(1);}
    public UmpleSourceData ConstraintUnassignedName_getName(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(669).setJavaLines(100).setLengths(1);}
    public UmpleSourceData ConstraintUnassignedName_getType(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(671).setJavaLines(105).setLengths(1);}
    public UmpleSourceData ConstraintMethodParameter_getName(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(681).setJavaLines(100).setLengths(1);}
    public UmpleSourceData ConstraintMethodParameter_getType(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(683).setJavaLines(105).setLengths(1);}
    public UmpleSourceData ConstraintVariable_getValue(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(694).setJavaLines(40).setLengths(1);}
    public UmpleSourceData ConstraintVariable_iterator(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(702).setJavaLines(50).setLengths(27);}
    public UmpleSourceData ConstraintVariable_retrieveClassifier(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(697).setJavaLines(45).setLengths(1);}
    public UmpleSourceData ConstraintState_getName(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(740).setJavaLines(36).setLengths(1);}
    public UmpleSourceData ConstraintState_getType(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(742).setJavaLines(41).setLengths(1);}
    public UmpleSourceData ConstraintStateMachine_getName(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(749).setJavaLines(36).setLengths(1);}
    public UmpleSourceData ConstraintStateMachine_getType(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(751).setJavaLines(41).setLengths(1);}
    public UmpleSourceData ConstraintPort_getName(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(761).setJavaLines(99).setLengths(1);}
    public UmpleSourceData ConstraintPort_getType(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(763).setJavaLines(104).setLengths(1);}
    public UmpleSourceData ModelConstraint_addAssociationEnd(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(421).setJavaLines(315).setLengths(4);}
    public UmpleSourceData ModelConstraint_getMostRecent(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(786).setJavaLines(126).setLengths(1);}
    public UmpleSourceData ModelConstraint_addModelConstraint(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(793).setJavaLines(178).setLengths(2);}
    public UmpleSourceData ModelConstraint_setAssociationType(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(428).setJavaLines(323).setLengths(4);}
    public UmpleSourceData ModelConstraint_evaluate(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(797).setJavaLines(275).setLengths(36);}
    public UmpleSourceData ModelConstraintSuperClass_evaluate(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(845).setJavaLines(35).setLengths(43);}
    public UmpleSourceData ModelConstraintSubClass_evaluate(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(899).setJavaLines(35).setLengths(47);}
    public UmpleSourceData ModelConstraintAttributeFromName_evaluate(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(957).setJavaLines(35).setLengths(24);}
    public UmpleSourceData ModelConstraintAttributeFromClass_evaluate(){ return new UmpleSourceData().setFileNames("Umple_CodeConstraint.ump").setUmpleLines(992).setJavaLines(35).setLengths(47);}
    public UmpleSourceData CodeBlock_findKeywordAndReplace(){ return new UmpleSourceData().setFileNames("Umple_Code_StateMachine.ump").setUmpleLines(29).setJavaLines(69).setLengths(7);}
    public UmpleSourceData CodeBlock_getCodeWithLabels(){ return new UmpleSourceData().setFileNames("Aspect_refactored.ump").setUmpleLines(52).setJavaLines(255).setLengths(18);}
    public UmpleSourceData CodeBlock_removeKeyword(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(242).setJavaLines(148).setLengths(4);}
    public UmpleSourceData CodeBlock_ApplyTypeParameters(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(326).setJavaLines(84).setLengths(41);}
    public UmpleSourceData CodeBlock_hasCode(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(308).setJavaLines(224).setLengths(1);}
    public UmpleSourceData CodeBlock_hasKeyword(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(266).setJavaLines(177).setLengths(5);}
    public UmpleSourceData CodeBlock_setCode(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump","Umple_CodeMethod.ump").setUmpleLines(285, 292).setJavaLines(198, 206).setLengths(4, 4);}
    public UmpleSourceData CodeBlock_CodeBlock(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump","Umple_CodeMethod.ump","Umple_CodeMethod.ump").setUmpleLines(234, 275, 280).setJavaLines(137, 186, 192).setLengths(3, 2, 2);}
    public UmpleSourceData CodeBlock_hasAnAssociatedLanguage(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(314).setJavaLines(233).setLengths(8);}
    public UmpleSourceData CodeBlock_addKeyword(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(252).setJavaLines(160).setLengths(8);}
    public UmpleSourceData CodeBlock_toString(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(325).setJavaLines(245).setLengths(6);}
    public UmpleSourceData CodeBlock_getCode(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump","Umple_CodeMethod.ump").setUmpleLines(299, 303).setJavaLines(214, 219).setLengths(1, 1);}
    public UmpleSourceData UmpleClass_addReferencedPackage(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(324).setJavaLines(3893).setLengths(4);}
    public UmpleSourceData UmpleClass_getAutoGeneratedConstructor(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(59).setJavaLines(3647).setLengths(8);}
    public UmpleSourceData UmpleClass_removeAttributeFromAutogeneratedConstructor(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(683).setJavaLines(4255).setLengths(26);}
    public UmpleSourceData UmpleClass_getGeneratedClass(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(461).setJavaLines(4037).setLengths(1);}
    public UmpleSourceData UmpleClass_isRoot(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(455).setJavaLines(4032).setLengths(1);}
    public UmpleSourceData UmpleClass_getApplicableCodeInjections(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(176).setJavaLines(3742).setLengths(58);}
    public UmpleSourceData UmpleClass_getMethod(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(393).setJavaLines(3970).setLengths(25);}
    public UmpleSourceData UmpleClass_hasMethodInTraits(){ return new UmpleSourceData().setFileNames("Trait_refactored.ump").setUmpleLines(219).setJavaLines(4299).setLengths(6);}
    public UmpleSourceData UmpleClass_isUmpleClass(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(740).setJavaLines(4322).setLengths(1);}
    public UmpleSourceData UmpleClass_getEvents(){ return new UmpleSourceData().setFileNames("Umple_Code_StateMachine.ump").setUmpleLines(75).setJavaLines(3569).setLengths(15);}
    public UmpleSourceData UmpleClass_getAssociationVariable(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump","Umple_CodeClass.ump").setUmpleLines(333, 345).setJavaLines(3905, 3917).setLengths(8, 8);}
    public UmpleSourceData UmpleClass_createGeneratedClass(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(466).setJavaLines(4042).setLengths(6);}
    public UmpleSourceData UmpleClass_removeAllAutoGeneratedMethods(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(649).setJavaLines(4221).setLengths(6);}
    public UmpleSourceData UmpleClass_getAllAttributes(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(427).setJavaLines(4004).setLengths(12);}
    public UmpleSourceData UmpleClass_getAttribute(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(443).setJavaLines(4020).setLengths(8);}
    public UmpleSourceData UmpleClass_addStateDependentMethod(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(365).setJavaLines(3624).setLengths(9);}
    public UmpleSourceData UmpleClass_isGetterSetter(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(133).setJavaLines(3695).setLengths(4);}
    public UmpleSourceData UmpleClass_hasSameType(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(382).setJavaLines(3959).setLengths(7);}
    public UmpleSourceData UmpleClass_isImmutable(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(492).setJavaLines(4070).setLengths(1);}
    public UmpleSourceData UmpleClass_deleteAttribute(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(636).setJavaLines(4209).setLengths(8);}
    public UmpleSourceData UmpleClass_getStateMachine(){ return new UmpleSourceData().setFileNames("Umple_Code_StateMachine.ump").setUmpleLines(114).setJavaLines(3608).setLengths(8);}
    public UmpleSourceData UmpleClass_removeAttribute(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(713).setJavaLines(2510).setLengths(4);}
    public UmpleSourceData UmpleClass_immutabilityAssociationRulesSatisfied(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump","Umple_CodeClass.ump").setUmpleLines(580, 626).setJavaLines(4154, 4200).setLengths(42, 5);}
    public UmpleSourceData UmpleClass_getAssociationVariableFor(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(357).setJavaLines(3929).setLengths(8);}
    public UmpleSourceData UmpleClass_getAllTraceDirectives(){ return new UmpleSourceData().setFileNames("Trace_refactored.ump").setUmpleLines(62).setJavaLines(4309).setLengths(9);}
    public UmpleSourceData UmpleClass_UmpleClass(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(100).setJavaLines(3659).setLengths(1);}
    public UmpleSourceData UmpleClass_setAncestorIsImmutable(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(556).setJavaLines(4131).setLengths(11);}
    public UmpleSourceData UmpleClass_propagateImmutabilityToAllRelationships(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(513).setJavaLines(4088).setLengths(20);}
    public UmpleSourceData UmpleClass_addAssociationVariable(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(735).setJavaLines(2559).setLengths(2);}
    public UmpleSourceData UmpleClass_hasAllAttributes(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(422).setJavaLines(3999).setLengths(1);}
    public UmpleSourceData UmpleClass_notifySubclassesAncestorImmutable(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(537).setJavaLines(4112).setLengths(15);}
    public UmpleSourceData UmpleClass_matchOperationMethod(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(140).setJavaLines(3703).setLengths(31);}
    public UmpleSourceData UmpleClass_findOrCreateEvent(){ return new UmpleSourceData().setFileNames("Umple_Code_StateMachine.ump").setUmpleLines(94).setJavaLines(3588).setLengths(16);}
    public UmpleSourceData UmpleClass_getAllStateMachines(){ return new UmpleSourceData().setFileNames("Umple_Code_StateMachine.ump").setUmpleLines(46).setJavaLines(3544).setLengths(7);}
    public UmpleSourceData UmpleClass_getMethodNames(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(106).setJavaLines(3664).setLengths(23);}
    public UmpleSourceData UmpleClass_enforceImmutabilityInheritanceRules(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(571).setJavaLines(4146).setLengths(4);}
    public UmpleSourceData UmpleClass_getApplicableCodeInjectionsCustomMethod(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(239).setJavaLines(3808).setLengths(81);}
    public UmpleSourceData UmpleClass_setImmutable(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(497).setJavaLines(4075).setLengths(9);}
    public UmpleSourceData UmpleClass_isAttributeClass(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(476).setJavaLines(4052).setLengths(8);}
    public UmpleSourceData UmpleClass_getPort(){ return new UmpleSourceData().setFileNames("Structure.ump").setUmpleLines(27).setJavaLines(4344).setLengths(8);}
    public UmpleSourceData UmpleClass_removeAutoGenerateMethodsForAttribute(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(659).setJavaLines(4231).setLengths(20);}
    public UmpleSourceData UmpleClass_hasEnum(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(720).setJavaLines(4289).setLengths(6);}
    public UmpleSourceData UmpleClass_getUmpleTestCase(){ return new UmpleSourceData().setFileNames("Test_Code.ump").setUmpleLines(23).setJavaLines(4331).setLengths(9);}
    public UmpleSourceData UmpleClass_setExtendsClass(){ return new UmpleSourceData().setFileNames("Umple.ump","Umple_CodeClass.ump").setUmpleLines(737, 72).setJavaLines(2129, 2143).setLengths(1, 25);}
    public UmpleSourceData UmpleClass_getStateMachines(){ return new UmpleSourceData().setFileNames("Umple_Code_StateMachine.ump").setUmpleLines(62).setJavaLines(3555).setLengths(10);}
    public UmpleSourceData UmpleClass_getGeneralTPAppliedByName(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(308).setJavaLines(3637).setLengths(6);}
    public UmpleSourceData UmpleClass_hasImplementedMethodIncludingWithinParentClasses(){ return new UmpleSourceData().setFileNames("Umple_CodeClass.ump").setUmpleLines(368).setJavaLines(3941).setLengths(10);}
    public UmpleSourceData StateMachine_getEvent(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(43).setJavaLines(477).setLengths(17);}
    public UmpleSourceData StateMachine_getFinalStates(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(204).setJavaLines(631).setLengths(4);}
    public UmpleSourceData StateMachine_findStateDotNotaion(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(316).setJavaLines(743).setLengths(50);}
    public UmpleSourceData StateMachine_getHasEntryAction(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(23).setJavaLines(457).setLengths(1);}
    public UmpleSourceData StateMachine_getAllEvents(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(75).setJavaLines(510).setLengths(33);}
    public UmpleSourceData StateMachine_getImmediateNestedStateMachines(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(287).setJavaLines(714).setLengths(1);}
    public UmpleSourceData StateMachine_getSuperStateMachine(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(465).setJavaLines(892).setLengths(13);}
    public UmpleSourceData StateMachine_setUmpleClass(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(33).setJavaLines(241).setLengths(1);}
    public UmpleSourceData StateMachine_getEvents(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(112).setJavaLines(547).setLengths(15);}
    public UmpleSourceData StateMachine_setUmpleTrait(){ return new UmpleSourceData().setFileNames("Trait_refactored.ump").setUmpleLines(159).setJavaLines(279).setLengths(1);}
    public UmpleSourceData StateMachine_getEventByMethod(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(483).setJavaLines(915).setLengths(14);}
    public UmpleSourceData StateMachine_getStartState(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(246).setJavaLines(673).setLengths(8);}
    public UmpleSourceData StateMachine_getNestedStateMachines(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump","StateMachine_Code.ump").setUmpleLines(282, 292).setJavaLines(709, 719).setLengths(1, 3);}
    public UmpleSourceData StateMachine_addNestedStateMachinesTo(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump","StateMachine_Code.ump").setUmpleLines(299, 304).setJavaLines(726, 731).setLengths(1, 8);}
    public UmpleSourceData StateMachine_hasFinalStates(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(212).setJavaLines(639).setLengths(1);}
    public UmpleSourceData StateMachine_getFullName(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(433).setJavaLines(859).setLengths(17);}
    public UmpleSourceData StateMachine_addState(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(454).setJavaLines(880).setLengths(4);}
    public UmpleSourceData StateMachine_deleteState(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(164).setJavaLines(591).setLengths(8);}
    public UmpleSourceData StateMachine_findState(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump","StateMachine_Code.ump","StateMachine_Code.ump").setUmpleLines(188, 196, 371).setJavaLines(615, 623, 797).setLengths(4, 4, 44);}
    public UmpleSourceData StateMachine_getAllTransitions(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(131).setJavaLines(566).setLengths(17);}
    public UmpleSourceData StateMachine_getNullState(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(258).setJavaLines(685).setLengths(8);}
    public UmpleSourceData StateMachine_getRootStateMachine(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(419).setJavaLines(845).setLengths(10);}
    public UmpleSourceData StateMachine_findOrCreateEvent(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(234).setJavaLines(661).setLengths(8);}
    public UmpleSourceData StateMachine_getHasExitAction(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(18).setJavaLines(452).setLengths(1);}
    public UmpleSourceData StateMachine_getFinalStatesIn(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(217).setJavaLines(644).setLengths(13);}
    public UmpleSourceData StateMachine_getType(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(270).setJavaLines(697).setLengths(8);}
    public UmpleSourceData StateMachine_getHasAction(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(28).setJavaLines(462).setLengths(11);}
    public UmpleSourceData StateMachine_clone(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump","UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1683, 1725).setJavaLines(938, 984).setLengths(27, 9);}
    public UmpleSourceData StateMachine_findRegionBasedOnSequence(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1763).setJavaLines(1032).setLengths(19);}
    public UmpleSourceData StateMachine_getDeepHistoryState(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(176).setJavaLines(603).setLengths(8);}
    public UmpleSourceData StateMachine_getAllGuards(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(63).setJavaLines(498).setLengths(8);}
    public UmpleSourceData StateMachine_findStateBasedOnSequence(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1739).setJavaLines(1003).setLengths(19);}
    public UmpleSourceData State_getHasEntryAction(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(620).setJavaLines(901).setLengths(1);}
    public UmpleSourceData State_getIsHistoryState(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(68).setJavaLines(161).setLengths(1);}
    public UmpleSourceData State_addAction(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(568).setJavaLines(849).setLengths(3);}
    public UmpleSourceData State_exitableStateMachine(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(653).setJavaLines(935).setLengths(18);}
    public UmpleSourceData State_isFinalState(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(70).setJavaLines(220).setLengths(1);}
    public UmpleSourceData State_getTransitionsFor(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(602).setJavaLines(883).setLengths(9);}
    public UmpleSourceData State_getConcurrentRegion(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(716).setJavaLines(1004).setLengths(13);}
    public UmpleSourceData State_getActionsByType(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(640).setJavaLines(922).setLengths(9);}
    public UmpleSourceData State_isSubstateOf(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(517).setJavaLines(795).setLengths(10);}
    public UmpleSourceData State_getConcurrentParentState(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(701).setJavaLines(986).setLengths(9);}
    public UmpleSourceData State_isVisited(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(694).setJavaLines(976).setLengths(1);}
    public UmpleSourceData State_newTimedEventName(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(580).setJavaLines(861).setLengths(18);}
    public UmpleSourceData State_getRootStateMachine(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(735).setJavaLines(1026).setLengths(5);}
    public UmpleSourceData State_clear(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(689).setJavaLines(971).setLengths(1);}
    public UmpleSourceData State_findSuperState(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(531).setJavaLines(809).setLengths(12);}
    public UmpleSourceData State_getIsConcurrent(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(52).setJavaLines(143).setLengths(1);}
    public UmpleSourceData State_getHasExitAction(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(615).setJavaLines(896).setLengths(1);}
    public UmpleSourceData State_exitableSelfTransition(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(675).setJavaLines(957).setLengths(5);}
    public UmpleSourceData State_isSameState(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(505).setJavaLines(779).setLengths(8);}
    public UmpleSourceData State_deleteTransition(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(548).setJavaLines(829).setLengths(8);}
    public UmpleSourceData State_getType(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(575).setJavaLines(856).setLengths(1);}
    public UmpleSourceData State_getHasAction(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(625).setJavaLines(906).setLengths(8);}
    public UmpleSourceData State_clone(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1797).setJavaLines(1043).setLengths(29);}
    public UmpleSourceData State_getIsDeepHistoryState(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(69).setJavaLines(169).setLengths(1);}
    public UmpleSourceData State_addTransition(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(560).setJavaLines(841).setLengths(4);}
    public UmpleSourceData State_visit(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(684).setJavaLines(966).setLengths(1);}
    public UmpleSourceData Activity_getActivityCode(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(97).setJavaLines(135).setLengths(3);}
    public UmpleSourceData Activity_setCodeblock(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(103).setJavaLines(104).setLengths(5);}
    public UmpleSourceData Activity_setActivityCode(){ return new UmpleSourceData().setFileNames("StateMachine.ump","StateMachine.ump").setUmpleLines(95, 110).setJavaLines(83, 220).setLengths(1, 6);}
    public UmpleSourceData Activity_clone(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1922).setJavaLines(238).setLengths(10);}
    public UmpleSourceData Activity_Activity(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(94).setJavaLines(55).setLengths(1);}
    public UmpleSourceData Transition_createPlaceholder(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(747).setJavaLines(369).setLengths(3);}
    public UmpleSourceData Transition_isTransitionAndCross(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(825).setJavaLines(450).setLengths(14);}
    public UmpleSourceData Transition_getSmToExit(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(756).setJavaLines(380).setLengths(62);}
    public UmpleSourceData Transition_isEqualToTransition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1514).setJavaLines(494).setLengths(21);}
    public UmpleSourceData Transition_clone(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1501).setJavaLines(476).setLengths(8);}
    public UmpleSourceData Action_Action(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(159).setJavaLines(50).setLengths(1);}
    public UmpleSourceData Action_getActionCode(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(162).setJavaLines(138).setLengths(3);}
    public UmpleSourceData Action_setCodeblock(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(168).setJavaLines(110).setLengths(5);}
    public UmpleSourceData Action_clone(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1875).setJavaLines(256).setLengths(10);}
    public UmpleSourceData Action_setActionCode(){ return new UmpleSourceData().setFileNames("StateMachine.ump","StateMachine.ump").setUmpleLines(160, 175).setJavaLines(88, 241).setLengths(2, 6);}
    public UmpleSourceData Event_compareWithAnotherEvent(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(886).setJavaLines(357).setLengths(6);}
    public UmpleSourceData Event_createAutoTransition(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(848).setJavaLines(318).setLengths(4);}
    public UmpleSourceData Event_clone(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1838).setJavaLines(372).setLengths(10);}
    public UmpleSourceData Event_setNextAutoTransitionId(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(855).setJavaLines(326).setLengths(1);}
    public UmpleSourceData Event_getArgs(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(860).setJavaLines(331).setLengths(22);}
    public UmpleSourceData Guard_add(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(245).setJavaLines(96).setLengths(53);}
    public UmpleSourceData Guard_getExpression(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(339).setJavaLines(202).setLengths(15);}
    public UmpleSourceData Guard_getCondition(){ return new UmpleSourceData().setFileNames("StateMachine_Code.ump").setUmpleLines(897).setJavaLines(221).setLengths(1);}
    public UmpleSourceData Guard_expressionQueue(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(223).setJavaLines(73).setLengths(19);}
    public UmpleSourceData Guard_clone(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1896).setJavaLines(231).setLengths(3);}
    public UmpleSourceData Guard_getQueuedExpression(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(302).setJavaLines(157).setLengths(3);}
    public UmpleSourceData Guard_isOperator(){ return new UmpleSourceData().setFileNames("StateMachine.ump").setUmpleLines(309).setJavaLines(168).setLengths(26);}
    public UmpleSourceData UmpleInternalParser_analyzeAttributeTraceItem(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTraceAttribute.ump").setUmpleLines(22).setJavaLines(13465).setLengths(41);}
    public UmpleSourceData UmpleInternalParser_addHasMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4764).setJavaLines(6267).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_addMinimumNumberOfMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4796).setJavaLines(6299).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_analyzeMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump","UmpleInternalParser_CodeClass.ump").setUmpleLines(2977, 2992).setJavaLines(4431, 4448).setLengths(1, 395);}
    public UmpleSourceData UmpleInternalParser_addStateMachineToState(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(188).setJavaLines(11492).setLengths(34);}
    public UmpleSourceData UmpleInternalParser_addRemoveMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4949).setJavaLines(6452).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_checkTypeParametersAvailability(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1036).setJavaLines(8426).setLengths(16);}
    public UmpleSourceData UmpleInternalParser_checkAttributeConflictImmutableAutounique(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(783).setJavaLines(2182).setLengths(27);}
    public UmpleSourceData UmpleInternalParser_getAllParentInterface(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1857).setJavaLines(3271).setLengths(16);}
    public UmpleSourceData UmpleInternalParser_analyzeFeatureModel(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(398).setJavaLines(14562).setLengths(4);}
    public UmpleSourceData UmpleInternalParser_addAssociationValue(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(726).setJavaLines(7325).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_addHasWithMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5005).setJavaLines(6508).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_keepTransition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(634).setJavaLines(11971).setLengths(23);}
    public UmpleSourceData UmpleInternalParser_analyzeExtraCode(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump","UmpleInternalParser_CodeTrait.ump").setUmpleLines(5383, 484).setJavaLines(6887, 7829).setLengths(27, 29);}
    public UmpleSourceData UmpleInternalParser_analyzeTestMultiComment(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(271).setJavaLines(16604).setLengths(4);}
    public UmpleSourceData UmpleInternalParser_UmpleInternalParser(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_Code.ump","UmpleInternalParser_Code.ump","UmpleInternalParser_Code.ump").setUmpleLines(43, 46, 51).setJavaLines(341, 15172, 15177).setLengths(1, 1, 1);}
    public UmpleSourceData UmpleInternalParser_applyCompositionAndSuperKeywordToStateActivity(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1329).setJavaLines(12782).setLengths(16);}
    public UmpleSourceData UmpleInternalParser_addNecessaryFiles(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_Code.ump").setUmpleLines(317).setJavaLines(15580).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_checkAbstractClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(905).setJavaLines(2280).setLengths(18);}
    public UmpleSourceData UmpleInternalParser_getThreadName(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(146).setJavaLines(9362).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_keepStateMachine(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(726).setJavaLines(12088).setLengths(14);}
    public UmpleSourceData UmpleInternalParser_postTokenTestSequeceAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(27).setJavaLines(16356).setLengths(32);}
    public UmpleSourceData UmpleInternalParser_checkParentForParallelSmsWithSameName(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1152).setJavaLines(10435).setLengths(12);}
    public UmpleSourceData UmpleInternalParser_checkActionActivityConflicts(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1258).setJavaLines(12703).setLengths(54);}
    public UmpleSourceData UmpleInternalParser_analyzeFilterToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeFilter.ump").setUmpleLines(31).setJavaLines(13692).setLengths(33);}
    public UmpleSourceData UmpleInternalParser_analyzeExternal(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1281).setJavaLines(2671).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_addResetMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5018).setJavaLines(6521).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_analyzeTestInitAttWithMethodCall(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(902).setJavaLines(17224).setLengths(42);}
    public UmpleSourceData UmpleInternalParser_ApplyRemoveAndInclude(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(543).setJavaLines(11875).setLengths(43);}
    public UmpleSourceData UmpleInternalParser_changeEventName(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1468).setJavaLines(12951).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_analyzeTestForStatement(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1732).setJavaLines(18058).setLengths(43);}
    public UmpleSourceData UmpleInternalParser_checkIsDistributed(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump","UmpleInternalParser_CodeClass.ump").setUmpleLines(645, 702).setJavaLines(2029, 2090).setLengths(53, 13);}
    public UmpleSourceData UmpleInternalParser_checkValidityOfSMTemplateSignature(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(272).setJavaLines(11585).setLengths(68);}
    public UmpleSourceData UmpleInternalParser_analyzeFIXMLAttributes(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(278).setJavaLines(15095).setLengths(14);}
    public UmpleSourceData UmpleInternalParser_analyzeComment(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(420).setJavaLines(1796).setLengths(24);}
    public UmpleSourceData UmpleInternalParser_fixImportFromDefaultPackage(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5495).setJavaLines(7003).setLengths(79);}
    public UmpleSourceData UmpleInternalParser_analyzeTransition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1851).setJavaLines(11146).setLengths(159);}
    public UmpleSourceData UmpleInternalParser_checkAbstractClassRecursive(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(932).setJavaLines(2309).setLengths(21);}
    public UmpleSourceData UmpleInternalParser_analyzeDependentTokens(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump","UmpleInternalParser_Code.ump").setUmpleLines(593, 244).setJavaLines(7945, 15453).setLengths(29, 35);}
    public UmpleSourceData UmpleInternalParser_createStateFromTransition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(756).setJavaLines(10019).setLengths(39);}
    public UmpleSourceData UmpleInternalParser_analyzeTraceCaseActivationToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTraceCase.ump").setUmpleLines(46).setJavaLines(13580).setLengths(15);}
    public UmpleSourceData UmpleInternalParser_getConstructorInConstructor(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(215).setJavaLines(15022).setLengths(40);}
    public UmpleSourceData UmpleInternalParser_postTokenClassEnumerationAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeEnumeration.ump").setUmpleLines(123).setJavaLines(16155).setLengths(69);}
    public UmpleSourceData UmpleInternalParser_analyzeUSEAttributes(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeUSE.ump").setUmpleLines(47).setJavaLines(15937).setLengths(22);}
    public UmpleSourceData UmpleInternalParser_analyzeStateMachine(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(515).setJavaLines(9763).setLengths(252);}
    public UmpleSourceData UmpleInternalParser_recursiveCycleCheck(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(867).setJavaLines(2238).setLengths(15);}
    public UmpleSourceData UmpleInternalParser_getMixsetFromToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(223).setJavaLines(14384).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_analyzeInvariants(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(760).setJavaLines(2156).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_analyzeTemplateToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(834).setJavaLines(9267).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_checkIfExpressionNeedsTraversal(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1562).setJavaLines(10853).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_checkInterfaceImplementationInHeirarchy(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(725).setJavaLines(8108).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_addSuperValue(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeFilter.ump").setUmpleLines(79).setJavaLines(13740).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_addUnlinkedKeys(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1743).setJavaLines(3157).setLengths(110);}
    public UmpleSourceData UmpleInternalParser_checkMethodComeFromTraitsIsAvaiableInClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1446).setJavaLines(8888).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_analyzeAssertion(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump","UmpleInternalParser_CodeTest.ump").setUmpleLines(414, 775).setJavaLines(16738, 17094).setLengths(42, 37);}
    public UmpleSourceData UmpleInternalParser_getSubTokenStartIndex(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1577).setJavaLines(10868).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_setFailedPosition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_Code.ump").setUmpleLines(134).setJavaLines(15303).setLengths(15);}
    public UmpleSourceData UmpleInternalParser_postTokenModelConstraintAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeConstraints.ump").setUmpleLines(26).setJavaLines(9094).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_checkNoneDeterminismAfterComposition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1173).setJavaLines(12608).setLengths(39);}
    public UmpleSourceData UmpleInternalParser_addNumberOfMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4786).setJavaLines(6289).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_CheckAttComeFromTraitsIsAvaialbleInOtherTraits(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1403).setJavaLines(8835).setLengths(27);}
    public UmpleSourceData UmpleInternalParser_checkSingletonParent(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(733).setJavaLines(2126).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_addGetMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4870).setJavaLines(6373).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_analyzeUSE(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeUSE.ump").setUmpleLines(21).setJavaLines(15911).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_analyzeMethodDeclarator(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3368).setJavaLines(4855).setLengths(41);}
    public UmpleSourceData UmpleInternalParser_applyCompositionAndSuperKeywordToTransition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1402).setJavaLines(12875).setLengths(45);}
    public UmpleSourceData UmpleInternalParser_checkExtendsForCycles(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(886).setJavaLines(2257).setLengths(15);}
    public UmpleSourceData UmpleInternalParser_analyzeToplevelException(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5412).setJavaLines(6918).setLengths(66);}
    public UmpleSourceData UmpleInternalParser_checkAssociationClassKeys(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(772).setJavaLines(2171).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_setUpAutoGenMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5048).setJavaLines(6551).setLengths(3);}
    public UmpleSourceData UmpleInternalParser_isAssociationMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1951).setJavaLines(3370).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_analyzeStateMachineToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump","UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(133, 223).setJavaLines(9349, 9445).setLengths(9, 43);}
    public UmpleSourceData UmpleInternalParser_setParentClassesDefaultInterface(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(573).setJavaLines(1957).setLengths(13);}
    public UmpleSourceData UmpleInternalParser_analyzeAttribute(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump","UmpleInternalParser_CodeTrait.ump").setUmpleLines(4312, 296).setJavaLines(5818, 7637).setLengths(226, 182);}
    public UmpleSourceData UmpleInternalParser_applyOperatorNegation(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1659).setJavaLines(10950).setLengths(29);}
    public UmpleSourceData UmpleInternalParser_modifyGenericTestAttribute(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1624).setJavaLines(17950).setLengths(15);}
    public UmpleSourceData UmpleInternalParser_setModel(){ return new UmpleSourceData().setFileNames("UmpleInternalParser.ump").setUmpleLines(88).setJavaLines(491).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_checkExtendsClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(957).setJavaLines(2338).setLengths(55);}
    public UmpleSourceData UmpleInternalParser_ApplyTypeParametersToAttribute(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(834).setJavaLines(8196).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_analyzeUSEAssociation(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeUSE.ump").setUmpleLines(73).setJavaLines(15963).setLengths(20);}
    public UmpleSourceData UmpleInternalParser_toSingleOperationNameInInjectToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3658).setJavaLines(5149).setLengths(22);}
    public UmpleSourceData UmpleInternalParser_isGetterSetter(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1944).setJavaLines(3362).setLengths(4);}
    public UmpleSourceData UmpleInternalParser_assignAssociationInitialValues(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(255).setJavaLines(7192).setLengths(71);}
    public UmpleSourceData UmpleInternalParser_addGenericRightNavManyToMany(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1294).setJavaLines(17617).setLengths(22);}
    public UmpleSourceData UmpleInternalParser_analyzeExternalInterface(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1292).setJavaLines(2682).setLengths(3);}
    public UmpleSourceData UmpleInternalParser_analyzeModelEnumInClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeEnumeration.ump").setUmpleLines(169).setJavaLines(16233).setLengths(61);}
    public UmpleSourceData UmpleInternalParser_findAllMatchClassNames(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3702).setJavaLines(5199).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_parse(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_Code.ump","UmpleInternalParser_Code.ump").setUmpleLines(87, 94).setJavaLines(15246, 15254).setLengths(4, 3);}
    public UmpleSourceData UmpleInternalParser_hasThisObject(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(198).setJavaLines(15000).setLengths(12);}
    public UmpleSourceData UmpleInternalParser_getMethodTestCase(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(471).setJavaLines(16793).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_analyzeTraceCaseToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTraceCase.ump").setUmpleLines(22).setJavaLines(13556).setLengths(20);}
    public UmpleSourceData UmpleInternalParser_copyMethodsFromTraitToClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(662).setJavaLines(8035).setLengths(18);}
    public UmpleSourceData UmpleInternalParser_analyzeFIXMLDefinition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(38).setJavaLines(14810).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_analyzeFixmlTagAttributes(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(297).setJavaLines(15119).setLengths(14);}
    public UmpleSourceData UmpleInternalParser_analyzeFIXMLextendedContentContetnt(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(82).setJavaLines(14869).setLengths(31);}
    public UmpleSourceData UmpleInternalParser_analyzeUSEAssociationEnd(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeUSE.ump").setUmpleLines(97).setJavaLines(15987).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_addMaximumNumberOfMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4806).setJavaLines(6309).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_getOperationsParameters(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3610).setJavaLines(5098).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_addClassValue(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeFilter.ump").setUmpleLines(105).setJavaLines(13764).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_getDataType(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeConstraints.ump").setUmpleLines(99).setJavaLines(9169).setLengths(14);}
    public UmpleSourceData UmpleInternalParser_checkStateNameOfToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(97).setJavaLines(9310).setLengths(31);}
    public UmpleSourceData UmpleInternalParser_addAtMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4962).setJavaLines(6465).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_addGenericRightNavOneToMany(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1347).setJavaLines(17669).setLengths(22);}
    public UmpleSourceData UmpleInternalParser_ignoreMessage(){ return new UmpleSourceData().setFileNames("UmpleInternalParser.ump","UmpleInternalParser.ump","UmpleInternalParser.ump").setUmpleLines(61, 67, 73).setJavaLines(895, 901, 907).setLengths(1, 1, 1);}
    public UmpleSourceData UmpleInternalParser_analyzeMixsetToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(246).setJavaLines(13962).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_postTokenCoreAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeCore.ump").setUmpleLines(59).setJavaLines(15737).setLengths(48);}
    public UmpleSourceData UmpleInternalParser_postTokenComponentAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1424).setJavaLines(9248).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_compareStateMachineName(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(928).setJavaLines(12333).setLengths(21);}
    public UmpleSourceData UmpleInternalParser_processInlineMixset(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(421).setJavaLines(14155).setLengths(12);}
    public UmpleSourceData UmpleInternalParser_init(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump","UmpleInternalParser_Code.ump").setUmpleLines(46, 56).setJavaLines(15214, 15182).setLengths(28, 30);}
    public UmpleSourceData UmpleInternalParser_setParentDefaultInterfaceRecursive(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(590).setJavaLines(1974).setLengths(14);}
    public UmpleSourceData UmpleInternalParser_checkTraitsNameWithInterfaces(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1097).setJavaLines(8502).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_AddStateMachineMapToAnother(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(911).setJavaLines(12311).setLengths(12);}
    public UmpleSourceData UmpleInternalParser_analyzeLayoutToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeLayout.ump","UmpleInternalParser_CodeLayout.ump").setUmpleLines(26, 32).setJavaLines(13603, 13613).setLengths(1, 20);}
    public UmpleSourceData UmpleInternalParser_copyTestCasesFromTraitsToClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(67).setJavaLines(16398).setLengths(60);}
    public UmpleSourceData UmpleInternalParser_analyzeParseResult(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_Code.ump").setUmpleLines(340).setJavaLines(15607).setLengths(79);}
    public UmpleSourceData UmpleInternalParser_analyzeGlossary(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeCore.ump").setUmpleLines(175).setJavaLines(15861).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_layoutNewElements(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeLayout.ump").setUmpleLines(64).setJavaLines(13650).setLengths(32);}
    public UmpleSourceData UmpleInternalParser_analyzeConstant(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3419).setJavaLines(4907).setLengths(99);}
    public UmpleSourceData UmpleInternalParser_compareExpressions(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1485).setJavaLines(10776).setLengths(73);}
    public UmpleSourceData UmpleInternalParser_getNewGeneralTPAppliedWithP2P(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1435).setJavaLines(8872).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_AddAttMapToAnother(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1505).setJavaLines(8962).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_analyzeTraitTestCaseToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(15).setJavaLines(16341).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_operatorsAreEqual(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1703).setJavaLines(10994).setLengths(16);}
    public UmpleSourceData UmpleInternalParser_ApplyTypeParametersToStateMachine(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(449).setJavaLines(11776).setLengths(89);}
    public UmpleSourceData UmpleInternalParser_keepRegion(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(708).setJavaLines(12065).setLengths(13);}
    public UmpleSourceData UmpleInternalParser_analyze(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_Code.ump").setUmpleLines(101).setJavaLines(15261).setLengths(31);}
    public UmpleSourceData UmpleInternalParser_postTokenClassAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(487).setJavaLines(1867).setLengths(43);}
    public UmpleSourceData UmpleInternalParser_allowMessage(){ return new UmpleSourceData().setFileNames("UmpleInternalParser.ump","UmpleInternalParser.ump","UmpleInternalParser.ump").setUmpleLines(60, 66, 72).setJavaLines(863, 869, 875).setLengths(1, 1, 1);}
    public UmpleSourceData UmpleInternalParser_toUmpleType(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5055).setJavaLines(6558).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_extraCodeIsMalformedStateMachine(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(87).setJavaLines(9297).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_validateEnumerationInAssociation(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeEnumeration.ump").setUmpleLines(200).setJavaLines(16302).setLengths(29);}
    public UmpleSourceData UmpleInternalParser_switchNegation(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1606).setJavaLines(10897).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_checkAbstractClassAssociations(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(2940).setJavaLines(4391).setLengths(20);}
    public UmpleSourceData UmpleInternalParser_checkFatherTestRecusive(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(815).setJavaLines(17135).setLengths(24);}
    public UmpleSourceData UmpleInternalParser_parseMixsetWaitingFragment(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(219).setJavaLines(13936).setLengths(22);}
    public UmpleSourceData UmpleInternalParser_getRequireStatementTokensAsList(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(204).setJavaLines(14363).setLengths(12);}
    public UmpleSourceData UmpleInternalParser_addUnlinkedExtends(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1674).setJavaLines(3067).setLengths(86);}
    public UmpleSourceData UmpleInternalParser_analyzeTraitToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump","UmpleInternalParser_CodeTrait.ump").setUmpleLines(42, 199).setJavaLines(7354, 7530).setLengths(9, 97);}
    public UmpleSourceData UmpleInternalParser_isExitActionToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1007).setJavaLines(10287).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_CheckSMFromTraitIsNotAvaialbleInOtherTraits(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(822).setJavaLines(12207).setLengths(37);}
    public UmpleSourceData UmpleInternalParser_extractIEParameters(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1262).setJavaLines(8705).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_isStringInteger(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(320).setJavaLines(15146).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_isAnUmpleClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1268).setJavaLines(2657).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_removeRegion2(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(692).setJavaLines(12044).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_isEntryActionToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1001).setJavaLines(10278).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_operandOrderDoesNotMatter(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1723).setJavaLines(11014).setLengths(2);}
    public UmpleSourceData UmpleInternalParser_postTokenTemplateAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(838).setJavaLines(9272).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_applyCompositionAndSuperKeywordToState(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1217).setJavaLines(12657).setLengths(36);}
    public UmpleSourceData UmpleInternalParser_replaceTempTerminalWithActualValues(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(375).setJavaLines(14538).setLengths(20);}
    public UmpleSourceData UmpleInternalParser_analyzeDistributableInterface(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(721).setJavaLines(2111).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_AssignStateMachineToState(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(137).setJavaLines(11431).setLengths(31);}
    public UmpleSourceData UmpleInternalParser_modfiyGenericAssociationReplacements(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1432).setJavaLines(17753).setLengths(32);}
    public UmpleSourceData UmpleInternalParser_analyzeMixset(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(259).setJavaLines(13975).setLengths(22);}
    public UmpleSourceData UmpleInternalParser_addUnlinkedAssociationVariables(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1615).setJavaLines(3008).setLengths(50);}
    public UmpleSourceData UmpleInternalParser_addAutogeneratedMethodsForAssociations(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1606).setJavaLines(3000).setLengths(4);}
    public UmpleSourceData UmpleInternalParser_checkAttComeFromTraitsIsAvaiableInClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1382).setJavaLines(8809).setLengths(16);}
    public UmpleSourceData UmpleInternalParser_makeCodeInject(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3858).setJavaLines(5359).setLengths(38);}
    public UmpleSourceData UmpleInternalParser_addIndexOfMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4774).setJavaLines(6277).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_addRequiredNumberOfMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4816).setJavaLines(6319).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_postTokenTraceAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrace.ump").setUmpleLines(505).setJavaLines(13456).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_addAddMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4885).setJavaLines(6388).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_checkSubclassSameAssociationDifferentRoleNames(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1971).setJavaLines(3394).setLengths(79);}
    public UmpleSourceData UmpleInternalParser_addAttributes(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(118).setJavaLines(14910).setLengths(18);}
    public UmpleSourceData UmpleInternalParser_checkIgnoredAssociations(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(2065).setJavaLines(3492).setLengths(114);}
    public UmpleSourceData UmpleInternalParser_checkDuplicateAssociationNamesClassHierarchy(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(2490).setJavaLines(3930).setLengths(46);}
    public UmpleSourceData UmpleInternalParser_analyzeinlineAssociation(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4192).setJavaLines(5696).setLengths(57);}
    public UmpleSourceData UmpleInternalParser_checkDefaultedNameConflict(){ return new UmpleSourceData().setFileNames("Master.ump").setUmpleLines(86).setJavaLines(7098).setLengths(23);}
    public UmpleSourceData UmpleInternalParser_anaylzeTraceWildCard(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrace.ump").setUmpleLines(381).setJavaLines(13322).setLengths(24);}
    public UmpleSourceData UmpleInternalParser_addSetManyMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4836).setJavaLines(6339).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_analyzeEnumerationToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeEnumeration.ump").setUmpleLines(15).setJavaLines(16025).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_addImplementedMethodsFromInterface(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1877).setJavaLines(3291).setLengths(37);}
    public UmpleSourceData UmpleInternalParser_analyzeToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump","UmpleInternalParser_Code.ump","UmpleInternalParser_Code.ump").setUmpleLines(181, 206, 231).setJavaLines(7504, 15383, 15434).setLengths(5, 43, 10);}
    public UmpleSourceData UmpleInternalParser_secondPostTokenAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(75).setJavaLines(9281).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_checkStateMachineNameConflict(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(309).setJavaLines(9541).setLengths(129);}
    public UmpleSourceData UmpleInternalParser_reAnalyze(){ return new UmpleSourceData().setFileNames("Structure_refactored.ump","Structure_refactored.ump").setUmpleLines(21, 24).setJavaLines(9257, 9262).setLengths(1, 1);}
    public UmpleSourceData UmpleInternalParser_addGenericOptionalOneToOne(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1539).setJavaLines(17861).setLengths(16);}
    public UmpleSourceData UmpleInternalParser_generateFeatureTreeTokenFromRequireStList(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(236).setJavaLines(14398).setLengths(131);}
    public UmpleSourceData UmpleInternalParser_parseMixset(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(202).setJavaLines(13925).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_checkDistributedAssociations(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(557).setJavaLines(1943).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_checkStateMachineForDuplicateEvents(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1347).setJavaLines(10636).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_addGenericRightNavOptionalOneToMany(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1373).setJavaLines(17695).setLengths(24);}
    public UmpleSourceData UmpleInternalParser_recursiveApplyTraits(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(649).setJavaLines(8017).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_analyzePostcondition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeConstraints.ump").setUmpleLines(51).setJavaLines(9118).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_addAPIMethodsForAssociationEnd(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4643).setJavaLines(6146).setLengths(117);}
    public UmpleSourceData UmpleInternalParser_findMatchingStateForMapping(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(227).setJavaLines(11536).setLengths(39);}
    public UmpleSourceData UmpleInternalParser_analyzeMixsetUseStatement(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(118).setJavaLines(13848).setLengths(49);}
    public UmpleSourceData UmpleInternalParser_analyzeUSEClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeUSE.ump").setUmpleLines(35).setJavaLines(15925).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_analyzeClassToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump","UmpleInternalParser_CodeClass.ump").setUmpleLines(59, 235).setJavaLines(1431, 1611).setLengths(122, 171);}
    public UmpleSourceData UmpleInternalParser_addExtraStatesAndTransitions(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1041).setJavaLines(12462).setLengths(64);}
    public UmpleSourceData UmpleInternalParser_analyzeTraceRecord(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrace.ump").setUmpleLines(325).setJavaLines(13262).setLengths(15);}
    public UmpleSourceData UmpleInternalParser_analyzeTrait(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(57).setJavaLines(7373).setLengths(95);}
    public UmpleSourceData UmpleInternalParser_addGenericRightNavOptionalOneToOne(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1320).setJavaLines(17643).setLengths(22);}
    public UmpleSourceData UmpleInternalParser_traceItemType(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrace.ump").setUmpleLines(412).setJavaLines(13356).setLengths(25);}
    public UmpleSourceData UmpleInternalParser_getOperationSource(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3623).setJavaLines(5111).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_analyzeClassTestSequence(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(987).setJavaLines(17307).setLengths(25);}
    public UmpleSourceData UmpleInternalParser_analyzeTestCase(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(208).setJavaLines(16541).setLengths(59);}
    public UmpleSourceData UmpleInternalParser_addAPIMethodsForAssociation(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4619).setJavaLines(6123).setLengths(19);}
    public UmpleSourceData UmpleInternalParser_ApplyTypeParametersToTypeParameters(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(803).setJavaLines(8155).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_transformIntoStateMachineToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(171).setJavaLines(9390).setLengths(47);}
    public UmpleSourceData UmpleInternalParser_numberOfExtendsClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1252).setJavaLines(2638).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_analyzeAllAssociations(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1022).setJavaLines(2404).setLengths(22);}
    public UmpleSourceData UmpleInternalParser_checkAllRequiredMethodsAndInterfaces(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1134).setJavaLines(8554).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_analyzeFinalState(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(978).setJavaLines(10252).setLengths(18);}
    public UmpleSourceData UmpleInternalParser_isInvalidFinalStateElement(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1013).setJavaLines(10296).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_ApplyTypeParametersToEventsOfStateMachines(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(765).setJavaLines(12135).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_analyzeEnumeration(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeEnumeration.ump","UmpleInternalParser_CodeEnumeration.ump").setUmpleLines(30, 53).setJavaLines(16042, 16066).setLengths(14, 14);}
    public UmpleSourceData UmpleInternalParser_parseMixsetNotUsedToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(343).setJavaLines(14066).setLengths(18);}
    public UmpleSourceData UmpleInternalParser_analyzeMixsetBodyToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(66).setJavaLines(13778).setLengths(20);}
    public UmpleSourceData UmpleInternalParser_checkCodeInjectionValidity(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3795).setJavaLines(5293).setLengths(58);}
    public UmpleSourceData UmpleInternalParser_numberOfActiveObjectsInClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(261).setJavaLines(9492).setLengths(18);}
    public UmpleSourceData UmpleInternalParser_analyzeException(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump","UmpleInternalParser_CodeClass.ump","UmpleInternalParser_CodeTrait.ump").setUmpleLines(5168, 5275, 523).setJavaLines(6672, 6779, 7871).setLengths(103, 104, 64);}
    public UmpleSourceData UmpleInternalParser_addToLastAttributeOrAssociation(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(188).setJavaLines(1563).setLengths(34);}
    public UmpleSourceData UmpleInternalParser_isUmpleTrait(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(34).setJavaLines(7343).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_addGenericOptionalOneToMany(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1467).setJavaLines(17789).setLengths(22);}
    public UmpleSourceData UmpleInternalParser_analyzeInvariant(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeConstraints.ump").setUmpleLines(66).setJavaLines(9134).setLengths(16);}
    public UmpleSourceData UmpleInternalParser_inferType(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5067).setJavaLines(6570).setLengths(49);}
    public UmpleSourceData UmpleInternalParser_numericalExprOperatorsAreOpposite(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1734).setJavaLines(11025).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_compareActivities(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(990).setJavaLines(12401).setLengths(13);}
    public UmpleSourceData UmpleInternalParser_addUnlinkedInterfaceExtends(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1402).setJavaLines(2793).setLengths(54);}
    public UmpleSourceData UmpleInternalParser_createAssociation(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3973).setJavaLines(5475).setLengths(12);}
    public UmpleSourceData UmpleInternalParser_getOperationName(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3637).setJavaLines(5125).setLengths(16);}
    public UmpleSourceData UmpleInternalParser_getActiveCode(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(157).setJavaLines(9373).setLengths(3);}
    public UmpleSourceData UmpleInternalParser_createFeatureModelSegment(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(109).setJavaLines(14266).setLengths(88);}
    public UmpleSourceData UmpleInternalParser_postTokenLayoutAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeLayout.ump").setUmpleLines(58).setJavaLines(13641).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_analyzeAction(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1804).setJavaLines(11099).setLengths(43);}
    public UmpleSourceData UmpleInternalParser_addCombinedFilter(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeFilter.ump").setUmpleLines(68).setJavaLines(13729).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_createPreliminaryAssociationEnd(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4117).setJavaLines(5621).setLengths(45);}
    public UmpleSourceData UmpleInternalParser_AddMethodMapToAnother(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1491).setJavaLines(8943).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_checkTraitsNamesWithClasses(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1084).setJavaLines(8484).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_checkAssociationsValidity(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(2963).setJavaLines(4415).setLengths(4);}
    public UmpleSourceData UmpleInternalParser_checkClassInterfaceAssocations(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(2931).setJavaLines(4381).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_createStateFromDefinition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(862).setJavaLines(10125).setLengths(32);}
    public UmpleSourceData UmpleInternalParser_removeTransition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(595).setJavaLines(11929).setLengths(31);}
    public UmpleSourceData UmpleInternalParser_parseMixsetsNotUsed(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(403).setJavaLines(14132).setLengths(15);}
    public UmpleSourceData UmpleInternalParser_analyzeClassTestCase(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(366).setJavaLines(16691).setLengths(43);}
    public UmpleSourceData UmpleInternalParser_getExpressionOperator(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1591).setJavaLines(10882).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_associationIsBetweenClassAndAbstractClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1571).setJavaLines(2966).setLengths(13);}
    public UmpleSourceData UmpleInternalParser_analyzeInjectionCode(){ return new UmpleSourceData().setFileNames("UmpleInternalPraser_CodeInjection.ump").setUmpleLines(147).setJavaLines(14729).setLengths(43);}
    public UmpleSourceData UmpleInternalParser_analyzeTestClassInit(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1561).setJavaLines(17885).setLengths(57);}
    public UmpleSourceData UmpleInternalParser_analyzeComponentToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1420).setJavaLines(9243).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_createStateFromStandAloneTransition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(798).setJavaLines(10062).setLengths(32);}
    public UmpleSourceData UmpleInternalParser_applyCompositionAndSuperKeywordToStateActivityE(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1319).setJavaLines(12767).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_defaultConstantValue(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3522).setJavaLines(5010).setLengths(57);}
    public UmpleSourceData UmpleInternalParser_parseAllFiles(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_Code.ump").setUmpleLines(322).setJavaLines(15589).setLengths(14);}
    public UmpleSourceData UmpleInternalParser_obtainMethodTemplateSignature(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1274).setJavaLines(8722).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_transformAutoTransitionToActivity(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1758).setJavaLines(11052).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_compareActions(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(958).setJavaLines(12366).setLengths(23);}
    public UmpleSourceData UmpleInternalParser_postTokenAbstractTestAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(757).setJavaLines(17077).setLengths(13);}
    public UmpleSourceData UmpleInternalParser_analyzeClassGenericTestCase(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1018).setJavaLines(17340).setLengths(273);}
    public UmpleSourceData UmpleInternalParser_checkClassExtensionInHierarchy(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(746).setJavaLines(8139).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_checkAssociationsForDistributed(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(533).setJavaLines(1914).setLengths(25);}
    public UmpleSourceData UmpleInternalParser_addUnlinkedAssociations(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(2763).setJavaLines(4210).setLengths(80);}
    public UmpleSourceData UmpleInternalParser_analyzeFIXML(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump","UmpleInternalParser_FIXML.ump").setUmpleLines(14, 28).setJavaLines(14776, 14795).setLengths(9, 5);}
    public UmpleSourceData UmpleInternalParser_analyzeDistribute(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeCore.ump").setUmpleLines(143).setJavaLines(15826).setLengths(27);}
    public UmpleSourceData UmpleInternalParser_checkClassSupportTraitsInterfaces(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(685).setJavaLines(8063).setLengths(35);}
    public UmpleSourceData UmpleInternalParser_checkTypeParameterAvailability(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(850).setJavaLines(8216).setLengths(22);}
    public UmpleSourceData UmpleInternalParser_analyzeAssociationClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1514).setJavaLines(2904).setLengths(16);}
    public UmpleSourceData UmpleInternalParser_checkSortedAssociations(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(2845).setJavaLines(4294).setLengths(83);}
    public UmpleSourceData UmpleInternalParser_analyzeSymmetricReflexiveAssociation(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3936).setJavaLines(5438).setLengths(33);}
    public UmpleSourceData UmpleInternalParser_analyzeAllTokens(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump","UmpleInternalParser_Code.ump","UmpleInternalParser_Code.ump").setUmpleLines(158, 156, 184).setJavaLines(7478, 15328, 15359).setLengths(16, 20, 16);}
    public UmpleSourceData UmpleInternalParser_analyzeTestAction(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(535).setJavaLines(16857).setLengths(78);}
    public UmpleSourceData UmpleInternalParser_postTokenModelEnumerationAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeEnumeration.ump").setUmpleLines(86).setJavaLines(16103).setLengths(44);}
    public UmpleSourceData UmpleInternalParser_checkUnusedNamespaces(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5482).setJavaLines(6988).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_addExtendsTo(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1205).setJavaLines(2588).setLengths(42);}
    public UmpleSourceData UmpleInternalParser_analyzeTraceItem(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrace.ump").setUmpleLines(348).setJavaLines(13286).setLengths(27);}
    public UmpleSourceData UmpleInternalParser_getDifferingEnd(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(2542).setJavaLines(3985).setLengths(21);}
    public UmpleSourceData UmpleInternalParser_getAllMethodNames(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3741).setJavaLines(5238).setLengths(51);}
    public UmpleSourceData UmpleInternalParser_analyzePrecondition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeConstraints.ump").setUmpleLines(41).setJavaLines(9109).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_analyzeActiveObject(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(164).setJavaLines(9380).setLengths(2);}
    public UmpleSourceData UmpleInternalParser_checkMethodInMapTraitsMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1571).setJavaLines(9037).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_isStringDuble(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(331).setJavaLines(15162).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_analyzeInterface(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump","UmpleInternalParser_CodeClass.ump").setUmpleLines(1299, 1383).setJavaLines(2689, 2773).setLengths(80, 16);}
    public UmpleSourceData UmpleInternalParser_removeState2(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(677).setJavaLines(12024).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_getTraceFlagId(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrace.ump").setUmpleLines(20).setJavaLines(586).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_getMixsetFragmentWithEnclosingElement(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(91).setJavaLines(13806).setLengths(33);}
    public UmpleSourceData UmpleInternalParser_addGetDefaultMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5028).setJavaLines(6531).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_analyzeTraceToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrace.ump","UmpleInternalParser_CodeTrace.ump").setUmpleLines(37, 135).setJavaLines(12968, 13068).setLengths(91, 20);}
    public UmpleSourceData UmpleInternalParser_AssignStateMachineToStateSearchProcess(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(173).setJavaLines(11472).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_postTokenTraitAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(961).setJavaLines(8342).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_checkStateForDuplicateEvents(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1357).setJavaLines(10649).setLengths(123);}
    public UmpleSourceData UmpleInternalParser_mergeTests(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(165).setJavaLines(16497).setLengths(19);}
    public UmpleSourceData UmpleInternalParser_stateMachineWillbBAssigned(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(864).setJavaLines(12254).setLengths(18);}
    public UmpleSourceData UmpleInternalParser_analyzeInjectionToken(){ return new UmpleSourceData().setFileNames("UmpleInternalPraser_CodeInjection.ump").setUmpleLines(13).setJavaLines(14570).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_analyzeInterfaceTest(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(702).setJavaLines(17023).setLengths(3);}
    public UmpleSourceData UmpleInternalParser_findValidName(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(260).setJavaLines(15072).setLengths(13);}
    public UmpleSourceData UmpleInternalParser_copyAttributesFromTraitsToClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1294).setJavaLines(8745).setLengths(17);}
    public UmpleSourceData UmpleInternalParser_recursiveCheckRequiredInterfaces(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1147).setJavaLines(8572).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_copyStateMachinesFromTraiToClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(27).setJavaLines(11367).setLengths(23);}
    public UmpleSourceData UmpleInternalParser_addGenericOneToMany(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1493).setJavaLines(17815).setLengths(22);}
    public UmpleSourceData UmpleInternalParser_addToGeneratedMethodMap(){ return new UmpleSourceData().setFileNames("Master.ump").setUmpleLines(112).setJavaLines(7125).setLengths(12);}
    public UmpleSourceData UmpleInternalParser_expressionIsBasicValue(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1747).setJavaLines(11038).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_verifyClassesInUse(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1534).setJavaLines(2924).setLengths(23);}
    public UmpleSourceData UmpleInternalParser_getOperationParameters(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3583).setJavaLines(5071).setLengths(23);}
    public UmpleSourceData UmpleInternalParser_addKey(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3899).setJavaLines(5401).setLengths(33);}
    public UmpleSourceData UmpleInternalParser_analyzeInterfaceMembers(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1461).setJavaLines(2851).setLengths(49);}
    public UmpleSourceData UmpleInternalParser_analyzeTestParameter(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(685).setJavaLines(17006).setLengths(13);}
    public UmpleSourceData UmpleInternalParser_isLazyRedundant(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5163).setJavaLines(6667).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_populateStateMachine(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(898).setJavaLines(10161).setLengths(82);}
    public UmpleSourceData UmpleInternalParser_postTokenEnumerationAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeEnumeration.ump").setUmpleLines(73).setJavaLines(16088).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_addAddMethodByParameters(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4899).setJavaLines(6402).setLengths(46);}
    public UmpleSourceData UmpleInternalParser_checkParameterMatch(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3717).setJavaLines(5213).setLengths(21);}
    public UmpleSourceData UmpleInternalParser_addUnlinkedExtendTraits(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(974).setJavaLines(8359).setLengths(57);}
    public UmpleSourceData UmpleInternalParser_createMixsetFragment(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump","UmpleInternalParser_CodeMixset.ump").setUmpleLines(284, 293).setJavaLines(14001, 14011).setLengths(6, 47);}
    public UmpleSourceData UmpleInternalParser_compareTypeToValueList(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5150).setJavaLines(6654).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_addAssociation(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(209).setJavaLines(7141).setLengths(41);}
    public UmpleSourceData UmpleInternalParser_checkTemplateParametersValidity(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1584).setJavaLines(9055).setLengths(20);}
    public UmpleSourceData UmpleInternalParser_postTokenInterfaceTestAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(709).setJavaLines(17030).setLengths(43);}
    public UmpleSourceData UmpleInternalParser_postTokenStateMachineAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(283).setJavaLines(9514).setLengths(18);}
    public UmpleSourceData UmpleInternalParser_addIsNumberOfValidMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4826).setJavaLines(6329).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_checkDuplicateAssociationNames(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(2568).setJavaLines(4010).setLengths(147);}
    public UmpleSourceData UmpleInternalParser_analyzedReferencedStateMachine(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(449).setJavaLines(9680).setLengths(57);}
    public UmpleSourceData UmpleInternalParser_analyzeGenerate(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeCore.ump").setUmpleLines(188).setJavaLines(15874).setLengths(33);}
    public UmpleSourceData UmpleInternalParser_createSpecializedLinks(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(2183).setJavaLines(3610).setLengths(311);}
    public UmpleSourceData UmpleInternalParser_analyzeStateMachineTraceItem(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTraceStateMachine.ump").setUmpleLines(21).setJavaLines(1269).setLengths(151);}
    public UmpleSourceData UmpleInternalParser_associationIsBetweenClassAndInterface(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1556).setJavaLines(2951).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_checkCyclicTraitInheritance(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump","UmpleInternalParser_CodeTrait.ump").setUmpleLines(1110, 1120).setJavaLines(8520, 8535).setLengths(5, 9);}
    public UmpleSourceData UmpleInternalParser_changeTransitionNextState(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1452).setJavaLines(12930).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_postTokenInterfaceAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(814).setJavaLines(2213).setLengths(2);}
    public UmpleSourceData UmpleInternalParser_analyzeTestInitAtt(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(842).setJavaLines(17163).setLengths(57);}
    public UmpleSourceData UmpleInternalParser_isConstructorOrGetSet(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1924).setJavaLines(3341).setLengths(17);}
    public UmpleSourceData UmpleInternalParser_analyzeNonconstraintAssociationEndForWarning(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4260).setJavaLines(5765).setLengths(42);}
    public UmpleSourceData UmpleInternalParser_tokenIsGeneric(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1618).setJavaLines(10909).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_keepState(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(748).setJavaLines(12113).setLengths(12);}
    public UmpleSourceData UmpleInternalParser_CheckInterfaceInInTerfaceHierarchy(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(736).setJavaLines(8124).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_analyzeClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1057).setJavaLines(2440).setLengths(137);}
    public UmpleSourceData UmpleInternalParser_analyzeStateDependentMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(2010).setJavaLines(11309).setLengths(48);}
    public UmpleSourceData UmpleInternalParser_analyzeState(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1021).setJavaLines(10301).setLengths(125);}
    public UmpleSourceData UmpleInternalParser_proccessGeneralTemplateParameters(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1194).setJavaLines(8629).setLengths(20);}
    public UmpleSourceData UmpleInternalParser_createTargetFeature(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(91).setJavaLines(14246).setLengths(12);}
    public UmpleSourceData UmpleInternalParser_analyzeTraceCondition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrace.ump").setUmpleLines(446).setJavaLines(13391).setLengths(14);}
    public UmpleSourceData UmpleInternalParser_analyzeAssociation(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3989).setJavaLines(5491).setLengths(118);}
    public UmpleSourceData UmpleInternalParser_analyzeActivity(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1768).setJavaLines(11062).setLengths(33);}
    public UmpleSourceData UmpleInternalParser_applyTraitProperties(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(878).setJavaLines(8248).setLengths(84);}
    public UmpleSourceData UmpleInternalParser_recursiveCheckRequiredMethods(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1163).setJavaLines(8593).setLengths(20);}
    public UmpleSourceData UmpleInternalParser_getAssociationConstructorInConstructor(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(331).setJavaLines(7273).setLengths(48);}
    public UmpleSourceData UmpleInternalParser_creareActivityWithoutSuperCall(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1350).setJavaLines(12808).setLengths(4);}
    public UmpleSourceData UmpleInternalParser_ApplyTypeParametersToActionCodesOfStateMachines(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(781).setJavaLines(12156).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_postTokenAnalysis(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_Code.ump").setUmpleLines(273).setJavaLines(15498).setLengths(74);}
    public UmpleSourceData UmpleInternalParser_checkUnclearTransition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(497).setJavaLines(9745).setLengths(14);}
    public UmpleSourceData UmpleInternalParser_CompeletlyAllyTypeParametersToStateMachines(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(436).setJavaLines(11759).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_checkTypeParametersValid(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1057).setJavaLines(8452).setLengths(21);}
    public UmpleSourceData UmpleInternalParser_createDotNotationName(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(848).setJavaLines(10111).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_ApplyTypeParametersToMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(817).setJavaLines(8174).setLengths(12);}
    public UmpleSourceData UmpleInternalParser_compareExpressionsWithOperands(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1623).setJavaLines(10914).setLengths(32);}
    public UmpleSourceData UmpleInternalParser_analyzeFIXMLEndContetnt(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(62).setJavaLines(14844).setLengths(15);}
    public UmpleSourceData UmpleInternalParser_analyzeMultilineComment(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(457).setJavaLines(1835).setLengths(24);}
    public UmpleSourceData UmpleInternalParser_applyTraits(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(621).setJavaLines(7984).setLengths(23);}
    public UmpleSourceData UmpleInternalParser_addGenericManyToMany(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1519).setJavaLines(17841).setLengths(16);}
    public UmpleSourceData UmpleInternalParser_CheckSMFromTraitIsNotAvaialbleInClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(791).setJavaLines(12171).setLengths(26);}
    public UmpleSourceData UmpleInternalParser_ApplyExludeIncludeAliasToMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1523).setJavaLines(8984).setLengths(43);}
    public UmpleSourceData UmpleInternalParser_checkValidityOfSMModifier(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(345).setJavaLines(11663).setLengths(86);}
    public UmpleSourceData UmpleInternalParser_addGetWithMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4992).setJavaLines(6495).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_globToRegex(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(3685).setJavaLines(5179).setLengths(12);}
    public UmpleSourceData UmpleInternalParser_removeSuperKeywordTracks(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(55).setJavaLines(11400).setLengths(3);}
    public UmpleSourceData UmpleInternalParser_removeSuperKeywordTracksReculsively(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(63).setJavaLines(11413).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_applyCompositionAndSuperKeywordToStateActionE(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1359).setJavaLines(12822).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_CheckMethodComeFromTraitsIsAvaialbleInOtherTraits(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1458).setJavaLines(8905).setLengths(28);}
    public UmpleSourceData UmpleInternalParser_analyzeTestIfStatement(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1642).setJavaLines(17969).setLengths(85);}
    public UmpleSourceData UmpleInternalParser_analyzeAssociationTraceItem(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTraceAssociation.ump").setUmpleLines(20).setJavaLines(13510).setLengths(37);}
    public UmpleSourceData UmpleInternalParser_operatorIsAndOrOr(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1729).setJavaLines(11020).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_modifyGenericTestCode(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(1402).setJavaLines(17723).setLengths(26);}
    public UmpleSourceData UmpleInternalParser_analyzeFIXMLContetnt(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(50).setJavaLines(14827).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_addIsMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5038).setJavaLines(6541).setLengths(6);}
    public UmpleSourceData UmpleInternalParser_analyzeStateMachineDefinition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(443).setJavaLines(9674).setLengths(2);}
    public UmpleSourceData UmpleInternalParser_compareTwoMethdos(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1356).setJavaLines(8778).setLengths(21);}
    public UmpleSourceData UmpleInternalParser_isUmpleClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1669).setJavaLines(3062).setLengths(1);}
    public UmpleSourceData UmpleInternalParser_analyzeRequireStatement(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(18).setJavaLines(14171).setLengths(66);}
    public UmpleSourceData UmpleInternalParser_analyzeMethodAssertion(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(459).setJavaLines(16784).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_addDeepHistoryStatesToNestedStateMachines(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(835).setJavaLines(10098).setLengths(9);}
    public UmpleSourceData UmpleInternalParser_analyzeModelConstraint(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeConstraints.ump").setUmpleLines(91).setJavaLines(9160).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_addSetMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump","UmpleInternalParser_CodeClass.ump").setUmpleLines(4847, 4859).setJavaLines(6350, 6362).setLengths(8, 7);}
    public UmpleSourceData UmpleInternalParser_applyCompositionAndSuperKeywordToStateAction(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1372).setJavaLines(12840).setLengths(25);}
    public UmpleSourceData UmpleInternalParser_mergeTwoStateMachineWithTheSameNameDifferentInitialState(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(887).setJavaLines(12282).setLengths(19);}
    public UmpleSourceData UmpleInternalParser_analyzeMethodTestCase(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(483).setJavaLines(16805).setLengths(48);}
    public UmpleSourceData UmpleInternalParser_analyzeTestComment(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(279).setJavaLines(16612).setLengths(5);}
    public UmpleSourceData UmpleInternalParser_addSubValue(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeFilter.ump").setUmpleLines(91).setJavaLines(13752).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_analyzeMethodTraceItem(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrace.ump").setUmpleLines(464).setJavaLines(13413).setLengths(34);}
    public UmpleSourceData UmpleInternalParser_compareStatesAndTransitions(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1008).setJavaLines(12424).setLengths(28);}
    public UmpleSourceData UmpleInternalParser_addOrMoveAt(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4977).setJavaLines(6480).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_analyzeCoreToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump","UmpleInternalParser_CodeCore.ump","UmpleInternalParser_CodeCore.ump").setUmpleLines(193, 22, 54).setJavaLines(7519, 15694, 15728).setLengths(1, 25, 1);}
    public UmpleSourceData UmpleInternalParser_copyTestCasefromExtendedTrait(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(188).setJavaLines(16520).setLengths(17);}
    public UmpleSourceData UmpleInternalParser_addAPIMethodsForAttribute(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4565).setJavaLines(6070).setLengths(49);}
    public UmpleSourceData UmpleInternalParser_checkConflictsOfTransitionActions(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1111).setJavaLines(12536).setLengths(33);}
    public UmpleSourceData UmpleInternalParser_parseMixsetFragmentNotUsed(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeMixset.ump").setUmpleLines(361).setJavaLines(14088).setLengths(36);}
    public UmpleSourceData UmpleInternalParser_analyzeTopLevelCode(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeCore.ump").setUmpleLines(112).setJavaLines(15793).setLengths(25);}
    public UmpleSourceData UmpleInternalParser_addAttributeToConstructor(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4542).setJavaLines(6048).setLengths(18);}
    public UmpleSourceData UmpleInternalParser_checkSatifcationOfRequiredStates(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1149).setJavaLines(12579).setLengths(19);}
    public UmpleSourceData UmpleInternalParser_assignInitialValues(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_FIXML.ump").setUmpleLines(141).setJavaLines(14938).setLengths(52);}
    public UmpleSourceData UmpleInternalParser_analyzeTestInit(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(617).setJavaLines(16939).setLengths(63);}
    public UmpleSourceData UmpleInternalParser_copyFatherClassTests(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(948).setJavaLines(17270).setLengths(33);}
    public UmpleSourceData UmpleInternalParser_removeState(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(662).setJavaLines(12004).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_checkCodeInjections(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(746).setJavaLines(2142).setLengths(10);}
    public UmpleSourceData UmpleInternalParser_disallowMessage(){ return new UmpleSourceData().setFileNames("UmpleInternalParser.ump","UmpleInternalParser.ump","UmpleInternalParser.ump").setUmpleLines(62, 68, 74).setJavaLines(927, 933, 939).setLengths(1, 1, 1);}
    public UmpleSourceData UmpleInternalParser_associationIsBetweenAbstractClassAndClass(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(1587).setJavaLines(2983).setLengths(13);}
    public UmpleSourceData UmpleInternalParser_updateAssociationEnds(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(4167).setJavaLines(5670).setLengths(15);}
    public UmpleSourceData UmpleInternalParser_processGTemplateParameterAssignment(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait.ump").setUmpleLines(1219).setJavaLines(8659).setLengths(33);}
    public UmpleSourceData UmpleInternalParser_expectMessage(){ return new UmpleSourceData().setFileNames("UmpleInternalParser.ump","UmpleInternalParser.ump","UmpleInternalParser.ump").setUmpleLines(63, 69, 75).setJavaLines(959, 965, 971).setLengths(1, 1, 1);}
    public UmpleSourceData UmpleInternalParser_analyzeUSEMultiplicity(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeUSE.ump").setUmpleLines(109).setJavaLines(16000).setLengths(17);}
    public UmpleSourceData UmpleInternalParser_associationIsBetweenClassAndTrait(){ return new UmpleSourceData().setFileNames("Trait_refactored.ump").setUmpleLines(201).setJavaLines(9079).setLengths(11);}
    public UmpleSourceData UmpleInternalParser_raiseImportFromDefaultNameSpaceWarning(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5572).setJavaLines(7086).setLengths(8);}
    public UmpleSourceData UmpleInternalParser_checkExtendsForCyclesInterface(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(848).setJavaLines(2219).setLengths(15);}
    public UmpleSourceData UmpleInternalParser_checkSingletonAssociations(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(2719).setJavaLines(4161).setLengths(45);}
    public UmpleSourceData UmpleInternalParser_analyzeTraceStatement(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrace.ump").setUmpleLines(161).setJavaLines(13097).setLengths(156);}
    public UmpleSourceData UmpleInternalParser_analyzeTestMethodCall(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTest.ump").setUmpleLines(293).setJavaLines(16621).setLengths(66);}
    public UmpleSourceData UmpleInternalParser_checkVariableNamesAndTypes(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeConstraints.ump").setUmpleLines(116).setJavaLines(9187).setLengths(52);}
    public UmpleSourceData UmpleInternalParser_checkIfNegationApplied(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1692).setJavaLines(10983).setLengths(7);}
    public UmpleSourceData UmpleInternalParser_analyzeStandAloneTransition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStateMachine.ump").setUmpleLines(1170).setJavaLines(10455).setLengths(173);}
    public UmpleSourceData UmpleInternalParser_analyzeToplevelInjectionCode(){ return new UmpleSourceData().setFileNames("UmpleInternalPraser_CodeInjection.ump").setUmpleLines(25).setJavaLines(14585).setLengths(136);}
    public UmpleSourceData UmpleInternalParser_compareTypeToValue(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(5120).setJavaLines(6623).setLengths(27);}
    public UmpleSourceData UmpleInternalParser_analyzeDistributedClasses(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeClass.ump").setUmpleLines(611).setJavaLines(1996).setLengths(29);}
    public UmpleSourceData Filter_hasSub(){ return new UmpleSourceData().setFileNames("Umple_Code_Filter.ump").setUmpleLines(114).setJavaLines(206).setLengths(1);}
    public UmpleSourceData Filter_isEmpty(){ return new UmpleSourceData().setFileNames("Umple_Code_Filter.ump").setUmpleLines(125).setJavaLines(216).setLengths(1);}
    public UmpleSourceData Filter_hasAssociation(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(688).setJavaLines(245).setLengths(1);}
    public UmpleSourceData Filter_hasSuper(){ return new UmpleSourceData().setFileNames("Umple_Code_Filter.ump").setUmpleLines(119).setJavaLines(211).setLengths(1);}
    public UmpleSourceData Filter_hasNestedFilter(){ return new UmpleSourceData().setFileNames("Umple_Code_Filter.ump").setUmpleLines(108).setJavaLines(201).setLengths(1);}
    public UmpleSourceData Filter_isIncluded(){ return new UmpleSourceData().setFileNames("Umple_Code_Filter.ump","Umple_Code_Filter.ump").setUmpleLines(130, 142).setJavaLines(221, 233).setLengths(8, 8);}
    public UmpleSourceData UmpleGenerator_getAssociationProperty(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1327).setJavaLines(1013).setLengths(18);}
    public UmpleSourceData UmpleGenerator_initializeLangaugeBasedVariables(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(491).setJavaLines(145).setLengths(1);}
    public UmpleSourceData UmpleGenerator_prepare(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(503).setJavaLines(155).setLengths(1);}
    public UmpleSourceData UmpleGenerator_getMethodParameterProperty(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1306).setJavaLines(992).setLengths(17);}
    public UmpleSourceData UmpleGenerator_getRuleTokenByName(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(750).setJavaLines(426).setLengths(36);}
    public UmpleSourceData UmpleGenerator_isRecursing(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(793).setJavaLines(470).setLengths(6);}
    public UmpleSourceData UmpleGenerator_translate(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump","Generator_CodeUmple.ump","Generator_CodeUmple.ump","Generator_CodeUmple.ump","Generator_CodeUmple.ump","Generator_CodeUmple.ump","Generator_CodeUmple.ump","Generator_CodeUmple.ump","Generator_CodeUmple.ump","Generator_CodeUmple.ump").setUmpleLines(416, 421, 426, 431, 436, 441, 446, 451, 456, 461).setJavaLines(70, 75, 80, 85, 90, 95, 100, 105, 110, 115).setLengths(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);}
    public UmpleSourceData UmpleGenerator_resetScopeStack(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(827).setJavaLines(506).setLengths(4);}
    public UmpleSourceData UmpleGenerator_pad_r(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1562).setJavaLines(1250).setLengths(15);}
    public UmpleSourceData UmpleGenerator_pad(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump","Generator_CodeUmple.ump").setUmpleLines(1467, 1510).setJavaLines(1154, 1198).setLengths(35, 27);}
    public UmpleSourceData UmpleGenerator_getAttributeProperty(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1433).setJavaLines(1119).setLengths(25);}
    public UmpleSourceData UmpleGenerator_getMethodProperty(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1270).setJavaLines(956).setLengths(32);}
    public UmpleSourceData UmpleGenerator_pad_l(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1541).setJavaLines(1229).setLengths(17);}
    public UmpleSourceData UmpleGenerator_enterScope(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump","Generator_CodeUmple.ump").setUmpleLines(807, 838).setJavaLines(485, 518).setLengths(13, 9);}
    public UmpleSourceData UmpleGenerator_generateRuleOutput(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump","Generator_CodeUmple.ump").setUmpleLines(880, 935).setJavaLines(562, 618).setLengths(46, 141);}
    public UmpleSourceData UmpleGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(511).setJavaLines(164).setLengths(15);}
    public UmpleSourceData UmpleGenerator_writeFile(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(535).setJavaLines(189).setLengths(24);}
    public UmpleSourceData UmpleGenerator_getCode(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(566).setJavaLines(221).setLengths(4);}
    public UmpleSourceData UmpleGenerator_translateTerminal(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1585).setJavaLines(1273).setLengths(2);}
    public UmpleSourceData UmpleGenerator_getLanguageFor(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(481).setJavaLines(135).setLengths(1);}
    public UmpleSourceData UmpleGenerator_handleMutexClause(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1083).setJavaLines(767).setLengths(15);}
    public UmpleSourceData UmpleGenerator_generateRuleTokenOutput(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1105).setJavaLines(790).setLengths(53);}
    public UmpleSourceData UmpleGenerator_getInterfaceProperty(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1244).setJavaLines(930).setLengths(22);}
    public UmpleSourceData UmpleGenerator_getRuleByName(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(682).setJavaLines(357).setLengths(41);}
    public UmpleSourceData UmpleGenerator_getMultiplicityProperty(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1410).setJavaLines(1096).setLengths(19);}
    public UmpleSourceData UmpleGenerator_getElementRootRule(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(630).setJavaLines(303).setLengths(17);}
    public UmpleSourceData UmpleGenerator_initializeParser(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(578).setJavaLines(234).setLengths(59);}
    public UmpleSourceData UmpleGenerator_isNullable(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(471).setJavaLines(125).setLengths(1);}
    public UmpleSourceData UmpleGenerator_getElementProperty(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1168).setJavaLines(854).setLengths(33);}
    public UmpleSourceData UmpleGenerator_relatedTranslate(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(466).setJavaLines(120).setLengths(1);}
    public UmpleSourceData UmpleGenerator_getElementRootRuleToken(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(656).setJavaLines(330).setLengths(17);}
    public UmpleSourceData UmpleGenerator_exitScope(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(854).setJavaLines(535).setLengths(17);}
    public UmpleSourceData UmpleGenerator_getAssociationEndProperty(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1367).setJavaLines(1053).setLengths(39);}
    public UmpleSourceData UmpleGenerator_getParentScope(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(402).setJavaLines(56).setLengths(5);}
    public UmpleSourceData UmpleGenerator_getTerminalRuleToken(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(730).setJavaLines(406).setLengths(10);}
    public UmpleSourceData UmpleGenerator_nameOf(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(476).setJavaLines(130).setLengths(1);}
    public UmpleSourceData UmpleGenerator_getScope(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(393).setJavaLines(47).setLengths(5);}
    public UmpleSourceData UmpleGenerator_typeOf(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(486).setJavaLines(140).setLengths(1);}
    public UmpleSourceData UmpleGenerator_getAssociationVariableProperty(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1349).setJavaLines(1035).setLengths(14);}
    public UmpleSourceData UmpleGenerator_getClassProperty(){ return new UmpleSourceData().setFileNames("Generator_CodeUmple.ump").setUmpleLines(1205).setJavaLines(891).setLengths(35);}
    public UmpleSourceData UmpleTrait_setAncestorIsImmutable(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(131).setJavaLines(1875).setLengths(11);}
    public UmpleSourceData UmpleTrait_propagateImmutabilityToAllRelationships(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(99).setJavaLines(1844).setLengths(8);}
    public UmpleSourceData UmpleTrait_setDefinedParameterType(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(243).setJavaLines(1997).setLengths(3);}
    public UmpleSourceData UmpleTrait_notifySubclassesAncestorImmutable(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(113).setJavaLines(1856).setLengths(15);}
    public UmpleSourceData UmpleTrait_getMethod(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(198).setJavaLines(1944).setLengths(25);}
    public UmpleSourceData UmpleTrait_enforceImmutabilityInheritanceRules(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(145).setJavaLines(1890).setLengths(4);}
    public UmpleSourceData UmpleTrait_hasMethod(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(227).setJavaLines(1977).setLengths(2);}
    public UmpleSourceData UmpleTrait_getGeneralTemplateParameterByName(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(258).setJavaLines(2014).setLengths(6);}
    public UmpleSourceData UmpleTrait_getAssociationVariable(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(6).setJavaLines(2024).setLengths(8);}
    public UmpleSourceData UmpleTrait_setImmutable(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(85).setJavaLines(1825).setLengths(11);}
    public UmpleSourceData UmpleTrait_getGeneralTemplateParameterIndexByName(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(249).setJavaLines(2004).setLengths(6);}
    public UmpleSourceData UmpleTrait_hasCascadeMethod(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(55).setJavaLines(1795).setLengths(9);}
    public UmpleSourceData UmpleTrait_getAttribute(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(68).setJavaLines(1808).setLengths(8);}
    public UmpleSourceData UmpleTrait_hasDefinedParameter(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(236).setJavaLines(1989).setLengths(4);}
    public UmpleSourceData UmpleTrait_hasGeneralTemplateParameter(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(48).setJavaLines(1787).setLengths(4);}
    public UmpleSourceData UmpleTrait_isImmutable(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(80).setJavaLines(1820).setLengths(1);}
    public UmpleSourceData UmpleTrait_isUmpleTrait(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(822).setJavaLines(2043).setLengths(1);}
    public UmpleSourceData UmpleTrait_setExtendsTrait(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(153).setJavaLines(1898).setLengths(42);}
    public UmpleSourceData UmpleTrait_getGeneralTPAppliedByName(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(40).setJavaLines(1777).setLengths(6);}
    public UmpleSourceData Attribute_isSettable(){ return new UmpleSourceData().setFileNames("Umple_CodeAttribute.ump").setUmpleLines(50).setJavaLines(686).setLengths(1);}
    public UmpleSourceData Attribute_isDefaulted(){ return new UmpleSourceData().setFileNames("Umple_CodeAttribute.ump").setUmpleLines(55).setJavaLines(691).setLengths(1);}
    public UmpleSourceData Attribute_Attribute(){ return new UmpleSourceData().setFileNames("Umple.ump","Umple_Code_Trait.ump","Umple_CodeAttribute.ump").setUmpleLines(939, 280, 5).setJavaLines(81, 622, 642).setLengths(1, 16, 17);}
    public UmpleSourceData Attribute_setType(){ return new UmpleSourceData().setFileNames("Umple.ump","Umple.ump").setUmpleLines(940, 941).setJavaLines(165, 169).setLengths(1, 1);}
    public UmpleSourceData Attribute_getMethodNames(){ return new UmpleSourceData().setFileNames("Umple_CodeAttribute.ump").setUmpleLines(84).setJavaLines(720).setLengths(42);}
    public UmpleSourceData Attribute_delete(){ return new UmpleSourceData().setFileNames("Trace_refactored.ump").setUmpleLines(28).setJavaLines(593).setLengths(3);}
    public UmpleSourceData Attribute_getFullType(){ return new UmpleSourceData().setFileNames("Umple_CodeAttribute.ump").setUmpleLines(79).setJavaLines(715).setLengths(1);}
    public UmpleSourceData Attribute_isInternal(){ return new UmpleSourceData().setFileNames("Umple_CodeAttribute.ump").setUmpleLines(45).setJavaLines(681).setLengths(1);}
    public UmpleSourceData Attribute_isConstant(){ return new UmpleSourceData().setFileNames("Umple_CodeAttribute.ump").setUmpleLines(26).setJavaLines(663).setLengths(1);}
    public UmpleSourceData Attribute_getValue(){ return new UmpleSourceData().setFileNames("Umple_CodeAttribute.ump").setUmpleLines(60).setJavaLines(696).setLengths(2);}
    public UmpleSourceData Attribute_isImmutable(){ return new UmpleSourceData().setFileNames("Umple_CodeAttribute.ump").setUmpleLines(37).setJavaLines(673).setLengths(4);}
    public UmpleSourceData Attribute_setValue(){ return new UmpleSourceData().setFileNames("Umple_CodeAttribute.ump","Umple_CodeAttribute.ump").setUmpleLines(66, 73).setJavaLines(702, 709).setLengths(3, 2);}
    public UmpleSourceData Attribute_isPrimitive(){ return new UmpleSourceData().setFileNames("Umple_CodeAttribute.ump").setUmpleLines(31).setJavaLines(668).setLengths(1);}
    public UmpleSourceData GeneralTPApplied_hasMethodTemplateSignature(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(406).setJavaLines(273).setLengths(4);}
    public UmpleSourceData GeneralTPApplied_GeneralTPApplied(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(391).setJavaLines(254).setLengths(9);}
    public UmpleSourceData GeneralTPApplied_hasMethod(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(417).setJavaLines(288).setLengths(6);}
    public UmpleSourceData GeneralTPApplied_compareTwoMethdos(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(428).setJavaLines(304).setLengths(21);}
    public UmpleSourceData GeneralTPApplied_ApplyTypeParametersToMethod(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(375).setJavaLines(233).setLengths(11);}
    public UmpleSourceData MethodTemplateSignature_MethodTemplateSignature(){ return new UmpleSourceData().setFileNames("Umple_Code_Trait.ump").setUmpleLines(457).setJavaLines(88).setLengths(3);}
    public UmpleSourceData Association_setImmutable(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(143).setJavaLines(705).setLengths(1);}
    public UmpleSourceData Association_Association(){ return new UmpleSourceData().setFileNames("Umple.ump","Umple_CodeAssociation.ump").setUmpleLines(1004, 10).setJavaLines(73, 573).setLengths(1, 19);}
    public UmpleSourceData Association_getName(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1003).setJavaLines(181).setLengths(1);}
    public UmpleSourceData Association_isComposition(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(152).setJavaLines(715).setLengths(1);}
    public UmpleSourceData Association_isImmutable(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(148).setJavaLines(710).setLengths(1);}
    public UmpleSourceData Association_deriveName(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(122).setJavaLines(684).setLengths(17);}
    public UmpleSourceData Association_isValid(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(69).setJavaLines(631).setLengths(1);}
    public UmpleSourceData Association_toGenericString(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(106).setJavaLines(668).setLengths(12);}
    public UmpleSourceData Association_whoIsInvalid(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(48).setJavaLines(610).setLengths(17);}
    public UmpleSourceData Association_getNamed(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(985).setJavaLines(249).setLengths(1);}
    public UmpleSourceData Association_getArrowString(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(74).setJavaLines(636).setLengths(28);}
    public UmpleSourceData Association_setLeftAndRight(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(33).setJavaLines(596).setLengths(10);}
    public UmpleSourceData AssociationEnd_getRoleName(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1035).setJavaLines(191).setLengths(1);}
    public UmpleSourceData AssociationEnd_AssociationEnd(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(163).setJavaLines(436).setLengths(19);}
    public UmpleSourceData AssociationEnd_getModifier(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1037).setJavaLines(210).setLengths(1);}
    public UmpleSourceData AssociationEnd_toSimpleString(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(207).setJavaLines(479).setLengths(16);}
    public UmpleSourceData AssociationEnd_formatGenericEnd(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(285).setJavaLines(556).setLengths(12);}
    public UmpleSourceData AssociationEnd_isNavigable(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(187).setJavaLines(459).setLengths(1);}
    public UmpleSourceData AssociationEnd_getLowerBoundString(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(192).setJavaLines(464).setLengths(1);}
    public UmpleSourceData AssociationEnd_getDisplayRoleName(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(202).setJavaLines(474).setLengths(1);}
    public UmpleSourceData AssociationEnd_getUpperBoundString(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(197).setJavaLines(469).setLengths(1);}
    public UmpleSourceData AssociationEnd_toGenericString(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(227).setJavaLines(499).setLengths(20);}
    public UmpleSourceData AssociationEnd_toString(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(251).setJavaLines(523).setLengths(24);}
    public UmpleSourceData AssociationEnd_getClassName(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1036).setJavaLines(199).setLengths(1);}
    public UmpleSourceData AssociationEnd_formatEnd(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(279).setJavaLines(551).setLengths(1);}
    public UmpleSourceData AssociationEnd_getReferenceToClassName(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1038).setJavaLines(218).setLengths(1);}
    public UmpleSourceData AssociationVariable_isMStar(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(423).setJavaLines(673).setLengths(1);}
    public UmpleSourceData AssociationVariable_AssociationVariable(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(307).setJavaLines(557).setLengths(17);}
    public UmpleSourceData AssociationVariable_setOneDirectionalRelatedAssociation(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(350).setJavaLines(601).setLengths(4);}
    public UmpleSourceData AssociationVariable_getTraced(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(57).setJavaLines(797).setLengths(9);}
    public UmpleSourceData AssociationVariable_isUpperBounded(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(408).setJavaLines(658).setLengths(1);}
    public UmpleSourceData AssociationVariable_isMany(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(378).setJavaLines(628).setLengths(1);}
    public UmpleSourceData AssociationVariable_setUmpleClass(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1079).setJavaLines(501).setLengths(1);}
    public UmpleSourceData AssociationVariable_isOptionalMany(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(403).setJavaLines(653).setLengths(1);}
    public UmpleSourceData AssociationVariable_canBeRelatedAssociation(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(499).setJavaLines(749).setLengths(9);}
    public UmpleSourceData AssociationVariable_min(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(368).setJavaLines(618).setLengths(1);}
    public UmpleSourceData AssociationVariable_isImmutable(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(448).setJavaLines(698).setLengths(10);}
    public UmpleSourceData AssociationVariable_isMandatoryOne(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(438).setJavaLines(688).setLengths(1);}
    public UmpleSourceData AssociationVariable_isOptionalN(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(383).setJavaLines(633).setLengths(1);}
    public UmpleSourceData AssociationVariable_configureRelatedAssociation(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(338).setJavaLines(588).setLengths(9);}
    public UmpleSourceData AssociationVariable_isMandatory(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(433).setJavaLines(683).setLengths(1);}
    public UmpleSourceData AssociationVariable_canBeImmutable(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(478).setJavaLines(728).setLengths(17);}
    public UmpleSourceData AssociationVariable_setRelatedAssociation(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1081).setJavaLines(408).setLengths(1);}
    public UmpleSourceData AssociationVariable_isOne(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(388).setJavaLines(638).setLengths(1);}
    public UmpleSourceData AssociationVariable_isMandatoryMany(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(443).setJavaLines(693).setLengths(1);}
    public UmpleSourceData AssociationVariable_max(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(373).setJavaLines(623).setLengths(1);}
    public UmpleSourceData AssociationVariable_isN(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(413).setJavaLines(663).setLengths(1);}
    public UmpleSourceData AssociationVariable_isTwoDirectionalAssociation(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(358).setJavaLines(609).setLengths(5);}
    public UmpleSourceData AssociationVariable_getMethodNames(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(512).setJavaLines(762).setLengths(31);}
    public UmpleSourceData AssociationVariable_setImmutable(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(462).setJavaLines(712).setLengths(7);}
    public UmpleSourceData AssociationVariable_isOptionalOne(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(398).setJavaLines(648).setLengths(1);}
    public UmpleSourceData AssociationVariable_isOnlyOne(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(393).setJavaLines(643).setLengths(1);}
    public UmpleSourceData AssociationVariable_isStar(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(428).setJavaLines(678).setLengths(1);}
    public UmpleSourceData AssociationVariable_isSymmetricReflexive(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(333).setJavaLines(583).setLengths(1);}
    public UmpleSourceData AssociationVariable_isReflexive(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(328).setJavaLines(578).setLengths(1);}
    public UmpleSourceData AssociationVariable_isMN(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(418).setJavaLines(668).setLengths(1);}
    public UmpleSourceData AssociationVariable_isSorted(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(473).setJavaLines(723).setLengths(1);}
    public UmpleSourceData Multiplicity_isOne(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(668).setJavaLines(296).setLengths(1);}
    public UmpleSourceData Multiplicity_setRange(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(555).setJavaLines(183).setLengths(2);}
    public UmpleSourceData Multiplicity_isValid(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(575).setJavaLines(203).setLengths(28);}
    public UmpleSourceData Multiplicity_getUpperBound(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(631).setJavaLines(259).setLengths(8);}
    public UmpleSourceData Multiplicity_isLowerBoundMany(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(643).setJavaLines(271).setLengths(1);}
    public UmpleSourceData Multiplicity_isMany(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(663).setJavaLines(291).setLengths(1);}
    public UmpleSourceData Multiplicity_getRangeParts(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(568).setJavaLines(196).setLengths(3);}
    public UmpleSourceData Multiplicity_parseInt(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(673).setJavaLines(301).setLengths(15);}
    public UmpleSourceData Multiplicity_minimizeRange(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(607).setJavaLines(235).setLengths(8);}
    public UmpleSourceData Multiplicity_getRange(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(561).setJavaLines(189).setLengths(3);}
    public UmpleSourceData Multiplicity_isLowerBoundNumeric(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(653).setJavaLines(281).setLengths(1);}
    public UmpleSourceData Multiplicity_isUpperBoundMany(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(648).setJavaLines(276).setLengths(1);}
    public UmpleSourceData Multiplicity_getLowerBound(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(619).setJavaLines(247).setLengths(8);}
    public UmpleSourceData Multiplicity_isUpperBoundNumeric(){ return new UmpleSourceData().setFileNames("Umple_CodeAssociation.ump").setUmpleLines(658).setJavaLines(286).setLengths(1);}
    public UmpleSourceData Multiplicity_getParserable(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1097).setJavaLines(100).setLengths(1);}
    public UmpleSourceData Method_hashCode(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(168).setJavaLines(739).setLengths(8);}
    public UmpleSourceData Method_equals(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(134).setJavaLines(706).setLengths(29);}
    public UmpleSourceData Method_getTraced(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(73).setJavaLines(751).setLengths(16);}
    public UmpleSourceData Method_getSignature(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(17).setJavaLines(585).setLengths(8);}
    public UmpleSourceData Method_toString(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(101).setJavaLines(674).setLengths(28);}
    public UmpleSourceData Method_Method(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(62).setJavaLines(634).setLengths(23);}
    public UmpleSourceData Method_setMethodParameters(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(11).setJavaLines(574).setLengths(1);}
    public UmpleSourceData Method_getExistsInLanguage(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(89).setJavaLines(661).setLengths(9);}
    public UmpleSourceData Method_compareWithTheMethod(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(30).setJavaLines(603).setLengths(21);}
    public UmpleSourceData MethodParameter_clone(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTrait_StateMachine.ump").setUmpleLines(1858).setJavaLines(183).setLengths(7);}
    public UmpleSourceData MethodParameter_MethodParameter(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(209).setJavaLines(164).setLengths(5);}
    public UmpleSourceData MethodParameter_getFullType(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(217).setJavaLines(173).setLengths(1);}
    public UmpleSourceData ExtraCode_getHasCode(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(366).setJavaLines(62).setLengths(1);}
    public UmpleSourceData ExtraCode_appendExtraCode(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump","Umple_CodeMethod.ump").setUmpleLines(342, 347).setJavaLines(38, 43).setLengths(1, 1);}
    public UmpleSourceData ExtraCode_getExtraCode(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(352).setJavaLines(48).setLengths(10);}
    public UmpleSourceData UmpleClassifier_countOccurrences(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(423).setJavaLines(528).setLengths(9);}
    public UmpleSourceData UmpleClassifier_deWindowsify(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(443).setJavaLines(548).setLengths(1);}
    public UmpleSourceData UmpleClassifier_hasMethod(){ return new UmpleSourceData().setFileNames("Umple_CodeMethod.ump").setUmpleLines(373).setJavaLines(485).setLengths(30);}
    public UmpleSourceData UmpleClassifier_getRelativePath(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(458).setJavaLines(563).setLengths(51);}
    public UmpleSourceData Coordinate_setY(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1163).setJavaLines(79).setLengths(1);}
    public UmpleSourceData Coordinate_setX(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1162).setJavaLines(67).setLengths(1);}
    public UmpleSourceData Coordinate_getRightMiddle(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(38).setJavaLines(231).setLengths(1);}
    public UmpleSourceData Coordinate_setWidth(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1164).setJavaLines(91).setLengths(1);}
    public UmpleSourceData Coordinate_setHeight(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1165).setJavaLines(103).setLengths(1);}
    public UmpleSourceData Coordinate_distanceTo(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(74).setJavaLines(267).setLengths(4);}
    public UmpleSourceData Coordinate_getLeftMiddle(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(43).setJavaLines(236).setLengths(1);}
    public UmpleSourceData Coordinate_getTopMiddle(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(28).setJavaLines(221).setLengths(1);}
    public UmpleSourceData Coordinate_whereIs(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(48).setJavaLines(241).setLengths(22);}
    public UmpleSourceData Coordinate_getTopRight(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(13).setJavaLines(206).setLengths(1);}
    public UmpleSourceData Coordinate_Coordinate(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1161).setJavaLines(52).setLengths(1);}
    public UmpleSourceData Coordinate_getBottomRight(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(23).setJavaLines(216).setLengths(1);}
    public UmpleSourceData Coordinate_updateStatus(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(87).setJavaLines(280).setLengths(8);}
    public UmpleSourceData Coordinate_getBottomMiddle(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(33).setJavaLines(226).setLengths(1);}
    public UmpleSourceData Coordinate_toString(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(82).setJavaLines(275).setLengths(1);}
    public UmpleSourceData Coordinate_getBottomLeft(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(18).setJavaLines(211).setLengths(1);}
    public UmpleSourceData Coordinate_getTopLeft(){ return new UmpleSourceData().setFileNames("Umple_CodeCoordinate.ump").setUmpleLines(8).setJavaLines(201).setLengths(1);}
    public UmpleSourceData AssociationTraceItem_trace(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(233).setJavaLines(410).setLengths(2);}
    public UmpleSourceData AssociationTraceItem_getExtremities(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(242).setJavaLines(422).setLengths(1);}
    public UmpleSourceData AssociationTraceItem_getTracerType(){ return new UmpleSourceData().setFileNames("ssociation_refactored.ump").setUmpleLines(29).setJavaLines(135).setLengths(1);}
    public UmpleSourceData AssociationTraceItem_getIsPre(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(219).setJavaLines(391).setLengths(1);}
    public UmpleSourceData AssociationTraceItem_getIsPost(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(222).setJavaLines(396).setLengths(1);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeConstraint(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1044).setJavaLines(1369).setLengths(42);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_processTriggersData(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(827).setJavaLines(1161).setLengths(34);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeTriggerConstraintTree(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(217).setJavaLines(534).setLengths(38);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeActiveTrigger(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(320).setJavaLines(640).setLengths(34);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_createMessageHandlerData(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(789).setJavaLines(1121).setLengths(14);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_buildBindingPortData(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(536).setJavaLines(861).setLengths(103);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeMethodBody(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(357).setJavaLines(678).setLengths(49);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzePortDefinition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(107).setJavaLines(420).setLengths(9);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeLinkingOpExpression(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1090).setJavaLines(1415).setLengths(17);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_inferPortTypeData(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(745).setJavaLines(1075).setLengths(29);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeBooleanConstraintExpression(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1112).setJavaLines(1436).setLengths(22);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeArithmeticCall(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1176).setJavaLines(1500).setLengths(22);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeInvoke(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(301).setJavaLines(620).setLengths(16);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeMethodDeclarator(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(409).setJavaLines(731).setLengths(30);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_createMessageStructureData(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(777).setJavaLines(1108).setLengths(9);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeConstraintName(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(874).setJavaLines(1199).setLengths(115);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzePortBindingDefinition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(79).setJavaLines(391).setLengths(25);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_createAnonymousBody(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(179).setJavaLines(493).setLengths(12);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_isMonitored(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(677).setJavaLines(1004).setLengths(8);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeConstraintTree(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(258).setJavaLines(576).setLengths(40);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeGeneralConstraintExpression(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1020).setJavaLines(1345).setLengths(20);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeHitchConstraint(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(200).setJavaLines(516).setLengths(14);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_buildOutgoingProtocolData(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(717).setJavaLines(1046).setLengths(25);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_getSubcomponentVariable(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(521).setJavaLines(845).setLengths(12);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeStringConstraintExpression(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1138).setJavaLines(1462).setLengths(34);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_processConstraintsData(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(642).setJavaLines(968).setLengths(32);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeConstraintNumber(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(993).setJavaLines(1318).setLengths(1);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzePortClassDefinition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(72).setJavaLines(384).setLengths(3);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_buildIncomingProtocolData(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(688).setJavaLines(1016).setLengths(26);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzePortDeclaration(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(119).setJavaLines(433).setLengths(56);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_done(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1333).setJavaLines(1657).setLengths(4);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeNumberConstraintExpression(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1202).setJavaLines(1526).setLengths(44);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeNegativeConstraint(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1300).setJavaLines(1622).setLengths(18);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeAssociationConstraintExpression(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(117).setJavaLines(275).setLengths(78);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_logError(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(48).setJavaLines(357).setLengths(2);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeAnonymousBody(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(194).setJavaLines(509).setLengths(3);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeMultiComment(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(58).setJavaLines(369).setLengths(11);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeInvariantConstraint(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1253).setJavaLines(1574).setLengths(44);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeAssociationLiteralConstraintExpression(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(53).setJavaLines(211).setLengths(60);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_buildProtocolData(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(806).setJavaLines(1139).setLengths(18);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeConstraintIndex(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(998).setJavaLines(1323).setLengths(18);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeActiveMethodDefinition(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(442).setJavaLines(765).setLengths(76);}
    public UmpleSourceData CompositeStructureTokenAnalyzer_analyzeInlineComment(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(53).setJavaLines(363).setLengths(2);}
    public UmpleSourceData ConstraintAssociation_getName(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(397).setJavaLines(136).setLengths(1);}
    public UmpleSourceData ConstraintAssociation_getType(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(414).setJavaLines(159).setLengths(1);}
    public UmpleSourceData ConstraintAssociation_retrieveClassifier(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(403).setJavaLines(145).setLengths(10);}
    public UmpleSourceData ModelConstraintAssociation_addAssociationEnd(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(450).setJavaLines(107).setLengths(9);}
    public UmpleSourceData ModelConstraintAssociation_ModelConstraintAssociation(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(447).setJavaLines(38).setLengths(4);}
    public UmpleSourceData ModelConstraintAssociation_setAssociationType(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(462).setJavaLines(120).setLengths(2);}
    public UmpleSourceData ModelConstraintAssociation_evaluate(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(468).setJavaLines(126).setLengths(150);}
    public UmpleSourceData AssociationClass_addMissingKeyIfNeeded(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(638).setJavaLines(171).setLengths(13);}
    public UmpleSourceData AssociationClass_AssociationClass(){ return new UmpleSourceData().setFileNames("Association_refactored.ump").setUmpleLines(633).setJavaLines(166).setLengths(1);}
    public UmpleSourceData ConstraintNameNameAnalyzer_retrieveClass(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(692).setJavaLines(84).setLengths(53);}
    public UmpleSourceData ConstraintNameNameAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(682).setJavaLines(74).setLengths(1);}
    public UmpleSourceData ConstraintNameNameAnalyzer_generateConstraintName(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(741).setJavaLines(141).setLengths(99);}
    public UmpleSourceData ConstraintNameNameAnalyzer_analyzeName(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(687).setJavaLines(79).setLengths(1);}
    public UmpleSourceData PreconditionAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(29).setJavaLines(81).setLengths(1);}
    public UmpleSourceData PreconditionAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(34).setJavaLines(86).setLengths(12);}
    public UmpleSourceData InvariantAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(102).setJavaLines(81).setLengths(11);}
    public UmpleSourceData PostconditionAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(57).setJavaLines(81).setLengths(1);}
    public UmpleSourceData PostconditionAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(62).setJavaLines(86).setLengths(12);}
    public UmpleSourceData UmpleElement_hasExtraCode(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(399).setJavaLines(479).setLengths(1);}
    public UmpleSourceData UmpleElement_isUmpleTrait(){ return new UmpleSourceData().setFileNames("Trait_refactored.ump").setUmpleLines(152).setJavaLines(432).setLengths(1);}
    public UmpleSourceData UmpleElement_isUmpleInterface(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(155).setJavaLines(446).setLengths(1);}
    public UmpleSourceData UmpleElement_setPackageName(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(152).setJavaLines(118).setLengths(1);}
    public UmpleSourceData UmpleElement_appendExtraCode(){ return new UmpleSourceData().setFileNames("Umple_Code.ump","Umple_Code.ump","Umple_Code.ump").setUmpleLines(371, 381, 394).setJavaLines(451, 461, 474).setLengths(1, 9, 1);}
    public UmpleSourceData UmpleElement_resetExtraCode(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(376).setJavaLines(456).setLengths(1);}
    public UmpleSourceData UmpleElement_getExtraCode(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(404).setJavaLines(484).setLengths(1);}
    public UmpleSourceData UmpleElement_isUmpleClass(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(154).setJavaLines(441).setLengths(1);}
    public UmpleSourceData CompositeStructureDefinitionWalker_analyzeSubTokens(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1387).setJavaLines(131).setLengths(13);}
    public UmpleSourceData CompositeStructureDefinitionWalker_CompositeStructureDefinitionWalker(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1359).setJavaLines(34).setLengths(1);}
    public UmpleSourceData CompositeStructureDefinitionWalker_analyzeToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1373).setJavaLines(116).setLengths(11);}
    public UmpleSourceData CompositeStructureDefinitionWalker_analyze(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1403).setJavaLines(148).setLengths(3);}
    public UmpleSourceData CompositeStructureDefinitionWalker_done(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump").setUmpleLines(1369).setJavaLines(111).setLengths(1);}
    public UmpleSourceData CompositeStructureDefinitionWalker_accept(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeStructure.ump","Generator_UmpleModelWalker.ump").setUmpleLines(1362, 132).setJavaLines(103, 159).setLengths(4, 1);}
    public UmpleSourceData AnalysisParserTask_logError(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(47).setJavaLines(97).setLengths(2);}
    public UmpleSourceData TemplateException_TemplateException(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(90).setJavaLines(87).setLengths(3);}
    public UmpleSourceData TemplateAttributeParser_analyzeExpression(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(128).setJavaLines(392).setLengths(21);}
    public UmpleSourceData TemplateAttributeParser_parse(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(152).setJavaLines(417).setLengths(97);}
    public UmpleSourceData TemplateAttributeParser_setVariableElements(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(253).setJavaLines(518).setLengths(10);}
    public UmpleSourceData TemplateAttributeParser_getEmissionResponse(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(267).setJavaLines(532).setLengths(13);}
    public UmpleSourceData TemplateTokenAnalyzer__createSpacesString(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(529).setJavaLines(590).setLengths(6);}
    public UmpleSourceData TemplateTokenAnalyzer_createSecondaryMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(576).setJavaLines(407).setLengths(37);}
    public UmpleSourceData TemplateTokenAnalyzer_analyzeEmitMethodDeclarator(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(422).setJavaLines(300).setLengths(70);}
    public UmpleSourceData TemplateTokenAnalyzer__createSpaceStringMethodBody(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(529).setJavaLines(599).setLengths(20);}
    public UmpleSourceData TemplateTokenAnalyzer_createSpaceStringMethodBody(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(529).setJavaLines(622).setLengths(2);}
    public UmpleSourceData TemplateTokenAnalyzer_initializeNL(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(565).setJavaLines(395).setLengths(8);}
    public UmpleSourceData TemplateTokenAnalyzer_getEmisionString(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(324).setJavaLines(221).setLengths(40);}
    public UmpleSourceData TemplateTokenAnalyzer_analyzeTemplateName(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(368).setJavaLines(265).setLengths(31);}
    public UmpleSourceData TemplateTokenAnalyzer_initializeCreateSpaceMethod(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(545).setJavaLines(374).setLengths(17);}
    public UmpleSourceData TemplateTokenAnalyzer_done(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(710).setJavaLines(545).setLengths(41);}
    public UmpleSourceData TemplateTokenAnalyzer_recursiveIncludeTemplateElementCycleCheck(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(616).setJavaLines(448).setLengths(38);}
    public UmpleSourceData TemplateTokenAnalyzer_recursiveCycleCheck(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(658).setJavaLines(490).setLengths(47);}
    public UmpleSourceData TemplateDefinitionWalker_analyzeSubTokens(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(801).setJavaLines(135).setLengths(13);}
    public UmpleSourceData TemplateDefinitionWalker_analyzeToken(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(787).setJavaLines(118).setLengths(13);}
    public UmpleSourceData TemplateDefinitionWalker_analyze(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(817).setJavaLines(152).setLengths(3);}
    public UmpleSourceData TemplateDefinitionWalker_TemplateDefinitionWalker(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(772).setJavaLines(35).setLengths(1);}
    public UmpleSourceData TemplateDefinitionWalker_done(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump").setUmpleLines(783).setJavaLines(113).setLengths(1);}
    public UmpleSourceData TemplateDefinitionWalker_accept(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeTemplate.ump","Generator_UmpleModelWalker.ump").setUmpleLines(775, 132).setJavaLines(104, 163).setLengths(5, 1);}
    public UmpleSourceData GuardAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("StateMachine_refactored.ump").setUmpleLines(114).setJavaLines(83).setLengths(7);}
    public UmpleSourceData StatemachineExprAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("StateMachine_refactored.ump").setUmpleLines(139).setJavaLines(98).setLengths(1);}
    public UmpleSourceData StatemachineExprStateNameAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("StateMachine_refactored.ump").setUmpleLines(156).setJavaLines(80).setLengths(1);}
    public UmpleSourceData StatemachineExprStateNameAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("StateMachine_refactored.ump").setUmpleLines(160).setJavaLines(85).setLengths(24);}
    public UmpleSourceData SuperCodeGenerator_getBooleanResultIfExists(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(96).setJavaLines(216).setLengths(13);}
    public UmpleSourceData SuperCodeGenerator_checkStringForNotEqualsOperator(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(160).setJavaLines(280).setLengths(1);}
    public UmpleSourceData SuperCodeGenerator_addNegationToCondition(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(165).setJavaLines(285).setLengths(8);}
    public UmpleSourceData SuperCodeGenerator_SuperCodeGenerator(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(14).setJavaLines(40).setLengths(4);}
    public UmpleSourceData SuperCodeGenerator_getBooleanResult(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(140).setJavaLines(260).setLengths(11);}
    public UmpleSourceData SuperCodeGenerator_translate(){ return new UmpleSourceData().setFileNames("Trace_refactored.ump","Generator_SuperCodeGenerator.ump","Generator_SuperCodeGenerator.ump","Generator_SuperCodeGenerator.ump").setUmpleLines(47, 177, 254, 365).setJavaLines(132, 297, 374, 485).setLengths(8, 73, 102, 18);}
    public UmpleSourceData SuperCodeGenerator_umpleCVarToLanguagePrimitive(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(360).setJavaLines(480).setLengths(1);}
    public UmpleSourceData SuperCodeGenerator_postpare(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(10).setJavaLines(144).setLengths(1);}
    public UmpleSourceData SuperCodeGenerator_prepareConstraints(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(493).setJavaLines(616).setLengths(68);}
    public UmpleSourceData SuperCodeGenerator_testForBooleanConstraint(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(113).setJavaLines(233).setLengths(9);}
    public UmpleSourceData SuperCodeGenerator_getExpr(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(437).setJavaLines(558).setLengths(11);}
    public UmpleSourceData SuperCodeGenerator_getType(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(30).setJavaLines(151).setLengths(13);}
    public UmpleSourceData SuperCodeGenerator_getNamedNames(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(464).setJavaLines(587).setLengths(25);}
    public UmpleSourceData SuperCodeGenerator_testForPrimitiveInConstraint(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(48).setJavaLines(168).setLengths(21);}
    public UmpleSourceData SuperCodeGenerator_testForUnassignedPrimitivesInConstraint(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(73).setJavaLines(193).setLengths(19);}
    public UmpleSourceData SuperCodeGenerator_checkStringForEqualsOperator(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(155).setJavaLines(275).setLengths(1);}
    public UmpleSourceData SuperCodeGenerator_prepareConstraint(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(387).setJavaLines(507).setLengths(47);}
    public UmpleSourceData SuperCodeGenerator_testForBooleanValueConstraint(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(126).setJavaLines(246).setLengths(10);}
    public UmpleSourceData SuperCodeGenerator_findConstants(){ return new UmpleSourceData().setFileNames("Generator_SuperCodeGenerator.ump").setUmpleLines(451).setJavaLines(573).setLengths(10);}
    public UmpleSourceData TokenTree_getPriority(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(645).setJavaLines(199).setLengths(13);}
    public UmpleSourceData TokenTree_getFeatureConnectionOpType(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(610).setJavaLines(162).setLengths(27);}
    public UmpleSourceData TokenTree_replaceWith(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeRequireStatement.ump").setUmpleLines(596).setJavaLines(146).setLengths(6);}
    public UmpleSourceData CodeInjection_getConstraintCode(){ return new UmpleSourceData().setFileNames("Aspect_refactored.ump").setUmpleLines(20).setJavaLines(303).setLengths(1);}
    public UmpleSourceData CodeInjection_CodeInjection(){ return new UmpleSourceData().setFileNames("Aspect_refactored.ump").setUmpleLines(8).setJavaLines(288).setLengths(1);}
    public UmpleSourceData CodeInjection_setCode(){ return new UmpleSourceData().setFileNames("Aspect_refactored.ump","Aspect_refactored.ump").setUmpleLines(12, 24).setJavaLines(293, 308).setLengths(1, 1);}
    public UmpleSourceData CodeInjection_hasCodeLabel(){ return new UmpleSourceData().setFileNames("Aspect_refactored.ump").setUmpleLines(43).setJavaLines(318).setLengths(1);}
    public UmpleSourceData CodeInjection_getCode(){ return new UmpleSourceData().setFileNames("Aspect_refactored.ump","Aspect_refactored.ump").setUmpleLines(16, 28).setJavaLines(298, 313).setLengths(1, 1);}
    public UmpleSourceData UmletGenerator_newAssociationTopToBottom(){ return new UmpleSourceData().setFileNames("Umlet_Code.ump").setUmpleLines(108).setJavaLines(340).setLengths(12);}
    public UmpleSourceData UmletGenerator_prepare(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(22).setJavaLines(407).setLengths(1);}
    public UmpleSourceData UmletGenerator_newClass(){ return new UmpleSourceData().setFileNames("Umlet_Code.ump").setUmpleLines(50).setJavaLines(282).setLengths(17);}
    public UmpleSourceData UmletGenerator_newAssociation(){ return new UmpleSourceData().setFileNames("Umlet_Code.ump").setUmpleLines(71).setJavaLines(303).setLengths(17);}
    public UmpleSourceData UmletGenerator_setSuboption(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(19).setJavaLines(387).setLengths(1);}
    public UmpleSourceData UmletGenerator_toXml(){ return new UmpleSourceData().setFileNames("Umlet_Code.ump").setUmpleLines(124).setJavaLines(356).setLengths(12);}
    public UmpleSourceData UmletGenerator_draw(){ return new UmpleSourceData().setFileNames("Umlet_Code.ump").setUmpleLines(24).setJavaLines(256).setLengths(22);}
    public UmpleSourceData UmletGenerator_hasSuboption(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(20).setJavaLines(397).setLengths(1);}
    public UmpleSourceData UmletGenerator_generate(){ return new UmpleSourceData().setFileNames("Umlet_Code.ump").setUmpleLines(16).setJavaLines(248).setLengths(4);}
    public UmpleSourceData UmletGenerator_newAssociationLeftToRight(){ return new UmpleSourceData().setFileNames("Umlet_Code.ump").setUmpleLines(92).setJavaLines(324).setLengths(12);}
    public UmpleSourceData UmletGenerator_setOutput(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(18).setJavaLines(377).setLengths(1);}
    public UmpleSourceData UmletGenerator_postpare(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(23).setJavaLines(417).setLengths(1);}
    public UmpleSourceData UmletDiagram_toXml(){ return new UmpleSourceData().setFileNames("Umlet_Code.ump").setUmpleLines(144).setJavaLines(154).setLengths(17);}
    public UmpleSourceData Key_isProvided(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(334).setJavaLines(124).setLengths(1);}
    public UmpleSourceData Key_isMember(){ return new UmpleSourceData().setFileNames("Umple_Code.ump","Umple_Code.ump").setUmpleLines(339, 344).setJavaLines(129, 134).setLengths(1, 1);}
    public UmpleSourceData UmpleEnumeration_hasSameName(){ return new UmpleSourceData().setFileNames("UmpleEnumeration_Code.ump").setUmpleLines(4).setJavaLines(123).setLengths(1);}
    public UmpleSourceData UmpleInterface_isUmpleInterface(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(633).setJavaLines(329).setLengths(1);}
    public UmpleSourceData Depend_getPackageName(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(354).setJavaLines(117).setLengths(6);}
    public UmpleSourceData UmpleVariable_UmpleVariable(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(900).setJavaLines(40).setLengths(3);}
    public UmpleSourceData UmpleVariable_setName(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(897).setJavaLines(54).setLengths(1);}
    public UmpleSourceData UmpleVariable_isImmutable(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(537).setJavaLines(141).setLengths(1);}
    public UmpleSourceData UmpleVariable_normalizeValue(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(542).setJavaLines(146).setLengths(12);}
    public UmpleSourceData UmpleVariable_getModifier(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(898).setJavaLines(108).setLengths(1);}
    public UmpleSourceData UmpleVariable_getTraced(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(24).setJavaLines(169).setLengths(25);}
    public UmpleSourceData UmpleVariable_getUpperCaseName(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(521).setJavaLines(125).setLengths(12);}
    public UmpleSourceData GeneratedElement_getMultiLookup(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(606).setJavaLines(75).setLengths(10);}
    public UmpleSourceData GeneratedElement_getLookup(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(572).setJavaLines(41).setLengths(8);}
    public UmpleSourceData GeneratedElement_setLookup(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(567).setJavaLines(36).setLengths(1);}
    public UmpleSourceData GeneratedElement_toString(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(620).setJavaLines(89).setLengths(7);}
    public UmpleSourceData GeneratedElement_addMultiLookup(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(584).setJavaLines(53).setLengths(18);}
    public UmpleSourceData Point_create(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(637).setJavaLines(120).setLengths(9);}
    public UmpleSourceData Point_toString(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(650).setJavaLines(133).setLengths(1);}
    public UmpleSourceData Comment_Comment(){ return new UmpleSourceData().setFileNames("Umple_Code.ump").setUmpleLines(663).setJavaLines(99).setLengths(3);}
    public UmpleSourceData Comment_format(){ return new UmpleSourceData().setFileNames("Umple_Code.ump","Umple_Code.ump").setUmpleLines(679, 684).setJavaLines(118, 123).setLengths(1, 164);}
    public UmpleSourceData GenerateTarget_getPath(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1201).setJavaLines(105).setLengths(1);}
    public UmpleSourceData NameSpace_setTimesUsed(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1213).setJavaLines(41).setLengths(1);}
    public UmpleSourceData Port_setUmpleClass(){ return new UmpleSourceData().setFileNames("Umple.ump").setUmpleLines(1245).setJavaLines(396).setLengths(1);}
    public UmpleSourceData TraceDirective_getTracerType(){ return new UmpleSourceData().setFileNames("Trace.ump").setUmpleLines(96).setJavaLines(62).setLengths(1);}
    public UmpleSourceData AttributeTraceItem_trace(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(119).setJavaLines(306).setLengths(82);}
    public UmpleSourceData AttributeTraceItem_getAttribute(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(98).setJavaLines(277).setLengths(1);}
    public UmpleSourceData AttributeTraceItem_addAttribute(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(101).setJavaLines(282).setLengths(1);}
    public UmpleSourceData AttributeTraceItem_getExtremities(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(208).setJavaLines(398).setLengths(2);}
    public UmpleSourceData AttributeTraceItem_getTracerType(){ return new UmpleSourceData().setFileNames("Trace.ump").setUmpleLines(162).setJavaLines(117).setLengths(1);}
    public UmpleSourceData AttributeTraceItem_getIsPre(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(104).setJavaLines(287).setLengths(1);}
    public UmpleSourceData AttributeTraceItem_getIsPost(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(107).setJavaLines(292).setLengths(1);}
    public UmpleSourceData MethodTraceItem_trace(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(265).setJavaLines(301).setLengths(71);}
    public UmpleSourceData MethodTraceItem_getExtremities(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(339).setJavaLines(376).setLengths(1);}
    public UmpleSourceData MethodTraceItem_getTracerType(){ return new UmpleSourceData().setFileNames("Trace.ump").setUmpleLines(190).setJavaLines(122).setLengths(1);}
    public UmpleSourceData MethodTraceItem_getIsPre(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(251).setJavaLines(282).setLengths(1);}
    public UmpleSourceData MethodTraceItem_getIsPost(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(254).setJavaLines(287).setLengths(1);}
    public UmpleSourceData TraceItemUtil_prepareLog4jMessages(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(384).setJavaLines(71).setLengths(35);}
    public UmpleSourceData TraceItemUtil_prepareMessageLayout(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(470).setJavaLines(167).setLengths(53);}
    public UmpleSourceData TraceItemUtil_prepareJavaLttngJniMessages(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(464).setJavaLines(157).setLengths(2);}
    public UmpleSourceData TraceItemUtil_prepareJavaLogAPIMessages(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(424).setJavaLines(114).setLengths(35);}
    public UmpleSourceData TraceItemUtil_prepareTraceMessage(){ return new UmpleSourceData().setFileNames("Trace_Code.ump").setUmpleLines(358).setJavaLines(42).setLengths(21);}
    public UmpleSourceData Monitor_getPortConstraint(){ return new UmpleSourceData().setFileNames("Structure.ump").setUmpleLines(81).setJavaLines(326).setLengths(8);}
    public UmpleSourceData AnonymousFunction_AnonymousFunction(){ return new UmpleSourceData().setFileNames("Structure.ump").setUmpleLines(218).setJavaLines(27).setLengths(1);}
    public UmpleSourceData EmitResponse_getCode(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(84).setJavaLines(61).setLengths(6);}
    public UmpleSourceData TemplateElement_resetContent(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(138).setJavaLines(395).setLengths(1);}
    public UmpleSourceData TemplateElement_setContent(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(132).setJavaLines(66).setLengths(3);}
    public UmpleSourceData TemplateElement_getEmitResponse(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(149).setJavaLines(406).setLengths(1);}
    public UmpleSourceData TemplateElement_TemplateElement(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(110).setJavaLines(42).setLengths(3);}
    public UmpleSourceData TemplateElement_emit(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(152).setJavaLines(411).setLengths(1);}
    public UmpleSourceData TemplateElement_computeContent(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(115).setJavaLines(379).setLengths(12);}
    public UmpleSourceData TemplateElement_append(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(143).setJavaLines(400).setLengths(2);}
    public UmpleSourceData ExpressionElement_emit(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(163).setJavaLines(37).setLengths(9);}
    public UmpleSourceData CodeBlockElement_emit(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(184).setJavaLines(38).setLengths(12);}
    public UmpleSourceData IncludeTemplateElement_emit(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(209).setJavaLines(55).setLengths(21);}
    public UmpleSourceData CommentElement_emit(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(241).setJavaLines(37).setLengths(13);}
    public UmpleSourceData TextElement_emit(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(267).setJavaLines(51).setLengths(26);}
    public UmpleSourceData VariableElement_emit(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(306).setJavaLines(51).setLengths(21);}
    public UmpleSourceData JavaMethodTemplateFormatter__createSpacesString(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(345).setJavaLines(50).setLengths(6);}
    public UmpleSourceData JavaMethodTemplateFormatter_getPrimaryEmitMethodBody(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(339).setJavaLines(40).setLengths(1);}
    public UmpleSourceData JavaMethodTemplateFormatter_getJavaPrimaryEmitMethodBody(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(362).setJavaLines(108).setLengths(2);}
    public UmpleSourceData JavaMethodTemplateFormatter_getSecondaryEmitMethodBody(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(342).setJavaLines(45).setLengths(1);}
    public UmpleSourceData JavaMethodTemplateFormatter_getJavaSecondaryEmitMethodBody(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(345).setJavaLines(80).setLengths(2);}
    public UmpleSourceData JavaMethodTemplateFormatter__getJavaSecondaryEmitMethodBody(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(345).setJavaLines(59).setLengths(18);}
    public UmpleSourceData JavaMethodTemplateFormatter__getJavaPrimaryEmitMethodBody(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(362).setJavaLines(85).setLengths(20);}
    public UmpleSourceData CppMethodTemplateFormatter__createSpacesString(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(378).setJavaLines(50).setLengths(6);}
    public UmpleSourceData CppMethodTemplateFormatter_getPrimaryEmitMethodBody(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(371).setJavaLines(40).setLengths(1);}
    public UmpleSourceData CppMethodTemplateFormatter_getCppSecondaryEmitMethodBody(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(378).setJavaLines(80).setLengths(2);}
    public UmpleSourceData CppMethodTemplateFormatter_getCppPrimaryEmitMethodBody(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(396).setJavaLines(108).setLengths(2);}
    public UmpleSourceData CppMethodTemplateFormatter_getSecondaryEmitMethodBody(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(374).setJavaLines(45).setLengths(1);}
    public UmpleSourceData CppMethodTemplateFormatter__getCppPrimaryEmitMethodBody(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(396).setJavaLines(85).setLengths(20);}
    public UmpleSourceData CppMethodTemplateFormatter__getCppSecondaryEmitMethodBody(){ return new UmpleSourceData().setFileNames("Template.ump").setUmpleLines(378).setJavaLines(59).setLengths(18);}
    public UmpleSourceData UncaughtException_toString(){ return new UmpleSourceData().setFileNames("UmpleHelper.ump").setUmpleLines(32).setJavaLines(246).setLengths(21);}
    public UmpleSourceData UmpleParserFactory_create(){ return new UmpleSourceData().setFileNames("UmpleHelper_Code.ump","UmpleHelper_Code.ump","UmpleHelper_Code.ump","UmpleHelper_Code.ump").setUmpleLines(70, 95, 100, 105).setJavaLines(29, 54, 59, 64).setLengths(21, 1, 1, 10);}
    public UmpleSourceData ConstraintTokenAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(84).setJavaLines(80).setLengths(3);}
    public UmpleSourceData GenExprAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(126).setJavaLines(94).setLengths(1);}
    public UmpleSourceData ConstraintBodyAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(188).setJavaLines(79).setLengths(2);}
    public UmpleSourceData ConstraintBodyAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(192).setJavaLines(85).setLengths(2);}
    public UmpleSourceData NegativeConstraintAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(209).setJavaLines(79).setLengths(2);}
    public UmpleSourceData NegativeConstraintAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(213).setJavaLines(85).setLengths(2);}
    public UmpleSourceData LinkingOpBodyAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(230).setJavaLines(79).setLengths(2);}
    public UmpleSourceData LinkingOpBodyAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(234).setJavaLines(85).setLengths(1);}
    public UmpleSourceData AndOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(248).setJavaLines(50).setLengths(1);}
    public UmpleSourceData OrOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(262).setJavaLines(50).setLengths(1);}
    public UmpleSourceData ArithmeticCallOperatorAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(276).setJavaLines(50).setLengths(1);}
    public UmpleSourceData ArithmeticCallAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(294).setJavaLines(78).setLengths(2);}
    public UmpleSourceData ArithmeticCallAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(300).setJavaLines(84).setLengths(4);}
    public UmpleSourceData NumExprNumberAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(318).setJavaLines(50).setLengths(1);}
    public UmpleSourceData ConstraintParameterNumberAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(333).setJavaLines(50).setLengths(1);}
    public UmpleSourceData BoolLiteralAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(348).setJavaLines(50).setLengths(1);}
    public UmpleSourceData AssociationExprAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(368).setJavaLines(94).setLengths(1);}
    public UmpleSourceData AssociationExprFirstOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(382).setJavaLines(50).setLengths(8);}
    public UmpleSourceData AssociationExprMoreOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(403).setJavaLines(50).setLengths(1);}
    public UmpleSourceData AssociationExprSmallerOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(417).setJavaLines(50).setLengths(1);}
    public UmpleSourceData AssociationExprEqualsOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(431).setJavaLines(50).setLengths(1);}
    public UmpleSourceData AssociationExprNotequalsOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(445).setJavaLines(50).setLengths(1);}
    public UmpleSourceData AssociationExprLessOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(459).setJavaLines(50).setLengths(1);}
    public UmpleSourceData AssociationExprGreaterOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(473).setJavaLines(50).setLengths(1);}
    public UmpleSourceData AssociationExprAllAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(487).setJavaLines(50).setLengths(1);}
    public UmpleSourceData AssociationLiteralAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(508).setJavaLines(137).setLengths(19);}
    public UmpleSourceData AssociationLiteralAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(530).setJavaLines(160).setLengths(1);}
    public UmpleSourceData IsNotInOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(544).setJavaLines(50).setLengths(1);}
    public UmpleSourceData IsInOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(558).setJavaLines(50).setLengths(1);}
    public UmpleSourceData ConstraintParameterListAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(575).setJavaLines(78).setLengths(4);}
    public UmpleSourceData ConstraintParameterListAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(582).setJavaLines(86).setLengths(2);}
    public UmpleSourceData ConstraintParameterAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(603).setJavaLines(109).setLengths(9);}
    public UmpleSourceData ConstraintParameterAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(616).setJavaLines(122).setLengths(1);}
    public UmpleSourceData ConstraintParameterListCommaAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(631).setJavaLines(50).setLengths(1);}
    public UmpleSourceData ConstraintNameAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(654).setJavaLines(151).setLengths(7);}
    public UmpleSourceData ConstraintNameAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(664).setJavaLines(162).setLengths(1);}
    public UmpleSourceData ConstraintNameNewAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(808).setJavaLines(50).setLengths(2);}
    public UmpleSourceData ConstraintNameIndexAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(823).setJavaLines(50).setLengths(22);}
    public UmpleSourceData ConstraintScopeOperatorAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(864).setJavaLines(106).setLengths(2);}
    public UmpleSourceData ConstraintScopeOperatorAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(870).setJavaLines(112).setLengths(1);}
    public UmpleSourceData StringExprQuoteAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(883).setJavaLines(50).setLengths(1);}
    public UmpleSourceData StringComplexExpressionAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(899).setJavaLines(79).setLengths(8);}
    public UmpleSourceData StringComplexExpressionAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(910).setJavaLines(91).setLengths(9);}
    public UmpleSourceData StringComplexExpressionConcatAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(932).setJavaLines(50).setLengths(1);}
    public UmpleSourceData NumExprEqualsOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(946).setJavaLines(50).setLengths(1);}
    public UmpleSourceData NumExprNotequalsOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(960).setJavaLines(50).setLengths(1);}
    public UmpleSourceData EqualsOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(975).setJavaLines(50).setLengths(1);}
    public UmpleSourceData NotequalsOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(989).setJavaLines(50).setLengths(1);}
    public UmpleSourceData GreaterOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1003).setJavaLines(50).setLengths(1);}
    public UmpleSourceData SmallerOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1017).setJavaLines(50).setLengths(1);}
    public UmpleSourceData MoreOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1031).setJavaLines(50).setLengths(1);}
    public UmpleSourceData LessOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1045).setJavaLines(50).setLengths(1);}
    public UmpleSourceData ModelConstraintBodyAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1059).setJavaLines(50).setLengths(6);}
    public UmpleSourceData ModelConstraintBodyAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1068).setJavaLines(60).setLengths(1);}
    public UmpleSourceData ModelConstraintBodyAnalyzer_reset(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1072).setJavaLines(65).setLengths(1);}
    public UmpleSourceData ModelLinkingOpAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1086).setJavaLines(50).setLengths(8);}
    public UmpleSourceData ModelExprAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1108).setJavaLines(50).setLengths(7);}
    public UmpleSourceData ModelRelationOpInheritanceSubclassAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1138).setJavaLines(50).setLengths(1);}
    public UmpleSourceData ModelRelationOpInheritanceSuperclassAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1152).setJavaLines(50).setLengths(1);}
    public UmpleSourceData ModelRelationOpAttributeAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1167).setJavaLines(50).setLengths(4);}
    public UmpleSourceData ModelRelationOpAttributeClassificationAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1185).setJavaLines(50).setLengths(8);}
    public UmpleSourceData ModelRelationOpAssociationAnalyzer_prepare(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1207).setJavaLines(50).setLengths(1);}
    public UmpleSourceData ModelRelationOpAssociationOpAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1222).setJavaLines(50).setLengths(1);}
    public UmpleSourceData ModelRelationAssociationEndAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1237).setJavaLines(64).setLengths(6);}
    public UmpleSourceData ModelRelationAssociationEndBoundAnalyzer_analyze(){ return new UmpleSourceData().setFileNames("UmpleAnalysis.ump").setUmpleLines(1256).setJavaLines(49).setLengths(8);}
    public UmpleSourceData UseStatementParserAction_onSuccess(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeParserHandlers.ump").setUmpleLines(35).setJavaLines(40).setLengths(35);}
    public UmpleSourceData UmpleLinkedFileHandler_onFileLink(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeParserHandlers.ump").setUmpleLines(88).setJavaLines(39).setLengths(13);}
    public UmpleSourceData UmpleAnalyzerGeneratorHandler_generateFromName(){ return new UmpleSourceData().setFileNames("UmpleInternalParser_CodeParserHandlers.ump").setUmpleLines(118).setJavaLines(38).setLengths(13);}
    public UmpleSourceData UmpleXtextParser_getModel(){ return new UmpleSourceData().setFileNames("UmpleXtextParser_Code.ump").setUmpleLines(54).setJavaLines(92).setLengths(1);}
    public UmpleSourceData UmpleXtextParser_getRootToken(){ return new UmpleSourceData().setFileNames("UmpleXtextParser_Code.ump").setUmpleLines(49).setJavaLines(87).setLengths(1);}
    public UmpleSourceData UmpleXtextParser_analyze(){ return new UmpleSourceData().setFileNames("UmpleXtextParser_Code.ump").setUmpleLines(44).setJavaLines(82).setLengths(1);}
    public UmpleSourceData UmpleXtextParser_setModel(){ return new UmpleSourceData().setFileNames("UmpleXtextParser_Code.ump").setUmpleLines(59).setJavaLines(97).setLengths(1);}
    public UmpleSourceData UmpleXtextParser_parse(){ return new UmpleSourceData().setFileNames("UmpleXtextParser_Code.ump").setUmpleLines(22).setJavaLines(61).setLengths(17);}
    public UmpleSourceData UmpleXtextParser_getParseResult(){ return new UmpleSourceData().setFileNames("UmpleXtextParser_Code.ump").setUmpleLines(64).setJavaLines(102).setLengths(1);}
    public UmpleSourceData UmpleXtextParser_toGrammar(){ return new UmpleSourceData().setFileNames("UmpleXtextParser_Code.ump").setUmpleLines(17).setJavaLines(56).setLengths(1);}
    public UmpleSourceData UmpleXtextParser_setFilename(){ return new UmpleSourceData().setFileNames("UmpleXtextParser_Code.ump").setUmpleLines(69).setJavaLines(107).setLengths(1);}
    public UmpleSourceData SynchronizationAction_go(){ return new UmpleSourceData().setFileNames("SynchronizationAction_Code.ump").setUmpleLines(18).setJavaLines(77).setLengths(1);}
    public UmpleSourceData UpdatePositioningAction_handleException(){ return new UmpleSourceData().setFileNames("UpdatePositioningAction_Code.ump").setUmpleLines(226).setJavaLines(260).setLengths(7);}
    public UmpleSourceData UpdatePositioningAction_go(){ return new UmpleSourceData().setFileNames("UpdatePositioningAction_Code.ump").setUmpleLines(18).setJavaLines(52).setLengths(46);}
    public UmpleSourceData UpdatePositioningAction_classHasPositioning(){ return new UmpleSourceData().setFileNames("UpdatePositioningAction_Code.ump").setUmpleLines(101).setJavaLines(135).setLengths(33);}
    public UmpleSourceData UpdatePositioningAction_classHasDefinition(){ return new UmpleSourceData().setFileNames("UpdatePositioningAction_Code.ump").setUmpleLines(138).setJavaLines(172).setLengths(36);}
    public UmpleSourceData UpdatePositioningAction_verifySubClasses(){ return new UmpleSourceData().setFileNames("UpdatePositioningAction_Code.ump").setUmpleLines(68).setJavaLines(102).setLengths(29);}
    public UmpleSourceData UpdatePositioningAction_addPositioning(){ return new UmpleSourceData().setFileNames("UpdatePositioningAction_Code.ump").setUmpleLines(178).setJavaLines(212).setLengths(44);}
    public UmpleSourceData NewAction_go(){ return new UmpleSourceData().setFileNames("NewAction_Code.ump").setUmpleLines(18).setJavaLines(39).setLengths(117);}
    public UmpleSourceData EditAction_mergeParameters(){ return new UmpleSourceData().setFileNames("EditAction_Code.ump").setUmpleLines(354).setJavaLines(375).setLengths(21);}
    public UmpleSourceData EditAction_go(){ return new UmpleSourceData().setFileNames("EditAction_Code.ump").setUmpleLines(18).setJavaLines(39).setLengths(332);}
    public UmpleSourceData EditAction_parametersMatch(){ return new UmpleSourceData().setFileNames("EditAction_Code.ump").setUmpleLines(379).setJavaLines(400).setLengths(28);}
    public UmpleSourceData DeleteAction_go(){ return new UmpleSourceData().setFileNames("DeleteAction_Code.ump").setUmpleLines(18).setJavaLines(39).setLengths(62);}
    public UmpleSourceData NewAssociationAction_handleException(){ return new UmpleSourceData().setFileNames("NewAssociationAction_Code.ump").setUmpleLines(230).setJavaLines(251).setLengths(8);}
    public UmpleSourceData NewAssociationAction_addAssociationPosition(){ return new UmpleSourceData().setFileNames("NewAssociationAction_Code.ump").setUmpleLines(33).setJavaLines(54).setLengths(100);}
    public UmpleSourceData NewAssociationAction_addAssociationDescription(){ return new UmpleSourceData().setFileNames("NewAssociationAction_Code.ump").setUmpleLines(137).setJavaLines(158).setLengths(89);}
    public UmpleSourceData NewAssociationAction_go(){ return new UmpleSourceData().setFileNames("NewAssociationAction_Code.ump").setUmpleLines(18).setJavaLines(39).setLengths(11);}
    public UmpleSourceData EditAssociationAction_handleException(){ return new UmpleSourceData().setFileNames("EditAssociationAction_Code.ump").setUmpleLines(203).setJavaLines(224).setLengths(8);}
    public UmpleSourceData EditAssociationAction_go(){ return new UmpleSourceData().setFileNames("EditAssociationAction_Code.ump").setUmpleLines(18).setJavaLines(39).setLengths(181);}
    public UmpleSourceData DeleteAssociationAction_go(){ return new UmpleSourceData().setFileNames("DeleteAssociationAction_Code.ump").setUmpleLines(18).setJavaLines(40).setLengths(147);}
    public UmpleSourceData DeleteGeneralizationAction_go(){ return new UmpleSourceData().setFileNames("DeleteGeneralizationAction_Code.ump").setUmpleLines(18).setJavaLines(39).setLengths(87);}
    public UmpleSourceData DeleteTransitionAction_go(){ return new UmpleSourceData().setFileNames("DeleteTransitionAction_Code.ump").setUmpleLines(18).setJavaLines(39).setLengths(92);}
    public UmpleSourceData DeleteTransitionAction_nestedState(){ return new UmpleSourceData().setFileNames("DeleteTransitionAction_Code.ump").setUmpleLines(115).setJavaLines(135).setLengths(55);}
    public UmpleSourceData NewGeneralizationAction_go(){ return new UmpleSourceData().setFileNames("NewGeneralizationAction_Code.ump").setUmpleLines(18).setJavaLines(39).setLengths(79);}
    public UmpleSourceData NewTransitionAction_handleException(){ return new UmpleSourceData().setFileNames("NewTransitionAction_Code.ump").setUmpleLines(141).setJavaLines(164).setLengths(8);}
    public UmpleSourceData NewTransitionAction_go(){ return new UmpleSourceData().setFileNames("NewTransitionAction_Code.ump").setUmpleLines(17).setJavaLines(39).setLengths(6);}
    public UmpleSourceData NewTransitionAction_addTransitionDescription(){ return new UmpleSourceData().setFileNames("NewTransitionAction_Code.ump").setUmpleLines(27).setJavaLines(49).setLengths(75);}
    public UmpleSourceData NewTransitionAction_nestedState(){ return new UmpleSourceData().setFileNames("NewTransitionAction_Code.ump").setUmpleLines(105).setJavaLines(128).setLengths(32);}
    public UmpleSourceData VioletGenerator_prepare(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(22).setJavaLines(373).setLengths(1);}
    public UmpleSourceData VioletGenerator_newClass(){ return new UmpleSourceData().setFileNames("Violet_Code.ump").setUmpleLines(24).setJavaLines(256).setLengths(17);}
    public UmpleSourceData VioletGenerator_newAssociation(){ return new UmpleSourceData().setFileNames("Violet_Code.ump").setUmpleLines(45).setJavaLines(277).setLengths(3);}
    public UmpleSourceData VioletGenerator_setSuboption(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(19).setJavaLines(353).setLengths(1);}
    public UmpleSourceData VioletGenerator_toXml(){ return new UmpleSourceData().setFileNames("Violet_Code.ump").setUmpleLines(91).setJavaLines(322).setLengths(12);}
    public UmpleSourceData VioletGenerator_draw(){ return new UmpleSourceData().setFileNames("Violet_Code.ump").setUmpleLines(52).setJavaLines(284).setLengths(34);}
    public UmpleSourceData VioletGenerator_hasSuboption(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(20).setJavaLines(363).setLengths(1);}
    public UmpleSourceData VioletGenerator_generate(){ return new UmpleSourceData().setFileNames("Violet_Code.ump").setUmpleLines(15).setJavaLines(248).setLengths(4);}
    public UmpleSourceData VioletGenerator_setOutput(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(18).setJavaLines(343).setLengths(1);}
    public UmpleSourceData VioletGenerator_postpare(){ return new UmpleSourceData().setFileNames("Generator.ump").setUmpleLines(23).setJavaLines(383).setLengths(1);}
    public UmpleSourceData VioletDiagram_toXml(){ return new UmpleSourceData().setFileNames("Violet_Code.ump").setUmpleLines(114).setJavaLines(214).setLengths(42);}
    public UmpleSourceData UmpleImportHandler_isSuccessful(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(60).setJavaLines(107).setLengths(1);}
    public UmpleSourceData UmpleImportHandler_getParseException(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(56).setJavaLines(102).setLengths(1);}
    public UmpleSourceData UmpleImportHandler_readDataFromXML(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump","UmpleImport_CodeHandlers.ump").setUmpleLines(21, 39).setJavaLines(63, 84).setLengths(9, 14);}
    public UmpleSourceData EcoreImportHandler_characters(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(171).setJavaLines(160).setLengths(1);}
    public UmpleSourceData EcoreImportHandler_endElement(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(163).setJavaLines(151).setLengths(5);}
    public UmpleSourceData EcoreImportHandler_startElement(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(78).setJavaLines(65).setLengths(82);}
    public UmpleSourceData EcoreImportHandler_fatalError(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(183).setJavaLines(175).setLengths(1);}
    public UmpleSourceData EcoreImportHandler_warning(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(175).setJavaLines(165).setLengths(1);}
    public UmpleSourceData EcoreImportHandler_parseRawTypes(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(187).setJavaLines(180).setLengths(10);}
    public UmpleSourceData EcoreImportHandler_error(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(179).setJavaLines(170).setLengths(1);}
    public UmpleSourceData EcoreImportHandler_startDocument(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(70).setJavaLines(55).setLengths(1);}
    public UmpleSourceData EcoreImportHandler_endDocument(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(74).setJavaLines(60).setLengths(1);}
    public UmpleSourceData ScxmlImportHandler_characters(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(260).setJavaLines(140).setLengths(8);}
    public UmpleSourceData ScxmlImportHandler_endElement(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(271).setJavaLines(152).setLengths(11);}
    public UmpleSourceData ScxmlImportHandler_startElement(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(215).setJavaLines(94).setLengths(42);}
    public UmpleSourceData ScxmlImportHandler_startDocument(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeHandlers.ump").setUmpleLines(208).setJavaLines(86).setLengths(4);}
    public UmpleSourceData ImportStateMachineElement_generateUmple(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(190).setJavaLines(188).setLengths(15);}
    public UmpleSourceData UmpleImportModel_checkIfOppositeExist(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(39).setJavaLines(172).setLengths(27);}
    public UmpleSourceData UmpleImportModel_generateUmpleFile(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(69).setJavaLines(203).setLengths(7);}
    public UmpleSourceData UmpleImportModel_generateUmple(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(18).setJavaLines(147).setLengths(17);}
    public UmpleSourceData UmpleImportPackage_generateUmple(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(82).setJavaLines(33).setLengths(3);}
    public UmpleSourceData UmpleImportClass_generateUmple(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(91).setJavaLines(409).setLengths(25);}
    public UmpleSourceData UmpleImportAttribute_generateUmple(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(122).setJavaLines(101).setLengths(4);}
    public UmpleSourceData UmpleImportAttribute_getUmpleTypeFromEcoreType(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(130).setJavaLines(109).setLengths(20);}
    public UmpleSourceData UmpleImportAssociation_generateMultiplicityBound(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(172).setJavaLines(167).setLengths(12);}
    public UmpleSourceData UmpleImportAssociation_generateUmple(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(156).setJavaLines(150).setLengths(13);}
    public UmpleSourceData ImportTransition_generateUmple(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(211).setJavaLines(81).setLengths(20);}
    public UmpleSourceData ImportAction_generateUmple(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(237).setJavaLines(51).setLengths(14);}
    public UmpleSourceData StateComparator_compare(){ return new UmpleSourceData().setFileNames("UmpleImport_CodeModels.ump").setUmpleLines(257).setJavaLines(48).setLengths(10);}
    public UmpleSourceData UmpleConsoleConfig_getTestUmpFilesFile(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(167).setJavaLines(554).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_setSuboptions(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(187).setJavaLines(579).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_getAllLinesOfFilesToTest(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(171).setJavaLines(559).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_getUmpleDirect(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(143).setJavaLines(524).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_setImportFile(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(155).setJavaLines(539).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_addSuboption(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(191).setJavaLines(584).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_getGenerate(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(135).setJavaLines(514).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_getCompile(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(147).setJavaLines(529).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_setPath(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(175).setJavaLines(564).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_getSuboptions(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(183).setJavaLines(574).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_setGenerate(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(139).setJavaLines(519).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_getImportFile(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(159).setJavaLines(544).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_getLinkedMixsetAsString(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(132).setJavaLines(509).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_setTestUmpFilesFile(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(163).setJavaLines(549).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_setCompile(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(151).setJavaLines(534).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_UmpleConsoleConfig(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(49).setJavaLines(420).setLengths(71);}
    public UmpleSourceData UmpleConsoleConfig_getLinkedFilesAsFile(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(127).setJavaLines(500).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_getPath(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(179).setJavaLines(569).setLengths(1);}
    public UmpleSourceData UmpleConsoleConfig_setLinkedFiles(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(123).setJavaLines(495).setLengths(1);}
    public UmpleSourceData UmpleConsoleMain_deletePreviouslyGenerated(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(531).setJavaLines(415).setLengths(9);}
    public UmpleSourceData UmpleConsoleMain_preModelOptionProcess(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(481).setJavaLines(360).setLengths(17);}
    public UmpleSourceData UmpleConsoleMain_optParse(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(589).setJavaLines(473).setLengths(13);}
    public UmpleSourceData UmpleConsoleMain_initializeOptionParser(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(544).setJavaLines(428).setLengths(26);}
    public UmpleSourceData UmpleConsoleMain_runConsole(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(233).setJavaLines(108).setLengths(154);}
    public UmpleSourceData UmpleConsoleMain_generateUmple(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(447).setJavaLines(324).setLengths(25);}
    public UmpleSourceData UmpleConsoleMain_main(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(391).setJavaLines(266).setLengths(52);}
    public UmpleSourceData UmpleConsoleMain_postModelOptionProcess(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(501).setJavaLines(381).setLengths(26);}
    public UmpleSourceData UmpleConsoleMain_UmpleConsoleMain(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(222).setJavaLines(96).setLengths(8);}
    public UmpleSourceData UmpleConsoleMain_printUsage(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(574).setJavaLines(458).setLengths(11);}
    public UmpleSourceData UmpleRunMain_main(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(621).setJavaLines(38).setLengths(68);}
    public UmpleSourceData AbstractServer_sendToAllClients(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(185).setJavaLines(312).setLengths(10);}
    public UmpleSourceData AbstractServer_isListening(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(207).setJavaLines(334).setLengths(1);}
    public UmpleSourceData AbstractServer_getNumberOfClients(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(250).setJavaLines(359).setLengths(1);}
    public UmpleSourceData AbstractServer_clientConnected(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(327).setJavaLines(439).setLengths(1);}
    public UmpleSourceData AbstractServer_stopListening(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(118).setJavaLines(241).setLengths(1);}
    public UmpleSourceData AbstractServer_run(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(261).setJavaLines(371).setLengths(53);}
    public UmpleSourceData AbstractServer_listen(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(99).setJavaLines(220).setLengths(12);}
    public UmpleSourceData AbstractServer_serverClosed(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(381).setJavaLines(491).setLengths(1);}
    public UmpleSourceData AbstractServer_AbstractServer(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(71).setJavaLines(192).setLengths(13);}
    public UmpleSourceData AbstractServer_listeningException(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(359).setJavaLines(454).setLengths(1);}
    public UmpleSourceData AbstractServer_serverStarted(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(366).setJavaLines(466).setLengths(1);}
    public UmpleSourceData AbstractServer_isClosed(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(218).setJavaLines(347).setLengths(1);}
    public UmpleSourceData AbstractServer_serverStopped(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(373).setJavaLines(478).setLengths(1);}
    public UmpleSourceData AbstractServer_close(){ return new UmpleSourceData().setFileNames("AbstractServer.ump").setUmpleLines(135).setJavaLines(260).setLengths(35);}
    public UmpleSourceData ConnectionToClient_ConnectionToClient(){ return new UmpleSourceData().setFileNames("ConnectionToClient.ump").setUmpleLines(70).setJavaLines(170).setLengths(26);}
    public UmpleSourceData ConnectionToClient_getInfo(){ return new UmpleSourceData().setFileNames("ConnectionToClient.ump").setUmpleLines(184).setJavaLines(258).setLengths(1);}
    public UmpleSourceData ConnectionToClient_toString(){ return new UmpleSourceData().setFileNames("ConnectionToClient.ump").setUmpleLines(159).setJavaLines(229).setLengths(3);}
    public UmpleSourceData ConnectionToClient_finalize(){ return new UmpleSourceData().setFileNames("ConnectionToClient.ump").setUmpleLines(289).setJavaLines(268).setLengths(5);}
    public UmpleSourceData ConnectionToClient_setInfo(){ return new UmpleSourceData().setFileNames("ConnectionToClient.ump").setUmpleLines(173).setJavaLines(245).setLengths(1);}
    public UmpleSourceData ConnectionToClient_sendToClient(){ return new UmpleSourceData().setFileNames("ConnectionToClient.ump").setUmpleLines(113).setJavaLines(214).setLengths(4);}
    public UmpleSourceData PlaygroundMain_serverClosed(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(1218).setJavaLines(913).setLengths(2);}
    public UmpleSourceData PlaygroundMain_returnCommandResult(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(805).setJavaLines(492).setLengths(13);}
    public UmpleSourceData PlaygroundMain_serverStarted(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(1206).setJavaLines(899).setLengths(4);}
    public UmpleSourceData PlaygroundMain_saveCommandsCount(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(1164).setJavaLines(855).setLengths(12);}
    public UmpleSourceData PlaygroundMain_loadCommandsCount(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(1179).setJavaLines(871).setLengths(24);}
    public UmpleSourceData PlaygroundMain_concatForLog(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(1223).setJavaLines(919).setLengths(5);}
    public UmpleSourceData PlaygroundMain_handleMessageFromClient(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(777).setJavaLines(463).setLengths(25);}
    public UmpleSourceData PlaygroundMain_action(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(1232).setJavaLines(928).setLengths(60);}
    public UmpleSourceData PlaygroundMain_main(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(769).setJavaLines(451).setLengths(2);}
    public UmpleSourceData PlaygroundMain_processCommand(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(824).setJavaLines(514).setLengths(337);}
    public UmpleSourceData PlaygroundMain_serverStopped(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(1213).setJavaLines(907).setLengths(2);}
    public UmpleSourceData PlaygroundMain_PlaygroundMain(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(761).setJavaLines(439).setLengths(4);}
    public UmpleSourceData CodeCompiler_getMainClasses(){ return new UmpleSourceData().setFileNames("Compiler.ump").setUmpleLines(270).setJavaLines(287).setLengths(28);}
    public UmpleSourceData CodeCompiler_println(){ return new UmpleSourceData().setFileNames("Compiler.ump").setUmpleLines(250).setJavaLines(268).setLengths(2);}
    public UmpleSourceData CodeCompiler_compile(){ return new UmpleSourceData().setFileNames("Compiler.ump").setUmpleLines(27).setJavaLines(39).setLengths(27);}
    public UmpleSourceData CodeCompiler_compileJava(){ return new UmpleSourceData().setFileNames("Compiler.ump").setUmpleLines(114).setJavaLines(128).setLengths(68);}
    public UmpleSourceData CodeCompiler_getSimpleFileName(){ return new UmpleSourceData().setFileNames("Compiler.ump").setUmpleLines(257).setJavaLines(274).setLengths(9);}
    public UmpleSourceData CodeCompiler_translateLineToUmple(){ return new UmpleSourceData().setFileNames("Compiler.ump").setUmpleLines(186).setJavaLines(204).setLengths(60);}
    public UmpleSourceData CodeCompiler_compilePhp(){ return new UmpleSourceData().setFileNames("Compiler.ump").setUmpleLines(57).setJavaLines(70).setLengths(54);}
    public UmpleSourceData ArgumentTokenizer__escapeQuotesAndBackslashes(){ return new UmpleSourceData().setFileNames("ArgumentTokenizer.ump").setUmpleLines(224).setJavaLines(255).setLengths(37);}
    public UmpleSourceData ArgumentTokenizer_main(){ return new UmpleSourceData().setFileNames("ArgumentTokenizer.ump").setUmpleLines(72).setJavaLines(98).setLengths(4);}
    public UmpleSourceData ArgumentTokenizer_tokenize(){ return new UmpleSourceData().setFileNames("ArgumentTokenizer.ump","ArgumentTokenizer.ump").setUmpleLines(67, 88).setJavaLines(93, 117).setLengths(1, 127);}
    public UmpleSourceData CompileDate_getClassBuildTime(){ return new UmpleSourceData().setFileNames("Main_Code.ump").setUmpleLines(1311).setJavaLines(40).setLengths(25);}
    public UmpleSourceData StatsMain_println(){ return new UmpleSourceData().setFileNames("UmpleStats_Code.ump").setUmpleLines(54).setJavaLines(64).setLengths(2);}
    public UmpleSourceData StatsMain_main(){ return new UmpleSourceData().setFileNames("UmpleStats_Code.ump").setUmpleLines(22).setJavaLines(30).setLengths(28);}
    public UmpleSourceData MetricsCollector_MetricsCollector(){ return new UmpleSourceData().setFileNames("UmpleStats_Code.ump").setUmpleLines(69).setJavaLines(26).setLengths(1);}
    public UmpleSourceData MetricsCollector_init(){ return new UmpleSourceData().setFileNames("UmpleStats_Code.ump").setUmpleLines(77).setJavaLines(83).setLengths(4);}
    public UmpleSourceData MetricsCollector_currentNumberOfAssociationType(){ return new UmpleSourceData().setFileNames("UmpleStats_Code.ump").setUmpleLines(159).setJavaLines(165).setLengths(8);}
    public UmpleSourceData MetricsCollector_analyze(){ return new UmpleSourceData().setFileNames("UmpleStats_Code.ump").setUmpleLines(85).setJavaLines(91).setLengths(25);}
    public UmpleSourceData MetricsCollector_save(){ return new UmpleSourceData().setFileNames("UmpleStats_Code.ump").setUmpleLines(114).setJavaLines(120).setLengths(1);}
    public UmpleSourceData MetricsCollector_toString(){ return new UmpleSourceData().setFileNames("UmpleStats_Code.ump").setUmpleLines(131).setJavaLines(137).setLengths(24);}
    public UmpleSourceData MetricsCollector_incrementAssociationType(){ return new UmpleSourceData().setFileNames("UmpleStats_Code.ump","UmpleStats_Code.ump").setUmpleLines(171, 176).setJavaLines(177, 182).setLengths(1, 6);}
    public UmpleSourceData MetricsCollector_numberOf(){ return new UmpleSourceData().setFileNames("UmpleStats_Code.ump").setUmpleLines(119).setJavaLines(125).setLengths(8);}
    public UmpleSourceData TriState_isTrue(){ return new UmpleSourceData().setFileNames("Util_Code.ump").setUmpleLines(18).setJavaLines(74).setLengths(1);}
    public UmpleSourceData TriState_isFalse(){ return new UmpleSourceData().setFileNames("Util_Code.ump").setUmpleLines(19).setJavaLines(79).setLengths(1);}
    public UmpleSourceData TriState_setStatus(){ return new UmpleSourceData().setFileNames("Util_Code.ump").setUmpleLines(17).setJavaLines(45).setLengths(1);}
    public UmpleSourceData Language_add(){ return new UmpleSourceData().setFileNames("Util_Code.ump").setUmpleLines(46).setJavaLines(59).setLengths(1);}
    public UmpleSourceData Language_init(){ return new UmpleSourceData().setFileNames("Util_Code.ump").setUmpleLines(35).setJavaLines(48).setLengths(2);}
    public UmpleSourceData Language_lookup(){ return new UmpleSourceData().setFileNames("Util_Code.ump","Util_Code.ump","Util_Code.ump","Util_Code.ump").setUmpleLines(51, 56, 62, 67).setJavaLines(64, 69, 75, 80).setLengths(1, 2, 1, 6);}
    public UmpleSourceData Language_Language(){ return new UmpleSourceData().setFileNames("Util_Code.ump").setUmpleLines(29).setJavaLines(27).setLengths(1);}
    public UmpleSourceData Language_reset(){ return new UmpleSourceData().setFileNames("Util_Code.ump").setUmpleLines(41).setJavaLines(54).setLengths(1);}
    public UmpleSourceData ExceptionDumper_javaToUmpleStackTrace(){ return new UmpleSourceData().setFileNames("Util_Code.ump").setUmpleLines(135).setJavaLines(87).setLengths(170);}
    public UmpleSourceData ExceptionDumper_dumpCompilerError(){ return new UmpleSourceData().setFileNames("Util_Code.ump").setUmpleLines(88).setJavaLines(36).setLengths(43);}
    public UmpleSourceData Glossary_init(){ return new UmpleSourceData().setFileNames("Glossary_Code.ump").setUmpleLines(27).setJavaLines(81).setLengths(29);}
    public UmpleSourceData Glossary_getPlural(){ return new UmpleSourceData().setFileNames("Glossary_Code.ump").setUmpleLines(115).setJavaLines(168).setLengths(50);}
    public UmpleSourceData Glossary_Glossary(){ return new UmpleSourceData().setFileNames("Glossary_Code.ump").setUmpleLines(24).setJavaLines(25).setLengths(1);}
    public UmpleSourceData Glossary_getSingular(){ return new UmpleSourceData().setFileNames("Glossary_Code.ump").setUmpleLines(61).setJavaLines(114).setLengths(50);}
    public UmpleSourceData SampleFileWriter_assertPartialFileContent(){ return new UmpleSourceData().setFileNames("SampleFileWriter_Code.ump").setUmpleLines(92).setJavaLines(101).setLengths(59);}
    public UmpleSourceData SampleFileWriter_readContent(){ return new UmpleSourceData().setFileNames("SampleFileWriter_Code.ump","SampleFileWriter_Code.ump").setUmpleLines(33, 38).setJavaLines(43, 48).setLengths(1, 26);}
    public UmpleSourceData SampleFileWriter_assertEitherFileContent(){ return new UmpleSourceData().setFileNames("SampleFileWriter_Code.ump").setUmpleLines(69).setJavaLines(78).setLengths(8);}
    public UmpleSourceData SampleFileWriter_getAllFiles(){ return new UmpleSourceData().setFileNames("SampleFileWriter_Code.ump").setUmpleLines(22).setJavaLines(31).setLengths(8);}
    public UmpleSourceData SampleFileWriter_closeAsRequired(){ return new UmpleSourceData().setFileNames("SampleFileWriter_Code.ump","SampleFileWriter_Code.ump").setUmpleLines(252, 267).setJavaLines(259, 274).setLengths(11, 11);}
    public UmpleSourceData SampleFileWriter_destroy(){ return new UmpleSourceData().setFileNames("SampleFileWriter_Code.ump","SampleFileWriter_Code.ump").setUmpleLines(331, 347).setJavaLines(340, 356).setLengths(12, 12);}
    public UmpleSourceData SampleFileWriter_readLine(){ return new UmpleSourceData().setFileNames("SampleFileWriter_Code.ump").setUmpleLines(81).setJavaLines(90).setLengths(7);}
    public UmpleSourceData SampleFileWriter_assertFileContent(){ return new UmpleSourceData().setFileNames("SampleFileWriter_Code.ump","SampleFileWriter_Code.ump","SampleFileWriter_Code.ump","SampleFileWriter_Code.ump").setUmpleLines(155, 159, 170, 182).setJavaLines(164, 169, 181, 193).setLengths(1, 8, 8, 62);}
    public UmpleSourceData SampleFileWriter_rationalize(){ return new UmpleSourceData().setFileNames("SampleFileWriter_Code.ump").setUmpleLines(282).setJavaLines(289).setLengths(24);}
    public UmpleSourceData SampleFileWriter_createFile(){ return new UmpleSourceData().setFileNames("SampleFileWriter_Code.ump").setUmpleLines(310).setJavaLines(317).setLengths(13);}
    public UmpleSourceData StringFormatter_stripLeadingPath(){ return new UmpleSourceData().setFileNames("StringFormatter_Code.ump").setUmpleLines(239).setJavaLines(248).setLengths(4);}
    public UmpleSourceData StringFormatter_joinParameters(){ return new UmpleSourceData().setFileNames("StringFormatter_Code.ump").setUmpleLines(131).setJavaLines(140).setLengths(15);}
    public UmpleSourceData StringFormatter_appendParameter(){ return new UmpleSourceData().setFileNames("StringFormatter_Code.ump").setUmpleLines(150).setJavaLines(159).setLengths(19);}
    public UmpleSourceData StringFormatter_toPascalCase(){ return new UmpleSourceData().setFileNames("StringFormatter_Code.ump").setUmpleLines(109).setJavaLines(119).setLengths(17);}
    public UmpleSourceData StringFormatter_sanitizeForJson(){ return new UmpleSourceData().setFileNames("StringFormatter_Code.ump").setUmpleLines(246).setJavaLines(256).setLengths(22);}
    public UmpleSourceData StringFormatter_format(){ return new UmpleSourceData().setFileNames("StringFormatter_Code.ump","StringFormatter_Code.ump").setUmpleLines(214, 219).setJavaLines(223, 228).setLengths(1, 8);}
    public UmpleSourceData StringFormatter_addPathOrAbsolute(){ return new UmpleSourceData().setFileNames("StringFormatter_Code.ump").setUmpleLines(231).setJavaLines(240).setLengths(4);}
    public UmpleSourceData StringFormatter_replaceParameter(){ return new UmpleSourceData().setFileNames("StringFormatter_Code.ump").setUmpleLines(173).setJavaLines(182).setLengths(37);}
    public UmpleSourceData StringFormatter_toUnderscore(){ return new UmpleSourceData().setFileNames("StringFormatter_Code.ump").setUmpleLines(52).setJavaLines(62).setLengths(53);}
    public UmpleSourceData StringFormatter_clean(){ return new UmpleSourceData().setFileNames("StringFormatter_Code.ump").setUmpleLines(271).setJavaLines(282).setLengths(1);}
    public UmpleSourceData StringFormatter_toCamelCase(){ return new UmpleSourceData().setFileNames("StringFormatter_Code.ump").setUmpleLines(19).setJavaLines(29).setLengths(29);}
    public UmpleSourceData UmplecAntTask_setSrc(){ return new UmpleSourceData().setFileNames("Ant.ump").setUmpleLines(48).setJavaLines(76).setLengths(3);}
    public UmpleSourceData UmplecAntTask_createLinkedFile(){ return new UmpleSourceData().setFileNames("Ant.ump").setUmpleLines(72).setJavaLines(105).setLengths(3);}
    public UmpleSourceData UmplecAntTask_setOverride(){ return new UmpleSourceData().setFileNames("Ant.ump").setUmpleLines(64).setJavaLines(95).setLengths(1);}
    public UmpleSourceData UmplecAntTask_execute(){ return new UmpleSourceData().setFileNames("Ant.ump").setUmpleLines(21).setJavaLines(55).setLengths(17);}
    public UmpleSourceData UmplecAntTask_setLinkedFile(){ return new UmpleSourceData().setFileNames("Ant.ump").setUmpleLines(54).setJavaLines(83).setLengths(3);}
    public UmpleSourceData UmplecAntTask_setGenerate(){ return new UmpleSourceData().setFileNames("Ant.ump").setUmpleLines(60).setJavaLines(90).setLengths(1);}
    public UmpleSourceData UmplecAntTask_setDest(){ return new UmpleSourceData().setFileNames("Ant.ump").setUmpleLines(68).setJavaLines(100).setLengths(1);}
    public UmpleSourceData Command_callMethod(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(153).setJavaLines(341).setLengths(21);}
    public UmpleSourceData Command_showValue(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(178).setJavaLines(366).setLengths(8);}
    public UmpleSourceData Command_newObject(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(92).setJavaLines(280).setLengths(19);}
    public UmpleSourceData Command_addAttributes(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(20).setJavaLines(208).setLengths(14);}
    public UmpleSourceData Command_runMethod(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(115).setJavaLines(303).setLengths(1);}
    public UmpleSourceData Command_showResults(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(120).setJavaLines(308).setLengths(1);}
    public UmpleSourceData Command_assertMethod(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(125).setJavaLines(313).setLengths(24);}
    public UmpleSourceData Command_popMessages(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(38).setJavaLines(226).setLengths(3);}
    public UmpleSourceData Command_exec(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(45).setJavaLines(233).setLengths(43);}
    public UmpleSourceData Builder_runAnt(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(238).setJavaLines(74).setLengths(1);}
    public UmpleSourceData Builder_compile(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(203).setJavaLines(39).setLengths(19);}
    public UmpleSourceData Builder_load(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(226).setJavaLines(62).setLengths(8);}
    public UmpleSourceData Builder_runAntOLD(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(314).setJavaLines(79).setLengths(8);}
    public UmpleSourceData Builder_createAntFile(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(327).setJavaLines(91).setLengths(30);}
    public UmpleSourceData DynamicClassPathLoader_addURL(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(379).setJavaLines(37).setLengths(13);}
    public UmpleSourceData DynamicClassPathLoader_addJar(){ return new UmpleSourceData().setFileNames("Builder_Code.ump").setUmpleLines(373).setJavaLines(31).setLengths(2);}
    public UmpleSourceData Graph_isDepthFirst(){ return new UmpleSourceData().setFileNames("GraphWalking_Code.ump").setUmpleLines(24).setJavaLines(38).setLengths(1);}
    public UmpleSourceData Graph_clearNodes(){ return new UmpleSourceData().setFileNames("GraphWalking_Code.ump").setUmpleLines(31).setJavaLines(56).setLengths(1);}
    public UmpleSourceData Graph_nextNode(){ return new UmpleSourceData().setFileNames("GraphWalking_Code.ump").setUmpleLines(28).setJavaLines(47).setLengths(1);}
    public UmpleSourceData Graph_hasNext(){ return new UmpleSourceData().setFileNames("GraphWalking_Code.ump").setUmpleLines(17).setJavaLines(31).setLengths(3);}
    public UmpleSourceData RubyGenerator_prepare(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump","Generator_CodeRuby.ump").setUmpleLines(110, 648).setJavaLines(37, 585).setLengths(15, 132);}
    public UmpleSourceData RubyGenerator_initializeLangaugeBasedVariables(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(984).setJavaLines(920).setLengths(28);}
    public UmpleSourceData RubyGenerator_addImports(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(908).setJavaLines(843).setLengths(2);}
    public UmpleSourceData RubyGenerator_getApplicableCodeInjections(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump","Generator_CodeRuby.ump").setUmpleLines(165, 184).setJavaLines(97, 117).setLengths(16, 16);}
    public UmpleSourceData RubyGenerator_getImplementsInterfacesNames(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(251).setJavaLines(184).setLengths(6);}
    public UmpleSourceData RubyGenerator_umpleCVarToLanguagePrimitive(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(153).setJavaLines(81).setLengths(8);}
    public UmpleSourceData RubyGenerator_translate(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump","Generator_CodeRuby.ump","Generator_CodeRuby.ump","Generator_CodeRuby.ump","Generator_CodeRuby.ump","Generator_CodeRuby.ump","Generator_CodeRuby.ump","Generator_CodeRuby.ump","Generator_CodeRuby.ump").setUmpleLines(204, 214, 273, 279, 307, 418, 456, 475, 499).setJavaLines(137, 147, 206, 212, 244, 355, 393, 412, 436).setLengths(6, 22, 2, 2, 107, 34, 15, 20, 21);}
    public UmpleSourceData RubyGenerator_injectIntoUniqueSet(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(638).setJavaLines(575).setLengths(1);}
    public UmpleSourceData RubyGenerator_translateInterfaceValue(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(285).setJavaLines(222).setLengths(18);}
    public UmpleSourceData RubyGenerator_getExtendAndImplements(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(240).setJavaLines(173).setLengths(7);}
    public UmpleSourceData RubyGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(524).setJavaLines(461).setLengths(10);}
    public UmpleSourceData RubyGenerator_writeFile(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(580).setJavaLines(517).setLengths(24);}
    public UmpleSourceData RubyGenerator_generateNullableConstructorSignature(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(901).setJavaLines(837).setLengths(2);}
    public UmpleSourceData RubyGenerator_getExtendClassesNames(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(261).setJavaLines(194).setLengths(8);}
    public UmpleSourceData RubyGenerator_generateSecondaryConstructorSignatures(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(863).setJavaLines(799).setLengths(34);}
    public UmpleSourceData RubyGenerator_addRelatedImports(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(938).setJavaLines(873).setLengths(43);}
    public UmpleSourceData RubyGenerator_generateConstructorSignature(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(785).setJavaLines(721).setLengths(63);}
    public UmpleSourceData RubyGenerator_getLanguageFor(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(139).setJavaLines(66).setLengths(11);}
    public UmpleSourceData RubyGenerator_addAssociationImports(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(915).setJavaLines(849).setLengths(1);}
    public UmpleSourceData RubyGenerator_injectIntoUniqueDelete(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(643).setJavaLines(580).setLengths(1);}
    public UmpleSourceData RubyGenerator_injectIntoUnique(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(624).setJavaLines(561).setLengths(10);}
    public UmpleSourceData RubyGenerator_isNullable(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(129).setJavaLines(56).setLengths(1);}
    public UmpleSourceData RubyGenerator_relatedTranslate(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(134).setJavaLines(61).setLengths(1);}
    public UmpleSourceData RubyGenerator_nameOf(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump","Generator_CodeRuby.ump","Generator_CodeRuby.ump").setUmpleLines(538, 852, 857).setJavaLines(475, 788, 793).setLengths(14, 1, 2);}
    public UmpleSourceData RubyGenerator_typeOf(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(556).setJavaLines(493).setLengths(20);}
    public UmpleSourceData RubyGenerator_getUpperCaseName(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(608).setJavaLines(545).setLengths(12);}
    public UmpleSourceData RubyGenerator_addAttributeImports(){ return new UmpleSourceData().setFileNames("Generator_CodeRuby.ump").setUmpleLines(919).setJavaLines(854).setLengths(15);}
    public UmpleSourceData JavaGenerator_prepare(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump","Generator_CodeJava.ump").setUmpleLines(1633, 1801).setJavaLines(1629, 1800).setLengths(34, 179);}
    public UmpleSourceData JavaGenerator_initializeLangaugeBasedVariables(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(3367).setJavaLines(3370).setLengths(38);}
    public UmpleSourceData JavaGenerator_WriteProxyFiles(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2702).setJavaLines(2705).setLengths(507);}
    public UmpleSourceData JavaGenerator_prepareCodeInjectionForAssociation(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2045).setJavaLines(2044).setLengths(45);}
    public UmpleSourceData JavaGenerator_addImports(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2595).setJavaLines(2597).setLengths(87);}
    public UmpleSourceData JavaGenerator_getImplementsInterfacesNames(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1438).setJavaLines(1430).setLengths(15);}
    public UmpleSourceData JavaGenerator_prepareFinalStatesFor(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2245).setJavaLines(2247).setLengths(17);}
    public UmpleSourceData JavaGenerator_addJavaLogAPIImport(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1682).setJavaLines(1680).setLengths(6);}
    public UmpleSourceData JavaGenerator_translate(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump","Generator_CodeJava.ump","Generator_CodeJava.ump","Generator_CodeJava.ump","Generator_CodeJava.ump","Generator_CodeJava.ump","Generator_CodeJava.ump","Generator_CodeJava.ump","Generator_CodeJava.ump","Generator_CodeJava.ump","Generator_CodeJava.ump").setUmpleLines(186, 215, 234, 537, 562, 613, 626, 647, 1457, 1462, 1496).setJavaLines(175, 204, 223, 526, 551, 602, 615, 636, 1449, 1454, 1494).setLengths(25, 15, 299, 21, 47, 9, 17, 732, 1, 1, 131);}
    public UmpleSourceData JavaGenerator_umpleCVarToLanguagePrimitive(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1382).setJavaLines(1372).setLengths(8);}
    public UmpleSourceData JavaGenerator_writeObjectFactoryInterface(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(3238).setJavaLines(3241).setLengths(21);}
    public UmpleSourceData JavaGenerator_associationShouldAppearInConstructor(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2451).setJavaLines(2452).setLengths(23);}
    public UmpleSourceData JavaGenerator_prepareCodeInjectionForAttribute(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2006).setJavaLines(2005).setLengths(35);}
    public UmpleSourceData JavaGenerator_prepareTimedEvents(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2094).setJavaLines(2093).setLengths(78);}
    public UmpleSourceData JavaGenerator_injectIntoUniqueSet(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1790).setJavaLines(1790).setLengths(1);}
    public UmpleSourceData JavaGenerator_addJavaLttngImport(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1702).setJavaLines(1702).setLengths(14);}
    public UmpleSourceData JavaGenerator_translateInterfaceValue(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1468).setJavaLines(1463).setLengths(18);}
    public UmpleSourceData JavaGenerator_writeObjectFactoryClass(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(3213).setJavaLines(3216).setLengths(21);}
    public UmpleSourceData JavaGenerator_prepareCodeInjectionForAttributes(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1990).setJavaLines(1989).setLengths(4);}
    public UmpleSourceData JavaGenerator_getExtendAndImplements(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1411).setJavaLines(1401).setLengths(7);}
    public UmpleSourceData JavaGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(111).setJavaLines(101).setLengths(45);}
    public UmpleSourceData JavaGenerator_writeFile(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(3264).setJavaLines(3266).setLengths(62);}
    public UmpleSourceData JavaGenerator_getExtendClassesNames(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1424).setJavaLines(1416).setLengths(10);}
    public UmpleSourceData JavaGenerator_generateSecondaryConstructorSignatures(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2478).setJavaLines(2479).setLengths(34);}
    public UmpleSourceData JavaGenerator_addJavaLttngJniImport(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1691).setJavaLines(1690).setLengths(8);}
    public UmpleSourceData JavaGenerator_addRelatedImports(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2516).setJavaLines(2517).setLengths(51);}
    public UmpleSourceData JavaGenerator_generateConstructorSignature(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2307).setJavaLines(2309).setLengths(139);}
    public UmpleSourceData JavaGenerator_getLanguageFor(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(161).setJavaLines(150).setLengths(11);}
    public UmpleSourceData JavaGenerator_translateInterfaceType(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1491).setJavaLines(1489).setLengths(1);}
    public UmpleSourceData JavaGenerator_prepareCodeInjection(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1984).setJavaLines(1983).setLengths(2);}
    public UmpleSourceData JavaGenerator_writeUncaughtExceptionFile(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(3330).setJavaLines(3332).setLengths(34);}
    public UmpleSourceData JavaGenerator_prepareDoActivityThread(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2176).setJavaLines(2175).setLengths(17);}
    public UmpleSourceData JavaGenerator_prepareNestedStatesFor(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2266).setJavaLines(2268).setLengths(37);}
    public UmpleSourceData JavaGenerator_getImplementsForInterfaces(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1394).setJavaLines(1384).setLengths(13);}
    public UmpleSourceData JavaGenerator_injectIntoUniqueDelete(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1795).setJavaLines(1795).setLengths(1);}
    public UmpleSourceData JavaGenerator_addLog4jVarImport(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1670).setJavaLines(1667).setLengths(9);}
    public UmpleSourceData JavaGenerator_prepareCodeInjectionForAssociations(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1998).setJavaLines(1997).setLengths(4);}
    public UmpleSourceData JavaGenerator_injectIntoUnique(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1777).setJavaLines(1777).setLengths(9);}
    public UmpleSourceData JavaGenerator_prepareConcurrentFinalStatesFor(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2200).setJavaLines(2201).setLengths(42);}
    public UmpleSourceData JavaGenerator_isNullable(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(176).setJavaLines(165).setLengths(1);}
    public UmpleSourceData JavaGenerator_relatedTranslate(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(181).setJavaLines(170).setLengths(1);}
    public UmpleSourceData JavaGenerator_nameOf(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump","Generator_CodeJava.ump","Generator_CodeJava.ump").setUmpleLines(1749, 2685, 2690).setJavaLines(1748, 2688, 2693).setLengths(14, 1, 2);}
    public UmpleSourceData JavaGenerator_typeOf(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump","Generator_CodeJava.ump").setUmpleLines(1721, 2696).setJavaLines(1720, 2699).setLengths(24, 2);}
    public UmpleSourceData JavaGenerator_getUpperCaseName(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(1772).setJavaLines(1772).setLengths(1);}
    public UmpleSourceData JavaGenerator_addAttributeImports(){ return new UmpleSourceData().setFileNames("Generator_CodeJava.ump").setUmpleLines(2571).setJavaLines(2572).setLengths(21);}
    public UmpleSourceData RTCppGenerator_generateContents(){ return new UmpleSourceData().setFileNames("Generator_CodeRTCpp.ump").setUmpleLines(52).setJavaLines(97).setLengths(22);}
    public UmpleSourceData RTCppGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeRTCpp.ump").setUmpleLines(30).setJavaLines(74).setLengths(19);}
    public UmpleSourceData PhpGenerator_prepare(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump","Generator_CodePhp.ump").setUmpleLines(108, 643).setJavaLines(37, 575).setLengths(15, 126);}
    public UmpleSourceData PhpGenerator_initializeLangaugeBasedVariables(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(1021).setJavaLines(951).setLengths(33);}
    public UmpleSourceData PhpGenerator_addImports(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(959).setJavaLines(888).setLengths(12);}
    public UmpleSourceData PhpGenerator_getImplementsInterfacesNames(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(227).setJavaLines(156).setLengths(6);}
    public UmpleSourceData PhpGenerator_translate(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump","Generator_CodePhp.ump","Generator_CodePhp.ump","Generator_CodePhp.ump","Generator_CodePhp.ump","Generator_CodePhp.ump","Generator_CodePhp.ump","Generator_CodePhp.ump","Generator_CodePhp.ump","Generator_CodePhp.ump").setUmpleLines(152, 161, 178, 237, 243, 272, 387, 421, 440, 486).setJavaLines(81, 90, 107, 166, 172, 204, 319, 353, 372, 418).setLengths(5, 13, 22, 2, 2, 111, 30, 15, 42, 20);}
    public UmpleSourceData PhpGenerator_umpleCVarToLanguagePrimitive(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(902).setJavaLines(832).setLengths(8);}
    public UmpleSourceData PhpGenerator_injectIntoUniqueSet(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(633).setJavaLines(565).setLengths(1);}
    public UmpleSourceData PhpGenerator_translateInterfaceValue(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(250).setJavaLines(182).setLengths(18);}
    public UmpleSourceData PhpGenerator_getExtendAndImplements(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(204).setJavaLines(133).setLengths(7);}
    public UmpleSourceData PhpGenerator_prepareFinalStateFor(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(776).setJavaLines(705).setLengths(7);}
    public UmpleSourceData PhpGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(510).setJavaLines(442).setLengths(16);}
    public UmpleSourceData PhpGenerator_writeFile(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(576).setJavaLines(508).setLengths(23);}
    public UmpleSourceData PhpGenerator_generateNullableConstructorSignature(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(952).setJavaLines(882).setLengths(2);}
    public UmpleSourceData PhpGenerator_getExtendClassesNames(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(215).setJavaLines(144).setLengths(8);}
    public UmpleSourceData PhpGenerator_generateSecondaryConstructorSignatures(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(914).setJavaLines(844).setLengths(34);}
    public UmpleSourceData PhpGenerator_addRelatedImports(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(975).setJavaLines(904).setLengths(43);}
    public UmpleSourceData PhpGenerator_generateConstructorSignature(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(825).setJavaLines(754).setLengths(63);}
    public UmpleSourceData PhpGenerator_getLanguageFor(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(137).setJavaLines(66).setLengths(11);}
    public UmpleSourceData PhpGenerator_prepareNestedStatesFor(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(787).setJavaLines(716).setLengths(34);}
    public UmpleSourceData PhpGenerator_injectIntoUniqueDelete(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(638).setJavaLines(570).setLengths(1);}
    public UmpleSourceData PhpGenerator_injectIntoUnique(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(619).setJavaLines(551).setLengths(10);}
    public UmpleSourceData PhpGenerator_isNullable(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(127).setJavaLines(56).setLengths(1);}
    public UmpleSourceData PhpGenerator_relatedTranslate(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(132).setJavaLines(61).setLengths(1);}
    public UmpleSourceData PhpGenerator_nameOf(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump","Generator_CodePhp.ump","Generator_CodePhp.ump").setUmpleLines(530, 892, 897).setJavaLines(462, 821, 826).setLengths(14, 1, 2);}
    public UmpleSourceData PhpGenerator_typeOf(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(548).setJavaLines(480).setLengths(24);}
    public UmpleSourceData PhpGenerator_getUpperCaseName(){ return new UmpleSourceData().setFileNames("Generator_CodePhp.ump").setUmpleLines(603).setJavaLines(535).setLengths(12);}
    public UmpleSourceData Uigu2Generator_generateIndexFile(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(84).setJavaLines(122).setLengths(21);}
    public UmpleSourceData Uigu2Generator_assertSetupFileExistent(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(150).setJavaLines(196).setLengths(5);}
    public UmpleSourceData Uigu2Generator_writeStringToFile(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(126).setJavaLines(169).setLengths(11);}
    public UmpleSourceData Uigu2Generator_generateModRewriteFile(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(111).setJavaLines(151).setLengths(8);}
    public UmpleSourceData Uigu2Generator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(42).setJavaLines(76).setLengths(15);}
    public UmpleSourceData Uigu2Generator_generateInitializationFile(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(63).setJavaLines(99).setLengths(15);}
    public UmpleSourceData Uigu2Generator_setOutputPath(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(140).setJavaLines(184).setLengths(3);}
    public UmpleSourceData Uigu2ElementGenerator_getAssociationsSuperClasses(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(287).setJavaLines(169).setLengths(7);}
    public UmpleSourceData Uigu2ElementGenerator_appendConstructorCode(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(249).setJavaLines(128).setLengths(20);}
    public UmpleSourceData Uigu2ElementGenerator_getAttributesSuperClasses(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(277).setJavaLines(158).setLengths(7);}
    public UmpleSourceData Uigu2ElementGenerator_appendAttributesCode(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(210).setJavaLines(87).setLengths(19);}
    public UmpleSourceData Uigu2ElementGenerator_appendAssociationsCode(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(232).setJavaLines(110).setLengths(14);}
    public UmpleSourceData Uigu2ElementGenerator_getCode(){ return new UmpleSourceData().setFileNames("Generator_CodeUigu2.ump").setUmpleLines(175).setJavaLines(51).setLengths(32);}
    public UmpleSourceData SqlGenerator_matchesRootClass(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(161).setJavaLines(92).setLengths(2);}
    public UmpleSourceData SqlGenerator_prepare(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump","Generator_CodeSql.ump").setUmpleLines(107, 882).setJavaLines(37, 819).setLengths(46, 83);}
    public UmpleSourceData SqlGenerator_initializeLangaugeBasedVariables(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(1250).setJavaLines(1188).setLengths(7);}
    public UmpleSourceData SqlGenerator_makeFakeAttribute(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(297).setJavaLines(228).setLengths(1);}
    public UmpleSourceData SqlGenerator_addImports(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(1186).setJavaLines(1123).setLengths(2);}
    public UmpleSourceData SqlGenerator_getImplementsInterfacesNames(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(441).setJavaLines(372).setLengths(6);}
    public UmpleSourceData SqlGenerator_translate(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump","Generator_CodeSql.ump","Generator_CodeSql.ump","Generator_CodeSql.ump","Generator_CodeSql.ump","Generator_CodeSql.ump","Generator_CodeSql.ump","Generator_CodeSql.ump","Generator_CodeSql.ump","Generator_CodeSql.ump").setUmpleLines(337, 362, 375, 463, 469, 474, 513, 628, 670, 711).setJavaLines(268, 293, 306, 394, 400, 405, 450, 565, 607, 648).setLengths(1, 9, 51, 2, 1, 2, 111, 38, 37, 21);}
    public UmpleSourceData SqlGenerator_toggleReadyToSetRootClass(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(166).setJavaLines(98).setLengths(5);}
    public UmpleSourceData SqlGenerator_translateInterfaceValue(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(481).setJavaLines(415).setLengths(22);}
    public UmpleSourceData SqlGenerator_createNewIntPK(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(1081).setJavaLines(1020).setLengths(44);}
    public UmpleSourceData SqlGenerator_getExtendAndImplements(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(430).setJavaLines(361).setLengths(7);}
    public UmpleSourceData SqlGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(736).setJavaLines(673).setLengths(3);}
    public UmpleSourceData SqlGenerator_writeFile(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(789).setJavaLines(726).setLengths(73);}
    public UmpleSourceData SqlGenerator_generateNullableConstructorSignature(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(1179).setJavaLines(1117).setLengths(2);}
    public UmpleSourceData SqlGenerator_getExtendClassesNames(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(451).setJavaLines(382).setLengths(8);}
    public UmpleSourceData SqlGenerator_generateSecondaryConstructorSignatures(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(1141).setJavaLines(1079).setLengths(34);}
    public UmpleSourceData SqlGenerator_addRelatedImports(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(1216).setJavaLines(1153).setLengths(31);}
    public UmpleSourceData SqlGenerator_generateConstructorSignature(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(969).setJavaLines(906).setLengths(63);}
    public UmpleSourceData SqlGenerator_getLanguageFor(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(347).setJavaLines(278).setLengths(11);}
    public UmpleSourceData SqlGenerator_translateInterfaceType(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(508).setJavaLines(445).setLengths(1);}
    public UmpleSourceData SqlGenerator_accountForInheritance(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(1035).setJavaLines(973).setLengths(43);}
    public UmpleSourceData SqlGenerator_attributePsudoCopy(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(288).setJavaLines(219).setLengths(5);}
    public UmpleSourceData SqlGenerator_resolvePrimaryKey(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(176).setJavaLines(107).setLengths(108);}
    public UmpleSourceData SqlGenerator_addAssociationImports(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(1193).setJavaLines(1129).setLengths(1);}
    public UmpleSourceData SqlGenerator_setRootClass(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(157).setJavaLines(87).setLengths(1);}
    public UmpleSourceData SqlGenerator_getType(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(302).setJavaLines(233).setLengths(26);}
    public UmpleSourceData SqlGenerator_isNullable(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(332).setJavaLines(263).setLengths(1);}
    public UmpleSourceData SqlGenerator_relatedTranslate(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(342).setJavaLines(273).setLengths(1);}
    public UmpleSourceData SqlGenerator_nameOf(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump","Generator_CodeSql.ump","Generator_CodeSql.ump").setUmpleLines(743, 1130, 1135).setJavaLines(680, 1068, 1073).setLengths(14, 1, 2);}
    public UmpleSourceData SqlGenerator_typeOf(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(761).setJavaLines(698).setLengths(24);}
    public UmpleSourceData SqlGenerator_getUpperCaseName(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(866).setJavaLines(803).setLengths(12);}
    public UmpleSourceData SqlGenerator_addAttributeImports(){ return new UmpleSourceData().setFileNames("Generator_CodeSql.ump").setUmpleLines(1197).setJavaLines(1134).setLengths(15);}
    public UmpleSourceData UmpleSelfGenerator_generateParams(){ return new UmpleSourceData().setFileNames("Generator_CodeUmpleSelf.ump").setUmpleLines(168).setJavaLines(395).setLengths(19);}
    public UmpleSourceData UmpleSelfGenerator_name(){ return new UmpleSourceData().setFileNames("Generator_CodeUmpleSelf.ump").setUmpleLines(433).setJavaLines(663).setLengths(2);}
    public UmpleSourceData UmpleSelfGenerator_generateBasedOn(){ return new UmpleSourceData().setFileNames("Generator_CodeUmpleSelf.ump").setUmpleLines(468).setJavaLines(698).setLengths(11);}
    public UmpleSourceData UmpleSelfGenerator_generateStateMachine(){ return new UmpleSourceData().setFileNames("Generator_CodeUmpleSelf.ump","Generator_CodeUmpleSelf.ump").setUmpleLines(191, 311).setJavaLines(418, 541).setLengths(115, 118);}
    public UmpleSourceData UmpleSelfGenerator_spacer(){ return new UmpleSourceData().setFileNames("Generator_CodeUmpleSelf.ump").setUmpleLines(439).setJavaLines(669).setLengths(6);}
    public UmpleSourceData UmpleSelfGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeUmpleSelf.ump").setUmpleLines(42).setJavaLines(267).setLengths(108);}
    public UmpleSourceData UmpleSelfGenerator_generateMethod(){ return new UmpleSourceData().setFileNames("Generator_CodeUmpleSelf.ump").setUmpleLines(156).setJavaLines(383).setLengths(8);}
    public UmpleSourceData UmpleSelfGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeUmpleSelf.ump").setUmpleLines(449).setJavaLines(679).setLengths(15);}
    public UmpleSourceData USEGenerator__createSpacesString(){ return new UmpleSourceData().setFileNames("Generator_CodeUSE.ump").setUmpleLines(59).setJavaLines(153).setLengths(6);}
    public UmpleSourceData USEGenerator_generateTemplate(){ return new UmpleSourceData().setFileNames("Generator_CodeUSE.ump").setUmpleLines(95).setJavaLines(279).setLengths(2);}
    public UmpleSourceData USEGenerator__generateTemplate(){ return new UmpleSourceData().setFileNames("Generator_CodeUSE.ump").setUmpleLines(95).setJavaLines(202).setLengths(74);}
    public UmpleSourceData USEGenerator_getUSEType(){ return new UmpleSourceData().setFileNames("Generator_CodeUSE.ump").setUmpleLines(36).setJavaLines(114).setLengths(10);}
    public UmpleSourceData USEGenerator_useAssociationEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeUSE.ump").setUmpleLines(59).setJavaLines(197).setLengths(2);}
    public UmpleSourceData USEGenerator__useAssociationEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeUSE.ump").setUmpleLines(59).setJavaLines(162).setLengths(32);}
    public UmpleSourceData USEGenerator_getAssociationName(){ return new UmpleSourceData().setFileNames("Generator_CodeUSE.ump").setUmpleLines(22).setJavaLines(99).setLengths(11);}
    public UmpleSourceData USEGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeUSE.ump").setUmpleLines(99).setJavaLines(128).setLengths(2);}
    public UmpleSourceData USEGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeUSE.ump").setUmpleLines(105).setJavaLines(134).setLengths(15);}
    public UmpleSourceData EcoreGenerator_handleClasses(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore.ump").setUmpleLines(39).setJavaLines(113).setLengths(17);}
    public UmpleSourceData EcoreGenerator_handleGenericAttribute(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore.ump").setUmpleLines(59).setJavaLines(134).setLengths(29);}
    public UmpleSourceData EcoreGenerator_handleAttributes(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore.ump").setUmpleLines(91).setJavaLines(167).setLengths(54);}
    public UmpleSourceData EcoreGenerator_handleInterfaces(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore.ump").setUmpleLines(30).setJavaLines(103).setLengths(6);}
    public UmpleSourceData EcoreGenerator_EcoreGenerator(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore.ump").setUmpleLines(16).setJavaLines(34).setLengths(1);}
    public UmpleSourceData EcoreGenerator_getTargetNamespaceName(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore.ump").setUmpleLines(19).setJavaLines(91).setLengths(8);}
    public UmpleSourceData EcoreGenerator_handleAssociation(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore.ump").setUmpleLines(148).setJavaLines(225).setLengths(42);}
    public UmpleSourceData EcoreGenerator_handleStateMachine(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore.ump").setUmpleLines(211).setJavaLines(290).setLengths(22);}
    public UmpleSourceData EcoreGenerator_createEcoreAssociation(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore.ump").setUmpleLines(193).setJavaLines(271).setLengths(15);}
    public UmpleSourceData EcoreGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore.ump").setUmpleLines(236).setJavaLines(316).setLengths(16);}
    public UmpleSourceData EcoreGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore.ump").setUmpleLines(255).setJavaLines(336).setLengths(12);}
    public UmpleSourceData EcoreGenericNode__createSpacesString(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(80).setJavaLines(156).setLengths(6);}
    public UmpleSourceData EcoreGenericNode_getNodeChildren(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(52).setJavaLines(146).setLengths(1);}
    public UmpleSourceData EcoreGenericNode_getNodeChildCount(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(53).setJavaLines(151).setLengths(1);}
    public UmpleSourceData EcoreGenericNode__getCode(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(80).setJavaLines(165).setLengths(56);}
    public UmpleSourceData EcoreGenericNode_getCode(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(80).setJavaLines(224).setLengths(2);}
    public UmpleSourceData EcorePackage__createSpacesString(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(197).setJavaLines(444).setLengths(6);}
    public UmpleSourceData EcorePackage_getExistingType(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(97).setJavaLines(347).setLengths(14);}
    public UmpleSourceData EcorePackage_getNodeChildren(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(183).setJavaLines(423).setLengths(7);}
    public UmpleSourceData EcorePackage_getXmlHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(197).setJavaLines(472).setLengths(2);}
    public UmpleSourceData EcorePackage_getNodeChildCount(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(193).setJavaLines(434).setLengths(1);}
    public UmpleSourceData EcorePackage__getXmlHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(197).setJavaLines(453).setLengths(16);}
    public UmpleSourceData EcorePackage_getActualEType(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(114).setJavaLines(365).setLengths(54);}
    public UmpleSourceData EcorePackage_EcorePackage(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(94).setJavaLines(38).setLengths(1);}
    public UmpleSourceData EcorePackage_getCode(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(200).setJavaLines(439).setLengths(1);}
    public UmpleSourceData EcoreDataType_getNodeChildren(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(229).setJavaLines(114).setLengths(7);}
    public UmpleSourceData EcoreDataType_getNodeChildCount(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(239).setJavaLines(125).setLengths(1);}
    public UmpleSourceData EcoreDataType_EcoreDataType(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(216).setJavaLines(30).setLengths(1);}
    public UmpleSourceData EcoreTypeParameter_EcoreTypeParameter(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(250).setJavaLines(22).setLengths(1);}
    public UmpleSourceData EcoreClass__createSpacesString(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(278).setJavaLines(445).setLengths(6);}
    public UmpleSourceData EcoreClass_getNodeChildren(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(296).setJavaLines(430).setLengths(6);}
    public UmpleSourceData EcoreClass_EcoreClass(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(273).setJavaLines(40).setLengths(1);}
    public UmpleSourceData EcoreClass_getNodeChildCount(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(305).setJavaLines(440).setLengths(1);}
    public UmpleSourceData EcoreClass_printSuperTypeString(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(278).setJavaLines(478).setLengths(2);}
    public UmpleSourceData EcoreClass__printSuperTypeString(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(278).setJavaLines(454).setLengths(21);}
    public UmpleSourceData EcoreClassElement_EcoreClassElement(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(324).setJavaLines(30).setLengths(1);}
    public UmpleSourceData EcoreAttribute_getNodeChildren(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(354).setJavaLines(129).setLengths(5);}
    public UmpleSourceData EcoreAttribute_getNodeChildCount(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(362).setJavaLines(138).setLengths(1);}
    public UmpleSourceData EcoreGenericType_getNodeChildren(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(387).setJavaLines(36).setLengths(5);}
    public UmpleSourceData EcoreGenericType_EcoreGenericType(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(377).setJavaLines(22).setLengths(1);}
    public UmpleSourceData EcoreGenericType_getNodeChildCount(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(395).setJavaLines(45).setLengths(1);}
    public UmpleSourceData EcoreGenericTypeArgument_getNodeChildren(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(428).setJavaLines(91).setLengths(5);}
    public UmpleSourceData EcoreGenericTypeArgument_getNodeChildCount(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(436).setJavaLines(100).setLengths(1);}
    public UmpleSourceData EcoreGenericTypeArgument_EcoreGenericTypeArgument(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump","Generator_CodeEcore_Model.ump").setUmpleLines(408, 414).setJavaLines(29, 35).setLengths(1, 1);}
    public UmpleSourceData EcoreEnum_getNodeChildren(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(487).setJavaLines(128).setLengths(5);}
    public UmpleSourceData EcoreEnum_getNodeChildCount(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(495).setJavaLines(137).setLengths(1);}
    public UmpleSourceData EcoreEnum_EcoreEnum(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(476).setJavaLines(25).setLengths(1);}
    public UmpleSourceData EcoreEnumItem_EcoreEnumItem(){ return new UmpleSourceData().setFileNames("Generator_CodeEcore_Model.ump").setUmpleLines(508).setJavaLines(25).setLengths(1);}
    public UmpleSourceData ClassDependencyNode_getNodeByName(){ return new UmpleSourceData().setFileNames("ClassDependencyNode.ump").setUmpleLines(34).setJavaLines(175).setLengths(6);}
    public UmpleSourceData ClassDependencyTree_containsNode(){ return new UmpleSourceData().setFileNames("ClassDependencyNode.ump","ClassDependencyNode.ump").setUmpleLines(55, 66).setJavaLines(176, 186).setLengths(6, 9);}
    public UmpleSourceData TestGenerator_dependencyInjection(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(609).setJavaLines(671).setLengths(40);}
    public UmpleSourceData TestGenerator_getLanguageFor(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(232).setJavaLines(296).setLengths(14);}
    public UmpleSourceData TestGenerator_addTranslate(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(57).setJavaLines(120).setLengths(3);}
    public UmpleSourceData TestGenerator_initiateClass(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(367).setJavaLines(432).setLengths(187);}
    public UmpleSourceData TestGenerator_prepareDependency(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(73).setJavaLines(132).setLengths(90);}
    public UmpleSourceData TestGenerator_processDependencyNodes(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(168).setJavaLines(230).setLengths(17);}
    public UmpleSourceData TestGenerator_sortClassesByLevel(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(599).setJavaLines(660).setLengths(3);}
    public UmpleSourceData TestGenerator_translate(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump","Generator_CodeTest.ump").setUmpleLines(39, 66).setJavaLines(104, 127).setLengths(12, 1);}
    public UmpleSourceData TestGenerator_traverseDependency(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(335).setJavaLines(399).setLengths(25);}
    public UmpleSourceData TestGenerator_getTargetNamespaceName(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(1205).setJavaLines(1267).setLengths(8);}
    public UmpleSourceData TestGenerator_writeModelFile(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(251).setJavaLines(314).setLengths(39);}
    public UmpleSourceData TestGenerator_levelClasses(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(297).setJavaLines(362).setLengths(33);}
    public UmpleSourceData TestGenerator_resetInitializedObject(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(564).setJavaLines(627).setLengths(4);}
    public UmpleSourceData TestGenerator_initializeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(578).setJavaLines(639).setLengths(12);}
    public UmpleSourceData TestGenerator_writeFile(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(188).setJavaLines(251).setLengths(41);}
    public UmpleSourceData TestGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(654).setJavaLines(715).setLengths(534);}
    public UmpleSourceData TestGenerator_getFullyQualifiedName(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(1192).setJavaLines(1253).setLengths(10);}
    public UmpleSourceData TestGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeTest.ump").setUmpleLines(1297).setJavaLines(1279).setLengths(21);}
    public UmpleSourceData PapyrusGenerator_writeModNotation(){ return new UmpleSourceData().setFileNames("Generator_CodePapyrus.ump").setUmpleLines(485).setJavaLines(607).setLengths(41);}
    public UmpleSourceData PapyrusGenerator_generatePapyrusID(){ return new UmpleSourceData().setFileNames("Generator_CodePapyrus.ump").setUmpleLines(468).setJavaLines(589).setLengths(8);}
    public UmpleSourceData PapyrusGenerator_writeModProject(){ return new UmpleSourceData().setFileNames("Generator_CodePapyrus.ump").setUmpleLines(581).setJavaLines(707).setLengths(21);}
    public UmpleSourceData PapyrusGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodePapyrus.ump").setUmpleLines(34).setJavaLines(152).setLengths(429);}
    public UmpleSourceData PapyrusGenerator_writeModDI(){ return new UmpleSourceData().setFileNames("Generator_CodePapyrus.ump").setUmpleLines(534).setJavaLines(657).setLengths(42);}
    public UmpleSourceData PapyrusGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodePapyrus.ump").setUmpleLines(612).setJavaLines(738).setLengths(27);}
    public UmpleSourceData XmiGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeXmi.ump").setUmpleLines(28).setJavaLines(72).setLengths(129);}
    public UmpleSourceData XmiGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeXmi.ump").setUmpleLines(161).setJavaLines(205).setLengths(15);}
    public UmpleSourceData TextUmlGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeTextUml.ump").setUmpleLines(30).setJavaLines(73).setLengths(114);}
    public UmpleSourceData TextUmlGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeTextUml.ump").setUmpleLines(148).setJavaLines(191).setLengths(15);}
    public UmpleSourceData ScxmlGenerator_generateTransitionAction(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(259).setJavaLines(318).setLengths(3);}
    public UmpleSourceData ScxmlGenerator__createSpacesString(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(30).setJavaLines(357).setLengths(6);}
    public UmpleSourceData ScxmlGenerator_genScxmlEmptyTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(46).setJavaLines(542).setLengths(2);}
    public UmpleSourceData ScxmlGenerator_genTransitionOpeningTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(58).setJavaLines(651).setLengths(2);}
    public UmpleSourceData ScxmlGenerator_genTransitionClosingTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(59).setJavaLines(676).setLengths(2);}
    public UmpleSourceData ScxmlGenerator_genScxmlOpeningTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(44).setJavaLines(491).setLengths(2);}
    public UmpleSourceData ScxmlGenerator_generateOnExit(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(245).setJavaLines(303).setLengths(11);}
    public UmpleSourceData ScxmlGenerator_genStateOpeningTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(51).setJavaLines(569).setLengths(2);}
    public UmpleSourceData ScxmlGenerator_genRaiseTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(63).setJavaLines(733).setLengths(2);}
    public UmpleSourceData ScxmlGenerator_generateTransition(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(183).setJavaLines(239).setLengths(26);}
    public UmpleSourceData ScxmlGenerator_genStateClosingTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(52).setJavaLines(594).setLengths(2);}
    public UmpleSourceData ScxmlGenerator__genTransitionOpeningTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(58).setJavaLines(626).setLengths(22);}
    public UmpleSourceData ScxmlGenerator_genTransitionTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(60).setJavaLines(706).setLengths(2);}
    public UmpleSourceData ScxmlGenerator__genTextElement(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(30).setJavaLines(366).setLengths(17);}
    public UmpleSourceData ScxmlGenerator_generateState(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(125).setJavaLines(177).setLengths(27);}
    public UmpleSourceData ScxmlGenerator__genHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(33).setJavaLines(391).setLengths(17);}
    public UmpleSourceData ScxmlGenerator__genScxmlClosingTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(45).setJavaLines(496).setLengths(16);}
    public UmpleSourceData ScxmlGenerator_genHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(33).setJavaLines(411).setLengths(2);}
    public UmpleSourceData ScxmlGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(70).setJavaLines(120).setLengths(47);}
    public UmpleSourceData ScxmlGenerator_isTransitionEmpty(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(212).setJavaLines(269).setLengths(1);}
    public UmpleSourceData ScxmlGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(279).setJavaLines(338).setLengths(15);}
    public UmpleSourceData ScxmlGenerator_genTagAttribute(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(39).setJavaLines(464).setLengths(2);}
    public UmpleSourceData ScxmlGenerator__genStateEmptyTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(53).setJavaLines(599).setLengths(19);}
    public UmpleSourceData ScxmlGenerator_stateHasOnExit(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(173).setJavaLines(228).setLengths(7);}
    public UmpleSourceData ScxmlGenerator_genTextElement(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(30).setJavaLines(386).setLengths(2);}
    public UmpleSourceData ScxmlGenerator__genRaiseTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(63).setJavaLines(711).setLengths(19);}
    public UmpleSourceData ScxmlGenerator__genScxmlOpeningTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(44).setJavaLines(469).setLengths(19);}
    public UmpleSourceData ScxmlGenerator_genStateEmptyTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(53).setJavaLines(621).setLengths(2);}
    public UmpleSourceData ScxmlGenerator_stateHasOnEntry(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(159).setJavaLines(213).setLengths(11);}
    public UmpleSourceData ScxmlGenerator__genGenericTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(66).setJavaLines(738).setLengths(22);}
    public UmpleSourceData ScxmlGenerator__genTransitionClosingTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(59).setJavaLines(656).setLengths(17);}
    public UmpleSourceData ScxmlGenerator_genXMLTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(36).setJavaLines(436).setLengths(2);}
    public UmpleSourceData ScxmlGenerator__genStateOpeningTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(51).setJavaLines(547).setLengths(19);}
    public UmpleSourceData ScxmlGenerator__genScxmlEmptyTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(46).setJavaLines(520).setLengths(19);}
    public UmpleSourceData ScxmlGenerator__genXMLTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(36).setJavaLines(416).setLengths(17);}
    public UmpleSourceData ScxmlGenerator_isStateEmpty(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(155).setJavaLines(208).setLengths(1);}
    public UmpleSourceData ScxmlGenerator_generateOnEntry(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(217).setJavaLines(274).setLengths(25);}
    public UmpleSourceData ScxmlGenerator__genStateClosingTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(52).setJavaLines(574).setLengths(17);}
    public UmpleSourceData ScxmlGenerator_genGenericTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(66).setJavaLines(763).setLengths(2);}
    public UmpleSourceData ScxmlGenerator_generateScxmlScript(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(265).setJavaLines(325).setLengths(9);}
    public UmpleSourceData ScxmlGenerator_isStateMachineEmpty(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(120).setJavaLines(171).setLengths(2);}
    public UmpleSourceData ScxmlGenerator_genScxmlClosingTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(45).setJavaLines(515).setLengths(2);}
    public UmpleSourceData ScxmlGenerator__genTransitionTag(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(60).setJavaLines(681).setLengths(22);}
    public UmpleSourceData ScxmlGenerator__genTagAttribute(){ return new UmpleSourceData().setFileNames("Generator_CodeScxml.ump").setUmpleLines(39).setJavaLines(441).setLengths(20);}
    public UmpleSourceData GvStateDiagramGenerator__createSpacesString(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(47).setJavaLines(867).setLengths(6);}
    public UmpleSourceData GvStateDiagramGenerator_getTransitionTooltip(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(552).setJavaLines(663).setLengths(47);}
    public UmpleSourceData GvStateDiagramGenerator_retFiveLines(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(669).setJavaLines(786).setLengths(32);}
    public UmpleSourceData GvStateDiagramGenerator_transitionAttributes(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(231).setJavaLines(1095).setLengths(2);}
    public UmpleSourceData GvStateDiagramGenerator_getTransitionNameForState(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(186).setJavaLines(316).setLengths(2);}
    public UmpleSourceData GvStateDiagramGenerator_getObjectIdentity(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(244).setJavaLines(356).setLengths(17);}
    public UmpleSourceData GvStateDiagramGenerator_appendSpaces(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(167).setJavaLines(291).setLengths(4);}
    public UmpleSourceData GvStateDiagramGenerator__pseudoStateFormat(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(162).setJavaLines(1006).setLengths(16);}
    public UmpleSourceData GvStateDiagramGenerator_appendStateMachineRecursively(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(268).setJavaLines(377).setLengths(260);}
    public UmpleSourceData GvStateDiagramGenerator__nosm(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(61).setJavaLines(930).setLengths(16);}
    public UmpleSourceData GvStateDiagramGenerator_getFirstNestedNonClusterState(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(194).setJavaLines(327).setLengths(8);}
    public UmpleSourceData GvStateDiagramGenerator_getTransitionHeadOrTailForState(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(206).setJavaLines(339).setLengths(9);}
    public UmpleSourceData GvStateDiagramGenerator__normalStateFormat(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(155).setJavaLines(982).setLengths(16);}
    public UmpleSourceData GvStateDiagramGenerator__topLevelBorder(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(240).setJavaLines(1100).setLengths(22);}
    public UmpleSourceData GvStateDiagramGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(68).setJavaLines(209).setLengths(50);}
    public UmpleSourceData GvStateDiagramGenerator_startState(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(148).setJavaLines(977).setLengths(2);}
    public UmpleSourceData GvStateDiagramGenerator__startState(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(148).setJavaLines(954).setLengths(20);}
    public UmpleSourceData GvStateDiagramGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(706).setJavaLines(826).setLengths(15);}
    public UmpleSourceData GvStateDiagramGenerator_topLevelBorder(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(240).setJavaLines(1125).setLengths(2);}
    public UmpleSourceData GvStateDiagramGenerator__transitionAttributes(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(231).setJavaLines(1061).setLengths(31);}
    public UmpleSourceData GvStateDiagramGenerator_getStateQualifiedName(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(178).setJavaLines(305).setLengths(3);}
    public UmpleSourceData GvStateDiagramGenerator__graphStart(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(47).setJavaLines(876).setLengths(20);}
    public UmpleSourceData GvStateDiagramGenerator_graphStart(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(47).setJavaLines(899).setLengths(2);}
    public UmpleSourceData GvStateDiagramGenerator_nosm(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(61).setJavaLines(949).setLengths(2);}
    public UmpleSourceData GvStateDiagramGenerator_getMinSpace(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(643).setJavaLines(757).setLengths(20);}
    public UmpleSourceData GvStateDiagramGenerator__graphEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(55).setJavaLines(904).setLengths(18);}
    public UmpleSourceData GvStateDiagramGenerator_terminateCode(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(135).setJavaLines(279).setLengths(4);}
    public UmpleSourceData GvStateDiagramGenerator_graphEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(55).setJavaLines(925).setLengths(2);}
    public UmpleSourceData GvStateDiagramGenerator__transition(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(223).setJavaLines(1030).setLengths(23);}
    public UmpleSourceData GvStateDiagramGenerator_transition(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(223).setJavaLines(1056).setLengths(2);}
    public UmpleSourceData GvStateDiagramGenerator_pseudoStateFormat(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(162).setJavaLines(1025).setLengths(2);}
    public UmpleSourceData GvStateDiagramGenerator_normalStateFormat(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(155).setJavaLines(1001).setLengths(2);}
    public UmpleSourceData GvStateDiagramGenerator_getStatePath(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(533).setJavaLines(645).setLengths(14);}
    public UmpleSourceData GvStateDiagramGenerator_getStateTooltip(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(603).setJavaLines(714).setLengths(35);}
    public UmpleSourceData GvStateDiagramGenerator_getDisplayLanguage(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(125).setJavaLines(268).setLengths(7);}
    public UmpleSourceData GvStateDiagramGenerator_getAvailableActionCode(){ return new UmpleSourceData().setFileNames("Generator_CodeGvStateDiagram.ump").setUmpleLines(730).setJavaLines(852).setLengths(11);}
    public UmpleSourceData StateTablesGenerator__createSpacesString(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(502).setJavaLines(207).setLengths(6);}
    public UmpleSourceData StateTablesGenerator_genCellString(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(511).setJavaLines(100).setLengths(1);}
    public UmpleSourceData StateTablesGenerator__genCell(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(508).setJavaLines(242).setLengths(19);}
    public UmpleSourceData StateTablesGenerator_genCell(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(508).setJavaLines(264).setLengths(2);}
    public UmpleSourceData StateTablesGenerator_terminateCode(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(584).setJavaLines(176).setLengths(3);}
    public UmpleSourceData StateTablesGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(518).setJavaLines(109).setLengths(63);}
    public UmpleSourceData StateTablesGenerator__genTopHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(502).setJavaLines(216).setLengths(18);}
    public UmpleSourceData StateTablesGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(592).setJavaLines(187).setLengths(16);}
    public UmpleSourceData StateTablesGenerator_genTopHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(502).setJavaLines(237).setLengths(2);}
    public UmpleSourceData StateTableRow_stateStateTableRowHtml(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(103).setJavaLines(273).setLengths(22);}
    public UmpleSourceData StateTableRow_addStateEventCell(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(198).setJavaLines(370).setLengths(7);}
    public UmpleSourceData StateTableRow_build(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(59).setJavaLines(223).setLengths(12);}
    public UmpleSourceData StateTableRow_stateEventTableRowHtml(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(77).setJavaLines(244).setLengths(21);}
    public UmpleSourceData StateTableRow_extractTransitions(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(130).setJavaLines(303).setLengths(63);}
    public UmpleSourceData StateTableRow_addStateStateCell(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(210).setJavaLines(381).setLengths(7);}
    public UmpleSourceData StateTableRow_firstCellInRow(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(222).setJavaLines(396).setLengths(16);}
    public UmpleSourceData StateTableRow_extractGuardString(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(245).setJavaLines(416).setLengths(13);}
    public UmpleSourceData StateTableCell_htmlString(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(268).setJavaLines(126).setLengths(17);}
    public UmpleSourceData StateEventEntry_htmlString(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(306).setJavaLines(98).setLengths(22);}
    public UmpleSourceData StateStateEntry_htmlString(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(343).setJavaLines(98).setLengths(15);}
    public UmpleSourceData StateTable_buildAllEvents(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(429).setJavaLines(263).setLengths(8);}
    public UmpleSourceData StateTable_buildRecursivelyEntry(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(441).setJavaLines(279).setLengths(3);}
    public UmpleSourceData StateTable_stateStateTableHtml(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(400).setJavaLines(231).setLengths(24);}
    public UmpleSourceData StateTable_buildRecursively(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(452).setJavaLines(290).setLengths(28);}
    public UmpleSourceData StateTable_stateEventTableHtml(){ return new UmpleSourceData().setFileNames("Generator_CodeStateTables.ump").setUmpleLines(371).setJavaLines(199).setLengths(24);}
    public UmpleSourceData EventSequenceGenerator_seedRandomFromSuboptions(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(884).setJavaLines(186).setLengths(14);}
    public UmpleSourceData EventSequenceGenerator_terminateCode(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(854).setJavaLines(149).setLengths(2);}
    public UmpleSourceData EventSequenceGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(797).setJavaLines(92).setLengths(53);}
    public UmpleSourceData EventSequenceGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(861).setJavaLines(159).setLengths(17);}
    public UmpleSourceData EventSequencer_recursivelyAnalyzeStateMachine(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(87).setJavaLines(442).setLengths(21);}
    public UmpleSourceData EventSequencer_recursivelyAddStateTransitions(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(113).setJavaLines(467).setLengths(34);}
    public UmpleSourceData EventSequencer_walkThroughStateMachine(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(158).setJavaLines(514).setLengths(40);}
    public UmpleSourceData EventSequencer_getRandomEvent(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump","Generator_CodeEventSequence.ump").setUmpleLines(226, 234).setJavaLines(588, 599).setLengths(2, 3);}
    public UmpleSourceData EventSequencer_extractLabel(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(282).setJavaLines(650).setLengths(27);}
    public UmpleSourceData EventSequencer_EventSequencer(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(46).setJavaLines(42).setLengths(1);}
    public UmpleSourceData EventSequencer_nextEvent(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(204).setJavaLines(563).setLengths(16);}
    public UmpleSourceData EventSequencer_findNextState(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(259).setJavaLines(627).setLengths(5);}
    public UmpleSourceData EventSequencer_extractGuardLabel(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(313).setJavaLines(681).setLengths(5);}
    public UmpleSourceData EventSequencer_generateEventSequence(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(50).setJavaLines(404).setLengths(29);}
    public UmpleSourceData EventSequencer_wrapState(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(243).setJavaLines(611).setLengths(12);}
    public UmpleSourceData EventSequencer_resolveStartState(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(268).setJavaLines(636).setLengths(10);}
    public UmpleSourceData EventSequenceWalkTracker_markStateVisited(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(368).setJavaLines(303).setLengths(2);}
    public UmpleSourceData EventSequenceWalkTracker_isWalkFinished(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(331).setJavaLines(263).setLengths(26);}
    public UmpleSourceData EventSequenceWalkTracker_markTransitionVisited(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(364).setJavaLines(298).setLengths(1);}
    public UmpleSourceData EventSequenceWalkTracker_calculateMaximumEvents(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(360).setJavaLines(293).setLengths(1);}
    public UmpleSourceData EventSequenceWalkTracker_markSuperStatesAsVisited(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(373).setJavaLines(309).setLengths(4);}
    public UmpleSourceData StateWrapper_wrapEvent(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(483).setJavaLines(292).setLengths(9);}
    public UmpleSourceData StateWrapper_getMappedTransition(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(413).setJavaLines(210).setLengths(8);}
    public UmpleSourceData StateWrapper_isEndState(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(395).setJavaLines(186).setLengths(6);}
    public UmpleSourceData StateWrapper_addMappedTransistion(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(406).setJavaLines(200).setLengths(1);}
    public UmpleSourceData StateWrapper_getPossibleEvents(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(426).setJavaLines(226).setLengths(7);}
    public UmpleSourceData StateWrapper_getDottedName(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(439).setJavaLines(242).setLengths(1);}
    public UmpleSourceData StateWrapper_getParentId(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(461).setJavaLines(270).setLengths(8);}
    public UmpleSourceData StateWrapper_recursivelyGetDottedNames(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(473).setJavaLines(282).setLengths(6);}
    public UmpleSourceData StateWrapper_getDashedName(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(446).setJavaLines(252).setLengths(9);}
    public UmpleSourceData EventSequenceTable_output(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(541).setJavaLines(300).setLengths(37);}
    public UmpleSourceData EventSequenceTable_addColumn(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(524).setJavaLines(277).setLengths(5);}
    public UmpleSourceData EventSequenceTable_EventSequenceTable(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(519).setJavaLines(38).setLengths(1);}
    public UmpleSourceData EventSequenceTable_addToHeaderRow(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(582).setJavaLines(341).setLengths(9);}
    public UmpleSourceData EventSequenceTable_addRow(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(534).setJavaLines(290).setLengths(2);}
    public UmpleSourceData EventSequenceTableHeaderRow_output(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(607).setJavaLines(135).setLengths(11);}
    public UmpleSourceData EventSequenceTableHeaderRow_addCell(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(601).setJavaLines(126).setLengths(1);}
    public UmpleSourceData EventSequenceTableRow_output(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(645).setJavaLines(175).setLengths(20);}
    public UmpleSourceData EventSequenceTableRow_addCell(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(632).setJavaLines(159).setLengths(8);}
    public UmpleSourceData EventSequenceHeaderCell_output(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(676).setJavaLines(53).setLengths(3);}
    public UmpleSourceData EventSequenceCell_output(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(691).setJavaLines(68).setLengths(2);}
    public UmpleSourceData EventSequenceCell_outputFirst(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(698).setJavaLines(78).setLengths(3);}
    public UmpleSourceData EventSequenceCell_generateCellContents(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(705).setJavaLines(85).setLengths(8);}
    public UmpleSourceData EventSequenceList_output(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(745).setJavaLines(163).setLengths(18);}
    public UmpleSourceData EventSequenceList_addRow(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(735).setJavaLines(153).setLengths(6);}
    public UmpleSourceData EventSequenceList_addFirstRow(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(727).setJavaLines(145).setLengths(4);}
    public UmpleSourceData EventListRow_output(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(776).setJavaLines(94).setLengths(10);}
    public UmpleSourceData EventSequenceTemplate_genGridRowEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1155).setJavaLines(660).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genFloaterRowEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1146).setJavaLines(438).setLengths(18);}
    public UmpleSourceData EventSequenceTemplate__genListCell(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1163).setJavaLines(799).setLengths(22);}
    public UmpleSourceData EventSequenceTemplate__genGridHeaderContent(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1151).setJavaLines(551).setLengths(18);}
    public UmpleSourceData EventSequenceTemplate__genTableTitleHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1112).setJavaLines(133).setLengths(22);}
    public UmpleSourceData EventSequenceTemplate__genFloaterFooter(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1147).setJavaLines(464).setLengths(21);}
    public UmpleSourceData EventSequenceTemplate__genScripts(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1113).setJavaLines(163).setLengths(20);}
    public UmpleSourceData EventSequenceTemplate__genNoTransitionMessage(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1170).setJavaLines(909).setLengths(21);}
    public UmpleSourceData EventSequenceTemplate_genGridBodyHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1148).setJavaLines(520).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genFloaterRowStart(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1142).setJavaLines(371).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genGridCell(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1154).setJavaLines(634).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genNoSMMessage(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1115).setJavaLines(216).setLengths(17);}
    public UmpleSourceData EventSequenceTemplate_genGridContainer(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1140).setJavaLines(316).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genListRowStart(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1162).setJavaLines(773).setLengths(18);}
    public UmpleSourceData EventSequenceTemplate_genGridHeaderContent(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1151).setJavaLines(572).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genGridContainerFooter(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1158).setJavaLines(718).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genGridRowStart(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1150).setJavaLines(546).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genListRowEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1164).setJavaLines(829).setLengths(18);}
    public UmpleSourceData EventSequenceTemplate__genGridContainerFooter(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1158).setJavaLines(697).setLengths(18);}
    public UmpleSourceData EventSequenceTemplate_genGridHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1139).setJavaLines(288).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genFloaterRowStart(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1142).setJavaLines(350).setLengths(18);}
    public UmpleSourceData EventSequenceTemplate_genTableTitleHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1112).setJavaLines(158).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genGridContainer(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1140).setJavaLines(293).setLengths(20);}
    public UmpleSourceData EventSequenceTemplate__genGridBodyFooter(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1156).setJavaLines(665).setLengths(24);}
    public UmpleSourceData EventSequenceTemplate__genListEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1165).setJavaLines(855).setLengths(17);}
    public UmpleSourceData EventSequenceTemplate__genEndMessage(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1116).setJavaLines(241).setLengths(19);}
    public UmpleSourceData EventSequenceTemplate_genListEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1165).setJavaLines(875).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genFloaterHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1141).setJavaLines(321).setLengths(21);}
    public UmpleSourceData EventSequenceTemplate_genListRowStart(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1162).setJavaLines(794).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genFloaterFirstCell(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1143).setJavaLines(401).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genGridRowEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1155).setJavaLines(639).setLengths(18);}
    public UmpleSourceData EventSequenceTemplate__createSpacesString(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1111).setJavaLines(92).setLengths(6);}
    public UmpleSourceData EventSequenceTemplate_genScripts(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1113).setJavaLines(186).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genEndMessage(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1116).setJavaLines(263).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genFloaterCell(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1144).setJavaLines(433).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genGridRowStart(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1150).setJavaLines(525).setLengths(18);}
    public UmpleSourceData EventSequenceTemplate__genNoStatesMessage(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1168).setJavaLines(880).setLengths(21);}
    public UmpleSourceData EventSequenceTemplate_genNoTransitionMessage(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1170).setJavaLines(933).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genFloaterHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1141).setJavaLines(345).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genRandomNotification(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1114).setJavaLines(191).setLengths(17);}
    public UmpleSourceData EventSequenceTemplate_genGridBodyFooter(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1156).setJavaLines(692).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genFirstGridCell(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1152).setJavaLines(577).setLengths(24);}
    public UmpleSourceData EventSequenceTemplate__genGridCell(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1154).setJavaLines(609).setLengths(22);}
    public UmpleSourceData EventSequenceTemplate__genGridEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1159).setJavaLines(723).setLengths(17);}
    public UmpleSourceData EventSequenceTemplate_genListStart(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1161).setJavaLines(768).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genGridEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1159).setJavaLines(743).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genListRowEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1164).setJavaLines(850).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genListStart(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1161).setJavaLines(748).setLengths(17);}
    public UmpleSourceData EventSequenceTemplate_genFloaterFooter(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1147).setJavaLines(488).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genNoStatesMessage(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1168).setJavaLines(904).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genFloaterFirstCell(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1143).setJavaLines(376).setLengths(22);}
    public UmpleSourceData EventSequenceTemplate_genFloaterRowEnd(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1146).setJavaLines(459).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genNoSMMessage(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1115).setJavaLines(236).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genRandomNotification(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1114).setJavaLines(211).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate_genFirstGridCell(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1152).setJavaLines(604).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genGridHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1139).setJavaLines(268).setLengths(17);}
    public UmpleSourceData EventSequenceTemplate__genGridBodyHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1148).setJavaLines(493).setLengths(24);}
    public UmpleSourceData EventSequenceTemplate_genListCell(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1163).setJavaLines(824).setLengths(2);}
    public UmpleSourceData EventSequenceTemplate__genTopHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1111).setJavaLines(101).setLengths(24);}
    public UmpleSourceData EventSequenceTemplate__genFloaterCell(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1144).setJavaLines(406).setLengths(24);}
    public UmpleSourceData EventSequenceTemplate_genTopHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeEventSequence.ump").setUmpleLines(1111).setJavaLines(128).setLengths(2);}
    public UmpleSourceData ClassMetrics_calculate(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(48).setJavaLines(67).setLengths(133);}
    public UmpleSourceData CountClass_incCountSubclasses(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(411).setJavaLines(653).setLengths(1);}
    public UmpleSourceData CountClass_incCountAttributes(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(414).setJavaLines(658).setLengths(1);}
    public UmpleSourceData CountClass_incCountTotalStateMachines(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(424).setJavaLines(673).setLengths(1);}
    public UmpleSourceData CountClass_incCountTotalMethods(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(436).setJavaLines(693).setLengths(1);}
    public UmpleSourceData CountClass_incStateMachines(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(405).setJavaLines(643).setLengths(1);}
    public UmpleSourceData CountClass_incCountAssociations(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(408).setJavaLines(648).setLengths(1);}
    public UmpleSourceData CountClass_incCountTotalSubclasses(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(430).setJavaLines(683).setLengths(1);}
    public UmpleSourceData CountClass_incTotal(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(313).setJavaLines(547).setLengths(6);}
    public UmpleSourceData CountClass_incCountMethods(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(417).setJavaLines(663).setLengths(1);}
    public UmpleSourceData CountClass_incCountParameters(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(420).setJavaLines(668).setLengths(1);}
    public UmpleSourceData CountClass_incCountTotalAttributes(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(433).setJavaLines(688).setLengths(1);}
    public UmpleSourceData CountClass_incCountTotalParameters(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(439).setJavaLines(698).setLengths(1);}
    public UmpleSourceData CountClass_countDataClass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(223).setJavaLines(449).setLengths(61);}
    public UmpleSourceData CountClass_setMinMax(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(332).setJavaLines(568).setLengths(17);}
    public UmpleSourceData CountClass_calcAmountSubclasses(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(287).setJavaLines(518).setLengths(3);}
    public UmpleSourceData CountClass_calcMaxDeepth(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(293).setJavaLines(525).setLengths(6);}
    public UmpleSourceData CountClass_reset(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(322).setJavaLines(557).setLengths(7);}
    public UmpleSourceData CountClass_incCountDeepestSubclass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(402).setJavaLines(638).setLengths(1);}
    public UmpleSourceData CountClass_searchDeepestSubclass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(302).setJavaLines(535).setLengths(8);}
    public UmpleSourceData CountClass_calcMinMax(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(353).setJavaLines(589).setLengths(45);}
    public UmpleSourceData CountClass_incCountTotalAssociations(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Class.ump").setUmpleLines(427).setJavaLines(678).setLengths(1);}
    public UmpleSourceData StateMachineMetrics_calculate(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(52).setJavaLines(66).setLengths(150);}
    public UmpleSourceData CountSM_incTotalActions(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(620).setJavaLines(1177).setLengths(1);}
    public UmpleSourceData CountSM_incTotalGuards(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(605).setJavaLines(1151).setLengths(1);}
    public UmpleSourceData CountSM_incTotalEvents(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(593).setJavaLines(1131).setLengths(1);}
    public UmpleSourceData CountSM_incTotalCycles(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(638).setJavaLines(1207).setLengths(1);}
    public UmpleSourceData CountSM_incTotal(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(287).setJavaLines(777).setLengths(13);}
    public UmpleSourceData CountSM_incTotalStatesPerClass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(587).setJavaLines(1121).setLengths(1);}
    public UmpleSourceData CountSM_incTotalDifferentTransitions(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(611).setJavaLines(1161).setLengths(1);}
    public UmpleSourceData CountSM_incTotalSelfCyclesPerClass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(635).setJavaLines(1202).setLengths(1);}
    public UmpleSourceData CountSM_load(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump","SimpleMetrics_SM.ump").setUmpleLines(546, 553).setJavaLines(1071, 1079).setLengths(4, 6);}
    public UmpleSourceData CountSM_incTotalSelfCycles(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(632).setJavaLines(1197).setLengths(1);}
    public UmpleSourceData CountSM_calcMinMax(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(307).setJavaLines(801).setLengths(65);}
    public UmpleSourceData CountSM_calculate(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump","SimpleMetrics_SM.ump").setUmpleLines(382, 398).setJavaLines(880, 900).setLengths(7, 9);}
    public UmpleSourceData CountSM_incTotalNestedStateMachine(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(626).setJavaLines(1187).setLengths(1);}
    public UmpleSourceData CountSM_incTotalStateMachines(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(581).setJavaLines(1111).setLengths(1);}
    public UmpleSourceData CountSM_getAmountSelfCycles(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(478).setJavaLines(991).setLengths(6);}
    public UmpleSourceData CountSM_incTotalClass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(644).setJavaLines(1217).setLengths(1);}
    public UmpleSourceData CountSM_incTotalStates(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(590).setJavaLines(1126).setLengths(1);}
    public UmpleSourceData CountSM_incTotalNestedStateMachinePerClass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(629).setJavaLines(1192).setLengths(1);}
    public UmpleSourceData CountSM_incTotalDifferentTransitionsPerClass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(614).setJavaLines(1166).setLengths(1);}
    public UmpleSourceData CountSM_countCycles(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(522).setJavaLines(1043).setLengths(15);}
    public UmpleSourceData CountSM_incTotalTransitions(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(599).setJavaLines(1141).setLengths(1);}
    public UmpleSourceData CountSM_incTotalActionsPerClass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(623).setJavaLines(1182).setLengths(1);}
    public UmpleSourceData CountSM_hasSelfCycle(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(465).setJavaLines(974).setLengths(5);}
    public UmpleSourceData CountSM_incTotalCyclesPerClass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(641).setJavaLines(1212).setLengths(1);}
    public UmpleSourceData CountSM_incTotalEventsPerClass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(596).setJavaLines(1136).setLengths(1);}
    public UmpleSourceData CountSM_setMinMax(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(655).setJavaLines(1231).setLengths(23);}
    public UmpleSourceData CountSM_resetVisitedStates(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(577).setJavaLines(1106).setLengths(1);}
    public UmpleSourceData CountSM_incTotalGuardsPerClass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(608).setJavaLines(1156).setLengths(1);}
    public UmpleSourceData CountSM_nestedSM(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(418).setJavaLines(924).setLengths(36);}
    public UmpleSourceData CountSM_getAmountCycles(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(494).setJavaLines(1011).setLengths(14);}
    public UmpleSourceData CountSM_incTotalTransitionsPerClass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(602).setJavaLines(1146).setLengths(1);}
    public UmpleSourceData CountSM_incTotalStateMachinesPerClass(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump").setUmpleLines(584).setJavaLines(1116).setLengths(1);}
    public UmpleSourceData CountSM_loadStatesRecursively(){ return new UmpleSourceData().setFileNames("SimpleMetrics_SM.ump","SimpleMetrics_SM.ump").setUmpleLines(562, 568).setJavaLines(1089, 1096).setLengths(3, 6);}
    public UmpleSourceData Format_repeat(){ return new UmpleSourceData().setFileNames("SimpleMetrics_Util.ump").setUmpleLines(30).setJavaLines(28).setLengths(5);}
    public UmpleSourceData CodeMetrics_calculate(){ return new UmpleSourceData().setFileNames("SimpleMetrics_CodeLines.ump").setUmpleLines(67).setJavaLines(66).setLengths(82);}
    public UmpleSourceData CountLines_incCountBlanks(){ return new UmpleSourceData().setFileNames("SimpleMetrics_CodeLines.ump").setUmpleLines(238).setJavaLines(116).setLengths(1);}
    public UmpleSourceData CountLines_incCountCode(){ return new UmpleSourceData().setFileNames("SimpleMetrics_CodeLines.ump").setUmpleLines(241).setJavaLines(121).setLengths(1);}
    public UmpleSourceData CountLines_incCountLines(){ return new UmpleSourceData().setFileNames("SimpleMetrics_CodeLines.ump").setUmpleLines(232).setJavaLines(106).setLengths(1);}
    public UmpleSourceData CountLines_incCountComments(){ return new UmpleSourceData().setFileNames("SimpleMetrics_CodeLines.ump").setUmpleLines(235).setJavaLines(111).setLengths(1);}
    public UmpleSourceData SimpleMetricsGenerator__createSpacesString(){ return new UmpleSourceData().setFileNames("Generator_CodeSimpleMetrics.ump").setUmpleLines(36).setJavaLines(165).setLengths(6);}
    public UmpleSourceData SimpleMetricsGenerator_genCellInt(){ return new UmpleSourceData().setFileNames("Generator_CodeSimpleMetrics.ump").setUmpleLines(45).setJavaLines(99).setLengths(1);}
    public UmpleSourceData SimpleMetricsGenerator_genCellString(){ return new UmpleSourceData().setFileNames("Generator_CodeSimpleMetrics.ump").setUmpleLines(48).setJavaLines(104).setLengths(1);}
    public UmpleSourceData SimpleMetricsGenerator_genCellFloat(){ return new UmpleSourceData().setFileNames("Generator_CodeSimpleMetrics.ump").setUmpleLines(51).setJavaLines(109).setLengths(1);}
    public UmpleSourceData SimpleMetricsGenerator__genCell(){ return new UmpleSourceData().setFileNames("Generator_CodeSimpleMetrics.ump").setUmpleLines(42).setJavaLines(200).setLengths(19);}
    public UmpleSourceData SimpleMetricsGenerator_genCell(){ return new UmpleSourceData().setFileNames("Generator_CodeSimpleMetrics.ump").setUmpleLines(42).setJavaLines(222).setLengths(2);}
    public UmpleSourceData SimpleMetricsGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeSimpleMetrics.ump").setUmpleLines(55).setJavaLines(114).setLengths(24);}
    public UmpleSourceData SimpleMetricsGenerator__genTopHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeSimpleMetrics.ump").setUmpleLines(36).setJavaLines(174).setLengths(18);}
    public UmpleSourceData SimpleMetricsGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeSimpleMetrics.ump").setUmpleLines(84).setJavaLines(146).setLengths(15);}
    public UmpleSourceData SimpleMetricsGenerator_genTopHeader(){ return new UmpleSourceData().setFileNames("Generator_CodeSimpleMetrics.ump").setUmpleLines(36).setJavaLines(195).setLengths(2);}
    public UmpleSourceData GvClassDiagramGenerator_createInterfaceHierarchyAssociations(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassDiagram.ump").setUmpleLines(484).setJavaLines(531).setLengths(10);}
    public UmpleSourceData GvClassDiagramGenerator_associationCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassDiagram.ump").setUmpleLines(219).setJavaLines(249).setLengths(170);}
    public UmpleSourceData GvClassDiagramGenerator_attributeCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassDiagram.ump").setUmpleLines(96).setJavaLines(117).setLengths(33);}
    public UmpleSourceData GvClassDiagramGenerator_createInterfacesAndTheirHirerarchy(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassDiagram.ump").setUmpleLines(445).setJavaLines(488).setLengths(35);}
    public UmpleSourceData GvClassDiagramGenerator_methodCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassDiagram.ump").setUmpleLines(134).setJavaLines(158).setLengths(62);}
    public UmpleSourceData GvClassDiagramGenerator_interfaceCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassDiagram.ump").setUmpleLines(201).setJavaLines(228).setLengths(12);}
    public UmpleSourceData GvClassDiagramGenerator_parentClassAssoc(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassDiagram.ump").setUmpleLines(35).setJavaLines(50).setLengths(2);}
    public UmpleSourceData GvClassDiagramGenerator_startWithVowel(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassDiagram.ump").setUmpleLines(393).setJavaLines(427).setLengths(7);}
    public UmpleSourceData GvClassDiagramGenerator_classCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassDiagram.ump").setUmpleLines(42).setJavaLines(60).setLengths(49);}
    public UmpleSourceData GvClassDiagramGenerator_getClassWithRoleName(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassDiagram.ump").setUmpleLines(403).setJavaLines(438).setLengths(31);}
    public UmpleSourceData GvClassDiagramGenerator_appendSpaces(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassDiagram.ump").setUmpleLines(438).setJavaLines(477).setLengths(3);}
    public UmpleSourceData GvClassDiagramGenerator_generatorType(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassDiagram.ump").setUmpleLines(28).setJavaLines(40).setLengths(1);}
    public UmpleSourceData GvClassTraitDiagramGenerator_createInterfaceHierarchyAssociations(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(252).setJavaLines(298).setLengths(10);}
    public UmpleSourceData GvClassTraitDiagramGenerator_tAssociationCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(393).setJavaLines(444).setLengths(29);}
    public UmpleSourceData GvClassTraitDiagramGenerator_associationCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(184).setJavaLines(218).setLengths(33);}
    public UmpleSourceData GvClassTraitDiagramGenerator_interfaceCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(167).setJavaLines(198).setLengths(11);}
    public UmpleSourceData GvClassTraitDiagramGenerator_classCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(70).setJavaLines(92).setLengths(26);}
    public UmpleSourceData GvClassTraitDiagramGenerator_tAttributeCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(317).setJavaLines(366).setLengths(25);}
    public UmpleSourceData GvClassTraitDiagramGenerator_createTraitClassHierarchy(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(462).setJavaLines(516).setLengths(18);}
    public UmpleSourceData GvClassTraitDiagramGenerator_appendSpaces(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(221).setJavaLines(259).setLengths(3);}
    public UmpleSourceData GvClassTraitDiagramGenerator_generatorType(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(56).setJavaLines(72).setLengths(1);}
    public UmpleSourceData GvClassTraitDiagramGenerator_createTraitsHierarchy(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(429).setJavaLines(481).setLengths(18);}
    public UmpleSourceData GvClassTraitDiagramGenerator_addTemplateParameters(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(484).setJavaLines(538).setLengths(9);}
    public UmpleSourceData GvClassTraitDiagramGenerator_attributeCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(101).setJavaLines(126).setLengths(21);}
    public UmpleSourceData GvClassTraitDiagramGenerator_createInterfacesAndTheirHirerarchy(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(228).setJavaLines(270).setLengths(20);}
    public UmpleSourceData GvClassTraitDiagramGenerator_methodCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(127).setJavaLines(155).setLengths(35);}
    public UmpleSourceData GvClassTraitDiagramGenerator_createTraitRequiredInterfaces(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(450).setJavaLines(503).setLengths(9);}
    public UmpleSourceData GvClassTraitDiagramGenerator_parentClassAssoc(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(63).setJavaLines(82).setLengths(2);}
    public UmpleSourceData GvClassTraitDiagramGenerator_createTraits(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(264).setJavaLines(312).setLengths(50);}
    public UmpleSourceData GvClassTraitDiagramGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(27).setJavaLines(40).setLengths(24);}
    public UmpleSourceData GvClassTraitDiagramGenerator_tMethodCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvClassTraitDiagram.ump").setUmpleLines(345).setJavaLines(395).setLengths(45);}
    public UmpleSourceData GvFeatureDiagramGenerator__createSpacesString(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(28).setJavaLines(286).setLengths(6);}
    public UmpleSourceData GvFeatureDiagramGenerator_getGvNodeShape(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(144).setJavaLines(188).setLengths(14);}
    public UmpleSourceData GvFeatureDiagramGenerator__graphStart(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(28).setJavaLines(295).setLengths(18);}
    public UmpleSourceData GvFeatureDiagramGenerator_graphStart(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(28).setJavaLines(316).setLengths(2);}
    public UmpleSourceData GvFeatureDiagramGenerator__nofeatureDiagram(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(35).setJavaLines(321).setLengths(16);}
    public UmpleSourceData GvFeatureDiagramGenerator_terminateCode(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(188).setJavaLines(236).setLengths(3);}
    public UmpleSourceData GvFeatureDiagramGenerator_appendSpaces(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(199).setJavaLines(252).setLengths(4);}
    public UmpleSourceData GvFeatureDiagramGenerator_generatorType(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(194).setJavaLines(243).setLengths(1);}
    public UmpleSourceData GvFeatureDiagramGenerator_nofeatureDiagram(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(35).setJavaLines(340).setLengths(2);}
    public UmpleSourceData GvFeatureDiagramGenerator_configurationStatus(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(176).setJavaLines(223).setLengths(9);}
    public UmpleSourceData GvFeatureDiagramGenerator_fillColorOfFeatureNode(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(163).setJavaLines(210).setLengths(9);}
    public UmpleSourceData GvFeatureDiagramGenerator_generateFeatureNodeShape(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(41).setJavaLines(80).setLengths(41);}
    public UmpleSourceData GvFeatureDiagramGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(86).setJavaLines(129).setLengths(25);}
    public UmpleSourceData GvFeatureDiagramGenerator_getGvMultiplicityShape(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(140).setJavaLines(183).setLengths(1);}
    public UmpleSourceData GvFeatureDiagramGenerator_getGvTargetShape(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(115).setJavaLines(158).setLengths(21);}
    public UmpleSourceData GvFeatureDiagramGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeGvFeatureDiagram.ump").setUmpleLines(210).setJavaLines(266).setLengths(16);}
    public UmpleSourceData GvEntityRelationshipDiagramGenerator_associationCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvEntityRelationshipDiagram.ump").setUmpleLines(135).setJavaLines(165).setLengths(71);}
    public UmpleSourceData GvEntityRelationshipDiagramGenerator_attributeCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvEntityRelationshipDiagram.ump").setUmpleLines(82).setJavaLines(109).setLengths(47);}
    public UmpleSourceData GvEntityRelationshipDiagramGenerator_createInterfacesAndTheirHirerarchy(){ return new UmpleSourceData().setFileNames("Generator_CodeGvEntityRelationshipDiagram.ump").setUmpleLines(227).setJavaLines(262).setLengths(1);}
    public UmpleSourceData GvEntityRelationshipDiagramGenerator_isWeakEntity(){ return new UmpleSourceData().setFileNames("Generator_CodeGvEntityRelationshipDiagram.ump").setUmpleLines(211).setJavaLines(244).setLengths(8);}
    public UmpleSourceData GvEntityRelationshipDiagramGenerator_parentClassAssoc(){ return new UmpleSourceData().setFileNames("Generator_CodeGvEntityRelationshipDiagram.ump").setUmpleLines(30).setJavaLines(51).setLengths(6);}
    public UmpleSourceData GvEntityRelationshipDiagramGenerator_classCreation(){ return new UmpleSourceData().setFileNames("Generator_CodeGvEntityRelationshipDiagram.ump").setUmpleLines(41).setJavaLines(65).setLengths(36);}
    public UmpleSourceData GvEntityRelationshipDiagramGenerator_generatorType(){ return new UmpleSourceData().setFileNames("Generator_CodeGvEntityRelationshipDiagram.ump").setUmpleLines(23).setJavaLines(41).setLengths(1);}
    public UmpleSourceData AlloyObject_convertEndsToAssociation(){ return new UmpleSourceData().setFileNames("AlloyMetaModel.ump").setUmpleLines(9).setJavaLines(35).setLengths(6);}
    public UmpleSourceData AlloyObject_printObject(){ return new UmpleSourceData().setFileNames("AlloyMetaModel.ump").setUmpleLines(5).setJavaLines(30).setLengths(1);}
    public UmpleSourceData AlloyObject_addStartDottedLine(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(6).setJavaLines(45).setLengths(1);}
    public UmpleSourceData AlloyObject_addEndDottedLine(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(11).setJavaLines(50).setLengths(1);}
    public UmpleSourceData Function_Function(){ return new UmpleSourceData().setFileNames("AlloyMetaModel.ump","AlloyMetaModel.ump","AlloyMetaModel.ump").setUmpleLines(29, 41, 58).setJavaLines(102, 114, 134).setLengths(8, 12, 7);}
    public UmpleSourceData Function_printFunction(){ return new UmpleSourceData().setFileNames("AlloyMetaModel.ump").setUmpleLines(68).setJavaLines(145).setLengths(3);}
    public UmpleSourceData Utility_addTab(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(18).setJavaLines(44).setLengths(5);}
    public UmpleSourceData Utility_getRightRoleName(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(102).setJavaLines(166).setLengths(1);}
    public UmpleSourceData Utility_composeSimpleDeclaration(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(42).setJavaLines(75).setLengths(16);}
    public UmpleSourceData Utility_getLeftEnd(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(114).setJavaLines(186).setLengths(1);}
    public UmpleSourceData Utility_getMultiplicity(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(130).setJavaLines(205).setLengths(8);}
    public UmpleSourceData Utility_getLeftEndName(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(93).setJavaLines(151).setLengths(1);}
    public UmpleSourceData Utility_getLeftMult(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(105).setJavaLines(171).setLengths(1);}
    public UmpleSourceData Utility_getRightEnd(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(111).setJavaLines(181).setLengths(1);}
    public UmpleSourceData Utility_addChar(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(39).setJavaLines(70).setLengths(1);}
    public UmpleSourceData Utility_getRightMult(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(108).setJavaLines(176).setLengths(1);}
    public UmpleSourceData Utility_alloyAssociation(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(80).setJavaLines(126).setLengths(3);}
    public UmpleSourceData Utility_getA(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(86).setJavaLines(137).setLengths(1);}
    public UmpleSourceData Utility_getB(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(90).setJavaLines(146).setLengths(1);}
    public UmpleSourceData Utility_addString(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(61).setJavaLines(95).setLengths(1);}
    public UmpleSourceData Utility_genEmptySignature(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(5).setJavaLines(29).setLengths(2);}
    public UmpleSourceData Utility_addNewLine(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(10).setJavaLines(35).setLengths(5);}
    public UmpleSourceData Utility_addSignatureHead(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(65).setJavaLines(104).setLengths(1);}
    public UmpleSourceData Utility_commentModel(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(70).setJavaLines(113).setLengths(3);}
    public UmpleSourceData Utility_getRightEndName(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(96).setJavaLines(156).setLengths(1);}
    public UmpleSourceData Utility_getLeftRoleName(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(99).setJavaLines(161).setLengths(1);}
    public UmpleSourceData Utility_printOpenStatement(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(141).setJavaLines(217).setLengths(2);}
    public UmpleSourceData Utility_addStartDottedLine(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(32).setJavaLines(60).setLengths(1);}
    public UmpleSourceData Utility_addEndDottedLine(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(36).setJavaLines(65).setLengths(1);}
    public UmpleSourceData Utility_getAlloyMultiplicity(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(118).setJavaLines(191).setLengths(10);}
    public UmpleSourceData Utility_addCurlyBracket(){ return new UmpleSourceData().setFileNames("AlloyUtility.ump").setUmpleLines(26).setJavaLines(53).setLengths(3);}
    public UmpleSourceData Statement_print(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(5).setJavaLines(33).setLengths(1);}
    public UmpleSourceData Statement_getName(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(4).setJavaLines(28).setLengths(1);}
    public UmpleSourceData OpenStatement_print(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(20).setJavaLines(67).setLengths(1);}
    public UmpleSourceData OpenStatement_OpenStatement(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(16).setJavaLines(27).setLengths(1);}
    public UmpleSourceData AlloyModel_checkAssocitaionBtw(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(119).setJavaLines(421).setLengths(13);}
    public UmpleSourceData AlloyModel_genOtherConstraints(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(216).setJavaLines(522).setLengths(46);}
    public UmpleSourceData AlloyModel_compareRoleNames(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(279).setJavaLines(585).setLengths(2);}
    public UmpleSourceData AlloyModel_analyzeClassForH(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(137).setJavaLines(442).setLengths(27);}
    public UmpleSourceData AlloyModel_genReflexiveRelations(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(179).setJavaLines(484).setLengths(13);}
    public UmpleSourceData AlloyModel_printImportStatements(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(206).setJavaLines(512).setLengths(6);}
    public UmpleSourceData AlloyModel_genAssociationFact(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(75).setJavaLines(376).setLengths(9);}
    public UmpleSourceData AlloyModel_genSignatures(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(168).setJavaLines(473).setLengths(7);}
    public UmpleSourceData AlloyModel_getImportStatements(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(195).setJavaLines(501).setLengths(7);}
    public UmpleSourceData AlloyModel_namespace(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(100).setJavaLines(400).setLengths(13);}
    public UmpleSourceData AlloyModel_hasStringAttribute(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(89).setJavaLines(389).setLengths(7);}
    public UmpleSourceData AlloyModel_comment(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(284).setJavaLines(591).setLengths(2);}
    public UmpleSourceData AlloyModel_AlloyModel(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(37).setJavaLines(338).setLengths(34);}
    public UmpleSourceData AlloyModel_analyzeAssociation(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(266).setJavaLines(572).setLengths(9);}
    public UmpleSourceData Signature_compute(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(411).setJavaLines(313).setLengths(3);}
    public UmpleSourceData Signature_getExtendsClass(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(339).setJavaLines(240).setLengths(3);}
    public UmpleSourceData Signature_printSignature(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(406).setJavaLines(308).setLengths(1);}
    public UmpleSourceData Signature_print(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(418).setJavaLines(320).setLengths(3);}
    public UmpleSourceData Signature_funPart(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(394).setJavaLines(296).setLengths(8);}
    public UmpleSourceData Signature_instantiateDataMembers(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(345).setJavaLines(247).setLengths(11);}
    public UmpleSourceData Signature_Signature(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(304).setJavaLines(206).setLengths(30);}
    public UmpleSourceData Signature_reComposeAssociation(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(360).setJavaLines(262).setLengths(17);}
    public UmpleSourceData Signature_comment(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(381).setJavaLines(283).setLengths(2);}
    public UmpleSourceData Signature_addExtension(){ return new UmpleSourceData().setFileNames("AlloySignature.ump").setUmpleLines(387).setJavaLines(289).setLengths(3);}
    public UmpleSourceData Fact_declarationEnd(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(68).setJavaLines(70).setLengths(1);}
    public UmpleSourceData Fact_print(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(90).setJavaLines(92).setLengths(3);}
    public UmpleSourceData Fact_suchThatPlusNewLine(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(53).setJavaLines(55).setLengths(1);}
    public UmpleSourceData Fact_makeVarDeclaration(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(79).setJavaLines(81).setLengths(2);}
    public UmpleSourceData Fact_makeVarName(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(63).setJavaLines(65).setLengths(1);}
    public UmpleSourceData Fact_comment(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(85).setJavaLines(87).setLengths(1);}
    public UmpleSourceData Fact_factHeader(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(58).setJavaLines(60).setLengths(1);}
    public UmpleSourceData Fact_varDec(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(73).setJavaLines(75).setLengths(2);}
    public UmpleSourceData Fact_Fact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump","AlloyFact.ump").setUmpleLines(31, 46).setJavaLines(33, 48).setLengths(11, 3);}
    public UmpleSourceData NoExtendedFact_commentNoExtendedFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(110).setJavaLines(39).setLengths(2);}
    public UmpleSourceData NoExtendedFact_print(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(130).setJavaLines(66).setLengths(1);}
    public UmpleSourceData NoExtendedFact_printNoExtendedRelationFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(117).setJavaLines(49).setLengths(2);}
    public UmpleSourceData NoExtendedFact_NoExtendedFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(104).setJavaLines(33).setLengths(2);}
    public UmpleSourceData NoExtendedFact_noExtRelContent(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(124).setJavaLines(59).setLengths(3);}
    public UmpleSourceData NoSelfRelationFact_printNoSelfRelationFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(160).setJavaLines(54).setLengths(1);}
    public UmpleSourceData NoSelfRelationFact_print(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(172).setJavaLines(69).setLengths(1);}
    public UmpleSourceData NoSelfRelationFact_NoSelfRelationFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(142).setJavaLines(33).setLengths(2);}
    public UmpleSourceData NoSelfRelationFact_decPart(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(154).setJavaLines(45).setLengths(1);}
    public UmpleSourceData NoSelfRelationFact_commentNoSelfRelation(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(148).setJavaLines(39).setLengths(2);}
    public UmpleSourceData NoSelfRelationFact_noSelfRelContent(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(166).setJavaLines(63).setLengths(2);}
    public UmpleSourceData BidirectionFact_commentBidirectionality(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(190).setJavaLines(43).setLengths(2);}
    public UmpleSourceData BidirectionFact_printBidirectionFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(204).setJavaLines(64).setLengths(2);}
    public UmpleSourceData BidirectionFact_print(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(210).setJavaLines(70).setLengths(1);}
    public UmpleSourceData BidirectionFact_BidirectionFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(183).setJavaLines(33).setLengths(2);}
    public UmpleSourceData BidirectionFact_bidirectionalContent(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(197).setJavaLines(53).setLengths(3);}
    public UmpleSourceData GenHierarchyFact_print(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(242).setJavaLines(60).setLengths(1);}
    public UmpleSourceData GenHierarchyFact_GenHierarchyFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(220).setJavaLines(33).setLengths(2);}
    public UmpleSourceData GenHierarchyFact_comment(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(237).setJavaLines(54).setLengths(2);}
    public UmpleSourceData GenHierarchyFact_declaration(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(231).setJavaLines(45).setLengths(1);}
    public UmpleSourceData GenHierarchyFact_content(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(225).setJavaLines(39).setLengths(2);}
    public UmpleSourceData AssociationFact_getAssociationFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(282).setJavaLines(115).setLengths(2);}
    public UmpleSourceData AssociationFact_print(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(288).setJavaLines(121).setLengths(1);}
    public UmpleSourceData AssociationFact_AssociationFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(256).setJavaLines(89).setLengths(17);}
    public UmpleSourceData AssociationFact_comment(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(277).setJavaLines(110).setLengths(1);}
    public UmpleSourceData NonReflexiveFact_print(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(323).setJavaLines(60).setLengths(1);}
    public UmpleSourceData NonReflexiveFact_NonReflexiveFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(299).setJavaLines(33).setLengths(2);}
    public UmpleSourceData NonReflexiveFact_comment(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(312).setJavaLines(49).setLengths(2);}
    public UmpleSourceData NonReflexiveFact_declaration(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(318).setJavaLines(55).setLengths(1);}
    public UmpleSourceData NonReflexiveFact_content(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(305).setJavaLines(39).setLengths(2);}
    public UmpleSourceData SymmetricFact_print(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(358).setJavaLines(57).setLengths(1);}
    public UmpleSourceData SymmetricFact_SymmetricFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(334).setJavaLines(33).setLengths(2);}
    public UmpleSourceData SymmetricFact_comment(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(345).setJavaLines(44).setLengths(2);}
    public UmpleSourceData SymmetricFact_declaration(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(340).setJavaLines(39).setLengths(1);}
    public UmpleSourceData SymmetricFact_content(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(351).setJavaLines(50).setLengths(3);}
    public UmpleSourceData NumericBoundFact_temp(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(417).setJavaLines(135).setLengths(1);}
    public UmpleSourceData NumericBoundFact_print(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(439).setJavaLines(157).setLengths(3);}
    public UmpleSourceData NumericBoundFact_initializeExtraVar(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(389).setJavaLines(107).setLengths(10);}
    public UmpleSourceData NumericBoundFact_comment(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(434).setJavaLines(152).setLengths(1);}
    public UmpleSourceData NumericBoundFact_analyzeEndMult(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(403).setJavaLines(121).setLengths(5);}
    public UmpleSourceData NumericBoundFact_NumericBoundFact(){ return new UmpleSourceData().setFileNames("AlloyFact.ump","AlloyFact.ump").setUmpleLines(376, 380).setJavaLines(32, 98).setLengths(1, 5);}
    public UmpleSourceData NumericBoundFact_declaration(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(412).setJavaLines(130).setLengths(1);}
    public UmpleSourceData NumericBoundFact_content(){ return new UmpleSourceData().setFileNames("AlloyFact.ump").setUmpleLines(422).setJavaLines(140).setLengths(8);}
    public UmpleSourceData AlloyGenerator_terminateCode(){ return new UmpleSourceData().setFileNames("Generator_CodeAlloy.ump").setUmpleLines(60).setJavaLines(110).setLengths(2);}
    public UmpleSourceData AlloyGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeAlloy.ump").setUmpleLines(39).setJavaLines(88).setLengths(18);}
    public UmpleSourceData AlloyGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeAlloy.ump").setUmpleLines(67).setJavaLines(120).setLengths(15);}
    public UmpleSourceData NuSMVModule__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(14).setJavaLines(184).setLengths(6);}
    public UmpleSourceData NuSMVModule__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(14).setJavaLines(193).setLengths(29);}
    public UmpleSourceData NuSMVModule_printArray(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(129).setJavaLines(137).setLengths(10);}
    public UmpleSourceData NuSMVModule_buildColumnEntries(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(142).setJavaLines(157).setLengths(7);}
    public UmpleSourceData NuSMVModule_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(14).setJavaLines(225).setLengths(2);}
    public UmpleSourceData NuSMVModule_buildStateValuesFromColumnEntries(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(153).setJavaLines(174).setLengths(6);}
    public UmpleSourceData CounterExampleTable_setRowLabels(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(54).setJavaLines(258).setLengths(3);}
    public UmpleSourceData CounterExampleTable__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(122).setJavaLines(383).setLengths(6);}
    public UmpleSourceData CounterExampleTable__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(122).setJavaLines(392).setLengths(25);}
    public UmpleSourceData CounterExampleTable_printArray(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(129).setJavaLines(336).setLengths(10);}
    public UmpleSourceData CounterExampleTable_buildColumnEntries(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(142).setJavaLines(356).setLengths(7);}
    public UmpleSourceData CounterExampleTable_editTable(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(104).setJavaLines(315).setLengths(10);}
    public UmpleSourceData CounterExampleTable_buildFirstColumn(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(40).setJavaLines(243).setLengths(11);}
    public UmpleSourceData CounterExampleTable_editColumnContents(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(62).setJavaLines(269).setLengths(38);}
    public UmpleSourceData CounterExampleTable_printRequirement(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(32).setJavaLines(235).setLengths(4);}
    public UmpleSourceData CounterExampleTable_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(122).setJavaLines(420).setLengths(2);}
    public UmpleSourceData CounterExampleTable_buildStateValuesFromColumnEntries(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(153).setJavaLines(373).setLengths(6);}
    public UmpleSourceData ColumnEntry_htmlString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(172).setJavaLines(74).setLengths(7);}
    public UmpleSourceData Range__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(186).setJavaLines(41).setLengths(6);}
    public UmpleSourceData Range__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(186).setJavaLines(50).setLengths(18);}
    public UmpleSourceData Range_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(186).setJavaLines(71).setLengths(2);}
    public UmpleSourceData CounterExampleColumn__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(214).setJavaLines(281).setLengths(6);}
    public UmpleSourceData CounterExampleColumn__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(214).setJavaLines(290).setLengths(20);}
    public UmpleSourceData CounterExampleColumn_printColumnEntries(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(198).setJavaLines(209).setLengths(4);}
    public UmpleSourceData CounterExampleColumn_printArray(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(129).setJavaLines(234).setLengths(10);}
    public UmpleSourceData CounterExampleColumn_buildColumnEntries(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(142).setJavaLines(254).setLengths(7);}
    public UmpleSourceData CounterExampleColumn_setStateValues(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(205).setJavaLines(217).setLengths(6);}
    public UmpleSourceData CounterExampleColumn_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(214).setJavaLines(313).setLengths(2);}
    public UmpleSourceData CounterExampleColumn_buildStateValuesFromColumnEntries(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(153).setJavaLines(271).setLengths(6);}
    public UmpleSourceData ModuleBody__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(224).setJavaLines(167).setLengths(6);}
    public UmpleSourceData ModuleBody__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(224).setJavaLines(176).setLengths(19);}
    public UmpleSourceData ModuleBody_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(224).setJavaLines(198).setLengths(2);}
    public UmpleSourceData VarDeclaration_VarDeclaration(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(235).setJavaLines(42).setLengths(1);}
    public UmpleSourceData VarDeclaration__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(243).setJavaLines(175).setLengths(6);}
    public UmpleSourceData VarDeclaration__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(243).setJavaLines(184).setLengths(23);}
    public UmpleSourceData VarDeclaration_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(243).setJavaLines(210).setLengths(2);}
    public UmpleSourceData VariableSpecifier__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(260).setJavaLines(194).setLengths(6);}
    public UmpleSourceData VariableSpecifier__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(260).setJavaLines(203).setLengths(36);}
    public UmpleSourceData VariableSpecifier_printArray(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(129).setJavaLines(147).setLengths(10);}
    public UmpleSourceData VariableSpecifier_buildColumnEntries(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(142).setJavaLines(167).setLengths(7);}
    public UmpleSourceData VariableSpecifier_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(260).setJavaLines(242).setLengths(2);}
    public UmpleSourceData VariableSpecifier_buildStateValuesFromColumnEntries(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(153).setJavaLines(184).setLengths(6);}
    public UmpleSourceData VariableSpecifier_VariableSpecifier(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(255).setJavaLines(45).setLengths(1);}
    public UmpleSourceData IVarDeclaration__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(276).setJavaLines(176).setLengths(6);}
    public UmpleSourceData IVarDeclaration__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(276).setJavaLines(185).setLengths(24);}
    public UmpleSourceData IVarDeclaration_IVarDeclaration(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(267).setJavaLines(43).setLengths(1);}
    public UmpleSourceData IVarDeclaration_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(276).setJavaLines(212).setLengths(2);}
    public UmpleSourceData DefineDeclaration__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(290).setJavaLines(175).setLengths(6);}
    public UmpleSourceData DefineDeclaration__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(290).setJavaLines(184).setLengths(23);}
    public UmpleSourceData DefineDeclaration_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(290).setJavaLines(210).setLengths(2);}
    public UmpleSourceData DefineDeclaration_DefineDeclaration(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(283).setJavaLines(42).setLengths(1);}
    public UmpleSourceData DefineBody__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(299).setJavaLines(81).setLengths(6);}
    public UmpleSourceData DefineBody__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(299).setJavaLines(90).setLengths(20);}
    public UmpleSourceData DefineBody_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(299).setJavaLines(113).setLengths(2);}
    public UmpleSourceData BasicExpression__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(362).setJavaLines(339).setLengths(6);}
    public UmpleSourceData BasicExpression__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(362).setJavaLines(348).setLengths(17);}
    public UmpleSourceData BasicExpression_getExpression(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(339).setJavaLines(316).setLengths(19);}
    public UmpleSourceData BasicExpression_BasicExpression(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(311).setJavaLines(47).setLengths(4);}
    public UmpleSourceData BasicExpression_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(362).setJavaLines(368).setLengths(2);}
    public UmpleSourceData BasicExpression_convertOperator(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(314).setJavaLines(289).setLengths(23);}
    public UmpleSourceData CTLSpecification__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(378).setJavaLines(97).setLengths(6);}
    public UmpleSourceData CTLSpecification__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(378).setJavaLines(106).setLengths(19);}
    public UmpleSourceData CTLSpecification_CTLSpecification(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(369).setJavaLines(41).setLengths(1);}
    public UmpleSourceData CTLSpecification_printExpression(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(372).setJavaLines(90).setLengths(3);}
    public UmpleSourceData CTLSpecification_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(378).setJavaLines(128).setLengths(2);}
    public UmpleSourceData InvarExpression__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(412).setJavaLines(112).setLengths(6);}
    public UmpleSourceData InvarExpression__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(412).setJavaLines(121).setLengths(17);}
    public UmpleSourceData InvarExpression_getExpression(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(388).setJavaLines(87).setLengths(21);}
    public UmpleSourceData InvarExpression_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(412).setJavaLines(141).setLengths(2);}
    public UmpleSourceData InvarExpression_InvarExpression(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(386).setJavaLines(38).setLengths(1);}
    public UmpleSourceData CTLExpression__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(446).setJavaLines(112).setLengths(6);}
    public UmpleSourceData CTLExpression__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(446).setJavaLines(121).setLengths(17);}
    public UmpleSourceData CTLExpression_getExpression(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(422).setJavaLines(87).setLengths(21);}
    public UmpleSourceData CTLExpression_CTLExpression(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(420).setJavaLines(38).setLengths(1);}
    public UmpleSourceData CTLExpression_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(446).setJavaLines(141).setLengths(2);}
    public UmpleSourceData NextExpression__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(454).setJavaLines(65).setLengths(6);}
    public UmpleSourceData NextExpression_getExpression(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(454).setJavaLines(96).setLengths(2);}
    public UmpleSourceData NextExpression__getExpression(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(454).setJavaLines(74).setLengths(19);}
    public UmpleSourceData AssignConstraint__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(500).setJavaLines(199).setLengths(6);}
    public UmpleSourceData AssignConstraint__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(500).setJavaLines(208).setLengths(25);}
    public UmpleSourceData AssignConstraint_getVarNames(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(477).setJavaLines(179).setLengths(16);}
    public UmpleSourceData AssignConstraint_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(500).setJavaLines(236).setLengths(2);}
    public UmpleSourceData AssignConstraint_AssignConstraint(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(461).setJavaLines(43).setLengths(1);}
    public UmpleSourceData Assign_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(507).setJavaLines(71).setLengths(1);}
    public UmpleSourceData SimpleAssign__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(516).setJavaLines(42).setLengths(6);}
    public UmpleSourceData SimpleAssign__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(516).setJavaLines(51).setLengths(20);}
    public UmpleSourceData SimpleAssign_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(516).setJavaLines(74).setLengths(2);}
    public UmpleSourceData InitAssign__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(525).setJavaLines(42).setLengths(6);}
    public UmpleSourceData InitAssign__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(525).setJavaLines(51).setLengths(20);}
    public UmpleSourceData InitAssign_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(525).setJavaLines(74).setLengths(2);}
    public UmpleSourceData NextAssign__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(534).setJavaLines(42).setLengths(6);}
    public UmpleSourceData NextAssign__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(534).setJavaLines(51).setLengths(20);}
    public UmpleSourceData NextAssign_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(534).setJavaLines(74).setLengths(2);}
    public UmpleSourceData CaseExpression__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(545).setJavaLines(170).setLengths(6);}
    public UmpleSourceData CaseExpression__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(545).setJavaLines(179).setLengths(21);}
    public UmpleSourceData CaseExpression_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(545).setJavaLines(203).setLengths(2);}
    public UmpleSourceData CaseStatement__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(554).setJavaLines(120).setLengths(6);}
    public UmpleSourceData CaseStatement__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(554).setJavaLines(129).setLengths(20);}
    public UmpleSourceData CaseStatement_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(554).setJavaLines(152).setLengths(2);}
    public UmpleSourceData TransConstraint__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(573).setJavaLines(94).setLengths(6);}
    public UmpleSourceData TransConstraint__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(573).setJavaLines(103).setLengths(28);}
    public UmpleSourceData TransConstraint_TransConstraint(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(561).setJavaLines(45).setLengths(1);}
    public UmpleSourceData TransConstraint_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(573).setJavaLines(134).setLengths(2);}
    public UmpleSourceData InitConstraint__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(591).setJavaLines(94).setLengths(6);}
    public UmpleSourceData InitConstraint__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(591).setJavaLines(103).setLengths(28);}
    public UmpleSourceData InitConstraint_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(591).setJavaLines(134).setLengths(2);}
    public UmpleSourceData InitConstraint_InitConstraint(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(580).setJavaLines(45).setLengths(1);}
    public UmpleSourceData InvarConstraint__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(608).setJavaLines(94).setLengths(6);}
    public UmpleSourceData InvarConstraint__toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(608).setJavaLines(103).setLengths(28);}
    public UmpleSourceData InvarConstraint_toString(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(608).setJavaLines(134).setLengths(2);}
    public UmpleSourceData InvarConstraint_InvarConstraint(){ return new UmpleSourceData().setFileNames("NuSMVMetamodel.ump").setUmpleLines(598).setJavaLines(45).setLengths(1);}
    public UmpleSourceData TargetConfiguration_toString(){ return new UmpleSourceData().setFileNames("TargetConfig.ump").setUmpleLines(12).setJavaLines(182).setLengths(6);}
    public UmpleSourceData ModelOptimizer_getRegions(){ return new UmpleSourceData().setFileNames("ModelOptimizationEngine.ump").setUmpleLines(178).setJavaLines(207).setLengths(21);}
    public UmpleSourceData ModelOptimizer_printTransition(){ return new UmpleSourceData().setFileNames("ModelOptimizationEngine.ump").setUmpleLines(60).setJavaLines(84).setLengths(1);}
    public UmpleSourceData ModelOptimizer_buildEntry(){ return new UmpleSourceData().setFileNames("ModelOptimizationEngine.ump").setUmpleLines(203).setJavaLines(232).setLengths(16);}
    public UmpleSourceData ModelOptimizer_printTable(){ return new UmpleSourceData().setFileNames("ModelOptimizationEngine.ump").setUmpleLines(65).setJavaLines(89).setLengths(10);}
    public UmpleSourceData ModelOptimizer_optimize(){ return new UmpleSourceData().setFileNames("ModelOptimizationEngine.ump","ModelOptimizationEngine.ump").setUmpleLines(12, 99).setJavaLines(33, 128).setLengths(19, 65);}
    public UmpleSourceData ModelOptimizer_createCopy(){ return new UmpleSourceData().setFileNames("ModelOptimizationEngine.ump","ModelOptimizationEngine.ump").setUmpleLines(225, 247).setJavaLines(256, 281).setLengths(17, 19);}
    public UmpleSourceData ModelOptimizer_kind(){ return new UmpleSourceData().setFileNames("ModelOptimizationEngine.ump").setUmpleLines(272).setJavaLines(309).setLengths(13);}
    public UmpleSourceData ModelOptimizer_setTransition(){ return new UmpleSourceData().setFileNames("ModelOptimizationEngine.ump").setUmpleLines(82).setJavaLines(108).setLengths(12);}
    public UmpleSourceData ModelOptimizer_difference(){ return new UmpleSourceData().setFileNames("ModelOptimizationEngine.ump").setUmpleLines(168).setJavaLines(197).setLengths(6);}
    public UmpleSourceData ModelOptimizer_getStateMachines(){ return new UmpleSourceData().setFileNames("ModelOptimizationEngine.ump").setUmpleLines(35).setJavaLines(56).setLengths(11);}
    public UmpleSourceData ModelOptimizer_printStatesOf(){ return new UmpleSourceData().setFileNames("ModelOptimizationEngine.ump").setUmpleLines(52).setJavaLines(75).setLengths(5);}
    public UmpleSourceData NuSMVCoordinator_getCompositeStates(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(203).setJavaLines(238).setLengths(5);}
    public UmpleSourceData NuSMVCoordinator_composeExpressionFor(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1571).setJavaLines(1633).setLengths(35);}
    public UmpleSourceData NuSMVCoordinator_isOutgoingOfOrthogonal(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(940).setJavaLines(940).setLengths(7);}
    public UmpleSourceData NuSMVCoordinator_analyzeModel(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(430).setJavaLines(486).setLengths(22);}
    public UmpleSourceData NuSMVCoordinator_getExitTransitionsForConcurrentRegion(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1283).setJavaLines(1315).setLengths(18);}
    public UmpleSourceData NuSMVCoordinator_mapOperator(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1709).setJavaLines(1784).setLengths(10);}
    public UmpleSourceData NuSMVCoordinator_printList(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1343).setJavaLines(1379).setLengths(4);}
    public UmpleSourceData NuSMVCoordinator_changeNameCase(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(24).setJavaLines(49).setLengths(9);}
    public UmpleSourceData NuSMVCoordinator_getStateList(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1482).setJavaLines(1533).setLengths(6);}
    public UmpleSourceData NuSMVCoordinator_createFile(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(310).setJavaLines(354).setLengths(17);}
    public UmpleSourceData NuSMVCoordinator_generateSpecForTransitionDeterminism(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump","NuSMVCoordinationUnit.ump").setUmpleLines(608, 705).setJavaLines(683, 786).setLengths(28, 25);}
    public UmpleSourceData NuSMVCoordinator_isOperator(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1666).setJavaLines(1739).setLengths(26);}
    public UmpleSourceData NuSMVCoordinator_generateModuleForNestedStateMachine(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(518).setJavaLines(584).setLengths(14);}
    public UmpleSourceData NuSMVCoordinator_getExternalStateOf(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(961).setJavaLines(969).setLengths(7);}
    public UmpleSourceData NuSMVCoordinator_generateStateMachineList(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(145).setJavaLines(173).setLengths(7);}
    public UmpleSourceData NuSMVCoordinator_generateRHS(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump","NuSMVCoordinationUnit.ump").setUmpleLines(1641, 1661).setJavaLines(1709, 1730).setLengths(17, 1);}
    public UmpleSourceData NuSMVCoordinator_generateVariableSpecifierForMain(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(133).setJavaLines(157).setLengths(8);}
    public UmpleSourceData NuSMVCoordinator_getNestedStateMachines(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1212).setJavaLines(1235).setLengths(18);}
    public UmpleSourceData NuSMVCoordinator_getLCA(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(951).setJavaLines(955).setLengths(6);}
    public UmpleSourceData NuSMVCoordinator_getNextAssign(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1142).setJavaLines(1156).setLengths(26);}
    public UmpleSourceData NuSMVCoordinator_isHighLevelTransition(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(187).setJavaLines(220).setLengths(4);}
    public UmpleSourceData NuSMVCoordinator_getEventAssignConstraint(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1035).setJavaLines(1044).setLengths(22);}
    public UmpleSourceData NuSMVCoordinator_getEmbeddedStates(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump","NuSMVCoordinationUnit.ump").setUmpleLines(927, 1330).setJavaLines(923, 1365).setLengths(9, 10);}
    public UmpleSourceData NuSMVCoordinator_deleteAnalysisFiles(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(457).setJavaLines(516).setLengths(10);}
    public UmpleSourceData NuSMVCoordinator_getExpressionTreeFor(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1441).setJavaLines(1484).setLengths(12);}
    public UmpleSourceData NuSMVCoordinator_generateSpecifier(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1492).setJavaLines(1543).setLengths(15);}
    public UmpleSourceData NuSMVCoordinator_generateSpecifiersForAttributesOf(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1524).setJavaLines(1580).setLengths(10);}
    public UmpleSourceData NuSMVCoordinator_executeCommand(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(350).setJavaLines(400).setLengths(17);}
    public UmpleSourceData NuSMVCoordinator_isEmbeddedSourceInconsistent(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(826).setJavaLines(895).setLengths(20);}
    public UmpleSourceData NuSMVCoordinator_generateModuleForSimpleStateMachine(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(537).setJavaLines(606).setLengths(10);}
    public UmpleSourceData NuSMVCoordinator_getAllEnablingTransitions(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1184).setJavaLines(1206).setLengths(25);}
    public UmpleSourceData NuSMVCoordinator_isSourceEmbedded(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(811).setJavaLines(878).setLengths(9);}
    public UmpleSourceData NuSMVCoordinator_getExpression(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1695).setJavaLines(1769).setLengths(11);}
    public UmpleSourceData NuSMVCoordinator_generateModuleForCompositeStatesOf(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(211).setJavaLines(247).setLengths(9);}
    public UmpleSourceData NuSMVCoordinator_appendConstraint(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(474).setJavaLines(534).setLengths(4);}
    public UmpleSourceData NuSMVCoordinator_getExternalTransitions(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1377).setJavaLines(1416).setLengths(24);}
    public UmpleSourceData NuSMVCoordinator_getCaseStatementForNullState(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1352).setJavaLines(1391).setLengths(21);}
    public UmpleSourceData NuSMVCoordinator_ancestorStack(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1428).setJavaLines(1470).setLengths(10);}
    public UmpleSourceData NuSMVCoordinator_getEnclosedTransitions(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1272).setJavaLines(1302).setLengths(5);}
    public UmpleSourceData NuSMVCoordinator_getAndCross(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1260).setJavaLines(1290).setLengths(8);}
    public UmpleSourceData NuSMVCoordinator_generateParentModule(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(54).setJavaLines(81).setLengths(29);}
    public UmpleSourceData NuSMVCoordinator_generateDestinationStatesExpr(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump","NuSMVCoordinationUnit.ump").setUmpleLines(582, 987).setJavaLines(656, 995).setLengths(23, 31);}
    public UmpleSourceData NuSMVCoordinator_isIgnorablePair(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(788).setJavaLines(848).setLengths(13);}
    public UmpleSourceData NuSMVCoordinator__createSpacesString(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(15).setJavaLines(1798).setLengths(6);}
    public UmpleSourceData NuSMVCoordinator_generateModel(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(241).setJavaLines(282).setLengths(64);}
    public UmpleSourceData NuSMVCoordinator_skipWrapper(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(979).setJavaLines(988).setLengths(3);}
    public UmpleSourceData NuSMVCoordinator_generateModules(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump","NuSMVCoordinationUnit.ump").setUmpleLines(483, 496).setJavaLines(546, 561).setLengths(7, 19);}
    public UmpleSourceData NuSMVCoordinator_getEventName(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1617).setJavaLines(1684).setLengths(3);}
    public UmpleSourceData NuSMVCoordinator_generateModuleForSubstate(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(551).setJavaLines(624).setLengths(5);}
    public UmpleSourceData NuSMVCoordinator_diasableCompositeState(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1125).setJavaLines(1138).setLengths(14);}
    public UmpleSourceData NuSMVCoordinator_getExitTransitions(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1305).setJavaLines(1341).setLengths(20);}
    public UmpleSourceData NuSMVCoordinator_getObjectIdentity(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(559).setJavaLines(633).setLengths(19);}
    public UmpleSourceData NuSMVCoordinator_getAbsoluteName(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(86).setJavaLines(114).setLengths(1);}
    public UmpleSourceData NuSMVCoordinator_prepareAnalysisFiles(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(388).setJavaLines(441).setLengths(37);}
    public UmpleSourceData NuSMVCoordinator_genMainVariableFor(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump","NuSMVCoordinationUnit.ump").setUmpleLines(224, 1456).setJavaLines(264, 1500).setLengths(10, 12);}
    public UmpleSourceData NuSMVCoordinator_isSameDestination(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(805).setJavaLines(869).setLengths(1);}
    public UmpleSourceData NuSMVCoordinator_getStateMachineOfHighLevelTransition(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(194).setJavaLines(228).setLengths(6);}
    public UmpleSourceData NuSMVCoordinator_getCaseStatement(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1406).setJavaLines(1444).setLengths(18);}
    public UmpleSourceData NuSMVCoordinator_mapIdentity(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(972).setJavaLines(980).setLengths(4);}
    public UmpleSourceData NuSMVCoordinator_getDependencySet(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(102).setJavaLines(123).setLengths(14);}
    public UmpleSourceData NuSMVCoordinator_initializeCompositeStartState(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1094).setJavaLines(1104).setLengths(26);}
    public UmpleSourceData NuSMVCoordinator_deleteFile(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(332).setJavaLines(379).setLengths(13);}
    public UmpleSourceData NuSMVCoordinator_andCross(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1235).setJavaLines(1261).setLengths(21);}
    public UmpleSourceData NuSMVCoordinator_generateSpecifiersForInputAttributesOf(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1511).setJavaLines(1566).setLengths(10);}
    public UmpleSourceData NuSMVCoordinator_getAllEventNames(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1610).setJavaLines(1676).setLengths(4);}
    public UmpleSourceData NuSMVCoordinator__commentModel(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(15).setJavaLines(1807).setLengths(19);}
    public UmpleSourceData NuSMVCoordinator_getEmbeddedStateMachines(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(156).setJavaLines(188).setLengths(28);}
    public UmpleSourceData NuSMVCoordinator_isNested(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(36).setJavaLines(62).setLengths(7);}
    public UmpleSourceData NuSMVCoordinator_getAssignConstraint(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump","NuSMVCoordinationUnit.ump").setUmpleLines(1021, 1060).setJavaLines(1030, 1070).setLengths(10, 30);}
    public UmpleSourceData NuSMVCoordinator_commentModel(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(15).setJavaLines(1829).setLengths(2);}
    public UmpleSourceData NuSMVCoordinator_match(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(749).setJavaLines(819).setLengths(21);}
    public UmpleSourceData NuSMVCoordinator_getDefineDeclaration(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1538).setJavaLines(1598).setLengths(22);}
    public UmpleSourceData NuSMVCoordinator_getEventList(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1473).setJavaLines(1520).setLengths(5);}
    public UmpleSourceData NuSMVCoordinator_isConcurrent(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1563).setJavaLines(1624).setLengths(5);}
    public UmpleSourceData NuSMVCoordinator_getAllTransitionsForOrthogonalState(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1172).setJavaLines(1190).setLengths(6);}
    public UmpleSourceData NuSMVCoordinator_generateSpecForStateReachability(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump","NuSMVCoordinationUnit.ump").setUmpleLines(641, 662).setJavaLines(719, 740).setLengths(17, 13);}
    public UmpleSourceData NuSMVCoordinator_generateSystem(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(46).setJavaLines(73).setLengths(4);}
    public UmpleSourceData NuSMVCoordinator_composeExpressionForStability(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(1623).setJavaLines(1691).setLengths(14);}
    public UmpleSourceData NuSMVCoordinator_hasInfiniteDomain(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(371).setJavaLines(421).setLengths(12);}
    public UmpleSourceData NuSMVCoordinator_getParentState(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(119).setJavaLines(141).setLengths(5);}
    public UmpleSourceData NuSMVCoordinator_generateParameters(){ return new UmpleSourceData().setFileNames("NuSMVCoordinationUnit.ump").setUmpleLines(127).setJavaLines(150).setLengths(3);}
    public UmpleSourceData NuSMVGenerator_terminateCode(){ return new UmpleSourceData().setFileNames("Generator_CodeNuSMV.ump").setUmpleLines(50).setJavaLines(88).setLengths(2);}
    public UmpleSourceData NuSMVGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeNuSMV.ump").setUmpleLines(36).setJavaLines(73).setLengths(11);}
    public UmpleSourceData NuSMVGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeNuSMV.ump").setUmpleLines(57).setJavaLines(98).setLengths(15);}
    public UmpleSourceData NuSMVOptimizerGenerator_terminateCode(){ return new UmpleSourceData().setFileNames("Generator_CodeNuSMVOptimizer.ump").setUmpleLines(50).setJavaLines(88).setLengths(2);}
    public UmpleSourceData NuSMVOptimizerGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeNuSMVOptimizer.ump").setUmpleLines(36).setJavaLines(73).setLengths(11);}
    public UmpleSourceData NuSMVOptimizerGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeNuSMVOptimizer.ump").setUmpleLines(57).setJavaLines(98).setLengths(15);}
    public UmpleSourceData SimulateGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeSimulate.ump").setUmpleLines(27).setJavaLines(72).setLengths(78);}
    public UmpleSourceData SimulateGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeSimulate.ump").setUmpleLines(109).setJavaLines(154).setLengths(15);}
    public UmpleSourceData YumlGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeYuml.ump").setUmpleLines(25).setJavaLines(73).setLengths(101);}
    public UmpleSourceData XtextGenerator_query(){ return new UmpleSourceData().setFileNames("Generator_CodeXtext.ump").setUmpleLines(164).setJavaLines(280).setLengths(14);}
    public UmpleSourceData XtextGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeXtext.ump").setUmpleLines(31).setJavaLines(145).setLengths(112);}
    public UmpleSourceData XtextGenerator_getXtextRulename(){ return new UmpleSourceData().setFileNames("Generator_CodeXtext.ump").setUmpleLines(217).setJavaLines(298).setLengths(1);}
    public UmpleSourceData XtextGenerator_writeFile(){ return new UmpleSourceData().setFileNames("Generator_CodeXtext.ump").setUmpleLines(222).setJavaLines(303).setLengths(18);}
    public UmpleSourceData XtextGenerator_translate(){ return new UmpleSourceData().setFileNames("Generator_CodeXtext.ump").setUmpleLines(146).setJavaLines(261).setLengths(15);}
    public UmpleSourceData JsonGenerator_extractClassName(){ return new UmpleSourceData().setFileNames("Generator_CodeJson.ump").setUmpleLines(375).setJavaLines(425).setLengths(15);}
    public UmpleSourceData JsonGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeJson.ump").setUmpleLines(23).setJavaLines(70).setLengths(346);}
    public UmpleSourceData JsonMixedGenerator_parseSingleTransition(){ return new UmpleSourceData().setFileNames("Generator_CodeJsonMixed.ump").setUmpleLines(467).setJavaLines(514).setLengths(32);}
    public UmpleSourceData JsonMixedGenerator_parseStateActions(){ return new UmpleSourceData().setFileNames("Generator_CodeJsonMixed.ump").setUmpleLines(574).setJavaLines(624).setLengths(24);}
    public UmpleSourceData JsonMixedGenerator_extractClassName(){ return new UmpleSourceData().setFileNames("Generator_CodeJsonMixed.ump").setUmpleLines(630).setJavaLines(684).setLengths(12);}
    public UmpleSourceData JsonMixedGenerator_parseInternalTransition(){ return new UmpleSourceData().setFileNames("Generator_CodeJsonMixed.ump").setUmpleLines(502).setJavaLines(550).setLengths(25);}
    public UmpleSourceData JsonMixedGenerator_parseStateActivities(){ return new UmpleSourceData().setFileNames("Generator_CodeJsonMixed.ump").setUmpleLines(601).setJavaLines(652).setLengths(23);}
    public UmpleSourceData JsonMixedGenerator_parseStateMachines(){ return new UmpleSourceData().setFileNames("Generator_CodeJsonMixed.ump").setUmpleLines(378).setJavaLines(424).setLengths(86);}
    public UmpleSourceData JsonMixedGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeJsonMixed.ump").setUmpleLines(25).setJavaLines(70).setLengths(350);}
    public UmpleSourceData JsonMixedGenerator_parseTransitions(){ return new UmpleSourceData().setFileNames("Generator_CodeJsonMixed.ump").setUmpleLines(530).setJavaLines(579).setLengths(41);}
    public UmpleSourceData StructureDiagramGenerator__createSpacesString(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(49).setJavaLines(364).setLengths(6);}
    public UmpleSourceData StructureDiagramGenerator__createEmptyCanvas(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(94).setJavaLines(584).setLengths(18);}
    public UmpleSourceData StructureDiagramGenerator_createEmptyCanvas(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(94).setJavaLines(605).setLengths(2);}
    public UmpleSourceData StructureDiagramGenerator_removeComponentConflicts(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(126).setJavaLines(206).setLengths(9);}
    public UmpleSourceData StructureDiagramGenerator__getColorSettings(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(49).setJavaLines(373).setLengths(24);}
    public UmpleSourceData StructureDiagramGenerator_getColorSettings(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(49).setJavaLines(400).setLengths(2);}
    public UmpleSourceData StructureDiagramGenerator__getDiagramSettings(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(58).setJavaLines(405).setLengths(18);}
    public UmpleSourceData StructureDiagramGenerator_createBindingNode(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(67).setJavaLines(531).setLengths(2);}
    public UmpleSourceData StructureDiagramGenerator_getComponentDescriptor(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(61).setJavaLines(461).setLengths(2);}
    public UmpleSourceData StructureDiagramGenerator__createBindingNode(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(67).setJavaLines(494).setLengths(34);}
    public UmpleSourceData StructureDiagramGenerator__createJavaScriptCall(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(71).setJavaLines(536).setLengths(40);}
    public UmpleSourceData StructureDiagramGenerator_createJavaScriptCall(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump","Generator_CodeStructureDiagram.ump").setUmpleLines(138, 71).setJavaLines(219, 579).setLengths(110, 2);}
    public UmpleSourceData StructureDiagramGenerator_matchBindingDescriptor(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(115).setJavaLines(194).setLengths(8);}
    public UmpleSourceData StructureDiagramGenerator_hasSubComponents(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(101).setJavaLines(179).setLengths(11);}
    public UmpleSourceData StructureDiagramGenerator_getDiagramSettings(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(58).setJavaLines(426).setLengths(2);}
    public UmpleSourceData StructureDiagramGenerator__getComponentDescriptor(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(61).setJavaLines(431).setLengths(27);}
    public UmpleSourceData StructureDiagramGenerator_getComponent(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(64).setJavaLines(489).setLengths(2);}
    public UmpleSourceData StructureDiagramGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(253).setJavaLines(333).setLengths(4);}
    public UmpleSourceData StructureDiagramGenerator__getComponent(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(64).setJavaLines(466).setLengths(20);}
    public UmpleSourceData StructureDiagramGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeStructureDiagram.ump").setUmpleLines(262).setJavaLines(345).setLengths(15);}
    public UmpleSourceData SuperGvGenerator_twoLabelAssociation(){ return new UmpleSourceData().setFileNames("Generator_SuperGvGenerator.ump").setUmpleLines(206).setJavaLines(276).setLengths(7);}
    public UmpleSourceData SuperGvGenerator__createSpacesString(){ return new UmpleSourceData().setFileNames("Generator_SuperGvGenerator.ump").setUmpleLines(26).setJavaLines(287).setLengths(6);}
    public UmpleSourceData SuperGvGenerator_retArrows(){ return new UmpleSourceData().setFileNames("Generator_SuperGvGenerator.ump").setUmpleLines(159).setJavaLines(230).setLengths(32);}
    public UmpleSourceData SuperGvGenerator__graphStart(){ return new UmpleSourceData().setFileNames("Generator_SuperGvGenerator.ump").setUmpleLines(26).setJavaLines(296).setLengths(20);}
    public UmpleSourceData SuperGvGenerator_labelAssociation(){ return new UmpleSourceData().setFileNames("Generator_SuperGvGenerator.ump").setUmpleLines(195).setJavaLines(266).setLengths(6);}
    public UmpleSourceData SuperGvGenerator_graphStart(){ return new UmpleSourceData().setFileNames("Generator_SuperGvGenerator.ump").setUmpleLines(26).setJavaLines(319).setLengths(2);}
    public UmpleSourceData SuperGvGenerator_interfaceCreation(){ return new UmpleSourceData().setFileNames("Generator_SuperGvGenerator.ump").setUmpleLines(100).setJavaLines(164).setLengths(1);}
    public UmpleSourceData SuperGvGenerator_visitClass(){ return new UmpleSourceData().setFileNames("Generator_SuperGvGenerator.ump").setUmpleLines(59).setJavaLines(116).setLengths(34);}
    public UmpleSourceData SuperGvGenerator_terminateCode(){ return new UmpleSourceData().setFileNames("Generator_SuperGvGenerator.ump").setUmpleLines(104).setJavaLines(169).setLengths(7);}
    public UmpleSourceData SuperGvGenerator_appendTooltipComment(){ return new UmpleSourceData().setFileNames("Generator_SuperGvGenerator.ump").setUmpleLines(137).setJavaLines(208).setLengths(18);}
    public UmpleSourceData SuperGvGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_SuperGvGenerator.ump").setUmpleLines(32).setJavaLines(86).setLengths(22);}
    public UmpleSourceData SuperGvGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_SuperGvGenerator.ump").setUmpleLines(116).setJavaLines(184).setLengths(16);}
    public UmpleSourceData AttributeElement_toString(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(69).setJavaLines(61).setLengths(6);}
    public UmpleSourceData Element_getAttributeElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(114).setJavaLines(278).setLengths(6);}
    public UmpleSourceData Element_closeStatement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(236).setJavaLines(414).setLengths(1);}
    public UmpleSourceData Element_Element(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(90).setJavaLines(36).setLengths(4);}
    public UmpleSourceData Element_getChildByPath(){ return new UmpleSourceData().setFileNames("Generator_Html.ump","Generator_Html.ump").setUmpleLines(148, 153).setJavaLines(317, 323).setLengths(2, 2);}
    public UmpleSourceData Element_htmlString(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(217).setJavaLines(393).setLengths(8);}
    public UmpleSourceData Element_getAttribute(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(123).setJavaLines(288).setLengths(2);}
    public UmpleSourceData Element_appendTextContents(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(132).setJavaLines(299).setLengths(7);}
    public UmpleSourceData Element_setParentInternally(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(103).setJavaLines(267).setLengths(7);}
    public UmpleSourceData Element_toString(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(213).setJavaLines(388).setLengths(1);}
    public UmpleSourceData Element_appendText(){ return new UmpleSourceData().setFileNames("Generator_Html.ump","Generator_Html.ump").setUmpleLines(128, 142).setJavaLines(294, 310).setLengths(1, 3);}
    public UmpleSourceData Element_addChild(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(97).setJavaLines(183).setLengths(4);}
    public UmpleSourceData Element_getChildrenByPath(){ return new UmpleSourceData().setFileNames("Generator_Html.ump","Generator_Html.ump","Generator_Html.ump","Generator_Html.ump").setUmpleLines(158, 178, 186, 192).setJavaLines(329, 350, 359, 366).setLengths(17, 5, 3, 18);}
    public UmpleSourceData Element_openStatement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(228).setJavaLines(405).setLengths(5);}
    public UmpleSourceData TextContents_htmlString(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(243).setJavaLines(33).setLengths(1);}
    public UmpleSourceData HtmlElement_HtmlElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(257).setJavaLines(24).setLengths(2);}
    public UmpleSourceData HtmlElement_getElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(261).setJavaLines(37).setLengths(1);}
    public UmpleSourceData HtmlElement_htmlString(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(265).setJavaLines(42).setLengths(1);}
    public UmpleSourceData DivElement_DivElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(274).setJavaLines(24).setLengths(1);}
    public UmpleSourceData DivElement_getElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(277).setJavaLines(36).setLengths(1);}
    public UmpleSourceData DivElement_htmlString(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(281).setJavaLines(41).setLengths(1);}
    public UmpleSourceData TableElement_setCssClass(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(324).setJavaLines(112).setLengths(3);}
    public UmpleSourceData TableElement_setBorder(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(330).setJavaLines(133).setLengths(1);}
    public UmpleSourceData TableElement_getElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(357).setJavaLines(218).setLengths(1);}
    public UmpleSourceData TableElement_isNull(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(353).setJavaLines(213).setLengths(1);}
    public UmpleSourceData TableElement_setId(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(312).setJavaLines(70).setLengths(3);}
    public UmpleSourceData TableElement_addRow(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(333).setJavaLines(203).setLengths(6);}
    public UmpleSourceData TableElement_setBodyId(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(318).setJavaLines(91).setLengths(3);}
    public UmpleSourceData TableElement_TableElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(305).setJavaLines(45).setLengths(4);}
    public UmpleSourceData TableElement_htmlString(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(361).setJavaLines(223).setLengths(1);}
    public UmpleSourceData ScriptElement_getElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(379).setJavaLines(59).setLengths(1);}
    public UmpleSourceData ScriptElement_ScriptElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(375).setJavaLines(28).setLengths(2);}
    public UmpleSourceData ScriptElement_htmlString(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(383).setJavaLines(64).setLengths(1);}
    public UmpleSourceData StyleElement_getElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(402).setJavaLines(59).setLengths(1);}
    public UmpleSourceData StyleElement_StyleElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(398).setJavaLines(28).setLengths(2);}
    public UmpleSourceData StyleElement_htmlString(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(406).setJavaLines(64).setLengths(1);}
    public UmpleSourceData ParagraphElement_ParagraphElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(421).setJavaLines(30).setLengths(6);}
    public UmpleSourceData ParagraphElement_getElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(439).setJavaLines(95).setLengths(1);}
    public UmpleSourceData ParagraphElement_isNull(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(435).setJavaLines(90).setLengths(1);}
    public UmpleSourceData ParagraphElement_appendText(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(429).setJavaLines(83).setLengths(3);}
    public UmpleSourceData ParagraphElement_htmlString(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(443).setJavaLines(100).setLengths(1);}
    public UmpleSourceData HtmlDocument_createTable(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(460).setJavaLines(52).setLengths(2);}
    public UmpleSourceData HtmlDocument_createParagraphElement(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(485).setJavaLines(80).setLengths(2);}
    public UmpleSourceData HtmlDocument_HtmlDocument(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(453).setJavaLines(26).setLengths(5);}
    public UmpleSourceData HtmlDocument_toString(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(494).setJavaLines(91).setLengths(1);}
    public UmpleSourceData HtmlDocument_createScript(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(465).setJavaLines(58).setLengths(7);}
    public UmpleSourceData HtmlDocument_createStyle(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(475).setJavaLines(69).setLengths(7);}
    public UmpleSourceData HtmlDocument_htmlString(){ return new UmpleSourceData().setFileNames("Generator_Html.ump").setUmpleLines(490).setJavaLines(86).setLengths(1);}
    public UmpleSourceData UmpleModelVisitor_visit(){ return new UmpleSourceData().setFileNames("Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump","Generator_UmpleModelWalker.ump").setUmpleLines(55, 58, 61, 62, 63, 64, 67, 68, 69, 70, 73, 74, 75, 76, 77, 78, 81, 82, 83, 86, 87, 88, 91, 94, 95, 96, 97, 100, 101, 102, 103, 104, 105, 106, 109, 110, 111, 112, 113, 114, 115, 116, 117, 121, 122).setJavaLines(33, 42, 51, 56, 61, 66, 75, 80, 85, 90, 99, 104, 109, 114, 119, 124, 133, 138, 143, 152, 157, 162, 171, 180, 185, 190, 195, 204, 209, 214, 219, 224, 229, 234, 243, 248, 253, 258, 263, 268, 273, 278, 283, 292, 297).setLengths(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);}
    public UmpleSourceData UmpleModelVisitor_done(){ return new UmpleSourceData().setFileNames("Generator_UmpleModelWalker.ump").setUmpleLines(125).setJavaLines(306).setLengths(1);}
    public UmpleSourceData UmpleModelWalker_accept(){ return new UmpleSourceData().setFileNames("Generator_UmpleModelWalker.ump").setUmpleLines(144).setJavaLines(51).setLengths(197);}
    public UmpleSourceData CodeAnalysisGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(38).setJavaLines(88).setLengths(9);}
    public UmpleSourceData CodeAnalysisGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(52).setJavaLines(105).setLengths(15);}
    public UmpleSourceData UmpleModelHelper_doCount(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(107).setJavaLines(48).setLengths(74);}
    public UmpleSourceData LLOCMetricVisitor_addTableEntry(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(214).setJavaLines(156).setLengths(8);}
    public UmpleSourceData LLOCMetricVisitor_LLOCMetricVisitor(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(203).setJavaLines(42).setLengths(4);}
    public UmpleSourceData LLOCMetricVisitor_visit(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump").setUmpleLines(226, 231, 235, 239, 245, 248, 251, 254, 262, 265, 272, 276, 281, 290, 293, 298, 303, 311, 314, 320, 323, 329, 334, 337, 340, 343, 346, 349, 355, 362).setJavaLines(172, 181, 187, 193, 203, 208, 213, 218, 230, 235, 244, 249, 258, 271, 276, 285, 294, 306, 311, 322, 327, 338, 347, 352, 357, 362, 367, 372, 381, 390).setLengths(1, 2, 2, 2, 1, 1, 1, 4, 1, 5, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5);}
    public UmpleSourceData LLOCMetricVisitor_done(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(209).setJavaLines(150).setLengths(2);}
    public UmpleSourceData McCabeMetricVisitor_addTableEntry(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(402).setJavaLines(158).setLengths(9);}
    public UmpleSourceData McCabeMetricVisitor_visit(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump").setUmpleLines(415, 418, 421, 426, 431, 434, 437, 442, 445, 448, 453, 458, 466, 469, 472, 477, 480, 504, 509, 520, 523).setJavaLines(175, 180, 185, 194, 201, 206, 211, 220, 225, 230, 239, 248, 260, 265, 270, 277, 282, 308, 317, 330, 335).setLengths(1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 22, 1, 9, 1, 1);}
    public UmpleSourceData McCabeMetricVisitor_done(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(396).setJavaLines(151).setLengths(3);}
    public UmpleSourceData McCabeMetricVisitor_McCabeMetricVisitor(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(390).setJavaLines(43).setLengths(4);}
    public UmpleSourceData ClassStatsVisitor_addTableEntry(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(562).setJavaLines(246).setLengths(15);}
    public UmpleSourceData ClassStatsVisitor_ClassStatsVisitor(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(551).setJavaLines(54).setLengths(4);}
    public UmpleSourceData ClassStatsVisitor_visit(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump").setUmpleLines(581, 586, 592, 597, 603).setJavaLines(269, 275, 285, 294, 304).setLengths(2, 2, 1, 2, 1);}
    public UmpleSourceData ClassStatsVisitor_done(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(557).setJavaLines(240).setLengths(2);}
    public UmpleSourceData StateMachineStatsVisitor_addTableEntry(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(647).setJavaLines(306).setLengths(19);}
    public UmpleSourceData StateMachineStatsVisitor_StateMachineStatsVisitor(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(636).setJavaLines(62).setLengths(4);}
    public UmpleSourceData StateMachineStatsVisitor_visit(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump","Generator_CodeAnalysis.ump").setUmpleLines(670, 673, 676, 680, 683, 686, 689, 692, 695, 698).setJavaLines(333, 338, 343, 348, 353, 358, 363, 368, 373, 378).setLengths(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);}
    public UmpleSourceData StateMachineStatsVisitor_done(){ return new UmpleSourceData().setFileNames("Generator_CodeAnalysis.ump").setUmpleLines(642).setJavaLines(300).setLengths(2);}
    public UmpleSourceData UmpleAnnotaiveToCompositionGenerator_spacer(){ return new UmpleSourceData().setFileNames("Generator_CodeAnnotaiveToComposition.ump").setUmpleLines(104).setJavaLines(164).setLengths(6);}
    public UmpleSourceData UmpleAnnotaiveToCompositionGenerator_generate(){ return new UmpleSourceData().setFileNames("Generator_CodeAnnotaiveToComposition.ump").setUmpleLines(27).setJavaLines(88).setLengths(72);}
    public UmpleSourceData UmpleAnnotaiveToCompositionGenerator_writeModel(){ return new UmpleSourceData().setFileNames("Generator_CodeAnnotaiveToComposition.ump").setUmpleLines(114).setJavaLines(174).setLengths(15);}

  }
  public static class UmpleSourceData
  {
    String[] umpleFileNames;
    Integer[] umpleLines;
    Integer[] umpleJavaLines;
    Integer[] umpleLengths;
    
    public UmpleSourceData(){
    }
    public String getFileName(int i){
      return umpleFileNames[i];
    }
    public Integer getUmpleLine(int i){
      return umpleLines[i];
    }
    public Integer getJavaLine(int i){
      return umpleJavaLines[i];
    }
    public Integer getLength(int i){
      return umpleLengths[i];
    }
    public UmpleSourceData setFileNames(String... filenames){
      umpleFileNames = filenames;
      return this;
    }
    public UmpleSourceData setUmpleLines(Integer... umplelines){
      umpleLines = umplelines;
      return this;
    }
    public UmpleSourceData setJavaLines(Integer... javalines){
      umpleJavaLines = javalines;
      return this;
    }
    public UmpleSourceData setLengths(Integer... lengths){
      umpleLengths = lengths;
      return this;
    }
    public int size(){
      return umpleFileNames.length;
    }
  }
}