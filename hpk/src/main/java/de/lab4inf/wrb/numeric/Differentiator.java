package de.lab4inf.wrb.numeric;

import de.lab4inf.wrb.Function;

public class Differentiator {
	static {
		System.loadLibrary("hpk");
	}
	
	/**
	* Differentiate the given function. * @param fct to differentiate
	* @param x the function argument
	* @return f'(x)
	*/
	public native double differentiate( final Function fct, final double x);
}
