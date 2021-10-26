/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 30 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class BigElephant extends Elephant
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BigElephant()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Zebra getPoodle_OneZebra()
  {
    return super.getPoodle(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    if (getPoodle_OneZebra() != null)
    {
      getPoodle_OneZebra().clear_bob();
    }
    super.delete();
  }

}