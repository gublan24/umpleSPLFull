/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 517 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Zaa extends Za
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Zaa()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Aqq getAq_Aqq(int index)
  {
    Aqq aAq = (Aqq)super.getAq(index);
    return aAq;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Aqq> getAq_Aqq()
  {
    List<? extends Aq> newAq = super.getAq();
    return (List<Aqq>)newAq;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfAq_Aqq()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfAq_Aqq()
  {
    return 4;
  }
  /* Code from template association_AddOptionalNToOptionalOne_specialization */
  public boolean addAq(Aqq aAq)
  {
    boolean wasAdded = false;
    List<Aqq> aq = getAq_Aqq();
    if (aq.contains(aAq)) { return false; }
    if (numberOfAq() >= maximumNumberOfAq_Aqq())
    {
      return wasAdded;
    }

    wasAdded = super.addAq(aAq);
    return wasAdded;
  }
  public void delete()
  {
    while( !getAq().isEmpty() )
    {
      Aqq aAq = getAq_Aqq().get(0);
      aAq.setZa(null);
      getAq().remove(aAq);
    }
    super.delete();
  }

}