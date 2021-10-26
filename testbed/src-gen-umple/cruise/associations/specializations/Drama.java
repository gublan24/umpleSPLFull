/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 139 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Drama
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Drama Associations
  private List<Spam> spam;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Drama()
  {
    spam = new ArrayList<Spam>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Spam getSpam(int index)
  {
    Spam aSpam = spam.get(index);
    return aSpam;
  }

  public List<Spam> getSpam()
  {
    List<Spam> newSpam = Collections.unmodifiableList(spam);
    return newSpam;
  }

  public int numberOfSpam()
  {
    int number = spam.size();
    return number;
  }

  public boolean hasSpam()
  {
    boolean has = spam.size() > 0;
    return has;
  }

  public int indexOfSpam(Spam aSpam)
  {
    int index = spam.indexOf(aSpam);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_spam()
  {
    spam.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSpam()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSpam(Spam aSpam)
  {
    boolean wasAdded = false;
    if (spam.contains(aSpam)) { return false; }
    spam.add(aSpam);
    if (aSpam.indexOfDrama(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSpam.addDrama(this);
      if (!wasAdded)
      {
        spam.remove(aSpam);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSpam(Spam aSpam)
  {
    boolean wasRemoved = false;
    if (!spam.contains(aSpam))
    {
      return wasRemoved;
    }

    int oldIndex = spam.indexOf(aSpam);
    spam.remove(oldIndex);
    if (aSpam.indexOfDrama(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSpam.removeDrama(this);
      if (!wasRemoved)
      {
        spam.add(oldIndex,aSpam);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSpamAt(Spam aSpam, int index)
  {  
    boolean wasAdded = false;
    if(addSpam(aSpam))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSpam()) { index = numberOfSpam() - 1; }
      spam.remove(aSpam);
      spam.add(index, aSpam);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSpamAt(Spam aSpam, int index)
  {
    boolean wasAdded = false;
    if(spam.contains(aSpam))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSpam()) { index = numberOfSpam() - 1; }
      spam.remove(aSpam);
      spam.add(index, aSpam);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSpamAt(aSpam, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Spam> copyOfSpam = new ArrayList<Spam>(spam);
    spam.clear();
    for(Spam aSpam : copyOfSpam)
    {
      aSpam.removeDrama(this);
    }
  }

}