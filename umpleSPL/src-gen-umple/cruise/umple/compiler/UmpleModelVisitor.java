/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * It is designed to visit different types of umple elemnts so it can process and understand
 * the defined walkers (@see IWalker). Any umple IWalker can use this visitor in order to ensure 
 * that the given visitor will be able to interact with the contents in temrs of being Umple-related
 */
// line 55 "../../../../src/Generator_UmpleModelWalker.ump"
public class UmpleModelVisitor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleModelVisitor()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 56 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(UmpleModel umpleModel){
    
  }


  /**
   * Comment
   */
  // line 59 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Comment comment){
    
  }


  /**
   * Umple Classifiers
   */
  // line 62 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(UmpleElement umpleElement){
    
  }

  // line 63 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(UmpleClassifier umpleClassifier){
    
  }

  // line 64 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(UmpleClass umpleClass){
    
  }

  // line 65 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(UmpleInterface umpleInterface){
    
  }


  /**
   * Dependency
   */
  // line 68 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Depend dependE){
    
  }

  // line 69 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Package pkg){
    
  }

  // line 70 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(ClassPattern ptrn){
    
  }

  // line 71 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Hierarchy hier){
    
  }


  /**
   * Attributes
   */
  // line 74 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Constant cnst){
    
  }

  // line 75 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Attribute attribute){
    
  }

  // line 76 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Key keyO){
    
  }

  // line 77 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(ConstraintVariable cnstVar){
    
  }

  // line 78 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(UmpleVariable var){
    
  }

  // line 79 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(UniqueIdentifier uid){
    
  }


  /**
   * Methods
   */
  // line 82 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Method method){
    
  }

  // line 83 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(MethodParameter param){
    
  }

  // line 84 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(MethodBody methodBody){
    
  }


  /**
   * Logical
   */
  // line 87 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Condition cond){
    
  }

  // line 88 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Precondition pre){
    
  }

  // line 89 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(ConstraintTree constraint){
    
  }


  /**
   * Aspect
   */
  // line 92 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(CodeInjection codeInjection){
    
  }


  /**
   * Association
   */
  // line 95 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Association associationE){
    
  }

  // line 96 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(AssociationClass associationC){
    
  }

  // line 97 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(AssociationEnd associationE){
    
  }

  // line 98 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(AssociationVariable var){
    
  }


  /**
   * Statemachine
   */
  // line 101 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(StateMachine sm){
    
  }

  // line 102 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(State state){
    
  }

  // line 103 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Guard guard){
    
  }

  // line 104 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Action action){
    
  }

  // line 105 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Event event){
    
  }

  // line 106 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Transition transition){
    
  }

  // line 107 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(Activity activity){
    
  }


  /**
   * Trace
   */
  // line 110 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(TracerDirective tracer){
    
  }

  // line 111 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(TraceDirective traceDirective){
    
  }

  // line 112 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(TraceItem traceItem){
    
  }

  // line 113 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(TraceRecord traceRecord){
    
  }

  // line 114 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(AttributeTraceItem attributeT){
    
  }

  // line 115 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(TraceCase traceCase){
    
  }

  // line 116 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(TraceCondition traceCondition){
    
  }

  // line 117 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(MethodTraceItem methodTraceEntity){
    
  }

  // line 118 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(StateMachineTraceItem stateMachineTraceItem){
    
  }


  /**
   * User Code
   */
  // line 122 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(CodeBlock block){
    
  }

  // line 123 "../../../../src/Generator_UmpleModelWalker.ump"
  public void visit(UserCode userCode){
    
  }


  /**
   * Visitor Events
   */
  // line 126 "../../../../src/Generator_UmpleModelWalker.ump"
  public void done(){
    
  }

}