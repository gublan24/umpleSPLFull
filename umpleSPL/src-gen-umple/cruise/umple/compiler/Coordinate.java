/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * A Coordinate is used in  the layout of classes
 * It represents the shape of a class box in a diagram
 */
// line 4 "../../../../src/Umple_CodeCoordinate.ump"
// line 1153 "../../../../src/Umple.ump"
public class Coordinate
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Coordinate Attributes
  private int x;
  private int y;
  private int width;
  private int height;

  //Coordinate State Machines
  public enum Status { Explicit, Undefined, Defaulted }
  private Status status;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetX;
  private boolean canSetY;
  private boolean canSetWidth;
  private boolean canSetHeight;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Coordinate(int aX, int aY, int aWidth, int aHeight)
  {
    cachedHashCode = -1;
    canSetX = true;
    canSetY = true;
    canSetWidth = true;
    canSetHeight = true;
    x = aX;
    y = aY;
    width = aWidth;
    height = aHeight;
    setStatus(Status.Explicit);
    // line 1161 "../../../../src/Umple.ump"
    updateStatus();
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setX(int aX)
  {
    boolean wasSet = false;
    if (!canSetX) { return false; }
    x = aX;
    wasSet = true;
    // line 1162 "../../../../src/Umple.ump"
    if(wasSet) updateStatus();
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean setY(int aY)
  {
    boolean wasSet = false;
    if (!canSetY) { return false; }
    y = aY;
    wasSet = true;
    // line 1163 "../../../../src/Umple.ump"
    if(wasSet) updateStatus();
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean setWidth(int aWidth)
  {
    boolean wasSet = false;
    if (!canSetWidth) { return false; }
    width = aWidth;
    wasSet = true;
    // line 1164 "../../../../src/Umple.ump"
    if(wasSet) updateStatus();
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public boolean setHeight(int aHeight)
  {
    boolean wasSet = false;
    if (!canSetHeight) { return false; }
    height = aHeight;
    wasSet = true;
    // line 1165 "../../../../src/Umple.ump"
    if(wasSet) updateStatus();
    // END OF UMPLE AFTER INJECTION
    return wasSet;
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public int getWidth()
  {
    return width;
  }

  public int getHeight()
  {
    return height;
  }

  public String getStatusFullName()
  {
    String answer = status.toString();
    return answer;
  }

  public Status getStatus()
  {
    return status;
  }

  public boolean setStatus(Status aStatus)
  {
    status = aStatus;
    return true;
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    Coordinate compareTo = (Coordinate)obj;
  
    if (getX() != compareTo.getX())
    {
      return false;
    }

    if (getY() != compareTo.getY())
    {
      return false;
    }

    if (getWidth() != compareTo.getWidth())
    {
      return false;
    }

    if (getHeight() != compareTo.getHeight())
    {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    if (cachedHashCode != -1)
    {
      return cachedHashCode;
    }
    cachedHashCode = 17;
    cachedHashCode = cachedHashCode * 23 + getX();

    cachedHashCode = cachedHashCode * 23 + getY();

    cachedHashCode = cachedHashCode * 23 + getWidth();

    cachedHashCode = cachedHashCode * 23 + getHeight();

    canSetX = false;
    canSetY = false;
    canSetWidth = false;
    canSetHeight = false;
    return cachedHashCode;
  }

  public void delete()
  {}

  // line 9 "../../../../src/Umple_CodeCoordinate.ump"
   public Point getTopLeft(){
    return new Point(x,y);
  }

  // line 14 "../../../../src/Umple_CodeCoordinate.ump"
   public Point getTopRight(){
    return new Point(x+width,y);
  }

  // line 19 "../../../../src/Umple_CodeCoordinate.ump"
   public Point getBottomLeft(){
    return new Point(x,y+height);
  }

  // line 24 "../../../../src/Umple_CodeCoordinate.ump"
   public Point getBottomRight(){
    return new Point(x+width,y+height);
  }

  // line 29 "../../../../src/Umple_CodeCoordinate.ump"
   public Point getTopMiddle(){
    return new Point(x+width/2,y);
  }

  // line 34 "../../../../src/Umple_CodeCoordinate.ump"
   public Point getBottomMiddle(){
    return new Point(x+width/2,y+height);
  }

  // line 39 "../../../../src/Umple_CodeCoordinate.ump"
   public Point getRightMiddle(){
    return new Point(x+width,y+height/2);
  }

  // line 44 "../../../../src/Umple_CodeCoordinate.ump"
   public Point getLeftMiddle(){
    return new Point(x,y+height/2);
  }

  // line 49 "../../../../src/Umple_CodeCoordinate.ump"
   public String whereIs(Coordinate neighbour){
    int topDeltaY = getTopMiddle().getY() - neighbour.getBottomMiddle().getY();
    int topDeltaX = getTopMiddle().getX() - neighbour.getBottomMiddle().getX();

    int bottomDeltaY = neighbour.getTopMiddle().getY() - getBottomMiddle().getY();
    int bottomDeltaX = getBottomMiddle().getX() - neighbour.getTopMiddle().getX();

    if (topDeltaY > 0 && Math.abs(topDeltaY) > Math.abs(topDeltaX))
    {
      return "top";
    }
    else if (bottomDeltaY > 0 && Math.abs(bottomDeltaY) > Math.abs(bottomDeltaX))
    {
      return "bottom";
    }
    else if (neighbour.getX() < getX())
    {
      return "left";
    }
    else
    {
      return "right";
    }
  }

  // line 75 "../../../../src/Umple_CodeCoordinate.ump"
   public int distanceTo(Coordinate other){
    int a = other.getX() - getX();
    int b = other.getY() - getY();
    int c = (int) Math.round(Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
    return c;
  }

  // line 83 "../../../../src/Umple_CodeCoordinate.ump"
   public String toString(){
    return "(" + getX() + "," + getY() + "," + getWidth() + "," + getHeight() + ")";
  }

  // line 88 "../../../../src/Umple_CodeCoordinate.ump"
   private void updateStatus(){
    if (x == -1 && y == -1 && width == -1 && height == -1)
    {
      setStatus(Status.Undefined);
    }
    else
    {
      setStatus(Status.Explicit);
    }
  }

}