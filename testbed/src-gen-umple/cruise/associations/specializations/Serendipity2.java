/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

// line 108 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Serendipity2 extends Serendipity1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Serendipity2()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Repenter1 getRep_OneRepenter1()
  {
    return (Repenter1)super.getRep();
  }
  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {

    Repenter1 existingRep = getRep_OneRepenter1();
    super.clear_rep();
    if (existingRep != null)
    {
      existingRep.delete();
    }
    super.delete();
  }

}