/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * 
 * A combination of Class and Association (as defined in UML)
 * An AssociationClass is a full-fledged class, but at the same time
 * It associates two other classes that would otherwise have a many-many
 * relationship. Instances of the AssociationClass represent data
 * held by the links between those two classes.
 */
// line 630 "../../../../src/Association_refactored.ump"
// line 872 "../../../../src/Umple.ump"
public class AssociationClass extends UmpleClass
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociationClass Associations
  private List<Association> associatedTo;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AssociationClass(String aName, UmpleModel aSourceModel)
  {
    super(aName, aSourceModel);
    associatedTo = new ArrayList<Association>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Association getAssociatedTo(int index)
  {
    Association aAssociatedTo = associatedTo.get(index);
    return aAssociatedTo;
  }

  public List<Association> getAssociatedTo()
  {
    List<Association> newAssociatedTo = Collections.unmodifiableList(associatedTo);
    return newAssociatedTo;
  }

  public int numberOfAssociatedTo()
  {
    int number = associatedTo.size();
    return number;
  }

  public boolean hasAssociatedTo()
  {
    boolean has = associatedTo.size() > 0;
    return has;
  }

  public int indexOfAssociatedTo(Association aAssociatedTo)
  {
    int index = associatedTo.indexOf(aAssociatedTo);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAssociatedTo()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfAssociatedTo()
  {
    return 2;
  }
  /* Code from template association_AddUnidirectionalOptionalN */
  public boolean addAssociatedTo(Association aAssociatedTo)
  {
    boolean wasAdded = false;
    if (associatedTo.contains(aAssociatedTo)) { return false; }
    if (numberOfAssociatedTo() < maximumNumberOfAssociatedTo())
    {
      associatedTo.add(aAssociatedTo);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean removeAssociatedTo(Association aAssociatedTo)
  {
    boolean wasRemoved = false;
    if (associatedTo.contains(aAssociatedTo))
    {
      associatedTo.remove(aAssociatedTo);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_SetUnidirectionalOptionalN */
  public boolean setAssociatedTo(Association... newAssociatedTo)
  {
    boolean wasSet = false;
    ArrayList<Association> verifiedAssociatedTo = new ArrayList<Association>();
    for (Association aAssociatedTo : newAssociatedTo)
    {
      if (verifiedAssociatedTo.contains(aAssociatedTo))
      {
        continue;
      }
      verifiedAssociatedTo.add(aAssociatedTo);
    }

    if (verifiedAssociatedTo.size() != newAssociatedTo.length || verifiedAssociatedTo.size() > maximumNumberOfAssociatedTo())
    {
      return wasSet;
    }

    associatedTo.clear();
    associatedTo.addAll(verifiedAssociatedTo);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAssociatedToAt(Association aAssociatedTo, int index)
  {  
    boolean wasAdded = false;
    if(addAssociatedTo(aAssociatedTo))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociatedTo()) { index = numberOfAssociatedTo() - 1; }
      associatedTo.remove(aAssociatedTo);
      associatedTo.add(index, aAssociatedTo);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAssociatedToAt(Association aAssociatedTo, int index)
  {
    boolean wasAdded = false;
    if(associatedTo.contains(aAssociatedTo))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAssociatedTo()) { index = numberOfAssociatedTo() - 1; }
      associatedTo.remove(aAssociatedTo);
      associatedTo.add(index, aAssociatedTo);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAssociatedToAt(aAssociatedTo, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    associatedTo.clear();
    super.delete();
  }

  // line 634 "../../../../src/Association_refactored.ump"
   public  AssociationClass(String name){
    this(name, null);
  }

  // line 639 "../../../../src/Association_refactored.ump"
   public void addMissingKeyIfNeeded(){
    Key key = getKey();
      if (!key.isProvided())
      {
        key = new Key();

        for(Association associatedTo: getAssociatedTo())
        {
          key.addMember(associatedTo.getEnd(1).getRoleName());
        }

        key.setIsInternal(true);
        setKey(key);
      }
  }

}