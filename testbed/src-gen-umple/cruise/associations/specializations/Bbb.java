/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 280 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Bbb extends Bb
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Bbb()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Vvv getV_OneVvv()
  {
    return (Vvv)super.getV(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_SetOneToAtMostN_specialization */
  public boolean setV(Vvv aV)
  {
    boolean wasSet = false;
    //Must provide v to b
    if (aV == null)
    {
      return wasSet;
    }

    //v already at maximum (7)
    if (aV.numberOfB() >= Vvv.maximumNumberOfB_Bbb())
    {
      return wasSet;
    }

    super.clear_v();
    wasSet = addV(aV);
    return wasSet;
  }

  public void delete()
  {
    Vvv placeholderV = getV_OneVvv();
    clear_v();
    placeholderV.removeB(this);
    super.delete();
  }

}