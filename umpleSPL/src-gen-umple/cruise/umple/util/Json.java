/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.util;
import java.util.*;

// line 21 "../../../../src/Json.ump"
// line 127 "../../../../src/Json_Code.ump"
public class Json
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Json Attributes
  private String name;
  private String value;
  private List<Json> composites;
  private List<Json> arrays;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Json(String aName, String aValue)
  {
    name = aName;
    value = aValue;
    composites = new ArrayList<Json>();
    arrays = new ArrayList<Json>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
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
  /* Code from template attribute_SetMany */
  public boolean addComposite(Json aComposite)
  {
    boolean wasAdded = false;
    wasAdded = composites.add(aComposite);
    return wasAdded;
  }

  public boolean removeComposite(Json aComposite)
  {
    boolean wasRemoved = false;
    wasRemoved = composites.remove(aComposite);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addArray(Json aArray)
  {
    boolean wasAdded = false;
    wasAdded = arrays.add(aArray);
    return wasAdded;
  }

  public boolean removeArray(Json aArray)
  {
    boolean wasRemoved = false;
    wasRemoved = arrays.remove(aArray);
    return wasRemoved;
  }

  public String getName()
  {
    return name;
  }

  public String getValue()
  {
    return value;
  }
  /* Code from template attribute_GetMany */
  public Json getComposite(int index)
  {
    Json aComposite = composites.get(index);
    return aComposite;
  }

  public Json[] getComposites()
  {
    Json[] newComposites = composites.toArray(new Json[composites.size()]);
    return newComposites;
  }

  public int numberOfComposites()
  {
    int number = composites.size();
    return number;
  }

  public boolean hasComposites()
  {
    boolean has = composites.size() > 0;
    return has;
  }

  public int indexOfComposite(Json aComposite)
  {
    int index = composites.indexOf(aComposite);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Json getArray(int index)
  {
    Json aArray = arrays.get(index);
    return aArray;
  }

  public Json[] getArrays()
  {
    Json[] newArrays = arrays.toArray(new Json[arrays.size()]);
    return newArrays;
  }

  public int numberOfArrays()
  {
    int number = arrays.size();
    return number;
  }

  public boolean hasArrays()
  {
    boolean has = arrays.size() > 0;
    return has;
  }

  public int indexOfArray(Json aArray)
  {
    int index = arrays.indexOf(aArray);
    return index;
  }

  public void delete()
  {}

  // line 132 "../../../../src/Json_Code.ump"
   public boolean isComposite(){
    return value == null;
  }

  // line 137 "../../../../src/Json_Code.ump"
   public void addComposite(String name, String value){
    addComposite(new Json(name,value));
  }

  // line 142 "../../../../src/Json_Code.ump"
   public void addArrayEntity(String value){
    addComposite(new Json(null,value));
  }

  // line 147 "../../../../src/Json_Code.ump"
   public int getIntValue(String name){
    return convertToInt(getValue(name));
  }

  // line 152 "../../../../src/Json_Code.ump"
   public Json[] getArray(String name){
    for (Json anArray : arrays)
    {
      if (name.equals(anArray.getName()))
      {
        return anArray.getComposites();
      }
    }
    return null;
  }

  // line 164 "../../../../src/Json_Code.ump"
   public Json getAttribute(String name){
    if (name == null)
    {
      return null;
    }
    
    for (Json attr : composites)
    {
      if (name.equals(attr.getName()))
      {
        return attr;
      }
    }
    return null;
  }

  // line 181 "../../../../src/Json_Code.ump"
   public String getValue(String name){
    Json attr = getAttribute(name);
    return attr == null ? null : attr.getValue();
  }

  // line 187 "../../../../src/Json_Code.ump"
   public int getIntValue(){
    return convertToInt(value);
  }

  // line 192 "../../../../src/Json_Code.ump"
   private int convertToInt(String input){
    if (input == null)
    {
      return -1;
    }
    
    try
    {
      return Integer.parseInt(input);
    }
    catch (NumberFormatException e)
    {
      return -1;
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "value" + ":" + getValue()+ "]";
  }
}