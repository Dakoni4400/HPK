// Generated from de/lab4inf/wrb/WRB.g4 by ANTLR 4.7
package de.lab4inf.wrb;

	import org.antlr.v4.runtime.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WRBParser}.
 */
public interface WRBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WRBParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(WRBParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(WRBParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(WRBParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(WRBParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#mathFunc}.
	 * @param ctx the parse tree
	 */
	void enterMathFunc(WRBParser.MathFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#mathFunc}.
	 * @param ctx the parse tree
	 */
	void exitMathFunc(WRBParser.MathFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(WRBParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(WRBParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(WRBParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(WRBParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#exprAdd}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(WRBParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#exprAdd}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(WRBParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#exprSub}.
	 * @param ctx the parse tree
	 */
	void enterExprSub(WRBParser.ExprSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#exprSub}.
	 * @param ctx the parse tree
	 */
	void exitExprSub(WRBParser.ExprSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(WRBParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(WRBParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#termMul}.
	 * @param ctx the parse tree
	 */
	void enterTermMul(WRBParser.TermMulContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#termMul}.
	 * @param ctx the parse tree
	 */
	void exitTermMul(WRBParser.TermMulContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#termDiv}.
	 * @param ctx the parse tree
	 */
	void enterTermDiv(WRBParser.TermDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#termDiv}.
	 * @param ctx the parse tree
	 */
	void exitTermDiv(WRBParser.TermDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(WRBParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(WRBParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(WRBParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(WRBParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(WRBParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(WRBParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(WRBParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(WRBParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#assignFunc}.
	 * @param ctx the parse tree
	 */
	void enterAssignFunc(WRBParser.AssignFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#assignFunc}.
	 * @param ctx the parse tree
	 */
	void exitAssignFunc(WRBParser.AssignFuncContext ctx);
}