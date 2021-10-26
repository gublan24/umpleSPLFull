/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.sync;
import java.io.*;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import cruise.umple.parser.TextParser;
import cruise.umple.parser.ParseResult;
import cruise.umple.parser.Token;

// line 127 "../../../../src/UmpleSync.ump"
// line 14 "../../../../src/DeleteTransitionAction_Code.ump"
public class DeleteTransitionAction extends SynchronizationAction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DeleteTransitionAction(String aDeltaCode, String aUmpleCode, String aFilename)
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

  // line 19 "../../../../src/DeleteTransitionAction_Code.ump"
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
        textParser.insert("Unable to update umple code due to error at " + result.getPosition() + "\n");
        setUmpleCode(textParser.getText());
        return;
      }
      
      result = umpleParser.analyze(false);
      
      JsonParser jsonParser = new JsonParser("json");
      ParseResult jsonResult = jsonParser.parse("json", getDeltaCode());
      
      if (!jsonResult.getWasSuccess())
      {
        setUmpleCode("Failed at: " + jsonResult.getPosition() + "\n\n//" + getDeltaCode() + "\n\n" + getUmpleCode());
        return;
      }
      Json json = jsonParser.analyze();
      
      String transitionName = json.getValue("fromStateId") + "_" + json.getValue("event") + "_" + json.getValue("toStateId");
      String transitionEvent = json.getValue("event");
      String stateOfTransitionDefinition = json.getValue("fromStateId");
      /*String classOfTransitionDefinttion;*/
      
      boolean didDeleteDefinition = false;
      
      for (Token t: umpleParser.getRootToken().getSubTokens())
      {
	      	if(!t.is("classDefinition"))
	      	{
	      		continue;
	      	}
	      	/*This check is needed when JointJs support multiple class state machine*/
	      	/*if (!t.getValue("name").equals(classOfAssociationDefinition)) { continue }*/
	      	
	      	for (Token subT: t.getSubTokens())
	      	{
	      		if (!subT.is("stateMachine"))
	      		{
	      		  continue;
	      		}
	      		
	      		for (Token ssubT: subT.getSubTokens())
	      		{
	      			if (!ssubT.is("inlineStateMachine"))
	      			{
	      				continue;
	      			}
	      			
	      			
	      			for (Token stateSubT: ssubT.getSubTokens())
	      			{
	      			
	      			  if (!stateSubT.is("state"))
	      			  {
	      			      continue;
	      			  }
	      			  
	      			  nestedState(stateSubT,textParser, transitionName, stateOfTransitionDefinition, didDeleteDefinition, transitionEvent);
	      			  
	      		   }
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

  // line 116 "../../../../src/DeleteTransitionAction_Code.ump"
   private void nestedState(Token stateToken, TextParser parser, String transitionName, String stateOfTransitionDefinition, boolean didDeleteDefinition, String transitionEvent){
    String currentName = "";
    String fromState = stateToken.getValue("stateName");
    
    if(didDeleteDefinition)
    {
      return;
    }
    
    for (Token stateSubT: stateToken.getSubTokens())
    {
      if (stateSubT.is("state") && !fromState.equals(stateOfTransitionDefinition))
      {
        nestedState(stateSubT, parser, transitionName, stateOfTransitionDefinition, didDeleteDefinition, transitionEvent);
        return;
      }
      
      if (!fromState.equals(stateOfTransitionDefinition))
      {
        continue;
      }
      
      if (!stateSubT.is("transition") && !stateSubT.is("standAloneTransition"))
      {
        continue;
      }
    
      String toState = stateSubT.getValue("stateName");
      String event = stateSubT.getValue("event");
    
      currentName = fromState + "_" + event + "_" + toState;
    
      if(currentName.equals(transitionName))
       {
           parser.replace(stateSubT, "");
           //parser.insert("//DeleteTransitionAction: removed " + currentName);
           break;
       }
       else if (event==null){
            parser.replace(stateSubT, "");
            //parser.insert("//DeleteTransitionAction: removed " + currentName + ", null event \n");
            break;
        }
        else if(event.length()<transitionEvent.length()) {
            if(event.equals(transitionEvent.substring(0, event.length()))){
                parser.replace(stateSubT, "");
                //parser.insert("//DeleteTransitionAction: removed " + currentName + ", shorter event\n");
                break;
            }

       }
       else
       {
           //parser.insert("//Error: DeleteTransitionAction: " + currentName +" != " + transitionName + "\n");
       }
     }
  }

}