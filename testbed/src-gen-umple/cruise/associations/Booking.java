/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations;

// line 12 "../../TestHarnessAssociationClass.ump"
public class Booking
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Booking Associations
  private Flight flight;
  private Passenger passenger;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetFlight;
  private boolean canSetPassenger;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Booking(Flight aFlight, Passenger aPassenger)
  {
    cachedHashCode = -1;
    canSetFlight = true;
    canSetPassenger = true;
    boolean didAddFlight = setFlight(aFlight);
    if (!didAddFlight)
    {
      throw new RuntimeException("Unable to create booking due to flight. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddPassenger = setPassenger(aPassenger);
    if (!didAddPassenger)
    {
      throw new RuntimeException("Unable to create booking due to passenger. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Flight getFlight()
  {
    return flight;
  }
  /* Code from template association_GetOne */
  public Passenger getPassenger()
  {
    return passenger;
  }
  /* Code from template association_SetOneToManyAssociationClass */
  public boolean setFlight(Flight aFlight)
  {
    boolean wasSet = false;
    if (!canSetFlight) { return false; }
    if (aFlight == null)
    {
      return wasSet;
    }

    Flight existingFlight = flight;
    flight = aFlight;
    if (existingFlight != null && !existingFlight.equals(aFlight))
    {
      existingFlight.removeBooking(this);
    }
    if (!flight.addBooking(this))
    {
      flight = existingFlight;
      wasSet = false;
    }
    else
    {
      wasSet = true;
    }
    return wasSet;
  }
  /* Code from template association_SetOneToManyAssociationClass */
  public boolean setPassenger(Passenger aPassenger)
  {
    boolean wasSet = false;
    if (!canSetPassenger) { return false; }
    if (aPassenger == null)
    {
      return wasSet;
    }

    Passenger existingPassenger = passenger;
    passenger = aPassenger;
    if (existingPassenger != null && !existingPassenger.equals(aPassenger))
    {
      existingPassenger.removeBooking(this);
    }
    if (!passenger.addBooking(this))
    {
      passenger = existingPassenger;
      wasSet = false;
    }
    else
    {
      wasSet = true;
    }
    return wasSet;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    Booking compareTo = (Booking)obj;
  
    if (getFlight() == null && compareTo.getFlight() != null)
    {
      return false;
    }
    else if (getFlight() != null && !getFlight().equals(compareTo.getFlight()))
    {
      return false;
    }

    if (getPassenger() == null && compareTo.getPassenger() != null)
    {
      return false;
    }
    else if (getPassenger() != null && !getPassenger().equals(compareTo.getPassenger()))
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
    if (getFlight() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getFlight().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }
    if (getPassenger() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getPassenger().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetFlight = false;
    canSetPassenger = false;
    return cachedHashCode;
  }

  public void delete()
  {
    Flight placeholderFlight = flight;
    this.flight = null;
    if(placeholderFlight != null)
    {
      placeholderFlight.removeBooking(this);
    }
    Passenger placeholderPassenger = passenger;
    this.passenger = null;
    if(placeholderPassenger != null)
    {
      placeholderPassenger.removeBooking(this);
    }
  }

}