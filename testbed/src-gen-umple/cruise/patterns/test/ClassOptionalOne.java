/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.patterns.test;

// line 69 "../../../../src/TestHarnessPatternsImmutable.ump"
public class ClassOptionalOne
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ClassOptionalOne Associations
  private ClassOtherclass classOtherclass;

  //Helper Variables
  private boolean canSetClassOtherclass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ClassOptionalOne(ClassOtherclass aClassOtherclass)
  {
    canSetClassOtherclass = true;
    setClassOtherclass(aClassOtherclass);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public ClassOtherclass getClassOtherclass()
  {
    return classOtherclass;
  }

  public boolean hasClassOtherclass()
  {
    boolean has = classOtherclass != null;
    return has;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  private boolean setClassOtherclass(ClassOtherclass aNewClassOtherclass)
  {
    boolean wasSet = false;
    if (!canSetClassOtherclass) { return false; }
    canSetClassOtherclass = false;
    classOtherclass = aNewClassOtherclass;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {}

}