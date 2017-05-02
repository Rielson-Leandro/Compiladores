// Generated from rlsl.g4 by ANTLR 4.4
package principal;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rlslParser}.
 */
public interface rlslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rlslParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull rlslParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlslParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull rlslParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlslParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull rlslParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlslParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull rlslParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlslParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull rlslParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlslParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull rlslParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlslParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull rlslParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlslParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull rlslParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlslParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull rlslParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlslParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull rlslParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlslParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull rlslParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlslParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull rlslParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlslParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull rlslParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlslParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull rlslParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rlslParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull rlslParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rlslParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull rlslParser.ClassDeclarationContext ctx);
}