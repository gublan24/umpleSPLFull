/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.util.*;
import java.util.*;

// line 1182 "../../../../src/Umple.ump"
public class UmpleTemplate extends UmpleClass
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleTemplate Associations
  private List<UmpleClass> subClasses;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleTemplate(String aName, UmpleModel aSourceModel)
  {
    super(aName, aSourceModel);
    subClasses = new ArrayList<UmpleClass>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public UmpleClass getSubClass(int index)
  {
    UmpleClass aSubClass = subClasses.get(index);
    return aSubClass;
  }

  public List<UmpleClass> getSubClasses()
  {
    List<UmpleClass> newSubClasses = Collections.unmodifiableList(subClasses);
    return newSubClasses;
  }

  public int numberOfSubClasses()
  {
    int number = subClasses.size();
    return number;
  }

  public boolean hasSubClasses()
  {
    boolean has = subClasses.size() > 0;
    return has;
  }

  public int indexOfSubClass(UmpleClass aSubClass)
  {
    int index = subClasses.indexOf(aSubClass);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSubClasses()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSubClass(UmpleClass aSubClass)
  {
    boolean wasAdded = false;
    if (subClasses.contains(aSubClass)) { return false; }
    subClasses.add(aSubClass);
    if (aSubClass.indexOfExtendsTemplate(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSubClass.addExtendsTemplate(this);
      if (!wasAdded)
      {
        subClasses.remove(aSubClass);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSubClass(UmpleClass aSubClass)
  {
    boolean wasRemoved = false;
    if (!subClasses.contains(aSubClass))
    {
      return wasRemoved;
    }

    int oldIndex = subClasses.indexOf(aSubClass);
    subClasses.remove(oldIndex);
    if (aSubClass.indexOfExtendsTemplate(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSubClass.removeExtendsTemplate(this);
      if (!wasRemoved)
      {
        subClasses.add(oldIndex,aSubClass);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSubClassAt(UmpleClass aSubClass, int index)
  {  
    boolean wasAdded = false;
    if(addSubClass(aSubClass))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSubClasses()) { index = numberOfSubClasses() - 1; }
      subClasses.remove(aSubClass);
      subClasses.add(index, aSubClass);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSubClassAt(UmpleClass aSubClass, int index)
  {
    boolean wasAdded = false;
    if(subClasses.contains(aSubClass))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSubClasses()) { index = numberOfSubClasses() - 1; }
      subClasses.remove(aSubClass);
      subClasses.add(index, aSubClass);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSubClassAt(aSubClass, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<UmpleClass> copyOfSubClasses = new ArrayList<UmpleClass>(subClasses);
    subClasses.clear();
    for(UmpleClass aSubClass : copyOfSubClasses)
    {
      aSubClass.removeExtendsTemplate(this);
    }
    super.delete();
  }

}