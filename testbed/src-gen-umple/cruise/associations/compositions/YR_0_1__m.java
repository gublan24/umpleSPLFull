/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 214 "../../../../src/TestHarnessCompositionsRight.ump"
public class YR_0_1__m
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YR_0_1__m Attributes
  private int v;

  //YR_0_1__m Associations
  private List<Z_0_1__m> zVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YR_0_1__m(Z_0_1__m... allZVar)
  {
    v = 1;
    zVar = new ArrayList<Z_0_1__m>();
    boolean didAddZVar = setZVar(allZVar);
    if (!didAddZVar)
    {
      throw new RuntimeException("Unable to create YR_0_1__m, must have 3 zVar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  public Z_0_1__m getZVar(int index)
  {
    Z_0_1__m aZVar = zVar.get(index);
    return aZVar;
  }

  public List<Z_0_1__m> getZVar()
  {
    List<Z_0_1__m> newZVar = Collections.unmodifiableList(zVar);
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

  public int indexOfZVar(Z_0_1__m aZVar)
  {
    int index = zVar.indexOf(aZVar);
    return index;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfZVar()
  {
    return 3;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfZVar()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfZVar()
  {
    return 3;
  }
  /* Code from template association_SetNToOptionalOne */
  public boolean setZVar(Z_0_1__m... newZVar)
  {
    boolean wasSet = false;
    ArrayList<Z_0_1__m> checkNewZVar = new ArrayList<Z_0_1__m>();
    for (Z_0_1__m aZVar : newZVar)
    {
      if (checkNewZVar.contains(aZVar))
      {
        return wasSet;
      }
      else if (aZVar.getY_0_1__m() != null && !this.equals(aZVar.getY_0_1__m()))
      {
        return wasSet;
      }
      checkNewZVar.add(aZVar);
    }

    if (checkNewZVar.size() != minimumNumberOfZVar())
    {
      return wasSet;
    }

    zVar.removeAll(checkNewZVar);
    
    for (Z_0_1__m orphan : zVar)
    {
      setY_0_1__m(orphan, null);
    }
    zVar.clear();
    for (Z_0_1__m aZVar : newZVar)
    {
      setY_0_1__m(aZVar, this);
      zVar.add(aZVar);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_GetPrivate */
  private void setY_0_1__m(Z_0_1__m aZVar, YR_0_1__m aY_0_1__m)
  {
    try
    {
      java.lang.reflect.Field mentorField = aZVar.getClass().getDeclaredField("y_0_1__m");
      mentorField.setAccessible(true);
      mentorField.set(aZVar, aY_0_1__m);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aY_0_1__m to aZVar", e);
    }
  }

  public void delete()
  {
    while (zVar.size() > 0)
    {
      Z_0_1__m aZVar = zVar.get(zVar.size() - 1);
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