/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/
package cruise.umple.compiler;
/**
 * User can define their own walker that receives an UmpleModelVisitor to visit a given element contents
 */
// line 132 "../../../../src/Generator_UmpleModelWalker.ump"
public interface IWalker
{
  
  // ABSTRACT METHODS 

 public void accept(UmpleModelVisitor visitor);
}