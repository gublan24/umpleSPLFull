/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import java.util.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;
import cruise.umple.alloy.*;

// line 22 "../../../../src/Generator_CodeAlloy.ump"
public class AlloyGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AlloyGenerator Attributes
  private UmpleModel model;
  private String output;
  private Utility utility;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AlloyGenerator()
  {
    super();
    model = null;
    output = "";
    utility = new Utility();
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

  public boolean setUtility(Utility aUtility)
  {
    boolean wasSet = false;
    utility = aUtility;
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

  public Utility getUtility()
  {
    return utility;
  }

  public void delete()
  {
    super.delete();
  }

  // line 40 "../../../../src/Generator_CodeAlloy.ump"
   public void generate(){
    final String className = "UmpleObject";
    StringBuilder code = new StringBuilder(); 
    
    AlloyModel alloyModel = new AlloyModel(model);
    utility.addString(code,alloyModel.getModelNamespace());
    utility.addString(code,alloyModel.comment());
    
    for(Statement openSt : alloyModel.getImportStatements())
      utility.addString(code,openSt.print());
    
    for(Signature sig : alloyModel.getSignatures())
      utility.addString(code,sig.printSignature());
      
    for(Fact constraint : alloyModel.getFacts())
      utility.addString(code,constraint.print());
    
    //This generates bidirectionality rules for every association within Umple model 
    terminateCode(code);
  }

  // line 61 "../../../../src/Generator_CodeAlloy.ump"
   private void terminateCode(StringBuilder code){
    model.setCode(code.toString());
    writeModel();
  }


  /**
   * Output the Alloy file to a file with the .als suffix
   */
  // line 68 "../../../../src/Generator_CodeAlloy.ump"
   private void writeModel(){
    try
    {
      String path = model.getUmpleFile().getPath();
      File file = new File(path);
      file.mkdirs();
      String modelFilename = path + File.separator + model.getUmpleFile().getSimpleFileName() + ".als";
      BufferedWriter bw = new BufferedWriter(new FileWriter(modelFilename));
      bw.write(model.getCode());
      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("There was a problem with generating Alloy code." + e, e);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "utility" + "=" + (getUtility() != null ? !getUtility().equals(this)  ? getUtility().toString().replaceAll("  ","    ") : "this" : "null");
  }
}