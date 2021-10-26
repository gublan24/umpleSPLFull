/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.sync;
import java.io.*;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import cruise.umple.parser.TextParser;
import cruise.umple.parser.ParseResult;
import cruise.umple.parser.Token;
import cruise.umple.parser.Position;

// line 102 "../../../../src/UmpleSync.ump"
// line 14 "../../../../src/DeleteAssociationAction_Code.ump"
public class DeleteAssociationAction extends SynchronizationAction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DeleteAssociationAction(String aDeltaCode, String aUmpleCode, String aFilename)
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

  // line 19 "../../../../src/DeleteAssociationAction_Code.ump"
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
      
      JsonParser jsonParser = new JsonParser("json");
      ParseResult jsonResult = jsonParser.parse("json", getDeltaCode());
      
      if (!jsonResult.getWasSuccess())
      {
        setUmpleCode("//Failed at: " + jsonResult.getPosition() + "\n\n//" + getDeltaCode() + "\n\n" + getUmpleCode());
        return;
      }
      Json json = jsonParser.analyze();
      
      String associationName = json.getValue("name");
      String classOfAssociationDefinition = json.getValue("classOneId");
      
      boolean didDeletePosition = false;
      for(Token t : umpleParser.getRootToken().getSubTokens())
      {
        if (!t.is("classDefinition"))
        {
          continue;
        }
        
        if (!t.getValue("name").equals(classOfAssociationDefinition))
        {
          continue;
        }
        
        for(Token positionT : t.getSubTokens())
        {
          if (!positionT.is("associationPosition"))
          {
            continue;
          }
          
          if (!positionT.getValue("name").equals(associationName))
          {
            continue;
          }
          
          textParser.replace(positionT, "");
          didDeletePosition = true;
          break;
        }
        
        if (didDeletePosition)
        {
          break;
        }
      }   
      
      boolean didDeleteDefinition = false;
      for (Token t : umpleParser.getRootToken().getSubTokens())
      {
        if (!t.is("classDefinition"))
        {
          continue;
        }
        
        if (!t.getValue("name").equals(classOfAssociationDefinition))
        {
          continue;
        }
        
        for (Token subT : t.getSubTokens())
        {
          if (!(subT.is("inlineAssociation") || subT.is("symmetricReflexiveAssociation")))
          {
            continue;
          }
          
          String currentName = "";
          String firstClassName = t.getValue("name");
          String secondClassName = null;
          String firstRole = null;
          String secondRole = null;
          
          if(subT.is("inlineAssociation"))
          {
            firstRole = subT.getSubToken("inlineAssociationEnd").getValue("roleName");
            secondClassName = subT.getSubToken("associationEnd").getValue("type");
            secondRole = subT.getSubToken("associationEnd").getValue("roleName");
          }
          else
          {
            //Covers symmetric reflexive associations
            secondClassName = firstClassName;
            secondRole = subT.getValue("roleName");
          }
          
          firstRole = firstRole == null? "" : ":" + firstRole; 
          secondRole = secondRole == null? "" : ":" + secondRole;
          
          if (firstClassName.compareTo(secondClassName) <= 0)
          {
            currentName = firstClassName + firstRole + "__" + secondClassName + secondRole;
          }
          else
          {
            currentName = secondClassName + secondRole + "__" + firstClassName + firstRole;
          }
          
          if (currentName.equals(associationName))
          {
            textParser.replace(subT, "");
            classOfAssociationDefinition = t.getValue("name");
            didDeleteDefinition = true;
            break;
          }
        }
        
        if (didDeleteDefinition)
        {
          break;
        }
      }
      
      setUmpleCode(textParser.getText());     
    }
    catch (Exception e)
    {
      e.printStackTrace();
      String output = "FATAL ERROR PARSING UMPLE DIAGRAM\n\n";
      
      output += e.toString() + "\n";
      for (StackTraceElement trace : e.getStackTrace())
      {
        output += trace.toString() + "\n";
      }
      setUmpleCode(output);
    }
  }

}