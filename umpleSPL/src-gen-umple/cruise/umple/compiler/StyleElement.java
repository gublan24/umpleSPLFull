/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 389 "../../../../src/Generator_Html.ump"
public class StyleElement implements IHtmlElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StyleElement Attributes
  private IHtmlElement parent;
  private Element style;
  private String styleText;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StyleElement(IHtmlElement aParent, String aStyleText)
  {
    parent = aParent;
    style = null;
    styleText = aStyleText;
    // line 398 "../../../../src/Generator_Html.ump"
    style =new Element(ITagsConstants.STYLE, parent!=null ? parent.getElement() : null);
    		style.addAttribute(new AttributeElement(IAttributesConstants.TYPE, "text/css"));
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

  public String getStyleText()
  {
    return styleText;
  }

  public void delete()
  {}

  // line 403 "../../../../src/Generator_Html.ump"
   public Element getElement(){
    return style;
  }

  // line 407 "../../../../src/Generator_Html.ump"
   public String htmlString(){
    return style.toString();
  }


  public String toString()
  {
    return super.toString() + "["+
            "styleText" + ":" + getStyleText()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parent" + "=" + (getParent() != null ? !getParent().equals(this)  ? getParent().toString().replaceAll("  ","    ") : "this" : "null");
  }
}