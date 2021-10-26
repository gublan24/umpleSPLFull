/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 46 "../../../../src/ClassDependencyNode.ump"
public class ClassDependencyTree
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassDependencyTree Attributes
  private boolean isLevelled;
  private boolean isProcessed;

  //ClassDependencyTree Associations
  private List<ClassDependencyNode> classDependencyNodes;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ClassDependencyTree(boolean aIsLevelled, boolean aIsProcessed)
  {
    isLevelled = aIsLevelled;
    isProcessed = aIsProcessed;
    classDependencyNodes = new ArrayList<ClassDependencyNode>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsLevelled(boolean aIsLevelled)
  {
    boolean wasSet = false;
    isLevelled = aIsLevelled;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsProcessed(boolean aIsProcessed)
  {
    boolean wasSet = false;
    isProcessed = aIsProcessed;
    wasSet = true;
    return wasSet;
  }

  public boolean getIsLevelled()
  {
    return isLevelled;
  }

  public boolean getIsProcessed()
  {
    return isProcessed;
  }
  /* Code from template association_GetMany */
  public ClassDependencyNode getClassDependencyNode(int index)
  {
    ClassDependencyNode aClassDependencyNode = classDependencyNodes.get(index);
    return aClassDependencyNode;
  }

  public List<ClassDependencyNode> getClassDependencyNodes()
  {
    List<ClassDependencyNode> newClassDependencyNodes = Collections.unmodifiableList(classDependencyNodes);
    return newClassDependencyNodes;
  }

  public int numberOfClassDependencyNodes()
  {
    int number = classDependencyNodes.size();
    return number;
  }

  public boolean hasClassDependencyNodes()
  {
    boolean has = classDependencyNodes.size() > 0;
    return has;
  }

  public int indexOfClassDependencyNode(ClassDependencyNode aClassDependencyNode)
  {
    int index = classDependencyNodes.indexOf(aClassDependencyNode);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfClassDependencyNodes()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addClassDependencyNode(ClassDependencyNode aClassDependencyNode)
  {
    boolean wasAdded = false;
    if (classDependencyNodes.contains(aClassDependencyNode)) { return false; }
    ClassDependencyTree existingClassDependencyTree = aClassDependencyNode.getClassDependencyTree();
    if (existingClassDependencyTree == null)
    {
      aClassDependencyNode.setClassDependencyTree(this);
    }
    else if (!this.equals(existingClassDependencyTree))
    {
      existingClassDependencyTree.removeClassDependencyNode(aClassDependencyNode);
      addClassDependencyNode(aClassDependencyNode);
    }
    else
    {
      classDependencyNodes.add(aClassDependencyNode);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeClassDependencyNode(ClassDependencyNode aClassDependencyNode)
  {
    boolean wasRemoved = false;
    if (classDependencyNodes.contains(aClassDependencyNode))
    {
      classDependencyNodes.remove(aClassDependencyNode);
      aClassDependencyNode.setClassDependencyTree(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addClassDependencyNodeAt(ClassDependencyNode aClassDependencyNode, int index)
  {  
    boolean wasAdded = false;
    if(addClassDependencyNode(aClassDependencyNode))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfClassDependencyNodes()) { index = numberOfClassDependencyNodes() - 1; }
      classDependencyNodes.remove(aClassDependencyNode);
      classDependencyNodes.add(index, aClassDependencyNode);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveClassDependencyNodeAt(ClassDependencyNode aClassDependencyNode, int index)
  {
    boolean wasAdded = false;
    if(classDependencyNodes.contains(aClassDependencyNode))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfClassDependencyNodes()) { index = numberOfClassDependencyNodes() - 1; }
      classDependencyNodes.remove(aClassDependencyNode);
      classDependencyNodes.add(index, aClassDependencyNode);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addClassDependencyNodeAt(aClassDependencyNode, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !classDependencyNodes.isEmpty() )
    {
      classDependencyNodes.get(0).setClassDependencyTree(null);
    }
  }


  /**
   * List<String> cdN;
   */
  // line 56 "../../../../src/ClassDependencyNode.ump"
   public boolean containsNode(ClassDependencyNode node){
    if ( this.containsNode(node))
	  {
		  return true;
	  }
	  
	  return false;
  }

  // line 67 "../../../../src/ClassDependencyNode.ump"
   public boolean containsNode(String name){
    for (ClassDependencyNode node : getClassDependencyNodes())
	  {
		  if (node.getUClassName().equals(name))
		  {
			  return true;
		  }
	  }
	  
	  return false;
  }


  public String toString()
  {
    return super.toString() + "["+
            "isLevelled" + ":" + getIsLevelled()+ "," +
            "isProcessed" + ":" + getIsProcessed()+ "]";
  }
}