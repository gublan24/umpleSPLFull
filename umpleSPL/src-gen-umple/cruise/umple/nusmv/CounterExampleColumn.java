/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 190 "../../../../src/NuSMVMetamodel.ump"
public class CounterExampleColumn
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = " :: ";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CounterExampleColumn Attributes
  private int index;
  private List<String> stateValues;
  private String header;

  //CounterExampleColumn Associations
  private List<ColumnEntry> columnEntries;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CounterExampleColumn(int aIndex, String aHeader)
  {
    index = aIndex;
    stateValues = new ArrayList<String>();
    header = aHeader;
    columnEntries = new ArrayList<ColumnEntry>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIndex(int aIndex)
  {
    boolean wasSet = false;
    index = aIndex;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addStateValue(String aStateValue)
  {
    boolean wasAdded = false;
    wasAdded = stateValues.add(aStateValue);
    return wasAdded;
  }

  public boolean removeStateValue(String aStateValue)
  {
    boolean wasRemoved = false;
    wasRemoved = stateValues.remove(aStateValue);
    return wasRemoved;
  }

  public boolean setHeader(String aHeader)
  {
    boolean wasSet = false;
    header = aHeader;
    wasSet = true;
    return wasSet;
  }

  public int getIndex()
  {
    return index;
  }
  /* Code from template attribute_GetMany */
  public String getStateValue(int index)
  {
    String aStateValue = stateValues.get(index);
    return aStateValue;
  }

  public String[] getStateValues()
  {
    String[] newStateValues = stateValues.toArray(new String[stateValues.size()]);
    return newStateValues;
  }

  public int numberOfStateValues()
  {
    int number = stateValues.size();
    return number;
  }

  public boolean hasStateValues()
  {
    boolean has = stateValues.size() > 0;
    return has;
  }

  public int indexOfStateValue(String aStateValue)
  {
    int index = stateValues.indexOf(aStateValue);
    return index;
  }

  public String getHeader()
  {
    return header;
  }
  /* Code from template association_GetMany */
  public ColumnEntry getColumnEntry(int index)
  {
    ColumnEntry aColumnEntry = columnEntries.get(index);
    return aColumnEntry;
  }

  public List<ColumnEntry> getColumnEntries()
  {
    List<ColumnEntry> newColumnEntries = Collections.unmodifiableList(columnEntries);
    return newColumnEntries;
  }

  public int numberOfColumnEntries()
  {
    int number = columnEntries.size();
    return number;
  }

  public boolean hasColumnEntries()
  {
    boolean has = columnEntries.size() > 0;
    return has;
  }

  public int indexOfColumnEntry(ColumnEntry aColumnEntry)
  {
    int index = columnEntries.indexOf(aColumnEntry);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfColumnEntries()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addColumnEntry(ColumnEntry aColumnEntry)
  {
    boolean wasAdded = false;
    if (columnEntries.contains(aColumnEntry)) { return false; }
    columnEntries.add(aColumnEntry);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeColumnEntry(ColumnEntry aColumnEntry)
  {
    boolean wasRemoved = false;
    if (columnEntries.contains(aColumnEntry))
    {
      columnEntries.remove(aColumnEntry);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addColumnEntryAt(ColumnEntry aColumnEntry, int index)
  {  
    boolean wasAdded = false;
    if(addColumnEntry(aColumnEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfColumnEntries()) { index = numberOfColumnEntries() - 1; }
      columnEntries.remove(aColumnEntry);
      columnEntries.add(index, aColumnEntry);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveColumnEntryAt(ColumnEntry aColumnEntry, int index)
  {
    boolean wasAdded = false;
    if(columnEntries.contains(aColumnEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfColumnEntries()) { index = numberOfColumnEntries() - 1; }
      columnEntries.remove(aColumnEntry);
      columnEntries.add(index, aColumnEntry);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addColumnEntryAt(aColumnEntry, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    columnEntries.clear();
  }

  // line 199 "../../../../src/NuSMVMetamodel.ump"
   public String printColumnEntries(){
    String output = "";
		for( ColumnEntry entry : columnEntries )
			output += entry.htmlString();
		return output;
  }

  // line 206 "../../../../src/NuSMVMetamodel.ump"
   public void setStateValues(List<String> values){
    for( String value : values )
			stateValues.add( value );
		columnEntries = buildColumnEntries( stateValues );
		ColumnEntry header = new ColumnEntry( this.header );
		header.setIsDerived( true );
		columnEntries.add(0, header);
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
    
     if( stateValues.size() == 0 && columnEntries.size() != 0 )
		buildStateValuesFromColumnEntries( columnEntries ); 
    realSb.append(header);
    realSb.append(TEXT_0);
    realSb.append(printArray( stateValues ));

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