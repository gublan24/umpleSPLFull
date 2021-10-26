/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 411 "../../../../src/Generator_Html.ump"
public class ParagraphElement implements IHtmlElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ParagraphElement Attributes
  private IHtmlElement parent;
  private Element par;
  private String text;
  private boolean small;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ParagraphElement(IHtmlElement aParent, String aText, boolean aSmall)
  {
    parent = aParent;
    par = null;
    text = aText;
    small = aSmall;
    // line 421 "../../../../src/Generator_Html.ump"
    if(aSmall) {
    			par = new Element(ITagsConstants.SMALL, new Element(ITagsConstants.P, parent!=null ? parent.getElement() : null));
    		} else {
    			par = new Element(ITagsConstants.P, parent!=null ? parent.getElement() : null);
    		}
    		par.appendTextContents(true,text);
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

  public boolean setSmall(boolean aSmall)
  {
    boolean wasSet = false;
    small = aSmall;
    wasSet = true;
    return wasSet;
  }

  public IHtmlElement getParent()
  {
    return parent;
  }

  public String getText()
  {
    return text;
  }

  public boolean getSmall()
  {
    return small;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isSmall()
  {
    return small;
  }

  public void delete()
  {}

  // line 430 "../../../../src/Generator_Html.ump"
   private void appendText(String text){
    if(!isNull(text)) {
			par.appendTextContents(true,text);
		}
  }

  // line 436 "../../../../src/Generator_Html.ump"
   private boolean isNull(String attr){
    return attr == null || attr.length() == 0;
  }

  // line 440 "../../../../src/Generator_Html.ump"
  public Element getElement(){
    return par;
  }

  // line 444 "../../../../src/Generator_Html.ump"
  public String htmlString(){
    return par.toString();
  }


  public String toString()
  {
    return super.toString() + "["+
            "text" + ":" + getText()+ "," +
            "small" + ":" + getSmall()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parent" + "=" + (getParent() != null ? !getParent().equals(this)  ? getParent().toString().replaceAll("  ","    ") : "this" : "null");
  }
}