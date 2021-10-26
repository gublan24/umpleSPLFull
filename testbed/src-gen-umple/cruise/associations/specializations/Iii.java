/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 202 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Iii extends Ii
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Iii()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Uuu getU_Uuu(int index)
  {
    Uuu aU = (Uuu)super.getU(index);
    return aU;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Uuu> getU_Uuu()
  {
    List<? extends Uu> newU = super.getU();
    return (List<Uuu>)newU;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfU_Uuu()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfU_Uuu()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addU(Uuu aU)
  {
    boolean wasAdded = false;
   List<Uuu> u = getU_Uuu(); 
    if (u.contains(aU)) { return false; }
    if (numberOfU() >= maximumNumberOfU_Uuu())
    {
      return wasAdded;
    }
    wasAdded = super.addU(aU);

    return wasAdded;
  }


  public void delete()
  {
    ArrayList<Uuu> copyOfU = new ArrayList<Uuu>(getU_Uuu());
    clear_u();
    for(Uuu aU : copyOfU)
    {
      if (aU.numberOfI() <= Uuu.minimumNumberOfI_Iii())
      {
        aU.delete();
      }
      else
      {
        aU.removeI(this);
      }
    }
    super.delete();
  }

}