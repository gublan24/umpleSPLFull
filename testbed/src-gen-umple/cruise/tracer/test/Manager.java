/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import java.util.*;

// line 46 "../../../../src/TestHarnessTracerAssociations.ump"
public class Manager
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Manager Associations
  private List<CompanyBiManyToManyRole> companyBiManyToManyRoles;
  private List<CompanyBiManyToManyAdd> companyBiManyToManyAdds;
  private List<CompanyBiManyToManyRemove> companyBiManyToManyRemoves;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Manager()
  {
    companyBiManyToManyRoles = new ArrayList<CompanyBiManyToManyRole>();
    companyBiManyToManyAdds = new ArrayList<CompanyBiManyToManyAdd>();
    companyBiManyToManyRemoves = new ArrayList<CompanyBiManyToManyRemove>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public CompanyBiManyToManyRole getCompanyBiManyToManyRole(int index)
  {
    CompanyBiManyToManyRole aCompanyBiManyToManyRole = companyBiManyToManyRoles.get(index);
    return aCompanyBiManyToManyRole;
  }

  public List<CompanyBiManyToManyRole> getCompanyBiManyToManyRoles()
  {
    List<CompanyBiManyToManyRole> newCompanyBiManyToManyRoles = Collections.unmodifiableList(companyBiManyToManyRoles);
    return newCompanyBiManyToManyRoles;
  }

  public int numberOfCompanyBiManyToManyRoles()
  {
    int number = companyBiManyToManyRoles.size();
    return number;
  }

  public boolean hasCompanyBiManyToManyRoles()
  {
    boolean has = companyBiManyToManyRoles.size() > 0;
    return has;
  }

  public int indexOfCompanyBiManyToManyRole(CompanyBiManyToManyRole aCompanyBiManyToManyRole)
  {
    int index = companyBiManyToManyRoles.indexOf(aCompanyBiManyToManyRole);
    return index;
  }
  /* Code from template association_GetMany */
  public CompanyBiManyToManyAdd getCompanyBiManyToManyAdd(int index)
  {
    CompanyBiManyToManyAdd aCompanyBiManyToManyAdd = companyBiManyToManyAdds.get(index);
    return aCompanyBiManyToManyAdd;
  }

  public List<CompanyBiManyToManyAdd> getCompanyBiManyToManyAdds()
  {
    List<CompanyBiManyToManyAdd> newCompanyBiManyToManyAdds = Collections.unmodifiableList(companyBiManyToManyAdds);
    return newCompanyBiManyToManyAdds;
  }

  public int numberOfCompanyBiManyToManyAdds()
  {
    int number = companyBiManyToManyAdds.size();
    return number;
  }

  public boolean hasCompanyBiManyToManyAdds()
  {
    boolean has = companyBiManyToManyAdds.size() > 0;
    return has;
  }

  public int indexOfCompanyBiManyToManyAdd(CompanyBiManyToManyAdd aCompanyBiManyToManyAdd)
  {
    int index = companyBiManyToManyAdds.indexOf(aCompanyBiManyToManyAdd);
    return index;
  }
  /* Code from template association_GetMany */
  public CompanyBiManyToManyRemove getCompanyBiManyToManyRemove(int index)
  {
    CompanyBiManyToManyRemove aCompanyBiManyToManyRemove = companyBiManyToManyRemoves.get(index);
    return aCompanyBiManyToManyRemove;
  }

  public List<CompanyBiManyToManyRemove> getCompanyBiManyToManyRemoves()
  {
    List<CompanyBiManyToManyRemove> newCompanyBiManyToManyRemoves = Collections.unmodifiableList(companyBiManyToManyRemoves);
    return newCompanyBiManyToManyRemoves;
  }

  public int numberOfCompanyBiManyToManyRemoves()
  {
    int number = companyBiManyToManyRemoves.size();
    return number;
  }

  public boolean hasCompanyBiManyToManyRemoves()
  {
    boolean has = companyBiManyToManyRemoves.size() > 0;
    return has;
  }

  public int indexOfCompanyBiManyToManyRemove(CompanyBiManyToManyRemove aCompanyBiManyToManyRemove)
  {
    int index = companyBiManyToManyRemoves.indexOf(aCompanyBiManyToManyRemove);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCompanyBiManyToManyRoles()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addCompanyBiManyToManyRole(CompanyBiManyToManyRole aCompanyBiManyToManyRole)
  {
    boolean wasAdded = false;
    if (companyBiManyToManyRoles.contains(aCompanyBiManyToManyRole)) { return false; }
    companyBiManyToManyRoles.add(aCompanyBiManyToManyRole);
    if (aCompanyBiManyToManyRole.indexOfManagerA(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCompanyBiManyToManyRole.addManagerA(this);
      if (!wasAdded)
      {
        companyBiManyToManyRoles.remove(aCompanyBiManyToManyRole);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeCompanyBiManyToManyRole(CompanyBiManyToManyRole aCompanyBiManyToManyRole)
  {
    boolean wasRemoved = false;
    if (!companyBiManyToManyRoles.contains(aCompanyBiManyToManyRole))
    {
      return wasRemoved;
    }

    int oldIndex = companyBiManyToManyRoles.indexOf(aCompanyBiManyToManyRole);
    companyBiManyToManyRoles.remove(oldIndex);
    if (aCompanyBiManyToManyRole.indexOfManagerA(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCompanyBiManyToManyRole.removeManagerA(this);
      if (!wasRemoved)
      {
        companyBiManyToManyRoles.add(oldIndex,aCompanyBiManyToManyRole);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCompanyBiManyToManyRoleAt(CompanyBiManyToManyRole aCompanyBiManyToManyRole, int index)
  {  
    boolean wasAdded = false;
    if(addCompanyBiManyToManyRole(aCompanyBiManyToManyRole))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCompanyBiManyToManyRoles()) { index = numberOfCompanyBiManyToManyRoles() - 1; }
      companyBiManyToManyRoles.remove(aCompanyBiManyToManyRole);
      companyBiManyToManyRoles.add(index, aCompanyBiManyToManyRole);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCompanyBiManyToManyRoleAt(CompanyBiManyToManyRole aCompanyBiManyToManyRole, int index)
  {
    boolean wasAdded = false;
    if(companyBiManyToManyRoles.contains(aCompanyBiManyToManyRole))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCompanyBiManyToManyRoles()) { index = numberOfCompanyBiManyToManyRoles() - 1; }
      companyBiManyToManyRoles.remove(aCompanyBiManyToManyRole);
      companyBiManyToManyRoles.add(index, aCompanyBiManyToManyRole);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCompanyBiManyToManyRoleAt(aCompanyBiManyToManyRole, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCompanyBiManyToManyAdds()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addCompanyBiManyToManyAdd(CompanyBiManyToManyAdd aCompanyBiManyToManyAdd)
  {
    boolean wasAdded = false;
    if (companyBiManyToManyAdds.contains(aCompanyBiManyToManyAdd)) { return false; }
    companyBiManyToManyAdds.add(aCompanyBiManyToManyAdd);
    if (aCompanyBiManyToManyAdd.indexOfManagerB(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCompanyBiManyToManyAdd.addManagerB(this);
      if (!wasAdded)
      {
        companyBiManyToManyAdds.remove(aCompanyBiManyToManyAdd);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeCompanyBiManyToManyAdd(CompanyBiManyToManyAdd aCompanyBiManyToManyAdd)
  {
    boolean wasRemoved = false;
    if (!companyBiManyToManyAdds.contains(aCompanyBiManyToManyAdd))
    {
      return wasRemoved;
    }

    int oldIndex = companyBiManyToManyAdds.indexOf(aCompanyBiManyToManyAdd);
    companyBiManyToManyAdds.remove(oldIndex);
    if (aCompanyBiManyToManyAdd.indexOfManagerB(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCompanyBiManyToManyAdd.removeManagerB(this);
      if (!wasRemoved)
      {
        companyBiManyToManyAdds.add(oldIndex,aCompanyBiManyToManyAdd);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCompanyBiManyToManyAddAt(CompanyBiManyToManyAdd aCompanyBiManyToManyAdd, int index)
  {  
    boolean wasAdded = false;
    if(addCompanyBiManyToManyAdd(aCompanyBiManyToManyAdd))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCompanyBiManyToManyAdds()) { index = numberOfCompanyBiManyToManyAdds() - 1; }
      companyBiManyToManyAdds.remove(aCompanyBiManyToManyAdd);
      companyBiManyToManyAdds.add(index, aCompanyBiManyToManyAdd);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCompanyBiManyToManyAddAt(CompanyBiManyToManyAdd aCompanyBiManyToManyAdd, int index)
  {
    boolean wasAdded = false;
    if(companyBiManyToManyAdds.contains(aCompanyBiManyToManyAdd))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCompanyBiManyToManyAdds()) { index = numberOfCompanyBiManyToManyAdds() - 1; }
      companyBiManyToManyAdds.remove(aCompanyBiManyToManyAdd);
      companyBiManyToManyAdds.add(index, aCompanyBiManyToManyAdd);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCompanyBiManyToManyAddAt(aCompanyBiManyToManyAdd, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCompanyBiManyToManyRemoves()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addCompanyBiManyToManyRemove(CompanyBiManyToManyRemove aCompanyBiManyToManyRemove)
  {
    boolean wasAdded = false;
    if (companyBiManyToManyRemoves.contains(aCompanyBiManyToManyRemove)) { return false; }
    companyBiManyToManyRemoves.add(aCompanyBiManyToManyRemove);
    if (aCompanyBiManyToManyRemove.indexOfManagerC(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCompanyBiManyToManyRemove.addManagerC(this);
      if (!wasAdded)
      {
        companyBiManyToManyRemoves.remove(aCompanyBiManyToManyRemove);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeCompanyBiManyToManyRemove(CompanyBiManyToManyRemove aCompanyBiManyToManyRemove)
  {
    boolean wasRemoved = false;
    if (!companyBiManyToManyRemoves.contains(aCompanyBiManyToManyRemove))
    {
      return wasRemoved;
    }

    int oldIndex = companyBiManyToManyRemoves.indexOf(aCompanyBiManyToManyRemove);
    companyBiManyToManyRemoves.remove(oldIndex);
    if (aCompanyBiManyToManyRemove.indexOfManagerC(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCompanyBiManyToManyRemove.removeManagerC(this);
      if (!wasRemoved)
      {
        companyBiManyToManyRemoves.add(oldIndex,aCompanyBiManyToManyRemove);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCompanyBiManyToManyRemoveAt(CompanyBiManyToManyRemove aCompanyBiManyToManyRemove, int index)
  {  
    boolean wasAdded = false;
    if(addCompanyBiManyToManyRemove(aCompanyBiManyToManyRemove))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCompanyBiManyToManyRemoves()) { index = numberOfCompanyBiManyToManyRemoves() - 1; }
      companyBiManyToManyRemoves.remove(aCompanyBiManyToManyRemove);
      companyBiManyToManyRemoves.add(index, aCompanyBiManyToManyRemove);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCompanyBiManyToManyRemoveAt(CompanyBiManyToManyRemove aCompanyBiManyToManyRemove, int index)
  {
    boolean wasAdded = false;
    if(companyBiManyToManyRemoves.contains(aCompanyBiManyToManyRemove))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCompanyBiManyToManyRemoves()) { index = numberOfCompanyBiManyToManyRemoves() - 1; }
      companyBiManyToManyRemoves.remove(aCompanyBiManyToManyRemove);
      companyBiManyToManyRemoves.add(index, aCompanyBiManyToManyRemove);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCompanyBiManyToManyRemoveAt(aCompanyBiManyToManyRemove, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<CompanyBiManyToManyRole> copyOfCompanyBiManyToManyRoles = new ArrayList<CompanyBiManyToManyRole>(companyBiManyToManyRoles);
    companyBiManyToManyRoles.clear();
    for(CompanyBiManyToManyRole aCompanyBiManyToManyRole : copyOfCompanyBiManyToManyRoles)
    {
      aCompanyBiManyToManyRole.removeManagerA(this);
    }
    ArrayList<CompanyBiManyToManyAdd> copyOfCompanyBiManyToManyAdds = new ArrayList<CompanyBiManyToManyAdd>(companyBiManyToManyAdds);
    companyBiManyToManyAdds.clear();
    for(CompanyBiManyToManyAdd aCompanyBiManyToManyAdd : copyOfCompanyBiManyToManyAdds)
    {
      aCompanyBiManyToManyAdd.removeManagerB(this);
    }
    ArrayList<CompanyBiManyToManyRemove> copyOfCompanyBiManyToManyRemoves = new ArrayList<CompanyBiManyToManyRemove>(companyBiManyToManyRemoves);
    companyBiManyToManyRemoves.clear();
    for(CompanyBiManyToManyRemove aCompanyBiManyToManyRemove : copyOfCompanyBiManyToManyRemoves)
    {
      aCompanyBiManyToManyRemove.removeManagerC(this);
    }
  }

}