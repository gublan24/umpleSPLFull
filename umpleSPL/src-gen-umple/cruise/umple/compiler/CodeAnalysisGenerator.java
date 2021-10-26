/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import java.util.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;

// line 21 "../../../../src/Generator_CodeAnalysis.ump"
public class CodeAnalysisGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CodeAnalysisGenerator Attributes
  private UmpleModel model;
  private String output;
  private HtmlDocument doc;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CodeAnalysisGenerator()
  {
    super();
    model = null;
    output = "";
    doc = new HtmlDocument(true);
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

  public boolean setDoc(HtmlDocument aDoc)
  {
    boolean wasSet = false;
    doc = aDoc;
    wasSet = true;
    return wasSet;
  }

  /**
   * Contains various aspects from an Umple file (.ump), such as classes,
   * attributes, associations and methods.  Generated output is based
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

  public HtmlDocument getDoc()
  {
    return doc;
  }

  public void delete()
  {
    super.delete();
  }

  // line 39 "../../../../src/Generator_CodeAnalysis.ump"
  public void generate(){
    doc.createParagraphElement("Code Analysis from "+model.getUmpleFile().getSimpleFileName()+".ump", false);
    UmpleModelWalker walker = new UmpleModelWalker(model);
    walker.accept( new LLOCMetricVisitor(doc)); // LLOC Metrics
    walker.accept( new McCabeMetricVisitor(doc));  // McCabe Metrics
    walker.accept( new ClassStatsVisitor(doc));  // Class Stats Stats
    walker.accept( new StateMachineStatsVisitor(doc));  // Class StateMachines Stats
	model.setCode(doc.toString());
    writeModel();
    return;
  }


  /**
   * Output the metrics to a file
   */
  // line 53 "../../../../src/Generator_CodeAnalysis.ump"
  public void writeModel(){
    try
    {
      String path = model.getUmpleFile().getPath();
      File file = new File(path);
      file.mkdirs();
      String modelFilename = path + File.separator + model.getUmpleFile().getSimpleFileName() + ".html";
      BufferedWriter bw = new BufferedWriter(new FileWriter(modelFilename));
      bw.write(model.getCode());
      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("Code Analysis Exception: " + e, e);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "doc" + "=" + (getDoc() != null ? !getDoc().equals(this)  ? getDoc().toString().replaceAll("  ","    ") : "this" : "null");
  }
}