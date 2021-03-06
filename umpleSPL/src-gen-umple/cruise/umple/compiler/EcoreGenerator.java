/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.io.*;
import java.util.*;
import cruise.umple.util.*;
import cruise.umple.compiler.exceptions.*;

// line 7 "../../../../src/ecoreGeneratorConfig.ump"
// line 13 "../../../../src/Generator_CodeEcore.ump"
public class EcoreGenerator extends CodeGeneratorWithSubptions
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EcoreGenerator Attributes
  private UmpleModel model;
  private EcoreGenModel genModel;
  private String output;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EcoreGenerator()
  {
    super();
    model = null;
    genModel = null;
    output = "";
    // line 16 "../../../../src/Generator_CodeEcore.ump"
    genModel = new EcoreGenModel();
    // END OF UMPLE AFTER INJECTION
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

  public boolean setGenModel(EcoreGenModel aGenModel)
  {
    boolean wasSet = false;
    genModel = aGenModel;
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

  /**
   * Contains various aspects from an Umple file (.ump), such as classes, attributes, associations and methods.  Generated output is based
   * off of what's contained in here.
   */
  public UmpleModel getModel()
  {
    return model;
  }

  public EcoreGenModel getGenModel()
  {
    return genModel;
  }

  public String getOutput()
  {
    return output;
  }

  public void delete()
  {
    super.delete();
  }

  // line 20 "../../../../src/Generator_CodeEcore.ump"
   private String getTargetNamespaceName(){
    if (model.getDefaultNamespace() != null){
      if (model.getDefaultNamespace().length() > 0 )
      {
        String [] namespaces = model.getDefaultNamespace().split("\\.");
        return namespaces[namespaces.length-1];
      }
    }
    return model.getUmpleFile().getSimpleFileName();
  }

  // line 31 "../../../../src/Generator_CodeEcore.ump"
   private void handleInterfaces(EcorePackage rootPackage){
    for(UmpleInterface uInterface : model.getUmpleInterfaces()){
      EcoreClass eInterface = new EcoreClass(uInterface.getName(), rootPackage.getIntent()+1);
      eInterface.setIsAbstract(true);
      eInterface.setIsInterface(true);
      rootPackage.addClass(eInterface);
    }
  }

  // line 40 "../../../../src/Generator_CodeEcore.ump"
   private void handleClasses(EcorePackage rootPackage){
    for(UmpleClass uClass : model.getUmpleClasses()){
      EcoreClass eClass = new EcoreClass(uClass.getName(), 1);
      eClass.setIsAbstract(uClass.getIsAbstract());
      rootPackage.addClass(eClass);
      
      // Add parent class
      if(uClass.hasExtendsClass()){
        eClass.addSuperType(uClass.getExtendsClass().getName());
      }
      
      // Add implemented interfaces
      if(uClass.hasParentInterface()){
        for(UmpleInterface uInterface : uClass.getParentInterface()){
          eClass.addSuperType(uInterface.getName());
        }
      }
    }
  }

  // line 60 "../../../../src/Generator_CodeEcore.ump"
   private void handleGenericAttribute(EcorePackage rootPackage, UmpleClass uClass, EcoreGenericTypeNode genericTypeNode, String [] parentTypeArgument, int numberOfTypeArgument){
    for(int i=1; i<parentTypeArgument.length; i++){
      String typeArgument = parentTypeArgument[i];
      String[] typeArgumentActualType = null;
      EcoreGenericTypeArgument genericTypeArgument = null;
      
      if(model.getUmpleClass(typeArgument) != null){
        typeArgumentActualType = new String[]{"#//" + typeArgument};
      }else{
        typeArgumentActualType = rootPackage.getActualEType(uClass, typeArgument);
      }
      
      if(EcoreGenModel.ecoreGenericTypeMap.containsKey(typeArgumentActualType[0])){
        String[] value = EcoreGenModel.ecoreGenericTypeMap.get(typeArgumentActualType[0]);
        genericTypeArgument = new EcoreGenericTypeArgument(value[1], genericTypeNode.getIntent()+1);
        handleGenericAttribute(rootPackage, uClass, genericTypeArgument, typeArgumentActualType, Integer.parseInt(value[0]));
      }else{
        genericTypeArgument = new EcoreGenericTypeArgument(typeArgumentActualType[0], genericTypeNode.getIntent()+1);
        handleGenericAttribute(rootPackage, uClass, genericTypeArgument, typeArgumentActualType, 0);
      }
      
      genericTypeArgument.setOrder(i);
      genericTypeNode.addTypeArgument(genericTypeArgument);
    }
    
    for(int i=parentTypeArgument.length; i<=numberOfTypeArgument; i++){
      EcoreGenericTypeArgument genericTypeArgument = new EcoreGenericTypeArgument("", genericTypeNode.getIntent()+1);
      genericTypeArgument.setOrder(i);
      genericTypeNode.addTypeArgument(genericTypeArgument);
    }
  }

  // line 92 "../../../../src/Generator_CodeEcore.ump"
   private void handleAttributes(EcorePackage rootPackage){
    for(EcoreClass eClass : rootPackage.getClasses()){
      if(eClass.getIsInterface()){
        continue;
      }
      
      UmpleClass uClass = model.getUmpleClass(eClass.getName());
      
      for(Attribute uAttribute : uClass.getAttributes()){
        String attrName = uAttribute.getName();
        String typeName = uAttribute.getType() == null ? "String" : uAttribute.getType();  
        
        if(model.getUmpleClass(typeName) != null){
          EcoreReference eReference = new EcoreReference(attrName, eClass.getIntent()+1, typeName);
          if(uAttribute.getIsList()){
            eReference.setUpperBound("-1");
          }
          eClass.addReference(eReference);
        }else{
          String[] type = rootPackage.getActualEType(uClass, uAttribute.getType() == null ? "String" : uAttribute.getType());
          String actualTypeName = type[0];        
          EcoreAttribute eAttribute = null;
          
          if(EcoreGenModel.ecoreGenericTypeMap.containsKey(actualTypeName)){
            String[] value = EcoreGenModel.ecoreGenericTypeMap.get(actualTypeName);
            eAttribute = new EcoreAttribute(attrName, eClass.getIntent()+1, "");
            eAttribute.setIsTransient(true);

            EcoreGenericType genericType = new EcoreGenericType(value[1], eAttribute.getIntent()+1);
            handleGenericAttribute(rootPackage, uClass, genericType, type, Integer.parseInt(value[0]));
            eAttribute.setGenericType(genericType);
          }else if(type.length > 1){
            eAttribute = new EcoreAttribute(attrName, eClass.getIntent()+1, "");
            eAttribute.setIsTransient(true);
            
            EcoreGenericType genericType = new EcoreGenericType(actualTypeName, eAttribute.getIntent()+1);
            handleGenericAttribute(rootPackage, uClass, genericType, type, 0);
            eAttribute.setGenericType(genericType);
          }else{
            eAttribute = new EcoreAttribute(attrName, eClass.getIntent()+1, actualTypeName);
            if(uAttribute.getIsList()){
              eAttribute.setUpperBound("-1");
            }
          }
          eClass.addAttribute(eAttribute);
        }
      }
      
      for(StateMachine sm : uClass.getStateMachines()){
        String smName = sm.getName();
        String enumerationName = "#//" + StringFormatter.toPascalCase(sm.getName());
        EcoreAttribute eAttribute = new EcoreAttribute(smName, eClass.getIntent()+1, enumerationName);
        eClass.addAttribute(eAttribute);
      }
    }
  }

  // line 149 "../../../../src/Generator_CodeEcore.ump"
   private void handleAssociation(EcorePackage rootPackage){
    Set<Association> processedAssociation = new HashSet<Association>();
    
    for(int i=0; i<rootPackage.numberOfClasses(); i++){
      EcoreClass eClass = rootPackage.getClass(i);
      if(eClass.getIsInterface()){
        continue;
      }
      
      UmpleClass uClass = model.getUmpleClass(eClass.getName());
      
      for(Association uAssociation : uClass.getAssociations()){
        if(processedAssociation.contains(uAssociation)){
          continue;
        }
        
        boolean isThisClass = uClass.getName().equals(uAssociation.getEnd(0).getClassName());
        AssociationEnd thisEnd = uAssociation.getEnd(isThisClass ? 0 : 1);
        AssociationEnd thatEnd = uAssociation.getEnd(isThisClass ? 1 : 0);
        EcoreClass eThatClass = null;
        
        for(int j=0; j<rootPackage.numberOfClasses(); j++){
          if(rootPackage.getClass(j).getName().equals(thatEnd.getClassName())){
            eThatClass = rootPackage.getClass(j);
            break;
          }
        }
        
        if(eThatClass != null){
          processedAssociation.add(uAssociation);
                    
          if(uAssociation.getIsLeftNavigable() && eThatClass != null){
            EcoreReference ref = createEcoreAssociation(thisEnd, thatEnd, uAssociation.getIsRightNavigable(), eClass.getIntent()+1);
            eThatClass.addReference(ref);
          }
          
          if(uAssociation.getIsRightNavigable()){
            EcoreReference ref = createEcoreAssociation(thatEnd, thisEnd, uAssociation.getIsLeftNavigable(), eClass.getIntent()+1);
            eClass.addReference(ref);
          }
        }
      }
    }
  }

  // line 194 "../../../../src/Generator_CodeEcore.ump"
   private EcoreReference createEcoreAssociation(AssociationEnd thisEnd, AssociationEnd thatEnd, boolean isBiDirectional, int intent){
    String thisRoleName = thisEnd.getIsDefaultRoleName() ? (thisEnd.getMultiplicity().isMany() ? getModel().getGlossary().getPlural(thisEnd.getRoleName()) : getModel().getGlossary().getSingular(thisEnd.getRoleName())) : thisEnd.getRoleName();
    String thatRoleName = thatEnd.getIsDefaultRoleName() ? (thatEnd.getMultiplicity().isMany() ? getModel().getGlossary().getPlural(thatEnd.getRoleName()) : getModel().getGlossary().getSingular(thatEnd.getRoleName())) : thatEnd.getRoleName();
    EcoreReference thisAssociation = new EcoreReference(thisRoleName, intent, thisEnd.getClassName());
    
    if(isBiDirectional){
      thisAssociation.setEOppositeType(thisEnd.getClassName());
      thisAssociation.setEOppositeName(thatRoleName);
    }
    
    String lower = thisEnd.getLowerBoundString();
    String upper = thisEnd.getUpperBoundString();
    thisAssociation.setLowerBound("*".equals(lower) ? "-1" : lower);
    thisAssociation.setUpperBound("*".equals(upper) ? "-1" : upper);
    
    return thisAssociation;
  }

  // line 212 "../../../../src/Generator_CodeEcore.ump"
   private void handleStateMachine(EcorePackage rootPackage){
    for(EcoreClass eClass : rootPackage.getClasses()){
      if(eClass.getIsInterface()){
        continue;
      }
      
      UmpleClass uClass = model.getUmpleClass(eClass.getName());
      
      for (StateMachine sm : uClass.getStateMachines()){
        if("Simple".equals(sm.getType())){
          String enumName = StringFormatter.toPascalCase(sm.getName());
          EcoreEnum eEnum = new EcoreEnum(enumName, rootPackage.getIntent()+1);
          
          for(int i=0; i<sm.getStates().size(); i++){
            State s = sm.getStates().get(i);
            EcoreEnumItem eEnumItem = new EcoreEnumItem(s.getName(), eEnum.getIntent()+1, i); 
            eEnum.addItem(eEnumItem);
          }
          
          rootPackage.addEnum(eEnum);
        }
      }
    }
  }

  // line 237 "../../../../src/Generator_CodeEcore.ump"
   public void generate(){
    // EPackage setup
    String packageName = getTargetNamespaceName();
    String nsURI = model.getDefaultNamespace() != null ? model.getDefaultNamespace(): model.getUmpleFile().getSimpleFileName();
    EcorePackage rootPackage = new EcorePackage(packageName, 0, nsURI, packageName);
    
    genModel.addPackage(rootPackage);
    
    handleInterfaces(rootPackage);
    handleClasses(rootPackage);
    handleAttributes(rootPackage);
    handleAssociation(rootPackage);
    handleStateMachine(rootPackage);
    
    // Temporarily support one package only
    model.setCode(genModel.getPackage(0).getCode());
    writeModel();
  }

  // line 256 "../../../../src/Generator_CodeEcore.ump"
   private void writeModel(){
    try {
      String path = model.getUmpleFile().getPath();
      File file = new File(path);
      file.mkdirs();
      String modelFilename = path + File.separator + model.getUmpleFile().getSimpleFileName() + ".ecore";
      BufferedWriter bw = new BufferedWriter(new FileWriter(modelFilename));
      bw.write(model.getCode());
      bw.flush();
      bw.close();
    } catch (Exception e) {
      throw new UmpleCompilerException("There was a problem with generating Xmi code." + e, e);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "output" + ":" + getOutput()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "model" + "=" + (getModel() != null ? !getModel().equals(this)  ? getModel().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "genModel" + "=" + (getGenModel() != null ? !getGenModel().equals(this)  ? getGenModel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}