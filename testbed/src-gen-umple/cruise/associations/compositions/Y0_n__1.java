/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 183 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Y0_n__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y0_n__1 Attributes
  private int v;

  //Y0_n__1 Associations
  private X0_n__1 xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Y0_n__1(X0_n__1 aXVar)
  {
    v = 1;
    boolean didAddXVar = setXVar(aXVar);
    if (!didAddXVar)
    {
      throw new RuntimeException("Unable to create y0_n__1 due to xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  public X0_n__1 getXVar()
  {
    return xVar;
  }
  /* Code from template association_SetOneToAtMostN */
  public boolean setXVar(X0_n__1 aXVar)
  {
    boolean wasSet = false;
    //Must provide xVar to y0_n__1
    if (aXVar == null)
    {
      return wasSet;
    }

    //xVar already at maximum (3)
    if (aXVar.numberOfY0_n__1() >= X0_n__1.maximumNumberOfY0_n__1())
    {
      return wasSet;
    }
    
    X0_n__1 existingXVar = xVar;
    xVar = aXVar;
    if (existingXVar != null && !existingXVar.equals(aXVar))
    {
      boolean didRemove = existingXVar.removeY0_n__1(this);
      if (!didRemove)
      {
        xVar = existingXVar;
        return wasSet;
      }
    }
    xVar.addY0_n__1(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    X0_n__1 placeholderXVar = xVar;
    this.xVar = null;
    if(placeholderXVar != null)
    {
      placeholderXVar.removeY0_n__1(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "xVar = "+(getXVar()!=null?Integer.toHexString(System.identityHashCode(getXVar())):"null");
  }
}