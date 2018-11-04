package de.lab4inf.wrb.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import de.lab4inf.wrb.Function;

public class FuncNode implements AstNode {
	Function fct;
	
	public FuncNode(Function fct) {
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

	@Override
	public ArrayList<String> getParams() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
