package de.lab4inf.wrb.ast;

import java.util.ArrayList;

import de.lab4inf.wrb.WRBObserver;
import de.lab4inf.wrb.WRBParser;

/**
 * This class builds the ParseTree for a userdefined function
 * @author Till Kobbe
 *
 */
public class TreeBuilder {
	WRBObserver ob;
	
	public TreeBuilder(WRBObserver ob) {
		this.ob = ob;
	}
	
	/**
	 * Method for start building a Tree from the parsed ANTLR tree
	 * @param WRBParser.ExprContext ctx
	 * @return
	 */
	public AstNode buildTree(WRBParser.ExprContext ctx) {
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
	
	public AddNode buildAddNode(WRBParser.ExprAddContext ctx) {
		AstNode term = buildTerm(ctx.term());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(term);
		return new AddNode(child, term.getParams());
	}
	
	public SubNode buildSubNode(WRBParser.ExprSubContext ctx) {
		AstNode term = buildTerm(ctx.term());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(term);
		return new SubNode(child, term.getParams());
	}
	
	public AstNode buildTerm(WRBParser.TermContext ctx) {
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
	
	public MulNode buildMulNode(WRBParser.TermMulContext ctx) {
		AstNode factor = buildFactor(ctx.factor());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(factor);
		return new MulNode(child, factor.getParams());
	}
	
	public DivNode buildDivNode(WRBParser.TermDivContext ctx) {
		AstNode factor = buildFactor(ctx.factor());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(factor);
		return new DivNode(child, factor.getParams());
	}
	
	public AstNode buildFactor(WRBParser.FactorContext ctx) {
		if(ctx.pow() != null) {
			AstNode left = buildTerminalNode(ctx.signedAtom());
			PowNode right = buildPowNode(ctx.pow());
			
			right.addChildren(left);
			
			return right;
		}
		return buildTerminalNode(ctx.signedAtom());
	}
	
	public PowNode buildPowNode(WRBParser.PowContext ctx) {
		AstNode node = buildFactor(ctx.factor());
		ArrayList<AstNode> child = new ArrayList<>();
		child.add(node);
		return new PowNode(child, node.getParams());
	}
	
	public AstNode buildTerminalNode(WRBParser.SignedAtomContext ctx) {
		if(ctx.SUB() != null) {
			AstNode node = buildTerminalNode(ctx.atom());
			ArrayList<AstNode> child = new ArrayList<>();
			child.add(node);
			return new SubNode(child, node.getParams());
		} else
			return buildTerminalNode(ctx.atom());
		
	}
	
	public AstNode buildTerminalNode(WRBParser.AtomContext ctx) {
		if(ctx.function() != null) {
			//Adding user Function Nodes
			if(ctx.function().evalUserFunc() != null) {
				return new FuncNode(ob.getFuncMemory().get(ctx.function().evalUserFunc().ID().getText()));
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
			if(ob.getVarMemory().containsKey(ctx.ID().getText())) {
				return new TerminalNode(ob.getVarMemory().get(ctx.ID().getText()));
			}
			ArrayList<String> param = new ArrayList<>();
			param.add(ctx.ID().getText());
			return new TerminalNode(param);
		} else {
			return new TerminalNode(Double.parseDouble(ctx.SCI_NO().getText()));
		}
	}
}
