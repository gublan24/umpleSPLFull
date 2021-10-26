/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 3 "One_Line.ump"
public class OneLine
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //OneLine Attributes
  private String someString;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public OneLine(String aSomeString)
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
    return wasSet;
  }

  public String getSomeString()
  {
    return someString;
  }

  public void delete()
  {}

  // line 7 "One_Line.ump"
   public void foo(){
    someString = "Hello World"; someString = 1.0; return;
  }


  public String toString()
  {
    return super.toString() + "["+
            "someString" + ":" + getSomeString()+ "]";
  }
}