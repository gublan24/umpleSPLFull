/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import cruise.umple.cpp.utils.StringUtil;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

// line 1447 "../../../../../UmpleTLTemplates/Core.ump"
public class GenStruct implements java.io.Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "struct ";
  public static final String TEXT_1 = "{";
  public static final String TEXT_2 = NL;
  public static final String TEXT_3 = "";
  public static final String TEXT_4 = NL + "}" + NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenStruct Attributes
  private String name;
  private int priority;
  private transient Comparator<GenComment> commentsPriority;
  private transient Comparator<GenRequirement> requirementsPriority;

  //GenStruct Associations
  private List<GenField> fields;
  private List<GenComment> comments;
  private List<GenRequirement> requirements;
  private GenClass genClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenStruct()
  {
    name = null;
    priority = 0;
    commentsPriority = 
      Comparator.comparing(GenComment::getPriority);
    requirementsPriority = 
      Comparator.comparing(GenRequirement::getPriority);
    fields = new ArrayList<GenField>();
    comments = new ArrayList<GenComment>();
    requirements = new ArrayList<GenRequirement>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
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

  public boolean setCommentsPriority(Comparator<GenComment> aCommentsPriority)
  {
    boolean wasSet = false;
    commentsPriority = aCommentsPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setRequirementsPriority(Comparator<GenRequirement> aRequirementsPriority)
  {
    boolean wasSet = false;
    requirementsPriority = aRequirementsPriority;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public int getPriority()
  {
    return priority;
  }

  public Comparator<GenComment> getCommentsPriority()
  {
    return commentsPriority;
  }

  public Comparator<GenRequirement> getRequirementsPriority()
  {
    return requirementsPriority;
  }
  /* Code from template association_GetMany */
  public GenField getField(int index)
  {
    GenField aField = fields.get(index);
    return aField;
  }

  public List<GenField> getFields()
  {
    List<GenField> newFields = Collections.unmodifiableList(fields);
    return newFields;
  }

  public int numberOfFields()
  {
    int number = fields.size();
    return number;
  }

  public boolean hasFields()
  {
    boolean has = fields.size() > 0;
    return has;
  }

  public int indexOfField(GenField aField)
  {
    int index = fields.indexOf(aField);
    return index;
  }
  /* Code from template association_GetMany */
  public GenComment getComment(int index)
  {
    GenComment aComment = comments.get(index);
    return aComment;
  }

  public List<GenComment> getComments()
  {
    List<GenComment> newComments = Collections.unmodifiableList(comments);
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

  public int indexOfComment(GenComment aComment)
  {
    int index = comments.indexOf(aComment);
    return index;
  }
  /* Code from template association_GetMany */
  public GenRequirement getRequirement(int index)
  {
    GenRequirement aRequirement = requirements.get(index);
    return aRequirement;
  }

  public List<GenRequirement> getRequirements()
  {
    List<GenRequirement> newRequirements = Collections.unmodifiableList(requirements);
    return newRequirements;
  }

  public int numberOfRequirements()
  {
    int number = requirements.size();
    return number;
  }

  public boolean hasRequirements()
  {
    boolean has = requirements.size() > 0;
    return has;
  }

  public int indexOfRequirement(GenRequirement aRequirement)
  {
    int index = requirements.indexOf(aRequirement);
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
  public static int minimumNumberOfFields()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addField(GenField aField)
  {
    boolean wasAdded = false;
    if (fields.contains(aField)) { return false; }
    GenStruct existingGenStruct = aField.getGenStruct();
    if (existingGenStruct == null)
    {
      aField.setGenStruct(this);
    }
    else if (!this.equals(existingGenStruct))
    {
      existingGenStruct.removeField(aField);
      addField(aField);
    }
    else
    {
      fields.add(aField);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeField(GenField aField)
  {
    boolean wasRemoved = false;
    if (fields.contains(aField))
    {
      fields.remove(aField);
      aField.setGenStruct(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFieldAt(GenField aField, int index)
  {  
    boolean wasAdded = false;
    if(addField(aField))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFields()) { index = numberOfFields() - 1; }
      fields.remove(aField);
      fields.add(index, aField);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFieldAt(GenField aField, int index)
  {
    boolean wasAdded = false;
    if(fields.contains(aField))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFields()) { index = numberOfFields() - 1; }
      fields.remove(aField);
      fields.add(index, aField);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFieldAt(aField, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfComments()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addComment(GenComment aComment)
  {
    boolean wasAdded = false;
    if (comments.contains(aComment)) { return false; }
    GenStruct existingGenStruct = aComment.getGenStruct();
    if (existingGenStruct == null)
    {
      aComment.setGenStruct(this);
    }
    else if (!this.equals(existingGenStruct))
    {
      existingGenStruct.removeComment(aComment);
      addComment(aComment);
    }
    else
    {
      comments.add(aComment);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(comments, commentsPriority);
    
    return wasAdded;
  }

  public boolean removeComment(GenComment aComment)
  {
    boolean wasRemoved = false;
    if (comments.contains(aComment))
    {
      comments.remove(aComment);
      aComment.setGenStruct(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRequirements()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addRequirement(GenRequirement aRequirement)
  {
    boolean wasAdded = false;
    if (requirements.contains(aRequirement)) { return false; }
    GenStruct existingGenStruct = aRequirement.getGenStruct();
    if (existingGenStruct == null)
    {
      aRequirement.setGenStruct(this);
    }
    else if (!this.equals(existingGenStruct))
    {
      existingGenStruct.removeRequirement(aRequirement);
      addRequirement(aRequirement);
    }
    else
    {
      requirements.add(aRequirement);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(requirements, requirementsPriority);
    
    return wasAdded;
  }

  public boolean removeRequirement(GenRequirement aRequirement)
  {
    boolean wasRemoved = false;
    if (requirements.contains(aRequirement))
    {
      requirements.remove(aRequirement);
      aRequirement.setGenStruct(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGenClass(GenClass aGenClass)
  {
    boolean wasSet = false;
    GenClass existingGenClass = genClass;
    genClass = aGenClass;
    if (existingGenClass != null && !existingGenClass.equals(aGenClass))
    {
      existingGenClass.removeStruct(this);
    }
    if (aGenClass != null)
    {
      aGenClass.addStruct(this);
    }
    wasSet = true;
    return wasSet;
  }

  /* Code from template association_sorted_serializable_readObject */ 
  private void readObject(java.io.ObjectInputStream in)
  throws Exception
  {
    in.defaultReadObject();

    commentsPriority = 
      Comparator.comparing(GenComment::getPriority);
    requirementsPriority = 
      Comparator.comparing(GenRequirement::getPriority);
  }
  
  public void delete()
  {
    while( !fields.isEmpty() )
    {
      fields.get(0).setGenStruct(null);
    }
    while( !comments.isEmpty() )
    {
      comments.get(0).setGenStruct(null);
    }
    while( !requirements.isEmpty() )
    {
      requirements.get(0).setGenStruct(null);
    }
    if (genClass != null)
    {
      GenClass placeholderGenClass = genClass;
      this.genClass = null;
      placeholderGenClass.removeStruct(this);
    }
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _indent(Integer numSpaces, StringBuilder sb, String content){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(content);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String indent(String content){
        StringBuilder sb = new StringBuilder();
    return this._indent(0,sb,content).toString(); 
  }

  public StringBuilder _declaration(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    if(hasComments()){for(GenComment comment: getComments()){
    realSb.append(comment.getBody());
    realSb.append(NL);
    }}
    if(hasRequirements()){for(GenRequirement requirement: getRequirements()){
    realSb.append(requirement.getBody());
    realSb.append(NL);
    }}
    realSb.append(TEXT_0);
    realSb.append(name);
    realSb.append(TEXT_1);
    for(GenField field: getFields()){
    realSb.append(TEXT_2);
    realSb.append(_indent(2, new StringBuilder(), field.declaration()));
    realSb.append(TEXT_3);
    }
    realSb.append(TEXT_4);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String declaration(){
        StringBuilder sb = new StringBuilder();
    return this._declaration(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "priority" + ":" + getPriority()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "commentsPriority" + "=" + (getCommentsPriority() != null ? !getCommentsPriority().equals(this)  ? getCommentsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "requirementsPriority" + "=" + (getRequirementsPriority() != null ? !getRequirementsPriority().equals(this)  ? getRequirementsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "genClass = "+(getGenClass()!=null?Integer.toHexString(System.identityHashCode(getGenClass())):"null");
  }
}