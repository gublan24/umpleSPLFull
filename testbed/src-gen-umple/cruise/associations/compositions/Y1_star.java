/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.compositions;
import java.util.*;

// line 140 "../../../../src/TestHarnessCompositionsLeft.ump"
public class Y1_star
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Y1_star Attributes
  private int v;

  //Y1_star Associations
  private List<X1_star> xVar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Y1_star()
  {
    v = 1;
    xVar = new ArrayList<X1_star>();
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
  public X1_star getXVar(int index)
  {
    X1_star aXVar = xVar.get(index);
    return aXVar;
  }

  public List<X1_star> getXVar()
  {
    List<X1_star> newXVar = Collections.unmodifiableList(xVar);
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

  public int indexOfXVar(X1_star aXVar)
  {
    int index = xVar.indexOf(aXVar);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfXVar()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public X1_star addXVar(int aNum)
  {
    return new X1_star(aNum, this);
  }

  public boolean addXVar(X1_star aXVar)
  {
    boolean wasAdded = false;
    if (xVar.contains(aXVar)) { return false; }
    Y1_star existingY1_star = aXVar.getY1_star();
    boolean isNewY1_star = existingY1_star != null && !this.equals(existingY1_star);
    if (isNewY1_star)
    {
      aXVar.setY1_star(this);
    }
    else
    {
      xVar.add(aXVar);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeXVar(X1_star aXVar)
  {
    boolean wasRemoved = false;
    //Unable to remove aXVar, as it must always have a y1_star
    if (!this.equals(aXVar.getY1_star()))
    {
      xVar.remove(aXVar);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addXVarAt(X1_star aXVar, int index)
  {  
    boolean wasAdded = false;
    if(addXVar(aXVar))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfXVar()) { index = numberOfXVar() - 1; }
      xVar.remove(aXVar);
      xVar.add(index, aXVar);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveXVarAt(X1_star aXVar, int index)
  {
    boolean wasAdded = false;
    if(xVar.contains(aXVar))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfXVar()) { index = numberOfXVar() - 1; }
      xVar.remove(aXVar);
      xVar.add(index, aXVar);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addXVarAt(aXVar, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (xVar.size() > 0)
    {
      X1_star aXVar = xVar.get(xVar.size() - 1);
      aXVar.delete();
      xVar.remove(aXVar);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "v" + ":" + getV()+ "]";
  }
}