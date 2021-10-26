/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 110 "../../../../src/TestHarnessCompositionsLeft.ump"
public class X0_1__0_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_1__0_1 Attributes
  private int num;

  //X0_1__0_1 Associations
  private Y0_1__0_1 y0_1__0_1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X0_1__0_1(int aNum)
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
  public Y0_1__0_1 getY0_1__0_1()
  {
    return y0_1__0_1;
  }

  public boolean hasY0_1__0_1()
  {
    boolean has = y0_1__0_1 != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToOptionalOne */
  public boolean setY0_1__0_1(Y0_1__0_1 aNewY0_1__0_1)
  {
    boolean wasSet = false;
    if (aNewY0_1__0_1 == null)
    {
      Y0_1__0_1 existingY0_1__0_1 = y0_1__0_1;
      y0_1__0_1 = null;
      
      if (existingY0_1__0_1 != null && existingY0_1__0_1.getXVar() != null)
      {
        existingY0_1__0_1.setXVar(null);
      }
      wasSet = true;
      return wasSet;
    }

    Y0_1__0_1 currentY0_1__0_1 = getY0_1__0_1();
    if (currentY0_1__0_1 != null && !currentY0_1__0_1.equals(aNewY0_1__0_1))
    {
      currentY0_1__0_1.setXVar(null);
    }

    y0_1__0_1 = aNewY0_1__0_1;
    X0_1__0_1 existingXVar = aNewY0_1__0_1.getXVar();

    if (!equals(existingXVar))
    {
      aNewY0_1__0_1.setXVar(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Y0_1__0_1 existingY0_1__0_1 = y0_1__0_1;
    y0_1__0_1 = null;
    if (existingY0_1__0_1 != null)
    {
      existingY0_1__0_1.delete();
      existingY0_1__0_1.setXVar(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y0_1__0_1 = "+(getY0_1__0_1()!=null?Integer.toHexString(System.identityHashCode(getY0_1__0_1())):"null");
  }
}