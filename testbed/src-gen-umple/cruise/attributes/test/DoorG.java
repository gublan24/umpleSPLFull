/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.attributes.test;

// line 53 "../../../../src/TestHarnessAttributes.ump"
public class DoorG
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoorG Attributes
  private float floatNoF;
  private float floatWithF;
  private double doubleNoF;
  private double doubleWithF;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DoorG()
  {
    floatNoF = (float) 1.1;
    floatWithF = (float) 1.2;
    doubleNoF = 1.3;
    doubleWithF = 1.4;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setFloatNoF(float aFloatNoF)
  {
    boolean wasSet = false;
    floatNoF = aFloatNoF;
    wasSet = true;
    return wasSet;
  }

  public boolean setFloatWithF(float aFloatWithF)
  {
    boolean wasSet = false;
    floatWithF = aFloatWithF;
    wasSet = true;
    return wasSet;
  }

  public boolean setDoubleNoF(double aDoubleNoF)
  {
    boolean wasSet = false;
    doubleNoF = aDoubleNoF;
    wasSet = true;
    return wasSet;
  }

  public boolean setDoubleWithF(double aDoubleWithF)
  {
    boolean wasSet = false;
    doubleWithF = aDoubleWithF;
    wasSet = true;
    return wasSet;
  }

  public float getFloatNoF()
  {
    return floatNoF;
  }

  public float getFloatWithF()
  {
    return floatWithF;
  }

  public double getDoubleNoF()
  {
    return doubleNoF;
  }

  public double getDoubleWithF()
  {
    return doubleWithF;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "floatNoF" + ":" + getFloatNoF()+ "," +
            "floatWithF" + ":" + getFloatWithF()+ "," +
            "doubleNoF" + ":" + getDoubleNoF()+ "," +
            "doubleWithF" + ":" + getDoubleWithF()+ "]";
  }
}