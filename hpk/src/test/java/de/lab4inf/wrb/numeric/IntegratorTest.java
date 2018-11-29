package de.lab4inf.wrb.numeric;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import de.lab4inf.wrb.Function;
import de.lab4inf.wrb.Script;
import de.lab4inf.wrb.WRBScript;

public class IntegratorTest {
	//Array to hold the x-values for testing
	protected ArrayList<Double> values;

	//Differentiator and Integrator to test
	private Integrator i;
	
	// Script instance to create Functions
	protected Script script;
	
	//Epsilon for AssertEquals
	final protected static double EPS = 1.E-8;
	
	protected Script getScript() {
        return new WRBScript();
    }
	
	protected double sinInt(double a, double b) {
		return ((-1.0*Math.cos(b))-(-1.0*Math.cos(a)));
	}
	
	@Before
	/**
	 * setup before test, create Differentiator and Integrator objects and add default values
	 */
	public void setUp()
	{
		script = getScript();
		values = new ArrayList<Double>();
		values.add(1.00);
		values.add(2.00);
		values.add(3.00);
		values.add(4.00);
		i = new Integrator();
	}
	
	@Test
	public void sinTest() {
		String task = "f(x) = sin(x)";
		script.parse(task);
		
		Function f = script.getFunction("f");
		assertNotNull(f);
		
		for(Double value: values)
		{
			double a = value, b = value + 1.;
			
			double intVal = i.integrate(f, a, b);
			assertEquals(sinInt(a,b),intVal,EPS);	
		}
	}
}
