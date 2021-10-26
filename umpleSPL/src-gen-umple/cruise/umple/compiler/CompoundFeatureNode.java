/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * A compund feature has multiple of features (like xor , or and other that have multiplicity.)
 */
// line 46 "../../../../src/FeatureModel.ump"
public class CompoundFeatureNode extends FeatureNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CompoundFeatureNode Associations
  private List<FeatureNode> childFeatures;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CompoundFeatureNode(FeatureModel aFeatureModel)
  {
    super(aFeatureModel);
    childFeatures = new ArrayList<FeatureNode>();
    // line 50 "../../../../src/FeatureModel.ump"
    setIsCompoundFeature(true);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public FeatureNode getChildFeature(int index)
  {
    FeatureNode aChildFeature = childFeatures.get(index);
    return aChildFeature;
  }

  public List<FeatureNode> getChildFeatures()
  {
    List<FeatureNode> newChildFeatures = Collections.unmodifiableList(childFeatures);
    return newChildFeatures;
  }

  public int numberOfChildFeatures()
  {
    int number = childFeatures.size();
    return number;
  }

  public boolean hasChildFeatures()
  {
    boolean has = childFeatures.size() > 0;
    return has;
  }

  public int indexOfChildFeature(FeatureNode aChildFeature)
  {
    int index = childFeatures.indexOf(aChildFeature);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfChildFeatures()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addChildFeature(FeatureNode aChildFeature)
  {
    boolean wasAdded = false;
    if (childFeatures.contains(aChildFeature)) { return false; }
    CompoundFeatureNode existingCompoundFeatureNode = aChildFeature.getCompoundFeatureNode();
    if (existingCompoundFeatureNode == null)
    {
      aChildFeature.setCompoundFeatureNode(this);
    }
    else if (!this.equals(existingCompoundFeatureNode))
    {
      existingCompoundFeatureNode.removeChildFeature(aChildFeature);
      addChildFeature(aChildFeature);
    }
    else
    {
      childFeatures.add(aChildFeature);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeChildFeature(FeatureNode aChildFeature)
  {
    boolean wasRemoved = false;
    if (childFeatures.contains(aChildFeature))
    {
      childFeatures.remove(aChildFeature);
      aChildFeature.setCompoundFeatureNode(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addChildFeatureAt(FeatureNode aChildFeature, int index)
  {  
    boolean wasAdded = false;
    if(addChildFeature(aChildFeature))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfChildFeatures()) { index = numberOfChildFeatures() - 1; }
      childFeatures.remove(aChildFeature);
      childFeatures.add(index, aChildFeature);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveChildFeatureAt(FeatureNode aChildFeature, int index)
  {
    boolean wasAdded = false;
    if(childFeatures.contains(aChildFeature))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfChildFeatures()) { index = numberOfChildFeatures() - 1; }
      childFeatures.remove(aChildFeature);
      childFeatures.add(index, aChildFeature);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addChildFeatureAt(aChildFeature, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !childFeatures.isEmpty() )
    {
      childFeatures.get(0).setCompoundFeatureNode(null);
    }
    super.delete();
  }

}