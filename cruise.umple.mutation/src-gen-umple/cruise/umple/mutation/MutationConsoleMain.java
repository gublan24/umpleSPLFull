/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.mutation;
import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Arrays;
import cruise.umple.UmpleConsoleMain;
import joptsimple.*;

// line 6 "../../../../src/MutationConsoleMain.ump"
public class MutationConsoleMain
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MutationConsoleMain()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 19 "../../../../src/MutationConsoleMain.ump"
   public static  void main(String [] args){
    Thread.currentThread().setUncaughtExceptionHandler(new UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new UmpleExceptionHandler());
    OptionParser parser = new OptionParser();
		OptionSpec<Void> help = parser.acceptsAll(Arrays.asList("h","help"),"show help").forHelp();
        OptionSpec<String> generate = parser.accepts("generate").withRequiredArg();        
        OptionSpec<String> mutant = parser.accepts("mutant").withOptionalArg();
        OptionSpec<String> mutationType = parser.accepts("t").withRequiredArg();
        OptionSpec<String> mutationOperator = parser.accepts("p").withRequiredArg();
        OptionSpec<String> lang = parser.accepts("l").withRequiredArg();
        OptionSpec<String> numberOfMutants = parser.accepts("n").withRequiredArg();
        
        //OptionSet options = parser.parse("generate", "-t", "random", "-p", "full");
        OptionSet options = null;
        try {
         options = parser.parse(args);
        }
        catch(Exception e) {
        	if (e.toString().contains("generate"))
        	{
        		System.out.println(" Missing Umple model file! example: <umple_file>.ump");
        		return;
        	}
        	
        	if (e.toString().contains("l"))
        	{
        		System.out.println(" Missing language ! example: Java, Php, Ruby ..etc");
        		return;
        	}
        	
        	if (e.toString().contains("t"))
        	{
        		System.out.println(" Missing replacement type ! example: random, OneOptionalToMany, Integer ..etc , runy -h for more help !");
        		return;
        	}
        	
        	if (e.toString().contains("p"))
        	{
        		System.out.println(" Missing mutation operator ! example: full, OneOptionalToMany, Integer ..etc , runy -h for more help !");
        		return;
        	}
        		
        }
        
        try {
        options.valueOf(generate).equals(null);
    	
    		//System.out.println(" Missing Umple model file! example: <umple_file>.ump");    		    	
        }
        catch(Exception e) {
        	System.out.println(" Missing Umple model file! example: <umple_file>.ump");
        }
    	
        try {
            options.valueOf(lang).equals(null);
        	
        		//System.out.println(" Missing Umple model file! example: <umple_file>.ump");    		    	
            }
            catch(Exception e) {
            	System.out.println(" Missing language ! example: Java, Php, Ruby ..etc");
            	return;
            }
    	
        try {
            options.valueOf(mutationType).equals(null);
        	
        		//System.out.println(" Missing Umple model file! example: <umple_file>.ump");    		    	
            }
            catch(Exception e) {
            	System.out.println(" Missing replacement type ! example: random, OneOptionalToMany, Integer ..etc , runy -h for more help !");
        		return;
            }
    	
    	
        try {
            options.valueOf(mutationOperator).equals(null);
        	
        		//System.out.println(" Missing Umple model file! example: <umple_file>.ump");    		    	
            }
            catch(Exception e) {
            	System.out.println(" Missing mutation operator ! example: full, OneOptionalToMany, Integer ..etc , runy -h for more help !");
        		return;
            }
               
        //OptionSet options = parser.parse("-a", "apple", "-a", "berries", "-a", "mango");
        /*System.out.println("model name: ");
        System.out.println(options.valuesOf(generate));
        System.out.println(options.has(generate));
        System.out.println("Opetions: ");
        System.out.println(options.valueOf(mutationType));
        System.out.println(options.has(mutationType));
        System.out.println("Operator: ");
        System.out.println(options.valueOf(mutationOperator));
        System.out.println(options.has(mutationOperator));
        //# FIXME: improve commandline messages;
        System.out.println("Language: ");
        System.out.println(options.valueOf(lang));
        System.out.println(options.has(lang));*/
        if(options.has(help)) {
        	System.out.println("Please specify <umple_file> to process for mutation");
        	System.out.println("For more detailed information visit http://manual.umple.org");
        	System.out.println("#############################################################################################");
        	System.out.println("Example: java -jar umple.mutation.jar -generate model.ump -t random -p OneToMany -l Java   ");
        	System.out.println("#############################################################################################");
        	System.out.println("Option	    Description");
        	System.out.println("------	    -----------");
        	System.out.println("-help		Print help message");
        	System.out.println("-t			indicate the type of replacement for the  \n" + 
        					   "		          mutation : random, specific element: OptionalOneToMany, OneToMany, OptionalOneToOne, ManyToMany,\n"+
        					   "			  direction, Integer, String, Double, Float");
        	System.out.println("-p		 	indicate the targeted element to be mutated: ‘full’ or specific element.");
        	System.out.println("-l			the output language of the system to be generated: Java, ruby, Php (any system Umple accepts)  ");
        	System.out.println("-n			the number of mutants to be generated randomly  ");
        	

        }
        
        else {
        	      
        String path = "";
        path = Paths.get(".").toAbsolutePath().normalize().toString()+File.separator;
			//path = System.getProperty("user.dir")+File.separator+"cruise/umple/mutation/";
        	//path=(MutationConsoleMain.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath();		
        String modelName =options.valueOf(generate);
        String aLang=options.valueOf(lang);
        String replacementType = "";
        String muOperator = "";
        int mutantNumber = Integer.parseInt(options.valueOf(numberOfMutants));
        
        replacementType = (options.valueOf(mutationType)).toString();
        muOperator = (options.valueOf(mutationOperator)).toString();
        
                
        System.out.println("Replacement type used: "+replacementType);
        System.out.println("Targeted mutation operator : "+muOperator);
        try {
        for (int x = 1 ; x<= mutantNumber ; x++)
        {
        MutationSuite ms = new MutationSuite(null,0, "", "",x);	        	
        ms.prepare(path, modelName, aLang,replacementType,muOperator);
        System.out.println("Model mutated successfully !");
        
        }
        
        }
        catch(Exception e) {
        	System.out.println("Failed to mutate: "+ e.getMessage());
        	
        }
        /*****
        // Run Diff on original model against the mutated one to find changes.
        try {
         
			Runtime.getRuntime().exec("diff " + modelName +" "+ mutationType+File.separator+mutationType+"Mutation_"+modelName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
        }
  }

  public static class UmpleExceptionHandler implements Thread.UncaughtExceptionHandler
  {
    public void uncaughtException(Thread t, Throwable e)
    {
      translate(e);
      if(e.getCause()!=null)
      {
        translate(e.getCause());
      }
      e.printStackTrace();
    }
    public void translate(Throwable e)
    {
      java.util.List<StackTraceElement> result = new java.util.ArrayList<StackTraceElement>();
      StackTraceElement[] elements = e.getStackTrace();
      try
      {
        for(StackTraceElement element:elements)
        {
          String className = element.getClassName();
          String methodName = element.getMethodName();
          boolean methodFound = false;
          int index = className.lastIndexOf('.')+1;
          try {
            java.lang.reflect.Method query = this.getClass().getMethod(className.substring(index)+"_"+methodName,new Class[]{});
            UmpleSourceData sourceInformation = (UmpleSourceData)query.invoke(this,new Object[]{});
            for(int i=0;i<sourceInformation.size();++i)
            {
              // To compensate for any offsets caused by injected code we need to loop through the other references to this function
              //  and adjust the start / length of the function.
              int functionStart = sourceInformation.getJavaLine(i) + (("main".equals(methodName))?3:1);
              int functionEnd = functionStart + sourceInformation.getLength(i);
              int afterInjectionLines = 0;
              //  We can leverage the fact that all inject statements are added to the uncaught exception list 
              //   before the functions that they are within
              for (int j = 0; j < i; j++) {
                if (sourceInformation.getJavaLine(j) - 1 >= functionStart &&
                    sourceInformation.getJavaLine(j) - 1 <= functionEnd &&
                    sourceInformation.getJavaLine(j) - 1 <= element.getLineNumber()) {
                    // A before injection, +2 for the comments surrounding the injected code
                    if (sourceInformation.getJavaLine(j) - 1 == functionStart) {
                        functionStart += sourceInformation.getLength(j) + 2;
                        functionEnd += sourceInformation.getLength(j) + 2;
                    } else {
                        // An after injection
                        afterInjectionLines += sourceInformation.getLength(j) + 2;
                        functionEnd += sourceInformation.getLength(j) + 2;
                    }
                }
              }
              int distanceFromStart = element.getLineNumber() - functionStart - afterInjectionLines;
              if(distanceFromStart>=0&&distanceFromStart<=sourceInformation.getLength(i))
              {
                result.add(new StackTraceElement(element.getClassName(),element.getMethodName(),sourceInformation.getFileName(i),sourceInformation.getUmpleLine(i)+distanceFromStart));
                methodFound = true;
                break;
              }
            }
          }
          catch (Exception e2){}
          if(!methodFound)
          {
            result.add(element);
          }
        }
      }
      catch (Exception e1)
      {
        e1.printStackTrace();
      }
      e.setStackTrace(result.toArray(new StackTraceElement[0]));
    }
  //The following methods Map Java lines back to their original Umple file / line    
    public UmpleSourceData MutationSuite_mutateAssociationOneToN(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(503).setJavaLines(965).setLengths(8);}
    public UmpleSourceData MutationSuite_prepare(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1379).setJavaLines(1846).setLengths(131);}
    public UmpleSourceData MutationSuite_addMutatedFile(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1125).setJavaLines(1594).setLengths(19);}
    public UmpleSourceData MutationSuite_readUseFilesCode(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1201).setJavaLines(1667).setLengths(23);}
    public UmpleSourceData MutationSuite_createUmpleMutationSystem(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1517).setJavaLines(1983).setLengths(90);}
    public UmpleSourceData MutationSuite_mutateExtraCodeOperatorBiggerThan(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1061).setJavaLines(1523).setLengths(17);}
    public UmpleSourceData MutationSuite_generateRelatedFiles(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1728).setJavaLines(2194).setLengths(78);}
    public UmpleSourceData MutationSuite_mutateAttributeTypedInteger(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(643).setJavaLines(1105).setLengths(63);}
    public UmpleSourceData MutationSuite_mutateAssociationOneToNN(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(515).setJavaLines(977).setLengths(59);}
    public UmpleSourceData MutationSuite_analyzeModelFiles(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1240).setJavaLines(1706).setLengths(48);}
    public UmpleSourceData MutationSuite_mutateExtraCodeOperatorEqual(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1103).setJavaLines(1569).setLengths(17);}
    public UmpleSourceData MutationSuite_mutateAttributeLazy(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1019).setJavaLines(1481).setLengths(17);}
    public UmpleSourceData MutationSuite_mutateAttributeTypedDouble(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(790).setJavaLines(1252).setLengths(75);}
    public UmpleSourceData MutationSuite_readModelFile(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1700).setJavaLines(2165).setLengths(25);}
    public UmpleSourceData MutationSuite_modifyModelCode(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1292).setJavaLines(1758).setLengths(53);}
    public UmpleSourceData MutationSuite_mutateAssociationOneToOptionalOne(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(266).setJavaLines(729).setLengths(65);}
    public UmpleSourceData MutationSuite_mutateConstraintsBiggerEq(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(869).setJavaLines(1331).setLengths(71);}
    public UmpleSourceData MutationSuite_modifyModelNameSpace(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1349).setJavaLines(1815).setLengths(14);}
    public UmpleSourceData MutationSuite_writeFile(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1149).setJavaLines(1617).setLengths(41);}
    public UmpleSourceData MutationSuite_mutate(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(14).setJavaLines(477).setLengths(180);}
    public UmpleSourceData MutationSuite_mutateAttributeImmutable(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1040).setJavaLines(1502).setLengths(17);}
    public UmpleSourceData MutationSuite_mutateAssociationDirectionality(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(408).setJavaLines(871).setLengths(90);}
    public UmpleSourceData MutationSuite_writeMutatedUseFiles(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1228).setJavaLines(1694).setLengths(8);}
    public UmpleSourceData MutationSuite_mutateExtraCodeOperatorSmallerThan(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1082).setJavaLines(1544).setLengths(17);}
    public UmpleSourceData MutationSuite_mutateAssociationOneToMany(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(203).setJavaLines(666).setLengths(59);}
    public UmpleSourceData MutationSuite_modifyModelUseStatements(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1367).setJavaLines(1833).setLengths(7);}
    public UmpleSourceData MutationSuite_createUmpleMutationsystemFinal(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1610).setJavaLines(2077).setLengths(84);}
    public UmpleSourceData MutationSuite_mutateAttributeTypedString(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(578).setJavaLines(1040).setLengths(61);}
    public UmpleSourceData MutationSuite_mutateAssociationOptionalOneToMany(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(335).setJavaLines(798).setLengths(69);}
    public UmpleSourceData MutationSuite_mutateConstraintsBigger(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(944).setJavaLines(1406).setLengths(71);}
    public UmpleSourceData MutationSuite_preprocessFiles(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(1197).setJavaLines(1662).setLengths(1);}
    public UmpleSourceData MutationSuite_mutateAttributeTypedFloat(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(710).setJavaLines(1172).setLengths(76);}
    public UmpleSourceData MutationSuite_generateMuCode(){ return new UmpleSourceData().setFileNames("MutationSuite_code.ump").setUmpleLines(198).setJavaLines(661).setLengths(1);}
    public UmpleSourceData MutationConsoleMain_main(){ return new UmpleSourceData().setFileNames("MutationConsoleMain.ump").setUmpleLines(18).setJavaLines(34).setLengths(157);}

  }
  public static class UmpleSourceData
  {
    String[] umpleFileNames;
    Integer[] umpleLines;
    Integer[] umpleJavaLines;
    Integer[] umpleLengths;
    
    public UmpleSourceData(){
    }
    public String getFileName(int i){
      return umpleFileNames[i];
    }
    public Integer getUmpleLine(int i){
      return umpleLines[i];
    }
    public Integer getJavaLine(int i){
      return umpleJavaLines[i];
    }
    public Integer getLength(int i){
      return umpleLengths[i];
    }
    public UmpleSourceData setFileNames(String... filenames){
      umpleFileNames = filenames;
      return this;
    }
    public UmpleSourceData setUmpleLines(Integer... umplelines){
      umpleLines = umplelines;
      return this;
    }
    public UmpleSourceData setJavaLines(Integer... javalines){
      umpleJavaLines = javalines;
      return this;
    }
    public UmpleSourceData setLengths(Integer... lengths){
      umpleLengths = lengths;
      return this;
    }
    public int size(){
      return umpleFileNames.length;
    }
  }
}