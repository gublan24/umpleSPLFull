/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.sync;
import java.io.*;
import cruise.umple.util.*;
import cruise.umple.compiler.*;
import cruise.umple.parser.TextParser;
import cruise.umple.parser.ParseResult;
import cruise.umple.parser.Token;

// line 39 "../../../../src/UmpleSync.ump"
// line 14 "../../../../src/NewAction_Code.ump"
public class NewAction extends SynchronizationAction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NewAction(String aDeltaCode, String aUmpleCode, String aFilename)
  {
    super(aDeltaCode, aUmpleCode, aFilename);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 19 "../../../../src/NewAction_Code.ump"
   public void go(){
    try
    {
      TextParser textParser = new TextParser(getUmpleCode());
      File umpleFile = new File(getFilename());    
      UmpleModel umpleModel = new UmpleModel( new UmpleFile(umpleFile) );
      cruise.umple.parser.analysis.RuleBasedParser parser = new cruise.umple.parser.analysis.RuleBasedParser();
      UmpleParser umpleParser = new UmpleInternalParser("UmpleInternalParser", umpleModel, parser);
      ParseResult result = parser.parse(umpleFile);
      
      if (!result.getWasSuccess())
      {
        //Uncomment for Debug
        //textParser.insert("//Unable to update umple code due to error at " + result.getPosition()  + "\n");
        //setUmpleCode(textParser.getText());
        //return;
      }
      
      result = umpleParser.analyze(false);
      
      if (!result.getWasSuccess())
      {
        //Uncomment for debug
        //textParser.insert("//Unable to update umple code due to error at " + result.getPosition()  + "\n");
        //setUmpleCode(textParser.getText());
        //return;
      }
      
      JsonParser jsonParser = new JsonParser("json");
      ParseResult jsonResult = jsonParser.parse("json", getDeltaCode());
      Json json = jsonParser.analyze();
      
      if (!jsonResult.getWasSuccess())
      {
        //Uncomment for debug
        //setUmpleCode("//Failed at: " + jsonResult.getPosition() + "\n\n//" + getDeltaCode() + "\n\n" + getUmpleCode());
        return;
      }
      
      Json position = json.getAttribute("position");
      String className = json.getValue("name");
      String x = position.getValue("x");
      String y = position.getValue("y");
      String width = position.getValue("width");
      String height = position.getValue("height");
      String delimiter = "$?[End_of_model]$?";
      
      Token addAfterModel = null;
      for (Token t : umpleParser.getRootToken().getSubTokens())
      {
        // inlineComment has two tokens: "//" and "comment text"
        // we need to add the new class after the "comment text"
        if (t.isStatic("//") || t.isStatic("/*"))
        {
          continue;
        }
        
        if (t.is("inlineComment")|| t.is("multilineComment"))
        {
          if (!t.isValue(delimiter))
          {
            addAfterModel = t;
            continue;
          }
          break;
        }
        
        if (!t.is("classDefinition"))
        {
          if(!t.is("toplevelException"))
          {
            addAfterModel = t;
          }
          continue;
        }
        
        if (t.getSubToken("elementPosition") == null)
        {
          addAfterModel = t;
          continue;
        }
        break;
      }
      
      boolean didAddInModel = false;
      String newClassForModel = StringFormatter.format("class {0}\n{\n}\n\n", className);
      if (addAfterModel != null)
      {
        textParser.insertAfter(addAfterModel, newClassForModel);
        setUmpleCode(textParser.getText());
        didAddInModel = true;
      }
      
      String newUmple = getUmpleCode();
      if (newUmple.length() > 0)
      {
        newUmple += "\n";
      }
      
      if (!didAddInModel)
      {
        newUmple = newClassForModel + newUmple;
      }
      newUmple += StringFormatter.format("class {0}\n{\n  position {1} {2} {3} {4};\n}\n", className, x, y, width, height);
      setUmpleCode(newUmple);
    }
    
    catch (Exception e)
    {
      e.printStackTrace();
      String output = "FATAL ERROR PARSING UMPLE DIAGRAM\n\n";
      
      for (StackTraceElement trace : e.getStackTrace())
      {
        output += trace.toString() + "\n";
      }
      setUmpleCode(output);
    }
  }

}