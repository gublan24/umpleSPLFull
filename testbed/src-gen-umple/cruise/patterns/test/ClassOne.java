/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.patterns.test;

// line 57 "../../../../src/TestHarnessPatternsImmutable.ump"
public class ClassOne
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassOne Associations
  private ClassOtherclass classOtherclass;

  //Helper Variables
  private boolean canSetClassOtherclass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ClassOne(ClassOtherclass aClassOtherclass)
  {
    canSetClassOtherclass = true;
    if (!setClassOtherclass(aClassOtherclass))
    {
      throw new RuntimeException("Unable to create ClassOne due to aClassOtherclass. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public ClassOtherclass getClassOtherclass()
  {
    return classOtherclass;
  }
  /* Code from template association_SetUnidirectionalOne */
  private boolean setClassOtherclass(ClassOtherclass aNewClassOtherclass)
  {
    boolean wasSet = false;
    if (!canSetClassOtherclass) { return false; }
    canSetClassOtherclass = false;
    if (aNewClassOtherclass != null)
    {
      classOtherclass = aNewClassOtherclass;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {}

}