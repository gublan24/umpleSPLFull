/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 553 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Evv extends Ev
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Evv(Vff... allVf)
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Vff getVf_Vff(int index)
  {
    Vff aVf = (Vff)super.getVf(index);
    return aVf;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Vff> getVf_Vff()
  {
    List<? extends Vf> newVf = super.getVf();
    return (List<Vff>)newVf;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfVf_Vff()
  {
    return 4;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfVf_Vff()
  {
    return 5;
  }
  /* Code from template association_AddUnidirectionalMN_specialization */
  public boolean addVf(Vff aVf)
  {
    boolean wasAdded = false;
    List<Vff> vf = getVf_Vff();
    if (vf.contains(aVf)) { return false; }
    if (numberOfVf() < maximumNumberOfVf_Vff())
    {
      wasAdded = super.addVf(aVf);
    }
    return wasAdded;
  }

  public boolean removeVf(Vff aVf)
  {
    boolean wasRemoved = false;

    if (numberOfVf() <= minimumNumberOfVf_Vff())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeVf(aVf);
    return wasRemoved;
  }
  /* Code from template association_SetUnidirectionalMN_specialization */
  public boolean setVf(Vff... newVf)
  {
    boolean wasSet = false;
    ArrayList<Vff> verifiedVf = new ArrayList<Vff>();
    for (Vff aVf : newVf)
    {
      if (verifiedVf.contains(aVf))
      {
        continue;
      }
      verifiedVf.add(aVf);
    }

    if (verifiedVf.size() != newVf.length || verifiedVf.size() < minimumNumberOfVf_Vff() || verifiedVf.size() > maximumNumberOfVf_Vff())
    {
      return wasSet;
    }
    
    clear_vf();
    for ( Vff orphan : newVf )
    {
      addVf(orphan);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    clear_vf();
    super.delete();
  }

}