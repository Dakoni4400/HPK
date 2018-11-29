package de.lab4inf.wrb.numeric;

import de.lab4inf.wrb.Function;

public class Integrator {
	static {
		System.loadLibrary("hpk");
	}
	
	/**
	*             b
	*            /
	* Calculate / f(t) dt = F(b)−F(a) with eps precision.
	*          /
	*         a
	*/
	public native double integrate(final Function fct, final double a, final double b);
}
