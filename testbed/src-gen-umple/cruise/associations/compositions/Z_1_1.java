/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 6 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_1_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_1_1 Attributes
  private int num;

  //Z_1_1 Associations
  private YR_1_1 y_1_1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_1_1(int aNum, YR_1_1 aY_1_1)
  {
    num = aNum;
    if (aY_1_1 == null || aY_1_1.getZVar() != null)
    {
      throw new RuntimeException("Unable to create Z_1_1 due to aY_1_1. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    y_1_1 = aY_1_1;
  }

  public Z_1_1(int aNum)
  {
    num = aNum;
    y_1_1 = new YR_1_1(this);
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
  public YR_1_1 getY_1_1()
  {
    return y_1_1;
  }

  public void delete()
  {
    YR_1_1 existingY_1_1 = y_1_1;
    y_1_1 = null;
    if (existingY_1_1 != null)
    {
      existingY_1_1.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y_1_1 = "+(getY_1_1()!=null?Integer.toHexString(System.identityHashCode(getY_1_1())):"null");
  }
}