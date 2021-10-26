/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 95 "../../../../src/TestHarnessCompositionsLeft.ump"
public class X0_1__star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_1__star Attributes
  private int num;

  //X0_1__star Associations
  private Y0_1__star y0_1__star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X0_1__star(int aNum)
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
  public Y0_1__star getY0_1__star()
  {
    return y0_1__star;
  }

  public boolean hasY0_1__star()
  {
    boolean has = y0_1__star != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setY0_1__star(Y0_1__star aY0_1__star)
  {
    boolean wasSet = false;
    Y0_1__star existingY0_1__star = y0_1__star;
    y0_1__star = aY0_1__star;
    if (existingY0_1__star != null && !existingY0_1__star.equals(aY0_1__star))
    {
      existingY0_1__star.removeXVar(this);
    }
    if (aY0_1__star != null)
    {
      aY0_1__star.addXVar(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Y0_1__star existingY0_1__star = y0_1__star;
    y0_1__star = null;
    if (existingY0_1__star != null)
    {
      existingY0_1__star.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y0_1__star = "+(getY0_1__star()!=null?Integer.toHexString(System.identityHashCode(getY0_1__star())):"null");
  }
}