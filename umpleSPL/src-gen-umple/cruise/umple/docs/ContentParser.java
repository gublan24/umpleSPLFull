/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.docs;
import cruise.umple.compiler.Parser;
import cruise.umple.parser.Token;
import cruise.umple.parser.ParseResult;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.util.*;
import cruise.umple.compiler.*;

/**
 * Specialist parser for the Umple user manual
 * Parses files in build/reference/*
 */
// line 93 "../../../../src/Documenter.ump"
// line 486 "../../../../src/Documenter_Code.ump"
public class ContentParser extends Parser
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ContentParser Attributes
  private int init;

  //ContentParser Associations
  private List<Group> groups;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ContentParser(String aName)
  {
    super(aName);
    init = init();
    groups = new ArrayList<Group>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Group getGroup(int index)
  {
    Group aGroup = groups.get(index);
    return aGroup;
  }

  public List<Group> getGroups()
  {
    List<Group> newGroups = Collections.unmodifiableList(groups);
    return newGroups;
  }

  public int numberOfGroups()
  {
    int number = groups.size();
    return number;
  }

  public boolean hasGroups()
  {
    boolean has = groups.size() > 0;
    return has;
  }

  public int indexOfGroup(Group aGroup)
  {
    int index = groups.indexOf(aGroup);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGroups()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addGroup(Group aGroup)
  {
    boolean wasAdded = false;
    if (groups.contains(aGroup)) { return false; }
    groups.add(aGroup);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeGroup(Group aGroup)
  {
    boolean wasRemoved = false;
    if (groups.contains(aGroup))
    {
      groups.remove(aGroup);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGroupAt(Group aGroup, int index)
  {  
    boolean wasAdded = false;
    if(addGroup(aGroup))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGroups()) { index = numberOfGroups() - 1; }
      groups.remove(aGroup);
      groups.add(index, aGroup);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGroupAt(Group aGroup, int index)
  {
    boolean wasAdded = false;
    if(groups.contains(aGroup))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGroups()) { index = numberOfGroups() - 1; }
      groups.remove(aGroup);
      groups.add(index, aGroup);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGroupAt(aGroup, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    groups.clear();
    super.delete();
  }

  // line 497 "../../../../src/Documenter_Code.ump"
   private int init(){
    addRule("groupOrder : ( [**group] ; )*");
    addRule("content : [*title] [*group] [=noreferences]? (@@tooltip [**tooltip])?  @@description [**description] (@@videoURL [**videoURL])? (@@syntax [**syntax])? [[example]]* @@Filename [*filename]");
    addRule("example- : @@example ( @@caption [**caption] @@endcaption )? [**example] @@endexample");
    init += 1;
    return init;
  }

  // line 506 "../../../../src/Documenter_Code.ump"
   public Group getGroup(String name){
    for (Group g : getGroups())
    {
      if (g.getName().equals(name))
      {
        return g;
      }
    }
    Group newGroup = new Group(name);
    addGroup(newGroup);
    return newGroup;
  }

  // line 520 "../../../../src/Documenter_Code.ump"
   public ParseResult analyze(){
    for (Token t : getRootToken().getSubTokens())
    {
      if (t.is("content"))
      {
        Group g = getGroup(t.getValue("group"));
        Content content = new Content(t.getValue("title"), t.getValue("description"), t.getValue("syntax"), t.getValue("filename"));

        if(t.getValue("tooltip") != null) {
          content.setTooltip(t.getValue("tooltip"));
        }
        
        if(t.getValue("videoURL") != null) {
          content.setVideoURL(t.getValue("videoURL"));
        }
        
        if (t.getValue("noreferences") != null)
        {
          content.setShouldIncludeReferences(false);
        }
        ManualExample newEx = null;
        for (Token exampleToken : t.getSubTokens())
        {
          if (exampleToken.is("example"))
          {
            String exampleText = exampleToken.getValue();
            String exampleURL="";
            if(exampleText. startsWith("@@source")) {
              // obtain the example text from the ump directory in umpleonline
              try {
                String exampleTextWithArguments=exampleText.substring(9).trim();
                int spaceLocation = exampleTextWithArguments.indexOf(' ');
                String exampleName = exampleTextWithArguments;
                if (spaceLocation != -1) exampleName=exampleTextWithArguments.substring(
                  0,spaceLocation);
                Path thePath = Paths.get("umpleonline/umplibrary/"+exampleName);
                if(Files.exists(thePath)) {
                  exampleText = new String(Files.readAllBytes(thePath));
                }
                else {
                  // Fall back to the old location of the manual examples
                  thePath = Paths.get("umpleonline/ump/"+exampleName);                
                  exampleText = new String(Files.readAllBytes(thePath));
                }
                exampleText = exampleText.replaceAll("<", "&lt;");
                exampleText = exampleText.replaceAll(">", "&gt;");
                exampleURL="?example="+exampleTextWithArguments;
              }
              catch (IOException e) {
                exampleText = "Could not open example file "
                  +exampleText.substring(9).trim();
              }
            }
            // If we have an example without finding a caption first, then create a plain example
            if(newEx == null) {
              newEx = new ManualExample(exampleText);
            }
            else {
              newEx.setText(exampleText);
            }
            newEx.setUrl(exampleURL);
            content.addExample(newEx);
            newEx = null; // any subsequent caption or example starts a new example
          }
          else if (exampleToken.is("caption")) {
            newEx = new ManualExample(""); // Empty for now pending finding example token
            newEx.setCaption(exampleToken.getValue());
          }
        }
        g.addContent(content);
      }
      else if (t.is("groupOrder"))
      {
        for (Token groupToken : t.getSubTokens())
        {
          if (!groupToken.isStatic())
          {
            String [] groupInfo=groupToken.getValue().split("%");
            Group newGroup = new Group(groupInfo[0]);
            String newTooltip="";
            if(groupInfo.length==2) {
              newTooltip=groupInfo[1];
            }
            newGroup.setTooltip(newTooltip);
            addGroup(newGroup);
          }
        }
      }
    }
    return getParseResult();
  }

}