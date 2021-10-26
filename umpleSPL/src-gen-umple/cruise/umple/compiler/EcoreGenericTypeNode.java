/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 367 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreGenericTypeNode extends EcoreGenericNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreGenericTypeNode Associations
  private List<EcoreGenericTypeArgument> typeArguments;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreGenericTypeNode(String aName, int aIntent)
  {
    super(aName, aIntent);
    typeArguments = new ArrayList<EcoreGenericTypeArgument>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public EcoreGenericTypeArgument getTypeArgument(int index)
  {
    EcoreGenericTypeArgument aTypeArgument = typeArguments.get(index);
    return aTypeArgument;
  }

  public List<EcoreGenericTypeArgument> getTypeArguments()
  {
    List<EcoreGenericTypeArgument> newTypeArguments = Collections.unmodifiableList(typeArguments);
    return newTypeArguments;
  }

  public int numberOfTypeArguments()
  {
    int number = typeArguments.size();
    return number;
  }

  public boolean hasTypeArguments()
  {
    boolean has = typeArguments.size() > 0;
    return has;
  }

  public int indexOfTypeArgument(EcoreGenericTypeArgument aTypeArgument)
  {
    int index = typeArguments.indexOf(aTypeArgument);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTypeArguments()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addTypeArgument(EcoreGenericTypeArgument aTypeArgument)
  {
    boolean wasAdded = false;
    if (typeArguments.contains(aTypeArgument)) { return false; }
    typeArguments.add(aTypeArgument);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTypeArgument(EcoreGenericTypeArgument aTypeArgument)
  {
    boolean wasRemoved = false;
    if (typeArguments.contains(aTypeArgument))
    {
      typeArguments.remove(aTypeArgument);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTypeArgumentAt(EcoreGenericTypeArgument aTypeArgument, int index)
  {  
    boolean wasAdded = false;
    if(addTypeArgument(aTypeArgument))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTypeArguments()) { index = numberOfTypeArguments() - 1; }
      typeArguments.remove(aTypeArgument);
      typeArguments.add(index, aTypeArgument);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTypeArgumentAt(EcoreGenericTypeArgument aTypeArgument, int index)
  {
    boolean wasAdded = false;
    if(typeArguments.contains(aTypeArgument))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTypeArguments()) { index = numberOfTypeArguments() - 1; }
      typeArguments.remove(aTypeArgument);
      typeArguments.add(index, aTypeArgument);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTypeArgumentAt(aTypeArgument, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    typeArguments.clear();
    super.delete();
  }

}