/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 101 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_0_1__0_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_1__0_n Attributes
  private int num;

  //Z_0_1__0_n Associations
  private YR_0_1__0_n y_0_1__0_n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_0_1__0_n(int aNum)
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
  public YR_0_1__0_n getY_0_1__0_n()
  {
    return y_0_1__0_n;
  }

  public boolean hasY_0_1__0_n()
  {
    boolean has = y_0_1__0_n != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToOptionalN */
  public boolean setY_0_1__0_n(YR_0_1__0_n aY_0_1__0_n)
  {
    boolean wasSet = false;
    if (aY_0_1__0_n != null && aY_0_1__0_n.numberOfZVar() >= YR_0_1__0_n.maximumNumberOfZVar())
    {
      return wasSet;
    }

    YR_0_1__0_n existingY_0_1__0_n = y_0_1__0_n;
    y_0_1__0_n = aY_0_1__0_n;
    if (existingY_0_1__0_n != null && !existingY_0_1__0_n.equals(aY_0_1__0_n))
    {
      existingY_0_1__0_n.removeZVar(this);
    }
    if (aY_0_1__0_n != null)
    {
      aY_0_1__0_n.addZVar(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (y_0_1__0_n != null)
    {
      YR_0_1__0_n placeholderY_0_1__0_n = y_0_1__0_n;
      this.y_0_1__0_n = null;
      placeholderY_0_1__0_n.removeZVar(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y_0_1__0_n = "+(getY_0_1__0_n()!=null?Integer.toHexString(System.identityHashCode(getY_0_1__0_n())):"null");
  }
}