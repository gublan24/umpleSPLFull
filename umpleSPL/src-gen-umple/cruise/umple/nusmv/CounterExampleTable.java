/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 18 "../../../../src/NuSMVMetamodel.ump"
public class CounterExampleTable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "  Source State Machine :: ";
  public static final String TEXT_1 = " " + NL + "  Requirement Under Verification (RUV) :: ";
  public static final String TEXT_2 = NL + "  ";
  public static final String TEXT_3 = NL + "       ";
  public static final String TEXT_4 = NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CounterExampleTable Attributes
  private List<String> rowLabels;
  private String sourceMachine;
  private String sourceClass;

  //CounterExampleTable Associations
  private ModuleElement requirement;
  private List<CounterExampleColumn> counterExampleColumns;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CounterExampleTable(String aSourceMachine, String aSourceClass, ModuleElement aRequirement)
  {
    rowLabels = new ArrayList<String>();
    sourceMachine = aSourceMachine;
    sourceClass = aSourceClass;
    if (!setRequirement(aRequirement))
    {
      throw new RuntimeException("Unable to create CounterExampleTable due to aRequirement. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    counterExampleColumns = new ArrayList<CounterExampleColumn>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addRowLabel(String aRowLabel)
  {
    boolean wasAdded = false;
    wasAdded = rowLabels.add(aRowLabel);
    return wasAdded;
  }

  public boolean removeRowLabel(String aRowLabel)
  {
    boolean wasRemoved = false;
    wasRemoved = rowLabels.remove(aRowLabel);
    return wasRemoved;
  }

  public boolean setSourceMachine(String aSourceMachine)
  {
    boolean wasSet = false;
    sourceMachine = aSourceMachine;
    wasSet = true;
    return wasSet;
  }

  public boolean setSourceClass(String aSourceClass)
  {
    boolean wasSet = false;
    sourceClass = aSourceClass;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_GetMany */
  public String getRowLabel(int index)
  {
    String aRowLabel = rowLabels.get(index);
    return aRowLabel;
  }

  public String[] getRowLabels()
  {
    String[] newRowLabels = rowLabels.toArray(new String[rowLabels.size()]);
    return newRowLabels;
  }

  public int numberOfRowLabels()
  {
    int number = rowLabels.size();
    return number;
  }

  public boolean hasRowLabels()
  {
    boolean has = rowLabels.size() > 0;
    return has;
  }

  public int indexOfRowLabel(String aRowLabel)
  {
    int index = rowLabels.indexOf(aRowLabel);
    return index;
  }

  public String getSourceMachine()
  {
    return sourceMachine;
  }

  public String getSourceClass()
  {
    return sourceClass;
  }
  /* Code from template association_GetOne */
  public ModuleElement getRequirement()
  {
    return requirement;
  }
  /* Code from template association_GetMany */
  public CounterExampleColumn getCounterExampleColumn(int index)
  {
    CounterExampleColumn aCounterExampleColumn = counterExampleColumns.get(index);
    return aCounterExampleColumn;
  }

  public List<CounterExampleColumn> getCounterExampleColumns()
  {
    List<CounterExampleColumn> newCounterExampleColumns = Collections.unmodifiableList(counterExampleColumns);
    return newCounterExampleColumns;
  }

  public int numberOfCounterExampleColumns()
  {
    int number = counterExampleColumns.size();
    return number;
  }

  public boolean hasCounterExampleColumns()
  {
    boolean has = counterExampleColumns.size() > 0;
    return has;
  }

  public int indexOfCounterExampleColumn(CounterExampleColumn aCounterExampleColumn)
  {
    int index = counterExampleColumns.indexOf(aCounterExampleColumn);
    return index;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setRequirement(ModuleElement aNewRequirement)
  {
    boolean wasSet = false;
    if (aNewRequirement != null)
    {
      requirement = aNewRequirement;
      wasSet = true;
    }
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCounterExampleColumns()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addCounterExampleColumn(CounterExampleColumn aCounterExampleColumn)
  {
    boolean wasAdded = false;
    if (counterExampleColumns.contains(aCounterExampleColumn)) { return false; }
    counterExampleColumns.add(aCounterExampleColumn);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCounterExampleColumn(CounterExampleColumn aCounterExampleColumn)
  {
    boolean wasRemoved = false;
    if (counterExampleColumns.contains(aCounterExampleColumn))
    {
      counterExampleColumns.remove(aCounterExampleColumn);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCounterExampleColumnAt(CounterExampleColumn aCounterExampleColumn, int index)
  {  
    boolean wasAdded = false;
    if(addCounterExampleColumn(aCounterExampleColumn))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCounterExampleColumns()) { index = numberOfCounterExampleColumns() - 1; }
      counterExampleColumns.remove(aCounterExampleColumn);
      counterExampleColumns.add(index, aCounterExampleColumn);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCounterExampleColumnAt(CounterExampleColumn aCounterExampleColumn, int index)
  {
    boolean wasAdded = false;
    if(counterExampleColumns.contains(aCounterExampleColumn))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCounterExampleColumns()) { index = numberOfCounterExampleColumns() - 1; }
      counterExampleColumns.remove(aCounterExampleColumn);
      counterExampleColumns.add(index, aCounterExampleColumn);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCounterExampleColumnAt(aCounterExampleColumn, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    requirement = null;
    counterExampleColumns.clear();
  }

  // line 33 "../../../../src/NuSMVMetamodel.ump"
   public String printRequirement(){
    //we want to validate that the requirement is in a class of INVARSPEC or CTLSPEC
		if( !(( requirement instanceof InvarConstraint ) || ( requirement instanceof CTLSpecification )) )
			return null;
		return requirement.toString();
  }

  // line 41 "../../../../src/NuSMVMetamodel.ump"
   private CounterExampleColumn buildFirstColumn(List<String> rowLabels){
    CounterExampleColumn firstColumn = new CounterExampleColumn( 0, "Variables"  );
		List<ColumnEntry> entries = buildColumnEntries( rowLabels );
		for( ColumnEntry entry : entries ) {
			entry.setIsDerived( true );
			firstColumn.addColumnEntry( entry );
		}
	
		ColumnEntry firstEntry = new ColumnEntry("Variables");
		firstEntry.setIsDerived( true );
		firstColumn.addColumnEntryAt( firstEntry, 0 );
		return firstColumn;
  }

  // line 55 "../../../../src/NuSMVMetamodel.ump"
   public void setRowLabels(List<String> values){
    for( String value : values )
			rowLabels.add( value );
		counterExampleColumns.add( 0, buildFirstColumn( rowLabels ) );
  }


  /**
   * To facilitate ease of reading, editing the table to eliminate repetitive values are necessary...
   */
  // line 63 "../../../../src/NuSMVMetamodel.ump"
   public List<CounterExampleColumn> editColumnContents(){
    //There is no need for editing if the number of columns of the table is less than 3 (including the header)
		if( counterExampleColumns.size() < 3 )
			return null;
	
		List<CounterExampleColumn> newColumns = new ArrayList<CounterExampleColumn>();
		List<String> stateValues;
		ColumnEntry myEntry;
		
		int i = 1;
		while ( i < counterExampleColumns.size() ) {
			CounterExampleColumn newColumn = new CounterExampleColumn( i, counterExampleColumns.get( i ).getHeader() );
			stateValues = new ArrayList<String>();
			
			int k = 1;
			while( k < counterExampleColumns.get( i ).getColumnEntries().size() ) {

				ColumnEntry entry = counterExampleColumns.get(i).getColumnEntries().get(k);
				ColumnEntry lowEntry = counterExampleColumns.get(i-1).getColumnEntries().get(k);
				if( entry.getValue().equals( lowEntry.getValue() ) ){
					myEntry = new ColumnEntry(" ");
					stateValues.add( " " );
					myEntry.setIsDerived( entry.getIsDerived() );
					newColumn.addColumnEntry( myEntry );
				}
				else {	
					myEntry = new ColumnEntry( entry.getValue() );
					stateValues.add( entry.getValue() );
					myEntry.setIsDerived( entry.getIsDerived() );
					newColumn.addColumnEntry( myEntry );
				}
				k++;
			}
			newColumn.setStateValues( stateValues );
			newColumns.add( newColumn );
			i++;
		}
		newColumns.add( 0, buildFirstColumn( rowLabels ) );
		return newColumns;
  }


  /**
   * To facilitate ease of reading, editing the table to eliminate repetitive values are necessary...
   */
  // line 105 "../../../../src/NuSMVMetamodel.ump"
   public CounterExampleTable editTable(){
    List<CounterExampleColumn> columns = editColumnContents();
		if( columns == null )
			return this;
		
		CounterExampleTable table = new CounterExampleTable(sourceMachine, sourceClass, requirement);
		for( CounterExampleColumn column : columns )
			table.addCounterExampleColumn( column );
		 
		 //table.setRowLabels( rowLabels );
		 return table;
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
    realSb.append(sourceClass);
    realSb.append(TEXT_1);
    realSb.append(printRequirement());
    realSb.append(TEXT_2);
    for(CounterExampleColumn col : counterExampleColumns){
    realSb.append(TEXT_3);
    realSb.append(col.printColumnEntries());
    }
    realSb.append(TEXT_4);

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