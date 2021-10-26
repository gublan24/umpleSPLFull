/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import cruise.umple.core.GenerationPolicyRegistry;
import java.util.stream.Collectors;
import cruise.umple.cpp.utils.StringUtil;
import cruise.umple.modeling.handlers.IModelingConstants;
import cruise.umple.core.Generator;
import cruise.umple.modeling.handlers.IModelingElementDefinitions;
import cruise.umple.modeling.handlers.IStructureConstants;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Statemachine-specific
 * STL-specific
 * Test-specifid
 * Umple-specific
 */
// line 247 "../../../../../UmpleTLTemplates/Core.ump"
// line 1473 "../../../../../UmpleTLTemplates/Core.ump"
// line 1524 "../../../../../UmpleTLTemplates/Core.ump"
// line 1672 "../../../../../UmpleTLTemplates/Core.ump"
// line 1679 "../../../../../UmpleTLTemplates/Core.ump"
// line 1692 "../../../../../UmpleTLTemplates/Core.ump"
// line 1733 "../../../../../UmpleTLTemplates/Core.ump"
// line 351 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
// line 439 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
public class GenerationTemplate
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String BACK_SLASH = "\\";
  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "if(";
  public static final String TEXT_1 = "){" + NL;
  public static final String TEXT_2 = NL + "}";
  public static final String TEXT_3 = "//No Implementation in this context";
  public static final String TEXT_4 = "return ";
  public static final String TEXT_5 = ";";
  public static final String TEXT_6 = "if(";
  public static final String TEXT_7 = "!(";
  public static final String TEXT_8 = ")";
  public static final String TEXT_9 = "){";
  public static final String TEXT_10 = NL + "}";
  public static final String TEXT_11 = " ";
  public static final String TEXT_12 = "= ";
  public static final String TEXT_13 = ";";
  public static final String TEXT_14 = " != ";
  public static final String TEXT_15 = "->";
  public static final String TEXT_16 = ".";
  public static final String TEXT_17 = ";";
  public static final String TEXT_18 = "*";
  public static final String TEXT_19 = " ";
  public static final String TEXT_20 = "(";
  public static final String TEXT_21 = ")";
  public static final String TEXT_22 = ";";
  public static final String TEXT_23 = "//TODO Add code body to ";
  public static final String TEXT_24 = "//#define ";
  public static final String TEXT_25 = " ";
  public static final String TEXT_26 = NL;
  public static final String TEXT_27 = "=";
  public static final String TEXT_28 = "case ";
  public static final String TEXT_29 = ": return \"";
  public static final String TEXT_30 = "\";";
  public static final String TEXT_31 = "if(";
  public static final String TEXT_32 = "!= ";
  public static final String TEXT_33 = "::NIL){" + NL;
  public static final String TEXT_34 = "H = ";
  public static final String TEXT_35 = ";" + NL + "}";
  public static final String TEXT_36 = "set";
  public static final String TEXT_37 = NL + "Thread::sleep(1);" + NL;
  public static final String TEXT_38 = "get";
  public static final String TEXT_39 = "FullName";
  public static final String TEXT_40 = "string answer = ";
  public static final String TEXT_41 = ";";
  public static final String TEXT_42 = NL;
  public static final String TEXT_43 = "";
  public static final String TEXT_44 = NL + "return answer;" + NL;
  public static final String TEXT_45 = NL + "if (";
  public static final String TEXT_46 = " != ";
  public static final String TEXT_47 = "::NIL) { " + NL + "answer += \".\" + ";
  public static final String TEXT_48 = "; " + NL + "}" + NL;
  public static final String TEXT_49 = "(";
  public static final String TEXT_50 = "::";
  public static final String TEXT_51 = ");";
  public static final String TEXT_52 = "exit";
  public static final String TEXT_53 = "enter";
  public static final String TEXT_54 = "();";
  public static final String TEXT_55 = "wasEventProcessed= ";
  public static final String TEXT_56 = "()";
  public static final String TEXT_57 = ";";
  public static final String TEXT_58 = "    " + NL + "enum ";
  public static final String TEXT_59 = " { ";
  public static final String TEXT_60 = " };" + NL;
  public static final String TEXT_61 = "::";
  public static final String TEXT_62 = "bool wasEventProcessed = false;" + NL;
  public static final String TEXT_63 = NL + "return wasEventProcessed;" + NL;
  public static final String TEXT_64 = "    " + NL + "void ";
  public static final String TEXT_65 = "(";
  public static final String TEXT_66 = " a";
  public static final String TEXT_67 = ");" + NL;
  public static final String TEXT_68 = "    " + NL + "bool ";
  public static final String TEXT_69 = "();" + NL;
  public static final String TEXT_70 = "    " + NL + "bool ";
  public static final String TEXT_71 = "(){" + NL + "bool wasEventProcessed = false;" + NL;
  public static final String TEXT_72 = NL + "return wasEventProcessed;" + NL + "}" + NL;
  public static final String TEXT_73 = "  " + NL + "switch((int)";
  public static final String TEXT_74 = "){";
  public static final String TEXT_75 = NL + NL + "    default:" + NL + "        // Other states do respond to this event" + NL + "        break;" + NL + "}" + NL + NL;
  public static final String TEXT_76 = "if(";
  public static final String TEXT_77 = "== ";
  public static final String TEXT_78 = "::";
  public static final String TEXT_79 = "){" + NL;
  public static final String TEXT_80 = "(";
  public static final String TEXT_81 = "::";
  public static final String TEXT_82 = ");" + NL + "}" + NL;
  public static final String TEXT_83 = "// entry actions and do activities";
  public static final String TEXT_84 = "Thread";
  public static final String TEXT_85 = "* thisPtr = static_cast<";
  public static final String TEXT_86 = "*>(thisVoidPtr);" + NL + "thisPtr->";
  public static final String TEXT_87 = "();";
  public static final String TEXT_88 = "doActivity";
  public static final String TEXT_89 = "this->";
  public static final String TEXT_90 = " = new Thread(&";
  public static final String TEXT_91 = "::";
  public static final String TEXT_92 = ", this, \"";
  public static final String TEXT_93 = "\");" + NL + "this->";
  public static final String TEXT_94 = "->start();" + NL;
  public static final String TEXT_95 = "{" + NL;
  public static final String TEXT_96 = NL + "}";
  public static final String TEXT_97 = NL + "if (";
  public static final String TEXT_98 = " != NULL) { " + NL;
  public static final String TEXT_99 = "->stop(); " + NL + "}";
  public static final String TEXT_100 = " a";
  public static final String TEXT_101 = "= ";
  public static final String TEXT_102 = ";";
  public static final String TEXT_103 = "    " + NL;
  public static final String TEXT_104 = " a";
  public static final String TEXT_105 = "= ";
  public static final String TEXT_106 = ";" + NL;
  public static final String TEXT_107 = NL + "case ";
  public static final String TEXT_108 = "::";
  public static final String TEXT_109 = ":" + NL;
  public static final String TEXT_110 = NL + "    break;" + NL + NL;
  public static final String TEXT_111 = "wasEventProcessed = true;";
  public static final String TEXT_112 = "new time_t(time(NULL))";
  public static final String TEXT_113 = "new tm(*localtime(&t))";
  public static final String TEXT_114 = "ParseDate(";
  public static final String TEXT_115 = ")";
  public static final String TEXT_116 = "ParseTime(";
  public static final String TEXT_117 = ")";
  public static final String TEXT_118 = "time_t t(time(NULL));   //current time";
  public static final String TEXT_119 = NL + "#ifndef ";
  public static final String TEXT_120 = "_H" + NL + "#define ";
  public static final String TEXT_121 = "_H" + NL + NL + "#ifdef PRAGMA" + NL + "#pragma once" + NL + "#ifndef _MSC_VER" + NL + "#pragma interface \"";
  public static final String TEXT_122 = ".h\"" + NL + "#endif" + NL + "#endif" + NL;
  public static final String TEXT_123 = NL + NL + "void ";
  public static final String TEXT_124 = "(){" + NL + NL;
  public static final String TEXT_125 = NL + "}" + NL + NL + "#endif" + NL;
  public static final String TEXT_126 = "assert(";
  public static final String TEXT_127 = "->";
  public static final String TEXT_128 = "(";
  public static final String TEXT_129 = ")";
  public static final String TEXT_130 = "==";
  public static final String TEXT_131 = " ";
  public static final String TEXT_132 = ");";
  public static final String TEXT_133 = "->";
  public static final String TEXT_134 = "(";
  public static final String TEXT_135 = ")";
  public static final String TEXT_136 = ";";
  public static final String TEXT_137 = "this->";
  public static final String TEXT_138 = "= ";
  public static final String TEXT_139 = "();" + NL + "wasReset = true;";
  public static final String TEXT_140 = "if(!this->";
  public static final String TEXT_141 = ") { " + NL + "  return false; " + NL + "}" + NL + "this->";
  public static final String TEXT_142 = "= false;";
  public static final String TEXT_143 = "* ";
  public static final String TEXT_144 = ";" + NL + "if((*this).contains(\"port\")) {" + NL + "  ";
  public static final String TEXT_145 = "= new ";
  public static final String TEXT_146 = "((unsigned int)(*this)[\"port\"]";
  public static final String TEXT_147 = ", ";
  public static final String TEXT_148 = ");" + NL + "}else if ( (*this).contains(\"endpoint\")) {" + NL + "  ";
  public static final String TEXT_149 = "= new ";
  public static final String TEXT_150 = "((Endpoint)(*this)[\"endpoint\"]";
  public static final String TEXT_151 = ", ";
  public static final String TEXT_152 = ");" + NL + "}else {" + NL + "  ";
  public static final String TEXT_153 = "= new ";
  public static final String TEXT_154 = "(";
  public static final String TEXT_155 = ");" + NL + "}" + NL;
  public static final String TEXT_156 = NL + "return ";
  public static final String TEXT_157 = ";" + NL;
  public static final String TEXT_158 = "if((*this).contains(\"port\")){" + NL + "  ";
  public static final String TEXT_159 = " ";
  public static final String TEXT_160 = "((unsigned int)(*this)[\"port\"]";
  public static final String TEXT_161 = ", ";
  public static final String TEXT_162 = ");" + NL + "  ";
  public static final String TEXT_163 = NL + "  return ";
  public static final String TEXT_164 = ";" + NL + "}else if ((*this).contains(\"endpoint\")){" + NL + "  ";
  public static final String TEXT_165 = " ";
  public static final String TEXT_166 = "((Endpoint)(*this)[\"endpoint\"]";
  public static final String TEXT_167 = ", ";
  public static final String TEXT_168 = ");" + NL + "  ";
  public static final String TEXT_169 = NL + "  return ";
  public static final String TEXT_170 = ";" + NL + "}else {" + NL + "  ";
  public static final String TEXT_171 = " ";
  public static final String TEXT_172 = "(";
  public static final String TEXT_173 = ")";
  public static final String TEXT_174 = ";" + NL + "  ";
  public static final String TEXT_175 = NL + "  return ";
  public static final String TEXT_176 = ";" + NL + "}";
  public static final String TEXT_177 = " event ";
  public static final String TEXT_178 = "case ";
  public static final String TEXT_179 = "::";
  public static final String TEXT_180 = "_";
  public static final String TEXT_181 = ":" + NL + "  if(sizeof(msg->data) >= sizeof(";
  public static final String TEXT_182 = ")) {" + NL + "    " + NL + "  ";
  public static final String TEXT_183 = " data = *((";
  public static final String TEXT_184 = "*) msg->data);" + NL + "    ";
  public static final String TEXT_185 = "_event.publish(data);" + NL + "  } else {" + NL + "    throw \"Bad port data\";" + NL + "  }" + NL + "  break;" + NL;
  public static final String TEXT_186 = NL + "  public:" + NL + "    ";
  public static final String TEXT_187 = NL + "    " + NL + "    //------------------------" + NL + "    // CONSTRUCTOR" + NL + "    //------------------------" + NL + "    ";
  public static final String TEXT_188 = "_PortProtocol();" + NL + "  " + NL + "    //------------------------" + NL + "    // DESTRUCTOR" + NL + "    //------------------------" + NL + "    virtual ~";
  public static final String TEXT_189 = "_PortProtocol();" + NL + NL + "    string get";
  public static final String TEXT_190 = "EventFullName(void);" + NL + "    " + NL;
  public static final String TEXT_191 = NL + NL + "  private:" + NL + "      " + NL + "    ";
  public static final String TEXT_192 = " ";
  public static final String TEXT_193 = ";" + NL + "    ";
  public static final String TEXT_194 = " ";
  public static final String TEXT_195 = ";" + NL + "    MessageService* service;" + NL + "      " + NL + "    void sendMessage(short int portId,short int evtId, int size, void* data);" + NL + "    void receive_";
  public static final String TEXT_196 = "_PortProtocol_Message(const MessageHeader* msg);" + NL + NL;
  public static final String TEXT_197 = NL + "  #define ";
  public static final String TEXT_198 = "_BODY" + NL + NL + "  #if defined( PRAGMA ) && ! defined( PRAGMA_IMPLEMENTED )" + NL + "  #pragma implementation <";
  public static final String TEXT_199 = ".h>" + NL + "  #endif" + NL + "  ";
  public static final String TEXT_200 = NL + "  ";
  public static final String TEXT_201 = "";
  public static final String TEXT_202 = NL + "  //------------------------" + NL + "  // CONSTRUCTOR IMPLEMENTATION" + NL + "  //------------------------" + NL + "  ";
  public static final String TEXT_203 = "_PortProtocol::";
  public static final String TEXT_204 = "_PortProtocol() {" + NL + "    service = new MessageService(this, &";
  public static final String TEXT_205 = "_PortProtocol::receive_";
  public static final String TEXT_206 = "_PortProtocol_Message);" + NL + "  }" + NL + "      " + NL + "  ";
  public static final String TEXT_207 = "_PortProtocol::~";
  public static final String TEXT_208 = "_PortProtocol() {" + NL + "    delete service;" + NL + "  }" + NL + NL + "  string ";
  public static final String TEXT_209 = "_PortProtocol::get";
  public static final String TEXT_210 = "EventFullName(void){" + NL + "    string answer = ";
  public static final String TEXT_211 = "_Event;" + NL + "    return answer;" + NL + "  }" + NL + "      " + NL + "  ";
  public static final String TEXT_212 = NL + NL + "  void ";
  public static final String TEXT_213 = "_PortProtocol::sendMessage(short int portId,short int evtId, int size, void* data) {" + NL + "    MessageHeader* msg = service->getBufferedMessage();" + NL + "    if (msg!=NULL) {" + NL + "      msg->portId = portId;" + NL + "      msg->eventId = evtId;" + NL + "      if (size>0 && data!=NULL) {" + NL + "        msg->data = malloc(size);" + NL + "           memcpy(msg->data, data, size);" + NL + "      }" + NL + "      service->push(msg);" + NL + "    }" + NL + "  }" + NL + "      " + NL + "  void ";
  public static final String TEXT_214 = "_PortProtocol::receive_";
  public static final String TEXT_215 = "_PortProtocol_Message(const MessageHeader* msg){" + NL + "    switch(msg->eventId){" + NL + "  ";
  public static final String TEXT_216 = NL + NL + "      default:" + NL + "        break;" + NL + "    }" + NL + "  }" + NL + "  ;  " + NL + "  ";
  public static final String TEXT_217 = NL;
  public static final String TEXT_218 = "  ";
  public static final String TEXT_219 = " = ";
  public static final String TEXT_220 = "::";
  public static final String TEXT_221 = ";" + NL;
  public static final String TEXT_222 = "  ";
  public static final String TEXT_223 = " = ";
  public static final String TEXT_224 = "::";
  public static final String TEXT_225 = "_";
  public static final String TEXT_226 = ";" + NL + "sendMessage(";
  public static final String TEXT_227 = "::";
  public static final String TEXT_228 = ",";
  public static final String TEXT_229 = "::";
  public static final String TEXT_230 = "_";
  public static final String TEXT_231 = ", sizeof(";
  public static final String TEXT_232 = "), &data);";
  public static final String TEXT_233 = " = ";
  public static final String TEXT_234 = "->";
  public static final String TEXT_235 = ".";
  public static final String TEXT_236 = ".subscribe(";
  public static final String TEXT_237 = ", &";
  public static final String TEXT_238 = "::";
  public static final String TEXT_239 = ");";
  public static final String TEXT_240 = ".";
  public static final String TEXT_241 = ".disconnect(";
  public static final String TEXT_242 = ");";
  public static final String TEXT_243 = ".";
  public static final String TEXT_244 = "(data);";
  public static final String TEXT_245 = "this->initPortConnections();";
  public static final String TEXT_246 = "this->disconnectPortConnections();";
  public static final String TEXT_247 = " = ";
  public static final String TEXT_248 = ".";
  public static final String TEXT_249 = ".subscribe(this, &";
  public static final String TEXT_250 = "::";
  public static final String TEXT_251 = ");";
  public static final String TEXT_252 = "Event<void, ";
  public static final String TEXT_253 = "> ";
  public static final String TEXT_254 = ";";
  public static final String TEXT_255 = "//Composite structure variables";
  public static final String TEXT_256 = NL + "#ifndef ";
  public static final String TEXT_257 = "_H" + NL + "#define ";
  public static final String TEXT_258 = "_H" + NL + NL + "#ifdef PRAGMA" + NL + "#pragma once" + NL + "#ifndef _MSC_VER" + NL + "#pragma interface \"";
  public static final String TEXT_259 = ".h\"" + NL + "#endif" + NL + "#endif" + NL + NL;
  public static final String TEXT_260 = NL;
  public static final String TEXT_261 = " {" + NL;
  public static final String TEXT_262 = NL + "};" + NL;
  public static final String TEXT_263 = NL + NL + "#endif" + NL;
  public static final String TEXT_264 = "//Message descriptor for ";
  public static final String TEXT_265 = "msg->";
  public static final String TEXT_266 = " = ";
  public static final String TEXT_267 = "->";
  public static final String TEXT_268 = "();";
  public static final String TEXT_269 = "->";
  public static final String TEXT_270 = "(msg->";
  public static final String TEXT_271 = ");";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenerationTemplate Attributes
  private GenerationPolicyRegistry g;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenerationTemplate(GenerationPolicyRegistry aG)
  {
    g = aG;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public GenerationPolicyRegistry getG()
  {
    return g;
  }

  public void delete()
  {}

  // line 259 "../../../../../UmpleTLTemplates/Core.ump"
  public String join(String id, Object... element){
    return this.getG().getValues(id, element).stream().map(Object::toString).collect(Collectors.joining("\n"));
  }

  // line 263 "../../../../../UmpleTLTemplates/Core.ump"
  public String string(String id, Object element){
    return this.getG().getString(element, id);
  }

  // line 1711 "../../../../../UmpleTLTemplates/Core.ump"
  public String testFileStart(Object element, String startContents, String testFile, String testMethod){
    String copyRight= ""; //this.getG().getString(element, IModelingConstants.COPY_RIGHT);
		String fullName= testFile.toUpperCase();
		
		return this.testFileStart(copyRight, fullName, testFile, startContents, testMethod);
  }

  // line 1736 "../../../../../UmpleTLTemplates/Core.ump"
  public String resetName(String name){
    return "reset"+ StringUtil.firstCharacterToUpperCase(name, true);
  }

  // line 1740 "../../../../../UmpleTLTemplates/Core.ump"
  public String defaultName(String name){
    return "getDefault"+ StringUtil.firstCharacterToUpperCase(name, true);
  }

  // line 1744 "../../../../../UmpleTLTemplates/Core.ump"
  public String nextName(String name){
    return "next"+ StringUtil.firstCharacterToUpperCase(name, true);
  }

  // line 445 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portEventEnumDescription(String direction, String portName){
    String directionString= "OUT".equals(direction)? "Output": "In";
		String directionToOrFrom= ("OUT".equals(direction)? "from": "to")+ " "+ portName;
		return this._portEventEnumDescription(directionString, directionToOrFrom);
  }

  // line 462 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portProtocolImplementationEventCase(Object element, String portName, String direction, String type){
    String portEventType= this.getG().generate(Generator.PORT_EVENT_TYPE, element);
		
		return this.portProtocolImplementationEventCase(portEventType, direction, portName, type);
  }

  // line 497 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portProtocolHeaderContents(Object element){
    String name= this.getG().getString(element, IModelingElementDefinitions.NAME);
		
		String portEventAttributes= this.getG().generationPointString(element, IStructureConstants.PORT_EVENT_IMPLEMENTATIONS_ATTRIBUTES);
		String portEventDeclarations= this.getG().generationPointString(element, IStructureConstants.PORT_EVENT_DECLARATIONS);
		
		return this.portProtocolHeaderContents(element, name, portEventAttributes, portEventDeclarations);
  }

  // line 571 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portEventType(String name){
    return name+ "_Event";
  }

  // line 575 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portEventType(Object port){
    return this.portEventType(this.getG().getString(port, IModelingElementDefinitions.NAME));
  }

  // line 579 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portEventName(String name){
    return StringUtil.firstCharacterToLowerCase(name)+ "_Event";
  }

  // line 583 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portEventName(Object port){
    return this.portEventName(this.getG().getString(port, IModelingElementDefinitions.NAME));
  }

  // line 587 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portType(Object port){
    return this.portType(this.getG().getString(port, IModelingElementDefinitions.NAME));
  }

  // line 591 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portType(String name){
    return name+ "_Port";
  }

  // line 595 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portName(Object port){
    return this.portName(this.getG().getString(port, IModelingElementDefinitions.NAME));
  }

  // line 599 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portName(String name){
    return StringUtil.firstCharacterToLowerCase(name)+ "_Port";
  }

  // line 603 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portProtocolHandleDefaultName(String portName){
    return portName+ "_Handle";
  }

  // line 607 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portProtocolHandleBindingDefaultName(String portName){
    return portName+ "_BindingHandle";
  }

  // line 611 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portProtocolEventDefaultName(String portName){
    return portName+ "_event";
  }

  // line 615 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portProtocolEventReceiveDataMethodName(String portName){
    return "receive_"+ portName + "_Data";
  }

  // line 619 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portProtocolDefaultVariableName(Object element){
    return StringUtil.firstCharacterToLowerCase(this.getG().generate(Generator.PORT_CLASS_NAME, element));
  }

  // line 623 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portClassName(Object element){
    return this.getG().getString(element, IModelingElementDefinitions.NAME)+ "_PortProtocol";
  }

  // line 627 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portProtocolMessageDescriptorName(String name){
    return name+ "_Message_Descriptor";
  }

  // line 631 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portProtocolMessageDescriptorName(Object element){
    return this.portProtocolMessageDescriptorName(this.getG().getString(element, IModelingElementDefinitions.NAME));
  }

  // line 635 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portProtocolMessageName(String name){
    return name+ "_Message";
  }

  // line 639 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
  public String portProtocolMessageName(Object element){
    return this.portProtocolMessageName(this.getG().getString(element, IModelingElementDefinitions.NAME));
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1162 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String removeInstance(String name){
    return removeInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1166 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String removeInstance(String name, Boolean isRemote){
    String instance= "remove"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1171 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String canSetInstance(String name){
    return "canSet"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1175 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String currentInstance(String name){
    return "current"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1179 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String delegatedParameter(String parameter, String type){
    return parameter + "For"+ StringUtil.firstCharacterToUpperCase(type);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1183 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String verifiedInstance(String name){
    return "verified"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1187 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String removeAtInstance(String name){
    return removeAtInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1191 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String removeAtInstance(String name, Boolean isRemote){
    String instance= "remove"+ StringUtil.firstCharacterToUpperCase(name)+ "At";
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1196 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addAtInstance(String name){
    return addAtInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1200 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addAtInstance(String name, Boolean isRemote){
    String instance= "add"+ StringUtil.firstCharacterToUpperCase(name)+ "At";
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1205 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addOrMoveAtInstance(String name){
    return "addOrMove"+ StringUtil.firstCharacterToUpperCase(name)+ "At";
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1209 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String indexOfInstance(String name){
    return indexOfInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1213 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String indexOfInstance(String name, Boolean isRemote){
    String instance= "indexOf"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1218 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String placeholderInstance(String name){
    return "placeholder"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1222 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String setInstance(String name){
    return setInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1226 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String setInstance(String name, Boolean isRemote){
    String instance= "set"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1231 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String isNewInstance(String name){
    return "isNew"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1235 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String existingInstance(String name){
    return "existing"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1239 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String newMapInstance(String role, String roles){
    return role+ "ToNew"+ StringUtil.firstCharacterToUpperCase(roles);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1243 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String oldInstance(String name){
    return oldInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1247 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String oldInstance(String name, Boolean isMany){
    String base= "old"+ StringUtil.firstCharacterToUpperCase(name);
		if(isMany){
			return base;
		}
		return "an"+ StringUtil.firstCharacterToUpperCase(base);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1255 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String newInstanceInstance(String name){
    return newInstanceInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1259 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String newInstanceInstance(String name, Boolean isMany){
    String base= "new"+ StringUtil.firstCharacterToUpperCase(name);
		if(isMany){
			return base;
		}
		return "a"+ StringUtil.firstCharacterToUpperCase(base);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1267 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String checkNewInstance(String name){
    return "checkNew"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1271 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String variableParameterInstance(String name, boolean isMany){
    return (isMany?"all":"a")+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1275 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String getInstance(String name){
    return getInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1279 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String getInstance(String name, Boolean isRemote){
    String instance= "get"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1284 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String isAInstance(String name){
    return "is"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1288 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String variableInstance(String name){
    return this.variableInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1292 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String variableInstance(String name, boolean isMany){
    String value= StringUtil.firstCharacterToUpperCase(name);
		if(!isMany){
			value= "a"+ value;
		}
		return value;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1300 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String numberOfInstance(String name){
    return numberOfInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1304 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String numberOfInstance(String name, Boolean isRemote){
    String instance= "numberOf"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1309 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String minimumNumberOfInstance(String name){
    return minimumNumberOfInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1313 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String minimumNumberOfInstance(String name, Boolean isRemote){
    String instance= "minimumNumberOf"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1318 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String hasInstance(String name){
    return hasInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1322 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String hasInstance(String name, Boolean isRemote){
    String instance= "has"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1327 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String maximumNumberOfInstance(String name){
    return maximumNumberOfInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1331 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String maximumNumberOfInstance(String name, Boolean isRemote){
    String instance= "maximumNumberOf"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1336 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addInstance(String name){
    return "add"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1340 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addInstance(String name, Boolean isRemote){
    String instance= "add"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1345 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String copyOfInstance(String name){
    return "copyOf"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1349 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String friendSetterInstance(String typeName, String otherEndTypeName){
    return "set"+ StringUtil.firstCharacterToUpperCase(typeName)+ "_"+ StringUtil.firstCharacterToUpperCase(otherEndTypeName);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1353 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String comparatorId(String type, String key){
    return type+ "_"+key+ "_Comparator";
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _safeSet(Integer numSpaces, StringBuilder sb, String value){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
     if(value == null || value.isEmpty()){return sb;}
    realSb.append(value);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String safeSet(String value){
        StringBuilder sb = new StringBuilder();
    return this._safeSet(0,sb,value).toString(); 
  }

  public StringBuilder _safeSetNL(Integer numSpaces, StringBuilder sb, String value){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
     if(value == null || value.isEmpty()){return sb;}
    realSb.append(NL);
    realSb.append(value);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String safeSetNL(String value){
        StringBuilder sb = new StringBuilder();
    return this._safeSetNL(0,sb,value).toString(); 
  }

  public StringBuilder _ifCondition(Integer numSpaces, StringBuilder sb, String condition, String body){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(condition);
    realSb.append(TEXT_1);
    realSb.append(StringUtil.indent(body,1));
    realSb.append(TEXT_2);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String ifCondition(String condition, String body){
        StringBuilder sb = new StringBuilder();
    return this._ifCondition(0,sb,condition,body).toString(); 
  }

  public StringBuilder _nullImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_3);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String nullImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._nullImplementation(0,sb).toString(); 
  }

  public StringBuilder _returnStatement(Integer numSpaces, StringBuilder sb, String statement, boolean wrapped){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_4);
    realSb.append(statement);
    if(!wrapped)
    realSb.append(TEXT_5);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String returnStatement(String statement, boolean wrapped){
        StringBuilder sb = new StringBuilder();
    return this._returnStatement(0,sb,statement,wrapped).toString(); 
  }

  public StringBuilder _ifConditionBlock(Integer numSpaces, StringBuilder sb, String condition, String block, boolean invert){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_6);
    if(invert){
    realSb.append(TEXT_7);
    }
    realSb.append(condition);
    if(invert){
    realSb.append(TEXT_8);
    }
    realSb.append(TEXT_9);
    realSb.append(block);
    realSb.append(TEXT_10);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String ifConditionBlock(String condition, String block, boolean invert){
        StringBuilder sb = new StringBuilder();
    return this._ifConditionBlock(0,sb,condition,block,invert).toString(); 
  }

  public StringBuilder _assignStatement(Integer numSpaces, StringBuilder sb, String left, String right, String type){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    if(type != null && !type.isEmpty()){
    realSb.append(type);
    realSb.append(TEXT_11);
    }
    realSb.append(left);
    realSb.append(TEXT_12);
    realSb.append(right);
    realSb.append(TEXT_13);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String assignStatement(String left, String right, String type){
        StringBuilder sb = new StringBuilder();
    return this._assignStatement(0,sb,left,right,type).toString(); 
  }

  public StringBuilder _notEqual(Integer numSpaces, StringBuilder sb, String left, String right){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(left);
    realSb.append(TEXT_14);
    realSb.append(right);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String notEqual(String left, String right){
        StringBuilder sb = new StringBuilder();
    return this._notEqual(0,sb,left,right).toString(); 
  }

  public StringBuilder _attributeUse(Integer numSpaces, StringBuilder sb, String left, String right, boolean isPointer, boolean isStatement){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(left);
    if(isPointer){
    realSb.append(TEXT_15);
    }
    else{
    realSb.append(TEXT_16);
    }
    realSb.append(right);
    if(isStatement){
    realSb.append(TEXT_17);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeUse(String left, String right, boolean isPointer, boolean isStatement){
        StringBuilder sb = new StringBuilder();
    return this._attributeUse(0,sb,left,right,isPointer,isStatement).toString(); 
  }

  public StringBuilder _parameterAssignStatement(Integer numSpaces, StringBuilder sb, String type, String variable, boolean isPointer){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(type);
    if(isPointer){
    realSb.append(TEXT_18);
    }
    realSb.append(TEXT_19);
    realSb.append(variable);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String parameterAssignStatement(String type, String variable, boolean isPointer){
        StringBuilder sb = new StringBuilder();
    return this._parameterAssignStatement(0,sb,type,variable,isPointer).toString(); 
  }

  public StringBuilder _methodInvocation(Integer numSpaces, StringBuilder sb, String methodName, String parameters, boolean isStatemenet){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(methodName);
    realSb.append(TEXT_20);
    realSb.append(parameters);
    realSb.append(TEXT_21);
    if(isStatemenet){
    realSb.append(TEXT_22);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String methodInvocation(String methodName, String parameters, boolean isStatemenet){
        StringBuilder sb = new StringBuilder();
    return this._methodInvocation(0,sb,methodName,parameters,isStatemenet).toString(); 
  }

  public StringBuilder _methodTodoStatement(Integer numSpaces, StringBuilder sb, String name){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_23);
    realSb.append(name);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String methodTodoStatement(String name){
        StringBuilder sb = new StringBuilder();
    return this._methodTodoStatement(0,sb,name).toString(); 
  }

  public StringBuilder _definitionDeclaration(Integer numSpaces, StringBuilder sb, String definition, int index){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_24);
    realSb.append(definition);
    realSb.append(TEXT_25);
    realSb.append(index);
    realSb.append(TEXT_26);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String definitionDeclaration(String definition, int index){
        StringBuilder sb = new StringBuilder();
    return this._definitionDeclaration(0,sb,definition,index).toString(); 
  }

  public StringBuilder _enumValue(Integer numSpaces, StringBuilder sb, String enumName, int enumValue){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(enumName);
    realSb.append(TEXT_27);
    realSb.append(enumValue);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String enumValue(String enumName, int enumValue){
        StringBuilder sb = new StringBuilder();
    return this._enumValue(0,sb,enumName,enumValue).toString(); 
  }

  public StringBuilder _enumCaseString(Integer numSpaces, StringBuilder sb, String caseValue, String caseDescription){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_28);
    realSb.append(caseValue);
    realSb.append(TEXT_29);
    if(caseDescription==null|| caseDescription.isEmpty()){
    realSb.append(caseValue);
    }
    else{
    realSb.append(caseDescription);
    }
    realSb.append(TEXT_30);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String enumCaseString(String caseValue, String caseDescription){
        StringBuilder sb = new StringBuilder();
    return this._enumCaseString(0,sb,caseValue,caseDescription).toString(); 
  }

  public StringBuilder _historyStateCheck(Integer numSpaces, StringBuilder sb, String qualifiedName, String qualifiedType){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_31);
    realSb.append(qualifiedName);
    realSb.append(TEXT_32);
    realSb.append(qualifiedType);
    realSb.append(TEXT_33);
    realSb.append(qualifiedName);
    realSb.append(TEXT_34);
    realSb.append(qualifiedName);
    realSb.append(TEXT_35);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String historyStateCheck(String qualifiedName, String qualifiedType){
        StringBuilder sb = new StringBuilder();
    return this._historyStateCheck(0,sb,qualifiedName,qualifiedType).toString(); 
  }

  public StringBuilder _statesSetterNameDefinition(Integer numSpaces, StringBuilder sb, String enumName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_36);
    realSb.append(StringUtil.firstCharacterToUpperCase(enumName));

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statesSetterNameDefinition(String enumName){
        StringBuilder sb = new StringBuilder();
    return this._statesSetterNameDefinition(0,sb,enumName).toString(); 
  }

  public StringBuilder _doActivityBodyWrap(Integer numSpaces, StringBuilder sb, String body){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(body);
    realSb.append(TEXT_37);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String doActivityBodyWrap(String body){
        StringBuilder sb = new StringBuilder();
    return this._doActivityBodyWrap(0,sb,body).toString(); 
  }

  public StringBuilder _statemachineFullPath(Integer numSpaces, StringBuilder sb, String enumName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_38);
    realSb.append(StringUtil.firstCharacterToUpperCase(enumName));
    realSb.append(TEXT_39);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineFullPath(String enumName){
        StringBuilder sb = new StringBuilder();
    return this._statemachineFullPath(0,sb,enumName).toString(); 
  }

  public StringBuilder _statemachineFullPathImplementation(Integer numSpaces, StringBuilder sb, String statemachine, String body){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_40);
    realSb.append(statemachine);
    realSb.append(TEXT_41);
    if(body!= null && !body.isEmpty()){
    realSb.append(TEXT_42);
    realSb.append(body);
    realSb.append(TEXT_43);
    }
    realSb.append(TEXT_44);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineFullPathImplementation(String statemachine, String body){
        StringBuilder sb = new StringBuilder();
    return this._statemachineFullPathImplementation(0,sb,statemachine,body).toString(); 
  }

  public StringBuilder _statemachineFullPathSegment(Integer numSpaces, StringBuilder sb, String nestedType, String nestedTypeInstance){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_45);
    realSb.append(nestedTypeInstance);
    realSb.append(TEXT_46);
    realSb.append(nestedType);
    realSb.append(TEXT_47);
    realSb.append(nestedTypeInstance);
    realSb.append(TEXT_48);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineFullPathSegment(String nestedType, String nestedTypeInstance){
        StringBuilder sb = new StringBuilder();
    return this._statemachineFullPathSegment(0,sb,nestedType,nestedTypeInstance).toString(); 
  }

  public StringBuilder _invokeStatesSetterDefinition(Integer numSpaces, StringBuilder sb, String setter, String type, String targetState){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(setter);
    realSb.append(TEXT_49);
    realSb.append(type);
    if(targetState!= null && !targetState.isEmpty()){
    realSb.append(TEXT_50);
    realSb.append(targetState);
    }
    realSb.append(TEXT_51);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String invokeStatesSetterDefinition(String setter, String type, String targetState){
        StringBuilder sb = new StringBuilder();
    return this._invokeStatesSetterDefinition(0,sb,setter,type,targetState).toString(); 
  }

  public StringBuilder _statemachineExitProcedureName(Integer numSpaces, StringBuilder sb, String enumName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_52);
    realSb.append(StringUtil.firstCharacterToUpperCase(enumName));

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineExitProcedureName(String enumName){
        StringBuilder sb = new StringBuilder();
    return this._statemachineExitProcedureName(0,sb,enumName).toString(); 
  }

  public StringBuilder _statemachineEnterProcedureName(Integer numSpaces, StringBuilder sb, String enumName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_53);
    realSb.append(StringUtil.firstCharacterToUpperCase(enumName));

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineEnterProcedureName(String enumName){
        StringBuilder sb = new StringBuilder();
    return this._statemachineEnterProcedureName(0,sb,enumName).toString(); 
  }

  public StringBuilder _procedureCallDeclaration(Integer numSpaces, StringBuilder sb, String procedureName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(procedureName);
    realSb.append(TEXT_54);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String procedureCallDeclaration(String procedureName){
        StringBuilder sb = new StringBuilder();
    return this._procedureCallDeclaration(0,sb,procedureName).toString(); 
  }

  public StringBuilder _procedureCallAndCheckDeclaration(Integer numSpaces, StringBuilder sb, String procedureName, boolean isImvocation){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_55);
    realSb.append(procedureName);
    if(isImvocation){
    realSb.append(TEXT_56);
    }
    realSb.append(TEXT_57);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String procedureCallAndCheckDeclaration(String procedureName, boolean isImvocation){
        StringBuilder sb = new StringBuilder();
    return this._procedureCallAndCheckDeclaration(0,sb,procedureName,isImvocation).toString(); 
  }

  public StringBuilder _enumDeclaration(Integer numSpaces, StringBuilder sb, String enumName, String values){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_58);
    realSb.append(enumName);
    realSb.append(TEXT_59);
    realSb.append(values);
    realSb.append(TEXT_60);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String enumDeclaration(String enumName, String values){
        StringBuilder sb = new StringBuilder();
    return this._enumDeclaration(0,sb,enumName,values).toString(); 
  }

  public StringBuilder _enumUseDeclaration(Integer numSpaces, StringBuilder sb, String enumType, String value){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(enumType);
    realSb.append(TEXT_61);
    realSb.append(value);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String enumUseDeclaration(String enumType, String value){
        StringBuilder sb = new StringBuilder();
    return this._enumUseDeclaration(0,sb,enumType,value).toString(); 
  }

  public StringBuilder _statemachineMethodImplementation(Integer numSpaces, StringBuilder sb, String body){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_62);
    realSb.append(body);
    realSb.append(TEXT_63);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineMethodImplementation(String body){
        StringBuilder sb = new StringBuilder();
    return this._statemachineMethodImplementation(0,sb,body).toString(); 
  }

  public StringBuilder _statusSetterDefinition(Integer numSpaces, StringBuilder sb, String setter, String enumName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_64);
    realSb.append(setter);
    realSb.append(TEXT_65);
    realSb.append(enumName);
    realSb.append(TEXT_66);
    realSb.append(enumName);
    realSb.append(TEXT_67);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statusSetterDefinition(String setter, String enumName){
        StringBuilder sb = new StringBuilder();
    return this._statusSetterDefinition(0,sb,setter,enumName).toString(); 
  }

  public StringBuilder _statemachineExitProcedureDeclaration(Integer numSpaces, StringBuilder sb, String exitProcedureName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_68);
    realSb.append(exitProcedureName);
    realSb.append(TEXT_69);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineExitProcedureDeclaration(String exitProcedureName){
        StringBuilder sb = new StringBuilder();
    return this._statemachineExitProcedureDeclaration(0,sb,exitProcedureName).toString(); 
  }

  public StringBuilder _statemachineExitProcedureImplementation(Integer numSpaces, StringBuilder sb, String exitProcedureName, String owner, String body){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_70);
    realSb.append(owner);
    realSb.append(exitProcedureName);
    realSb.append(TEXT_71);
    realSb.append(body);
    realSb.append(TEXT_72);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineExitProcedureImplementation(String exitProcedureName, String owner, String body){
        StringBuilder sb = new StringBuilder();
    return this._statemachineExitProcedureImplementation(0,sb,exitProcedureName,owner,body).toString(); 
  }

  public StringBuilder _statemachineEntryExitProcedureStateImplementation(Integer numSpaces, StringBuilder sb, String stateName, String body){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_73);
    realSb.append(stateName);
    realSb.append(TEXT_74);
    realSb.append(StringUtil.indent(body,1));
    realSb.append(TEXT_75);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineEntryExitProcedureStateImplementation(String stateName, String body){
        StringBuilder sb = new StringBuilder();
    return this._statemachineEntryExitProcedureStateImplementation(0,sb,stateName,body).toString(); 
  }

  public StringBuilder _statemachineNestedStateBody(Integer numSpaces, StringBuilder sb, String enumVariable, String enumState, String enumName, String setterName, String enumNextState){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_76);
    realSb.append(enumVariable);
    realSb.append(TEXT_77);
    realSb.append(enumName);
    realSb.append(TEXT_78);
    realSb.append(enumState);
    realSb.append(TEXT_79);
    realSb.append(setterName);
    realSb.append(TEXT_80);
    realSb.append(enumName);
    realSb.append(TEXT_81);
    realSb.append(enumNextState);
    realSb.append(TEXT_82);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineNestedStateBody(String enumVariable, String enumState, String enumName, String setterName, String enumNextState){
        StringBuilder sb = new StringBuilder();
    return this._statemachineNestedStateBody(0,sb,enumVariable,enumState,enumName,setterName,enumNextState).toString(); 
  }

  public StringBuilder _setterSwitchComment(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_83);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String setterSwitchComment(){
        StringBuilder sb = new StringBuilder();
    return this._setterSwitchComment(0,sb).toString(); 
  }

  public StringBuilder _threadInstance(Integer numSpaces, StringBuilder sb, String name){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(StringUtil.firstCharacterToLowerCase(name));
    realSb.append(TEXT_84);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String threadInstance(String name){
        StringBuilder sb = new StringBuilder();
    return this._threadInstance(0,sb,name).toString(); 
  }

  public StringBuilder _doActivityMediatorImplementation(Integer numSpaces, StringBuilder sb, String name, String doActivity){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(name);
    realSb.append(TEXT_85);
    realSb.append(name);
    realSb.append(TEXT_86);
    realSb.append(doActivity);
    realSb.append(TEXT_87);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String doActivityMediatorImplementation(String name, String doActivity){
        StringBuilder sb = new StringBuilder();
    return this._doActivityMediatorImplementation(0,sb,name,doActivity).toString(); 
  }

  public StringBuilder _doActivityMethodInstance(Integer numSpaces, StringBuilder sb, String name){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_88);
    realSb.append(StringUtil.firstCharacterToUpperCase(name));

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String doActivityMethodInstance(String name){
        StringBuilder sb = new StringBuilder();
    return this._doActivityMethodInstance(0,sb,name).toString(); 
  }

  public StringBuilder _doActivityFunctionPointerImplementation(Integer numSpaces, StringBuilder sb, String owner, String functionPointer, String threadInstance){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_89);
    realSb.append(threadInstance);
    realSb.append(TEXT_90);
    realSb.append(owner);
    realSb.append(TEXT_91);
    realSb.append(functionPointer);
    realSb.append(TEXT_92);
    realSb.append(functionPointer);
    realSb.append(TEXT_93);
    realSb.append(threadInstance);
    realSb.append(TEXT_94);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String doActivityFunctionPointerImplementation(String owner, String functionPointer, String threadInstance){
        StringBuilder sb = new StringBuilder();
    return this._doActivityFunctionPointerImplementation(0,sb,owner,functionPointer,threadInstance).toString(); 
  }

  public StringBuilder _doActivityFunctionWrap(Integer numSpaces, StringBuilder sb, String threadInstance){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_95);
    realSb.append(StringUtil.indent(threadInstance,1));
    realSb.append(TEXT_96);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String doActivityFunctionWrap(String threadInstance){
        StringBuilder sb = new StringBuilder();
    return this._doActivityFunctionWrap(0,sb,threadInstance).toString(); 
  }

  public StringBuilder _statemachineThreadUseDeclaration(Integer numSpaces, StringBuilder sb, String threadCallback){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    if(threadCallback!= null && !threadCallback.isEmpty()){
    realSb.append(TEXT_97);
    realSb.append(threadCallback);
    realSb.append(TEXT_98);
    realSb.append(threadCallback);
    realSb.append(TEXT_99);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineThreadUseDeclaration(String threadCallback){
        StringBuilder sb = new StringBuilder();
    return this._statemachineThreadUseDeclaration(0,sb,threadCallback).toString(); 
  }

  public StringBuilder _enumVariablePlaceholderDeclaration(Integer numSpaces, StringBuilder sb, String shortenedType, String enumType, String name){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(shortenedType);
    realSb.append(TEXT_100);
    realSb.append(enumType);
    realSb.append(TEXT_101);
    realSb.append(name);
    realSb.append(TEXT_102);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String enumVariablePlaceholderDeclaration(String shortenedType, String enumType, String name){
        StringBuilder sb = new StringBuilder();
    return this._enumVariablePlaceholderDeclaration(0,sb,shortenedType,enumType,name).toString(); 
  }

  public StringBuilder _enumVariableAssignmentDefinition(Integer numSpaces, StringBuilder sb, String name, String enumType){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_103);
    realSb.append(enumType);
    realSb.append(TEXT_104);
    realSb.append(enumType);
    realSb.append(TEXT_105);
    realSb.append(name);
    realSb.append(TEXT_106);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String enumVariableAssignmentDefinition(String name, String enumType){
        StringBuilder sb = new StringBuilder();
    return this._enumVariableAssignmentDefinition(0,sb,name,enumType).toString(); 
  }

  public StringBuilder _statemachineSwitchCaseDeclaration(Integer numSpaces, StringBuilder sb, String enumType, String sourceState, String body){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_107);
    realSb.append(enumType);
    realSb.append(TEXT_108);
    realSb.append(sourceState);
    realSb.append(TEXT_109);
    realSb.append(StringUtil.indent(body,1));
    realSb.append(TEXT_110);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineSwitchCaseDeclaration(String enumType, String sourceState, String body){
        StringBuilder sb = new StringBuilder();
    return this._statemachineSwitchCaseDeclaration(0,sb,enumType,sourceState,body).toString(); 
  }

  public StringBuilder _statemachineProcessedCase(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_111);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String statemachineProcessedCase(){
        StringBuilder sb = new StringBuilder();
    return this._statemachineProcessedCase(0,sb).toString(); 
  }

  public StringBuilder _defaultTimeAssign(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_112);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String defaultTimeAssign(){
        StringBuilder sb = new StringBuilder();
    return this._defaultTimeAssign(0,sb).toString(); 
  }

  public StringBuilder _defaultDateAssign(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_113);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String defaultDateAssign(){
        StringBuilder sb = new StringBuilder();
    return this._defaultDateAssign(0,sb).toString(); 
  }

  public StringBuilder _dateAssign(Integer numSpaces, StringBuilder sb, String value){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_114);
    realSb.append(value);
    realSb.append(TEXT_115);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String dateAssign(String value){
        StringBuilder sb = new StringBuilder();
    return this._dateAssign(0,sb,value).toString(); 
  }

  public StringBuilder _timeAssign(Integer numSpaces, StringBuilder sb, String value){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_116);
    realSb.append(value);
    realSb.append(TEXT_117);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String timeAssign(String value){
        StringBuilder sb = new StringBuilder();
    return this._timeAssign(0,sb,value).toString(); 
  }

  public StringBuilder _currentTimeReference(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_118);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String currentTimeReference(){
        StringBuilder sb = new StringBuilder();
    return this._currentTimeReference(0,sb).toString(); 
  }

  public StringBuilder _testFileStart(Integer numSpaces, StringBuilder sb, String copyRight, String fullName, String testFile, String startContents, String testMethod){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(copyRight);
    realSb.append(TEXT_119);
    realSb.append(fullName);
    realSb.append(TEXT_120);
    realSb.append(fullName);
    realSb.append(TEXT_121);
    realSb.append(testFile);
    realSb.append(TEXT_122);
    realSb.append(startContents);
    realSb.append(TEXT_123);
    realSb.append(testMethod);
    realSb.append(TEXT_124);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String testFileStart(String copyRight, String fullName, String testFile, String startContents, String testMethod){
        StringBuilder sb = new StringBuilder();
    return this._testFileStart(0,sb,copyRight,fullName,testFile,startContents,testMethod).toString(); 
  }

  public StringBuilder _testFileEnd(Integer numSpaces, StringBuilder sb, String nameAsVariable, String body){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_125);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String testFileEnd(String nameAsVariable, String body){
        StringBuilder sb = new StringBuilder();
    return this._testFileEnd(0,sb,nameAsVariable,body).toString(); 
  }

  public StringBuilder _assertGetter(Integer numSpaces, StringBuilder sb, String instance, String getterMethod, String value, String parameters, String operator){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_126);
    realSb.append(instance);
    realSb.append(TEXT_127);
    realSb.append(getterMethod);
    realSb.append(TEXT_128);
    realSb.append(parameters);
    realSb.append(TEXT_129);
    if(operator== null || operator.isEmpty()){
    realSb.append(TEXT_130);
    }
    else{
    realSb.append(operator);
    }
    realSb.append(TEXT_131);
    realSb.append(value);
    realSb.append(TEXT_132);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String assertGetter(String instance, String getterMethod, String value, String parameters, String operator){
        StringBuilder sb = new StringBuilder();
    return this._assertGetter(0,sb,instance,getterMethod,value,parameters,operator).toString(); 
  }

  public StringBuilder _methodCall(Integer numSpaces, StringBuilder sb, String instance, String method, String value, boolean notStatement){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(instance);
    realSb.append(TEXT_133);
    realSb.append(method);
    realSb.append(TEXT_134);
    realSb.append(value);
    realSb.append(TEXT_135);
    if(!notStatement){
    realSb.append(TEXT_136);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String methodCall(String instance, String method, String value, boolean notStatement){
        StringBuilder sb = new StringBuilder();
    return this._methodCall(0,sb,instance,method,value,notStatement).toString(); 
  }

  public StringBuilder _resetImplementation(Integer numSpaces, StringBuilder sb, String name, String defaultGetter){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_137);
    realSb.append(name);
    realSb.append(TEXT_138);
    realSb.append(defaultGetter);
    realSb.append(TEXT_139);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String resetImplementation(String name, String defaultGetter){
        StringBuilder sb = new StringBuilder();
    return this._resetImplementation(0,sb,name,defaultGetter).toString(); 
  }

  public StringBuilder _setterCanSetCheck(Integer numSpaces, StringBuilder sb, String nameAsVariable){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_140);
    realSb.append(nameAsVariable);
    realSb.append(TEXT_141);
    realSb.append(nameAsVariable);
    realSb.append(TEXT_142);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String setterCanSetCheck(String nameAsVariable){
        StringBuilder sb = new StringBuilder();
    return this._setterCanSetCheck(0,sb,nameAsVariable).toString(); 
  }

  public StringBuilder _serializeInitAsPointer(Integer numSpaces, StringBuilder sb, String type, String name, String params, String other){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(type);
    realSb.append(TEXT_143);
    realSb.append(name);
    realSb.append(TEXT_144);
    realSb.append(name);
    realSb.append(TEXT_145);
    realSb.append(type);
    realSb.append(TEXT_146);
    if(params!= null && !params.isEmpty()){
    realSb.append(TEXT_147);
    realSb.append(params);
    }
    realSb.append(TEXT_148);
    realSb.append(name);
    realSb.append(TEXT_149);
    realSb.append(type);
    realSb.append(TEXT_150);
    if(params!= null && !params.isEmpty()){
    realSb.append(TEXT_151);
    realSb.append(params);
    }
    realSb.append(TEXT_152);
    realSb.append(name);
    realSb.append(TEXT_153);
    realSb.append(type);
    realSb.append(TEXT_154);
    realSb.append(params);
    realSb.append(TEXT_155);
    realSb.append(other);
    realSb.append(TEXT_156);
    realSb.append(name);
    realSb.append(TEXT_157);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String serializeInitAsPointer(String type, String name, String params, String other){
        StringBuilder sb = new StringBuilder();
    return this._serializeInitAsPointer(0,sb,type,name,params,other).toString(); 
  }

  public StringBuilder _serializeInitAsReference(Integer numSpaces, StringBuilder sb, String type, String name, String params, String other){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_158);
    realSb.append(type);
    realSb.append(TEXT_159);
    realSb.append(name);
    realSb.append(TEXT_160);
    if(params!= null && !params.isEmpty()){
    realSb.append(TEXT_161);
    realSb.append(params);
    }
    realSb.append(TEXT_162);
    realSb.append(other);
    realSb.append(TEXT_163);
    realSb.append(name);
    realSb.append(TEXT_164);
    realSb.append(type);
    realSb.append(TEXT_165);
    realSb.append(name);
    realSb.append(TEXT_166);
    if(params!= null && !params.isEmpty()){
    realSb.append(TEXT_167);
    realSb.append(params);
    }
    realSb.append(TEXT_168);
    realSb.append(other);
    realSb.append(TEXT_169);
    realSb.append(name);
    realSb.append(TEXT_170);
    realSb.append(type);
    realSb.append(TEXT_171);
    realSb.append(name);
    if(params!= null && !params.isEmpty()){
    realSb.append(TEXT_172);
    realSb.append(params);
    realSb.append(TEXT_173);
    }
    realSb.append(TEXT_174);
    realSb.append(other);
    realSb.append(TEXT_175);
    realSb.append(name);
    realSb.append(TEXT_176);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String serializeInitAsReference(String type, String name, String params, String other){
        StringBuilder sb = new StringBuilder();
    return this._serializeInitAsReference(0,sb,type,name,params,other).toString(); 
  }

  public StringBuilder __portEventEnumDescription(Integer numSpaces, StringBuilder sb, String directionString, String directionToOrFrom){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(directionString);
    realSb.append(TEXT_177);
    realSb.append(directionToOrFrom);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String _portEventEnumDescription(String directionString, String directionToOrFrom){
        StringBuilder sb = new StringBuilder();
    return this.__portEventEnumDescription(0,sb,directionString,directionToOrFrom).toString(); 
  }

  public StringBuilder _portProtocolImplementationEventCase(Integer numSpaces, StringBuilder sb, String portEventType, String direction, String portName, String type){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_178);
    realSb.append(portEventType);
    realSb.append(TEXT_179);
    realSb.append(direction);
    realSb.append(TEXT_180);
    realSb.append(portName);
    realSb.append(TEXT_181);
    realSb.append(type);
    realSb.append(TEXT_182);
    realSb.append(type);
    realSb.append(TEXT_183);
    realSb.append(type);
    realSb.append(TEXT_184);
    realSb.append(portName);
    realSb.append(TEXT_185);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolImplementationEventCase(String portEventType, String direction, String portName, String type){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolImplementationEventCase(0,sb,portEventType,direction,portName,type).toString(); 
  }

  public StringBuilder _portProtocolHeaderContents(Integer numSpaces, StringBuilder sb, Object element, String name, String portEventAttributes, String portEventDeclarations){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_186);
    realSb.append(StringUtil.indent(portEventAttributes,2));
    realSb.append(TEXT_187);
    realSb.append(name);
    realSb.append(TEXT_188);
    realSb.append(name);
    realSb.append(TEXT_189);
    realSb.append(name);
    realSb.append(TEXT_190);
    realSb.append(StringUtil.indent(portEventDeclarations,2));
    realSb.append(TEXT_191);
    realSb.append(this.getG().generate(Generator.PORT_EVENT_TYPE, element));
    realSb.append(TEXT_192);
    realSb.append(this.getG().generate(Generator.PORT_EVENT_NAME, element));
    realSb.append(TEXT_193);
    realSb.append(this.getG().generate(Generator.PORT_TYPE, element));
    realSb.append(TEXT_194);
    realSb.append(this.getG().generate(Generator.PORT_NAME, element));
    realSb.append(TEXT_195);
    realSb.append(name);
    realSb.append(TEXT_196);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolHeaderContents(Object element, String name, String portEventAttributes, String portEventDeclarations){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolHeaderContents(0,sb,element,name,portEventAttributes,portEventDeclarations).toString(); 
  }

  public StringBuilder _portProtocolBodyContents(Integer numSpaces, StringBuilder sb, Object element, Object protocol, String bodyIncludes){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
		String name= this.getG().getString(element, IModelingElementDefinitions.NAME);
		String portEventImplementations= ""; //this.getG().generationPointString(element, IStructureConstants.PORT_EVENT_IMPLEMENTATIONS);
		String portEventCases= ""; //this.getG().generationPointString(element, IStructureConstants.PORT_PROTOCOL_IMPLEMENTATION_EVENT_CASES);
		String fullPath= ""; //this.getG().generationPointString(element, IModelingConstants.FULL_PATH);
		String copyRight= ""; //this.getG().generationPointString(element, IModelingConstants.COPY_RIGHT);
		String fullName= getG().rootModel.preprocessingDefinitionName();
		String namespaceOpening= ""; //this.getG().generationPointString(protocol, ICppDefinitions.NAMESPACE_OPENING, Boolean.TRUE);
		String namespaceClosing= ""; //this.getG().generationPointString(protocol, ICppDefinitions.NAMESPACE_CLOSING, Boolean.TRUE);


    realSb.append(copyRight);
    realSb.append(TEXT_197);
    realSb.append(fullName);
    realSb.append(TEXT_198);
    realSb.append(fullPath);
    realSb.append(TEXT_199);
    if(bodyIncludes!= null && !bodyIncludes.isEmpty()){
    realSb.append(TEXT_200);
    realSb.append(bodyIncludes);
    realSb.append(TEXT_201);
    }
    realSb.append(namespaceOpening);
    realSb.append(TEXT_202);
    realSb.append(name);
    realSb.append(TEXT_203);
    realSb.append(name);
    realSb.append(TEXT_204);
    realSb.append(name);
    realSb.append(TEXT_205);
    realSb.append(name);
    realSb.append(TEXT_206);
    realSb.append(name);
    realSb.append(TEXT_207);
    realSb.append(name);
    realSb.append(TEXT_208);
    realSb.append(name);
    realSb.append(TEXT_209);
    realSb.append(name);
    realSb.append(TEXT_210);
    realSb.append(StringUtil.firstCharacterToLowerCase(name));
    realSb.append(TEXT_211);
    realSb.append(portEventImplementations);
    realSb.append(TEXT_212);
    realSb.append(name);
    realSb.append(TEXT_213);
    realSb.append(name);
    realSb.append(TEXT_214);
    realSb.append(name);
    realSb.append(TEXT_215);
    realSb.append(StringUtil.indent(portEventCases,2));
    realSb.append(TEXT_216);
    realSb.append(namespaceClosing);
    realSb.append(TEXT_217);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolBodyContents(Object element, Object protocol, String bodyIncludes){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolBodyContents(0,sb,element,protocol,bodyIncludes).toString(); 
  }

  public StringBuilder _portEventEntryAssign(Integer numSpaces, StringBuilder sb, Object element, String portName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_218);
    realSb.append(this.getG().generate(Generator.PORT_NAME, element));
    realSb.append(TEXT_219);
    realSb.append(this.getG().generate(Generator.PORT_TYPE, element));
    realSb.append(TEXT_220);
    realSb.append(portName);
    realSb.append(TEXT_221);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portEventEntryAssign(Object element, String portName){
        StringBuilder sb = new StringBuilder();
    return this._portEventEntryAssign(0,sb,element,portName).toString(); 
  }

  public StringBuilder _portEventEntryInvocation(Integer numSpaces, StringBuilder sb, Object element, String portName, String direction, String type){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_222);
    realSb.append(this.getG().generate(Generator.PORT_EVENT_NAME, element));
    realSb.append(TEXT_223);
    realSb.append(this.getG().generate(Generator.PORT_EVENT_TYPE, element));
    realSb.append(TEXT_224);
    realSb.append(direction);
    realSb.append(TEXT_225);
    realSb.append(portName);
    realSb.append(TEXT_226);
    realSb.append(this.getG().generate(Generator.PORT_TYPE, element));
    realSb.append(TEXT_227);
    realSb.append(portName);
    realSb.append(TEXT_228);
    realSb.append(this.getG().generate(Generator.PORT_EVENT_TYPE, element));
    realSb.append(TEXT_229);
    realSb.append(direction);
    realSb.append(TEXT_230);
    realSb.append(portName);
    realSb.append(TEXT_231);
    realSb.append(type);
    realSb.append(TEXT_232);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portEventEntryInvocation(Object element, String portName, String direction, String type){
        StringBuilder sb = new StringBuilder();
    return this._portEventEntryInvocation(0,sb,element,portName,direction,type).toString(); 
  }

  public StringBuilder _portProtocolHandlerEventBindingConnect(Integer numSpaces, StringBuilder sb, String fromPortName, String toPortName, String fromSubComponentName, String toSubComponentName, String fromSubComponentType, String owingClass){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String portName= fromPortName+ "_"+ toPortName;
	String handle= this.getG().generate(Generator.PORT_PROTOCOL_HANDLE_BINDING_DEFAULT_NAME, portName);
	String protocolClassName= StringUtil.firstCharacterToLowerCase(fromSubComponentType)+ "_PortProtocol";
	String event= this.getG().generate(Generator.PORT_PROTOCOL_EVENT_DEFAULT_NAME, fromPortName);


    realSb.append(handle);
    realSb.append(TEXT_233);
    realSb.append(fromSubComponentName);
    realSb.append(TEXT_234);
    realSb.append(protocolClassName);
    realSb.append(TEXT_235);
    realSb.append(event);
    realSb.append(TEXT_236);
    realSb.append(toSubComponentName);
    realSb.append(TEXT_237);
    realSb.append(owingClass);
    realSb.append(TEXT_238);
    realSb.append(toPortName);
    realSb.append(TEXT_239);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolHandlerEventBindingConnect(String fromPortName, String toPortName, String fromSubComponentName, String toSubComponentName, String fromSubComponentType, String owingClass){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolHandlerEventBindingConnect(0,sb,fromPortName,toPortName,fromSubComponentName,toSubComponentName,fromSubComponentType,owingClass).toString(); 
  }

  public StringBuilder _portProtocolHandlerEventBindingDisconnect(Integer numSpaces, StringBuilder sb, Object element, String portName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    String protocolClassName= this.getG().generate(Generator.PORT_PROTOCOL_DEFAULT_VARIABLE_NAME, element);
String handle= this.getG().generate(Generator.PORT_PROTOCOL_HANDLE_DEFAULT_NAME, portName);
String event= this.getG().generate(Generator.PORT_PROTOCOL_EVENT_DEFAULT_NAME, portName);


    realSb.append(protocolClassName);
    realSb.append(TEXT_240);
    realSb.append(event);
    realSb.append(TEXT_241);
    realSb.append(handle);
    realSb.append(TEXT_242);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolHandlerEventBindingDisconnect(Object element, String portName){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolHandlerEventBindingDisconnect(0,sb,element,portName).toString(); 
  }

  public StringBuilder _portProtocolSendToContents(Integer numSpaces, StringBuilder sb, Object element, String portName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(this.getG().generate(Generator.PORT_PROTOCOL_DEFAULT_VARIABLE_NAME, element));
    realSb.append(TEXT_243);
    realSb.append(portName);
    realSb.append(TEXT_244);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolSendToContents(Object element, String portName){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolSendToContents(0,sb,element,portName).toString(); 
  }

  public StringBuilder _portProtocolHandlerEventConstructor(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_245);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolHandlerEventConstructor(){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolHandlerEventConstructor(0,sb).toString(); 
  }

  public StringBuilder _portProtocolHandlerEventDestructor(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_246);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolHandlerEventDestructor(){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolHandlerEventDestructor(0,sb).toString(); 
  }

  public StringBuilder _portProtocolHandlerEventConnect(Integer numSpaces, StringBuilder sb, Object element, String portName, String handleVariableGetter){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    String protocolClassName= this.getG().generate(Generator.PORT_PROTOCOL_DEFAULT_VARIABLE_NAME, element);
	String parentName= this.getG().getString(element, IModelingElementDefinitions.NAME);
	String receiveMethodName= this.getG().generate(Generator.PORT_PROTOCOL_EVENT_RECEIVE_DATA_METHOD_NAME, portName);
	String handle= this.getG().generate(handleVariableGetter== null|| handleVariableGetter.isEmpty()?Generator.PORT_PROTOCOL_HANDLE_DEFAULT_NAME: handleVariableGetter, portName);
	String event= this.getG().generate(Generator.PORT_PROTOCOL_EVENT_DEFAULT_NAME, portName);

	
    realSb.append(handle);
    realSb.append(TEXT_247);
    realSb.append(protocolClassName);
    realSb.append(TEXT_248);
    realSb.append(event);
    realSb.append(TEXT_249);
    realSb.append(parentName);
    realSb.append(TEXT_250);
    realSb.append(receiveMethodName);
    realSb.append(TEXT_251);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolHandlerEventConnect(Object element, String portName, String handleVariableGetter){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolHandlerEventConnect(0,sb,element,portName,handleVariableGetter).toString(); 
  }

  public StringBuilder _portProtocolImplementationPortAttribute(Integer numSpaces, StringBuilder sb, String portName, String typeName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_252);
    realSb.append(typeName);
    realSb.append(TEXT_253);
    realSb.append(this.getG().generate(Generator.PORT_PROTOCOL_EVENT_DEFAULT_NAME, portName));
    realSb.append(TEXT_254);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolImplementationPortAttribute(String portName, String typeName){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolImplementationPortAttribute(0,sb,portName,typeName).toString(); 
  }

  public StringBuilder _portProtocolDescriptionComment(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_255);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolDescriptionComment(){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolDescriptionComment(0,sb).toString(); 
  }

  public StringBuilder _protocolClassHeader(Integer numSpaces, StringBuilder sb, Object element, Object protocol, String contents, String definitionFullPath, String className, List<?> protocols, String internalDefinedTypes){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String includes= ""; //this.getG().generationPointString(protocol, ICppDefinitions.INCLUDES);
	String copyRight= ""; //this.getG().generationPointString(protocol, IModelingConstants.COPY_RIGHT);
	String incompleteTypes= "";
	
	String namespaceOpening= ""; //this.getG().generationPointString(element, ICppDefinitions.NAMESPACE_OPENING, Boolean.TRUE);
	String namespaceClosing= ""; //this.getG().generationPointString(element, ICppDefinitions.NAMESPACE_CLOSING, Boolean.TRUE);
	String fullPath= ""; //this.getG().generationPointString(element, IModelingConstants.FULL_PATH)+ "_"+ className;
	String classDeclarations= ""; //this.getG().generationPointString(element, IModelingConstants.CLASS_DECLARATIONS)+ "_"+ className;


    realSb.append(copyRight);
    realSb.append(TEXT_256);
    realSb.append(definitionFullPath);
    realSb.append(TEXT_257);
    realSb.append(definitionFullPath);
    realSb.append(TEXT_258);
    realSb.append(fullPath);
    realSb.append(TEXT_259);
    realSb.append(safeSet(includes));
    realSb.append(safeSet(namespaceOpening));
    realSb.append(safeSet(incompleteTypes));
    realSb.append(safeSet(internalDefinedTypes));
    realSb.append(TEXT_260);
    realSb.append(safeSet(classDeclarations));
    realSb.append(TEXT_261);
    realSb.append(contents);
    realSb.append(TEXT_262);
    realSb.append(namespaceClosing);
    realSb.append(TEXT_263);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String protocolClassHeader(Object element, Object protocol, String contents, String definitionFullPath, String className, List<?> protocols, String internalDefinedTypes){
        StringBuilder sb = new StringBuilder();
    return this._protocolClassHeader(0,sb,element,protocol,contents,definitionFullPath,className,protocols,internalDefinedTypes).toString(); 
  }

  public StringBuilder _portProtocolMessageDescriptorComment(Integer numSpaces, StringBuilder sb, Object element){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
		String name= this.getG().getString(element, IModelingElementDefinitions.NAME);
			
    realSb.append(TEXT_264);
    realSb.append(name);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolMessageDescriptorComment(Object element){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolMessageDescriptorComment(0,sb,element).toString(); 
  }

  public StringBuilder _portProtocolMessageGetterAssign(Integer numSpaces, StringBuilder sb, String name, String attributeName, String getterMethod){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
		String variableName= StringUtil.firstCharacterToLowerCase(name);
			
    realSb.append(TEXT_265);
    realSb.append(attributeName);
    realSb.append(TEXT_266);
    realSb.append(variableName);
    realSb.append(TEXT_267);
    realSb.append(getterMethod);
    realSb.append(TEXT_268);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolMessageGetterAssign(String name, String attributeName, String getterMethod){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolMessageGetterAssign(0,sb,name,attributeName,getterMethod).toString(); 
  }

  public StringBuilder _portProtocolMessageSetterAssign(Integer numSpaces, StringBuilder sb, String name, String attributeName, String setterMethod){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
		String variableName= StringUtil.firstCharacterToLowerCase(name);
			
    realSb.append(variableName);
    realSb.append(TEXT_269);
    realSb.append(setterMethod);
    realSb.append(TEXT_270);
    realSb.append(attributeName);
    realSb.append(TEXT_271);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String portProtocolMessageSetterAssign(String name, String attributeName, String setterMethod){
        StringBuilder sb = new StringBuilder();
    return this._portProtocolMessageSetterAssign(0,sb,name,attributeName,setterMethod).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "g" + "=" + (getG() != null ? !getG().equals(this)  ? getG().toString().replaceAll("  ","    ") : "this" : "null");
  }
}