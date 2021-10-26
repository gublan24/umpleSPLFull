/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Pattern;

// line 44 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreGenericNode
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String Xmltagstart = "<";
  public static final String Xmltagend = ">";
  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "  ";
  public static final String TEXT_1 = " ";
  public static final String TEXT_2 = "=\"";
  public static final String TEXT_3 = "\"";
  public static final String TEXT_4 = " />";
  public static final String TEXT_5 = NL;
  public static final String TEXT_6 = "";
  public static final String TEXT_7 = "  ";
  public static final String TEXT_8 = "/";
  public static final String TEXT_9 = NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreGenericNode Attributes
  private String name;
  private String tagName;
  private int intent;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetTagName;
  private boolean canSetName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreGenericNode(String aName, int aIntent)
  {
    cachedHashCode = -1;
    canSetName = true;
    name = aName;
    canSetTagName = true;
    intent = aIntent;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    if (!canSetName) { return false; }
    name = aName;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetImmutable */
  public boolean setTagName(String aTagName)
  {
    boolean wasSet = false;
    if (!canSetTagName) { return false; }
    canSetTagName = false;
    tagName = aTagName;
    wasSet = true;
    return wasSet;
  }

  public boolean setIntent(int aIntent)
  {
    boolean wasSet = false;
    intent = aIntent;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getTagName()
  {
    return tagName;
  }

  public int getIntent()
  {
    return intent;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    EcoreGenericNode compareTo = (EcoreGenericNode)obj;
  
    if (getName() == null && compareTo.getName() != null)
    {
      return false;
    }
    else if (getName() != null && !getName().equals(compareTo.getName()))
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
    if (getName() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getName().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetName = false;
    return cachedHashCode;
  }

  public void delete()
  {}

  // line 53 "../../../../src/Generator_CodeEcore_Model.ump"
  public List<EcoreGenericNode> getNodeChildren(){
    return new ArrayList<EcoreGenericNode>();
  }

  // line 54 "../../../../src/Generator_CodeEcore_Model.ump"
  public Integer getNodeChildCount(){
    return 0;
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _getCode(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
    for(int i=0; i<intent; i++)
      
    realSb.append(TEXT_0);
    
    
    realSb.append(Xmltagstart);
    realSb.append(tagName);
    
    for(Entry<String,String> entry : getNodeAttributes().entrySet()){
      
    realSb.append(TEXT_1);
    realSb.append(entry.getKey());
    realSb.append(TEXT_2);
    realSb.append(entry.getValue());
    realSb.append(TEXT_3);
    
    }
    if(getNodeChildCount()==0){
    realSb.append(TEXT_4);
    
    }else{
    
    realSb.append(Xmltagend);
    realSb.append(TEXT_5);
    realSb.append(TEXT_6);
        for(EcoreGenericNode node : getNodeChildren()){
    
    realSb.append(node.getCode());
    
    }for(int i=0; i<intent; i++)
      
    realSb.append(TEXT_7);
    
    
    realSb.append(Xmltagstart);
    realSb.append(TEXT_8);
    realSb.append(tagName);
    realSb.append(Xmltagend);
    }
    realSb.append(TEXT_9);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getCode(){
        StringBuilder sb = new StringBuilder();
    return this._getCode(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "tagName" + ":" + getTagName()+ "," +
            "intent" + ":" + getIntent()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 52 "../../../../src/Generator_CodeEcore_Model.ump"
  Map<String,String> getNodeAttributes () 
  {
    return new LinkedHashMap<String, String>();
  }

  
}