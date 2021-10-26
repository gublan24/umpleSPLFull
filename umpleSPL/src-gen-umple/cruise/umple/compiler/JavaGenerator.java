/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;
import java.io.*;
import cruise.umple.util.*;
import cruise.umple.util.StringFormatter;
import cruise.umple.compiler.exceptions.*;
import cruise.umple.compiler.java.*;

// line 11 "../../../../src/Generator_CodeJava.ump"
public class JavaGenerator extends SuperCodeGenerator implements CodeTranslator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //JavaGenerator Attributes
  private StringBuilder uncaughtExceptions;
  private List<UmpleClass> mainClasses;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JavaGenerator()
  {
    super();
    uncaughtExceptions = new StringBuilder();
    mainClasses = new ArrayList<UmpleClass>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUncaughtExceptions(StringBuilder aUncaughtExceptions)
  {
    boolean wasSet = false;
    uncaughtExceptions = aUncaughtExceptions;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addMainClass(UmpleClass aMainClass)
  {
    boolean wasAdded = false;
    wasAdded = mainClasses.add(aMainClass);
    return wasAdded;
  }

  public boolean removeMainClass(UmpleClass aMainClass)
  {
    boolean wasRemoved = false;
    wasRemoved = mainClasses.remove(aMainClass);
    return wasRemoved;
  }

  public StringBuilder getUncaughtExceptions()
  {
    return uncaughtExceptions;
  }
  /* Code from template attribute_GetMany */
  public UmpleClass getMainClass(int index)
  {
    UmpleClass aMainClass = mainClasses.get(index);
    return aMainClass;
  }

  public UmpleClass[] getMainClasses()
  {
    UmpleClass[] newMainClasses = mainClasses.toArray(new UmpleClass[mainClasses.size()]);
    return newMainClasses;
  }

  public int numberOfMainClasses()
  {
    int number = mainClasses.size();
    return number;
  }

  public boolean hasMainClasses()
  {
    boolean has = mainClasses.size() > 0;
    return has;
  }

  public int indexOfMainClass(UmpleClass aMainClass)
  {
    int index = mainClasses.indexOf(aMainClass);
    return index;
  }

  public void delete()
  {
    super.delete();
  }

  // line 112 "../../../../src/Generator_CodeJava.ump"
   public void generate(){
    prepare();
    UmpleElement lastElement = null;
    try{
      for (UmpleElement currentElement : getModel().getUmpleElements())
      {
        if ("external".equals(currentElement.getModifier()))
        {
          // It is external, so won't be generated
          continue;
        }
        writeFile(currentElement);
        
        lastElement = currentElement;
      }
    }
    catch(Exception e){
      throw new UmpleCompilerException("There was a problem with generating classes. " + e, e);
    }
    
    if (lastElement == null)
    {
      System.err.println("No classes were compiled. It is likely there was no compilable code in the source .ump file(s) including "+getModel().getUmpleFile().getFileName());
    }
    
    if(mainClasses.size()>0)
    {
      for(UmpleClass uClass : mainClasses)
      {
        writeUncaughtExceptionFile(uClass);
      }
    }
	  if(getModel().getDistributed())
    {
	    try
	    {
	      writeObjectFactoryClass();
        writeObjectFactoryInterface();
	    }    
	    catch(Exception e)
      {
        throw new UmpleCompilerException("There was a problem with generating the Object factory. " + e, e);	
      }
    }
	  
    postpare();
  }

  // line 162 "../../../../src/Generator_CodeJava.ump"
   public ILang getLanguageFor(UmpleElement aElement){
    if (aElement instanceof UmpleInterface)
    {
      return new JavaInterfaceGenerator();
    }
    else if (aElement instanceof UmpleClass)
    {
      return new JavaClassGenerator();
    } 
    else{
        return null;        
    }
  }

  // line 177 "../../../../src/Generator_CodeJava.ump"
   public boolean isNullable(UmpleVariable av){
    return !UmpleToPrimitiveMap.containsKey(av.getType());
  }

  // line 182 "../../../../src/Generator_CodeJava.ump"
   public String relatedTranslate(String name, AssociationVariable av){
    return translate(name,av.getRelatedAssociation());
  }

  // line 187 "../../../../src/Generator_CodeJava.ump"
   public String translate(String keyName, State state){
    String singularName = state.getName();
    String pluralName = getModel().getGlossary().getPlural(singularName);
  
    if (UpperCasePluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCasePluralLookupMap.get(keyName),getUpperCaseName(pluralName));
    }
    else if (UpperCaseSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCaseSingularLookupMap.get(keyName),getUpperCaseName(singularName));
    }
    else if (AsIsPluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsPluralLookupMap.get(keyName),pluralName);
    }
    else if (AsIsSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsSingularLookupMap.get(keyName),singularName);
    }
    else if ("type".equals(keyName))
    {
      return getUpperCaseName(state.getStateMachine().getName());
    }
    
    return "UNKNOWN ID: " + keyName;
  }

  // line 216 "../../../../src/Generator_CodeJava.ump"
   public String translate(String keyName, Activity a){
    State s = a.getState();
    String threadNum = "";
    if (s.numberOfActivities() > 1)
    {
      threadNum = "" + a.getState().getActivities().indexOf(a);
    }
    if ("doActivityMethod".equals(keyName))
    {
      return StringFormatter.format("doActivity{0}{1}", threadNum,  GeneratorHelper.getFullActivityName(a.getState())); 
    }
    else if ("doActivityThread".equals(keyName))
    {
      return StringFormatter.format("doActivity{0}{1}Thread", threadNum, GeneratorHelper.getFullActivityName(a.getState())); 
    }
    return "UNKNOWN ID: " + keyName;
  }

  // line 235 "../../../../src/Generator_CodeJava.ump"
   public String translate(String keyName, StateMachine sm){
    String singularName = sm.getFullName();
    String pluralName = getModel().getGlossary().getPlural(singularName);
  
    if (UpperCasePluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCasePluralLookupMap.get(keyName),getUpperCaseName(pluralName));
    }
    else if (UpperCaseSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCaseSingularLookupMap.get(keyName),getUpperCaseName(singularName));
    }
    else if (AsIsPluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsPluralLookupMap.get(keyName),pluralName);
    }
    else if (AsIsSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsSingularLookupMap.get(keyName),singularName);
    }
    else if ("typeGet".equals(keyName) || "typeFull".equals(keyName))
    {
      return "String";
    }
    else if ("type".equals(keyName))
    {
      return getUpperCaseName(sm.getFullName());
    }
    else if ("listStates".equals(keyName))
    {
      String allEnums = "";
      for(State state : sm.getStates())
      {
        if (allEnums.length() > 0)
        {
          allEnums += ", ";
        }
        allEnums += translate("stateOne",state);
      }
      return allEnums;
    }
       
    else if ("listMessageTypesStates".equals(keyName))
    {
      String allEnums = "";
      
      if(sm.getNestedStateMachines().isEmpty())
      {
        for(State state : sm.getStates())
        {
          if (allEnums.length() > 0)
          {
            allEnums += "\n  ";
          }
          allEnums+="  stateMessageMap.put(";
          allEnums+=translate("type",sm);
          allEnums+=".";
          allEnums +=state.getName();
          allEnums+=",new HashSet<MessageType>(Arrays.asList(";
          String allEventEnums = "";
          if(!state.getTransitions().isEmpty())
          {
            for (Transition t : state.getTransitions())
            {
              if(!t.getEvent().isAutoTransition())
              {
                if(!t.getEvent().isUnspecified())
                {
                  if (allEventEnums.length() > 0)
                  {
                    allEventEnums += ", ";
                  }
                  allEventEnums += "MessageType.";
                  allEventEnums += t.getEvent().getName();
                  allEventEnums += "_M";
                }
              }
            }
          
            int countingAutoTrans = 0;
            int countingUnspec = 0;
            int countingResult = 0;
            int countingSize = state.getTransitions().size();
            for(Transition t : state.getTransitions())
            {
              if(t.getEvent().isAutoTransition())
              {
                countingAutoTrans++;
              }
              if(t.getEvent().isUnspecified())
              {
                countingUnspec++;
              }    
            }
            countingResult = countingAutoTrans+countingUnspec;
            if(countingResult == countingSize)
            {
              allEventEnums += "MessageType.null_M";
            }
          }
          else if(state.getTransitions().isEmpty())
          {
            allEventEnums += "MessageType.null_M";
          }
          allEnums += allEventEnums;
          allEnums += ")));";
        }
      }
      else if(!sm.getNestedStateMachines().isEmpty())
      {
        for(State state : sm.getStates())
        {
          if (allEnums.length() > 0)
          {
            allEnums += "\n  ";
          }
          allEnums+="  stateMessageMap.put(";
          allEnums+=translate("type",sm);
          allEnums+=".";
          allEnums +=state.getName();
          allEnums+=",new HashSet<MessageType>(Arrays.asList(";
          String allEventEnums = "";
          if(!state.getTransitions().isEmpty())
          {
            for (Transition t : state.getTransitions())
            {
              if(!t.getEvent().isAutoTransition())
              {
                if(!t.getEvent().isUnspecified())
                {
                  if (allEventEnums.length() > 0)
                  {
                    allEventEnums += ", ";
                  }
                  allEventEnums += "MessageType.";
                  allEventEnums += t.getEvent().getName();
                  allEventEnums += "_M";
                }
              }
            }
          
            int countAutoTrans = 0;
            int countUnspec = 0;
            int result = 0;
            int size = state.getTransitions().size();
            for(Transition t : state.getTransitions())
            {
              if(t.getEvent().isAutoTransition())
              {
                countAutoTrans++;
              }
              if(t.getEvent().isUnspecified())
              {
                countUnspec++;
              }
            }
            result = countAutoTrans+countUnspec;
            if(result == size)
            {
              allEventEnums += "MessageType.null_M";
            }
          }
          else if(state.getTransitions().isEmpty())
          {
            allEventEnums += "MessageType.null_M";
          }
          allEnums += allEventEnums;
          allEnums += ")));";
        }

        String exitEveName ="";
        String enterEveName ="";
        for(StateMachine nsm : sm.getNestedStateMachines())
        {
          String exitEve=null;
          String enterEve=null;
          
          if (nsm.getParentState() != null)
          {
            State parentState = nsm.getParentState();
            exitEve = translate("exitMethod",parentState); //for parent stat of nsm
            enterEve = translate("enterMethod",parentState);
          }
          for(State s:sm.getStates())
          {
            String exitE = translate("exitMethod",s);
            String enterE = translate("enterMethod",s);
            if(exitE.equals(exitEve) && enterE.equals(enterEve))
            {
              exitEveName = exitE;
              enterEveName = enterE;
              break;
            }
          }
          for(State state : nsm.getStates())
          {
            if (allEnums.length() > 0)
            {
              allEnums += "\n  ";
            }
            allEnums+="  stateMessageMap.put(";
            allEnums+=translate("type",nsm);
            allEnums+=".";
            allEnums +=state.getName();
            allEnums+=",new HashSet<MessageType>(Arrays.asList(";
            String allEventEnums = "";
            if(!state.getTransitions().isEmpty())
            {
              for (Transition t : state.getTransitions())
              {
                if(!t.getEvent().isAutoTransition())
                {
                  if(!t.getEvent().isUnspecified())
                  {
                    if(!t.getEvent().getName().equals(exitEve))
                    {
                      if(!t.getEvent().getName().equals(enterEve))
                      {
                        if(!t.getEvent().getName().equals(exitEveName))
                        {
                          if(!t.getEvent().getName().equals(enterEveName))
                          {
                            if (allEventEnums.length() > 0)
                            {
                              allEventEnums += ", ";
                            }
                            allEventEnums += "MessageType.";
                            allEventEnums += t.getEvent().getName();
                            allEventEnums += "_M";
                          }
                        }
                      }
                    }
                  }
                }
              }
            
              int countNestedAutoTrans = 0;
              int countNestedUnspec = 0;
              int nestedResult = 0;
              int nestedSize = state.getTransitions().size();
              for(Transition t : state.getTransitions())
              {
                if(t.getEvent().isAutoTransition())
                {
                  countNestedAutoTrans++;
                }
                if(t.getEvent().isUnspecified())
                {
                  countNestedUnspec++;
                }
              }
              nestedResult = countNestedAutoTrans+countNestedUnspec;
              if(nestedResult == nestedSize)
              {
                allEventEnums += "MessageType.null_M";
              }
          
              String exEvent ="";
              String enEvent ="";
              int sizeTrans = state.getTransitions().size();
              for(State s : sm.getStates())
              {
                int exCount = 0;
                int enCount = 0;
                int countResult = 0;
                exEvent = translate("exitMethod",s);  
                enEvent = translate("enterMethod",s);
                for(Transition t : state.getTransitions())
                {
                  if(t.getEvent().getName().equals(exEvent))
                  {
                    exCount++;
                  }
                  if(t.getEvent().getName().equals(enEvent))
                  {
                    enCount++;
                  }
                }
                countResult = exCount+enCount;
                if(countResult == sizeTrans)
                {
                  allEventEnums += "MessageType.null_M";
                }
              }     
            }
            else if(state.getTransitions().isEmpty())
            {
              allEventEnums += "MessageType.null_M";
            }
            
            allEnums += allEventEnums;
            allEnums += ")));";
          }       
        }
      }
      return allEnums;
    } 
        
    return "UNKNOWN ID: " + keyName;
  }

  // line 538 "../../../../src/Generator_CodeJava.ump"
   public String translate(String keyName, Event event){
    String singularName = event.getName();
    String pluralName = getModel().getGlossary().getPlural(singularName);

    if (UpperCasePluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCasePluralLookupMap.get(keyName),getUpperCaseName(pluralName));
    }
    else if (UpperCaseSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCaseSingularLookupMap.get(keyName),getUpperCaseName(singularName));
    }
    else if (AsIsPluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsPluralLookupMap.get(keyName),pluralName);
    }
    else if (AsIsSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsSingularLookupMap.get(keyName),singularName);
    }
    
    return "UNKNOWN ID: " + keyName;
  }

  // line 563 "../../../../src/Generator_CodeJava.ump"
   public String translate(String keyName, Event event, StateMachine sm){
    // Issue1602
    String singularName = event.getName();
    int numOfOccurance = 0;
    // Check if there is same event in different stateMahcine.
    UmpleClass c = sm.getUmpleClass();
    StateMachine parentStateMachine = sm;
    while (c == null)
    {
      parentStateMachine = parentStateMachine.getSuperStateMachine();
      c = parentStateMachine.getUmpleClass();
    }
    for (StateMachine sm2 : c.getAllStateMachines())
    {
      for (Event e : sm2.getEvents())
      {
        if (e.equals(event))
        {
          numOfOccurance++;
          break;
        }
      }
    }

    if (numOfOccurance > 1)
    {
      singularName = sm.getFullName() + "_" + event.getName();
    }
    String pluralName = getModel().getGlossary().getPlural(singularName);

    if (UpperCasePluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCasePluralLookupMap.get(keyName),getUpperCaseName(pluralName));
    }
    else if (UpperCaseSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCaseSingularLookupMap.get(keyName),getUpperCaseName(singularName));
    }
    else if (AsIsPluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsPluralLookupMap.get(keyName),pluralName);
    }
    else if (AsIsSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsSingularLookupMap.get(keyName),singularName);
    }
    
    return "UNKNOWN ID: " + keyName;
  }

  // line 614 "../../../../src/Generator_CodeJava.ump"
   public String translate(String name, UmpleInterface aInterface){
    if ("packageDefinition".equals(name))
    {
      return aInterface.getPackageName().length() == 0 ? "" : "package " + aInterface.getPackageName() + ";"; 
    }
    if ("isA".equals(name))
    {
      return getImplementsForInterfaces(aInterface);
    }
    return "";
  }

  // line 627 "../../../../src/Generator_CodeJava.ump"
   public String translate(String methodType){
    if ("String".equals(methodType))
    {
      return "\"\"";
    }
    if ("int".equals(methodType) || "double".equals(methodType) || "float".equals(methodType))
    {
      return "0";
    }
    if ("boolean".equals(methodType))
    {
      return "false";
    }
    if ("void".equals(methodType))
    {
      return "";
    }        
    return "null";
  }

  // line 648 "../../../../src/Generator_CodeJava.ump"
   public String translate(String keyName, UmpleClass aClass){
    if ("constructorMandatory".equals(keyName))
    {
      return aClass.getGeneratedClass().getLookup("constructorSignature_mandatory");
    }
    else if ("packageDefinition".equals(keyName))
    {
      if(aClass.hasOuterClass())
      return "";
      else
      return aClass.getPackageName().length() == 0 ? "" : "package " + aClass.getPackageName() + ";"; 
    }
    else if ("type".equals(keyName))
    {
      return aClass.getName();
    }
    else if ("isA".equals(keyName))
    {
      return getExtendAndImplements(aClass);
    }
    else if ("deleteMethod".equals(keyName))
    {
      return "delete";
    }
    
    else if ("listEventsForQSM".equals(keyName))
    {
      String allEnums = "";
      
      String evName="";
      boolean sameEvName=false;
      List<String> evList=new ArrayList<String>();         
      
      for(StateMachine stm : aClass.getStateMachines())
      {
        List<StateMachine> allNested = stm.getNestedStateMachines();
        boolean nestedSMhasEvent=false;
        
        if (!stm.getNestedStateMachines().isEmpty() && !stm.getEvents().isEmpty())
        {
          for(StateMachine nestedSm : allNested)
          {
            for (Event event : nestedSm.getEvents())
            {
              if(event.getIsInternal() == false && event != null)
              {
                nestedSMhasEvent=true;
              }
            }
          }
        
          if (nestedSMhasEvent == true)
          {
            String allNesEvenEnums = "";          
          
            for(Event event : stm.getEvents())
            {
              for(int i=0; i<evList.size(); i++)
              {
                if(evList.get(i).equals(event.getName()))
                {
                  sameEvName=true;
                }
              }
         
              if(sameEvName == false)
              {
                if (!event.isAutoTransition())
                {
                  if(!event.isUnspecified())
                  {
                    if(!evName.equals(event.getName()))
                    {
                      evList.add(event.getName());
             
                      if (allEnums.length() > 0)
                      {
                        allEnums += ", ";
                      }
                      allEnums += translate("eventMethod",event);
                      allEnums += "_M";
                      evName=event.getName();
                    }
                  }
                }
              }
              sameEvName=false;
            }
            
            boolean found = false;
            for (StateMachine nsm : stm.getNestedStateMachines())
            {
              for (Event event : nsm.getEvents())
              {
                for(int i=0; i<evList.size(); i++)
                {
                  if(evList.get(i).equals(event.getName()))
                  {
                    sameEvName=true;
                  }
                }
          
                if(sameEvName == false)
                {
                  if(event.getIsInternal() == false)
                  {
                    if (!event.isAutoTransition())
                    {
                      if(!event.isUnspecified())
                      {
                        found =true;
                      }
                    }
                  }
                }
                sameEvName=false;
              }
            }
            
            if(allEnums.length() > 0 && found == true)
            {
              allEnums += ", ";
            }
            
            for (StateMachine nsm : stm.getNestedStateMachines())
            {
              for (Event event : nsm.getEvents())
              {
                for(int i=0; i<evList.size(); i++)
                {
                  if(evList.get(i).equals(event.getName()))
                  {
                    sameEvName=true;
                  }
                }
          
                if(sameEvName == false)
                {
                  if(event.getIsInternal() == false)
                  {
                    if (!event.isAutoTransition())
                    {
                      if(!event.isUnspecified())
                      {
                        if(!evName.equals(event.getName()))
                        {
                          evList.add(event.getName());
              
                          if (allNesEvenEnums.length() > 0)
                          {
                            allNesEvenEnums += ", ";
                          }
                          allNesEvenEnums += translate("eventMethod",event);
                          allNesEvenEnums += "_M"; 
                          evName=event.getName();
                        } 
                      }
                    }
                  }
                }
                sameEvName=false;
              }
            }
            allEnums += allNesEvenEnums;
            nestedSMhasEvent=false;
          }
          else
          {
            for(Event event : stm.getEvents())
            {
              for(int i=0; i<evList.size(); i++)
              {
                if(evList.get(i).equals(event.getName()))
                {
                  sameEvName=true;
                }
              }
              
              if(sameEvName == false)
              {
                if (!event.isAutoTransition())
                {
                  if(!event.isUnspecified())
                  {
                    if( !evName.equals(event.getName()))
                    {
                      evList.add(event.getName());
             
                      if (allEnums.length() > 0)
                      {
                        allEnums += ", ";
                      }
                      allEnums += translate("eventMethod",event);
                      allEnums += "_M";
                      evName=event.getName();
                    }
                  }
                }
              }
              sameEvName=false;
            }
          }  
        }
        else if (!stm.getNestedStateMachines().isEmpty() && stm.getEvents().isEmpty())
        {
          for (StateMachine nsm : stm.getNestedStateMachines())
          {
            for (Event event : nsm.getEvents())
            {
              for(int i=0; i<evList.size(); i++)
              {
                if(evList.get(i).equals(event.getName()))
                {
                  sameEvName=true;
                }
              }
          
              if(sameEvName == false)
              {
                if(event.getIsInternal() == false)
                {
                  if (!event.isAutoTransition())
                  {
                    if(!event.isUnspecified())
                    {
                      if( !evName.equals(event.getName()))
                      {
                        evList.add(event.getName());
             
                        if (allEnums.length() > 0 )
                        {
                          allEnums += ", ";
                        }
                        allEnums += translate("eventMethod",event);
                        allEnums += "_M"; 
                        evName=event.getName();
                      }
                    } 
                  }
                }
              }
              sameEvName=false;
            }
          }
        }
        else
        {
          for(Event event : stm.getEvents())
          {
          
            for(int i=0; i<evList.size(); i++)
            {
              if(evList.get(i).equals(event.getName()))
              {
                sameEvName=true;
              }
            }
              
            if(sameEvName == false)
            {
              if (!event.isAutoTransition())
              {
                if(!event.isUnspecified())
                {
                  if( !evName.equals(event.getName()))
                  {
                    evList.add(event.getName());
              
                    if (allEnums.length() > 0)
                    {
                      allEnums += ", ";
                    }
                    allEnums += translate("eventMethod",event);
                    allEnums += "_M";
                    evName=event.getName();
                  }
                }
              }
            }
            sameEvName=false;
          }
        }
      }
      return allEnums;
    }
    
    else if ("listEventsForPooledSM".equals(keyName))
    {
      String allEnums = "";
      
      String evName="";
      boolean sameEvName=false;
      List<String> evList=new ArrayList<String>();         

      for(StateMachine sm : aClass.getStateMachines())
      {
        List<StateMachine> allNested = sm.getNestedStateMachines();
        boolean nestedSMhasEvent=false;       
        
        if (!sm.getNestedStateMachines().isEmpty() && !sm.getEvents().isEmpty())
        {
          for(StateMachine nestedSm : allNested)
          {
            for (Event event : nestedSm.getEvents())
            {
              if(event.getIsInternal() == false && event != null)
              {
                nestedSMhasEvent=true;
              }
            } 
          }

          if (nestedSMhasEvent == true)
          {
            String allNesEvenEnums = "";
            for(Event event : sm.getEvents())
            {
              for(int i=0; i<evList.size(); i++)
              {
                if(evList.get(i).equals(event.getName()))
                {
                  sameEvName=true;
                }
              }

              if(sameEvName == false)
              {
                if (!event.isAutoTransition())
                {
                  if(!event.isUnspecified())
                  {
                    if( !evName.equals(event.getName()))
                    {
                      evList.add(event.getName());
                      if (allEnums.length() > 0)
                      {
                        allEnums += ", ";
                      }
                      allEnums += translate("eventMethod",event);
                      allEnums += "_M";
                      evName=event.getName();
                    }
                  }
                }
              }
              sameEvName=false;
            }
            
            boolean foundNotSameEv = false;
            
            for (StateMachine nsm : sm.getNestedStateMachines())
            {
              for (Event event : nsm.getEvents())
              {
                for(int i=0; i<evList.size(); i++)
                {
                  if(!evList.get(i).equals(event.getName()))
                  {
                    foundNotSameEv=true;
                  }
                }
              }
            }
            if(foundNotSameEv == true)
            {
              allEnums += ", ";
            }
            for (StateMachine nsm : sm.getNestedStateMachines())
            {
              for (Event event : nsm.getEvents())
              {
                for(int i=0; i<evList.size(); i++)
                {
                  if(evList.get(i).equals(event.getName()))
                  {
                    sameEvName=true;
                  }
                }
          
                if(sameEvName == false)
                {
                  if(event.getIsInternal() == false)
                  {
                    if (!event.isAutoTransition())
                    {
                      if(!event.isUnspecified())
                      {
                        if( !evName.equals(event.getName()))
                        {
                          evList.add(event.getName());
             
                          if (allNesEvenEnums.length() > 0)
                          {
                            allNesEvenEnums += ", ";
                          }
                          allNesEvenEnums += translate("eventMethod",event);
                          allNesEvenEnums += "_M"; 
                          evName=event.getName();
                        }
                      }
                    }
                  }
                }
                sameEvName=false;
              }
            }
            allEnums += allNesEvenEnums;
            nestedSMhasEvent=false;
          }

          else
          {
            for(Event event : sm.getEvents())
            {

              for(int i=0; i<evList.size(); i++)
              {
                if(evList.get(i).equals(event.getName()))
                {
                  sameEvName=true;
                }
              }

              if(sameEvName == false)
              {
                if (!event.isAutoTransition())
                {
                  if(!event.isUnspecified())
                  {
                    if( !evName.equals(event.getName()))
                    {
                      evList.add(event.getName());
                      if (allEnums.length() > 0)
                      {
                        allEnums += ", ";
                      }
                      allEnums += translate("eventMethod",event);
                      allEnums += "_M";
                      evName=event.getName();
                    }
                  }
                }
              }
              sameEvName = false;
            }
          }  
        }
        else if (!sm.getNestedStateMachines().isEmpty() && sm.getEvents().isEmpty())
        {
          for (StateMachine nsm : sm.getNestedStateMachines())
          {
            for (Event event : nsm.getEvents())
            {
              for(int i=0; i<evList.size(); i++)
              {
                if(evList.get(i).equals(event.getName()))
                {
                  sameEvName=true;
                }
              }
          
              if(sameEvName == false)
              {
                if(event.getIsInternal() == false)
                {
                  if (!event.isAutoTransition())
                  {
                    if(!event.isUnspecified())
                    {
                      if(!evName.equals(event.getName()))
                      {
                        evList.add(event.getName());
             
                        if (allEnums.length() > 0 )
                        {
                          allEnums += ", ";
                        }
                        allEnums += translate("eventMethod",event);
                        allEnums += "_M"; 
                        evName=event.getName();
                      }
                    } 
                  }
                }
              }
              sameEvName=false;
            }
          }
        }
        else
        {
          for(Event event : sm.getEvents())
          {

            for(int i=0; i<evList.size(); i++)
            {
                if(evList.get(i).equals(event.getName()))
                {
                  sameEvName=true;
                }
            }

            if(sameEvName == false)
            {
              if (!event.isAutoTransition())
              {
                if(!event.isUnspecified())
                {
                  if(!evName.equals(event.getName()))
                  {
                    evList.add(event.getName());
                    if (allEnums.length() > 0)
                    {
                      allEnums += ", ";
                    }
                    allEnums += translate("eventMethod",event);
                    allEnums += "_M";
                    evName=event.getName();
                  }
                }
              }
            }
            sameEvName=false;
          }
        }
        
        
        if(sm.getNestedStateMachines().isEmpty())
        {
          for(State state : sm.getStates())
          {
            if(!state.getTransitions().isEmpty())
            {
              int cAutoTrans = 0;
              int cUnspec = 0;
              int cResult = 0;
              int cSize = state.getTransitions().size();
              for(Transition t : state.getTransitions())
              {
                if(t.getEvent().isAutoTransition())
                {
                  cAutoTrans++;
                }
                if(t.getEvent().isUnspecified())
                {
                  cUnspec++;
                }
              }
              cResult = cAutoTrans+cUnspec;
              if(cSize == cResult)
              {
                if (!allEnums.contains("null_M"))
                {
                  if(!allEnums.equals(""))
                  {
                    allEnums += ", null_M";
                  }
                  else
                  {
                    allEnums += "null_M";
                  }
                }
              }
            }
            else if(state.getTransitions().isEmpty())
            {
              if (!allEnums.contains("null_M")) 
              {
                if(!allEnums.equals(""))
                {
                  allEnums += ", null_M";
                }
                else
                {
                  allEnums += "null_M";
                }
              }
            }
          }
        }
        else if(!sm.getNestedStateMachines().isEmpty())
        {
          for(State state : sm.getStates())
          {
            if(!state.getTransitions().isEmpty())
            {
              int countAutoTrans = 0;
              int countUnspec = 0;
              int result = 0;
              int size = state.getTransitions().size();
              for(Transition t : state.getTransitions())
              {
                if(t.getEvent().isAutoTransition())
                {
                  countAutoTrans++;
                }
                if(t.getEvent().isUnspecified())
                {
                  countUnspec++;
                }
              }
              result = countAutoTrans+countUnspec;
              if(result == size)
              {
                if (!allEnums.contains("null_M")) 
                {
                  if(!allEnums.equals(""))
                  {
                    allEnums += ", null_M";
                  }
                  else
                  {
                    allEnums += "null_M";
                  }
                }
              }
            }
            else if(state.getTransitions().isEmpty())
            {
              if (!allEnums.contains("null_M")) 
              {
                if(!allEnums.equals(""))
                {
                  allEnums += ", null_M";
                }
                else
                {
                  allEnums += "null_M";
                }
              }
            }
          }
          for(StateMachine nsm : sm.getNestedStateMachines())
          {
            String exitEve=null;
            String enterEve=null;
            if (nsm.getParentState() != null)
            {
              State parentState = nsm.getParentState();
              exitEve = translate("exitMethod",parentState);
              enterEve = translate("enterMethod",parentState);
            }
        
            for(State state : nsm.getStates())
            {
              String allEventEnums = "";
              if(!state.getTransitions().isEmpty())
              { 
                int countNestedAutoTrans = 0;
                int countNestedUnspec = 0;
                int countExit = 0;
                int countEnter = 0;
                int nestedResult = 0;
                int nestedSize = state.getTransitions().size();
                for(Transition t : state.getTransitions())
                {
                  if(t.getEvent().isAutoTransition())
                  {
                    countNestedAutoTrans++;
                  }
                  if(t.getEvent().isUnspecified())
                  {
                    countNestedUnspec++;
                  }
                  if(t.getEvent().getName().equals(exitEve))
                  {
                    countExit++;
                  }
                  if(t.getEvent().getName().equals(enterEve))
                  {
                    countEnter++;
                  }
                }
                nestedResult = countNestedAutoTrans+countNestedUnspec+countExit+countEnter;
                if(nestedResult == nestedSize)
                {
                  if (!allEnums.contains("null_M")) 
                  {
                    if(!allEnums.equals(""))
                    {
                      allEnums += ", null_M";
                    }
                    else
                    {
                      allEnums += "null_M";
                    }
                  }
                }
              }
              else if(state.getTransitions().isEmpty())
              {
                if (!allEnums.contains("null_M")) 
                {
                  if(!allEnums.equals(""))
                  {
                    allEnums += ", null_M";
                  }
                  else
                  {
                    allEnums += "null_M";
                  }
                }
              }
            }        
          }
        }
      }
      return allEnums;
    }
    else if ("listQueuedMethods".equals(keyName))
    {
      String allMethodsEnum = "";
      Boolean foundQueuedMethod = false;
      
      for(Method m : aClass.getMethods())
      {
        if(m.getIsQueued())
        {
          if(!foundQueuedMethod)
          {
            allMethodsEnum += m.getName() + "_M";
            foundQueuedMethod = true;
          }
          else
          {
            allMethodsEnum += ", " + m.getName() + "_M";
          }
        }
      }
      return allMethodsEnum;
    } 
    
    return "UNKNOWN ID: " + keyName;
  }

  // line 1383 "../../../../src/Generator_CodeJava.ump"
   public String umpleCVarToLanguagePrimitive(String name, ConstraintVariable expr){
    if ((expr instanceof ConstraintAttribute)&&"Date".equals(((ConstraintAttribute)expr).getAttribute().getType()))
    {
      return name + ".getTime()";
    }
    else
    {
      return name;
    }
  }

  // line 1395 "../../../../src/Generator_CodeJava.ump"
   private String getImplementsForInterfaces(UmpleInterface uInterface){
    String implementedInterfaces = "";

      if (uInterface.hasExtendsInterface() == false){
          return "";
      }
      else{
          for (UmpleInterface aInterface : uInterface.getExtendsInterface())
          {
              implementedInterfaces += aInterface.getName() + ", " ; 
          }
          implementedInterfaces = implementedInterfaces.substring(0, implementedInterfaces.length()-2); 
          return " extends " + implementedInterfaces;
      }
  }

  // line 1412 "../../../../src/Generator_CodeJava.ump"
   private String getExtendAndImplements(UmpleClass uClass){
    String extendsString = "";
      String implementsString = "";

      extendsString = getExtendClassesNames(uClass);
      implementsString = getImplementsInterfacesNames(uClass);

      return extendsString + implementsString;
  }


  /**
   * the if(parent.getHasProxyPattern()) is neccessary to check if the parent's real name has changed because of proxy pattern mechanism
   */
  // line 1425 "../../../../src/Generator_CodeJava.ump"
   private String getExtendClassesNames(UmpleClass uClass){
    UmpleClass parent = uClass.getExtendsClass();  
      if (parent == null)
      {
          return "";
      }
      else{
        if(parent.getIsDistributed()&&uClass.getIsDistributed()&&(getModel().getDistributePattern()==1))
          return   " extends " + parent.getName()+"Impl"; 
        return   " extends " + parent.getName();   
      }
  }

  // line 1439 "../../../../src/Generator_CodeJava.ump"
   private String getImplementsInterfacesNames(UmpleClass uClass){
    String implementedInterfaces = "";

      if (uClass.hasParentInterface() == false)
      {
        return "";
      }
      else
      {
        for (UmpleInterface uInterface : uClass.getParentInterface())
        {
              implementedInterfaces += uInterface.getName() + "," ;
        }            
        implementedInterfaces = implementedInterfaces.substring(0, implementedInterfaces.length()-1); 
        return " implements " + implementedInterfaces;
      }
  }

  // line 1458 "../../../../src/Generator_CodeJava.ump"
   public String translate(String keyName, Attribute av){
    return translate(keyName,av,av.getIsList());
  }

  // line 1463 "../../../../src/Generator_CodeJava.ump"
   public String translate(String keyName, AssociationVariable av){
    return translate(keyName,av,av.isMany());
  }


  /**
   * Translates Date and Time values, has to be used for interfaces as they do not use attributes.
   */
  // line 1469 "../../../../src/Generator_CodeJava.ump"
   public String translateInterfaceValue(String value, String type){
    if (value == null)
    {
      return "null";
    }
      
    boolean isString = value.startsWith("\"") && value.endsWith("\"");
    if (isString && "Date".equals(type))
    {
      return "Date.valueOf("+ value +")";      
    }
    else if (isString && "Time".equals(type))
    {
      return "Time.valueOf("+ value +")";
    }
    else
    {
      return value;
    }
  }


  /**
   * Translates primitive data types to their Java equivalent. Used for interfaces as they do not use attributes.
   */
  // line 1492 "../../../../src/Generator_CodeJava.ump"
   public String translateInterfaceType(String type){
    return typeOf(type);
  }

  // line 1497 "../../../../src/Generator_CodeJava.ump"
   private String translate(String keyName, UmpleVariable av, boolean isMany){
    if (OneOrManyLookup.contains(keyName))
    {
      String realKeyName = isMany ? keyName + "Many" : keyName + "One";
      return translate(realKeyName,av,isMany);
    }
    
    String singularName = isMany ? getModel().getGlossary().getSingular(av.getName()) : av.getName();
    String pluralName = isMany ? av.getName() : getModel().getGlossary().getPlural(av.getName());

    if (UpperCasePluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCasePluralLookupMap.get(keyName),getUpperCaseName(pluralName));
    }
    else if (UpperCaseSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(UpperCaseSingularLookupMap.get(keyName),getUpperCaseName(singularName));
    }
    else if (AsIsPluralLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsPluralLookupMap.get(keyName),pluralName);
    }
    else if (AsIsSingularLookupMap.containsKey(keyName))
    {
      return StringFormatter.format(AsIsSingularLookupMap.get(keyName),singularName);
    }
    else if ("parameterValue".equals(keyName))
    {
      if (av.getValue() == null)
      {
        return "null";
      }
      
      
      
      boolean isString = av.getValue().startsWith("\"") && av.getValue().endsWith("\"");
      if (isString && "Date".equals(av.getType()))
      {
        return "Date.valueOf("+ av.getValue() +")";      
      }
      else if (isString && "Time".equals(av.getType()))
      {
        return "Time.valueOf("+ av.getValue() +")";
      }
      else if ("Float".equals(av.getType()))
      {
        return "(float) " + av.getValue();
      }
      else
      {
        return av.getValue();
      }
    }
    else if ("type".equals(keyName))
    {
      return getType(av);
    }
    else if ("typeMany".equals(keyName))
    {
      return isNullable(av) ? getType(av) : av.getType();
    }
    
    if (av instanceof AssociationVariable)
    {
      AssociationVariable assVar = (AssociationVariable)av;
      if ("callerArgumentsExcept".equals(keyName))
      {
        UmpleClass classToRemove = getModel().getUmpleClass(getType(assVar.getRelatedAssociation()));
        GeneratedClass generatedClassToRemove = classToRemove.getGeneratedClass();
        String   callerNameToRemove = translate("parameterOne",assVar);
        return StringFormatter.replaceParameter(generatedClassToRemove.getLookup("constructorSignature_caller"), callerNameToRemove, "this");
      }
      else if ("methodArgumentsExcept".equals(keyName))
      {
        UmpleClass classToRemove = getModel().getUmpleClass(getType(assVar.getRelatedAssociation()));
        GeneratedClass generatedClassToRemove = classToRemove.getGeneratedClass();
        String parameterNameToRemove = StringFormatter.format("{0} {1}", translate("type",assVar), translate("parameterOne",assVar));

        String classToRemoveConstructorString = StringFormatter.replaceParameter(generatedClassToRemove.getLookup("constructorSignature"), parameterNameToRemove, "");
        String [] arrayOfConstructorParameters = classToRemoveConstructorString.split(",");
        for(String constructorParameter : arrayOfConstructorParameters)
        {
          String tempConstructorParameter = constructorParameter.trim();
             if (tempConstructorParameter.length() < 1)
              continue;
            String parameterType = tempConstructorParameter.substring(0,tempConstructorParameter.indexOf(" "));

            if (classToRemove.hasEnum(parameterType))
            {
              classToRemoveConstructorString = classToRemoveConstructorString.replaceAll("\\b"+parameterType+"\\b", classToRemove.getName()+"."+parameterType);
            }
          
        }
        return classToRemoveConstructorString;

      }
      else if ("callerArgumentsForMandatory".equals(keyName))
      {
        UmpleClass classToLookup = getModel().getUmpleClass(getType(av));
        String lookup = "constructorSignature_mandatory_" + assVar.getRelatedAssociation().getName();
        String parameters = classToLookup.getGeneratedClass().getLookup(lookup);
        return parameters;
      }
      else if ("associationCanSet".equals(keyName))
      {
        String actualLookup = assVar.isMany() ? "associationCanSetMany" : "associationCanSetOne";
        return translate(actualLookup,av,isMany);
      }
    }
    else if (av instanceof Attribute)
    {
      Attribute attVar = (Attribute)av;
      if ("attributeCanSet".equals(keyName))
      {
        String actualLookup = attVar.getIsList() ? "attributeCanSetMany" : "attributeCanSetOne";
        return translate(actualLookup,av,isMany);
      }
      else if ("hasUniqueMethod".equals(keyName)) 
      {
        return "hasWith" + attVar.getUpperCaseName();
      } 
      else if ("getUniqueMethod".equals(keyName))
      {
        return "getWith" + attVar.getUpperCaseName();
      }
      else if ("uniqueMap".equals(keyName))
      {
        return attVar.getUmpleClass().getName().toLowerCase() + "s" + "By" + attVar.getUpperCaseName();
      }
    }
    
    return "UNKNOWN ID: " + keyName;
  }

  // line 1634 "../../../../src/Generator_CodeJava.ump"
   public void prepare(){
    List<UmpleClass> allClasses = new ArrayList<UmpleClass>(getModel().getUmpleClasses());
    for (UmpleClass aClass : allClasses)
    {
      prepare(aClass);
    }
    
    for (UmpleClass aClass : getModel().getUmpleClasses())
    {
      GeneratedClass genClass = aClass.getGeneratedClass();
      generateSecondaryConstructorSignatures(genClass);
      addImports(aClass,genClass);
    }
    
    if( getModel().getTracer().getName().equals("log4j") )
    {
      addLog4jVarImport();
    }
    
    if( getModel().getTracer().getName().equals("javaapi") )
    {
      addJavaLogAPIImport();
    }
    
    if( getModel().getTracer().getName().equals("lttngjni") )
    {
      addJavaLttngJniImport();
    }
    
    if( getModel().getTracer().getName().equals("lttng") )
    {
      addJavaLttngImport();
    }
    
    addRelatedImports();
  }

  // line 1671 "../../../../src/Generator_CodeJava.ump"
   private void addLog4jVarImport(){
    for(UmpleClass umpleClass : getModel().getUmpleClasses())
    {
      Attribute loggerAttr = new Attribute("logger", "Logger", "const", "LogManager.getLogger("+umpleClass.getName()+".class)", false, umpleClass);
      loggerAttr.addComment( new Comment("log4j version 2") );
      loggerAttr.addComment( new Comment("requires jars (log4j-api-2.0.1.jar) and (log4j-core-2.0.1.jar)") );
      umpleClass.addAttribute(loggerAttr);
      umpleClass.addDepend(new Depend("org.apache.logging.log4j.LogManager"));
      umpleClass.addDepend(new Depend("org.apache.logging.log4j.Logger"));
    }
  }

  // line 1683 "../../../../src/Generator_CodeJava.ump"
   private void addJavaLogAPIImport(){
    for(UmpleClass umpleClass : getModel().getUmpleClasses())
    {
      Attribute loggerAttr = new Attribute("logger", "Logger", "const", "Logger.getLogger("+umpleClass.getName()+".class.getName())", false, umpleClass);
      umpleClass.addAttribute(loggerAttr);
      umpleClass.addDepend(new Depend("java.util.logging.*"));
    }
  }

  // line 1692 "../../../../src/Generator_CodeJava.ump"
   private void addJavaLttngJniImport(){
    for(UmpleClass umpleClass : getModel().getUmpleClasses())
    {
      CodeBlock cb = new CodeBlock("LTTngUst.init();");
      CodeInjection init = new CodeInjection("after","constructor", cb, umpleClass);
      init.setIsInternal(true);
      umpleClass.addCodeInjection(init);
      umpleClass.addDepend(new Depend("org.lttng.ust.LTTngUst"));
    }
  }

  // line 1703 "../../../../src/Generator_CodeJava.ump"
   private void addJavaLttngImport(){
    for(UmpleClass umpleClass : getModel().getUmpleClasses())
    {
      // imports
      umpleClass.addDepend(new Depend("java.util.logging.*"));
      umpleClass.addDepend(new Depend("org.lttng.ust.agent.LTTngAgent"));
      // code injection in constructor
      CodeBlock cb = new CodeBlock("LTTngAgent lttngAgent = LTTngAgent.getLTTngAgent();");
      CodeInjection init = new CodeInjection("after","constructor", cb, umpleClass);
      init.setIsInternal(true);
      umpleClass.addCodeInjection(init);
      // logger static variable
      Attribute loggerAttr = new Attribute("logger", "Logger", "const", "Logger.getLogger("+umpleClass.getName()+".class.getName())", false, umpleClass);
      umpleClass.addAttribute(loggerAttr);
    }
  }

  // line 1722 "../../../../src/Generator_CodeJava.ump"
   public static  String typeOf(String aType){
    if (aType == null || aType.length() == 0)
    {
      return "String";
    }
    else if (aType.equals("Integer"))
    {
      return "int";
    }
    else if (aType.equals("Double"))
    {
      return "double";
    }
    else if(aType.equals("Float"))
    {
      return "float";
    }
    else if (aType.equals("Boolean"))
    {
      return "boolean";
    }
    else
    {
      return aType;
    }
  }

  // line 1750 "../../../../src/Generator_CodeJava.ump"
   public String nameOf(String name, boolean hasMultiple){
    if (name == null)
    {
      return null;
    }
    else if (hasMultiple)
    {
      //String pluralName = getModel().getGlossary().getPlural(name);
      return "all" + StringFormatter.toPascalCase(name);
    }
    else
    {
      //String singularName = getModel().getGlossary().getSingular(name);
      return "a" + StringFormatter.toPascalCase(name);
    }
  }


  /**
   * ------------------------
   * PRIVATE METHODS
   * ------------------------
   */
  // line 1773 "../../../../src/Generator_CodeJava.ump"
   private String getUpperCaseName(String name){
    return StringFormatter.toPascalCase(name);
  }

  // line 1778 "../../../../src/Generator_CodeJava.ump"
   private void injectIntoUnique(String method, String injection, String when, Attribute av, UmpleClass aClass){
    String code = StringFormatter.format(injection,
      translate("type", av),
      translate("parameterOne", av),
      translate("parameterOld", av),
      translate("getMethod", av),
      translate("hasUniqueMethod", av),
      translate("uniqueMap", av));
    CodeInjection set = new CodeInjection(when, method, code, aClass);
    aClass.addCodeInjection(set);
  }

  // line 1791 "../../../../src/Generator_CodeJava.ump"
   private void injectIntoUniqueSet(String injection, String when, Attribute av, UmpleClass aClass){
    injectIntoUnique(translate("setMethod", av), injection, when, av, aClass);
  }

  // line 1796 "../../../../src/Generator_CodeJava.ump"
   private void injectIntoUniqueDelete(String injection, String when, Attribute av, UmpleClass aClass){
    injectIntoUnique("delete", injection, when, av, aClass);
  }

  // line 1802 "../../../../src/Generator_CodeJava.ump"
   private void prepare(UmpleClass aClass){
    // here we will prepare the associationVariables
    if (aClass.getAssociations().length != 0)
    {
      for (AssociationVariable av : aClass.getAssociationVariables())
      {
        try
        {
          av.setIsSpecialization(aClass.getAssociation(aClass.indexOfAssociationVariable(av)).getIsSpecialization());
          if (!av.getIsSpecialization()) continue;
          Association relatedAssoc = aClass.getAssociation(aClass.indexOfAssociationVariable(av));
          av.setNeedsCommonCode( relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsCommonCode());
          av.setNeedsSuperCode( relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsSuperCode());          
          av.setMulChangedToOne( relatedAssoc.getEnd(av.getRelevantEnd()).getMulChangedToOne());
          av.setMulChangedToN( relatedAssoc.getEnd(av.getRelevantEnd()).getMulChangedToN());
          av.setReqSetCode( relatedAssoc.getEnd(av.getRelevantEnd()).getReqSetCode());
          av.setScName( relatedAssoc.getEnd(av.getRelevantEnd()).getSuperClassName());
        } 
        catch ( IndexOutOfBoundsException wat )
        {
          // In this situation, the association was either symmetric reflexive or there was some
          // issue with traits (it appears that it is possible for traits to have more associationVariables
          // than they have associations). Either way, these are currently unsupported with respect to specializations.
        } 
      }
    }
    
    if (aClass.getGeneratedClass() != null)
    {
      GeneratedClass genClass = aClass.createGeneratedClass(getModel());
      generateConstructorSignature(genClass);
    }
    else if (aClass.isRoot())
    {
      GeneratedClass genClass = aClass.createGeneratedClass(getModel());
      generateConstructorSignature(genClass);
      prepareCodeInjection(aClass);
    }
    else
    {
      UmpleClass parent = getModel().getUmpleClass(aClass.getExtendsClass().getName());
      prepare(parent);
      GeneratedClass genClass = aClass.createGeneratedClass(getModel());
      genClass.setParentClass(parent.getGeneratedClass());
      generateConstructorSignature(genClass);
      prepareCodeInjection(aClass);
    }
    
    prepareConstraints(aClass);
    
    Map<String,String> lookups = new HashMap<String,String>();
    String executeMethods = "public static void handle(String message) { getInstance().addTrace(message); }\n";
    executeMethods += "public void reset() { getInstance().traces.clear(); }";
    lookups.put("packageName","cruise.util");
    lookups.put("dependTracer","cruise.util.{0}Tracer");
    //lookups.put("dependDate","java.util.Date");
    lookups.put("stringTracer",executeMethods);
    lookups.put("startTime","(int)System.currentTimeMillis()");
    lookups.put("initial","handle(\"Time,Thread,UmpleFile,LineNumber,Class,Object,Operation,Name,Value\");");
    lookups.put("static","static{getInstance();}");
    lookups.put("consoleTracer", "public static void handle(String message)\n"+
                 "  {\n"+
                 "     System.err.println(message);\n"+
                 "  }");
    lookups.put("fileTracer","public static void handle(String message)\n"+
               "  {\n"+
               "    if(!open){\n"+
               "      try{\n"+
               "        // Open an output stream\n"+
               "        fout = new FileOutputStream (filename,true);\n"+
               "        stream = new PrintStream(fout);\n"+
               "      }\n"+
               "      catch (IOException e){\n"+
               "        System.err.println (\"Unable to write\");\n"+
               "        System.exit(-1);\n"+
               "      }\n"+
               "      open = true;\n"+
               "    }\n"+
               "    // Write traced Item information\n"+
               "    stream.println(message);\n"+
               "  }");
    lookups.put("log4jConfigDefault", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
        "<Configuration>\n"+
        "  <Appenders>\n"+
        "    <Console name=\"console\" target=\"SYSTEM_OUT\">\n"+
        "      <PatternLayout pattern=\"%d{yyy-MM-dd HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n\"/>\n"+
        "    </Console>\n"+
        "    <File name=\"file\" fileName=\"logs/trace.log\" immediateFlush=\"false\" append=\"false\">\n"+
        "      <PatternLayout pattern=\"%d{yyy-MM-dd HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n\"/>\n"+
        "    </File>\n"+
        "  </Appenders>\n"+
        "  <Loggers>\n"+
        "    <Root level=\"info\">\n"+
        "      <AppenderRef ref=\"console\"/>\n"+
        "    </Root>\n"+
        "  </Loggers>\n"+
        "</Configuration>");
    lookups.put("log4jConfig", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
        "<Configuration>\n"+
        "  <Appenders>\n"+
        "    <Console name=\"console\" target=\"SYSTEM_OUT\">\n"+
        "      <PatternLayout pattern=\"%d{yyy-MM-dd HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n\"/>\n"+
        "    </Console>\n"+
        "    <File name=\"file\" fileName=\"logs/trace.log\" immediateFlush=\"false\" append=\"false\">\n"+
        "      <PatternLayout pattern=\"%d{yyy-MM-dd HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n\"/>\n"+
        "    </File>\n"+
        "  </Appenders>\n"+
        "  <Loggers>\n"+
        "{0}"+
        "  </Loggers>\n"+
        "</Configuration>");
    lookups.put("log4jLogger",
        "    <Root level=\"{0}\">\n"+
        "{1}"+
        "    </Root>\n");
    lookups.put("log4jAppender",
        "      <AppenderRef ref=\"{0}\" level=\"{1}\"/>\n");
    lookups.put("handleMethod","public static void handle(String name, String value, String... extra)\n  {\n {0} \n  }");
    lookups.put("ifStatement","  if ( {0} )\n  {\n  {1}\n  }");
    lookups.put("callHandle","{0}.handle(name+\" = \"+value);");
    GeneratorHelper.prepareAllTracers(this,getModel(),aClass,lookups);
    //prepareAllTraces(this,getModel(),aClass,lookups);
    
    //Add  entry / exit methods to start and stop the timed events in Java
    boolean hasTimedEvents = false;
    boolean foundQueued = false;    
    boolean foundPooled = false;
    
    for (StateMachine sm : aClass.getStateMachines())
    {
      // Make sure state machine name is decapitalized
      if(Character.isUpperCase(sm.getName().charAt(0))){
        char firstLetter = Character.toLowerCase(sm.getName().charAt(0));
        String decapitalizedName = firstLetter + sm.getName().substring(1);
        sm.setName(decapitalizedName);
      }
      prepareNestedStatesFor(sm,null,0);
      hasTimedEvents = prepareTimedEvents(sm) || hasTimedEvents;
      if(sm.isQueued()){
        foundQueued = true;
      }
      if(sm.isPooled()){
        foundPooled = true;
      }
    }
        
    if (hasTimedEvents)
    {
      if(!foundQueued && !foundPooled)
      {
        aClass.addDepend(new Depend("java.util.*"));
      }
    } 
    
    boolean hasTimedEvent_NestedState = false;
    for (StateMachine sm : aClass.getStateMachines())
    {
      if(!sm.getNestedStateMachines().isEmpty())
      {
        for (StateMachine nsm : sm.getNestedStateMachines())
        {
          for (Event event : nsm.getEvents())
          {
            if(event.getIsTimer())
            {
              hasTimedEvent_NestedState =  true;
            }
          }
        }
      }
    }
     
   
    if (hasTimedEvent_NestedState)
    {
      if(!foundQueued && !foundPooled)
      {
        aClass.addDepend(new Depend("java.util.*"));
      }
    }
  }

  // line 1985 "../../../../src/Generator_CodeJava.ump"
   private void prepareCodeInjection(UmpleClass aClass){
    prepareCodeInjectionForAttributes(aClass);
    prepareCodeInjectionForAssociations(aClass);
  }

  // line 1991 "../../../../src/Generator_CodeJava.ump"
   private void prepareCodeInjectionForAttributes(UmpleClass aClass){
    for(Attribute av : aClass.getAttributes())
    {
      prepareCodeInjectionForAttribute(aClass, av);
    }
  }

  // line 1999 "../../../../src/Generator_CodeJava.ump"
   private void prepareCodeInjectionForAssociations(UmpleClass aClass){
    for(AssociationVariable av : aClass.getAssociationVariables())
    {
      prepareCodeInjectionForAssociation(aClass, av);
    }
  }

  // line 2007 "../../../../src/Generator_CodeJava.ump"
   private void prepareCodeInjectionForAttribute(UmpleClass aClass, Attribute av){
    if ((av.isImmutable() || aClass.getKey().isMember(av)))
    {
      String code = StringFormatter.format("if (!{0}) { return false; }",translate("attributeCanSet",av));
      CodeInjection set = new CodeInjection("before",translate("setMethod",av) , code, aClass);
      set.setIsInternal(true);
      aClass.addCodeInjection(set);
    }
    
    if (aClass.getKey().isMember(av))
    {
      String code = StringFormatter.format("if (!{0}) { return false; }",translate("attributeCanSet",av));
      String methods = StringFormatter.format("{0},{1},{2},{3}",translate("addMethod",av),translate("removeMethod",av),translate("setManyMethod",av),translate("resetMethod",av));
      CodeInjection inject = new CodeInjection("before", methods, code, aClass);
      inject.setIsInternal(true);
      aClass.addCodeInjection(inject);
    }
      
    if (av.getIsUnique())
    {
      injectIntoUniqueSet(
        av.getType() + " {2} = {3}();" + "\n" +
        "if ({2} != null && {2}.equals({1})) {" + "\n" + 
        "  return true;" + "\n" +
        "}" + "\n" + 
        "if ({4}({1})) {" + "\n" + 
        "  return wasSet;" + "\n" +
        "}", "before", av, aClass);
      injectIntoUniqueSet(
        "if ({2} != null) {" + "\n" +
        "  {5}.remove({2});" + "\n" +
        "}" + "\n" +
        "{5}.put({1}, this);", "after", av, aClass);
      injectIntoUniqueDelete(
        "{5}.remove({3}());", "before", av, aClass);
    }
  }

  // line 2046 "../../../../src/Generator_CodeJava.ump"
   private void prepareCodeInjectionForAssociation(UmpleClass aClass, AssociationVariable av){
    if (aClass.getKey().isMember(av))
    {
      String code = StringFormatter.format("if (!{0}) { return false; }",translate("associationCanSet",av));
      String methods = StringFormatter.format("{0},{1},{2},{3},{4}",translate("addMethod",av),translate("removeMethod",av),translate("setManyMethod",av),translate("setMethod",av),translate("resetMethod",av));
      CodeInjection inject = new CodeInjection("before",methods , code, aClass);
      inject.setIsInternal(true);
      aClass.addCodeInjection(inject);
    }
      
    if (av.isImmutable())
    {
      String code = StringFormatter.format("if (!{0}) { return false; }\n{0} = false;",translate("associationCanSet",av));
      String methods = StringFormatter.format("{0},{1}",translate("setManyMethod",av),translate("setMethod",av));
      CodeInjection set = new CodeInjection("before", methods, code, aClass);
      set.setIsInternal(true);
      aClass.addCodeInjection(set);
    }
      
    if (av.isMany())
    {
      String code = StringFormatter.format("if ({0}.contains({1})) { return false; }",translate("attributeMany",av),translate("parameterOne",av));
      CodeInjection set = new CodeInjection("before",translate("addMethod",av) , code, aClass);
      set.setIsInternal(true);
      aClass.addCodeInjection(set);
    }
      
    if(av.isSorted())
    { 
      String codeblock = 
        "{ |x, y| "+
              "x.get_"+av.getPriority() +"() <=> "+ 
              "y.get_"+ av.getPriority() +"()"+
              "}";
      String java_code = StringFormatter.format("if(wasAdded)\n    Collections.sort({0}, {0}Priority);\n",translate("attributeMany",av));
      String php_code = StringFormatter.format("if(wasAdded)\n    usort($this->{0}, $this->{0}Priority);\n",translate("attributeMany",av));
      String ruby_code = StringFormatter.format("@{0}.sort! "+codeblock+" if wasAdded\n",translate("attributeMany",av));
      String methods = translate("addMethod",av);
      CodeInjection set = new CodeInjection("after", methods,"", aClass);
      CodeBlock cb = new CodeBlock();
      cb.setCode("Java",java_code);
      cb.setCode("Php",php_code);
      cb.setCode("Ruby",ruby_code);
      set.setSnippet(cb);
      aClass.addCodeInjection(set);
    }
  }

  // line 2095 "../../../../src/Generator_CodeJava.ump"
   private boolean prepareTimedEvents(StateMachine sm){
    boolean hasTimedEvents = false;
    if(sm.getNestedStateMachines().isEmpty())
    {
      for (State s : sm.getStates())
      {
        for (Transition t : s.getTransitions())
        {
          Event e = t.getEvent();
          if (!e.getIsTimer())
          {
            continue;
          }
          hasTimedEvents = true;
          Action entryAction = new Action(StringFormatter.format("{0}();",translate("eventStartMethod",e)));
          entryAction.setActionType("entry");
        
          Action exitAction = new Action(StringFormatter.format("{0}();",translate("eventStopMethod",e)));
          exitAction.setActionType("exit");

          t.getFromState().addAction(entryAction);
          t.getFromState().addAction(exitAction);
        }
      }
    } 
    else if(!sm.getNestedStateMachines().isEmpty())
    {
		/**
		fix for issue 552 
		**/
		
		for (State s : sm.getStates())
      {
		
        for (Transition t : s.getTransitions())
        {
          Event e = t.getEvent();
	
          if (!e.getIsTimer())
          {
            continue;
          }
          hasTimedEvents = true;
			
          Action entryAction = new Action(StringFormatter.format("{0}();",translate("eventStartMethod",e)));
          entryAction.setActionType("entry");
        
          Action exitAction = new Action(StringFormatter.format("{0}();",translate("eventStopMethod",e)));
          exitAction.setActionType("exit");

          t.getFromState().addAction(entryAction);
          t.getFromState().addAction(exitAction);
        }
      }
      for (StateMachine nsm : sm.getNestedStateMachines())
      {
        for (State s : nsm.getStates())
        {
          for (Transition t : s.getTransitions())
          {
            Event e = t.getEvent();
            if (!e.getIsTimer())
            {
              continue;
            }
            hasTimedEvents = true;
            Action entryAction = new Action(StringFormatter.format("{0}();",translate("eventStartMethod",e)));
            entryAction.setActionType("entry");
        
            Action exitAction = new Action(StringFormatter.format("{0}();",translate("eventStopMethod",e)));
            exitAction.setActionType("exit");

            t.getFromState().addAction(entryAction);
            t.getFromState().addAction(exitAction);
          }
        }
      }
    }
    return hasTimedEvents;
  }

  // line 2177 "../../../../src/Generator_CodeJava.ump"
   private void prepareDoActivityThread(StateMachine sm){
    for(State state : sm.getStates())
    {
      for (Activity activity : state.getActivities())
      {
          String code = StringFormatter.format("if ({0} != null) { {0}.interrupt(); }",translate("doActivityThread",activity));
          Action interruptAction = new Action(code);
          interruptAction.setIsInternal(true);
          interruptAction.setActionType("exit");
          state.addAction(interruptAction);

          String entryCode = StringFormatter.format("{0} = new DoActivityThread(this,\"{1}\");",translate("doActivityThread",activity),translate("doActivityMethod",activity));
          Action entryAction = new Action(entryCode);
          entryAction.setIsInternal(true);
          entryAction.setActionType("entry");
          state.addAction(entryAction);
      }
    }
  }


  /**
   * Issue 140 - For final states in concurrent state machines, we need to make sure that all
   * state machines within a region are in their final states before calling delete()
   */
  // line 2201 "../../../../src/Generator_CodeJava.ump"
   private String prepareConcurrentFinalStatesFor(State concurrentRegion, StateMachine currentSm){
    List<State> finalStatesInRegion = new ArrayList<State>();
     String deleteActionCode = "";
     
     for (StateMachine nested : concurrentRegion.getNestedStateMachines()) {
       finalStatesInRegion.addAll(nested.getFinalStates());
     }
     
     if (!finalStatesInRegion.isEmpty()) {
       deleteActionCode = "if (";
       for (int i = 0; i < finalStatesInRegion.size() - 1; i++) {
         if (!finalStatesInRegion.get(i).getStateMachine().equals(currentSm)) {
           StateMachine sameRegionSm = finalStatesInRegion.get(i).getStateMachine();
           if (i + 1 == finalStatesInRegion.size() - 1 && finalStatesInRegion.get(finalStatesInRegion.size() - 1).getStateMachine().equals(currentSm)) {
             deleteActionCode += StringFormatter.format("{0} == {1}.{2}) { {3}(); }", 
                 translate("stateMachineOne", sameRegionSm),
                 translate("type", sameRegionSm),
                 translate("stateOne", finalStatesInRegion.get(i)),
                 translate("deleteMethod",currentSm.getUmpleClass()));
           } else {
             deleteActionCode += StringFormatter.format("{0} == {1}.{2} && ", 
                 translate("stateMachineOne", sameRegionSm),
                 translate("type", sameRegionSm),
                 translate("stateOne", finalStatesInRegion.get(i)));
           }
         }
       }
       
       if (!finalStatesInRegion.get(finalStatesInRegion.size() - 1).getStateMachine().equals(currentSm)) {
         StateMachine sameRegionSm = finalStatesInRegion.get(finalStatesInRegion.size() - 1).getStateMachine();
         deleteActionCode += StringFormatter.format("{0} == {1}.{2}) { {3}(); }", 
                                                    translate("stateMachineOne", sameRegionSm),
                                                    translate("type", sameRegionSm),
                                                    translate("stateOne", finalStatesInRegion.get(finalStatesInRegion.size() - 1)),
                                                    translate("deleteMethod",currentSm.getUmpleClass()));
       } else if (deleteActionCode.equals("if (")) {
         deleteActionCode = StringFormatter.format("{0}();",translate("deleteMethod",currentSm.getUmpleClass()));
       }
     } else {
       deleteActionCode = StringFormatter.format("{0}();",translate("deleteMethod",currentSm.getUmpleClass()));
     }
     
     return deleteActionCode;
  }

  // line 2246 "../../../../src/Generator_CodeJava.ump"
   private void prepareFinalStatesFor(StateMachine sm){
    Map<String,String> lookups = new HashMap<String,String>();
    String deleteActionCode = "";
    
    if (sm.getParentState() != null) {
      State concurrentRegion = sm.getParentState().getConcurrentRegion();
      // Issue 140
      if (concurrentRegion != null) {
        deleteActionCode = prepareConcurrentFinalStatesFor(concurrentRegion, sm);
      } else {
        deleteActionCode = StringFormatter.format("{0}();",translate("deleteMethod",sm.getUmpleClass())); 
      }
    } else {
      deleteActionCode = StringFormatter.format("{0}();",translate("deleteMethod",sm.getUmpleClass())); 
    }
    
    lookups.put("deleteActionCode",deleteActionCode);
    GeneratorHelper.prepareFinalState(sm,lookups);
  }

  // line 2267 "../../../../src/Generator_CodeJava.ump"
   private void prepareNestedStatesFor(StateMachine sm, StateMachine parentSm, int concurrentIndex){
    prepareFinalStatesFor(sm);  
    prepareDoActivityThread(sm); 
    if (sm.getParentState() != null && sm.getStartState() != null)
    {
      State parentState = sm.getParentState();
      while(parentState.getStateMachine().getParentState() != null)
      {
        parentState = parentState.getStateMachine().getParentState();
      }
      Map<String,String> lookups = new HashMap<String,String>();
      // Issue 935 - To be added to the parent state in prepareNestedStateMachine
      lookups.put("parentExitActionCode", StringFormatter.format("{0}();", translate("exitMethod", sm)));
      // Issue 935 - Exit action to be added to each state in the state machine to set it to null
      lookups.put("setSmToNullExitActionCode", StringFormatter.format("{0}({1}.{2});", translate("setMethod", sm), translate("type", sm), translate("stateNull", sm)));
      lookups.put("parentEntryActionCode",StringFormatter.format("if ({0} == {1}.{2}) { {3}({1}.{4}); }"
          ,translate("stateMachineOne",sm)
          ,translate("type",sm)
          ,translate("stateNull",sm)
          ,translate("setMethod",sm)
          ,translate("stateOne",sm.getStartState()))
      );
      GeneratorHelper.prepareNestedStateMachine(sm,concurrentIndex,lookups);    
    }

    for (State s : sm.getStates())
    {
      int nestedSmIndex = 0;
      for (StateMachine nestedSm : s.getNestedStateMachines())
      {
        prepareNestedStatesFor(nestedSm,sm,nestedSmIndex);
        nestedSmIndex += 1;
      }
    }
    
    Map<String,String> lookups = new HashMap<String,String>();
    lookups.put("callEvent","{0}();");
    GeneratorHelper.prepareAutoTransitions(sm,this,lookups);
  }

  // line 2308 "../../../../src/Generator_CodeJava.ump"
   private void generateConstructorSignature(GeneratedClass genClass){
    StringBuffer signature = new StringBuffer();
    StringBuffer signatureCaller = new StringBuffer();
    
    UmpleClass uClass = genClass.getUClass();
    
    for (Attribute av : uClass.getAttributes()) 
    {
      if (av.getIsAutounique() || av.getIsList() || "defaulted".equals(av.getModifier()) || av.getIsLazy() || ( av.getValue() != null && ! av.getModifier().equals("fixml")))
      {
        continue;
      }

      if (signature.length() > 0) 
      {
        signature.append(", ");
        signatureCaller.append(", ");
      }
        
      signature.append(StringFormatter.format("{0} {1}",typeOf(av),nameOf(av)));
      signatureCaller.append(nameOf(av));      
    }

    // This is the list of association variables that might use variable arguments in the constructor
    List<AssociationVariable> manyConstructorAVs = new ArrayList<AssociationVariable>();
    
    for (AssociationVariable av : uClass.getAssociationVariables()) 
    {
      if (!associationShouldAppearInConstructor(av))
      {
        continue;
      }
      if (av.isMany())
      {
        manyConstructorAVs.add(av);
        continue;
      }
      
      if (signature.length() > 0) 
      {
        signature.append(", ");
        signatureCaller.append(", ");
      }
      
      signature.append(StringFormatter.format("{0} {1}",typeOf(av),nameOf(av)));
      signatureCaller.append(nameOf(av));      
    }
    
    // Insert the parent class's contructor signature, with attention given to special
    // cases where the signature is modified if variable arguments are present.
    
    boolean parentConstructorContainsMany = false;   
    if (uClass.getExtendsClass() != null) 
    {
      GeneratedClass parent = genClass.getParentClass();
      String parentSignature = parent.getLookup("constructorSignature");
      String parentSignatureCaller = parent.getLookup("constructorSignature_caller");
      
      String parentSignatureToPrepend = "";
      String parentSignatureCallerToPrepend = "";
    
      if ((signature.length() == 0) && (manyConstructorAVs.size() == 0))
      {
        // if the child class will add nothing to the signature
        signature.append(parentSignature);
        signatureCaller.append(parentSignatureCaller);
      }
      else if (parentSignature.contains("..."))
      {
        if (manyConstructorAVs.size() > 0)
        {
          // if multiple associations in the constructor could use variable arguments, switch to using arrays.
          parentConstructorContainsMany = true;
          parentSignatureToPrepend = parentSignature.replace("...", "[]");
          parentSignatureCallerToPrepend = parentSignatureCaller;
        }
        else
        {
          //else push the variable argument parameter to the end of the constructor. 
               
          int idx = Math.max(parentSignature.lastIndexOf(","),0);
          if ((signature.length() > 0) && (idx == 0))
          {
            // if there was no comma in the parent signature, compensate.
            signature.append(", ");
            signatureCaller.append(", ");
          }   
          signature.append(parentSignature.substring(idx));
          parentSignatureToPrepend = parentSignature.substring(0, idx);
          
          idx = Math.max(parentSignatureCaller.lastIndexOf(","),0);
          signatureCaller.append(parentSignatureCaller.substring(idx));
          parentSignatureCallerToPrepend = parentSignatureCaller.substring(0, idx);
        }
      }
      else 
      {
        // else simply prepend the parent signature, as-is, to the child signature.
        parentSignatureToPrepend = parentSignature;
        parentSignatureCallerToPrepend = parentSignatureCaller;
        
        // also, check if the presence of arrays in the parent signature signals that the child
        // signature should use arrays for arguments that could otherwise use variable arguments.
        if (parentSignature.contains("[]"))
        {
          parentConstructorContainsMany = true;
        }
      }
      
      // prepend the parent signature to the child signature
      if (parentSignatureToPrepend.length() > 0)
      {
        if (signature.length() > 0)
        {
          signature.insert(0, parentSignatureToPrepend + ", ");
          signatureCaller.insert(0, parentSignatureCallerToPrepend + ", ");
        }
        else
        {
          signature.append(parentSignatureToPrepend);
          signatureCaller.append(parentSignatureCallerToPrepend);
        }
      }
    }
    
    // finally, append constructor parameter(s) that could be variable arguments or arrays depending on circumstances
    for (AssociationVariable manyAV : manyConstructorAVs)
    {
      if (signature.length() > 0) 
      {
        signature.append(", ");
        signatureCaller.append(", ");
      }
      String typeModifier = ((manyConstructorAVs.size() > 1) || (parentConstructorContainsMany)) ? "[]" : "...";
      signature.append(StringFormatter.format("{0}{1} {2}",typeOf(manyAV),typeModifier,nameOf(manyAV)));
      signatureCaller.append(nameOf(manyAV));     
    }

    genClass.setLookup("constructorSignature", signature.toString());
    genClass.setLookup("constructorSignature_caller", signatureCaller.toString());
  }

  // line 2452 "../../../../src/Generator_CodeJava.ump"
   private boolean associationShouldAppearInConstructor(AssociationVariable av){
    boolean shouldAppear = true;
    AssociationVariable relatedAv = av.getRelatedAssociation();
    
    if ((av.getMultiplicity().getLowerBound() == 0 && !av.isImmutable()) || !av.getIsNavigable())
    {
      shouldAppear = false;
    }   
    else if (relatedAv.getIsNavigable())
    {
      if (av.isMandatoryMany() && relatedAv.isMandatory())
      {
        shouldAppear = false;
      }
      else if ((av.isMN() || av.isN()) && relatedAv.isOptionalN())
      {
        shouldAppear = false;
      }
      else if (av.getIsSpecialization())
      {
        shouldAppear = false;
      }
    }
    return shouldAppear;
  }

  // line 2479 "../../../../src/Generator_CodeJava.ump"
   private void generateSecondaryConstructorSignatures(GeneratedClass genClass){
    UmpleClass uClass = genClass.getUClass();
    
    String mandatorySignature = genClass.getLookup("constructorSignature");
    
    for (AssociationVariable av : uClass.getAssociationVariables()) 
    {
      AssociationVariable relatedAv = av.getRelatedAssociation();
      if (av.isOnlyOne() && relatedAv.isOnlyOne() && av.getIsNavigable() && relatedAv.getIsNavigable())
      {
        UmpleClass relatedClass = getModel().getUmpleClass(av.getType());
        GeneratedClass relatedGen = relatedClass.getGeneratedClass();
        
        String selfParameter = StringFormatter.format("{0} {1}",typeOf(relatedAv),nameOf(relatedAv));
        String selfFor = StringFormatter.format("For{0}",av.getUpperCaseName());
        String newParameters = relatedGen.getLookup("constructorSignature");
        newParameters = StringFormatter.replaceParameter(newParameters, selfParameter, null);
        newParameters = StringFormatter.appendParameter(newParameters, selfFor);

        String relatedParameter = StringFormatter.format("{0} {1}",typeOf(av),nameOf(av));
        
        mandatorySignature = StringFormatter.replaceParameter(mandatorySignature, relatedParameter, newParameters);
        genClass.setLookup("constructorSignature_mandatory", mandatorySignature);
        
        String relatedFor = StringFormatter.format("For{0}",relatedAv.getUpperCaseName());
        String relatedCaller = genClass.getLookup("constructorSignature_caller");
        String relatedCallerParameter = nameOf(av);
        String mandatorySignatureCaller = StringFormatter.replaceParameter(relatedCaller, relatedCallerParameter, "_THIS_");
        mandatorySignatureCaller = StringFormatter.appendParameter(mandatorySignatureCaller, relatedFor);
        mandatorySignatureCaller = StringFormatter.replaceParameter(mandatorySignatureCaller, "_THIS_" + relatedFor, "this");
        
        String mandatoryCallerId = "constructorSignature_mandatory_" + relatedAv.getName();
        relatedGen.setLookup(mandatoryCallerId, mandatorySignatureCaller);
      }
    }
  }

  // line 2517 "../../../../src/Generator_CodeJava.ump"
   private void addRelatedImports(){
    for (UmpleClass aClass : getModel().getUmpleClasses())
    {
      GeneratedClass genClass = aClass.getGeneratedClass();

      //add interface imports
      if (aClass.hasParentInterface())
      {
        for(UmpleInterface interfaceParent: aClass.getParentInterface())
        { 
          if (!aClass.getPackageName().equals(interfaceParent.getPackageName()))
          {
            genClass.addMultiLookup("import", interfaceParent.getPackageName() + ".*");  
          }
        }
      }
      
      if (aClass.getExtendsClass() != null)
      {
        if (!aClass.getPackageName().equals(aClass.getExtendsClass().getPackageName()))
        {
          genClass.addMultiLookup("import", aClass.getExtendsClass().getPackageName() + ".*");  
        }
        
        //add related imports in multilevel
        UmpleClass rootUClass = aClass;
        while (!rootUClass.isRoot()) 
        {
            addImports(rootUClass.getExtendsClass(), genClass);
            rootUClass = rootUClass.getExtendsClass();
        }
      }
      
      for (AssociationVariable av : aClass.getAssociationVariables()) 
      {
        if (!av.getIsNavigable())
        {
          continue;
        }
        
        AssociationVariable relatedAssociation = av.getRelatedAssociation();
        if (relatedAssociation.isOnlyOne())
        { 
          UmpleClass relatedClass = getModel().getUmpleClass(av.getType());
          while (relatedClass != null)
          {
            addAttributeImports(relatedClass,genClass);
            relatedClass = relatedClass.getExtendsClass();
          }
        }
      }
    }
  }

  // line 2572 "../../../../src/Generator_CodeJava.ump"
   private void addAttributeImports(UmpleClass aClass, GeneratedClass genClass){
    String timeImport = "java.sql.Time";
    String dateImport = "java.sql.Date";
    String utilImport = "java.util.*";
    
    for (Attribute av : aClass.getAttributes()) 
    {
      
      if ("Time".equals(av.getType()))
      {
        genClass.addMultiLookup("import", timeImport);
      }
      else if ("Date".equals(av.getType()))
      {
        genClass.addMultiLookup("import", dateImport);
      }
      
      if (av.getIsList() || av.getIsUnique())
      {
        genClass.addMultiLookup("import", utilImport);
      }
    }
  }

  // line 2596 "../../../../src/Generator_CodeJava.ump"
   private void addImports(UmpleClass aClass, GeneratedClass genClass){
    addAttributeImports(aClass,genClass);
      
    for (AssociationVariable av : aClass.getAssociationVariables()) 
    {
      if (!av.getIsNavigable())
      {
        continue;
      }
      
      if (av.isMany())
      {
        genClass.addMultiLookup("import", "java.util.*");
      }
    }
    
    for (String namespace : aClass.getNamespaces())
    {
      if (!namespace.equals(aClass.getPackageName()))
      {
        genClass.addMultiLookup("import", namespace + ".*");
      }
    }

    for (StateMachine sm : aClass.getStateMachines())
    {
      if (sm.isQueued() || sm.isPooled())
      {
        genClass.addMultiLookup("import", "java.util.*");
        genClass.addMultiLookup("import", "java.lang.Thread");
        break;
      }
    }
    
    for (Method m : aClass.getMethods())
    {
      if(m.getIsQueued())
      {
        genClass.addMultiLookup("import", "java.util.*");
        genClass.addMultiLookup("import", "java.lang.Thread");
        break;
      }
    }
    if(getModel().getDistributed()==true)
    {
      if(aClass.getIsDistributed()==false)
      {
        genClass.addMultiLookup("import", "java.io.Serializable");
        if(getModel().getDistributeTechnology().equals("WS"))
        {
          genClass.addMultiLookup("import", "javax.xml.bind.annotation.XmlAccessorType");
          genClass.addMultiLookup("import", "javax.xml.bind.annotation.XmlAccessType");
        }
        {

        }
      }
    }

    if(aClass.getIsDistributed()==true)
    { 
        if(getModel().getDistributePattern()==0){
          genClass.addMultiLookup("import", "java.io.Serializable");
          if(aClass.getDistributeTechnology().equals("WS"))
          {
            genClass.addMultiLookup("import", "javax.xml.namespace.QName");
            genClass.addMultiLookup("import", "java.net.URL");
            genClass.addMultiLookup("import", "javax.xml.ws.Service");
            genClass.addMultiLookup("import", "javax.xml.ws.Endpoint");
            genClass.addMultiLookup("import", "javax.jws.WebService");
            genClass.addMultiLookup("import", "javax.xml.bind.Unmarshaller");
            genClass.addMultiLookup("import", "javax.xml.bind.annotation.*");
          } 
        } 
        else if (getModel().getDistributePattern()==1)
        {
          if(aClass.getDistributeTechnology()=="RMI")
          {
            genClass.addMultiLookup("import", "java.rmi.RemoteException");
            genClass.addMultiLookup("import", "java.rmi.server.UnicastRemoteObject");
          }
      }
    }

    if(aClass.getIsInternalSerializable()&&!getModel().getDistributed()&&!aClass.getIsDistributed())
    {
      genClass.addMultiLookup("import", "java.io.Serializable");
    }
  }

  // line 2686 "../../../../src/Generator_CodeJava.ump"
   private String nameOf(Attribute av){
    return nameOf(av.getName(),av.getIsList());
  }

  // line 2691 "../../../../src/Generator_CodeJava.ump"
   private String nameOf(AssociationVariable av){
    boolean hasMultiple = av.isMany();
    return nameOf(av.getName(),hasMultiple);
  }

  // line 2697 "../../../../src/Generator_CodeJava.ump"
   private static  String typeOf(UmpleVariable var){
    String aType = var.getType();
    return typeOf(aType);
  }

  // line 2703 "../../../../src/Generator_CodeJava.ump"
   private String WriteProxyFiles(String classContents, UmpleClass aClass, String path) throws IOException{
    JavaDistributedTemplates templates= new JavaDistributedTemplates();
    StringBuilder classContent= new StringBuilder("");
    String classPackageName= aClass.getPackageName().length() == 0 ? "" : aClass.getPackageName() + "."; 
    String NL = System.getProperty("line.separator");
    String proxyName=aClass.getName();
    StringBuilder proxyContent = new StringBuilder("");
    StringBuilder remoteContent = new StringBuilder("");
    StringBuilder remoteInterfaceContent = new StringBuilder("");
    StringBuilder proxyPrecode = new StringBuilder("");
    String remoteName=aClass.getName()+"Remote";
    String extendsRemoteProxy="";
    String methodPostfix="";
    String proxyImplements="";
    String realClassName=aClass.getName();
    String parentDefaultInterface="";
    String extendsProxy="";
    String remoteInterfaceName="I"+aClass.getName()+"Impl";
    String remoteClassSuperCall="";
    String remoteClasssetRealObjectSuperCall="";
    UmpleInterface parentInterface=null;
    List<String> methodBlacklist=new ArrayList<String>();
    if(getModel().getDistributePattern()==0)
    {
      methodPostfix="Impl";
    }
    if(getModel().getDistributePattern()==2)
      remoteInterfaceName=aClass.getName();
    /* if distributed class has a distributable interface parent and does not need parent interface the remote interface needs to know the name of it
    */    

    if(aClass.getExtendsClass()!=null){
      extendsProxy=" extends "+aClass.getExtendsClass().getName();
      extendsRemoteProxy= " extends "+aClass.getExtendsClass().getName()+"Remote";
      remoteClassSuperCall="  super(aObject);"+NL;
      remoteClasssetRealObjectSuperCall= "  super.setRealObject(aObject);"+NL;
      if(aClass.getExtendsClass().getName().length()>4)
        if (getModel().getDistributePattern()==1&&aClass.getExtendsClass().getName().substring(aClass.getExtendsClass().getName().length()-4).equals("Impl"))
        {
          extendsProxy=" extends "+aClass.getExtendsClass().getName().substring(0,aClass.getExtendsClass().getName().length()-4);
        }
        
      if(aClass.getExtendsClass().getNeedsDefaultInterface()||aClass.getExtendsClass().getHasProxyPattern()||aClass.getExtendsClass().getIsDistributed()){
        parentDefaultInterface=", I"+aClass.getExtendsClass().getName();
          parentDefaultInterface+="Impl";
      } 
    }

    realClassName=aClass.getName();
    if (aClass.getIsDistributed()&&getModel().getDistributePattern()==1)
      realClassName+="Impl";
    if(aClass.getIsDistributed())
    {
      proxyImplements=" implements java.io.Serializable";
      for(UmpleInterface interfaceParent: aClass.getParentInterface())
      { 
        proxyImplements+=", "+interfaceParent.getName();
        if(interfaceParent.getIsDistributable()){
          parentInterface=interfaceParent;
          parentDefaultInterface+=" ,"+interfaceParent.getName();
        }
      }
    }    


    if(!aClass.getIsDistributed())
    {
      proxyImplements=" implements "+remoteInterfaceName;
    }

    Integer scopeDepth=0;// if it is 1 means we are in the main class. If depth more than 1 it means we are in an inner class.
    String[] lines = classContents.split("\n|"+System.getProperty("line.separator"));

    boolean hasNoArgumentConstructor=false;
    boolean hasEquals=false;
    /*
    ** Loop going through all of the class file line by line
    */
    String defaultNamespace ="";
    if (getModel().getDefaultNamespace()!=null && aClass.getIsDistributed())
    {
      defaultNamespace="import "+getModel().getDefaultNamespace()+".UmpleRuntime;"+NL;
    }
    String remoteImports="";
   
    if(aClass.getNeedsDefaultInterface())
    {
      remoteImports="import java.rmi.RemoteException;"+NL;
      //proxyName=aClass.getName()+"Proxy";
    }
    String realObjectType=remoteInterfaceName;
    for(int lineNumber=0; lineNumber<lines.length;lineNumber+=1)
    {
      String line=lines[lineNumber];
      String[] tokensInMethod = line.split(" |<|>|\\(|\\)|,");

      if (tokensInMethod!=null && tokensInMethod.length>0){
        if ((tokensInMethod[0].contains("import"))||(tokensInMethod[0].contains("package"))||(lineNumber<3)) 
        {
          remoteContent.append(line+NL);
          proxyPrecode.append(line+NL);
          remoteInterfaceContent.append(line+NL);
        }
      }
      if((scopeDepth==0)&&(line.contains("class "+realClassName)))
      { 

      if(aClass.getDistributeTechnology().equals("WS"))
        {
          parentDefaultInterface=parentDefaultInterface.replace(", "," extends ");

          remoteInterfaceContent.append("import javax.jws.WebMethod;"+NL+"import javax.jws.WebService;"+NL+"import javax.jws.soap.SOAPBinding;"+NL+"import javax.jws.soap.SOAPBinding.Style;"+NL+remoteImports+"@WebService"+NL+"@SOAPBinding(style = Style.RPC)"+NL+"public interface "+remoteInterfaceName+parentDefaultInterface+NL+"{"+NL);

          
          remoteContent.append(NL+"import javax.jws.WebService;"+NL+"import javax.xml.ws.Endpoint;"+NL+"@WebService(endpointInterface = \""+classPackageName+remoteInterfaceName+"\")"+NL+"public class " + remoteName+extendsRemoteProxy+" implements "+remoteInterfaceName+NL+"{");
        }
        else{
          proxyContent.append("  public void setRealObject("+remoteInterfaceName+" aObject)"+NL+"  {"+NL);
          proxyContent.append(remoteClasssetRealObjectSuperCall+"    realObject=aObject;"+NL+"  }"+NL);

          remoteInterfaceContent.append(remoteImports+"public interface "+remoteInterfaceName+" extends java.rmi.Remote"+parentDefaultInterface+NL+"{"+NL);
          remoteContent.append(NL+"import java.rmi.registry.Registry;"+NL+"import java.rmi.registry.LocateRegistry;"+NL+"import java.rmi.server.UnicastRemoteObject;"+NL+"public class " + remoteName+extendsRemoteProxy+" implements "+remoteInterfaceName+NL+"{");

          remoteContent.append(NL+"  "+realClassName+" realObject;"+NL);
          remoteContent.append("  public void setRealObject("+realClassName+" aObject)"+NL+"  {"+NL);
          remoteContent.append("    realObject=aObject;"+NL+"  }"+NL);
          remoteContent.append("  public "+remoteName+"()"+NL+"  {}"+NL);
          remoteContent.append("  public "+remoteName+"("+realClassName+" aObject)"+NL+"  {"+NL+"  ");
          remoteContent.append(remoteClassSuperCall+"    realObject=aObject;"+NL+"  }"+NL); 
        }
        
        
        proxyPrecode.append(remoteImports+"import java.io.Serializable;"+NL+defaultNamespace+"public class "+proxyName+extendsProxy+proxyImplements+NL+"{");

          if(getModel().getDistributePattern()==0){
            realObjectType="transient "+realObjectType;
            proxyContent.append(NL+"  "+realObjectType+" realObject=this;"+NL);
          }
          else{   
            proxyContent.append(NL+"  "+realObjectType+" realObject;"+NL);
          }  

      }
      boolean isSerializable=true;
      String lineWOSpace= line.replace(" ", "");
      boolean isMethod=false;
      boolean isNonStatic=true;
      if (line.contains("(") && line.contains(")"))
      {
        isMethod=true;
      }
      if (scopeDepth==1)
      {
        int startSignature=line.indexOf("(");
        int endSignature=line.lastIndexOf(")");
        for(int i=0;i<tokensInMethod.length;i+=1)
        {
          if (tokensInMethod[i].contains("public")||tokensInMethod[i].contains("private"))
          { 
            if(endSignature>3)
            if(!line.substring(endSignature-1).contains(";"))
              isMethod=true;
          }
       
          if (tokensInMethod[i].equals("abstract")||((tokensInMethod[i].contains("List")&&aClass.getDistributeTechnology().equals("WS"))))
          {
            isMethod=false;
            break;
          }   
          if (tokensInMethod[i].equals("enum"))
          {
            if(i<tokensInMethod.length-2)
              methodBlacklist.add(tokensInMethod[i+1]);
            isMethod=false;
            break;
          }     
          if((tokensInMethod[i].equals("static")))
          {
            isNonStatic=false;
          }
          if ((tokensInMethod[i].contains("["))||(tokensInMethod[i].equals("toString"))||(tokensInMethod[i].equals("hashCode"))||tokensInMethod[i].contains("private"))
          {
            isSerializable=false;
          }  
        }
        String methodType="";
        if (startSignature>=endSignature)
          isMethod=false;  
        else{   
          methodType=line.substring(0,startSignature).replaceAll("\\s+$", "");// trimming the spaces on the right          
          for(String blackListedType: methodBlacklist)
          {
            if(methodType.indexOf(blackListedType)>=0)
            {
              isMethod=false;
              break;
            } 
          }
          }          
        if(isMethod)
        {
          String methodName=methodType.substring(methodType.lastIndexOf(" ")+1);
          methodType=methodType.substring(0,methodType.lastIndexOf(" ")+1);
          String returnString="return ";
          String breakString="";
          if(methodType.indexOf("void")>=0)
          {
            returnString="";
            breakString="        break;"+NL;
          }


          String callerSignature="";
          String arguments=line.substring(startSignature+1,endSignature).replaceAll("^\\s+", "");// trimming the spaces on the left
          int depth=0;
          for (int i=0;i<arguments.length();i+=1)
          { 
            if((arguments.charAt(i)=='(')||(arguments.charAt(i)=='['))
              depth+=1;
            else if((arguments.charAt(i)==')')||(arguments.charAt(i)==']'))
              depth-=1;
            else if (depth==0)
            {
              if(arguments.charAt(i)==',')
              {
                callerSignature+=arguments.substring(arguments.substring(0,i).replaceAll("\\s+$", "").lastIndexOf(" ")+1,i+1);
              }
            }
          }

          callerSignature+=arguments.substring(arguments.replaceAll("\\s+$", "").lastIndexOf(" ")+1,arguments.length());
              String lastArgument="";
              String remoteRealObject="realObject";
              if(arguments.length()>0)
              { 
                lastArgument=", ";      
              }
              else
              {
                callerSignature="";  
              }  
          if (methodName.equals("equals"))
            hasEquals=true;     
          if ((!methodName.equals(realClassName))&&(isSerializable==true))
          {
            if((!methodName.equals("equals")||getModel().getDistributePattern()==0)&&isNonStatic)
            {
              if(!aClass.getIsDistributed() && ( aClass.getHasProxyPattern() || !aClass.getIsDefaultInterfaceRemoteRMI()))
              {
                if (parentInterface==null||methodName.equals("setRealSelf")||methodName.equals("getHashCode")||methodName.equals("delete"))
                  remoteInterfaceContent.append(methodType+methodName+methodPostfix+"("+arguments+");"+NL);                 
              }
              else
              {
                if (parentInterface==null||methodName.equals("getHashCode")||methodName.equals("delete"))
                  if(aClass.getDistributeTechnology().equals("RMI"))
                    remoteInterfaceContent.append(methodType+methodName+methodPostfix+"("+arguments+") throws RemoteException;"+NL); 
                  if(aClass.getDistributeTechnology().equals("WS"))
                    remoteInterfaceContent.append("@WebMethod"+NL+methodType+methodName+methodPostfix+"("+arguments+");"+NL);
                     
              }
            }               
            boolean doesThrow=false;
            String methodDeclarationLine="";
            if(line.substring(endSignature).contains("throws"))
            {
              doesThrow=true;
            }
            if(!lineWOSpace.substring(lineWOSpace.length()-2,lineWOSpace.length()).contains("{"))
            {
              methodDeclarationLine=line.substring(0,line.length())+NL+"  {"+NL;
            }
            else
            {
              methodDeclarationLine=line.substring(0,line.length()-1)+NL+"  {"+NL;
            }
            String methodDeclarationLineWithThrows=methodDeclarationLine;
            if(aClass.getIsDistributed())
              methodDeclarationLineWithThrows=line.substring(0,endSignature)+") throws Exception"+NL+"  {"+NL;
            if (isSerializable==true && aClass.getNeedsDefaultInterface() && !methodName.contains("getInstance"))
            {
              if(doesThrow && isNonStatic)
              {
                proxyContent.append(methodDeclarationLineWithThrows+"    try{"+NL+"      "+returnString+"realObject."+methodName+methodPostfix+"("+callerSignature+");"+NL+breakString+"      }"+NL+"    finally {}"+NL+"  }"+NL);
              }

              if(!doesThrow && isNonStatic)
              {
                proxyContent.append(methodDeclarationLine+"    while(true)"+NL+"      try{"+NL+"        "+returnString+"realObject."+methodName+methodPostfix+"("+callerSignature+");"+NL+breakString+"        }"+NL+"    catch(Exception e) {System.err.println(e.toString());}"+NL+"  }"+NL);
                methodDeclarationLine=methodDeclarationLine.replace(" "+methodName," "+methodName+methodPostfix); 

                remoteContent.append(methodDeclarationLine+"    while(true)"+NL+"      try{"+NL+"        "+returnString+remoteRealObject+"."+methodName+methodPostfix+"("+callerSignature+");"+NL+breakString+"        }"+NL+"    catch(Exception e) {System.err.println(e.toString());}"+NL+"  }"+NL);               
              }
              if(doesThrow && !isNonStatic&&(getModel().getDistributePattern()==1||getModel().getDistributePattern()==2))
              {
                proxyContent.append(methodDeclarationLineWithThrows+"    try{"+NL+"      "+returnString+realClassName+"."+methodName+methodPostfix+"("+callerSignature+");"+NL+"      }"+NL+"    finally {}"+NL+"  }"+NL);
              }

              if(!doesThrow && !isNonStatic&&(getModel().getDistributePattern()==1||getModel().getDistributePattern()==2))
              {
                proxyContent.append(methodDeclarationLine+"    while(true)"+NL+"      try{"+NL+"        "+returnString+realClassName+"."+methodName+methodPostfix+"("+callerSignature+");"+NL+"        }"+NL+"    catch(Exception e) {System.err.println(e.toString());}"+NL+"  }"+NL);
                
              }
              if(isNonStatic)
              {
                classContent.append(methodType+methodName+methodPostfix+"("+line.substring(startSignature+1)+NL); 
              }
              else 
                classContent.append(line+NL);
            }
            else  
              classContent.append(line+NL);

              
          }   
          else if (methodName.equals(realClassName)||methodName.equals(proxyName))
          {           

            if(arguments.length()==0)
            { 
              hasNoArgumentConstructor=true;        
            }

            if(aClass.getIsDistributed())
            { 
             if(getModel().getDistributePattern()==0 && arguments.contains("UmpleRuntime.UmpleComponent umpleComponent"))
             {
              callerSignature=callerSignature.substring(0,callerSignature.length()-14);
              if(arguments.contains(", UmpleRuntime"))
              {
                arguments=arguments.substring(0,arguments.length()-44);
              }
              else
              {
                arguments=arguments.substring(0,arguments.length()-42);
              }  
              proxyContent.append(methodType+methodName+"("+arguments+")"+NL+"  {"+NL);
              proxyContent.append(NL+"this("+callerSignature+"UmpleRuntime.getComponent(\""+aClass.getName()+"\"));"+NL+"  }"+NL+"");
            }
            if(getModel().getDistributePattern()==1){
              proxyContent.append(methodType+proxyName+"("+arguments+lastArgument+"UmpleRuntime.UmpleComponent component)"+NL+"  {"+NL+"    if(this.getClass()== "+aClass.getName()+".class)"+"    setRealObject(UmpleRuntime.getInstance().new"+aClass.getName()+"("+callerSignature+lastArgument+"component, this));"+NL+"  }"+NL);

              proxyContent.append(methodType+proxyName+"("+arguments+")"+NL+"  {"+NL+"    if(this.getClass()== "+aClass.getName()+".class)"+"    setRealObject(UmpleRuntime.getInstance().new"+aClass.getName()+"("+callerSignature+lastArgument+"this));\n  }"+NL+"");
              }
            }
            classContent.append(line+NL);
          }
          else
            classContent.append(line+NL);
        }
        else if(!line.equals("}"))
          classContent.append(line+NL);       
      }
      else{
          classContent.append(line+NL);
          }
       
      scopeDepth += line.length() - line.replace("{", "").length(); // counting the number of "{" in the line and increasing the scopeDepth
      scopeDepth -= line.length() - line.replace("}", "").length(); // counting the number of "}" in the line and increasing the scopeDepth      
    }
    remoteInterfaceContent.append("}");
    if(getModel().getDistributePattern()==0)
    {
      if(aClass.getDistributeTechnology().equals("WS"))
      {
        proxyContent.append(templates.getproxyReadObjectCode(aClass.getName(),aClass.getPackageName(),remoteInterfaceName,aClass));
        //remoteContent.append(templates.getremoteSingletonCode(remoteName,aClass.getPackageName(),remoteInterfaceName)));
      }
      else
      {
        proxyContent.append(templates.getproxyReadObjectCodeRMI(remoteName,aClass.getPackageName(),remoteInterfaceName,aClass));
      }
    }
    /*
    if(parentInterface!=null){
    ILang language = new JavaProxyGenerator();
    proxyContent.append( language.getCode(getModel(),parentInterface));
    }
    */
    if(aClass.getIsDistributed()){
      if (getModel().getDistributePattern()==0){
        if(!hasEquals)
        {
          proxyContent.append(NL+"  public boolean equals(Object obj)"+NL+"  {");
        proxyContent.append("    if(obj.getClass()!=this.getClass())"+NL+"      return false;"+NL+"    return (getHashCode()==(("+aClass.getName()+")obj).getHashCode());"+NL+"  }");
        }
      }
      else{
       proxyContent.append(NL+"  public boolean equals(Object obj)"+NL+"  {"); 
      proxyContent.append("    if(obj.getClass()!=this.getClass())"+NL+"      return false;"+NL+"    return (getHashCode()==(("+aClass.getName()+")obj).getHashCode());"+NL+"  }");
        }
    
    if(aClass.getIsSingleton())
    {
      if(getModel().getDistributePattern()==1){
        proxyContent.append(NL+"private static "+aClass.getName()+" theInstance=null;"+NL);
        proxyContent.append("  public static "+aClass.getName()+" getInstance()"+NL+"{"+NL+"if(theInstance == null)"+NL+"{"+NL+"theInstance = new "+aClass.getName()+"();"+NL+"}"+NL+"return theInstance;"+NL+"}");
        }
        proxyContent.append("  public static "+aClass.getName()+" getInstance(UmpleRuntime.UmpleComponent umpleComponent)"+NL+"{"+NL+"if(theInstance == null)"+NL+"{"+NL+"theInstance = new "+aClass.getName()+"(umpleComponent);"+NL+"}"+NL+"return theInstance;"+NL+"}");
    }  
    }  
    remoteContent.append(NL+"}");
      classContent.append(proxyContent.toString());
      classContent.append(NL+"}");
     if (getModel().getDistributePattern()==1){
      if (!hasNoArgumentConstructor)
        proxyContent.append(NL+"protected "+aClass.getName()+"(){}");
      proxyPrecode.append(proxyContent.toString());
      proxyPrecode.append(NL+"}");
      }

    String filename;
/*
    // write file only if needs default interface
    if (aClass.getNeedsDefaultInterface())
    {
	    filename = path + File.separator + interfaceName + ".java";
	    File file = new File(path);
	    file.mkdirs();
	    BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
	
	    //putting the code in the model and writing the file.
	    getModel().getGeneratedCode().put(interfaceName,interfaceContent);
	
	    try
	    {
	      bw.write(interfaceContent);
	      bw.flush();
	    }
	    finally
	    {
	      bw.close();
	    } 
    }
*/
    // write generated proxy code
    if ((aClass.getHasProxyPattern()||aClass.getNeedsDefaultInterface())&&getModel().getDistributePattern()==1)
    //if (aClass.getHasProxyPattern())
    {
      filename = path + File.separator + proxyName + ".java";
      File file = new File(path);
      file.mkdirs();
      BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
  
      //putting the code in the model and writing the file.
      getModel().getGeneratedCode().put(proxyName+"Proxy",proxyPrecode.toString());
  
      try
      {
        bw.write(proxyPrecode.toString());
        bw.flush();
      }
      finally
      {
        bw.close();
      } 
    }

        // write generated server proxy code
    if ((aClass.getIsDistributed()||aClass.getNeedsDefaultInterface())&&getModel().getDistributePattern()==0&&aClass.getDistributeTechnology().equals("RMI"))
    //if (aClass.getHasProxyPattern())
    {
      filename = path + File.separator + remoteName + ".java";
      File file = new File(path);
      file.mkdirs();
      BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
  
      //putting the code in the model and writing the file.
      getModel().getGeneratedCode().put(remoteName,remoteContent.toString());
  
      try
      {
        bw.write(remoteContent.toString());
        bw.flush();
      }
      finally
      {
        bw.close();
      } 
    }


// writing the generated code for the remote interface

    if ((aClass.getIsDistributed()|| aClass.getNeedsDefaultInterface()))
    {
      filename = path + File.separator + remoteInterfaceName + ".java";
      File fileRemote = new File(path);
      fileRemote.mkdirs();
      BufferedWriter bwRemote = new BufferedWriter(new FileWriter(filename));

      //putting the code in the model and writing the file.
      getModel().getGeneratedCode().put(remoteInterfaceName,remoteInterfaceContent.toString());

      try
      {
        bwRemote.write(remoteInterfaceContent.toString());
        bwRemote.flush();
      }
      finally
      {
        bwRemote.close();
      } 
    }
    if (getModel().getDistributePattern()==0)
      return classContent.toString();
    else
        return classContents;
  }

  // line 3214 "../../../../src/Generator_CodeJava.ump"
   public void writeObjectFactoryClass() throws IOException{
    String name="UmpleRuntime";
    String packageName="";
    if (getModel().getDefaultNamespace()!=null)
      packageName=getModel().getDefaultNamespace();    
  	ILang language = new JavaObjectFactoryClassGenerator();
    String path = StringFormatter.addPathOrAbsolute(getModel().getUmpleFile().getPath(), getOutput())+packageName.replace(".", File.separator); 
    String filename = path + File.separator + name+".java";
    File file = new File(path);
    file.mkdirs();
    BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
    String contents = language.getCode(getModel(),new UmpleElement(name));
    getModel().getGeneratedCode().put(name,contents); 
     try
    {
      bw.write(contents);
      bw.flush();
    }
    finally
    {
      bw.close();
    }
  }

  // line 3239 "../../../../src/Generator_CodeJava.ump"
   public void writeObjectFactoryInterface() throws IOException{
    String name="IUmpleRuntime";
    ILang language = new JavaObjectFactoryInterfaceGenerator();
    String packageName="";
    if (getModel().getDefaultNamespace()!=null)
      packageName=getModel().getDefaultNamespace();
    String path = StringFormatter.addPathOrAbsolute(getModel().getUmpleFile().getPath(), getOutput())+packageName.replace(".", File.separator);
    String filename = path + File.separator + name +".java";
    File file = new File(path);
    file.mkdirs();
    BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
    String contents = language.getCode(getModel(),new UmpleElement(name));
    getModel().getGeneratedCode().put(name,contents); 
     try
    {
      bw.write(contents);
      bw.flush();
    }
    finally
    {
      bw.close();
    }
  }

  // line 3265 "../../../../src/Generator_CodeJava.ump"
   public void writeFile(UmpleElement aClass) throws IOException{
    String className=aClass.getName();
    UmpleClass uClass;
    if (aClass instanceof UmpleClass)
    { 
      uClass=(UmpleClass)aClass; 
      if(uClass.getHasProxyPattern()||(uClass.getIsDistributed()&&(getModel().getDistributePattern()==1||getModel().getDistributePattern()==2)))
      {
        aClass.setName(className+"Impl");
          }
      if(uClass.hasOuterClass())
      {
        return ; // inner classes should not be writen in single files.
      }
    }
    ILang language = getLanguageFor(aClass);
    String contents = language.getCode(getModel(), aClass);

    aClass.setName(className);
    String path = StringFormatter.addPathOrAbsolute( 
                  getModel().getUmpleFile().getPath(), 
                            getOutput()) + 
                            aClass.getPackageName().replace(".", File.separator);  
    if (aClass instanceof UmpleClass)
    { uClass=(UmpleClass)aClass;
      if(uClass.getNeedsDefaultInterface()||uClass.getIsDistributed()||uClass.getHasProxyPattern()){
        contents= WriteProxyFiles(contents,uClass,path);
      }    
      if(uClass.getHasProxyPattern()||(uClass.getIsDistributed()&&(getModel().getDistributePattern()==1||getModel().getDistributePattern()==2))){
        className=className+"Impl";
        //contents=contents.replaceAll("(,|, |\\(|\\( )(this)(,| ,|\\)| \\))","$1self$3");
          }    
          
    }
    File file = new File(path);
    file.mkdirs();   
    String filename = path + File.separator + className + ".java";
    BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
    getModel().getGeneratedCode().put(aClass.getName(),contents);

    try
    {
      bw.write(contents);
      bw.flush();
    }
    finally
    {
      bw.close();
    }
    if (aClass instanceof UmpleClass)
    {
      StringBuilder exceptionBuilder = new StringBuilder();
      for(String key:((JavaClassGenerator)language).uncaughtExceptions.keySet())
      {
        exceptionBuilder.append(((JavaClassGenerator)language).uncaughtExceptions.get(key).toString()+System.getProperty("line.separator"));
      }
      String exception = exceptionBuilder.toString();
      uncaughtExceptions.append(exception);
      if(((UmpleClass)aClass).getHasMainMethod())
      {
        mainClasses.add((UmpleClass)aClass);
      }
    }
  }

  // line 3331 "../../../../src/Generator_CodeJava.ump"
   public void writeUncaughtExceptionFile(UmpleClass aClass){
    try {
       // if the name of the class has been changed for proxy pattern, change it for the exceptions too.
    String className=aClass.getName();
    if(aClass.getHasProxyPattern()||(aClass.getIsDistributed()&&(getModel().getDistributePattern()==1||getModel().getDistributePattern()==2)))
      aClass.setName(className+"Impl");

    ILang language = getLanguageFor(aClass);
    
    aClass.setName(className);
    if(aClass.getHasProxyPattern()||(aClass.getIsDistributed()&&(getModel().getDistributePattern()==1||getModel().getDistributePattern()==2)))
      className=className+"Impl"; 

    String path = StringFormatter.addPathOrAbsolute( 
                  getModel().getUmpleFile().getPath(), 
                            getOutput()) + 
                            aClass.getPackageName().replace(".", File.separator);

    String filename = path + File.separator + className + ".java";
    File file = new File(path);
    file.mkdirs();

    BufferedWriter bw = new BufferedWriter(new FileWriter(filename,true));
    String contents = new JavaClassGenerator().getExceptionHandler(uncaughtExceptions.toString(), aClass, getModel());
    getModel().getGeneratedCode().put(aClass.getName(),getModel().getGeneratedCode().get(aClass.getName())+contents);
    try
    {
      bw.write(contents);
      bw.flush();
    }
    finally
    {
      bw.close();
    }
    } catch(Exception e){ e.printStackTrace(); }
  }

  // line 3368 "../../../../src/Generator_CodeJava.ump"
   public void initializeLangaugeBasedVariables(){
    UmpleToPrimitiveMap.put("Integer","int");
    UmpleToPrimitiveMap.put("Boolean","boolean");
    UmpleToPrimitiveMap.put("Double","double");
    UmpleToPrimitiveMap.put("Float","float");
    UmpleToPrimitiveMap.put("String","String");
    //
    TraceLookupMap.put("concatinator","+");
    TraceLookupMap.put("accessor","");
    TraceLookupMap.put("indent","    ");
    TraceLookupMap.put("template","{0}Tracer.handle( {1} );");
    TraceLookupMap.put("templatelog4j","logger.{0}( {1} );");
    TraceLookupMap.put("templatelttng","LTTngUst.{0}( {1} );");
    TraceLookupMap.put("timestamp","System.currentTimeMillis()");
    TraceLookupMap.put("identifier","System.identityHashCode({0})");
    TraceLookupMap.put("thread","Thread.currentThread().getId()");
    TraceLookupMap.put("self","this");
    TraceLookupMap.put("increment","{0}++;");
    TraceLookupMap.put("formatnonprimitive",".toString().replace(\"\\n\",\"\").replace(\",\",\";\")");
    //
    ConstraintLookupMap.put("in==","{0}.equals(\"{1}\")");
    ConstraintLookupMap.put("in!=","!{0}.equals(\"{1}\")");
    ConstraintLookupMap.put("object==","{0}.equals({1})");
    ConstraintLookupMap.put("object!=","!{0}.equals({1})");
    ConstraintLookupMap.put("accessor","");
    ConstraintLookupMap.put("paramaccessor","");
    ConstraintLookupMap.put("exception","throw new RuntimeException(\"Please provide a valid {0}\");");
    ConstraintLookupMap.put("ifstatement","if ({0})\n{");
    ConstraintLookupMap.put("end","}");
    ConstraintLookupMap.put("concatenate","{0}+{1}");
    ConstraintLookupMap.put("initialise","new {0}");
    ConstraintLookupMap.put("has","{0}.contains({1})");
    ConstraintLookupMap.put("hasAll","{0}.contains({1})");
    ConstraintLookupMap.put("cardinality==","{0}=={1}");
    ConstraintLookupMap.put("cardinality!=","{0}!={1}");
    ConstraintLookupMap.put("cardinality>=","{0}>={1}");
    ConstraintLookupMap.put("cardinality<=","{0}<={1}");
    ConstraintLookupMap.put("cardinality>","{0}>{1}");
    ConstraintLookupMap.put("cardinality<","{0}<{1}");
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "uncaughtExceptions" + "=" + (getUncaughtExceptions() != null ? !getUncaughtExceptions().equals(this)  ? getUncaughtExceptions().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 26 "../../../../src/Generator_CodeJava.ump"
  private static Map<String,String> UpperCaseSingularLookupMap ;
// line 27 "../../../../src/Generator_CodeJava.ump"
  private static Map<String,String> UpperCasePluralLookupMap ;
// line 28 "../../../../src/Generator_CodeJava.ump"
  private static Map<String,String> AsIsSingularLookupMap ;
// line 29 "../../../../src/Generator_CodeJava.ump"
  private static Map<String,String> AsIsPluralLookupMap ;
// line 30 "../../../../src/Generator_CodeJava.ump"
  private static List<String> OneOrManyLookup ;

// line 32 "../../../../src/Generator_CodeJava.ump"
  static 
  {
    UpperCaseSingularLookupMap = new HashMap<String, String>();
    UpperCaseSingularLookupMap.put("parameterOne", "a{0}");
    UpperCaseSingularLookupMap.put("removeParameterOne", "placeholder{0}");    
    UpperCaseSingularLookupMap.put("parameterNew", "aNew{0}");
    UpperCaseSingularLookupMap.put("parameterNext", "next{0}");
    UpperCaseSingularLookupMap.put("addMethod", "add{0}");
    UpperCaseSingularLookupMap.put("addAtMethod", "add{0}At");
    UpperCaseSingularLookupMap.put("addOrMoveAtMethod", "addOrMove{0}At");
    UpperCaseSingularLookupMap.put("removeMethod", "remove{0}");
    UpperCaseSingularLookupMap.put("indexOfMethod", "indexOf{0}");
    UpperCaseSingularLookupMap.put("parameterOld", "anOld{0}");
    UpperCaseSingularLookupMap.put("parameterExisting", "existing{0}");
    UpperCaseSingularLookupMap.put("parameterIsNew", "isNew{0}");
    UpperCaseSingularLookupMap.put("parameterGetUnique", "retrievedBy{0}");
    UpperCaseSingularLookupMap.put("parameterHasUnique", "hasUnique{0}");
    UpperCaseSingularLookupMap.put("associationNew", "new{0}");
    UpperCaseSingularLookupMap.put("canSetMethod", "canSet{0}");
    UpperCaseSingularLookupMap.put("parameterCurrent", "current{0}");
    UpperCaseSingularLookupMap.put("deleteMethod", "delete{0}");
    UpperCaseSingularLookupMap.put("setMethod", "set{0}");
    UpperCaseSingularLookupMap.put("enterMethod", "enter{0}");
    UpperCaseSingularLookupMap.put("exitMethod", "exit{0}");
    UpperCaseSingularLookupMap.put("resetMethod", "reset{0}");
    UpperCaseSingularLookupMap.put("getMethod", "get{0}");
    UpperCaseSingularLookupMap.put("isMethod", "is{0}");
    UpperCaseSingularLookupMap.put("getFullMethod", "get{0}FullName");    
    UpperCaseSingularLookupMap.put("isFinalMethod", "is{0}Final");
    UpperCaseSingularLookupMap.put("getDefaultMethod", "getDefault{0}");
    UpperCaseSingularLookupMap.put("didAdd", "didAdd{0}");
    UpperCaseSingularLookupMap.put("hasMethod", "has{0}");
    UpperCaseSingularLookupMap.put("associationCanSetOne","canSet{0}");
    UpperCaseSingularLookupMap.put("attributeCanSetOne","canSet{0}");
    UpperCaseSingularLookupMap.put("eventStartMethod", "start{0}Handler");
    UpperCaseSingularLookupMap.put("eventStopMethod", "stop{0}Handler");    
    UpperCaseSingularLookupMap.put("stateNull", "Null");
    UpperCaseSingularLookupMap.put("doExitMethod", "doExit{0}");
    UpperCaseSingularLookupMap.put("doEventMethod", "do{0}");

    UpperCasePluralLookupMap = new HashMap<String, String>();
    UpperCasePluralLookupMap.put("parameterMany", "new{0}");
    UpperCasePluralLookupMap.put("parameterAll", "all{0}");
    UpperCasePluralLookupMap.put("numberOfMethod", "numberOf{0}");
    UpperCasePluralLookupMap.put("minimumNumberOfMethod", "minimumNumberOf{0}");
    UpperCasePluralLookupMap.put("maximumNumberOfMethod", "maximumNumberOf{0}");
    UpperCasePluralLookupMap.put("isNumberOfValidMethod", "isNumberOf{0}Valid");
    UpperCasePluralLookupMap.put("parameterVerifiedMany", "verified{0}");
    UpperCasePluralLookupMap.put("parameterOldMany", "old{0}");
    UpperCasePluralLookupMap.put("parameterCheckNewMany", "checkNew{0}");
    UpperCasePluralLookupMap.put("parameterCopyOfMany", "copyOf{0}");
    UpperCasePluralLookupMap.put("getManyMethod", "get{0}");
    UpperCasePluralLookupMap.put("parameterMany", "new{0}");
    UpperCasePluralLookupMap.put("setManyMethod", "set{0}");
    UpperCasePluralLookupMap.put("didAddMany", "didAdd{0}");
    UpperCasePluralLookupMap.put("hasManyMethod", "has{0}");
    UpperCasePluralLookupMap.put("associationCanSetMany","canSet{0}");
    UpperCasePluralLookupMap.put("attributeCanSetMany","canSet{0}");
    UpperCasePluralLookupMap.put("requiredNumberOfMethod", "requiredNumberOf{0}");

    AsIsSingularLookupMap = new HashMap<String, String>();
    AsIsSingularLookupMap.put("associationOne","{0}");
    AsIsSingularLookupMap.put("attributeOne","{0}");
    AsIsSingularLookupMap.put("stateMachineOne","{0}");
    AsIsSingularLookupMap.put("stateOne","{0}");
    AsIsSingularLookupMap.put("stateString","\"{0}\"");
    AsIsSingularLookupMap.put("eventMethod","{0}");
    AsIsSingularLookupMap.put("eventHandler", "{0}Handler");
        
    AsIsPluralLookupMap = new HashMap<String, String>();
    AsIsPluralLookupMap.put("associationMany","{0}");
    AsIsPluralLookupMap.put("attributeMany","{0}");
    
    OneOrManyLookup = new ArrayList<String>();
    OneOrManyLookup.add("attribute");
    OneOrManyLookup.add("parameter");
  }

  
}