/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * Represents a comment, such as those found around classes, methods, attributes and associations.
 * 
 */
// line 1173 "../../../../src/Umple.ump"
// line 657 "../../../../src/Umple_Code.ump"
public class Comment
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Comment Attributes
  private String text;
  private boolean annotation;
  private boolean isInline;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Comment(String aText)
  {
    text = aText;
    annotation = false;
    isInline = true;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setText(String aText)
  {
    boolean wasSet = false;
    text = aText;
    wasSet = true;
    return wasSet;
  }

  public boolean setAnnotation(boolean aAnnotation)
  {
    boolean wasSet = false;
    annotation = aAnnotation;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsInline(boolean aIsInline)
  {
    boolean wasSet = false;
    isInline = aIsInline;
    wasSet = true;
    return wasSet;
  }

  /**
   * The text associated with the comment.
   */
  public String getText()
  {
    return text;
  }

  public boolean getAnnotation()
  {
    return annotation;
  }

  public boolean getIsInline()
  {
    return isInline;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isAnnotation()
  {
    return annotation;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsInline()
  {
    return isInline;
  }

  public void delete()
  {}


  /**
   * deep copy constructor
   */
  // line 664 "../../../../src/Umple_Code.ump"
   public  Comment(Comment aComment){
    text = aComment.getText();
    annotation = aComment.getAnnotation();
    isInline = aComment.getIsInline();
  }


  /**
   * 
   * Used to take a comment and process it into a format appropriate for displaying in generated code.
   * 
   * For example, you may want a bunch of inline comments put together and displayed as Javadoc.  This accomplishes that (among others).
   * 
   * @param type Indicates the type of comment which determines how the comments are formatted.  The types are: Hash, Javadoc, Attribute Javadoc, Association Javadoc, Method Javadoc, RubyMultiline, RubyMultiline Internal and Multiline.  Defaults to "//" if not specified.
   * @param allComments A list of comments to be processed and formatted all together as one.
   * 
   * @return The processed/formatted comment appropriate for use in generated code output.
   */
  // line 680 "../../../../src/Umple_Code.ump"
   public static  String format(String type, List<Comment> allComments){
    return format(type, allComments, true);
  }

  // line 685 "../../../../src/Umple_Code.ump"
   public static  String format(String type, List<Comment> allComments, boolean allowAnnotations){
    //String commentDelimiter = type == "Hash" ? "# " : (type == "Javadoc") ? " * " : (type == "Attribute Javadoc") ? "   * " : (type == "Association Javadoc") ? "   * " : (type == "Method Javadoc") ? "   * " : (type == "RubyMultiline") ? "  " : (type == "Multiline") ? "" : "// ";

    String commentDelimiter;
    List<String> deferredAnnotations = new ArrayList<String>();

    // Set the comment delimiter based on the type of the comment. (ex. For Javadoc prepend "*" before every comment line)
    if (type == "Hash")
    {
      commentDelimiter = "# ";
    }
    else if (type == "Javadoc")
    {
      commentDelimiter = " * ";
    }
    else if (type == "Attribute Javadoc")
    {
      commentDelimiter = "   * ";
    }
    else if (type == "Association Javadoc")
    {
      commentDelimiter = "   * ";
    }
    else if (type == "Method Javadoc")
    {
      commentDelimiter = "   * ";
    }
    else if (type == "RubyMultiline")
    {
      commentDelimiter = " ";
    }
    else if (type == "RubyMultiline Internal")
    {
      commentDelimiter = " ";
    }
    else if (type == "Multiline")
    {
      commentDelimiter = "";
    }
    else
    {
      commentDelimiter = "// ";
    }

    if (allComments.size() == 0)
    {
      return null;
    }

    String output = "";
    Boolean foundComment = false;

    for (Comment c : allComments)
    {
      boolean couldTreatAsAnnotation = allowAnnotations;
      
      if (type == "RubyMultiline" || type == "RubyMultiline Internal") {
        couldTreatAsAnnotation = false;
      }
      
      if (type == "Javadoc" || type == "Attribute Javadoc" || type == "Association Javadoc" || type == "Method Javadoc" || type == "RubyMultiline" || type == "RubyMultiline Internal")
      {
        int startIndex = 0;

        // Go through each letter of the current comment to find start of content.
        for (int i = 0; i < c.getText().length(); i++)
        {
          char letter = c.getText().charAt(i);

          // Remove these letters until the actual content is found in the line.
          if (letter == ' ' || letter == '\t' || letter == '*')
          {
            startIndex++;
          }
          // Comment content found, set comment to start here.
          else
          {
            c.setText(c.getText().substring(startIndex));
            break;
          }
        }

        // Special case where the comment line had no content (only spaces, tabs or asterisks).
        if (startIndex == c.getText().length())
        {
          c.setText(c.getText().substring(startIndex));
        }
      }
      
      // If it is an annotation, add at end
      if(c.isAnnotation() && couldTreatAsAnnotation) {
        deferredAnnotations.add(c.getText());
      }
      else
      {
        foundComment = true;
        output += commentDelimiter + c.getText() + "\n";
      }
    }

    // Finalize the comment based on what type it was. (ex. For Javadoc place the "/**" and "*/" around the comment)
    if(foundComment) {
      if (type == "Javadoc")
      {
        output = "/**\n" + output + " */";
      }
      else if (type == "Attribute Javadoc")
      {
        output = "  /**\n" + output + "   */";
      }
      else if (type == "Association Javadoc")
      {
        output = "  /**\n" + output + "   */";
      }
      else if (type == "Method Javadoc")
      {
        output = "  /**\n" + output + "   */";
      }
      else if (type == "RubyMultiline")
      {
        // initialize sb at least as large as the output with 1 comment
        StringBuilder sb = new StringBuilder( output.length() + 2 ); 
        sb.append("#");
        char c;
        for( int i=0; i < output.length(); ++i ){
          c = output.charAt(i);
          sb.append(c);
          if( (c == '\n') && (i != output.length()-1) ){
            sb.append("#");
          }
        }
        output = sb.toString();
      }
      else if (type == "RubyMultiline Internal")
      {
        // initialize sb at least as large as the output with 1 comment
        StringBuilder sb = new StringBuilder( output.length() + 2 ); 
        sb.append("#");
        char c;
        for( int i=0; i < output.length(); ++i ){
          c = output.charAt(i);
          sb.append(c);
          if( (c == '\n') && (i != output.length()-1) ){
            sb.append("  #");
          }
        }
        output = sb.toString();
      }
      else if (type == "Multiline")
      {
        output = "/*\n" + output + "*/";
      }
    }
    
    // Process all deferred annotations if any
    boolean firstAnnotation = true;
    for (String d: deferredAnnotations) {
      if(firstAnnotation) {
        output = output + "\n";
        firstAnnotation = false;
      }
      output = output + "  "+ d + "\n";
    }

    return output.trim();
  }


  public String toString()
  {
    return super.toString() + "["+
            "text" + ":" + getText()+ "," +
            "annotation" + ":" + getAnnotation()+ "," +
            "isInline" + ":" + getIsInline()+ "]";
  }
}