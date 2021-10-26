/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * Represents a class that is generated from an Umple class, such as a Java or Cpp class.
 */
// line 1115 "../../../../src/Umple.ump"
public class GeneratedClass extends GeneratedElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GeneratedClass Associations
  private UmpleModel model;
  private UmpleClass uClass;
  private GeneratedClass parentClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GeneratedClass(UmpleModel aModel, UmpleClass aUClass)
  {
    super();
    if (!setModel(aModel))
    {
      throw new RuntimeException("Unable to create GeneratedClass due to aModel. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    if (!setUClass(aUClass))
    {
      throw new RuntimeException("Unable to create GeneratedClass due to aUClass. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public UmpleModel getModel()
  {
    return model;
  }
  /* Code from template association_GetOne */
  public UmpleClass getUClass()
  {
    return uClass;
  }
  /* Code from template association_GetOne */
  public GeneratedClass getParentClass()
  {
    return parentClass;
  }

  public boolean hasParentClass()
  {
    boolean has = parentClass != null;
    return has;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setModel(UmpleModel aNewModel)
  {
    boolean wasSet = false;
    if (aNewModel != null)
    {
      model = aNewModel;
      wasSet = true;
    }
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setUClass(UmpleClass aNewUClass)
  {
    boolean wasSet = false;
    if (aNewUClass != null)
    {
      uClass = aNewUClass;
      wasSet = true;
    }
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setParentClass(GeneratedClass aNewParentClass)
  {
    boolean wasSet = false;
    parentClass = aNewParentClass;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    model = null;
    uClass = null;
    parentClass = null;
    super.delete();
  }

}