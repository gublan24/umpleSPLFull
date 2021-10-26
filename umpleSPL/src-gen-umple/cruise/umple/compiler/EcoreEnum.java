/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 468 "../../../../src/Generator_CodeEcore_Model.ump"
public class EcoreEnum extends EcoreGenericNode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreEnum Associations
  private List<EcoreEnumItem> items;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreEnum(String aName, int aIntent)
  {
    super(aName, aIntent);
    // line 476 "../../../../src/Generator_CodeEcore_Model.ump"
    setTagName("eClassifiers");
    // END OF UMPLE BEFORE INJECTION
    items = new ArrayList<EcoreEnumItem>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public EcoreEnumItem getItem(int index)
  {
    EcoreEnumItem aItem = items.get(index);
    return aItem;
  }

  public List<EcoreEnumItem> getItems()
  {
    List<EcoreEnumItem> newItems = Collections.unmodifiableList(items);
    return newItems;
  }

  public int numberOfItems()
  {
    int number = items.size();
    return number;
  }

  public boolean hasItems()
  {
    boolean has = items.size() > 0;
    return has;
  }

  public int indexOfItem(EcoreEnumItem aItem)
  {
    int index = items.indexOf(aItem);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfItems()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addItem(EcoreEnumItem aItem)
  {
    boolean wasAdded = false;
    if (items.contains(aItem)) { return false; }
    items.add(aItem);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeItem(EcoreEnumItem aItem)
  {
    boolean wasRemoved = false;
    if (items.contains(aItem))
    {
      items.remove(aItem);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addItemAt(EcoreEnumItem aItem, int index)
  {  
    boolean wasAdded = false;
    if(addItem(aItem))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfItems()) { index = numberOfItems() - 1; }
      items.remove(aItem);
      items.add(index, aItem);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveItemAt(EcoreEnumItem aItem, int index)
  {
    boolean wasAdded = false;
    if(items.contains(aItem))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfItems()) { index = numberOfItems() - 1; }
      items.remove(aItem);
      items.add(index, aItem);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addItemAt(aItem, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    items.clear();
    super.delete();
  }

  // line 488 "../../../../src/Generator_CodeEcore_Model.ump"
  public List<EcoreGenericNode> getNodeChildren(){
    List<EcoreGenericNode> nodes = super.getNodeChildren();
    
    nodes.addAll(getItems());
    
    return nodes;
  }

  // line 496 "../../../../src/Generator_CodeEcore_Model.ump"
  public Integer getNodeChildCount(){
    return numberOfItems();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 479 "../../../../src/Generator_CodeEcore_Model.ump"
  Map<String,String> getNodeAttributes () 
  {
    Map<String,String> map = super.getNodeAttributes();
    map.put("xsi:type", "ecore:EEnum");
    map.put("name", getName());
    
    return map;
  }

  
}