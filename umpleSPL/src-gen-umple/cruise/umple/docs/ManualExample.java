/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.docs;

// line 72 "../../../../src/Documenter.ump"
public class ManualExample
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ManualExample Attributes
  private String text;
  private String url;
  private String caption;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ManualExample(String aText)
  {
    text = aText;
    url = "";
    caption = "";
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setText(String aText)
  {
    boolean wasSet = false;
    text = aText;
    wasSet = true;
    return wasSet;
  }

  public boolean setUrl(String aUrl)
  {
    boolean wasSet = false;
    url = aUrl;
    wasSet = true;
    return wasSet;
  }

  public boolean setCaption(String aCaption)
  {
    boolean wasSet = false;
    caption = aCaption;
    wasSet = true;
    return wasSet;
  }

  public String getText()
  {
    return text;
  }

  public String getUrl()
  {
    return url;
  }

  /**
   * If empty, then default caption will be used Example, Another Example
   */
  public String getCaption()
  {
    return caption;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "text" + ":" + getText()+ "," +
            "url" + ":" + getUrl()+ "," +
            "caption" + ":" + getCaption()+ "]";
  }
}