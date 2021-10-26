/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * A root class elemnt. It is used to backtrack the parent package when walking through
 * an elemnt (@see IWalker, UmpleModelVisitor)
 */
// line 24 "../../../../src/Generator_UmpleModelWalker.ump"
public class Package
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Package Attributes
  private String packageName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Package(String aPackageName)
  {
    packageName = aPackageName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPackageName(String aPackageName)
  {
    boolean wasSet = false;
    packageName = aPackageName;
    wasSet = true;
    return wasSet;
  }

  public String getPackageName()
  {
    return packageName;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "packageName" + ":" + getPackageName()+ "]";
  }
}