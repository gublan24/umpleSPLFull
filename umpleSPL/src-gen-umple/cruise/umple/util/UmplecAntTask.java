/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.util;
import org.apache.tools.ant.*;
import cruise.umple.UmpleConsoleConfig;
import cruise.umple.UmpleConsoleMain;
import java.util.*;
import java.util.stream.*;
import java.io.File;
import java.nio.file.*;

/**
 * 
 * Defines an Ant task to use in Ant-like build environments
 */
// line 9 "../../../../src/Ant.ump"
public class UmplecAntTask extends Task
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmplecAntTask Attributes
  private UmpleConsoleConfig cfg;
  private List<LinkedFile> linkedFiles;
  private Path cwd;
  private Optional<Path> srcPath;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmplecAntTask()
  {
    super();
    cfg = new UmpleConsoleConfig("");
    linkedFiles = new ArrayList<>(4);
    cwd = Paths.get(System.getProperty("user.dir"));
    srcPath = Optional.empty();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * The method executing the task
   */
  // line 22 "../../../../src/Ant.ump"
  public void execute() throws BuildException{
    if (!srcPath.isPresent()) {
      throw new BuildException("src was not set.");
    }

    final Path srcDir = this.srcPath.get().getParent();
    if (srcDir == null) {
      throw new BuildException("src does not have a parent folder {src=" + this.srcPath.get() + "}");
    }

    this.linkedFiles.stream().map(LinkedFile::getSrc).map(p -> srcDir.relativize(p)).map(Path::toString).forEach(this.cfg::addLinkedFile);

    UmpleConsoleMain console = new UmpleConsoleMain(this.cfg);
    int res = console.runConsole();

    if (res != 0) {
      throw new BuildException("Error running Umple task: " + res + ".");
    }
  }

  // line 49 "../../../../src/Ant.ump"
   public void setSrc(File aSrc){
    srcPath = Optional.of(aSrc.toPath());

    this.cfg.setUmpleFile(cwd.relativize(srcPath.get()).toString());
  }

  // line 55 "../../../../src/Ant.ump"
   public void setLinkedFile(File linkedFile){
    LinkedFile lf = createLinkedFile();
    lf.setSrc(linkedFile);
    linkedFiles.add(lf);
  }

  // line 61 "../../../../src/Ant.ump"
   public void setGenerate(String generate){
    this.cfg.setGenerate(generate);
  }

  // line 65 "../../../../src/Ant.ump"
   public void setOverride(boolean override){
    this.cfg.setOverride(override);
  }

  // line 69 "../../../../src/Ant.ump"
   public void setDest(File dest){
    this.cfg.setPath(dest.getAbsolutePath());
  }

  // line 73 "../../../../src/Ant.ump"
   public LinkedFile createLinkedFile(){
    LinkedFile f = new LinkedFile();
    linkedFiles.add(f);
    return f;
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 78 "../../../../src/Ant.ump"
  protected static class LinkedFile 
  {
    private Path p = null;

    public void setSrc(File f) { this.p = f.toPath(); }
    public Path getSrc() { return this.p; } 

    public String toString() {
      return "LinkedFile{src=" + p.toString() + "}";
    }
  }

  
}