/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 351 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Fg
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Fg Associations
  private List<Df> df;
  private List<Gh> gh;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Fg()
  {
    df = new ArrayList<Df>();
    gh = new ArrayList<Gh>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Df getDf(int index)
  {
    Df aDf = df.get(index);
    return aDf;
  }

  public List<Df> getDf()
  {
    List<Df> newDf = Collections.unmodifiableList(df);
    return newDf;
  }

  public int numberOfDf()
  {
    int number = df.size();
    return number;
  }

  public boolean hasDf()
  {
    boolean has = df.size() > 0;
    return has;
  }

  public int indexOfDf(Df aDf)
  {
    int index = df.indexOf(aDf);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_df()
  {
    df.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Dff getDf_Dff(int index)
  {
    Dff aDf = (Dff)df.get(index);
    return aDf;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Dff> getDf_Dff()
  {
    List<? extends Df> newDf = Collections.unmodifiableList(df);
    return (List<Dff>)newDf;
  }
  /* Code from template association_GetMany */
  public Gh getGh(int index)
  {
    Gh aGh = gh.get(index);
    return aGh;
  }

  public List<Gh> getGh()
  {
    List<Gh> newGh = Collections.unmodifiableList(gh);
    return newGh;
  }

  public int numberOfGh()
  {
    int number = gh.size();
    return number;
  }

  public boolean hasGh()
  {
    boolean has = gh.size() > 0;
    return has;
  }

  public int indexOfGh(Gh aGh)
  {
    int index = gh.indexOf(aGh);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_gh()
  {
    gh.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Ghh getGh_Ghh(int index)
  {
    Ghh aGh = (Ghh)gh.get(index);
    return aGh;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Ghh> getGh_Ghh()
  {
    List<? extends Gh> newGh = Collections.unmodifiableList(gh);
    return (List<Ghh>)newGh;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDf()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDf(Df aDf)
  {
    boolean wasAdded = false;
    if (df.contains(aDf)) { return false; }
    if (df.contains(aDf)) { return false; }
    df.add(aDf);
    if (aDf.indexOfFg(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDf.addFg(this);
      if (!wasAdded)
      {
        df.remove(aDf);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDf(Df aDf)
  {
    boolean wasRemoved = false;
    if (!df.contains(aDf))
    {
      return wasRemoved;
    }

    int oldIndex = df.indexOf(aDf);
    df.remove(oldIndex);
    if (aDf.indexOfFg(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDf.removeFg(this);
      if (!wasRemoved)
      {
        df.add(oldIndex,aDf);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDfAt(Df aDf, int index)
  {  
    boolean wasAdded = false;
    if(addDf(aDf))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDf()) { index = numberOfDf() - 1; }
      df.remove(aDf);
      df.add(index, aDf);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDfAt(Df aDf, int index)
  {
    boolean wasAdded = false;
    if(df.contains(aDf))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDf()) { index = numberOfDf() - 1; }
      df.remove(aDf);
      df.add(index, aDf);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDfAt(aDf, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_IsNumberOfValidMethod_relatedSpecialization */
  public boolean isNumberOfDfValid_Dff()
  {
    boolean isValid = numberOfDf() >= minimumNumberOfDf_Dff() && numberOfDf() <= maximumNumberOfDf_Dff();
    return isValid;
  }
  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfDf_Dff()
  {
    return 5;
  }
  /* Code from template association_MaximumNumberOfMethod_relatedSpecialization */
  public static int maximumNumberOfDf_Dff()
  {
    return 9;
  }
  /* Code from template association_AddManyToManyMethod_relatedSpecialization */
  public boolean addDf(Dff aDf)
  {
    boolean wasAdded = false;
    if (df.contains(aDf)) { return false; }
    if (df.contains(aDf)) { return false; }
    if (numberOfDf() >= maximumNumberOfDf_Dff())
    {
      return wasAdded;
    }

    df.add(aDf);
    if (aDf.indexOfFg(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDf.addFg(this);
      if (!wasAdded)
      {
        df.remove(aDf);
      }
    }
    return wasAdded;
  }
  /* Code from template association_AddMNToMany_relatedSpecialization */
  public boolean removeDf(Dff aDf)
  {
    boolean wasRemoved = false;
    if (!df.contains(aDf))
    {
      return wasRemoved;
    }

    if (numberOfDf() <= minimumNumberOfDf_Dff())
    {
      return wasRemoved;
    }

    int oldIndex = df.indexOf(aDf);
    df.remove(oldIndex);
    if (aDf.indexOfFg(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDf.removeFg(this);
      if (!wasRemoved)
      {
        df.add(oldIndex,aDf);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_SetMNToMany_relatedSpecialization */
  public boolean setDf_Dff(Dff... newDf)
  {
    boolean wasSet = false;
    ArrayList<Dff> verifiedDf = new ArrayList<Dff>();
    for (Dff aDf : newDf)
    {
      if (verifiedDf.contains(aDf))
      {
        continue;
      }
      verifiedDf.add(aDf);
    }

    if (verifiedDf.size() != newDf.length || verifiedDf.size() < minimumNumberOfDf_Dff() || verifiedDf.size() > maximumNumberOfDf_Dff())
    {
      return wasSet;
    }

    ArrayList<Dff> oldDf = new ArrayList<Dff>(getDf_Dff());
    df.clear();
    for (Dff aNewDf : verifiedDf)
    {
      df.add(aNewDf);
      if (oldDf.contains(aNewDf))
      {
        oldDf.remove(aNewDf);
      }
      else
      {
        aNewDf.addFg(this);
      }
    }

    for (Dff anOldDf : oldDf)
    {
      anOldDf.removeFg(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */
  public boolean addDfAt(Dff aDf, int index)
  {  
    boolean wasAdded = false;
    if(addDf(aDf))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDf()) { index = numberOfDf() - 1; }
      df.remove(aDf);
      df.add(index, aDf);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDfAt(Dff aDf, int index)
  {
    boolean wasAdded = false;
    if(df.contains(aDf))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDf()) { index = numberOfDf() - 1; }
      df.remove(aDf);
      df.add(index, aDf);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDfAt(aDf, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfGh()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addGh(Gh aGh)
  {
    boolean wasAdded = false;
    if (gh.contains(aGh)) { return false; }
    if (gh.contains(aGh)) { return false; }
    gh.add(aGh);
    if (aGh.indexOfFg(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aGh.addFg(this);
      if (!wasAdded)
      {
        gh.remove(aGh);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeGh(Gh aGh)
  {
    boolean wasRemoved = false;
    if (!gh.contains(aGh))
    {
      return wasRemoved;
    }

    int oldIndex = gh.indexOf(aGh);
    gh.remove(oldIndex);
    if (aGh.indexOfFg(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aGh.removeFg(this);
      if (!wasRemoved)
      {
        gh.add(oldIndex,aGh);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addGhAt(Gh aGh, int index)
  {  
    boolean wasAdded = false;
    if(addGh(aGh))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGh()) { index = numberOfGh() - 1; }
      gh.remove(aGh);
      gh.add(index, aGh);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGhAt(Gh aGh, int index)
  {
    boolean wasAdded = false;
    if(gh.contains(aGh))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGh()) { index = numberOfGh() - 1; }
      gh.remove(aGh);
      gh.add(index, aGh);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGhAt(aGh, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfGh_Ghh()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod_relatedSpecialization */
  public boolean addGh(Ghh aGh)
  {
    boolean wasAdded = false;
    if (gh.contains(aGh)) { return false; }
    if (gh.contains(aGh)) { return false; }
    gh.add(aGh);
    if (aGh.indexOfFg(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aGh.addFg(this);
      if (!wasAdded)
      {
        gh.remove(aGh);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeGh(Ghh aGh)
  {
    boolean wasRemoved = false;
    if (!gh.contains(aGh))
    {
      return wasRemoved;
    }

    int oldIndex = gh.indexOf(aGh);
    gh.remove(oldIndex);
    if (aGh.indexOfFg(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aGh.removeFg(this);
      if (!wasRemoved)
      {
        gh.add(oldIndex,aGh);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */
  public boolean addGhAt(Ghh aGh, int index)
  {  
    boolean wasAdded = false;
    if(addGh(aGh))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGh()) { index = numberOfGh() - 1; }
      gh.remove(aGh);
      gh.add(index, aGh);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveGhAt(Ghh aGh, int index)
  {
    boolean wasAdded = false;
    if(gh.contains(aGh))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfGh()) { index = numberOfGh() - 1; }
      gh.remove(aGh);
      gh.add(index, aGh);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addGhAt(aGh, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Df> copyOfDf = new ArrayList<Df>(df);
    df.clear();
    for(Df aDf : copyOfDf)
    {
      aDf.removeFg(this);
    }
    ArrayList<Gh> copyOfGh = new ArrayList<Gh>(gh);
    gh.clear();
    for(Gh aGh : copyOfGh)
    {
      aGh.removeFg(this);
    }
  }

}