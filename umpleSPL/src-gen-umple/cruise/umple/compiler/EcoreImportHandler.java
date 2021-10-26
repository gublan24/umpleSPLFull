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

/**
 * Parse ECore by extend SAX handler callbacks
 */
// line 43 "../../../../src/UmpleImport.ump"
// line 65 "../../../../src/UmpleImport_CodeHandlers.ump"
public class EcoreImportHandler extends UmpleImportHandler
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreImportHandler Attributes
  private String currentElement;
  private UmpleImportClass currentClass;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreImportHandler()
  {
    super();
    currentElement = "";
    currentClass = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 71 "../../../../src/UmpleImport_CodeHandlers.ump"
   public void startDocument() throws SAXException{
    setModel(new UmpleImportModel(""));
  }

  // line 75 "../../../../src/UmpleImport_CodeHandlers.ump"
   public void endDocument() throws SAXException{
    // System.out.println("end document");
  }

  // line 79 "../../../../src/UmpleImport_CodeHandlers.ump"
   public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
    currentElement = localName;
    UmpleImportModel model = getModel();    
    //load package object
    if (currentElement.equals("EPackage")) {
      UmpleImportPackage umplePackage = new UmpleImportPackage(UmpleImportConstants.ECORE_PACKAGE, "");
      String nameSpace = attributes.getValue(UmpleImportConstants.XMI_PACKAGENAME);
      
      // If no attribute "nsURI", use attribute "name" instead
      if (nameSpace == null || nameSpace.isEmpty()) {
        nameSpace = attributes.getValue(UmpleImportConstants.XMI_NAME);
      }
      
      if (nameSpace != null && !nameSpace.isEmpty()) {
        umplePackage.setName(nameSpace);
        model.addUmpleImportElement(umplePackage);
      }
    } 
    //load class/interface/dataType object
    else if (currentElement.equals("eClassifiers")) {
      String attrType = attributes.getValue(UmpleImportConstants.XMI_TYPE);
      boolean checkIsClass = attrType.equals(UmpleImportConstants.ECORE_CLASS);
      boolean checkIsDataType = attrType.equals(UmpleImportConstants.ECORE_DATATYPE);
      boolean checkDataTypeIsExtraClass = false;
      if (checkIsDataType){
        String dataTypeName = attributes.getValue(UmpleImportConstants.XMI_NAME);
        //exclude umple default date and time dataType
        boolean checkIsDate = dataTypeName.equals("Date");
        boolean checkIsTime = dataTypeName.equals("Time");
        checkDataTypeIsExtraClass = !(checkIsDate||checkIsTime);
      }
      if (checkIsClass || checkDataTypeIsExtraClass) {
        boolean isInterface = Boolean.parseBoolean(attributes.getValue(UmpleImportConstants.XMI_INTERFACE));
        boolean isAbstract = Boolean.parseBoolean(attributes.getValue(UmpleImportConstants.XMI_ABSTRACT));
        String currentPackageName = model.getCurrentPackageName();
        String className = attributes.getValue(UmpleImportConstants.XMI_NAME);
        UmpleImportClass umpleClass = new UmpleImportClass(UmpleImportConstants.ECORE_CLASS, className, currentPackageName, isAbstract, isInterface);
              currentClass = umpleClass;
              
        // note that it's possible that a class can have multiple interfaces
        String superType = attributes.getValue(UmpleImportConstants.XMI_SUPERTYPE);
        if (superType != null) 
          umpleClass.addSuperType(parseRawTypes(superType));
        model.addUmpleImportElement(umpleClass);
      }
    } 
    //load class attributes and associations
    else if (currentElement.equals("eStructuralFeatures")) {
      String attrType = attributes.getValue(UmpleImportConstants.XMI_TYPE);
      boolean checkIsAttribute = attrType.equals(UmpleImportConstants.ECORE_ATTRIBUTE);
      boolean checkIsReference = attrType.equals(UmpleImportConstants.ECORE_REFERENCE);
      String attrName = attributes.getValue(UmpleImportConstants.XMI_NAME);
      String classAttrTypeRaw = attributes.getValue(UmpleImportConstants.ECORE_TYPE);
      String classAttrType=parseRawTypes(classAttrTypeRaw);
      String currentClassName = currentClass.getName();
      if(checkIsAttribute)
      {       
        UmpleImportAttribute umpleAttribute = new UmpleImportAttribute(UmpleImportConstants.ECORE_ATTRIBUTE, attrName, currentClassName, classAttrType);
        String attrUpper = attributes.getValue(UmpleImportConstants.XMI_UPPER);
        if(attrUpper!=null)
          umpleAttribute.setUpperBound(Integer.parseInt(attrUpper));
        currentClass.addUmpleImportAttribute(umpleAttribute);
      }
      if(checkIsReference)
      {
        String endClassName = null;
        String endClassNameRaw = attributes.getValue("eOpposite");
        
        String lower = attributes.getValue("lowerBound");
        String upper = attributes.getValue("upperBound");
        int lowerBound = (lower != null)? Integer.parseInt(lower):0;
        int upperBound = (upper != null)? Integer.parseInt(upper):-1;
        
        if(endClassNameRaw!=null)
          endClassName = endClassNameRaw.split(classAttrTypeRaw+"/")[1];
        UmpleImportAssociation umpleAssociation = new UmpleImportAssociation(UmpleImportConstants.ECORE_REFERENCE, attrName, currentClassName, classAttrType, endClassName);
        umpleAssociation.setLowerBound(lowerBound);
        umpleAssociation.setUpperBound(upperBound);
        UmpleImportAssociation oppoEnd = model.checkIfOppositeExist(umpleAssociation);
        if(oppoEnd==null)
          currentClass.addUmpleImportAssociation(umpleAssociation);
      }
    }
  }

  // line 164 "../../../../src/UmpleImport_CodeHandlers.ump"
   public void endElement(String uri, String localName, String qName) throws SAXException{
    // reset internal values for next round of parsing
      boolean checkIsClassifiers = currentElement.equals(currentElement.equals("eClassifiers"));
    if (checkIsClassifiers && currentClass != null)
      currentClass = null;
    currentElement = "";
  }

  // line 172 "../../../../src/UmpleImport_CodeHandlers.ump"
   public void characters(char [] ch, int start, int length) throws SAXException{
    // System.out.println("characters");
  }

  // line 176 "../../../../src/UmpleImport_CodeHandlers.ump"
   public void warning(SAXParseException e) throws SAXException{
    System.out.println("Warning: " + e.getMessage());
  }

  // line 180 "../../../../src/UmpleImport_CodeHandlers.ump"
   public void error(SAXParseException e) throws SAXException{
    System.out.println("Error: " + e.getMessage());
  }

  // line 184 "../../../../src/UmpleImport_CodeHandlers.ump"
   public void fatalError(SAXParseException e) throws SAXException{
    System.out.println("Fatal Error: " + e.getMessage());
  }

  // line 188 "../../../../src/UmpleImport_CodeHandlers.ump"
   private String parseRawTypes(String rawType){
    String type = "";
    if (rawType.contains("#//"))
      type = rawType.split("#//")[1];
    else if (rawType.contains("/0/"))
      type = rawType.split("/0/")[1];
    else if (rawType.contains("/1/"))
      type = rawType.split("/1/")[1];
    else
      type = rawType;
    return type;
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}