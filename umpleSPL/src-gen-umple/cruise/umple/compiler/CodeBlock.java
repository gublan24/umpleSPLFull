/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

/**
 * ---------------------------------------------------------------------------------------------
 * ------------------------------------class end------------------------------------------------
 * ---------------------------------------------------------------------------------------------
 * 
 * A block of code in an arbitrary language to be injected into generated code
 * Please update the method 'public CodeBlock(CodeBlock another)' if you add new attributes.
 */
// line 23 "../../../../src/Umple_Code_StateMachine.ump"
// line 321 "../../../../src/Umple_Code_Trait.ump"
// line 225 "../../../../src/Umple_CodeMethod.ump"
// line 48 "../../../../src/Aspect_refactored.ump"
// line 533 "../../../../src/Umple.ump"
public class CodeBlock
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CodeBlock Attributes
  private HashMap<String,String> codes;
  private String name;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CodeBlock()
  {
    codes = new HashMap<String,String>();
    name = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public void delete()
  {}


  /**
   * @author Vahdat
   * The following part of code may not generate proper code-style code generation.
   * Currently, we deal with code style at the code generation level (UmpleTemplate Language);
   */
  // line 30 "../../../../src/Umple_Code_StateMachine.ump"
   public void findKeywordAndReplace(String keyword, CodeBlock cBlock, StateMachine inStateMachine){
    if(keyword==null || keyword=="") return;
        for (String language : codes.keySet()) {
          String replacement=System.lineSeparator()+"\t\t//This part of code comes from the trait '"+inStateMachine.getRootStateMachine().getUmpleTrait().getName()+"' -> begins"+System.lineSeparator()+"\t\t";
          replacement = replacement+cBlock.codes.get(language).replace(keyword, "");
          replacement=replacement+System.lineSeparator()+"\t\t//The code coming from trait '"+inStateMachine.getRootStateMachine().getUmpleTrait().getName()+"' ends here"+System.lineSeparator()+"\t\t";
          codes.put(language,codes.get(language).replace(keyword,replacement+keyword)) ;
        }
  }


  /**
   * @author Vahdat
   */
  // line 327 "../../../../src/Umple_Code_Trait.ump"
   public void ApplyTypeParameters(GeneralTPApplied inGeneralTPApplied, UmpleTrait inTrait){
    if (inGeneralTPApplied == null && inTrait.numberOfGeneralTemplateParameters()==0) return;
      Integer start=0,end=0;
      boolean inProcess = false;
      String internalCode = "";
      for (String language : codes.keySet()) {
        String code = codes.get(language);
        start=0;
        end=0;
        inProcess = false;
        internalCode = "";
        for (int i=0;i<code.length();i++) {
          if (code.charAt(i)=='#' &&!inProcess){
            inProcess=true;
            start = i;
            continue;
          }
          if (code.charAt(i)=='#' && inProcess){
          inProcess=false;
          end=i;
          String strTemp = code.substring(start+1, end);
          Boolean replaced = false;
          for(GeneralTemplateParameter gtp : inTrait.getGeneralTemplateParameters()){
            if (strTemp.equals(gtp.getName())){
              String newName = (inGeneralTPApplied!=null && inGeneralTPApplied.getParameterMapping().containsKey(gtp.getName())) ? inGeneralTPApplied.getParameterMapping().get(gtp.getName()) : gtp.getDefaultValue();
              internalCode = internalCode+newName;
              replaced = true;
              break;
            }
          }
          if (!replaced) {
            internalCode = internalCode+"#"+strTemp;
          } else{
            continue;
          }
        }
        if (!inProcess){
          internalCode = internalCode+code.charAt(i);
        }
      }
      codes.put(language, internalCode);
    }
  }


  /**
   * @author Vahdat
   * @param another a CodeBlock that we would like to make a clone of.
   * Please maintain this method if you're going to add new attributes to the class CodeBlock.
   * This code manually creates a clone of a state machine.
   * 
   */
  // line 235 "../../../../src/Umple_CodeMethod.ump"
   public  CodeBlock(CodeBlock another){
    this.name = another.getName();
  	this.codes = new HashMap<String,String>();
  	this.codes.putAll(another.codes);
  }


  /**
   * @author Vahdat
   */
  // line 243 "../../../../src/Umple_CodeMethod.ump"
   public void removeKeyword(String keyword){
    if(keyword==null || keyword=="") return;
    for (String language : codes.keySet()) {
    	codes.put(language, codes.get(language).replace(keyword,"")) ;
    }
  }


  /**
   * @author Vahdat
   */
  // line 253 "../../../../src/Umple_CodeMethod.ump"
   public void addKeyword(String keyword){
    if(keyword==null || keyword=="") return;
//    if (codes.isEmpty()) {
//    	setCode(keyword);
//    	return;
//    }
    for (String language : codes.keySet()) {
    	codes.put(language, codes.get(language)+keyword) ;
    }
  }


  /**
   * @author Vahdat
   * This function searches for a specific keyword in all langauges in the code blocks.
   */
  // line 267 "../../../../src/Umple_CodeMethod.ump"
   public boolean hasKeyword(String keyword){
    if(keyword==null || keyword=="") return false;
    for (String language : codes.keySet()) {
        if (codes.get(language).contains(keyword)) return true;
      }
    return false;
  }

  // line 276 "../../../../src/Umple_CodeMethod.ump"
   public  CodeBlock(String add){
    this();
    codes.put("",add);
  }

  // line 281 "../../../../src/Umple_CodeMethod.ump"
   public  CodeBlock(String lang, String add){
    this();
    codes.put(lang,add);
  }

  // line 286 "../../../../src/Umple_CodeMethod.ump"
   public void setCode(String add){
    if(add!=null)
      codes.put("",add);
    else
      codes.put("","");
  }

  // line 293 "../../../../src/Umple_CodeMethod.ump"
   public void setCode(String lang, String add){
    if(add!=null)
      codes.put(lang,add);
    else
      codes.put(lang,"");
  }

  // line 300 "../../../../src/Umple_CodeMethod.ump"
   public String getCode(){
    return !codes.containsKey(languageUsed) ? "".equals(languageUsed) ? null : codes.get("") : codes.get(languageUsed);
  }

  // line 304 "../../../../src/Umple_CodeMethod.ump"
   public String getCode(String lang){
    return codes.containsKey(lang)? codes.get(lang) : "";
  }

  // line 309 "../../../../src/Umple_CodeMethod.ump"
   public boolean hasCode(String lang){
    return codes.containsKey(lang)? true : false;
  }


  /**
   * Will return true if any language has been associated with this code block
   */
  // line 315 "../../../../src/Umple_CodeMethod.ump"
   public boolean hasAnAssociatedLanguage(){
    for (String codeLang : codes.keySet())
    {
      if (codeLang != "")
      {
        return true;
      }
    }
    return false;
  }

  // line 326 "../../../../src/Umple_CodeMethod.ump"
   public String toString(){
    String out = "";
    for(String next:codes.values())
    {
      out += next;
    }
    return out;
  }

  // line 53 "../../../../src/Aspect_refactored.ump"
   public ArrayList<String> getCodeWithLabels(String codesKey){
    ArrayList <String> codeLabels = new ArrayList<String>();
      String codeToLockAt = getCode(codesKey);
      ArrayList<String> codeWithLabels = new ArrayList<String>();
      Pattern labelPatternToMatch = Pattern.compile("(\\S+):");
      Matcher matcher = labelPatternToMatch.matcher(codeToLockAt);
      int lastMatchedIndex=0;
      while (matcher.find()) {
        String codeBeforeLabel = codeToLockAt.substring(lastMatchedIndex, matcher.start());
        if(!codeBeforeLabel.equals(""))
          codeWithLabels.add(codeBeforeLabel);
        codeWithLabels.add(matcher.group()); //add the label itself to the source code.
        codeLabels.add(matcher.group().replaceFirst(":","")); // remove colon and add it the list of labels 
        lastMatchedIndex = matcher.end();
      }
      // This for last label, to add the code after last matched label 
      String codeAfterLastLabel =codeToLockAt.substring(lastMatchedIndex); 
      codeWithLabels.add(codeAfterLastLabel);
      return codeWithLabels;
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 538 "../../../../src/Umple.ump"
  public static String languageUsed = "" ;

  
}