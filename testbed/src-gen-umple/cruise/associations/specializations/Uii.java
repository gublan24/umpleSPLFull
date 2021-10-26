/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 324 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Uii extends Ui
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Uii()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public Ioo getIo_Ioo(int index)
  {
    Ioo aIo = (Ioo)super.getIo(index);
    return aIo;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Ioo> getIo_Ioo()
  {
    List<? extends Io> newIo = super.getIo();
    return (List<Ioo>)newIo;
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfIo_Ioo()
  {
    return 0;
  }

  public void delete()
  {
    for( Ioo orphan : getIo_Ioo() )
    {
      orphan.clear_ui();
    }
    super.delete();
  }

}