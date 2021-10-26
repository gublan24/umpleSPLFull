/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 68 "../../../../src/UmpleHelper.ump"
// line 65 "../../../../src/UmpleHelper_Code.ump"
public class UmpleParserFactory
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleParserFactory()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 71 "../../../../src/UmpleHelper_Code.ump"
   public static  UmpleParser create(String className){
    //FAST THAN REFLECTION, LOAD THE KNOWN IMPLEMENTORS
    if ("cruise.umple.compiler.UmpleInternalParser".equals(className) || "UmpleInternalParser".equals(className))
    {
      return new UmpleInternalParser();
    }
    else if ("cruise.umple.compiler.UmpleXtextParser".equals(className) || "UmpleXtextParser".equals(className))
    {
      return new UmpleXtextParser();
    }
  
    Object object = null;
    try 
    {
      Class<?> classDefinition = Class.forName(className);
      object = classDefinition.newInstance();
      return (UmpleParser)object;
    } 
    catch (Exception e) 
    { 
      return null;
    }
  }

  // line 96 "../../../../src/UmpleHelper_Code.ump"
   public static  UmpleParser create(String umpleParserName, UmpleModel model){
    return create(umpleParserName,model,false);
  }

  // line 101 "../../../../src/UmpleHelper_Code.ump"
   public static  UmpleParser create(String umpleParserName, boolean failHardIfInvalid){
    return create(umpleParserName,null,failHardIfInvalid);
  }

  // line 106 "../../../../src/UmpleHelper_Code.ump"
   public static  UmpleParser create(String umpleParserName, UmpleModel model, boolean failHardIfInvalid){
    UmpleParser p = create(umpleParserName);
    if (p == null && failHardIfInvalid)
    {
      org.junit.Assert.fail("Unknown parser " + umpleParserName);
    }
    if (model != null)
    {
      p.setModel(model);
    }
    return p;
  }

}