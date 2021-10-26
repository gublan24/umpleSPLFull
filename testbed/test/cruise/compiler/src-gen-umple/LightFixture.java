/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 3 "State_Machine.ump"
public class LightFixture
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LightFixture State Machines
  public enum Bulb { On, Off }
  private Bulb bulb;

  //LightFixture Do Activity Threads
  Thread doActivityBulbOnThread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public LightFixture()
  {
    setBulb(Bulb.On);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getBulbFullName()
  {
    String answer = bulb.toString();
    return answer;
  }

  public Bulb getBulb()
  {
    return bulb;
  }

  public boolean push()
  {
    boolean wasEventProcessed = false;
    
    Bulb aBulb = bulb;
    switch (aBulb)
    {
      case On:
        exitBulb();
        // line 10 "State_Machine.ump"
        doTransition();
        setBulb(Bulb.Off);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitBulb()
  {
    switch(bulb)
    {
      case On:
        // line 9 "State_Machine.ump"
        doExit();
        if (doActivityBulbOnThread != null) { doActivityBulbOnThread.interrupt(); }
        break;
    }
  }

  private void setBulb(Bulb aBulb)
  {
    bulb = aBulb;

    // entry actions and do activities
    switch(bulb)
    {
      case On:
        // line 8 "State_Machine.ump"
        doEntry();
        doActivityBulbOnThread = new DoActivityThread(this,"doActivityBulbOn");
        break;
    }
  }

  private void doActivityBulbOn()
  {
    try
    {
      // line 11 "State_Machine.ump"
      doThisContinuouslyWhileOn(); a++;
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private static class DoActivityThread extends Thread
  {
    LightFixture controller;
    String doActivityMethodName;
    
    public DoActivityThread(LightFixture aController,String aDoActivityMethodName)
    {
      controller = aController;
      doActivityMethodName = aDoActivityMethodName;
      start();
    }
    
    public void run()
    {
      if ("doActivityBulbOn".equals(doActivityMethodName))
      {
        controller.doActivityBulbOn();
      }
    }
  }

  public void delete()
  {}

  // line 16 "State_Machine.ump"
  public void doEntry(){
    a=1;
  }

  // line 17 "State_Machine.ump"
  public void doExit(){
    System.out.println("Exit");
  }

  // line 18 "State_Machine.ump"
  public void doTransition(){
    System.out.println("Transition");
  }

  // line 20 "State_Machine.ump"
  public void doThisContinuouslyWhileOn(){
    while (true) {  
      System.out.println("Still on");  
      try {  
        Thread.sleep(1000);  
      }  
      catch (InterruptedException e) {}  
    }
  }

}