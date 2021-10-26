/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 86 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_0_1__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_1__m Attributes
  private int num;

  //Z_0_1__m Associations
  private YR_0_1__m y_0_1__m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_0_1__m(int aNum)
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
  public YR_0_1__m getY_0_1__m()
  {
    return y_0_1__m;
  }

  public boolean hasY_0_1__m()
  {
    boolean has = y_0_1__m != null;
    return has;
  }

  public void delete()
  {
    if (y_0_1__m != null)
    {
        YR_0_1__m placeholderY_0_1__m = y_0_1__m;
        this.y_0_1__m = null;
        placeholderY_0_1__m.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y_0_1__m = "+(getY_0_1__m()!=null?Integer.toHexString(System.identityHashCode(getY_0_1__m())):"null");
  }
}