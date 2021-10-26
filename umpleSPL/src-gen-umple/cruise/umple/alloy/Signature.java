/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;
import java.util.*;

// line 290 "../../../../src/AlloySignature.ump"
public class Signature extends AlloyObject
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Signature Attributes
  private String name;
  private String extendsName;
  private boolean isBounded;
  private boolean isAbstract;
  private boolean isSingleton;

  //Signature Associations
  private List<Function> function;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Signature(String aName, String aExtendsName, boolean aIsBounded, boolean aIsAbstract, boolean aIsSingleton)
  {
    super();
    name = aName;
    extendsName = aExtendsName;
    isBounded = aIsBounded;
    isAbstract = aIsAbstract;
    isSingleton = aIsSingleton;
    function = new ArrayList<Function>();
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

  public boolean setExtendsName(String aExtendsName)
  {
    boolean wasSet = false;
    extendsName = aExtendsName;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsBounded(boolean aIsBounded)
  {
    boolean wasSet = false;
    isBounded = aIsBounded;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsAbstract(boolean aIsAbstract)
  {
    boolean wasSet = false;
    isAbstract = aIsAbstract;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsSingleton(boolean aIsSingleton)
  {
    boolean wasSet = false;
    isSingleton = aIsSingleton;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getExtendsName()
  {
    return extendsName;
  }

  public boolean getIsBounded()
  {
    return isBounded;
  }

  public boolean getIsAbstract()
  {
    return isAbstract;
  }

  public boolean getIsSingleton()
  {
    return isSingleton;
  }
  /* Code from template association_GetMany */
  public Function getFunction(int index)
  {
    Function aFunction = function.get(index);
    return aFunction;
  }

  /**
   * 1 -> 1 Utility utility;
   */
  public List<Function> getFunction()
  {
    List<Function> newFunction = Collections.unmodifiableList(function);
    return newFunction;
  }

  public int numberOfFunction()
  {
    int number = function.size();
    return number;
  }

  public boolean hasFunction()
  {
    boolean has = function.size() > 0;
    return has;
  }

  public int indexOfFunction(Function aFunction)
  {
    int index = function.indexOf(aFunction);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFunction()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addFunction(Function aFunction)
  {
    boolean wasAdded = false;
    if (function.contains(aFunction)) { return false; }
    function.add(aFunction);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeFunction(Function aFunction)
  {
    boolean wasRemoved = false;
    if (function.contains(aFunction))
    {
      function.remove(aFunction);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFunctionAt(Function aFunction, int index)
  {  
    boolean wasAdded = false;
    if(addFunction(aFunction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFunction()) { index = numberOfFunction() - 1; }
      function.remove(aFunction);
      function.add(index, aFunction);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFunctionAt(Function aFunction, int index)
  {
    boolean wasAdded = false;
    if(function.contains(aFunction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFunction()) { index = numberOfFunction() - 1; }
      function.remove(aFunction);
      function.add(index, aFunction);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFunctionAt(aFunction, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    function.clear();
    super.delete();
  }

  // line 305 "../../../../src/AlloySignature.ump"
   public  Signature(UmpleClass uClass){
    instantiateDataMembers(uClass);
	Set<Association> processedAssociations = new HashSet<Association>();
	for(Association assoc : uClass.getAssociations())
	{
	  if(processedAssociations.contains(assoc)) continue;
	  processedAssociations.add(assoc);	
	   
	  Association uAssoc = reComposeAssociation(assoc,uClass);
	    
	  Function funct = new Function(uAssoc);
	  AssociationEnd beginEnd = uAssoc.getEnd(0), endToOutput = uAssoc.getEnd(1); 
			
	  //Reflexive association case 
      if(endToOutput.getClassName().equals(beginEnd.getClassName()))
        funct = new Function(uAssoc,endToOutput.getClassName());	
        
      if(!assoc.isIsRightNavigable()) 
        if(name.equals(assoc.getEnd(0).getClassName())) continue;

      if(!assoc.isIsLeftNavigable())
        if(name.equals(assoc.getEnd(1).getClassName())) continue;
	  isBounded = addFunction(funct);	
	}
	
	//This handles attributes of integer types
	for(Attribute attr : uClass.getAttributes())
	{
	  Function funct = new Function(attr);
	  isBounded = addFunction(funct);
	}
  }

  // line 340 "../../../../src/AlloySignature.ump"
   private String getExtendsClass(UmpleClass uClass){
    if(uClass.hasExtendsClass()) 
      return uClass.getExtendsClass().getName();
    return "";
  }

  // line 346 "../../../../src/AlloySignature.ump"
   private void instantiateDataMembers(UmpleClass uClass){
    //utility = new Utility();
	/*if(getExtendsClass(uClass).equals(""))
	{
	  extendsName = "";
	}*/
	
	extendsName = getExtendsClass(uClass);
	function = new ArrayList<Function>();
	name = uClass.getName();
    isAbstract = uClass.getIsAbstract();
    isSingleton = uClass.getIsSingleton();
  }

  // line 361 "../../../../src/AlloySignature.ump"
   private Association reComposeAssociation(Association assoc, UmpleClass uClass){
    Multiplicity mult = new Multiplicity();
	isBounded = mult.setBound("1");
	AssociationEnd endToOutput = new AssociationEnd(null,null,null,null,mult);
	AssociationEnd beginEnd = new AssociationEnd(null,null,null,null,mult);
			
	//Case of reflexive association
	if(assoc.getEnd(1).getClassName().equals(uClass.getName())) 
	{
      endToOutput = assoc.getEnd(0);
      beginEnd = assoc.getEnd(1);
    }
    else 
    {
      endToOutput = assoc.getEnd(1);  
      beginEnd = assoc.getEnd(0); 
    }
    return convertEndsToAssociation(beginEnd,endToOutput);
  }

  // line 382 "../../../../src/AlloySignature.ump"
   private String comment(){
    return 
  	  "\n-- Defines a signature for class "+name+"\n";
  }

  // line 388 "../../../../src/AlloySignature.ump"
   private String addExtension(){
    if(extendsName.equals(""))
      return "";
    return " extends "+ extendsName;
  }

  // line 395 "../../../../src/AlloySignature.ump"
   private String funPart(){
    if(isAbstract && isSingleton)
      return "abstract one sig "+name+addExtension()+" {";
    if(isAbstract)
      return "abstract sig "+name+addExtension()+" {";
    if(isSingleton)
      return "one sig "+name+addExtension()+" {";
      
    return "sig "+name+addExtension()+" {";
  }

  // line 407 "../../../../src/AlloySignature.ump"
   public String printSignature(){
    return comment()+print();
  }

  // line 412 "../../../../src/AlloySignature.ump"
   private String compute(int size){
    if(size == 0) return "";
  	if(size == 1) return function.get(0).printFunction();
  	return compute(size-1)+",\n"+function.get(size-1).printFunction();
  }

  // line 419 "../../../../src/AlloySignature.ump"
   private String print(){
    if(function.size() != 0)
		return funPart()+"\n"+compute(function.size())+"\n}\n";
	return funPart()+compute(function.size())+" }\n";
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "extendsName" + ":" + getExtendsName()+ "," +
            "isBounded" + ":" + getIsBounded()+ "," +
            "isAbstract" + ":" + getIsAbstract()+ "," +
            "isSingleton" + ":" + getIsSingleton()+ "]";
  }
}