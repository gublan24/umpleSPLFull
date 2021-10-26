/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 286 "../../../../src/Generator_Html.ump"
public class TableElement implements IHtmlElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TableElement Attributes
  private IHtmlElement parent;
  private int columns;
  private int index;
  private List<String> titles;
  private Element table;
  private Element tableBody;
  private Element headersRow;
  private String id;
  private String bodyId;
  private String cssClass;
  private int border;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TableElement(IHtmlElement aParent, int aColumns)
  {
    parent = aParent;
    columns = aColumns;
    index = 0;
    titles = new ArrayList<String>();
    table = null;
    tableBody = null;
    headersRow = null;
    resetId();
    resetBodyId();
    resetCssClass();
    resetBorder();
    // line 305 "../../../../src/Generator_Html.ump"
    table = new Element(ITagsConstants.TABLE, parent!=null ? parent.getElement() : null);
    		tableBody = new Element(ITagsConstants.TBODY,table);		
    		headersRow = new Element(ITagsConstants.TR, tableBody);
    		headersRow.addAttribute(new AttributeElement(IAttributesConstants.ID, "headersRow"));
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
  /* Code from template attribute_SetDefaulted */
  public boolean setId(String aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    // line 312 "../../../../src/Generator_Html.ump"
    if(!isNull(id)) {
    			table.addAttribute( new AttributeElement(IAttributesConstants.ID, id));
    		}
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean resetId()
  {
    boolean wasReset = false;
    id = getDefaultId();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setBodyId(String aBodyId)
  {
    boolean wasSet = false;
    bodyId = aBodyId;
    wasSet = true;
    // line 318 "../../../../src/Generator_Html.ump"
    if(!isNull(bodyId)) {
    			tableBody.addAttribute( new AttributeElement(IAttributesConstants.ID, bodyId));
    		}
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean resetBodyId()
  {
    boolean wasReset = false;
    bodyId = getDefaultBodyId();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setCssClass(String aCssClass)
  {
    boolean wasSet = false;
    cssClass = aCssClass;
    wasSet = true;
    // line 324 "../../../../src/Generator_Html.ump"
    if(!isNull(cssClass)) {
    			table.addAttribute( new AttributeElement(IAttributesConstants.ATTRIBUTE_CLASS, cssClass));
    		}
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean resetCssClass()
  {
    boolean wasReset = false;
    cssClass = getDefaultCssClass();
    wasReset = true;
    return wasReset;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setBorder(int aBorder)
  {
    boolean wasSet = false;
    border = aBorder;
    wasSet = true;
    // line 330 "../../../../src/Generator_Html.ump"
    table.addAttribute( new AttributeElement(IAttributesConstants.BORDER, String.valueOf(border)));
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean resetBorder()
  {
    boolean wasReset = false;
    border = getDefaultBorder();
    wasReset = true;
    return wasReset;
  }

  public IHtmlElement getParent()
  {
    return parent;
  }

  public int getColumns()
  {
    return columns;
  }

  public String getId()
  {
    return id;
  }
  /* Code from template attribute_GetDefaulted */
  public String getDefaultId()
  {
    return "";
  }

  public String getBodyId()
  {
    return bodyId;
  }
  /* Code from template attribute_GetDefaulted */
  public String getDefaultBodyId()
  {
    return "";
  }

  public String getCssClass()
  {
    return cssClass;
  }
  /* Code from template attribute_GetDefaulted */
  public String getDefaultCssClass()
  {
    return "";
  }

  /**
   * defaulted String cssHeadersRow = "";defaulted String cssHeadersColumn = "";
   */
  public int getBorder()
  {
    return border;
  }
  /* Code from template attribute_GetDefaulted */
  public int getDefaultBorder()
  {
    return 0;
  }

  public void delete()
  {}

  // line 334 "../../../../src/Generator_Html.ump"
   public void addRow(String [] rowData){
    Element tableRow = new Element(ITagsConstants.TR, tableBody);
		tableRow.addAttribute(new AttributeElement(IAttributesConstants.ID, "TableRow"+index));
		for(int cellIndex=0 ;cellIndex<columns; cellIndex++){
			Element td = new Element(ITagsConstants.TD, tableRow);
			td.appendText(rowData[cellIndex]);
		}
  }

  // line 354 "../../../../src/Generator_Html.ump"
   private boolean isNull(String attr){
    return attr == null || attr.length() == 0;
  }

  // line 358 "../../../../src/Generator_Html.ump"
  public Element getElement(){
    return table;
  }

  // line 362 "../../../../src/Generator_Html.ump"
  public String htmlString(){
    return table.toString();
  }


  public String toString()
  {
    return super.toString() + "["+
            "columns" + ":" + getColumns()+ "," +
            "id" + ":" + getId()+ "," +
            "bodyId" + ":" + getBodyId()+ "," +
            "cssClass" + ":" + getCssClass()+ "," +
            "border" + ":" + getBorder()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parent" + "=" + (getParent() != null ? !getParent().equals(this)  ? getParent().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 342 "../../../../src/Generator_Html.ump"
  void setTitles (String titles []) 
  {
    for(int index=0 ;index<columns; index++){
			Element th = new Element(ITagsConstants.TH, headersRow);
			th.appendText(titles[index]);
			if (titles[index]=="Cyclomatic Complexity") {
			  th.appendText ("<span class =\"tooltiptext\"> <a target=\"helppage\" href=\"https://en.wikipedia.org/wiki/Cyclomatic_complexity\">Cyclomatic Complexity</a> = Number of Conditions + Number of Iterations + 1 </span> ");
			  th.addAttribute(new AttributeElement(IAttributesConstants.ATTRIBUTE_CLASS, "tooltip"));
			}
		}
  }

  
}