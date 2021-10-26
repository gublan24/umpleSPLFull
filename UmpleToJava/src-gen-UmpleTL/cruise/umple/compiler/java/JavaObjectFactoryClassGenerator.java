/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.java;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import cruise.umple.parser.Position;
import java.util.regex.Pattern;

// line 10 "../../../../../UmpleTLTemplates/JavaObjectFactoryClassGenerator.ump"
public class JavaObjectFactoryClassGenerator implements ILang
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
  public static final String TEXT_6 = NL + "@WebService(endpointInterface = \"";
  public static final String TEXT_7 = "IUmpleRuntime\")";
  public static final String TEXT_8 = NL + "public class UmpleRuntime implements IUmpleRuntime" + NL + "{ " + NL + "  private static Boolean isAlive = true;" + NL + "  static int thisNodeId=-1;" + NL + "  private int numberOfNodes=0;" + NL + "  private static String fileAddress=\"\";" + NL + "  static HashMap<Integer, UmpleNode> nodes=new HashMap<Integer, UmpleNode>();" + NL + "  static HashMap <String, UmpleComponent> components= new HashMap<String, UmpleComponent>();" + NL + "  public static void setFileAddress(String address)" + NL + "  {" + NL + "    fileAddress=address;" + NL + "  }" + NL + "  public static int getThisNodeId()" + NL + "  {" + NL + "    return thisNodeId;" + NL + "  }" + NL + "    private static void setThisNodeId(int id)" + NL + "  {" + NL + "    thisNodeId=id;" + NL + "  }  " + NL + NL + NL + "  private static void readPropertiesFile()" + NL + "  {" + NL + "      String location=\"configuration.txt\";" + NL + "      Properties prop = new Properties();" + NL + "      InputStream input = null;" + NL + NL + "    try {" + NL + NL + "      input = new FileInputStream(\"node.properties\");" + NL + "      prop.load(input);" + NL + "      if(getThisNodeId()<0)" + NL + "        setThisNodeId(Integer.parseInt(prop.getProperty(\"name\")));" + NL + "      location=prop.getProperty(\"location\");" + NL + "      setFileAddress(location);" + NL + "    } catch (IOException e)" + NL + "    {" + NL + "      e.printStackTrace();" + NL + "      if(getThisNodeId()<0)" + NL + "        setThisNodeId(0); " + NL + "      setFileAddress(location);   " + NL + "    } " + NL + "    finally {" + NL + "      if (input != null) {" + NL + "        try {" + NL + "          input.close();" + NL + "        } catch (IOException e) {" + NL + "          e.printStackTrace();" + NL + "        }" + NL + "      }" + NL + "    }" + NL + "  }" + NL + "  public static UmpleComponent getComponent(String runtimeComponentName)" + NL + "  {" + NL + "    getInstance();" + NL + "    UmpleComponent aComponent=components.get(runtimeComponentName.toLowerCase());" + NL + "    if (aComponent!=null)" + NL + "      return aComponent;" + NL + "    else" + NL + "      return components.get(\"local\");  " + NL + "  }" + NL + NL + "  public static void stopAll()" + NL + "  {" + NL + "    UmpleRuntime.getInstance().stopAllNodes();" + NL + "  }" + NL + "  public void stopAllNodes()" + NL + "  {" + NL + "    for(int node=0;node<numberOfNodes;node=node+1)" + NL + "    {" + NL + "      if(node!=getThisNodeId())" + NL + "      {" + NL + "        try" + NL + "        {" + NL + "          remoteFactories.get(node).stopNode();" + NL + "        }" + NL + "        catch(Exception e) {System.err.println(e.toString());}" + NL + "      } " + NL + "    }" + NL + "    stopNode(); " + NL + "  }" + NL + "// ******************************** Factory" + NL + "    public static UmpleRuntime theInstance = null;" + NL + "    List<IUmpleRuntime> remoteFactories;" + NL + NL + "    public List<Object> listOfObjects;";
  public static final String TEXT_9 = NL + "    public List<Endpoint> listOfEndpoints;" + NL + "    private Endpoint thisEndpoint;";
  public static final String TEXT_10 = NL + "    public static UmpleRuntime getInstance()" + NL + "    {" + NL + "      if(theInstance==null){" + NL + "        theInstance = new UmpleRuntime();" + NL + "        }" + NL + "      return theInstance;" + NL + "    }" + NL + "   " + NL + "    private UmpleRuntime()" + NL + "    { ";
  public static final String TEXT_11 = NL + "      listOfEndpoints=new ArrayList<Endpoint>();";
  public static final String TEXT_12 = NL + "      listOfObjects=new ArrayList<Object>();" + NL + "      remoteFactories= new ArrayList<IUmpleRuntime>();" + NL + "      initialize();" + NL + "    }" + NL + "    public int getNodeId(int umpleNodeId)" + NL + "    {" + NL + "      int nodeId=umpleNodeId;" + NL + "      if(nodeId>=numberOfNodes)" + NL + "        nodeId=numberOfNodes-1;" + NL + "      return nodeId;" + NL + "    }" + NL + "    public int getNodeId(UmpleComponent umpleComponent)" + NL + "    {" + NL + "      return umpleComponent.getNode().getId();" + NL + "    }" + NL + NL + "    private void readConfigFile()" + NL + "    {" + NL + "      String input=\"{id=0; port=1099; http://localhost {component1}}{id=1; port=1700; http://localhost {component2}}\";" + NL + "      try (BufferedReader br = new BufferedReader(new FileReader(fileAddress))) {" + NL + "        input=\"\";" + NL + "        String line;" + NL + "        while ((line = br.readLine()) != null) {" + NL + "           // Merging the lines" + NL + "          input+=line+\";\";" + NL + "        }" + NL + "      }" + NL + "      catch (IOException e)" + NL + "      {" + NL + "        e.printStackTrace();   " + NL + "      }" + NL + "      finally {" + NL + "        if (input != null)" + NL + "        {" + NL + "          int startIndex=input.indexOf(\"{\");" + NL + "          if(startIndex>=0)" + NL + "          //while(startIndex>=0)" + NL + "          { " + NL + "            Pattern pattern1 = Pattern.compile(\"([\\\\{|\\\\(])([^\\\\}\\\\)]+)([\\\\{|\\\\(])\");" + NL + "            Pattern pattern2 = Pattern.compile(\"([\\\\}|\\\\)])([^\\\\{\\\\(]+)([\\\\}|\\\\)])\");" + NL + "            Pattern pattern3 = Pattern.compile(\"([\\\\{|\\\\(])([^\\\\{\\\\(\\\\}\\\\)]+)([\\\\}|\\\\)])\");" + NL + "            Pattern patternURL = Pattern.compile(\"(url)(\\\\s*[=|:]\\\\s*)([^;\\\\s]*)(,|;|\\\\r\\\\n|\\\\t)\");" + NL + "            Pattern patternName = Pattern.compile(\"(id)(\\\\s*[=|:]\\\\s*)([^;\\\\s]*)(,|;|\\\\r\\\\n|\\\\t)\");" + NL + "            Pattern patternPort = Pattern.compile(\"(port)(\\\\s*[=|:]\\\\s*)([^;\\\\s]*)(,|;|\\\\r\\\\n|\\\\t)\"); " + NL + "            Pattern patternIp = Pattern.compile(\"(ip)(\\\\s*[=|:]\\\\s*)([^;\\\\s]*)(,|;|\\\\r\\\\n|\\\\t)\"); " + NL + "            Pattern patternComponent = Pattern.compile(\"(\\\\s*)([^;,\\\\s]*)(\\\\s*)([,|;|\\\\r\\\\n|\\\\t])\");                 " + NL + "            Matcher matcher1 = pattern1.matcher(input); " + NL + "            Matcher matcher2 = pattern2.matcher(input);" + NL + "            Matcher matcher3 = pattern3.matcher(input);" + NL + "            String url=\"\";" + NL + "            String ip=\"\";" + NL + "            String name=\"\";" + NL + "            int port=1111;" + NL + "            String part1=\"\";" + NL + "            String part2=\"\";" + NL + "            String part3=\"\";" + NL + "            String runtimeComponents=\"\";" + NL + "            String machine=\"\";" + NL + "            Boolean condition1=matcher1.find();" + NL + "            Boolean condition2=matcher2.find();" + NL + "            Boolean condition3=matcher3.find();" + NL + "            while (condition1||condition2||condition3) " + NL + "            { " + NL + "              url=\"http://localhost\";" + NL + "              ip=\"localhost\";" + NL + "              name=\"\";" + NL + "              port=1111;" + NL + "              part1=\"\";" + NL + "              part2=\"\";" + NL + "              part3=\"\";" + NL + "              runtimeComponents=\"\";" + NL + "              machine=\"\";" + NL + "              if(condition1)" + NL + "                part1=matcher1.group(2);" + NL + "              if(condition2)" + NL + "                part2=matcher2.group(2);" + NL + "              if(condition3)" + NL + "                part3=matcher3.group(2);" + NL + "              " + NL + "              if(condition1&&matcher3.end()>matcher1.end())" + NL + "              {" + NL + "                machine=part1.toLowerCase()+part2.toLowerCase();" + NL + "                runtimeComponents=part3.toLowerCase()+\";\";" + NL + "                condition1=matcher1.find();" + NL + "                condition2=matcher2.find();" + NL + "                condition3=matcher3.find();" + NL + "              }else" + NL + "              {" + NL + "                machine=part3.toLowerCase();" + NL + "                condition3=matcher3.find();" + NL + "              }" + NL + "              Matcher matcherURL = patternURL.matcher(machine);" + NL + "              if(matcherURL.find())" + NL + "                url=matcherURL.group(3);" + NL + NL + "              Matcher matcherName = patternName.matcher(machine);" + NL + "              if(matcherName.find())" + NL + "                name=matcherName.group(3);" + NL + NL + "              Matcher matcherIp = patternIp.matcher(machine);" + NL + "              if(matcherIp.find())" + NL + "                ip=matcherIp.group(3);" + NL + NL + "              Matcher matcherPort = patternPort.matcher(machine);" + NL + "              if(matcherPort.find())" + NL + "                port=Integer.parseInt(matcherPort.group(3));" + NL + "              UmpleNode aNode= new UmpleNode(Integer.parseInt(name));" + NL + "              Matcher matcherComponent = patternComponent.matcher(runtimeComponents);" + NL + "              while(matcherComponent.find())" + NL + "              { String component=matcherComponent.group(2);" + NL + "                UmpleComponent aComponent=new UmpleComponent(component,aNode);" + NL + "                components.put(component,aComponent);" + NL + "              }" + NL + "              if(aNode.getId()==getThisNodeId())" + NL + "              {" + NL + "                UmpleComponent aComponent=new UmpleComponent(\"local\",aNode);" + NL + "                components.put(\"local\",aComponent);" + NL + "              }" + NL + "              aNode.setPort(port);" + NL + "              aNode.setUrl(url);" + NL + "              aNode.setIp(ip);" + NL + "              nodes.put(aNode.getId(),aNode);" + NL + "            }" + NL + "          }      " + NL + "        }    " + NL + "      }" + NL + "    }";
  public static final String TEXT_13 = NL + "    Registry rmiRegistry;" + NL + "    public void initialize()" + NL + "    {    " + NL + NL + "      if(fileAddress.equals(\"\"))" + NL + "        readPropertiesFile();" + NL + "      readConfigFile();" + NL + "      numberOfNodes= nodes.size();" + NL + "      startRMI();" + NL + "      for(int node=0;node<numberOfNodes;node=node+1)" + NL + "      {" + NL + "        if(node==getThisNodeId())" + NL + "        {" + NL + "          remoteFactories.add(this);" + NL + "        }" + NL + "        else" + NL + "        {" + NL + "          System.out.println(\"connecting to node: \"+node);" + NL + "          Boolean success=false;" + NL + "          while(!success)" + NL + "          {" + NL + "            try " + NL + "            {" + NL + "              Registry registry = LocateRegistry.getRegistry(nodes.get(node).getIp(),nodes.get(node).getPort());" + NL + "              IUmpleRuntime stub = (IUmpleRuntime) registry.lookup(\"UmpleRuntime\"+String.valueOf(node));" + NL + "              remoteFactories.add(stub);" + NL + "              success=true;" + NL + "            } " + NL + "            catch (Exception e) " + NL + "            {" + NL + "              System.err.println(\"Client exception: \" + e.toString());" + NL + "              e.printStackTrace();" + NL + "              try { Thread.sleep(5000); } catch (InterruptedException interruptedException) {};" + NL + "            }" + NL + "          } " + NL + "        } " + NL + "      }" + NL + "    }" + NL + "    public void startRMI() " + NL + "    {" + NL + "      IUmpleRuntime stub;" + NL + "      try" + NL + "      {  " + NL + "        // Bind the remote object's stub in the registry" + NL + "        rmiRegistry= LocateRegistry.createRegistry(nodes.get(getThisNodeId()).getPort());" + NL + "        stub = (IUmpleRuntime) UnicastRemoteObject.exportObject(this, nodes.get(getThisNodeId()).getPort());" + NL + "        rmiRegistry.bind(\"UmpleRuntime\"+String.valueOf(getThisNodeId()), stub);" + NL + "        System.err.println(\"Server ready\");" + NL + "      } " + NL + "      catch (Exception e)" + NL + "      {" + NL + "        System.err.println(\"binding exception: \" + e.toString());" + NL + "      }" + NL + "    }" + NL + "    public void stopNode()" + NL + "    {" + NL + "      System.out.println(\"stopping node\");" + NL + "      try" + NL + "      {" + NL + "        stopRMI();" + NL + "      }" + NL + "      catch (Exception e)" + NL + "      {" + NL + "        System.err.println(\"Could not stop RMI:  \"+ e.toString());" + NL + "      }" + NL + "      isAlive=false;" + NL + "    }" + NL + "    public void stopRMI() throws Exception" + NL + "    {" + NL + "      for(Object object: listOfObjects)" + NL + "      {" + NL + "        try" + NL + "        {" + NL + "          UnicastRemoteObject.unexportObject((Remote)object, true);" + NL + "        }" + NL + "        catch(Exception e)" + NL + "        {" + NL + "          throw e;" + NL + "        }  " + NL + "      }" + NL + "      try" + NL + "      {" + NL + "        UnicastRemoteObject.unexportObject(this, true);" + NL + "      }" + NL + "      catch(Exception e)" + NL + "      {" + NL + "        throw e;" + NL + "      }" + NL + "    }";
  public static final String TEXT_14 = NL + "    public void initialize()" + NL + "    {    " + NL + "      if(fileAddress.equals(\"\"))" + NL + "        readPropertiesFile();" + NL + "      readConfigFile();" + NL + "      numberOfNodes= nodes.size();" + NL + "      thisEndpoint=Endpoint.create(this);" + NL + "      thisEndpoint.publish(nodes.get(getThisNodeId()).getUrl()+\":\"+String.valueOf(nodes.get(getThisNodeId()).getPort())+\"/UmpleRuntime\");" + NL + NL + "      for(int node=0;node<numberOfNodes;node=node+1)" + NL + "      {" + NL + "        if(node==getThisNodeId())" + NL + "        {" + NL + "          remoteFactories.add(this);" + NL + "        }" + NL + "        else" + NL + "        {" + NL + "          System.out.println(\"connecting to node: \"+node);" + NL + "          while(true)" + NL + "          {" + NL + "            try " + NL + "            {" + NL + "              URL url = new URL(nodes.get(node).getUrl()+\":\"+String.valueOf(nodes.get(node).getPort())+\"/UmpleRuntime?wsdl\");" + NL + "             " + NL + "              QName qname = new QName(\"";
  public static final String TEXT_15 = "\"," + NL + "                  \"UmpleRuntimeService\");" + NL + "              Service service = Service.create(url, qname);" + NL + "              IUmpleRuntime proxy = service.getPort(IUmpleRuntime.class);" + NL + "              remoteFactories.add(proxy);" + NL + "              break;" + NL + "            } " + NL + "            catch (Exception e) " + NL + "            {" + NL + "              System.err.println(\"Client exception: \" + e.toString());" + NL + "              e.printStackTrace();" + NL + "              try { Thread.sleep(5000); } catch (InterruptedException interruptedException) {};" + NL + "            }" + NL + "          } " + NL + "        } " + NL + "      }" + NL + "    }" + NL + "    public void stopNode()" + NL + "    {" + NL + "      System.out.println(\"stopping node\");" + NL + "      for(Endpoint e: listOfEndpoints)" + NL + "      {" + NL + "        e.stop();" + NL + "      }" + NL + "      thisEndpoint.stop();" + NL + "      isAlive=false;" + NL + "    }";
  public static final String TEXT_16 = NL + "    ";
  public static final String TEXT_17 = "";
  public static final String TEXT_18 = NL + "  ";
  public static final String TEXT_19 = NL + "  {" + NL + "    return new";
  public static final String TEXT_20 = "(";
  public static final String TEXT_21 = "getComponent(\"";
  public static final String TEXT_22 = "\"),proxy);" + NL + "  }  ";
  public static final String TEXT_23 = NL + "  {" + NL + "    while(true){" + NL + "      try" + NL + "      {" + NL + "        return remoteFactories.get(getNodeId(component)).create";
  public static final String TEXT_24 = "(";
  public static final String TEXT_25 = "proxy);" + NL + "      }" + NL + "      catch(Exception e) " + NL + "      {" + NL + "        e.printStackTrace();" + NL + "        try { Thread.sleep(1000); } catch (InterruptedException interruptedException) {};" + NL + "      }  " + NL + "    }" + NL + "  }";
  public static final String TEXT_26 = "throws RemoteException;";
  public static final String TEXT_27 = NL + "    {" + NL + "    ";
  public static final String TEXT_28 = "Impl object= ";
  public static final String TEXT_29 = "Impl.getInstance();";
  public static final String TEXT_30 = NL + "  {" + NL + "  ";
  public static final String TEXT_31 = "Impl object = new ";
  public static final String TEXT_32 = "Impl(";
  public static final String TEXT_33 = ");";
  public static final String TEXT_34 = NL + "    object.setSelf(proxy);" + NL + "    proxy.setRealObject(object);" + NL + "      try" + NL + "      { ";
  public static final String TEXT_35 = " " + NL + "        UnicastRemoteObject.exportObject(object,0);";
  public static final String TEXT_36 = NL + "        Endpoint.publish(nodes.get(getThisNodeId()).getUrl()+\":\"+String.valueOf(nodes.get(getThisNodeId()).getPort())+\"/hw\",object);";
  public static final String TEXT_37 = NL + "      } " + NL + "      catch (Exception e)" + NL + "      {" + NL + "        System.err.println(\"Server Exception: \" + e.toString());" + NL + "        try { Thread.sleep(1000); } catch (InterruptedException interruptedException) {};" + NL + "      }" + NL + NL + "  listOfObjects.add(object);" + NL + "  return object; " + NL + "  }";
  public static final String TEXT_38 = NL + "  {" + NL + NL + "      while(true){" + NL + "        try" + NL + "        {";
  public static final String TEXT_39 = "object.setRemoteObject(remoteFactories.get(getNodeId(component)).create";
  public static final String TEXT_40 = "(";
  public static final String TEXT_41 = "));" + NL + "          object.setRealObject(object.getRemoteObject());" + NL + "          break;";
  public static final String TEXT_42 = NL + "          ";
  public static final String TEXT_43 = " proxyObject = remoteFactories.get(getNodeId(component)).create";
  public static final String TEXT_44 = "(";
  public static final String TEXT_45 = ");" + NL + "          object.remoteUrl=proxyObject.remoteUrl;" + NL + "          object.remotePort=proxyObject.remotePort;" + NL + "          object.objectId=proxyObject.objectId;" + NL + "          object.setRealObject(proxyObject.realObject);" + NL + "          break;";
  public static final String TEXT_46 = NL + "        }" + NL + "        catch(Exception e) " + NL + "        {" + NL + "          e.printStackTrace();" + NL + "          try { Thread.sleep(1000); } catch (InterruptedException interruptedException) {};" + NL + "        }  " + NL + "      }" + NL + "      }" + NL;
  public static final String TEXT_47 = " " + NL + "        " + NL + "        ";
  public static final String TEXT_48 = "Remote remoteObject;" + NL + "        try{" + NL + "        remoteObject = (";
  public static final String TEXT_49 = "Remote)Class.forName(object.getClass().getName()+\"Remote\").getConstructor(object.getClass()).newInstance(object);" + NL + "        }" + NL + "        catch (Exception e)" + NL + "        {" + NL + "          System.err.println(\"Class not found \" + e.toString());" + NL + "          return;" + NL + "        }" + NL + "        listOfObjects.add(remoteObject);";
  public static final String TEXT_50 = NL + "    listOfObjects.add(object);";
  public static final String TEXT_51 = "";
  public static final String TEXT_52 = " " + NL + "    while(true)" + NL + "    {" + NL + "      try" + NL + "      {  " + NL + "        UnicastRemoteObject.exportObject(remoteObject,nodes.get(getThisNodeId()).getPort());" + NL + "        object.setRemoteObject(remoteObject);" + NL + "        break;" + NL + "      } " + NL + "      catch (Exception e)" + NL + "      {" + NL + "        System.err.println(\"Server Exception: \" + e.toString());" + NL + "        try { Thread.sleep(1000); } catch (InterruptedException interruptedException) {};" + NL + "      }" + NL + "    }" + NL + "    ";
  public static final String TEXT_53 = NL + "        object.remoteUrl=nodes.get(getThisNodeId()).getUrl();" + NL + "        object.remotePort=String.valueOf(nodes.get(getThisNodeId()).getPort());" + NL + "        object.objectId=object.getClass().getName()+String.valueOf(object.getHashCodeImpl());" + NL + "        object.setRealObject(object);" + NL + "        Endpoint e=Endpoint.create(object);" + NL + "        e.publish(object.remoteUrl+\":\"+object.remotePort+\"/\"+object.getClass().getSimpleName()+object.objectId);" + NL + "        listOfEndpoints.add(e);";
  public static final String TEXT_54 = "  " + NL + "    }" + NL + "    ";
  public static final String TEXT_55 = "throws RemoteException;";
  public static final String TEXT_56 = NL + "    {" + NL + "    ";
  public static final String TEXT_57 = " object= ";
  public static final String TEXT_58 = ".getInstance(UmpleRuntime.getComponent(\"local\"));";
  public static final String TEXT_59 = NL + "    {" + NL + "    ";
  public static final String TEXT_60 = " object= new ";
  public static final String TEXT_61 = "(";
  public static final String TEXT_62 = " UmpleRuntime.getComponent(\"local\"));";
  public static final String TEXT_63 = NL + "    return object;" + NL + "    }";
  public static final String TEXT_64 = NL + "    return object.getRemoteObject();" + NL + "    }";
  public static final String TEXT_65 = NL;
  public static final String TEXT_66 = NL + "      ";
  public static final String TEXT_67 = NL + "  ";
  public static final String TEXT_68 = NL;
  public static final String TEXT_69 = "";
  public static final String TEXT_70 = NL + "  public static void main (String [] args)" + NL + "  {" + NL + "    if (args.length>0){" + NL + "      setThisNodeId(Integer.parseInt(args[0]));" + NL + "      if (args.length>1)" + NL + "        UmpleRuntime.setFileAddress(args[1]);" + NL + "    }" + NL + "     UmpleRuntime.getInstance();" + NL + "    while(isAlive){" + NL + "      try { Thread.sleep(1000); } catch (InterruptedException interruptedException) {};" + NL + "    }" + NL + "  }" + NL + "    public class UmpleNode" + NL + "    {" + NL + "      //------------------------" + NL + "      // MEMBER VARIABLES" + NL + "      //------------------------" + NL + "      private int id;" + NL + "      private String ip=\"localhost\";" + NL + "      private String url=\"http://localhost\";" + NL + "      private int port=1098;" + NL + "      //------------------------" + NL + "      // CONSTRUCTOR" + NL + "      //------------------------" + NL + NL + "      public UmpleNode(int aId)" + NL + "      {" + NL + "        id= aId;" + NL + "      }" + NL + NL + "      //------------------------" + NL + "      // INTERFACE" + NL + "      //------------------------" + NL + "      public boolean setId(int aId)" + NL + "      {" + NL + "        boolean wasSet = false;" + NL + "        id = aId;" + NL + "        wasSet = true;" + NL + "        return wasSet;" + NL + "      }" + NL + NL + "      public boolean setIp(String aIp)" + NL + "      {" + NL + "        boolean wasSet = false;" + NL + "        ip = aIp;" + NL + "        wasSet = true;" + NL + "        return wasSet;" + NL + "      }" + NL + NL + "      public boolean setUrl(String aUrl)" + NL + "      {" + NL + "        boolean wasSet = false;" + NL + "        url = aUrl;" + NL + "        wasSet = true;" + NL + "        return wasSet;" + NL + "      }" + NL + NL + "      public boolean setPort(int aPort)" + NL + "      {" + NL + "        boolean wasSet = false;" + NL + "        port = aPort;" + NL + "        wasSet = true;" + NL + "        return wasSet;" + NL + "      }" + NL + "      public int getId()" + NL + "      {" + NL + "        return id;" + NL + "      }" + NL + "      public String getIp()" + NL + "      {" + NL + "        return ip;" + NL + "      }" + NL + NL + "      public String getUrl()" + NL + "      {" + NL + "        return url;" + NL + "      }" + NL + NL + "      public int getPort()" + NL + "      {" + NL + "        return port;" + NL + "      }" + NL + "      public String toString()" + NL + "      {" + NL + "        return super.toString() + \"[\"+\"id\" + \":\" + getId()+ \"]\";" + NL + "      }" + NL + "    }" + NL + NL + "    public class UmpleComponent" + NL + "    {" + NL + NL + "      //------------------------" + NL + "      // MEMBER VARIABLES" + NL + "      //------------------------" + NL + NL + "      //UmpleComponent Attributes" + NL + "      private int number=0;" + NL + "      private String name;" + NL + "      private UmpleNode node;" + NL + "      //------------------------" + NL + "      // CONSTRUCTOR" + NL + "      //------------------------" + NL + NL + "      public UmpleComponent(String aName,UmpleNode aNode)" + NL + "      {" + NL + "        name=aName;" + NL + "        node=aNode;" + NL + "      }" + NL + "      //------------------------" + NL + "      // INTERFACE" + NL + "      //------------------------" + NL + NL + "      public boolean setNumber(int aNumber)" + NL + "      {" + NL + "        boolean wasSet = false;" + NL + "        number = aNumber;" + NL + "        wasSet = true;" + NL + "        return wasSet;" + NL + "      }" + NL + NL + "      public boolean setName(String aName)" + NL + "      {" + NL + "        boolean wasSet = false;" + NL + "        name = aName;" + NL + "        wasSet = true;" + NL + "        return wasSet;" + NL + "      }" + NL + "      public boolean setNode(UmpleNode aNode)" + NL + "      {" + NL + "        boolean wasSet = false;" + NL + "        node = aNode;" + NL + "        wasSet = true;" + NL + "        return wasSet;" + NL + "      }" + NL + "      public UmpleNode getNode()" + NL + "      {" + NL + "        return node;" + NL + "      }" + NL + NL + "      public int getNumber()" + NL + "      {" + NL + "        return number;" + NL + "      }" + NL + NL + "      public String getName()" + NL + "      {" + NL + "        return name;" + NL + "      }" + NL + "      public boolean equals(Object object) {" + NL + "          if(object instanceof UmpleComponent && ((UmpleComponent)object).getName() == this.name) {" + NL + "              return true;" + NL + "          } else {" + NL + "              return false;" + NL + "          }" + NL + "      }      " + NL + "    }  " + NL + "}" + NL + " ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JavaObjectFactoryClassGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 21 "../../../../../UmpleTLTemplates/JavaObjectFactoryClassGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 28 "../../../../../UmpleTLTemplates/JavaObjectFactoryClassGenerator.ump"
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
    
    /*JavaObjectFactoryClassGenerator*/
    /*UmpleNotice*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
  JavaGenerator gen = new JavaGenerator();
  gen.setModel(model);
  GeneratorHelper.generator = gen;
  Boolean isInterface=false;
  Set<String> packageSet = new HashSet<String>();
  /*if(model.getDistributeTechnology().equals("RMI"))*/
  if(model.getDistributeTechnology().equals("RMI"))
  {
    packageSet.add("java.io.File");
    packageSet.add("java.rmi.registry.Registry");
    packageSet.add("java.rmi.registry.LocateRegistry");
    packageSet.add("java.rmi.RemoteException");
    packageSet.add("java.rmi.server.UnicastRemoteObject");
    packageSet.add("java.rmi.Remote");
  }
  else if(model.getDistributeTechnology().equals("WS"))
  { 
    packageSet.add("javax.jws.WebService");
    packageSet.add("javax.jws.soap.SOAPBinding");
    packageSet.add("javax.jws.soap.SOAPBinding.Style");
    packageSet.add("java.net.URL");
    packageSet.add("javax.xml.namespace.QName");
    packageSet.add("javax.xml.ws.Service");
    packageSet.add("javax.jws.WebMethod");
    packageSet.add("javax.xml.ws.Endpoint");
  }  
  
  packageSet.add("java.io.FileInputStream");
  packageSet.add("java.io.InputStreamReader");
  packageSet.add("java.io.BufferedReader");
  packageSet.add("java.io.FileReader");
  packageSet.add("java.io.IOException");
  packageSet.add("java.io.InputStream");
  packageSet.add("java.util.Properties");
  packageSet.add("java.util.*");
  packageSet.add("java.io.*");
  packageSet.add("java.util.regex.Pattern");
  packageSet.add("java.util.regex.Matcher");

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
String defaultNamespace="";
String qname="http://";
  if (model.getDefaultNamespace()!=null){
    realSb.append(TEXT_2);
    realSb.append(model.getDefaultNamespace());
    realSb.append(TEXT_3);
    
    defaultNamespace=model.getDefaultNamespace();
    qname+=defaultNamespace+"/";
    defaultNamespace+=".";
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
    append(realSb,defaultNamespace);
    realSb.append(TEXT_7);
    
  }
  
    realSb.append(TEXT_8);
    
    if(model.getDistributeTechnology().equals("WS"))
    {
    
    realSb.append(TEXT_9);
    }
    realSb.append(TEXT_10);
    
      if(model.getDistributeTechnology().equals("WS"))
      {
      
    realSb.append(TEXT_11);
    }
    realSb.append(TEXT_12);
    
    if(model.getDistributeTechnology().equals("RMI"))
    {
    
    realSb.append(TEXT_13);
    }
    if(model.getDistributeTechnology().equals("WS"))
    {
    
    realSb.append(TEXT_14);
    append(realSb,qname);
    realSb.append(TEXT_15);
    
    }
    
    realSb.append(TEXT_16);
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
    realSb.append(TEXT_17);
    
  arguments=gClass.getLookup("constructorSignature");
  argumentscomma="";
  if(!arguments.equals(""))
    argumentscomma+=", ";
  caller=gClass.getLookup("constructorSignature_caller");
  
    realSb.append(TEXT_18);
    /*objectFactory_add_methods*/
    
  if (model.getDistributePattern()==1){
    
    /*objectFactory_add_methods1*/
    
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}{3} proxy)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma,uClass.getName()});

  
    realSb.append(TEXT_19);
    realSb.append(uClass.getName());
    realSb.append(TEXT_20);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_21);
    realSb.append(uClass.getName());
    realSb.append(TEXT_22);
    
  }
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}UmpleRuntime.UmpleComponent component{3} proxy)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma, ", "+uClass.getName()});
  
    realSb.append(TEXT_23);
    realSb.append(uClass.getName());
    realSb.append(TEXT_24);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_25);
    
    }
  append(realSb,"\n  {0}{1} {2}({3}{4} proxy)",new Object[] {webMethod,accessibilityCreate , "create"+uClass.getName(), arguments,argumentscomma+uClass.getName()});
  if(isInterface==true){
  
    realSb.append(TEXT_26);
    
  }
  else{
    if(uClass.getIsSingleton()){
    
    realSb.append(TEXT_27);
    realSb.append(uClass.getName());
    realSb.append(TEXT_28);
    realSb.append(uClass.getName());
    realSb.append(TEXT_29);
    
    }
   else
   { 

    realSb.append(TEXT_30);
    realSb.append(uClass.getName());
    realSb.append(TEXT_31);
    realSb.append(uClass.getName());
    realSb.append(TEXT_32);
    realSb.append(caller);
    realSb.append(TEXT_33);
    }
    realSb.append(TEXT_34);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_35);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_36);
    }
    realSb.append(TEXT_37);
    
    }
    
  }
  else{
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}UmpleRuntime.UmpleComponent component,{3} object)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma,uClass.getName()});
  
    realSb.append(TEXT_38);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_39);
    realSb.append(uClass.getName());
    realSb.append(TEXT_40);
    realSb.append(caller);
    realSb.append(TEXT_41);
    } 
          else
          {
          
    realSb.append(TEXT_42);
    realSb.append(uClass.getName());
    realSb.append(TEXT_43);
    realSb.append(uClass.getName());
    realSb.append(TEXT_44);
    realSb.append(caller);
    realSb.append(TEXT_45);
    }
          
    realSb.append(TEXT_46);
        append(realSb,"\n  {0} {1}({2} object){",new Object[] {accessibility, "new"+uClass.getName(),uClass.getName()});

    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_47);
    realSb.append(uClass.getName());
    realSb.append(TEXT_48);
    realSb.append(uClass.getName());
    realSb.append(TEXT_49);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_50);
    }
    realSb.append(TEXT_51);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_52);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_53);
    }
    realSb.append(TEXT_54);
    
    }
  if(isInterface==true){
  append(realSb,"\n  {0}{1} {2}({3})",new Object[] {webMethod,accessibilityCreate, "create"+uClass.getName(), arguments});
  
    realSb.append(TEXT_55);
    
  }
  else{
    append(realSb,"\n  {0}synchronized {1} {2}({3})",new Object[] {webMethod,accessibilityCreate, "create"+uClass.getName(), arguments});
    if(uClass.getIsSingleton()){
    
    realSb.append(TEXT_56);
    realSb.append(uClass.getName());
    realSb.append(TEXT_57);
    realSb.append(uClass.getName());
    realSb.append(TEXT_58);
    
    }
    else
    { 
  
    realSb.append(TEXT_59);
    realSb.append(uClass.getName());
    realSb.append(TEXT_60);
    realSb.append(uClass.getName());
    realSb.append(TEXT_61);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_62);
    }
    if(uClass.getDistributeTechnology().equals("WS"))
    {
    
    realSb.append(TEXT_63);
    
    }
    else
    {
    
    realSb.append(TEXT_64);
    
    }
  }
  }  
    
    realSb.append(TEXT_65);
    
      if (isOneToOne)
      {
      
    realSb.append(TEXT_66);
    /*objectFactory_add_DeclareOneToOne*/
    
  String signature = gClass.getLookup("constructorSignature_mandatory");
  hasBody = false;
  arguments=gen.translate("constructorMandatory",uClass);
  argumentscomma="";
  if(!arguments.equals(""))
    argumentscomma+=", ";
  caller=gClass.getLookup("constructorSignature_caller");
  
    realSb.append(TEXT_67);
    /*objectFactory_add_methods*/
    
  if (model.getDistributePattern()==1){
    
    /*objectFactory_add_methods1*/
    
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}{3} proxy)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma,uClass.getName()});

  
    realSb.append(TEXT_19);
    realSb.append(uClass.getName());
    realSb.append(TEXT_20);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_21);
    realSb.append(uClass.getName());
    realSb.append(TEXT_22);
    
  }
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}UmpleRuntime.UmpleComponent component{3} proxy)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma, ", "+uClass.getName()});
  
    realSb.append(TEXT_23);
    realSb.append(uClass.getName());
    realSb.append(TEXT_24);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_25);
    
    }
  append(realSb,"\n  {0}{1} {2}({3}{4} proxy)",new Object[] {webMethod,accessibilityCreate , "create"+uClass.getName(), arguments,argumentscomma+uClass.getName()});
  if(isInterface==true){
  
    realSb.append(TEXT_26);
    
  }
  else{
    if(uClass.getIsSingleton()){
    
    realSb.append(TEXT_27);
    realSb.append(uClass.getName());
    realSb.append(TEXT_28);
    realSb.append(uClass.getName());
    realSb.append(TEXT_29);
    
    }
   else
   { 

    realSb.append(TEXT_30);
    realSb.append(uClass.getName());
    realSb.append(TEXT_31);
    realSb.append(uClass.getName());
    realSb.append(TEXT_32);
    realSb.append(caller);
    realSb.append(TEXT_33);
    }
    realSb.append(TEXT_34);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_35);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_36);
    }
    realSb.append(TEXT_37);
    
    }
    
  }
  else{
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}UmpleRuntime.UmpleComponent component,{3} object)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma,uClass.getName()});
  
    realSb.append(TEXT_38);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_39);
    realSb.append(uClass.getName());
    realSb.append(TEXT_40);
    realSb.append(caller);
    realSb.append(TEXT_41);
    } 
          else
          {
          
    realSb.append(TEXT_42);
    realSb.append(uClass.getName());
    realSb.append(TEXT_43);
    realSb.append(uClass.getName());
    realSb.append(TEXT_44);
    realSb.append(caller);
    realSb.append(TEXT_45);
    }
          
    realSb.append(TEXT_46);
        append(realSb,"\n  {0} {1}({2} object){",new Object[] {accessibility, "new"+uClass.getName(),uClass.getName()});

    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_47);
    realSb.append(uClass.getName());
    realSb.append(TEXT_48);
    realSb.append(uClass.getName());
    realSb.append(TEXT_49);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_50);
    }
    realSb.append(TEXT_51);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_52);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_53);
    }
    realSb.append(TEXT_54);
    
    }
  if(isInterface==true){
  append(realSb,"\n  {0}{1} {2}({3})",new Object[] {webMethod,accessibilityCreate, "create"+uClass.getName(), arguments});
  
    realSb.append(TEXT_55);
    
  }
  else{
    append(realSb,"\n  {0}synchronized {1} {2}({3})",new Object[] {webMethod,accessibilityCreate, "create"+uClass.getName(), arguments});
    if(uClass.getIsSingleton()){
    
    realSb.append(TEXT_56);
    realSb.append(uClass.getName());
    realSb.append(TEXT_57);
    realSb.append(uClass.getName());
    realSb.append(TEXT_58);
    
    }
    else
    { 
  
    realSb.append(TEXT_59);
    realSb.append(uClass.getName());
    realSb.append(TEXT_60);
    realSb.append(uClass.getName());
    realSb.append(TEXT_61);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_62);
    }
    if(uClass.getDistributeTechnology().equals("WS"))
    {
    
    realSb.append(TEXT_63);
    
    }
    else
    {
    
    realSb.append(TEXT_64);
    
    }
  }
  }  
    
    realSb.append(TEXT_68);
    realSb.append(TEXT_69);
    
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

  
    realSb.append(TEXT_19);
    realSb.append(uClass.getName());
    realSb.append(TEXT_20);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_21);
    realSb.append(uClass.getName());
    realSb.append(TEXT_22);
    
  }
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}UmpleRuntime.UmpleComponent component{3} proxy)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma, ", "+uClass.getName()});
  
    realSb.append(TEXT_23);
    realSb.append(uClass.getName());
    realSb.append(TEXT_24);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_25);
    
    }
  append(realSb,"\n  {0}{1} {2}({3}{4} proxy)",new Object[] {webMethod,accessibilityCreate , "create"+uClass.getName(), arguments,argumentscomma+uClass.getName()});
  if(isInterface==true){
  
    realSb.append(TEXT_26);
    
  }
  else{
    if(uClass.getIsSingleton()){
    
    realSb.append(TEXT_27);
    realSb.append(uClass.getName());
    realSb.append(TEXT_28);
    realSb.append(uClass.getName());
    realSb.append(TEXT_29);
    
    }
   else
   { 

    realSb.append(TEXT_30);
    realSb.append(uClass.getName());
    realSb.append(TEXT_31);
    realSb.append(uClass.getName());
    realSb.append(TEXT_32);
    realSb.append(caller);
    realSb.append(TEXT_33);
    }
    realSb.append(TEXT_34);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_35);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_36);
    }
    realSb.append(TEXT_37);
    
    }
    
  }
  else{
  if(isInterface!=true){
    append(realSb,"\n  {0} {1}({2}UmpleRuntime.UmpleComponent component,{3} object)",new Object[] {accessibility, "new"+uClass.getName(), arguments+argumentscomma,uClass.getName()});
  
    realSb.append(TEXT_38);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_39);
    realSb.append(uClass.getName());
    realSb.append(TEXT_40);
    realSb.append(caller);
    realSb.append(TEXT_41);
    } 
          else
          {
          
    realSb.append(TEXT_42);
    realSb.append(uClass.getName());
    realSb.append(TEXT_43);
    realSb.append(uClass.getName());
    realSb.append(TEXT_44);
    realSb.append(caller);
    realSb.append(TEXT_45);
    }
          
    realSb.append(TEXT_46);
        append(realSb,"\n  {0} {1}({2} object){",new Object[] {accessibility, "new"+uClass.getName(),uClass.getName()});

    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_47);
    realSb.append(uClass.getName());
    realSb.append(TEXT_48);
    realSb.append(uClass.getName());
    realSb.append(TEXT_49);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_50);
    }
    realSb.append(TEXT_51);
    if(uClass.getDistributeTechnology().equals("RMI")){
    realSb.append(TEXT_52);
    }
        else if(uClass.getDistributeTechnology().equals("WS")){
        
    realSb.append(TEXT_53);
    }
    realSb.append(TEXT_54);
    
    }
  if(isInterface==true){
  append(realSb,"\n  {0}{1} {2}({3})",new Object[] {webMethod,accessibilityCreate, "create"+uClass.getName(), arguments});
  
    realSb.append(TEXT_55);
    
  }
  else{
    append(realSb,"\n  {0}synchronized {1} {2}({3})",new Object[] {webMethod,accessibilityCreate, "create"+uClass.getName(), arguments});
    if(uClass.getIsSingleton()){
    
    realSb.append(TEXT_56);
    realSb.append(uClass.getName());
    realSb.append(TEXT_57);
    realSb.append(uClass.getName());
    realSb.append(TEXT_58);
    
    }
    else
    { 
  
    realSb.append(TEXT_59);
    realSb.append(uClass.getName());
    realSb.append(TEXT_60);
    realSb.append(uClass.getName());
    realSb.append(TEXT_61);
    realSb.append(caller);
    realSb.append(argumentscomma);
    realSb.append(TEXT_62);
    }
    if(uClass.getDistributeTechnology().equals("WS"))
    {
    
    realSb.append(TEXT_63);
    
    }
    else
    {
    
    realSb.append(TEXT_64);
    
    }
  }
  }  
    
    
            
          }
        }
      }            
    }    
  }

    realSb.append(TEXT_70);

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