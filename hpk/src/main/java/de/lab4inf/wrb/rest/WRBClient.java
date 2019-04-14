package de.lab4inf.wrb.rest;

import static java.lang.String.format;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class WRBClient extends AbstractWRBClient {
	private static final String FMT = "%.6f";
	
	/**
	 * @param hostUrl
	 */
	public WRBClient(String hostUrl) {
        super(hostUrl);
    }
	
	public List<Double> getEvaluation(String functionName, String definition, String format) throws Exception {
		functionName = URLEncoder.encode(functionName, "UTF-8");
		definition = URLEncoder.encode(definition, "UTF-8");
		format = URLEncoder.encode(format, "UTF-8");
		String path = format("WRBService/evaluate?fct=%s&def=%s&fmt=%s", functionName, definition, format);
		String ret = submitRequest(path);
		String[] values = ret.split(",");
		
		List<Double> returnList = new ArrayList<>();
		
		for(String v : values) {
			returnList.add(Double.parseDouble(v));
		}
		
		return returnList;
	}
	
	public List<Double> getEvaluation(String functionName, String definition) throws Exception {
		return getEvaluation(functionName, definition, FMT);
	}
	
	public double getDifferential(String functionName, String definition, String format) throws Exception{
		functionName = URLEncoder.encode(functionName, "UTF-8");
		definition = URLEncoder.encode(definition, "UTF-8");
		format = URLEncoder.encode(format, "UTF-8");
		String path = format("WRBService/differentiate?fct=%s&def=%s&fmt=%s", functionName, definition, format);
		String ret = submitRequest(path);
		
		return Double.parseDouble(ret);
	}
	
	public double getDifferential(String functionName, String definition) throws Exception{
		return getDifferential(functionName, definition, FMT);
	}
	
	public double getIntegral(String functionName, String definition, String format) throws Exception{
		functionName = URLEncoder.encode(functionName, "UTF-8");
		definition = URLEncoder.encode(definition, "UTF-8");
		format = URLEncoder.encode(format, "UTF-8");
		String path = format("WRBService/integrate?fct=%s&def=%s&fmt=%s", functionName, definition, format);
		String ret = submitRequest(path);
		return Double.parseDouble(ret);
	}
	
	public double getIntegral(String functionName, String definition) throws Exception{
		return getIntegral(functionName, definition, FMT);
	}
}
