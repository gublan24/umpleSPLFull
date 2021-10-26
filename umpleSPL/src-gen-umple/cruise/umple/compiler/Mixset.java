/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * A mixset is a block of code that may or may not be included by a use statement
 * It consists of one or more fragments that are encountered anywhere in the Umple source
 * including in other mixsets
 */
// line 40 "../../../../src/Mixset.ump"
public class Mixset extends MixsetOrFile
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Mixset Attributes
  private String mixsetName;
  private boolean isFeature;

  //Mixset Associations
  private List<MixsetFragment> mixsetFragments;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Mixset(String aMixsetName)
  {
    super();
    mixsetName = aMixsetName;
    isFeature = false;
    mixsetFragments = new ArrayList<MixsetFragment>();
    // line 46 "../../../../src/Mixset.ump"
    setIsMixset(true);
    // END OF UMPLE AFTER INJECTION
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

  public boolean setIsFeature(boolean aIsFeature)
  {
    boolean wasSet = false;
    isFeature = aIsFeature;
    wasSet = true;
    return wasSet;
  }

  /**
   * name of the mixset
   */
  public String getMixsetName()
  {
    return mixsetName;
  }

  /**
   * Specify a mixset to be a feature. Default value is false..
   */
  public boolean getIsFeature()
  {
    return isFeature;
  }
  /* Code from template association_GetMany */
  public MixsetFragment getMixsetFragment(int index)
  {
    MixsetFragment aMixsetFragment = mixsetFragments.get(index);
    return aMixsetFragment;
  }

  /**
   * Used fragments are those that have been parsed because a use statement was previously
   * encountered.
   * If a use statement had been previously encountered, the fragment is parsed and put here
   * directly
   * 0..1 usedAsPartOf -- * MixsetFragment usedFragments;
   * Waiting ragments are those not yet parsed since no use statement was found yet
   * All new fragments are added here
   * Upon a use statement, all waiting fragments are parsed and put in usedFragments
   * 0..1 -- * MixsetFragment waitingFragments;
   * use (parsed) fragments and waiting (unparsed) fragments will be stored as MixsetFragments.
   * The isParsed filed of MixsetFragment is used to differentiate between them.
   * The aim is to easly change from waiting fragments to used fragments. Instead of copying and deleteing.
   */
  public List<MixsetFragment> getMixsetFragments()
  {
    List<MixsetFragment> newMixsetFragments = Collections.unmodifiableList(mixsetFragments);
    return newMixsetFragments;
  }

  public int numberOfMixsetFragments()
  {
    int number = mixsetFragments.size();
    return number;
  }

  public boolean hasMixsetFragments()
  {
    boolean has = mixsetFragments.size() > 0;
    return has;
  }

  public int indexOfMixsetFragment(MixsetFragment aMixsetFragment)
  {
    int index = mixsetFragments.indexOf(aMixsetFragment);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMixsetFragments()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addMixsetFragment(MixsetFragment aMixsetFragment)
  {
    boolean wasAdded = false;
    if (mixsetFragments.contains(aMixsetFragment)) { return false; }
    Mixset existingMixset = aMixsetFragment.getMixset();
    if (existingMixset == null)
    {
      aMixsetFragment.setMixset(this);
    }
    else if (!this.equals(existingMixset))
    {
      existingMixset.removeMixsetFragment(aMixsetFragment);
      addMixsetFragment(aMixsetFragment);
    }
    else
    {
      mixsetFragments.add(aMixsetFragment);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMixsetFragment(MixsetFragment aMixsetFragment)
  {
    boolean wasRemoved = false;
    if (mixsetFragments.contains(aMixsetFragment))
    {
      mixsetFragments.remove(aMixsetFragment);
      aMixsetFragment.setMixset(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMixsetFragmentAt(MixsetFragment aMixsetFragment, int index)
  {  
    boolean wasAdded = false;
    if(addMixsetFragment(aMixsetFragment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMixsetFragments()) { index = numberOfMixsetFragments() - 1; }
      mixsetFragments.remove(aMixsetFragment);
      mixsetFragments.add(index, aMixsetFragment);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMixsetFragmentAt(MixsetFragment aMixsetFragment, int index)
  {
    boolean wasAdded = false;
    if(mixsetFragments.contains(aMixsetFragment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMixsetFragments()) { index = numberOfMixsetFragments() - 1; }
      mixsetFragments.remove(aMixsetFragment);
      mixsetFragments.add(index, aMixsetFragment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMixsetFragmentAt(aMixsetFragment, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !mixsetFragments.isEmpty() )
    {
      mixsetFragments.get(0).setMixset(null);
    }
    super.delete();
  }

  // line 66 "../../../../src/Mixset.ump"
  public String getName(){
    return mixsetName;
  }


  public String toString()
  {
    return super.toString() + "["+
            "mixsetName" + ":" + getMixsetName()+ "," +
            "isFeature" + ":" + getIsFeature()+ "]";
  }
}