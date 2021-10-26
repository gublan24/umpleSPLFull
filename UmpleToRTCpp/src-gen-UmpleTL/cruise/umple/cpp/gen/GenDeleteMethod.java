/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.*;
import java.io.Serializable;

// line 445 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenDeleteMethod extends GenMethod
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenDeleteMethod()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 449 "../../../../../UmpleTLTemplates/Attributes.ump"
  public void dynamicBody(List<String> bodies){
    for(GenAssociation assocciation: getGenClass().getAssociations()) {
			String deleteBody= assocciation.getDeleteBody();
			if(deleteBody != null){
				bodies.add(deleteBody);
			}
		}
  }

}