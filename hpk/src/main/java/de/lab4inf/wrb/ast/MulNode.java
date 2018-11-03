package de.lab4inf.wrb.ast;

import java.util.ArrayList;
import java.util.HashMap;

public class MulNode implements AstNode {
	ArrayList<AstNode> children;
	ArrayList<String> parameters = new ArrayList<>();
	
	public MulNode(ArrayList<AstNode> children, ArrayList<String> parameters) {
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
		System.out.println("Eval MulNode");
		double[] subExpressions = new double[children.size()];
		
		double res = 1;
		
		for(int i = children.size() - 1; i >= 0; i--) {
			subExpressions[i] = children.get(i).eval(scope);
			res *= subExpressions[i];
		}
		return res;
	}

}
