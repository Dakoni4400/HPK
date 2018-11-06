package de.lab4inf.wrb;

import static org.junit.Assert.*;

import org.junit.Test;


public class ScriptTest extends AbstractScriptTest{
	@Override
	protected Script getScript() {
        return new WRBScript();
    }
	
	@Test
	public final void testLnFunc() throws Exception {
		String task = "f(x)=ln(x); h(x)=ln(x+1); g(x)=2+3*ln(x)";
        script.parse(task);
        Function fct1 = script.getFunction("f");
        Function fct2 = script.getFunction("h");
        Function fct3 = script.getFunction("g");
        assertNotNull("no function found", fct1);
        assertNotNull("no function found", fct2);
        assertNotNull("no function found", fct3);
        
        double x = rnd();
        
        assertEquals(Math.log(x), fct1.eval(x), EPS);
        assertEquals(Math.log(x+1), fct2.eval(x), EPS);
        assertEquals(2+3*Math.log(x), fct3.eval(x), EPS);
	}
	
	@Test
	public final void testExpFunc() throws Exception {
		String task = "f(x)=exp(x); h(x)=exp(x+1); g(x)=2+3*exp(x)";
        script.parse(task);
        Function fct1 = script.getFunction("f");
        Function fct2 = script.getFunction("h");
        Function fct3 = script.getFunction("g");
        assertNotNull("no function found", fct1);
        assertNotNull("no function found", fct2);
        assertNotNull("no function found", fct3);
        
        double x = rnd();
        
        assertEquals(Math.exp(x), fct1.eval(x), EPS);
        assertEquals(Math.exp(x+1), fct2.eval(x), EPS);
        assertEquals(2+3*Math.exp(x), fct3.eval(x), EPS);
	}

}
