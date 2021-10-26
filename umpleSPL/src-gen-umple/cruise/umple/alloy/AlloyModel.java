/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;
import java.util.*;

// line 25 "../../../../src/AlloySignature.ump"
public class AlloyModel extends AlloyObject
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AlloyModel Attributes
  private String name;
  private String modelNamespace;

  //AlloyModel Associations
  private List<Signature> signatures;
  private List<Fact> facts;
  private List<Statement> statements;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AlloyModel(String aName, String aModelNamespace)
  {
    super();
    name = aName;
    modelNamespace = aModelNamespace;
    signatures = new ArrayList<Signature>();
    facts = new ArrayList<Fact>();
    statements = new ArrayList<Statement>();
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

  public boolean setModelNamespace(String aModelNamespace)
  {
    boolean wasSet = false;
    modelNamespace = aModelNamespace;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getModelNamespace()
  {
    return modelNamespace;
  }
  /* Code from template association_GetMany */
  public Signature getSignature(int index)
  {
    Signature aSignature = signatures.get(index);
    return aSignature;
  }

  public List<Signature> getSignatures()
  {
    List<Signature> newSignatures = Collections.unmodifiableList(signatures);
    return newSignatures;
  }

  public int numberOfSignatures()
  {
    int number = signatures.size();
    return number;
  }

  public boolean hasSignatures()
  {
    boolean has = signatures.size() > 0;
    return has;
  }

  public int indexOfSignature(Signature aSignature)
  {
    int index = signatures.indexOf(aSignature);
    return index;
  }
  /* Code from template association_GetMany */
  public Fact getFact(int index)
  {
    Fact aFact = facts.get(index);
    return aFact;
  }

  public List<Fact> getFacts()
  {
    List<Fact> newFacts = Collections.unmodifiableList(facts);
    return newFacts;
  }

  public int numberOfFacts()
  {
    int number = facts.size();
    return number;
  }

  public boolean hasFacts()
  {
    boolean has = facts.size() > 0;
    return has;
  }

  public int indexOfFact(Fact aFact)
  {
    int index = facts.indexOf(aFact);
    return index;
  }
  /* Code from template association_GetMany */
  public Statement getStatement(int index)
  {
    Statement aStatement = statements.get(index);
    return aStatement;
  }

  public List<Statement> getStatements()
  {
    List<Statement> newStatements = Collections.unmodifiableList(statements);
    return newStatements;
  }

  public int numberOfStatements()
  {
    int number = statements.size();
    return number;
  }

  public boolean hasStatements()
  {
    boolean has = statements.size() > 0;
    return has;
  }

  public int indexOfStatement(Statement aStatement)
  {
    int index = statements.indexOf(aStatement);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSignatures()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addSignature(Signature aSignature)
  {
    boolean wasAdded = false;
    if (signatures.contains(aSignature)) { return false; }
    signatures.add(aSignature);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeSignature(Signature aSignature)
  {
    boolean wasRemoved = false;
    if (signatures.contains(aSignature))
    {
      signatures.remove(aSignature);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSignatureAt(Signature aSignature, int index)
  {  
    boolean wasAdded = false;
    if(addSignature(aSignature))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSignatures()) { index = numberOfSignatures() - 1; }
      signatures.remove(aSignature);
      signatures.add(index, aSignature);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSignatureAt(Signature aSignature, int index)
  {
    boolean wasAdded = false;
    if(signatures.contains(aSignature))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSignatures()) { index = numberOfSignatures() - 1; }
      signatures.remove(aSignature);
      signatures.add(index, aSignature);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSignatureAt(aSignature, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFacts()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addFact(Fact aFact)
  {
    boolean wasAdded = false;
    if (facts.contains(aFact)) { return false; }
    facts.add(aFact);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeFact(Fact aFact)
  {
    boolean wasRemoved = false;
    if (facts.contains(aFact))
    {
      facts.remove(aFact);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFactAt(Fact aFact, int index)
  {  
    boolean wasAdded = false;
    if(addFact(aFact))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFacts()) { index = numberOfFacts() - 1; }
      facts.remove(aFact);
      facts.add(index, aFact);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFactAt(Fact aFact, int index)
  {
    boolean wasAdded = false;
    if(facts.contains(aFact))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFacts()) { index = numberOfFacts() - 1; }
      facts.remove(aFact);
      facts.add(index, aFact);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFactAt(aFact, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStatements()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addStatement(Statement aStatement)
  {
    boolean wasAdded = false;
    if (statements.contains(aStatement)) { return false; }
    statements.add(aStatement);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStatement(Statement aStatement)
  {
    boolean wasRemoved = false;
    if (statements.contains(aStatement))
    {
      statements.remove(aStatement);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStatementAt(Statement aStatement, int index)
  {  
    boolean wasAdded = false;
    if(addStatement(aStatement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStatements()) { index = numberOfStatements() - 1; }
      statements.remove(aStatement);
      statements.add(index, aStatement);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStatementAt(Statement aStatement, int index)
  {
    boolean wasAdded = false;
    if(statements.contains(aStatement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStatements()) { index = numberOfStatements() - 1; }
      statements.remove(aStatement);
      statements.add(index, aStatement);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStatementAt(aStatement, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    signatures.clear();
    facts.clear();
    statements.clear();
    super.delete();
  }

  // line 38 "../../../../src/AlloySignature.ump"
   public  AlloyModel(UmpleModel model){
    signatures = new ArrayList<Signature>();
    facts = new ArrayList<Fact>(); 
    statements = new ArrayList<Statement>();
    
    //OpenStatement st = new OpenStatement("ordering","UmpleObject");
    //statements.add(st);
    
    //Signature umpleObject = new Signature("UmpleObject","",false,true,false);
    //signatures.add(umpleObject);
    
    /*if(hasStringAttribute(model))
    {
      Signature tempObject = new Signature("TempObject","",false,true,false);
      UmpleClass uClass = new UmpleClass("TempObject");
      Attribute abute = new Attribute("tempName","","","",false,uClass);
      uClass.addAttribute(abute);
    
      Fact viz = new Fact(uClass);
      facts.add(viz);
      Function tempFun = new Function(abute);
      tempObject.addFunction(tempFun);
      signatures.add(tempObject);
    }*/
    genAssociationFact(model);
    genSignatures(model);
    genOtherConstraints(model);
    
    name = model.getUmpleFile().getFileName(); 
    if(model.getDefaultNamespace() != null)
      if(namespace(model.getDefaultNamespace()) != "")
        modelNamespace = "module "+namespace(model.getDefaultNamespace());
      else  modelNamespace = "module "+model.getDefaultNamespace();  
    else 
      modelNamespace = "";
  }

  // line 76 "../../../../src/AlloySignature.ump"
   private void genAssociationFact(UmpleModel model){
    //String temp = "";
    for(Association assoc : model.getAssociations())
    {
      if(!assoc.getEnd(0).getClassName().equals(assoc.getEnd(1).getClassName()))
      {
      	AssociationFact aFact = new AssociationFact(assoc);
       	facts.add(aFact);
      }
    }
  }

  // line 90 "../../../../src/AlloySignature.ump"
   private boolean hasStringAttribute(UmpleModel model){
    for(UmpleClass uClass : model.getUmpleClasses())
    {
      for(Attribute attr : uClass.getAttributes())
        if(attr.getType().equals("String") || attr.getType().equals(""))
       return true;
    }
    return false;
  }

  // line 101 "../../../../src/AlloySignature.ump"
   private String namespace(String addr){
    int i = 0, size = addr.length();
    String temp = "";
	while(i < size)
	{
	  if(addr.charAt(i) == '.')
	  { 
	    for(int k = 0;k < i;k++)
	      temp += addr.charAt(k); 
	    addr = namespace(temp + "/"+addr.substring(i+1,addr.length())); 
	  } 
	  i++;
	}
	return addr;
  }


  /**
   * For general hierachy pattern
   */
  // line 120 "../../../../src/AlloySignature.ump"
   private Association checkAssocitaionBtw(String n1, String n2, UmpleModel model){
    String endName1, endName2;
    for(Association assoc : model.getAssociations())
    {
      endName1 = assoc.getEnd(0).getClassName();
      endName2 = assoc.getEnd(1).getClassName();
      if(n1.equals(endName1) && n2.equals(endName2))
        
          return assoc;
      if(n1.equals(endName2) && n2.equals(endName1))
        
          return assoc;
    }
    return null;
  }


  /**
   * For general hierarchy pattern
   */
  // line 138 "../../../../src/AlloySignature.ump"
   private Association analyzeClassForH(UmpleModel model, UmpleClass uClass){
    String name1, name2;
  	name1 = uClass.getName();
  	
  	if(uClass.hasExtendsClass())
  	{
  	  Multiplicity mult = new Multiplicity();
	  if(mult.setBound("1") == true) ;
  	  AssociationEnd lEnd = new AssociationEnd(null,null,null,null,mult);
  	  AssociationEnd rEnd = new AssociationEnd(null,null,null,null,mult);
  	  name2 = uClass.getExtendsClass().getName();
  	  if(checkAssocitaionBtw(name1,name2,model) != null)
  	  {
  	    Association assoc = checkAssocitaionBtw(name1,name2,model);
  	    if(assoc.getEnd(0).getClassName().equals(name1))
  	    {
  	      lEnd = assoc.getEnd(0);
  	      rEnd = assoc.getEnd(1);
  	    }
  	    else 
  	    {
  	      lEnd = assoc.getEnd(1);
  	      rEnd = assoc.getEnd(0);
  	    }
  	    return convertEndsToAssociation(lEnd,rEnd);
  	  }
  	}
  	return null;
  }

  // line 169 "../../../../src/AlloySignature.ump"
   private void genSignatures(UmpleModel model){
    for (UmpleClass uClass : model.getUmpleClasses())
    {       
      Signature sig = new Signature(uClass);      
      signatures.add(sig);
      
      genReflexiveRelations(uClass);
    }
  }

  // line 180 "../../../../src/AlloySignature.ump"
   private void genReflexiveRelations(UmpleClass uClass){
    for(Association assoc : uClass.getAssociations())
    {
      //Case of SymmetricReflexive Association
      if(analyzeAssociation(assoc) == 3)
      {              
        NonReflexiveFact nrf = new NonReflexiveFact(assoc);
        facts.add(nrf);
          
        //Symmetric relations
        SymmetricFact sf = new SymmetricFact(assoc);          
        facts.add(sf);
      }
    }
  }

  // line 196 "../../../../src/AlloySignature.ump"
   public List<Statement> getImportStatements(){
    List<Statement> stmt = new ArrayList<Statement>(); 
    for(Statement st : statements )
    {
      if(st.getName().equals("open"))
        stmt.add(st);
    }
    return stmt;
  }

  // line 207 "../../../../src/AlloySignature.ump"
   public String printImportStatements(){
    String temp = "";
    
    for(Statement st : getImportStatements())
      temp+= st.print()+"\n";
      
    return temp;
  }

  // line 217 "../../../../src/AlloySignature.ump"
   private void genOtherConstraints(UmpleModel model){
    for(Association assoc : model.getAssociations())
    { 
    
           
      //Case of Asymmetric association
      if(analyzeAssociation(assoc) == 1)
      {
    	NoExtendedFact nExt = new NoExtendedFact(assoc);
    	NoSelfRelationFact nsr = new NoSelfRelationFact(assoc);    	
    	facts.add(nsr);
    	facts.add(nExt);
      }
        
      //Case of bidirectional association
      if(analyzeAssociation(assoc) == 2)
      {
        if(assoc.isIsLeftNavigable() && assoc.isIsRightNavigable())
        { 
    	  BidirectionFact bidirect = new BidirectionFact(assoc);
    	  facts.add(bidirect);
    	}
      }
      
      AssociationEnd lEnd = assoc.getEnd(0), rEnd = assoc.getEnd(1);
     if(assoc.isIsLeftNavigable())
      if(lEnd.getMultiplicity().isValid())
      {
        NumericBoundFact nbf = new NumericBoundFact(assoc,0);
        facts.add(nbf);
      }
     if(assoc.isIsRightNavigable())
      if(rEnd.getMultiplicity().isValid())
      {
        NumericBoundFact nbf = new NumericBoundFact(assoc,1);
        facts.add(nbf);
      }
    }
    
    for(UmpleClass uClass : model.getUmpleClasses())
    {
      if(analyzeClassForH(model,uClass) != null)
      {
        GenHierarchyFact ghf = new GenHierarchyFact(analyzeClassForH(model,uClass));
        facts.add(ghf);
      }
    }
  }

  // line 267 "../../../../src/AlloySignature.ump"
   private Integer analyzeAssociation(Association assoc){
    String rEndName = assoc.getEnd(1).getClassName(),
  		lEndName = assoc.getEnd(0).getClassName();
  	  if(lEndName.equals(rEndName))
  	  {
  	    if(compareRoleNames(assoc) == true)
  	      return 3;
  	    return 1;
  	  }
  	  return 2;
  }

  // line 280 "../../../../src/AlloySignature.ump"
   private boolean compareRoleNames(Association assoc){
    if(assoc.getEnd(0).getDisplayRoleName().equals("")) return true;
    return false;
  }

  // line 285 "../../../../src/AlloySignature.ump"
   public String comment(){
    return addStartDottedLine()+
  		"-- This Alloy file is generated using Umple from "+name+addStartDottedLine();
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "modelNamespace" + ":" + getModelNamespace()+ "]";
  }
}