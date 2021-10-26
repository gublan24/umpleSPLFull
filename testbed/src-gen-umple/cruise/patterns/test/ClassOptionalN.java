/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.patterns.test;
import java.util.*;

// line 63 "../../../../src/TestHarnessPatternsImmutable.ump"
public class ClassOptionalN
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassOptionalN Associations
  private List<ClassOtherclass> classOtherclasses;

  //Helper Variables
  private boolean canSetClassOtherclasses;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ClassOptionalN(ClassOtherclass... allClassOtherclasses)
  {
    canSetClassOtherclasses = true;
    classOtherclasses = new ArrayList<ClassOtherclass>();
    boolean didAddClassOtherclasses = setClassOtherclasses(allClassOtherclasses);
    if (!didAddClassOtherclasses)
    {
      throw new RuntimeException("Unable to create ClassOptionalN, must have 2 or fewer classOtherclasses, no duplicates. See http://manual.umple.org?RE001ViolationofImmutability.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public ClassOtherclass getClassOtherclass(int index)
  {
    ClassOtherclass aClassOtherclass = classOtherclasses.get(index);
    return aClassOtherclass;
  }

  public List<ClassOtherclass> getClassOtherclasses()
  {
    List<ClassOtherclass> newClassOtherclasses = Collections.unmodifiableList(classOtherclasses);
    return newClassOtherclasses;
  }

  public int numberOfClassOtherclasses()
  {
    int number = classOtherclasses.size();
    return number;
  }

  public boolean hasClassOtherclasses()
  {
    boolean has = classOtherclasses.size() > 0;
    return has;
  }

  public int indexOfClassOtherclass(ClassOtherclass aClassOtherclass)
  {
    int index = classOtherclasses.indexOf(aClassOtherclass);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfClassOtherclasses()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfClassOtherclasses()
  {
    return 2;
  }
  /* Code from template association_SetUnidirectionalOptionalN */
  private boolean setClassOtherclasses(ClassOtherclass... newClassOtherclasses)
  {
    boolean wasSet = false;
    if (!canSetClassOtherclasses) { return false; }
    canSetClassOtherclasses = false;
    ArrayList<ClassOtherclass> verifiedClassOtherclasses = new ArrayList<ClassOtherclass>();
    for (ClassOtherclass aClassOtherclass : newClassOtherclasses)
    {
      if (verifiedClassOtherclasses.contains(aClassOtherclass))
      {
        continue;
      }
      verifiedClassOtherclasses.add(aClassOtherclass);
    }

    if (verifiedClassOtherclasses.size() != newClassOtherclasses.length || verifiedClassOtherclasses.size() > maximumNumberOfClassOtherclasses())
    {
      return wasSet;
    }

    classOtherclasses.clear();
    classOtherclasses.addAll(verifiedClassOtherclasses);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {}

}