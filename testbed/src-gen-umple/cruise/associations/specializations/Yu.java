/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 314 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Yu
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Yu Associations
  private List<Ty> ty;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Yu()
  {
    ty = new ArrayList<Ty>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Ty getTy(int index)
  {
    Ty aTy = ty.get(index);
    return aTy;
  }

  public List<Ty> getTy()
  {
    List<Ty> newTy = Collections.unmodifiableList(ty);
    return newTy;
  }

  public int numberOfTy()
  {
    int number = ty.size();
    return number;
  }

  public boolean hasTy()
  {
    boolean has = ty.size() > 0;
    return has;
  }

  public int indexOfTy(Ty aTy)
  {
    int index = ty.indexOf(aTy);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_ty()
  {
    ty.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTy()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addTy(Ty aTy)
  {
    boolean wasAdded = false;
    if (ty.contains(aTy)) { return false; }
    ty.add(aTy);
    if (aTy.indexOfYu(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aTy.addYu(this);
      if (!wasAdded)
      {
        ty.remove(aTy);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeTy(Ty aTy)
  {
    boolean wasRemoved = false;
    if (!ty.contains(aTy))
    {
      return wasRemoved;
    }

    int oldIndex = ty.indexOf(aTy);
    ty.remove(oldIndex);
    if (aTy.indexOfYu(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aTy.removeYu(this);
      if (!wasRemoved)
      {
        ty.add(oldIndex,aTy);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTyAt(Ty aTy, int index)
  {  
    boolean wasAdded = false;
    if(addTy(aTy))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTy()) { index = numberOfTy() - 1; }
      ty.remove(aTy);
      ty.add(index, aTy);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTyAt(Ty aTy, int index)
  {
    boolean wasAdded = false;
    if(ty.contains(aTy))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTy()) { index = numberOfTy() - 1; }
      ty.remove(aTy);
      ty.add(index, aTy);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTyAt(aTy, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Ty> copyOfTy = new ArrayList<Ty>(ty);
    ty.clear();
    for(Ty aTy : copyOfTy)
    {
      aTy.removeYu(this);
    }
  }

}