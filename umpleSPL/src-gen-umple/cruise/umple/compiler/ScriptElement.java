/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 366 "../../../../src/Generator_Html.ump"
public class ScriptElement implements IHtmlElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ScriptElement Attributes
  private IHtmlElement parent;
  private Element script;
  private String scriptText;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ScriptElement(IHtmlElement aParent, String aScriptText)
  {
    parent = aParent;
    script = null;
    scriptText = aScriptText;
    // line 375 "../../../../src/Generator_Html.ump"
    script = new Element(ITagsConstants.SCRIPT, parent!=null ? parent.getElement() : null);
    		script.addAttribute( new AttributeElement(IAttributesConstants.TYPE, "text/javascript"));
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setParent(IHtmlElement aParent)
  {
    boolean wasSet = false;
    parent = aParent;
    wasSet = true;
    return wasSet;
  }

  public IHtmlElement getParent()
  {
    return parent;
  }

  public String getScriptText()
  {
    return scriptText;
  }

  public void delete()
  {}

  // line 380 "../../../../src/Generator_Html.ump"
  public Element getElement(){
    return script;
  }

  // line 384 "../../../../src/Generator_Html.ump"
  public String htmlString(){
    return script.toString();
  }


  public String toString()
  {
    return super.toString() + "["+
            "scriptText" + ":" + getScriptText()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parent" + "=" + (getParent() != null ? !getParent().equals(this)  ? getParent().toString().replaceAll("  ","    ") : "this" : "null");
  }
}