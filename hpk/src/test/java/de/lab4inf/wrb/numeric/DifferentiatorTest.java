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
	private Differentiator d;
	
	// Script instance to create Functions
	protected Script script;
	
	//Epsilon for AssertEquals
	final protected static double EPS = 1.E-8;
	
	protected Script getScript() {
        return new WRBScript();
    }
	
	/**
	 * Mit dieser Funktion kann der Integrator schnell getestet werden. 
	 * 
	 * @param task Format: f: Zu testende Funktion; df: zugehörige Ableitungsfunktion
	 */
	protected void testDifferentiator(String task) {
		script.parse(task);
		
		Function f = script.getFunction("f");
		assertNotNull(f);
		Function df = script.getFunction("df");
		assertNotNull(df);
		
		for(Double value: values)
		{
			double difVal = 0, x = value;

			difVal = d.differentiate(f, x);
			assertEquals(df.eval(x),difVal,EPS);		
		}
	}
	
	@Before
	/**
	 * setup before test, create Differentiator and Integrator objects and add default values
	 */
	public void setUp()
	{
		script = getScript();
		values = new ArrayList<Double>();
		values.add(-4.00);
		values.add(-3.00);
		values.add(-2.00);
		values.add(-1.00);
		values.add(0.00);
		values.add(0.25);
		values.add(0.50);
		values.add(0.75);
		values.add(1.00);
		values.add(Math.PI);
		values.add(Math.E);
		d = new Differentiator();
	}
	
	@Test
	public void sinTest() {
		String task = "f(x) = sin(x); df(x) = cos(x)";
		testDifferentiator(task);
	}
	
	@Test
	public void expTest() {
		String task = "f(x) = exp(x); df(x) = exp(x)";
		testDifferentiator(task);
	}
	
	@Test
	public void squareTest() {
		String task = "f(x) = x**2; df(x) = 2*x;";
		testDifferentiator(task);
	}
	
	@Test
	public void bigFunctionTest() {
		String task = "f(x) = 2*x**3-4*x**2-2*x+3; df(x) = 6*x**2-8*x-2;";
		testDifferentiator(task);
	}
	
	@Test
	public void lnTest() {
		String task = "f(x) = ln(x); df(x) = 1/x";
		testDifferentiator(task);
		
		task = "f(x) = ln(3*x); df(x) = 1/x";
		testDifferentiator(task);
	}
	
}
