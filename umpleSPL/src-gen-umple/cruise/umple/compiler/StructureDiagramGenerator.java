/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.util.*;
import java.util.List;
import java.util.ArrayList;
import cruise.umple.compiler.Port.Type;
import java.io.*;
import java.util.*;
import cruise.umple.compiler.exceptions.*;
import java.util.regex.Pattern;

// line 28 "../../../../src/Generator_CodeStructureDiagram.ump"
public class StructureDiagramGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "  settings: {" + NL + "    part_highlight_color: \"";
  public static final String TEXT_1 = "\"," + NL + "    part_container_highlight_color: \"";
  public static final String TEXT_2 = "\"," + NL + "    part_container_label_highlight_color: \"";
  public static final String TEXT_3 = "\"," + NL + "    portFillColor: \"";
  public static final String TEXT_4 = "\"" + NL + "  } ";
  public static final String TEXT_5 = " container: \"##CANVAS_ID##\", id: \"";
  public static final String TEXT_6 = "\", style: \"display: block; margin: auto; border: #111 1px solid;\" ";
  public static final String TEXT_7 = " { ";
  public static final String TEXT_8 = " ";
  public static final String TEXT_9 = ":\"";
  public static final String TEXT_10 = "\" ";
  public static final String TEXT_11 = ", ";
  public static final String TEXT_12 = " }";
  public static final String TEXT_13 = " {args: ";
  public static final String TEXT_14 = ", descriptor: \"";
  public static final String TEXT_15 = "\"} ";
  public static final String TEXT_16 = " {args: { ";
  public static final String TEXT_17 = " sources: [\"";
  public static final String TEXT_18 = "\"], targets: [\"";
  public static final String TEXT_19 = "\"]}, ";
  public static final String TEXT_20 = " connectorType: [";
  public static final String TEXT_21 = "\"";
  public static final String TEXT_22 = "\"";
  public static final String TEXT_23 = ", ";
  public static final String TEXT_24 = "]},";
  public static final String TEXT_25 = " descriptor: \"PortConnector\"} ";
  public static final String TEXT_26 = NL + "  ShapesRegistry.paint({" + NL + "    descriptor: \"StrucutreDiagram\"," + NL + "    args: {" + NL + "      ";
  public static final String TEXT_27 = NL + "      ";
  public static final String TEXT_28 = ",  " + NL + "      " + NL + "      ";
  public static final String TEXT_29 = " ," + NL + "      nodes: [" + NL + "        ";
  public static final String TEXT_30 = " ";
  public static final String TEXT_31 = " ";
  public static final String TEXT_32 = "," + NL + "         ";
  public static final String TEXT_33 = NL + "        ";
  public static final String TEXT_34 = NL + "        " + NL + "        ";
  public static final String TEXT_35 = " ";
  public static final String TEXT_36 = " ";
  public static final String TEXT_37 = ", " + NL + "        ";
  public static final String TEXT_38 = NL + "        " + NL + "      ]" + NL + "    }," + NL + "  }, true);" + NL;
  public static final String TEXT_39 = NL + "  ShapesRegistry.showMessage(\"##CANVAS_ID##\", \"";
  public static final String TEXT_40 = "\");" + NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StructureDiagramGenerator Attributes
  private UmpleModel model;
  private String output;
  private String componentPartHighlightColor;
  private String componentPartContainerHighlightColor;
  private String componentPartContainerLabelHighlightColor;
  private String portFillColor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StructureDiagramGenerator()
  {
    super();
    model = null;
    output = "";
    componentPartHighlightColor = "#5DBCD2";
    componentPartContainerHighlightColor = "#FFFFFF";
    componentPartContainerLabelHighlightColor = "#e6e6e6";
    portFillColor = "#FFFFCC";
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setModel(UmpleModel aModel)
  {
    boolean wasSet = false;
    model = aModel;
    wasSet = true;
    return wasSet;
  }

  public boolean setOutput(String aOutput)
  {
    boolean wasSet = false;
    output = aOutput;
    wasSet = true;
    return wasSet;
  }

  public boolean setComponentPartHighlightColor(String aComponentPartHighlightColor)
  {
    boolean wasSet = false;
    componentPartHighlightColor = aComponentPartHighlightColor;
    wasSet = true;
    return wasSet;
  }

  public boolean setComponentPartContainerHighlightColor(String aComponentPartContainerHighlightColor)
  {
    boolean wasSet = false;
    componentPartContainerHighlightColor = aComponentPartContainerHighlightColor;
    wasSet = true;
    return wasSet;
  }

  public boolean setComponentPartContainerLabelHighlightColor(String aComponentPartContainerLabelHighlightColor)
  {
    boolean wasSet = false;
    componentPartContainerLabelHighlightColor = aComponentPartContainerLabelHighlightColor;
    wasSet = true;
    return wasSet;
  }

  public boolean setPortFillColor(String aPortFillColor)
  {
    boolean wasSet = false;
    portFillColor = aPortFillColor;
    wasSet = true;
    return wasSet;
  }

  public UmpleModel getModel()
  {
    return model;
  }

  public String getOutput()
  {
    return output;
  }

  public String getComponentPartHighlightColor()
  {
    return componentPartHighlightColor;
  }

  public String getComponentPartContainerHighlightColor()
  {
    return componentPartContainerHighlightColor;
  }

  public String getComponentPartContainerLabelHighlightColor()
  {
    return componentPartContainerLabelHighlightColor;
  }

  public String getPortFillColor()
  {
    return portFillColor;
  }

  public void delete()
  {
    super.delete();
  }

  // line 102 "../../../../src/Generator_CodeStructureDiagram.ump"
   public boolean hasSubComponents(UmpleClass cmp){
    for(Attribute attr : cmp.getAttributes()) {
			String type = attr.getType();
			UmpleClass subC = model.getUmpleClass(type);
			// Only one level checking
			if(subC != null 
					&& ( subC.numberOfPorts() > 0
					|| subC.numberOfActiveMethods() > 0 )) {
				return true;
			}
		}
	  return false;
  }

  // line 116 "../../../../src/Generator_CodeStructureDiagram.ump"
   public boolean matchBindingDescriptor(ComponentDescriptor cmp, String cmpName){
    if(cmp.getType().equalsIgnoreCase("Part")) {
		  for(PairDescriptor pd : cmp.getDescriptors()) {
			  if(pd.getValue().equals(cmpName)) {
				  return true;
			  }
		  }
	  }
	  return false;
  }

  // line 127 "../../../../src/Generator_CodeStructureDiagram.ump"
   public void removeComponentConflicts(List<ComponentDescriptor> cmpList, String cmpName){
    Iterator<ComponentDescriptor> iter = cmpList.iterator();
	  while (iter.hasNext()) {
		  ComponentDescriptor cmp = iter.next();
		  if (cmp.numberOfDescriptors() > 0) {
			  if(matchBindingDescriptor(cmp, cmpName)) {
				  iter.remove();
			  }
		  }
	  }
  }

  // line 139 "../../../../src/Generator_CodeStructureDiagram.ump"
   public String createJavaScriptCall(){
    List<ComponentDescriptor> cmpList = new ArrayList<ComponentDescriptor>();
   	List<BindingDescriptor> bndList = new ArrayList<BindingDescriptor>();
    for (UmpleClass aClass : model.getUmpleClasses()) {
    	if(aClass.numberOfPorts() > 0 
    			|| aClass.numberOfActiveMethods() > 0
    			|| hasSubComponents(aClass)) {
    		// Component
    		ComponentDescriptor comp = new ComponentDescriptor("Part");
    		comp.addDescriptor(new PairDescriptor("id", aClass.getName()));
    		comp.addDescriptor(new PairDescriptor("name", aClass.getName()));
    		cmpList.add(comp);
    		for(Attribute attr : aClass.getAttributes()) {
    			String type = attr.getType();
    			UmpleClass subC = model.getUmpleClass(type);
    			if(subC != null 
    					&& ( subC.numberOfPorts() > 0
    					|| subC.numberOfActiveMethods() > 0 )) {
    				// Sub-Component
    				ComponentDescriptor subComp = new ComponentDescriptor("Part");
//    				subComp.addDescriptor(new PairDescriptor("id", aClass.getName() + "_" +subC.getName()));
    				subComp.addDescriptor(new PairDescriptor("id", subC.getName()));
    				subComp.addDescriptor(new PairDescriptor("name", subC.getName()));
    				subComp.addDescriptor(new PairDescriptor("parent", aClass.getName()));
    				//removeComponentConflicts(cmpList, subC.getName());
    				cmpList.add(subComp);
    			}
    		}
    		for(Port port : aClass.getPorts()) {
    			ComponentDescriptor portDesc = new ComponentDescriptor("Port");
    			portDesc.addDescriptor(new PairDescriptor("id", aClass.getName() + "_" + port.getName()));
        		portDesc.addDescriptor(new PairDescriptor("name", port.getName()));
        		portDesc.addDescriptor(new PairDescriptor("parent", aClass.getName() ));
        		Type portType = port.getType();
        		if(portType == Type.RELAY) {
        			if(port.getConjugated()) {
            			portDesc.addDescriptor(new PairDescriptor("portType", "conjucatedRelayPort" ));
            			if(port.getReplicated()) {
            				portDesc.addDescriptor(new PairDescriptor("portType", "conjucatedReplicatedRelayPort" ));
            			}
        			} else {
        				portDesc.addDescriptor(new PairDescriptor("portType", "relayPort" ));
        				if(port.getReplicated()) {
            				portDesc.addDescriptor(new PairDescriptor("portType", "replicatedRelayPort" ));
            			}
        			}
        			if(port.getMultiplicity() > 0) {
        				portDesc.addDescriptor(new PairDescriptor("multiplicity", String.valueOf(port.getMultiplicity()) ));
        			}
        			if(!port.getModifier().matches(".*public.*")) {
        				portDesc.addDescriptor(new PairDescriptor("isPrivate", "true" ));
        			}
        		} else if(portType == Type.END) {
        			if(port.getConjugated()) {
            			portDesc.addDescriptor(new PairDescriptor("portType", "conjucatedEndPort" ));
            			if(port.getReplicated()) {
            				portDesc.addDescriptor(new PairDescriptor("portType", "conjucatedReplicatedEndPort" ));
            			}
        			} else {
        				portDesc.addDescriptor(new PairDescriptor("portType", "endPort" ));
        				if(port.getReplicated()) {
            				portDesc.addDescriptor(new PairDescriptor("portType", "replicatedEndPort" ));
            			}
        			}
        			if(port.getMultiplicity() > 0) {
        				portDesc.addDescriptor(new PairDescriptor("multiplicity", String.valueOf(port.getMultiplicity()) ));
        			}
        			if(!port.getModifier().matches(".*public.*")) {
        				portDesc.addDescriptor(new PairDescriptor("isPrivate", "true" ));
        			}
        		} else if(portType == Type.SERVICE) {
        			if(port.getConjugated()) {
            			portDesc.addDescriptor(new PairDescriptor("portType", "conjugated" ));
            			if(port.getReplicated()) {
            				portDesc.addDescriptor(new PairDescriptor("portType", "conjugatedReplicated" ));
            			}
        			} else {
        				portDesc.addDescriptor(new PairDescriptor("portType", "twoArrows" ));
        				if(port.getReplicated()) {
            				portDesc.addDescriptor(new PairDescriptor("portType", "replicated" ));
            			}
        			}
        			if(port.getMultiplicity() > 0) {
        				portDesc.addDescriptor(new PairDescriptor("multiplicity", String.valueOf(port.getMultiplicity()) ));
        			}
        			if(!port.getModifier().matches(".*public.*")) {
        				portDesc.addDescriptor(new PairDescriptor("isPrivate", "true" ));
        			}
        		}
        		cmpList.add(portDesc);
    		}
    		
    		for(PortBinding pb : aClass.getPortBindings() ) {
    			String from = pb.getFromPort().getUmpleClass().getName() +  "_" +pb.getFromPort().getName();
    			String to = pb.getToPort().getUmpleClass().getName() +  "_" +pb.getToPort().getName();
    			BindingDescriptor bnd = new BindingDescriptor(from, to);
        		//bnd.addConnector("require");
    			//bnd.addConnector("provide");
        		bndList.add(bnd);
    		}
    		
    	}
    }
    String jsCall = createJavaScriptCall("GeneratedDiagram", cmpList,bndList);
    if(bndList.size() > 0 || cmpList.size() >0 ) {
    	jsCall = createJavaScriptCall("GeneratedDiagram", cmpList,bndList);
    } else {
    	jsCall = createEmptyCanvas(" No composite structure found in the input Umple model");
    }
    
    return jsCall;
  }

  // line 254 "../../../../src/Generator_CodeStructureDiagram.ump"
   public void generate(){
    //    String html = buildHtmlPage();
    String js = createJavaScriptCall();
    model.setCode(js);
    writeModel();
  }


  /**
   * Output the metrics to a file
   */
  // line 263 "../../../../src/Generator_CodeStructureDiagram.ump"
  public void writeModel(){
    try
    {
      String path = model.getUmpleFile().getPath();
      File file = new File(path);
      file.mkdirs();
      String modelFilename = path + File.separator + model.getUmpleFile().getSimpleFileName() + ".html";
      BufferedWriter bw = new BufferedWriter(new FileWriter(modelFilename));
      bw.write(model.getCode());
      bw.flush();
      bw.close();
    }
    catch (Exception e)
    {
      throw new UmpleCompilerException("Structure Diagram Exception: " + e, e);
    }
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _getColorSettings(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(componentPartHighlightColor);
    realSb.append(TEXT_1);
    realSb.append(componentPartContainerHighlightColor);
    realSb.append(TEXT_2);
    realSb.append(componentPartContainerLabelHighlightColor);
    realSb.append(TEXT_3);
    realSb.append(portFillColor);
    realSb.append(TEXT_4);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getColorSettings(){
        StringBuilder sb = new StringBuilder();
    return this._getColorSettings(0,sb).toString(); 
  }

  public StringBuilder _getDiagramSettings(Integer numSpaces, StringBuilder sb, String modelName){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_5);
    realSb.append(modelName);
    realSb.append(TEXT_6);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getDiagramSettings(String modelName){
        StringBuilder sb = new StringBuilder();
    return this._getDiagramSettings(0,sb,modelName).toString(); 
  }

  public StringBuilder _getComponentDescriptor(Integer numSpaces, StringBuilder sb, PairDescriptor [] node){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_7);
    int i = 0; 
    realSb.append(TEXT_8);
      for(PairDescriptor n : node) {
    realSb.append(n.getId());
    realSb.append(TEXT_9);
    realSb.append(n.getValue());
    realSb.append(TEXT_10);
    if((i++) < node.length -1)
    realSb.append(TEXT_11);
    }
    realSb.append(TEXT_12);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getComponentDescriptor(PairDescriptor [] node){
        StringBuilder sb = new StringBuilder();
    return this._getComponentDescriptor(0,sb,node).toString(); 
  }

  public StringBuilder _getComponent(Integer numSpaces, StringBuilder sb, ComponentDescriptor node){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_13);
    realSb.append(getComponentDescriptor(node.getDescriptors()));
    realSb.append(TEXT_14);
    realSb.append(node.getType());
    realSb.append(TEXT_15);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getComponent(ComponentDescriptor node){
        StringBuilder sb = new StringBuilder();
    return this._getComponent(0,sb,node).toString(); 
  }

  public StringBuilder _createBindingNode(Integer numSpaces, StringBuilder sb, BindingDescriptor bnd){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_16);
    int i = 0; 
    realSb.append(TEXT_17);
    realSb.append(bnd.getFromPort());
    realSb.append(TEXT_18);
    realSb.append(bnd.getToPort());
    realSb.append(TEXT_19);
     if(bnd.getConnectors().length > 0) {
    realSb.append(TEXT_20);
     for(String s : bnd.getConnectors()) {
    realSb.append(TEXT_21);
    realSb.append(s);
    realSb.append(TEXT_22);
    if((i++) < bnd.getConnectors().length -1)
    realSb.append(TEXT_23);
    }
    realSb.append(TEXT_24);
    }
    realSb.append(TEXT_25);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String createBindingNode(BindingDescriptor bnd){
        StringBuilder sb = new StringBuilder();
    return this._createBindingNode(0,sb,bnd).toString(); 
  }

  public StringBuilder _createJavaScriptCall(Integer numSpaces, StringBuilder sb, String modelName, List<ComponentDescriptor> cmpList, List<BindingDescriptor> bndList){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_26);
    int i = 0; 
    realSb.append(TEXT_27);
    realSb.append(getColorSettings());
    realSb.append(TEXT_28);
    realSb.append(getDiagramSettings(modelName));
    realSb.append(TEXT_29);
     for(ComponentDescriptor node : cmpList) {
    realSb.append(TEXT_30);
    realSb.append(getComponent(node));
    realSb.append(TEXT_31);
    if(bndList.size() > 0 || (i++) < cmpList.size() -1)
    realSb.append(TEXT_32);
    }
    realSb.append(TEXT_33);
    i = 0; 
    realSb.append(TEXT_34);
     for(BindingDescriptor node : bndList) {
    realSb.append(TEXT_35);
    realSb.append(createBindingNode(node));
    realSb.append(TEXT_36);
    if((i++) < bndList.size() -1)
    realSb.append(TEXT_37);
    }
    realSb.append(TEXT_38);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String createJavaScriptCall(String modelName, List<ComponentDescriptor> cmpList, List<BindingDescriptor> bndList){
        StringBuilder sb = new StringBuilder();
    return this._createJavaScriptCall(0,sb,modelName,cmpList,bndList).toString(); 
  }

  public StringBuilder _createEmptyCanvas(Integer numSpaces, StringBuilder sb, String label){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_39);
    realSb.append(label);
    realSb.append(TEXT_40);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String createEmptyCanvas(String label){
        StringBuilder sb = new StringBuilder();
    return this._createEmptyCanvas(0,sb,label).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "," +
            "componentPartHighlightColor" + ":" + getComponentPartHighlightColor()+ "," +
            "componentPartContainerHighlightColor" + ":" + getComponentPartContainerHighlightColor()+ "," +
            "componentPartContainerLabelHighlightColor" + ":" + getComponentPartContainerLabelHighlightColor()+ "," +
            "portFillColor" + ":" + getPortFillColor()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}