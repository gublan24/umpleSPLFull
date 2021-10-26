/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * This class keeps references to mixsets which are iside methods
 */
// line 95 "../../../../src/Mixset.ump"
public class MixsetInMethod
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MixsetInMethod Attributes
  private String mixsetName;
  private int startPositionIndex;
  private int endPositionIndex;
  private MixsetInMethod parentInnerMixset;
  private List<MixsetInMethod> childMixsets;
  private String mixsetFragment;

  //MixsetInMethod Associations
  private MethodBody methodBody;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MixsetInMethod(String aMixsetName, int aStartPositionIndex, int aEndPositionIndex, String aMixsetFragment)
  {
    mixsetName = aMixsetName;
    startPositionIndex = aStartPositionIndex;
    endPositionIndex = aEndPositionIndex;
    parentInnerMixset = null;
    childMixsets = new ArrayList<MixsetInMethod>();
    mixsetFragment = aMixsetFragment;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMixsetName(String aMixsetName)
  {
    boolean wasSet = false;
    mixsetName = aMixsetName;
    wasSet = true;
    return wasSet;
  }

  public boolean setStartPositionIndex(int aStartPositionIndex)
  {
    boolean wasSet = false;
    startPositionIndex = aStartPositionIndex;
    wasSet = true;
    return wasSet;
  }

  public boolean setEndPositionIndex(int aEndPositionIndex)
  {
    boolean wasSet = false;
    endPositionIndex = aEndPositionIndex;
    wasSet = true;
    return wasSet;
  }

  public boolean setParentInnerMixset(MixsetInMethod aParentInnerMixset)
  {
    boolean wasSet = false;
    parentInnerMixset = aParentInnerMixset;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addChildMixset(MixsetInMethod aChildMixset)
  {
    boolean wasAdded = false;
    wasAdded = childMixsets.add(aChildMixset);
    return wasAdded;
  }

  public boolean removeChildMixset(MixsetInMethod aChildMixset)
  {
    boolean wasRemoved = false;
    wasRemoved = childMixsets.remove(aChildMixset);
    return wasRemoved;
  }

  public boolean setMixsetFragment(String aMixsetFragment)
  {
    boolean wasSet = false;
    mixsetFragment = aMixsetFragment;
    wasSet = true;
    return wasSet;
  }

  public String getMixsetName()
  {
    return mixsetName;
  }

  /**
   * relative to the original body of the method
   */
  public int getStartPositionIndex()
  {
    return startPositionIndex;
  }

  public int getEndPositionIndex()
  {
    return endPositionIndex;
  }

  /**
   * to determine if its inner mixset
   */
  public MixsetInMethod getParentInnerMixset()
  {
    return parentInnerMixset;
  }
  /* Code from template attribute_GetMany */
  public MixsetInMethod getChildMixset(int index)
  {
    MixsetInMethod aChildMixset = childMixsets.get(index);
    return aChildMixset;
  }

  public MixsetInMethod[] getChildMixsets()
  {
    MixsetInMethod[] newChildMixsets = childMixsets.toArray(new MixsetInMethod[childMixsets.size()]);
    return newChildMixsets;
  }

  public int numberOfChildMixsets()
  {
    int number = childMixsets.size();
    return number;
  }

  public boolean hasChildMixsets()
  {
    boolean has = childMixsets.size() > 0;
    return has;
  }

  public int indexOfChildMixset(MixsetInMethod aChildMixset)
  {
    int index = childMixsets.indexOf(aChildMixset);
    return index;
  }

  public String getMixsetFragment()
  {
    return mixsetFragment;
  }
  /* Code from template association_GetOne */
  public MethodBody getMethodBody()
  {
    return methodBody;
  }

  public boolean hasMethodBody()
  {
    boolean has = methodBody != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setMethodBody(MethodBody aMethodBody)
  {
    boolean wasSet = false;
    MethodBody existingMethodBody = methodBody;
    methodBody = aMethodBody;
    if (existingMethodBody != null && !existingMethodBody.equals(aMethodBody))
    {
      existingMethodBody.removeMixsetInMethod(this);
    }
    if (aMethodBody != null)
    {
      aMethodBody.addMixsetInMethod(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (methodBody != null)
    {
      MethodBody placeholderMethodBody = methodBody;
      this.methodBody = null;
      placeholderMethodBody.removeMixsetInMethod(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "mixsetName" + ":" + getMixsetName()+ "," +
            "startPositionIndex" + ":" + getStartPositionIndex()+ "," +
            "endPositionIndex" + ":" + getEndPositionIndex()+ "," +
            "mixsetFragment" + ":" + getMixsetFragment()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parentInnerMixset" + "=" + (getParentInnerMixset() != null ? !getParentInnerMixset().equals(this)  ? getParentInnerMixset().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "methodBody = "+(getMethodBody()!=null?Integer.toHexString(System.identityHashCode(getMethodBody())):"null");
  }
}