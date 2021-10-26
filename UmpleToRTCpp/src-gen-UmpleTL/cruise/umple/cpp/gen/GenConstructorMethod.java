/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import java.util.*;
import java.io.Serializable;

// line 263 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenConstructorMethod extends GenBaseConstructorMethod
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenConstructorMethod()
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


  /**
   * @Override
   */
  // line 269 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String parameters(){
    List<String> all= getPrePolymorphicParameters().stream().map(GenMethodParameter::declaration).collect(Collectors.toList());
		all.addAll(asParameters().stream().map(GenMethodParameter::declaration).collect(Collectors.toList()));
		return all.stream().collect(Collectors.joining(", "));
  }

  // line 275 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String parentParameters(){
    return asParameters(getGenClass().getParent()).stream().map(GenMethodParameter::getName).collect(Collectors.joining(", "));
  }

  // line 279 "../../../../../UmpleTLTemplates/Attributes.ump"
  public void dynamicBody(List<String> bodies){
    GenClass genClass= getGenClass();
		GenPackage genPackage= genClass.getGenPackage();
		
		for (GenField field : genClass.getFields()) {
			GenAssociation association = field.getRelatedAssociation();
			if (association != null) {
				String constructDecision = association.constructDecision();
				if(constructDecision != null){
					String type = field.getType();
					String name= field.getName();
					if (GenAssociation.CONSTRUCT_DEFAULT_ASSIGN.equals(constructDecision)) {
						String defaultValue= genPackage.interceptValueForType(type, association.getValue());
						//The nonpointer types, such strings, do not require null assignment. So ignore them unless they have default values
						if(field.getIsPointer() || defaultValue != null){
							if(association.isMany()){
								bodies.add(association.listTypeDeclaration(0, type, "this->"+ name, true));
							}else{
								bodies.add(genPackage.assignCall("this->"+ name, defaultValue== null?genPackage.getDefaultValue(type): defaultValue));
							}
						}
					}else if(GenAssociation.CONSTRUCT_VALUE_ASSIGN.equals(constructDecision)){
						GenAssociationEnd source= association.getSource();
						bodies.add(genPackage.assignCall("this->"+ name, association.variableParameterInstance(name, source.isMany())));
					}else if(GenAssociation.CONSTRUCT_CHECK_NULL_ASSIGN.equals(constructDecision)){
						bodies.add(association.constructCheckNullAssign());
					}else if(GenAssociation.CONSTRUCT_SET_AND_CHECK.equals(constructDecision)){
						bodies.add(association.constructSetAndCheck());
					}else if(GenAssociation.CONSTRUCT_SET_VALIDATE_BOUND.equals(constructDecision)){
						bodies.add(association.constructSetValidateBounds());
					}
				}
			}else{
				String autounique = field.getAutounique();
				if(autounique!= null){
					bodies.add(field.autoAssign());
				}else if(field.isParameterized()){
					bodies.add(field.assignValueCall());
				}
			}
		}
		
		for(GenBody content: genClass.getConstructorContents()){
			bodies.add(content.getBody());
		}
		
		for(UniqueGenBody content: genClass.getUniqueConstructorContents()){
			bodies.add(content.getBody());
		}
  }

}