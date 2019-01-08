package de.lab4inf.wrb.rest;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

import de.lab4inf.wrb.Script;
import de.lab4inf.wrb.WRBScript;

public class WRBRESTDifferentialServiceTest extends AbstractWRBServiceTester {
	@Test
	public void testDifferential() throws Exception {
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), AbstractWRBService.FMT);
		
		String definition = generateDifferentialDefinition("f", "f(x)=x**2", x);
		double result = Double.parseDouble(submitDifferentialRequest("f", definition));
		
		assertEquals(roundFmt(2.*x, AbstractWRBService.FMT), result, eps);
	}
	
	@Test
	public void testDifferential2() throws Exception {
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), AbstractWRBService.FMT);
		
		String definition = generateDifferentialDefinition("f", "f(x)=x**3", x);
		double result = Double.parseDouble(submitDifferentialRequest("f", definition));
		
		assertEquals(roundFmt(3.*Math.pow(x, 2), AbstractWRBService.FMT), result, eps);
	}
	
	@Test
	public void testDifferential3() throws Exception {
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), AbstractWRBService.FMT);
		
		String definition = generateDifferentialDefinition("f", "f(x)=x**2+x", x);
		double result = Double.parseDouble(submitDifferentialRequest("f", definition));
		
		assertEquals(roundFmt(2.*x+1, AbstractWRBService.FMT), result, eps);
	}
	
	@Test(expected = javax.ws.rs.InternalServerErrorException.class) 
	public void testDifferentialFail() throws Exception {
		String definition = generateDifferentialDefinition("f", "f(x)=x**2+x", 0);
		double result = Double.parseDouble(submitDifferentialRequest("g", definition));
	}
	
	@Test
	public void testGreaterFormatDifferential() throws Exception {
		String format = "%.9f";
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), format);
		
		String definition = generateDifferentialDefinition("f", "f(x)=x**2", x, format);
		double result = Double.parseDouble(submitDifferentialRequest("f", definition, format));
		
		assertEquals(roundFmt(2.*x, format), result, eps);
	}
	
	@Test
	public void testGreaterFormatDifferential2() throws Exception {
		String format = "%.8f";
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), format);
		
		String definition = generateDifferentialDefinition("f", "f(x)=sin(x)", x, format);
		double result = Double.parseDouble(submitDifferentialRequest("f", definition, format));
		
		assertEquals(roundFmt(Math.cos(x), format), result, eps);
	}
	
	@Test
	public void testLowerFormatDifferential() throws Exception {
		String format = "%.4f";
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), format);
		
		String definition = generateDifferentialDefinition("f", "f(x)=x**2+x", x, format);
		double result = Double.parseDouble(submitDifferentialRequest("f", definition, format));
		
		assertEquals(roundFmt(2.*x+1, format), result, eps);
	}
	
	@Test
	public void testLowerFormatDifferential2() throws Exception {
		String format = "%.3f";
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), format);
		
		String definition = generateDifferentialDefinition("f", "f(x)=cos(x)", x, format);
		double result = Double.parseDouble(submitDifferentialRequest("f", definition, format));
		
		assertEquals(roundFmt(-1.*Math.sin(x), format), result, eps);
	}

	@Override
	protected Script getWRBScript() {
		return new WRBScript();
	}
}
