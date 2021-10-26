/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;
import java.util.*;

// line 82 "../../../../src/TestHarnessAttributes.ump"
public class ManyKeys extends ManyAttribute
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetWorks;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ManyKeys()
  {
    super();
    cachedHashCode = -1;
    canSetWorks = true;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    ManyKeys compareTo = (ManyKeys)obj;
  
    if (getWorks().length != compareTo.getWorks().length)
    {
      return false;
    }

    for (int i=0; i<getWorks().length; i++)
    {
      Integer me = getWorks()[i];
      Integer them = compareTo.getWorks()[i];
      if (me == null && them != null)
      {
       return false;
      }
      else if (me != null && !me.equals(them))
      {
        return false;
      }
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
    if (getWorks() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getWorks().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetWorks = false;
    return cachedHashCode;
  }

  public void delete()
  {
    super.delete();
  }

}