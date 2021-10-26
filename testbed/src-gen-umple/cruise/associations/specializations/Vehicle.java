/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * Wheel -- Vehicle, Bicycle, Unicycle test                       [13]
 */
// line 159 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Vehicle
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Vehicle Associations
  private List<Wheel> wheel;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Vehicle()
  {
    wheel = new ArrayList<Wheel>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Wheel getWheel(int index)
  {
    Wheel aWheel = wheel.get(index);
    return aWheel;
  }

  public List<Wheel> getWheel()
  {
    List<Wheel> newWheel = Collections.unmodifiableList(wheel);
    return newWheel;
  }

  public int numberOfWheel()
  {
    int number = wheel.size();
    return number;
  }

  public boolean hasWheel()
  {
    boolean has = wheel.size() > 0;
    return has;
  }

  public int indexOfWheel(Wheel aWheel)
  {
    int index = wheel.indexOf(aWheel);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_wheel()
  {
    wheel.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWheel()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addWheel(Wheel aWheel)
  {
    boolean wasAdded = false;
    if (wheel.contains(aWheel)) { return false; }
    Vehicle existingVehicle = aWheel.getVehicle();
    if (existingVehicle == null)
    {
      aWheel.setVehicle(this);
    }
    else if (!this.equals(existingVehicle))
    {
      existingVehicle.removeWheel(aWheel);
      addWheel(aWheel);
    }
    else
    {
      wheel.add(aWheel);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeWheel(Wheel aWheel)
  {
    boolean wasRemoved = false;
    if (wheel.contains(aWheel))
    {
      wheel.remove(aWheel);
      aWheel.setVehicle(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addWheelAt(Wheel aWheel, int index)
  {  
    boolean wasAdded = false;
    if(addWheel(aWheel))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWheel()) { index = numberOfWheel() - 1; }
      wheel.remove(aWheel);
      wheel.add(index, aWheel);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveWheelAt(Wheel aWheel, int index)
  {
    boolean wasAdded = false;
    if(wheel.contains(aWheel))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWheel()) { index = numberOfWheel() - 1; }
      wheel.remove(aWheel);
      wheel.add(index, aWheel);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addWheelAt(aWheel, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !wheel.isEmpty() )
    {
      wheel.get(0).setVehicle(null);
    }
  }

}