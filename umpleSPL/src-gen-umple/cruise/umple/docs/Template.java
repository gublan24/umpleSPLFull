/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.docs;

/**
 * Set of html templates used in the Umple User manual for certain
 * kinds of page elements
 */
// line 107 "../../../../src/Documenter.ump"
// line 612 "../../../../src/Documenter_Code.ump"
public class Template
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String HtmlHighlighterTemplate = htmlHighlighterTemplate();
  public static final String HtmlCoreTemplate = htmlCoreTemplate();
  public static final String HtmlTemplate = htmlTemplate();
  public static final String ExampleTemplate = exampleTemplate();
  public static final String SyntaxTemplate = syntaxTemplate();
  public static final String VideoURLTemplate = videoURLTemplate();
  public static final String NavigationHeaderTemplate = navigationHeaderTemplate();
  public static final String NavigationItemTemplate = navigationItemTemplate();
  public static final String NavigationItemTemplateNoAnchor = navigationItemTemplateNoAnchor();

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Template()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 617 "../../../../src/Documenter_Code.ump"
   private static  String navigationHeaderTemplate(){
    return "        <div class=\"level1\"><a @@TOOLTIP@@ href=\"javascript:showHide('@@NAVIGATION_HEADER_ID@@');\">@@NAVIGATION_HEADER_NAME@@</a></div>" + "\n" +
           "        <div id=\"@@NAVIGATION_HEADER_ID@@\">";
  }

  // line 623 "../../../../src/Documenter_Code.ump"
   private static  String navigationItemTemplate(){
    return "          <div class=\"level2\"><a @@TOOLTIP@@ href=\"@@NAVIGATION_ITEM_FILENAME@@\" >@@NAVIGATION_ITEM_NAME@@</a></div>" + "\n";
  }

  // line 628 "../../../../src/Documenter_Code.ump"
   private static  String navigationItemTemplateNoAnchor(){
    return "          <div class=\"level2\"><b>@@NAVIGATION_ITEM_NAME@@</b></div>" + "\n";
  }

  // line 633 "../../../../src/Documenter_Code.ump"
   private static  String exampleTemplate(){
    String template = "" + 
      "      <h3>@@EXAMPLE_NUMBER@@</h3>" + "\n" +
      "<span class=\"notranslate\" translate=\"no\">" +
      "      <pre name=\"code\" class=\"c-sharp\">" + "\n" +
      "@@EXAMPLE_CODE@@" + "\n" +
      "      </pre>" + "\n" +
      "</span>" +
      "<p class=\"description\">" +
      "<a target=\"uol\" href=\"https://cruise.umple.org/umpleonline@@EXAMPLE_CODE_URL@@\">" +
        "Load the above code into UmpleOnline</a></p>" + "\n" +
      "&nbsp; <br/>" + "\n";
    return template;
  }

  // line 649 "../../../../src/Documenter_Code.ump"
   private static  String syntaxTemplate(){
    String template = "" + 
      "      <h3>Syntax</h3>" + "\n" +
      "      \n" +
      "@@SYNTAX_CODE@@" + "\n" +
       "     <br/>\n" +
        "" + "\n";
    return template;
  }

  // line 660 "../../../../src/Documenter_Code.ump"
   static  String tooltipTemplate(){
    String template = "" +
      "title=\"@@TOOLTIP@@\"";
    return template;
  }

  // line 668 "../../../../src/Documenter_Code.ump"
   private static  String videoURLTemplate(){
    String template = "" +
 "      <h3>YouTube Video with Additional Explanation</h3>" + "\n" +     
      "  <iframe width=\"560\" height=\"315\"\n"+
      "     src=\"@@VIDEO_URL@@?rel=0\" frameborder=\"0\"\n"+
      "     allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n" +
      "&nbsp; <br/> &nbsp; <br/>" + "\n";
    return template;
  }

  // line 680 "../../../../src/Documenter_Code.ump"
   private static  String htmlTemplate(){
    String template = "" + 
        "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" + "\n" +
        "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">" + "\n" +
        "<head>" + "\n" +
        "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />" + "\n" +
        "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />" + "\n" +
        "  <link rel=\"stylesheet\" type=\"text/css\" href=\"files/layout.css\" />" + "\n" +
        "  <script type=\"text/javascript\" src=\"files/script.js\"></script>" + "\n" +
        "  <title>Umple User Manual: @@TITLE@@</title>" + "\n" +
        "  <script type=\"text/javascript\">" + "\n" +
        "    function showHide(section)" + "\n" +
        "    {" + "\n" +
        "      var sectionDivStyle = document.getElementById(section).style;" + "\n" +
        "      if(sectionDivStyle.display==\"none\") {" + "\n" +
        "        sectionDivStyle.display=\"inherit\";" + "\n" +
        "      }" + "\n" +
        "      else {" + "\n" +
        "        sectionDivStyle.display=\"none\";" + "\n" +
        "      }" + "\n" +
        "    }" + "\n" +
        "  </script>" + "\n" +
        "  <meta name='viewport' content='width=device-width, initial-scale=1'>\n  " +
        "</head>" + "\n" +
        "" + "\n" +
        "<body>" + "\n" +
        "" + "\n" +
        "  " + "\n" +
        "  <table class=\"body\" >" + "\n" +
        "  <tbody>" + "\n" +
        "  <tr>" + "\n" +
        "    <td class=\"menu\">" + "\n" +
        "      <div class=\"title\"><a href=\"https://cruise.umple.org/umple\">" +
        "<img height=\"25\" src=\"files/indicator_blocks.gif\" alt=\"Umple Logo\" />&nbsp;" +
        "Umple </a></div>" + "\n" +
        
// Code from Google for translation

"<div id=\"google_translate_element\"></div><script type=\"text/javascript\">" +
"function googleTranslateElementInit() {" +
"  new google.translate.TranslateElement({pageLanguage: 'en', layout:" +
"google.translate.TranslateElement.InlineLayout.SIMPLE}, 'google_translate_element');" +
"}" +
"</script><script type=\"text/javascript\"" +
"src=\"//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit\"></script>" +

        "@@NAVIGATION@@" + "\n" +
        "<div class=\"level1\"><a href=\"UmpleUserManualCombined.html\">Combined Version</a></div>\n" +  
        "<div class=\"level1\"><a title=\"Click here to open an editor in Github on the original source for this manual page.\nYou can submit a pull request after making your changes\" href=\"https://github.com/umple/umple/tree/master/build/reference/@@SRCFILENAME@@\">Edit on Github</a></div>\n" +                
        "<div class=\"level1\">@@PREVNEXT@@</div>\n" +
        "    </td>" + "\n" +
        "" + "\n" +
        "    <td class=\"dotSeparator\"><img src=\"files/dots.gif\" alt=\"list of dots\" /></td>" + "\n" +
        "" + "\n" +
        "      <td class=\"content\">" + "\n" +
        "" + "\n" +
        
        "<span style=\"float: right\">"+
        "  <a title=\"Umple is led by Timothy Lethbridge, professor at the University of Ottawa. Much of the development has been by graduate students at uOttawa.\" href=\"https://www.uottawa.ca\" target=\"uottawatab\"><img height=\"20px\" src=\"files/uottawa_ver_black.png\" alt=\"University of Ottawa logo / Université d'Ottawa\" /></a>"+
        "</span>"+
        
        "      <h2><i>User Manual @@PREVNEXT@@</i></h2>"  + "\n" +
        
// Code from Google for custom search

"<script>" + "\n" +
"  (function() {" + "\n" +
"    var cx = '014719661006816508785:azyvserhylq';" + "\n" +
"    var gcse = document.createElement('script');" + "\n" +
"    gcse.type = 'text/javascript';" + "\n" +
"    gcse.async = true;" + "\n" +
"    gcse.src = 'https://cse.google.com/cse.js?cx=' + cx;" + "\n" +
"    var s = document.getElementsByTagName('script')[0];" + "\n" +
"    s.parentNode.insertBefore(gcse, s);" + "\n" +
"  })();" + "\n" +
"</script>" + "\n" +
"<gcse:search></gcse:search>" + "\n" +

/*
"<div style=\"border:1px solid black\" id=\"cse\" style=\"width: 100%;\">Loading</div>" + "\n" +
"<script src=\"http://www.google.com/jsapi\" type=\"text/javascript\"></script>" + "\n" +
"<script type=\"text/javascript\"> " + "\n" +
"  google.load('search', '1', {language : 'en', style : google.loader.themes.V2_DEFAULT});" + "\n" +
"  google.setOnLoadCallback(function() {" + "\n" +
"    var customSearchOptions = {};  var customSearchControl = new google.search.CustomSearchControl(" + "\n" +
"      '014719661006816508785:azyvserhylq', customSearchOptions);" + "\n" +
"    customSearchControl.setResultSetSize(google.search.Search.FILTERED_CSE_RESULTSET);" + "\n" +
"    var options = new google.search.DrawOptions();" + "\n" +
"    options.setAutoComplete(true);" + "\n" +
"    customSearchControl.draw('cse', options);" + "\n" +
"  }, true);" + "\n" +
"</script>" + "\n" +
*/
        
/// End code from Google
        Template.HtmlCoreTemplate +
        "      </td>" + "\n" +
        "    </tr>" + "\n" +
        "  </tbody></table>" + 
        Template.HtmlHighlighterTemplate +
        "<script language=\"javascript\">" + "\n" +
        "@@SECTIONSTOHIDE@@" + "\n" +        
        "</script>" + "\n" +
        "</body>" + "\n" +
        "</html>";
    return template;
  }


  /**
   * NEW
   */
  // line 789 "../../../../src/Documenter_Code.ump"
   private static  String htmlHighlighterTemplate(){
    String template = "" +
        "<link type=\"text/css\" rel=\"stylesheet\" href=\"syntaxhighlighter/SyntaxHighlighter.css\"></link>" + "\n" +      
        "<script language=\"javascript\" src=\"syntaxhighlighter/shCore.js\"></script>" + "\n" +
        "<script language=\"javascript\" src=\"syntaxhighlighter/shBrushCSharp.js\"></script>" + "\n" +
        "<script language=\"javascript\" src=\"syntaxhighlighter/shBrushXml.js\"></script>" + "\n" +
        "<script language=\"javascript\">" + "\n" +
        "dp.SyntaxHighlighter.ClipboardSwf = 'syntaxhighlighter/clipboard.swf';" + "\n" +
        "dp.SyntaxHighlighter.HighlightAll('code');" + "\n" +
        "</script>" + "\n";
    return template;
  }


  /**
   * NEW
   */
  // line 804 "../../../../src/Documenter_Code.ump"
   private static  String htmlCoreTemplate(){
    String template = "" + 
        "      <h1><font size=\"+1\">@@TITLE@@</font></h1>" + "\n" +
        "      <p class=\"description\">@@DESCRIPTION@@</p>" + "\n" +
        "" + "\n" +
        "@@EXAMPLE@@" + "\n" +
        "@@VIDEOURL@@" + "\n" +
        "@@SYNTAX@@" + "\n";
    return template;
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}