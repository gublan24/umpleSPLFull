/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * [37]
 */
// line 382 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Xc
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Xc Associations
  private List<Cvv> cvv;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Xc()
  {
    cvv = new ArrayList<Cvv>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Cvv getCvv(int index)
  {
    Cvv aCvv = cvv.get(index);
    return aCvv;
  }

  public List<Cvv> getCvv()
  {
    List<Cvv> newCvv = Collections.unmodifiableList(cvv);
    return newCvv;
  }

  public int numberOfCvv()
  {
    int number = cvv.size();
    return number;
  }

  public boolean hasCvv()
  {
    boolean has = cvv.size() > 0;
    return has;
  }

  public int indexOfCvv(Cvv aCvv)
  {
    int index = cvv.indexOf(aCvv);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_cvv()
  {
    cvv.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCvv()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addCvv(Cvv aCvv)
  {
    boolean wasAdded = false;
    if (cvv.contains(aCvv)) { return false; }
    cvv.add(aCvv);
    if (aCvv.indexOfXc(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCvv.addXc(this);
      if (!wasAdded)
      {
        cvv.remove(aCvv);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeCvv(Cvv aCvv)
  {
    boolean wasRemoved = false;
    if (!cvv.contains(aCvv))
    {
      return wasRemoved;
    }

    int oldIndex = cvv.indexOf(aCvv);
    cvv.remove(oldIndex);
    if (aCvv.indexOfXc(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCvv.removeXc(this);
      if (!wasRemoved)
      {
        cvv.add(oldIndex,aCvv);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCvvAt(Cvv aCvv, int index)
  {  
    boolean wasAdded = false;
    if(addCvv(aCvv))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCvv()) { index = numberOfCvv() - 1; }
      cvv.remove(aCvv);
      cvv.add(index, aCvv);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCvvAt(Cvv aCvv, int index)
  {
    boolean wasAdded = false;
    if(cvv.contains(aCvv))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCvv()) { index = numberOfCvv() - 1; }
      cvv.remove(aCvv);
      cvv.add(index, aCvv);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCvvAt(aCvv, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Cvv> copyOfCvv = new ArrayList<Cvv>(cvv);
    cvv.clear();
    for(Cvv aCvv : copyOfCvv)
    {
      aCvv.removeXc(this);
    }
  }

}