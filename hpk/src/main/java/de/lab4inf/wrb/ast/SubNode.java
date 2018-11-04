package de.lab4inf.wrb.ast;

import java.util.ArrayList;
import java.util.HashMap;

public class SubNode implements AstNode {
	ArrayList<AstNode> children;
	AstNode left;
	AstNode right;
	ArrayList<String> parameters = new ArrayList<>();
	
	public SubNode(ArrayList<AstNode> children, ArrayList<String> parameters) {
		this.children = children;
		this.parameters = parameters;
	}
	
	public void addChildren(AstNode child) {
		this.children.add(child);
		this.left = children.get(1);
		this.right = children.get(0);
	}
	
	@Override
	public ArrayList<String> getParams() {
		return parameters;
	}
	
	@Override
	public double eval(HashMap<String, Double> scope) {
		if(children.size() == 1) {
			return -1. * children.get(0).eval(scope);
		}
		return left.eval(scope) - right.eval(scope);
	}
}
