/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.sync;
import java.io.*;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import cruise.umple.parser.TextParser;
import cruise.umple.parser.ParseResult;
import cruise.umple.parser.Token;

// line 151 "../../../../src/UmpleSync.ump"
// line 14 "../../../../src/NewTransitionAction_Code.ump"
public class NewTransitionAction extends SynchronizationAction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NewTransitionAction(String aDeltaCode, String aUmpleCode, String aFilename)
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

  // line 18 "../../../../src/NewTransitionAction_Code.ump"
   public void go(){
    boolean shouldContinue = true;
	    
	    if (shouldContinue)
	    {
	      shouldContinue = addTransitionDescription();  
	    }
  }

  // line 28 "../../../../src/NewTransitionAction_Code.ump"
   private boolean addTransitionDescription(){
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
                textParser.insert("//1. Unable to update umple code due to error at " + result.getPosition() + "\n");
                setUmpleCode(textParser.getText());
                return false;
              }
              
              result = umpleParser.analyze(false);
              
              if (!result.getWasSuccess())
              {
                //Uncomment for debug
                textParser.insert("//2. Unable to update umple code due to error at " + result.getPosition() + "\n");
                setUmpleCode(textParser.getText());
                return false;
              }
              
              JsonParser jsonParser = new JsonParser("json");
              jsonParser.parse("json", getDeltaCode());
              
              Json json = jsonParser.analyze();
              
              String fromStateId = json.getValue("fromStateId");
              String event = json.getValue("event");
              String toStateId = json.getValue("toStateId");
              Token addAfterLastTransition = null;
              boolean didFindPosition = false;

              for(Token t : umpleParser.getRootToken().getSubTokens())
              {
                if (!t.is("classDefinition"))
                {
                  continue;
                }
                
                for (Token subT: t.getSubTokens())
                {
                    if(subT.is("stateMachine"))
                    {
                    		for (Token stateMSubT: subT.getSubTokens()) 
                    		{
                    			if (stateMSubT.is("inlineStateMachine")) 
                    			{
                    				
                    				for (Token stateSubT: stateMSubT.getSubTokens()) {
                                        if(didFindPosition) {
                                            break;
                                        }
                    					else if(!didFindPosition&&stateSubT.is("state")) {
                    						didFindPosition = nestedState(stateSubT, fromStateId, textParser, event, toStateId);
                    					}
                    				}
                    			}	
                    		} 
                    }
                }
              }
              
              setUmpleCode(textParser.getText());
              return true;
            }
            catch (Exception e)
            {
              return handleException(e);
            }
  }

  // line 106 "../../../../src/NewTransitionAction_Code.ump"
   private boolean nestedState(Token stateToken, String fromStateId, TextParser parser, String event, String toStateId){
    int i = 0;
   		Token addAfterLastTransition = null;
   		boolean didFindPosition = false;
        for(Token subT : stateToken.getSubTokens())
        {
          if (subT.is("state") && !fromStateId.equals(stateToken.getValue("stateName")))
          {
            didFindPosition = didFindPosition ||  nestedState(subT, fromStateId, parser, event, toStateId);
          }
            
          if (subT.is("extendsName"))
          {
            addAfterLastTransition = subT.getSubToken(i+1); // ";" is not included in the "extendsName" token
          }
                  
          if (addAfterLastTransition == null || subT.isStatic("{") || subT.is("transition")) // TODO }
          {
           addAfterLastTransition = subT;
          }
          ++i;
        }
        
        if(fromStateId.equals(stateToken.getValue("stateName"))) {
            String newTransition = StringFormatter.format(" {0} -> {1};\n", event, toStateId);
            parser.insertAfter(addAfterLastTransition, newTransition);
            //parser.insert("//NewTransitionAction: Inserted " + newTransition);
            return true;
        } else {
            //parser.insert("//NewTransitionAction error: fromStateId!=stateName " + stateToken.getValue("stateName")+ "\n");

        }
        return didFindPosition;
  }

  // line 142 "../../../../src/NewTransitionAction_Code.ump"
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