/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;

// line 228 "../../../../src/NuSMVMetamodel.ump"
public class ModuleElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ModuleElement Attributes
  private String header;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModuleElement()
  {
    header = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setHeader(String aHeader)
  {
    boolean wasSet = false;
    header = aHeader;
    wasSet = true;
    return wasSet;
  }

  public String getHeader()
  {
    return header;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "header" + ":" + getHeader()+ "]";
  }
}