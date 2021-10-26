/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.alloy;
import cruise.umple.compiler.*;

// line 364 "../../../../src/AlloyFact.ump"
public class NumericBoundFact extends Fact
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //NumericBoundFact Attributes
  private String className;
  private String rName;
  private Multiplicity mult;
  private int index;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NumericBoundFact(String aClassName, String aRName, Multiplicity aMult, int aIndex)
  {
    super();
    className = aClassName;
    rName = aRName;
    mult = aMult;
    index = aIndex;
    // line 376 "../../../../src/AlloyFact.ump"
    factName = "NumericBoundFact";
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setClassName(String aClassName)
  {
    boolean wasSet = false;
    className = aClassName;
    wasSet = true;
    return wasSet;
  }

  public boolean setRName(String aRName)
  {
    boolean wasSet = false;
    rName = aRName;
    wasSet = true;
    return wasSet;
  }

  public boolean setMult(Multiplicity aMult)
  {
    boolean wasSet = false;
    mult = aMult;
    wasSet = true;
    return wasSet;
  }

  public boolean setIndex(int aIndex)
  {
    boolean wasSet = false;
    index = aIndex;
    wasSet = true;
    return wasSet;
  }

  public String getClassName()
  {
    return className;
  }

  public String getRName()
  {
    return rName;
  }

  public Multiplicity getMult()
  {
    return mult;
  }

  public int getIndex()
  {
    return index;
  }

  public void delete()
  {
    super.delete();
  }

  // line 381 "../../../../src/AlloyFact.ump"
   public  NumericBoundFact(Association assoc, int endIndex){
    super(assoc);
    factName = "NumericBoundFact";
    index = endIndex;
    mult = assoc.getEnd(index).getMultiplicity();
    initializeExtraVar();
  }

  // line 390 "../../../../src/AlloyFact.ump"
   private void initializeExtraVar(){
    if(index == 0)
    {
      className = secondClassName;
      rName = rName1;
    }
    else 
    {
      className = firstClassName;
      rName = rName2;
    }
  }

  // line 404 "../../../../src/AlloyFact.ump"
   private Integer analyzeEndMult(){
    int m = mult.getUpperBound(), n = mult.getLowerBound();
    if(m == n && m != 1) return 1;
    if(n == 0 && m != 1 && m != -1) return 3;
    if(m != n && m != -1 && n != -1 && m != 1) return 2; 
    return 0;
  }

  // line 413 "../../../../src/AlloyFact.ump"
   private String declaration(){
    return "no "+makeVarDeclaration(className,1)+suchThatPlusNewLine();
  }

  // line 418 "../../../../src/AlloyFact.ump"
   private String temp(){
    return "#"+makeVarName(className,1)+"."+rName;
  }

  // line 423 "../../../../src/AlloyFact.ump"
   private String content(){
    if(analyzeEndMult() == 1)
      return temp()+" != "+mult.getUpperBound()+"\n}";
    if(analyzeEndMult() == 2)
      return temp()+" < "+mult.getLowerBound()+" || "+
        temp()+" > "+mult.getUpperBound()+"\n}";
    if(analyzeEndMult() == 3)
      return temp()+" > "+mult.getUpperBound()+"\n}";
    return "";
  }

  // line 435 "../../../../src/AlloyFact.ump"
   private String comment(){
    return "\n\n-- Defines numeric bound rule for class "+className+"\n";
  }

  // line 440 "../../../../src/AlloyFact.ump"
   public String print(){
    if(content() != "")
      return comment()+factHeader()+declaration()+content();
    return "";
  }


  public String toString()
  {
    return super.toString() + "["+
            "className" + ":" + getClassName()+ "," +
            "rName" + ":" + getRName()+ "," +
            "index" + ":" + getIndex()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "mult" + "=" + (getMult() != null ? !getMult().equals(this)  ? getMult().toString().replaceAll("  ","    ") : "this" : "null");
  }
}