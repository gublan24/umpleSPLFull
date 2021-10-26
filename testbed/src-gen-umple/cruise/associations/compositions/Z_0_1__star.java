/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 91 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_0_1__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_1__star Attributes
  private int num;

  //Z_0_1__star Associations
  private YR_0_1__star y_0_1__star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_0_1__star(int aNum)
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
  public YR_0_1__star getY_0_1__star()
  {
    return y_0_1__star;
  }

  public boolean hasY_0_1__star()
  {
    boolean has = y_0_1__star != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setY_0_1__star(YR_0_1__star aY_0_1__star)
  {
    boolean wasSet = false;
    YR_0_1__star existingY_0_1__star = y_0_1__star;
    y_0_1__star = aY_0_1__star;
    if (existingY_0_1__star != null && !existingY_0_1__star.equals(aY_0_1__star))
    {
      existingY_0_1__star.removeZVar(this);
    }
    if (aY_0_1__star != null)
    {
      aY_0_1__star.addZVar(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (y_0_1__star != null)
    {
      YR_0_1__star placeholderY_0_1__star = y_0_1__star;
      this.y_0_1__star = null;
      placeholderY_0_1__star.removeZVar(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y_0_1__star = "+(getY_0_1__star()!=null?Integer.toHexString(System.identityHashCode(getY_0_1__star())):"null");
  }
}