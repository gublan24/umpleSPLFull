/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 232 "../../../../src/TestHarnessCompositionsRight.ump"
public class YR_0_1__0_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_1__0_n Attributes
  private int v;

  //YR_0_1__0_n Associations
  private List<Z_0_1__0_n> zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YR_0_1__0_n()
  {
    v = 1;
    zVar = new ArrayList<Z_0_1__0_n>();
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
  /* Code from template association_GetMany */
  public Z_0_1__0_n getZVar(int index)
  {
    Z_0_1__0_n aZVar = zVar.get(index);
    return aZVar;
  }

  public List<Z_0_1__0_n> getZVar()
  {
    List<Z_0_1__0_n> newZVar = Collections.unmodifiableList(zVar);
    return newZVar;
  }

  public int numberOfZVar()
  {
    int number = zVar.size();
    return number;
  }

  public boolean hasZVar()
  {
    boolean has = zVar.size() > 0;
    return has;
  }

  public int indexOfZVar(Z_0_1__0_n aZVar)
  {
    int index = zVar.indexOf(aZVar);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfZVar()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfZVar()
  {
    return 3;
  }
  /* Code from template association_AddOptionalNToOptionalOne */
  public boolean addZVar(Z_0_1__0_n aZVar)
  {
    boolean wasAdded = false;
    if (zVar.contains(aZVar)) { return false; }
    if (numberOfZVar() >= maximumNumberOfZVar())
    {
      return wasAdded;
    }

    YR_0_1__0_n existingY_0_1__0_n = aZVar.getY_0_1__0_n();
    if (existingY_0_1__0_n == null)
    {
      aZVar.setY_0_1__0_n(this);
    }
    else if (!this.equals(existingY_0_1__0_n))
    {
      existingY_0_1__0_n.removeZVar(aZVar);
      addZVar(aZVar);
    }
    else
    {
      zVar.add(aZVar);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeZVar(Z_0_1__0_n aZVar)
  {
    boolean wasRemoved = false;
    if (zVar.contains(aZVar))
    {
      zVar.remove(aZVar);
      aZVar.setY_0_1__0_n(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addZVarAt(Z_0_1__0_n aZVar, int index)
  {  
    boolean wasAdded = false;
    if(addZVar(aZVar))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfZVar()) { index = numberOfZVar() - 1; }
      zVar.remove(aZVar);
      zVar.add(index, aZVar);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveZVarAt(Z_0_1__0_n aZVar, int index)
  {
    boolean wasAdded = false;
    if(zVar.contains(aZVar))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfZVar()) { index = numberOfZVar() - 1; }
      zVar.remove(aZVar);
      zVar.add(index, aZVar);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addZVarAt(aZVar, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (zVar.size() > 0)
    {
      Z_0_1__0_n aZVar = zVar.get(zVar.size() - 1);
      aZVar.delete();
      zVar.remove(aZVar);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]";
  }
}