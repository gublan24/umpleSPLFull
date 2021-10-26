/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 408 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Qaa extends Qa
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Qaa()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Az getAz_Az(int index)
  {
    Az aAz = (Az)super.getAz(index);
    return aAz;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Az> getAz_Az()
  {
    List<? extends Az> newAz = super.getAz();
    return (List<Az>)newAz;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfAzValid_Az()
  {
    boolean isValid = numberOfAz() >= minimumNumberOfAz_Az();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfAz_Az()
  {
    return 4;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addAz(Az aAz)
  {
    boolean wasAdded = false;
   List<Az> az = getAz_Az(); 
    if (az.contains(aAz)) { return false; }
    wasAdded = super.addAz(aAz);

    return wasAdded;
  }
  /* Code from template association_AddMStarToMany_specialization */
  public boolean removeAz(Az aAz)
  {
    boolean wasRemoved = false;

    if (numberOfAz() <= minimumNumberOfAz_Az())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeAz(aAz);

    return wasRemoved;
  }
  /* Code from template association_SetMStarToMany_specialization */
  public boolean setAz(Az... newAz)
  {
    boolean wasSet = false;
    ArrayList<Az> verifiedAz = new ArrayList<Az>();
    for (Az aAz : newAz)
    {
      if (verifiedAz.contains(aAz))
      {
        continue;
      }
      verifiedAz.add(aAz);
    }

    if (verifiedAz.size() != newAz.length || verifiedAz.size() < minimumNumberOfAz_Az())
    {
      return wasSet;
    }
    
    super.clear_az();
    for ( Az orphan : newAz )
    {
      addAz(orphan);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Az> copyOfAz = new ArrayList<Az>(getAz_Az());
    clear_az();
    for(Az aAz : copyOfAz)
    {
      aAz.removeQa(this);
    }
    super.delete();
  }

}