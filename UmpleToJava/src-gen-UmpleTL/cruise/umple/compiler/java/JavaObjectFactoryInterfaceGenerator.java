/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.java;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import cruise.umple.parser.Position;
import java.util.regex.Pattern;

// line 8 "../../../../../UmpleTLTemplates/JavaObjectFactoryInterfaceGenerator.ump"
public class JavaObjectFactoryInterfaceGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "/*PLEASE DO NOT EDIT THIS CODE*/" + NL + "/*This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!*/";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = NL + "package ";
  public static final String TEXT_3 = ";";
  public static final String TEXT_4 = NL + "import ";
  public static final String TEXT_5 = ";";
  public static final String TEXT_6 = NL + "  @WebService" + NL + "  @SOAPBinding(style = Style.RPC)";
  public static final String TEXT_7 = NL + NL + "public interface IUmpleRuntime extends Remote" + NL + "{";
  public static final String TEXT_8 = NL + "  @WebMethod" + NL + "  public void stopNode();";
  public static final String TEXT_9 = NL + "  public void stopNode() throws RemoteException;";
  public static final String TEXT_10 = NL + "  ";
  public static final String TEXT_11 = "";
  public static final String TEXT_12 = NL + "  ";
  public static final String TEXT_13 = NL + "  {" + NL + "    return new";
  public static final String TEXT_14 = "(";
  public static final String TEXT_15 = "getComponent(\"";
  public static final String TEXT_16 = "\"),proxy);" + NL + "  }  ";
  public static final String TEXT_17 = NL + "  {" + NL + "    while(true){" + NL + "      try" + NL + "      {" + NL + "        return remoteFactories.get(getNodeId(component)).create";
  public static final String TEXT_18 = "(";
  public static final String TEXT_19 = "proxy);" + NL + "      }" + NL + "      catch(Exception e) " + NL + "      {" + NL + "        e.printStackTrace();" + NL + "        try { Thread.sleep(1000); } catch (InterruptedException interruptedException) {};" + NL + "      }  " + NL + "    }" + NL + "  }";
  public static final String TEXT_20 = "throws RemoteException;";
  public static final String TEXT_21 = NL + "    {" + NL + "    ";
  public static final String TEXT_22 = "Impl object= ";
  public static final String TEXT_23 = "Impl.getInstance();";
  public static final String TEXT_24 = NL + "  {" + NL + "  ";
  public static final String TEXT_25 = "Impl object = new ";
  public static final String TEXT_26 = "Impl(";
  public static final String TEXT_27 = ");";
  public static final String TEXT_28 = NL + "    object.setSelf(proxy);" + NL + "    proxy.setRealObject(object);" + NL + "      try" + NL + "      { ";
  public static final String TEXT_29 = " " + NL + "        UnicastRemoteObject.exportObject(object,0);";
  public static final String TEXT_30 = NL + "        Endpoint.publish(nodes.get(getThisNodeId()).getUrl()+\":\"+String.valueOf(nodes.get(getThisNodeId()).getPort())+\"/hw\",object);";
  public static final String TEXT_31 = NL + "      } " + NL + "      catch (Exception e)" + NL + "      {" + NL + "        System.err.println(\"Server Exception: \" + e.toString());" + NL + "        try { Thread.sleep(1000); } catch (InterruptedException interruptedException) {};" + NL + "      }" + NL + NL + "  listOfObjects.add(object);" + NL + "  return object; " + NL + "  }";
  public static final String TEXT_32 = NL + "  {" + NL + NL + "      while(true){" + NL + "        try" + NL + "        {";
  public static final String TEXT_33 = "object.setRemoteObject(remoteFactories.get(getNodeId(component)).create";
  public static final String TEXT_34 = "(";
  public static final String TEXT_35 = "));" + NL + "          object.setRealObject(object.getRemoteObject());" + NL + "          break;";
  public static final String TEXT_36 = NL + "          ";
  public static final String TEXT_37 = " proxyObject = remoteFactories.get(getNodeId(component)).create";
  public static final String TEXT_38 = "(";
  public static final String TEXT_39 = ");" + NL + "          object.remoteUrl=proxyObject.remoteUrl;" + NL + "          object.remotePort=proxyObject.remotePort;" + NL + "          object.objectId=proxyObject.objectId;" + NL + "          object.setRealObject(proxyObject.realObject);" + NL + "          break;";
  public static final String TEXT_40 = NL + "        }" + NL + "        catch(Exception e) " + NL + "        {" + NL + "          e.printStackTrace();" + NL + "          try { Thread.sleep(1000); } catch (InterruptedException interruptedException) {};" + NL + "        }  " + NL + "      }" + NL + "      }" + NL;
  public static final String TEXT_41 = " " + NL + "        " + NL + "        ";
  public static final String TEXT_42 = "Remote remoteObject;" + NL + "        try{" + NL + "        remoteObject = (";
  public static final String TEXT_43 = "Remote)Class.forName(object.getClass().getName()+\"Remote\").getConstructor(object.getClass()).newInstance(object);" + NL + "        }" + NL + "        catch (Exception e)" + NL + "        {" + NL + "          System.err.println(\"Class not found \" + e.toString());" + NL + "          return;" + NL + "        }" + NL + "        listOfObjects.add(remoteObject);";
  public static final String TEXT_44 = NL + "    listOfObjects.add(object);";
  public static final String TEXT_45 = "";
  public static final String TEXT_46 = " " + NL + "    while(true)" + NL + "    {" + NL + "      try" + NL + "      {  " + NL + "        UnicastRemoteObject.exportObject(remoteObject,nodes.get(getThisNodeId()).getPort());" + NL + "        object.setRemoteObject(remoteObject);" + NL + "        break;" + NL + "      } " + NL + "      catch (Exception e)" + NL + "      {" + NL + "        System.err.println(\"Server Exception: \" + e.toString());" + NL + "        try { Thread.sleep(1000); } catch (InterruptedException interruptedException) {};" + NL + "      }" + NL + "    }" + NL + "    ";
  public static final String TEXT_47 = NL + "        object.remoteUrl=nodes.get(getThisNodeId()).getUrl();" + NL + "        object.remotePort=String.valueOf(nodes.get(getThisNodeId()).getPort());" + NL + "        object.objectId=object.getClass().getName()+String.valueOf(object.getHashCodeImpl());" + NL + "        object.setRealObject(object);" + NL + "        Endpoint e=Endpoint.create(object);" + NL + "        e.publish(object.remoteUrl+\":\"+object.remotePort+\"/\"+object.getClass().getSimpleName()+object.objectId);" + NL + "        listOfEndpoints.add(e);";
  public static final String TEXT_48 = "  " + NL + "    }" + NL + "    ";
  public static final String TEXT_49 = "throws RemoteException;";
  public static final String TEXT_50 = NL + "    {" + NL + "    ";
  public static final String TEXT_51 = " object= ";
  public static final String TEXT_52 = ".getInstance(UmpleRuntime.getComponent(\"local\"));";
  public static final String TEXT_53 = NL + "    {" + NL + "    ";
  public static final String TEXT_54 = " object= new ";
  public static final String TEXT_55 = "(";
  public static final String TEXT_56 = " UmpleRuntime.getComponent(\"local\"));";
  public static final String TEXT_57 = NL + "    return object;" + NL + "    }";
  public static final String TEXT_58 = NL + "    return object.getRemoteObject();" + NL + "    }";
  public static final String TEXT_59 = NL;
  public static final String TEXT_60 = NL + "      ";
  public static final String TEXT_61 = NL + "  ";
  public static final String TEXT_62 = NL;
  public static final String TEXT_63 = "";
  public static final String TEXT_64 = NL + "}" + NL + " ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JavaObjectFactoryInterfaceGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 19 "../../../../../UmpleTLTemplates/JavaObjectFactoryInterfaceGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 26 "../../../../../UmpleTLTemplates/JavaObjectFactoryInterfaceGenerator.ump"
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
    
    /*JavaObjectFactoryInterfaceGenerator*/
    /*UmpleNotice*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
  JavaGenerator gen = new JavaGenerator();
  gen.setModel(model);
  GeneratorHelper.generator = gen;
  Boolean isInterface=true;
  
  Set<String> packageSet = new HashSet<String>();
  packageSet.add("java.rmi.Remote");
  packageSet.add("java.rmi.RemoteException");
  if(model.getDistributeTechnology().equals("WS"))
  {
    packageSet.add("javax.jws.WebMethod");
    packageSet.add("javax.jws.WebService");
    packageSet.add("javax.jws.soap.SOAPBinding");
    packageSet.add("javax.jws.soap.SOAPBinding.Style");
  }
  packageSet.add("javax.jws.WebMethod");
  for(UmpleClass uClass: model.getUmpleClasses())
  { GeneratedClass gClass = uClass.getGeneratedClass();
    for (Depend depend : uClass.getDepends())
      {
        packageSet.add(depend.getName());
      }
      
      for (String anImport : gClass.getMultiLookup("import"))
      {
        packageSet.add(anImport);
      }    
    if (uClass.getIsDistributed())
    {
      String packageName="";
      if(!uClass.getPackageName().equals("")){
        packageName=uClass.getPackageName()+".";
        packageName+=uClass.getName();
        packageSet.add(packageName);
      }
    }
  }

  if (model.getDefaultNamespace()!=null){
    realSb.append(TEXT_2);
    realSb.append(model.getDefaultNamespace());
    realSb.append(TEXT_3);
    
  }
  for(String packageName: packageSet)
  {

    realSb.append(TEXT_4);
    realSb.append(packageName);
    realSb.append(TEXT_5);
    
  }
  if(model.getDistributeTechnology().equals("WS"))
  {
  
    realSb.append(TEXT_6);
    }

    realSb.append(TEXT_7);
    
    if(model.getDistributeTechnology().equals("WS"))
  {
  
    realSb.append(TEXT_8);
    
  }
  if(model.getDistributeTechnology().equals("RMI"))
  {
  
    realSb.append(TEXT_9);
    
  }
  
    realSb.append(TEXT_10);
    /*objectFactory_add_Declare_All*/
    
  for(UmpleClass uClass : model.getUmpleClasses())
  {
      if (uClass.getIsDistributed()){
      boolean reqSuperCode, reqCommonCode;
      AssociationVariable relatedAssociation;
      Association relatedAssoc;
      boolean isFake=false;
      GeneratedClass gClass = uClass.getGeneratedClass();
      boolean isOneToOne = false;
      Boolean hasBody=false;
      String arguments;
      String caller;
      String argumentscomma;
      String accessibility = "public I"+uClass.getName()+"Impl";
      String accessibilityCreate="public I"+uClass.getName()+"Impl";
      if(model.getDistributePattern()==2)
        accessibility = "public "+uClass.getName();
      if(model.getDistributePattern()==0)
        accessibility = "public void";  
      String webMethod="";
      if(model.getDistributeTechnology().equals("WS"))
        webMethod="@WebMethod"+NL;
      if(uClass.getDistributeTechnology().equals("WS"))
      {  
        if(model.getDistributePattern()==0) 
        {
          accessibilityCreate = "public "+uClass.getName();
        }         
      }

      for (AssociationVariable av : uClass.getAssociationVariables()) 
      {
        relatedAssociation = av.getRelatedAssociation();

        if (av.isOnlyOne() && relatedAssociation.isOnlyOne() && av.getIsNavigable() && relatedAssociation.getIsNavigable())
        {
          isOneToOne = true;
          break;
        }
      }
      caller=gClass.getLookup("constructorSignature_caller");
    
    /*objectFactory_add_DeclareDefault*/
    realSb.append(TEXT_11);
    
  arguments=gClass.getLookup("constructorSignature");
  argumentscomma="";
  if(!arguments.equals(""))
    argumentscomma+=", ";
  caller=gClass.getLookup("constructorSignature_caller");
  
    realSb.append(TEXT_12);
    /*objectFactory_add_methods*/
    
  if (model.getDistributePattern()==1){
    
    /*objectFactory_add_methods1*/
    
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}{3} proxy)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma,uClass.getName()});

  
    realSb.append(TEXT_13);
    realSb.append(uClass.getName());
    realSb.append(TEXT_14);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_15);
    realSb.append(uClass.getName());
    realSb.append(TEXT_16);
    
  }
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}UmpleRuntime.UmpleComponent component{3} proxy)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma, ", "+uClass.getName()});
  
    realSb.append(TEXT_17);
    realSb.append(uClass.getName());
    realSb.append(TEXT_18);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_19);
    
    }
  append(realSb,"\n  {0}{1} {2}({3}{4} proxy)",new Object[] {webMethod,accessibilityCreate , "create"+uClass.getName(), arguments,argumentscomma+uClass.getName()});
  if(isInterface==true){
  
    realSb.append(TEXT_20);
    
  }
  else{
    if(uClass.getIsSingleton()){
    
    realSb.append(TEXT_21);
    realSb.append(uClass.getName());
    realSb.append(TEXT_22);
    realSb.append(uClass.getName());
    realSb.append(TEXT_23);
    
    }
   else
   { 

    realSb.append(TEXT_24);
    realSb.append(uClass.getName());
    realSb.append(TEXT_25);
    realSb.append(uClass.getName());
    realSb.append(TEXT_26);
    realSb.append(caller);
    realSb.append(TEXT_27);
    }
    realSb.append(TEXT_28);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_29);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_30);
    }
    realSb.append(TEXT_31);
    
    }
    
  }
  else{
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}UmpleRuntime.UmpleComponent component,{3} object)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma,uClass.getName()});
  
    realSb.append(TEXT_32);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_33);
    realSb.append(uClass.getName());
    realSb.append(TEXT_34);
    realSb.append(caller);
    realSb.append(TEXT_35);
    } 
          else
          {
          
    realSb.append(TEXT_36);
    realSb.append(uClass.getName());
    realSb.append(TEXT_37);
    realSb.append(uClass.getName());
    realSb.append(TEXT_38);
    realSb.append(caller);
    realSb.append(TEXT_39);
    }
          
    realSb.append(TEXT_40);
        append(realSb,"\n  {0} {1}({2} object){",new Object[] {accessibility, "new"+uClass.getName(),uClass.getName()});

    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_41);
    realSb.append(uClass.getName());
    realSb.append(TEXT_42);
    realSb.append(uClass.getName());
    realSb.append(TEXT_43);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_44);
    }
    realSb.append(TEXT_45);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_46);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_47);
    }
    realSb.append(TEXT_48);
    
    }
  if(isInterface==true){
  append(realSb,"\n  {0}{1} {2}({3})",new Object[] {webMethod,accessibilityCreate, "create"+uClass.getName(), arguments});
  
    realSb.append(TEXT_49);
    
  }
  else{
    append(realSb,"\n  {0}synchronized {1} {2}({3})",new Object[] {webMethod,accessibilityCreate, "create"+uClass.getName(), arguments});
    if(uClass.getIsSingleton()){
    
    realSb.append(TEXT_50);
    realSb.append(uClass.getName());
    realSb.append(TEXT_51);
    realSb.append(uClass.getName());
    realSb.append(TEXT_52);
    
    }
    else
    { 
  
    realSb.append(TEXT_53);
    realSb.append(uClass.getName());
    realSb.append(TEXT_54);
    realSb.append(uClass.getName());
    realSb.append(TEXT_55);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_56);
    }
    if(uClass.getDistributeTechnology().equals("WS"))
    {
    
    realSb.append(TEXT_57);
    
    }
    else
    {
    
    realSb.append(TEXT_58);
    
    }
  }
  }  
    
    realSb.append(TEXT_59);
    
      if (isOneToOne)
      {
      
    realSb.append(TEXT_60);
    /*objectFactory_add_DeclareOneToOne*/
    
  String signature = gClass.getLookup("constructorSignature_mandatory");
  hasBody = false;
  arguments=gen.translate("constructorMandatory",uClass);
  argumentscomma="";
  if(!arguments.equals(""))
    argumentscomma+=", ";
  caller=gClass.getLookup("constructorSignature_caller");
  
    realSb.append(TEXT_61);
    /*objectFactory_add_methods*/
    
  if (model.getDistributePattern()==1){
    
    /*objectFactory_add_methods1*/
    
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}{3} proxy)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma,uClass.getName()});

  
    realSb.append(TEXT_13);
    realSb.append(uClass.getName());
    realSb.append(TEXT_14);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_15);
    realSb.append(uClass.getName());
    realSb.append(TEXT_16);
    
  }
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}UmpleRuntime.UmpleComponent component{3} proxy)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma, ", "+uClass.getName()});
  
    realSb.append(TEXT_17);
    realSb.append(uClass.getName());
    realSb.append(TEXT_18);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_19);
    
    }
  append(realSb,"\n  {0}{1} {2}({3}{4} proxy)",new Object[] {webMethod,accessibilityCreate , "create"+uClass.getName(), arguments,argumentscomma+uClass.getName()});
  if(isInterface==true){
  
    realSb.append(TEXT_20);
    
  }
  else{
    if(uClass.getIsSingleton()){
    
    realSb.append(TEXT_21);
    realSb.append(uClass.getName());
    realSb.append(TEXT_22);
    realSb.append(uClass.getName());
    realSb.append(TEXT_23);
    
    }
   else
   { 

    realSb.append(TEXT_24);
    realSb.append(uClass.getName());
    realSb.append(TEXT_25);
    realSb.append(uClass.getName());
    realSb.append(TEXT_26);
    realSb.append(caller);
    realSb.append(TEXT_27);
    }
    realSb.append(TEXT_28);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_29);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_30);
    }
    realSb.append(TEXT_31);
    
    }
    
  }
  else{
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}UmpleRuntime.UmpleComponent component,{3} object)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma,uClass.getName()});
  
    realSb.append(TEXT_32);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_33);
    realSb.append(uClass.getName());
    realSb.append(TEXT_34);
    realSb.append(caller);
    realSb.append(TEXT_35);
    } 
          else
          {
          
    realSb.append(TEXT_36);
    realSb.append(uClass.getName());
    realSb.append(TEXT_37);
    realSb.append(uClass.getName());
    realSb.append(TEXT_38);
    realSb.append(caller);
    realSb.append(TEXT_39);
    }
          
    realSb.append(TEXT_40);
        append(realSb,"\n  {0} {1}({2} object){",new Object[] {accessibility, "new"+uClass.getName(),uClass.getName()});

    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_41);
    realSb.append(uClass.getName());
    realSb.append(TEXT_42);
    realSb.append(uClass.getName());
    realSb.append(TEXT_43);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_44);
    }
    realSb.append(TEXT_45);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_46);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_47);
    }
    realSb.append(TEXT_48);
    
    }
  if(isInterface==true){
  append(realSb,"\n  {0}{1} {2}({3})",new Object[] {webMethod,accessibilityCreate, "create"+uClass.getName(), arguments});
  
    realSb.append(TEXT_49);
    
  }
  else{
    append(realSb,"\n  {0}synchronized {1} {2}({3})",new Object[] {webMethod,accessibilityCreate, "create"+uClass.getName(), arguments});
    if(uClass.getIsSingleton()){
    
    realSb.append(TEXT_50);
    realSb.append(uClass.getName());
    realSb.append(TEXT_51);
    realSb.append(uClass.getName());
    realSb.append(TEXT_52);
    
    }
    else
    { 
  
    realSb.append(TEXT_53);
    realSb.append(uClass.getName());
    realSb.append(TEXT_54);
    realSb.append(uClass.getName());
    realSb.append(TEXT_55);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_56);
    }
    if(uClass.getDistributeTechnology().equals("WS"))
    {
    
    realSb.append(TEXT_57);
    
    }
    else
    {
    
    realSb.append(TEXT_58);
    
    }
  }
  }  
    
    realSb.append(TEXT_62);
    realSb.append(TEXT_63);
    
      }
      if (uClass.hasMethods()&&false)
      {
        for (Method aMethod : uClass.getMethods()) 
        {
          if(!aMethod.getExistsInLanguage("Java"))
            continue;
          String methodName = aMethod.getName();
          String methodType = aMethod.getType();
          /*
          user defined constructors
          */
          if(("".equals(methodType))&&(uClass.getName().equals(methodName))&&!aMethod.getModifier().equals("private"))
          {
            StringBuilder parameters = new StringBuilder();
            StringBuilder parametersWithoutTypes = new StringBuilder();
            arguments="";
            
            caller="";
            String paramName="";
            String paramType="";
            String aSingleParameter="";
            String isList="";
            String finalParams = "";        
            String finalParamsWithoutTypes = "";
            if (aMethod.hasMethodParameters())
            { 
              argumentscomma=", ";
              for (MethodParameter aMethodParam : aMethod.getMethodParameters()) 
              {
                paramName = aMethodParam.getName();
                paramType = aMethodParam.getType();
                isList = aMethodParam.getIsList() ? " [] " : " ";
                aSingleParameter = paramType + isList + paramName;
                parameters.append(aSingleParameter + ", ");
                parametersWithoutTypes.append(aMethodParam.getName() + ", ");
              }
              
              arguments = parameters.toString().substring(0, parameters.toString().length()-2);
              caller = parametersWithoutTypes.toString().substring(0, parametersWithoutTypes.toString().length()-2);
            }
            else{
              argumentscomma=""; 
            }
            
    /*objectFactory_add_methods*/
    
  if (model.getDistributePattern()==1){
    
    /*objectFactory_add_methods1*/
    
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}{3} proxy)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma,uClass.getName()});

  
    realSb.append(TEXT_13);
    realSb.append(uClass.getName());
    realSb.append(TEXT_14);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_15);
    realSb.append(uClass.getName());
    realSb.append(TEXT_16);
    
  }
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}UmpleRuntime.UmpleComponent component{3} proxy)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma, ", "+uClass.getName()});
  
    realSb.append(TEXT_17);
    realSb.append(uClass.getName());
    realSb.append(TEXT_18);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_19);
    
    }
  append(realSb,"\n  {0}{1} {2}({3}{4} proxy)",new Object[] {webMethod,accessibilityCreate , "create"+uClass.getName(), arguments,argumentscomma+uClass.getName()});
  if(isInterface==true){
  
    realSb.append(TEXT_20);
    
  }
  else{
    if(uClass.getIsSingleton()){
    
    realSb.append(TEXT_21);
    realSb.append(uClass.getName());
    realSb.append(TEXT_22);
    realSb.append(uClass.getName());
    realSb.append(TEXT_23);
    
    }
   else
   { 

    realSb.append(TEXT_24);
    realSb.append(uClass.getName());
    realSb.append(TEXT_25);
    realSb.append(uClass.getName());
    realSb.append(TEXT_26);
    realSb.append(caller);
    realSb.append(TEXT_27);
    }
    realSb.append(TEXT_28);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_29);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_30);
    }
    realSb.append(TEXT_31);
    
    }
    
  }
  else{
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}UmpleRuntime.UmpleComponent component,{3} object)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma,uClass.getName()});
  
    realSb.append(TEXT_32);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_33);
    realSb.append(uClass.getName());
    realSb.append(TEXT_34);
    realSb.append(caller);
    realSb.append(TEXT_35);
    } 
          else
          {
          
    realSb.append(TEXT_36);
    realSb.append(uClass.getName());
    realSb.append(TEXT_37);
    realSb.append(uClass.getName());
    realSb.append(TEXT_38);
    realSb.append(caller);
    realSb.append(TEXT_39);
    }
          
    realSb.append(TEXT_40);
        append(realSb,"\n  {0} {1}({2} object){",new Object[] {accessibility, "new"+uClass.getName(),uClass.getName()});

    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_41);
    realSb.append(uClass.getName());
    realSb.append(TEXT_42);
    realSb.append(uClass.getName());
    realSb.append(TEXT_43);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_44);
    }
    realSb.append(TEXT_45);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_46);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_47);
    }
    realSb.append(TEXT_48);
    
    }
  if(isInterface==true){
  append(realSb,"\n  {0}{1} {2}({3})",new Object[] {webMethod,accessibilityCreate, "create"+uClass.getName(), arguments});
  
    realSb.append(TEXT_49);
    
  }
  else{
    append(realSb,"\n  {0}synchronized {1} {2}({3})",new Object[] {webMethod,accessibilityCreate, "create"+uClass.getName(), arguments});
    if(uClass.getIsSingleton()){
    
    realSb.append(TEXT_50);
    realSb.append(uClass.getName());
    realSb.append(TEXT_51);
    realSb.append(uClass.getName());
    realSb.append(TEXT_52);
    
    }
    else
    { 
  
    realSb.append(TEXT_53);
    realSb.append(uClass.getName());
    realSb.append(TEXT_54);
    realSb.append(uClass.getName());
    realSb.append(TEXT_55);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_56);
    }
    if(uClass.getDistributeTechnology().equals("WS"))
    {
    
    realSb.append(TEXT_57);
    
    }
    else
    {
    
    realSb.append(TEXT_58);
    
    }
  }
  }  
    
    
            
          }
        }
      }            
    }    
  }

    realSb.append(TEXT_64);

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