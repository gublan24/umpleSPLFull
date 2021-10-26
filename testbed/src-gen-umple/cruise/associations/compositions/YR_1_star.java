/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 136 "../../../../src/TestHarnessCompositionsRight.ump"
public class YR_1_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_1_star Attributes
  private int v;

  //YR_1_star Associations
  private List<Z_1_star> zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YR_1_star()
  {
    v = 1;
    zVar = new ArrayList<Z_1_star>();
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
  public Z_1_star getZVar(int index)
  {
    Z_1_star aZVar = zVar.get(index);
    return aZVar;
  }

  public List<Z_1_star> getZVar()
  {
    List<Z_1_star> newZVar = Collections.unmodifiableList(zVar);
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

  public int indexOfZVar(Z_1_star aZVar)
  {
    int index = zVar.indexOf(aZVar);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfZVar()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Z_1_star addZVar(int aNum)
  {
    return new Z_1_star(aNum, this);
  }

  public boolean addZVar(Z_1_star aZVar)
  {
    boolean wasAdded = false;
    if (zVar.contains(aZVar)) { return false; }
    YR_1_star existingY_1_star = aZVar.getY_1_star();
    boolean isNewY_1_star = existingY_1_star != null && !this.equals(existingY_1_star);
    if (isNewY_1_star)
    {
      aZVar.setY_1_star(this);
    }
    else
    {
      zVar.add(aZVar);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeZVar(Z_1_star aZVar)
  {
    boolean wasRemoved = false;
    //Unable to remove aZVar, as it must always have a y_1_star
    if (!this.equals(aZVar.getY_1_star()))
    {
      zVar.remove(aZVar);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addZVarAt(Z_1_star aZVar, int index)
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

  public boolean addOrMoveZVarAt(Z_1_star aZVar, int index)
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
      Z_1_star aZVar = zVar.get(zVar.size() - 1);
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