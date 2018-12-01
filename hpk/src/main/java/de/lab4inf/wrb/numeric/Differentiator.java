package de.lab4inf.wrb.numeric;

import de.lab4inf.wrb.Function;

public class Differentiator {
	private double error = 1.E-8;
	
	static {
		System.loadLibrary("hpk");
	}
	
	public void setError(double err) {
		error = err;
	}
	
	/**
	* Differentiate the given function. * @param fct to differentiate
	* @param x the function argument
	* @return f'(x)
	*/
	public native double differentiate( final Function fct, final double x) throws ArithmeticException;
	
	public double differentiate( final Function fct, final double x, final double err) throws ArithmeticException{
		this.error = err;
		return differentiate(fct, x);
	}
}
