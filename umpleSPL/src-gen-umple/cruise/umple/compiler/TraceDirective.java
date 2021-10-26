/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * ----- Trace Directive MetaModel
 * A statement found in Umple that directs code to be generated
 * to trace a model element and generate output using some tracing tool
 */
// line 94 "../../../../src/Trace.ump"
public class TraceDirective
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static int nextId = 1;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Autounique Attributes
  private int id;

  //TraceDirective Associations
  private TracerDirective tracerDirective;
  private List<AttributeTraceItem> attributeTraceItems;
  private List<MethodTraceItem> methodTraceItems;
  private List<AssociationTraceItem> associationTraceItems;
  private List<TraceCondition> condition;
  private Postfix postfix;
  private TraceRecord traceRecord;
  private UmpleClass umpleClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TraceDirective(TracerDirective aTracerDirective)
  {
    id = nextId++;
    if (!setTracerDirective(aTracerDirective))
    {
      throw new RuntimeException("Unable to create TraceDirective due to aTracerDirective. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    attributeTraceItems = new ArrayList<AttributeTraceItem>();
    methodTraceItems = new ArrayList<MethodTraceItem>();
    associationTraceItems = new ArrayList<AssociationTraceItem>();
    condition = new ArrayList<TraceCondition>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getTracerType()
  {
    return getTracerDirective().getName();
  }

  public int getId()
  {
    return id;
  }
  /* Code from template association_GetOne */
  public TracerDirective getTracerDirective()
  {
    return tracerDirective;
  }
  /* Code from template association_GetMany */
  public AttributeTraceItem getAttributeTraceItem(int index)
  {
    AttributeTraceItem aAttributeTraceItem = attributeTraceItems.get(index);
    return aAttributeTraceItem;
  }

  public List<AttributeTraceItem> getAttributeTraceItems()
  {
    List<AttributeTraceItem> newAttributeTraceItems = Collections.unmodifiableList(attributeTraceItems);
    return newAttributeTraceItems;
  }

  public int numberOfAttributeTraceItems()
  {
    int number = attributeTraceItems.size();
    return number;
  }

  public boolean hasAttributeTraceItems()
  {
    boolean has = attributeTraceItems.size() > 0;
    return has;
  }

  public int indexOfAttributeTraceItem(AttributeTraceItem aAttributeTraceItem)
  {
    int index = attributeTraceItems.indexOf(aAttributeTraceItem);
    return index;
  }
  /* Code from template association_GetMany */
  public MethodTraceItem getMethodTraceItem(int index)
  {
    MethodTraceItem aMethodTraceItem = methodTraceItems.get(index);
    return aMethodTraceItem;
  }

  public List<MethodTraceItem> getMethodTraceItems()
  {
    List<MethodTraceItem> newMethodTraceItems = Collections.unmodifiableList(methodTraceItems);
    return newMethodTraceItems;
  }

  public int numberOfMethodTraceItems()
  {
    int number = methodTraceItems.size();
    return number;
  }

  public boolean hasMethodTraceItems()
  {
    boolean has = methodTraceItems.size() > 0;
    return has;
  }

  public int indexOfMethodTraceItem(MethodTraceItem aMethodTraceItem)
  {
    int index = methodTraceItems.indexOf(aMethodTraceItem);
    return index;
  }
  /* Code from template association_GetMany */
  public AssociationTraceItem getAssociationTraceItem(int index)
  {
    AssociationTraceItem aAssociationTraceItem = associationTraceItems.get(index);
    return aAssociationTraceItem;
  }

  public List<AssociationTraceItem> getAssociationTraceItems()
  {
    List<AssociationTraceItem> newAssociationTraceItems = Collections.unmodifiableList(associationTraceItems);
    return newAssociationTraceItems;
  }

  public int numberOfAssociationTraceItems()
  {
    int number = associationTraceItems.size();
    return number;
  }

  public boolean hasAssociationTraceItems()
  {
    boolean has = associationTraceItems.size() > 0;
    return has;
  }

  public int indexOfAssociationTraceItem(AssociationTraceItem aAssociationTraceItem)
  {
    int index = associationTraceItems.indexOf(aAssociationTraceItem);
    return index;
  }
  /* Code from template association_GetMany */
  public TraceCondition getCondition(int index)
  {
    TraceCondition aCondition = condition.get(index);
    return aCondition;
  }

  public List<TraceCondition> getCondition()
  {
    List<TraceCondition> newCondition = Collections.unmodifiableList(condition);
    return newCondition;
  }

  public int numberOfCondition()
  {
    int number = condition.size();
    return number;
  }

  public boolean hasCondition()
  {
    boolean has = condition.size() > 0;
    return has;
  }

  public int indexOfCondition(TraceCondition aCondition)
  {
    int index = condition.indexOf(aCondition);
    return index;
  }
  /* Code from template association_GetOne */
  public Postfix getPostfix()
  {
    return postfix;
  }

  public boolean hasPostfix()
  {
    boolean has = postfix != null;
    return has;
  }
  /* Code from template association_GetOne */
  public TraceRecord getTraceRecord()
  {
    return traceRecord;
  }

  public boolean hasTraceRecord()
  {
    boolean has = traceRecord != null;
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
  /* Code from template association_SetUnidirectionalOne */
  public boolean setTracerDirective(TracerDirective aNewTracerDirective)
  {
    boolean wasSet = false;
    if (aNewTracerDirective != null)
    {
      tracerDirective = aNewTracerDirective;
      wasSet = true;
    }
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAttributeTraceItems()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public AttributeTraceItem addAttributeTraceItem()
  {
    return new AttributeTraceItem(this);
  }

  public boolean addAttributeTraceItem(AttributeTraceItem aAttributeTraceItem)
  {
    boolean wasAdded = false;
    if (attributeTraceItems.contains(aAttributeTraceItem)) { return false; }
    TraceDirective existingTraceDirective = aAttributeTraceItem.getTraceDirective();
    boolean isNewTraceDirective = existingTraceDirective != null && !this.equals(existingTraceDirective);
    if (isNewTraceDirective)
    {
      aAttributeTraceItem.setTraceDirective(this);
    }
    else
    {
      attributeTraceItems.add(aAttributeTraceItem);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAttributeTraceItem(AttributeTraceItem aAttributeTraceItem)
  {
    boolean wasRemoved = false;
    //Unable to remove aAttributeTraceItem, as it must always have a traceDirective
    if (!this.equals(aAttributeTraceItem.getTraceDirective()))
    {
      attributeTraceItems.remove(aAttributeTraceItem);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAttributeTraceItemAt(AttributeTraceItem aAttributeTraceItem, int index)
  {  
    boolean wasAdded = false;
    if(addAttributeTraceItem(aAttributeTraceItem))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAttributeTraceItems()) { index = numberOfAttributeTraceItems() - 1; }
      attributeTraceItems.remove(aAttributeTraceItem);
      attributeTraceItems.add(index, aAttributeTraceItem);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAttributeTraceItemAt(AttributeTraceItem aAttributeTraceItem, int index)
  {
    boolean wasAdded = false;
    if(attributeTraceItems.contains(aAttributeTraceItem))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAttributeTraceItems()) { index = numberOfAttributeTraceItems() - 1; }
      attributeTraceItems.remove(aAttributeTraceItem);
      attributeTraceItems.add(index, aAttributeTraceItem);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAttributeTraceItemAt(aAttributeTraceItem, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMethodTraceItems()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public MethodTraceItem addMethodTraceItem()
  {
    return new MethodTraceItem(this);
  }

  public boolean addMethodTraceItem(MethodTraceItem aMethodTraceItem)
  {
    boolean wasAdded = false;
    if (methodTraceItems.contains(aMethodTraceItem)) { return false; }
    TraceDirective existingTraceDirective = aMethodTraceItem.getTraceDirective();
    boolean isNewTraceDirective = existingTraceDirective != null && !this.equals(existingTraceDirective);
    if (isNewTraceDirective)
    {
      aMethodTraceItem.setTraceDirective(this);
    }
    else
    {
      methodTraceItems.add(aMethodTraceItem);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMethodTraceItem(MethodTraceItem aMethodTraceItem)
  {
    boolean wasRemoved = false;
    //Unable to remove aMethodTraceItem, as it must always have a traceDirective
    if (!this.equals(aMethodTraceItem.getTraceDirective()))
    {
      methodTraceItems.remove(aMethodTraceItem);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMethodTraceItemAt(MethodTraceItem aMethodTraceItem, int index)
  {  
    boolean wasAdded = false;
    if(addMethodTraceItem(aMethodTraceItem))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMethodTraceItems()) { index = numberOfMethodTraceItems() - 1; }
      methodTraceItems.remove(aMethodTraceItem);
      methodTraceItems.add(index, aMethodTraceItem);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMethodTraceItemAt(MethodTraceItem aMethodTraceItem, int index)
  {
    boolean wasAdded = false;
    if(methodTraceItems.contains(aMethodTraceItem))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMethodTraceItems()) { index = numberOfMethodTraceItems() - 1; }
      methodTraceItems.remove(aMethodTraceItem);
      methodTraceItems.add(index, aMethodTraceItem);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMethodTraceItemAt(aMethodTraceItem, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAssociationTraceItems()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public AssociationTraceItem addAssociationTraceItem()
  {
    return new AssociationTraceItem(this);
  }

  public boolean addAssociationTraceItem(AssociationTraceItem aAssociationTraceItem)
  {
    boolean wasAdded = false;
    if (associationTraceItems.contains(aAssociationTraceItem)) { return false; }
    TraceDirective existingTraceDirective = aAssociationTraceItem.getTraceDirective();
    boolean isNewTraceDirective = existingTraceDirective != null && !this.equals(existingTraceDirective);
    if (isNewTraceDirective)
    {
      aAssociationTraceItem.setTraceDirective(this);
    }
    else
    {
      associationTraceItems.add(aAssociationTraceItem);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAssociationTraceItem(AssociationTraceItem aAssociationTraceItem)
  {
    boolean wasRemoved = false;
    //Unable to remove aAssociationTraceItem, as it must always have a traceDirective
    if (!this.equals(aAssociationTraceItem.getTraceDirective()))
    {
      associationTraceItems.remove(aAssociationTraceItem);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAssociationTraceItemAt(AssociationTraceItem aAssociationTraceItem, int index)
  {  
    boolean wasAdded = false;
    if(addAssociationTraceItem(aAssociationTraceItem))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociationTraceItems()) { index = numberOfAssociationTraceItems() - 1; }
      associationTraceItems.remove(aAssociationTraceItem);
      associationTraceItems.add(index, aAssociationTraceItem);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAssociationTraceItemAt(AssociationTraceItem aAssociationTraceItem, int index)
  {
    boolean wasAdded = false;
    if(associationTraceItems.contains(aAssociationTraceItem))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociationTraceItems()) { index = numberOfAssociationTraceItems() - 1; }
      associationTraceItems.remove(aAssociationTraceItem);
      associationTraceItems.add(index, aAssociationTraceItem);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAssociationTraceItemAt(aAssociationTraceItem, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCondition()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addCondition(TraceCondition aCondition)
  {
    boolean wasAdded = false;
    if (condition.contains(aCondition)) { return false; }
    condition.add(aCondition);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCondition(TraceCondition aCondition)
  {
    boolean wasRemoved = false;
    if (condition.contains(aCondition))
    {
      condition.remove(aCondition);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addConditionAt(TraceCondition aCondition, int index)
  {  
    boolean wasAdded = false;
    if(addCondition(aCondition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCondition()) { index = numberOfCondition() - 1; }
      condition.remove(aCondition);
      condition.add(index, aCondition);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveConditionAt(TraceCondition aCondition, int index)
  {
    boolean wasAdded = false;
    if(condition.contains(aCondition))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCondition()) { index = numberOfCondition() - 1; }
      condition.remove(aCondition);
      condition.add(index, aCondition);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addConditionAt(aCondition, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setPostfix(Postfix aNewPostfix)
  {
    boolean wasSet = false;
    if (postfix != null && !postfix.equals(aNewPostfix) && equals(postfix.getTraceDirective()))
    {
      //Unable to setPostfix, as existing postfix would become an orphan
      return wasSet;
    }

    postfix = aNewPostfix;
    TraceDirective anOldTraceDirective = aNewPostfix != null ? aNewPostfix.getTraceDirective() : null;

    if (!this.equals(anOldTraceDirective))
    {
      if (anOldTraceDirective != null)
      {
        anOldTraceDirective.postfix = null;
      }
      if (postfix != null)
      {
        postfix.setTraceDirective(this);
      }
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setTraceRecord(TraceRecord aNewTraceRecord)
  {
    boolean wasSet = false;
    if (traceRecord != null && !traceRecord.equals(aNewTraceRecord) && equals(traceRecord.getTraceDirective()))
    {
      //Unable to setTraceRecord, as existing traceRecord would become an orphan
      return wasSet;
    }

    traceRecord = aNewTraceRecord;
    TraceDirective anOldTraceDirective = aNewTraceRecord != null ? aNewTraceRecord.getTraceDirective() : null;

    if (!this.equals(anOldTraceDirective))
    {
      if (anOldTraceDirective != null)
      {
        anOldTraceDirective.traceRecord = null;
      }
      if (traceRecord != null)
      {
        traceRecord.setTraceDirective(this);
      }
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
      existingUmpleClass.removeTraceDirective(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addTraceDirective(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    tracerDirective = null;
    for(int i=attributeTraceItems.size(); i > 0; i--)
    {
      AttributeTraceItem aAttributeTraceItem = attributeTraceItems.get(i - 1);
      aAttributeTraceItem.delete();
    }
    for(int i=methodTraceItems.size(); i > 0; i--)
    {
      MethodTraceItem aMethodTraceItem = methodTraceItems.get(i - 1);
      aMethodTraceItem.delete();
    }
    for(int i=associationTraceItems.size(); i > 0; i--)
    {
      AssociationTraceItem aAssociationTraceItem = associationTraceItems.get(i - 1);
      aAssociationTraceItem.delete();
    }
    condition.clear();
    Postfix existingPostfix = postfix;
    postfix = null;
    if (existingPostfix != null)
    {
      existingPostfix.delete();
    }
    TraceRecord existingTraceRecord = traceRecord;
    traceRecord = null;
    if (existingTraceRecord != null)
    {
      existingTraceRecord.delete();
    }
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removeTraceDirective(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "tracerType" + ":" + getTracerType()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "tracerDirective = "+(getTracerDirective()!=null?Integer.toHexString(System.identityHashCode(getTracerDirective())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "postfix = "+(getPostfix()!=null?Integer.toHexString(System.identityHashCode(getPostfix())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "traceRecord = "+(getTraceRecord()!=null?Integer.toHexString(System.identityHashCode(getTraceRecord())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null");
  }
}