/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 3 "../../../../src/NuSMVMetamodel.ump"
public class NuSMVModule
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "-- This defines a NuSMV module for ";
  public static final String TEXT_1 = " --" + NL;
  public static final String TEXT_2 = "MODULE ";
  public static final String TEXT_3 = " ( ";
  public static final String TEXT_4 = " )";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //NuSMVModule Attributes
  private String identifier;
  private List<String> parameters;

  //NuSMVModule Associations
  private ModuleBody moduleBody;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NuSMVModule(String aIdentifier, ModuleBody aModuleBody)
  {
    identifier = aIdentifier;
    parameters = new ArrayList<String>();
    if (!setModuleBody(aModuleBody))
    {
      throw new RuntimeException("Unable to create NuSMVModule due to aModuleBody. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIdentifier(String aIdentifier)
  {
    boolean wasSet = false;
    identifier = aIdentifier;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addParameter(String aParameter)
  {
    boolean wasAdded = false;
    wasAdded = parameters.add(aParameter);
    return wasAdded;
  }

  public boolean removeParameter(String aParameter)
  {
    boolean wasRemoved = false;
    wasRemoved = parameters.remove(aParameter);
    return wasRemoved;
  }

  public String getIdentifier()
  {
    return identifier;
  }
  /* Code from template attribute_GetMany */
  public String getParameter(int index)
  {
    String aParameter = parameters.get(index);
    return aParameter;
  }

  public String[] getParameters()
  {
    String[] newParameters = parameters.toArray(new String[parameters.size()]);
    return newParameters;
  }

  public int numberOfParameters()
  {
    int number = parameters.size();
    return number;
  }

  public boolean hasParameters()
  {
    boolean has = parameters.size() > 0;
    return has;
  }

  public int indexOfParameter(String aParameter)
  {
    int index = parameters.indexOf(aParameter);
    return index;
  }
  /* Code from template association_GetOne */
  public ModuleBody getModuleBody()
  {
    return moduleBody;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setModuleBody(ModuleBody aNewModuleBody)
  {
    boolean wasSet = false;
    if (aNewModuleBody != null)
    {
      moduleBody = aNewModuleBody;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    moduleBody = null;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait MyUtility.
   * Trait MyUtility has been used in classes: 'NuSMVModule' 'CounterExampleTable' 'CounterExampleColumn' 'VariableSpecifier' 
   * this method prints elements of the input list in a comma-separated manner
   */
  // line 130 "../../../../src/NuSMVMetamodel.ump"
   public String printArray(List<String> input){
    String temp = "";
		int size = input.size();
		if(size > 1) {
  			for(int i = 0; i < size - 1 ; i++)
  				temp += input.get(i) + " , ";
  			temp += input.get(size-1);
  		} 
  	else if( size == 1 ) 
  			temp = input.get(0);
		return temp;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait MyUtility.
   * Trait MyUtility has been used in classes: 'NuSMVModule' 'CounterExampleTable' 'CounterExampleColumn' 'VariableSpecifier' 
   */
  // line 143 "../../../../src/NuSMVMetamodel.ump"
   public List<ColumnEntry> buildColumnEntries(List<String> stateValues){
    List<ColumnEntry> entries = new ArrayList<ColumnEntry>();
		for( int i = 0; i < stateValues.size(); i++ ) {
			ColumnEntry entry = new ColumnEntry( stateValues.get(i) );
			entry.setIsDerived( true );
			entries.add( entry );
		}
		return entries;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait MyUtility.
   * Trait MyUtility has been used in classes: 'NuSMVModule' 'CounterExampleTable' 'CounterExampleColumn' 'VariableSpecifier' 
   */
  // line 154 "../../../../src/NuSMVMetamodel.ump"
   public List<String> buildStateValuesFromColumnEntries(List<ColumnEntry> entries){
    List<String> stateValues = new ArrayList< String >();
		
		for( ColumnEntry entry : entries )
			stateValues.add( entry.getValue() );
			
		return stateValues;
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _toString(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(identifier);
    realSb.append(TEXT_1);
    realSb.append(TEXT_2);
    realSb.append(getIdentifier());
    if(parameters.size() != 0){
    realSb.append(TEXT_3);
    realSb.append(printArray( parameters ));
    realSb.append(TEXT_4);
    realSb.append(moduleBody.toString());
    }
else {
    realSb.append(moduleBody.toString());
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String toString(){
        StringBuilder sb = new StringBuilder();
    return this._toString(0,sb).toString(); 
  }

}