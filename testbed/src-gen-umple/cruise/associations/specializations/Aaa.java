/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 221 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Aaa extends Aa
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Aaa()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne_specialization */
  public Sss getS_OneSss()
  {
    return (Sss)super.getS(0);
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_SetOptionalOneToMandatoryMany_specialization */
  public boolean setS(Sss aS)
  {
    //
    // This source of this source generation is association_SetOptionalOneToMandatoryMany.jet
    // This set file assumes the generation of a maximumNumberOfXXX method does not exist because 
    // it's not required (No upper bound)
    //   
    boolean wasSet = false;
    Sss existingS = getS_OneSss();

    if (existingS == null)
    {
      if (aS != null)
      {
        if (aS.addA(this))
        {
          super.clear_s();
          wasSet = addS(aS);
        }
      }
    } 
    else if (existingS != null)
    {
      if (aS == null)
      {
        if (existingS.minimumNumberOfA_Aaa() < existingS.numberOfA())
        {
          super.clear_s();
          wasSet = addS(aS);
        }
      } 
      else
      {
        if (existingS.minimumNumberOfA_Aaa() < existingS.numberOfA())
        {
          super.clear_s();
          wasSet = addS(aS);
        }
      }
    }
    return wasSet;
  }
  
  public void delete()
  {
    if (getS_OneSss() != null)
    {
      if (getS_OneSss().numberOfA() <= 4)
      {
        getS_OneSss().delete();
      }
      else
      {
        Sss placeholderS = getS_OneSss();
        clear_s();
        placeholderS.removeA(this);
      }
    }
    super.delete();
  }

}