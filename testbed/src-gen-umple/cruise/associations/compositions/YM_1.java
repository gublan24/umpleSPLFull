/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 128 "../../../../src/TestHarnessCompositionsLeft.ump"
public class YM_1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YM_1 Attributes
  private int v;

  //YM_1 Associations
  private XM_1 xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YM_1(XM_1 aXVar)
  {
    v = 1;
    boolean didAddXVar = setXVar(aXVar);
    if (!didAddXVar)
    {
      throw new RuntimeException("Unable to create ym_1 due to xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  public XM_1 getXVar()
  {
    return xVar;
  }
  /* Code from template association_SetOneToAtMostN */
  public boolean setXVar(XM_1 aXVar)
  {
    boolean wasSet = false;
    //Must provide xVar to ym_1
    if (aXVar == null)
    {
      return wasSet;
    }

    //xVar already at maximum (3)
    if (aXVar.numberOfYm_1() >= XM_1.maximumNumberOfYm_1())
    {
      return wasSet;
    }
    
    XM_1 existingXVar = xVar;
    xVar = aXVar;
    if (existingXVar != null && !existingXVar.equals(aXVar))
    {
      boolean didRemove = existingXVar.removeYm_1(this);
      if (!didRemove)
      {
        xVar = existingXVar;
        return wasSet;
      }
    }
    xVar.addYm_1(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    XM_1 placeholderXVar = xVar;
    this.xVar = null;
    if(placeholderXVar != null)
    {
      placeholderXVar.removeYm_1(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "xVar = "+(getXVar()!=null?Integer.toHexString(System.identityHashCode(getXVar())):"null");
  }
}