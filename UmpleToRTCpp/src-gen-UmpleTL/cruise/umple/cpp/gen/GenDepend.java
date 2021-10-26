/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.io.Serializable;

/**
 * class GenDepend{
 * String includeNamespace(){
 * GenClass genClass= getGenClass();
 * if(genClass!= null){
 * return genClass.includeNamespace();
 * }
 * 
 * return getNamespace();
 * }
 * namespace= {includeNamespace()};
 * }
 */
// line 1484 "../../../../../UmpleTLTemplates/Attributes.ump"
// line 45 "../../../../../UmpleTLTemplates/Depend.ump"
public class GenDepend implements java.io.Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "#include ";
  public static final String TEXT_1 = "using namespace ";
  public static final String TEXT_2 = ";";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenDepend Attributes
  private String name;
  private String id;
  private int priority;
  private boolean addSuffix;
  private boolean prioritized;
  private boolean isLibrary;
  private String namespace;

  //GenDepend Associations
  private GenPackage genPackage;
  private GenClass genDependClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenDepend(String aName)
  {
    name = aName;
    id = null;
    priority = 0;
    addSuffix = false;
    prioritized = false;
    isLibrary = false;
    namespace = null;
    // line 56 "../../../../../UmpleTLTemplates/Depend.ump"
    setId(name); //id has the value of name by default
    // END OF UMPLE AFTER INJECTION
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

  public boolean setId(String aId)
  {
    boolean wasSet = false;
    id = aId;
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

  public boolean setAddSuffix(boolean aAddSuffix)
  {
    boolean wasSet = false;
    addSuffix = aAddSuffix;
    wasSet = true;
    return wasSet;
  }

  public boolean setPrioritized(boolean aPrioritized)
  {
    boolean wasSet = false;
    prioritized = aPrioritized;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsLibrary(boolean aIsLibrary)
  {
    boolean wasSet = false;
    isLibrary = aIsLibrary;
    wasSet = true;
    return wasSet;
  }

  public boolean setNamespace(String aNamespace)
  {
    boolean wasSet = false;
    namespace = aNamespace;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getId()
  {
    return id;
  }

  public int getPriority()
  {
    return priority;
  }

  public boolean getAddSuffix()
  {
    return addSuffix;
  }

  public boolean getPrioritized()
  {
    return prioritized;
  }

  public boolean getIsLibrary()
  {
    return isLibrary;
  }

  public String getNamespace()
  {
    return namespace;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isAddSuffix()
  {
    return addSuffix;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isPrioritized()
  {
    return prioritized;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsLibrary()
  {
    return isLibrary;
  }
  /* Code from template association_GetOne */
  public GenPackage getGenPackage()
  {
    return genPackage;
  }

  public boolean hasGenPackage()
  {
    boolean has = genPackage != null;
    return has;
  }
  /* Code from template association_GetOne */
  public GenClass getGenDependClass()
  {
    return genDependClass;
  }

  public boolean hasGenDependClass()
  {
    boolean has = genDependClass != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenPackage(GenPackage aGenPackage)
  {
    boolean wasSet = false;
    GenPackage existingGenPackage = genPackage;
    genPackage = aGenPackage;
    if (existingGenPackage != null && !existingGenPackage.equals(aGenPackage))
    {
      existingGenPackage.removeInclude(this);
    }
    if (aGenPackage != null)
    {
      aGenPackage.addInclude(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenDependClass(GenClass aGenDependClass)
  {
    boolean wasSet = false;
    GenClass existingGenDependClass = genDependClass;
    genDependClass = aGenDependClass;
    if (existingGenDependClass != null && !existingGenDependClass.equals(aGenDependClass))
    {
      existingGenDependClass.removeDependency(this);
    }
    if (aGenDependClass != null)
    {
      aGenDependClass.addDependency(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (genPackage != null)
    {
      GenPackage placeholderGenPackage = genPackage;
      this.genPackage = null;
      placeholderGenPackage.removeInclude(this);
    }
    if (genDependClass != null)
    {
      GenClass placeholderGenDependClass = genDependClass;
      this.genDependClass = null;
      placeholderGenDependClass.removeDependency(this);
    }
  }


  /**
   * key {id}	Until having complex key support
   */
  // line 62 "../../../../../UmpleTLTemplates/Depend.ump"
  public Boolean isObject(){
    GenClass owner = getGenDependClass();
		if (owner == null) {
			return false;
		}

		GenPackage genPackage = owner.getGenPackage();
		if(genPackage == null){
			return false;
		}
		
		String namespace= getNamespace();
		
		GenPackage packageByName = namespace== null || namespace.isEmpty()?genPackage: genPackage.packageByName(namespace);
		if (packageByName != null) {
			return packageByName.classByName(getName()) != null;
		}

		return false;
  }

  // line 83 "../../../../../UmpleTLTemplates/Depend.ump"
  public String full(){
    String _value= this.getName();
		if(!getIsLibrary()){
			String _namespace= getNamespace();
			if(_namespace!= null && !_namespace.isEmpty()){
				_value= toPath(_namespace)+"/"+_value;
			}
		}
		
		if(addSuffix){
			_value= _value+ ".h";
		}
		
		if(prioritized){
			_value= enclose(_value, "\"", "\"");
		}else{
			_value= enclose(_value, "<", ">");
		}
		
		return _value;
  }

  // line 105 "../../../../../UmpleTLTemplates/Depend.ump"
  public String enclose(String value, String first, String last){
    if(!value.startsWith(first)){
			value= first+ value;
		}
		
		if(!value.endsWith(last)){
			value= value+ last;
		}
		
		return value;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1363 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String preprocessingDefinition(String suffix){
    String namespace= this.getNamespace();
		String name= this.getName();
		
		if(namespace.isEmpty()){
			return (name+"_"+suffix).toUpperCase();
		}else{
			return (namespace.replace("/", "_")+"_"+name+"_"+suffix).toUpperCase();
		}
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1374 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceOpening(){
    return namespaceOpening(getNamespace())+ NL;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1378 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceClosing(){
    return namespaceClosing(getNamespace())+ NL;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1382 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceOpening(String namespace){
    return namespace("_", null, "_BEGIN", namespace);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1386 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceClosing(String namespace){
    return namespace("_", null, "_END", namespace);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1390 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespace(String join, String prepend, String append){
    return namespace(join, prepend, append, getNamespace());
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1394 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespace(String join, String prepend, String append, String namespace){
    String _namespace= namespaceEnclosure(join, namespace);
		if(_namespace.isEmpty()){
			return _namespace;
		}
		
		if(prepend != null){
			_namespace= prepend+ _namespace;
		}
		
		if(append != null){
			_namespace= _namespace+ append;
		}
		
		return _namespace;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1411 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String preprocessingDefinitionName(){
    String _namespace= namespaceEnclosure();
		if(_namespace.isEmpty()){
			_namespace= getGenPackage().getName();
		}
		_namespace= "DEF_"+ _namespace;	//A protection against package names that start with numbers; otherwise, this definition will be invalid
		_namespace+= "_"+ getName();
		return _namespace.toUpperCase();
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1421 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String qualifiedName(){
    String fullPath= fullPath();
		if(fullPath== null || fullPath.isEmpty()){
			return getName();
		}
		
		return fullPath+ "/"+ getName();
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1430 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String fullPath(){
    String _namespace= getNamespace();
		if(_namespace.isEmpty()){
			_namespace= getGenPackage().getName();
		}else{
			_namespace= toPath(_namespace);
		}
		return _namespace;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1440 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String toPath(String value){
    return value.replace(".", "/");
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1444 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceEnclosure(){
    return namespaceEnclosure("_");
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1448 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceEnclosure(String join){
    return namespaceEnclosure(join, getNamespace());
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1452 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceEnclosure(String join, String _namespace){
    if(_namespace== null || _namespace.isEmpty()){
			return "";
		}
		
		String normalized= _namespace.replace("/", ".").replace("_", ".");
		String[] splits = normalized.split("\\.");
		_namespace= Arrays.asList(splits).stream().collect(Collectors.joining(join));
		
		return _namespace;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1464 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String fullQualifiedName(){
    return fullQualifiedName(getNamespace());
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1468 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String fullQualifiedName(String _namespace){
    String name= this.getName();
		
		String normalizedNamespace= "";
		if(!_namespace.isEmpty()){
			normalizedNamespace= namespaceCallPath(_namespace)+ "::"+ name;
		}else{
			normalizedNamespace= name;
		}
		return normalizedNamespace;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1480 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceCallPath(String _namespace){
    return _namespace.replace(".", "::").replace("_", "::");
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
    realSb.append(full());

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

  public StringBuilder _namespaceDeclaration(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
String _namespace= getNamespace();
if(_namespace != null && !_namespace.isEmpty()){
    realSb.append(TEXT_1);
    realSb.append(_namespace);
    realSb.append(TEXT_2);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String namespaceDeclaration(){
        StringBuilder sb = new StringBuilder();
    return this._namespaceDeclaration(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "id" + ":" + getId()+ "," +
            "priority" + ":" + getPriority()+ "," +
            "addSuffix" + ":" + getAddSuffix()+ "," +
            "prioritized" + ":" + getPrioritized()+ "," +
            "isLibrary" + ":" + getIsLibrary()+ "," +
            "namespace" + ":" + getNamespace()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "genPackage = "+(getGenPackage()!=null?Integer.toHexString(System.identityHashCode(getGenPackage())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "genDependClass = "+(getGenDependClass()!=null?Integer.toHexString(System.identityHashCode(getGenDependClass())):"null");
  }
}