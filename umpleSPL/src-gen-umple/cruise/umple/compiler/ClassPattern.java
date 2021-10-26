/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * A pattern object is used to persist Patentable information for a class elemnt such as
 * abstract, delegate, immutable, etc.
 */
// line 37 "../../../../src/Generator_UmpleModelWalker.ump"
public class ClassPattern
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassPattern Attributes
  private UmpleClass classPattern;
  private String pattern;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ClassPattern(UmpleClass aClassPattern, String aPattern)
  {
    classPattern = aClassPattern;
    pattern = aPattern;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setClassPattern(UmpleClass aClassPattern)
  {
    boolean wasSet = false;
    classPattern = aClassPattern;
    wasSet = true;
    return wasSet;
  }

  public boolean setPattern(String aPattern)
  {
    boolean wasSet = false;
    pattern = aPattern;
    wasSet = true;
    return wasSet;
  }

  public UmpleClass getClassPattern()
  {
    return classPattern;
  }

  public String getPattern()
  {
    return pattern;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "pattern" + ":" + getPattern()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "classPattern" + "=" + (getClassPattern() != null ? !getClassPattern().equals(this)  ? getClassPattern().toString().replaceAll("  ","    ") : "this" : "null");
  }
}