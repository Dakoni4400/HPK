package de.lab4inf.wrb;

import java.util.HashMap;

import de.lab4inf.wrb.ast.TreeBuilder;

public class WRBObserver extends WRBBaseVisitor<Double> {
	
	HashMap<String, WRBFunction> funcMemory = new HashMap<>();
	
	@Override
	public Double visitExpr(WRBParser.ExprContext ctx) {
		System.out.println("Visiting Expression");
		if(ctx.evalUserFunc() != null)
			return visit(ctx.evalUserFunc());
		else
			return Double.valueOf(ctx.v);
	}

	@Override
	public Double visitStatement(WRBParser.StatementContext ctx) {
		if(ctx.expr() != null)
			return visit(ctx.expr());
		if(ctx.assignVar() != null)
			return visit(ctx.assignVar());
		return visit(ctx.assignFunc());
	}
	
	@Override
	public Double visitAssignFunc(WRBParser.AssignFuncContext ctx) {
		System.out.println("Visiting AssignFunc");
		String id = ctx.i.getText();
		String p = ctx.p.getText();
		String[] params = p.split(",");
		
		funcMemory.put(id, new WRBFunction(TreeBuilder.buildTree(ctx.expr()), params));
		
		return Double.valueOf(1);
	}
	
	@Override
	public Double visitEvalUserFunc(WRBParser.EvalUserFuncContext ctx) {
		System.out.println("Visiting EvalUserFunc");
		String p = ctx.p.getText();
		String[] params = p.split(",");
		double[] args = new double[params.length];
		int i = 0;
		for(String param : params) {
			args[i] = Double.parseDouble(param);
			i++;
		}
		
		return funcMemory.get(ctx.i.getText()).eval(args);
	}
}
