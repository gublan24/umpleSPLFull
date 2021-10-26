/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 100 "../../../../src/TestHarnessCompositionsLeft.ump"
public class X0_1__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //X0_1__m_n Attributes
  private int num;

  //X0_1__m_n Associations
  private Y0_1__m_n y0_1__m_n;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public X0_1__m_n(int aNum)
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
  public Y0_1__m_n getY0_1__m_n()
  {
    return y0_1__m_n;
  }

  public boolean hasY0_1__m_n()
  {
    boolean has = y0_1__m_n != null;
    return has;
  }

  public void delete()
  {
    Y0_1__m_n existingY0_1__m_n = y0_1__m_n;
    y0_1__m_n = null;
    if (existingY0_1__m_n != null)
    {
      existingY0_1__m_n.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "num" + ":" + getNum()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "y0_1__m_n = "+(getY0_1__m_n()!=null?Integer.toHexString(System.identityHashCode(getY0_1__m_n())):"null");
  }
}