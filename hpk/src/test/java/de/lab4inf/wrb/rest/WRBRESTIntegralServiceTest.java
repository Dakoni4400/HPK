package de.lab4inf.wrb.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.lab4inf.wrb.Script;
import de.lab4inf.wrb.WRBScript;

public class WRBRESTIntegralServiceTest extends AbstractWRBServiceTester {

	@Override
	protected Script getWRBScript() {
		return new WRBScript();
	}
	
	@Test
	public void testIntegral() throws Exception {
		double xmin = 0;
		double xmax = xmin + 1;
		
		String definition = generateIntegralDefinition("f", "f(x)=2*x", xmin , xmax);
		double result = Double.parseDouble(submitIntegralRequest("f", definition));
		
		assertEquals(1, result, eps);
	}
	
	@Test
	public void testIntegral2() throws Exception {
		double xmin = 0;
		double xmax = xmin + 1;
		
		String definition = generateIntegralDefinition("f", "f(x)=2*x**2", xmin , xmax);
		double result = Double.parseDouble(submitIntegralRequest("f", definition));
		
		assertEquals(roundFmt(2./3., AbstractWRBService.FMT), result, eps);
	}
	
	@Test
	public void testIntegral3() throws Exception {
		double xmin = 2;
		double xmax = xmin + 1;
		
		String definition = generateIntegralDefinition("f", "f(x)=x**3", xmin , xmax);
		double result = Double.parseDouble(submitIntegralRequest("f", definition));
		
		assertEquals(roundFmt(65./4., AbstractWRBService.FMT), result, eps);
	}
	
	@Test(expected = javax.ws.rs.InternalServerErrorException.class)
	public void testIntegralFail() throws Exception {
		double xmin = 2;
		double xmax = xmin + 1;
		
		String definition = generateIntegralDefinition("f", "f(x)=x**3", xmin , xmax);
		double result = Double.parseDouble(submitIntegralRequest("g", definition));
	}
	
	@Test
	public void testGreaterFormatIntegral() throws Exception {
		String format = "%.9f";
		
		double xmin = 0;
		double xmax = xmin + 1;
		
		String definition = generateIntegralDefinition("f", "f(x)=2*x", xmin , xmax, format);
		double result = Double.parseDouble(submitIntegralRequest("f", definition));
		
		assertEquals(1, result, eps);
	}
	
	@Test
	public void testGreaterFormatIntegral2() throws Exception {
		String format = "%.11f";
		
		double xmin = 2;
		double xmax = xmin + 1;
		
		String definition = generateIntegralDefinition("f", "f(x)=x**3", xmin , xmax, format);
		double result = Double.parseDouble(submitIntegralRequest("f", definition));
		
		assertEquals(65./4., result, eps);
	}

}
