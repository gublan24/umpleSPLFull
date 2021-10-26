/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 448 "../../../../src/Generator_Html.ump"
public class HtmlDocument
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //HtmlDocument Attributes
  private boolean parentHtml;
  private IHtmlElement parent;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public HtmlDocument(boolean aParentHtml)
  {
    parentHtml = aParentHtml;
    parent = null;
    // line 453 "../../../../src/Generator_Html.ump"
    if(parentHtml) {
    			parent = new HtmlElement();
    		} else {
    			parent = new DivElement();
    		}
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean getParentHtml()
  {
    return parentHtml;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isParentHtml()
  {
    return parentHtml;
  }

  public void delete()
  {}

  // line 461 "../../../../src/Generator_Html.ump"
   public TableElement createTable(int aColumns){
    TableElement tbl = new TableElement(parent, aColumns);
		return tbl;
  }

  // line 466 "../../../../src/Generator_Html.ump"
   public ScriptElement createScript(String... aScriptTexts){
    StringBuffer stringBuffer = new StringBuffer(""); //$NON-NLS-1$
		for(String text: aScriptTexts){
			stringBuffer.append(text);
			stringBuffer.append("\n"); //$NON-NLS-1$
		}
		ScriptElement script = new ScriptElement(parent, stringBuffer.toString());
		return script;
  }

  // line 476 "../../../../src/Generator_Html.ump"
   public StyleElement createStyle(String... aStyleTexts){
    StringBuffer stringBuffer = new StringBuffer(""); //$NON-NLS-1$
		for(String text: aStyleTexts){
			stringBuffer.append(text);
			stringBuffer.append("\n"); //$NON-NLS-1$
		}
		StyleElement style = new StyleElement(parent, stringBuffer.toString());
		return style;
  }

  // line 486 "../../../../src/Generator_Html.ump"
  public ParagraphElement createParagraphElement(String aText, boolean aSmall){
    ParagraphElement p = new ParagraphElement(parent, aText, aSmall);
		return p;
  }

  // line 491 "../../../../src/Generator_Html.ump"
  public String htmlString(){
    return parent.htmlString();
  }

  // line 495 "../../../../src/Generator_Html.ump"
  public String toString(){
    return this.htmlString();
  }

}