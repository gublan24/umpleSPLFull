/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.runtime;

// line 4 "../../../src/runtime/SameFunctionMiddle.ump"
public class SameFunctionMiddle
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SameFunctionMiddle Attributes
  private String someString;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SameFunctionMiddle(String aSomeString)
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

  // line 9 "../../../src/runtime/SameFunctionMiddle.ump"
   public static  void main(String [] argv){
    Thread.currentThread().setUncaughtExceptionHandler(new UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new UmpleExceptionHandler());
    SameFunctionMiddle x = new SameFunctionMiddle("");
       x.divideByZero(1, 2); // The middle function
  }

  // line 14 "../../../src/runtime/SameFunctionMiddle.ump"
   public static  int divideByZero(int x){
    int a = 1;
        int b = 2;
        a += b;
        b += a;
        a = a / 0;
        b = a - x;
        return x / 0;
  }

  // line 23 "../../../src/runtime/SameFunctionMiddle.ump"
   public static  int divideByZero(int x, int y){
    int a = x + y; return a / 0;
  }

  // line 26 "../../../src/runtime/SameFunctionMiddle.ump"
   public static  int divideByZero(int x, int y, int z){
    return x + y + z / 0;
  }


  public String toString()
  {
    return super.toString() + "["+
            "someString" + ":" + getSomeString()+ "]";
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
    public UmpleSourceData SameFunctionMiddle_divideByZero(){ return new UmpleSourceData().setFileNames("SameFunctionMiddle.ump","SameFunctionMiddle.ump","SameFunctionMiddle.ump").setUmpleLines(13, 22, 25).setJavaLines(54, 65, 70).setLengths(7, 1, 1);}
    public UmpleSourceData SameFunctionMiddle_main(){ return new UmpleSourceData().setFileNames("SameFunctionMiddle.ump").setUmpleLines(8).setJavaLines(46).setLengths(2);}

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