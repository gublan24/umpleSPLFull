/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.sync;
import java.io.*;
import cruise.umple.compiler.*;
import cruise.umple.parser.TextParser;
import cruise.umple.parser.Token;
import cruise.umple.parser.ParseResult;
import cruise.umple.util.*;
import java.util.*;

// line 21 "../../../../src/UmpleSync.ump"
// line 14 "../../../../src/UpdatePositioningAction_Code.ump"
public class UpdatePositioningAction extends SynchronizationAction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UpdatePositioningAction Attributes
  private UmpleParser umpleParser;
  private TextParser textParser;
  private JsonParser jsonParser;
  private Json json;
  private List<String> addedPositions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UpdatePositioningAction(String aDeltaCode, String aUmpleCode, String aFilename)
  {
    super(aDeltaCode, aUmpleCode, aFilename);
    umpleParser = null;
    textParser = null;
    jsonParser = null;
    json = null;
    addedPositions = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 19 "../../../../src/UpdatePositioningAction_Code.ump"
   public void go(){
    try
    {
      textParser = new TextParser(getUmpleCode());
      File umpleFile = new File(getFilename());    
      UmpleModel umpleModel = new UmpleModel( new UmpleFile(umpleFile) );
      cruise.umple.parser.analysis.RuleBasedParser parser = new cruise.umple.parser.analysis.RuleBasedParser();
      umpleParser = new UmpleInternalParser("UmpleInternalParser", umpleModel, parser);
      ParseResult result = parser.parse(umpleFile);
      
      if (!result.getWasSuccess())
      {
        //Uncomment for debug
        //textParser.insert("//Unable to update umple code due to error at " + result.getPosition());
        //setUmpleCode(textParser.getText());
        //return;
      }
      
      result = umpleParser.analyze(false);
      
      if (!result.getWasSuccess())
      {
        //Uncomment for debug
        //textParser.insert("//Unable to update umple code due to error at " + result.getPosition() + "\n");
        //setUmpleCode(textParser.getText());
        //return;
      }
      
      jsonParser = new JsonParser("json");
      ParseResult jsonResult = jsonParser.parse("json", getDeltaCode());
      
      if (!jsonResult.getWasSuccess())
      {
        //Uncomment for debug
        //uncomment for testing purposes
        //setUmpleCode("//****Failed at: " + jsonResult.getPosition() + "\n\n//" + getDeltaCode() + "\n\n" + getUmpleCode());
        return;
      }
      
      json = jsonParser.analyze();
      verifySubClasses(umpleParser.getRootToken());
      
    }
    catch (Exception e)
    {
      handleException(e, "yo5");
    }
  }

  // line 69 "../../../../src/UpdatePositioningAction_Code.ump"
   private void verifySubClasses(Token root){
    try
    {
      for (Token t : root.getSubTokens())
      {
        if (!t.is("classDefinition") && !t.is("associationClassDefinition"))
        {
          continue;
        }
        
        if (!classHasPositioning(umpleParser.getRootToken(), t))
        {
          addPositioning(t);
        }
        else if (!classHasDefinition(umpleParser.getRootToken(), t))
        {
          textParser.replace(t, "");
          setUmpleCode(textParser.getText());
        }
        
        if (t.hasSubTokens())
        {
          verifySubClasses(t);
        }
      }
    }
    catch (Exception e)
    {
      handleException(e, "yo4");
    }
  }

  // line 102 "../../../../src/UpdatePositioningAction_Code.ump"
   private boolean classHasPositioning(Token root, Token t){
    boolean hasPositioning = false;
    try
    {
      String targetClassName = t.getValue("name");
      
      if (addedPositions.contains(targetClassName))
      {
        return true;
      }
      
      for (Token classT : root.getSubTokens())
      {
        if (!classT.is("classDefinition") && !classT.is("associationClassDefinition"))
        {
          continue;
        }
        if (!classT.getValue("name").equals(targetClassName))
        {
          continue;
        }
        if (classT.getSubToken("elementPosition") == null)
        {
          continue;
        }
        hasPositioning = true;
        break;
      }
    }
    catch (Exception e)
    {
      handleException(e, "yo3");
    }
    return hasPositioning;
  }

  // line 139 "../../../../src/UpdatePositioningAction_Code.ump"
   private boolean classHasDefinition(Token root, Token t){
    try
    {
      String targetClassName = t.getValue("name");
      for (Token classT : root.getSubTokens())
      {
        if (!classT.is("classDefinition") && !classT.is("associationClassDefinition"))
        {
          continue;
        }
        
        if (classT.hasSubTokens())
        {
          if (classHasDefinition(classT, t))
          {
            return true;
          }
        }
        
        if (!classT.getValue("name").equals(targetClassName))
        {
          continue;
        }
        
        if (classT.getSubToken("elementPosition") != null)
        {
          continue;
        }
        
        return true;
      }
    }
    catch (Exception e)
    {
      handleException(e, "yo");
    }
    return false;
  }

  // line 179 "../../../../src/UpdatePositioningAction_Code.ump"
   private void addPositioning(Token classT){
    try
    {
      addedPositions.add(classT.getValue("name"));
      Json[] jsonClasses = json.getArray("umpleClasses");
      String targetClassName = classT.getValue("name");
      for (Json jsonClass : jsonClasses)
      {
        String jsonName = jsonClass.getValue("name");
        if (jsonName.equals(targetClassName))
        {
          Json jsonPosition = jsonClass.getAttribute("position");
          String x = jsonPosition.getValue("x");
          String y = jsonPosition.getValue("y");
          String width = jsonPosition.getValue("width");
          String height = jsonPosition.getValue("height");
          
          String newUmple = getUmpleCode();
          if (newUmple.length() > 0)
          {
            newUmple += "\n";
          }
          
          //String umpleClassType = "";
          //if (classT.is("associationClassDefinition"))
          //{
          //  umpleClassType = "associationClass";
          //}
          //else if (classT.is("classDefinition"))
          //{
          //  umpleClassType = "class";
          //}
          //String newPosition = StringFormatter.format("{0} {1}\n{\n  position {2} {3} {4} {5};\n}\n", umpleClassType, targetClassName, x, y, width, height);
          
          String newPosition = StringFormatter.format("{0} {1}\n{\n  position {2} {3} {4} {5};\n}\n", "class", targetClassName, x, y, width, height);
          
          newUmple += newPosition;
          setUmpleCode(newUmple);
        }
      }
    }
    catch (Exception e)
    {
      handleException(e, "yo2");
    }
  }

  // line 227 "../../../../src/UpdatePositioningAction_Code.ump"
   private void handleException(Exception e, String message){
    String output = "FATAL ERROR PARSING UMPLE DIAGRAM\n\n";
    
    for (StackTraceElement trace : e.getStackTrace())
    {
      output += trace.toString() + "\n";
    }
    setUmpleCode(message + " " + output);
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}