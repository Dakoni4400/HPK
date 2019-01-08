package de.lab4inf.wrb.rest;

import de.lab4inf.wrb.Differentiator;
import de.lab4inf.wrb.WRBScript;

import javax.ws.rs.Path;

import java.util.Locale;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path(AbstractWRBService.SERVICE)
public class WRBRESTDifferentialService extends AbstractWRBService {

	protected WRBScript script = new WRBScript();
	
	protected Differentiator dif = new Differentiator();
	
	public WRBScript getScript() {
		return script;
	}
	
	@GET
	@Path(FCT_DIFFERENTIAL_PATH)
	@Produces(TEXT_HTML)
	@Consumes(TEXT_HTML)
	public String getDifferentialHtml(@QueryParam("fct") String function,
								      @DefaultValue(DEF) @QueryParam("def") String definition,
								      @DefaultValue(FMT) @QueryParam("fmt") String format) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<!DOCTYPE html><html><head><link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css'><title>WRB Differential</title></head>");
		sb.append("<body style=\"padding: 0 20px;\"><h1>Differential</h1>");
		
		try {			
				sb.append("<p>" + function + "'(x) = " + getDifferential(function, definition, format) + "</p>");
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
	@Path(FCT_DIFFERENTIAL_PATH)
	@Produces(TEXT_PLAIN)
	@Consumes(TEXT_PLAIN)
	public String getDifferential(@QueryParam("fct") String function, 
					 			  @DefaultValue(DEF) @QueryParam("def") String definition,
					 			  @DefaultValue(FMT) @QueryParam("fmt") String format) throws IllegalArgumentException{
		StringBuilder sb = new StringBuilder();
		try {
			System.out.println("Parsing: " + definition);
			script.parse(definition);
		} catch(IllegalArgumentException e) {
			System.err.println(e);
			throw new IllegalArgumentException(e);
		}
		
		
		double x = script.getVariable("x");
		double val = dif.differentiate(script.getFunction(function), x);
		System.out.println(val);
		sb.append(round(val, format));
		
		String retValue = sb.toString();
		return retValue;
	}
	
	public double round(double x, String format){
		System.out.println(format);
        String sx = String.format(Locale.US, format, x);
        System.out.println(sx);
        double fx = Double.parseDouble(sx);
        return fx;
    }
	
}
