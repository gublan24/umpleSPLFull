/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;
import java.util.*;

// line 72 "../../../../src/TestHarnessAttributes.ump"
public class ManyAttribute
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ManyAttribute Attributes
  private List<Integer> works;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ManyAttribute()
  {
    works = new ArrayList<Integer>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addWork(Integer aWork)
  {
    boolean wasAdded = false;
    wasAdded = works.add(aWork);
    return wasAdded;
  }

  public boolean removeWork(Integer aWork)
  {
    boolean wasRemoved = false;
    wasRemoved = works.remove(aWork);
    return wasRemoved;
  }
  /* Code from template attribute_GetMany */
  public Integer getWork(int index)
  {
    Integer aWork = works.get(index);
    return aWork;
  }

  public Integer[] getWorks()
  {
    Integer[] newWorks = works.toArray(new Integer[works.size()]);
    return newWorks;
  }

  public int numberOfWorks()
  {
    int number = works.size();
    return number;
  }

  public boolean hasWorks()
  {
    boolean has = works.size() > 0;
    return has;
  }

  public int indexOfWork(Integer aWork)
  {
    int index = works.indexOf(aWork);
    return index;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}