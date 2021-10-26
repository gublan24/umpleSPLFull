/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.IOException;

/**
 * LLOC metrics vistor. It walks through given root model in order to extract the required LLOC 
 * metrics information (@see IWalker) and have it represented in an analytical manner (@see IHtmlElement)
 */
// line 190 "../../../../src/Generator_CodeAnalysis.ump"
public class LLOCMetricVisitor extends UmpleModelVisitor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LLOCMetricVisitor Attributes
  private HtmlDocument doc;
  private int total_lloc;
  private int total_comments;
  private int cur_lloc;
  private int cur_comments;
  private String cur_clazz;
  private TableElement tbl;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public LLOCMetricVisitor(HtmlDocument aDoc)
  {
    super();
    doc = aDoc;
    total_lloc = 0;
    total_comments = 0;
    cur_lloc = 0;
    cur_comments = 0;
    cur_clazz = null;
    tbl = null;
    // line 203 "../../../../src/Generator_CodeAnalysis.ump"
    doc.createParagraphElement("LLOC Metrics", false);
    		tbl = doc.createTable(4);
    		tbl.setBorder(1);
    		tbl.setTitles(new String[] {"Class Name","LLOC","Comments","Total"});
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

  public boolean setTotal_lloc(int aTotal_lloc)
  {
    boolean wasSet = false;
    total_lloc = aTotal_lloc;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotal_comments(int aTotal_comments)
  {
    boolean wasSet = false;
    total_comments = aTotal_comments;
    wasSet = true;
    return wasSet;
  }

  public boolean setCur_lloc(int aCur_lloc)
  {
    boolean wasSet = false;
    cur_lloc = aCur_lloc;
    wasSet = true;
    return wasSet;
  }

  public boolean setCur_comments(int aCur_comments)
  {
    boolean wasSet = false;
    cur_comments = aCur_comments;
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

  public int getTotal_lloc()
  {
    return total_lloc;
  }

  public int getTotal_comments()
  {
    return total_comments;
  }

  public int getCur_lloc()
  {
    return cur_lloc;
  }

  public int getCur_comments()
  {
    return cur_comments;
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

  // line 210 "../../../../src/Generator_CodeAnalysis.ump"
  public void done(){
    addTableEntry(null);
		tbl.addRow(new String [] {"Total",String.valueOf(total_lloc),String.valueOf(total_comments),String.valueOf(total_lloc+total_comments)});
  }

  // line 215 "../../../../src/Generator_CodeAnalysis.ump"
  public void addTableEntry(UmpleElement element){
    if(cur_clazz != null) {
			tbl.addRow(new String [] {cur_clazz,String.valueOf(cur_lloc),String.valueOf(cur_comments),String.valueOf(cur_lloc+cur_comments)});
			total_lloc+= cur_lloc;
			total_comments+= cur_comments;
		}
		cur_clazz = element!= null ? element.getName() : "";
		cur_lloc = 0; 
		cur_comments = 0;
  }


  /**
   * Comment
   */
  // line 227 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Comment comment){
    cur_comments++;
  }


  /**
   * Umple Classifiers
   */
  // line 232 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(UmpleClass umpleClass){
    addTableEntry(umpleClass);
		cur_lloc+= 2;
  }

  // line 236 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(UmpleInterface umpleInterface){
    addTableEntry(umpleInterface);
		cur_lloc+= 2;
  }

  // line 240 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(AssociationClass associationC){
    addTableEntry(associationC);
		cur_lloc+= 2;
  }


  /**
   * Dependency
   */
  // line 246 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Depend dependE){
    cur_lloc++;
  }

  // line 249 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Package pkg){
    cur_lloc++;
  }

  // line 252 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(ClassPattern ptrn){
    cur_lloc++;
  }

  // line 255 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Hierarchy hier){
    cur_lloc+= hier.getParentInterfaces().size();
		if(hier.getParentClass() != null) {
			cur_lloc++;			
		}
  }


  /**
   * Attributes
   */
  // line 263 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Constant cnst){
    cur_lloc++;
  }

  // line 266 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Attribute attribute){
    if(attribute.isIsDerived()) {
			cur_lloc+= 2;			
		} else {
			cur_lloc++;
		}
  }

  // line 273 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Key keyO){
    cur_lloc++;
  }

  // line 277 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(UniqueIdentifier uid){
    cur_lloc++;
  }


  /**
   * Methods
   */
  // line 282 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Method method){
    if(method.isIsImplemented()) {
			cur_lloc+= 2;
		} else {
			cur_lloc++;			
		}
  }


  /**
   * Logical
   */
  // line 291 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Precondition pre){
    cur_lloc++;
  }

  // line 294 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(ConstraintTree constraint){
    cur_lloc++;
  }


  /**
   * Aspect
   */
  // line 299 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(CodeInjection codeInjection){
    cur_lloc+= 2;
  }


  /**
   * Association
   */
  // line 304 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Association associationE){
    cur_lloc++;
  }


  /**
   * void visit(AssociationVariable var) {
   * cur_lloc++;
   * }
   * Statemachine
   */
  // line 312 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(StateMachine sm){
    cur_lloc+= 2;
  }

  // line 315 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(State state){
    cur_lloc+= 2;
  }


  /**
   * void visit(Guard guard) {
   * cur_lloc++;
   * }
   */
  // line 321 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Action action){
    cur_lloc++;
  }

  // line 324 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Event event){
    cur_lloc+= 2;
  }


  /**
   * void visit(Transition transition) {
   * cur_lloc++;
   * }
   */
  // line 330 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(Activity activity){
    cur_lloc+= 2;
  }


  /**
   * Trace
   */
  // line 335 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(TracerDirective tracer){
    cur_lloc++;
  }

  // line 338 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(TraceItem traceItem){
    cur_lloc++;
  }

  // line 341 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(TraceRecord traceRecord){
    cur_lloc++;
  }

  // line 344 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(AttributeTraceItem attributeT){
    cur_lloc++;
  }

  // line 347 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(MethodTraceItem methodTraceEntity){
    cur_lloc++;
  }

  // line 350 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(StateMachineTraceItem stateMachineTraceItem){
    cur_lloc++;
  }


  /**
   * User Code
   */
  // line 356 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(CodeBlock block){
    MeasurmentObject m;
	  	try {
			m = UmpleModelHelper.getInstance().countLOC(block.getCode());
			cur_lloc+= m.getCodeCount();
	  	} catch (IOException e) {}
  }

  // line 363 "../../../../src/Generator_CodeAnalysis.ump"
  public void visit(UserCode userCode){
    MeasurmentObject m;
	  	try {
			m = UmpleModelHelper.getInstance().countLOC(userCode.getUserCode());
			cur_lloc+= m.getCodeCount();
	  	} catch (IOException e) {}
  }


  public String toString()
  {
    return super.toString() + "["+
            "total_lloc" + ":" + getTotal_lloc()+ "," +
            "total_comments" + ":" + getTotal_comments()+ "," +
            "cur_lloc" + ":" + getCur_lloc()+ "," +
            "cur_comments" + ":" + getCur_comments()+ "," +
            "cur_clazz" + ":" + getCur_clazz()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "doc" + "=" + (getDoc() != null ? !getDoc().equals(this)  ? getDoc().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "tbl" + "=" + (getTbl() != null ? !getTbl().equals(this)  ? getTbl().toString().replaceAll("  ","    ") : "this" : "null");
  }
}