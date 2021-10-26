/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import java.util.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;
import cruise.umple.nusmv.*;

// line 19 "../../../../src/Generator_CodeNuSMV.ump"
public class NuSMVGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //NuSMVGenerator Attributes
  private UmpleModel model;
  private String output;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NuSMVGenerator()
  {
    super();
    model = null;
    output = "";
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

  public void delete()
  {
    super.delete();
  }

  // line 37 "../../../../src/Generator_CodeNuSMV.ump"
   public void generate(){
    NuSMVCoordinator coord = new NuSMVCoordinator();
    StringBuilder code = new StringBuilder();
 
 	//This appends comment to the model
    code.append(coord.commentModel(model));
    code.append("-- PLEASE DO NOT EDIT THIS CODE --\n");
    code.append("-- This code was generated using the UMPLE "+UmpleModel.VERSION_NUMBER+" modeling language! --\n\n");
    code.append( coord.generateModules( model, 0 ) );
    terminateCode( code );
    
    //coord.analyzeModel( model );
  }

  // line 51 "../../../../src/Generator_CodeNuSMV.ump"
   private void terminateCode(StringBuilder code){
    model.setCode( code.toString() );
    writeModel();
  }


  /**
   * Output the NuSMV file to a file with the .als suffix
   */
  // line 58 "../../../../src/Generator_CodeNuSMV.ump"
   private void writeModel(){
    try
    {
      String path = model.getUmpleFile().getPath();
      File file = new File(path);
      file.mkdirs();
      String modelFilename = path + File.separator + model.getUmpleFile().getSimpleFileName() + ".smv";
      BufferedWriter bw = new BufferedWriter(new FileWriter(modelFilename));
      bw.write(model.getCode());
      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("There was a problem with generating NuSMV code." + e, e);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}