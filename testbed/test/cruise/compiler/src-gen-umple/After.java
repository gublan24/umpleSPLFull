/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 3 "After.ump"
public class After
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //After Attributes
  private String someString;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public After(String aSomeString)
  {
    someString = aSomeString;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSomeString(String aSomeString)
  {
    boolean wasSet = false;
    someString = aSomeString;
    wasSet = true;
    // line 8 "After.ump"
    int b = 1;
            int a = "";
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public String getSomeString()
  {
    return someString;
  }

  public void delete()
  {}

  // line 13 "After.ump"
   public void foo(){
    return;
  }


  public String toString()
  {
    return super.toString() + "["+
            "someString" + ":" + getSomeString()+ "]";
  }
}