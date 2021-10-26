/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;
import java.io.IOException;
import java.io.File;
import java.util.zip.ZipEntry;
import java.net.URL;

// line 1299 "../../../../src/Main_Code.ump"
public class CompileDate
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CompileDate()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * From https://stackoverflow.com/questions/3336392/java-print-time-of-last-compilation
   */
  // line 1312 "../../../../src/Main_Code.ump"
   public static  Date getClassBuildTime(){
    Date d = null;
    Class<?> currentClass = new Object() {}.getClass().getEnclosingClass();
    URL resource = currentClass.getResource(currentClass.getSimpleName() + ".class");
    if (resource != null) {
        if (resource.getProtocol().equals("file")) {
            try {
                d = new Date(new File(resource.toURI()).lastModified());
            } catch (URISyntaxException ignored) { }
        } else if (resource.getProtocol().equals("jar")) {
            String path = resource.getPath();
            d = new Date( new File(path.substring(5, path.indexOf("!"))).lastModified() );    
        } else if (resource.getProtocol().equals("zip")) {
            String path = resource.getPath();
            File jarFileOnDisk = new File(path.substring(0, path.indexOf("!")));
            //long jfodLastModifiedLong = jarFileOnDisk.lastModified ();
            //Date jfodLasModifiedDate = new Date(jfodLastModifiedLong);
            try(JarFile jf = new JarFile (jarFileOnDisk)) {
                ZipEntry ze = jf.getEntry (path.substring(path.indexOf("!") + 2));//Skip the ! and the /
                long zeTimeLong = ze.getTime ();
                Date zeTimeDate = new Date(zeTimeLong);
                d = zeTimeDate;
            } catch (IOException|RuntimeException ignored) { }
        }
    }
    return d;
  }

}