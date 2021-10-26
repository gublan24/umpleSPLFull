/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import java.util.*;
import java.io.Serializable;

// line 1419 "../../../../../UmpleTLTemplates/Core.ump"
public class SuperMemberInitializer extends MemberInitializer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SuperMemberInitializer(String aMember)
  {
    super(aMember);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

  // line 1424 "../../../../../UmpleTLTemplates/Core.ump"
  public String declaration(GenMethod method){
    List<String> collect = new ArrayList<String>();
		if(method instanceof GenBaseConstructorMethod){
			collect.addAll(((GenBaseConstructorMethod)method).getPrePolymorphicParameters().stream()
					 .map(GenMethodParameter::getName).collect(Collectors.toList()));
		}
		 
		collect.addAll(getInitializers().stream().map(GenFieldInitializer::getValue).collect(Collectors.toList()));
		  
		String string = getMember()+ "("+ collect.stream().collect(Collectors.joining(", "))+ ")";
		return string;
  }

}