/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/
package cruise.umple.compiler;
/**
 * trait Node 
 * {
 * boolean visited = false;
 * public void visit()
 * {
 * this.visited = true;
 * }
 * 
 * public void clear()
 * {
 * this.visited = false;
 * }
 * }
 */
// line 40 "../../../../src/GraphWalking.ump"
public interface Node
{
  
  public void visit() ;

  public void clear() ;

}