package de.lab4inf.wrb;

import java.util.HashMap;

import de.lab4inf.wrb.ast.AstNode;

public class WRBFunction implements Function {
	private AstNode rootNode;
	private String[] paramNames;
	HashMap<String, Double> scope = new HashMap<>();
	
	public WRBFunction(AstNode root, String[] paramNames) {
		this.rootNode = root;
		this.paramNames = paramNames;
	}
	
	public String[] getParamNames() {
		return paramNames;
	}
	
	@Override
	public double eval(double... args) {
		int i = 0;
		for(double arg : args) {
			scope.put(paramNames[i], arg);
			i++;
		}
		return rootNode.eval(scope);
	}
	
	public double eval(HashMap<String, Double> sc) {
		return rootNode.eval(sc);
	}

}
