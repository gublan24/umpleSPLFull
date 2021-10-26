/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 118 "../../../../src/TestHarnessCompositionsRight.ump"
public class YR_1_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_1_1 Attributes
  private int v;

  //YR_1_1 Associations
  private Z_1_1 zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YR_1_1(Z_1_1 aZVar)
  {
    v = 1;
    if (aZVar == null || aZVar.getY_1_1() != null)
    {
      throw new RuntimeException("Unable to create YR_1_1 due to aZVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    zVar = aZVar;
  }

  public YR_1_1(int aNumForZVar)
  {
    v = 1;
    zVar = new Z_1_1(aNumForZVar, this);
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
  public Z_1_1 getZVar()
  {
    return zVar;
  }

  public void delete()
  {
    Z_1_1 existingZVar = zVar;
    zVar = null;
    if (existingZVar != null)
    {
      existingZVar.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "zVar = "+(getZVar()!=null?Integer.toHexString(System.identityHashCode(getZVar())):"null");
  }
}