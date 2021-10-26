/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.util;
import java.util.*;

// line 24 "../../../../src/Util_Code.ump"
public class Language
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static Language theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private Language()
  {
    // line 29 "../../../../src/Util_Code.ump"
    init();
    // END OF UMPLE BEFORE INJECTION
  }

  public static Language getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new Language();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  // line 36 "../../../../src/Util_Code.ump"
   private void init(){
    _allEnglish = new Hashtable<String, String>();
    add("problem_with_umple_file","Unable to use @1, due to @2");
  }

  // line 42 "../../../../src/Util_Code.ump"
   public static  void reset(){
    getInstance().init();
  }

  // line 47 "../../../../src/Util_Code.ump"
   public void add(String id, String english){
    _allEnglish.put(id, english);
  }

  // line 52 "../../../../src/Util_Code.ump"
   public String lookup(String id){
    return lookup(id,default_strictness);
  }

  // line 57 "../../../../src/Util_Code.ump"
   public String lookup(String id, boolean isStrict){
    String defaultText = isStrict ? "UNKNOWN: " + id : id;
    return _allEnglish.containsKey(id) ? _allEnglish.get(id) : defaultText;
  }

  // line 63 "../../../../src/Util_Code.ump"
   public String lookup(String id, String [] allReplacements){
    return lookup(id,true,allReplacements);
  }

  // line 68 "../../../../src/Util_Code.ump"
   public String lookup(String id, boolean isStrict, String [] allReplacements){
    String text = lookup(id,isStrict);
    for (int i=1; i<=allReplacements.length; i++)
    {
      text = text.replace("@" + i, allReplacements[i-1]);
    }
    return text;
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 31 "../../../../src/Util_Code.ump"
  private static final boolean default_strictness = false ;
// line 32 "../../../../src/Util_Code.ump"
  private Hashtable<String, String> _allEnglish ;

  
}