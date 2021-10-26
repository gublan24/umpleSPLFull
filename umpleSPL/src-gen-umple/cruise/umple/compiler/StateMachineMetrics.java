/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.text.*;
import java.util.*;

// line 45 "../../../../src/SimpleMetrics_SM.ump"
public class StateMachineMetrics extends SimpleMetricsGenerator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateMachineMetrics Attributes
  private StringBuilder resultCode;
  private UmpleModel model;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateMachineMetrics()
  {
    super();
    resultCode = new StringBuilder();
    model = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setResultCode(StringBuilder aResultCode)
  {
    boolean wasSet = false;
    resultCode = aResultCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setModel(UmpleModel aModel)
  {
    boolean wasSet = false;
    model = aModel;
    wasSet = true;
    return wasSet;
  }

  public StringBuilder getResultCode()
  {
    return resultCode;
  }

  public UmpleModel getModel()
  {
    return model;
  }

  public void delete()
  {
    super.delete();
  }

  // line 53 "../../../../src/SimpleMetrics_SM.ump"
  public void calculate(){
    // Output basic file header
      
    resultCode.append("<h1>State Machine (SM) Measures</h1>");
    
    // Preparing Head (columns) of output file
    List<String>title = new ArrayList<String>();
    title.add(" Class Name                   ");
    title.add(" #State Machines ");
    title.add(" #States ");
    title.add(" #Transitions ");
    title.add(" #Different Transitions ");
    title.add(" #Events ");
    title.add(" #Guards ");
    title.add(" #Actions ");
    title.add(" #Nested SM ");
    title.add(" #Cycles ");
    title.add(" #Self Cycles ");
    
    resultCode.append("<table border=\"1\"><tbody>\n");    
    
    resultCode.append("<tr>");
    for (int i=0;i<title.size();i++){
      _genCell(0,resultCode,title.get(i));
    }
    resultCode.append("</tr>");

    DecimalFormat df = new DecimalFormat( "###,##0.0###");

    CountSM countPerClass = new CountSM(); // Class that contains values per class of counting about State Machine Metrics
    CountSM countTotals = new CountSM();   // Class that contains Max, Min and totals values of counting about State Machine Metrics
    boolean firstTime = true; // used to allow setting first counted values to Min and Max attributes
    for (UmpleClass uClass : model.getUmpleClasses()) {  
      
      if (uClass!=null) {

        resultCode.append("<tr>");
        genCellString(resultCode, uClass.getName());

        // CALCULATING STATE MACHINE METRICS
        countPerClass.calculate(uClass);
      
        // writing and formating string to record in output file
        genCellInt(resultCode,countPerClass.getTotalStateMachinesPerClass());
        genCellInt(resultCode,countPerClass.getTotalStatesPerClass());
        genCellInt(resultCode,countPerClass.getTotalTransitionsPerClass());
        genCellInt(resultCode,countPerClass.getTotalDifferentTransitionsPerClass());
        genCellInt(resultCode,countPerClass.getTotalEventsPerClass());
        genCellInt(resultCode,countPerClass.getTotalGuardsPerClass());
        genCellInt(resultCode,countPerClass.getTotalActionsPerClass());
        genCellInt(resultCode,countPerClass.getTotalNestedStateMachinePerClass());
        genCellInt(resultCode,countPerClass.getTotalCyclesPerClass());
        genCellInt(resultCode,countPerClass.getTotalSelfCyclesPerClass());

      
        // Sum all values per class in Totals
        countTotals.incTotal(countPerClass); 
      
        // if it is first loop, the first calculated values must be set like Max and Min values
        if (firstTime ) {
          countTotals.setMinMax(countPerClass);
          firstTime= false;
        };
        countTotals.calcMinMax(countPerClass); 
        countPerClass = new CountSM(); // Class that keep values of counting about State Machine Metrics
      }
        
      resultCode.append("</tr>");        
    }

    // printing totals
    resultCode.append("<tr>");    
    genCellString(resultCode,"TOTAL");
    genCellInt(resultCode,countTotals.getTotalStateMachines());
    genCellInt(resultCode,countTotals.getTotalStates());
    genCellInt(resultCode,countTotals.getTotalTransitions());
    genCellInt(resultCode,countTotals.getTotalDifferentTransitions());
    genCellInt(resultCode,countTotals.getTotalEvents());
    genCellInt(resultCode,countTotals.getTotalGuards());
    genCellInt(resultCode,countTotals.getTotalActions());
    genCellInt(resultCode,countTotals.getTotalNestedStateMachine());
    genCellInt(resultCode,countTotals.getTotalCycles());
    genCellInt(resultCode,countTotals.getTotalSelfCycles());
    resultCode.append("</tr>");
      
    // printing averages
    int tc = countTotals.getTotalClass();
    String res;
    resultCode.append("<tr>");    
    genCellString(resultCode,"AVERAGE");
    genCellFloat(resultCode,(float)countTotals.getTotalStateMachines()/tc);
    genCellFloat(resultCode,(float)countTotals.getTotalStates()/tc);
    genCellFloat(resultCode,(float)countTotals.getTotalTransitions()/tc);
    genCellFloat(resultCode,(float)countTotals.getTotalDifferentTransitions()/tc);
    genCellFloat(resultCode,(float)countTotals.getTotalEvents()/tc);
    genCellFloat(resultCode,(float)countTotals.getTotalGuards()/tc);
    genCellFloat(resultCode,(float)countTotals.getTotalActions()/tc);
    genCellFloat(resultCode,(float)countTotals.getTotalNestedStateMachine()/tc);
    genCellFloat(resultCode,(float)countTotals.getTotalCycles()/tc);
    genCellFloat(resultCode, (float)countTotals.getTotalSelfCycles()/tc);
    resultCode.append("</tr>");

    // printing MAX values
    resultCode.append("<tr>");    
    genCellString(resultCode,"MAX");
    genCellInt(resultCode,countTotals.getTotalStateMachinesPerClassMax());
    genCellInt(resultCode,countTotals.getTotalStatesPerClassMax());
    genCellInt(resultCode,countTotals.getTotalTransitionsPerClassMax());
    genCellInt(resultCode,countTotals.getTotalDifferentTransitionsPerClassMax());
    genCellInt(resultCode,countTotals.getTotalEventsPerClassMax());
    genCellInt(resultCode,countTotals.getTotalGuardsPerClassMax());
    genCellInt(resultCode,countTotals.getTotalActionsPerClassMax());
    genCellInt(resultCode,countTotals.getTotalNestedStateMachinePerClassMax());
    genCellInt(resultCode,countTotals.getTotalCyclesPerClassMax());
    genCellInt(resultCode,countTotals.getTotalSelfCyclesPerClassMax());
    resultCode.append("</tr>");    
    
    // printing MIN values
    resultCode.append("<tr>");      
    genCellString(resultCode,"MIN");
    genCellInt(resultCode,countTotals.getTotalStateMachinesPerClassMin());
    genCellInt(resultCode,countTotals.getTotalStatesPerClassMin());
    genCellInt(resultCode,countTotals.getTotalTransitionsPerClassMin());
    genCellInt(resultCode,countTotals.getTotalDifferentTransitionsPerClassMin());
    genCellInt(resultCode,countTotals.getTotalEventsPerClassMin());
    genCellInt(resultCode,countTotals.getTotalGuardsPerClassMin());
    genCellInt(resultCode,countTotals.getTotalActionsPerClassMin());
    genCellInt(resultCode,countTotals.getTotalNestedStateMachinePerClassMin());
    genCellInt(resultCode,countTotals.getTotalCyclesPerClassMin());
    genCellInt(resultCode,countTotals.getTotalSelfCyclesPerClassMin());
    resultCode.append("</tr>");      
      
      
    
    resultCode.append("</tbody></table>");
      
    resultCode.append("\n\n");
    
    resultCode.append("<h3>Legend of State Machine Metrics:</h3>\n<ul>\n");
    resultCode.append("   <li>#State Machines - Total of SM per class.\n");
    resultCode.append("   <li>#States - Total of States per class.\n");
    resultCode.append("   <li>#Transitions - Total of Transitions per class: All transitions are counted. Transitions with same name are counted the same number of times they appear.\n");
    resultCode.append("   <li>#Different Transitions - Total of Different per SM: Transitions with the same name are counted once\n");
    resultCode.append("   <li>#Events - Total of Events per class without repetition. \n");
    resultCode.append("   <li>#Guards - Total of Guards per class without repetition. \n");
    resultCode.append("   <li>#Actions - Total of Actions per SM. \n");
    resultCode.append("   <li>#Nested SM - Total of Nested SM: Total of states that is other state machine.\n");
    resultCode.append("   <li>#Cycles - Total of cycles: Self cycles plus cycles that include two or more states.\n");
    resultCode.append("   <li>#Self Cycles - The number of transitions that start at a state and end at the same states.\n</ul>\n\n");
    
    return;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "resultCode" + "=" + (getResultCode() != null ? !getResultCode().equals(this)  ? getResultCode().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}