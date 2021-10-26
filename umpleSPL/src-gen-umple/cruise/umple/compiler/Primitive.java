/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 39 "../../../../src/Structure.ump"
public class Primitive
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Primitive Attributes
  private String name;

  //Primitive Associations
  private List<BasicConstraint> constraints;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Primitive(String aName)
  {
    name = aName;
    constraints = new ArrayList<BasicConstraint>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }
  /* Code from template association_GetMany */
  public BasicConstraint getConstraint(int index)
  {
    BasicConstraint aConstraint = constraints.get(index);
    return aConstraint;
  }

  public List<BasicConstraint> getConstraints()
  {
    List<BasicConstraint> newConstraints = Collections.unmodifiableList(constraints);
    return newConstraints;
  }

  public int numberOfConstraints()
  {
    int number = constraints.size();
    return number;
  }

  public boolean hasConstraints()
  {
    boolean has = constraints.size() > 0;
    return has;
  }

  public int indexOfConstraint(BasicConstraint aConstraint)
  {
    int index = constraints.indexOf(aConstraint);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfConstraints()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addConstraint(BasicConstraint aConstraint)
  {
    boolean wasAdded = false;
    if (constraints.contains(aConstraint)) { return false; }
    constraints.add(aConstraint);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeConstraint(BasicConstraint aConstraint)
  {
    boolean wasRemoved = false;
    if (constraints.contains(aConstraint))
    {
      constraints.remove(aConstraint);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addConstraintAt(BasicConstraint aConstraint, int index)
  {  
    boolean wasAdded = false;
    if(addConstraint(aConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstraints()) { index = numberOfConstraints() - 1; }
      constraints.remove(aConstraint);
      constraints.add(index, aConstraint);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveConstraintAt(BasicConstraint aConstraint, int index)
  {
    boolean wasAdded = false;
    if(constraints.contains(aConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConstraints()) { index = numberOfConstraints() - 1; }
      constraints.remove(aConstraint);
      constraints.add(index, aConstraint);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addConstraintAt(aConstraint, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    constraints.clear();
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "]";
  }
}