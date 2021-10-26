/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.util;

public class ConsoleTracer
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static ConsoleTracer theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private ConsoleTracer()
  {
    handle("Time,Thread,UmpleFile,LineNumber,Class,Object,Operation,Name,Value");
  }

  public static ConsoleTracer getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new ConsoleTracer();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  public static void handle(String message)
  {
     System.err.println(message);
  }
static{getInstance();}
  
}