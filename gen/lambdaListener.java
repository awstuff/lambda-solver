// Generated from /Users/adrian/Programmieren/Java/lambda-solver/src/lambda.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lambdaParser}.
 */
public interface lambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lambdaParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(lambdaParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(lambdaParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(lambdaParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(lambdaParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(lambdaParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(lambdaParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(lambdaParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(lambdaParser.AtomExpContext ctx);
}