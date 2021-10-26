/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 416 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Zww extends Zw
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Zww()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Ws getW_Ws(int index)
  {
    Ws aW = (Ws)super.getW(index);
    return aW;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Ws> getWs_Ws()
  {
    List<? extends Ws> newWs = super.getWs();
    return (List<Ws>)newWs;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfWsValid_Ws()
  {
    boolean isValid = numberOfWs() >= minimumNumberOfWs_Ws();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfWs_Ws()
  {
    return 3;
  }
  /* Code from template association_AddMandatoryManyToOne_specialization */
  public boolean addW(Ws aW)
  {
    boolean wasAdded = false;
    List<Ws> ws = getWs_Ws();
    if (ws.contains(aW)) { return false; }
    Zww existingZw = aW.getZw_OneZww();
    boolean isNewZw = existingZw != null && !this.equals(existingZw);

    if (isNewZw && existingZw.numberOfWs() <= minimumNumberOfWs_Ws())
    {
      return wasAdded;
    }

    wasAdded = super.addW(aW);
    return wasAdded;
  }

  public boolean removeW(Ws aW)
  {
    boolean wasRemoved = false;
    //Unable to remove aW, as it must always have a zw
    if (this.equals(aW.getZw()))
    {
      return wasRemoved;
    }

    //zw already at minimum (3)
    if (numberOfWs() <= minimumNumberOfWs_Ws())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeW(aW);
    return wasRemoved;
  }

  public void delete()
  {
    super.delete();
  }

}