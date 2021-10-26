/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

// line 1279 "../../../../../UmpleTLTemplates/Core.ump"
public abstract class AbstractGenBody
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AbstractGenBody Attributes
  private int priority;
  private String body;
  private String type;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AbstractGenBody(String aBody)
  {
    priority = 0;
    body = aBody;
    type = "block";
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPriority(int aPriority)
  {
    boolean wasSet = false;
    priority = aPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setBody(String aBody)
  {
    boolean wasSet = false;
    body = aBody;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public int getPriority()
  {
    return priority;
  }

  public String getBody()
  {
    // line 1293 "../../../../../UmpleTLTemplates/Core.ump"
    List<GenBody> bodies= new ArrayList<GenBody>();
    		dynamicContent(bodies);
    		if(!bodies.isEmpty()){
    			if(body!= null && !body.isEmpty()){
    				bodies.add(new GenBody(body));
    			}
    			
    			return bodies.stream().map(GenBody::getBody).collect(Collectors.joining(NL));
    		}
    // END OF UMPLE BEFORE INJECTION
    return body;
  }

  public String getType()
  {
    return type;
  }

  public void delete()
  {}

  // line 1305 "../../../../../UmpleTLTemplates/Core.ump"
  public void dynamicContent(List<GenBody> bodies){
    //For sub-classes
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _cr(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String cr(){
        StringBuilder sb = new StringBuilder();
    return this._cr(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "priority" + ":" + getPriority()+ "," +
            "body" + ":" + getBody()+ "," +
            "type" + ":" + getType()+ "]";
  }
}