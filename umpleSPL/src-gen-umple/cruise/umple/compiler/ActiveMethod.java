/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.Position;
import java.util.*;

// line 130 "../../../../src/Structure.ump"
public class ActiveMethod
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ActiveMethod Attributes
  private String modifier;
  private String name;
  private String type;
  private Position position;
  private Position codePosition;
  private Position endPosition;
  private ActiveDirectionHandler methodBody;
  private ActiveMethod inverseMethodBody;

  //ActiveMethod State Machines
  public enum ActiveType { ASYNCH, SYNCH, ATOMIC, INTERCEPTOR }
  private ActiveType activeType;

  //ActiveMethod Associations
  private List<Monitor> watchList;
  private List<MethodParameter> methodParameters;
  private List<Comment> comments;
  private UmpleClass umpleClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ActiveMethod(String aModifier, String aName, String aType, ActiveDirectionHandler aMethodBody, ActiveMethod aInverseMethodBody)
  {
    modifier = aModifier;
    name = aName;
    type = aType;
    methodBody = aMethodBody;
    inverseMethodBody = aInverseMethodBody;
    watchList = new ArrayList<Monitor>();
    methodParameters = new ArrayList<MethodParameter>();
    comments = new ArrayList<Comment>();
    setActiveType(ActiveType.ASYNCH);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setModifier(String aModifier)
  {
    boolean wasSet = false;
    modifier = aModifier;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setCodePosition(Position aCodePosition)
  {
    boolean wasSet = false;
    codePosition = aCodePosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setEndPosition(Position aEndPosition)
  {
    boolean wasSet = false;
    endPosition = aEndPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setMethodBody(ActiveDirectionHandler aMethodBody)
  {
    boolean wasSet = false;
    methodBody = aMethodBody;
    wasSet = true;
    return wasSet;
  }

  public boolean setInverseMethodBody(ActiveMethod aInverseMethodBody)
  {
    boolean wasSet = false;
    inverseMethodBody = aInverseMethodBody;
    wasSet = true;
    return wasSet;
  }

  public String getModifier()
  {
    return modifier;
  }

  public String getName()
  {
    return name;
  }

  public String getType()
  {
    return type;
  }

  public Position getPosition()
  {
    return position;
  }

  public Position getCodePosition()
  {
    return codePosition;
  }

  public Position getEndPosition()
  {
    return endPosition;
  }

  public ActiveDirectionHandler getMethodBody()
  {
    return methodBody;
  }

  public ActiveMethod getInverseMethodBody()
  {
    return inverseMethodBody;
  }

  public String getActiveTypeFullName()
  {
    String answer = activeType.toString();
    return answer;
  }

  public ActiveType getActiveType()
  {
    return activeType;
  }

  public boolean setActiveType(ActiveType aActiveType)
  {
    activeType = aActiveType;
    return true;
  }
  /* Code from template association_GetMany */
  public Monitor getWatchList(int index)
  {
    Monitor aWatchList = watchList.get(index);
    return aWatchList;
  }

  public List<Monitor> getWatchList()
  {
    List<Monitor> newWatchList = Collections.unmodifiableList(watchList);
    return newWatchList;
  }

  public int numberOfWatchList()
  {
    int number = watchList.size();
    return number;
  }

  public boolean hasWatchList()
  {
    boolean has = watchList.size() > 0;
    return has;
  }

  public int indexOfWatchList(Monitor aWatchList)
  {
    int index = watchList.indexOf(aWatchList);
    return index;
  }
  /* Code from template association_GetMany */
  public MethodParameter getMethodParameter(int index)
  {
    MethodParameter aMethodParameter = methodParameters.get(index);
    return aMethodParameter;
  }

  public List<MethodParameter> getMethodParameters()
  {
    List<MethodParameter> newMethodParameters = Collections.unmodifiableList(methodParameters);
    return newMethodParameters;
  }

  public int numberOfMethodParameters()
  {
    int number = methodParameters.size();
    return number;
  }

  public boolean hasMethodParameters()
  {
    boolean has = methodParameters.size() > 0;
    return has;
  }

  public int indexOfMethodParameter(MethodParameter aMethodParameter)
  {
    int index = methodParameters.indexOf(aMethodParameter);
    return index;
  }
  /* Code from template association_GetMany */
  public Comment getComment(int index)
  {
    Comment aComment = comments.get(index);
    return aComment;
  }

  public List<Comment> getComments()
  {
    List<Comment> newComments = Collections.unmodifiableList(comments);
    return newComments;
  }

  public int numberOfComments()
  {
    int number = comments.size();
    return number;
  }

  public boolean hasComments()
  {
    boolean has = comments.size() > 0;
    return has;
  }

  public int indexOfComment(Comment aComment)
  {
    int index = comments.indexOf(aComment);
    return index;
  }
  /* Code from template association_GetOne */
  public UmpleClass getUmpleClass()
  {
    return umpleClass;
  }

  public boolean hasUmpleClass()
  {
    boolean has = umpleClass != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWatchList()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addWatchList(Monitor aWatchList)
  {
    boolean wasAdded = false;
    if (watchList.contains(aWatchList)) { return false; }
    watchList.add(aWatchList);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeWatchList(Monitor aWatchList)
  {
    boolean wasRemoved = false;
    if (watchList.contains(aWatchList))
    {
      watchList.remove(aWatchList);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addWatchListAt(Monitor aWatchList, int index)
  {  
    boolean wasAdded = false;
    if(addWatchList(aWatchList))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWatchList()) { index = numberOfWatchList() - 1; }
      watchList.remove(aWatchList);
      watchList.add(index, aWatchList);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveWatchListAt(Monitor aWatchList, int index)
  {
    boolean wasAdded = false;
    if(watchList.contains(aWatchList))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWatchList()) { index = numberOfWatchList() - 1; }
      watchList.remove(aWatchList);
      watchList.add(index, aWatchList);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addWatchListAt(aWatchList, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMethodParameters()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addMethodParameter(MethodParameter aMethodParameter)
  {
    boolean wasAdded = false;
    if (methodParameters.contains(aMethodParameter)) { return false; }
    methodParameters.add(aMethodParameter);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMethodParameter(MethodParameter aMethodParameter)
  {
    boolean wasRemoved = false;
    if (methodParameters.contains(aMethodParameter))
    {
      methodParameters.remove(aMethodParameter);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMethodParameterAt(MethodParameter aMethodParameter, int index)
  {  
    boolean wasAdded = false;
    if(addMethodParameter(aMethodParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMethodParameters()) { index = numberOfMethodParameters() - 1; }
      methodParameters.remove(aMethodParameter);
      methodParameters.add(index, aMethodParameter);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMethodParameterAt(MethodParameter aMethodParameter, int index)
  {
    boolean wasAdded = false;
    if(methodParameters.contains(aMethodParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMethodParameters()) { index = numberOfMethodParameters() - 1; }
      methodParameters.remove(aMethodParameter);
      methodParameters.add(index, aMethodParameter);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMethodParameterAt(aMethodParameter, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfComments()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addComment(Comment aComment)
  {
    boolean wasAdded = false;
    if (comments.contains(aComment)) { return false; }
    comments.add(aComment);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeComment(Comment aComment)
  {
    boolean wasRemoved = false;
    if (comments.contains(aComment))
    {
      comments.remove(aComment);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCommentAt(Comment aComment, int index)
  {  
    boolean wasAdded = false;
    if(addComment(aComment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfComments()) { index = numberOfComments() - 1; }
      comments.remove(aComment);
      comments.add(index, aComment);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCommentAt(Comment aComment, int index)
  {
    boolean wasAdded = false;
    if(comments.contains(aComment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfComments()) { index = numberOfComments() - 1; }
      comments.remove(aComment);
      comments.add(index, aComment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCommentAt(aComment, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasSet = false;
    UmpleClass existingUmpleClass = umpleClass;
    umpleClass = aUmpleClass;
    if (existingUmpleClass != null && !existingUmpleClass.equals(aUmpleClass))
    {
      existingUmpleClass.removeActiveMethod(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addActiveMethod(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    watchList.clear();
    methodParameters.clear();
    comments.clear();
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removeActiveMethod(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "modifier" + ":" + getModifier()+ "," +
            "name" + ":" + getName()+ "," +
            "type" + ":" + getType()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "codePosition" + "=" + (getCodePosition() != null ? !getCodePosition().equals(this)  ? getCodePosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endPosition" + "=" + (getEndPosition() != null ? !getEndPosition().equals(this)  ? getEndPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "methodBody" + "=" + (getMethodBody() != null ? !getMethodBody().equals(this)  ? getMethodBody().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "inverseMethodBody" + "=" + (getInverseMethodBody() != null ? !getInverseMethodBody().equals(this)  ? getInverseMethodBody().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleClass = "+(getUmpleClass()!=null?Integer.toHexString(System.identityHashCode(getUmpleClass())):"null");
  }
}