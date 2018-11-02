package de.lab4inf.wrb;

import java.util.HashMap;

import de.lab4inf.wrb.ast.AstNode;

public class WRBFunction implements Function {
	private AstNode rootNode;
	private String[] paramNames;
	
	public WRBFunction(AstNode root, String[] paramNames) {
		this.rootNode = root;
		this.paramNames = paramNames;
	}
	
	@Override
	public double eval(double... args) {
		System.out.println("Starting eval");
		HashMap<String, Double> scope = new HashMap<>();
		int i = 0;
		for(double arg : args) {
			scope.put(paramNames[i], arg);
			System.out.println(paramNames[i] + ":" + arg);
			i++;
		}
		System.out.println(rootNode.eval(scope));
		return rootNode.eval(scope);
	}

}
