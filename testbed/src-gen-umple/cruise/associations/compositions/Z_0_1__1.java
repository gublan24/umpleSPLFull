/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 81 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_0_1__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_1__1 Attributes
  private int num;

  //Z_0_1__1 Associations
  private YR_0_1__1 y_0_1__1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_0_1__1(int aNum)
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
  public YR_0_1__1 getY_0_1__1()
  {
    return y_0_1__1;
  }

  public boolean hasY_0_1__1()
  {
    boolean has = y_0_1__1 != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setY_0_1__1(YR_0_1__1 aNewY_0_1__1)
  {
    boolean wasSet = false;
    if (y_0_1__1 != null && !y_0_1__1.equals(aNewY_0_1__1) && equals(y_0_1__1.getZVar()))
    {
      //Unable to setY_0_1__1, as existing y_0_1__1 would become an orphan
      return wasSet;
    }

    y_0_1__1 = aNewY_0_1__1;
    Z_0_1__1 anOldZVar = aNewY_0_1__1 != null ? aNewY_0_1__1.getZVar() : null;

    if (!this.equals(anOldZVar))
    {
      if (anOldZVar != null)
      {
        anOldZVar.y_0_1__1 = null;
      }
      if (y_0_1__1 != null)
      {
        y_0_1__1.setZVar(this);
      }
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    YR_0_1__1 existingY_0_1__1 = y_0_1__1;
    y_0_1__1 = null;
    if (existingY_0_1__1 != null)
    {
      existingY_0_1__1.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y_0_1__1 = "+(getY_0_1__1()!=null?Integer.toHexString(System.identityHashCode(getY_0_1__1())):"null");
  }
}