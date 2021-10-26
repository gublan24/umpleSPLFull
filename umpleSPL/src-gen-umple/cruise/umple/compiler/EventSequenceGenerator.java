/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import java.util.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;

// line 18 "../../../../src/Generator_CodeEventSequence.ump"
// line 790 "../../../../src/Generator_CodeEventSequence.ump"
public class EventSequenceGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EventSequenceGenerator Attributes
  private UmpleModel model;
  private String output;
  private EventSequenceTemplate templater;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EventSequenceGenerator()
  {
    super();
    model = null;
    output = "";
    templater = new EventSequenceTemplate();
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

  public boolean setOutput(String aOutput)
  {
    boolean wasSet = false;
    output = aOutput;
    wasSet = true;
    return wasSet;
  }

  public boolean setTemplater(EventSequenceTemplate aTemplater)
  {
    boolean wasSet = false;
    templater = aTemplater;
    wasSet = true;
    return wasSet;
  }

  /**
   * Contains various aspects from an Umple file (.ump), such as classes, attributes, associations and methods.  Generated output is based
   * off of what's contained in here.
   */
  public UmpleModel getModel()
  {
    return model;
  }

  public String getOutput()
  {
    return output;
  }

  public EventSequenceTemplate getTemplater()
  {
    return templater;
  }

  public void delete()
  {
    super.delete();
  }


  /**
   * CENTRAL GENERATE METHOD
   */
  // line 798 "../../../../src/Generator_CodeEventSequence.ump"
   public void generate(){
    int counter = 0;
    StringBuilder code = new StringBuilder();
    code.append(templater.genTopHeader(
      model.getUmpleFile().getSimpleFileName()));

    // Determine if there are multiple classes with state machines
    // or multiple state machines in any class
    // If so, we will need to put boxes around the state machines
    int smCount = 0;
    for (UmpleClass uClass : model.getUmpleClasses()) 
    {
      for (StateMachine sm : uClass.getStateMachines()) 
      {
        smCount++;
      }
    }

    if(smCount == 0) 
    {
      // Special case. No state machine.

      code.append(templater.genNoSMMessage());

      terminateCode(code);
      return;
    }

    // Message to notify users that the order of events is random
    code.append(templater.genRandomNotification());

    // We now know we have to output one or more state machines
    // Iterate through each class.
    for (UmpleClass uClass : model.getUmpleClasses())
    {
      String className = uClass.getName();

      // Process the top level state machines in a class
      for (StateMachine sm : uClass.getStateMachines())
      {
        code.append(templater.genTableTitleHeader(className, sm.getName()));
        EventSequencer es = new EventSequencer(sm, counter);
        counter++;
        seedRandomFromSuboptions(es);        

        code.append(es.generateEventSequence(templater));

      } // End iteration through state machines of a class
    } // End iteration through classes

    // Add scripts
    code.append(templater.genScripts());

    terminateCode(code);
  }

  // line 855 "../../../../src/Generator_CodeEventSequence.ump"
   private void terminateCode(StringBuilder code){
    model.setCode(code.toString());
    writeModel();
  }


  /**
   * Output the html to a file with a .html suffix
   */
  // line 862 "../../../../src/Generator_CodeEventSequence.ump"
   private void writeModel(){
    try
    {
      String path = model.getUmpleFile().getPath();
      File file = new File(path);
      file.mkdirs();
      String modelFilename = path + File.separator + 
        model.getUmpleFile().getSimpleFileName() + ".html";
      BufferedWriter bw = new BufferedWriter(new FileWriter(modelFilename));
      bw.write(model.getCode());
      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException(
        "There was a problem with generating Event Sequences." + e, e);
    }
  }


  /**
   * Sets a non-random seed for the EventSequencer when the suboption "seed"
   * is used. A second suboption can be passed directly after the "seed" to
   * specify a specific seed.
   */
  // line 885 "../../../../src/Generator_CodeEventSequence.ump"
   private void seedRandomFromSuboptions(EventSequencer es){
    if(this.hasSuboption("seed")) {
      int subOptIndex = Arrays.asList(getSuboptions()).indexOf("seed");
      long seed = 0;
      if(subOptIndex + 1 < getSuboptions().length) {
        //Probably a seed number attached to the suboptions
        try {
          seed = Long.parseLong(getSuboptions()[subOptIndex + 1]);
        } catch (NumberFormatException e) {
          System.out.println("Seed value expected as suboption after 'seed'");
        }
      } 

      es.getRandomGenerator().setSeed(seed);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "templater" + "=" + (getTemplater() != null ? !getTemplater().equals(this)  ? getTemplater().toString().replaceAll("  ","    ") : "this" : "null");
  }
}