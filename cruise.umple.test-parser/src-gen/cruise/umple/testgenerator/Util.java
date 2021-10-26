/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.testgenerator;
import java.util.Random;
import java.lang.reflect.Method;
import cruise.umple.testparser.TestParser;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;

// line 3 "../../../../ump/Utility_TestRunnerTemplate_JUnit.ump"
// line 3 "../../../../ump/Utility_TestRunnerTemplate_RubyUnit.ump"
// line 3 "../../../../ump/Utility_TestRunnerTemplate_PhpUnit.ump"
// line 7 "../../../../ump/Utility.ump"
public class Util
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = " " + NL + "  import java.io.File;" + NL + "  import org.junit.After;" + NL + "  import org.junit.Assert;" + NL + "  import org.junit.Before;" + NL + "  import org.junit.Test;" + NL + "  import org.junit.internal.TextListener;" + NL + "  import org.junit.runner.JUnitCore;" + NL + "  import org.junit.runner.Result;  " + NL + "    " + NL + "    public class TestRunner {" + NL + "    " + NL + "     public static void main (String[] args)" + NL + "     JUnitCore  junit = new JUnitCore();" + NL + "     junit.addListener(new TextListener(System.out));" + NL + "     Result result = junit.run(";
  public static final String TEXT_1 = ");" + NL + "     " + NL + "     resultReport(result);" + NL + "    }" + NL + "    " + NL + "    public static void resultReport(Result result) {" + NL + "        System.out.println(\"Finished. Result: Failures: \" +" + NL + "          result.getFailureCount() + \". Ignored: \" +" + NL + "          result.getIgnoreCount() + \". Tests run: \" +" + NL + "          result.getRunCount() + \". Time: \" +" + NL + "          result.getRunTime() + \"ms.\");" + NL + "    }" + NL + "    " + NL + "    }" + NL + "  ";
  public static final String TEXT_2 = " //to be implemented  ";
  public static final String TEXT_3 = " //to be implemented  ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Util Attributes
  private Random random;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Util()
  {
    random = new Random ();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRandom(Random aRandom)
  {
    boolean wasSet = false;
    random = aRandom;
    wasSet = true;
    return wasSet;
  }

  public Random getRandom()
  {
    return random;
  }

  public void delete()
  {}


  /**
   * ------------------------
   * Random String Generator
   * ------------------------
   */
  // line 26 "../../../../ump/Utility.ump"
   public String randomGenerator(Random random, String characters, int length){
    char[] text = new char[length];
    for (int i = 0; i < length; i++)
    {
        text[i] = characters.charAt(random.nextInt(characters.length()));
    }
    return new String(text);
  }


  /**
   * ------------------------
   * Random Int Generator
   * ------------------------
   */
  // line 39 "../../../../ump/Utility.ump"
   public int randomGenerator(int range){
    int text = random.nextInt(range);
	  	
	return text;
  }


  /**
   * -----------------------------
   * Test Runner Template/Methods
   * -----------------------------
   */
  // line 49 "../../../../ump/Utility.ump"
   public void writeTestRunnerFiles(String path, List<String> classes){
    String testrunnerFileName = "TestRunner";
	  File file  = new File(path+testrunnerFileName);
	  StringBuilder br = new StringBuilder();
	  StringBuilder sb = new StringBuilder();
	  sb .append("");
	  sb.append(getTestRunnerTemplateJUnitCode (classes));
  }


  /**
   * ---------------------------------------------------
   * AssertMethod // check if a method is present in a class using reflection, example: assertMethod(foo.class, "methodName")
   * ---------------------------------------------------
   */
  // line 120 "../../../../ump/Utility.ump"
   public Boolean assertMethod(Class cls, String methodName){
    Boolean hasMethod = false;
    	Method[] methods = cls.getMethods();
    	for (Method m : methods )
    	{
    		if ( m.getName() == methodName)
    		{ hasMethod = true; }
    	}
    	return hasMethod;
  }

  // line 133 "../../../../ump/Utility.ump"
   public TestModel createUmpleTestSystem(String path, String filename, String lang){
    String language =lang;   
    //path = "/cruise.umple.test-parser/src-gen/cruise/umple/testgenerator/";
    //filename = "ATest.umpt";
     File file = new File(path+filename);
     String grName = "";
     //grName = "src/ump/mbt_parsing.grammar";
     //grName = Util.class.getClassLoader().getResource("src/mbt_parsing.grammar").getFile();
     //System.out.println(grName);
     TestModel aTestModel = new TestModel(null, null, null, null, null,null, null, language);
     TestParser parser = new TestParser(null, grName, file, 0);     
     //System.out.println(file.getAbsolutePath());
     //System.out.println(Util.class.getClassLoader().getResource("mbt_parsing.grammar"));
     parser.setGrammarFile("src/ump/mbt_parsing.grammar");
     
     
     ///
     
     InputStream is = getClass().getResourceAsStream("mbt_parsing.grammar");
     InputStreamReader isr = new InputStreamReader(is);
     
     File grFile = new File("grammar");
     String grFileName = "grammar.grammar";
     grFile.mkdir();
     
     BufferedReader br = new BufferedReader(isr);
     
     
     StringBuffer sb = new StringBuffer();
     String line;
     try {
		while ((line = br.readLine()) != null) 
		 {
		   sb.append(line+"\n");
		 }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     try {
    	 BufferedWriter bw = new BufferedWriter(new FileWriter(new File(grFile.getAbsoluteFile(),grFileName)));   	
    	 bw.write(sb.toString());
    	 bw.flush();
    	 bw.close();
		br.close();
		 isr.close();
	     is.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     
     //System.out.println(sb.toString());
    
     //return sb.toString();
     
     /////////
     
     
     
     parser.setGrammarFile("grammar/grammar.grammar");
     parser.setTestModelFile(file);
     parser.prepare();
     
     //deleting temp written files
     String[]entries = grFile.list();
     for(String s: entries){
         File currentFile = new File(grFile.getPath(),s);
         currentFile.delete();
     }
     
     grFile.delete();
     
     /// end of deleting temp files
     
     
     
     aTestModel = parser.getATestModel();
     aTestModel.setCodeLang(language);
     if(aTestModel.getCodeLang().equals("JUnit"))
     {
     
     TestCaseJUnitGenerator junitGenerator = new TestCaseJUnitGenerator(null, null, null, null, null);
	     junitGenerator.setTestModel(aTestModel);
	     junitGenerator.setPath(path);
	     junitGenerator.writeFile();
     }
     if(aTestModel.getCodeLang().equals("PhpUnit"))
     {
     	TestCasePhpUnitGenerator phpGenerator = new TestCasePhpUnitGenerator(null, null, null, null, null); 
         phpGenerator.setTestModel(aTestModel);
         phpGenerator.setPath(path);
         phpGenerator.writeFile();
   }
     if(aTestModel.getCodeLang().equals("RubyUnit"))
     {
     	TestCaseRubyUnitGenerator rubyGenerator = new TestCaseRubyUnitGenerator(null, null, null, null, null); 
         rubyGenerator.setTestModel(aTestModel);
         rubyGenerator.setPath(path);
         rubyGenerator.writeFile();
     }
     
     return aTestModel;
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _getTestRunnerTemplateJUnitCode(Integer numSpaces, StringBuilder sb, List<String> classes){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
     
   String classesCode = "";
   
   for (int x = 0; x < classes.size(); x++)
   {
      if (x == 0)
       {classesCode+= classes.get(x)+".class";}
       else 
       {classesCode+=", " +classes.get(x)+".class";}   
   }
   
   
    realSb.append(TEXT_0);
    realSb.append(classesCode);
    realSb.append(TEXT_1);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getTestRunnerTemplateJUnitCode(List<String> classes){
        StringBuilder sb = new StringBuilder();
    return this._getTestRunnerTemplateJUnitCode(0,sb,classes).toString(); 
  }

  public StringBuilder _getTestRunnerTemplateRubyUnitCode(Integer numSpaces, StringBuilder sb, List<String> classes){
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

  public String getTestRunnerTemplateRubyUnitCode(List<String> classes){
        StringBuilder sb = new StringBuilder();
    return this._getTestRunnerTemplateRubyUnitCode(0,sb,classes).toString(); 
  }

  public StringBuilder _getTestRunnerTemplatePhpUnitCode(Integer numSpaces, StringBuilder sb, List<String> classes){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_3);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getTestRunnerTemplatePhpUnitCode(List<String> classes){
        StringBuilder sb = new StringBuilder();
    return this._getTestRunnerTemplatePhpUnitCode(0,sb,classes).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "random" + "=" + (getRandom() != null ? !getRandom().equals(this)  ? getRandom().toString().replaceAll("  ","    ") : "this" : "null");
  }
}