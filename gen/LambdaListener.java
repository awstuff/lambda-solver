// Generated from /Users/adrian/Programmieren/Java/lambda-solver/src/Lambda.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LambdaParser}.
 */
public interface LambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LambdaParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(LambdaParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(LambdaParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(LambdaParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(LambdaParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(LambdaParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(LambdaParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(LambdaParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(LambdaParser.AtomExpContext ctx);
}