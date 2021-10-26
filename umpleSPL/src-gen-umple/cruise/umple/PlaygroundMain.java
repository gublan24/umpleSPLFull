/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple;
import cruise.umple.sync.*;
import cruise.umple.compiler.*;
import cruise.umple.compiler.exceptions.*;
import cruise.umple.util.*;
import java.io.*;
import java.util.*;
import java.net.*;
import com.sun.management.OperatingSystemMXBean;
import java.lang.management.*;
import java.text.SimpleDateFormat;

// line 703 "../../../src/Main_Code.ump"
public class PlaygroundMain extends AbstractServer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PlaygroundMain Attributes
  private boolean isServer;
  private int commandsRun;
  private int commandsEverRun;
  private int checkpointCommandsRun;
  private int checkpoint2CommandsRun;
  private int cpDiffCmds;
  private long cpDiffTime;
  private int logCommandsRun;
  private int addClassCommandsRun;
  private int editClassCommandsRun;
  private int addPositioningCommandsRun;
  private int sourceCommandsRun;
  private int generateJsonCommandsRun;
  private int generateJsonMixedCommandsRun;
  private int generateGvClassDiagramCommandsRun;
  private int generateGvStateDiagramCommandsRun;
  private long lastCommandStartTime;
  private long lastCommandEndTime;
  private long lastCommandElapsed;
  private long previousCommandElapsed;
  private long previousCommandEndTime;
  private long checkpointTime;
  private long checkpoint2Time;
  private long maxElapsed;
  private long checkpointMaxElapsed;
  private long checkpoint2MaxElapsed;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PlaygroundMain(Thread aConnectionListener, int aPort, ThreadGroup aClientThreadGroup)
  {
    super(aConnectionListener, aPort, aClientThreadGroup);
    isServer = false;
    commandsRun = 0;
    commandsEverRun = 0;
    checkpointCommandsRun = 0;
    checkpoint2CommandsRun = 0;
    cpDiffCmds = 0;
    cpDiffTime = 0L;
    logCommandsRun = 0;
    addClassCommandsRun = 0;
    editClassCommandsRun = 0;
    addPositioningCommandsRun = 0;
    sourceCommandsRun = 0;
    generateJsonCommandsRun = 0;
    generateJsonMixedCommandsRun = 0;
    generateGvClassDiagramCommandsRun = 0;
    generateGvStateDiagramCommandsRun = 0;
    lastCommandStartTime = 0L;
    lastCommandEndTime = 0L;
    lastCommandElapsed = 0L;
    previousCommandElapsed = 0L;
    previousCommandEndTime = 0L;
    checkpointTime = 0L;
    checkpoint2Time = 0L;
    maxElapsed = 0L;
    checkpointMaxElapsed = 0L;
    checkpoint2MaxElapsed = 0L;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsServer(boolean aIsServer)
  {
    boolean wasSet = false;
    isServer = aIsServer;
    wasSet = true;
    return wasSet;
  }

  public boolean setCommandsRun(int aCommandsRun)
  {
    boolean wasSet = false;
    commandsRun = aCommandsRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setCommandsEverRun(int aCommandsEverRun)
  {
    boolean wasSet = false;
    commandsEverRun = aCommandsEverRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setCheckpointCommandsRun(int aCheckpointCommandsRun)
  {
    boolean wasSet = false;
    checkpointCommandsRun = aCheckpointCommandsRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setCheckpoint2CommandsRun(int aCheckpoint2CommandsRun)
  {
    boolean wasSet = false;
    checkpoint2CommandsRun = aCheckpoint2CommandsRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setCpDiffCmds(int aCpDiffCmds)
  {
    boolean wasSet = false;
    cpDiffCmds = aCpDiffCmds;
    wasSet = true;
    return wasSet;
  }

  public boolean setCpDiffTime(long aCpDiffTime)
  {
    boolean wasSet = false;
    cpDiffTime = aCpDiffTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setLogCommandsRun(int aLogCommandsRun)
  {
    boolean wasSet = false;
    logCommandsRun = aLogCommandsRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddClassCommandsRun(int aAddClassCommandsRun)
  {
    boolean wasSet = false;
    addClassCommandsRun = aAddClassCommandsRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setEditClassCommandsRun(int aEditClassCommandsRun)
  {
    boolean wasSet = false;
    editClassCommandsRun = aEditClassCommandsRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddPositioningCommandsRun(int aAddPositioningCommandsRun)
  {
    boolean wasSet = false;
    addPositioningCommandsRun = aAddPositioningCommandsRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setSourceCommandsRun(int aSourceCommandsRun)
  {
    boolean wasSet = false;
    sourceCommandsRun = aSourceCommandsRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setGenerateJsonCommandsRun(int aGenerateJsonCommandsRun)
  {
    boolean wasSet = false;
    generateJsonCommandsRun = aGenerateJsonCommandsRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setGenerateJsonMixedCommandsRun(int aGenerateJsonMixedCommandsRun)
  {
    boolean wasSet = false;
    generateJsonMixedCommandsRun = aGenerateJsonMixedCommandsRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setGenerateGvClassDiagramCommandsRun(int aGenerateGvClassDiagramCommandsRun)
  {
    boolean wasSet = false;
    generateGvClassDiagramCommandsRun = aGenerateGvClassDiagramCommandsRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setGenerateGvStateDiagramCommandsRun(int aGenerateGvStateDiagramCommandsRun)
  {
    boolean wasSet = false;
    generateGvStateDiagramCommandsRun = aGenerateGvStateDiagramCommandsRun;
    wasSet = true;
    return wasSet;
  }

  public boolean setLastCommandStartTime(long aLastCommandStartTime)
  {
    boolean wasSet = false;
    lastCommandStartTime = aLastCommandStartTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setLastCommandEndTime(long aLastCommandEndTime)
  {
    boolean wasSet = false;
    lastCommandEndTime = aLastCommandEndTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setLastCommandElapsed(long aLastCommandElapsed)
  {
    boolean wasSet = false;
    lastCommandElapsed = aLastCommandElapsed;
    wasSet = true;
    return wasSet;
  }

  public boolean setPreviousCommandElapsed(long aPreviousCommandElapsed)
  {
    boolean wasSet = false;
    previousCommandElapsed = aPreviousCommandElapsed;
    wasSet = true;
    return wasSet;
  }

  public boolean setPreviousCommandEndTime(long aPreviousCommandEndTime)
  {
    boolean wasSet = false;
    previousCommandEndTime = aPreviousCommandEndTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setCheckpointTime(long aCheckpointTime)
  {
    boolean wasSet = false;
    checkpointTime = aCheckpointTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setCheckpoint2Time(long aCheckpoint2Time)
  {
    boolean wasSet = false;
    checkpoint2Time = aCheckpoint2Time;
    wasSet = true;
    return wasSet;
  }

  public boolean setMaxElapsed(long aMaxElapsed)
  {
    boolean wasSet = false;
    maxElapsed = aMaxElapsed;
    wasSet = true;
    return wasSet;
  }

  public boolean setCheckpointMaxElapsed(long aCheckpointMaxElapsed)
  {
    boolean wasSet = false;
    checkpointMaxElapsed = aCheckpointMaxElapsed;
    wasSet = true;
    return wasSet;
  }

  public boolean setCheckpoint2MaxElapsed(long aCheckpoint2MaxElapsed)
  {
    boolean wasSet = false;
    checkpoint2MaxElapsed = aCheckpoint2MaxElapsed;
    wasSet = true;
    return wasSet;
  }

  public boolean getIsServer()
  {
    return isServer;
  }

  public int getCommandsRun()
  {
    return commandsRun;
  }

  public int getCommandsEverRun()
  {
    return commandsEverRun;
  }

  public int getCheckpointCommandsRun()
  {
    return checkpointCommandsRun;
  }

  public int getCheckpoint2CommandsRun()
  {
    return checkpoint2CommandsRun;
  }

  public int getCpDiffCmds()
  {
    return cpDiffCmds;
  }

  public long getCpDiffTime()
  {
    return cpDiffTime;
  }

  public int getLogCommandsRun()
  {
    return logCommandsRun;
  }

  public int getAddClassCommandsRun()
  {
    return addClassCommandsRun;
  }

  public int getEditClassCommandsRun()
  {
    return editClassCommandsRun;
  }

  public int getAddPositioningCommandsRun()
  {
    return addPositioningCommandsRun;
  }

  public int getSourceCommandsRun()
  {
    return sourceCommandsRun;
  }

  public int getGenerateJsonCommandsRun()
  {
    return generateJsonCommandsRun;
  }

  public int getGenerateJsonMixedCommandsRun()
  {
    return generateJsonMixedCommandsRun;
  }

  public int getGenerateGvClassDiagramCommandsRun()
  {
    return generateGvClassDiagramCommandsRun;
  }

  public int getGenerateGvStateDiagramCommandsRun()
  {
    return generateGvStateDiagramCommandsRun;
  }

  public long getLastCommandStartTime()
  {
    return lastCommandStartTime;
  }

  public long getLastCommandEndTime()
  {
    return lastCommandEndTime;
  }

  public long getLastCommandElapsed()
  {
    return lastCommandElapsed;
  }

  public long getPreviousCommandElapsed()
  {
    return previousCommandElapsed;
  }

  public long getPreviousCommandEndTime()
  {
    return previousCommandEndTime;
  }

  public long getCheckpointTime()
  {
    return checkpointTime;
  }

  public long getCheckpoint2Time()
  {
    return checkpoint2Time;
  }

  public long getMaxElapsed()
  {
    return maxElapsed;
  }

  public long getCheckpointMaxElapsed()
  {
    return checkpointMaxElapsed;
  }

  public long getCheckpoint2MaxElapsed()
  {
    return checkpoint2MaxElapsed;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsServer()
  {
    return isServer;
  }

  public void delete()
  {
    super.delete();
  }

  // line 762 "../../../src/Main_Code.ump"
   public  PlaygroundMain(int port){
    super(port);
    previousCommand[0]="";    
    lastCommand[0]="";    
    currentCommand[0]="";
  }


  /**
   * The main method when started from the command line
   */
  // line 770 "../../../src/Main_Code.ump"
   public static  void main(String [] args){
    Thread.currentThread().setUncaughtExceptionHandler(new cruise.umple.docs.DocumenterMain.UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new cruise.umple.docs.DocumenterMain.UmpleExceptionHandler());
    theInstance = new PlaygroundMain(0);
    theInstance.processCommand(args, null);
  }


  /**
   * A command arriving when this is a server
   */
  // line 778 "../../../src/Main_Code.ump"
   public void handleMessageFromClient(String msg, ConnectionToClient client){
    // DEBUG Uncomment the following line to debug
  //   System.err.println("Received client command <"+msg+">");
    // Split the message from the client into tokens and process as a command
    List<String> ls = ArgumentTokenizer.tokenize(msg,false);
    lastCommandStartTime = System.currentTimeMillis();
    processCommand(ls.toArray(new String[ls.size()]), client);
    previousCommandElapsed=lastCommandElapsed;
    previousCommandEndTime=lastCommandEndTime;    
    lastCommandEndTime = System.currentTimeMillis();
    lastCommandElapsed = lastCommandEndTime-lastCommandStartTime;
    if (lastCommandElapsed > maxElapsed) {
      maxElapsed = lastCommandElapsed;
    }
    if (lastCommandElapsed > checkpointMaxElapsed) {
      checkpointMaxElapsed = lastCommandElapsed;
    }
    if (lastCommandElapsed > checkpoint2MaxElapsed) {
      checkpoint2MaxElapsed = lastCommandElapsed;
    }
    
    try {
      client.close();
    }
    catch (IOException e) {
    }
  }

  // line 806 "../../../src/Main_Code.ump"
   public void returnCommandResult(String resultToOutput, ConnectionToClient client){
    if(isServer) {
      // Client must not be null
      try {
        client.sendToClient(resultToOutput);
      }
      catch (IOException e) {
        System.err.print("Unable to send to client "+resultToOutput);
        // TO DO this is serious; should shut down?
      }
    }
    else {
      System.out.print(resultToOutput);
    }
  }


  /**
   * Process arguments either from the command line, or through a socket
   * If through a socket, the socket must be closed after returning
   */
  // line 825 "../../../src/Main_Code.ump"
   public void processCommand(String [] args, ConnectionToClient client){
    String answer = "";
    commandsRun++;
    commandsEverRun++;
    
    if(commandsRun%100==0) { // We have hit a checkpoint
      checkpoint2CommandsRun = checkpointCommandsRun;
      checkpoint2Time = checkpointTime;
      checkpointCommandsRun = commandsRun;
      checkpointTime = System.currentTimeMillis();
      checkpoint2MaxElapsed = checkpointMaxElapsed;
      checkpointMaxElapsed = 0; // start counting max again
    }

    if(commandsEverRun%1000==0) {
      //write commandcount.txt with commandsEverRun (to allow for crashes)
      saveCommandsCount();
    }
    
    previousCommand = lastCommand;
    previousIP = lastIP;
    lastCommand = currentCommand;
    lastIP = currentIP;
    currentCommand = args;
    
    if(currentCommand[0].equals("-log")) logCommandsRun++;
    else if(currentCommand[0].equals("-addClass"))  addClassCommandsRun++;
    else if(currentCommand[0].equals("-editClass"))  editClassCommandsRun++;
    else if(currentCommand[0].equals("-addPositioning"))  addPositioningCommandsRun++;
    else if(currentCommand[0].equals("-source"))  sourceCommandsRun++;

    else if(currentCommand[0].equals("-generate")) {
      if (currentCommand[1].equals("Json"))  generateJsonCommandsRun++;
      else if (currentCommand[1].equals("GvClassDiagram"))  generateGvClassDiagramCommandsRun++;
      else if (currentCommand[1].equals("GvStateDiagram"))  generateGvStateDiagramCommandsRun++;
      else if (currentCommand[1].equals("JsonMixed"))  generateJsonMixedCommandsRun++;
    }
    
    if(client != null) {
      currentIP = client.getInetAddress();
    }

    if (args.length == 0 || ("-help".equals(args[0])) )
    {
      returnCommandResult("Syntax:\n", client);
      returnCommandResult("-version  : give umple version running\n", client);
      returnCommandResult("-help  : give command line syntax\n", client);
      returnCommandResult("-classList <filename>\n", client);
      returnCommandResult("-interfaceList <filename>\n", client);
      returnCommandResult("-source <filename>  : generate code using an embedded generate directive\n", client);
      returnCommandResult("-server <port>  : start this as a server to take commends\n", client);
      returnCommandResult("-quit  : quit if running as a server\n", client);

      
      returnCommandResult("-generate "+
        "<Java|Cpp|Ruby|Ecore|Papyrus|TextUml|GvStateDiagram|"+
        "GvClassDiagram|GvClassTraitDiagram|GvEntityRelationshipDiagram|GvFeatureDiagram|"+
        "Alloy|NuSMV|NuSMVOptimizer|Violet|Umlet> <filename>\n", client); // Compile filename and generate output
      returnCommandResult("<action> <deltaCode> <filename>\n", client);  
      return;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("EEE yyyy MMM dd HH:mm:ss z");    
    if ("-version".equals(args[0])) {
      returnCommandResult("Version: " + UmpleModel.VERSION_NUMBER
        + " Compiled: "+sdf.format(CompileDate.getClassBuildTime())
        +"\n", client);
      return;
    }    

    if ("-log".equals(args[0])) {
      if(isServer) {
          long uptime = ManagementFactory.getRuntimeMXBean().getUptime();
          Date startDate = new Date(System.currentTimeMillis()-uptime);
          
          String hn="unknown";
          try {
            hn=java.net.InetAddress.getLocalHost().getCanonicalHostName();
          }
          catch (Exception e) {}
         
          returnCommandResult("UmpleOnline Log         recorded "
            +sdf.format(System.currentTimeMillis()) 
            +"  at "+hn+"\n\n", client);
          
          returnCommandResult("JVM up: "
            +uptime/1000+"s  "+String.format("%.3f",uptime/60000/1440.0)+"d   restart "+
            sdf.format(startDate)+"\n\n", client);

          returnCommandResult("Version: " + UmpleModel.VERSION_NUMBER
            + " Jar "+sdf.format(CompileDate.getClassBuildTime())
            +"\n\n", client);
          
          cpDiffCmds = commandsRun - checkpoint2CommandsRun;
          cpDiffTime = System.currentTimeMillis()-checkpoint2Time;
          
          returnCommandResult("Number of commands run since start: "
            +commandsRun+"  (pace "+String.format("%.1f", 3600000.0*commandsRun/uptime)+"/h"
               + ((checkpoint2Time > 0) ? 
                  " recent "+String.format("%.1f", 3600000.0*cpDiffCmds/cpDiffTime)+"/h"
                  : "")
               +"\n", client);          
          returnCommandResult(
              "  log: " +logCommandsRun
              +"  addClass: " +addClassCommandsRun
              +"  editClass: " +editClassCommandsRun
              +"  addPositioning: " +addPositioningCommandsRun
              +"  source: " +sourceCommandsRun
              +"\n"
              +"   gen: Json: " +generateJsonCommandsRun
              +"  GvClass: " +generateGvClassDiagramCommandsRun
              +"  GvState: " +generateGvStateDiagramCommandsRun
              +"  JsonMixed: " +generateJsonMixedCommandsRun
              +"\n\n", client);          

          returnCommandResult("Number of commands run since July 2019: "
            +commandsEverRun+"\n\n", client);

          returnCommandResult("Number of clients queued: "
            +getClientConnections().length+"\n\n", client);

          OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);         
          returnCommandResult("CPU load % of this JVM: "
            +(String.format("%.3f",100.0*osBean.getProcessCpuLoad()))
            +"\n\n", client);   
          returnCommandResult("CPU load % overall: "
            +(String.format("%.3f",100.0*osBean.getSystemCpuLoad()))
            +"\n\n", client);  

          returnCommandResult("Max elapsed ms of any command: "+maxElapsed
            + "  recent: "+checkpoint2MaxElapsed
            +"\n\n", client);

          returnCommandResult("Port: "+getPort()+"  Process:"
              +ManagementFactory.getRuntimeMXBean().getName().split("@")[0]
              +"\n\n", client);

          if(lastIP != null) {
            returnCommandResult("Last command      from "
              +lastIP+" ("+lastIP.getCanonicalHostName()+")\n"
              +" Elapsed "+lastCommandElapsed+"ms  Ended "
              +(System.currentTimeMillis()-lastCommandEndTime)/1000+"s ago :\n"
              +concatForLog(lastCommand)+"\n", client);
          }

          if(previousIP != null) {            
            returnCommandResult("Previous command  from "
              +previousIP+" ("+previousIP.getCanonicalHostName()+")\n"
              +" Elapsed "+previousCommandElapsed+"ms  Ended "
              +(System.currentTimeMillis()-previousCommandEndTime)/1000+"s ago :\n"
              +concatForLog(previousCommand), client);
          }

      }
      else {
        returnCommandResult("Not running as a server\n", client);        
      }
      return;
    }  

    // Start a server to process a series of commands that can be controlled from Php
    if ("-server".equals(args[0])) {
      isServer = true;

      // Start server on port 5556 if in a test environment, otherwise use port 5555
      // Test environment means that the directory has 'test' in it
      int port = 5555;
      File specialPort = new File(System.getProperty("user.dir")+File.separator+"specialPort.txt");
      if(specialPort.exists()) {
        try {
          FileReader reader = new FileReader(specialPort);
          BufferedReader in = new BufferedReader(reader);
          port = Integer.parseInt(in.readLine());
          in.close();
        }
        catch (IOException e) {
          System.err.println("Could not read the contents of specialPort.txt. Should be a port number. Using 5555.");
        } 
      }
      else if(System.getProperty("user.dir").contains("test")) {
        port = 5556;
      }
      

      if(args.length >=2) {
        try {
         port = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e)
        {}
      }
      setPort(port);
      try 
      {
        this.listen(); //Start listening for connections
      } 
      catch (Exception ex) 
      {
        System.out.println("ERROR - Could not listen for clients!");
      }
      finally {
        // write out the umple version
      File versionRunning = new File(System.getProperty("user.dir")+File.separator+"versionRunning.txt");
        try {
          FileWriter writer = new FileWriter(versionRunning);
          BufferedWriter out = new BufferedWriter(writer);
          out.write(UmpleModel.VERSION_NUMBER+"\n");
          out.close();
        }
        catch (IOException e) {
          // Do nothing if we can't write out the version
        } 
      }
      
      return;
    }
    
    if ("-quit".equals(args[0])) {
      if(isServer) {
        try {
          saveCommandsCount();
          this.close();
        }
        catch (IOException e) {
        }
      }
      System.exit(0);
    }

    // Anything other than -generate, and must have 3+ args
    if (args.length >= 3 && !"-generate".equals(args[0]))
    {
      String actionType = args[0];
      String deltaCode = args[1];
      String filename = args[2];
      String umpleCode = SampleFileWriter.readContent(new File(filename));

      SynchronizationAction action = action(actionType,deltaCode,umpleCode,filename);
      if (action != null)
      {
        action.go();
        returnCommandResult(action.getUmpleCode(), client);
        return;
      }
    }

    UmpleFile umpleFile = null;
    UmpleModel model = null;

    // Valid values include Java, Cpp, PhP, Ruby, Json, Yuml, Xmi, Ecore, Papyrus, TextUml,
    // GvStateDiagram, GvStructureDiagram, GvClassDiagram,GvClassTraitDiagram, GvEntityRelationshipDiagram, Alloy, NuSMV, NuSMVOptimizer, GvFeatureDiagram
    if ("-generate".equals(args[0]) && args.length >= 2)
    {
      String filename = args[2];
      GenerateTarget target = new GenerateTarget(args[1], ""); // output path goes here
      // Add any suboptions specified as -s blah -s blah
      for (int argno = 3; argno <= args.length-2; argno += 2)
      {
        if (args[argno].equals("-s"))
        {
          target.addSuboption(args[argno+1]);
        }
      }
      
      umpleFile = new UmpleFile(filename);
      model = new UmpleModel(umpleFile);
      target.setOverrideAll(true);
      model.addGenerate(target);
    }
    else
    {
      // All other commands have filename at second argument
      if(args.length == 1) {
        System.err.println("Filename argument required after command. Quitting");
        System.exit(1);
      }
      String filename = args[1];
      umpleFile = new UmpleFile(filename);
      model = new UmpleModel(umpleFile);
    }

    try
    {
      model.run();
    }
    catch(UmpleCompilerException e)
    {
      String errorToReport = model.getLastResult().toJSON();
      if(client == null) {
        System.err.print(errorToReport);
      }
      else {
        try {
          client.sendToClient("ERROR!!"+errorToReport+"!!ERROR");
        }
          catch (IOException e2) {
        }
      }
    }

    if ("-classList".equals(args[0]))
    {
      for (UmpleClass aClass : model.getUmpleClasses())
      {
        if (answer.length() > 0)
        {
          answer += ",";
        }
        answer += aClass.getName();
      }
    }
    if ("-interfaceList".equals(args[0]))
    {
      for (UmpleInterface aInterface : model.getUmpleInterfaces()) {
        if (answer.length() > 0)
        {
          answer += ",";
        }
        answer += aInterface.getName();
      }
    }
    else if ("-source".equals(args[0]))
    {
      for (Map.Entry<String, String> generatedCode : model.getGeneratedCode().entrySet()) {
        if (answer.length() > 0)
        {
          answer += "\n\n\n\n";
        }
				answer += "//%% NEW FILE " + generatedCode.getKey() + " BEGINS HERE %%\n\n";
				answer += generatedCode.getValue();
      }
    }
    else if ("-generate".equals(args[0]))
    {
      answer = model.getCode();
    }

    returnCommandResult(answer, client);
  }

  // line 1165 "../../../src/Main_Code.ump"
   private boolean saveCommandsCount(){
    boolean saved = false;

    try {
        FileWriter writer = new FileWriter("commandcount.txt", false);
        writer.write(Integer.toString(commandsEverRun));
        writer.close();
        saved = true;
    } catch (IOException e) {
        System.err.println(e.getMessage());
    }

    return saved;
  }

  // line 1180 "../../../src/Main_Code.ump"
   private boolean loadCommandsCount(){
    boolean loaded = false;
    try {
      BufferedReader myReader = new BufferedReader(new FileReader("commandcount.txt"));

      int number = 0;
      String token;
      if ((token = myReader.readLine()) != null) {
        try {
            number = Integer.parseInt(token);
        } catch (NumberFormatException ex) {
            System.err.println(token + " is not a number");
        } 
      } 
      myReader.close();
      commandsEverRun = number;
      loaded = true;

    } catch(FileNotFoundException e){
      System.err.println(e.getMessage());

    } catch(IOException e){
      System.err.println(e.getMessage());
    }
    return loaded;
  }

  // line 1207 "../../../src/Main_Code.ump"
   protected void serverStarted(){
    // Uncomment the following to debug
    // System.err.println("Umple server started on port "+getPort());
    // System.err.println("Working directory "+System.getProperty("user.dir"));
    loadCommandsCount();
  }

  // line 1214 "../../../src/Main_Code.ump"
   protected void serverStopped(){
    // Uncomment the following to debug
    // System.err.println("Umple server stopped accepting connections "+getPort());
  }

  // line 1219 "../../../src/Main_Code.ump"
   protected void serverClosed(){
    // Uncomment the following to debug  
    //  System.err.println("Umple server closed on port "+getPort());
  }

  // line 1224 "../../../src/Main_Code.ump"
  public String concatForLog(String [] theCommand){
    String result = "";
    for (String aString : theCommand) {
      result = result+"  ["+aString+"]\n"; // not used often so OK to be inefficient
    }
    return result;
  }

  // line 1233 "../../../src/Main_Code.ump"
   private static  SynchronizationAction action(String type, String deltaCode, String umpleCode, String filename){
    if ("-addClass".equals(type))
    {
      return new NewAction(deltaCode,umpleCode,filename);
    }
    else if ("-addInterface".equals(type))
    {
      return new NewAction(deltaCode,umpleCode,filename);
    }
    else if ("-removeClass".equals(type))
    {
      return new DeleteAction(deltaCode,umpleCode,filename);
    }
    else if ("-editClass".equals(type))
    {
      return new EditAction(deltaCode,umpleCode,filename);
    }
    else if ("-removeInterface".equals(type))
    {
      return new DeleteAction(deltaCode,umpleCode,filename);
    }
    else if ("-editInterface".equals(type))
    {
      return new EditAction(deltaCode,umpleCode,filename);
    }
    else if ("-addAssociation".equals(type))
    {
      return new NewAssociationAction(deltaCode,umpleCode,filename);
    }
    else if ("-editAssociation".equals(type))
    {
      return new EditAssociationAction(deltaCode,umpleCode,filename);
    }
    else if ("-removeAssociation".equals(type))
    {
      return new DeleteAssociationAction(deltaCode,umpleCode,filename);
    }
    else if ("-addTransition".equals(type))
    {
    	return new NewTransitionAction(deltaCode, umpleCode, filename);
    }
    else if ("-removeTransition".equals(type))
    {
    	return new DeleteTransitionAction(deltaCode, umpleCode, filename);
    }
    else if ("-addGeneralization".equals(type))
    {
      return new NewGeneralizationAction(deltaCode,umpleCode,filename);
    }
    else if ("-removeGeneralization".equals(type))
    {
      return new DeleteGeneralizationAction(deltaCode,umpleCode,filename);
    }
    else if ("-addPositioning".equals(type))
    {
      return new UpdatePositioningAction(deltaCode,umpleCode,filename);
    }
    else
    {
      return null;
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "isServer" + ":" + getIsServer()+ "," +
            "commandsRun" + ":" + getCommandsRun()+ "," +
            "commandsEverRun" + ":" + getCommandsEverRun()+ "," +
            "checkpointCommandsRun" + ":" + getCheckpointCommandsRun()+ "," +
            "checkpoint2CommandsRun" + ":" + getCheckpoint2CommandsRun()+ "," +
            "cpDiffCmds" + ":" + getCpDiffCmds()+ "," +
            "cpDiffTime" + ":" + getCpDiffTime()+ "," +
            "logCommandsRun" + ":" + getLogCommandsRun()+ "," +
            "addClassCommandsRun" + ":" + getAddClassCommandsRun()+ "," +
            "editClassCommandsRun" + ":" + getEditClassCommandsRun()+ "," +
            "addPositioningCommandsRun" + ":" + getAddPositioningCommandsRun()+ "," +
            "sourceCommandsRun" + ":" + getSourceCommandsRun()+ "," +
            "generateJsonCommandsRun" + ":" + getGenerateJsonCommandsRun()+ "," +
            "generateJsonMixedCommandsRun" + ":" + getGenerateJsonMixedCommandsRun()+ "," +
            "generateGvClassDiagramCommandsRun" + ":" + getGenerateGvClassDiagramCommandsRun()+ "," +
            "generateGvStateDiagramCommandsRun" + ":" + getGenerateGvStateDiagramCommandsRun()+ "," +
            "lastCommandStartTime" + ":" + getLastCommandStartTime()+ "," +
            "lastCommandEndTime" + ":" + getLastCommandEndTime()+ "," +
            "lastCommandElapsed" + ":" + getLastCommandElapsed()+ "," +
            "previousCommandElapsed" + ":" + getPreviousCommandElapsed()+ "," +
            "previousCommandEndTime" + ":" + getPreviousCommandEndTime()+ "," +
            "checkpointTime" + ":" + getCheckpointTime()+ "," +
            "checkpoint2Time" + ":" + getCheckpoint2Time()+ "," +
            "maxElapsed" + ":" + getMaxElapsed()+ "," +
            "checkpointMaxElapsed" + ":" + getCheckpointMaxElapsed()+ "," +
            "checkpoint2MaxElapsed" + ":" + getCheckpoint2MaxElapsed()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 737 "../../../src/Main_Code.ump"
  static String[] previousCommand = new String[1] ;
// line 738 "../../../src/Main_Code.ump"
  static String[] lastCommand = new String[1] ;
// line 739 "../../../src/Main_Code.ump"
  static String[] currentCommand = new String[1] ;
// line 741 "../../../src/Main_Code.ump"
  static InetAddress previousIP = null ;
// line 742 "../../../src/Main_Code.ump"
  static InetAddress lastIP = null ;
// line 743 "../../../src/Main_Code.ump"
  static InetAddress currentIP = null ;
// line 758 "../../../src/Main_Code.ump"
  static PlaygroundMain theInstance ;

  
}