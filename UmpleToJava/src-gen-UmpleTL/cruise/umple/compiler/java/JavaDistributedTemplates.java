/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.java;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import cruise.umple.parser.Position;
import java.util.regex.Pattern;

// line 4 "../../../../../UmpleTLTemplates/JavaDistributedTemplates.ump"
public class JavaDistributedTemplates
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "";
  public static final String TEXT_1 = NL + NL + "  public  String remoteUrl;" + NL + "  public  String objectId;" + NL + "  public  String remotePort; ";
  public static final String TEXT_2 = NL + "  private static ";
  public static final String TEXT_3 = " umplenewInstance()" + NL + "  {" + NL + "    return new ";
  public static final String TEXT_4 = "((UmpleRuntime.UmpleNode)null);" + NL + "  }   " + NL + NL + "  protected ";
  public static final String TEXT_5 = " (UmpleRuntime.UmpleNode node)" + NL + "  {";
  public static final String TEXT_6 = NL + "    super(node);";
  public static final String TEXT_7 = NL + "  }" + NL + NL + "  public void setRealObject(";
  public static final String TEXT_8 = " aObject)" + NL + "  {";
  public static final String TEXT_9 = NL + "    super.setRealObject(aObject);";
  public static final String TEXT_10 = NL + "    realObject=aObject;" + NL + "  }" + NL + "  void afterUnmarshal(Unmarshaller u, Object parent)" + NL + "  {" + NL + "    initializeConnection();" + NL + "  }" + NL + "  private void initializeConnection()" + NL + "  {" + NL + "    if(objectId.contains(";
  public static final String TEXT_11 = ".class.getName()))" + NL + "    {  " + NL + "      boolean success = false;" + NL + "      while (!success) {        " + NL + "        try " + NL + "        {" + NL + "          URL url = new URL(remoteUrl+\":\"+remotePort+\"/";
  public static final String TEXT_12 = "\"+objectId+\"?wsdl\");" + NL + "          QName qname = new QName(\"http://";
  public static final String TEXT_13 = "/\",\"";
  public static final String TEXT_14 = "Service\");" + NL + "          Service service = Service.create(url, qname);" + NL + "          setRealObject(service.getPort(";
  public static final String TEXT_15 = ".class));" + NL + "          success = true;" + NL + "        } " + NL + "        catch (Exception e) " + NL + "        {" + NL + "          System.err.println(\"Client exception: \" + e.toString());" + NL + "          e.printStackTrace();" + NL + "          try { Thread.sleep(1000); } catch (InterruptedException interruptedException) {};" + NL + "        }" + NL + "      }" + NL + "    }" + NL + "  }" + NL + " ";
  public static final String TEXT_16 = "";
  public static final String TEXT_17 = NL + "  protected  ";
  public static final String TEXT_18 = " remoteObject;";
  public static final String TEXT_19 = "  " + NL + "  public void setRemoteObject(";
  public static final String TEXT_20 = " aRemoteObject)" + NL + "  {" + NL + "    remoteObject=aRemoteObject;" + NL + "  }" + NL + "  public ";
  public static final String TEXT_21 = " getRemoteObject()" + NL + "  {" + NL + "    return (";
  public static final String TEXT_22 = ")remoteObject;" + NL + "  }" + NL + "  private void readObject(java.io.ObjectInputStream in) throws Exception" + NL + "  {" + NL + "    try" + NL + "    {" + NL + "      in.defaultReadObject();" + NL + "      realObject=(";
  public static final String TEXT_23 = ")remoteObject;" + NL + "    }" + NL + "    catch(Exception e)" + NL + "    {" + NL + "      throw e;" + NL + "    }" + NL + "    " + NL + "  }" + NL + " ";
  public static final String TEXT_24 = NL + "  protected ";
  public static final String TEXT_25 = "()" + NL + "  {" + NL + "  }" + NL + "  public ";
  public static final String TEXT_26 = "(String url,String port,String objectId)" + NL + "  {" + NL + "    Endpoint.publish(url+\":\"+port+\"/";
  public static final String TEXT_27 = "\"+objectId,this);" + NL + "  }" + NL + NL + " ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JavaDistributedTemplates()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 13 "../../../../../UmpleTLTemplates/JavaDistributedTemplates.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 20 "../../../../../UmpleTLTemplates/JavaDistributedTemplates.ump"
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

  public StringBuilder _getproxyReadObjectCode(Integer numSpaces, StringBuilder sb, String remoteName, String packageName, String interfaceName, UmpleClass uClass){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    if (uClass.getExtendsClass() == null||(uClass.getExtendsClass() != null && ! uClass.getExtendsClass().getIsDistributed()))
    {
    
    realSb.append(TEXT_1);
    }
    realSb.append(TEXT_2);
    realSb.append(remoteName);
    realSb.append(TEXT_3);
    realSb.append(remoteName);
    realSb.append(TEXT_4);
    realSb.append(remoteName);
    realSb.append(TEXT_5);
    
    if ((uClass.getExtendsClass() != null)&&(uClass.getExtendsClass().getIsDistributed()))
    {
  
    realSb.append(TEXT_6);
    
    }
    else if ((uClass.getExtendsClass() != null)&& !(uClass.getExtendsClass().getIsDistributed()))
    {
    appendln(realSb,"super();");
    }
    
    realSb.append(TEXT_7);
    realSb.append(interfaceName);
    realSb.append(TEXT_8);
    
    if (uClass.getExtendsClass() != null && uClass.getExtendsClass().getIsDistributed())
    {
    
    realSb.append(TEXT_9);
    
    }
    
    realSb.append(TEXT_10);
    realSb.append(uClass.getName());
    realSb.append(TEXT_11);
    realSb.append(remoteName);
    realSb.append(TEXT_12);
    realSb.append(packageName);
    realSb.append(TEXT_13);
    realSb.append(remoteName);
    realSb.append(TEXT_14);
    realSb.append(interfaceName);
    realSb.append(TEXT_15);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getproxyReadObjectCode(String remoteName, String packageName, String interfaceName, UmpleClass uClass){
        StringBuilder sb = new StringBuilder();
    return this._getproxyReadObjectCode(0,sb,remoteName,packageName,interfaceName,uClass).toString(); 
  }

  public StringBuilder _getproxyReadObjectCodeRMI(Integer numSpaces, StringBuilder sb, String remoteName, String packageName, String interfaceName, UmpleClass uClass){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_16);
    if (uClass.getExtendsClass() == null||(uClass.getExtendsClass() != null && ! uClass.getExtendsClass().getIsDistributed()))
    {
    
    realSb.append(TEXT_17);
    realSb.append(interfaceName);
    realSb.append(TEXT_18);
    }
    realSb.append(TEXT_19);
    realSb.append(interfaceName);
    realSb.append(TEXT_20);
    realSb.append(interfaceName);
    realSb.append(TEXT_21);
    realSb.append(interfaceName);
    realSb.append(TEXT_22);
    realSb.append(interfaceName);
    realSb.append(TEXT_23);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getproxyReadObjectCodeRMI(String remoteName, String packageName, String interfaceName, UmpleClass uClass){
        StringBuilder sb = new StringBuilder();
    return this._getproxyReadObjectCodeRMI(0,sb,remoteName,packageName,interfaceName,uClass).toString(); 
  }

  public StringBuilder _getremoteSingletonCode(Integer numSpaces, StringBuilder sb, String remoteName, String packageName, String interfaceName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_24);
    realSb.append(remoteName);
    realSb.append(TEXT_25);
    realSb.append(remoteName);
    realSb.append(TEXT_26);
    realSb.append(remoteName);
    realSb.append(TEXT_27);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getremoteSingletonCode(String remoteName, String packageName, String interfaceName){
        StringBuilder sb = new StringBuilder();
    return this._getremoteSingletonCode(0,sb,remoteName,packageName,interfaceName).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}