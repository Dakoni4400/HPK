package de.lab4inf.wrb.ast;

import java.util.ArrayList;

import de.lab4inf.wrb.WRBObserver;
import de.lab4inf.wrb.WRBParser;

/**
 * This claas builds the ParseTree for a userdefined function
 * @author Till Kobbe
 *
 */
public final class TreeBuilder {
	public static AstNode buildTree(WRBParser.ExprContext ctx) {
		System.out.println("Start building tree");
		if(ctx.exprAdd() != null) {
			AstNode left = buildTree(ctx.expr());
			AddNode right = buildAddNode(ctx.exprAdd());
			
			right.addChildren(left);
			
			return right;
		} else if(ctx.exprSub() != null) {
			AstNode left = buildTree(ctx.expr());
			SubNode right = buildSubNode(ctx.exprSub());
			
			right.addChildren(left);
			
			return right;
		} else {
			return buildTerm(ctx.term());
		}
	}
	
	public static AddNode buildAddNode(WRBParser.ExprAddContext ctx) {
		System.out.println("Building AddNode");
		AstNode term = buildTerm(ctx.term());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(term);
		return new AddNode(child, term.getParams());
	}
	
	public static SubNode buildSubNode(WRBParser.ExprSubContext ctx) {
		System.out.println("Building SubNode");
		AstNode term = buildTerm(ctx.term());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(term);
		return new SubNode(child, term.getParams());
	}
	
	public static AstNode buildTerm(WRBParser.TermContext ctx) {
		System.out.println("Building Term");
		if(ctx.termMul() != null) {
			AstNode left = buildTerm(ctx.term());
			MulNode right = buildMulNode(ctx.termMul());
			
			right.addChildren(left);
			
			return right;
		} else if(ctx.termDiv() != null) {
			AstNode left = buildTerm(ctx.term());
			DivNode right = buildDivNode(ctx.termDiv());
			
			right.addChildren(left);
			
			return right;
		} else {
			return buildFactor(ctx.factor());
		}
	}
	
	public static MulNode buildMulNode(WRBParser.TermMulContext ctx) {
		System.out.println("Building MulNode");
		AstNode factor = buildFactor(ctx.factor());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(factor);
		return new MulNode(child, factor.getParams());
	}
	
	public static DivNode buildDivNode(WRBParser.TermDivContext ctx) {
		System.out.println("Building DivNode");
		AstNode factor = buildFactor(ctx.factor());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(factor);
		return new DivNode(child, factor.getParams());
	}
	
	public static AstNode buildFactor(WRBParser.FactorContext ctx) {
		System.out.println("Building Factor");
		if(ctx.pow() != null) {
			AstNode left = buildTerminalNode(ctx.signedAtom());
			PowNode right = buildPowNode(ctx.pow());
			
			right.addChildren(left);
			
			return right;
		}
		return buildTerminalNode(ctx.signedAtom());
	}
	
	public static PowNode buildPowNode(WRBParser.PowContext ctx) {
		System.out.println("Building PowNode");
		AstNode node = buildFactor(ctx.factor());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(node);
		return new PowNode(child, node.getParams());
	}
	
	public static AstNode buildTerminalNode(WRBParser.SignedAtomContext ctx) {
		System.out.println("Building SignedTerminal");
		if(ctx.SUB() != null) {
			AstNode node = buildTerminalNode(ctx.atom());
			ArrayList<AstNode> child = new ArrayList<>();
			child.add(node);
			return new SubNode(child, node.getParams());
		} else
			return buildTerminalNode(ctx.atom());
		
	}
	
	public static AstNode buildTerminalNode(WRBParser.AtomContext ctx) {
		System.out.println("Building TerminalNode");
		if(ctx.function() != null) {
			//Adding user Function Nodes
			System.out.println("Building Function");
			if(ctx.function().evalUserFunc() != null) {
				System.out.println("Building UserFunction");
				return new FuncNode(WRBObserver.getInstance().getFuncMemory().get(ctx.function().evalUserFunc().ID().getText()));
			} 
			// Adding lang.Math Nodes
			if(ctx.function().mathFunction() != null) {
				if(ctx.function().mathFunction().SIN() != null) {
					ArrayList<AstNode> child = new ArrayList<>();
					child.add(buildTree(ctx.function().mathFunction().e));
					return new SinNode(child, child.get(0).getParams());
				}
				if(ctx.function().mathFunction().ASIN() != null) {
					ArrayList<AstNode> child = new ArrayList<>();
					child.add(buildTree(ctx.function().mathFunction().e));
					return new AsinNode(child, child.get(0).getParams());
				}
				if(ctx.function().mathFunction().COS() != null) {
					ArrayList<AstNode> child = new ArrayList<>();
					child.add(buildTree(ctx.function().mathFunction().e));
					return new CosNode(child, child.get(0).getParams());
				}
				if(ctx.function().mathFunction().ACOS() != null) {
					ArrayList<AstNode> child = new ArrayList<>();
					child.add(buildTree(ctx.function().mathFunction().e));
					return new AcosNode(child, child.get(0).getParams());
				}
				if(ctx.function().mathFunction().TAN() != null) {
					ArrayList<AstNode> child = new ArrayList<>();
					child.add(buildTree(ctx.function().mathFunction().e));
					return new TanNode(child, child.get(0).getParams());
				}
				if(ctx.function().mathFunction().ATAN() != null) {
					ArrayList<AstNode> child = new ArrayList<>();
					child.add(buildTree(ctx.function().mathFunction().e));
					return new AtanNode(child, child.get(0).getParams());
				}
			}
		}
		
		if(ctx.expr() != null) {
			return buildTree(ctx.expr());
		} else if(ctx.ID() != null) {
			if(WRBObserver.getInstance().getVarMemory().containsKey(ctx.ID().getText())) {
				return new TerminalNode(WRBObserver.getInstance().getVarMemory().get(ctx.ID().getText()));
			}
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
