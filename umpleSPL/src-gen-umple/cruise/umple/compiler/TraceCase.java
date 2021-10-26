/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Future work - initial implementation is done
 * A group of trace directives that can be switched on or off by other
 * trace directives
 */
// line 209 "../../../../src/Trace.ump"
public class TraceCase
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TraceCase Attributes
  private String name;
  private boolean activation;

  //TraceCase Associations
  private List<TraceDirective> traceDirectives;
  private UmpleClass umpleClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TraceCase()
  {
    name = null;
    activation = false;
    traceDirectives = new ArrayList<TraceDirective>();
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

  public boolean setActivation(boolean aActivation)
  {
    boolean wasSet = false;
    activation = aActivation;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public boolean getActivation()
  {
    return activation;
  }
  /* Code from template association_GetMany */
  public TraceDirective getTraceDirective(int index)
  {
    TraceDirective aTraceDirective = traceDirectives.get(index);
    return aTraceDirective;
  }

  public List<TraceDirective> getTraceDirectives()
  {
    List<TraceDirective> newTraceDirectives = Collections.unmodifiableList(traceDirectives);
    return newTraceDirectives;
  }

  public int numberOfTraceDirectives()
  {
    int number = traceDirectives.size();
    return number;
  }

  public boolean hasTraceDirectives()
  {
    boolean has = traceDirectives.size() > 0;
    return has;
  }

  public int indexOfTraceDirective(TraceDirective aTraceDirective)
  {
    int index = traceDirectives.indexOf(aTraceDirective);
    return index;
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTraceDirectives()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addTraceDirective(TraceDirective aTraceDirective)
  {
    boolean wasAdded = false;
    if (traceDirectives.contains(aTraceDirective)) { return false; }
    traceDirectives.add(aTraceDirective);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTraceDirective(TraceDirective aTraceDirective)
  {
    boolean wasRemoved = false;
    if (traceDirectives.contains(aTraceDirective))
    {
      traceDirectives.remove(aTraceDirective);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTraceDirectiveAt(TraceDirective aTraceDirective, int index)
  {  
    boolean wasAdded = false;
    if(addTraceDirective(aTraceDirective))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTraceDirectives()) { index = numberOfTraceDirectives() - 1; }
      traceDirectives.remove(aTraceDirective);
      traceDirectives.add(index, aTraceDirective);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTraceDirectiveAt(TraceDirective aTraceDirective, int index)
  {
    boolean wasAdded = false;
    if(traceDirectives.contains(aTraceDirective))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTraceDirectives()) { index = numberOfTraceDirectives() - 1; }
      traceDirectives.remove(aTraceDirective);
      traceDirectives.add(index, aTraceDirective);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTraceDirectiveAt(aTraceDirective, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasSet = false;
    UmpleClass existingUmpleClass = umpleClass;
    umpleClass = aUmpleClass;
    if (existingUmpleClass != null && !existingUmpleClass.equals(aUmpleClass))
    {
      existingUmpleClass.removeTraceCase(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addTraceCase(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    traceDirectives.clear();
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removeTraceCase(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "activation" + ":" + getActivation()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null");
  }
}