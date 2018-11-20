package de.lab4inf.wrb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import de.lab4inf.wrb.ast.TreeBuilder;
import de.lab4inf.wrb.matrix.Matrix;
import de.lab4inf.wrb.matrix.ParallelMultiplier;

public class WRBObserver extends WRBBaseVisitor<Double> {

	private final TreeBuilder builder = new TreeBuilder(this);
	
	HashMap<String, Double> varMemory = new HashMap<>();
	HashMap<String, WRBFunction> funcMemory = new HashMap<>();
	HashMap<String, Matrix> matMemory = new HashMap<>();
	
	/**
	 * Method which gets the HashMap for variables memory
	 * @param 
	 * @returns  HashMap<String, Double> varMemory
	 */
	public HashMap<String, Double> getVarMemory() {
		return varMemory;
	}

	/**
	 * Method which gets the HashMap for functions memory
	 * @param 
	 * @returns  HashMap<String, WRBFunction> funcMemory
	 */
	public HashMap<String, WRBFunction> getFuncMemory() {
		return funcMemory;
	}

	/**
	 * Method which visits the Statement Node in the parsed tree
	 * @param WRBParser.StatementContext ctx
	 * @returns 
	 */
	@Override
	public Double visitStatement(WRBParser.StatementContext ctx) {
		if(ctx.expr() != null)
			return visit(ctx.expr());
		if(ctx.assignVar() != null)
			return visit(ctx.assignVar());
		if(ctx.assignMatrix() != null)
			return visit(ctx.assignMatrix());
		if(ctx.matrixMult() != null)
			return visit(ctx.matrixMult());
		return visit(ctx.assignFunc());
	}
	
	/**
	 * Method which visits the Expr Node in the parsed tree
	 * @param WRBParser.ExprContext ctx
	 * @returns 
	 */
	@Override
	public Double visitExpr(WRBParser.ExprContext ctx) {
		/*if(ctx.evalUserFunc() != null)
			return visit(ctx.evalUserFunc());*/
		if(ctx.term() != null)
			return visit(ctx.term());
		else if (ctx.exprAdd() != null)
			return visit(ctx.expr()) + visit(ctx.exprAdd());
		return visit(ctx.expr()) - visit(ctx.exprSub());
	}
	
	/**
	 * Method which visits the ExprAdd Node in the parsed tree
	 * @param WRBParser.ExprAddContext ctx
	 * @returns 
	 */
	@Override
	public Double visitExprAdd(WRBParser.ExprAddContext ctx) {
		return visit(ctx.term());
	}
	
	/**
	 * Method which visits the ExprSub Node in the parsed tree
	 * @param WRBParser.ExprSubContext ctx
	 * @returns 
	 */
	@Override
	public Double visitExprSub(WRBParser.ExprSubContext ctx) {
		return visit(ctx.term());
	}
	
	
	/**
	 * Method which visits the Term Node in the parsed tree
	 * @param WRBParser.TermContext ctx
	 * @returns 
	 */
	@Override
	public Double visitTerm(WRBParser.TermContext ctx) {
		if(ctx.termMul() != null) 
			return visit(ctx.term()) * visit(ctx.termMul());
		else if(ctx.termDiv() != null)
			return visit(ctx.term()) / visit(ctx.termDiv());
		return visit(ctx.factor());
	}
	
	/**
	 * Method which visits the TermMul Node in the parsed tree
	 * @param WRBParser.TermMulContext ctx
	 * @returns 
	 */
	@Override
	public Double visitTermMul(WRBParser.TermMulContext ctx) {
		return visit(ctx.factor());
	}
	
	/**
	 * Method which visits the TermDiv Node in the parsed tree
	 * @param WRBParser.TermDivContext ctx
	 * @returns 
	 */
	@Override
	public Double visitTermDiv(WRBParser.TermDivContext ctx) {
		return visit(ctx.factor());
	}
	
	/**
	 * Method which visits the Factor Node in the parsed tree
	 * @param WRBParser.FactorContext ctx
	 * @returns 
	 */
	@Override
	public Double visitFactor(WRBParser.FactorContext ctx) {
		if(ctx.pow() != null)
			return Math.pow(visit(ctx.signedAtom()), visit(ctx.pow()));
		return visit(ctx.signedAtom());
	}
	
	/**
	 * Method which visits the Pow Node in the parsed tree
	 * @param WRBParser.PowContext ctx
	 * @returns 
	 */
	@Override
	public Double visitPow(WRBParser.PowContext ctx) {
		return visit(ctx.factor());
	}
	
