/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 15 "../../../../src/Generator_CodeNothing.ump"
public class NothingGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //NothingGenerator Attributes
  private UmpleModel model;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NothingGenerator()
  {
    super();
    model = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setModel(UmpleModel aModel)
  {
    boolean wasSet = false;
    model = aModel;
    wasSet = true;
    return wasSet;
  }

  public UmpleModel getModel()
  {
    return model;
  }

  public void delete()
  {
    super.delete();
  }

  // line 21 "../../../../src/Generator_CodeNothing.ump"
   public void generate(){
    model.setCode("nothing");
    return;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}