/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 12 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreGenModel
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreGenModel Associations
  private List<EcorePackage> packages;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreGenModel()
  {
    packages = new ArrayList<EcorePackage>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public EcorePackage getPackage(int index)
  {
    EcorePackage aPackage = packages.get(index);
    return aPackage;
  }

  public List<EcorePackage> getPackages()
  {
    List<EcorePackage> newPackages = Collections.unmodifiableList(packages);
    return newPackages;
  }

  public int numberOfPackages()
  {
    int number = packages.size();
    return number;
  }

  public boolean hasPackages()
  {
    boolean has = packages.size() > 0;
    return has;
  }

  public int indexOfPackage(EcorePackage aPackage)
  {
    int index = packages.indexOf(aPackage);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPackages()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addPackage(EcorePackage aPackage)
  {
    boolean wasAdded = false;
    if (packages.contains(aPackage)) { return false; }
    packages.add(aPackage);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePackage(EcorePackage aPackage)
  {
    boolean wasRemoved = false;
    if (packages.contains(aPackage))
    {
      packages.remove(aPackage);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPackageAt(EcorePackage aPackage, int index)
  {  
    boolean wasAdded = false;
    if(addPackage(aPackage))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPackages()) { index = numberOfPackages() - 1; }
      packages.remove(aPackage);
      packages.add(index, aPackage);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePackageAt(EcorePackage aPackage, int index)
  {
    boolean wasAdded = false;
    if(packages.contains(aPackage))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPackages()) { index = numberOfPackages() - 1; }
      packages.remove(aPackage);
      packages.add(index, aPackage);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPackageAt(aPackage, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    packages.clear();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 15 "../../../../src/Generator_CodeEcore_Model.ump"
  static Map<String, String> ecorePrimitiveTypeMap ;
// line 16 "../../../../src/Generator_CodeEcore_Model.ump"
  static Map<String, String[]> ecoreGenericTypeMap ;
// line 17 "../../../../src/Generator_CodeEcore_Model.ump"
  static Map<String, String> umplePrimitiveTypeMap ;

// line 19 "../../../../src/Generator_CodeEcore_Model.ump"
  static 
  {
    // Map for Ecore primitive Types
      ecorePrimitiveTypeMap = new HashMap<String, String>();
      ecorePrimitiveTypeMap.put("Integer", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt");
      ecorePrimitiveTypeMap.put("Float", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EFloat");
      ecorePrimitiveTypeMap.put("String", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString");
      ecorePrimitiveTypeMap.put("Double", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDouble");
      ecorePrimitiveTypeMap.put("Boolean", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBoolean");
      ecorePrimitiveTypeMap.put("java.math.BigDecimal", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBigDecimal");
      ecorePrimitiveTypeMap.put("java.math.BigInteger", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBigInteger");
      ecorePrimitiveTypeMap.put("char", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EChar");
      ecorePrimitiveTypeMap.put("java.lang.Character", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//ECharacterObject");
      ecorePrimitiveTypeMap.put("java.lang.Object", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EJavaObject");

      ecoreGenericTypeMap = new HashMap<String, String[]>();
      ecoreGenericTypeMap.put("java.util.List", new String[]{"1", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EEList"});
      ecoreGenericTypeMap.put("java.util.Map", new String[]{"2", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EMap"});
      ecoreGenericTypeMap.put("java.lang.Class", new String[]{"1", "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EJavaClass"});
      
      umplePrimitiveTypeMap = new HashMap<String, String>();
      umplePrimitiveTypeMap.put("Time", "java.sql.Time");
      umplePrimitiveTypeMap.put("Date", "java.sql.Date");
  }

  
}