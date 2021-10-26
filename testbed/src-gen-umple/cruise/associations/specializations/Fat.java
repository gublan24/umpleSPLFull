/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * Both ends are specialized                                [6]
 */
// line 82 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Fat
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Fat Associations
  private List<BigCreature> bigs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Fat()
  {
    bigs = new ArrayList<BigCreature>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public BigCreature getBig(int index)
  {
    BigCreature aBig = bigs.get(index);
    return aBig;
  }

  public List<BigCreature> getBigs()
  {
    List<BigCreature> newBigs = Collections.unmodifiableList(bigs);
    return newBigs;
  }

  public int numberOfBigs()
  {
    int number = bigs.size();
    return number;
  }

  public boolean hasBigs()
  {
    boolean has = bigs.size() > 0;
    return has;
  }

  public int indexOfBig(BigCreature aBig)
  {
    int index = bigs.indexOf(aBig);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_bigs()
  {
    bigs.clear();
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfBigs()
  {
    return 0;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfBigs()
  {
    return 4;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addBig(BigCreature aBig)
  {
    boolean wasAdded = false;
    if (bigs.contains(aBig)) { return false; }
    if (numberOfBigs() >= maximumNumberOfBigs())
    {
      return wasAdded;
    }

    bigs.add(aBig);
    if (aBig.indexOfFat(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aBig.addFat(this);
      if (!wasAdded)
      {
        bigs.remove(aBig);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeBig(BigCreature aBig)
  {
    boolean wasRemoved = false;
    if (!bigs.contains(aBig))
    {
      return wasRemoved;
    }

    int oldIndex = bigs.indexOf(aBig);
    bigs.remove(oldIndex);
    if (aBig.indexOfFat(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aBig.removeFat(this);
      if (!wasRemoved)
      {
        bigs.add(oldIndex,aBig);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetOptionalNToMany */
  public boolean setBigs(BigCreature... newBigs)
  {
    boolean wasSet = false;
    ArrayList<BigCreature> verifiedBigs = new ArrayList<BigCreature>();
    for (BigCreature aBig : newBigs)
    {
      if (verifiedBigs.contains(aBig))
      {
        continue;
      }
      verifiedBigs.add(aBig);
    }

    if (verifiedBigs.size() != newBigs.length || verifiedBigs.size() > maximumNumberOfBigs())
    {
      return wasSet;
    }

    ArrayList<BigCreature> oldBigs = new ArrayList<BigCreature>(bigs);
    bigs.clear();
    for (BigCreature aNewBig : verifiedBigs)
    {
      bigs.add(aNewBig);
      if (oldBigs.contains(aNewBig))
      {
        oldBigs.remove(aNewBig);
      }
      else
      {
        aNewBig.addFat(this);
      }
    }

    for (BigCreature anOldBig : oldBigs)
    {
      anOldBig.removeFat(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addBigAt(BigCreature aBig, int index)
  {  
    boolean wasAdded = false;
    if(addBig(aBig))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBigs()) { index = numberOfBigs() - 1; }
      bigs.remove(aBig);
      bigs.add(index, aBig);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBigAt(BigCreature aBig, int index)
  {
    boolean wasAdded = false;
    if(bigs.contains(aBig))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBigs()) { index = numberOfBigs() - 1; }
      bigs.remove(aBig);
      bigs.add(index, aBig);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBigAt(aBig, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<BigCreature> copyOfBigs = new ArrayList<BigCreature>(bigs);
    bigs.clear();
    for(BigCreature aBig : copyOfBigs)
    {
      aBig.removeFat(this);
    }
  }

}