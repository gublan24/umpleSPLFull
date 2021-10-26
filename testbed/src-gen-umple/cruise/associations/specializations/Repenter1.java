/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

// line 107 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Repenter1 extends Repent1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Repenter1()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Serendipity2 getSeren_OneSerendipity2()
  {
    return (Serendipity2)super.getSeren();
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {

    Serendipity2 existingSeren = getSeren_OneSerendipity2();
    super.clear_seren();
    if (existingSeren != null)
    {
      existingSeren.delete();
    }
    super.delete();
  }

}