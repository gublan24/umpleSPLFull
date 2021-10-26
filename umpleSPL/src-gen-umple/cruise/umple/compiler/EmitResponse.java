/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 80 "../../../../src/Template.ump"
public class EmitResponse
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EmitResponse Attributes
  private StringBuilder javaCode;
  private StringBuilder cppCode;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EmitResponse()
  {
    javaCode = new StringBuilder();
    cppCode = new StringBuilder();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setJavaCode(StringBuilder aJavaCode)
  {
    boolean wasSet = false;
    javaCode = aJavaCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setCppCode(StringBuilder aCppCode)
  {
    boolean wasSet = false;
    cppCode = aCppCode;
    wasSet = true;
    return wasSet;
  }

  public StringBuilder getJavaCode()
  {
    return javaCode;
  }

  public StringBuilder getCppCode()
  {
    return cppCode;
  }

  public void delete()
  {}

  // line 85 "../../../../src/Template.ump"
  public StringBuilder getCode(String lang){
    if(lang.equalsIgnoreCase("Java")) {  
  			return javaCode;
  		} else if(lang.equalsIgnoreCase("Cpp")) {
  			return cppCode;     
	  	}
	  	return null;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "javaCode" + "=" + (getJavaCode() != null ? !getJavaCode().equals(this)  ? getJavaCode().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "cppCode" + "=" + (getCppCode() != null ? !getCppCode().equals(this)  ? getCppCode().toString().replaceAll("  ","    ") : "this" : "null");
  }
}