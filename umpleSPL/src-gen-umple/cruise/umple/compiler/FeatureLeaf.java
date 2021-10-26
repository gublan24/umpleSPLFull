/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * A FeatureLeaf contains a full mixset or a full file.
 */
// line 54 "../../../../src/FeatureModel.ump"
public class FeatureLeaf extends FeatureNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //FeatureLeaf Associations
  private MixsetOrFile mixsetOrFileNode;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public FeatureLeaf(FeatureModel aFeatureModel)
  {
    super(aFeatureModel);
    // line 59 "../../../../src/FeatureModel.ump"
    setIsLeaf(true);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public MixsetOrFile getMixsetOrFileNode()
  {
    return mixsetOrFileNode;
  }

  public boolean hasMixsetOrFileNode()
  {
    boolean has = mixsetOrFileNode != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToOptionalOne */
  public boolean setMixsetOrFileNode(MixsetOrFile aNewMixsetOrFileNode)
  {
    boolean wasSet = false;
    if (aNewMixsetOrFileNode == null)
    {
      MixsetOrFile existingMixsetOrFileNode = mixsetOrFileNode;
      mixsetOrFileNode = null;
      
      if (existingMixsetOrFileNode != null && existingMixsetOrFileNode.getFeatureLeaf() != null)
      {
        existingMixsetOrFileNode.setFeatureLeaf(null);
      }
      wasSet = true;
      return wasSet;
    }

    MixsetOrFile currentMixsetOrFileNode = getMixsetOrFileNode();
    if (currentMixsetOrFileNode != null && !currentMixsetOrFileNode.equals(aNewMixsetOrFileNode))
    {
      currentMixsetOrFileNode.setFeatureLeaf(null);
    }

    mixsetOrFileNode = aNewMixsetOrFileNode;
    FeatureLeaf existingFeatureLeaf = aNewMixsetOrFileNode.getFeatureLeaf();

    if (!equals(existingFeatureLeaf))
    {
      aNewMixsetOrFileNode.setFeatureLeaf(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (mixsetOrFileNode != null)
    {
      mixsetOrFileNode.setFeatureLeaf(null);
    }
    super.delete();
  }


  /**
   * a leaf node returns its actual name as a unique name.
   */
  // line 63 "../../../../src/FeatureModel.ump"
   public String getUniqueFeatureNodeName(){
    return this.getName();
  }

}