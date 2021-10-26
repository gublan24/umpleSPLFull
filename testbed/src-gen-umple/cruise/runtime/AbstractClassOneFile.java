/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.runtime;

// line 4 "../../../src/runtime/ExtendsClassOneFile.ump"
public abstract class AbstractClassOneFile
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AbstractClassOneFile()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

   public abstract void foo();

  // line 10 "../../../src/runtime/ExtendsClassOneFile.ump"
   public void DivideByZero(int a){
    a = a / 0;
  }

}