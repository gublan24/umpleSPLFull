/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 48 "../../../../src/Trace.ump"
public class TracerArgument
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TracerArgument Attributes
  private String argument;

  //TracerArgument Associations
  private TracerDirective tracerDirective;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TracerArgument(String aArgument, TracerDirective aTracerDirective)
  {
    argument = aArgument;
    boolean didAddTracerDirective = setTracerDirective(aTracerDirective);
    if (!didAddTracerDirective)
    {
      throw new RuntimeException("Unable to create tracerArgument due to tracerDirective. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setArgument(String aArgument)
  {
    boolean wasSet = false;
    argument = aArgument;
    wasSet = true;
    return wasSet;
  }

  public String getArgument()
  {
    return argument;
  }
  /* Code from template association_GetOne */
  public TracerDirective getTracerDirective()
  {
    return tracerDirective;
  }
  /* Code from template association_SetOneToMany */
  public boolean setTracerDirective(TracerDirective aTracerDirective)
  {
    boolean wasSet = false;
    if (aTracerDirective == null)
    {
      return wasSet;
    }

    TracerDirective existingTracerDirective = tracerDirective;
    tracerDirective = aTracerDirective;
    if (existingTracerDirective != null && !existingTracerDirective.equals(aTracerDirective))
    {
      existingTracerDirective.removeTracerArgument(this);
    }
    tracerDirective.addTracerArgument(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    TracerDirective placeholderTracerDirective = tracerDirective;
    this.tracerDirective = null;
    if(placeholderTracerDirective != null)
    {
      placeholderTracerDirective.removeTracerArgument(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "argument" + ":" + getArgument()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "tracerDirective = "+(getTracerDirective()!=null?Integer.toHexString(System.identityHashCode(getTracerDirective())):"null");
  }
}