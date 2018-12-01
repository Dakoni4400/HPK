package de.lab4inf.wrb.numeric;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
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
	
	protected double getIntegralResult(Function F, double a, double b) {
		return F.eval(b) - F.eval(a);
	}
	
	/**
	 * Mit dieser Funktion kann der Integrator schnell getestet werden. 
	 * 
	 * @param task Format: f: Zu testende Funktion; F: zugehörige Stammfunktion
	 */
	protected void testIntegrator(String task) {
		script.parse(task);
		
		Function f = script.getFunction("f");
		assertNotNull(f);
		Function F = script.getFunction("F");
		assertNotNull(F);
		
		for(Double value: values)
		{
			double a = value, b = value + 1.;
			
			double intVal = i.integrate(f, a, b);
			assertEquals(getIntegralResult(F,a,b),intVal,rEps(getIntegralResult(F,a,b)));	
		}
	}
	
	/**
     * Calculate the relative or absolute tolerated error.
     * 
     * @param f the true function value to check for
     * @return the maximal tolerance
     */
    protected final double rEps(final double f) {
        double a = Math.abs(f), rEps = EPS;
        if ((0 < a && a < 0.1) || a > 1)
            rEps *= a;
        return rEps;
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
		i = new Integrator();
		i.setEps(EPS);
	}
	
	@Test
	public void sinTest() {
		String task = "f(x) = sin(x); F(x) = -1.0*cos(x);";
		testIntegrator(task);
	}
	
	@Test
	public void squareTest() {
		String task = "f(x) = x**2; F(x) = (1/3) * x**3;";
		testIntegrator(task);
	}
	
	@Test
	public void constantTest() {
		String task = "f(x) = 1; F(x) = x";
		testIntegrator(task);
	}
	
	@Test
	public void sqrtTest() {
		values.remove(-4.0);
		values.remove(-3.0);
		values.remove(-2.0);
		values.remove(-1.0);
		String task = "f(x) = sqrt(x); F(x) = (2/3)*x**(3/2)";
		testIntegrator(task);
	}
	
	@Test
	public void negExpTest() {
		String task = "f(x) = -1/x**2; F(x) = 1/x";
		testIntegrator(task);
	}
	
	@Test
	public void logTest() {
		values.remove(-4.0);
		values.remove(-3.0);
		values.remove(-2.0);
		values.remove(-1.0);
		values.remove(0.0);
		
		String task = "f(x) = 1/x; F(x) = ln(abs(x));";
		testIntegrator(task);
	}
}
