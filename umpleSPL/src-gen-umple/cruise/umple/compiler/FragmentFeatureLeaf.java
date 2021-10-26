/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * A FragmentFeatureLeaf consists of one or more mixset fragments.
 */
// line 68 "../../../../src/FeatureModel.ump"
public class FragmentFeatureLeaf extends FeatureNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //FragmentFeatureLeaf Associations
  private List<MixsetFragment> mixsetFragment;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public FragmentFeatureLeaf(FeatureModel aFeatureModel)
  {
    super(aFeatureModel);
    mixsetFragment = new ArrayList<MixsetFragment>();
    // line 72 "../../../../src/FeatureModel.ump"
    setIsLeaf(true);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public MixsetFragment getMixsetFragment(int index)
  {
    MixsetFragment aMixsetFragment = mixsetFragment.get(index);
    return aMixsetFragment;
  }

  public List<MixsetFragment> getMixsetFragment()
  {
    List<MixsetFragment> newMixsetFragment = Collections.unmodifiableList(mixsetFragment);
    return newMixsetFragment;
  }

  public int numberOfMixsetFragment()
  {
    int number = mixsetFragment.size();
    return number;
  }

  public boolean hasMixsetFragment()
  {
    boolean has = mixsetFragment.size() > 0;
    return has;
  }

  public int indexOfMixsetFragment(MixsetFragment aMixsetFragment)
  {
    int index = mixsetFragment.indexOf(aMixsetFragment);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMixsetFragment()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addMixsetFragment(MixsetFragment aMixsetFragment)
  {
    boolean wasAdded = false;
    if (mixsetFragment.contains(aMixsetFragment)) { return false; }
    FragmentFeatureLeaf existingFragmentFeatureLeaf = aMixsetFragment.getFragmentFeatureLeaf();
    if (existingFragmentFeatureLeaf == null)
    {
      aMixsetFragment.setFragmentFeatureLeaf(this);
    }
    else if (!this.equals(existingFragmentFeatureLeaf))
    {
      existingFragmentFeatureLeaf.removeMixsetFragment(aMixsetFragment);
      addMixsetFragment(aMixsetFragment);
    }
    else
    {
      mixsetFragment.add(aMixsetFragment);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMixsetFragment(MixsetFragment aMixsetFragment)
  {
    boolean wasRemoved = false;
    if (mixsetFragment.contains(aMixsetFragment))
    {
      mixsetFragment.remove(aMixsetFragment);
      aMixsetFragment.setFragmentFeatureLeaf(null);
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
      if(index > numberOfMixsetFragment()) { index = numberOfMixsetFragment() - 1; }
      mixsetFragment.remove(aMixsetFragment);
      mixsetFragment.add(index, aMixsetFragment);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMixsetFragmentAt(MixsetFragment aMixsetFragment, int index)
  {
    boolean wasAdded = false;
    if(mixsetFragment.contains(aMixsetFragment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMixsetFragment()) { index = numberOfMixsetFragment() - 1; }
      mixsetFragment.remove(aMixsetFragment);
      mixsetFragment.add(index, aMixsetFragment);
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
    while( !mixsetFragment.isEmpty() )
    {
      mixsetFragment.get(0).setFragmentFeatureLeaf(null);
    }
    super.delete();
  }

}