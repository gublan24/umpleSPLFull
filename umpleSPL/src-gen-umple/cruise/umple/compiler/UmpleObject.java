/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * UmpleObject is used to initialize classes
 */
// line 1217 "../../../../src/Umple.ump"
public class UmpleObject
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleObject Attributes
  private String type;
  private String name;

  //UmpleObject Associations
  private List<ObjectElement> objectElements;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleObject(String aType, String aName)
  {
    type = aType;
    name = aName;
    objectElements = new ArrayList<ObjectElement>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public String getType()
  {
    return type;
  }

  public String getName()
  {
    return name;
  }
  /* Code from template association_GetMany */
  public ObjectElement getObjectElement(int index)
  {
    ObjectElement aObjectElement = objectElements.get(index);
    return aObjectElement;
  }

  public List<ObjectElement> getObjectElements()
  {
    List<ObjectElement> newObjectElements = Collections.unmodifiableList(objectElements);
    return newObjectElements;
  }

  public int numberOfObjectElements()
  {
    int number = objectElements.size();
    return number;
  }

  public boolean hasObjectElements()
  {
    boolean has = objectElements.size() > 0;
    return has;
  }

  public int indexOfObjectElement(ObjectElement aObjectElement)
  {
    int index = objectElements.indexOf(aObjectElement);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfObjectElements()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addObjectElement(ObjectElement aObjectElement)
  {
    boolean wasAdded = false;
    if (objectElements.contains(aObjectElement)) { return false; }
    UmpleObject existingUmpleObject = aObjectElement.getUmpleObject();
    if (existingUmpleObject == null)
    {
      aObjectElement.setUmpleObject(this);
    }
    else if (!this.equals(existingUmpleObject))
    {
      existingUmpleObject.removeObjectElement(aObjectElement);
      addObjectElement(aObjectElement);
    }
    else
    {
      objectElements.add(aObjectElement);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeObjectElement(ObjectElement aObjectElement)
  {
    boolean wasRemoved = false;
    if (objectElements.contains(aObjectElement))
    {
      objectElements.remove(aObjectElement);
      aObjectElement.setUmpleObject(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addObjectElementAt(ObjectElement aObjectElement, int index)
  {  
    boolean wasAdded = false;
    if(addObjectElement(aObjectElement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfObjectElements()) { index = numberOfObjectElements() - 1; }
      objectElements.remove(aObjectElement);
      objectElements.add(index, aObjectElement);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveObjectElementAt(ObjectElement aObjectElement, int index)
  {
    boolean wasAdded = false;
    if(objectElements.contains(aObjectElement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfObjectElements()) { index = numberOfObjectElements() - 1; }
      objectElements.remove(aObjectElement);
      objectElements.add(index, aObjectElement);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addObjectElementAt(aObjectElement, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !objectElements.isEmpty() )
    {
      objectElements.get(0).setUmpleObject(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "type" + ":" + getType()+ "," +
            "name" + ":" + getName()+ "]";
  }
}