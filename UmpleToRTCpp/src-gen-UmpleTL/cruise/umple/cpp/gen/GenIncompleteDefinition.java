/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.regex.Pattern;
import java.io.Serializable;

// line 1437 "../../../../../UmpleTLTemplates/Core.ump"
public class GenIncompleteDefinition implements java.io.Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "class ";
  public static final String TEXT_1 = ";";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenIncompleteDefinition Attributes
  private String value;
  private int priority;

  //GenIncompleteDefinition Associations
  private GenClass genClass;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetValue;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenIncompleteDefinition(String aValue)
  {
    cachedHashCode = -1;
    canSetValue = true;
    value = aValue;
    priority = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    if (!canSetValue) { return false; }
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  public boolean setPriority(int aPriority)
  {
    boolean wasSet = false;
    priority = aPriority;
    wasSet = true;
    return wasSet;
  }

  public String getValue()
  {
    return value;
  }

  public int getPriority()
  {
    return priority;
  }
  /* Code from template association_GetOne */
  public GenClass getGenClass()
  {
    return genClass;
  }

  public boolean hasGenClass()
  {
    boolean has = genClass != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenClass(GenClass aGenClass)
  {
    boolean wasSet = false;
    GenClass existingGenClass = genClass;
    genClass = aGenClass;
    if (existingGenClass != null && !existingGenClass.equals(aGenClass))
    {
      existingGenClass.removeIncomplete(this);
    }
    if (aGenClass != null)
    {
      aGenClass.addIncomplete(this);
    }
    wasSet = true;
    return wasSet;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    GenIncompleteDefinition compareTo = (GenIncompleteDefinition)obj;
  
    if (getValue() == null && compareTo.getValue() != null)
    {
      return false;
    }
    else if (getValue() != null && !getValue().equals(compareTo.getValue()))
    {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    if (getValue() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getValue().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetValue = false;
    return cachedHashCode;
  }

  public void delete()
  {
    if (genClass != null)
    {
      GenClass placeholderGenClass = genClass;
      this.genClass = null;
      placeholderGenClass.removeIncomplete(this);
    }
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _declaration(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(value);
    realSb.append(TEXT_1);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String declaration(){
        StringBuilder sb = new StringBuilder();
    return this._declaration(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "value" + ":" + getValue()+ "," +
            "priority" + ":" + getPriority()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "genClass = "+(getGenClass()!=null?Integer.toHexString(System.identityHashCode(getGenClass())):"null");
  }
}