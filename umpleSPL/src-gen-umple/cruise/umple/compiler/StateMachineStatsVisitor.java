/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.IOException;

/**
 * Used to extract the required metrics information for the statemachines of a given class. 
 * @see ClassStatsVisitor
 */
// line 612 "../../../../src/Generator_CodeAnalysis.ump"
public class StateMachineStatsVisitor extends UmpleModelVisitor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateMachineStatsVisitor Attributes
  private HtmlDocument doc;
  private int total_stateMachines;
  private int total_states;
  private int total_transitions;
  private int total_guards;
  private int total_events;
  private int total_actions;
  private int total_activities;
  private int cur_stateMachines;
  private int cur_states;
  private int cur_transitions;
  private int cur_guards;
  private int cur_events;
  private int cur_actions;
  private int cur_activities;
  private String cur_clazz;
  private TableElement tbl;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateMachineStatsVisitor(HtmlDocument aDoc)
  {
    super();
    doc = aDoc;
    total_stateMachines = 0;
    total_states = 0;
    total_transitions = 0;
    total_guards = 0;
    total_events = 0;
    total_actions = 0;
    total_activities = 0;
    cur_stateMachines = 0;
    cur_states = 0;
    cur_transitions = 0;
    cur_guards = 0;
    cur_events = 0;
    cur_actions = 0;
    cur_activities = 0;
    cur_clazz = null;
    tbl = null;
    // line 636 "../../../../src/Generator_CodeAnalysis.ump"
    doc.createParagraphElement("StateMachine Statistics", false);
    		tbl = doc.createTable(8);
    		tbl.setBorder(1);
    		tbl.setTitles(new String[] {"Class Name","#StateMachines","#States","#Transitions","#Guards","#Events","#Actions","#Activities"});
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

  public boolean setTotal_stateMachines(int aTotal_stateMachines)
  {
    boolean wasSet = false;
    total_stateMachines = aTotal_stateMachines;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotal_states(int aTotal_states)
  {
    boolean wasSet = false;
    total_states = aTotal_states;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotal_transitions(int aTotal_transitions)
  {
    boolean wasSet = false;
    total_transitions = aTotal_transitions;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotal_guards(int aTotal_guards)
  {
    boolean wasSet = false;
    total_guards = aTotal_guards;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotal_events(int aTotal_events)
  {
    boolean wasSet = false;
    total_events = aTotal_events;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotal_actions(int aTotal_actions)
  {
    boolean wasSet = false;
    total_actions = aTotal_actions;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotal_activities(int aTotal_activities)
  {
    boolean wasSet = false;
    total_activities = aTotal_activities;
    wasSet = true;
    return wasSet;
  }

  public boolean setCur_stateMachines(int aCur_stateMachines)
  {
    boolean wasSet = false;
    cur_stateMachines = aCur_stateMachines;
    wasSet = true;
    return wasSet;
  }

  public boolean setCur_states(int aCur_states)
  {
    boolean wasSet = false;
    cur_states = aCur_states;
    wasSet = true;
    return wasSet;
  }

  public boolean setCur_transitions(int aCur_transitions)
  {
    boolean wasSet = false;
    cur_transitions = aCur_transitions;
    wasSet = true;
    return wasSet;
  }

  public boolean setCur_guards(int aCur_guards)
  {
    boolean wasSet = false;
    cur_guards = aCur_guards;
    wasSet = true;
    return wasSet;
  }

  public boolean setCur_events(int aCur_events)
  {
    boolean wasSet = false;
    cur_events = aCur_events;
    wasSet = true;
    return wasSet;
  }

  public boolean setCur_actions(int aCur_actions)
  {
    boolean wasSet = false;
    cur_actions = aCur_actions;
    wasSet = true;
    return wasSet;
  }

  public boolean setCur_activities(int aCur_activities)
  {
    boolean wasSet = false;
    cur_activities = aCur_activities;
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

  public int getTotal_stateMachines()
  {
    return total_stateMachines;
  }

  public int getTotal_states()
  {
    return total_states;
  }

  public int getTotal_transitions()
  {
    return total_transitions;
  }

  public int getTotal_guards()
  {
    return total_guards;
  }

  public int getTotal_events()
  {
    return total_events;
  }

  public int getTotal_actions()
  {
    return total_actions;
  }

  public int getTotal_activities()
  {
    return total_activities;
  }

  public int getCur_stateMachines()
  {
    return cur_stateMachines;
  }

  public int getCur_states()
  {
    return cur_states;
  }

  public int getCur_transitions()
  {
    return cur_transitions;
  }

  public int getCur_guards()
  {
    return cur_guards;
  }

  public int getCur_events()
  {
    return cur_events;
  }

  public int getCur_actions()
  {
    return cur_actions;
  }

  public int getCur_activities()
  {
    return cur_activities;
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

  // line 643 "../../../../src/Generator_CodeAnalysis.ump"
  public void done(){
    addTableEntry(null);
		tbl.addRow(new String [] {"Total",String.valueOf(total_stateMachines),String.valueOf(total_states),String.valueOf(total_transitions),String.valueOf(total_guards),String.valueOf(total_events),String.valueOf(total_actions),String.valueOf(total_activities)});
  }

  // line 648 "../../../../src/Generator_CodeAnalysis.ump"
  public void addTableEntry(UmpleElement element){
    if(cur_clazz != null) {
			tbl.addRow(new String [] {cur_clazz,String.valueOf(cur_stateMachines),String.valueOf(cur_states),String.valueOf(cur_transitions),String.valueOf(cur_guards),String.valueOf(cur_events),String.valueOf(cur_actions),String.valueOf(cur_activities)});
			
			total_stateMachines+= cur_stateMachines;
    		total_states+= cur_states;
    		total_transitions+= cur_transitions;
    		total_guards+= cur_guards;
    		total_events+= cur_events;
    		total_actions+= cur_actions;
    		total_activities+= cur_activities;
		}
		cur_clazz = element!= null ? element.getName() : "";
		cur_stateMachines = 0;
    	cur_states = 0;
    	cur_guards = 0;
    	cur_transitions = 0;
    	cur_events = 0;
    	cur_actions = 0;
    	cur_activities = 0;
  }


  /**
   * Umple Classifiers
   */
  // line 671 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(UmpleClass umpleClass){
    addTableEntry(umpleClass);
  }

  // line 674 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(UmpleInterface umpleInterface){
    addTableEntry(umpleInterface);
  }

  // line 677 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(AssociationClass associationC){
    addTableEntry(associationC);
  }

  // line 681 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(StateMachine sm){
    cur_stateMachines++;
  }

  // line 684 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(State state){
    cur_states++;
  }

  // line 687 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Guard guard){
    cur_guards++;
  }

  // line 690 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Action action){
    cur_actions++;
  }

  // line 693 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Event event){
    cur_events++;
  }

  // line 696 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Transition transition){
    cur_transitions++;
  }

  // line 699 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Activity activity){
    cur_activities++;
  }


  public String toString()
  {
    return super.toString() + "["+
            "total_stateMachines" + ":" + getTotal_stateMachines()+ "," +
            "total_states" + ":" + getTotal_states()+ "," +
            "total_transitions" + ":" + getTotal_transitions()+ "," +
            "total_guards" + ":" + getTotal_guards()+ "," +
            "total_events" + ":" + getTotal_events()+ "," +
            "total_actions" + ":" + getTotal_actions()+ "," +
            "total_activities" + ":" + getTotal_activities()+ "," +
            "cur_stateMachines" + ":" + getCur_stateMachines()+ "," +
            "cur_states" + ":" + getCur_states()+ "," +
            "cur_transitions" + ":" + getCur_transitions()+ "," +
            "cur_guards" + ":" + getCur_guards()+ "," +
            "cur_events" + ":" + getCur_events()+ "," +
            "cur_actions" + ":" + getCur_actions()+ "," +
            "cur_activities" + ":" + getCur_activities()+ "," +
            "cur_clazz" + ":" + getCur_clazz()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "doc" + "=" + (getDoc() != null ? !getDoc().equals(this)  ? getDoc().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "tbl" + "=" + (getTbl() != null ? !getTbl().equals(this)  ? getTbl().toString().replaceAll("  ","    ") : "this" : "null");
  }
}