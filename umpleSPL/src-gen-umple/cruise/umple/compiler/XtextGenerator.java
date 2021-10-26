/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.regex.*;
import java.util.*;
import java.io.*;
import cruise.umple.util.*;
import cruise.umple.compiler.Rule;

// line 12 "../../../../src/Generator_CodeXtext.ump"
public class XtextGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //XtextGenerator Attributes
  private List<PatternHandler> patterns;
  private UmpleModel model;
  private String outputPath;
  private String output;
  private HashSet<String> terminals;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public XtextGenerator()
  {
    super();
    patterns = new ArrayList<PatternHandler>();
    model = null;
    outputPath = "";
    output = "";
    terminals = new HashSet<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addPattern(PatternHandler aPattern)
  {
    boolean wasAdded = false;
    wasAdded = patterns.add(aPattern);
    return wasAdded;
  }

  public boolean removePattern(PatternHandler aPattern)
  {
    boolean wasRemoved = false;
    wasRemoved = patterns.remove(aPattern);
    return wasRemoved;
  }

  public boolean setModel(UmpleModel aModel)
  {
    boolean wasSet = false;
    model = aModel;
    wasSet = true;
    return wasSet;
  }

  public boolean setOutputPath(String aOutputPath)
  {
    boolean wasSet = false;
    outputPath = aOutputPath;
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

  public boolean setTerminals(HashSet<String> aTerminals)
  {
    boolean wasSet = false;
    terminals = aTerminals;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_GetMany */
  public PatternHandler getPattern(int index)
  {
    PatternHandler aPattern = patterns.get(index);
    return aPattern;
  }

  public PatternHandler[] getPatterns()
  {
    PatternHandler[] newPatterns = patterns.toArray(new PatternHandler[patterns.size()]);
    return newPatterns;
  }

  public int numberOfPatterns()
  {
    int number = patterns.size();
    return number;
  }

  public boolean hasPatterns()
  {
    boolean has = patterns.size() > 0;
    return has;
  }

  public int indexOfPattern(PatternHandler aPattern)
  {
    int index = patterns.indexOf(aPattern);
    return index;
  }

  public UmpleModel getModel()
  {
    return model;
  }

  public String getOutputPath()
  {
    return outputPath;
  }

  public String getOutput()
  {
    return output;
  }

  public HashSet<String> getTerminals()
  {
    return terminals;
  }

  public void delete()
  {
    super.delete();
  }

  // line 32 "../../../../src/Generator_CodeXtext.ump"
   public void generate(){
    StringBuilder xtext = new StringBuilder();
    patterns.add(new PatternHandler("\\[=(.*):\\[\\]\\]"){
      @Override
      public String manipulate(String[] groups, Integer frequency){
        return groups[0] + "_" + frequency + "?=" + "\'[]\'";
      }
    });
    patterns.add(new PatternHandler("\\[\\[(.*)\\]\\]"){
      @Override
      public String manipulate(String[] groups, Integer frequency){
        return getXtextRulename(groups[0]) + frequency + "+=" + getXtextRulename(groups[0]);
      }
    });
    patterns.add(new PatternHandler("\\[([^~=!*].*),(.*),(.*)>([0-9]),([0-9]),([0-9])\\]"){
      @Override
      public String manipulate(String[] groups, Integer frequency){
        return "("+groups[Integer.parseInt(groups[5])] + "_" + frequency + "=ID)?("+groups[Integer.parseInt(groups[4])] + "_" + frequency + "=ID)?("+groups[Integer.parseInt(groups[3])] + "_" + frequency + "=ID)";
      }
    });
    patterns.add(new PatternHandler("\\[([^~=!*].*),(.*)>([0-9]),([0-9])\\]"){
      @Override
      public String manipulate(String[] groups, Integer frequency){
        return "("+groups[Integer.parseInt(groups[3])] + "_" + frequency + "=ID)?("+groups[Integer.parseInt(groups[2])] + "_" + frequency + "=ID)";
      }
    });
    patterns.add(new PatternHandler("\\[([^~=!*].*),(.*)\\]"){
      @Override
      public String manipulate(String[] groups, Integer frequency){
        return "("+groups[0] + "_" + frequency + "=ID)" + "("+groups[1] + "_" + frequency + "=ID)";
      }
    });
    patterns.add(new PatternHandler("\\[([^~=!*].*)\\]"){
      @Override
      public String manipulate(String[] groups, Integer frequency){
        return groups[0] + "_" + frequency + "=ID";
      }
    });
    
    patterns.add(new PatternHandler("\\[~(.*)\\]"){
      @Override
      public String manipulate(String[] groups, Integer frequency){
        terminals.add("nameID:('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'-'|'_')*");
        return groups[0] + "_" + frequency + "=nameID";
      }
    });
    patterns.add(new PatternHandler("\\[!(.*):(.*)\\]"){
      @Override
      public String manipulate(String[] groups, Integer frequency){
        if(groups[1].equals("\\d+")){
          return groups[0] + "_int=INT";
        }
        else {
          terminals.add(groups[0]+":"+groups[1].replace("\\d","(INT)"));
          return groups[0] + "_" + frequency + "=" + groups[0];
        }
      }
    });
    patterns.add(new PatternHandler("\\[=([^:]*)\\]"){
      @Override
      public String manipulate(String[] groups, Integer frequency){
        if(!groups[0].equals("||")){
          return groups[0] + "_" + frequency + "?=" + "\'"+groups[0]+"\'";
        }
        else {
          
          return "\'||\'";
        }
      }
    });
    
    patterns.add(new PatternHandler("\\[=(.*):(.*)\\]"){
      @Override
      public String manipulate(String[] groups, Integer frequency){
        String options = "";
        String pipe = "";
        for(String option:groups[1].split("[|]")){
          options+=pipe+query(option);
          pipe = "|";
        }
        return groups[0] + "_" + frequency + "=" + "("+options+")";
      }
    });
    patterns.add(new PatternHandler("\\[\\Q**\\E(.*)\\]"){
      @Override
      public String manipulate(String[] groups, Integer frequency){
      terminals.add("block:\'begin\'(.*)\'end\'");
        return groups[0] + "_" + frequency + "=block";
      }
    });
    patterns.add(new PatternHandler("\\[\\Q*\\E(.*)\\]"){
      @Override
      public String manipulate(String[] groups, Integer frequency){
      terminals.add("block:\'begin\'(.*)\'end\'");
        return groups[0] + "_" + frequency + "=block";
      }
    });
    xtext.append("grammar cruise.umple.Umple with org.eclipse.xtext.common.Terminals\n\ngenerate umple \"http://www.umple.cruise/Umple\"\n\nModel:\n\tmodel=Program_;\n\n");
    HashSet<String> used = new HashSet<String>();
    for(Rule rule:(new UmpleInternalParser()).getRules()){
      if(used.add(rule.getName())){
        xtext.append(translate(rule)+"\n");
      }
    }
    for(String terminal:terminals){
      xtext.append("terminal "+terminal+";\n");
    }
    try {
      writeFile(xtext.toString());
    }
    catch(IOException e1){
    }
    model.setCode(xtext.toString());
  }

  // line 147 "../../../../src/Generator_CodeXtext.ump"
   private String translate(Rule rule){
    StringBuilder xtext = new StringBuilder();
    xtext.append(getXtextRulename(rule.getName())+":\n\t");
    String pipe = "";
    for(String definition:rule.getDefinitions()){
       xtext.append(pipe);
       pipe = "|\n\t";
       for(PatternHandler pattern:patterns){
         pattern.reset();
       }
       for(String fragment: definition.split(" ")){
         xtext.append(query(fragment));
       }
    }
    xtext.append(";");
    return xtext.toString();
  }

  // line 165 "../../../../src/Generator_CodeXtext.ump"
   private String query(String fragment){
    if(fragment.equals("")){
      return "";
    }
    for(PatternHandler pattern:patterns){
      if(pattern.canHandle(fragment)){
        return pattern.handle();
      }
    }
    if(!(fragment.equals("\'"))){
      return "\'"+fragment+"\'";
    }
    else {
      return "\""+fragment+"\"";
    }
  }

  // line 218 "../../../../src/Generator_CodeXtext.ump"
   private String getXtextRulename(String rulename){
    return rulename.substring(0,1).toUpperCase()+rulename.substring(1).replace("::","_")+"_";
  }

  // line 223 "../../../../src/Generator_CodeXtext.ump"
   private void writeFile(String contents) throws IOException{
    String path = StringFormatter.addPathOrAbsolute( 
                  model.getUmpleFile().getPath(), 
                            getOutput());
    
    String filename = path + "Umple.xtext";
    File file = new File(path);
    file.mkdirs();

    BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
    try
    {
      bw.write(contents);
      bw.flush();
    }
    finally
    {
      bw.close();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "outputPath" + ":" + getOutputPath()+ "," +
            "output" + ":" + getOutput()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "terminals" + "=" + (getTerminals() != null ? !getTerminals().equals(this)  ? getTerminals().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 181 "../../../../src/Generator_CodeXtext.ump"
  public abstract class PatternHandler 
  {
    private Pattern pattern;
	private Matcher matcher;
	protected HashMap<String,Integer> frequency = new HashMap<String,Integer>();
    public PatternHandler(String regex){
      pattern = Pattern.compile("(.*)"+regex+"(.*)");
    }
    public boolean canHandle(String input){
      matcher = pattern.matcher(input);
      return matcher.matches();
    }
    public void reset(){
      frequency.clear();
    }
    public String handle(){
      String[] groups = new String[matcher.groupCount()-2];
      String middle = "";
      for(int i=0;i<matcher.groupCount()-2;i++){
        groups[i]=matcher.group(i+2);
        middle += groups[i];
      }
      if(frequency.containsKey(middle))
      {
        frequency.put(middle,frequency.get(middle)+1);
      }
      else
      {
        frequency.put(middle,1);
      }
      String first = matcher.group(1);
      String last = matcher.group(matcher.groupCount());
      return first +"("+manipulate(groups,frequency.get(middle))+")"+last;
    }
    public abstract String manipulate(String[] groups, Integer middle);
  }

  
}