/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;
import java.util.*;

// line 77 "../../../../src/TestHarnessAttributes.ump"
public class ManyStringAttributes
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ManyStringAttributes Attributes
  private List<String> worksString;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ManyStringAttributes()
  {
    worksString = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addWorksString(String aWorksString)
  {
    boolean wasAdded = false;
    wasAdded = worksString.add(aWorksString);
    return wasAdded;
  }

  public boolean removeWorksString(String aWorksString)
  {
    boolean wasRemoved = false;
    wasRemoved = worksString.remove(aWorksString);
    return wasRemoved;
  }
  /* Code from template attribute_GetMany */
  public String getWorksString(int index)
  {
    String aWorksString = worksString.get(index);
    return aWorksString;
  }

  public String[] getWorksString()
  {
    String[] newWorksString = worksString.toArray(new String[worksString.size()]);
    return newWorksString;
  }

  public int numberOfWorksString()
  {
    int number = worksString.size();
    return number;
  }

  public boolean hasWorksString()
  {
    boolean has = worksString.size() > 0;
    return has;
  }

  public int indexOfWorksString(String aWorksString)
  {
    int index = worksString.indexOf(aWorksString);
    return index;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}