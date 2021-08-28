// Generated from C:/Users/Taha/Desktop/compiler_prg1/src\ACTon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ACTonParser}.
 */
public interface ACTonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ACTonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ACTonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ACTonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#actor}.
	 * @param ctx the parse tree
	 */
	void enterActor(ACTonParser.ActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#actor}.
	 * @param ctx the parse tree
	 */
	void exitActor(ACTonParser.ActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#knownActor}.
	 * @param ctx the parse tree
	 */
	void enterKnownActor(ACTonParser.KnownActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#knownActor}.
	 * @param ctx the parse tree
	 */
	void exitKnownActor(ACTonParser.KnownActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#actorVars}.
	 * @param ctx the parse tree
	 */
	void enterActorVars(ACTonParser.ActorVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#actorVars}.
	 * @param ctx the parse tree
	 */
	void exitActorVars(ACTonParser.ActorVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#msgHandler}.
	 * @param ctx the parse tree
	 */
	void enterMsgHandler(ACTonParser.MsgHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#msgHandler}.
	 * @param ctx the parse tree
	 */
	void exitMsgHandler(ACTonParser.MsgHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ACTonParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ACTonParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#actorDec}.
	 * @param ctx the parse tree
	 */
	void enterActorDec(ACTonParser.ActorDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#actorDec}.
	 * @param ctx the parse tree
	 */
	void exitActorDec(ACTonParser.ActorDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(ACTonParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(ACTonParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ACTonParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ACTonParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunc(ACTonParser.PrintFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunc(ACTonParser.PrintFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ACTonParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ACTonParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#initialInp}.
	 * @param ctx the parse tree
	 */
	void enterInitialInp(ACTonParser.InitialInpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#initialInp}.
	 * @param ctx the parse tree
	 */
	void exitInitialInp(ACTonParser.InitialInpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#functionInp}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInp(ACTonParser.FunctionInpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#functionInp}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInp(ACTonParser.FunctionInpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#handlerContent}.
	 * @param ctx the parse tree
	 */
	void enterHandlerContent(ACTonParser.HandlerContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#handlerContent}.
	 * @param ctx the parse tree
	 */
	void exitHandlerContent(ACTonParser.HandlerContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#argDec}.
	 * @param ctx the parse tree
	 */
	void enterArgDec(ACTonParser.ArgDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#argDec}.
	 * @param ctx the parse tree
	 */
	void exitArgDec(ACTonParser.ArgDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(ACTonParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(ACTonParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(ACTonParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(ACTonParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#varEval}.
	 * @param ctx the parse tree
	 */
	void enterVarEval(ACTonParser.VarEvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#varEval}.
	 * @param ctx the parse tree
	 */
	void exitVarEval(ACTonParser.VarEvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#lValue}.
	 * @param ctx the parse tree
	 */
	void enterLValue(ACTonParser.LValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#lValue}.
	 * @param ctx the parse tree
	 */
	void exitLValue(ACTonParser.LValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ACTonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ACTonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#exp01}.
	 * @param ctx the parse tree
	 */
	void enterExp01(ACTonParser.Exp01Context ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#exp01}.
	 * @param ctx the parse tree
	 */
	void exitExp01(ACTonParser.Exp01Context ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#exp0}.
	 * @param ctx the parse tree
	 */
	void enterExp0(ACTonParser.Exp0Context ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#exp0}.
	 * @param ctx the parse tree
	 */
	void exitExp0(ACTonParser.Exp0Context ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(ACTonParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(ACTonParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(ACTonParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(ACTonParser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#exp3}.
	 * @param ctx the parse tree
	 */
	void enterExp3(ACTonParser.Exp3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#exp3}.
	 * @param ctx the parse tree
	 */
	void exitExp3(ACTonParser.Exp3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#exp4}.
	 * @param ctx the parse tree
	 */
	void enterExp4(ACTonParser.Exp4Context ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#exp4}.
	 * @param ctx the parse tree
	 */
	void exitExp4(ACTonParser.Exp4Context ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#exp5}.
	 * @param ctx the parse tree
	 */
	void enterExp5(ACTonParser.Exp5Context ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#exp5}.
	 * @param ctx the parse tree
	 */
	void exitExp5(ACTonParser.Exp5Context ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#exp6}.
	 * @param ctx the parse tree
	 */
	void enterExp6(ACTonParser.Exp6Context ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#exp6}.
	 * @param ctx the parse tree
	 */
	void exitExp6(ACTonParser.Exp6Context ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#exp7}.
	 * @param ctx the parse tree
	 */
	void enterExp7(ACTonParser.Exp7Context ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#exp7}.
	 * @param ctx the parse tree
	 */
	void exitExp7(ACTonParser.Exp7Context ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#exp8}.
	 * @param ctx the parse tree
	 */
	void enterExp8(ACTonParser.Exp8Context ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#exp8}.
	 * @param ctx the parse tree
	 */
	void exitExp8(ACTonParser.Exp8Context ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#exp9}.
	 * @param ctx the parse tree
	 */
	void enterExp9(ACTonParser.Exp9Context ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#exp9}.
	 * @param ctx the parse tree
	 */
	void exitExp9(ACTonParser.Exp9Context ctx);
	/**
	 * Enter a parse tree produced by {@link ACTonParser#idDotid}.
	 * @param ctx the parse tree
	 */
	void enterIdDotid(ACTonParser.IdDotidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACTonParser#idDotid}.
	 * @param ctx the parse tree
	 */
	void exitIdDotid(ACTonParser.IdDotidContext ctx);
}