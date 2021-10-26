/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 242 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Hhh extends Hh
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Hhh()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Ggg getG_Ggg(int index)
  {
    Ggg aG = (Ggg)super.getG(index);
    return aG;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Ggg> getG_Ggg()
  {
    List<? extends Gg> newG = super.getG();
    return (List<Ggg>)newG;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_RequiredNumberOfMethod_specialization */
  public static int requiredNumberOfG_Ggg()
  {
    return 5;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfG_Ggg()
  {
    return 5;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfG_Ggg()
  {
    return 5;
  }
  /* Code from template association_SetNToOptionalOne_specialization */
  public boolean setG(Ggg... newG)
  {
    boolean wasSet = false;
    ArrayList<Ggg> checkNewG = new ArrayList<Ggg>();
    for (Ggg aG : newG)
    {
      if (checkNewG.contains(aG))
      {
        return wasSet;
      }
      else if (aG.getH() != null && !this.equals(aG.getH()))
      {
        return wasSet;
      }
      checkNewG.add(aG);
    }

    if (checkNewG.size() != minimumNumberOfG_Ggg())
    {
      return wasSet;
    }

    super.clear_g();
    for ( Ggg orphan : newG )
    {
      addG(orphan);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setH(Ggg aG, Hhh aH)
  {
    try
    {
      java.lang.reflect.Field mentorField = aG.getClass().getDeclaredField("h");
      mentorField.setAccessible(true);
      mentorField.set(aG, aH);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aH to aG", e);
    }
  }

  public void delete()
  {
    for(Ggg aG : getG_Ggg())
    {
      setH(aG,null);
    }
    clear_g();
    super.delete();
  }

}