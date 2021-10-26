/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * A FeatureLink connects a source feature to target feature(s) in the feature diagram.
 */
// line 76 "../../../../src/FeatureModel.ump"
public class FeatureLink
{

  //------------------------
  // ENUMERATIONS
  //------------------------

  public enum FeatureConnectingOpType { Mandatory, Optional, Conjunctive, Disjunctive, Multiplicity, Include, Exclude, XOR }

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //FeatureLink Attributes
  private boolean isSub;
  private FeatureConnectingOpType featureConnectingOpType;

  //FeatureLink Associations
  private FeatureModel featureModel;
  private FeatureNode targetFeatureNode;
  private FeatureNode sourceFeatureNode;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public FeatureLink()
  {
    isSub = false;
    featureConnectingOpType = FeatureConnectingOpType.Include;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsSub(boolean aIsSub)
  {
    boolean wasSet = false;
    isSub = aIsSub;
    wasSet = true;
    return wasSet;
  }

  public boolean setFeatureConnectingOpType(FeatureConnectingOpType aFeatureConnectingOpType)
  {
    boolean wasSet = false;
    featureConnectingOpType = aFeatureConnectingOpType;
    wasSet = true;
    return wasSet;
  }

  /**
   * isSub to differentiate between sub-features and include/exclude relationship
   */
  public boolean getIsSub()
  {
    return isSub;
  }

  /**
   * Set a default value for featureLinks.
   */
  public FeatureConnectingOpType getFeatureConnectingOpType()
  {
    return featureConnectingOpType;
  }
  /* Code from template association_GetOne */
  public FeatureModel getFeatureModel()
  {
    return featureModel;
  }

  public boolean hasFeatureModel()
  {
    boolean has = featureModel != null;
    return has;
  }
  /* Code from template association_GetOne */
  public FeatureNode getTargetFeatureNode()
  {
    return targetFeatureNode;
  }

  public boolean hasTargetFeatureNode()
  {
    boolean has = targetFeatureNode != null;
    return has;
  }
  /* Code from template association_GetOne */
  public FeatureNode getSourceFeatureNode()
  {
    return sourceFeatureNode;
  }

  public boolean hasSourceFeatureNode()
  {
    boolean has = sourceFeatureNode != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setFeatureModel(FeatureModel aFeatureModel)
  {
    boolean wasSet = false;
    FeatureModel existingFeatureModel = featureModel;
    featureModel = aFeatureModel;
    if (existingFeatureModel != null && !existingFeatureModel.equals(aFeatureModel))
    {
      existingFeatureModel.removeFeaturelink(this);
    }
    if (aFeatureModel != null)
    {
      aFeatureModel.addFeaturelink(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setTargetFeatureNode(FeatureNode aTargetFeatureNode)
  {
    boolean wasSet = false;
    FeatureNode existingTargetFeatureNode = targetFeatureNode;
    targetFeatureNode = aTargetFeatureNode;
    if (existingTargetFeatureNode != null && !existingTargetFeatureNode.equals(aTargetFeatureNode))
    {
      existingTargetFeatureNode.removeIncomingFeatureLink(this);
    }
    if (aTargetFeatureNode != null)
    {
      aTargetFeatureNode.addIncomingFeatureLink(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setSourceFeatureNode(FeatureNode aSourceFeatureNode)
  {
    boolean wasSet = false;
    FeatureNode existingSourceFeatureNode = sourceFeatureNode;
    sourceFeatureNode = aSourceFeatureNode;
    if (existingSourceFeatureNode != null && !existingSourceFeatureNode.equals(aSourceFeatureNode))
    {
      existingSourceFeatureNode.removeOutgoingFeatureLink(this);
    }
    if (aSourceFeatureNode != null)
    {
      aSourceFeatureNode.addOutgoingFeatureLink(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (featureModel != null)
    {
      FeatureModel placeholderFeatureModel = featureModel;
      this.featureModel = null;
      placeholderFeatureModel.removeFeaturelink(this);
    }
    if (targetFeatureNode != null)
    {
      FeatureNode placeholderTargetFeatureNode = targetFeatureNode;
      this.targetFeatureNode = null;
      placeholderTargetFeatureNode.removeIncomingFeatureLink(this);
    }
    if (sourceFeatureNode != null)
    {
      FeatureNode placeholderSourceFeatureNode = sourceFeatureNode;
      this.sourceFeatureNode = null;
      placeholderSourceFeatureNode.removeOutgoingFeatureLink(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "isSub" + ":" + getIsSub()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "featureConnectingOpType" + "=" + (getFeatureConnectingOpType() != null ? !getFeatureConnectingOpType().equals(this)  ? getFeatureConnectingOpType().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "featureModel = "+(getFeatureModel()!=null?Integer.toHexString(System.identityHashCode(getFeatureModel())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "targetFeatureNode = "+(getTargetFeatureNode()!=null?Integer.toHexString(System.identityHashCode(getTargetFeatureNode())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "sourceFeatureNode = "+(getSourceFeatureNode()!=null?Integer.toHexString(System.identityHashCode(getSourceFeatureNode())):"null");
  }
}