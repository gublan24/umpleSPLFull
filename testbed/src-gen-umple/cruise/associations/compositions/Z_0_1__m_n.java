/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 96 "../../../../src/TestHarnessCompositionsRight.ump"
public class Z_0_1__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Z_0_1__m_n Attributes
  private int num;

  //Z_0_1__m_n Associations
  private YR_0_1__m_n y_0_1__m_n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Z_0_1__m_n(int aNum)
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
  public YR_0_1__m_n getY_0_1__m_n()
  {
    return y_0_1__m_n;
  }

  public boolean hasY_0_1__m_n()
  {
    boolean has = y_0_1__m_n != null;
    return has;
  }

  public void delete()
  {
    if (y_0_1__m_n != null)
    {
        YR_0_1__m_n placeholderY_0_1__m_n = y_0_1__m_n;
        this.y_0_1__m_n = null;
        placeholderY_0_1__m_n.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y_0_1__m_n = "+(getY_0_1__m_n()!=null?Integer.toHexString(System.identityHashCode(getY_0_1__m_n())):"null");
  }
}