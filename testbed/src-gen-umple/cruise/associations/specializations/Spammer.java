/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 140 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Spammer extends Spam
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Spammer()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Drummer getDrama_Drummer(int index)
  {
    Drummer aDrama = (Drummer)super.getDrama(index);
    return aDrama;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Drummer> getDrama_Drummer()
  {
    List<? extends Drama> newDrama = super.getDrama();
    return (List<Drummer>)newDrama;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_IsNumberOfValidMethod_specialization */
  public boolean isNumberOfDramaValid_Drummer()
  {
    boolean isValid = numberOfDrama() >= minimumNumberOfDrama_Drummer() && numberOfDrama() <= maximumNumberOfDrama_Drummer();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod_specialization */
  public static int requiredNumberOfDrama_Drummer()
  {
    return 4;
  }
  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfDrama_Drummer()
  {
    return 4;
  }
  /* Code from template association_MaximumNumberOfMethod_specialization */
  public static int maximumNumberOfDrama_Drummer()
  {
    return 4;
  }
  /* Code from template association_AddMNToOnlyOne_specialization */
  public Drummer addDrama()
  {
    if (numberOfDrama() >= maximumNumberOfDrama_Drummer())
    {
      return null;
    }
    else
    {
      return new Drummer();
    }
  }

  public boolean addDrama(Drummer aDrama)
  {
    boolean wasAdded = false;
    List<Drummer> drama = getDrama_Drummer();
    if (drama.contains(aDrama)) { return false; }
    if (numberOfDrama() >= maximumNumberOfDrama_Drummer())
    {
      return wasAdded;
    }

    Spammer existingSpam = aDrama.getSpam_OneSpammer();
    boolean isNewSpam = existingSpam != null && !this.equals(existingSpam);

    if (isNewSpam && existingSpam.numberOfDrama() <= minimumNumberOfDrama_Drummer())
    {
      return wasAdded;
    }

    wasAdded = super.addDrama(aDrama);
    return wasAdded;
  }

  public boolean removeDrama(Drummer aDrama)
  {
    boolean wasRemoved = false;
    //Unable to remove aDrama, as it must always have a spam
    if (this.equals(aDrama.getSpam()))
    {
      return wasRemoved;
    }

    //spam already at minimum (4)
    if (numberOfDrama() <= minimumNumberOfDrama_Drummer())
    {
      return wasRemoved;
    }
    
    wasRemoved = super.removeDrama(aDrama);
    return wasRemoved;
  }

  public void delete()
  {
    super.delete();
  }

}