/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.nusmv;

// line 504 "../../../../src/NuSMVMetamodel.ump"
public class Assign
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Assign Attributes
  private String identifier;

  //Assign Associations
  private BasicExpression basicExpression;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Assign(String aIdentifier, BasicExpression aBasicExpression)
  {
    identifier = aIdentifier;
    if (!setBasicExpression(aBasicExpression))
    {
      throw new RuntimeException("Unable to create Assign due to aBasicExpression. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIdentifier(String aIdentifier)
  {
    boolean wasSet = false;
    identifier = aIdentifier;
    wasSet = true;
    return wasSet;
  }

  public String getIdentifier()
  {
    return identifier;
  }
  /* Code from template association_GetOne */
  public BasicExpression getBasicExpression()
  {
    return basicExpression;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setBasicExpression(BasicExpression aNewBasicExpression)
  {
    boolean wasSet = false;
    if (aNewBasicExpression != null)
    {
      basicExpression = aNewBasicExpression;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    basicExpression = null;
  }

  // line 508 "../../../../src/NuSMVMetamodel.ump"
   public String toString(){
    return null;
  }

}