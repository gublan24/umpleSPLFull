/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 182 "../../../../src/UmpleImport.ump"
// line 120 "../../../../src/UmpleImport_CodeModels.ump"
public class UmpleImportAttribute extends UmpleImportElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmpleImportAttribute Attributes
  private String className;
  private String dataType;
  private int lowerBound;
  private int upperBound;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleImportAttribute(String aId, String aName, String aClassName, String aDataType)
  {
    super(aId, aName);
    className = aClassName;
    dataType = aDataType;
    lowerBound = 0;
    upperBound = 1;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setClassName(String aClassName)
  {
    boolean wasSet = false;
    className = aClassName;
    wasSet = true;
    return wasSet;
  }

  public boolean setDataType(String aDataType)
  {
    boolean wasSet = false;
    dataType = aDataType;
    wasSet = true;
    return wasSet;
  }

  public boolean setLowerBound(int aLowerBound)
  {
    boolean wasSet = false;
    lowerBound = aLowerBound;
    wasSet = true;
    return wasSet;
  }

  public boolean setUpperBound(int aUpperBound)
  {
    boolean wasSet = false;
    upperBound = aUpperBound;
    wasSet = true;
    return wasSet;
  }

  public String getClassName()
  {
    return className;
  }

  public String getDataType()
  {
    return dataType;
  }

  /**
   * primitive type as default
   */
  public int getLowerBound()
  {
    return lowerBound;
  }

  /**
   * primitive type as default
   */
  public int getUpperBound()
  {
    return upperBound;
  }

  public void delete()
  {
    super.delete();
  }

  // line 123 "../../../../src/UmpleImport_CodeModels.ump"
  public String generateUmple(){
    StringBuilder builder = this.getUmpleBuilder();
      String umpleType = getUmpleTypeFromEcoreType(this.dataType);
      builder.append(System.lineSeparator()+"\t" + umpleType + this.getName()+";");
      return builder.toString();
  }

  // line 131 "../../../../src/UmpleImport_CodeModels.ump"
   private String getUmpleTypeFromEcoreType(String uType){
    String ret="";
    if(uType.equals("EInt"))
      ret = "Integer";
    else if(uType.equals("EDouble"))
      ret = "Double";
    else if(uType.equals("EDate"))
      ret = "Date";
    else if(uType.equals("EBoolean"))
      ret = "Boolean";
    else if(uType.equals("EString")){
      if(upperBound!=1)
        ret = "String";
    }
    else
      ret = uType;
    if(upperBound!=1)
        ret +="[]";
    if(!ret.isEmpty())
      ret += " ";
    return ret;
  }


  public String toString()
  {
    return super.toString() + "["+
            "className" + ":" + getClassName()+ "," +
            "dataType" + ":" + getDataType()+ "," +
            "lowerBound" + ":" + getLowerBound()+ "," +
            "upperBound" + ":" + getUpperBound()+ "]";
  }
}