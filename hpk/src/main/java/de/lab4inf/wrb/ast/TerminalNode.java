package de.lab4inf.wrb.ast;

import java.util.ArrayList;
import java.util.HashMap;

public class TerminalNode implements AstNode{
	ArrayList<String> varName;
	double constantValue;
	
	public TerminalNode(ArrayList<String> varName) {
		this.varName = varName;
	}
	
	public TerminalNode(double constantValue) {
		this.constantValue = constantValue;
		this.varName = null;
	}
	
	@Override
	public ArrayList<String> getParams() {
		return varName;
	}
	
	public double getValue() {
		return constantValue;
	}

	@Override
	public double eval(HashMap<String, Double> scope) {
		System.out.println("Eval TerminalNode");
		if (varName == null) {
			System.out.println(constantValue);
			return constantValue;
		}
		System.out.println(scope.get(varName.get(0)));
		return scope.get(varName.get(0));
	}
}
