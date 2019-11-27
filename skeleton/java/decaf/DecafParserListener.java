// Generated from /home/rarks/Desktop/c/Compiladort/skeleton/src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(DecafParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(DecafParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#block_decl}.
	 * @param ctx the parse tree
	 */
	void enterBlock_decl(DecafParser.Block_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#block_decl}.
	 * @param ctx the parse tree
	 */
	void exitBlock_decl(DecafParser.Block_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(DecafParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(DecafParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#array_decl}.
	 * @param ctx the parse tree
	 */
	void enterArray_decl(DecafParser.Array_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#array_decl}.
	 * @param ctx the parse tree
	 */
	void exitArray_decl(DecafParser.Array_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#type_id}.
	 * @param ctx the parse tree
	 */
	void enterType_id(DecafParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#type_id}.
	 * @param ctx the parse tree
	 */
	void exitType_id(DecafParser.Type_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DecafParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DecafParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#statement_decl}.
	 * @param ctx the parse tree
	 */
	void enterStatement_decl(DecafParser.Statement_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#statement_decl}.
	 * @param ctx the parse tree
	 */
	void exitStatement_decl(DecafParser.Statement_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(DecafParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(DecafParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(DecafParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(DecafParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(DecafParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(DecafParser.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#location_decl}.
	 * @param ctx the parse tree
	 */
	void enterLocation_decl(DecafParser.Location_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#location_decl}.
	 * @param ctx the parse tree
	 */
	void exitLocation_decl(DecafParser.Location_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#expr_decl}.
	 * @param ctx the parse tree
	 */
	void enterExpr_decl(DecafParser.Expr_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#expr_decl}.
	 * @param ctx the parse tree
	 */
	void exitExpr_decl(DecafParser.Expr_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#identifier_decl}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_decl(DecafParser.Identifier_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#identifier_decl}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_decl(DecafParser.Identifier_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(DecafParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(DecafParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(DecafParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(DecafParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(DecafParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(DecafParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(DecafParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(DecafParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(DecafParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(DecafParser.Cond_opContext ctx);
}