package de.lab4inf.wrb.numeric;

import de.lab4inf.wrb.Function;

public class Integrator {
	private double eps = 1.E-8;
	
	static {
		System.loadLibrary("hpk");
	}
	
	public void setEps(double eps) {
		this.eps = eps;
	}
	
	/**
	*             b
	*            /
	* Calculate / f(t) dt = F(b)−F(a) with eps precision.
	*          /
	*         a
	*/
	public native double integrate(final Function fct, final double a, final double b) throws ArithmeticException;
	
	public double integrate(final Function fct, final double a, final double b, final double eps) throws ArithmeticException{
		this.eps = eps;
		return integrate(fct, a, b);
	}
}
