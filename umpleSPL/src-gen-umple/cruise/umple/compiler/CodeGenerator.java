/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/
package cruise.umple.compiler;
/**
 * Allows independent code generation tools
 * Different generators will do different things regarding where the files are put, etc.
 */
// line 16 "../../../../src/Generator.ump"
public interface CodeGenerator
{
  
  // ABSTRACT METHODS 

 public boolean setModel(UmpleModel aUmpleModel);
 public boolean setOutput(String aString);
 public boolean setSuboption(String subopt);
 public boolean hasSuboption(String subopt);
 public void generate();
 public void prepare();
 public void postpare();
}