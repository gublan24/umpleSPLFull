/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.*;
import java.io.Serializable;

// line 745 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenInternalCopyMethod extends GenMethod
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenInternalCopyMethod()
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

  // line 748 "../../../../../UmpleTLTemplates/Attributes.ump"
  public void dynamicBody(List<String> bodies){
    GenClass genClass = getGenClass();
		if(!genClass.isSingleton()){
			GenPackage genPackage = genClass.getGenPackage();
			List<GenAssociation> associations = genClass.getAssociations();
			for (GenAssociation association : associations) {
				if(!association.isConstant() && !association.isDerived()){
					String type = association.getSource().getType();
					if (genPackage.isString(type)) {
						bodies.add(association.copyStringAttribute());
					}else if(genPackage.isPrimitive(type)){
						bodies.add(association.copyPrimitiveAttribute());
					}else if(association.isMany()){
						String copyCall= association.copyDirectly(0, association.getSource().getName(), type, "other."+association.getSource().getName());
						bodies.add(copyCall);
					}else{
						bodies.add(association.copyAttribute());
					}
				}
			}
		}
  }

}