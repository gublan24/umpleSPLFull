/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * McCabe = Edges - Nodes + 2 * ExitNodes
 * McCabe = Edges - Nodes + ExitNodes
 * McCabe = Number of logical points + 1
 * @see LLOCMetricVisitor
 */
// line 376 "../../../../src/Generator_CodeAnalysis.ump"
public class McCabeMetricVisitor extends UmpleModelVisitor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //McCabeMetricVisitor Attributes
  private HtmlDocument doc;
  private int total_conditions;
  private int total_iteration;
  private int cur_conditions;
  private int cur_iterations;
  private String cur_clazz;
  private TableElement tbl;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public McCabeMetricVisitor(HtmlDocument aDoc)
  {
    super();
    doc = aDoc;
    total_conditions = 0;
    total_iteration = 0;
    cur_conditions = 0;
    cur_iterations = 0;
    cur_clazz = null;
    tbl = null;
    // line 390 "../../../../src/Generator_CodeAnalysis.ump"
    doc.createParagraphElement("McCabe Metrics", false);
    		tbl = doc.createTable(4);
    		tbl.setBorder(1);
    		tbl.setTitles(new String[] {"Class Name","#Conditions","#Iterations","Cyclomatic Complexity"});
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDoc(HtmlDocument aDoc)
  {
    boolean wasSet = false;
    doc = aDoc;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotal_conditions(int aTotal_conditions)
  {
    boolean wasSet = false;
    total_conditions = aTotal_conditions;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotal_iteration(int aTotal_iteration)
  {
    boolean wasSet = false;
    total_iteration = aTotal_iteration;
    wasSet = true;
    return wasSet;
  }

  public boolean setCur_conditions(int aCur_conditions)
  {
    boolean wasSet = false;
    cur_conditions = aCur_conditions;
    wasSet = true;
    return wasSet;
  }

  public boolean setCur_iterations(int aCur_iterations)
  {
    boolean wasSet = false;
    cur_iterations = aCur_iterations;
    wasSet = true;
    return wasSet;
  }

  public boolean setCur_clazz(String aCur_clazz)
  {
    boolean wasSet = false;
    cur_clazz = aCur_clazz;
    wasSet = true;
    return wasSet;
  }

  public boolean setTbl(TableElement aTbl)
  {
    boolean wasSet = false;
    tbl = aTbl;
    wasSet = true;
    return wasSet;
  }

  public HtmlDocument getDoc()
  {
    return doc;
  }

  public int getTotal_conditions()
  {
    return total_conditions;
  }

  public int getTotal_iteration()
  {
    return total_iteration;
  }

  public int getCur_conditions()
  {
    return cur_conditions;
  }

  public int getCur_iterations()
  {
    return cur_iterations;
  }

  public String getCur_clazz()
  {
    return cur_clazz;
  }

  public TableElement getTbl()
  {
    return tbl;
  }

  public void delete()
  {
    super.delete();
  }

  // line 397 "../../../../src/Generator_CodeAnalysis.ump"
  public void done(){
    addTableEntry(null);
		int mcabe = total_conditions + total_iteration + 1;
		tbl.addRow(new String [] {"Total",String.valueOf(total_conditions),String.valueOf(total_iteration),String.valueOf(mcabe)});
  }

  // line 403 "../../../../src/Generator_CodeAnalysis.ump"
  public void addTableEntry(UmpleElement element){
    if(cur_clazz != null) {
			int mcabe = cur_conditions + cur_iterations + 1;
			tbl.addRow(new String [] {cur_clazz,String.valueOf(cur_conditions),String.valueOf(cur_iterations),String.valueOf(mcabe)});
			total_conditions+= cur_conditions;
			total_iteration+= cur_iterations;
		}
		cur_clazz = element!= null ? element.getName() : "";
		cur_conditions = 0; 
		cur_iterations = 0;
  }


  /**
   * Umple Classifiers
   */
  // line 416 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(UmpleClass umpleClass){
    addTableEntry(umpleClass);
  }

  // line 419 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(UmpleInterface umpleInterface){
    addTableEntry(umpleInterface);
  }

  // line 422 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(AssociationClass associationC){
    addTableEntry(associationC);
  }


  /**
   * Attributes
   */
  // line 427 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Attribute attribute){
    if(attribute.isIsDerived()) {
			cur_conditions++;			
		}
  }

  // line 432 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Key keyO){
    cur_conditions++;
  }

  // line 435 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(ConstraintVariable cnstVar){
    cur_conditions++;
  }

  // line 438 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(UniqueIdentifier uid){
    cur_conditions++;
  }


  /**
   * Logical
   */
  // line 443 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Condition cond){
    cur_conditions++;
  }

  // line 446 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Precondition pre){
    cur_conditions++;
  }

  // line 449 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(ConstraintTree constraint){
    cur_conditions++;
  }


  /**
   * Aspect
   */
  // line 454 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(CodeInjection codeInjection){
    cur_conditions++;
  }


  /**
   * Association
   */
  // line 459 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Association associationE){
    cur_conditions++;
  }


  /**
   * void visit(AssociationVariable var) {
   * cur_conditions++;
   * }
   * Statemachine
   */
  // line 467 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(StateMachine sm){
    cur_conditions++; // Default case
  }

  // line 470 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(State state){
    cur_conditions++; // Each state is a case statement
  }

  // line 473 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Event event){
    if(event.isIsTimer()) {
			cur_iterations++; // While statement			
		}
  }

  // line 478 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Guard guard){
    cur_conditions++;
  }

  // line 481 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Transition transition){
    State nextState = transition.getNextState();
		State fromState = transition.getFromState();
							
		StateMachine targetStateMachine = nextState.getStateMachine();
		StateMachine sourceStateMachine = fromState.getStateMachine();
		if(targetStateMachine!= sourceStateMachine){
			//Means that we are going to a different statemachine (another switch statement), so complexity is increased so increment by 2
			cur_conditions= cur_conditions+ 2;
		}else{
			State targetParentState = targetStateMachine.getParentState();
			State sourceParentState = sourceStateMachine.getParentState();
								
			//If the parent states are the same then we are at the same level, in that case, this means less complexity, thus only increment the
			//complexity by one; otherwise, this requires more thinking and therefore, the complexity will be increased by "2"
			//If targetParentState and sourceParentState are null, then this means that they are the root states, and also means
			//that they are at the same level, so the equality condition is ennough to catch this case
			if(targetParentState== sourceParentState){
				cur_conditions= cur_conditions+ 1;
			}else{
				cur_conditions= cur_conditions+ 2;
			}
		}
  }

  // line 505 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Activity activity){
    cur_iterations++; // Concurrent Iterative statement
  }


  /**
   * Trace
   */
  // line 510 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(AttributeTraceItem attributeT){
    //		if(attributeT.isConditionallyWhere()) {
//			cur_conditions++;
//		}
		if(attributeT.getPeriodClause() != null && attributeT.getPeriodClause().length() > 0) {
			cur_iterations++;
		}
		if(attributeT.getDuringClause() != null && attributeT.getDuringClause().length() > 0) {
			cur_iterations++;
		}
  }

  // line 521 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(TraceCase traceCase){
    cur_conditions++;
  }

  // line 524 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(TraceCondition traceCondition){
    cur_conditions++;
  }


  public String toString()
  {
    return super.toString() + "["+
            "total_conditions" + ":" + getTotal_conditions()+ "," +
            "total_iteration" + ":" + getTotal_iteration()+ "," +
            "cur_conditions" + ":" + getCur_conditions()+ "," +
            "cur_iterations" + ":" + getCur_iterations()+ "," +
            "cur_clazz" + ":" + getCur_clazz()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "doc" + "=" + (getDoc() != null ? !getDoc().equals(this)  ? getDoc().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "tbl" + "=" + (getTbl() != null ? !getTbl().equals(this)  ? getTbl().toString().replaceAll("  ","    ") : "this" : "null");
  }
}