/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Represents the generation target, such as what the generated output language will be.
 */
// line 1190 "../../../../src/Umple.ump"
public class GenerateTarget
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenerateTarget Attributes
  private String language;
  private String path;
  private boolean override;
  private boolean overrideAll;
  private List<String> suboptions;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetLanguage;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenerateTarget(String aLanguage, String aPath)
  {
    cachedHashCode = -1;
    canSetLanguage = true;
    language = aLanguage;
    path = aPath;
    override = false;
    overrideAll = false;
    suboptions = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLanguage(String aLanguage)
  {
    boolean wasSet = false;
    if (!canSetLanguage) { return false; }
    language = aLanguage;
    wasSet = true;
    return wasSet;
  }

  public boolean setPath(String aPath)
  {
    boolean wasSet = false;
    path = aPath;
    wasSet = true;
    return wasSet;
  }

  public boolean setOverride(boolean aOverride)
  {
    boolean wasSet = false;
    override = aOverride;
    wasSet = true;
    return wasSet;
  }

  public boolean setOverrideAll(boolean aOverrideAll)
  {
    boolean wasSet = false;
    overrideAll = aOverrideAll;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addSuboption(String aSuboption)
  {
    boolean wasAdded = false;
    wasAdded = suboptions.add(aSuboption);
    return wasAdded;
  }

  public boolean removeSuboption(String aSuboption)
  {
    boolean wasRemoved = false;
    wasRemoved = suboptions.remove(aSuboption);
    return wasRemoved;
  }

  /**
   * The target language, such as Java, Cpp, Php or Ruby.
   */
  public String getLanguage()
  {
    return language;
  }

  public String getPath()
  {
    // line 1201 "../../../../src/Umple.ump"
    if(path == null) path = "";
    // END OF UMPLE BEFORE INJECTION
    return path;
  }

  public boolean getOverride()
  {
    return override;
  }

  public boolean getOverrideAll()
  {
    return overrideAll;
  }
  /* Code from template attribute_GetMany */
  public String getSuboption(int index)
  {
    String aSuboption = suboptions.get(index);
    return aSuboption;
  }

  public String[] getSuboptions()
  {
    String[] newSuboptions = suboptions.toArray(new String[suboptions.size()]);
    return newSuboptions;
  }

  public int numberOfSuboptions()
  {
    int number = suboptions.size();
    return number;
  }

  public boolean hasSuboptions()
  {
    boolean has = suboptions.size() > 0;
    return has;
  }

  public int indexOfSuboption(String aSuboption)
  {
    int index = suboptions.indexOf(aSuboption);
    return index;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isOverride()
  {
    return override;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isOverrideAll()
  {
    return overrideAll;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    GenerateTarget compareTo = (GenerateTarget)obj;
  
    if (getLanguage() == null && compareTo.getLanguage() != null)
    {
      return false;
    }
    else if (getLanguage() != null && !getLanguage().equals(compareTo.getLanguage()))
    {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    if (getLanguage() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getLanguage().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetLanguage = false;
    return cachedHashCode;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "language" + ":" + getLanguage()+ "," +
            "path" + ":" + getPath()+ "," +
            "override" + ":" + getOverride()+ "," +
            "overrideAll" + ":" + getOverrideAll()+ "]";
  }
}