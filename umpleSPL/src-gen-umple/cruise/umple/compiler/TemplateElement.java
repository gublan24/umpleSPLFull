/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * A template element represents template contents to be built. It relies on a set of TemplateField
 */
// line 95 "../../../../src/Template.ump"
public abstract class TemplateElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TemplateElement Attributes
  private EmitResponse emitResponse;
  private Position position;
  private String content;
  private HashMap<UmpleClass,Integer> filledClasses;

  //TemplateElement Associations
  private List<TemplateField> fields;
  private List<TemplateElement> subElements;
  private TemplateAttributeParser templateAttributeParser;
  private TemplateElement parentElement;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TemplateElement(Position aPosition, String aContent)
  {
    position = aPosition;
    content = aContent;
    filledClasses = new HashMap<UmpleClass,Integer>();
    fields = new ArrayList<TemplateField>();
    subElements = new ArrayList<TemplateElement>();
    // line 110 "../../../../src/Template.ump"
    emitResponse = new EmitResponse();
        getEmitResponse().getJavaCode().append(content);
        getEmitResponse().getCppCode().append(content);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setContent(String aContent)
  {
    boolean wasSet = false;
    content = aContent;
    wasSet = true;
    // line 132 "../../../../src/Template.ump"
    emitResponse = new EmitResponse();
        getEmitResponse().getJavaCode().append(content);
        getEmitResponse().getCppCode().append(content);
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean setFilledClasses(HashMap<UmpleClass,Integer> aFilledClasses)
  {
    boolean wasSet = false;
    filledClasses = aFilledClasses;
    wasSet = true;
    return wasSet;
  }

  public Position getPosition()
  {
    return position;
  }

  public String getContent()
  {
    return content;
  }

  public HashMap<UmpleClass,Integer> getFilledClasses()
  {
    return filledClasses;
  }
  /* Code from template association_GetMany */
  public TemplateField getField(int index)
  {
    TemplateField aField = fields.get(index);
    return aField;
  }

  public List<TemplateField> getFields()
  {
    List<TemplateField> newFields = Collections.unmodifiableList(fields);
    return newFields;
  }

  public int numberOfFields()
  {
    int number = fields.size();
    return number;
  }

  public boolean hasFields()
  {
    boolean has = fields.size() > 0;
    return has;
  }

  public int indexOfField(TemplateField aField)
  {
    int index = fields.indexOf(aField);
    return index;
  }
  /* Code from template association_GetMany */
  public TemplateElement getSubElement(int index)
  {
    TemplateElement aSubElement = subElements.get(index);
    return aSubElement;
  }

  public List<TemplateElement> getSubElements()
  {
    List<TemplateElement> newSubElements = Collections.unmodifiableList(subElements);
    return newSubElements;
  }

  public int numberOfSubElements()
  {
    int number = subElements.size();
    return number;
  }

  public boolean hasSubElements()
  {
    boolean has = subElements.size() > 0;
    return has;
  }

  public int indexOfSubElement(TemplateElement aSubElement)
  {
    int index = subElements.indexOf(aSubElement);
    return index;
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
  public TemplateElement getParentElement()
  {
    return parentElement;
  }

  public boolean hasParentElement()
  {
    boolean has = parentElement != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFields()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addField(TemplateField aField)
  {
    boolean wasAdded = false;
    if (fields.contains(aField)) { return false; }
    TemplateElement existingTemplateElement = aField.getTemplateElement();
    if (existingTemplateElement == null)
    {
      aField.setTemplateElement(this);
    }
    else if (!this.equals(existingTemplateElement))
    {
      existingTemplateElement.removeField(aField);
      addField(aField);
    }
    else
    {
      fields.add(aField);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeField(TemplateField aField)
  {
    boolean wasRemoved = false;
    if (fields.contains(aField))
    {
      fields.remove(aField);
      aField.setTemplateElement(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFieldAt(TemplateField aField, int index)
  {  
    boolean wasAdded = false;
    if(addField(aField))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFields()) { index = numberOfFields() - 1; }
      fields.remove(aField);
      fields.add(index, aField);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFieldAt(TemplateField aField, int index)
  {
    boolean wasAdded = false;
    if(fields.contains(aField))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFields()) { index = numberOfFields() - 1; }
      fields.remove(aField);
      fields.add(index, aField);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFieldAt(aField, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSubElements()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addSubElement(TemplateElement aSubElement)
  {
    boolean wasAdded = false;
    if (subElements.contains(aSubElement)) { return false; }
    TemplateElement existingParentElement = aSubElement.getParentElement();
    if (existingParentElement == null)
    {
      aSubElement.setParentElement(this);
    }
    else if (!this.equals(existingParentElement))
    {
      existingParentElement.removeSubElement(aSubElement);
      addSubElement(aSubElement);
    }
    else
    {
      subElements.add(aSubElement);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeSubElement(TemplateElement aSubElement)
  {
    boolean wasRemoved = false;
    if (subElements.contains(aSubElement))
    {
      subElements.remove(aSubElement);
      aSubElement.setParentElement(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSubElementAt(TemplateElement aSubElement, int index)
  {  
    boolean wasAdded = false;
    if(addSubElement(aSubElement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSubElements()) { index = numberOfSubElements() - 1; }
      subElements.remove(aSubElement);
      subElements.add(index, aSubElement);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSubElementAt(TemplateElement aSubElement, int index)
  {
    boolean wasAdded = false;
    if(subElements.contains(aSubElement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSubElements()) { index = numberOfSubElements() - 1; }
      subElements.remove(aSubElement);
      subElements.add(index, aSubElement);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSubElementAt(aSubElement, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setTemplateAttributeParser(TemplateAttributeParser aTemplateAttributeParser)
  {
    boolean wasSet = false;
    TemplateAttributeParser existingTemplateAttributeParser = templateAttributeParser;
    templateAttributeParser = aTemplateAttributeParser;
    if (existingTemplateAttributeParser != null && !existingTemplateAttributeParser.equals(aTemplateAttributeParser))
    {
      existingTemplateAttributeParser.removeElement(this);
    }
    if (aTemplateAttributeParser != null)
    {
      aTemplateAttributeParser.addElement(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setParentElement(TemplateElement aParentElement)
  {
    boolean wasSet = false;
    TemplateElement existingParentElement = parentElement;
    parentElement = aParentElement;
    if (existingParentElement != null && !existingParentElement.equals(aParentElement))
    {
      existingParentElement.removeSubElement(this);
    }
    if (aParentElement != null)
    {
      aParentElement.addSubElement(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while( !fields.isEmpty() )
    {
      fields.get(0).setTemplateElement(null);
    }
    while( !subElements.isEmpty() )
    {
      subElements.get(0).setParentElement(null);
    }
    if (templateAttributeParser != null)
    {
      TemplateAttributeParser placeholderTemplateAttributeParser = templateAttributeParser;
      this.templateAttributeParser = null;
      placeholderTemplateAttributeParser.removeElement(this);
    }
    if (parentElement != null)
    {
      TemplateElement placeholderParentElement = parentElement;
      this.parentElement = null;
      placeholderParentElement.removeSubElement(this);
    }
  }

  // line 116 "../../../../src/Template.ump"
  public EmitResponse computeContent(){
    EmitResponse old = getEmitResponse();
    emitResponse = new EmitResponse();
    getEmitResponse().getJavaCode().append(old.getJavaCode());
    getEmitResponse().getCppCode().append(old.getCppCode());
    for(TemplateElement element:getSubElements())
    {
      EmitResponse resetValue = element.computeContent();
      getEmitResponse().getJavaCode().append(element.getEmitResponse().getJavaCode().toString());
      getEmitResponse().getCppCode().append(element.getEmitResponse().getCppCode().toString());
      element.resetContent(resetValue);
    }
    return old;
  }

  // line 139 "../../../../src/Template.ump"
  public void resetContent(EmitResponse old){
    emitResponse = old;
  }

  // line 144 "../../../../src/Template.ump"
  public void append(String text){
    getEmitResponse().getJavaCode().append(text);
    getEmitResponse().getCppCode().append(text);
  }

  // line 150 "../../../../src/Template.ump"
  public EmitResponse getEmitResponse(){
    return emitResponse;
  }

  // line 153 "../../../../src/Template.ump"
  public void emit(EmitResponse responseBuffer, UmpleClass template) throws TemplateException{
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "content" + ":" + getContent()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "filledClasses" + "=" + (getFilledClasses() != null ? !getFilledClasses().equals(this)  ? getFilledClasses().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "templateAttributeParser = "+(getTemplateAttributeParser()!=null?Integer.toHexString(System.identityHashCode(getTemplateAttributeParser())):"null");
  }
}