/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 22 "../../../../src/UmpleHelper.ump"
public class UncaughtException
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UncaughtException Attributes
  private String uncaughtClassName;
  private String uncaughtMethodName;
  private List<String> uncaughtFileName;
  private List<Integer> uncaughtUmpleLine;
  private List<Integer> uncaughtJavaLine;
  private List<Integer> uncaughtLength;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UncaughtException(String aUncaughtClassName, String aUncaughtMethodName)
  {
    uncaughtClassName = aUncaughtClassName;
    uncaughtMethodName = aUncaughtMethodName;
    uncaughtFileName = new ArrayList<String>();
    uncaughtUmpleLine = new ArrayList<Integer>();
    uncaughtJavaLine = new ArrayList<Integer>();
    uncaughtLength = new ArrayList<Integer>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUncaughtClassName(String aUncaughtClassName)
  {
    boolean wasSet = false;
    uncaughtClassName = aUncaughtClassName;
    wasSet = true;
    return wasSet;
  }

  public boolean setUncaughtMethodName(String aUncaughtMethodName)
  {
    boolean wasSet = false;
    uncaughtMethodName = aUncaughtMethodName;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addUncaughtFileName(String aUncaughtFileName)
  {
    boolean wasAdded = false;
    wasAdded = uncaughtFileName.add(aUncaughtFileName);
    return wasAdded;
  }

  public boolean removeUncaughtFileName(String aUncaughtFileName)
  {
    boolean wasRemoved = false;
    wasRemoved = uncaughtFileName.remove(aUncaughtFileName);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addUncaughtUmpleLine(Integer aUncaughtUmpleLine)
  {
    boolean wasAdded = false;
    wasAdded = uncaughtUmpleLine.add(aUncaughtUmpleLine);
    return wasAdded;
  }

  public boolean removeUncaughtUmpleLine(Integer aUncaughtUmpleLine)
  {
    boolean wasRemoved = false;
    wasRemoved = uncaughtUmpleLine.remove(aUncaughtUmpleLine);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addUncaughtJavaLine(Integer aUncaughtJavaLine)
  {
    boolean wasAdded = false;
    wasAdded = uncaughtJavaLine.add(aUncaughtJavaLine);
    return wasAdded;
  }

  public boolean removeUncaughtJavaLine(Integer aUncaughtJavaLine)
  {
    boolean wasRemoved = false;
    wasRemoved = uncaughtJavaLine.remove(aUncaughtJavaLine);
    return wasRemoved;
  }
  /* Code from template attribute_SetMany */
  public boolean addUncaughtLength(Integer aUncaughtLength)
  {
    boolean wasAdded = false;
    wasAdded = uncaughtLength.add(aUncaughtLength);
    return wasAdded;
  }

  public boolean removeUncaughtLength(Integer aUncaughtLength)
  {
    boolean wasRemoved = false;
    wasRemoved = uncaughtLength.remove(aUncaughtLength);
    return wasRemoved;
  }

  public String getUncaughtClassName()
  {
    return uncaughtClassName;
  }

  public String getUncaughtMethodName()
  {
    return uncaughtMethodName;
  }
  /* Code from template attribute_GetMany */
  public String getUncaughtFileName(int index)
  {
    String aUncaughtFileName = uncaughtFileName.get(index);
    return aUncaughtFileName;
  }

  public String[] getUncaughtFileName()
  {
    String[] newUncaughtFileName = uncaughtFileName.toArray(new String[uncaughtFileName.size()]);
    return newUncaughtFileName;
  }

  public int numberOfUncaughtFileName()
  {
    int number = uncaughtFileName.size();
    return number;
  }

  public boolean hasUncaughtFileName()
  {
    boolean has = uncaughtFileName.size() > 0;
    return has;
  }

  public int indexOfUncaughtFileName(String aUncaughtFileName)
  {
    int index = uncaughtFileName.indexOf(aUncaughtFileName);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Integer getUncaughtUmpleLine(int index)
  {
    Integer aUncaughtUmpleLine = uncaughtUmpleLine.get(index);
    return aUncaughtUmpleLine;
  }

  public Integer[] getUncaughtUmpleLine()
  {
    Integer[] newUncaughtUmpleLine = uncaughtUmpleLine.toArray(new Integer[uncaughtUmpleLine.size()]);
    return newUncaughtUmpleLine;
  }

  public int numberOfUncaughtUmpleLine()
  {
    int number = uncaughtUmpleLine.size();
    return number;
  }

  public boolean hasUncaughtUmpleLine()
  {
    boolean has = uncaughtUmpleLine.size() > 0;
    return has;
  }

  public int indexOfUncaughtUmpleLine(Integer aUncaughtUmpleLine)
  {
    int index = uncaughtUmpleLine.indexOf(aUncaughtUmpleLine);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Integer getUncaughtJavaLine(int index)
  {
    Integer aUncaughtJavaLine = uncaughtJavaLine.get(index);
    return aUncaughtJavaLine;
  }

  public Integer[] getUncaughtJavaLine()
  {
    Integer[] newUncaughtJavaLine = uncaughtJavaLine.toArray(new Integer[uncaughtJavaLine.size()]);
    return newUncaughtJavaLine;
  }

  public int numberOfUncaughtJavaLine()
  {
    int number = uncaughtJavaLine.size();
    return number;
  }

  public boolean hasUncaughtJavaLine()
  {
    boolean has = uncaughtJavaLine.size() > 0;
    return has;
  }

  public int indexOfUncaughtJavaLine(Integer aUncaughtJavaLine)
  {
    int index = uncaughtJavaLine.indexOf(aUncaughtJavaLine);
    return index;
  }
  /* Code from template attribute_GetMany */
  public Integer getUncaughtLength(int index)
  {
    Integer aUncaughtLength = uncaughtLength.get(index);
    return aUncaughtLength;
  }

  public Integer[] getUncaughtLength()
  {
    Integer[] newUncaughtLength = uncaughtLength.toArray(new Integer[uncaughtLength.size()]);
    return newUncaughtLength;
  }

  public int numberOfUncaughtLength()
  {
    int number = uncaughtLength.size();
    return number;
  }

  public boolean hasUncaughtLength()
  {
    boolean has = uncaughtLength.size() > 0;
    return has;
  }

  public int indexOfUncaughtLength(Integer aUncaughtLength)
  {
    int index = uncaughtLength.indexOf(aUncaughtLength);
    return index;
  }

  public void delete()
  {}

  // line 33 "../../../../src/UmpleHelper.ump"
   public String toString(){
    StringBuilder builder = new StringBuilder();
    builder.append("    public UmpleSourceData ");
    builder.append(uncaughtClassName);
    builder.append("_");
    builder.append(uncaughtMethodName);
    builder.append("(){ return new UmpleSourceData().setFileNames(\"");
    String filename = uncaughtFileName.toString().replace("\"","").replace(", ","\",\"");
    if(filename.contains("/"))
    filename = filename.substring(filename.lastIndexOf("/") + 1);
    builder.append(filename.substring(1,filename.length()-1));
    builder.append("\").setUmpleLines(");    
    String line = uncaughtUmpleLine.toString();
    builder.append(line.substring(1,line.length()-1));
    builder.append(").setJavaLines(");
    String javaline = uncaughtJavaLine.toString();
    builder.append(javaline.substring(1,javaline.length()-1));
    builder.append(").setLengths(");
    String length = uncaughtLength.toString();
    builder.append(length.substring(1,length.length()-1));
    builder.append(");}");
    return builder.toString();
  }

}