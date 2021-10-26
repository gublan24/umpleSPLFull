/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 298 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Wee extends We
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Wee()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Qww getQw_Qww(int index)
  {
    Qww aQw = (Qww)super.getQw(index);
    return aQw;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Qww> getQw_Qww()
  {
    List<? extends Qw> newQw = super.getQw();
    return (List<Qww>)newQw;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfQw_Qww()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfQw_Qww()
  {
    return 6;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addQw(Qww aQw)
  {
    boolean wasAdded = false;
   List<Qww> qw = getQw_Qww(); 
    if (qw.contains(aQw)) { return false; }
    if (numberOfQw() >= maximumNumberOfQw_Qww())
    {
      return wasAdded;
    }
    wasAdded = super.addQw(aQw);

    return wasAdded;
  }


  public void delete()
  {
    ArrayList<Qww> copyOfQw = new ArrayList<Qww>(getQw_Qww());
    clear_qw();
    for(Qww aQw : copyOfQw)
    {
      aQw.removeWe(this);
    }
    super.delete();
  }

}