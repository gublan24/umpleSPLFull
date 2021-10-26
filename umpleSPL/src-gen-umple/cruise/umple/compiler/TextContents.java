/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 241 "../../../../src/Generator_Html.ump"
public class TextContents extends Element
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TextContents(String aTagName, Element aParent)
  {
    super(aTagName, aParent);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 244 "../../../../src/Generator_Html.ump"
  public String htmlString(){
    return getTagName();
  }

}