/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 392 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Vbb extends Vb
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Vbb()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Bn getBn_Bn(int index)
  {
    Bn aBn = (Bn)super.getBn(index);
    return aBn;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Bn> getBn_Bn()
  {
    List<? extends Bn> newBn = super.getBn();
    return (List<Bn>)newBn;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfBnValid_Bn()
  {
    boolean isValid = numberOfBn() >= minimumNumberOfBn_Bn() && numberOfBn() <= maximumNumberOfBn_Bn();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfBn_Bn()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfBn_Bn()
  {
    return 4;
  }
  /* Code from template association_AddMNToOnlyOne_specialization */
  public Bn addBn()
  {
    if (numberOfBn() >= maximumNumberOfBn_Bn())
    {
      return null;
    }
    else
    {
      return new Bn();
    }
  }

  public boolean addBn(Bn aBn)
  {
    boolean wasAdded = false;
    List<Bn> bn = getBn_Bn();
    if (bn.contains(aBn)) { return false; }
    if (numberOfBn() >= maximumNumberOfBn_Bn())
    {
      return wasAdded;
    }

    Vbb existingVb = aBn.getVb_OneVbb();
    boolean isNewVb = existingVb != null && !this.equals(existingVb);

    if (isNewVb && existingVb.numberOfBn() <= minimumNumberOfBn_Bn())
    {
      return wasAdded;
    }

    wasAdded = super.addBn(aBn);
    return wasAdded;
  }

  public boolean removeBn(Bn aBn)
  {
    boolean wasRemoved = false;
    //Unable to remove aBn, as it must always have a vb
    if (this.equals(aBn.getVb()))
    {
      return wasRemoved;
    }

    //vb already at minimum (2)
    if (numberOfBn() <= minimumNumberOfBn_Bn())
    {
      return wasRemoved;
    }
    
    wasRemoved = super.removeBn(aBn);
    return wasRemoved;
  }

  public void delete()
  {
    super.delete();
  }

}