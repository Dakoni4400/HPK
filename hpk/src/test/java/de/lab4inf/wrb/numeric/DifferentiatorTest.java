package de.lab4inf.wrb.numeric;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.lab4inf.wrb.Function;
import de.lab4inf.wrb.Script;
import de.lab4inf.wrb.WRBScript;

public class DifferentiatorTest {
	//Array to hold the x-values for testing
	protected ArrayList<Double> values;

	//Differentiator and Integrator to test
	private Differentiator myDif;
	
	//Function to test
	protected Function myFunc;
	
	//Name to println
	protected String functionName;
	
	// Script instance to create Functions
	protected Script script;
	
	//Epsilon for AssertEquals
	final protected static double EPS = 1.E-8;
	
	protected Script getScript() {
        return new WRBScript();
    }
	
	@Before
	/**
	 * setup before test, create Differentiator and Integrator objects and add default values
	 */
	public void setUp()
	{
		script = getScript();
		values = new ArrayList<Double>();
		values.add(0.00);
		values.add(0.25);
		values.add(0.50);
		values.add(0.75);
		values.add(1.00);
		values.add(Math.PI);
		values.add(Math.E);
		myDif = new Differentiator();
	}
	
	protected double sinDif(double x) {
			return Math.cos(x);
	}
	
	protected double expDif(double x) {
		return Math.exp(x);
	}
	
	@Test
	public void sinTest() {
		String task = "f(x) = sin(x)";
		script.parse(task);
		
		Function f = script.getFunction("f");
		assertNotNull(f);
		
		System.out.println("Testing function sin(x)\n");
		System.out.println("    x    |    f(x)  |   f'(x)  ");
		System.out.println("---------+----------+----------");
		for(Double value: values)
		{
			double difVal = 0, x = value;
			double y = f.eval(x);
			try {
				difVal = myDif.differentiate(f, x);
				assertEquals(sinDif(x),difVal,EPS);
			} catch(Exception e) {
				
			}
			
			/*double integVal = myInteg.integrate(myFunc, 0, x) + getIntegrationConst();
			assertEquals(integVal,getIntegrationValue(x),EPS);*/
			
			System.out.println(String.format("%+-1.5f | %+-1.5f | %+-1.5f", x, y, difVal));			
		}
		
		System.out.println("");
		System.out.println("");
	}
	
	@Test
	public void expTest() {
		String task = "f(x) = exp(x)";
		script.parse(task);
		
		Function f = script.getFunction("f");
		assertNotNull(f);
		
		System.out.println("Testing function exp(x)\n");
		System.out.println("    x    |    f(x)  |   f'(x)   ");
		System.out.println("---------+----------+-----------");
		for(Double value: values)
		{
			double difVal = 0, x = value;
			double y = f.eval(x);
			try {
				difVal = myDif.differentiate(f, x);
				assertEquals(expDif(x),difVal,EPS);
			} catch(Exception e) {
				
			}
			
			/*double integVal = myInteg.integrate(myFunc, 0, x) + getIntegrationConst();
			assertEquals(integVal,getIntegrationValue(x),EPS);*/
			
			System.out.println(String.format("%+-1.5f | %+-1.5f | %+-1.5f", x, y, difVal));			
		}
		
		System.out.println("");
		System.out.println("");
	}
	
	
}
