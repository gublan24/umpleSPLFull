/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 508 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Lpp extends Lp
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Lpp()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Pqq getPq_Pqq(int index)
  {
    Pqq aPq = (Pqq)super.getPq(index);
    return aPq;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Pqq> getPq_Pqq()
  {
    List<? extends Pq> newPq = super.getPq();
    return (List<Pqq>)newPq;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfPq_Pqq()
  {
    return 0;
  }

  public void delete()
  {
    while (getPq_Pqq().size() > 0)
    {
      Pqq aPq = getPq_Pqq().get(getPq_Pqq().size() - 1);
      aPq.delete();
      getPq_Pqq().remove(aPq);
    }
    
    super.delete();
  }

}