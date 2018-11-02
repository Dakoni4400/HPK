package de.lab4inf.wrb.ast;

import java.util.ArrayList;

import de.lab4inf.wrb.WRBParser;

public final class TreeBuilder {
	public static AstNode buildTree(WRBParser.ExprContext ctx) {
		System.out.println("Start building tree");
		if(ctx.exprAdd() != null) {
			AstNode left = buildTree(ctx.expr());
			AddNode right = buildAddNode(ctx.exprAdd());
			
			ArrayList<String> parameters = right.getParams();
			if(left.getParams()!=null)
				parameters.addAll(left.getParams());
			
			right.addChildren(left);
			
			return right;
		} else if(ctx.exprSub() != null) {
			AstNode left = buildTree(ctx.expr());
			SubNode right = buildSubNode(ctx.exprSub());
			
			ArrayList<String> parameters = right.getParams();
			if(left.getParams()!=null)
				parameters.addAll(left.getParams());
			
			right.addChildren(left);
			
			return right;
		} else {
			return buildTerm(ctx.term());
		}
	}
	
	public static AddNode buildAddNode(WRBParser.ExprAddContext ctx) {
		AstNode term = buildTerm(ctx.term());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(term);
		return new AddNode(child, term.getParams());
	}
	
	public static SubNode buildSubNode(WRBParser.ExprSubContext ctx) {
		AstNode term = buildTerm(ctx.term());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(term);
		return new SubNode(child, term.getParams());
	}
	
	public static AstNode buildTerm(WRBParser.TermContext ctx) {
		if(ctx.termMul() != null) {
			AstNode left = buildTerm(ctx.term());
			MulNode right = buildMulNode(ctx.termMul());
			
			ArrayList<String> parameters = right.getParams();
			if(left.getParams()!=null)
				parameters.addAll(left.getParams());
			
			right.addChildren(left);
			
			return right;
		} else if(ctx.termDiv() != null) {
			AstNode left = buildTerm(ctx.term());
			DivNode right = buildDivNode(ctx.termDiv());
			
			ArrayList<String> parameters = right.getParams();
			if(left.getParams()!=null)
				parameters.addAll(left.getParams());
			
			right.addChildren(left);
			
			return right;
		} else {
			return buildFactor(ctx.factor());
		}
	}
	
	public static MulNode buildMulNode(WRBParser.TermMulContext ctx) {
		AstNode factor = buildFactor(ctx.factor());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(factor);
		return new MulNode(child, factor.getParams());
	}
	
	public static DivNode buildDivNode(WRBParser.TermDivContext ctx) {
		AstNode factor = buildFactor(ctx.factor());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(factor);
		return new DivNode(child, factor.getParams());
	}
	
	public static AstNode buildFactor(WRBParser.FactorContext ctx) {
		return buildTerminalNode(ctx.signedAtom().atom());
	}
	
	public static AstNode buildTerminalNode(WRBParser.AtomContext ctx) {
		if(ctx.expr() != null) {
			return buildTree(ctx.expr());
		} else if(ctx.ID() != null) {
			ArrayList<String> param = new ArrayList<>();
			param.add(ctx.ID().getText());
			return new TerminalNode(param);
		} else /*(ctx.SCI_NO() != null)*/ {
			return new TerminalNode(Double.parseDouble(ctx.SCI_NO().getText()));
		} //else {
			// lang.Math Funktionen
		//}
	}
}
