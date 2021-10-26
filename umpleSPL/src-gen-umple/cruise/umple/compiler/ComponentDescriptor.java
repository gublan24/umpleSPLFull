/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 17 "../../../../src/Generator_CodeStructureDiagram.ump"
public class ComponentDescriptor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ComponentDescriptor Attributes
  private String type;
  private List<PairDescriptor> descriptors;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ComponentDescriptor(String aType)
  {
    type = aType;
    descriptors = new ArrayList<PairDescriptor>();
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
  /* Code from template attribute_SetMany */
  public boolean addDescriptor(PairDescriptor aDescriptor)
  {
    boolean wasAdded = false;
    wasAdded = descriptors.add(aDescriptor);
    return wasAdded;
  }

  public boolean removeDescriptor(PairDescriptor aDescriptor)
  {
    boolean wasRemoved = false;
    wasRemoved = descriptors.remove(aDescriptor);
    return wasRemoved;
  }

  public String getType()
  {
    return type;
  }
  /* Code from template attribute_GetMany */
  public PairDescriptor getDescriptor(int index)
  {
    PairDescriptor aDescriptor = descriptors.get(index);
    return aDescriptor;
  }

  public PairDescriptor[] getDescriptors()
  {
    PairDescriptor[] newDescriptors = descriptors.toArray(new PairDescriptor[descriptors.size()]);
    return newDescriptors;
  }

  public int numberOfDescriptors()
  {
    int number = descriptors.size();
    return number;
  }

  public boolean hasDescriptors()
  {
    boolean has = descriptors.size() > 0;
    return has;
  }

  public int indexOfDescriptor(PairDescriptor aDescriptor)
  {
    int index = descriptors.indexOf(aDescriptor);
    return index;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "type" + ":" + getType()+ "]";
  }
}