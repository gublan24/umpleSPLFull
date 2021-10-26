/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 287 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Nn
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Nn Associations
  private List<Mm> m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Nn()
  {
    m = new ArrayList<Mm>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Mm getM(int index)
  {
    Mm aM = m.get(index);
    return aM;
  }

  public List<Mm> getM()
  {
    List<Mm> newM = Collections.unmodifiableList(m);
    return newM;
  }

  public int numberOfM()
  {
    int number = m.size();
    return number;
  }

  public boolean hasM()
  {
    boolean has = m.size() > 0;
    return has;
  }

  public int indexOfM(Mm aM)
  {
    int index = m.indexOf(aM);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_m()
  {
    m.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfM()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addM(Mm aM)
  {
    boolean wasAdded = false;
    if (m.contains(aM)) { return false; }
    m.add(aM);
    if (aM.indexOfN(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aM.addN(this);
      if (!wasAdded)
      {
        m.remove(aM);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeM(Mm aM)
  {
    boolean wasRemoved = false;
    if (!m.contains(aM))
    {
      return wasRemoved;
    }

    int oldIndex = m.indexOf(aM);
    m.remove(oldIndex);
    if (aM.indexOfN(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aM.removeN(this);
      if (!wasRemoved)
      {
        m.add(oldIndex,aM);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMAt(Mm aM, int index)
  {  
    boolean wasAdded = false;
    if(addM(aM))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfM()) { index = numberOfM() - 1; }
      m.remove(aM);
      m.add(index, aM);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMAt(Mm aM, int index)
  {
    boolean wasAdded = false;
    if(m.contains(aM))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfM()) { index = numberOfM() - 1; }
      m.remove(aM);
      m.add(index, aM);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMAt(aM, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Mm> copyOfM = new ArrayList<Mm>(m);
    m.clear();
    for(Mm aM : copyOfM)
    {
      aM.removeN(this);
    }
  }

}