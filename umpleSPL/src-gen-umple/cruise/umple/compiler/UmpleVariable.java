/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Superclass for tracking member variables in all target languages
 * TODO: Code smell because we have both an association variable and also an association
 * This class should go and instead AssociationEnd should be the member variable
 * 
 */
// line 883 "../../../../src/Umple.ump"
// line 518 "../../../../src/Umple_Code.ump"
// line 29 "../../../../src/Trace.ump"
// line 16 "../../../../src/Trace_Code.ump"
public class UmpleVariable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleVariable Attributes
  private String name;
  private String type;
  private String modifier;
  private String value;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleVariable(String aName, String aType, String aModifier, String aValue)
  {
    name = aName;
    type = aType;
    modifier = aModifier;
    value = aValue;
    // line 900 "../../../../src/Umple.ump"
    if (type==""){
      		 type= "String";
      	}
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    // line 897 "../../../../src/Umple.ump"
    if (aName == null) { throw new RuntimeException("Name must be set, cannot be null"); }
    // END OF UMPLE BEFORE INJECTION
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public boolean setModifier(String aModifier)
  {
    boolean wasSet = false;
    modifier = aModifier;
    wasSet = true;
    return wasSet;
  }

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  /**
   * The name of the Umple variable.
   */
  public String getName()
  {
    return name;
  }

  /**
   * The type of the Umple variable.
   */
  public String getType()
  {
    return type;
  }

  /**
   * The modifier associated with the Umple variable.
   * potential enum, 'settable'
   */
  public String getModifier()
  {
    // line 898 "../../../../src/Umple.ump"
    if (modifier == null) { return "settable"; }
    // END OF UMPLE BEFORE INJECTION
    return modifier;
  }

  /**
   * The value of the Umple variable.
   */
  public String getValue()
  {
    return value;
  }

  public void delete()
  {}

  // line 522 "../../../../src/Umple_Code.ump"
   public String getUpperCaseName(){
    if (name == null || name.length() == 0)
    {
      return name;
    }
    else if (name.length() == 1)
    {
      return name.toUpperCase();
    }
    else
    {
      return name.toUpperCase().charAt(0) + name.substring(1);
    }
  }

  // line 538 "../../../../src/Umple_Code.ump"
   public boolean isImmutable(){
    return "immutable".equals(modifier);
  }

  // line 543 "../../../../src/Umple_Code.ump"
   public String normalizeValue(String aType, String aValue){
    if (aType == null || aValue == null || aValue.length() == 0)
    {
      return aValue;
    }
    else if (("Float".equals(aType)) && ("f".equals(aValue.substring(aValue.length()-1))))
    {
      return aValue.substring(0, aValue.length()-1);
    }
    else
    {
      return aValue;
    }
  }


  /**
   * Retrieve the AttributeTraceItem associated with this UmpleVariable
   * @params method: for example get or set, each specifying the context to call the gotten trace item
   * @params uClass: the umple class to look within for the trace item
   * @return Attribute_Traceitem for this UmpleVariable(either association or attribute);
   */
  // line 25 "../../../../src/Trace_Code.ump"
   public List<TraceItem> getTraced(String method, UmpleClass uClass){
    ArrayList<TraceItem> atis = new ArrayList<TraceItem>();

		for(TraceDirective td: uClass.getAllTraceDirectives())
		{
			for(AttributeTraceItem ati: td.getAttributeTraceItems())
			{
				if(("setMethod".equals(method)&&ati.getTraceSet())||("getMethod".equals(method)&&ati.getTraceGet()))
				{
					for(UmpleVariable variable: ati.getUmpleVariables())
					{
						if(variable.getName().equals(this.getName()))
							atis.add(ati);
					}
				}
				else if("constructor".equals(method)&&ati.getTraceConstructor())
				{
					for(UmpleVariable variable: ati.getUmpleVariables())
					{
						if(variable.equals(this))
							atis.add(ati);
					}
				}
			}
		}
		return atis;
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "type" + ":" + getType()+ "," +
            "modifier" + ":" + getModifier()+ "," +
            "value" + ":" + getValue()+ "]";
  }
}