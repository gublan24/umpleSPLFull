/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Optional;
import java.nio.file.Paths;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

// line 20 "../../../../src/UmpleImport.ump"
// line 14 "../../../../src/UmpleImport_CodeHandlers.ump"
public abstract class UmpleImportHandler extends DefaultHandler
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleImportHandler Attributes
  private UmpleImportModel model;
  private Optional<Exception> parseException;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleImportHandler()
  {
    super();
    model = new UmpleImportModel("");
    parseException = Optional.empty();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setModel(UmpleImportModel aModel)
  {
    boolean wasSet = false;
    model = aModel;
    wasSet = true;
    return wasSet;
  }

  public UmpleImportModel getModel()
  {
    return model;
  }

  public void delete()
  {}

  // line 22 "../../../../src/UmpleImport_CodeHandlers.ump"
   public UmpleImportModel readDataFromXML(String filename) throws IOException,ParserConfigurationException{
    /* TODO why was this commented?
    if(!UmpleEcoreValidator.getInstance().validate(Paths.get(filename))){
          System.err.println("Ecore model used is not valid");
      }
      */

      try (FileInputStream fis = new FileInputStream(filename)) {
        return readDataFromXML(fis);
      }
  }


  /**
   * 
   * Read an {@link UmpleImportModel} from the input stream. 
   * @param input Stream to read from, it is the callers responsibility to close it. 
   * @throws IOException Thrown from {@link SAXParser#parse(InputStream, DefaultHandler)}
   * @throws ParserConfigurationException Thrown from {@link SAXParserFactory#newSAXParser()}
   */
  // line 40 "../../../../src/UmpleImport_CodeHandlers.ump"
   public UmpleImportModel readDataFromXML(InputStream input) throws IOException,ParserConfigurationException{
    if (input == null) {
      throw new NullPointerException("Input stream was null.");
    }

    SAXParserFactory factory = SAXParserFactory.newInstance();
    factory.setNamespaceAware(true);
    try {
      SAXParser parser = factory.newSAXParser();
      parser.parse(input, this);
    } catch (Exception e) {
      this.parseException = Optional.of(e);
    }

    return model;
  }

  // line 57 "../../../../src/UmpleImport_CodeHandlers.ump"
  public Optional<Exception> getParseException(){
    return parseException;
  }

  // line 61 "../../../../src/UmpleImport_CodeHandlers.ump"
  public Boolean isSuccessful(){
    return !parseException.isPresent();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}