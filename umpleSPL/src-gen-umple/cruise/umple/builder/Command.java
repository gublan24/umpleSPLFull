/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.builder;
import java.util.regex.*;
import java.lang.reflect.*;
import java.util.*;

// line 6 "../../../../src/Builder_Code.ump"
public class Command
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.lineSeparator();

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Command Attributes
  private List<String> history;
  private List<String> messages;
  private List<String> attributes;
  private Object currentObject;
  private ClassLoader loader;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Command(ClassLoader aLoader)
  {
    history = new ArrayList<String>();
    messages = new ArrayList<String>();
    attributes = new ArrayList<String>();
    currentObject = null;
    loader = aLoader;
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addHistory(String aHistory)
  {
    boolean wasAdded = false;
    wasAdded = history.add(aHistory);
    return wasAdded;
  }

  public boolean removeHistory(String aHistory)
  {
    boolean wasRemoved = false;
    wasRemoved = history.remove(aHistory);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addMessage(String aMessage)
  {
    boolean wasAdded = false;
    wasAdded = messages.add(aMessage);
    return wasAdded;
  }

  public boolean removeMessage(String aMessage)
  {
    boolean wasRemoved = false;
    wasRemoved = messages.remove(aMessage);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addAttribute(String aAttribute)
  {
    boolean wasAdded = false;
    wasAdded = attributes.add(aAttribute);
    return wasAdded;
  }

  public boolean removeAttribute(String aAttribute)
  {
    boolean wasRemoved = false;
    wasRemoved = attributes.remove(aAttribute);
    return wasRemoved;
  }

  public boolean setCurrentObject(Object aCurrentObject)
  {
    boolean wasSet = false;
    currentObject = aCurrentObject;
    wasSet = true;
    return wasSet;
  }

  public boolean setLoader(ClassLoader aLoader)
  {
    boolean wasSet = false;
    loader = aLoader;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_GetMany */
  public String getHistory(int index)
  {
    String aHistory = history.get(index);
    return aHistory;
  }

  public String[] getHistory()
  {
    String[] newHistory = history.toArray(new String[history.size()]);
    return newHistory;
  }

  public int numberOfHistory()
  {
    int number = history.size();
    return number;
  }

  public boolean hasHistory()
  {
    boolean has = history.size() > 0;
    return has;
  }

  public int indexOfHistory(String aHistory)
  {
    int index = history.indexOf(aHistory);
    return index;
  }
  /* Code from template attribute_GetMany */
  public String getMessage(int index)
  {
    String aMessage = messages.get(index);
    return aMessage;
  }

  public String[] getMessages()
  {
    String[] newMessages = messages.toArray(new String[messages.size()]);
    return newMessages;
  }

  public int numberOfMessages()
  {
    int number = messages.size();
    return number;
  }

  public boolean hasMessages()
  {
    boolean has = messages.size() > 0;
    return has;
  }

  public int indexOfMessage(String aMessage)
  {
    int index = messages.indexOf(aMessage);
    return index;
  }
  /* Code from template attribute_GetMany */
  public String getAttribute(int index)
  {
    String aAttribute = attributes.get(index);
    return aAttribute;
  }

  public String[] getAttributes()
  {
    String[] newAttributes = attributes.toArray(new String[attributes.size()]);
    return newAttributes;
  }

  public int numberOfAttributes()
  {
    int number = attributes.size();
    return number;
  }

  public boolean hasAttributes()
  {
    boolean has = attributes.size() > 0;
    return has;
  }

  public int indexOfAttribute(String aAttribute)
  {
    int index = attributes.indexOf(aAttribute);
    return index;
  }

  public Object getCurrentObject()
  {
    return currentObject;
  }

  public ClassLoader getLoader()
  {
    return loader;
  }

  public void delete()
  {}

  // line 21 "../../../../src/Builder_Code.ump"
   public void addAttributes(String input){
    if (input == null)
    {
      return;
    }
    boolean isFirst = true;
    for(String d : input.split(","))
    {
      if (isFirst)
      {
        isFirst = false;
        continue;
      }
      addAttribute(d.trim());
    }
  }

  // line 39 "../../../../src/Builder_Code.ump"
   public String[] popMessages(){
    String[] local = getMessages();
    messages = new ArrayList<String>();
    return local;
  }

  // line 46 "../../../../src/Builder_Code.ump"
   public Object exec(String rawInput){
    addHistory(rawInput);
    
    String input = "";
    ArrayList<String> assertions = new ArrayList<String>();
    for(String d : rawInput.split(","))
    {
      if (input.isEmpty())
      {
        input = d;
      }
      else
      {
        assertions.add(d);
      }
    }
    
    Matcher newObjectMatch = Pattern.compile("new ([^\\s]*)").matcher(input);
    Matcher showMatch = Pattern.compile("show ([^\\s]*)").matcher(input);
    Object answer = null;
    if (newObjectMatch.matches())
    {
      answer = newObject(newObjectMatch.group(1));
    }
    else if (showMatch.matches())
    {
      answer = showResults(showMatch.group(1));
    }
    else
    {
      runMethod(input);
    }
    
    for(int i=0; i<attributes.size(); i++)
    {
      if (i == assertions.size())
      {
        break;
      }
      String methodName = attributes.get(i);
      String expectedValue = assertions.get(i);
      assertMethod(methodName,expectedValue);
    }
    return answer;
  }

  // line 93 "../../../../src/Builder_Code.ump"
   public Object newObject(String className){
    currentObject = null;
    try 
    {
      Class<? extends Object> classDefinition = Class.forName(className,true,loader);
      currentObject = classDefinition.newInstance();
    }
    catch (Throwable e) {
    }
    
    if (currentObject != null)
    {
      addMessage("Created " + className);
    }
    else
    {
      addMessage("Unable to create " + className);
    }
    
    return currentObject;
  }

  // line 116 "../../../../src/Builder_Code.ump"
   public void runMethod(String methodName){
    callMethod(methodName,false,true);
  }

  // line 121 "../../../../src/Builder_Code.ump"
   public Object showResults(String methodName){
    return callMethod(methodName,true,false);
  }

  // line 126 "../../../../src/Builder_Code.ump"
   public boolean assertMethod(String methodName, String rawExpectedValue){
    String expectedValue = rawExpectedValue.trim();
    
    if (expectedValue.equals(""))
    {
      return true;
    }
        
    Object result = callMethod(methodName,false,false);
    
    boolean isNull = result == null;
    boolean isNullButEqual = expectedValue.equals("NULL") && isNull;
    boolean isEqual = !isNull && expectedValue.equals(result.toString());
    
    if (isNullButEqual || isEqual)
    {
      showValue(methodName,result);
      return true;
    }
    else
    {
      String actualValue = isNull ? "[NULL]" : result.toString();
      addMessage("!!! ASSERTION FAILED on "+ methodName +", EXPECTED "+ expectedValue +", ACTUAL " + actualValue);
      return false;
    }
  }

  // line 154 "../../../../src/Builder_Code.ump"
   private Object callMethod(String methodName, boolean showValue, boolean showExecuted){
    try 
    {
      Class<? extends Object> c = currentObject.getClass();
      Method m = c.getMethod(methodName);
      Object answer = m.invoke(currentObject);

      if (showExecuted)
      {
        addMessage("Executed #" + methodName);  
      }
      
      if (showValue)
      {
        showValue(methodName,answer);
      }
      return answer;
    }
    catch (Throwable e) {
      addMessage("Unable to execute #" + methodName);  
      return null;
    }
  }

  // line 179 "../../../../src/Builder_Code.ump"
   private void showValue(String methodName, Object answer){
    if (answer == null)
    {
      addMessage(methodName + " = [NULL]");
    }
    else
    {
      addMessage(methodName + " = " + answer.toString());  
    }
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "currentObject" + "=" + (getCurrentObject() != null ? !getCurrentObject().equals(this)  ? getCurrentObject().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "loader" + "=" + (getLoader() != null ? !getLoader().equals(this)  ? getLoader().toString().replaceAll("  ","    ") : "this" : "null");
  }
}