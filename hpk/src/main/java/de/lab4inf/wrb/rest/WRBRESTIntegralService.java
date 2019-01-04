package de.lab4inf.wrb.rest;

import de.lab4inf.wrb.Integrator;
import de.lab4inf.wrb.WRBScript;

import javax.ws.rs.Path;

import java.util.Locale;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path(AbstractWRBService.SERVICE)
public class WRBRESTIntegralService extends AbstractWRBService {
	
	protected WRBScript script = new WRBScript();
	protected Integrator in = new Integrator();

	public WRBScript getScript() {
		return script;
	}
	
	@GET
	@Path(FCT_INTEGRAL_PATH)
	@Produces(TEXT_HTML)
	@Consumes(TEXT_HTML)
	public String getIntegral(@QueryParam("fct") String function,
							  @DefaultValue(DEF) @QueryParam("def") String definition, 
							  @DefaultValue(FMT) @QueryParam("fmt") String format) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<!DOCTYPE html><html><head><link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css'><title>WRB Integral</title></head>");
		sb.append("<body style=\"padding: 0 20px;\"><h1>Integral</h1>");
		
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
		
		try {
			double val = in.integrate(script.getFunction(function), xmin, xmax);
			sb.append("<h2 style=\"float: left; font-size: 56px; font-weight: normal\">&int;</h2>");
			sb.append("<p style=\"float: left\">" + xmax + "<br/>" + function + "(x) dx = " + round(val, format) + "<br/>" + xmin + "</p>");
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
	@Path(FCT_INTEGRAL_PATH)
	@Produces(TEXT_PLAIN)
	@Consumes(TEXT_PLAIN)
	public String getDifferential(@QueryParam("fct") String function, 
					 			  @DefaultValue(DEF) @QueryParam("def") String definition,
					 			  @DefaultValue(FMT) @QueryParam("fmt") String format) throws IllegalArgumentException{
		StringBuilder sb = new StringBuilder();
		
		script.parse(definition);
		
		double xmin = script.getVariable("xmin"); 
		double xmax = script.getVariable("xmax");
		
		double val = in.integrate(script.getFunction(function), xmin, xmax);
		sb.append(round(val, format));
		
		String retValue = sb.toString();
		return retValue;
	}
	
	public double round(double x, String format) {
        String sx = String.format(Locale.US,  format, x);
        double fx = Double.parseDouble(sx);
        return fx;
    }
}
