/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Token;
import java.nio.file.*;
import cruise.umple.compiler.*;
import java.util.*;

/**
 * Represents an Umple classifier: a Class or Interface
 */
// line 371 "../../../../src/Umple_CodeMethod.ump"
// line 594 "../../../../src/Umple.ump"
// line 409 "../../../../src/Umple_Code.ump"
public abstract class UmpleClassifier extends UmpleElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleClassifier Attributes
  private boolean isDistributable;
  private String distributeTechnology;
  private UmpleModel sourceModel;

  //UmpleClassifier Associations
  private List<Method> methods;
  private List<Depend> depends;
  private List<Constant> constants;
  private List<ModelConstraint> modelConstraints;
  private Token extendsToken;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleClassifier(String aName, UmpleModel aSourceModel)
  {
    super(aName);
    isDistributable = false;
    distributeTechnology = "RMI";
    sourceModel = aSourceModel;
    methods = new ArrayList<Method>();
    depends = new ArrayList<Depend>();
    constants = new ArrayList<Constant>();
    modelConstraints = new ArrayList<ModelConstraint>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsDistributable(boolean aIsDistributable)
  {
    boolean wasSet = false;
    isDistributable = aIsDistributable;
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

  public boolean setSourceModel(UmpleModel aSourceModel)
  {
    boolean wasSet = false;
    sourceModel = aSourceModel;
    wasSet = true;
    return wasSet;
  }

  /**
   * Specifies whether or not the Umple class or implemented classes are distributable with RMI technology.
   */
  public boolean getIsDistributable()
  {
    return isDistributable;
  }

  public String getDistributeTechnology()
  {
    return distributeTechnology;
  }

  public UmpleModel getSourceModel()
  {
    return sourceModel;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsDistributable()
  {
    return isDistributable;
  }
  /* Code from template association_GetMany */
  public Method getMethod(int index)
  {
    Method aMethod = methods.get(index);
    return aMethod;
  }

  /**
   * The methods contained within the Umple Classifier.
   */
  public List<Method> getMethods()
  {
    List<Method> newMethods = Collections.unmodifiableList(methods);
    return newMethods;
  }

  public int numberOfMethods()
  {
    int number = methods.size();
    return number;
  }

  public boolean hasMethods()
  {
    boolean has = methods.size() > 0;
    return has;
  }

  public int indexOfMethod(Method aMethod)
  {
    int index = methods.indexOf(aMethod);
    return index;
  }
  /* Code from template association_GetMany */
  public Depend getDepend(int index)
  {
    Depend aDepend = depends.get(index);
    return aDepend;
  }

  public List<Depend> getDepends()
  {
    List<Depend> newDepends = Collections.unmodifiableList(depends);
    return newDepends;
  }

  public int numberOfDepends()
  {
    int number = depends.size();
    return number;
  }

  public boolean hasDepends()
  {
    boolean has = depends.size() > 0;
    return has;
  }

  public int indexOfDepend(Depend aDepend)
  {
    int index = depends.indexOf(aDepend);
    return index;
  }
  /* Code from template association_GetMany */
  public Constant getConstant(int index)
  {
    Constant aConstant = constants.get(index);
    return aConstant;
  }

  /**
   * The constants contained within the Umple Classifier.
   */
  public List<Constant> getConstants()
  {
    List<Constant> newConstants = Collections.unmodifiableList(constants);
    return newConstants;
  }

  public int numberOfConstants()
  {
    int number = constants.size();
    return number;
  }

  public boolean hasConstants()
  {
    boolean has = constants.size() > 0;
    return has;
  }

  public int indexOfConstant(Constant aConstant)
  {
    int index = constants.indexOf(aConstant);
    return index;
  }
  /* Code from template association_GetMany */
  public ModelConstraint getModelConstraint(int index)
  {
    ModelConstraint aModelConstraint = modelConstraints.get(index);
    return aModelConstraint;
  }

  public List<ModelConstraint> getModelConstraints()
  {
    List<ModelConstraint> newModelConstraints = Collections.unmodifiableList(modelConstraints);
    return newModelConstraints;
  }

  public int numberOfModelConstraints()
  {
    int number = modelConstraints.size();
    return number;
  }

  public boolean hasModelConstraints()
  {
    boolean has = modelConstraints.size() > 0;
    return has;
  }

  public int indexOfModelConstraint(ModelConstraint aModelConstraint)
  {
    int index = modelConstraints.indexOf(aModelConstraint);
    return index;
  }
  /* Code from template association_GetOne */
  public Token getExtendsToken()
  {
    return extendsToken;
  }

  public boolean hasExtendsToken()
  {
    boolean has = extendsToken != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMethods()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addMethod(Method aMethod)
  {
    boolean wasAdded = false;
    if (methods.contains(aMethod)) { return false; }
    methods.add(aMethod);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMethod(Method aMethod)
  {
    boolean wasRemoved = false;
    if (methods.contains(aMethod))
    {
      methods.remove(aMethod);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMethodAt(Method aMethod, int index)
  {  
    boolean wasAdded = false;
    if(addMethod(aMethod))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMethods()) { index = numberOfMethods() - 1; }
      methods.remove(aMethod);
      methods.add(index, aMethod);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMethodAt(Method aMethod, int index)
  {
    boolean wasAdded = false;
    if(methods.contains(aMethod))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMethods()) { index = numberOfMethods() - 1; }
      methods.remove(aMethod);
      methods.add(index, aMethod);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMethodAt(aMethod, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDepends()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addDepend(Depend aDepend)
  {
    boolean wasAdded = false;
    if (depends.contains(aDepend)) { return false; }
    depends.add(aDepend);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeDepend(Depend aDepend)
  {
    boolean wasRemoved = false;
    if (depends.contains(aDepend))
    {
      depends.remove(aDepend);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDependAt(Depend aDepend, int index)
  {  
    boolean wasAdded = false;
    if(addDepend(aDepend))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDepends()) { index = numberOfDepends() - 1; }
      depends.remove(aDepend);
      depends.add(index, aDepend);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDependAt(Depend aDepend, int index)
  {
    boolean wasAdded = false;
    if(depends.contains(aDepend))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDepends()) { index = numberOfDepends() - 1; }
      depends.remove(aDepend);
      depends.add(index, aDepend);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDependAt(aDepend, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfConstants()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addConstant(Constant aConstant)
  {
    boolean wasAdded = false;
    if (constants.contains(aConstant)) { return false; }
    constants.add(aConstant);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeConstant(Constant aConstant)
  {
    boolean wasRemoved = false;
    if (constants.contains(aConstant))
    {
      constants.remove(aConstant);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addConstantAt(Constant aConstant, int index)
  {  
    boolean wasAdded = false;
    if(addConstant(aConstant))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstants()) { index = numberOfConstants() - 1; }
      constants.remove(aConstant);
      constants.add(index, aConstant);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveConstantAt(Constant aConstant, int index)
  {
    boolean wasAdded = false;
    if(constants.contains(aConstant))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstants()) { index = numberOfConstants() - 1; }
      constants.remove(aConstant);
      constants.add(index, aConstant);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addConstantAt(aConstant, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfModelConstraints()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addModelConstraint(ModelConstraint aModelConstraint)
  {
    boolean wasAdded = false;
    if (modelConstraints.contains(aModelConstraint)) { return false; }
    modelConstraints.add(aModelConstraint);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeModelConstraint(ModelConstraint aModelConstraint)
  {
    boolean wasRemoved = false;
    if (modelConstraints.contains(aModelConstraint))
    {
      modelConstraints.remove(aModelConstraint);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addModelConstraintAt(ModelConstraint aModelConstraint, int index)
  {  
    boolean wasAdded = false;
    if(addModelConstraint(aModelConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfModelConstraints()) { index = numberOfModelConstraints() - 1; }
      modelConstraints.remove(aModelConstraint);
      modelConstraints.add(index, aModelConstraint);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveModelConstraintAt(ModelConstraint aModelConstraint, int index)
  {
    boolean wasAdded = false;
    if(modelConstraints.contains(aModelConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfModelConstraints()) { index = numberOfModelConstraints() - 1; }
      modelConstraints.remove(aModelConstraint);
      modelConstraints.add(index, aModelConstraint);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addModelConstraintAt(aModelConstraint, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setExtendsToken(Token aNewExtendsToken)
  {
    boolean wasSet = false;
    extendsToken = aNewExtendsToken;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    methods.clear();
    depends.clear();
    constants.clear();
    modelConstraints.clear();
    extendsToken = null;
    super.delete();
  }

  // line 374 "../../../../src/Umple_CodeMethod.ump"
   public boolean hasMethod(Method comparedMethod){
    String methodName = comparedMethod.getName();
    String methodType = comparedMethod.getType();
    int numberOfParams = comparedMethod.getMethodParameters().size();
    for (Method aMethod : this.getMethods()){
      // Compare method names
      if (aMethod.getName().equals(methodName)){
          // Now compare parameters
          if (numberOfParams == aMethod.getMethodParameters().size())
          {
            boolean allSame = true;
            for (int i = 0; i < numberOfParams; i++)
            {
              if(!aMethod.getMethodParameter(i).getType().equals(comparedMethod.getMethodParameter(i).getType()))
              {
                allSame = false;
                break;
              }
            }
            if(allSame)
            {
              if (aMethod.getSource()==Method.Source.fAuto){
                this.removeMethod(aMethod);
                return false;
              }
              return true;
            }
          }
      }
    }
    return false;
  }


  /**
   * Counts the number of occurrences of the character <code>needle</code> in the 
   * supplied string <code>haystack</code>.
   * 
   * @param haystack the string to search for
   * @param needle the character to find
   * @return the number of occurrences of that character
   */
  // line 424 "../../../../src/Umple_Code.ump"
   private static  int countOccurrences(String haystack, char needle){
    int count = 0;
    for (int i = 0; i < haystack.length(); ++i)
    {
      if (haystack.charAt(i) == needle)
      {
        ++count;
      }
    }
    return count;
  }


  /**
   * Replaces all instances of '\' with '/' in path strings
   * 
   * @param str a string path to change
   * @return the new string
   */
  // line 444 "../../../../src/Umple_Code.ump"
   private static  String deWindowsify(String str){
    return str.replace('\\','/');
  }


  /**
   * Obtains the relative path between the source file for the UmpleClassifier and 
   * and the package name given the target language
   * 
   * @param filename the file name to get the relative path from
   * @param language The language target to compare
   * 
   * @return The string relative path between the parent and position
   */
  // line 459 "../../../../src/Umple_Code.ump"
   public String getRelativePath(String filename, String language){
    String p = getPackageName();
 	
    if (filename == null)
    {
      return "";
    }
    
    //Find path relative to namespace folders
    String packageName = getPackageName();
    if (packageName == null || packageName.equals(""))
    { //No package, file is output in current directory
      return Paths.get(filename).getFileName().toString();
    } 
    else
    { //Has a package, add appropriate number of ..
      int pathCount = countOccurrences(packageName, '.') + 1;
      StringBuilder build = new StringBuilder();
      for (int i = 0; i < pathCount; i++)
      {
        build.append("../");
      }
      
      //Add on relative path from generator location
      if (getSourceModel() == null)
      {
        build.append(Paths.get(filename).getFileName());
        return deWindowsify(build.toString());
      }
      Path currentPath = Paths.get(getSourceModel().getUmpleFile().getPath()).toAbsolutePath();
      Path generatesPath = null;
      GenerateTarget [] generates = getSourceModel().getGenerates();
      for (int i = 0; i < generates.length; i++)
      {
        if (generates[i].getLanguage().equals(language))
        {
          generatesPath = currentPath.resolve(Paths.get(generates[i].getPath())).normalize();
        }
      }
      if (generatesPath != null)
      {
      	Path result = generatesPath.relativize(currentPath);
      	if (!result.equals(Paths.get("")))
      	{
      	  result = result.normalize();
      	  build.append(result.toString() + '/');
      	}
      }
      
      build.append(Paths.get(filename).getFileName());
      return deWindowsify(build.toString());
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "isDistributable" + ":" + getIsDistributable()+ "," +
            "distributeTechnology" + ":" + getDistributeTechnology()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "sourceModel" + "=" + (getSourceModel() != null ? !getSourceModel().equals(this)  ? getSourceModel().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "extendsToken = "+(getExtendsToken()!=null?Integer.toHexString(System.identityHashCode(getExtendsToken())):"null");
  }
}