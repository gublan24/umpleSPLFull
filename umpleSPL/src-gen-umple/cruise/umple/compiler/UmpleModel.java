/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import cruise.umple.analysis.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;
import cruise.umple.parser.*;
import cruise.umple.parser.analysis.*;
import java.util.zip.*;
import java.util.*;

/**
 * Copyright: All contributers to the Umple Project
 * 
 * This file is made available subject to the open source license found at:
 * http://umple.org/license
 * 
 * Mixset meta-model
 * Copyright: All contributers to the Umple Project
 * 
 * This file is made available subject to the open source license found at:
 * http://umple.org/license
 * 
 * Feature diagram meta-model
 * A FeatureDiagram stores information required to build a feature diagram in Umple
 * Fragment source file: Umple_Code.ump
 * Line : 212
 * Fragment source file: Umple_Code.ump
 * Line : 562
 * Fragment source file: Umple_Code.ump
 * Line : 571
 * ---------------------------------------------------------------------------------------------
 * ------------------------------------class start----------------------------------------------
 * ---------------------------------------------------------------------------------------------
 * Fragment source file: Umple_Code.ump
 * Line : 360
 * Fragment source file: Umple_CodeClass.ump
 * Line : 72
 * Fragment source file: Umple_CodeClass.ump
 * Line : 46
 * Fragment source file: Umple_Code_Filter.ump
 * Line : 207
 * 
 * NEW CLASS****************************************
 * 
 * Fragment source file: Umple.ump
 * Line : 102
 * The Umple Traits contained within the model.
 * Class UmpleModel is the central class describing the system being compiled.
 * 
 * The model contains everything that was derived from an Umple file (.ump) when it was parsed such as
 * the classes, attributes, associations, state machines, methods, etc that were in it.
 * 
 * Put another way, when an Umple file (.ump) is parsed an Umple model is populated with everything that was parsed from that file.
 * 
 * Because of this it is absolutely critical to understand the model since it is basically the "root" of everything.
 * use Method;
 * use Class;
 * use Association;
 * use Constraint;
 * 
 * In Umple_Code.ump: Methods for manipulating the Model
 */
