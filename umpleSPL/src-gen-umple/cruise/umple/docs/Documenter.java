/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.docs;
import java.io.*;
import java.net.*;
import cruise.umple.util.*;
import cruise.umple.compiler.*;
import java.util.*;

/**
 * The tool to create the html text of the Umple user manual
 */
// line 24 "../../../../src/Documenter.ump"
// line 52 "../../../../src/Documenter_Code.ump"
public class Documenter
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Documenter Attributes
  private String inputPath;
  private String outputPath;
  private List<String> messages;
  private boolean seriousProblem;

  //Documenter Associations
  private ContentParser parser;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Documenter(String aInputPath, String aOutputPath)
  {
    inputPath = aInputPath;
    outputPath = aOutputPath;
    messages = new ArrayList<String>();
    seriousProblem = false;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setInputPath(String aInputPath)
  {
    boolean wasSet = false;
    inputPath = aInputPath;
    wasSet = true;
    return wasSet;
  }

  public boolean setOutputPath(String aOutputPath)
  {
    boolean wasSet = false;
    outputPath = aOutputPath;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addMessage(String aMessage)
  {
    boolean wasAdded = false;
    wasAdded = messages.add(aMessage);
    return wasAdded;
  }

  public boolean removeMessage(String aMessage)
  {
    boolean wasRemoved = false;
    wasRemoved = messages.remove(aMessage);
    return wasRemoved;
  }

  public boolean setSeriousProblem(boolean aSeriousProblem)
  {
    boolean wasSet = false;
    seriousProblem = aSeriousProblem;
    wasSet = true;
    return wasSet;
  }

  public String getInputPath()
  {
    return inputPath;
  }

  public String getOutputPath()
  {
    return outputPath;
  }
  /* Code from template attribute_GetMany */
  public String getMessage(int index)
  {
    String aMessage = messages.get(index);
    return aMessage;
  }

  public String[] getMessages()
  {
    String[] newMessages = messages.toArray(new String[messages.size()]);
    return newMessages;
  }

  public int numberOfMessages()
  {
    int number = messages.size();
    return number;
  }

  public boolean hasMessages()
  {
    boolean has = messages.size() > 0;
    return has;
  }

  public int indexOfMessage(String aMessage)
  {
    int index = messages.indexOf(aMessage);
    return index;
  }

  public boolean getSeriousProblem()
  {
    return seriousProblem;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isSeriousProblem()
  {
    return seriousProblem;
  }
  /* Code from template association_GetOne */
  public ContentParser getParser()
  {
    return parser;
  }

  public boolean hasParser()
  {
    boolean has = parser != null;
    return has;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setParser(ContentParser aNewParser)
  {
    boolean wasSet = false;
    parser = aNewParser;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    parser = null;
  }

  // line 57 "../../../../src/Documenter_Code.ump"
   public boolean generate(){
    File inputDirectory = new File(getInputPath());
    if (!inputDirectory.exists())
    {
      addMessage("Unknown directory: " + getInputPath());
      setSeriousProblem(true);
      return false;
    }

    setParser(new ContentParser("content"));

    parseGroupOrder(inputDirectory);
    parseContent(inputDirectory);
    
    if (getParser().analyze().getWasSuccess())
    {
      String message = "Created Groups:";
      for (Group g : getParser().getGroups())
      {
        message += " [" + g.getName() + "]";
      }
      addMessage(message);
      publish(getOutputPath());
      return true;
    }
    else
    {
      addMessage("Error: Unable to analyze user manual files in " + getInputPath());
      setSeriousProblem(true);
      return false;
    }
  }

  // line 91 "../../../../src/Documenter_Code.ump"
   public boolean publish(String path){
    File file = new File(path);
    file.mkdirs();
    String navigationOutput = "";
    String sectionsToHide = "";
    String prevNextOutput = "";
    Group group = null;
    Content content = null;
    int numGroups = getParser().numberOfGroups();
    int numContents = 0;
    
    // NEW
    StringBuilder combinedHtmlOutput = new StringBuilder();
    combinedHtmlOutput.append(
        "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" + "\n" +
        "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">" + "\n" +
        "<head>" + "\n" +
        "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />" + "\n" +
        "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />" + "\n" +        
        "  <link rel=\"stylesheet\" type=\"text/css\" href=\"files/layout.css\" />" + "\n" +
        "  <script type=\"text/javascript\" src=\"files/script.js\"></script>" + "\n" +
        "  <title>Umple Combined User Manual</title>" + "\n" +
        "  <style> h1 {page-break-before: always; font-size: 200%;}</style>\n"+
        "  <style> .largeCentered {text-align: center; font-size: 200%  }</style>\n" +  
        "  <style> .regCentered {text-align: center; font-size: 110%  }</style>\n" +  
        "  <meta name='viewport' content='width=device-width, initial-scale=1'>\n  " +
        "</head>\n<body>\n" +
        "<div class='largeCentered'>Umple Combined User Manual<br><a href='http://www.umple.org'>http://www.umple.org</a></div><div class='regCentered'>This version is one large page and is intended to allow searching through the entire manual, or easy printing to pdf for offline reading. For most purposes you will want to work with the individual manual pages at <a href='http://manual.umple.org'>http://manual.umple.org</a>. A published 526-page <a href='https://doi.org/10393/42044'>pdf version of the Umple User Manual</a> is also available for download. </div>&nbsp;<br/>"
        );

    Hashtable<String,String> referenceLookup = createReferenceLookup();
    String filename="";
    int totPages=0;
    for (int gi=0; gi<numGroups; gi++)
    {
      group = getParser().getGroup(gi);
      sectionsToHide = toSectionsToHideHtml(group);
      numContents = group.numberOfContents();
      for (int ci=0; ci<numContents; ci++)
      {
        content = group.getContent(ci);
        
        if(content.getDescription().contains("@@syntax") || content.getDescription().contains("@@example")) {
          addMessage("Error: Parsing of description failed for: " + content.getTitle()+ " because @@syntax or @@example found. Look for bad characters or non-matching brackets. Ensure html symbols are used for slashes, quotes and apostrophes." );
         setSeriousProblem(true);    
        }
        
        navigationOutput = toNavigationHtml(group, content);
        if (content.getShouldIncludeReferences())
        {
          updateReferences(content,referenceLookup);
        }
        
        prevNextOutput="&nbsp; &nbsp;";
        Content theContent=null;

        // Add file link to previous page if there is one
        if(ci>0) {
          theContent=group.getContent(ci-1);
          prevNextOutput+=genPrevNext("Previous",theContent);
        }
        else if(gi > 0&&getParser().getGroup(gi-1).numberOfContents()>=1) {
          theContent=getParser().getGroup(gi-1)
            .getContent(getParser().getGroup(gi-1).numberOfContents()-1);
          prevNextOutput+=genPrevNext("Previous",theContent);
        }

        // Add file link to next page if there is one
        if(ci<(numContents -1)) {
          theContent=group.getContent(ci+1);
          prevNextOutput+=genPrevNext("Next",theContent);
        }
        else if(gi<(numGroups -1)&&getParser().getGroup(gi+1).numberOfContents()>0) {
          theContent=getParser().getGroup(gi+1).getContent(0);
          prevNextOutput+=genPrevNext("Next",theContent);
        }
        String htmlOutput = toHtml(content, navigationOutput, sectionsToHide, prevNextOutput, content.getFilename());

        // NEW FOR COMBINED
        String tempCombined = Template.HtmlCoreTemplate;
        tempCombined = substituteCoreElements(tempCombined, content);
        combinedHtmlOutput.append(tempCombined);
        
        if (htmlOutput.length() == 0)
        {
          addMessage("Error: User manual processing failed on: " + content.getTitle());
          setSeriousProblem(true);
          return false;
        }
        
        filename = path + File.separator + content.getTitleFilename();
        SampleFileWriter.createFile(filename,htmlOutput);
      }
      totPages+=numContents;
    }
    
    // NEW FOR COMBINED
    combinedHtmlOutput.append(Template.HtmlHighlighterTemplate);
    combinedHtmlOutput.append("\n</body>\n</html>");
    filename = path + File.separator + "UmpleUserManualCombined.html";
    SampleFileWriter.createFile(filename,combinedHtmlOutput.toString());
    
    addMessage("Created "+totPages+" manual pages, in "+numGroups+" groups, including "+filename);
    return true;
  }

  // line 197 "../../../../src/Documenter_Code.ump"
   public String genPrevNext(String direction, Content theContent){
    String tooltip="title=\""+theContent.getTitle();
    if(theContent.getTooltip()==null) {
      tooltip+="\" ";
    }
    else {
      tooltip+="\n\n"+theContent.getTooltip()+"\" "; 
    }
  
    return("<a "+tooltip+"href=\"" + theContent.getTitleFilename() + "\">["+direction+"]</a>&nbsp &nbsp;");
  }

  // line 211 "../../../../src/Documenter_Code.ump"
   public String toHtml(String title){
    Content selectedContent = null;
    Group selectedGroup = null;
    
    for (Group group : getParser().getGroups())
    {
      for (Content content : group.getContents())
      {
        if (content.getTitle().equals(title))
        {
          selectedContent = content;
          selectedGroup = group;
          break;
        }
      }
    }
    
    return toHtml(selectedContent, toNavigationHtml(selectedGroup, selectedContent),  toSectionsToHideHtml(selectedGroup), "", selectedContent.getTitleFilename());
  }

  // line 245 "../../../../src/Documenter_Code.ump"
   private void updateReferences(Content content, Hashtable<String,String> referenceLookup){
    String newSyntax = content.getSyntax();
    String newDescription = content.getDescription();
    
    for(Iterator<String> iTitle = referenceLookup.keySet().iterator(); iTitle.hasNext();)
    {
      String title = iTitle.next();
      String titleFilename = referenceLookup.get(title);
      
      if (title.equals(content.getTitle()))
      {
        continue;
      }
      
      if (newSyntax != null)
      {
        newSyntax = newSyntax.replaceAll(title, StringFormatter.format("<a href=\"{1}\">{0}</a>",title,titleFilename));
      }
      if (newDescription != null)
      {
        newDescription = newDescription.replaceAll(title, StringFormatter.format("<a href=\"{1}\">{0}</a>",title,titleFilename));
      }
    }
    content.setSyntax(newSyntax);
    content.setDescription(newDescription);
  }

  // line 273 "../../../../src/Documenter_Code.ump"
   private void parseContent(File inputDirectory){
    File[] allFiles = SampleFileWriter.getAllFiles(inputDirectory);
    for (File aFile : allFiles)
    {
      if (aFile.getName().endsWith(".txt"))
      {
        if (!getParser().parse("content", SampleFileWriter.readContent(aFile)+" @@Filename "+aFile.getName()).getWasSuccess())
        {
          addMessage("Error: Unable to parse manual source page at line "+ getParser().getParseResult().getPosition() +": " + aFile.getName() );
          setSeriousProblem(true);
        }
      }
    }
  }

  // line 289 "../../../../src/Documenter_Code.ump"
   private void parseGroupOrder(File inputDirectory){
    File[] allFiles = SampleFileWriter.getAllFiles(inputDirectory);
    for (File aFile : allFiles)
    {
      if ("order.group".equals(aFile.getName()))
      {
        getParser().parse("groupOrder", SampleFileWriter.readContent(aFile));
      }
    }
  }

  // line 301 "../../../../src/Documenter_Code.ump"
   private String toHtml(Content selectedContent, String navigationOutput, String toHideOutput, String prevNextOutput, String srcFileOutput){
    if (selectedContent == null)
    {
      return "";
    }

    String htmlOutput = Template.HtmlTemplate;
    htmlOutput = htmlOutput.replace("@@PREVNEXT@@", prevNextOutput);
    htmlOutput = htmlOutput.replace("@@NAVIGATION@@", navigationOutput);
    htmlOutput = htmlOutput.replace("@@SECTIONSTOHIDE@@", toHideOutput);
    htmlOutput = htmlOutput.replace("@@SRCFILENAME@@", srcFileOutput);
        
    htmlOutput = substituteCoreElements(htmlOutput, selectedContent);

    return htmlOutput;
  }

  // line 318 "../../../../src/Documenter_Code.ump"
   private String substituteCoreElements(String htmlOutput, Content selectedContent){
    int endOfExampleBeforePosition=0;
    
    if (selectedContent == null)
    {
      return "";
    }
    
    UmpleInternalParser grammarparser = new UmpleInternalParser();
    for(String file:grammarparser.getParser().getGrammarFiles()){
      grammarparser.addRulesInFile(file);
    }  
  
    htmlOutput = htmlOutput.replace("@@TITLE@@", selectedContent.getTitle());

    htmlOutput = htmlOutput.replace("@@DESCRIPTION@@", selectedContent.getDescription());
    
    if (selectedContent.getSyntax() == null)
    {
      htmlOutput = htmlOutput.replace("@@SYNTAX@@", "");
    }
    else
    {
      String syntaxHtml = Template.SyntaxTemplate.replace("@@SYNTAX_CODE@@",grammarparser.toGrammarParts(selectedContent.getSyntax()));
      htmlOutput = htmlOutput.replace("@@SYNTAX@@", 
        "<span class=\"notranslate\" translate=\"no\">" +
        syntaxHtml+ "</span>");
    }

    if (selectedContent.getVideoURL() == null)
    {
      htmlOutput = htmlOutput.replace("@@VIDEOURL@@", "");
    }
    else
    {
      String videoURLHtml = Template.VideoURLTemplate.replace("@@VIDEO_URL@@",selectedContent.getVideoURL());
      htmlOutput = htmlOutput.replace("@@VIDEOURL@@", 
        "<span class=\"notranslate\" translate=\"no\">" +
        videoURLHtml+ "</span>");
    }
    
    String exampleOutput = "";
    for (ManualExample manualExample : selectedContent.getExamples())
    {
      String example = manualExample.getText();
      String url = manualExample.getUrl();
      String nextExample = Template.ExampleTemplate;
      String caption = manualExample.getCaption();
      String exampleHeader = "";
      if(caption != null && !caption.equals("")) {
        exampleHeader = caption;
      }
      else {
        exampleHeader = exampleOutput.length() == 0 ? "Example" : "Another Example";
      }
      nextExample = nextExample.replace("@@EXAMPLE_NUMBER@@",exampleHeader);
      
      endOfExampleBeforePosition = example.indexOf("//$?[End_of_model]$?");
      if(endOfExampleBeforePosition == -1) {endOfExampleBeforePosition = example.length();}
      nextExample = nextExample.replace("@@EXAMPLE_CODE@@", example.substring(0,endOfExampleBeforePosition));
      
      if(url.isEmpty()) {
        // Encode it, as the code is embedded
        try {
          nextExample = nextExample.replace("@@EXAMPLE_CODE_URL@@","?text="+
            URLEncoder.encode(example,"UTF-8").replaceAll("\\+","%20").replaceAll("%2B","%252B"));
        }
        catch (java.io.UnsupportedEncodingException e) {
        }
      }
      else {
        // Use the actual filename in the URL but trim off the trailing .ump
        // And add back any separate command line arguments
        int spaceIndex=url.indexOf(' ');
        String urlArguments="";
        String urlMain=url;
        if (spaceIndex != -1) {
          urlArguments=url.substring(spaceIndex+1);
          urlMain=url.substring(0,spaceIndex);
        }
        nextExample = nextExample.replace("@@EXAMPLE_CODE_URL@@",
          url.substring(0, urlMain.lastIndexOf('.'))+urlArguments);
      }
      exampleOutput += nextExample;
    }
    
    htmlOutput = htmlOutput.replace("@@EXAMPLE@@", exampleOutput);
    htmlOutput = htmlOutput.replace("@@UMPLE_GRAMMAR@@", 
      "<span class=\"notranslate\" translate=\"no\">" +
      grammarparser.toGrammar()) + "</spsn>";
    return htmlOutput;
  }

  // line 412 "../../../../src/Documenter_Code.ump"
   private String toNavigationHtml(Group groupToAlwaysShow, Content contentToNotHighlight){
    String navigationOutput = "";
    String theFileName = "";
    String nextGroupItem = "";
    for (Group group : getParser().getGroups())
    {
      String nextGroupHeader = Template.NavigationHeaderTemplate;
      nextGroupHeader = nextGroupHeader
        .replace("@@NAVIGATION_HEADER_NAME@@",group.getName())
        .replace("@@NAVIGATION_HEADER_ID@@",group.getGroupIdName())
        .replace("@@NAVIGATION_HEADER_ID@@",group.getGroupIdName());
      if(group.getTooltip() == null || group.getTooltip().equals("")) {
        nextGroupHeader = nextGroupHeader.replace("@@TOOLTIP@@ ","");
      }
      else {
        nextGroupHeader = nextGroupHeader.replace("@@TOOLTIP@@ ","title=\""+group.getTooltip()+"\"");
      }
      navigationOutput += nextGroupHeader;

      for (Content content : group.getContents())
      {
        if(content == contentToNotHighlight) {
          nextGroupItem = Template.NavigationItemTemplateNoAnchor;
        }
        else {
          nextGroupItem = Template.NavigationItemTemplate;
        }
        nextGroupItem = nextGroupItem.replace("@@NAVIGATION_ITEM_NAME@@",content.getTitle());
        if(content.getTooltip() != null) {
          nextGroupItem = nextGroupItem.replace("@@TOOLTIP@@",Template.tooltipTemplate().replace("@@TOOLTIP@@",content.getTooltip()));
        }
        else {
          nextGroupItem = nextGroupItem.replace("@@TOOLTIP@@ ","");
        }
        
        if(content != contentToNotHighlight) {
          nextGroupItem = nextGroupItem.replace("@@NAVIGATION_ITEM_FILENAME@@",content.getTitleFilename());
        }
        navigationOutput += nextGroupItem;
      }
      navigationOutput +="        </div>";
    }
    return navigationOutput;
  }

  // line 458 "../../../../src/Documenter_Code.ump"
   private String toSectionsToHideHtml(Group groupToAlwaysShow){
    String sectionsToHideOutput = "";
    for (Group group : getParser().getGroups())
    {
      if(group != groupToAlwaysShow) {
        sectionsToHideOutput +="showHide(\"" + group.getGroupIdName() + "\");\n";
      }
    }
    return sectionsToHideOutput;
  }


  public String toString()
  {
    return super.toString() + "["+
            "inputPath" + ":" + getInputPath()+ "," +
            "outputPath" + ":" + getOutputPath()+ "," +
            "seriousProblem" + ":" + getSeriousProblem()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parser = "+(getParser()!=null?Integer.toHexString(System.identityHashCode(getParser())):"null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 230 "../../../../src/Documenter_Code.ump"
  private Hashtable<String, String> createReferenceLookup () 
  {
    Hashtable<String, String> referenceLookup = new Hashtable<String, String>();
    for (Group group : getParser().getGroups())
    {
      for (Content content : group.getContents())
      {
        referenceLookup.put(content.getTitle(), content.getTitleFilename());
      }
    }
    return referenceLookup;
  }

  
}