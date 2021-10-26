/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 500 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Oll extends Ol
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Oll()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Koo getKo_OneKoo()
  {
    return (Koo)super.getKo(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    if (getKo_OneKoo() != null)
    {
      Koo placeholderKo = getKo_OneKoo();
      clear_ko();
      placeholderKo.removeOl(this);
    }
    super.delete();
  }

}