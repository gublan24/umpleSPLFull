/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.File;
import cruise.umple.parser.analysis.ParserAction;
import cruise.umple.parser.analysis.ParserDataPackage;
import cruise.umple.parser.analysis.RuleBasedParserThread;
import cruise.umple.parser.Token;

/**
 * This is the ParserAction to handle 'use' tokens in Umple. 
 * 
 * This is called any time a 'useStatement' token is read, in which it 
 * dispatches a `RuleBasedParserThread` on the discovered token, which
 * effectively reads the new file into the token location
 */
// line 25 "../../../../src/UmpleInternalParser_CodeParserHandlers.ump"
public class UseStatementParserAction implements ParserAction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UseStatementParserAction()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 36 "../../../../src/UmpleInternalParser_CodeParserHandlers.ump"
   public void onSuccess(Token token, ParserDataPackage data){
    String value = token.getValue("use");
    // This is the case for the umple file, which ends with .ump
    // Mixsets will be accepted (e.g use Mixset;) but not be proccessed in this method. 
    if (value.endsWith(".ump"))  
    {
      String fileName="";
	  String path = "";    
	  int index =-1;
	  if (data!=null && data.getFullFileAddress()!=null)    index = data.getFullFileAddress().lastIndexOf("/") ;
	  if (index==-1) index = data.getFullFileAddress().lastIndexOf("\\");  
	  if (index!=-1){
	    path = data.getFullFileAddress().substring(0,index+1 );
	  }
	  synchronized(data.getHasParsed())
	  {
	    fileName = data.getAnalyzer().getFile().getAbsoluteFile().getParentFile().getAbsolutePath() + File.separator + value;
	    //I used this technique because I noticed this function is used to several purposes.
	    // The correct implementation is just to set fileName = path +value; and remove the above code.
	    //TODO: this issue must be investigated more. Currently it is working with the following solution. 
	    File f = new File(fileName);
	    if (!f.exists()) fileName = path +value;
	    if(!data.getHasParsed().contains(f.getAbsolutePath()))
		{
		  data.getHasParsed().add(f.getAbsolutePath());
		  RuleBasedParserThread thread = new RuleBasedParserThread(
		          data.getAnalyzer().getRules().get("$ROOT$"),
		          token,
		          fileName,
		          data
		        );
		  data.getAnalyzer().addThread(thread);
		  thread.start();
		  }
		}
    }
  }

}