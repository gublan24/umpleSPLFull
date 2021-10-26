/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * object element is any element with type value and name, such as attribute or Umple element.
 */
// line 1225 "../../../../src/Umple.ump"
public class ObjectElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ObjectElement Attributes
  private String type;
  private String name;
  private String value;

  //ObjectElement Associations
  private UmpleObject umpleObject;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ObjectElement(String aType, String aName, String aValue)
  {
    type = aType;
    name = aName;
    value = aValue;
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

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    value = aValue;
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

  public String getValue()
  {
    return value;
  }
  /* Code from template association_GetOne */
  public UmpleObject getUmpleObject()
  {
    return umpleObject;
  }

  public boolean hasUmpleObject()
  {
    boolean has = umpleObject != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleObject(UmpleObject aUmpleObject)
  {
    boolean wasSet = false;
    UmpleObject existingUmpleObject = umpleObject;
    umpleObject = aUmpleObject;
    if (existingUmpleObject != null && !existingUmpleObject.equals(aUmpleObject))
    {
      existingUmpleObject.removeObjectElement(this);
    }
    if (aUmpleObject != null)
    {
      aUmpleObject.addObjectElement(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (umpleObject != null)
    {
      UmpleObject placeholderUmpleObject = umpleObject;
      this.umpleObject = null;
      placeholderUmpleObject.removeObjectElement(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "type" + ":" + getType()+ "," +
            "name" + ":" + getName()+ "," +
            "value" + ":" + getValue()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "umpleObject = "+(getUmpleObject()!=null?Integer.toHexString(System.identityHashCode(getUmpleObject())):"null");
  }
}