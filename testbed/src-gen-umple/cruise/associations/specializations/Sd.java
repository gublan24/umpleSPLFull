/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

// line 341 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Sd
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Sd Associations
  private List<Sass> sass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Sd()
  {
    sass = new ArrayList<Sass>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Sass getSass(int index)
  {
    Sass aSass = sass.get(index);
    return aSass;
  }

  public List<Sass> getSass()
  {
    List<Sass> newSass = Collections.unmodifiableList(sass);
    return newSass;
  }

  public int numberOfSass()
  {
    int number = sass.size();
    return number;
  }

  public boolean hasSass()
  {
    boolean has = sass.size() > 0;
    return has;
  }

  public int indexOfSass(Sass aSass)
  {
    int index = sass.indexOf(aSass);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_sass()
  {
    sass.clear();
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public Sassy getSass_OneSassy()
  {
    return (Sassy)sass.get(0);
  } 
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSass()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSass(Sass aSass)
  {
    boolean wasAdded = false;
    if (sass.contains(aSass)) { return false; }
    sass.add(aSass);
    if (aSass.indexOfSd(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSass.addSd(this);
      if (!wasAdded)
      {
        sass.remove(aSass);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSass(Sass aSass)
  {
    boolean wasRemoved = false;
    if (!sass.contains(aSass))
    {
      return wasRemoved;
    }

    int oldIndex = sass.indexOf(aSass);
    sass.remove(oldIndex);
    if (aSass.indexOfSd(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSass.removeSd(this);
      if (!wasRemoved)
      {
        sass.add(oldIndex,aSass);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSassAt(Sass aSass, int index)
  {  
    boolean wasAdded = false;
    if(addSass(aSass))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSass()) { index = numberOfSass() - 1; }
      sass.remove(aSass);
      sass.add(index, aSass);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSassAt(Sass aSass, int index)
  {
    boolean wasAdded = false;
    if(sass.contains(aSass))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSass()) { index = numberOfSass() - 1; }
      sass.remove(aSass);
      sass.add(index, aSass);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSassAt(aSass, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOptionalOneToOptionalN_relatedSpecialization */
  public boolean setSass_Sassy(Sassy aSass)
  {
    boolean wasSet = false;
    if (aSass != null && aSass.numberOfSd() >= Sassy.maximumNumberOfSd_Sd())
    {
      return wasSet;
    }

    Sassy existingSass = getSass_OneSassy();
    sass.clear();
    sass.add(aSass);
    if (existingSass != null && !existingSass.equals(aSass))
    {
      existingSass.removeSd(this);
    }
    if (aSass != null)
    {
      aSass.addSd(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Sass> copyOfSass = new ArrayList<Sass>(sass);
    sass.clear();
    for(Sass aSass : copyOfSass)
    {
      aSass.removeSd(this);
    }
  }

}