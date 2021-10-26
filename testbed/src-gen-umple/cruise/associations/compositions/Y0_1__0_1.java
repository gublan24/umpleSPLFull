/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 243 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Y0_1__0_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y0_1__0_1 Attributes
  private int v;

  //Y0_1__0_1 Associations
  private X0_1__0_1 xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Y0_1__0_1()
  {
    v = 1;
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
  public X0_1__0_1 getXVar()
  {
    return xVar;
  }

  public boolean hasXVar()
  {
    boolean has = xVar != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToOptionalOne */
  public boolean setXVar(X0_1__0_1 aNewXVar)
  {
    boolean wasSet = false;
    if (aNewXVar == null)
    {
      X0_1__0_1 existingXVar = xVar;
      xVar = null;
      
      if (existingXVar != null && existingXVar.getY0_1__0_1() != null)
      {
        existingXVar.setY0_1__0_1(null);
      }
      wasSet = true;
      return wasSet;
    }

    X0_1__0_1 currentXVar = getXVar();
    if (currentXVar != null && !currentXVar.equals(aNewXVar))
    {
      currentXVar.setY0_1__0_1(null);
    }

    xVar = aNewXVar;
    Y0_1__0_1 existingY0_1__0_1 = aNewXVar.getY0_1__0_1();

    if (!equals(existingY0_1__0_1))
    {
      aNewXVar.setY0_1__0_1(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (xVar != null)
    {
      xVar.setY0_1__0_1(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "xVar = "+(getXVar()!=null?Integer.toHexString(System.identityHashCode(getXVar())):"null");
  }
}