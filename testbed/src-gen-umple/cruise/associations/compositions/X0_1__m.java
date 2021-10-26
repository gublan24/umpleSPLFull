/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 90 "../../../../src/TestHarnessCompositionsLeft.ump"
public class X0_1__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_1__m Attributes
  private int num;

  //X0_1__m Associations
  private Y0_1__m y0_1__m;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X0_1__m(int aNum)
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
  public Y0_1__m getY0_1__m()
  {
    return y0_1__m;
  }

  public boolean hasY0_1__m()
  {
    boolean has = y0_1__m != null;
    return has;
  }

  public void delete()
  {
    Y0_1__m existingY0_1__m = y0_1__m;
    y0_1__m = null;
    if (existingY0_1__m != null)
    {
      existingY0_1__m.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y0_1__m = "+(getY0_1__m()!=null?Integer.toHexString(System.identityHashCode(getY0_1__m())):"null");
  }
}