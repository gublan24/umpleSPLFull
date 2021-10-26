/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.ParseResult;
import cruise.umple.parser.Token;

// line 17 "../../../../src/UmpleXtextParser.ump"
// line 14 "../../../../src/UmpleXtextParser_Code.ump"
public class UmpleXtextParser implements UmpleParser
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleXtextParser Attributes
  private UmpleInternalParser temp;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleXtextParser()
  {
    temp = new UmpleInternalParser();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTemp(UmpleInternalParser aTemp)
  {
    boolean wasSet = false;
    temp = aTemp;
    wasSet = true;
    return wasSet;
  }

  /**
   * depend  java.io.*;
   * depend  org.eclipse.xtext.parser.*;
   * depend  org.eclipse.xtext.parser.antlr.*;
   * depend  com.google.inject.*;
   * depend cruise.umple.UmpleStandaloneSetup;
   */
  public UmpleInternalParser getTemp()
  {
    return temp;
  }

  public void delete()
  {}

  // line 18 "../../../../src/UmpleXtextParser_Code.ump"
   public String toGrammar(){
    return temp.toGrammar();
  }

  // line 23 "../../../../src/UmpleXtextParser_Code.ump"
   public ParseResult parse(String ruleName, String codeToParse){
    ParseResult tempResult = temp.parse(ruleName,codeToParse);
    return tempResult;
    	  	  
	  /*Injector injector = new
      UmpleStandaloneSetup().createInjectorAndDoEMFRegistration() ;
	  Reader inputStream = new StringReader(codeToParse);
	  IAntlrParser parser = injector.getInstance(IAntlrParser.class);
      IParseResult parseResult = parser.parse(inputStream);
      if (!parseResult.getParseErrors().isEmpty()) {
          // syntax errors occured - handle them properly
    	  return null;
      }
      else{
    	  boolean wasSuccess = parseResult.getParseErrors().size() == 0;
          ParseResult result = new ParseResult(wasSuccess);
          return result;   
      }*/
  }

  // line 45 "../../../../src/UmpleXtextParser_Code.ump"
   public ParseResult analyze(boolean shouldGenerateCode){
    return temp.analyze(shouldGenerateCode);
  }

  // line 50 "../../../../src/UmpleXtextParser_Code.ump"
   public Token getRootToken(){
    return temp.getRootToken();
  }

  // line 55 "../../../../src/UmpleXtextParser_Code.ump"
   public UmpleModel getModel(){
    return temp.getModel();
  }

  // line 60 "../../../../src/UmpleXtextParser_Code.ump"
   public boolean setModel(UmpleModel model){
    return temp.setModel(model);
  }

  // line 65 "../../../../src/UmpleXtextParser_Code.ump"
   public ParseResult getParseResult(){
    return temp.getParseResult();
  }

  // line 70 "../../../../src/UmpleXtextParser_Code.ump"
   public boolean setFilename(String filename){
    return temp.setFilename(filename);
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "temp" + "=" + (getTemp() != null ? !getTemp().equals(this)  ? getTemp().toString().replaceAll("  ","    ") : "this" : "null");
  }
}