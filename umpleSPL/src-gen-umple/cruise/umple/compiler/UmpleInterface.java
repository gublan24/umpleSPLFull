/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Represents a interface.
 * Like a class, but can't have any concrete methods, attributes or associations.
 */
// line 621 "../../../../src/Umple.ump"
public class UmpleInterface extends UmpleClassifier
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleInterface Associations
  private List<UmpleInterface> extendsInterface;
  private List<Comment> comments;
  private List<UmpleTestCase> umpleTestCases;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleInterface(String aName, UmpleModel aSourceModel)
  {
    super(aName, aSourceModel);
    extendsInterface = new ArrayList<UmpleInterface>();
    comments = new ArrayList<Comment>();
    umpleTestCases = new ArrayList<UmpleTestCase>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public UmpleInterface getExtendsInterface(int index)
  {
    UmpleInterface aExtendsInterface = extendsInterface.get(index);
    return aExtendsInterface;
  }

  public List<UmpleInterface> getExtendsInterface()
  {
    List<UmpleInterface> newExtendsInterface = Collections.unmodifiableList(extendsInterface);
    return newExtendsInterface;
  }

  public int numberOfExtendsInterface()
  {
    int number = extendsInterface.size();
    return number;
  }

  public boolean hasExtendsInterface()
  {
    boolean has = extendsInterface.size() > 0;
    return has;
  }

  public int indexOfExtendsInterface(UmpleInterface aExtendsInterface)
  {
    int index = extendsInterface.indexOf(aExtendsInterface);
    return index;
  }
  /* Code from template association_GetMany */
  public Comment getComment(int index)
  {
    Comment aComment = comments.get(index);
    return aComment;
  }

  /**
   * The comments associated with the Umple Interface (such as the Javadoc above it).
   */
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
  /* Code from template association_GetMany */
  public UmpleTestCase getUmpleTestCase(int index)
  {
    UmpleTestCase aUmpleTestCase = umpleTestCases.get(index);
    return aUmpleTestCase;
  }

  public List<UmpleTestCase> getUmpleTestCases()
  {
    List<UmpleTestCase> newUmpleTestCases = Collections.unmodifiableList(umpleTestCases);
    return newUmpleTestCases;
  }

  public int numberOfUmpleTestCases()
  {
    int number = umpleTestCases.size();
    return number;
  }

  public boolean hasUmpleTestCases()
  {
    boolean has = umpleTestCases.size() > 0;
    return has;
  }

  public int indexOfUmpleTestCase(UmpleTestCase aUmpleTestCase)
  {
    int index = umpleTestCases.indexOf(aUmpleTestCase);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfExtendsInterface()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addExtendsInterface(UmpleInterface aExtendsInterface)
  {
    boolean wasAdded = false;
    if (extendsInterface.contains(aExtendsInterface)) { return false; }
    extendsInterface.add(aExtendsInterface);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeExtendsInterface(UmpleInterface aExtendsInterface)
  {
    boolean wasRemoved = false;
    if (extendsInterface.contains(aExtendsInterface))
    {
      extendsInterface.remove(aExtendsInterface);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addExtendsInterfaceAt(UmpleInterface aExtendsInterface, int index)
  {  
    boolean wasAdded = false;
    if(addExtendsInterface(aExtendsInterface))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExtendsInterface()) { index = numberOfExtendsInterface() - 1; }
      extendsInterface.remove(aExtendsInterface);
      extendsInterface.add(index, aExtendsInterface);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveExtendsInterfaceAt(UmpleInterface aExtendsInterface, int index)
  {
    boolean wasAdded = false;
    if(extendsInterface.contains(aExtendsInterface))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExtendsInterface()) { index = numberOfExtendsInterface() - 1; }
      extendsInterface.remove(aExtendsInterface);
      extendsInterface.add(index, aExtendsInterface);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addExtendsInterfaceAt(aExtendsInterface, index);
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmpleTestCases()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addUmpleTestCase(UmpleTestCase aUmpleTestCase)
  {
    boolean wasAdded = false;
    if (umpleTestCases.contains(aUmpleTestCase)) { return false; }
    UmpleInterface existingUmpleInterface = aUmpleTestCase.getUmpleInterface();
    if (existingUmpleInterface == null)
    {
      aUmpleTestCase.setUmpleInterface(this);
    }
    else if (!this.equals(existingUmpleInterface))
    {
      existingUmpleInterface.removeUmpleTestCase(aUmpleTestCase);
      addUmpleTestCase(aUmpleTestCase);
    }
    else
    {
      umpleTestCases.add(aUmpleTestCase);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUmpleTestCase(UmpleTestCase aUmpleTestCase)
  {
    boolean wasRemoved = false;
    if (umpleTestCases.contains(aUmpleTestCase))
    {
      umpleTestCases.remove(aUmpleTestCase);
      aUmpleTestCase.setUmpleInterface(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmpleTestCaseAt(UmpleTestCase aUmpleTestCase, int index)
  {  
    boolean wasAdded = false;
    if(addUmpleTestCase(aUmpleTestCase))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleTestCases()) { index = numberOfUmpleTestCases() - 1; }
      umpleTestCases.remove(aUmpleTestCase);
      umpleTestCases.add(index, aUmpleTestCase);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmpleTestCaseAt(UmpleTestCase aUmpleTestCase, int index)
  {
    boolean wasAdded = false;
    if(umpleTestCases.contains(aUmpleTestCase))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmpleTestCases()) { index = numberOfUmpleTestCases() - 1; }
      umpleTestCases.remove(aUmpleTestCase);
      umpleTestCases.add(index, aUmpleTestCase);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmpleTestCaseAt(aUmpleTestCase, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    extendsInterface.clear();
    comments.clear();
    while( !umpleTestCases.isEmpty() )
    {
      umpleTestCases.get(0).setUmpleInterface(null);
    }
    super.delete();
  }

  // line 634 "../../../../src/Umple.ump"
  public boolean isUmpleInterface(){
    return true;
  }

}