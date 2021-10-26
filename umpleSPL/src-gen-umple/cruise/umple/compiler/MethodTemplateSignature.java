/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 455 "../../../../src/Umple_Code_Trait.ump"
// line 847 "../../../../src/Umple.ump"
public class MethodTemplateSignature
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MethodTemplateSignature Attributes
  private String modifier;
  private String alias;

  //MethodTemplateSignature Associations
  private Method method;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MethodTemplateSignature(String aModifier, String aAlias, Method aMethod)
  {
    modifier = aModifier;
    alias = aAlias;
    if (!setMethod(aMethod))
    {
      throw new RuntimeException("Unable to create MethodTemplateSignature due to aMethod. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setModifier(String aModifier)
  {
    boolean wasSet = false;
    modifier = aModifier;
    wasSet = true;
    return wasSet;
  }

  public boolean setAlias(String aAlias)
  {
    boolean wasSet = false;
    alias = aAlias;
    wasSet = true;
    return wasSet;
  }

  public String getModifier()
  {
    return modifier;
  }

  public String getAlias()
  {
    return alias;
  }
  /* Code from template association_GetOne */
  public Method getMethod()
  {
    return method;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setMethod(Method aNewMethod)
  {
    boolean wasSet = false;
    if (aNewMethod != null)
    {
      method = aNewMethod;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    method = null;
  }

  // line 458 "../../../../src/Umple_Code_Trait.ump"
  public  MethodTemplateSignature(MethodTemplateSignature another){
    this.modifier = another.getModifier();
    this.alias = another.getAlias();
    this.method = new Method(another.getMethod());
  }


  public String toString()
  {
    return super.toString() + "["+
            "modifier" + ":" + getModifier()+ "," +
            "alias" + ":" + getAlias()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "method = "+(getMethod()!=null?Integer.toHexString(System.identityHashCode(getMethod())):"null");
  }
}