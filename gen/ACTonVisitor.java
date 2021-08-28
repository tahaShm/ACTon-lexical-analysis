// Generated from C:/Users/Taha/Desktop/compiler_prg1/src\ACTon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ACTonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ACTonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ACTonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ACTonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#actor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActor(ACTonParser.ActorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#knownActor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownActor(ACTonParser.KnownActorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#actorVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorVars(ACTonParser.ActorVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#msgHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsgHandler(ACTonParser.MsgHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ACTonParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#actorDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorDec(ACTonParser.ActorDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(ACTonParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ACTonParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#printFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunc(ACTonParser.PrintFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ACTonParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#initialInp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialInp(ACTonParser.InitialInpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#functionInp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInp(ACTonParser.FunctionInpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#handlerContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerContent(ACTonParser.HandlerContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#argDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgDec(ACTonParser.ArgDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(ACTonParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(ACTonParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#varEval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarEval(ACTonParser.VarEvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#lValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLValue(ACTonParser.LValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ACTonParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#exp01}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp01(ACTonParser.Exp01Context ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#exp0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp0(ACTonParser.Exp0Context ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#exp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp1(ACTonParser.Exp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp2(ACTonParser.Exp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#exp3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp3(ACTonParser.Exp3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#exp4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp4(ACTonParser.Exp4Context ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#exp5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp5(ACTonParser.Exp5Context ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#exp6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp6(ACTonParser.Exp6Context ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#exp7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp7(ACTonParser.Exp7Context ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#exp8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp8(ACTonParser.Exp8Context ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#exp9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp9(ACTonParser.Exp9Context ctx);
	/**
	 * Visit a parse tree produced by {@link ACTonParser#idDotid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDotid(ACTonParser.IdDotidContext ctx);
}