/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 279 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Vvv extends Vv
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Vvv()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Bbb getB_Bbb(int index)
  {
    Bbb aB = (Bbb)super.getB(index);
    return aB;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Bbb> getB_Bbb()
  {
    List<? extends Bb> newB = super.getB();
    return (List<Bbb>)newB;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfB_Bbb()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfB_Bbb()
  {
    return 7;
  }
  /* Code from template association_AddOptionalNToOne_specialization */
  public Bbb addB()
  {
    if (numberOfB() >= maximumNumberOfB_Bbb())
    {
      return null;
    }
    else
    {
      return new Bbb();
    }
  }

  public boolean addB(Bbb aB)
  {
    boolean wasAdded = false;
    List<Bbb> b = getB_Bbb();
    if (b.contains(aB)) { return false; }
    if (numberOfB() >= maximumNumberOfB_Bbb())
    {
      return wasAdded;
    }

    wasAdded = super.addB(aB);
    return wasAdded;
  }
  public void delete()
  {
    super.delete();
  }

}