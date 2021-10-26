/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * 
 * A key in a class is a set of attributes associations used to uniquely identify an object
 * 
 */
// line 572 "../../../../src/Umple.ump"
// line 331 "../../../../src/Umple_Code.ump"
public class Key
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Key Attributes
  private boolean isDefault;
  private boolean isInternal;
  private List<String> members;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Key()
  {
    isDefault = false;
    isInternal = false;
    members = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsDefault(boolean aIsDefault)
  {
    boolean wasSet = false;
    isDefault = aIsDefault;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInternal(boolean aIsInternal)
  {
    boolean wasSet = false;
    isInternal = aIsInternal;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addMember(String aMember)
  {
    boolean wasAdded = false;
    wasAdded = members.add(aMember);
    return wasAdded;
  }

  public boolean removeMember(String aMember)
  {
    boolean wasRemoved = false;
    wasRemoved = members.remove(aMember);
    return wasRemoved;
  }

  public boolean getIsDefault()
  {
    return isDefault;
  }

  public boolean getIsInternal()
  {
    return isInternal;
  }
  /* Code from template attribute_GetMany */
  public String getMember(int index)
  {
    String aMember = members.get(index);
    return aMember;
  }

  public String[] getMembers()
  {
    String[] newMembers = members.toArray(new String[members.size()]);
    return newMembers;
  }

  public int numberOfMembers()
  {
    int number = members.size();
    return number;
  }

  public boolean hasMembers()
  {
    boolean has = members.size() > 0;
    return has;
  }

  public int indexOfMember(String aMember)
  {
    int index = members.indexOf(aMember);
    return index;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsDefault()
  {
    return isDefault;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInternal()
  {
    return isInternal;
  }

  public void delete()
  {}

  // line 335 "../../../../src/Umple_Code.ump"
   public boolean isProvided(){
    return isDefault || members.size() > 0;
  }

  // line 340 "../../../../src/Umple_Code.ump"
   public boolean isMember(String name){
    return (name == null) ? false : indexOfMember(name) != -1;
  }

  // line 345 "../../../../src/Umple_Code.ump"
   public boolean isMember(UmpleVariable av){
    return (av == null) ? false : isMember(av.getName());
  }


  public String toString()
  {
    return super.toString() + "["+
            "isDefault" + ":" + getIsDefault()+ "," +
            "isInternal" + ":" + getIsInternal()+ "]";
  }
}