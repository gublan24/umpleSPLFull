/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.List;
import java.io.Serializable;

// line 21 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
public class GenConnectEntry extends GenBody
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenConnectEntry Attributes
  private String from;
  private String fromOwner;
  private String to;
  private String toOwner;
  private boolean inverse;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenConnectEntry(String aBody, String aFrom, String aFromOwner, String aTo, String aToOwner)
  {
    super(aBody);
    from = aFrom;
    fromOwner = aFromOwner;
    to = aTo;
    toOwner = aToOwner;
    inverse = false;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setFrom(String aFrom)
  {
    boolean wasSet = false;
    from = aFrom;
    wasSet = true;
    return wasSet;
  }

  public boolean setFromOwner(String aFromOwner)
  {
    boolean wasSet = false;
    fromOwner = aFromOwner;
    wasSet = true;
    return wasSet;
  }

  public boolean setTo(String aTo)
  {
    boolean wasSet = false;
    to = aTo;
    wasSet = true;
    return wasSet;
  }

  public boolean setToOwner(String aToOwner)
  {
    boolean wasSet = false;
    toOwner = aToOwner;
    wasSet = true;
    return wasSet;
  }

  public boolean setInverse(boolean aInverse)
  {
    boolean wasSet = false;
    inverse = aInverse;
    wasSet = true;
    return wasSet;
  }

  public String getFrom()
  {
    return from;
  }

  public String getFromOwner()
  {
    return fromOwner;
  }

  public String getTo()
  {
    return to;
  }

  public String getToOwner()
  {
    return toOwner;
  }

  public boolean getInverse()
  {
    return inverse;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isInverse()
  {
    return inverse;
  }

  public void delete()
  {
    super.delete();
  }

  // line 34 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String getBody(){
    boolean _inverse = getInverse();
		boolean diff = false;
		String _fromOwner = getFromOwner();
		GenClass fromOwner = fieldOwner(_fromOwner);

		String _toOwner = getToOwner();
		GenClass toOwner = fieldOwner(_toOwner);

		GenActiveField relatedFromField = getRelatedField(fromOwner, getFrom());
		if (relatedFromField == null) {
			relatedFromField = getRelatedField(fromOwner, getTo());
			diff = true;
			if (relatedFromField == null) {
				return null;
			}
		}

		GenActiveField relatedToField = getRelatedField(toOwner, getTo());
		if (relatedToField == null) {
			relatedToField = getRelatedField(toOwner, getFrom());
			diff = true;
			if (relatedToField == null) {
				return null;
			}
		}

		if (diff) {
			_inverse = !_inverse;
		}

		boolean isReference = !getGenMethod().getGenClass().getIsRemote();

		String fromSegment = _fromOwner == null ? "this" : _fromOwner;
		String toSegment = _toOwner == null ? "this" : _toOwner;

		GenActiveField expectedRelatedFromField = relatedFromField, expectedRelatedToField = relatedToField;
		String expectedFromSegment, expectedToSegment;
		if (_inverse) {
			expectedFromSegment = fromSegment;
			expectedToSegment = toSegment;
		} else {
			expectedFromSegment = toSegment;
			expectedToSegment = fromSegment;
		}

		if (diff) {
			expectedRelatedFromField = relatedToField;
			expectedRelatedToField = relatedFromField;
		}

		return expectedFromSegment + "->" + expectedRelatedFromField.getName() + "+= " + (isReference ? "&" : "")
				+ expectedToSegment + "->" + expectedRelatedToField.getName() + ";";
  }

  // line 89 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public GenClass fieldOwner(String field){
    GenClass base = getGenMethod().getGenClass();
		if(field == null){
		  	return base;
	  	}
	  
	  	GenField ownerField = base.fieldByName(field);
	  	if(ownerField == null){
	  		return base;
	  	}
	  	
	  	GenClass classByName = base.getGenPackage().classByName(ownerField.getType());
	  	if(classByName == null){
	  		return base;
	  	}
	  	
  		return classByName;
  }

  // line 109 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public GenActiveField getRelatedField(GenClass owner, String name){
    if(name == null){
			return null;
		}
	  	
	  	if(owner == null){
	  		owner= getGenMethod().getGenClass();
	  	}
		  
		List<GenActiveField> activeFields = owner.activeFields();
		for(GenActiveField field: activeFields){
			GenMethod relatedMethod = field.getRelatedMethod();
			if(relatedMethod instanceof ActiveGenMethd){
				ActiveGenMethd active= ((ActiveGenMethd)relatedMethod);
				if(name.equals(active.getBaseName())){
					return field;
				}
			}else{
				if(name.equals(field.getName())){
					return field;
				}
			}
		}
		return null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "from" + ":" + getFrom()+ "," +
            "fromOwner" + ":" + getFromOwner()+ "," +
            "to" + ":" + getTo()+ "," +
            "toOwner" + ":" + getToOwner()+ "," +
            "inverse" + ":" + getInverse()+ "]";
  }
}