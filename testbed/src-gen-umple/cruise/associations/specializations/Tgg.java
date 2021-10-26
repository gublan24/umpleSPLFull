/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 459 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Tgg extends Tg
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Tgg(Gb... allGb)
  {
    super(allGb);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Gb getGb_Gb(int index)
  {
    Gb aGb = (Gb)super.getGb(index);
    return aGb;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Gb> getGb_Gb()
  {
    List<? extends Gb> newGb = super.getGb();
    return (List<Gb>)newGb;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfGbValid_Gb()
  {
    boolean isValid = numberOfGb() >= minimumNumberOfGb_Gb() && numberOfGb() <= maximumNumberOfGb_Gb();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfGb_Gb()
  {
    return 6;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfGb_Gb()
  {
    return 8;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addGb(Gb aGb)
  {
    boolean wasAdded = false;
   List<Gb> gb = getGb_Gb(); 
    if (gb.contains(aGb)) { return false; }
    if (numberOfGb() >= maximumNumberOfGb_Gb())
    {
      return wasAdded;
    }
    wasAdded = super.addGb(aGb);

    return wasAdded;
  }
  /* Code from template association_AddMNToMany_specialization */
  public boolean removeGb(Gb aGb)
  {
    boolean wasRemoved = false;

    if (numberOfGb() <= minimumNumberOfGb_Gb())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeGb(aGb);

    return wasRemoved;
  }
  /* Code from template association_SetMNToMany_specialization */
  public boolean setGb(Gb... newGb)
  {
    boolean wasSet = false;
    ArrayList<Gb> verifiedGb = new ArrayList<Gb>();
    for (Gb aGb : newGb)
    {
      if (verifiedGb.contains(aGb))
      {
        continue;
      }
      verifiedGb.add(aGb);
    }

    if (verifiedGb.size() != newGb.length || verifiedGb.size() < minimumNumberOfGb_Gb() || verifiedGb.size() > maximumNumberOfGb_Gb())
    {
      return wasSet;
    }

    wasSet = super.setGb(newGb);
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Gb> copyOfGb = new ArrayList<Gb>(getGb_Gb());
    clear_gb();
    for(Gb aGb : copyOfGb)
    {
      aGb.removeTg(this);
    }
    super.delete();
  }

}