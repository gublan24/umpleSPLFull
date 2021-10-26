/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 3 "Before.ump"
public class Before
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Before Attributes
  private String someString;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Before(String aSomeString)
  {
    someString = aSomeString;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSomeString(String aSomeString)
  {
    boolean wasSet = false;
    // line 8 "Before.ump"
    int a = "";
    // END OF UMPLE BEFORE INJECTION
    someString = aSomeString;
    wasSet = true;
    return wasSet;
  }

  public String getSomeString()
  {
    return someString;
  }

  public void delete()
  {}

  // line 12 "Before.ump"
   public void foo(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "someString" + ":" + getSomeString()+ "]";
  }
}