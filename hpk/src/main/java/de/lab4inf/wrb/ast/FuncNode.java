package de.lab4inf.wrb.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

import de.lab4inf.wrb.WRBFunction;

public class FuncNode implements AstNode {
	WRBFunction fct;
	Stack<WRBFunction> innerFunc = new Stack<>();
	
	public FuncNode(WRBFunction fct) {
		this.fct = fct;
	}
	
	public void setInnerFunction(WRBFunction fct) {
		innerFunc.push(fct);
	}
	
	/**
	 * Method which evaluates the given HashMap for the specific Math Function
	 * @param  HashMap<String, Double> scope
	 * @returns  the evaluated result as Double
	 */
	@Override
	public double eval(HashMap<String, Double> scope) {
		double[] evalValue = new double[scope.size()];
		double[] params = new double[scope.size()];
		Set<String> keys = scope.keySet();
		int i = 0;
		for(String key : keys) {
			params[i] = scope.get(key);
			i++;
		}
			if(!innerFunc.isEmpty()) {
			evalValue[0] = innerFunc.pop().eval(params);
		
			while(!innerFunc.isEmpty()) {
				evalValue[0] = innerFunc.pop().eval(evalValue);
			}
		
			return fct.eval(evalValue);
		} else {
			return fct.eval(params);
		}
	}

	
	@Override
	public ArrayList<String> getParams() {		
		// TODO Auto-generated method stub
		return new ArrayList<String>(Arrays.asList(fct.getParamNames()));
	}
	
}