	/**
	 * Method which visits the SignedAtom Node in the parsed tree
	 * @param WRBParser.SignedAtomContext ctx
	 * @returns 
	 */
	@Override
	public Double visitSignedAtom(WRBParser.SignedAtomContext ctx) {
		if(ctx.SUB() != null)
			return -1. * visit(ctx.atom());
		return visit(ctx.atom());
	}
	
	/**
	 * Method which visits the Atom Node in the parsed tree
	 * @param WRBParser.AtomContext ctx
	 * @returns 
	 */
	@Override
	public Double visitAtom(WRBParser.AtomContext ctx) {
		if(ctx.expr() != null)
			return visit(ctx.expr());
		else if(ctx.function() != null) 
			return visit(ctx.function());
		else if(ctx.SCI_NO() != null)
			return Double.parseDouble(ctx.SCI_NO().getText());
		return varMemory.get(ctx.ID().getText());
	}
	
	/**
	 * Method which visits the ExprAdd Node in the parsed tree
	 * @param WRBParser.ExprAddContext ctx
	 * @returns 
	 */
	@Override
	public Double visitFunction(WRBParser.FunctionContext ctx) {
		if(ctx.mathFunction() != null)
			return visit(ctx.mathFunction());
		return visit(ctx.evalUserFunc());
	}
	
	/**
	 * Method which visits the MathFunction Node in the parsed tree
	 * @param WRBParser.MathFunctionContext ctx
	 * @returns 
	 */
	@Override
	public Double visitMathFunction(WRBParser.MathFunctionContext ctx) {
		if(ctx.ABS() != null)
			return Math.abs(visit(ctx.e));
		else if(ctx.ACOS() != null)
			return Math.acos(visit(ctx.e));
		else if(ctx.ASIN() != null)
			return Math.asin(visit(ctx.e));
		else if(ctx.ATAN() != null)
			return Math.atan(visit(ctx.e));
		else if(ctx.CBRT() != null)
			return Math.cbrt(visit(ctx.e));
		else if(ctx.CEIL() != null)
			return Math.ceil(visit(ctx.e));
		else if(ctx.COS() != null)
			return Math.cos(visit(ctx.e));
		else if(ctx.COSH() != null)
			return Math.cosh(visit(ctx.e));
		else if(ctx.EXP() != null)
			return Math.exp(visit(ctx.e));
		else if(ctx.EXPM1() != null)
			return Math.expm1(visit(ctx.e));
		else if(ctx.FLOOR() != null)
			return Math.floor(visit(ctx.e));
		else if(ctx.LN() != null || ctx.LOGE() != null)
			return Math.log(visit(ctx.e));
		else if(ctx.LOG() != null ||  ctx.LOG10() != null)
			return Math.log10(visit(ctx.e));
		else if(ctx.LOG2() != null || ctx.LD() != null || ctx.LB() != null)
			return Math.log(visit(ctx.e))/Math.log(2);
		else if(ctx.max() != null)
			return visit(ctx.max());
		else if(ctx.min() != null)
			return visit(ctx.min());
		else if(ctx.POWFUNC() != null)
			return Math.pow(visit(ctx.e1), visit(ctx.e2));
		else if(ctx.RINT() != null)
			return Math.rint(visit(ctx.e));
		else if(ctx.SIGNUM() != null)
			return Math.signum(visit(ctx.e));
		else if(ctx.SIN() != null)
			return Math.sin(visit(ctx.e));
		else if(ctx.SINH() != null)
			return Math.sinh(visit(ctx.e));
		else if(ctx.SQRT() != null)
			return Math.sqrt(visit(ctx.e));
		else if(ctx.TAN() != null)
			return Math.tan(visit(ctx.e));
		return Math.tanh(visit(ctx.e));
	}
	
	/**
	 * Method which visits the Max Node in the parsed tree
	 * @param WRBParser.MaxContext ctx
	 * @returns 
	 */
	@Override
	public Double visitMax(WRBParser.MaxContext ctx) {
		if(ctx.e4 == null) {
			if(ctx.e3 == null)
				return Math.max(visit(ctx.e1), visit(ctx.e2));
			else
				return Math.max(visit(ctx.e1), Math.max(visit(ctx.e2), visit(ctx.e3)));
		} else
			return Math.max(Math.max(visit(ctx.e1), visit(ctx.e2)), Math.max(visit(ctx.e3), visit(ctx.e4)));
	}
	
