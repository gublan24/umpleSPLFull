/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 212 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ppp extends Pp
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ppp()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Ooo getO_Ooo(int index)
  {
    Ooo aO = (Ooo)super.getO(index);
    return aO;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Ooo> getO_Ooo()
  {
    List<? extends Oo> newO = super.getO();
    return (List<Ooo>)newO;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfO_Ooo()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addO(Ooo aO)
  {
    boolean wasAdded = false;
   List<Ooo> o = getO_Ooo(); 
    if (o.contains(aO)) { return false; }
    wasAdded = super.addO(aO);

    return wasAdded;
  }


  public void delete()
  {
    ArrayList<Ooo> copyOfO = new ArrayList<Ooo>(getO_Ooo());
    clear_o();
    for(Ooo aO : copyOfO)
    {
      if (aO.numberOfP() <= Ooo.minimumNumberOfP_Ppp())
      {
        aO.delete();
      }
      else
      {
        aO.removeP(this);
      }
    }
    super.delete();
  }

}