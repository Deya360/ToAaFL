// Generated from C:/Users/Deya/Documents/Projects/TAAFL - Sem5/Practical6\Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(ExprParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(ExprParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ExprParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ExprParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ExprParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ExprParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#mprint}.
	 * @param ctx the parse tree
	 */
	void enterMprint(ExprParser.MprintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#mprint}.
	 * @param ctx the parse tree
	 */
	void exitMprint(ExprParser.MprintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#exprpri}.
	 * @param ctx the parse tree
	 */
	void enterExprpri(ExprParser.ExprpriContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#exprpri}.
	 * @param ctx the parse tree
	 */
	void exitExprpri(ExprParser.ExprpriContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#exprnor}.
	 * @param ctx the parse tree
	 */
	void enterExprnor(ExprParser.ExprnorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#exprnor}.
	 * @param ctx the parse tree
	 */
	void exitExprnor(ExprParser.ExprnorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#idgrp}.
	 * @param ctx the parse tree
	 */
	void enterIdgrp(ExprParser.IdgrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#idgrp}.
	 * @param ctx the parse tree
	 */
	void exitIdgrp(ExprParser.IdgrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numbergrp}.
	 * @param ctx the parse tree
	 */
	void enterNumbergrp(ExprParser.NumbergrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numbergrp}.
	 * @param ctx the parse tree
	 */
	void exitNumbergrp(ExprParser.NumbergrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOper(ExprParser.OperContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOper(ExprParser.OperContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterCmp(ExprParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitCmp(ExprParser.CmpContext ctx);
}