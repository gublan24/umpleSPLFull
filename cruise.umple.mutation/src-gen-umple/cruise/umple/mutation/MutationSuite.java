/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.mutation;
import cruise.umple.compiler.*;
import java.util.*;
import java.util.regex.*;
import cruise.umple.parser.*;
import cruise.umple.parser.analysis.RuleBasedParser;
import java.io.*;

/**
 * ////class UmpleClass{}
 * // Mutation model
 */
// line 4 "../../../../src/MutationMetamodel.ump"
// line 3 "../../../../src/MutationSuite_code.ump"
public class MutationSuite
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MutationSuite Attributes
  private UmpleModel originalModel;
  private int score;
  private String uFileName;
  private int unprocessedFiles;
  private String path;
  private int fileToMutate;
  private int numberofMutants;
  private String mutationPath;
  private List<String> muFiles;
  private boolean hasMultipleFiles;
  private ArrayList<String> randomReplacements_association;
  private ArrayList<String> randomReplacements_typedAttribute;
  private ArrayList<String> randomReplacements_Elements;
  private HashMap<String,String> filesToWrite;

  //MutationSuite Associations
  private List<Replacement> replacements;
  private List<Mutant> mutants;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MutationSuite(UmpleModel aOriginalModel, int aScore, String aUFileName, String aPath, int aNumberofMutants)
  {
    originalModel = aOriginalModel;
    score = aScore;
    uFileName = aUFileName;
    unprocessedFiles = 0;
    path = aPath;
    fileToMutate = 0;
    numberofMutants = aNumberofMutants;
    mutationPath = "";
    muFiles = new ArrayList<String>();
    hasMultipleFiles = false;
    randomReplacements_association = new ArrayList<String>(Arrays.asList("OneToMany","OptionalOneToMany","ManyToMany"));
    randomReplacements_typedAttribute = new ArrayList<String>(Arrays.asList("String","Integer","Float","Double"));
    randomReplacements_Elements = new ArrayList<String>(Arrays.asList("attribute","association"));
    filesToWrite = new HashMap<String, String>();
    replacements = new ArrayList<Replacement>();
    mutants = new ArrayList<Mutant>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOriginalModel(UmpleModel aOriginalModel)
  {
    boolean wasSet = false;
    originalModel = aOriginalModel;
    wasSet = true;
    return wasSet;
  }

  public boolean setScore(int aScore)
  {
    boolean wasSet = false;
    score = aScore;
    wasSet = true;
    return wasSet;
  }

  public boolean setUFileName(String aUFileName)
  {
    boolean wasSet = false;
    uFileName = aUFileName;
    wasSet = true;
    return wasSet;
  }

  public boolean setUnprocessedFiles(int aUnprocessedFiles)
  {
    boolean wasSet = false;
    unprocessedFiles = aUnprocessedFiles;
    wasSet = true;
    return wasSet;
  }

  public boolean setPath(String aPath)
  {
    boolean wasSet = false;
    path = aPath;
    wasSet = true;
    return wasSet;
  }

  public boolean setFileToMutate(int aFileToMutate)
  {
    boolean wasSet = false;
    fileToMutate = aFileToMutate;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumberofMutants(int aNumberofMutants)
  {
    boolean wasSet = false;
    numberofMutants = aNumberofMutants;
    wasSet = true;
    return wasSet;
  }

  public boolean setMutationPath(String aMutationPath)
  {
    boolean wasSet = false;
    mutationPath = aMutationPath;
    wasSet = true;
    return wasSet;
  }

  public boolean setMuFiles(List<String> aMuFiles)
  {
    boolean wasSet = false;
    muFiles = aMuFiles;
    wasSet = true;
    return wasSet;
  }

  public boolean setHasMultipleFiles(boolean aHasMultipleFiles)
  {
    boolean wasSet = false;
    hasMultipleFiles = aHasMultipleFiles;
    wasSet = true;
    return wasSet;
  }

  public boolean setRandomReplacements_association(ArrayList<String> aRandomReplacements_association)
  {
    boolean wasSet = false;
    randomReplacements_association = aRandomReplacements_association;
    wasSet = true;
    return wasSet;
  }

  public boolean setRandomReplacements_typedAttribute(ArrayList<String> aRandomReplacements_typedAttribute)
  {
    boolean wasSet = false;
    randomReplacements_typedAttribute = aRandomReplacements_typedAttribute;
    wasSet = true;
    return wasSet;
  }

  public boolean setRandomReplacements_Elements(ArrayList<String> aRandomReplacements_Elements)
  {
    boolean wasSet = false;
    randomReplacements_Elements = aRandomReplacements_Elements;
    wasSet = true;
    return wasSet;
  }

  public boolean setFilesToWrite(HashMap<String,String> aFilesToWrite)
  {
    boolean wasSet = false;
    filesToWrite = aFilesToWrite;
    wasSet = true;
    return wasSet;
  }

  /**
   * attriute
   */
  public UmpleModel getOriginalModel()
  {
    return originalModel;
  }

  public int getScore()
  {
    return score;
  }

  public String getUFileName()
  {
    return uFileName;
  }

  public int getUnprocessedFiles()
  {
    return unprocessedFiles;
  }

  public String getPath()
  {
    return path;
  }

  public int getFileToMutate()
  {
    return fileToMutate;
  }

  public int getNumberofMutants()
  {
    return numberofMutants;
  }

  public String getMutationPath()
  {
    return mutationPath;
  }

  public List<String> getMuFiles()
  {
    return muFiles;
  }

  public boolean getHasMultipleFiles()
  {
    return hasMultipleFiles;
  }

  public ArrayList<String> getRandomReplacements_association()
  {
    return randomReplacements_association;
  }

  public ArrayList<String> getRandomReplacements_typedAttribute()
  {
    return randomReplacements_typedAttribute;
  }

  public ArrayList<String> getRandomReplacements_Elements()
  {
    return randomReplacements_Elements;
  }

  public HashMap<String,String> getFilesToWrite()
  {
    return filesToWrite;
  }
  /* Code from template association_GetMany */
  public Replacement getReplacement(int index)
  {
    Replacement aReplacement = replacements.get(index);
    return aReplacement;
  }

  /**
   * private ArrayList<String> replacementsCode = new ArrayList<String>(Arrays.asList("1..*","0..1--*","1--2..4")) ;
   */
  public List<Replacement> getReplacements()
  {
    List<Replacement> newReplacements = Collections.unmodifiableList(replacements);
    return newReplacements;
  }

  public int numberOfReplacements()
  {
    int number = replacements.size();
    return number;
  }

  public boolean hasReplacements()
  {
    boolean has = replacements.size() > 0;
    return has;
  }

  public int indexOfReplacement(Replacement aReplacement)
  {
    int index = replacements.indexOf(aReplacement);
    return index;
  }
  /* Code from template association_GetMany */
  public Mutant getMutant(int index)
  {
    Mutant aMutant = mutants.get(index);
    return aMutant;
  }

  public List<Mutant> getMutants()
  {
    List<Mutant> newMutants = Collections.unmodifiableList(mutants);
    return newMutants;
  }

  public int numberOfMutants()
  {
    int number = mutants.size();
    return number;
  }

  public boolean hasMutants()
  {
    boolean has = mutants.size() > 0;
    return has;
  }

  public int indexOfMutant(Mutant aMutant)
  {
    int index = mutants.indexOf(aMutant);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfReplacements()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addReplacement(Replacement aReplacement)
  {
    boolean wasAdded = false;
    if (replacements.contains(aReplacement)) { return false; }
    MutationSuite existingMutationSuite = aReplacement.getMutationSuite();
    if (existingMutationSuite == null)
    {
      aReplacement.setMutationSuite(this);
    }
    else if (!this.equals(existingMutationSuite))
    {
      existingMutationSuite.removeReplacement(aReplacement);
      addReplacement(aReplacement);
    }
    else
    {
      replacements.add(aReplacement);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeReplacement(Replacement aReplacement)
  {
    boolean wasRemoved = false;
    if (replacements.contains(aReplacement))
    {
      replacements.remove(aReplacement);
      aReplacement.setMutationSuite(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addReplacementAt(Replacement aReplacement, int index)
  {  
    boolean wasAdded = false;
    if(addReplacement(aReplacement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfReplacements()) { index = numberOfReplacements() - 1; }
      replacements.remove(aReplacement);
      replacements.add(index, aReplacement);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveReplacementAt(Replacement aReplacement, int index)
  {
    boolean wasAdded = false;
    if(replacements.contains(aReplacement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfReplacements()) { index = numberOfReplacements() - 1; }
      replacements.remove(aReplacement);
      replacements.add(index, aReplacement);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addReplacementAt(aReplacement, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMutants()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Mutant addMutant(UmpleModel aMuModel, String aType)
  {
    return new Mutant(aMuModel, aType, this);
  }

  public boolean addMutant(Mutant aMutant)
  {
    boolean wasAdded = false;
    if (mutants.contains(aMutant)) { return false; }
    MutationSuite existingMutationSuite = aMutant.getMutationSuite();
    boolean isNewMutationSuite = existingMutationSuite != null && !this.equals(existingMutationSuite);
    if (isNewMutationSuite)
    {
      aMutant.setMutationSuite(this);
    }
    else
    {
      mutants.add(aMutant);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMutant(Mutant aMutant)
  {
    boolean wasRemoved = false;
    //Unable to remove aMutant, as it must always have a mutationSuite
    if (!this.equals(aMutant.getMutationSuite()))
    {
      mutants.remove(aMutant);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMutantAt(Mutant aMutant, int index)
  {  
    boolean wasAdded = false;
    if(addMutant(aMutant))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMutants()) { index = numberOfMutants() - 1; }
      mutants.remove(aMutant);
      mutants.add(index, aMutant);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMutantAt(Mutant aMutant, int index)
  {
    boolean wasAdded = false;
    if(mutants.contains(aMutant))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMutants()) { index = numberOfMutants() - 1; }
      mutants.remove(aMutant);
      mutants.add(index, aMutant);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMutantAt(aMutant, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !replacements.isEmpty() )
    {
      replacements.get(0).setMutationSuite(null);
    }
    for(int i=mutants.size(); i > 0; i--)
    {
      Mutant aMutant = mutants.get(i - 1);
      aMutant.delete();
    }
  }

  // line 15 "../../../../src/MutationSuite_code.ump"
   public Boolean mutate(Mutant mu, String modelCode, String muType, String muOperator, String replacementType, String lang){
    if (muType .equals( "random"))
	   {		   
		   if (muOperator .equals( "OneToMany"))
		   {
			   mutateAssociationOneToMany(mu, modelCode, replacementType,lang);
			   return true;
		   }
		   
		   if (muOperator .equals( "OneToOptionalOne"))
		   {
			   mutateAssociationOneToOptionalOne(mu, modelCode, replacementType,lang);
			   return true;
		   }
		   
		   if (muOperator .equals( "OptionalOneToMany"))
		   {
			   mutateAssociationOptionalOneToMany(mu, modelCode,replacementType, lang);
			   return true;
		   }
		   
		   if (muOperator .equals( "OneToNN"))
		   {
			   mutateAssociationOneToNN(mu, modelCode,replacementType, lang);
			   return true;
		   }
		   
		   if (muOperator .equals( "direction"))
		   {
			   mutateAssociationDirectionality(mu, modelCode,replacementType, lang);
			   return true;
		   }
		   
		   if (muOperator .equals( "ConstraintBiggerEq"))
		   {
			   mutateConstraintsBiggerEq(mu, modelCode,replacementType, lang);
			   return true;
		   }
		   
		   if (muOperator .equals( "ConstraintBigger"))
		   {
			   mutateConstraintsBigger(mu, modelCode,replacementType, lang);
			   return true;
		   }
		   
		   if (muOperator .equals( "Integer"))
		   {
			   
			   mutateAttributeTypedInteger(mu, modelCode,replacementType, lang);
			   return true;
		   }
		   
		   if (muOperator .equals( "Float"))
		   {
			   
			   mutateAttributeTypedFloat(mu, modelCode,replacementType, lang);
			   return true;
		   }
		   if (muOperator .equals( "Double"))
		   {
			   
			   mutateAttributeTypedDouble(mu, modelCode,replacementType, lang);
			   return true;
		   }
		   
		   if (muOperator .equals( "String"))
		   {
			   
			   mutateAttributeTypedString(mu, modelCode,replacementType, lang);
			   return true;
		   }
	   }
	   
	   if (muOperator.equals( "full"))
	   {
		   mutateAssociationOneToMany(mu, modelCode,replacementType,lang);
		   mutateAssociationOptionalOneToMany(mu, modelCode,replacementType, lang);
		   mutateAssociationOneToNN(mu, modelCode,replacementType, lang);
		   mutateAssociationDirectionality(mu, modelCode,replacementType, lang);
		   mutateAttributeTypedString(mu, modelCode,replacementType, lang);
		   mutateAttributeTypedInteger(mu, modelCode,replacementType, lang);
		   mutateAttributeTypedFloat(mu, modelCode,replacementType, lang);
		   mutateAttributeTypedDouble(mu, modelCode,replacementType, lang);
		   mutateAssociationOneToOptionalOne(mu, modelCode, replacementType,lang);
		   mutateConstraintsBiggerEq(mu, modelCode,replacementType, lang);
		   mutateConstraintsBigger(mu, modelCode,replacementType, lang);
		   return true;
	   }
	   
	   if (muOperator .equals( "direction"))
	   {
		   mutateAssociationDirectionality(mu, modelCode,replacementType, lang);
		   return true;
	   }
	   
	   if (muOperator .equals( "Association"))
	   {
		   mutateAssociationOneToMany(mu, modelCode,replacementType,lang);
		   mutateAssociationOptionalOneToMany(mu, modelCode,replacementType, lang);
		   mutateAssociationOneToNN(mu, modelCode,replacementType, lang);
		   mutateAssociationDirectionality(mu, modelCode,replacementType, lang);
		   return true;
		   
	   }
	   
	   if (muOperator .equals( "Attribute"))
	   {
		   mutateAttributeTypedString(mu, modelCode,replacementType, lang);
		   mutateAttributeTypedInteger(mu, modelCode,replacementType, lang);
		   mutateAttributeTypedFloat(mu, modelCode,replacementType, lang);
		   mutateAttributeTypedDouble(mu, modelCode,replacementType, lang);
		   return true;
	   }
	   
	   if (muOperator .equals( "AttributeInt"))
	   {
		   
		   mutateAttributeTypedInteger(mu, modelCode,replacementType, lang);
		   
		   return true;
	   }
	   
	   if (muOperator .equals( "AttributeString"))
	   {
		   
		   mutateAttributeTypedString(mu, modelCode,replacementType, lang);
		   
		   return true;
	   }
	   
	   if (muOperator .equals( "AttributeFloat"))
	   {
		   
		   mutateAttributeTypedFloat(mu, modelCode,replacementType, lang);
		   
		   return true;
	   }
	   
	   if (muOperator .equals( "AttributeDouble"))
	   {
		   
		   mutateAttributeTypedDouble(mu, modelCode,replacementType, lang);
		   
		   return true;
	   }
	   
	   
	   if (muOperator .equals( "OneToMany"))
	   {
		   mutateAssociationOneToMany(mu, modelCode,replacementType,lang);
		   return true;
	   }
	   if (muOperator .equals( "OptionalOneToMany"))
	   {
		   mutateAssociationOptionalOneToMany(mu, modelCode,replacementType, lang);
		   return true;
	   }
	   
	   if (muOperator .equals( "OneToNN"))
	   {
		   mutateAssociationOneToNN(mu, modelCode,replacementType,lang);
		   return true;
	   }
	   
	   
	   if (muOperator .equals( "ConstraintBiggerEq"))
	   {
		   mutateConstraintsBiggerEq(mu, modelCode,replacementType,lang);
		   return true;
	   }
	   
	   if (muOperator .equals( "ConstraintBigger"))
	   {
		   mutateConstraintsBiggerEq(mu, modelCode,replacementType,lang);
		   return true;
	   }
	   
	   
	   
	   
 return false;
  }

  // line 199 "../../../../src/MutationSuite_code.ump"
   public Boolean generateMuCode(Mutant mu){
    return null;
  }

  // line 204 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateAssociationOneToMany(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
	   String modelFileName="";
	   File modelFile;
	   UmpleModel mutatedModel = new UmpleModel(null); 
	   
		  //String regex = "[^0..]1\\s*\\w*\\s*--\\s*\\*\\s+\\w(\\s+\\w*)?";
	   String regex = "[^0..]1\\s*\\w*\\s*--\\s*\\*\\s+\\w(\\s+\\w*)?";
		  String replacement = " 0..1 ";
		  
		  if (replacementType .equals( "random"))
		  {
			  Collections.shuffle(randomReplacements_association);
			  replacementType = randomReplacements_association.get(0);
		  }
		  
		  if (replacementType .equals( "OptionalOneToMany"))
		  {
			  replacement = " 0..1 ";
		  }
		  
		  if (replacementType .equals( "ManyToMany"))
		  {
			  replacement = " * ";
		  }
		  
		  if (replacementType .equals( "OneToOne"))
		  {
			  replacement = " 1 ";
		  }
		  		  		  		  		  
		  muModelCode = modifyModelCode(modelCode, regex, replacement, "OneToMany");
		  //System.out.println(matcher.group());
		  //System.out.println("Mutated Code  ");
		  //System.out.println(muModelCode);
		  //muModelCode= "namespace OptionalOneToMany;\n"+muModelCode;
		  //System.out.println("Mutated Code  ");
		  //System.out.println(muModelCode);
		  
		  modelFileName =this.addMutatedFile(path, uFileName, "OneToMany", muModelCode);
		  modelFile = new File (modelFileName);
		  UmpleFile umpleFile = new UmpleFile (modelFile);
		  //System.out.println("ModelFILENAME  ");
		  //System.out.println(modelFileName);
		  this.addMutant(new Mutant(new UmpleModel(umpleFile),"OneToMany", this));
		  /*try {
			int x;
			// this.//createUmpleMutationSystem(path, "OneToManyMutation_"+ uFileName, lang,"OneToMany");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		  
		  
		  
	  //mutatedModel.setCode(muModelCode);  
	  //Mutant aMutant = new Mutant(mutatedModel, "OptionalOneToMany", this);
	  //this.addMutant(aMutant);
	   
	   return null;
  }

  // line 267 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateAssociationOneToOptionalOne(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
	   String modelFileName="";
	   File modelFile;
	   UmpleModel mutatedModel = new UmpleModel(null); 
	   
		  //String regex = "[^0..]1\\s*\\w*\\s*--\\s*\\*\\s+\\w(\\s+\\w*)?";
	   String regex = "[^0..]1\\s*\\w*\\s*--\\s*0..1\\s+\\w(\\s+\\w*)?";
		  String replacement = " 1 -- 0..1 ";
		  
		  if (replacementType .equals( "random"))
		  {
			  Collections.shuffle(randomReplacements_association);
			  replacementType = randomReplacements_association.get(0);
		  }
		  
		  if (replacementType .equals( "OptionalOneToMany"))
		  {
			  replacement = " 0..1 -- * ";
		  }
		  
		  if (replacementType .equals( "ManyToMany"))
		  {
			  replacement = " * -- * ";
		  }
		  
		  if (replacementType .equals( "OneToOne"))
		  {
			  replacement = " 1 -- 1 ";
		  }
		  if (replacementType .equals( "OneToMany"))
		  {
			  replacement = " 1 -- * ";
		  }
		  
		  
		  		  		  		  		  
		  muModelCode = modifyModelCode(modelCode, regex, replacement, "OneToOptionalOne");
		  //System.out.println(matcher.group());
		  //System.out.println("Mutated Code  ");
		  //System.out.println(muModelCode);
		  //muModelCode= "namespace OptionalOneToMany;\n"+muModelCode;
		  //System.out.println("Mutated Code  ");
		  //System.out.println(muModelCode);
		  
		  modelFileName =this.addMutatedFile(path, uFileName, "OneToOptionalOne", muModelCode);
		  modelFile = new File (modelFileName);
		  UmpleFile umpleFile = new UmpleFile (modelFile);
		  //System.out.println("ModelFILENAME  ");
		  //System.out.println(modelFileName);
		  this.addMutant(new Mutant(new UmpleModel(umpleFile),"OneToOptionalOne", this));
		  /*try {
			
			// this.//createUmpleMutationSystem(path, "OneToOptionalOneMutation_"+ uFileName, lang,"OneToOptionalOne");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		  
		  
		  
	  //mutatedModel.setCode(muModelCode);  
	  //Mutant aMutant = new Mutant(mutatedModel, "OptionalOneToMany", this);
	  //this.addMutant(aMutant);
	   
	   return null;
  }

  // line 336 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateAssociationOptionalOneToMany(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
	   String modelFileName="";
	   File modelFile;
	   UmpleModel mutatedModel = new UmpleModel(null); 

	   String regex = "\\s0..1\\s*\\w*\\s*--\\s*\\*\\s+\\w(\\s+\\w*)?";
	   String replacement = " 0..1 -- * ";
		  
		  if (replacementType .equals( "random"))
		  {
			  Collections.shuffle(randomReplacements_association);
			  replacementType = randomReplacements_association.get(0);
		  }
		  
		  if (replacementType .equals( "OneToMany"))
		  {
			  replacement = " 1 -- * ";
		  }
		  
		  if (replacementType .equals( "ManyToMany"))
		  {
			  replacement = " * -- * ";
		  }
		  
		  if (replacementType .equals( "OneToOne"))
		  {
			  replacement = " 1 -- 1 ";
		  }
		  
		  if (replacementType .equals( "ManyToMany"))
		  {
			  replacement = " * -- * ";
		  }
		  
		  if (replacementType .equals( "OneToOne"))
		  {
			  replacement = " 1 -- 1 ";
		  }
		  
		  
		  muModelCode = modifyModelCode(modelCode, regex, replacement,"OptionalOneToMany");
		  //System.out.println(matcher.group());
		  //System.out.println("Mutated Code  ");
		  //System.out.println(muModelCode);
		  //muModelCode= "namespace OptionalOneToMany;\n"+muModelCode;
		  
		  modelFileName =this.addMutatedFile(path, uFileName, "OptionalOneToMany", muModelCode);
		  modelFile = new File (modelFileName);
		  //UmpleFile umpleFile = new UmpleFile (modelFile);
		  UmpleModel muModel = new UmpleModel(null);
		  //System.out.println("ModelFILENAME  ");
		  //System.out.println(modelFileName);
		  
		  /*try {
			
			 muModel = this.//createUmpleMutationSystem(path, "OptionalOneToManyMutation_"+ uFileName, lang,"OptionalOneToMany");
			 this.addMutant(new Mutant(muModel,"OptionalOneToMany", this));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		  
		  
		  
	  //mutatedModel.setCode(muModelCode);  
	  //Mutant aMutant = new Mutant(mutatedModel, "OptionalOneToMany", this);
	  //this.addMutant(aMutant);
	   
	   return null;
  }

  // line 409 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateAssociationDirectionality(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
	   StringBuffer muCode = new StringBuffer(modelCode);
	   String modelFileName="";
	   File modelFile;
	   UmpleModel mutatedModel = new UmpleModel(null); 
	   Random ran = new Random();
	   
	   
			
	   	  
	   
	   String regex = "\\s?--\\s?";
	   String replacement = " -> ";
		  
		  
		  //muModelCode = modelCode.replaceAll(regex, replacement);
		  /*
		  Pattern pattern = Pattern.compile(regex);
		  Matcher matcher = pattern.matcher(modelCode);
		  
		  //matcher.find();
		  //muModelCode= modelCode.replace(matcher.group(), matcher.group().replace("0..1",replacement));
		   
		  muModelCode = modelCode;
		  int numberOfOccurences = 0;
		  while(matcher.find()) {
			  numberOfOccurences++;
		  }		
		  
		  matcher.reset();	
		  
		  	   
		  int random = ran.nextInt(numberOfOccurences);
		   
		  System.out.println("Number of Occurences: "+numberOfOccurences);
		  System.out.println("random: "+ (random+1));
		  
		  matcher.reset();		  
		  //matcher
		  int x=0;
		  
		  
		  //System.out.println(matcher.groupCount());
		  while(matcher.find())		  
		  //for ( x = 0;x>numberOfOccurences;x++)
		  {
			  			  
		      if(x == random){
			  System.out.println(matcher.group().toString());			  
			  muCode = muCode.replace(matcher.start(), matcher.end(), replacement);
			  System.out.println(muModelCode.indexOf(matcher.group()))	;
			  
			  System.out.println("indexes: ");
		      System.out.println(matcher.start());
		      System.out.println(matcher.end());
		      
		      }		      
		      x++;		                  
		  }
		  */
	   
	      
		  //System.out.println(muCode.toString());
		  //muModelCode = muCode.toString();
		  muModelCode = modifyModelCode(modelCode, regex, replacement,"AssociationDirectionality");
		  
		  //System.out.println(matcher.group());
		  //System.out.println("Mutated Code  ");
		  //System.out.println(muModelCode);
		  //muModelCode= "namespace OptionalOneToMany;\n"+muModelCode;
		  modelFileName =this.addMutatedFile(path, uFileName,  "AssociationDirectionality", muModelCode);
		  modelFile = new File (modelFileName);
		  UmpleFile umpleFile = new UmpleFile (modelFile);
		  //System.out.println("ModelFILENAME  ");
		  //System.out.println(modelFileName);
		  this.addMutant(new Mutant(new UmpleModel(umpleFile),"AssociationDirectionality", this));
		 /* try {
			
			 this.//createUmpleMutationSystem(path, "AssociationDirectionalityMutation_"+uFileName, lang,"AssociationDirectionality");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		  
		  
	  //mutatedModel.setCode(muModelCode);  
	  //Mutant aMutant = new Mutant(mutatedModel, "OptionalOneToMany", this);
	  //this.addMutant(aMutant);
	   
	   return null;
  }

  // line 504 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateAssociationOneToN(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode="";
	  String regex = "1\\s*\\w*\\s*--\\s*\\d\\s+\\w\\s+\\w*";
	  String replacement = "";
	  UmpleModel mutatedModel = originalModel;
	  mutatedModel.getCode().replaceAll(regex, replacement);
	  //Mutant aMutant = new Mutant(mutatedModel, "OnetoN", this,"");
	  //this.addMutant(aMutant);
return null;
  }

  // line 516 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateAssociationOneToNN(Mutant mu, String modelCode, String replacementType, String lang){
    String regex = "[2-9]..[2-9]";
	   Pattern pattern = Pattern.compile(regex);
	   Matcher matcher = pattern.matcher(modelCode);
		  String muModelCode = "";
		  
		  String replacement = "REPCODE_OneToNN_1";
		  String replacement2 = "REPCODE_OneToNN_2";
		  String replacement3 = "REPCODE_OneToNN_3";
		  String replacement4 = "REPCODE_OneToNN_4";
		  
		  
		  muModelCode = modelCode.replaceAll(regex, replacement);
		  		 
		  matcher.find();
		  int upperBound = Integer.parseInt(matcher.group().substring(matcher.group().length()-1,matcher.group().length()));
		  int lowerBound = Integer.parseInt(matcher.group().substring(0,1));
		  String codeFragement = matcher.group().substring(1, matcher.group().length());
		//Mutation above Lower Bound
		  
		  //System.out.println(codeFragement);
		  //System.out.println(lowerBound);
		  String replacementFragmentCode = lowerBound+1 +codeFragement;
		  //System.out.println(replacementFragmentCode);
		  muModelCode = modelCode.replaceAll(regex, replacementFragmentCode);
		  this.addMutatedFile(path, uFileName,  "OneToNN_aboveLowerBound", muModelCode);
		  
		//Mutation below Lower Bound
		  //matcher.find();
		  lowerBound = Integer.parseInt(matcher.group().substring(0,1));
		  //System.out.println(codeFragement);
		  //System.out.println(lowerBound);
		  replacementFragmentCode = lowerBound-1 +codeFragement;
		  //System.out.println(replacementFragmentCode);
		  muModelCode = modelCode.replaceAll(regex, replacementFragmentCode);
		  this.addMutatedFile(path, uFileName,  "OneToNN_belowLowerBound", muModelCode);
		  
		//Mutation below Lower Bound
		  //matcher.find();		  
		  codeFragement = matcher.group().substring(0, matcher.group().length()-1);;
		  //System.out.println(codeFragement);
		  //System.out.println(lowerBound);
		  replacementFragmentCode = codeFragement +( upperBound-1);
		  //System.out.println(replacementFragmentCode);
		  muModelCode = modelCode.replaceAll(regex, replacementFragmentCode);
		  this.addMutatedFile(path, uFileName,  "OneToNN_belowUpperBound", muModelCode);
		  
		//Mutation above Lower Bound
		  //matcher.find();		  
		  codeFragement = matcher.group().substring(0, matcher.group().length()-1);;
		  //System.out.println(codeFragement);
		  //System.out.println(lowerBound);
		  replacementFragmentCode = codeFragement + (upperBound+1);
		  //System.out.println(replacementFragmentCode);
		  muModelCode = modelCode.replaceAll(regex, replacementFragmentCode);
		  this.addMutatedFile(path, uFileName,  "OneToNN_aboveUpperBound", muModelCode);
		  
		  
		  
	  return null;
  }

  // line 579 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateAttributeTypedString(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
	   String modelFileName="";
	   File modelFile;
	   UmpleModel mutatedModel = new UmpleModel(null); 

	   String regex = "String\\s*";
		  String replacement = "";
		  
		  if (replacementType == "random")
		  {
			  Collections.shuffle(randomReplacements_typedAttribute);
			  replacementType = randomReplacements_typedAttribute.get(0);
		  }
		  
		  if (replacementType == "Integer")
		  {
			  replacement = "Integer";
		  }
		  
		  if (replacementType == "Float")
		  {
			  replacement = "Float";
		  }
		  
		  if (replacementType == "Double")
		  {
			  replacement = "Double";
		  }
		  
		  if (replacementType == "String")
		  {
			  replacement = "String";
		  }
		  
		  
		  
		  
		  
		  //muModelCode = modelCode.replaceAll(regex, replacement);
		  
		  muModelCode = modifyModelCode(modelCode, regex, replacement, "String");
		  //System.out.println(matcher.group());
		  //System.out.println("Mutated Code  ");
		  //System.out.println(muModelCode);
		  //muModelCode= "namespace OptionalOneToMany;\n"+muModelCode;
		  //System.out.println(muModelCode);
		  modelFileName =this.addMutatedFile(path, uFileName,  "String", muModelCode);
		  modelFile = new File (modelFileName);
		  UmpleFile umpleFile = new UmpleFile (modelFile);
		  //System.out.println("ModelFILENAME  ");
		  //System.out.println(modelFileName);
		  this.addMutant(new Mutant(new UmpleModel(umpleFile),"String", this));
		 /* try {
			 
			 this.//createUmpleMutationSystem(path, "StringMutation_"+ uFileName, lang,"String");
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		  return null;
  }

  // line 644 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateAttributeTypedInteger(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
	   String modelFileName="";
	   File modelFile;
	   UmpleModel mutatedModel = new UmpleModel(null); 
			
	   	  
	   
	   String regex = "Integer\\s";
		  String replacement = "Integer";
		  
		  if (replacementType == "random")
		  {
			  Collections.shuffle(randomReplacements_typedAttribute);
			  replacementType = randomReplacements_typedAttribute.get(0);
		  }
		  
		  if (replacementType == "Integer" || replacementType == "int")
		  {
			  replacement = "Integer";
		  }
		  
		  if (replacementType == "Float")
		  {
			  replacement = "Float";
		  }
		  
		  if (replacementType == "Double")
		  {
			  replacement = "Double";
		  }
		  
		  if (replacementType == "String")
		  {
			  replacement = "String";
		  }
		  
		  
		  
		  
		  
		  //muModelCode = modelCode.replaceAll(regex, replacement);
		  
		  muModelCode = modifyModelCode(modelCode, regex, replacement, "Integer");
		  //System.out.println(matcher.group());
		  //System.out.println("Mutated Code  ");
		  //System.out.println(muModelCode);
		  //muModelCode= "namespace OptionalOneToMany;\n"+muModelCode;
		  
		  //System.out.println(muModelCode);
		  modelFileName =this.addMutatedFile(path, uFileName, "Integer", muModelCode);
		  modelFile = new File (modelFileName);
		  UmpleFile umpleFile = new UmpleFile (modelFile);
		  //System.out.println("ModelFILENAME  ");
		  //System.out.println(modelFileName);
		  this.addMutant(new Mutant(new UmpleModel(umpleFile),"Integer", this));
		  /*try {
			
			 this.//createUmpleMutationSystem(path,"IntegerMutation_"+ uFileName, lang,"Integer");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		  return null;
  }

  // line 711 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateAttributeTypedFloat(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
	   String modelFileName="";
	   File modelFile;
	   UmpleModel mutatedModel = new UmpleModel(null); 
			
	   	  
	   
	    String regex = "Float\\s";
		  String replacement = "";
		  
		  if (replacementType == "random")
		  {
			  Collections.shuffle(randomReplacements_typedAttribute);
			  replacementType = randomReplacements_typedAttribute.get(0);
		  }
		  
		  if (replacementType == "Integer")
		  {
			  replacement = "Integer";
		  }
		  
		  if (replacementType == "Float")
		  {
			  replacement = "Float";
		  }
		  
		  if (replacementType == "Double")
		  {
			  replacement = "Double";
		  }
		  
		  if (replacementType == "String")
		  {
			  replacement = "String";
		  }
		  
		  
		  
		  
		  
		  //muModelCode = modelCode.replaceAll(regex, replacement);
		  
		  Pattern pattern = Pattern.compile(regex);
		  Matcher matcher = pattern.matcher(modelCode);
		  
		  
		  //matcher.find();
		  //muModelCode= modelCode.replace(matcher.group(), matcher.group().replace("0..1",replacement));
		   
		  muModelCode = modelCode;
		  while(matcher.find())		  		  		  
		  { 
			  //System.out.println(matcher.group().toString());			  
			  muModelCode= muModelCode.replace(matcher.group(), matcher.group().replace("Float",replacement));
		  
		  }
		  //System.out.println(matcher.group());
		  //System.out.println("Mutated Code  ");
		  //System.out.println(muModelCode);
		  //muModelCode= "namespace OptionalOneToMany;\n"+muModelCode;
		  
		  //System.out.println(muModelCode);
		  modelFileName =this.addMutatedFile(path, uFileName,  "Float", muModelCode);
		  modelFile = new File (modelFileName);
		  UmpleFile umpleFile = new UmpleFile (modelFile);
		  //System.out.println("ModelFILENAME  ");
		  //System.out.println(modelFileName);
		  this.addMutant(new Mutant(new UmpleModel(umpleFile),"Float", this));
		  /*try {
			
			 this.//createUmpleMutationSystem(path, "FloatMutation_"+ uFileName, lang,"Float");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		  return null;
  }

  // line 791 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateAttributeTypedDouble(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
	   String modelFileName="";
	   File modelFile;
	   UmpleModel mutatedModel = new UmpleModel(null); 
			
	   	  
	   
	   String regex = "\\s*Double\\s*";
		  String replacement = "";
		  
		  if (replacementType == "random")
		  {
			  Collections.shuffle(randomReplacements_typedAttribute);
			  replacementType = randomReplacements_typedAttribute.get(0);
		  }
		  
		  if (replacementType == "Integer")
		  {
			  replacement = "Integer";
		  }
		  
		  if (replacementType == "Float")
		  {
			  replacement = "Float";
		  }
		  
		  if (replacementType == "Double")
		  {
			  replacement = "Double";
		  }
		  
		  if (replacementType == "String")
		  {
			  replacement = "String";
		  }
		  
		  
		  
		  
		  
		  //muModelCode = modelCode.replaceAll(regex, replacement);
		  
		  Pattern pattern = Pattern.compile(regex);
		  Matcher matcher = pattern.matcher(modelCode);
		  
		  
		  //matcher.find();
		  //muModelCode= modelCode.replace(matcher.group(), matcher.group().replace("0..1",replacement));
		   
		  muModelCode = modelCode;
		  while(matcher.find())		  		  		  
		  { 
			  //System.out.println(matcher.group().toString());			  
			  muModelCode= muModelCode.replace(matcher.group(), matcher.group().replace("Double",replacement));
		  
		  }
		  //System.out.println(matcher.group());
		  //System.out.println("Mutated Code  ");
		  //System.out.println(muModelCode);
		  //muModelCode= "namespace OptionalOneToMany;\n"+muModelCode;
		  //System.out.println(muModelCode);
		  modelFileName =this.addMutatedFile(path, uFileName,  "Double", muModelCode);
		  modelFile = new File (modelFileName);
		  UmpleFile umpleFile = new UmpleFile (modelFile);
		  //System.out.println("ModelFILENAME  ");
		  //System.out.println(modelFileName);
		  this.addMutant(new Mutant(new UmpleModel(umpleFile),"Double", this));
		  /*try {
			
			 this.//createUmpleMutationSystem(path, "DoubleMutation_"+ uFileName, lang,"Double");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		  return null;
  }

  // line 870 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateConstraintsBiggerEq(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
	   String modelFileName="";
	   File modelFile;
	   UmpleModel mutatedModel = new UmpleModel(null); 
			
	   	  
	   
	   String regex = "pre:\\s*\\w*\\s*>=";
		  String replacement = "";
		  
		  if (replacementType == "random")
		  {
			  Collections.shuffle(randomReplacements_typedAttribute);
			  replacementType = randomReplacements_typedAttribute.get(0);
		  }
		  
		  if (replacementType == "<")
		  {
			  replacement = "<";
		  }
		  
		  if (replacementType == "<=")
		  {
			  replacement = "<=";
		  }
		  
		  if (replacementType == ">")
		  {
			  replacement = ">";
		  }
		  
		  if (replacementType == "==")
		  {
			  replacement = "==";
		  }
		  
		  
		  
		  
		  
		  //muModelCode = modelCode.replaceAll(regex, replacement);
		  
		  Pattern pattern = Pattern.compile(regex);
		  Matcher matcher = pattern.matcher(modelCode);
		  
		  
		  //matcher.find();
		  //muModelCode= modelCode.replace(matcher.group(), matcher.group().replace("0..1",replacement));
		   
		  muModelCode = modelCode;
		  
		  
		  muModelCode = modifyModelCode(modelCode, regex, replacement, "ConstraintBiggerEq");
		  //System.out.println(matcher.group());
		  //System.out.println("Mutated Code  ");
		  //System.out.println(muModelCode);
		  //muModelCode= "namespace OptionalOneToMany;\n"+muModelCode;
		  modelFileName =this.addMutatedFile(path, uFileName,  "ConstraintsBiggerEq", muModelCode);
		  modelFile = new File (modelFileName);
		  UmpleFile umpleFile = new UmpleFile (modelFile);
		  //System.out.println("ModelFILENAME  ");
		  //System.out.println(modelFileName);
		  this.addMutant(new Mutant(new UmpleModel(umpleFile),"ConstraintsBiggerEq", this));
		  try {
			
			 this.createUmpleMutationSystem(path, "ConstraintsBiggerEqMutation_"+ uFileName, lang,"ConstraintsBiggerEq");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return null;
  }

  // line 945 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateConstraintsBigger(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
	   String modelFileName="";
	   File modelFile;
	   UmpleModel mutatedModel = new UmpleModel(null); 
			
	   	  
	   
	   String regex = "pre:\\s*\\w*\\s*>";
		  String replacement = "";
		  
		  if (replacementType == "random")
		  {
			  Collections.shuffle(randomReplacements_typedAttribute);
			  replacementType = randomReplacements_typedAttribute.get(0);
		  }
		  
		  if (replacementType == "<")
		  {
			  replacement = "<";
		  }
		  
		  if (replacementType == "<=")
		  {
			  replacement = "<=";
		  }
		  
		  if (replacementType == ">=")
		  {
			  replacement = ">=";
		  }
		  
		  if (replacementType == "==")
		  {
			  replacement = "==";
		  }
		  
		  
		  
		  
		  
		  //muModelCode = modelCode.replaceAll(regex, replacement);
		  
		  Pattern pattern = Pattern.compile(regex);
		  Matcher matcher = pattern.matcher(modelCode);
		  
		  
		  //matcher.find();
		  //muModelCode= modelCode.replace(matcher.group(), matcher.group().replace("0..1",replacement));
		   
		  muModelCode = modelCode;
		  
		  
		  muModelCode = modifyModelCode(modelCode, regex, replacement, "ConstraintBiggerEq");
		  //System.out.println(matcher.group());
		  //System.out.println("Mutated Code  ");
		  //System.out.println(muModelCode);
		  //muModelCode= "namespace OptionalOneToMany;\n"+muModelCode;
		  modelFileName =this.addMutatedFile(path, uFileName,  "ConstraintsBiggerEq", muModelCode);
		  modelFile = new File (modelFileName);
		  UmpleFile umpleFile = new UmpleFile (modelFile);
		  //System.out.println("ModelFILENAME  ");
		  //System.out.println(modelFileName);
		  this.addMutant(new Mutant(new UmpleModel(umpleFile),"ConstraintsBiggerEq", this));
		  try {
			
			 this.createUmpleMutationSystem(path, "ConstraintsBiggerEqMutation_"+ uFileName, lang,"ConstraintsBiggerEq");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return null;
  }

  // line 1020 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateAttributeLazy(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
			  String regex = "0..1\\s*\\w*\\s*--\\s*\\*\\s+\\w\\s+\\w*";
			  String replacement = "REPCODE_OptionalOneToMany";
			  
			  /*if (replacementType== "OneToMany" && replacementType!="OptionalOneToMany")
			  {
				  replacement = "1--*";
			  }*/
			  
			  muModelCode = modelCode.replaceAll(regex, replacement);
			  
			  //System.out.println("Mutated Code  ");
			  //System.out.println(muModelCode);
			  this.addMutatedFile(path, uFileName,  "AttributeLazy", muModelCode);
		  //Mutant aMutant = new Mutant(mutatedModel, "OptionalOneToMany", this,"");
		  //this.addMutant(aMutant);
	  return null;
  }

  // line 1041 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateAttributeImmutable(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
			  String regex = "0..1\\s*\\w*\\s*--\\s*\\*\\s+\\w\\s+\\w*";
			  String replacement = "REPCODE_OptionalOneToMany";
			  
			  /*if (replacementType== "OneToMany" && replacementType!="OptionalOneToMany")
			  {
				  replacement = "1--*";
			  }*/
			  
			  muModelCode = modelCode.replaceAll(regex, replacement);
			  
			  //System.out.println("Mutated Code  ");
			  //System.out.println(muModelCode);
			  this.addMutatedFile(path, uFileName,  "AttributeImmutable", muModelCode);
		  //Mutant aMutant = new Mutant(mutatedModel, "OptionalOneToMany", this,"");
		  //this.addMutant(aMutant);
	  return null;
  }

  // line 1062 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateExtraCodeOperatorBiggerThan(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
			  String regex = "0..1\\s*\\w*\\s*--\\s*\\*\\s+\\w\\s+\\w*";
			  String replacement = "REPCODE_OptionalOneToMany";
			  
			  /*if (replacementType== "OneToMany" && replacementType!="OptionalOneToMany")
			  {
				  replacement = "1--*";
			  }*/
			  
			  muModelCode = modelCode.replaceAll(regex, replacement);
			  
			  //System.out.println("Mutated Code  ");
			  //System.out.println(muModelCode);
			  this.addMutatedFile(path, uFileName,  "AttributeImmutable", muModelCode);
		  //Mutant aMutant = new Mutant(mutatedModel, "OptionalOneToMany", this,"");
		  //this.addMutant(aMutant);
	  return null;
  }

  // line 1083 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateExtraCodeOperatorSmallerThan(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
			  String regex = "0..1\\s*\\w*\\s*--\\s*\\*\\s+\\w\\s+\\w*";
			  String replacement = "REPCODE_OptionalOneToMany";
			  
			  /*if (replacementType== "OneToMany" && replacementType!="OptionalOneToMany")
			  {
				  replacement = "1--*";
			  }*/
			  
			  muModelCode = modelCode.replaceAll(regex, replacement);
			  
			  //System.out.println("Mutated Code  ");
			  //System.out.println(muModelCode);
			  this.addMutatedFile(path, uFileName,  "AttributeImmutable", muModelCode);
		  //Mutant aMutant = new Mutant(mutatedModel, "OptionalOneToMany", this,"");
		  //this.addMutant(aMutant);
	  return null;
  }


  /**
   * line 1061 "../../../../src/MutationSuite_code.ump"
   */
  // line 1104 "../../../../src/MutationSuite_code.ump"
   public Boolean mutateExtraCodeOperatorEqual(Mutant mu, String modelCode, String replacementType, String lang){
    String muModelCode = "";
			  String regex = "0..1\\s*\\w*\\s*--\\s*\\*\\s+\\w\\s+\\w*";
			  String replacement = "REPCODE_OptionalOneToMany";
			  
			  /*if (replacementType== "OneToMany" && replacementType!="OptionalOneToMany")
			  {
				  replacement = "1--*";
			  }*/
			  
			  muModelCode = modelCode.replaceAll(regex, replacement);
			  
			  //System.out.println("Mutated Code  ");
			  //System.out.println(muModelCode);
			  this.addMutatedFile(path, uFileName,  "AttributeImmutable", muModelCode);
		  //Mutant aMutant = new Mutant(mutatedModel, "OptionalOneToMany", this,"");
		  //this.addMutant(aMutant);
	  return null;
  }


  /**
   * line 1173 "../../../../src/MutationSuite_code.ump"
   */
  // line 1126 "../../../../src/MutationSuite_code.ump"
   public String addMutatedFile(String path, String modelName, String muType, String code){
    //System.out.println("ADD starts:: "+modelName);
	   //System.out.println("model name "+modelName);
	   //System.out.println("model COODEODODOEDOE::: "+code);
	    path = path + numberofMutants + "_";
	    String filename = path +muType+ File.separator + muType + "Mutation_" + modelName ;

	    code = modifyModelNameSpace(code, muType);
		code = modifyModelUseStatements(code, muType);
		
		
		//System.out.println("File to add: " + filename);
		//System.out.println("File to add code : " + code);
		//System.out.println("code to add: " + code);
		filesToWrite.put(filename, code);
		
		//writeFile(filename, code, muType);
		
		
	    return filename;
  }

  // line 1150 "../../../../src/MutationSuite_code.ump"
   public void writeFile(String filename, String code, String muType){
    //path = path + numberofMutants + "_";
	   
	   
	   
	   for (Map.Entry<String,String> entry: filesToWrite.entrySet())
	   {
		   
	   filename = entry.getKey();
	   code = entry.getValue();		
	   //System.out.println(filename);
	   //System.out.println(code);
	   File file = new File(path+numberofMutants + "_"+muType);
	   file.mkdirs();
	    
	   BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	   try
	    {	
	      System.out.println("Writing file: "+ filename);
	      bw.write(code);
	      bw.flush();	      
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    finally
	    {
	      try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	   
	   }
  }

  // line 1198 "../../../../src/MutationSuite_code.ump"
   public void preprocessFiles(){
    
  }

  // line 1202 "../../../../src/MutationSuite_code.ump"
   public String readUseFilesCode(String filename){
    String code= "";
	   
	   BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path+uFileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   String line = null;
		   
		   try {
			while ((line = br.readLine()) != null) {
			     //System.out.println(line);
			     code += line+"\n";			     
			   }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   
	   return code;
  }

  // line 1229 "../../../../src/MutationSuite_code.ump"
   public void writeMutatedUseFiles(String path, String muType, String code){
    // TODO Auto-generated method stub
	   
	   /*for(String filename : muFiles)
	   {
		   //writeMutatedFile(path, filename, muType, code);
		   //System.out.println("muFileXXXXX:"+ filename);
		   
	   }*/
  }

  // line 1241 "../../../../src/MutationSuite_code.ump"
   public boolean analyzeModelFiles(String path, String modelName, String modelCode){
    String regex = "use\\s\\w*.ump;";
	   modelCode = originalModel.getCode(); 
	   //String muModelCode = "";
	   StringBuffer muCode = new StringBuffer(modelCode);	   
	   Random ran = new Random();	   		  		  		  
	   Pattern pattern = Pattern.compile(regex);
	   Matcher matcher = pattern.matcher(modelCode);	   
	   //muModelCode = modelCode;
	   int numberOfOccurences = 0;
	   int random=0;
	   String filename="";
	   muFiles.clear();
	   
	   while(matcher.find()) {
		   numberOfOccurences++;
		   filename = matcher.group().substring(4, matcher.group().length()-1);
		   
		   //System.out.println(filename);
		   this.muFiles.add(filename.toString());
		   //System.out.println("muFile: " + muFiles.toString());
		   
		   
	   }	   
	   
	   //System.out.println("Code: "+modelCode);
	   System.out.println("Number of linked model files: "+numberOfOccurences);	   
	   matcher.reset();		  
	   
	   int x = 0;
	   //String filename = "";


	   //System.out.println(matcher.groupCount());	   
	   //System.out.println("muFles: "+x);
	   //System.out.println("MODEL FILENAME: "+filename);
	   
	   
	   
	 unprocessedFiles = muFiles.size();
	 //System.out.println("unprocessedfiles: "+unprocessedFiles);
	   	   	   	   
	 if (numberOfOccurences>0)
	 {
		 return true;
	 }
		 
	   
	 else return false;
  }

  // line 1293 "../../../../src/MutationSuite_code.ump"
   public String modifyModelCode(String modelCode, String regex, String replacement, String muOperator){
    String muModelCode = "";
	   StringBuffer muCode = new StringBuffer(modelCode);	   
	   Random ran = new Random();	   		  		  		  
	   Pattern pattern = Pattern.compile(regex);
	   Matcher matcher = pattern.matcher(modelCode);	   
	   muModelCode = modelCode;
	   int numberOfOccurences = 0;
	   int random=0;
	   
	   while(matcher.find()) {
		   numberOfOccurences++;
		   
	   }	   
	   
	   try {
		   random = ran.nextInt(numberOfOccurences);
	   }
	   catch (Exception e ){
		   System.out.println(e.getMessage());
	   }
	   System.out.println("Number of occurences: "+numberOfOccurences);
	   System.out.println("random element number: "+ (random+1));
	   matcher.reset();		  
	   int x = 0;


	   //System.out.println(matcher.groupCount());
	   while(matcher.find())		  
		   //for ( x = 0;x>numberOfOccurences;x++)
	   {

		   if(x == random){
			   
			   if(muOperator == "OneToMany")
			   {
				   muCode = muCode.replace(matcher.start(), matcher.start()+3, replacement);
			   }
			   
			   if(muOperator.equals("ConstraintBiggerEq"))
			   {
				   //System.out.println(matcher.group().toString());
				   muCode = muCode.replace(matcher.end()-2, matcher.end(), replacement);
			   }
			   else {
				   //System.out.println(matcher.group());
				   muCode = muCode.replace(matcher.start(), matcher.end()-1, replacement);			   
			   }
		   }		      
		   x++;		                  
	   }

	   muModelCode = muCode.toString();
	   return  muModelCode;
  }

  // line 1350 "../../../../src/MutationSuite_code.ump"
   public String modifyModelNameSpace(String model, String muType){
    String regex = "namespace\\s\\w+[.\\w]*";
	   Pattern pattern = Pattern.compile(regex);
	   Matcher matcher = pattern.matcher(model);	   
	   try{
		   matcher.find();
		   model = model.replaceAll(regex, matcher.group()+"."+muType);
	   }
	   catch(Exception e)
	   {
		   
	   }
	   
	   
	   return model;
  }

  // line 1368 "../../../../src/MutationSuite_code.ump"
   public String modifyModelUseStatements(String model, String muType){
    String regex = "use";
	   Pattern pattern = Pattern.compile(regex);
	   Matcher matcher = pattern.matcher(model);	   
	   //matcher.find();	   
	   model = model.replaceAll("use ", "use "+muType+"Mutation"+"_");
	   
	   return model;
  }


  @SuppressWarnings("null")
  // line 1380 "../../../../src/MutationSuite_code.ump"
   public void prepare(String aPath, String aUFileName, String aLang, String replacementType, String muOperator){
    //MutationSuite muSuite = new MutationSuite(null, 0, null);
	   
	    path = aPath;	    
	    uFileName = aUFileName;
	    String randomElement = "";
	    
	   File aFile = new File(path+uFileName);
	   UmpleFile uFile = new UmpleFile(aFile);
	   originalModel= new UmpleModel(uFile);
	   
	   String lang = aLang;
	   String repType = replacementType;
	   String mutationOperator = muOperator;	   
	   //muType = muOperator;
	   String modelCode = "";	   
	   String muModelCode = "";	   	   
	   	   	   
	   modelCode = readModelFile (modelCode, aUFileName);
	   
	   
	   
	  if (repType.equals("random") && mutationOperator.equals("random")) {
   Collections.shuffle(randomReplacements_Elements);
   
		  
	  if (randomReplacements_Elements.get(0).equals("association"))
	  {
	  if(repType.equals("random"))
	  {

	   Collections.shuffle(randomReplacements_association);	      	   
	   randomElement = randomReplacements_association.get(0);
	   repType= randomElement;	   
	  }
	  
	  if(mutationOperator.equals("random"))
	  {
	   Collections.shuffle(randomReplacements_association);  	   
	   randomElement = randomReplacements_association.get(0);
	   mutationOperator = randomElement;	   
	  }
	  }
	  
	  else if (randomReplacements_Elements.get(0).equals("attribute"))
	  {
		  if(repType.equals("random"))
		  {
		   Collections.shuffle(randomReplacements_typedAttribute);	      	   
		   randomElement = randomReplacements_typedAttribute.get(0);
		   repType= randomElement;
		  }
		  
		  if(mutationOperator.equals("random"))
		  {
			  Collections.shuffle(randomReplacements_typedAttribute);	      	   
			   randomElement = randomReplacements_typedAttribute.get(0);
			   mutationOperator = randomElement;		   
		  }
	  }
}
	   
	   // public Boolean mutate(Mutant mu, String modelCode , String muType, String muOperator, String replacementType, String lang){
	  analyzeModelFiles(aPath, aUFileName, muModelCode); 
	  
	  
	  
	  // Randomly selecting one of files for mutation (original file and linked file all in the same pool)
	  
	  if (this.muFiles.size()>0)
	  {
		  Random ran = new Random();
		  
		  fileToMutate = ran.nextInt(muFiles.size()+1); // plus the original file  
		  
		  if (fileToMutate != 0) {
		  uFileName = this.muFiles.get(fileToMutate-1);
		  
		  }
		  else {
			  uFileName = aUFileName;
		  }
		  
		  int processedFiles = 0;
		  /*while(unprocessedFiles>0)
		  {
			  unprocessedFiles = unprocessedFiles-1;			  
			  
			  String useModelFile = muFiles.get(processedFiles);
			  //uFileName = muFiles;
			  String useFileCode = readUseFilesCode(uFileName);			  
			  processedFiles = processedFiles+1;
			  System.out.println("Mutating linked file:  ");
			  System.out.println(useModelFile);			  			  
			  //System.out.println(mutationOperator);
			  //mutate(null, useFileCode, "random",mutationOperator,repType, lang);
			  //System.out.println("unprocessed Files: "+unprocessedFiles);			  
			  //prepare(aPath, useModelFile, aLang, replacementType, muOperator);
			  
		  }*/
		  
		  
	  }
	  
	  
	  
	  //System.out.println("Mutating file:  ");
	  //System.out.println(uFileName);
	  System.out.println("uFileNAME:::" + fileToMutate);
	  System.out.println("uFileNAME:::" + uFileName);
	  
	  
	  System.out.println("RandomElement Selected: " + randomElement);
	  
	  //System.out.println("Muationoperator: " + mutationOperator);
	  
	  //mutate Chosen file 
	  mutate(null, modelCode, muOperator ,mutationOperator,repType, lang);	  
	  	         	  
	  //System.out.println("MutationPath:::" + mutationPath);
	  //generate other un-mutated files 
	  generateRelatedFiles(lang, mutationOperator, aUFileName);
	  
	  writeFile(null,null,mutationOperator);	   	 
	  //System.out.println(filesToWrite.toString());	  
	  createUmpleMutationsystemFinal(mutationOperator, lang);
	  
	  for (Map.Entry<String, String> entry : filesToWrite.entrySet())
	  {
		  //System.out.println("FFFFFF files to write: " +entry.getKey());
		  //System.out.println("FFFFFF files to write: " +entry.getValue());
	  }
  }


  @SuppressWarnings("null")
  // line 1518 "../../../../src/MutationSuite_code.ump"
   public UmpleModel createUmpleMutationSystem(String pathToInput, String filename, String lang, String muType) throws IOException{
    //pathToInput= SampleFileWriter.rationalize("");
	   //filename = SampleFileWriter.rationalize(filename);
	   //System.out.println("filename::::");
	   //System.out.println(pathToInput+muType+"/"+filename);
	   String muTypePath =  numberofMutants + "_"+muType;
	   mutationPath = pathToInput+numberofMutants + "_"+muType+"/";
	    
	   BufferedReader br = new BufferedReader(new FileReader(pathToInput+muTypePath+"/"+filename));
	   String modelCode = "";
	   String line = "";
	   File file = new File(pathToInput,muTypePath+"/"+ filename);
	   //System.out.println(file.getAbsolutePath());
	   String umpleParserName="UmpleInternalParser";
	   String language = lang;
	   RuleBasedParser rbp = new RuleBasedParser();	   
	   UmpleFile uFile = new UmpleFile (file);	   
	   //System.out.println(uFile.getPath());
	   UmpleModel model = new UmpleModel(uFile);
	   model.setShouldGenerate(true);
	   while ((line = br.readLine()) != null) {
		     //System.out.println(line);
		     modelCode += line+"\n";
		   }
	   //br.close();
	   //originalModel.setCode(modelCode);	   
	   model.setCode(modelCode);
	   
	   //model.addGenerate("");
	   
	   
	   UmpleParser uiParser = new UmpleInternalParser("cruise.umple.compiler",model,rbp);
	   //uiParser.analyze(true);
	   
	   ParseResult result = rbp.parse(file); 	   
	   model.extractAnalyzersFromParser(rbp);
	   model.setLastResult(result);
	   
	   //rbp.addGrammarFile("");
	   
//	   model.setUmpleFile(new UmpleFile(new File(pathToInput, filename)));
	   model.addGenerate(language);
	   ;
	   //model.setDefaultNamespace(pathToInput);
	   
	   //System.out.println("PATHTHTTHTHTH");
	   //System.out.println(model.getDefaultGeneratePath());
	   
	   result = uiParser.analyze(true);
	   
	   //System.out.println("PackaGE::::");
	   //model.setDefaultPackage(model.getDefaultNamespace());
	   //model.setDefaultNamespace(model.getDefaultPackage());
	   //model.getDefaultGenerate()
	   //System.out.println(model.getDefaultNamespace());
	   
	   //System.out.println(file.getAbsolutePath());
	   //System.out.println(file.getName());
	   //System.out.println(rbp.getRootToken());
	   
	   
	   
	   //System.out.println(result.getErrorMessages().toString());
	   System.out.println("Generating files for: "+ filename);
	   //System.out.println(model.getCode());
	   model.generate();
	   //System.out.println("GENCODEDEDEDE");
	   //System.out.println(model.getGeneratedCode());
	   
	   
	   
	    
	    /*model.setShouldGenerate(false);
	    //if( aTracer != null )
	    //	model.setTracer(new TracerDirective(aTracer));
	    
		   
	    
	    
	    
	    model = uiParser.getModel();*/
	    
	    //System.out.println(model.getUmpleFile());
	    
	    
	   // System.out.println(result.toString());
	    
	    //System.out.println(model.getAssociation(0).toString());
	    	    	    
	    
	    return model;
  }

  // line 1611 "../../../../src/MutationSuite_code.ump"
   private void createUmpleMutationsystemFinal(String muType, String lang){
    // TODO compile models
	mutationPath = path+numberofMutants + "_"+muType+"/";  
	String modeFileName = "";
	  //String path = 
	
	  for (Map.Entry<String, String> entry : filesToWrite.entrySet()){
		  String filename = entry.getKey();
	
		  try {
		  BufferedReader br = new BufferedReader(new FileReader(filename));
	  
		  
		   String modelCode = "";
		   String line = "";
		   File file = new File(filename);
		   //System.out.println("ABSOLUTE PAAAATH "+file.getAbsolutePath());
		   String umpleParserName="UmpleInternalParser";
		   String language = lang;
		   RuleBasedParser rbp = new RuleBasedParser();	   
		   UmpleFile uFile = new UmpleFile (file);	   
		   //System.out.println(uFile.getPath());
		   UmpleModel model = new UmpleModel(uFile);
		   model.setShouldGenerate(true);
		   while ((line = br.readLine()) != null) {
			     //System.out.println(line);
			     modelCode += line+"\n";
			   }
		   br.close();
		   //originalModel.setCode(modelCode);	   
		   model.setCode(modelCode);
		   
		   //model.addGenerate("");
		   
		   
		   UmpleParser uiParser = new UmpleInternalParser("cruise.umple.compiler",model,rbp);
		   //uiParser.analyze(true);
		   
		   ParseResult result = rbp.parse(file); 	   
		   model.extractAnalyzersFromParser(rbp);
		   model.setLastResult(result);
		   
		   //rbp.addGrammarFile("");
		   
//		   model.setUmpleFile(new UmpleFile(new File(pathToInput, filename)));
		   model.addGenerate(language);
		   ;
		   //model.setDefaultNamespace(pathToInput);
		   
		   //System.out.println("PATHTHTTHTHTH");
		   //System.out.println(model.getDefaultGeneratePath());
		   
		   result = uiParser.analyze(true);
		   
		   //System.out.println("PackaGE::::");
		   //model.setDefaultPackage(model.getDefaultNamespace());
		   //model.setDefaultNamespace(model.getDefaultPackage());
		   //model.getDefaultGenerate()
		   //System.out.println(model.getDefaultNamespace());
		   
		   //System.out.println(file.getAbsolutePath());
		   //System.out.println(file.getName());
		   //System.out.println(rbp.getRootToken());
		   
		   
		   
		   //System.out.println(result.getErrorMessages().toString());
		   System.out.println("Generating files for: "+ filename);
		   //System.out.println(model.getCode());
		   model.generate();
		   //System.out.println("GENCODEDEDEDE");
		   //System.out.println(model.getGeneratedCode());
		  }
		  catch (Exception e)
		  {
			  System.out.println("Failed to compile mtated model file: "+ e.getMessage());
		  }
		   
	  
	  
	  
		  
		   
		  
	  }
  }

  // line 1701 "../../../../src/MutationSuite_code.ump"
   private String readModelFile(String modelCode, String aUFileName){
    // TODO Auto-generated method stub
	  
	  System.out.println("FileName::: "+aUFileName);
	  modelCode = "";
	  BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path+aUFileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read model file !");
			e.printStackTrace();
		}
		   String line = null;
		   originalModel.setCode("");
		   try {
			while ((line = br.readLine()) != null) {
			     //System.out.println(line);
			     modelCode += line+"\n";
			     originalModel.setCode(originalModel.getCode()+line+"\n");
			   }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   return modelCode;
  }

  // line 1729 "../../../../src/MutationSuite_code.ump"
   private void generateRelatedFiles(String lang, String mutationOperator, String aUFileName){
    String modelCode = "";
	  // TODO Auto-generated method stub
	  if (aUFileName != uFileName)
	  {
		  for ( int x = 0 ; x<muFiles.size();x++)
		  {
			   
			  //String fileName = muationOperator;
			  //uFileName = muFiles.get(x);
			  //System.out.println(readModelFile(modelCode, muFiles.get(x)));
			  modelCode = readModelFile(modelCode, muFiles.get(x));
			  //System.out.println("model COODEODODOEDOE::: "+modelCode);
			  if ( x+1 != fileToMutate)
			  {
				  try {

					  //System.out.println("11XXXXXXFILENAME : "+ muFiles.get(x));
					  //System.out.println("11XXXXXXFILECODE : "+ modelCode);
					  addMutatedFile(path,uFileName,mutationOperator, modelCode);	
					  //createUmpleMutationSystem(path, mutationOperator+"Mutation_"+muFiles.get(x), lang, mutationOperator);
					  System.out.println("related file generated : "+ muFiles.get(x));
					  modelCode = "";
					  
				  }
				  catch (Exception e) {
					  System.out.println(e.getMessage());
				  }
			  }
		  }

		  try {
			  
			  //uFileName = aUFileName;
			  //System.out.println(readModelFile(modelCode, aUFileName));
			  modelCode = readModelFile(modelCode, aUFileName); 
			  
			  //System.out.println("00XXXXXXFILENAME : "+ aUFileName);
			  //System.out.println("00XXXXXXFILECODE : "+ modelCode);
			  addMutatedFile(path,aUFileName,mutationOperator, modelCode);

			  //createUmpleMutationSystem(path,mutationOperator+aUFileName, lang, mutationOperator);
			  System.out.println("related file generated : "+ aUFileName);
			  modelCode = "";
			  
			 /* for (Map.Entry<String, String> entry : filesToWrite.entrySet())
			  {
				  System.out.println("FFFFFF files to write: " +entry.getKey());
				  System.out.println("FFFFFF files to write: " +entry.getValue());
			  }*/
			  
		  }
		  catch (Exception e) {
			  System.out.println(e.getMessage());
		  }

	  }
	  else 
	  {
		  for ( int x = 0 ; x<muFiles.size();x++)
		  {			
			  //uFileName = muFiles.get(x);
			  //System.out.println(readModelFile(modelCode, muFiles.get(x)));
			  modelCode = readModelFile(modelCode, muFiles.get(x));
			  try {
				  
				  //System.out.println("22XXXXXXFILENAME : "+ muFiles.get(x));
				  //System.out.println("22XXXXXXFILECODE : "+ modelCode);
				  addMutatedFile(path,muFiles.get(x),mutationOperator, modelCode);
				  //createUmpleMutationSystem(path, mutationOperator+"Mutation_"+muFiles.get(x), lang, mutationOperator);
				  System.out.println("related file generated : "+ muFiles.get(x));
				  modelCode = "";
			  }
			  catch (Exception e) {
				  System.out.println(e.getMessage());
			  }
		  }

	  }
  }


  public String toString()
  {
    return super.toString() + "["+
            "score" + ":" + getScore()+ "," +
            "uFileName" + ":" + getUFileName()+ "," +
            "unprocessedFiles" + ":" + getUnprocessedFiles()+ "," +
            "path" + ":" + getPath()+ "," +
            "fileToMutate" + ":" + getFileToMutate()+ "," +
            "numberofMutants" + ":" + getNumberofMutants()+ "," +
            "mutationPath" + ":" + getMutationPath()+ "," +
            "hasMultipleFiles" + ":" + getHasMultipleFiles()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "originalModel" + "=" + (getOriginalModel() != null ? !getOriginalModel().equals(this)  ? getOriginalModel().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "muFiles" + "=" + (getMuFiles() != null ? !getMuFiles().equals(this)  ? getMuFiles().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "randomReplacements_association" + "=" + (getRandomReplacements_association() != null ? !getRandomReplacements_association().equals(this)  ? getRandomReplacements_association().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "randomReplacements_typedAttribute" + "=" + (getRandomReplacements_typedAttribute() != null ? !getRandomReplacements_typedAttribute().equals(this)  ? getRandomReplacements_typedAttribute().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "randomReplacements_Elements" + "=" + (getRandomReplacements_Elements() != null ? !getRandomReplacements_Elements().equals(this)  ? getRandomReplacements_Elements().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "filesToWrite" + "=" + (getFilesToWrite() != null ? !getFilesToWrite().equals(this)  ? getFilesToWrite().toString().replaceAll("  ","    ") : "this" : "null");
  }
}