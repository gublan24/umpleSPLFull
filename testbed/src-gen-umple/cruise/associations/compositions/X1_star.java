/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 23 "../../../../src/TestHarnessCompositionsLeft.ump"
public class X1_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X1_star Attributes
  private int num;

  //X1_star Associations
  private Y1_star y1_star;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X1_star(int aNum, Y1_star aY1_star)
  {
    num = aNum;
    boolean didAddY1_star = setY1_star(aY1_star);
    if (!didAddY1_star)
    {
      throw new RuntimeException("Unable to create xVar due to y1_star. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  public Y1_star getY1_star()
  {
    return y1_star;
  }
  /* Code from template association_SetOneToMany */
  public boolean setY1_star(Y1_star aY1_star)
  {
    boolean wasSet = false;
    if (aY1_star == null)
    {
      return wasSet;
    }

    Y1_star existingY1_star = y1_star;
    y1_star = aY1_star;
    if (existingY1_star != null && !existingY1_star.equals(aY1_star))
    {
      existingY1_star.removeXVar(this);
    }
    y1_star.addXVar(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Y1_star existingY1_star = y1_star;
    y1_star = null;
    if (existingY1_star != null)
    {
      existingY1_star.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y1_star = "+(getY1_star()!=null?Integer.toHexString(System.identityHashCode(getY1_star())):"null");
  }
}