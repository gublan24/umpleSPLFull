/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 352 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Dff extends Df
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Dff()
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
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfFg_Fg()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addFg(Fg aFg)
  {
    boolean wasAdded = false;
   List<Fg> fg = getFg_Fg(); 
    if (fg.contains(aFg)) { return false; }
    wasAdded = super.addFg(aFg);

    return wasAdded;
  }


  public void delete()
  {
    ArrayList<Fg> copyOfFg = new ArrayList<Fg>(getFg());
    clear_fg();
    for(Fg aFg : copyOfFg)
    {
      if (aFg.numberOfDf() <= Fg.minimumNumberOfDf_Dff())
      {
        aFg.delete();
      }
      else
      {
        aFg.removeDf(this);
      }
    }
    super.delete();
  }

}