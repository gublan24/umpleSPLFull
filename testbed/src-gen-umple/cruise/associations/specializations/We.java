/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 296 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class We
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //We Associations
  private List<Qw> qw;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public We()
  {
    qw = new ArrayList<Qw>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Qw getQw(int index)
  {
    Qw aQw = qw.get(index);
    return aQw;
  }

  public List<Qw> getQw()
  {
    List<Qw> newQw = Collections.unmodifiableList(qw);
    return newQw;
  }

  public int numberOfQw()
  {
    int number = qw.size();
    return number;
  }

  public boolean hasQw()
  {
    boolean has = qw.size() > 0;
    return has;
  }

  public int indexOfQw(Qw aQw)
  {
    int index = qw.indexOf(aQw);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_qw()
  {
    qw.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfQw()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addQw(Qw aQw)
  {
    boolean wasAdded = false;
    if (qw.contains(aQw)) { return false; }
    qw.add(aQw);
    if (aQw.indexOfWe(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aQw.addWe(this);
      if (!wasAdded)
      {
        qw.remove(aQw);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeQw(Qw aQw)
  {
    boolean wasRemoved = false;
    if (!qw.contains(aQw))
    {
      return wasRemoved;
    }

    int oldIndex = qw.indexOf(aQw);
    qw.remove(oldIndex);
    if (aQw.indexOfWe(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aQw.removeWe(this);
      if (!wasRemoved)
      {
        qw.add(oldIndex,aQw);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addQwAt(Qw aQw, int index)
  {  
    boolean wasAdded = false;
    if(addQw(aQw))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfQw()) { index = numberOfQw() - 1; }
      qw.remove(aQw);
      qw.add(index, aQw);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveQwAt(Qw aQw, int index)
  {
    boolean wasAdded = false;
    if(qw.contains(aQw))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfQw()) { index = numberOfQw() - 1; }
      qw.remove(aQw);
      qw.add(index, aQw);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addQwAt(aQw, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Qw> copyOfQw = new ArrayList<Qw>(qw);
    qw.clear();
    for(Qw aQw : copyOfQw)
    {
      aQw.removeWe(this);
    }
  }

}