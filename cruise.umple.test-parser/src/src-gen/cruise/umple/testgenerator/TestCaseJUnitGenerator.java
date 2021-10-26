/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.testgenerator;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import cruise.umple.testparser.TestParser;
import cruise.umple.unitGen.jUnit.JUnitGenerator;
import cruise.umple.compiler.*;

// line 2 "../../../../ump/TestCaseTemplate_JUnitGenerator.ump"
// line 26 "../../../../ump/TestCaseTemplate_Generator.ump"
public class TestCaseJUnitGenerator implements TestCaseGenerator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TestCaseJUnitGenerator Attributes
  private JUnitGenerator juG;
  private TestParser parser;
  private TestModel testModel;
  private String grammarFile;
  private File testModelFile;
  private StringBuilder code;
  private String path;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TestCaseJUnitGenerator(TestModel aTestModel, String aGrammarFile, File aTestModelFile, StringBuilder aCode, String aPath)
  {
    juG = new JUnitGenerator();
    parser = new TestParser(null, null, null, 0);
    testModel = aTestModel;
    grammarFile = aGrammarFile;
    testModelFile = aTestModelFile;
    code = aCode;
    path = aPath;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setJuG(JUnitGenerator aJuG)
  {
    boolean wasSet = false;
    juG = aJuG;
    wasSet = true;
    return wasSet;
  }

  public boolean setParser(TestParser aParser)
  {
    boolean wasSet = false;
    parser = aParser;
    wasSet = true;
    return wasSet;
  }

  public boolean setTestModel(TestModel aTestModel)
  {
    boolean wasSet = false;
    testModel = aTestModel;
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

  public boolean setCode(StringBuilder aCode)
  {
    boolean wasSet = false;
    code = aCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setPath(String aPath)
  {
    boolean wasSet = false;
    path = aPath;
    wasSet = true;
    return wasSet;
  }

  public JUnitGenerator getJuG()
  {
    return juG;
  }

  public TestParser getParser()
  {
    return parser;
  }

  public TestModel getTestModel()
  {
    return testModel;
  }

  public String getGrammarFile()
  {
    return grammarFile;
  }

  public File getTestModelFile()
  {
    return testModelFile;
  }

  public StringBuilder getCode()
  {
    return code;
  }

  public String getPath()
  {
    return path;
  }

  public void delete()
  {}


  @Override
  // line 26 "../../../../ump/TestCaseTemplate_JUnitGenerator.ump"
   public boolean setModel(UmpleModel model){
    // TODO Auto-generated method stub
	return false;
  }


  @Override
  // line 32 "../../../../ump/TestCaseTemplate_JUnitGenerator.ump"
   public void setCredential(){
    // TODO Auto-generated method stub
  }


  @Override
  // line 38 "../../../../ump/TestCaseTemplate_JUnitGenerator.ump"
   public void prepare(){
    grammarFile= "src/mbt_parsing.grammar";
	testModelFile = new File( "src/model1.umpt");
	path = "stc-gen";
	parser.setGrammarFile(grammarFile);
	parser.setTestModelFile(testModelFile);
	parser.prepare();
  }


  @Override
  // line 49 "../../../../ump/TestCaseTemplate_JUnitGenerator.ump"
   public void generate(){
    System.out.println("JUnitgenerate::");
			prepare();
			setTestModel(parser.getATestModel());
			//testModel.getTestSuite(0).getTestcases().forEach(action);
			//code.append(juG.getCode(testModel));
			System.out.println(juG.getCode(testModel));
			writeFile();
  }


  @Override
  // line 62 "../../../../ump/TestCaseTemplate_JUnitGenerator.ump"
   public void writeFile(TestSuite ts){
    
  }

  // line 66 "../../../../ump/TestCaseTemplate_JUnitGenerator.ump"
   public void writeFile(){
    // TODO Auto-generated method stub


	File file = new File(path);
	String filename = (testModel.getFile().substring(0,testModel.getFile().length()-4))+"Test.java";
		
	System.out.print(file.getAbsolutePath());
	System.out.print("\n");
	file.mkdirs();

				try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(new File(file.getAbsolutePath(),filename)));
				bw.write(juG.getCode(testModel));
				System.out.println(juG.getCode(testModel));
				bw.flush();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }

  // line 92 "../../../../ump/TestCaseTemplate_JUnitGenerator.ump"
   public static  void main(String [] argv){
    Thread.currentThread().setUncaughtExceptionHandler(new UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new UmpleExceptionHandler());
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "grammarFile" + ":" + getGrammarFile()+ "," +
            "path" + ":" + getPath()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "juG" + "=" + (getJuG() != null ? !getJuG().equals(this)  ? getJuG().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "parser" + "=" + (getParser() != null ? !getParser().equals(this)  ? getParser().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "testModel" + "=" + (getTestModel() != null ? !getTestModel().equals(this)  ? getTestModel().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "testModelFile" + "=" + (getTestModelFile() != null ? !getTestModelFile().equals(this)  ? getTestModelFile().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "code" + "=" + (getCode() != null ? !getCode().equals(this)  ? getCode().toString().replaceAll("  ","    ") : "this" : "null");
  }
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
    public UmpleSourceData TestCaseJUnitGenerator_setCredential(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_JUnitGenerator.ump").setUmpleLines(31).setJavaLines(154).setLengths(1);}
    public UmpleSourceData TestCaseJUnitGenerator_prepare(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_JUnitGenerator.ump").setUmpleLines(37).setJavaLines(161).setLengths(6);}
    public UmpleSourceData TestCaseJUnitGenerator_setModel(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_JUnitGenerator.ump").setUmpleLines(25).setJavaLines(146).setLengths(2);}
    public UmpleSourceData TestCaseJUnitGenerator_main(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_JUnitGenerator.ump").setUmpleLines(91).setJavaLines(215).setLengths(1);}
    public UmpleSourceData TestCaseJUnitGenerator_generate(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_JUnitGenerator.ump").setUmpleLines(48).setJavaLines(173).setLengths(7);}
    public UmpleSourceData TestCaseJUnitGenerator_writeFile(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_JUnitGenerator.ump","TestCaseTemplate_JUnitGenerator.ump").setUmpleLines(61, 65).setJavaLines(186, 191).setLengths(1, 20);}
    public UmpleSourceData TestCasePhpUnitGenerator_setCredential(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_PhpUnitGenerator.ump").setUmpleLines(26).setJavaLines(154).setLengths(1);}
    public UmpleSourceData TestCasePhpUnitGenerator_prepare(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_PhpUnitGenerator.ump").setUmpleLines(32).setJavaLines(161).setLengths(6);}
    public UmpleSourceData TestCasePhpUnitGenerator_setModel(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_PhpUnitGenerator.ump").setUmpleLines(20).setJavaLines(146).setLengths(2);}
    public UmpleSourceData TestCasePhpUnitGenerator_generate(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_PhpUnitGenerator.ump").setUmpleLines(43).setJavaLines(173).setLengths(8);}
    public UmpleSourceData TestCasePhpUnitGenerator_writeFile(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_PhpUnitGenerator.ump","TestCaseTemplate_PhpUnitGenerator.ump").setUmpleLines(55, 77).setJavaLines(185, 208).setLengths(17, 1);}
    public UmpleSourceData TestCaseRubyUnitGenerator_setCredential(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_RubyUnitGenerator.ump").setUmpleLines(27).setJavaLines(154).setLengths(1);}
    public UmpleSourceData TestCaseRubyUnitGenerator_prepare(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_RubyUnitGenerator.ump").setUmpleLines(33).setJavaLines(161).setLengths(6);}
    public UmpleSourceData TestCaseRubyUnitGenerator_setModel(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_RubyUnitGenerator.ump").setUmpleLines(21).setJavaLines(146).setLengths(2);}
    public UmpleSourceData TestCaseRubyUnitGenerator_generate(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_RubyUnitGenerator.ump").setUmpleLines(44).setJavaLines(173).setLengths(8);}
    public UmpleSourceData TestCaseRubyUnitGenerator_writeFile(){ return new UmpleSourceData().setFileNames("TestCaseTemplate_RubyUnitGenerator.ump","TestCaseTemplate_RubyUnitGenerator.ump").setUmpleLines(56, 78).setJavaLines(185, 208).setLengths(17, 1);}
    public UmpleSourceData TestGeneratorConsoleMain_main(){ return new UmpleSourceData().setFileNames("TestGeneratorConsoleMain.ump").setUmpleLines(14).setJavaLines(34).setLengths(98);}
    public UmpleSourceData Util__createSpacesString(){ return new UmpleSourceData().setFileNames("Utility_TestRunnerTemplate_JUnit.ump").setUmpleLines(5).setJavaLines(236).setLengths(6);}
    public UmpleSourceData Util_getTestRunnerTemplateRubyUnitCode(){ return new UmpleSourceData().setFileNames("Utility_TestRunnerTemplate_RubyUnit.ump").setUmpleLines(4).setJavaLines(302).setLengths(2);}
    public UmpleSourceData Util_writeTestRunnerFiles(){ return new UmpleSourceData().setFileNames("Utility.ump").setUmpleLines(48).setJavaLines(101).setLengths(6);}
    public UmpleSourceData Util_getTestRunnerTemplateJUnitCode(){ return new UmpleSourceData().setFileNames("Utility_TestRunnerTemplate_JUnit.ump").setUmpleLines(5).setJavaLines(278).setLengths(2);}
    public UmpleSourceData Util__getTestRunnerTemplateRubyUnitCode(){ return new UmpleSourceData().setFileNames("Utility_TestRunnerTemplate_RubyUnit.ump").setUmpleLines(4).setJavaLines(283).setLengths(16);}
    public UmpleSourceData Util_assertMethod(){ return new UmpleSourceData().setFileNames("Utility.ump").setUmpleLines(119).setJavaLines(117).setLengths(8);}
    public UmpleSourceData Util__getTestRunnerTemplateJUnitCode(){ return new UmpleSourceData().setFileNames("Utility_TestRunnerTemplate_JUnit.ump").setUmpleLines(5).setJavaLines(245).setLengths(30);}
    public UmpleSourceData Util_randomGenerator(){ return new UmpleSourceData().setFileNames("Utility.ump","Utility.ump").setUmpleLines(25, 38).setJavaLines(72, 88).setLengths(6, 3);}
    public UmpleSourceData Util_getTestRunnerTemplatePhpUnitCode(){ return new UmpleSourceData().setFileNames("Utility_TestRunnerTemplate_PhpUnit.ump").setUmpleLines(4).setJavaLines(326).setLengths(2);}
    public UmpleSourceData Util_createUmpleTestSystem(){ return new UmpleSourceData().setFileNames("Utility.ump").setUmpleLines(132).setJavaLines(129).setLengths(103);}
    public UmpleSourceData Util__getTestRunnerTemplatePhpUnitCode(){ return new UmpleSourceData().setFileNames("Utility_TestRunnerTemplate_PhpUnit.ump").setUmpleLines(4).setJavaLines(307).setLengths(16);}
    public UmpleSourceData TestParser_analyzeGenerate(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(312).setJavaLines(542).setLengths(3);}
    public UmpleSourceData TestParser_prepare(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(1033).setJavaLines(1256).setLengths(6);}
    public UmpleSourceData TestParser_analyzeAssertCode(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(320).setJavaLines(549).setLengths(44);}
    public UmpleSourceData TestParser_analyzeModel(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(965).setJavaLines(1188).setLengths(3);}
    public UmpleSourceData TestParser_analyzeParameter(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(936).setJavaLines(1158).setLengths(1);}
    public UmpleSourceData TestParser_analyzeTestInitAttributeMethodCall(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(726).setJavaLines(951).setLengths(101);}
    public UmpleSourceData TestParser_analyzeInitMethodCall(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(830).setJavaLines(1056).setLengths(67);}
    public UmpleSourceData TestParser_analyzeMethodCall(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump","mbt_parser_src.ump").setUmpleLines(367, 593).setJavaLines(597, 819).setLengths(103, 91);}
    public UmpleSourceData TestParser_analyzeAttInitialization(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(1009).setJavaLines(1231).setLengths(1);}
    public UmpleSourceData TestParser_analyzeAssertFalse(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(294).setJavaLines(524).setLengths(5);}
    public UmpleSourceData TestParser_analyzeAction(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(108).setJavaLines(337).setLengths(25);}
    public UmpleSourceData TestParser_analyzeTestParameter(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(903).setJavaLines(1127).setLengths(14);}
    public UmpleSourceData TestParser_analyzeAssertions(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(474).setJavaLines(704).setLengths(14);}
    public UmpleSourceData TestParser_analyzeThen(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(921).setJavaLines(1145).setLengths(9);}
    public UmpleSourceData TestParser_analyzeObjectInitialization(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(999).setJavaLines(1221).setLengths(1);}
    public UmpleSourceData TestParser_analyzeToken(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(1015).setJavaLines(1236).setLengths(1);}
    public UmpleSourceData TestParser_analyzeTestCase(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(494).setJavaLines(722).setLengths(93);}
    public UmpleSourceData TestParser_analyzeGivenModel(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(955).setJavaLines(1178).setLengths(1);}
    public UmpleSourceData TestParser_analyzeAllTokens(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(32).setJavaLines(262).setLengths(59);}
    public UmpleSourceData TestParser_init(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(28).setJavaLines(257).setLengths(1);}
    public UmpleSourceData TestParser_analyzeAssertTrue(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(302).setJavaLines(533).setLengths(5);}
    public UmpleSourceData TestParser_analyzeInit(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump","mbt_parser_src.ump").setUmpleLines(688, 975).setJavaLines(914, 1199).setLengths(33, 18);}
    public UmpleSourceData TestParser_analyzeGiven(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(960).setJavaLines(1183).setLengths(1);}
    public UmpleSourceData TestParser_analyzeDepend(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(1019).setJavaLines(1241).setLengths(11);}
    public UmpleSourceData TestParser_analyzeAssertEqual(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(96).setJavaLines(325).setLengths(8);}
    public UmpleSourceData TestParser_analyzeAssertEqualCode(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(168).setJavaLines(398).setLengths(122);}
    public UmpleSourceData TestParser_analyzeAttWithMethodInitialization(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(1004).setJavaLines(1226).setLengths(1);}
    public UmpleSourceData TestParser_analyzeWhen(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(940).setJavaLines(1163).setLengths(11);}
    public UmpleSourceData TestParser_analyzeTestInitAttribute(){ return new UmpleSourceData().setFileNames("mbt_parser_src.ump").setUmpleLines(136).setJavaLines(366).setLengths(28);}

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