// line 12 "../../../../src/Mixset.ump"
// line 14 "../../../../src/FeatureModel.ump"
// line 3 "../../../../src/Umple_Code_StateMachine.ump"
// line 4 "../../../../src/Umple_Code_Filter.ump"
// line 159 "../../../../src/Umple_Code_Filter.ump"
// line 1 "../../../../src/Filter_refactored.ump"
// line 6 "../../../../src/Umple_Code_Trait.ump"
// line 3 "../../../../src/Umple_CodeClass.ump"
// line 102 "../../../../src/Umple_CodeCoordinate.ump"
// line 627 "../../../../src/Association_refactored.ump"
// line 657 "../../../../src/Association_refactored.ump"
// line 694 "../../../../src/Association_refactored.ump"
// line 7 "../../../../src/UmpleInternalParser_CodeTrait.ump"
// line 149 "../../../../src/Trait_refactored.ump"
// line 234 "../../../../src/Trait_refactored.ump"
// line 18 "../../../../src/UmpleFilterModel.ump"
// line 18 "../../../../src/UmpleInternalParser_CodeMixset.ump"
// line 29 "../../../../src/Umple.ump"
// line 13 "../../../../src/UmpleVersion.ump"
// line 22 "../../../../src/Umple_Code.ump"
// line 17 "../../../../src/Trace.ump"
public class UmpleModel implements Runnable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String VERSION_NUMBER = "@UMPLE_VERSION@";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleModel Attributes
  private UmpleFile umpleFile;
  private boolean distributeOn;
  private boolean distributeForced;
  private boolean distributed;
  private boolean skipcompile;
  private boolean skipjavacompile;
  private boolean skipcppcompile;
  private boolean skiprubycompile;
  private boolean skipphpcompile;
  private int distributePattern;
  private String distributeTechnology;
  private String defaultPackage;
  private List<GenerateTarget> generates;
  private boolean shouldGenerate;
  private Glossary glossary;
  private String defaultNamespace;
  private String code;
  private UmpleClass mainClass;
  private boolean debugMode;
  private ParseResult lastResult;
  private Map<String,String> generatedCode;
  private Map<String,Analyzer> analyzers;

  /**
   * data for default class positioning
   */
  private Coordinate levelOffset;
  private Coordinate initialOffset;
  private Coordinate classSize;
  private int maxYLevels;
  private List<CodeBlock> extraCodes;

  /**
   * data for default association positioning
   */
  private Coordinate offsetFromEdge;
  private int reflexiveSegmentLength;
  private List<File> linkedFiles;
  private double parsingTime;
  private double gTime1;
  private double gTime2;
  private Map<String,String> hashMap;
  private TracerDirective tracer;

  //UmpleModel Associations
  private List<MixsetOrFile> mixsetOrFiles;
  private FeatureModel featureModel;
  private List<UmpleTrait> umpleTraits;
  private List<Filter> filters;
  private List<UmpleEnumeration> enums;
  private List<Association> associations;
  private List<UmpleClass> umpleClasses;
  private List<UmpleInterface> umpleInterfaces;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleModel(UmpleFile aUmpleFile)
  {
    umpleFile = aUmpleFile;
    distributeOn = true;
    distributeForced = false;
    distributed = false;
    skipcompile = false;
    skipjavacompile = false;
    skipcppcompile = false;
    skiprubycompile = false;
    skipphpcompile = false;
    distributePattern = 0;
    distributeTechnology = "RMI";
    defaultPackage = null;
    generates = new ArrayList<GenerateTarget>();
    shouldGenerate = true;
    glossary = new Glossary();
    defaultNamespace = null;
    code = null;
    mainClass = null;
    debugMode = false;
    lastResult = null;
    generatedCode = new HashMap<String,String>();
    analyzers = new HashMap<String,Analyzer>();
    levelOffset = new Coordinate(200,100,0,0);
    initialOffset = new Coordinate(50,30,0,0);
    classSize = new Coordinate(0,0,109,45);
    maxYLevels = 5;
    extraCodes = new ArrayList<CodeBlock>();
    offsetFromEdge = new Coordinate(10,30,0,0);
    reflexiveSegmentLength = 15;
    linkedFiles = new ArrayList<File>();
    parsingTime = 0.0;
    gTime1 = 0.0;
    gTime2 = 0.0;
    hashMap = new HashMap<String, String>();
    tracer = new TracerDirective("console");
    mixsetOrFiles = new ArrayList<MixsetOrFile>();
    umpleTraits = new ArrayList<UmpleTrait>();
    filters = new ArrayList<Filter>();
    enums = new ArrayList<UmpleEnumeration>();
    associations = new ArrayList<Association>();
    umpleClasses = new ArrayList<UmpleClass>();
    umpleInterfaces = new ArrayList<UmpleInterface>();
    // line 78 "../../../../src/Umple_Code.ump"
    if(aUmpleFile!=null){
          String[] linkedFilenames = aUmpleFile.getLinkedFiles().split("use");
          
          for( String filename : linkedFilenames ){
            // Remove blankspace and newlines
            filename = filename.trim();
            // Create a file from the name, removing the last ';' from the string
            if( filename.length()>1 ){
              this.linkedFiles.add(new File(filename.substring(0,filename.length()-1)));
            }
          }
        }
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUmpleFile(UmpleFile aUmpleFile)
  {
    boolean wasSet = false;
    umpleFile = aUmpleFile;
    wasSet = true;
    return wasSet;
  }

  public boolean setDistributeOn(boolean aDistributeOn)
  {
    boolean wasSet = false;
    distributeOn = aDistributeOn;
    wasSet = true;
    return wasSet;
  }

  public boolean setDistributeForced(boolean aDistributeForced)
  {
    boolean wasSet = false;
    distributeForced = aDistributeForced;
    wasSet = true;
    return wasSet;
  }

  public boolean setDistributed(boolean aDistributed)
  {
    boolean wasSet = false;
    distributed = aDistributed;
    wasSet = true;
    return wasSet;
  }

  public boolean setSkipcompile(boolean aSkipcompile)
  {
    boolean wasSet = false;
    skipcompile = aSkipcompile;
    wasSet = true;
    return wasSet;
  }

  public boolean setSkipjavacompile(boolean aSkipjavacompile)
  {
    boolean wasSet = false;
    skipjavacompile = aSkipjavacompile;
    wasSet = true;
    return wasSet;
  }

  public boolean setSkipcppcompile(boolean aSkipcppcompile)
  {
    boolean wasSet = false;
    skipcppcompile = aSkipcppcompile;
    wasSet = true;
    return wasSet;
  }

  public boolean setSkiprubycompile(boolean aSkiprubycompile)
  {
    boolean wasSet = false;
    skiprubycompile = aSkiprubycompile;
    wasSet = true;
    return wasSet;
  }

  public boolean setSkipphpcompile(boolean aSkipphpcompile)
  {
    boolean wasSet = false;
    skipphpcompile = aSkipphpcompile;
    wasSet = true;
    return wasSet;
  }

  public boolean setDistributePattern(int aDistributePattern)
  {
    boolean wasSet = false;
    distributePattern = aDistributePattern;
    wasSet = true;
    return wasSet;
  }

  public boolean setDistributeTechnology(String aDistributeTechnology)
  {
    boolean wasSet = false;
    distributeTechnology = aDistributeTechnology;
    wasSet = true;
    return wasSet;
  }

  public boolean setDefaultPackage(String aDefaultPackage)
  {
    boolean wasSet = false;
    defaultPackage = aDefaultPackage;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addGenerate(GenerateTarget aGenerate)
  {
    boolean wasAdded = false;
    wasAdded = generates.add(aGenerate);
    return wasAdded;
  }

  public boolean removeGenerate(GenerateTarget aGenerate)
  {
    boolean wasRemoved = false;
    wasRemoved = generates.remove(aGenerate);
    return wasRemoved;
  }

  public boolean setShouldGenerate(boolean aShouldGenerate)
  {
    boolean wasSet = false;
    shouldGenerate = aShouldGenerate;
    wasSet = true;
    return wasSet;
  }

  public boolean setGlossary(Glossary aGlossary)
  {
    boolean wasSet = false;
    glossary = aGlossary;
    wasSet = true;
    return wasSet;
  }

  public boolean setDefaultNamespace(String aDefaultNamespace)
  {
    boolean wasSet = false;
    defaultNamespace = aDefaultNamespace;
    wasSet = true;
    return wasSet;
  }

  public boolean setCode(String aCode)
  {
    boolean wasSet = false;
    code = aCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setMainClass(UmpleClass aMainClass)
  {
    boolean wasSet = false;
    mainClass = aMainClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setDebugMode(boolean aDebugMode)
  {
    boolean wasSet = false;
    debugMode = aDebugMode;
    wasSet = true;
    return wasSet;
  }

  public boolean setLastResult(ParseResult aLastResult)
  {
    boolean wasSet = false;
    lastResult = aLastResult;
    wasSet = true;
    return wasSet;
  }

  public boolean setGeneratedCode(Map<String,String> aGeneratedCode)
  {
    boolean wasSet = false;
    generatedCode = aGeneratedCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setAnalyzers(Map<String,Analyzer> aAnalyzers)
  {
    boolean wasSet = false;
    analyzers = aAnalyzers;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addExtraCode(CodeBlock aExtraCode)
  {
    boolean wasAdded = false;
    wasAdded = extraCodes.add(aExtraCode);
    return wasAdded;
  }

  public boolean removeExtraCode(CodeBlock aExtraCode)
  {
    boolean wasRemoved = false;
    wasRemoved = extraCodes.remove(aExtraCode);
    return wasRemoved;
  }

  public boolean setParsingTime(double aParsingTime)
  {
    boolean wasSet = false;
    parsingTime = aParsingTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setHashMap(Map<String,String> aHashMap)
  {
    boolean wasSet = false;
    hashMap = aHashMap;
    wasSet = true;
    return wasSet;
  }

  public boolean setTracer(TracerDirective aTracer)
  {
    boolean wasSet = false;
    tracer = aTracer;
    wasSet = true;
    return wasSet;
  }

  /**
   * The Umple file (.ump) that was used to populate the model.
   */
  public UmpleFile getUmpleFile()
  {
    return umpleFile;
  }

  /**
   * Variables used for distributed code control
   */
  public boolean getDistributeOn()
  {
    return distributeOn;
  }

  public boolean getDistributeForced()
  {
    return distributeForced;
  }

  public boolean getDistributed()
  {
    return distributed;
  }

  /**
   * Variables used to advise not to bother trying to compile various language
   * because the code doesn't contain coherent or complete code.
   * These are set to true when various @@@skip directives are found in comments
   */
  public boolean getSkipcompile()
  {
    return skipcompile;
  }

  public boolean getSkipjavacompile()
  {
    return skipjavacompile;
  }

  public boolean getSkipcppcompile()
  {
    return skipcppcompile;
  }

  public boolean getSkiprubycompile()
  {
    return skiprubycompile;
  }

  public boolean getSkipphpcompile()
  {
    return skipphpcompile;
  }

  public int getDistributePattern()
  {
    return distributePattern;
  }

  public String getDistributeTechnology()
  {
    return distributeTechnology;
  }

  public String getDefaultPackage()
  {
    return defaultPackage;
  }
  /* Code from template attribute_GetMany */
  public GenerateTarget getGenerate(int index)
  {
    GenerateTarget aGenerate = generates.get(index);
    return aGenerate;
  }

  public GenerateTarget[] getGenerates()
  {
    GenerateTarget[] newGenerates = generates.toArray(new GenerateTarget[generates.size()]);
    return newGenerates;
  }

  public int numberOfGenerates()
  {
    int number = generates.size();
    return number;
  }

  public boolean hasGenerates()
  {
    boolean has = generates.size() > 0;
    return has;
  }

  public int indexOfGenerate(GenerateTarget aGenerate)
  {
    int index = generates.indexOf(aGenerate);
    return index;
  }

  public boolean getShouldGenerate()
  {
    return shouldGenerate;
  }

  public Glossary getGlossary()
  {
    return glossary;
  }

  public String getDefaultNamespace()
  {
    return defaultNamespace;
  }

  public String getCode()
  {
    return code;
  }

  public UmpleClass getMainClass()
  {
    return mainClass;
  }

  public boolean getDebugMode()
  {
    return debugMode;
  }

  public ParseResult getLastResult()
  {
    return lastResult;
  }

  public Map<String,String> getGeneratedCode()
  {
    return generatedCode;
  }

  public Map<String,Analyzer> getAnalyzers()
  {
    return analyzers;
  }
  /* Code from template attribute_GetMany */
  public CodeBlock getExtraCode(int index)
  {
    CodeBlock aExtraCode = extraCodes.get(index);
    return aExtraCode;
  }

  public CodeBlock[] getExtraCodes()
  {
    CodeBlock[] newExtraCodes = extraCodes.toArray(new CodeBlock[extraCodes.size()]);
    return newExtraCodes;
  }

  public int numberOfExtraCodes()
  {
    int number = extraCodes.size();
    return number;
  }

  public boolean hasExtraCodes()
  {
    boolean has = extraCodes.size() > 0;
    return has;
  }

  public int indexOfExtraCode(CodeBlock aExtraCode)
  {
    int index = extraCodes.indexOf(aExtraCode);
    return index;
  }

  /**
   * ParsingTime represents Parsing end time
   * gTime1 represents code generation start time
   * gTime2 represents code generation end time
   */
  public double getParsingTime()
  {
    return parsingTime;
  }

  public Map<String,String> getHashMap()
  {
    return hashMap;
  }

  public String getTraceType()
  {
    return getTracer().getName();
  }

  public TracerDirective getTracer()
  {
    return tracer;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isDistributeOn()
  {
    return distributeOn;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isDistributeForced()
  {
    return distributeForced;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isDistributed()
  {
    return distributed;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isSkipcompile()
  {
    return skipcompile;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isSkipjavacompile()
  {
    return skipjavacompile;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isSkipcppcompile()
  {
    return skipcppcompile;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isSkiprubycompile()
  {
    return skiprubycompile;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isSkipphpcompile()
  {
    return skipphpcompile;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isShouldGenerate()
  {
    return shouldGenerate;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isDebugMode()
  {
    return debugMode;
  }
  /* Code from template association_GetMany */
  public MixsetOrFile getMixsetOrFile(int index)
  {
    MixsetOrFile aMixsetOrFile = mixsetOrFiles.get(index);
    return aMixsetOrFile;
  }

  /**
   * This mixin adds the complete set of Mixsets and files to the
   * model.
   */
  public List<MixsetOrFile> getMixsetOrFiles()
  {
    List<MixsetOrFile> newMixsetOrFiles = Collections.unmodifiableList(mixsetOrFiles);
    return newMixsetOrFiles;
  }

  public int numberOfMixsetOrFiles()
  {
    int number = mixsetOrFiles.size();
    return number;
  }

  public boolean hasMixsetOrFiles()
  {
    boolean has = mixsetOrFiles.size() > 0;
    return has;
  }

  public int indexOfMixsetOrFile(MixsetOrFile aMixsetOrFile)
  {
    int index = mixsetOrFiles.indexOf(aMixsetOrFile);
    return index;
  }
  /* Code from template association_GetOne */
  public FeatureModel getFeatureModel()
  {
    return featureModel;
  }

  public boolean hasFeatureModel()
  {
    boolean has = featureModel != null;
    return has;
  }
  /* Code from template association_GetMany */
  public UmpleTrait getUmpleTrait(int index)
  {
    UmpleTrait aUmpleTrait = umpleTraits.get(index);
    return aUmpleTrait;
  }

  public List<UmpleTrait> getUmpleTraits()
  {
    List<UmpleTrait> newUmpleTraits = Collections.unmodifiableList(umpleTraits);
    return newUmpleTraits;
  }

  public int numberOfUmpleTraits()
  {
    int number = umpleTraits.size();
    return number;
  }

  public boolean hasUmpleTraits()
  {
    boolean has = umpleTraits.size() > 0;
    return has;
  }

  public int indexOfUmpleTrait(UmpleTrait aUmpleTrait)
  {
    int index = umpleTraits.indexOf(aUmpleTrait);
    return index;
  }
  /* Code from template association_GetMany */
  public Filter getFilter(int index)
  {
    Filter aFilter = filters.get(index);
    return aFilter;
  }

  /**
   * Right now, a model can only have 1 diagram
   */
  public List<Filter> getFilters()
  {
    List<Filter> newFilters = Collections.unmodifiableList(filters);
    return newFilters;
  }

  public int numberOfFilters()
  {
    int number = filters.size();
    return number;
  }

  public boolean hasFilters()
  {
    boolean has = filters.size() > 0;
    return has;
  }

  public int indexOfFilter(Filter aFilter)
  {
    int index = filters.indexOf(aFilter);
    return index;
  }
  /* Code from template association_GetMany */
  public UmpleEnumeration getEnum(int index)
  {
    UmpleEnumeration aEnum = enums.get(index);
    return aEnum;
  }

  /**
   * The Umple Enumerations contained within the model
   */
  public List<UmpleEnumeration> getEnums()
  {
    List<UmpleEnumeration> newEnums = Collections.unmodifiableList(enums);
    return newEnums;
  }

  public int numberOfEnums()
  {
    int number = enums.size();
    return number;
  }

  public boolean hasEnums()
  {
    boolean has = enums.size() > 0;
    return has;
  }

  public int indexOfEnum(UmpleEnumeration aEnum)
  {
    int index = enums.indexOf(aEnum);
    return index;
  }
  /* Code from template association_GetMany */
  public Association getAssociation(int index)
  {
    Association aAssociation = associations.get(index);
    return aAssociation;
  }

  /**
   * The Associations contained within the model.
   */
  public List<Association> getAssociations()
  {
    List<Association> newAssociations = Collections.unmodifiableList(associations);
    return newAssociations;
  }

  public int numberOfAssociations()
  {
    int number = associations.size();
    return number;
  }

  public boolean hasAssociations()
  {
    boolean has = associations.size() > 0;
    return has;
  }

  public int indexOfAssociation(Association aAssociation)
  {
    int index = associations.indexOf(aAssociation);
    return index;
  }
  /* Code from template association_GetMany */
  public UmpleClass getUmpleClass(int index)
  {
    UmpleClass aUmpleClass = umpleClasses.get(index);
    return aUmpleClass;
  }

  /**
   * The Umple Classes contained within the model.
   */
  public List<UmpleClass> getUmpleClasses()
  {
    List<UmpleClass> newUmpleClasses = Collections.unmodifiableList(umpleClasses);
    return newUmpleClasses;
  }

  public int numberOfUmpleClasses()
  {
    int number = umpleClasses.size();
    return number;
  }

  public boolean hasUmpleClasses()
  {
    boolean has = umpleClasses.size() > 0;
    return has;
  }

  public int indexOfUmpleClass(UmpleClass aUmpleClass)
  {
    int index = umpleClasses.indexOf(aUmpleClass);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_umpleClasses()
  {
    umpleClasses.clear();
  }
  /* Code from template association_GetMany */
  public UmpleInterface getUmpleInterface(int index)
  {
    UmpleInterface aUmpleInterface = umpleInterfaces.get(index);
    return aUmpleInterface;
  }

  /**
   * The Umple interfaces contained within the model.
   */
  public List<UmpleInterface> getUmpleInterfaces()
  {
    List<UmpleInterface> newUmpleInterfaces = Collections.unmodifiableList(umpleInterfaces);
    return newUmpleInterfaces;
  }

  public int numberOfUmpleInterfaces()
  {
    int number = umpleInterfaces.size();
    return number;
  }

  public boolean hasUmpleInterfaces()
  {
    boolean has = umpleInterfaces.size() > 0;
    return has;
  }

  public int indexOfUmpleInterface(UmpleInterface aUmpleInterface)
  {
    int index = umpleInterfaces.indexOf(aUmpleInterface);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMixsetOrFiles()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addMixsetOrFile(MixsetOrFile aMixsetOrFile)
  {
    boolean wasAdded = false;
    if (mixsetOrFiles.contains(aMixsetOrFile)) { return false; }
    UmpleModel existingUmpleModel = aMixsetOrFile.getUmpleModel();
    if (existingUmpleModel == null)
    {
      aMixsetOrFile.setUmpleModel(this);
    }
    else if (!this.equals(existingUmpleModel))
    {
      existingUmpleModel.removeMixsetOrFile(aMixsetOrFile);
      addMixsetOrFile(aMixsetOrFile);
    }
    else
    {
      mixsetOrFiles.add(aMixsetOrFile);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMixsetOrFile(MixsetOrFile aMixsetOrFile)
  {
    boolean wasRemoved = false;
    if (mixsetOrFiles.contains(aMixsetOrFile))
    {
      mixsetOrFiles.remove(aMixsetOrFile);
      aMixsetOrFile.setUmpleModel(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMixsetOrFileAt(MixsetOrFile aMixsetOrFile, int index)
  {  
    boolean wasAdded = false;
    if(addMixsetOrFile(aMixsetOrFile))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMixsetOrFiles()) { index = numberOfMixsetOrFiles() - 1; }
      mixsetOrFiles.remove(aMixsetOrFile);
      mixsetOrFiles.add(index, aMixsetOrFile);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMixsetOrFileAt(MixsetOrFile aMixsetOrFile, int index)
  {
    boolean wasAdded = false;
    if(mixsetOrFiles.contains(aMixsetOrFile))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMixsetOrFiles()) { index = numberOfMixsetOrFiles() - 1; }
      mixsetOrFiles.remove(aMixsetOrFile);
      mixsetOrFiles.add(index, aMixsetOrFile);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMixsetOrFileAt(aMixsetOrFile, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToOptionalOne */
  public boolean setFeatureModel(FeatureModel aNewFeatureModel)
  {
    boolean wasSet = false;
    if (aNewFeatureModel == null)
    {
      FeatureModel existingFeatureModel = featureModel;
      featureModel = null;
      
      if (existingFeatureModel != null && existingFeatureModel.getUmpleModel() != null)
      {
        existingFeatureModel.setUmpleModel(null);
      }
      wasSet = true;
      return wasSet;
    }

    FeatureModel currentFeatureModel = getFeatureModel();
    if (currentFeatureModel != null && !currentFeatureModel.equals(aNewFeatureModel))
    {
      currentFeatureModel.setUmpleModel(null);
    }

    featureModel = aNewFeatureModel;
    UmpleModel existingUmpleModel = aNewFeatureModel.getUmpleModel();

    if (!equals(existingUmpleModel))
    {
      aNewFeatureModel.setUmpleModel(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmpleTraits()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addUmpleTrait(UmpleTrait aUmpleTrait)
  {
    boolean wasAdded = false;
    if (umpleTraits.contains(aUmpleTrait)) { return false; }
    umpleTraits.add(aUmpleTrait);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUmpleTrait(UmpleTrait aUmpleTrait)
  {
    boolean wasRemoved = false;
    if (umpleTraits.contains(aUmpleTrait))
    {
      umpleTraits.remove(aUmpleTrait);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmpleTraitAt(UmpleTrait aUmpleTrait, int index)
  {  
    boolean wasAdded = false;
    if(addUmpleTrait(aUmpleTrait))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleTraits()) { index = numberOfUmpleTraits() - 1; }
      umpleTraits.remove(aUmpleTrait);
      umpleTraits.add(index, aUmpleTrait);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmpleTraitAt(UmpleTrait aUmpleTrait, int index)
  {
    boolean wasAdded = false;
    if(umpleTraits.contains(aUmpleTrait))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleTraits()) { index = numberOfUmpleTraits() - 1; }
      umpleTraits.remove(aUmpleTrait);
      umpleTraits.add(index, aUmpleTrait);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmpleTraitAt(aUmpleTrait, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFilters()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addFilter(Filter aFilter)
  {
    boolean wasAdded = false;
    if (filters.contains(aFilter)) { return false; }
    filters.add(aFilter);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeFilter(Filter aFilter)
  {
    boolean wasRemoved = false;
    if (filters.contains(aFilter))
    {
      filters.remove(aFilter);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFilterAt(Filter aFilter, int index)
  {  
    boolean wasAdded = false;
    if(addFilter(aFilter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFilters()) { index = numberOfFilters() - 1; }
      filters.remove(aFilter);
      filters.add(index, aFilter);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFilterAt(Filter aFilter, int index)
  {
    boolean wasAdded = false;
    if(filters.contains(aFilter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFilters()) { index = numberOfFilters() - 1; }
      filters.remove(aFilter);
      filters.add(index, aFilter);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFilterAt(aFilter, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEnums()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addEnum(UmpleEnumeration aEnum)
  {
    boolean wasAdded = false;
    if (enums.contains(aEnum)) { return false; }
    enums.add(aEnum);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEnum(UmpleEnumeration aEnum)
  {
    boolean wasRemoved = false;
    if (enums.contains(aEnum))
    {
      enums.remove(aEnum);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEnumAt(UmpleEnumeration aEnum, int index)
  {  
    boolean wasAdded = false;
    if(addEnum(aEnum))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEnums()) { index = numberOfEnums() - 1; }
      enums.remove(aEnum);
      enums.add(index, aEnum);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEnumAt(UmpleEnumeration aEnum, int index)
  {
    boolean wasAdded = false;
    if(enums.contains(aEnum))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEnums()) { index = numberOfEnums() - 1; }
      enums.remove(aEnum);
      enums.add(index, aEnum);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEnumAt(aEnum, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAssociations()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addAssociation(Association aAssociation)
  {
    boolean wasAdded = false;
    if (associations.contains(aAssociation)) { return false; }
    associations.add(aAssociation);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAssociation(Association aAssociation)
  {
    boolean wasRemoved = false;
    if (associations.contains(aAssociation))
    {
      associations.remove(aAssociation);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAssociationAt(Association aAssociation, int index)
  {  
    boolean wasAdded = false;
    if(addAssociation(aAssociation))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociations()) { index = numberOfAssociations() - 1; }
      associations.remove(aAssociation);
      associations.add(index, aAssociation);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAssociationAt(Association aAssociation, int index)
  {
    boolean wasAdded = false;
    if(associations.contains(aAssociation))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociations()) { index = numberOfAssociations() - 1; }
      associations.remove(aAssociation);
      associations.add(index, aAssociation);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAssociationAt(aAssociation, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmpleClasses()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasAdded = false;
    if (umpleClasses.contains(aUmpleClass)) { return false; }
    umpleClasses.add(aUmpleClass);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasRemoved = false;
    if (umpleClasses.contains(aUmpleClass))
    {
      umpleClasses.remove(aUmpleClass);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmpleClassAt(UmpleClass aUmpleClass, int index)
  {  
    boolean wasAdded = false;
    if(addUmpleClass(aUmpleClass))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleClasses()) { index = numberOfUmpleClasses() - 1; }
      umpleClasses.remove(aUmpleClass);
      umpleClasses.add(index, aUmpleClass);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmpleClassAt(UmpleClass aUmpleClass, int index)
  {
    boolean wasAdded = false;
    if(umpleClasses.contains(aUmpleClass))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleClasses()) { index = numberOfUmpleClasses() - 1; }
      umpleClasses.remove(aUmpleClass);
      umpleClasses.add(index, aUmpleClass);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmpleClassAt(aUmpleClass, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmpleInterfaces()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addUmpleInterface(UmpleInterface aUmpleInterface)
  {
    boolean wasAdded = false;
    if (umpleInterfaces.contains(aUmpleInterface)) { return false; }
    umpleInterfaces.add(aUmpleInterface);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUmpleInterface(UmpleInterface aUmpleInterface)
  {
    boolean wasRemoved = false;
    if (umpleInterfaces.contains(aUmpleInterface))
    {
      umpleInterfaces.remove(aUmpleInterface);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmpleInterfaceAt(UmpleInterface aUmpleInterface, int index)
  {  
    boolean wasAdded = false;
    if(addUmpleInterface(aUmpleInterface))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleInterfaces()) { index = numberOfUmpleInterfaces() - 1; }
      umpleInterfaces.remove(aUmpleInterface);
      umpleInterfaces.add(index, aUmpleInterface);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmpleInterfaceAt(UmpleInterface aUmpleInterface, int index)
  {
    boolean wasAdded = false;
    if(umpleInterfaces.contains(aUmpleInterface))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleInterfaces()) { index = numberOfUmpleInterfaces() - 1; }
      umpleInterfaces.remove(aUmpleInterface);
      umpleInterfaces.add(index, aUmpleInterface);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmpleInterfaceAt(aUmpleInterface, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !mixsetOrFiles.isEmpty() )
    {
      mixsetOrFiles.get(0).setUmpleModel(null);
    }
    if (featureModel != null)
    {
      featureModel.setUmpleModel(null);
    }
    umpleTraits.clear();
    filters.clear();
    enums.clear();
    associations.clear();
    umpleClasses.clear();
    umpleInterfaces.clear();
  }

  // line 6 "../../../../src/Umple_Code_StateMachine.ump"
   public StateMachine getStateMachineDefinition(String name){
    for (StateMachine aStateMachine : getStateMachineDefinitions())
      {
        if (aStateMachine.getName().equals(name))
        {
          return aStateMachine;
        }
      }
      return null;
  }

  // line 7 "../../../../src/Umple_Code_Filter.ump"
   public void applyFilter(String fname){
    Filter f = getFilter(fname);

      if (f == null)
      {
        return;
      }

      if(!f.hasNestedFilter() && f.isEmpty())
      {
        return;
      }

      if(f.hasNestedFilter())
      {
        for(String fn : f.getFilterValues())
        {
          markIncludedClasses(getFilter(fn));
        }
      }

      markIncludedClasses(f);
      filterOutClasses();
  }

  // line 33 "../../../../src/Umple_Code_Filter.ump"
   private void markIncludedClasses(Filter f){
    if (f == null || f.isEmpty()) 
        {
        return;
        }

        for(UmpleClass clazz : umpleClasses)
        {
        if(f.isIncluded(clazz))
        {
            clazz.setFilteredin(true);
            if(f.hasSub())
            {
            addSubClasses(f.getSubCount(),clazz);
            }
            if(f.hasSuper())
            {
            addSuperClasses(f.getSuperCount(), clazz);
            }
        }  
        }

        Label_Association_24: ;

        if(!f.hasSuper())
        {
        for(UmpleClass clazz : umpleClasses)
        {
            if(clazz.getFilteredin())
            {
            addSuperClasses(clazz);
            }
        }
        }
  }

  // line 70 "../../../../src/Umple_Code_Filter.ump"
   private void filterOutClasses(){
    List<UmpleInterface> interfacesToKeep = new ArrayList<UmpleInterface>();
    
        int maxIndex = umpleClasses.size() - 1;
        for(int i=maxIndex; i>=0; i--)
        {
        UmpleClass clazz = umpleClasses.get(i);
        if (!clazz.getFilteredin())
        {
          Label_Association_25: ;
        }
        else {
            // Flag its interfaces to keep
            List<UmpleInterface> interfacesOfClass;
            interfacesOfClass=clazz.getParentInterface();
            for(UmpleInterface ui : interfacesOfClass)
            {
            addInterfacesRecursively(interfacesToKeep, ui);
            }
        }
        }
        
        // Delete all other Umple interfaces
        maxIndex = umpleInterfaces.size() - 1;
        for(int i=maxIndex; i>=0; i--)
        {
        UmpleInterface theInterface = umpleInterfaces.get(i);
        removeUmpleInterface(theInterface);
        theInterface.delete();
        }
  }

  // line 162 "../../../../src/Umple_Code_Filter.ump"
   private void markClassByName(ArrayList<String> names){
    for(UmpleClass c : umpleClasses)
      {
        if(names.indexOf(c.getName())>=0)
        {
          c.setFilteredin(true);
        }
      }
  }

  // line 173 "../../../../src/Umple_Code_Filter.ump"
   private void addSuperClasses(int sup, UmpleClass c){
    if(sup==0 || c.getExtendsClass()==null)
      {
        return;
      }
      else
      {
        c.getExtendsClass().setFilteredin(true);
        addSuperClasses(sup-1, c.getExtendsClass());
      }
  }

  // line 186 "../../../../src/Umple_Code_Filter.ump"
   private void addSuperClasses(UmpleClass c){
    if(c.getExtendsClass()==null)
      {
        return;
      }
      else
      {
        c.getExtendsClass().setFilteredin(true);
        addSuperClasses(c.getExtendsClass());
      }
  }

  // line 199 "../../../../src/Umple_Code_Filter.ump"
   private void addSubClasses(int sub, UmpleClass c){
    if(sub==0)
      {
        return;
      }
      else
      {
        for(UmpleClass s : c.getSubclasses())
        {
          s.setFilteredin(true);
          addSubClasses(sub-1,s);
        } 
      }
  }

  // line 215 "../../../../src/Umple_Code_Filter.ump"
   public Filter getFilter(String name){
    for (Filter aFilter : getFilters())
      {
        if(aFilter.getName() != null)
        {
          if (aFilter.getName().equals(name))
            return aFilter;
        }
        else if(name==null)
        {
          return aFilter;
        } 
      }
      return null;
  }

  // line 9 "../../../../src/Umple_Code_Trait.ump"
   public UmpleTrait getUmpleTrait(String name){
    for (UmpleTrait aTrait : getUmpleTraits())
    {
      if (aTrait.getName().equals(name))
      {
        return aTrait;
      }
    }
    return null;
  }

  // line 21 "../../../../src/Umple_Code_Trait.ump"
   public UmpleTrait addUmpleTrait(String name){
    UmpleTrait newTrait = getUmpleTrait(name);
    if (newTrait == null)
    {
      newTrait = new UmpleTrait(name, this);
      addUmpleTrait(newTrait);
    }
    return newTrait;
  }

  // line 7 "../../../../src/Umple_CodeClass.ump"
   public UmpleClass addUmpleClass(String name){
    UmpleClass newClass = getUmpleClass(name);
    if (newClass == null)
    {
      newClass = new UmpleClass(name, this);
      addUmpleClass(newClass);
    }
    return newClass;
  }

  // line 17 "../../../../src/Umple_CodeClass.ump"
   public UmpleClass getUmpleClass(String name){
    for (UmpleClass aClass : getUmpleClasses())
    {
        if (aClass.getName().equals(name))
        {
          return aClass;
        }
      }
      return null;
  }

  // line 28 "../../../../src/Umple_CodeClass.ump"
   public UmpleInterface getUmpleInterface(String name){
    for (UmpleInterface aInterface : getUmpleInterfaces())
      {
        if (aInterface.getName().equals(name))
        {
          return aInterface;
        }
      }
      return null;
  }

  // line 39 "../../../../src/Umple_CodeClass.ump"
   private void addInterfacesRecursively(List interfacesToKeep, UmpleInterface anInterface){
    interfacesToKeep.add(anInterface);
      for(UmpleInterface pi : anInterface.getExtendsInterface())
      {
        addInterfacesRecursively(interfacesToKeep, pi);
      }
  }

  // line 105 "../../../../src/Umple_CodeCoordinate.ump"
   public Coordinate getDefaultClassPosition(int numDefaults){
    int xIndex  = 0;
      int yIndex = 0;
      int yOffset = 0;
      int xOffset = 0;

      xIndex = (numDefaults-1) / (maxYLevels);
      yIndex = (numDefaults-1) % (maxYLevels);
      yOffset = (yIndex * levelOffset.getY()) + initialOffset.getY();
      xOffset = (xIndex * levelOffset.getX()) + initialOffset.getX();

      return new Coordinate(xOffset,yOffset,classSize.getWidth(),classSize.getHeight());
  }

  // line 120 "../../../../src/Umple_CodeCoordinate.ump"
   public Coordinate getDefaultInterfacePosition(int numDefaults){
    int xIndex  = 0;
      int yIndex = 0;
      int yOffset = 0;
      int xOffset = 0;

      xIndex = (numDefaults-1) / (maxYLevels);
      yIndex = (numDefaults-1) % (maxYLevels);
      yOffset = (yIndex * levelOffset.getY()) + initialOffset.getY();
      xOffset = (xIndex * levelOffset.getX()) + initialOffset.getX() + 2*classSize.getWidth();

      return new Coordinate(xOffset,yOffset,classSize.getWidth(),classSize.getHeight());
  }

  // line 135 "../../../../src/Umple_CodeCoordinate.ump"
   public Coordinate[] getDefaultAssociationPosition(Association a){
    Coordinate[] defaults = new Coordinate[2];
      int offsetY = offsetFromEdge.getX();
      int offsetX = offsetFromEdge.getY();

      String classOne = a.getEnd(0).getClassName();
      String classTwo = a.getEnd(1).getClassName();


      Coordinate classOnePos = getUmpleClass(classOne).getCoordinates();
      Coordinate classTwoPos = getUmpleClass(classTwo).getCoordinates();

      if (classOne.equals(classTwo))
      {
        return getDefaultReflexiveAssociationPosition(a);
      }

      int num = 1;
      String tempClass1 = "";
      String tempClass2 = "";
      for (Association temp : getAssociations())
      {
        tempClass1 = temp.getEnd(0).getClassName();
        tempClass2 = temp.getEnd(1).getClassName();

        if (temp.getName().equals(a.getName()) &&
            tempClass1.equals(classOne)        &&
            tempClass2.equals(classTwo))
        {
          break;
        }

        if (tempClass1.equals(classOne) && tempClass2.equals(classTwo)){ ++num; break; }
        else if (tempClass1.equals(classTwo) && tempClass2.equals(classOne)){ ++num; break; }
      }

      Coordinate classOneNoX = new Coordinate(classOnePos.getX(),classOnePos.getY(),classOnePos.getWidth(),classOnePos.getHeight());
      Coordinate classTwoNoX = new Coordinate(classTwoPos.getX(),classTwoPos.getY(),classTwoPos.getWidth(),classTwoPos.getHeight());
      Coordinate classOneNoY = new Coordinate(classOnePos.getX(),classOnePos.getY(),classOnePos.getWidth(),classOnePos.getHeight());
      Coordinate classTwoNoY = new Coordinate(classTwoPos.getX(),classTwoPos.getY(),classTwoPos.getWidth(),classTwoPos.getHeight());
      classOneNoX.setX(0);
      classTwoNoX.setX(0);
      classOneNoY.setY(0);
      classTwoNoY.setY(0);
      String whereVert = classOneNoX.whereIs(classTwoNoX);
      String whereHorz = classOneNoY.whereIs(classTwoNoY);

      // alternative 1: left/right wall of class one to left/right wall of class two
      int offsetOneX = whereHorz.equals("right")? classOnePos.getWidth() : 0;
      int offsetTwoX = whereHorz.equals("right")? 0 : classTwoPos.getWidth();
      int offsetOneY = num > 1 ? (num+1)*offsetY : offsetY;
      int offsetTwoY = num > 1 ? (num+1)*offsetY : offsetY;
      Coordinate offsetOne = new Coordinate(offsetOneX, offsetOneY, 0, 0);
      Coordinate offsetTwo = new Coordinate(offsetTwoX, offsetTwoY, 0, 0);
      Coordinate start = new Coordinate(classOnePos.getX() + offsetOne.getX(),
          classOnePos.getY() + offsetOne.getY(),
          0,0);
      Coordinate end = new Coordinate(  classTwoPos.getX() + offsetTwo.getX(),
          classTwoPos.getY() + offsetTwo.getY(),
          0,0);

      int distance = start.distanceTo(end);

      // alternative 2: top/bottom wall of class one to top/bottom wall of class two
      int altXOne = num*offsetX;
      int altXTwo = num*offsetX;
      int altYOne = whereVert.equals("top")? 0 : classOnePos.getHeight();
      int altYTwo = whereVert.equals("top")? classTwoPos.getHeight() : 0;
      Coordinate altOffsetOne = new Coordinate(altXOne, altYOne, 0, 0);
      Coordinate altOffsetTwo = new Coordinate(altXTwo, altYTwo, 0, 0);
      Coordinate altStart = new Coordinate(classOnePos.getX() + altOffsetOne.getX(),
          classOnePos.getY() + altOffsetOne.getY(),
          0,0);
      Coordinate altEnd = new Coordinate(  classTwoPos.getX() + altOffsetTwo.getX(),
          classTwoPos.getY() + altOffsetTwo.getY(),
          0,0);

      int altDistance = altStart.distanceTo(altEnd);

      // choose alternative that generates the shortest line
      if (altDistance < distance)
      {
        defaults[0] = altOffsetOne;
        defaults[1] = altOffsetTwo;
      }
      else
      {
        defaults[0] = offsetOne;
        defaults[1] = offsetTwo;
      }

      return defaults;
  }

  // line 230 "../../../../src/Umple_CodeCoordinate.ump"
   private Coordinate[] getDefaultReflexiveAssociationPosition(Association a){
    Coordinate[] defaults = new Coordinate[2];
      String name  = a.getEnd(0).getClassName();
      Coordinate position = getUmpleClass(name).getCoordinates();

      // determine which corner the association should be positioned at
      int index = 0;
      for (int i=0; i < numberOfAssociations(); i++)
      {
        Association current = getAssociation(i);
        if (current.getEnd(0).getClassName().equals(name) && current.getEnd(1).getClassName().equals(name))
        {
          if (current.numberOfPositions() > 0)
          {
            if (current.getPosition(0).getStatus().equals(Coordinate.Status.Defaulted))
            {
              index += 1;
            }
          }
        }
      }

      Coordinate offsetOne = new Coordinate(0,0,0,0);
      Coordinate offsetTwo = new Coordinate(0,0,0,0);

      if (index % 4 == 0)
      {
        offsetOne.setX(reflexiveSegmentLength);
        offsetOne.setY(position.getHeight());
        offsetTwo.setX(0);
        offsetTwo.setY(position.getHeight() - reflexiveSegmentLength);
      }
      else if (index % 4 == 1)
      {
        offsetOne.setX(position.getWidth() - reflexiveSegmentLength);
        offsetOne.setY(position.getHeight());
        offsetTwo.setX(position.getWidth());
        offsetTwo.setY(position.getHeight() - reflexiveSegmentLength);
      }
      else if (index % 4 == 2)
      {
        offsetOne.setX(position.getWidth() - reflexiveSegmentLength);
        offsetOne.setY(0);
        offsetTwo.setX(position.getWidth());
        offsetTwo.setY(reflexiveSegmentLength);
      }
      else
      {
        offsetOne.setX(reflexiveSegmentLength);
        offsetOne.setY(0);
        offsetTwo.setX(0);
        offsetTwo.setY(reflexiveSegmentLength);
      }

      defaults[0] = offsetOne;
      defaults[1] = offsetTwo;

      return defaults;
  }

  // line 660 "../../../../src/Association_refactored.ump"
   public Association getAssociation(String name){
    for (Association a : associations)
        {
          if (a.getName().equals(name))
          {
            return a;
          }
        }
        return null;
  }

  // line 672 "../../../../src/Association_refactored.ump"
   public AssociationClass addAssociationClass(String className){
    AssociationClass newClass = (AssociationClass) getUmpleClass(className);
        if (newClass == null)
        {
          newClass = new AssociationClass(className);
          addUmpleClass(newClass);
        }
        return newClass;
  }

  // line 696 "../../../../src/Association_refactored.ump"
   private void markRelatedClass(int asso){
    ArrayList<String> names = new ArrayList<String>();
      for(int i = 0; i<asso; i++)
      {
        for(UmpleClass clazz : umpleClasses)
        {
          if(clazz.getFilteredin())
          {
            addRelatedClassName(clazz,names);
          }
        } 
        markClassByName(names);
        names = new ArrayList<String>();
      }
  }

  // line 712 "../../../../src/Association_refactored.ump"
   private void addRelatedClassName(UmpleClass c, ArrayList<String> names){
    for(AssociationVariable a : c.getAssociationVariables())
      {
        names.add(a.getType());
      }
  }

  // line 10 "../../../../src/UmpleInternalParser_CodeTrait.ump"
  public boolean getUmpleTraitTypeParameter(String value){
    for(UmpleTrait uTrait : getUmpleTraits()){
		for(GeneralTemplateParameter gTParameter : uTrait.getGeneralTemplateParameters()){
			if (gTParameter.getName().equals(value)) return true;
		}
	}
	return false;
  }


  /**
   * This method returns a mixset from UmpleModel based on its name.
   * return null if the mixset is not found.
   * @Abdulaziz
   */
  // line 25 "../../../../src/UmpleInternalParser_CodeMixset.ump"
  public Mixset getMixset(String name){
    Mixset mixset = null;
    for(MixsetOrFile mOrF : getMixsetOrFiles())
      { 
      if (mOrF.getIsMixset() && mOrF.getName().equals(name))
        mixset = (Mixset)mOrF;
      }
    return mixset;
  }


  /**
   * This method returns UmpleFile from UmpleModel based on its name. 
   * return null if the mixset is not found.
   * usage: to know if the file in which a mixset is mentioned was already used before. 
   * @Abdulaziz
   */
  // line 41 "../../../../src/UmpleInternalParser_CodeMixset.ump"
  public UmpleFile getUmpleFile(String name){
    UmpleFile uFile = null;
    for(MixsetOrFile mOrF : getMixsetOrFiles())
	  {
	    if (! mOrF.getIsMixset() && mOrF.getName().equals(name))
	      uFile = (UmpleFile)mOrF;
	  }
	return uFile;
  }

  // line 36 "../../../../src/Umple_Code.ump"
   public static  String[] findValidLanguages(){
    final String NONTERMINAL = "generate";
    final String START_TOKEN = "[=language:";
    final String END_TOKEN   = "]";
    final String DELIMITER   = "\\|";
    
    
    String[] result = new String[0];
    
    boolean lineFound = false;
    try
    {
      InputStream in = null;
      BufferedReader reader = null;
      try
      {
        in     = UmpleModel.class.getResourceAsStream("/umple_core.grammar");
        reader = new BufferedReader(new InputStreamReader(in));
        String line;
        while (((line = reader.readLine()) != null) && !lineFound ) 
        {
           if( line.startsWith(NONTERMINAL) && line.contains(START_TOKEN))
           {
             int start_index = line.indexOf(START_TOKEN) + START_TOKEN.length();
             int end_index = line.indexOf(END_TOKEN);
             String languages = line.substring( start_index, end_index );
             result = languages.split(DELIMITER);
             lineFound = true;
           }
        }
      }finally
      {
        in.close();
        reader.close();
      }
    }catch( IOException e ){
      throw new RuntimeException("Error opening '/umple_core.grammar' resource", e);
    }
    Arrays.sort(result);
    return result;
  }

  // line 93 "../../../../src/Umple_Code.ump"
   public  UmpleModel(UmpleFile umpleFile, List<File> linkedFiles){
    this(umpleFile);
    this.linkedFiles = linkedFiles;
  }

  // line 99 "../../../../src/Umple_Code.ump"
   public List<UmpleElement> getUmpleElements(){
    List<UmpleElement> all = new ArrayList<UmpleElement>();
    all.addAll(getUmpleClasses());
    all.addAll(getUmpleInterfaces());
    return all;
  }

  // line 107 "../../../../src/Umple_Code.ump"
   public UmpleInterface addUmpleInterface(String name){
    UmpleInterface newInterface = getUmpleInterface(name);
    if (newInterface == null)
    {
      newInterface = new UmpleInterface(name, this);
      addUmpleInterface(newInterface);
    }
    return newInterface;
  }

  // line 118 "../../../../src/Umple_Code.ump"
   public void addGenerate(String lang){
    addGenerate(new GenerateTarget(lang, null));
  }

  // line 128 "../../../../src/Umple_Code.ump"
   public String getDefaultGenerate(){
    // Note that this method should be getDefaultGenerateLanguage
    // To avoid rippling changes throughout the code, the name is left as is
    if (numberOfGenerates() == 0)
    {
      return null;
    }
    else
    {
      return getGenerate(0).getLanguage();
    }
  }

  // line 142 "../../../../src/Umple_Code.ump"
   public String getDefaultGeneratePath(){
    if (numberOfGenerates() == 0)
    {
      return null;
    }
    else
    {
      return getGenerate(0).getPath() == null ? "./" : getGenerate(0).getPath();
    }
  }

  // line 154 "../../../../src/Umple_Code.ump"
   public void clearGenerates(){
    generates.clear();
  }

  // line 159 "../../../../src/Umple_Code.ump"
   public boolean hasAnalyzer(String name){
    return analyzers.containsKey(name);
  }

  // line 164 "../../../../src/Umple_Code.ump"
   public Analyzer getAnalyzer(String name){
    return analyzers.get(name);
  }


  /**
   * Creates a new parser, loads the input, parses, then analyses; analyser generates
   */
  // line 171 "../../../../src/Umple_Code.ump"
   public void run(){
    boolean failed = false;
    String input;
    RuleBasedParser parser = new RuleBasedParser();
    
    UmpleInternalParser analyzer = new UmpleInternalParser("UmpleInternalParser",this,parser);
    ParseResult result = null;
    
    try {   
      result = parser.parse(
        new File(umpleFile.getPath() + File.separator + umpleFile.getFileName()),
        this.linkedFiles.toArray(new File[0]));
    }
    catch (Exception ex)
    {
      result = parser.parse("classDefinition",""); // Fake to ensure can proceed
      lastResult = result;
      result.addErrorMessage(new ErrorMessage(9000,new Position("",0,0,0),
        "Could not parse Umple model. Please report an issue with this entire message and your input code to Umple developers. \nStack dump follows\n"+cruise.umple.util.ExceptionDumper.dumpCompilerError(ex)
        ));
      throw new UmpleCompilerException(result.toString(),null);
    }
    catch (StackOverflowError ex)
    {
      result = parser.parse("classDefinition",""); // Fake to ensure can proceed
      lastResult = result;
      result.addErrorMessage(new ErrorMessage(9000,new Position("",0,0,0),
        "Could not parse Umple model. Please report an issue with this entire message and your input code to Umple developers. \nStack Overflow in Parsing.\n"+cruise.umple.util.ExceptionDumper.dumpCompilerError(ex)
        ));
      throw new UmpleCompilerException(result.toString(),null);
    }       
    
    this.extractAnalyzersFromParser(parser);

    failed = failed || !result.getWasSuccess();
    lastResult = result;

    if(!failed)
      result = analyzer.analyze(getShouldGenerate());

    failed |= !result.getWasSuccess();

    if(failed || result.getHasWarnings())
      throw new UmpleCompilerException(result.toString(),null);
  }


  /**
   * Creates a generator for you based on the provided Language
   */
  // line 221 "../../../../src/Umple_Code.ump"
   public CodeGenerator newGenerator(String language){
    String realLanguage = language;
    
    // Ensure the target is specified in the proper case.
    VALIDATE_GENERATE:
    for( String lang : UmpleModel.validLanguages ){
      if(lang.equalsIgnoreCase(language)){
        realLanguage = lang;
        break VALIDATE_GENERATE;
      }
    }

		
    if (language.equals("Cpp")) realLanguage="RTCpp";
    else if (language.equals("SimpleCpp")) realLanguage="RTCpp";
    
    String className = StringFormatter.format("cruise.umple.compiler.{0}Generator",realLanguage);
    Class<?> classDefinition = null;
    try {
      classDefinition = Class.forName(className);
      CodeGenerator generator = (CodeGenerator) classDefinition.newInstance();
      generator.setModel(this);
      return generator;
    }
    catch (ClassNotFoundException cnf) {
      System.err.println("Code generator "+realLanguage+ " not found. Check spelling. Specify --help.");
      throw new RuntimeException(cnf);
    }
    catch (Exception ex2) {
      System.err.println("Code generator "+realLanguage+ " not found. Check spelling. Specify --help.");
      throw new RuntimeException("Unable to instantiate "+realLanguage+ ".",ex2);
    }
  }


  /**
   * Generates the actual code for each generation target
   */
  // line 260 "../../../../src/Umple_Code.ump"
   public String generate(){
    String lang="Unknown";
    // @refactor
    
applyFilter(null);
Label_Filter_22: ;
    boolean foundGenerator;
    parsingTime = System.currentTimeMillis()/1000.0;
    try
    {
      for (GenerateTarget target : getGenerates())
      {
        lang=target.getLanguage();
        CodeGenerator generator = newGenerator(lang);
        generator.setOutput(target.getPath());
        CodeBlock.languageUsed = lang;
        for (String subopt : target.getSuboptions()) {
        	 generator.setSuboption(subopt);
        }
        gTime1 = System.currentTimeMillis()/1000.0;
        generator.generate();
        gTime2 = System.currentTimeMillis()/1000.0;
        Double gTime = gTime2 - gTime1;
        hashMap.put(lang,(String.valueOf(gTime)));
      }
      return null; // generators all worked
    }
    catch (Exception ex)
    {
      return("Could not generate "+lang+"\nPlease report an issue with this entire message and your input code to Umple developers.\nStack Trace Follows.\n"+
        cruise.umple.util.ExceptionDumper.dumpCompilerError(ex));
    }
  }


  /**
   * Extracts Analyzers from a <code>RuleBasedParser</code>, assigning the
   * analyzers to this model
   * 
   * @param parser the <code>RuleBasedParser</code> to extract parsers from.
   */
  // line 315 "../../../../src/Umple_Code.ump"
   public void extractAnalyzersFromParser(RuleBasedParser parser){
    setAnalyzers(parser.getAnalyzer().getAnalyzerMap());
  }


  /**
   * Issue 1008 - Helper function to determine if the Umple Model has a particular enumeration
   */
  // line 320 "../../../../src/Umple_Code.ump"
   public boolean hasEnum(String enumName){
    for (UmpleEnumeration uEnum : getEnums()) {
      if (uEnum.getName().equals(enumName)) {
        return true;
      }
    }
    return false;
  }


  public String toString()
  {
    return super.toString() + "["+
            "distributeOn" + ":" + getDistributeOn()+ "," +
            "distributeForced" + ":" + getDistributeForced()+ "," +
            "distributed" + ":" + getDistributed()+ "," +
            "skipcompile" + ":" + getSkipcompile()+ "," +
            "skipjavacompile" + ":" + getSkipjavacompile()+ "," +
            "skipcppcompile" + ":" + getSkipcppcompile()+ "," +
            "skiprubycompile" + ":" + getSkiprubycompile()+ "," +
            "skipphpcompile" + ":" + getSkipphpcompile()+ "," +
            "distributePattern" + ":" + getDistributePattern()+ "," +
            "distributeTechnology" + ":" + getDistributeTechnology()+ "," +
            "defaultPackage" + ":" + getDefaultPackage()+ "," +
            "shouldGenerate" + ":" + getShouldGenerate()+ "," +
            "defaultNamespace" + ":" + getDefaultNamespace()+ "," +
            "code" + ":" + getCode()+ "," +
            "debugMode" + ":" + getDebugMode()+ "," +
            "parsingTime" + ":" + getParsingTime()+ "," +
            "traceType" + ":" + getTraceType()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "umpleFile" + "=" + (getUmpleFile() != null ? !getUmpleFile().equals(this)  ? getUmpleFile().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "glossary" + "=" + (getGlossary() != null ? !getGlossary().equals(this)  ? getGlossary().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "mainClass" + "=" + (getMainClass() != null ? !getMainClass().equals(this)  ? getMainClass().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "lastResult" + "=" + (getLastResult() != null ? !getLastResult().equals(this)  ? getLastResult().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "generatedCode" + "=" + (getGeneratedCode() != null ? !getGeneratedCode().equals(this)  ? getGeneratedCode().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "analyzers" + "=" + (getAnalyzers() != null ? !getAnalyzers().equals(this)  ? getAnalyzers().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "hashMap" + "=" + (getHashMap() != null ? !getHashMap().equals(this)  ? getHashMap().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "tracer" + "=" + (getTracer() != null ? !getTracer().equals(this)  ? getTracer().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "featureModel = "+(getFeatureModel()!=null?Integer.toHexString(System.identityHashCode(getFeatureModel())):"null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 68 "../../../../src/Umple.ump"
  public static final String[] validLanguages = findValidLanguages() ;

// line 121 "../../../../src/Umple_Code.ump"
  public void addGenerate (Collection <?extends GenerateTarget> c) 
  {
    generates.addAll(c);
  }

// line 292 "../../../../src/Umple_Code.ump"
  public Map<String, CodeTranslator> getAllTranslators () 
  {
    Map<String, CodeTranslator> allTranslators = new HashMap<String, CodeTranslator>();
    CodeGenerator tempCodeGen = null;
    for(GenerateTarget t : getGenerates())
    {
      if((tempCodeGen = newGenerator(t.getLanguage())) instanceof CodeTranslator) {
        allTranslators.put(t.getLanguage(), (CodeTranslator)tempCodeGen);
      }
    }

    return allTranslators;
  }

  
}