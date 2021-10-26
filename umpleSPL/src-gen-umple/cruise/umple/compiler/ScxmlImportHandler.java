/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Optional;
import java.util.Stack;
import java.nio.file.Paths;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Parse SCXML by extend SAX handler callbacks
 */
// line 64 "../../../../src/UmpleImport.ump"
// line 201 "../../../../src/UmpleImport_CodeHandlers.ump"
public class ScxmlImportHandler extends UmpleImportHandler
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ScxmlImportHandler Attributes
  private UmpleImportClass currentClass;
  private Stack<ImportStateMachineElement> elemStack;
  private int depth;
  private boolean isInitial;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ScxmlImportHandler()
  {
    super();
    currentClass = null;
    elemStack = new Stack<ImportStateMachineElement>();
    depth = 0;
    isInitial = false;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDepth(int aDepth)
  {
    boolean wasSet = false;
    depth = aDepth;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInitial(boolean aIsInitial)
  {
    boolean wasSet = false;
    isInitial = aIsInitial;
    wasSet = true;
    return wasSet;
  }

  public int getDepth()
  {
    return depth;
  }

  public boolean getIsInitial()
  {
    return isInitial;
  }

  public void delete()
  {
    super.delete();
  }

  // line 209 "../../../../src/UmpleImport_CodeHandlers.ump"
   public void startDocument() throws SAXException{
    UmpleImportClass umpleClass = new UmpleImportClass("StateMachine", "StateMachine", "StateMachine", false, false);
    UmpleImportModel model = getModel();
    model.addUmpleImportElement(umpleClass);
    currentClass = umpleClass;
  }

  // line 216 "../../../../src/UmpleImport_CodeHandlers.ump"
   public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
    depth++;
    if("scxml".equals(localName)) {
      String stateMachineName = attributes.getValue("name");
      ImportStateMachine stateMachine = new ImportStateMachine("", "", depth, stateMachineName);
      stateMachine.setInitialState(attributes.getValue("initial"));
      currentClass.addImportStateMachine(stateMachine);
      elemStack.push(stateMachine);
    } else if ("state".equals(localName)) {
      String stateId = attributes.getValue("id");
      ImportStateMachineState state = new ImportStateMachineState("", "", depth, stateId);
      elemStack.peek().addImportStateMachineElement(state);
      elemStack.push(state);
    } else if ("transition".equals(localName)) {
      String event = attributes.getValue("event");
      String cond = attributes.getValue("cond");
      String target = attributes.getValue("target");

      ImportTransition transition = new ImportTransition("", "", depth, event, cond, target);

      if (isInitial) {
        if (elemStack.peek() instanceof ImportStateMachine) {
          ImportStateMachine sm = (ImportStateMachine)elemStack.peek();
          sm.setInitialState(target);
        } else if (elemStack.peek() instanceof ImportStateMachineState) { 
          ImportStateMachineState state = (ImportStateMachineState)elemStack.peek();
          state.setInitialState(target);
        }
      } else {
        elemStack.peek().addImportStateMachineElement(transition);
      }
      elemStack.push(transition);  
    } else if ("onentry".equals(localName)) {
      ImportAction onentry = new ImportAction("", "", depth, "entry");
      elemStack.peek().addImportStateMachineElement(onentry);
      elemStack.push(onentry);
    } else if ("onexit".equals(localName)) {
      ImportAction onexit = new ImportAction("", "", depth, "exit");
      elemStack.peek().addImportStateMachineElement(onexit);
      elemStack.push(onexit);
    } else if ("initial".equals(localName)) {
      isInitial = true;
    }
  }

  // line 261 "../../../../src/UmpleImport_CodeHandlers.ump"
   public void characters(char [] ch, int start, int length){
    String chars = new String(ch, start, length);
    if (elemStack.peek() instanceof ImportAction) {
      ImportAction action = (ImportAction)elemStack.peek();
      action.getContent().append(chars);
    } else if (elemStack.peek() instanceof ImportTransition) {
      ImportTransition transition = (ImportTransition)elemStack.peek();
      transition.getAction().append(chars);
    }
  }

  // line 272 "../../../../src/UmpleImport_CodeHandlers.ump"
   public void endElement(String uri, String localName, String qName) throws SAXException{
    depth--;
    if ("script".equals(localName)) {
      return;
    }

    if ("initial".equals(localName)) {
      isInitial = false;
      return;
    }

    elemStack.pop();
  }


  public String toString()
  {
    return super.toString() + "["+
            "depth" + ":" + getDepth()+ "," +
            "isInitial" + ":" + getIsInitial()+ "]";
  }
}