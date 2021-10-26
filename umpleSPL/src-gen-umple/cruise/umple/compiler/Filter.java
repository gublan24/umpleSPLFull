/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Fragment source file: Umple_Code.ump
 * Line : 4932
 * Fragment source file: UmpleFilterModel.ump
 * Line : 15
 * Fragment source file: Umple_Code_Filter.ump
 * Line : 153
 * A Diagram represents a subset of the available model and is used
 * to help isolate certain aspects of the system.
 * It will be used by the code generation process to "strip" the model
 * piror to generation so that all generators will support Diagrams
 * 
 * Right now, no implementation, just setting up the model
 */
// line 105 "../../../../src/Umple_Code_Filter.ump"
// line 388 "../../../../src/Association_refactored.ump"
// line 687 "../../../../src/Association_refactored.ump"
// line 9 "../../../../src/UmpleFilterModel.ump"
public class Filter
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Filter Attributes
  private int associationCount;
  private String name;
  private int superCount;
  private int subCount;
  private List<String> values;
  private List<String> filterValues;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Filter(String aName)
  {
    associationCount = -1;
    name = aName;
    superCount = -1;
    subCount = 0;
    values = new ArrayList<String>();
    filterValues = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAssociationCount(int aAssociationCount)
  {
    boolean wasSet = false;
    associationCount = aAssociationCount;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setSuperCount(int aSuperCount)
  {
    boolean wasSet = false;
    superCount = aSuperCount;
    wasSet = true;
    return wasSet;
  }

  public boolean setSubCount(int aSubCount)
  {
    boolean wasSet = false;
    subCount = aSubCount;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addValue(String aValue)
  {
    boolean wasAdded = false;
    wasAdded = values.add(aValue);
    return wasAdded;
  }

  public boolean removeValue(String aValue)
  {
    boolean wasRemoved = false;
    wasRemoved = values.remove(aValue);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addFilterValue(String aFilterValue)
  {
    boolean wasAdded = false;
    wasAdded = filterValues.add(aFilterValue);
    return wasAdded;
  }

  public boolean removeFilterValue(String aFilterValue)
  {
    boolean wasRemoved = false;
    wasRemoved = filterValues.remove(aFilterValue);
    return wasRemoved;
  }

  public int getAssociationCount()
  {
    return associationCount;
  }

  public String getName()
  {
    return name;
  }

  public int getSuperCount()
  {
    return superCount;
  }

  public int getSubCount()
  {
    return subCount;
  }
  /* Code from template attribute_GetMany */
  public String getValue(int index)
  {
    String aValue = values.get(index);
    return aValue;
  }

  public String[] getValues()
  {
    String[] newValues = values.toArray(new String[values.size()]);
    return newValues;
  }

  public int numberOfValues()
  {
    int number = values.size();
    return number;
  }

  public boolean hasValues()
  {
    boolean has = values.size() > 0;
    return has;
  }

  public int indexOfValue(String aValue)
  {
    int index = values.indexOf(aValue);
    return index;
  }
  /* Code from template attribute_GetMany */
  public String getFilterValue(int index)
  {
    String aFilterValue = filterValues.get(index);
    return aFilterValue;
  }

  public String[] getFilterValues()
  {
    String[] newFilterValues = filterValues.toArray(new String[filterValues.size()]);
    return newFilterValues;
  }

  public int numberOfFilterValues()
  {
    int number = filterValues.size();
    return number;
  }

  public boolean hasFilterValues()
  {
    boolean has = filterValues.size() > 0;
    return has;
  }

  public int indexOfFilterValue(String aFilterValue)
  {
    int index = filterValues.indexOf(aFilterValue);
    return index;
  }

  public void delete()
  {}

  // line 109 "../../../../src/Umple_Code_Filter.ump"
   public boolean hasNestedFilter(){
    return getFilterValues().length > 0;
  }

  // line 115 "../../../../src/Umple_Code_Filter.ump"
   public boolean hasSub(){
    return getSubCount() > 0;
  }

  // line 120 "../../../../src/Umple_Code_Filter.ump"
   public boolean hasSuper(){
    return getSuperCount() >= 0;
  }

  // line 126 "../../../../src/Umple_Code_Filter.ump"
   public boolean isEmpty(){
    return getValues().length == 0 || "*".equals(getValue(0));
  }

  // line 131 "../../../../src/Umple_Code_Filter.ump"
   public boolean isIncluded(String name){
    if (name == null)
      {
        return false;
      }
      else
      {
        return values.indexOf(name) != -1;
      }
  }

  // line 143 "../../../../src/Umple_Code_Filter.ump"
   public boolean isIncluded(UmpleClass clazz){
    if (clazz == null)
      {
        return false;
      }
      else
      {
        return isIncluded(clazz.getName());
      }
  }

  // line 689 "../../../../src/Association_refactored.ump"
   public boolean hasAssociation(){
    return getAssociationCount() > 0;
  }


  public String toString()
  {
    return super.toString() + "["+
            "associationCount" + ":" + getAssociationCount()+ "," +
            "name" + ":" + getName()+ "," +
            "superCount" + ":" + getSuperCount()+ "," +
            "subCount" + ":" + getSubCount()+ "]";
  }
}