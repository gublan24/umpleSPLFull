/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import cruise.umple.util.*;

/**
 * Util class that has common method called from different trace items
 */
// line 346 "../../../../src/Trace_Code.ump"
public class TraceItemUtil
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TraceItemUtil()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Method to prepare the trace message according to selected tracing technology
   * @params td: trace directive
   * @params gen: code translator
   * @params ti: trace item
   * @params message: trace message to be prepared 
   * @return the trace message after preparation
   * 
   */
  // line 359 "../../../../src/Trace_Code.ump"
   public static  String prepareTraceMessage(TraceDirective td, CodeTranslator gen, TraceItem ti, String message){
    String tracer = td.getTracerType();
		String tracerName = Character.toUpperCase(tracer.charAt(0)) + tracer.substring(1);

		if(tracer.equals("log4j"))
		{
			message = prepareLog4jMessages(td,gen,ti,message);
		}
		else if(tracer.equals("javaapi") || tracer.equals("lttng"))
		{
			message = prepareJavaLogAPIMessages(td,gen,ti,message);
		}
		else if(tracer.equals("lttngjni"))
		{
			message = prepareJavaLttngJniMessages(td,gen,ti,message + ", "+gen.translate("traceThread",ti));
		}
		else
		{
			message = StringFormatter.format(gen.translate("traceTemplate",ti),tracerName,message);
		}

		return message;
  }


  /**
   * Method to prepare the trace message according to log4j logging framework
   */
  // line 385 "../../../../src/Trace_Code.ump"
   public static  String prepareLog4jMessages(TraceDirective td, CodeTranslator gen, TraceItem traceItem, String message){
    Postfix postfix = td.getPostfix();
		int logCounter = postfix.numberOfLogLevels();
		String messages = "";

		if(logCounter == 0)
		{
			message = StringFormatter.format(gen.translate("traceTemplatelog4j",traceItem),"info",message);
		}
		else if( logCounter == 1 && postfix.getLogLevel(0).getLevel().equals("all")) 
		{
			String[] logLevels = {"trace","debug","info","warn","error","fatal"};
			logCounter = 6;
			for( String level : logLevels )
			{
				--logCounter;
				messages += StringFormatter.format(gen.translate("traceTemplatelog4j",traceItem),level,message);
				if( logCounter > 0 ) messages += "{0}";
			}
			message = StringFormatter.format(messages,"\n");
		}
		else 
		{
			for( LogLevel level : postfix.getLogLevels() )
			{
				--logCounter;
				messages += StringFormatter.format(gen.translate("traceTemplatelog4j",traceItem),level.getLevel(),message);
				if( logCounter > 0 ) 
				{
					messages += "{0}";
				}
			}
			message = StringFormatter.format(messages,"\n");
		}

		return message;
  }


  /**
   * Method to prepare the trace message according to Java logging API
   */
  // line 425 "../../../../src/Trace_Code.ump"
   public static  String prepareJavaLogAPIMessages(TraceDirective td, CodeTranslator gen, TraceItem traceItem, String message){
    Postfix postfix = td.getPostfix();
		int logCounter = postfix.numberOfLogLevels();
		String messages = "";

		if(logCounter == 0)
		{
			message = StringFormatter.format(gen.translate("traceTemplatelog4j",traceItem),"info",message);
		}
		else if( logCounter == 1 && postfix.getLogLevel(0).getLevel().equals("all")) 
		{
			String[] logLevels = {"finest","finer","fine","config","info","warning","severe"};
			logCounter = 6;
			for( String level : logLevels )
			{
				--logCounter;
				messages += StringFormatter.format(gen.translate("traceTemplatelog4j",traceItem),level,message);
				if( logCounter > 0 ) 
				{
					messages += "{0}";
				}
			}
			message = StringFormatter.format(messages,"\n");
		}
		else {

			for( LogLevel level : td.getPostfix().getLogLevels() )
			{
				--logCounter;
				messages += StringFormatter.format(gen.translate("traceTemplatelog4j",traceItem),level.getLevel(),message);
				if( logCounter > 0 ) messages += "{0}";
			}
			message = StringFormatter.format(messages,"\n");
		}

		return message;
  }


  /**
   * Method to prepare the trace message according to early version of LTTng
   */
  // line 465 "../../../../src/Trace_Code.ump"
   public static  String prepareJavaLttngJniMessages(TraceDirective td, CodeTranslator gen, TraceItem traceItem, String message){
    message = StringFormatter.format(gen.translate("traceTemplatelttng",traceItem),"tracepointInt",message);
		return message;
  }


  /**
   * prepare Trace Mesaage Layout based in inclusion/exclusion criteria
   */
  // line 471 "../../../../src/Trace_Code.ump"
   public static  String prepareMessageLayout(CodeTranslator gen, TracerDirective tracer, TraceItem ti){
    String concatinator = gen.translate("traceConcatinator",ti);
		String comma = concatinator+"\",\""+concatinator;
		String messageLayout = "{0}"+comma+"{1}"+concatinator+"\",{2},{3},{4},\""+concatinator+"{5}"+concatinator+"\",{6},{7},\""+concatinator+"{8}";

		if( tracer.hasTraceMessageSwitch() )
		{
			TraceMessageSwitch tms = tracer.getTraceMessageSwitch();
			messageLayout = "";
			String comp1 = "{0}"
					,comp2 = "{1}"
					,comp3 = "{2}"
					,comp4 = "{3}"
					,comp5 = "{4}"
					,comp6 = "{5}"
					,comp7 = "{6}"
					,comp8 = "{7}"
					,comp9 = "{8}";

			if( tms.getOn() )
			{
				for(MessageComponent mc : tms.getOption() )
				{
					if(mc.getComponent().equals("Time")) messageLayout += comp1;
					if(mc.getComponent().equals("Thread")) messageLayout += comma+comp2;
					if(mc.getComponent().equals("UmpleFile")) messageLayout += comma+comp3;
					if(mc.getComponent().equals("LineNumber")) messageLayout += comma+comp4;
					if(mc.getComponent().equals("Class")) messageLayout += comma+comp5;
					if(mc.getComponent().equals("Object")) messageLayout += comma+comp6;
					if(mc.getComponent().equals("Operation")) messageLayout += comma+comp7;
					if(mc.getComponent().equals("Name")) messageLayout += comma+comp8;
					if(mc.getComponent().equals("Value")) messageLayout += comma+comp9;
				}
			}
			else if( tms.getOff() )
			{
				messageLayout = "{0}"+comma+"{1}"+comma+"{2}"+comma+"{3}"+comma+"{4}"+comma+"{5}"+comma+"{6}"+comma+"{7}"+comma+"{8}";

				for(MessageComponent mc : tms.getOption() )
				{
					if(mc.getComponent().equals("Time")) messageLayout = messageLayout.replace("{0}"+comma, "");
					if(mc.getComponent().equals("Thread")) messageLayout = messageLayout.replace("{1}"+comma, "");
					if(mc.getComponent().equals("UmpleFile")) messageLayout = messageLayout.replace("{2}"+comma, "");
					if(mc.getComponent().equals("LineNumber")) messageLayout = messageLayout.replace("{3}"+comma, "");
					if(mc.getComponent().equals("Class")) messageLayout = messageLayout.replace("{4}"+comma, "");
					if(mc.getComponent().equals("Object")) messageLayout = messageLayout.replace("{5}"+comma, "");
					if(mc.getComponent().equals("Operation")) messageLayout = messageLayout.replace("{6}"+comma, "");
					if(mc.getComponent().equals("Name")) messageLayout = messageLayout.replace("{7}"+comma, "");
					if(mc.getComponent().equals("Value")) messageLayout = messageLayout.replace("{8}"+comma, "");
				}
			}
		}

		return messageLayout;
  }

}