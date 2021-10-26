/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * A template filed reprsents a field with a value for emitting purposes
 */
// line 74 "../../../../src/Template.ump"
public class TemplateField
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String TEMPLATE_TEXT_FIELD = "TEXT_";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TemplateField Attributes
  private String name;
  private EmitResponse value;

  //TemplateField Associations
  private TemplateAttributeParser templateAttributeParser;
  private UmpleClass umpleClass;
  private TemplateElement templateElement;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TemplateField(String aName, EmitResponse aValue)
  {
    name = aName;
    value = aValue;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setValue(EmitResponse aValue)
  {
    boolean wasSet = false;
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public EmitResponse getValue()
  {
    return value;
  }
  /* Code from template association_GetOne */
  public TemplateAttributeParser getTemplateAttributeParser()
  {
    return templateAttributeParser;
  }

  public boolean hasTemplateAttributeParser()
  {
    boolean has = templateAttributeParser != null;
    return has;
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
  public TemplateElement getTemplateElement()
  {
    return templateElement;
  }

  public boolean hasTemplateElement()
  {
    boolean has = templateElement != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setTemplateAttributeParser(TemplateAttributeParser aTemplateAttributeParser)
  {
    boolean wasSet = false;
    TemplateAttributeParser existingTemplateAttributeParser = templateAttributeParser;
    templateAttributeParser = aTemplateAttributeParser;
    if (existingTemplateAttributeParser != null && !existingTemplateAttributeParser.equals(aTemplateAttributeParser))
    {
      existingTemplateAttributeParser.removeField(this);
    }
    if (aTemplateAttributeParser != null)
    {
      aTemplateAttributeParser.addField(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasSet = false;
    UmpleClass existingUmpleClass = umpleClass;
    umpleClass = aUmpleClass;
    if (existingUmpleClass != null && !existingUmpleClass.equals(aUmpleClass))
    {
      existingUmpleClass.removeTemplateField(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addTemplateField(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setTemplateElement(TemplateElement aTemplateElement)
  {
    boolean wasSet = false;
    TemplateElement existingTemplateElement = templateElement;
    templateElement = aTemplateElement;
    if (existingTemplateElement != null && !existingTemplateElement.equals(aTemplateElement))
    {
      existingTemplateElement.removeField(this);
    }
    if (aTemplateElement != null)
    {
      aTemplateElement.addField(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (templateAttributeParser != null)
    {
      TemplateAttributeParser placeholderTemplateAttributeParser = templateAttributeParser;
      this.templateAttributeParser = null;
      placeholderTemplateAttributeParser.removeField(this);
    }
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removeTemplateField(this);
    }
    if (templateElement != null)
    {
      TemplateElement placeholderTemplateElement = templateElement;
      this.templateElement = null;
      placeholderTemplateElement.removeField(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "value" + "=" + (getValue() != null ? !getValue().equals(this)  ? getValue().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "templateAttributeParser = "+(getTemplateAttributeParser()!=null?Integer.toHexString(System.identityHashCode(getTemplateAttributeParser())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "templateElement = "+(getTemplateElement()!=null?Integer.toHexString(System.identityHashCode(getTemplateElement())):"null");
  }
}