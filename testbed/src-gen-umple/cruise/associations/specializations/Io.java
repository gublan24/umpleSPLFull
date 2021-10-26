/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 323 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Io
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Io Associations
  private List<Ui> ui;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Io()
  {
    ui = new ArrayList<Ui>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Ui getUi(int index)
  {
    Ui aUi = ui.get(index);
    return aUi;
  }

  public List<Ui> getUi()
  {
    List<Ui> newUi = Collections.unmodifiableList(ui);
    return newUi;
  }

  public int numberOfUi()
  {
    int number = ui.size();
    return number;
  }

  public boolean hasUi()
  {
    boolean has = ui.size() > 0;
    return has;
  }

  public int indexOfUi(Ui aUi)
  {
    int index = ui.indexOf(aUi);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_ui()
  {
    ui.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUi()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addUi(Ui aUi)
  {
    boolean wasAdded = false;
    if (ui.contains(aUi)) { return false; }
    ui.add(aUi);
    if (aUi.indexOfIo(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUi.addIo(this);
      if (!wasAdded)
      {
        ui.remove(aUi);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeUi(Ui aUi)
  {
    boolean wasRemoved = false;
    if (!ui.contains(aUi))
    {
      return wasRemoved;
    }

    int oldIndex = ui.indexOf(aUi);
    ui.remove(oldIndex);
    if (aUi.indexOfIo(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUi.removeIo(this);
      if (!wasRemoved)
      {
        ui.add(oldIndex,aUi);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUiAt(Ui aUi, int index)
  {  
    boolean wasAdded = false;
    if(addUi(aUi))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUi()) { index = numberOfUi() - 1; }
      ui.remove(aUi);
      ui.add(index, aUi);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUiAt(Ui aUi, int index)
  {
    boolean wasAdded = false;
    if(ui.contains(aUi))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUi()) { index = numberOfUi() - 1; }
      ui.remove(aUi);
      ui.add(index, aUi);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUiAt(aUi, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Ui> copyOfUi = new ArrayList<Ui>(ui);
    ui.clear();
    for(Ui aUi : copyOfUi)
    {
      aUi.removeIo(this);
    }
  }

}