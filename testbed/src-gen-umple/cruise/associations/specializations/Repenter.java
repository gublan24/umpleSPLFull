/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

// line 97 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Repenter extends Repent
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Repenter()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Serendipity getSeren_OneSerendipity()
  {
    return super.getSeren();
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {

    Serendipity existingSeren = getSeren_OneSerendipity();
    super.clear_seren();
    if (existingSeren != null)
    {
      existingSeren.delete();
    }
    super.delete();
  }

}