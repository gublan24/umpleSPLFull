/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import java.util.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;

// line 12 "../../../../src/Generator_CodeUmpleSelf.ump"
public class UmpleSelfGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleSelfGenerator Attributes
  private UmpleModel model;
  private String output;
  private String fileExtension;
  private int temp;
  private boolean hideActions;
  private boolean hideGuards;
  private boolean showTransitionLabels;
  private boolean showGuardLabels;
  private String display_language;
  private StateMachine root;
  private boolean roleExists;
  private String roleName;
  private String smSeqType;
  private String compositeStateSeqType;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleSelfGenerator()
  {
    super();
    model = null;
    output = "";
    fileExtension = ".umpself";
    temp = 0;
    hideActions = false;
    hideGuards = true;
    showTransitionLabels = false;
    showGuardLabels = false;
    display_language = "";
    roleExists = false;
    roleName = "";
    smSeqType = "";
    compositeStateSeqType = "";
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

  public boolean setTemp(int aTemp)
  {
    boolean wasSet = false;
    temp = aTemp;
    wasSet = true;
    return wasSet;
  }

  public boolean setHideActions(boolean aHideActions)
  {
    boolean wasSet = false;
    hideActions = aHideActions;
    wasSet = true;
    return wasSet;
  }

  public boolean setHideGuards(boolean aHideGuards)
  {
    boolean wasSet = false;
    hideGuards = aHideGuards;
    wasSet = true;
    return wasSet;
  }

  public boolean setShowTransitionLabels(boolean aShowTransitionLabels)
  {
    boolean wasSet = false;
    showTransitionLabels = aShowTransitionLabels;
    wasSet = true;
    return wasSet;
  }

  public boolean setShowGuardLabels(boolean aShowGuardLabels)
  {
    boolean wasSet = false;
    showGuardLabels = aShowGuardLabels;
    wasSet = true;
    return wasSet;
  }

  public boolean setRoot(StateMachine aRoot)
  {
    boolean wasSet = false;
    root = aRoot;
    wasSet = true;
    return wasSet;
  }

  public boolean setRoleExists(boolean aRoleExists)
  {
    boolean wasSet = false;
    roleExists = aRoleExists;
    wasSet = true;
    return wasSet;
  }

  public boolean setRoleName(String aRoleName)
  {
    boolean wasSet = false;
    roleName = aRoleName;
    wasSet = true;
    return wasSet;
  }

  public boolean setSmSeqType(String aSmSeqType)
  {
    boolean wasSet = false;
    smSeqType = aSmSeqType;
    wasSet = true;
    return wasSet;
  }

  public boolean setCompositeStateSeqType(String aCompositeStateSeqType)
  {
    boolean wasSet = false;
    compositeStateSeqType = aCompositeStateSeqType;
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

  public String getFileExtension()
  {
    return fileExtension;
  }

  public int getTemp()
  {
    return temp;
  }

  public boolean getHideActions()
  {
    return hideActions;
  }

  public boolean getHideGuards()
  {
    return hideGuards;
  }

  public boolean getShowTransitionLabels()
  {
    return showTransitionLabels;
  }

  public boolean getShowGuardLabels()
  {
    return showGuardLabels;
  }

  public StateMachine getRoot()
  {
    return root;
  }

  public boolean getRoleExists()
  {
    return roleExists;
  }

  public String getRoleName()
  {
    return roleName;
  }

  public String getSmSeqType()
  {
    return smSeqType;
  }

  public String getCompositeStateSeqType()
  {
    return compositeStateSeqType;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isHideActions()
  {
    return hideActions;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isHideGuards()
  {
    return hideGuards;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isShowTransitionLabels()
  {
    return showTransitionLabels;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isShowGuardLabels()
  {
    return showGuardLabels;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isRoleExists()
  {
    return roleExists;
  }

  public void delete()
  {
    super.delete();
  }


  /**
   * CENTRAL GENERATE METHOD
   */
  // line 43 "../../../../src/Generator_CodeUmpleSelf.ump"
   public void generate(){
    CodeGenerator internalGen = generateBasedOn();
    internalGen.prepare();

    StringBuilder code = new StringBuilder();
    ArrayList<Association> externalAssociations = new ArrayList<Association>();

    for (UmpleClass uClass : model.getUmpleClasses())
    {
      for (String aNamespace: uClass.getNamespaces())
      {
        code.append(StringFormatter.format("namespace {0};\n", aNamespace));   
      }
      code.append(StringFormatter.format("\nclass {0}\n{\n", uClass.getName()));

      if (uClass.getExtendsClass() != null)
      {
        code.append(StringFormatter.format("  isA {0};\n", uClass.getExtendsClass().getName()));
      }

      for (Depend aDepend : uClass.getDepends())
      {
        code.append(StringFormatter.format(" depend {0};\n", aDepend.getName()));   
      }

      for (Attribute av : uClass.getAttributes())
      {
        String typeName = av.getType() == null ? "String" : av.getType();
        String attrName = av.getIsList() ? getModel().getGlossary().getPlural(av.getName()) : getModel().getGlossary().getSingular(av.getName());

        code.append(" ");
        if (av.isIsLazy())
        {
          code.append(" lazy");
        }

        if (!av.getModifier().equals("settable"))
        {
          code.append(StringFormatter.format(" {0}", av.getModifier()));
        }

        if (av.isIsAutounique())
        {
          code.append(" autounique");
        }
        else if (!typeName.equals("String") || av.isImmutable() || av.isIsLazy())
        {
          code.append(StringFormatter.format(" {0}", typeName));
        }
        code.append(StringFormatter.format(" {0}", attrName));

        if (av.getValue() != null)
        {
          code.append(StringFormatter.format(" = {0}", av.getValue()));
        }

        code.append(";\n");
      }

      for (Association as : uClass.getAssociations())
      {
        AssociationEnd myEnd = as.getIsRightNavigable() ? as.getEnd(0) : as.getEnd(1);
        AssociationEnd theirEnd = as.getIsRightNavigable() ? as.getEnd(1) : as.getEnd(0);

        if (!myEnd.getClassName().equals(uClass.getName()))
        {
          continue;
        }
        if (as.isNamed())
        {
          externalAssociations.add(as);
          continue;
        }
        code.append(StringFormatter.format("  {0} {1} -- {3} {4} {2};\n", myEnd.getMultiplicity().getParserable(), myEnd.getRoleName(), theirEnd.getRoleName(), theirEnd.getMultiplicity().getParserable(), theirEnd.getClassName()));
      }

      for (CodeInjection ci : uClass.getCodeInjections())
      {
        code.append(StringFormatter.format("  {0} {1} { {2} }\n", ci.getType(), ci.getOperation(), ci.getCode()));
      }
      
      for (StateMachine sm : uClass.getStateMachines())
      {
        generateStateMachine(sm, 1, code);
      }

      for (Method m : uClass.getMethods())
      {
        if (m.getSource() == Method.Source.fAutoAPI)
          continue;
        generateMethod(m, code);
      }

      code.append("}\n");
    }

    for (Association as : externalAssociations)
    {
      AssociationEnd myEnd = as.getIsRightNavigable() ? as.getEnd(0) : as.getEnd(1);
      AssociationEnd theirEnd = as.getIsRightNavigable() ? as.getEnd(1) : as.getEnd(0);

      code.append(StringFormatter.format("\nassociation {0}\n{\n", as.getName()));
      code.append(StringFormatter.format("  {0} {1} {2} -- {4} {5} {3};\n", myEnd.getMultiplicity().getParserable(), myEnd.getRoleName(), myEnd.getClassName(), theirEnd.getRoleName(), theirEnd.getMultiplicity().getParserable(), theirEnd.getClassName()));
      code.append("}");
    }

    model.setCode(code.toString());
    writeModel();
    internalGen.postpare();
  }


  /**
   * end generate
   */
  // line 157 "../../../../src/Generator_CodeUmpleSelf.ump"
   private void generateMethod(Method m, StringBuilder code){
    code.append(StringFormatter.format("\n  {0} {1} {2}", m.getModifier().trim(), m.getType(), m.getName()));
    generateParams(m.getMethodParameters(), code, false);
    code.append(" {\n");
    String body = m.getMethodBody().getCodeblock().toString();
    if (body.length() > 0) { code.append("\n"); }
    code.append(body);
    if (body.length() > 0) { code.append("\n"); }
    code.append("  }\n");
  }

  // line 169 "../../../../src/Generator_CodeUmpleSelf.ump"
   private void generateParams(List<MethodParameter> allParams, StringBuilder code, boolean ignoreIfDone){
    if (allParams.size() == 0)
    {
      if (!ignoreIfDone) { code.append("()"); }
    }
    else
    {
      code.append("(");
      boolean isFirst = true;
      for (MethodParameter p : allParams)
      {
        if (!isFirst)
        {
          code.append(", ");
        }
        code.append(StringFormatter.format("{0} {1}", p.getType(), p.getName()));
        isFirst = false;
      }
      code.append(")");
    }
  }

  // line 192 "../../../../src/Generator_CodeUmpleSelf.ump"
   private void generateStateMachine(StateMachine sm, int level, StringBuilder code){
    String baseSpace = spacer(level * 2 + (level - 1) * 2);
    if(level == 1)
      code.append(StringFormatter.format("{1}{0} {\n", name(sm), baseSpace));

    boolean isFirst;
    boolean hasConsumedActivity;

    // Issue 1019 - Place Null state at the end because the default "enter" methods are no longer generated
    State nullState = sm.getNullState();

    for (State state : sm.getStates())
    {
      // Issue 1019
      if (nullState != null && state.equals(nullState)) 
      {
        continue;
      }
      if(state.isFinalState())
        code.append(StringFormatter.format("{1} final {0} {", state.getName(), baseSpace));
      else
        code.append(StringFormatter.format("{1}  {0} {", state.getName(), baseSpace));

      isFirst = true;
      hasConsumedActivity = false;

      for (Action a : state.getActions())
      {
        if (isFirst)
        {
          code.append("\n");
        }
        code.append(StringFormatter.format("{0}  ", baseSpace));
        code.append(StringFormatter.format("{0} / { {1} }\n", a.getActionType(), a.getActionCode()));
        isFirst = false;
      } 

      for (Transition t : state.getTransitions())
      {
        if (isFirst)
        {
          code.append("\n");
        }
        code.append(StringFormatter.format("{0}  ", baseSpace));
        if (t.getGuard() != null)
        {
          JavaGenerator gen = new JavaGenerator();
          gen.setModel(getModel());
          code.append(StringFormatter.format("[{0}] ", t.getGuard().getCondition(gen)));
        }

        Event event = t.getEvent();

        if (event.isAutoTransition() && state.hasActivities())
        {
          hasConsumedActivity = true;
          for (Activity activity : state.getActivities())
          {
            code.append(StringFormatter.format("do { {0} }", activity.getCodeblock().toString()));
          }
        }
        else if (!event.isAutoTransition())
        {
          code.append(StringFormatter.format("{0}", t.getEvent().getName()));
        }
        generateParams(t.getEvent().getParams(), code, true);
        code.append(" -> ");
        if (t.getAction() != null)
        {
          code.append(StringFormatter.format("/ { {0} } ", t.getAction().getCodeblock().toString()));
        }
        code.append(StringFormatter.format("{0};", t.getNextState().getName()));
        code.append("\n");
        isFirst = false;
      }
      if(state.hasNestedStateMachines())
        temp =0;
      int numberofStateMachine = state.getNestedStateMachines().size();
      for (StateMachine subSm : state.getNestedStateMachines())
      {
        temp ++;
        generateStateMachine(subSm, level+1, code,1);
        if (numberofStateMachine > 1 && temp != numberofStateMachine)
          code.append(StringFormatter.format("{0}  ||\n", baseSpace));

      }


      for (Activity activity : state.getActivities()){
        if (activity != null && !hasConsumedActivity)
        {
          if (isFirst)
          {
            code.append("\n");
          }
          code.append(StringFormatter.format("{0}  ", baseSpace));
          code.append(StringFormatter.format("do { {0} };\n", activity.getCodeblock().toString()));
          isFirst = false;
        }
      }

      code.append(StringFormatter.format("{0}  }\n", baseSpace));


    } // end for

    // Issue 1019
    /*
    if (nullState != null)
    {
      code.append(StringFormatter.format("{1}  {0} {", nullState.getName(), baseSpace));
      code.append(StringFormatter.format("{0}  }\n", baseSpace));
    }
    */

    code.append(StringFormatter.format("{0}}\n", baseSpace));
  }


  /**
   * Mohammad Al-hammouri
   */
  // line 312 "../../../../src/Generator_CodeUmpleSelf.ump"
   private void generateStateMachine(StateMachine sm, int level, StringBuilder code, int flag){
    String baseSpace = spacer(level * 2 + (level - 1) * 2);
    if(level == 1)
      code.append(StringFormatter.format("{1}{0} {\n", name(sm), baseSpace));

    boolean isFirst;
    boolean hasConsumedActivity;

    // Issue 1019 - Place Null state at the end because the default "enter" methods are no longer generated
    State nullState = sm.getNullState();

    for (State state : sm.getStates())
    {
      // Issue 1019
      if (nullState != null && state.equals(nullState)) 
      {
        continue;
      }

      if(state.isFinalState())
        code.append(StringFormatter.format("{1}  final {0} {", state.getName(), baseSpace));
      else
        code.append(StringFormatter.format("{1}  {0} {", state.getName(), baseSpace));
      isFirst = true;
      hasConsumedActivity = false;

      for (Action a : state.getActions())
      {
        if (isFirst)
        {
          code.append("\n");
        }
        code.append(StringFormatter.format("{0}  ", baseSpace));
        code.append(StringFormatter.format("{0} / { {1} }\n", a.getActionType(), a.getActionCode()));
        isFirst = false;
      } 

      for (Transition t : state.getTransitions())
      {
        if (isFirst)
        {
          code.append("\n");
        }
        code.append(StringFormatter.format("{0}  ", baseSpace));
        if (t.getGuard() != null)
        {
          JavaGenerator gen = new JavaGenerator();
          gen.setModel(getModel());
          code.append(StringFormatter.format("[{0}] ", t.getGuard().getCondition(gen)));
        }

        Event event = t.getEvent();
        if(event != null)
        {
          if (event.isAutoTransition() && state.hasActivities())
          {
            hasConsumedActivity = true;
            for (Activity activity : state.getActivities())
            {
              code.append(StringFormatter.format("do { {0} }", activity.getCodeblock().toString()));
            }
          }
          else if (!event.isAutoTransition())
          {
            code.append(StringFormatter.format("{0}", t.getEvent().getName()));
          }
          generateParams(t.getEvent().getParams(), code, true);
        }
        code.append(" -> ");
        if (t.getAction() != null)
        {
          code.append(StringFormatter.format("/ { {0} } ", t.getAction().getCodeblock().toString()));
        }
        code.append(StringFormatter.format("{0};", t.getNextState().getName()));
        code.append("\n");
        isFirst = false;
      }

      int numberofStateMachine = state.getNestedStateMachines().size();
      if(state.hasNestedStateMachines())
        temp =0;
      for (StateMachine subSm : state.getNestedStateMachines())
      {
        temp ++;
        generateStateMachine(subSm, level+1, code,1);
        if (numberofStateMachine > 1 && temp != numberofStateMachine)
          code.append(StringFormatter.format("{0}  ||\n", baseSpace));

      }


      for (Activity activity : state.getActivities()){
        if (activity != null && !hasConsumedActivity)
        {
          if (isFirst)
          {
            code.append("\n");
          }
          code.append(StringFormatter.format("{0}  ", baseSpace));
          code.append(StringFormatter.format("do { {0} };\n", activity.getCodeblock().toString()));
          isFirst = false;
        }
      }

      code.append(StringFormatter.format("{0}  }\n", baseSpace));


    } // end for

    // Issue 1019
    /*
    if (nullState != null)
    {
      code.append(StringFormatter.format("{1}  {0} {", nullState.getName(), baseSpace));
      code.append(StringFormatter.format("{0}  }\n", baseSpace));
    }
    */
    if (flag == 0)
      code.append(StringFormatter.format("{0}}\n", baseSpace));
  }

  // line 434 "../../../../src/Generator_CodeUmpleSelf.ump"
   private String name(StateMachine sm){
    String input = sm.getFullName();
    return input.substring(0, 1).toUpperCase() + input.substring(1);
  }

  // line 440 "../../../../src/Generator_CodeUmpleSelf.ump"
   private String spacer(int num){
    StringBuilder space = new StringBuilder();
    for (int i = 0; i < num; i++)
    {
      space.append(" ");
    }
    return space.toString();
  }

  // line 450 "../../../../src/Generator_CodeUmpleSelf.ump"
   private void writeModel(){
    try
    {
      String path = model.getUmpleFile().getPath();
      File file = new File(path);
      file.mkdirs();
      String modelFilename = path + File.separator + model.getUmpleFile().getSimpleFileName() + this.fileExtension ;
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

  // line 469 "../../../../src/Generator_CodeUmpleSelf.ump"
   private CodeGenerator generateBasedOn(){
    String targetLanguage = "Java";
    for (GenerateTarget target : model.getGenerates())
    {
      if (target.getLanguage().equals("UmpleSelf"))
      {
        continue;
      }
      targetLanguage = target.getLanguage();
      break;
    }
    return model.newGenerator(targetLanguage);
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "," +
            "fileExtension" + ":" + getFileExtension()+ "," +
            "temp" + ":" + getTemp()+ "," +
            "hideActions" + ":" + getHideActions()+ "," +
            "hideGuards" + ":" + getHideGuards()+ "," +
            "showTransitionLabels" + ":" + getShowTransitionLabels()+ "," +
            "showGuardLabels" + ":" + getShowGuardLabels()+ "," +
            "roleExists" + ":" + getRoleExists()+ "," +
            "roleName" + ":" + getRoleName()+ "," +
            "smSeqType" + ":" + getSmSeqType()+ "," +
            "compositeStateSeqType" + ":" + getCompositeStateSeqType()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "root" + "=" + (getRoot() != null ? !getRoot().equals(this)  ? getRoot().toString().replaceAll("  ","    ") : "this" : "null");
  }
}