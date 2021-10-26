/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.List;
import cruise.umple.parser.Token;

/**
 * Walk through definition tree while analyzing template tokens
 */
// line 1348 "../../../../src/UmpleInternalParser_CodeStructure.ump"
public class CompositeStructureDefinitionWalker implements IWalker
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CompositeStructureDefinitionWalker Attributes
  private UmpleInternalParser parser;
  private Token rootToken;
  private int rootAnalysisStep;
  private CompositeStructureTokenAnalyzer compAnalyzer;
  private boolean reAnalyze;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CompositeStructureDefinitionWalker(UmpleInternalParser aParser)
  {
    parser = aParser;
    reAnalyze = false;
    // line 1359 "../../../../src/UmpleInternalParser_CodeStructure.ump"
    compAnalyzer = new CompositeStructureTokenAnalyzer(parser);
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

  // line 1363 "../../../../src/UmpleInternalParser_CodeStructure.ump"
  public void accept(CompositeStructureTokenAnalyzer analyzer){
    if (rootToken.is("classDefinition")) {
    		analyzer.prepare(rootToken);
    	}
    	analyzeSubTokens(rootToken, analyzer);
  }

  // line 1370 "../../../../src/UmpleInternalParser_CodeStructure.ump"
  public void done(){
    compAnalyzer.done();
  }

  // line 1374 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void analyzeToken(Token aToken, CompositeStructureTokenAnalyzer analyzer, int analysisStep){
    if (analysisStep != 2) {
    		parser.reAnalyze(parser.reAnalyze() || (analysisStep == 1));
	      	return;
	  	}
	  	if (aToken.is("portDefinition")) {
    		analyzer.analyzePortDefinition(aToken);
    	} else if (aToken.is("activeMethodDefinition")) {
    		analyzer.analyzeActiveMethodDefinition(aToken);
    	} else if (aToken.is("portBindingDefinition")) {
    		analyzer.analyzePortBindingDefinition(aToken);
    	}
  }

  // line 1388 "../../../../src/UmpleInternalParser_CodeStructure.ump"
   private void analyzeSubTokens(Token aToken, CompositeStructureTokenAnalyzer analyzer){
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

  // line 1404 "../../../../src/UmpleInternalParser_CodeStructure.ump"
  public void analyze(Token mainToken, int rootAnalysisStep){
    setRootToken(mainToken);
    	setRootAnalysisStep(rootAnalysisStep);
    	accept(compAnalyzer);
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