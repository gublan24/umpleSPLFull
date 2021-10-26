/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import java.util.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;
import cruise.umple.compiler.test.*;
import java.util.stream.Collectors;

// line 14 "../../../../src/Generator_CodeTest.ump"
public class TestGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TestGenerator Attributes
  private UmpleModel model;
  private String output;
  private Random random;
  private HashMap<String,String> testingCredentialsLookUpMap;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TestGenerator()
  {
    super();
    model = null;
    output = "";
    random = new Random();
    testingCredentialsLookUpMap = new HashMap<String, String>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setModel(UmpleModel aModel)
  {
    boolean wasSet = false;
    model = aModel;
    wasSet = true;
    return wasSet;
  }

  public boolean setOutput(String aOutput)
  {
    boolean wasSet = false;
    output = aOutput;
    wasSet = true;
    return wasSet;
  }

  public boolean setRandom(Random aRandom)
  {
    boolean wasSet = false;
    random = aRandom;
    wasSet = true;
    return wasSet;
  }

  public boolean setTestingCredentialsLookUpMap(HashMap<String,String> aTestingCredentialsLookUpMap)
  {
    boolean wasSet = false;
    testingCredentialsLookUpMap = aTestingCredentialsLookUpMap;
    wasSet = true;
    return wasSet;
  }

  /**
   * Contains various aspects from an Umple file (.ump), such as classes, attributes, associations and methods.  Generated output is based
   * off of what's contained in here.
   */
  public UmpleModel getModel()
  {
    return model;
  }

  public String getOutput()
  {
    return output;
  }

  public Random getRandom()
  {
    return random;
  }

  public HashMap<String,String> getTestingCredentialsLookUpMap()
  {
    return testingCredentialsLookUpMap;
  }

  public void delete()
  {
    super.delete();
  }

  // line 40 "../../../../src/Generator_CodeTest.ump"
   public String translate(String aString){
    //HashMap<String, String> testingCredentialsLookUpMap = new HashMap<String, String>();
	    testingCredentialsLookUpMap.put("AttStringManu", "RandomString1");
	    testingCredentialsLookUpMap.put("AttStringManu2", "RandomString2");
	    testingCredentialsLookUpMap.put("AttIntManu", "123");
	    testingCredentialsLookUpMap.put("AttIntManu2", "321");
	    testingCredentialsLookUpMap.put("AttDoubleManu", "123456789");
	    testingCredentialsLookUpMap.put("AttDoubleManu2", "987654321");
	    testingCredentialsLookUpMap.put("AttfloatManu", "1.2");
	    testingCredentialsLookUpMap.put("AttfloatManu2", "213.8765");
	    testingCredentialsLookUpMap.put("AttDateManu", "Date.valueOf(\"1999-12-12\")");
	    testingCredentialsLookUpMap.put("AttTimeManu", "Time.valueOf(\"12:59:59\")");
		return testingCredentialsLookUpMap.get(aString);
  }

  // line 58 "../../../../src/Generator_CodeTest.ump"
   public String addTranslate(String key, String value){
    testingCredentialsLookUpMap.put(key, value);
	    
		return testingCredentialsLookUpMap.get(key);
  }

  // line 67 "../../../../src/Generator_CodeTest.ump"
   public String translate(String stirng, UmpleClass uClass){
    return null;
  }

  // line 74 "../../../../src/Generator_CodeTest.ump"
   public void prepareDependency(){
    ClassDependencyTree cTree = new ClassDependencyTree(false, false);
	   
	   List<String> visited = new ArrayList<String>();
     
	  
	  for ( UmpleClass uClass : model.getUmpleClasses())
	  {
		  if(!visited.contains(uClass.getName()))
		  {
		  System.out.println(uClass.getName());
		  for (Association as : uClass.getAssociations())
		  {
			  int i=0;
			  AssociationEnd myEnd = as.getIsRightNavigable()?as.getEnd(0):as.getEnd(1);
		      AssociationEnd theirEnd = as.getIsRightNavigable()?as.getEnd(1):as.getEnd(0);
		      
		      //System.out.println("MY End :: "+ myEnd.getMultiplicity().isMany());
		      //System.out.println("their End :: "+ theirEnd);
		      
		      /*if (theirEnd.getMultiplicity().isOne()&& theirEnd.getMultiplicity().isOne())
		      {
		    	  //ignore 		    	  
		    	  /*String name = theirEnd.getClassName();
		    	  ClassDependencyNode cdn = new ClassDependencyNode(1, true, false, name);
		    	  cdn.setUmpleClass(uClass);
		    	  
		    	  System.out.println("need to Add :: "+ theirEnd.getClassName());		    	  
		    	  cTree.addClassDependencyNode(cdn);	    	      	  
		      }
		      
		      else */
		      if (myEnd.getMultiplicity().isOne() && theirEnd.getMultiplicity().isMany())
		      {   
		    	  
		    	  String name = theirEnd.getClassName();
		    	  ClassDependencyNode cdn = new ClassDependencyNode(1, true, false, myEnd.getClassName());
		    	  for(UmpleClass dependeeClass : model.getUmpleClasses())
		    	  {
		    		  if (dependeeClass.getName().equals(name)){
		    			  cdn.setUmpleClass(dependeeClass);		    			  
		    		  }
		    	  }
		    	  
		    	  
		    	  //System.out.println("need to add "+ myEnd.getClassName() +"  to :: "+ theirEnd.getClassName());		    	  		    	  
		    	  cTree.addClassDependencyNode(cdn);		    	  		    	  		    	  
		      }
		      
		      
		      
		      
			  if ( theirEnd.getMultiplicity().isMany() && myEnd.getMultiplicity().isMany())
			  {
				  
				  //ClassDependencyNode cNode = new ClassDependencyNode(0, false, uClass.getName(), cTree);
				  //cTree.addOrMoveClassDependencyNodeAt(new ClassDependencyNode(0, false, uClass.getName(), cTree),i++);
				   
			  }
			  
		  }
		  visited.add(uClass.getName());
		  }
		  
	  }
	  
	  for (ClassDependencyNode node : cTree.getClassDependencyNodes())
	  {
	 // System.out.println("dependee : "+node.getUClassName() +"  object Level : "+ node.getLevel()+" dependent class is:  "+node.getUmpleClass().getName());
	  
	  }
	  
	 // System.out.println("node size ::: " + cTree.getClassDependencyNodes().size());	  	  
	  
	  for (UmpleClass uClass : model.getUmpleClasses())
	  {
		  if ( uClass.hasClassDependencyNodes())
		  {
			  
			  //System.out.println("Class Name: " + uClass.getName());
			  //System.out.println("dependee size ::: " + uClass.getClassDependencyNodes().size());
			  for (ClassDependencyNode dn : uClass.getClassDependencyNodes())
			  {
				  
				//  System.out.println("\t dependee : " + dn.getUClassName());
			  }
			  
			  
		  }
		  
	  }
  }


  /**
   * process Dependencies for each class and create dependency nodes for each dependency
   */
  // line 169 "../../../../src/Generator_CodeTest.ump"
   public boolean processDependencyNodes(){
    for ( UmpleClass uClass : model.getUmpleClasses())
	    {    		    	
	      if (uClass.hasAssociationVariables())
	      {
	    	  for (AssociationVariable av : uClass.getAssociationVariables())
	    	  {	    		 
	    		  if (av.isMandatory())
	    		  {	    			 
	    			  ClassDependencyNode CDN  = new  ClassDependencyNode(0,false,false, av.getRelatedAssociation().getUmpleClass().getName());
	    			  uClass.addClassDependencyNode(CDN);
	    		  }
	    	  }
	      }      
	    	
	    }
	   
	   return true;
  }

  // line 189 "../../../../src/Generator_CodeTest.ump"
   public String writeFile(UmpleClass aClass){
    String className=aClass.getName();
	    //UmpleClass uClass;
	    ILang language = getLanguageFor(aClass);
	    String contents = language.getCode(getModel(), aClass);
	    aClass.setName(className);
	    String path = StringFormatter.addPathOrAbsolute( 
	                  getModel().getUmpleFile().getPath(), 
	                            getOutput()) + 
	                            aClass.getPackageName().replace(".", File.separator)+"";  
	    
	    File file = new File(path);
	    file.mkdirs();   
	    String filename = path + File.separator + className + "Test.umpt";
	    BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    getModel().getGeneratedCode().put(aClass.getName(),contents);

	    try
	    {
	      bw.write(contents);
	      bw.flush();
	      return contents;
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
		return null;
  }

  // line 233 "../../../../src/Generator_CodeTest.ump"
   public ILang getLanguageFor(UmpleElement aElement){
    if (aElement instanceof UmpleInterface)
    {
    	return new TestClassGenerator();
    }
    else if (aElement instanceof UmpleClass)
    {
    	return new TestClassGenerator();
    } 
    else if (aElement == null){
    	return new TestModelGenerator() ;
    }
    else {
    	        return null;        
    }
  }

  // line 252 "../../../../src/Generator_CodeTest.ump"
   public void writeModelFile(){
    //String className=aClass.getName();
	    //UmpleClass uClass;
		String modelName = model.getUmpleFile().getFileName();
		ILang language = getLanguageFor(null);
	    String contents = language.getCode(getModel(), null);
	    //aClass.setName(className);
	    String path = StringFormatter.addPathOrAbsolute( 
	                  getModel().getUmpleFile().getPath(), 
	                            getOutput()).replace(".", File.separator);  
	    
	    File file = new File(path);
	    file.mkdirs();   
	    String filename = path + File.separator + modelName + "Test.umpt";
	    BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    getModel().getGeneratedCode().put(model.getUmpleFile().getFileName(),contents);

	    try
	    {
	      bw.write(contents);
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


  /**
   * dependency handling
   * class leveling
   */
  // line 298 "../../../../src/Generator_CodeTest.ump"
   public boolean levelClasses(){
    for (UmpleClass uClass : model.getUmpleClasses())
    {	   
    	if(uClass.hasClassDependencyNodes()) {
    		//System.out.println("NODE ###############:");
    		//uClass.setLevel(uClass.getLevel()+1);
    		traverseDependency(uClass);
    		uClass.setLevel(tempLevel);    		   
    		tempLevel=0;
    	/*for (ClassDependencyNode cNode: uClass.getClassDependencyNodes())
		{
			if (model.getUmpleClass(cNode.getUClassName()).hasClassDependencyNodes())
			{			
				//System.out.println("nested initiation:");
				//uClass.setLevel(uClass.getLevel()+1);
				//System.out.println(model.getUmpleClass(cNode.getUClassName()).getName());
				uClass.setLevel(model.getUmpleClass(cNode.getUClassName()).getLevel());
			}
			
			else {
			//System.out.println("non-nested initiation:");
			//System.out.println(model.getUmpleClass(cNode.getUClassName()).getName());
			}
			
		}*/
    	}
    	else {
    		uClass.setLevel(0);
    	}
      
    	//System.out.println("class NAme**: " +uClass.getName());; System.out.println("class level: " +uClass.getLevel());
    }

	   return false;
  }

  // line 336 "../../../../src/Generator_CodeTest.ump"
   public int traverseDependency(UmpleClass inClass){
    if (inClass.hasClassDependencyNodes())
	   {
		   //System.out.println(inClass.getName()+"has nodes");
		   //inClass.setLevel(inClass.getLevel()+1);
		   //tempLevel += tempLevel+1;
		   //tempLevel += tempLevel+1;
		   nodeTraversalDepth += 1;
		   for(ClassDependencyNode cNode: inClass.getClassDependencyNodes())
		   {
			   //inClass.setLevel(inClass.getLevel()+1);
			   traverseDependency(model.getUmpleClass(cNode.getUClassName()));
			   if (nodeTraversalDepth > tempLevel)
			   {
				   tempLevel = nodeTraversalDepth;
			   }
			   nodeTraversalDepth = 0;
		   }
	   }
	   
	   else {
		   //do not increase level, just nothing
	   }
	   	   
	   //ArrayList nodes = (ArrayList) inClass.getClassDependencyNodes();	   	 	   
	   return 0;
  }


  /**
   * class object initiation
   */
  // line 368 "../../../../src/Generator_CodeTest.ump"
   public String initiateClass(UmpleClass uClass){
    String code = "";
    boolean isFirst = true;
	 
    
    
    //if(uClass.getIsInitialized() != true){
         
	 
     for (Method method: uClass.getMethods())
	  {
    	 
	   if (method.getName().equals(uClass.getName()))
	   {
		   
		   code += "a"+uClass.getName() + "(" ;   
		   for (MethodParameter methPara : method.getMethodParameters()) {
	        //System.out.println(method.getName() + "::"+ method.getSignature() );
			   
			   
			   //check and set isList in method Parameters if an attribute is a list 
			   // an issue where method parameter is not set to isList when multivalue attribute is not initialized
			   for (Attribute att : uClass.getAttributes())
			   {
				   String fixedName = "";				   
				   
				   if(att.getIsList() && (methPara.getIsList() == false))
				   {
				    fixedName = "a"+StringFormatter.toPascalCase(att.getName());				   				   
				    //System.out.println(fixedName);
				   
				   if(fixedName.equals(methPara.getName()))
				   {
						   methPara.setIsList(true);
						   //System.out.println(methPara.getIsList());
				   }
					   
				   }
			   }
			   
			   
			   if(!methPara.getIsList())
			   {
			   
			   if(isFirst!= true)
			   {
				   code += ",";
			   }
			   
			   if (methPara.getType().equals("String") || methPara.getType().equals(null) )
			   {
				   
				   //translate("AttStringManu")
				   code +=  "\""+translate("AttStringManu")+"\"" ;
			   }
			   
			   else if (methPara.getType().equals("Integer") || methPara.getType().equals("int"))
			   {
				   //code +=  "12345" ;
				   if (methPara.getIsList())
				   {
					   
				   }
				   else {
					   //System.out.println(methPara.getIsList());
					   code += translate("AttIntManu");
				   }
			   }
			   
			   else if (methPara.getType().equals("Time") || methPara.getType().equals("time"))
			   {
				   //code +=  "12345" ;
				   code += "\""+ translate("AttTimeManu")+ "\"";
			   }
			   
			   else if (methPara.getType().equals("Date") || methPara.getType().equals("date"))
			   {
				   //code +=  "12345" ;
				   code += "\""+ translate("AttDateManu") + "\"";
			   }
			   
			   else  {
				   
				   code += "\""+ "unidentified" + "\"";
			   }
			   
			   }
			   
			   
			   
			   
			   
			   if (isFirst == true)
			   {
				   isFirst = false;
			   }
			   
		   }
		   
		   
		   
		   
	   }
	   
	   
	   
	   
	   
	  }
	 
		 
	  
	  
	  if (isFirst == true)
	   {
		   code += "a"+uClass.getName() + "(" ;
	   }
	  
	  for (AssociationVariable av : uClass.getAssociationVariables())
	  {

		  if ( av.isMandatory() )
		  {
			  if (isFirst==false)
			  {
				  if(av.isN())
				  {
					  for (int x = 1 ; x< av.getMultiplicity().getLowerBound();x++)
					  {
					  //code +=  ","+ "a"+av.getRelatedAssociation().getUmpleClass().getName()+x ;
					  }
				  }
				  else {
				  code +=  ","+ "a"+av.getRelatedAssociation().getUmpleClass().getName() ;
				  }
			  }
			  else 
			  {
				  if(av.isN())
				  {
					  for (int x = 1 ; x< av.getMultiplicity().getLowerBound();x++)
					  {
					  //code += "a"+av.getRelatedAssociation().getUmpleClass().getName()+x ;
					  }
				  }
				  else {
				  code +=  "a"+av.getRelatedAssociation().getUmpleClass().getName() ;
				  }
			  }
				  
		  }		  		  
		  
	  }
	  
	  for (AssociationVariable av : uClass.getAssociationVariables())
	  {
		  if (av.isN())
		  {
			  if(av.getMultiplicity().isLowerBoundNumeric())
			  {
				  int lowerBound = av.getMultiplicity().getLowerBound();
				  
				  for (int x = 1 ; x <lowerBound+1 ; x++)
				  {
					  if (isFirst == false )
					  {
						  code +=  ","+"a"+x+ "a"+av.getRelatedAssociation().getUmpleClass().getName() ;
					  }
					  
					  else {
						  code += "a"+x + "a"+av.getRelatedAssociation().getUmpleClass().getName() ;
						  isFirst = false;
					  }
				  }
				  
			  }
		  }
	  }
	    
	  
	  code += ")";
	  uClass.setIsInitialized(true);
	  
   //}
	  
	  //System.out.println(code );
	  
	  return code;
  }


  /**
   * resets initialized objects: use to control scope of objects
   */
  // line 565 "../../../../src/Generator_CodeTest.ump"
   public void resetInitializedObject(){
    for(UmpleClass uClass : model.getUmpleClasses())
	   {
		   uClass.setIsInitialized(false);
	   }
  }


  /**
   * initiate the whole model with minimum requirements
   */
  // line 579 "../../../../src/Generator_CodeTest.ump"
   public String initializeModel(UmpleModel model){
    String code = "";
    List<UmpleClass> sortedByLevel = sortClassesByLevel();  
	
    for (int x = 0 ; x<sortedByLevel.size(); x ++)
    {
    	//code += dependencyInjection(sortedByLevel.get(x));
    	code += sortedByLevel.get(x).getName()+ " "+ initiateClass(sortedByLevel.get(x)) + "\n";
    }
    
    //System.out.println(code);
    
	return code;
  }


  /**
   * sort Umple classes by dependency level and return a sorted set
   * Return: sortByLevel::UmpleClasses
   */
  // line 600 "../../../../src/Generator_CodeTest.ump"
   private List<UmpleClass> sortClassesByLevel(){
    // TODO sort Umple classes by dependency level and return a sorted set
		   	  					
	return model.getUmpleClasses().stream().sorted(Comparator.comparingInt(UmpleClass::getLevel)).collect(Collectors.toList());
  }


  /**
   * dependency injection for a class
   */
  // line 610 "../../../../src/Generator_CodeTest.ump"
   public String dependencyInjection(UmpleClass uClass){
    String code  = "";
	   int depth = uClass.getLevel();
	   
	   if (uClass.hasClassDependencyNodes()) {
		   for (ClassDependencyNode cdp : uClass.getClassDependencyNodes())
		   { 
			   //UmpleClass depClass = model.getUmpleClass(cdp.getUClassName());			   			   
			   if (model.getUmpleClass(cdp.getUClassName()).hasClassDependencyNodes())
			   {
				   dependencyInjection(model.getUmpleClass(cdp.getUClassName()));
			   }
			 depCode += cdp.getUClassName() + " "  + initiateClass(model.getUmpleClass(cdp.getUClassName())) + ";\n";
			 
			 for (AssociationVariable av : uClass.getAssociationVariables())
			 {
				 
				 if ( av.getRelatedAssociation().getUmpleClass().getName().equals(cdp.getUClassName()))
				 { 
					 
					 if (av.isN()) {
						 for (int x = 1 ; x< av.getMultiplicity().getLowerBound()+1;x++)
						 {
							 depCode += cdp.getUClassName() + " a"+ x  + initiateClass(model.getUmpleClass(cdp.getUClassName())) + ";\n";
						 }
					 }
				 }
			 }
		   }
	   }
	   
	   else 
	   {
		   //no dependencies to be resoved code is depCode should be empty
		   //depCode += uClass.getName() + " "  + initiateClass(uClass) + "\n";
	   }
	   	   
	   code = depCode;
	   depCode = "";
	   
	   return code;
  }

  // line 655 "../../../../src/Generator_CodeTest.ump"
   public void generate(){
    StringBuilder code = new StringBuilder();
    StringBuilder codeFinal = new StringBuilder();
    StringBuilder subCode;
    StringBuilder givenCode;
    StringBuilder whereConCode;
    StringBuilder thenCode;
    String depend;
    
    StringBuilder dependClasses = new StringBuilder();
    StringBuilder parameters = new StringBuilder();
	   Random random;
	   
	   
	   

    String packageName;
    List<String> allTypes = new ArrayList<String>();
    List<String> interfacesProcessed = new ArrayList<String>();
    
    //Map<String, String> testingCredentialsLookUpMap = new HashMap<String, String>();
    /*testingCredentialsLookUpMap.put("AttStringManu", "id123test");
    testingCredentialsLookUpMap.put("AttStringRand", "RANDOMSTRING");
    testingCredentialsLookUpMap.put("AttIntManu", "123");
    testingCredentialsLookUpMap.put("AttIntRand", "RANDOMINT");
    testingCredentialsLookUpMap.put("AttFloatManu", "1.2");
    testingCredentialsLookUpMap.put("AttFloatRand", "RANDOMFloat");
    testingCredentialsLookUpMap.put("AttBooleanManu", "true");
    testingCredentialsLookUpMap.put("AttBooleanRand", "RANDOMBool");*/
    
    testingCredentialsLookUpMap.put("AttStringManu", "RandomString1");
	    testingCredentialsLookUpMap.put("AttStringManu2", "RandomString2");
	    testingCredentialsLookUpMap.put("AttIntManu", "123");
	    testingCredentialsLookUpMap.put("AttIntManu2", "321");
	    testingCredentialsLookUpMap.put("AttDoubleManu", "123456789");
	    testingCredentialsLookUpMap.put("AttDoubleManu2", "987654321");
	    testingCredentialsLookUpMap.put("AttfloatManu", "1.2");
	    testingCredentialsLookUpMap.put("AttfloatManu2", "213.8765");
    
    
    
    // Dependency Analysis 
    
    
    
    // Dependency Analysis 

    //System.out.println(dependencyInjection(model.getUmpleClass(0)));
    
    // process and create dependency nodes
    processDependencyNodes();
    // calculate the dependency depth level and set classes' level
    levelClasses();
    
    
    
    
    
    code.append("/* EXPERIMENTAL CODE - NON COMPILEABLE VERSION OF Umple xUnit Model */\n");
    code.append("/*PLEASE DO NOT EDIT THIS CODE*/\n");
    code.append("/*This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!*/\n\n");
code.append(StringFormatter.format(" ////---- Tests for  {0} ----/////\n\n",model.getUmpleFile().getFileName()));
    code.append(StringFormatter.format("Test  {0} { \n\n",model.getUmpleFile().getFileName().subSequence(0, model.getUmpleFile().getFileName().length()-4)));
    
    //depend code
    for (UmpleClass uClass : model.getUmpleClasses())
    {
    	dependClasses.append(StringFormatter.format("{0},",uClass.getName())) ;
    }
    depend = dependClasses.substring(0,dependClasses.length()-1)  ;
    code.append(StringFormatter.format("depend  {0} ; \n\n",depend));
    
  //Given code 
    code.append(StringFormatter.format("GIVEN:  \n"));
    code.append(StringFormatter.format("\t{0};\n",model.getUmpleFile().getFileName()));
    
    
  //WHERE code  (init)
    code.append(StringFormatter.format("WHERE:  \n"));
  
    for (UmpleClass uClass: model.getUmpleClasses()){
    	
    	for (Attribute att : uClass.getAttributes())
    	{
    		if ( att.getType() == "String"){
    			parameters.append(StringFormatter.format("\"some_{0}\",", att.getName()));
    		}
    		else if (att.getType() == "Integer" || att.getType() =="int" || att.getType() =="Double" )
    		{
    			//parameters.append(StringFormatter.format("{0},", random.ints().toString()));
    		}
    	}
    //code.append(StringFormatter.format("\t {0} {1} ({2}) ;\n",uClass.getName(),uClass.getName().toLowerCase(),parameters.subSequence(0, parameters.length()-1)));
    //code.append(StringFormatter.format("{0};\n",uClass.getName()));
    
    
    if (uClass.hasConstraintTrees())
	  {
  	  
  	
		  for(ConstraintTree cs : uClass.getConstraintTrees())
		  {
			 
			 if (cs.getNumberOfElements()>0)
			 {
                          for(ConstraintVariable cv:cs)
                          {
                            if(!(cv instanceof ConstraintTree))
                            {//FIXME constraints
								//code.append(StringFormatter.format("{0}",));
                            }
                          }
                          
                         
    			 }
		  }
	  }  
    
    }
    
    
  //Then code ( assertions)
    code.append(StringFormatter.format("THEN:  \n"));
    //// Class Root
    boolean isFirst = true;
    for (UmpleClass uClass : model.getUmpleClasses())
    {
      subCode = new StringBuilder();
      if (isFirst)
      {
        isFirst = false;
        packageName = getTargetNamespaceName();
        //nsURI = model.getDefaultNamespace() != null ? model.getDefaultNamespace(): model.getUmpleFile().getSimpleFileName();
        //code.append(StringFormatter.format("",packageName, nsURI));
        code.append(StringFormatter.format(""));
      }

      String superStructureFlag = "";
      String interfaceFlag = "";
      String abstractFlag = "";
      if (uClass.getExtendsClass() != null)
      {
        //superStructureFlag = StringFormatter.format(" eSuperTypes=\"#//{0}\"",uClass.getExtendsClass().getName()); 
      }
      else if (uClass.hasParentInterface()){
        // add class element attributes
		/*List<UmpleInterface> uInterfaces = uClass.getParentInterface();
		StringBuilder interfacesToken = new StringBuilder();
		interfacesToken.append(" eSuperTypes=\"");
		for (UmpleInterface uInterface : uInterfaces) {
			if (interfacesToken.toString().contains("#//"))
				interfacesToken.append(" ");
			interfacesToken.append("#//" + uInterface.getName());
		}
		interfacesToken.append("\"");
		
		superStructureFlag = interfacesToken.toString();
		interfaceFlag = " interface=\"true\"";
		abstractFlag = "abstract=\"true\"";

		// add interfaces
		for (UmpleInterface uInterface : uInterfaces) {
			if (!(interfacesProcessed.contains(uInterface.getName()))) {
				interfacesProcessed.add(uInterface.getName());
				code.append(StringFormatter
						.format(" \n",
								uInterface.getName(), interfaceFlag,
								abstractFlag));
				code.append("");
			}
		}*/
      }

//      code.append(StringFormatter.format(" ////---- Tests for  {0} ----/////\n\n",uClass.getName()));
//      code.append(StringFormatter.format(" Test {0} { \n",uClass.getName()));
/*      
      //Given code 
      code.append(StringFormatter.format("GIVEN:  \n"));
      code.append(StringFormatter.format("\t{0}.ump;\n",uClass.getName()));
      
      //WHERE code  (init)
      code.append(StringFormatter.format("WHERE:  \n"));
      code.append(StringFormatter.format("\t {0} {1} = new {0}() ;\n",uClass.getName(),uClass.getName().toLowerCase()));
      code.append(StringFormatter.format("{0};\n",uClass.getName()));
      
      if (uClass.hasConstraintTrees())
	  {
    	  
    	
		  for(ConstraintTree cs : uClass.getConstraintTrees())
		  {
			 
			 if (cs.getNumberOfElements()>0)
			 {
                            for(ConstraintVariable cv:cs)
                            {
                              if(!(cv instanceof ConstraintTree))
                              {//FIXME constraints
								code.append(StringFormatter.format("{0}",));
                              }
                            }
                            
                           
      			 }
		  }
	  }
      for(Attribute av : uClass.getAttributes())
      {
    	  code.append(StringFormatter.format(""));
    	  
      } */
      
      //Then code ( assertions)
      //code.append(StringFormatter.format("THEN:  \n"));
      //code.append(StringFormatter.format("{0};\n",uClass.getName()));

      code.append(StringFormatter.format("///////// Assertions for class {0}\n",uClass.getName()));

      for(Attribute av : uClass.getAttributes())
      {
        String typeName = av.getType() == null ? "String" : av.getType();
        String upperBound = av.getIsList() ? " upperBound=\"-1\"" : "";
        String attrName = StringFormatter.toPascalCase(av.getName());
        
        
        code.append(StringFormatter.format("// tests for attribute: {0}\n", av.getName()));
        
        
        
        
        
        //test Set Attribute
        //code.append(StringFormatter.format("\ttestCase{0}: testSet{0} { \n", attrName));
	      
        if (!av.isImmutable())
	      {
      	  //TODO:testGenerator test set assertion  [exception for Immutable] 
	    	  
	    	  
	    	  //set with some constraints
	    	  if (uClass.hasConstraintTrees())
	    	  {
	    		  for(ConstraintTree cs : uClass.getConstraintTrees())
	    		  {
	    			 if (cs.getNumberOfElements()>0)
	    			 {
                                    for(ConstraintVariable cv:cs)
                                    {
                                      if(!(cv instanceof ConstraintTree))
                                      {//FIXME constraints
                                        code.append(StringFormatter.format("a constraint test, fix me"));
                                        code.append(StringFormatter.format("AssertTrue: {0}={set{1} = }\n",uClass.getName() , attrName));
                                      }
                                    }
              			 }
	    		  }
	    	  }
	    	  
	    	  else 
	    	  {
	    	  		
	    	  	if(av.getType() == "String" || av.getType() == null)
	    	  {
	    	  	   String randomString1 = UUID.randomUUID().toString().replaceAll("-","").substring(0, 8);
	    		   code.append(StringFormatter.format("\tAssertTrue( {0}.set{1}(\"{2}\"));\n",uClass.getName().toLowerCase() , attrName, testingCredentialsLookUpMap.get("AttStringManu")));
	    		   code.append(StringFormatter.format("\tAssertTrue( {0}.get{1}() ==\"{2}\");\n",uClass.getName().toLowerCase() , attrName, testingCredentialsLookUpMap.get("AttStringManu")));
	    		   code.append(StringFormatter.format("\tAssertTrue( {0}.set{1}(\"{2}\"));\n",uClass.getName().toLowerCase() , attrName, "RandomString1"));
	    		   code.append(StringFormatter.format("\tAssertTrue( {0}.get{1}(\"{2}\"));\n",uClass.getName().toLowerCase() , attrName, "RandomString1"));
	    		   code.append(StringFormatter.format("\tAssertFalse( {0}.get{1}() ==\"{2}\");\n",uClass.getName().toLowerCase() , attrName, testingCredentialsLookUpMap.get("AttStringManu")));
	    	  }
	    	  
	    	  if(av.getType().equals("Double") || av.getType().equals("Integer"))
	    	  {
	    		   code.append(StringFormatter.format("\tAssertTrue( {0}.set{1}({2}));\n",uClass.getName().toLowerCase() , attrName,testingCredentialsLookUpMap.get("AttIntManu")));
	    		   code.append(StringFormatter.format("\tAssertTrue( {0}.get{1}() == {2});\n",uClass.getName().toLowerCase() , attrName, testingCredentialsLookUpMap.get("AttIntManu")));
	    		   
	    	  }
	    	  
	    	  if(av.getType().equals("Float"))
	    	  {
	    		  code.append(StringFormatter.format("\tAssertTrue( {0}.set{1}({2}));\n",uClass.getName().toLowerCase() , attrName,testingCredentialsLookUpMap.get("AttFloatManu")));
	    		  code.append(StringFormatter.format("\tAssertTrue( {0}.get{1}() =={2});\n",uClass.getName().toLowerCase() , attrName, testingCredentialsLookUpMap.get("AttFloatManu")));
	
	    	  }
	    	  

	    	  if(av.getType().equals("Boolean"))
	    	  {
	    		   code.append(StringFormatter.format("\tAssertTrue( {0}.(set{1}(true));\n",uClass.getName().toLowerCase() , attrName));
	    		   code.append(StringFormatter.format("\tAssertTrue( {0}.get{1}());\n",uClass.getName().toLowerCase() , attrName, testingCredentialsLookUpMap.get("AttBooleanManu")));
	    		  
	    	  }
	    		 
	    	  }
	    	  //code.append(StringFormatter.format("\t}\n", attrName));
	      }
        
        
       //test get Attribute
      //test get attribute [ this is generated for all attribute without exception]
       //code.append(StringFormatter.format("\ttestCase{0}: testGet{0} { \n", attrName));
      
	   code.append(StringFormatter.format("\t\tAssertTrue: {0}={get{1} = value}\n",uClass.getName() , attrName));
       
	   //code.append(StringFormatter.format("\t} \n", attrName));
	   
	   
        //TODO: Abstract Assertions:
	      
        
        
          
	      
	      
	      
	      
	      
	      
	      
	      
	      if (av.isIsLazy())
	      {
	    	  code.append(StringFormatter.format("\tAssertNotNull ({0});\n",av.getName()));
	    	  //TODO: testGenerator,  add assertion for lazy, we want to see if the object has the lazy-specific LOC in the constructor, Note this is still abstrac ( not language oriented) 
	    	  //  AssertLOC : student={ method=Student(), LOC="name = null;"}
	    	  /*
	    	  if(av.getType() == "String" || av.getType() == null)
	    	  {
	    		  code.append(StringFormatter.format("AssertNotNull ({0}.get{1} != null)\n",uClass.getName() , attrName));
	    	  }
	    	  
	    	  if(av.getType() == "Double" || av.getType() == "Integer")
	    	  {
	    		  code.append(StringFormatter.format("AssertLOC: {0}={method={0}(), LOC=\"{1} = 0\" }\n",uClass.getName() , attrName));
	    	  }
	    	  
	    	  if(av.getType() == "Float")
	    	  {
	    		  code.append(StringFormatter.format("AssertLOC: {0}={method={0}(), LOC=\"{1} = 0.0\" }\n",uClass.getName() , attrName));
	
	    	  }
	    	  

	    	  if(av.getType() == "Boolean") 
	    	  {
	    		  code.append(StringFormatter.format("AssertLOC: {0}={method={0}(), LOC=\"{1} = false\" }\n",uClass.getName() , attrName));
	    	  }
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  if (av.getType() == "")
	    	  {
	    		  code.append(StringFormatter.format(""));
	    	  }
	    	  
	    	  else{
	    		  
	    	  }*/
	      }
	      
	      if ( av.isImmutable())
	      {
	    	   //TODO:
	    	   code.append(StringFormatter.format("AssertMethodFalse( {0}.set{1}());\n",uClass.getName().toLowerCase() , attrName));
	    	   //assert to initial value
	    	   code.append(StringFormatter.format("AssertTrue( {0}.get{1}() == {2});\n",uClass.getName().toLowerCase() , attrName,av.getValue()));
	    	   //TODO: value from constructor if not initialized in model
	      }
	      
	      
	      
	      
	    //  code.append("\t}\n");
	      
	      
	      
	      
      }

      ArrayList<Association> internalAssociations = new ArrayList<Association>();
      for(Association as : uClass.getAssociations())
      {
        AssociationEnd myEnd = as.getIsRightNavigable()?as.getEnd(0):as.getEnd(1);
        AssociationEnd theirEnd = as.getIsRightNavigable()?as.getEnd(1):as.getEnd(0);
        

        if (internalAssociations.contains(as))
          continue;

        if (myEnd.getClassName().equals(theirEnd.getClassName())) 
        {
          internalAssociations.add(as);
          code.append(StringFormatter.format("",myEnd.getRoleName(),myEnd.getMultiplicity().getLowerBound(),myEnd.getMultiplicity().getUpperBound(),myEnd.getClassName(),myEnd.getClassName(),theirEnd.getRoleName()));
          code.append(StringFormatter.format("",theirEnd.getRoleName(),theirEnd.getMultiplicity().getLowerBound(),theirEnd.getMultiplicity().getUpperBound(),theirEnd.getClassName(),theirEnd.getClassName(),myEnd.getRoleName()));
        }
        else
        {
          boolean isBidirectional = as.getIsLeftNavigable()&&as.getIsRightNavigable();
          boolean isTheirEndClass = theirEnd.getClassName().equals(uClass.getName());
          //auto-link if bidirectional
          if (isTheirEndClass && isBidirectional)
          {
            myEnd = as.getEnd(1);
            theirEnd = as.getEnd(0);
          }
          //add
          if(isBidirectional)
        	 {
        	  if (theirEnd.getMultiplicity().getLowerBound() == 0 && theirEnd.getMultiplicity().getUpperBound() ==1 &&   myEnd.getMultiplicity().isMany())
        	  {
        	  	  String buffName = "some" +uClass.getName();
        		  code.append(StringFormatter.format("/////// Association: -- {2} {1} /////// \n\n", uClass.getName(), theirEnd.getClassName(), theirEnd.getMultiplicity().getRange()));
        		  //code.append(StringFormatter.format("\tthis is Optional 1 to many   association {0}, {1}, {2}, {3}, {4}, {5}\n",theirEnd.getRoleName(),theirEnd.getMultiplicity().getLowerBound(),theirEnd.getMultiplicity().getUpperBound(),theirEnd.getClassName(),theirEnd.getClassName(),myEnd.getRoleName()));
        		  //create ... without ...
        		  code.append(StringFormatter.format("\t Test Create{0}Without{1} { \n",uClass.getName(),theirEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\t{0} {1} = new {0}(); \n",uClass.getName(),buffName));
        		  code.append(StringFormatter.format("  \t\tAssertTrue ({0}.get{1}()!= null);\n","some"+theirEnd.getClassName(),theirEnd.getRoleName().toUpperCase()));
        		  code.append(StringFormatter.format("  \t}\n\n"));
        		  //replace
        		  buffName = "some"+theirEnd.getClassName();
        		  code.append(StringFormatter.format("\t Test Replace{1}In{0} { \n",uClass.getName(),theirEnd.getClassName()));
        		  //code.append(StringFormatter.format("\t// replace {1} in {0}\n",uClass.getName(),theirEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\t{0} {1} = new {0}(); \n",theirEnd.getClassName(),buffName));
        		  code.append(StringFormatter.format("  \t\t{0} {1} = new {0}(); \n",theirEnd.getClassName(),buffName+2));
        		  code.append(StringFormatter.format("  \t\t{0}.add{1}({2}); \n",buffName,theirEnd.getClassName(),"some"+myEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\tAssertEqual (1, {0}.getNumberOf{1}());\n",buffName,myEnd.getClassName()+"s"));
        		  code.append(StringFormatter.format("  \t\tAssertEqual (1, {0}.getNumberOf{1}());\n",buffName,myEnd.getClassName()+"s"));
        		  code.append(StringFormatter.format("  \t\t{0}.set{1}({2}); \n","some"+myEnd.getClassName(),theirEnd.getClassName(),buffName+2));
        		  code.append(StringFormatter.format("  \t\tAssertEqual ({0}, {1}.get{2}(0));\n","some"+myEnd.getClassName(),buffName+2,myEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t}\n\n"));
        		  //delete
        		  code.append(StringFormatter.format("\t Test Delete{1} { \n",uClass.getName(),theirEnd.getClassName()));
        		  //code.append(StringFormatter.format("\t// delete {1} in {0}\n",uClass.getName(),theirEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\t{0}.delete(); \n",buffName+2,theirEnd.getClassName(),buffName+2));
        		  code.append(StringFormatter.format("  \t\tAssertEqual (null, {1}.get{2}(0));\n","some"+myEnd.getClassName(),buffName+2,myEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t}\n\n"));
        		  //add to new B
        		  buffName= "some"+myEnd.getClassName();
        		  code.append(StringFormatter.format("\t Test Add{1}ToNew{0} { \n",uClass.getName(),theirEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\t{0} {1} = new {0}(); \n",theirEnd.getClassName(),buffName));
        		  code.append(StringFormatter.format("  \t\t{0} {1} = new {0}(); \n",theirEnd.getClassName(),buffName+2));
        		  code.append(StringFormatter.format("  \t\t{0} {1} = new {0}(); \n",myEnd.getClassName(),"some"+myEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\t{0}.add{1}({2}); \n",buffName,theirEnd.getClassName(),"some"+theirEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\t{0}.add{1}({2}); \n",buffName,theirEnd.getClassName(),"some"+theirEnd.getClassName()+2));
        		  code.append(StringFormatter.format("  \t\tAssertEqual({2}, {0}.get{1}(); \n",buffName,theirEnd.getClassName(),"some"+theirEnd.getClassName()+2));
        		  code.append(StringFormatter.format("  \t\tAssertEqual ({0}, {2}.get{1}(0));\n",buffName,myEnd.getClassName(),"some"+theirEnd.getClassName()+2));
        		  code.append(StringFormatter.format("  \t\tAssertEqual (0, {2}.getNumberOf{1}());\n",buffName,myEnd.getClassName()+"s","some"+theirEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t}\n\n"));
	  
        	  }
        	  if (theirEnd.getMultiplicity().isOne() && myEnd.getMultiplicity().isMany())
        	  {
        		  String buffName = "some" +uClass.getName();
        		  code.append(StringFormatter.format("/////// Association: -- {2} {1} /////// \n\n", uClass.getName(), theirEnd.getClassName(), theirEnd.getMultiplicity().getRange()));
        		  //code.append(StringFormatter.format("\tthis is Optional 1 to many   association {0}, {1}, {2}, {3}, {4}, {5}\n",theirEnd.getRoleName(),theirEnd.getMultiplicity().getLowerBound(),theirEnd.getMultiplicity().getUpperBound(),theirEnd.getClassName(),theirEnd.getClassName(),myEnd.getRoleName()));
        		  //create ... without ...
        		  code.append(StringFormatter.format("\t Test Create{0}Without{1} { \n",uClass.getName(),theirEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\t{0} {1} = new {0}(); \n",uClass.getName(),buffName));
        		  code.append(StringFormatter.format("  \t\tAssertTrue ({0}.get{1}()!= null);\n","some"+theirEnd.getClassName(),theirEnd.getRoleName().toUpperCase()));
        		  code.append(StringFormatter.format("  \t}\n\n"));
        		  //replace
        		  buffName = "some"+theirEnd.getClassName();
        		  code.append(StringFormatter.format("\t Test Replace{1}In{0} { \n",uClass.getName(),theirEnd.getClassName()));
        		  //code.append(StringFormatter.format("\t// replace {1} in {0}\n",uClass.getName(),theirEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\t{0} {1} = new {0}(); \n",theirEnd.getClassName(),buffName));
        		  code.append(StringFormatter.format("  \t\t{0} {1} = new {0}(); \n",theirEnd.getClassName(),buffName+2));
        		  code.append(StringFormatter.format("  \t\t{0}.add{1}({2}); \n",buffName,theirEnd.getClassName(),"some"+myEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\tAssertEqual (1, {0}.getNumberOf{1}());\n",buffName,myEnd.getClassName()+"s"));
        		  code.append(StringFormatter.format("  \t\tAssertEqual (1, {0}.getNumberOf{1}());\n",buffName,myEnd.getClassName()+"s"));
        		  code.append(StringFormatter.format("  \t\t{0}.set{1}({2}); \n","some"+myEnd.getClassName(),theirEnd.getClassName(),buffName+2));
        		  code.append(StringFormatter.format("  \t\tAssertEqual ({0}, {1}.get{2}(0));\n","some"+myEnd.getClassName(),buffName+2,myEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t}\n\n"));
        		  //delete
        		  code.append(StringFormatter.format("\t Test Delete{1} { \n",uClass.getName(),theirEnd.getClassName()));
        		  //code.append(StringFormatter.format("\t// delete {1} in {0}\n",uClass.getName(),theirEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\t{0}.delete(); \n",buffName+2,theirEnd.getClassName(),buffName+2));
        		  code.append(StringFormatter.format("  \t\tAssertEqual (null, {1}.get{2}(0));\n","some"+myEnd.getClassName(),buffName+2,myEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t}\n\n"));
        		  //add to new B
        		  buffName= "some"+myEnd.getClassName();
        		  code.append(StringFormatter.format("\t Test Add{1}ToNew{0} { \n",uClass.getName(),theirEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\t{0} {1} = new {0}(); \n",theirEnd.getClassName(),buffName));
        		  code.append(StringFormatter.format("  \t\t{0} {1} = new {0}(); \n",theirEnd.getClassName(),buffName+2));
        		  code.append(StringFormatter.format("  \t\t{0} {1} = new {0}(); \n",myEnd.getClassName(),"some"+myEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\t{0}.add{1}({2}); \n",buffName,theirEnd.getClassName(),"some"+theirEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t\t{0}.add{1}({2}); \n",buffName,theirEnd.getClassName(),"some"+theirEnd.getClassName()+2));
        		  code.append(StringFormatter.format("  \t\tAssertEqual({2}, {0}.get{1}(); \n",buffName,theirEnd.getClassName(),"some"+theirEnd.getClassName()+2));
        		  code.append(StringFormatter.format("  \t\tAssertEqual ({0}, {2}.get{1}(0));\n",buffName,myEnd.getClassName(),"some"+theirEnd.getClassName()+2));
        		  code.append(StringFormatter.format("  \t\tAssertEqual (0, {2}.getNumberOf{1}());\n",buffName,myEnd.getClassName()+"s","some"+theirEnd.getClassName()));
        		  code.append(StringFormatter.format("  \t}\n\n"));
        		  
        	  }
        	  }
          else if(!isTheirEndClass)
        	  code.append(StringFormatter.format("\n\tnot third \n",theirEnd.getRoleName(),theirEnd.getMultiplicity().getLowerBound(),theirEnd.getMultiplicity().getUpperBound(),theirEnd.getClassName()));
        }
      }

      for (StateMachine sm : uClass.getStateMachines())
      {
        if ("Simple".equals(sm.getType()))
        {
          String enumerationName = StringFormatter.toPascalCase(sm.getName());
          code.append(StringFormatter.format("",sm.getName(),enumerationName));          

          int index = 0;
          subCode.append(StringFormatter.format("",enumerationName));
          for (State s : sm.getStates())
          {
            subCode.append(StringFormatter.format("",s.getName(),index));
            index += 1;
          }
          subCode.append("");
        }
      }
		
	  	
      code.append("");
      code.append(subCode.toString());
//      code.append(StringFormatter.format("}\n\n\n"));
      codeFinal.append(writeFile(uClass));
    }

    if (!isFirst)
    {
      code.append("\n");
    }
    
    code.append(StringFormatter.format("}\n\n"));
    
    //model.setCode(code.toString());
    codeFinal.append(writeModel());
    model.setCode(codeFinal.toString());
  }

  // line 1193 "../../../../src/Generator_CodeTest.ump"
   private String getFullyQualifiedName(String packageName, String className){
    try
    {
      String fullName = packageName + "." + className;
      Class.forName(fullName);
      return fullName;
    }
    catch (Exception e) 
    {
      return null;  
    }
  }

  // line 1206 "../../../../src/Generator_CodeTest.ump"
   private String getTargetNamespaceName(){
    if (model.getDefaultNamespace() != null){
      if (model.getDefaultNamespace().length() > 0 )
      {
        String [] namespaces = model.getDefaultNamespace().split("\\.");	
        return namespaces[namespaces.length-1];
      }
    }
    return model.getUmpleFile().getSimpleFileName();
  }

  // line 1298 "../../../../src/Generator_CodeTest.ump"
   private String writeModel(){
    try
    {
      TestModelGenerator tmGen = new TestModelGenerator();
      
      String path = StringFormatter.addPathOrAbsolute( 
	                  getModel().getUmpleFile().getPath(), 
	                            getOutput()) + 
	                            model.getUmpleClass(0).getPackageName().replace(".", File.separator)+"";
      File file = new File(path);
      file.mkdirs();
      String modelFilename = path + File.separator + model.getUmpleFile().getSimpleFileName() + "_ModelTest.umpt";
      BufferedWriter bw = new BufferedWriter(new FileWriter(modelFilename));
      bw.write(tmGen.getCode(model));
      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("There was a problem with generating Test code." + e, e);
    }
	return null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "random" + "=" + (getRandom() != null ? !getRandom().equals(this)  ? getRandom().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "testingCredentialsLookUpMap" + "=" + (getTestingCredentialsLookUpMap() != null ? !getTestingCredentialsLookUpMap().equals(this)  ? getTestingCredentialsLookUpMap().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 29 "../../../../src/Generator_CodeTest.ump"
  private int tempLevel = 0 ;
// line 30 "../../../../src/Generator_CodeTest.ump"
  private int nodeTraversalDepth ;
// line 31 "../../../../src/Generator_CodeTest.ump"
  private int currentHighest = 0 ;
// line 32 "../../../../src/Generator_CodeTest.ump"
  private boolean branchReset = false ;
// line 33 "../../../../src/Generator_CodeTest.ump"
  private String depCode ="" ;

// line 1216 "../../../../src/Generator_CodeTest.ump"
  static 
  {
    HashMap<String, String> UpperCaseSingularLookupMap = new HashMap<String, String>();
    UpperCaseSingularLookupMap.put("parameterOne", "a{0}");
    UpperCaseSingularLookupMap.put("removeParameterOne", "placeholder{0}");    
    UpperCaseSingularLookupMap.put("parameterNew", "new{0}");
    UpperCaseSingularLookupMap.put("parameterNext", "next{0}");
    UpperCaseSingularLookupMap.put("addMethod", "add{0}");
    UpperCaseSingularLookupMap.put("removeMethod", "remove{0}");
    UpperCaseSingularLookupMap.put("indexOfMethod", "indexOf{0}");
    UpperCaseSingularLookupMap.put("parameterOld", "old{0}");
    UpperCaseSingularLookupMap.put("parameterExisting", "existing{0}");
    UpperCaseSingularLookupMap.put("parameterIsNew", "isNew{0}");
    UpperCaseSingularLookupMap.put("associationNew", "new{0}");
    UpperCaseSingularLookupMap.put("canSetMethod", "canSet{0}");
    UpperCaseSingularLookupMap.put("parameterCurrent", "current{0}");
    UpperCaseSingularLookupMap.put("deleteMethod", "delete{0}");
    UpperCaseSingularLookupMap.put("setMethod", "set{0}");
    UpperCaseSingularLookupMap.put("enterMethod", "enter{0}");
    UpperCaseSingularLookupMap.put("exitMethod", "exit{0}");
    UpperCaseSingularLookupMap.put("resetMethod", "reset{0}");
    UpperCaseSingularLookupMap.put("getMethod", "get{0}");
    UpperCaseSingularLookupMap.put("getFullMethod", "get{0}FullName");
    UpperCaseSingularLookupMap.put("getStringMethod", "get{0}StringName");
    UpperCaseSingularLookupMap.put("isFinalMethod", "is{0}Final");    
    UpperCaseSingularLookupMap.put("getDefaultMethod", "getDefault{0}");
    UpperCaseSingularLookupMap.put("didAdd", "didAdd{0}");
    UpperCaseSingularLookupMap.put("hasMethod", "has{0}");
    UpperCaseSingularLookupMap.put("associationCanSetOne","canSet{0}");
    UpperCaseSingularLookupMap.put("attributeCanSetOne","canSet{0}");
    UpperCaseSingularLookupMap.put("eventStartMethod", "start{0}Handler");
    UpperCaseSingularLookupMap.put("eventStopMethod", "stop{0}Handler");    
    UpperCaseSingularLookupMap.put("stateNull", "Null");

    HashMap<String, String> UpperCasePluralLookupMap = new HashMap<String, String>();
    UpperCasePluralLookupMap.put("parameterMany", "new{0}");
    UpperCasePluralLookupMap.put("parameterAll", "all{0}");
    UpperCasePluralLookupMap.put("numberOfMethod", "numberOf{0}");
    UpperCasePluralLookupMap.put("minimumNumberOfMethod", "minimumNumberOf{0}");
    UpperCasePluralLookupMap.put("maximumNumberOfMethod", "maximumNumberOf{0}");
    UpperCasePluralLookupMap.put("isNumberOfValidMethod", "isNumberOf{0}Valid");
    UpperCasePluralLookupMap.put("parameterVerifiedMany", "verified{0}");
    UpperCasePluralLookupMap.put("parameterOldMany", "old{0}");
    UpperCasePluralLookupMap.put("parameterCheckNewMany", "checkNew{0}");
    UpperCasePluralLookupMap.put("parameterCopyOfMany", "copyOf{0}");
    UpperCasePluralLookupMap.put("getManyMethod", "get{0}");
    UpperCasePluralLookupMap.put("parameterMany", "new{0}");
    UpperCasePluralLookupMap.put("setManyMethod", "set{0}");
    UpperCasePluralLookupMap.put("didAddMany", "didAdd{0}");
    UpperCasePluralLookupMap.put("hasManyMethod", "has{0}");
    UpperCasePluralLookupMap.put("associationCanSetMany","canSet{0}");
    UpperCasePluralLookupMap.put("attributeCanSetMany","canSet{0}");
    UpperCasePluralLookupMap.put("requiredNumberOfMethod", "requiredNumberOf{0}");

    HashMap<String, String> AsIsSingularLookupMap = new HashMap<String, String>();
    AsIsSingularLookupMap.put("associationOne","{0}");
    AsIsSingularLookupMap.put("attributeOne","{0}");
    AsIsSingularLookupMap.put("stateMachineOne","{0}");
    AsIsSingularLookupMap.put("stateOne","{0}");
    AsIsSingularLookupMap.put("stateString","\"{0}\"");
    AsIsSingularLookupMap.put("eventMethod","{0}");
    AsIsSingularLookupMap.put("eventHandler", "{0}Handler");
        
    HashMap<String, String> AsIsPluralLookupMap = new HashMap<String, String>();
    AsIsPluralLookupMap.put("associationMany","{0}");
    AsIsPluralLookupMap.put("attributeMany","{0}");
    
    ArrayList<String> OneOrManyLookup = new ArrayList<String>();
    OneOrManyLookup.add("attribute");
    OneOrManyLookup.add("parameter");
    
    HashMap<String, String> testingCredentialsLookUpMap = new HashMap<String, String>();
    testingCredentialsLookUpMap.put("setAttString", "id123");
    testingCredentialsLookUpMap.put("getAttString", "id123");
    testingCredentialsLookUpMap.put("setAttInt", "123");
    testingCredentialsLookUpMap.put("getAttInt", "123");
    testingCredentialsLookUpMap.put("setAttInt", "");
    testingCredentialsLookUpMap.put("setAttFloat", "");
    testingCredentialsLookUpMap.put("setAttBoolean", "");
  }

  
}