/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.runtime;

// line 4 "../../../src/runtime/BeforeAfterCustomInOriginal.ump"
public class BeforeAfterCustomInOriginal
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BeforeAfterCustomInOriginal()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 16 "../../../src/runtime/BeforeAfterCustomInOriginal.ump"
   public static  void main(String [] argv){
    Thread.currentThread().setUncaughtExceptionHandler(new UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new UmpleExceptionHandler());
    InAfterCustomMultipleReturns x = new InAfterCustomMultipleReturns();
       x.foo();
  }

  // line 21 "../../../src/runtime/BeforeAfterCustomInOriginal.ump"
   public int foo(int a){
    // Dont inject here
        return 0;
  }

  // line 26 "../../../src/runtime/BeforeAfterCustomInOriginal.ump"
   public int foo(){
    // line 11 "../../../src/runtime/BeforeAfterCustomInOriginal.ump"
    int c = 1;
            c++;
    // END OF UMPLE BEFORE INJECTION
    int a = 0;
        a++;
        // This is a comment
        if (a > 0) {          
          // line 7 "../../../src/runtime/BeforeAfterCustomInOriginal.ump"
          int b = 0;
          // END OF UMPLE AFTER INJECTION
          return 0 / 0;
        }
        a++;        
        // line 7 "../../../src/runtime/BeforeAfterCustomInOriginal.ump"
        int b = 0;
        // END OF UMPLE AFTER INJECTION
        return a;

  }

  // line 35 "../../../src/runtime/BeforeAfterCustomInOriginal.ump"
   public int foo(String a){
    // Dont inject here
        return 0;
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
    public UmpleSourceData BeforeAfterCustomInOriginal_foo(){ return new UmpleSourceData().setFileNames("BeforeAfterCustomInOriginal.ump","BeforeAfterCustomInOriginal.ump","BeforeAfterCustomInOriginal.ump","BeforeAfterCustomInOriginal.ump","BeforeAfterCustomInOriginal.ump","BeforeAfterCustomInOriginal.ump").setUmpleLines(20, 11, 7, 7, 25, 34).setJavaLines(36, 44, 52, 58, 42, 65).setLengths(2, 2, 1, 1, 6, 2);}
    public UmpleSourceData BeforeAfterCustomInOriginal_main(){ return new UmpleSourceData().setFileNames("BeforeAfterCustomInOriginal.ump").setUmpleLines(15).setJavaLines(28).setLengths(2);}

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