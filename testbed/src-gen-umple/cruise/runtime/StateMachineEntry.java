/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.runtime;

// line 4 "../../../src/runtime/StateMachineEntry.ump"
public class StateMachineEntry
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StateMachineEntry State Machines
  public enum Bulb { On, Off }
  private Bulb bulb;

  //StateMachineEntry Do Activity Threads
  Thread doActivityBulbOnThread = null;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StateMachineEntry()
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
        // line 11 "../../../src/runtime/StateMachineEntry.ump"
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
        // line 10 "../../../src/runtime/StateMachineEntry.ump"
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
        // line 9 "../../../src/runtime/StateMachineEntry.ump"
        doEntry();
        doActivityBulbOnThread = new DoActivityThread(this,"doActivityBulbOn");
        break;
    }
  }

  private void doActivityBulbOn()
  {
    try
    {
      // line 12 "../../../src/runtime/StateMachineEntry.ump"
      doThisContinuouslyWhileOn();
      Thread.sleep(1);
    }
    catch (InterruptedException e)
    {

    }
  }

  private static class DoActivityThread extends Thread
  {
    StateMachineEntry controller;
    String doActivityMethodName;
    
    public DoActivityThread(StateMachineEntry aController,String aDoActivityMethodName)
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

  // line 17 "../../../src/runtime/StateMachineEntry.ump"
  public void doEntry(){
    int a = 1; a = a / 0;
  }

  // line 18 "../../../src/runtime/StateMachineEntry.ump"
  public void doExit(){
    
  }

  // line 19 "../../../src/runtime/StateMachineEntry.ump"
  public void doTransition(){
    
  }

  // line 21 "../../../src/runtime/StateMachineEntry.ump"
  public void doThisContinuouslyWhileOn(){
    while (true) {  
      System.out.println("Still on");  
      try {  
        Thread.sleep(1000);  
      }  
      catch (InterruptedException e) {}  
    }
  }

  // line 31 "../../../src/runtime/StateMachineEntry.ump"
   public static  void main(String [] argv){
    Thread.currentThread().setUncaughtExceptionHandler(new UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new UmpleExceptionHandler());
    StateMachineEntry x = new StateMachineEntry();
  }

  public static class UmpleExceptionHandler implements Thread.UncaughtExceptionHandler
  {
    public void uncaughtException(Thread t, Throwable e)
    {
      translate(e);
      if(e.getCause()!=null)
      {
        translate(e.getCause());
      }
      e.printStackTrace();
    }
    public void translate(Throwable e)
    {
      java.util.List<StackTraceElement> result = new java.util.ArrayList<StackTraceElement>();
      StackTraceElement[] elements = e.getStackTrace();
      try
      {
        for(StackTraceElement element:elements)
        {
          String className = element.getClassName();
          String methodName = element.getMethodName();
          boolean methodFound = false;
          int index = className.lastIndexOf('.')+1;
          try {
            java.lang.reflect.Method query = this.getClass().getMethod(className.substring(index)+"_"+methodName,new Class[]{});
            UmpleSourceData sourceInformation = (UmpleSourceData)query.invoke(this,new Object[]{});
            for(int i=0;i<sourceInformation.size();++i)
            {
              // To compensate for any offsets caused by injected code we need to loop through the other references to this function
              //  and adjust the start / length of the function.
              int functionStart = sourceInformation.getJavaLine(i) + (("main".equals(methodName))?3:1);
              int functionEnd = functionStart + sourceInformation.getLength(i);
              int afterInjectionLines = 0;
              //  We can leverage the fact that all inject statements are added to the uncaught exception list 
              //   before the functions that they are within
              for (int j = 0; j < i; j++) {
                if (sourceInformation.getJavaLine(j) - 1 >= functionStart &&
                    sourceInformation.getJavaLine(j) - 1 <= functionEnd &&
                    sourceInformation.getJavaLine(j) - 1 <= element.getLineNumber()) {
                    // A before injection, +2 for the comments surrounding the injected code
                    if (sourceInformation.getJavaLine(j) - 1 == functionStart) {
                        functionStart += sourceInformation.getLength(j) + 2;
                        functionEnd += sourceInformation.getLength(j) + 2;
                    } else {
                        // An after injection
                        afterInjectionLines += sourceInformation.getLength(j) + 2;
                        functionEnd += sourceInformation.getLength(j) + 2;
                    }
                }
              }
              int distanceFromStart = element.getLineNumber() - functionStart - afterInjectionLines;
              if(distanceFromStart>=0&&distanceFromStart<=sourceInformation.getLength(i))
              {
                result.add(new StackTraceElement(element.getClassName(),element.getMethodName(),sourceInformation.getFileName(i),sourceInformation.getUmpleLine(i)+distanceFromStart));
                methodFound = true;
                break;
              }
            }
          }
          catch (Exception e2){}
          if(!methodFound)
          {
            result.add(element);
          }
        }
      }
      catch (Exception e1)
      {
        e1.printStackTrace();
      }
      e.setStackTrace(result.toArray(new StackTraceElement[0]));
    }
  //The following methods Map Java lines back to their original Umple file / line    
    public UmpleSourceData StateMachineEntry_setBulb(){ return new UmpleSourceData().setFileNames("StateMachineEntry.ump").setUmpleLines(8).setJavaLines(87).setLengths(1);}
    public UmpleSourceData StateMachineEntry_doThisContinuouslyWhileOn(){ return new UmpleSourceData().setFileNames("StateMachineEntry.ump").setUmpleLines(20).setJavaLines(146).setLengths(7);}
    public UmpleSourceData StateMachineEntry_exitBulb(){ return new UmpleSourceData().setFileNames("StateMachineEntry.ump").setUmpleLines(9).setJavaLines(72).setLengths(1);}
    public UmpleSourceData StateMachineEntry_doExit(){ return new UmpleSourceData().setFileNames("StateMachineEntry.ump").setUmpleLines(17).setJavaLines(136).setLengths(1);}
    public UmpleSourceData StateMachineEntry_main(){ return new UmpleSourceData().setFileNames("StateMachineEntry.ump").setUmpleLines(30).setJavaLines(157).setLengths(1);}
    public UmpleSourceData StateMachineEntry_doTransition(){ return new UmpleSourceData().setFileNames("StateMachineEntry.ump").setUmpleLines(18).setJavaLines(141).setLengths(1);}
    public UmpleSourceData StateMachineEntry_doActivityBulbOn(){ return new UmpleSourceData().setFileNames("StateMachineEntry.ump").setUmpleLines(11).setJavaLines(96).setLengths(1);}
    public UmpleSourceData StateMachineEntry_push(){ return new UmpleSourceData().setFileNames("StateMachineEntry.ump").setUmpleLines(10).setJavaLines(54).setLengths(1);}
    public UmpleSourceData StateMachineEntry_doEntry(){ return new UmpleSourceData().setFileNames("StateMachineEntry.ump").setUmpleLines(16).setJavaLines(131).setLengths(1);}

  }
  public static class UmpleSourceData
  {
    String[] umpleFileNames;
    Integer[] umpleLines;
    Integer[] umpleJavaLines;
    Integer[] umpleLengths;
    
    public UmpleSourceData(){
    }
    public String getFileName(int i){
      return umpleFileNames[i];
    }
    public Integer getUmpleLine(int i){
      return umpleLines[i];
    }
    public Integer getJavaLine(int i){
      return umpleJavaLines[i];
    }
    public Integer getLength(int i){
      return umpleLengths[i];
    }
    public UmpleSourceData setFileNames(String... filenames){
      umpleFileNames = filenames;
      return this;
    }
    public UmpleSourceData setUmpleLines(Integer... umplelines){
      umpleLines = umplelines;
      return this;
    }
    public UmpleSourceData setJavaLines(Integer... javalines){
      umpleJavaLines = javalines;
      return this;
    }
    public UmpleSourceData setLengths(Integer... lengths){
      umpleLengths = lengths;
      return this;
    }
    public int size(){
      return umpleFileNames.length;
    }
  }
}