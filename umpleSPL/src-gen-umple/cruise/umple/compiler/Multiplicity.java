/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.util.*;

/**
 * In Umple_Code.ump: Methods for querying various propertiies of a Multiplicit
 * A multplicity constrains the number of linked objects at one end of an
 * association
 * 
 * TODO: extract derived attributes from Umple_Code.ump (getLowerBound etc.)
 */
// line 551 "../../../../src/Umple_CodeAssociation.ump"
// line 1090 "../../../../src/Umple.ump"
public class Multiplicity
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Multiplicity Attributes
  private String bound;
  private String minimum;
  private String maximum;

  //Helper Variables
  private int cachedHashCode;
  private boolean canSetBound;
  private boolean canSetMinimum;
  private boolean canSetMaximum;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Multiplicity()
  {
    cachedHashCode = -1;
    canSetBound = true;
    canSetMinimum = true;
    canSetMaximum = true;
    bound = null;
    minimum = null;
    maximum = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setBound(String aBound)
  {
    boolean wasSet = false;
    if (!canSetBound) { return false; }
    bound = aBound;
    wasSet = true;
    return wasSet;
  }

  public boolean setMinimum(String aMinimum)
  {
    boolean wasSet = false;
    if (!canSetMinimum) { return false; }
    minimum = aMinimum;
    wasSet = true;
    return wasSet;
  }

  public boolean setMaximum(String aMaximum)
  {
    boolean wasSet = false;
    if (!canSetMaximum) { return false; }
    maximum = aMaximum;
    wasSet = true;
    return wasSet;
  }

  /**
   * used when minimum=maximum;
   */
  public String getBound()
  {
    return bound;
  }

  public String getMinimum()
  {
    return minimum;
  }

  public String getMaximum()
  {
    return maximum;
  }

  public String getParserable()
  {
    return getBound() != null ? getBound() : ( (getMinimum() == null ||  getMinimum().equals("0")) && (getMaximum() == null || getMaximum().equals("*")) ? "*" : ""+ getMinimum() + ".." + getMaximum());
  }

  public boolean equals(Object obj)
  {
    if (obj == null) { return false; }
    if (!getClass().equals(obj.getClass())) { return false; }

    Multiplicity compareTo = (Multiplicity)obj;
  
    if (getBound() == null && compareTo.getBound() != null)
    {
      return false;
    }
    else if (getBound() != null && !getBound().equals(compareTo.getBound()))
    {
      return false;
    }

    if (getMinimum() == null && compareTo.getMinimum() != null)
    {
      return false;
    }
    else if (getMinimum() != null && !getMinimum().equals(compareTo.getMinimum()))
    {
      return false;
    }

    if (getMaximum() == null && compareTo.getMaximum() != null)
    {
      return false;
    }
    else if (getMaximum() != null && !getMaximum().equals(compareTo.getMaximum()))
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
    if (getBound() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getBound().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (getMinimum() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getMinimum().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    if (getMaximum() != null)
    {
      cachedHashCode = cachedHashCode * 23 + getMaximum().hashCode();
    }
    else
    {
      cachedHashCode = cachedHashCode * 23;
    }

    canSetBound = false;
    canSetMinimum = false;
    canSetMaximum = false;
    return cachedHashCode;
  }

  public void delete()
  {}

  // line 556 "../../../../src/Umple_CodeAssociation.ump"
   public void setRange(String lowerBound, String upperBound){
    minimum = lowerBound;
    maximum = upperBound;
  }

  // line 562 "../../../../src/Umple_CodeAssociation.ump"
   public String getRange(){
    String lowerBound = getLowerBound() == -1 ? "*" : getLowerBound() + "";
    String upperBound = getUpperBound() == -1 ? "*" : getUpperBound() + "";
    return StringFormatter.format("[{0},{1}]",lowerBound,upperBound);
  }

  // line 569 "../../../../src/Umple_CodeAssociation.ump"
   public String[] getRangeParts(){
    String lowerBound = getLowerBound() == -1 ? "*" : getLowerBound() + "";
    String upperBound = getUpperBound() == -1 ? "*" : getUpperBound() + "";
    return new String[] { lowerBound, upperBound };
  }

  // line 576 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isValid(){
    if ("*".equals(getMinimum()))
    {
      return false;
    }

    if ("-1".equals(getMinimum()) || "-1".equals(getMaximum()) || "-1".equals(getBound()))
    {
      return false;
    }

    if (getLowerBound() < -1 || getUpperBound() < -1)
    {
      return false;
    }

    // Fix for issue 292
    if (getUpperBound() == 0)
    {
      return false;
    }


    if (getLowerBound() > getUpperBound() && !isUpperBoundMany())
    {
      return false;
    }

    return true;
  }

  // line 608 "../../../../src/Umple_CodeAssociation.ump"
   public void minimizeRange(Multiplicity compareTo){
    if (compareTo.getLowerBound() > getLowerBound() && compareTo.minimum != null)
    {
      minimum = compareTo.minimum;
    }
    if (compareTo.getUpperBound() < getUpperBound() && compareTo.maximum != null && compareTo.getUpperBound() != -1)
    {
      maximum = compareTo.maximum;
    }
  }

  // line 620 "../../../../src/Umple_CodeAssociation.ump"
   public int getLowerBound(){
    if (getBound() != null)
    {
      return parseInt(getBound(),0);
    }
    else
    {
      return parseInt(getMinimum(),-1);
    }
  }

  // line 632 "../../../../src/Umple_CodeAssociation.ump"
   public int getUpperBound(){
    if (getBound() != null)
    {
      return parseInt(getBound(),-1);
    }
    else
    {
      return parseInt(getMaximum(),-1);
    }
  }

  // line 644 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isLowerBoundMany(){
    return getLowerBound() == -1;
  }

  // line 649 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isUpperBoundMany(){
    return getUpperBound() == -1;
  }

  // line 654 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isLowerBoundNumeric(){
    return getLowerBound() >= -1;
  }

  // line 659 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isUpperBoundNumeric(){
    return getUpperBound() >= -1;
  }

  // line 664 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isMany(){
    return getUpperBound() > 1 || getUpperBound() == -1;
  }

  // line 669 "../../../../src/Umple_CodeAssociation.ump"
   public boolean isOne(){
    return getUpperBound() == 1;
  }

  // line 674 "../../../../src/Umple_CodeAssociation.ump"
   private int parseInt(String input, int defaultIfStar){
    try
    {
      if ("*".equals(input))
      {
        return defaultIfStar;
      }
      else
      {
        return Integer.parseInt(input);
      }
    }
    catch(Exception e)
    {
      return -2;
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "maximum" + ":" + getMaximum()+ "," +
            "minimum" + ":" + getMinimum()+ "," +
            "bound" + ":" + getBound()+ "," +
            "parserable" + ":" + getParserable()+ "]";
  }
}