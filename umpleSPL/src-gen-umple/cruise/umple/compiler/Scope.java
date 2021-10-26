/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Local variables
 */
// line 353 "../../../../src/Generator_CodeUmple.ump"
public class Scope
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Scope()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 356 "../../../../src/Generator_CodeUmple.ump"
  public int id = 0 ;
// line 357 "../../../../src/Generator_CodeUmple.ump"
  public double candidateRulesSatisfied = 0 ;
// line 358 "../../../../src/Generator_CodeUmple.ump"
  public StringBuilder candidateCode = new StringBuilder() ;
// line 359 "../../../../src/Generator_CodeUmple.ump"
  public double acceptedRulesSatisfied = 0 ;
// line 360 "../../../../src/Generator_CodeUmple.ump"
  public StringBuilder acceptedCode = this.candidateCode ;
// line 361 "../../../../src/Generator_CodeUmple.ump"
  public HashMap<String,Object> state = new HashMap<String,Object>() ;
// line 362 "../../../../src/Generator_CodeUmple.ump"
  public boolean isOptional = false ;
// line 363 "../../../../src/Generator_CodeUmple.ump"
  public boolean candidateFailed = false ;
// line 364 "../../../../src/Generator_CodeUmple.ump"
  public boolean acceptedFailed = true ;
// line 368 "../../../../src/Generator_CodeUmple.ump"
  public HashMap<String,Integer> candidateIterators ;
// line 369 "../../../../src/Generator_CodeUmple.ump"
  public HashMap<String,Integer> acceptedIterators ;

// line 371 "../../../../src/Generator_CodeUmple.ump"
  public Scope (int id, boolean isOptional) // scope for a grammar rule 
  {
    this.id = id;
      this.isOptional = isOptional;

      candidateIterators = new HashMap<String,Integer>();
      candidateIterators.put("Method", 0);
      candidateIterators.put("Parameter", 0);
      candidateIterators.put("Association", 0);
      candidateIterators.put("AssociationEnd", 0);
      candidateIterators.put("Attribute", 0);
      candidateIterators.put("Extends", 0);
      acceptedIterators = new HashMap<String, Integer>(candidateIterators);
  }

  
}