/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple;
import java.io.*;
import java.net.*;
import java.util.*;

// line 9 "../../../src/ConnectionToClient.ump"
public class ConnectionToClient extends Thread
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConnectionToClient Attributes
  private AbstractServer server;
  private Socket clientSocket;
  private BufferedReader input;
  private Writer output;
  private boolean readyToStop;
  private HashMap savedInfo;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConnectionToClient(AbstractServer aServer, Socket aClientSocket, BufferedReader aInput, Writer aOutput, boolean aReadyToStop)
  {
    super();
    server = aServer;
    clientSocket = aClientSocket;
    input = aInput;
    output = aOutput;
    readyToStop = aReadyToStop;
    savedInfo = new HashMap(10);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setServer(AbstractServer aServer)
  {
    boolean wasSet = false;
    server = aServer;
    wasSet = true;
    return wasSet;
  }

  public boolean setClientSocket(Socket aClientSocket)
  {
    boolean wasSet = false;
    clientSocket = aClientSocket;
    wasSet = true;
    return wasSet;
  }

  public boolean setInput(BufferedReader aInput)
  {
    boolean wasSet = false;
    input = aInput;
    wasSet = true;
    return wasSet;
  }

  public boolean setOutput(Writer aOutput)
  {
    boolean wasSet = false;
    output = aOutput;
    wasSet = true;
    return wasSet;
  }

  public boolean setReadyToStop(boolean aReadyToStop)
  {
    boolean wasSet = false;
    readyToStop = aReadyToStop;
    wasSet = true;
    return wasSet;
  }

  public boolean setSavedInfo(HashMap aSavedInfo)
  {
    boolean wasSet = false;
    savedInfo = aSavedInfo;
    wasSet = true;
    return wasSet;
  }

  /**
   * INSTANCE VARIABLES ***********************************************
   * 
   * A reference to the Server that created this instance.
   */
  public AbstractServer getServer()
  {
    return server;
  }

  /**
   * 
   * Sockets are used in the operating system as channels
   * of communication between two processes.
   * @see java.net.Socket
   */
  public Socket getClientSocket()
  {
    return clientSocket;
  }

  /**
   * 
   * Stream used to read from the client.
   */
  public BufferedReader getInput()
  {
    return input;
  }

  /**
   * 
   * Stream used to write to the client.
   */
  public Writer getOutput()
  {
    return output;
  }

  /**
   * 
   * Indicates if the thread is ready to stop. Set to true when closing
   * of the connection is initiated.
   */
  public boolean getReadyToStop()
  {
    return readyToStop;
  }

  /**
   * 
   * Map to save information about the client such as its login ID.
   * The initial size of the map is small since it is not expected
   * that concrete servers will want to store many different types of
   * information about each client. Used by the setInfo and getInfo
   * methods.
   */
  public HashMap getSavedInfo()
  {
    return savedInfo;
  }

  public void delete()
  {}


  /**
   * CONSTRUCTORS *****************************************************
   * 
   * Constructs a new connection to a client.
   * 
   * @param group the thread group that contains the connections.
   * @param clientSocket contains the client's socket.
   * @param server a reference to the server that created
   * this instance
   * @exception IOException if an I/O error occur when creating
   * the connection.
   */
  // line 71 "../../../src/ConnectionToClient.ump"
   protected  ConnectionToClient(ThreadGroup group, Socket clientSocket, AbstractServer server) throws IOException{
    super(group,(Runnable)null);
    // Initialize variables
    this.clientSocket = clientSocket;
    this.server = server;

    clientSocket.setSoTimeout(0); // make sure timeout is infinite

    //Initialize the objects streams
    try
    {
      input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      output = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));       
    }
    catch (IOException ex)
    {
      try
      {
        closeAll();
      }
      catch (Exception exc) { }

      throw ex;  // Rethrow the exception.
    }

    readyToStop = false;
    start(); // Start the thread waits for data from the socket
  }


  /**
   * INSTANCE METHODS *************************************************
   * 
   * Sends an object to the client.
   * This method can be overriden, but if so it should still perform
   * the general function of sending to client, by calling the
   * <code>super.sendToClient()</code> method
   * perhaps after some kind of filtering is done.
   * 
   * @param msg the message to be sent.
   * @exception IOException if an I/O error occur when sending the
   * 
   */
  // line 114 "../../../src/ConnectionToClient.ump"
   public void sendToClient(String msg) throws IOException{
    if (clientSocket == null || output == null)
      throw new SocketException("socket does not exist");

    output.write(msg); output.flush();
  }


  /**
   * 
   * Returns a string representation of the client.
   * 
   * @return the client's description.
   */
  // line 160 "../../../src/ConnectionToClient.ump"
   public String toString(){
    return clientSocket == null ? null :
      clientSocket.getInetAddress().getHostName()
        +" (" + clientSocket.getInetAddress().getHostAddress() + ")";
  }


  /**
   * 
   * Saves arbitrary information about this client. Designed to be
   * used by concrete subclasses of AbstractServer. Based on a hash map.
   * 
   * @param infoType   identifies the type of information
   * @param info       the information itself.
   */
  // line 174 "../../../src/ConnectionToClient.ump"
   public void setInfo(String infoType, Object info){
    savedInfo.put(infoType, info);
  }


  /**
   * 
   * Returns information about the client saved using setInfo.
   * Based on a hash map.
   * 
   * @param infoType   identifies the type of information
   */
  // line 185 "../../../src/ConnectionToClient.ump"
   public Object getInfo(String infoType){
    return savedInfo.get(infoType);
  }


  /**
   * 
   * This method is called by garbage collection.
   */
  // line 290 "../../../src/ConnectionToClient.ump"
   protected void finalize(){
    try
    {
      closeAll();
    }
    catch(IOException e) {}
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 127 "../../../src/ConnectionToClient.ump"
  final public void close () throws IOException 
  {
    readyToStop = true; // Set the flag that tells the thread to stop

    try
    {
      closeAll();
    }
    finally
    {
      server.clientDisconnected(this);
    }
  }

// line 148 "../../../src/ConnectionToClient.ump"
  final public InetAddress getInetAddress () 
  {
    return clientSocket == null ? null : clientSocket.getInetAddress();
  }

// line 195 "../../../src/ConnectionToClient.ump"
  final public void run () 
  {
    server.clientConnected(this);

    // This loop reads the input stream and responds to messages
    // from clients
    try
    {
      // The message from the client
      String msg="";
      char[] buffer = new char[131072];  // this the size of linux cmd line buffer
      int readCount = 0;

      while (!readyToStop)
      {
        // This block waits until it reads a message from the client
        // and then sends it for handling by the server
        
        readCount = input.read(buffer, 0, 131072);
        if(readCount == -1) {
          readyToStop=true;
        }
        else
        {
          msg = new String(buffer, 0, readCount);
        }

        if (!readyToStop) 
        {
          server.receiveMessageFromClient(msg, this);
        }
      }
      // End of file so close
      close();
    }
    // Exception in loop usually due to client closing
    catch (Exception exception)
    {
      if (!readyToStop)
      {
        try
        {
          closeAll();
        }
        catch (Exception ex) { }

        server.clientException(this, exception);
      }
    }
  }

// line 255 "../../../src/ConnectionToClient.ump"
  final private void closeAll () throws IOException 
  {
    // This method is final since version 2.2

    try
    {
      // Close the socket
      if (clientSocket != null)
        clientSocket.close();

      // Close the output stream
      if (output != null)
        output.close();

      // Close the input stream
      if (input != null)
        input.close();
    }
    finally
    {
      // Set the streams and the sockets to NULL no matter what
      // Doing so allows, but does not require, any finalizers
      // of these objects to reclaim system resources if and
      // when they are garbage collected.
      output = null;
      input = null;
      clientSocket = null;
    }
  }

  
}