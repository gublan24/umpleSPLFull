/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

// line 59 "../../../../src/SimpleMetrics_CodeLines.ump"
public class CodeMetrics extends SimpleMetricsGenerator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CodeMetrics Attributes
  private StringBuilder resultCode;
  private UmpleModel model;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CodeMetrics()
  {
    super();
    resultCode = new StringBuilder();
    model = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setResultCode(StringBuilder aResultCode)
  {
    boolean wasSet = false;
    resultCode = aResultCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setModel(UmpleModel aModel)
  {
    boolean wasSet = false;
    model = aModel;
    wasSet = true;
    return wasSet;
  }

  public StringBuilder getResultCode()
  {
    return resultCode;
  }

  public UmpleModel getModel()
  {
    return model;
  }

  public void delete()
  {
    super.delete();
  }

  // line 68 "../../../../src/SimpleMetrics_CodeLines.ump"
  public void calculate(){
    int totalLineCount = 0; //count lines per file
    int totalLoc = 0;
    int totalComments = 0;
    int totalBlanks = 0;
    CountLines cl = new CountLines();
  
    java.util.Set<String> allUmpFiles = new java.util.HashSet<String>();
    String fn = null;
  
    // Iterate through all the classes in the system, gathering statistics
    for (UmpleClass uClass : model.getUmpleClasses()) {
      // Loop through all the places where parts of this class were
      // found in the code, gathering all the files
      for (Position p : uClass.getPositions()) {
        fn=p.getFilename();
        allUmpFiles.add(fn); // allUmpFiles is a set, so duplicates are removed
      }
    }

    resultCode.append( "\n\n\n");
    resultCode.append("<h1>Code Line Measures</h1>\n");      
    
    java.util.List<String>title  = new java.util.ArrayList<String>();
    title.add(" file                                                     ");
    title.add("    LOC    ");
    title.add(" Comment Lines ");
    title.add(" Blank Lines ");
    title.add(" Total of Lines ");
      
    resultCode.append("<table border=\"1\"><tbody>\n");
      
    resultCode.append("<tr>");
    for (int i=0;i<title.size();i++) {
      resultCode.append("<td>"+title.get(i)+"</td>");
    }
    resultCode.append("</tr>");
      
    
    for( String fn1 : allUmpFiles) {
      int fileLineCount = 0;
      resultCode.append("<tr>");
      
      try {
        cl = countLinesInFile(fn1);
            
        resultCode.append( "<td>"+fn1+"</td>");
        resultCode.append( "<td>"+cl.getCountCode()+"</td>");
        resultCode.append( "<td>"+cl.getCountComments()+"</td>");
        resultCode.append( "<td>"+cl.getCountBlanks()+"</td>");
        resultCode.append( "<td>"+cl.getCountLines()+"</td>");
      } catch (java.io.IOException e) {
        try {
          cl = countLinesInFile(model.getUmpleFile().getPath()+java.io.File.separator+fn1);
        
          resultCode.append( "<td>"+fn1+"</td>");
          resultCode.append( "<td>"+cl.getCountCode()+"</td>");
          resultCode.append( "<td>"+cl.getCountComments()+"</td>");
          resultCode.append( "<td>"+cl.getCountBlanks()+"</td>");
          resultCode.append( "<td>"+cl.getCountLines()+"</td>");
          
        } catch (java.io.IOException e2) {  
          fileLineCount = 0;
          cl.setCountLines(0);
          resultCode.append("Unreadable\n");
        } 
      }
      totalLoc += cl.getCountCode();
      totalComments += cl.getCountComments();
      totalBlanks += cl.getCountBlanks();
      totalLineCount += cl.getCountLines();  
            
      resultCode.append("</tr>");
    }
    resultCode.append("</tbody></table>");
    resultCode.append("\n\n<ul>");
    resultCode.append("\n  <li>Total Line of Code = "+totalLoc);
    resultCode.append("\n  <li>Total Comment Lines  = "+totalComments );
    resultCode.append("\n  <li>Total Blank Lines  = "+totalBlanks);
    resultCode.append("\n  <li>Total of Lines = "+totalLineCount + "\n");
    resultCode.append("</ul>\n\n");
    
    return;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "resultCode" + "=" + (getResultCode() != null ? !getResultCode().equals(this)  ? getResultCode().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 152 "../../../../src/SimpleMetrics_CodeLines.ump"
  CountLines countLinesInFile (String filename)throws java.io.IOException 
  {
    CountLines cl = new CountLines();
     cl.setCountLines(0);
     cl.setCountComments(0);
     cl.setCountBlanks(0);
     cl.setCountCode(0);
  
      boolean insideblock=false;
          int ind1,ind2,ind3;
          java.io.FileReader arq = new java.io.FileReader(filename);
          java.io.BufferedReader lerArq = new java.io.BufferedReader(arq);
          String orgline;
          String line = lerArq.readLine(); // Read first line of a file
          
          while (line != null) {
          ind1=-1;
          ind2=-1;
          ind3=-1;
          
          cl.incCountLines();
          line = line.replaceAll(" ",""); // Eliminate all spaces
          line = line.replaceAll("\t",""); // Eliminate all tabs \t
           
          // destroy quoted/string          
          int pos1, pos2 = -1;
          if ( (pos1 = line.indexOf("\"")) >= 0 ){
            if ( ( (pos2= line.indexOf("\"",pos1+1)) > 0 ) && (pos2 > pos1) ){
             line = line.substring( 0, pos1+1 ) + line.substring( pos1 + (pos2-pos1), line.length() ) ;
            }
          }

          if ( line.length() == 0){
            cl.incCountBlanks();

          }else{    
      
            //comment in one line
            if ( ((ind1 = line.indexOf("//")) != -1) && (!insideblock) ) {
              cl.incCountComments();
              line = line.substring(0,2); // consume the line to avoid parsing mistakes

            }
      
            // block of comments
            if (insideblock){
              cl.incCountComments();
              if ( (ind3 = line.indexOf("*/")) != -1 ) {
                insideblock=false;
              }
            } 
            else if ( ((ind2 = line.indexOf("/*")) != -1) && (!insideblock) )
            {
              cl.incCountComments();
              if ( (ind3 = line.indexOf("*/")) == -1 ) {
                insideblock = true;
              }
            }
      
            // line of code
            if  ( ( (!insideblock) && (  (ind1 > 0) || (ind2 > 0) ) )|| // ind1 check "//"  and ind 2 check "/*"
                   ( (ind3 > 0) && (ind3 < line.length()-2) ) || // close braces before code line 
                     ( (ind1==-1) && (ind2==-1) && (ind3==-1) && (!insideblock)  ) //
                 )  {
                cl.incCountCode();     
            }
          }
            line = lerArq.readLine(); // get next line or value null if doesn't have another one
          } // close while (line != null)
          arq.close();
       return cl;
  }

  
}