/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;

/**
 * A Feature model consists of some FeatureNodels, which can be leaf nodes or fragmentFeature nodes.
 */
// line 26 "../../../../src/FeatureModel.ump"
public class FeatureNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //FeatureNode Attributes
  private int id;
  private String name;
  private boolean isLeaf;
  private boolean isCompoundFeature;

  //FeatureNode Associations
  private List<FeatureLink> incomingFeatureLinks;
  private List<FeatureLink> outgoingFeatureLinks;
  private FeatureModel featureModel;
  private CompoundFeatureNode compoundFeatureNode;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public FeatureNode(FeatureModel aFeatureModel)
  {
    id = nextId.incrementAndGet();
    name = null;
    isLeaf = false;
    isCompoundFeature = false;
    incomingFeatureLinks = new ArrayList<FeatureLink>();
    outgoingFeatureLinks = new ArrayList<FeatureLink>();
    boolean didAddFeatureModel = setFeatureModel(aFeatureModel);
    if (!didAddFeatureModel)
    {
      throw new RuntimeException("Unable to create node due to featureModel. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(int aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsLeaf(boolean aIsLeaf)
  {
    boolean wasSet = false;
    isLeaf = aIsLeaf;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsCompoundFeature(boolean aIsCompoundFeature)
  {
    boolean wasSet = false;
    isCompoundFeature = aIsCompoundFeature;
    wasSet = true;
    return wasSet;
  }

  /**
   * each new FeatureNode has a unique id
   */
  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public boolean getIsLeaf()
  {
    return isLeaf;
  }

  public boolean getIsCompoundFeature()
  {
    return isCompoundFeature;
  }
  /* Code from template association_GetMany */
  public FeatureLink getIncomingFeatureLink(int index)
  {
    FeatureLink aIncomingFeatureLink = incomingFeatureLinks.get(index);
    return aIncomingFeatureLink;
  }

  /**
   * A feature node in the feature diagram may have 0 or more incoming/outgoing links.
   */
  public List<FeatureLink> getIncomingFeatureLinks()
  {
    List<FeatureLink> newIncomingFeatureLinks = Collections.unmodifiableList(incomingFeatureLinks);
    return newIncomingFeatureLinks;
  }

  public int numberOfIncomingFeatureLinks()
  {
    int number = incomingFeatureLinks.size();
    return number;
  }

  public boolean hasIncomingFeatureLinks()
  {
    boolean has = incomingFeatureLinks.size() > 0;
    return has;
  }

  public int indexOfIncomingFeatureLink(FeatureLink aIncomingFeatureLink)
  {
    int index = incomingFeatureLinks.indexOf(aIncomingFeatureLink);
    return index;
  }
  /* Code from template association_GetMany */
  public FeatureLink getOutgoingFeatureLink(int index)
  {
    FeatureLink aOutgoingFeatureLink = outgoingFeatureLinks.get(index);
    return aOutgoingFeatureLink;
  }

  public List<FeatureLink> getOutgoingFeatureLinks()
  {
    List<FeatureLink> newOutgoingFeatureLinks = Collections.unmodifiableList(outgoingFeatureLinks);
    return newOutgoingFeatureLinks;
  }

  public int numberOfOutgoingFeatureLinks()
  {
    int number = outgoingFeatureLinks.size();
    return number;
  }

  public boolean hasOutgoingFeatureLinks()
  {
    boolean has = outgoingFeatureLinks.size() > 0;
    return has;
  }

  public int indexOfOutgoingFeatureLink(FeatureLink aOutgoingFeatureLink)
  {
    int index = outgoingFeatureLinks.indexOf(aOutgoingFeatureLink);
    return index;
  }
  /* Code from template association_GetOne */
  public FeatureModel getFeatureModel()
  {
    return featureModel;
  }
  /* Code from template association_GetOne */
  public CompoundFeatureNode getCompoundFeatureNode()
  {
    return compoundFeatureNode;
  }

  public boolean hasCompoundFeatureNode()
  {
    boolean has = compoundFeatureNode != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfIncomingFeatureLinks()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addIncomingFeatureLink(FeatureLink aIncomingFeatureLink)
  {
    boolean wasAdded = false;
    if (incomingFeatureLinks.contains(aIncomingFeatureLink)) { return false; }
    FeatureNode existingTargetFeatureNode = aIncomingFeatureLink.getTargetFeatureNode();
    if (existingTargetFeatureNode == null)
    {
      aIncomingFeatureLink.setTargetFeatureNode(this);
    }
    else if (!this.equals(existingTargetFeatureNode))
    {
      existingTargetFeatureNode.removeIncomingFeatureLink(aIncomingFeatureLink);
      addIncomingFeatureLink(aIncomingFeatureLink);
    }
    else
    {
      incomingFeatureLinks.add(aIncomingFeatureLink);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeIncomingFeatureLink(FeatureLink aIncomingFeatureLink)
  {
    boolean wasRemoved = false;
    if (incomingFeatureLinks.contains(aIncomingFeatureLink))
    {
      incomingFeatureLinks.remove(aIncomingFeatureLink);
      aIncomingFeatureLink.setTargetFeatureNode(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addIncomingFeatureLinkAt(FeatureLink aIncomingFeatureLink, int index)
  {  
    boolean wasAdded = false;
    if(addIncomingFeatureLink(aIncomingFeatureLink))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfIncomingFeatureLinks()) { index = numberOfIncomingFeatureLinks() - 1; }
      incomingFeatureLinks.remove(aIncomingFeatureLink);
      incomingFeatureLinks.add(index, aIncomingFeatureLink);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveIncomingFeatureLinkAt(FeatureLink aIncomingFeatureLink, int index)
  {
    boolean wasAdded = false;
    if(incomingFeatureLinks.contains(aIncomingFeatureLink))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfIncomingFeatureLinks()) { index = numberOfIncomingFeatureLinks() - 1; }
      incomingFeatureLinks.remove(aIncomingFeatureLink);
      incomingFeatureLinks.add(index, aIncomingFeatureLink);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addIncomingFeatureLinkAt(aIncomingFeatureLink, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfOutgoingFeatureLinks()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addOutgoingFeatureLink(FeatureLink aOutgoingFeatureLink)
  {
    boolean wasAdded = false;
    if (outgoingFeatureLinks.contains(aOutgoingFeatureLink)) { return false; }
    FeatureNode existingSourceFeatureNode = aOutgoingFeatureLink.getSourceFeatureNode();
    if (existingSourceFeatureNode == null)
    {
      aOutgoingFeatureLink.setSourceFeatureNode(this);
    }
    else if (!this.equals(existingSourceFeatureNode))
    {
      existingSourceFeatureNode.removeOutgoingFeatureLink(aOutgoingFeatureLink);
      addOutgoingFeatureLink(aOutgoingFeatureLink);
    }
    else
    {
      outgoingFeatureLinks.add(aOutgoingFeatureLink);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeOutgoingFeatureLink(FeatureLink aOutgoingFeatureLink)
  {
    boolean wasRemoved = false;
    if (outgoingFeatureLinks.contains(aOutgoingFeatureLink))
    {
      outgoingFeatureLinks.remove(aOutgoingFeatureLink);
      aOutgoingFeatureLink.setSourceFeatureNode(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addOutgoingFeatureLinkAt(FeatureLink aOutgoingFeatureLink, int index)
  {  
    boolean wasAdded = false;
    if(addOutgoingFeatureLink(aOutgoingFeatureLink))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOutgoingFeatureLinks()) { index = numberOfOutgoingFeatureLinks() - 1; }
      outgoingFeatureLinks.remove(aOutgoingFeatureLink);
      outgoingFeatureLinks.add(index, aOutgoingFeatureLink);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveOutgoingFeatureLinkAt(FeatureLink aOutgoingFeatureLink, int index)
  {
    boolean wasAdded = false;
    if(outgoingFeatureLinks.contains(aOutgoingFeatureLink))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOutgoingFeatureLinks()) { index = numberOfOutgoingFeatureLinks() - 1; }
      outgoingFeatureLinks.remove(aOutgoingFeatureLink);
      outgoingFeatureLinks.add(index, aOutgoingFeatureLink);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOutgoingFeatureLinkAt(aOutgoingFeatureLink, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMany */
  public boolean setFeatureModel(FeatureModel aFeatureModel)
  {
    boolean wasSet = false;
    if (aFeatureModel == null)
    {
      return wasSet;
    }

    FeatureModel existingFeatureModel = featureModel;
    featureModel = aFeatureModel;
    if (existingFeatureModel != null && !existingFeatureModel.equals(aFeatureModel))
    {
      existingFeatureModel.removeNode(this);
    }
    featureModel.addNode(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setCompoundFeatureNode(CompoundFeatureNode aCompoundFeatureNode)
  {
    boolean wasSet = false;
    CompoundFeatureNode existingCompoundFeatureNode = compoundFeatureNode;
    compoundFeatureNode = aCompoundFeatureNode;
    if (existingCompoundFeatureNode != null && !existingCompoundFeatureNode.equals(aCompoundFeatureNode))
    {
      existingCompoundFeatureNode.removeChildFeature(this);
    }
    if (aCompoundFeatureNode != null)
    {
      aCompoundFeatureNode.addChildFeature(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while( !incomingFeatureLinks.isEmpty() )
    {
      incomingFeatureLinks.get(0).setTargetFeatureNode(null);
    }
    while( !outgoingFeatureLinks.isEmpty() )
    {
      outgoingFeatureLinks.get(0).setSourceFeatureNode(null);
    }
    FeatureModel placeholderFeatureModel = featureModel;
    this.featureModel = null;
    if(placeholderFeatureModel != null)
    {
      placeholderFeatureModel.removeNode(this);
    }
    if (compoundFeatureNode != null)
    {
      CompoundFeatureNode placeholderCompoundFeatureNode = compoundFeatureNode;
      this.compoundFeatureNode = null;
      placeholderCompoundFeatureNode.removeChildFeature(this);
    }
  }

  // line 41 "../../../../src/FeatureModel.ump"
   public String getUniqueFeatureNodeName(){
    return name+"_"+id;
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "name" + ":" + getName()+ "," +
            "isLeaf" + ":" + getIsLeaf()+ "," +
            "isCompoundFeature" + ":" + getIsCompoundFeature()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "featureModel = "+(getFeatureModel()!=null?Integer.toHexString(System.identityHashCode(getFeatureModel())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "compoundFeatureNode = "+(getCompoundFeatureNode()!=null?Integer.toHexString(System.identityHashCode(getCompoundFeatureNode())):"null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 29 "../../../../src/FeatureModel.ump"
  static AtomicInteger nextId = new AtomicInteger() ;

  
}