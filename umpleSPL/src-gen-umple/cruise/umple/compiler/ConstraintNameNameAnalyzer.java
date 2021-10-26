/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.parser.analysis.Analyzer;
import cruise.umple.parser.Token;
import cruise.umple.compiler.*;
import java.util.*;
import cruise.umple.analysis.*;

// line 44 "../../../../src/Trait_refactored.ump"
// line 63 "../../../../src/Trait_refactored.ump"
// line 77 "../../../../src/Trait_refactored.ump"
// line 85 "../../../../src/Trait_refactored.ump"
// line 93 "../../../../src/Trait_refactored.ump"
// line 103 "../../../../src/Trait_refactored.ump"
// line 31 "../../../../src/Structure_refactored.ump"
// line 190 "../../../../src/StateMachine_refactored.ump"
// line 201 "../../../../src/StateMachine_refactored.ump"
// line 670 "../../../../src/UmpleAnalysis.ump"
public class ConstraintNameNameAnalyzer extends Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConstraintNameNameAnalyzer Attributes
  private ConstraintTree cv;
  private UmpleClassifier uClassifier;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConstraintNameNameAnalyzer()
  {
    super();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCv(ConstraintTree aCv)
  {
    boolean wasSet = false;
    cv = aCv;
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

  public ConstraintTree getCv()
  {
    return cv;
  }

  public UmpleClassifier getUClassifier()
  {
    return uClassifier;
  }

  public void delete()
  {}

  // line 683 "../../../../src/UmpleAnalysis.ump"
   public void analyze(Token token){
    cv.addElement(analyzeName(cv,uClassifier,token.getValue(), token.getParentToken().getSubToken("constraintParameterList")!=null ));
  }

  // line 688 "../../../../src/UmpleAnalysis.ump"
   public static  ConstraintVariable analyzeName(ConstraintTree cv, UmpleClassifier uClassifier, String value, Boolean hasParameter){
    return generateConstraintName(retrieveClass(cv,uClassifier),value,hasParameter);
  }

  // line 693 "../../../../src/UmpleAnalysis.ump"
   private static  UmpleClassifier retrieveClass(ConstraintTree cv, UmpleClassifier defaultClass){
    UmpleClassifier uClass = null;
    if(cv.getRoot() instanceof ConstraintOperator)
    {
      ConstraintOperator operator = ((ConstraintOperator)cv.getRoot());
      for(int i=operator.numberOfSubConstraints()-1;i>=0;--i)
      {
        ConstraintVariable left = operator.getSubConstraint(i);
        if(left != null)
        {
          if(left instanceof ConstraintAttribute )
          {
            ConstraintAttribute previouslyFoundAttribute = (ConstraintAttribute)left;
            uClass = previouslyFoundAttribute.getAttribute().getUmpleClass();
            if(uClass==null)
            {
              
uClass = previouslyFoundAttribute.getAttribute().getUmpleTrait();
              UmpleModel model = ((UmpleTrait)uClass).getSourceModel();
              uClass = model.getUmpleClass(previouslyFoundAttribute.getAttribute().getType());
Label_Trait_39: ;
            }
            else
            {
              UmpleModel model = ((UmpleClass)uClass).getSourceModel();
              uClass = model.getUmpleClass(previouslyFoundAttribute.getAttribute().getType());
            }
          }
          else if(left instanceof ConstraintAssociation )
          {
            ConstraintAssociation previouslyFoundAssociation = (ConstraintAssociation)left;
            uClass = previouslyFoundAssociation.getAssociation().getUmpleClass();
            if(uClass==null)
            {
              
uClass = previouslyFoundAssociation.getAssociation().getUmpleTrait();
              UmpleModel model = ((UmpleTrait)uClass).getSourceModel();
              uClass = model.getUmpleClass(previouslyFoundAssociation.getAssociation().getType());
Label_Trait_40: ;
            }
            else
            {
              UmpleModel model = ((UmpleClass)uClass).getSourceModel();
              uClass = model.getUmpleClass(previouslyFoundAssociation.getAssociation().getType());
            }
          }
        }
      }
    }
    if(uClass==null)
    {
      uClass = defaultClass;
    }
    return uClass;
  }

  // line 742 "../../../../src/UmpleAnalysis.ump"
   private static  ConstraintVariable generateConstraintName(UmpleClassifier uClassifier, String value, Boolean hasParameter){
    Attribute attribute = null;
    if (uClassifier instanceof UmpleClass)
    {
      attribute = ((UmpleClass)(uClassifier)).getAttribute(value);
    }
    else
    {
      
attribute = ((UmpleTrait)(uClassifier)).getAttribute(value);
Label_Trait_41: ;
    }
    if(attribute!=null)
    {
      if (hasParameter) return new ConstraintUnassignedName(value);
      ConstraintAttribute name = new ConstraintAttribute(attribute);
      return name;
    }
    else
    {
      AssociationVariable association = null;
      if (uClassifier instanceof UmpleClass)
      {
        association = ((UmpleClass)(uClassifier)).getAssociationVariable(value);
      }
      else
      {
        
association = ((UmpleTrait)(uClassifier)).getAssociationVariable(value);
Label_Trait_42: ;
      }
      if(association!=null)
      {
        ConstraintAssociation name = new ConstraintAssociation(association);
        return name;
      }
      else
      {
        
StateMachine stateMachine = null;
        if(uClassifier instanceof UmpleClass)
        {
          stateMachine = ((UmpleClass)uClassifier).getStateMachine(value);
        }
Label_StateMachine_43:;
        
//Interaction between Trait and StateMachine
                      else if(uClassifier instanceof UmpleTrait)
            {
              stateMachine = ((UmpleTrait)uClassifier).getStateMachine(value);
            }
           
Label_Trait_44:;
        
if(stateMachine!=null)
        {
          ConstraintStateMachine name = new ConstraintStateMachine(stateMachine);
          return name;
        }
Label_StateMachine_45: ;
        
Port port = null;
            if (uClassifier instanceof UmpleClass)
            {
              port = ((UmpleClass)(uClassifier)).getPort(value);
            }
            if(port!=null)
            {
              ConstraintPort name = new ConstraintPort(port);
              return name;
            }
Label_Structure_46: ;
        
      }
    }
    if(uClassifier instanceof UmpleClass)
    {
      UmpleClass uClass = ((UmpleClass)uClassifier).getExtendsClass();
      if(uClass!=null)
      {
        return generateConstraintName(uClass,value,hasParameter);
      }
    }
    
    
else if(uClassifier instanceof UmpleTrait)
    {
      for(UmpleTrait uTrait:((UmpleTrait)uClassifier).getExtendsTraits())
      {
        ConstraintVariable var = generateConstraintName(uTrait,value,hasParameter);
        if(!(var instanceof ConstraintUnassignedName))
        {
          return var;
        }
      }
    }
Label_Trait_47: ;


    return new ConstraintUnassignedName(value);
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "cv" + "=" + (getCv() != null ? !getCv().equals(this)  ? getCv().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "uClassifier" + "=" + (getUClassifier() != null ? !getUClassifier().equals(this)  ? getUClassifier().toString().replaceAll("  ","    ") : "this" : "null");
  }
}