/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 270 "../../../../src/Generator_Html.ump"
public class DivElement implements IHtmlElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DivElement Attributes
  private Element div;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DivElement()
  {
    div = null;
    // line 274 "../../../../src/Generator_Html.ump"
    div = new Element(ITagsConstants.DIV, null);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 278 "../../../../src/Generator_Html.ump"
  public Element getElement(){
    return div;
  }

  // line 282 "../../../../src/Generator_Html.ump"
  public String htmlString(){
    return div.toString();
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}