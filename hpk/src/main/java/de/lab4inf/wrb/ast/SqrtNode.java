package de.lab4inf.wrb.ast;

import java.util.ArrayList;
import java.util.HashMap;

public class SqrtNode implements AstNode{
	ArrayList<AstNode> children;
	ArrayList<String> parameters = new ArrayList<>();
	
	public SqrtNode(ArrayList<AstNode> children, ArrayList<String> parameters) {
		this.children = children;
		this.parameters = parameters;
	}
	
	@Override
	public double eval(HashMap<String, Double> scope) {
		return Math.sqrt(children.get(0).eval(scope));
	}

	@Override
	public ArrayList<String> getParams() {
		return parameters;
	}

}
