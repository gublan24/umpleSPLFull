/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.stats;
import cruise.umple.util.*;
import java.io.File;

// line 14 "../../../../src/UmpleStats_Code.ump"
public class StatsMain
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StatsMain()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 23 "../../../../src/UmpleStats_Code.ump"
   public static  void main(String [] args){
    Thread.currentThread().setUncaughtExceptionHandler(new cruise.umple.docs.DocumenterMain.UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new cruise.umple.docs.DocumenterMain.UmpleExceptionHandler());
    console = "";
    
    if (args.length != 2)
    {
      println("Usage: java -jar umplestats.jar <results_file> <project_listing_file>");
      println("Example: java -jar umplestats.jar all.results projects.txt");
      println("Where, projects.txt is looks something like like:");
      println("---------\np1\nC:/dev/airline.ump\np2\nC:/dev/elevator.ump");
      return;
    }
    
    String outputFilename = args[0];
    String projectListings = SampleFileWriter.readContent(new File(args[1]));
    String[] allProjects = projectListings.split("\n");
    
    
    println("Analyzing umple applications:");
    MetricsCollector collector = new MetricsCollector();
    for(int i=1; i<allProjects.length; i+=2)
    {
      String projectName = allProjects[i-1];
      String inputFilename = allProjects[i];
      boolean didAnalyze = collector.analyze(projectName,inputFilename);
      String text = didAnalyze ? "success" : "failed";
      println("["+ inputFilename +"], " + text);
    }
    collector.save(outputFilename);
    println("Saved results to ["+ outputFilename +"]");
  }

  // line 55 "../../../../src/UmpleStats_Code.ump"
   private static  void println(String output){
    console += output + "\n";
    System.out.println(output);
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 19 "../../../../src/UmpleStats_Code.ump"
  public static String console ;

  
}