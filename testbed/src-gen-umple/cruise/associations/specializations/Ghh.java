/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 360 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ghh extends Gh
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ghh()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Fg getFg_Fg(int index)
  {
    Fg aFg = (Fg)super.getFg(index);
    return aFg;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Fg> getFg_Fg()
  {
    List<? extends Fg> newFg = super.getFg();
    return (List<Fg>)newFg;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfFgValid_Fg()
  {
    boolean isValid = numberOfFg() >= minimumNumberOfFg_Fg() && numberOfFg() <= maximumNumberOfFg_Fg();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfFg_Fg()
  {
    return 4;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfFg_Fg()
  {
    return 6;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addFg(Fg aFg)
  {
    boolean wasAdded = false;
   List<Fg> fg = getFg_Fg(); 
    if (fg.contains(aFg)) { return false; }
    if (numberOfFg() >= maximumNumberOfFg_Fg())
    {
      return wasAdded;
    }
    wasAdded = super.addFg(aFg);

    return wasAdded;
  }
  /* Code from template association_AddMNToMany_specialization */
  public boolean removeFg(Fg aFg)
  {
    boolean wasRemoved = false;

    if (numberOfFg() <= minimumNumberOfFg_Fg())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeFg(aFg);

    return wasRemoved;
  }
  /* Code from template association_SetMNToMany_specialization */
  public boolean setFg(Fg... newFg)
  {
    boolean wasSet = false;
    ArrayList<Fg> verifiedFg = new ArrayList<Fg>();
    for (Fg aFg : newFg)
    {
      if (verifiedFg.contains(aFg))
      {
        continue;
      }
      verifiedFg.add(aFg);
    }

    if (verifiedFg.size() != newFg.length || verifiedFg.size() < minimumNumberOfFg_Fg() || verifiedFg.size() > maximumNumberOfFg_Fg())
    {
      return wasSet;
    }

    super.clear_fg();
    for ( Fg orphan : newFg)
    {
      addFg(orphan);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Fg> copyOfFg = new ArrayList<Fg>(getFg_Fg());
    clear_fg();
    for(Fg aFg : copyOfFg)
    {
      aFg.removeGh(this);
    }
    super.delete();
  }

}