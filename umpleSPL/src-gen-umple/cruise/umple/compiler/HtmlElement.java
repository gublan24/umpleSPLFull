/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 253 "../../../../src/Generator_Html.ump"
public class HtmlElement implements IHtmlElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //HtmlElement Attributes
  private Element html;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public HtmlElement()
  {
    html = null;
    // line 257 "../../../../src/Generator_Html.ump"
    html = new Element(ITagsConstants.HTML, null);
    		html.addAttribute( new AttributeElement( IAttributesConstants.XLMNS, "http://www.w3.org/1999/xhtml"));
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 262 "../../../../src/Generator_Html.ump"
  public Element getElement(){
    return html;
  }

  // line 266 "../../../../src/Generator_Html.ump"
  public String htmlString(){
    return html.toString();
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}