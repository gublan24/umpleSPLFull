/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.stream.*;
import cruise.umple.compiler.FeatureLink.FeatureConnectingOpType;
import java.util.*;

// line 18 "../../../../src/FeatureModel.ump"
// line 407 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
public class FeatureModel
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //FeatureModel Attributes
  private String name;

  //FeatureModel Associations
  private List<FeatureNode> node;
  private List<FeatureLink> featurelink;
  private UmpleModel umpleModel;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public FeatureModel(String aName)
  {
    name = aName;
    node = new ArrayList<FeatureNode>();
    featurelink = new ArrayList<FeatureLink>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }
  /* Code from template association_GetMany */
  public FeatureNode getNode(int index)
  {
    FeatureNode aNode = node.get(index);
    return aNode;
  }

  public List<FeatureNode> getNode()
  {
    List<FeatureNode> newNode = Collections.unmodifiableList(node);
    return newNode;
  }

  public int numberOfNode()
  {
    int number = node.size();
    return number;
  }

  public boolean hasNode()
  {
    boolean has = node.size() > 0;
    return has;
  }

  public int indexOfNode(FeatureNode aNode)
  {
    int index = node.indexOf(aNode);
    return index;
  }
  /* Code from template association_GetMany */
  public FeatureLink getFeaturelink(int index)
  {
    FeatureLink aFeaturelink = featurelink.get(index);
    return aFeaturelink;
  }

  public List<FeatureLink> getFeaturelink()
  {
    List<FeatureLink> newFeaturelink = Collections.unmodifiableList(featurelink);
    return newFeaturelink;
  }

  public int numberOfFeaturelink()
  {
    int number = featurelink.size();
    return number;
  }

  public boolean hasFeaturelink()
  {
    boolean has = featurelink.size() > 0;
    return has;
  }

  public int indexOfFeaturelink(FeatureLink aFeaturelink)
  {
    int index = featurelink.indexOf(aFeaturelink);
    return index;
  }
  /* Code from template association_GetOne */
  public UmpleModel getUmpleModel()
  {
    return umpleModel;
  }

  public boolean hasUmpleModel()
  {
    boolean has = umpleModel != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfNode()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public FeatureNode addNode()
  {
    return new FeatureNode(this);
  }

  public boolean addNode(FeatureNode aNode)
  {
    boolean wasAdded = false;
    if (node.contains(aNode)) { return false; }
    FeatureModel existingFeatureModel = aNode.getFeatureModel();
    boolean isNewFeatureModel = existingFeatureModel != null && !this.equals(existingFeatureModel);
    if (isNewFeatureModel)
    {
      aNode.setFeatureModel(this);
    }
    else
    {
      node.add(aNode);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeNode(FeatureNode aNode)
  {
    boolean wasRemoved = false;
    //Unable to remove aNode, as it must always have a featureModel
    if (!this.equals(aNode.getFeatureModel()))
    {
      node.remove(aNode);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addNodeAt(FeatureNode aNode, int index)
  {  
    boolean wasAdded = false;
    if(addNode(aNode))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfNode()) { index = numberOfNode() - 1; }
      node.remove(aNode);
      node.add(index, aNode);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveNodeAt(FeatureNode aNode, int index)
  {
    boolean wasAdded = false;
    if(node.contains(aNode))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfNode()) { index = numberOfNode() - 1; }
      node.remove(aNode);
      node.add(index, aNode);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addNodeAt(aNode, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFeaturelink()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addFeaturelink(FeatureLink aFeaturelink)
  {
    boolean wasAdded = false;
    if (featurelink.contains(aFeaturelink)) { return false; }
    FeatureModel existingFeatureModel = aFeaturelink.getFeatureModel();
    if (existingFeatureModel == null)
    {
      aFeaturelink.setFeatureModel(this);
    }
    else if (!this.equals(existingFeatureModel))
    {
      existingFeatureModel.removeFeaturelink(aFeaturelink);
      addFeaturelink(aFeaturelink);
    }
    else
    {
      featurelink.add(aFeaturelink);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeFeaturelink(FeatureLink aFeaturelink)
  {
    boolean wasRemoved = false;
    if (featurelink.contains(aFeaturelink))
    {
      featurelink.remove(aFeaturelink);
      aFeaturelink.setFeatureModel(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFeaturelinkAt(FeatureLink aFeaturelink, int index)
  {  
    boolean wasAdded = false;
    if(addFeaturelink(aFeaturelink))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFeaturelink()) { index = numberOfFeaturelink() - 1; }
      featurelink.remove(aFeaturelink);
      featurelink.add(index, aFeaturelink);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFeaturelinkAt(FeatureLink aFeaturelink, int index)
  {
    boolean wasAdded = false;
    if(featurelink.contains(aFeaturelink))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFeaturelink()) { index = numberOfFeaturelink() - 1; }
      featurelink.remove(aFeaturelink);
      featurelink.add(index, aFeaturelink);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFeaturelinkAt(aFeaturelink, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToOptionalOne */
  public boolean setUmpleModel(UmpleModel aNewUmpleModel)
  {
    boolean wasSet = false;
    if (aNewUmpleModel == null)
    {
      UmpleModel existingUmpleModel = umpleModel;
      umpleModel = null;
      
      if (existingUmpleModel != null && existingUmpleModel.getFeatureModel() != null)
      {
        existingUmpleModel.setFeatureModel(null);
      }
      wasSet = true;
      return wasSet;
    }

    UmpleModel currentUmpleModel = getUmpleModel();
    if (currentUmpleModel != null && !currentUmpleModel.equals(aNewUmpleModel))
    {
      currentUmpleModel.setFeatureModel(null);
    }

    umpleModel = aNewUmpleModel;
    FeatureModel existingFeatureModel = aNewUmpleModel.getFeatureModel();

    if (!equals(existingFeatureModel))
    {
      aNewUmpleModel.setFeatureModel(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    for(int i=node.size(); i > 0; i--)
    {
      FeatureNode aNode = node.get(i - 1);
      aNode.delete();
    }
    while( !featurelink.isEmpty() )
    {
      featurelink.get(0).setFeatureModel(null);
    }
    if (umpleModel != null)
    {
      umpleModel.setFeatureModel(null);
    }
  }


  /**
   * This method returns a leaf node from FeatureModel based on its name.
   * return null if the leaf node is not found.
   */
  // line 416 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public FeatureLeaf getFeatureLeafNode(String name){
    for(FeatureNode aNode: node)
    {
      if(aNode.getName().equals(name) && aNode.getIsLeaf()) // isLeaf
      return ((FeatureLeaf) aNode);
    }
    return null;
  }


  /**
   * This method does conditional addition for a FeatureLeaf based on the provided name. 
   * It returns a new FeatureLeaf if its not found, or existing FeatureLeaf if the name was found.
   */
  // line 429 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public FeatureLeaf getOrCreateFeatureLeafNode(String name){
    FeatureLeaf aNode = getFeatureLeafNode(name);
    if(aNode == null)
    {
      aNode = new FeatureLeaf(this);
      aNode.setName(name);
    }
    return aNode;
  }


  /**
   * This method returns true if the feature leaf has a use-statement.
   * It returns false if there is no use-statement for the mixset.
   * It returns false if there is no mixset or file in the feature leaf.
   */
  // line 443 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public boolean isUsedFeatureLeaf(FeatureLeaf featureLeaf){
    boolean isMixset = featureLeaf.getMixsetOrFileNode().getIsMixset();
    if(isMixset)
    {
      Mixset mixset = getUmpleModel().getMixset(featureLeaf.getMixsetOrFileNode().getName());
      if(mixset != null)
      {
        if(mixset.getUseUmpleFile() != null)
        return true;  // this means there is a use-statement here
        //else there is no use-statement    
      }
      else 
      {
        return false;//there is no mixset with the specified name. 
      }
    }
    return false;
  }


  /**
   * This method takes a feature link (from the feature model) and decides whether the link is satisfied.
   * If the link is not satisfied, it return false.
   * Ex: the link "source--> and" for M1 and M2 is true if there are use-statements for both M1 and M2.
   */
  // line 467 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public boolean evaluateFeatureLink(FeatureLink featureLink){
    FeatureNode featureNode = ((FeatureNode) featureLink.getTargetFeatureNode());
    if(featureNode.getIsLeaf())
    {
      if(featureLink.getFeatureConnectingOpType().equals(FeatureConnectingOpType.Mandatory))
      {
        return isUsedFeatureLeaf((FeatureLeaf)featureNode);
      } 
      if(featureLink.getFeatureConnectingOpType().equals(FeatureConnectingOpType.Include))
      {
        return isUsedFeatureLeaf((FeatureLeaf)featureNode);
      } 
      else if(featureLink.getFeatureConnectingOpType().equals(FeatureConnectingOpType.Exclude))
      {
        return !isUsedFeatureLeaf((FeatureLeaf)featureNode); // return true when there is no use-statement, or no def for mixset 
      }
      else if(featureLink.getFeatureConnectingOpType().equals(FeatureConnectingOpType.Optional))
      {
        return true;        // opt is allawys has a true value 
      }
      else 
      return isUsedFeatureLeaf((FeatureLeaf)featureNode);
    } // if not leaf node
    else if(featureLink.getFeatureConnectingOpType().equals(FeatureConnectingOpType.Conjunctive))
    { 
      if(!featureNode.getIsLeaf())
      {
        List<FeatureLink> outgoingLinks = featureNode.getOutgoingFeatureLinks();
        boolean result = true;
        for(int i=0 ; i<outgoingLinks.size(); i++){
          result = result && evaluateFeatureLink(outgoingLinks.get(i));
        }
        return result;
      }
    }
    else if(featureLink.getFeatureConnectingOpType().equals(FeatureConnectingOpType.Disjunctive))
    {   
      if(!featureNode.getIsLeaf())
      {
        boolean result = false;
        List<FeatureLink> outgoingLinks = featureNode.getOutgoingFeatureLinks();
        for(int i=0 ; i<outgoingLinks.size(); i++){
          result = result || evaluateFeatureLink(outgoingLinks.get(i));
        }
        return result;
      }
    }
    else if(featureLink.getFeatureConnectingOpType().equals(FeatureConnectingOpType.XOR))
    { 
      if(!featureNode.getIsLeaf())
          {
            List<FeatureLink> outgoingLinks = featureNode.getOutgoingFeatureLinks();
            int countOfUsedTarget = 0;
            for(int i=0 ; i < outgoingLinks.size(); i++){
              if(evaluateFeatureLink(outgoingLinks.get(i)))  // bitwise xor (^) can not be used here because it does not mean always only one. Example: (true ^ true ^ true == true) 
              countOfUsedTarget++;
            }
            return (countOfUsedTarget == 1) ? true: false;
          }
    }
    else if(featureLink.getFeatureConnectingOpType().equals(FeatureConnectingOpType.Multiplicity))
      {
        MultiplicityFeatureConnectingOpType multiplicityFeatureLink = (MultiplicityFeatureConnectingOpType) featureLink;
        int upperBound = multiplicityFeatureLink.getMultiplicity().getUpperBound();
        int lowerBound = multiplicityFeatureLink.getMultiplicity().getLowerBound();
        
        int countOfUsedTarget = 0;
          List<FeatureNode> featureNodes = ((CompoundFeatureNode)featureNode).getChildFeatures();
          for(int k=0 ; k < featureNodes.size(); k++){
            if(isUsedFeatureLeaf((FeatureLeaf)featureNodes.get(k)))
            countOfUsedTarget++;
          }

        return (countOfUsedTarget <= upperBound && countOfUsedTarget >= lowerBound) ? true: false;    
      }
    //otherwise
    return false;
  }


  /**
   * This method checks whether the use-statements plus the feature model results in valid configuration.
   * It return true If there is no feature model.
   */
  // line 550 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
   public boolean satisfyFeatureModel(){
    UmpleModel model = getUmpleModel();
    boolean isSatisfied = true;
    // get root features : has outgoing links but no incoming links
    List <FeatureNode> rootFeatures = getRootFeatures();
    //getNode().stream().filter(n -> (n.hasSourceFeatureLink() && n.getIsLeaf())).collect(Collectors.toList());
    for(FeatureNode featureNode: rootFeatures)
    {
      List <FeatureLink> featureNodeOutgoingLinks = featureNode.getOutgoingFeatureLinks();
      for(FeatureLink featureLink : featureNodeOutgoingLinks)
      {
        isSatisfied = isSatisfied && evaluateFeatureLink(featureLink);
      }
    }
    return isSatisfied;
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "umpleModel = "+(getUmpleModel()!=null?Integer.toHexString(System.identityHashCode(getUmpleModel())):"null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 566 "../../../../src/UmpleInternalParser_CodeRequireStatement.ump"
  public List <FeatureNode> getRootFeatures () 
  {
    // A root feature : has outgoing links but no incoming links.
    List <FeatureNode> rootFeatures = getNode().stream().filter(n -> (n.hasOutgoingFeatureLinks() && (! n.hasIncomingFeatureLinks()))).collect(Collectors.toList());
    return rootFeatures;
  }

  
}