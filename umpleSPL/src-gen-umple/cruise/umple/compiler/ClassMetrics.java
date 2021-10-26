/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;
import java.text.*;
import cruise.umple.parser.Position;

// line 40 "../../../../src/SimpleMetrics_Class.ump"
public class ClassMetrics extends SimpleMetricsGenerator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassMetrics Attributes
  private StringBuilder resultCode;
  private UmpleModel model;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ClassMetrics()
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

  // line 49 "../../../../src/SimpleMetrics_Class.ump"
  public void calculate(){
    CountClass cc = new CountClass();  
      int smCount = 0;
      int classCount = 0;
    boolean FirstTime= true;

      resultCode.append( "\n\n\n");
      resultCode.append("<h1>Class Measures</h1>\n");
   
    // CALCULATE SOME CLASS METRICS
      // create a map in order to have several metric objects about the same class
      Set<String> allUmpFiles = new HashSet<String>();
      String fn = null;
      // Iterate through all the classes in the system, gathering statistics
      for (UmpleClass uClass : model.getUmpleClasses()) {           
        // Loop through all the places where parts of this class were
        // found in the resultCode, gathering all the files
        for (Position p : uClass.getPositions()) {
          fn=p.getFilename();
          allUmpFiles.add(fn); // allUmpFiles is a set, so duplicates are removed
         }
      }
      
    List<String>title = new ArrayList<String>();
      title.add("Class Name");
      title.add("#State Machines");
      title.add("#Associations");
      title.add("#Subclasses");
      title.add("#Deepest Subclasses");
      title.add("#Attributes");
      title.add("#Methods");
      title.add("#Method Parameters");
      
      resultCode.append("<table border=\"1\"><tbody>\n");
      
      resultCode.append("<tr>");
      for (int i=0;i<title.size();i++){
          _genCell(0,resultCode,title.get(i));
      }
      resultCode.append("</tr>");
    
    classCount=0;
      smCount=0;
    // calculate class metrics for each Umple Class
    for ( UmpleClass uClass : model.getUmpleClasses() ) {
      cc.countDataClass( uClass ); 

      resultCode.append("<tr>");
  
      classCount++;         
      genCellString(resultCode, uClass.getName());
      genCellInt(resultCode, cc.getCountStateMachines());
      genCellInt(resultCode,cc.getCountAssociations());
      genCellInt(resultCode,cc.getCountSubclasses());             
      genCellInt(resultCode,cc.getCountDeepestSubclass());             
      genCellInt(resultCode,cc.getCountAttributes());
      genCellInt(resultCode,cc.getCountMethods());
      genCellInt(resultCode,cc.getCountParameters());                          
                                       
    
    if (FirstTime){
      cc.setMinMax();
      FirstTime= false;
    }
    cc.incTotal();
    cc.calcMinMax();
    cc.reset();
    
       resultCode.append("</tr>");
    
     } 


      // TOTAL OF CLASSES, STATE MACHINES, SOURCE FILES 
      resultCode.append("<tr>");
      genCellString(resultCode,"TOTAL");
      genCellInt(resultCode, cc.getCountTotalStateMachines());
      genCellInt(resultCode,cc.getCountTotalAssociations());
      genCellInt(resultCode,cc.getCountTotalSubclasses());             
      genCellString(resultCode,"");          
      genCellInt(resultCode,cc.getCountTotalAttributes());
      genCellInt(resultCode,cc.getCountTotalMethods());
      genCellInt(resultCode,cc.getCountTotalParameters());           
      resultCode.append("</tr>");
      
    // Print Averages
      resultCode.append("<tr>");
      genCellString(resultCode,"AVERAGE");
      genCellFloat(resultCode,(float)cc.getCountTotalStateMachines()/classCount);
      genCellFloat(resultCode,(float)cc.getCountTotalAssociations()/classCount);
      genCellFloat(resultCode,(float)cc.getCountTotalSubclasses()/classCount);             
      genCellString(resultCode,"");              
      genCellFloat(resultCode,(float)cc.getCountTotalAttributes()/classCount);
      genCellFloat(resultCode,(float)cc.getCountTotalMethods()/classCount);
      genCellFloat(resultCode,(float)cc.getCountTotalParameters()/classCount);           
      resultCode.append("</tr>");
    
    // Print MAXs
      resultCode.append("<tr>");
      genCellString(resultCode,"MAX");
      genCellInt(resultCode, cc.getCountStateMachinesMax());
      genCellInt(resultCode,cc.getCountAssociationsMax());
      genCellInt(resultCode,cc.getCountSubclassesMax());             
      genCellInt(resultCode,cc.getCountDeepestSubclassMax());             
      genCellInt(resultCode,cc.getCountAttributesMax());
      genCellInt(resultCode,cc.getCountMethodsMax());
      genCellInt(resultCode,cc.getCountParametersMax());           
      resultCode.append("</tr>");    

    // Print MINs
      resultCode.append("<tr>");
      genCellString(resultCode,"MIN");
      genCellInt(resultCode, cc.getCountStateMachinesMin());
      genCellInt(resultCode,cc.getCountAssociationsMin());
      genCellInt(resultCode,cc.getCountSubclassesMin());             
      genCellInt(resultCode,cc.getCountDeepestSubclassMin());             
      genCellInt(resultCode,cc.getCountAttributesMin());
      genCellInt(resultCode,cc.getCountMethodsMin());
      genCellInt(resultCode,cc.getCountParametersMin());           
      resultCode.append("</tr>");    

      resultCode.append("</tbody></table>");

    // Print Legend
    resultCode.append("<h3>Legend of Class Metrics:</h3>\n<ul>\n");
    resultCode.append("   <li>#State Machines - Total of SM per class.\n");
    resultCode.append("   <li>#Associations - Total of associaions per class.\n");
    resultCode.append("   <li>#Subclasses - Total of subclasses conected directly per class.\n");
    resultCode.append("   <li>#Depth Subclasses - Amount of classes up to deepest subclasse.\n");
    resultCode.append("   <li>#Attributes - Total of attributes per class, disregarding attribute modifiers.\n");
    resultCode.append("   <li>#Methods - Total of methods per class, disregarding class modifiers. \n");
    resultCode.append("   <li>#Method Parameters - Total of parameters in the class. \n</ul>\n\n");
    
    return;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "resultCode" + "=" + (getResultCode() != null ? !getResultCode().equals(this)  ? getResultCode().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}