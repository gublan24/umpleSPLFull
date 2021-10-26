/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 297 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Qww extends Qw
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Qww()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Wee getWe_Wee(int index)
  {
    Wee aWe = (Wee)super.getWe(index);
    return aWe;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Wee> getWe_Wee()
  {
    List<? extends We> newWe = super.getWe();
    return (List<Wee>)newWe;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfWe_Wee()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addWe(Wee aWe)
  {
    boolean wasAdded = false;
   List<Wee> we = getWe_Wee(); 
    if (we.contains(aWe)) { return false; }
    wasAdded = super.addWe(aWe);

    return wasAdded;
  }


  public void delete()
  {
    ArrayList<Wee> copyOfWe = new ArrayList<Wee>(getWe_Wee());
    clear_we();
    for(Wee aWe : copyOfWe)
    {
      aWe.removeQw(this);
    }
    super.delete();
  }

}