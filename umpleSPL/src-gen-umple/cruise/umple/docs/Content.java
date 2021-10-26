/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.docs;
import java.util.*;

/**
 * Data for the user manual taken from one of the files in 
 * build/reference
 */
// line 43 "../../../../src/Documenter.ump"
// line 469 "../../../../src/Documenter_Code.ump"
public class Content
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Content Attributes
  private String title;
  private boolean shouldIncludeReferences;
  private String description;
  private String syntax;
  private String filename;
  private String videoURL;
  private String tooltip;

  //Content Associations
  private List<ManualExample> examples;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Content(String aTitle, String aDescription, String aSyntax, String aFilename)
  {
    title = aTitle;
    shouldIncludeReferences = true;
    description = aDescription;
    syntax = aSyntax;
    filename = aFilename;
    videoURL = null;
    tooltip = null;
    examples = new ArrayList<ManualExample>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTitle(String aTitle)
  {
    boolean wasSet = false;
    title = aTitle;
    wasSet = true;
    return wasSet;
  }

  public boolean setShouldIncludeReferences(boolean aShouldIncludeReferences)
  {
    boolean wasSet = false;
    shouldIncludeReferences = aShouldIncludeReferences;
    wasSet = true;
    return wasSet;
  }

  public boolean setDescription(String aDescription)
  {
    boolean wasSet = false;
    description = aDescription;
    wasSet = true;
    return wasSet;
  }

  public boolean setSyntax(String aSyntax)
  {
    boolean wasSet = false;
    syntax = aSyntax;
    wasSet = true;
    return wasSet;
  }

  public boolean setFilename(String aFilename)
  {
    boolean wasSet = false;
    filename = aFilename;
    wasSet = true;
    return wasSet;
  }

  public boolean setVideoURL(String aVideoURL)
  {
    boolean wasSet = false;
    videoURL = aVideoURL;
    wasSet = true;
    return wasSet;
  }

  public boolean setTooltip(String aTooltip)
  {
    boolean wasSet = false;
    tooltip = aTooltip;
    wasSet = true;
    return wasSet;
  }

  /**
   * Title of the user manual page
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * Legacy - to be deleted - used to represent whether cross-references should
   * Be created
   */
  public boolean getShouldIncludeReferences()
  {
    return shouldIncludeReferences;
  }

  /**
   * Html for the core of the manual page
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * Grammar rules associated with this user manual page
   */
  public String getSyntax()
  {
    return syntax;
  }

  /**
   * Original source filename
   */
  public String getFilename()
  {
    return filename;
  }

  /**
   * URL of Youtube Video (if any)
   */
  public String getVideoURL()
  {
    return videoURL;
  }

  /**
   * Tooltip to display when hovering (if any)
   */
  public String getTooltip()
  {
    return tooltip;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isShouldIncludeReferences()
  {
    return shouldIncludeReferences;
  }
  /* Code from template association_GetMany */
  public ManualExample getExample(int index)
  {
    ManualExample aExample = examples.get(index);
    return aExample;
  }

  /**
   * Short samples of Umple code
   */
  public List<ManualExample> getExamples()
  {
    List<ManualExample> newExamples = Collections.unmodifiableList(examples);
    return newExamples;
  }

  public int numberOfExamples()
  {
    int number = examples.size();
    return number;
  }

  public boolean hasExamples()
  {
    boolean has = examples.size() > 0;
    return has;
  }

  public int indexOfExample(ManualExample aExample)
  {
    int index = examples.indexOf(aExample);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfExamples()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addExample(ManualExample aExample)
  {
    boolean wasAdded = false;
    if (examples.contains(aExample)) { return false; }
    examples.add(aExample);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeExample(ManualExample aExample)
  {
    boolean wasRemoved = false;
    if (examples.contains(aExample))
    {
      examples.remove(aExample);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addExampleAt(ManualExample aExample, int index)
  {  
    boolean wasAdded = false;
    if(addExample(aExample))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExamples()) { index = numberOfExamples() - 1; }
      examples.remove(aExample);
      examples.add(index, aExample);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveExampleAt(ManualExample aExample, int index)
  {
    boolean wasAdded = false;
    if(examples.contains(aExample))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExamples()) { index = numberOfExamples() - 1; }
      examples.remove(aExample);
      examples.add(index, aExample);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addExampleAt(aExample, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    examples.clear();
  }

  // line 474 "../../../../src/Documenter_Code.ump"
   public String getTitleFilename(){
    return title.replace(" ","") + ".html";
  }


  public String toString()
  {
    return super.toString() + "["+
            "title" + ":" + getTitle()+ "," +
            "shouldIncludeReferences" + ":" + getShouldIncludeReferences()+ "," +
            "description" + ":" + getDescription()+ "," +
            "syntax" + ":" + getSyntax()+ "," +
            "filename" + ":" + getFilename()+ "," +
            "videoURL" + ":" + getVideoURL()+ "," +
            "tooltip" + ":" + getTooltip()+ "]";
  }
}