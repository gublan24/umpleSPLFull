/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/
package cruise.umple.compiler;
/**
 * Fragment source file: Generator.ump
 * Line : 53
 */
// line 47 "../../../../src/Generator.ump"
// line 37 "../../../../src/Trace_refactored.ump"
public interface CodeTranslator
{
  
  // ABSTRACT METHODS 

 public String translate(String id, Attribute attribute);
 public String translate(String id, AssociationVariable aVar);
 public String translate(String id, ConstraintTree constraint);
 public String translate(String id, ConstraintVariable cv);
 public String translate(String id, TraceItem traceItem);
}