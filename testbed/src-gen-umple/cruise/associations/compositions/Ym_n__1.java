/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;

// line 158 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Ym_n__1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ym_n__1 Attributes
  private int v;

  //Ym_n__1 Associations
  private Xm_n__1 xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ym_n__1(Xm_n__1 aXVar)
  {
    v = 1;
    boolean didAddXVar = setXVar(aXVar);
    if (!didAddXVar)
    {
      throw new RuntimeException("Unable to create ym_n__1 due to xVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  public Xm_n__1 getXVar()
  {
    return xVar;
  }
  /* Code from template association_SetOneToAtMostN */
  public boolean setXVar(Xm_n__1 aXVar)
  {
    boolean wasSet = false;
    //Must provide xVar to ym_n__1
    if (aXVar == null)
    {
      return wasSet;
    }

    //xVar already at maximum (3)
    if (aXVar.numberOfYm_n__1() >= Xm_n__1.maximumNumberOfYm_n__1())
    {
      return wasSet;
    }
    
    Xm_n__1 existingXVar = xVar;
    xVar = aXVar;
    if (existingXVar != null && !existingXVar.equals(aXVar))
    {
      boolean didRemove = existingXVar.removeYm_n__1(this);
      if (!didRemove)
      {
        xVar = existingXVar;
        return wasSet;
      }
    }
    xVar.addYm_n__1(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Xm_n__1 placeholderXVar = xVar;
    this.xVar = null;
    if(placeholderXVar != null)
    {
      placeholderXVar.removeYm_n__1(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "xVar = "+(getXVar()!=null?Integer.toHexString(System.identityHashCode(getXVar())):"null");
  }
}