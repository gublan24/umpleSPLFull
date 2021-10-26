/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 235 "../../../../src/Trace.ump"
public class TraceRecord
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TraceRecord Attributes
  private boolean recordOnly;
  private List<String> record;

  //TraceRecord Associations
  private List<Attribute> attributes;
  private TraceDirective traceDirective;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TraceRecord(TraceDirective aTraceDirective)
  {
    recordOnly = false;
    record = new ArrayList<String>();
    attributes = new ArrayList<Attribute>();
    boolean didAddTraceDirective = setTraceDirective(aTraceDirective);
    if (!didAddTraceDirective)
    {
      throw new RuntimeException("Unable to create traceRecord due to traceDirective. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRecordOnly(boolean aRecordOnly)
  {
    boolean wasSet = false;
    recordOnly = aRecordOnly;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addRecord(String aRecord)
  {
    boolean wasAdded = false;
    wasAdded = record.add(aRecord);
    return wasAdded;
  }

  public boolean removeRecord(String aRecord)
  {
    boolean wasRemoved = false;
    wasRemoved = record.remove(aRecord);
    return wasRemoved;
  }

  public boolean getRecordOnly()
  {
    return recordOnly;
  }
  /* Code from template attribute_GetMany */
  public String getRecord(int index)
  {
    String aRecord = record.get(index);
    return aRecord;
  }

  public String[] getRecord()
  {
    String[] newRecord = record.toArray(new String[record.size()]);
    return newRecord;
  }

  public int numberOfRecord()
  {
    int number = record.size();
    return number;
  }

  public boolean hasRecord()
  {
    boolean has = record.size() > 0;
    return has;
  }

  public int indexOfRecord(String aRecord)
  {
    int index = record.indexOf(aRecord);
    return index;
  }
  /* Code from template association_GetMany */
  public Attribute getAttribute(int index)
  {
    Attribute aAttribute = attributes.get(index);
    return aAttribute;
  }

  public List<Attribute> getAttributes()
  {
    List<Attribute> newAttributes = Collections.unmodifiableList(attributes);
    return newAttributes;
  }

  public int numberOfAttributes()
  {
    int number = attributes.size();
    return number;
  }

  public boolean hasAttributes()
  {
    boolean has = attributes.size() > 0;
    return has;
  }

  public int indexOfAttribute(Attribute aAttribute)
  {
    int index = attributes.indexOf(aAttribute);
    return index;
  }
  /* Code from template association_GetOne */
  public TraceDirective getTraceDirective()
  {
    return traceDirective;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAttributes()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addAttribute(Attribute aAttribute)
  {
    boolean wasAdded = false;
    if (attributes.contains(aAttribute)) { return false; }
    attributes.add(aAttribute);
    if (aAttribute.indexOfTraceRecord(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAttribute.addTraceRecord(this);
      if (!wasAdded)
      {
        attributes.remove(aAttribute);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeAttribute(Attribute aAttribute)
  {
    boolean wasRemoved = false;
    if (!attributes.contains(aAttribute))
    {
      return wasRemoved;
    }

    int oldIndex = attributes.indexOf(aAttribute);
    attributes.remove(oldIndex);
    if (aAttribute.indexOfTraceRecord(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAttribute.removeTraceRecord(this);
      if (!wasRemoved)
      {
        attributes.add(oldIndex,aAttribute);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAttributeAt(Attribute aAttribute, int index)
  {  
    boolean wasAdded = false;
    if(addAttribute(aAttribute))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAttributes()) { index = numberOfAttributes() - 1; }
      attributes.remove(aAttribute);
      attributes.add(index, aAttribute);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAttributeAt(Attribute aAttribute, int index)
  {
    boolean wasAdded = false;
    if(attributes.contains(aAttribute))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAttributes()) { index = numberOfAttributes() - 1; }
      attributes.remove(aAttribute);
      attributes.add(index, aAttribute);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAttributeAt(aAttribute, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setTraceDirective(TraceDirective aNewTraceDirective)
  {
    boolean wasSet = false;
    if (aNewTraceDirective == null)
    {
      //Unable to setTraceDirective to null, as traceRecord must always be associated to a traceDirective
      return wasSet;
    }
    
    TraceRecord existingTraceRecord = aNewTraceDirective.getTraceRecord();
    if (existingTraceRecord != null && !equals(existingTraceRecord))
    {
      //Unable to setTraceDirective, the current traceDirective already has a traceRecord, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    TraceDirective anOldTraceDirective = traceDirective;
    traceDirective = aNewTraceDirective;
    traceDirective.setTraceRecord(this);

    if (anOldTraceDirective != null)
    {
      anOldTraceDirective.setTraceRecord(null);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Attribute> copyOfAttributes = new ArrayList<Attribute>(attributes);
    attributes.clear();
    for(Attribute aAttribute : copyOfAttributes)
    {
      aAttribute.removeTraceRecord(this);
    }
    TraceDirective existingTraceDirective = traceDirective;
    traceDirective = null;
    if (existingTraceDirective != null)
    {
      existingTraceDirective.setTraceRecord(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "recordOnly" + ":" + getRecordOnly()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "traceDirective = "+(getTraceDirective()!=null?Integer.toHexString(System.identityHashCode(getTraceDirective())):"null");
  }
}