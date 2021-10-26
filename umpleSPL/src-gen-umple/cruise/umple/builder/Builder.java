/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.builder;
import java.io.*;
import java.net.*;
import org.apache.tools.ant.*;
import java.util.*;
import java.util.stream.*;

// line 191 "../../../../src/Builder_Code.ump"
public class Builder
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.lineSeparator();

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Builder()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 204 "../../../../src/Builder_Code.ump"
   public URL compile(String directory, String jarname, String projectName, String javaTarget){
    String buildfile = createAntFile(directory, "build-"+ projectName +".xml", jarname, javaTarget);
    if (buildfile == null)
    {
      return null;
    }
    
    try {
      runAnt(buildfile);
      File jarfile = new File(directory + "//" + jarname) ;
      return jarfile.exists() ? new URL("jar:file:///" + jarfile.getAbsolutePath() + "!/") : null;
    } 
    catch (MalformedURLException e) 
    {
      return null;
    }
    catch (BuildException e2)
    {
      return null;
    }
  }

  // line 227 "../../../../src/Builder_Code.ump"
   public void load(String directory, String jarname){
    try {
      //String jarfile = "jar:file:///" + new File(directory).getAbsolutePath() + "/"+ jarname +"!/";
      DynamicClassPathLoader.addJar(directory, jarname);
    } 
    catch (IOException e) 
    {
      throw new RuntimeException("Unable to load application jar",e);
    }
  }

  // line 239 "../../../../src/Builder_Code.ump"
   public boolean runAnt(String buildFilename){
    return runAnt(buildFilename, "", Collections.<String, String>emptyMap());
  }

  // line 315 "../../../../src/Builder_Code.ump"
   public void runAntOLD(String buildFilename){
    File buildFile = new File(buildFilename);
    Project p = new Project();
    p.setUserProperty("ant.file", buildFile.getAbsolutePath());
    p.init();
    ProjectHelper helper = ProjectHelper.getProjectHelper();
    p.addReference("ant.projectHelper", helper);
    helper.parse(p, buildFile);
    p.executeTarget(p.getDefaultTarget());
  }

  // line 328 "../../../../src/Builder_Code.ump"
   private String createAntFile(String baseDirectory, String buildname, String jarname, String javaTarget){
    String antScript = "" +
      "<project name=\"runtime-compiler\" default=\"go\" basedir=\".\">" + NL +
      "  <target name=\"clean\">" + NL +
      "    <delete file=\""+ jarname +"\" failonerror=\"false\" />" + NL +
      "    <delete failonerror=\"false\">" + NL +
      "        <fileset dir=\".\" includes=\"**/*.class\"/>" + NL +
      "      </delete>" + NL +
      "  </target>" + NL +
      "  <target name=\"compile\">" + NL +
      "    <javac debug=\"true\" debuglevel=\"source,lines,vars\" includeAntRuntime=\"false\" destdir=\".\" srcdir=\".\" target=\""+ javaTarget +"\">" + NL +
      "      <exclude name=\"**/.svn\"/>" + NL +
      "    </javac>" + NL +
      "  </target>" + NL +
      "  <target name=\"jar\">" + NL +
      "    <jar destfile=\""+ jarname +"\" basedir=\".\" excludes=\"**/.svn\" />" + NL +
      "  </target>" + NL +
      "  <target name=\"go\" depends=\"clean,compile,jar\" />" + NL +       
      "</project>";
    
    try {
      String buildfile = baseDirectory + "/" + buildname;
      BufferedWriter out = new BufferedWriter(new FileWriter(buildfile));
      out.write(antScript);
      out.close();
      return buildfile;
    } 
    catch (IOException e) 
    {
      return null;
    }
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 242 "../../../../src/Builder_Code.ump"
  public boolean runAnt (String buildFilename, final String target) 
  {
    return runAnt(buildFilename, target, Collections.<String, String>emptyMap());
  }

// line 247 "../../../../src/Builder_Code.ump"
  public boolean runAnt (String buildFilename, final String target, final Map<String, String> options) 
  {
    // build string parameters:

    String exec = "ant";
    if (System.getProperty("os.name").startsWith("Window")){
    	exec = "ant.bat";
    }
    
    final String buildFilePath = (new File(buildFilename)).getAbsolutePath();
    String optionStr = "";
    if (options != null) {
      final List<String> optionList = new ArrayList<>(options.size() * 20);
      for (Map.Entry<String, String> e : options.entrySet()) {
        optionList.add("-D" + e.getKey().trim() + (e.getValue().trim().length() > 0 ? "=" + e.getValue().trim() : ""));
      }
      
      optionStr = String.join(" ", optionList);
    }
    
    List<String> cmd = Arrays.asList(exec, "-f", buildFilePath, optionStr);
    // remove empty parameters
    cmd = cmd.stream().map(String::trim).filter(s -> !"".equals(s)).collect(Collectors.toList());
    
    Process p = null;
    try
    {
      ProcessBuilder pb = new ProcessBuilder(cmd);
      
      p = pb.start();
      p.waitFor();

      if (p.exitValue() != 0) {
        try (BufferedReader out = new BufferedReader(new InputStreamReader(p.getInputStream()));
             BufferedReader err = new BufferedReader(new InputStreamReader(p.getErrorStream()))) {
          final StringBuilder outSB = new StringBuilder();
          
          String line;
          while ((line = out.readLine()) != null) {
            outSB.append(line);
            outSB.append(NL);
          }

          final StringBuilder errSB = new StringBuilder();
          while ((line = err.readLine()) != null) {
            errSB.append(line);
            errSB.append(NL);
          }

          System.out.println("== Ant Task failed ==");
          System.out.println("System.out => " + NL + outSB);
          System.err.println("System.err => " + NL + errSB);
        }
        
      return false;
    }

      return true;  
    } catch (IOException | InterruptedException e) {
      System.err.println("Failed to run Ant: " + e.getMessage());
      return false;
    } finally {
      if (p != null) p.destroy();
    }
  }

  
}