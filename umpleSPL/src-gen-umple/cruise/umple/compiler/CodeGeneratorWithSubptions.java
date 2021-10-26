/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Default implementation for generators with suboptions
 */
// line 28 "../../../../src/Generator.ump"
public class CodeGeneratorWithSubptions implements CodeGenerator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CodeGeneratorWithSubptions Attributes
  private List<String> suboptions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CodeGeneratorWithSubptions()
  {
    suboptions = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addSuboption(String aSuboption)
  {
    boolean wasAdded = false;
    wasAdded = suboptions.add(aSuboption);
    return wasAdded;
  }

  public boolean removeSuboption(String aSuboption)
  {
    boolean wasRemoved = false;
    wasRemoved = suboptions.remove(aSuboption);
    return wasRemoved;
  }
  /* Code from template attribute_GetMany */
  public String getSuboption(int index)
  {
    String aSuboption = suboptions.get(index);
    return aSuboption;
  }

  public String[] getSuboptions()
  {
    String[] newSuboptions = suboptions.toArray(new String[suboptions.size()]);
    return newSuboptions;
  }

  public int numberOfSuboptions()
  {
    int number = suboptions.size();
    return number;
  }

  public boolean hasSuboptions()
  {
    boolean has = suboptions.size() > 0;
    return has;
  }

  public int indexOfSuboption(String aSuboption)
  {
    int index = suboptions.indexOf(aSuboption);
    return index;
  }

  public void delete()
  {}

  // line 34 "../../../../src/Generator.ump"
   public boolean hasSuboption(String subopt){
    return suboptions.contains(subopt);
  }

  // line 39 "../../../../src/Generator.ump"
   public boolean setSuboption(String subopt){
    return suboptions.add(subopt);
  }


  /**
   * Allows independent code generation tools
   * Different generators will do different things regarding where the files are put, etc.
   */
  @Override
  public boolean setModel(UmpleModel aUmpleModel){
          return false;
  }


  /**
   * Allows independent code generation tools
   * Different generators will do different things regarding where the files are put, etc.
   */
  @Override
  public boolean setOutput(String aString){
          return false;
  }


  /**
   * Allows independent code generation tools
   * Different generators will do different things regarding where the files are put, etc.
   */
  @Override
  public void generate(){
          return ;
  }


  /**
   * Allows independent code generation tools
   * Different generators will do different things regarding where the files are put, etc.
   */
  @Override
  public void prepare(){
          return ;
  }


  /**
   * Allows independent code generation tools
   * Different generators will do different things regarding where the files are put, etc.
   */
  @Override
  public void postpare(){
          return ;
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}