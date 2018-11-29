package de.lab4inf.wrb.ast;

import java.util.ArrayList;
import java.util.HashMap;

public class AbsNode implements AstNode {
	ArrayList<AstNode> children;
	ArrayList<String> parameters = new ArrayList<>();
	
	public AbsNode(ArrayList<AstNode> children, ArrayList<String> parameters) {
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
		
	/**
	 * Method which evaluates the given HashMap for the specific Math Function
	 * @param  HashMap<String, Double> scope
	 * @returns  the evaluated result as Double
	 */
	@Override
	public double eval(HashMap<String, Double> scope) {
		return Math.abs(children.get(0).eval(scope));
	}
}
