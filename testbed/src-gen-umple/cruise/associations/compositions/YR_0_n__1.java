/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 178 "../../../../src/TestHarnessCompositionsRight.ump"
public class YR_0_n__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_n__1 Attributes
  private int v;

  //YR_0_n__1 Associations
  private Z_0_n__1 zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YR_0_n__1(Z_0_n__1 aZVar)
  {
    v = 1;
    boolean didAddZVar = setZVar(aZVar);
    if (!didAddZVar)
    {
      throw new RuntimeException("Unable to create y_0_n__1 due to zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  public Z_0_n__1 getZVar()
  {
    return zVar;
  }
  /* Code from template association_SetOneToAtMostN */
  public boolean setZVar(Z_0_n__1 aZVar)
  {
    boolean wasSet = false;
    //Must provide zVar to y_0_n__1
    if (aZVar == null)
    {
      return wasSet;
    }

    //zVar already at maximum (3)
    if (aZVar.numberOfY_0_n__1() >= Z_0_n__1.maximumNumberOfY_0_n__1())
    {
      return wasSet;
    }
    
    Z_0_n__1 existingZVar = zVar;
    zVar = aZVar;
    if (existingZVar != null && !existingZVar.equals(aZVar))
    {
      boolean didRemove = existingZVar.removeY_0_n__1(this);
      if (!didRemove)
      {
        zVar = existingZVar;
        return wasSet;
      }
    }
    zVar.addY_0_n__1(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Z_0_n__1 existingZVar = zVar;
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