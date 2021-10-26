/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.List;

/**
 * A generic walker that is designed to parse different types of umple elements. It receives
 * an umple model, and recrusively walks through different contained nodes.
 */
// line 140 "../../../../src/Generator_UmpleModelWalker.ump"
public class UmpleModelWalker implements IWalker
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleModelWalker Attributes
  private UmpleModel model;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleModelWalker(UmpleModel aModel)
  {
    model = aModel;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setModel(UmpleModel aModel)
  {
    boolean wasSet = false;
    model = aModel;
    wasSet = true;
    return wasSet;
  }

  public UmpleModel getModel()
  {
    return model;
  }

  public void delete()
  {}

  // line 145 "../../../../src/Generator_UmpleModelWalker.ump"
  public void accept(UmpleModelVisitor visitor){
    List<UmpleElement> umpleElements = model.getUmpleElements();
		
		for(UmpleElement element: umpleElements){
			visitor.visit(element);			
			String extraCode = element.getExtraCode();
			if(extraCode!= null&& !extraCode.isEmpty()){
				visitor.visit(new UserCode(extraCode)); 
			}
			
			if(element instanceof UmpleClassifier){
				UmpleClassifier classifier= (UmpleClassifier) element;
				visitor.visit(classifier);
				
				if(element.getPackageName() != null){
					visitor.visit(new Package(element.getPackageName()));
				}
				for(Depend dep : classifier.getDepends()) {
					visitor.visit(dep);
				}
				for(Method mth : classifier.getMethods()) {
					visitor.visit(mth); // isImplemented
					for(MethodParameter param : mth.getMethodParameters()) {
						visitor.visit(param);
					}
					MethodBody mthBody = mth.getMethodBody();
					visitor.visit(mthBody);					
					visitor.visit(new UserCode(mthBody.getExtraCode()));
					
					for(Comment cmt : mth.getComments()) {
						visitor.visit(cmt);
					}
				}
				for(Constant cnst : classifier.getConstants()) {
					visitor.visit(cnst);
				}
				
				if(element instanceof UmpleInterface){
					UmpleInterface uInterface= (UmpleInterface) element;
					visitor.visit(uInterface);
					
					if(uInterface.getExtendsInterface().size() > 0) {
						Hierarchy hier = new Hierarchy(uInterface);
						hier.setParentClass(null);
						for(UmpleInterface uin : uInterface.getExtendsInterface()) {
							hier.addParentInterface(uin);							
						}	
						visitor.visit(hier);					
					}
				}
				if(element instanceof UmpleClass){
					UmpleClass clazz= (UmpleClass) element;
					if(element instanceof AssociationClass){
						visitor.visit((AssociationClass)element);
					} else {
						visitor.visit(clazz);
					}
					
					for(Comment cmt : clazz.getComments()) {
						visitor.visit(cmt);
					}
					
					if(clazz.getParentInterface().size() > 0 || clazz.getExtendsClass() != null) {
						Hierarchy hier = new Hierarchy(clazz);
						hier.setParentClass(clazz.getExtendsClass());
						for(UmpleInterface uin : clazz.getParentInterface()) {
							hier.addParentInterface(uin);							
						}	
						visitor.visit(hier);					
					}
					
					if(clazz.isImmutable() ) {
						visitor.visit(new ClassPattern(clazz,"Immutable"));
					}
					if(clazz.isIsAbstract() ) {
						visitor.visit(new ClassPattern(clazz,"Abstract"));
					}
					if(clazz.isIsInternal() ) {
						visitor.visit(new ClassPattern(clazz,"Internal"));
					}
					if(clazz.isIsSingleton() ) {
						visitor.visit(new ClassPattern(clazz,"Singleton"));
					}
					
					Key key = clazz.getKey();
					if(key!= null&& key.getMembers().length>0){
						visitor.visit(key);
					}
					
					for(Association assoc : clazz.getAssociations()) {
						if(assoc.getEnds().size() == 0 || clazz.getName().equals(assoc.getEnd(0).getReferenceToClassName())) {
							visitor.visit(assoc);
							for(AssociationEnd assocEnd : assoc.getEnds()) {
								visitor.visit(assocEnd);
							}
						}
					}
					
					for(Precondition pr : clazz.getPreConds()) {
						visitor.visit(pr);
					}
					
					if(clazz.getUniqueIdentifier() != null ) {
						visitor.visit(clazz.getUniqueIdentifier());
					}
					
					for(ConstraintTree cnst : clazz.getConstraintTrees()){
                                          for(ConstraintVariable var:cnst)
                                          {
                                            visitor.visit(var);       
                                          }
                                        }
					
					for(AssociationVariable aVar : clazz.getAssociationVariables()) {
						visitor.visit((UmpleVariable)aVar);
						visitor.visit(aVar);
						for(Comment cmt : aVar.getComments()) {
							visitor.visit(cmt);
						}
					}
					
					for(Attribute attribute: clazz.getAttributes()) {
						visitor.visit((UmpleVariable)attribute);
						visitor.visit(attribute); // isIsDerived
						if(attribute.getCodeblock() != null) {
							visitor.visit(attribute.getCodeblock());
						}
						for(Comment cmt : attribute.getComments()) {
							visitor.visit(cmt);
						}					
					}
					for(StateMachine sm: clazz.getAllStateMachines()){
						visitor.visit(sm);
						for(State state: sm.getStates()){
							visitor.visit(state);
							for (Activity activity : state.getActivities()){
								visitor.visit(activity);
								visitor.visit(new UserCode(activity.getActivityCode()));
							}
							for(Transition transition: state.getTransitions()){
								visitor.visit(transition);
								visitor.visit(transition.getGuard());
								if(transition.getGuard() != null) {
									Guard gElm = (Guard)transition.getGuard();
									String condition = gElm.getCondition(new cruise.umple.compiler.JavaGenerator());
									visitor.visit(gElm);
								}	
								visitor.visit(transition.getEvent());
							}
							for(Action action: state.getActions()){
								visitor.visit(action);
								visitor.visit(new UserCode(action.getActionCode()));
							}					
						}
					}
					
					for(CodeInjection ci: clazz.getCodeInjections()){
						if(ci.getConstraintTree() != null) {
							visitor.visit(ci.getConstraintTree());
						}
						visitor.visit(ci);
						if(ci.getCode() != null) {
							visitor.visit(new UserCode(ci.getCode()));
						}
					}
					
					for(TraceDirective td: clazz.getTraceDirectives()){
						visitor.visit(td);
						visitor.visit(td.getTracerDirective());
						
						for(AttributeTraceItem ati : td.getAttributeTraceItems()) {
							visitor.visit(ati);
						}
						
						for(TraceCondition tc : td.getCondition()) {
							visitor.visit(tc);
						}
						
						for(MethodTraceItem mte : td.getMethodTraceItems()) {
							visitor.visit(mte);
						}
						
						for(StateMachineTraceItem smte : td.getStateMachineTraceItems()) {
							visitor.visit(smte);
						}
						
						//for(TraceCase tc : td.getTraceCases()) {
							//visitor.visit(tc);
						//}
					}
					
					for(TraceCase tc: clazz.getTraceCases()){
						visitor.visit(tc);
					}
				}
			}
		}
		visitor.done();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}