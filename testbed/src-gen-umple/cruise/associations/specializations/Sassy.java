/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 342 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Sassy extends Sass
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Sassy()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Sdd getSd_Sdd(int index)
  {
    Sdd aSd = (Sdd)super.getSd(index);
    return aSd;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Sdd> getSd_Sdd()
  {
    List<? extends Sd> newSd = super.getSd();
    return (List<Sdd>)newSd;
  }
  /* Code from template association_GetMany_specialization */
  public Sd getSd_Sd(int index)
  {
    Sd aSd = (Sd)super.getSd(index);
    return aSd;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Sd> getSd_Sd()
  {
    List<? extends Sd> newSd = super.getSd();
    return (List<Sd>)newSd;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfSd_Sdd()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfSd_Sdd()
  {
    return 4;
  }
  /* Code from template association_AddOptionalNToOptionalOne_specialization */
  public boolean addSd(Sdd aSd)
  {
    boolean wasAdded = false;
    List<Sdd> sd = getSd_Sdd();
    if (sd.contains(aSd)) { return false; }
    if (sd.contains(aSd)) { return false; }
    if (numberOfSd() >= maximumNumberOfSd_Sdd())
    {
      return wasAdded;
    }

    wasAdded = super.addSd(aSd);
    return wasAdded;
  }  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfSd_Sd()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfSd_Sd()
  {
    return 3;
  }
  /* Code from template association_AddOptionalNToOptionalOne_specialization */
  public boolean addSd(Sd aSd)
  {
    boolean wasAdded = false;
    List<Sd> sd = getSd_Sd();
    if (sd.contains(aSd)) { return false; }
    if (sd.contains(aSd)) { return false; }
    if (numberOfSd() >= maximumNumberOfSd_Sd())
    {
      return wasAdded;
    }

    wasAdded = super.addSd(aSd);
    return wasAdded;
  }
  public void delete()
  {
    for( Sdd orphan : getSd_Sdd() )
    {
      orphan.clear_sass();
    }
    for( Sd orphan : getSd_Sd() )
    {
      orphan.clear_sass();
    }
    super.delete();
  }

}