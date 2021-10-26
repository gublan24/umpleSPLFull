/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 21 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_1_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_1_star Attributes
  private int num;

  //Z_1_star Associations
  private YR_1_star y_1_star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_1_star(int aNum, YR_1_star aY_1_star)
  {
    num = aNum;
    boolean didAddY_1_star = setY_1_star(aY_1_star);
    if (!didAddY_1_star)
    {
      throw new RuntimeException("Unable to create zVar due to y_1_star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
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
  public YR_1_star getY_1_star()
  {
    return y_1_star;
  }
  /* Code from template association_SetOneToMany */
  public boolean setY_1_star(YR_1_star aY_1_star)
  {
    boolean wasSet = false;
    if (aY_1_star == null)
    {
      return wasSet;
    }

    YR_1_star existingY_1_star = y_1_star;
    y_1_star = aY_1_star;
    if (existingY_1_star != null && !existingY_1_star.equals(aY_1_star))
    {
      existingY_1_star.removeZVar(this);
    }
    y_1_star.addZVar(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    YR_1_star placeholderY_1_star = y_1_star;
    this.y_1_star = null;
    if(placeholderY_1_star != null)
    {
      placeholderY_1_star.removeZVar(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y_1_star = "+(getY_1_star()!=null?Integer.toHexString(System.identityHashCode(getY_1_star())):"null");
  }
}