package de.lab4inf.wrb.rest;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import de.lab4inf.wrb.Function;
import de.lab4inf.wrb.Script;
import de.lab4inf.wrb.WRBScript;

public class WRBRESTValueServiceTest extends AbstractWRBServiceTester {

	@Override
	protected Script getWRBScript() {
		return new WRBScript();
	}
	
	private List<Pair<Double>> makePairs(String s) {
		String[] sa = s.split(",");
		ArrayList<Pair<Double>> ret = new ArrayList<>();
		
		for(int i = 0; i < sa.length; i += 2) {
			ret.add(Pair.pair(Double.parseDouble(sa[i]), Double.parseDouble(sa[i+1])));
		}
		
		return ret;
	}
	
	@Test
	public void testSimpleEvaluation() throws Exception {
		Function fct = getFunction("f", "f(x)=2*x;");
		List<Pair<Double>> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 1, 0.1);
		
		String definition = generateFunctionDefinition("f", "f(x)=2*x");
		String result = submitValueRequest("f", definition);
		
		List<Pair<Double>> res = makePairs(result);
		
		assertEqualsPairs(expVal, res);
	}
	
	@Test
	public void testSimpleEvaluation2() throws Exception {
		Function fct = getFunction("f", "f(x)=2*x**2;");
		List<Pair<Double>> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 1, 0.1);
		
		String definition = generateFunctionDefinition("f", "f(x)=2*x**2");
		String result = submitValueRequest("f", definition);
		
		List<Pair<Double>> res = makePairs(result);
		
		assertEqualsPairs(expVal, res);
	}
	
	@Test
	public void testSimpleEvaluation3() throws Exception {
		Function fct = getFunction("f", "f(x)=x+2;");
		List<Pair<Double>> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 1, 0.1);
		
		String definition = generateFunctionDefinition("f", "f(x)=x+2");
		String result = submitValueRequest("f", definition);
		
		List<Pair<Double>> res = makePairs(result);
		
		assertEqualsPairs(expVal, res);
	}
	
	@Test
	public void testSinEvaluation() throws Exception {
		Function fct = getFunction("f", "f(x)=sin(x);");
		List<Pair<Double>> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 3, 0.5);
		
		String definition = generateFunctionDefinition("f", "f(x)=sin(x)", 0, 3, 0.5);
		String result = submitValueRequest("f", definition);
		
		List<Pair<Double>> res = makePairs(result);
		
		assertEqualsPairs(expVal, res);
	}
	
	@Test
	public void testSinEvaluation2() throws Exception {
		Function fct = getFunction("f", "f(x)=sin(x)+3;");
		List<Pair<Double>> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 3, 0.5);
		
		String definition = generateFunctionDefinition("f", "f(x)=sin(x)+3", 0, 3, 0.5);
		String result = submitValueRequest("f", definition);
		
		List<Pair<Double>> res = makePairs(result);
		
		assertEqualsPairs(expVal, res);
	}
	
	@Test(expected = javax.ws.rs.InternalServerErrorException.class)
	public void testFalseFunctionEval() throws Exception {
		String definition = generateFunctionDefinition("f", "f(x)=sin(x)+3", 0, 3, 0.5);
		String result = submitValueRequest("g", definition);
	}
	
	@Test
	public void testExpEvaluation() throws Exception {
		Function fct = getFunction("f", "f(x)=exp(x)+1;");
		List<Pair<Double>> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 3, 0.5);
		
		String definition = generateFunctionDefinition("f", "f(x)=exp(x)+1", 0, 3, 0.5);
		String result = submitValueRequest("f", definition);
		
		List<Pair<Double>> res = makePairs(result);
		
		assertEqualsPairs(expVal, res);
	}
	
	@Test
	public void testComplexEvaluation() throws Exception {
		Function fct = getFunction("f", "f(x)=exp(x)+sin(x)+x**2-tan(x);");
		List<Pair<Double>> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 3, 0.5);
		
		String definition = generateFunctionDefinition("f", "f(x)=exp(x)+sin(x)+x**2-tan(x)", 0, 3, 0.5);
		String result = submitValueRequest("f", definition);
		
		List<Pair<Double>> res = makePairs(result);
		
		assertEqualsPairs(expVal, res);
	}
	
	@Test
	public void testComplexEvaluation2() throws Exception {
		Function fct = getFunction("f", "f(x)=x**2+3*x**3+4*x**4-sin(x)+5;");
		List<Pair<Double>> expVal = expectedValues("f", fct, AbstractWRBService.FMT, 0, 3, 0.5);
		
		String definition = generateFunctionDefinition("f", "f(x)=x**2+3*x**3+4*x**4-sin(x)+5", 0, 3, 0.5);
		String result = submitValueRequest("f", definition);
		
		List<Pair<Double>> res = makePairs(result);
		
		assertEqualsPairs(expVal, res);
	}

}
