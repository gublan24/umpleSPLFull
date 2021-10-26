/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 18 "../../../../src/ClassDependencyNode.ump"
public class ClassDependencyNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassDependencyNode Attributes
  private int level;
  private boolean isFirstLevel;
  private boolean isInitialized;
  private String uClassName;

  //ClassDependencyNode Associations
  private UmpleClass umpleClass;
  private ClassDependencyTree classDependencyTree;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ClassDependencyNode(int aLevel, boolean aIsFirstLevel, boolean aIsInitialized, String aUClassName)
  {
    level = aLevel;
    isFirstLevel = aIsFirstLevel;
    isInitialized = aIsInitialized;
    uClassName = aUClassName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLevel(int aLevel)
  {
    boolean wasSet = false;
    level = aLevel;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsFirstLevel(boolean aIsFirstLevel)
  {
    boolean wasSet = false;
    isFirstLevel = aIsFirstLevel;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInitialized(boolean aIsInitialized)
  {
    boolean wasSet = false;
    isInitialized = aIsInitialized;
    wasSet = true;
    return wasSet;
  }

  public boolean setUClassName(String aUClassName)
  {
    boolean wasSet = false;
    uClassName = aUClassName;
    wasSet = true;
    return wasSet;
  }

  public int getLevel()
  {
    return level;
  }

  public boolean getIsFirstLevel()
  {
    return isFirstLevel;
  }

  public boolean getIsInitialized()
  {
    return isInitialized;
  }

  public String getUClassName()
  {
    return uClassName;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsFirstLevel()
  {
    return isFirstLevel;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInitialized()
  {
    return isInitialized;
  }
  /* Code from template association_GetOne */
  public UmpleClass getUmpleClass()
  {
    return umpleClass;
  }

  public boolean hasUmpleClass()
  {
    boolean has = umpleClass != null;
    return has;
  }
  /* Code from template association_GetOne */
  public ClassDependencyTree getClassDependencyTree()
  {
    return classDependencyTree;
  }

  public boolean hasClassDependencyTree()
  {
    boolean has = classDependencyTree != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasSet = false;
    UmpleClass existingUmpleClass = umpleClass;
    umpleClass = aUmpleClass;
    if (existingUmpleClass != null && !existingUmpleClass.equals(aUmpleClass))
    {
      existingUmpleClass.removeClassDependencyNode(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addClassDependencyNode(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setClassDependencyTree(ClassDependencyTree aClassDependencyTree)
  {
    boolean wasSet = false;
    ClassDependencyTree existingClassDependencyTree = classDependencyTree;
    classDependencyTree = aClassDependencyTree;
    if (existingClassDependencyTree != null && !existingClassDependencyTree.equals(aClassDependencyTree))
    {
      existingClassDependencyTree.removeClassDependencyNode(this);
    }
    if (aClassDependencyTree != null)
    {
      aClassDependencyTree.addClassDependencyNode(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removeClassDependencyNode(this);
    }
    if (classDependencyTree != null)
    {
      ClassDependencyTree placeholderClassDependencyTree = classDependencyTree;
      this.classDependencyTree = null;
      placeholderClassDependencyTree.removeClassDependencyNode(this);
    }
  }

  // line 35 "../../../../src/ClassDependencyNode.ump"
   public ClassDependencyNode getNodeByName(String name){
    if ( name.equals(this.getUClassName()))
	  {
		  return this;
	  }
	  
	  return null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "level" + ":" + getLevel()+ "," +
            "isFirstLevel" + ":" + getIsFirstLevel()+ "," +
            "isInitialized" + ":" + getIsInitialized()+ "," +
            "uClassName" + ":" + getUClassName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "classDependencyTree = "+(getClassDependencyTree()!=null?Integer.toHexString(System.identityHashCode(getClassDependencyTree())):"null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 27 "../../../../src/ClassDependencyNode.ump"
  private List<String> dependents ;

  
}