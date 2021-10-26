/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 29 "../../../../src/SimpleMetrics_Util.ump"
public class Format
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Format()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 31 "../../../../src/SimpleMetrics_Util.ump"
   public static  String repeat(String string, int quantidade){
    StringBuffer retorno = new StringBuffer();   
    for (int j=0; j<quantidade; j++){   
      retorno.append(string);   
    }   
    return retorno.toString();
  }

}