/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.Comparator;

// line 234 "../../../../src/UmpleImport.ump"
// line 255 "../../../../src/UmpleImport_CodeModels.ump"
public class StateComparator implements Comparator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateComparator Attributes
  private String initialState;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateComparator(String aInitialState)
  {
    initialState = aInitialState;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setInitialState(String aInitialState)
  {
    boolean wasSet = false;
    initialState = aInitialState;
    wasSet = true;
    return wasSet;
  }

  public String getInitialState()
  {
    return initialState;
  }

  public void delete()
  {}

  // line 258 "../../../../src/UmpleImport_CodeModels.ump"
  public int compare(Object o1, Object o2){
    ImportStateMachineState e1 = (ImportStateMachineState)o1;
    ImportStateMachineState e2 = (ImportStateMachineState)o2;

    if (e1 != null && initialState.equals(e1.getElemName())) {
      return -1;
    } else if (e2 != null && initialState.equals(e2.getElemName())) {
      return 1;
    } else {
      return 0;
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "initialState" + ":" + getInitialState()+ "]";
  }
}