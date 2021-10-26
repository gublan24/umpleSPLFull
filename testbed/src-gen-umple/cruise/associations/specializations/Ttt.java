/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 191 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ttt extends Tt
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ttt()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Yyy getY_Yyy(int index)
  {
    Yyy aY = (Yyy)super.getY(index);
    return aY;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Yyy> getY_Yyy()
  {
    List<? extends Yy> newY = super.getY();
    return (List<Yyy>)newY;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfYValid_Yyy()
  {
    boolean isValid = numberOfY() >= minimumNumberOfY_Yyy() && numberOfY() <= maximumNumberOfY_Yyy();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod_specialization */
  public static int requiredNumberOfY_Yyy()
  {
    return 3;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfY_Yyy()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfY_Yyy()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addY(Yyy aY)
  {
    boolean wasAdded = false;
   List<Yyy> y = getY_Yyy(); 
    if (y.contains(aY)) { return false; }
    if (numberOfY() >= maximumNumberOfY_Yyy())
    {
      return wasAdded;
    }
    wasAdded = super.addY(aY);

    return wasAdded;
  }
  /* Code from template association_AddMNToMany_specialization */
  public boolean removeY(Yyy aY)
  {
    boolean wasRemoved = false;

    if (numberOfY() <= minimumNumberOfY_Yyy())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeY(aY);

    return wasRemoved;
  }
  /* Code from template association_SetMNToMany_specialization */
  public boolean setY(Yyy... newY)
  {
    boolean wasSet = false;
    ArrayList<Yyy> verifiedY = new ArrayList<Yyy>();
    for (Yyy aY : newY)
    {
      if (verifiedY.contains(aY))
      {
        continue;
      }
      verifiedY.add(aY);
    }

    if (verifiedY.size() != newY.length || verifiedY.size() < minimumNumberOfY_Yyy() || verifiedY.size() > maximumNumberOfY_Yyy())
    {
      return wasSet;
    }

    super.clear_y();
    for ( Yyy orphan : newY)
    {
      addY(orphan);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Yyy> copyOfY = new ArrayList<Yyy>(getY_Yyy());
    clear_y();
    for(Yyy aY : copyOfY)
    {
      if (aY.numberOfT() <= Yyy.minimumNumberOfT_Ttt())
      {
        aY.delete();
      }
      else
      {
        aY.removeT(this);
      }
    }
    super.delete();
  }

}