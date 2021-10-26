/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import java.util.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;
import java.util.regex.Pattern;

// line 10 "../../../../src/Generator_CodeUSE.ump"
public class USEGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "  ";
  public static final String TEXT_1 = "[";
  public static final String TEXT_2 = " -- ";
  public static final String TEXT_3 = "]";
  public static final String TEXT_4 = "model ";
  public static final String TEXT_5 = "";
  public static final String TEXT_6 = NL + NL + "class ";
  public static final String TEXT_7 = "";
  public static final String TEXT_8 = NL + "  attributes";
  public static final String TEXT_9 = "";
  public static final String TEXT_10 = NL;
  public static final String TEXT_11 = "    ";
  public static final String TEXT_12 = " : ";
  public static final String TEXT_13 = "";
  public static final String TEXT_14 = "";
  public static final String TEXT_15 = NL;
  public static final String TEXT_16 = " ";
  public static final String TEXT_17 = " { ";
  public static final String TEXT_18 = " }";
  public static final String TEXT_19 = NL + "end";
  public static final String TEXT_20 = NL + NL + "association ";
  public static final String TEXT_21 = " between ";
  public static final String TEXT_22 = " ";
  public static final String TEXT_23 = NL + "end";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //USEGenerator Attributes
  private UmpleModel model;
  private String output;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public USEGenerator()
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

  // line 23 "../../../../src/Generator_CodeUSE.ump"
   private String getAssociationName(Association as){
    String firstEndName = as.getEnd(0).getDisplayRoleName();
    String secondEndName = as.getEnd(1).getDisplayRoleName();
    if(firstEndName.equals(secondEndName)) {
      if("".equals(firstEndName)) {
        return as.getName();
      } else {
        return firstEndName;
      }
    } else {
      return firstEndName + "__" + secondEndName;
    }
  }

  // line 37 "../../../../src/Generator_CodeUSE.ump"
   private String getUSEType(Attribute av){
    String typeName = av.getType() == null ? "String" : av.getType();
    if ("Date".equals(typeName) || "Time".equals(typeName))
    {
       typeName = "String";
    }
    else if ("Double".equals(typeName) || "Float".equals(typeName))
    {
      typeName = "Real";
    }
    return typeName;
  }

  // line 100 "../../../../src/Generator_CodeUSE.ump"
   public void generate(){
    model.setCode(generateTemplate());
    writeModel();
  }

  // line 106 "../../../../src/Generator_CodeUSE.ump"
   private void writeModel(){
    try
    {
      String path = model.getUmpleFile().getPath();
      File file = new File(path);
      file.mkdirs();
      String modelFilename = path + File.separator + model.getUmpleFile().getSimpleFileName() + ".use";
      BufferedWriter bw = new BufferedWriter(new FileWriter(modelFilename));
      bw.write(model.getCode());
      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("There was a problem with generating USE code." + e, e);
    }
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  private StringBuilder _useAssociationEnd(Integer numSpaces, StringBuilder sb, AssociationEnd ae){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(ae.getClassName());
    realSb.append(TEXT_1);
    
  Multiplicity m = ae.getMultiplicity();
  if(m.getBound() == null) {
  
    realSb.append(m.getMinimum());
    realSb.append(TEXT_2);
    realSb.append(m.getMaximum());
    
  } else {
  
    realSb.append(m.getBound());
    
  } 
    realSb.append(TEXT_3);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  private String useAssociationEnd(AssociationEnd ae){
        StringBuilder sb = new StringBuilder();
    return this._useAssociationEnd(0,sb,ae).toString(); 
  }

  public StringBuilder _generateTemplate(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
     ArrayList<Association> externalAssociations = new ArrayList<Association>(); 
    
    realSb.append(TEXT_4);
    realSb.append(model.getUmpleFile().getSimpleFileName());
    realSb.append(TEXT_5);
     for(UmpleClass uClass : model.getUmpleClasses()) { 
    realSb.append(TEXT_6);
    realSb.append(uClass.getName());
     if(uClass.getExtendsClass() != null) { 
    realSb.append(uClass.getExtendsClass().getName());
     } 
    realSb.append(TEXT_7);
     if(uClass.getAttributes().size() > 0) { 
    realSb.append(TEXT_8);
     } 
    realSb.append(TEXT_9);
     for(Attribute av : uClass.getAttributes()) { 
    realSb.append(TEXT_10);
    realSb.append(TEXT_11);
     if(av.getIsList()) { 
    realSb.append(getModel().getGlossary().getPlural(av.getName()));
     } else { 
    realSb.append(getModel().getGlossary().getSingular(av.getName()));
     } 
    realSb.append(TEXT_12);
    realSb.append(getUSEType(av));
    realSb.append(TEXT_13);
     } 
    realSb.append(TEXT_14);
     for(CodeInjection ci : uClass.getCodeInjections()) { 
    realSb.append(TEXT_15);
    realSb.append(ci.getType());
    realSb.append(TEXT_16);
    realSb.append(ci.getOperation());
    realSb.append(TEXT_17);
    realSb.append(ci.getCode());
    realSb.append(TEXT_18);
     } 
    realSb.append(TEXT_19);
     }
java.util.HashSet<Association> processed = new java.util.HashSet<Association>();
for(UmpleClass uClass : model.getUmpleClasses()) {
  for(Association as : uClass.getAssociations()) {
    if(processed.contains(as)) {
      continue;
    }
    processed.add(as);

    realSb.append(TEXT_20);
    realSb.append(getAssociationName(as));
    realSb.append(TEXT_21);
    realSb.append(useAssociationEnd(as.getEnd(0)));
    realSb.append(TEXT_22);
    realSb.append(useAssociationEnd(as.getEnd(1)));
    realSb.append(TEXT_23);
    
  }
} 


    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String generateTemplate(){
        StringBuilder sb = new StringBuilder();
    return this._generateTemplate(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}