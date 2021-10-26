/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple;
import cruise.umple.compiler.*;
import cruise.umple.compiler.exceptions.*;
import cruise.umple.builder.*;
import cruise.umple.util.*;
import java.net.*;
import java.io.*;
import java.net.InetAddress;

/**
 * Main program for a jar that can inject calls to Umple at runtime
 */
// line 609 "../../../src/Main_Code.ump"
public class UmpleRunMain
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleRunMain()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 622 "../../../src/Main_Code.ump"
   public static  void main(String [] args){
    Thread.currentThread().setUncaughtExceptionHandler(new cruise.umple.docs.DocumenterMain.UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new cruise.umple.docs.DocumenterMain.UmpleExceptionHandler());
    if (args.length < 2)
    {
      System.out.println("Usage: java -jar umplerun.jar <umple_file> <cmd_file>\nExample: java -jar umple.jar airline.ump airline.cmd");
      return;
    }

    String filename = args[0];
    String cmdFilename = args[1];
    UmpleFile umpleFile = new UmpleFile(filename);
    UmpleModel model = new UmpleModel(umpleFile);
    boolean shouldDebug = args.length >= 3 && args[2].equals("--debug");
    boolean shouldCompile = !shouldDebug;

    try
    {
      if (shouldCompile)
      {
        System.out.print("Compiling "+ filename +"... ");
        model.run();
        System.out.println("success.");
      }
      else
      {
        System.out.print("Skipping compilation, entering debug mode");
      }

      System.out.print("Building model... ");
      Builder b = new Builder();
      URL jarfile = b.compile(".",umpleFile.getSimpleFileName() + ".jar",umpleFile.getSimpleFileName(),"1.6");

      if (jarfile == null)
      {
        System.out.println("failed");
        return;
      }
      System.out.println("success.");

      System.out.print("Loading model into memory... ");
      URL urls [] = { jarfile };
      URLClassLoader cl = new URLClassLoader(urls);
      System.out.println("success.");

      Command cmd = new Command(cl);

      System.out.println("Running commands:");
      boolean isFirst = true;
      for (String input : SampleFileWriter.readContent(new File(cmdFilename)).split("\n"))
      {
        if (isFirst)
        {
          cmd.addAttributes(input);
          isFirst = false;
          continue;
        }
        cmd.exec(input);
        for (String message : cmd.popMessages())
        {
          System.out.println("  " + message);
        }
      }

      System.out.println("Done.");
    }
    catch(Exception e)
    {
      System.out.println("failed.");
      System.err.print(e.getMessage());
    }
  }

}