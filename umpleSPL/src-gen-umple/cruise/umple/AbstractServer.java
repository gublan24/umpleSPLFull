/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple;
import java.net.*;
import java.util.*;
import java.io.*;
import cruise.umple.compiler.*;

/**
 * This file contains material derived from
 * "Object Oriented Software Engineering" by Lethbridge and Laganiere
 * and is issued under the open-source
 * license found at www.lloseng.com
 * This is a framework for a server that can read and write characters
 */
// line 7 "../../../src/AbstractServer.ump"
public abstract class AbstractServer implements Runnable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AbstractServer Attributes
  private ServerSocket serverSocket;
  private Thread connectionListener;
  private int port;
  private int timeout;
  private int backlog;
  private ThreadGroup clientThreadGroup;
  private boolean readyToStop;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AbstractServer(Thread aConnectionListener, int aPort, ThreadGroup aClientThreadGroup)
  {
    serverSocket = null;
    connectionListener = aConnectionListener;
    port = aPort;
    timeout = 500;
    backlog = 10;
    clientThreadGroup = aClientThreadGroup;
    readyToStop = false;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setServerSocket(ServerSocket aServerSocket)
  {
    boolean wasSet = false;
    serverSocket = aServerSocket;
    wasSet = true;
    return wasSet;
  }

  public boolean setConnectionListener(Thread aConnectionListener)
  {
    boolean wasSet = false;
    connectionListener = aConnectionListener;
    wasSet = true;
    return wasSet;
  }

  public boolean setPort(int aPort)
  {
    boolean wasSet = false;
    port = aPort;
    wasSet = true;
    return wasSet;
  }

  public boolean setTimeout(int aTimeout)
  {
    boolean wasSet = false;
    timeout = aTimeout;
    wasSet = true;
    return wasSet;
  }

  public boolean setBacklog(int aBacklog)
  {
    boolean wasSet = false;
    backlog = aBacklog;
    wasSet = true;
    return wasSet;
  }

  public boolean setClientThreadGroup(ThreadGroup aClientThreadGroup)
  {
    boolean wasSet = false;
    clientThreadGroup = aClientThreadGroup;
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

  /**
   * INSTANCE VARIABLES *********************************************
   * 
   * The server socket: listens for clients who want to connect.
   */
  public ServerSocket getServerSocket()
  {
    return serverSocket;
  }

  /**
   * 
   * The connection listener thread.
   */
  public Thread getConnectionListener()
  {
    return connectionListener;
  }

  /**
   * 
   * The port number
   */
  public int getPort()
  {
    return port;
  }

  /**
   * 
   * The server timeout while for accepting connections.
   * After timing out, the server will check to see if a command to
   * stop the server has been issued; it not it will resume accepting
   * connections.
   * Set to half a second by default.
   */
  public int getTimeout()
  {
    return timeout;
  }

  /**
   * 
   * The maximum queue length; i.e. the maximum number of clients that
   * can be waiting to connect.
   * Set to 10 by default.
   */
  public int getBacklog()
  {
    return backlog;
  }

  /**
   * 
   * The thread group associated with client threads. Each member of the
   * thread group is a <code> ConnectionToClient </code>.
   */
  public ThreadGroup getClientThreadGroup()
  {
    return clientThreadGroup;
  }

  /**
   * 
   * Indicates if the listening thread is ready to stop.  Set to
   * false by default.
   */
  public boolean getReadyToStop()
  {
    return readyToStop;
  }

  public void delete()
  {}


  /**
   * CONSTRUCTOR ******************************************************
   * 
   * Constructs a new server.
   * 
   * @param port the port number on which to listen.
   */
  // line 72 "../../../src/AbstractServer.ump"
   public  AbstractServer(int port){
    this.port = port;

    this.clientThreadGroup =
      new ThreadGroup("ConnectionToClient threads")
      {
        // All uncaught exceptions in connection threads will
        // be sent to the clientException callback method.
        public void uncaughtException(
          Thread thread, Throwable exception)
        {
          clientException((ConnectionToClient)thread, exception);
        }
      };
  }


  /**
   * INSTANCE METHODS *************************************************
   * 
   * Begins the thread that waits for new clients.
   * If the server is already in listening mode, this
   * call has no effect.
   * 
   * @exception IOException if an I/O error occurs
   * when creating the server socket.
   */
  // line 100 "../../../src/AbstractServer.ump"
   public void listen() throws IOException{
    if (!isListening())
    {
      if (serverSocket == null)
      {
        serverSocket = new ServerSocket(getPort(), backlog);
      }

      serverSocket.setSoTimeout(timeout);
      readyToStop = false;
      connectionListener = new Thread(this);
      connectionListener.start();
    }
  }


  /**
   * 
   * Causes the server to stop accepting new connections.
   */
  // line 119 "../../../src/AbstractServer.ump"
   public void stopListening(){
    readyToStop = true;
  }


  /**
   * 
   * Closes the server socket and the connections with all clients.
   * Any exception thrown while closing a client is ignored.
   * If one wishes to catch these exceptions, then clients
   * should be individually closed before calling this method.
   * The method also stops listening if this thread is running.
   * If the server is already closed, this
   * call has no effect.
   * 
   * @exception IOException if an I/O error occurs while
   * closing the server socket.
   */
  // line 136 "../../../src/AbstractServer.ump"
   public void close() throws IOException{
    if (serverSocket == null)
      return;
    stopListening();

    try
    {
      serverSocket.close();
    }
    finally
    {
      synchronized (this)
      {
        // Close the client sockets of the already connected clients
        Thread[] clientThreadList = getClientConnections();
        for (int i=0; i<clientThreadList.length; i++)
        {
          try
          {
            ((ConnectionToClient)clientThreadList[i]).close();
          }
          // Ignore all exceptions when closing clients.
          catch(Exception ex) {}
        }
        serverSocket = null;
      }

      try
      {
        connectionListener.join(); // Wait for the end of listening thread.
      }
      catch(InterruptedException ex) {}
      catch(NullPointerException ex) {} // When thread already dead.

      serverClosed();
    }
  }


  /**
   * 
   * Sends a message to every client connected to the server.
   * This is merely a utility; a subclass may want to do some checks
   * before actually sending messages to all clients.
   * This method can be overriden, but if so it should still perform
   * the general function of sending to all clients, perhaps after some kind
   * of filtering is done. Any exception thrown while
   * sending the message to a particular client is ignored.
   * 
   * @param msg   Object The message to be sent
   */
  // line 186 "../../../src/AbstractServer.ump"
  public void sendToAllClients(String msg){
    Thread[] clientThreadList = getClientConnections();

    for (int i=0; i<clientThreadList.length; i++)
    {
      try
      {
        ((ConnectionToClient)clientThreadList[i]).sendToClient(msg);
      }
      catch (Exception ex) {}
    }
  }


  /**
   * ACCESSING METHODS ------------------------------------------------
   * 
   * Returns true if the server is ready to accept new clients.
   * 
   * @return true if the server is listening.
   */
  // line 208 "../../../src/AbstractServer.ump"
   public boolean isListening(){
    return (connectionListener != null);
  }


  /**
   * 
   * Returns true if the server is closed.
   * 
   * @return true if the server is closed.
   * @since version 2.2
   */
  // line 219 "../../../src/AbstractServer.ump"
   public boolean isClosed(){
    return (serverSocket == null);
  }


  /**
   * 
   * Counts the number of clients currently connected.
   * 
   * @return the number of clients currently connected.
   */
  // line 251 "../../../src/AbstractServer.ump"
   public int getNumberOfClients(){
    return clientThreadGroup.activeCount();
  }


  /**
   * RUN METHOD -------------------------------------------------------
   * 
   * Runs the listening thread that allows clients to connect.
   * Not to be called.
   */
  // line 262 "../../../src/AbstractServer.ump"
   public void run(){
    // call the hook method to notify that the server is starting
    serverStarted();

    try
    {
      // Repeatedly waits for a new client connection, accepts it, and
      // starts a new thread to handle data exchange.
      while(!readyToStop)
      {
        try
        {
          // Wait here for new connection attempts, or a timeout
          Socket clientSocket = serverSocket.accept();

          // When a client is accepted, create a thread to handle
          // the data exchange, then add it to thread group

          synchronized(this)
          {
            if (!isClosed())  // added in version 2.2
            {
              new ConnectionToClient(
                this.clientThreadGroup, clientSocket, this);
            }
          }
        }
        catch (InterruptedIOException exception)
        {
          // This will be thrown when a timeout occurs.
          // The server will continue to listen if not ready to stop.
        }
      }

      // call the hook method to notify that the server has stopped
      serverStopped();
    }
    catch (IOException exception)
    {
      if (!readyToStop)
      {
        // Closing the socket must have thrown a SocketException
        listeningException(exception);
      }
      else
      {
        serverStopped();
      }
    }
    finally
    {
      readyToStop = true;
      connectionListener = null;
    }
  }


  /**
   * METHODS DESIGNED TO BE OVERRIDDEN BY CONCRETE SUBCLASSES ---------
   * 
   * Hook method called each time a new client connection is
   * accepted. The default implementation does nothing.
   * This method does not have to be synchronized since only
   * one client can be accepted at a time.
   * 
   * @param client the connection connected to the client.
   */
  // line 328 "../../../src/AbstractServer.ump"
   protected void clientConnected(ConnectionToClient client){
    
  }


  /**
   * 
   * Hook method called when the server stops accepting
   * connections because an exception has been raised.
   * The default implementation does nothing.
   * This method may be overriden by subclasses.
   * 
   * @param exception the exception raised.
   */
  // line 360 "../../../src/AbstractServer.ump"
   protected void listeningException(Throwable exception){
    
  }


  /**
   * 
   * Hook method called when the server starts listening for
   * connections.  The default implementation does nothing.
   * The method may be overridden by subclasses.
   */
  // line 367 "../../../src/AbstractServer.ump"
   protected void serverStarted(){
    
  }


  /**
   * 
   * Hook method called when the server stops accepting
   * connections.  The default implementation
   * does nothing. This method may be overriden by subclasses.
   */
  // line 374 "../../../src/AbstractServer.ump"
   protected void serverStopped(){
    
  }


  /**
   * 
   * Hook method called when the server is clased.
   * The default implementation does nothing. This method may be
   * overriden by subclasses. When the server is closed while still
   * listening, serverStopped() will also be called.
   */
  // line 382 "../../../src/AbstractServer.ump"
   protected void serverClosed(){
    
  }


  /**
   * 
   * Handles a command sent from one client to the server.
   * This MUST be implemented by subclasses, who should respond to
   * messages.
   * This method is called by a synchronized method so it is also
   * implcitly synchronized.
   * 
   * @param msg   the message sent.
   * @param client the connection connected to the client that
   * sent the message.
   */
   protected abstract void handleMessageFromClient(String msg, ConnectionToClient client);


  public String toString()
  {
    return super.toString() + "["+
            "port" + ":" + getPort()+ "," +
            "timeout" + ":" + getTimeout()+ "," +
            "backlog" + ":" + getBacklog()+ "," +
            "readyToStop" + ":" + getReadyToStop()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "serverSocket" + "=" + (getServerSocket() != null ? !getServerSocket().equals(this)  ? getServerSocket().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "connectionListener" + "=" + (getConnectionListener() != null ? !getConnectionListener().equals(this)  ? getConnectionListener().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "clientThreadGroup" + "=" + (getClientThreadGroup() != null ? !getClientThreadGroup().equals(this)  ? getClientThreadGroup().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 234 "../../../src/AbstractServer.ump"
  synchronized final public Thread[] getClientConnections () 
  {
    Thread[] clientThreadList = new
      Thread[clientThreadGroup.activeCount()];

    clientThreadGroup.enumerate(clientThreadList);

    return clientThreadList;
  }

// line 337 "../../../src/AbstractServer.ump"
  synchronized protected void clientDisconnected (
    ConnectionToClient client) 
  {
    
  }

// line 349 "../../../src/AbstractServer.ump"
  synchronized protected void clientException (
    ConnectionToClient client, Throwable exception) 
  {
    
  }

// line 413 "../../../src/AbstractServer.ump"
  final synchronized void receiveMessageFromClient (
    String msg, ConnectionToClient client) 
  {
    this.handleMessageFromClient(msg, client);
  }

  
}