/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 84 "../../../../src/TestHarnessCompositionsLeft.ump"
public class X0_1__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_1__1 Attributes
  private int num;

  //X0_1__1 Associations
  private Y0_1__1 y0_1__1;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X0_1__1(int aNum)
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
  public Y0_1__1 getY0_1__1()
  {
    return y0_1__1;
  }

  public boolean hasY0_1__1()
  {
    boolean has = y0_1__1 != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setY0_1__1(Y0_1__1 aNewY0_1__1)
  {
    boolean wasSet = false;
    if (y0_1__1 != null && !y0_1__1.equals(aNewY0_1__1) && equals(y0_1__1.getXVar()))
    {
      //Unable to setY0_1__1, as existing y0_1__1 would become an orphan
      return wasSet;
    }

    y0_1__1 = aNewY0_1__1;
    X0_1__1 anOldXVar = aNewY0_1__1 != null ? aNewY0_1__1.getXVar() : null;

    if (!this.equals(anOldXVar))
    {
      if (anOldXVar != null)
      {
        anOldXVar.y0_1__1 = null;
      }
      if (y0_1__1 != null)
      {
        y0_1__1.setXVar(this);
      }
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Y0_1__1 existingY0_1__1 = y0_1__1;
    y0_1__1 = null;
    if (existingY0_1__1 != null)
    {
      existingY0_1__1.delete();
      existingY0_1__1.setXVar(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y0_1__1 = "+(getY0_1__1()!=null?Integer.toHexString(System.identityHashCode(getY0_1__1())):"null");
  }
}