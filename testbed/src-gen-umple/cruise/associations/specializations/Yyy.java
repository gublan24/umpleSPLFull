/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 192 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Yyy extends Yy
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Yyy()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Ttt getT_Ttt(int index)
  {
    Ttt aT = (Ttt)super.getT(index);
    return aT;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Ttt> getT_Ttt()
  {
    List<? extends Tt> newT = super.getT();
    return (List<Ttt>)newT;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfTValid_Ttt()
  {
    boolean isValid = numberOfT() >= minimumNumberOfT_Ttt() && numberOfT() <= maximumNumberOfT_Ttt();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfT_Ttt()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfT_Ttt()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addT(Ttt aT)
  {
    boolean wasAdded = false;
   List<Ttt> t = getT_Ttt(); 
    if (t.contains(aT)) { return false; }
    if (numberOfT() >= maximumNumberOfT_Ttt())
    {
      return wasAdded;
    }
    wasAdded = super.addT(aT);

    return wasAdded;
  }
  /* Code from template association_AddMNToMany_specialization */
  public boolean removeT(Ttt aT)
  {
    boolean wasRemoved = false;

    if (numberOfT() <= minimumNumberOfT_Ttt())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeT(aT);

    return wasRemoved;
  }
  /* Code from template association_SetMNToMany_specialization */
  public boolean setT(Ttt... newT)
  {
    boolean wasSet = false;
    ArrayList<Ttt> verifiedT = new ArrayList<Ttt>();
    for (Ttt aT : newT)
    {
      if (verifiedT.contains(aT))
      {
        continue;
      }
      verifiedT.add(aT);
    }

    if (verifiedT.size() != newT.length || verifiedT.size() < minimumNumberOfT_Ttt() || verifiedT.size() > maximumNumberOfT_Ttt())
    {
      return wasSet;
    }

    super.clear_t();
    for ( Ttt orphan : newT)
    {
      addT(orphan);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Ttt> copyOfT = new ArrayList<Ttt>(getT_Ttt());
    clear_t();
    for(Ttt aT : copyOfT)
    {
      if (aT.numberOfY() <= Ttt.minimumNumberOfY_Yyy())
      {
        aT.delete();
      }
      else
      {
        aT.removeY(this);
      }
    }
    super.delete();
  }

}