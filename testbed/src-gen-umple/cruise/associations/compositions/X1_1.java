/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 8 "../../../../src/TestHarnessCompositionsLeft.ump"
public class X1_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X1_1 Attributes
  private int num;

  //X1_1 Associations
  private Y1_1 y1_1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X1_1(int aNum, Y1_1 aY1_1)
  {
    num = aNum;
    if (aY1_1 == null || aY1_1.getXVar() != null)
    {
      throw new RuntimeException("Unable to create X1_1 due to aY1_1. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    y1_1 = aY1_1;
  }

  public X1_1(int aNum)
  {
    num = aNum;
    y1_1 = new Y1_1(this);
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
  public Y1_1 getY1_1()
  {
    return y1_1;
  }

  public void delete()
  {
    Y1_1 existingY1_1 = y1_1;
    y1_1 = null;
    if (existingY1_1 != null)
    {
      existingY1_1.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y1_1 = "+(getY1_1()!=null?Integer.toHexString(System.identityHashCode(getY1_1())):"null");
  }
}