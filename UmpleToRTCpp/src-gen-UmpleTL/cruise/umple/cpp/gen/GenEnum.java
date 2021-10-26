/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

// line 113 "../../../../../UmpleTLTemplates/Core.ump"
public class GenEnum implements java.io.Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "class ";
  public static final String TEXT_1 = "{" + NL + NL + "  public:" + NL + "    typedef enum{";
  public static final String TEXT_2 = "} enum_type;" + NL + "    " + NL + "    ";
  public static final String TEXT_3 = "(";
  public static final String TEXT_4 = "enum_type val = ";
  public static final String TEXT_5 = "): _val(val";
  public static final String TEXT_6 = "){" + NL + "        ";
  public static final String TEXT_7 = "//Empty Enumeration";
  public static final String TEXT_8 = "assert(val <= ";
  public static final String TEXT_9 = ");";
  public static final String TEXT_10 = NL + "        }" + NL + "    " + NL + "        operator enum_type() const {" + NL + "            return _val;" + NL + "        }" + NL + "        " + NL + "        operator int() { " + NL + "              return static_cast<int>(_val); " + NL + "      }" + NL + "      " + NL + "      operator string() { " + NL + "        switch (_val){";
  public static final String TEXT_11 = NL + "          case ";
  public static final String TEXT_12 = ": return \"";
  public static final String TEXT_13 = "\";";
  public static final String TEXT_14 = "        " + NL + "          default:  return \"[Unknown ";
  public static final String TEXT_15 = " Type]\";" + NL + "      }" + NL + "    }" + NL + "    " + NL + "  private:" + NL + "      enum_type _val;" + NL + "};" + NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenEnum Attributes
  private String name;
  private String description;
  private transient Comparator<GenEnumEntry> entriesPriority;

  //GenEnum Associations
  private List<GenEnumEntry> entries;
  private GenClass owner;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenEnum(String aName)
  {
    name = aName;
    description = "ENUM";
    entriesPriority = 
      Comparator.comparing(GenEnumEntry::getPriority);
    entries = new ArrayList<GenEnumEntry>();
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

  public boolean setDescription(String aDescription)
  {
    boolean wasSet = false;
    description = aDescription;
    wasSet = true;
    return wasSet;
  }

  public boolean setEntriesPriority(Comparator<GenEnumEntry> aEntriesPriority)
  {
    boolean wasSet = false;
    entriesPriority = aEntriesPriority;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getDescription()
  {
    return description;
  }

  public Comparator<GenEnumEntry> getEntriesPriority()
  {
    return entriesPriority;
  }
  /* Code from template association_GetMany */
  public GenEnumEntry getEntry(int index)
  {
    GenEnumEntry aEntry = entries.get(index);
    return aEntry;
  }

  public List<GenEnumEntry> getEntries()
  {
    List<GenEnumEntry> newEntries = Collections.unmodifiableList(entries);
    return newEntries;
  }

  public int numberOfEntries()
  {
    int number = entries.size();
    return number;
  }

  public boolean hasEntries()
  {
    boolean has = entries.size() > 0;
    return has;
  }

  public int indexOfEntry(GenEnumEntry aEntry)
  {
    int index = entries.indexOf(aEntry);
    return index;
  }
  /* Code from template association_GetOne */
  public GenClass getOwner()
  {
    return owner;
  }

  public boolean hasOwner()
  {
    boolean has = owner != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEntries()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addEntry(GenEnumEntry aEntry)
  {
    boolean wasAdded = false;
    if (entries.contains(aEntry)) { return false; }
    GenEnum existingGenEnum = aEntry.getGenEnum();
    if (existingGenEnum == null)
    {
      aEntry.setGenEnum(this);
    }
    else if (!this.equals(existingGenEnum))
    {
      existingGenEnum.removeEntry(aEntry);
      addEntry(aEntry);
    }
    else
    {
      entries.add(aEntry);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(entries, entriesPriority);
    
    return wasAdded;
  }

  public boolean removeEntry(GenEnumEntry aEntry)
  {
    boolean wasRemoved = false;
    if (entries.contains(aEntry))
    {
      entries.remove(aEntry);
      aEntry.setGenEnum(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  /* Code from template association_SetOptionalOneToMany */
  public boolean setOwner(GenClass aOwner)
  {
    boolean wasSet = false;
    GenClass existingOwner = owner;
    owner = aOwner;
    if (existingOwner != null && !existingOwner.equals(aOwner))
    {
      existingOwner.removeEnumeration(this);
    }
    if (aOwner != null)
    {
      aOwner.addEnumeration(this);
    }
    wasSet = true;
    return wasSet;
  }

  /* Code from template association_sorted_serializable_readObject */ 
  private void readObject(java.io.ObjectInputStream in)
  throws Exception
  {
    in.defaultReadObject();

    entriesPriority = 
      Comparator.comparing(GenEnumEntry::getPriority);
  }
  
  public void delete()
  {
    while( !entries.isEmpty() )
    {
      entries.get(0).setGenEnum(null);
    }
    if (owner != null)
    {
      GenClass placeholderOwner = owner;
      this.owner = null;
      placeholderOwner.removeEnumeration(this);
    }
  }

  // line 119 "../../../../../UmpleTLTemplates/Core.ump"
  public String enclosure(){
    return getOwner().getName()+ "_ENUM";
  }


  /**
   * Below is Cpp-specific
   */
  // line 124 "../../../../../UmpleTLTemplates/Core.ump"
  public String namespaceOpening(){
    return enclosure()+ "_BEGIN";
  }

  // line 128 "../../../../../UmpleTLTemplates/Core.ump"
  public String namespaceClosing(){
    return enclosure()+ "_END";
  }

  // line 132 "../../../../../UmpleTLTemplates/Core.ump"
  public String safeName(Boolean unique){
    String normalized= name.substring(0, name.length()-1);
		if(unique){
			String enclosure = enclosure();
			if(!enclosure.isEmpty()){
				normalized= enclosure+ "_"+ normalized;
			}
		}
		return normalized;
  }

  // line 143 "../../../../../UmpleTLTemplates/Core.ump"
  public String safeName(){
    GenPackage genPackage = getOwner().getGenPackage();
		String name= getName();
		int count= 0;
		
		for(GenClass genClass: genPackage.getClasses()){
			for(GenEnum genEnum: genClass.getEnumerations()){
				String enumName = genEnum.getName();
				if(genEnum.equals(this)){
					return safeName(count>0);
				}
				
				if(enumName.equals(name)){
					count++;
				}
			}
		}
		
		return safeName(count>0);
  }

  // line 165 "../../../../../UmpleTLTemplates/Core.ump"
  public String entries(){
    List<GenEnumEntry> entries = getEntries();
		return entries.stream().map(entry->{
	    	return entry.getName()+ "="+ entries.indexOf(entry);
	    }).collect(Collectors.joining(", "));
  }

  // line 215 "../../../../../UmpleTLTemplates/Core.ump"
  public String callPath(){
    String path= getOwner().getNamespace().replace(".", "::").replace("_", "::");
		if(!path.isEmpty()){
			path= "::"+ path;
		}
		
		return path+"::"+ enclosure()+ "::" + getName();
  }

  // line 224 "../../../../../UmpleTLTemplates/Core.ump"
  public String callPathDefinition(Boolean unique){
    String path= callPath();
		String normalized= name.substring(0, name.length()-1);
		if(unique){
			String enclosure = enclosure();
			if(!enclosure.isEmpty()){
				normalized= enclosure+ "_"+ normalized;
			}
		}
		return "#define "+ normalized+ "   " + path;
  }

  // line 236 "../../../../../UmpleTLTemplates/Core.ump"
  public String callNamespaceBegin(){
    String enclosure= enclosure();
		return "#define "+ enclosure+ "_BEGIN"+ "   namespace "+ enclosure+ "{";
  }

  // line 241 "../../../../../UmpleTLTemplates/Core.ump"
  public String callNamespaceEnd(){
    String enclosure= enclosure();
		return "#define "+ enclosure+ "_END"+ "   }";
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
    
    
	String namespaceOpening= namespaceOpening();
	String namespaceClosing= namespaceClosing();
	String entries= entries();
	String name= getName();
	
	String first= getEntry(0).getName();
	String last= getEntry(numberOfEntries()-1).getName();


    realSb.append(namespaceOpening);
    realSb.append(TEXT_0);
    realSb.append(name);
    realSb.append(TEXT_1);
    realSb.append(entries);
    realSb.append(TEXT_2);
    realSb.append(name);
    realSb.append(TEXT_3);
    if(last != null && !last.isEmpty()){
    realSb.append(TEXT_4);
    realSb.append(first);
    realSb.append(TEXT_5);
    }
    realSb.append(TEXT_6);
    if(last.isEmpty()){
    realSb.append(TEXT_7);
    }
    else{
    realSb.append(TEXT_8);
    realSb.append(last);
    realSb.append(TEXT_9);
    }
    realSb.append(TEXT_10);
    
				for(GenEnumEntry entry: getEntries()){
					String entryName= entry.getName();
    realSb.append(TEXT_11);
    realSb.append(entryName);
    realSb.append(TEXT_12);
    realSb.append(entryName);
    realSb.append(TEXT_13);
    }
    realSb.append(TEXT_14);
    realSb.append(description);
    realSb.append(TEXT_15);
    realSb.append(namespaceClosing);

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
            "name" + ":" + getName()+ "," +
            "description" + ":" + getDescription()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "entriesPriority" + "=" + (getEntriesPriority() != null ? !getEntriesPriority().equals(this)  ? getEntriesPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "owner = "+(getOwner()!=null?Integer.toHexString(System.identityHashCode(getOwner())):"null");
  }
}