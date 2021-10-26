/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.compiler.*;
import cruise.umple.parser.Position;
import java.util.*;

/**
 * Fragment source file: Umple_CodeConstraint.ump
 * Line : 823
 */
// line 776 "../../../../src/Umple_CodeConstraint.ump"
// line 420 "../../../../src/Association_refactored.ump"
public class ModelConstraint
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final ModelConstraintResult SUCCESS = new ModelConstraintResult(null,-1,null,null);
  public static final ModelConstraintResult AND = new ModelConstraintResult(null,-1,null,null);
  public static final ModelConstraintResult OR = new ModelConstraintResult(null,-1,null,null);

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ModelConstraint Attributes
  private Position position;
  private String source;
  private String target;
  private String linkNext;
  private String link;

  //ModelConstraint Associations
  private List<ModelConstraint> modelConstraints;
  private ModelConstraint parentConstraint;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModelConstraint(Position aPosition)
  {
    position = aPosition;
    source = "this";
    target = null;
    linkNext = "";
    link = null;
    modelConstraints = new ArrayList<ModelConstraint>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPosition(Position aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public boolean setSource(String aSource)
  {
    boolean wasSet = false;
    source = aSource;
    wasSet = true;
    return wasSet;
  }

  public boolean setTarget(String aTarget)
  {
    boolean wasSet = false;
    target = aTarget;
    wasSet = true;
    return wasSet;
  }

  public boolean setLinkNext(String aLinkNext)
  {
    boolean wasSet = false;
    linkNext = aLinkNext;
    wasSet = true;
    return wasSet;
  }

  public boolean setLink(String aLink)
  {
    boolean wasSet = false;
    link = aLink;
    wasSet = true;
    return wasSet;
  }

  public Position getPosition()
  {
    return position;
  }

  public String getSource()
  {
    return source;
  }

  public String getTarget()
  {
    return target;
  }

  public String getLinkNext()
  {
    return linkNext;
  }

  public String getLink()
  {
    return link;
  }

  public ModelConstraint getMostRecent()
  {
    return getModelConstraint(numberOfModelConstraints()-1);
  }
  /* Code from template association_GetMany */
  public ModelConstraint getModelConstraint(int index)
  {
    ModelConstraint aModelConstraint = modelConstraints.get(index);
    return aModelConstraint;
  }

  public List<ModelConstraint> getModelConstraints()
  {
    List<ModelConstraint> newModelConstraints = Collections.unmodifiableList(modelConstraints);
    return newModelConstraints;
  }

  public int numberOfModelConstraints()
  {
    int number = modelConstraints.size();
    return number;
  }

  public boolean hasModelConstraints()
  {
    boolean has = modelConstraints.size() > 0;
    return has;
  }

  public int indexOfModelConstraint(ModelConstraint aModelConstraint)
  {
    int index = modelConstraints.indexOf(aModelConstraint);
    return index;
  }
  /* Code from template association_GetOne */
  public ModelConstraint getParentConstraint()
  {
    return parentConstraint;
  }

  public boolean hasParentConstraint()
  {
    boolean has = parentConstraint != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfModelConstraints()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addModelConstraint(ModelConstraint aModelConstraint)
  {
    boolean wasAdded = false;
    // line 793 "../../../../src/Umple_CodeConstraint.ump"
    if(numberOfModelConstraints()>0)getMostRecent().setLink(getLinkNext());
    // END OF UMPLE BEFORE INJECTION
    if (modelConstraints.contains(aModelConstraint)) { return false; }
    ModelConstraint existingParentConstraint = aModelConstraint.getParentConstraint();
    if (existingParentConstraint == null)
    {
      aModelConstraint.setParentConstraint(this);
    }
    else if (!this.equals(existingParentConstraint))
    {
      existingParentConstraint.removeModelConstraint(aModelConstraint);
      addModelConstraint(aModelConstraint);
    }
    else
    {
      modelConstraints.add(aModelConstraint);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeModelConstraint(ModelConstraint aModelConstraint)
  {
    boolean wasRemoved = false;
    if (modelConstraints.contains(aModelConstraint))
    {
      modelConstraints.remove(aModelConstraint);
      aModelConstraint.setParentConstraint(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addModelConstraintAt(ModelConstraint aModelConstraint, int index)
  {  
    boolean wasAdded = false;
    if(addModelConstraint(aModelConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfModelConstraints()) { index = numberOfModelConstraints() - 1; }
      modelConstraints.remove(aModelConstraint);
      modelConstraints.add(index, aModelConstraint);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveModelConstraintAt(ModelConstraint aModelConstraint, int index)
  {
    boolean wasAdded = false;
    if(modelConstraints.contains(aModelConstraint))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfModelConstraints()) { index = numberOfModelConstraints() - 1; }
      modelConstraints.remove(aModelConstraint);
      modelConstraints.add(index, aModelConstraint);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addModelConstraintAt(aModelConstraint, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setParentConstraint(ModelConstraint aParentConstraint)
  {
    boolean wasSet = false;
    ModelConstraint existingParentConstraint = parentConstraint;
    parentConstraint = aParentConstraint;
    if (existingParentConstraint != null && !existingParentConstraint.equals(aParentConstraint))
    {
      existingParentConstraint.removeModelConstraint(this);
    }
    if (aParentConstraint != null)
    {
      aParentConstraint.addModelConstraint(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while( !modelConstraints.isEmpty() )
    {
      modelConstraints.get(0).setParentConstraint(null);
    }
    if (parentConstraint != null)
    {
      ModelConstraint placeholderParentConstraint = parentConstraint;
      this.parentConstraint = null;
      placeholderParentConstraint.removeModelConstraint(this);
    }
  }

  // line 798 "../../../../src/Umple_CodeConstraint.ump"
   public ModelConstraintResult evaluate(UmpleClassifier uClassifier){
    List<ModelConstraintResult> results = new ArrayList<ModelConstraintResult>();
    for(ModelConstraint modelConstraint:getModelConstraints())
    {
      results.add(modelConstraint.evaluate(uClassifier));
      if(!"".equals(modelConstraint.getLink()))
      {
        results.add("and".equals(modelConstraint.getLink())?ModelConstraint.AND:"or".equals(modelConstraint.getLink())?ModelConstraint.OR:null);
      }
    }
    for(int i=1;i<results.size();)
    {
      if(results.get(i)==ModelConstraint.AND)
      {
        if(!results.get(i-1).equals(ModelConstraint.SUCCESS))
        {
          return results.get(i-1);
        }
        if(!results.get(i+1).equals(ModelConstraint.SUCCESS))
        {
          return results.get(i+1);
        }
        results.remove(i);
        results.remove(i);
      }
      else
      {
        i+=2;
      }
    }
    for(ModelConstraintResult i:results)
    {
      if(i==ModelConstraint.SUCCESS){
        return ModelConstraint.SUCCESS;
      }
    }
    return results.size()>0?results.get(0):ModelConstraint.SUCCESS;
  }

  // line 422 "../../../../src/Association_refactored.ump"
   public void addAssociationEnd(Multiplicity multiplicity){
    if(getModelConstraint(numberOfModelConstraints()-1) instanceof ModelConstraintAssociation)
      {
        getModelConstraint(numberOfModelConstraints()-1).addAssociationEnd(multiplicity);
      }
  }

  // line 429 "../../../../src/Association_refactored.ump"
   public void setAssociationType(String type){
    if(getModelConstraint(numberOfModelConstraints()-1) instanceof ModelConstraintAssociation)
      {
        getModelConstraint(numberOfModelConstraints()-1).setAssociationType(type);
      }
  }


  public String toString()
  {
    return super.toString() + "["+
            "source" + ":" + getSource()+ "," +
            "target" + ":" + getTarget()+ "," +
            "linkNext" + ":" + getLinkNext()+ "," +
            "link" + ":" + getLink()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "mostRecent" + "=" + (getMostRecent() != null ? !getMostRecent().equals(this)  ? getMostRecent().toString().replaceAll("  ","    ") : "this" : "null");
  }
}