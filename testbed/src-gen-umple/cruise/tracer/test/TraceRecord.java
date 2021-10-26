/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;

// line 68 "../../../../src/TestHarnessTracerAttribute.ump"
public class TraceRecord
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TraceRecord Attributes
  private int number1;
  private int number2;
  private String str;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TraceRecord(int aNumber1, int aNumber2, String aStr)
  {
    number1 = aNumber1;
    number2 = aNumber2;
    str = aStr;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNumber1(int aNumber1)
  {
    boolean wasSet = false;
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,74,TraceRecord,"+System.identityHashCode(this)+",at_s,number1,"+number1+","+(""+aNumber1).toString().replace("\n","").replace(",",";")+",TracingNumber1" );
    number1 = aNumber1;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumber2(int aNumber2)
  {
    boolean wasSet = false;
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,75,TraceRecord,"+System.identityHashCode(this)+",at_s,number2,"+number2+","+(""+aNumber2).toString().replace("\n","").replace(",",";")+","+str );
    number2 = aNumber2;
    wasSet = true;
    return wasSet;
  }

  public boolean setStr(String aStr)
  {
    boolean wasSet = false;
    str = aStr;
    wasSet = true;
    return wasSet;
  }

  public int getNumber1()
  {
    return number1;
  }

  public int getNumber2()
  {
    return number2;
  }

  public String getStr()
  {
    return str;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "number1" + ":" + getNumber1()+ "," +
            "number2" + ":" + getNumber2()+ "," +
            "str" + ":" + getStr()+ "]";
  }
}