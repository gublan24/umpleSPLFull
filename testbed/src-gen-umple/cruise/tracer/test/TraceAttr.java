/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.tracer.test;
import cruise.util.ConsoleTracer;
import java.util.*;

// line 5 "../../../../src/TestHarnessTracerAttribute.ump"
public class TraceAttr
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TraceAttr Attributes
  private String name;
  private String address;
  private double salary;
  private List<Integer> id;
  private boolean flag;
  private int numCond;
  private String strCond;
  private int number1;
  private int number2;
  private int number3;
  private double number4;
  private String str;
  private boolean traceFlag1;
  private boolean traceFlag2;
  private int traceFlag3;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TraceAttr(String aName, String aAddress, double aSalary, boolean aFlag, int aNumCond, String aStrCond, int aNumber1, int aNumber2, int aNumber3, double aNumber4, String aStr)
  {
    name = aName;
    address = aAddress;
    salary = aSalary;
    id = new ArrayList<Integer>();
    flag = aFlag;
    numCond = aNumCond;
    strCond = aStrCond;
    number1 = aNumber1;
    number2 = aNumber2;
    number3 = aNumber3;
    number4 = aNumber4;
    str = aStr;
    traceFlag1 = false;
    traceFlag2 = true;
    traceFlag3 = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,13,TraceAttr,"+System.identityHashCode(this)+",at_s,name,"+name+","+(""+aName).toString().replace("\n","").replace(",",";") );
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setSalary(double aSalary)
  {
    boolean wasSet = false;
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,16,TraceAttr,"+System.identityHashCode(this)+",at_s,salary,"+salary+","+(""+aSalary).toString().replace("\n","").replace(",",";") );
    salary = aSalary;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addId(Integer aId)
  {
    boolean wasAdded = false;
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,14,TraceAttr,"+System.identityHashCode(this)+",at_a,id,"+id+","+(""+aId).toString().replace("\n","").replace(",",";") );
    wasAdded = id.add(aId);
    return wasAdded;
  }

  public boolean removeId(Integer aId)
  {
    boolean wasRemoved = false;
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,14,TraceAttr,"+System.identityHashCode(this)+",at_r,id,"+id+","+(""+aId).toString().replace("\n","").replace(",",";") );
    wasRemoved = id.remove(aId);
    return wasRemoved;
  }

  public boolean setFlag(boolean aFlag)
  {
    boolean wasSet = false;
    flag = aFlag;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumCond(int aNumCond)
  {
    boolean wasSet = false;
    numCond = aNumCond;
    wasSet = true;
    if (aNumCond==1)
    {
      traceFlag1=true;
    }
    if (aNumCond<=0)
    {
      traceFlag2=false;
    }
    return wasSet;
  }

  public boolean setStrCond(String aStrCond)
  {
    boolean wasSet = false;
    strCond = aStrCond;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumber1(int aNumber1)
  {
    boolean wasSet = false;
    if (getNumCond()>100)
    {
      ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,29,TraceAttr,"+System.identityHashCode(this)+",at_s,number1,"+number1+","+(""+aNumber1).toString().replace("\n","").replace(",",";") );
    }
    number1 = aNumber1;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumber2(int aNumber2)
  {
    boolean wasSet = false;
    number2 = aNumber2;
    if (getNumCond()==20)
    {
      ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,30,TraceAttr,"+System.identityHashCode(this)+",at_s,number2,"+number2 );
    }
    wasSet = true;
    return wasSet;
  }

  public boolean setNumber3(int aNumber3)
  {
    boolean wasSet = false;
    number3 = aNumber3;
    if (traceFlag1)
    {
      ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,31,TraceAttr,"+System.identityHashCode(this)+",at_s,number3,"+number3 );
    }
    wasSet = true;
    return wasSet;
  }

  public boolean setNumber4(double aNumber4)
  {
    boolean wasSet = false;
    number4 = aNumber4;
    if (traceFlag2)
    {
      ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,32,TraceAttr,"+System.identityHashCode(this)+",at_s,number4,"+number4 );
    }
    wasSet = true;
    return wasSet;
  }

  public boolean setStr(String aStr)
  {
    boolean wasSet = false;
    if (traceFlag3<3)
    {
      ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,33,TraceAttr,"+System.identityHashCode(this)+",at_s,str,"+str+","+(""+aStr).toString().replace("\n","").replace(",",";") );
      traceFlag3++;
    }
    str = aStr;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,15,TraceAttr,"+System.identityHashCode(this)+",at_g,address,"+address );
    return address;
  }

  public double getSalary()
  {
    ConsoleTracer.handle( System.currentTimeMillis()+","+Thread.currentThread().getId()+",TestHarnessTracerAttribute.ump,16,TraceAttr,"+System.identityHashCode(this)+",at_g,salary,"+salary );
    return salary;
  }
  /* Code from template attribute_GetMany */
  public Integer getId(int index)
  {
    Integer aId = id.get(index);
    return aId;
  }

  public Integer[] getId()
  {
    Integer[] newId = id.toArray(new Integer[id.size()]);
    return newId;
  }

  public int numberOfId()
  {
    int number = id.size();
    return number;
  }

  public boolean hasId()
  {
    boolean has = id.size() > 0;
    return has;
  }

  public int indexOfId(Integer aId)
  {
    int index = id.indexOf(aId);
    return index;
  }

  public boolean getFlag()
  {
    return flag;
  }

  /**
   * Trace attributes with conditions
   */
  public int getNumCond()
  {
    return numCond;
  }

  /**
   * ToBe added string constrints
   */
  public String getStrCond()
  {
    return strCond;
  }

  public int getNumber1()
  {
    return number1;
  }

  public int getNumber2()
  {
    return number2;
  }

  public int getNumber3()
  {
    return number3;
  }

  public double getNumber4()
  {
    return number4;
  }

  public String getStr()
  {
    return str;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isFlag()
  {
    return flag;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "address" + ":" + getAddress()+ "," +
            "salary" + ":" + getSalary()+ "," +
            "flag" + ":" + getFlag()+ "," +
            "numCond" + ":" + getNumCond()+ "," +
            "strCond" + ":" + getStrCond()+ "," +
            "number1" + ":" + getNumber1()+ "," +
            "number2" + ":" + getNumber2()+ "," +
            "number3" + ":" + getNumber3()+ "," +
            "number4" + ":" + getNumber4()+ "," +
            "str" + ":" + getStr()+ "]";
  }
}