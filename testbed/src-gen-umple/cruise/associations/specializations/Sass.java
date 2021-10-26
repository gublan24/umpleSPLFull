/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [32]
 */
// line 340 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Sass
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Sass Associations
  private List<Sd> sd;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Sass()
  {
    sd = new ArrayList<Sd>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Sd getSd(int index)
  {
    Sd aSd = sd.get(index);
    return aSd;
  }

  public List<Sd> getSd()
  {
    List<Sd> newSd = Collections.unmodifiableList(sd);
    return newSd;
  }

  public int numberOfSd()
  {
    int number = sd.size();
    return number;
  }

  public boolean hasSd()
  {
    boolean has = sd.size() > 0;
    return has;
  }

  public int indexOfSd(Sd aSd)
  {
    int index = sd.indexOf(aSd);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_sd()
  {
    sd.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSd()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSd(Sd aSd)
  {
    boolean wasAdded = false;
    if (sd.contains(aSd)) { return false; }
    sd.add(aSd);
    if (aSd.indexOfSass(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSd.addSass(this);
      if (!wasAdded)
      {
        sd.remove(aSd);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSd(Sd aSd)
  {
    boolean wasRemoved = false;
    if (!sd.contains(aSd))
    {
      return wasRemoved;
    }

    int oldIndex = sd.indexOf(aSd);
    sd.remove(oldIndex);
    if (aSd.indexOfSass(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSd.removeSass(this);
      if (!wasRemoved)
      {
        sd.add(oldIndex,aSd);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSdAt(Sd aSd, int index)
  {  
    boolean wasAdded = false;
    if(addSd(aSd))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSd()) { index = numberOfSd() - 1; }
      sd.remove(aSd);
      sd.add(index, aSd);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSdAt(Sd aSd, int index)
  {
    boolean wasAdded = false;
    if(sd.contains(aSd))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSd()) { index = numberOfSd() - 1; }
      sd.remove(aSd);
      sd.add(index, aSd);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSdAt(aSd, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Sd> copyOfSd = new ArrayList<Sd>(sd);
    sd.clear();
    for(Sd aSd : copyOfSd)
    {
      aSd.removeSass(this);
    }
  }

}