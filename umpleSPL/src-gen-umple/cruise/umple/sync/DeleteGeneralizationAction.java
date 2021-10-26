/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.sync;
import java.io.*;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import cruise.umple.parser.TextParser;
import cruise.umple.parser.ParseResult;
import cruise.umple.parser.Token;

// line 115 "../../../../src/UmpleSync.ump"
// line 14 "../../../../src/DeleteGeneralizationAction_Code.ump"
public class DeleteGeneralizationAction extends SynchronizationAction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DeleteGeneralizationAction(String aDeltaCode, String aUmpleCode, String aFilename)
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

  // line 19 "../../../../src/DeleteGeneralizationAction_Code.ump"
   public void go(){
    try
    {
      TextParser textParser = new TextParser(getUmpleCode());
      File umpleFile = new File(getFilename());    
      UmpleModel umpleModel = new UmpleModel(new UmpleFile(umpleFile));
      cruise.umple.parser.analysis.RuleBasedParser parser = new cruise.umple.parser.analysis.RuleBasedParser();
      UmpleParser umpleParser = new UmpleInternalParser("UmpleInternalParser", umpleModel, parser);
      ParseResult result = parser.parse(umpleFile);
      
      if (!result.getWasSuccess())
      {
        textParser.insert("//Unable to update umple code due to error at " + result.getPosition() + "\n");
        setUmpleCode(textParser.getText());
        return;
      }
      
      result = umpleParser.analyze(false);
      
      if (!result.getWasSuccess())
      {
        textParser.insert("//Unable to update umple code due to error at " + result.getPosition() + "\n");
        setUmpleCode(textParser.getText());
        return;
      }
      
      JsonParser jsonParser = new JsonParser("json");
      ParseResult jsonResult = jsonParser.parse("json", getDeltaCode());
      
      if (!jsonResult.getWasSuccess())
      {
        setUmpleCode("//Failed at: " + jsonResult.getPosition() + "\n\n//" + getDeltaCode() + "\n\n" + getUmpleCode());
        return;
      }
      Json json = jsonParser.analyze();
      String childId = json.getValue("childId");
      
      for(Token t : umpleParser.getRootToken().getSubTokens())
      {
        if (!t.is("classDefinition"))
        {
          continue;
        }
        
        if (!childId.equals(t.getValue("name")))
        { 
          continue;
        }
        
        Token isAToken = null;
        Token semicolonToken = null;
        Token extendsNameToken = t.getSubToken("extendsName");
        
        if (extendsNameToken == null)
        {
          continue;
        }
        
        int i = 0;
        for(Token subT : t.getSubTokens())
        {
          if (subT.is("extendsName"))
          {
            extendsNameToken = subT;
            semicolonToken = t.getSubToken(i+1);
            isAToken = t.getSubToken(i-1);
            isAToken.getPosition();
            break;
          }
          i += 1;
        }
        textParser.replace(isAToken,"");
        textParser.replace(extendsNameToken,"");
        textParser.replace(semicolonToken,"");
      }
      setUmpleCode(textParser.getText());
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