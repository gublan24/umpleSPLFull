/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.analysis.AnalyzerGeneratorHandler;
import cruise.umple.parser.analysis.Analyzer;
import java.lang.reflect.*;
import java.lang.IllegalStateException;

/**
 * This is the AnalyzerGeneratorHandler for the Umple language
 * 
 * This handler constructs Analyzers by name by using reflection
 * in the `cruise.umple.analysis` namespace
 */
// line 110 "../../../../src/UmpleInternalParser_CodeParserHandlers.ump"
public class UmpleAnalyzerGeneratorHandler implements AnalyzerGeneratorHandler
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleAnalyzerGeneratorHandler()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 119 "../../../../src/UmpleInternalParser_CodeParserHandlers.ump"
   public Analyzer generateFromName(String name){
    try{
      String className = "cruise.umple.analysis."+name.substring(0,1).toUpperCase()+name.substring(1)+"Analyzer";
      Class cls = Class.forName(className);
      Analyzer a = (Analyzer) cls.newInstance();
      a.setName(name);
      return a;
    }
    catch(ClassNotFoundException e){
      return null;
    }
    catch(InstantiationException | IllegalAccessException | IllegalArgumentException  e){
      throw new IllegalStateException("Error instantiating class " + name + ": " + e.getMessage());
    }
  }

}