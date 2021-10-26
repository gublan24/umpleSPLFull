/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 270 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Xxx extends Xx
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Xxx()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Ccc getC_Ccc(int index)
  {
    Ccc aC = (Ccc)super.getC(index);
    return aC;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Ccc> getC_Ccc()
  {
    List<? extends Cc> newC = super.getC();
    return (List<Ccc>)newC;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfC_Ccc()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne_specialization */
  public Ccc addC()
  {
    // need to keep this because of the type differences between sub & super classes
    return new Ccc();
  }
  public void delete()
  {
    super.delete();
  }

}