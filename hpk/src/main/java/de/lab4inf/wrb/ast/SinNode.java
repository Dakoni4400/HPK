package de.lab4inf.wrb.ast;

import java.util.ArrayList;
import java.util.HashMap;

public class SinNode implements AstNode{
	ArrayList<AstNode> children;
	ArrayList<String> parameters = new ArrayList<>();
	
	public SinNode(ArrayList<AstNode> children, ArrayList<String> parameters) {
		this.children = children;
		this.parameters = parameters;
	}
	
	public void addChildren(AstNode child) {
		this.children.add(child);
	}
	
	@Override
	public ArrayList<String> getParams() {
		return parameters;
	}
	
	@Override
	public double eval(HashMap<String, Double> scope) {
		return Math.sin(children.get(0).eval(scope));
	}
}
