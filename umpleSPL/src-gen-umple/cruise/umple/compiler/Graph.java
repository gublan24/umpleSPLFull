/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.util.*;
import java.util.*;

// line 47 "../../../../src/GraphWalking.ump"
// line 14 "../../../../src/GraphWalking_Code.ump"
public abstract class Graph
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Graph()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 18 "../../../../src/GraphWalking_Code.ump"
   public boolean hasNext(){
    if (this.stack == null && this.queue == null) return false;
    if (this.isDepthFirst) return ! stack.isEmpty();
    return ! this.queue.isEmpty();
  }

  // line 25 "../../../../src/GraphWalking_Code.ump"
   public boolean isDepthFirst(){
    return this.isDepthFirst;
  }


  /**
   * TODO this should be abstract but because of issue $$$ it makes child classes abstract.
   */
  // line 29 "../../../../src/GraphWalking_Code.ump"
   public Node nextNode(){
    return null;
  }


  /**
   * TODO same as above. should be abstract.
   */
  // line 32 "../../../../src/GraphWalking_Code.ump"
   public void clearNodes(){
    return;
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 53 "../../../../src/GraphWalking.ump"
  protected Node startNode ;
// line 54 "../../../../src/GraphWalking.ump"
  protected Boolean isDepthFirst = true ;
// line 55 "../../../../src/GraphWalking.ump"
  protected Stack<Node> stack ;
// line 56 "../../../../src/GraphWalking.ump"
  protected LinkedList<Node> queue ;

  
}