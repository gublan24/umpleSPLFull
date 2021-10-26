/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 226 "../../../../src/TestHarnessCompositionsRight.ump"
public class YR_0_1__m_n
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_1__m_n Attributes
  private int v;

  //YR_0_1__m_n Associations
  private List<Z_0_1__m_n> zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YR_0_1__m_n(Z_0_1__m_n... allZVar)
  {
    v = 1;
    zVar = new ArrayList<Z_0_1__m_n>();
    boolean didAddZVar = setZVar(allZVar);
    if (!didAddZVar)
    {
      throw new RuntimeException("Unable to create YR_0_1__m_n, must have 2 to 3 zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  /* Code from template association_GetMany */
  public Z_0_1__m_n getZVar(int index)
  {
    Z_0_1__m_n aZVar = zVar.get(index);
    return aZVar;
  }

  public List<Z_0_1__m_n> getZVar()
  {
    List<Z_0_1__m_n> newZVar = Collections.unmodifiableList(zVar);
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

  public int indexOfZVar(Z_0_1__m_n aZVar)
  {
    int index = zVar.indexOf(aZVar);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfZVar()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfZVar()
  {
    return 3;
  }
  /* Code from template association_AddMNToOptionalOne */
  public boolean addZVar(Z_0_1__m_n aZVar)
  {
    boolean wasAdded = false;
    if (zVar.contains(aZVar)) { return false; }
    if (numberOfZVar() >= maximumNumberOfZVar())
    {
      return wasAdded;
    }
    YR_0_1__m_n existingY_0_1__m_n = aZVar.getY_0_1__m_n();
    if (existingY_0_1__m_n != null && existingY_0_1__m_n.numberOfZVar() <= minimumNumberOfZVar())
    {
      return wasAdded;
    }
    else if (existingY_0_1__m_n != null)
    {
      existingY_0_1__m_n.zVar.remove(aZVar);
    }
    zVar.add(aZVar);
    setY_0_1__m_n(aZVar,this);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeZVar(Z_0_1__m_n aZVar)
  {
    boolean wasRemoved = false;
    if (zVar.contains(aZVar) && numberOfZVar() > minimumNumberOfZVar())
    {
      zVar.remove(aZVar);
      setY_0_1__m_n(aZVar,null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToOptionalOne */
  public boolean setZVar(Z_0_1__m_n... newZVar)
  {
    boolean wasSet = false;
    if (newZVar.length < minimumNumberOfZVar() || newZVar.length > maximumNumberOfZVar())
    {
      return wasSet;
    }

    ArrayList<Z_0_1__m_n> checkNewZVar = new ArrayList<Z_0_1__m_n>();
    HashMap<YR_0_1__m_n,Integer> y_0_1__m_nToNewZVar = new HashMap<YR_0_1__m_n,Integer>();
    for (Z_0_1__m_n aZVar : newZVar)
    {
      if (checkNewZVar.contains(aZVar))
      {
        return wasSet;
      }
      else if (aZVar.getY_0_1__m_n() != null && !this.equals(aZVar.getY_0_1__m_n()))
      {
        YR_0_1__m_n existingY_0_1__m_n = aZVar.getY_0_1__m_n();
        if (!y_0_1__m_nToNewZVar.containsKey(existingY_0_1__m_n))
        {
          y_0_1__m_nToNewZVar.put(existingY_0_1__m_n, Integer.valueOf(existingY_0_1__m_n.numberOfZVar()));
        }
        Integer currentCount = y_0_1__m_nToNewZVar.get(existingY_0_1__m_n);
        int nextCount = currentCount - 1;
        if (nextCount < 2)
        {
          return wasSet;
        }
        y_0_1__m_nToNewZVar.put(existingY_0_1__m_n, Integer.valueOf(nextCount));
      }
      checkNewZVar.add(aZVar);
    }

    zVar.removeAll(checkNewZVar);

    for (Z_0_1__m_n orphan : zVar)
    {
      setY_0_1__m_n(orphan, null);
    }
    zVar.clear();
    for (Z_0_1__m_n aZVar : newZVar)
    {
      if (aZVar.getY_0_1__m_n() != null)
      {
        aZVar.getY_0_1__m_n().zVar.remove(aZVar);
      }
      setY_0_1__m_n(aZVar, this);
      zVar.add(aZVar);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setY_0_1__m_n(Z_0_1__m_n aZVar, YR_0_1__m_n aY_0_1__m_n)
  {
    try
    {
      java.lang.reflect.Field mentorField = aZVar.getClass().getDeclaredField("y_0_1__m_n");
      mentorField.setAccessible(true);
      mentorField.set(aZVar, aY_0_1__m_n);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aY_0_1__m_n to aZVar", e);
    }
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addZVarAt(Z_0_1__m_n aZVar, int index)
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

  public boolean addOrMoveZVarAt(Z_0_1__m_n aZVar, int index)
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
      Z_0_1__m_n aZVar = zVar.get(zVar.size() - 1);
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