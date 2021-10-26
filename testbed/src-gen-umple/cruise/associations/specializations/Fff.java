/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 232 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Fff extends Ff
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Fff()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Ddd getD_Ddd(int index)
  {
    Ddd aD = (Ddd)super.getD(index);
    return aD;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Ddd> getD_Ddd()
  {
    List<? extends Dd> newD = super.getD();
    return (List<Ddd>)newD;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfDValid_Ddd()
  {
    boolean isValid = numberOfD() >= minimumNumberOfD_Ddd();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfD_Ddd()
  {
    return 2;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addD(Ddd aD)
  {
    boolean wasAdded = false;
   List<Ddd> d = getD_Ddd(); 
    if (d.contains(aD)) { return false; }
    wasAdded = super.addD(aD);

    return wasAdded;
  }
  /* Code from template association_AddMStarToMany_specialization */
  public boolean removeD(Ddd aD)
  {
    boolean wasRemoved = false;

    if (numberOfD() <= minimumNumberOfD_Ddd())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeD(aD);

    return wasRemoved;
  }
  /* Code from template association_SetMStarToMany_specialization */
  public boolean setD(Ddd... newD)
  {
    boolean wasSet = false;
    ArrayList<Ddd> verifiedD = new ArrayList<Ddd>();
    for (Ddd aD : newD)
    {
      if (verifiedD.contains(aD))
      {
        continue;
      }
      verifiedD.add(aD);
    }

    if (verifiedD.size() != newD.length || verifiedD.size() < minimumNumberOfD_Ddd())
    {
      return wasSet;
    }
    
    super.clear_d();
    for ( Ddd orphan : newD )
    {
      addD(orphan);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Ddd> copyOfD = new ArrayList<Ddd>(getD_Ddd());
    clear_d();
    for(Ddd aD : copyOfD)
    {
      aD.removeF(this);
    }
    super.delete();
  }

}