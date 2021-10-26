/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import cruise.umple.parser.Position;
import cruise.umple.parser.Token;
import cruise.umple.parser.ErrorMessage;
import java.util.*;

/**
 * Used as a helper class to analyze tokens in a given template
 */
// line 286 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
public class TemplateTokenAnalyzer
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "  StringBuilder spaces =  new StringBuilder();" + NL + "      for(int i=0; i <numSpaces; i++) {" + NL + "          spaces.append(\" \");" + NL + "      }" + NL + "      return spaces.toString();";
  public static final String TEXT_1 = NL + "  string spaces = \"\";" + NL + "      for(int i=0; i <numSpaces; i++) {" + NL + "          spaces+= \" \";" + NL + "      }" + NL + "      return spaces;";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TemplateTokenAnalyzer Attributes
  private UmpleInternalParser parser;
  private UmpleClass currentTemplate;
  private HashMap<String,Boolean> templateAttributes;
  private HashMap<String,Boolean> emitMethods;

  //TemplateTokenAnalyzer Associations
  private List<UmpleClass> templates;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TemplateTokenAnalyzer(UmpleInternalParser aParser)
  {
    parser = aParser;
    templateAttributes = new HashMap<String,Boolean>();
    emitMethods = new HashMap<String,Boolean>();
    templates = new ArrayList<UmpleClass>();
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

  public boolean setCurrentTemplate(UmpleClass aCurrentTemplate)
  {
    boolean wasSet = false;
    currentTemplate = aCurrentTemplate;
    wasSet = true;
    return wasSet;
  }

  public boolean setTemplateAttributes(HashMap<String,Boolean> aTemplateAttributes)
  {
    boolean wasSet = false;
    templateAttributes = aTemplateAttributes;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmitMethods(HashMap<String,Boolean> aEmitMethods)
  {
    boolean wasSet = false;
    emitMethods = aEmitMethods;
    wasSet = true;
    return wasSet;
  }

  public UmpleInternalParser getParser()
  {
    return parser;
  }

  public UmpleClass getCurrentTemplate()
  {
    return currentTemplate;
  }

  public HashMap<String,Boolean> getTemplateAttributes()
  {
    return templateAttributes;
  }

  public HashMap<String,Boolean> getEmitMethods()
  {
    return emitMethods;
  }
  /* Code from template association_GetMany */
  public UmpleClass getTemplate(int index)
  {
    UmpleClass aTemplate = templates.get(index);
    return aTemplate;
  }

  public List<UmpleClass> getTemplates()
  {
    List<UmpleClass> newTemplates = Collections.unmodifiableList(templates);
    return newTemplates;
  }

  public int numberOfTemplates()
  {
    int number = templates.size();
    return number;
  }

  public boolean hasTemplates()
  {
    boolean has = templates.size() > 0;
    return has;
  }

  public int indexOfTemplate(UmpleClass aTemplate)
  {
    int index = templates.indexOf(aTemplate);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTemplates()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addTemplate(UmpleClass aTemplate)
  {
    boolean wasAdded = false;
    if (templates.contains(aTemplate)) { return false; }
    TemplateTokenAnalyzer existingTemplateTokenAnalyzer = aTemplate.getTemplateTokenAnalyzer();
    if (existingTemplateTokenAnalyzer == null)
    {
      aTemplate.setTemplateTokenAnalyzer(this);
    }
    else if (!this.equals(existingTemplateTokenAnalyzer))
    {
      existingTemplateTokenAnalyzer.removeTemplate(aTemplate);
      addTemplate(aTemplate);
    }
    else
    {
      templates.add(aTemplate);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTemplate(UmpleClass aTemplate)
  {
    boolean wasRemoved = false;
    if (templates.contains(aTemplate))
    {
      templates.remove(aTemplate);
      aTemplate.setTemplateTokenAnalyzer(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTemplateAt(UmpleClass aTemplate, int index)
  {  
    boolean wasAdded = false;
    if(addTemplate(aTemplate))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTemplates()) { index = numberOfTemplates() - 1; }
      templates.remove(aTemplate);
      templates.add(index, aTemplate);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTemplateAt(UmpleClass aTemplate, int index)
  {
    boolean wasAdded = false;
    if(templates.contains(aTemplate))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTemplates()) { index = numberOfTemplates() - 1; }
      templates.remove(aTemplate);
      templates.add(index, aTemplate);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTemplateAt(aTemplate, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !templates.isEmpty() )
    {
      templates.get(0).setTemplateTokenAnalyzer(null);
    }
  }

  // line 325 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public EmitResponse getEmisionString(UmpleClass template, TemplateMethodBlock [] templates){
    EmitResponse em = new EmitResponse();
	  if(templates.length == 0 || templates[0].getTemplate().getName().equalsIgnoreCase("*"))
	  {
		for(String key : template.getTemplateEmitStringMap().keySet())
		{
		  EmitResponse val = template.getTemplateEmitStringMap().get(key).getEmissionResponse(template, null);
		  em.getJavaCode().append(val.getJavaCode());
		  em.getCppCode().append(val.getCppCode());	
	    }
	  }
	  else
	  {
		for(TemplateMethodBlock fld : templates)
		{
		  String key = fld.getTemplate().getName();
		  UmpleClass referenceTemplate = fld.getTemplate().getClassName()==null?template:template.getSourceModel().getUmpleClass(fld.getTemplate().getClassName());
		  TemplateAttributeParser val = null;
		  if(referenceTemplate!=null)
		  {
		    val = referenceTemplate.getTemplateEmitStringMap().get(key);
		  }
		  
		  if(val != null && referenceTemplate !=null)
		  {
		    EmitResponse response = val.getEmissionResponse(template,fld);
		    em.getJavaCode().append(response.getJavaCode());
		  	em.getCppCode().append(response.getCppCode());	
		  } 
		  else
		  { 
			String classname = fld.getTemplate().getClassName();
			if(classname == null || classname.length() ==0 ) {
				classname = template.getName();
			}
			parser.getParseResult().setPosition(fld.getPosition());
			parser.getParseResult().addErrorMessage(new ErrorMessage(3502,fld.getPosition(),classname+"."+key));
		  }
		}
	  }
	  return em;
  }

  // line 369 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public TemplateName analyzeTemplateName(Token token){
    if(token!=null)
      {        
        String classname = token.getValue("classname");
		String key = token.getValue("name");
		if(classname == null || classname.length() ==0) {
			classname = currentTemplate.getName();
		}
        TemplateName templateName = new TemplateName(key,classname);
        
        if(!Token.isValidIdentifier(templateName.getName())) {
			parser.getParseResult().setPosition(token.getPosition());
			parser.getParseResult().addErrorMessage(new ErrorMessage(3500,token.getPosition(),templateName.getName()));
		}
        
	  	Token templateParameters = token.getSubToken("templateParameters");
	  	if(templateParameters!=null)
		{
          for(Token parameterNameToken: templateParameters.getSubTokens())
		  {
		    if(parameterNameToken.is("parameter"))
		    {
		      templateName.addParameter(parameterNameToken.getValue());
		    }
		  }
		}
        return templateName;
      }
      else
      {
        return null;
      }
  }

  // line 423 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public void analyzeEmitMethodDeclarator(Token token){
    Method aMethod = new Method("","","",false);
		TemplateMethod tMethod = new TemplateMethod(aMethod);
    	aMethod.setPosition(token.getPosition());
    	aMethod.setEndPosition(token.getEndPosition());
		
    	for(Token emitToken : token.getSubTokens()) {
    		if (emitToken.is("modifier")) {
    			aMethod.setModifier(emitToken.getValue());
    		}
    		if (emitToken.is("templateName")) {
    	      TemplateName templateNameObject = analyzeTemplateName(emitToken);
			  if(templateNameObject != null) {
				String templateNameValue = templateNameObject.getName(); 
				TemplateMethodBlock templateMethodBlock = new TemplateMethodBlock(emitToken.getSubToken("name").getPosition(),templateNameObject);
				for(String parameter:templateNameObject.getParameters())
				{
				  templateMethodBlock.addParameter(parameter);
				}
				tMethod.addTemplate(templateMethodBlock);
			  }
			}
    		if (emitToken.is("methodDeclarator")) {
    			for(Token methodToken : emitToken.getSubTokens())
    			{
    				if (methodToken.is("methodName"))
    				{
    					String mName = methodToken.getValue();
    					aMethod.setName(mName);
    					aMethod.setType("String");
    					
    					if(emitMethods.containsKey(mName)) {
    				  		parser.getParseResult().setPosition(methodToken.getPosition());
    						parser.getParseResult().addErrorMessage(new ErrorMessage(3507,methodToken.getPosition(),currentTemplate.getName(),mName));
    				  	}
    					emitMethods.put(mName, true);
    				  	
    					if (methodToken.getValue().equals("main"))
    					{
    						parser.getParseResult().setPosition(methodToken.getPosition());
    						parser.getParseResult().addErrorMessage(new ErrorMessage(3501,token.getPosition()));
    					}
    				}
    				if (methodToken.is("parameterList"))
    				{
    					for(Token parameterToken : methodToken.getSubTokens())
    					{
    						boolean isList = false;
    						if (parameterToken.is("parameter"))
    						{
    							String paramType="";
    							if (parameterToken.getSubToken("type") != null)
    							{
    								paramType = parameterToken.getSubToken("type").getValue();
    							}
    							if (parameterToken.getSubToken("list") != null)
    							{
    								isList = parameterToken.getSubToken("list").getValue() != null;        
    							}	

    							String paramName = parameterToken.getSubToken("name").getValue();
    							MethodParameter aParameter  = new MethodParameter(paramName,paramType,null,null, false);
    							aParameter.setIsList(isList);
    							aMethod.addMethodParameter(aParameter);
    						}
    					}
    				}
    			}
    		}
    	}
    	currentTemplate.addEmitMethod(tMethod);
  }

  // line 546 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public void initializeCreateSpaceMethod(UmpleClass template, Method placeHolderMth){
    Method aMethod = new Method("","","",false);
      aMethod.setModifier("private");    	 
      aMethod.setName("_createSpacesString");
      aMethod.setType("String");
      
      aMethod.setPosition(placeHolderMth.getPosition());
      aMethod.setEndPosition(placeHolderMth.getEndPosition());
      
      MethodParameter spacesParameter = new MethodParameter("numSpaces","int",null,null, false);
      spacesParameter.setIsList(false);
      aMethod.addMethodParameter(spacesParameter);
      CodeBlock cb = new CodeBlock();
      cb.setCode("Java", createSpaceStringMethodBody("Java"));
	  cb.setCode("Cpp", createSpaceStringMethodBody("Cpp"));
	  MethodBody methBody = new MethodBody(cb);
	  aMethod.setMethodBody(methBody);
      template.addMethod(aMethod);
  }

  // line 566 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public void initializeNL(UmpleClass template){
    if(template.getAttribute(Utils.getLineSeparator()) == null) {
		  CodeBlock cb = new CodeBlock();
		  cb.setCode("Java", Utils.getLineSeparatorValue("Java"));
		  cb.setCode("Cpp", Utils.getLineSeparatorValue("Cpp"));
		  Attribute aField = new Attribute(Utils.getLineSeparator(),"String","const","",false,template);
		  aField.setCodeblock(cb);
		  template.addAttribute(aField);
	  }
  }

  // line 577 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public String createSecondaryMethod(UmpleClass template, Method mth, EmitResponse emitResp){
    String methodName = "_"+mth.getName();
		StringBuilder paramSignature = new StringBuilder("0,sb");
		Method aMethod = new Method("","","",false);
    	aMethod.setPosition(mth.getPosition());
    	aMethod.setEndPosition(mth.getEndPosition());
    	aMethod.setModifier(mth.getModifier());
    	 
    	aMethod.setName(methodName);
    	aMethod.setType("StringBuilder");
    	
    	MethodParameter numSpaceParameter = new MethodParameter("numSpaces","Integer",null,null, false);
    	numSpaceParameter.setIsList(false);
    	
    	aMethod.addMethodParameter(numSpaceParameter);
    	
    	MethodParameter stringBuilderParameter  = new MethodParameter("sb","StringBuilder",null,null, false);
    	stringBuilderParameter.setIsList(false);
    	
    	aMethod.addMethodParameter(stringBuilderParameter);
    	
    	for( MethodParameter aParameter : mth.getMethodParameters()) {
    		MethodParameter param  = new MethodParameter(aParameter.getName(),aParameter.getType(),null,null, false);
    		param.setIsList(aParameter.getIsList());
    		aMethod.addMethodParameter(param);
    		paramSignature.append(",");
    		paramSignature.append(aParameter.getName());
    	}
    	

		CodeBlock cb = new CodeBlock();
		cb.setCode("Java", Utils.getMethodTemplateFormatter("Java").getSecondaryEmitMethodBody(emitResp));
        cb.setCode("Cpp", Utils.getMethodTemplateFormatter("Cpp").getSecondaryEmitMethodBody(emitResp));
            
		MethodBody methBody = new MethodBody(cb);
		aMethod.setMethodBody(methBody);
		template.addMethod(aMethod);
		return paramSignature.toString();
  }

  // line 617 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
   private boolean recursiveIncludeTemplateElementCycleCheck(UmpleClass template, TemplateAttributeParser ref, HashMap<String,Boolean> map){
    boolean ret = true;
		if(map == null) {
			map = new HashMap<String,Boolean>();
		}
		for (TemplateElement templateElement : ref.getElements()) {
			if(templateElement instanceof IncludeTemplateElement) {
				IncludeTemplateElement incElm = (IncludeTemplateElement) templateElement; 
				String classname = incElm.getTemplateName().getClassName();
				String refName = incElm.getTemplateName().getName();
				if(classname == null || classname.length() == 0) {
					classname = template.getName();
				}
				String key = classname + "." + refName;
				UmpleClass referenceTemplate = incElm.getTemplateName().getClassName()==null?template:template.getSourceModel().getUmpleClass(classname);
				if(referenceTemplate != null) {

					TemplateAttributeParser refValue = null;
					if(referenceTemplate!=null)
					{
						refValue = referenceTemplate.getTemplateEmitStringMap().get(refName);
					}
					if(refValue == null) {
						parser.getParseResult().setPosition(incElm.getPosition());
						parser.getParseResult().addErrorMessage(new ErrorMessage(3504, incElm.getPosition(),key));
					} else {
						if(map.containsKey(key))
							return false;
						map.put(key, true);
						ret = recursiveIncludeTemplateElementCycleCheck(referenceTemplate, refValue, map);
						if(!ret)
							break;
						map.remove(key);
					}
				}
			}

		}	
		return ret;
  }

  // line 659 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
   private boolean recursiveCycleCheck(UmpleClass template){
    boolean ret = true;
		for(TemplateMethod tMth : template.getEmitMethods()) {
			for(TemplateMethodBlock fld : tMth.getTemplates())
			{
				String name = fld.getTemplate().getName();
				UmpleClass parentTemplate = fld.getTemplate().getClassName()==null?template:template.getSourceModel().getUmpleClass(fld.getTemplate().getClassName());
				String key = parentTemplate.getName() + "." + name;
				TemplateAttributeParser val = null;
				if(parentTemplate!=null)
				{
					val = parentTemplate.getTemplateEmitStringMap().get(name);
				}
				if(val != null && parentTemplate !=null)
				{
					for (TemplateElement templateElement : val.getElements()) {
						if(templateElement instanceof IncludeTemplateElement) {
							IncludeTemplateElement incElm = (IncludeTemplateElement) templateElement; 
							String classname = incElm.getTemplateName().getClassName();
							String refName = incElm.getTemplateName().getName();
							UmpleClass referenceTemplate = incElm.getTemplateName().getClassName()==null?parentTemplate:parentTemplate.getSourceModel().getUmpleClass(classname);
							String refKey = referenceTemplate.getName() + "." + refName;

							TemplateAttributeParser refValue = null;
							if(referenceTemplate!=null)
							{
								refValue = referenceTemplate.getTemplateEmitStringMap().get(refName);
							}

							HashMap<String, Boolean> map = new HashMap<String,Boolean>();
							map.put(key, true);
							
							if (refValue != null)
							{
								boolean check = recursiveIncludeTemplateElementCycleCheck(referenceTemplate, refValue, map);
								
								if(!check) {
									parser.getParseResult().setPosition(incElm.getPosition());
									parser.getParseResult().addErrorMessage(new ErrorMessage(3505,incElm.getPosition(),name,refKey));
									ret = false;
								}
							}
						}
					}	
				} 			  
			}
		}
		return ret;
  }


  /**
   * Analyzer Events
   */
  // line 711 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  public void done(){
    for(UmpleClass template : getTemplates()) {
			if(!recursiveCycleCheck(template))
				continue;
			String defaultGenerate = this.getParser().getModel().getDefaultGenerate();
			if(template.numberOfEmitMethods() > 0) {
				TemplateMethod tMth = template.getEmitMethod(0);
				Method mth = tMth.getMethod();
				initializeCreateSpaceMethod(template, mth);
				if(defaultGenerate == null 
					|| "Java".equalsIgnoreCase(defaultGenerate)) {
					template.addDepend(new Depend("java.util.regex.Pattern"));
				}
			}
			
			for(TemplateMethod tMth : template.getEmitMethods()) {
				Method mth = tMth.getMethod();
				EmitResponse emitResp = getEmisionString(template, tMth.getTemplates());
			
				String params = createSecondaryMethod(template, mth, emitResp);
				String primaryMethodName = "_"+mth.getName();
				        	    
        	    CodeBlock cb = new CodeBlock();
        	    
				cb.setCode("Java", Utils.getMethodTemplateFormatter("Java").getPrimaryEmitMethodBody(primaryMethodName, params));
        	    cb.setCode("Cpp", Utils.getMethodTemplateFormatter("Cpp").getPrimaryEmitMethodBody(primaryMethodName, params));            
				MethodBody methBody = new MethodBody(cb);
				mth.setMethodBody(methBody);
				template.addMethod(mth);
			}
			if(template.numberOfTemplateFields() > 0) {
				initializeNL(template);
			}
			for(TemplateField fld : template.getTemplateFields()) {
				CodeBlock cb = new CodeBlock();
    			cb.setCode("Java", fld.getValue().getJavaCode().toString());
	    		cb.setCode("Cpp", fld.getValue().getCppCode().toString());
				Attribute aField = new Attribute(fld.getName(),"String","const","",false,template);
				aField.setCodeblock(cb);
				template.addAttribute(aField);
			}
		}
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _createSpaceStringMethodBody(Integer numSpaces, StringBuilder sb, String lang){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    if(lang.equalsIgnoreCase("Java")) {
    realSb.append(TEXT_0);
    } else if(lang.equalsIgnoreCase("Cpp")) {
    realSb.append(TEXT_1);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String createSpaceStringMethodBody(String lang){
        StringBuilder sb = new StringBuilder();
    return this._createSpaceStringMethodBody(0,sb,lang).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "parser" + "=" + (getParser() != null ? !getParser().equals(this)  ? getParser().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "currentTemplate" + "=" + (getCurrentTemplate() != null ? !getCurrentTemplate().equals(this)  ? getCurrentTemplate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "templateAttributes" + "=" + (getTemplateAttributes() != null ? !getTemplateAttributes().equals(this)  ? getTemplateAttributes().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "emitMethods" + "=" + (getEmitMethods() != null ? !getEmitMethods().equals(this)  ? getEmitMethods().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 304 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  void prepare (final Token token) 
  {
    String templateName = token.getValue("name");
		/*
		AnalysisTaskExecuter.run(new AnalysisParserTask(parser,token,3500, templateName ) {
    		public Boolean analyze() {
    			if(!Token.isValidIdentifier(token.getValue("name"))){
    				return false;
    			}
    			return true;
    		}    		
    	});
    	*/
		templateAttributes.clear();
		emitMethods.clear();
    	currentTemplate = parser.getModel().getUmpleClass(templateName);
    	if(currentTemplate != null) {
    		addTemplate(currentTemplate);
    	}
  }

// line 402 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  void analyzeEmission (final Token token) 
  {
    Token nameToken = token.getSubToken("templateName");
        TemplateName templateNameObject = analyzeTemplateName(nameToken);
	  	String templateName = templateNameObject.getName();
	  	Token templateContent = token.getSubToken("templateAttribute");
	  	if(templateAttributes.containsKey(templateName)) {
	  		parser.getParseResult().setPosition(nameToken.getPosition());
			parser.getParseResult().addErrorMessage(new ErrorMessage(3506,nameToken.getPosition(),currentTemplate.getName(),templateName));
	  	}
	  	templateAttributes.put(templateName, true);
		TemplateAttributeParser emitter = new TemplateAttributeParser(parser, currentTemplate.getName(), templateName, templateContent);
		for(String parameter: templateNameObject.getParameters())
		{
		  emitter.addParameterName(parameter);			  		  
		}
		emitter.parse();
		currentTemplate.getTemplateEmitStringMap().put(templateNameObject.getName(), emitter);
  }

// line 496 "../../../../src/UmpleInternalParser_CodeTemplate.ump"
  void analyze (final Token token) 
  {
    // Validated in other class analysis passes 
		/*
		template.addPosition(token.getPosition());
    	template.addEndPosition(token.getEndPosition());
    	
    	AnalysisTaskExecuter.run(new AnalysisParserTask(parser,token,0, "Unable to make template abstract!") {  
    		public Boolean analyze() {
    			if(token.getValue("abstract") != null) {
    				return template.setIsAbstract(true);
    			}
    			return true;
    		}    		
    	});
    	AnalysisTaskExecuter.run(new AnalysisParserTask(parser,token,0, "Unable to make template singleton!") { 
    		public Boolean analyze() {
    			if(token.getValue("singleton") != null) {
    				return template.setIsSingleton(true);
    			}
    			return true;
    		}    		
    	});
    	AnalysisTaskExecuter.run(new AnalysisParserTask(parser, token,14, token.getName()) { 
    		public Boolean analyze() {
    			if(token.getValue("immutable") != null) {
    				return template.setImmutable();
    			}
    			return true;
    		}    		
    	});
      	*/
  }

  
}