package de.lab4inf.wrb.ast;

import java.util.ArrayList;
import java.util.HashMap;

public interface AstNode {
	ArrayList<String> parameters = new ArrayList<>();
	
	double eval(HashMap<String, Double> scope);
	
	ArrayList<String> getParams();
}
