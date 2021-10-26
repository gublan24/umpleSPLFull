/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Helpr class to handle the process of emiitting the code to its eqivalent in JET based
 * on the existing template elements and their contents, expressions, etc.
 */
// line 404 "../../../../src/Template.ump"
public class Utils
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static Utils theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private Utils()
  {}

  public static Utils getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new Utils();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 409 ../../../../src/Template.ump
  private static Pattern newLinePattern = Pattern.compile("([\\n][\\r]?|[\\r][\\n]?)", Pattern.MULTILINE);
	
	// TODO : Replace with array which cover all umple language codeblocks
	private static MethodTemplateFormatter javaTemplateFormatter = new JavaMethodTemplateFormatter();
	private static MethodTemplateFormatter cppTemplateFormatter = new CppMethodTemplateFormatter();
	
	
	public static boolean isBlank(String str) {
		int len = str == null ? 0 : str.length();
		if (len == 0) {
			return true;
		}
	    for (int i = 0; i < len; i++) {
	    	if (!Character.isWhitespace(str.charAt(i)))
	    		return false;
	    }
	    return true;
	}
	
	public static int numberOfLines = 0;
	
	// JET Style
	public static String nlize(String lang, String str) {
	  StringBuilder result = new StringBuilder(str.length());
	  Matcher m = newLinePattern.matcher(str);
	  numberOfLines = 0;
	  if(m.find()) {
		  int currentIndex = 0;
		  boolean first = true;
		  do{
			  if(first) {
				  first = false;
			  } else {
				  result.append(Utils.getStringConcat(lang)); 
			  }
			  if(m.start() > currentIndex) {
			  	  if(lang.equalsIgnoreCase("Cpp")) {
			  	  	result.append("string(\"");			  	  	
			  	  } else {
			  	  	result.append('"');
			  	  }
				  
				  result.append(Utils.escapeString(str.substring (currentIndex, m.start())));
				  
				  if(lang.equalsIgnoreCase("Cpp")) {
			  	  	result.append("\")");			  	  	
			  	  } else {
			  	  	result.append('"');
			  	  }
				  result.append(Utils.getStringConcat(lang)); 
			  }
			  result.append(Utils.getLineSeparator());
			  ++numberOfLines;
			  currentIndex = m.end();
		  } while( m.find());
		  if(currentIndex < str.length()) {
			  if(!first) {
				  result.append(Utils.getStringConcat(lang));
				  if(lang.equalsIgnoreCase("Cpp")) {
			  	  	result.append("string(\"");		  	  	
			  	  } else {
			  	  	result.append('"');
			  	  }
			  	  
				  result.append(Utils.escapeString(str.substring(currentIndex)));
				  
				  if(lang.equalsIgnoreCase("Cpp")) {
			  	  	result.append("\")");			  	  	
			  	  } else {
			  	  	result.append('"');
			  	  }
			  }
		  }
		  return result.toString();
	  } else {
		  result.append('"');
		  result.append(Utils.escapeString(str));
		  result.append('"');
		  return result.toString();
	  }
  	}
  	
  	public static String getLineSeparatorValue(String lang) {
  		if(lang.equalsIgnoreCase("Java")) {  
  			return "System.getProperty(\"line.separator\")";
  		} else if(lang.equalsIgnoreCase("Cpp")) {  
//	    	return "endl";
			return "string(\"\\n\")";
	  	}
	  	return "\n";
	 }
  	
  	public static String getLineSeparator() {
  		return "NL";
	 }
	
	public static String getStringConcat(String lang) {
  		if(lang.equalsIgnoreCase("Java")) {  
  			return " + ";  
  		} else if(lang.equalsIgnoreCase("Cpp")) {  
	    	return " + ";  
	  	}
	  	return "";
	 }
	
	public static MethodTemplateFormatter getMethodTemplateFormatter(String lang) {
  		if(lang.equalsIgnoreCase("Java")) {  
  			return javaTemplateFormatter; 
  		} else if(lang.equalsIgnoreCase("Cpp")) {  
  			return cppTemplateFormatter;
	  	}
	  	// TODO : Unspecified Lang code handler
	  	return null; 
  	}
	  	
  	
  	public static void getStringAppend(String lang, StringBuilder sb, String value) {
  		if(lang.equalsIgnoreCase("Java")) {  
  			sb.append("realSb.append(");
  			sb.append(value);
  			sb.append(");");
  		} else if(lang.equalsIgnoreCase("Cpp")) {  
//	    	sb.append("sb << ");
	    	sb.append("(*realSb)+= ");
  			sb.append(value);
  			sb.append(";");
	  	}
  	}

	 /*
	  public static String trimTemplateBlockNewLines(String str) {
        int end = str.length;
        int start = 0;
        while ((start < end) && (str.charAt(start) == '\n')) {
            start++;
        }
        while ((start < end) && (str.charAt(end - 1) == '\n')) {
        	end--;
        }
        if (str.charAt(end-1) == '\r') {
        	end--;
        }
        return ((start > 0) || (end < str.length)) ? str.substring(start, end) : str;
    	}
    */
	 
	  public static String trimTemplateBlockBeginigNewLine(String str) {
	  	Pattern spacesNewLinePattern = Pattern.compile("^([\\n][\\r]?|[\\r][\\n]?)");
	  	Matcher m = spacesNewLinePattern.matcher(str);
	  	return (m.find()) ? str.substring(m.end()) : str;
      }
    
     public static String trimTemplateBlockEndNewLine(String str) {
	  	Pattern endSpacesNewLinePattern = Pattern.compile("([\\n][\\r]?|[\\r][\\n]?)( )*$" /*, Pattern.MULTILINE*/);
	  	Matcher m = endSpacesNewLinePattern.matcher(str);
	  	return (m.find()) ? str.substring(0,m.start()) : str;
      }
	
  	
	public static String escapeString(String str) {
		return str.replaceAll("\n", "\\\\n")
				  .replaceAll("\r", "\\\\r")
				  .replaceAll("\t", "  ") // Two spaces instead of tab
				  .replaceAll("\\\\", "\\\\\\\\")
				  .replaceAll("\b", "\\\\b")
				  .replaceAll("\f", "\\\\f")
				  .replaceAll("\'", "\\\'")
				  .replaceAll("\"", "\\\"")
				  .replace("\"","\\\"");
	}
  
}