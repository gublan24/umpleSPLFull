/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;
import java.util.*;

// line 88 "../../../../src/TestHarnessAttributes.ump"
public class ManKeysStringAndInt extends ManyStringAttributes
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ManKeysStringAndInt Attributes
  private int id;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetWorksString;
  private boolean canSetId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ManKeysStringAndInt(int aId)
  {
    super();
    cachedHashCode = -1;
    canSetWorksString = true;
    canSetId = true;
    id = aId;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(int aId)
  {
    boolean wasSet = false;
    if (!canSetId) { return false; }
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public int getId()
  {
    return id;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    ManKeysStringAndInt compareTo = (ManKeysStringAndInt)obj;
  
    if (getWorksString().length != compareTo.getWorksString().length)
    {
      return false;
    }

    for (int i=0; i<getWorksString().length; i++)
    {
      String me = getWorksString()[i];
      String them = compareTo.getWorksString()[i];
      if (me == null && them != null)
      {
       return false;
      }
      else if (me != null && !me.equals(them))
      {
        return false;
      }
    }

    if (getId() != compareTo.getId())
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
    if (getWorksString() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getWorksString().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    cachedHashCode = cachedHashCode * 23 + getId();

    canSetWorksString = false;
    canSetId = false;
    return cachedHashCode;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "]";
  }
}