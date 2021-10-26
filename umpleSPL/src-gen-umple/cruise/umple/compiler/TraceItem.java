/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/
package cruise.umple.compiler;
import java.util.*;
// line 145 "../../../../src/Trace.ump"
public interface TraceItem
{
  
  public String getTracerType() ;

  public Boolean getIsPre() ;

  public Boolean getIsPost() ;

  public String trace(CodeTranslator gen, Object o, String template, UmpleClass uClass, String... args) ;

  public String getPeriodClause() ;

  public String getExtremities(CodeTranslator gen, String name) ;

}