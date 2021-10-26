/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * pririoriy constraint
 */
// line 229 "../../../../src/Structure.ump"
public class MessageStructure
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MessageStructure Associations
  private List<MessageField> params;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MessageStructure()
  {
    params = new ArrayList<MessageField>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public MessageField getParam(int index)
  {
    MessageField aParam = params.get(index);
    return aParam;
  }

  /**
   * priorityType { HIGH{} MEDIUM{} LOW{} NONE{} }
   * int priority;
   */
  public List<MessageField> getParams()
  {
    List<MessageField> newParams = Collections.unmodifiableList(params);
    return newParams;
  }

  public int numberOfParams()
  {
    int number = params.size();
    return number;
  }

  public boolean hasParams()
  {
    boolean has = params.size() > 0;
    return has;
  }

  public int indexOfParam(MessageField aParam)
  {
    int index = params.indexOf(aParam);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfParams()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addParam(MessageField aParam)
  {
    boolean wasAdded = false;
    if (params.contains(aParam)) { return false; }
    params.add(aParam);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeParam(MessageField aParam)
  {
    boolean wasRemoved = false;
    if (params.contains(aParam))
    {
      params.remove(aParam);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addParamAt(MessageField aParam, int index)
  {  
    boolean wasAdded = false;
    if(addParam(aParam))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParams()) { index = numberOfParams() - 1; }
      params.remove(aParam);
      params.add(index, aParam);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveParamAt(MessageField aParam, int index)
  {
    boolean wasAdded = false;
    if(params.contains(aParam))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParams()) { index = numberOfParams() - 1; }
      params.remove(aParam);
      params.add(index, aParam);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addParamAt(aParam, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    params.clear();
  }

}