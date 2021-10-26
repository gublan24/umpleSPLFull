/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 134 "../../../../src/TestHarnessCompositionsLeft.ump"
public class YM_M
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //YM_M Attributes
  private int v;

  //YM_M Associations
  private List<XM_M> xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public YM_M()
  {
    v = 1;
    xVar = new ArrayList<XM_M>();
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
  public XM_M getXVar(int index)
  {
    XM_M aXVar = xVar.get(index);
    return aXVar;
  }

  public List<XM_M> getXVar()
  {
    List<XM_M> newXVar = Collections.unmodifiableList(xVar);
    return newXVar;
  }

  public int numberOfXVar()
  {
    int number = xVar.size();
    return number;
  }

  public boolean hasXVar()
  {
    boolean has = xVar.size() > 0;
    return has;
  }

  public int indexOfXVar(XM_M aXVar)
  {
    int index = xVar.indexOf(aXVar);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfXVarValid()
  {
    boolean isValid = numberOfXVar() >= minimumNumberOfXVar() && numberOfXVar() <= maximumNumberOfXVar();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfXVar()
  {
    return 3;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfXVar()
  {
    return 3;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfXVar()
  {
    return 3;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addXVar(XM_M aXVar)
  {
    boolean wasAdded = false;
    if (xVar.contains(aXVar)) { return false; }
    if (numberOfXVar() >= maximumNumberOfXVar())
    {
      return wasAdded;
    }

    xVar.add(aXVar);
    if (aXVar.indexOfYm_m(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aXVar.addYm_m(this);
      if (!wasAdded)
      {
        xVar.remove(aXVar);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany */
  public boolean removeXVar(XM_M aXVar)
  {
    boolean wasRemoved = false;
    if (!xVar.contains(aXVar))
    {
      return wasRemoved;
    }

    if (numberOfXVar() <= minimumNumberOfXVar())
    {
      return wasRemoved;
    }

    int oldIndex = xVar.indexOf(aXVar);
    xVar.remove(oldIndex);
    if (aXVar.indexOfYm_m(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aXVar.removeYm_m(this);
      if (!wasRemoved)
      {
        xVar.add(oldIndex,aXVar);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany */
  public boolean setXVar(XM_M... newXVar)
  {
    boolean wasSet = false;
    ArrayList<XM_M> verifiedXVar = new ArrayList<XM_M>();
    for (XM_M aXVar : newXVar)
    {
      if (verifiedXVar.contains(aXVar))
      {
        continue;
      }
      verifiedXVar.add(aXVar);
    }

    if (verifiedXVar.size() != newXVar.length || verifiedXVar.size() < minimumNumberOfXVar() || verifiedXVar.size() > maximumNumberOfXVar())
    {
      return wasSet;
    }

    ArrayList<XM_M> oldXVar = new ArrayList<XM_M>(xVar);
    xVar.clear();
    for (XM_M aNewXVar : verifiedXVar)
    {
      xVar.add(aNewXVar);
      if (oldXVar.contains(aNewXVar))
      {
        oldXVar.remove(aNewXVar);
      }
      else
      {
        aNewXVar.addYm_m(this);
      }
    }

    for (XM_M anOldXVar : oldXVar)
    {
      anOldXVar.removeYm_m(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<XM_M> copyOfXVar = new ArrayList<XM_M>(xVar);
    xVar.clear();
    for(XM_M aXVar : copyOfXVar)
    {
      if (aXVar.numberOfYm_m() <= XM_M.minimumNumberOfYm_m())
      {
        aXVar.delete();
      }
      else
      {
        aXVar.removeYm_m(this);
      }
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]";
  }
}