/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.docs;
import java.util.*;

/**
 * A section of the Umple user manual
 * Defined in the build/references/order.group
 */
// line 82 "../../../../src/Documenter.ump"
// line 478 "../../../../src/Documenter_Code.ump"
public class Group
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Group Attributes
  private String name;
  private String tooltip;

  //Group Associations
  private List<Content> contents;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Group(String aName)
  {
    name = aName;
    tooltip = null;
    contents = new ArrayList<Content>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
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

  public String getName()
  {
    return name;
  }

  public String getTooltip()
  {
    return tooltip;
  }
  /* Code from template association_GetMany */
  public Content getContent(int index)
  {
    Content aContent = contents.get(index);
    return aContent;
  }

  public List<Content> getContents()
  {
    List<Content> newContents = Collections.unmodifiableList(contents);
    return newContents;
  }

  public int numberOfContents()
  {
    int number = contents.size();
    return number;
  }

  public boolean hasContents()
  {
    boolean has = contents.size() > 0;
    return has;
  }

  public int indexOfContent(Content aContent)
  {
    int index = contents.indexOf(aContent);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfContents()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addContent(Content aContent)
  {
    boolean wasAdded = false;
    if (contents.contains(aContent)) { return false; }
    contents.add(aContent);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeContent(Content aContent)
  {
    boolean wasRemoved = false;
    if (contents.contains(aContent))
    {
      contents.remove(aContent);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addContentAt(Content aContent, int index)
  {  
    boolean wasAdded = false;
    if(addContent(aContent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfContents()) { index = numberOfContents() - 1; }
      contents.remove(aContent);
      contents.add(index, aContent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveContentAt(Content aContent, int index)
  {
    boolean wasAdded = false;
    if(contents.contains(aContent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfContents()) { index = numberOfContents() - 1; }
      contents.remove(aContent);
      contents.add(index, aContent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addContentAt(aContent, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    contents.clear();
  }

  // line 482 "../../../../src/Documenter_Code.ump"
   public String getGroupIdName(){
    return name.replace(" ","");
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "tooltip" + ":" + getTooltip()+ "]";
  }
}