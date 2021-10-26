/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 106 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_0_1__0_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_1__0_1 Attributes
  private int num;

  //Z_0_1__0_1 Associations
  private YR_0_1__0_1 y_0_1__0_1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_0_1__0_1(int aNum)
  {
    num = aNum;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNum(int aNum)
  {
    boolean wasSet = false;
    num = aNum;
    wasSet = true;
    return wasSet;
  }

  public int getNum()
  {
    return num;
  }
  /* Code from template association_GetOne */
  public YR_0_1__0_1 getY_0_1__0_1()
  {
    return y_0_1__0_1;
  }

  public boolean hasY_0_1__0_1()
  {
    boolean has = y_0_1__0_1 != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToOptionalOne */
  public boolean setY_0_1__0_1(YR_0_1__0_1 aNewY_0_1__0_1)
  {
    boolean wasSet = false;
    if (aNewY_0_1__0_1 == null)
    {
      YR_0_1__0_1 existingY_0_1__0_1 = y_0_1__0_1;
      y_0_1__0_1 = null;
      
      if (existingY_0_1__0_1 != null && existingY_0_1__0_1.getZVar() != null)
      {
        existingY_0_1__0_1.setZVar(null);
      }
      wasSet = true;
      return wasSet;
    }

    YR_0_1__0_1 currentY_0_1__0_1 = getY_0_1__0_1();
    if (currentY_0_1__0_1 != null && !currentY_0_1__0_1.equals(aNewY_0_1__0_1))
    {
      currentY_0_1__0_1.setZVar(null);
    }

    y_0_1__0_1 = aNewY_0_1__0_1;
    Z_0_1__0_1 existingZVar = aNewY_0_1__0_1.getZVar();

    if (!equals(existingZVar))
    {
      aNewY_0_1__0_1.setZVar(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (y_0_1__0_1 != null)
    {
      y_0_1__0_1.setZVar(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y_0_1__0_1 = "+(getY_0_1__0_1()!=null?Integer.toHexString(System.identityHashCode(getY_0_1__0_1())):"null");
  }
}