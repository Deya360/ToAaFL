// Generated from C:/Users/Deya/Documents/Projects/TAAFL - Sem5/Practical6\Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(ExprParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ExprParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ExprParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#mprint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMprint(ExprParser.MprintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ExprParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#exprpri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprpri(ExprParser.ExprpriContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#exprnor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprnor(ExprParser.ExprnorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#idgrp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdgrp(ExprParser.IdgrpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#numbergrp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbergrp(ExprParser.NumbergrpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(ExprParser.OperContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp(ExprParser.CmpContext ctx);
}