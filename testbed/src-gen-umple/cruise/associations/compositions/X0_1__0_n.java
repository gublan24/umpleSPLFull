/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 105 "../../../../src/TestHarnessCompositionsLeft.ump"
public class X0_1__0_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_1__0_n Attributes
  private int num;

  //X0_1__0_n Associations
  private Y0_1__0_n y0_1__0_n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X0_1__0_n(int aNum)
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
  public Y0_1__0_n getY0_1__0_n()
  {
    return y0_1__0_n;
  }

  public boolean hasY0_1__0_n()
  {
    boolean has = y0_1__0_n != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToOptionalN */
  public boolean setY0_1__0_n(Y0_1__0_n aY0_1__0_n)
  {
    boolean wasSet = false;
    if (aY0_1__0_n != null && aY0_1__0_n.numberOfXVar() >= Y0_1__0_n.maximumNumberOfXVar())
    {
      return wasSet;
    }

    Y0_1__0_n existingY0_1__0_n = y0_1__0_n;
    y0_1__0_n = aY0_1__0_n;
    if (existingY0_1__0_n != null && !existingY0_1__0_n.equals(aY0_1__0_n))
    {
      existingY0_1__0_n.removeXVar(this);
    }
    if (aY0_1__0_n != null)
    {
      aY0_1__0_n.addXVar(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Y0_1__0_n existingY0_1__0_n = y0_1__0_n;
    y0_1__0_n = null;
    if (existingY0_1__0_n != null)
    {
      existingY0_1__0_n.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y0_1__0_n = "+(getY0_1__0_n()!=null?Integer.toHexString(System.identityHashCode(getY0_1__0_n())):"null");
  }
}