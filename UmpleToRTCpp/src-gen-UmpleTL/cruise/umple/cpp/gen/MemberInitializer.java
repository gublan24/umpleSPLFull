/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import java.util.*;
import java.io.Serializable;

// line 1393 "../../../../../UmpleTLTemplates/Core.ump"
public class MemberInitializer implements java.io.Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MemberInitializer Attributes
  private String member;
  private int priority;

  //MemberInitializer Associations
  private List<GenFieldInitializer> initializers;
  private GenClass genClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MemberInitializer(String aMember)
  {
    member = aMember;
    priority = 0;
    initializers = new ArrayList<GenFieldInitializer>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMember(String aMember)
  {
    boolean wasSet = false;
    member = aMember;
    wasSet = true;
    return wasSet;
  }

  public boolean setPriority(int aPriority)
  {
    boolean wasSet = false;
    priority = aPriority;
    wasSet = true;
    return wasSet;
  }

  public String getMember()
  {
    return member;
  }

  public int getPriority()
  {
    return priority;
  }
  /* Code from template association_GetMany */
  public GenFieldInitializer getInitializer(int index)
  {
    GenFieldInitializer aInitializer = initializers.get(index);
    return aInitializer;
  }

  public List<GenFieldInitializer> getInitializers()
  {
    List<GenFieldInitializer> newInitializers = Collections.unmodifiableList(initializers);
    return newInitializers;
  }

  public int numberOfInitializers()
  {
    int number = initializers.size();
    return number;
  }

  public boolean hasInitializers()
  {
    boolean has = initializers.size() > 0;
    return has;
  }

  public int indexOfInitializer(GenFieldInitializer aInitializer)
  {
    int index = initializers.indexOf(aInitializer);
    return index;
  }
  /* Code from template association_GetOne */
  public GenClass getGenClass()
  {
    return genClass;
  }

  public boolean hasGenClass()
  {
    boolean has = genClass != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfInitializers()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addInitializer(GenFieldInitializer aInitializer)
  {
    boolean wasAdded = false;
    if (initializers.contains(aInitializer)) { return false; }
    MemberInitializer existingMemberInitializer = aInitializer.getMemberInitializer();
    if (existingMemberInitializer == null)
    {
      aInitializer.setMemberInitializer(this);
    }
    else if (!this.equals(existingMemberInitializer))
    {
      existingMemberInitializer.removeInitializer(aInitializer);
      addInitializer(aInitializer);
    }
    else
    {
      initializers.add(aInitializer);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeInitializer(GenFieldInitializer aInitializer)
  {
    boolean wasRemoved = false;
    if (initializers.contains(aInitializer))
    {
      initializers.remove(aInitializer);
      aInitializer.setMemberInitializer(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addInitializerAt(GenFieldInitializer aInitializer, int index)
  {  
    boolean wasAdded = false;
    if(addInitializer(aInitializer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInitializers()) { index = numberOfInitializers() - 1; }
      initializers.remove(aInitializer);
      initializers.add(index, aInitializer);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveInitializerAt(GenFieldInitializer aInitializer, int index)
  {
    boolean wasAdded = false;
    if(initializers.contains(aInitializer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInitializers()) { index = numberOfInitializers() - 1; }
      initializers.remove(aInitializer);
      initializers.add(index, aInitializer);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addInitializerAt(aInitializer, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenClass(GenClass aGenClass)
  {
    boolean wasSet = false;
    GenClass existingGenClass = genClass;
    genClass = aGenClass;
    if (existingGenClass != null && !existingGenClass.equals(aGenClass))
    {
      existingGenClass.removeMemberInitializer(this);
    }
    if (aGenClass != null)
    {
      aGenClass.addMemberInitializer(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while( !initializers.isEmpty() )
    {
      initializers.get(0).setMemberInitializer(null);
    }
    if (genClass != null)
    {
      GenClass placeholderGenClass = genClass;
      this.genClass = null;
      placeholderGenClass.removeMemberInitializer(this);
    }
  }

  // line 1400 "../../../../../UmpleTLTemplates/Core.ump"
  public String declaration(GenMethod method){
    return getMember()+ "("+ getInitializers().stream().map(GenFieldInitializer::getValue).collect(Collectors.joining(", "))+ ")";
  }


  public String toString()
  {
    return super.toString() + "["+
            "member" + ":" + getMember()+ "," +
            "priority" + ":" + getPriority()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "genClass = "+(getGenClass()!=null?Integer.toHexString(System.identityHashCode(getGenClass())):"null");
  }
}