/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 384 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Xcc extends Xc
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Xcc()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Cvv getCvv_Cvv(int index)
  {
    Cvv aCvv = (Cvv)super.getCvv(index);
    return aCvv;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Cvv> getCvv_Cvv()
  {
    List<? extends Cvv> newCvv = super.getCvv();
    return (List<Cvv>)newCvv;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfCvvValid_Cvv()
  {
    boolean isValid = numberOfCvv() >= minimumNumberOfCvv_Cvv() && numberOfCvv() <= maximumNumberOfCvv_Cvv();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfCvv_Cvv()
  {
    return 5;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfCvv_Cvv()
  {
    return 7;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addCvv(Cvv aCvv)
  {
    boolean wasAdded = false;
   List<Cvv> cvv = getCvv_Cvv(); 
    if (cvv.contains(aCvv)) { return false; }
    if (numberOfCvv() >= maximumNumberOfCvv_Cvv())
    {
      return wasAdded;
    }
    wasAdded = super.addCvv(aCvv);

    return wasAdded;
  }
  /* Code from template association_AddMNToMany_specialization */
  public boolean removeCvv(Cvv aCvv)
  {
    boolean wasRemoved = false;

    if (numberOfCvv() <= minimumNumberOfCvv_Cvv())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeCvv(aCvv);

    return wasRemoved;
  }
  /* Code from template association_SetMNToMany_specialization */
  public boolean setCvv(Cvv... newCvv)
  {
    boolean wasSet = false;
    ArrayList<Cvv> verifiedCvv = new ArrayList<Cvv>();
    for (Cvv aCvv : newCvv)
    {
      if (verifiedCvv.contains(aCvv))
      {
        continue;
      }
      verifiedCvv.add(aCvv);
    }

    if (verifiedCvv.size() != newCvv.length || verifiedCvv.size() < minimumNumberOfCvv_Cvv() || verifiedCvv.size() > maximumNumberOfCvv_Cvv())
    {
      return wasSet;
    }

    super.clear_cvv();
    for ( Cvv orphan : newCvv)
    {
      addCvv(orphan);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Cvv> copyOfCvv = new ArrayList<Cvv>(getCvv_Cvv());
    clear_cvv();
    for(Cvv aCvv : copyOfCvv)
    {
      aCvv.removeXc(this);
    }
    super.delete();
  }

}