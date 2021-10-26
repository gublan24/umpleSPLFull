/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;

// line 9 "../../../../src/AlloySignature.ump"
public class OpenStatement extends Statement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //OpenStatement Attributes
  private String packageName;
  private String className;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public OpenStatement(String aPackageName, String aClassName)
  {
    super();
    packageName = aPackageName;
    className = aClassName;
    // line 16 "../../../../src/AlloySignature.ump"
    name = "open";
    // END OF UMPLE AFTER INJECTION
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

  public boolean setClassName(String aClassName)
  {
    boolean wasSet = false;
    className = aClassName;
    wasSet = true;
    return wasSet;
  }

  public String getPackageName()
  {
    return packageName;
  }

  public String getClassName()
  {
    return className;
  }

  public void delete()
  {
    super.delete();
  }

  // line 21 "../../../../src/AlloySignature.ump"
   public String print(){
    return name+" util/"+packageName+"["+className+"]\n";
  }


  public String toString()
  {
    return super.toString() + "["+
            "packageName" + ":" + getPackageName()+ "," +
            "className" + ":" + getClassName()+ "]";
  }
}