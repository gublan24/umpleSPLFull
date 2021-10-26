/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.sync;
import java.io.*;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import cruise.umple.parser.TextParser;
import cruise.umple.parser.ParseResult;
import cruise.umple.parser.Token;

// line 77 "../../../../src/UmpleSync.ump"
// line 14 "../../../../src/NewAssociationAction_Code.ump"
public class NewAssociationAction extends SynchronizationAction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NewAssociationAction(String aDeltaCode, String aUmpleCode, String aFilename)
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

  // line 19 "../../../../src/NewAssociationAction_Code.ump"
   public void go(){
    boolean shouldContinue = true;
    
    if (shouldContinue)
    {
      shouldContinue = addAssociationPosition();  
    }
    
    if (shouldContinue)
    {
      shouldContinue = addAssociationDescription();  
    }
  }

  // line 34 "../../../../src/NewAssociationAction_Code.ump"
   private boolean addAssociationPosition(){
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
        textParser.insert("//Unable to update umple code due to error at " + result.getPosition() + "\n");
        setUmpleCode(textParser.getText());
        return false;
      }
      
      result = umpleParser.analyze(false);
      
      if (!result.getWasSuccess())
      {
        textParser.insert("//Unable to update umple code due to error at " + result.getPosition() + "\n");
        setUmpleCode(textParser.getText());
        return false;
      }
      
      JsonParser jsonParser = new JsonParser("json");
      ParseResult jsonResult = jsonParser.parse("json", getDeltaCode());
      
      if (!jsonResult.getWasSuccess())
      {
        System.out.println("delta code:\n" + getDeltaCode() + "\n\numple code:\n" + getUmpleCode());
        setUmpleCode("//Failed at: " + jsonResult.getPosition() + "\n\n//" + getDeltaCode() + "\n\n" + getUmpleCode());
        return false;
      }
      
      Json json = jsonParser.analyze();
      Json position1 = json.getAttribute("offsetOnePosition");
      Json position2 = json.getAttribute("offsetTwoPosition");
      
      String classOneName = json.getValue("classOneId");
      String associationName = json.getValue("name");
      
      boolean didAdd = false;
      
      for(Token t : umpleParser.getRootToken().getSubTokens())
      {
        if (!t.is("classDefinition"))
        {
          continue;
        }
        
        if (!classOneName.equals(t.getValue("name")))
        {
          continue;
        }
        
        Token lastAssociationPositionT = null;
        for(Token subT : t.getSubTokens())
        {
          if (subT.is("associationPosition"))
          {
            lastAssociationPositionT = subT;
          }
        }
        
        Token positionT = t.getSubToken("elementPosition");
        if (lastAssociationPositionT != null)
        {
          String newAssociationPosition = StringFormatter.format("  position.association {0} {1},{2} {3},{4};\n",associationName,position1.getValue("x"),position1.getValue("y"),position2.getValue("x"),position2.getValue("y"));
          textParser.insertAfter(lastAssociationPositionT, newAssociationPosition);
          didAdd = true;
        }
        else if (!didAdd && positionT != null)
        {
          String newAssociationPosition = StringFormatter.format("  position.association {0} {1},{2} {3},{4};\n",associationName,position1.getValue("x"),position1.getValue("y"),position2.getValue("x"),position2.getValue("y"));
          textParser.insertAfter(positionT, newAssociationPosition);
          didAdd = true;
        }
      }
      
      if (!didAdd)
      {
        String newUmple = getUmpleCode();
        if (newUmple.length() > 0)
        {
          newUmple += "\n";
        }
        newUmple += StringFormatter.format("class {0}\n{1}\n  position.association {2} {3},{4} {5},{6};\n{7}\n",classOneName,"{",associationName,position1.getValue("x"),position1.getValue("y"),position2.getValue("x"),position2.getValue("y"),"}");
        setUmpleCode(newUmple);
      }
      else
      {
        setUmpleCode(textParser.getText());
      }
      return true;
    }
    catch (Exception e)
    {
      return handleException(e);
    }
  }

  // line 138 "../../../../src/NewAssociationAction_Code.ump"
   private boolean addAssociationDescription(){
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
        //Uncomment for debug
        textParser.insert("//Unable to update umple code due to error at " + result.getPosition() + "\n");
        setUmpleCode(textParser.getText());
        return false;
      }
      
      result = umpleParser.analyze(false);
      
      if (!result.getWasSuccess())
      {
        //Uncomment for debug
        //textParser.insert("//Unable to update umple code due to error at " + result.getPosition() + "\n");
        //setUmpleCode(textParser.getText());
        return false;
      }
      
      JsonParser jsonParser = new JsonParser("json");
      jsonParser.parse("json", getDeltaCode());
      
      Json json = jsonParser.analyze();
      
      String classOneId = json.getValue("classOneId");
      String classTwoId = json.getValue("classTwoId");
      String firstRole = json.getValue("roleOne");
      String secondRole = json.getValue("roleTwo");
      Token addAfterLastAssociation = null;
      
      for(Token t : umpleParser.getRootToken().getSubTokens())
      {
        if (!t.is("classDefinition"))
        {
          continue;
        }
        
        if (!classOneId.equals(t.getValue("name")))
        {
          continue;
        }
        int i = 0;
        for(Token subT : t.getSubTokens())
        {
          if (subT.is("extendsName"))
          {
            addAfterLastAssociation = t.getSubToken(i+1); // ";" is not included in the "extendsName" token
          }
          
          if (addAfterLastAssociation == null || subT.isStatic("{") || subT.is("inlineAssociation") || subT.is("attribute")) // TODO }
          {
            addAfterLastAssociation = subT;
          }
          ++i;
        }
        break;
      }
      
      if(firstRole == null) 
      {
        firstRole = "";
      }
      
      if(secondRole == null || secondRole.equals("")) 
      {
        secondRole = "";
      }
      else 
      {
        secondRole = " " + secondRole;
      }
      
      String newAssociation = StringFormatter.format(" {0} * -- * {1}{2};\n", firstRole, classTwoId, secondRole);
      textParser.insertAfter(addAfterLastAssociation, newAssociation);
      setUmpleCode(textParser.getText());
      return true;
    }
    catch (Exception e)
    {
      return handleException(e);
    }
  }

  // line 231 "../../../../src/NewAssociationAction_Code.ump"
   private boolean handleException(Exception e){
    String output = "FATAL ERROR PARSING UMPLE DIAGRAM\n\n";
    
    for (StackTraceElement trace : e.getStackTrace())
    {
      output += trace.toString() + "\n";
    }
    setUmpleCode(output);
    return false;
  }

}