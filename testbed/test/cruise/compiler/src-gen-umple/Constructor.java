/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 3 "Constructor.ump"
public class Constructor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Constructor Attributes
  private int a;
  private String someString;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Constructor(int aA, String aSomeString)
  {
    a = aA;
    someString = aSomeString;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setA(int aA)
  {
    boolean wasSet = false;
    a = aA;
    wasSet = true;
    return wasSet;
  }

  public boolean setSomeString(String aSomeString)
  {
    boolean wasSet = false;
    someString = aSomeString;
    wasSet = true;
    return wasSet;
  }

  public int getA()
  {
    return a;
  }

  public String getSomeString()
  {
    return someString;
  }

  public void delete()
  {}

  // line 9 "Constructor.ump"
   public  Constructor(Integer x, String s){
    someString = "";
        for (int i = 0; i < x; i ++) {
            someString += s;
        }
        a = s;
  }


  public String toString()
  {
    return super.toString() + "["+
            "a" + ":" + getA()+ "," +
            "someString" + ":" + getSomeString()+ "]";
  }
}