	/**
	 * Method which visits the Min Node in the parsed tree
	 * @param WRBParser.MinContext ctx
	 * @returns 
	 */
	@Override
	public Double visitMin(WRBParser.MinContext ctx) {
		if(ctx.e4 == null) {
			if(ctx.e3 == null)
				return Math.min(visit(ctx.e1), visit(ctx.e2));
			else
				return Math.min(visit(ctx.e1), Math.min(visit(ctx.e2), visit(ctx.e3)));
		} else
			return Math.min(Math.min(visit(ctx.e1), visit(ctx.e2)), Math.min(visit(ctx.e3), visit(ctx.e4)));
	}
	
	/**
	 * Method which visits the AssignFunc Node in the parsed tree
	 * @param WRBParser.AssignFuncContext ctx
	 * @returns 
	 */
	@Override
	public Double visitAssignFunc(WRBParser.AssignFuncContext ctx) {
		String id = ctx.i.getText();
		String p = ctx.p.getText();
		String[] params = p.split(",");
		
		HashMap<String, Double> varMemoryTemp = new HashMap<>();
		
		for(String param : params) {
			if(varMemory.containsKey(param)) {
				varMemoryTemp.put(param, varMemory.get(param));
				varMemory.remove(param);
			}
				
		}
		
		funcMemory.put(id, new WRBFunction(builder.buildTree(ctx.expr()), params));
		
		varMemory.putAll(varMemoryTemp);
		
		return Double.valueOf(1);
	}
	
	/**
	 * Method which visits the EvalUserFunc Node in the parsed tree
	 * @param WRBParser.EvalUserFuncContext ctx
	 * @returns 
	 */
	@Override
	public Double visitEvalUserFunc(WRBParser.EvalUserFuncContext ctx) {
			List<WRBParser.ExprContext> exp = ctx.p.expr();
			double[] params = new double[exp.size()];
			int i = 0;
			for(WRBParser.ExprContext c : exp) {
				params[i] = visit(c);
				i++;
			}
			return funcMemory.get(ctx.i.getText()).eval(params);		
	}
	
	/**
	 * Method which visits the AssignVar Node in the parsed tree
	 * @param WRBParser.AssignVarContext ctx
	 * @returns 
	 */
	@Override
	public Double visitAssignVar(WRBParser.AssignVarContext ctx) {
		if(ctx.expr() != null) {
			Double var = visit(ctx.expr());
			varMemory.put(ctx.i.getText(), var);
			return var;
		} else {
			Double var = varMemory.get(ctx.j.getText());
			varMemory.put(ctx.i.getText(), var);
			return var;
		}
	}
	
	@Override
	public Double visitMatrixMult(WRBParser.MatrixMultContext ctx) {
		Matrix A; 
		Matrix B;
		
		for(WRBParser.VectorContext v : ctx.a.vector()) {
			if(! (v.SCI_NO().size() == ctx.a.vector(0).SCI_NO().size()))
				throw new IllegalArgumentException("Zeilen der Matrix A müssen die gleiche Anzahl an Elementen enthalten!");
		}
		
		for(WRBParser.VectorContext v : ctx.b.vector()) {
			if(! (v.SCI_NO().size() == ctx.b.vector(0).SCI_NO().size()))
				throw new IllegalArgumentException("Zeilen der Matrix B müssen die gleiche Anzahl an Elementen enthalten!");
		}
		
		double[][] a = new double[ctx.a.vector().size()][ctx.a.vector(0).SCI_NO().size()];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				a[i][j] = Double.parseDouble(ctx.a.vector(i).SCI_NO(j).getText());
			}
		}
		
		double[][] b = new double[ctx.b.vector().size()][ctx.b.vector(0).SCI_NO().size()];
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				b[i][j] = Double.parseDouble(ctx.b.vector(i).SCI_NO(j).getText());
			}
		}
		
		A = new Matrix(a);
		B = new Matrix(b);
		
		Matrix res = ParallelMultiplier.multiply(A, B);
		
		System.out.println(res.toString());
		
		
		return 1.0;
	}
	
	@Override
	public Double visitAssignMatrix(WRBParser.AssignMatrixContext ctx) throws IllegalArgumentException{
		String id = ctx.i.getText();
		for(WRBParser.VectorContext v : ctx.m.vector()) {
			if(! (v.SCI_NO().size() == ctx.m.vector(0).SCI_NO().size()))
				throw new IllegalArgumentException("Zeilen der Matrix müssen die gleiche Anzahl an Elementen enthalten!");
		}
			
		double[][] m = new double[ctx.m.vector().size()][ctx.m.vector(0).SCI_NO().size()];
					
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				m[i][j] = Double.parseDouble(ctx.m.vector(i).SCI_NO(j).getText());
			}
		}
		
		Matrix M = new Matrix(m);
		
		System.out.println("Saved " + id + ":\n" + M.toString());
		
		matMemory.put(id, M);
		
		return 1.0;
	}
}
