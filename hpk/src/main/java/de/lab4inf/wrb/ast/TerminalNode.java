package de.lab4inf.wrb.ast;

import java.util.ArrayList;
import java.util.HashMap;

public class TerminalNode implements AstNode{
	String varNameString;
	ArrayList<String> varName = new ArrayList<>();
	Double constantValue;
	
	public TerminalNode(ArrayList<String> varName) {
		this.varName = varName;
		varNameString = varName.get(0);
	}
	
	public TerminalNode(double constantValue) {
		this.constantValue = constantValue;
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
		if (constantValue != null) {
			return constantValue;
		}
		return scope.get(varNameString);
	}
}
