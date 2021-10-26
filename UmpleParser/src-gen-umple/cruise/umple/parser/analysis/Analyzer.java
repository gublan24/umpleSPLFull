/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.parser.analysis;
import java.util.*;
import cruise.umple.parser.*;
import cruise.umple.parser.Token;
import java.io.*;
import java.lang.reflect.*;
import java.lang.IllegalStateException;

/**
 * This is the base class for all Analyzers used in the GrammarAnalyzer.
 * 
 * To properly extend and make use of Analyzer, implementing subclasses
 * must be named the same as the rule they are to analyze in titlecase.
 * 
 * For example, if you were to write an analyzer for the rule "precondition",
 * the analyzer would be named "PreconditionAnalyzer". Then just override 
 * analyze(Token) or prepare(Token) as needed.
 * Copyright: All contributers to the Umple Project
 * 
 * This file is made available subject to the open source license found at:
 * http://umple.org/license
 */
// line 22 "../../../../../src/GrammarParsing.ump"
// line 10 "../../../../../src/GrammarParsing_Code.ump"
public abstract class Analyzer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Analyzer Attributes
  private String name;

  //Analyzer Associations
  private List<Analyzer> children;
  private List<Analyzer> parent;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Analyzer()
  {
    name = null;
    children = new ArrayList<Analyzer>();
    parent = new ArrayList<Analyzer>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }
  /* Code from template association_GetMany */
  public Analyzer getChild(int index)
  {
    Analyzer aChild = children.get(index);
    return aChild;
  }

  public List<Analyzer> getChildren()
  {
    List<Analyzer> newChildren = Collections.unmodifiableList(children);
    return newChildren;
  }

  public int numberOfChildren()
  {
    int number = children.size();
    return number;
  }

  public boolean hasChildren()
  {
    boolean has = children.size() > 0;
    return has;
  }

  public int indexOfChild(Analyzer aChild)
  {
    int index = children.indexOf(aChild);
    return index;
  }
  /* Code from template association_GetMany */
  public Analyzer getParent(int index)
  {
    Analyzer aParent = parent.get(index);
    return aParent;
  }

  public List<Analyzer> getParent()
  {
    List<Analyzer> newParent = Collections.unmodifiableList(parent);
    return newParent;
  }

  public int numberOfParent()
  {
    int number = parent.size();
    return number;
  }

  public boolean hasParent()
  {
    boolean has = parent.size() > 0;
    return has;
  }

  public int indexOfParent(Analyzer aParent)
  {
    int index = parent.indexOf(aParent);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfChildren()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addChild(Analyzer aChild)
  {
    boolean wasAdded = false;
    if (children.contains(aChild)) { return false; }
    children.add(aChild);
    if (aChild.indexOfParent(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aChild.addParent(this);
      if (!wasAdded)
      {
        children.remove(aChild);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeChild(Analyzer aChild)
  {
    boolean wasRemoved = false;
    if (!children.contains(aChild))
    {
      return wasRemoved;
    }

    int oldIndex = children.indexOf(aChild);
    children.remove(oldIndex);
    if (aChild.indexOfParent(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aChild.removeParent(this);
      if (!wasRemoved)
      {
        children.add(oldIndex,aChild);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addChildAt(Analyzer aChild, int index)
  {  
    boolean wasAdded = false;
    if(addChild(aChild))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfChildren()) { index = numberOfChildren() - 1; }
      children.remove(aChild);
      children.add(index, aChild);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveChildAt(Analyzer aChild, int index)
  {
    boolean wasAdded = false;
    if(children.contains(aChild))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfChildren()) { index = numberOfChildren() - 1; }
      children.remove(aChild);
      children.add(index, aChild);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addChildAt(aChild, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfParent()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addParent(Analyzer aParent)
  {
    boolean wasAdded = false;
    if (parent.contains(aParent)) { return false; }
    parent.add(aParent);
    if (aParent.indexOfChild(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aParent.addChild(this);
      if (!wasAdded)
      {
        parent.remove(aParent);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeParent(Analyzer aParent)
  {
    boolean wasRemoved = false;
    if (!parent.contains(aParent))
    {
      return wasRemoved;
    }

    int oldIndex = parent.indexOf(aParent);
    parent.remove(oldIndex);
    if (aParent.indexOfChild(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aParent.removeChild(this);
      if (!wasRemoved)
      {
        parent.add(oldIndex,aParent);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addParentAt(Analyzer aParent, int index)
  {  
    boolean wasAdded = false;
    if(addParent(aParent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParent()) { index = numberOfParent() - 1; }
      parent.remove(aParent);
      parent.add(index, aParent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveParentAt(Analyzer aParent, int index)
  {
    boolean wasAdded = false;
    if(parent.contains(aParent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParent()) { index = numberOfParent() - 1; }
      parent.remove(aParent);
      parent.add(index, aParent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addParentAt(aParent, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Analyzer> copyOfChildren = new ArrayList<Analyzer>(children);
    children.clear();
    for(Analyzer aChild : copyOfChildren)
    {
      aChild.removeParent(this);
    }
    ArrayList<Analyzer> copyOfParent = new ArrayList<Analyzer>(parent);
    parent.clear();
    for(Analyzer aParent : copyOfParent)
    {
      aParent.removeChild(this);
    }
  }


  /**
   * Analyzes the token tree by instantiating the appropriate analyzer
   * for each token rule.
   * 
   * Note: This method makes heavy use of reflection
   * Todo: consider simplifying and making use of the inheritance structure
   */
  // line 22 "../../../../../src/GrammarParsing_Code.ump"
   public void analyzeToken(Token token){
    prepare(token);
    for(Token subtoken:token.getSubTokens())
    {
      for(Analyzer analyzer:children)
      {
        if(analyzer.getName().equals(subtoken.getName()))
        {
          List<Class> classes = new ArrayList<Class>();
          List<String> variables = new ArrayList<String>();
          for(Field field:analyzer.getClass().getDeclaredFields())
          {
            Class<? extends Analyzer> clazz = this.getClass();
            while(clazz!=null&&!"Analyzer".equals(clazz.getSimpleName()))
            {
              for(Field mfield:clazz.getDeclaredFields())
              {
                if(field.getName().equals(mfield.getName()))
                {
                  try 
                  {
                    classes.add(field.getType());
                    variables.add(field.getName().substring(0,1).toUpperCase()+field.getName().substring(1));
                    break;
                  }catch (IllegalArgumentException e){
                    throw new IllegalStateException("Illegal argument encountered", e);
                  }catch (NullPointerException e){
                    throw new IllegalStateException("Null state encountered", e);
                  }
                }
              }
              clazz = (Class<? extends Analyzer>)clazz.getSuperclass();
            }
          }
          try{
            List<Analyzer> originalChildren = analyzer.getChildren();
            analyzer = analyzer.getClass().newInstance();
            for(Analyzer child:originalChildren)
            {
              analyzer.addChild(child);
            }
            for(int i=0;i<classes.size();++i)
            {
              Object object = this.getClass().getMethod("get"+variables.get(i),new Class[]{}).invoke(this);
              analyzer.getClass().getMethod("set"+variables.get(i),new Class[]{classes.get(i)}).invoke(analyzer,object);
            }
          } catch (SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException e) {
           throw new IllegalStateException("Error instantiating method", e);
          }
          analyzer.analyzeToken(subtoken);
          break;
        }
      }
    }
    analyze(token);
  }


  /**
   * Prepare is called before analyzing the token, allowing edits or 
   * sanitizing to be done
   */
  // line 82 "../../../../../src/GrammarParsing_Code.ump"
   public void prepare(Token token){
    
  }


  /**
   * Analyze is called to analyze the particular token
   */
  // line 87 "../../../../../src/GrammarParsing_Code.ump"
   public void analyze(Token token){
    
  }

  // line 91 "../../../../../src/GrammarParsing_Code.ump"
   public String toString(){
    return "Analyzer:"+getName();
  }

}