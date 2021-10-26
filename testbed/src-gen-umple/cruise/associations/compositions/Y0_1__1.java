/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 213 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Y0_1__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y0_1__1 Attributes
  private int v;

  //Y0_1__1 Associations
  private X0_1__1 xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Y0_1__1(X0_1__1 aXVar)
  {
    v = 1;
    boolean didAddXVar = setXVar(aXVar);
    if (!didAddXVar)
    {
      throw new RuntimeException("Unable to create y0_1__1 due to xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  public X0_1__1 getXVar()
  {
    return xVar;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setXVar(X0_1__1 aNewXVar)
  {
    boolean wasSet = false;
    if (aNewXVar == null)
    {
      //Unable to setXVar to null, as y0_1__1 must always be associated to a xVar
      return wasSet;
    }
    
    Y0_1__1 existingY0_1__1 = aNewXVar.getY0_1__1();
    if (existingY0_1__1 != null && !equals(existingY0_1__1))
    {
      //Unable to setXVar, the current xVar already has a y0_1__1, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    X0_1__1 anOldXVar = xVar;
    xVar = aNewXVar;
    xVar.setY0_1__1(this);

    if (anOldXVar != null)
    {
      anOldXVar.setY0_1__1(null);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    X0_1__1 existingXVar = xVar;
    xVar = null;
    if (existingXVar != null)
    {
      existingXVar.setY0_1__1(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "xVar = "+(getXVar()!=null?Integer.toHexString(System.identityHashCode(getXVar())):"null");
  }
}