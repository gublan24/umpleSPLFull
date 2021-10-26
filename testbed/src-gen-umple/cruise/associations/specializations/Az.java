/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.associations.specializations;
import java.util.*;

/**
 * Many down to optional                                          [12]
 */
// line 149 "../../../../src/TestHarnessAssociationSpecializations.ump"
// line 407 "../../../../src/TestHarnessAssociationSpecializations.ump"
public class Az
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Az Associations
  private List<Bz> b;
  private List<Qa> qa;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Az()
  {
    b = new ArrayList<Bz>();
    qa = new ArrayList<Qa>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Bz getB(int index)
  {
    Bz aB = b.get(index);
    return aB;
  }

  public List<Bz> getB()
  {
    List<Bz> newB = Collections.unmodifiableList(b);
    return newB;
  }

  public int numberOfB()
  {
    int number = b.size();
    return number;
  }

  public boolean hasB()
  {
    boolean has = b.size() > 0;
    return has;
  }

  public int indexOfB(Bz aB)
  {
    int index = b.indexOf(aB);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_b()
  {
    b.clear();
  }
  /* Code from template association_GetMany */
  public Qa getQa(int index)
  {
    Qa aQa = qa.get(index);
    return aQa;
  }

  public List<Qa> getQa()
  {
    List<Qa> newQa = Collections.unmodifiableList(qa);
    return newQa;
  }

  public int numberOfQa()
  {
    int number = qa.size();
    return number;
  }

  public boolean hasQa()
  {
    boolean has = qa.size() > 0;
    return has;
  }

  public int indexOfQa(Qa aQa)
  {
    int index = qa.indexOf(aQa);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_qa()
  {
    qa.clear();
  }
  /* Code from template association_GetMany_relatedSpecialization */
  public Qaa getQa_Qaa(int index)
  {
    Qaa aQa = (Qaa)qa.get(index);
    return aQa;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<Qaa> getQa_Qaa()
  {
    List<? extends Qa> newQa = Collections.unmodifiableList(qa);
    return (List<Qaa>)newQa;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfB()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addB(Bz aB)
  {
    boolean wasAdded = false;
    if (b.contains(aB)) { return false; }
    b.add(aB);
    if (aB.indexOfA(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aB.addA(this);
      if (!wasAdded)
      {
        b.remove(aB);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeB(Bz aB)
  {
    boolean wasRemoved = false;
    if (!b.contains(aB))
    {
      return wasRemoved;
    }

    int oldIndex = b.indexOf(aB);
    b.remove(oldIndex);
    if (aB.indexOfA(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aB.removeA(this);
      if (!wasRemoved)
      {
        b.add(oldIndex,aB);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addBAt(Bz aB, int index)
  {  
    boolean wasAdded = false;
    if(addB(aB))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfB()) { index = numberOfB() - 1; }
      b.remove(aB);
      b.add(index, aB);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBAt(Bz aB, int index)
  {
    boolean wasAdded = false;
    if(b.contains(aB))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfB()) { index = numberOfB() - 1; }
      b.remove(aB);
      b.add(index, aB);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBAt(aB, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfQa()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addQa(Qa aQa)
  {
    boolean wasAdded = false;
    if (qa.contains(aQa)) { return false; }
    if (qa.contains(aQa)) { return false; }
    qa.add(aQa);
    if (aQa.indexOfAz(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aQa.addAz(this);
      if (!wasAdded)
      {
        qa.remove(aQa);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeQa(Qa aQa)
  {
    boolean wasRemoved = false;
    if (!qa.contains(aQa))
    {
      return wasRemoved;
    }

    int oldIndex = qa.indexOf(aQa);
    qa.remove(oldIndex);
    if (aQa.indexOfAz(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aQa.removeAz(this);
      if (!wasRemoved)
      {
        qa.add(oldIndex,aQa);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addQaAt(Qa aQa, int index)
  {  
    boolean wasAdded = false;
    if(addQa(aQa))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfQa()) { index = numberOfQa() - 1; }
      qa.remove(aQa);
      qa.add(index, aQa);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveQaAt(Qa aQa, int index)
  {
    boolean wasAdded = false;
    if(qa.contains(aQa))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfQa()) { index = numberOfQa() - 1; }
      qa.remove(aQa);
      qa.add(index, aQa);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addQaAt(aQa, index);
    }
    return wasAdded;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */
  public static int minimumNumberOfQa_Qaa()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod_relatedSpecialization */
  public boolean addQa(Qaa aQa)
  {
    boolean wasAdded = false;
    if (qa.contains(aQa)) { return false; }
    if (qa.contains(aQa)) { return false; }
    qa.add(aQa);
    if (aQa.indexOfAz(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aQa.addAz(this);
      if (!wasAdded)
      {
        qa.remove(aQa);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeQa(Qaa aQa)
  {
    boolean wasRemoved = false;
    if (!qa.contains(aQa))
    {
      return wasRemoved;
    }

    int oldIndex = qa.indexOf(aQa);
    qa.remove(oldIndex);
    if (aQa.indexOfAz(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aQa.removeAz(this);
      if (!wasRemoved)
      {
        qa.add(oldIndex,aQa);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */
  public boolean addQaAt(Qaa aQa, int index)
  {  
    boolean wasAdded = false;
    if(addQa(aQa))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfQa()) { index = numberOfQa() - 1; }
      qa.remove(aQa);
      qa.add(index, aQa);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveQaAt(Qaa aQa, int index)
  {
    boolean wasAdded = false;
    if(qa.contains(aQa))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfQa()) { index = numberOfQa() - 1; }
      qa.remove(aQa);
      qa.add(index, aQa);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addQaAt(aQa, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Bz> copyOfB = new ArrayList<Bz>(b);
    b.clear();
    for(Bz aB : copyOfB)
    {
      aB.removeA(this);
    }
    ArrayList<Qa> copyOfQa = new ArrayList<Qa>(qa);
    qa.clear();
    for(Qa aQa : copyOfQa)
    {
      aQa.removeAz(this);
    }
  }

}