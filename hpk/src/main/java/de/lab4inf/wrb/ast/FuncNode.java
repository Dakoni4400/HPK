package de.lab4inf.wrb.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import de.lab4inf.wrb.WRBFunction;

public class FuncNode implements AstNode {
	WRBFunction fct;
	
	public FuncNode(WRBFunction fct) {
		this.fct = fct;
	}
	
	@Override
	public double eval(HashMap<String, Double> scope) {
		double[] params = new double[scope.size()];
		Set<String> keys = scope.keySet();
		int i = 0;
		for(String key : keys) {
			params[i] = scope.get(key);
			i++;
		}
		
		return fct.eval(params);
	}

	/**
	 * Method which evaluates the given HashMap for the specific Math Function
	 * @param  HashMap<String, Double> scope
	 * @returns  the evaluated result as Double
	 */
	@Override
	public ArrayList<String> getParams() {
		// TODO Auto-generated method stub
		return new ArrayList<String>(Arrays.asList(fct.getParamNames()));
	}
	
}
