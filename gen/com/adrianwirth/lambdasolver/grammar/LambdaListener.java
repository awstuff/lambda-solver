// Generated from /Users/adrian/Programmieren/Java/lambda-solver/src/Lambda.g4 by ANTLR 4.7
package com.adrianwirth.lambdasolver.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LambdaParser}.
 */
public interface LambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LambdaParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(LambdaParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(LambdaParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#lambdaTerm}.
	 * @param ctx the parse tree
	 */
	void enterLambdaTerm(LambdaParser.LambdaTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#lambdaTerm}.
	 * @param ctx the parse tree
	 */
	void exitLambdaTerm(LambdaParser.LambdaTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#abstraction}.
	 * @param ctx the parse tree
	 */
	void enterAbstraction(LambdaParser.AbstractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#abstraction}.
	 * @param ctx the parse tree
	 */
	void exitAbstraction(LambdaParser.AbstractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LambdaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LambdaParser.VariableContext ctx);
}