/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 122 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Y1_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y1_1 Attributes
  private int v;

  //Y1_1 Associations
  private X1_1 xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Y1_1(X1_1 aXVar)
  {
    v = 1;
    if (aXVar == null || aXVar.getY1_1() != null)
    {
      throw new RuntimeException("Unable to create Y1_1 due to aXVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    xVar = aXVar;
  }

  public Y1_1(int aNumForXVar)
  {
    v = 1;
    xVar = new X1_1(aNumForXVar, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setV(int aV)
  {
    boolean wasSet = false;
    v = aV;
    wasSet = true;
    return wasSet;
  }

  public int getV()
  {
    return v;
  }
  /* Code from template association_GetOne */
  public X1_1 getXVar()
  {
    return xVar;
  }

  public void delete()
  {
    X1_1 existingXVar = xVar;
    xVar = null;
    if (existingXVar != null)
    {
      existingXVar.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "xVar = "+(getXVar()!=null?Integer.toHexString(System.identityHashCode(getXVar())):"null");
  }
}