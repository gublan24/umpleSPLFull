/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.ruby;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import java.util.regex.Pattern;

// line 9 "../../../../../UmpleTLTemplates/rubyInterfaceGenerator.ump"
public class RubyInterfaceGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "# PLEASE DO NOT EDIT THIS CODE" + NL + "# This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!" + NL + "# NOTE: Ruby generator is experimental and is missing some features available in" + NL + "# in other Umple generated languages like Java or PHP";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = NL + NL;
  public static final String TEXT_3 = NL + NL + "class ";
  public static final String TEXT_4 = NL + "  ";
  public static final String TEXT_5 = NL + "end";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RubyInterfaceGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 19 "../../../../../UmpleTLTemplates/rubyInterfaceGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 26 "../../../../../UmpleTLTemplates/rubyInterfaceGenerator.ump"
   private void append(StringBuilder buffer, String input, Object... variables){
    buffer.append(StringFormatter.format(input,variables));
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _getCode(Integer numSpaces, StringBuilder sb, UmpleModel model, UmpleElement uElement){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    /*rubyInterfaceGenerator*/
    /*UmpleNotice*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
  UmpleInterface uInterface = (UmpleInterface) uElement;
  // GeneratedInterface gInterface = uInterface.getGeneratedInterface();
  RubyGenerator gen = new RubyGenerator();
  gen.setModel(model);
  
  String extraCode = "";
  if (uInterface.getExtraCode() != null)
  {
    extraCode = uInterface.getExtraCode();
  }


    realSb.append(TEXT_2);
    realSb.append(gen.translate("packageDefinition",uInterface));
    /*import_packages_interface*/
    
  for (Depend depend : uInterface.getDepends())
  {
    appendln(realSb, "");
    append(realSb, "require '{0}'",depend.getName());
  }
  
  // TODO: No test failed from removing this
  // for (String anImport : gInterface.getMultiLookup("import"))
  // {
  //  appendln(realSb, "");
  //  append(realSb, "require '{0}'",anImport);
  // }

    realSb.append(TEXT_3);
    realSb.append(uInterface.getName());
    realSb.append(TEXT_4);
    realSb.append(extraCode);
    realSb.append(TEXT_5);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getCode(UmpleModel model, UmpleElement uElement){
        StringBuilder sb = new StringBuilder();
    return this._getCode(0,sb,model,uElement).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}