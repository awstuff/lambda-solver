// Generated from /Users/adrian/Programmieren/Java/lambda-solver/src/Lambda.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LambdaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LambdaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LambdaParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(LambdaParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LambdaParser#additionExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExp(LambdaParser.AdditionExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LambdaParser#multiplyExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExp(LambdaParser.MultiplyExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LambdaParser#atomExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExp(LambdaParser.AtomExpContext ctx);
}