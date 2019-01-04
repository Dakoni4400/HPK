package de.lab4inf.wrb.rest;

import de.lab4inf.wrb.Function;
import de.lab4inf.wrb.Script;
import de.lab4inf.wrb.WRBScript;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import javax.ws.rs.client.ClientBuilder;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WRBClientTest extends AbstractWRBClientTester {
	WRBClient client;
	static HttpServer server;
	
	@Override
	protected Script getWRBScript() {
		return new WRBScript();
	}
	
	@BeforeClass
	public static void setUpServer() {
		String[] args = { "-h", "localhost", "-p", "8080" };
		server = WRBServer.startServer(args);
	}
	
	 @Before
	 public void setUp() throws Exception {
	     // create the script
	     script = getWRBScript();
	     // create the client
	     client = new WRBClient(WRBServer.BASE_URI);
	 }
	 
	 @After
	 public void tearDown() {
		 
	 }
	
	/*
	 *	Evaluation Tests 
	 */
	
	@Test
	public void testSimpleEvaluation() throws Exception {
		Function fct = getFunction("f", "f(x)=2*x;");
		List<Double> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 1, 0.1);
		
		String definition = generateFunctionDefinition("f", "f(x)=2*x");
		List<Double> result = client.getEvaluation("f", definition);
		
		assertEqualsPairs(expVal, result);
	}
	
	@Test
	public void testSimpleEvaluation2() throws Exception {
		Function fct = getFunction("f", "f(x)=2*x**2;");
		List<Double> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 1, 0.1);
		
		String definition = generateFunctionDefinition("f", "f(x)=2*x**2");
		List<Double> result = client.getEvaluation("f", definition);
		
		assertEqualsPairs(expVal, result);
	}
	
	@Test
	public void testSimpleEvaluation3() throws Exception {
		Function fct = getFunction("f", "f(x)=x+2;");
		List<Double> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 1, 0.1);
		
		String definition = generateFunctionDefinition("f", "f(x)=x+2");
		List<Double> result = client.getEvaluation("f", definition);
		
		assertEqualsPairs(expVal, result);
	}
	
	@Test
	public void testSinEvaluation() throws Exception {
		Function fct = getFunction("f", "f(x)=sin(x);");
		List<Double> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 3, 0.5);
		
		String definition = generateFunctionDefinition("f", "f(x)=sin(x)", 0, 3, 0.5);
		List<Double> result = client.getEvaluation("f", definition);
		
		assertEqualsPairs(expVal, result);
	}
	
	@Test
	public void testSinEvaluation2() throws Exception {
		Function fct = getFunction("f", "f(x)=sin(x)+3;");
		List<Double> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 3, 0.5);
		
		String definition = generateFunctionDefinition("f", "f(x)=sin(x)+3", 0, 3, 0.5);
		List<Double> result = client.getEvaluation("f", definition);
		
		assertEqualsPairs(expVal, result);
	}
	
	@Test(expected = java.io.IOException.class)
	public void testFalseFunctionEval() throws Exception {
		String definition = generateFunctionDefinition("f", "f(x)=sin(x)+3", 0, 3, 0.5);
		List<Double> result = client.getEvaluation("g", definition);
	}
	
	@Test
	public void testExpEvaluation() throws Exception {
		Function fct = getFunction("f", "f(x)=exp(x)+1;");
		List<Double> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 3, 0.5);
		
		String definition = generateFunctionDefinition("f", "f(x)=exp(x)+1", 0, 3, 0.5);
		List<Double> result = client.getEvaluation("f", definition);
		
		assertEqualsPairs(expVal, result);
	}
	
	@Test
	public void testComplexEvaluation() throws Exception {
		Function fct = getFunction("f", "f(x)=exp(x)+sin(x)+x**2-tan(x);");
		List<Double> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 3, 0.5);
		
		String definition = generateFunctionDefinition("f", "f(x)=exp(x)+sin(x)+x**2-tan(x)", 0, 3, 0.5);
		List<Double> result = client.getEvaluation("f", definition);
		
		assertEqualsPairs(expVal, result);
	}
	
	@Test
	public void testComplexEvaluation2() throws Exception {
		Function fct = getFunction("f", "f(x)=x**2+3*x**3+4*x**4-sin(x)+5;");
		List<Double> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 3, 0.5);
		
		String definition = generateFunctionDefinition("f", "f(x)=x**2+3*x**3+4*x**4-sin(x)+5", 0, 3, 0.5);
		List<Double> result = client.getEvaluation("f", definition);
		
		assertEqualsPairs(expVal, result);
	}
	
	/*
	 *  Differential Tests
	 */
	
	@Test
	public void testDifferential() throws Exception {
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), AbstractWRBService.FMT);
		
		String definition = generateDifferentialDefinition("f", "f(x)=x**2", x);
		double result = client.getDifferential("f", definition);
		
		assertEquals(roundFmt(2.*x, AbstractWRBService.FMT), result, eps);
	}
	
	@Test
	public void testDifferential2() throws Exception {
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), AbstractWRBService.FMT);
		
		String definition = generateDifferentialDefinition("f", "f(x)=x**3", x);
		double result = client.getDifferential("f", definition);
		
		assertEquals(roundFmt(3.*Math.pow(x, 2), AbstractWRBService.FMT), result, eps);
	}
	
	@Test
	public void testDifferential3() throws Exception {
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), AbstractWRBService.FMT);
		
		String definition = generateDifferentialDefinition("f", "f(x)=x**2+x", x);
		double result = client.getDifferential("f", definition);
		
		assertEquals(roundFmt(2.*x+1, AbstractWRBService.FMT), result, eps);
	}
	
	@Test(expected = java.io.IOException.class) 
	public void testDifferentialFail() throws Exception {
		String definition = generateDifferentialDefinition("f", "f(x)=x**2+x", 0);
		double result = client.getDifferential("g", definition);
	}
	
	@Test
	public void testGreaterFormatDifferential() throws Exception {
		String format = "%.9f";
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), format);
		
		String definition = generateDifferentialDefinition("f", "f(x)=x**2", x, format);
		double result = client.getDifferential("f", definition, format);
		
		assertEquals(roundFmt(2.*x, format), result, eps);
	}
	
	@Test
	public void testGreaterFormatDifferential2() throws Exception {
		String format = "%.8f";
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), format);
		
		String definition = generateDifferentialDefinition("f", "f(x)=sin(x)", x, format);
		double result = client.getDifferential("f", definition, format);
		
		assertEquals(roundFmt(Math.cos(x), format), result, eps);
	}
	
	@Test
	public void testLowerFormatDifferential() throws Exception {
		String format = "%.4f";
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), format);
		
		String definition = generateDifferentialDefinition("f", "f(x)=x**2+x", x, format);
		double result = client.getDifferential("f", definition, format);
		
		assertEquals(roundFmt(2.*x+1, format), result, eps);
	}
	
	@Test
	public void testLowerFormatDifferential2() throws Exception {
		String format = "%.3f";
		
		Random r = new Random();
		double x = roundFmt(r.nextDouble(), format);
		
		String definition = generateDifferentialDefinition("f", "f(x)=cos(x)", x, format);
		double result = client.getDifferential("f", definition, format);
		
		assertEquals(roundFmt(-1.*Math.sin(x), format), result, eps);
	}
	
	/*
	 *  Integral Tests
	 */
	
	@Test
	public void testIntegral() throws Exception {
		double xmin = 0;
		double xmax = xmin + 1;
		
		String definition = generateIntegralDefinition("f", "f(x)=2*x", xmin , xmax);
		double result = client.getIntegral("f", definition);
		
		assertEquals(1, result, eps);
	}
	
	@Test
	public void testIntegral2() throws Exception {
		double xmin = 0;
		double xmax = xmin + 1;
		
		String definition = generateIntegralDefinition("f", "f(x)=2*x**2", xmin , xmax);
		double result = client.getIntegral("f", definition);
		
		assertEquals(roundFmt(2./3., AbstractWRBService.FMT), result, eps);
	}
	
	@Test
	public void testIntegral3() throws Exception {
		double xmin = 2;
		double xmax = xmin + 1;
		
		String definition = generateIntegralDefinition("f", "f(x)=x**3", xmin , xmax);
		double result = client.getIntegral("f", definition);
		
		assertEquals(roundFmt(65./4., AbstractWRBService.FMT), result, eps);
	}
	
	@Test(expected = java.io.IOException.class)
	public void testIntegralFail() throws Exception {
		double xmin = 2;
		double xmax = xmin + 1;
		
		String definition = generateIntegralDefinition("f", "f(x)=x**3", xmin , xmax);
		double result = client.getIntegral("g", definition);
	}
	
	@Test
	public void testGreaterFormatIntegral() throws Exception {
		String format = "%.9f";
		
		double xmin = 0;
		double xmax = xmin + 1;
		
		String definition = generateIntegralDefinition("f", "f(x)=2*x", xmin , xmax, format);
		double result = client.getIntegral("f", definition);
		
		assertEquals(1, result, eps);
	}
	
	@Test
	public void testGreaterFormatIntegral2() throws Exception {
		String format = "%.11f";
		
		double xmin = 2;
		double xmax = xmin + 1;
		
		String definition = generateIntegralDefinition("f", "f(x)=x**3", xmin , xmax, format);
		double result = client.getIntegral("f", definition);
		
		assertEquals(65./4., result, eps);
	}
}
