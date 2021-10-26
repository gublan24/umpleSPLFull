/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;
import java.util.regex.Pattern;
import java.util.*;

// line 247 "../../../../src/NuSMVMetamodel.ump"
public class VariableSpecifier
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "";
  public static final String TEXT_1 = " : ";
  public static final String TEXT_2 = ";";
  public static final String TEXT_3 = " : ";
  public static final String TEXT_4 = "( ";
  public static final String TEXT_5 = " );";
  public static final String TEXT_6 = " : { ";
  public static final String TEXT_7 = " };";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VariableSpecifier Attributes
  private String identifier;
  private List<String> typeSpecifier;
  private boolean isBracketed;
  private String typeName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public VariableSpecifier(String aIdentifier)
  {
    identifier = aIdentifier;
    typeSpecifier = new ArrayList<String>();
    typeName = null;
    // line 255 "../../../../src/NuSMVMetamodel.ump"
    isBracketed = false; typeName = "";
    // END OF UMPLE AFTER INJECTION
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
  public boolean addTypeSpecifier(String aTypeSpecifier)
  {
    boolean wasAdded = false;
    wasAdded = typeSpecifier.add(aTypeSpecifier);
    return wasAdded;
  }

  public boolean removeTypeSpecifier(String aTypeSpecifier)
  {
    boolean wasRemoved = false;
    wasRemoved = typeSpecifier.remove(aTypeSpecifier);
    return wasRemoved;
  }

  public boolean setIsBracketed(boolean aIsBracketed)
  {
    boolean wasSet = false;
    isBracketed = aIsBracketed;
    wasSet = true;
    return wasSet;
  }

  public boolean setTypeName(String aTypeName)
  {
    boolean wasSet = false;
    typeName = aTypeName;
    wasSet = true;
    return wasSet;
  }

  public String getIdentifier()
  {
    return identifier;
  }
  /* Code from template attribute_GetMany */
  public String getTypeSpecifier(int index)
  {
    String aTypeSpecifier = typeSpecifier.get(index);
    return aTypeSpecifier;
  }

  public String[] getTypeSpecifier()
  {
    String[] newTypeSpecifier = typeSpecifier.toArray(new String[typeSpecifier.size()]);
    return newTypeSpecifier;
  }

  public int numberOfTypeSpecifier()
  {
    int number = typeSpecifier.size();
    return number;
  }

  public boolean hasTypeSpecifier()
  {
    boolean has = typeSpecifier.size() > 0;
    return has;
  }

  public int indexOfTypeSpecifier(String aTypeSpecifier)
  {
    int index = typeSpecifier.indexOf(aTypeSpecifier);
    return index;
  }

  public boolean getIsBracketed()
  {
    return isBracketed;
  }

  public String getTypeName()
  {
    return typeName;
  }

  public void delete()
  {}


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
    if(typeSpecifier.size() == 1 && !isBracketed){
    realSb.append(getIdentifier());
    realSb.append(TEXT_1);
    realSb.append(printArray( typeSpecifier ));
    realSb.append(TEXT_2);
    }
  else if( isBracketed ){
    realSb.append(getIdentifier());
    realSb.append(TEXT_3);
    realSb.append(getTypeName());
    realSb.append(TEXT_4);
    realSb.append(printArray( typeSpecifier ));
    realSb.append(TEXT_5);
    }
  else {
    realSb.append(getIdentifier());
    realSb.append(TEXT_6);
    realSb.append(printArray( typeSpecifier ));
    realSb.append(TEXT_7);
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