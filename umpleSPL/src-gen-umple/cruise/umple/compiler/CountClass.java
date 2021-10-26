/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * end of class ClassMetrics
 */
// line 187 "../../../../src/SimpleMetrics_Class.ump"
public class CountClass
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CountClass Attributes
  private int countStateMachines;
  private int countAssociations;
  private int countSubclasses;
  private int countDeepestSubclass;
  private int countAttributes;
  private int countMethods;
  private int countParameters;
  private int countTotalStateMachines;
  private int countTotalAssociations;
  private int countTotalSubclasses;
  private int countTotalAttributes;
  private int countTotalMethods;
  private int countTotalParameters;
  private int countStateMachinesMax;
  private int countAssociationsMax;
  private int countSubclassesMax;
  private int countDeepestSubclassMax;
  private int countAttributesMax;
  private int countMethodsMax;
  private int countParametersMax;
  private int countStateMachinesMin;
  private int countAssociationsMin;
  private int countSubclassesMin;
  private int countDeepestSubclassMin;
  private int countAttributesMin;
  private int countMethodsMin;
  private int countParametersMin;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CountClass()
  {
    countStateMachines = 0;
    countAssociations = 0;
    countSubclasses = 0;
    countDeepestSubclass = 0;
    countAttributes = 0;
    countMethods = 0;
    countParameters = 0;
    countTotalStateMachines = 0;
    countTotalAssociations = 0;
    countTotalSubclasses = 0;
    countTotalAttributes = 0;
    countTotalMethods = 0;
    countTotalParameters = 0;
    countStateMachinesMax = 0;
    countAssociationsMax = 0;
    countSubclassesMax = 0;
    countDeepestSubclassMax = 0;
    countAttributesMax = 0;
    countMethodsMax = 0;
    countParametersMax = 0;
    countStateMachinesMin = 0;
    countAssociationsMin = 0;
    countSubclassesMin = 0;
    countDeepestSubclassMin = 0;
    countAttributesMin = 0;
    countMethodsMin = 0;
    countParametersMin = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCountStateMachines(int aCountStateMachines)
  {
    boolean wasSet = false;
    countStateMachines = aCountStateMachines;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountAssociations(int aCountAssociations)
  {
    boolean wasSet = false;
    countAssociations = aCountAssociations;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountSubclasses(int aCountSubclasses)
  {
    boolean wasSet = false;
    countSubclasses = aCountSubclasses;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountDeepestSubclass(int aCountDeepestSubclass)
  {
    boolean wasSet = false;
    countDeepestSubclass = aCountDeepestSubclass;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountAttributes(int aCountAttributes)
  {
    boolean wasSet = false;
    countAttributes = aCountAttributes;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountMethods(int aCountMethods)
  {
    boolean wasSet = false;
    countMethods = aCountMethods;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountParameters(int aCountParameters)
  {
    boolean wasSet = false;
    countParameters = aCountParameters;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountTotalStateMachines(int aCountTotalStateMachines)
  {
    boolean wasSet = false;
    countTotalStateMachines = aCountTotalStateMachines;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountTotalAssociations(int aCountTotalAssociations)
  {
    boolean wasSet = false;
    countTotalAssociations = aCountTotalAssociations;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountTotalSubclasses(int aCountTotalSubclasses)
  {
    boolean wasSet = false;
    countTotalSubclasses = aCountTotalSubclasses;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountTotalAttributes(int aCountTotalAttributes)
  {
    boolean wasSet = false;
    countTotalAttributes = aCountTotalAttributes;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountTotalMethods(int aCountTotalMethods)
  {
    boolean wasSet = false;
    countTotalMethods = aCountTotalMethods;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountTotalParameters(int aCountTotalParameters)
  {
    boolean wasSet = false;
    countTotalParameters = aCountTotalParameters;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountStateMachinesMax(int aCountStateMachinesMax)
  {
    boolean wasSet = false;
    countStateMachinesMax = aCountStateMachinesMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountAssociationsMax(int aCountAssociationsMax)
  {
    boolean wasSet = false;
    countAssociationsMax = aCountAssociationsMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountSubclassesMax(int aCountSubclassesMax)
  {
    boolean wasSet = false;
    countSubclassesMax = aCountSubclassesMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountDeepestSubclassMax(int aCountDeepestSubclassMax)
  {
    boolean wasSet = false;
    countDeepestSubclassMax = aCountDeepestSubclassMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountAttributesMax(int aCountAttributesMax)
  {
    boolean wasSet = false;
    countAttributesMax = aCountAttributesMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountMethodsMax(int aCountMethodsMax)
  {
    boolean wasSet = false;
    countMethodsMax = aCountMethodsMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountParametersMax(int aCountParametersMax)
  {
    boolean wasSet = false;
    countParametersMax = aCountParametersMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountStateMachinesMin(int aCountStateMachinesMin)
  {
    boolean wasSet = false;
    countStateMachinesMin = aCountStateMachinesMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountAssociationsMin(int aCountAssociationsMin)
  {
    boolean wasSet = false;
    countAssociationsMin = aCountAssociationsMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountSubclassesMin(int aCountSubclassesMin)
  {
    boolean wasSet = false;
    countSubclassesMin = aCountSubclassesMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountDeepestSubclassMin(int aCountDeepestSubclassMin)
  {
    boolean wasSet = false;
    countDeepestSubclassMin = aCountDeepestSubclassMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountAttributesMin(int aCountAttributesMin)
  {
    boolean wasSet = false;
    countAttributesMin = aCountAttributesMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountMethodsMin(int aCountMethodsMin)
  {
    boolean wasSet = false;
    countMethodsMin = aCountMethodsMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setCountParametersMin(int aCountParametersMin)
  {
    boolean wasSet = false;
    countParametersMin = aCountParametersMin;
    wasSet = true;
    return wasSet;
  }

  public int getCountStateMachines()
  {
    return countStateMachines;
  }

  public int getCountAssociations()
  {
    return countAssociations;
  }

  public int getCountSubclasses()
  {
    return countSubclasses;
  }

  public int getCountDeepestSubclass()
  {
    return countDeepestSubclass;
  }

  public int getCountAttributes()
  {
    return countAttributes;
  }

  public int getCountMethods()
  {
    return countMethods;
  }

  public int getCountParameters()
  {
    return countParameters;
  }

  /**
   * attributes to store total values
   */
  public int getCountTotalStateMachines()
  {
    return countTotalStateMachines;
  }

  public int getCountTotalAssociations()
  {
    return countTotalAssociations;
  }

  public int getCountTotalSubclasses()
  {
    return countTotalSubclasses;
  }

  public int getCountTotalAttributes()
  {
    return countTotalAttributes;
  }

  public int getCountTotalMethods()
  {
    return countTotalMethods;
  }

  public int getCountTotalParameters()
  {
    return countTotalParameters;
  }

  /**
   * attributes to store MAX
   */
  public int getCountStateMachinesMax()
  {
    return countStateMachinesMax;
  }

  public int getCountAssociationsMax()
  {
    return countAssociationsMax;
  }

  public int getCountSubclassesMax()
  {
    return countSubclassesMax;
  }

  public int getCountDeepestSubclassMax()
  {
    return countDeepestSubclassMax;
  }

  public int getCountAttributesMax()
  {
    return countAttributesMax;
  }

  public int getCountMethodsMax()
  {
    return countMethodsMax;
  }

  public int getCountParametersMax()
  {
    return countParametersMax;
  }

  /**
   * attributes to store MIN
   */
  public int getCountStateMachinesMin()
  {
    return countStateMachinesMin;
  }

  public int getCountAssociationsMin()
  {
    return countAssociationsMin;
  }

  public int getCountSubclassesMin()
  {
    return countSubclassesMin;
  }

  public int getCountDeepestSubclassMin()
  {
    return countDeepestSubclassMin;
  }

  public int getCountAttributesMin()
  {
    return countAttributesMin;
  }

  public int getCountMethodsMin()
  {
    return countMethodsMin;
  }

  public int getCountParametersMin()
  {
    return countParametersMin;
  }

  public void delete()
  {}

  // line 224 "../../../../src/SimpleMetrics_Class.ump"
  public void countDataClass(UmpleClass uClass){
    int classCount=0;
      
      Attribute attribute = null;
      Method method = null;
      MethodParameter parameter = null;
      Association vassociation = null;     
    
        if (uClass!=null){

          //Look for State Machines
          for (StateMachine sm : uClass.getStateMachines()) {
            this.incStateMachines(1);
          }   
        
          // Look for subclasses connected directly
          this.calcAmountSubclasses(uClass);
                  
      // look for all subclasses regarding indirectly connected subclasses
      this.calcMaxDeepth(uClass);

          // Look for Associations
          Association[] associationlist = uClass.getAssociations();
          for( int i = 0; i < associationlist.length; i++ )
          {
            vassociation = associationlist[i];
            this.incCountAssociations(1);
          }
        
          // Look for Attributes
          List attributelist = uClass.getAttributes();
          if (attributelist != null){
            Iterator it = attributelist.iterator();
  
            while ( it.hasNext() ) {
              attribute = (Attribute)it.next();
              this.incCountAttributes(1);
            }
          }

          // Look for Methods
          List methodlist = uClass.getMethods();
          if (methodlist != null){
            Iterator it1 = methodlist.iterator();
                    
            while ( it1.hasNext() ) {
              method = (Method)it1.next();
              this.incCountMethods(1);
              
              // Look for Parameters
              List parameterlist = method.getMethodParameters();
              if (parameterlist != null){
                Iterator it3 = parameterlist.iterator();
                      
                while ( it3.hasNext() ) {
          this.incCountMethods(1);
                  parameter = (MethodParameter)it3.next();
                }
              }
            }
          }
        }
  }


  /**
   * end of method
   */
  // line 288 "../../../../src/SimpleMetrics_Class.ump"
  public int calcAmountSubclasses(UmpleClass Uclass){
    if (Uclass==null) return 0;
   this.setCountSubclasses(Uclass.getSubclasses().size());
     return this.getCountSubclasses();
  }

  // line 294 "../../../../src/SimpleMetrics_Class.ump"
  public void calcMaxDeepth(UmpleClass Uclass){
    int level =0;
   if (Uclass==null) return;
   level+=1;
   for( UmpleClass iclass: Uclass.getSubclasses() ){
       this.searchDeepestSubclass(iclass, level);
   }
  }

  // line 303 "../../../../src/SimpleMetrics_Class.ump"
  public void searchDeepestSubclass(UmpleClass Uclass, int level){
    if (Uclass==null) return;
   level+=1;
   if (level > this.getCountDeepestSubclass()) {
      this.setCountDeepestSubclass(level);
   }
   for( UmpleClass iclass: Uclass.getSubclasses() ){
    this.searchDeepestSubclass(iclass, level);
   }
  }

  // line 314 "../../../../src/SimpleMetrics_Class.ump"
  public void incTotal(){
    this.incCountTotalStateMachines(this.getCountStateMachines());
    this.incCountTotalAssociations(this.getCountAssociations());
    this.incCountTotalSubclasses(this.getCountSubclasses());
    this.incCountTotalAttributes(this.getCountAttributes());
    this.incCountTotalMethods(this.getCountMethods());
    this.incCountTotalParameters(this.getCountParameters());
  }

  // line 323 "../../../../src/SimpleMetrics_Class.ump"
  public void reset(){
    this.setCountStateMachines(0);
    this.setCountAssociations(0);
    this.setCountSubclasses(0);
  this.setCountDeepestSubclass(0);
    this.setCountAttributes(0);
    this.setCountMethods(0);
    this.setCountParameters(0);
  }

  // line 333 "../../../../src/SimpleMetrics_Class.ump"
  public void setMinMax(){
    // Setting MAX
  this.setCountStateMachinesMax(this.getCountStateMachines());
  this.setCountAssociationsMax(this.getCountAssociations());
  this.setCountSubclassesMax(this.getCountSubclasses());
  this.setCountDeepestSubclassMax(this.getCountDeepestSubclass());
  this.setCountAttributesMax(this.getCountAttributes());
  this.setCountMethodsMax(this.getCountMethods());
  this.setCountParametersMax(this.getCountParameters());
  
    // Setting MIN
    this.setCountStateMachinesMin(this.getCountStateMachines());
  this.setCountAssociationsMin(this.getCountAssociations());
  this.setCountSubclassesMin(this.getCountSubclasses());
  this.setCountDeepestSubclassMin(this.getCountDeepestSubclass());
  this.setCountAttributesMin(this.getCountAttributes());
  this.setCountMethodsMin(this.getCountMethods());
  this.setCountParametersMin(this.getCountParameters());
  }

  // line 354 "../../../../src/SimpleMetrics_Class.ump"
  public void calcMinMax(){
    // calculating MAX
    if( this.getCountStateMachines()>this.getCountStateMachinesMax()){
    this.setCountStateMachinesMax(this.getCountStateMachines());
  }
    if( this.getCountAssociations()>this.getCountAssociationsMax()){
    this.setCountAssociationsMax(this.getCountAssociations());
  }
    if( this.getCountSubclasses()>this.getCountSubclassesMax()){
    this.setCountSubclassesMax(this.getCountSubclasses());
  }
  if( this.getCountDeepestSubclass()>this.getCountDeepestSubclassMax()){
    this.setCountDeepestSubclassMax(this.getCountDeepestSubclass());
  }
    if( this.getCountAttributes()>this.getCountAttributesMax()){
    this.setCountAttributesMax(this.getCountAttributes());
  }
    if( this.getCountMethods()>this.getCountMethodsMax()){
    this.setCountMethodsMax(this.getCountMethods());
  }
    if( this.getCountParameters()>this.getCountParametersMax()){
    this.setCountParametersMax(this.getCountParameters());
  }
  
    // calculating MIN 
    if( this.getCountStateMachines()<this.getCountStateMachinesMin()){
    this.setCountStateMachinesMin(this.getCountStateMachines());
  }
    if( this.getCountAssociations()<this.getCountAssociationsMin()){
    this.setCountAssociationsMin(this.getCountAssociations());
  }
    if( this.getCountSubclasses()<this.getCountSubclassesMin()){
    this.setCountSubclassesMin(this.getCountSubclasses());
  }
  if( this.getCountDeepestSubclass()<this.getCountDeepestSubclassMin()){
    this.setCountDeepestSubclassMin(this.getCountDeepestSubclass());
  }
    if( this.getCountAttributes()<this.getCountAttributesMin()){
    this.setCountAttributesMin(this.getCountAttributes());
  }
    if( this.getCountMethods()<this.getCountMethodsMin()){
    this.setCountMethodsMin(this.getCountMethods());
  }
    if( this.getCountParameters()<this.getCountParametersMin()){
    this.setCountParametersMin(this.getCountParameters());
  }
  }

  // line 403 "../../../../src/SimpleMetrics_Class.ump"
  public void incCountDeepestSubclass(int a){
    this.countDeepestSubclass+=a;
  }

  // line 406 "../../../../src/SimpleMetrics_Class.ump"
  public void incStateMachines(int a){
    this.countStateMachines+=a;
  }

  // line 409 "../../../../src/SimpleMetrics_Class.ump"
  public void incCountAssociations(int a){
    this.countAssociations+=a;
  }

  // line 412 "../../../../src/SimpleMetrics_Class.ump"
  public void incCountSubclasses(int a){
    this.countSubclasses+=a;
  }

  // line 415 "../../../../src/SimpleMetrics_Class.ump"
  public void incCountAttributes(int a){
    this.countAttributes+=a;
  }

  // line 418 "../../../../src/SimpleMetrics_Class.ump"
  public void incCountMethods(int a){
    this.countMethods+=a;
  }

  // line 421 "../../../../src/SimpleMetrics_Class.ump"
  public void incCountParameters(int a){
    this.countParameters+=a;
  }

  // line 425 "../../../../src/SimpleMetrics_Class.ump"
  public void incCountTotalStateMachines(int a){
    this.countTotalStateMachines+=a;
  }

  // line 428 "../../../../src/SimpleMetrics_Class.ump"
  public void incCountTotalAssociations(int a){
    this.countTotalAssociations+=a;
  }

  // line 431 "../../../../src/SimpleMetrics_Class.ump"
  public void incCountTotalSubclasses(int a){
    this.countTotalSubclasses+=a;
  }

  // line 434 "../../../../src/SimpleMetrics_Class.ump"
  public void incCountTotalAttributes(int a){
    this.countTotalAttributes+=a;
  }

  // line 437 "../../../../src/SimpleMetrics_Class.ump"
  public void incCountTotalMethods(int a){
    this.countTotalMethods+=a;
  }

  // line 440 "../../../../src/SimpleMetrics_Class.ump"
  public void incCountTotalParameters(int a){
    this.countTotalParameters+=a;
  }


  public String toString()
  {
    return super.toString() + "["+
            "countStateMachines" + ":" + getCountStateMachines()+ "," +
            "countAssociations" + ":" + getCountAssociations()+ "," +
            "countSubclasses" + ":" + getCountSubclasses()+ "," +
            "countDeepestSubclass" + ":" + getCountDeepestSubclass()+ "," +
            "countAttributes" + ":" + getCountAttributes()+ "," +
            "countMethods" + ":" + getCountMethods()+ "," +
            "countParameters" + ":" + getCountParameters()+ "," +
            "countTotalStateMachines" + ":" + getCountTotalStateMachines()+ "," +
            "countTotalAssociations" + ":" + getCountTotalAssociations()+ "," +
            "countTotalSubclasses" + ":" + getCountTotalSubclasses()+ "," +
            "countTotalAttributes" + ":" + getCountTotalAttributes()+ "," +
            "countTotalMethods" + ":" + getCountTotalMethods()+ "," +
            "countTotalParameters" + ":" + getCountTotalParameters()+ "," +
            "countStateMachinesMax" + ":" + getCountStateMachinesMax()+ "," +
            "countAssociationsMax" + ":" + getCountAssociationsMax()+ "," +
            "countSubclassesMax" + ":" + getCountSubclassesMax()+ "," +
            "countDeepestSubclassMax" + ":" + getCountDeepestSubclassMax()+ "," +
            "countAttributesMax" + ":" + getCountAttributesMax()+ "," +
            "countMethodsMax" + ":" + getCountMethodsMax()+ "," +
            "countParametersMax" + ":" + getCountParametersMax()+ "," +
            "countStateMachinesMin" + ":" + getCountStateMachinesMin()+ "," +
            "countAssociationsMin" + ":" + getCountAssociationsMin()+ "," +
            "countSubclassesMin" + ":" + getCountSubclassesMin()+ "," +
            "countDeepestSubclassMin" + ":" + getCountDeepestSubclassMin()+ "," +
            "countAttributesMin" + ":" + getCountAttributesMin()+ "," +
            "countMethodsMin" + ":" + getCountMethodsMin()+ "," +
            "countParametersMin" + ":" + getCountParametersMin()+ "]";
  }
}