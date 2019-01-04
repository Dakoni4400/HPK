package de.lab4inf.wrb.rest;

import javax.ws.rs.Path;

import java.util.Locale;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import de.lab4inf.wrb.WRBScript;

@Path(AbstractWRBService.SERVICE)
public class WRBRESTFunctionValuesService extends AbstractWRBService {
	
	protected WRBScript script = new WRBScript();
	
	public WRBScript getScript() {
		return script;
	}
	
	@GET
	@Path(FCT_VALUES_PATH)
	@Produces(TEXT_HTML)
	@Consumes(TEXT_HTML)
	public String getValuesHtml(@QueryParam("fct") String function, 
								@DefaultValue(DEF) @QueryParam("def") String definition,
								@DefaultValue(FMT) @QueryParam("fmt") String format) {		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<!DOCTYPE html><html><head><link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css'><title>WRB Function Values</title></head>");
		sb.append("<body style=\"padding: 0 20px;\"><h1>Function Values</h1>");
		sb.append("<p>Definition: " + definition + "</p>");
		
		
		try {
			script.parse(definition);
		} catch(Exception e) {
			sb.append("<div class=\"alert alert-danger\" role=\"alert\">" + 
					"  Es ist ein Fehler bei der URL Formatierung aufgetreten!\n" + 
					"</div></body></html>");
			
			String retValue = sb.toString();
			return retValue;
		}
		
		double xmin = script.getVariable("xmin"); 
		double xmax = script.getVariable("xmax");
		double dx = script.getVariable("dx");
		
		try {
			sb.append("<p>Values are: xmin = " + xmin + ", xmax = " + xmax + ", dx = " + dx + "</p>");
		
			sb.append("<table class=\"table\">");
			sb.append("<thead><tr><th scope=\"col\">x</th><th scope=\"col\">" + function + "(x)</th></tr></thead>");
			sb.append("<tbody>");
		
			for(double i = xmin; i <= xmax; i += dx) {
				double val = script.getFunction(function).eval(i);
				sb.append("<tr><td>" + i + "</td><td>" + round(val, format) +"</td></tr>");
			}
		
			sb.append("</tbody>");
			sb.append("</table>");
		} catch(Exception e) {
			sb.append("<div class=\"alert alert-danger\" role=\"alert\">" + 
					"  Es ist ein Fehler bei der Berechnung aufgetreten!\n" + 
					"</div></body></html>");
			String retValue = sb.toString();
			return retValue;
		}
		
		sb.append("</body></html>");
		String retValue = sb.toString();
		return retValue;
	}
	
	@GET
	@Path(FCT_VALUES_PATH)
	@Produces(TEXT_PLAIN)
	@Consumes(TEXT_PLAIN)
	public String getValues(@QueryParam("fct") String function, 
					 		@DefaultValue(DEF) @QueryParam("def") String definition,
					 		@DefaultValue(FMT) @QueryParam("fmt") String format) throws IllegalArgumentException{
		StringBuilder sb = new StringBuilder();
		try {
			System.out.println("Parsing: " + definition);
			script.parse(definition);
		} catch(IllegalArgumentException e) {
			System.err.println(e);
			throw new IllegalArgumentException(e.getMessage());
		}
		
		double xmin = script.getVariable("xmin"); 
		double xmax = script.getVariable("xmax");
		double dx = script.getVariable("dx");
		
		for(double i = xmin; i <= xmax; i += dx) {
			double val = script.getFunction(function).eval(i);
			sb.append(i + "," + round(val, format) + ",");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		String retValue = sb.toString();
		return retValue;
	}
	
	public double round(double x, String format) {
        String sx = String.format(Locale.US, format, x);
        double fx = Double.parseDouble(sx);
        return fx;
    }
}
