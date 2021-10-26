/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 211 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Ooo extends Oo
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ooo(Pp... allP)
  {
    super(allP);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Ppp getP_Ppp(int index)
  {
    Ppp aP = (Ppp)super.getP(index);
    return aP;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Ppp> getP_Ppp()
  {
    List<? extends Pp> newP = super.getP();
    return (List<Ppp>)newP;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfPValid_Ppp()
  {
    boolean isValid = numberOfP() >= minimumNumberOfP_Ppp() && numberOfP() <= maximumNumberOfP_Ppp();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfP_Ppp()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfP_Ppp()
  {
    return 4;
  }
  /* Code from template association_AddManyToManyMethod_specialization */
  public boolean addP(Ppp aP)
  {
    boolean wasAdded = false;
   List<Ppp> p = getP_Ppp(); 
    if (p.contains(aP)) { return false; }
    if (numberOfP() >= maximumNumberOfP_Ppp())
    {
      return wasAdded;
    }
    wasAdded = super.addP(aP);

    return wasAdded;
  }
  /* Code from template association_AddMNToMany_specialization */
  public boolean removeP(Ppp aP)
  {
    boolean wasRemoved = false;

    if (numberOfP() <= minimumNumberOfP_Ppp())
    {
      return wasRemoved;
    }

    wasRemoved = super.removeP(aP);

    return wasRemoved;
  }
  /* Code from template association_SetMNToMany_specialization */
  public boolean setP(Ppp... newP)
  {
    boolean wasSet = false;
    ArrayList<Ppp> verifiedP = new ArrayList<Ppp>();
    for (Ppp aP : newP)
    {
      if (verifiedP.contains(aP))
      {
        continue;
      }
      verifiedP.add(aP);
    }

    if (verifiedP.size() != newP.length || verifiedP.size() < minimumNumberOfP_Ppp() || verifiedP.size() > maximumNumberOfP_Ppp())
    {
      return wasSet;
    }

    wasSet = super.setP(newP);
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Ppp> copyOfP = new ArrayList<Ppp>(getP_Ppp());
    clear_p();
    for(Ppp aP : copyOfP)
    {
      aP.removeO(this);
    }
    super.delete();
  }

}