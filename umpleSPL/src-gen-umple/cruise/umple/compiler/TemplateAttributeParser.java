/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import cruise.umple.parser.Position;
import cruise.umple.parser.Token;
import cruise.umple.parser.ErrorMessage;
import java.util.*;

/**
 * Parse existing attributes in a template
 */
// line 98 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
public class TemplateAttributeParser
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String TEMPLATE_END_TAG = "endTag";
  public static final String TEMPLATE_COMMENT = "templateComment";
  public static final String TEMPLATE_EXPRESSION = "templateExpression";
  public static final String TEMPLATE_TEXT = "templateText";
  public static final String TEMPLATE_CODEBLOCK = "templateCodeBlock";
  public static final String TEMPLATE_INCLUDE = "templateInclude";
  public static final String IDENT = "indent";
  public static final String TEXT = "Text";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TemplateAttributeParser Attributes
  private UmpleInternalParser parser;
  private String className;
  private String templateName;
  private Token rootToken;
  private List<String> parameterNames;
  private EmitResponse emisionContent;

  //TemplateAttributeParser Associations
  private List<TemplateElement> elements;
  private List<TemplateField> fields;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TemplateAttributeParser(UmpleInternalParser aParser, String aClassName, String aTemplateName, Token aRootToken)
  {
    parser = aParser;
    className = aClassName;
    templateName = aTemplateName;
    rootToken = aRootToken;
    parameterNames = new ArrayList<String>();
    elements = new ArrayList<TemplateElement>();
    fields = new ArrayList<TemplateField>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setParser(UmpleInternalParser aParser)
  {
    boolean wasSet = false;
    parser = aParser;
    wasSet = true;
    return wasSet;
  }

  public boolean setClassName(String aClassName)
  {
    boolean wasSet = false;
    className = aClassName;
    wasSet = true;
    return wasSet;
  }

  public boolean setTemplateName(String aTemplateName)
  {
    boolean wasSet = false;
    templateName = aTemplateName;
    wasSet = true;
    return wasSet;
  }

  public boolean setRootToken(Token aRootToken)
  {
    boolean wasSet = false;
    rootToken = aRootToken;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addParameterName(String aParameterName)
  {
    boolean wasAdded = false;
    wasAdded = parameterNames.add(aParameterName);
    return wasAdded;
  }

  public boolean removeParameterName(String aParameterName)
  {
    boolean wasRemoved = false;
    wasRemoved = parameterNames.remove(aParameterName);
    return wasRemoved;
  }

  public boolean setEmisionContent(EmitResponse aEmisionContent)
  {
    boolean wasSet = false;
    emisionContent = aEmisionContent;
    wasSet = true;
    return wasSet;
  }

  public UmpleInternalParser getParser()
  {
    return parser;
  }

  public String getClassName()
  {
    return className;
  }

  public String getTemplateName()
  {
    return templateName;
  }

  public Token getRootToken()
  {
    return rootToken;
  }
  /* Code from template attribute_GetMany */
  public String getParameterName(int index)
  {
    String aParameterName = parameterNames.get(index);
    return aParameterName;
  }

  public String[] getParameterNames()
  {
    String[] newParameterNames = parameterNames.toArray(new String[parameterNames.size()]);
    return newParameterNames;
  }

  public int numberOfParameterNames()
  {
    int number = parameterNames.size();
    return number;
  }

  public boolean hasParameterNames()
  {
    boolean has = parameterNames.size() > 0;
    return has;
  }

  public int indexOfParameterName(String aParameterName)
  {
    int index = parameterNames.indexOf(aParameterName);
    return index;
  }

  public EmitResponse getEmisionContent()
  {
    return emisionContent;
  }
  /* Code from template association_GetMany */
  public TemplateElement getElement(int index)
  {
    TemplateElement aElement = elements.get(index);
    return aElement;
  }

  public List<TemplateElement> getElements()
  {
    List<TemplateElement> newElements = Collections.unmodifiableList(elements);
    return newElements;
  }

  public int numberOfElements()
  {
    int number = elements.size();
    return number;
  }

  public boolean hasElements()
  {
    boolean has = elements.size() > 0;
    return has;
  }

  public int indexOfElement(TemplateElement aElement)
  {
    int index = elements.indexOf(aElement);
    return index;
  }
  /* Code from template association_GetMany */
  public TemplateField getField(int index)
  {
    TemplateField aField = fields.get(index);
    return aField;
  }

  public List<TemplateField> getFields()
  {
    List<TemplateField> newFields = Collections.unmodifiableList(fields);
    return newFields;
  }

  public int numberOfFields()
  {
    int number = fields.size();
    return number;
  }

  public boolean hasFields()
  {
    boolean has = fields.size() > 0;
    return has;
  }

  public int indexOfField(TemplateField aField)
  {
    int index = fields.indexOf(aField);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfElements()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addElement(TemplateElement aElement)
  {
    boolean wasAdded = false;
    if (elements.contains(aElement)) { return false; }
    TemplateAttributeParser existingTemplateAttributeParser = aElement.getTemplateAttributeParser();
    if (existingTemplateAttributeParser == null)
    {
      aElement.setTemplateAttributeParser(this);
    }
    else if (!this.equals(existingTemplateAttributeParser))
    {
      existingTemplateAttributeParser.removeElement(aElement);
      addElement(aElement);
    }
    else
    {
      elements.add(aElement);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeElement(TemplateElement aElement)
  {
    boolean wasRemoved = false;
    if (elements.contains(aElement))
    {
      elements.remove(aElement);
      aElement.setTemplateAttributeParser(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addElementAt(TemplateElement aElement, int index)
  {  
    boolean wasAdded = false;
    if(addElement(aElement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfElements()) { index = numberOfElements() - 1; }
      elements.remove(aElement);
      elements.add(index, aElement);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveElementAt(TemplateElement aElement, int index)
  {
    boolean wasAdded = false;
    if(elements.contains(aElement))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfElements()) { index = numberOfElements() - 1; }
      elements.remove(aElement);
      elements.add(index, aElement);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addElementAt(aElement, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFields()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addField(TemplateField aField)
  {
    boolean wasAdded = false;
    if (fields.contains(aField)) { return false; }
    TemplateAttributeParser existingTemplateAttributeParser = aField.getTemplateAttributeParser();
    if (existingTemplateAttributeParser == null)
    {
      aField.setTemplateAttributeParser(this);
    }
    else if (!this.equals(existingTemplateAttributeParser))
    {
      existingTemplateAttributeParser.removeField(aField);
      addField(aField);
    }
    else
    {
      fields.add(aField);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeField(TemplateField aField)
  {
    boolean wasRemoved = false;
    if (fields.contains(aField))
    {
      fields.remove(aField);
      aField.setTemplateAttributeParser(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFieldAt(TemplateField aField, int index)
  {  
    boolean wasAdded = false;
    if(addField(aField))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFields()) { index = numberOfFields() - 1; }
      fields.remove(aField);
      fields.add(index, aField);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFieldAt(TemplateField aField, int index)
  {
    boolean wasAdded = false;
    if(fields.contains(aField))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFields()) { index = numberOfFields() - 1; }
      fields.remove(aField);
      fields.add(index, aField);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFieldAt(aField, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !elements.isEmpty() )
    {
      elements.get(0).setTemplateAttributeParser(null);
    }
    while( !fields.isEmpty() )
    {
      fields.get(0).setTemplateAttributeParser(null);
    }
  }

  // line 129 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public TemplateElement analyzeExpression(Token token){
    ExpressionElement element = new ExpressionElement(token.getPosition(), "");
	  for(Token subToken: token.getSubTokens())
	  {
		if(subToken.is("templateExpressionContent"))
		{
		  String expression = subToken.getValue().trim();
		  if(parameterNames.contains(expression))
		  {
		    element.addSubElement(new VariableElement(token.getPosition(), "",indexOfParameterName(expression)));
		  }
		  else
		  {
		    element.addSubElement(new ExpressionElement(token.getPosition(), expression));
		  }		      
		}
		else if(subToken.is("templateExpression"))
		{
		  element.addSubElement(analyzeExpression(subToken));
		}
	  }		  
	  return element;
  }

  // line 153 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
   public boolean parse(){
    elements.clear();
      emisionContent = new EmitResponse();
	  int tokenIdx = 0;
	  TemplateElement lastElement = null;
	  for(Token token:rootToken.getSubTokens()){	    
		if(token.is(TEMPLATE_EXPRESSION))
		{
		  lastElement= analyzeExpression(token);
		  addElement(lastElement);
		  tokenIdx++;
		} 
		else if(token.is(TEMPLATE_CODEBLOCK))
		{
		  CodeBlockElement element = new CodeBlockElement(token.getPosition(), "");
		  if(lastElement != null && !(lastElement instanceof CodeBlockElement)) {
		  		String text = lastElement.getContent();
		  		text = Utils.trimTemplateBlockEndNewLine(text);
		  		lastElement.setContent(text);
		  }
		  for(Token subToken: token.getSubTokens())
		  {
		    if(subToken.is("templateLanguageCode"))
		    {
		      element.addSubElement(new TextElement(subToken.getPosition(), subToken.getValue()));		      
		    }
		    else if(subToken.is("templateExpression"))
		    {
		      element.addSubElement(analyzeExpression(subToken));
		    }
		  }
		  lastElement= element;
		  addElement(element);
		  tokenIdx++;
		}
		else if(token.is(TEMPLATE_INCLUDE)) 
		{
			Token templateRefToken = token.getSubToken(TEMPLATE_INCLUDE).getSubToken("templateName");
			if(templateRefToken != null) {
			    String className = getClassName();
				String key = templateName;
				String refClassname = templateRefToken.getValue("classname");
				if(refClassname == null || refClassname.length() ==0) {
					refClassname = getClassName();
				}
				String refKey = templateRefToken.getValue("name");
				TemplateName refTemplateName = new TemplateName(refKey,refClassname);
				String refTemplateFullName = refKey;
				if(refClassname != null && refClassname.length() > 0) {
					refTemplateFullName = refClassname + "." + refTemplateFullName;
				}
				String templateFullName = key;
				if(className != null && className.length() > 0) {
					templateFullName = className + "." + templateFullName;
				}
				if(templateFullName.equals(refTemplateFullName)) {
					parser.getParseResult().setPosition(templateRefToken.getPosition());
					parser.getParseResult().addErrorMessage(new ErrorMessage(3503,templateRefToken.getPosition(),templateName));
				} else {
				    lastElement= new IncludeTemplateElement(token.getPosition(), "", refTemplateName);
					addElement(lastElement);
				}
			}
			tokenIdx++;
		} 
		else if(token.is(TEMPLATE_COMMENT)) 
		{
		  lastElement= new CommentElement(token.getPosition(), token.getSubToken(TEMPLATE_COMMENT).getValue("templateCommentContent")); 
		  addElement(lastElement);
		  tokenIdx++;
		} 
		else if(token.is(TEMPLATE_TEXT)) 
		{
		  String text = token.getSubToken(TEMPLATE_TEXT).getValue("templateTextContent");		    
		  if(!"".equals(text)){
		    /*if(tokenIdx == 0) {
		    	text = Utils.trimTemplateBlockBeginigNewLine(text);
		    }
		    if(numberOfElements() > 0) {
		  		TemplateElement lastElement = getElement(numberOfElements() - 1);
		  		if(lastElement instanceof CodeBlockElement) {
		  			text = Utils.trimTemplateBlockBeginigNewLine(text);		  		
		  		}
		  	}*/
		  	lastElement= new TextElement(token.getPosition(),text);
		    addElement(lastElement);
		    tokenIdx++;
		  }
		}
	  }
	  if(numberOfElements() > 0) {
		  if(lastElement instanceof TextElement) {
			  String text = lastElement.getContent();
			  //text = Utils.trimTemplateBlockEndNewLine(text);
			  lastElement.setContent(text);
		  }	  
	  }
	  return true;
  }

  // line 254 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public void setVariableElements(TemplateElement parent, TemplateMethodBlock methodBlock){
    if(parent instanceof VariableElement && methodBlock!=null)
	  {
	    VariableElement element = ((VariableElement)parent);
	    int index = element.getIndex();
	    element.setContent(methodBlock.getParameter(index));       
	  }
	  for(TemplateElement element: parent.getSubElements())
	  {
	    setVariableElements(element,methodBlock);
	  }
  }

  // line 268 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public EmitResponse getEmissionResponse(UmpleClass currentTemplate, TemplateMethodBlock methodBlock){
    emisionContent = new EmitResponse();
	  for (TemplateElement templateElement : elements)
	  {	  
	    setVariableElements(templateElement,methodBlock);  
	    try {
			templateElement.emit(emisionContent,currentTemplate);
		} catch (TemplateException e) {
			parser.getParseResult().setPosition(e.getPosition());
			parser.getParseResult().addErrorMessage(e.getErrorMessage());
		}
	    
	  }
	  return emisionContent;
  }


  public String toString()
  {
    return super.toString() + "["+
            "className" + ":" + getClassName()+ "," +
            "templateName" + ":" + getTemplateName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parser" + "=" + (getParser() != null ? !getParser().equals(this)  ? getParser().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "rootToken" + "=" + (getRootToken() != null ? !getRootToken().equals(this)  ? getRootToken().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "emisionContent" + "=" + (getEmisionContent() != null ? !getEmisionContent().equals(this)  ? getEmisionContent().toString().replaceAll("  ","    ") : "this" : "null");
  }
}