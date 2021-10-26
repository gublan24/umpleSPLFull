/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.List;
import cruise.umple.parser.Token;

/**
 * Walk through definition tree while analyzing template tokens
 */
// line 761 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
// line 126 "../../../../src/Mixset_refactored.ump"
public class TemplateDefinitionWalker implements IWalker
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TemplateDefinitionWalker Attributes
  private UmpleInternalParser parser;
  private Token rootToken;
  private int rootAnalysisStep;
  private TemplateTokenAnalyzer templateAnalyzer;
  private boolean reAnalyze;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TemplateDefinitionWalker(UmpleInternalParser aParser)
  {
    parser = aParser;
    reAnalyze = false;
    // line 772 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
    templateAnalyzer = new TemplateTokenAnalyzer(parser);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setParser(UmpleInternalParser aParser)
  {
    boolean wasSet = false;
    parser = aParser;
    wasSet = true;
    return wasSet;
  }

  public boolean setRootToken(Token aRootToken)
  {
    boolean wasSet = false;
    rootToken = aRootToken;
    wasSet = true;
    return wasSet;
  }

  public boolean setRootAnalysisStep(int aRootAnalysisStep)
  {
    boolean wasSet = false;
    rootAnalysisStep = aRootAnalysisStep;
    wasSet = true;
    return wasSet;
  }

  public boolean setReAnalyze(boolean aReAnalyze)
  {
    boolean wasSet = false;
    reAnalyze = aReAnalyze;
    wasSet = true;
    return wasSet;
  }

  public UmpleInternalParser getParser()
  {
    return parser;
  }

  public Token getRootToken()
  {
    return rootToken;
  }

  public int getRootAnalysisStep()
  {
    return rootAnalysisStep;
  }

  public boolean getReAnalyze()
  {
    return reAnalyze;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isReAnalyze()
  {
    return reAnalyze;
  }

  public void delete()
  {}

  // line 776 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public void accept(TemplateTokenAnalyzer analyzer){
    if (rootToken.is("classDefinition")) {  // aka "templateDefinition"
    		analyzer.prepare(rootToken);
    		analyzer.analyze(rootToken);
    	}
    	analyzeSubTokens(rootToken, analyzer);
  }

  // line 784 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public void done(){
    templateAnalyzer.done();
  }

  // line 788 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
   private void analyzeToken(Token aToken, TemplateTokenAnalyzer analyzer, int analysisStep){
    if (analysisStep != 2) {
    		parser.reAnalyze(parser.reAnalyze() || (analysisStep == 1));
	      	return;
	  	}
    	if (aToken.is("templateAttributeDefinition")) {
        
processInlineMixset(aToken);
Label_Mixset_157: ;

    		analyzer.analyzeEmission(aToken);
    	} else if (aToken.is("emitMethod")) {
        	analyzer.analyzeEmitMethodDeclarator(aToken);
      	}
  }

  // line 802 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
   private void analyzeSubTokens(Token aToken, TemplateTokenAnalyzer analyzer){
    //    	reAnalyze = true;
//    	parser.reAnalyze(true);
//    	do {
//    		analysisStep+= 1;
//      		reAnalyze = false;
//      		parser.reAnalyze(false);
      		for(Token subToken : aToken.getSubTokens()) {
      			analyzeToken(subToken,analyzer,rootAnalysisStep);
      			if (!parser.getParseResult().getWasSuccess()) {
      				return;
      			}
      		}
//    	} while (reAnalyze);
  }

  // line 818 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public void analyze(Token mainToken, int rootAnalysisStep){
    setRootToken(mainToken);
    	setRootAnalysisStep(rootAnalysisStep);
    	accept(templateAnalyzer);
  }


  /**
   * User can define their own walker that receives an UmpleModelVisitor to visit a given element contents
   */
  @Override
  public void accept(UmpleModelVisitor visitor){
          return ;
  }


  public String toString()
  {
    return super.toString() + "["+
            "rootAnalysisStep" + ":" + getRootAnalysisStep()+ "," +
            "reAnalyze" + ":" + getReAnalyze()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parser" + "=" + (getParser() != null ? !getParser().equals(this)  ? getParser().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rootToken" + "=" + (getRootToken() != null ? !getRootToken().equals(this)  ? getRootToken().toString().replaceAll("  ","    ") : "this" : "null");
  }
}