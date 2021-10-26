/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.*;
import java.io.Serializable;

// line 236 "../../../../../UmpleTLTemplates/Attributes.ump"
public class GenActiveField extends GenField
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenActiveField Attributes
  private String conjugatedField;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenActiveField()
  {
    super();
    conjugatedField = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setConjugatedField(String aConjugatedField)
  {
    boolean wasSet = false;
    conjugatedField = aConjugatedField;
    wasSet = true;
    return wasSet;
  }

  public String getConjugatedField()
  {
    return conjugatedField;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "conjugatedField" + ":" + getConjugatedField()+ "]";
  }
}