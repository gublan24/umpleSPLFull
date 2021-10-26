/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 193 "../../../../src/Structure.ump"
public class DeferredFunction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DeferredFunction Attributes
  private String methodInvoke;
  private List<String> parameters;

  //DeferredFunction State Machines
  public enum DeferredCallType { PORT, ANONYMOUS, METHOD }
  private DeferredCallType deferredCallType;

  //DeferredFunction Associations
  private PortFunction portFunction;
  private AnonymousFunction anonymousFunction;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DeferredFunction()
  {
    methodInvoke = null;
    parameters = new ArrayList<String>();
    setDeferredCallType(DeferredCallType.PORT);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMethodInvoke(String aMethodInvoke)
  {
    boolean wasSet = false;
    methodInvoke = aMethodInvoke;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addParameter(String aParameter)
  {
    boolean wasAdded = false;
    wasAdded = parameters.add(aParameter);
    return wasAdded;
  }

  public boolean removeParameter(String aParameter)
  {
    boolean wasRemoved = false;
    wasRemoved = parameters.remove(aParameter);
    return wasRemoved;
  }

  public String getMethodInvoke()
  {
    return methodInvoke;
  }
  /* Code from template attribute_GetMany */
  public String getParameter(int index)
  {
    String aParameter = parameters.get(index);
    return aParameter;
  }

  public String[] getParameters()
  {
    String[] newParameters = parameters.toArray(new String[parameters.size()]);
    return newParameters;
  }

  public int numberOfParameters()
  {
    int number = parameters.size();
    return number;
  }

  public boolean hasParameters()
  {
    boolean has = parameters.size() > 0;
    return has;
  }

  public int indexOfParameter(String aParameter)
  {
    int index = parameters.indexOf(aParameter);
    return index;
  }

  public String getDeferredCallTypeFullName()
  {
    String answer = deferredCallType.toString();
    return answer;
  }

  public DeferredCallType getDeferredCallType()
  {
    return deferredCallType;
  }

  public boolean setDeferredCallType(DeferredCallType aDeferredCallType)
  {
    deferredCallType = aDeferredCallType;
    return true;
  }
  /* Code from template association_GetOne */
  public PortFunction getPortFunction()
  {
    return portFunction;
  }

  public boolean hasPortFunction()
  {
    boolean has = portFunction != null;
    return has;
  }
  /* Code from template association_GetOne */
  public AnonymousFunction getAnonymousFunction()
  {
    return anonymousFunction;
  }

  public boolean hasAnonymousFunction()
  {
    boolean has = anonymousFunction != null;
    return has;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setPortFunction(PortFunction aNewPortFunction)
  {
    boolean wasSet = false;
    portFunction = aNewPortFunction;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setAnonymousFunction(AnonymousFunction aNewAnonymousFunction)
  {
    boolean wasSet = false;
    anonymousFunction = aNewAnonymousFunction;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    portFunction = null;
    anonymousFunction = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "methodInvoke" + ":" + getMethodInvoke()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "portFunction = "+(getPortFunction()!=null?Integer.toHexString(System.identityHashCode(getPortFunction())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "anonymousFunction = "+(getAnonymousFunction()!=null?Integer.toHexString(System.identityHashCode(getAnonymousFunction())):"null");
  }
}