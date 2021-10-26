/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 307 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Rtt extends Rt
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Rtt()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Err getEr_OneErr()
  {
    return (Err)super.getEr(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_SetOptionalOneToMandatoryMany_specialization */
  public boolean setEr(Err aEr)
  {
    //
    // This source of this source generation is association_SetOptionalOneToMandatoryMany.jet
    // This set file assumes the generation of a maximumNumberOfXXX method does not exist because 
    // it's not required (No upper bound)
    //   
    boolean wasSet = false;
    Err existingEr = getEr_OneErr();

    if (existingEr == null)
    {
      if (aEr != null)
      {
        if (aEr.addRt(this))
        {
          super.clear_er();
          wasSet = addEr(aEr);
        }
      }
    } 
    else if (existingEr != null)
    {
      if (aEr == null)
      {
        if (existingEr.minimumNumberOfRt_Rtt() < existingEr.numberOfRt())
        {
          super.clear_er();
          wasSet = addEr(aEr);
        }
      } 
      else
      {
        if (existingEr.minimumNumberOfRt_Rtt() < existingEr.numberOfRt())
        {
          super.clear_er();
          wasSet = addEr(aEr);
        }
      }
    }
    return wasSet;
  }
  
  public void delete()
  {
    if (getEr_OneErr() != null)
    {
      if (getEr_OneErr().numberOfRt() <= 3)
      {
        getEr_OneErr().delete();
      }
      else
      {
        Err placeholderEr = getEr_OneErr();
        clear_er();
        placeholderEr.removeRt(this);
      }
    }
    super.delete();
  }

}