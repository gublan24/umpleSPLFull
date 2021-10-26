/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.builder;
import java.io.*;
import java.lang.reflect.*;
import java.net.*;

// line 363 "../../../../src/Builder_Code.ump"
public class DynamicClassPathLoader
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DynamicClassPathLoader()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 374 "../../../../src/Builder_Code.ump"
   public static  void addJar(String baseDirectory, String jarname) throws IOException{
    URL url = new URL("jar:file:///" + new File(baseDirectory).getAbsolutePath() + "/"+ jarname +"!/");
    DynamicClassPathLoader.addURL(url);
  }

  // line 380 "../../../../src/Builder_Code.ump"
   public static  void addURL(URL url) throws IOException{
    URLClassLoader sysloader = (URLClassLoader)ClassLoader.getSystemClassLoader();
    Class<?> sysclass = URLClassLoader.class;

    try
    {
      Method method = sysclass.getDeclaredMethod("addURL",parameters);
      method.setAccessible(true);
      method.invoke(sysloader,new Object[]{ url });
    }
    catch (Exception e)
    {
      throw new RuntimeException("Error, could not add URL to system classloader",e);
    }
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 370 "../../../../src/Builder_Code.ump"
  private static final Class<?>[] parameters = new Class[] {URL.class};

  
}