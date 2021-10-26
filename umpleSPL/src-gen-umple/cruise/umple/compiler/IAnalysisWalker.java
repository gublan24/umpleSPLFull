/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/
package cruise.umple.compiler;
/**
 * Walk through template tree while analyzing template tokens
 * Walk through template tree while analyzing template tokens
 */
// line 1343 "../../../../src/UmpleInternalParser_CodeStructure.ump"
// line 756 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
public interface IAnalysisWalker
{
  
  // ABSTRACT METHODS 

 public void accept(CompositeStructureTokenAnalyzer analyzer);
 public void accept(TemplateTokenAnalyzer analyzer);
}