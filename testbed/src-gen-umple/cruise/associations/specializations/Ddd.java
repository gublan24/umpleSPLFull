/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 231 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ddd extends Dd
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ddd()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Fff getF_Fff(int index)
  {
    Fff aF = (Fff)super.getF(index);
    return aF;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Fff> getF_Fff()
  {
    List<? extends Ff> newF = super.getF();
    return (List<Fff>)newF;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfF_Fff()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addF(Fff aF)
  {
    boolean wasAdded = false;
   List<Fff> f = getF_Fff(); 
    if (f.contains(aF)) { return false; }
    wasAdded = super.addF(aF);

    return wasAdded;
  }


  public void delete()
  {
    ArrayList<Fff> copyOfF = new ArrayList<Fff>(getF_Fff());
    clear_f();
    for(Fff aF : copyOfF)
    {
      if (aF.numberOfD() <= Fff.minimumNumberOfD_Ddd())
      {
        aF.delete();
      }
      else
      {
        aF.removeD(this);
      }
    }
    super.delete();
  }

}