/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.io.Serializable;

// line 1318 "../../../../../UmpleTLTemplates/Core.ump"
public class GenAspectableReturnBody extends GenBody
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenAspectableReturnBody Attributes
  private String variable;
  private String returnType;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenAspectableReturnBody(String aBody, String aVariable, String aReturnType)
  {
    super(aBody);
    variable = aVariable;
    returnType = aReturnType;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setVariable(String aVariable)
  {
    boolean wasSet = false;
    variable = aVariable;
    wasSet = true;
    return wasSet;
  }

  public boolean setReturnType(String aReturnType)
  {
    boolean wasSet = false;
    returnType = aReturnType;
    wasSet = true;
    return wasSet;
  }

  public String getVariable()
  {
    return variable;
  }

  public String getReturnType()
  {
    return returnType;
  }

  public void delete()
  {
    super.delete();
  }

  // line 1322 "../../../../../UmpleTLTemplates/Core.ump"
  public String returnBody(){
    return "return "+ getBody()+ ";";
  }

  // line 1326 "../../../../../UmpleTLTemplates/Core.ump"
  public String assignBody(){
    return getReturnType()+ " "+ getVariable()+ "= "+  getBody()+ ";";
  }

  // line 1330 "../../../../../UmpleTLTemplates/Core.ump"
  public String returnVariable(){
    return "return "+ getVariable()+ ";";
  }


  public String toString()
  {
    return super.toString() + "["+
            "variable" + ":" + getVariable()+ "," +
            "returnType" + ":" + getReturnType()+ "]";
  }
}