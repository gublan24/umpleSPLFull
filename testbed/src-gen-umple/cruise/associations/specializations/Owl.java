/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;

// line 117 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Owl
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Owl Associations
  private Tree trees;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Owl()
  {}

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Tree getTrees()
  {
    return trees;
  }

  public boolean hasTrees()
  {
    boolean has = trees != null;
    return has;
  }
  /* Code from template association_GetOne_clear */
  protected void clear_trees()
  {
    trees = null;
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Birch getTrees_OneBirch()
  {
    return (Birch)trees;
  } 
  /* Code from template association_SetOptionalOneToOptionalN */
  public boolean setTrees(Tree aTrees)
  {
    boolean wasSet = false;
    if (aTrees != null && aTrees.numberOfHoots() >= Tree.maximumNumberOfHoots())
    {
      return wasSet;
    }

    Tree existingTrees = trees;
    trees = aTrees;
    if (existingTrees != null && !existingTrees.equals(aTrees))
    {
      existingTrees.removeHoot(this);
    }
    if (aTrees != null)
    {
      aTrees.addHoot(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOneToAtMostN_relatedSpecialization */
  public boolean setTrees_Birch(Birch aTrees)
  {
    boolean wasSet = false;
    //Must provide trees to hoot
    if (aTrees == null)
    {
      return wasSet;
    }

    //trees already at maximum (3)
    if (aTrees.numberOfHoots() >= Birch.maximumNumberOfHoots_Owl())
    {
      return wasSet;
    }
    
    Birch existingTrees = (Birch)trees;
    trees = aTrees;
    if (existingTrees != null && !existingTrees.equals(aTrees))
    {
      boolean didRemove = existingTrees.removeHoot(this);
      if (!didRemove)
      {
        trees = existingTrees;
        return wasSet;
      }
    }
    aTrees.addHoot(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (trees != null)
    {
      Tree placeholderTrees = trees;
      this.trees = null;
      placeholderTrees.removeHoot(this);
    }
  }

}