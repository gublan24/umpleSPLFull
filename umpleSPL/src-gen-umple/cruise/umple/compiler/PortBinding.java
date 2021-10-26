/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 62 "../../../../src/Structure.ump"
public class PortBinding
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PortBinding Attributes
  private UmpleVariable fromSubcomponent;
  private UmpleVariable toSubcomponent;

  //PortBinding Associations
  private Port fromPort;
  private Port toPort;
  private AnonymousFunction specialHandler;
  private UmpleClass umpleClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PortBinding(Port aFromPort, Port aToPort)
  {
    boolean didAddFromPort = setFromPort(aFromPort);
    if (!didAddFromPort)
    {
      throw new RuntimeException("Unable to create portBinding due to fromPort. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddToPort = setToPort(aToPort);
    if (!didAddToPort)
    {
      throw new RuntimeException("Unable to create connector due to toPort. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setFromSubcomponent(UmpleVariable aFromSubcomponent)
  {
    boolean wasSet = false;
    fromSubcomponent = aFromSubcomponent;
    wasSet = true;
    return wasSet;
  }

  public boolean setToSubcomponent(UmpleVariable aToSubcomponent)
  {
    boolean wasSet = false;
    toSubcomponent = aToSubcomponent;
    wasSet = true;
    return wasSet;
  }

  public UmpleVariable getFromSubcomponent()
  {
    return fromSubcomponent;
  }

  public UmpleVariable getToSubcomponent()
  {
    return toSubcomponent;
  }
  /* Code from template association_GetOne */
  public Port getFromPort()
  {
    return fromPort;
  }
  /* Code from template association_GetOne */
  public Port getToPort()
  {
    return toPort;
  }
  /* Code from template association_GetOne */
  public AnonymousFunction getSpecialHandler()
  {
    return specialHandler;
  }

  public boolean hasSpecialHandler()
  {
    boolean has = specialHandler != null;
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
  /* Code from template association_SetOneToMany */
  public boolean setFromPort(Port aFromPort)
  {
    boolean wasSet = false;
    if (aFromPort == null)
    {
      return wasSet;
    }

    Port existingFromPort = fromPort;
    fromPort = aFromPort;
    if (existingFromPort != null && !existingFromPort.equals(aFromPort))
    {
      existingFromPort.removePortBinding(this);
    }
    fromPort.addPortBinding(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setToPort(Port aToPort)
  {
    boolean wasSet = false;
    if (aToPort == null)
    {
      return wasSet;
    }

    Port existingToPort = toPort;
    toPort = aToPort;
    if (existingToPort != null && !existingToPort.equals(aToPort))
    {
      existingToPort.removeConnector(this);
    }
    toPort.addConnector(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setSpecialHandler(AnonymousFunction aNewSpecialHandler)
  {
    boolean wasSet = false;
    specialHandler = aNewSpecialHandler;
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
      existingUmpleClass.removePortBinding(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addPortBinding(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Port placeholderFromPort = fromPort;
    this.fromPort = null;
    if(placeholderFromPort != null)
    {
      placeholderFromPort.removePortBinding(this);
    }
    Port placeholderToPort = toPort;
    this.toPort = null;
    if(placeholderToPort != null)
    {
      placeholderToPort.removeConnector(this);
    }
    specialHandler = null;
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removePortBinding(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "fromSubcomponent" + "=" + (getFromSubcomponent() != null ? !getFromSubcomponent().equals(this)  ? getFromSubcomponent().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "toSubcomponent" + "=" + (getToSubcomponent() != null ? !getToSubcomponent().equals(this)  ? getToSubcomponent().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "fromPort = "+(getFromPort()!=null?Integer.toHexString(System.identityHashCode(getFromPort())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "toPort = "+(getToPort()!=null?Integer.toHexString(System.identityHashCode(getToPort())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "specialHandler = "+(getSpecialHandler()!=null?Integer.toHexString(System.identityHashCode(getSpecialHandler())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null");
  }
}