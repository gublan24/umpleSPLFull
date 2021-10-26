/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;
import cruise.umple.analysis.*;

// line 113 "../../../../src/Trait_refactored.ump"
// line 17 "../../../../src/UmpleAnalysis.ump"
public class PreconditionAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PreconditionAnalyzer Attributes
  private ConstraintTree rawLine;
  private UmpleClassifier uClassifier;
  private Method method;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PreconditionAnalyzer()
  {
    super();
    rawLine = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRawLine(ConstraintTree aRawLine)
  {
    boolean wasSet = false;
    rawLine = aRawLine;
    wasSet = true;
    return wasSet;
  }

  public boolean setUClassifier(UmpleClassifier aUClassifier)
  {
    boolean wasSet = false;
    uClassifier = aUClassifier;
    wasSet = true;
    return wasSet;
  }

  public boolean setMethod(Method aMethod)
  {
    boolean wasSet = false;
    method = aMethod;
    wasSet = true;
    return wasSet;
  }

  public ConstraintTree getRawLine()
  {
    return rawLine;
  }

  public UmpleClassifier getUClassifier()
  {
    return uClassifier;
  }

  public Method getMethod()
  {
    return method;
  }

  public void delete()
  {}

  // line 30 "../../../../src/UmpleAnalysis.ump"
  public void prepare(Token token){
    rawLine = new Precondition(method);
  }

  // line 35 "../../../../src/UmpleAnalysis.ump"
  public void analyze(Token token){
    if (uClassifier instanceof UmpleClass)
    {
      ((UmpleClass)(uClassifier)).addPreCond((Precondition)rawLine);
    }
    
else if (uClassifier instanceof UmpleTrait)
    {
      ((UmpleTrait)(uClassifier)).addPreCond((Precondition)rawLine);  
    }
Label_Trait_36: ;

    rawLine = new ConstraintTree();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "rawLine" + "=" + (getRawLine() != null ? !getRawLine().equals(this)  ? getRawLine().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "method" + "=" + (getMethod() != null ? !getMethod().equals(this)  ? getMethod().toString().replaceAll("  ","    ") : "this" : "null");
  }
}