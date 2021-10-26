/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.sql;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import java.util.regex.Pattern;

// line 8 "../../../../../UmpleTLTemplates/sqlInterfaceGenerator.ump"
public class SqlInterfaceGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "-- PLEASE DO NOT EDIT THIS CODE" + NL + "-- This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!";
  public static final String TEXT_1 = "";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SqlInterfaceGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 18 "../../../../../UmpleTLTemplates/sqlInterfaceGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 25 "../../../../../UmpleTLTemplates/sqlInterfaceGenerator.ump"
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
    
    /*sqlInterfaceGenerator*/
    /*UmpleNotice*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
// Interfaces don't really make sense with Sql.
// A possible solution around this, is to make 
// every class that uses said interface X, also 
// generate the attributes/associations for interface X.
// This file should probably ignored.
// We should also prevent SqlGenerator from
// trying to create an interface.



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