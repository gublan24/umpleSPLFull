/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import java.util.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;
import java.util.regex.Pattern;

// line 1 "../../../../src/Generator_SuperGvGenerator.ump"
public abstract class SuperGvGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "// Code generated by Umple ";
  public static final String TEXT_1 = NL + NL + "digraph \"";
  public static final String TEXT_2 = "\" {" + NL + "  size=\"80,10\"" + NL + "  rankdir=\"BT\"" + NL + "  node [shape=record margin=0; href=\"javascript:Action.selectClass(&quot;\\N&quot;);\"];" + NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SuperGvGenerator Attributes
  private UmpleModel model;
  private String output;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SuperGvGenerator()
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


  /**
   * CENTRAL GENERATE METHOD
   */
  // line 33 "../../../../src/Generator_SuperGvGenerator.ump"
   public void generate(){
    StringBuilder code = new StringBuilder();
    StringBuilder associations = new StringBuilder();
    String className;

    // Output basic gv file header
    _graphStart(0,code,model.getUmpleFile().getSimpleFileName());
    
    // Set of classes we are visiting
    // We always visit from the top of the hierarchy first
    // This set ensures we track what we have visited
    HashSet visitedClasses = new HashSet();

    // Iterate through each class. 
    for (UmpleClass uClass : model.getUmpleClasses())
    {
      visitClass(uClass, visitedClasses, code, associations);
    } // End iteration through classes
    
    for (UmpleInterface uInterface : getModel().getUmpleInterfaces()){
    	createInterfacesAndTheirHirerarchy(uInterface,code); 
    }
    terminateCode(code, associations);
  }


  /**
   * Actually output the class contents
   */
  // line 60 "../../../../src/Generator_SuperGvGenerator.ump"
   protected void visitClass(UmpleClass uClass, Set visitedClasses, StringBuilder code, StringBuilder associations){
    // Ensure we only visit once
    if(visitedClasses.contains(uClass)) {
      return;
    }
    
    // Ensure  output parents in the hierarchy first
    UmpleClass parent = uClass.getExtendsClass();
    if(parent != null) {
      visitClass(parent, visitedClasses, code, associations);
    }
    visitedClasses.add(uClass);
          
    String className = uClass.getName();
    classCreation(uClass, code);

    // Add any generalization now to parents
    // We know that parents have been output first
    UmpleClass parentClass = uClass.getExtendsClass();
    if(parentClass!= null) {
      parentClassAssoc(code, className, parentClass.getName());
    }

    interfaceCreation(uClass, code);

    // Add any associations so they are output at the end
    Set processedAssociations = new HashSet(); // needed to prevent reflexive double count
    for(Association uAssoc : uClass.getAssociations()) {
    
      // Prevent double-counting of reflexive associations
      if(processedAssociations.contains(uAssoc)) continue;
      processedAssociations.add(uAssoc);
      
      associationCreation(uClass, uAssoc, associations, className);
    }
  }

   protected abstract String generatorType();

   protected abstract void parentClassAssoc(StringBuilder code, String className, String parentName);

   protected abstract void classCreation(UmpleClass uClass, StringBuilder code);

   protected abstract void associationCreation(UmpleClass uClass, Association uAssoc, StringBuilder associations, String className);

   protected abstract void createInterfacesAndTheirHirerarchy(UmpleInterface inInterface, StringBuilder code);

  // line 101 "../../../../src/Generator_SuperGvGenerator.ump"
   protected void interfaceCreation(UmpleClass uClass, StringBuilder code){
    
  }

  // line 105 "../../../../src/Generator_SuperGvGenerator.ump"
   protected void terminateCode(StringBuilder code, StringBuilder associations){
    code.append("\n  // All associations\n");
    code.append(associations);

    code.append("}\n");

    model.setCode(code.toString());
    writeModel();
  }


  /**
   * Output the graphviz file to a file with the .gv suffix
   */
  // line 117 "../../../../src/Generator_SuperGvGenerator.ump"
   protected void writeModel(){
    try
    {
      String path = model.getUmpleFile().getPath();
      File file = new File(path);
      file.mkdirs();
      String modelFilename = path + File.separator + model.getUmpleFile().getSimpleFileName()
          + generatorType() + ".gv";
      BufferedWriter bw = new BufferedWriter(new FileWriter(modelFilename));
      bw.write(model.getCode());
      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("There was a problem with generating GraphViz Diagram code." + e, e);
    }
  }


  /**
   * Add the comment to a tooltip
   */
  // line 138 "../../../../src/Generator_SuperGvGenerator.ump"
   public static  String appendTooltipComment(List<Comment> comments, boolean title){
    StringBuilder tooltip = new StringBuilder();;
    for (Comment uComment : comments) {
      String text;
      if (!title) {
        text = uComment.getText().replace("\"","\\\"");
      } else {
        text = uComment.getText().replace("\"","'");
      }
      text = text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;"); // Issue1584 and 1587 "Certain kinds of comments (<,>,&) result in failure to generate graphviz"
      if(text.startsWith(" *")) {
        tooltip.append(text.substring(2)+"&#13;");
      }
      else
      {
        tooltip.append(text+"&#13;");
      }
    }
    return tooltip.toString();
  }

  // line 160 "../../../../src/Generator_SuperGvGenerator.ump"
   public static  String[] retArrows(Association uAssoc){
    String[] arrows = new String[2];

    if (uAssoc.getIsRightComposition()) {
      arrows[0] = "dir=\"forward\", arrowhead=\"diamond\"";
      arrows[1] = "-<@>";
    }
    else if (uAssoc.getIsLeftComposition()) {
      arrows[0] = "dir=\"back\", arrowtail=\"diamond\"";
      arrows[1] = "<@>-";
    }
    else {
      if(uAssoc.getIsLeftNavigable()) {
        if(uAssoc.getIsRightNavigable()) {
          arrows[0] = "dir=\"none\"";
          arrows[1] = "--";
        }
        else {
          arrows[0] = "dir=\"back\", arrowtail=\"open\"";
          arrows[1] = "<-";
        }
      }
      else if(uAssoc.getIsRightNavigable()) {
        arrows[0] = "dir=\"forward\", arrowhead=\"open\"";
        arrows[1] = "->";
      }
      else {
        arrows[0] = "dir=\"none\"";
        arrows[1] = "--";
      }
    }

    return arrows;
  }

  // line 196 "../../../../src/Generator_SuperGvGenerator.ump"
   public static  String labelAssociation(String left, String right, String arrow, String label, String tooltip){
    String association;

    association = "  \""+left+"\" -> \""+right+"\" ["+arrow+
        ", label=\""+label+"\""+", tooltip=\""+tooltip+"\" labeltooltip=\""+tooltip+"\" headtooltip=\"" + tooltip + "\" tailtooltip=\"" + tooltip + "\" labelurl=\"javascript:void()\" tailurl=\"javascript:void()\" headurl=\"javascript:void()\" ];\n";

    return association;
  }

  // line 207 "../../../../src/Generator_SuperGvGenerator.ump"
   public static  String twoLabelAssociation(String left, String right, String arrow, String hLabel, String tLabel, String tooltip){
    String association;

    association = "  \""+left+"\" -> \""+right+"\" ["+arrow+
        ", taillabel=\""+tLabel+"\""+", headlabel=\""+hLabel+"\""+
        ", tooltip=\""+tooltip+"\" headtooltip=\"" + tooltip + "\" tailtooltip=\"" + tooltip + "\" tailurl=\"javascript:void()\" headurl=\"javascript:void()\" ];\n";

    return association;
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _graphStart(Integer numSpaces, StringBuilder sb, String filename){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(UmpleModel.VERSION_NUMBER);
    realSb.append(TEXT_1);
    realSb.append(filename);
    realSb.append(TEXT_2);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String graphStart(String filename){
        StringBuilder sb = new StringBuilder();
    return this._graphStart(0,sb,filename).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}