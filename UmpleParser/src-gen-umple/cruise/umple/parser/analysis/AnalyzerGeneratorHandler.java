/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/
package cruise.umple.parser.analysis;
/**
 * This is a handler/delegate class that handles construction of Analyzer classes
 * at runtime. 
 * 
 * Override this class in order to construct Analyzer objects by name, where
 * necessary.
 */
// line 75 "../../../../../src/GrammarParsing.ump"
public interface AnalyzerGeneratorHandler
{
  
  public Analyzer generateFromName( String name ) ;

}