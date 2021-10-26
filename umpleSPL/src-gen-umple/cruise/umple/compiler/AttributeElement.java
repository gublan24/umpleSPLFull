/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 65 "../../../../src/Generator_Html.ump"
public class AttributeElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AttributeElement Attributes
  private String name;
  private String value;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AttributeElement(String aName, String aValue)
  {
    name = aName;
    value = aValue;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getValue()
  {
    return value;
  }

  public void delete()
  {}

  // line 70 "../../../../src/Generator_Html.ump"
  public String toString(){
    StringBuffer stringBuffer = new StringBuffer(" "); //$NON-NLS-1$
		stringBuffer.append(getName());
		if(getValue() == null){
			return stringBuffer.toString();
		}
		return stringBuffer.append("=\"").append(getValue()).append("\"").toString(); //$NON-NLS-1$ //$NON-NLS-2$
  }

}