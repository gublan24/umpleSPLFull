/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

// line 330 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenBaseConstructorMethod extends GenMethod
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenBaseConstructorMethod Associations
  private List<GenMethodParameter> prePolymorphicParameters;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenBaseConstructorMethod()
  {
    super();
    prePolymorphicParameters = new ArrayList<GenMethodParameter>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public GenMethodParameter getPrePolymorphicParameter(int index)
  {
    GenMethodParameter aPrePolymorphicParameter = prePolymorphicParameters.get(index);
    return aPrePolymorphicParameter;
  }

  public List<GenMethodParameter> getPrePolymorphicParameters()
  {
    List<GenMethodParameter> newPrePolymorphicParameters = Collections.unmodifiableList(prePolymorphicParameters);
    return newPrePolymorphicParameters;
  }

  public int numberOfPrePolymorphicParameters()
  {
    int number = prePolymorphicParameters.size();
    return number;
  }

  public boolean hasPrePolymorphicParameters()
  {
    boolean has = prePolymorphicParameters.size() > 0;
    return has;
  }

  public int indexOfPrePolymorphicParameter(GenMethodParameter aPrePolymorphicParameter)
  {
    int index = prePolymorphicParameters.indexOf(aPrePolymorphicParameter);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPrePolymorphicParameters()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addPrePolymorphicParameter(GenMethodParameter aPrePolymorphicParameter)
  {
    boolean wasAdded = false;
    if (prePolymorphicParameters.contains(aPrePolymorphicParameter)) { return false; }
    GenBaseConstructorMethod existingOwner = aPrePolymorphicParameter.getOwner();
    if (existingOwner == null)
    {
      aPrePolymorphicParameter.setOwner(this);
    }
    else if (!this.equals(existingOwner))
    {
      existingOwner.removePrePolymorphicParameter(aPrePolymorphicParameter);
      addPrePolymorphicParameter(aPrePolymorphicParameter);
    }
    else
    {
      prePolymorphicParameters.add(aPrePolymorphicParameter);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePrePolymorphicParameter(GenMethodParameter aPrePolymorphicParameter)
  {
    boolean wasRemoved = false;
    if (prePolymorphicParameters.contains(aPrePolymorphicParameter))
    {
      prePolymorphicParameters.remove(aPrePolymorphicParameter);
      aPrePolymorphicParameter.setOwner(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPrePolymorphicParameterAt(GenMethodParameter aPrePolymorphicParameter, int index)
  {  
    boolean wasAdded = false;
    if(addPrePolymorphicParameter(aPrePolymorphicParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPrePolymorphicParameters()) { index = numberOfPrePolymorphicParameters() - 1; }
      prePolymorphicParameters.remove(aPrePolymorphicParameter);
      prePolymorphicParameters.add(index, aPrePolymorphicParameter);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePrePolymorphicParameterAt(GenMethodParameter aPrePolymorphicParameter, int index)
  {
    boolean wasAdded = false;
    if(prePolymorphicParameters.contains(aPrePolymorphicParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPrePolymorphicParameters()) { index = numberOfPrePolymorphicParameters() - 1; }
      prePolymorphicParameters.remove(aPrePolymorphicParameter);
      prePolymorphicParameters.add(index, aPrePolymorphicParameter);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPrePolymorphicParameterAt(aPrePolymorphicParameter, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !prePolymorphicParameters.isEmpty() )
    {
      prePolymorphicParameters.get(0).setOwner(null);
    }
    super.delete();
  }

  // line 334 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String getInitializerString(){
    return constructorCalls();
  }

  // line 341 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String constructorCalls(){
    GenClass genClass= getGenClass();
		String calls= genClass.memberInitializerString(this);
		 
		GenClass parent= genClass.getParent();
		if(parent != null){
			String parentsParameters= parentParameters();
			
			String parentString= parent.getName()+ "("+ parentsParameters+ ")";
			if(!calls.isEmpty()){
				calls+= "," + NL+ _indent(4, new StringBuilder(), parentString);
			}else{
				calls= parentString;
			}
		}
		
		return calls;
  }


  /**
   * By default, assume that the parent parameters are the same unless in some other constrcutors, parameters can be different.
   */
  // line 361 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String parentParameters(){
    return getParameters().stream().map(GenMethodParameter::getName).collect(Collectors.joining(", "));
  }

  // line 367 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String identifier(){
    return super.identifier()+ getPrePolymorphicParameters().stream().map(GenMethodParameter::declaration).collect(Collectors.joining());
  }

  // line 371 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<GenMethodParameter> asParameters(){
    return asParameters(getGenClass());
  }

  // line 375 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<GenMethodParameter> asParameters(GenClass genClass){
    return asParameters(searchParameters(genClass));
  }

  // line 379 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<GenMethodParameter> asParameters(List<GenAssociation> searchParameters){
    GenPackage genPackage= getGenClass().getGenPackage();
		List<GenMethodParameter> params= new ArrayList<GenMethodParameter>();
		
		for(GenAssociation association: searchParameters){ 
			if(association.hasRelatedFields()){
				GenAssociationEnd source = association.getSource();
				String instance = association.variableParameterInstance(association.getName(), source.isMany());
				GenField relatedField = association.getRelatedField(0);
				GenMethodParameter param = new GenMethodParameter(relatedField.getNormalizedType(), instance);
				param.setIsConstant(genPackage.isPrimitive(source.getType()));
				param.setIsReference(genPackage.isPrimitive(source.getType()));
				param.setCrudType(relatedField.getType());
				param.setRelatedField(source.getName());
				param.setNormalize(true);
				params.add(param);
			}
		}
		return params;
  }

  // line 400 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<GenAssociation> listParameters(){
    return searchParameters(getGenClass(), new ArrayList<List<GenAssociation>>());
  }

  // line 404 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<GenAssociation> searchParameters(GenClass genClass){
    return searchParameters(genClass, new ArrayList<List<GenAssociation>>());
  }

  // line 408 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<GenAssociation> searchParameters(GenClass genClass, List<List<GenAssociation>> all){
    searchParameters(genClass, new ArrayList<GenAssociation>(), all);
		
		List<GenAssociation> results= new ArrayList<GenAssociation>();
		all.stream().forEach(list->results.addAll(list));
		
		return results;
  }

  // line 417 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<GenAssociation> searchParameters(GenClass genClass, List<GenAssociation> current, List<List<GenAssociation>> all){
    searchClassParameters(genClass, current, all);
		all.add(0, current);
		GenClass parent = genClass.getParent();
		if(parent != null){
			searchParameters(parent, new ArrayList<GenAssociation>(), all);
		}
		return current;
  }

  // line 427 "../../../../../UmpleTLTemplates/Attributes.ump"
  public void searchClassParameters(GenClass genClass, List<GenAssociation> current, List<List<GenAssociation>> all){
    List<GenAssociation> fields= new ArrayList<GenAssociation>();
		List<GenAssociation> associations= new ArrayList<GenAssociation>();
		for(GenAssociation association: genClass.getAssociations()){
			String constructDecision = association.constructDecision();
			if(constructDecision != null && !GenAssociation.CONSTRUCT_DEFAULT_ASSIGN.equals(constructDecision)){
				if(association.getIsAttribute()){
					fields.add(association);
				}else{
					associations.add(association);
				}
			}
		}
		current.addAll(fields);
		current.addAll(associations);
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _indent(Integer numSpaces, StringBuilder sb, String content){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(content);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String indent(String content){
        StringBuilder sb = new StringBuilder();
    return this._indent(0,sb,content).toString(); 
  }

}