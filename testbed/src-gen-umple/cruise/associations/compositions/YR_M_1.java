/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 124 "../../../../src/TestHarnessCompositionsRight.ump"
public class YR_M_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_M_1 Attributes
  private int v;

  //YR_M_1 Associations
  private Z_M_1 zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YR_M_1(Z_M_1 aZVar)
  {
    v = 1;
    boolean didAddZVar = setZVar(aZVar);
    if (!didAddZVar)
    {
      throw new RuntimeException("Unable to create y_m_1 due to zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setV(int aV)
  {
    boolean wasSet = false;
    v = aV;
    wasSet = true;
    return wasSet;
  }

  public int getV()
  {
    return v;
  }
  /* Code from template association_GetOne */
  public Z_M_1 getZVar()
  {
    return zVar;
  }
  /* Code from template association_SetOneToAtMostN */
  public boolean setZVar(Z_M_1 aZVar)
  {
    boolean wasSet = false;
    //Must provide zVar to y_m_1
    if (aZVar == null)
    {
      return wasSet;
    }

    //zVar already at maximum (3)
    if (aZVar.numberOfY_m_1() >= Z_M_1.maximumNumberOfY_m_1())
    {
      return wasSet;
    }
    
    Z_M_1 existingZVar = zVar;
    zVar = aZVar;
    if (existingZVar != null && !existingZVar.equals(aZVar))
    {
      boolean didRemove = existingZVar.removeY_m_1(this);
      if (!didRemove)
      {
        zVar = existingZVar;
        return wasSet;
      }
    }
    zVar.addY_m_1(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Z_M_1 existingZVar = zVar;
    zVar = null;
    if (existingZVar != null)
    {
      existingZVar.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "zVar = "+(getZVar()!=null?Integer.toHexString(System.identityHashCode(getZVar())):"null");
  }
}