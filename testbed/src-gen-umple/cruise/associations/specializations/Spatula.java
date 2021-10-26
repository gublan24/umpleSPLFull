/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * Right multiplicity changed to one test                         [2]
 */
// line 38 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Spatula
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Spatula Associations
  private List<Apple> fruit;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Spatula()
  {
    fruit = new ArrayList<Apple>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Apple getFruit(int index)
  {
    Apple aFruit = fruit.get(index);
    return aFruit;
  }

  public List<Apple> getFruit()
  {
    List<Apple> newFruit = Collections.unmodifiableList(fruit);
    return newFruit;
  }

  public int numberOfFruit()
  {
    int number = fruit.size();
    return number;
  }

  public boolean hasFruit()
  {
    boolean has = fruit.size() > 0;
    return has;
  }

  public int indexOfFruit(Apple aFruit)
  {
    int index = fruit.indexOf(aFruit);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_fruit()
  {
    fruit.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Snapple getFruit_Snapple(int index)
  {
    Snapple aFruit = (Snapple)fruit.get(index);
    return aFruit;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Snapple> getFruit_Snapple()
  {
    List<? extends Apple> newFruit = Collections.unmodifiableList(fruit);
    return (List<Snapple>)newFruit;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfFruitValid()
  {
    boolean isValid = numberOfFruit() >= minimumNumberOfFruit() && numberOfFruit() <= maximumNumberOfFruit();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFruit()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfFruit()
  {
    return 4;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addFruit(Apple aFruit)
  {
    boolean wasAdded = false;
    if (fruit.contains(aFruit)) { return false; }
    if (fruit.contains(aFruit)) { return false; }
    if (numberOfFruit() >= maximumNumberOfFruit())
    {
      return wasAdded;
    }

    fruit.add(aFruit);
    if (aFruit.indexOfSpat(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aFruit.addSpat(this);
      if (!wasAdded)
      {
        fruit.remove(aFruit);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeFruit(Apple aFruit)
  {
    boolean wasRemoved = false;
    if (!fruit.contains(aFruit))
    {
      return wasRemoved;
    }

    if (numberOfFruit() <= minimumNumberOfFruit())
    {
      return wasRemoved;
    }

    int oldIndex = fruit.indexOf(aFruit);
    fruit.remove(oldIndex);
    if (aFruit.indexOfSpat(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aFruit.removeSpat(this);
      if (!wasRemoved)
      {
        fruit.add(oldIndex,aFruit);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFruitAt(Apple aFruit, int index)
  {  
    boolean wasAdded = false;
    if(addFruit(aFruit))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFruit()) { index = numberOfFruit() - 1; }
      fruit.remove(aFruit);
      fruit.add(index, aFruit);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFruitAt(Apple aFruit, int index)
  {
    boolean wasAdded = false;
    if(fruit.contains(aFruit))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFruit()) { index = numberOfFruit() - 1; }
      fruit.remove(aFruit);
      fruit.add(index, aFruit);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFruitAt(aFruit, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfFruit_Snapple()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod_relatedSpecialization */
  public static int maximumNumberOfFruit_Snapple()
  {
    return 3;
  }
  /* Code from template association_AddMNToOptionalOne_relatedSpecialization */
  public boolean addFruit(Snapple aFruit)
  {
    boolean wasAdded = false;
    if (fruit.contains(aFruit)) { return false; }
    if (fruit.contains(aFruit)) { return false; }
    if (numberOfFruit() >= maximumNumberOfFruit_Snapple())
    {
      return wasAdded;
    }
    Spatula existingSpat = aFruit.getSpat_OneSpatula();
    if (existingSpat != null && existingSpat.numberOfFruit() <= minimumNumberOfFruit_Snapple())
    {
      return wasAdded;
    }
    else if (existingSpat != null)
    {
      existingSpat.fruit.remove(aFruit);
    }
    fruit.add(aFruit);
    setSpat(aFruit,this);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeFruit(Snapple aFruit)
  {
    boolean wasRemoved = false;
    if (fruit.contains(aFruit) && numberOfFruit() > minimumNumberOfFruit_Snapple())
    {
      fruit.remove(aFruit);
      setSpat(aFruit,null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToOptionalOne_relatedSpecialization */
  public boolean setFruit_Snapple(Snapple... newFruit)
  {
    boolean wasSet = false;
    if (newFruit.length < minimumNumberOfFruit_Snapple() || newFruit.length > maximumNumberOfFruit_Snapple())
    {
      return wasSet;
    }

    ArrayList<Snapple> checkNewFruit = new ArrayList<Snapple>();
    HashMap<Spatula,Integer> spatToNewFruit = new HashMap<Spatula,Integer>();
    for (Snapple aFruit : newFruit)
    {
      if (checkNewFruit.contains(aFruit))
      {
        return wasSet;
      }
      else if (aFruit.getSpat(0) != null && !this.equals(aFruit.getSpat(0)))
      {
        Spatula existingSpat = aFruit.getSpat(0);
        if (!spatToNewFruit.containsKey(existingSpat))
        {
          spatToNewFruit.put(existingSpat, Integer.valueOf(existingSpat.numberOfFruit()));
        }
        Integer currentCount = spatToNewFruit.get(existingSpat);
        int nextCount = currentCount - 1;
        if (nextCount < 2)
        {
          return wasSet;
        }
        spatToNewFruit.put(existingSpat, Integer.valueOf(nextCount));
      }
      checkNewFruit.add(aFruit);
    }

    fruit.removeAll(checkNewFruit);

    for (Snapple orphan : getFruit_Snapple())
    {
      setSpat(orphan, null);
    }
    fruit.clear();
    for (Snapple aFruit : newFruit)
    {
      if (aFruit.getSpat(0) != null)
      {
        aFruit.getSpat(0).fruit.remove(aFruit);
      }
      setSpat(aFruit, this);
      fruit.add(aFruit);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setSpat(Snapple aFruit, Spatula aSpat)
  {
    try
    {
      java.lang.reflect.Field mentorField = aFruit.getClass().getDeclaredField("spat");
      mentorField.setAccessible(true);
      mentorField.set(aFruit, aSpat);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aSpat to aFruit", e);
    }
  }
  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */
  public boolean addFruitAt(Snapple aFruit, int index)
  {  
    boolean wasAdded = false;
    if(addFruit(aFruit))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFruit()) { index = numberOfFruit() - 1; }
      fruit.remove(aFruit);
      fruit.add(index, aFruit);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFruitAt(Snapple aFruit, int index)
  {
    boolean wasAdded = false;
    if(fruit.contains(aFruit))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFruit()) { index = numberOfFruit() - 1; }
      fruit.remove(aFruit);
      fruit.add(index, aFruit);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFruitAt(aFruit, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Apple> copyOfFruit = new ArrayList<Apple>(fruit);
    fruit.clear();
    for(Apple aFruit : copyOfFruit)
    {
      aFruit.removeSpat(this);
    }
  }

}