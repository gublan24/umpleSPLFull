/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 238 "../../../../src/TestHarnessCompositionsRight.ump"
public class YR_0_1__0_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_1__0_1 Attributes
  private int v;

  //YR_0_1__0_1 Associations
  private Z_0_1__0_1 zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YR_0_1__0_1()
  {
    v = 1;
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
  public Z_0_1__0_1 getZVar()
  {
    return zVar;
  }

  public boolean hasZVar()
  {
    boolean has = zVar != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToOptionalOne */
  public boolean setZVar(Z_0_1__0_1 aNewZVar)
  {
    boolean wasSet = false;
    if (aNewZVar == null)
    {
      Z_0_1__0_1 existingZVar = zVar;
      zVar = null;
      
      if (existingZVar != null && existingZVar.getY_0_1__0_1() != null)
      {
        existingZVar.setY_0_1__0_1(null);
      }
      wasSet = true;
      return wasSet;
    }

    Z_0_1__0_1 currentZVar = getZVar();
    if (currentZVar != null && !currentZVar.equals(aNewZVar))
    {
      currentZVar.setY_0_1__0_1(null);
    }

    zVar = aNewZVar;
    YR_0_1__0_1 existingY_0_1__0_1 = aNewZVar.getY_0_1__0_1();

    if (!equals(existingY_0_1__0_1))
    {
      aNewZVar.setY_0_1__0_1(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Z_0_1__0_1 existingZVar = zVar;
    zVar = null;
    if (existingZVar != null)
    {
      existingZVar.delete();
      existingZVar.setY_0_1__0_1(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "zVar = "+(getZVar()!=null?Integer.toHexString(System.identityHashCode(getZVar())):"null");
  }
}