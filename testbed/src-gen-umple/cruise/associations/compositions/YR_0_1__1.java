/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 208 "../../../../src/TestHarnessCompositionsRight.ump"
public class YR_0_1__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_1__1 Attributes
  private int v;

  //YR_0_1__1 Associations
  private Z_0_1__1 zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YR_0_1__1(Z_0_1__1 aZVar)
  {
    v = 1;
    boolean didAddZVar = setZVar(aZVar);
    if (!didAddZVar)
    {
      throw new RuntimeException("Unable to create y_0_1__1 due to zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
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
  public Z_0_1__1 getZVar()
  {
    return zVar;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setZVar(Z_0_1__1 aNewZVar)
  {
    boolean wasSet = false;
    if (aNewZVar == null)
    {
      //Unable to setZVar to null, as y_0_1__1 must always be associated to a zVar
      return wasSet;
    }
    
    YR_0_1__1 existingY_0_1__1 = aNewZVar.getY_0_1__1();
    if (existingY_0_1__1 != null && !equals(existingY_0_1__1))
    {
      //Unable to setZVar, the current zVar already has a y_0_1__1, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    Z_0_1__1 anOldZVar = zVar;
    zVar = aNewZVar;
    zVar.setY_0_1__1(this);

    if (anOldZVar != null)
    {
      anOldZVar.setY_0_1__1(null);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Z_0_1__1 existingZVar = zVar;
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