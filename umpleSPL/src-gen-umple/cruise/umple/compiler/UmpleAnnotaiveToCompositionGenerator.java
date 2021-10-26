/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import java.util.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;
import java.util.stream.Collectors;

// line 12 "../../../../src/Generator_CodeAnnotaiveToComposition.ump"
public class UmpleAnnotaiveToCompositionGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleAnnotaiveToCompositionGenerator Attributes
  private UmpleModel model;
  private String output;
  private String fileExtension;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleAnnotaiveToCompositionGenerator()
  {
    super();
    model = null;
    output = "";
    fileExtension = ".ump";
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

  public boolean setFileExtension(String aFileExtension)
  {
    boolean wasSet = false;
    fileExtension = aFileExtension;
    wasSet = true;
    return wasSet;
  }

  public UmpleModel getModel()
  {
    return model;
  }

  public String getOutput()
  {
    return output;
  }

  public String getFileExtension()
  {
    return fileExtension;
  }

  public void delete()
  {
    super.delete();
  }


  /**
   * CENTRAL GENERATE METHOD
   */
  // line 28 "../../../../src/Generator_CodeAnnotaiveToComposition.ump"
   public void generate(){
    StringBuilder code = new StringBuilder();
    List<Mixset> mixsetList = model.getMixsetOrFiles().stream().filter(mixset -> mixset.getIsMixset()).map(obj -> (Mixset)obj).collect(Collectors.toList());
    code.append("/* \n"); 
    code.append("Annotaive fragments are refactored into composition fragments. \n");
    code.append("Total mixsts definitions: "+mixsetList.size());
    code.append("\n*/ \n");
    code.append("//*** \n");
    code.append("//Coarse-grained variability : \n");

    for (Mixset aMixset: mixsetList)
    {
      code.append("\n");
      code.append("mixset "+aMixset.getMixsetName() + " { ") ;
      for (MixsetFragment  mFragment : aMixset.getMixsetFragments())
      {
        code.append("\n// Fragment source file: "+mFragment.getOriginalUmpFile().getFileName());
        code.append("\n// Line : "+mFragment.getOriginalUmpLine());
        code.append("\n"+mFragment.getBody());
        code.append("\n");
      }
      code.append("\n}\n") ;
    }
    //
    code.append("//*** \n");
    code.append("//Fine-grained variability : \n");
    //
    int labelCount= 1;
    List<UmpleClass> umpleClasses = model.getUmpleClasses().stream().filter(classM -> classM.getMethods().size() > 0).collect(Collectors.toList());
    for (UmpleClass aClass : umpleClasses)
    {
      String className = aClass.getName();
      String classInlineMixset ="";
      try
      {
        List<Method> methodsWithInlineMixset = aClass.getMethods().stream().filter(classM -> classM.getMethodBody() != null).collect(Collectors.toList());
        for (Method method : methodsWithInlineMixset)
        {
          List<MixsetInMethod> mixsetInMethodList = method.getMethodBody().getMixsetInMethods();
          for (MixsetInMethod mixsetInMethod : mixsetInMethodList)
          {
            // prepare parameter types
            String injectionParameters = "";
            List<String> paramList = method.getMethodParameters().stream().map(aParam  -> aParam.getType()).collect(Collectors.toList());
            String paramListCommaSeparated = String.join(",", paramList);
            if(paramList.size() > 0)
            injectionParameters = "("+paramListCommaSeparated+ ")";
            // define a labeled aspect injection.
            String mixsetBody = mixsetInMethod.getMixsetFragment();
            mixsetBody = mixsetBody.substring(mixsetBody.indexOf("{"));
            classInlineMixset+="mixset " + mixsetInMethod.getMixsetName() + " { \n";
            classInlineMixset+="  class " + className + " { \n";            // start class definition 
            classInlineMixset+="    before "+ "Lable_"+mixsetInMethod.getMixsetName()+"_"+labelCount+":"+ method.getName()+ injectionParameters+"\n  "+ mixsetBody;
            classInlineMixset+="  } \n";
            classInlineMixset+="} \n"; // end class definition.
            labelCount ++;
            // two empty line after each aspect injection.
            classInlineMixset+="\n\n";
            }
          }
          if(classInlineMixset.trim().length() > 1)
          {
            code.append(classInlineMixset);
          }
        }
        catch(NullPointerException ex)
        {
          continue;
        }
    }
    code.append("\n");
    model.setCode(code.toString());
    writeModel();
  }

  // line 105 "../../../../src/Generator_CodeAnnotaiveToComposition.ump"
   private String spacer(int num){
    StringBuilder space = new StringBuilder();
    for (int i = 0; i < num; i++)
    {
      space.append(" ");
    }
    return space.toString();
  }

  // line 115 "../../../../src/Generator_CodeAnnotaiveToComposition.ump"
   private void writeModel(){
    try
    {
      String path = model.getUmpleFile().getPath();
      File file = new File(path);
      file.mkdirs();
      String modelFilename = path + File.separator + model.getUmpleFile().getSimpleFileName()+"_refactoredToComposition" + this.fileExtension ;
      BufferedWriter bw = new BufferedWriter(new FileWriter(modelFilename));
      bw.write(model.getCode());
      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("There was a problem with generating UmpleSelf code." + e, e);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "," +
            "fileExtension" + ":" + getFileExtension()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}