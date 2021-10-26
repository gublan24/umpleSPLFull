/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import java.util.*;
import java.io.Serializable;

// line 1404 "../../../../../UmpleTLTemplates/Core.ump"
public class ActiveMemberInitializer extends MemberInitializer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ActiveMemberInitializer Attributes
  private GenActiveField activeField;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ActiveMemberInitializer(String aMember, GenActiveField aActiveField)
  {
    super(aMember);
    activeField = aActiveField;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setActiveField(GenActiveField aActiveField)
  {
    boolean wasSet = false;
    activeField = aActiveField;
    wasSet = true;
    return wasSet;
  }

  public GenActiveField getActiveField()
  {
    return activeField;
  }

  public void delete()
  {
    super.delete();
  }

  // line 1410 "../../../../../UmpleTLTemplates/Core.ump"
  public String declaration(GenMethod method){
    GenMethod relatedMethod = getActiveField().getRelatedMethod();
	  	String name = relatedMethod.getName();
	  	String baseName= relatedMethod instanceof ActiveGenMethd? ((ActiveGenMethd)relatedMethod).getBaseName(): name; 
	  	
	  	String string = getActiveField().getName()+ "(this, &_internalScheduler, &"+ method.getGenClass().getName()+"::_"+ baseName+ ")";
		return string;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "activeField" + "=" + (getActiveField() != null ? !getActiveField().equals(this)  ? getActiveField().toString().replaceAll("  ","    ") : "this" : "null");
  }
}