/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 3 "Before_After_Custom.ump"
public class BeforeAfterCustom
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BeforeAfterCustom()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 7 "Before_After_Custom.ump"
  public String foo(int a){
    // line 26 "Before_After_Custom.ump"
    System.out.println("Starting foo...");
    // END OF UMPLE BEFORE INJECTION
    // line 35 "Before_After_Custom.ump"
    // This is a comment
        int x = 1;
        a += x;
    // END OF UMPLE BEFORE INJECTION
    if(a == 3) {        
        // line 30 "Before_After_Custom.ump"
        String b = "1";
            System.out.println("Returning from foo, a: " + String.valueOf(a) + ", b: " + b);
        // END OF UMPLE AFTER INJECTION
        return "3";
    }
    
    a = a*2;
    
    while (a > 0) {
        a--;
        if (a % 10 == 0) {
            a = a / 10;            
            // line 30 "Before_After_Custom.ump"
            String b = "1";
                System.out.println("Returning from foo, a: " + String.valueOf(a) + ", b: " + b);
            // END OF UMPLE AFTER INJECTION
            return a;
        }
    }
    
    System.out.println("About to exit");    
    // line 30 "Before_After_Custom.ump"
    String b = "1";
        System.out.println("Returning from foo, a: " + String.valueOf(a) + ", b: " + b);
    // END OF UMPLE AFTER INJECTION
    return "";

  }

}