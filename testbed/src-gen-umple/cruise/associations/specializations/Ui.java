/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [30]
 */
// line 322 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ui
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ui Associations
  private List<Io> io;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ui()
  {
    io = new ArrayList<Io>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Io getIo(int index)
  {
    Io aIo = io.get(index);
    return aIo;
  }

  public List<Io> getIo()
  {
    List<Io> newIo = Collections.unmodifiableList(io);
    return newIo;
  }

  public int numberOfIo()
  {
    int number = io.size();
    return number;
  }

  public boolean hasIo()
  {
    boolean has = io.size() > 0;
    return has;
  }

  public int indexOfIo(Io aIo)
  {
    int index = io.indexOf(aIo);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_io()
  {
    io.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfIo()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addIo(Io aIo)
  {
    boolean wasAdded = false;
    if (io.contains(aIo)) { return false; }
    io.add(aIo);
    if (aIo.indexOfUi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aIo.addUi(this);
      if (!wasAdded)
      {
        io.remove(aIo);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeIo(Io aIo)
  {
    boolean wasRemoved = false;
    if (!io.contains(aIo))
    {
      return wasRemoved;
    }

    int oldIndex = io.indexOf(aIo);
    io.remove(oldIndex);
    if (aIo.indexOfUi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aIo.removeUi(this);
      if (!wasRemoved)
      {
        io.add(oldIndex,aIo);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addIoAt(Io aIo, int index)
  {  
    boolean wasAdded = false;
    if(addIo(aIo))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfIo()) { index = numberOfIo() - 1; }
      io.remove(aIo);
      io.add(index, aIo);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveIoAt(Io aIo, int index)
  {
    boolean wasAdded = false;
    if(io.contains(aIo))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfIo()) { index = numberOfIo() - 1; }
      io.remove(aIo);
      io.add(index, aIo);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addIoAt(aIo, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Io> copyOfIo = new ArrayList<Io>(io);
    io.clear();
    for(Io aIo : copyOfIo)
    {
      aIo.removeUi(this);
    }
  }

}